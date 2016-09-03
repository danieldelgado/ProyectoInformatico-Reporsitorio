package com.hitss.rev.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitss.layer.model.FasePostulacion;
import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.service.FasePostulacionLocalServiceUtil;
import com.hitss.layer.service.PostulacionLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.hitss.rev.bean.ParametroBean;
import com.hitss.rev.bean.SolicitudPostulacionBean;
import com.hitss.rev.liferay.api.LiferayApiService;
import com.hitss.rev.service.ParametroService;
import com.hitss.rev.service.RegistrarResultadoPostulanteService;
import com.hitss.rev.service.SolicitudRequerimientoRequisitoService;
import com.hitss.rev.util.Constantes;
import com.hitss.rev.util.RevServiceImpl;
import com.hitss.rev.util.Util;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

@Service("RegistrarResultadoPostulanteService")
public class RegistrarResultadoPostulanteServiceImpl extends RevServiceImpl implements RegistrarResultadoPostulanteService {

	private static Log _log = LogFactoryUtil.getLog(RegistrarResultadoPostulanteServiceImpl.class);

	@Autowired
	private ParametroService parametroService;

	@Autowired
	private LiferayApiService liferayContentService;

	@Autowired
	private SolicitudRequerimientoRequisitoService solicitudRequerimientoRequisitoService;

	@Override
	public Map<String, Object> listarSolicitudesRequermientoPostulacion(Long puestoId, Date fechaRegistroInicio, Date fechaRegistrFin, int responsable, int tiempoContrato,
			int filas, int pagina, String orden, String campoOrden) {

		Map<String, Object> result = new HashMap<String, Object>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<SolicitudPostulacionBean> lista = null;
		SolicitudRequerimiento solicitudRequerimiento = SolicitudRequerimientoLocalServiceUtil.newInstance();
		solicitudRequerimiento.setCategoriaPuestoId(puestoId);
		solicitudRequerimiento.setResponsableRRHH(responsable);
		solicitudRequerimiento.setTiempoContrato(tiempoContrato);
		int total = 0;
		int records = 0;
		Long count = null;
		try {
			count = PostulacionLocalServiceUtil.listaSolicitudRequerimientoByPostulacionCount(solicitudRequerimiento, fechaRegistroInicio, fechaRegistrFin);
			if (count != null && count > 0) {
				int c = count.intValue();
				if (c > 0) {
					total = (c / filas);
				}
				int init = (filas * pagina - filas);
				int fin = init + filas;
				_log.debug("records :" + records + " init:" + init + " fin:" + fin);
				List<Postulacion> listaSolicitudRequerimientos = PostulacionLocalServiceUtil.listaSolicitudRequerimientoByPostulacion(solicitudRequerimiento, fechaRegistroInicio, fechaRegistrFin, init, fin, orden, campoOrden);
				
				lista = new ArrayList<SolicitudPostulacionBean>();
				SolicitudPostulacionBean solicitudPostulacionBean = null;
				ParametroBean p = null;

				List<Postulacion> postulacions = null;
				FasePostulacion fase = null;
				User u = null;

				long faspostulacionIdCumplida = 0;
				long diferenciasTiempo = 0;
				SolicitudRequerimiento sr = null ;
				
				for (Postulacion postulacion : listaSolicitudRequerimientos) {

					sr = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(postulacion.getSolicitudRequerimientoId());

					solicitudPostulacionBean = new SolicitudPostulacionBean();
					solicitudPostulacionBean.setSolicitudId(sr.getSolicitudRequerimientoId());
					u = UserLocalServiceUtil.getUser(postulacion.getUsuarioId());
					solicitudPostulacionBean.setUserId(postulacion.getUsuarioId());
					solicitudPostulacionBean.setPostulante(u.getFullName());
					solicitudPostulacionBean.setStrpuesto(liferayContentService.getCategoria(sr.getCategoriaPuestoId()).getValue());

					if (Validator.isNotNull(u.getExpandoBridge())) {
						Boolean colaborador = (Boolean) u.getExpandoBridge().getAttribute("Colaborador");
						if (Validator.isNotNull(colaborador)) {
							solicitudPostulacionBean.setStrTipoPostulante(colaborador ? "Si" : "No");
						}
						Date disponibildad = (Date) u.getExpandoBridge().getAttribute("Disponibilidad");
						if (Validator.isNotNull(disponibildad)) {
							solicitudPostulacionBean.setDisponibilidad(Util.getStrFecha(disponibildad));
						}
						solicitudPostulacionBean.setStrfechaPostulacion(sdf.format(postulacion.getFechaPostulacion()));
					}

					fase = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
							Constantes.PARAMETRO_FASE_PSICOLOGICA);
					if (Validator.isNotNull(fase)) {
						solicitudPostulacionBean.setStrfechaPsicologica(sdf.format(fase.getFechaFase()));

						diferenciasTiempo = fase.getFechamodifica().getTime() - fase.getFechacrea().getTime();

						if (diferenciasTiempo > 0) {
							faspostulacionIdCumplida = fase.getTipoFase();
						}
					}

					fase = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(), Constantes.PARAMETRO_FASE_TECNICA);
					if (Validator.isNotNull(fase)) {
						solicitudPostulacionBean.setStrfechaTecnica(sdf.format(fase.getFechaFase()));
						diferenciasTiempo = fase.getFechamodifica().getTime() - fase.getFechacrea().getTime();

						if (diferenciasTiempo > 0) {
							faspostulacionIdCumplida = fase.getTipoFase();
						}
					}

					fase = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
							Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR);
					if (Validator.isNotNull(fase)) {
						solicitudPostulacionBean.setStrfechaRRHH(sdf.format(fase.getFechaFase()));
						diferenciasTiempo = fase.getFechamodifica().getTime() - fase.getFechacrea().getTime();

						if (diferenciasTiempo > 0) {
							faspostulacionIdCumplida = fase.getTipoFase();
						}
					}

					fase = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
							Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA);
					if (Validator.isNotNull(fase)) {
						solicitudPostulacionBean.setStrfechaGerenteArea(sdf.format(fase.getFechaFase()));
						diferenciasTiempo = fase.getFechamodifica().getTime() - fase.getFechacrea().getTime();

						if (diferenciasTiempo > 0) {
							faspostulacionIdCumplida = fase.getTipoFase();
						}
					}
					if (faspostulacionIdCumplida > 0) {
						solicitudPostulacionBean.setStrFasePostulacion(parametroService.getParametro(faspostulacionIdCumplida).getValor());
					} else {
						solicitudPostulacionBean.setStrFasePostulacion("Sin registros");
					}

					lista.add(solicitudPostulacionBean);

				}
					
			}

		} catch (SystemException | PortalException e) {
			_log.error("Error al listarSolicitudesRequermiento " + e.getMessage(), e);
		}
		result.put("pagina", pagina);
		result.put("total", total);
		if (lista != null) {
			records = lista.size();
		}
		result.put("count", count);
		result.put("records", records);
		result.put("lista", lista);
		return result;
	}

}

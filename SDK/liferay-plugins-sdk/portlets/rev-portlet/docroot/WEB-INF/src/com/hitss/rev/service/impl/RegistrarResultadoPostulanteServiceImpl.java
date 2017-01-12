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
import com.hitss.layer.service.persistence.PostulacionPK;
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
import com.liferay.portal.kernel.util.StringPool;
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
	public Map<String, Object> listarSolicitudesRequermientoPostulacion(Long puestoId, Date fechaRegistroInicio, Date fechaRegistrFin, int responsable, int tiempoContrato, int filas, int pagina, String orden, String campoOrden) {

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
				FasePostulacion fase = null;
				User u = null;
				long faspostulacionIdCumplida = 0;
				long diferenciasTiempo = 0;
				SolicitudRequerimiento sr = null;
				
				for (Postulacion postulacion : listaSolicitudRequerimientos) {
					sr = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(postulacion.getSolicitudRequerimientoId());
					fase = null;
					solicitudPostulacionBean = new SolicitudPostulacionBean();
					solicitudPostulacionBean.setEstadoSolicitud(sr.getEstado());					
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
					}
					solicitudPostulacionBean.setStrfechaPostulacion(sdf.format(postulacion.getFechaPostulacion()));
					long estado_parametro_id = Constantes.PARAMETRO_FASE_PSICOLOGICA;
					FasePostulacion fp = null;
					fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(), Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA);
					if (Validator.isNotNull(fp)) {
						solicitudPostulacionBean.setStrfechaGerenteArea(Util.getStrFecha(fp.getFechaFase()));
						diferenciasTiempo = fp.getFechamodifica().getTime() - fp.getFechacrea().getTime();
						if (fp.isAsistio()) {

							estado_parametro_id = Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA;
							fase = fp;
						}
					}
					fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(), Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR);
					if (Validator.isNotNull(fp)) {
						solicitudPostulacionBean.setStrfechaRRHH(Util.getStrFecha(fp.getFechaFase()));
						diferenciasTiempo = fp.getFechamodifica().getTime() - fp.getFechacrea().getTime();
						if (fp.isAsistio()) {
							estado_parametro_id = Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR;
							fase = fp;
						}
					}
					fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(), Constantes.PARAMETRO_FASE_TECNICA);
					if (Validator.isNotNull(fp)) {
						solicitudPostulacionBean.setStrfechaTecnica(Util.getStrFecha(fp.getFechaFase()));
						diferenciasTiempo = fp.getFechamodifica().getTime() - fp.getFechacrea().getTime();
						if (fp.isAsistio()) {
							estado_parametro_id = Constantes.PARAMETRO_FASE_TECNICA;
							fase = fp;
						}
					}
					if (Validator.isNull(fase)) {
						fase = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(), Constantes.PARAMETRO_FASE_PSICOLOGICA);
						if (Validator.isNotNull(fase)) {
							diferenciasTiempo = fase.getFechamodifica().getTime() - fase.getFechacrea().getTime();
							solicitudPostulacionBean.setStrfechaPsicologica(Util.getStrFecha(fase.getFechaFase()));
						}
					}
					if (Validator.isNotNull(fase)) {
						faspostulacionIdCumplida = fase.getTipoFase();						
						solicitudPostulacionBean.setStrFasePostulacion(parametroService.getParametro(estado_parametro_id).getValor());
					} else {
						faspostulacionIdCumplida = Constantes.PARAMETRO_ESTADO_POSTULADO;
						solicitudPostulacionBean.setStrFasePostulacion(parametroService.getParametro(Constantes.PARAMETRO_ESTADO_POSTULADO).getValor());					
					}				
					if (faspostulacionIdCumplida > 0) {
						solicitudPostulacionBean.setStrEstado(StringPool.BLANK);
						if(Validator.isNotNull(fase)){
							solicitudPostulacionBean.setEstado(fase.getEstado());
							solicitudPostulacionBean.setStrEstado(parametroService.getParametro(fase.getEstado()).getValor());						
						}							
					} else {
						solicitudPostulacionBean.setStrEstado(StringPool.BLANK);

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

	@Override
	public SolicitudPostulacionBean getSolicitudPostulacion(Long solicitudId, Long userId) {
		SolicitudPostulacionBean solicitudPostulacionBean = new SolicitudPostulacionBean();		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			PostulacionPK postulacionPK = new PostulacionPK(solicitudId, userId);
			
			Postulacion postulacion = PostulacionLocalServiceUtil.getPostulacion(postulacionPK );
			SolicitudRequerimiento sr = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(postulacion.getSolicitudRequerimientoId());
			FasePostulacion fase  = null;			
			solicitudPostulacionBean.setEstadoSolicitud(sr.getEstado());					
			solicitudPostulacionBean.setSolicitudId(sr.getSolicitudRequerimientoId());
			
			User u = UserLocalServiceUtil.getUser(userId);
			solicitudPostulacionBean.setUserId(postulacion.getUsuarioId());
			solicitudPostulacionBean.setPostulante(u.getFullName());
			solicitudPostulacionBean.setStrpuesto(liferayContentService.getCategoria(sr.getCategoriaPuestoId()).getValue());
			
			long diferenciasTiempo = 0;
			long faspostulacionIdCumplida = 0;
			
			if (Validator.isNotNull(u.getExpandoBridge())) {
				Boolean colaborador = (Boolean) u.getExpandoBridge().getAttribute("Colaborador");
				if (Validator.isNotNull(colaborador)) {
					solicitudPostulacionBean.setStrTipoPostulante(colaborador ? "Si" : "No");
				}
				Date disponibildad = (Date) u.getExpandoBridge().getAttribute("Disponibilidad");
				if (Validator.isNotNull(disponibildad)) {
					solicitudPostulacionBean.setDisponibilidad(Util.getStrFecha(disponibildad));
				}
			}
			solicitudPostulacionBean.setStrfechaPostulacion(sdf.format(postulacion.getFechaPostulacion()));
			long estado_parametro_id = Constantes.PARAMETRO_FASE_PSICOLOGICA;
			FasePostulacion fp = null;
			fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(), Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA);
			if (Validator.isNotNull(fp)) {
				solicitudPostulacionBean.setStrfechaGerenteArea(Util.getStrFecha(fp.getFechaFase()));
				diferenciasTiempo = fp.getFechamodifica().getTime() - fp.getFechacrea().getTime();
				if (fp.isAsistio()) {

					estado_parametro_id = Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA;
					fase = fp;
				}
			}
			fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(), Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR);
			if (Validator.isNotNull(fp)) {
				solicitudPostulacionBean.setStrfechaRRHH(Util.getStrFecha(fp.getFechaFase()));
				diferenciasTiempo = fp.getFechamodifica().getTime() - fp.getFechacrea().getTime();
				if (fp.isAsistio()) {
					estado_parametro_id = Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR;
					fase = fp;
				}
			}
			fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(), Constantes.PARAMETRO_FASE_TECNICA);
			if (Validator.isNotNull(fp)) {
				solicitudPostulacionBean.setStrfechaTecnica(Util.getStrFecha(fp.getFechaFase()));
				diferenciasTiempo = fp.getFechamodifica().getTime() - fp.getFechacrea().getTime();
				if (fp.isAsistio()) {
					estado_parametro_id = Constantes.PARAMETRO_FASE_TECNICA;
					fase = fp;
				}
			}
			if (Validator.isNull(fase)) {
				fase = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(), Constantes.PARAMETRO_FASE_PSICOLOGICA);
				if (Validator.isNotNull(fase)) {
					diferenciasTiempo = fase.getFechamodifica().getTime() - fase.getFechacrea().getTime();
					solicitudPostulacionBean.setStrfechaPsicologica(Util.getStrFecha(fase.getFechaFase()));
				}
			}
			if (Validator.isNotNull(fase)) {
				faspostulacionIdCumplida = fase.getTipoFase();						
				solicitudPostulacionBean.setStrFasePostulacion(parametroService.getParametro(estado_parametro_id).getValor());
			} else {
				faspostulacionIdCumplida = Constantes.PARAMETRO_ESTADO_POSTULADO;
				solicitudPostulacionBean.setStrFasePostulacion(parametroService.getParametro(Constantes.PARAMETRO_ESTADO_POSTULADO).getValor());					
			}				
			if (faspostulacionIdCumplida > 0) {
				solicitudPostulacionBean.setStrEstado(StringPool.BLANK);
				if(Validator.isNotNull(fase)){
					solicitudPostulacionBean.setEstado(fase.getEstado());
					solicitudPostulacionBean.setStrEstado(parametroService.getParametro(fase.getEstado()).getValor());						
				}							
			} else {
				solicitudPostulacionBean.setStrEstado(StringPool.BLANK);

			}
		} catch (PortalException | SystemException e) {
			_log.error("Error al getSolicitudPostulacion " + e.getMessage(), e);
		}
		return solicitudPostulacionBean;
	}

}

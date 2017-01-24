package com.hitss.rev.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitss.layer.model.Evaluacion;
import com.hitss.layer.model.FasePostulacion;
import com.hitss.layer.model.FasePostulacionPuestoEvaluacion;
import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.PuestoEvaluacion;
import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.model.impl.FasePostulacionImpl;
import com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionImpl;
import com.hitss.layer.service.EvaluacionLocalServiceUtil;
import com.hitss.layer.service.FasePostulacionLocalServiceUtil;
import com.hitss.layer.service.FasePostulacionPuestoEvaluacionLocalServiceUtil;
import com.hitss.layer.service.PostulacionLocalServiceUtil;
import com.hitss.layer.service.PuestoEvaluacionLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK;
import com.hitss.layer.service.persistence.PostulacionPK;
import com.hitss.rev.bean.EvaluacionBean;
import com.hitss.rev.bean.FasePostulacionBean;
import com.hitss.rev.bean.FasePostulacionPuestoEvaluacionBean;
import com.hitss.rev.bean.PuestoEvaluacionBean;
import com.hitss.rev.bean.SolicitudPostulacionBean;
import com.hitss.rev.liferay.api.LiferayApiService;
import com.hitss.rev.service.ParametroService;
import com.hitss.rev.service.RegistrarResultadoPostulanteService;
import com.hitss.rev.service.SolicitudRequerimientoRequisitoService;
import com.hitss.rev.util.Constantes;
import com.hitss.rev.util.PropiedadMensaje;
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
import com.liferay.util.portlet.PortletProps;

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
				List<Postulacion> listaSolicitudRequerimientos = PostulacionLocalServiceUtil.listaSolicitudRequerimientoByPostulacion(solicitudRequerimiento, fechaRegistroInicio,
						fechaRegistrFin, init, fin, orden, campoOrden);
				lista = new ArrayList<SolicitudPostulacionBean>();
				SolicitudPostulacionBean solicitudPostulacionBean = null;
				FasePostulacion fase = null;
				User u = null;
				long faspostulacionIdCumplida = 0;
				long diferenciasTiempo = 0;
				SolicitudRequerimiento sr = null;
				FasePostulacion fp = null;
				Boolean colaborador = null;
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
						colaborador = (Boolean) u.getExpandoBridge().getAttribute("Colaborador");
						if (Validator.isNotNull(colaborador)) {
							solicitudPostulacionBean.setStrTipoPostulante(colaborador ? "Si" : "No");
						}
						Date disponibildad = (Date) u.getExpandoBridge().getAttribute("Disponibilidad");
						if (Validator.isNotNull(disponibildad)) {
							solicitudPostulacionBean.setDisponibilidad(Util.getStrFecha(disponibildad));
						}
					}
					solicitudPostulacionBean.setStrfechaPostulacion(sdf.format(postulacion.getFechaPostulacion()));
					long estado_parametro_id = colaborador ? Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR : Constantes.PARAMETRO_FASE_PSICOLOGICA;

					// if (!colaborador) {
					fase = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
							Constantes.PARAMETRO_FASE_PSICOLOGICA);
					if (Validator.isNotNull(fase)) {
						diferenciasTiempo = fase.getFechamodifica().getTime() - fase.getFechacrea().getTime();
						solicitudPostulacionBean.setStrfechaPsicologica(Util.getStrFecha(fase.getFechaFase()));
						if (fase.isAsistio()) {
							estado_parametro_id = Constantes.PARAMETRO_FASE_PSICOLOGICA;

						}
					}
					fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(), Constantes.PARAMETRO_FASE_TECNICA);
					if (Validator.isNotNull(fp)) {
						solicitudPostulacionBean.setStrfechaTecnica(Util.getStrFecha(fp.getFechaFase()));
						diferenciasTiempo = fp.getFechamodifica().getTime() - fp.getFechacrea().getTime();
						if (fp.isAsistio()) {
							estado_parametro_id = Constantes.PARAMETRO_FASE_TECNICA;
						}
						fase = fp;
					}
					// }

					fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
							Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR);
					if (Validator.isNotNull(fp)) {
						solicitudPostulacionBean.setStrfechaRRHH(Util.getStrFecha(fp.getFechaFase()));
						diferenciasTiempo = fp.getFechamodifica().getTime() - fp.getFechacrea().getTime();
						if (fp.isAsistio()) {
							estado_parametro_id = Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR;
						}
						fase = fp;
					}

					fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
							Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA);
					if (Validator.isNotNull(fp)) {
						solicitudPostulacionBean.setStrfechaGerenteArea(Util.getStrFecha(fp.getFechaFase()));
						diferenciasTiempo = fp.getFechamodifica().getTime() - fp.getFechacrea().getTime();
						if (fp.isAsistio()) {
							estado_parametro_id = Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA;
						}
						fase = fp;
					}

					if (Validator.isNotNull(fase)) {
						faspostulacionIdCumplida = fase.getTipoFase();
						solicitudPostulacionBean.setStrFasePostulacion(parametroService.getParametro(estado_parametro_id).getValor());
					} else {
						faspostulacionIdCumplida = Constantes.PARAMETRO_ESTADO_POSTULADO;
						solicitudPostulacionBean.setStrFasePostulacion(parametroService.getParametro(Constantes.PARAMETRO_ESTADO_POSTULADO).getValor());
					}
					fp = null;
					if (faspostulacionIdCumplida > 0) {
						solicitudPostulacionBean.setStrEstado(StringPool.BLANK);
						if (Validator.isNotNull(fase)) {
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

			Postulacion postulacion = PostulacionLocalServiceUtil.getPostulacion(postulacionPK);
			SolicitudRequerimiento sr = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(postulacion.getSolicitudRequerimientoId());
			FasePostulacion fase = null;
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
			fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
					Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA);
			if (Validator.isNotNull(fp)) {
				solicitudPostulacionBean.setStrfechaGerenteArea(Util.getStrFecha(fp.getFechaFase()));
				diferenciasTiempo = fp.getFechamodifica().getTime() - fp.getFechacrea().getTime();
				if (fp.isAsistio()) {
					estado_parametro_id = Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA;
				}
				fase = fp;
				if (Validator.isNotNull(fp)) {
					FasePostulacionBean fp1 = new FasePostulacionBean();
					fp1.setFasepostulacionId(fp.getFasePostulacionId());
					fp1.setAsistio(fp.getAsistio());
					fp1.setSolicitudRequerimientoId(fp.getSolicitudRequerimientoId());
					fp1.setApruebaFase(fp.getApruebaFase());
					fp1.setTipoFase(fp.getTipoFase());
					fp1.setEstado(fp.getEstado());
					solicitudPostulacionBean.setFasePostulacionEntrevistaGerenteArea(fp1);
				}
			}
			fp = FasePostulacionLocalServiceUtil
					.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(), Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR);
			if (Validator.isNotNull(fp)) {
				solicitudPostulacionBean.setStrfechaRRHH(Util.getStrFecha(fp.getFechaFase()));
				diferenciasTiempo = fp.getFechamodifica().getTime() - fp.getFechacrea().getTime();
				if (fp.isAsistio()) {
					estado_parametro_id = Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR;
				}
				fase = fp;
				if (Validator.isNotNull(fp)) {
					FasePostulacionBean fp1 = new FasePostulacionBean();
					fp1.setFasepostulacionId(fp.getFasePostulacionId());
					fp1.setAsistio(fp.getAsistio());
					fp1.setSolicitudRequerimientoId(fp.getSolicitudRequerimientoId());
					fp1.setApruebaFase(fp.getApruebaFase());
					fp1.setTipoFase(fp.getTipoFase());
					fp1.setEstado(fp.getEstado());
					solicitudPostulacionBean.setFasePostulacionEntrevistaRRHH(fp1);
				}
			}
			fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(), Constantes.PARAMETRO_FASE_TECNICA);
			if (Validator.isNotNull(fp)) {
				solicitudPostulacionBean.setStrfechaTecnica(Util.getStrFecha(fp.getFechaFase()));
				diferenciasTiempo = fp.getFechamodifica().getTime() - fp.getFechacrea().getTime();
				if (fp.isAsistio()) {
					estado_parametro_id = Constantes.PARAMETRO_FASE_TECNICA;
				}
				fase = fp;
				if (Validator.isNotNull(fp)) {
					FasePostulacionBean fp1 = new FasePostulacionBean();
					fp1.setFasepostulacionId(fp.getFasePostulacionId());
					fp1.setAsistio(fp.getAsistio());
					fp1.setSolicitudRequerimientoId(fp.getSolicitudRequerimientoId());
					fp1.setApruebaFase(fp.getApruebaFase());
					fp1.setTipoFase(fp.getTipoFase());
					fp1.setEstado(fp.getEstado());
					solicitudPostulacionBean.setFasePostulacionTecnico(fp1);
				}
			}
			fase = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(), Constantes.PARAMETRO_FASE_PSICOLOGICA);
			if (Validator.isNotNull(fase)) {
				if (Validator.isNotNull(fase)) {
					diferenciasTiempo = fase.getFechamodifica().getTime() - fase.getFechacrea().getTime();
					solicitudPostulacionBean.setStrfechaPsicologica(Util.getStrFecha(fase.getFechaFase()));
				}
				if (Validator.isNotNull(fase)) {
					FasePostulacionBean fp1 = new FasePostulacionBean();
					fp1.setFasepostulacionId(fase.getFasePostulacionId());
					fp1.setAsistio(fase.getAsistio());
					fp1.setSolicitudRequerimientoId(fase.getSolicitudRequerimientoId());
					fp1.setApruebaFase(fase.getApruebaFase());
					fp1.setTipoFase(fase.getTipoFase());
					fp1.setEstado(fase.getEstado());
					solicitudPostulacionBean.setFasePostulacionPsicologico(fp1);
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
				if (Validator.isNotNull(fase)) {
					solicitudPostulacionBean.setEstado(fase.getEstado());
					solicitudPostulacionBean.setStrEstado(parametroService.getParametro(fase.getEstado()).getValor());
				}
			} else {
				solicitudPostulacionBean.setStrEstado(StringPool.BLANK);

			}

			List<PuestoEvaluacionBean> a = new ArrayList<PuestoEvaluacionBean>();
			List<PuestoEvaluacion> lista = PuestoEvaluacionLocalServiceUtil.findByS_ALL(solicitudId);
			PuestoEvaluacionBean p = null;
			Evaluacion e = null;
			EvaluacionBean eb = null;
			for (PuestoEvaluacion puestoEvaluacion : lista) {
				p = new PuestoEvaluacionBean();
				p.setSolicitudEvaluacionId(solicitudId);
				p.setRangoSuperior(puestoEvaluacion.getRangoSuperior());
				p.setRangoInferior(puestoEvaluacion.getRangoInferior());
				p.setEvaluacionId(puestoEvaluacion.getEvaluacionId());
				e = EvaluacionLocalServiceUtil.getEvaluacion(puestoEvaluacion.getEvaluacionId());
				eb = new EvaluacionBean();
				eb.setEvaluacionId(e.getEvaluacionId());
				eb.setDescripcion(e.getDescripcion());
				eb.setEnfoque(e.getEnfoque());
				eb.setTipoEvaluacion(e.getTipoEvaluacion());
				p.setEvaluacionBean(eb);
				a.add(p);
			}
			Boolean colaborador = (Boolean) u.getExpandoBridge().getAttribute("Colaborador");
			if (Validator.isNotNull(colaborador)) {
				solicitudPostulacionBean.setTipoPostulante(colaborador ? 1 : 0);
				solicitudPostulacionBean.setStrTipoPostulante(colaborador ? "Si" : "No");
			}
			solicitudPostulacionBean.setListaEvaluacionesPuestoEnfoque(a);

		} catch (PortalException | SystemException e) {
			_log.error("Error al getSolicitudPostulacion " + e.getMessage(), e);
		}
		return solicitudPostulacionBean;
	}

	@Override
	public Map<String, Object> registarAvance(SolicitudPostulacionBean solicitudPostulacionBean, Long userId, long scopeGroupId, User user) {
		Map<String, Object> result = new HashMap<String, Object>();
		PostulacionPK postulacionPK = new PostulacionPK(solicitudPostulacionBean.getSolicitudId(), userId);
		try {

			Postulacion postulacion = PostulacionLocalServiceUtil.getPostulacion(postulacionPK);
			SolicitudRequerimiento sr = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(postulacion.getSolicitudRequerimientoId());

			User u = UserLocalServiceUtil.getUser(userId);
			Boolean colaborador = (Boolean) u.getExpandoBridge().getAttribute("Colaborador");

			// if (!colaborador) {
			FasePostulacionBean aPsicologico = solicitudPostulacionBean.getFasePostulacionPsicologico();
			FasePostulacion baPsicologico = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
					Constantes.PARAMETRO_FASE_PSICOLOGICA);
			if (Validator.isNull(baPsicologico)) {
				baPsicologico = new FasePostulacionImpl();
			}
			baPsicologico.setApruebaFase(aPsicologico.isApruebaFase());
			baPsicologico.setAsistio(aPsicologico.isAsistio());
			baPsicologico.setEstado(aPsicologico.getEstado());
			baPsicologico.setFechaFase(aPsicologico.getFechaFase());
			if (Validator.isNull(baPsicologico.getFasePostulacionId())) {
				FasePostulacionLocalServiceUtil.addFasePostulacion(baPsicologico);
				aPsicologico.setFasepostulacionId(baPsicologico.getFasePostulacionId());
			} else {
				FasePostulacionLocalServiceUtil.updateFasePostulacion(baPsicologico);
			}

			FasePostulacionBean aTecnico = solicitudPostulacionBean.getFasePostulacionTecnico();
			FasePostulacion baTecnico = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
					Constantes.PARAMETRO_FASE_TECNICA);
			if (Validator.isNull(baPsicologico)) {
				baTecnico = new FasePostulacionImpl();
			}
			baTecnico.setApruebaFase(aTecnico.isApruebaFase());
			baTecnico.setAsistio(aTecnico.isAsistio());
			baTecnico.setEstado(aTecnico.getEstado());
			baTecnico.setFechaFase(aTecnico.getFechaFase());
			if (Validator.isNull(baTecnico.getFasePostulacionId())) {
				FasePostulacionLocalServiceUtil.addFasePostulacion(baTecnico);
				aPsicologico.setFasepostulacionId(baTecnico.getFasePostulacionId());
			} else {
				FasePostulacionLocalServiceUtil.updateFasePostulacion(baTecnico);
			}
			// }

			FasePostulacionBean aEntrevistaRRHH = solicitudPostulacionBean.getFasePostulacionEntrevistaRRHH();
			FasePostulacion baEntrevistaRRHH = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
					Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR);
			if (Validator.isNull(baEntrevistaRRHH)) {
				baEntrevistaRRHH = new FasePostulacionImpl();
			}
			baEntrevistaRRHH.setApruebaFase(aEntrevistaRRHH.isApruebaFase());
			baEntrevistaRRHH.setAsistio(aEntrevistaRRHH.isAsistio());
			baEntrevistaRRHH.setEstado(aEntrevistaRRHH.getEstado());
			baEntrevistaRRHH.setFechaFase(aEntrevistaRRHH.getFechaFase());
			if (Validator.isNull(baEntrevistaRRHH.getFasePostulacionId())) {
				FasePostulacionLocalServiceUtil.addFasePostulacion(baEntrevistaRRHH);
				aEntrevistaRRHH.setFasepostulacionId(baEntrevistaRRHH.getFasePostulacionId());
			} else {
				FasePostulacionLocalServiceUtil.updateFasePostulacion(baEntrevistaRRHH);
			}

			FasePostulacionBean aEntrevistaGerenteArea = solicitudPostulacionBean.getFasePostulacionEntrevistaGerenteArea();
			FasePostulacion baEntrevistaGerenteArea = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
					Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA);
			if (Validator.isNull(baEntrevistaGerenteArea)) {
				baEntrevistaGerenteArea = new FasePostulacionImpl();
			}
			baEntrevistaGerenteArea.setApruebaFase(aEntrevistaGerenteArea.isApruebaFase());
			baEntrevistaGerenteArea.setAsistio(aEntrevistaGerenteArea.isAsistio());
			baEntrevistaGerenteArea.setEstado(aEntrevistaGerenteArea.getEstado());
			baEntrevistaGerenteArea.setFechaFase(aEntrevistaGerenteArea.getFechaFase());
			if (Validator.isNull(baEntrevistaGerenteArea.getFasePostulacionId())) {
				FasePostulacionLocalServiceUtil.addFasePostulacion(baEntrevistaGerenteArea);
				aEntrevistaGerenteArea.setFasepostulacionId(baEntrevistaGerenteArea.getFasePostulacionId());
			} else {
				FasePostulacionLocalServiceUtil.updateFasePostulacion(baEntrevistaGerenteArea);
			}

			List<FasePostulacionPuestoEvaluacionBean> listaFasePostulacionPuestoEvaluacionBean = solicitudPostulacionBean.getListaFasePostulacionPuestoEvaluacionBean();

			FasePostulacionPuestoEvaluacion a = null;
			FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK = null;

			for (FasePostulacionPuestoEvaluacionBean fasePostulacionPuestoEvaluacionBean : listaFasePostulacionPuestoEvaluacionBean) {
//				if (colaborador) {
//					if (fasePostulacionPuestoEvaluacionBean.getEvaluacionId() != 1 && fasePostulacionPuestoEvaluacionBean.getEvaluacionId() != 2) {
//						continue;
//					}
//				}
				try {
					fasePostulacionPuestoEvaluacionPK = new FasePostulacionPuestoEvaluacionPK(fasePostulacionPuestoEvaluacionBean.getFasePostulacionId(),
							fasePostulacionPuestoEvaluacionBean.getSolicitudFuncionId(), fasePostulacionPuestoEvaluacionBean.getEvaluacionId());
					a = FasePostulacionPuestoEvaluacionLocalServiceUtil.getFasePostulacionPuestoEvaluacion(fasePostulacionPuestoEvaluacionPK);
					a.setResultado(fasePostulacionPuestoEvaluacionBean.getResultado());
					FasePostulacionPuestoEvaluacionLocalServiceUtil.updateFasePostulacionPuestoEvaluacion(a);
				} catch (Exception e) {
					_log.error("FasePostulacionPuestoEvaluacion No encontrado");
				}
				if (Validator.isNull(a)) {
					a = new FasePostulacionPuestoEvaluacionImpl();
					a.setSolicitudFuncionId(fasePostulacionPuestoEvaluacionBean.getSolicitudFuncionId());
					a.setEvaluacionId(fasePostulacionPuestoEvaluacionBean.getEvaluacionId());
					a.setFasePostulacionId(fasePostulacionPuestoEvaluacionBean.getFasePostulacionId());
					a.setResultado(fasePostulacionPuestoEvaluacionBean.getResultado());
					FasePostulacionPuestoEvaluacionLocalServiceUtil.addFasePostulacionPuestoEvaluacion(a);
				}
				a = null;

			}

			sr.setEstado(Constantes.PARAMETRO_ENTREVISTA);
			SolicitudRequerimientoLocalServiceUtil.updateSolicitudRequerimiento(sr);
			result.put("mensaje", PropiedadMensaje.getMessage(PortletProps.get("registro.avance.mensaje"), String.valueOf(sr.getSolicitudRequerimientoId())));

			result.put("objeto", solicitudPostulacionBean);
			result.put("respuesta", Constantes.TRANSACCION_OK);

		} catch (PortalException | SystemException e) {
			_log.error("Error al publicarOfertaLaboral " + e.getMessage(), e);
			result.put("objeto", solicitudPostulacionBean);
			result.put("respuesta", Constantes.TRANSACCION_NO_OK);
			result.put("mensaje", PropiedadMensaje.getMessage(PortletProps.get("registro.avance.mensaje.error"), String.valueOf(solicitudPostulacionBean.getSolicitudId())));
		}
		return result;
	}

}

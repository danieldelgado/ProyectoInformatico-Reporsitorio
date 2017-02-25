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
import com.hitss.layer.model.Observaciones;
import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.PuestoEvaluacion;
import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.model.impl.FasePostulacionImpl;
import com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionImpl;
import com.hitss.layer.service.EvaluacionLocalServiceUtil;
import com.hitss.layer.service.FasePostulacionLocalServiceUtil;
import com.hitss.layer.service.FasePostulacionPuestoEvaluacionLocalServiceUtil;
import com.hitss.layer.service.ObservacionesLocalServiceUtil;
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
import com.liferay.counter.service.CounterLocalServiceUtil;
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
					solicitudPostulacionBean.setSeleccionado(postulacion.getSeleccionado());
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

					boolean asistio = false;
					// if (!colaborador) {
					fase = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
							Constantes.PARAMETRO_FASE_PSICOLOGICA);
					if (Validator.isNotNull(fase)) {
						diferenciasTiempo = fase.getFechamodifica().getTime() - fase.getFechacrea().getTime();
						solicitudPostulacionBean.setStrfechaPsicologica(Util.getStrFecha(fase.getFechaFase()));
						
						if (fase.isAsistio()) {
							estado_parametro_id = Constantes.PARAMETRO_FASE_PSICOLOGICA;
							asistio = fase.isAsistio();
						}
						
					}
					fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(), Constantes.PARAMETRO_FASE_TECNICA);
					if (Validator.isNotNull(fp)) {
						solicitudPostulacionBean.setStrfechaTecnica(Util.getStrFecha(fp.getFechaFase()));
						diferenciasTiempo = fp.getFechamodifica().getTime() - fp.getFechacrea().getTime();
						if (fp.isAsistio()) {
							estado_parametro_id = Constantes.PARAMETRO_FASE_TECNICA;
							if(!asistio){
								asistio = fp.isAsistio();
							}
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
							estado_parametro_id = 71;
							if(!asistio){
								asistio = fp.isAsistio();
							}
						}
						fase = fp;
					}

					fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
							Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA);
					if (Validator.isNotNull(fp)) {
						solicitudPostulacionBean.setStrfechaGerenteArea(Util.getStrFecha(fp.getFechaFase()));
						diferenciasTiempo = fp.getFechamodifica().getTime() - fp.getFechacrea().getTime();
						if (fp.isAsistio()) {
							estado_parametro_id = 71;
							if(!asistio){
								asistio = fp.isAsistio();
							}
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
							solicitudPostulacionBean.setEstado(estado_parametro_id);
							solicitudPostulacionBean.setStrEstado(parametroService.getParametro(fase.getEstado()).getValor());
						}
					} else {
						solicitudPostulacionBean.setStrEstado(StringPool.BLANK);
					}
					

					solicitudPostulacionBean.setAsistio(asistio);
					
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

			List<FasePostulacionPuestoEvaluacionBean> listaFasePostulacionPuestoEvaluacionBean = new ArrayList<>();
			
			
			
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
				List<FasePostulacionPuestoEvaluacion> l = 
				FasePostulacionPuestoEvaluacionLocalServiceUtil.getFasePostulacionPuestoEvaluacionByFasePostulacionBySolicitud(
						fp.getFasePostulacionId(),
						fp.getSolicitudRequerimientoId());
				
				FasePostulacionPuestoEvaluacionBean a = null;
				Evaluacion e = null;
				for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : l) {
					a = new FasePostulacionPuestoEvaluacionBean();
					a.setSolicitudFuncionId(fasePostulacionPuestoEvaluacion.getSolicitudFuncionId());
					a.setFasePostulacionId(fasePostulacionPuestoEvaluacion.getFasePostulacionId());					
					e = EvaluacionLocalServiceUtil.getEvaluacion(fasePostulacionPuestoEvaluacion.getEvaluacionId());					
					a.setEvaluacionId(fasePostulacionPuestoEvaluacion.getEvaluacionId());
					a.setTipoEvaluacionId(e.getTipoEvaluacion());
					a.setResultado(fasePostulacionPuestoEvaluacion.getResultado());
					listaFasePostulacionPuestoEvaluacionBean.add(a);
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
				List<FasePostulacionPuestoEvaluacion> l = 
						FasePostulacionPuestoEvaluacionLocalServiceUtil.getFasePostulacionPuestoEvaluacionByFasePostulacionBySolicitud(
								fp.getFasePostulacionId(),
								fp.getSolicitudRequerimientoId());
						
				FasePostulacionPuestoEvaluacionBean a = null;
				Evaluacion e = null;
				for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : l) {
					a = new FasePostulacionPuestoEvaluacionBean();
					a.setSolicitudFuncionId(fasePostulacionPuestoEvaluacion.getSolicitudFuncionId());
					a.setFasePostulacionId(fasePostulacionPuestoEvaluacion.getFasePostulacionId());					
					e = EvaluacionLocalServiceUtil.getEvaluacion(fasePostulacionPuestoEvaluacion.getEvaluacionId());					
					a.setEvaluacionId(fasePostulacionPuestoEvaluacion.getEvaluacionId());
					a.setTipoEvaluacionId(e.getTipoEvaluacion());
					a.setResultado(fasePostulacionPuestoEvaluacion.getResultado());
					listaFasePostulacionPuestoEvaluacionBean.add(a);
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
				
				List<FasePostulacionPuestoEvaluacion> l = 
						FasePostulacionPuestoEvaluacionLocalServiceUtil.getFasePostulacionPuestoEvaluacionByFasePostulacionBySolicitud(
								fp.getFasePostulacionId(),
								fp.getSolicitudRequerimientoId());
						
				FasePostulacionPuestoEvaluacionBean a = null;
				Evaluacion e = null;
				for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : l) {
					a = new FasePostulacionPuestoEvaluacionBean();
					a.setSolicitudFuncionId(fasePostulacionPuestoEvaluacion.getSolicitudFuncionId());
					a.setFasePostulacionId(fasePostulacionPuestoEvaluacion.getFasePostulacionId());					
					e = EvaluacionLocalServiceUtil.getEvaluacion(fasePostulacionPuestoEvaluacion.getEvaluacionId());					
					a.setEvaluacionId(fasePostulacionPuestoEvaluacion.getEvaluacionId());
					a.setTipoEvaluacionId(e.getTipoEvaluacion());
					a.setResultado(fasePostulacionPuestoEvaluacion.getResultado());
					listaFasePostulacionPuestoEvaluacionBean.add(a);
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
			
				List<FasePostulacionPuestoEvaluacion> l = 
						FasePostulacionPuestoEvaluacionLocalServiceUtil.getFasePostulacionPuestoEvaluacionByFasePostulacionBySolicitud(
								fase.getFasePostulacionId(),
								fase.getSolicitudRequerimientoId());
						
				FasePostulacionPuestoEvaluacionBean a = null;
				Evaluacion e = null;
				for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : l) {
					a = new FasePostulacionPuestoEvaluacionBean();
					a.setSolicitudFuncionId(fasePostulacionPuestoEvaluacion.getSolicitudFuncionId());
					a.setFasePostulacionId(fasePostulacionPuestoEvaluacion.getFasePostulacionId());					
					e = EvaluacionLocalServiceUtil.getEvaluacion(fasePostulacionPuestoEvaluacion.getEvaluacionId());					
					a.setEvaluacionId(fasePostulacionPuestoEvaluacion.getEvaluacionId());
					a.setTipoEvaluacionId(e.getTipoEvaluacion());
					a.setResultado(fasePostulacionPuestoEvaluacion.getResultado());
					listaFasePostulacionPuestoEvaluacionBean.add(a);
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
						
			solicitudPostulacionBean.setListaFasePostulacionPuestoEvaluacionBean(listaFasePostulacionPuestoEvaluacionBean);
			
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
			
			long faseInansistencia  = postulacion.getFaseNoAsistida(); 

			postulacion.setFaseNoAsistida(0);
			postulacion.setUsuariomodifica(user.getUserId());
			postulacion.setFechamodifica(new Date());
			PostulacionLocalServiceUtil.updatePostulacion(postulacion);
			
			User u = UserLocalServiceUtil.getUser(userId);
			Boolean colaborador = (Boolean) u.getExpandoBridge().getAttribute("Colaborador");

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
			if (Validator.isNull(baPsicologico.getFasePostulacionId()) && baPsicologico.getFasePostulacionId() > 0) {
				FasePostulacionLocalServiceUtil.addFasePostulacion(baPsicologico);
				aPsicologico.setFasepostulacionId(baPsicologico.getFasePostulacionId());
			} else {
				if(baPsicologico.getFasePostulacionId() > 0){
					FasePostulacionLocalServiceUtil.updateFasePostulacion(baPsicologico);
				}				
			}	
			
			FasePostulacionBean aTecnico = solicitudPostulacionBean.getFasePostulacionTecnico();
			FasePostulacion baTecnico = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
					Constantes.PARAMETRO_FASE_TECNICA);
			if (Validator.isNull(baTecnico)) {
				baTecnico = new FasePostulacionImpl();
			}
			baTecnico.setApruebaFase(aTecnico.isApruebaFase());
			baTecnico.setAsistio(aTecnico.isAsistio());
			baTecnico.setEstado(aTecnico.getEstado());
			baTecnico.setFechaFase(aTecnico.getFechaFase());
			if (Validator.isNull(baTecnico.getFasePostulacionId()) && baTecnico.getFasePostulacionId() > 0) {
				FasePostulacionLocalServiceUtil.addFasePostulacion(baTecnico);
				aPsicologico.setFasepostulacionId(baTecnico.getFasePostulacionId());
			} else {
				if(baTecnico.getFasePostulacionId() > 0){
					FasePostulacionLocalServiceUtil.updateFasePostulacion(baTecnico);
				}				
			}		

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
			if (Validator.isNull(baEntrevistaRRHH.getFasePostulacionId()) && baEntrevistaRRHH.getFasePostulacionId() > 0) {
				FasePostulacionLocalServiceUtil.addFasePostulacion(baEntrevistaRRHH);
				aEntrevistaRRHH.setFasepostulacionId(baEntrevistaRRHH.getFasePostulacionId());
			} else {
				if(baEntrevistaRRHH.getFasePostulacionId() > 0){
					FasePostulacionLocalServiceUtil.updateFasePostulacion(baEntrevistaRRHH);	
				}			
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
			if (Validator.isNull(baEntrevistaGerenteArea.getFasePostulacionId()) && baEntrevistaGerenteArea.getFasePostulacionId() > 0) {
				FasePostulacionLocalServiceUtil.addFasePostulacion(baEntrevistaGerenteArea);
				aEntrevistaGerenteArea.setFasepostulacionId(baEntrevistaGerenteArea.getFasePostulacionId());
			} else {
				if(baEntrevistaGerenteArea.getFasePostulacionId() > 0){
					FasePostulacionLocalServiceUtil.updateFasePostulacion(baEntrevistaGerenteArea);
				}				
			}

			List<FasePostulacionPuestoEvaluacionBean> listaFasePostulacionPuestoEvaluacionBean = solicitudPostulacionBean.getListaFasePostulacionPuestoEvaluacionBean();

			FasePostulacionPuestoEvaluacion a = null;
			FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK = null;

			for (FasePostulacionPuestoEvaluacionBean fasePostulacionPuestoEvaluacionBean : listaFasePostulacionPuestoEvaluacionBean) {
				if(fasePostulacionPuestoEvaluacionBean.getResultado()>=0){
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
						if( fasePostulacionPuestoEvaluacionBean.getSolicitudFuncionId()>=0 &&
								fasePostulacionPuestoEvaluacionBean.getEvaluacionId()>=0 &&
								fasePostulacionPuestoEvaluacionBean.getFasePostulacionId()>=0 &&
								fasePostulacionPuestoEvaluacionBean.getResultado()>=0 ){

							
							FasePostulacionPuestoEvaluacionLocalServiceUtil.addFasePostulacionPuestoEvaluacion(a);
						}
					}
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

//	private long getTipoFase(Postulacion postulacion, Long fasePostulacionId, List<FasePostulacionPuestoEvaluacionBean> listaFasePostulacionPuestoEvaluacionBean) {
//		
//		
//		
//		
//		return 0;
//	}

	@Override
	public Map<String, Object> noAsistio(Long solicitudId, Long userId, Long fasePostulacion, String observacion, long scopeGroupId, User user) {
		Map<String, Object> result = new HashMap<String, Object>();
		SolicitudPostulacionBean sss = getSolicitudPostulacion(solicitudId, userId);
		PostulacionPK postulacionPK = new PostulacionPK(solicitudId, userId);
		try {

			Postulacion postulacion = PostulacionLocalServiceUtil.getPostulacion(postulacionPK);
			SolicitudRequerimiento sr = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(postulacion.getSolicitudRequerimientoId());

			User u = UserLocalServiceUtil.getUser(userId);

			
			FasePostulacion fase = null;
			switch (fasePostulacion.intValue()) {
			case 78:
				fase = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
						Constantes.PARAMETRO_FASE_PSICOLOGICA);
				break;
			case 79:
				fase = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
						Constantes.PARAMETRO_FASE_TECNICA);				
				break;
			case 80:
				fase = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
						Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR);				
				break;
			case 81:
				fase = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(sr.getSolicitudRequerimientoId(), postulacion.getUsuarioId(),
						Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA);				
				break;

			}
			
			postulacion.setFaseNoAsistida(fase.getTipoFase());			
			postulacion.setUsuariomodifica(user.getUserId());
			postulacion.setFechamodifica(new Date());
			fase.setFechaFase(new Date());
			fase.setAsistio(false);
			fase.setUsuariomodifica(user.getUserId());
			fase.setFechamodifica(new Date());
		
			FasePostulacionLocalServiceUtil.updateFasePostulacion(fase);
			PostulacionLocalServiceUtil.updatePostulacion(postulacion);
			Long id = CounterLocalServiceUtil.increment(Observaciones.class.getName());				
			Observaciones o = ObservacionesLocalServiceUtil.createObservaciones(id);
			o.setActivo(Constantes.ACTIVO);
			o.setDescripcion(observacion);
			o.setRegistroId(sr.getSolicitudRequerimientoId());
			o.setTabla(SolicitudRequerimiento.class.getName());
			o.setNew(true);
			o.setUsuariocrea(user.getUserId());
			o.setFechacrea(new Date());
			o.setUsuariomodifica(user.getUserId());
			o.setFechamodifica(new Date());
			ObservacionesLocalServiceUtil.addObservaciones(o);
			sr.setEstado(Constantes.PARAMETRO_OBSERVADO);		
			
			sr.setEstado(Constantes.PARAMETRO_ENTREVISTA);
			SolicitudRequerimientoLocalServiceUtil.updateSolicitudRequerimiento(sr);
			result.put("mensaje", PropiedadMensaje.getMessage(PortletProps.get("registro.avance.mensaje"), String.valueOf(sr.getSolicitudRequerimientoId())));

			result.put("objeto", sss);
			result.put("respuesta", Constantes.TRANSACCION_OK);

		} catch (PortalException | SystemException e) {
			_log.error("Error al publicarOfertaLaboral " + e.getMessage(), e);
			result.put("objeto", sss);
			result.put("respuesta", Constantes.TRANSACCION_NO_OK);
			result.put("mensaje", PropiedadMensaje.getMessage(PortletProps.get("registro.avance.mensaje.error"), String.valueOf(sss.getSolicitudId())));
		}
		return result;
	}

}

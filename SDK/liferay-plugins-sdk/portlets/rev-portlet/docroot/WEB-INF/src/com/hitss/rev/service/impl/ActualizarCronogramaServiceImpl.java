package com.hitss.rev.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hitss.layer.model.ActividadCronograma;
import com.hitss.layer.model.Cronograma;
import com.hitss.layer.model.PrioridadGrupoUsuarios;
import com.hitss.layer.model.impl.ActividadCronogramaImpl;
import com.hitss.layer.model.impl.CronogramaImpl;
import com.hitss.layer.service.ActividadCronogramaLocalServiceUtil;
import com.hitss.layer.service.CronogramaLocalServiceUtil;
import com.hitss.layer.service.PrioridadGrupoUsuariosLocalServiceUtil;
import com.hitss.rev.bean.ActividadCronogramaBean;
import com.hitss.rev.bean.PrioridadGrupoUsuariosBean;
import com.hitss.rev.bean.UsuarioBean;
import com.hitss.rev.service.ActualizarCronogramaService;
import com.hitss.rev.util.Constantes;
import com.hitss.rev.util.PropiedadMensaje;
import com.hitss.rev.util.RevServiceImpl;
import com.hitss.rev.util.Util;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.model.UserGroup;
import com.liferay.portal.service.UserGroupLocalServiceUtil;
import com.liferay.util.portlet.PortletProps;

@Service("ActualizarCronogramaService")
public class ActualizarCronogramaServiceImpl extends RevServiceImpl implements ActualizarCronogramaService {

	private static Log _log = LogFactoryUtil.getLog(ActualizarCronogramaServiceImpl.class);

	@Override
	public List<PrioridadGrupoUsuariosBean> getListaPrioridadGrupoUsuariosBySolicitud(Long solicitudEvaluacionId) {
		List<PrioridadGrupoUsuarios> lst = PrioridadGrupoUsuariosLocalServiceUtil.getListaPrioridadGrupoUsuariosBySolicitud(solicitudEvaluacionId);
		if (lst.isEmpty()) {
			return null;
		}
		List<PrioridadGrupoUsuariosBean> l = new ArrayList<PrioridadGrupoUsuariosBean>();
		PrioridadGrupoUsuariosBean b = null;
		ActividadCronogramaBean actividadCronogramaBean = null;
		 ActividadCronograma actividadCronograma = null;
		UserGroup usergroup = null;

		Cronograma cronograma = null;
		try {
			cronograma = CronogramaLocalServiceUtil.getCronogramaBySolicitud(solicitudEvaluacionId);
		} catch (PortalException | SystemException e) {
			_log.error("Cronograma:" + e.getLocalizedMessage(), e);
		}
		try {
			for (PrioridadGrupoUsuarios pgu : lst) {
				b = new PrioridadGrupoUsuariosBean();
				actividadCronogramaBean = new ActividadCronogramaBean();
				b.setPrioridadGrupoUsuariosId(pgu.getPrioridadGrupoUsuariosId());
				b.setSolicitudEvaluacionId(pgu.getSolicitudEvaluacionDesempennoId());
				usergroup = UserGroupLocalServiceUtil.getUserGroup(Long.valueOf(pgu.getGrupoUsuario()));
				if (Validator.isNotNull(cronograma)) {
					
					List<ActividadCronograma> ls = ActividadCronogramaLocalServiceUtil.getListaActividadCronogramaByCronogramaGrupo(cronograma.getCronogramaId(),
							Long.valueOf(pgu.getGrupoUsuario()));
					
					if(Validator.isNotNull(ls) && !ls.isEmpty()){
						actividadCronograma = ls.get(0);						
						actividadCronogramaBean = new ActividadCronogramaBean();
						actividadCronogramaBean.setActividadCronogramaId(actividadCronograma.getActividadCronogramaId());
						actividadCronogramaBean.setDescripcion(actividadCronograma.getDescripcion());
						actividadCronogramaBean.setFechaEvaluacionInicio(actividadCronograma.getFechaInicioEvaluacion());
						actividadCronogramaBean.setStrfechaEvaluacionInicio(Util.getStrFecha(actividadCronograma.getFechaInicioEvaluacion()));
						
						actividadCronogramaBean.setFechaEvaluacionFin(actividadCronograma.getFechaFinEvaluacion());
						actividadCronogramaBean.setStrfechaEvaluacionFin(Util.getStrFecha(actividadCronograma.getFechaFinEvaluacion()));
						
						actividadCronogramaBean.setFechaPlanAccionInicio(actividadCronograma.getFechaInicio());
						actividadCronogramaBean.setStrfechaPlanAccionInicio(Util.getStrFecha(actividadCronograma.getFechaInicio()));
						
						actividadCronogramaBean.setFechaPlanAccionFin(actividadCronograma.getFechaFin());		
						actividadCronogramaBean.setStrfechaPlanAccionFin(Util.getStrFecha(actividadCronograma.getFechaFin()));	
						
					}
						
					
					
				}

				b.setGrupoUsuario(Long.valueOf(pgu.getGrupoUsuario()));
				b.setStrgrupoUsuario(usergroup.getName());
				b.setActividadCronogramaBean(actividadCronogramaBean);
				l.add(b);
			}
		} catch (PortalException | SystemException e) {
			_log.error("getListaPrioridadGrupoUsuariosBySolicitud:" + e.getLocalizedMessage(), e);
		}
		return l;
	}

	@Override
	public ActividadCronogramaBean getActividadCronograma(Long solicitudEvaluacionId, Long prioridadGrupoUsuariosId, Long cronogramaId, Long actividadCronogramaId,
			Long grupoUsuario) {
		Cronograma cronograma = null;
		ActividadCronogramaBean actividadCronogramaBean = new ActividadCronogramaBean();
		try {
			cronograma = CronogramaLocalServiceUtil.getCronogramaBySolicitud(solicitudEvaluacionId);
			if (Validator.isNotNull(cronograma)) {
				if (cronograma.getCronogramaId() == cronogramaId) {					
					List<ActividadCronograma> ls = ActividadCronogramaLocalServiceUtil.getListaActividadCronogramaByCronogramaGrupo(cronograma.getCronogramaId(),
							Long.valueOf(grupoUsuario));
					
					if(Validator.isNotNull(ls) && !ls.isEmpty()){
						ActividadCronograma actividadCronograma = ls.get(0);						
						actividadCronogramaBean = new ActividadCronogramaBean();
						
//						actividadCronogramaBean = 
						
						actividadCronogramaBean.setActividadCronogramaId(actividadCronograma.getActividadCronogramaId());
						actividadCronogramaBean.setDescripcion(actividadCronograma.getDescripcion());
						actividadCronogramaBean.setFechaEvaluacionInicio(actividadCronograma.getFechaInicioEvaluacion());
						actividadCronogramaBean.setStrfechaEvaluacionInicio(Util.getStrFecha(actividadCronograma.getFechaInicioEvaluacion()));
						
						actividadCronogramaBean.setFechaEvaluacionFin(actividadCronograma.getFechaFinEvaluacion());
						actividadCronogramaBean.setStrfechaEvaluacionFin(Util.getStrFecha(actividadCronograma.getFechaFinEvaluacion()));
						
						actividadCronogramaBean.setFechaPlanAccionInicio(actividadCronograma.getFechaInicio());
						actividadCronogramaBean.setStrfechaPlanAccionInicio(Util.getStrFecha(actividadCronograma.getFechaInicio()));
						
						actividadCronogramaBean.setFechaPlanAccionFin(actividadCronograma.getFechaFin());		
						actividadCronogramaBean.setStrfechaPlanAccionFin(Util.getStrFecha(actividadCronograma.getFechaFin()));	
						
					}
					
				}
			}
		} catch (PortalException | SystemException e) {
			_log.error("Cronograma:" + e.getLocalizedMessage(), e);
		}
		return actividadCronogramaBean;
	}

	public List<UsuarioBean> getListaGerentes(long companyId, long companyGroupId) {

		return super.getListaGerenteArea(companyId, companyGroupId);
	}

	public List<UsuarioBean> getListaLideres(long companyId, long companyGroupId) {

		return super.getListaLideres(companyId, companyGroupId);
	}

	@Override
	public Map<String, Object> guardarPlanificar(Long solicitudEvaluacionId, Long cronogramaId, Long actividadCronogramaId, Long grupoUsuarioId, Long gerenteArea, Long lider,
			String actividad, Date fechaInicioEvalacion, Date fechaFinEvalacion, Date fechaInicioPlanAccion, Date fechaFinPlanAccion, Long prioridadGrupoUsuariosId, User user,
			long scopeGroupId) {

		Map<String, Object> result = new HashMap<String, Object>();
		ActividadCronogramaBean acb = new ActividadCronogramaBean();
		Cronograma cronograma = null;
		try {
			cronograma = CronogramaLocalServiceUtil.getCronogramaBySolicitud(solicitudEvaluacionId);
		} catch (PortalException | SystemException e) {
			_log.error("guardarPlanificar:" + e.getLocalizedMessage(), e);
		}

		if (Validator.isNull(cronograma)) {
			cronograma = new CronogramaImpl();
			cronograma.setAprobacionCronograma(Constantes.APROBADO_NO_OK);
			// cronograma.setEstado("Sin definir");
			cronograma.setSolicitudEvaluacionDesempennoId(solicitudEvaluacionId);
			cronograma.setNew(true);
			cronograma.setActivo(true);
			cronograma.setUsuariocrea(user.getUserId());
			cronograma.setFechacrea(new Date());
			cronograma.setUsuariomodifica(user.getUserId());
			cronograma.setFechamodifica(new Date());
			try {
				cronograma = CronogramaLocalServiceUtil.addCronograma(cronograma);
			} catch (SystemException e) {
				_log.error("guardarPlanificar:" + e.getLocalizedMessage(), e);
			}
		} else {
			cronograma.setUsuariomodifica(user.getUserId());
			cronograma.setFechamodifica(new Date());
			try {
				cronograma = CronogramaLocalServiceUtil.updateCronograma(cronograma);
			} catch (SystemException e) {
				_log.error("guardarPlanificar:" + e.getLocalizedMessage(), e);
			}
		}
		

		if (Validator.isNotNull(cronograma)) {
			cronogramaId = cronograma.getCronogramaId();
			ActividadCronograma actvidadCrongrama = null;
			try {
//				if(actividadCronogramaId>0){
					List<ActividadCronograma> ls = ActividadCronogramaLocalServiceUtil.getListaActividadCronogramaByCronogramaGrupo(cronograma.getCronogramaId(),
							Long.valueOf(grupoUsuarioId));
					if(Validator.isNotNull(ls) && !ls.isEmpty()){
						actvidadCrongrama = ls.get(0);	

					}
//				}
					
			} catch ( SystemException e) {
				_log.error("guardarPlanificar:" + e.getLocalizedMessage(), e);
			}
			
			System.out.println(actvidadCrongrama);
			
			if (Validator.isNull(actvidadCrongrama)) {
				Long id  = 0L;
				try {
					id = CounterLocalServiceUtil.increment(ActividadCronograma.class.getName());
				} catch (SystemException e) {
					_log.error("guardarPlanificar:" + e.getLocalizedMessage(), e);
				}
				actvidadCrongrama = new ActividadCronogramaImpl();
				actvidadCrongrama.setActividadCronogramaId(id);
				actvidadCrongrama.setNew(true);

				actvidadCrongrama.setCronogramaId(cronogramaId);
				actvidadCrongrama.setGrupoUsuario(grupoUsuarioId);

				actvidadCrongrama.setDescripcion(actividad);
				actvidadCrongrama.setFechaInicioEvaluacion(fechaInicioEvalacion);
				actvidadCrongrama.setFechaFinEvaluacion(fechaFinEvalacion);
				actvidadCrongrama.setFechaInicio(fechaInicioPlanAccion);
				actvidadCrongrama.setFechaFin(fechaFinPlanAccion);

				actvidadCrongrama.setActivo(true);
				actvidadCrongrama.setUsuariocrea(user.getUserId());
				actvidadCrongrama.setFechacrea(new Date());
				actvidadCrongrama.setUsuariomodifica(user.getUserId());
				actvidadCrongrama.setFechamodifica(new Date());

				try {
					actvidadCrongrama = ActividadCronogramaLocalServiceUtil.addActividadCronograma(actvidadCrongrama);
				} catch (SystemException e) {
					_log.error("guardarPlanificar:" + e.getLocalizedMessage(), e);
				}
			} else {

				actvidadCrongrama.setDescripcion(actividad);
				actvidadCrongrama.setFechaInicioEvaluacion(fechaInicioEvalacion);
				actvidadCrongrama.setFechaFinEvaluacion(fechaFinEvalacion);
				actvidadCrongrama.setFechaInicio(fechaInicioPlanAccion);
				actvidadCrongrama.setFechaFin(fechaFinPlanAccion);
				actvidadCrongrama.setUsuariomodifica(user.getUserId());
				actvidadCrongrama.setFechamodifica(new Date());

				try {
					actvidadCrongrama = ActividadCronogramaLocalServiceUtil.updateActividadCronograma(actvidadCrongrama);
				} catch (SystemException e) {
					_log.error("guardarPlanificar:" + e.getLocalizedMessage(), e);
				}
			}
		}

		

		acb = getActividadCronograma(solicitudEvaluacionId, prioridadGrupoUsuariosId, cronogramaId, actividadCronogramaId, grupoUsuarioId);
		result.put("respuesta", Constantes.TRANSACCION_OK);
		result.put("objeto", acb);
		result.put("mensaje", PropiedadMensaje.getMessage(PortletProps.get("solicitud.reclutamiento.actualizado"), String.valueOf(solicitudEvaluacionId)));

		return null;
	}

}

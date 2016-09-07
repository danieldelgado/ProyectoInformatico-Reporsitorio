package com.hitss.rev.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hitss.layer.model.ActividadCronograma;
import com.hitss.layer.model.Cronograma;
import com.hitss.layer.model.PrioridadGrupoUsuarios;
import com.hitss.layer.service.ActividadCronogramaLocalServiceUtil;
import com.hitss.layer.service.CronogramaLocalServiceUtil;
import com.hitss.layer.service.PrioridadGrupoUsuariosLocalServiceUtil;
import com.hitss.rev.bean.ActividadCronogramaBean;
import com.hitss.rev.bean.PrioridadGrupoUsuariosBean;
import com.hitss.rev.service.ActualizarCronogramaService;
import com.hitss.rev.util.RevServiceImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.UserGroup;
import com.liferay.portal.service.UserGroupLocalServiceUtil;

@Service("ActualizarCronogramaService")
public class ActualizarCronogramaServiceImpl extends RevServiceImpl implements ActualizarCronogramaService {


	private static Log _log = LogFactoryUtil.getLog(ActualizarCronogramaServiceImpl.class);
	
	@Override
	public List<PrioridadGrupoUsuariosBean> getListaPrioridadGrupoUsuariosBySolicitud(
			Long solicitudEvaluacionId) {		
		List<PrioridadGrupoUsuarios> lst = PrioridadGrupoUsuariosLocalServiceUtil.getListaPrioridadGrupoUsuariosBySolicitud(solicitudEvaluacionId);
		if(lst.isEmpty()){
			return null;
		}
		List<PrioridadGrupoUsuariosBean> l = new ArrayList<PrioridadGrupoUsuariosBean>();
		PrioridadGrupoUsuariosBean b = null;
		ActividadCronogramaBean actividadCronogramaBean = null;
//		ActividadCronograma actividadCronograma = null;
		UserGroup usergroup = null; 

		Cronograma cronograma = null;
		try {
			cronograma = CronogramaLocalServiceUtil.getCronogramaBySolicitud(solicitudEvaluacionId);
		} catch (PortalException | SystemException e) {
			_log.error("Cronograma:" + e.getLocalizedMessage(), e);
		}
		System.out.println("cronograma");
		System.out.println(cronograma);
		try {
			for (PrioridadGrupoUsuarios pgu : lst) {
				b = new PrioridadGrupoUsuariosBean();
				actividadCronogramaBean = new ActividadCronogramaBean();
				b.setPrioridadGrupoUsuariosId(pgu.getPrioridadGrupoUsuariosId());
				b.setSolicitudEvaluacionId(pgu.getSolicitudEvaluacionDesempennoId());								
				usergroup = UserGroupLocalServiceUtil.getUserGroup(Long.valueOf(pgu.getGrupoUsuario()));
				if(Validator.isNotNull(cronograma)){
					System.out.println( ActividadCronogramaLocalServiceUtil.getListaActividadCronogramaByCronogramaGrupo(cronograma.getCronogramaId(), Long.valueOf(pgu.getGrupoUsuario())));
					
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
	public ActividadCronogramaBean getActividadCronograma(
			Long solicitudEvaluacionId, Long prioridadGrupoUsuariosId,
			Long cronogramaId, Long actividadCronogramaId, Long grupoUsuario) {		
		Cronograma cronograma = null;
		ActividadCronogramaBean acb = new ActividadCronogramaBean();
		try {
			cronograma = CronogramaLocalServiceUtil.getCronogramaBySolicitud(solicitudEvaluacionId);
			if(Validator.isNotNull(cronograma)){
				if(cronograma.getCronogramaId()==cronogramaId){
					System.out.println("algo");
				}
			}
		} catch (PortalException | SystemException e) {
			_log.error("Cronograma:" + e.getLocalizedMessage(), e);
		}
		return acb;
	}

}

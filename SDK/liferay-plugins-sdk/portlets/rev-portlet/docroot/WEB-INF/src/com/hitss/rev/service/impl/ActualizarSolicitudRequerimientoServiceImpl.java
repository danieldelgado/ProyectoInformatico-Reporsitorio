package com.hitss.rev.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.liferay.api.LiferayApiService;
import com.hitss.rev.service.ActualizarSolicitudRequerimientoService;
import com.hitss.rev.service.ParametroService;
import com.hitss.rev.service.SolicitudRequerimientoRequisitoService;
import com.hitss.rev.util.RevServiceImpl;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;

@Service("ActualizarSolicitudRequerimientoService")
public class ActualizarSolicitudRequerimientoServiceImpl extends RevServiceImpl  implements ActualizarSolicitudRequerimientoService {

	private static Log _log = LogFactoryUtil.getLog(EvaluarSolicitudRequerimientoServiceImpl.class);

	
	
	@Autowired
	private ParametroService parametroService;

	@Autowired
	private LiferayApiService liferayContentService;

	@Autowired
	private SolicitudRequerimientoRequisitoService solicitudRequerimientoRequisitoService;
	

	@Override
	public Map<String, Object> guardarSolicitudReclutamiento(SolicitudRequerimientoBean solicitudRequerimiento, User user, long scopeGroupId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> anularSolicitudReclutamiento(SolicitudRequerimientoBean solicitudRequerimiento, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}

/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.hitss.layer.service.impl;

import java.util.List;

import com.hitss.layer.model.PrioridadGrupoUsuarios;
import com.hitss.layer.service.base.PrioridadGrupoUsuariosLocalServiceBaseImpl;
import com.hitss.layer.service.persistence.PrioridadGrupoUsuariosUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * The implementation of the prioridad grupo usuarios local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hitss.layer.service.PrioridadGrupoUsuariosLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.base.PrioridadGrupoUsuariosLocalServiceBaseImpl
 * @see com.hitss.layer.service.PrioridadGrupoUsuariosLocalServiceUtil
 */
public class PrioridadGrupoUsuariosLocalServiceImpl
	extends PrioridadGrupoUsuariosLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.hitss.layer.service.PrioridadGrupoUsuariosLocalServiceUtil} to access the prioridad grupo usuarios local service.
	 */

	private static Log _log = LogFactoryUtil.getLog(PrioridadGrupoUsuariosLocalServiceImpl.class);
	
	public List<PrioridadGrupoUsuarios> getListaPrioridadGrupoUsuariosBySolicitud(Long solicitudId){
		List<PrioridadGrupoUsuarios>  l = null;
		try {
			_log.info("getListaPrioridadGrupoUsuariosBySolicitud:"+solicitudId);
			l = PrioridadGrupoUsuariosUtil.findByS(solicitudId);
		} catch (SystemException e) {
			_log.error("getListaPrioridadGrupoUsuariosBySolicitud:" + e.getLocalizedMessage(), e);
		}
		return l;
	}
	
	
}
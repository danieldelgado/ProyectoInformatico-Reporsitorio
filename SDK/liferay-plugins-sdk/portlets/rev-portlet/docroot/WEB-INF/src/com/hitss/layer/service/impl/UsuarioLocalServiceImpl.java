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

import com.hitss.layer.model.Usuario;
import com.hitss.layer.model.impl.UsuarioImpl;
import com.hitss.layer.service.base.UsuarioLocalServiceBaseImpl;
import com.hitss.layer.service.persistence.UsuarioUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * The implementation of the usuario local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rec.hitss.layer.service.UsuarioLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.base.UsuarioLocalServiceBaseImpl
 * @see com.rec.hitss.layer.service.UsuarioLocalServiceUtil
 */
public class UsuarioLocalServiceImpl extends UsuarioLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.rec.hitss.layer.service.UsuarioLocalServiceUtil} to access the usuario local service.
	 */
	private static Log _log = LogFactoryUtil.getLog(UsuarioLocalServiceImpl.class);

	public Usuario newInstance(){
		Usuario u = new UsuarioImpl();
		return u;
	}
	
	public List<User> listarUsuariosByRole(long company, long groupId, String roleName) throws PortalException, SystemException {
		_log.debug("listarUsuariosByRole");
		Role role = RoleLocalServiceUtil.getRole(company, roleName);
		List<User> lista = UserLocalServiceUtil.getRoleUsers(role.getRoleId());
		_log.debug(lista);
		return lista;
	}
	
	public List<Usuario> findByUsuariosSeleccionados(long[] userIds) throws PortalException, SystemException {
		return UsuarioUtil.findByUsuariosSeleccionados(userIds);
	}
	
}
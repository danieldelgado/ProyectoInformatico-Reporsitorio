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

import com.hitss.layer.model.Funcion;
import com.hitss.layer.service.base.FuncionLocalServiceBaseImpl;
import com.hitss.layer.service.persistence.FuncionUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringPool;

/**
 * The implementation of the funcion local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hitss.layer.service.FuncionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.base.FuncionLocalServiceBaseImpl
 * @see com.hitss.layer.service.FuncionLocalServiceUtil
 */
public class FuncionLocalServiceImpl extends FuncionLocalServiceBaseImpl {
	
	public List<Funcion> findByDescripcion(String descripcion) throws SystemException {
		return FuncionUtil.findByD_Activo(StringPool.PERCENT + descripcion + StringPool.PERCENT);
	}
	
}
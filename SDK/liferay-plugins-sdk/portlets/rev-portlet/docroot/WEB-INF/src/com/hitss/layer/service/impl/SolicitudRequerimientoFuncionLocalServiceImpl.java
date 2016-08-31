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

import com.hitss.layer.NoSuchSolicitudRequerimientoException;
import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.model.SolicitudRequerimientoFuncion;
import com.hitss.layer.service.base.SolicitudRequerimientoFuncionLocalServiceBaseImpl;
import com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionUtil;
import com.hitss.layer.service.persistence.SolicitudRequerimientoUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the solicitud requerimiento funcion local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hitss.layer.service.SolicitudRequerimientoFuncionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.base.SolicitudRequerimientoFuncionLocalServiceBaseImpl
 * @see com.hitss.layer.service.SolicitudRequerimientoFuncionLocalServiceUtil
 */
public class SolicitudRequerimientoFuncionLocalServiceImpl
	extends SolicitudRequerimientoFuncionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.hitss.layer.service.SolicitudRequerimientoFuncionLocalServiceUtil} to access the solicitud requerimiento funcion local service.
	 */
	
	public List<SolicitudRequerimientoFuncion> getListaSolicitudRequerimientoFuncion(long solicitudRequerimientoId, long tagId) throws SystemException{
		return SolicitudRequerimientoFuncionUtil.findByS_F(solicitudRequerimientoId, tagId);
	}
	
	public List<SolicitudRequerimientoFuncion> getListaSolicitudRequerimientoFuncion(long solicitudRequerimientoId) throws SystemException{
		return SolicitudRequerimientoFuncionUtil.findByS_All(solicitudRequerimientoId);
	}
	

	public List<SolicitudRequerimientoFuncion> getListaSolicitudRequerimientoFuncionActivo(long solicitudRequerimientoId) throws SystemException{
		return SolicitudRequerimientoFuncionUtil.findByS(solicitudRequerimientoId);
	}

	
	
}
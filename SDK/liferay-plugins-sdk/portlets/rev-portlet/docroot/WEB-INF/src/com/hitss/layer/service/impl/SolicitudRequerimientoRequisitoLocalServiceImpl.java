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

import com.hitss.layer.model.SolicitudRequerimientoRequisito;
import com.hitss.layer.service.base.SolicitudRequerimientoRequisitoLocalServiceBaseImpl;
import com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the solicitud requerimiento requisito local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rec.hitss.layer.service.SolicitudRequerimientoRequisitoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.base.SolicitudRequerimientoRequisitoLocalServiceBaseImpl
 * @see com.rec.hitss.layer.service.SolicitudRequerimientoRequisitoLocalServiceUtil
 */
public class SolicitudRequerimientoRequisitoLocalServiceImpl
	extends SolicitudRequerimientoRequisitoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.rec.hitss.layer.service.SolicitudRequerimientoRequisitoLocalServiceUtil} to access the solicitud requerimiento requisito local service.
	 */

	public List<SolicitudRequerimientoRequisito> getListaSolicitudRequerimientoRequisito(long solicitudRequerimientoId, long tagId) throws SystemException{
		return SolicitudRequerimientoRequisitoUtil.findByS_T(solicitudRequerimientoId, tagId);
	}
	
	public List<SolicitudRequerimientoRequisito> getListaSolicitudRequerimientoRequisito(long solicitudRequerimientoId) throws SystemException{
		return SolicitudRequerimientoRequisitoUtil.findByS_All(solicitudRequerimientoId);
	}
	

	public List<SolicitudRequerimientoRequisito> getListaSolicitudRequerimientoRequisitoActivo(long solicitudRequerimientoId) throws SystemException{
		return SolicitudRequerimientoRequisitoUtil.findByS(solicitudRequerimientoId);
	}
	
	
}
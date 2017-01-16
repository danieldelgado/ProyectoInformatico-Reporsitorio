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

import com.hitss.layer.model.PuestoEvaluacion;
import com.hitss.layer.service.base.PuestoEvaluacionLocalServiceBaseImpl;
import com.hitss.layer.service.persistence.PuestoEvaluacionUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the puesto evaluacion local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hitss.layer.service.PuestoEvaluacionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.base.PuestoEvaluacionLocalServiceBaseImpl
 * @see com.hitss.layer.service.PuestoEvaluacionLocalServiceUtil
 */
public class PuestoEvaluacionLocalServiceImpl
	extends PuestoEvaluacionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.hitss.layer.service.PuestoEvaluacionLocalServiceUtil} to access the puesto evaluacion local service.
	 */
	
	public List<PuestoEvaluacion>  findByS_ALL(Long id) throws SystemException{
		return PuestoEvaluacionUtil.findByS_ALL(id);
	}
	
}
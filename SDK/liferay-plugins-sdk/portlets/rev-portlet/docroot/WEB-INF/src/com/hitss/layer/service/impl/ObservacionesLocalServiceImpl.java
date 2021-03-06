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

import com.hitss.layer.NoSuchObservacionesException;
import com.hitss.layer.model.Observaciones;
import com.hitss.layer.service.base.ObservacionesLocalServiceBaseImpl;
import com.hitss.layer.service.persistence.ObservacionesUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the observaciones local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hitss.layer.service.ObservacionesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.base.ObservacionesLocalServiceBaseImpl
 * @see com.hitss.layer.service.ObservacionesLocalServiceUtil
 */
public class ObservacionesLocalServiceImpl
	extends ObservacionesLocalServiceBaseImpl {
	

	public Observaciones getObservacion(long registroId, String tabla) throws NoSuchObservacionesException, SystemException {
		return  ObservacionesUtil.findByR_T(tabla, registroId);
	}
	
	
	
}
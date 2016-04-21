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

package com.rec.hitss.layer.service.impl;

import java.text.ParseException;

import com.liferay.portal.kernel.exception.SystemException;
import com.rec.hitss.layer.NoSuchRequerimientoRecursoException;
import com.rec.hitss.layer.model.RequerimientoRecurso;
import com.rec.hitss.layer.service.base.RequerimientoRecursoLocalServiceBaseImpl;
import com.rec.hitss.layer.service.persistence.RequerimientoRecursoUtil;

/**
 * The implementation of the requerimiento recurso local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rec.hitss.layer.service.RequerimientoRecursoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.base.RequerimientoRecursoLocalServiceBaseImpl
 * @see com.rec.hitss.layer.service.RequerimientoRecursoLocalServiceUtil
 */
public class RequerimientoRecursoLocalServiceImpl
	extends RequerimientoRecursoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.rec.hitss.layer.service.RequerimientoRecursoLocalServiceUtil} to access the requerimiento recurso local service.
	 */
	
	public 	RequerimientoRecurso findByRequerimientoUnique(Long  solicitudRequerimientoId) throws ParseException, SystemException, NoSuchRequerimientoRecursoException{		
		return RequerimientoRecursoUtil.findByRequerimientoUnique(solicitudRequerimientoId);
	}
		
	
}
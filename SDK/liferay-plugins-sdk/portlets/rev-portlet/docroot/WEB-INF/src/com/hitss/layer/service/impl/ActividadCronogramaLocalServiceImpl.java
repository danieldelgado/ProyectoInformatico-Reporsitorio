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

import com.hitss.layer.model.ActividadCronograma;
import com.hitss.layer.service.base.ActividadCronogramaLocalServiceBaseImpl;
import com.hitss.layer.service.persistence.ActividadCronogramaUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the actividad cronograma local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hitss.layer.service.ActividadCronogramaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.base.ActividadCronogramaLocalServiceBaseImpl
 * @see com.hitss.layer.service.ActividadCronogramaLocalServiceUtil
 */
public class ActividadCronogramaLocalServiceImpl
	extends ActividadCronogramaLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.hitss.layer.service.ActividadCronogramaLocalServiceUtil} to access the actividad cronograma local service.
	 */  
	 
	 public List<ActividadCronograma> getListaActividadCronogramaByActividadCronogramaGrupo(Long actividadCronogramaId, Long cronogramaId,Long  grupoUsuario) throws SystemException{
		 return ActividadCronogramaUtil.findByA_C_G(actividadCronogramaId, cronogramaId, grupoUsuario);
	 }
	 
	 public List<ActividadCronograma> getListaActividadCronogramaByCronogramaGrupo( Long cronogramaId,Long  grupoUsuario) throws SystemException{
		 return ActividadCronogramaUtil.findByC_G( cronogramaId, grupoUsuario);
	 }
	 
	 
	 
}
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

import com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException;
import com.hitss.layer.model.FasePostulacionPuestoEvaluacion;
import com.hitss.layer.service.base.FasePostulacionPuestoEvaluacionLocalServiceBaseImpl;
import com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the fase postulacion puesto evaluacion local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hitss.layer.service.FasePostulacionPuestoEvaluacionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.base.FasePostulacionPuestoEvaluacionLocalServiceBaseImpl
 * @see com.hitss.layer.service.FasePostulacionPuestoEvaluacionLocalServiceUtil
 */
public class FasePostulacionPuestoEvaluacionLocalServiceImpl
	extends FasePostulacionPuestoEvaluacionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.hitss.layer.service.FasePostulacionPuestoEvaluacionLocalServiceUtil} to access the fase postulacion puesto evaluacion local service.
	 */
	
	public List<FasePostulacionPuestoEvaluacion> getFasePostulacionPuestoEvaluacionByFasePostulacionBySolicitud(Long fasePostulacionId , Long solicitudFuncionId ) throws SystemException{
		return FasePostulacionPuestoEvaluacionUtil.findByF_S(fasePostulacionId, solicitudFuncionId);
	}
	
	public List<FasePostulacionPuestoEvaluacion> getFasePostulacionPuestoEvaluacionByFasePostulacion(Long fasePostulacionId ) throws SystemException {
		return FasePostulacionPuestoEvaluacionUtil.findByF(fasePostulacionId);
	}

	public List<FasePostulacionPuestoEvaluacion> getFasePostulacionPuestoEvaluacionBySolicitud( Long solicitudFuncionId ) throws SystemException{
		return FasePostulacionPuestoEvaluacionUtil.findByS(solicitudFuncionId);
	}

	public List<FasePostulacionPuestoEvaluacion> getFasePostulacionPuestoEvaluacionByEvaluacion( Long evaluacionId ) throws SystemException{
		return FasePostulacionPuestoEvaluacionUtil.findByE(evaluacionId);
	}
	
	
}
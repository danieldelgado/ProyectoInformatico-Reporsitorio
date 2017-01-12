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

import com.hitss.layer.NoSuchFasePostulacionException;
import com.hitss.layer.model.FasePostulacion;
import com.hitss.layer.service.FasePostulacionLocalServiceUtil;
import com.hitss.layer.service.base.FasePostulacionLocalServiceBaseImpl;
import com.hitss.layer.service.persistence.FasePostulacionUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * The implementation of the fase postulacion local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rec.hitss.layer.service.FasePostulacionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.base.FasePostulacionLocalServiceBaseImpl
 * @see com.rec.hitss.layer.service.FasePostulacionLocalServiceUtil
 */
public class FasePostulacionLocalServiceImpl
	extends FasePostulacionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.rec.hitss.layer.service.FasePostulacionLocalServiceUtil} to access the fase postulacion local service.
	 */
	

	private static Log _log = LogFactoryUtil.getLog(FasePostulacionServiceImpl.class);
	
	public FasePostulacion getLastPostulacion( Long solicitud, Long usuario ) {
		
	
		DynamicQuery subQuery=DynamicQueryFactoryUtil.forClass(FasePostulacion.class,"child");
		subQuery.setProjection(ProjectionFactoryUtil.max("child.fechamodifica"));
		subQuery.add(PropertyFactoryUtil.forName("child.solicitudRequerimientoId").eq(solicitud));
		subQuery.add(PropertyFactoryUtil.forName("child.usuarioId").eq(usuario));
		subQuery.setLimit(0, 1);

        DynamicQuery dynamicQuery=DynamicQueryFactoryUtil.forClass(FasePostulacion.class,"fase");
        dynamicQuery.add(PropertyFactoryUtil.forName("fase.fechamodifica").eq(subQuery));
        dynamicQuery.add(PropertyFactoryUtil.forName("fase.solicitudRequerimientoId").eq(solicitud));
        dynamicQuery.add(PropertyFactoryUtil.forName("fase.usuarioId").eq(usuario));
		
        try {
			List<FasePostulacion> lstfasePostulacion = FasePostulacionLocalServiceUtil.dynamicQuery(dynamicQuery);
			_log.info("lstfasePostulacion:"+lstfasePostulacion);
			if(!lstfasePostulacion.isEmpty()){
				return lstfasePostulacion.get(0);
			}			
		} catch (SystemException e) {
			_log.error("FasePostulacionServiceImpl getLastPostulacion: "+e.getLocalizedMessage(),e);
		}      
        
		return null;
	}
	
	
	
	public List<FasePostulacion> listaFasesPostulacion( Long solicitud, Long usuario ) {
		
        DynamicQuery dynamicQuery=DynamicQueryFactoryUtil.forClass(FasePostulacion.class,"fase");
        dynamicQuery.add(PropertyFactoryUtil.forName("fase.solicitudRequerimientoId").eq(solicitud));
        dynamicQuery.add(PropertyFactoryUtil.forName("fase.usuarioId").eq(usuario));
		
		
        try {
			List<FasePostulacion> lstfasePostulacion = FasePostulacionLocalServiceUtil.dynamicQuery(dynamicQuery);
			return lstfasePostulacion;		
		} catch (SystemException e) {
			_log.error("FasePostulacionServiceImpl listaFasesPostulacion: "+e.getLocalizedMessage(),e);
		}      
        
		return null;
	}
	
	public FasePostulacion getFasePostuacionByTipo(long solicitudId, long userId, long tipo) {
		try {
			return FasePostulacionUtil.findByS_U_T(solicitudId, userId, tipo);
		} catch ( NoSuchFasePostulacionException e) {
			_log.error("FasePostulacionServiceImpl getFasePostuacionByTipo: "+e.getLocalizedMessage(),e);
		} catch ( Exception e) {
			_log.error("FasePostulacionServiceImpl getFasePostuacionByTipo: "+e.getLocalizedMessage(),e);
		}
		return null;
	}
	
	
	
}
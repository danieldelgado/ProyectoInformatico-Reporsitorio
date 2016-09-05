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

import java.util.Date;
import java.util.List;

import com.hitss.layer.model.SolicitudEvaluacionDesempenno;
import com.hitss.layer.service.SolicitudEvaluacionDesempennoLocalServiceUtil;
import com.hitss.layer.service.base.SolicitudEvaluacionDesempennoLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the solicitud evaluacion desempenno local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hitss.layer.service.SolicitudEvaluacionDesempennoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.base.SolicitudEvaluacionDesempennoLocalServiceBaseImpl
 * @see com.hitss.layer.service.SolicitudEvaluacionDesempennoLocalServiceUtil
 */
public class SolicitudEvaluacionDesempennoLocalServiceImpl
	extends SolicitudEvaluacionDesempennoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.hitss.layer.service.SolicitudEvaluacionDesempennoLocalServiceUtil} to access the solicitud evaluacion desempenno local service.
	 */
	
	
	public 	long listaSolicitudEvaluacionCount( SolicitudEvaluacionDesempenno solicitudEvaluacion, Date fechaEvaluacionInicio, Date fechaEvaluacionFin ) throws ParseException, SystemException{
		DynamicQuery query = query(solicitudEvaluacion, fechaEvaluacionInicio, fechaEvaluacionFin,null, null);
		long count = SolicitudEvaluacionDesempennoLocalServiceUtil.dynamicQueryCount(query);		
		return count;
	}
	
	@SuppressWarnings("unchecked")
	public 	List<SolicitudEvaluacionDesempenno> listaSolicitudEvaluacion( SolicitudEvaluacionDesempenno solicitudEvaluacion, Date fechaEvaluacionInicio, Date fechaEvaluacionFin, int inicio, int fin, String orden, String campoOrden ) throws ParseException, SystemException{
		List<SolicitudEvaluacionDesempenno> listSolicitudRequerimientoPersonals = null;		
		DynamicQuery query = query(solicitudEvaluacion, fechaEvaluacionInicio, fechaEvaluacionFin , orden, campoOrden);
		if(inicio==0&&fin==0){
			listSolicitudRequerimientoPersonals = SolicitudEvaluacionDesempennoLocalServiceUtil.dynamicQuery(query);
		}else{
			listSolicitudRequerimientoPersonals = SolicitudEvaluacionDesempennoLocalServiceUtil.dynamicQuery(query,inicio,fin);
		}
		return listSolicitudRequerimientoPersonals;
	}
		
	private DynamicQuery query(SolicitudEvaluacionDesempenno solicitudEvaluacion, Date fechaEvaluacionInicio, Date fechaEvaluacionFin, String orden, String campoOrden) {
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(SolicitudEvaluacionDesempenno.class);			
		if(Validator.isNotNull(solicitudEvaluacion)) {
			if (Validator.isNotNull(solicitudEvaluacion.getDescripcion())) {
				query.add(PropertyFactoryUtil.forName("descripcion").like(StringPool.PERCENT+solicitudEvaluacion.getDescripcion()+StringPool.PERCENT));
			} 						
			if (Validator.isNotNull(solicitudEvaluacion.getEstado())) {
				query.add(PropertyFactoryUtil.forName("estado").eq(solicitudEvaluacion.getEstado()));
			}
			
		}		
		if(Validator.isNotNull(solicitudEvaluacion)&&Validator.isNotNull(fechaEvaluacionFin)) {
			if (Validator.isNotNull(fechaEvaluacionInicio) && Validator.isNotNull(fechaEvaluacionFin)) {
				query.add(RestrictionsFactoryUtil.between("fechaInicio", fechaEvaluacionInicio, fechaEvaluacionFin ));
			}
		}
		query.add(PropertyFactoryUtil.forName("activo").eq(true));
		query.addOrder(OrderFactoryUtil.desc("fechamodifica"));
		return query;
	}
	
}
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
import java.text.SimpleDateFormat;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.rec.hitss.layer.model.SolicitudRequerimientoPersonal;
import com.rec.hitss.layer.model.SolicitudRequerimientoPersonalClp;
import com.rec.hitss.layer.model.impl.SolicitudRequerimientoPersonalBaseImpl;
import com.rec.hitss.layer.model.impl.SolicitudRequerimientoPersonalCacheModel;
import com.rec.hitss.layer.service.base.SolicitudRequerimientoPersonalLocalServiceBaseImpl;

/**
 * The implementation of the solicitud requerimiento personal local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rec.hitss.layer.service.SolicitudRequerimientoPersonalLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.base.SolicitudRequerimientoPersonalLocalServiceBaseImpl
 * @see com.rec.hitss.layer.service.SolicitudRequerimientoPersonalLocalServiceUtil
 */
public class SolicitudRequerimientoPersonalLocalServiceImpl
	extends SolicitudRequerimientoPersonalLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.rec.hitss.layer.service.SolicitudRequerimientoPersonalLocalServiceUtil} to access the solicitud requerimiento personal local service.
	 */
	
	@SuppressWarnings("unchecked")
	public 	List<SolicitudRequerimientoPersonal> getListaSolicitudesEntrevista( String estado, String puesto, String fechaEmisionInicio, String fechaEmisionFin, String responsable, String tiempoContrato) throws ParseException, SystemException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<SolicitudRequerimientoPersonal> listSolicitudRequerimientoPersonals = null;		
		DynamicQuery activityQuery = solicitudRequerimientoPersonalLocalService.dynamicQuery();		
		if (Validator.isNotNull(puesto)) {
			activityQuery.add(PropertyFactoryUtil.forName("cargo").eq(puesto));
		}
		if (Validator.isNotNull(estado)) {
			activityQuery.add(PropertyFactoryUtil.forName("estado").eq(estado));
		}
		if (Validator.isNotNull(responsable)) {
			activityQuery.add(PropertyFactoryUtil.forName("responsable").eq(responsable));
		}
		if (Validator.isNotNull(tiempoContrato)) {
			activityQuery.add(PropertyFactoryUtil.forName("tiempoContrato").eq(Long.valueOf(tiempoContrato)));
		}
		if (Validator.isNotNull(fechaEmisionInicio) && Validator.isNotNull(fechaEmisionFin)) {
			activityQuery.add(RestrictionsFactoryUtil.between("fechacreamodifica", sdf.parse(fechaEmisionInicio), sdf.parse(fechaEmisionFin)));
		}
		activityQuery.addOrder(OrderFactoryUtil.desc("fechacreamodifica"));
		listSolicitudRequerimientoPersonals = solicitudRequerimientoPersonalLocalService.dynamicQuery(activityQuery);		
		return listSolicitudRequerimientoPersonals;
	}
	
	
	
}
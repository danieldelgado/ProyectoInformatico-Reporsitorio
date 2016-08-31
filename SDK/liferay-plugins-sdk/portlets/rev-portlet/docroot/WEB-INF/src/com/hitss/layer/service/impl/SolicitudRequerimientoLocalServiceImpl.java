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

import com.hitss.layer.NoSuchSolicitudRequerimientoException;
import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.model.impl.SolicitudRequerimientoImpl;
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.hitss.layer.service.base.SolicitudRequerimientoLocalServiceBaseImpl;
import com.hitss.layer.service.persistence.SolicitudRequerimientoUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the solicitud requerimiento local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rec.hitss.layer.service.SolicitudRequerimientoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.base.SolicitudRequerimientoLocalServiceBaseImpl
 * @see com.rec.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil
 */
public class SolicitudRequerimientoLocalServiceImpl
	extends SolicitudRequerimientoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.rec.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil} to access the solicitud requerimiento local service.
	 */
	
	public SolicitudRequerimiento newInstance(){
		return new SolicitudRequerimientoImpl();
	}
	
	public 	long listaSolicitudRequerimientoCount( SolicitudRequerimiento solicitudRequerimiento, Date fechaRegistroInicio, Date fechaRegistrFin ) throws ParseException, SystemException{
		DynamicQuery query = query(solicitudRequerimiento, fechaRegistroInicio, fechaRegistrFin,null, null);
		long count = SolicitudRequerimientoLocalServiceUtil.dynamicQueryCount(query);		
		return count;
	}
	
	@SuppressWarnings("unchecked")
	public 	List<SolicitudRequerimiento> listaSolicitudRequerimiento( SolicitudRequerimiento solicitudRequerimiento, Date fechaRegistroInicio, Date fechaRegistrFin, int inicio, int fin, String orden, String campoOrden ) throws ParseException, SystemException{
		List<SolicitudRequerimiento> listSolicitudRequerimientoPersonals = null;		
		DynamicQuery query = query(solicitudRequerimiento, fechaRegistroInicio, fechaRegistrFin , orden, campoOrden);
		if(inicio==0&&fin==0){
			listSolicitudRequerimientoPersonals = SolicitudRequerimientoLocalServiceUtil.dynamicQuery(query);
		}else{
			listSolicitudRequerimientoPersonals = SolicitudRequerimientoLocalServiceUtil.dynamicQuery(query,inicio,fin);
		}
		return listSolicitudRequerimientoPersonals;
	}
		
	private DynamicQuery query(SolicitudRequerimiento solicitudRequerimiento, Date fechaRegistroInicio, Date fechaRegistrFin, String orden, String campoOrden) {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(SolicitudRequerimiento.class);			
		if(Validator.isNotNull(solicitudRequerimiento)) {
			if (Validator.isNotNull(solicitudRequerimiento.getCategoriaPuestoId())) {
				query.add(PropertyFactoryUtil.forName("categoriaPuestoId").eq(solicitudRequerimiento.getCategoriaPuestoId()));
			} 						
			if (Validator.isNotNull(solicitudRequerimiento.getEstado())) {
				query.add(PropertyFactoryUtil.forName("estado").eq(solicitudRequerimiento.getEstado()));
			}
			
			if (Validator.isNotNull(solicitudRequerimiento.getResponsableRRHH())) {
				query.add(PropertyFactoryUtil.forName("responsableRRHH").eq(solicitudRequerimiento.getResponsableRRHH()));
			}
			
			if (Validator.isNotNull(solicitudRequerimiento.getTiempoContrato())) {
				query.add(PropertyFactoryUtil.forName("tiempoContrato").eq(Long.valueOf(solicitudRequerimiento.getTiempoContrato())));
			}
		}		
		if(Validator.isNotNull(fechaRegistroInicio)&&Validator.isNotNull(fechaRegistrFin)) {
			if (Validator.isNotNull(fechaRegistroInicio) && Validator.isNotNull(fechaRegistrFin)) {
				query.add(RestrictionsFactoryUtil.between("fechamodifica", fechaRegistroInicio, fechaRegistrFin ));
			}
		}
		query.add(PropertyFactoryUtil.forName("activo").eq(true));
		query.addOrder(OrderFactoryUtil.desc("fechamodifica"));
		return query;
	}
	
	
	public SolicitudRequerimiento getSolicitudRequerimientoByContenido(long articulo) throws NoSuchSolicitudRequerimientoException, SystemException{
		return SolicitudRequerimientoUtil.findByC(String.valueOf(articulo));
	}
	
}
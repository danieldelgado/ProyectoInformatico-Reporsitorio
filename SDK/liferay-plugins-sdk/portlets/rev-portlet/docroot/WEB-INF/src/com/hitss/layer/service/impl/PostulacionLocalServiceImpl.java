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

import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.service.PostulacionLocalServiceUtil;
import com.hitss.layer.service.base.PostulacionLocalServiceBaseImpl;
import com.hitss.layer.service.persistence.PostulacionUtil;
import com.hitss.layer.service.persistence.SolicitudRequerimientoUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the postulacion local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rec.hitss.layer.service.PostulacionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.base.PostulacionLocalServiceBaseImpl
 * @see com.rec.hitss.layer.service.PostulacionLocalServiceUtil
 */
public class PostulacionLocalServiceImpl extends PostulacionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.rec.hitss.layer.service.PostulacionLocalServiceUtil} to access the postulacion local service.
	 */
	
	public List<Postulacion> listaPostulacionedsSolicitud(long solicitudRequerimientoId) throws SystemException{			
		List<Postulacion>  lista = PostulacionUtil.findByS(solicitudRequerimientoId);
		return lista;
	}
	
	public List<Postulacion> getPostulacionBySolicitudRequerimeinto() {
		try {
			List<SolicitudRequerimiento> ls = SolicitudRequerimientoUtil.findByA(true);

			if (!ls.isEmpty()) {
				long[] solicitudRequerimientoIds = new long[ls.size()];
				for (int i = 0; i < ls.size(); i++) {
					solicitudRequerimientoIds[i] = ls.get(i).getSolicitudRequerimientoId();
				}
				List<Postulacion> l;
				l = PostulacionUtil.findByS(solicitudRequerimientoIds);

				return l;
			}

		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	public 	long listaSolicitudRequerimientoByPostulacionCount( SolicitudRequerimiento solicitudRequerimiento, Date fechaRegistroInicio, Date fechaRegistrFin ) throws ParseException, SystemException{
		DynamicQuery query = query(solicitudRequerimiento, fechaRegistroInicio, fechaRegistrFin,null, null);
		long count = PostulacionLocalServiceUtil.dynamicQueryCount(query);		
		return count;
	}
	
	@SuppressWarnings("unchecked")
	public 	List<Postulacion> listaSolicitudRequerimientoByPostulacion( SolicitudRequerimiento solicitudRequerimiento, Date fechaRegistroInicio, Date fechaRegistrFin, int inicio, int fin, String orden, String campoOrden ) throws ParseException, SystemException{
		List<Postulacion> listSolicitudRequerimientoPersonals = null;		
		DynamicQuery query = query(solicitudRequerimiento, fechaRegistroInicio, fechaRegistrFin , orden, campoOrden);
		if(inicio==0&&fin==0){
			listSolicitudRequerimientoPersonals = PostulacionLocalServiceUtil.dynamicQuery(query);
		}else{
			listSolicitudRequerimientoPersonals = PostulacionLocalServiceUtil.dynamicQuery(query,inicio,fin);
		}
		return listSolicitudRequerimientoPersonals;
	}
		
	private DynamicQuery query(SolicitudRequerimiento solicitudRequerimiento, Date fechaRegistroInicio, Date fechaRegistrFin, String orden, String campoOrden) {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DynamicQuery subQuery = DynamicQueryFactoryUtil.forClass(SolicitudRequerimiento.class,"child");	
		subQuery.setProjection(ProjectionFactoryUtil.property("child.solicitudRequerimientoId"));		
		if(Validator.isNotNull(solicitudRequerimiento)) {
			if (Validator.isNotNull(solicitudRequerimiento.getCategoriaPuestoId())) {
				subQuery.add(PropertyFactoryUtil.forName("child.categoriaPuestoId").eq(solicitudRequerimiento.getCategoriaPuestoId()));
			} 						
			if (Validator.isNotNull(solicitudRequerimiento.getEstado())) {
				subQuery.add(PropertyFactoryUtil.forName("child.estado").eq(solicitudRequerimiento.getEstado()));
			}
			
			if (Validator.isNotNull(solicitudRequerimiento.getResponsableRRHH())) {
				subQuery.add(PropertyFactoryUtil.forName("child.child.responsableRRHH").eq(solicitudRequerimiento.getResponsableRRHH()));
			}
			
			if (Validator.isNotNull(solicitudRequerimiento.getTiempoContrato())) {
				subQuery.add(PropertyFactoryUtil.forName("child.tiempoContrato").eq(Long.valueOf(solicitudRequerimiento.getTiempoContrato())));
			}
		}		
		if(Validator.isNotNull(fechaRegistroInicio)&&Validator.isNotNull(fechaRegistrFin)) {
			if (Validator.isNotNull(fechaRegistroInicio) && Validator.isNotNull(fechaRegistrFin)) {
				subQuery.add(RestrictionsFactoryUtil.between("child.fechacrea", fechaRegistroInicio, fechaRegistrFin ));
			}
		}
		subQuery.add(PropertyFactoryUtil.forName("child.activo").eq(true));
		
        DynamicQuery query=DynamicQueryFactoryUtil.forClass(Postulacion.class);
        query.add(PropertyFactoryUtil.forName("primaryKey.solicitudRequerimientoId").in(subQuery));
        query.add(PropertyFactoryUtil.forName("seleccionado").eq(false));
		query.addOrder(OrderFactoryUtil.desc("fechamodifica"));		
		return query;
	}
	

	
	
}
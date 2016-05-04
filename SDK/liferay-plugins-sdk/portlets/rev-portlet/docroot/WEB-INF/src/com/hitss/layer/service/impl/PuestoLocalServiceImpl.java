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

import com.hitss.layer.model.Puesto;
import com.hitss.layer.model.impl.PuestoImpl;
import com.hitss.layer.service.PuestoLocalServiceUtil;
import com.hitss.layer.service.base.PuestoLocalServiceBaseImpl;
import com.hitss.layer.service.persistence.PuestoUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the puesto local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rec.hitss.layer.service.PuestoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.base.PuestoLocalServiceBaseImpl
 * @see com.rec.hitss.layer.service.PuestoLocalServiceUtil
 */
public class PuestoLocalServiceImpl extends PuestoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.rec.hitss.layer.service.PuestoLocalServiceUtil} to access the puesto local service.
	 */
	
private static Log _log = LogFactoryUtil.getLog(PuestoLocalServiceImpl.class);
	
	public Puesto newInstance(){
		Puesto p = new PuestoImpl();
		return p;
	}
	
	public List<Puesto> findByfiltroDescripcion(String descripcion) throws SystemException{
		return PuestoUtil.findByfiltroDescripcion( StringPool.PERCENT  + descripcion + StringPool.PERCENT );
	}
	
	@SuppressWarnings("unchecked")
	public List<Puesto> buscarPuesto(Puesto puesto) throws SystemException{
		_log.debug("buscarPuesto");
		_log.debug(puesto);
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(Puesto.class);
		if(Validator.isNotNull(puesto)){
			if(Validator.isNotNull(puesto.getPuestoId())){
				_log.debug(puesto.getPuestoId());
				query.add(PropertyFactoryUtil.forName("puestoId").eq(puesto.getPuestoId()));
			}
			if(Validator.isNotNull(puesto.getDescripcion())){
				_log.debug(puesto.getDescripcion());
				query.add(PropertyFactoryUtil.forName("descripcion").like(StringPool.PERCENT  + puesto.getDescripcion() + StringPool.PERCENT));
			}
			if(Validator.isNotNull(puesto.getCategoria())){
				_log.debug(puesto.getCategoria());
				query.add(PropertyFactoryUtil.forName("categoria").eq(puesto.getCategoria()));
			}
		}
		query.add(PropertyFactoryUtil.forName("activo").eq(true));
		query.addOrder(OrderFactoryUtil.desc("fechacreamodifica"));
		List<Puesto> listaPuesto = PuestoLocalServiceUtil.dynamicQuery(query);	
		_log.debug("listaPuesto");
		_log.debug(listaPuesto);
		return listaPuesto;
	}
	
	
	
}
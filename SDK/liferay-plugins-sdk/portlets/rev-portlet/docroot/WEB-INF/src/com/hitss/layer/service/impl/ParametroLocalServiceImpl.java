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

import com.hitss.layer.model.Parametro;
import com.hitss.layer.model.impl.ParametroImpl;
import com.hitss.layer.service.base.ParametroLocalServiceBaseImpl;
import com.hitss.layer.service.persistence.ParametroFinderUtil;
import com.hitss.layer.service.persistence.ParametroUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringPool;

/**
 * The implementation of the parametro local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.hitss.layer.service.ParametroLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Danielle Delgado
 * @see com.hitss.layer.service.base.ParametroLocalServiceBaseImpl
 * @see com.hitss.layer.service.ParametroLocalServiceUtil
 */
public class ParametroLocalServiceImpl extends ParametroLocalServiceBaseImpl {
	public Parametro newInstance() {
		return new ParametroImpl();
	}

	public List<Parametro> getParametros(){
		return ParametroFinderUtil.getParametros();
	}
	
	
	public List<Parametro> findByparametroPadre(long parametroIdpadre) throws SystemException {
		return ParametroUtil.findByParametroPadre(parametroIdpadre);
	}

	public List<Parametro> findByValor(long parametroIdpadre, String valor) throws SystemException {
		return ParametroUtil.findByValor(parametroIdpadre, StringPool.PERCENT + valor + StringPool.PERCENT);
	}
}
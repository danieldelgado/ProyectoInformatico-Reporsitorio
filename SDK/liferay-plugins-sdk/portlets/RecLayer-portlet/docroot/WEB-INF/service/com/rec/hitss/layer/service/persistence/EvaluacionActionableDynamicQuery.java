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

package com.rec.hitss.layer.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.rec.hitss.layer.model.Evaluacion;
import com.rec.hitss.layer.service.EvaluacionLocalServiceUtil;

/**
 * @author Crossfire
 * @generated
 */
public abstract class EvaluacionActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public EvaluacionActionableDynamicQuery() throws SystemException {
		setBaseLocalService(EvaluacionLocalServiceUtil.getService());
		setClass(Evaluacion.class);

		setClassLoader(com.rec.hitss.layer.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("evaluacionId");
	}
}
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

package com.hitss.layer.service.persistence;

import com.hitss.layer.model.EvaluacionPregunta;
import com.hitss.layer.service.EvaluacionPreguntaLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Danielle Delgado
 * @generated
 */
public abstract class EvaluacionPreguntaActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public EvaluacionPreguntaActionableDynamicQuery() throws SystemException {
		setBaseLocalService(EvaluacionPreguntaLocalServiceUtil.getService());
		setClass(EvaluacionPregunta.class);

		setClassLoader(com.hitss.layer.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("primaryKey.evaluacionId");
	}
}
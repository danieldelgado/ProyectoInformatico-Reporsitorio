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

package com.rec.hitss.layer.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.rec.hitss.layer.model.Requisito;
import com.rec.hitss.layer.service.RequisitoLocalServiceUtil;

/**
 * The extended model base implementation for the Requisito service. Represents a row in the &quot;Requisito&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RequisitoImpl}.
 * </p>
 *
 * @author Crossfire
 * @see RequisitoImpl
 * @see com.rec.hitss.layer.model.Requisito
 * @generated
 */
public abstract class RequisitoBaseImpl extends RequisitoModelImpl
	implements Requisito {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a requisito model instance should use the {@link Requisito} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RequisitoLocalServiceUtil.addRequisito(this);
		}
		else {
			RequisitoLocalServiceUtil.updateRequisito(this);
		}
	}
}
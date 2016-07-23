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

import com.rec.hitss.layer.model.FasePostulacion;
import com.rec.hitss.layer.service.FasePostulacionLocalServiceUtil;

/**
 * The extended model base implementation for the FasePostulacion service. Represents a row in the &quot;FasePostulacion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FasePostulacionImpl}.
 * </p>
 *
 * @author Crossfire
 * @see FasePostulacionImpl
 * @see com.rec.hitss.layer.model.FasePostulacion
 * @generated
 */
public abstract class FasePostulacionBaseImpl extends FasePostulacionModelImpl
	implements FasePostulacion {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a fase postulacion model instance should use the {@link FasePostulacion} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FasePostulacionLocalServiceUtil.addFasePostulacion(this);
		}
		else {
			FasePostulacionLocalServiceUtil.updateFasePostulacion(this);
		}
	}
}
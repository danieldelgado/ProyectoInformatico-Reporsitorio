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

package com.hitss.layer.model.impl;

import com.hitss.layer.model.UsuarioFuncion;
import com.hitss.layer.service.UsuarioFuncionLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the UsuarioFuncion service. Represents a row in the &quot;UsuarioFuncion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UsuarioFuncionImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see UsuarioFuncionImpl
 * @see com.hitss.layer.model.UsuarioFuncion
 * @generated
 */
public abstract class UsuarioFuncionBaseImpl extends UsuarioFuncionModelImpl
	implements UsuarioFuncion {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a usuario funcion model instance should use the {@link UsuarioFuncion} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UsuarioFuncionLocalServiceUtil.addUsuarioFuncion(this);
		}
		else {
			UsuarioFuncionLocalServiceUtil.updateUsuarioFuncion(this);
		}
	}
}
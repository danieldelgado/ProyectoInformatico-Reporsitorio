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

package com.hitss.layer.service.base;

import com.hitss.layer.service.UsuarioServiceUtil;

import java.util.Arrays;

/**
 * @author Danielle Delgado
 * @generated
 */
public class UsuarioServiceClpInvoker {
	public UsuarioServiceClpInvoker() {
		_methodName198 = "getBeanIdentifier";

		_methodParameterTypes198 = new String[] {  };

		_methodName199 = "setBeanIdentifier";

		_methodParameterTypes199 = new String[] { "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName198.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes198, parameterTypes)) {
			return UsuarioServiceUtil.getBeanIdentifier();
		}

		if (_methodName199.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes199, parameterTypes)) {
			UsuarioServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName198;
	private String[] _methodParameterTypes198;
	private String _methodName199;
	private String[] _methodParameterTypes199;
}
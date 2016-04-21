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

package com.rec.hitss.layer.service.base;

import com.rec.hitss.layer.service.PlanAccionServiceUtil;

import java.util.Arrays;

/**
 * @author Crossfire
 * @generated
 */
public class PlanAccionServiceClpInvoker {
	public PlanAccionServiceClpInvoker() {
		_methodName192 = "getBeanIdentifier";

		_methodParameterTypes192 = new String[] {  };

		_methodName193 = "setBeanIdentifier";

		_methodParameterTypes193 = new String[] { "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName192.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes192, parameterTypes)) {
			return PlanAccionServiceUtil.getBeanIdentifier();
		}

		if (_methodName193.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes193, parameterTypes)) {
			PlanAccionServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName192;
	private String[] _methodParameterTypes192;
	private String _methodName193;
	private String[] _methodParameterTypes193;
}
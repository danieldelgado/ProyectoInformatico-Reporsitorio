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

import com.hitss.layer.service.PuestoLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Danielle Delgado
 * @generated
 */
public class PuestoLocalServiceClpInvoker {
	public PuestoLocalServiceClpInvoker() {
		_methodName0 = "addPuesto";

		_methodParameterTypes0 = new String[] { "com.hitss.layer.model.Puesto" };

		_methodName1 = "createPuesto";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deletePuesto";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deletePuesto";

		_methodParameterTypes3 = new String[] { "com.hitss.layer.model.Puesto" };

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchPuesto";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPuesto";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getPuestos";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getPuestosCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updatePuesto";

		_methodParameterTypes15 = new String[] { "com.hitss.layer.model.Puesto" };

		_methodName214 = "getBeanIdentifier";

		_methodParameterTypes214 = new String[] {  };

		_methodName215 = "setBeanIdentifier";

		_methodParameterTypes215 = new String[] { "java.lang.String" };

		_methodName220 = "newInstance";

		_methodParameterTypes220 = new String[] {  };

		_methodName221 = "findByfiltroDescripcion";

		_methodParameterTypes221 = new String[] { "java.lang.String" };

		_methodName222 = "buscarPuesto";

		_methodParameterTypes222 = new String[] { "com.hitss.layer.model.Puesto" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return PuestoLocalServiceUtil.addPuesto((com.hitss.layer.model.Puesto)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return PuestoLocalServiceUtil.createPuesto(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return PuestoLocalServiceUtil.deletePuesto(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return PuestoLocalServiceUtil.deletePuesto((com.hitss.layer.model.Puesto)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return PuestoLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return PuestoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return PuestoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return PuestoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return PuestoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return PuestoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return PuestoLocalServiceUtil.fetchPuesto(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return PuestoLocalServiceUtil.getPuesto(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return PuestoLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return PuestoLocalServiceUtil.getPuestos(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return PuestoLocalServiceUtil.getPuestosCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return PuestoLocalServiceUtil.updatePuesto((com.hitss.layer.model.Puesto)arguments[0]);
		}

		if (_methodName214.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes214, parameterTypes)) {
			return PuestoLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName215.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes215, parameterTypes)) {
			PuestoLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName220.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes220, parameterTypes)) {
			return PuestoLocalServiceUtil.newInstance();
		}

		if (_methodName221.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes221, parameterTypes)) {
			return PuestoLocalServiceUtil.findByfiltroDescripcion((java.lang.String)arguments[0]);
		}

		if (_methodName222.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes222, parameterTypes)) {
			return PuestoLocalServiceUtil.buscarPuesto((com.hitss.layer.model.Puesto)arguments[0]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName214;
	private String[] _methodParameterTypes214;
	private String _methodName215;
	private String[] _methodParameterTypes215;
	private String _methodName220;
	private String[] _methodParameterTypes220;
	private String _methodName221;
	private String[] _methodParameterTypes221;
	private String _methodName222;
	private String[] _methodParameterTypes222;
}
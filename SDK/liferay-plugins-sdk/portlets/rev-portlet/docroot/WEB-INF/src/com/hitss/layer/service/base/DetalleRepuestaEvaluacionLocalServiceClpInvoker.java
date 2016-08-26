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

import com.hitss.layer.service.DetalleRepuestaEvaluacionLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Danielle Delgado
 * @generated
 */
public class DetalleRepuestaEvaluacionLocalServiceClpInvoker {
	public DetalleRepuestaEvaluacionLocalServiceClpInvoker() {
		_methodName0 = "addDetalleRepuestaEvaluacion";

		_methodParameterTypes0 = new String[] {
				"com.hitss.layer.model.DetalleRepuestaEvaluacion"
			};

		_methodName1 = "createDetalleRepuestaEvaluacion";

		_methodParameterTypes1 = new String[] {
				"com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK"
			};

		_methodName2 = "deleteDetalleRepuestaEvaluacion";

		_methodParameterTypes2 = new String[] {
				"com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK"
			};

		_methodName3 = "deleteDetalleRepuestaEvaluacion";

		_methodParameterTypes3 = new String[] {
				"com.hitss.layer.model.DetalleRepuestaEvaluacion"
			};

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

		_methodName10 = "fetchDetalleRepuestaEvaluacion";

		_methodParameterTypes10 = new String[] {
				"com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK"
			};

		_methodName11 = "getDetalleRepuestaEvaluacion";

		_methodParameterTypes11 = new String[] {
				"com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK"
			};

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getDetalleRepuestaEvaluacions";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getDetalleRepuestaEvaluacionsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateDetalleRepuestaEvaluacion";

		_methodParameterTypes15 = new String[] {
				"com.hitss.layer.model.DetalleRepuestaEvaluacion"
			};

		_methodName210 = "getBeanIdentifier";

		_methodParameterTypes210 = new String[] {  };

		_methodName211 = "setBeanIdentifier";

		_methodParameterTypes211 = new String[] { "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.addDetalleRepuestaEvaluacion((com.hitss.layer.model.DetalleRepuestaEvaluacion)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.createDetalleRepuestaEvaluacion((com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK)arguments[0]);
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.deleteDetalleRepuestaEvaluacion((com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK)arguments[0]);
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.deleteDetalleRepuestaEvaluacion((com.hitss.layer.model.DetalleRepuestaEvaluacion)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.fetchDetalleRepuestaEvaluacion((com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK)arguments[0]);
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.getDetalleRepuestaEvaluacion((com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.getDetalleRepuestaEvaluacions(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.getDetalleRepuestaEvaluacionsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.updateDetalleRepuestaEvaluacion((com.hitss.layer.model.DetalleRepuestaEvaluacion)arguments[0]);
		}

		if (_methodName210.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes210, parameterTypes)) {
			return DetalleRepuestaEvaluacionLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName211.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes211, parameterTypes)) {
			DetalleRepuestaEvaluacionLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
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
	private String _methodName210;
	private String[] _methodParameterTypes210;
	private String _methodName211;
	private String[] _methodParameterTypes211;
}
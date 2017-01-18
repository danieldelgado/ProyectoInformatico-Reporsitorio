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

import com.hitss.layer.service.FasePostulacionPuestoEvaluacionLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Danielle Delgado
 * @generated
 */
public class FasePostulacionPuestoEvaluacionLocalServiceClpInvoker {
	public FasePostulacionPuestoEvaluacionLocalServiceClpInvoker() {
		_methodName0 = "addFasePostulacionPuestoEvaluacion";

		_methodParameterTypes0 = new String[] {
				"com.hitss.layer.model.FasePostulacionPuestoEvaluacion"
			};

		_methodName1 = "createFasePostulacionPuestoEvaluacion";

		_methodParameterTypes1 = new String[] {
				"com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK"
			};

		_methodName2 = "deleteFasePostulacionPuestoEvaluacion";

		_methodParameterTypes2 = new String[] {
				"com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK"
			};

		_methodName3 = "deleteFasePostulacionPuestoEvaluacion";

		_methodParameterTypes3 = new String[] {
				"com.hitss.layer.model.FasePostulacionPuestoEvaluacion"
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

		_methodName10 = "fetchFasePostulacionPuestoEvaluacion";

		_methodParameterTypes10 = new String[] {
				"com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK"
			};

		_methodName11 = "getFasePostulacionPuestoEvaluacion";

		_methodParameterTypes11 = new String[] {
				"com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK"
			};

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getFasePostulacionPuestoEvaluacions";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getFasePostulacionPuestoEvaluacionsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateFasePostulacionPuestoEvaluacion";

		_methodParameterTypes15 = new String[] {
				"com.hitss.layer.model.FasePostulacionPuestoEvaluacion"
			};

		_methodName236 = "getBeanIdentifier";

		_methodParameterTypes236 = new String[] {  };

		_methodName237 = "setBeanIdentifier";

		_methodParameterTypes237 = new String[] { "java.lang.String" };

		_methodName242 = "getFasePostulacionPuestoEvaluacionBySolicitud";

		_methodParameterTypes242 = new String[] { "java.lang.Long" };

		_methodName243 = "getFasePostulacionPuestoEvaluacionByEvaluacion";

		_methodParameterTypes243 = new String[] { "java.lang.Long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.addFasePostulacionPuestoEvaluacion((com.hitss.layer.model.FasePostulacionPuestoEvaluacion)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.createFasePostulacionPuestoEvaluacion((com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK)arguments[0]);
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.deleteFasePostulacionPuestoEvaluacion((com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK)arguments[0]);
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.deleteFasePostulacionPuestoEvaluacion((com.hitss.layer.model.FasePostulacionPuestoEvaluacion)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.fetchFasePostulacionPuestoEvaluacion((com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK)arguments[0]);
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.getFasePostulacionPuestoEvaluacion((com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.getFasePostulacionPuestoEvaluacions(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.getFasePostulacionPuestoEvaluacionsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.updateFasePostulacionPuestoEvaluacion((com.hitss.layer.model.FasePostulacionPuestoEvaluacion)arguments[0]);
		}

		if (_methodName236.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes236, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName237.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes237, parameterTypes)) {
			FasePostulacionPuestoEvaluacionLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName242.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes242, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.getFasePostulacionPuestoEvaluacionBySolicitud((java.lang.Long)arguments[0]);
		}

		if (_methodName243.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes243, parameterTypes)) {
			return FasePostulacionPuestoEvaluacionLocalServiceUtil.getFasePostulacionPuestoEvaluacionByEvaluacion((java.lang.Long)arguments[0]);
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
	private String _methodName236;
	private String[] _methodParameterTypes236;
	private String _methodName237;
	private String[] _methodParameterTypes237;
	private String _methodName242;
	private String[] _methodParameterTypes242;
	private String _methodName243;
	private String[] _methodParameterTypes243;
}
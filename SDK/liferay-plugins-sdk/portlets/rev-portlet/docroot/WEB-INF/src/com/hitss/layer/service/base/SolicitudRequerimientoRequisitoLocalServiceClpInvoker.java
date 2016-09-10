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

import com.hitss.layer.service.SolicitudRequerimientoRequisitoLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Danielle Delgado
 * @generated
 */
public class SolicitudRequerimientoRequisitoLocalServiceClpInvoker {
	public SolicitudRequerimientoRequisitoLocalServiceClpInvoker() {
		_methodName0 = "addSolicitudRequerimientoRequisito";

		_methodParameterTypes0 = new String[] {
				"com.hitss.layer.model.SolicitudRequerimientoRequisito"
			};

		_methodName1 = "createSolicitudRequerimientoRequisito";

		_methodParameterTypes1 = new String[] {
				"com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK"
			};

		_methodName2 = "deleteSolicitudRequerimientoRequisito";

		_methodParameterTypes2 = new String[] {
				"com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK"
			};

		_methodName3 = "deleteSolicitudRequerimientoRequisito";

		_methodParameterTypes3 = new String[] {
				"com.hitss.layer.model.SolicitudRequerimientoRequisito"
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

		_methodName10 = "fetchSolicitudRequerimientoRequisito";

		_methodParameterTypes10 = new String[] {
				"com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK"
			};

		_methodName11 = "getSolicitudRequerimientoRequisito";

		_methodParameterTypes11 = new String[] {
				"com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK"
			};

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getSolicitudRequerimientoRequisitos";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getSolicitudRequerimientoRequisitosCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateSolicitudRequerimientoRequisito";

		_methodParameterTypes15 = new String[] {
				"com.hitss.layer.model.SolicitudRequerimientoRequisito"
			};

		_methodName224 = "getBeanIdentifier";

		_methodParameterTypes224 = new String[] {  };

		_methodName225 = "setBeanIdentifier";

		_methodParameterTypes225 = new String[] { "java.lang.String" };

		_methodName230 = "getListaSolicitudRequerimientoRequisito";

		_methodParameterTypes230 = new String[] { "long", "long" };

		_methodName231 = "getListaSolicitudRequerimientoRequisito";

		_methodParameterTypes231 = new String[] { "long" };

		_methodName232 = "getListaSolicitudRequerimientoRequisitoActivo";

		_methodParameterTypes232 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.addSolicitudRequerimientoRequisito((com.hitss.layer.model.SolicitudRequerimientoRequisito)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.createSolicitudRequerimientoRequisito((com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK)arguments[0]);
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.deleteSolicitudRequerimientoRequisito((com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK)arguments[0]);
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.deleteSolicitudRequerimientoRequisito((com.hitss.layer.model.SolicitudRequerimientoRequisito)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.fetchSolicitudRequerimientoRequisito((com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK)arguments[0]);
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.getSolicitudRequerimientoRequisito((com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.getSolicitudRequerimientoRequisitos(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.getSolicitudRequerimientoRequisitosCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.updateSolicitudRequerimientoRequisito((com.hitss.layer.model.SolicitudRequerimientoRequisito)arguments[0]);
		}

		if (_methodName224.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes224, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName225.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes225, parameterTypes)) {
			SolicitudRequerimientoRequisitoLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName230.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes230, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.getListaSolicitudRequerimientoRequisito(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName231.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes231, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.getListaSolicitudRequerimientoRequisito(((Long)arguments[0]).longValue());
		}

		if (_methodName232.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes232, parameterTypes)) {
			return SolicitudRequerimientoRequisitoLocalServiceUtil.getListaSolicitudRequerimientoRequisitoActivo(((Long)arguments[0]).longValue());
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
	private String _methodName224;
	private String[] _methodParameterTypes224;
	private String _methodName225;
	private String[] _methodParameterTypes225;
	private String _methodName230;
	private String[] _methodParameterTypes230;
	private String _methodName231;
	private String[] _methodParameterTypes231;
	private String _methodName232;
	private String[] _methodParameterTypes232;
}
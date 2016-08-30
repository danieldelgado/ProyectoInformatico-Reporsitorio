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

import com.hitss.layer.service.SolicitudRequerimientoFuncionLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Danielle Delgado
 * @generated
 */
public class SolicitudRequerimientoFuncionLocalServiceClpInvoker {
	public SolicitudRequerimientoFuncionLocalServiceClpInvoker() {
		_methodName0 = "addSolicitudRequerimientoFuncion";

		_methodParameterTypes0 = new String[] {
				"com.hitss.layer.model.SolicitudRequerimientoFuncion"
			};

		_methodName1 = "createSolicitudRequerimientoFuncion";

		_methodParameterTypes1 = new String[] {
				"com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK"
			};

		_methodName2 = "deleteSolicitudRequerimientoFuncion";

		_methodParameterTypes2 = new String[] {
				"com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK"
			};

		_methodName3 = "deleteSolicitudRequerimientoFuncion";

		_methodParameterTypes3 = new String[] {
				"com.hitss.layer.model.SolicitudRequerimientoFuncion"
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

		_methodName10 = "fetchSolicitudRequerimientoFuncion";

		_methodParameterTypes10 = new String[] {
				"com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK"
			};

		_methodName11 = "getSolicitudRequerimientoFuncion";

		_methodParameterTypes11 = new String[] {
				"com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK"
			};

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getSolicitudRequerimientoFuncions";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getSolicitudRequerimientoFuncionsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateSolicitudRequerimientoFuncion";

		_methodParameterTypes15 = new String[] {
				"com.hitss.layer.model.SolicitudRequerimientoFuncion"
			};

		_methodName222 = "getBeanIdentifier";

		_methodParameterTypes222 = new String[] {  };

		_methodName223 = "setBeanIdentifier";

		_methodParameterTypes223 = new String[] { "java.lang.String" };

		_methodName228 = "getListaSolicitudRequerimientoFuncion";

		_methodParameterTypes228 = new String[] { "long", "long" };

		_methodName229 = "getListaSolicitudRequerimientoFuncion";

		_methodParameterTypes229 = new String[] { "long" };

		_methodName230 = "getListaSolicitudRequerimientoFuncionActivo";

		_methodParameterTypes230 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.addSolicitudRequerimientoFuncion((com.hitss.layer.model.SolicitudRequerimientoFuncion)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.createSolicitudRequerimientoFuncion((com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK)arguments[0]);
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.deleteSolicitudRequerimientoFuncion((com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK)arguments[0]);
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.deleteSolicitudRequerimientoFuncion((com.hitss.layer.model.SolicitudRequerimientoFuncion)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.fetchSolicitudRequerimientoFuncion((com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK)arguments[0]);
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.getSolicitudRequerimientoFuncion((com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.getSolicitudRequerimientoFuncions(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.getSolicitudRequerimientoFuncionsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.updateSolicitudRequerimientoFuncion((com.hitss.layer.model.SolicitudRequerimientoFuncion)arguments[0]);
		}

		if (_methodName222.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes222, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName223.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes223, parameterTypes)) {
			SolicitudRequerimientoFuncionLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName228.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes228, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.getListaSolicitudRequerimientoFuncion(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName229.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes229, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.getListaSolicitudRequerimientoFuncion(((Long)arguments[0]).longValue());
		}

		if (_methodName230.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes230, parameterTypes)) {
			return SolicitudRequerimientoFuncionLocalServiceUtil.getListaSolicitudRequerimientoFuncionActivo(((Long)arguments[0]).longValue());
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
	private String _methodName222;
	private String[] _methodParameterTypes222;
	private String _methodName223;
	private String[] _methodParameterTypes223;
	private String _methodName228;
	private String[] _methodParameterTypes228;
	private String _methodName229;
	private String[] _methodParameterTypes229;
	private String _methodName230;
	private String[] _methodParameterTypes230;
}
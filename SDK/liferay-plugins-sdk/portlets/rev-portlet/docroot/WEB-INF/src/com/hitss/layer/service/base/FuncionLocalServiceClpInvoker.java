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

import com.hitss.layer.service.FuncionLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Danielle Delgado
 * @generated
 */
public class FuncionLocalServiceClpInvoker {
	public FuncionLocalServiceClpInvoker() {
		_methodName0 = "addFuncion";

		_methodParameterTypes0 = new String[] { "com.hitss.layer.model.Funcion" };

		_methodName1 = "createFuncion";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteFuncion";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteFuncion";

		_methodParameterTypes3 = new String[] { "com.hitss.layer.model.Funcion" };

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

		_methodName10 = "fetchFuncion";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getFuncion";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getFuncions";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getFuncionsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateFuncion";

		_methodParameterTypes15 = new String[] { "com.hitss.layer.model.Funcion" };

		_methodName16 = "addSolicitudRequerimientoFuncion";

		_methodParameterTypes16 = new String[] { "long", "long" };

		_methodName17 = "addSolicitudRequerimientoFuncion";

		_methodParameterTypes17 = new String[] {
				"long", "com.hitss.layer.model.Funcion"
			};

		_methodName18 = "addSolicitudRequerimientoFuncions";

		_methodParameterTypes18 = new String[] { "long", "long[][]" };

		_methodName19 = "addSolicitudRequerimientoFuncions";

		_methodParameterTypes19 = new String[] { "long", "java.util.List" };

		_methodName20 = "clearSolicitudRequerimientoFuncions";

		_methodParameterTypes20 = new String[] { "long" };

		_methodName21 = "deleteSolicitudRequerimientoFuncion";

		_methodParameterTypes21 = new String[] { "long", "long" };

		_methodName22 = "deleteSolicitudRequerimientoFuncion";

		_methodParameterTypes22 = new String[] {
				"long", "com.hitss.layer.model.Funcion"
			};

		_methodName23 = "deleteSolicitudRequerimientoFuncions";

		_methodParameterTypes23 = new String[] { "long", "long[][]" };

		_methodName24 = "deleteSolicitudRequerimientoFuncions";

		_methodParameterTypes24 = new String[] { "long", "java.util.List" };

		_methodName25 = "getSolicitudRequerimientoFuncions";

		_methodParameterTypes25 = new String[] { "long" };

		_methodName26 = "getSolicitudRequerimientoFuncions";

		_methodParameterTypes26 = new String[] { "long", "int", "int" };

		_methodName27 = "getSolicitudRequerimientoFuncions";

		_methodParameterTypes27 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName28 = "getSolicitudRequerimientoFuncionsCount";

		_methodParameterTypes28 = new String[] { "long" };

		_methodName29 = "hasSolicitudRequerimientoFuncion";

		_methodParameterTypes29 = new String[] { "long", "long" };

		_methodName30 = "hasSolicitudRequerimientoFuncions";

		_methodParameterTypes30 = new String[] { "long" };

		_methodName31 = "setSolicitudRequerimientoFuncions";

		_methodParameterTypes31 = new String[] { "long", "long[][]" };

		_methodName230 = "getBeanIdentifier";

		_methodParameterTypes230 = new String[] {  };

		_methodName231 = "setBeanIdentifier";

		_methodParameterTypes231 = new String[] { "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return FuncionLocalServiceUtil.addFuncion((com.hitss.layer.model.Funcion)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return FuncionLocalServiceUtil.createFuncion(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return FuncionLocalServiceUtil.deleteFuncion(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return FuncionLocalServiceUtil.deleteFuncion((com.hitss.layer.model.Funcion)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return FuncionLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return FuncionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return FuncionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return FuncionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return FuncionLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return FuncionLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return FuncionLocalServiceUtil.fetchFuncion(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return FuncionLocalServiceUtil.getFuncion(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return FuncionLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return FuncionLocalServiceUtil.getFuncions(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return FuncionLocalServiceUtil.getFuncionsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return FuncionLocalServiceUtil.updateFuncion((com.hitss.layer.model.Funcion)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			FuncionLocalServiceUtil.addSolicitudRequerimientoFuncion(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			FuncionLocalServiceUtil.addSolicitudRequerimientoFuncion(((Long)arguments[0]).longValue(),
				(com.hitss.layer.model.Funcion)arguments[1]);

			return null;
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			FuncionLocalServiceUtil.addSolicitudRequerimientoFuncions(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			FuncionLocalServiceUtil.addSolicitudRequerimientoFuncions(((Long)arguments[0]).longValue(),
				(java.util.List<com.hitss.layer.model.Funcion>)arguments[1]);

			return null;
		}

		if (_methodName20.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
			FuncionLocalServiceUtil.clearSolicitudRequerimientoFuncions(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName21.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
			FuncionLocalServiceUtil.deleteSolicitudRequerimientoFuncion(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName22.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
			FuncionLocalServiceUtil.deleteSolicitudRequerimientoFuncion(((Long)arguments[0]).longValue(),
				(com.hitss.layer.model.Funcion)arguments[1]);

			return null;
		}

		if (_methodName23.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
			FuncionLocalServiceUtil.deleteSolicitudRequerimientoFuncions(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			FuncionLocalServiceUtil.deleteSolicitudRequerimientoFuncions(((Long)arguments[0]).longValue(),
				(java.util.List<com.hitss.layer.model.Funcion>)arguments[1]);

			return null;
		}

		if (_methodName25.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
			return FuncionLocalServiceUtil.getSolicitudRequerimientoFuncions(((Long)arguments[0]).longValue());
		}

		if (_methodName26.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
			return FuncionLocalServiceUtil.getSolicitudRequerimientoFuncions(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName27.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
			return FuncionLocalServiceUtil.getSolicitudRequerimientoFuncions(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName28.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
			return FuncionLocalServiceUtil.getSolicitudRequerimientoFuncionsCount(((Long)arguments[0]).longValue());
		}

		if (_methodName29.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
			return FuncionLocalServiceUtil.hasSolicitudRequerimientoFuncion(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return FuncionLocalServiceUtil.hasSolicitudRequerimientoFuncions(((Long)arguments[0]).longValue());
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			FuncionLocalServiceUtil.setSolicitudRequerimientoFuncions(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName230.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes230, parameterTypes)) {
			return FuncionLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName231.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes231, parameterTypes)) {
			FuncionLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

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
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
	private String _methodName22;
	private String[] _methodParameterTypes22;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
	private String _methodName26;
	private String[] _methodParameterTypes26;
	private String _methodName27;
	private String[] _methodParameterTypes27;
	private String _methodName28;
	private String[] _methodParameterTypes28;
	private String _methodName29;
	private String[] _methodParameterTypes29;
	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName230;
	private String[] _methodParameterTypes230;
	private String _methodName231;
	private String[] _methodParameterTypes231;
}
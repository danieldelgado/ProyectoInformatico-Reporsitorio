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

package com.rec.hitss.layer.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.rec.hitss.layer.service.ClpSerializer;
import com.rec.hitss.layer.service.FuncionRequerimientoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class FuncionRequerimientoClp extends BaseModelImpl<FuncionRequerimiento>
	implements FuncionRequerimiento {
	public FuncionRequerimientoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return FuncionRequerimiento.class;
	}

	@Override
	public String getModelClassName() {
		return FuncionRequerimiento.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _funcionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFuncionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _funcionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("funcionId", getFuncionId());
		attributes.put("requerimientoRecursoId", getRequerimientoRecursoId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long funcionId = (Long)attributes.get("funcionId");

		if (funcionId != null) {
			setFuncionId(funcionId);
		}

		Long requerimientoRecursoId = (Long)attributes.get(
				"requerimientoRecursoId");

		if (requerimientoRecursoId != null) {
			setRequerimientoRecursoId(requerimientoRecursoId);
		}
	}

	@Override
	public long getFuncionId() {
		return _funcionId;
	}

	@Override
	public void setFuncionId(long funcionId) {
		_funcionId = funcionId;

		if (_funcionRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _funcionRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setFuncionId", long.class);

				method.invoke(_funcionRequerimientoRemoteModel, funcionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRequerimientoRecursoId() {
		return _requerimientoRecursoId;
	}

	@Override
	public void setRequerimientoRecursoId(long requerimientoRecursoId) {
		_requerimientoRecursoId = requerimientoRecursoId;

		if (_funcionRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _funcionRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setRequerimientoRecursoId",
						long.class);

				method.invoke(_funcionRequerimientoRemoteModel,
					requerimientoRecursoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFuncionRequerimientoRemoteModel() {
		return _funcionRequerimientoRemoteModel;
	}

	public void setFuncionRequerimientoRemoteModel(
		BaseModel<?> funcionRequerimientoRemoteModel) {
		_funcionRequerimientoRemoteModel = funcionRequerimientoRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _funcionRequerimientoRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_funcionRequerimientoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FuncionRequerimientoLocalServiceUtil.addFuncionRequerimiento(this);
		}
		else {
			FuncionRequerimientoLocalServiceUtil.updateFuncionRequerimiento(this);
		}
	}

	@Override
	public FuncionRequerimiento toEscapedModel() {
		return (FuncionRequerimiento)ProxyUtil.newProxyInstance(FuncionRequerimiento.class.getClassLoader(),
			new Class[] { FuncionRequerimiento.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FuncionRequerimientoClp clone = new FuncionRequerimientoClp();

		clone.setFuncionId(getFuncionId());
		clone.setRequerimientoRecursoId(getRequerimientoRecursoId());

		return clone;
	}

	@Override
	public int compareTo(FuncionRequerimiento funcionRequerimiento) {
		long primaryKey = funcionRequerimiento.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FuncionRequerimientoClp)) {
			return false;
		}

		FuncionRequerimientoClp funcionRequerimiento = (FuncionRequerimientoClp)obj;

		long primaryKey = funcionRequerimiento.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{funcionId=");
		sb.append(getFuncionId());
		sb.append(", requerimientoRecursoId=");
		sb.append(getRequerimientoRecursoId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.FuncionRequerimiento");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>funcionId</column-name><column-value><![CDATA[");
		sb.append(getFuncionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requerimientoRecursoId</column-name><column-value><![CDATA[");
		sb.append(getRequerimientoRecursoId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _funcionId;
	private long _requerimientoRecursoId;
	private BaseModel<?> _funcionRequerimientoRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
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
import com.rec.hitss.layer.service.FuncionUsuarioLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class FuncionUsuarioClp extends BaseModelImpl<FuncionUsuario>
	implements FuncionUsuario {
	public FuncionUsuarioClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return FuncionUsuario.class;
	}

	@Override
	public String getModelClassName() {
		return FuncionUsuario.class.getName();
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
		attributes.put("usuarioHitssId", getUsuarioHitssId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long funcionId = (Long)attributes.get("funcionId");

		if (funcionId != null) {
			setFuncionId(funcionId);
		}

		Long usuarioHitssId = (Long)attributes.get("usuarioHitssId");

		if (usuarioHitssId != null) {
			setUsuarioHitssId(usuarioHitssId);
		}
	}

	@Override
	public long getFuncionId() {
		return _funcionId;
	}

	@Override
	public void setFuncionId(long funcionId) {
		_funcionId = funcionId;

		if (_funcionUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _funcionUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setFuncionId", long.class);

				method.invoke(_funcionUsuarioRemoteModel, funcionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUsuarioHitssId() {
		return _usuarioHitssId;
	}

	@Override
	public void setUsuarioHitssId(long usuarioHitssId) {
		_usuarioHitssId = usuarioHitssId;

		if (_funcionUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _funcionUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioHitssId", long.class);

				method.invoke(_funcionUsuarioRemoteModel, usuarioHitssId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFuncionUsuarioRemoteModel() {
		return _funcionUsuarioRemoteModel;
	}

	public void setFuncionUsuarioRemoteModel(
		BaseModel<?> funcionUsuarioRemoteModel) {
		_funcionUsuarioRemoteModel = funcionUsuarioRemoteModel;
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

		Class<?> remoteModelClass = _funcionUsuarioRemoteModel.getClass();

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

		Object returnValue = method.invoke(_funcionUsuarioRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FuncionUsuarioLocalServiceUtil.addFuncionUsuario(this);
		}
		else {
			FuncionUsuarioLocalServiceUtil.updateFuncionUsuario(this);
		}
	}

	@Override
	public FuncionUsuario toEscapedModel() {
		return (FuncionUsuario)ProxyUtil.newProxyInstance(FuncionUsuario.class.getClassLoader(),
			new Class[] { FuncionUsuario.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FuncionUsuarioClp clone = new FuncionUsuarioClp();

		clone.setFuncionId(getFuncionId());
		clone.setUsuarioHitssId(getUsuarioHitssId());

		return clone;
	}

	@Override
	public int compareTo(FuncionUsuario funcionUsuario) {
		long primaryKey = funcionUsuario.getPrimaryKey();

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

		if (!(obj instanceof FuncionUsuarioClp)) {
			return false;
		}

		FuncionUsuarioClp funcionUsuario = (FuncionUsuarioClp)obj;

		long primaryKey = funcionUsuario.getPrimaryKey();

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
		sb.append(", usuarioHitssId=");
		sb.append(getUsuarioHitssId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.FuncionUsuario");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>funcionId</column-name><column-value><![CDATA[");
		sb.append(getFuncionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioHitssId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioHitssId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _funcionId;
	private long _usuarioHitssId;
	private BaseModel<?> _funcionUsuarioRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
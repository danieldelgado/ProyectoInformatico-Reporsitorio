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
import com.liferay.portal.util.PortalUtil;

import com.rec.hitss.layer.service.ClpSerializer;
import com.rec.hitss.layer.service.UsuarioRequisitoLocalServiceUtil;
import com.rec.hitss.layer.service.persistence.UsuarioRequisitoPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class UsuarioRequisitoClp extends BaseModelImpl<UsuarioRequisito>
	implements UsuarioRequisito {
	public UsuarioRequisitoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return UsuarioRequisito.class;
	}

	@Override
	public String getModelClassName() {
		return UsuarioRequisito.class.getName();
	}

	@Override
	public UsuarioRequisitoPK getPrimaryKey() {
		return new UsuarioRequisitoPK(_userId, _requisitoId);
	}

	@Override
	public void setPrimaryKey(UsuarioRequisitoPK primaryKey) {
		setUserId(primaryKey.userId);
		setRequisitoId(primaryKey.requisitoId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new UsuarioRequisitoPK(_userId, _requisitoId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((UsuarioRequisitoPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
		attributes.put("requisitoId", getRequisitoId());
		attributes.put("cumplerequisito", getCumplerequisito());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long requisitoId = (Long)attributes.get("requisitoId");

		if (requisitoId != null) {
			setRequisitoId(requisitoId);
		}

		Boolean cumplerequisito = (Boolean)attributes.get("cumplerequisito");

		if (cumplerequisito != null) {
			setCumplerequisito(cumplerequisito);
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_usuarioRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_usuarioRequisitoRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getRequisitoId() {
		return _requisitoId;
	}

	@Override
	public void setRequisitoId(long requisitoId) {
		_requisitoId = requisitoId;

		if (_usuarioRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setRequisitoId", long.class);

				method.invoke(_usuarioRequisitoRemoteModel, requisitoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getCumplerequisito() {
		return _cumplerequisito;
	}

	@Override
	public boolean isCumplerequisito() {
		return _cumplerequisito;
	}

	@Override
	public void setCumplerequisito(boolean cumplerequisito) {
		_cumplerequisito = cumplerequisito;

		if (_usuarioRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setCumplerequisito",
						boolean.class);

				method.invoke(_usuarioRequisitoRemoteModel, cumplerequisito);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getUsuarioRequisitoRemoteModel() {
		return _usuarioRequisitoRemoteModel;
	}

	public void setUsuarioRequisitoRemoteModel(
		BaseModel<?> usuarioRequisitoRemoteModel) {
		_usuarioRequisitoRemoteModel = usuarioRequisitoRemoteModel;
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

		Class<?> remoteModelClass = _usuarioRequisitoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_usuarioRequisitoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UsuarioRequisitoLocalServiceUtil.addUsuarioRequisito(this);
		}
		else {
			UsuarioRequisitoLocalServiceUtil.updateUsuarioRequisito(this);
		}
	}

	@Override
	public UsuarioRequisito toEscapedModel() {
		return (UsuarioRequisito)ProxyUtil.newProxyInstance(UsuarioRequisito.class.getClassLoader(),
			new Class[] { UsuarioRequisito.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UsuarioRequisitoClp clone = new UsuarioRequisitoClp();

		clone.setUserId(getUserId());
		clone.setRequisitoId(getRequisitoId());
		clone.setCumplerequisito(getCumplerequisito());

		return clone;
	}

	@Override
	public int compareTo(UsuarioRequisito usuarioRequisito) {
		UsuarioRequisitoPK primaryKey = usuarioRequisito.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UsuarioRequisitoClp)) {
			return false;
		}

		UsuarioRequisitoClp usuarioRequisito = (UsuarioRequisitoClp)obj;

		UsuarioRequisitoPK primaryKey = usuarioRequisito.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
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
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{userId=");
		sb.append(getUserId());
		sb.append(", requisitoId=");
		sb.append(getRequisitoId());
		sb.append(", cumplerequisito=");
		sb.append(getCumplerequisito());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.UsuarioRequisito");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requisitoId</column-name><column-value><![CDATA[");
		sb.append(getRequisitoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cumplerequisito</column-name><column-value><![CDATA[");
		sb.append(getCumplerequisito());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _userId;
	private String _userUuid;
	private long _requisitoId;
	private boolean _cumplerequisito;
	private BaseModel<?> _usuarioRequisitoRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
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
import com.rec.hitss.layer.service.UsuarioHitssLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class UsuarioHitssClp extends BaseModelImpl<UsuarioHitss>
	implements UsuarioHitss {
	public UsuarioHitssClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return UsuarioHitss.class;
	}

	@Override
	public String getModelClassName() {
		return UsuarioHitss.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _usuarioHitssId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUsuarioHitssId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _usuarioHitssId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("usuarioHitssId", getUsuarioHitssId());
		attributes.put("userId", getUserId());
		attributes.put("userUuId", getUserUuId());
		attributes.put("actividadPlanId", getActividadPlanId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long usuarioHitssId = (Long)attributes.get("usuarioHitssId");

		if (usuarioHitssId != null) {
			setUsuarioHitssId(usuarioHitssId);
		}

		String userId = (String)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userUuId = (String)attributes.get("userUuId");

		if (userUuId != null) {
			setUserUuId(userUuId);
		}

		Long actividadPlanId = (Long)attributes.get("actividadPlanId");

		if (actividadPlanId != null) {
			setActividadPlanId(actividadPlanId);
		}
	}

	@Override
	public long getUsuarioHitssId() {
		return _usuarioHitssId;
	}

	@Override
	public void setUsuarioHitssId(long usuarioHitssId) {
		_usuarioHitssId = usuarioHitssId;

		if (_usuarioHitssRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioHitssRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioHitssId", long.class);

				method.invoke(_usuarioHitssRemoteModel, usuarioHitssId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(String userId) {
		_userId = userId;

		if (_usuarioHitssRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioHitssRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", String.class);

				method.invoke(_usuarioHitssRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuId() {
		return _userUuId;
	}

	@Override
	public void setUserUuId(String userUuId) {
		_userUuId = userUuId;

		if (_usuarioHitssRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioHitssRemoteModel.getClass();

				Method method = clazz.getMethod("setUserUuId", String.class);

				method.invoke(_usuarioHitssRemoteModel, userUuId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getActividadPlanId() {
		return _actividadPlanId;
	}

	@Override
	public void setActividadPlanId(long actividadPlanId) {
		_actividadPlanId = actividadPlanId;

		if (_usuarioHitssRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioHitssRemoteModel.getClass();

				Method method = clazz.getMethod("setActividadPlanId", long.class);

				method.invoke(_usuarioHitssRemoteModel, actividadPlanId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getUsuarioHitssRemoteModel() {
		return _usuarioHitssRemoteModel;
	}

	public void setUsuarioHitssRemoteModel(BaseModel<?> usuarioHitssRemoteModel) {
		_usuarioHitssRemoteModel = usuarioHitssRemoteModel;
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

		Class<?> remoteModelClass = _usuarioHitssRemoteModel.getClass();

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

		Object returnValue = method.invoke(_usuarioHitssRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UsuarioHitssLocalServiceUtil.addUsuarioHitss(this);
		}
		else {
			UsuarioHitssLocalServiceUtil.updateUsuarioHitss(this);
		}
	}

	@Override
	public UsuarioHitss toEscapedModel() {
		return (UsuarioHitss)ProxyUtil.newProxyInstance(UsuarioHitss.class.getClassLoader(),
			new Class[] { UsuarioHitss.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UsuarioHitssClp clone = new UsuarioHitssClp();

		clone.setUsuarioHitssId(getUsuarioHitssId());
		clone.setUserId(getUserId());
		clone.setUserUuId(getUserUuId());
		clone.setActividadPlanId(getActividadPlanId());

		return clone;
	}

	@Override
	public int compareTo(UsuarioHitss usuarioHitss) {
		long primaryKey = usuarioHitss.getPrimaryKey();

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

		if (!(obj instanceof UsuarioHitssClp)) {
			return false;
		}

		UsuarioHitssClp usuarioHitss = (UsuarioHitssClp)obj;

		long primaryKey = usuarioHitss.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{usuarioHitssId=");
		sb.append(getUsuarioHitssId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userUuId=");
		sb.append(getUserUuId());
		sb.append(", actividadPlanId=");
		sb.append(getActividadPlanId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.UsuarioHitss");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>usuarioHitssId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioHitssId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userUuId</column-name><column-value><![CDATA[");
		sb.append(getUserUuId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actividadPlanId</column-name><column-value><![CDATA[");
		sb.append(getActividadPlanId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _usuarioHitssId;
	private String _userId;
	private String _userUuId;
	private long _actividadPlanId;
	private BaseModel<?> _usuarioHitssRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
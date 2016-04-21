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
import com.rec.hitss.layer.service.UsuarioGrupoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class UsuarioGrupoClp extends BaseModelImpl<UsuarioGrupo>
	implements UsuarioGrupo {
	public UsuarioGrupoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return UsuarioGrupo.class;
	}

	@Override
	public String getModelClassName() {
		return UsuarioGrupo.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _userGroupId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserGroupId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userGroupId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userGroupId", getUserGroupId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("prioridadEquiposId", getPrioridadEquiposId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userGroupId = (Long)attributes.get("userGroupId");

		if (userGroupId != null) {
			setUserGroupId(userGroupId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long prioridadEquiposId = (Long)attributes.get("prioridadEquiposId");

		if (prioridadEquiposId != null) {
			setPrioridadEquiposId(prioridadEquiposId);
		}
	}

	@Override
	public long getUserGroupId() {
		return _userGroupId;
	}

	@Override
	public void setUserGroupId(long userGroupId) {
		_userGroupId = userGroupId;

		if (_usuarioGrupoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioGrupoRemoteModel.getClass();

				Method method = clazz.getMethod("setUserGroupId", long.class);

				method.invoke(_usuarioGrupoRemoteModel, userGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_usuarioGrupoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioGrupoRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_usuarioGrupoRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_usuarioGrupoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioGrupoRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_usuarioGrupoRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPrioridadEquiposId() {
		return _prioridadEquiposId;
	}

	@Override
	public void setPrioridadEquiposId(long prioridadEquiposId) {
		_prioridadEquiposId = prioridadEquiposId;

		if (_usuarioGrupoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioGrupoRemoteModel.getClass();

				Method method = clazz.getMethod("setPrioridadEquiposId",
						long.class);

				method.invoke(_usuarioGrupoRemoteModel, prioridadEquiposId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getUsuarioGrupoRemoteModel() {
		return _usuarioGrupoRemoteModel;
	}

	public void setUsuarioGrupoRemoteModel(BaseModel<?> usuarioGrupoRemoteModel) {
		_usuarioGrupoRemoteModel = usuarioGrupoRemoteModel;
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

		Class<?> remoteModelClass = _usuarioGrupoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_usuarioGrupoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UsuarioGrupoLocalServiceUtil.addUsuarioGrupo(this);
		}
		else {
			UsuarioGrupoLocalServiceUtil.updateUsuarioGrupo(this);
		}
	}

	@Override
	public UsuarioGrupo toEscapedModel() {
		return (UsuarioGrupo)ProxyUtil.newProxyInstance(UsuarioGrupo.class.getClassLoader(),
			new Class[] { UsuarioGrupo.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UsuarioGrupoClp clone = new UsuarioGrupoClp();

		clone.setUserGroupId(getUserGroupId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setPrioridadEquiposId(getPrioridadEquiposId());

		return clone;
	}

	@Override
	public int compareTo(UsuarioGrupo usuarioGrupo) {
		long primaryKey = usuarioGrupo.getPrimaryKey();

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

		if (!(obj instanceof UsuarioGrupoClp)) {
			return false;
		}

		UsuarioGrupoClp usuarioGrupo = (UsuarioGrupoClp)obj;

		long primaryKey = usuarioGrupo.getPrimaryKey();

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

		sb.append("{userGroupId=");
		sb.append(getUserGroupId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", prioridadEquiposId=");
		sb.append(getPrioridadEquiposId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.UsuarioGrupo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userGroupId</column-name><column-value><![CDATA[");
		sb.append(getUserGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>prioridadEquiposId</column-name><column-value><![CDATA[");
		sb.append(getPrioridadEquiposId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _userGroupId;
	private long _groupId;
	private long _companyId;
	private long _prioridadEquiposId;
	private BaseModel<?> _usuarioGrupoRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
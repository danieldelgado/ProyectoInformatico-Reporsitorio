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
import com.rec.hitss.layer.service.EtiquetaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class EtiquetaClp extends BaseModelImpl<Etiqueta> implements Etiqueta {
	public EtiquetaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Etiqueta.class;
	}

	@Override
	public String getModelClassName() {
		return Etiqueta.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _etiquetaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEtiquetaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _etiquetaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("etiquetaId", getEtiquetaId());
		attributes.put("tagId", getTagId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long etiquetaId = (Long)attributes.get("etiquetaId");

		if (etiquetaId != null) {
			setEtiquetaId(etiquetaId);
		}

		Long tagId = (Long)attributes.get("tagId");

		if (tagId != null) {
			setTagId(tagId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}
	}

	@Override
	public long getEtiquetaId() {
		return _etiquetaId;
	}

	@Override
	public void setEtiquetaId(long etiquetaId) {
		_etiquetaId = etiquetaId;

		if (_etiquetaRemoteModel != null) {
			try {
				Class<?> clazz = _etiquetaRemoteModel.getClass();

				Method method = clazz.getMethod("setEtiquetaId", long.class);

				method.invoke(_etiquetaRemoteModel, etiquetaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTagId() {
		return _tagId;
	}

	@Override
	public void setTagId(long tagId) {
		_tagId = tagId;

		if (_etiquetaRemoteModel != null) {
			try {
				Class<?> clazz = _etiquetaRemoteModel.getClass();

				Method method = clazz.getMethod("setTagId", long.class);

				method.invoke(_etiquetaRemoteModel, tagId);
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

		if (_etiquetaRemoteModel != null) {
			try {
				Class<?> clazz = _etiquetaRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_etiquetaRemoteModel, groupId);
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

		if (_etiquetaRemoteModel != null) {
			try {
				Class<?> clazz = _etiquetaRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_etiquetaRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEtiquetaRemoteModel() {
		return _etiquetaRemoteModel;
	}

	public void setEtiquetaRemoteModel(BaseModel<?> etiquetaRemoteModel) {
		_etiquetaRemoteModel = etiquetaRemoteModel;
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

		Class<?> remoteModelClass = _etiquetaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_etiquetaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EtiquetaLocalServiceUtil.addEtiqueta(this);
		}
		else {
			EtiquetaLocalServiceUtil.updateEtiqueta(this);
		}
	}

	@Override
	public Etiqueta toEscapedModel() {
		return (Etiqueta)ProxyUtil.newProxyInstance(Etiqueta.class.getClassLoader(),
			new Class[] { Etiqueta.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EtiquetaClp clone = new EtiquetaClp();

		clone.setEtiquetaId(getEtiquetaId());
		clone.setTagId(getTagId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());

		return clone;
	}

	@Override
	public int compareTo(Etiqueta etiqueta) {
		long primaryKey = etiqueta.getPrimaryKey();

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

		if (!(obj instanceof EtiquetaClp)) {
			return false;
		}

		EtiquetaClp etiqueta = (EtiquetaClp)obj;

		long primaryKey = etiqueta.getPrimaryKey();

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

		sb.append("{etiquetaId=");
		sb.append(getEtiquetaId());
		sb.append(", tagId=");
		sb.append(getTagId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.Etiqueta");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>etiquetaId</column-name><column-value><![CDATA[");
		sb.append(getEtiquetaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tagId</column-name><column-value><![CDATA[");
		sb.append(getTagId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _etiquetaId;
	private long _tagId;
	private long _groupId;
	private long _companyId;
	private BaseModel<?> _etiquetaRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
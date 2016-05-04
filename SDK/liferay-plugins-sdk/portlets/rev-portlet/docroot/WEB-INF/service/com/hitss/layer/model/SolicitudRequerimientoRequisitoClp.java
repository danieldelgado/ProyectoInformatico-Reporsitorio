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

package com.hitss.layer.model;

import com.hitss.layer.service.ClpSerializer;
import com.hitss.layer.service.SolicitudRequerimientoRequisitoLocalServiceUtil;
import com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Danielle Delgado
 */
public class SolicitudRequerimientoRequisitoClp extends BaseModelImpl<SolicitudRequerimientoRequisito>
	implements SolicitudRequerimientoRequisito {
	public SolicitudRequerimientoRequisitoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return SolicitudRequerimientoRequisito.class;
	}

	@Override
	public String getModelClassName() {
		return SolicitudRequerimientoRequisito.class.getName();
	}

	@Override
	public SolicitudRequerimientoRequisitoPK getPrimaryKey() {
		return new SolicitudRequerimientoRequisitoPK(_solicitudRequerimientoId,
			_requisitosId);
	}

	@Override
	public void setPrimaryKey(SolicitudRequerimientoRequisitoPK primaryKey) {
		setSolicitudRequerimientoId(primaryKey.solicitudRequerimientoId);
		setRequisitosId(primaryKey.requisitosId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new SolicitudRequerimientoRequisitoPK(_solicitudRequerimientoId,
			_requisitosId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((SolicitudRequerimientoRequisitoPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudRequerimientoId", getSolicitudRequerimientoId());
		attributes.put("requisitosId", getRequisitosId());
		attributes.put("exigible", getExigible());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long solicitudRequerimientoId = (Long)attributes.get(
				"solicitudRequerimientoId");

		if (solicitudRequerimientoId != null) {
			setSolicitudRequerimientoId(solicitudRequerimientoId);
		}

		Long requisitosId = (Long)attributes.get("requisitosId");

		if (requisitosId != null) {
			setRequisitosId(requisitosId);
		}

		Boolean exigible = (Boolean)attributes.get("exigible");

		if (exigible != null) {
			setExigible(exigible);
		}
	}

	@Override
	public long getSolicitudRequerimientoId() {
		return _solicitudRequerimientoId;
	}

	@Override
	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_solicitudRequerimientoId = solicitudRequerimientoId;

		if (_solicitudRequerimientoRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setSolicitudRequerimientoId",
						long.class);

				method.invoke(_solicitudRequerimientoRequisitoRemoteModel,
					solicitudRequerimientoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRequisitosId() {
		return _requisitosId;
	}

	@Override
	public void setRequisitosId(long requisitosId) {
		_requisitosId = requisitosId;

		if (_solicitudRequerimientoRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setRequisitosId", long.class);

				method.invoke(_solicitudRequerimientoRequisitoRemoteModel,
					requisitosId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getExigible() {
		return _exigible;
	}

	@Override
	public boolean isExigible() {
		return _exigible;
	}

	@Override
	public void setExigible(boolean exigible) {
		_exigible = exigible;

		if (_solicitudRequerimientoRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setExigible", boolean.class);

				method.invoke(_solicitudRequerimientoRequisitoRemoteModel,
					exigible);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSolicitudRequerimientoRequisitoRemoteModel() {
		return _solicitudRequerimientoRequisitoRemoteModel;
	}

	public void setSolicitudRequerimientoRequisitoRemoteModel(
		BaseModel<?> solicitudRequerimientoRequisitoRemoteModel) {
		_solicitudRequerimientoRequisitoRemoteModel = solicitudRequerimientoRequisitoRemoteModel;
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

		Class<?> remoteModelClass = _solicitudRequerimientoRequisitoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_solicitudRequerimientoRequisitoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SolicitudRequerimientoRequisitoLocalServiceUtil.addSolicitudRequerimientoRequisito(this);
		}
		else {
			SolicitudRequerimientoRequisitoLocalServiceUtil.updateSolicitudRequerimientoRequisito(this);
		}
	}

	@Override
	public SolicitudRequerimientoRequisito toEscapedModel() {
		return (SolicitudRequerimientoRequisito)ProxyUtil.newProxyInstance(SolicitudRequerimientoRequisito.class.getClassLoader(),
			new Class[] { SolicitudRequerimientoRequisito.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SolicitudRequerimientoRequisitoClp clone = new SolicitudRequerimientoRequisitoClp();

		clone.setSolicitudRequerimientoId(getSolicitudRequerimientoId());
		clone.setRequisitosId(getRequisitosId());
		clone.setExigible(getExigible());

		return clone;
	}

	@Override
	public int compareTo(
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito) {
		SolicitudRequerimientoRequisitoPK primaryKey = solicitudRequerimientoRequisito.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SolicitudRequerimientoRequisitoClp)) {
			return false;
		}

		SolicitudRequerimientoRequisitoClp solicitudRequerimientoRequisito = (SolicitudRequerimientoRequisitoClp)obj;

		SolicitudRequerimientoRequisitoPK primaryKey = solicitudRequerimientoRequisito.getPrimaryKey();

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

		sb.append("{solicitudRequerimientoId=");
		sb.append(getSolicitudRequerimientoId());
		sb.append(", requisitosId=");
		sb.append(getRequisitosId());
		sb.append(", exigible=");
		sb.append(getExigible());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.SolicitudRequerimientoRequisito");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>solicitudRequerimientoId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudRequerimientoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requisitosId</column-name><column-value><![CDATA[");
		sb.append(getRequisitosId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exigible</column-name><column-value><![CDATA[");
		sb.append(getExigible());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _solicitudRequerimientoId;
	private long _requisitosId;
	private boolean _exigible;
	private BaseModel<?> _solicitudRequerimientoRequisitoRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
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
import com.hitss.layer.service.UsuarioEvaluacionLocalServiceUtil;
import com.hitss.layer.service.persistence.UsuarioEvaluacionPK;

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
public class UsuarioEvaluacionClp extends BaseModelImpl<UsuarioEvaluacion>
	implements UsuarioEvaluacion {
	public UsuarioEvaluacionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return UsuarioEvaluacion.class;
	}

	@Override
	public String getModelClassName() {
		return UsuarioEvaluacion.class.getName();
	}

	@Override
	public UsuarioEvaluacionPK getPrimaryKey() {
		return new UsuarioEvaluacionPK(_actividadCronogramaId, _usuarioId,
			_evaluacionId);
	}

	@Override
	public void setPrimaryKey(UsuarioEvaluacionPK primaryKey) {
		setActividadCronogramaId(primaryKey.actividadCronogramaId);
		setUsuarioId(primaryKey.usuarioId);
		setEvaluacionId(primaryKey.evaluacionId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new UsuarioEvaluacionPK(_actividadCronogramaId, _usuarioId,
			_evaluacionId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((UsuarioEvaluacionPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("actividadCronogramaId", getActividadCronogramaId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("evaluacionId", getEvaluacionId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long actividadCronogramaId = (Long)attributes.get(
				"actividadCronogramaId");

		if (actividadCronogramaId != null) {
			setActividadCronogramaId(actividadCronogramaId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}
	}

	@Override
	public long getActividadCronogramaId() {
		return _actividadCronogramaId;
	}

	@Override
	public void setActividadCronogramaId(long actividadCronogramaId) {
		_actividadCronogramaId = actividadCronogramaId;

		if (_usuarioEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setActividadCronogramaId",
						long.class);

				method.invoke(_usuarioEvaluacionRemoteModel,
					actividadCronogramaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUsuarioId() {
		return _usuarioId;
	}

	@Override
	public void setUsuarioId(long usuarioId) {
		_usuarioId = usuarioId;

		if (_usuarioEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioId", long.class);

				method.invoke(_usuarioEvaluacionRemoteModel, usuarioId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEvaluacionId() {
		return _evaluacionId;
	}

	@Override
	public void setEvaluacionId(long evaluacionId) {
		_evaluacionId = evaluacionId;

		if (_usuarioEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setEvaluacionId", long.class);

				method.invoke(_usuarioEvaluacionRemoteModel, evaluacionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getUsuarioEvaluacionRemoteModel() {
		return _usuarioEvaluacionRemoteModel;
	}

	public void setUsuarioEvaluacionRemoteModel(
		BaseModel<?> usuarioEvaluacionRemoteModel) {
		_usuarioEvaluacionRemoteModel = usuarioEvaluacionRemoteModel;
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

		Class<?> remoteModelClass = _usuarioEvaluacionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_usuarioEvaluacionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UsuarioEvaluacionLocalServiceUtil.addUsuarioEvaluacion(this);
		}
		else {
			UsuarioEvaluacionLocalServiceUtil.updateUsuarioEvaluacion(this);
		}
	}

	@Override
	public UsuarioEvaluacion toEscapedModel() {
		return (UsuarioEvaluacion)ProxyUtil.newProxyInstance(UsuarioEvaluacion.class.getClassLoader(),
			new Class[] { UsuarioEvaluacion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UsuarioEvaluacionClp clone = new UsuarioEvaluacionClp();

		clone.setActividadCronogramaId(getActividadCronogramaId());
		clone.setUsuarioId(getUsuarioId());
		clone.setEvaluacionId(getEvaluacionId());

		return clone;
	}

	@Override
	public int compareTo(UsuarioEvaluacion usuarioEvaluacion) {
		UsuarioEvaluacionPK primaryKey = usuarioEvaluacion.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UsuarioEvaluacionClp)) {
			return false;
		}

		UsuarioEvaluacionClp usuarioEvaluacion = (UsuarioEvaluacionClp)obj;

		UsuarioEvaluacionPK primaryKey = usuarioEvaluacion.getPrimaryKey();

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

		sb.append("{actividadCronogramaId=");
		sb.append(getActividadCronogramaId());
		sb.append(", usuarioId=");
		sb.append(getUsuarioId());
		sb.append(", evaluacionId=");
		sb.append(getEvaluacionId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.UsuarioEvaluacion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>actividadCronogramaId</column-name><column-value><![CDATA[");
		sb.append(getActividadCronogramaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evaluacionId</column-name><column-value><![CDATA[");
		sb.append(getEvaluacionId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _actividadCronogramaId;
	private long _usuarioId;
	private long _evaluacionId;
	private BaseModel<?> _usuarioEvaluacionRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
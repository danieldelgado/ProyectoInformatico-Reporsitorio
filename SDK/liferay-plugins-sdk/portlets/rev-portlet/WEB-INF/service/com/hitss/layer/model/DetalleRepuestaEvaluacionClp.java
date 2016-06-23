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
import com.hitss.layer.service.DetalleRepuestaEvaluacionLocalServiceUtil;
import com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK;

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
public class DetalleRepuestaEvaluacionClp extends BaseModelImpl<DetalleRepuestaEvaluacion>
	implements DetalleRepuestaEvaluacion {
	public DetalleRepuestaEvaluacionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DetalleRepuestaEvaluacion.class;
	}

	@Override
	public String getModelClassName() {
		return DetalleRepuestaEvaluacion.class.getName();
	}

	@Override
	public DetalleRepuestaEvaluacionPK getPrimaryKey() {
		return new DetalleRepuestaEvaluacionPK(_detalleRepuestaEvaluacionId,
			_evaluacionId, _usuarioId);
	}

	@Override
	public void setPrimaryKey(DetalleRepuestaEvaluacionPK primaryKey) {
		setDetalleRepuestaEvaluacionId(primaryKey.detalleRepuestaEvaluacionId);
		setEvaluacionId(primaryKey.evaluacionId);
		setUsuarioId(primaryKey.usuarioId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new DetalleRepuestaEvaluacionPK(_detalleRepuestaEvaluacionId,
			_evaluacionId, _usuarioId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((DetalleRepuestaEvaluacionPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("detalleRepuestaEvaluacionId",
			getDetalleRepuestaEvaluacionId());
		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("respuestaSeleccionada", getRespuestaSeleccionada());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long detalleRepuestaEvaluacionId = (Long)attributes.get(
				"detalleRepuestaEvaluacionId");

		if (detalleRepuestaEvaluacionId != null) {
			setDetalleRepuestaEvaluacionId(detalleRepuestaEvaluacionId);
		}

		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Long respuestaSeleccionada = (Long)attributes.get(
				"respuestaSeleccionada");

		if (respuestaSeleccionada != null) {
			setRespuestaSeleccionada(respuestaSeleccionada);
		}
	}

	@Override
	public long getDetalleRepuestaEvaluacionId() {
		return _detalleRepuestaEvaluacionId;
	}

	@Override
	public void setDetalleRepuestaEvaluacionId(long detalleRepuestaEvaluacionId) {
		_detalleRepuestaEvaluacionId = detalleRepuestaEvaluacionId;

		if (_detalleRepuestaEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _detalleRepuestaEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setDetalleRepuestaEvaluacionId",
						long.class);

				method.invoke(_detalleRepuestaEvaluacionRemoteModel,
					detalleRepuestaEvaluacionId);
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

		if (_detalleRepuestaEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _detalleRepuestaEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setEvaluacionId", long.class);

				method.invoke(_detalleRepuestaEvaluacionRemoteModel,
					evaluacionId);
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

		if (_detalleRepuestaEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _detalleRepuestaEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioId", long.class);

				method.invoke(_detalleRepuestaEvaluacionRemoteModel, usuarioId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescripcion() {
		return _descripcion;
	}

	@Override
	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;

		if (_detalleRepuestaEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _detalleRepuestaEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_detalleRepuestaEvaluacionRemoteModel, descripcion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRespuestaSeleccionada() {
		return _respuestaSeleccionada;
	}

	@Override
	public void setRespuestaSeleccionada(long respuestaSeleccionada) {
		_respuestaSeleccionada = respuestaSeleccionada;

		if (_detalleRepuestaEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _detalleRepuestaEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setRespuestaSeleccionada",
						long.class);

				method.invoke(_detalleRepuestaEvaluacionRemoteModel,
					respuestaSeleccionada);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDetalleRepuestaEvaluacionRemoteModel() {
		return _detalleRepuestaEvaluacionRemoteModel;
	}

	public void setDetalleRepuestaEvaluacionRemoteModel(
		BaseModel<?> detalleRepuestaEvaluacionRemoteModel) {
		_detalleRepuestaEvaluacionRemoteModel = detalleRepuestaEvaluacionRemoteModel;
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

		Class<?> remoteModelClass = _detalleRepuestaEvaluacionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_detalleRepuestaEvaluacionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DetalleRepuestaEvaluacionLocalServiceUtil.addDetalleRepuestaEvaluacion(this);
		}
		else {
			DetalleRepuestaEvaluacionLocalServiceUtil.updateDetalleRepuestaEvaluacion(this);
		}
	}

	@Override
	public DetalleRepuestaEvaluacion toEscapedModel() {
		return (DetalleRepuestaEvaluacion)ProxyUtil.newProxyInstance(DetalleRepuestaEvaluacion.class.getClassLoader(),
			new Class[] { DetalleRepuestaEvaluacion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DetalleRepuestaEvaluacionClp clone = new DetalleRepuestaEvaluacionClp();

		clone.setDetalleRepuestaEvaluacionId(getDetalleRepuestaEvaluacionId());
		clone.setEvaluacionId(getEvaluacionId());
		clone.setUsuarioId(getUsuarioId());
		clone.setDescripcion(getDescripcion());
		clone.setRespuestaSeleccionada(getRespuestaSeleccionada());

		return clone;
	}

	@Override
	public int compareTo(DetalleRepuestaEvaluacion detalleRepuestaEvaluacion) {
		DetalleRepuestaEvaluacionPK primaryKey = detalleRepuestaEvaluacion.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DetalleRepuestaEvaluacionClp)) {
			return false;
		}

		DetalleRepuestaEvaluacionClp detalleRepuestaEvaluacion = (DetalleRepuestaEvaluacionClp)obj;

		DetalleRepuestaEvaluacionPK primaryKey = detalleRepuestaEvaluacion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{detalleRepuestaEvaluacionId=");
		sb.append(getDetalleRepuestaEvaluacionId());
		sb.append(", evaluacionId=");
		sb.append(getEvaluacionId());
		sb.append(", usuarioId=");
		sb.append(getUsuarioId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", respuestaSeleccionada=");
		sb.append(getRespuestaSeleccionada());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.DetalleRepuestaEvaluacion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>detalleRepuestaEvaluacionId</column-name><column-value><![CDATA[");
		sb.append(getDetalleRepuestaEvaluacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evaluacionId</column-name><column-value><![CDATA[");
		sb.append(getEvaluacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>respuestaSeleccionada</column-name><column-value><![CDATA[");
		sb.append(getRespuestaSeleccionada());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _detalleRepuestaEvaluacionId;
	private long _evaluacionId;
	private long _usuarioId;
	private String _descripcion;
	private long _respuestaSeleccionada;
	private BaseModel<?> _detalleRepuestaEvaluacionRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
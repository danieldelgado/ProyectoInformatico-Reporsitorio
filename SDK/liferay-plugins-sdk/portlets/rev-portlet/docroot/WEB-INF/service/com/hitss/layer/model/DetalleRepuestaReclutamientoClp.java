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
import com.hitss.layer.service.DetalleRepuestaReclutamientoLocalServiceUtil;
import com.hitss.layer.service.persistence.DetalleRepuestaReclutamientoPK;

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
public class DetalleRepuestaReclutamientoClp extends BaseModelImpl<DetalleRepuestaReclutamiento>
	implements DetalleRepuestaReclutamiento {
	public DetalleRepuestaReclutamientoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DetalleRepuestaReclutamiento.class;
	}

	@Override
	public String getModelClassName() {
		return DetalleRepuestaReclutamiento.class.getName();
	}

	@Override
	public DetalleRepuestaReclutamientoPK getPrimaryKey() {
		return new DetalleRepuestaReclutamientoPK(_detalleRepsuestaId,
			_usuarioId, _evaluacionId, _preguntaId);
	}

	@Override
	public void setPrimaryKey(DetalleRepuestaReclutamientoPK primaryKey) {
		setDetalleRepsuestaId(primaryKey.detalleRepsuestaId);
		setUsuarioId(primaryKey.usuarioId);
		setEvaluacionId(primaryKey.evaluacionId);
		setPreguntaId(primaryKey.preguntaId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new DetalleRepuestaReclutamientoPK(_detalleRepsuestaId,
			_usuarioId, _evaluacionId, _preguntaId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((DetalleRepuestaReclutamientoPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("detalleRepsuestaId", getDetalleRepsuestaId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("preguntaId", getPreguntaId());
		attributes.put("respuestaSeleccionada", getRespuestaSeleccionada());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long detalleRepsuestaId = (Long)attributes.get("detalleRepsuestaId");

		if (detalleRepsuestaId != null) {
			setDetalleRepsuestaId(detalleRepsuestaId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Long preguntaId = (Long)attributes.get("preguntaId");

		if (preguntaId != null) {
			setPreguntaId(preguntaId);
		}

		Integer respuestaSeleccionada = (Integer)attributes.get(
				"respuestaSeleccionada");

		if (respuestaSeleccionada != null) {
			setRespuestaSeleccionada(respuestaSeleccionada);
		}
	}

	@Override
	public long getDetalleRepsuestaId() {
		return _detalleRepsuestaId;
	}

	@Override
	public void setDetalleRepsuestaId(long detalleRepsuestaId) {
		_detalleRepsuestaId = detalleRepsuestaId;

		if (_detalleRepuestaReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _detalleRepuestaReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setDetalleRepsuestaId",
						long.class);

				method.invoke(_detalleRepuestaReclutamientoRemoteModel,
					detalleRepsuestaId);
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

		if (_detalleRepuestaReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _detalleRepuestaReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioId", long.class);

				method.invoke(_detalleRepuestaReclutamientoRemoteModel,
					usuarioId);
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

		if (_detalleRepuestaReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _detalleRepuestaReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setEvaluacionId", long.class);

				method.invoke(_detalleRepuestaReclutamientoRemoteModel,
					evaluacionId);
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

		if (_detalleRepuestaReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _detalleRepuestaReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_detalleRepuestaReclutamientoRemoteModel,
					descripcion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPreguntaId() {
		return _preguntaId;
	}

	@Override
	public void setPreguntaId(long preguntaId) {
		_preguntaId = preguntaId;

		if (_detalleRepuestaReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _detalleRepuestaReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setPreguntaId", long.class);

				method.invoke(_detalleRepuestaReclutamientoRemoteModel,
					preguntaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getRespuestaSeleccionada() {
		return _respuestaSeleccionada;
	}

	@Override
	public void setRespuestaSeleccionada(int respuestaSeleccionada) {
		_respuestaSeleccionada = respuestaSeleccionada;

		if (_detalleRepuestaReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _detalleRepuestaReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setRespuestaSeleccionada",
						int.class);

				method.invoke(_detalleRepuestaReclutamientoRemoteModel,
					respuestaSeleccionada);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDetalleRepuestaReclutamientoRemoteModel() {
		return _detalleRepuestaReclutamientoRemoteModel;
	}

	public void setDetalleRepuestaReclutamientoRemoteModel(
		BaseModel<?> detalleRepuestaReclutamientoRemoteModel) {
		_detalleRepuestaReclutamientoRemoteModel = detalleRepuestaReclutamientoRemoteModel;
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

		Class<?> remoteModelClass = _detalleRepuestaReclutamientoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_detalleRepuestaReclutamientoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DetalleRepuestaReclutamientoLocalServiceUtil.addDetalleRepuestaReclutamiento(this);
		}
		else {
			DetalleRepuestaReclutamientoLocalServiceUtil.updateDetalleRepuestaReclutamiento(this);
		}
	}

	@Override
	public DetalleRepuestaReclutamiento toEscapedModel() {
		return (DetalleRepuestaReclutamiento)ProxyUtil.newProxyInstance(DetalleRepuestaReclutamiento.class.getClassLoader(),
			new Class[] { DetalleRepuestaReclutamiento.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DetalleRepuestaReclutamientoClp clone = new DetalleRepuestaReclutamientoClp();

		clone.setDetalleRepsuestaId(getDetalleRepsuestaId());
		clone.setUsuarioId(getUsuarioId());
		clone.setEvaluacionId(getEvaluacionId());
		clone.setDescripcion(getDescripcion());
		clone.setPreguntaId(getPreguntaId());
		clone.setRespuestaSeleccionada(getRespuestaSeleccionada());

		return clone;
	}

	@Override
	public int compareTo(
		DetalleRepuestaReclutamiento detalleRepuestaReclutamiento) {
		DetalleRepuestaReclutamientoPK primaryKey = detalleRepuestaReclutamiento.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DetalleRepuestaReclutamientoClp)) {
			return false;
		}

		DetalleRepuestaReclutamientoClp detalleRepuestaReclutamiento = (DetalleRepuestaReclutamientoClp)obj;

		DetalleRepuestaReclutamientoPK primaryKey = detalleRepuestaReclutamiento.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{detalleRepsuestaId=");
		sb.append(getDetalleRepsuestaId());
		sb.append(", usuarioId=");
		sb.append(getUsuarioId());
		sb.append(", evaluacionId=");
		sb.append(getEvaluacionId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", preguntaId=");
		sb.append(getPreguntaId());
		sb.append(", respuestaSeleccionada=");
		sb.append(getRespuestaSeleccionada());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.DetalleRepuestaReclutamiento");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>detalleRepsuestaId</column-name><column-value><![CDATA[");
		sb.append(getDetalleRepsuestaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evaluacionId</column-name><column-value><![CDATA[");
		sb.append(getEvaluacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preguntaId</column-name><column-value><![CDATA[");
		sb.append(getPreguntaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>respuestaSeleccionada</column-name><column-value><![CDATA[");
		sb.append(getRespuestaSeleccionada());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _detalleRepsuestaId;
	private long _usuarioId;
	private long _evaluacionId;
	private String _descripcion;
	private long _preguntaId;
	private int _respuestaSeleccionada;
	private BaseModel<?> _detalleRepuestaReclutamientoRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
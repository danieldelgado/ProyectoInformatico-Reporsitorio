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
import com.hitss.layer.service.ObservacionesLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Danielle Delgado
 */
public class ObservacionesClp extends BaseModelImpl<Observaciones>
	implements Observaciones {
	public ObservacionesClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Observaciones.class;
	}

	@Override
	public String getModelClassName() {
		return Observaciones.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _observacionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setObservacionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _observacionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("observacionId", getObservacionId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("tabla", getTabla());
		attributes.put("registroId", getRegistroId());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long observacionId = (Long)attributes.get("observacionId");

		if (observacionId != null) {
			setObservacionId(observacionId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String tabla = (String)attributes.get("tabla");

		if (tabla != null) {
			setTabla(tabla);
		}

		Long registroId = (Long)attributes.get("registroId");

		if (registroId != null) {
			setRegistroId(registroId);
		}

		Boolean activo = (Boolean)attributes.get("activo");

		if (activo != null) {
			setActivo(activo);
		}

		Long usuariocrea = (Long)attributes.get("usuariocrea");

		if (usuariocrea != null) {
			setUsuariocrea(usuariocrea);
		}

		Date fechacrea = (Date)attributes.get("fechacrea");

		if (fechacrea != null) {
			setFechacrea(fechacrea);
		}

		Long usuariomodifica = (Long)attributes.get("usuariomodifica");

		if (usuariomodifica != null) {
			setUsuariomodifica(usuariomodifica);
		}

		Date fechamodifica = (Date)attributes.get("fechamodifica");

		if (fechamodifica != null) {
			setFechamodifica(fechamodifica);
		}
	}

	@Override
	public long getObservacionId() {
		return _observacionId;
	}

	@Override
	public void setObservacionId(long observacionId) {
		_observacionId = observacionId;

		if (_observacionesRemoteModel != null) {
			try {
				Class<?> clazz = _observacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setObservacionId", long.class);

				method.invoke(_observacionesRemoteModel, observacionId);
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

		if (_observacionesRemoteModel != null) {
			try {
				Class<?> clazz = _observacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_observacionesRemoteModel, descripcion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTabla() {
		return _tabla;
	}

	@Override
	public void setTabla(String tabla) {
		_tabla = tabla;

		if (_observacionesRemoteModel != null) {
			try {
				Class<?> clazz = _observacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setTabla", String.class);

				method.invoke(_observacionesRemoteModel, tabla);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRegistroId() {
		return _registroId;
	}

	@Override
	public void setRegistroId(long registroId) {
		_registroId = registroId;

		if (_observacionesRemoteModel != null) {
			try {
				Class<?> clazz = _observacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setRegistroId", long.class);

				method.invoke(_observacionesRemoteModel, registroId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getActivo() {
		return _activo;
	}

	@Override
	public boolean isActivo() {
		return _activo;
	}

	@Override
	public void setActivo(boolean activo) {
		_activo = activo;

		if (_observacionesRemoteModel != null) {
			try {
				Class<?> clazz = _observacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_observacionesRemoteModel, activo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUsuariocrea() {
		return _usuariocrea;
	}

	@Override
	public void setUsuariocrea(long usuariocrea) {
		_usuariocrea = usuariocrea;

		if (_observacionesRemoteModel != null) {
			try {
				Class<?> clazz = _observacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_observacionesRemoteModel, usuariocrea);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechacrea() {
		return _fechacrea;
	}

	@Override
	public void setFechacrea(Date fechacrea) {
		_fechacrea = fechacrea;

		if (_observacionesRemoteModel != null) {
			try {
				Class<?> clazz = _observacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_observacionesRemoteModel, fechacrea);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUsuariomodifica() {
		return _usuariomodifica;
	}

	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_usuariomodifica = usuariomodifica;

		if (_observacionesRemoteModel != null) {
			try {
				Class<?> clazz = _observacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_observacionesRemoteModel, usuariomodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechamodifica() {
		return _fechamodifica;
	}

	@Override
	public void setFechamodifica(Date fechamodifica) {
		_fechamodifica = fechamodifica;

		if (_observacionesRemoteModel != null) {
			try {
				Class<?> clazz = _observacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setFechamodifica", Date.class);

				method.invoke(_observacionesRemoteModel, fechamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getObservacionesRemoteModel() {
		return _observacionesRemoteModel;
	}

	public void setObservacionesRemoteModel(
		BaseModel<?> observacionesRemoteModel) {
		_observacionesRemoteModel = observacionesRemoteModel;
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

		Class<?> remoteModelClass = _observacionesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_observacionesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ObservacionesLocalServiceUtil.addObservaciones(this);
		}
		else {
			ObservacionesLocalServiceUtil.updateObservaciones(this);
		}
	}

	@Override
	public Observaciones toEscapedModel() {
		return (Observaciones)ProxyUtil.newProxyInstance(Observaciones.class.getClassLoader(),
			new Class[] { Observaciones.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ObservacionesClp clone = new ObservacionesClp();

		clone.setObservacionId(getObservacionId());
		clone.setDescripcion(getDescripcion());
		clone.setTabla(getTabla());
		clone.setRegistroId(getRegistroId());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechamodifica(getFechamodifica());

		return clone;
	}

	@Override
	public int compareTo(Observaciones observaciones) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				observaciones.getFechamodifica());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ObservacionesClp)) {
			return false;
		}

		ObservacionesClp observaciones = (ObservacionesClp)obj;

		long primaryKey = observaciones.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{observacionId=");
		sb.append(getObservacionId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", tabla=");
		sb.append(getTabla());
		sb.append(", registroId=");
		sb.append(getRegistroId());
		sb.append(", activo=");
		sb.append(getActivo());
		sb.append(", usuariocrea=");
		sb.append(getUsuariocrea());
		sb.append(", fechacrea=");
		sb.append(getFechacrea());
		sb.append(", usuariomodifica=");
		sb.append(getUsuariomodifica());
		sb.append(", fechamodifica=");
		sb.append(getFechamodifica());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.Observaciones");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>observacionId</column-name><column-value><![CDATA[");
		sb.append(getObservacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tabla</column-name><column-value><![CDATA[");
		sb.append(getTabla());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registroId</column-name><column-value><![CDATA[");
		sb.append(getRegistroId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>activo</column-name><column-value><![CDATA[");
		sb.append(getActivo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuariocrea</column-name><column-value><![CDATA[");
		sb.append(getUsuariocrea());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechacrea</column-name><column-value><![CDATA[");
		sb.append(getFechacrea());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuariomodifica</column-name><column-value><![CDATA[");
		sb.append(getUsuariomodifica());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechamodifica</column-name><column-value><![CDATA[");
		sb.append(getFechamodifica());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _observacionId;
	private String _descripcion;
	private String _tabla;
	private long _registroId;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private BaseModel<?> _observacionesRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
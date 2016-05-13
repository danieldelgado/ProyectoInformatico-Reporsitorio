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
import com.hitss.layer.service.LogOperacionesLocalServiceUtil;

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
public class LogOperacionesClp extends BaseModelImpl<LogOperaciones>
	implements LogOperaciones {
	public LogOperacionesClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LogOperaciones.class;
	}

	@Override
	public String getModelClassName() {
		return LogOperaciones.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _logOperacionesId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLogOperacionesId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _logOperacionesId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("logOperacionesId", getLogOperacionesId());
		attributes.put("tipoActividad", getTipoActividad());
		attributes.put("actividad", getActividad());
		attributes.put("usuario", getUsuario());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long logOperacionesId = (Long)attributes.get("logOperacionesId");

		if (logOperacionesId != null) {
			setLogOperacionesId(logOperacionesId);
		}

		Long tipoActividad = (Long)attributes.get("tipoActividad");

		if (tipoActividad != null) {
			setTipoActividad(tipoActividad);
		}

		String actividad = (String)attributes.get("actividad");

		if (actividad != null) {
			setActividad(actividad);
		}

		String usuario = (String)attributes.get("usuario");

		if (usuario != null) {
			setUsuario(usuario);
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

		Date fechacreamodifica = (Date)attributes.get("fechacreamodifica");

		if (fechacreamodifica != null) {
			setFechacreamodifica(fechacreamodifica);
		}
	}

	@Override
	public long getLogOperacionesId() {
		return _logOperacionesId;
	}

	@Override
	public void setLogOperacionesId(long logOperacionesId) {
		_logOperacionesId = logOperacionesId;

		if (_logOperacionesRemoteModel != null) {
			try {
				Class<?> clazz = _logOperacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setLogOperacionesId",
						long.class);

				method.invoke(_logOperacionesRemoteModel, logOperacionesId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTipoActividad() {
		return _tipoActividad;
	}

	@Override
	public void setTipoActividad(long tipoActividad) {
		_tipoActividad = tipoActividad;

		if (_logOperacionesRemoteModel != null) {
			try {
				Class<?> clazz = _logOperacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setTipoActividad", long.class);

				method.invoke(_logOperacionesRemoteModel, tipoActividad);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getActividad() {
		return _actividad;
	}

	@Override
	public void setActividad(String actividad) {
		_actividad = actividad;

		if (_logOperacionesRemoteModel != null) {
			try {
				Class<?> clazz = _logOperacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setActividad", String.class);

				method.invoke(_logOperacionesRemoteModel, actividad);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUsuario() {
		return _usuario;
	}

	@Override
	public void setUsuario(String usuario) {
		_usuario = usuario;

		if (_logOperacionesRemoteModel != null) {
			try {
				Class<?> clazz = _logOperacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuario", String.class);

				method.invoke(_logOperacionesRemoteModel, usuario);
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

		if (_logOperacionesRemoteModel != null) {
			try {
				Class<?> clazz = _logOperacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_logOperacionesRemoteModel, activo);
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

		if (_logOperacionesRemoteModel != null) {
			try {
				Class<?> clazz = _logOperacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_logOperacionesRemoteModel, usuariocrea);
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

		if (_logOperacionesRemoteModel != null) {
			try {
				Class<?> clazz = _logOperacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_logOperacionesRemoteModel, fechacrea);
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

		if (_logOperacionesRemoteModel != null) {
			try {
				Class<?> clazz = _logOperacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_logOperacionesRemoteModel, usuariomodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechacreamodifica() {
		return _fechacreamodifica;
	}

	@Override
	public void setFechacreamodifica(Date fechacreamodifica) {
		_fechacreamodifica = fechacreamodifica;

		if (_logOperacionesRemoteModel != null) {
			try {
				Class<?> clazz = _logOperacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_logOperacionesRemoteModel, fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLogOperacionesRemoteModel() {
		return _logOperacionesRemoteModel;
	}

	public void setLogOperacionesRemoteModel(
		BaseModel<?> logOperacionesRemoteModel) {
		_logOperacionesRemoteModel = logOperacionesRemoteModel;
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

		Class<?> remoteModelClass = _logOperacionesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_logOperacionesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LogOperacionesLocalServiceUtil.addLogOperaciones(this);
		}
		else {
			LogOperacionesLocalServiceUtil.updateLogOperaciones(this);
		}
	}

	@Override
	public LogOperaciones toEscapedModel() {
		return (LogOperaciones)ProxyUtil.newProxyInstance(LogOperaciones.class.getClassLoader(),
			new Class[] { LogOperaciones.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LogOperacionesClp clone = new LogOperacionesClp();

		clone.setLogOperacionesId(getLogOperacionesId());
		clone.setTipoActividad(getTipoActividad());
		clone.setActividad(getActividad());
		clone.setUsuario(getUsuario());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(LogOperaciones logOperaciones) {
		int value = 0;

		value = DateUtil.compareTo(getFechacreamodifica(),
				logOperaciones.getFechacreamodifica());

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

		if (!(obj instanceof LogOperacionesClp)) {
			return false;
		}

		LogOperacionesClp logOperaciones = (LogOperacionesClp)obj;

		long primaryKey = logOperaciones.getPrimaryKey();

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

		sb.append("{logOperacionesId=");
		sb.append(getLogOperacionesId());
		sb.append(", tipoActividad=");
		sb.append(getTipoActividad());
		sb.append(", actividad=");
		sb.append(getActividad());
		sb.append(", usuario=");
		sb.append(getUsuario());
		sb.append(", activo=");
		sb.append(getActivo());
		sb.append(", usuariocrea=");
		sb.append(getUsuariocrea());
		sb.append(", fechacrea=");
		sb.append(getFechacrea());
		sb.append(", usuariomodifica=");
		sb.append(getUsuariomodifica());
		sb.append(", fechacreamodifica=");
		sb.append(getFechacreamodifica());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.LogOperaciones");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>logOperacionesId</column-name><column-value><![CDATA[");
		sb.append(getLogOperacionesId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipoActividad</column-name><column-value><![CDATA[");
		sb.append(getTipoActividad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actividad</column-name><column-value><![CDATA[");
		sb.append(getActividad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuario</column-name><column-value><![CDATA[");
		sb.append(getUsuario());
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
			"<column><column-name>fechacreamodifica</column-name><column-value><![CDATA[");
		sb.append(getFechacreamodifica());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _logOperacionesId;
	private long _tipoActividad;
	private String _actividad;
	private String _usuario;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _logOperacionesRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
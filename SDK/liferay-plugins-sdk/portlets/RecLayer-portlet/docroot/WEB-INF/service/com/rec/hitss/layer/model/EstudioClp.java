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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.rec.hitss.layer.service.ClpSerializer;
import com.rec.hitss.layer.service.EstudioLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class EstudioClp extends BaseModelImpl<Estudio> implements Estudio {
	public EstudioClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Estudio.class;
	}

	@Override
	public String getModelClassName() {
		return Estudio.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _estudioId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEstudioId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _estudioId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("estudioId", getEstudioId());
		attributes.put("nombre", getNombre());
		attributes.put("logro", getLogro());
		attributes.put("fechaInicio", getFechaInicio());
		attributes.put("fechaFino", getFechaFino());
		attributes.put("nivel", getNivel());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());
		attributes.put("usuarioHitssId", getUsuarioHitssId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long estudioId = (Long)attributes.get("estudioId");

		if (estudioId != null) {
			setEstudioId(estudioId);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String logro = (String)attributes.get("logro");

		if (logro != null) {
			setLogro(logro);
		}

		Date fechaInicio = (Date)attributes.get("fechaInicio");

		if (fechaInicio != null) {
			setFechaInicio(fechaInicio);
		}

		Date fechaFino = (Date)attributes.get("fechaFino");

		if (fechaFino != null) {
			setFechaFino(fechaFino);
		}

		Long nivel = (Long)attributes.get("nivel");

		if (nivel != null) {
			setNivel(nivel);
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

		Long usuarioHitssId = (Long)attributes.get("usuarioHitssId");

		if (usuarioHitssId != null) {
			setUsuarioHitssId(usuarioHitssId);
		}
	}

	@Override
	public long getEstudioId() {
		return _estudioId;
	}

	@Override
	public void setEstudioId(long estudioId) {
		_estudioId = estudioId;

		if (_estudioRemoteModel != null) {
			try {
				Class<?> clazz = _estudioRemoteModel.getClass();

				Method method = clazz.getMethod("setEstudioId", long.class);

				method.invoke(_estudioRemoteModel, estudioId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNombre() {
		return _nombre;
	}

	@Override
	public void setNombre(String nombre) {
		_nombre = nombre;

		if (_estudioRemoteModel != null) {
			try {
				Class<?> clazz = _estudioRemoteModel.getClass();

				Method method = clazz.getMethod("setNombre", String.class);

				method.invoke(_estudioRemoteModel, nombre);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLogro() {
		return _logro;
	}

	@Override
	public void setLogro(String logro) {
		_logro = logro;

		if (_estudioRemoteModel != null) {
			try {
				Class<?> clazz = _estudioRemoteModel.getClass();

				Method method = clazz.getMethod("setLogro", String.class);

				method.invoke(_estudioRemoteModel, logro);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaInicio() {
		return _fechaInicio;
	}

	@Override
	public void setFechaInicio(Date fechaInicio) {
		_fechaInicio = fechaInicio;

		if (_estudioRemoteModel != null) {
			try {
				Class<?> clazz = _estudioRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaInicio", Date.class);

				method.invoke(_estudioRemoteModel, fechaInicio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaFino() {
		return _fechaFino;
	}

	@Override
	public void setFechaFino(Date fechaFino) {
		_fechaFino = fechaFino;

		if (_estudioRemoteModel != null) {
			try {
				Class<?> clazz = _estudioRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaFino", Date.class);

				method.invoke(_estudioRemoteModel, fechaFino);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNivel() {
		return _nivel;
	}

	@Override
	public void setNivel(long nivel) {
		_nivel = nivel;

		if (_estudioRemoteModel != null) {
			try {
				Class<?> clazz = _estudioRemoteModel.getClass();

				Method method = clazz.getMethod("setNivel", long.class);

				method.invoke(_estudioRemoteModel, nivel);
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

		if (_estudioRemoteModel != null) {
			try {
				Class<?> clazz = _estudioRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_estudioRemoteModel, activo);
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

		if (_estudioRemoteModel != null) {
			try {
				Class<?> clazz = _estudioRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_estudioRemoteModel, usuariocrea);
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

		if (_estudioRemoteModel != null) {
			try {
				Class<?> clazz = _estudioRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_estudioRemoteModel, fechacrea);
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

		if (_estudioRemoteModel != null) {
			try {
				Class<?> clazz = _estudioRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_estudioRemoteModel, usuariomodifica);
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

		if (_estudioRemoteModel != null) {
			try {
				Class<?> clazz = _estudioRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_estudioRemoteModel, fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUsuarioHitssId() {
		return _usuarioHitssId;
	}

	@Override
	public void setUsuarioHitssId(long usuarioHitssId) {
		_usuarioHitssId = usuarioHitssId;

		if (_estudioRemoteModel != null) {
			try {
				Class<?> clazz = _estudioRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioHitssId", long.class);

				method.invoke(_estudioRemoteModel, usuarioHitssId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEstudioRemoteModel() {
		return _estudioRemoteModel;
	}

	public void setEstudioRemoteModel(BaseModel<?> estudioRemoteModel) {
		_estudioRemoteModel = estudioRemoteModel;
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

		Class<?> remoteModelClass = _estudioRemoteModel.getClass();

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

		Object returnValue = method.invoke(_estudioRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EstudioLocalServiceUtil.addEstudio(this);
		}
		else {
			EstudioLocalServiceUtil.updateEstudio(this);
		}
	}

	@Override
	public Estudio toEscapedModel() {
		return (Estudio)ProxyUtil.newProxyInstance(Estudio.class.getClassLoader(),
			new Class[] { Estudio.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EstudioClp clone = new EstudioClp();

		clone.setEstudioId(getEstudioId());
		clone.setNombre(getNombre());
		clone.setLogro(getLogro());
		clone.setFechaInicio(getFechaInicio());
		clone.setFechaFino(getFechaFino());
		clone.setNivel(getNivel());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());
		clone.setUsuarioHitssId(getUsuarioHitssId());

		return clone;
	}

	@Override
	public int compareTo(Estudio estudio) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(), estudio.getFechacrea());

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

		if (!(obj instanceof EstudioClp)) {
			return false;
		}

		EstudioClp estudio = (EstudioClp)obj;

		long primaryKey = estudio.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{estudioId=");
		sb.append(getEstudioId());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", logro=");
		sb.append(getLogro());
		sb.append(", fechaInicio=");
		sb.append(getFechaInicio());
		sb.append(", fechaFino=");
		sb.append(getFechaFino());
		sb.append(", nivel=");
		sb.append(getNivel());
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
		sb.append(", usuarioHitssId=");
		sb.append(getUsuarioHitssId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.Estudio");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>estudioId</column-name><column-value><![CDATA[");
		sb.append(getEstudioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>logro</column-name><column-value><![CDATA[");
		sb.append(getLogro());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaInicio</column-name><column-value><![CDATA[");
		sb.append(getFechaInicio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaFino</column-name><column-value><![CDATA[");
		sb.append(getFechaFino());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nivel</column-name><column-value><![CDATA[");
		sb.append(getNivel());
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
		sb.append(
			"<column><column-name>usuarioHitssId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioHitssId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _estudioId;
	private String _nombre;
	private String _logro;
	private Date _fechaInicio;
	private Date _fechaFino;
	private long _nivel;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private long _usuarioHitssId;
	private BaseModel<?> _estudioRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
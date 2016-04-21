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
import com.rec.hitss.layer.service.ConocimientoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class ConocimientoClp extends BaseModelImpl<Conocimiento>
	implements Conocimiento {
	public ConocimientoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Conocimiento.class;
	}

	@Override
	public String getModelClassName() {
		return Conocimiento.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _conocimientoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setConocimientoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _conocimientoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("conocimientoId", getConocimientoId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("etiquetaId", getEtiquetaId());
		attributes.put("nivel", getNivel());
		attributes.put("herramiento", getHerramiento());
		attributes.put("implementacion", getImplementacion());
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
		Long conocimientoId = (Long)attributes.get("conocimientoId");

		if (conocimientoId != null) {
			setConocimientoId(conocimientoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Long etiquetaId = (Long)attributes.get("etiquetaId");

		if (etiquetaId != null) {
			setEtiquetaId(etiquetaId);
		}

		String nivel = (String)attributes.get("nivel");

		if (nivel != null) {
			setNivel(nivel);
		}

		String herramiento = (String)attributes.get("herramiento");

		if (herramiento != null) {
			setHerramiento(herramiento);
		}

		String implementacion = (String)attributes.get("implementacion");

		if (implementacion != null) {
			setImplementacion(implementacion);
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
	public long getConocimientoId() {
		return _conocimientoId;
	}

	@Override
	public void setConocimientoId(long conocimientoId) {
		_conocimientoId = conocimientoId;

		if (_conocimientoRemoteModel != null) {
			try {
				Class<?> clazz = _conocimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setConocimientoId", long.class);

				method.invoke(_conocimientoRemoteModel, conocimientoId);
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

		if (_conocimientoRemoteModel != null) {
			try {
				Class<?> clazz = _conocimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_conocimientoRemoteModel, descripcion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEtiquetaId() {
		return _etiquetaId;
	}

	@Override
	public void setEtiquetaId(long etiquetaId) {
		_etiquetaId = etiquetaId;

		if (_conocimientoRemoteModel != null) {
			try {
				Class<?> clazz = _conocimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setEtiquetaId", long.class);

				method.invoke(_conocimientoRemoteModel, etiquetaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNivel() {
		return _nivel;
	}

	@Override
	public void setNivel(String nivel) {
		_nivel = nivel;

		if (_conocimientoRemoteModel != null) {
			try {
				Class<?> clazz = _conocimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setNivel", String.class);

				method.invoke(_conocimientoRemoteModel, nivel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHerramiento() {
		return _herramiento;
	}

	@Override
	public void setHerramiento(String herramiento) {
		_herramiento = herramiento;

		if (_conocimientoRemoteModel != null) {
			try {
				Class<?> clazz = _conocimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setHerramiento", String.class);

				method.invoke(_conocimientoRemoteModel, herramiento);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImplementacion() {
		return _implementacion;
	}

	@Override
	public void setImplementacion(String implementacion) {
		_implementacion = implementacion;

		if (_conocimientoRemoteModel != null) {
			try {
				Class<?> clazz = _conocimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setImplementacion",
						String.class);

				method.invoke(_conocimientoRemoteModel, implementacion);
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

		if (_conocimientoRemoteModel != null) {
			try {
				Class<?> clazz = _conocimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_conocimientoRemoteModel, activo);
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

		if (_conocimientoRemoteModel != null) {
			try {
				Class<?> clazz = _conocimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_conocimientoRemoteModel, usuariocrea);
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

		if (_conocimientoRemoteModel != null) {
			try {
				Class<?> clazz = _conocimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_conocimientoRemoteModel, fechacrea);
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

		if (_conocimientoRemoteModel != null) {
			try {
				Class<?> clazz = _conocimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_conocimientoRemoteModel, usuariomodifica);
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

		if (_conocimientoRemoteModel != null) {
			try {
				Class<?> clazz = _conocimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_conocimientoRemoteModel, fechacreamodifica);
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

		if (_conocimientoRemoteModel != null) {
			try {
				Class<?> clazz = _conocimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioHitssId", long.class);

				method.invoke(_conocimientoRemoteModel, usuarioHitssId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getConocimientoRemoteModel() {
		return _conocimientoRemoteModel;
	}

	public void setConocimientoRemoteModel(BaseModel<?> conocimientoRemoteModel) {
		_conocimientoRemoteModel = conocimientoRemoteModel;
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

		Class<?> remoteModelClass = _conocimientoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_conocimientoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ConocimientoLocalServiceUtil.addConocimiento(this);
		}
		else {
			ConocimientoLocalServiceUtil.updateConocimiento(this);
		}
	}

	@Override
	public Conocimiento toEscapedModel() {
		return (Conocimiento)ProxyUtil.newProxyInstance(Conocimiento.class.getClassLoader(),
			new Class[] { Conocimiento.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ConocimientoClp clone = new ConocimientoClp();

		clone.setConocimientoId(getConocimientoId());
		clone.setDescripcion(getDescripcion());
		clone.setEtiquetaId(getEtiquetaId());
		clone.setNivel(getNivel());
		clone.setHerramiento(getHerramiento());
		clone.setImplementacion(getImplementacion());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());
		clone.setUsuarioHitssId(getUsuarioHitssId());

		return clone;
	}

	@Override
	public int compareTo(Conocimiento conocimiento) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(), conocimiento.getFechacrea());

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

		if (!(obj instanceof ConocimientoClp)) {
			return false;
		}

		ConocimientoClp conocimiento = (ConocimientoClp)obj;

		long primaryKey = conocimiento.getPrimaryKey();

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

		sb.append("{conocimientoId=");
		sb.append(getConocimientoId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", etiquetaId=");
		sb.append(getEtiquetaId());
		sb.append(", nivel=");
		sb.append(getNivel());
		sb.append(", herramiento=");
		sb.append(getHerramiento());
		sb.append(", implementacion=");
		sb.append(getImplementacion());
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
		sb.append("com.rec.hitss.layer.model.Conocimiento");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>conocimientoId</column-name><column-value><![CDATA[");
		sb.append(getConocimientoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>etiquetaId</column-name><column-value><![CDATA[");
		sb.append(getEtiquetaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nivel</column-name><column-value><![CDATA[");
		sb.append(getNivel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>herramiento</column-name><column-value><![CDATA[");
		sb.append(getHerramiento());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>implementacion</column-name><column-value><![CDATA[");
		sb.append(getImplementacion());
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

	private long _conocimientoId;
	private String _descripcion;
	private long _etiquetaId;
	private String _nivel;
	private String _herramiento;
	private String _implementacion;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private long _usuarioHitssId;
	private BaseModel<?> _conocimientoRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
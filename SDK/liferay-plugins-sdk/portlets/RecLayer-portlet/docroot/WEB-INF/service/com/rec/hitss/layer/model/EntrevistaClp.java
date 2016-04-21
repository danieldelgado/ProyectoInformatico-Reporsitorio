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
import com.rec.hitss.layer.service.EntrevistaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class EntrevistaClp extends BaseModelImpl<Entrevista>
	implements Entrevista {
	public EntrevistaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Entrevista.class;
	}

	@Override
	public String getModelClassName() {
		return Entrevista.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _entrevistaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEntrevistaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _entrevistaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("entrevistaId", getEntrevistaId());
		attributes.put("usuarioHitssId", getUsuarioHitssId());
		attributes.put("observacion", getObservacion());
		attributes.put("asistio", getAsistio());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long entrevistaId = (Long)attributes.get("entrevistaId");

		if (entrevistaId != null) {
			setEntrevistaId(entrevistaId);
		}

		Long usuarioHitssId = (Long)attributes.get("usuarioHitssId");

		if (usuarioHitssId != null) {
			setUsuarioHitssId(usuarioHitssId);
		}

		String observacion = (String)attributes.get("observacion");

		if (observacion != null) {
			setObservacion(observacion);
		}

		Boolean asistio = (Boolean)attributes.get("asistio");

		if (asistio != null) {
			setAsistio(asistio);
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
	public long getEntrevistaId() {
		return _entrevistaId;
	}

	@Override
	public void setEntrevistaId(long entrevistaId) {
		_entrevistaId = entrevistaId;

		if (_entrevistaRemoteModel != null) {
			try {
				Class<?> clazz = _entrevistaRemoteModel.getClass();

				Method method = clazz.getMethod("setEntrevistaId", long.class);

				method.invoke(_entrevistaRemoteModel, entrevistaId);
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

		if (_entrevistaRemoteModel != null) {
			try {
				Class<?> clazz = _entrevistaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioHitssId", long.class);

				method.invoke(_entrevistaRemoteModel, usuarioHitssId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getObservacion() {
		return _observacion;
	}

	@Override
	public void setObservacion(String observacion) {
		_observacion = observacion;

		if (_entrevistaRemoteModel != null) {
			try {
				Class<?> clazz = _entrevistaRemoteModel.getClass();

				Method method = clazz.getMethod("setObservacion", String.class);

				method.invoke(_entrevistaRemoteModel, observacion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getAsistio() {
		return _asistio;
	}

	@Override
	public boolean isAsistio() {
		return _asistio;
	}

	@Override
	public void setAsistio(boolean asistio) {
		_asistio = asistio;

		if (_entrevistaRemoteModel != null) {
			try {
				Class<?> clazz = _entrevistaRemoteModel.getClass();

				Method method = clazz.getMethod("setAsistio", boolean.class);

				method.invoke(_entrevistaRemoteModel, asistio);
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

		if (_entrevistaRemoteModel != null) {
			try {
				Class<?> clazz = _entrevistaRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_entrevistaRemoteModel, activo);
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

		if (_entrevistaRemoteModel != null) {
			try {
				Class<?> clazz = _entrevistaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_entrevistaRemoteModel, usuariocrea);
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

		if (_entrevistaRemoteModel != null) {
			try {
				Class<?> clazz = _entrevistaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_entrevistaRemoteModel, fechacrea);
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

		if (_entrevistaRemoteModel != null) {
			try {
				Class<?> clazz = _entrevistaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_entrevistaRemoteModel, usuariomodifica);
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

		if (_entrevistaRemoteModel != null) {
			try {
				Class<?> clazz = _entrevistaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_entrevistaRemoteModel, fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEntrevistaRemoteModel() {
		return _entrevistaRemoteModel;
	}

	public void setEntrevistaRemoteModel(BaseModel<?> entrevistaRemoteModel) {
		_entrevistaRemoteModel = entrevistaRemoteModel;
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

		Class<?> remoteModelClass = _entrevistaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_entrevistaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EntrevistaLocalServiceUtil.addEntrevista(this);
		}
		else {
			EntrevistaLocalServiceUtil.updateEntrevista(this);
		}
	}

	@Override
	public Entrevista toEscapedModel() {
		return (Entrevista)ProxyUtil.newProxyInstance(Entrevista.class.getClassLoader(),
			new Class[] { Entrevista.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EntrevistaClp clone = new EntrevistaClp();

		clone.setEntrevistaId(getEntrevistaId());
		clone.setUsuarioHitssId(getUsuarioHitssId());
		clone.setObservacion(getObservacion());
		clone.setAsistio(getAsistio());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(Entrevista entrevista) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(), entrevista.getFechacrea());

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

		if (!(obj instanceof EntrevistaClp)) {
			return false;
		}

		EntrevistaClp entrevista = (EntrevistaClp)obj;

		long primaryKey = entrevista.getPrimaryKey();

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

		sb.append("{entrevistaId=");
		sb.append(getEntrevistaId());
		sb.append(", usuarioHitssId=");
		sb.append(getUsuarioHitssId());
		sb.append(", observacion=");
		sb.append(getObservacion());
		sb.append(", asistio=");
		sb.append(getAsistio());
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
		sb.append("com.rec.hitss.layer.model.Entrevista");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>entrevistaId</column-name><column-value><![CDATA[");
		sb.append(getEntrevistaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioHitssId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioHitssId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>observacion</column-name><column-value><![CDATA[");
		sb.append(getObservacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asistio</column-name><column-value><![CDATA[");
		sb.append(getAsistio());
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

	private long _entrevistaId;
	private long _usuarioHitssId;
	private String _observacion;
	private boolean _asistio;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _entrevistaRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
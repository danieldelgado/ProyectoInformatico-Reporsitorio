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
import com.hitss.layer.service.RespuestaLocalServiceUtil;

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
public class RespuestaClp extends BaseModelImpl<Respuesta> implements Respuesta {
	public RespuestaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Respuesta.class;
	}

	@Override
	public String getModelClassName() {
		return Respuesta.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _respuestaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRespuestaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _respuestaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("respuestaId", getRespuestaId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("correcta", getCorrecta());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long respuestaId = (Long)attributes.get("respuestaId");

		if (respuestaId != null) {
			setRespuestaId(respuestaId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Boolean correcta = (Boolean)attributes.get("correcta");

		if (correcta != null) {
			setCorrecta(correcta);
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
	public long getRespuestaId() {
		return _respuestaId;
	}

	@Override
	public void setRespuestaId(long respuestaId) {
		_respuestaId = respuestaId;

		if (_respuestaRemoteModel != null) {
			try {
				Class<?> clazz = _respuestaRemoteModel.getClass();

				Method method = clazz.getMethod("setRespuestaId", long.class);

				method.invoke(_respuestaRemoteModel, respuestaId);
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

		if (_respuestaRemoteModel != null) {
			try {
				Class<?> clazz = _respuestaRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_respuestaRemoteModel, descripcion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getCorrecta() {
		return _correcta;
	}

	@Override
	public boolean isCorrecta() {
		return _correcta;
	}

	@Override
	public void setCorrecta(boolean correcta) {
		_correcta = correcta;

		if (_respuestaRemoteModel != null) {
			try {
				Class<?> clazz = _respuestaRemoteModel.getClass();

				Method method = clazz.getMethod("setCorrecta", boolean.class);

				method.invoke(_respuestaRemoteModel, correcta);
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

		if (_respuestaRemoteModel != null) {
			try {
				Class<?> clazz = _respuestaRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_respuestaRemoteModel, activo);
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

		if (_respuestaRemoteModel != null) {
			try {
				Class<?> clazz = _respuestaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_respuestaRemoteModel, usuariocrea);
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

		if (_respuestaRemoteModel != null) {
			try {
				Class<?> clazz = _respuestaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_respuestaRemoteModel, fechacrea);
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

		if (_respuestaRemoteModel != null) {
			try {
				Class<?> clazz = _respuestaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_respuestaRemoteModel, usuariomodifica);
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

		if (_respuestaRemoteModel != null) {
			try {
				Class<?> clazz = _respuestaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechamodifica", Date.class);

				method.invoke(_respuestaRemoteModel, fechamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRespuestaRemoteModel() {
		return _respuestaRemoteModel;
	}

	public void setRespuestaRemoteModel(BaseModel<?> respuestaRemoteModel) {
		_respuestaRemoteModel = respuestaRemoteModel;
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

		Class<?> remoteModelClass = _respuestaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_respuestaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RespuestaLocalServiceUtil.addRespuesta(this);
		}
		else {
			RespuestaLocalServiceUtil.updateRespuesta(this);
		}
	}

	@Override
	public Respuesta toEscapedModel() {
		return (Respuesta)ProxyUtil.newProxyInstance(Respuesta.class.getClassLoader(),
			new Class[] { Respuesta.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RespuestaClp clone = new RespuestaClp();

		clone.setRespuestaId(getRespuestaId());
		clone.setDescripcion(getDescripcion());
		clone.setCorrecta(getCorrecta());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechamodifica(getFechamodifica());

		return clone;
	}

	@Override
	public int compareTo(Respuesta respuesta) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				respuesta.getFechamodifica());

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

		if (!(obj instanceof RespuestaClp)) {
			return false;
		}

		RespuestaClp respuesta = (RespuestaClp)obj;

		long primaryKey = respuesta.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{respuestaId=");
		sb.append(getRespuestaId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", correcta=");
		sb.append(getCorrecta());
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
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.Respuesta");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>respuestaId</column-name><column-value><![CDATA[");
		sb.append(getRespuestaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>correcta</column-name><column-value><![CDATA[");
		sb.append(getCorrecta());
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

	private long _respuestaId;
	private String _descripcion;
	private boolean _correcta;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private BaseModel<?> _respuestaRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
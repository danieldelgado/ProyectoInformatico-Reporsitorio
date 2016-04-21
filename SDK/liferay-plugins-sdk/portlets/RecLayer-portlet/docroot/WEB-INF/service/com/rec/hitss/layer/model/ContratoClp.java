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
import com.rec.hitss.layer.service.ContratoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class ContratoClp extends BaseModelImpl<Contrato> implements Contrato {
	public ContratoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Contrato.class;
	}

	@Override
	public String getModelClassName() {
		return Contrato.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _contratoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setContratoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _contratoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("contratoId", getContratoId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("fechaEmitida", getFechaEmitida());
		attributes.put("Titulo", getTitulo());
		attributes.put("Motivo", getMotivo());
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
		Long contratoId = (Long)attributes.get("contratoId");

		if (contratoId != null) {
			setContratoId(contratoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Date fechaEmitida = (Date)attributes.get("fechaEmitida");

		if (fechaEmitida != null) {
			setFechaEmitida(fechaEmitida);
		}

		Boolean Titulo = (Boolean)attributes.get("Titulo");

		if (Titulo != null) {
			setTitulo(Titulo);
		}

		String Motivo = (String)attributes.get("Motivo");

		if (Motivo != null) {
			setMotivo(Motivo);
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
	public long getContratoId() {
		return _contratoId;
	}

	@Override
	public void setContratoId(long contratoId) {
		_contratoId = contratoId;

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setContratoId", long.class);

				method.invoke(_contratoRemoteModel, contratoId);
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

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_contratoRemoteModel, descripcion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaEmitida() {
		return _fechaEmitida;
	}

	@Override
	public void setFechaEmitida(Date fechaEmitida) {
		_fechaEmitida = fechaEmitida;

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaEmitida", Date.class);

				method.invoke(_contratoRemoteModel, fechaEmitida);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getTitulo() {
		return _Titulo;
	}

	@Override
	public boolean isTitulo() {
		return _Titulo;
	}

	@Override
	public void setTitulo(boolean Titulo) {
		_Titulo = Titulo;

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setTitulo", boolean.class);

				method.invoke(_contratoRemoteModel, Titulo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMotivo() {
		return _Motivo;
	}

	@Override
	public void setMotivo(String Motivo) {
		_Motivo = Motivo;

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setMotivo", String.class);

				method.invoke(_contratoRemoteModel, Motivo);
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

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_contratoRemoteModel, activo);
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

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_contratoRemoteModel, usuariocrea);
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

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_contratoRemoteModel, fechacrea);
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

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_contratoRemoteModel, usuariomodifica);
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

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_contratoRemoteModel, fechacreamodifica);
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

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioHitssId", long.class);

				method.invoke(_contratoRemoteModel, usuarioHitssId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getContratoRemoteModel() {
		return _contratoRemoteModel;
	}

	public void setContratoRemoteModel(BaseModel<?> contratoRemoteModel) {
		_contratoRemoteModel = contratoRemoteModel;
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

		Class<?> remoteModelClass = _contratoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_contratoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ContratoLocalServiceUtil.addContrato(this);
		}
		else {
			ContratoLocalServiceUtil.updateContrato(this);
		}
	}

	@Override
	public Contrato toEscapedModel() {
		return (Contrato)ProxyUtil.newProxyInstance(Contrato.class.getClassLoader(),
			new Class[] { Contrato.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ContratoClp clone = new ContratoClp();

		clone.setContratoId(getContratoId());
		clone.setDescripcion(getDescripcion());
		clone.setFechaEmitida(getFechaEmitida());
		clone.setTitulo(getTitulo());
		clone.setMotivo(getMotivo());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());
		clone.setUsuarioHitssId(getUsuarioHitssId());

		return clone;
	}

	@Override
	public int compareTo(Contrato contrato) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(), contrato.getFechacrea());

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

		if (!(obj instanceof ContratoClp)) {
			return false;
		}

		ContratoClp contrato = (ContratoClp)obj;

		long primaryKey = contrato.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{contratoId=");
		sb.append(getContratoId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", fechaEmitida=");
		sb.append(getFechaEmitida());
		sb.append(", Titulo=");
		sb.append(getTitulo());
		sb.append(", Motivo=");
		sb.append(getMotivo());
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
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.Contrato");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>contratoId</column-name><column-value><![CDATA[");
		sb.append(getContratoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaEmitida</column-name><column-value><![CDATA[");
		sb.append(getFechaEmitida());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Titulo</column-name><column-value><![CDATA[");
		sb.append(getTitulo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Motivo</column-name><column-value><![CDATA[");
		sb.append(getMotivo());
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

	private long _contratoId;
	private String _descripcion;
	private Date _fechaEmitida;
	private boolean _Titulo;
	private String _Motivo;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private long _usuarioHitssId;
	private BaseModel<?> _contratoRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
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
import com.hitss.layer.service.SolicitudEvaluacionDesempennoLocalServiceUtil;

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
public class SolicitudEvaluacionDesempennoClp extends BaseModelImpl<SolicitudEvaluacionDesempenno>
	implements SolicitudEvaluacionDesempenno {
	public SolicitudEvaluacionDesempennoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return SolicitudEvaluacionDesempenno.class;
	}

	@Override
	public String getModelClassName() {
		return SolicitudEvaluacionDesempenno.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _solicitudEvaluacionDesempennoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSolicitudEvaluacionDesempennoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _solicitudEvaluacionDesempennoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudEvaluacionDesempennoId",
			getSolicitudEvaluacionDesempennoId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("fechaInicio", getFechaInicio());
		attributes.put("estado", getEstado());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long solicitudEvaluacionDesempennoId = (Long)attributes.get(
				"solicitudEvaluacionDesempennoId");

		if (solicitudEvaluacionDesempennoId != null) {
			setSolicitudEvaluacionDesempennoId(solicitudEvaluacionDesempennoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Date fechaInicio = (Date)attributes.get("fechaInicio");

		if (fechaInicio != null) {
			setFechaInicio(fechaInicio);
		}

		Long estado = (Long)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
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
	public long getSolicitudEvaluacionDesempennoId() {
		return _solicitudEvaluacionDesempennoId;
	}

	@Override
	public void setSolicitudEvaluacionDesempennoId(
		long solicitudEvaluacionDesempennoId) {
		_solicitudEvaluacionDesempennoId = solicitudEvaluacionDesempennoId;

		if (_solicitudEvaluacionDesempennoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudEvaluacionDesempennoRemoteModel.getClass();

				Method method = clazz.getMethod("setSolicitudEvaluacionDesempennoId",
						long.class);

				method.invoke(_solicitudEvaluacionDesempennoRemoteModel,
					solicitudEvaluacionDesempennoId);
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

		if (_solicitudEvaluacionDesempennoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudEvaluacionDesempennoRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_solicitudEvaluacionDesempennoRemoteModel,
					descripcion);
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

		if (_solicitudEvaluacionDesempennoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudEvaluacionDesempennoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaInicio", Date.class);

				method.invoke(_solicitudEvaluacionDesempennoRemoteModel,
					fechaInicio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEstado() {
		return _estado;
	}

	@Override
	public void setEstado(long estado) {
		_estado = estado;

		if (_solicitudEvaluacionDesempennoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudEvaluacionDesempennoRemoteModel.getClass();

				Method method = clazz.getMethod("setEstado", long.class);

				method.invoke(_solicitudEvaluacionDesempennoRemoteModel, estado);
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

		if (_solicitudEvaluacionDesempennoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudEvaluacionDesempennoRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_solicitudEvaluacionDesempennoRemoteModel, activo);
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

		if (_solicitudEvaluacionDesempennoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudEvaluacionDesempennoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_solicitudEvaluacionDesempennoRemoteModel,
					usuariocrea);
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

		if (_solicitudEvaluacionDesempennoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudEvaluacionDesempennoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_solicitudEvaluacionDesempennoRemoteModel,
					fechacrea);
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

		if (_solicitudEvaluacionDesempennoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudEvaluacionDesempennoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_solicitudEvaluacionDesempennoRemoteModel,
					usuariomodifica);
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

		if (_solicitudEvaluacionDesempennoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudEvaluacionDesempennoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_solicitudEvaluacionDesempennoRemoteModel,
					fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSolicitudEvaluacionDesempennoRemoteModel() {
		return _solicitudEvaluacionDesempennoRemoteModel;
	}

	public void setSolicitudEvaluacionDesempennoRemoteModel(
		BaseModel<?> solicitudEvaluacionDesempennoRemoteModel) {
		_solicitudEvaluacionDesempennoRemoteModel = solicitudEvaluacionDesempennoRemoteModel;
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

		Class<?> remoteModelClass = _solicitudEvaluacionDesempennoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_solicitudEvaluacionDesempennoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SolicitudEvaluacionDesempennoLocalServiceUtil.addSolicitudEvaluacionDesempenno(this);
		}
		else {
			SolicitudEvaluacionDesempennoLocalServiceUtil.updateSolicitudEvaluacionDesempenno(this);
		}
	}

	@Override
	public SolicitudEvaluacionDesempenno toEscapedModel() {
		return (SolicitudEvaluacionDesempenno)ProxyUtil.newProxyInstance(SolicitudEvaluacionDesempenno.class.getClassLoader(),
			new Class[] { SolicitudEvaluacionDesempenno.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SolicitudEvaluacionDesempennoClp clone = new SolicitudEvaluacionDesempennoClp();

		clone.setSolicitudEvaluacionDesempennoId(getSolicitudEvaluacionDesempennoId());
		clone.setDescripcion(getDescripcion());
		clone.setFechaInicio(getFechaInicio());
		clone.setEstado(getEstado());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(
		SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno) {
		int value = 0;

		value = DateUtil.compareTo(getFechacreamodifica(),
				solicitudEvaluacionDesempenno.getFechacreamodifica());

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

		if (!(obj instanceof SolicitudEvaluacionDesempennoClp)) {
			return false;
		}

		SolicitudEvaluacionDesempennoClp solicitudEvaluacionDesempenno = (SolicitudEvaluacionDesempennoClp)obj;

		long primaryKey = solicitudEvaluacionDesempenno.getPrimaryKey();

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

		sb.append("{solicitudEvaluacionDesempennoId=");
		sb.append(getSolicitudEvaluacionDesempennoId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", fechaInicio=");
		sb.append(getFechaInicio());
		sb.append(", estado=");
		sb.append(getEstado());
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
		sb.append("com.hitss.layer.model.SolicitudEvaluacionDesempenno");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>solicitudEvaluacionDesempennoId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudEvaluacionDesempennoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaInicio</column-name><column-value><![CDATA[");
		sb.append(getFechaInicio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estado</column-name><column-value><![CDATA[");
		sb.append(getEstado());
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

	private long _solicitudEvaluacionDesempennoId;
	private String _descripcion;
	private Date _fechaInicio;
	private long _estado;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _solicitudEvaluacionDesempennoRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
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
import com.rec.hitss.layer.service.FasePostulacionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class FasePostulacionClp extends BaseModelImpl<FasePostulacion>
	implements FasePostulacion {
	public FasePostulacionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return FasePostulacion.class;
	}

	@Override
	public String getModelClassName() {
		return FasePostulacion.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _fasePostulacionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFasePostulacionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _fasePostulacionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fasePostulacionId", getFasePostulacionId());
		attributes.put("solicitudRequerimientoId", getSolicitudRequerimientoId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("fechaFase", getFechaFase());
		attributes.put("tipoFase", getTipoFase());
		attributes.put("descripcion", getDescripcion());
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
		Long fasePostulacionId = (Long)attributes.get("fasePostulacionId");

		if (fasePostulacionId != null) {
			setFasePostulacionId(fasePostulacionId);
		}

		Long solicitudRequerimientoId = (Long)attributes.get(
				"solicitudRequerimientoId");

		if (solicitudRequerimientoId != null) {
			setSolicitudRequerimientoId(solicitudRequerimientoId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		Date fechaFase = (Date)attributes.get("fechaFase");

		if (fechaFase != null) {
			setFechaFase(fechaFase);
		}

		Long tipoFase = (Long)attributes.get("tipoFase");

		if (tipoFase != null) {
			setTipoFase(tipoFase);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
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
	public long getFasePostulacionId() {
		return _fasePostulacionId;
	}

	@Override
	public void setFasePostulacionId(long fasePostulacionId) {
		_fasePostulacionId = fasePostulacionId;

		if (_fasePostulacionRemoteModel != null) {
			try {
				Class<?> clazz = _fasePostulacionRemoteModel.getClass();

				Method method = clazz.getMethod("setFasePostulacionId",
						long.class);

				method.invoke(_fasePostulacionRemoteModel, fasePostulacionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSolicitudRequerimientoId() {
		return _solicitudRequerimientoId;
	}

	@Override
	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_solicitudRequerimientoId = solicitudRequerimientoId;

		if (_fasePostulacionRemoteModel != null) {
			try {
				Class<?> clazz = _fasePostulacionRemoteModel.getClass();

				Method method = clazz.getMethod("setSolicitudRequerimientoId",
						long.class);

				method.invoke(_fasePostulacionRemoteModel,
					solicitudRequerimientoId);
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

		if (_fasePostulacionRemoteModel != null) {
			try {
				Class<?> clazz = _fasePostulacionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioId", long.class);

				method.invoke(_fasePostulacionRemoteModel, usuarioId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaFase() {
		return _fechaFase;
	}

	@Override
	public void setFechaFase(Date fechaFase) {
		_fechaFase = fechaFase;

		if (_fasePostulacionRemoteModel != null) {
			try {
				Class<?> clazz = _fasePostulacionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaFase", Date.class);

				method.invoke(_fasePostulacionRemoteModel, fechaFase);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTipoFase() {
		return _tipoFase;
	}

	@Override
	public void setTipoFase(long tipoFase) {
		_tipoFase = tipoFase;

		if (_fasePostulacionRemoteModel != null) {
			try {
				Class<?> clazz = _fasePostulacionRemoteModel.getClass();

				Method method = clazz.getMethod("setTipoFase", long.class);

				method.invoke(_fasePostulacionRemoteModel, tipoFase);
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

		if (_fasePostulacionRemoteModel != null) {
			try {
				Class<?> clazz = _fasePostulacionRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_fasePostulacionRemoteModel, descripcion);
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

		if (_fasePostulacionRemoteModel != null) {
			try {
				Class<?> clazz = _fasePostulacionRemoteModel.getClass();

				Method method = clazz.getMethod("setEstado", long.class);

				method.invoke(_fasePostulacionRemoteModel, estado);
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

		if (_fasePostulacionRemoteModel != null) {
			try {
				Class<?> clazz = _fasePostulacionRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_fasePostulacionRemoteModel, activo);
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

		if (_fasePostulacionRemoteModel != null) {
			try {
				Class<?> clazz = _fasePostulacionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_fasePostulacionRemoteModel, usuariocrea);
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

		if (_fasePostulacionRemoteModel != null) {
			try {
				Class<?> clazz = _fasePostulacionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_fasePostulacionRemoteModel, fechacrea);
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

		if (_fasePostulacionRemoteModel != null) {
			try {
				Class<?> clazz = _fasePostulacionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_fasePostulacionRemoteModel, usuariomodifica);
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

		if (_fasePostulacionRemoteModel != null) {
			try {
				Class<?> clazz = _fasePostulacionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_fasePostulacionRemoteModel, fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFasePostulacionRemoteModel() {
		return _fasePostulacionRemoteModel;
	}

	public void setFasePostulacionRemoteModel(
		BaseModel<?> fasePostulacionRemoteModel) {
		_fasePostulacionRemoteModel = fasePostulacionRemoteModel;
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

		Class<?> remoteModelClass = _fasePostulacionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_fasePostulacionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FasePostulacionLocalServiceUtil.addFasePostulacion(this);
		}
		else {
			FasePostulacionLocalServiceUtil.updateFasePostulacion(this);
		}
	}

	@Override
	public FasePostulacion toEscapedModel() {
		return (FasePostulacion)ProxyUtil.newProxyInstance(FasePostulacion.class.getClassLoader(),
			new Class[] { FasePostulacion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FasePostulacionClp clone = new FasePostulacionClp();

		clone.setFasePostulacionId(getFasePostulacionId());
		clone.setSolicitudRequerimientoId(getSolicitudRequerimientoId());
		clone.setUsuarioId(getUsuarioId());
		clone.setFechaFase(getFechaFase());
		clone.setTipoFase(getTipoFase());
		clone.setDescripcion(getDescripcion());
		clone.setEstado(getEstado());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(FasePostulacion fasePostulacion) {
		int value = 0;

		value = DateUtil.compareTo(getFechacreamodifica(),
				fasePostulacion.getFechacreamodifica());

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

		if (!(obj instanceof FasePostulacionClp)) {
			return false;
		}

		FasePostulacionClp fasePostulacion = (FasePostulacionClp)obj;

		long primaryKey = fasePostulacion.getPrimaryKey();

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

		sb.append("{fasePostulacionId=");
		sb.append(getFasePostulacionId());
		sb.append(", solicitudRequerimientoId=");
		sb.append(getSolicitudRequerimientoId());
		sb.append(", usuarioId=");
		sb.append(getUsuarioId());
		sb.append(", fechaFase=");
		sb.append(getFechaFase());
		sb.append(", tipoFase=");
		sb.append(getTipoFase());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.FasePostulacion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>fasePostulacionId</column-name><column-value><![CDATA[");
		sb.append(getFasePostulacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>solicitudRequerimientoId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudRequerimientoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaFase</column-name><column-value><![CDATA[");
		sb.append(getFechaFase());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipoFase</column-name><column-value><![CDATA[");
		sb.append(getTipoFase());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
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

	private long _fasePostulacionId;
	private long _solicitudRequerimientoId;
	private long _usuarioId;
	private Date _fechaFase;
	private long _tipoFase;
	private String _descripcion;
	private long _estado;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _fasePostulacionRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
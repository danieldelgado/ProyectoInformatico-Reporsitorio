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
import com.hitss.layer.service.SolicitudRequerimientoRequisitoLocalServiceUtil;
import com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK;

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
public class SolicitudRequerimientoRequisitoClp extends BaseModelImpl<SolicitudRequerimientoRequisito>
	implements SolicitudRequerimientoRequisito {
	public SolicitudRequerimientoRequisitoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return SolicitudRequerimientoRequisito.class;
	}

	@Override
	public String getModelClassName() {
		return SolicitudRequerimientoRequisito.class.getName();
	}

	@Override
	public SolicitudRequerimientoRequisitoPK getPrimaryKey() {
		return new SolicitudRequerimientoRequisitoPK(_solicitudRequerimientoId,
			_tagId);
	}

	@Override
	public void setPrimaryKey(SolicitudRequerimientoRequisitoPK primaryKey) {
		setSolicitudRequerimientoId(primaryKey.solicitudRequerimientoId);
		setTagId(primaryKey.tagId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new SolicitudRequerimientoRequisitoPK(_solicitudRequerimientoId,
			_tagId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((SolicitudRequerimientoRequisitoPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudRequerimientoId", getSolicitudRequerimientoId());
		attributes.put("tagId", getTagId());
		attributes.put("nivel", getNivel());
		attributes.put("exigible", getExigible());
		attributes.put("tipoRequisito", getTipoRequisito());
		attributes.put("herramienta", getHerramienta());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long solicitudRequerimientoId = (Long)attributes.get(
				"solicitudRequerimientoId");

		if (solicitudRequerimientoId != null) {
			setSolicitudRequerimientoId(solicitudRequerimientoId);
		}

		Long tagId = (Long)attributes.get("tagId");

		if (tagId != null) {
			setTagId(tagId);
		}

		Long nivel = (Long)attributes.get("nivel");

		if (nivel != null) {
			setNivel(nivel);
		}

		Boolean exigible = (Boolean)attributes.get("exigible");

		if (exigible != null) {
			setExigible(exigible);
		}

		Long tipoRequisito = (Long)attributes.get("tipoRequisito");

		if (tipoRequisito != null) {
			setTipoRequisito(tipoRequisito);
		}

		Long herramienta = (Long)attributes.get("herramienta");

		if (herramienta != null) {
			setHerramienta(herramienta);
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
	public long getSolicitudRequerimientoId() {
		return _solicitudRequerimientoId;
	}

	@Override
	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_solicitudRequerimientoId = solicitudRequerimientoId;

		if (_solicitudRequerimientoRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setSolicitudRequerimientoId",
						long.class);

				method.invoke(_solicitudRequerimientoRequisitoRemoteModel,
					solicitudRequerimientoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTagId() {
		return _tagId;
	}

	@Override
	public void setTagId(long tagId) {
		_tagId = tagId;

		if (_solicitudRequerimientoRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setTagId", long.class);

				method.invoke(_solicitudRequerimientoRequisitoRemoteModel, tagId);
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

		if (_solicitudRequerimientoRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setNivel", long.class);

				method.invoke(_solicitudRequerimientoRequisitoRemoteModel, nivel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getExigible() {
		return _exigible;
	}

	@Override
	public boolean isExigible() {
		return _exigible;
	}

	@Override
	public void setExigible(boolean exigible) {
		_exigible = exigible;

		if (_solicitudRequerimientoRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setExigible", boolean.class);

				method.invoke(_solicitudRequerimientoRequisitoRemoteModel,
					exigible);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTipoRequisito() {
		return _tipoRequisito;
	}

	@Override
	public void setTipoRequisito(long tipoRequisito) {
		_tipoRequisito = tipoRequisito;

		if (_solicitudRequerimientoRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setTipoRequisito", long.class);

				method.invoke(_solicitudRequerimientoRequisitoRemoteModel,
					tipoRequisito);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHerramienta() {
		return _herramienta;
	}

	@Override
	public void setHerramienta(long herramienta) {
		_herramienta = herramienta;

		if (_solicitudRequerimientoRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setHerramienta", long.class);

				method.invoke(_solicitudRequerimientoRequisitoRemoteModel,
					herramienta);
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

		if (_solicitudRequerimientoRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_solicitudRequerimientoRequisitoRemoteModel,
					activo);
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

		if (_solicitudRequerimientoRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_solicitudRequerimientoRequisitoRemoteModel,
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

		if (_solicitudRequerimientoRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_solicitudRequerimientoRequisitoRemoteModel,
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

		if (_solicitudRequerimientoRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_solicitudRequerimientoRequisitoRemoteModel,
					usuariomodifica);
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

		if (_solicitudRequerimientoRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechamodifica", Date.class);

				method.invoke(_solicitudRequerimientoRequisitoRemoteModel,
					fechamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSolicitudRequerimientoRequisitoRemoteModel() {
		return _solicitudRequerimientoRequisitoRemoteModel;
	}

	public void setSolicitudRequerimientoRequisitoRemoteModel(
		BaseModel<?> solicitudRequerimientoRequisitoRemoteModel) {
		_solicitudRequerimientoRequisitoRemoteModel = solicitudRequerimientoRequisitoRemoteModel;
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

		Class<?> remoteModelClass = _solicitudRequerimientoRequisitoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_solicitudRequerimientoRequisitoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SolicitudRequerimientoRequisitoLocalServiceUtil.addSolicitudRequerimientoRequisito(this);
		}
		else {
			SolicitudRequerimientoRequisitoLocalServiceUtil.updateSolicitudRequerimientoRequisito(this);
		}
	}

	@Override
	public SolicitudRequerimientoRequisito toEscapedModel() {
		return (SolicitudRequerimientoRequisito)ProxyUtil.newProxyInstance(SolicitudRequerimientoRequisito.class.getClassLoader(),
			new Class[] { SolicitudRequerimientoRequisito.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SolicitudRequerimientoRequisitoClp clone = new SolicitudRequerimientoRequisitoClp();

		clone.setSolicitudRequerimientoId(getSolicitudRequerimientoId());
		clone.setTagId(getTagId());
		clone.setNivel(getNivel());
		clone.setExigible(getExigible());
		clone.setTipoRequisito(getTipoRequisito());
		clone.setHerramienta(getHerramienta());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechamodifica(getFechamodifica());

		return clone;
	}

	@Override
	public int compareTo(
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				solicitudRequerimientoRequisito.getFechamodifica());

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

		if (!(obj instanceof SolicitudRequerimientoRequisitoClp)) {
			return false;
		}

		SolicitudRequerimientoRequisitoClp solicitudRequerimientoRequisito = (SolicitudRequerimientoRequisitoClp)obj;

		SolicitudRequerimientoRequisitoPK primaryKey = solicitudRequerimientoRequisito.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{solicitudRequerimientoId=");
		sb.append(getSolicitudRequerimientoId());
		sb.append(", tagId=");
		sb.append(getTagId());
		sb.append(", nivel=");
		sb.append(getNivel());
		sb.append(", exigible=");
		sb.append(getExigible());
		sb.append(", tipoRequisito=");
		sb.append(getTipoRequisito());
		sb.append(", herramienta=");
		sb.append(getHerramienta());
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
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.SolicitudRequerimientoRequisito");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>solicitudRequerimientoId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudRequerimientoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tagId</column-name><column-value><![CDATA[");
		sb.append(getTagId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nivel</column-name><column-value><![CDATA[");
		sb.append(getNivel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exigible</column-name><column-value><![CDATA[");
		sb.append(getExigible());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipoRequisito</column-name><column-value><![CDATA[");
		sb.append(getTipoRequisito());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>herramienta</column-name><column-value><![CDATA[");
		sb.append(getHerramienta());
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

	private long _solicitudRequerimientoId;
	private long _tagId;
	private long _nivel;
	private boolean _exigible;
	private long _tipoRequisito;
	private long _herramienta;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private BaseModel<?> _solicitudRequerimientoRequisitoRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
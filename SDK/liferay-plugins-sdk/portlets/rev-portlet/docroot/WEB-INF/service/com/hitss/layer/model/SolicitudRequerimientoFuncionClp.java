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
import com.hitss.layer.service.SolicitudRequerimientoFuncionLocalServiceUtil;
import com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK;

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
public class SolicitudRequerimientoFuncionClp extends BaseModelImpl<SolicitudRequerimientoFuncion>
	implements SolicitudRequerimientoFuncion {
	public SolicitudRequerimientoFuncionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return SolicitudRequerimientoFuncion.class;
	}

	@Override
	public String getModelClassName() {
		return SolicitudRequerimientoFuncion.class.getName();
	}

	@Override
	public SolicitudRequerimientoFuncionPK getPrimaryKey() {
		return new SolicitudRequerimientoFuncionPK(_solicitudFuncionId,
			_funcionId);
	}

	@Override
	public void setPrimaryKey(SolicitudRequerimientoFuncionPK primaryKey) {
		setSolicitudFuncionId(primaryKey.solicitudFuncionId);
		setFuncionId(primaryKey.funcionId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new SolicitudRequerimientoFuncionPK(_solicitudFuncionId,
			_funcionId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((SolicitudRequerimientoFuncionPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudFuncionId", getSolicitudFuncionId());
		attributes.put("funcionId", getFuncionId());
		attributes.put("exigible", getExigible());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long solicitudFuncionId = (Long)attributes.get("solicitudFuncionId");

		if (solicitudFuncionId != null) {
			setSolicitudFuncionId(solicitudFuncionId);
		}

		Long funcionId = (Long)attributes.get("funcionId");

		if (funcionId != null) {
			setFuncionId(funcionId);
		}

		Boolean exigible = (Boolean)attributes.get("exigible");

		if (exigible != null) {
			setExigible(exigible);
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
	public long getSolicitudFuncionId() {
		return _solicitudFuncionId;
	}

	@Override
	public void setSolicitudFuncionId(long solicitudFuncionId) {
		_solicitudFuncionId = solicitudFuncionId;

		if (_solicitudRequerimientoFuncionRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoFuncionRemoteModel.getClass();

				Method method = clazz.getMethod("setSolicitudFuncionId",
						long.class);

				method.invoke(_solicitudRequerimientoFuncionRemoteModel,
					solicitudFuncionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFuncionId() {
		return _funcionId;
	}

	@Override
	public void setFuncionId(long funcionId) {
		_funcionId = funcionId;

		if (_solicitudRequerimientoFuncionRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoFuncionRemoteModel.getClass();

				Method method = clazz.getMethod("setFuncionId", long.class);

				method.invoke(_solicitudRequerimientoFuncionRemoteModel,
					funcionId);
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

		if (_solicitudRequerimientoFuncionRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoFuncionRemoteModel.getClass();

				Method method = clazz.getMethod("setExigible", boolean.class);

				method.invoke(_solicitudRequerimientoFuncionRemoteModel,
					exigible);
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

		if (_solicitudRequerimientoFuncionRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoFuncionRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_solicitudRequerimientoFuncionRemoteModel, activo);
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

		if (_solicitudRequerimientoFuncionRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoFuncionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_solicitudRequerimientoFuncionRemoteModel,
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

		if (_solicitudRequerimientoFuncionRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoFuncionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_solicitudRequerimientoFuncionRemoteModel,
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

		if (_solicitudRequerimientoFuncionRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoFuncionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_solicitudRequerimientoFuncionRemoteModel,
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

		if (_solicitudRequerimientoFuncionRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoFuncionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechamodifica", Date.class);

				method.invoke(_solicitudRequerimientoFuncionRemoteModel,
					fechamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSolicitudRequerimientoFuncionRemoteModel() {
		return _solicitudRequerimientoFuncionRemoteModel;
	}

	public void setSolicitudRequerimientoFuncionRemoteModel(
		BaseModel<?> solicitudRequerimientoFuncionRemoteModel) {
		_solicitudRequerimientoFuncionRemoteModel = solicitudRequerimientoFuncionRemoteModel;
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

		Class<?> remoteModelClass = _solicitudRequerimientoFuncionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_solicitudRequerimientoFuncionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SolicitudRequerimientoFuncionLocalServiceUtil.addSolicitudRequerimientoFuncion(this);
		}
		else {
			SolicitudRequerimientoFuncionLocalServiceUtil.updateSolicitudRequerimientoFuncion(this);
		}
	}

	@Override
	public SolicitudRequerimientoFuncion toEscapedModel() {
		return (SolicitudRequerimientoFuncion)ProxyUtil.newProxyInstance(SolicitudRequerimientoFuncion.class.getClassLoader(),
			new Class[] { SolicitudRequerimientoFuncion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SolicitudRequerimientoFuncionClp clone = new SolicitudRequerimientoFuncionClp();

		clone.setSolicitudFuncionId(getSolicitudFuncionId());
		clone.setFuncionId(getFuncionId());
		clone.setExigible(getExigible());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechamodifica(getFechamodifica());

		return clone;
	}

	@Override
	public int compareTo(
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				solicitudRequerimientoFuncion.getFechamodifica());

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

		if (!(obj instanceof SolicitudRequerimientoFuncionClp)) {
			return false;
		}

		SolicitudRequerimientoFuncionClp solicitudRequerimientoFuncion = (SolicitudRequerimientoFuncionClp)obj;

		SolicitudRequerimientoFuncionPK primaryKey = solicitudRequerimientoFuncion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{solicitudFuncionId=");
		sb.append(getSolicitudFuncionId());
		sb.append(", funcionId=");
		sb.append(getFuncionId());
		sb.append(", exigible=");
		sb.append(getExigible());
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
		sb.append("com.hitss.layer.model.SolicitudRequerimientoFuncion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>solicitudFuncionId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudFuncionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>funcionId</column-name><column-value><![CDATA[");
		sb.append(getFuncionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exigible</column-name><column-value><![CDATA[");
		sb.append(getExigible());
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

	private long _solicitudFuncionId;
	private long _funcionId;
	private boolean _exigible;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private BaseModel<?> _solicitudRequerimientoFuncionRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
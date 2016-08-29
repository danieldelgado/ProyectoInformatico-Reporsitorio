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
import com.hitss.layer.service.RegistrarActividadPlanUsuarioLocalServiceUtil;
import com.hitss.layer.service.persistence.RegistrarActividadPlanUsuarioPK;

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
public class RegistrarActividadPlanUsuarioClp extends BaseModelImpl<RegistrarActividadPlanUsuario>
	implements RegistrarActividadPlanUsuario {
	public RegistrarActividadPlanUsuarioClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return RegistrarActividadPlanUsuario.class;
	}

	@Override
	public String getModelClassName() {
		return RegistrarActividadPlanUsuario.class.getName();
	}

	@Override
	public RegistrarActividadPlanUsuarioPK getPrimaryKey() {
		return new RegistrarActividadPlanUsuarioPK(_actividadPlanId,
			_regisitrarActividadPlanUsuariocoId);
	}

	@Override
	public void setPrimaryKey(RegistrarActividadPlanUsuarioPK primaryKey) {
		setActividadPlanId(primaryKey.actividadPlanId);
		setRegisitrarActividadPlanUsuariocoId(primaryKey.regisitrarActividadPlanUsuariocoId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new RegistrarActividadPlanUsuarioPK(_actividadPlanId,
			_regisitrarActividadPlanUsuariocoId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((RegistrarActividadPlanUsuarioPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("actividadPlanId", getActividadPlanId());
		attributes.put("regisitrarActividadPlanUsuariocoId",
			getRegisitrarActividadPlanUsuariocoId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("cumplio", getCumplio());
		attributes.put("actividad", getActividad());
		attributes.put("puntuacion", getPuntuacion());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long actividadPlanId = (Long)attributes.get("actividadPlanId");

		if (actividadPlanId != null) {
			setActividadPlanId(actividadPlanId);
		}

		Long regisitrarActividadPlanUsuariocoId = (Long)attributes.get(
				"regisitrarActividadPlanUsuariocoId");

		if (regisitrarActividadPlanUsuariocoId != null) {
			setRegisitrarActividadPlanUsuariocoId(regisitrarActividadPlanUsuariocoId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		Long cumplio = (Long)attributes.get("cumplio");

		if (cumplio != null) {
			setCumplio(cumplio);
		}

		String actividad = (String)attributes.get("actividad");

		if (actividad != null) {
			setActividad(actividad);
		}

		Integer puntuacion = (Integer)attributes.get("puntuacion");

		if (puntuacion != null) {
			setPuntuacion(puntuacion);
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
	public long getActividadPlanId() {
		return _actividadPlanId;
	}

	@Override
	public void setActividadPlanId(long actividadPlanId) {
		_actividadPlanId = actividadPlanId;

		if (_registrarActividadPlanUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _registrarActividadPlanUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setActividadPlanId", long.class);

				method.invoke(_registrarActividadPlanUsuarioRemoteModel,
					actividadPlanId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRegisitrarActividadPlanUsuariocoId() {
		return _regisitrarActividadPlanUsuariocoId;
	}

	@Override
	public void setRegisitrarActividadPlanUsuariocoId(
		long regisitrarActividadPlanUsuariocoId) {
		_regisitrarActividadPlanUsuariocoId = regisitrarActividadPlanUsuariocoId;

		if (_registrarActividadPlanUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _registrarActividadPlanUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisitrarActividadPlanUsuariocoId",
						long.class);

				method.invoke(_registrarActividadPlanUsuarioRemoteModel,
					regisitrarActividadPlanUsuariocoId);
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

		if (_registrarActividadPlanUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _registrarActividadPlanUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioId", long.class);

				method.invoke(_registrarActividadPlanUsuarioRemoteModel,
					usuarioId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCumplio() {
		return _cumplio;
	}

	@Override
	public void setCumplio(long cumplio) {
		_cumplio = cumplio;

		if (_registrarActividadPlanUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _registrarActividadPlanUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setCumplio", long.class);

				method.invoke(_registrarActividadPlanUsuarioRemoteModel, cumplio);
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

		if (_registrarActividadPlanUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _registrarActividadPlanUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setActividad", String.class);

				method.invoke(_registrarActividadPlanUsuarioRemoteModel,
					actividad);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPuntuacion() {
		return _puntuacion;
	}

	@Override
	public void setPuntuacion(int puntuacion) {
		_puntuacion = puntuacion;

		if (_registrarActividadPlanUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _registrarActividadPlanUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setPuntuacion", int.class);

				method.invoke(_registrarActividadPlanUsuarioRemoteModel,
					puntuacion);
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

		if (_registrarActividadPlanUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _registrarActividadPlanUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_registrarActividadPlanUsuarioRemoteModel, activo);
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

		if (_registrarActividadPlanUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _registrarActividadPlanUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_registrarActividadPlanUsuarioRemoteModel,
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

		if (_registrarActividadPlanUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _registrarActividadPlanUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_registrarActividadPlanUsuarioRemoteModel,
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

		if (_registrarActividadPlanUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _registrarActividadPlanUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_registrarActividadPlanUsuarioRemoteModel,
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

		if (_registrarActividadPlanUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _registrarActividadPlanUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setFechamodifica", Date.class);

				method.invoke(_registrarActividadPlanUsuarioRemoteModel,
					fechamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRegistrarActividadPlanUsuarioRemoteModel() {
		return _registrarActividadPlanUsuarioRemoteModel;
	}

	public void setRegistrarActividadPlanUsuarioRemoteModel(
		BaseModel<?> registrarActividadPlanUsuarioRemoteModel) {
		_registrarActividadPlanUsuarioRemoteModel = registrarActividadPlanUsuarioRemoteModel;
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

		Class<?> remoteModelClass = _registrarActividadPlanUsuarioRemoteModel.getClass();

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

		Object returnValue = method.invoke(_registrarActividadPlanUsuarioRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RegistrarActividadPlanUsuarioLocalServiceUtil.addRegistrarActividadPlanUsuario(this);
		}
		else {
			RegistrarActividadPlanUsuarioLocalServiceUtil.updateRegistrarActividadPlanUsuario(this);
		}
	}

	@Override
	public RegistrarActividadPlanUsuario toEscapedModel() {
		return (RegistrarActividadPlanUsuario)ProxyUtil.newProxyInstance(RegistrarActividadPlanUsuario.class.getClassLoader(),
			new Class[] { RegistrarActividadPlanUsuario.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RegistrarActividadPlanUsuarioClp clone = new RegistrarActividadPlanUsuarioClp();

		clone.setActividadPlanId(getActividadPlanId());
		clone.setRegisitrarActividadPlanUsuariocoId(getRegisitrarActividadPlanUsuariocoId());
		clone.setUsuarioId(getUsuarioId());
		clone.setCumplio(getCumplio());
		clone.setActividad(getActividad());
		clone.setPuntuacion(getPuntuacion());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechamodifica(getFechamodifica());

		return clone;
	}

	@Override
	public int compareTo(
		RegistrarActividadPlanUsuario registrarActividadPlanUsuario) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				registrarActividadPlanUsuario.getFechamodifica());

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

		if (!(obj instanceof RegistrarActividadPlanUsuarioClp)) {
			return false;
		}

		RegistrarActividadPlanUsuarioClp registrarActividadPlanUsuario = (RegistrarActividadPlanUsuarioClp)obj;

		RegistrarActividadPlanUsuarioPK primaryKey = registrarActividadPlanUsuario.getPrimaryKey();

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

		sb.append("{actividadPlanId=");
		sb.append(getActividadPlanId());
		sb.append(", regisitrarActividadPlanUsuariocoId=");
		sb.append(getRegisitrarActividadPlanUsuariocoId());
		sb.append(", usuarioId=");
		sb.append(getUsuarioId());
		sb.append(", cumplio=");
		sb.append(getCumplio());
		sb.append(", actividad=");
		sb.append(getActividad());
		sb.append(", puntuacion=");
		sb.append(getPuntuacion());
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
		sb.append("com.hitss.layer.model.RegistrarActividadPlanUsuario");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>actividadPlanId</column-name><column-value><![CDATA[");
		sb.append(getActividadPlanId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>regisitrarActividadPlanUsuariocoId</column-name><column-value><![CDATA[");
		sb.append(getRegisitrarActividadPlanUsuariocoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cumplio</column-name><column-value><![CDATA[");
		sb.append(getCumplio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actividad</column-name><column-value><![CDATA[");
		sb.append(getActividad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>puntuacion</column-name><column-value><![CDATA[");
		sb.append(getPuntuacion());
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

	private long _actividadPlanId;
	private long _regisitrarActividadPlanUsuariocoId;
	private long _usuarioId;
	private long _cumplio;
	private String _actividad;
	private int _puntuacion;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private BaseModel<?> _registrarActividadPlanUsuarioRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
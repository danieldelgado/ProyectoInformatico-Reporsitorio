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

import com.hitss.layer.service.ActividadPlanAccionUsuarioLocalServiceUtil;
import com.hitss.layer.service.ClpSerializer;
import com.hitss.layer.service.persistence.ActividadPlanAccionUsuarioPK;

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
public class ActividadPlanAccionUsuarioClp extends BaseModelImpl<ActividadPlanAccionUsuario>
	implements ActividadPlanAccionUsuario {
	public ActividadPlanAccionUsuarioClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ActividadPlanAccionUsuario.class;
	}

	@Override
	public String getModelClassName() {
		return ActividadPlanAccionUsuario.class.getName();
	}

	@Override
	public ActividadPlanAccionUsuarioPK getPrimaryKey() {
		return new ActividadPlanAccionUsuarioPK(_actividadPlanAccionUsuariocoId,
			_actividadPlanId);
	}

	@Override
	public void setPrimaryKey(ActividadPlanAccionUsuarioPK primaryKey) {
		setActividadPlanAccionUsuariocoId(primaryKey.actividadPlanAccionUsuariocoId);
		setActividadPlanId(primaryKey.actividadPlanId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new ActividadPlanAccionUsuarioPK(_actividadPlanAccionUsuariocoId,
			_actividadPlanId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((ActividadPlanAccionUsuarioPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("actividadPlanAccionUsuariocoId",
			getActividadPlanAccionUsuariocoId());
		attributes.put("actividadPlanId", getActividadPlanId());
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
		Long actividadPlanAccionUsuariocoId = (Long)attributes.get(
				"actividadPlanAccionUsuariocoId");

		if (actividadPlanAccionUsuariocoId != null) {
			setActividadPlanAccionUsuariocoId(actividadPlanAccionUsuariocoId);
		}

		Long actividadPlanId = (Long)attributes.get("actividadPlanId");

		if (actividadPlanId != null) {
			setActividadPlanId(actividadPlanId);
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
	public long getActividadPlanAccionUsuariocoId() {
		return _actividadPlanAccionUsuariocoId;
	}

	@Override
	public void setActividadPlanAccionUsuariocoId(
		long actividadPlanAccionUsuariocoId) {
		_actividadPlanAccionUsuariocoId = actividadPlanAccionUsuariocoId;

		if (_actividadPlanAccionUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanAccionUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setActividadPlanAccionUsuariocoId",
						long.class);

				method.invoke(_actividadPlanAccionUsuarioRemoteModel,
					actividadPlanAccionUsuariocoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getActividadPlanId() {
		return _actividadPlanId;
	}

	@Override
	public void setActividadPlanId(long actividadPlanId) {
		_actividadPlanId = actividadPlanId;

		if (_actividadPlanAccionUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanAccionUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setActividadPlanId", long.class);

				method.invoke(_actividadPlanAccionUsuarioRemoteModel,
					actividadPlanId);
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

		if (_actividadPlanAccionUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanAccionUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioId", long.class);

				method.invoke(_actividadPlanAccionUsuarioRemoteModel, usuarioId);
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

		if (_actividadPlanAccionUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanAccionUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setCumplio", long.class);

				method.invoke(_actividadPlanAccionUsuarioRemoteModel, cumplio);
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

		if (_actividadPlanAccionUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanAccionUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setActividad", String.class);

				method.invoke(_actividadPlanAccionUsuarioRemoteModel, actividad);
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

		if (_actividadPlanAccionUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanAccionUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setPuntuacion", int.class);

				method.invoke(_actividadPlanAccionUsuarioRemoteModel, puntuacion);
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

		if (_actividadPlanAccionUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanAccionUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_actividadPlanAccionUsuarioRemoteModel, activo);
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

		if (_actividadPlanAccionUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanAccionUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_actividadPlanAccionUsuarioRemoteModel,
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

		if (_actividadPlanAccionUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanAccionUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_actividadPlanAccionUsuarioRemoteModel, fechacrea);
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

		if (_actividadPlanAccionUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanAccionUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_actividadPlanAccionUsuarioRemoteModel,
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

		if (_actividadPlanAccionUsuarioRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanAccionUsuarioRemoteModel.getClass();

				Method method = clazz.getMethod("setFechamodifica", Date.class);

				method.invoke(_actividadPlanAccionUsuarioRemoteModel,
					fechamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getActividadPlanAccionUsuarioRemoteModel() {
		return _actividadPlanAccionUsuarioRemoteModel;
	}

	public void setActividadPlanAccionUsuarioRemoteModel(
		BaseModel<?> actividadPlanAccionUsuarioRemoteModel) {
		_actividadPlanAccionUsuarioRemoteModel = actividadPlanAccionUsuarioRemoteModel;
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

		Class<?> remoteModelClass = _actividadPlanAccionUsuarioRemoteModel.getClass();

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

		Object returnValue = method.invoke(_actividadPlanAccionUsuarioRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ActividadPlanAccionUsuarioLocalServiceUtil.addActividadPlanAccionUsuario(this);
		}
		else {
			ActividadPlanAccionUsuarioLocalServiceUtil.updateActividadPlanAccionUsuario(this);
		}
	}

	@Override
	public ActividadPlanAccionUsuario toEscapedModel() {
		return (ActividadPlanAccionUsuario)ProxyUtil.newProxyInstance(ActividadPlanAccionUsuario.class.getClassLoader(),
			new Class[] { ActividadPlanAccionUsuario.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ActividadPlanAccionUsuarioClp clone = new ActividadPlanAccionUsuarioClp();

		clone.setActividadPlanAccionUsuariocoId(getActividadPlanAccionUsuariocoId());
		clone.setActividadPlanId(getActividadPlanId());
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
	public int compareTo(ActividadPlanAccionUsuario actividadPlanAccionUsuario) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				actividadPlanAccionUsuario.getFechamodifica());

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

		if (!(obj instanceof ActividadPlanAccionUsuarioClp)) {
			return false;
		}

		ActividadPlanAccionUsuarioClp actividadPlanAccionUsuario = (ActividadPlanAccionUsuarioClp)obj;

		ActividadPlanAccionUsuarioPK primaryKey = actividadPlanAccionUsuario.getPrimaryKey();

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

		sb.append("{actividadPlanAccionUsuariocoId=");
		sb.append(getActividadPlanAccionUsuariocoId());
		sb.append(", actividadPlanId=");
		sb.append(getActividadPlanId());
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
		sb.append("com.hitss.layer.model.ActividadPlanAccionUsuario");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>actividadPlanAccionUsuariocoId</column-name><column-value><![CDATA[");
		sb.append(getActividadPlanAccionUsuariocoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actividadPlanId</column-name><column-value><![CDATA[");
		sb.append(getActividadPlanId());
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

	private long _actividadPlanAccionUsuariocoId;
	private long _actividadPlanId;
	private long _usuarioId;
	private long _cumplio;
	private String _actividad;
	private int _puntuacion;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private BaseModel<?> _actividadPlanAccionUsuarioRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
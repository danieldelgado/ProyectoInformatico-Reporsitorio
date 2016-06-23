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

import com.hitss.layer.service.ActividadPlanLocalServiceUtil;
import com.hitss.layer.service.ClpSerializer;

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
public class ActividadPlanClp extends BaseModelImpl<ActividadPlan>
	implements ActividadPlan {
	public ActividadPlanClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ActividadPlan.class;
	}

	@Override
	public String getModelClassName() {
		return ActividadPlan.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _actividadPlanId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setActividadPlanId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _actividadPlanId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("actividadPlanId", getActividadPlanId());
		attributes.put("planAccionId", getPlanAccionId());
		attributes.put("responsable", getResponsable());
		attributes.put("actividad", getActividad());
		attributes.put("evidencia", getEvidencia());
		attributes.put("objetivo", getObjetivo());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long actividadPlanId = (Long)attributes.get("actividadPlanId");

		if (actividadPlanId != null) {
			setActividadPlanId(actividadPlanId);
		}

		Long planAccionId = (Long)attributes.get("planAccionId");

		if (planAccionId != null) {
			setPlanAccionId(planAccionId);
		}

		Long responsable = (Long)attributes.get("responsable");

		if (responsable != null) {
			setResponsable(responsable);
		}

		String actividad = (String)attributes.get("actividad");

		if (actividad != null) {
			setActividad(actividad);
		}

		String evidencia = (String)attributes.get("evidencia");

		if (evidencia != null) {
			setEvidencia(evidencia);
		}

		String objetivo = (String)attributes.get("objetivo");

		if (objetivo != null) {
			setObjetivo(objetivo);
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
	public long getActividadPlanId() {
		return _actividadPlanId;
	}

	@Override
	public void setActividadPlanId(long actividadPlanId) {
		_actividadPlanId = actividadPlanId;

		if (_actividadPlanRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanRemoteModel.getClass();

				Method method = clazz.getMethod("setActividadPlanId", long.class);

				method.invoke(_actividadPlanRemoteModel, actividadPlanId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPlanAccionId() {
		return _planAccionId;
	}

	@Override
	public void setPlanAccionId(long planAccionId) {
		_planAccionId = planAccionId;

		if (_actividadPlanRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanRemoteModel.getClass();

				Method method = clazz.getMethod("setPlanAccionId", long.class);

				method.invoke(_actividadPlanRemoteModel, planAccionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getResponsable() {
		return _responsable;
	}

	@Override
	public void setResponsable(long responsable) {
		_responsable = responsable;

		if (_actividadPlanRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanRemoteModel.getClass();

				Method method = clazz.getMethod("setResponsable", long.class);

				method.invoke(_actividadPlanRemoteModel, responsable);
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

		if (_actividadPlanRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanRemoteModel.getClass();

				Method method = clazz.getMethod("setActividad", String.class);

				method.invoke(_actividadPlanRemoteModel, actividad);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEvidencia() {
		return _evidencia;
	}

	@Override
	public void setEvidencia(String evidencia) {
		_evidencia = evidencia;

		if (_actividadPlanRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanRemoteModel.getClass();

				Method method = clazz.getMethod("setEvidencia", String.class);

				method.invoke(_actividadPlanRemoteModel, evidencia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getObjetivo() {
		return _objetivo;
	}

	@Override
	public void setObjetivo(String objetivo) {
		_objetivo = objetivo;

		if (_actividadPlanRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanRemoteModel.getClass();

				Method method = clazz.getMethod("setObjetivo", String.class);

				method.invoke(_actividadPlanRemoteModel, objetivo);
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

		if (_actividadPlanRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_actividadPlanRemoteModel, activo);
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

		if (_actividadPlanRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_actividadPlanRemoteModel, usuariocrea);
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

		if (_actividadPlanRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_actividadPlanRemoteModel, fechacrea);
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

		if (_actividadPlanRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_actividadPlanRemoteModel, usuariomodifica);
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

		if (_actividadPlanRemoteModel != null) {
			try {
				Class<?> clazz = _actividadPlanRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_actividadPlanRemoteModel, fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getActividadPlanRemoteModel() {
		return _actividadPlanRemoteModel;
	}

	public void setActividadPlanRemoteModel(
		BaseModel<?> actividadPlanRemoteModel) {
		_actividadPlanRemoteModel = actividadPlanRemoteModel;
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

		Class<?> remoteModelClass = _actividadPlanRemoteModel.getClass();

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

		Object returnValue = method.invoke(_actividadPlanRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ActividadPlanLocalServiceUtil.addActividadPlan(this);
		}
		else {
			ActividadPlanLocalServiceUtil.updateActividadPlan(this);
		}
	}

	@Override
	public ActividadPlan toEscapedModel() {
		return (ActividadPlan)ProxyUtil.newProxyInstance(ActividadPlan.class.getClassLoader(),
			new Class[] { ActividadPlan.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ActividadPlanClp clone = new ActividadPlanClp();

		clone.setActividadPlanId(getActividadPlanId());
		clone.setPlanAccionId(getPlanAccionId());
		clone.setResponsable(getResponsable());
		clone.setActividad(getActividad());
		clone.setEvidencia(getEvidencia());
		clone.setObjetivo(getObjetivo());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(ActividadPlan actividadPlan) {
		int value = 0;

		value = DateUtil.compareTo(getFechacreamodifica(),
				actividadPlan.getFechacreamodifica());

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

		if (!(obj instanceof ActividadPlanClp)) {
			return false;
		}

		ActividadPlanClp actividadPlan = (ActividadPlanClp)obj;

		long primaryKey = actividadPlan.getPrimaryKey();

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

		sb.append("{actividadPlanId=");
		sb.append(getActividadPlanId());
		sb.append(", planAccionId=");
		sb.append(getPlanAccionId());
		sb.append(", responsable=");
		sb.append(getResponsable());
		sb.append(", actividad=");
		sb.append(getActividad());
		sb.append(", evidencia=");
		sb.append(getEvidencia());
		sb.append(", objetivo=");
		sb.append(getObjetivo());
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
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.ActividadPlan");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>actividadPlanId</column-name><column-value><![CDATA[");
		sb.append(getActividadPlanId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>planAccionId</column-name><column-value><![CDATA[");
		sb.append(getPlanAccionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responsable</column-name><column-value><![CDATA[");
		sb.append(getResponsable());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actividad</column-name><column-value><![CDATA[");
		sb.append(getActividad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evidencia</column-name><column-value><![CDATA[");
		sb.append(getEvidencia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>objetivo</column-name><column-value><![CDATA[");
		sb.append(getObjetivo());
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

	private long _actividadPlanId;
	private long _planAccionId;
	private long _responsable;
	private String _actividad;
	private String _evidencia;
	private String _objetivo;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _actividadPlanRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
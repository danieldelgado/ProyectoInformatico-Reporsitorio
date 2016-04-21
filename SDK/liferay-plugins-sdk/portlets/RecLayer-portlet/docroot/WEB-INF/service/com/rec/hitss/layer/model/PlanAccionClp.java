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
import com.rec.hitss.layer.service.PlanAccionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class PlanAccionClp extends BaseModelImpl<PlanAccion>
	implements PlanAccion {
	public PlanAccionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PlanAccion.class;
	}

	@Override
	public String getModelClassName() {
		return PlanAccion.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _planAccionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPlanAccionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _planAccionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("planAccionId", getPlanAccionId());
		attributes.put("actividadesId", getActividadesId());
		attributes.put("responsable", getResponsable());
		attributes.put("fechaEmitida", getFechaEmitida());
		attributes.put("fechaProgramada", getFechaProgramada());
		attributes.put("aprobadorColaborador", getAprobadorColaborador());
		attributes.put("aprobadorLideres", getAprobadorLideres());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long planAccionId = (Long)attributes.get("planAccionId");

		if (planAccionId != null) {
			setPlanAccionId(planAccionId);
		}

		Long actividadesId = (Long)attributes.get("actividadesId");

		if (actividadesId != null) {
			setActividadesId(actividadesId);
		}

		String responsable = (String)attributes.get("responsable");

		if (responsable != null) {
			setResponsable(responsable);
		}

		Date fechaEmitida = (Date)attributes.get("fechaEmitida");

		if (fechaEmitida != null) {
			setFechaEmitida(fechaEmitida);
		}

		Date fechaProgramada = (Date)attributes.get("fechaProgramada");

		if (fechaProgramada != null) {
			setFechaProgramada(fechaProgramada);
		}

		Boolean aprobadorColaborador = (Boolean)attributes.get(
				"aprobadorColaborador");

		if (aprobadorColaborador != null) {
			setAprobadorColaborador(aprobadorColaborador);
		}

		Boolean aprobadorLideres = (Boolean)attributes.get("aprobadorLideres");

		if (aprobadorLideres != null) {
			setAprobadorLideres(aprobadorLideres);
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
	public long getPlanAccionId() {
		return _planAccionId;
	}

	@Override
	public void setPlanAccionId(long planAccionId) {
		_planAccionId = planAccionId;

		if (_planAccionRemoteModel != null) {
			try {
				Class<?> clazz = _planAccionRemoteModel.getClass();

				Method method = clazz.getMethod("setPlanAccionId", long.class);

				method.invoke(_planAccionRemoteModel, planAccionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getActividadesId() {
		return _actividadesId;
	}

	@Override
	public void setActividadesId(long actividadesId) {
		_actividadesId = actividadesId;

		if (_planAccionRemoteModel != null) {
			try {
				Class<?> clazz = _planAccionRemoteModel.getClass();

				Method method = clazz.getMethod("setActividadesId", long.class);

				method.invoke(_planAccionRemoteModel, actividadesId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResponsable() {
		return _responsable;
	}

	@Override
	public void setResponsable(String responsable) {
		_responsable = responsable;

		if (_planAccionRemoteModel != null) {
			try {
				Class<?> clazz = _planAccionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponsable", String.class);

				method.invoke(_planAccionRemoteModel, responsable);
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

		if (_planAccionRemoteModel != null) {
			try {
				Class<?> clazz = _planAccionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaEmitida", Date.class);

				method.invoke(_planAccionRemoteModel, fechaEmitida);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaProgramada() {
		return _fechaProgramada;
	}

	@Override
	public void setFechaProgramada(Date fechaProgramada) {
		_fechaProgramada = fechaProgramada;

		if (_planAccionRemoteModel != null) {
			try {
				Class<?> clazz = _planAccionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaProgramada", Date.class);

				method.invoke(_planAccionRemoteModel, fechaProgramada);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getAprobadorColaborador() {
		return _aprobadorColaborador;
	}

	@Override
	public boolean isAprobadorColaborador() {
		return _aprobadorColaborador;
	}

	@Override
	public void setAprobadorColaborador(boolean aprobadorColaborador) {
		_aprobadorColaborador = aprobadorColaborador;

		if (_planAccionRemoteModel != null) {
			try {
				Class<?> clazz = _planAccionRemoteModel.getClass();

				Method method = clazz.getMethod("setAprobadorColaborador",
						boolean.class);

				method.invoke(_planAccionRemoteModel, aprobadorColaborador);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getAprobadorLideres() {
		return _aprobadorLideres;
	}

	@Override
	public boolean isAprobadorLideres() {
		return _aprobadorLideres;
	}

	@Override
	public void setAprobadorLideres(boolean aprobadorLideres) {
		_aprobadorLideres = aprobadorLideres;

		if (_planAccionRemoteModel != null) {
			try {
				Class<?> clazz = _planAccionRemoteModel.getClass();

				Method method = clazz.getMethod("setAprobadorLideres",
						boolean.class);

				method.invoke(_planAccionRemoteModel, aprobadorLideres);
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

		if (_planAccionRemoteModel != null) {
			try {
				Class<?> clazz = _planAccionRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_planAccionRemoteModel, activo);
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

		if (_planAccionRemoteModel != null) {
			try {
				Class<?> clazz = _planAccionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_planAccionRemoteModel, usuariocrea);
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

		if (_planAccionRemoteModel != null) {
			try {
				Class<?> clazz = _planAccionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_planAccionRemoteModel, fechacrea);
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

		if (_planAccionRemoteModel != null) {
			try {
				Class<?> clazz = _planAccionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_planAccionRemoteModel, usuariomodifica);
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

		if (_planAccionRemoteModel != null) {
			try {
				Class<?> clazz = _planAccionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_planAccionRemoteModel, fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPlanAccionRemoteModel() {
		return _planAccionRemoteModel;
	}

	public void setPlanAccionRemoteModel(BaseModel<?> planAccionRemoteModel) {
		_planAccionRemoteModel = planAccionRemoteModel;
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

		Class<?> remoteModelClass = _planAccionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_planAccionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PlanAccionLocalServiceUtil.addPlanAccion(this);
		}
		else {
			PlanAccionLocalServiceUtil.updatePlanAccion(this);
		}
	}

	@Override
	public PlanAccion toEscapedModel() {
		return (PlanAccion)ProxyUtil.newProxyInstance(PlanAccion.class.getClassLoader(),
			new Class[] { PlanAccion.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PlanAccionClp clone = new PlanAccionClp();

		clone.setPlanAccionId(getPlanAccionId());
		clone.setActividadesId(getActividadesId());
		clone.setResponsable(getResponsable());
		clone.setFechaEmitida(getFechaEmitida());
		clone.setFechaProgramada(getFechaProgramada());
		clone.setAprobadorColaborador(getAprobadorColaborador());
		clone.setAprobadorLideres(getAprobadorLideres());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(PlanAccion planAccion) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(), planAccion.getFechacrea());

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

		if (!(obj instanceof PlanAccionClp)) {
			return false;
		}

		PlanAccionClp planAccion = (PlanAccionClp)obj;

		long primaryKey = planAccion.getPrimaryKey();

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

		sb.append("{planAccionId=");
		sb.append(getPlanAccionId());
		sb.append(", actividadesId=");
		sb.append(getActividadesId());
		sb.append(", responsable=");
		sb.append(getResponsable());
		sb.append(", fechaEmitida=");
		sb.append(getFechaEmitida());
		sb.append(", fechaProgramada=");
		sb.append(getFechaProgramada());
		sb.append(", aprobadorColaborador=");
		sb.append(getAprobadorColaborador());
		sb.append(", aprobadorLideres=");
		sb.append(getAprobadorLideres());
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
		sb.append("com.rec.hitss.layer.model.PlanAccion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>planAccionId</column-name><column-value><![CDATA[");
		sb.append(getPlanAccionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actividadesId</column-name><column-value><![CDATA[");
		sb.append(getActividadesId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responsable</column-name><column-value><![CDATA[");
		sb.append(getResponsable());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaEmitida</column-name><column-value><![CDATA[");
		sb.append(getFechaEmitida());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaProgramada</column-name><column-value><![CDATA[");
		sb.append(getFechaProgramada());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>aprobadorColaborador</column-name><column-value><![CDATA[");
		sb.append(getAprobadorColaborador());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>aprobadorLideres</column-name><column-value><![CDATA[");
		sb.append(getAprobadorLideres());
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

	private long _planAccionId;
	private long _actividadesId;
	private String _responsable;
	private Date _fechaEmitida;
	private Date _fechaProgramada;
	private boolean _aprobadorColaborador;
	private boolean _aprobadorLideres;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _planAccionRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
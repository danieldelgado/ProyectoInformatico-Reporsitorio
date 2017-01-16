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
import com.hitss.layer.service.PuestoEvaluacionLocalServiceUtil;
import com.hitss.layer.service.persistence.PuestoEvaluacionPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Danielle Delgado
 */
public class PuestoEvaluacionClp extends BaseModelImpl<PuestoEvaluacion>
	implements PuestoEvaluacion {
	public PuestoEvaluacionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PuestoEvaluacion.class;
	}

	@Override
	public String getModelClassName() {
		return PuestoEvaluacion.class.getName();
	}

	@Override
	public PuestoEvaluacionPK getPrimaryKey() {
		return new PuestoEvaluacionPK(_solicitudFuncionId, _evaluacionId);
	}

	@Override
	public void setPrimaryKey(PuestoEvaluacionPK primaryKey) {
		setSolicitudFuncionId(primaryKey.solicitudFuncionId);
		setEvaluacionId(primaryKey.evaluacionId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new PuestoEvaluacionPK(_solicitudFuncionId, _evaluacionId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((PuestoEvaluacionPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudFuncionId", getSolicitudFuncionId());
		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("rangoSuperior", getRangoSuperior());
		attributes.put("rangoInferior", getRangoInferior());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long solicitudFuncionId = (Long)attributes.get("solicitudFuncionId");

		if (solicitudFuncionId != null) {
			setSolicitudFuncionId(solicitudFuncionId);
		}

		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		Double rangoSuperior = (Double)attributes.get("rangoSuperior");

		if (rangoSuperior != null) {
			setRangoSuperior(rangoSuperior);
		}

		Double rangoInferior = (Double)attributes.get("rangoInferior");

		if (rangoInferior != null) {
			setRangoInferior(rangoInferior);
		}
	}

	@Override
	public long getSolicitudFuncionId() {
		return _solicitudFuncionId;
	}

	@Override
	public void setSolicitudFuncionId(long solicitudFuncionId) {
		_solicitudFuncionId = solicitudFuncionId;

		if (_puestoEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _puestoEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setSolicitudFuncionId",
						long.class);

				method.invoke(_puestoEvaluacionRemoteModel, solicitudFuncionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEvaluacionId() {
		return _evaluacionId;
	}

	@Override
	public void setEvaluacionId(long evaluacionId) {
		_evaluacionId = evaluacionId;

		if (_puestoEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _puestoEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setEvaluacionId", long.class);

				method.invoke(_puestoEvaluacionRemoteModel, evaluacionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getRangoSuperior() {
		return _rangoSuperior;
	}

	@Override
	public void setRangoSuperior(double rangoSuperior) {
		_rangoSuperior = rangoSuperior;

		if (_puestoEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _puestoEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setRangoSuperior", double.class);

				method.invoke(_puestoEvaluacionRemoteModel, rangoSuperior);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getRangoInferior() {
		return _rangoInferior;
	}

	@Override
	public void setRangoInferior(double rangoInferior) {
		_rangoInferior = rangoInferior;

		if (_puestoEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _puestoEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setRangoInferior", double.class);

				method.invoke(_puestoEvaluacionRemoteModel, rangoInferior);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPuestoEvaluacionRemoteModel() {
		return _puestoEvaluacionRemoteModel;
	}

	public void setPuestoEvaluacionRemoteModel(
		BaseModel<?> puestoEvaluacionRemoteModel) {
		_puestoEvaluacionRemoteModel = puestoEvaluacionRemoteModel;
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

		Class<?> remoteModelClass = _puestoEvaluacionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_puestoEvaluacionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PuestoEvaluacionLocalServiceUtil.addPuestoEvaluacion(this);
		}
		else {
			PuestoEvaluacionLocalServiceUtil.updatePuestoEvaluacion(this);
		}
	}

	@Override
	public PuestoEvaluacion toEscapedModel() {
		return (PuestoEvaluacion)ProxyUtil.newProxyInstance(PuestoEvaluacion.class.getClassLoader(),
			new Class[] { PuestoEvaluacion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PuestoEvaluacionClp clone = new PuestoEvaluacionClp();

		clone.setSolicitudFuncionId(getSolicitudFuncionId());
		clone.setEvaluacionId(getEvaluacionId());
		clone.setRangoSuperior(getRangoSuperior());
		clone.setRangoInferior(getRangoInferior());

		return clone;
	}

	@Override
	public int compareTo(PuestoEvaluacion puestoEvaluacion) {
		PuestoEvaluacionPK primaryKey = puestoEvaluacion.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PuestoEvaluacionClp)) {
			return false;
		}

		PuestoEvaluacionClp puestoEvaluacion = (PuestoEvaluacionClp)obj;

		PuestoEvaluacionPK primaryKey = puestoEvaluacion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{solicitudFuncionId=");
		sb.append(getSolicitudFuncionId());
		sb.append(", evaluacionId=");
		sb.append(getEvaluacionId());
		sb.append(", rangoSuperior=");
		sb.append(getRangoSuperior());
		sb.append(", rangoInferior=");
		sb.append(getRangoInferior());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.PuestoEvaluacion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>solicitudFuncionId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudFuncionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evaluacionId</column-name><column-value><![CDATA[");
		sb.append(getEvaluacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rangoSuperior</column-name><column-value><![CDATA[");
		sb.append(getRangoSuperior());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rangoInferior</column-name><column-value><![CDATA[");
		sb.append(getRangoInferior());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _solicitudFuncionId;
	private long _evaluacionId;
	private double _rangoSuperior;
	private double _rangoInferior;
	private BaseModel<?> _puestoEvaluacionRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
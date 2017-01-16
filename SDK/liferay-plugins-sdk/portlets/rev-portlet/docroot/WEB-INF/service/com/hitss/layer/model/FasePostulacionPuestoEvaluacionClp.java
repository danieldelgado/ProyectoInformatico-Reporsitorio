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
import com.hitss.layer.service.FasePostulacionPuestoEvaluacionLocalServiceUtil;
import com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK;

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
public class FasePostulacionPuestoEvaluacionClp extends BaseModelImpl<FasePostulacionPuestoEvaluacion>
	implements FasePostulacionPuestoEvaluacion {
	public FasePostulacionPuestoEvaluacionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return FasePostulacionPuestoEvaluacion.class;
	}

	@Override
	public String getModelClassName() {
		return FasePostulacionPuestoEvaluacion.class.getName();
	}

	@Override
	public FasePostulacionPuestoEvaluacionPK getPrimaryKey() {
		return new FasePostulacionPuestoEvaluacionPK(_fasePostulacionId,
			_solicitudFuncionId, _evaluacionId);
	}

	@Override
	public void setPrimaryKey(FasePostulacionPuestoEvaluacionPK primaryKey) {
		setFasePostulacionId(primaryKey.fasePostulacionId);
		setSolicitudFuncionId(primaryKey.solicitudFuncionId);
		setEvaluacionId(primaryKey.evaluacionId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new FasePostulacionPuestoEvaluacionPK(_fasePostulacionId,
			_solicitudFuncionId, _evaluacionId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((FasePostulacionPuestoEvaluacionPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fasePostulacionId", getFasePostulacionId());
		attributes.put("solicitudFuncionId", getSolicitudFuncionId());
		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("resultado", getResultado());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fasePostulacionId = (Long)attributes.get("fasePostulacionId");

		if (fasePostulacionId != null) {
			setFasePostulacionId(fasePostulacionId);
		}

		Long solicitudFuncionId = (Long)attributes.get("solicitudFuncionId");

		if (solicitudFuncionId != null) {
			setSolicitudFuncionId(solicitudFuncionId);
		}

		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		Double resultado = (Double)attributes.get("resultado");

		if (resultado != null) {
			setResultado(resultado);
		}
	}

	@Override
	public long getFasePostulacionId() {
		return _fasePostulacionId;
	}

	@Override
	public void setFasePostulacionId(long fasePostulacionId) {
		_fasePostulacionId = fasePostulacionId;

		if (_fasePostulacionPuestoEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _fasePostulacionPuestoEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setFasePostulacionId",
						long.class);

				method.invoke(_fasePostulacionPuestoEvaluacionRemoteModel,
					fasePostulacionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSolicitudFuncionId() {
		return _solicitudFuncionId;
	}

	@Override
	public void setSolicitudFuncionId(long solicitudFuncionId) {
		_solicitudFuncionId = solicitudFuncionId;

		if (_fasePostulacionPuestoEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _fasePostulacionPuestoEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setSolicitudFuncionId",
						long.class);

				method.invoke(_fasePostulacionPuestoEvaluacionRemoteModel,
					solicitudFuncionId);
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

		if (_fasePostulacionPuestoEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _fasePostulacionPuestoEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setEvaluacionId", long.class);

				method.invoke(_fasePostulacionPuestoEvaluacionRemoteModel,
					evaluacionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getResultado() {
		return _resultado;
	}

	@Override
	public void setResultado(double resultado) {
		_resultado = resultado;

		if (_fasePostulacionPuestoEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _fasePostulacionPuestoEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setResultado", double.class);

				method.invoke(_fasePostulacionPuestoEvaluacionRemoteModel,
					resultado);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFasePostulacionPuestoEvaluacionRemoteModel() {
		return _fasePostulacionPuestoEvaluacionRemoteModel;
	}

	public void setFasePostulacionPuestoEvaluacionRemoteModel(
		BaseModel<?> fasePostulacionPuestoEvaluacionRemoteModel) {
		_fasePostulacionPuestoEvaluacionRemoteModel = fasePostulacionPuestoEvaluacionRemoteModel;
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

		Class<?> remoteModelClass = _fasePostulacionPuestoEvaluacionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_fasePostulacionPuestoEvaluacionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FasePostulacionPuestoEvaluacionLocalServiceUtil.addFasePostulacionPuestoEvaluacion(this);
		}
		else {
			FasePostulacionPuestoEvaluacionLocalServiceUtil.updateFasePostulacionPuestoEvaluacion(this);
		}
	}

	@Override
	public FasePostulacionPuestoEvaluacion toEscapedModel() {
		return (FasePostulacionPuestoEvaluacion)ProxyUtil.newProxyInstance(FasePostulacionPuestoEvaluacion.class.getClassLoader(),
			new Class[] { FasePostulacionPuestoEvaluacion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FasePostulacionPuestoEvaluacionClp clone = new FasePostulacionPuestoEvaluacionClp();

		clone.setFasePostulacionId(getFasePostulacionId());
		clone.setSolicitudFuncionId(getSolicitudFuncionId());
		clone.setEvaluacionId(getEvaluacionId());
		clone.setResultado(getResultado());

		return clone;
	}

	@Override
	public int compareTo(
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion) {
		FasePostulacionPuestoEvaluacionPK primaryKey = fasePostulacionPuestoEvaluacion.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FasePostulacionPuestoEvaluacionClp)) {
			return false;
		}

		FasePostulacionPuestoEvaluacionClp fasePostulacionPuestoEvaluacion = (FasePostulacionPuestoEvaluacionClp)obj;

		FasePostulacionPuestoEvaluacionPK primaryKey = fasePostulacionPuestoEvaluacion.getPrimaryKey();

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

		sb.append("{fasePostulacionId=");
		sb.append(getFasePostulacionId());
		sb.append(", solicitudFuncionId=");
		sb.append(getSolicitudFuncionId());
		sb.append(", evaluacionId=");
		sb.append(getEvaluacionId());
		sb.append(", resultado=");
		sb.append(getResultado());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.FasePostulacionPuestoEvaluacion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>fasePostulacionId</column-name><column-value><![CDATA[");
		sb.append(getFasePostulacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>solicitudFuncionId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudFuncionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evaluacionId</column-name><column-value><![CDATA[");
		sb.append(getEvaluacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resultado</column-name><column-value><![CDATA[");
		sb.append(getResultado());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _fasePostulacionId;
	private long _solicitudFuncionId;
	private long _evaluacionId;
	private double _resultado;
	private BaseModel<?> _fasePostulacionPuestoEvaluacionRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
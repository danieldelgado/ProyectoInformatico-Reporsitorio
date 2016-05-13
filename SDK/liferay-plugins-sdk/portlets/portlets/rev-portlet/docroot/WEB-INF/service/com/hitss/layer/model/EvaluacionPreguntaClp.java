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
import com.hitss.layer.service.EvaluacionPreguntaLocalServiceUtil;
import com.hitss.layer.service.persistence.EvaluacionPreguntaPK;

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
public class EvaluacionPreguntaClp extends BaseModelImpl<EvaluacionPregunta>
	implements EvaluacionPregunta {
	public EvaluacionPreguntaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EvaluacionPregunta.class;
	}

	@Override
	public String getModelClassName() {
		return EvaluacionPregunta.class.getName();
	}

	@Override
	public EvaluacionPreguntaPK getPrimaryKey() {
		return new EvaluacionPreguntaPK(_evaluacionId, _preguntaId);
	}

	@Override
	public void setPrimaryKey(EvaluacionPreguntaPK primaryKey) {
		setEvaluacionId(primaryKey.evaluacionId);
		setPreguntaId(primaryKey.preguntaId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new EvaluacionPreguntaPK(_evaluacionId, _preguntaId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((EvaluacionPreguntaPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("preguntaId", getPreguntaId());
		attributes.put("nivel", getNivel());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		Long preguntaId = (Long)attributes.get("preguntaId");

		if (preguntaId != null) {
			setPreguntaId(preguntaId);
		}

		Long nivel = (Long)attributes.get("nivel");

		if (nivel != null) {
			setNivel(nivel);
		}
	}

	@Override
	public long getEvaluacionId() {
		return _evaluacionId;
	}

	@Override
	public void setEvaluacionId(long evaluacionId) {
		_evaluacionId = evaluacionId;

		if (_evaluacionPreguntaRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionPreguntaRemoteModel.getClass();

				Method method = clazz.getMethod("setEvaluacionId", long.class);

				method.invoke(_evaluacionPreguntaRemoteModel, evaluacionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPreguntaId() {
		return _preguntaId;
	}

	@Override
	public void setPreguntaId(long preguntaId) {
		_preguntaId = preguntaId;

		if (_evaluacionPreguntaRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionPreguntaRemoteModel.getClass();

				Method method = clazz.getMethod("setPreguntaId", long.class);

				method.invoke(_evaluacionPreguntaRemoteModel, preguntaId);
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

		if (_evaluacionPreguntaRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionPreguntaRemoteModel.getClass();

				Method method = clazz.getMethod("setNivel", long.class);

				method.invoke(_evaluacionPreguntaRemoteModel, nivel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEvaluacionPreguntaRemoteModel() {
		return _evaluacionPreguntaRemoteModel;
	}

	public void setEvaluacionPreguntaRemoteModel(
		BaseModel<?> evaluacionPreguntaRemoteModel) {
		_evaluacionPreguntaRemoteModel = evaluacionPreguntaRemoteModel;
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

		Class<?> remoteModelClass = _evaluacionPreguntaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_evaluacionPreguntaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EvaluacionPreguntaLocalServiceUtil.addEvaluacionPregunta(this);
		}
		else {
			EvaluacionPreguntaLocalServiceUtil.updateEvaluacionPregunta(this);
		}
	}

	@Override
	public EvaluacionPregunta toEscapedModel() {
		return (EvaluacionPregunta)ProxyUtil.newProxyInstance(EvaluacionPregunta.class.getClassLoader(),
			new Class[] { EvaluacionPregunta.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EvaluacionPreguntaClp clone = new EvaluacionPreguntaClp();

		clone.setEvaluacionId(getEvaluacionId());
		clone.setPreguntaId(getPreguntaId());
		clone.setNivel(getNivel());

		return clone;
	}

	@Override
	public int compareTo(EvaluacionPregunta evaluacionPregunta) {
		EvaluacionPreguntaPK primaryKey = evaluacionPregunta.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EvaluacionPreguntaClp)) {
			return false;
		}

		EvaluacionPreguntaClp evaluacionPregunta = (EvaluacionPreguntaClp)obj;

		EvaluacionPreguntaPK primaryKey = evaluacionPregunta.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{evaluacionId=");
		sb.append(getEvaluacionId());
		sb.append(", preguntaId=");
		sb.append(getPreguntaId());
		sb.append(", nivel=");
		sb.append(getNivel());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.EvaluacionPregunta");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>evaluacionId</column-name><column-value><![CDATA[");
		sb.append(getEvaluacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preguntaId</column-name><column-value><![CDATA[");
		sb.append(getPreguntaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nivel</column-name><column-value><![CDATA[");
		sb.append(getNivel());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _evaluacionId;
	private long _preguntaId;
	private long _nivel;
	private BaseModel<?> _evaluacionPreguntaRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
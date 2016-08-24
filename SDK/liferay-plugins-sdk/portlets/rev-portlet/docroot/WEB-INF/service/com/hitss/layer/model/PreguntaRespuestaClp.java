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
import com.hitss.layer.service.PreguntaRespuestaLocalServiceUtil;
import com.hitss.layer.service.persistence.PreguntaRespuestaPK;

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
public class PreguntaRespuestaClp extends BaseModelImpl<PreguntaRespuesta>
	implements PreguntaRespuesta {
	public PreguntaRespuestaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PreguntaRespuesta.class;
	}

	@Override
	public String getModelClassName() {
		return PreguntaRespuesta.class.getName();
	}

	@Override
	public PreguntaRespuestaPK getPrimaryKey() {
		return new PreguntaRespuestaPK(_preguntaId, _respuestaId);
	}

	@Override
	public void setPrimaryKey(PreguntaRespuestaPK primaryKey) {
		setPreguntaId(primaryKey.preguntaId);
		setRespuestaId(primaryKey.respuestaId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new PreguntaRespuestaPK(_preguntaId, _respuestaId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((PreguntaRespuestaPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("preguntaId", getPreguntaId());
		attributes.put("respuestaId", getRespuestaId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long preguntaId = (Long)attributes.get("preguntaId");

		if (preguntaId != null) {
			setPreguntaId(preguntaId);
		}

		Long respuestaId = (Long)attributes.get("respuestaId");

		if (respuestaId != null) {
			setRespuestaId(respuestaId);
		}
	}

	@Override
	public long getPreguntaId() {
		return _preguntaId;
	}

	@Override
	public void setPreguntaId(long preguntaId) {
		_preguntaId = preguntaId;

		if (_preguntaRespuestaRemoteModel != null) {
			try {
				Class<?> clazz = _preguntaRespuestaRemoteModel.getClass();

				Method method = clazz.getMethod("setPreguntaId", long.class);

				method.invoke(_preguntaRespuestaRemoteModel, preguntaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRespuestaId() {
		return _respuestaId;
	}

	@Override
	public void setRespuestaId(long respuestaId) {
		_respuestaId = respuestaId;

		if (_preguntaRespuestaRemoteModel != null) {
			try {
				Class<?> clazz = _preguntaRespuestaRemoteModel.getClass();

				Method method = clazz.getMethod("setRespuestaId", long.class);

				method.invoke(_preguntaRespuestaRemoteModel, respuestaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPreguntaRespuestaRemoteModel() {
		return _preguntaRespuestaRemoteModel;
	}

	public void setPreguntaRespuestaRemoteModel(
		BaseModel<?> preguntaRespuestaRemoteModel) {
		_preguntaRespuestaRemoteModel = preguntaRespuestaRemoteModel;
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

		Class<?> remoteModelClass = _preguntaRespuestaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_preguntaRespuestaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PreguntaRespuestaLocalServiceUtil.addPreguntaRespuesta(this);
		}
		else {
			PreguntaRespuestaLocalServiceUtil.updatePreguntaRespuesta(this);
		}
	}

	@Override
	public PreguntaRespuesta toEscapedModel() {
		return (PreguntaRespuesta)ProxyUtil.newProxyInstance(PreguntaRespuesta.class.getClassLoader(),
			new Class[] { PreguntaRespuesta.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PreguntaRespuestaClp clone = new PreguntaRespuestaClp();

		clone.setPreguntaId(getPreguntaId());
		clone.setRespuestaId(getRespuestaId());

		return clone;
	}

	@Override
	public int compareTo(PreguntaRespuesta preguntaRespuesta) {
		PreguntaRespuestaPK primaryKey = preguntaRespuesta.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PreguntaRespuestaClp)) {
			return false;
		}

		PreguntaRespuestaClp preguntaRespuesta = (PreguntaRespuestaClp)obj;

		PreguntaRespuestaPK primaryKey = preguntaRespuesta.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{preguntaId=");
		sb.append(getPreguntaId());
		sb.append(", respuestaId=");
		sb.append(getRespuestaId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.PreguntaRespuesta");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>preguntaId</column-name><column-value><![CDATA[");
		sb.append(getPreguntaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>respuestaId</column-name><column-value><![CDATA[");
		sb.append(getRespuestaId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _preguntaId;
	private long _respuestaId;
	private BaseModel<?> _preguntaRespuestaRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
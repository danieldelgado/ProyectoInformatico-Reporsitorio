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
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.rec.hitss.layer.service.ClpSerializer;
import com.rec.hitss.layer.service.ResultadoEvaluacionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class ResultadoEvaluacionClp extends BaseModelImpl<ResultadoEvaluacion>
	implements ResultadoEvaluacion {
	public ResultadoEvaluacionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ResultadoEvaluacion.class;
	}

	@Override
	public String getModelClassName() {
		return ResultadoEvaluacion.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _resultadoEvaluacionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setResultadoEvaluacionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _resultadoEvaluacionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("resultadoEvaluacionId", getResultadoEvaluacionId());
		attributes.put("respuestaSelccionada", getRespuestaSelccionada());
		attributes.put("habilidadCumplida", getHabilidadCumplida());
		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("usuarioHitssId", getUsuarioHitssId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long resultadoEvaluacionId = (Long)attributes.get(
				"resultadoEvaluacionId");

		if (resultadoEvaluacionId != null) {
			setResultadoEvaluacionId(resultadoEvaluacionId);
		}

		Long respuestaSelccionada = (Long)attributes.get("respuestaSelccionada");

		if (respuestaSelccionada != null) {
			setRespuestaSelccionada(respuestaSelccionada);
		}

		Boolean habilidadCumplida = (Boolean)attributes.get("habilidadCumplida");

		if (habilidadCumplida != null) {
			setHabilidadCumplida(habilidadCumplida);
		}

		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		Long usuarioHitssId = (Long)attributes.get("usuarioHitssId");

		if (usuarioHitssId != null) {
			setUsuarioHitssId(usuarioHitssId);
		}
	}

	@Override
	public long getResultadoEvaluacionId() {
		return _resultadoEvaluacionId;
	}

	@Override
	public void setResultadoEvaluacionId(long resultadoEvaluacionId) {
		_resultadoEvaluacionId = resultadoEvaluacionId;

		if (_resultadoEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _resultadoEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setResultadoEvaluacionId",
						long.class);

				method.invoke(_resultadoEvaluacionRemoteModel,
					resultadoEvaluacionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRespuestaSelccionada() {
		return _respuestaSelccionada;
	}

	@Override
	public void setRespuestaSelccionada(long respuestaSelccionada) {
		_respuestaSelccionada = respuestaSelccionada;

		if (_resultadoEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _resultadoEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setRespuestaSelccionada",
						long.class);

				method.invoke(_resultadoEvaluacionRemoteModel,
					respuestaSelccionada);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getHabilidadCumplida() {
		return _habilidadCumplida;
	}

	@Override
	public boolean isHabilidadCumplida() {
		return _habilidadCumplida;
	}

	@Override
	public void setHabilidadCumplida(boolean habilidadCumplida) {
		_habilidadCumplida = habilidadCumplida;

		if (_resultadoEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _resultadoEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setHabilidadCumplida",
						boolean.class);

				method.invoke(_resultadoEvaluacionRemoteModel, habilidadCumplida);
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

		if (_resultadoEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _resultadoEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setEvaluacionId", long.class);

				method.invoke(_resultadoEvaluacionRemoteModel, evaluacionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUsuarioHitssId() {
		return _usuarioHitssId;
	}

	@Override
	public void setUsuarioHitssId(long usuarioHitssId) {
		_usuarioHitssId = usuarioHitssId;

		if (_resultadoEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _resultadoEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioHitssId", long.class);

				method.invoke(_resultadoEvaluacionRemoteModel, usuarioHitssId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getResultadoEvaluacionRemoteModel() {
		return _resultadoEvaluacionRemoteModel;
	}

	public void setResultadoEvaluacionRemoteModel(
		BaseModel<?> resultadoEvaluacionRemoteModel) {
		_resultadoEvaluacionRemoteModel = resultadoEvaluacionRemoteModel;
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

		Class<?> remoteModelClass = _resultadoEvaluacionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_resultadoEvaluacionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ResultadoEvaluacionLocalServiceUtil.addResultadoEvaluacion(this);
		}
		else {
			ResultadoEvaluacionLocalServiceUtil.updateResultadoEvaluacion(this);
		}
	}

	@Override
	public ResultadoEvaluacion toEscapedModel() {
		return (ResultadoEvaluacion)ProxyUtil.newProxyInstance(ResultadoEvaluacion.class.getClassLoader(),
			new Class[] { ResultadoEvaluacion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ResultadoEvaluacionClp clone = new ResultadoEvaluacionClp();

		clone.setResultadoEvaluacionId(getResultadoEvaluacionId());
		clone.setRespuestaSelccionada(getRespuestaSelccionada());
		clone.setHabilidadCumplida(getHabilidadCumplida());
		clone.setEvaluacionId(getEvaluacionId());
		clone.setUsuarioHitssId(getUsuarioHitssId());

		return clone;
	}

	@Override
	public int compareTo(ResultadoEvaluacion resultadoEvaluacion) {
		long primaryKey = resultadoEvaluacion.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ResultadoEvaluacionClp)) {
			return false;
		}

		ResultadoEvaluacionClp resultadoEvaluacion = (ResultadoEvaluacionClp)obj;

		long primaryKey = resultadoEvaluacion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{resultadoEvaluacionId=");
		sb.append(getResultadoEvaluacionId());
		sb.append(", respuestaSelccionada=");
		sb.append(getRespuestaSelccionada());
		sb.append(", habilidadCumplida=");
		sb.append(getHabilidadCumplida());
		sb.append(", evaluacionId=");
		sb.append(getEvaluacionId());
		sb.append(", usuarioHitssId=");
		sb.append(getUsuarioHitssId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.ResultadoEvaluacion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>resultadoEvaluacionId</column-name><column-value><![CDATA[");
		sb.append(getResultadoEvaluacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>respuestaSelccionada</column-name><column-value><![CDATA[");
		sb.append(getRespuestaSelccionada());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>habilidadCumplida</column-name><column-value><![CDATA[");
		sb.append(getHabilidadCumplida());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evaluacionId</column-name><column-value><![CDATA[");
		sb.append(getEvaluacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioHitssId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioHitssId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _resultadoEvaluacionId;
	private long _respuestaSelccionada;
	private boolean _habilidadCumplida;
	private long _evaluacionId;
	private long _usuarioHitssId;
	private BaseModel<?> _resultadoEvaluacionRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
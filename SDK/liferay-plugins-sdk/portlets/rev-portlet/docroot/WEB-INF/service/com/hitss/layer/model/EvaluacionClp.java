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
import com.hitss.layer.service.EvaluacionLocalServiceUtil;

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
public class EvaluacionClp extends BaseModelImpl<Evaluacion>
	implements Evaluacion {
	public EvaluacionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Evaluacion.class;
	}

	@Override
	public String getModelClassName() {
		return Evaluacion.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _evaluacionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEvaluacionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _evaluacionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("enfoque", getEnfoque());
		attributes.put("puestoCategoriaEvaluacion",
			getPuestoCategoriaEvaluacion());
		attributes.put("tipoEvaluacion", getTipoEvaluacion());
		attributes.put("descripcion", getDescripcion());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		Long enfoque = (Long)attributes.get("enfoque");

		if (enfoque != null) {
			setEnfoque(enfoque);
		}

		Long puestoCategoriaEvaluacion = (Long)attributes.get(
				"puestoCategoriaEvaluacion");

		if (puestoCategoriaEvaluacion != null) {
			setPuestoCategoriaEvaluacion(puestoCategoriaEvaluacion);
		}

		Long tipoEvaluacion = (Long)attributes.get("tipoEvaluacion");

		if (tipoEvaluacion != null) {
			setTipoEvaluacion(tipoEvaluacion);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
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
	public long getEvaluacionId() {
		return _evaluacionId;
	}

	@Override
	public void setEvaluacionId(long evaluacionId) {
		_evaluacionId = evaluacionId;

		if (_evaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setEvaluacionId", long.class);

				method.invoke(_evaluacionRemoteModel, evaluacionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEnfoque() {
		return _enfoque;
	}

	@Override
	public void setEnfoque(long enfoque) {
		_enfoque = enfoque;

		if (_evaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setEnfoque", long.class);

				method.invoke(_evaluacionRemoteModel, enfoque);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPuestoCategoriaEvaluacion() {
		return _puestoCategoriaEvaluacion;
	}

	@Override
	public void setPuestoCategoriaEvaluacion(long puestoCategoriaEvaluacion) {
		_puestoCategoriaEvaluacion = puestoCategoriaEvaluacion;

		if (_evaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setPuestoCategoriaEvaluacion",
						long.class);

				method.invoke(_evaluacionRemoteModel, puestoCategoriaEvaluacion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTipoEvaluacion() {
		return _tipoEvaluacion;
	}

	@Override
	public void setTipoEvaluacion(long tipoEvaluacion) {
		_tipoEvaluacion = tipoEvaluacion;

		if (_evaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setTipoEvaluacion", long.class);

				method.invoke(_evaluacionRemoteModel, tipoEvaluacion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescripcion() {
		return _descripcion;
	}

	@Override
	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;

		if (_evaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_evaluacionRemoteModel, descripcion);
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

		if (_evaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_evaluacionRemoteModel, activo);
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

		if (_evaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_evaluacionRemoteModel, usuariocrea);
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

		if (_evaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_evaluacionRemoteModel, fechacrea);
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

		if (_evaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_evaluacionRemoteModel, usuariomodifica);
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

		if (_evaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechamodifica", Date.class);

				method.invoke(_evaluacionRemoteModel, fechamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEvaluacionRemoteModel() {
		return _evaluacionRemoteModel;
	}

	public void setEvaluacionRemoteModel(BaseModel<?> evaluacionRemoteModel) {
		_evaluacionRemoteModel = evaluacionRemoteModel;
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

		Class<?> remoteModelClass = _evaluacionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_evaluacionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EvaluacionLocalServiceUtil.addEvaluacion(this);
		}
		else {
			EvaluacionLocalServiceUtil.updateEvaluacion(this);
		}
	}

	@Override
	public Evaluacion toEscapedModel() {
		return (Evaluacion)ProxyUtil.newProxyInstance(Evaluacion.class.getClassLoader(),
			new Class[] { Evaluacion.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EvaluacionClp clone = new EvaluacionClp();

		clone.setEvaluacionId(getEvaluacionId());
		clone.setEnfoque(getEnfoque());
		clone.setPuestoCategoriaEvaluacion(getPuestoCategoriaEvaluacion());
		clone.setTipoEvaluacion(getTipoEvaluacion());
		clone.setDescripcion(getDescripcion());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechamodifica(getFechamodifica());

		return clone;
	}

	@Override
	public int compareTo(Evaluacion evaluacion) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				evaluacion.getFechamodifica());

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

		if (!(obj instanceof EvaluacionClp)) {
			return false;
		}

		EvaluacionClp evaluacion = (EvaluacionClp)obj;

		long primaryKey = evaluacion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{evaluacionId=");
		sb.append(getEvaluacionId());
		sb.append(", enfoque=");
		sb.append(getEnfoque());
		sb.append(", puestoCategoriaEvaluacion=");
		sb.append(getPuestoCategoriaEvaluacion());
		sb.append(", tipoEvaluacion=");
		sb.append(getTipoEvaluacion());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.Evaluacion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>evaluacionId</column-name><column-value><![CDATA[");
		sb.append(getEvaluacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enfoque</column-name><column-value><![CDATA[");
		sb.append(getEnfoque());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>puestoCategoriaEvaluacion</column-name><column-value><![CDATA[");
		sb.append(getPuestoCategoriaEvaluacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipoEvaluacion</column-name><column-value><![CDATA[");
		sb.append(getTipoEvaluacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
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

	private long _evaluacionId;
	private long _enfoque;
	private long _puestoCategoriaEvaluacion;
	private long _tipoEvaluacion;
	private String _descripcion;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private BaseModel<?> _evaluacionRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
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
import com.rec.hitss.layer.service.CriteriosEvaluacionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class CriteriosEvaluacionClp extends BaseModelImpl<CriteriosEvaluacion>
	implements CriteriosEvaluacion {
	public CriteriosEvaluacionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CriteriosEvaluacion.class;
	}

	@Override
	public String getModelClassName() {
		return CriteriosEvaluacion.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _criteriosEvaluacionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCriteriosEvaluacionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _criteriosEvaluacionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("criteriosEvaluacionId", getCriteriosEvaluacionId());
		attributes.put("nombre", getNombre());
		attributes.put("nivelCriterio", getNivelCriterio());
		attributes.put("observacion", getObservacion());
		attributes.put("parametroPadreId", getParametroPadreId());
		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long criteriosEvaluacionId = (Long)attributes.get(
				"criteriosEvaluacionId");

		if (criteriosEvaluacionId != null) {
			setCriteriosEvaluacionId(criteriosEvaluacionId);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String nivelCriterio = (String)attributes.get("nivelCriterio");

		if (nivelCriterio != null) {
			setNivelCriterio(nivelCriterio);
		}

		String observacion = (String)attributes.get("observacion");

		if (observacion != null) {
			setObservacion(observacion);
		}

		Long parametroPadreId = (Long)attributes.get("parametroPadreId");

		if (parametroPadreId != null) {
			setParametroPadreId(parametroPadreId);
		}

		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
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
	public long getCriteriosEvaluacionId() {
		return _criteriosEvaluacionId;
	}

	@Override
	public void setCriteriosEvaluacionId(long criteriosEvaluacionId) {
		_criteriosEvaluacionId = criteriosEvaluacionId;

		if (_criteriosEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _criteriosEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setCriteriosEvaluacionId",
						long.class);

				method.invoke(_criteriosEvaluacionRemoteModel,
					criteriosEvaluacionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNombre() {
		return _nombre;
	}

	@Override
	public void setNombre(String nombre) {
		_nombre = nombre;

		if (_criteriosEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _criteriosEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setNombre", String.class);

				method.invoke(_criteriosEvaluacionRemoteModel, nombre);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNivelCriterio() {
		return _nivelCriterio;
	}

	@Override
	public void setNivelCriterio(String nivelCriterio) {
		_nivelCriterio = nivelCriterio;

		if (_criteriosEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _criteriosEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setNivelCriterio", String.class);

				method.invoke(_criteriosEvaluacionRemoteModel, nivelCriterio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getObservacion() {
		return _observacion;
	}

	@Override
	public void setObservacion(String observacion) {
		_observacion = observacion;

		if (_criteriosEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _criteriosEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setObservacion", String.class);

				method.invoke(_criteriosEvaluacionRemoteModel, observacion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getParametroPadreId() {
		return _parametroPadreId;
	}

	@Override
	public void setParametroPadreId(long parametroPadreId) {
		_parametroPadreId = parametroPadreId;

		if (_criteriosEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _criteriosEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setParametroPadreId",
						long.class);

				method.invoke(_criteriosEvaluacionRemoteModel, parametroPadreId);
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

		if (_criteriosEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _criteriosEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setEvaluacionId", long.class);

				method.invoke(_criteriosEvaluacionRemoteModel, evaluacionId);
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

		if (_criteriosEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _criteriosEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_criteriosEvaluacionRemoteModel, activo);
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

		if (_criteriosEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _criteriosEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_criteriosEvaluacionRemoteModel, usuariocrea);
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

		if (_criteriosEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _criteriosEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_criteriosEvaluacionRemoteModel, fechacrea);
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

		if (_criteriosEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _criteriosEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_criteriosEvaluacionRemoteModel, usuariomodifica);
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

		if (_criteriosEvaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _criteriosEvaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_criteriosEvaluacionRemoteModel, fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCriteriosEvaluacionRemoteModel() {
		return _criteriosEvaluacionRemoteModel;
	}

	public void setCriteriosEvaluacionRemoteModel(
		BaseModel<?> criteriosEvaluacionRemoteModel) {
		_criteriosEvaluacionRemoteModel = criteriosEvaluacionRemoteModel;
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

		Class<?> remoteModelClass = _criteriosEvaluacionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_criteriosEvaluacionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CriteriosEvaluacionLocalServiceUtil.addCriteriosEvaluacion(this);
		}
		else {
			CriteriosEvaluacionLocalServiceUtil.updateCriteriosEvaluacion(this);
		}
	}

	@Override
	public CriteriosEvaluacion toEscapedModel() {
		return (CriteriosEvaluacion)ProxyUtil.newProxyInstance(CriteriosEvaluacion.class.getClassLoader(),
			new Class[] { CriteriosEvaluacion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CriteriosEvaluacionClp clone = new CriteriosEvaluacionClp();

		clone.setCriteriosEvaluacionId(getCriteriosEvaluacionId());
		clone.setNombre(getNombre());
		clone.setNivelCriterio(getNivelCriterio());
		clone.setObservacion(getObservacion());
		clone.setParametroPadreId(getParametroPadreId());
		clone.setEvaluacionId(getEvaluacionId());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(CriteriosEvaluacion criteriosEvaluacion) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(),
				criteriosEvaluacion.getFechacrea());

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

		if (!(obj instanceof CriteriosEvaluacionClp)) {
			return false;
		}

		CriteriosEvaluacionClp criteriosEvaluacion = (CriteriosEvaluacionClp)obj;

		long primaryKey = criteriosEvaluacion.getPrimaryKey();

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

		sb.append("{criteriosEvaluacionId=");
		sb.append(getCriteriosEvaluacionId());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", nivelCriterio=");
		sb.append(getNivelCriterio());
		sb.append(", observacion=");
		sb.append(getObservacion());
		sb.append(", parametroPadreId=");
		sb.append(getParametroPadreId());
		sb.append(", evaluacionId=");
		sb.append(getEvaluacionId());
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
		sb.append("com.rec.hitss.layer.model.CriteriosEvaluacion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>criteriosEvaluacionId</column-name><column-value><![CDATA[");
		sb.append(getCriteriosEvaluacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nivelCriterio</column-name><column-value><![CDATA[");
		sb.append(getNivelCriterio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>observacion</column-name><column-value><![CDATA[");
		sb.append(getObservacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parametroPadreId</column-name><column-value><![CDATA[");
		sb.append(getParametroPadreId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evaluacionId</column-name><column-value><![CDATA[");
		sb.append(getEvaluacionId());
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

	private long _criteriosEvaluacionId;
	private String _nombre;
	private String _nivelCriterio;
	private String _observacion;
	private long _parametroPadreId;
	private long _evaluacionId;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _criteriosEvaluacionRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
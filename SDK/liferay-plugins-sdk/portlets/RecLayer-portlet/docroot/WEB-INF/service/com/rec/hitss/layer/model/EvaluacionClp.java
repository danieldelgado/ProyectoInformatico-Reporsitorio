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
import com.rec.hitss.layer.service.EvaluacionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
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
		attributes.put("tiempoMinuto", getTiempoMinuto());
		attributes.put("enfoque", getEnfoque());
		attributes.put("puestoEvaluacion", getPuestoEvaluacion());
		attributes.put("tiempoPuesto", getTiempoPuesto());
		attributes.put("TipoEvaluacion", getTipoEvaluacion());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		Long tiempoMinuto = (Long)attributes.get("tiempoMinuto");

		if (tiempoMinuto != null) {
			setTiempoMinuto(tiempoMinuto);
		}

		Long enfoque = (Long)attributes.get("enfoque");

		if (enfoque != null) {
			setEnfoque(enfoque);
		}

		Long puestoEvaluacion = (Long)attributes.get("puestoEvaluacion");

		if (puestoEvaluacion != null) {
			setPuestoEvaluacion(puestoEvaluacion);
		}

		Long tiempoPuesto = (Long)attributes.get("tiempoPuesto");

		if (tiempoPuesto != null) {
			setTiempoPuesto(tiempoPuesto);
		}

		Long TipoEvaluacion = (Long)attributes.get("TipoEvaluacion");

		if (TipoEvaluacion != null) {
			setTipoEvaluacion(TipoEvaluacion);
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
	public long getTiempoMinuto() {
		return _tiempoMinuto;
	}

	@Override
	public void setTiempoMinuto(long tiempoMinuto) {
		_tiempoMinuto = tiempoMinuto;

		if (_evaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setTiempoMinuto", long.class);

				method.invoke(_evaluacionRemoteModel, tiempoMinuto);
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
	public long getPuestoEvaluacion() {
		return _puestoEvaluacion;
	}

	@Override
	public void setPuestoEvaluacion(long puestoEvaluacion) {
		_puestoEvaluacion = puestoEvaluacion;

		if (_evaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setPuestoEvaluacion",
						long.class);

				method.invoke(_evaluacionRemoteModel, puestoEvaluacion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTiempoPuesto() {
		return _tiempoPuesto;
	}

	@Override
	public void setTiempoPuesto(long tiempoPuesto) {
		_tiempoPuesto = tiempoPuesto;

		if (_evaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setTiempoPuesto", long.class);

				method.invoke(_evaluacionRemoteModel, tiempoPuesto);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTipoEvaluacion() {
		return _TipoEvaluacion;
	}

	@Override
	public void setTipoEvaluacion(long TipoEvaluacion) {
		_TipoEvaluacion = TipoEvaluacion;

		if (_evaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setTipoEvaluacion", long.class);

				method.invoke(_evaluacionRemoteModel, TipoEvaluacion);
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
	public Date getFechacreamodifica() {
		return _fechacreamodifica;
	}

	@Override
	public void setFechacreamodifica(Date fechacreamodifica) {
		_fechacreamodifica = fechacreamodifica;

		if (_evaluacionRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_evaluacionRemoteModel, fechacreamodifica);
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
		clone.setTiempoMinuto(getTiempoMinuto());
		clone.setEnfoque(getEnfoque());
		clone.setPuestoEvaluacion(getPuestoEvaluacion());
		clone.setTiempoPuesto(getTiempoPuesto());
		clone.setTipoEvaluacion(getTipoEvaluacion());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(Evaluacion evaluacion) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(), evaluacion.getFechacrea());

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
		StringBundler sb = new StringBundler(23);

		sb.append("{evaluacionId=");
		sb.append(getEvaluacionId());
		sb.append(", tiempoMinuto=");
		sb.append(getTiempoMinuto());
		sb.append(", enfoque=");
		sb.append(getEnfoque());
		sb.append(", puestoEvaluacion=");
		sb.append(getPuestoEvaluacion());
		sb.append(", tiempoPuesto=");
		sb.append(getTiempoPuesto());
		sb.append(", TipoEvaluacion=");
		sb.append(getTipoEvaluacion());
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
		sb.append("com.rec.hitss.layer.model.Evaluacion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>evaluacionId</column-name><column-value><![CDATA[");
		sb.append(getEvaluacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiempoMinuto</column-name><column-value><![CDATA[");
		sb.append(getTiempoMinuto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enfoque</column-name><column-value><![CDATA[");
		sb.append(getEnfoque());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>puestoEvaluacion</column-name><column-value><![CDATA[");
		sb.append(getPuestoEvaluacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiempoPuesto</column-name><column-value><![CDATA[");
		sb.append(getTiempoPuesto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TipoEvaluacion</column-name><column-value><![CDATA[");
		sb.append(getTipoEvaluacion());
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

	private long _evaluacionId;
	private long _tiempoMinuto;
	private long _enfoque;
	private long _puestoEvaluacion;
	private long _tiempoPuesto;
	private long _TipoEvaluacion;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _evaluacionRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
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

import com.rec.hitss.layer.service.ActividadesLocalServiceUtil;
import com.rec.hitss.layer.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class ActividadesClp extends BaseModelImpl<Actividades>
	implements Actividades {
	public ActividadesClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Actividades.class;
	}

	@Override
	public String getModelClassName() {
		return Actividades.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _actividadesId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setActividadesId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _actividadesId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("actividadesId", getActividadesId());
		attributes.put("cronogramaEvaluacionPersonalId",
			getCronogramaEvaluacionPersonalId());
		attributes.put("fechacreamodifica", getFechacreamodifica());
		attributes.put("fechaInicioEvaluacion", getFechaInicioEvaluacion());
		attributes.put("fechaFinEvaluacion", getFechaFinEvaluacion());
		attributes.put("descripcion", getDescripcion());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long actividadesId = (Long)attributes.get("actividadesId");

		if (actividadesId != null) {
			setActividadesId(actividadesId);
		}

		Long cronogramaEvaluacionPersonalId = (Long)attributes.get(
				"cronogramaEvaluacionPersonalId");

		if (cronogramaEvaluacionPersonalId != null) {
			setCronogramaEvaluacionPersonalId(cronogramaEvaluacionPersonalId);
		}

		Date fechacreamodifica = (Date)attributes.get("fechacreamodifica");

		if (fechacreamodifica != null) {
			setFechacreamodifica(fechacreamodifica);
		}

		Date fechaInicioEvaluacion = (Date)attributes.get(
				"fechaInicioEvaluacion");

		if (fechaInicioEvaluacion != null) {
			setFechaInicioEvaluacion(fechaInicioEvaluacion);
		}

		Date fechaFinEvaluacion = (Date)attributes.get("fechaFinEvaluacion");

		if (fechaFinEvaluacion != null) {
			setFechaFinEvaluacion(fechaFinEvaluacion);
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
	}

	@Override
	public long getActividadesId() {
		return _actividadesId;
	}

	@Override
	public void setActividadesId(long actividadesId) {
		_actividadesId = actividadesId;

		if (_actividadesRemoteModel != null) {
			try {
				Class<?> clazz = _actividadesRemoteModel.getClass();

				Method method = clazz.getMethod("setActividadesId", long.class);

				method.invoke(_actividadesRemoteModel, actividadesId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCronogramaEvaluacionPersonalId() {
		return _cronogramaEvaluacionPersonalId;
	}

	@Override
	public void setCronogramaEvaluacionPersonalId(
		long cronogramaEvaluacionPersonalId) {
		_cronogramaEvaluacionPersonalId = cronogramaEvaluacionPersonalId;

		if (_actividadesRemoteModel != null) {
			try {
				Class<?> clazz = _actividadesRemoteModel.getClass();

				Method method = clazz.getMethod("setCronogramaEvaluacionPersonalId",
						long.class);

				method.invoke(_actividadesRemoteModel,
					cronogramaEvaluacionPersonalId);
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

		if (_actividadesRemoteModel != null) {
			try {
				Class<?> clazz = _actividadesRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_actividadesRemoteModel, fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaInicioEvaluacion() {
		return _fechaInicioEvaluacion;
	}

	@Override
	public void setFechaInicioEvaluacion(Date fechaInicioEvaluacion) {
		_fechaInicioEvaluacion = fechaInicioEvaluacion;

		if (_actividadesRemoteModel != null) {
			try {
				Class<?> clazz = _actividadesRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaInicioEvaluacion",
						Date.class);

				method.invoke(_actividadesRemoteModel, fechaInicioEvaluacion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaFinEvaluacion() {
		return _fechaFinEvaluacion;
	}

	@Override
	public void setFechaFinEvaluacion(Date fechaFinEvaluacion) {
		_fechaFinEvaluacion = fechaFinEvaluacion;

		if (_actividadesRemoteModel != null) {
			try {
				Class<?> clazz = _actividadesRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaFinEvaluacion",
						Date.class);

				method.invoke(_actividadesRemoteModel, fechaFinEvaluacion);
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

		if (_actividadesRemoteModel != null) {
			try {
				Class<?> clazz = _actividadesRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_actividadesRemoteModel, descripcion);
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

		if (_actividadesRemoteModel != null) {
			try {
				Class<?> clazz = _actividadesRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_actividadesRemoteModel, activo);
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

		if (_actividadesRemoteModel != null) {
			try {
				Class<?> clazz = _actividadesRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_actividadesRemoteModel, usuariocrea);
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

		if (_actividadesRemoteModel != null) {
			try {
				Class<?> clazz = _actividadesRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_actividadesRemoteModel, fechacrea);
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

		if (_actividadesRemoteModel != null) {
			try {
				Class<?> clazz = _actividadesRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_actividadesRemoteModel, usuariomodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getActividadesRemoteModel() {
		return _actividadesRemoteModel;
	}

	public void setActividadesRemoteModel(BaseModel<?> actividadesRemoteModel) {
		_actividadesRemoteModel = actividadesRemoteModel;
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

		Class<?> remoteModelClass = _actividadesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_actividadesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ActividadesLocalServiceUtil.addActividades(this);
		}
		else {
			ActividadesLocalServiceUtil.updateActividades(this);
		}
	}

	@Override
	public Actividades toEscapedModel() {
		return (Actividades)ProxyUtil.newProxyInstance(Actividades.class.getClassLoader(),
			new Class[] { Actividades.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ActividadesClp clone = new ActividadesClp();

		clone.setActividadesId(getActividadesId());
		clone.setCronogramaEvaluacionPersonalId(getCronogramaEvaluacionPersonalId());
		clone.setFechacreamodifica(getFechacreamodifica());
		clone.setFechaInicioEvaluacion(getFechaInicioEvaluacion());
		clone.setFechaFinEvaluacion(getFechaFinEvaluacion());
		clone.setDescripcion(getDescripcion());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());

		return clone;
	}

	@Override
	public int compareTo(Actividades actividades) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(), actividades.getFechacrea());

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

		if (!(obj instanceof ActividadesClp)) {
			return false;
		}

		ActividadesClp actividades = (ActividadesClp)obj;

		long primaryKey = actividades.getPrimaryKey();

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

		sb.append("{actividadesId=");
		sb.append(getActividadesId());
		sb.append(", cronogramaEvaluacionPersonalId=");
		sb.append(getCronogramaEvaluacionPersonalId());
		sb.append(", fechacreamodifica=");
		sb.append(getFechacreamodifica());
		sb.append(", fechaInicioEvaluacion=");
		sb.append(getFechaInicioEvaluacion());
		sb.append(", fechaFinEvaluacion=");
		sb.append(getFechaFinEvaluacion());
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.Actividades");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>actividadesId</column-name><column-value><![CDATA[");
		sb.append(getActividadesId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cronogramaEvaluacionPersonalId</column-name><column-value><![CDATA[");
		sb.append(getCronogramaEvaluacionPersonalId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechacreamodifica</column-name><column-value><![CDATA[");
		sb.append(getFechacreamodifica());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaInicioEvaluacion</column-name><column-value><![CDATA[");
		sb.append(getFechaInicioEvaluacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaFinEvaluacion</column-name><column-value><![CDATA[");
		sb.append(getFechaFinEvaluacion());
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

		sb.append("</model>");

		return sb.toString();
	}

	private long _actividadesId;
	private long _cronogramaEvaluacionPersonalId;
	private Date _fechacreamodifica;
	private Date _fechaInicioEvaluacion;
	private Date _fechaFinEvaluacion;
	private String _descripcion;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private BaseModel<?> _actividadesRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
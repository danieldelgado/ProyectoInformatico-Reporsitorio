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

import com.hitss.layer.service.ActividadCronogramaLocalServiceUtil;
import com.hitss.layer.service.ClpSerializer;

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
public class ActividadCronogramaClp extends BaseModelImpl<ActividadCronograma>
	implements ActividadCronograma {
	public ActividadCronogramaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ActividadCronograma.class;
	}

	@Override
	public String getModelClassName() {
		return ActividadCronograma.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _cronogramaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCronogramaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cronogramaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("actividadCronogramaId", getActividadCronogramaId());
		attributes.put("cronogramaId", getCronogramaId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("fechaInicio", getFechaInicio());
		attributes.put("fechaFin", getFechaFin());
		attributes.put("cumplido", getCumplido());
		attributes.put("finalizado", getFinalizado());
		attributes.put("tipoActividad", getTipoActividad());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long actividadCronogramaId = (Long)attributes.get(
				"actividadCronogramaId");

		if (actividadCronogramaId != null) {
			setActividadCronogramaId(actividadCronogramaId);
		}

		Long cronogramaId = (Long)attributes.get("cronogramaId");

		if (cronogramaId != null) {
			setCronogramaId(cronogramaId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Date fechaInicio = (Date)attributes.get("fechaInicio");

		if (fechaInicio != null) {
			setFechaInicio(fechaInicio);
		}

		Date fechaFin = (Date)attributes.get("fechaFin");

		if (fechaFin != null) {
			setFechaFin(fechaFin);
		}

		Boolean cumplido = (Boolean)attributes.get("cumplido");

		if (cumplido != null) {
			setCumplido(cumplido);
		}

		Boolean finalizado = (Boolean)attributes.get("finalizado");

		if (finalizado != null) {
			setFinalizado(finalizado);
		}

		Long tipoActividad = (Long)attributes.get("tipoActividad");

		if (tipoActividad != null) {
			setTipoActividad(tipoActividad);
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
	public long getActividadCronogramaId() {
		return _actividadCronogramaId;
	}

	@Override
	public void setActividadCronogramaId(long actividadCronogramaId) {
		_actividadCronogramaId = actividadCronogramaId;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setActividadCronogramaId",
						long.class);

				method.invoke(_actividadCronogramaRemoteModel,
					actividadCronogramaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCronogramaId() {
		return _cronogramaId;
	}

	@Override
	public void setCronogramaId(long cronogramaId) {
		_cronogramaId = cronogramaId;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setCronogramaId", long.class);

				method.invoke(_actividadCronogramaRemoteModel, cronogramaId);
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

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_actividadCronogramaRemoteModel, descripcion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaInicio() {
		return _fechaInicio;
	}

	@Override
	public void setFechaInicio(Date fechaInicio) {
		_fechaInicio = fechaInicio;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaInicio", Date.class);

				method.invoke(_actividadCronogramaRemoteModel, fechaInicio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaFin() {
		return _fechaFin;
	}

	@Override
	public void setFechaFin(Date fechaFin) {
		_fechaFin = fechaFin;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaFin", Date.class);

				method.invoke(_actividadCronogramaRemoteModel, fechaFin);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getCumplido() {
		return _cumplido;
	}

	@Override
	public boolean isCumplido() {
		return _cumplido;
	}

	@Override
	public void setCumplido(boolean cumplido) {
		_cumplido = cumplido;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setCumplido", boolean.class);

				method.invoke(_actividadCronogramaRemoteModel, cumplido);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getFinalizado() {
		return _finalizado;
	}

	@Override
	public boolean isFinalizado() {
		return _finalizado;
	}

	@Override
	public void setFinalizado(boolean finalizado) {
		_finalizado = finalizado;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setFinalizado", boolean.class);

				method.invoke(_actividadCronogramaRemoteModel, finalizado);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTipoActividad() {
		return _tipoActividad;
	}

	@Override
	public void setTipoActividad(long tipoActividad) {
		_tipoActividad = tipoActividad;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setTipoActividad", long.class);

				method.invoke(_actividadCronogramaRemoteModel, tipoActividad);
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

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_actividadCronogramaRemoteModel, activo);
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

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_actividadCronogramaRemoteModel, usuariocrea);
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

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_actividadCronogramaRemoteModel, fechacrea);
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

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_actividadCronogramaRemoteModel, usuariomodifica);
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

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechamodifica", Date.class);

				method.invoke(_actividadCronogramaRemoteModel, fechamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getActividadCronogramaRemoteModel() {
		return _actividadCronogramaRemoteModel;
	}

	public void setActividadCronogramaRemoteModel(
		BaseModel<?> actividadCronogramaRemoteModel) {
		_actividadCronogramaRemoteModel = actividadCronogramaRemoteModel;
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

		Class<?> remoteModelClass = _actividadCronogramaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_actividadCronogramaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ActividadCronogramaLocalServiceUtil.addActividadCronograma(this);
		}
		else {
			ActividadCronogramaLocalServiceUtil.updateActividadCronograma(this);
		}
	}

	@Override
	public ActividadCronograma toEscapedModel() {
		return (ActividadCronograma)ProxyUtil.newProxyInstance(ActividadCronograma.class.getClassLoader(),
			new Class[] { ActividadCronograma.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ActividadCronogramaClp clone = new ActividadCronogramaClp();

		clone.setActividadCronogramaId(getActividadCronogramaId());
		clone.setCronogramaId(getCronogramaId());
		clone.setDescripcion(getDescripcion());
		clone.setFechaInicio(getFechaInicio());
		clone.setFechaFin(getFechaFin());
		clone.setCumplido(getCumplido());
		clone.setFinalizado(getFinalizado());
		clone.setTipoActividad(getTipoActividad());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechamodifica(getFechamodifica());

		return clone;
	}

	@Override
	public int compareTo(ActividadCronograma actividadCronograma) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				actividadCronograma.getFechamodifica());

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

		if (!(obj instanceof ActividadCronogramaClp)) {
			return false;
		}

		ActividadCronogramaClp actividadCronograma = (ActividadCronogramaClp)obj;

		long primaryKey = actividadCronograma.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{actividadCronogramaId=");
		sb.append(getActividadCronogramaId());
		sb.append(", cronogramaId=");
		sb.append(getCronogramaId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", fechaInicio=");
		sb.append(getFechaInicio());
		sb.append(", fechaFin=");
		sb.append(getFechaFin());
		sb.append(", cumplido=");
		sb.append(getCumplido());
		sb.append(", finalizado=");
		sb.append(getFinalizado());
		sb.append(", tipoActividad=");
		sb.append(getTipoActividad());
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
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.ActividadCronograma");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>actividadCronogramaId</column-name><column-value><![CDATA[");
		sb.append(getActividadCronogramaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cronogramaId</column-name><column-value><![CDATA[");
		sb.append(getCronogramaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaInicio</column-name><column-value><![CDATA[");
		sb.append(getFechaInicio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaFin</column-name><column-value><![CDATA[");
		sb.append(getFechaFin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cumplido</column-name><column-value><![CDATA[");
		sb.append(getCumplido());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>finalizado</column-name><column-value><![CDATA[");
		sb.append(getFinalizado());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipoActividad</column-name><column-value><![CDATA[");
		sb.append(getTipoActividad());
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

	private long _actividadCronogramaId;
	private long _cronogramaId;
	private String _descripcion;
	private Date _fechaInicio;
	private Date _fechaFin;
	private boolean _cumplido;
	private boolean _finalizado;
	private long _tipoActividad;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private BaseModel<?> _actividadCronogramaRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
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
import com.rec.hitss.layer.service.CronogramaEvaluacionPersonalLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class CronogramaEvaluacionPersonalClp extends BaseModelImpl<CronogramaEvaluacionPersonal>
	implements CronogramaEvaluacionPersonal {
	public CronogramaEvaluacionPersonalClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CronogramaEvaluacionPersonal.class;
	}

	@Override
	public String getModelClassName() {
		return CronogramaEvaluacionPersonal.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _cronogramaEvaluacionPersonalId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCronogramaEvaluacionPersonalId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cronogramaEvaluacionPersonalId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cronogramaEvaluacionPersonalId",
			getCronogramaEvaluacionPersonalId());
		attributes.put("solicitudEvaluacionDesempenoId",
			getSolicitudEvaluacionDesempenoId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("estado", getEstado());
		attributes.put("observacion", getObservacion());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cronogramaEvaluacionPersonalId = (Long)attributes.get(
				"cronogramaEvaluacionPersonalId");

		if (cronogramaEvaluacionPersonalId != null) {
			setCronogramaEvaluacionPersonalId(cronogramaEvaluacionPersonalId);
		}

		Long solicitudEvaluacionDesempenoId = (Long)attributes.get(
				"solicitudEvaluacionDesempenoId");

		if (solicitudEvaluacionDesempenoId != null) {
			setSolicitudEvaluacionDesempenoId(solicitudEvaluacionDesempenoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String estado = (String)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		String observacion = (String)attributes.get("observacion");

		if (observacion != null) {
			setObservacion(observacion);
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
	public long getCronogramaEvaluacionPersonalId() {
		return _cronogramaEvaluacionPersonalId;
	}

	@Override
	public void setCronogramaEvaluacionPersonalId(
		long cronogramaEvaluacionPersonalId) {
		_cronogramaEvaluacionPersonalId = cronogramaEvaluacionPersonalId;

		if (_cronogramaEvaluacionPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _cronogramaEvaluacionPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setCronogramaEvaluacionPersonalId",
						long.class);

				method.invoke(_cronogramaEvaluacionPersonalRemoteModel,
					cronogramaEvaluacionPersonalId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSolicitudEvaluacionDesempenoId() {
		return _solicitudEvaluacionDesempenoId;
	}

	@Override
	public void setSolicitudEvaluacionDesempenoId(
		long solicitudEvaluacionDesempenoId) {
		_solicitudEvaluacionDesempenoId = solicitudEvaluacionDesempenoId;

		if (_cronogramaEvaluacionPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _cronogramaEvaluacionPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setSolicitudEvaluacionDesempenoId",
						long.class);

				method.invoke(_cronogramaEvaluacionPersonalRemoteModel,
					solicitudEvaluacionDesempenoId);
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

		if (_cronogramaEvaluacionPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _cronogramaEvaluacionPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_cronogramaEvaluacionPersonalRemoteModel,
					descripcion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEstado() {
		return _estado;
	}

	@Override
	public void setEstado(String estado) {
		_estado = estado;

		if (_cronogramaEvaluacionPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _cronogramaEvaluacionPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setEstado", String.class);

				method.invoke(_cronogramaEvaluacionPersonalRemoteModel, estado);
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

		if (_cronogramaEvaluacionPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _cronogramaEvaluacionPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setObservacion", String.class);

				method.invoke(_cronogramaEvaluacionPersonalRemoteModel,
					observacion);
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

		if (_cronogramaEvaluacionPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _cronogramaEvaluacionPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_cronogramaEvaluacionPersonalRemoteModel, activo);
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

		if (_cronogramaEvaluacionPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _cronogramaEvaluacionPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_cronogramaEvaluacionPersonalRemoteModel,
					usuariocrea);
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

		if (_cronogramaEvaluacionPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _cronogramaEvaluacionPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_cronogramaEvaluacionPersonalRemoteModel,
					fechacrea);
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

		if (_cronogramaEvaluacionPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _cronogramaEvaluacionPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_cronogramaEvaluacionPersonalRemoteModel,
					usuariomodifica);
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

		if (_cronogramaEvaluacionPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _cronogramaEvaluacionPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_cronogramaEvaluacionPersonalRemoteModel,
					fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCronogramaEvaluacionPersonalRemoteModel() {
		return _cronogramaEvaluacionPersonalRemoteModel;
	}

	public void setCronogramaEvaluacionPersonalRemoteModel(
		BaseModel<?> cronogramaEvaluacionPersonalRemoteModel) {
		_cronogramaEvaluacionPersonalRemoteModel = cronogramaEvaluacionPersonalRemoteModel;
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

		Class<?> remoteModelClass = _cronogramaEvaluacionPersonalRemoteModel.getClass();

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

		Object returnValue = method.invoke(_cronogramaEvaluacionPersonalRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CronogramaEvaluacionPersonalLocalServiceUtil.addCronogramaEvaluacionPersonal(this);
		}
		else {
			CronogramaEvaluacionPersonalLocalServiceUtil.updateCronogramaEvaluacionPersonal(this);
		}
	}

	@Override
	public CronogramaEvaluacionPersonal toEscapedModel() {
		return (CronogramaEvaluacionPersonal)ProxyUtil.newProxyInstance(CronogramaEvaluacionPersonal.class.getClassLoader(),
			new Class[] { CronogramaEvaluacionPersonal.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CronogramaEvaluacionPersonalClp clone = new CronogramaEvaluacionPersonalClp();

		clone.setCronogramaEvaluacionPersonalId(getCronogramaEvaluacionPersonalId());
		clone.setSolicitudEvaluacionDesempenoId(getSolicitudEvaluacionDesempenoId());
		clone.setDescripcion(getDescripcion());
		clone.setEstado(getEstado());
		clone.setObservacion(getObservacion());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(
		CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(),
				cronogramaEvaluacionPersonal.getFechacrea());

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

		if (!(obj instanceof CronogramaEvaluacionPersonalClp)) {
			return false;
		}

		CronogramaEvaluacionPersonalClp cronogramaEvaluacionPersonal = (CronogramaEvaluacionPersonalClp)obj;

		long primaryKey = cronogramaEvaluacionPersonal.getPrimaryKey();

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

		sb.append("{cronogramaEvaluacionPersonalId=");
		sb.append(getCronogramaEvaluacionPersonalId());
		sb.append(", solicitudEvaluacionDesempenoId=");
		sb.append(getSolicitudEvaluacionDesempenoId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", estado=");
		sb.append(getEstado());
		sb.append(", observacion=");
		sb.append(getObservacion());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.CronogramaEvaluacionPersonal");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cronogramaEvaluacionPersonalId</column-name><column-value><![CDATA[");
		sb.append(getCronogramaEvaluacionPersonalId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>solicitudEvaluacionDesempenoId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudEvaluacionDesempenoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estado</column-name><column-value><![CDATA[");
		sb.append(getEstado());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>observacion</column-name><column-value><![CDATA[");
		sb.append(getObservacion());
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

	private long _cronogramaEvaluacionPersonalId;
	private long _solicitudEvaluacionDesempenoId;
	private String _descripcion;
	private String _estado;
	private String _observacion;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _cronogramaEvaluacionPersonalRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
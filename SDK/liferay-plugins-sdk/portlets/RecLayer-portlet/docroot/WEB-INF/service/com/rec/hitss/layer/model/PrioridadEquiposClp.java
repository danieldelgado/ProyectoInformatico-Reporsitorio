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
import com.rec.hitss.layer.service.PrioridadEquiposLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class PrioridadEquiposClp extends BaseModelImpl<PrioridadEquipos>
	implements PrioridadEquipos {
	public PrioridadEquiposClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PrioridadEquipos.class;
	}

	@Override
	public String getModelClassName() {
		return PrioridadEquipos.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _prioridadEquiposId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPrioridadEquiposId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _prioridadEquiposId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("prioridadEquiposId", getPrioridadEquiposId());
		attributes.put("solicitudEvaluacionDesempenoId",
			getSolicitudEvaluacionDesempenoId());
		attributes.put("responsable", getResponsable());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long prioridadEquiposId = (Long)attributes.get("prioridadEquiposId");

		if (prioridadEquiposId != null) {
			setPrioridadEquiposId(prioridadEquiposId);
		}

		Long solicitudEvaluacionDesempenoId = (Long)attributes.get(
				"solicitudEvaluacionDesempenoId");

		if (solicitudEvaluacionDesempenoId != null) {
			setSolicitudEvaluacionDesempenoId(solicitudEvaluacionDesempenoId);
		}

		Long responsable = (Long)attributes.get("responsable");

		if (responsable != null) {
			setResponsable(responsable);
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
	public long getPrioridadEquiposId() {
		return _prioridadEquiposId;
	}

	@Override
	public void setPrioridadEquiposId(long prioridadEquiposId) {
		_prioridadEquiposId = prioridadEquiposId;

		if (_prioridadEquiposRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadEquiposRemoteModel.getClass();

				Method method = clazz.getMethod("setPrioridadEquiposId",
						long.class);

				method.invoke(_prioridadEquiposRemoteModel, prioridadEquiposId);
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

		if (_prioridadEquiposRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadEquiposRemoteModel.getClass();

				Method method = clazz.getMethod("setSolicitudEvaluacionDesempenoId",
						long.class);

				method.invoke(_prioridadEquiposRemoteModel,
					solicitudEvaluacionDesempenoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getResponsable() {
		return _responsable;
	}

	@Override
	public void setResponsable(long responsable) {
		_responsable = responsable;

		if (_prioridadEquiposRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadEquiposRemoteModel.getClass();

				Method method = clazz.getMethod("setResponsable", long.class);

				method.invoke(_prioridadEquiposRemoteModel, responsable);
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

		if (_prioridadEquiposRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadEquiposRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_prioridadEquiposRemoteModel, activo);
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

		if (_prioridadEquiposRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadEquiposRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_prioridadEquiposRemoteModel, usuariocrea);
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

		if (_prioridadEquiposRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadEquiposRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_prioridadEquiposRemoteModel, fechacrea);
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

		if (_prioridadEquiposRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadEquiposRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_prioridadEquiposRemoteModel, usuariomodifica);
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

		if (_prioridadEquiposRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadEquiposRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_prioridadEquiposRemoteModel, fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPrioridadEquiposRemoteModel() {
		return _prioridadEquiposRemoteModel;
	}

	public void setPrioridadEquiposRemoteModel(
		BaseModel<?> prioridadEquiposRemoteModel) {
		_prioridadEquiposRemoteModel = prioridadEquiposRemoteModel;
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

		Class<?> remoteModelClass = _prioridadEquiposRemoteModel.getClass();

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

		Object returnValue = method.invoke(_prioridadEquiposRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PrioridadEquiposLocalServiceUtil.addPrioridadEquipos(this);
		}
		else {
			PrioridadEquiposLocalServiceUtil.updatePrioridadEquipos(this);
		}
	}

	@Override
	public PrioridadEquipos toEscapedModel() {
		return (PrioridadEquipos)ProxyUtil.newProxyInstance(PrioridadEquipos.class.getClassLoader(),
			new Class[] { PrioridadEquipos.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PrioridadEquiposClp clone = new PrioridadEquiposClp();

		clone.setPrioridadEquiposId(getPrioridadEquiposId());
		clone.setSolicitudEvaluacionDesempenoId(getSolicitudEvaluacionDesempenoId());
		clone.setResponsable(getResponsable());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(PrioridadEquipos prioridadEquipos) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(),
				prioridadEquipos.getFechacrea());

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

		if (!(obj instanceof PrioridadEquiposClp)) {
			return false;
		}

		PrioridadEquiposClp prioridadEquipos = (PrioridadEquiposClp)obj;

		long primaryKey = prioridadEquipos.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{prioridadEquiposId=");
		sb.append(getPrioridadEquiposId());
		sb.append(", solicitudEvaluacionDesempenoId=");
		sb.append(getSolicitudEvaluacionDesempenoId());
		sb.append(", responsable=");
		sb.append(getResponsable());
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
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.PrioridadEquipos");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>prioridadEquiposId</column-name><column-value><![CDATA[");
		sb.append(getPrioridadEquiposId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>solicitudEvaluacionDesempenoId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudEvaluacionDesempenoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responsable</column-name><column-value><![CDATA[");
		sb.append(getResponsable());
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

	private long _prioridadEquiposId;
	private long _solicitudEvaluacionDesempenoId;
	private long _responsable;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _prioridadEquiposRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
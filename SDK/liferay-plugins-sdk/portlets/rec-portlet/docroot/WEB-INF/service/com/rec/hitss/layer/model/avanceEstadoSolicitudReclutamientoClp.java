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
import com.rec.hitss.layer.service.avanceEstadoSolicitudReclutamientoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class avanceEstadoSolicitudReclutamientoClp extends BaseModelImpl<avanceEstadoSolicitudReclutamiento>
	implements avanceEstadoSolicitudReclutamiento {
	public avanceEstadoSolicitudReclutamientoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return avanceEstadoSolicitudReclutamiento.class;
	}

	@Override
	public String getModelClassName() {
		return avanceEstadoSolicitudReclutamiento.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _AESR_ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAESR_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _AESR_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("AESR_ID", getAESR_ID());
		attributes.put("AESR_ESTADO", getAESR_ESTADO());
		attributes.put("AESR_ACTIVO", getAESR_ACTIVO());
		attributes.put("AESR_USUARIO_CREA", getAESR_USUARIO_CREA());
		attributes.put("AESR_FECHA_CREA", getAESR_FECHA_CREA());
		attributes.put("AESR_USUARIO_MODIFICA", getAESR_USUARIO_MODIFICA());
		attributes.put("AESR_FECHA_MODIFICA", getAESR_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long AESR_ID = (Long)attributes.get("AESR_ID");

		if (AESR_ID != null) {
			setAESR_ID(AESR_ID);
		}

		String AESR_ESTADO = (String)attributes.get("AESR_ESTADO");

		if (AESR_ESTADO != null) {
			setAESR_ESTADO(AESR_ESTADO);
		}

		String AESR_ACTIVO = (String)attributes.get("AESR_ACTIVO");

		if (AESR_ACTIVO != null) {
			setAESR_ACTIVO(AESR_ACTIVO);
		}

		Long AESR_USUARIO_CREA = (Long)attributes.get("AESR_USUARIO_CREA");

		if (AESR_USUARIO_CREA != null) {
			setAESR_USUARIO_CREA(AESR_USUARIO_CREA);
		}

		Date AESR_FECHA_CREA = (Date)attributes.get("AESR_FECHA_CREA");

		if (AESR_FECHA_CREA != null) {
			setAESR_FECHA_CREA(AESR_FECHA_CREA);
		}

		Long AESR_USUARIO_MODIFICA = (Long)attributes.get(
				"AESR_USUARIO_MODIFICA");

		if (AESR_USUARIO_MODIFICA != null) {
			setAESR_USUARIO_MODIFICA(AESR_USUARIO_MODIFICA);
		}

		Date AESR_FECHA_MODIFICA = (Date)attributes.get("AESR_FECHA_MODIFICA");

		if (AESR_FECHA_MODIFICA != null) {
			setAESR_FECHA_MODIFICA(AESR_FECHA_MODIFICA);
		}
	}

	@Override
	public long getAESR_ID() {
		return _AESR_ID;
	}

	@Override
	public void setAESR_ID(long AESR_ID) {
		_AESR_ID = AESR_ID;

		if (_avanceEstadoSolicitudReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _avanceEstadoSolicitudReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setAESR_ID", long.class);

				method.invoke(_avanceEstadoSolicitudReclutamientoRemoteModel,
					AESR_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAESR_ESTADO() {
		return _AESR_ESTADO;
	}

	@Override
	public void setAESR_ESTADO(String AESR_ESTADO) {
		_AESR_ESTADO = AESR_ESTADO;

		if (_avanceEstadoSolicitudReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _avanceEstadoSolicitudReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setAESR_ESTADO", String.class);

				method.invoke(_avanceEstadoSolicitudReclutamientoRemoteModel,
					AESR_ESTADO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAESR_ACTIVO() {
		return _AESR_ACTIVO;
	}

	@Override
	public void setAESR_ACTIVO(String AESR_ACTIVO) {
		_AESR_ACTIVO = AESR_ACTIVO;

		if (_avanceEstadoSolicitudReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _avanceEstadoSolicitudReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setAESR_ACTIVO", String.class);

				method.invoke(_avanceEstadoSolicitudReclutamientoRemoteModel,
					AESR_ACTIVO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAESR_USUARIO_CREA() {
		return _AESR_USUARIO_CREA;
	}

	@Override
	public void setAESR_USUARIO_CREA(long AESR_USUARIO_CREA) {
		_AESR_USUARIO_CREA = AESR_USUARIO_CREA;

		if (_avanceEstadoSolicitudReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _avanceEstadoSolicitudReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setAESR_USUARIO_CREA",
						long.class);

				method.invoke(_avanceEstadoSolicitudReclutamientoRemoteModel,
					AESR_USUARIO_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getAESR_FECHA_CREA() {
		return _AESR_FECHA_CREA;
	}

	@Override
	public void setAESR_FECHA_CREA(Date AESR_FECHA_CREA) {
		_AESR_FECHA_CREA = AESR_FECHA_CREA;

		if (_avanceEstadoSolicitudReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _avanceEstadoSolicitudReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setAESR_FECHA_CREA", Date.class);

				method.invoke(_avanceEstadoSolicitudReclutamientoRemoteModel,
					AESR_FECHA_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAESR_USUARIO_MODIFICA() {
		return _AESR_USUARIO_MODIFICA;
	}

	@Override
	public void setAESR_USUARIO_MODIFICA(long AESR_USUARIO_MODIFICA) {
		_AESR_USUARIO_MODIFICA = AESR_USUARIO_MODIFICA;

		if (_avanceEstadoSolicitudReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _avanceEstadoSolicitudReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setAESR_USUARIO_MODIFICA",
						long.class);

				method.invoke(_avanceEstadoSolicitudReclutamientoRemoteModel,
					AESR_USUARIO_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getAESR_FECHA_MODIFICA() {
		return _AESR_FECHA_MODIFICA;
	}

	@Override
	public void setAESR_FECHA_MODIFICA(Date AESR_FECHA_MODIFICA) {
		_AESR_FECHA_MODIFICA = AESR_FECHA_MODIFICA;

		if (_avanceEstadoSolicitudReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _avanceEstadoSolicitudReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setAESR_FECHA_MODIFICA",
						Date.class);

				method.invoke(_avanceEstadoSolicitudReclutamientoRemoteModel,
					AESR_FECHA_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getavanceEstadoSolicitudReclutamientoRemoteModel() {
		return _avanceEstadoSolicitudReclutamientoRemoteModel;
	}

	public void setavanceEstadoSolicitudReclutamientoRemoteModel(
		BaseModel<?> avanceEstadoSolicitudReclutamientoRemoteModel) {
		_avanceEstadoSolicitudReclutamientoRemoteModel = avanceEstadoSolicitudReclutamientoRemoteModel;
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

		Class<?> remoteModelClass = _avanceEstadoSolicitudReclutamientoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_avanceEstadoSolicitudReclutamientoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			avanceEstadoSolicitudReclutamientoLocalServiceUtil.addavanceEstadoSolicitudReclutamiento(this);
		}
		else {
			avanceEstadoSolicitudReclutamientoLocalServiceUtil.updateavanceEstadoSolicitudReclutamiento(this);
		}
	}

	@Override
	public avanceEstadoSolicitudReclutamiento toEscapedModel() {
		return (avanceEstadoSolicitudReclutamiento)ProxyUtil.newProxyInstance(avanceEstadoSolicitudReclutamiento.class.getClassLoader(),
			new Class[] { avanceEstadoSolicitudReclutamiento.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		avanceEstadoSolicitudReclutamientoClp clone = new avanceEstadoSolicitudReclutamientoClp();

		clone.setAESR_ID(getAESR_ID());
		clone.setAESR_ESTADO(getAESR_ESTADO());
		clone.setAESR_ACTIVO(getAESR_ACTIVO());
		clone.setAESR_USUARIO_CREA(getAESR_USUARIO_CREA());
		clone.setAESR_FECHA_CREA(getAESR_FECHA_CREA());
		clone.setAESR_USUARIO_MODIFICA(getAESR_USUARIO_MODIFICA());
		clone.setAESR_FECHA_MODIFICA(getAESR_FECHA_MODIFICA());

		return clone;
	}

	@Override
	public int compareTo(
		avanceEstadoSolicitudReclutamiento avanceEstadoSolicitudReclutamiento) {
		int value = 0;

		if (getAESR_ID() < avanceEstadoSolicitudReclutamiento.getAESR_ID()) {
			value = -1;
		}
		else if (getAESR_ID() > avanceEstadoSolicitudReclutamiento.getAESR_ID()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof avanceEstadoSolicitudReclutamientoClp)) {
			return false;
		}

		avanceEstadoSolicitudReclutamientoClp avanceEstadoSolicitudReclutamiento =
			(avanceEstadoSolicitudReclutamientoClp)obj;

		long primaryKey = avanceEstadoSolicitudReclutamiento.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{AESR_ID=");
		sb.append(getAESR_ID());
		sb.append(", AESR_ESTADO=");
		sb.append(getAESR_ESTADO());
		sb.append(", AESR_ACTIVO=");
		sb.append(getAESR_ACTIVO());
		sb.append(", AESR_USUARIO_CREA=");
		sb.append(getAESR_USUARIO_CREA());
		sb.append(", AESR_FECHA_CREA=");
		sb.append(getAESR_FECHA_CREA());
		sb.append(", AESR_USUARIO_MODIFICA=");
		sb.append(getAESR_USUARIO_MODIFICA());
		sb.append(", AESR_FECHA_MODIFICA=");
		sb.append(getAESR_FECHA_MODIFICA());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append(
			"com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>AESR_ID</column-name><column-value><![CDATA[");
		sb.append(getAESR_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AESR_ESTADO</column-name><column-value><![CDATA[");
		sb.append(getAESR_ESTADO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AESR_ACTIVO</column-name><column-value><![CDATA[");
		sb.append(getAESR_ACTIVO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AESR_USUARIO_CREA</column-name><column-value><![CDATA[");
		sb.append(getAESR_USUARIO_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AESR_FECHA_CREA</column-name><column-value><![CDATA[");
		sb.append(getAESR_FECHA_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AESR_USUARIO_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getAESR_USUARIO_MODIFICA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AESR_FECHA_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getAESR_FECHA_MODIFICA());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _AESR_ID;
	private String _AESR_ESTADO;
	private String _AESR_ACTIVO;
	private long _AESR_USUARIO_CREA;
	private Date _AESR_FECHA_CREA;
	private long _AESR_USUARIO_MODIFICA;
	private Date _AESR_FECHA_MODIFICA;
	private BaseModel<?> _avanceEstadoSolicitudReclutamientoRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
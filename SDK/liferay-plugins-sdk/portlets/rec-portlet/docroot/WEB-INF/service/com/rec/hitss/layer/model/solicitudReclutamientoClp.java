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
import com.rec.hitss.layer.service.solicitudReclutamientoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class solicitudReclutamientoClp extends BaseModelImpl<solicitudReclutamiento>
	implements solicitudReclutamiento {
	public solicitudReclutamientoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return solicitudReclutamiento.class;
	}

	@Override
	public String getModelClassName() {
		return solicitudReclutamiento.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _SR_ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSR_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _SR_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SR_ID", getSR_ID());
		attributes.put("SR_PL_ID", getSR_PL_ID());
		attributes.put("SR_ESTADO", getSR_ESTADO());
		attributes.put("SR_ACTIVO", getSR_ACTIVO());
		attributes.put("SR_USUARIO_CREA", getSR_USUARIO_CREA());
		attributes.put("SR_FECHA_CREA", getSR_FECHA_CREA());
		attributes.put("SR_USUARIO_MODIFICA", getSR_USUARIO_MODIFICA());
		attributes.put("SR_FECHA_MODIFICA", getSR_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long SR_ID = (Long)attributes.get("SR_ID");

		if (SR_ID != null) {
			setSR_ID(SR_ID);
		}

		String SR_PL_ID = (String)attributes.get("SR_PL_ID");

		if (SR_PL_ID != null) {
			setSR_PL_ID(SR_PL_ID);
		}

		Long SR_ESTADO = (Long)attributes.get("SR_ESTADO");

		if (SR_ESTADO != null) {
			setSR_ESTADO(SR_ESTADO);
		}

		String SR_ACTIVO = (String)attributes.get("SR_ACTIVO");

		if (SR_ACTIVO != null) {
			setSR_ACTIVO(SR_ACTIVO);
		}

		Long SR_USUARIO_CREA = (Long)attributes.get("SR_USUARIO_CREA");

		if (SR_USUARIO_CREA != null) {
			setSR_USUARIO_CREA(SR_USUARIO_CREA);
		}

		Date SR_FECHA_CREA = (Date)attributes.get("SR_FECHA_CREA");

		if (SR_FECHA_CREA != null) {
			setSR_FECHA_CREA(SR_FECHA_CREA);
		}

		Long SR_USUARIO_MODIFICA = (Long)attributes.get("SR_USUARIO_MODIFICA");

		if (SR_USUARIO_MODIFICA != null) {
			setSR_USUARIO_MODIFICA(SR_USUARIO_MODIFICA);
		}

		Date SR_FECHA_MODIFICA = (Date)attributes.get("SR_FECHA_MODIFICA");

		if (SR_FECHA_MODIFICA != null) {
			setSR_FECHA_MODIFICA(SR_FECHA_MODIFICA);
		}
	}

	@Override
	public long getSR_ID() {
		return _SR_ID;
	}

	@Override
	public void setSR_ID(long SR_ID) {
		_SR_ID = SR_ID;

		if (_solicitudReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setSR_ID", long.class);

				method.invoke(_solicitudReclutamientoRemoteModel, SR_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSR_PL_ID() {
		return _SR_PL_ID;
	}

	@Override
	public void setSR_PL_ID(String SR_PL_ID) {
		_SR_PL_ID = SR_PL_ID;

		if (_solicitudReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setSR_PL_ID", String.class);

				method.invoke(_solicitudReclutamientoRemoteModel, SR_PL_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSR_ESTADO() {
		return _SR_ESTADO;
	}

	@Override
	public void setSR_ESTADO(long SR_ESTADO) {
		_SR_ESTADO = SR_ESTADO;

		if (_solicitudReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setSR_ESTADO", long.class);

				method.invoke(_solicitudReclutamientoRemoteModel, SR_ESTADO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSR_ACTIVO() {
		return _SR_ACTIVO;
	}

	@Override
	public void setSR_ACTIVO(String SR_ACTIVO) {
		_SR_ACTIVO = SR_ACTIVO;

		if (_solicitudReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setSR_ACTIVO", String.class);

				method.invoke(_solicitudReclutamientoRemoteModel, SR_ACTIVO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSR_USUARIO_CREA() {
		return _SR_USUARIO_CREA;
	}

	@Override
	public void setSR_USUARIO_CREA(long SR_USUARIO_CREA) {
		_SR_USUARIO_CREA = SR_USUARIO_CREA;

		if (_solicitudReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setSR_USUARIO_CREA", long.class);

				method.invoke(_solicitudReclutamientoRemoteModel,
					SR_USUARIO_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSR_FECHA_CREA() {
		return _SR_FECHA_CREA;
	}

	@Override
	public void setSR_FECHA_CREA(Date SR_FECHA_CREA) {
		_SR_FECHA_CREA = SR_FECHA_CREA;

		if (_solicitudReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setSR_FECHA_CREA", Date.class);

				method.invoke(_solicitudReclutamientoRemoteModel, SR_FECHA_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSR_USUARIO_MODIFICA() {
		return _SR_USUARIO_MODIFICA;
	}

	@Override
	public void setSR_USUARIO_MODIFICA(long SR_USUARIO_MODIFICA) {
		_SR_USUARIO_MODIFICA = SR_USUARIO_MODIFICA;

		if (_solicitudReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setSR_USUARIO_MODIFICA",
						long.class);

				method.invoke(_solicitudReclutamientoRemoteModel,
					SR_USUARIO_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSR_FECHA_MODIFICA() {
		return _SR_FECHA_MODIFICA;
	}

	@Override
	public void setSR_FECHA_MODIFICA(Date SR_FECHA_MODIFICA) {
		_SR_FECHA_MODIFICA = SR_FECHA_MODIFICA;

		if (_solicitudReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setSR_FECHA_MODIFICA",
						Date.class);

				method.invoke(_solicitudReclutamientoRemoteModel,
					SR_FECHA_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getsolicitudReclutamientoRemoteModel() {
		return _solicitudReclutamientoRemoteModel;
	}

	public void setsolicitudReclutamientoRemoteModel(
		BaseModel<?> solicitudReclutamientoRemoteModel) {
		_solicitudReclutamientoRemoteModel = solicitudReclutamientoRemoteModel;
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

		Class<?> remoteModelClass = _solicitudReclutamientoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_solicitudReclutamientoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			solicitudReclutamientoLocalServiceUtil.addsolicitudReclutamiento(this);
		}
		else {
			solicitudReclutamientoLocalServiceUtil.updatesolicitudReclutamiento(this);
		}
	}

	@Override
	public solicitudReclutamiento toEscapedModel() {
		return (solicitudReclutamiento)ProxyUtil.newProxyInstance(solicitudReclutamiento.class.getClassLoader(),
			new Class[] { solicitudReclutamiento.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		solicitudReclutamientoClp clone = new solicitudReclutamientoClp();

		clone.setSR_ID(getSR_ID());
		clone.setSR_PL_ID(getSR_PL_ID());
		clone.setSR_ESTADO(getSR_ESTADO());
		clone.setSR_ACTIVO(getSR_ACTIVO());
		clone.setSR_USUARIO_CREA(getSR_USUARIO_CREA());
		clone.setSR_FECHA_CREA(getSR_FECHA_CREA());
		clone.setSR_USUARIO_MODIFICA(getSR_USUARIO_MODIFICA());
		clone.setSR_FECHA_MODIFICA(getSR_FECHA_MODIFICA());

		return clone;
	}

	@Override
	public int compareTo(solicitudReclutamiento solicitudReclutamiento) {
		int value = 0;

		if (getSR_ID() < solicitudReclutamiento.getSR_ID()) {
			value = -1;
		}
		else if (getSR_ID() > solicitudReclutamiento.getSR_ID()) {
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

		if (!(obj instanceof solicitudReclutamientoClp)) {
			return false;
		}

		solicitudReclutamientoClp solicitudReclutamiento = (solicitudReclutamientoClp)obj;

		long primaryKey = solicitudReclutamiento.getPrimaryKey();

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

		sb.append("{SR_ID=");
		sb.append(getSR_ID());
		sb.append(", SR_PL_ID=");
		sb.append(getSR_PL_ID());
		sb.append(", SR_ESTADO=");
		sb.append(getSR_ESTADO());
		sb.append(", SR_ACTIVO=");
		sb.append(getSR_ACTIVO());
		sb.append(", SR_USUARIO_CREA=");
		sb.append(getSR_USUARIO_CREA());
		sb.append(", SR_FECHA_CREA=");
		sb.append(getSR_FECHA_CREA());
		sb.append(", SR_USUARIO_MODIFICA=");
		sb.append(getSR_USUARIO_MODIFICA());
		sb.append(", SR_FECHA_MODIFICA=");
		sb.append(getSR_FECHA_MODIFICA());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.solicitudReclutamiento");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>SR_ID</column-name><column-value><![CDATA[");
		sb.append(getSR_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SR_PL_ID</column-name><column-value><![CDATA[");
		sb.append(getSR_PL_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SR_ESTADO</column-name><column-value><![CDATA[");
		sb.append(getSR_ESTADO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SR_ACTIVO</column-name><column-value><![CDATA[");
		sb.append(getSR_ACTIVO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SR_USUARIO_CREA</column-name><column-value><![CDATA[");
		sb.append(getSR_USUARIO_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SR_FECHA_CREA</column-name><column-value><![CDATA[");
		sb.append(getSR_FECHA_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SR_USUARIO_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getSR_USUARIO_MODIFICA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SR_FECHA_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getSR_FECHA_MODIFICA());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _SR_ID;
	private String _SR_PL_ID;
	private long _SR_ESTADO;
	private String _SR_ACTIVO;
	private long _SR_USUARIO_CREA;
	private Date _SR_FECHA_CREA;
	private long _SR_USUARIO_MODIFICA;
	private Date _SR_FECHA_MODIFICA;
	private BaseModel<?> _solicitudReclutamientoRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
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
import com.rec.hitss.layer.service.nueveCuadrantesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class nueveCuadrantesClp extends BaseModelImpl<nueveCuadrantes>
	implements nueveCuadrantes {
	public nueveCuadrantesClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return nueveCuadrantes.class;
	}

	@Override
	public String getModelClassName() {
		return nueveCuadrantes.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _NC_ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNC_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _NC_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("NC_ID", getNC_ID());
		attributes.put("REQ_ESTADO", getREQ_ESTADO());
		attributes.put("REQ_ACTIVO", getREQ_ACTIVO());
		attributes.put("SR_USUARIO_CREA", getSR_USUARIO_CREA());
		attributes.put("SR_FECHA_CREA", getSR_FECHA_CREA());
		attributes.put("SR_USUARIO_MODIFICA", getSR_USUARIO_MODIFICA());
		attributes.put("SR_FECHA_MODIFICA", getSR_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long NC_ID = (Long)attributes.get("NC_ID");

		if (NC_ID != null) {
			setNC_ID(NC_ID);
		}

		String REQ_ESTADO = (String)attributes.get("REQ_ESTADO");

		if (REQ_ESTADO != null) {
			setREQ_ESTADO(REQ_ESTADO);
		}

		String REQ_ACTIVO = (String)attributes.get("REQ_ACTIVO");

		if (REQ_ACTIVO != null) {
			setREQ_ACTIVO(REQ_ACTIVO);
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
	public long getNC_ID() {
		return _NC_ID;
	}

	@Override
	public void setNC_ID(long NC_ID) {
		_NC_ID = NC_ID;

		if (_nueveCuadrantesRemoteModel != null) {
			try {
				Class<?> clazz = _nueveCuadrantesRemoteModel.getClass();

				Method method = clazz.getMethod("setNC_ID", long.class);

				method.invoke(_nueveCuadrantesRemoteModel, NC_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getREQ_ESTADO() {
		return _REQ_ESTADO;
	}

	@Override
	public void setREQ_ESTADO(String REQ_ESTADO) {
		_REQ_ESTADO = REQ_ESTADO;

		if (_nueveCuadrantesRemoteModel != null) {
			try {
				Class<?> clazz = _nueveCuadrantesRemoteModel.getClass();

				Method method = clazz.getMethod("setREQ_ESTADO", String.class);

				method.invoke(_nueveCuadrantesRemoteModel, REQ_ESTADO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getREQ_ACTIVO() {
		return _REQ_ACTIVO;
	}

	@Override
	public void setREQ_ACTIVO(String REQ_ACTIVO) {
		_REQ_ACTIVO = REQ_ACTIVO;

		if (_nueveCuadrantesRemoteModel != null) {
			try {
				Class<?> clazz = _nueveCuadrantesRemoteModel.getClass();

				Method method = clazz.getMethod("setREQ_ACTIVO", String.class);

				method.invoke(_nueveCuadrantesRemoteModel, REQ_ACTIVO);
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

		if (_nueveCuadrantesRemoteModel != null) {
			try {
				Class<?> clazz = _nueveCuadrantesRemoteModel.getClass();

				Method method = clazz.getMethod("setSR_USUARIO_CREA", long.class);

				method.invoke(_nueveCuadrantesRemoteModel, SR_USUARIO_CREA);
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

		if (_nueveCuadrantesRemoteModel != null) {
			try {
				Class<?> clazz = _nueveCuadrantesRemoteModel.getClass();

				Method method = clazz.getMethod("setSR_FECHA_CREA", Date.class);

				method.invoke(_nueveCuadrantesRemoteModel, SR_FECHA_CREA);
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

		if (_nueveCuadrantesRemoteModel != null) {
			try {
				Class<?> clazz = _nueveCuadrantesRemoteModel.getClass();

				Method method = clazz.getMethod("setSR_USUARIO_MODIFICA",
						long.class);

				method.invoke(_nueveCuadrantesRemoteModel, SR_USUARIO_MODIFICA);
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

		if (_nueveCuadrantesRemoteModel != null) {
			try {
				Class<?> clazz = _nueveCuadrantesRemoteModel.getClass();

				Method method = clazz.getMethod("setSR_FECHA_MODIFICA",
						Date.class);

				method.invoke(_nueveCuadrantesRemoteModel, SR_FECHA_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getnueveCuadrantesRemoteModel() {
		return _nueveCuadrantesRemoteModel;
	}

	public void setnueveCuadrantesRemoteModel(
		BaseModel<?> nueveCuadrantesRemoteModel) {
		_nueveCuadrantesRemoteModel = nueveCuadrantesRemoteModel;
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

		Class<?> remoteModelClass = _nueveCuadrantesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_nueveCuadrantesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			nueveCuadrantesLocalServiceUtil.addnueveCuadrantes(this);
		}
		else {
			nueveCuadrantesLocalServiceUtil.updatenueveCuadrantes(this);
		}
	}

	@Override
	public nueveCuadrantes toEscapedModel() {
		return (nueveCuadrantes)ProxyUtil.newProxyInstance(nueveCuadrantes.class.getClassLoader(),
			new Class[] { nueveCuadrantes.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		nueveCuadrantesClp clone = new nueveCuadrantesClp();

		clone.setNC_ID(getNC_ID());
		clone.setREQ_ESTADO(getREQ_ESTADO());
		clone.setREQ_ACTIVO(getREQ_ACTIVO());
		clone.setSR_USUARIO_CREA(getSR_USUARIO_CREA());
		clone.setSR_FECHA_CREA(getSR_FECHA_CREA());
		clone.setSR_USUARIO_MODIFICA(getSR_USUARIO_MODIFICA());
		clone.setSR_FECHA_MODIFICA(getSR_FECHA_MODIFICA());

		return clone;
	}

	@Override
	public int compareTo(nueveCuadrantes nueveCuadrantes) {
		int value = 0;

		if (getNC_ID() < nueveCuadrantes.getNC_ID()) {
			value = -1;
		}
		else if (getNC_ID() > nueveCuadrantes.getNC_ID()) {
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

		if (!(obj instanceof nueveCuadrantesClp)) {
			return false;
		}

		nueveCuadrantesClp nueveCuadrantes = (nueveCuadrantesClp)obj;

		long primaryKey = nueveCuadrantes.getPrimaryKey();

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

		sb.append("{NC_ID=");
		sb.append(getNC_ID());
		sb.append(", REQ_ESTADO=");
		sb.append(getREQ_ESTADO());
		sb.append(", REQ_ACTIVO=");
		sb.append(getREQ_ACTIVO());
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
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.nueveCuadrantes");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>NC_ID</column-name><column-value><![CDATA[");
		sb.append(getNC_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>REQ_ESTADO</column-name><column-value><![CDATA[");
		sb.append(getREQ_ESTADO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>REQ_ACTIVO</column-name><column-value><![CDATA[");
		sb.append(getREQ_ACTIVO());
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

	private long _NC_ID;
	private String _REQ_ESTADO;
	private String _REQ_ACTIVO;
	private long _SR_USUARIO_CREA;
	private Date _SR_FECHA_CREA;
	private long _SR_USUARIO_MODIFICA;
	private Date _SR_FECHA_MODIFICA;
	private BaseModel<?> _nueveCuadrantesRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
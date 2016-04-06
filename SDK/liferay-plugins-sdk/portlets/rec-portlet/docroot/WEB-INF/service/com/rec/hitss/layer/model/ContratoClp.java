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
import com.rec.hitss.layer.service.ContratoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class ContratoClp extends BaseModelImpl<Contrato> implements Contrato {
	public ContratoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Contrato.class;
	}

	@Override
	public String getModelClassName() {
		return Contrato.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _CT_ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCT_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _CT_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CT_ID", getCT_ID());
		attributes.put("CT_ESTADO", getCT_ESTADO());
		attributes.put("CT_ACTIVO", getCT_ACTIVO());
		attributes.put("CT_USUARIO_CREA", getCT_USUARIO_CREA());
		attributes.put("CT_FECHA_CREA", getCT_FECHA_CREA());
		attributes.put("CT_USUARIO_MODIFICA", getCT_USUARIO_MODIFICA());
		attributes.put("CT_FECHA_MODIFICA", getCT_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long CT_ID = (Long)attributes.get("CT_ID");

		if (CT_ID != null) {
			setCT_ID(CT_ID);
		}

		String CT_ESTADO = (String)attributes.get("CT_ESTADO");

		if (CT_ESTADO != null) {
			setCT_ESTADO(CT_ESTADO);
		}

		String CT_ACTIVO = (String)attributes.get("CT_ACTIVO");

		if (CT_ACTIVO != null) {
			setCT_ACTIVO(CT_ACTIVO);
		}

		Long CT_USUARIO_CREA = (Long)attributes.get("CT_USUARIO_CREA");

		if (CT_USUARIO_CREA != null) {
			setCT_USUARIO_CREA(CT_USUARIO_CREA);
		}

		Date CT_FECHA_CREA = (Date)attributes.get("CT_FECHA_CREA");

		if (CT_FECHA_CREA != null) {
			setCT_FECHA_CREA(CT_FECHA_CREA);
		}

		Long CT_USUARIO_MODIFICA = (Long)attributes.get("CT_USUARIO_MODIFICA");

		if (CT_USUARIO_MODIFICA != null) {
			setCT_USUARIO_MODIFICA(CT_USUARIO_MODIFICA);
		}

		Date CT_FECHA_MODIFICA = (Date)attributes.get("CT_FECHA_MODIFICA");

		if (CT_FECHA_MODIFICA != null) {
			setCT_FECHA_MODIFICA(CT_FECHA_MODIFICA);
		}
	}

	@Override
	public long getCT_ID() {
		return _CT_ID;
	}

	@Override
	public void setCT_ID(long CT_ID) {
		_CT_ID = CT_ID;

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setCT_ID", long.class);

				method.invoke(_contratoRemoteModel, CT_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCT_ESTADO() {
		return _CT_ESTADO;
	}

	@Override
	public void setCT_ESTADO(String CT_ESTADO) {
		_CT_ESTADO = CT_ESTADO;

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setCT_ESTADO", String.class);

				method.invoke(_contratoRemoteModel, CT_ESTADO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCT_ACTIVO() {
		return _CT_ACTIVO;
	}

	@Override
	public void setCT_ACTIVO(String CT_ACTIVO) {
		_CT_ACTIVO = CT_ACTIVO;

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setCT_ACTIVO", String.class);

				method.invoke(_contratoRemoteModel, CT_ACTIVO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCT_USUARIO_CREA() {
		return _CT_USUARIO_CREA;
	}

	@Override
	public void setCT_USUARIO_CREA(long CT_USUARIO_CREA) {
		_CT_USUARIO_CREA = CT_USUARIO_CREA;

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setCT_USUARIO_CREA", long.class);

				method.invoke(_contratoRemoteModel, CT_USUARIO_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCT_FECHA_CREA() {
		return _CT_FECHA_CREA;
	}

	@Override
	public void setCT_FECHA_CREA(Date CT_FECHA_CREA) {
		_CT_FECHA_CREA = CT_FECHA_CREA;

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setCT_FECHA_CREA", Date.class);

				method.invoke(_contratoRemoteModel, CT_FECHA_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCT_USUARIO_MODIFICA() {
		return _CT_USUARIO_MODIFICA;
	}

	@Override
	public void setCT_USUARIO_MODIFICA(long CT_USUARIO_MODIFICA) {
		_CT_USUARIO_MODIFICA = CT_USUARIO_MODIFICA;

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setCT_USUARIO_MODIFICA",
						long.class);

				method.invoke(_contratoRemoteModel, CT_USUARIO_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCT_FECHA_MODIFICA() {
		return _CT_FECHA_MODIFICA;
	}

	@Override
	public void setCT_FECHA_MODIFICA(Date CT_FECHA_MODIFICA) {
		_CT_FECHA_MODIFICA = CT_FECHA_MODIFICA;

		if (_contratoRemoteModel != null) {
			try {
				Class<?> clazz = _contratoRemoteModel.getClass();

				Method method = clazz.getMethod("setCT_FECHA_MODIFICA",
						Date.class);

				method.invoke(_contratoRemoteModel, CT_FECHA_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getContratoRemoteModel() {
		return _contratoRemoteModel;
	}

	public void setContratoRemoteModel(BaseModel<?> contratoRemoteModel) {
		_contratoRemoteModel = contratoRemoteModel;
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

		Class<?> remoteModelClass = _contratoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_contratoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ContratoLocalServiceUtil.addContrato(this);
		}
		else {
			ContratoLocalServiceUtil.updateContrato(this);
		}
	}

	@Override
	public Contrato toEscapedModel() {
		return (Contrato)ProxyUtil.newProxyInstance(Contrato.class.getClassLoader(),
			new Class[] { Contrato.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ContratoClp clone = new ContratoClp();

		clone.setCT_ID(getCT_ID());
		clone.setCT_ESTADO(getCT_ESTADO());
		clone.setCT_ACTIVO(getCT_ACTIVO());
		clone.setCT_USUARIO_CREA(getCT_USUARIO_CREA());
		clone.setCT_FECHA_CREA(getCT_FECHA_CREA());
		clone.setCT_USUARIO_MODIFICA(getCT_USUARIO_MODIFICA());
		clone.setCT_FECHA_MODIFICA(getCT_FECHA_MODIFICA());

		return clone;
	}

	@Override
	public int compareTo(Contrato contrato) {
		int value = 0;

		if (getCT_ID() < contrato.getCT_ID()) {
			value = -1;
		}
		else if (getCT_ID() > contrato.getCT_ID()) {
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

		if (!(obj instanceof ContratoClp)) {
			return false;
		}

		ContratoClp contrato = (ContratoClp)obj;

		long primaryKey = contrato.getPrimaryKey();

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

		sb.append("{CT_ID=");
		sb.append(getCT_ID());
		sb.append(", CT_ESTADO=");
		sb.append(getCT_ESTADO());
		sb.append(", CT_ACTIVO=");
		sb.append(getCT_ACTIVO());
		sb.append(", CT_USUARIO_CREA=");
		sb.append(getCT_USUARIO_CREA());
		sb.append(", CT_FECHA_CREA=");
		sb.append(getCT_FECHA_CREA());
		sb.append(", CT_USUARIO_MODIFICA=");
		sb.append(getCT_USUARIO_MODIFICA());
		sb.append(", CT_FECHA_MODIFICA=");
		sb.append(getCT_FECHA_MODIFICA());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.Contrato");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>CT_ID</column-name><column-value><![CDATA[");
		sb.append(getCT_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CT_ESTADO</column-name><column-value><![CDATA[");
		sb.append(getCT_ESTADO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CT_ACTIVO</column-name><column-value><![CDATA[");
		sb.append(getCT_ACTIVO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CT_USUARIO_CREA</column-name><column-value><![CDATA[");
		sb.append(getCT_USUARIO_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CT_FECHA_CREA</column-name><column-value><![CDATA[");
		sb.append(getCT_FECHA_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CT_USUARIO_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getCT_USUARIO_MODIFICA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CT_FECHA_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getCT_FECHA_MODIFICA());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _CT_ID;
	private String _CT_ESTADO;
	private String _CT_ACTIVO;
	private long _CT_USUARIO_CREA;
	private Date _CT_FECHA_CREA;
	private long _CT_USUARIO_MODIFICA;
	private Date _CT_FECHA_MODIFICA;
	private BaseModel<?> _contratoRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
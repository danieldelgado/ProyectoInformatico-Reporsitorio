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
import com.rec.hitss.layer.service.fichaIngresoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class fichaIngresoClp extends BaseModelImpl<fichaIngreso>
	implements fichaIngreso {
	public fichaIngresoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return fichaIngreso.class;
	}

	@Override
	public String getModelClassName() {
		return fichaIngreso.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _FI_ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFI_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _FI_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("FI_ID", getFI_ID());
		attributes.put("FI_ESTADO", getFI_ESTADO());
		attributes.put("FI_ACTIVO", getFI_ACTIVO());
		attributes.put("FI_USUARIO_CREA", getFI_USUARIO_CREA());
		attributes.put("FI_FECHA_CREA", getFI_FECHA_CREA());
		attributes.put("FI_USUARIO_MODIFICA", getFI_USUARIO_MODIFICA());
		attributes.put("FI_FECHA_MODIFICA", getFI_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long FI_ID = (Long)attributes.get("FI_ID");

		if (FI_ID != null) {
			setFI_ID(FI_ID);
		}

		String FI_ESTADO = (String)attributes.get("FI_ESTADO");

		if (FI_ESTADO != null) {
			setFI_ESTADO(FI_ESTADO);
		}

		String FI_ACTIVO = (String)attributes.get("FI_ACTIVO");

		if (FI_ACTIVO != null) {
			setFI_ACTIVO(FI_ACTIVO);
		}

		Long FI_USUARIO_CREA = (Long)attributes.get("FI_USUARIO_CREA");

		if (FI_USUARIO_CREA != null) {
			setFI_USUARIO_CREA(FI_USUARIO_CREA);
		}

		Date FI_FECHA_CREA = (Date)attributes.get("FI_FECHA_CREA");

		if (FI_FECHA_CREA != null) {
			setFI_FECHA_CREA(FI_FECHA_CREA);
		}

		Long FI_USUARIO_MODIFICA = (Long)attributes.get("FI_USUARIO_MODIFICA");

		if (FI_USUARIO_MODIFICA != null) {
			setFI_USUARIO_MODIFICA(FI_USUARIO_MODIFICA);
		}

		Date FI_FECHA_MODIFICA = (Date)attributes.get("FI_FECHA_MODIFICA");

		if (FI_FECHA_MODIFICA != null) {
			setFI_FECHA_MODIFICA(FI_FECHA_MODIFICA);
		}
	}

	@Override
	public long getFI_ID() {
		return _FI_ID;
	}

	@Override
	public void setFI_ID(long FI_ID) {
		_FI_ID = FI_ID;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setFI_ID", long.class);

				method.invoke(_fichaIngresoRemoteModel, FI_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFI_ESTADO() {
		return _FI_ESTADO;
	}

	@Override
	public void setFI_ESTADO(String FI_ESTADO) {
		_FI_ESTADO = FI_ESTADO;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setFI_ESTADO", String.class);

				method.invoke(_fichaIngresoRemoteModel, FI_ESTADO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFI_ACTIVO() {
		return _FI_ACTIVO;
	}

	@Override
	public void setFI_ACTIVO(String FI_ACTIVO) {
		_FI_ACTIVO = FI_ACTIVO;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setFI_ACTIVO", String.class);

				method.invoke(_fichaIngresoRemoteModel, FI_ACTIVO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFI_USUARIO_CREA() {
		return _FI_USUARIO_CREA;
	}

	@Override
	public void setFI_USUARIO_CREA(long FI_USUARIO_CREA) {
		_FI_USUARIO_CREA = FI_USUARIO_CREA;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setFI_USUARIO_CREA", long.class);

				method.invoke(_fichaIngresoRemoteModel, FI_USUARIO_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFI_FECHA_CREA() {
		return _FI_FECHA_CREA;
	}

	@Override
	public void setFI_FECHA_CREA(Date FI_FECHA_CREA) {
		_FI_FECHA_CREA = FI_FECHA_CREA;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setFI_FECHA_CREA", Date.class);

				method.invoke(_fichaIngresoRemoteModel, FI_FECHA_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFI_USUARIO_MODIFICA() {
		return _FI_USUARIO_MODIFICA;
	}

	@Override
	public void setFI_USUARIO_MODIFICA(long FI_USUARIO_MODIFICA) {
		_FI_USUARIO_MODIFICA = FI_USUARIO_MODIFICA;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setFI_USUARIO_MODIFICA",
						long.class);

				method.invoke(_fichaIngresoRemoteModel, FI_USUARIO_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFI_FECHA_MODIFICA() {
		return _FI_FECHA_MODIFICA;
	}

	@Override
	public void setFI_FECHA_MODIFICA(Date FI_FECHA_MODIFICA) {
		_FI_FECHA_MODIFICA = FI_FECHA_MODIFICA;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setFI_FECHA_MODIFICA",
						Date.class);

				method.invoke(_fichaIngresoRemoteModel, FI_FECHA_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getfichaIngresoRemoteModel() {
		return _fichaIngresoRemoteModel;
	}

	public void setfichaIngresoRemoteModel(BaseModel<?> fichaIngresoRemoteModel) {
		_fichaIngresoRemoteModel = fichaIngresoRemoteModel;
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

		Class<?> remoteModelClass = _fichaIngresoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_fichaIngresoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			fichaIngresoLocalServiceUtil.addfichaIngreso(this);
		}
		else {
			fichaIngresoLocalServiceUtil.updatefichaIngreso(this);
		}
	}

	@Override
	public fichaIngreso toEscapedModel() {
		return (fichaIngreso)ProxyUtil.newProxyInstance(fichaIngreso.class.getClassLoader(),
			new Class[] { fichaIngreso.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		fichaIngresoClp clone = new fichaIngresoClp();

		clone.setFI_ID(getFI_ID());
		clone.setFI_ESTADO(getFI_ESTADO());
		clone.setFI_ACTIVO(getFI_ACTIVO());
		clone.setFI_USUARIO_CREA(getFI_USUARIO_CREA());
		clone.setFI_FECHA_CREA(getFI_FECHA_CREA());
		clone.setFI_USUARIO_MODIFICA(getFI_USUARIO_MODIFICA());
		clone.setFI_FECHA_MODIFICA(getFI_FECHA_MODIFICA());

		return clone;
	}

	@Override
	public int compareTo(fichaIngreso fichaIngreso) {
		int value = 0;

		if (getFI_ID() < fichaIngreso.getFI_ID()) {
			value = -1;
		}
		else if (getFI_ID() > fichaIngreso.getFI_ID()) {
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

		if (!(obj instanceof fichaIngresoClp)) {
			return false;
		}

		fichaIngresoClp fichaIngreso = (fichaIngresoClp)obj;

		long primaryKey = fichaIngreso.getPrimaryKey();

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

		sb.append("{FI_ID=");
		sb.append(getFI_ID());
		sb.append(", FI_ESTADO=");
		sb.append(getFI_ESTADO());
		sb.append(", FI_ACTIVO=");
		sb.append(getFI_ACTIVO());
		sb.append(", FI_USUARIO_CREA=");
		sb.append(getFI_USUARIO_CREA());
		sb.append(", FI_FECHA_CREA=");
		sb.append(getFI_FECHA_CREA());
		sb.append(", FI_USUARIO_MODIFICA=");
		sb.append(getFI_USUARIO_MODIFICA());
		sb.append(", FI_FECHA_MODIFICA=");
		sb.append(getFI_FECHA_MODIFICA());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.fichaIngreso");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>FI_ID</column-name><column-value><![CDATA[");
		sb.append(getFI_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FI_ESTADO</column-name><column-value><![CDATA[");
		sb.append(getFI_ESTADO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FI_ACTIVO</column-name><column-value><![CDATA[");
		sb.append(getFI_ACTIVO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FI_USUARIO_CREA</column-name><column-value><![CDATA[");
		sb.append(getFI_USUARIO_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FI_FECHA_CREA</column-name><column-value><![CDATA[");
		sb.append(getFI_FECHA_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FI_USUARIO_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getFI_USUARIO_MODIFICA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FI_FECHA_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getFI_FECHA_MODIFICA());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _FI_ID;
	private String _FI_ESTADO;
	private String _FI_ACTIVO;
	private long _FI_USUARIO_CREA;
	private Date _FI_FECHA_CREA;
	private long _FI_USUARIO_MODIFICA;
	private Date _FI_FECHA_MODIFICA;
	private BaseModel<?> _fichaIngresoRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
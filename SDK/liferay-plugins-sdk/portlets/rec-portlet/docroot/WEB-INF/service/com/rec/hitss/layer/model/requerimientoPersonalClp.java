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
import com.rec.hitss.layer.service.requerimientoPersonalLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class requerimientoPersonalClp extends BaseModelImpl<requerimientoPersonal>
	implements requerimientoPersonal {
	public requerimientoPersonalClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return requerimientoPersonal.class;
	}

	@Override
	public String getModelClassName() {
		return requerimientoPersonal.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _REQ_ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setREQ_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _REQ_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("REQ_ID", getREQ_ID());
		attributes.put("REQ_ESTADO", getREQ_ESTADO());
		attributes.put("REQ_ACTIVO", getREQ_ACTIVO());
		attributes.put("REQ_USUARIO_CREA", getREQ_USUARIO_CREA());
		attributes.put("REQ_FECHA_CREA", getREQ_FECHA_CREA());
		attributes.put("REQ_USUARIO_MODIFICA", getREQ_USUARIO_MODIFICA());
		attributes.put("REQ_FECHA_MODIFICA", getREQ_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long REQ_ID = (Long)attributes.get("REQ_ID");

		if (REQ_ID != null) {
			setREQ_ID(REQ_ID);
		}

		String REQ_ESTADO = (String)attributes.get("REQ_ESTADO");

		if (REQ_ESTADO != null) {
			setREQ_ESTADO(REQ_ESTADO);
		}

		String REQ_ACTIVO = (String)attributes.get("REQ_ACTIVO");

		if (REQ_ACTIVO != null) {
			setREQ_ACTIVO(REQ_ACTIVO);
		}

		Long REQ_USUARIO_CREA = (Long)attributes.get("REQ_USUARIO_CREA");

		if (REQ_USUARIO_CREA != null) {
			setREQ_USUARIO_CREA(REQ_USUARIO_CREA);
		}

		Date REQ_FECHA_CREA = (Date)attributes.get("REQ_FECHA_CREA");

		if (REQ_FECHA_CREA != null) {
			setREQ_FECHA_CREA(REQ_FECHA_CREA);
		}

		Long REQ_USUARIO_MODIFICA = (Long)attributes.get("REQ_USUARIO_MODIFICA");

		if (REQ_USUARIO_MODIFICA != null) {
			setREQ_USUARIO_MODIFICA(REQ_USUARIO_MODIFICA);
		}

		Date REQ_FECHA_MODIFICA = (Date)attributes.get("REQ_FECHA_MODIFICA");

		if (REQ_FECHA_MODIFICA != null) {
			setREQ_FECHA_MODIFICA(REQ_FECHA_MODIFICA);
		}
	}

	@Override
	public long getREQ_ID() {
		return _REQ_ID;
	}

	@Override
	public void setREQ_ID(long REQ_ID) {
		_REQ_ID = REQ_ID;

		if (_requerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setREQ_ID", long.class);

				method.invoke(_requerimientoPersonalRemoteModel, REQ_ID);
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

		if (_requerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setREQ_ESTADO", String.class);

				method.invoke(_requerimientoPersonalRemoteModel, REQ_ESTADO);
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

		if (_requerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setREQ_ACTIVO", String.class);

				method.invoke(_requerimientoPersonalRemoteModel, REQ_ACTIVO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getREQ_USUARIO_CREA() {
		return _REQ_USUARIO_CREA;
	}

	@Override
	public void setREQ_USUARIO_CREA(long REQ_USUARIO_CREA) {
		_REQ_USUARIO_CREA = REQ_USUARIO_CREA;

		if (_requerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setREQ_USUARIO_CREA",
						long.class);

				method.invoke(_requerimientoPersonalRemoteModel,
					REQ_USUARIO_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getREQ_FECHA_CREA() {
		return _REQ_FECHA_CREA;
	}

	@Override
	public void setREQ_FECHA_CREA(Date REQ_FECHA_CREA) {
		_REQ_FECHA_CREA = REQ_FECHA_CREA;

		if (_requerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setREQ_FECHA_CREA", Date.class);

				method.invoke(_requerimientoPersonalRemoteModel, REQ_FECHA_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getREQ_USUARIO_MODIFICA() {
		return _REQ_USUARIO_MODIFICA;
	}

	@Override
	public void setREQ_USUARIO_MODIFICA(long REQ_USUARIO_MODIFICA) {
		_REQ_USUARIO_MODIFICA = REQ_USUARIO_MODIFICA;

		if (_requerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setREQ_USUARIO_MODIFICA",
						long.class);

				method.invoke(_requerimientoPersonalRemoteModel,
					REQ_USUARIO_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getREQ_FECHA_MODIFICA() {
		return _REQ_FECHA_MODIFICA;
	}

	@Override
	public void setREQ_FECHA_MODIFICA(Date REQ_FECHA_MODIFICA) {
		_REQ_FECHA_MODIFICA = REQ_FECHA_MODIFICA;

		if (_requerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setREQ_FECHA_MODIFICA",
						Date.class);

				method.invoke(_requerimientoPersonalRemoteModel,
					REQ_FECHA_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getrequerimientoPersonalRemoteModel() {
		return _requerimientoPersonalRemoteModel;
	}

	public void setrequerimientoPersonalRemoteModel(
		BaseModel<?> requerimientoPersonalRemoteModel) {
		_requerimientoPersonalRemoteModel = requerimientoPersonalRemoteModel;
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

		Class<?> remoteModelClass = _requerimientoPersonalRemoteModel.getClass();

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

		Object returnValue = method.invoke(_requerimientoPersonalRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			requerimientoPersonalLocalServiceUtil.addrequerimientoPersonal(this);
		}
		else {
			requerimientoPersonalLocalServiceUtil.updaterequerimientoPersonal(this);
		}
	}

	@Override
	public requerimientoPersonal toEscapedModel() {
		return (requerimientoPersonal)ProxyUtil.newProxyInstance(requerimientoPersonal.class.getClassLoader(),
			new Class[] { requerimientoPersonal.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		requerimientoPersonalClp clone = new requerimientoPersonalClp();

		clone.setREQ_ID(getREQ_ID());
		clone.setREQ_ESTADO(getREQ_ESTADO());
		clone.setREQ_ACTIVO(getREQ_ACTIVO());
		clone.setREQ_USUARIO_CREA(getREQ_USUARIO_CREA());
		clone.setREQ_FECHA_CREA(getREQ_FECHA_CREA());
		clone.setREQ_USUARIO_MODIFICA(getREQ_USUARIO_MODIFICA());
		clone.setREQ_FECHA_MODIFICA(getREQ_FECHA_MODIFICA());

		return clone;
	}

	@Override
	public int compareTo(requerimientoPersonal requerimientoPersonal) {
		int value = 0;

		if (getREQ_ID() < requerimientoPersonal.getREQ_ID()) {
			value = -1;
		}
		else if (getREQ_ID() > requerimientoPersonal.getREQ_ID()) {
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

		if (!(obj instanceof requerimientoPersonalClp)) {
			return false;
		}

		requerimientoPersonalClp requerimientoPersonal = (requerimientoPersonalClp)obj;

		long primaryKey = requerimientoPersonal.getPrimaryKey();

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

		sb.append("{REQ_ID=");
		sb.append(getREQ_ID());
		sb.append(", REQ_ESTADO=");
		sb.append(getREQ_ESTADO());
		sb.append(", REQ_ACTIVO=");
		sb.append(getREQ_ACTIVO());
		sb.append(", REQ_USUARIO_CREA=");
		sb.append(getREQ_USUARIO_CREA());
		sb.append(", REQ_FECHA_CREA=");
		sb.append(getREQ_FECHA_CREA());
		sb.append(", REQ_USUARIO_MODIFICA=");
		sb.append(getREQ_USUARIO_MODIFICA());
		sb.append(", REQ_FECHA_MODIFICA=");
		sb.append(getREQ_FECHA_MODIFICA());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.requerimientoPersonal");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>REQ_ID</column-name><column-value><![CDATA[");
		sb.append(getREQ_ID());
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
			"<column><column-name>REQ_USUARIO_CREA</column-name><column-value><![CDATA[");
		sb.append(getREQ_USUARIO_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>REQ_FECHA_CREA</column-name><column-value><![CDATA[");
		sb.append(getREQ_FECHA_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>REQ_USUARIO_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getREQ_USUARIO_MODIFICA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>REQ_FECHA_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getREQ_FECHA_MODIFICA());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _REQ_ID;
	private String _REQ_ESTADO;
	private String _REQ_ACTIVO;
	private long _REQ_USUARIO_CREA;
	private Date _REQ_FECHA_CREA;
	private long _REQ_USUARIO_MODIFICA;
	private Date _REQ_FECHA_MODIFICA;
	private BaseModel<?> _requerimientoPersonalRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
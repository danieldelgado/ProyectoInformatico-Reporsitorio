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
import com.rec.hitss.layer.service.cartillaReclutamientoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class cartillaReclutamientoClp extends BaseModelImpl<cartillaReclutamiento>
	implements cartillaReclutamiento {
	public cartillaReclutamientoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return cartillaReclutamiento.class;
	}

	@Override
	public String getModelClassName() {
		return cartillaReclutamiento.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _CR_ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCR_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _CR_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CR_ID", getCR_ID());
		attributes.put("CR_ESTADO", getCR_ESTADO());
		attributes.put("CR_ACTIVO", getCR_ACTIVO());
		attributes.put("CR_USUARIO_CREA", getCR_USUARIO_CREA());
		attributes.put("CR_FECHA_CREA", getCR_FECHA_CREA());
		attributes.put("CR_USUARIO_MODIFICA", getCR_USUARIO_MODIFICA());
		attributes.put("CR_FECHA_MODIFICA", getCR_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long CR_ID = (Long)attributes.get("CR_ID");

		if (CR_ID != null) {
			setCR_ID(CR_ID);
		}

		String CR_ESTADO = (String)attributes.get("CR_ESTADO");

		if (CR_ESTADO != null) {
			setCR_ESTADO(CR_ESTADO);
		}

		String CR_ACTIVO = (String)attributes.get("CR_ACTIVO");

		if (CR_ACTIVO != null) {
			setCR_ACTIVO(CR_ACTIVO);
		}

		Long CR_USUARIO_CREA = (Long)attributes.get("CR_USUARIO_CREA");

		if (CR_USUARIO_CREA != null) {
			setCR_USUARIO_CREA(CR_USUARIO_CREA);
		}

		Date CR_FECHA_CREA = (Date)attributes.get("CR_FECHA_CREA");

		if (CR_FECHA_CREA != null) {
			setCR_FECHA_CREA(CR_FECHA_CREA);
		}

		Long CR_USUARIO_MODIFICA = (Long)attributes.get("CR_USUARIO_MODIFICA");

		if (CR_USUARIO_MODIFICA != null) {
			setCR_USUARIO_MODIFICA(CR_USUARIO_MODIFICA);
		}

		Date CR_FECHA_MODIFICA = (Date)attributes.get("CR_FECHA_MODIFICA");

		if (CR_FECHA_MODIFICA != null) {
			setCR_FECHA_MODIFICA(CR_FECHA_MODIFICA);
		}
	}

	@Override
	public long getCR_ID() {
		return _CR_ID;
	}

	@Override
	public void setCR_ID(long CR_ID) {
		_CR_ID = CR_ID;

		if (_cartillaReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _cartillaReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setCR_ID", long.class);

				method.invoke(_cartillaReclutamientoRemoteModel, CR_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCR_ESTADO() {
		return _CR_ESTADO;
	}

	@Override
	public void setCR_ESTADO(String CR_ESTADO) {
		_CR_ESTADO = CR_ESTADO;

		if (_cartillaReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _cartillaReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setCR_ESTADO", String.class);

				method.invoke(_cartillaReclutamientoRemoteModel, CR_ESTADO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCR_ACTIVO() {
		return _CR_ACTIVO;
	}

	@Override
	public void setCR_ACTIVO(String CR_ACTIVO) {
		_CR_ACTIVO = CR_ACTIVO;

		if (_cartillaReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _cartillaReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setCR_ACTIVO", String.class);

				method.invoke(_cartillaReclutamientoRemoteModel, CR_ACTIVO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCR_USUARIO_CREA() {
		return _CR_USUARIO_CREA;
	}

	@Override
	public void setCR_USUARIO_CREA(long CR_USUARIO_CREA) {
		_CR_USUARIO_CREA = CR_USUARIO_CREA;

		if (_cartillaReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _cartillaReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setCR_USUARIO_CREA", long.class);

				method.invoke(_cartillaReclutamientoRemoteModel, CR_USUARIO_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCR_FECHA_CREA() {
		return _CR_FECHA_CREA;
	}

	@Override
	public void setCR_FECHA_CREA(Date CR_FECHA_CREA) {
		_CR_FECHA_CREA = CR_FECHA_CREA;

		if (_cartillaReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _cartillaReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setCR_FECHA_CREA", Date.class);

				method.invoke(_cartillaReclutamientoRemoteModel, CR_FECHA_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCR_USUARIO_MODIFICA() {
		return _CR_USUARIO_MODIFICA;
	}

	@Override
	public void setCR_USUARIO_MODIFICA(long CR_USUARIO_MODIFICA) {
		_CR_USUARIO_MODIFICA = CR_USUARIO_MODIFICA;

		if (_cartillaReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _cartillaReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setCR_USUARIO_MODIFICA",
						long.class);

				method.invoke(_cartillaReclutamientoRemoteModel,
					CR_USUARIO_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCR_FECHA_MODIFICA() {
		return _CR_FECHA_MODIFICA;
	}

	@Override
	public void setCR_FECHA_MODIFICA(Date CR_FECHA_MODIFICA) {
		_CR_FECHA_MODIFICA = CR_FECHA_MODIFICA;

		if (_cartillaReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _cartillaReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setCR_FECHA_MODIFICA",
						Date.class);

				method.invoke(_cartillaReclutamientoRemoteModel,
					CR_FECHA_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getcartillaReclutamientoRemoteModel() {
		return _cartillaReclutamientoRemoteModel;
	}

	public void setcartillaReclutamientoRemoteModel(
		BaseModel<?> cartillaReclutamientoRemoteModel) {
		_cartillaReclutamientoRemoteModel = cartillaReclutamientoRemoteModel;
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

		Class<?> remoteModelClass = _cartillaReclutamientoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_cartillaReclutamientoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			cartillaReclutamientoLocalServiceUtil.addcartillaReclutamiento(this);
		}
		else {
			cartillaReclutamientoLocalServiceUtil.updatecartillaReclutamiento(this);
		}
	}

	@Override
	public cartillaReclutamiento toEscapedModel() {
		return (cartillaReclutamiento)ProxyUtil.newProxyInstance(cartillaReclutamiento.class.getClassLoader(),
			new Class[] { cartillaReclutamiento.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		cartillaReclutamientoClp clone = new cartillaReclutamientoClp();

		clone.setCR_ID(getCR_ID());
		clone.setCR_ESTADO(getCR_ESTADO());
		clone.setCR_ACTIVO(getCR_ACTIVO());
		clone.setCR_USUARIO_CREA(getCR_USUARIO_CREA());
		clone.setCR_FECHA_CREA(getCR_FECHA_CREA());
		clone.setCR_USUARIO_MODIFICA(getCR_USUARIO_MODIFICA());
		clone.setCR_FECHA_MODIFICA(getCR_FECHA_MODIFICA());

		return clone;
	}

	@Override
	public int compareTo(cartillaReclutamiento cartillaReclutamiento) {
		int value = 0;

		if (getCR_ID() < cartillaReclutamiento.getCR_ID()) {
			value = -1;
		}
		else if (getCR_ID() > cartillaReclutamiento.getCR_ID()) {
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

		if (!(obj instanceof cartillaReclutamientoClp)) {
			return false;
		}

		cartillaReclutamientoClp cartillaReclutamiento = (cartillaReclutamientoClp)obj;

		long primaryKey = cartillaReclutamiento.getPrimaryKey();

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

		sb.append("{CR_ID=");
		sb.append(getCR_ID());
		sb.append(", CR_ESTADO=");
		sb.append(getCR_ESTADO());
		sb.append(", CR_ACTIVO=");
		sb.append(getCR_ACTIVO());
		sb.append(", CR_USUARIO_CREA=");
		sb.append(getCR_USUARIO_CREA());
		sb.append(", CR_FECHA_CREA=");
		sb.append(getCR_FECHA_CREA());
		sb.append(", CR_USUARIO_MODIFICA=");
		sb.append(getCR_USUARIO_MODIFICA());
		sb.append(", CR_FECHA_MODIFICA=");
		sb.append(getCR_FECHA_MODIFICA());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.cartillaReclutamiento");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>CR_ID</column-name><column-value><![CDATA[");
		sb.append(getCR_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CR_ESTADO</column-name><column-value><![CDATA[");
		sb.append(getCR_ESTADO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CR_ACTIVO</column-name><column-value><![CDATA[");
		sb.append(getCR_ACTIVO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CR_USUARIO_CREA</column-name><column-value><![CDATA[");
		sb.append(getCR_USUARIO_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CR_FECHA_CREA</column-name><column-value><![CDATA[");
		sb.append(getCR_FECHA_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CR_USUARIO_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getCR_USUARIO_MODIFICA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CR_FECHA_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getCR_FECHA_MODIFICA());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _CR_ID;
	private String _CR_ESTADO;
	private String _CR_ACTIVO;
	private long _CR_USUARIO_CREA;
	private Date _CR_FECHA_CREA;
	private long _CR_USUARIO_MODIFICA;
	private Date _CR_FECHA_MODIFICA;
	private BaseModel<?> _cartillaReclutamientoRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
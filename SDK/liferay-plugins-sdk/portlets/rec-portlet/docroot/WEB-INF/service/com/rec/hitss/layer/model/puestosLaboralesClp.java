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
import com.rec.hitss.layer.service.puestosLaboralesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class puestosLaboralesClp extends BaseModelImpl<puestosLaborales>
	implements puestosLaborales {
	public puestosLaboralesClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return puestosLaborales.class;
	}

	@Override
	public String getModelClassName() {
		return puestosLaborales.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _PL_ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPL_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PL_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PL_ID", getPL_ID());
		attributes.put("PL_PUESTO", getPL_PUESTO());
		attributes.put("PL_ESTADO", getPL_ESTADO());
		attributes.put("PL_ACTIVO", getPL_ACTIVO());
		attributes.put("PL_USUARIO_CREA", getPL_USUARIO_CREA());
		attributes.put("PL_FECHA_CREA", getPL_FECHA_CREA());
		attributes.put("PL_USUARIO_MODIFICA", getPL_USUARIO_MODIFICA());
		attributes.put("PL_FECHA_MODIFICA", getPL_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long PL_ID = (Long)attributes.get("PL_ID");

		if (PL_ID != null) {
			setPL_ID(PL_ID);
		}

		String PL_PUESTO = (String)attributes.get("PL_PUESTO");

		if (PL_PUESTO != null) {
			setPL_PUESTO(PL_PUESTO);
		}

		String PL_ESTADO = (String)attributes.get("PL_ESTADO");

		if (PL_ESTADO != null) {
			setPL_ESTADO(PL_ESTADO);
		}

		String PL_ACTIVO = (String)attributes.get("PL_ACTIVO");

		if (PL_ACTIVO != null) {
			setPL_ACTIVO(PL_ACTIVO);
		}

		Long PL_USUARIO_CREA = (Long)attributes.get("PL_USUARIO_CREA");

		if (PL_USUARIO_CREA != null) {
			setPL_USUARIO_CREA(PL_USUARIO_CREA);
		}

		Date PL_FECHA_CREA = (Date)attributes.get("PL_FECHA_CREA");

		if (PL_FECHA_CREA != null) {
			setPL_FECHA_CREA(PL_FECHA_CREA);
		}

		Long PL_USUARIO_MODIFICA = (Long)attributes.get("PL_USUARIO_MODIFICA");

		if (PL_USUARIO_MODIFICA != null) {
			setPL_USUARIO_MODIFICA(PL_USUARIO_MODIFICA);
		}

		Date PL_FECHA_MODIFICA = (Date)attributes.get("PL_FECHA_MODIFICA");

		if (PL_FECHA_MODIFICA != null) {
			setPL_FECHA_MODIFICA(PL_FECHA_MODIFICA);
		}
	}

	@Override
	public long getPL_ID() {
		return _PL_ID;
	}

	@Override
	public void setPL_ID(long PL_ID) {
		_PL_ID = PL_ID;

		if (_puestosLaboralesRemoteModel != null) {
			try {
				Class<?> clazz = _puestosLaboralesRemoteModel.getClass();

				Method method = clazz.getMethod("setPL_ID", long.class);

				method.invoke(_puestosLaboralesRemoteModel, PL_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPL_PUESTO() {
		return _PL_PUESTO;
	}

	@Override
	public void setPL_PUESTO(String PL_PUESTO) {
		_PL_PUESTO = PL_PUESTO;

		if (_puestosLaboralesRemoteModel != null) {
			try {
				Class<?> clazz = _puestosLaboralesRemoteModel.getClass();

				Method method = clazz.getMethod("setPL_PUESTO", String.class);

				method.invoke(_puestosLaboralesRemoteModel, PL_PUESTO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPL_ESTADO() {
		return _PL_ESTADO;
	}

	@Override
	public void setPL_ESTADO(String PL_ESTADO) {
		_PL_ESTADO = PL_ESTADO;

		if (_puestosLaboralesRemoteModel != null) {
			try {
				Class<?> clazz = _puestosLaboralesRemoteModel.getClass();

				Method method = clazz.getMethod("setPL_ESTADO", String.class);

				method.invoke(_puestosLaboralesRemoteModel, PL_ESTADO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPL_ACTIVO() {
		return _PL_ACTIVO;
	}

	@Override
	public void setPL_ACTIVO(String PL_ACTIVO) {
		_PL_ACTIVO = PL_ACTIVO;

		if (_puestosLaboralesRemoteModel != null) {
			try {
				Class<?> clazz = _puestosLaboralesRemoteModel.getClass();

				Method method = clazz.getMethod("setPL_ACTIVO", String.class);

				method.invoke(_puestosLaboralesRemoteModel, PL_ACTIVO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPL_USUARIO_CREA() {
		return _PL_USUARIO_CREA;
	}

	@Override
	public void setPL_USUARIO_CREA(long PL_USUARIO_CREA) {
		_PL_USUARIO_CREA = PL_USUARIO_CREA;

		if (_puestosLaboralesRemoteModel != null) {
			try {
				Class<?> clazz = _puestosLaboralesRemoteModel.getClass();

				Method method = clazz.getMethod("setPL_USUARIO_CREA", long.class);

				method.invoke(_puestosLaboralesRemoteModel, PL_USUARIO_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPL_FECHA_CREA() {
		return _PL_FECHA_CREA;
	}

	@Override
	public void setPL_FECHA_CREA(Date PL_FECHA_CREA) {
		_PL_FECHA_CREA = PL_FECHA_CREA;

		if (_puestosLaboralesRemoteModel != null) {
			try {
				Class<?> clazz = _puestosLaboralesRemoteModel.getClass();

				Method method = clazz.getMethod("setPL_FECHA_CREA", Date.class);

				method.invoke(_puestosLaboralesRemoteModel, PL_FECHA_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPL_USUARIO_MODIFICA() {
		return _PL_USUARIO_MODIFICA;
	}

	@Override
	public void setPL_USUARIO_MODIFICA(long PL_USUARIO_MODIFICA) {
		_PL_USUARIO_MODIFICA = PL_USUARIO_MODIFICA;

		if (_puestosLaboralesRemoteModel != null) {
			try {
				Class<?> clazz = _puestosLaboralesRemoteModel.getClass();

				Method method = clazz.getMethod("setPL_USUARIO_MODIFICA",
						long.class);

				method.invoke(_puestosLaboralesRemoteModel, PL_USUARIO_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPL_FECHA_MODIFICA() {
		return _PL_FECHA_MODIFICA;
	}

	@Override
	public void setPL_FECHA_MODIFICA(Date PL_FECHA_MODIFICA) {
		_PL_FECHA_MODIFICA = PL_FECHA_MODIFICA;

		if (_puestosLaboralesRemoteModel != null) {
			try {
				Class<?> clazz = _puestosLaboralesRemoteModel.getClass();

				Method method = clazz.getMethod("setPL_FECHA_MODIFICA",
						Date.class);

				method.invoke(_puestosLaboralesRemoteModel, PL_FECHA_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getpuestosLaboralesRemoteModel() {
		return _puestosLaboralesRemoteModel;
	}

	public void setpuestosLaboralesRemoteModel(
		BaseModel<?> puestosLaboralesRemoteModel) {
		_puestosLaboralesRemoteModel = puestosLaboralesRemoteModel;
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

		Class<?> remoteModelClass = _puestosLaboralesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_puestosLaboralesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			puestosLaboralesLocalServiceUtil.addpuestosLaborales(this);
		}
		else {
			puestosLaboralesLocalServiceUtil.updatepuestosLaborales(this);
		}
	}

	@Override
	public puestosLaborales toEscapedModel() {
		return (puestosLaborales)ProxyUtil.newProxyInstance(puestosLaborales.class.getClassLoader(),
			new Class[] { puestosLaborales.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		puestosLaboralesClp clone = new puestosLaboralesClp();

		clone.setPL_ID(getPL_ID());
		clone.setPL_PUESTO(getPL_PUESTO());
		clone.setPL_ESTADO(getPL_ESTADO());
		clone.setPL_ACTIVO(getPL_ACTIVO());
		clone.setPL_USUARIO_CREA(getPL_USUARIO_CREA());
		clone.setPL_FECHA_CREA(getPL_FECHA_CREA());
		clone.setPL_USUARIO_MODIFICA(getPL_USUARIO_MODIFICA());
		clone.setPL_FECHA_MODIFICA(getPL_FECHA_MODIFICA());

		return clone;
	}

	@Override
	public int compareTo(puestosLaborales puestosLaborales) {
		int value = 0;

		if (getPL_ID() < puestosLaborales.getPL_ID()) {
			value = -1;
		}
		else if (getPL_ID() > puestosLaborales.getPL_ID()) {
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

		if (!(obj instanceof puestosLaboralesClp)) {
			return false;
		}

		puestosLaboralesClp puestosLaborales = (puestosLaboralesClp)obj;

		long primaryKey = puestosLaborales.getPrimaryKey();

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

		sb.append("{PL_ID=");
		sb.append(getPL_ID());
		sb.append(", PL_PUESTO=");
		sb.append(getPL_PUESTO());
		sb.append(", PL_ESTADO=");
		sb.append(getPL_ESTADO());
		sb.append(", PL_ACTIVO=");
		sb.append(getPL_ACTIVO());
		sb.append(", PL_USUARIO_CREA=");
		sb.append(getPL_USUARIO_CREA());
		sb.append(", PL_FECHA_CREA=");
		sb.append(getPL_FECHA_CREA());
		sb.append(", PL_USUARIO_MODIFICA=");
		sb.append(getPL_USUARIO_MODIFICA());
		sb.append(", PL_FECHA_MODIFICA=");
		sb.append(getPL_FECHA_MODIFICA());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.puestosLaborales");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PL_ID</column-name><column-value><![CDATA[");
		sb.append(getPL_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PL_PUESTO</column-name><column-value><![CDATA[");
		sb.append(getPL_PUESTO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PL_ESTADO</column-name><column-value><![CDATA[");
		sb.append(getPL_ESTADO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PL_ACTIVO</column-name><column-value><![CDATA[");
		sb.append(getPL_ACTIVO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PL_USUARIO_CREA</column-name><column-value><![CDATA[");
		sb.append(getPL_USUARIO_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PL_FECHA_CREA</column-name><column-value><![CDATA[");
		sb.append(getPL_FECHA_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PL_USUARIO_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getPL_USUARIO_MODIFICA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PL_FECHA_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getPL_FECHA_MODIFICA());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _PL_ID;
	private String _PL_PUESTO;
	private String _PL_ESTADO;
	private String _PL_ACTIVO;
	private long _PL_USUARIO_CREA;
	private Date _PL_FECHA_CREA;
	private long _PL_USUARIO_MODIFICA;
	private Date _PL_FECHA_MODIFICA;
	private BaseModel<?> _puestosLaboralesRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
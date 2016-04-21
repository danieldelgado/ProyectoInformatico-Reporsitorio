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
import com.rec.hitss.layer.service.ParametroLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class ParametroClp extends BaseModelImpl<Parametro> implements Parametro {
	public ParametroClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Parametro.class;
	}

	@Override
	public String getModelClassName() {
		return Parametro.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _parametroId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setParametroId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _parametroId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("parametroId", getParametroId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("llave", getLlave());
		attributes.put("valor", getValor());
		attributes.put("parametroPadreId", getParametroPadreId());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long parametroId = (Long)attributes.get("parametroId");

		if (parametroId != null) {
			setParametroId(parametroId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String llave = (String)attributes.get("llave");

		if (llave != null) {
			setLlave(llave);
		}

		String valor = (String)attributes.get("valor");

		if (valor != null) {
			setValor(valor);
		}

		Long parametroPadreId = (Long)attributes.get("parametroPadreId");

		if (parametroPadreId != null) {
			setParametroPadreId(parametroPadreId);
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
	public long getParametroId() {
		return _parametroId;
	}

	@Override
	public void setParametroId(long parametroId) {
		_parametroId = parametroId;

		if (_parametroRemoteModel != null) {
			try {
				Class<?> clazz = _parametroRemoteModel.getClass();

				Method method = clazz.getMethod("setParametroId", long.class);

				method.invoke(_parametroRemoteModel, parametroId);
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

		if (_parametroRemoteModel != null) {
			try {
				Class<?> clazz = _parametroRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_parametroRemoteModel, descripcion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLlave() {
		return _llave;
	}

	@Override
	public void setLlave(String llave) {
		_llave = llave;

		if (_parametroRemoteModel != null) {
			try {
				Class<?> clazz = _parametroRemoteModel.getClass();

				Method method = clazz.getMethod("setLlave", String.class);

				method.invoke(_parametroRemoteModel, llave);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getValor() {
		return _valor;
	}

	@Override
	public void setValor(String valor) {
		_valor = valor;

		if (_parametroRemoteModel != null) {
			try {
				Class<?> clazz = _parametroRemoteModel.getClass();

				Method method = clazz.getMethod("setValor", String.class);

				method.invoke(_parametroRemoteModel, valor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getParametroPadreId() {
		return _parametroPadreId;
	}

	@Override
	public void setParametroPadreId(long parametroPadreId) {
		_parametroPadreId = parametroPadreId;

		if (_parametroRemoteModel != null) {
			try {
				Class<?> clazz = _parametroRemoteModel.getClass();

				Method method = clazz.getMethod("setParametroPadreId",
						long.class);

				method.invoke(_parametroRemoteModel, parametroPadreId);
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

		if (_parametroRemoteModel != null) {
			try {
				Class<?> clazz = _parametroRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_parametroRemoteModel, activo);
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

		if (_parametroRemoteModel != null) {
			try {
				Class<?> clazz = _parametroRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_parametroRemoteModel, usuariocrea);
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

		if (_parametroRemoteModel != null) {
			try {
				Class<?> clazz = _parametroRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_parametroRemoteModel, fechacrea);
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

		if (_parametroRemoteModel != null) {
			try {
				Class<?> clazz = _parametroRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_parametroRemoteModel, usuariomodifica);
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

		if (_parametroRemoteModel != null) {
			try {
				Class<?> clazz = _parametroRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_parametroRemoteModel, fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getParametroRemoteModel() {
		return _parametroRemoteModel;
	}

	public void setParametroRemoteModel(BaseModel<?> parametroRemoteModel) {
		_parametroRemoteModel = parametroRemoteModel;
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

		Class<?> remoteModelClass = _parametroRemoteModel.getClass();

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

		Object returnValue = method.invoke(_parametroRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ParametroLocalServiceUtil.addParametro(this);
		}
		else {
			ParametroLocalServiceUtil.updateParametro(this);
		}
	}

	@Override
	public Parametro toEscapedModel() {
		return (Parametro)ProxyUtil.newProxyInstance(Parametro.class.getClassLoader(),
			new Class[] { Parametro.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ParametroClp clone = new ParametroClp();

		clone.setParametroId(getParametroId());
		clone.setDescripcion(getDescripcion());
		clone.setLlave(getLlave());
		clone.setValor(getValor());
		clone.setParametroPadreId(getParametroPadreId());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(Parametro parametro) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(), parametro.getFechacrea());

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

		if (!(obj instanceof ParametroClp)) {
			return false;
		}

		ParametroClp parametro = (ParametroClp)obj;

		long primaryKey = parametro.getPrimaryKey();

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

		sb.append("{parametroId=");
		sb.append(getParametroId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", llave=");
		sb.append(getLlave());
		sb.append(", valor=");
		sb.append(getValor());
		sb.append(", parametroPadreId=");
		sb.append(getParametroPadreId());
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
		sb.append("com.rec.hitss.layer.model.Parametro");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>parametroId</column-name><column-value><![CDATA[");
		sb.append(getParametroId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>llave</column-name><column-value><![CDATA[");
		sb.append(getLlave());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>valor</column-name><column-value><![CDATA[");
		sb.append(getValor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parametroPadreId</column-name><column-value><![CDATA[");
		sb.append(getParametroPadreId());
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

	private long _parametroId;
	private String _descripcion;
	private String _llave;
	private String _valor;
	private long _parametroPadreId;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _parametroRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
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
import com.rec.hitss.layer.service.FuncionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class FuncionClp extends BaseModelImpl<Funcion> implements Funcion {
	public FuncionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Funcion.class;
	}

	@Override
	public String getModelClassName() {
		return Funcion.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _funcionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFuncionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _funcionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("funcionId", getFuncionId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("exigible", getExigible());
		attributes.put("etiquetaId", getEtiquetaId());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long funcionId = (Long)attributes.get("funcionId");

		if (funcionId != null) {
			setFuncionId(funcionId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Boolean exigible = (Boolean)attributes.get("exigible");

		if (exigible != null) {
			setExigible(exigible);
		}

		Long etiquetaId = (Long)attributes.get("etiquetaId");

		if (etiquetaId != null) {
			setEtiquetaId(etiquetaId);
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
	public long getFuncionId() {
		return _funcionId;
	}

	@Override
	public void setFuncionId(long funcionId) {
		_funcionId = funcionId;

		if (_funcionRemoteModel != null) {
			try {
				Class<?> clazz = _funcionRemoteModel.getClass();

				Method method = clazz.getMethod("setFuncionId", long.class);

				method.invoke(_funcionRemoteModel, funcionId);
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

		if (_funcionRemoteModel != null) {
			try {
				Class<?> clazz = _funcionRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_funcionRemoteModel, descripcion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getExigible() {
		return _exigible;
	}

	@Override
	public boolean isExigible() {
		return _exigible;
	}

	@Override
	public void setExigible(boolean exigible) {
		_exigible = exigible;

		if (_funcionRemoteModel != null) {
			try {
				Class<?> clazz = _funcionRemoteModel.getClass();

				Method method = clazz.getMethod("setExigible", boolean.class);

				method.invoke(_funcionRemoteModel, exigible);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEtiquetaId() {
		return _etiquetaId;
	}

	@Override
	public void setEtiquetaId(long etiquetaId) {
		_etiquetaId = etiquetaId;

		if (_funcionRemoteModel != null) {
			try {
				Class<?> clazz = _funcionRemoteModel.getClass();

				Method method = clazz.getMethod("setEtiquetaId", long.class);

				method.invoke(_funcionRemoteModel, etiquetaId);
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

		if (_funcionRemoteModel != null) {
			try {
				Class<?> clazz = _funcionRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_funcionRemoteModel, activo);
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

		if (_funcionRemoteModel != null) {
			try {
				Class<?> clazz = _funcionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_funcionRemoteModel, usuariocrea);
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

		if (_funcionRemoteModel != null) {
			try {
				Class<?> clazz = _funcionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_funcionRemoteModel, fechacrea);
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

		if (_funcionRemoteModel != null) {
			try {
				Class<?> clazz = _funcionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_funcionRemoteModel, usuariomodifica);
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

		if (_funcionRemoteModel != null) {
			try {
				Class<?> clazz = _funcionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_funcionRemoteModel, fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFuncionRemoteModel() {
		return _funcionRemoteModel;
	}

	public void setFuncionRemoteModel(BaseModel<?> funcionRemoteModel) {
		_funcionRemoteModel = funcionRemoteModel;
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

		Class<?> remoteModelClass = _funcionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_funcionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FuncionLocalServiceUtil.addFuncion(this);
		}
		else {
			FuncionLocalServiceUtil.updateFuncion(this);
		}
	}

	@Override
	public Funcion toEscapedModel() {
		return (Funcion)ProxyUtil.newProxyInstance(Funcion.class.getClassLoader(),
			new Class[] { Funcion.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FuncionClp clone = new FuncionClp();

		clone.setFuncionId(getFuncionId());
		clone.setDescripcion(getDescripcion());
		clone.setExigible(getExigible());
		clone.setEtiquetaId(getEtiquetaId());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(Funcion funcion) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(), funcion.getFechacrea());

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

		if (!(obj instanceof FuncionClp)) {
			return false;
		}

		FuncionClp funcion = (FuncionClp)obj;

		long primaryKey = funcion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{funcionId=");
		sb.append(getFuncionId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", exigible=");
		sb.append(getExigible());
		sb.append(", etiquetaId=");
		sb.append(getEtiquetaId());
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
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.Funcion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>funcionId</column-name><column-value><![CDATA[");
		sb.append(getFuncionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exigible</column-name><column-value><![CDATA[");
		sb.append(getExigible());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>etiquetaId</column-name><column-value><![CDATA[");
		sb.append(getEtiquetaId());
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

	private long _funcionId;
	private String _descripcion;
	private boolean _exigible;
	private long _etiquetaId;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _funcionRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
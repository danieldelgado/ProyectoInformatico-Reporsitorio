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

package com.hitss.layer.model;

import com.hitss.layer.service.ClpSerializer;
import com.hitss.layer.service.ParametroLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Danielle Delgado
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
		attributes.put("parametroIdpadre", getParametroIdpadre());
		attributes.put("codigo", getCodigo());
		attributes.put("descripcion", getDescripcion());
		attributes.put("valor", getValor());
		attributes.put("tipodato", getTipodato());
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

		Long parametroIdpadre = (Long)attributes.get("parametroIdpadre");

		if (parametroIdpadre != null) {
			setParametroIdpadre(parametroIdpadre);
		}

		String codigo = (String)attributes.get("codigo");

		if (codigo != null) {
			setCodigo(codigo);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String valor = (String)attributes.get("valor");

		if (valor != null) {
			setValor(valor);
		}

		String tipodato = (String)attributes.get("tipodato");

		if (tipodato != null) {
			setTipodato(tipodato);
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
	public long getParametroIdpadre() {
		return _parametroIdpadre;
	}

	@Override
	public void setParametroIdpadre(long parametroIdpadre) {
		_parametroIdpadre = parametroIdpadre;

		if (_parametroRemoteModel != null) {
			try {
				Class<?> clazz = _parametroRemoteModel.getClass();

				Method method = clazz.getMethod("setParametroIdpadre",
						long.class);

				method.invoke(_parametroRemoteModel, parametroIdpadre);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCodigo() {
		return _codigo;
	}

	@Override
	public void setCodigo(String codigo) {
		_codigo = codigo;

		if (_parametroRemoteModel != null) {
			try {
				Class<?> clazz = _parametroRemoteModel.getClass();

				Method method = clazz.getMethod("setCodigo", String.class);

				method.invoke(_parametroRemoteModel, codigo);
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
	public String getTipodato() {
		return _tipodato;
	}

	@Override
	public void setTipodato(String tipodato) {
		_tipodato = tipodato;

		if (_parametroRemoteModel != null) {
			try {
				Class<?> clazz = _parametroRemoteModel.getClass();

				Method method = clazz.getMethod("setTipodato", String.class);

				method.invoke(_parametroRemoteModel, tipodato);
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
		clone.setParametroIdpadre(getParametroIdpadre());
		clone.setCodigo(getCodigo());
		clone.setDescripcion(getDescripcion());
		clone.setValor(getValor());
		clone.setTipodato(getTipodato());
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

		if (getParametroId() < parametro.getParametroId()) {
			value = -1;
		}
		else if (getParametroId() > parametro.getParametroId()) {
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
		StringBundler sb = new StringBundler(23);

		sb.append("{parametroId=");
		sb.append(getParametroId());
		sb.append(", parametroIdpadre=");
		sb.append(getParametroIdpadre());
		sb.append(", codigo=");
		sb.append(getCodigo());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", valor=");
		sb.append(getValor());
		sb.append(", tipodato=");
		sb.append(getTipodato());
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
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.Parametro");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>parametroId</column-name><column-value><![CDATA[");
		sb.append(getParametroId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parametroIdpadre</column-name><column-value><![CDATA[");
		sb.append(getParametroIdpadre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>codigo</column-name><column-value><![CDATA[");
		sb.append(getCodigo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>valor</column-name><column-value><![CDATA[");
		sb.append(getValor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipodato</column-name><column-value><![CDATA[");
		sb.append(getTipodato());
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
	private long _parametroIdpadre;
	private String _codigo;
	private String _descripcion;
	private String _valor;
	private String _tipodato;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _parametroRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
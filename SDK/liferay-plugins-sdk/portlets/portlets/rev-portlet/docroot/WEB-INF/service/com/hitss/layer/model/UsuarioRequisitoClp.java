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
import com.hitss.layer.service.UsuarioRequisitoLocalServiceUtil;
import com.hitss.layer.service.persistence.UsuarioRequisitoPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Danielle Delgado
 */
public class UsuarioRequisitoClp extends BaseModelImpl<UsuarioRequisito>
	implements UsuarioRequisito {
	public UsuarioRequisitoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return UsuarioRequisito.class;
	}

	@Override
	public String getModelClassName() {
		return UsuarioRequisito.class.getName();
	}

	@Override
	public UsuarioRequisitoPK getPrimaryKey() {
		return new UsuarioRequisitoPK(_userId, _tagId);
	}

	@Override
	public void setPrimaryKey(UsuarioRequisitoPK primaryKey) {
		setUserId(primaryKey.userId);
		setTagId(primaryKey.tagId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new UsuarioRequisitoPK(_userId, _tagId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((UsuarioRequisitoPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
		attributes.put("tagId", getTagId());
		attributes.put("nivel", getNivel());
		attributes.put("exigible", getExigible());
		attributes.put("tipoRequisito", getTipoRequisito());
		attributes.put("herramienta", getHerramienta());
		attributes.put("cumplerequisito", getCumplerequisito());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long tagId = (Long)attributes.get("tagId");

		if (tagId != null) {
			setTagId(tagId);
		}

		Long nivel = (Long)attributes.get("nivel");

		if (nivel != null) {
			setNivel(nivel);
		}

		Boolean exigible = (Boolean)attributes.get("exigible");

		if (exigible != null) {
			setExigible(exigible);
		}

		Long tipoRequisito = (Long)attributes.get("tipoRequisito");

		if (tipoRequisito != null) {
			setTipoRequisito(tipoRequisito);
		}

		Long herramienta = (Long)attributes.get("herramienta");

		if (herramienta != null) {
			setHerramienta(herramienta);
		}

		Boolean cumplerequisito = (Boolean)attributes.get("cumplerequisito");

		if (cumplerequisito != null) {
			setCumplerequisito(cumplerequisito);
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
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_usuarioRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_usuarioRequisitoRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getTagId() {
		return _tagId;
	}

	@Override
	public void setTagId(long tagId) {
		_tagId = tagId;

		if (_usuarioRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setTagId", long.class);

				method.invoke(_usuarioRequisitoRemoteModel, tagId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNivel() {
		return _nivel;
	}

	@Override
	public void setNivel(long nivel) {
		_nivel = nivel;

		if (_usuarioRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setNivel", long.class);

				method.invoke(_usuarioRequisitoRemoteModel, nivel);
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

		if (_usuarioRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setExigible", boolean.class);

				method.invoke(_usuarioRequisitoRemoteModel, exigible);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTipoRequisito() {
		return _tipoRequisito;
	}

	@Override
	public void setTipoRequisito(long tipoRequisito) {
		_tipoRequisito = tipoRequisito;

		if (_usuarioRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setTipoRequisito", long.class);

				method.invoke(_usuarioRequisitoRemoteModel, tipoRequisito);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHerramienta() {
		return _herramienta;
	}

	@Override
	public void setHerramienta(long herramienta) {
		_herramienta = herramienta;

		if (_usuarioRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setHerramienta", long.class);

				method.invoke(_usuarioRequisitoRemoteModel, herramienta);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getCumplerequisito() {
		return _cumplerequisito;
	}

	@Override
	public boolean isCumplerequisito() {
		return _cumplerequisito;
	}

	@Override
	public void setCumplerequisito(boolean cumplerequisito) {
		_cumplerequisito = cumplerequisito;

		if (_usuarioRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setCumplerequisito",
						boolean.class);

				method.invoke(_usuarioRequisitoRemoteModel, cumplerequisito);
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

		if (_usuarioRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_usuarioRequisitoRemoteModel, activo);
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

		if (_usuarioRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_usuarioRequisitoRemoteModel, usuariocrea);
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

		if (_usuarioRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_usuarioRequisitoRemoteModel, fechacrea);
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

		if (_usuarioRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_usuarioRequisitoRemoteModel, usuariomodifica);
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

		if (_usuarioRequisitoRemoteModel != null) {
			try {
				Class<?> clazz = _usuarioRequisitoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_usuarioRequisitoRemoteModel, fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getUsuarioRequisitoRemoteModel() {
		return _usuarioRequisitoRemoteModel;
	}

	public void setUsuarioRequisitoRemoteModel(
		BaseModel<?> usuarioRequisitoRemoteModel) {
		_usuarioRequisitoRemoteModel = usuarioRequisitoRemoteModel;
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

		Class<?> remoteModelClass = _usuarioRequisitoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_usuarioRequisitoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UsuarioRequisitoLocalServiceUtil.addUsuarioRequisito(this);
		}
		else {
			UsuarioRequisitoLocalServiceUtil.updateUsuarioRequisito(this);
		}
	}

	@Override
	public UsuarioRequisito toEscapedModel() {
		return (UsuarioRequisito)ProxyUtil.newProxyInstance(UsuarioRequisito.class.getClassLoader(),
			new Class[] { UsuarioRequisito.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UsuarioRequisitoClp clone = new UsuarioRequisitoClp();

		clone.setUserId(getUserId());
		clone.setTagId(getTagId());
		clone.setNivel(getNivel());
		clone.setExigible(getExigible());
		clone.setTipoRequisito(getTipoRequisito());
		clone.setHerramienta(getHerramienta());
		clone.setCumplerequisito(getCumplerequisito());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(UsuarioRequisito usuarioRequisito) {
		int value = 0;

		value = DateUtil.compareTo(getFechacreamodifica(),
				usuarioRequisito.getFechacreamodifica());

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

		if (!(obj instanceof UsuarioRequisitoClp)) {
			return false;
		}

		UsuarioRequisitoClp usuarioRequisito = (UsuarioRequisitoClp)obj;

		UsuarioRequisitoPK primaryKey = usuarioRequisito.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
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
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{userId=");
		sb.append(getUserId());
		sb.append(", tagId=");
		sb.append(getTagId());
		sb.append(", nivel=");
		sb.append(getNivel());
		sb.append(", exigible=");
		sb.append(getExigible());
		sb.append(", tipoRequisito=");
		sb.append(getTipoRequisito());
		sb.append(", herramienta=");
		sb.append(getHerramienta());
		sb.append(", cumplerequisito=");
		sb.append(getCumplerequisito());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.UsuarioRequisito");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tagId</column-name><column-value><![CDATA[");
		sb.append(getTagId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nivel</column-name><column-value><![CDATA[");
		sb.append(getNivel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exigible</column-name><column-value><![CDATA[");
		sb.append(getExigible());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipoRequisito</column-name><column-value><![CDATA[");
		sb.append(getTipoRequisito());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>herramienta</column-name><column-value><![CDATA[");
		sb.append(getHerramienta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cumplerequisito</column-name><column-value><![CDATA[");
		sb.append(getCumplerequisito());
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

	private long _userId;
	private String _userUuid;
	private long _tagId;
	private long _nivel;
	private boolean _exigible;
	private long _tipoRequisito;
	private long _herramienta;
	private boolean _cumplerequisito;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _usuarioRequisitoRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
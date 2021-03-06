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
import com.hitss.layer.service.InformeRetroalimentacionLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
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
public class InformeRetroalimentacionClp extends BaseModelImpl<InformeRetroalimentacion>
	implements InformeRetroalimentacion {
	public InformeRetroalimentacionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return InformeRetroalimentacion.class;
	}

	@Override
	public String getModelClassName() {
		return InformeRetroalimentacion.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _informeRetroalimentacionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setInformeRetroalimentacionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _informeRetroalimentacionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("informeRetroalimentacionId",
			getInformeRetroalimentacionId());
		attributes.put("regisitrarActividadPlanUsuariocoId",
			getRegisitrarActividadPlanUsuariocoId());
		attributes.put("usuario", getUsuario());
		attributes.put("descripcion", getDescripcion());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long informeRetroalimentacionId = (Long)attributes.get(
				"informeRetroalimentacionId");

		if (informeRetroalimentacionId != null) {
			setInformeRetroalimentacionId(informeRetroalimentacionId);
		}

		Long regisitrarActividadPlanUsuariocoId = (Long)attributes.get(
				"regisitrarActividadPlanUsuariocoId");

		if (regisitrarActividadPlanUsuariocoId != null) {
			setRegisitrarActividadPlanUsuariocoId(regisitrarActividadPlanUsuariocoId);
		}

		Long usuario = (Long)attributes.get("usuario");

		if (usuario != null) {
			setUsuario(usuario);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
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

		Date fechamodifica = (Date)attributes.get("fechamodifica");

		if (fechamodifica != null) {
			setFechamodifica(fechamodifica);
		}
	}

	@Override
	public long getInformeRetroalimentacionId() {
		return _informeRetroalimentacionId;
	}

	@Override
	public void setInformeRetroalimentacionId(long informeRetroalimentacionId) {
		_informeRetroalimentacionId = informeRetroalimentacionId;

		if (_informeRetroalimentacionRemoteModel != null) {
			try {
				Class<?> clazz = _informeRetroalimentacionRemoteModel.getClass();

				Method method = clazz.getMethod("setInformeRetroalimentacionId",
						long.class);

				method.invoke(_informeRetroalimentacionRemoteModel,
					informeRetroalimentacionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRegisitrarActividadPlanUsuariocoId() {
		return _regisitrarActividadPlanUsuariocoId;
	}

	@Override
	public void setRegisitrarActividadPlanUsuariocoId(
		long regisitrarActividadPlanUsuariocoId) {
		_regisitrarActividadPlanUsuariocoId = regisitrarActividadPlanUsuariocoId;

		if (_informeRetroalimentacionRemoteModel != null) {
			try {
				Class<?> clazz = _informeRetroalimentacionRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisitrarActividadPlanUsuariocoId",
						long.class);

				method.invoke(_informeRetroalimentacionRemoteModel,
					regisitrarActividadPlanUsuariocoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUsuario() {
		return _usuario;
	}

	@Override
	public void setUsuario(long usuario) {
		_usuario = usuario;

		if (_informeRetroalimentacionRemoteModel != null) {
			try {
				Class<?> clazz = _informeRetroalimentacionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuario", long.class);

				method.invoke(_informeRetroalimentacionRemoteModel, usuario);
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

		if (_informeRetroalimentacionRemoteModel != null) {
			try {
				Class<?> clazz = _informeRetroalimentacionRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_informeRetroalimentacionRemoteModel, descripcion);
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

		if (_informeRetroalimentacionRemoteModel != null) {
			try {
				Class<?> clazz = _informeRetroalimentacionRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_informeRetroalimentacionRemoteModel, activo);
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

		if (_informeRetroalimentacionRemoteModel != null) {
			try {
				Class<?> clazz = _informeRetroalimentacionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_informeRetroalimentacionRemoteModel, usuariocrea);
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

		if (_informeRetroalimentacionRemoteModel != null) {
			try {
				Class<?> clazz = _informeRetroalimentacionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_informeRetroalimentacionRemoteModel, fechacrea);
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

		if (_informeRetroalimentacionRemoteModel != null) {
			try {
				Class<?> clazz = _informeRetroalimentacionRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_informeRetroalimentacionRemoteModel,
					usuariomodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechamodifica() {
		return _fechamodifica;
	}

	@Override
	public void setFechamodifica(Date fechamodifica) {
		_fechamodifica = fechamodifica;

		if (_informeRetroalimentacionRemoteModel != null) {
			try {
				Class<?> clazz = _informeRetroalimentacionRemoteModel.getClass();

				Method method = clazz.getMethod("setFechamodifica", Date.class);

				method.invoke(_informeRetroalimentacionRemoteModel,
					fechamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getInformeRetroalimentacionRemoteModel() {
		return _informeRetroalimentacionRemoteModel;
	}

	public void setInformeRetroalimentacionRemoteModel(
		BaseModel<?> informeRetroalimentacionRemoteModel) {
		_informeRetroalimentacionRemoteModel = informeRetroalimentacionRemoteModel;
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

		Class<?> remoteModelClass = _informeRetroalimentacionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_informeRetroalimentacionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			InformeRetroalimentacionLocalServiceUtil.addInformeRetroalimentacion(this);
		}
		else {
			InformeRetroalimentacionLocalServiceUtil.updateInformeRetroalimentacion(this);
		}
	}

	@Override
	public InformeRetroalimentacion toEscapedModel() {
		return (InformeRetroalimentacion)ProxyUtil.newProxyInstance(InformeRetroalimentacion.class.getClassLoader(),
			new Class[] { InformeRetroalimentacion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		InformeRetroalimentacionClp clone = new InformeRetroalimentacionClp();

		clone.setInformeRetroalimentacionId(getInformeRetroalimentacionId());
		clone.setRegisitrarActividadPlanUsuariocoId(getRegisitrarActividadPlanUsuariocoId());
		clone.setUsuario(getUsuario());
		clone.setDescripcion(getDescripcion());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechamodifica(getFechamodifica());

		return clone;
	}

	@Override
	public int compareTo(InformeRetroalimentacion informeRetroalimentacion) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				informeRetroalimentacion.getFechamodifica());

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

		if (!(obj instanceof InformeRetroalimentacionClp)) {
			return false;
		}

		InformeRetroalimentacionClp informeRetroalimentacion = (InformeRetroalimentacionClp)obj;

		long primaryKey = informeRetroalimentacion.getPrimaryKey();

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

		sb.append("{informeRetroalimentacionId=");
		sb.append(getInformeRetroalimentacionId());
		sb.append(", regisitrarActividadPlanUsuariocoId=");
		sb.append(getRegisitrarActividadPlanUsuariocoId());
		sb.append(", usuario=");
		sb.append(getUsuario());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", activo=");
		sb.append(getActivo());
		sb.append(", usuariocrea=");
		sb.append(getUsuariocrea());
		sb.append(", fechacrea=");
		sb.append(getFechacrea());
		sb.append(", usuariomodifica=");
		sb.append(getUsuariomodifica());
		sb.append(", fechamodifica=");
		sb.append(getFechamodifica());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.InformeRetroalimentacion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>informeRetroalimentacionId</column-name><column-value><![CDATA[");
		sb.append(getInformeRetroalimentacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>regisitrarActividadPlanUsuariocoId</column-name><column-value><![CDATA[");
		sb.append(getRegisitrarActividadPlanUsuariocoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuario</column-name><column-value><![CDATA[");
		sb.append(getUsuario());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
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
			"<column><column-name>fechamodifica</column-name><column-value><![CDATA[");
		sb.append(getFechamodifica());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _informeRetroalimentacionId;
	private long _regisitrarActividadPlanUsuariocoId;
	private long _usuario;
	private String _descripcion;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private BaseModel<?> _informeRetroalimentacionRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
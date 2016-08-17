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
import com.hitss.layer.service.PrioridadGrupoUsuariosLocalServiceUtil;

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
public class PrioridadGrupoUsuariosClp extends BaseModelImpl<PrioridadGrupoUsuarios>
	implements PrioridadGrupoUsuarios {
	public PrioridadGrupoUsuariosClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PrioridadGrupoUsuarios.class;
	}

	@Override
	public String getModelClassName() {
		return PrioridadGrupoUsuarios.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _prioridadGrupoUsuariosId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPrioridadGrupoUsuariosId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _prioridadGrupoUsuariosId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("prioridadGrupoUsuariosId", getPrioridadGrupoUsuariosId());
		attributes.put("solicitudEvaluacionDesempennoId",
			getSolicitudEvaluacionDesempennoId());
		attributes.put("responsableGrupo", getResponsableGrupo());
		attributes.put("grupoUsuario", getGrupoUsuario());
		attributes.put("orden", getOrden());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long prioridadGrupoUsuariosId = (Long)attributes.get(
				"prioridadGrupoUsuariosId");

		if (prioridadGrupoUsuariosId != null) {
			setPrioridadGrupoUsuariosId(prioridadGrupoUsuariosId);
		}

		Long solicitudEvaluacionDesempennoId = (Long)attributes.get(
				"solicitudEvaluacionDesempennoId");

		if (solicitudEvaluacionDesempennoId != null) {
			setSolicitudEvaluacionDesempennoId(solicitudEvaluacionDesempennoId);
		}

		String responsableGrupo = (String)attributes.get("responsableGrupo");

		if (responsableGrupo != null) {
			setResponsableGrupo(responsableGrupo);
		}

		String grupoUsuario = (String)attributes.get("grupoUsuario");

		if (grupoUsuario != null) {
			setGrupoUsuario(grupoUsuario);
		}

		Integer orden = (Integer)attributes.get("orden");

		if (orden != null) {
			setOrden(orden);
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
	public long getPrioridadGrupoUsuariosId() {
		return _prioridadGrupoUsuariosId;
	}

	@Override
	public void setPrioridadGrupoUsuariosId(long prioridadGrupoUsuariosId) {
		_prioridadGrupoUsuariosId = prioridadGrupoUsuariosId;

		if (_prioridadGrupoUsuariosRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadGrupoUsuariosRemoteModel.getClass();

				Method method = clazz.getMethod("setPrioridadGrupoUsuariosId",
						long.class);

				method.invoke(_prioridadGrupoUsuariosRemoteModel,
					prioridadGrupoUsuariosId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSolicitudEvaluacionDesempennoId() {
		return _solicitudEvaluacionDesempennoId;
	}

	@Override
	public void setSolicitudEvaluacionDesempennoId(
		long solicitudEvaluacionDesempennoId) {
		_solicitudEvaluacionDesempennoId = solicitudEvaluacionDesempennoId;

		if (_prioridadGrupoUsuariosRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadGrupoUsuariosRemoteModel.getClass();

				Method method = clazz.getMethod("setSolicitudEvaluacionDesempennoId",
						long.class);

				method.invoke(_prioridadGrupoUsuariosRemoteModel,
					solicitudEvaluacionDesempennoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResponsableGrupo() {
		return _responsableGrupo;
	}

	@Override
	public void setResponsableGrupo(String responsableGrupo) {
		_responsableGrupo = responsableGrupo;

		if (_prioridadGrupoUsuariosRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadGrupoUsuariosRemoteModel.getClass();

				Method method = clazz.getMethod("setResponsableGrupo",
						String.class);

				method.invoke(_prioridadGrupoUsuariosRemoteModel,
					responsableGrupo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGrupoUsuario() {
		return _grupoUsuario;
	}

	@Override
	public void setGrupoUsuario(String grupoUsuario) {
		_grupoUsuario = grupoUsuario;

		if (_prioridadGrupoUsuariosRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadGrupoUsuariosRemoteModel.getClass();

				Method method = clazz.getMethod("setGrupoUsuario", String.class);

				method.invoke(_prioridadGrupoUsuariosRemoteModel, grupoUsuario);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getOrden() {
		return _orden;
	}

	@Override
	public void setOrden(int orden) {
		_orden = orden;

		if (_prioridadGrupoUsuariosRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadGrupoUsuariosRemoteModel.getClass();

				Method method = clazz.getMethod("setOrden", int.class);

				method.invoke(_prioridadGrupoUsuariosRemoteModel, orden);
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

		if (_prioridadGrupoUsuariosRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadGrupoUsuariosRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_prioridadGrupoUsuariosRemoteModel, activo);
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

		if (_prioridadGrupoUsuariosRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadGrupoUsuariosRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_prioridadGrupoUsuariosRemoteModel, usuariocrea);
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

		if (_prioridadGrupoUsuariosRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadGrupoUsuariosRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_prioridadGrupoUsuariosRemoteModel, fechacrea);
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

		if (_prioridadGrupoUsuariosRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadGrupoUsuariosRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_prioridadGrupoUsuariosRemoteModel,
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

		if (_prioridadGrupoUsuariosRemoteModel != null) {
			try {
				Class<?> clazz = _prioridadGrupoUsuariosRemoteModel.getClass();

				Method method = clazz.getMethod("setFechamodifica", Date.class);

				method.invoke(_prioridadGrupoUsuariosRemoteModel, fechamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPrioridadGrupoUsuariosRemoteModel() {
		return _prioridadGrupoUsuariosRemoteModel;
	}

	public void setPrioridadGrupoUsuariosRemoteModel(
		BaseModel<?> prioridadGrupoUsuariosRemoteModel) {
		_prioridadGrupoUsuariosRemoteModel = prioridadGrupoUsuariosRemoteModel;
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

		Class<?> remoteModelClass = _prioridadGrupoUsuariosRemoteModel.getClass();

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

		Object returnValue = method.invoke(_prioridadGrupoUsuariosRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PrioridadGrupoUsuariosLocalServiceUtil.addPrioridadGrupoUsuarios(this);
		}
		else {
			PrioridadGrupoUsuariosLocalServiceUtil.updatePrioridadGrupoUsuarios(this);
		}
	}

	@Override
	public PrioridadGrupoUsuarios toEscapedModel() {
		return (PrioridadGrupoUsuarios)ProxyUtil.newProxyInstance(PrioridadGrupoUsuarios.class.getClassLoader(),
			new Class[] { PrioridadGrupoUsuarios.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PrioridadGrupoUsuariosClp clone = new PrioridadGrupoUsuariosClp();

		clone.setPrioridadGrupoUsuariosId(getPrioridadGrupoUsuariosId());
		clone.setSolicitudEvaluacionDesempennoId(getSolicitudEvaluacionDesempennoId());
		clone.setResponsableGrupo(getResponsableGrupo());
		clone.setGrupoUsuario(getGrupoUsuario());
		clone.setOrden(getOrden());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechamodifica(getFechamodifica());

		return clone;
	}

	@Override
	public int compareTo(PrioridadGrupoUsuarios prioridadGrupoUsuarios) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				prioridadGrupoUsuarios.getFechamodifica());

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

		if (!(obj instanceof PrioridadGrupoUsuariosClp)) {
			return false;
		}

		PrioridadGrupoUsuariosClp prioridadGrupoUsuarios = (PrioridadGrupoUsuariosClp)obj;

		long primaryKey = prioridadGrupoUsuarios.getPrimaryKey();

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

		sb.append("{prioridadGrupoUsuariosId=");
		sb.append(getPrioridadGrupoUsuariosId());
		sb.append(", solicitudEvaluacionDesempennoId=");
		sb.append(getSolicitudEvaluacionDesempennoId());
		sb.append(", responsableGrupo=");
		sb.append(getResponsableGrupo());
		sb.append(", grupoUsuario=");
		sb.append(getGrupoUsuario());
		sb.append(", orden=");
		sb.append(getOrden());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.PrioridadGrupoUsuarios");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>prioridadGrupoUsuariosId</column-name><column-value><![CDATA[");
		sb.append(getPrioridadGrupoUsuariosId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>solicitudEvaluacionDesempennoId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudEvaluacionDesempennoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responsableGrupo</column-name><column-value><![CDATA[");
		sb.append(getResponsableGrupo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grupoUsuario</column-name><column-value><![CDATA[");
		sb.append(getGrupoUsuario());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orden</column-name><column-value><![CDATA[");
		sb.append(getOrden());
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

	private long _prioridadGrupoUsuariosId;
	private long _solicitudEvaluacionDesempennoId;
	private String _responsableGrupo;
	private String _grupoUsuario;
	private int _orden;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private BaseModel<?> _prioridadGrupoUsuariosRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
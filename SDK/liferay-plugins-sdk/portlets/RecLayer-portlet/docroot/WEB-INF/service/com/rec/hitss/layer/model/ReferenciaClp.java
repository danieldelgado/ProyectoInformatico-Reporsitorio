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
import com.rec.hitss.layer.service.ReferenciaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class ReferenciaClp extends BaseModelImpl<Referencia>
	implements Referencia {
	public ReferenciaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Referencia.class;
	}

	@Override
	public String getModelClassName() {
		return Referencia.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _referenciaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setReferenciaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _referenciaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("referenciaId", getReferenciaId());
		attributes.put("empresa", getEmpresa());
		attributes.put("telefono", getTelefono());
		attributes.put("responsable", getResponsable());
		attributes.put("motivo", getMotivo());
		attributes.put("usuarioHitssId", getUsuarioHitssId());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long referenciaId = (Long)attributes.get("referenciaId");

		if (referenciaId != null) {
			setReferenciaId(referenciaId);
		}

		String empresa = (String)attributes.get("empresa");

		if (empresa != null) {
			setEmpresa(empresa);
		}

		String telefono = (String)attributes.get("telefono");

		if (telefono != null) {
			setTelefono(telefono);
		}

		String responsable = (String)attributes.get("responsable");

		if (responsable != null) {
			setResponsable(responsable);
		}

		String motivo = (String)attributes.get("motivo");

		if (motivo != null) {
			setMotivo(motivo);
		}

		Long usuarioHitssId = (Long)attributes.get("usuarioHitssId");

		if (usuarioHitssId != null) {
			setUsuarioHitssId(usuarioHitssId);
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
	public long getReferenciaId() {
		return _referenciaId;
	}

	@Override
	public void setReferenciaId(long referenciaId) {
		_referenciaId = referenciaId;

		if (_referenciaRemoteModel != null) {
			try {
				Class<?> clazz = _referenciaRemoteModel.getClass();

				Method method = clazz.getMethod("setReferenciaId", long.class);

				method.invoke(_referenciaRemoteModel, referenciaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmpresa() {
		return _empresa;
	}

	@Override
	public void setEmpresa(String empresa) {
		_empresa = empresa;

		if (_referenciaRemoteModel != null) {
			try {
				Class<?> clazz = _referenciaRemoteModel.getClass();

				Method method = clazz.getMethod("setEmpresa", String.class);

				method.invoke(_referenciaRemoteModel, empresa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTelefono() {
		return _telefono;
	}

	@Override
	public void setTelefono(String telefono) {
		_telefono = telefono;

		if (_referenciaRemoteModel != null) {
			try {
				Class<?> clazz = _referenciaRemoteModel.getClass();

				Method method = clazz.getMethod("setTelefono", String.class);

				method.invoke(_referenciaRemoteModel, telefono);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResponsable() {
		return _responsable;
	}

	@Override
	public void setResponsable(String responsable) {
		_responsable = responsable;

		if (_referenciaRemoteModel != null) {
			try {
				Class<?> clazz = _referenciaRemoteModel.getClass();

				Method method = clazz.getMethod("setResponsable", String.class);

				method.invoke(_referenciaRemoteModel, responsable);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMotivo() {
		return _motivo;
	}

	@Override
	public void setMotivo(String motivo) {
		_motivo = motivo;

		if (_referenciaRemoteModel != null) {
			try {
				Class<?> clazz = _referenciaRemoteModel.getClass();

				Method method = clazz.getMethod("setMotivo", String.class);

				method.invoke(_referenciaRemoteModel, motivo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUsuarioHitssId() {
		return _usuarioHitssId;
	}

	@Override
	public void setUsuarioHitssId(long usuarioHitssId) {
		_usuarioHitssId = usuarioHitssId;

		if (_referenciaRemoteModel != null) {
			try {
				Class<?> clazz = _referenciaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioHitssId", long.class);

				method.invoke(_referenciaRemoteModel, usuarioHitssId);
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

		if (_referenciaRemoteModel != null) {
			try {
				Class<?> clazz = _referenciaRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_referenciaRemoteModel, activo);
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

		if (_referenciaRemoteModel != null) {
			try {
				Class<?> clazz = _referenciaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_referenciaRemoteModel, usuariocrea);
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

		if (_referenciaRemoteModel != null) {
			try {
				Class<?> clazz = _referenciaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_referenciaRemoteModel, fechacrea);
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

		if (_referenciaRemoteModel != null) {
			try {
				Class<?> clazz = _referenciaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_referenciaRemoteModel, usuariomodifica);
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

		if (_referenciaRemoteModel != null) {
			try {
				Class<?> clazz = _referenciaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_referenciaRemoteModel, fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getReferenciaRemoteModel() {
		return _referenciaRemoteModel;
	}

	public void setReferenciaRemoteModel(BaseModel<?> referenciaRemoteModel) {
		_referenciaRemoteModel = referenciaRemoteModel;
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

		Class<?> remoteModelClass = _referenciaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_referenciaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ReferenciaLocalServiceUtil.addReferencia(this);
		}
		else {
			ReferenciaLocalServiceUtil.updateReferencia(this);
		}
	}

	@Override
	public Referencia toEscapedModel() {
		return (Referencia)ProxyUtil.newProxyInstance(Referencia.class.getClassLoader(),
			new Class[] { Referencia.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ReferenciaClp clone = new ReferenciaClp();

		clone.setReferenciaId(getReferenciaId());
		clone.setEmpresa(getEmpresa());
		clone.setTelefono(getTelefono());
		clone.setResponsable(getResponsable());
		clone.setMotivo(getMotivo());
		clone.setUsuarioHitssId(getUsuarioHitssId());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(Referencia referencia) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(), referencia.getFechacrea());

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

		if (!(obj instanceof ReferenciaClp)) {
			return false;
		}

		ReferenciaClp referencia = (ReferenciaClp)obj;

		long primaryKey = referencia.getPrimaryKey();

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

		sb.append("{referenciaId=");
		sb.append(getReferenciaId());
		sb.append(", empresa=");
		sb.append(getEmpresa());
		sb.append(", telefono=");
		sb.append(getTelefono());
		sb.append(", responsable=");
		sb.append(getResponsable());
		sb.append(", motivo=");
		sb.append(getMotivo());
		sb.append(", usuarioHitssId=");
		sb.append(getUsuarioHitssId());
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
		sb.append("com.rec.hitss.layer.model.Referencia");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>referenciaId</column-name><column-value><![CDATA[");
		sb.append(getReferenciaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>empresa</column-name><column-value><![CDATA[");
		sb.append(getEmpresa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telefono</column-name><column-value><![CDATA[");
		sb.append(getTelefono());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responsable</column-name><column-value><![CDATA[");
		sb.append(getResponsable());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>motivo</column-name><column-value><![CDATA[");
		sb.append(getMotivo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioHitssId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioHitssId());
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

	private long _referenciaId;
	private String _empresa;
	private String _telefono;
	private String _responsable;
	private String _motivo;
	private long _usuarioHitssId;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _referenciaRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
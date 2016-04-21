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

import com.rec.hitss.layer.service.CertificadoLocalServiceUtil;
import com.rec.hitss.layer.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class CertificadoClp extends BaseModelImpl<Certificado>
	implements Certificado {
	public CertificadoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Certificado.class;
	}

	@Override
	public String getModelClassName() {
		return Certificado.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _certificadoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCertificadoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _certificadoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("certificadoId", getCertificadoId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("empresa", getEmpresa());
		attributes.put("cargo", getCargo());
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
		Long certificadoId = (Long)attributes.get("certificadoId");

		if (certificadoId != null) {
			setCertificadoId(certificadoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String empresa = (String)attributes.get("empresa");

		if (empresa != null) {
			setEmpresa(empresa);
		}

		String cargo = (String)attributes.get("cargo");

		if (cargo != null) {
			setCargo(cargo);
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
	public long getCertificadoId() {
		return _certificadoId;
	}

	@Override
	public void setCertificadoId(long certificadoId) {
		_certificadoId = certificadoId;

		if (_certificadoRemoteModel != null) {
			try {
				Class<?> clazz = _certificadoRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificadoId", long.class);

				method.invoke(_certificadoRemoteModel, certificadoId);
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

		if (_certificadoRemoteModel != null) {
			try {
				Class<?> clazz = _certificadoRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_certificadoRemoteModel, descripcion);
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

		if (_certificadoRemoteModel != null) {
			try {
				Class<?> clazz = _certificadoRemoteModel.getClass();

				Method method = clazz.getMethod("setEmpresa", String.class);

				method.invoke(_certificadoRemoteModel, empresa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCargo() {
		return _cargo;
	}

	@Override
	public void setCargo(String cargo) {
		_cargo = cargo;

		if (_certificadoRemoteModel != null) {
			try {
				Class<?> clazz = _certificadoRemoteModel.getClass();

				Method method = clazz.getMethod("setCargo", String.class);

				method.invoke(_certificadoRemoteModel, cargo);
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

		if (_certificadoRemoteModel != null) {
			try {
				Class<?> clazz = _certificadoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioHitssId", long.class);

				method.invoke(_certificadoRemoteModel, usuarioHitssId);
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

		if (_certificadoRemoteModel != null) {
			try {
				Class<?> clazz = _certificadoRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_certificadoRemoteModel, activo);
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

		if (_certificadoRemoteModel != null) {
			try {
				Class<?> clazz = _certificadoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_certificadoRemoteModel, usuariocrea);
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

		if (_certificadoRemoteModel != null) {
			try {
				Class<?> clazz = _certificadoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_certificadoRemoteModel, fechacrea);
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

		if (_certificadoRemoteModel != null) {
			try {
				Class<?> clazz = _certificadoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_certificadoRemoteModel, usuariomodifica);
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

		if (_certificadoRemoteModel != null) {
			try {
				Class<?> clazz = _certificadoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_certificadoRemoteModel, fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCertificadoRemoteModel() {
		return _certificadoRemoteModel;
	}

	public void setCertificadoRemoteModel(BaseModel<?> certificadoRemoteModel) {
		_certificadoRemoteModel = certificadoRemoteModel;
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

		Class<?> remoteModelClass = _certificadoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_certificadoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CertificadoLocalServiceUtil.addCertificado(this);
		}
		else {
			CertificadoLocalServiceUtil.updateCertificado(this);
		}
	}

	@Override
	public Certificado toEscapedModel() {
		return (Certificado)ProxyUtil.newProxyInstance(Certificado.class.getClassLoader(),
			new Class[] { Certificado.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CertificadoClp clone = new CertificadoClp();

		clone.setCertificadoId(getCertificadoId());
		clone.setDescripcion(getDescripcion());
		clone.setEmpresa(getEmpresa());
		clone.setCargo(getCargo());
		clone.setUsuarioHitssId(getUsuarioHitssId());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(Certificado certificado) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(), certificado.getFechacrea());

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

		if (!(obj instanceof CertificadoClp)) {
			return false;
		}

		CertificadoClp certificado = (CertificadoClp)obj;

		long primaryKey = certificado.getPrimaryKey();

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

		sb.append("{certificadoId=");
		sb.append(getCertificadoId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", empresa=");
		sb.append(getEmpresa());
		sb.append(", cargo=");
		sb.append(getCargo());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.Certificado");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>certificadoId</column-name><column-value><![CDATA[");
		sb.append(getCertificadoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>empresa</column-name><column-value><![CDATA[");
		sb.append(getEmpresa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cargo</column-name><column-value><![CDATA[");
		sb.append(getCargo());
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

	private long _certificadoId;
	private String _descripcion;
	private String _empresa;
	private String _cargo;
	private long _usuarioHitssId;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _certificadoRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
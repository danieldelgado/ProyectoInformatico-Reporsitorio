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
import com.hitss.layer.service.ExperienciaLocalServiceUtil;
import com.hitss.layer.service.persistence.ExperienciaPK;

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
public class ExperienciaClp extends BaseModelImpl<Experiencia>
	implements Experiencia {
	public ExperienciaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Experiencia.class;
	}

	@Override
	public String getModelClassName() {
		return Experiencia.class.getName();
	}

	@Override
	public ExperienciaPK getPrimaryKey() {
		return new ExperienciaPK(_experienciaId, _usuarioId);
	}

	@Override
	public void setPrimaryKey(ExperienciaPK primaryKey) {
		setExperienciaId(primaryKey.experienciaId);
		setUsuarioId(primaryKey.usuarioId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new ExperienciaPK(_experienciaId, _usuarioId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((ExperienciaPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("experienciaId", getExperienciaId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("empresa", getEmpresa());
		attributes.put("tipoNegocio", getTipoNegocio());
		attributes.put("proyecto", getProyecto());
		attributes.put("fechaInicio", getFechaInicio());
		attributes.put("fechaFin", getFechaFin());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long experienciaId = (Long)attributes.get("experienciaId");

		if (experienciaId != null) {
			setExperienciaId(experienciaId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String empresa = (String)attributes.get("empresa");

		if (empresa != null) {
			setEmpresa(empresa);
		}

		Long tipoNegocio = (Long)attributes.get("tipoNegocio");

		if (tipoNegocio != null) {
			setTipoNegocio(tipoNegocio);
		}

		String proyecto = (String)attributes.get("proyecto");

		if (proyecto != null) {
			setProyecto(proyecto);
		}

		Date fechaInicio = (Date)attributes.get("fechaInicio");

		if (fechaInicio != null) {
			setFechaInicio(fechaInicio);
		}

		Date fechaFin = (Date)attributes.get("fechaFin");

		if (fechaFin != null) {
			setFechaFin(fechaFin);
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
	public long getExperienciaId() {
		return _experienciaId;
	}

	@Override
	public void setExperienciaId(long experienciaId) {
		_experienciaId = experienciaId;

		if (_experienciaRemoteModel != null) {
			try {
				Class<?> clazz = _experienciaRemoteModel.getClass();

				Method method = clazz.getMethod("setExperienciaId", long.class);

				method.invoke(_experienciaRemoteModel, experienciaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUsuarioId() {
		return _usuarioId;
	}

	@Override
	public void setUsuarioId(long usuarioId) {
		_usuarioId = usuarioId;

		if (_experienciaRemoteModel != null) {
			try {
				Class<?> clazz = _experienciaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioId", long.class);

				method.invoke(_experienciaRemoteModel, usuarioId);
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

		if (_experienciaRemoteModel != null) {
			try {
				Class<?> clazz = _experienciaRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_experienciaRemoteModel, descripcion);
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

		if (_experienciaRemoteModel != null) {
			try {
				Class<?> clazz = _experienciaRemoteModel.getClass();

				Method method = clazz.getMethod("setEmpresa", String.class);

				method.invoke(_experienciaRemoteModel, empresa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTipoNegocio() {
		return _tipoNegocio;
	}

	@Override
	public void setTipoNegocio(long tipoNegocio) {
		_tipoNegocio = tipoNegocio;

		if (_experienciaRemoteModel != null) {
			try {
				Class<?> clazz = _experienciaRemoteModel.getClass();

				Method method = clazz.getMethod("setTipoNegocio", long.class);

				method.invoke(_experienciaRemoteModel, tipoNegocio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProyecto() {
		return _proyecto;
	}

	@Override
	public void setProyecto(String proyecto) {
		_proyecto = proyecto;

		if (_experienciaRemoteModel != null) {
			try {
				Class<?> clazz = _experienciaRemoteModel.getClass();

				Method method = clazz.getMethod("setProyecto", String.class);

				method.invoke(_experienciaRemoteModel, proyecto);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaInicio() {
		return _fechaInicio;
	}

	@Override
	public void setFechaInicio(Date fechaInicio) {
		_fechaInicio = fechaInicio;

		if (_experienciaRemoteModel != null) {
			try {
				Class<?> clazz = _experienciaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaInicio", Date.class);

				method.invoke(_experienciaRemoteModel, fechaInicio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaFin() {
		return _fechaFin;
	}

	@Override
	public void setFechaFin(Date fechaFin) {
		_fechaFin = fechaFin;

		if (_experienciaRemoteModel != null) {
			try {
				Class<?> clazz = _experienciaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaFin", Date.class);

				method.invoke(_experienciaRemoteModel, fechaFin);
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

		if (_experienciaRemoteModel != null) {
			try {
				Class<?> clazz = _experienciaRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_experienciaRemoteModel, activo);
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

		if (_experienciaRemoteModel != null) {
			try {
				Class<?> clazz = _experienciaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_experienciaRemoteModel, usuariocrea);
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

		if (_experienciaRemoteModel != null) {
			try {
				Class<?> clazz = _experienciaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_experienciaRemoteModel, fechacrea);
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

		if (_experienciaRemoteModel != null) {
			try {
				Class<?> clazz = _experienciaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_experienciaRemoteModel, usuariomodifica);
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

		if (_experienciaRemoteModel != null) {
			try {
				Class<?> clazz = _experienciaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechamodifica", Date.class);

				method.invoke(_experienciaRemoteModel, fechamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getExperienciaRemoteModel() {
		return _experienciaRemoteModel;
	}

	public void setExperienciaRemoteModel(BaseModel<?> experienciaRemoteModel) {
		_experienciaRemoteModel = experienciaRemoteModel;
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

		Class<?> remoteModelClass = _experienciaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_experienciaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ExperienciaLocalServiceUtil.addExperiencia(this);
		}
		else {
			ExperienciaLocalServiceUtil.updateExperiencia(this);
		}
	}

	@Override
	public Experiencia toEscapedModel() {
		return (Experiencia)ProxyUtil.newProxyInstance(Experiencia.class.getClassLoader(),
			new Class[] { Experiencia.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ExperienciaClp clone = new ExperienciaClp();

		clone.setExperienciaId(getExperienciaId());
		clone.setUsuarioId(getUsuarioId());
		clone.setDescripcion(getDescripcion());
		clone.setEmpresa(getEmpresa());
		clone.setTipoNegocio(getTipoNegocio());
		clone.setProyecto(getProyecto());
		clone.setFechaInicio(getFechaInicio());
		clone.setFechaFin(getFechaFin());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechamodifica(getFechamodifica());

		return clone;
	}

	@Override
	public int compareTo(Experiencia experiencia) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				experiencia.getFechamodifica());

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

		if (!(obj instanceof ExperienciaClp)) {
			return false;
		}

		ExperienciaClp experiencia = (ExperienciaClp)obj;

		ExperienciaPK primaryKey = experiencia.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{experienciaId=");
		sb.append(getExperienciaId());
		sb.append(", usuarioId=");
		sb.append(getUsuarioId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", empresa=");
		sb.append(getEmpresa());
		sb.append(", tipoNegocio=");
		sb.append(getTipoNegocio());
		sb.append(", proyecto=");
		sb.append(getProyecto());
		sb.append(", fechaInicio=");
		sb.append(getFechaInicio());
		sb.append(", fechaFin=");
		sb.append(getFechaFin());
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
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.Experiencia");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>experienciaId</column-name><column-value><![CDATA[");
		sb.append(getExperienciaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioId());
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
			"<column><column-name>tipoNegocio</column-name><column-value><![CDATA[");
		sb.append(getTipoNegocio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>proyecto</column-name><column-value><![CDATA[");
		sb.append(getProyecto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaInicio</column-name><column-value><![CDATA[");
		sb.append(getFechaInicio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaFin</column-name><column-value><![CDATA[");
		sb.append(getFechaFin());
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

	private long _experienciaId;
	private long _usuarioId;
	private String _descripcion;
	private String _empresa;
	private long _tipoNegocio;
	private String _proyecto;
	private Date _fechaInicio;
	private Date _fechaFin;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private BaseModel<?> _experienciaRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
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
import com.rec.hitss.layer.service.SolicitudRequerimientoPersonalLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class SolicitudRequerimientoPersonalClp extends BaseModelImpl<SolicitudRequerimientoPersonal>
	implements SolicitudRequerimientoPersonal {
	public SolicitudRequerimientoPersonalClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return SolicitudRequerimientoPersonal.class;
	}

	@Override
	public String getModelClassName() {
		return SolicitudRequerimientoPersonal.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _solicitudRequerimientoPersonalId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSolicitudRequerimientoPersonalId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _solicitudRequerimientoPersonalId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudRequerimientoPersonalId",
			getSolicitudRequerimientoPersonalId());
		attributes.put("estado", getEstado());
		attributes.put("puesto", getPuesto());
		attributes.put("areaSolicitante", getAreaSolicitante());
		attributes.put("cantidadRecursos", getCantidadRecursos());
		attributes.put("fechaLimite", getFechaLimite());
		attributes.put("cargo", getCargo());
		attributes.put("tiempoContrato", getTiempoContrato());
		attributes.put("tipoNegocio", getTipoNegocio());
		attributes.put("presupuestoMaximo", getPresupuestoMaximo());
		attributes.put("presupuestoMinimo", getPresupuestoMinimo());
		attributes.put("cliente", getCliente());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long solicitudRequerimientoPersonalId = (Long)attributes.get(
				"solicitudRequerimientoPersonalId");

		if (solicitudRequerimientoPersonalId != null) {
			setSolicitudRequerimientoPersonalId(solicitudRequerimientoPersonalId);
		}

		String estado = (String)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		String puesto = (String)attributes.get("puesto");

		if (puesto != null) {
			setPuesto(puesto);
		}

		Long areaSolicitante = (Long)attributes.get("areaSolicitante");

		if (areaSolicitante != null) {
			setAreaSolicitante(areaSolicitante);
		}

		Long cantidadRecursos = (Long)attributes.get("cantidadRecursos");

		if (cantidadRecursos != null) {
			setCantidadRecursos(cantidadRecursos);
		}

		Date fechaLimite = (Date)attributes.get("fechaLimite");

		if (fechaLimite != null) {
			setFechaLimite(fechaLimite);
		}

		String cargo = (String)attributes.get("cargo");

		if (cargo != null) {
			setCargo(cargo);
		}

		Long tiempoContrato = (Long)attributes.get("tiempoContrato");

		if (tiempoContrato != null) {
			setTiempoContrato(tiempoContrato);
		}

		Long tipoNegocio = (Long)attributes.get("tipoNegocio");

		if (tipoNegocio != null) {
			setTipoNegocio(tipoNegocio);
		}

		Long presupuestoMaximo = (Long)attributes.get("presupuestoMaximo");

		if (presupuestoMaximo != null) {
			setPresupuestoMaximo(presupuestoMaximo);
		}

		Long presupuestoMinimo = (Long)attributes.get("presupuestoMinimo");

		if (presupuestoMinimo != null) {
			setPresupuestoMinimo(presupuestoMinimo);
		}

		Long cliente = (Long)attributes.get("cliente");

		if (cliente != null) {
			setCliente(cliente);
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
	public long getSolicitudRequerimientoPersonalId() {
		return _solicitudRequerimientoPersonalId;
	}

	@Override
	public void setSolicitudRequerimientoPersonalId(
		long solicitudRequerimientoPersonalId) {
		_solicitudRequerimientoPersonalId = solicitudRequerimientoPersonalId;

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setSolicitudRequerimientoPersonalId",
						long.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel,
					solicitudRequerimientoPersonalId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEstado() {
		return _estado;
	}

	@Override
	public void setEstado(String estado) {
		_estado = estado;

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setEstado", String.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel, estado);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPuesto() {
		return _puesto;
	}

	@Override
	public void setPuesto(String puesto) {
		_puesto = puesto;

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setPuesto", String.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel, puesto);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAreaSolicitante() {
		return _areaSolicitante;
	}

	@Override
	public void setAreaSolicitante(long areaSolicitante) {
		_areaSolicitante = areaSolicitante;

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setAreaSolicitante", long.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel,
					areaSolicitante);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCantidadRecursos() {
		return _cantidadRecursos;
	}

	@Override
	public void setCantidadRecursos(long cantidadRecursos) {
		_cantidadRecursos = cantidadRecursos;

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setCantidadRecursos",
						long.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel,
					cantidadRecursos);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaLimite() {
		return _fechaLimite;
	}

	@Override
	public void setFechaLimite(Date fechaLimite) {
		_fechaLimite = fechaLimite;

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaLimite", Date.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel,
					fechaLimite);
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

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setCargo", String.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel, cargo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTiempoContrato() {
		return _tiempoContrato;
	}

	@Override
	public void setTiempoContrato(long tiempoContrato) {
		_tiempoContrato = tiempoContrato;

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setTiempoContrato", long.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel,
					tiempoContrato);
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

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setTipoNegocio", long.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel,
					tipoNegocio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPresupuestoMaximo() {
		return _presupuestoMaximo;
	}

	@Override
	public void setPresupuestoMaximo(long presupuestoMaximo) {
		_presupuestoMaximo = presupuestoMaximo;

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setPresupuestoMaximo",
						long.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel,
					presupuestoMaximo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPresupuestoMinimo() {
		return _presupuestoMinimo;
	}

	@Override
	public void setPresupuestoMinimo(long presupuestoMinimo) {
		_presupuestoMinimo = presupuestoMinimo;

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setPresupuestoMinimo",
						long.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel,
					presupuestoMinimo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCliente() {
		return _cliente;
	}

	@Override
	public void setCliente(long cliente) {
		_cliente = cliente;

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setCliente", long.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel,
					cliente);
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

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel, activo);
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

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel,
					usuariocrea);
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

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel,
					fechacrea);
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

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel,
					usuariomodifica);
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

		if (_solicitudRequerimientoPersonalRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoPersonalRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_solicitudRequerimientoPersonalRemoteModel,
					fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSolicitudRequerimientoPersonalRemoteModel() {
		return _solicitudRequerimientoPersonalRemoteModel;
	}

	public void setSolicitudRequerimientoPersonalRemoteModel(
		BaseModel<?> solicitudRequerimientoPersonalRemoteModel) {
		_solicitudRequerimientoPersonalRemoteModel = solicitudRequerimientoPersonalRemoteModel;
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

		Class<?> remoteModelClass = _solicitudRequerimientoPersonalRemoteModel.getClass();

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

		Object returnValue = method.invoke(_solicitudRequerimientoPersonalRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SolicitudRequerimientoPersonalLocalServiceUtil.addSolicitudRequerimientoPersonal(this);
		}
		else {
			SolicitudRequerimientoPersonalLocalServiceUtil.updateSolicitudRequerimientoPersonal(this);
		}
	}

	@Override
	public SolicitudRequerimientoPersonal toEscapedModel() {
		return (SolicitudRequerimientoPersonal)ProxyUtil.newProxyInstance(SolicitudRequerimientoPersonal.class.getClassLoader(),
			new Class[] { SolicitudRequerimientoPersonal.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SolicitudRequerimientoPersonalClp clone = new SolicitudRequerimientoPersonalClp();

		clone.setSolicitudRequerimientoPersonalId(getSolicitudRequerimientoPersonalId());
		clone.setEstado(getEstado());
		clone.setPuesto(getPuesto());
		clone.setAreaSolicitante(getAreaSolicitante());
		clone.setCantidadRecursos(getCantidadRecursos());
		clone.setFechaLimite(getFechaLimite());
		clone.setCargo(getCargo());
		clone.setTiempoContrato(getTiempoContrato());
		clone.setTipoNegocio(getTipoNegocio());
		clone.setPresupuestoMaximo(getPresupuestoMaximo());
		clone.setPresupuestoMinimo(getPresupuestoMinimo());
		clone.setCliente(getCliente());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(
		SolicitudRequerimientoPersonal solicitudRequerimientoPersonal) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(),
				solicitudRequerimientoPersonal.getFechacrea());

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

		if (!(obj instanceof SolicitudRequerimientoPersonalClp)) {
			return false;
		}

		SolicitudRequerimientoPersonalClp solicitudRequerimientoPersonal = (SolicitudRequerimientoPersonalClp)obj;

		long primaryKey = solicitudRequerimientoPersonal.getPrimaryKey();

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
		StringBundler sb = new StringBundler(35);

		sb.append("{solicitudRequerimientoPersonalId=");
		sb.append(getSolicitudRequerimientoPersonalId());
		sb.append(", estado=");
		sb.append(getEstado());
		sb.append(", puesto=");
		sb.append(getPuesto());
		sb.append(", areaSolicitante=");
		sb.append(getAreaSolicitante());
		sb.append(", cantidadRecursos=");
		sb.append(getCantidadRecursos());
		sb.append(", fechaLimite=");
		sb.append(getFechaLimite());
		sb.append(", cargo=");
		sb.append(getCargo());
		sb.append(", tiempoContrato=");
		sb.append(getTiempoContrato());
		sb.append(", tipoNegocio=");
		sb.append(getTipoNegocio());
		sb.append(", presupuestoMaximo=");
		sb.append(getPresupuestoMaximo());
		sb.append(", presupuestoMinimo=");
		sb.append(getPresupuestoMinimo());
		sb.append(", cliente=");
		sb.append(getCliente());
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
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.SolicitudRequerimientoPersonal");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>solicitudRequerimientoPersonalId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudRequerimientoPersonalId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estado</column-name><column-value><![CDATA[");
		sb.append(getEstado());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>puesto</column-name><column-value><![CDATA[");
		sb.append(getPuesto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>areaSolicitante</column-name><column-value><![CDATA[");
		sb.append(getAreaSolicitante());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cantidadRecursos</column-name><column-value><![CDATA[");
		sb.append(getCantidadRecursos());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaLimite</column-name><column-value><![CDATA[");
		sb.append(getFechaLimite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cargo</column-name><column-value><![CDATA[");
		sb.append(getCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiempoContrato</column-name><column-value><![CDATA[");
		sb.append(getTiempoContrato());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipoNegocio</column-name><column-value><![CDATA[");
		sb.append(getTipoNegocio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>presupuestoMaximo</column-name><column-value><![CDATA[");
		sb.append(getPresupuestoMaximo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>presupuestoMinimo</column-name><column-value><![CDATA[");
		sb.append(getPresupuestoMinimo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cliente</column-name><column-value><![CDATA[");
		sb.append(getCliente());
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

	private long _solicitudRequerimientoPersonalId;
	private String _estado;
	private String _puesto;
	private long _areaSolicitante;
	private long _cantidadRecursos;
	private Date _fechaLimite;
	private String _cargo;
	private long _tiempoContrato;
	private long _tipoNegocio;
	private long _presupuestoMaximo;
	private long _presupuestoMinimo;
	private long _cliente;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private BaseModel<?> _solicitudRequerimientoPersonalRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
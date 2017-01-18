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
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;

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
public class SolicitudRequerimientoClp extends BaseModelImpl<SolicitudRequerimiento>
	implements SolicitudRequerimiento {
	public SolicitudRequerimientoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return SolicitudRequerimiento.class;
	}

	@Override
	public String getModelClassName() {
		return SolicitudRequerimiento.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _solicitudRequerimientoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSolicitudRequerimientoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _solicitudRequerimientoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudRequerimientoId", getSolicitudRequerimientoId());
		attributes.put("areaSolicitante", getAreaSolicitante());
		attributes.put("cantidadRecursos", getCantidadRecursos());
		attributes.put("responsableRRHH", getResponsableRRHH());
		attributes.put("fechaLimite", getFechaLimite());
		attributes.put("tiempoContrato", getTiempoContrato());
		attributes.put("tipoNegocio", getTipoNegocio());
		attributes.put("presupuestoMaximo", getPresupuestoMaximo());
		attributes.put("presupuestoMinimo", getPresupuestoMinimo());
		attributes.put("cliente", getCliente());
		attributes.put("especialidad", getEspecialidad());
		attributes.put("meta", getMeta());
		attributes.put("fechameta", getFechameta());
		attributes.put("prioridad", getPrioridad());
		attributes.put("contenidoId", getContenidoId());
		attributes.put("modalidadjornada", getModalidadjornada());
		attributes.put("modalidadcontrato", getModalidadcontrato());
		attributes.put("lugarTrabajo", getLugarTrabajo());
		attributes.put("categoriaPuestoId", getCategoriaPuestoId());
		attributes.put("proyecto", getProyecto());
		attributes.put("tiporeclutamiento", getTiporeclutamiento());
		attributes.put("estado", getEstado());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());
		attributes.put("cantidadAnnosRubro", getCantidadAnnosRubro());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long solicitudRequerimientoId = (Long)attributes.get(
				"solicitudRequerimientoId");

		if (solicitudRequerimientoId != null) {
			setSolicitudRequerimientoId(solicitudRequerimientoId);
		}

		Long areaSolicitante = (Long)attributes.get("areaSolicitante");

		if (areaSolicitante != null) {
			setAreaSolicitante(areaSolicitante);
		}

		Integer cantidadRecursos = (Integer)attributes.get("cantidadRecursos");

		if (cantidadRecursos != null) {
			setCantidadRecursos(cantidadRecursos);
		}

		Long responsableRRHH = (Long)attributes.get("responsableRRHH");

		if (responsableRRHH != null) {
			setResponsableRRHH(responsableRRHH);
		}

		Date fechaLimite = (Date)attributes.get("fechaLimite");

		if (fechaLimite != null) {
			setFechaLimite(fechaLimite);
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

		String especialidad = (String)attributes.get("especialidad");

		if (especialidad != null) {
			setEspecialidad(especialidad);
		}

		String meta = (String)attributes.get("meta");

		if (meta != null) {
			setMeta(meta);
		}

		Date fechameta = (Date)attributes.get("fechameta");

		if (fechameta != null) {
			setFechameta(fechameta);
		}

		Long prioridad = (Long)attributes.get("prioridad");

		if (prioridad != null) {
			setPrioridad(prioridad);
		}

		String contenidoId = (String)attributes.get("contenidoId");

		if (contenidoId != null) {
			setContenidoId(contenidoId);
		}

		Long modalidadjornada = (Long)attributes.get("modalidadjornada");

		if (modalidadjornada != null) {
			setModalidadjornada(modalidadjornada);
		}

		Long modalidadcontrato = (Long)attributes.get("modalidadcontrato");

		if (modalidadcontrato != null) {
			setModalidadcontrato(modalidadcontrato);
		}

		String lugarTrabajo = (String)attributes.get("lugarTrabajo");

		if (lugarTrabajo != null) {
			setLugarTrabajo(lugarTrabajo);
		}

		Long categoriaPuestoId = (Long)attributes.get("categoriaPuestoId");

		if (categoriaPuestoId != null) {
			setCategoriaPuestoId(categoriaPuestoId);
		}

		String proyecto = (String)attributes.get("proyecto");

		if (proyecto != null) {
			setProyecto(proyecto);
		}

		Long tiporeclutamiento = (Long)attributes.get("tiporeclutamiento");

		if (tiporeclutamiento != null) {
			setTiporeclutamiento(tiporeclutamiento);
		}

		Long estado = (Long)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
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

		Integer cantidadAnnosRubro = (Integer)attributes.get(
				"cantidadAnnosRubro");

		if (cantidadAnnosRubro != null) {
			setCantidadAnnosRubro(cantidadAnnosRubro);
		}
	}

	@Override
	public long getSolicitudRequerimientoId() {
		return _solicitudRequerimientoId;
	}

	@Override
	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_solicitudRequerimientoId = solicitudRequerimientoId;

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setSolicitudRequerimientoId",
						long.class);

				method.invoke(_solicitudRequerimientoRemoteModel,
					solicitudRequerimientoId);
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

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setAreaSolicitante", long.class);

				method.invoke(_solicitudRequerimientoRemoteModel,
					areaSolicitante);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCantidadRecursos() {
		return _cantidadRecursos;
	}

	@Override
	public void setCantidadRecursos(int cantidadRecursos) {
		_cantidadRecursos = cantidadRecursos;

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setCantidadRecursos", int.class);

				method.invoke(_solicitudRequerimientoRemoteModel,
					cantidadRecursos);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getResponsableRRHH() {
		return _responsableRRHH;
	}

	@Override
	public void setResponsableRRHH(long responsableRRHH) {
		_responsableRRHH = responsableRRHH;

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setResponsableRRHH", long.class);

				method.invoke(_solicitudRequerimientoRemoteModel,
					responsableRRHH);
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

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaLimite", Date.class);

				method.invoke(_solicitudRequerimientoRemoteModel, fechaLimite);
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

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setTiempoContrato", long.class);

				method.invoke(_solicitudRequerimientoRemoteModel, tiempoContrato);
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

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setTipoNegocio", long.class);

				method.invoke(_solicitudRequerimientoRemoteModel, tipoNegocio);
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

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setPresupuestoMaximo",
						long.class);

				method.invoke(_solicitudRequerimientoRemoteModel,
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

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setPresupuestoMinimo",
						long.class);

				method.invoke(_solicitudRequerimientoRemoteModel,
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

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setCliente", long.class);

				method.invoke(_solicitudRequerimientoRemoteModel, cliente);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEspecialidad() {
		return _especialidad;
	}

	@Override
	public void setEspecialidad(String especialidad) {
		_especialidad = especialidad;

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setEspecialidad", String.class);

				method.invoke(_solicitudRequerimientoRemoteModel, especialidad);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMeta() {
		return _meta;
	}

	@Override
	public void setMeta(String meta) {
		_meta = meta;

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setMeta", String.class);

				method.invoke(_solicitudRequerimientoRemoteModel, meta);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechameta() {
		return _fechameta;
	}

	@Override
	public void setFechameta(Date fechameta) {
		_fechameta = fechameta;

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechameta", Date.class);

				method.invoke(_solicitudRequerimientoRemoteModel, fechameta);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPrioridad() {
		return _prioridad;
	}

	@Override
	public void setPrioridad(long prioridad) {
		_prioridad = prioridad;

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setPrioridad", long.class);

				method.invoke(_solicitudRequerimientoRemoteModel, prioridad);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContenidoId() {
		return _contenidoId;
	}

	@Override
	public void setContenidoId(String contenidoId) {
		_contenidoId = contenidoId;

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setContenidoId", String.class);

				method.invoke(_solicitudRequerimientoRemoteModel, contenidoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getModalidadjornada() {
		return _modalidadjornada;
	}

	@Override
	public void setModalidadjornada(long modalidadjornada) {
		_modalidadjornada = modalidadjornada;

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setModalidadjornada",
						long.class);

				method.invoke(_solicitudRequerimientoRemoteModel,
					modalidadjornada);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getModalidadcontrato() {
		return _modalidadcontrato;
	}

	@Override
	public void setModalidadcontrato(long modalidadcontrato) {
		_modalidadcontrato = modalidadcontrato;

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setModalidadcontrato",
						long.class);

				method.invoke(_solicitudRequerimientoRemoteModel,
					modalidadcontrato);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLugarTrabajo() {
		return _lugarTrabajo;
	}

	@Override
	public void setLugarTrabajo(String lugarTrabajo) {
		_lugarTrabajo = lugarTrabajo;

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setLugarTrabajo", String.class);

				method.invoke(_solicitudRequerimientoRemoteModel, lugarTrabajo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCategoriaPuestoId() {
		return _categoriaPuestoId;
	}

	@Override
	public void setCategoriaPuestoId(long categoriaPuestoId) {
		_categoriaPuestoId = categoriaPuestoId;

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setCategoriaPuestoId",
						long.class);

				method.invoke(_solicitudRequerimientoRemoteModel,
					categoriaPuestoId);
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

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setProyecto", String.class);

				method.invoke(_solicitudRequerimientoRemoteModel, proyecto);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTiporeclutamiento() {
		return _tiporeclutamiento;
	}

	@Override
	public void setTiporeclutamiento(long tiporeclutamiento) {
		_tiporeclutamiento = tiporeclutamiento;

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setTiporeclutamiento",
						long.class);

				method.invoke(_solicitudRequerimientoRemoteModel,
					tiporeclutamiento);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEstado() {
		return _estado;
	}

	@Override
	public void setEstado(long estado) {
		_estado = estado;

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setEstado", long.class);

				method.invoke(_solicitudRequerimientoRemoteModel, estado);
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

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_solicitudRequerimientoRemoteModel, activo);
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

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_solicitudRequerimientoRemoteModel, usuariocrea);
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

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_solicitudRequerimientoRemoteModel, fechacrea);
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

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_solicitudRequerimientoRemoteModel,
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

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechamodifica", Date.class);

				method.invoke(_solicitudRequerimientoRemoteModel, fechamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCantidadAnnosRubro() {
		return _cantidadAnnosRubro;
	}

	@Override
	public void setCantidadAnnosRubro(int cantidadAnnosRubro) {
		_cantidadAnnosRubro = cantidadAnnosRubro;

		if (_solicitudRequerimientoRemoteModel != null) {
			try {
				Class<?> clazz = _solicitudRequerimientoRemoteModel.getClass();

				Method method = clazz.getMethod("setCantidadAnnosRubro",
						int.class);

				method.invoke(_solicitudRequerimientoRemoteModel,
					cantidadAnnosRubro);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSolicitudRequerimientoRemoteModel() {
		return _solicitudRequerimientoRemoteModel;
	}

	public void setSolicitudRequerimientoRemoteModel(
		BaseModel<?> solicitudRequerimientoRemoteModel) {
		_solicitudRequerimientoRemoteModel = solicitudRequerimientoRemoteModel;
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

		Class<?> remoteModelClass = _solicitudRequerimientoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_solicitudRequerimientoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SolicitudRequerimientoLocalServiceUtil.addSolicitudRequerimiento(this);
		}
		else {
			SolicitudRequerimientoLocalServiceUtil.updateSolicitudRequerimiento(this);
		}
	}

	@Override
	public SolicitudRequerimiento toEscapedModel() {
		return (SolicitudRequerimiento)ProxyUtil.newProxyInstance(SolicitudRequerimiento.class.getClassLoader(),
			new Class[] { SolicitudRequerimiento.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SolicitudRequerimientoClp clone = new SolicitudRequerimientoClp();

		clone.setSolicitudRequerimientoId(getSolicitudRequerimientoId());
		clone.setAreaSolicitante(getAreaSolicitante());
		clone.setCantidadRecursos(getCantidadRecursos());
		clone.setResponsableRRHH(getResponsableRRHH());
		clone.setFechaLimite(getFechaLimite());
		clone.setTiempoContrato(getTiempoContrato());
		clone.setTipoNegocio(getTipoNegocio());
		clone.setPresupuestoMaximo(getPresupuestoMaximo());
		clone.setPresupuestoMinimo(getPresupuestoMinimo());
		clone.setCliente(getCliente());
		clone.setEspecialidad(getEspecialidad());
		clone.setMeta(getMeta());
		clone.setFechameta(getFechameta());
		clone.setPrioridad(getPrioridad());
		clone.setContenidoId(getContenidoId());
		clone.setModalidadjornada(getModalidadjornada());
		clone.setModalidadcontrato(getModalidadcontrato());
		clone.setLugarTrabajo(getLugarTrabajo());
		clone.setCategoriaPuestoId(getCategoriaPuestoId());
		clone.setProyecto(getProyecto());
		clone.setTiporeclutamiento(getTiporeclutamiento());
		clone.setEstado(getEstado());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechamodifica(getFechamodifica());
		clone.setCantidadAnnosRubro(getCantidadAnnosRubro());

		return clone;
	}

	@Override
	public int compareTo(SolicitudRequerimiento solicitudRequerimiento) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				solicitudRequerimiento.getFechamodifica());

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

		if (!(obj instanceof SolicitudRequerimientoClp)) {
			return false;
		}

		SolicitudRequerimientoClp solicitudRequerimiento = (SolicitudRequerimientoClp)obj;

		long primaryKey = solicitudRequerimiento.getPrimaryKey();

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
		StringBundler sb = new StringBundler(57);

		sb.append("{solicitudRequerimientoId=");
		sb.append(getSolicitudRequerimientoId());
		sb.append(", areaSolicitante=");
		sb.append(getAreaSolicitante());
		sb.append(", cantidadRecursos=");
		sb.append(getCantidadRecursos());
		sb.append(", responsableRRHH=");
		sb.append(getResponsableRRHH());
		sb.append(", fechaLimite=");
		sb.append(getFechaLimite());
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
		sb.append(", especialidad=");
		sb.append(getEspecialidad());
		sb.append(", meta=");
		sb.append(getMeta());
		sb.append(", fechameta=");
		sb.append(getFechameta());
		sb.append(", prioridad=");
		sb.append(getPrioridad());
		sb.append(", contenidoId=");
		sb.append(getContenidoId());
		sb.append(", modalidadjornada=");
		sb.append(getModalidadjornada());
		sb.append(", modalidadcontrato=");
		sb.append(getModalidadcontrato());
		sb.append(", lugarTrabajo=");
		sb.append(getLugarTrabajo());
		sb.append(", categoriaPuestoId=");
		sb.append(getCategoriaPuestoId());
		sb.append(", proyecto=");
		sb.append(getProyecto());
		sb.append(", tiporeclutamiento=");
		sb.append(getTiporeclutamiento());
		sb.append(", estado=");
		sb.append(getEstado());
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
		sb.append(", cantidadAnnosRubro=");
		sb.append(getCantidadAnnosRubro());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(88);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.SolicitudRequerimiento");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>solicitudRequerimientoId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudRequerimientoId());
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
			"<column><column-name>responsableRRHH</column-name><column-value><![CDATA[");
		sb.append(getResponsableRRHH());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaLimite</column-name><column-value><![CDATA[");
		sb.append(getFechaLimite());
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
			"<column><column-name>especialidad</column-name><column-value><![CDATA[");
		sb.append(getEspecialidad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>meta</column-name><column-value><![CDATA[");
		sb.append(getMeta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechameta</column-name><column-value><![CDATA[");
		sb.append(getFechameta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>prioridad</column-name><column-value><![CDATA[");
		sb.append(getPrioridad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contenidoId</column-name><column-value><![CDATA[");
		sb.append(getContenidoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modalidadjornada</column-name><column-value><![CDATA[");
		sb.append(getModalidadjornada());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modalidadcontrato</column-name><column-value><![CDATA[");
		sb.append(getModalidadcontrato());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lugarTrabajo</column-name><column-value><![CDATA[");
		sb.append(getLugarTrabajo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoriaPuestoId</column-name><column-value><![CDATA[");
		sb.append(getCategoriaPuestoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>proyecto</column-name><column-value><![CDATA[");
		sb.append(getProyecto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiporeclutamiento</column-name><column-value><![CDATA[");
		sb.append(getTiporeclutamiento());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estado</column-name><column-value><![CDATA[");
		sb.append(getEstado());
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
		sb.append(
			"<column><column-name>cantidadAnnosRubro</column-name><column-value><![CDATA[");
		sb.append(getCantidadAnnosRubro());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _solicitudRequerimientoId;
	private long _areaSolicitante;
	private int _cantidadRecursos;
	private long _responsableRRHH;
	private Date _fechaLimite;
	private long _tiempoContrato;
	private long _tipoNegocio;
	private long _presupuestoMaximo;
	private long _presupuestoMinimo;
	private long _cliente;
	private String _especialidad;
	private String _meta;
	private Date _fechameta;
	private long _prioridad;
	private String _contenidoId;
	private long _modalidadjornada;
	private long _modalidadcontrato;
	private String _lugarTrabajo;
	private long _categoriaPuestoId;
	private String _proyecto;
	private long _tiporeclutamiento;
	private long _estado;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private int _cantidadAnnosRubro;
	private BaseModel<?> _solicitudRequerimientoRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.SolicitudRequerimientoServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.SolicitudRequerimientoServiceSoap
 * @generated
 */
public class SolicitudRequerimientoSoap implements Serializable {
	public static SolicitudRequerimientoSoap toSoapModel(
		SolicitudRequerimiento model) {
		SolicitudRequerimientoSoap soapModel = new SolicitudRequerimientoSoap();

		soapModel.setSolicitudRequerimientoId(model.getSolicitudRequerimientoId());
		soapModel.setAreaSolicitante(model.getAreaSolicitante());
		soapModel.setCantidadRecursos(model.getCantidadRecursos());
		soapModel.setResponsableRRHH(model.getResponsableRRHH());
		soapModel.setFechaLimite(model.getFechaLimite());
		soapModel.setTiempoContrato(model.getTiempoContrato());
		soapModel.setTipoNegocio(model.getTipoNegocio());
		soapModel.setPresupuestoMaximo(model.getPresupuestoMaximo());
		soapModel.setPresupuestoMinimo(model.getPresupuestoMinimo());
		soapModel.setCliente(model.getCliente());
		soapModel.setEspecialidad(model.getEspecialidad());
		soapModel.setMeta(model.getMeta());
		soapModel.setFechameta(model.getFechameta());
		soapModel.setPrioridad(model.getPrioridad());
		soapModel.setContenidoId(model.getContenidoId());
		soapModel.setModalidadjornada(model.getModalidadjornada());
		soapModel.setModalidadcontrato(model.getModalidadcontrato());
		soapModel.setLugarTrabajo(model.getLugarTrabajo());
		soapModel.setCategoriaPuestoId(model.getCategoriaPuestoId());
		soapModel.setProyecto(model.getProyecto());
		soapModel.setTiporeclutamiento(model.getTiporeclutamiento());
		soapModel.setEstado(model.getEstado());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static SolicitudRequerimientoSoap[] toSoapModels(
		SolicitudRequerimiento[] models) {
		SolicitudRequerimientoSoap[] soapModels = new SolicitudRequerimientoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SolicitudRequerimientoSoap[][] toSoapModels(
		SolicitudRequerimiento[][] models) {
		SolicitudRequerimientoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SolicitudRequerimientoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SolicitudRequerimientoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SolicitudRequerimientoSoap[] toSoapModels(
		List<SolicitudRequerimiento> models) {
		List<SolicitudRequerimientoSoap> soapModels = new ArrayList<SolicitudRequerimientoSoap>(models.size());

		for (SolicitudRequerimiento model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SolicitudRequerimientoSoap[soapModels.size()]);
	}

	public SolicitudRequerimientoSoap() {
	}

	public long getPrimaryKey() {
		return _solicitudRequerimientoId;
	}

	public void setPrimaryKey(long pk) {
		setSolicitudRequerimientoId(pk);
	}

	public long getSolicitudRequerimientoId() {
		return _solicitudRequerimientoId;
	}

	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_solicitudRequerimientoId = solicitudRequerimientoId;
	}

	public long getAreaSolicitante() {
		return _areaSolicitante;
	}

	public void setAreaSolicitante(long areaSolicitante) {
		_areaSolicitante = areaSolicitante;
	}

	public int getCantidadRecursos() {
		return _cantidadRecursos;
	}

	public void setCantidadRecursos(int cantidadRecursos) {
		_cantidadRecursos = cantidadRecursos;
	}

	public long getResponsableRRHH() {
		return _responsableRRHH;
	}

	public void setResponsableRRHH(long responsableRRHH) {
		_responsableRRHH = responsableRRHH;
	}

	public Date getFechaLimite() {
		return _fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		_fechaLimite = fechaLimite;
	}

	public long getTiempoContrato() {
		return _tiempoContrato;
	}

	public void setTiempoContrato(long tiempoContrato) {
		_tiempoContrato = tiempoContrato;
	}

	public long getTipoNegocio() {
		return _tipoNegocio;
	}

	public void setTipoNegocio(long tipoNegocio) {
		_tipoNegocio = tipoNegocio;
	}

	public long getPresupuestoMaximo() {
		return _presupuestoMaximo;
	}

	public void setPresupuestoMaximo(long presupuestoMaximo) {
		_presupuestoMaximo = presupuestoMaximo;
	}

	public long getPresupuestoMinimo() {
		return _presupuestoMinimo;
	}

	public void setPresupuestoMinimo(long presupuestoMinimo) {
		_presupuestoMinimo = presupuestoMinimo;
	}

	public long getCliente() {
		return _cliente;
	}

	public void setCliente(long cliente) {
		_cliente = cliente;
	}

	public String getEspecialidad() {
		return _especialidad;
	}

	public void setEspecialidad(String especialidad) {
		_especialidad = especialidad;
	}

	public String getMeta() {
		return _meta;
	}

	public void setMeta(String meta) {
		_meta = meta;
	}

	public Date getFechameta() {
		return _fechameta;
	}

	public void setFechameta(Date fechameta) {
		_fechameta = fechameta;
	}

	public long getPrioridad() {
		return _prioridad;
	}

	public void setPrioridad(long prioridad) {
		_prioridad = prioridad;
	}

	public String getContenidoId() {
		return _contenidoId;
	}

	public void setContenidoId(String contenidoId) {
		_contenidoId = contenidoId;
	}

	public long getModalidadjornada() {
		return _modalidadjornada;
	}

	public void setModalidadjornada(long modalidadjornada) {
		_modalidadjornada = modalidadjornada;
	}

	public long getModalidadcontrato() {
		return _modalidadcontrato;
	}

	public void setModalidadcontrato(long modalidadcontrato) {
		_modalidadcontrato = modalidadcontrato;
	}

	public String getLugarTrabajo() {
		return _lugarTrabajo;
	}

	public void setLugarTrabajo(String lugarTrabajo) {
		_lugarTrabajo = lugarTrabajo;
	}

	public long getCategoriaPuestoId() {
		return _categoriaPuestoId;
	}

	public void setCategoriaPuestoId(long categoriaPuestoId) {
		_categoriaPuestoId = categoriaPuestoId;
	}

	public String getProyecto() {
		return _proyecto;
	}

	public void setProyecto(String proyecto) {
		_proyecto = proyecto;
	}

	public long getTiporeclutamiento() {
		return _tiporeclutamiento;
	}

	public void setTiporeclutamiento(long tiporeclutamiento) {
		_tiporeclutamiento = tiporeclutamiento;
	}

	public long getEstado() {
		return _estado;
	}

	public void setEstado(long estado) {
		_estado = estado;
	}

	public boolean getActivo() {
		return _activo;
	}

	public boolean isActivo() {
		return _activo;
	}

	public void setActivo(boolean activo) {
		_activo = activo;
	}

	public long getUsuariocrea() {
		return _usuariocrea;
	}

	public void setUsuariocrea(long usuariocrea) {
		_usuariocrea = usuariocrea;
	}

	public Date getFechacrea() {
		return _fechacrea;
	}

	public void setFechacrea(Date fechacrea) {
		_fechacrea = fechacrea;
	}

	public long getUsuariomodifica() {
		return _usuariomodifica;
	}

	public void setUsuariomodifica(long usuariomodifica) {
		_usuariomodifica = usuariomodifica;
	}

	public Date getFechamodifica() {
		return _fechamodifica;
	}

	public void setFechamodifica(Date fechamodifica) {
		_fechamodifica = fechamodifica;
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
}
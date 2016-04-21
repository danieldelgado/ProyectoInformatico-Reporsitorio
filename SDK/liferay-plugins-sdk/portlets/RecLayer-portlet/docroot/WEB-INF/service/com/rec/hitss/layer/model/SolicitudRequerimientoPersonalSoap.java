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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Crossfire
 * @generated
 */
public class SolicitudRequerimientoPersonalSoap implements Serializable {
	public static SolicitudRequerimientoPersonalSoap toSoapModel(
		SolicitudRequerimientoPersonal model) {
		SolicitudRequerimientoPersonalSoap soapModel = new SolicitudRequerimientoPersonalSoap();

		soapModel.setSolicitudRequerimientoPersonalId(model.getSolicitudRequerimientoPersonalId());
		soapModel.setEstado(model.getEstado());
		soapModel.setPuesto(model.getPuesto());
		soapModel.setAreaSolicitante(model.getAreaSolicitante());
		soapModel.setCantidadRecursos(model.getCantidadRecursos());
		soapModel.setFechaLimite(model.getFechaLimite());
		soapModel.setCargo(model.getCargo());
		soapModel.setTiempoContrato(model.getTiempoContrato());
		soapModel.setTipoNegocio(model.getTipoNegocio());
		soapModel.setPresupuestoMaximo(model.getPresupuestoMaximo());
		soapModel.setPresupuestoMinimo(model.getPresupuestoMinimo());
		soapModel.setCliente(model.getCliente());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static SolicitudRequerimientoPersonalSoap[] toSoapModels(
		SolicitudRequerimientoPersonal[] models) {
		SolicitudRequerimientoPersonalSoap[] soapModels = new SolicitudRequerimientoPersonalSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SolicitudRequerimientoPersonalSoap[][] toSoapModels(
		SolicitudRequerimientoPersonal[][] models) {
		SolicitudRequerimientoPersonalSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SolicitudRequerimientoPersonalSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SolicitudRequerimientoPersonalSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SolicitudRequerimientoPersonalSoap[] toSoapModels(
		List<SolicitudRequerimientoPersonal> models) {
		List<SolicitudRequerimientoPersonalSoap> soapModels = new ArrayList<SolicitudRequerimientoPersonalSoap>(models.size());

		for (SolicitudRequerimientoPersonal model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SolicitudRequerimientoPersonalSoap[soapModels.size()]);
	}

	public SolicitudRequerimientoPersonalSoap() {
	}

	public long getPrimaryKey() {
		return _solicitudRequerimientoPersonalId;
	}

	public void setPrimaryKey(long pk) {
		setSolicitudRequerimientoPersonalId(pk);
	}

	public long getSolicitudRequerimientoPersonalId() {
		return _solicitudRequerimientoPersonalId;
	}

	public void setSolicitudRequerimientoPersonalId(
		long solicitudRequerimientoPersonalId) {
		_solicitudRequerimientoPersonalId = solicitudRequerimientoPersonalId;
	}

	public String getEstado() {
		return _estado;
	}

	public void setEstado(String estado) {
		_estado = estado;
	}

	public String getPuesto() {
		return _puesto;
	}

	public void setPuesto(String puesto) {
		_puesto = puesto;
	}

	public long getAreaSolicitante() {
		return _areaSolicitante;
	}

	public void setAreaSolicitante(long areaSolicitante) {
		_areaSolicitante = areaSolicitante;
	}

	public long getCantidadRecursos() {
		return _cantidadRecursos;
	}

	public void setCantidadRecursos(long cantidadRecursos) {
		_cantidadRecursos = cantidadRecursos;
	}

	public Date getFechaLimite() {
		return _fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		_fechaLimite = fechaLimite;
	}

	public String getCargo() {
		return _cargo;
	}

	public void setCargo(String cargo) {
		_cargo = cargo;
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

	public Date getFechacreamodifica() {
		return _fechacreamodifica;
	}

	public void setFechacreamodifica(Date fechacreamodifica) {
		_fechacreamodifica = fechacreamodifica;
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
}
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
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.FasePostulacionServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.FasePostulacionServiceSoap
 * @generated
 */
public class FasePostulacionSoap implements Serializable {
	public static FasePostulacionSoap toSoapModel(FasePostulacion model) {
		FasePostulacionSoap soapModel = new FasePostulacionSoap();

		soapModel.setFasePostulacionId(model.getFasePostulacionId());
		soapModel.setSolicitudRequerimientoId(model.getSolicitudRequerimientoId());
		soapModel.setUsuarioId(model.getUsuarioId());
		soapModel.setTipoFase(model.getTipoFase());
		soapModel.setFechaFase(model.getFechaFase());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setEstado(model.getEstado());
		soapModel.setAsistio(model.getAsistio());
		soapModel.setApruebaFase(model.getApruebaFase());
		soapModel.setPuntuacion(model.getPuntuacion());
		soapModel.setSalario(model.getSalario());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static FasePostulacionSoap[] toSoapModels(FasePostulacion[] models) {
		FasePostulacionSoap[] soapModels = new FasePostulacionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FasePostulacionSoap[][] toSoapModels(
		FasePostulacion[][] models) {
		FasePostulacionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FasePostulacionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FasePostulacionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FasePostulacionSoap[] toSoapModels(
		List<FasePostulacion> models) {
		List<FasePostulacionSoap> soapModels = new ArrayList<FasePostulacionSoap>(models.size());

		for (FasePostulacion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FasePostulacionSoap[soapModels.size()]);
	}

	public FasePostulacionSoap() {
	}

	public long getPrimaryKey() {
		return _fasePostulacionId;
	}

	public void setPrimaryKey(long pk) {
		setFasePostulacionId(pk);
	}

	public long getFasePostulacionId() {
		return _fasePostulacionId;
	}

	public void setFasePostulacionId(long fasePostulacionId) {
		_fasePostulacionId = fasePostulacionId;
	}

	public long getSolicitudRequerimientoId() {
		return _solicitudRequerimientoId;
	}

	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_solicitudRequerimientoId = solicitudRequerimientoId;
	}

	public long getUsuarioId() {
		return _usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		_usuarioId = usuarioId;
	}

	public long getTipoFase() {
		return _tipoFase;
	}

	public void setTipoFase(long tipoFase) {
		_tipoFase = tipoFase;
	}

	public Date getFechaFase() {
		return _fechaFase;
	}

	public void setFechaFase(Date fechaFase) {
		_fechaFase = fechaFase;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public long getEstado() {
		return _estado;
	}

	public void setEstado(long estado) {
		_estado = estado;
	}

	public boolean getAsistio() {
		return _asistio;
	}

	public boolean isAsistio() {
		return _asistio;
	}

	public void setAsistio(boolean asistio) {
		_asistio = asistio;
	}

	public boolean getApruebaFase() {
		return _apruebaFase;
	}

	public boolean isApruebaFase() {
		return _apruebaFase;
	}

	public void setApruebaFase(boolean apruebaFase) {
		_apruebaFase = apruebaFase;
	}

	public int getPuntuacion() {
		return _puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		_puntuacion = puntuacion;
	}

	public double getSalario() {
		return _salario;
	}

	public void setSalario(double salario) {
		_salario = salario;
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

	private long _fasePostulacionId;
	private long _solicitudRequerimientoId;
	private long _usuarioId;
	private long _tipoFase;
	private Date _fechaFase;
	private String _descripcion;
	private long _estado;
	private boolean _asistio;
	private boolean _apruebaFase;
	private int _puntuacion;
	private double _salario;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
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
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.ActividadCronogramaServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.ActividadCronogramaServiceSoap
 * @generated
 */
public class ActividadCronogramaSoap implements Serializable {
	public static ActividadCronogramaSoap toSoapModel(ActividadCronograma model) {
		ActividadCronogramaSoap soapModel = new ActividadCronogramaSoap();

		soapModel.setActividadCronogramaId(model.getActividadCronogramaId());
		soapModel.setCronogramaId(model.getCronogramaId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setFechaInicio(model.getFechaInicio());
		soapModel.setFechaFin(model.getFechaFin());
		soapModel.setCumplido(model.getCumplido());
		soapModel.setFinalizado(model.getFinalizado());
		soapModel.setTipoActividad(model.getTipoActividad());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static ActividadCronogramaSoap[] toSoapModels(
		ActividadCronograma[] models) {
		ActividadCronogramaSoap[] soapModels = new ActividadCronogramaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ActividadCronogramaSoap[][] toSoapModels(
		ActividadCronograma[][] models) {
		ActividadCronogramaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ActividadCronogramaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ActividadCronogramaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ActividadCronogramaSoap[] toSoapModels(
		List<ActividadCronograma> models) {
		List<ActividadCronogramaSoap> soapModels = new ArrayList<ActividadCronogramaSoap>(models.size());

		for (ActividadCronograma model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ActividadCronogramaSoap[soapModels.size()]);
	}

	public ActividadCronogramaSoap() {
	}

	public long getPrimaryKey() {
		return _cronogramaId;
	}

	public void setPrimaryKey(long pk) {
		setCronogramaId(pk);
	}

	public long getActividadCronogramaId() {
		return _actividadCronogramaId;
	}

	public void setActividadCronogramaId(long actividadCronogramaId) {
		_actividadCronogramaId = actividadCronogramaId;
	}

	public long getCronogramaId() {
		return _cronogramaId;
	}

	public void setCronogramaId(long cronogramaId) {
		_cronogramaId = cronogramaId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public Date getFechaInicio() {
		return _fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		_fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return _fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		_fechaFin = fechaFin;
	}

	public boolean getCumplido() {
		return _cumplido;
	}

	public boolean isCumplido() {
		return _cumplido;
	}

	public void setCumplido(boolean cumplido) {
		_cumplido = cumplido;
	}

	public boolean getFinalizado() {
		return _finalizado;
	}

	public boolean isFinalizado() {
		return _finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		_finalizado = finalizado;
	}

	public long getTipoActividad() {
		return _tipoActividad;
	}

	public void setTipoActividad(long tipoActividad) {
		_tipoActividad = tipoActividad;
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

	private long _actividadCronogramaId;
	private long _cronogramaId;
	private String _descripcion;
	private Date _fechaInicio;
	private Date _fechaFin;
	private boolean _cumplido;
	private boolean _finalizado;
	private long _tipoActividad;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
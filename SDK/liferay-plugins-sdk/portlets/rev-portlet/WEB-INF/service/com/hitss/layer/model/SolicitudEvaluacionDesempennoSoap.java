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
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.SolicitudEvaluacionDesempennoServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.SolicitudEvaluacionDesempennoServiceSoap
 * @generated
 */
public class SolicitudEvaluacionDesempennoSoap implements Serializable {
	public static SolicitudEvaluacionDesempennoSoap toSoapModel(
		SolicitudEvaluacionDesempenno model) {
		SolicitudEvaluacionDesempennoSoap soapModel = new SolicitudEvaluacionDesempennoSoap();

		soapModel.setSolicitudEvaluacionDesempennoId(model.getSolicitudEvaluacionDesempennoId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setFechaInicio(model.getFechaInicio());
		soapModel.setEstado(model.getEstado());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static SolicitudEvaluacionDesempennoSoap[] toSoapModels(
		SolicitudEvaluacionDesempenno[] models) {
		SolicitudEvaluacionDesempennoSoap[] soapModels = new SolicitudEvaluacionDesempennoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SolicitudEvaluacionDesempennoSoap[][] toSoapModels(
		SolicitudEvaluacionDesempenno[][] models) {
		SolicitudEvaluacionDesempennoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SolicitudEvaluacionDesempennoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SolicitudEvaluacionDesempennoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SolicitudEvaluacionDesempennoSoap[] toSoapModels(
		List<SolicitudEvaluacionDesempenno> models) {
		List<SolicitudEvaluacionDesempennoSoap> soapModels = new ArrayList<SolicitudEvaluacionDesempennoSoap>(models.size());

		for (SolicitudEvaluacionDesempenno model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SolicitudEvaluacionDesempennoSoap[soapModels.size()]);
	}

	public SolicitudEvaluacionDesempennoSoap() {
	}

	public long getPrimaryKey() {
		return _solicitudEvaluacionDesempennoId;
	}

	public void setPrimaryKey(long pk) {
		setSolicitudEvaluacionDesempennoId(pk);
	}

	public long getSolicitudEvaluacionDesempennoId() {
		return _solicitudEvaluacionDesempennoId;
	}

	public void setSolicitudEvaluacionDesempennoId(
		long solicitudEvaluacionDesempennoId) {
		_solicitudEvaluacionDesempennoId = solicitudEvaluacionDesempennoId;
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

	public Date getFechacreamodifica() {
		return _fechacreamodifica;
	}

	public void setFechacreamodifica(Date fechacreamodifica) {
		_fechacreamodifica = fechacreamodifica;
	}

	private long _solicitudEvaluacionDesempennoId;
	private String _descripcion;
	private Date _fechaInicio;
	private long _estado;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
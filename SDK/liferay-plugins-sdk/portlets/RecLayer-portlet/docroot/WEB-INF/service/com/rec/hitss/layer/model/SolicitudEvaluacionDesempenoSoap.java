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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.SolicitudEvaluacionDesempenoServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.SolicitudEvaluacionDesempenoServiceSoap
 * @generated
 */
public class SolicitudEvaluacionDesempenoSoap implements Serializable {
	public static SolicitudEvaluacionDesempenoSoap toSoapModel(
		SolicitudEvaluacionDesempeno model) {
		SolicitudEvaluacionDesempenoSoap soapModel = new SolicitudEvaluacionDesempenoSoap();

		soapModel.setSolicitudEvaluacionDesempenoId(model.getSolicitudEvaluacionDesempenoId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setFechaIncioEvaluacion(model.getFechaIncioEvaluacion());
		soapModel.setEstado(model.getEstado());
		soapModel.setMotivo(model.getMotivo());
		soapModel.setObservacion(model.getObservacion());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static SolicitudEvaluacionDesempenoSoap[] toSoapModels(
		SolicitudEvaluacionDesempeno[] models) {
		SolicitudEvaluacionDesempenoSoap[] soapModels = new SolicitudEvaluacionDesempenoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SolicitudEvaluacionDesempenoSoap[][] toSoapModels(
		SolicitudEvaluacionDesempeno[][] models) {
		SolicitudEvaluacionDesempenoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SolicitudEvaluacionDesempenoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SolicitudEvaluacionDesempenoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SolicitudEvaluacionDesempenoSoap[] toSoapModels(
		List<SolicitudEvaluacionDesempeno> models) {
		List<SolicitudEvaluacionDesempenoSoap> soapModels = new ArrayList<SolicitudEvaluacionDesempenoSoap>(models.size());

		for (SolicitudEvaluacionDesempeno model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SolicitudEvaluacionDesempenoSoap[soapModels.size()]);
	}

	public SolicitudEvaluacionDesempenoSoap() {
	}

	public long getPrimaryKey() {
		return _solicitudEvaluacionDesempenoId;
	}

	public void setPrimaryKey(long pk) {
		setSolicitudEvaluacionDesempenoId(pk);
	}

	public long getSolicitudEvaluacionDesempenoId() {
		return _solicitudEvaluacionDesempenoId;
	}

	public void setSolicitudEvaluacionDesempenoId(
		long solicitudEvaluacionDesempenoId) {
		_solicitudEvaluacionDesempenoId = solicitudEvaluacionDesempenoId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public Date getFechaIncioEvaluacion() {
		return _fechaIncioEvaluacion;
	}

	public void setFechaIncioEvaluacion(Date fechaIncioEvaluacion) {
		_fechaIncioEvaluacion = fechaIncioEvaluacion;
	}

	public String getEstado() {
		return _estado;
	}

	public void setEstado(String estado) {
		_estado = estado;
	}

	public String getMotivo() {
		return _motivo;
	}

	public void setMotivo(String motivo) {
		_motivo = motivo;
	}

	public String getObservacion() {
		return _observacion;
	}

	public void setObservacion(String observacion) {
		_observacion = observacion;
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

	private long _solicitudEvaluacionDesempenoId;
	private String _descripcion;
	private Date _fechaIncioEvaluacion;
	private String _estado;
	private String _motivo;
	private String _observacion;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
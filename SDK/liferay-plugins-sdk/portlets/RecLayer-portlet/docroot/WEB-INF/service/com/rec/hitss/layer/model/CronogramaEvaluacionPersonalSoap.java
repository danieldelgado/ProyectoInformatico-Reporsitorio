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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.CronogramaEvaluacionPersonalServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.CronogramaEvaluacionPersonalServiceSoap
 * @generated
 */
public class CronogramaEvaluacionPersonalSoap implements Serializable {
	public static CronogramaEvaluacionPersonalSoap toSoapModel(
		CronogramaEvaluacionPersonal model) {
		CronogramaEvaluacionPersonalSoap soapModel = new CronogramaEvaluacionPersonalSoap();

		soapModel.setCronogramaEvaluacionPersonalId(model.getCronogramaEvaluacionPersonalId());
		soapModel.setSolicitudEvaluacionDesempenoId(model.getSolicitudEvaluacionDesempenoId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setEstado(model.getEstado());
		soapModel.setObservacion(model.getObservacion());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static CronogramaEvaluacionPersonalSoap[] toSoapModels(
		CronogramaEvaluacionPersonal[] models) {
		CronogramaEvaluacionPersonalSoap[] soapModels = new CronogramaEvaluacionPersonalSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CronogramaEvaluacionPersonalSoap[][] toSoapModels(
		CronogramaEvaluacionPersonal[][] models) {
		CronogramaEvaluacionPersonalSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CronogramaEvaluacionPersonalSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CronogramaEvaluacionPersonalSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CronogramaEvaluacionPersonalSoap[] toSoapModels(
		List<CronogramaEvaluacionPersonal> models) {
		List<CronogramaEvaluacionPersonalSoap> soapModels = new ArrayList<CronogramaEvaluacionPersonalSoap>(models.size());

		for (CronogramaEvaluacionPersonal model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CronogramaEvaluacionPersonalSoap[soapModels.size()]);
	}

	public CronogramaEvaluacionPersonalSoap() {
	}

	public long getPrimaryKey() {
		return _cronogramaEvaluacionPersonalId;
	}

	public void setPrimaryKey(long pk) {
		setCronogramaEvaluacionPersonalId(pk);
	}

	public long getCronogramaEvaluacionPersonalId() {
		return _cronogramaEvaluacionPersonalId;
	}

	public void setCronogramaEvaluacionPersonalId(
		long cronogramaEvaluacionPersonalId) {
		_cronogramaEvaluacionPersonalId = cronogramaEvaluacionPersonalId;
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

	public String getEstado() {
		return _estado;
	}

	public void setEstado(String estado) {
		_estado = estado;
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

	private long _cronogramaEvaluacionPersonalId;
	private long _solicitudEvaluacionDesempenoId;
	private String _descripcion;
	private String _estado;
	private String _observacion;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
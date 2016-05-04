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
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.CronogramaServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.CronogramaServiceSoap
 * @generated
 */
public class CronogramaSoap implements Serializable {
	public static CronogramaSoap toSoapModel(Cronograma model) {
		CronogramaSoap soapModel = new CronogramaSoap();

		soapModel.setCronogramaId(model.getCronogramaId());
		soapModel.setSolicitudEvaluacionDesempennoId(model.getSolicitudEvaluacionDesempennoId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setEstado(model.getEstado());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static CronogramaSoap[] toSoapModels(Cronograma[] models) {
		CronogramaSoap[] soapModels = new CronogramaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CronogramaSoap[][] toSoapModels(Cronograma[][] models) {
		CronogramaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CronogramaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CronogramaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CronogramaSoap[] toSoapModels(List<Cronograma> models) {
		List<CronogramaSoap> soapModels = new ArrayList<CronogramaSoap>(models.size());

		for (Cronograma model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CronogramaSoap[soapModels.size()]);
	}

	public CronogramaSoap() {
	}

	public long getPrimaryKey() {
		return _cronogramaId;
	}

	public void setPrimaryKey(long pk) {
		setCronogramaId(pk);
	}

	public long getCronogramaId() {
		return _cronogramaId;
	}

	public void setCronogramaId(long cronogramaId) {
		_cronogramaId = cronogramaId;
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

	private long _cronogramaId;
	private long _solicitudEvaluacionDesempennoId;
	private String _descripcion;
	private long _estado;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
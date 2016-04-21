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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.ActividadesServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.ActividadesServiceSoap
 * @generated
 */
public class ActividadesSoap implements Serializable {
	public static ActividadesSoap toSoapModel(Actividades model) {
		ActividadesSoap soapModel = new ActividadesSoap();

		soapModel.setActividadesId(model.getActividadesId());
		soapModel.setCronogramaEvaluacionPersonalId(model.getCronogramaEvaluacionPersonalId());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());
		soapModel.setFechaInicioEvaluacion(model.getFechaInicioEvaluacion());
		soapModel.setFechaFinEvaluacion(model.getFechaFinEvaluacion());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());

		return soapModel;
	}

	public static ActividadesSoap[] toSoapModels(Actividades[] models) {
		ActividadesSoap[] soapModels = new ActividadesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ActividadesSoap[][] toSoapModels(Actividades[][] models) {
		ActividadesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ActividadesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ActividadesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ActividadesSoap[] toSoapModels(List<Actividades> models) {
		List<ActividadesSoap> soapModels = new ArrayList<ActividadesSoap>(models.size());

		for (Actividades model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ActividadesSoap[soapModels.size()]);
	}

	public ActividadesSoap() {
	}

	public long getPrimaryKey() {
		return _actividadesId;
	}

	public void setPrimaryKey(long pk) {
		setActividadesId(pk);
	}

	public long getActividadesId() {
		return _actividadesId;
	}

	public void setActividadesId(long actividadesId) {
		_actividadesId = actividadesId;
	}

	public long getCronogramaEvaluacionPersonalId() {
		return _cronogramaEvaluacionPersonalId;
	}

	public void setCronogramaEvaluacionPersonalId(
		long cronogramaEvaluacionPersonalId) {
		_cronogramaEvaluacionPersonalId = cronogramaEvaluacionPersonalId;
	}

	public Date getFechacreamodifica() {
		return _fechacreamodifica;
	}

	public void setFechacreamodifica(Date fechacreamodifica) {
		_fechacreamodifica = fechacreamodifica;
	}

	public Date getFechaInicioEvaluacion() {
		return _fechaInicioEvaluacion;
	}

	public void setFechaInicioEvaluacion(Date fechaInicioEvaluacion) {
		_fechaInicioEvaluacion = fechaInicioEvaluacion;
	}

	public Date getFechaFinEvaluacion() {
		return _fechaFinEvaluacion;
	}

	public void setFechaFinEvaluacion(Date fechaFinEvaluacion) {
		_fechaFinEvaluacion = fechaFinEvaluacion;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
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

	private long _actividadesId;
	private long _cronogramaEvaluacionPersonalId;
	private Date _fechacreamodifica;
	private Date _fechaInicioEvaluacion;
	private Date _fechaFinEvaluacion;
	private String _descripcion;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
}
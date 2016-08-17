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
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.ObservacionesServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.ObservacionesServiceSoap
 * @generated
 */
public class ObservacionesSoap implements Serializable {
	public static ObservacionesSoap toSoapModel(Observaciones model) {
		ObservacionesSoap soapModel = new ObservacionesSoap();

		soapModel.setObservacionId(model.getObservacionId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setTabla(model.getTabla());
		soapModel.setRegistroId(model.getRegistroId());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static ObservacionesSoap[] toSoapModels(Observaciones[] models) {
		ObservacionesSoap[] soapModels = new ObservacionesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ObservacionesSoap[][] toSoapModels(Observaciones[][] models) {
		ObservacionesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ObservacionesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ObservacionesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ObservacionesSoap[] toSoapModels(List<Observaciones> models) {
		List<ObservacionesSoap> soapModels = new ArrayList<ObservacionesSoap>(models.size());

		for (Observaciones model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ObservacionesSoap[soapModels.size()]);
	}

	public ObservacionesSoap() {
	}

	public long getPrimaryKey() {
		return _observacionId;
	}

	public void setPrimaryKey(long pk) {
		setObservacionId(pk);
	}

	public long getObservacionId() {
		return _observacionId;
	}

	public void setObservacionId(long observacionId) {
		_observacionId = observacionId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public String getTabla() {
		return _tabla;
	}

	public void setTabla(String tabla) {
		_tabla = tabla;
	}

	public long getRegistroId() {
		return _registroId;
	}

	public void setRegistroId(long registroId) {
		_registroId = registroId;
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

	private long _observacionId;
	private String _descripcion;
	private String _tabla;
	private long _registroId;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
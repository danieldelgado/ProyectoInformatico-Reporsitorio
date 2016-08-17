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
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.LogOperacionesServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.LogOperacionesServiceSoap
 * @generated
 */
public class LogOperacionesSoap implements Serializable {
	public static LogOperacionesSoap toSoapModel(LogOperaciones model) {
		LogOperacionesSoap soapModel = new LogOperacionesSoap();

		soapModel.setLogOperacionesId(model.getLogOperacionesId());
		soapModel.setTipoActividad(model.getTipoActividad());
		soapModel.setActividad(model.getActividad());
		soapModel.setUsuario(model.getUsuario());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static LogOperacionesSoap[] toSoapModels(LogOperaciones[] models) {
		LogOperacionesSoap[] soapModels = new LogOperacionesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LogOperacionesSoap[][] toSoapModels(LogOperaciones[][] models) {
		LogOperacionesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LogOperacionesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LogOperacionesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LogOperacionesSoap[] toSoapModels(List<LogOperaciones> models) {
		List<LogOperacionesSoap> soapModels = new ArrayList<LogOperacionesSoap>(models.size());

		for (LogOperaciones model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LogOperacionesSoap[soapModels.size()]);
	}

	public LogOperacionesSoap() {
	}

	public long getPrimaryKey() {
		return _logOperacionesId;
	}

	public void setPrimaryKey(long pk) {
		setLogOperacionesId(pk);
	}

	public long getLogOperacionesId() {
		return _logOperacionesId;
	}

	public void setLogOperacionesId(long logOperacionesId) {
		_logOperacionesId = logOperacionesId;
	}

	public long getTipoActividad() {
		return _tipoActividad;
	}

	public void setTipoActividad(long tipoActividad) {
		_tipoActividad = tipoActividad;
	}

	public String getActividad() {
		return _actividad;
	}

	public void setActividad(String actividad) {
		_actividad = actividad;
	}

	public String getUsuario() {
		return _usuario;
	}

	public void setUsuario(String usuario) {
		_usuario = usuario;
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

	private long _logOperacionesId;
	private long _tipoActividad;
	private String _actividad;
	private String _usuario;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
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

import com.hitss.layer.service.persistence.RegistrarActividadPlanUsuarioPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.RegistrarActividadPlanUsuarioServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.RegistrarActividadPlanUsuarioServiceSoap
 * @generated
 */
public class RegistrarActividadPlanUsuarioSoap implements Serializable {
	public static RegistrarActividadPlanUsuarioSoap toSoapModel(
		RegistrarActividadPlanUsuario model) {
		RegistrarActividadPlanUsuarioSoap soapModel = new RegistrarActividadPlanUsuarioSoap();

		soapModel.setActividadPlanId(model.getActividadPlanId());
		soapModel.setRegisitrarActividadPlanUsuariocoId(model.getRegisitrarActividadPlanUsuariocoId());
		soapModel.setUsuarioId(model.getUsuarioId());
		soapModel.setCumplio(model.getCumplio());
		soapModel.setActividad(model.getActividad());
		soapModel.setPuntuacion(model.getPuntuacion());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static RegistrarActividadPlanUsuarioSoap[] toSoapModels(
		RegistrarActividadPlanUsuario[] models) {
		RegistrarActividadPlanUsuarioSoap[] soapModels = new RegistrarActividadPlanUsuarioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RegistrarActividadPlanUsuarioSoap[][] toSoapModels(
		RegistrarActividadPlanUsuario[][] models) {
		RegistrarActividadPlanUsuarioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RegistrarActividadPlanUsuarioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RegistrarActividadPlanUsuarioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RegistrarActividadPlanUsuarioSoap[] toSoapModels(
		List<RegistrarActividadPlanUsuario> models) {
		List<RegistrarActividadPlanUsuarioSoap> soapModels = new ArrayList<RegistrarActividadPlanUsuarioSoap>(models.size());

		for (RegistrarActividadPlanUsuario model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RegistrarActividadPlanUsuarioSoap[soapModels.size()]);
	}

	public RegistrarActividadPlanUsuarioSoap() {
	}

	public RegistrarActividadPlanUsuarioPK getPrimaryKey() {
		return new RegistrarActividadPlanUsuarioPK(_actividadPlanId,
			_regisitrarActividadPlanUsuariocoId);
	}

	public void setPrimaryKey(RegistrarActividadPlanUsuarioPK pk) {
		setActividadPlanId(pk.actividadPlanId);
		setRegisitrarActividadPlanUsuariocoId(pk.regisitrarActividadPlanUsuariocoId);
	}

	public long getActividadPlanId() {
		return _actividadPlanId;
	}

	public void setActividadPlanId(long actividadPlanId) {
		_actividadPlanId = actividadPlanId;
	}

	public long getRegisitrarActividadPlanUsuariocoId() {
		return _regisitrarActividadPlanUsuariocoId;
	}

	public void setRegisitrarActividadPlanUsuariocoId(
		long regisitrarActividadPlanUsuariocoId) {
		_regisitrarActividadPlanUsuariocoId = regisitrarActividadPlanUsuariocoId;
	}

	public long getUsuarioId() {
		return _usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		_usuarioId = usuarioId;
	}

	public long getCumplio() {
		return _cumplio;
	}

	public void setCumplio(long cumplio) {
		_cumplio = cumplio;
	}

	public String getActividad() {
		return _actividad;
	}

	public void setActividad(String actividad) {
		_actividad = actividad;
	}

	public int getPuntuacion() {
		return _puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		_puntuacion = puntuacion;
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

	private long _actividadPlanId;
	private long _regisitrarActividadPlanUsuariocoId;
	private long _usuarioId;
	private long _cumplio;
	private String _actividad;
	private int _puntuacion;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
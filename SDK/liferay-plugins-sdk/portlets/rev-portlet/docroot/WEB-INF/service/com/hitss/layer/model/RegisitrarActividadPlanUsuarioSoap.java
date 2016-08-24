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

import com.hitss.layer.service.persistence.RegisitrarActividadPlanUsuarioPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.RegisitrarActividadPlanUsuarioServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.RegisitrarActividadPlanUsuarioServiceSoap
 * @generated
 */
public class RegisitrarActividadPlanUsuarioSoap implements Serializable {
	public static RegisitrarActividadPlanUsuarioSoap toSoapModel(
		RegisitrarActividadPlanUsuario model) {
		RegisitrarActividadPlanUsuarioSoap soapModel = new RegisitrarActividadPlanUsuarioSoap();

		soapModel.setActividadPlanId(model.getActividadPlanId());
		soapModel.setRegisitrarActividadPlanUsuariocoId(model.getRegisitrarActividadPlanUsuariocoId());
		soapModel.setUsuarioId(model.getUsuarioId());
		soapModel.setCumplio(model.getCumplio());
		soapModel.setActividad(model.getActividad());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static RegisitrarActividadPlanUsuarioSoap[] toSoapModels(
		RegisitrarActividadPlanUsuario[] models) {
		RegisitrarActividadPlanUsuarioSoap[] soapModels = new RegisitrarActividadPlanUsuarioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RegisitrarActividadPlanUsuarioSoap[][] toSoapModels(
		RegisitrarActividadPlanUsuario[][] models) {
		RegisitrarActividadPlanUsuarioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RegisitrarActividadPlanUsuarioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RegisitrarActividadPlanUsuarioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RegisitrarActividadPlanUsuarioSoap[] toSoapModels(
		List<RegisitrarActividadPlanUsuario> models) {
		List<RegisitrarActividadPlanUsuarioSoap> soapModels = new ArrayList<RegisitrarActividadPlanUsuarioSoap>(models.size());

		for (RegisitrarActividadPlanUsuario model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RegisitrarActividadPlanUsuarioSoap[soapModels.size()]);
	}

	public RegisitrarActividadPlanUsuarioSoap() {
	}

	public RegisitrarActividadPlanUsuarioPK getPrimaryKey() {
		return new RegisitrarActividadPlanUsuarioPK(_actividadPlanId,
			_regisitrarActividadPlanUsuariocoId);
	}

	public void setPrimaryKey(RegisitrarActividadPlanUsuarioPK pk) {
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
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
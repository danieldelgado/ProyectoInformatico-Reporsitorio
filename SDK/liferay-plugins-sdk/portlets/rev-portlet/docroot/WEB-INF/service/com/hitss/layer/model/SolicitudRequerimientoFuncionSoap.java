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

import com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.SolicitudRequerimientoFuncionServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.SolicitudRequerimientoFuncionServiceSoap
 * @generated
 */
public class SolicitudRequerimientoFuncionSoap implements Serializable {
	public static SolicitudRequerimientoFuncionSoap toSoapModel(
		SolicitudRequerimientoFuncion model) {
		SolicitudRequerimientoFuncionSoap soapModel = new SolicitudRequerimientoFuncionSoap();

		soapModel.setSolicitudFuncionId(model.getSolicitudFuncionId());
		soapModel.setFuncionId(model.getFuncionId());
		soapModel.setExigible(model.getExigible());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static SolicitudRequerimientoFuncionSoap[] toSoapModels(
		SolicitudRequerimientoFuncion[] models) {
		SolicitudRequerimientoFuncionSoap[] soapModels = new SolicitudRequerimientoFuncionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SolicitudRequerimientoFuncionSoap[][] toSoapModels(
		SolicitudRequerimientoFuncion[][] models) {
		SolicitudRequerimientoFuncionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SolicitudRequerimientoFuncionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SolicitudRequerimientoFuncionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SolicitudRequerimientoFuncionSoap[] toSoapModels(
		List<SolicitudRequerimientoFuncion> models) {
		List<SolicitudRequerimientoFuncionSoap> soapModels = new ArrayList<SolicitudRequerimientoFuncionSoap>(models.size());

		for (SolicitudRequerimientoFuncion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SolicitudRequerimientoFuncionSoap[soapModels.size()]);
	}

	public SolicitudRequerimientoFuncionSoap() {
	}

	public SolicitudRequerimientoFuncionPK getPrimaryKey() {
		return new SolicitudRequerimientoFuncionPK(_solicitudFuncionId,
			_funcionId);
	}

	public void setPrimaryKey(SolicitudRequerimientoFuncionPK pk) {
		setSolicitudFuncionId(pk.solicitudFuncionId);
		setFuncionId(pk.funcionId);
	}

	public long getSolicitudFuncionId() {
		return _solicitudFuncionId;
	}

	public void setSolicitudFuncionId(long solicitudFuncionId) {
		_solicitudFuncionId = solicitudFuncionId;
	}

	public long getFuncionId() {
		return _funcionId;
	}

	public void setFuncionId(long funcionId) {
		_funcionId = funcionId;
	}

	public boolean getExigible() {
		return _exigible;
	}

	public boolean isExigible() {
		return _exigible;
	}

	public void setExigible(boolean exigible) {
		_exigible = exigible;
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

	private long _solicitudFuncionId;
	private long _funcionId;
	private boolean _exigible;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
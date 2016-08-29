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

import com.hitss.layer.service.persistence.FichaIngresoPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.FichaIngresoServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.FichaIngresoServiceSoap
 * @generated
 */
public class FichaIngresoSoap implements Serializable {
	public static FichaIngresoSoap toSoapModel(FichaIngreso model) {
		FichaIngresoSoap soapModel = new FichaIngresoSoap();

		soapModel.setFichaingresoId(model.getFichaingresoId());
		soapModel.setSolicitudRequerimientoId(model.getSolicitudRequerimientoId());
		soapModel.setUserId(model.getUserId());
		soapModel.setEquipoTecnico(model.getEquipoTecnico());
		soapModel.setReemplazo(model.getReemplazo());
		soapModel.setAprobacionFichaIngresoCapitalHumano(model.getAprobacionFichaIngresoCapitalHumano());
		soapModel.setAprobacionFichaIngresoOperaciones(model.getAprobacionFichaIngresoOperaciones());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static FichaIngresoSoap[] toSoapModels(FichaIngreso[] models) {
		FichaIngresoSoap[] soapModels = new FichaIngresoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FichaIngresoSoap[][] toSoapModels(FichaIngreso[][] models) {
		FichaIngresoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FichaIngresoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FichaIngresoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FichaIngresoSoap[] toSoapModels(List<FichaIngreso> models) {
		List<FichaIngresoSoap> soapModels = new ArrayList<FichaIngresoSoap>(models.size());

		for (FichaIngreso model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FichaIngresoSoap[soapModels.size()]);
	}

	public FichaIngresoSoap() {
	}

	public FichaIngresoPK getPrimaryKey() {
		return new FichaIngresoPK(_fichaingresoId, _solicitudRequerimientoId);
	}

	public void setPrimaryKey(FichaIngresoPK pk) {
		setFichaingresoId(pk.fichaingresoId);
		setSolicitudRequerimientoId(pk.solicitudRequerimientoId);
	}

	public long getFichaingresoId() {
		return _fichaingresoId;
	}

	public void setFichaingresoId(long fichaingresoId) {
		_fichaingresoId = fichaingresoId;
	}

	public long getSolicitudRequerimientoId() {
		return _solicitudRequerimientoId;
	}

	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_solicitudRequerimientoId = solicitudRequerimientoId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public boolean getEquipoTecnico() {
		return _equipoTecnico;
	}

	public boolean isEquipoTecnico() {
		return _equipoTecnico;
	}

	public void setEquipoTecnico(boolean equipoTecnico) {
		_equipoTecnico = equipoTecnico;
	}

	public boolean getReemplazo() {
		return _reemplazo;
	}

	public boolean isReemplazo() {
		return _reemplazo;
	}

	public void setReemplazo(boolean reemplazo) {
		_reemplazo = reemplazo;
	}

	public boolean getAprobacionFichaIngresoCapitalHumano() {
		return _aprobacionFichaIngresoCapitalHumano;
	}

	public boolean isAprobacionFichaIngresoCapitalHumano() {
		return _aprobacionFichaIngresoCapitalHumano;
	}

	public void setAprobacionFichaIngresoCapitalHumano(
		boolean aprobacionFichaIngresoCapitalHumano) {
		_aprobacionFichaIngresoCapitalHumano = aprobacionFichaIngresoCapitalHumano;
	}

	public boolean getAprobacionFichaIngresoOperaciones() {
		return _aprobacionFichaIngresoOperaciones;
	}

	public boolean isAprobacionFichaIngresoOperaciones() {
		return _aprobacionFichaIngresoOperaciones;
	}

	public void setAprobacionFichaIngresoOperaciones(
		boolean aprobacionFichaIngresoOperaciones) {
		_aprobacionFichaIngresoOperaciones = aprobacionFichaIngresoOperaciones;
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

	private long _fichaingresoId;
	private long _solicitudRequerimientoId;
	private long _userId;
	private boolean _equipoTecnico;
	private boolean _reemplazo;
	private boolean _aprobacionFichaIngresoCapitalHumano;
	private boolean _aprobacionFichaIngresoOperaciones;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
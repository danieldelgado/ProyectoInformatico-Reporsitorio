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
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.PrioridadGrupoUsuariosServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.PrioridadGrupoUsuariosServiceSoap
 * @generated
 */
public class PrioridadGrupoUsuariosSoap implements Serializable {
	public static PrioridadGrupoUsuariosSoap toSoapModel(
		PrioridadGrupoUsuarios model) {
		PrioridadGrupoUsuariosSoap soapModel = new PrioridadGrupoUsuariosSoap();

		soapModel.setPrioridadGrupoUsuariosId(model.getPrioridadGrupoUsuariosId());
		soapModel.setSolicitudEvaluacionDesempennoId(model.getSolicitudEvaluacionDesempennoId());
		soapModel.setResponsableGrupo(model.getResponsableGrupo());
		soapModel.setGrupoUsuario(model.getGrupoUsuario());
		soapModel.setOrden(model.getOrden());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static PrioridadGrupoUsuariosSoap[] toSoapModels(
		PrioridadGrupoUsuarios[] models) {
		PrioridadGrupoUsuariosSoap[] soapModels = new PrioridadGrupoUsuariosSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PrioridadGrupoUsuariosSoap[][] toSoapModels(
		PrioridadGrupoUsuarios[][] models) {
		PrioridadGrupoUsuariosSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PrioridadGrupoUsuariosSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PrioridadGrupoUsuariosSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PrioridadGrupoUsuariosSoap[] toSoapModels(
		List<PrioridadGrupoUsuarios> models) {
		List<PrioridadGrupoUsuariosSoap> soapModels = new ArrayList<PrioridadGrupoUsuariosSoap>(models.size());

		for (PrioridadGrupoUsuarios model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PrioridadGrupoUsuariosSoap[soapModels.size()]);
	}

	public PrioridadGrupoUsuariosSoap() {
	}

	public long getPrimaryKey() {
		return _prioridadGrupoUsuariosId;
	}

	public void setPrimaryKey(long pk) {
		setPrioridadGrupoUsuariosId(pk);
	}

	public long getPrioridadGrupoUsuariosId() {
		return _prioridadGrupoUsuariosId;
	}

	public void setPrioridadGrupoUsuariosId(long prioridadGrupoUsuariosId) {
		_prioridadGrupoUsuariosId = prioridadGrupoUsuariosId;
	}

	public long getSolicitudEvaluacionDesempennoId() {
		return _solicitudEvaluacionDesempennoId;
	}

	public void setSolicitudEvaluacionDesempennoId(
		long solicitudEvaluacionDesempennoId) {
		_solicitudEvaluacionDesempennoId = solicitudEvaluacionDesempennoId;
	}

	public String getResponsableGrupo() {
		return _responsableGrupo;
	}

	public void setResponsableGrupo(String responsableGrupo) {
		_responsableGrupo = responsableGrupo;
	}

	public String getGrupoUsuario() {
		return _grupoUsuario;
	}

	public void setGrupoUsuario(String grupoUsuario) {
		_grupoUsuario = grupoUsuario;
	}

	public int getOrden() {
		return _orden;
	}

	public void setOrden(int orden) {
		_orden = orden;
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

	private long _prioridadGrupoUsuariosId;
	private long _solicitudEvaluacionDesempennoId;
	private String _responsableGrupo;
	private String _grupoUsuario;
	private int _orden;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
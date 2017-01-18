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

import com.hitss.layer.service.persistence.ContratoPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.ContratoServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.ContratoServiceSoap
 * @generated
 */
public class ContratoSoap implements Serializable {
	public static ContratoSoap toSoapModel(Contrato model) {
		ContratoSoap soapModel = new ContratoSoap();

		soapModel.setContratoId(model.getContratoId());
		soapModel.setUsuarioId(model.getUsuarioId());
		soapModel.setMotivo(model.getMotivo());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setTitulo(model.getTitulo());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static ContratoSoap[] toSoapModels(Contrato[] models) {
		ContratoSoap[] soapModels = new ContratoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ContratoSoap[][] toSoapModels(Contrato[][] models) {
		ContratoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ContratoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ContratoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ContratoSoap[] toSoapModels(List<Contrato> models) {
		List<ContratoSoap> soapModels = new ArrayList<ContratoSoap>(models.size());

		for (Contrato model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ContratoSoap[soapModels.size()]);
	}

	public ContratoSoap() {
	}

	public ContratoPK getPrimaryKey() {
		return new ContratoPK(_contratoId, _usuarioId);
	}

	public void setPrimaryKey(ContratoPK pk) {
		setContratoId(pk.contratoId);
		setUsuarioId(pk.usuarioId);
	}

	public long getContratoId() {
		return _contratoId;
	}

	public void setContratoId(long contratoId) {
		_contratoId = contratoId;
	}

	public long getUsuarioId() {
		return _usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		_usuarioId = usuarioId;
	}

	public String getMotivo() {
		return _motivo;
	}

	public void setMotivo(String motivo) {
		_motivo = motivo;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public String getTitulo() {
		return _titulo;
	}

	public void setTitulo(String titulo) {
		_titulo = titulo;
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

	private long _contratoId;
	private long _usuarioId;
	private String _motivo;
	private String _descripcion;
	private String _titulo;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.ContratoServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.ContratoServiceSoap
 * @generated
 */
public class ContratoSoap implements Serializable {
	public static ContratoSoap toSoapModel(Contrato model) {
		ContratoSoap soapModel = new ContratoSoap();

		soapModel.setContratoId(model.getContratoId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setFechaEmitida(model.getFechaEmitida());
		soapModel.setTitulo(model.getTitulo());
		soapModel.setMotivo(model.getMotivo());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());
		soapModel.setUsuarioHitssId(model.getUsuarioHitssId());

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

	public long getPrimaryKey() {
		return _contratoId;
	}

	public void setPrimaryKey(long pk) {
		setContratoId(pk);
	}

	public long getContratoId() {
		return _contratoId;
	}

	public void setContratoId(long contratoId) {
		_contratoId = contratoId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public Date getFechaEmitida() {
		return _fechaEmitida;
	}

	public void setFechaEmitida(Date fechaEmitida) {
		_fechaEmitida = fechaEmitida;
	}

	public boolean getTitulo() {
		return _Titulo;
	}

	public boolean isTitulo() {
		return _Titulo;
	}

	public void setTitulo(boolean Titulo) {
		_Titulo = Titulo;
	}

	public String getMotivo() {
		return _Motivo;
	}

	public void setMotivo(String Motivo) {
		_Motivo = Motivo;
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

	public long getUsuarioHitssId() {
		return _usuarioHitssId;
	}

	public void setUsuarioHitssId(long usuarioHitssId) {
		_usuarioHitssId = usuarioHitssId;
	}

	private long _contratoId;
	private String _descripcion;
	private Date _fechaEmitida;
	private boolean _Titulo;
	private String _Motivo;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private long _usuarioHitssId;
}
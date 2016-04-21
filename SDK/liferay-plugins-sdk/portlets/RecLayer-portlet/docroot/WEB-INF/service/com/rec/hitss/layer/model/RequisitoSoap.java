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
 * This class is used by SOAP remote services.
 *
 * @author Crossfire
 * @generated
 */
public class RequisitoSoap implements Serializable {
	public static RequisitoSoap toSoapModel(Requisito model) {
		RequisitoSoap soapModel = new RequisitoSoap();

		soapModel.setRequisitoId(model.getRequisitoId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setNivel(model.getNivel());
		soapModel.setExigible(model.getExigible());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());
		soapModel.setSolicitudRequerimientoPersonalId(model.getSolicitudRequerimientoPersonalId());

		return soapModel;
	}

	public static RequisitoSoap[] toSoapModels(Requisito[] models) {
		RequisitoSoap[] soapModels = new RequisitoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RequisitoSoap[][] toSoapModels(Requisito[][] models) {
		RequisitoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RequisitoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RequisitoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RequisitoSoap[] toSoapModels(List<Requisito> models) {
		List<RequisitoSoap> soapModels = new ArrayList<RequisitoSoap>(models.size());

		for (Requisito model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RequisitoSoap[soapModels.size()]);
	}

	public RequisitoSoap() {
	}

	public long getPrimaryKey() {
		return _requisitoId;
	}

	public void setPrimaryKey(long pk) {
		setRequisitoId(pk);
	}

	public long getRequisitoId() {
		return _requisitoId;
	}

	public void setRequisitoId(long requisitoId) {
		_requisitoId = requisitoId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public long getNivel() {
		return _nivel;
	}

	public void setNivel(long nivel) {
		_nivel = nivel;
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

	public Date getFechacreamodifica() {
		return _fechacreamodifica;
	}

	public void setFechacreamodifica(Date fechacreamodifica) {
		_fechacreamodifica = fechacreamodifica;
	}

	public long getSolicitudRequerimientoPersonalId() {
		return _solicitudRequerimientoPersonalId;
	}

	public void setSolicitudRequerimientoPersonalId(
		long solicitudRequerimientoPersonalId) {
		_solicitudRequerimientoPersonalId = solicitudRequerimientoPersonalId;
	}

	private long _requisitoId;
	private String _descripcion;
	private long _nivel;
	private boolean _exigible;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private long _solicitudRequerimientoPersonalId;
}
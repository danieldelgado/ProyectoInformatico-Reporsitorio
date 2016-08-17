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

import com.hitss.layer.service.persistence.UsuarioRequisitoPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.UsuarioRequisitoServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.UsuarioRequisitoServiceSoap
 * @generated
 */
public class UsuarioRequisitoSoap implements Serializable {
	public static UsuarioRequisitoSoap toSoapModel(UsuarioRequisito model) {
		UsuarioRequisitoSoap soapModel = new UsuarioRequisitoSoap();

		soapModel.setUserId(model.getUserId());
		soapModel.setTagId(model.getTagId());
		soapModel.setNivel(model.getNivel());
		soapModel.setExigible(model.getExigible());
		soapModel.setTipoRequisito(model.getTipoRequisito());
		soapModel.setHerramienta(model.getHerramienta());
		soapModel.setCumplerequisito(model.getCumplerequisito());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static UsuarioRequisitoSoap[] toSoapModels(UsuarioRequisito[] models) {
		UsuarioRequisitoSoap[] soapModels = new UsuarioRequisitoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UsuarioRequisitoSoap[][] toSoapModels(
		UsuarioRequisito[][] models) {
		UsuarioRequisitoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UsuarioRequisitoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UsuarioRequisitoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UsuarioRequisitoSoap[] toSoapModels(
		List<UsuarioRequisito> models) {
		List<UsuarioRequisitoSoap> soapModels = new ArrayList<UsuarioRequisitoSoap>(models.size());

		for (UsuarioRequisito model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UsuarioRequisitoSoap[soapModels.size()]);
	}

	public UsuarioRequisitoSoap() {
	}

	public UsuarioRequisitoPK getPrimaryKey() {
		return new UsuarioRequisitoPK(_userId, _tagId);
	}

	public void setPrimaryKey(UsuarioRequisitoPK pk) {
		setUserId(pk.userId);
		setTagId(pk.tagId);
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getTagId() {
		return _tagId;
	}

	public void setTagId(long tagId) {
		_tagId = tagId;
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

	public long getTipoRequisito() {
		return _tipoRequisito;
	}

	public void setTipoRequisito(long tipoRequisito) {
		_tipoRequisito = tipoRequisito;
	}

	public long getHerramienta() {
		return _herramienta;
	}

	public void setHerramienta(long herramienta) {
		_herramienta = herramienta;
	}

	public boolean getCumplerequisito() {
		return _cumplerequisito;
	}

	public boolean isCumplerequisito() {
		return _cumplerequisito;
	}

	public void setCumplerequisito(boolean cumplerequisito) {
		_cumplerequisito = cumplerequisito;
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

	private long _userId;
	private long _tagId;
	private long _nivel;
	private boolean _exigible;
	private long _tipoRequisito;
	private long _herramienta;
	private boolean _cumplerequisito;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
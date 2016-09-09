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

import com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.SolicitudRequerimientoRequisitoServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.SolicitudRequerimientoRequisitoServiceSoap
 * @generated
 */
public class SolicitudRequerimientoRequisitoSoap implements Serializable {
	public static SolicitudRequerimientoRequisitoSoap toSoapModel(
		SolicitudRequerimientoRequisito model) {
		SolicitudRequerimientoRequisitoSoap soapModel = new SolicitudRequerimientoRequisitoSoap();

		soapModel.setSolicitudRequerimientoId(model.getSolicitudRequerimientoId());
		soapModel.setTagId(model.getTagId());
		soapModel.setAnnos(model.getAnnos());
		soapModel.setExigible(model.getExigible());
		soapModel.setTipoRequisito(model.getTipoRequisito());
		soapModel.setHerramienta(model.getHerramienta());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static SolicitudRequerimientoRequisitoSoap[] toSoapModels(
		SolicitudRequerimientoRequisito[] models) {
		SolicitudRequerimientoRequisitoSoap[] soapModels = new SolicitudRequerimientoRequisitoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SolicitudRequerimientoRequisitoSoap[][] toSoapModels(
		SolicitudRequerimientoRequisito[][] models) {
		SolicitudRequerimientoRequisitoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SolicitudRequerimientoRequisitoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SolicitudRequerimientoRequisitoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SolicitudRequerimientoRequisitoSoap[] toSoapModels(
		List<SolicitudRequerimientoRequisito> models) {
		List<SolicitudRequerimientoRequisitoSoap> soapModels = new ArrayList<SolicitudRequerimientoRequisitoSoap>(models.size());

		for (SolicitudRequerimientoRequisito model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SolicitudRequerimientoRequisitoSoap[soapModels.size()]);
	}

	public SolicitudRequerimientoRequisitoSoap() {
	}

	public SolicitudRequerimientoRequisitoPK getPrimaryKey() {
		return new SolicitudRequerimientoRequisitoPK(_solicitudRequerimientoId,
			_tagId);
	}

	public void setPrimaryKey(SolicitudRequerimientoRequisitoPK pk) {
		setSolicitudRequerimientoId(pk.solicitudRequerimientoId);
		setTagId(pk.tagId);
	}

	public long getSolicitudRequerimientoId() {
		return _solicitudRequerimientoId;
	}

	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_solicitudRequerimientoId = solicitudRequerimientoId;
	}

	public long getTagId() {
		return _tagId;
	}

	public void setTagId(long tagId) {
		_tagId = tagId;
	}

	public long getAnnos() {
		return _annos;
	}

	public void setAnnos(long annos) {
		_annos = annos;
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

	private long _solicitudRequerimientoId;
	private long _tagId;
	private long _annos;
	private boolean _exigible;
	private long _tipoRequisito;
	private long _herramienta;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
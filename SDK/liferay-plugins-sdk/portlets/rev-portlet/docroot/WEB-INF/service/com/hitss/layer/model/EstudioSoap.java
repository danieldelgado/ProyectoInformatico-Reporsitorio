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

import com.hitss.layer.service.persistence.EstudioPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.EstudioServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.EstudioServiceSoap
 * @generated
 */
public class EstudioSoap implements Serializable {
	public static EstudioSoap toSoapModel(Estudio model) {
		EstudioSoap soapModel = new EstudioSoap();

		soapModel.setEstudioId(model.getEstudioId());
		soapModel.setUsuarioId(model.getUsuarioId());
		soapModel.setNombre(model.getNombre());
		soapModel.setAnnos(model.getAnnos());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static EstudioSoap[] toSoapModels(Estudio[] models) {
		EstudioSoap[] soapModels = new EstudioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EstudioSoap[][] toSoapModels(Estudio[][] models) {
		EstudioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EstudioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EstudioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EstudioSoap[] toSoapModels(List<Estudio> models) {
		List<EstudioSoap> soapModels = new ArrayList<EstudioSoap>(models.size());

		for (Estudio model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EstudioSoap[soapModels.size()]);
	}

	public EstudioSoap() {
	}

	public EstudioPK getPrimaryKey() {
		return new EstudioPK(_estudioId, _usuarioId);
	}

	public void setPrimaryKey(EstudioPK pk) {
		setEstudioId(pk.estudioId);
		setUsuarioId(pk.usuarioId);
	}

	public long getEstudioId() {
		return _estudioId;
	}

	public void setEstudioId(long estudioId) {
		_estudioId = estudioId;
	}

	public long getUsuarioId() {
		return _usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		_usuarioId = usuarioId;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public long getAnnos() {
		return _annos;
	}

	public void setAnnos(long annos) {
		_annos = annos;
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

	private long _estudioId;
	private long _usuarioId;
	private String _nombre;
	private long _annos;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
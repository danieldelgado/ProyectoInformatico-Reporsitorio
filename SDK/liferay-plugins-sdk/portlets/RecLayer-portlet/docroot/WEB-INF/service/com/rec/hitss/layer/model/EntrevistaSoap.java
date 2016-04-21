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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.EntrevistaServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.EntrevistaServiceSoap
 * @generated
 */
public class EntrevistaSoap implements Serializable {
	public static EntrevistaSoap toSoapModel(Entrevista model) {
		EntrevistaSoap soapModel = new EntrevistaSoap();

		soapModel.setEntrevistaId(model.getEntrevistaId());
		soapModel.setUsuarioHitssId(model.getUsuarioHitssId());
		soapModel.setObservacion(model.getObservacion());
		soapModel.setAsistio(model.getAsistio());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static EntrevistaSoap[] toSoapModels(Entrevista[] models) {
		EntrevistaSoap[] soapModels = new EntrevistaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EntrevistaSoap[][] toSoapModels(Entrevista[][] models) {
		EntrevistaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EntrevistaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EntrevistaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EntrevistaSoap[] toSoapModels(List<Entrevista> models) {
		List<EntrevistaSoap> soapModels = new ArrayList<EntrevistaSoap>(models.size());

		for (Entrevista model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EntrevistaSoap[soapModels.size()]);
	}

	public EntrevistaSoap() {
	}

	public long getPrimaryKey() {
		return _entrevistaId;
	}

	public void setPrimaryKey(long pk) {
		setEntrevistaId(pk);
	}

	public long getEntrevistaId() {
		return _entrevistaId;
	}

	public void setEntrevistaId(long entrevistaId) {
		_entrevistaId = entrevistaId;
	}

	public long getUsuarioHitssId() {
		return _usuarioHitssId;
	}

	public void setUsuarioHitssId(long usuarioHitssId) {
		_usuarioHitssId = usuarioHitssId;
	}

	public String getObservacion() {
		return _observacion;
	}

	public void setObservacion(String observacion) {
		_observacion = observacion;
	}

	public boolean getAsistio() {
		return _asistio;
	}

	public boolean isAsistio() {
		return _asistio;
	}

	public void setAsistio(boolean asistio) {
		_asistio = asistio;
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

	private long _entrevistaId;
	private long _usuarioHitssId;
	private String _observacion;
	private boolean _asistio;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
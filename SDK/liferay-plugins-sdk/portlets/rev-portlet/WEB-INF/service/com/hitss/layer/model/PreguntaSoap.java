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
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.PreguntaServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.PreguntaServiceSoap
 * @generated
 */
public class PreguntaSoap implements Serializable {
	public static PreguntaSoap toSoapModel(Pregunta model) {
		PreguntaSoap soapModel = new PreguntaSoap();

		soapModel.setPreguntaId(model.getPreguntaId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static PreguntaSoap[] toSoapModels(Pregunta[] models) {
		PreguntaSoap[] soapModels = new PreguntaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PreguntaSoap[][] toSoapModels(Pregunta[][] models) {
		PreguntaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PreguntaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PreguntaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PreguntaSoap[] toSoapModels(List<Pregunta> models) {
		List<PreguntaSoap> soapModels = new ArrayList<PreguntaSoap>(models.size());

		for (Pregunta model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PreguntaSoap[soapModels.size()]);
	}

	public PreguntaSoap() {
	}

	public long getPrimaryKey() {
		return _preguntaId;
	}

	public void setPrimaryKey(long pk) {
		setPreguntaId(pk);
	}

	public long getPreguntaId() {
		return _preguntaId;
	}

	public void setPreguntaId(long preguntaId) {
		_preguntaId = preguntaId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
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

	private long _preguntaId;
	private String _descripcion;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
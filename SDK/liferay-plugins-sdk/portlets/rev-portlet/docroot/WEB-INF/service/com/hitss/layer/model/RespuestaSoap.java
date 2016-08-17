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
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.RespuestaServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.RespuestaServiceSoap
 * @generated
 */
public class RespuestaSoap implements Serializable {
	public static RespuestaSoap toSoapModel(Respuesta model) {
		RespuestaSoap soapModel = new RespuestaSoap();

		soapModel.setRespuestaId(model.getRespuestaId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setCorrecta(model.getCorrecta());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static RespuestaSoap[] toSoapModels(Respuesta[] models) {
		RespuestaSoap[] soapModels = new RespuestaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RespuestaSoap[][] toSoapModels(Respuesta[][] models) {
		RespuestaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RespuestaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RespuestaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RespuestaSoap[] toSoapModels(List<Respuesta> models) {
		List<RespuestaSoap> soapModels = new ArrayList<RespuestaSoap>(models.size());

		for (Respuesta model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RespuestaSoap[soapModels.size()]);
	}

	public RespuestaSoap() {
	}

	public long getPrimaryKey() {
		return _respuestaId;
	}

	public void setPrimaryKey(long pk) {
		setRespuestaId(pk);
	}

	public long getRespuestaId() {
		return _respuestaId;
	}

	public void setRespuestaId(long respuestaId) {
		_respuestaId = respuestaId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public boolean getCorrecta() {
		return _correcta;
	}

	public boolean isCorrecta() {
		return _correcta;
	}

	public void setCorrecta(boolean correcta) {
		_correcta = correcta;
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

	private long _respuestaId;
	private String _descripcion;
	private boolean _correcta;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
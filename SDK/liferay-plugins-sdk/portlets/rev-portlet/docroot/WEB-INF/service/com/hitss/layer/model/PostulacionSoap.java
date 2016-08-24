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

import com.hitss.layer.service.persistence.PostulacionPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.PostulacionServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.PostulacionServiceSoap
 * @generated
 */
public class PostulacionSoap implements Serializable {
	public static PostulacionSoap toSoapModel(Postulacion model) {
		PostulacionSoap soapModel = new PostulacionSoap();

		soapModel.setSolicitudRequerimientoId(model.getSolicitudRequerimientoId());
		soapModel.setUsuarioId(model.getUsuarioId());
		soapModel.setFechaPostulacion(model.getFechaPostulacion());
		soapModel.setEstado(model.getEstado());
		soapModel.setSeleccionado(model.getSeleccionado());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static PostulacionSoap[] toSoapModels(Postulacion[] models) {
		PostulacionSoap[] soapModels = new PostulacionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PostulacionSoap[][] toSoapModels(Postulacion[][] models) {
		PostulacionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PostulacionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PostulacionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PostulacionSoap[] toSoapModels(List<Postulacion> models) {
		List<PostulacionSoap> soapModels = new ArrayList<PostulacionSoap>(models.size());

		for (Postulacion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PostulacionSoap[soapModels.size()]);
	}

	public PostulacionSoap() {
	}

	public PostulacionPK getPrimaryKey() {
		return new PostulacionPK(_solicitudRequerimientoId, _usuarioId);
	}

	public void setPrimaryKey(PostulacionPK pk) {
		setSolicitudRequerimientoId(pk.solicitudRequerimientoId);
		setUsuarioId(pk.usuarioId);
	}

	public long getSolicitudRequerimientoId() {
		return _solicitudRequerimientoId;
	}

	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_solicitudRequerimientoId = solicitudRequerimientoId;
	}

	public long getUsuarioId() {
		return _usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		_usuarioId = usuarioId;
	}

	public Date getFechaPostulacion() {
		return _fechaPostulacion;
	}

	public void setFechaPostulacion(Date fechaPostulacion) {
		_fechaPostulacion = fechaPostulacion;
	}

	public long getEstado() {
		return _estado;
	}

	public void setEstado(long estado) {
		_estado = estado;
	}

	public boolean getSeleccionado() {
		return _seleccionado;
	}

	public boolean isSeleccionado() {
		return _seleccionado;
	}

	public void setSeleccionado(boolean seleccionado) {
		_seleccionado = seleccionado;
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
	private long _usuarioId;
	private Date _fechaPostulacion;
	private long _estado;
	private boolean _seleccionado;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
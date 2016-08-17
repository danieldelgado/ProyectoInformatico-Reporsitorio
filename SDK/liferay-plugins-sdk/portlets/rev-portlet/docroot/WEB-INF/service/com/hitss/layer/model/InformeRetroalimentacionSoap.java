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
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.InformeRetroalimentacionServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.InformeRetroalimentacionServiceSoap
 * @generated
 */
public class InformeRetroalimentacionSoap implements Serializable {
	public static InformeRetroalimentacionSoap toSoapModel(
		InformeRetroalimentacion model) {
		InformeRetroalimentacionSoap soapModel = new InformeRetroalimentacionSoap();

		soapModel.setInformeRetroalimentacionId(model.getInformeRetroalimentacionId());
		soapModel.setPlanAccionId(model.getPlanAccionId());
		soapModel.setUsuario(model.getUsuario());
		soapModel.setTitulo(model.getTitulo());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static InformeRetroalimentacionSoap[] toSoapModels(
		InformeRetroalimentacion[] models) {
		InformeRetroalimentacionSoap[] soapModels = new InformeRetroalimentacionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InformeRetroalimentacionSoap[][] toSoapModels(
		InformeRetroalimentacion[][] models) {
		InformeRetroalimentacionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InformeRetroalimentacionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InformeRetroalimentacionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InformeRetroalimentacionSoap[] toSoapModels(
		List<InformeRetroalimentacion> models) {
		List<InformeRetroalimentacionSoap> soapModels = new ArrayList<InformeRetroalimentacionSoap>(models.size());

		for (InformeRetroalimentacion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InformeRetroalimentacionSoap[soapModels.size()]);
	}

	public InformeRetroalimentacionSoap() {
	}

	public long getPrimaryKey() {
		return _informeRetroalimentacionId;
	}

	public void setPrimaryKey(long pk) {
		setInformeRetroalimentacionId(pk);
	}

	public long getInformeRetroalimentacionId() {
		return _informeRetroalimentacionId;
	}

	public void setInformeRetroalimentacionId(long informeRetroalimentacionId) {
		_informeRetroalimentacionId = informeRetroalimentacionId;
	}

	public long getPlanAccionId() {
		return _planAccionId;
	}

	public void setPlanAccionId(long planAccionId) {
		_planAccionId = planAccionId;
	}

	public long getUsuario() {
		return _usuario;
	}

	public void setUsuario(long usuario) {
		_usuario = usuario;
	}

	public String getTitulo() {
		return _titulo;
	}

	public void setTitulo(String titulo) {
		_titulo = titulo;
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

	public Date getFechamodifica() {
		return _fechamodifica;
	}

	public void setFechamodifica(Date fechamodifica) {
		_fechamodifica = fechamodifica;
	}

	private long _informeRetroalimentacionId;
	private long _planAccionId;
	private long _usuario;
	private String _titulo;
	private String _descripcion;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
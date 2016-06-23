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
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.FuncionServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.FuncionServiceSoap
 * @generated
 */
public class FuncionSoap implements Serializable {
	public static FuncionSoap toSoapModel(Funcion model) {
		FuncionSoap soapModel = new FuncionSoap();

		soapModel.setFuncionId(model.getFuncionId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setEtiqueta(model.getEtiqueta());
		soapModel.setExigible(model.getExigible());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static FuncionSoap[] toSoapModels(Funcion[] models) {
		FuncionSoap[] soapModels = new FuncionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FuncionSoap[][] toSoapModels(Funcion[][] models) {
		FuncionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FuncionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FuncionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FuncionSoap[] toSoapModels(List<Funcion> models) {
		List<FuncionSoap> soapModels = new ArrayList<FuncionSoap>(models.size());

		for (Funcion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FuncionSoap[soapModels.size()]);
	}

	public FuncionSoap() {
	}

	public long getPrimaryKey() {
		return _funcionId;
	}

	public void setPrimaryKey(long pk) {
		setFuncionId(pk);
	}

	public long getFuncionId() {
		return _funcionId;
	}

	public void setFuncionId(long funcionId) {
		_funcionId = funcionId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public long getEtiqueta() {
		return _etiqueta;
	}

	public void setEtiqueta(long etiqueta) {
		_etiqueta = etiqueta;
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

	private long _funcionId;
	private String _descripcion;
	private long _etiqueta;
	private boolean _exigible;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
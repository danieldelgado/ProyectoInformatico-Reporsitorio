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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.ParametroServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.ParametroServiceSoap
 * @generated
 */
public class ParametroSoap implements Serializable {
	public static ParametroSoap toSoapModel(Parametro model) {
		ParametroSoap soapModel = new ParametroSoap();

		soapModel.setParametroId(model.getParametroId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setLlave(model.getLlave());
		soapModel.setValor(model.getValor());
		soapModel.setParametroPadreId(model.getParametroPadreId());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static ParametroSoap[] toSoapModels(Parametro[] models) {
		ParametroSoap[] soapModels = new ParametroSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ParametroSoap[][] toSoapModels(Parametro[][] models) {
		ParametroSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ParametroSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ParametroSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ParametroSoap[] toSoapModels(List<Parametro> models) {
		List<ParametroSoap> soapModels = new ArrayList<ParametroSoap>(models.size());

		for (Parametro model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ParametroSoap[soapModels.size()]);
	}

	public ParametroSoap() {
	}

	public long getPrimaryKey() {
		return _parametroId;
	}

	public void setPrimaryKey(long pk) {
		setParametroId(pk);
	}

	public long getParametroId() {
		return _parametroId;
	}

	public void setParametroId(long parametroId) {
		_parametroId = parametroId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public String getLlave() {
		return _llave;
	}

	public void setLlave(String llave) {
		_llave = llave;
	}

	public String getValor() {
		return _valor;
	}

	public void setValor(String valor) {
		_valor = valor;
	}

	public long getParametroPadreId() {
		return _parametroPadreId;
	}

	public void setParametroPadreId(long parametroPadreId) {
		_parametroPadreId = parametroPadreId;
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

	private long _parametroId;
	private String _descripcion;
	private String _llave;
	private String _valor;
	private long _parametroPadreId;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
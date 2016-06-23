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
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.ParametroServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.ParametroServiceSoap
 * @generated
 */
public class ParametroSoap implements Serializable {
	public static ParametroSoap toSoapModel(Parametro model) {
		ParametroSoap soapModel = new ParametroSoap();

		soapModel.setParametroId(model.getParametroId());
		soapModel.setParametroIdpadre(model.getParametroIdpadre());
		soapModel.setCodigo(model.getCodigo());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setValor(model.getValor());
		soapModel.setTipodato(model.getTipodato());
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

	public long getParametroIdpadre() {
		return _parametroIdpadre;
	}

	public void setParametroIdpadre(long parametroIdpadre) {
		_parametroIdpadre = parametroIdpadre;
	}

	public String getCodigo() {
		return _codigo;
	}

	public void setCodigo(String codigo) {
		_codigo = codigo;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public String getValor() {
		return _valor;
	}

	public void setValor(String valor) {
		_valor = valor;
	}

	public String getTipodato() {
		return _tipodato;
	}

	public void setTipodato(String tipodato) {
		_tipodato = tipodato;
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
	private long _parametroIdpadre;
	private String _codigo;
	private String _descripcion;
	private String _valor;
	private String _tipodato;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
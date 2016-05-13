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

import com.hitss.layer.service.persistence.ReferenciaPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.ReferenciaServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.ReferenciaServiceSoap
 * @generated
 */
public class ReferenciaSoap implements Serializable {
	public static ReferenciaSoap toSoapModel(Referencia model) {
		ReferenciaSoap soapModel = new ReferenciaSoap();

		soapModel.setReferenciaId(model.getReferenciaId());
		soapModel.setUsuarioId(model.getUsuarioId());
		soapModel.setEmpresa(model.getEmpresa());
		soapModel.setTelefono(model.getTelefono());
		soapModel.setResponsable(model.getResponsable());
		soapModel.setMotivo(model.getMotivo());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static ReferenciaSoap[] toSoapModels(Referencia[] models) {
		ReferenciaSoap[] soapModels = new ReferenciaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ReferenciaSoap[][] toSoapModels(Referencia[][] models) {
		ReferenciaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ReferenciaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ReferenciaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ReferenciaSoap[] toSoapModels(List<Referencia> models) {
		List<ReferenciaSoap> soapModels = new ArrayList<ReferenciaSoap>(models.size());

		for (Referencia model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ReferenciaSoap[soapModels.size()]);
	}

	public ReferenciaSoap() {
	}

	public ReferenciaPK getPrimaryKey() {
		return new ReferenciaPK(_referenciaId, _usuarioId);
	}

	public void setPrimaryKey(ReferenciaPK pk) {
		setReferenciaId(pk.referenciaId);
		setUsuarioId(pk.usuarioId);
	}

	public long getReferenciaId() {
		return _referenciaId;
	}

	public void setReferenciaId(long referenciaId) {
		_referenciaId = referenciaId;
	}

	public long getUsuarioId() {
		return _usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		_usuarioId = usuarioId;
	}

	public String getEmpresa() {
		return _empresa;
	}

	public void setEmpresa(String empresa) {
		_empresa = empresa;
	}

	public String getTelefono() {
		return _telefono;
	}

	public void setTelefono(String telefono) {
		_telefono = telefono;
	}

	public String getResponsable() {
		return _responsable;
	}

	public void setResponsable(String responsable) {
		_responsable = responsable;
	}

	public String getMotivo() {
		return _motivo;
	}

	public void setMotivo(String motivo) {
		_motivo = motivo;
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

	private long _referenciaId;
	private long _usuarioId;
	private String _empresa;
	private String _telefono;
	private String _responsable;
	private String _motivo;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
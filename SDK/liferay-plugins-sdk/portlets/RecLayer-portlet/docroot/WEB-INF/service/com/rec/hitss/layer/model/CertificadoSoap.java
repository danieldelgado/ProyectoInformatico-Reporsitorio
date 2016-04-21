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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.CertificadoServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.CertificadoServiceSoap
 * @generated
 */
public class CertificadoSoap implements Serializable {
	public static CertificadoSoap toSoapModel(Certificado model) {
		CertificadoSoap soapModel = new CertificadoSoap();

		soapModel.setCertificadoId(model.getCertificadoId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setEmpresa(model.getEmpresa());
		soapModel.setCargo(model.getCargo());
		soapModel.setUsuarioHitssId(model.getUsuarioHitssId());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static CertificadoSoap[] toSoapModels(Certificado[] models) {
		CertificadoSoap[] soapModels = new CertificadoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CertificadoSoap[][] toSoapModels(Certificado[][] models) {
		CertificadoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CertificadoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CertificadoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CertificadoSoap[] toSoapModels(List<Certificado> models) {
		List<CertificadoSoap> soapModels = new ArrayList<CertificadoSoap>(models.size());

		for (Certificado model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CertificadoSoap[soapModels.size()]);
	}

	public CertificadoSoap() {
	}

	public long getPrimaryKey() {
		return _certificadoId;
	}

	public void setPrimaryKey(long pk) {
		setCertificadoId(pk);
	}

	public long getCertificadoId() {
		return _certificadoId;
	}

	public void setCertificadoId(long certificadoId) {
		_certificadoId = certificadoId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public String getEmpresa() {
		return _empresa;
	}

	public void setEmpresa(String empresa) {
		_empresa = empresa;
	}

	public String getCargo() {
		return _cargo;
	}

	public void setCargo(String cargo) {
		_cargo = cargo;
	}

	public long getUsuarioHitssId() {
		return _usuarioHitssId;
	}

	public void setUsuarioHitssId(long usuarioHitssId) {
		_usuarioHitssId = usuarioHitssId;
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

	private long _certificadoId;
	private String _descripcion;
	private String _empresa;
	private String _cargo;
	private long _usuarioHitssId;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
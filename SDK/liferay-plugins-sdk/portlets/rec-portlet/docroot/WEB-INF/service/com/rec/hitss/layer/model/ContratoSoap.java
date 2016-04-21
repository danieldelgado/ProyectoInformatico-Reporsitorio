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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.ContratoServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.ContratoServiceSoap
 * @generated
 */
public class ContratoSoap implements Serializable {
	public static ContratoSoap toSoapModel(Contrato model) {
		ContratoSoap soapModel = new ContratoSoap();

		soapModel.setCT_ID(model.getCT_ID());
		soapModel.setCT_ESTADO(model.getCT_ESTADO());
		soapModel.setCT_ACTIVO(model.getCT_ACTIVO());
		soapModel.setCT_USUARIO_CREA(model.getCT_USUARIO_CREA());
		soapModel.setCT_FECHA_CREA(model.getCT_FECHA_CREA());
		soapModel.setCT_USUARIO_MODIFICA(model.getCT_USUARIO_MODIFICA());
		soapModel.setCT_FECHA_MODIFICA(model.getCT_FECHA_MODIFICA());

		return soapModel;
	}

	public static ContratoSoap[] toSoapModels(Contrato[] models) {
		ContratoSoap[] soapModels = new ContratoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ContratoSoap[][] toSoapModels(Contrato[][] models) {
		ContratoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ContratoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ContratoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ContratoSoap[] toSoapModels(List<Contrato> models) {
		List<ContratoSoap> soapModels = new ArrayList<ContratoSoap>(models.size());

		for (Contrato model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ContratoSoap[soapModels.size()]);
	}

	public ContratoSoap() {
	}

	public long getPrimaryKey() {
		return _CT_ID;
	}

	public void setPrimaryKey(long pk) {
		setCT_ID(pk);
	}

	public long getCT_ID() {
		return _CT_ID;
	}

	public void setCT_ID(long CT_ID) {
		_CT_ID = CT_ID;
	}

	public String getCT_ESTADO() {
		return _CT_ESTADO;
	}

	public void setCT_ESTADO(String CT_ESTADO) {
		_CT_ESTADO = CT_ESTADO;
	}

	public String getCT_ACTIVO() {
		return _CT_ACTIVO;
	}

	public void setCT_ACTIVO(String CT_ACTIVO) {
		_CT_ACTIVO = CT_ACTIVO;
	}

	public long getCT_USUARIO_CREA() {
		return _CT_USUARIO_CREA;
	}

	public void setCT_USUARIO_CREA(long CT_USUARIO_CREA) {
		_CT_USUARIO_CREA = CT_USUARIO_CREA;
	}

	public Date getCT_FECHA_CREA() {
		return _CT_FECHA_CREA;
	}

	public void setCT_FECHA_CREA(Date CT_FECHA_CREA) {
		_CT_FECHA_CREA = CT_FECHA_CREA;
	}

	public long getCT_USUARIO_MODIFICA() {
		return _CT_USUARIO_MODIFICA;
	}

	public void setCT_USUARIO_MODIFICA(long CT_USUARIO_MODIFICA) {
		_CT_USUARIO_MODIFICA = CT_USUARIO_MODIFICA;
	}

	public Date getCT_FECHA_MODIFICA() {
		return _CT_FECHA_MODIFICA;
	}

	public void setCT_FECHA_MODIFICA(Date CT_FECHA_MODIFICA) {
		_CT_FECHA_MODIFICA = CT_FECHA_MODIFICA;
	}

	private long _CT_ID;
	private String _CT_ESTADO;
	private String _CT_ACTIVO;
	private long _CT_USUARIO_CREA;
	private Date _CT_FECHA_CREA;
	private long _CT_USUARIO_MODIFICA;
	private Date _CT_FECHA_MODIFICA;
}
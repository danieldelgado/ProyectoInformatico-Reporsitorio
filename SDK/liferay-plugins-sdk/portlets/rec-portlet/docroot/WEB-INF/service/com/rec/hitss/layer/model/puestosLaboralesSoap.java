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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.puestosLaboralesServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.puestosLaboralesServiceSoap
 * @generated
 */
public class puestosLaboralesSoap implements Serializable {
	public static puestosLaboralesSoap toSoapModel(puestosLaborales model) {
		puestosLaboralesSoap soapModel = new puestosLaboralesSoap();

		soapModel.setPL_ID(model.getPL_ID());
		soapModel.setPL_PUESTO(model.getPL_PUESTO());
		soapModel.setPL_ESTADO(model.getPL_ESTADO());
		soapModel.setPL_ACTIVO(model.getPL_ACTIVO());
		soapModel.setPL_USUARIO_CREA(model.getPL_USUARIO_CREA());
		soapModel.setPL_FECHA_CREA(model.getPL_FECHA_CREA());
		soapModel.setPL_USUARIO_MODIFICA(model.getPL_USUARIO_MODIFICA());
		soapModel.setPL_FECHA_MODIFICA(model.getPL_FECHA_MODIFICA());

		return soapModel;
	}

	public static puestosLaboralesSoap[] toSoapModels(puestosLaborales[] models) {
		puestosLaboralesSoap[] soapModels = new puestosLaboralesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static puestosLaboralesSoap[][] toSoapModels(
		puestosLaborales[][] models) {
		puestosLaboralesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new puestosLaboralesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new puestosLaboralesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static puestosLaboralesSoap[] toSoapModels(
		List<puestosLaborales> models) {
		List<puestosLaboralesSoap> soapModels = new ArrayList<puestosLaboralesSoap>(models.size());

		for (puestosLaborales model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new puestosLaboralesSoap[soapModels.size()]);
	}

	public puestosLaboralesSoap() {
	}

	public long getPrimaryKey() {
		return _PL_ID;
	}

	public void setPrimaryKey(long pk) {
		setPL_ID(pk);
	}

	public long getPL_ID() {
		return _PL_ID;
	}

	public void setPL_ID(long PL_ID) {
		_PL_ID = PL_ID;
	}

	public String getPL_PUESTO() {
		return _PL_PUESTO;
	}

	public void setPL_PUESTO(String PL_PUESTO) {
		_PL_PUESTO = PL_PUESTO;
	}

	public String getPL_ESTADO() {
		return _PL_ESTADO;
	}

	public void setPL_ESTADO(String PL_ESTADO) {
		_PL_ESTADO = PL_ESTADO;
	}

	public String getPL_ACTIVO() {
		return _PL_ACTIVO;
	}

	public void setPL_ACTIVO(String PL_ACTIVO) {
		_PL_ACTIVO = PL_ACTIVO;
	}

	public long getPL_USUARIO_CREA() {
		return _PL_USUARIO_CREA;
	}

	public void setPL_USUARIO_CREA(long PL_USUARIO_CREA) {
		_PL_USUARIO_CREA = PL_USUARIO_CREA;
	}

	public Date getPL_FECHA_CREA() {
		return _PL_FECHA_CREA;
	}

	public void setPL_FECHA_CREA(Date PL_FECHA_CREA) {
		_PL_FECHA_CREA = PL_FECHA_CREA;
	}

	public long getPL_USUARIO_MODIFICA() {
		return _PL_USUARIO_MODIFICA;
	}

	public void setPL_USUARIO_MODIFICA(long PL_USUARIO_MODIFICA) {
		_PL_USUARIO_MODIFICA = PL_USUARIO_MODIFICA;
	}

	public Date getPL_FECHA_MODIFICA() {
		return _PL_FECHA_MODIFICA;
	}

	public void setPL_FECHA_MODIFICA(Date PL_FECHA_MODIFICA) {
		_PL_FECHA_MODIFICA = PL_FECHA_MODIFICA;
	}

	private long _PL_ID;
	private String _PL_PUESTO;
	private String _PL_ESTADO;
	private String _PL_ACTIVO;
	private long _PL_USUARIO_CREA;
	private Date _PL_FECHA_CREA;
	private long _PL_USUARIO_MODIFICA;
	private Date _PL_FECHA_MODIFICA;
}
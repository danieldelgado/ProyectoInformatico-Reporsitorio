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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.fichaIngresoServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.fichaIngresoServiceSoap
 * @generated
 */
public class fichaIngresoSoap implements Serializable {
	public static fichaIngresoSoap toSoapModel(fichaIngreso model) {
		fichaIngresoSoap soapModel = new fichaIngresoSoap();

		soapModel.setFI_ID(model.getFI_ID());
		soapModel.setFI_ESTADO(model.getFI_ESTADO());
		soapModel.setFI_ACTIVO(model.getFI_ACTIVO());
		soapModel.setFI_USUARIO_CREA(model.getFI_USUARIO_CREA());
		soapModel.setFI_FECHA_CREA(model.getFI_FECHA_CREA());
		soapModel.setFI_USUARIO_MODIFICA(model.getFI_USUARIO_MODIFICA());
		soapModel.setFI_FECHA_MODIFICA(model.getFI_FECHA_MODIFICA());

		return soapModel;
	}

	public static fichaIngresoSoap[] toSoapModels(fichaIngreso[] models) {
		fichaIngresoSoap[] soapModels = new fichaIngresoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static fichaIngresoSoap[][] toSoapModels(fichaIngreso[][] models) {
		fichaIngresoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new fichaIngresoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new fichaIngresoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static fichaIngresoSoap[] toSoapModels(List<fichaIngreso> models) {
		List<fichaIngresoSoap> soapModels = new ArrayList<fichaIngresoSoap>(models.size());

		for (fichaIngreso model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new fichaIngresoSoap[soapModels.size()]);
	}

	public fichaIngresoSoap() {
	}

	public long getPrimaryKey() {
		return _FI_ID;
	}

	public void setPrimaryKey(long pk) {
		setFI_ID(pk);
	}

	public long getFI_ID() {
		return _FI_ID;
	}

	public void setFI_ID(long FI_ID) {
		_FI_ID = FI_ID;
	}

	public String getFI_ESTADO() {
		return _FI_ESTADO;
	}

	public void setFI_ESTADO(String FI_ESTADO) {
		_FI_ESTADO = FI_ESTADO;
	}

	public String getFI_ACTIVO() {
		return _FI_ACTIVO;
	}

	public void setFI_ACTIVO(String FI_ACTIVO) {
		_FI_ACTIVO = FI_ACTIVO;
	}

	public long getFI_USUARIO_CREA() {
		return _FI_USUARIO_CREA;
	}

	public void setFI_USUARIO_CREA(long FI_USUARIO_CREA) {
		_FI_USUARIO_CREA = FI_USUARIO_CREA;
	}

	public Date getFI_FECHA_CREA() {
		return _FI_FECHA_CREA;
	}

	public void setFI_FECHA_CREA(Date FI_FECHA_CREA) {
		_FI_FECHA_CREA = FI_FECHA_CREA;
	}

	public long getFI_USUARIO_MODIFICA() {
		return _FI_USUARIO_MODIFICA;
	}

	public void setFI_USUARIO_MODIFICA(long FI_USUARIO_MODIFICA) {
		_FI_USUARIO_MODIFICA = FI_USUARIO_MODIFICA;
	}

	public Date getFI_FECHA_MODIFICA() {
		return _FI_FECHA_MODIFICA;
	}

	public void setFI_FECHA_MODIFICA(Date FI_FECHA_MODIFICA) {
		_FI_FECHA_MODIFICA = FI_FECHA_MODIFICA;
	}

	private long _FI_ID;
	private String _FI_ESTADO;
	private String _FI_ACTIVO;
	private long _FI_USUARIO_CREA;
	private Date _FI_FECHA_CREA;
	private long _FI_USUARIO_MODIFICA;
	private Date _FI_FECHA_MODIFICA;
}
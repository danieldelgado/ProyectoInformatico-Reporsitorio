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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.requerimientoPersonalServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.requerimientoPersonalServiceSoap
 * @generated
 */
public class requerimientoPersonalSoap implements Serializable {
	public static requerimientoPersonalSoap toSoapModel(
		requerimientoPersonal model) {
		requerimientoPersonalSoap soapModel = new requerimientoPersonalSoap();

		soapModel.setREQ_ID(model.getREQ_ID());
		soapModel.setREQ_ESTADO(model.getREQ_ESTADO());
		soapModel.setREQ_ACTIVO(model.getREQ_ACTIVO());
		soapModel.setREQ_USUARIO_CREA(model.getREQ_USUARIO_CREA());
		soapModel.setREQ_FECHA_CREA(model.getREQ_FECHA_CREA());
		soapModel.setREQ_USUARIO_MODIFICA(model.getREQ_USUARIO_MODIFICA());
		soapModel.setREQ_FECHA_MODIFICA(model.getREQ_FECHA_MODIFICA());

		return soapModel;
	}

	public static requerimientoPersonalSoap[] toSoapModels(
		requerimientoPersonal[] models) {
		requerimientoPersonalSoap[] soapModels = new requerimientoPersonalSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static requerimientoPersonalSoap[][] toSoapModels(
		requerimientoPersonal[][] models) {
		requerimientoPersonalSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new requerimientoPersonalSoap[models.length][models[0].length];
		}
		else {
			soapModels = new requerimientoPersonalSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static requerimientoPersonalSoap[] toSoapModels(
		List<requerimientoPersonal> models) {
		List<requerimientoPersonalSoap> soapModels = new ArrayList<requerimientoPersonalSoap>(models.size());

		for (requerimientoPersonal model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new requerimientoPersonalSoap[soapModels.size()]);
	}

	public requerimientoPersonalSoap() {
	}

	public long getPrimaryKey() {
		return _REQ_ID;
	}

	public void setPrimaryKey(long pk) {
		setREQ_ID(pk);
	}

	public long getREQ_ID() {
		return _REQ_ID;
	}

	public void setREQ_ID(long REQ_ID) {
		_REQ_ID = REQ_ID;
	}

	public String getREQ_ESTADO() {
		return _REQ_ESTADO;
	}

	public void setREQ_ESTADO(String REQ_ESTADO) {
		_REQ_ESTADO = REQ_ESTADO;
	}

	public String getREQ_ACTIVO() {
		return _REQ_ACTIVO;
	}

	public void setREQ_ACTIVO(String REQ_ACTIVO) {
		_REQ_ACTIVO = REQ_ACTIVO;
	}

	public long getREQ_USUARIO_CREA() {
		return _REQ_USUARIO_CREA;
	}

	public void setREQ_USUARIO_CREA(long REQ_USUARIO_CREA) {
		_REQ_USUARIO_CREA = REQ_USUARIO_CREA;
	}

	public Date getREQ_FECHA_CREA() {
		return _REQ_FECHA_CREA;
	}

	public void setREQ_FECHA_CREA(Date REQ_FECHA_CREA) {
		_REQ_FECHA_CREA = REQ_FECHA_CREA;
	}

	public long getREQ_USUARIO_MODIFICA() {
		return _REQ_USUARIO_MODIFICA;
	}

	public void setREQ_USUARIO_MODIFICA(long REQ_USUARIO_MODIFICA) {
		_REQ_USUARIO_MODIFICA = REQ_USUARIO_MODIFICA;
	}

	public Date getREQ_FECHA_MODIFICA() {
		return _REQ_FECHA_MODIFICA;
	}

	public void setREQ_FECHA_MODIFICA(Date REQ_FECHA_MODIFICA) {
		_REQ_FECHA_MODIFICA = REQ_FECHA_MODIFICA;
	}

	private long _REQ_ID;
	private String _REQ_ESTADO;
	private String _REQ_ACTIVO;
	private long _REQ_USUARIO_CREA;
	private Date _REQ_FECHA_CREA;
	private long _REQ_USUARIO_MODIFICA;
	private Date _REQ_FECHA_MODIFICA;
}
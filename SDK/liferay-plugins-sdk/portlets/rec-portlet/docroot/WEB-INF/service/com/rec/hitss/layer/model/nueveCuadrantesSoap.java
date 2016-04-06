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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.nueveCuadrantesServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.nueveCuadrantesServiceSoap
 * @generated
 */
public class nueveCuadrantesSoap implements Serializable {
	public static nueveCuadrantesSoap toSoapModel(nueveCuadrantes model) {
		nueveCuadrantesSoap soapModel = new nueveCuadrantesSoap();

		soapModel.setNC_ID(model.getNC_ID());
		soapModel.setREQ_ESTADO(model.getREQ_ESTADO());
		soapModel.setREQ_ACTIVO(model.getREQ_ACTIVO());
		soapModel.setSR_USUARIO_CREA(model.getSR_USUARIO_CREA());
		soapModel.setSR_FECHA_CREA(model.getSR_FECHA_CREA());
		soapModel.setSR_USUARIO_MODIFICA(model.getSR_USUARIO_MODIFICA());
		soapModel.setSR_FECHA_MODIFICA(model.getSR_FECHA_MODIFICA());

		return soapModel;
	}

	public static nueveCuadrantesSoap[] toSoapModels(nueveCuadrantes[] models) {
		nueveCuadrantesSoap[] soapModels = new nueveCuadrantesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static nueveCuadrantesSoap[][] toSoapModels(
		nueveCuadrantes[][] models) {
		nueveCuadrantesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new nueveCuadrantesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new nueveCuadrantesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static nueveCuadrantesSoap[] toSoapModels(
		List<nueveCuadrantes> models) {
		List<nueveCuadrantesSoap> soapModels = new ArrayList<nueveCuadrantesSoap>(models.size());

		for (nueveCuadrantes model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new nueveCuadrantesSoap[soapModels.size()]);
	}

	public nueveCuadrantesSoap() {
	}

	public long getPrimaryKey() {
		return _NC_ID;
	}

	public void setPrimaryKey(long pk) {
		setNC_ID(pk);
	}

	public long getNC_ID() {
		return _NC_ID;
	}

	public void setNC_ID(long NC_ID) {
		_NC_ID = NC_ID;
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

	public long getSR_USUARIO_CREA() {
		return _SR_USUARIO_CREA;
	}

	public void setSR_USUARIO_CREA(long SR_USUARIO_CREA) {
		_SR_USUARIO_CREA = SR_USUARIO_CREA;
	}

	public Date getSR_FECHA_CREA() {
		return _SR_FECHA_CREA;
	}

	public void setSR_FECHA_CREA(Date SR_FECHA_CREA) {
		_SR_FECHA_CREA = SR_FECHA_CREA;
	}

	public long getSR_USUARIO_MODIFICA() {
		return _SR_USUARIO_MODIFICA;
	}

	public void setSR_USUARIO_MODIFICA(long SR_USUARIO_MODIFICA) {
		_SR_USUARIO_MODIFICA = SR_USUARIO_MODIFICA;
	}

	public Date getSR_FECHA_MODIFICA() {
		return _SR_FECHA_MODIFICA;
	}

	public void setSR_FECHA_MODIFICA(Date SR_FECHA_MODIFICA) {
		_SR_FECHA_MODIFICA = SR_FECHA_MODIFICA;
	}

	private long _NC_ID;
	private String _REQ_ESTADO;
	private String _REQ_ACTIVO;
	private long _SR_USUARIO_CREA;
	private Date _SR_FECHA_CREA;
	private long _SR_USUARIO_MODIFICA;
	private Date _SR_FECHA_MODIFICA;
}
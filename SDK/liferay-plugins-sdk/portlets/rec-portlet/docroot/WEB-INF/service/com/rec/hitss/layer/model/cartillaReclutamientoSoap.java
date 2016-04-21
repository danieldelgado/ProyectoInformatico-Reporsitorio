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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.cartillaReclutamientoServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.cartillaReclutamientoServiceSoap
 * @generated
 */
public class cartillaReclutamientoSoap implements Serializable {
	public static cartillaReclutamientoSoap toSoapModel(
		cartillaReclutamiento model) {
		cartillaReclutamientoSoap soapModel = new cartillaReclutamientoSoap();

		soapModel.setCR_ID(model.getCR_ID());
		soapModel.setCR_ESTADO(model.getCR_ESTADO());
		soapModel.setCR_ACTIVO(model.getCR_ACTIVO());
		soapModel.setCR_USUARIO_CREA(model.getCR_USUARIO_CREA());
		soapModel.setCR_FECHA_CREA(model.getCR_FECHA_CREA());
		soapModel.setCR_USUARIO_MODIFICA(model.getCR_USUARIO_MODIFICA());
		soapModel.setCR_FECHA_MODIFICA(model.getCR_FECHA_MODIFICA());

		return soapModel;
	}

	public static cartillaReclutamientoSoap[] toSoapModels(
		cartillaReclutamiento[] models) {
		cartillaReclutamientoSoap[] soapModels = new cartillaReclutamientoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static cartillaReclutamientoSoap[][] toSoapModels(
		cartillaReclutamiento[][] models) {
		cartillaReclutamientoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new cartillaReclutamientoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new cartillaReclutamientoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static cartillaReclutamientoSoap[] toSoapModels(
		List<cartillaReclutamiento> models) {
		List<cartillaReclutamientoSoap> soapModels = new ArrayList<cartillaReclutamientoSoap>(models.size());

		for (cartillaReclutamiento model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new cartillaReclutamientoSoap[soapModels.size()]);
	}

	public cartillaReclutamientoSoap() {
	}

	public long getPrimaryKey() {
		return _CR_ID;
	}

	public void setPrimaryKey(long pk) {
		setCR_ID(pk);
	}

	public long getCR_ID() {
		return _CR_ID;
	}

	public void setCR_ID(long CR_ID) {
		_CR_ID = CR_ID;
	}

	public String getCR_ESTADO() {
		return _CR_ESTADO;
	}

	public void setCR_ESTADO(String CR_ESTADO) {
		_CR_ESTADO = CR_ESTADO;
	}

	public String getCR_ACTIVO() {
		return _CR_ACTIVO;
	}

	public void setCR_ACTIVO(String CR_ACTIVO) {
		_CR_ACTIVO = CR_ACTIVO;
	}

	public long getCR_USUARIO_CREA() {
		return _CR_USUARIO_CREA;
	}

	public void setCR_USUARIO_CREA(long CR_USUARIO_CREA) {
		_CR_USUARIO_CREA = CR_USUARIO_CREA;
	}

	public Date getCR_FECHA_CREA() {
		return _CR_FECHA_CREA;
	}

	public void setCR_FECHA_CREA(Date CR_FECHA_CREA) {
		_CR_FECHA_CREA = CR_FECHA_CREA;
	}

	public long getCR_USUARIO_MODIFICA() {
		return _CR_USUARIO_MODIFICA;
	}

	public void setCR_USUARIO_MODIFICA(long CR_USUARIO_MODIFICA) {
		_CR_USUARIO_MODIFICA = CR_USUARIO_MODIFICA;
	}

	public Date getCR_FECHA_MODIFICA() {
		return _CR_FECHA_MODIFICA;
	}

	public void setCR_FECHA_MODIFICA(Date CR_FECHA_MODIFICA) {
		_CR_FECHA_MODIFICA = CR_FECHA_MODIFICA;
	}

	private long _CR_ID;
	private String _CR_ESTADO;
	private String _CR_ACTIVO;
	private long _CR_USUARIO_CREA;
	private Date _CR_FECHA_CREA;
	private long _CR_USUARIO_MODIFICA;
	private Date _CR_FECHA_MODIFICA;
}
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

import com.hitss.layer.service.persistence.UsuarioRequisitoPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.UsuarioRequisitoServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.UsuarioRequisitoServiceSoap
 * @generated
 */
public class UsuarioRequisitoSoap implements Serializable {
	public static UsuarioRequisitoSoap toSoapModel(UsuarioRequisito model) {
		UsuarioRequisitoSoap soapModel = new UsuarioRequisitoSoap();

		soapModel.setUserId(model.getUserId());
		soapModel.setRequisitoId(model.getRequisitoId());
		soapModel.setCumplerequisito(model.getCumplerequisito());

		return soapModel;
	}

	public static UsuarioRequisitoSoap[] toSoapModels(UsuarioRequisito[] models) {
		UsuarioRequisitoSoap[] soapModels = new UsuarioRequisitoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UsuarioRequisitoSoap[][] toSoapModels(
		UsuarioRequisito[][] models) {
		UsuarioRequisitoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UsuarioRequisitoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UsuarioRequisitoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UsuarioRequisitoSoap[] toSoapModels(
		List<UsuarioRequisito> models) {
		List<UsuarioRequisitoSoap> soapModels = new ArrayList<UsuarioRequisitoSoap>(models.size());

		for (UsuarioRequisito model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UsuarioRequisitoSoap[soapModels.size()]);
	}

	public UsuarioRequisitoSoap() {
	}

	public UsuarioRequisitoPK getPrimaryKey() {
		return new UsuarioRequisitoPK(_userId, _requisitoId);
	}

	public void setPrimaryKey(UsuarioRequisitoPK pk) {
		setUserId(pk.userId);
		setRequisitoId(pk.requisitoId);
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getRequisitoId() {
		return _requisitoId;
	}

	public void setRequisitoId(long requisitoId) {
		_requisitoId = requisitoId;
	}

	public boolean getCumplerequisito() {
		return _cumplerequisito;
	}

	public boolean isCumplerequisito() {
		return _cumplerequisito;
	}

	public void setCumplerequisito(boolean cumplerequisito) {
		_cumplerequisito = cumplerequisito;
	}

	private long _userId;
	private long _requisitoId;
	private boolean _cumplerequisito;
}
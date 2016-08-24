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

import com.rec.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.SolicitudRequerimientoRequisitoServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.SolicitudRequerimientoRequisitoServiceSoap
 * @generated
 */
public class SolicitudRequerimientoRequisitoSoap implements Serializable {
	public static SolicitudRequerimientoRequisitoSoap toSoapModel(
		SolicitudRequerimientoRequisito model) {
		SolicitudRequerimientoRequisitoSoap soapModel = new SolicitudRequerimientoRequisitoSoap();

		soapModel.setSolicitudRequerimientoId(model.getSolicitudRequerimientoId());
		soapModel.setRequisitosId(model.getRequisitosId());
		soapModel.setExigible(model.getExigible());

		return soapModel;
	}

	public static SolicitudRequerimientoRequisitoSoap[] toSoapModels(
		SolicitudRequerimientoRequisito[] models) {
		SolicitudRequerimientoRequisitoSoap[] soapModels = new SolicitudRequerimientoRequisitoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SolicitudRequerimientoRequisitoSoap[][] toSoapModels(
		SolicitudRequerimientoRequisito[][] models) {
		SolicitudRequerimientoRequisitoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SolicitudRequerimientoRequisitoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SolicitudRequerimientoRequisitoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SolicitudRequerimientoRequisitoSoap[] toSoapModels(
		List<SolicitudRequerimientoRequisito> models) {
		List<SolicitudRequerimientoRequisitoSoap> soapModels = new ArrayList<SolicitudRequerimientoRequisitoSoap>(models.size());

		for (SolicitudRequerimientoRequisito model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SolicitudRequerimientoRequisitoSoap[soapModels.size()]);
	}

	public SolicitudRequerimientoRequisitoSoap() {
	}

	public SolicitudRequerimientoRequisitoPK getPrimaryKey() {
		return new SolicitudRequerimientoRequisitoPK(_solicitudRequerimientoId,
			_requisitosId);
	}

	public void setPrimaryKey(SolicitudRequerimientoRequisitoPK pk) {
		setSolicitudRequerimientoId(pk.solicitudRequerimientoId);
		setRequisitosId(pk.requisitosId);
	}

	public long getSolicitudRequerimientoId() {
		return _solicitudRequerimientoId;
	}

	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_solicitudRequerimientoId = solicitudRequerimientoId;
	}

	public long getRequisitosId() {
		return _requisitosId;
	}

	public void setRequisitosId(long requisitosId) {
		_requisitosId = requisitosId;
	}

	public boolean getExigible() {
		return _exigible;
	}

	public boolean isExigible() {
		return _exigible;
	}

	public void setExigible(boolean exigible) {
		_exigible = exigible;
	}

	private long _solicitudRequerimientoId;
	private long _requisitosId;
	private boolean _exigible;
}
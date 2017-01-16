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

import com.hitss.layer.service.persistence.PuestoEvaluacionPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.PuestoEvaluacionServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.PuestoEvaluacionServiceSoap
 * @generated
 */
public class PuestoEvaluacionSoap implements Serializable {
	public static PuestoEvaluacionSoap toSoapModel(PuestoEvaluacion model) {
		PuestoEvaluacionSoap soapModel = new PuestoEvaluacionSoap();

		soapModel.setSolicitudFuncionId(model.getSolicitudFuncionId());
		soapModel.setEvaluacionId(model.getEvaluacionId());
		soapModel.setRangoSuperior(model.getRangoSuperior());
		soapModel.setRangoInferior(model.getRangoInferior());

		return soapModel;
	}

	public static PuestoEvaluacionSoap[] toSoapModels(PuestoEvaluacion[] models) {
		PuestoEvaluacionSoap[] soapModels = new PuestoEvaluacionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PuestoEvaluacionSoap[][] toSoapModels(
		PuestoEvaluacion[][] models) {
		PuestoEvaluacionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PuestoEvaluacionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PuestoEvaluacionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PuestoEvaluacionSoap[] toSoapModels(
		List<PuestoEvaluacion> models) {
		List<PuestoEvaluacionSoap> soapModels = new ArrayList<PuestoEvaluacionSoap>(models.size());

		for (PuestoEvaluacion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PuestoEvaluacionSoap[soapModels.size()]);
	}

	public PuestoEvaluacionSoap() {
	}

	public PuestoEvaluacionPK getPrimaryKey() {
		return new PuestoEvaluacionPK(_solicitudFuncionId, _evaluacionId);
	}

	public void setPrimaryKey(PuestoEvaluacionPK pk) {
		setSolicitudFuncionId(pk.solicitudFuncionId);
		setEvaluacionId(pk.evaluacionId);
	}

	public long getSolicitudFuncionId() {
		return _solicitudFuncionId;
	}

	public void setSolicitudFuncionId(long solicitudFuncionId) {
		_solicitudFuncionId = solicitudFuncionId;
	}

	public long getEvaluacionId() {
		return _evaluacionId;
	}

	public void setEvaluacionId(long evaluacionId) {
		_evaluacionId = evaluacionId;
	}

	public double getRangoSuperior() {
		return _rangoSuperior;
	}

	public void setRangoSuperior(double rangoSuperior) {
		_rangoSuperior = rangoSuperior;
	}

	public double getRangoInferior() {
		return _rangoInferior;
	}

	public void setRangoInferior(double rangoInferior) {
		_rangoInferior = rangoInferior;
	}

	private long _solicitudFuncionId;
	private long _evaluacionId;
	private double _rangoSuperior;
	private double _rangoInferior;
}
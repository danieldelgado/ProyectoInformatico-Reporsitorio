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

import com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.FasePostulacionPuestoEvaluacionServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.FasePostulacionPuestoEvaluacionServiceSoap
 * @generated
 */
public class FasePostulacionPuestoEvaluacionSoap implements Serializable {
	public static FasePostulacionPuestoEvaluacionSoap toSoapModel(
		FasePostulacionPuestoEvaluacion model) {
		FasePostulacionPuestoEvaluacionSoap soapModel = new FasePostulacionPuestoEvaluacionSoap();

		soapModel.setFasePostulacionId(model.getFasePostulacionId());
		soapModel.setSolicitudFuncionId(model.getSolicitudFuncionId());
		soapModel.setEvaluacionId(model.getEvaluacionId());
		soapModel.setResultado(model.getResultado());

		return soapModel;
	}

	public static FasePostulacionPuestoEvaluacionSoap[] toSoapModels(
		FasePostulacionPuestoEvaluacion[] models) {
		FasePostulacionPuestoEvaluacionSoap[] soapModels = new FasePostulacionPuestoEvaluacionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FasePostulacionPuestoEvaluacionSoap[][] toSoapModels(
		FasePostulacionPuestoEvaluacion[][] models) {
		FasePostulacionPuestoEvaluacionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FasePostulacionPuestoEvaluacionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FasePostulacionPuestoEvaluacionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FasePostulacionPuestoEvaluacionSoap[] toSoapModels(
		List<FasePostulacionPuestoEvaluacion> models) {
		List<FasePostulacionPuestoEvaluacionSoap> soapModels = new ArrayList<FasePostulacionPuestoEvaluacionSoap>(models.size());

		for (FasePostulacionPuestoEvaluacion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FasePostulacionPuestoEvaluacionSoap[soapModels.size()]);
	}

	public FasePostulacionPuestoEvaluacionSoap() {
	}

	public FasePostulacionPuestoEvaluacionPK getPrimaryKey() {
		return new FasePostulacionPuestoEvaluacionPK(_fasePostulacionId,
			_solicitudFuncionId, _evaluacionId);
	}

	public void setPrimaryKey(FasePostulacionPuestoEvaluacionPK pk) {
		setFasePostulacionId(pk.fasePostulacionId);
		setSolicitudFuncionId(pk.solicitudFuncionId);
		setEvaluacionId(pk.evaluacionId);
	}

	public long getFasePostulacionId() {
		return _fasePostulacionId;
	}

	public void setFasePostulacionId(long fasePostulacionId) {
		_fasePostulacionId = fasePostulacionId;
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

	public double getResultado() {
		return _resultado;
	}

	public void setResultado(double resultado) {
		_resultado = resultado;
	}

	private long _fasePostulacionId;
	private long _solicitudFuncionId;
	private long _evaluacionId;
	private double _resultado;
}
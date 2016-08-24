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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.EvaluacionPreguntaServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.EvaluacionPreguntaServiceSoap
 * @generated
 */
public class EvaluacionPreguntaSoap implements Serializable {
	public static EvaluacionPreguntaSoap toSoapModel(EvaluacionPregunta model) {
		EvaluacionPreguntaSoap soapModel = new EvaluacionPreguntaSoap();

		soapModel.setEvaluacionPreguntaId(model.getEvaluacionPreguntaId());
		soapModel.setPreguntaId(model.getPreguntaId());
		soapModel.setEvaluacionId(model.getEvaluacionId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setNivel(model.getNivel());

		return soapModel;
	}

	public static EvaluacionPreguntaSoap[] toSoapModels(
		EvaluacionPregunta[] models) {
		EvaluacionPreguntaSoap[] soapModels = new EvaluacionPreguntaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EvaluacionPreguntaSoap[][] toSoapModels(
		EvaluacionPregunta[][] models) {
		EvaluacionPreguntaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EvaluacionPreguntaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EvaluacionPreguntaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EvaluacionPreguntaSoap[] toSoapModels(
		List<EvaluacionPregunta> models) {
		List<EvaluacionPreguntaSoap> soapModels = new ArrayList<EvaluacionPreguntaSoap>(models.size());

		for (EvaluacionPregunta model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EvaluacionPreguntaSoap[soapModels.size()]);
	}

	public EvaluacionPreguntaSoap() {
	}

	public long getPrimaryKey() {
		return _evaluacionPreguntaId;
	}

	public void setPrimaryKey(long pk) {
		setEvaluacionPreguntaId(pk);
	}

	public long getEvaluacionPreguntaId() {
		return _evaluacionPreguntaId;
	}

	public void setEvaluacionPreguntaId(long evaluacionPreguntaId) {
		_evaluacionPreguntaId = evaluacionPreguntaId;
	}

	public long getPreguntaId() {
		return _preguntaId;
	}

	public void setPreguntaId(long preguntaId) {
		_preguntaId = preguntaId;
	}

	public long getEvaluacionId() {
		return _evaluacionId;
	}

	public void setEvaluacionId(long evaluacionId) {
		_evaluacionId = evaluacionId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public long getNivel() {
		return _nivel;
	}

	public void setNivel(long nivel) {
		_nivel = nivel;
	}

	private long _evaluacionPreguntaId;
	private long _preguntaId;
	private long _evaluacionId;
	private String _descripcion;
	private long _nivel;
}
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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.UsuarioEvaluacionServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.UsuarioEvaluacionServiceSoap
 * @generated
 */
public class UsuarioEvaluacionSoap implements Serializable {
	public static UsuarioEvaluacionSoap toSoapModel(UsuarioEvaluacion model) {
		UsuarioEvaluacionSoap soapModel = new UsuarioEvaluacionSoap();

		soapModel.setActividadCronogramaId(model.getActividadCronogramaId());
		soapModel.setUsuarioId(model.getUsuarioId());
		soapModel.setEvaluacionId(model.getEvaluacionId());
		soapModel.setNota(model.getNota());

		return soapModel;
	}

	public static UsuarioEvaluacionSoap[] toSoapModels(
		UsuarioEvaluacion[] models) {
		UsuarioEvaluacionSoap[] soapModels = new UsuarioEvaluacionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UsuarioEvaluacionSoap[][] toSoapModels(
		UsuarioEvaluacion[][] models) {
		UsuarioEvaluacionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UsuarioEvaluacionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UsuarioEvaluacionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UsuarioEvaluacionSoap[] toSoapModels(
		List<UsuarioEvaluacion> models) {
		List<UsuarioEvaluacionSoap> soapModels = new ArrayList<UsuarioEvaluacionSoap>(models.size());

		for (UsuarioEvaluacion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UsuarioEvaluacionSoap[soapModels.size()]);
	}

	public UsuarioEvaluacionSoap() {
	}

	public long getPrimaryKey() {
		return _usuarioId;
	}

	public void setPrimaryKey(long pk) {
		setUsuarioId(pk);
	}

	public long getActividadCronogramaId() {
		return _actividadCronogramaId;
	}

	public void setActividadCronogramaId(long actividadCronogramaId) {
		_actividadCronogramaId = actividadCronogramaId;
	}

	public long getUsuarioId() {
		return _usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		_usuarioId = usuarioId;
	}

	public long getEvaluacionId() {
		return _evaluacionId;
	}

	public void setEvaluacionId(long evaluacionId) {
		_evaluacionId = evaluacionId;
	}

	public int getNota() {
		return _nota;
	}

	public void setNota(int nota) {
		_nota = nota;
	}

	private long _actividadCronogramaId;
	private long _usuarioId;
	private long _evaluacionId;
	private int _nota;
}
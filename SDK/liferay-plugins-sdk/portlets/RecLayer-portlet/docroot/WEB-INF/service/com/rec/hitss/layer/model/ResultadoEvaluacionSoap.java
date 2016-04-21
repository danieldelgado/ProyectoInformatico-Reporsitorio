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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.ResultadoEvaluacionServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.ResultadoEvaluacionServiceSoap
 * @generated
 */
public class ResultadoEvaluacionSoap implements Serializable {
	public static ResultadoEvaluacionSoap toSoapModel(ResultadoEvaluacion model) {
		ResultadoEvaluacionSoap soapModel = new ResultadoEvaluacionSoap();

		soapModel.setResultadoEvaluacionId(model.getResultadoEvaluacionId());
		soapModel.setRespuestaSelccionada(model.getRespuestaSelccionada());
		soapModel.setHabilidadCumplida(model.getHabilidadCumplida());
		soapModel.setEvaluacionId(model.getEvaluacionId());
		soapModel.setUsuarioHitssId(model.getUsuarioHitssId());

		return soapModel;
	}

	public static ResultadoEvaluacionSoap[] toSoapModels(
		ResultadoEvaluacion[] models) {
		ResultadoEvaluacionSoap[] soapModels = new ResultadoEvaluacionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ResultadoEvaluacionSoap[][] toSoapModels(
		ResultadoEvaluacion[][] models) {
		ResultadoEvaluacionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ResultadoEvaluacionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ResultadoEvaluacionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ResultadoEvaluacionSoap[] toSoapModels(
		List<ResultadoEvaluacion> models) {
		List<ResultadoEvaluacionSoap> soapModels = new ArrayList<ResultadoEvaluacionSoap>(models.size());

		for (ResultadoEvaluacion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ResultadoEvaluacionSoap[soapModels.size()]);
	}

	public ResultadoEvaluacionSoap() {
	}

	public long getPrimaryKey() {
		return _resultadoEvaluacionId;
	}

	public void setPrimaryKey(long pk) {
		setResultadoEvaluacionId(pk);
	}

	public long getResultadoEvaluacionId() {
		return _resultadoEvaluacionId;
	}

	public void setResultadoEvaluacionId(long resultadoEvaluacionId) {
		_resultadoEvaluacionId = resultadoEvaluacionId;
	}

	public long getRespuestaSelccionada() {
		return _respuestaSelccionada;
	}

	public void setRespuestaSelccionada(long respuestaSelccionada) {
		_respuestaSelccionada = respuestaSelccionada;
	}

	public boolean getHabilidadCumplida() {
		return _habilidadCumplida;
	}

	public boolean isHabilidadCumplida() {
		return _habilidadCumplida;
	}

	public void setHabilidadCumplida(boolean habilidadCumplida) {
		_habilidadCumplida = habilidadCumplida;
	}

	public long getEvaluacionId() {
		return _evaluacionId;
	}

	public void setEvaluacionId(long evaluacionId) {
		_evaluacionId = evaluacionId;
	}

	public long getUsuarioHitssId() {
		return _usuarioHitssId;
	}

	public void setUsuarioHitssId(long usuarioHitssId) {
		_usuarioHitssId = usuarioHitssId;
	}

	private long _resultadoEvaluacionId;
	private long _respuestaSelccionada;
	private boolean _habilidadCumplida;
	private long _evaluacionId;
	private long _usuarioHitssId;
}
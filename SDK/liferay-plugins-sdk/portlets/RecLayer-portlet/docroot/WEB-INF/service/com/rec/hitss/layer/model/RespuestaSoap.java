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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.RespuestaServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.RespuestaServiceSoap
 * @generated
 */
public class RespuestaSoap implements Serializable {
	public static RespuestaSoap toSoapModel(Respuesta model) {
		RespuestaSoap soapModel = new RespuestaSoap();

		soapModel.setRespuestaId(model.getRespuestaId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setCorrecta(model.getCorrecta());
		soapModel.setPreguntaId(model.getPreguntaId());

		return soapModel;
	}

	public static RespuestaSoap[] toSoapModels(Respuesta[] models) {
		RespuestaSoap[] soapModels = new RespuestaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RespuestaSoap[][] toSoapModels(Respuesta[][] models) {
		RespuestaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RespuestaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RespuestaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RespuestaSoap[] toSoapModels(List<Respuesta> models) {
		List<RespuestaSoap> soapModels = new ArrayList<RespuestaSoap>(models.size());

		for (Respuesta model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RespuestaSoap[soapModels.size()]);
	}

	public RespuestaSoap() {
	}

	public long getPrimaryKey() {
		return _respuestaId;
	}

	public void setPrimaryKey(long pk) {
		setRespuestaId(pk);
	}

	public long getRespuestaId() {
		return _respuestaId;
	}

	public void setRespuestaId(long respuestaId) {
		_respuestaId = respuestaId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public boolean getCorrecta() {
		return _correcta;
	}

	public boolean isCorrecta() {
		return _correcta;
	}

	public void setCorrecta(boolean correcta) {
		_correcta = correcta;
	}

	public long getPreguntaId() {
		return _preguntaId;
	}

	public void setPreguntaId(long preguntaId) {
		_preguntaId = preguntaId;
	}

	private long _respuestaId;
	private String _descripcion;
	private boolean _correcta;
	private long _preguntaId;
}
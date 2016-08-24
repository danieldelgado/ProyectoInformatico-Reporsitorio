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

import com.hitss.layer.service.persistence.PreguntaRespuestaPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.PreguntaRespuestaServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.PreguntaRespuestaServiceSoap
 * @generated
 */
public class PreguntaRespuestaSoap implements Serializable {
	public static PreguntaRespuestaSoap toSoapModel(PreguntaRespuesta model) {
		PreguntaRespuestaSoap soapModel = new PreguntaRespuestaSoap();

		soapModel.setPreguntaId(model.getPreguntaId());
		soapModel.setRespuestaId(model.getRespuestaId());

		return soapModel;
	}

	public static PreguntaRespuestaSoap[] toSoapModels(
		PreguntaRespuesta[] models) {
		PreguntaRespuestaSoap[] soapModels = new PreguntaRespuestaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PreguntaRespuestaSoap[][] toSoapModels(
		PreguntaRespuesta[][] models) {
		PreguntaRespuestaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PreguntaRespuestaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PreguntaRespuestaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PreguntaRespuestaSoap[] toSoapModels(
		List<PreguntaRespuesta> models) {
		List<PreguntaRespuestaSoap> soapModels = new ArrayList<PreguntaRespuestaSoap>(models.size());

		for (PreguntaRespuesta model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PreguntaRespuestaSoap[soapModels.size()]);
	}

	public PreguntaRespuestaSoap() {
	}

	public PreguntaRespuestaPK getPrimaryKey() {
		return new PreguntaRespuestaPK(_preguntaId, _respuestaId);
	}

	public void setPrimaryKey(PreguntaRespuestaPK pk) {
		setPreguntaId(pk.preguntaId);
		setRespuestaId(pk.respuestaId);
	}

	public long getPreguntaId() {
		return _preguntaId;
	}

	public void setPreguntaId(long preguntaId) {
		_preguntaId = preguntaId;
	}

	public long getRespuestaId() {
		return _respuestaId;
	}

	public void setRespuestaId(long respuestaId) {
		_respuestaId = respuestaId;
	}

	private long _preguntaId;
	private long _respuestaId;
}
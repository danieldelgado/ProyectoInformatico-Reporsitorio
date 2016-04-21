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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.curriculumVitaeServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.curriculumVitaeServiceSoap
 * @generated
 */
public class curriculumVitaeSoap implements Serializable {
	public static curriculumVitaeSoap toSoapModel(curriculumVitae model) {
		curriculumVitaeSoap soapModel = new curriculumVitaeSoap();

		soapModel.setCV_ID(model.getCV_ID());
		soapModel.setCV_ESTADO(model.getCV_ESTADO());
		soapModel.setCV_ACTIVO(model.getCV_ACTIVO());
		soapModel.setCV_USUARIO_CREA(model.getCV_USUARIO_CREA());
		soapModel.setCV_FECHA_CREA(model.getCV_FECHA_CREA());
		soapModel.setCV_USUARIO_MODIFICA(model.getCV_USUARIO_MODIFICA());
		soapModel.setCV_FECHA_MODIFICA(model.getCV_FECHA_MODIFICA());

		return soapModel;
	}

	public static curriculumVitaeSoap[] toSoapModels(curriculumVitae[] models) {
		curriculumVitaeSoap[] soapModels = new curriculumVitaeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static curriculumVitaeSoap[][] toSoapModels(
		curriculumVitae[][] models) {
		curriculumVitaeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new curriculumVitaeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new curriculumVitaeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static curriculumVitaeSoap[] toSoapModels(
		List<curriculumVitae> models) {
		List<curriculumVitaeSoap> soapModels = new ArrayList<curriculumVitaeSoap>(models.size());

		for (curriculumVitae model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new curriculumVitaeSoap[soapModels.size()]);
	}

	public curriculumVitaeSoap() {
	}

	public long getPrimaryKey() {
		return _CV_ID;
	}

	public void setPrimaryKey(long pk) {
		setCV_ID(pk);
	}

	public long getCV_ID() {
		return _CV_ID;
	}

	public void setCV_ID(long CV_ID) {
		_CV_ID = CV_ID;
	}

	public String getCV_ESTADO() {
		return _CV_ESTADO;
	}

	public void setCV_ESTADO(String CV_ESTADO) {
		_CV_ESTADO = CV_ESTADO;
	}

	public String getCV_ACTIVO() {
		return _CV_ACTIVO;
	}

	public void setCV_ACTIVO(String CV_ACTIVO) {
		_CV_ACTIVO = CV_ACTIVO;
	}

	public long getCV_USUARIO_CREA() {
		return _CV_USUARIO_CREA;
	}

	public void setCV_USUARIO_CREA(long CV_USUARIO_CREA) {
		_CV_USUARIO_CREA = CV_USUARIO_CREA;
	}

	public Date getCV_FECHA_CREA() {
		return _CV_FECHA_CREA;
	}

	public void setCV_FECHA_CREA(Date CV_FECHA_CREA) {
		_CV_FECHA_CREA = CV_FECHA_CREA;
	}

	public long getCV_USUARIO_MODIFICA() {
		return _CV_USUARIO_MODIFICA;
	}

	public void setCV_USUARIO_MODIFICA(long CV_USUARIO_MODIFICA) {
		_CV_USUARIO_MODIFICA = CV_USUARIO_MODIFICA;
	}

	public Date getCV_FECHA_MODIFICA() {
		return _CV_FECHA_MODIFICA;
	}

	public void setCV_FECHA_MODIFICA(Date CV_FECHA_MODIFICA) {
		_CV_FECHA_MODIFICA = CV_FECHA_MODIFICA;
	}

	private long _CV_ID;
	private String _CV_ESTADO;
	private String _CV_ACTIVO;
	private long _CV_USUARIO_CREA;
	private Date _CV_FECHA_CREA;
	private long _CV_USUARIO_MODIFICA;
	private Date _CV_FECHA_MODIFICA;
}
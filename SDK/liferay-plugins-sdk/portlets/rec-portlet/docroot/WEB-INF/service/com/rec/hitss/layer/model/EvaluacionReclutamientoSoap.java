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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.EvaluacionReclutamientoServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.EvaluacionReclutamientoServiceSoap
 * @generated
 */
public class EvaluacionReclutamientoSoap implements Serializable {
	public static EvaluacionReclutamientoSoap toSoapModel(
		EvaluacionReclutamiento model) {
		EvaluacionReclutamientoSoap soapModel = new EvaluacionReclutamientoSoap();

		soapModel.setER_ID(model.getER_ID());
		soapModel.setER_ESTADO(model.getER_ESTADO());
		soapModel.setER_ACTIVO(model.getER_ACTIVO());
		soapModel.setER_USUARIO_CREA(model.getER_USUARIO_CREA());
		soapModel.setER_FECHA_CREA(model.getER_FECHA_CREA());
		soapModel.setER_USUARIO_MODIFICA(model.getER_USUARIO_MODIFICA());
		soapModel.setER_FECHA_MODIFICA(model.getER_FECHA_MODIFICA());

		return soapModel;
	}

	public static EvaluacionReclutamientoSoap[] toSoapModels(
		EvaluacionReclutamiento[] models) {
		EvaluacionReclutamientoSoap[] soapModels = new EvaluacionReclutamientoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EvaluacionReclutamientoSoap[][] toSoapModels(
		EvaluacionReclutamiento[][] models) {
		EvaluacionReclutamientoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EvaluacionReclutamientoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EvaluacionReclutamientoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EvaluacionReclutamientoSoap[] toSoapModels(
		List<EvaluacionReclutamiento> models) {
		List<EvaluacionReclutamientoSoap> soapModels = new ArrayList<EvaluacionReclutamientoSoap>(models.size());

		for (EvaluacionReclutamiento model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EvaluacionReclutamientoSoap[soapModels.size()]);
	}

	public EvaluacionReclutamientoSoap() {
	}

	public long getPrimaryKey() {
		return _ER_ID;
	}

	public void setPrimaryKey(long pk) {
		setER_ID(pk);
	}

	public long getER_ID() {
		return _ER_ID;
	}

	public void setER_ID(long ER_ID) {
		_ER_ID = ER_ID;
	}

	public String getER_ESTADO() {
		return _ER_ESTADO;
	}

	public void setER_ESTADO(String ER_ESTADO) {
		_ER_ESTADO = ER_ESTADO;
	}

	public String getER_ACTIVO() {
		return _ER_ACTIVO;
	}

	public void setER_ACTIVO(String ER_ACTIVO) {
		_ER_ACTIVO = ER_ACTIVO;
	}

	public long getER_USUARIO_CREA() {
		return _ER_USUARIO_CREA;
	}

	public void setER_USUARIO_CREA(long ER_USUARIO_CREA) {
		_ER_USUARIO_CREA = ER_USUARIO_CREA;
	}

	public Date getER_FECHA_CREA() {
		return _ER_FECHA_CREA;
	}

	public void setER_FECHA_CREA(Date ER_FECHA_CREA) {
		_ER_FECHA_CREA = ER_FECHA_CREA;
	}

	public long getER_USUARIO_MODIFICA() {
		return _ER_USUARIO_MODIFICA;
	}

	public void setER_USUARIO_MODIFICA(long ER_USUARIO_MODIFICA) {
		_ER_USUARIO_MODIFICA = ER_USUARIO_MODIFICA;
	}

	public Date getER_FECHA_MODIFICA() {
		return _ER_FECHA_MODIFICA;
	}

	public void setER_FECHA_MODIFICA(Date ER_FECHA_MODIFICA) {
		_ER_FECHA_MODIFICA = ER_FECHA_MODIFICA;
	}

	private long _ER_ID;
	private String _ER_ESTADO;
	private String _ER_ACTIVO;
	private long _ER_USUARIO_CREA;
	private Date _ER_FECHA_CREA;
	private long _ER_USUARIO_MODIFICA;
	private Date _ER_FECHA_MODIFICA;
}
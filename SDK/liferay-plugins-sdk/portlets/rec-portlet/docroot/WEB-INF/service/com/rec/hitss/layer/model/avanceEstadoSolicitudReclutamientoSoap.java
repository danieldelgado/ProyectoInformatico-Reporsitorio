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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.avanceEstadoSolicitudReclutamientoServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.avanceEstadoSolicitudReclutamientoServiceSoap
 * @generated
 */
public class avanceEstadoSolicitudReclutamientoSoap implements Serializable {
	public static avanceEstadoSolicitudReclutamientoSoap toSoapModel(
		avanceEstadoSolicitudReclutamiento model) {
		avanceEstadoSolicitudReclutamientoSoap soapModel = new avanceEstadoSolicitudReclutamientoSoap();

		soapModel.setAESR_ID(model.getAESR_ID());
		soapModel.setAESR_ESTADO(model.getAESR_ESTADO());
		soapModel.setAESR_ACTIVO(model.getAESR_ACTIVO());
		soapModel.setAESR_USUARIO_CREA(model.getAESR_USUARIO_CREA());
		soapModel.setAESR_FECHA_CREA(model.getAESR_FECHA_CREA());
		soapModel.setAESR_USUARIO_MODIFICA(model.getAESR_USUARIO_MODIFICA());
		soapModel.setAESR_FECHA_MODIFICA(model.getAESR_FECHA_MODIFICA());

		return soapModel;
	}

	public static avanceEstadoSolicitudReclutamientoSoap[] toSoapModels(
		avanceEstadoSolicitudReclutamiento[] models) {
		avanceEstadoSolicitudReclutamientoSoap[] soapModels = new avanceEstadoSolicitudReclutamientoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static avanceEstadoSolicitudReclutamientoSoap[][] toSoapModels(
		avanceEstadoSolicitudReclutamiento[][] models) {
		avanceEstadoSolicitudReclutamientoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new avanceEstadoSolicitudReclutamientoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new avanceEstadoSolicitudReclutamientoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static avanceEstadoSolicitudReclutamientoSoap[] toSoapModels(
		List<avanceEstadoSolicitudReclutamiento> models) {
		List<avanceEstadoSolicitudReclutamientoSoap> soapModels = new ArrayList<avanceEstadoSolicitudReclutamientoSoap>(models.size());

		for (avanceEstadoSolicitudReclutamiento model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new avanceEstadoSolicitudReclutamientoSoap[soapModels.size()]);
	}

	public avanceEstadoSolicitudReclutamientoSoap() {
	}

	public long getPrimaryKey() {
		return _AESR_ID;
	}

	public void setPrimaryKey(long pk) {
		setAESR_ID(pk);
	}

	public long getAESR_ID() {
		return _AESR_ID;
	}

	public void setAESR_ID(long AESR_ID) {
		_AESR_ID = AESR_ID;
	}

	public String getAESR_ESTADO() {
		return _AESR_ESTADO;
	}

	public void setAESR_ESTADO(String AESR_ESTADO) {
		_AESR_ESTADO = AESR_ESTADO;
	}

	public String getAESR_ACTIVO() {
		return _AESR_ACTIVO;
	}

	public void setAESR_ACTIVO(String AESR_ACTIVO) {
		_AESR_ACTIVO = AESR_ACTIVO;
	}

	public long getAESR_USUARIO_CREA() {
		return _AESR_USUARIO_CREA;
	}

	public void setAESR_USUARIO_CREA(long AESR_USUARIO_CREA) {
		_AESR_USUARIO_CREA = AESR_USUARIO_CREA;
	}

	public Date getAESR_FECHA_CREA() {
		return _AESR_FECHA_CREA;
	}

	public void setAESR_FECHA_CREA(Date AESR_FECHA_CREA) {
		_AESR_FECHA_CREA = AESR_FECHA_CREA;
	}

	public long getAESR_USUARIO_MODIFICA() {
		return _AESR_USUARIO_MODIFICA;
	}

	public void setAESR_USUARIO_MODIFICA(long AESR_USUARIO_MODIFICA) {
		_AESR_USUARIO_MODIFICA = AESR_USUARIO_MODIFICA;
	}

	public Date getAESR_FECHA_MODIFICA() {
		return _AESR_FECHA_MODIFICA;
	}

	public void setAESR_FECHA_MODIFICA(Date AESR_FECHA_MODIFICA) {
		_AESR_FECHA_MODIFICA = AESR_FECHA_MODIFICA;
	}

	private long _AESR_ID;
	private String _AESR_ESTADO;
	private String _AESR_ACTIVO;
	private long _AESR_USUARIO_CREA;
	private Date _AESR_FECHA_CREA;
	private long _AESR_USUARIO_MODIFICA;
	private Date _AESR_FECHA_MODIFICA;
}
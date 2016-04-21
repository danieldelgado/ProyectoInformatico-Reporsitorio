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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.PrioridadEquiposServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.PrioridadEquiposServiceSoap
 * @generated
 */
public class PrioridadEquiposSoap implements Serializable {
	public static PrioridadEquiposSoap toSoapModel(PrioridadEquipos model) {
		PrioridadEquiposSoap soapModel = new PrioridadEquiposSoap();

		soapModel.setPrioridadEquiposId(model.getPrioridadEquiposId());
		soapModel.setSolicitudEvaluacionDesempenoId(model.getSolicitudEvaluacionDesempenoId());
		soapModel.setResponsable(model.getResponsable());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static PrioridadEquiposSoap[] toSoapModels(PrioridadEquipos[] models) {
		PrioridadEquiposSoap[] soapModels = new PrioridadEquiposSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PrioridadEquiposSoap[][] toSoapModels(
		PrioridadEquipos[][] models) {
		PrioridadEquiposSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PrioridadEquiposSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PrioridadEquiposSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PrioridadEquiposSoap[] toSoapModels(
		List<PrioridadEquipos> models) {
		List<PrioridadEquiposSoap> soapModels = new ArrayList<PrioridadEquiposSoap>(models.size());

		for (PrioridadEquipos model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PrioridadEquiposSoap[soapModels.size()]);
	}

	public PrioridadEquiposSoap() {
	}

	public long getPrimaryKey() {
		return _prioridadEquiposId;
	}

	public void setPrimaryKey(long pk) {
		setPrioridadEquiposId(pk);
	}

	public long getPrioridadEquiposId() {
		return _prioridadEquiposId;
	}

	public void setPrioridadEquiposId(long prioridadEquiposId) {
		_prioridadEquiposId = prioridadEquiposId;
	}

	public long getSolicitudEvaluacionDesempenoId() {
		return _solicitudEvaluacionDesempenoId;
	}

	public void setSolicitudEvaluacionDesempenoId(
		long solicitudEvaluacionDesempenoId) {
		_solicitudEvaluacionDesempenoId = solicitudEvaluacionDesempenoId;
	}

	public long getResponsable() {
		return _responsable;
	}

	public void setResponsable(long responsable) {
		_responsable = responsable;
	}

	public boolean getActivo() {
		return _activo;
	}

	public boolean isActivo() {
		return _activo;
	}

	public void setActivo(boolean activo) {
		_activo = activo;
	}

	public long getUsuariocrea() {
		return _usuariocrea;
	}

	public void setUsuariocrea(long usuariocrea) {
		_usuariocrea = usuariocrea;
	}

	public Date getFechacrea() {
		return _fechacrea;
	}

	public void setFechacrea(Date fechacrea) {
		_fechacrea = fechacrea;
	}

	public long getUsuariomodifica() {
		return _usuariomodifica;
	}

	public void setUsuariomodifica(long usuariomodifica) {
		_usuariomodifica = usuariomodifica;
	}

	public Date getFechacreamodifica() {
		return _fechacreamodifica;
	}

	public void setFechacreamodifica(Date fechacreamodifica) {
		_fechacreamodifica = fechacreamodifica;
	}

	private long _prioridadEquiposId;
	private long _solicitudEvaluacionDesempenoId;
	private long _responsable;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.EvaluacionServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.EvaluacionServiceSoap
 * @generated
 */
public class EvaluacionSoap implements Serializable {
	public static EvaluacionSoap toSoapModel(Evaluacion model) {
		EvaluacionSoap soapModel = new EvaluacionSoap();

		soapModel.setEvaluacionId(model.getEvaluacionId());
		soapModel.setTiempoMinuto(model.getTiempoMinuto());
		soapModel.setEnfoque(model.getEnfoque());
		soapModel.setPuestoEvaluacion(model.getPuestoEvaluacion());
		soapModel.setTiempoPuesto(model.getTiempoPuesto());
		soapModel.setTipoEvaluacion(model.getTipoEvaluacion());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static EvaluacionSoap[] toSoapModels(Evaluacion[] models) {
		EvaluacionSoap[] soapModels = new EvaluacionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EvaluacionSoap[][] toSoapModels(Evaluacion[][] models) {
		EvaluacionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EvaluacionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EvaluacionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EvaluacionSoap[] toSoapModels(List<Evaluacion> models) {
		List<EvaluacionSoap> soapModels = new ArrayList<EvaluacionSoap>(models.size());

		for (Evaluacion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EvaluacionSoap[soapModels.size()]);
	}

	public EvaluacionSoap() {
	}

	public long getPrimaryKey() {
		return _evaluacionId;
	}

	public void setPrimaryKey(long pk) {
		setEvaluacionId(pk);
	}

	public long getEvaluacionId() {
		return _evaluacionId;
	}

	public void setEvaluacionId(long evaluacionId) {
		_evaluacionId = evaluacionId;
	}

	public long getTiempoMinuto() {
		return _tiempoMinuto;
	}

	public void setTiempoMinuto(long tiempoMinuto) {
		_tiempoMinuto = tiempoMinuto;
	}

	public long getEnfoque() {
		return _enfoque;
	}

	public void setEnfoque(long enfoque) {
		_enfoque = enfoque;
	}

	public long getPuestoEvaluacion() {
		return _puestoEvaluacion;
	}

	public void setPuestoEvaluacion(long puestoEvaluacion) {
		_puestoEvaluacion = puestoEvaluacion;
	}

	public long getTiempoPuesto() {
		return _tiempoPuesto;
	}

	public void setTiempoPuesto(long tiempoPuesto) {
		_tiempoPuesto = tiempoPuesto;
	}

	public long getTipoEvaluacion() {
		return _TipoEvaluacion;
	}

	public void setTipoEvaluacion(long TipoEvaluacion) {
		_TipoEvaluacion = TipoEvaluacion;
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

	private long _evaluacionId;
	private long _tiempoMinuto;
	private long _enfoque;
	private long _puestoEvaluacion;
	private long _tiempoPuesto;
	private long _TipoEvaluacion;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.CriteriosEvaluacionServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.CriteriosEvaluacionServiceSoap
 * @generated
 */
public class CriteriosEvaluacionSoap implements Serializable {
	public static CriteriosEvaluacionSoap toSoapModel(CriteriosEvaluacion model) {
		CriteriosEvaluacionSoap soapModel = new CriteriosEvaluacionSoap();

		soapModel.setCriteriosEvaluacionId(model.getCriteriosEvaluacionId());
		soapModel.setNombre(model.getNombre());
		soapModel.setNivelCriterio(model.getNivelCriterio());
		soapModel.setObservacion(model.getObservacion());
		soapModel.setParametroPadreId(model.getParametroPadreId());
		soapModel.setEvaluacionId(model.getEvaluacionId());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static CriteriosEvaluacionSoap[] toSoapModels(
		CriteriosEvaluacion[] models) {
		CriteriosEvaluacionSoap[] soapModels = new CriteriosEvaluacionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CriteriosEvaluacionSoap[][] toSoapModels(
		CriteriosEvaluacion[][] models) {
		CriteriosEvaluacionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CriteriosEvaluacionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CriteriosEvaluacionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CriteriosEvaluacionSoap[] toSoapModels(
		List<CriteriosEvaluacion> models) {
		List<CriteriosEvaluacionSoap> soapModels = new ArrayList<CriteriosEvaluacionSoap>(models.size());

		for (CriteriosEvaluacion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CriteriosEvaluacionSoap[soapModels.size()]);
	}

	public CriteriosEvaluacionSoap() {
	}

	public long getPrimaryKey() {
		return _criteriosEvaluacionId;
	}

	public void setPrimaryKey(long pk) {
		setCriteriosEvaluacionId(pk);
	}

	public long getCriteriosEvaluacionId() {
		return _criteriosEvaluacionId;
	}

	public void setCriteriosEvaluacionId(long criteriosEvaluacionId) {
		_criteriosEvaluacionId = criteriosEvaluacionId;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public String getNivelCriterio() {
		return _nivelCriterio;
	}

	public void setNivelCriterio(String nivelCriterio) {
		_nivelCriterio = nivelCriterio;
	}

	public String getObservacion() {
		return _observacion;
	}

	public void setObservacion(String observacion) {
		_observacion = observacion;
	}

	public long getParametroPadreId() {
		return _parametroPadreId;
	}

	public void setParametroPadreId(long parametroPadreId) {
		_parametroPadreId = parametroPadreId;
	}

	public long getEvaluacionId() {
		return _evaluacionId;
	}

	public void setEvaluacionId(long evaluacionId) {
		_evaluacionId = evaluacionId;
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

	private long _criteriosEvaluacionId;
	private String _nombre;
	private String _nivelCriterio;
	private String _observacion;
	private long _parametroPadreId;
	private long _evaluacionId;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
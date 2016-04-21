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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.ActividadPlanServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.ActividadPlanServiceSoap
 * @generated
 */
public class ActividadPlanSoap implements Serializable {
	public static ActividadPlanSoap toSoapModel(ActividadPlan model) {
		ActividadPlanSoap soapModel = new ActividadPlanSoap();

		soapModel.setActividadPlanId(model.getActividadPlanId());
		soapModel.setPlanAccionId(model.getPlanAccionId());
		soapModel.setDuracion(model.getDuracion());
		soapModel.setActividad(model.getActividad());
		soapModel.setCumplio(model.getCumplio());
		soapModel.setObservacion(model.getObservacion());
		soapModel.setEvidencia(model.getEvidencia());
		soapModel.setObjetivo(model.getObjetivo());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static ActividadPlanSoap[] toSoapModels(ActividadPlan[] models) {
		ActividadPlanSoap[] soapModels = new ActividadPlanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ActividadPlanSoap[][] toSoapModels(ActividadPlan[][] models) {
		ActividadPlanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ActividadPlanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ActividadPlanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ActividadPlanSoap[] toSoapModels(List<ActividadPlan> models) {
		List<ActividadPlanSoap> soapModels = new ArrayList<ActividadPlanSoap>(models.size());

		for (ActividadPlan model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ActividadPlanSoap[soapModels.size()]);
	}

	public ActividadPlanSoap() {
	}

	public long getPrimaryKey() {
		return _actividadPlanId;
	}

	public void setPrimaryKey(long pk) {
		setActividadPlanId(pk);
	}

	public long getActividadPlanId() {
		return _actividadPlanId;
	}

	public void setActividadPlanId(long actividadPlanId) {
		_actividadPlanId = actividadPlanId;
	}

	public long getPlanAccionId() {
		return _planAccionId;
	}

	public void setPlanAccionId(long planAccionId) {
		_planAccionId = planAccionId;
	}

	public int getDuracion() {
		return _duracion;
	}

	public void setDuracion(int duracion) {
		_duracion = duracion;
	}

	public String getActividad() {
		return _actividad;
	}

	public void setActividad(String actividad) {
		_actividad = actividad;
	}

	public boolean getCumplio() {
		return _cumplio;
	}

	public boolean isCumplio() {
		return _cumplio;
	}

	public void setCumplio(boolean cumplio) {
		_cumplio = cumplio;
	}

	public String getObservacion() {
		return _observacion;
	}

	public void setObservacion(String observacion) {
		_observacion = observacion;
	}

	public String getEvidencia() {
		return _evidencia;
	}

	public void setEvidencia(String evidencia) {
		_evidencia = evidencia;
	}

	public String getObjetivo() {
		return _objetivo;
	}

	public void setObjetivo(String objetivo) {
		_objetivo = objetivo;
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

	private long _actividadPlanId;
	private long _planAccionId;
	private int _duracion;
	private String _actividad;
	private boolean _cumplio;
	private String _observacion;
	private String _evidencia;
	private String _objetivo;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
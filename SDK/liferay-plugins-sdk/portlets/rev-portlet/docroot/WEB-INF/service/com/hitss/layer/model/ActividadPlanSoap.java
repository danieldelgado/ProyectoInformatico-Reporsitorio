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

import com.hitss.layer.service.persistence.ActividadPlanPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.ActividadPlanServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.ActividadPlanServiceSoap
 * @generated
 */
public class ActividadPlanSoap implements Serializable {
	public static ActividadPlanSoap toSoapModel(ActividadPlan model) {
		ActividadPlanSoap soapModel = new ActividadPlanSoap();

		soapModel.setActividadCronogramaId(model.getActividadCronogramaId());
		soapModel.setActividadPlanId(model.getActividadPlanId());
		soapModel.setPlanAccionId(model.getPlanAccionId());
		soapModel.setActividad(model.getActividad());
		soapModel.setEvidencia(model.getEvidencia());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

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

	public ActividadPlanPK getPrimaryKey() {
		return new ActividadPlanPK(_actividadCronogramaId, _actividadPlanId);
	}

	public void setPrimaryKey(ActividadPlanPK pk) {
		setActividadCronogramaId(pk.actividadCronogramaId);
		setActividadPlanId(pk.actividadPlanId);
	}

	public long getActividadCronogramaId() {
		return _actividadCronogramaId;
	}

	public void setActividadCronogramaId(long actividadCronogramaId) {
		_actividadCronogramaId = actividadCronogramaId;
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

	public String getActividad() {
		return _actividad;
	}

	public void setActividad(String actividad) {
		_actividad = actividad;
	}

	public String getEvidencia() {
		return _evidencia;
	}

	public void setEvidencia(String evidencia) {
		_evidencia = evidencia;
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

	public Date getFechamodifica() {
		return _fechamodifica;
	}

	public void setFechamodifica(Date fechamodifica) {
		_fechamodifica = fechamodifica;
	}

	private long _actividadCronogramaId;
	private long _actividadPlanId;
	private long _planAccionId;
	private String _actividad;
	private String _evidencia;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
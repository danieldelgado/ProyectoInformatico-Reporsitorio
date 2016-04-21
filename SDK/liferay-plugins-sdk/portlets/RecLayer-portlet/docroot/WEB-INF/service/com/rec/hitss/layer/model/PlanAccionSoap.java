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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.PlanAccionServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.PlanAccionServiceSoap
 * @generated
 */
public class PlanAccionSoap implements Serializable {
	public static PlanAccionSoap toSoapModel(PlanAccion model) {
		PlanAccionSoap soapModel = new PlanAccionSoap();

		soapModel.setPlanAccionId(model.getPlanAccionId());
		soapModel.setActividadesId(model.getActividadesId());
		soapModel.setResponsable(model.getResponsable());
		soapModel.setFechaEmitida(model.getFechaEmitida());
		soapModel.setFechaProgramada(model.getFechaProgramada());
		soapModel.setAprobadorColaborador(model.getAprobadorColaborador());
		soapModel.setAprobadorLideres(model.getAprobadorLideres());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static PlanAccionSoap[] toSoapModels(PlanAccion[] models) {
		PlanAccionSoap[] soapModels = new PlanAccionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PlanAccionSoap[][] toSoapModels(PlanAccion[][] models) {
		PlanAccionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PlanAccionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PlanAccionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PlanAccionSoap[] toSoapModels(List<PlanAccion> models) {
		List<PlanAccionSoap> soapModels = new ArrayList<PlanAccionSoap>(models.size());

		for (PlanAccion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PlanAccionSoap[soapModels.size()]);
	}

	public PlanAccionSoap() {
	}

	public long getPrimaryKey() {
		return _planAccionId;
	}

	public void setPrimaryKey(long pk) {
		setPlanAccionId(pk);
	}

	public long getPlanAccionId() {
		return _planAccionId;
	}

	public void setPlanAccionId(long planAccionId) {
		_planAccionId = planAccionId;
	}

	public long getActividadesId() {
		return _actividadesId;
	}

	public void setActividadesId(long actividadesId) {
		_actividadesId = actividadesId;
	}

	public String getResponsable() {
		return _responsable;
	}

	public void setResponsable(String responsable) {
		_responsable = responsable;
	}

	public Date getFechaEmitida() {
		return _fechaEmitida;
	}

	public void setFechaEmitida(Date fechaEmitida) {
		_fechaEmitida = fechaEmitida;
	}

	public Date getFechaProgramada() {
		return _fechaProgramada;
	}

	public void setFechaProgramada(Date fechaProgramada) {
		_fechaProgramada = fechaProgramada;
	}

	public boolean getAprobadorColaborador() {
		return _aprobadorColaborador;
	}

	public boolean isAprobadorColaborador() {
		return _aprobadorColaborador;
	}

	public void setAprobadorColaborador(boolean aprobadorColaborador) {
		_aprobadorColaborador = aprobadorColaborador;
	}

	public boolean getAprobadorLideres() {
		return _aprobadorLideres;
	}

	public boolean isAprobadorLideres() {
		return _aprobadorLideres;
	}

	public void setAprobadorLideres(boolean aprobadorLideres) {
		_aprobadorLideres = aprobadorLideres;
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

	private long _planAccionId;
	private long _actividadesId;
	private String _responsable;
	private Date _fechaEmitida;
	private Date _fechaProgramada;
	private boolean _aprobadorColaborador;
	private boolean _aprobadorLideres;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
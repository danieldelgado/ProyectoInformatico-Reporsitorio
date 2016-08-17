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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.ExperienciaServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.ExperienciaServiceSoap
 * @generated
 */
public class ExperienciaSoap implements Serializable {
	public static ExperienciaSoap toSoapModel(Experiencia model) {
		ExperienciaSoap soapModel = new ExperienciaSoap();

		soapModel.setExperienciaId(model.getExperienciaId());
		soapModel.setUsuarioId(model.getUsuarioId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setEmpresa(model.getEmpresa());
		soapModel.setProyecto(model.getProyecto());
		soapModel.setFechaInicio(model.getFechaInicio());
		soapModel.setFechaFin(model.getFechaFin());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static ExperienciaSoap[] toSoapModels(Experiencia[] models) {
		ExperienciaSoap[] soapModels = new ExperienciaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ExperienciaSoap[][] toSoapModels(Experiencia[][] models) {
		ExperienciaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ExperienciaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ExperienciaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ExperienciaSoap[] toSoapModels(List<Experiencia> models) {
		List<ExperienciaSoap> soapModels = new ArrayList<ExperienciaSoap>(models.size());

		for (Experiencia model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ExperienciaSoap[soapModels.size()]);
	}

	public ExperienciaSoap() {
	}

	public long getPrimaryKey() {
		return _experienciaId;
	}

	public void setPrimaryKey(long pk) {
		setExperienciaId(pk);
	}

	public long getExperienciaId() {
		return _experienciaId;
	}

	public void setExperienciaId(long experienciaId) {
		_experienciaId = experienciaId;
	}

	public long getUsuarioId() {
		return _usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		_usuarioId = usuarioId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public String getEmpresa() {
		return _empresa;
	}

	public void setEmpresa(String empresa) {
		_empresa = empresa;
	}

	public String getProyecto() {
		return _proyecto;
	}

	public void setProyecto(String proyecto) {
		_proyecto = proyecto;
	}

	public Date getFechaInicio() {
		return _fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		_fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return _fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		_fechaFin = fechaFin;
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

	private long _experienciaId;
	private long _usuarioId;
	private String _descripcion;
	private String _empresa;
	private String _proyecto;
	private Date _fechaInicio;
	private Date _fechaFin;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.PuestoServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.PuestoServiceSoap
 * @generated
 */
public class PuestoSoap implements Serializable {
	public static PuestoSoap toSoapModel(Puesto model) {
		PuestoSoap soapModel = new PuestoSoap();

		soapModel.setPuestoId(model.getPuestoId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setFechaContrato(model.getFechaContrato());
		soapModel.setFechaEvaluacionPsicologica(model.getFechaEvaluacionPsicologica());
		soapModel.setFechaEvalucionTecnica(model.getFechaEvalucionTecnica());
		soapModel.setFechaEntrevistaGerenteArea(model.getFechaEntrevistaGerenteArea());
		soapModel.setFechaEvaluacionRRHH(model.getFechaEvaluacionRRHH());
		soapModel.setFechaPostulacion(model.getFechaPostulacion());
		soapModel.setSeleccionado(model.getSeleccionado());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());
		soapModel.setRequerimientoRecursoId(model.getRequerimientoRecursoId());
		soapModel.setUsuarioHitssId(model.getUsuarioHitssId());

		return soapModel;
	}

	public static PuestoSoap[] toSoapModels(Puesto[] models) {
		PuestoSoap[] soapModels = new PuestoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PuestoSoap[][] toSoapModels(Puesto[][] models) {
		PuestoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PuestoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PuestoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PuestoSoap[] toSoapModels(List<Puesto> models) {
		List<PuestoSoap> soapModels = new ArrayList<PuestoSoap>(models.size());

		for (Puesto model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PuestoSoap[soapModels.size()]);
	}

	public PuestoSoap() {
	}

	public long getPrimaryKey() {
		return _puestoId;
	}

	public void setPrimaryKey(long pk) {
		setPuestoId(pk);
	}

	public long getPuestoId() {
		return _puestoId;
	}

	public void setPuestoId(long puestoId) {
		_puestoId = puestoId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public Date getFechaContrato() {
		return _fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		_fechaContrato = fechaContrato;
	}

	public Date getFechaEvaluacionPsicologica() {
		return _fechaEvaluacionPsicologica;
	}

	public void setFechaEvaluacionPsicologica(Date fechaEvaluacionPsicologica) {
		_fechaEvaluacionPsicologica = fechaEvaluacionPsicologica;
	}

	public Date getFechaEvalucionTecnica() {
		return _fechaEvalucionTecnica;
	}

	public void setFechaEvalucionTecnica(Date fechaEvalucionTecnica) {
		_fechaEvalucionTecnica = fechaEvalucionTecnica;
	}

	public Date getFechaEntrevistaGerenteArea() {
		return _fechaEntrevistaGerenteArea;
	}

	public void setFechaEntrevistaGerenteArea(Date fechaEntrevistaGerenteArea) {
		_fechaEntrevistaGerenteArea = fechaEntrevistaGerenteArea;
	}

	public Date getFechaEvaluacionRRHH() {
		return _fechaEvaluacionRRHH;
	}

	public void setFechaEvaluacionRRHH(Date fechaEvaluacionRRHH) {
		_fechaEvaluacionRRHH = fechaEvaluacionRRHH;
	}

	public Date getFechaPostulacion() {
		return _fechaPostulacion;
	}

	public void setFechaPostulacion(Date fechaPostulacion) {
		_fechaPostulacion = fechaPostulacion;
	}

	public boolean getSeleccionado() {
		return _seleccionado;
	}

	public boolean isSeleccionado() {
		return _seleccionado;
	}

	public void setSeleccionado(boolean seleccionado) {
		_seleccionado = seleccionado;
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

	public long getRequerimientoRecursoId() {
		return _requerimientoRecursoId;
	}

	public void setRequerimientoRecursoId(long requerimientoRecursoId) {
		_requerimientoRecursoId = requerimientoRecursoId;
	}

	public long getUsuarioHitssId() {
		return _usuarioHitssId;
	}

	public void setUsuarioHitssId(long usuarioHitssId) {
		_usuarioHitssId = usuarioHitssId;
	}

	private long _puestoId;
	private String _descripcion;
	private Date _fechaContrato;
	private Date _fechaEvaluacionPsicologica;
	private Date _fechaEvalucionTecnica;
	private Date _fechaEntrevistaGerenteArea;
	private Date _fechaEvaluacionRRHH;
	private Date _fechaPostulacion;
	private boolean _seleccionado;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private long _requerimientoRecursoId;
	private long _usuarioHitssId;
}
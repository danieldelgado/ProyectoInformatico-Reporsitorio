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

import com.hitss.layer.service.persistence.ActividadCronogramaPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.ActividadCronogramaServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.ActividadCronogramaServiceSoap
 * @generated
 */
public class ActividadCronogramaSoap implements Serializable {
	public static ActividadCronogramaSoap toSoapModel(ActividadCronograma model) {
		ActividadCronogramaSoap soapModel = new ActividadCronogramaSoap();

		soapModel.setActividadCronogramaId(model.getActividadCronogramaId());
		soapModel.setCronogramaId(model.getCronogramaId());
		soapModel.setGrupoUsuario(model.getGrupoUsuario());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setFechaInicio(model.getFechaInicio());
		soapModel.setFechaFin(model.getFechaFin());
		soapModel.setCumplidoEvaluacion(model.getCumplidoEvaluacion());
		soapModel.setEstado(model.getEstado());
		soapModel.setFechaInicioEvaluacion(model.getFechaInicioEvaluacion());
		soapModel.setFechaFinEvaluacion(model.getFechaFinEvaluacion());
		soapModel.setTipoActividad(model.getTipoActividad());
		soapModel.setAprobadoColaborador(model.getAprobadoColaborador());
		soapModel.setJerarquiaEvaluar(model.getJerarquiaEvaluar());
		soapModel.setAprobadoLider(model.getAprobadoLider());
		soapModel.setUsuarioGerenteId(model.getUsuarioGerenteId());
		soapModel.setUsuarioLiderId(model.getUsuarioLiderId());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechamodifica(model.getFechamodifica());

		return soapModel;
	}

	public static ActividadCronogramaSoap[] toSoapModels(
		ActividadCronograma[] models) {
		ActividadCronogramaSoap[] soapModels = new ActividadCronogramaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ActividadCronogramaSoap[][] toSoapModels(
		ActividadCronograma[][] models) {
		ActividadCronogramaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ActividadCronogramaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ActividadCronogramaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ActividadCronogramaSoap[] toSoapModels(
		List<ActividadCronograma> models) {
		List<ActividadCronogramaSoap> soapModels = new ArrayList<ActividadCronogramaSoap>(models.size());

		for (ActividadCronograma model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ActividadCronogramaSoap[soapModels.size()]);
	}

	public ActividadCronogramaSoap() {
	}

	public ActividadCronogramaPK getPrimaryKey() {
		return new ActividadCronogramaPK(_actividadCronogramaId, _cronogramaId);
	}

	public void setPrimaryKey(ActividadCronogramaPK pk) {
		setActividadCronogramaId(pk.actividadCronogramaId);
		setCronogramaId(pk.cronogramaId);
	}

	public long getActividadCronogramaId() {
		return _actividadCronogramaId;
	}

	public void setActividadCronogramaId(long actividadCronogramaId) {
		_actividadCronogramaId = actividadCronogramaId;
	}

	public long getCronogramaId() {
		return _cronogramaId;
	}

	public void setCronogramaId(long cronogramaId) {
		_cronogramaId = cronogramaId;
	}

	public long getGrupoUsuario() {
		return _grupoUsuario;
	}

	public void setGrupoUsuario(long grupoUsuario) {
		_grupoUsuario = grupoUsuario;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
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

	public boolean getCumplidoEvaluacion() {
		return _cumplidoEvaluacion;
	}

	public boolean isCumplidoEvaluacion() {
		return _cumplidoEvaluacion;
	}

	public void setCumplidoEvaluacion(boolean cumplidoEvaluacion) {
		_cumplidoEvaluacion = cumplidoEvaluacion;
	}

	public long getEstado() {
		return _estado;
	}

	public void setEstado(long estado) {
		_estado = estado;
	}

	public Date getFechaInicioEvaluacion() {
		return _fechaInicioEvaluacion;
	}

	public void setFechaInicioEvaluacion(Date fechaInicioEvaluacion) {
		_fechaInicioEvaluacion = fechaInicioEvaluacion;
	}

	public Date getFechaFinEvaluacion() {
		return _fechaFinEvaluacion;
	}

	public void setFechaFinEvaluacion(Date fechaFinEvaluacion) {
		_fechaFinEvaluacion = fechaFinEvaluacion;
	}

	public long getTipoActividad() {
		return _tipoActividad;
	}

	public void setTipoActividad(long tipoActividad) {
		_tipoActividad = tipoActividad;
	}

	public long getAprobadoColaborador() {
		return _aprobadoColaborador;
	}

	public void setAprobadoColaborador(long aprobadoColaborador) {
		_aprobadoColaborador = aprobadoColaborador;
	}

	public long getJerarquiaEvaluar() {
		return _jerarquiaEvaluar;
	}

	public void setJerarquiaEvaluar(long jerarquiaEvaluar) {
		_jerarquiaEvaluar = jerarquiaEvaluar;
	}

	public long getAprobadoLider() {
		return _aprobadoLider;
	}

	public void setAprobadoLider(long aprobadoLider) {
		_aprobadoLider = aprobadoLider;
	}

	public long getUsuarioGerenteId() {
		return _usuarioGerenteId;
	}

	public void setUsuarioGerenteId(long usuarioGerenteId) {
		_usuarioGerenteId = usuarioGerenteId;
	}

	public long getUsuarioLiderId() {
		return _usuarioLiderId;
	}

	public void setUsuarioLiderId(long usuarioLiderId) {
		_usuarioLiderId = usuarioLiderId;
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
	private long _cronogramaId;
	private long _grupoUsuario;
	private String _descripcion;
	private Date _fechaInicio;
	private Date _fechaFin;
	private boolean _cumplidoEvaluacion;
	private long _estado;
	private Date _fechaInicioEvaluacion;
	private Date _fechaFinEvaluacion;
	private long _tipoActividad;
	private long _aprobadoColaborador;
	private long _jerarquiaEvaluar;
	private long _aprobadoLider;
	private long _usuarioGerenteId;
	private long _usuarioLiderId;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
}
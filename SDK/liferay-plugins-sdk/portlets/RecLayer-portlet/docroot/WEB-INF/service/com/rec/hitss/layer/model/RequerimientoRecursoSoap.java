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
 * This class is used by SOAP remote services.
 *
 * @author Crossfire
 * @generated
 */
public class RequerimientoRecursoSoap implements Serializable {
	public static RequerimientoRecursoSoap toSoapModel(
		RequerimientoRecurso model) {
		RequerimientoRecursoSoap soapModel = new RequerimientoRecursoSoap();

		soapModel.setRequerimientoRecursoId(model.getRequerimientoRecursoId());
		soapModel.setEspecialidad(model.getEspecialidad());
		soapModel.setMeta(model.getMeta());
		soapModel.setPrioridad(model.getPrioridad());
		soapModel.setMotivo(model.getMotivo());
		soapModel.setFechaSolicitada(model.getFechaSolicitada());
		soapModel.setFechaMetaIngreso(model.getFechaMetaIngreso());
		soapModel.setEstado(model.getEstado());
		soapModel.setModalidad(model.getModalidad());
		soapModel.setLugarTrabajo(model.getLugarTrabajo());
		soapModel.setObservacion(model.getObservacion());
		soapModel.setProyecto(model.getProyecto());
		soapModel.setRequiereequipotenico(model.getRequiereequipotenico());
		soapModel.setReemplazo(model.getReemplazo());
		soapModel.setRevisado(model.getRevisado());
		soapModel.setAprobadoFichaIngresoCapitalHumano(model.getAprobadoFichaIngresoCapitalHumano());
		soapModel.setObservacionFichaIngresoCapitalHumano(model.getObservacionFichaIngresoCapitalHumano());
		soapModel.setAprobadoFichaIngresoOperaciones(model.getAprobadoFichaIngresoOperaciones());
		soapModel.setObservacionFichaIngresoOperaciones(model.getObservacionFichaIngresoOperaciones());
		soapModel.setTipoReclutamiento(model.getTipoReclutamiento());
		soapModel.setSolicitudRequerimientoPersonalId(model.getSolicitudRequerimientoPersonalId());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());

		return soapModel;
	}

	public static RequerimientoRecursoSoap[] toSoapModels(
		RequerimientoRecurso[] models) {
		RequerimientoRecursoSoap[] soapModels = new RequerimientoRecursoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RequerimientoRecursoSoap[][] toSoapModels(
		RequerimientoRecurso[][] models) {
		RequerimientoRecursoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RequerimientoRecursoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RequerimientoRecursoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RequerimientoRecursoSoap[] toSoapModels(
		List<RequerimientoRecurso> models) {
		List<RequerimientoRecursoSoap> soapModels = new ArrayList<RequerimientoRecursoSoap>(models.size());

		for (RequerimientoRecurso model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RequerimientoRecursoSoap[soapModels.size()]);
	}

	public RequerimientoRecursoSoap() {
	}

	public long getPrimaryKey() {
		return _requerimientoRecursoId;
	}

	public void setPrimaryKey(long pk) {
		setRequerimientoRecursoId(pk);
	}

	public long getRequerimientoRecursoId() {
		return _requerimientoRecursoId;
	}

	public void setRequerimientoRecursoId(long requerimientoRecursoId) {
		_requerimientoRecursoId = requerimientoRecursoId;
	}

	public String getEspecialidad() {
		return _especialidad;
	}

	public void setEspecialidad(String especialidad) {
		_especialidad = especialidad;
	}

	public String getMeta() {
		return _meta;
	}

	public void setMeta(String meta) {
		_meta = meta;
	}

	public long getPrioridad() {
		return _prioridad;
	}

	public void setPrioridad(long prioridad) {
		_prioridad = prioridad;
	}

	public String getMotivo() {
		return _motivo;
	}

	public void setMotivo(String motivo) {
		_motivo = motivo;
	}

	public Date getFechaSolicitada() {
		return _fechaSolicitada;
	}

	public void setFechaSolicitada(Date fechaSolicitada) {
		_fechaSolicitada = fechaSolicitada;
	}

	public String getFechaMetaIngreso() {
		return _fechaMetaIngreso;
	}

	public void setFechaMetaIngreso(String fechaMetaIngreso) {
		_fechaMetaIngreso = fechaMetaIngreso;
	}

	public String getEstado() {
		return _estado;
	}

	public void setEstado(String estado) {
		_estado = estado;
	}

	public long getModalidad() {
		return _modalidad;
	}

	public void setModalidad(long modalidad) {
		_modalidad = modalidad;
	}

	public String getLugarTrabajo() {
		return _lugarTrabajo;
	}

	public void setLugarTrabajo(String lugarTrabajo) {
		_lugarTrabajo = lugarTrabajo;
	}

	public String getObservacion() {
		return _observacion;
	}

	public void setObservacion(String observacion) {
		_observacion = observacion;
	}

	public String getProyecto() {
		return _proyecto;
	}

	public void setProyecto(String proyecto) {
		_proyecto = proyecto;
	}

	public boolean getRequiereequipotenico() {
		return _requiereequipotenico;
	}

	public boolean isRequiereequipotenico() {
		return _requiereequipotenico;
	}

	public void setRequiereequipotenico(boolean requiereequipotenico) {
		_requiereequipotenico = requiereequipotenico;
	}

	public boolean getReemplazo() {
		return _reemplazo;
	}

	public boolean isReemplazo() {
		return _reemplazo;
	}

	public void setReemplazo(boolean reemplazo) {
		_reemplazo = reemplazo;
	}

	public boolean getRevisado() {
		return _revisado;
	}

	public boolean isRevisado() {
		return _revisado;
	}

	public void setRevisado(boolean revisado) {
		_revisado = revisado;
	}

	public boolean getAprobadoFichaIngresoCapitalHumano() {
		return _aprobadoFichaIngresoCapitalHumano;
	}

	public boolean isAprobadoFichaIngresoCapitalHumano() {
		return _aprobadoFichaIngresoCapitalHumano;
	}

	public void setAprobadoFichaIngresoCapitalHumano(
		boolean aprobadoFichaIngresoCapitalHumano) {
		_aprobadoFichaIngresoCapitalHumano = aprobadoFichaIngresoCapitalHumano;
	}

	public String getObservacionFichaIngresoCapitalHumano() {
		return _observacionFichaIngresoCapitalHumano;
	}

	public void setObservacionFichaIngresoCapitalHumano(
		String observacionFichaIngresoCapitalHumano) {
		_observacionFichaIngresoCapitalHumano = observacionFichaIngresoCapitalHumano;
	}

	public boolean getAprobadoFichaIngresoOperaciones() {
		return _aprobadoFichaIngresoOperaciones;
	}

	public boolean isAprobadoFichaIngresoOperaciones() {
		return _aprobadoFichaIngresoOperaciones;
	}

	public void setAprobadoFichaIngresoOperaciones(
		boolean aprobadoFichaIngresoOperaciones) {
		_aprobadoFichaIngresoOperaciones = aprobadoFichaIngresoOperaciones;
	}

	public String getObservacionFichaIngresoOperaciones() {
		return _observacionFichaIngresoOperaciones;
	}

	public void setObservacionFichaIngresoOperaciones(
		String observacionFichaIngresoOperaciones) {
		_observacionFichaIngresoOperaciones = observacionFichaIngresoOperaciones;
	}

	public long getTipoReclutamiento() {
		return _tipoReclutamiento;
	}

	public void setTipoReclutamiento(long tipoReclutamiento) {
		_tipoReclutamiento = tipoReclutamiento;
	}

	public long getSolicitudRequerimientoPersonalId() {
		return _solicitudRequerimientoPersonalId;
	}

	public void setSolicitudRequerimientoPersonalId(
		long solicitudRequerimientoPersonalId) {
		_solicitudRequerimientoPersonalId = solicitudRequerimientoPersonalId;
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

	private long _requerimientoRecursoId;
	private String _especialidad;
	private String _meta;
	private long _prioridad;
	private String _motivo;
	private Date _fechaSolicitada;
	private String _fechaMetaIngreso;
	private String _estado;
	private long _modalidad;
	private String _lugarTrabajo;
	private String _observacion;
	private String _proyecto;
	private boolean _requiereequipotenico;
	private boolean _reemplazo;
	private boolean _revisado;
	private boolean _aprobadoFichaIngresoCapitalHumano;
	private String _observacionFichaIngresoCapitalHumano;
	private boolean _aprobadoFichaIngresoOperaciones;
	private String _observacionFichaIngresoOperaciones;
	private long _tipoReclutamiento;
	private long _solicitudRequerimientoPersonalId;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
}
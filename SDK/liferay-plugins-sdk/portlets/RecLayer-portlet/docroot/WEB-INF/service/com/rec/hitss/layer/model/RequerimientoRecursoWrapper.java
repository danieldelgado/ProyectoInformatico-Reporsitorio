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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RequerimientoRecurso}.
 * </p>
 *
 * @author Crossfire
 * @see RequerimientoRecurso
 * @generated
 */
public class RequerimientoRecursoWrapper implements RequerimientoRecurso,
	ModelWrapper<RequerimientoRecurso> {
	public RequerimientoRecursoWrapper(
		RequerimientoRecurso requerimientoRecurso) {
		_requerimientoRecurso = requerimientoRecurso;
	}

	@Override
	public Class<?> getModelClass() {
		return RequerimientoRecurso.class;
	}

	@Override
	public String getModelClassName() {
		return RequerimientoRecurso.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("requerimientoRecursoId", getRequerimientoRecursoId());
		attributes.put("especialidad", getEspecialidad());
		attributes.put("meta", getMeta());
		attributes.put("prioridad", getPrioridad());
		attributes.put("motivo", getMotivo());
		attributes.put("fechaSolicitada", getFechaSolicitada());
		attributes.put("fechaMetaIngreso", getFechaMetaIngreso());
		attributes.put("estado", getEstado());
		attributes.put("modalidad", getModalidad());
		attributes.put("lugarTrabajo", getLugarTrabajo());
		attributes.put("observacion", getObservacion());
		attributes.put("proyecto", getProyecto());
		attributes.put("requiereequipotenico", getRequiereequipotenico());
		attributes.put("reemplazo", getReemplazo());
		attributes.put("revisado", getRevisado());
		attributes.put("aprobadoFichaIngresoCapitalHumano",
			getAprobadoFichaIngresoCapitalHumano());
		attributes.put("observacionFichaIngresoCapitalHumano",
			getObservacionFichaIngresoCapitalHumano());
		attributes.put("aprobadoFichaIngresoOperaciones",
			getAprobadoFichaIngresoOperaciones());
		attributes.put("observacionFichaIngresoOperaciones",
			getObservacionFichaIngresoOperaciones());
		attributes.put("tipoReclutamiento", getTipoReclutamiento());
		attributes.put("solicitudRequerimientoPersonalId",
			getSolicitudRequerimientoPersonalId());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long requerimientoRecursoId = (Long)attributes.get(
				"requerimientoRecursoId");

		if (requerimientoRecursoId != null) {
			setRequerimientoRecursoId(requerimientoRecursoId);
		}

		String especialidad = (String)attributes.get("especialidad");

		if (especialidad != null) {
			setEspecialidad(especialidad);
		}

		String meta = (String)attributes.get("meta");

		if (meta != null) {
			setMeta(meta);
		}

		Long prioridad = (Long)attributes.get("prioridad");

		if (prioridad != null) {
			setPrioridad(prioridad);
		}

		String motivo = (String)attributes.get("motivo");

		if (motivo != null) {
			setMotivo(motivo);
		}

		Date fechaSolicitada = (Date)attributes.get("fechaSolicitada");

		if (fechaSolicitada != null) {
			setFechaSolicitada(fechaSolicitada);
		}

		String fechaMetaIngreso = (String)attributes.get("fechaMetaIngreso");

		if (fechaMetaIngreso != null) {
			setFechaMetaIngreso(fechaMetaIngreso);
		}

		String estado = (String)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		Long modalidad = (Long)attributes.get("modalidad");

		if (modalidad != null) {
			setModalidad(modalidad);
		}

		String lugarTrabajo = (String)attributes.get("lugarTrabajo");

		if (lugarTrabajo != null) {
			setLugarTrabajo(lugarTrabajo);
		}

		String observacion = (String)attributes.get("observacion");

		if (observacion != null) {
			setObservacion(observacion);
		}

		String proyecto = (String)attributes.get("proyecto");

		if (proyecto != null) {
			setProyecto(proyecto);
		}

		Boolean requiereequipotenico = (Boolean)attributes.get(
				"requiereequipotenico");

		if (requiereequipotenico != null) {
			setRequiereequipotenico(requiereequipotenico);
		}

		Boolean reemplazo = (Boolean)attributes.get("reemplazo");

		if (reemplazo != null) {
			setReemplazo(reemplazo);
		}

		Boolean revisado = (Boolean)attributes.get("revisado");

		if (revisado != null) {
			setRevisado(revisado);
		}

		Boolean aprobadoFichaIngresoCapitalHumano = (Boolean)attributes.get(
				"aprobadoFichaIngresoCapitalHumano");

		if (aprobadoFichaIngresoCapitalHumano != null) {
			setAprobadoFichaIngresoCapitalHumano(aprobadoFichaIngresoCapitalHumano);
		}

		String observacionFichaIngresoCapitalHumano = (String)attributes.get(
				"observacionFichaIngresoCapitalHumano");

		if (observacionFichaIngresoCapitalHumano != null) {
			setObservacionFichaIngresoCapitalHumano(observacionFichaIngresoCapitalHumano);
		}

		Boolean aprobadoFichaIngresoOperaciones = (Boolean)attributes.get(
				"aprobadoFichaIngresoOperaciones");

		if (aprobadoFichaIngresoOperaciones != null) {
			setAprobadoFichaIngresoOperaciones(aprobadoFichaIngresoOperaciones);
		}

		String observacionFichaIngresoOperaciones = (String)attributes.get(
				"observacionFichaIngresoOperaciones");

		if (observacionFichaIngresoOperaciones != null) {
			setObservacionFichaIngresoOperaciones(observacionFichaIngresoOperaciones);
		}

		Long tipoReclutamiento = (Long)attributes.get("tipoReclutamiento");

		if (tipoReclutamiento != null) {
			setTipoReclutamiento(tipoReclutamiento);
		}

		Long solicitudRequerimientoPersonalId = (Long)attributes.get(
				"solicitudRequerimientoPersonalId");

		if (solicitudRequerimientoPersonalId != null) {
			setSolicitudRequerimientoPersonalId(solicitudRequerimientoPersonalId);
		}

		Boolean activo = (Boolean)attributes.get("activo");

		if (activo != null) {
			setActivo(activo);
		}

		Long usuariocrea = (Long)attributes.get("usuariocrea");

		if (usuariocrea != null) {
			setUsuariocrea(usuariocrea);
		}

		Date fechacrea = (Date)attributes.get("fechacrea");

		if (fechacrea != null) {
			setFechacrea(fechacrea);
		}

		Long usuariomodifica = (Long)attributes.get("usuariomodifica");

		if (usuariomodifica != null) {
			setUsuariomodifica(usuariomodifica);
		}

		Date fechacreamodifica = (Date)attributes.get("fechacreamodifica");

		if (fechacreamodifica != null) {
			setFechacreamodifica(fechacreamodifica);
		}
	}

	/**
	* Returns the primary key of this requerimiento recurso.
	*
	* @return the primary key of this requerimiento recurso
	*/
	@Override
	public long getPrimaryKey() {
		return _requerimientoRecurso.getPrimaryKey();
	}

	/**
	* Sets the primary key of this requerimiento recurso.
	*
	* @param primaryKey the primary key of this requerimiento recurso
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_requerimientoRecurso.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the requerimiento recurso ID of this requerimiento recurso.
	*
	* @return the requerimiento recurso ID of this requerimiento recurso
	*/
	@Override
	public long getRequerimientoRecursoId() {
		return _requerimientoRecurso.getRequerimientoRecursoId();
	}

	/**
	* Sets the requerimiento recurso ID of this requerimiento recurso.
	*
	* @param requerimientoRecursoId the requerimiento recurso ID of this requerimiento recurso
	*/
	@Override
	public void setRequerimientoRecursoId(long requerimientoRecursoId) {
		_requerimientoRecurso.setRequerimientoRecursoId(requerimientoRecursoId);
	}

	/**
	* Returns the especialidad of this requerimiento recurso.
	*
	* @return the especialidad of this requerimiento recurso
	*/
	@Override
	public java.lang.String getEspecialidad() {
		return _requerimientoRecurso.getEspecialidad();
	}

	/**
	* Sets the especialidad of this requerimiento recurso.
	*
	* @param especialidad the especialidad of this requerimiento recurso
	*/
	@Override
	public void setEspecialidad(java.lang.String especialidad) {
		_requerimientoRecurso.setEspecialidad(especialidad);
	}

	/**
	* Returns the meta of this requerimiento recurso.
	*
	* @return the meta of this requerimiento recurso
	*/
	@Override
	public java.lang.String getMeta() {
		return _requerimientoRecurso.getMeta();
	}

	/**
	* Sets the meta of this requerimiento recurso.
	*
	* @param meta the meta of this requerimiento recurso
	*/
	@Override
	public void setMeta(java.lang.String meta) {
		_requerimientoRecurso.setMeta(meta);
	}

	/**
	* Returns the prioridad of this requerimiento recurso.
	*
	* @return the prioridad of this requerimiento recurso
	*/
	@Override
	public long getPrioridad() {
		return _requerimientoRecurso.getPrioridad();
	}

	/**
	* Sets the prioridad of this requerimiento recurso.
	*
	* @param prioridad the prioridad of this requerimiento recurso
	*/
	@Override
	public void setPrioridad(long prioridad) {
		_requerimientoRecurso.setPrioridad(prioridad);
	}

	/**
	* Returns the motivo of this requerimiento recurso.
	*
	* @return the motivo of this requerimiento recurso
	*/
	@Override
	public java.lang.String getMotivo() {
		return _requerimientoRecurso.getMotivo();
	}

	/**
	* Sets the motivo of this requerimiento recurso.
	*
	* @param motivo the motivo of this requerimiento recurso
	*/
	@Override
	public void setMotivo(java.lang.String motivo) {
		_requerimientoRecurso.setMotivo(motivo);
	}

	/**
	* Returns the fecha solicitada of this requerimiento recurso.
	*
	* @return the fecha solicitada of this requerimiento recurso
	*/
	@Override
	public java.util.Date getFechaSolicitada() {
		return _requerimientoRecurso.getFechaSolicitada();
	}

	/**
	* Sets the fecha solicitada of this requerimiento recurso.
	*
	* @param fechaSolicitada the fecha solicitada of this requerimiento recurso
	*/
	@Override
	public void setFechaSolicitada(java.util.Date fechaSolicitada) {
		_requerimientoRecurso.setFechaSolicitada(fechaSolicitada);
	}

	/**
	* Returns the fecha meta ingreso of this requerimiento recurso.
	*
	* @return the fecha meta ingreso of this requerimiento recurso
	*/
	@Override
	public java.lang.String getFechaMetaIngreso() {
		return _requerimientoRecurso.getFechaMetaIngreso();
	}

	/**
	* Sets the fecha meta ingreso of this requerimiento recurso.
	*
	* @param fechaMetaIngreso the fecha meta ingreso of this requerimiento recurso
	*/
	@Override
	public void setFechaMetaIngreso(java.lang.String fechaMetaIngreso) {
		_requerimientoRecurso.setFechaMetaIngreso(fechaMetaIngreso);
	}

	/**
	* Returns the estado of this requerimiento recurso.
	*
	* @return the estado of this requerimiento recurso
	*/
	@Override
	public java.lang.String getEstado() {
		return _requerimientoRecurso.getEstado();
	}

	/**
	* Sets the estado of this requerimiento recurso.
	*
	* @param estado the estado of this requerimiento recurso
	*/
	@Override
	public void setEstado(java.lang.String estado) {
		_requerimientoRecurso.setEstado(estado);
	}

	/**
	* Returns the modalidad of this requerimiento recurso.
	*
	* @return the modalidad of this requerimiento recurso
	*/
	@Override
	public long getModalidad() {
		return _requerimientoRecurso.getModalidad();
	}

	/**
	* Sets the modalidad of this requerimiento recurso.
	*
	* @param modalidad the modalidad of this requerimiento recurso
	*/
	@Override
	public void setModalidad(long modalidad) {
		_requerimientoRecurso.setModalidad(modalidad);
	}

	/**
	* Returns the lugar trabajo of this requerimiento recurso.
	*
	* @return the lugar trabajo of this requerimiento recurso
	*/
	@Override
	public java.lang.String getLugarTrabajo() {
		return _requerimientoRecurso.getLugarTrabajo();
	}

	/**
	* Sets the lugar trabajo of this requerimiento recurso.
	*
	* @param lugarTrabajo the lugar trabajo of this requerimiento recurso
	*/
	@Override
	public void setLugarTrabajo(java.lang.String lugarTrabajo) {
		_requerimientoRecurso.setLugarTrabajo(lugarTrabajo);
	}

	/**
	* Returns the observacion of this requerimiento recurso.
	*
	* @return the observacion of this requerimiento recurso
	*/
	@Override
	public java.lang.String getObservacion() {
		return _requerimientoRecurso.getObservacion();
	}

	/**
	* Sets the observacion of this requerimiento recurso.
	*
	* @param observacion the observacion of this requerimiento recurso
	*/
	@Override
	public void setObservacion(java.lang.String observacion) {
		_requerimientoRecurso.setObservacion(observacion);
	}

	/**
	* Returns the proyecto of this requerimiento recurso.
	*
	* @return the proyecto of this requerimiento recurso
	*/
	@Override
	public java.lang.String getProyecto() {
		return _requerimientoRecurso.getProyecto();
	}

	/**
	* Sets the proyecto of this requerimiento recurso.
	*
	* @param proyecto the proyecto of this requerimiento recurso
	*/
	@Override
	public void setProyecto(java.lang.String proyecto) {
		_requerimientoRecurso.setProyecto(proyecto);
	}

	/**
	* Returns the requiereequipotenico of this requerimiento recurso.
	*
	* @return the requiereequipotenico of this requerimiento recurso
	*/
	@Override
	public boolean getRequiereequipotenico() {
		return _requerimientoRecurso.getRequiereequipotenico();
	}

	/**
	* Returns <code>true</code> if this requerimiento recurso is requiereequipotenico.
	*
	* @return <code>true</code> if this requerimiento recurso is requiereequipotenico; <code>false</code> otherwise
	*/
	@Override
	public boolean isRequiereequipotenico() {
		return _requerimientoRecurso.isRequiereequipotenico();
	}

	/**
	* Sets whether this requerimiento recurso is requiereequipotenico.
	*
	* @param requiereequipotenico the requiereequipotenico of this requerimiento recurso
	*/
	@Override
	public void setRequiereequipotenico(boolean requiereequipotenico) {
		_requerimientoRecurso.setRequiereequipotenico(requiereequipotenico);
	}

	/**
	* Returns the reemplazo of this requerimiento recurso.
	*
	* @return the reemplazo of this requerimiento recurso
	*/
	@Override
	public boolean getReemplazo() {
		return _requerimientoRecurso.getReemplazo();
	}

	/**
	* Returns <code>true</code> if this requerimiento recurso is reemplazo.
	*
	* @return <code>true</code> if this requerimiento recurso is reemplazo; <code>false</code> otherwise
	*/
	@Override
	public boolean isReemplazo() {
		return _requerimientoRecurso.isReemplazo();
	}

	/**
	* Sets whether this requerimiento recurso is reemplazo.
	*
	* @param reemplazo the reemplazo of this requerimiento recurso
	*/
	@Override
	public void setReemplazo(boolean reemplazo) {
		_requerimientoRecurso.setReemplazo(reemplazo);
	}

	/**
	* Returns the revisado of this requerimiento recurso.
	*
	* @return the revisado of this requerimiento recurso
	*/
	@Override
	public boolean getRevisado() {
		return _requerimientoRecurso.getRevisado();
	}

	/**
	* Returns <code>true</code> if this requerimiento recurso is revisado.
	*
	* @return <code>true</code> if this requerimiento recurso is revisado; <code>false</code> otherwise
	*/
	@Override
	public boolean isRevisado() {
		return _requerimientoRecurso.isRevisado();
	}

	/**
	* Sets whether this requerimiento recurso is revisado.
	*
	* @param revisado the revisado of this requerimiento recurso
	*/
	@Override
	public void setRevisado(boolean revisado) {
		_requerimientoRecurso.setRevisado(revisado);
	}

	/**
	* Returns the aprobado ficha ingreso capital humano of this requerimiento recurso.
	*
	* @return the aprobado ficha ingreso capital humano of this requerimiento recurso
	*/
	@Override
	public boolean getAprobadoFichaIngresoCapitalHumano() {
		return _requerimientoRecurso.getAprobadoFichaIngresoCapitalHumano();
	}

	/**
	* Returns <code>true</code> if this requerimiento recurso is aprobado ficha ingreso capital humano.
	*
	* @return <code>true</code> if this requerimiento recurso is aprobado ficha ingreso capital humano; <code>false</code> otherwise
	*/
	@Override
	public boolean isAprobadoFichaIngresoCapitalHumano() {
		return _requerimientoRecurso.isAprobadoFichaIngresoCapitalHumano();
	}

	/**
	* Sets whether this requerimiento recurso is aprobado ficha ingreso capital humano.
	*
	* @param aprobadoFichaIngresoCapitalHumano the aprobado ficha ingreso capital humano of this requerimiento recurso
	*/
	@Override
	public void setAprobadoFichaIngresoCapitalHumano(
		boolean aprobadoFichaIngresoCapitalHumano) {
		_requerimientoRecurso.setAprobadoFichaIngresoCapitalHumano(aprobadoFichaIngresoCapitalHumano);
	}

	/**
	* Returns the observacion ficha ingreso capital humano of this requerimiento recurso.
	*
	* @return the observacion ficha ingreso capital humano of this requerimiento recurso
	*/
	@Override
	public java.lang.String getObservacionFichaIngresoCapitalHumano() {
		return _requerimientoRecurso.getObservacionFichaIngresoCapitalHumano();
	}

	/**
	* Sets the observacion ficha ingreso capital humano of this requerimiento recurso.
	*
	* @param observacionFichaIngresoCapitalHumano the observacion ficha ingreso capital humano of this requerimiento recurso
	*/
	@Override
	public void setObservacionFichaIngresoCapitalHumano(
		java.lang.String observacionFichaIngresoCapitalHumano) {
		_requerimientoRecurso.setObservacionFichaIngresoCapitalHumano(observacionFichaIngresoCapitalHumano);
	}

	/**
	* Returns the aprobado ficha ingreso operaciones of this requerimiento recurso.
	*
	* @return the aprobado ficha ingreso operaciones of this requerimiento recurso
	*/
	@Override
	public boolean getAprobadoFichaIngresoOperaciones() {
		return _requerimientoRecurso.getAprobadoFichaIngresoOperaciones();
	}

	/**
	* Returns <code>true</code> if this requerimiento recurso is aprobado ficha ingreso operaciones.
	*
	* @return <code>true</code> if this requerimiento recurso is aprobado ficha ingreso operaciones; <code>false</code> otherwise
	*/
	@Override
	public boolean isAprobadoFichaIngresoOperaciones() {
		return _requerimientoRecurso.isAprobadoFichaIngresoOperaciones();
	}

	/**
	* Sets whether this requerimiento recurso is aprobado ficha ingreso operaciones.
	*
	* @param aprobadoFichaIngresoOperaciones the aprobado ficha ingreso operaciones of this requerimiento recurso
	*/
	@Override
	public void setAprobadoFichaIngresoOperaciones(
		boolean aprobadoFichaIngresoOperaciones) {
		_requerimientoRecurso.setAprobadoFichaIngresoOperaciones(aprobadoFichaIngresoOperaciones);
	}

	/**
	* Returns the observacion ficha ingreso operaciones of this requerimiento recurso.
	*
	* @return the observacion ficha ingreso operaciones of this requerimiento recurso
	*/
	@Override
	public java.lang.String getObservacionFichaIngresoOperaciones() {
		return _requerimientoRecurso.getObservacionFichaIngresoOperaciones();
	}

	/**
	* Sets the observacion ficha ingreso operaciones of this requerimiento recurso.
	*
	* @param observacionFichaIngresoOperaciones the observacion ficha ingreso operaciones of this requerimiento recurso
	*/
	@Override
	public void setObservacionFichaIngresoOperaciones(
		java.lang.String observacionFichaIngresoOperaciones) {
		_requerimientoRecurso.setObservacionFichaIngresoOperaciones(observacionFichaIngresoOperaciones);
	}

	/**
	* Returns the tipo reclutamiento of this requerimiento recurso.
	*
	* @return the tipo reclutamiento of this requerimiento recurso
	*/
	@Override
	public long getTipoReclutamiento() {
		return _requerimientoRecurso.getTipoReclutamiento();
	}

	/**
	* Sets the tipo reclutamiento of this requerimiento recurso.
	*
	* @param tipoReclutamiento the tipo reclutamiento of this requerimiento recurso
	*/
	@Override
	public void setTipoReclutamiento(long tipoReclutamiento) {
		_requerimientoRecurso.setTipoReclutamiento(tipoReclutamiento);
	}

	/**
	* Returns the solicitud requerimiento personal ID of this requerimiento recurso.
	*
	* @return the solicitud requerimiento personal ID of this requerimiento recurso
	*/
	@Override
	public long getSolicitudRequerimientoPersonalId() {
		return _requerimientoRecurso.getSolicitudRequerimientoPersonalId();
	}

	/**
	* Sets the solicitud requerimiento personal ID of this requerimiento recurso.
	*
	* @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID of this requerimiento recurso
	*/
	@Override
	public void setSolicitudRequerimientoPersonalId(
		long solicitudRequerimientoPersonalId) {
		_requerimientoRecurso.setSolicitudRequerimientoPersonalId(solicitudRequerimientoPersonalId);
	}

	/**
	* Returns the activo of this requerimiento recurso.
	*
	* @return the activo of this requerimiento recurso
	*/
	@Override
	public boolean getActivo() {
		return _requerimientoRecurso.getActivo();
	}

	/**
	* Returns <code>true</code> if this requerimiento recurso is activo.
	*
	* @return <code>true</code> if this requerimiento recurso is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _requerimientoRecurso.isActivo();
	}

	/**
	* Sets whether this requerimiento recurso is activo.
	*
	* @param activo the activo of this requerimiento recurso
	*/
	@Override
	public void setActivo(boolean activo) {
		_requerimientoRecurso.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this requerimiento recurso.
	*
	* @return the usuariocrea of this requerimiento recurso
	*/
	@Override
	public long getUsuariocrea() {
		return _requerimientoRecurso.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this requerimiento recurso.
	*
	* @param usuariocrea the usuariocrea of this requerimiento recurso
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_requerimientoRecurso.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this requerimiento recurso.
	*
	* @return the fechacrea of this requerimiento recurso
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _requerimientoRecurso.getFechacrea();
	}

	/**
	* Sets the fechacrea of this requerimiento recurso.
	*
	* @param fechacrea the fechacrea of this requerimiento recurso
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_requerimientoRecurso.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this requerimiento recurso.
	*
	* @return the usuariomodifica of this requerimiento recurso
	*/
	@Override
	public long getUsuariomodifica() {
		return _requerimientoRecurso.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this requerimiento recurso.
	*
	* @param usuariomodifica the usuariomodifica of this requerimiento recurso
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_requerimientoRecurso.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this requerimiento recurso.
	*
	* @return the fechacreamodifica of this requerimiento recurso
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _requerimientoRecurso.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this requerimiento recurso.
	*
	* @param fechacreamodifica the fechacreamodifica of this requerimiento recurso
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_requerimientoRecurso.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _requerimientoRecurso.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_requerimientoRecurso.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _requerimientoRecurso.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_requerimientoRecurso.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _requerimientoRecurso.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _requerimientoRecurso.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_requerimientoRecurso.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _requerimientoRecurso.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_requerimientoRecurso.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_requerimientoRecurso.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_requerimientoRecurso.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RequerimientoRecursoWrapper((RequerimientoRecurso)_requerimientoRecurso.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.RequerimientoRecurso requerimientoRecurso) {
		return _requerimientoRecurso.compareTo(requerimientoRecurso);
	}

	@Override
	public int hashCode() {
		return _requerimientoRecurso.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.RequerimientoRecurso> toCacheModel() {
		return _requerimientoRecurso.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.RequerimientoRecurso toEscapedModel() {
		return new RequerimientoRecursoWrapper(_requerimientoRecurso.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.RequerimientoRecurso toUnescapedModel() {
		return new RequerimientoRecursoWrapper(_requerimientoRecurso.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _requerimientoRecurso.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _requerimientoRecurso.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_requerimientoRecurso.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RequerimientoRecursoWrapper)) {
			return false;
		}

		RequerimientoRecursoWrapper requerimientoRecursoWrapper = (RequerimientoRecursoWrapper)obj;

		if (Validator.equals(_requerimientoRecurso,
					requerimientoRecursoWrapper._requerimientoRecurso)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public RequerimientoRecurso getWrappedRequerimientoRecurso() {
		return _requerimientoRecurso;
	}

	@Override
	public RequerimientoRecurso getWrappedModel() {
		return _requerimientoRecurso;
	}

	@Override
	public void resetOriginalValues() {
		_requerimientoRecurso.resetOriginalValues();
	}

	private RequerimientoRecurso _requerimientoRecurso;
}
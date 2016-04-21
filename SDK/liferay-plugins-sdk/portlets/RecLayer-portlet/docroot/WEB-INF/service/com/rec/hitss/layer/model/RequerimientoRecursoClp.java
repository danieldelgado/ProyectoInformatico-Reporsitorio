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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.rec.hitss.layer.service.ClpSerializer;
import com.rec.hitss.layer.service.RequerimientoRecursoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class RequerimientoRecursoClp extends BaseModelImpl<RequerimientoRecurso>
	implements RequerimientoRecurso {
	public RequerimientoRecursoClp() {
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
	public long getPrimaryKey() {
		return _requerimientoRecursoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRequerimientoRecursoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _requerimientoRecursoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getRequerimientoRecursoId() {
		return _requerimientoRecursoId;
	}

	@Override
	public void setRequerimientoRecursoId(long requerimientoRecursoId) {
		_requerimientoRecursoId = requerimientoRecursoId;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setRequerimientoRecursoId",
						long.class);

				method.invoke(_requerimientoRecursoRemoteModel,
					requerimientoRecursoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEspecialidad() {
		return _especialidad;
	}

	@Override
	public void setEspecialidad(String especialidad) {
		_especialidad = especialidad;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setEspecialidad", String.class);

				method.invoke(_requerimientoRecursoRemoteModel, especialidad);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMeta() {
		return _meta;
	}

	@Override
	public void setMeta(String meta) {
		_meta = meta;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setMeta", String.class);

				method.invoke(_requerimientoRecursoRemoteModel, meta);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPrioridad() {
		return _prioridad;
	}

	@Override
	public void setPrioridad(long prioridad) {
		_prioridad = prioridad;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setPrioridad", long.class);

				method.invoke(_requerimientoRecursoRemoteModel, prioridad);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMotivo() {
		return _motivo;
	}

	@Override
	public void setMotivo(String motivo) {
		_motivo = motivo;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setMotivo", String.class);

				method.invoke(_requerimientoRecursoRemoteModel, motivo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaSolicitada() {
		return _fechaSolicitada;
	}

	@Override
	public void setFechaSolicitada(Date fechaSolicitada) {
		_fechaSolicitada = fechaSolicitada;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaSolicitada", Date.class);

				method.invoke(_requerimientoRecursoRemoteModel, fechaSolicitada);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFechaMetaIngreso() {
		return _fechaMetaIngreso;
	}

	@Override
	public void setFechaMetaIngreso(String fechaMetaIngreso) {
		_fechaMetaIngreso = fechaMetaIngreso;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaMetaIngreso",
						String.class);

				method.invoke(_requerimientoRecursoRemoteModel, fechaMetaIngreso);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEstado() {
		return _estado;
	}

	@Override
	public void setEstado(String estado) {
		_estado = estado;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setEstado", String.class);

				method.invoke(_requerimientoRecursoRemoteModel, estado);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getModalidad() {
		return _modalidad;
	}

	@Override
	public void setModalidad(long modalidad) {
		_modalidad = modalidad;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setModalidad", long.class);

				method.invoke(_requerimientoRecursoRemoteModel, modalidad);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLugarTrabajo() {
		return _lugarTrabajo;
	}

	@Override
	public void setLugarTrabajo(String lugarTrabajo) {
		_lugarTrabajo = lugarTrabajo;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setLugarTrabajo", String.class);

				method.invoke(_requerimientoRecursoRemoteModel, lugarTrabajo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getObservacion() {
		return _observacion;
	}

	@Override
	public void setObservacion(String observacion) {
		_observacion = observacion;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setObservacion", String.class);

				method.invoke(_requerimientoRecursoRemoteModel, observacion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProyecto() {
		return _proyecto;
	}

	@Override
	public void setProyecto(String proyecto) {
		_proyecto = proyecto;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setProyecto", String.class);

				method.invoke(_requerimientoRecursoRemoteModel, proyecto);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getRequiereequipotenico() {
		return _requiereequipotenico;
	}

	@Override
	public boolean isRequiereequipotenico() {
		return _requiereequipotenico;
	}

	@Override
	public void setRequiereequipotenico(boolean requiereequipotenico) {
		_requiereequipotenico = requiereequipotenico;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setRequiereequipotenico",
						boolean.class);

				method.invoke(_requerimientoRecursoRemoteModel,
					requiereequipotenico);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getReemplazo() {
		return _reemplazo;
	}

	@Override
	public boolean isReemplazo() {
		return _reemplazo;
	}

	@Override
	public void setReemplazo(boolean reemplazo) {
		_reemplazo = reemplazo;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setReemplazo", boolean.class);

				method.invoke(_requerimientoRecursoRemoteModel, reemplazo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getRevisado() {
		return _revisado;
	}

	@Override
	public boolean isRevisado() {
		return _revisado;
	}

	@Override
	public void setRevisado(boolean revisado) {
		_revisado = revisado;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setRevisado", boolean.class);

				method.invoke(_requerimientoRecursoRemoteModel, revisado);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getAprobadoFichaIngresoCapitalHumano() {
		return _aprobadoFichaIngresoCapitalHumano;
	}

	@Override
	public boolean isAprobadoFichaIngresoCapitalHumano() {
		return _aprobadoFichaIngresoCapitalHumano;
	}

	@Override
	public void setAprobadoFichaIngresoCapitalHumano(
		boolean aprobadoFichaIngresoCapitalHumano) {
		_aprobadoFichaIngresoCapitalHumano = aprobadoFichaIngresoCapitalHumano;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setAprobadoFichaIngresoCapitalHumano",
						boolean.class);

				method.invoke(_requerimientoRecursoRemoteModel,
					aprobadoFichaIngresoCapitalHumano);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getObservacionFichaIngresoCapitalHumano() {
		return _observacionFichaIngresoCapitalHumano;
	}

	@Override
	public void setObservacionFichaIngresoCapitalHumano(
		String observacionFichaIngresoCapitalHumano) {
		_observacionFichaIngresoCapitalHumano = observacionFichaIngresoCapitalHumano;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setObservacionFichaIngresoCapitalHumano",
						String.class);

				method.invoke(_requerimientoRecursoRemoteModel,
					observacionFichaIngresoCapitalHumano);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getAprobadoFichaIngresoOperaciones() {
		return _aprobadoFichaIngresoOperaciones;
	}

	@Override
	public boolean isAprobadoFichaIngresoOperaciones() {
		return _aprobadoFichaIngresoOperaciones;
	}

	@Override
	public void setAprobadoFichaIngresoOperaciones(
		boolean aprobadoFichaIngresoOperaciones) {
		_aprobadoFichaIngresoOperaciones = aprobadoFichaIngresoOperaciones;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setAprobadoFichaIngresoOperaciones",
						boolean.class);

				method.invoke(_requerimientoRecursoRemoteModel,
					aprobadoFichaIngresoOperaciones);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getObservacionFichaIngresoOperaciones() {
		return _observacionFichaIngresoOperaciones;
	}

	@Override
	public void setObservacionFichaIngresoOperaciones(
		String observacionFichaIngresoOperaciones) {
		_observacionFichaIngresoOperaciones = observacionFichaIngresoOperaciones;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setObservacionFichaIngresoOperaciones",
						String.class);

				method.invoke(_requerimientoRecursoRemoteModel,
					observacionFichaIngresoOperaciones);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTipoReclutamiento() {
		return _tipoReclutamiento;
	}

	@Override
	public void setTipoReclutamiento(long tipoReclutamiento) {
		_tipoReclutamiento = tipoReclutamiento;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setTipoReclutamiento",
						long.class);

				method.invoke(_requerimientoRecursoRemoteModel,
					tipoReclutamiento);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSolicitudRequerimientoPersonalId() {
		return _solicitudRequerimientoPersonalId;
	}

	@Override
	public void setSolicitudRequerimientoPersonalId(
		long solicitudRequerimientoPersonalId) {
		_solicitudRequerimientoPersonalId = solicitudRequerimientoPersonalId;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setSolicitudRequerimientoPersonalId",
						long.class);

				method.invoke(_requerimientoRecursoRemoteModel,
					solicitudRequerimientoPersonalId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getActivo() {
		return _activo;
	}

	@Override
	public boolean isActivo() {
		return _activo;
	}

	@Override
	public void setActivo(boolean activo) {
		_activo = activo;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_requerimientoRecursoRemoteModel, activo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUsuariocrea() {
		return _usuariocrea;
	}

	@Override
	public void setUsuariocrea(long usuariocrea) {
		_usuariocrea = usuariocrea;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_requerimientoRecursoRemoteModel, usuariocrea);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechacrea() {
		return _fechacrea;
	}

	@Override
	public void setFechacrea(Date fechacrea) {
		_fechacrea = fechacrea;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_requerimientoRecursoRemoteModel, fechacrea);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUsuariomodifica() {
		return _usuariomodifica;
	}

	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_usuariomodifica = usuariomodifica;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_requerimientoRecursoRemoteModel, usuariomodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechacreamodifica() {
		return _fechacreamodifica;
	}

	@Override
	public void setFechacreamodifica(Date fechacreamodifica) {
		_fechacreamodifica = fechacreamodifica;

		if (_requerimientoRecursoRemoteModel != null) {
			try {
				Class<?> clazz = _requerimientoRecursoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_requerimientoRecursoRemoteModel,
					fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRequerimientoRecursoRemoteModel() {
		return _requerimientoRecursoRemoteModel;
	}

	public void setRequerimientoRecursoRemoteModel(
		BaseModel<?> requerimientoRecursoRemoteModel) {
		_requerimientoRecursoRemoteModel = requerimientoRecursoRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _requerimientoRecursoRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_requerimientoRecursoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RequerimientoRecursoLocalServiceUtil.addRequerimientoRecurso(this);
		}
		else {
			RequerimientoRecursoLocalServiceUtil.updateRequerimientoRecurso(this);
		}
	}

	@Override
	public RequerimientoRecurso toEscapedModel() {
		return (RequerimientoRecurso)ProxyUtil.newProxyInstance(RequerimientoRecurso.class.getClassLoader(),
			new Class[] { RequerimientoRecurso.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RequerimientoRecursoClp clone = new RequerimientoRecursoClp();

		clone.setRequerimientoRecursoId(getRequerimientoRecursoId());
		clone.setEspecialidad(getEspecialidad());
		clone.setMeta(getMeta());
		clone.setPrioridad(getPrioridad());
		clone.setMotivo(getMotivo());
		clone.setFechaSolicitada(getFechaSolicitada());
		clone.setFechaMetaIngreso(getFechaMetaIngreso());
		clone.setEstado(getEstado());
		clone.setModalidad(getModalidad());
		clone.setLugarTrabajo(getLugarTrabajo());
		clone.setObservacion(getObservacion());
		clone.setProyecto(getProyecto());
		clone.setRequiereequipotenico(getRequiereequipotenico());
		clone.setReemplazo(getReemplazo());
		clone.setRevisado(getRevisado());
		clone.setAprobadoFichaIngresoCapitalHumano(getAprobadoFichaIngresoCapitalHumano());
		clone.setObservacionFichaIngresoCapitalHumano(getObservacionFichaIngresoCapitalHumano());
		clone.setAprobadoFichaIngresoOperaciones(getAprobadoFichaIngresoOperaciones());
		clone.setObservacionFichaIngresoOperaciones(getObservacionFichaIngresoOperaciones());
		clone.setTipoReclutamiento(getTipoReclutamiento());
		clone.setSolicitudRequerimientoPersonalId(getSolicitudRequerimientoPersonalId());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());

		return clone;
	}

	@Override
	public int compareTo(RequerimientoRecurso requerimientoRecurso) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(),
				requerimientoRecurso.getFechacrea());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RequerimientoRecursoClp)) {
			return false;
		}

		RequerimientoRecursoClp requerimientoRecurso = (RequerimientoRecursoClp)obj;

		long primaryKey = requerimientoRecurso.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{requerimientoRecursoId=");
		sb.append(getRequerimientoRecursoId());
		sb.append(", especialidad=");
		sb.append(getEspecialidad());
		sb.append(", meta=");
		sb.append(getMeta());
		sb.append(", prioridad=");
		sb.append(getPrioridad());
		sb.append(", motivo=");
		sb.append(getMotivo());
		sb.append(", fechaSolicitada=");
		sb.append(getFechaSolicitada());
		sb.append(", fechaMetaIngreso=");
		sb.append(getFechaMetaIngreso());
		sb.append(", estado=");
		sb.append(getEstado());
		sb.append(", modalidad=");
		sb.append(getModalidad());
		sb.append(", lugarTrabajo=");
		sb.append(getLugarTrabajo());
		sb.append(", observacion=");
		sb.append(getObservacion());
		sb.append(", proyecto=");
		sb.append(getProyecto());
		sb.append(", requiereequipotenico=");
		sb.append(getRequiereequipotenico());
		sb.append(", reemplazo=");
		sb.append(getReemplazo());
		sb.append(", revisado=");
		sb.append(getRevisado());
		sb.append(", aprobadoFichaIngresoCapitalHumano=");
		sb.append(getAprobadoFichaIngresoCapitalHumano());
		sb.append(", observacionFichaIngresoCapitalHumano=");
		sb.append(getObservacionFichaIngresoCapitalHumano());
		sb.append(", aprobadoFichaIngresoOperaciones=");
		sb.append(getAprobadoFichaIngresoOperaciones());
		sb.append(", observacionFichaIngresoOperaciones=");
		sb.append(getObservacionFichaIngresoOperaciones());
		sb.append(", tipoReclutamiento=");
		sb.append(getTipoReclutamiento());
		sb.append(", solicitudRequerimientoPersonalId=");
		sb.append(getSolicitudRequerimientoPersonalId());
		sb.append(", activo=");
		sb.append(getActivo());
		sb.append(", usuariocrea=");
		sb.append(getUsuariocrea());
		sb.append(", fechacrea=");
		sb.append(getFechacrea());
		sb.append(", usuariomodifica=");
		sb.append(getUsuariomodifica());
		sb.append(", fechacreamodifica=");
		sb.append(getFechacreamodifica());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(82);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.RequerimientoRecurso");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>requerimientoRecursoId</column-name><column-value><![CDATA[");
		sb.append(getRequerimientoRecursoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>especialidad</column-name><column-value><![CDATA[");
		sb.append(getEspecialidad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>meta</column-name><column-value><![CDATA[");
		sb.append(getMeta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>prioridad</column-name><column-value><![CDATA[");
		sb.append(getPrioridad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>motivo</column-name><column-value><![CDATA[");
		sb.append(getMotivo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaSolicitada</column-name><column-value><![CDATA[");
		sb.append(getFechaSolicitada());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaMetaIngreso</column-name><column-value><![CDATA[");
		sb.append(getFechaMetaIngreso());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estado</column-name><column-value><![CDATA[");
		sb.append(getEstado());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modalidad</column-name><column-value><![CDATA[");
		sb.append(getModalidad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lugarTrabajo</column-name><column-value><![CDATA[");
		sb.append(getLugarTrabajo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>observacion</column-name><column-value><![CDATA[");
		sb.append(getObservacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>proyecto</column-name><column-value><![CDATA[");
		sb.append(getProyecto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requiereequipotenico</column-name><column-value><![CDATA[");
		sb.append(getRequiereequipotenico());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reemplazo</column-name><column-value><![CDATA[");
		sb.append(getReemplazo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>revisado</column-name><column-value><![CDATA[");
		sb.append(getRevisado());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>aprobadoFichaIngresoCapitalHumano</column-name><column-value><![CDATA[");
		sb.append(getAprobadoFichaIngresoCapitalHumano());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>observacionFichaIngresoCapitalHumano</column-name><column-value><![CDATA[");
		sb.append(getObservacionFichaIngresoCapitalHumano());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>aprobadoFichaIngresoOperaciones</column-name><column-value><![CDATA[");
		sb.append(getAprobadoFichaIngresoOperaciones());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>observacionFichaIngresoOperaciones</column-name><column-value><![CDATA[");
		sb.append(getObservacionFichaIngresoOperaciones());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipoReclutamiento</column-name><column-value><![CDATA[");
		sb.append(getTipoReclutamiento());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>solicitudRequerimientoPersonalId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudRequerimientoPersonalId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>activo</column-name><column-value><![CDATA[");
		sb.append(getActivo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuariocrea</column-name><column-value><![CDATA[");
		sb.append(getUsuariocrea());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechacrea</column-name><column-value><![CDATA[");
		sb.append(getFechacrea());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuariomodifica</column-name><column-value><![CDATA[");
		sb.append(getUsuariomodifica());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechacreamodifica</column-name><column-value><![CDATA[");
		sb.append(getFechacreamodifica());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _requerimientoRecursoRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
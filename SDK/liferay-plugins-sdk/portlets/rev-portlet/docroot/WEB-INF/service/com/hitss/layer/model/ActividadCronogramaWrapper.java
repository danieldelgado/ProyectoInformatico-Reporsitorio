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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ActividadCronograma}.
 * </p>
 *
 * @author Danielle Delgado
 * @see ActividadCronograma
 * @generated
 */
public class ActividadCronogramaWrapper implements ActividadCronograma,
	ModelWrapper<ActividadCronograma> {
	public ActividadCronogramaWrapper(ActividadCronograma actividadCronograma) {
		_actividadCronograma = actividadCronograma;
	}

	@Override
	public Class<?> getModelClass() {
		return ActividadCronograma.class;
	}

	@Override
	public String getModelClassName() {
		return ActividadCronograma.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cronogramaId", getCronogramaId());
		attributes.put("actividadCronogramaId", getActividadCronogramaId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("fechaInicio", getFechaInicio());
		attributes.put("fechaFin", getFechaFin());
		attributes.put("cumplidoEvaluacion", getCumplidoEvaluacion());
		attributes.put("estado", getEstado());
		attributes.put("fechaInicioEvaluacion", getFechaInicioEvaluacion());
		attributes.put("fechaFinEvaluacion", getFechaFinEvaluacion());
		attributes.put("grupoUsuario", getGrupoUsuario());
		attributes.put("tipoActividad", getTipoActividad());
		attributes.put("aprobadoColaborador", getAprobadoColaborador());
		attributes.put("jerarquiaEvaluar", getJerarquiaEvaluar());
		attributes.put("aprobadoLider", getAprobadoLider());
		attributes.put("usuarioGerenteId", getUsuarioGerenteId());
		attributes.put("usuarioLiderId", getUsuarioLiderId());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cronogramaId = (Long)attributes.get("cronogramaId");

		if (cronogramaId != null) {
			setCronogramaId(cronogramaId);
		}

		Long actividadCronogramaId = (Long)attributes.get(
				"actividadCronogramaId");

		if (actividadCronogramaId != null) {
			setActividadCronogramaId(actividadCronogramaId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Date fechaInicio = (Date)attributes.get("fechaInicio");

		if (fechaInicio != null) {
			setFechaInicio(fechaInicio);
		}

		Date fechaFin = (Date)attributes.get("fechaFin");

		if (fechaFin != null) {
			setFechaFin(fechaFin);
		}

		Boolean cumplidoEvaluacion = (Boolean)attributes.get(
				"cumplidoEvaluacion");

		if (cumplidoEvaluacion != null) {
			setCumplidoEvaluacion(cumplidoEvaluacion);
		}

		Long estado = (Long)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		Date fechaInicioEvaluacion = (Date)attributes.get(
				"fechaInicioEvaluacion");

		if (fechaInicioEvaluacion != null) {
			setFechaInicioEvaluacion(fechaInicioEvaluacion);
		}

		Date fechaFinEvaluacion = (Date)attributes.get("fechaFinEvaluacion");

		if (fechaFinEvaluacion != null) {
			setFechaFinEvaluacion(fechaFinEvaluacion);
		}

		Long grupoUsuario = (Long)attributes.get("grupoUsuario");

		if (grupoUsuario != null) {
			setGrupoUsuario(grupoUsuario);
		}

		Long tipoActividad = (Long)attributes.get("tipoActividad");

		if (tipoActividad != null) {
			setTipoActividad(tipoActividad);
		}

		Long aprobadoColaborador = (Long)attributes.get("aprobadoColaborador");

		if (aprobadoColaborador != null) {
			setAprobadoColaborador(aprobadoColaborador);
		}

		Long jerarquiaEvaluar = (Long)attributes.get("jerarquiaEvaluar");

		if (jerarquiaEvaluar != null) {
			setJerarquiaEvaluar(jerarquiaEvaluar);
		}

		Long aprobadoLider = (Long)attributes.get("aprobadoLider");

		if (aprobadoLider != null) {
			setAprobadoLider(aprobadoLider);
		}

		Long usuarioGerenteId = (Long)attributes.get("usuarioGerenteId");

		if (usuarioGerenteId != null) {
			setUsuarioGerenteId(usuarioGerenteId);
		}

		Long usuarioLiderId = (Long)attributes.get("usuarioLiderId");

		if (usuarioLiderId != null) {
			setUsuarioLiderId(usuarioLiderId);
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

		Date fechamodifica = (Date)attributes.get("fechamodifica");

		if (fechamodifica != null) {
			setFechamodifica(fechamodifica);
		}
	}

	/**
	* Returns the primary key of this actividad cronograma.
	*
	* @return the primary key of this actividad cronograma
	*/
	@Override
	public com.hitss.layer.service.persistence.ActividadCronogramaPK getPrimaryKey() {
		return _actividadCronograma.getPrimaryKey();
	}

	/**
	* Sets the primary key of this actividad cronograma.
	*
	* @param primaryKey the primary key of this actividad cronograma
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.ActividadCronogramaPK primaryKey) {
		_actividadCronograma.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cronograma ID of this actividad cronograma.
	*
	* @return the cronograma ID of this actividad cronograma
	*/
	@Override
	public long getCronogramaId() {
		return _actividadCronograma.getCronogramaId();
	}

	/**
	* Sets the cronograma ID of this actividad cronograma.
	*
	* @param cronogramaId the cronograma ID of this actividad cronograma
	*/
	@Override
	public void setCronogramaId(long cronogramaId) {
		_actividadCronograma.setCronogramaId(cronogramaId);
	}

	/**
	* Returns the actividad cronograma ID of this actividad cronograma.
	*
	* @return the actividad cronograma ID of this actividad cronograma
	*/
	@Override
	public long getActividadCronogramaId() {
		return _actividadCronograma.getActividadCronogramaId();
	}

	/**
	* Sets the actividad cronograma ID of this actividad cronograma.
	*
	* @param actividadCronogramaId the actividad cronograma ID of this actividad cronograma
	*/
	@Override
	public void setActividadCronogramaId(long actividadCronogramaId) {
		_actividadCronograma.setActividadCronogramaId(actividadCronogramaId);
	}

	/**
	* Returns the descripcion of this actividad cronograma.
	*
	* @return the descripcion of this actividad cronograma
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _actividadCronograma.getDescripcion();
	}

	/**
	* Sets the descripcion of this actividad cronograma.
	*
	* @param descripcion the descripcion of this actividad cronograma
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_actividadCronograma.setDescripcion(descripcion);
	}

	/**
	* Returns the fecha inicio of this actividad cronograma.
	*
	* @return the fecha inicio of this actividad cronograma
	*/
	@Override
	public java.util.Date getFechaInicio() {
		return _actividadCronograma.getFechaInicio();
	}

	/**
	* Sets the fecha inicio of this actividad cronograma.
	*
	* @param fechaInicio the fecha inicio of this actividad cronograma
	*/
	@Override
	public void setFechaInicio(java.util.Date fechaInicio) {
		_actividadCronograma.setFechaInicio(fechaInicio);
	}

	/**
	* Returns the fecha fin of this actividad cronograma.
	*
	* @return the fecha fin of this actividad cronograma
	*/
	@Override
	public java.util.Date getFechaFin() {
		return _actividadCronograma.getFechaFin();
	}

	/**
	* Sets the fecha fin of this actividad cronograma.
	*
	* @param fechaFin the fecha fin of this actividad cronograma
	*/
	@Override
	public void setFechaFin(java.util.Date fechaFin) {
		_actividadCronograma.setFechaFin(fechaFin);
	}

	/**
	* Returns the cumplido evaluacion of this actividad cronograma.
	*
	* @return the cumplido evaluacion of this actividad cronograma
	*/
	@Override
	public boolean getCumplidoEvaluacion() {
		return _actividadCronograma.getCumplidoEvaluacion();
	}

	/**
	* Returns <code>true</code> if this actividad cronograma is cumplido evaluacion.
	*
	* @return <code>true</code> if this actividad cronograma is cumplido evaluacion; <code>false</code> otherwise
	*/
	@Override
	public boolean isCumplidoEvaluacion() {
		return _actividadCronograma.isCumplidoEvaluacion();
	}

	/**
	* Sets whether this actividad cronograma is cumplido evaluacion.
	*
	* @param cumplidoEvaluacion the cumplido evaluacion of this actividad cronograma
	*/
	@Override
	public void setCumplidoEvaluacion(boolean cumplidoEvaluacion) {
		_actividadCronograma.setCumplidoEvaluacion(cumplidoEvaluacion);
	}

	/**
	* Returns the estado of this actividad cronograma.
	*
	* @return the estado of this actividad cronograma
	*/
	@Override
	public long getEstado() {
		return _actividadCronograma.getEstado();
	}

	/**
	* Sets the estado of this actividad cronograma.
	*
	* @param estado the estado of this actividad cronograma
	*/
	@Override
	public void setEstado(long estado) {
		_actividadCronograma.setEstado(estado);
	}

	/**
	* Returns the fecha inicio evaluacion of this actividad cronograma.
	*
	* @return the fecha inicio evaluacion of this actividad cronograma
	*/
	@Override
	public java.util.Date getFechaInicioEvaluacion() {
		return _actividadCronograma.getFechaInicioEvaluacion();
	}

	/**
	* Sets the fecha inicio evaluacion of this actividad cronograma.
	*
	* @param fechaInicioEvaluacion the fecha inicio evaluacion of this actividad cronograma
	*/
	@Override
	public void setFechaInicioEvaluacion(java.util.Date fechaInicioEvaluacion) {
		_actividadCronograma.setFechaInicioEvaluacion(fechaInicioEvaluacion);
	}

	/**
	* Returns the fecha fin evaluacion of this actividad cronograma.
	*
	* @return the fecha fin evaluacion of this actividad cronograma
	*/
	@Override
	public java.util.Date getFechaFinEvaluacion() {
		return _actividadCronograma.getFechaFinEvaluacion();
	}

	/**
	* Sets the fecha fin evaluacion of this actividad cronograma.
	*
	* @param fechaFinEvaluacion the fecha fin evaluacion of this actividad cronograma
	*/
	@Override
	public void setFechaFinEvaluacion(java.util.Date fechaFinEvaluacion) {
		_actividadCronograma.setFechaFinEvaluacion(fechaFinEvaluacion);
	}

	/**
	* Returns the grupo usuario of this actividad cronograma.
	*
	* @return the grupo usuario of this actividad cronograma
	*/
	@Override
	public long getGrupoUsuario() {
		return _actividadCronograma.getGrupoUsuario();
	}

	/**
	* Sets the grupo usuario of this actividad cronograma.
	*
	* @param grupoUsuario the grupo usuario of this actividad cronograma
	*/
	@Override
	public void setGrupoUsuario(long grupoUsuario) {
		_actividadCronograma.setGrupoUsuario(grupoUsuario);
	}

	/**
	* Returns the tipo actividad of this actividad cronograma.
	*
	* @return the tipo actividad of this actividad cronograma
	*/
	@Override
	public long getTipoActividad() {
		return _actividadCronograma.getTipoActividad();
	}

	/**
	* Sets the tipo actividad of this actividad cronograma.
	*
	* @param tipoActividad the tipo actividad of this actividad cronograma
	*/
	@Override
	public void setTipoActividad(long tipoActividad) {
		_actividadCronograma.setTipoActividad(tipoActividad);
	}

	/**
	* Returns the aprobado colaborador of this actividad cronograma.
	*
	* @return the aprobado colaborador of this actividad cronograma
	*/
	@Override
	public long getAprobadoColaborador() {
		return _actividadCronograma.getAprobadoColaborador();
	}

	/**
	* Sets the aprobado colaborador of this actividad cronograma.
	*
	* @param aprobadoColaborador the aprobado colaborador of this actividad cronograma
	*/
	@Override
	public void setAprobadoColaborador(long aprobadoColaborador) {
		_actividadCronograma.setAprobadoColaborador(aprobadoColaborador);
	}

	/**
	* Returns the jerarquia evaluar of this actividad cronograma.
	*
	* @return the jerarquia evaluar of this actividad cronograma
	*/
	@Override
	public long getJerarquiaEvaluar() {
		return _actividadCronograma.getJerarquiaEvaluar();
	}

	/**
	* Sets the jerarquia evaluar of this actividad cronograma.
	*
	* @param jerarquiaEvaluar the jerarquia evaluar of this actividad cronograma
	*/
	@Override
	public void setJerarquiaEvaluar(long jerarquiaEvaluar) {
		_actividadCronograma.setJerarquiaEvaluar(jerarquiaEvaluar);
	}

	/**
	* Returns the aprobado lider of this actividad cronograma.
	*
	* @return the aprobado lider of this actividad cronograma
	*/
	@Override
	public long getAprobadoLider() {
		return _actividadCronograma.getAprobadoLider();
	}

	/**
	* Sets the aprobado lider of this actividad cronograma.
	*
	* @param aprobadoLider the aprobado lider of this actividad cronograma
	*/
	@Override
	public void setAprobadoLider(long aprobadoLider) {
		_actividadCronograma.setAprobadoLider(aprobadoLider);
	}

	/**
	* Returns the usuario gerente ID of this actividad cronograma.
	*
	* @return the usuario gerente ID of this actividad cronograma
	*/
	@Override
	public long getUsuarioGerenteId() {
		return _actividadCronograma.getUsuarioGerenteId();
	}

	/**
	* Sets the usuario gerente ID of this actividad cronograma.
	*
	* @param usuarioGerenteId the usuario gerente ID of this actividad cronograma
	*/
	@Override
	public void setUsuarioGerenteId(long usuarioGerenteId) {
		_actividadCronograma.setUsuarioGerenteId(usuarioGerenteId);
	}

	/**
	* Returns the usuario lider ID of this actividad cronograma.
	*
	* @return the usuario lider ID of this actividad cronograma
	*/
	@Override
	public long getUsuarioLiderId() {
		return _actividadCronograma.getUsuarioLiderId();
	}

	/**
	* Sets the usuario lider ID of this actividad cronograma.
	*
	* @param usuarioLiderId the usuario lider ID of this actividad cronograma
	*/
	@Override
	public void setUsuarioLiderId(long usuarioLiderId) {
		_actividadCronograma.setUsuarioLiderId(usuarioLiderId);
	}

	/**
	* Returns the activo of this actividad cronograma.
	*
	* @return the activo of this actividad cronograma
	*/
	@Override
	public boolean getActivo() {
		return _actividadCronograma.getActivo();
	}

	/**
	* Returns <code>true</code> if this actividad cronograma is activo.
	*
	* @return <code>true</code> if this actividad cronograma is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _actividadCronograma.isActivo();
	}

	/**
	* Sets whether this actividad cronograma is activo.
	*
	* @param activo the activo of this actividad cronograma
	*/
	@Override
	public void setActivo(boolean activo) {
		_actividadCronograma.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this actividad cronograma.
	*
	* @return the usuariocrea of this actividad cronograma
	*/
	@Override
	public long getUsuariocrea() {
		return _actividadCronograma.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this actividad cronograma.
	*
	* @param usuariocrea the usuariocrea of this actividad cronograma
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_actividadCronograma.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this actividad cronograma.
	*
	* @return the fechacrea of this actividad cronograma
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _actividadCronograma.getFechacrea();
	}

	/**
	* Sets the fechacrea of this actividad cronograma.
	*
	* @param fechacrea the fechacrea of this actividad cronograma
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_actividadCronograma.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this actividad cronograma.
	*
	* @return the usuariomodifica of this actividad cronograma
	*/
	@Override
	public long getUsuariomodifica() {
		return _actividadCronograma.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this actividad cronograma.
	*
	* @param usuariomodifica the usuariomodifica of this actividad cronograma
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_actividadCronograma.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechamodifica of this actividad cronograma.
	*
	* @return the fechamodifica of this actividad cronograma
	*/
	@Override
	public java.util.Date getFechamodifica() {
		return _actividadCronograma.getFechamodifica();
	}

	/**
	* Sets the fechamodifica of this actividad cronograma.
	*
	* @param fechamodifica the fechamodifica of this actividad cronograma
	*/
	@Override
	public void setFechamodifica(java.util.Date fechamodifica) {
		_actividadCronograma.setFechamodifica(fechamodifica);
	}

	@Override
	public boolean isNew() {
		return _actividadCronograma.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_actividadCronograma.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _actividadCronograma.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_actividadCronograma.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _actividadCronograma.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _actividadCronograma.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_actividadCronograma.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _actividadCronograma.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_actividadCronograma.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_actividadCronograma.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_actividadCronograma.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ActividadCronogramaWrapper((ActividadCronograma)_actividadCronograma.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.ActividadCronograma actividadCronograma) {
		return _actividadCronograma.compareTo(actividadCronograma);
	}

	@Override
	public int hashCode() {
		return _actividadCronograma.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.ActividadCronograma> toCacheModel() {
		return _actividadCronograma.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.ActividadCronograma toEscapedModel() {
		return new ActividadCronogramaWrapper(_actividadCronograma.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.ActividadCronograma toUnescapedModel() {
		return new ActividadCronogramaWrapper(_actividadCronograma.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _actividadCronograma.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _actividadCronograma.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_actividadCronograma.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActividadCronogramaWrapper)) {
			return false;
		}

		ActividadCronogramaWrapper actividadCronogramaWrapper = (ActividadCronogramaWrapper)obj;

		if (Validator.equals(_actividadCronograma,
					actividadCronogramaWrapper._actividadCronograma)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ActividadCronograma getWrappedActividadCronograma() {
		return _actividadCronograma;
	}

	@Override
	public ActividadCronograma getWrappedModel() {
		return _actividadCronograma;
	}

	@Override
	public void resetOriginalValues() {
		_actividadCronograma.resetOriginalValues();
	}

	private ActividadCronograma _actividadCronograma;
}
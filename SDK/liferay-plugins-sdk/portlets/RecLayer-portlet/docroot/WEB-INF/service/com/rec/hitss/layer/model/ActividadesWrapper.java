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
 * This class is a wrapper for {@link Actividades}.
 * </p>
 *
 * @author Crossfire
 * @see Actividades
 * @generated
 */
public class ActividadesWrapper implements Actividades,
	ModelWrapper<Actividades> {
	public ActividadesWrapper(Actividades actividades) {
		_actividades = actividades;
	}

	@Override
	public Class<?> getModelClass() {
		return Actividades.class;
	}

	@Override
	public String getModelClassName() {
		return Actividades.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("actividadesId", getActividadesId());
		attributes.put("cronogramaEvaluacionPersonalId",
			getCronogramaEvaluacionPersonalId());
		attributes.put("fechacreamodifica", getFechacreamodifica());
		attributes.put("fechaInicioEvaluacion", getFechaInicioEvaluacion());
		attributes.put("fechaFinEvaluacion", getFechaFinEvaluacion());
		attributes.put("descripcion", getDescripcion());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long actividadesId = (Long)attributes.get("actividadesId");

		if (actividadesId != null) {
			setActividadesId(actividadesId);
		}

		Long cronogramaEvaluacionPersonalId = (Long)attributes.get(
				"cronogramaEvaluacionPersonalId");

		if (cronogramaEvaluacionPersonalId != null) {
			setCronogramaEvaluacionPersonalId(cronogramaEvaluacionPersonalId);
		}

		Date fechacreamodifica = (Date)attributes.get("fechacreamodifica");

		if (fechacreamodifica != null) {
			setFechacreamodifica(fechacreamodifica);
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

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
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
	}

	/**
	* Returns the primary key of this actividades.
	*
	* @return the primary key of this actividades
	*/
	@Override
	public long getPrimaryKey() {
		return _actividades.getPrimaryKey();
	}

	/**
	* Sets the primary key of this actividades.
	*
	* @param primaryKey the primary key of this actividades
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_actividades.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the actividades ID of this actividades.
	*
	* @return the actividades ID of this actividades
	*/
	@Override
	public long getActividadesId() {
		return _actividades.getActividadesId();
	}

	/**
	* Sets the actividades ID of this actividades.
	*
	* @param actividadesId the actividades ID of this actividades
	*/
	@Override
	public void setActividadesId(long actividadesId) {
		_actividades.setActividadesId(actividadesId);
	}

	/**
	* Returns the cronograma evaluacion personal ID of this actividades.
	*
	* @return the cronograma evaluacion personal ID of this actividades
	*/
	@Override
	public long getCronogramaEvaluacionPersonalId() {
		return _actividades.getCronogramaEvaluacionPersonalId();
	}

	/**
	* Sets the cronograma evaluacion personal ID of this actividades.
	*
	* @param cronogramaEvaluacionPersonalId the cronograma evaluacion personal ID of this actividades
	*/
	@Override
	public void setCronogramaEvaluacionPersonalId(
		long cronogramaEvaluacionPersonalId) {
		_actividades.setCronogramaEvaluacionPersonalId(cronogramaEvaluacionPersonalId);
	}

	/**
	* Returns the fechacreamodifica of this actividades.
	*
	* @return the fechacreamodifica of this actividades
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _actividades.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this actividades.
	*
	* @param fechacreamodifica the fechacreamodifica of this actividades
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_actividades.setFechacreamodifica(fechacreamodifica);
	}

	/**
	* Returns the fecha inicio evaluacion of this actividades.
	*
	* @return the fecha inicio evaluacion of this actividades
	*/
	@Override
	public java.util.Date getFechaInicioEvaluacion() {
		return _actividades.getFechaInicioEvaluacion();
	}

	/**
	* Sets the fecha inicio evaluacion of this actividades.
	*
	* @param fechaInicioEvaluacion the fecha inicio evaluacion of this actividades
	*/
	@Override
	public void setFechaInicioEvaluacion(java.util.Date fechaInicioEvaluacion) {
		_actividades.setFechaInicioEvaluacion(fechaInicioEvaluacion);
	}

	/**
	* Returns the fecha fin evaluacion of this actividades.
	*
	* @return the fecha fin evaluacion of this actividades
	*/
	@Override
	public java.util.Date getFechaFinEvaluacion() {
		return _actividades.getFechaFinEvaluacion();
	}

	/**
	* Sets the fecha fin evaluacion of this actividades.
	*
	* @param fechaFinEvaluacion the fecha fin evaluacion of this actividades
	*/
	@Override
	public void setFechaFinEvaluacion(java.util.Date fechaFinEvaluacion) {
		_actividades.setFechaFinEvaluacion(fechaFinEvaluacion);
	}

	/**
	* Returns the descripcion of this actividades.
	*
	* @return the descripcion of this actividades
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _actividades.getDescripcion();
	}

	/**
	* Sets the descripcion of this actividades.
	*
	* @param descripcion the descripcion of this actividades
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_actividades.setDescripcion(descripcion);
	}

	/**
	* Returns the activo of this actividades.
	*
	* @return the activo of this actividades
	*/
	@Override
	public boolean getActivo() {
		return _actividades.getActivo();
	}

	/**
	* Returns <code>true</code> if this actividades is activo.
	*
	* @return <code>true</code> if this actividades is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _actividades.isActivo();
	}

	/**
	* Sets whether this actividades is activo.
	*
	* @param activo the activo of this actividades
	*/
	@Override
	public void setActivo(boolean activo) {
		_actividades.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this actividades.
	*
	* @return the usuariocrea of this actividades
	*/
	@Override
	public long getUsuariocrea() {
		return _actividades.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this actividades.
	*
	* @param usuariocrea the usuariocrea of this actividades
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_actividades.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this actividades.
	*
	* @return the fechacrea of this actividades
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _actividades.getFechacrea();
	}

	/**
	* Sets the fechacrea of this actividades.
	*
	* @param fechacrea the fechacrea of this actividades
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_actividades.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this actividades.
	*
	* @return the usuariomodifica of this actividades
	*/
	@Override
	public long getUsuariomodifica() {
		return _actividades.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this actividades.
	*
	* @param usuariomodifica the usuariomodifica of this actividades
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_actividades.setUsuariomodifica(usuariomodifica);
	}

	@Override
	public boolean isNew() {
		return _actividades.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_actividades.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _actividades.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_actividades.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _actividades.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _actividades.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_actividades.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _actividades.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_actividades.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_actividades.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_actividades.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ActividadesWrapper((Actividades)_actividades.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.Actividades actividades) {
		return _actividades.compareTo(actividades);
	}

	@Override
	public int hashCode() {
		return _actividades.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.Actividades> toCacheModel() {
		return _actividades.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.Actividades toEscapedModel() {
		return new ActividadesWrapper(_actividades.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.Actividades toUnescapedModel() {
		return new ActividadesWrapper(_actividades.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _actividades.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _actividades.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_actividades.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActividadesWrapper)) {
			return false;
		}

		ActividadesWrapper actividadesWrapper = (ActividadesWrapper)obj;

		if (Validator.equals(_actividades, actividadesWrapper._actividades)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Actividades getWrappedActividades() {
		return _actividades;
	}

	@Override
	public Actividades getWrappedModel() {
		return _actividades;
	}

	@Override
	public void resetOriginalValues() {
		_actividades.resetOriginalValues();
	}

	private Actividades _actividades;
}
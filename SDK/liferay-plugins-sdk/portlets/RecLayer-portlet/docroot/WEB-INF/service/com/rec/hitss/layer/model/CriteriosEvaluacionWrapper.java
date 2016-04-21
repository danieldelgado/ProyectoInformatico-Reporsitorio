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
 * This class is a wrapper for {@link CriteriosEvaluacion}.
 * </p>
 *
 * @author Crossfire
 * @see CriteriosEvaluacion
 * @generated
 */
public class CriteriosEvaluacionWrapper implements CriteriosEvaluacion,
	ModelWrapper<CriteriosEvaluacion> {
	public CriteriosEvaluacionWrapper(CriteriosEvaluacion criteriosEvaluacion) {
		_criteriosEvaluacion = criteriosEvaluacion;
	}

	@Override
	public Class<?> getModelClass() {
		return CriteriosEvaluacion.class;
	}

	@Override
	public String getModelClassName() {
		return CriteriosEvaluacion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("criteriosEvaluacionId", getCriteriosEvaluacionId());
		attributes.put("nombre", getNombre());
		attributes.put("nivelCriterio", getNivelCriterio());
		attributes.put("observacion", getObservacion());
		attributes.put("parametroPadreId", getParametroPadreId());
		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long criteriosEvaluacionId = (Long)attributes.get(
				"criteriosEvaluacionId");

		if (criteriosEvaluacionId != null) {
			setCriteriosEvaluacionId(criteriosEvaluacionId);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String nivelCriterio = (String)attributes.get("nivelCriterio");

		if (nivelCriterio != null) {
			setNivelCriterio(nivelCriterio);
		}

		String observacion = (String)attributes.get("observacion");

		if (observacion != null) {
			setObservacion(observacion);
		}

		Long parametroPadreId = (Long)attributes.get("parametroPadreId");

		if (parametroPadreId != null) {
			setParametroPadreId(parametroPadreId);
		}

		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
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
	* Returns the primary key of this criterios evaluacion.
	*
	* @return the primary key of this criterios evaluacion
	*/
	@Override
	public long getPrimaryKey() {
		return _criteriosEvaluacion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this criterios evaluacion.
	*
	* @param primaryKey the primary key of this criterios evaluacion
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_criteriosEvaluacion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the criterios evaluacion ID of this criterios evaluacion.
	*
	* @return the criterios evaluacion ID of this criterios evaluacion
	*/
	@Override
	public long getCriteriosEvaluacionId() {
		return _criteriosEvaluacion.getCriteriosEvaluacionId();
	}

	/**
	* Sets the criterios evaluacion ID of this criterios evaluacion.
	*
	* @param criteriosEvaluacionId the criterios evaluacion ID of this criterios evaluacion
	*/
	@Override
	public void setCriteriosEvaluacionId(long criteriosEvaluacionId) {
		_criteriosEvaluacion.setCriteriosEvaluacionId(criteriosEvaluacionId);
	}

	/**
	* Returns the nombre of this criterios evaluacion.
	*
	* @return the nombre of this criterios evaluacion
	*/
	@Override
	public java.lang.String getNombre() {
		return _criteriosEvaluacion.getNombre();
	}

	/**
	* Sets the nombre of this criterios evaluacion.
	*
	* @param nombre the nombre of this criterios evaluacion
	*/
	@Override
	public void setNombre(java.lang.String nombre) {
		_criteriosEvaluacion.setNombre(nombre);
	}

	/**
	* Returns the nivel criterio of this criterios evaluacion.
	*
	* @return the nivel criterio of this criterios evaluacion
	*/
	@Override
	public java.lang.String getNivelCriterio() {
		return _criteriosEvaluacion.getNivelCriterio();
	}

	/**
	* Sets the nivel criterio of this criterios evaluacion.
	*
	* @param nivelCriterio the nivel criterio of this criterios evaluacion
	*/
	@Override
	public void setNivelCriterio(java.lang.String nivelCriterio) {
		_criteriosEvaluacion.setNivelCriterio(nivelCriterio);
	}

	/**
	* Returns the observacion of this criterios evaluacion.
	*
	* @return the observacion of this criterios evaluacion
	*/
	@Override
	public java.lang.String getObservacion() {
		return _criteriosEvaluacion.getObservacion();
	}

	/**
	* Sets the observacion of this criterios evaluacion.
	*
	* @param observacion the observacion of this criterios evaluacion
	*/
	@Override
	public void setObservacion(java.lang.String observacion) {
		_criteriosEvaluacion.setObservacion(observacion);
	}

	/**
	* Returns the parametro padre ID of this criterios evaluacion.
	*
	* @return the parametro padre ID of this criterios evaluacion
	*/
	@Override
	public long getParametroPadreId() {
		return _criteriosEvaluacion.getParametroPadreId();
	}

	/**
	* Sets the parametro padre ID of this criterios evaluacion.
	*
	* @param parametroPadreId the parametro padre ID of this criterios evaluacion
	*/
	@Override
	public void setParametroPadreId(long parametroPadreId) {
		_criteriosEvaluacion.setParametroPadreId(parametroPadreId);
	}

	/**
	* Returns the evaluacion ID of this criterios evaluacion.
	*
	* @return the evaluacion ID of this criterios evaluacion
	*/
	@Override
	public long getEvaluacionId() {
		return _criteriosEvaluacion.getEvaluacionId();
	}

	/**
	* Sets the evaluacion ID of this criterios evaluacion.
	*
	* @param evaluacionId the evaluacion ID of this criterios evaluacion
	*/
	@Override
	public void setEvaluacionId(long evaluacionId) {
		_criteriosEvaluacion.setEvaluacionId(evaluacionId);
	}

	/**
	* Returns the activo of this criterios evaluacion.
	*
	* @return the activo of this criterios evaluacion
	*/
	@Override
	public boolean getActivo() {
		return _criteriosEvaluacion.getActivo();
	}

	/**
	* Returns <code>true</code> if this criterios evaluacion is activo.
	*
	* @return <code>true</code> if this criterios evaluacion is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _criteriosEvaluacion.isActivo();
	}

	/**
	* Sets whether this criterios evaluacion is activo.
	*
	* @param activo the activo of this criterios evaluacion
	*/
	@Override
	public void setActivo(boolean activo) {
		_criteriosEvaluacion.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this criterios evaluacion.
	*
	* @return the usuariocrea of this criterios evaluacion
	*/
	@Override
	public long getUsuariocrea() {
		return _criteriosEvaluacion.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this criterios evaluacion.
	*
	* @param usuariocrea the usuariocrea of this criterios evaluacion
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_criteriosEvaluacion.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this criterios evaluacion.
	*
	* @return the fechacrea of this criterios evaluacion
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _criteriosEvaluacion.getFechacrea();
	}

	/**
	* Sets the fechacrea of this criterios evaluacion.
	*
	* @param fechacrea the fechacrea of this criterios evaluacion
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_criteriosEvaluacion.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this criterios evaluacion.
	*
	* @return the usuariomodifica of this criterios evaluacion
	*/
	@Override
	public long getUsuariomodifica() {
		return _criteriosEvaluacion.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this criterios evaluacion.
	*
	* @param usuariomodifica the usuariomodifica of this criterios evaluacion
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_criteriosEvaluacion.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this criterios evaluacion.
	*
	* @return the fechacreamodifica of this criterios evaluacion
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _criteriosEvaluacion.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this criterios evaluacion.
	*
	* @param fechacreamodifica the fechacreamodifica of this criterios evaluacion
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_criteriosEvaluacion.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _criteriosEvaluacion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_criteriosEvaluacion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _criteriosEvaluacion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_criteriosEvaluacion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _criteriosEvaluacion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _criteriosEvaluacion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_criteriosEvaluacion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _criteriosEvaluacion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_criteriosEvaluacion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_criteriosEvaluacion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_criteriosEvaluacion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CriteriosEvaluacionWrapper((CriteriosEvaluacion)_criteriosEvaluacion.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.CriteriosEvaluacion criteriosEvaluacion) {
		return _criteriosEvaluacion.compareTo(criteriosEvaluacion);
	}

	@Override
	public int hashCode() {
		return _criteriosEvaluacion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.CriteriosEvaluacion> toCacheModel() {
		return _criteriosEvaluacion.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.CriteriosEvaluacion toEscapedModel() {
		return new CriteriosEvaluacionWrapper(_criteriosEvaluacion.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.CriteriosEvaluacion toUnescapedModel() {
		return new CriteriosEvaluacionWrapper(_criteriosEvaluacion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _criteriosEvaluacion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _criteriosEvaluacion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_criteriosEvaluacion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CriteriosEvaluacionWrapper)) {
			return false;
		}

		CriteriosEvaluacionWrapper criteriosEvaluacionWrapper = (CriteriosEvaluacionWrapper)obj;

		if (Validator.equals(_criteriosEvaluacion,
					criteriosEvaluacionWrapper._criteriosEvaluacion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CriteriosEvaluacion getWrappedCriteriosEvaluacion() {
		return _criteriosEvaluacion;
	}

	@Override
	public CriteriosEvaluacion getWrappedModel() {
		return _criteriosEvaluacion;
	}

	@Override
	public void resetOriginalValues() {
		_criteriosEvaluacion.resetOriginalValues();
	}

	private CriteriosEvaluacion _criteriosEvaluacion;
}
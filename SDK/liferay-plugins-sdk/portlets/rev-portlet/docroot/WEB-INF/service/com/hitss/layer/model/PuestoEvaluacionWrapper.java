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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PuestoEvaluacion}.
 * </p>
 *
 * @author Danielle Delgado
 * @see PuestoEvaluacion
 * @generated
 */
public class PuestoEvaluacionWrapper implements PuestoEvaluacion,
	ModelWrapper<PuestoEvaluacion> {
	public PuestoEvaluacionWrapper(PuestoEvaluacion puestoEvaluacion) {
		_puestoEvaluacion = puestoEvaluacion;
	}

	@Override
	public Class<?> getModelClass() {
		return PuestoEvaluacion.class;
	}

	@Override
	public String getModelClassName() {
		return PuestoEvaluacion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudFuncionId", getSolicitudFuncionId());
		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("rangoSuperior", getRangoSuperior());
		attributes.put("rangoInferior", getRangoInferior());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long solicitudFuncionId = (Long)attributes.get("solicitudFuncionId");

		if (solicitudFuncionId != null) {
			setSolicitudFuncionId(solicitudFuncionId);
		}

		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		Double rangoSuperior = (Double)attributes.get("rangoSuperior");

		if (rangoSuperior != null) {
			setRangoSuperior(rangoSuperior);
		}

		Double rangoInferior = (Double)attributes.get("rangoInferior");

		if (rangoInferior != null) {
			setRangoInferior(rangoInferior);
		}
	}

	/**
	* Returns the primary key of this puesto evaluacion.
	*
	* @return the primary key of this puesto evaluacion
	*/
	@Override
	public com.hitss.layer.service.persistence.PuestoEvaluacionPK getPrimaryKey() {
		return _puestoEvaluacion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this puesto evaluacion.
	*
	* @param primaryKey the primary key of this puesto evaluacion
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.PuestoEvaluacionPK primaryKey) {
		_puestoEvaluacion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the solicitud funcion ID of this puesto evaluacion.
	*
	* @return the solicitud funcion ID of this puesto evaluacion
	*/
	@Override
	public long getSolicitudFuncionId() {
		return _puestoEvaluacion.getSolicitudFuncionId();
	}

	/**
	* Sets the solicitud funcion ID of this puesto evaluacion.
	*
	* @param solicitudFuncionId the solicitud funcion ID of this puesto evaluacion
	*/
	@Override
	public void setSolicitudFuncionId(long solicitudFuncionId) {
		_puestoEvaluacion.setSolicitudFuncionId(solicitudFuncionId);
	}

	/**
	* Returns the evaluacion ID of this puesto evaluacion.
	*
	* @return the evaluacion ID of this puesto evaluacion
	*/
	@Override
	public long getEvaluacionId() {
		return _puestoEvaluacion.getEvaluacionId();
	}

	/**
	* Sets the evaluacion ID of this puesto evaluacion.
	*
	* @param evaluacionId the evaluacion ID of this puesto evaluacion
	*/
	@Override
	public void setEvaluacionId(long evaluacionId) {
		_puestoEvaluacion.setEvaluacionId(evaluacionId);
	}

	/**
	* Returns the rango superior of this puesto evaluacion.
	*
	* @return the rango superior of this puesto evaluacion
	*/
	@Override
	public double getRangoSuperior() {
		return _puestoEvaluacion.getRangoSuperior();
	}

	/**
	* Sets the rango superior of this puesto evaluacion.
	*
	* @param rangoSuperior the rango superior of this puesto evaluacion
	*/
	@Override
	public void setRangoSuperior(double rangoSuperior) {
		_puestoEvaluacion.setRangoSuperior(rangoSuperior);
	}

	/**
	* Returns the rango inferior of this puesto evaluacion.
	*
	* @return the rango inferior of this puesto evaluacion
	*/
	@Override
	public double getRangoInferior() {
		return _puestoEvaluacion.getRangoInferior();
	}

	/**
	* Sets the rango inferior of this puesto evaluacion.
	*
	* @param rangoInferior the rango inferior of this puesto evaluacion
	*/
	@Override
	public void setRangoInferior(double rangoInferior) {
		_puestoEvaluacion.setRangoInferior(rangoInferior);
	}

	@Override
	public boolean isNew() {
		return _puestoEvaluacion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_puestoEvaluacion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _puestoEvaluacion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_puestoEvaluacion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _puestoEvaluacion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _puestoEvaluacion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_puestoEvaluacion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _puestoEvaluacion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_puestoEvaluacion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_puestoEvaluacion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_puestoEvaluacion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PuestoEvaluacionWrapper((PuestoEvaluacion)_puestoEvaluacion.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.PuestoEvaluacion puestoEvaluacion) {
		return _puestoEvaluacion.compareTo(puestoEvaluacion);
	}

	@Override
	public int hashCode() {
		return _puestoEvaluacion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.PuestoEvaluacion> toCacheModel() {
		return _puestoEvaluacion.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.PuestoEvaluacion toEscapedModel() {
		return new PuestoEvaluacionWrapper(_puestoEvaluacion.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.PuestoEvaluacion toUnescapedModel() {
		return new PuestoEvaluacionWrapper(_puestoEvaluacion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _puestoEvaluacion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _puestoEvaluacion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_puestoEvaluacion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PuestoEvaluacionWrapper)) {
			return false;
		}

		PuestoEvaluacionWrapper puestoEvaluacionWrapper = (PuestoEvaluacionWrapper)obj;

		if (Validator.equals(_puestoEvaluacion,
					puestoEvaluacionWrapper._puestoEvaluacion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PuestoEvaluacion getWrappedPuestoEvaluacion() {
		return _puestoEvaluacion;
	}

	@Override
	public PuestoEvaluacion getWrappedModel() {
		return _puestoEvaluacion;
	}

	@Override
	public void resetOriginalValues() {
		_puestoEvaluacion.resetOriginalValues();
	}

	private PuestoEvaluacion _puestoEvaluacion;
}
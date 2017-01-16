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
 * This class is a wrapper for {@link FasePostulacionPuestoEvaluacion}.
 * </p>
 *
 * @author Danielle Delgado
 * @see FasePostulacionPuestoEvaluacion
 * @generated
 */
public class FasePostulacionPuestoEvaluacionWrapper
	implements FasePostulacionPuestoEvaluacion,
		ModelWrapper<FasePostulacionPuestoEvaluacion> {
	public FasePostulacionPuestoEvaluacionWrapper(
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion) {
		_fasePostulacionPuestoEvaluacion = fasePostulacionPuestoEvaluacion;
	}

	@Override
	public Class<?> getModelClass() {
		return FasePostulacionPuestoEvaluacion.class;
	}

	@Override
	public String getModelClassName() {
		return FasePostulacionPuestoEvaluacion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fasePostulacionId", getFasePostulacionId());
		attributes.put("solicitudFuncionId", getSolicitudFuncionId());
		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("resultado", getResultado());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fasePostulacionId = (Long)attributes.get("fasePostulacionId");

		if (fasePostulacionId != null) {
			setFasePostulacionId(fasePostulacionId);
		}

		Long solicitudFuncionId = (Long)attributes.get("solicitudFuncionId");

		if (solicitudFuncionId != null) {
			setSolicitudFuncionId(solicitudFuncionId);
		}

		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		Double resultado = (Double)attributes.get("resultado");

		if (resultado != null) {
			setResultado(resultado);
		}
	}

	/**
	* Returns the primary key of this fase postulacion puesto evaluacion.
	*
	* @return the primary key of this fase postulacion puesto evaluacion
	*/
	@Override
	public com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK getPrimaryKey() {
		return _fasePostulacionPuestoEvaluacion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this fase postulacion puesto evaluacion.
	*
	* @param primaryKey the primary key of this fase postulacion puesto evaluacion
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK primaryKey) {
		_fasePostulacionPuestoEvaluacion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the fase postulacion ID of this fase postulacion puesto evaluacion.
	*
	* @return the fase postulacion ID of this fase postulacion puesto evaluacion
	*/
	@Override
	public long getFasePostulacionId() {
		return _fasePostulacionPuestoEvaluacion.getFasePostulacionId();
	}

	/**
	* Sets the fase postulacion ID of this fase postulacion puesto evaluacion.
	*
	* @param fasePostulacionId the fase postulacion ID of this fase postulacion puesto evaluacion
	*/
	@Override
	public void setFasePostulacionId(long fasePostulacionId) {
		_fasePostulacionPuestoEvaluacion.setFasePostulacionId(fasePostulacionId);
	}

	/**
	* Returns the solicitud funcion ID of this fase postulacion puesto evaluacion.
	*
	* @return the solicitud funcion ID of this fase postulacion puesto evaluacion
	*/
	@Override
	public long getSolicitudFuncionId() {
		return _fasePostulacionPuestoEvaluacion.getSolicitudFuncionId();
	}

	/**
	* Sets the solicitud funcion ID of this fase postulacion puesto evaluacion.
	*
	* @param solicitudFuncionId the solicitud funcion ID of this fase postulacion puesto evaluacion
	*/
	@Override
	public void setSolicitudFuncionId(long solicitudFuncionId) {
		_fasePostulacionPuestoEvaluacion.setSolicitudFuncionId(solicitudFuncionId);
	}

	/**
	* Returns the evaluacion ID of this fase postulacion puesto evaluacion.
	*
	* @return the evaluacion ID of this fase postulacion puesto evaluacion
	*/
	@Override
	public long getEvaluacionId() {
		return _fasePostulacionPuestoEvaluacion.getEvaluacionId();
	}

	/**
	* Sets the evaluacion ID of this fase postulacion puesto evaluacion.
	*
	* @param evaluacionId the evaluacion ID of this fase postulacion puesto evaluacion
	*/
	@Override
	public void setEvaluacionId(long evaluacionId) {
		_fasePostulacionPuestoEvaluacion.setEvaluacionId(evaluacionId);
	}

	/**
	* Returns the resultado of this fase postulacion puesto evaluacion.
	*
	* @return the resultado of this fase postulacion puesto evaluacion
	*/
	@Override
	public double getResultado() {
		return _fasePostulacionPuestoEvaluacion.getResultado();
	}

	/**
	* Sets the resultado of this fase postulacion puesto evaluacion.
	*
	* @param resultado the resultado of this fase postulacion puesto evaluacion
	*/
	@Override
	public void setResultado(double resultado) {
		_fasePostulacionPuestoEvaluacion.setResultado(resultado);
	}

	@Override
	public boolean isNew() {
		return _fasePostulacionPuestoEvaluacion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_fasePostulacionPuestoEvaluacion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _fasePostulacionPuestoEvaluacion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_fasePostulacionPuestoEvaluacion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _fasePostulacionPuestoEvaluacion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _fasePostulacionPuestoEvaluacion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_fasePostulacionPuestoEvaluacion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _fasePostulacionPuestoEvaluacion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_fasePostulacionPuestoEvaluacion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_fasePostulacionPuestoEvaluacion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_fasePostulacionPuestoEvaluacion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FasePostulacionPuestoEvaluacionWrapper((FasePostulacionPuestoEvaluacion)_fasePostulacionPuestoEvaluacion.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion) {
		return _fasePostulacionPuestoEvaluacion.compareTo(fasePostulacionPuestoEvaluacion);
	}

	@Override
	public int hashCode() {
		return _fasePostulacionPuestoEvaluacion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> toCacheModel() {
		return _fasePostulacionPuestoEvaluacion.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion toEscapedModel() {
		return new FasePostulacionPuestoEvaluacionWrapper(_fasePostulacionPuestoEvaluacion.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion toUnescapedModel() {
		return new FasePostulacionPuestoEvaluacionWrapper(_fasePostulacionPuestoEvaluacion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _fasePostulacionPuestoEvaluacion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _fasePostulacionPuestoEvaluacion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_fasePostulacionPuestoEvaluacion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FasePostulacionPuestoEvaluacionWrapper)) {
			return false;
		}

		FasePostulacionPuestoEvaluacionWrapper fasePostulacionPuestoEvaluacionWrapper =
			(FasePostulacionPuestoEvaluacionWrapper)obj;

		if (Validator.equals(_fasePostulacionPuestoEvaluacion,
					fasePostulacionPuestoEvaluacionWrapper._fasePostulacionPuestoEvaluacion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public FasePostulacionPuestoEvaluacion getWrappedFasePostulacionPuestoEvaluacion() {
		return _fasePostulacionPuestoEvaluacion;
	}

	@Override
	public FasePostulacionPuestoEvaluacion getWrappedModel() {
		return _fasePostulacionPuestoEvaluacion;
	}

	@Override
	public void resetOriginalValues() {
		_fasePostulacionPuestoEvaluacion.resetOriginalValues();
	}

	private FasePostulacionPuestoEvaluacion _fasePostulacionPuestoEvaluacion;
}
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
 * This class is a wrapper for {@link EvaluacionPregunta}.
 * </p>
 *
 * @author Danielle Delgado
 * @see EvaluacionPregunta
 * @generated
 */
public class EvaluacionPreguntaWrapper implements EvaluacionPregunta,
	ModelWrapper<EvaluacionPregunta> {
	public EvaluacionPreguntaWrapper(EvaluacionPregunta evaluacionPregunta) {
		_evaluacionPregunta = evaluacionPregunta;
	}

	@Override
	public Class<?> getModelClass() {
		return EvaluacionPregunta.class;
	}

	@Override
	public String getModelClassName() {
		return EvaluacionPregunta.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("preguntaId", getPreguntaId());
		attributes.put("nivel", getNivel());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		Long preguntaId = (Long)attributes.get("preguntaId");

		if (preguntaId != null) {
			setPreguntaId(preguntaId);
		}

		Long nivel = (Long)attributes.get("nivel");

		if (nivel != null) {
			setNivel(nivel);
		}
	}

	/**
	* Returns the primary key of this evaluacion pregunta.
	*
	* @return the primary key of this evaluacion pregunta
	*/
	@Override
	public com.hitss.layer.service.persistence.EvaluacionPreguntaPK getPrimaryKey() {
		return _evaluacionPregunta.getPrimaryKey();
	}

	/**
	* Sets the primary key of this evaluacion pregunta.
	*
	* @param primaryKey the primary key of this evaluacion pregunta
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.EvaluacionPreguntaPK primaryKey) {
		_evaluacionPregunta.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the evaluacion ID of this evaluacion pregunta.
	*
	* @return the evaluacion ID of this evaluacion pregunta
	*/
	@Override
	public long getEvaluacionId() {
		return _evaluacionPregunta.getEvaluacionId();
	}

	/**
	* Sets the evaluacion ID of this evaluacion pregunta.
	*
	* @param evaluacionId the evaluacion ID of this evaluacion pregunta
	*/
	@Override
	public void setEvaluacionId(long evaluacionId) {
		_evaluacionPregunta.setEvaluacionId(evaluacionId);
	}

	/**
	* Returns the pregunta ID of this evaluacion pregunta.
	*
	* @return the pregunta ID of this evaluacion pregunta
	*/
	@Override
	public long getPreguntaId() {
		return _evaluacionPregunta.getPreguntaId();
	}

	/**
	* Sets the pregunta ID of this evaluacion pregunta.
	*
	* @param preguntaId the pregunta ID of this evaluacion pregunta
	*/
	@Override
	public void setPreguntaId(long preguntaId) {
		_evaluacionPregunta.setPreguntaId(preguntaId);
	}

	/**
	* Returns the nivel of this evaluacion pregunta.
	*
	* @return the nivel of this evaluacion pregunta
	*/
	@Override
	public long getNivel() {
		return _evaluacionPregunta.getNivel();
	}

	/**
	* Sets the nivel of this evaluacion pregunta.
	*
	* @param nivel the nivel of this evaluacion pregunta
	*/
	@Override
	public void setNivel(long nivel) {
		_evaluacionPregunta.setNivel(nivel);
	}

	@Override
	public boolean isNew() {
		return _evaluacionPregunta.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_evaluacionPregunta.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _evaluacionPregunta.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_evaluacionPregunta.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _evaluacionPregunta.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _evaluacionPregunta.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_evaluacionPregunta.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _evaluacionPregunta.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_evaluacionPregunta.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_evaluacionPregunta.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_evaluacionPregunta.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EvaluacionPreguntaWrapper((EvaluacionPregunta)_evaluacionPregunta.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.EvaluacionPregunta evaluacionPregunta) {
		return _evaluacionPregunta.compareTo(evaluacionPregunta);
	}

	@Override
	public int hashCode() {
		return _evaluacionPregunta.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.EvaluacionPregunta> toCacheModel() {
		return _evaluacionPregunta.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.EvaluacionPregunta toEscapedModel() {
		return new EvaluacionPreguntaWrapper(_evaluacionPregunta.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.EvaluacionPregunta toUnescapedModel() {
		return new EvaluacionPreguntaWrapper(_evaluacionPregunta.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _evaluacionPregunta.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _evaluacionPregunta.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_evaluacionPregunta.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EvaluacionPreguntaWrapper)) {
			return false;
		}

		EvaluacionPreguntaWrapper evaluacionPreguntaWrapper = (EvaluacionPreguntaWrapper)obj;

		if (Validator.equals(_evaluacionPregunta,
					evaluacionPreguntaWrapper._evaluacionPregunta)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EvaluacionPregunta getWrappedEvaluacionPregunta() {
		return _evaluacionPregunta;
	}

	@Override
	public EvaluacionPregunta getWrappedModel() {
		return _evaluacionPregunta;
	}

	@Override
	public void resetOriginalValues() {
		_evaluacionPregunta.resetOriginalValues();
	}

	private EvaluacionPregunta _evaluacionPregunta;
}
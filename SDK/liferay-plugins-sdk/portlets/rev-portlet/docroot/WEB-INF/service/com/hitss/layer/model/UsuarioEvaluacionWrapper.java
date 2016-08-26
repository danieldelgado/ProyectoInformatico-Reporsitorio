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
 * This class is a wrapper for {@link UsuarioEvaluacion}.
 * </p>
 *
 * @author Danielle Delgado
 * @see UsuarioEvaluacion
 * @generated
 */
public class UsuarioEvaluacionWrapper implements UsuarioEvaluacion,
	ModelWrapper<UsuarioEvaluacion> {
	public UsuarioEvaluacionWrapper(UsuarioEvaluacion usuarioEvaluacion) {
		_usuarioEvaluacion = usuarioEvaluacion;
	}

	@Override
	public Class<?> getModelClass() {
		return UsuarioEvaluacion.class;
	}

	@Override
	public String getModelClassName() {
		return UsuarioEvaluacion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("actividadCronogramaId", getActividadCronogramaId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("nota", getNota());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long actividadCronogramaId = (Long)attributes.get(
				"actividadCronogramaId");

		if (actividadCronogramaId != null) {
			setActividadCronogramaId(actividadCronogramaId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		Integer nota = (Integer)attributes.get("nota");

		if (nota != null) {
			setNota(nota);
		}
	}

	/**
	* Returns the primary key of this usuario evaluacion.
	*
	* @return the primary key of this usuario evaluacion
	*/
	@Override
	public long getPrimaryKey() {
		return _usuarioEvaluacion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this usuario evaluacion.
	*
	* @param primaryKey the primary key of this usuario evaluacion
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_usuarioEvaluacion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the actividad cronograma ID of this usuario evaluacion.
	*
	* @return the actividad cronograma ID of this usuario evaluacion
	*/
	@Override
	public long getActividadCronogramaId() {
		return _usuarioEvaluacion.getActividadCronogramaId();
	}

	/**
	* Sets the actividad cronograma ID of this usuario evaluacion.
	*
	* @param actividadCronogramaId the actividad cronograma ID of this usuario evaluacion
	*/
	@Override
	public void setActividadCronogramaId(long actividadCronogramaId) {
		_usuarioEvaluacion.setActividadCronogramaId(actividadCronogramaId);
	}

	/**
	* Returns the usuario ID of this usuario evaluacion.
	*
	* @return the usuario ID of this usuario evaluacion
	*/
	@Override
	public long getUsuarioId() {
		return _usuarioEvaluacion.getUsuarioId();
	}

	/**
	* Sets the usuario ID of this usuario evaluacion.
	*
	* @param usuarioId the usuario ID of this usuario evaluacion
	*/
	@Override
	public void setUsuarioId(long usuarioId) {
		_usuarioEvaluacion.setUsuarioId(usuarioId);
	}

	/**
	* Returns the evaluacion ID of this usuario evaluacion.
	*
	* @return the evaluacion ID of this usuario evaluacion
	*/
	@Override
	public long getEvaluacionId() {
		return _usuarioEvaluacion.getEvaluacionId();
	}

	/**
	* Sets the evaluacion ID of this usuario evaluacion.
	*
	* @param evaluacionId the evaluacion ID of this usuario evaluacion
	*/
	@Override
	public void setEvaluacionId(long evaluacionId) {
		_usuarioEvaluacion.setEvaluacionId(evaluacionId);
	}

	/**
	* Returns the nota of this usuario evaluacion.
	*
	* @return the nota of this usuario evaluacion
	*/
	@Override
	public int getNota() {
		return _usuarioEvaluacion.getNota();
	}

	/**
	* Sets the nota of this usuario evaluacion.
	*
	* @param nota the nota of this usuario evaluacion
	*/
	@Override
	public void setNota(int nota) {
		_usuarioEvaluacion.setNota(nota);
	}

	@Override
	public boolean isNew() {
		return _usuarioEvaluacion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_usuarioEvaluacion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _usuarioEvaluacion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_usuarioEvaluacion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _usuarioEvaluacion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _usuarioEvaluacion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_usuarioEvaluacion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _usuarioEvaluacion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_usuarioEvaluacion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_usuarioEvaluacion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_usuarioEvaluacion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UsuarioEvaluacionWrapper((UsuarioEvaluacion)_usuarioEvaluacion.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.UsuarioEvaluacion usuarioEvaluacion) {
		return _usuarioEvaluacion.compareTo(usuarioEvaluacion);
	}

	@Override
	public int hashCode() {
		return _usuarioEvaluacion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.UsuarioEvaluacion> toCacheModel() {
		return _usuarioEvaluacion.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.UsuarioEvaluacion toEscapedModel() {
		return new UsuarioEvaluacionWrapper(_usuarioEvaluacion.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.UsuarioEvaluacion toUnescapedModel() {
		return new UsuarioEvaluacionWrapper(_usuarioEvaluacion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _usuarioEvaluacion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _usuarioEvaluacion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_usuarioEvaluacion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UsuarioEvaluacionWrapper)) {
			return false;
		}

		UsuarioEvaluacionWrapper usuarioEvaluacionWrapper = (UsuarioEvaluacionWrapper)obj;

		if (Validator.equals(_usuarioEvaluacion,
					usuarioEvaluacionWrapper._usuarioEvaluacion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UsuarioEvaluacion getWrappedUsuarioEvaluacion() {
		return _usuarioEvaluacion;
	}

	@Override
	public UsuarioEvaluacion getWrappedModel() {
		return _usuarioEvaluacion;
	}

	@Override
	public void resetOriginalValues() {
		_usuarioEvaluacion.resetOriginalValues();
	}

	private UsuarioEvaluacion _usuarioEvaluacion;
}
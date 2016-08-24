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
 * This class is a wrapper for {@link DetalleRepuestaReclutamiento}.
 * </p>
 *
 * @author Danielle Delgado
 * @see DetalleRepuestaReclutamiento
 * @generated
 */
public class DetalleRepuestaReclutamientoWrapper
	implements DetalleRepuestaReclutamiento,
		ModelWrapper<DetalleRepuestaReclutamiento> {
	public DetalleRepuestaReclutamientoWrapper(
		DetalleRepuestaReclutamiento detalleRepuestaReclutamiento) {
		_detalleRepuestaReclutamiento = detalleRepuestaReclutamiento;
	}

	@Override
	public Class<?> getModelClass() {
		return DetalleRepuestaReclutamiento.class;
	}

	@Override
	public String getModelClassName() {
		return DetalleRepuestaReclutamiento.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("detalleRepsuestaId", getDetalleRepsuestaId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("preguntaId", getPreguntaId());
		attributes.put("respuestaSeleccionada", getRespuestaSeleccionada());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long detalleRepsuestaId = (Long)attributes.get("detalleRepsuestaId");

		if (detalleRepsuestaId != null) {
			setDetalleRepsuestaId(detalleRepsuestaId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Long preguntaId = (Long)attributes.get("preguntaId");

		if (preguntaId != null) {
			setPreguntaId(preguntaId);
		}

		Integer respuestaSeleccionada = (Integer)attributes.get(
				"respuestaSeleccionada");

		if (respuestaSeleccionada != null) {
			setRespuestaSeleccionada(respuestaSeleccionada);
		}
	}

	/**
	* Returns the primary key of this detalle repuesta reclutamiento.
	*
	* @return the primary key of this detalle repuesta reclutamiento
	*/
	@Override
	public com.hitss.layer.service.persistence.DetalleRepuestaReclutamientoPK getPrimaryKey() {
		return _detalleRepuestaReclutamiento.getPrimaryKey();
	}

	/**
	* Sets the primary key of this detalle repuesta reclutamiento.
	*
	* @param primaryKey the primary key of this detalle repuesta reclutamiento
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.DetalleRepuestaReclutamientoPK primaryKey) {
		_detalleRepuestaReclutamiento.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the detalle repsuesta ID of this detalle repuesta reclutamiento.
	*
	* @return the detalle repsuesta ID of this detalle repuesta reclutamiento
	*/
	@Override
	public long getDetalleRepsuestaId() {
		return _detalleRepuestaReclutamiento.getDetalleRepsuestaId();
	}

	/**
	* Sets the detalle repsuesta ID of this detalle repuesta reclutamiento.
	*
	* @param detalleRepsuestaId the detalle repsuesta ID of this detalle repuesta reclutamiento
	*/
	@Override
	public void setDetalleRepsuestaId(long detalleRepsuestaId) {
		_detalleRepuestaReclutamiento.setDetalleRepsuestaId(detalleRepsuestaId);
	}

	/**
	* Returns the usuario ID of this detalle repuesta reclutamiento.
	*
	* @return the usuario ID of this detalle repuesta reclutamiento
	*/
	@Override
	public long getUsuarioId() {
		return _detalleRepuestaReclutamiento.getUsuarioId();
	}

	/**
	* Sets the usuario ID of this detalle repuesta reclutamiento.
	*
	* @param usuarioId the usuario ID of this detalle repuesta reclutamiento
	*/
	@Override
	public void setUsuarioId(long usuarioId) {
		_detalleRepuestaReclutamiento.setUsuarioId(usuarioId);
	}

	/**
	* Returns the evaluacion ID of this detalle repuesta reclutamiento.
	*
	* @return the evaluacion ID of this detalle repuesta reclutamiento
	*/
	@Override
	public long getEvaluacionId() {
		return _detalleRepuestaReclutamiento.getEvaluacionId();
	}

	/**
	* Sets the evaluacion ID of this detalle repuesta reclutamiento.
	*
	* @param evaluacionId the evaluacion ID of this detalle repuesta reclutamiento
	*/
	@Override
	public void setEvaluacionId(long evaluacionId) {
		_detalleRepuestaReclutamiento.setEvaluacionId(evaluacionId);
	}

	/**
	* Returns the descripcion of this detalle repuesta reclutamiento.
	*
	* @return the descripcion of this detalle repuesta reclutamiento
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _detalleRepuestaReclutamiento.getDescripcion();
	}

	/**
	* Sets the descripcion of this detalle repuesta reclutamiento.
	*
	* @param descripcion the descripcion of this detalle repuesta reclutamiento
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_detalleRepuestaReclutamiento.setDescripcion(descripcion);
	}

	/**
	* Returns the pregunta ID of this detalle repuesta reclutamiento.
	*
	* @return the pregunta ID of this detalle repuesta reclutamiento
	*/
	@Override
	public long getPreguntaId() {
		return _detalleRepuestaReclutamiento.getPreguntaId();
	}

	/**
	* Sets the pregunta ID of this detalle repuesta reclutamiento.
	*
	* @param preguntaId the pregunta ID of this detalle repuesta reclutamiento
	*/
	@Override
	public void setPreguntaId(long preguntaId) {
		_detalleRepuestaReclutamiento.setPreguntaId(preguntaId);
	}

	/**
	* Returns the respuesta seleccionada of this detalle repuesta reclutamiento.
	*
	* @return the respuesta seleccionada of this detalle repuesta reclutamiento
	*/
	@Override
	public int getRespuestaSeleccionada() {
		return _detalleRepuestaReclutamiento.getRespuestaSeleccionada();
	}

	/**
	* Sets the respuesta seleccionada of this detalle repuesta reclutamiento.
	*
	* @param respuestaSeleccionada the respuesta seleccionada of this detalle repuesta reclutamiento
	*/
	@Override
	public void setRespuestaSeleccionada(int respuestaSeleccionada) {
		_detalleRepuestaReclutamiento.setRespuestaSeleccionada(respuestaSeleccionada);
	}

	@Override
	public boolean isNew() {
		return _detalleRepuestaReclutamiento.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_detalleRepuestaReclutamiento.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _detalleRepuestaReclutamiento.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_detalleRepuestaReclutamiento.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _detalleRepuestaReclutamiento.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _detalleRepuestaReclutamiento.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_detalleRepuestaReclutamiento.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _detalleRepuestaReclutamiento.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_detalleRepuestaReclutamiento.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_detalleRepuestaReclutamiento.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_detalleRepuestaReclutamiento.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DetalleRepuestaReclutamientoWrapper((DetalleRepuestaReclutamiento)_detalleRepuestaReclutamiento.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.DetalleRepuestaReclutamiento detalleRepuestaReclutamiento) {
		return _detalleRepuestaReclutamiento.compareTo(detalleRepuestaReclutamiento);
	}

	@Override
	public int hashCode() {
		return _detalleRepuestaReclutamiento.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.DetalleRepuestaReclutamiento> toCacheModel() {
		return _detalleRepuestaReclutamiento.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.DetalleRepuestaReclutamiento toEscapedModel() {
		return new DetalleRepuestaReclutamientoWrapper(_detalleRepuestaReclutamiento.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.DetalleRepuestaReclutamiento toUnescapedModel() {
		return new DetalleRepuestaReclutamientoWrapper(_detalleRepuestaReclutamiento.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _detalleRepuestaReclutamiento.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _detalleRepuestaReclutamiento.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_detalleRepuestaReclutamiento.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DetalleRepuestaReclutamientoWrapper)) {
			return false;
		}

		DetalleRepuestaReclutamientoWrapper detalleRepuestaReclutamientoWrapper = (DetalleRepuestaReclutamientoWrapper)obj;

		if (Validator.equals(_detalleRepuestaReclutamiento,
					detalleRepuestaReclutamientoWrapper._detalleRepuestaReclutamiento)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DetalleRepuestaReclutamiento getWrappedDetalleRepuestaReclutamiento() {
		return _detalleRepuestaReclutamiento;
	}

	@Override
	public DetalleRepuestaReclutamiento getWrappedModel() {
		return _detalleRepuestaReclutamiento;
	}

	@Override
	public void resetOriginalValues() {
		_detalleRepuestaReclutamiento.resetOriginalValues();
	}

	private DetalleRepuestaReclutamiento _detalleRepuestaReclutamiento;
}
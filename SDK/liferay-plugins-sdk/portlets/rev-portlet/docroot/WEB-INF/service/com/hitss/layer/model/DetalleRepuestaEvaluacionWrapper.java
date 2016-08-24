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
 * This class is a wrapper for {@link DetalleRepuestaEvaluacion}.
 * </p>
 *
 * @author Danielle Delgado
 * @see DetalleRepuestaEvaluacion
 * @generated
 */
public class DetalleRepuestaEvaluacionWrapper
	implements DetalleRepuestaEvaluacion,
		ModelWrapper<DetalleRepuestaEvaluacion> {
	public DetalleRepuestaEvaluacionWrapper(
		DetalleRepuestaEvaluacion detalleRepuestaEvaluacion) {
		_detalleRepuestaEvaluacion = detalleRepuestaEvaluacion;
	}

	@Override
	public Class<?> getModelClass() {
		return DetalleRepuestaEvaluacion.class;
	}

	@Override
	public String getModelClassName() {
		return DetalleRepuestaEvaluacion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("detalleRepuestaEvaluacionId",
			getDetalleRepuestaEvaluacionId());
		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("preguntaId", getPreguntaId());
		attributes.put("respuestaSeleccionada", getRespuestaSeleccionada());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long detalleRepuestaEvaluacionId = (Long)attributes.get(
				"detalleRepuestaEvaluacionId");

		if (detalleRepuestaEvaluacionId != null) {
			setDetalleRepuestaEvaluacionId(detalleRepuestaEvaluacionId);
		}

		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Long preguntaId = (Long)attributes.get("preguntaId");

		if (preguntaId != null) {
			setPreguntaId(preguntaId);
		}

		Long respuestaSeleccionada = (Long)attributes.get(
				"respuestaSeleccionada");

		if (respuestaSeleccionada != null) {
			setRespuestaSeleccionada(respuestaSeleccionada);
		}
	}

	/**
	* Returns the primary key of this detalle repuesta evaluacion.
	*
	* @return the primary key of this detalle repuesta evaluacion
	*/
	@Override
	public com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK getPrimaryKey() {
		return _detalleRepuestaEvaluacion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this detalle repuesta evaluacion.
	*
	* @param primaryKey the primary key of this detalle repuesta evaluacion
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK primaryKey) {
		_detalleRepuestaEvaluacion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the detalle repuesta evaluacion ID of this detalle repuesta evaluacion.
	*
	* @return the detalle repuesta evaluacion ID of this detalle repuesta evaluacion
	*/
	@Override
	public long getDetalleRepuestaEvaluacionId() {
		return _detalleRepuestaEvaluacion.getDetalleRepuestaEvaluacionId();
	}

	/**
	* Sets the detalle repuesta evaluacion ID of this detalle repuesta evaluacion.
	*
	* @param detalleRepuestaEvaluacionId the detalle repuesta evaluacion ID of this detalle repuesta evaluacion
	*/
	@Override
	public void setDetalleRepuestaEvaluacionId(long detalleRepuestaEvaluacionId) {
		_detalleRepuestaEvaluacion.setDetalleRepuestaEvaluacionId(detalleRepuestaEvaluacionId);
	}

	/**
	* Returns the evaluacion ID of this detalle repuesta evaluacion.
	*
	* @return the evaluacion ID of this detalle repuesta evaluacion
	*/
	@Override
	public long getEvaluacionId() {
		return _detalleRepuestaEvaluacion.getEvaluacionId();
	}

	/**
	* Sets the evaluacion ID of this detalle repuesta evaluacion.
	*
	* @param evaluacionId the evaluacion ID of this detalle repuesta evaluacion
	*/
	@Override
	public void setEvaluacionId(long evaluacionId) {
		_detalleRepuestaEvaluacion.setEvaluacionId(evaluacionId);
	}

	/**
	* Returns the usuario ID of this detalle repuesta evaluacion.
	*
	* @return the usuario ID of this detalle repuesta evaluacion
	*/
	@Override
	public long getUsuarioId() {
		return _detalleRepuestaEvaluacion.getUsuarioId();
	}

	/**
	* Sets the usuario ID of this detalle repuesta evaluacion.
	*
	* @param usuarioId the usuario ID of this detalle repuesta evaluacion
	*/
	@Override
	public void setUsuarioId(long usuarioId) {
		_detalleRepuestaEvaluacion.setUsuarioId(usuarioId);
	}

	/**
	* Returns the descripcion of this detalle repuesta evaluacion.
	*
	* @return the descripcion of this detalle repuesta evaluacion
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _detalleRepuestaEvaluacion.getDescripcion();
	}

	/**
	* Sets the descripcion of this detalle repuesta evaluacion.
	*
	* @param descripcion the descripcion of this detalle repuesta evaluacion
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_detalleRepuestaEvaluacion.setDescripcion(descripcion);
	}

	/**
	* Returns the pregunta ID of this detalle repuesta evaluacion.
	*
	* @return the pregunta ID of this detalle repuesta evaluacion
	*/
	@Override
	public long getPreguntaId() {
		return _detalleRepuestaEvaluacion.getPreguntaId();
	}

	/**
	* Sets the pregunta ID of this detalle repuesta evaluacion.
	*
	* @param preguntaId the pregunta ID of this detalle repuesta evaluacion
	*/
	@Override
	public void setPreguntaId(long preguntaId) {
		_detalleRepuestaEvaluacion.setPreguntaId(preguntaId);
	}

	/**
	* Returns the respuesta seleccionada of this detalle repuesta evaluacion.
	*
	* @return the respuesta seleccionada of this detalle repuesta evaluacion
	*/
	@Override
	public long getRespuestaSeleccionada() {
		return _detalleRepuestaEvaluacion.getRespuestaSeleccionada();
	}

	/**
	* Sets the respuesta seleccionada of this detalle repuesta evaluacion.
	*
	* @param respuestaSeleccionada the respuesta seleccionada of this detalle repuesta evaluacion
	*/
	@Override
	public void setRespuestaSeleccionada(long respuestaSeleccionada) {
		_detalleRepuestaEvaluacion.setRespuestaSeleccionada(respuestaSeleccionada);
	}

	@Override
	public boolean isNew() {
		return _detalleRepuestaEvaluacion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_detalleRepuestaEvaluacion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _detalleRepuestaEvaluacion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_detalleRepuestaEvaluacion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _detalleRepuestaEvaluacion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _detalleRepuestaEvaluacion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_detalleRepuestaEvaluacion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _detalleRepuestaEvaluacion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_detalleRepuestaEvaluacion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_detalleRepuestaEvaluacion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_detalleRepuestaEvaluacion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DetalleRepuestaEvaluacionWrapper((DetalleRepuestaEvaluacion)_detalleRepuestaEvaluacion.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.DetalleRepuestaEvaluacion detalleRepuestaEvaluacion) {
		return _detalleRepuestaEvaluacion.compareTo(detalleRepuestaEvaluacion);
	}

	@Override
	public int hashCode() {
		return _detalleRepuestaEvaluacion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.DetalleRepuestaEvaluacion> toCacheModel() {
		return _detalleRepuestaEvaluacion.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.DetalleRepuestaEvaluacion toEscapedModel() {
		return new DetalleRepuestaEvaluacionWrapper(_detalleRepuestaEvaluacion.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.DetalleRepuestaEvaluacion toUnescapedModel() {
		return new DetalleRepuestaEvaluacionWrapper(_detalleRepuestaEvaluacion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _detalleRepuestaEvaluacion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _detalleRepuestaEvaluacion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_detalleRepuestaEvaluacion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DetalleRepuestaEvaluacionWrapper)) {
			return false;
		}

		DetalleRepuestaEvaluacionWrapper detalleRepuestaEvaluacionWrapper = (DetalleRepuestaEvaluacionWrapper)obj;

		if (Validator.equals(_detalleRepuestaEvaluacion,
					detalleRepuestaEvaluacionWrapper._detalleRepuestaEvaluacion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DetalleRepuestaEvaluacion getWrappedDetalleRepuestaEvaluacion() {
		return _detalleRepuestaEvaluacion;
	}

	@Override
	public DetalleRepuestaEvaluacion getWrappedModel() {
		return _detalleRepuestaEvaluacion;
	}

	@Override
	public void resetOriginalValues() {
		_detalleRepuestaEvaluacion.resetOriginalValues();
	}

	private DetalleRepuestaEvaluacion _detalleRepuestaEvaluacion;
}
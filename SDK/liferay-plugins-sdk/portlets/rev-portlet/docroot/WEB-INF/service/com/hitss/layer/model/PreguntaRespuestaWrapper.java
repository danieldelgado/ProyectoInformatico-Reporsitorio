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
 * This class is a wrapper for {@link PreguntaRespuesta}.
 * </p>
 *
 * @author Danielle Delgado
 * @see PreguntaRespuesta
 * @generated
 */
public class PreguntaRespuestaWrapper implements PreguntaRespuesta,
	ModelWrapper<PreguntaRespuesta> {
	public PreguntaRespuestaWrapper(PreguntaRespuesta preguntaRespuesta) {
		_preguntaRespuesta = preguntaRespuesta;
	}

	@Override
	public Class<?> getModelClass() {
		return PreguntaRespuesta.class;
	}

	@Override
	public String getModelClassName() {
		return PreguntaRespuesta.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("preguntaId", getPreguntaId());
		attributes.put("respuestaId", getRespuestaId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long preguntaId = (Long)attributes.get("preguntaId");

		if (preguntaId != null) {
			setPreguntaId(preguntaId);
		}

		Long respuestaId = (Long)attributes.get("respuestaId");

		if (respuestaId != null) {
			setRespuestaId(respuestaId);
		}
	}

	/**
	* Returns the primary key of this pregunta respuesta.
	*
	* @return the primary key of this pregunta respuesta
	*/
	@Override
	public com.hitss.layer.service.persistence.PreguntaRespuestaPK getPrimaryKey() {
		return _preguntaRespuesta.getPrimaryKey();
	}

	/**
	* Sets the primary key of this pregunta respuesta.
	*
	* @param primaryKey the primary key of this pregunta respuesta
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.PreguntaRespuestaPK primaryKey) {
		_preguntaRespuesta.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the pregunta ID of this pregunta respuesta.
	*
	* @return the pregunta ID of this pregunta respuesta
	*/
	@Override
	public long getPreguntaId() {
		return _preguntaRespuesta.getPreguntaId();
	}

	/**
	* Sets the pregunta ID of this pregunta respuesta.
	*
	* @param preguntaId the pregunta ID of this pregunta respuesta
	*/
	@Override
	public void setPreguntaId(long preguntaId) {
		_preguntaRespuesta.setPreguntaId(preguntaId);
	}

	/**
	* Returns the respuesta ID of this pregunta respuesta.
	*
	* @return the respuesta ID of this pregunta respuesta
	*/
	@Override
	public long getRespuestaId() {
		return _preguntaRespuesta.getRespuestaId();
	}

	/**
	* Sets the respuesta ID of this pregunta respuesta.
	*
	* @param respuestaId the respuesta ID of this pregunta respuesta
	*/
	@Override
	public void setRespuestaId(long respuestaId) {
		_preguntaRespuesta.setRespuestaId(respuestaId);
	}

	@Override
	public boolean isNew() {
		return _preguntaRespuesta.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_preguntaRespuesta.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _preguntaRespuesta.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_preguntaRespuesta.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _preguntaRespuesta.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _preguntaRespuesta.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_preguntaRespuesta.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _preguntaRespuesta.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_preguntaRespuesta.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_preguntaRespuesta.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_preguntaRespuesta.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PreguntaRespuestaWrapper((PreguntaRespuesta)_preguntaRespuesta.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.PreguntaRespuesta preguntaRespuesta) {
		return _preguntaRespuesta.compareTo(preguntaRespuesta);
	}

	@Override
	public int hashCode() {
		return _preguntaRespuesta.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.PreguntaRespuesta> toCacheModel() {
		return _preguntaRespuesta.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.PreguntaRespuesta toEscapedModel() {
		return new PreguntaRespuestaWrapper(_preguntaRespuesta.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.PreguntaRespuesta toUnescapedModel() {
		return new PreguntaRespuestaWrapper(_preguntaRespuesta.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _preguntaRespuesta.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _preguntaRespuesta.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_preguntaRespuesta.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PreguntaRespuestaWrapper)) {
			return false;
		}

		PreguntaRespuestaWrapper preguntaRespuestaWrapper = (PreguntaRespuestaWrapper)obj;

		if (Validator.equals(_preguntaRespuesta,
					preguntaRespuestaWrapper._preguntaRespuesta)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PreguntaRespuesta getWrappedPreguntaRespuesta() {
		return _preguntaRespuesta;
	}

	@Override
	public PreguntaRespuesta getWrappedModel() {
		return _preguntaRespuesta;
	}

	@Override
	public void resetOriginalValues() {
		_preguntaRespuesta.resetOriginalValues();
	}

	private PreguntaRespuesta _preguntaRespuesta;
}
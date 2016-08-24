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
 * This class is a wrapper for {@link Pregunta}.
 * </p>
 *
 * @author Crossfire
 * @see Pregunta
 * @generated
 */
public class PreguntaWrapper implements Pregunta, ModelWrapper<Pregunta> {
	public PreguntaWrapper(Pregunta pregunta) {
		_pregunta = pregunta;
	}

	@Override
	public Class<?> getModelClass() {
		return Pregunta.class;
	}

	@Override
	public String getModelClassName() {
		return Pregunta.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("preguntaId", getPreguntaId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long preguntaId = (Long)attributes.get("preguntaId");

		if (preguntaId != null) {
			setPreguntaId(preguntaId);
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

		Date fechacreamodifica = (Date)attributes.get("fechacreamodifica");

		if (fechacreamodifica != null) {
			setFechacreamodifica(fechacreamodifica);
		}
	}

	/**
	* Returns the primary key of this pregunta.
	*
	* @return the primary key of this pregunta
	*/
	@Override
	public long getPrimaryKey() {
		return _pregunta.getPrimaryKey();
	}

	/**
	* Sets the primary key of this pregunta.
	*
	* @param primaryKey the primary key of this pregunta
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_pregunta.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the pregunta ID of this pregunta.
	*
	* @return the pregunta ID of this pregunta
	*/
	@Override
	public long getPreguntaId() {
		return _pregunta.getPreguntaId();
	}

	/**
	* Sets the pregunta ID of this pregunta.
	*
	* @param preguntaId the pregunta ID of this pregunta
	*/
	@Override
	public void setPreguntaId(long preguntaId) {
		_pregunta.setPreguntaId(preguntaId);
	}

	/**
	* Returns the descripcion of this pregunta.
	*
	* @return the descripcion of this pregunta
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _pregunta.getDescripcion();
	}

	/**
	* Sets the descripcion of this pregunta.
	*
	* @param descripcion the descripcion of this pregunta
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_pregunta.setDescripcion(descripcion);
	}

	/**
	* Returns the activo of this pregunta.
	*
	* @return the activo of this pregunta
	*/
	@Override
	public boolean getActivo() {
		return _pregunta.getActivo();
	}

	/**
	* Returns <code>true</code> if this pregunta is activo.
	*
	* @return <code>true</code> if this pregunta is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _pregunta.isActivo();
	}

	/**
	* Sets whether this pregunta is activo.
	*
	* @param activo the activo of this pregunta
	*/
	@Override
	public void setActivo(boolean activo) {
		_pregunta.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this pregunta.
	*
	* @return the usuariocrea of this pregunta
	*/
	@Override
	public long getUsuariocrea() {
		return _pregunta.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this pregunta.
	*
	* @param usuariocrea the usuariocrea of this pregunta
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_pregunta.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this pregunta.
	*
	* @return the fechacrea of this pregunta
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _pregunta.getFechacrea();
	}

	/**
	* Sets the fechacrea of this pregunta.
	*
	* @param fechacrea the fechacrea of this pregunta
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_pregunta.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this pregunta.
	*
	* @return the usuariomodifica of this pregunta
	*/
	@Override
	public long getUsuariomodifica() {
		return _pregunta.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this pregunta.
	*
	* @param usuariomodifica the usuariomodifica of this pregunta
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_pregunta.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this pregunta.
	*
	* @return the fechacreamodifica of this pregunta
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _pregunta.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this pregunta.
	*
	* @param fechacreamodifica the fechacreamodifica of this pregunta
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_pregunta.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _pregunta.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_pregunta.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _pregunta.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_pregunta.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _pregunta.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _pregunta.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_pregunta.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _pregunta.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_pregunta.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_pregunta.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_pregunta.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PreguntaWrapper((Pregunta)_pregunta.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.Pregunta pregunta) {
		return _pregunta.compareTo(pregunta);
	}

	@Override
	public int hashCode() {
		return _pregunta.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.Pregunta> toCacheModel() {
		return _pregunta.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.Pregunta toEscapedModel() {
		return new PreguntaWrapper(_pregunta.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.Pregunta toUnescapedModel() {
		return new PreguntaWrapper(_pregunta.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _pregunta.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _pregunta.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_pregunta.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PreguntaWrapper)) {
			return false;
		}

		PreguntaWrapper preguntaWrapper = (PreguntaWrapper)obj;

		if (Validator.equals(_pregunta, preguntaWrapper._pregunta)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Pregunta getWrappedPregunta() {
		return _pregunta;
	}

	@Override
	public Pregunta getWrappedModel() {
		return _pregunta;
	}

	@Override
	public void resetOriginalValues() {
		_pregunta.resetOriginalValues();
	}

	private Pregunta _pregunta;
}
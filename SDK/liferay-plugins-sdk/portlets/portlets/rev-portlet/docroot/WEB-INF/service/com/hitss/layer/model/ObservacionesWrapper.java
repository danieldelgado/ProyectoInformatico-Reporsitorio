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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Observaciones}.
 * </p>
 *
 * @author Danielle Delgado
 * @see Observaciones
 * @generated
 */
public class ObservacionesWrapper implements Observaciones,
	ModelWrapper<Observaciones> {
	public ObservacionesWrapper(Observaciones observaciones) {
		_observaciones = observaciones;
	}

	@Override
	public Class<?> getModelClass() {
		return Observaciones.class;
	}

	@Override
	public String getModelClassName() {
		return Observaciones.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("observacionId", getObservacionId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("tabla", getTabla());
		attributes.put("registroId", getRegistroId());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long observacionId = (Long)attributes.get("observacionId");

		if (observacionId != null) {
			setObservacionId(observacionId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String tabla = (String)attributes.get("tabla");

		if (tabla != null) {
			setTabla(tabla);
		}

		Long registroId = (Long)attributes.get("registroId");

		if (registroId != null) {
			setRegistroId(registroId);
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
	* Returns the primary key of this observaciones.
	*
	* @return the primary key of this observaciones
	*/
	@Override
	public long getPrimaryKey() {
		return _observaciones.getPrimaryKey();
	}

	/**
	* Sets the primary key of this observaciones.
	*
	* @param primaryKey the primary key of this observaciones
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_observaciones.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the observacion ID of this observaciones.
	*
	* @return the observacion ID of this observaciones
	*/
	@Override
	public long getObservacionId() {
		return _observaciones.getObservacionId();
	}

	/**
	* Sets the observacion ID of this observaciones.
	*
	* @param observacionId the observacion ID of this observaciones
	*/
	@Override
	public void setObservacionId(long observacionId) {
		_observaciones.setObservacionId(observacionId);
	}

	/**
	* Returns the descripcion of this observaciones.
	*
	* @return the descripcion of this observaciones
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _observaciones.getDescripcion();
	}

	/**
	* Sets the descripcion of this observaciones.
	*
	* @param descripcion the descripcion of this observaciones
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_observaciones.setDescripcion(descripcion);
	}

	/**
	* Returns the tabla of this observaciones.
	*
	* @return the tabla of this observaciones
	*/
	@Override
	public java.lang.String getTabla() {
		return _observaciones.getTabla();
	}

	/**
	* Sets the tabla of this observaciones.
	*
	* @param tabla the tabla of this observaciones
	*/
	@Override
	public void setTabla(java.lang.String tabla) {
		_observaciones.setTabla(tabla);
	}

	/**
	* Returns the registro ID of this observaciones.
	*
	* @return the registro ID of this observaciones
	*/
	@Override
	public long getRegistroId() {
		return _observaciones.getRegistroId();
	}

	/**
	* Sets the registro ID of this observaciones.
	*
	* @param registroId the registro ID of this observaciones
	*/
	@Override
	public void setRegistroId(long registroId) {
		_observaciones.setRegistroId(registroId);
	}

	/**
	* Returns the activo of this observaciones.
	*
	* @return the activo of this observaciones
	*/
	@Override
	public boolean getActivo() {
		return _observaciones.getActivo();
	}

	/**
	* Returns <code>true</code> if this observaciones is activo.
	*
	* @return <code>true</code> if this observaciones is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _observaciones.isActivo();
	}

	/**
	* Sets whether this observaciones is activo.
	*
	* @param activo the activo of this observaciones
	*/
	@Override
	public void setActivo(boolean activo) {
		_observaciones.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this observaciones.
	*
	* @return the usuariocrea of this observaciones
	*/
	@Override
	public long getUsuariocrea() {
		return _observaciones.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this observaciones.
	*
	* @param usuariocrea the usuariocrea of this observaciones
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_observaciones.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this observaciones.
	*
	* @return the fechacrea of this observaciones
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _observaciones.getFechacrea();
	}

	/**
	* Sets the fechacrea of this observaciones.
	*
	* @param fechacrea the fechacrea of this observaciones
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_observaciones.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this observaciones.
	*
	* @return the usuariomodifica of this observaciones
	*/
	@Override
	public long getUsuariomodifica() {
		return _observaciones.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this observaciones.
	*
	* @param usuariomodifica the usuariomodifica of this observaciones
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_observaciones.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this observaciones.
	*
	* @return the fechacreamodifica of this observaciones
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _observaciones.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this observaciones.
	*
	* @param fechacreamodifica the fechacreamodifica of this observaciones
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_observaciones.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _observaciones.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_observaciones.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _observaciones.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_observaciones.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _observaciones.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _observaciones.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_observaciones.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _observaciones.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_observaciones.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_observaciones.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_observaciones.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ObservacionesWrapper((Observaciones)_observaciones.clone());
	}

	@Override
	public int compareTo(com.hitss.layer.model.Observaciones observaciones) {
		return _observaciones.compareTo(observaciones);
	}

	@Override
	public int hashCode() {
		return _observaciones.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.Observaciones> toCacheModel() {
		return _observaciones.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.Observaciones toEscapedModel() {
		return new ObservacionesWrapper(_observaciones.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.Observaciones toUnescapedModel() {
		return new ObservacionesWrapper(_observaciones.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _observaciones.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _observaciones.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_observaciones.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ObservacionesWrapper)) {
			return false;
		}

		ObservacionesWrapper observacionesWrapper = (ObservacionesWrapper)obj;

		if (Validator.equals(_observaciones, observacionesWrapper._observaciones)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Observaciones getWrappedObservaciones() {
		return _observaciones;
	}

	@Override
	public Observaciones getWrappedModel() {
		return _observaciones;
	}

	@Override
	public void resetOriginalValues() {
		_observaciones.resetOriginalValues();
	}

	private Observaciones _observaciones;
}
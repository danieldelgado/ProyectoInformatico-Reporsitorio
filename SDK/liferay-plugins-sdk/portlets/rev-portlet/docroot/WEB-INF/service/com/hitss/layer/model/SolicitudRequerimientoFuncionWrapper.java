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
 * This class is a wrapper for {@link SolicitudRequerimientoFuncion}.
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoFuncion
 * @generated
 */
public class SolicitudRequerimientoFuncionWrapper
	implements SolicitudRequerimientoFuncion,
		ModelWrapper<SolicitudRequerimientoFuncion> {
	public SolicitudRequerimientoFuncionWrapper(
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion) {
		_solicitudRequerimientoFuncion = solicitudRequerimientoFuncion;
	}

	@Override
	public Class<?> getModelClass() {
		return SolicitudRequerimientoFuncion.class;
	}

	@Override
	public String getModelClassName() {
		return SolicitudRequerimientoFuncion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudFuncionId", getSolicitudFuncionId());
		attributes.put("funcionId", getFuncionId());
		attributes.put("exigible", getExigible());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long solicitudFuncionId = (Long)attributes.get("solicitudFuncionId");

		if (solicitudFuncionId != null) {
			setSolicitudFuncionId(solicitudFuncionId);
		}

		Long funcionId = (Long)attributes.get("funcionId");

		if (funcionId != null) {
			setFuncionId(funcionId);
		}

		Boolean exigible = (Boolean)attributes.get("exigible");

		if (exigible != null) {
			setExigible(exigible);
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

		Date fechamodifica = (Date)attributes.get("fechamodifica");

		if (fechamodifica != null) {
			setFechamodifica(fechamodifica);
		}
	}

	/**
	* Returns the primary key of this solicitud requerimiento funcion.
	*
	* @return the primary key of this solicitud requerimiento funcion
	*/
	@Override
	public com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK getPrimaryKey() {
		return _solicitudRequerimientoFuncion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this solicitud requerimiento funcion.
	*
	* @param primaryKey the primary key of this solicitud requerimiento funcion
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK primaryKey) {
		_solicitudRequerimientoFuncion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the solicitud funcion ID of this solicitud requerimiento funcion.
	*
	* @return the solicitud funcion ID of this solicitud requerimiento funcion
	*/
	@Override
	public long getSolicitudFuncionId() {
		return _solicitudRequerimientoFuncion.getSolicitudFuncionId();
	}

	/**
	* Sets the solicitud funcion ID of this solicitud requerimiento funcion.
	*
	* @param solicitudFuncionId the solicitud funcion ID of this solicitud requerimiento funcion
	*/
	@Override
	public void setSolicitudFuncionId(long solicitudFuncionId) {
		_solicitudRequerimientoFuncion.setSolicitudFuncionId(solicitudFuncionId);
	}

	/**
	* Returns the funcion ID of this solicitud requerimiento funcion.
	*
	* @return the funcion ID of this solicitud requerimiento funcion
	*/
	@Override
	public long getFuncionId() {
		return _solicitudRequerimientoFuncion.getFuncionId();
	}

	/**
	* Sets the funcion ID of this solicitud requerimiento funcion.
	*
	* @param funcionId the funcion ID of this solicitud requerimiento funcion
	*/
	@Override
	public void setFuncionId(long funcionId) {
		_solicitudRequerimientoFuncion.setFuncionId(funcionId);
	}

	/**
	* Returns the exigible of this solicitud requerimiento funcion.
	*
	* @return the exigible of this solicitud requerimiento funcion
	*/
	@Override
	public boolean getExigible() {
		return _solicitudRequerimientoFuncion.getExigible();
	}

	/**
	* Returns <code>true</code> if this solicitud requerimiento funcion is exigible.
	*
	* @return <code>true</code> if this solicitud requerimiento funcion is exigible; <code>false</code> otherwise
	*/
	@Override
	public boolean isExigible() {
		return _solicitudRequerimientoFuncion.isExigible();
	}

	/**
	* Sets whether this solicitud requerimiento funcion is exigible.
	*
	* @param exigible the exigible of this solicitud requerimiento funcion
	*/
	@Override
	public void setExigible(boolean exigible) {
		_solicitudRequerimientoFuncion.setExigible(exigible);
	}

	/**
	* Returns the activo of this solicitud requerimiento funcion.
	*
	* @return the activo of this solicitud requerimiento funcion
	*/
	@Override
	public boolean getActivo() {
		return _solicitudRequerimientoFuncion.getActivo();
	}

	/**
	* Returns <code>true</code> if this solicitud requerimiento funcion is activo.
	*
	* @return <code>true</code> if this solicitud requerimiento funcion is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _solicitudRequerimientoFuncion.isActivo();
	}

	/**
	* Sets whether this solicitud requerimiento funcion is activo.
	*
	* @param activo the activo of this solicitud requerimiento funcion
	*/
	@Override
	public void setActivo(boolean activo) {
		_solicitudRequerimientoFuncion.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this solicitud requerimiento funcion.
	*
	* @return the usuariocrea of this solicitud requerimiento funcion
	*/
	@Override
	public long getUsuariocrea() {
		return _solicitudRequerimientoFuncion.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this solicitud requerimiento funcion.
	*
	* @param usuariocrea the usuariocrea of this solicitud requerimiento funcion
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_solicitudRequerimientoFuncion.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this solicitud requerimiento funcion.
	*
	* @return the fechacrea of this solicitud requerimiento funcion
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _solicitudRequerimientoFuncion.getFechacrea();
	}

	/**
	* Sets the fechacrea of this solicitud requerimiento funcion.
	*
	* @param fechacrea the fechacrea of this solicitud requerimiento funcion
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_solicitudRequerimientoFuncion.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this solicitud requerimiento funcion.
	*
	* @return the usuariomodifica of this solicitud requerimiento funcion
	*/
	@Override
	public long getUsuariomodifica() {
		return _solicitudRequerimientoFuncion.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this solicitud requerimiento funcion.
	*
	* @param usuariomodifica the usuariomodifica of this solicitud requerimiento funcion
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_solicitudRequerimientoFuncion.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechamodifica of this solicitud requerimiento funcion.
	*
	* @return the fechamodifica of this solicitud requerimiento funcion
	*/
	@Override
	public java.util.Date getFechamodifica() {
		return _solicitudRequerimientoFuncion.getFechamodifica();
	}

	/**
	* Sets the fechamodifica of this solicitud requerimiento funcion.
	*
	* @param fechamodifica the fechamodifica of this solicitud requerimiento funcion
	*/
	@Override
	public void setFechamodifica(java.util.Date fechamodifica) {
		_solicitudRequerimientoFuncion.setFechamodifica(fechamodifica);
	}

	@Override
	public boolean isNew() {
		return _solicitudRequerimientoFuncion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_solicitudRequerimientoFuncion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _solicitudRequerimientoFuncion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_solicitudRequerimientoFuncion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _solicitudRequerimientoFuncion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _solicitudRequerimientoFuncion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_solicitudRequerimientoFuncion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _solicitudRequerimientoFuncion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_solicitudRequerimientoFuncion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_solicitudRequerimientoFuncion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_solicitudRequerimientoFuncion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SolicitudRequerimientoFuncionWrapper((SolicitudRequerimientoFuncion)_solicitudRequerimientoFuncion.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.SolicitudRequerimientoFuncion solicitudRequerimientoFuncion) {
		return _solicitudRequerimientoFuncion.compareTo(solicitudRequerimientoFuncion);
	}

	@Override
	public int hashCode() {
		return _solicitudRequerimientoFuncion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.SolicitudRequerimientoFuncion> toCacheModel() {
		return _solicitudRequerimientoFuncion.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.SolicitudRequerimientoFuncion toEscapedModel() {
		return new SolicitudRequerimientoFuncionWrapper(_solicitudRequerimientoFuncion.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.SolicitudRequerimientoFuncion toUnescapedModel() {
		return new SolicitudRequerimientoFuncionWrapper(_solicitudRequerimientoFuncion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _solicitudRequerimientoFuncion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _solicitudRequerimientoFuncion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_solicitudRequerimientoFuncion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SolicitudRequerimientoFuncionWrapper)) {
			return false;
		}

		SolicitudRequerimientoFuncionWrapper solicitudRequerimientoFuncionWrapper =
			(SolicitudRequerimientoFuncionWrapper)obj;

		if (Validator.equals(_solicitudRequerimientoFuncion,
					solicitudRequerimientoFuncionWrapper._solicitudRequerimientoFuncion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SolicitudRequerimientoFuncion getWrappedSolicitudRequerimientoFuncion() {
		return _solicitudRequerimientoFuncion;
	}

	@Override
	public SolicitudRequerimientoFuncion getWrappedModel() {
		return _solicitudRequerimientoFuncion;
	}

	@Override
	public void resetOriginalValues() {
		_solicitudRequerimientoFuncion.resetOriginalValues();
	}

	private SolicitudRequerimientoFuncion _solicitudRequerimientoFuncion;
}
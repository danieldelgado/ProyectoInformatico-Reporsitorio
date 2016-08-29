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
 * This class is a wrapper for {@link UsuarioFuncion}.
 * </p>
 *
 * @author Danielle Delgado
 * @see UsuarioFuncion
 * @generated
 */
public class UsuarioFuncionWrapper implements UsuarioFuncion,
	ModelWrapper<UsuarioFuncion> {
	public UsuarioFuncionWrapper(UsuarioFuncion usuarioFuncion) {
		_usuarioFuncion = usuarioFuncion;
	}

	@Override
	public Class<?> getModelClass() {
		return UsuarioFuncion.class;
	}

	@Override
	public String getModelClassName() {
		return UsuarioFuncion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
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
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
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
	* Returns the primary key of this usuario funcion.
	*
	* @return the primary key of this usuario funcion
	*/
	@Override
	public com.hitss.layer.service.persistence.UsuarioFuncionPK getPrimaryKey() {
		return _usuarioFuncion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this usuario funcion.
	*
	* @param primaryKey the primary key of this usuario funcion
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.UsuarioFuncionPK primaryKey) {
		_usuarioFuncion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user ID of this usuario funcion.
	*
	* @return the user ID of this usuario funcion
	*/
	@Override
	public long getUserId() {
		return _usuarioFuncion.getUserId();
	}

	/**
	* Sets the user ID of this usuario funcion.
	*
	* @param userId the user ID of this usuario funcion
	*/
	@Override
	public void setUserId(long userId) {
		_usuarioFuncion.setUserId(userId);
	}

	/**
	* Returns the user uuid of this usuario funcion.
	*
	* @return the user uuid of this usuario funcion
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioFuncion.getUserUuid();
	}

	/**
	* Sets the user uuid of this usuario funcion.
	*
	* @param userUuid the user uuid of this usuario funcion
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_usuarioFuncion.setUserUuid(userUuid);
	}

	/**
	* Returns the funcion ID of this usuario funcion.
	*
	* @return the funcion ID of this usuario funcion
	*/
	@Override
	public long getFuncionId() {
		return _usuarioFuncion.getFuncionId();
	}

	/**
	* Sets the funcion ID of this usuario funcion.
	*
	* @param funcionId the funcion ID of this usuario funcion
	*/
	@Override
	public void setFuncionId(long funcionId) {
		_usuarioFuncion.setFuncionId(funcionId);
	}

	/**
	* Returns the exigible of this usuario funcion.
	*
	* @return the exigible of this usuario funcion
	*/
	@Override
	public boolean getExigible() {
		return _usuarioFuncion.getExigible();
	}

	/**
	* Returns <code>true</code> if this usuario funcion is exigible.
	*
	* @return <code>true</code> if this usuario funcion is exigible; <code>false</code> otherwise
	*/
	@Override
	public boolean isExigible() {
		return _usuarioFuncion.isExigible();
	}

	/**
	* Sets whether this usuario funcion is exigible.
	*
	* @param exigible the exigible of this usuario funcion
	*/
	@Override
	public void setExigible(boolean exigible) {
		_usuarioFuncion.setExigible(exigible);
	}

	/**
	* Returns the activo of this usuario funcion.
	*
	* @return the activo of this usuario funcion
	*/
	@Override
	public boolean getActivo() {
		return _usuarioFuncion.getActivo();
	}

	/**
	* Returns <code>true</code> if this usuario funcion is activo.
	*
	* @return <code>true</code> if this usuario funcion is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _usuarioFuncion.isActivo();
	}

	/**
	* Sets whether this usuario funcion is activo.
	*
	* @param activo the activo of this usuario funcion
	*/
	@Override
	public void setActivo(boolean activo) {
		_usuarioFuncion.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this usuario funcion.
	*
	* @return the usuariocrea of this usuario funcion
	*/
	@Override
	public long getUsuariocrea() {
		return _usuarioFuncion.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this usuario funcion.
	*
	* @param usuariocrea the usuariocrea of this usuario funcion
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_usuarioFuncion.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this usuario funcion.
	*
	* @return the fechacrea of this usuario funcion
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _usuarioFuncion.getFechacrea();
	}

	/**
	* Sets the fechacrea of this usuario funcion.
	*
	* @param fechacrea the fechacrea of this usuario funcion
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_usuarioFuncion.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this usuario funcion.
	*
	* @return the usuariomodifica of this usuario funcion
	*/
	@Override
	public long getUsuariomodifica() {
		return _usuarioFuncion.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this usuario funcion.
	*
	* @param usuariomodifica the usuariomodifica of this usuario funcion
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_usuarioFuncion.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechamodifica of this usuario funcion.
	*
	* @return the fechamodifica of this usuario funcion
	*/
	@Override
	public java.util.Date getFechamodifica() {
		return _usuarioFuncion.getFechamodifica();
	}

	/**
	* Sets the fechamodifica of this usuario funcion.
	*
	* @param fechamodifica the fechamodifica of this usuario funcion
	*/
	@Override
	public void setFechamodifica(java.util.Date fechamodifica) {
		_usuarioFuncion.setFechamodifica(fechamodifica);
	}

	@Override
	public boolean isNew() {
		return _usuarioFuncion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_usuarioFuncion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _usuarioFuncion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_usuarioFuncion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _usuarioFuncion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _usuarioFuncion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_usuarioFuncion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _usuarioFuncion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_usuarioFuncion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_usuarioFuncion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_usuarioFuncion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UsuarioFuncionWrapper((UsuarioFuncion)_usuarioFuncion.clone());
	}

	@Override
	public int compareTo(com.hitss.layer.model.UsuarioFuncion usuarioFuncion) {
		return _usuarioFuncion.compareTo(usuarioFuncion);
	}

	@Override
	public int hashCode() {
		return _usuarioFuncion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.UsuarioFuncion> toCacheModel() {
		return _usuarioFuncion.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.UsuarioFuncion toEscapedModel() {
		return new UsuarioFuncionWrapper(_usuarioFuncion.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.UsuarioFuncion toUnescapedModel() {
		return new UsuarioFuncionWrapper(_usuarioFuncion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _usuarioFuncion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _usuarioFuncion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_usuarioFuncion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UsuarioFuncionWrapper)) {
			return false;
		}

		UsuarioFuncionWrapper usuarioFuncionWrapper = (UsuarioFuncionWrapper)obj;

		if (Validator.equals(_usuarioFuncion,
					usuarioFuncionWrapper._usuarioFuncion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UsuarioFuncion getWrappedUsuarioFuncion() {
		return _usuarioFuncion;
	}

	@Override
	public UsuarioFuncion getWrappedModel() {
		return _usuarioFuncion;
	}

	@Override
	public void resetOriginalValues() {
		_usuarioFuncion.resetOriginalValues();
	}

	private UsuarioFuncion _usuarioFuncion;
}
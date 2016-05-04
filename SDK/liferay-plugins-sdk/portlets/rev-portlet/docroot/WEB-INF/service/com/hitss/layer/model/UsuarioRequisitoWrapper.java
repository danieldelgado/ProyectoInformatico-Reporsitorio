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
 * This class is a wrapper for {@link UsuarioRequisito}.
 * </p>
 *
 * @author Danielle Delgado
 * @see UsuarioRequisito
 * @generated
 */
public class UsuarioRequisitoWrapper implements UsuarioRequisito,
	ModelWrapper<UsuarioRequisito> {
	public UsuarioRequisitoWrapper(UsuarioRequisito usuarioRequisito) {
		_usuarioRequisito = usuarioRequisito;
	}

	@Override
	public Class<?> getModelClass() {
		return UsuarioRequisito.class;
	}

	@Override
	public String getModelClassName() {
		return UsuarioRequisito.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
		attributes.put("requisitoId", getRequisitoId());
		attributes.put("cumplerequisito", getCumplerequisito());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long requisitoId = (Long)attributes.get("requisitoId");

		if (requisitoId != null) {
			setRequisitoId(requisitoId);
		}

		Boolean cumplerequisito = (Boolean)attributes.get("cumplerequisito");

		if (cumplerequisito != null) {
			setCumplerequisito(cumplerequisito);
		}
	}

	/**
	* Returns the primary key of this usuario requisito.
	*
	* @return the primary key of this usuario requisito
	*/
	@Override
	public com.hitss.layer.service.persistence.UsuarioRequisitoPK getPrimaryKey() {
		return _usuarioRequisito.getPrimaryKey();
	}

	/**
	* Sets the primary key of this usuario requisito.
	*
	* @param primaryKey the primary key of this usuario requisito
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.UsuarioRequisitoPK primaryKey) {
		_usuarioRequisito.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user ID of this usuario requisito.
	*
	* @return the user ID of this usuario requisito
	*/
	@Override
	public long getUserId() {
		return _usuarioRequisito.getUserId();
	}

	/**
	* Sets the user ID of this usuario requisito.
	*
	* @param userId the user ID of this usuario requisito
	*/
	@Override
	public void setUserId(long userId) {
		_usuarioRequisito.setUserId(userId);
	}

	/**
	* Returns the user uuid of this usuario requisito.
	*
	* @return the user uuid of this usuario requisito
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioRequisito.getUserUuid();
	}

	/**
	* Sets the user uuid of this usuario requisito.
	*
	* @param userUuid the user uuid of this usuario requisito
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_usuarioRequisito.setUserUuid(userUuid);
	}

	/**
	* Returns the requisito ID of this usuario requisito.
	*
	* @return the requisito ID of this usuario requisito
	*/
	@Override
	public long getRequisitoId() {
		return _usuarioRequisito.getRequisitoId();
	}

	/**
	* Sets the requisito ID of this usuario requisito.
	*
	* @param requisitoId the requisito ID of this usuario requisito
	*/
	@Override
	public void setRequisitoId(long requisitoId) {
		_usuarioRequisito.setRequisitoId(requisitoId);
	}

	/**
	* Returns the cumplerequisito of this usuario requisito.
	*
	* @return the cumplerequisito of this usuario requisito
	*/
	@Override
	public boolean getCumplerequisito() {
		return _usuarioRequisito.getCumplerequisito();
	}

	/**
	* Returns <code>true</code> if this usuario requisito is cumplerequisito.
	*
	* @return <code>true</code> if this usuario requisito is cumplerequisito; <code>false</code> otherwise
	*/
	@Override
	public boolean isCumplerequisito() {
		return _usuarioRequisito.isCumplerequisito();
	}

	/**
	* Sets whether this usuario requisito is cumplerequisito.
	*
	* @param cumplerequisito the cumplerequisito of this usuario requisito
	*/
	@Override
	public void setCumplerequisito(boolean cumplerequisito) {
		_usuarioRequisito.setCumplerequisito(cumplerequisito);
	}

	@Override
	public boolean isNew() {
		return _usuarioRequisito.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_usuarioRequisito.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _usuarioRequisito.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_usuarioRequisito.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _usuarioRequisito.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _usuarioRequisito.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_usuarioRequisito.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _usuarioRequisito.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_usuarioRequisito.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_usuarioRequisito.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_usuarioRequisito.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UsuarioRequisitoWrapper((UsuarioRequisito)_usuarioRequisito.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.UsuarioRequisito usuarioRequisito) {
		return _usuarioRequisito.compareTo(usuarioRequisito);
	}

	@Override
	public int hashCode() {
		return _usuarioRequisito.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.UsuarioRequisito> toCacheModel() {
		return _usuarioRequisito.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.UsuarioRequisito toEscapedModel() {
		return new UsuarioRequisitoWrapper(_usuarioRequisito.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.UsuarioRequisito toUnescapedModel() {
		return new UsuarioRequisitoWrapper(_usuarioRequisito.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _usuarioRequisito.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _usuarioRequisito.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_usuarioRequisito.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UsuarioRequisitoWrapper)) {
			return false;
		}

		UsuarioRequisitoWrapper usuarioRequisitoWrapper = (UsuarioRequisitoWrapper)obj;

		if (Validator.equals(_usuarioRequisito,
					usuarioRequisitoWrapper._usuarioRequisito)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UsuarioRequisito getWrappedUsuarioRequisito() {
		return _usuarioRequisito;
	}

	@Override
	public UsuarioRequisito getWrappedModel() {
		return _usuarioRequisito;
	}

	@Override
	public void resetOriginalValues() {
		_usuarioRequisito.resetOriginalValues();
	}

	private UsuarioRequisito _usuarioRequisito;
}
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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UsuarioHitss}.
 * </p>
 *
 * @author Crossfire
 * @see UsuarioHitss
 * @generated
 */
public class UsuarioHitssWrapper implements UsuarioHitss,
	ModelWrapper<UsuarioHitss> {
	public UsuarioHitssWrapper(UsuarioHitss usuarioHitss) {
		_usuarioHitss = usuarioHitss;
	}

	@Override
	public Class<?> getModelClass() {
		return UsuarioHitss.class;
	}

	@Override
	public String getModelClassName() {
		return UsuarioHitss.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("usuarioHitssId", getUsuarioHitssId());
		attributes.put("userId", getUserId());
		attributes.put("userUuId", getUserUuId());
		attributes.put("actividadPlanId", getActividadPlanId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long usuarioHitssId = (Long)attributes.get("usuarioHitssId");

		if (usuarioHitssId != null) {
			setUsuarioHitssId(usuarioHitssId);
		}

		String userId = (String)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userUuId = (String)attributes.get("userUuId");

		if (userUuId != null) {
			setUserUuId(userUuId);
		}

		Long actividadPlanId = (Long)attributes.get("actividadPlanId");

		if (actividadPlanId != null) {
			setActividadPlanId(actividadPlanId);
		}
	}

	/**
	* Returns the primary key of this usuario hitss.
	*
	* @return the primary key of this usuario hitss
	*/
	@Override
	public long getPrimaryKey() {
		return _usuarioHitss.getPrimaryKey();
	}

	/**
	* Sets the primary key of this usuario hitss.
	*
	* @param primaryKey the primary key of this usuario hitss
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_usuarioHitss.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the usuario hitss ID of this usuario hitss.
	*
	* @return the usuario hitss ID of this usuario hitss
	*/
	@Override
	public long getUsuarioHitssId() {
		return _usuarioHitss.getUsuarioHitssId();
	}

	/**
	* Sets the usuario hitss ID of this usuario hitss.
	*
	* @param usuarioHitssId the usuario hitss ID of this usuario hitss
	*/
	@Override
	public void setUsuarioHitssId(long usuarioHitssId) {
		_usuarioHitss.setUsuarioHitssId(usuarioHitssId);
	}

	/**
	* Returns the user ID of this usuario hitss.
	*
	* @return the user ID of this usuario hitss
	*/
	@Override
	public java.lang.String getUserId() {
		return _usuarioHitss.getUserId();
	}

	/**
	* Sets the user ID of this usuario hitss.
	*
	* @param userId the user ID of this usuario hitss
	*/
	@Override
	public void setUserId(java.lang.String userId) {
		_usuarioHitss.setUserId(userId);
	}

	/**
	* Returns the user uu ID of this usuario hitss.
	*
	* @return the user uu ID of this usuario hitss
	*/
	@Override
	public java.lang.String getUserUuId() {
		return _usuarioHitss.getUserUuId();
	}

	/**
	* Sets the user uu ID of this usuario hitss.
	*
	* @param userUuId the user uu ID of this usuario hitss
	*/
	@Override
	public void setUserUuId(java.lang.String userUuId) {
		_usuarioHitss.setUserUuId(userUuId);
	}

	/**
	* Returns the actividad plan ID of this usuario hitss.
	*
	* @return the actividad plan ID of this usuario hitss
	*/
	@Override
	public long getActividadPlanId() {
		return _usuarioHitss.getActividadPlanId();
	}

	/**
	* Sets the actividad plan ID of this usuario hitss.
	*
	* @param actividadPlanId the actividad plan ID of this usuario hitss
	*/
	@Override
	public void setActividadPlanId(long actividadPlanId) {
		_usuarioHitss.setActividadPlanId(actividadPlanId);
	}

	@Override
	public boolean isNew() {
		return _usuarioHitss.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_usuarioHitss.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _usuarioHitss.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_usuarioHitss.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _usuarioHitss.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _usuarioHitss.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_usuarioHitss.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _usuarioHitss.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_usuarioHitss.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_usuarioHitss.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_usuarioHitss.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UsuarioHitssWrapper((UsuarioHitss)_usuarioHitss.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.UsuarioHitss usuarioHitss) {
		return _usuarioHitss.compareTo(usuarioHitss);
	}

	@Override
	public int hashCode() {
		return _usuarioHitss.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.UsuarioHitss> toCacheModel() {
		return _usuarioHitss.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.UsuarioHitss toEscapedModel() {
		return new UsuarioHitssWrapper(_usuarioHitss.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.UsuarioHitss toUnescapedModel() {
		return new UsuarioHitssWrapper(_usuarioHitss.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _usuarioHitss.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _usuarioHitss.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_usuarioHitss.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UsuarioHitssWrapper)) {
			return false;
		}

		UsuarioHitssWrapper usuarioHitssWrapper = (UsuarioHitssWrapper)obj;

		if (Validator.equals(_usuarioHitss, usuarioHitssWrapper._usuarioHitss)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UsuarioHitss getWrappedUsuarioHitss() {
		return _usuarioHitss;
	}

	@Override
	public UsuarioHitss getWrappedModel() {
		return _usuarioHitss;
	}

	@Override
	public void resetOriginalValues() {
		_usuarioHitss.resetOriginalValues();
	}

	private UsuarioHitss _usuarioHitss;
}
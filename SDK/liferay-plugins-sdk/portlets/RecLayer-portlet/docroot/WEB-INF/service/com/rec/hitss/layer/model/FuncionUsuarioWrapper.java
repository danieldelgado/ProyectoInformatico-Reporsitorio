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
 * This class is a wrapper for {@link FuncionUsuario}.
 * </p>
 *
 * @author Crossfire
 * @see FuncionUsuario
 * @generated
 */
public class FuncionUsuarioWrapper implements FuncionUsuario,
	ModelWrapper<FuncionUsuario> {
	public FuncionUsuarioWrapper(FuncionUsuario funcionUsuario) {
		_funcionUsuario = funcionUsuario;
	}

	@Override
	public Class<?> getModelClass() {
		return FuncionUsuario.class;
	}

	@Override
	public String getModelClassName() {
		return FuncionUsuario.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("funcionId", getFuncionId());
		attributes.put("usuarioHitssId", getUsuarioHitssId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long funcionId = (Long)attributes.get("funcionId");

		if (funcionId != null) {
			setFuncionId(funcionId);
		}

		Long usuarioHitssId = (Long)attributes.get("usuarioHitssId");

		if (usuarioHitssId != null) {
			setUsuarioHitssId(usuarioHitssId);
		}
	}

	/**
	* Returns the primary key of this funcion usuario.
	*
	* @return the primary key of this funcion usuario
	*/
	@Override
	public long getPrimaryKey() {
		return _funcionUsuario.getPrimaryKey();
	}

	/**
	* Sets the primary key of this funcion usuario.
	*
	* @param primaryKey the primary key of this funcion usuario
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_funcionUsuario.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the funcion ID of this funcion usuario.
	*
	* @return the funcion ID of this funcion usuario
	*/
	@Override
	public long getFuncionId() {
		return _funcionUsuario.getFuncionId();
	}

	/**
	* Sets the funcion ID of this funcion usuario.
	*
	* @param funcionId the funcion ID of this funcion usuario
	*/
	@Override
	public void setFuncionId(long funcionId) {
		_funcionUsuario.setFuncionId(funcionId);
	}

	/**
	* Returns the usuario hitss ID of this funcion usuario.
	*
	* @return the usuario hitss ID of this funcion usuario
	*/
	@Override
	public long getUsuarioHitssId() {
		return _funcionUsuario.getUsuarioHitssId();
	}

	/**
	* Sets the usuario hitss ID of this funcion usuario.
	*
	* @param usuarioHitssId the usuario hitss ID of this funcion usuario
	*/
	@Override
	public void setUsuarioHitssId(long usuarioHitssId) {
		_funcionUsuario.setUsuarioHitssId(usuarioHitssId);
	}

	@Override
	public boolean isNew() {
		return _funcionUsuario.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_funcionUsuario.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _funcionUsuario.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_funcionUsuario.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _funcionUsuario.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _funcionUsuario.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_funcionUsuario.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _funcionUsuario.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_funcionUsuario.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_funcionUsuario.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_funcionUsuario.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FuncionUsuarioWrapper((FuncionUsuario)_funcionUsuario.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.FuncionUsuario funcionUsuario) {
		return _funcionUsuario.compareTo(funcionUsuario);
	}

	@Override
	public int hashCode() {
		return _funcionUsuario.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.FuncionUsuario> toCacheModel() {
		return _funcionUsuario.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.FuncionUsuario toEscapedModel() {
		return new FuncionUsuarioWrapper(_funcionUsuario.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.FuncionUsuario toUnescapedModel() {
		return new FuncionUsuarioWrapper(_funcionUsuario.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _funcionUsuario.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _funcionUsuario.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_funcionUsuario.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FuncionUsuarioWrapper)) {
			return false;
		}

		FuncionUsuarioWrapper funcionUsuarioWrapper = (FuncionUsuarioWrapper)obj;

		if (Validator.equals(_funcionUsuario,
					funcionUsuarioWrapper._funcionUsuario)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public FuncionUsuario getWrappedFuncionUsuario() {
		return _funcionUsuario;
	}

	@Override
	public FuncionUsuario getWrappedModel() {
		return _funcionUsuario;
	}

	@Override
	public void resetOriginalValues() {
		_funcionUsuario.resetOriginalValues();
	}

	private FuncionUsuario _funcionUsuario;
}
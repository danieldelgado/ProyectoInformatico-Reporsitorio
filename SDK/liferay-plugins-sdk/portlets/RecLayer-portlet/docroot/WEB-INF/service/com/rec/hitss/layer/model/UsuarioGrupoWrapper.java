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
 * This class is a wrapper for {@link UsuarioGrupo}.
 * </p>
 *
 * @author Crossfire
 * @see UsuarioGrupo
 * @generated
 */
public class UsuarioGrupoWrapper implements UsuarioGrupo,
	ModelWrapper<UsuarioGrupo> {
	public UsuarioGrupoWrapper(UsuarioGrupo usuarioGrupo) {
		_usuarioGrupo = usuarioGrupo;
	}

	@Override
	public Class<?> getModelClass() {
		return UsuarioGrupo.class;
	}

	@Override
	public String getModelClassName() {
		return UsuarioGrupo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userGroupId", getUserGroupId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("prioridadEquiposId", getPrioridadEquiposId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userGroupId = (Long)attributes.get("userGroupId");

		if (userGroupId != null) {
			setUserGroupId(userGroupId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long prioridadEquiposId = (Long)attributes.get("prioridadEquiposId");

		if (prioridadEquiposId != null) {
			setPrioridadEquiposId(prioridadEquiposId);
		}
	}

	/**
	* Returns the primary key of this usuario grupo.
	*
	* @return the primary key of this usuario grupo
	*/
	@Override
	public long getPrimaryKey() {
		return _usuarioGrupo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this usuario grupo.
	*
	* @param primaryKey the primary key of this usuario grupo
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_usuarioGrupo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user group ID of this usuario grupo.
	*
	* @return the user group ID of this usuario grupo
	*/
	@Override
	public long getUserGroupId() {
		return _usuarioGrupo.getUserGroupId();
	}

	/**
	* Sets the user group ID of this usuario grupo.
	*
	* @param userGroupId the user group ID of this usuario grupo
	*/
	@Override
	public void setUserGroupId(long userGroupId) {
		_usuarioGrupo.setUserGroupId(userGroupId);
	}

	/**
	* Returns the group ID of this usuario grupo.
	*
	* @return the group ID of this usuario grupo
	*/
	@Override
	public long getGroupId() {
		return _usuarioGrupo.getGroupId();
	}

	/**
	* Sets the group ID of this usuario grupo.
	*
	* @param groupId the group ID of this usuario grupo
	*/
	@Override
	public void setGroupId(long groupId) {
		_usuarioGrupo.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this usuario grupo.
	*
	* @return the company ID of this usuario grupo
	*/
	@Override
	public long getCompanyId() {
		return _usuarioGrupo.getCompanyId();
	}

	/**
	* Sets the company ID of this usuario grupo.
	*
	* @param companyId the company ID of this usuario grupo
	*/
	@Override
	public void setCompanyId(long companyId) {
		_usuarioGrupo.setCompanyId(companyId);
	}

	/**
	* Returns the prioridad equipos ID of this usuario grupo.
	*
	* @return the prioridad equipos ID of this usuario grupo
	*/
	@Override
	public long getPrioridadEquiposId() {
		return _usuarioGrupo.getPrioridadEquiposId();
	}

	/**
	* Sets the prioridad equipos ID of this usuario grupo.
	*
	* @param prioridadEquiposId the prioridad equipos ID of this usuario grupo
	*/
	@Override
	public void setPrioridadEquiposId(long prioridadEquiposId) {
		_usuarioGrupo.setPrioridadEquiposId(prioridadEquiposId);
	}

	@Override
	public boolean isNew() {
		return _usuarioGrupo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_usuarioGrupo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _usuarioGrupo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_usuarioGrupo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _usuarioGrupo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _usuarioGrupo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_usuarioGrupo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _usuarioGrupo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_usuarioGrupo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_usuarioGrupo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_usuarioGrupo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UsuarioGrupoWrapper((UsuarioGrupo)_usuarioGrupo.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.UsuarioGrupo usuarioGrupo) {
		return _usuarioGrupo.compareTo(usuarioGrupo);
	}

	@Override
	public int hashCode() {
		return _usuarioGrupo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.UsuarioGrupo> toCacheModel() {
		return _usuarioGrupo.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.UsuarioGrupo toEscapedModel() {
		return new UsuarioGrupoWrapper(_usuarioGrupo.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.UsuarioGrupo toUnescapedModel() {
		return new UsuarioGrupoWrapper(_usuarioGrupo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _usuarioGrupo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _usuarioGrupo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_usuarioGrupo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UsuarioGrupoWrapper)) {
			return false;
		}

		UsuarioGrupoWrapper usuarioGrupoWrapper = (UsuarioGrupoWrapper)obj;

		if (Validator.equals(_usuarioGrupo, usuarioGrupoWrapper._usuarioGrupo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UsuarioGrupo getWrappedUsuarioGrupo() {
		return _usuarioGrupo;
	}

	@Override
	public UsuarioGrupo getWrappedModel() {
		return _usuarioGrupo;
	}

	@Override
	public void resetOriginalValues() {
		_usuarioGrupo.resetOriginalValues();
	}

	private UsuarioGrupo _usuarioGrupo;
}
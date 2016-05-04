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

import com.hitss.layer.service.persistence.UsuarioRequisitoPK;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the UsuarioRequisito service. Represents a row in the &quot;UsuarioRequisito&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hitss.layer.model.impl.UsuarioRequisitoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hitss.layer.model.impl.UsuarioRequisitoImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see UsuarioRequisito
 * @see com.hitss.layer.model.impl.UsuarioRequisitoImpl
 * @see com.hitss.layer.model.impl.UsuarioRequisitoModelImpl
 * @generated
 */
public interface UsuarioRequisitoModel extends BaseModel<UsuarioRequisito> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a usuario requisito model instance should use the {@link UsuarioRequisito} interface instead.
	 */

	/**
	 * Returns the primary key of this usuario requisito.
	 *
	 * @return the primary key of this usuario requisito
	 */
	public UsuarioRequisitoPK getPrimaryKey();

	/**
	 * Sets the primary key of this usuario requisito.
	 *
	 * @param primaryKey the primary key of this usuario requisito
	 */
	public void setPrimaryKey(UsuarioRequisitoPK primaryKey);

	/**
	 * Returns the user ID of this usuario requisito.
	 *
	 * @return the user ID of this usuario requisito
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this usuario requisito.
	 *
	 * @param userId the user ID of this usuario requisito
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this usuario requisito.
	 *
	 * @return the user uuid of this usuario requisito
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this usuario requisito.
	 *
	 * @param userUuid the user uuid of this usuario requisito
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the requisito ID of this usuario requisito.
	 *
	 * @return the requisito ID of this usuario requisito
	 */
	public long getRequisitoId();

	/**
	 * Sets the requisito ID of this usuario requisito.
	 *
	 * @param requisitoId the requisito ID of this usuario requisito
	 */
	public void setRequisitoId(long requisitoId);

	/**
	 * Returns the cumplerequisito of this usuario requisito.
	 *
	 * @return the cumplerequisito of this usuario requisito
	 */
	public boolean getCumplerequisito();

	/**
	 * Returns <code>true</code> if this usuario requisito is cumplerequisito.
	 *
	 * @return <code>true</code> if this usuario requisito is cumplerequisito; <code>false</code> otherwise
	 */
	public boolean isCumplerequisito();

	/**
	 * Sets whether this usuario requisito is cumplerequisito.
	 *
	 * @param cumplerequisito the cumplerequisito of this usuario requisito
	 */
	public void setCumplerequisito(boolean cumplerequisito);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.hitss.layer.model.UsuarioRequisito usuarioRequisito);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.hitss.layer.model.UsuarioRequisito> toCacheModel();

	@Override
	public com.hitss.layer.model.UsuarioRequisito toEscapedModel();

	@Override
	public com.hitss.layer.model.UsuarioRequisito toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
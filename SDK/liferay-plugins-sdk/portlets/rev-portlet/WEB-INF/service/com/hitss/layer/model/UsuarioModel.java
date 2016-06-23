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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Usuario service. Represents a row in the &quot;Usuario&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hitss.layer.model.impl.UsuarioModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hitss.layer.model.impl.UsuarioImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see Usuario
 * @see com.hitss.layer.model.impl.UsuarioImpl
 * @see com.hitss.layer.model.impl.UsuarioModelImpl
 * @generated
 */
public interface UsuarioModel extends BaseModel<Usuario> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a usuario model instance should use the {@link Usuario} interface instead.
	 */

	/**
	 * Returns the primary key of this usuario.
	 *
	 * @return the primary key of this usuario
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this usuario.
	 *
	 * @param primaryKey the primary key of this usuario
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the user ID of this usuario.
	 *
	 * @return the user ID of this usuario
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this usuario.
	 *
	 * @param userId the user ID of this usuario
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this usuario.
	 *
	 * @return the user uuid of this usuario
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this usuario.
	 *
	 * @param userUuid the user uuid of this usuario
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the activo of this usuario.
	 *
	 * @return the activo of this usuario
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this usuario is activo.
	 *
	 * @return <code>true</code> if this usuario is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this usuario is activo.
	 *
	 * @param activo the activo of this usuario
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this usuario.
	 *
	 * @return the usuariocrea of this usuario
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this usuario.
	 *
	 * @param usuariocrea the usuariocrea of this usuario
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this usuario.
	 *
	 * @return the fechacrea of this usuario
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this usuario.
	 *
	 * @param fechacrea the fechacrea of this usuario
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this usuario.
	 *
	 * @return the usuariomodifica of this usuario
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this usuario.
	 *
	 * @param usuariomodifica the usuariomodifica of this usuario
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechacreamodifica of this usuario.
	 *
	 * @return the fechacreamodifica of this usuario
	 */
	public Date getFechacreamodifica();

	/**
	 * Sets the fechacreamodifica of this usuario.
	 *
	 * @param fechacreamodifica the fechacreamodifica of this usuario
	 */
	public void setFechacreamodifica(Date fechacreamodifica);

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
	public int compareTo(com.hitss.layer.model.Usuario usuario);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.hitss.layer.model.Usuario> toCacheModel();

	@Override
	public com.hitss.layer.model.Usuario toEscapedModel();

	@Override
	public com.hitss.layer.model.Usuario toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
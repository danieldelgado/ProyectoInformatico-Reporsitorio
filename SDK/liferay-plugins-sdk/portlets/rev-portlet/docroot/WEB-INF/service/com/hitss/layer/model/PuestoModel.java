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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Puesto service. Represents a row in the &quot;Puesto&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hitss.layer.model.impl.PuestoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hitss.layer.model.impl.PuestoImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see Puesto
 * @see com.hitss.layer.model.impl.PuestoImpl
 * @see com.hitss.layer.model.impl.PuestoModelImpl
 * @generated
 */
public interface PuestoModel extends BaseModel<Puesto> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a puesto model instance should use the {@link Puesto} interface instead.
	 */

	/**
	 * Returns the primary key of this puesto.
	 *
	 * @return the primary key of this puesto
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this puesto.
	 *
	 * @param primaryKey the primary key of this puesto
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the puesto ID of this puesto.
	 *
	 * @return the puesto ID of this puesto
	 */
	public long getPuestoId();

	/**
	 * Sets the puesto ID of this puesto.
	 *
	 * @param puestoId the puesto ID of this puesto
	 */
	public void setPuestoId(long puestoId);

	/**
	 * Returns the descripcion of this puesto.
	 *
	 * @return the descripcion of this puesto
	 */
	@AutoEscape
	public String getDescripcion();

	/**
	 * Sets the descripcion of this puesto.
	 *
	 * @param descripcion the descripcion of this puesto
	 */
	public void setDescripcion(String descripcion);

	/**
	 * Returns the categoria of this puesto.
	 *
	 * @return the categoria of this puesto
	 */
	public long getCategoria();

	/**
	 * Sets the categoria of this puesto.
	 *
	 * @param categoria the categoria of this puesto
	 */
	public void setCategoria(long categoria);

	/**
	 * Returns the activo of this puesto.
	 *
	 * @return the activo of this puesto
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this puesto is activo.
	 *
	 * @return <code>true</code> if this puesto is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this puesto is activo.
	 *
	 * @param activo the activo of this puesto
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this puesto.
	 *
	 * @return the usuariocrea of this puesto
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this puesto.
	 *
	 * @param usuariocrea the usuariocrea of this puesto
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this puesto.
	 *
	 * @return the fechacrea of this puesto
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this puesto.
	 *
	 * @param fechacrea the fechacrea of this puesto
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this puesto.
	 *
	 * @return the usuariomodifica of this puesto
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this puesto.
	 *
	 * @param usuariomodifica the usuariomodifica of this puesto
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechacreamodifica of this puesto.
	 *
	 * @return the fechacreamodifica of this puesto
	 */
	public Date getFechacreamodifica();

	/**
	 * Sets the fechacreamodifica of this puesto.
	 *
	 * @param fechacreamodifica the fechacreamodifica of this puesto
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
	public int compareTo(com.hitss.layer.model.Puesto puesto);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.hitss.layer.model.Puesto> toCacheModel();

	@Override
	public com.hitss.layer.model.Puesto toEscapedModel();

	@Override
	public com.hitss.layer.model.Puesto toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
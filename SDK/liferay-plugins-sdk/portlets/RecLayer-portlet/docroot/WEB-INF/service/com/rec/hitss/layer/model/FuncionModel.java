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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Funcion service. Represents a row in the &quot;Funcion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rec.hitss.layer.model.impl.FuncionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rec.hitss.layer.model.impl.FuncionImpl}.
 * </p>
 *
 * @author Crossfire
 * @see Funcion
 * @see com.rec.hitss.layer.model.impl.FuncionImpl
 * @see com.rec.hitss.layer.model.impl.FuncionModelImpl
 * @generated
 */
public interface FuncionModel extends BaseModel<Funcion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a funcion model instance should use the {@link Funcion} interface instead.
	 */

	/**
	 * Returns the primary key of this funcion.
	 *
	 * @return the primary key of this funcion
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this funcion.
	 *
	 * @param primaryKey the primary key of this funcion
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the funcion ID of this funcion.
	 *
	 * @return the funcion ID of this funcion
	 */
	public long getFuncionId();

	/**
	 * Sets the funcion ID of this funcion.
	 *
	 * @param funcionId the funcion ID of this funcion
	 */
	public void setFuncionId(long funcionId);

	/**
	 * Returns the descripcion of this funcion.
	 *
	 * @return the descripcion of this funcion
	 */
	@AutoEscape
	public String getDescripcion();

	/**
	 * Sets the descripcion of this funcion.
	 *
	 * @param descripcion the descripcion of this funcion
	 */
	public void setDescripcion(String descripcion);

	/**
	 * Returns the exigible of this funcion.
	 *
	 * @return the exigible of this funcion
	 */
	public boolean getExigible();

	/**
	 * Returns <code>true</code> if this funcion is exigible.
	 *
	 * @return <code>true</code> if this funcion is exigible; <code>false</code> otherwise
	 */
	public boolean isExigible();

	/**
	 * Sets whether this funcion is exigible.
	 *
	 * @param exigible the exigible of this funcion
	 */
	public void setExigible(boolean exigible);

	/**
	 * Returns the etiqueta ID of this funcion.
	 *
	 * @return the etiqueta ID of this funcion
	 */
	public long getEtiquetaId();

	/**
	 * Sets the etiqueta ID of this funcion.
	 *
	 * @param etiquetaId the etiqueta ID of this funcion
	 */
	public void setEtiquetaId(long etiquetaId);

	/**
	 * Returns the activo of this funcion.
	 *
	 * @return the activo of this funcion
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this funcion is activo.
	 *
	 * @return <code>true</code> if this funcion is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this funcion is activo.
	 *
	 * @param activo the activo of this funcion
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this funcion.
	 *
	 * @return the usuariocrea of this funcion
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this funcion.
	 *
	 * @param usuariocrea the usuariocrea of this funcion
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this funcion.
	 *
	 * @return the fechacrea of this funcion
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this funcion.
	 *
	 * @param fechacrea the fechacrea of this funcion
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this funcion.
	 *
	 * @return the usuariomodifica of this funcion
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this funcion.
	 *
	 * @param usuariomodifica the usuariomodifica of this funcion
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechacreamodifica of this funcion.
	 *
	 * @return the fechacreamodifica of this funcion
	 */
	public Date getFechacreamodifica();

	/**
	 * Sets the fechacreamodifica of this funcion.
	 *
	 * @param fechacreamodifica the fechacreamodifica of this funcion
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
	public int compareTo(com.rec.hitss.layer.model.Funcion funcion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rec.hitss.layer.model.Funcion> toCacheModel();

	@Override
	public com.rec.hitss.layer.model.Funcion toEscapedModel();

	@Override
	public com.rec.hitss.layer.model.Funcion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
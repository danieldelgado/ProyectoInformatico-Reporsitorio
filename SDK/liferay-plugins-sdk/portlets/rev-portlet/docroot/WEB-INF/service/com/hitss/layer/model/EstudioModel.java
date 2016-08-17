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
 * The base model interface for the Estudio service. Represents a row in the &quot;Estudio&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hitss.layer.model.impl.EstudioModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hitss.layer.model.impl.EstudioImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see Estudio
 * @see com.hitss.layer.model.impl.EstudioImpl
 * @see com.hitss.layer.model.impl.EstudioModelImpl
 * @generated
 */
public interface EstudioModel extends BaseModel<Estudio> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a estudio model instance should use the {@link Estudio} interface instead.
	 */

	/**
	 * Returns the primary key of this estudio.
	 *
	 * @return the primary key of this estudio
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this estudio.
	 *
	 * @param primaryKey the primary key of this estudio
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the estudio ID of this estudio.
	 *
	 * @return the estudio ID of this estudio
	 */
	public long getEstudioId();

	/**
	 * Sets the estudio ID of this estudio.
	 *
	 * @param estudioId the estudio ID of this estudio
	 */
	public void setEstudioId(long estudioId);

	/**
	 * Returns the usuario ID of this estudio.
	 *
	 * @return the usuario ID of this estudio
	 */
	public long getUsuarioId();

	/**
	 * Sets the usuario ID of this estudio.
	 *
	 * @param usuarioId the usuario ID of this estudio
	 */
	public void setUsuarioId(long usuarioId);

	/**
	 * Returns the nombre of this estudio.
	 *
	 * @return the nombre of this estudio
	 */
	@AutoEscape
	public String getNombre();

	/**
	 * Sets the nombre of this estudio.
	 *
	 * @param nombre the nombre of this estudio
	 */
	public void setNombre(String nombre);

	/**
	 * Returns the nivel of this estudio.
	 *
	 * @return the nivel of this estudio
	 */
	public long getNivel();

	/**
	 * Sets the nivel of this estudio.
	 *
	 * @param nivel the nivel of this estudio
	 */
	public void setNivel(long nivel);

	/**
	 * Returns the activo of this estudio.
	 *
	 * @return the activo of this estudio
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this estudio is activo.
	 *
	 * @return <code>true</code> if this estudio is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this estudio is activo.
	 *
	 * @param activo the activo of this estudio
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this estudio.
	 *
	 * @return the usuariocrea of this estudio
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this estudio.
	 *
	 * @param usuariocrea the usuariocrea of this estudio
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this estudio.
	 *
	 * @return the fechacrea of this estudio
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this estudio.
	 *
	 * @param fechacrea the fechacrea of this estudio
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this estudio.
	 *
	 * @return the usuariomodifica of this estudio
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this estudio.
	 *
	 * @param usuariomodifica the usuariomodifica of this estudio
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechamodifica of this estudio.
	 *
	 * @return the fechamodifica of this estudio
	 */
	public Date getFechamodifica();

	/**
	 * Sets the fechamodifica of this estudio.
	 *
	 * @param fechamodifica the fechamodifica of this estudio
	 */
	public void setFechamodifica(Date fechamodifica);

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
	public int compareTo(com.hitss.layer.model.Estudio estudio);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.hitss.layer.model.Estudio> toCacheModel();

	@Override
	public com.hitss.layer.model.Estudio toEscapedModel();

	@Override
	public com.hitss.layer.model.Estudio toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
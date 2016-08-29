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

import com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the SolicitudRequerimientoFuncion service. Represents a row in the &quot;SolicitudRequerimientoFuncion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoFuncion
 * @see com.hitss.layer.model.impl.SolicitudRequerimientoFuncionImpl
 * @see com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl
 * @generated
 */
public interface SolicitudRequerimientoFuncionModel extends BaseModel<SolicitudRequerimientoFuncion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a solicitud requerimiento funcion model instance should use the {@link SolicitudRequerimientoFuncion} interface instead.
	 */

	/**
	 * Returns the primary key of this solicitud requerimiento funcion.
	 *
	 * @return the primary key of this solicitud requerimiento funcion
	 */
	public SolicitudRequerimientoFuncionPK getPrimaryKey();

	/**
	 * Sets the primary key of this solicitud requerimiento funcion.
	 *
	 * @param primaryKey the primary key of this solicitud requerimiento funcion
	 */
	public void setPrimaryKey(SolicitudRequerimientoFuncionPK primaryKey);

	/**
	 * Returns the solicitud funcion ID of this solicitud requerimiento funcion.
	 *
	 * @return the solicitud funcion ID of this solicitud requerimiento funcion
	 */
	public long getSolicitudFuncionId();

	/**
	 * Sets the solicitud funcion ID of this solicitud requerimiento funcion.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID of this solicitud requerimiento funcion
	 */
	public void setSolicitudFuncionId(long solicitudFuncionId);

	/**
	 * Returns the funcion ID of this solicitud requerimiento funcion.
	 *
	 * @return the funcion ID of this solicitud requerimiento funcion
	 */
	public long getFuncionId();

	/**
	 * Sets the funcion ID of this solicitud requerimiento funcion.
	 *
	 * @param funcionId the funcion ID of this solicitud requerimiento funcion
	 */
	public void setFuncionId(long funcionId);

	/**
	 * Returns the exigible of this solicitud requerimiento funcion.
	 *
	 * @return the exigible of this solicitud requerimiento funcion
	 */
	public boolean getExigible();

	/**
	 * Returns <code>true</code> if this solicitud requerimiento funcion is exigible.
	 *
	 * @return <code>true</code> if this solicitud requerimiento funcion is exigible; <code>false</code> otherwise
	 */
	public boolean isExigible();

	/**
	 * Sets whether this solicitud requerimiento funcion is exigible.
	 *
	 * @param exigible the exigible of this solicitud requerimiento funcion
	 */
	public void setExigible(boolean exigible);

	/**
	 * Returns the activo of this solicitud requerimiento funcion.
	 *
	 * @return the activo of this solicitud requerimiento funcion
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this solicitud requerimiento funcion is activo.
	 *
	 * @return <code>true</code> if this solicitud requerimiento funcion is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this solicitud requerimiento funcion is activo.
	 *
	 * @param activo the activo of this solicitud requerimiento funcion
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this solicitud requerimiento funcion.
	 *
	 * @return the usuariocrea of this solicitud requerimiento funcion
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this solicitud requerimiento funcion.
	 *
	 * @param usuariocrea the usuariocrea of this solicitud requerimiento funcion
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this solicitud requerimiento funcion.
	 *
	 * @return the fechacrea of this solicitud requerimiento funcion
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this solicitud requerimiento funcion.
	 *
	 * @param fechacrea the fechacrea of this solicitud requerimiento funcion
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this solicitud requerimiento funcion.
	 *
	 * @return the usuariomodifica of this solicitud requerimiento funcion
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this solicitud requerimiento funcion.
	 *
	 * @param usuariomodifica the usuariomodifica of this solicitud requerimiento funcion
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechamodifica of this solicitud requerimiento funcion.
	 *
	 * @return the fechamodifica of this solicitud requerimiento funcion
	 */
	public Date getFechamodifica();

	/**
	 * Sets the fechamodifica of this solicitud requerimiento funcion.
	 *
	 * @param fechamodifica the fechamodifica of this solicitud requerimiento funcion
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
	public int compareTo(
		com.hitss.layer.model.SolicitudRequerimientoFuncion solicitudRequerimientoFuncion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.hitss.layer.model.SolicitudRequerimientoFuncion> toCacheModel();

	@Override
	public com.hitss.layer.model.SolicitudRequerimientoFuncion toEscapedModel();

	@Override
	public com.hitss.layer.model.SolicitudRequerimientoFuncion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
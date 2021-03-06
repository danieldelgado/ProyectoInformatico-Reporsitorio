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

import com.hitss.layer.service.persistence.PostulacionPK;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Postulacion service. Represents a row in the &quot;Postulacion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hitss.layer.model.impl.PostulacionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hitss.layer.model.impl.PostulacionImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see Postulacion
 * @see com.hitss.layer.model.impl.PostulacionImpl
 * @see com.hitss.layer.model.impl.PostulacionModelImpl
 * @generated
 */
public interface PostulacionModel extends BaseModel<Postulacion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a postulacion model instance should use the {@link Postulacion} interface instead.
	 */

	/**
	 * Returns the primary key of this postulacion.
	 *
	 * @return the primary key of this postulacion
	 */
	public PostulacionPK getPrimaryKey();

	/**
	 * Sets the primary key of this postulacion.
	 *
	 * @param primaryKey the primary key of this postulacion
	 */
	public void setPrimaryKey(PostulacionPK primaryKey);

	/**
	 * Returns the solicitud requerimiento ID of this postulacion.
	 *
	 * @return the solicitud requerimiento ID of this postulacion
	 */
	public long getSolicitudRequerimientoId();

	/**
	 * Sets the solicitud requerimiento ID of this postulacion.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID of this postulacion
	 */
	public void setSolicitudRequerimientoId(long solicitudRequerimientoId);

	/**
	 * Returns the usuario ID of this postulacion.
	 *
	 * @return the usuario ID of this postulacion
	 */
	public long getUsuarioId();

	/**
	 * Sets the usuario ID of this postulacion.
	 *
	 * @param usuarioId the usuario ID of this postulacion
	 */
	public void setUsuarioId(long usuarioId);

	/**
	 * Returns the fecha postulacion of this postulacion.
	 *
	 * @return the fecha postulacion of this postulacion
	 */
	public Date getFechaPostulacion();

	/**
	 * Sets the fecha postulacion of this postulacion.
	 *
	 * @param fechaPostulacion the fecha postulacion of this postulacion
	 */
	public void setFechaPostulacion(Date fechaPostulacion);

	/**
	 * Returns the estado of this postulacion.
	 *
	 * @return the estado of this postulacion
	 */
	public long getEstado();

	/**
	 * Sets the estado of this postulacion.
	 *
	 * @param estado the estado of this postulacion
	 */
	public void setEstado(long estado);

	/**
	 * Returns the seleccionado of this postulacion.
	 *
	 * @return the seleccionado of this postulacion
	 */
	public boolean getSeleccionado();

	/**
	 * Returns <code>true</code> if this postulacion is seleccionado.
	 *
	 * @return <code>true</code> if this postulacion is seleccionado; <code>false</code> otherwise
	 */
	public boolean isSeleccionado();

	/**
	 * Sets whether this postulacion is seleccionado.
	 *
	 * @param seleccionado the seleccionado of this postulacion
	 */
	public void setSeleccionado(boolean seleccionado);

	/**
	 * Returns the fase no asistida of this postulacion.
	 *
	 * @return the fase no asistida of this postulacion
	 */
	public long getFaseNoAsistida();

	/**
	 * Sets the fase no asistida of this postulacion.
	 *
	 * @param faseNoAsistida the fase no asistida of this postulacion
	 */
	public void setFaseNoAsistida(long faseNoAsistida);

	/**
	 * Returns the activo of this postulacion.
	 *
	 * @return the activo of this postulacion
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this postulacion is activo.
	 *
	 * @return <code>true</code> if this postulacion is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this postulacion is activo.
	 *
	 * @param activo the activo of this postulacion
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this postulacion.
	 *
	 * @return the usuariocrea of this postulacion
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this postulacion.
	 *
	 * @param usuariocrea the usuariocrea of this postulacion
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this postulacion.
	 *
	 * @return the fechacrea of this postulacion
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this postulacion.
	 *
	 * @param fechacrea the fechacrea of this postulacion
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this postulacion.
	 *
	 * @return the usuariomodifica of this postulacion
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this postulacion.
	 *
	 * @param usuariomodifica the usuariomodifica of this postulacion
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechamodifica of this postulacion.
	 *
	 * @return the fechamodifica of this postulacion
	 */
	public Date getFechamodifica();

	/**
	 * Sets the fechamodifica of this postulacion.
	 *
	 * @param fechamodifica the fechamodifica of this postulacion
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
	public int compareTo(com.hitss.layer.model.Postulacion postulacion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.hitss.layer.model.Postulacion> toCacheModel();

	@Override
	public com.hitss.layer.model.Postulacion toEscapedModel();

	@Override
	public com.hitss.layer.model.Postulacion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
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
 * The base model interface for the FasePostulacion service. Represents a row in the &quot;FasePostulacion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rec.hitss.layer.model.impl.FasePostulacionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rec.hitss.layer.model.impl.FasePostulacionImpl}.
 * </p>
 *
 * @author Crossfire
 * @see FasePostulacion
 * @see com.rec.hitss.layer.model.impl.FasePostulacionImpl
 * @see com.rec.hitss.layer.model.impl.FasePostulacionModelImpl
 * @generated
 */
public interface FasePostulacionModel extends BaseModel<FasePostulacion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a fase postulacion model instance should use the {@link FasePostulacion} interface instead.
	 */

	/**
	 * Returns the primary key of this fase postulacion.
	 *
	 * @return the primary key of this fase postulacion
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this fase postulacion.
	 *
	 * @param primaryKey the primary key of this fase postulacion
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the fase postulacion ID of this fase postulacion.
	 *
	 * @return the fase postulacion ID of this fase postulacion
	 */
	public long getFasePostulacionId();

	/**
	 * Sets the fase postulacion ID of this fase postulacion.
	 *
	 * @param fasePostulacionId the fase postulacion ID of this fase postulacion
	 */
	public void setFasePostulacionId(long fasePostulacionId);

	/**
	 * Returns the solicitud requerimiento ID of this fase postulacion.
	 *
	 * @return the solicitud requerimiento ID of this fase postulacion
	 */
	public long getSolicitudRequerimientoId();

	/**
	 * Sets the solicitud requerimiento ID of this fase postulacion.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID of this fase postulacion
	 */
	public void setSolicitudRequerimientoId(long solicitudRequerimientoId);

	/**
	 * Returns the usuario ID of this fase postulacion.
	 *
	 * @return the usuario ID of this fase postulacion
	 */
	public long getUsuarioId();

	/**
	 * Sets the usuario ID of this fase postulacion.
	 *
	 * @param usuarioId the usuario ID of this fase postulacion
	 */
	public void setUsuarioId(long usuarioId);

	/**
	 * Returns the fecha fase of this fase postulacion.
	 *
	 * @return the fecha fase of this fase postulacion
	 */
	public Date getFechaFase();

	/**
	 * Sets the fecha fase of this fase postulacion.
	 *
	 * @param fechaFase the fecha fase of this fase postulacion
	 */
	public void setFechaFase(Date fechaFase);

	/**
	 * Returns the tipo fase of this fase postulacion.
	 *
	 * @return the tipo fase of this fase postulacion
	 */
	public long getTipoFase();

	/**
	 * Sets the tipo fase of this fase postulacion.
	 *
	 * @param tipoFase the tipo fase of this fase postulacion
	 */
	public void setTipoFase(long tipoFase);

	/**
	 * Returns the descripcion of this fase postulacion.
	 *
	 * @return the descripcion of this fase postulacion
	 */
	@AutoEscape
	public String getDescripcion();

	/**
	 * Sets the descripcion of this fase postulacion.
	 *
	 * @param descripcion the descripcion of this fase postulacion
	 */
	public void setDescripcion(String descripcion);

	/**
	 * Returns the estado of this fase postulacion.
	 *
	 * @return the estado of this fase postulacion
	 */
	public long getEstado();

	/**
	 * Sets the estado of this fase postulacion.
	 *
	 * @param estado the estado of this fase postulacion
	 */
	public void setEstado(long estado);

	/**
	 * Returns the activo of this fase postulacion.
	 *
	 * @return the activo of this fase postulacion
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this fase postulacion is activo.
	 *
	 * @return <code>true</code> if this fase postulacion is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this fase postulacion is activo.
	 *
	 * @param activo the activo of this fase postulacion
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this fase postulacion.
	 *
	 * @return the usuariocrea of this fase postulacion
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this fase postulacion.
	 *
	 * @param usuariocrea the usuariocrea of this fase postulacion
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this fase postulacion.
	 *
	 * @return the fechacrea of this fase postulacion
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this fase postulacion.
	 *
	 * @param fechacrea the fechacrea of this fase postulacion
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this fase postulacion.
	 *
	 * @return the usuariomodifica of this fase postulacion
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this fase postulacion.
	 *
	 * @param usuariomodifica the usuariomodifica of this fase postulacion
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechacreamodifica of this fase postulacion.
	 *
	 * @return the fechacreamodifica of this fase postulacion
	 */
	public Date getFechacreamodifica();

	/**
	 * Sets the fechacreamodifica of this fase postulacion.
	 *
	 * @param fechacreamodifica the fechacreamodifica of this fase postulacion
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
	public int compareTo(
		com.rec.hitss.layer.model.FasePostulacion fasePostulacion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rec.hitss.layer.model.FasePostulacion> toCacheModel();

	@Override
	public com.rec.hitss.layer.model.FasePostulacion toEscapedModel();

	@Override
	public com.rec.hitss.layer.model.FasePostulacion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
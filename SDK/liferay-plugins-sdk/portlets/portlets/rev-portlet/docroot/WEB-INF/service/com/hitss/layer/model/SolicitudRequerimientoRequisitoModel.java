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

import com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the SolicitudRequerimientoRequisito service. Represents a row in the &quot;SolicitudRequerimientoRequisito&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoRequisito
 * @see com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoImpl
 * @see com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl
 * @generated
 */
public interface SolicitudRequerimientoRequisitoModel extends BaseModel<SolicitudRequerimientoRequisito> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a solicitud requerimiento requisito model instance should use the {@link SolicitudRequerimientoRequisito} interface instead.
	 */

	/**
	 * Returns the primary key of this solicitud requerimiento requisito.
	 *
	 * @return the primary key of this solicitud requerimiento requisito
	 */
	public SolicitudRequerimientoRequisitoPK getPrimaryKey();

	/**
	 * Sets the primary key of this solicitud requerimiento requisito.
	 *
	 * @param primaryKey the primary key of this solicitud requerimiento requisito
	 */
	public void setPrimaryKey(SolicitudRequerimientoRequisitoPK primaryKey);

	/**
	 * Returns the solicitud requerimiento ID of this solicitud requerimiento requisito.
	 *
	 * @return the solicitud requerimiento ID of this solicitud requerimiento requisito
	 */
	public long getSolicitudRequerimientoId();

	/**
	 * Sets the solicitud requerimiento ID of this solicitud requerimiento requisito.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID of this solicitud requerimiento requisito
	 */
	public void setSolicitudRequerimientoId(long solicitudRequerimientoId);

	/**
	 * Returns the tag ID of this solicitud requerimiento requisito.
	 *
	 * @return the tag ID of this solicitud requerimiento requisito
	 */
	public long getTagId();

	/**
	 * Sets the tag ID of this solicitud requerimiento requisito.
	 *
	 * @param tagId the tag ID of this solicitud requerimiento requisito
	 */
	public void setTagId(long tagId);

	/**
	 * Returns the nivel of this solicitud requerimiento requisito.
	 *
	 * @return the nivel of this solicitud requerimiento requisito
	 */
	public long getNivel();

	/**
	 * Sets the nivel of this solicitud requerimiento requisito.
	 *
	 * @param nivel the nivel of this solicitud requerimiento requisito
	 */
	public void setNivel(long nivel);

	/**
	 * Returns the exigible of this solicitud requerimiento requisito.
	 *
	 * @return the exigible of this solicitud requerimiento requisito
	 */
	public boolean getExigible();

	/**
	 * Returns <code>true</code> if this solicitud requerimiento requisito is exigible.
	 *
	 * @return <code>true</code> if this solicitud requerimiento requisito is exigible; <code>false</code> otherwise
	 */
	public boolean isExigible();

	/**
	 * Sets whether this solicitud requerimiento requisito is exigible.
	 *
	 * @param exigible the exigible of this solicitud requerimiento requisito
	 */
	public void setExigible(boolean exigible);

	/**
	 * Returns the tipo requisito of this solicitud requerimiento requisito.
	 *
	 * @return the tipo requisito of this solicitud requerimiento requisito
	 */
	public long getTipoRequisito();

	/**
	 * Sets the tipo requisito of this solicitud requerimiento requisito.
	 *
	 * @param tipoRequisito the tipo requisito of this solicitud requerimiento requisito
	 */
	public void setTipoRequisito(long tipoRequisito);

	/**
	 * Returns the herramienta of this solicitud requerimiento requisito.
	 *
	 * @return the herramienta of this solicitud requerimiento requisito
	 */
	public long getHerramienta();

	/**
	 * Sets the herramienta of this solicitud requerimiento requisito.
	 *
	 * @param herramienta the herramienta of this solicitud requerimiento requisito
	 */
	public void setHerramienta(long herramienta);

	/**
	 * Returns the activo of this solicitud requerimiento requisito.
	 *
	 * @return the activo of this solicitud requerimiento requisito
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this solicitud requerimiento requisito is activo.
	 *
	 * @return <code>true</code> if this solicitud requerimiento requisito is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this solicitud requerimiento requisito is activo.
	 *
	 * @param activo the activo of this solicitud requerimiento requisito
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this solicitud requerimiento requisito.
	 *
	 * @return the usuariocrea of this solicitud requerimiento requisito
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this solicitud requerimiento requisito.
	 *
	 * @param usuariocrea the usuariocrea of this solicitud requerimiento requisito
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this solicitud requerimiento requisito.
	 *
	 * @return the fechacrea of this solicitud requerimiento requisito
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this solicitud requerimiento requisito.
	 *
	 * @param fechacrea the fechacrea of this solicitud requerimiento requisito
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this solicitud requerimiento requisito.
	 *
	 * @return the usuariomodifica of this solicitud requerimiento requisito
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this solicitud requerimiento requisito.
	 *
	 * @param usuariomodifica the usuariomodifica of this solicitud requerimiento requisito
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechacreamodifica of this solicitud requerimiento requisito.
	 *
	 * @return the fechacreamodifica of this solicitud requerimiento requisito
	 */
	public Date getFechacreamodifica();

	/**
	 * Sets the fechacreamodifica of this solicitud requerimiento requisito.
	 *
	 * @param fechacreamodifica the fechacreamodifica of this solicitud requerimiento requisito
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
		com.hitss.layer.model.SolicitudRequerimientoRequisito solicitudRequerimientoRequisito);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.hitss.layer.model.SolicitudRequerimientoRequisito> toCacheModel();

	@Override
	public com.hitss.layer.model.SolicitudRequerimientoRequisito toEscapedModel();

	@Override
	public com.hitss.layer.model.SolicitudRequerimientoRequisito toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
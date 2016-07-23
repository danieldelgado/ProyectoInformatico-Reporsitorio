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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import com.rec.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK;

import java.io.Serializable;

/**
 * The base model interface for the SolicitudRequerimientoRequisito service. Represents a row in the &quot;SolicitudRequerimientoRequisito&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoRequisitoImpl}.
 * </p>
 *
 * @author Crossfire
 * @see SolicitudRequerimientoRequisito
 * @see com.rec.hitss.layer.model.impl.SolicitudRequerimientoRequisitoImpl
 * @see com.rec.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl
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
	 * Returns the requisitos ID of this solicitud requerimiento requisito.
	 *
	 * @return the requisitos ID of this solicitud requerimiento requisito
	 */
	public long getRequisitosId();

	/**
	 * Sets the requisitos ID of this solicitud requerimiento requisito.
	 *
	 * @param requisitosId the requisitos ID of this solicitud requerimiento requisito
	 */
	public void setRequisitosId(long requisitosId);

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
		com.rec.hitss.layer.model.SolicitudRequerimientoRequisito solicitudRequerimientoRequisito);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rec.hitss.layer.model.SolicitudRequerimientoRequisito> toCacheModel();

	@Override
	public com.rec.hitss.layer.model.SolicitudRequerimientoRequisito toEscapedModel();

	@Override
	public com.rec.hitss.layer.model.SolicitudRequerimientoRequisito toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
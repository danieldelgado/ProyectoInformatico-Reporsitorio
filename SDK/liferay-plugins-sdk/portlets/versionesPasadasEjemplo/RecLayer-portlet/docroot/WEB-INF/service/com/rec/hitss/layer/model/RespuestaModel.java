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

/**
 * The base model interface for the Respuesta service. Represents a row in the &quot;Respuesta&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rec.hitss.layer.model.impl.RespuestaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rec.hitss.layer.model.impl.RespuestaImpl}.
 * </p>
 *
 * @author Crossfire
 * @see Respuesta
 * @see com.rec.hitss.layer.model.impl.RespuestaImpl
 * @see com.rec.hitss.layer.model.impl.RespuestaModelImpl
 * @generated
 */
public interface RespuestaModel extends BaseModel<Respuesta> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a respuesta model instance should use the {@link Respuesta} interface instead.
	 */

	/**
	 * Returns the primary key of this respuesta.
	 *
	 * @return the primary key of this respuesta
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this respuesta.
	 *
	 * @param primaryKey the primary key of this respuesta
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the respuesta ID of this respuesta.
	 *
	 * @return the respuesta ID of this respuesta
	 */
	public long getRespuestaId();

	/**
	 * Sets the respuesta ID of this respuesta.
	 *
	 * @param respuestaId the respuesta ID of this respuesta
	 */
	public void setRespuestaId(long respuestaId);

	/**
	 * Returns the descripcion of this respuesta.
	 *
	 * @return the descripcion of this respuesta
	 */
	@AutoEscape
	public String getDescripcion();

	/**
	 * Sets the descripcion of this respuesta.
	 *
	 * @param descripcion the descripcion of this respuesta
	 */
	public void setDescripcion(String descripcion);

	/**
	 * Returns the correcta of this respuesta.
	 *
	 * @return the correcta of this respuesta
	 */
	public boolean getCorrecta();

	/**
	 * Returns <code>true</code> if this respuesta is correcta.
	 *
	 * @return <code>true</code> if this respuesta is correcta; <code>false</code> otherwise
	 */
	public boolean isCorrecta();

	/**
	 * Sets whether this respuesta is correcta.
	 *
	 * @param correcta the correcta of this respuesta
	 */
	public void setCorrecta(boolean correcta);

	/**
	 * Returns the pregunta ID of this respuesta.
	 *
	 * @return the pregunta ID of this respuesta
	 */
	public long getPreguntaId();

	/**
	 * Sets the pregunta ID of this respuesta.
	 *
	 * @param preguntaId the pregunta ID of this respuesta
	 */
	public void setPreguntaId(long preguntaId);

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
	public int compareTo(com.rec.hitss.layer.model.Respuesta respuesta);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rec.hitss.layer.model.Respuesta> toCacheModel();

	@Override
	public com.rec.hitss.layer.model.Respuesta toEscapedModel();

	@Override
	public com.rec.hitss.layer.model.Respuesta toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
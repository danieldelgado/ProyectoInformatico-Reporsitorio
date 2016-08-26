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

import com.hitss.layer.service.persistence.PreguntaRespuestaPK;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the PreguntaRespuesta service. Represents a row in the &quot;PreguntaRespuesta&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hitss.layer.model.impl.PreguntaRespuestaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hitss.layer.model.impl.PreguntaRespuestaImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see PreguntaRespuesta
 * @see com.hitss.layer.model.impl.PreguntaRespuestaImpl
 * @see com.hitss.layer.model.impl.PreguntaRespuestaModelImpl
 * @generated
 */
public interface PreguntaRespuestaModel extends BaseModel<PreguntaRespuesta> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a pregunta respuesta model instance should use the {@link PreguntaRespuesta} interface instead.
	 */

	/**
	 * Returns the primary key of this pregunta respuesta.
	 *
	 * @return the primary key of this pregunta respuesta
	 */
	public PreguntaRespuestaPK getPrimaryKey();

	/**
	 * Sets the primary key of this pregunta respuesta.
	 *
	 * @param primaryKey the primary key of this pregunta respuesta
	 */
	public void setPrimaryKey(PreguntaRespuestaPK primaryKey);

	/**
	 * Returns the pregunta ID of this pregunta respuesta.
	 *
	 * @return the pregunta ID of this pregunta respuesta
	 */
	public long getPreguntaId();

	/**
	 * Sets the pregunta ID of this pregunta respuesta.
	 *
	 * @param preguntaId the pregunta ID of this pregunta respuesta
	 */
	public void setPreguntaId(long preguntaId);

	/**
	 * Returns the respuesta ID of this pregunta respuesta.
	 *
	 * @return the respuesta ID of this pregunta respuesta
	 */
	public long getRespuestaId();

	/**
	 * Sets the respuesta ID of this pregunta respuesta.
	 *
	 * @param respuestaId the respuesta ID of this pregunta respuesta
	 */
	public void setRespuestaId(long respuestaId);

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
		com.hitss.layer.model.PreguntaRespuesta preguntaRespuesta);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.hitss.layer.model.PreguntaRespuesta> toCacheModel();

	@Override
	public com.hitss.layer.model.PreguntaRespuesta toEscapedModel();

	@Override
	public com.hitss.layer.model.PreguntaRespuesta toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
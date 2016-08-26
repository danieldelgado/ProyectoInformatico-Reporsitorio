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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the UsuarioEvaluacion service. Represents a row in the &quot;UsuarioEvaluacion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hitss.layer.model.impl.UsuarioEvaluacionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hitss.layer.model.impl.UsuarioEvaluacionImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see UsuarioEvaluacion
 * @see com.hitss.layer.model.impl.UsuarioEvaluacionImpl
 * @see com.hitss.layer.model.impl.UsuarioEvaluacionModelImpl
 * @generated
 */
public interface UsuarioEvaluacionModel extends BaseModel<UsuarioEvaluacion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a usuario evaluacion model instance should use the {@link UsuarioEvaluacion} interface instead.
	 */

	/**
	 * Returns the primary key of this usuario evaluacion.
	 *
	 * @return the primary key of this usuario evaluacion
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this usuario evaluacion.
	 *
	 * @param primaryKey the primary key of this usuario evaluacion
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the actividad cronograma ID of this usuario evaluacion.
	 *
	 * @return the actividad cronograma ID of this usuario evaluacion
	 */
	public long getActividadCronogramaId();

	/**
	 * Sets the actividad cronograma ID of this usuario evaluacion.
	 *
	 * @param actividadCronogramaId the actividad cronograma ID of this usuario evaluacion
	 */
	public void setActividadCronogramaId(long actividadCronogramaId);

	/**
	 * Returns the usuario ID of this usuario evaluacion.
	 *
	 * @return the usuario ID of this usuario evaluacion
	 */
	public long getUsuarioId();

	/**
	 * Sets the usuario ID of this usuario evaluacion.
	 *
	 * @param usuarioId the usuario ID of this usuario evaluacion
	 */
	public void setUsuarioId(long usuarioId);

	/**
	 * Returns the evaluacion ID of this usuario evaluacion.
	 *
	 * @return the evaluacion ID of this usuario evaluacion
	 */
	public long getEvaluacionId();

	/**
	 * Sets the evaluacion ID of this usuario evaluacion.
	 *
	 * @param evaluacionId the evaluacion ID of this usuario evaluacion
	 */
	public void setEvaluacionId(long evaluacionId);

	/**
	 * Returns the nota of this usuario evaluacion.
	 *
	 * @return the nota of this usuario evaluacion
	 */
	public int getNota();

	/**
	 * Sets the nota of this usuario evaluacion.
	 *
	 * @param nota the nota of this usuario evaluacion
	 */
	public void setNota(int nota);

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
		com.hitss.layer.model.UsuarioEvaluacion usuarioEvaluacion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.hitss.layer.model.UsuarioEvaluacion> toCacheModel();

	@Override
	public com.hitss.layer.model.UsuarioEvaluacion toEscapedModel();

	@Override
	public com.hitss.layer.model.UsuarioEvaluacion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
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

import com.hitss.layer.service.persistence.DetalleRepuestaReclutamientoPK;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the DetalleRepuestaReclutamiento service. Represents a row in the &quot;DetalleRepuestaReclutamiento&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hitss.layer.model.impl.DetalleRepuestaReclutamientoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hitss.layer.model.impl.DetalleRepuestaReclutamientoImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see DetalleRepuestaReclutamiento
 * @see com.hitss.layer.model.impl.DetalleRepuestaReclutamientoImpl
 * @see com.hitss.layer.model.impl.DetalleRepuestaReclutamientoModelImpl
 * @generated
 */
public interface DetalleRepuestaReclutamientoModel extends BaseModel<DetalleRepuestaReclutamiento> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a detalle repuesta reclutamiento model instance should use the {@link DetalleRepuestaReclutamiento} interface instead.
	 */

	/**
	 * Returns the primary key of this detalle repuesta reclutamiento.
	 *
	 * @return the primary key of this detalle repuesta reclutamiento
	 */
	public DetalleRepuestaReclutamientoPK getPrimaryKey();

	/**
	 * Sets the primary key of this detalle repuesta reclutamiento.
	 *
	 * @param primaryKey the primary key of this detalle repuesta reclutamiento
	 */
	public void setPrimaryKey(DetalleRepuestaReclutamientoPK primaryKey);

	/**
	 * Returns the detalle repsuesta ID of this detalle repuesta reclutamiento.
	 *
	 * @return the detalle repsuesta ID of this detalle repuesta reclutamiento
	 */
	public long getDetalleRepsuestaId();

	/**
	 * Sets the detalle repsuesta ID of this detalle repuesta reclutamiento.
	 *
	 * @param detalleRepsuestaId the detalle repsuesta ID of this detalle repuesta reclutamiento
	 */
	public void setDetalleRepsuestaId(long detalleRepsuestaId);

	/**
	 * Returns the evaluacion ID of this detalle repuesta reclutamiento.
	 *
	 * @return the evaluacion ID of this detalle repuesta reclutamiento
	 */
	public long getEvaluacionId();

	/**
	 * Sets the evaluacion ID of this detalle repuesta reclutamiento.
	 *
	 * @param evaluacionId the evaluacion ID of this detalle repuesta reclutamiento
	 */
	public void setEvaluacionId(long evaluacionId);

	/**
	 * Returns the fase postulacion ID of this detalle repuesta reclutamiento.
	 *
	 * @return the fase postulacion ID of this detalle repuesta reclutamiento
	 */
	public long getFasePostulacionId();

	/**
	 * Sets the fase postulacion ID of this detalle repuesta reclutamiento.
	 *
	 * @param fasePostulacionId the fase postulacion ID of this detalle repuesta reclutamiento
	 */
	public void setFasePostulacionId(long fasePostulacionId);

	/**
	 * Returns the descripcion of this detalle repuesta reclutamiento.
	 *
	 * @return the descripcion of this detalle repuesta reclutamiento
	 */
	@AutoEscape
	public String getDescripcion();

	/**
	 * Sets the descripcion of this detalle repuesta reclutamiento.
	 *
	 * @param descripcion the descripcion of this detalle repuesta reclutamiento
	 */
	public void setDescripcion(String descripcion);

	/**
	 * Returns the respuesta seleccionada of this detalle repuesta reclutamiento.
	 *
	 * @return the respuesta seleccionada of this detalle repuesta reclutamiento
	 */
	public int getRespuestaSeleccionada();

	/**
	 * Sets the respuesta seleccionada of this detalle repuesta reclutamiento.
	 *
	 * @param respuestaSeleccionada the respuesta seleccionada of this detalle repuesta reclutamiento
	 */
	public void setRespuestaSeleccionada(int respuestaSeleccionada);

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
		com.hitss.layer.model.DetalleRepuestaReclutamiento detalleRepuestaReclutamiento);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.hitss.layer.model.DetalleRepuestaReclutamiento> toCacheModel();

	@Override
	public com.hitss.layer.model.DetalleRepuestaReclutamiento toEscapedModel();

	@Override
	public com.hitss.layer.model.DetalleRepuestaReclutamiento toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
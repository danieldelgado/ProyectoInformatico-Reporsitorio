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
 * The base model interface for the Actividades service. Represents a row in the &quot;Actividades&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rec.hitss.layer.model.impl.ActividadesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rec.hitss.layer.model.impl.ActividadesImpl}.
 * </p>
 *
 * @author Crossfire
 * @see Actividades
 * @see com.rec.hitss.layer.model.impl.ActividadesImpl
 * @see com.rec.hitss.layer.model.impl.ActividadesModelImpl
 * @generated
 */
public interface ActividadesModel extends BaseModel<Actividades> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a actividades model instance should use the {@link Actividades} interface instead.
	 */

	/**
	 * Returns the primary key of this actividades.
	 *
	 * @return the primary key of this actividades
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this actividades.
	 *
	 * @param primaryKey the primary key of this actividades
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the actividades ID of this actividades.
	 *
	 * @return the actividades ID of this actividades
	 */
	public long getActividadesId();

	/**
	 * Sets the actividades ID of this actividades.
	 *
	 * @param actividadesId the actividades ID of this actividades
	 */
	public void setActividadesId(long actividadesId);

	/**
	 * Returns the cronograma evaluacion personal ID of this actividades.
	 *
	 * @return the cronograma evaluacion personal ID of this actividades
	 */
	public long getCronogramaEvaluacionPersonalId();

	/**
	 * Sets the cronograma evaluacion personal ID of this actividades.
	 *
	 * @param cronogramaEvaluacionPersonalId the cronograma evaluacion personal ID of this actividades
	 */
	public void setCronogramaEvaluacionPersonalId(
		long cronogramaEvaluacionPersonalId);

	/**
	 * Returns the fechacreamodifica of this actividades.
	 *
	 * @return the fechacreamodifica of this actividades
	 */
	public Date getFechacreamodifica();

	/**
	 * Sets the fechacreamodifica of this actividades.
	 *
	 * @param fechacreamodifica the fechacreamodifica of this actividades
	 */
	public void setFechacreamodifica(Date fechacreamodifica);

	/**
	 * Returns the fecha inicio evaluacion of this actividades.
	 *
	 * @return the fecha inicio evaluacion of this actividades
	 */
	public Date getFechaInicioEvaluacion();

	/**
	 * Sets the fecha inicio evaluacion of this actividades.
	 *
	 * @param fechaInicioEvaluacion the fecha inicio evaluacion of this actividades
	 */
	public void setFechaInicioEvaluacion(Date fechaInicioEvaluacion);

	/**
	 * Returns the fecha fin evaluacion of this actividades.
	 *
	 * @return the fecha fin evaluacion of this actividades
	 */
	public Date getFechaFinEvaluacion();

	/**
	 * Sets the fecha fin evaluacion of this actividades.
	 *
	 * @param fechaFinEvaluacion the fecha fin evaluacion of this actividades
	 */
	public void setFechaFinEvaluacion(Date fechaFinEvaluacion);

	/**
	 * Returns the descripcion of this actividades.
	 *
	 * @return the descripcion of this actividades
	 */
	@AutoEscape
	public String getDescripcion();

	/**
	 * Sets the descripcion of this actividades.
	 *
	 * @param descripcion the descripcion of this actividades
	 */
	public void setDescripcion(String descripcion);

	/**
	 * Returns the activo of this actividades.
	 *
	 * @return the activo of this actividades
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this actividades is activo.
	 *
	 * @return <code>true</code> if this actividades is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this actividades is activo.
	 *
	 * @param activo the activo of this actividades
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this actividades.
	 *
	 * @return the usuariocrea of this actividades
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this actividades.
	 *
	 * @param usuariocrea the usuariocrea of this actividades
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this actividades.
	 *
	 * @return the fechacrea of this actividades
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this actividades.
	 *
	 * @param fechacrea the fechacrea of this actividades
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this actividades.
	 *
	 * @return the usuariomodifica of this actividades
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this actividades.
	 *
	 * @param usuariomodifica the usuariomodifica of this actividades
	 */
	public void setUsuariomodifica(long usuariomodifica);

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
	public int compareTo(com.rec.hitss.layer.model.Actividades actividades);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rec.hitss.layer.model.Actividades> toCacheModel();

	@Override
	public com.rec.hitss.layer.model.Actividades toEscapedModel();

	@Override
	public com.rec.hitss.layer.model.Actividades toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
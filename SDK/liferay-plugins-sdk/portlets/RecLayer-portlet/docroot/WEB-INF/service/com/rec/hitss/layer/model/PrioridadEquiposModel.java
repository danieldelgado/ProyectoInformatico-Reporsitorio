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

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the PrioridadEquipos service. Represents a row in the &quot;PrioridadEquipos&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rec.hitss.layer.model.impl.PrioridadEquiposModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rec.hitss.layer.model.impl.PrioridadEquiposImpl}.
 * </p>
 *
 * @author Crossfire
 * @see PrioridadEquipos
 * @see com.rec.hitss.layer.model.impl.PrioridadEquiposImpl
 * @see com.rec.hitss.layer.model.impl.PrioridadEquiposModelImpl
 * @generated
 */
public interface PrioridadEquiposModel extends BaseModel<PrioridadEquipos> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a prioridad equipos model instance should use the {@link PrioridadEquipos} interface instead.
	 */

	/**
	 * Returns the primary key of this prioridad equipos.
	 *
	 * @return the primary key of this prioridad equipos
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this prioridad equipos.
	 *
	 * @param primaryKey the primary key of this prioridad equipos
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the prioridad equipos ID of this prioridad equipos.
	 *
	 * @return the prioridad equipos ID of this prioridad equipos
	 */
	public long getPrioridadEquiposId();

	/**
	 * Sets the prioridad equipos ID of this prioridad equipos.
	 *
	 * @param prioridadEquiposId the prioridad equipos ID of this prioridad equipos
	 */
	public void setPrioridadEquiposId(long prioridadEquiposId);

	/**
	 * Returns the solicitud evaluacion desempeno ID of this prioridad equipos.
	 *
	 * @return the solicitud evaluacion desempeno ID of this prioridad equipos
	 */
	public long getSolicitudEvaluacionDesempenoId();

	/**
	 * Sets the solicitud evaluacion desempeno ID of this prioridad equipos.
	 *
	 * @param solicitudEvaluacionDesempenoId the solicitud evaluacion desempeno ID of this prioridad equipos
	 */
	public void setSolicitudEvaluacionDesempenoId(
		long solicitudEvaluacionDesempenoId);

	/**
	 * Returns the responsable of this prioridad equipos.
	 *
	 * @return the responsable of this prioridad equipos
	 */
	public long getResponsable();

	/**
	 * Sets the responsable of this prioridad equipos.
	 *
	 * @param responsable the responsable of this prioridad equipos
	 */
	public void setResponsable(long responsable);

	/**
	 * Returns the activo of this prioridad equipos.
	 *
	 * @return the activo of this prioridad equipos
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this prioridad equipos is activo.
	 *
	 * @return <code>true</code> if this prioridad equipos is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this prioridad equipos is activo.
	 *
	 * @param activo the activo of this prioridad equipos
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this prioridad equipos.
	 *
	 * @return the usuariocrea of this prioridad equipos
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this prioridad equipos.
	 *
	 * @param usuariocrea the usuariocrea of this prioridad equipos
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this prioridad equipos.
	 *
	 * @return the fechacrea of this prioridad equipos
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this prioridad equipos.
	 *
	 * @param fechacrea the fechacrea of this prioridad equipos
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this prioridad equipos.
	 *
	 * @return the usuariomodifica of this prioridad equipos
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this prioridad equipos.
	 *
	 * @param usuariomodifica the usuariomodifica of this prioridad equipos
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechacreamodifica of this prioridad equipos.
	 *
	 * @return the fechacreamodifica of this prioridad equipos
	 */
	public Date getFechacreamodifica();

	/**
	 * Sets the fechacreamodifica of this prioridad equipos.
	 *
	 * @param fechacreamodifica the fechacreamodifica of this prioridad equipos
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
		com.rec.hitss.layer.model.PrioridadEquipos prioridadEquipos);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rec.hitss.layer.model.PrioridadEquipos> toCacheModel();

	@Override
	public com.rec.hitss.layer.model.PrioridadEquipos toEscapedModel();

	@Override
	public com.rec.hitss.layer.model.PrioridadEquipos toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
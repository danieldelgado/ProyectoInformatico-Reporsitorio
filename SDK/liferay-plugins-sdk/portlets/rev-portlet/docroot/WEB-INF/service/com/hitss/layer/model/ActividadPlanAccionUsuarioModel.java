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

import com.hitss.layer.service.persistence.ActividadPlanAccionUsuarioPK;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ActividadPlanAccionUsuario service. Represents a row in the &quot;ActividadPlanAccionUsuario&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hitss.layer.model.impl.ActividadPlanAccionUsuarioModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hitss.layer.model.impl.ActividadPlanAccionUsuarioImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see ActividadPlanAccionUsuario
 * @see com.hitss.layer.model.impl.ActividadPlanAccionUsuarioImpl
 * @see com.hitss.layer.model.impl.ActividadPlanAccionUsuarioModelImpl
 * @generated
 */
public interface ActividadPlanAccionUsuarioModel extends BaseModel<ActividadPlanAccionUsuario> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a actividad plan accion usuario model instance should use the {@link ActividadPlanAccionUsuario} interface instead.
	 */

	/**
	 * Returns the primary key of this actividad plan accion usuario.
	 *
	 * @return the primary key of this actividad plan accion usuario
	 */
	public ActividadPlanAccionUsuarioPK getPrimaryKey();

	/**
	 * Sets the primary key of this actividad plan accion usuario.
	 *
	 * @param primaryKey the primary key of this actividad plan accion usuario
	 */
	public void setPrimaryKey(ActividadPlanAccionUsuarioPK primaryKey);

	/**
	 * Returns the actividad plan accion usuarioco ID of this actividad plan accion usuario.
	 *
	 * @return the actividad plan accion usuarioco ID of this actividad plan accion usuario
	 */
	public long getActividadPlanAccionUsuariocoId();

	/**
	 * Sets the actividad plan accion usuarioco ID of this actividad plan accion usuario.
	 *
	 * @param actividadPlanAccionUsuariocoId the actividad plan accion usuarioco ID of this actividad plan accion usuario
	 */
	public void setActividadPlanAccionUsuariocoId(
		long actividadPlanAccionUsuariocoId);

	/**
	 * Returns the actividad plan ID of this actividad plan accion usuario.
	 *
	 * @return the actividad plan ID of this actividad plan accion usuario
	 */
	public long getActividadPlanId();

	/**
	 * Sets the actividad plan ID of this actividad plan accion usuario.
	 *
	 * @param actividadPlanId the actividad plan ID of this actividad plan accion usuario
	 */
	public void setActividadPlanId(long actividadPlanId);

	/**
	 * Returns the usuario ID of this actividad plan accion usuario.
	 *
	 * @return the usuario ID of this actividad plan accion usuario
	 */
	public long getUsuarioId();

	/**
	 * Sets the usuario ID of this actividad plan accion usuario.
	 *
	 * @param usuarioId the usuario ID of this actividad plan accion usuario
	 */
	public void setUsuarioId(long usuarioId);

	/**
	 * Returns the cumplio of this actividad plan accion usuario.
	 *
	 * @return the cumplio of this actividad plan accion usuario
	 */
	public long getCumplio();

	/**
	 * Sets the cumplio of this actividad plan accion usuario.
	 *
	 * @param cumplio the cumplio of this actividad plan accion usuario
	 */
	public void setCumplio(long cumplio);

	/**
	 * Returns the actividad of this actividad plan accion usuario.
	 *
	 * @return the actividad of this actividad plan accion usuario
	 */
	@AutoEscape
	public String getActividad();

	/**
	 * Sets the actividad of this actividad plan accion usuario.
	 *
	 * @param actividad the actividad of this actividad plan accion usuario
	 */
	public void setActividad(String actividad);

	/**
	 * Returns the puntuacion of this actividad plan accion usuario.
	 *
	 * @return the puntuacion of this actividad plan accion usuario
	 */
	public int getPuntuacion();

	/**
	 * Sets the puntuacion of this actividad plan accion usuario.
	 *
	 * @param puntuacion the puntuacion of this actividad plan accion usuario
	 */
	public void setPuntuacion(int puntuacion);

	/**
	 * Returns the activo of this actividad plan accion usuario.
	 *
	 * @return the activo of this actividad plan accion usuario
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this actividad plan accion usuario is activo.
	 *
	 * @return <code>true</code> if this actividad plan accion usuario is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this actividad plan accion usuario is activo.
	 *
	 * @param activo the activo of this actividad plan accion usuario
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this actividad plan accion usuario.
	 *
	 * @return the usuariocrea of this actividad plan accion usuario
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this actividad plan accion usuario.
	 *
	 * @param usuariocrea the usuariocrea of this actividad plan accion usuario
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this actividad plan accion usuario.
	 *
	 * @return the fechacrea of this actividad plan accion usuario
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this actividad plan accion usuario.
	 *
	 * @param fechacrea the fechacrea of this actividad plan accion usuario
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this actividad plan accion usuario.
	 *
	 * @return the usuariomodifica of this actividad plan accion usuario
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this actividad plan accion usuario.
	 *
	 * @param usuariomodifica the usuariomodifica of this actividad plan accion usuario
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechamodifica of this actividad plan accion usuario.
	 *
	 * @return the fechamodifica of this actividad plan accion usuario
	 */
	public Date getFechamodifica();

	/**
	 * Sets the fechamodifica of this actividad plan accion usuario.
	 *
	 * @param fechamodifica the fechamodifica of this actividad plan accion usuario
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
	public int compareTo(
		com.hitss.layer.model.ActividadPlanAccionUsuario actividadPlanAccionUsuario);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.hitss.layer.model.ActividadPlanAccionUsuario> toCacheModel();

	@Override
	public com.hitss.layer.model.ActividadPlanAccionUsuario toEscapedModel();

	@Override
	public com.hitss.layer.model.ActividadPlanAccionUsuario toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the LogOperaciones service. Represents a row in the &quot;LogOperaciones&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hitss.layer.model.impl.LogOperacionesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hitss.layer.model.impl.LogOperacionesImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see LogOperaciones
 * @see com.hitss.layer.model.impl.LogOperacionesImpl
 * @see com.hitss.layer.model.impl.LogOperacionesModelImpl
 * @generated
 */
public interface LogOperacionesModel extends BaseModel<LogOperaciones> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a log operaciones model instance should use the {@link LogOperaciones} interface instead.
	 */

	/**
	 * Returns the primary key of this log operaciones.
	 *
	 * @return the primary key of this log operaciones
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this log operaciones.
	 *
	 * @param primaryKey the primary key of this log operaciones
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the log operaciones ID of this log operaciones.
	 *
	 * @return the log operaciones ID of this log operaciones
	 */
	public long getLogOperacionesId();

	/**
	 * Sets the log operaciones ID of this log operaciones.
	 *
	 * @param logOperacionesId the log operaciones ID of this log operaciones
	 */
	public void setLogOperacionesId(long logOperacionesId);

	/**
	 * Returns the tipo actividad of this log operaciones.
	 *
	 * @return the tipo actividad of this log operaciones
	 */
	public long getTipoActividad();

	/**
	 * Sets the tipo actividad of this log operaciones.
	 *
	 * @param tipoActividad the tipo actividad of this log operaciones
	 */
	public void setTipoActividad(long tipoActividad);

	/**
	 * Returns the actividad of this log operaciones.
	 *
	 * @return the actividad of this log operaciones
	 */
	@AutoEscape
	public String getActividad();

	/**
	 * Sets the actividad of this log operaciones.
	 *
	 * @param actividad the actividad of this log operaciones
	 */
	public void setActividad(String actividad);

	/**
	 * Returns the usuario of this log operaciones.
	 *
	 * @return the usuario of this log operaciones
	 */
	@AutoEscape
	public String getUsuario();

	/**
	 * Sets the usuario of this log operaciones.
	 *
	 * @param usuario the usuario of this log operaciones
	 */
	public void setUsuario(String usuario);

	/**
	 * Returns the activo of this log operaciones.
	 *
	 * @return the activo of this log operaciones
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this log operaciones is activo.
	 *
	 * @return <code>true</code> if this log operaciones is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this log operaciones is activo.
	 *
	 * @param activo the activo of this log operaciones
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this log operaciones.
	 *
	 * @return the usuariocrea of this log operaciones
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this log operaciones.
	 *
	 * @param usuariocrea the usuariocrea of this log operaciones
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this log operaciones.
	 *
	 * @return the fechacrea of this log operaciones
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this log operaciones.
	 *
	 * @param fechacrea the fechacrea of this log operaciones
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this log operaciones.
	 *
	 * @return the usuariomodifica of this log operaciones
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this log operaciones.
	 *
	 * @param usuariomodifica the usuariomodifica of this log operaciones
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechamodifica of this log operaciones.
	 *
	 * @return the fechamodifica of this log operaciones
	 */
	public Date getFechamodifica();

	/**
	 * Sets the fechamodifica of this log operaciones.
	 *
	 * @param fechamodifica the fechamodifica of this log operaciones
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
	public int compareTo(com.hitss.layer.model.LogOperaciones logOperaciones);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.hitss.layer.model.LogOperaciones> toCacheModel();

	@Override
	public com.hitss.layer.model.LogOperaciones toEscapedModel();

	@Override
	public com.hitss.layer.model.LogOperaciones toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
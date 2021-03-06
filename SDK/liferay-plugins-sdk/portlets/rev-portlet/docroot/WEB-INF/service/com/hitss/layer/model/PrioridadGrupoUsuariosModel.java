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
 * The base model interface for the PrioridadGrupoUsuarios service. Represents a row in the &quot;PrioridadGrupoUsuarios&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hitss.layer.model.impl.PrioridadGrupoUsuariosModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hitss.layer.model.impl.PrioridadGrupoUsuariosImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see PrioridadGrupoUsuarios
 * @see com.hitss.layer.model.impl.PrioridadGrupoUsuariosImpl
 * @see com.hitss.layer.model.impl.PrioridadGrupoUsuariosModelImpl
 * @generated
 */
public interface PrioridadGrupoUsuariosModel extends BaseModel<PrioridadGrupoUsuarios> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a prioridad grupo usuarios model instance should use the {@link PrioridadGrupoUsuarios} interface instead.
	 */

	/**
	 * Returns the primary key of this prioridad grupo usuarios.
	 *
	 * @return the primary key of this prioridad grupo usuarios
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this prioridad grupo usuarios.
	 *
	 * @param primaryKey the primary key of this prioridad grupo usuarios
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the prioridad grupo usuarios ID of this prioridad grupo usuarios.
	 *
	 * @return the prioridad grupo usuarios ID of this prioridad grupo usuarios
	 */
	public long getPrioridadGrupoUsuariosId();

	/**
	 * Sets the prioridad grupo usuarios ID of this prioridad grupo usuarios.
	 *
	 * @param prioridadGrupoUsuariosId the prioridad grupo usuarios ID of this prioridad grupo usuarios
	 */
	public void setPrioridadGrupoUsuariosId(long prioridadGrupoUsuariosId);

	/**
	 * Returns the solicitud evaluacion desempenno ID of this prioridad grupo usuarios.
	 *
	 * @return the solicitud evaluacion desempenno ID of this prioridad grupo usuarios
	 */
	public long getSolicitudEvaluacionDesempennoId();

	/**
	 * Sets the solicitud evaluacion desempenno ID of this prioridad grupo usuarios.
	 *
	 * @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID of this prioridad grupo usuarios
	 */
	public void setSolicitudEvaluacionDesempennoId(
		long solicitudEvaluacionDesempennoId);

	/**
	 * Returns the lider grupo of this prioridad grupo usuarios.
	 *
	 * @return the lider grupo of this prioridad grupo usuarios
	 */
	public long getLiderGrupo();

	/**
	 * Sets the lider grupo of this prioridad grupo usuarios.
	 *
	 * @param liderGrupo the lider grupo of this prioridad grupo usuarios
	 */
	public void setLiderGrupo(long liderGrupo);

	/**
	 * Returns the gerente area of this prioridad grupo usuarios.
	 *
	 * @return the gerente area of this prioridad grupo usuarios
	 */
	public long getGerenteArea();

	/**
	 * Sets the gerente area of this prioridad grupo usuarios.
	 *
	 * @param gerenteArea the gerente area of this prioridad grupo usuarios
	 */
	public void setGerenteArea(long gerenteArea);

	/**
	 * Returns the grupo usuario of this prioridad grupo usuarios.
	 *
	 * @return the grupo usuario of this prioridad grupo usuarios
	 */
	@AutoEscape
	public String getGrupoUsuario();

	/**
	 * Sets the grupo usuario of this prioridad grupo usuarios.
	 *
	 * @param grupoUsuario the grupo usuario of this prioridad grupo usuarios
	 */
	public void setGrupoUsuario(String grupoUsuario);

	/**
	 * Returns the orden of this prioridad grupo usuarios.
	 *
	 * @return the orden of this prioridad grupo usuarios
	 */
	public int getOrden();

	/**
	 * Sets the orden of this prioridad grupo usuarios.
	 *
	 * @param orden the orden of this prioridad grupo usuarios
	 */
	public void setOrden(int orden);

	/**
	 * Returns the activo of this prioridad grupo usuarios.
	 *
	 * @return the activo of this prioridad grupo usuarios
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this prioridad grupo usuarios is activo.
	 *
	 * @return <code>true</code> if this prioridad grupo usuarios is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this prioridad grupo usuarios is activo.
	 *
	 * @param activo the activo of this prioridad grupo usuarios
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this prioridad grupo usuarios.
	 *
	 * @return the usuariocrea of this prioridad grupo usuarios
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this prioridad grupo usuarios.
	 *
	 * @param usuariocrea the usuariocrea of this prioridad grupo usuarios
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this prioridad grupo usuarios.
	 *
	 * @return the fechacrea of this prioridad grupo usuarios
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this prioridad grupo usuarios.
	 *
	 * @param fechacrea the fechacrea of this prioridad grupo usuarios
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this prioridad grupo usuarios.
	 *
	 * @return the usuariomodifica of this prioridad grupo usuarios
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this prioridad grupo usuarios.
	 *
	 * @param usuariomodifica the usuariomodifica of this prioridad grupo usuarios
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechamodifica of this prioridad grupo usuarios.
	 *
	 * @return the fechamodifica of this prioridad grupo usuarios
	 */
	public Date getFechamodifica();

	/**
	 * Sets the fechamodifica of this prioridad grupo usuarios.
	 *
	 * @param fechamodifica the fechamodifica of this prioridad grupo usuarios
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
		com.hitss.layer.model.PrioridadGrupoUsuarios prioridadGrupoUsuarios);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.hitss.layer.model.PrioridadGrupoUsuarios> toCacheModel();

	@Override
	public com.hitss.layer.model.PrioridadGrupoUsuarios toEscapedModel();

	@Override
	public com.hitss.layer.model.PrioridadGrupoUsuarios toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
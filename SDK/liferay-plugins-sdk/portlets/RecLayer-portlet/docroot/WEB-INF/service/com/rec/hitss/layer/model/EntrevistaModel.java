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
 * The base model interface for the Entrevista service. Represents a row in the &quot;Entrevista&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rec.hitss.layer.model.impl.EntrevistaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rec.hitss.layer.model.impl.EntrevistaImpl}.
 * </p>
 *
 * @author Crossfire
 * @see Entrevista
 * @see com.rec.hitss.layer.model.impl.EntrevistaImpl
 * @see com.rec.hitss.layer.model.impl.EntrevistaModelImpl
 * @generated
 */
public interface EntrevistaModel extends BaseModel<Entrevista> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a entrevista model instance should use the {@link Entrevista} interface instead.
	 */

	/**
	 * Returns the primary key of this entrevista.
	 *
	 * @return the primary key of this entrevista
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this entrevista.
	 *
	 * @param primaryKey the primary key of this entrevista
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the entrevista ID of this entrevista.
	 *
	 * @return the entrevista ID of this entrevista
	 */
	public long getEntrevistaId();

	/**
	 * Sets the entrevista ID of this entrevista.
	 *
	 * @param entrevistaId the entrevista ID of this entrevista
	 */
	public void setEntrevistaId(long entrevistaId);

	/**
	 * Returns the usuario hitss ID of this entrevista.
	 *
	 * @return the usuario hitss ID of this entrevista
	 */
	public long getUsuarioHitssId();

	/**
	 * Sets the usuario hitss ID of this entrevista.
	 *
	 * @param usuarioHitssId the usuario hitss ID of this entrevista
	 */
	public void setUsuarioHitssId(long usuarioHitssId);

	/**
	 * Returns the observacion of this entrevista.
	 *
	 * @return the observacion of this entrevista
	 */
	@AutoEscape
	public String getObservacion();

	/**
	 * Sets the observacion of this entrevista.
	 *
	 * @param observacion the observacion of this entrevista
	 */
	public void setObservacion(String observacion);

	/**
	 * Returns the asistio of this entrevista.
	 *
	 * @return the asistio of this entrevista
	 */
	public boolean getAsistio();

	/**
	 * Returns <code>true</code> if this entrevista is asistio.
	 *
	 * @return <code>true</code> if this entrevista is asistio; <code>false</code> otherwise
	 */
	public boolean isAsistio();

	/**
	 * Sets whether this entrevista is asistio.
	 *
	 * @param asistio the asistio of this entrevista
	 */
	public void setAsistio(boolean asistio);

	/**
	 * Returns the activo of this entrevista.
	 *
	 * @return the activo of this entrevista
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this entrevista is activo.
	 *
	 * @return <code>true</code> if this entrevista is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this entrevista is activo.
	 *
	 * @param activo the activo of this entrevista
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this entrevista.
	 *
	 * @return the usuariocrea of this entrevista
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this entrevista.
	 *
	 * @param usuariocrea the usuariocrea of this entrevista
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this entrevista.
	 *
	 * @return the fechacrea of this entrevista
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this entrevista.
	 *
	 * @param fechacrea the fechacrea of this entrevista
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this entrevista.
	 *
	 * @return the usuariomodifica of this entrevista
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this entrevista.
	 *
	 * @param usuariomodifica the usuariomodifica of this entrevista
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechacreamodifica of this entrevista.
	 *
	 * @return the fechacreamodifica of this entrevista
	 */
	public Date getFechacreamodifica();

	/**
	 * Sets the fechacreamodifica of this entrevista.
	 *
	 * @param fechacreamodifica the fechacreamodifica of this entrevista
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
	public int compareTo(com.rec.hitss.layer.model.Entrevista entrevista);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rec.hitss.layer.model.Entrevista> toCacheModel();

	@Override
	public com.rec.hitss.layer.model.Entrevista toEscapedModel();

	@Override
	public com.rec.hitss.layer.model.Entrevista toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
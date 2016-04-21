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
 * The base model interface for the InformeRetroalimentacion service. Represents a row in the &quot;InformeRetroalimentacion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rec.hitss.layer.model.impl.InformeRetroalimentacionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rec.hitss.layer.model.impl.InformeRetroalimentacionImpl}.
 * </p>
 *
 * @author Crossfire
 * @see InformeRetroalimentacion
 * @see com.rec.hitss.layer.model.impl.InformeRetroalimentacionImpl
 * @see com.rec.hitss.layer.model.impl.InformeRetroalimentacionModelImpl
 * @generated
 */
public interface InformeRetroalimentacionModel extends BaseModel<InformeRetroalimentacion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a informe retroalimentacion model instance should use the {@link InformeRetroalimentacion} interface instead.
	 */

	/**
	 * Returns the primary key of this informe retroalimentacion.
	 *
	 * @return the primary key of this informe retroalimentacion
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this informe retroalimentacion.
	 *
	 * @param primaryKey the primary key of this informe retroalimentacion
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the informe retroalimentacion ID of this informe retroalimentacion.
	 *
	 * @return the informe retroalimentacion ID of this informe retroalimentacion
	 */
	public long getInformeRetroalimentacionId();

	/**
	 * Sets the informe retroalimentacion ID of this informe retroalimentacion.
	 *
	 * @param informeRetroalimentacionId the informe retroalimentacion ID of this informe retroalimentacion
	 */
	public void setInformeRetroalimentacionId(long informeRetroalimentacionId);

	/**
	 * Returns the plan accion ID of this informe retroalimentacion.
	 *
	 * @return the plan accion ID of this informe retroalimentacion
	 */
	public long getPlanAccionId();

	/**
	 * Sets the plan accion ID of this informe retroalimentacion.
	 *
	 * @param planAccionId the plan accion ID of this informe retroalimentacion
	 */
	public void setPlanAccionId(long planAccionId);

	/**
	 * Returns the responsable of this informe retroalimentacion.
	 *
	 * @return the responsable of this informe retroalimentacion
	 */
	@AutoEscape
	public String getResponsable();

	/**
	 * Sets the responsable of this informe retroalimentacion.
	 *
	 * @param responsable the responsable of this informe retroalimentacion
	 */
	public void setResponsable(String responsable);

	/**
	 * Returns the fecha emision of this informe retroalimentacion.
	 *
	 * @return the fecha emision of this informe retroalimentacion
	 */
	@AutoEscape
	public String getFechaEmision();

	/**
	 * Sets the fecha emision of this informe retroalimentacion.
	 *
	 * @param fechaEmision the fecha emision of this informe retroalimentacion
	 */
	public void setFechaEmision(String fechaEmision);

	/**
	 * Returns the titulo of this informe retroalimentacion.
	 *
	 * @return the titulo of this informe retroalimentacion
	 */
	@AutoEscape
	public String getTitulo();

	/**
	 * Sets the titulo of this informe retroalimentacion.
	 *
	 * @param titulo the titulo of this informe retroalimentacion
	 */
	public void setTitulo(String titulo);

	/**
	 * Returns the integrante of this informe retroalimentacion.
	 *
	 * @return the integrante of this informe retroalimentacion
	 */
	@AutoEscape
	public String getIntegrante();

	/**
	 * Sets the integrante of this informe retroalimentacion.
	 *
	 * @param integrante the integrante of this informe retroalimentacion
	 */
	public void setIntegrante(String integrante);

	/**
	 * Returns the descripcion of this informe retroalimentacion.
	 *
	 * @return the descripcion of this informe retroalimentacion
	 */
	@AutoEscape
	public String getDescripcion();

	/**
	 * Sets the descripcion of this informe retroalimentacion.
	 *
	 * @param descripcion the descripcion of this informe retroalimentacion
	 */
	public void setDescripcion(String descripcion);

	/**
	 * Returns the activo of this informe retroalimentacion.
	 *
	 * @return the activo of this informe retroalimentacion
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this informe retroalimentacion is activo.
	 *
	 * @return <code>true</code> if this informe retroalimentacion is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this informe retroalimentacion is activo.
	 *
	 * @param activo the activo of this informe retroalimentacion
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this informe retroalimentacion.
	 *
	 * @return the usuariocrea of this informe retroalimentacion
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this informe retroalimentacion.
	 *
	 * @param usuariocrea the usuariocrea of this informe retroalimentacion
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this informe retroalimentacion.
	 *
	 * @return the fechacrea of this informe retroalimentacion
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this informe retroalimentacion.
	 *
	 * @param fechacrea the fechacrea of this informe retroalimentacion
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this informe retroalimentacion.
	 *
	 * @return the usuariomodifica of this informe retroalimentacion
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this informe retroalimentacion.
	 *
	 * @param usuariomodifica the usuariomodifica of this informe retroalimentacion
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechacreamodifica of this informe retroalimentacion.
	 *
	 * @return the fechacreamodifica of this informe retroalimentacion
	 */
	public Date getFechacreamodifica();

	/**
	 * Sets the fechacreamodifica of this informe retroalimentacion.
	 *
	 * @param fechacreamodifica the fechacreamodifica of this informe retroalimentacion
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
		com.rec.hitss.layer.model.InformeRetroalimentacion informeRetroalimentacion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rec.hitss.layer.model.InformeRetroalimentacion> toCacheModel();

	@Override
	public com.rec.hitss.layer.model.InformeRetroalimentacion toEscapedModel();

	@Override
	public com.rec.hitss.layer.model.InformeRetroalimentacion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
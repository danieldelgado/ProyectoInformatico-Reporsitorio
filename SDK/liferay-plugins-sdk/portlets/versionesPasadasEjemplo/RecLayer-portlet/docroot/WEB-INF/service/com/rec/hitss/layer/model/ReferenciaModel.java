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

import com.rec.hitss.layer.service.persistence.ReferenciaPK;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Referencia service. Represents a row in the &quot;Referencia&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rec.hitss.layer.model.impl.ReferenciaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rec.hitss.layer.model.impl.ReferenciaImpl}.
 * </p>
 *
 * @author Crossfire
 * @see Referencia
 * @see com.rec.hitss.layer.model.impl.ReferenciaImpl
 * @see com.rec.hitss.layer.model.impl.ReferenciaModelImpl
 * @generated
 */
public interface ReferenciaModel extends BaseModel<Referencia> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a referencia model instance should use the {@link Referencia} interface instead.
	 */

	/**
	 * Returns the primary key of this referencia.
	 *
	 * @return the primary key of this referencia
	 */
	public ReferenciaPK getPrimaryKey();

	/**
	 * Sets the primary key of this referencia.
	 *
	 * @param primaryKey the primary key of this referencia
	 */
	public void setPrimaryKey(ReferenciaPK primaryKey);

	/**
	 * Returns the referencia ID of this referencia.
	 *
	 * @return the referencia ID of this referencia
	 */
	public long getReferenciaId();

	/**
	 * Sets the referencia ID of this referencia.
	 *
	 * @param referenciaId the referencia ID of this referencia
	 */
	public void setReferenciaId(long referenciaId);

	/**
	 * Returns the usuario ID of this referencia.
	 *
	 * @return the usuario ID of this referencia
	 */
	public long getUsuarioId();

	/**
	 * Sets the usuario ID of this referencia.
	 *
	 * @param usuarioId the usuario ID of this referencia
	 */
	public void setUsuarioId(long usuarioId);

	/**
	 * Returns the empresa of this referencia.
	 *
	 * @return the empresa of this referencia
	 */
	@AutoEscape
	public String getEmpresa();

	/**
	 * Sets the empresa of this referencia.
	 *
	 * @param empresa the empresa of this referencia
	 */
	public void setEmpresa(String empresa);

	/**
	 * Returns the telefono of this referencia.
	 *
	 * @return the telefono of this referencia
	 */
	@AutoEscape
	public String getTelefono();

	/**
	 * Sets the telefono of this referencia.
	 *
	 * @param telefono the telefono of this referencia
	 */
	public void setTelefono(String telefono);

	/**
	 * Returns the responsable of this referencia.
	 *
	 * @return the responsable of this referencia
	 */
	@AutoEscape
	public String getResponsable();

	/**
	 * Sets the responsable of this referencia.
	 *
	 * @param responsable the responsable of this referencia
	 */
	public void setResponsable(String responsable);

	/**
	 * Returns the motivo of this referencia.
	 *
	 * @return the motivo of this referencia
	 */
	@AutoEscape
	public String getMotivo();

	/**
	 * Sets the motivo of this referencia.
	 *
	 * @param motivo the motivo of this referencia
	 */
	public void setMotivo(String motivo);

	/**
	 * Returns the activo of this referencia.
	 *
	 * @return the activo of this referencia
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this referencia is activo.
	 *
	 * @return <code>true</code> if this referencia is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this referencia is activo.
	 *
	 * @param activo the activo of this referencia
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this referencia.
	 *
	 * @return the usuariocrea of this referencia
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this referencia.
	 *
	 * @param usuariocrea the usuariocrea of this referencia
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this referencia.
	 *
	 * @return the fechacrea of this referencia
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this referencia.
	 *
	 * @param fechacrea the fechacrea of this referencia
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this referencia.
	 *
	 * @return the usuariomodifica of this referencia
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this referencia.
	 *
	 * @param usuariomodifica the usuariomodifica of this referencia
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechacreamodifica of this referencia.
	 *
	 * @return the fechacreamodifica of this referencia
	 */
	public Date getFechacreamodifica();

	/**
	 * Sets the fechacreamodifica of this referencia.
	 *
	 * @param fechacreamodifica the fechacreamodifica of this referencia
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
	public int compareTo(com.rec.hitss.layer.model.Referencia referencia);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rec.hitss.layer.model.Referencia> toCacheModel();

	@Override
	public com.rec.hitss.layer.model.Referencia toEscapedModel();

	@Override
	public com.rec.hitss.layer.model.Referencia toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
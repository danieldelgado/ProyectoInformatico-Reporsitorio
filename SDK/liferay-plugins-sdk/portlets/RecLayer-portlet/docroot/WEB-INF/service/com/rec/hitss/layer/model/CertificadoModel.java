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
 * The base model interface for the Certificado service. Represents a row in the &quot;Certificado&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rec.hitss.layer.model.impl.CertificadoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rec.hitss.layer.model.impl.CertificadoImpl}.
 * </p>
 *
 * @author Crossfire
 * @see Certificado
 * @see com.rec.hitss.layer.model.impl.CertificadoImpl
 * @see com.rec.hitss.layer.model.impl.CertificadoModelImpl
 * @generated
 */
public interface CertificadoModel extends BaseModel<Certificado> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a certificado model instance should use the {@link Certificado} interface instead.
	 */

	/**
	 * Returns the primary key of this certificado.
	 *
	 * @return the primary key of this certificado
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this certificado.
	 *
	 * @param primaryKey the primary key of this certificado
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the certificado ID of this certificado.
	 *
	 * @return the certificado ID of this certificado
	 */
	public long getCertificadoId();

	/**
	 * Sets the certificado ID of this certificado.
	 *
	 * @param certificadoId the certificado ID of this certificado
	 */
	public void setCertificadoId(long certificadoId);

	/**
	 * Returns the descripcion of this certificado.
	 *
	 * @return the descripcion of this certificado
	 */
	@AutoEscape
	public String getDescripcion();

	/**
	 * Sets the descripcion of this certificado.
	 *
	 * @param descripcion the descripcion of this certificado
	 */
	public void setDescripcion(String descripcion);

	/**
	 * Returns the empresa of this certificado.
	 *
	 * @return the empresa of this certificado
	 */
	@AutoEscape
	public String getEmpresa();

	/**
	 * Sets the empresa of this certificado.
	 *
	 * @param empresa the empresa of this certificado
	 */
	public void setEmpresa(String empresa);

	/**
	 * Returns the cargo of this certificado.
	 *
	 * @return the cargo of this certificado
	 */
	@AutoEscape
	public String getCargo();

	/**
	 * Sets the cargo of this certificado.
	 *
	 * @param cargo the cargo of this certificado
	 */
	public void setCargo(String cargo);

	/**
	 * Returns the usuario hitss ID of this certificado.
	 *
	 * @return the usuario hitss ID of this certificado
	 */
	public long getUsuarioHitssId();

	/**
	 * Sets the usuario hitss ID of this certificado.
	 *
	 * @param usuarioHitssId the usuario hitss ID of this certificado
	 */
	public void setUsuarioHitssId(long usuarioHitssId);

	/**
	 * Returns the activo of this certificado.
	 *
	 * @return the activo of this certificado
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this certificado is activo.
	 *
	 * @return <code>true</code> if this certificado is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this certificado is activo.
	 *
	 * @param activo the activo of this certificado
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this certificado.
	 *
	 * @return the usuariocrea of this certificado
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this certificado.
	 *
	 * @param usuariocrea the usuariocrea of this certificado
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this certificado.
	 *
	 * @return the fechacrea of this certificado
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this certificado.
	 *
	 * @param fechacrea the fechacrea of this certificado
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this certificado.
	 *
	 * @return the usuariomodifica of this certificado
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this certificado.
	 *
	 * @param usuariomodifica the usuariomodifica of this certificado
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechacreamodifica of this certificado.
	 *
	 * @return the fechacreamodifica of this certificado
	 */
	public Date getFechacreamodifica();

	/**
	 * Sets the fechacreamodifica of this certificado.
	 *
	 * @param fechacreamodifica the fechacreamodifica of this certificado
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
	public int compareTo(com.rec.hitss.layer.model.Certificado certificado);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rec.hitss.layer.model.Certificado> toCacheModel();

	@Override
	public com.rec.hitss.layer.model.Certificado toEscapedModel();

	@Override
	public com.rec.hitss.layer.model.Certificado toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
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
 * The base model interface for the Contrato service. Represents a row in the &quot;CONTRATO&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rec.hitss.layer.model.impl.ContratoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rec.hitss.layer.model.impl.ContratoImpl}.
 * </p>
 *
 * @author Crossfire
 * @see Contrato
 * @see com.rec.hitss.layer.model.impl.ContratoImpl
 * @see com.rec.hitss.layer.model.impl.ContratoModelImpl
 * @generated
 */
public interface ContratoModel extends BaseModel<Contrato> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a contrato model instance should use the {@link Contrato} interface instead.
	 */

	/**
	 * Returns the primary key of this contrato.
	 *
	 * @return the primary key of this contrato
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this contrato.
	 *
	 * @param primaryKey the primary key of this contrato
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the c t_ i d of this contrato.
	 *
	 * @return the c t_ i d of this contrato
	 */
	public long getCT_ID();

	/**
	 * Sets the c t_ i d of this contrato.
	 *
	 * @param CT_ID the c t_ i d of this contrato
	 */
	public void setCT_ID(long CT_ID);

	/**
	 * Returns the c t_ e s t a d o of this contrato.
	 *
	 * @return the c t_ e s t a d o of this contrato
	 */
	@AutoEscape
	public String getCT_ESTADO();

	/**
	 * Sets the c t_ e s t a d o of this contrato.
	 *
	 * @param CT_ESTADO the c t_ e s t a d o of this contrato
	 */
	public void setCT_ESTADO(String CT_ESTADO);

	/**
	 * Returns the c t_ a c t i v o of this contrato.
	 *
	 * @return the c t_ a c t i v o of this contrato
	 */
	@AutoEscape
	public String getCT_ACTIVO();

	/**
	 * Sets the c t_ a c t i v o of this contrato.
	 *
	 * @param CT_ACTIVO the c t_ a c t i v o of this contrato
	 */
	public void setCT_ACTIVO(String CT_ACTIVO);

	/**
	 * Returns the c t_ u s u a r i o_ c r e a of this contrato.
	 *
	 * @return the c t_ u s u a r i o_ c r e a of this contrato
	 */
	public long getCT_USUARIO_CREA();

	/**
	 * Sets the c t_ u s u a r i o_ c r e a of this contrato.
	 *
	 * @param CT_USUARIO_CREA the c t_ u s u a r i o_ c r e a of this contrato
	 */
	public void setCT_USUARIO_CREA(long CT_USUARIO_CREA);

	/**
	 * Returns the c t_ f e c h a_ c r e a of this contrato.
	 *
	 * @return the c t_ f e c h a_ c r e a of this contrato
	 */
	public Date getCT_FECHA_CREA();

	/**
	 * Sets the c t_ f e c h a_ c r e a of this contrato.
	 *
	 * @param CT_FECHA_CREA the c t_ f e c h a_ c r e a of this contrato
	 */
	public void setCT_FECHA_CREA(Date CT_FECHA_CREA);

	/**
	 * Returns the c t_ u s u a r i o_ m o d i f i c a of this contrato.
	 *
	 * @return the c t_ u s u a r i o_ m o d i f i c a of this contrato
	 */
	public long getCT_USUARIO_MODIFICA();

	/**
	 * Sets the c t_ u s u a r i o_ m o d i f i c a of this contrato.
	 *
	 * @param CT_USUARIO_MODIFICA the c t_ u s u a r i o_ m o d i f i c a of this contrato
	 */
	public void setCT_USUARIO_MODIFICA(long CT_USUARIO_MODIFICA);

	/**
	 * Returns the c t_ f e c h a_ m o d i f i c a of this contrato.
	 *
	 * @return the c t_ f e c h a_ m o d i f i c a of this contrato
	 */
	public Date getCT_FECHA_MODIFICA();

	/**
	 * Sets the c t_ f e c h a_ m o d i f i c a of this contrato.
	 *
	 * @param CT_FECHA_MODIFICA the c t_ f e c h a_ m o d i f i c a of this contrato
	 */
	public void setCT_FECHA_MODIFICA(Date CT_FECHA_MODIFICA);

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
	public int compareTo(com.rec.hitss.layer.model.Contrato contrato);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rec.hitss.layer.model.Contrato> toCacheModel();

	@Override
	public com.rec.hitss.layer.model.Contrato toEscapedModel();

	@Override
	public com.rec.hitss.layer.model.Contrato toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
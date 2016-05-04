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
 * The base model interface for the fichaIngreso service. Represents a row in the &quot;FICHA_INGRESO&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rec.hitss.layer.model.impl.fichaIngresoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rec.hitss.layer.model.impl.fichaIngresoImpl}.
 * </p>
 *
 * @author Crossfire
 * @see fichaIngreso
 * @see com.rec.hitss.layer.model.impl.fichaIngresoImpl
 * @see com.rec.hitss.layer.model.impl.fichaIngresoModelImpl
 * @generated
 */
public interface fichaIngresoModel extends BaseModel<fichaIngreso> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ficha ingreso model instance should use the {@link fichaIngreso} interface instead.
	 */

	/**
	 * Returns the primary key of this ficha ingreso.
	 *
	 * @return the primary key of this ficha ingreso
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ficha ingreso.
	 *
	 * @param primaryKey the primary key of this ficha ingreso
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the f i_ i d of this ficha ingreso.
	 *
	 * @return the f i_ i d of this ficha ingreso
	 */
	public long getFI_ID();

	/**
	 * Sets the f i_ i d of this ficha ingreso.
	 *
	 * @param FI_ID the f i_ i d of this ficha ingreso
	 */
	public void setFI_ID(long FI_ID);

	/**
	 * Returns the f i_ e s t a d o of this ficha ingreso.
	 *
	 * @return the f i_ e s t a d o of this ficha ingreso
	 */
	@AutoEscape
	public String getFI_ESTADO();

	/**
	 * Sets the f i_ e s t a d o of this ficha ingreso.
	 *
	 * @param FI_ESTADO the f i_ e s t a d o of this ficha ingreso
	 */
	public void setFI_ESTADO(String FI_ESTADO);

	/**
	 * Returns the f i_ a c t i v o of this ficha ingreso.
	 *
	 * @return the f i_ a c t i v o of this ficha ingreso
	 */
	@AutoEscape
	public String getFI_ACTIVO();

	/**
	 * Sets the f i_ a c t i v o of this ficha ingreso.
	 *
	 * @param FI_ACTIVO the f i_ a c t i v o of this ficha ingreso
	 */
	public void setFI_ACTIVO(String FI_ACTIVO);

	/**
	 * Returns the f i_ u s u a r i o_ c r e a of this ficha ingreso.
	 *
	 * @return the f i_ u s u a r i o_ c r e a of this ficha ingreso
	 */
	public long getFI_USUARIO_CREA();

	/**
	 * Sets the f i_ u s u a r i o_ c r e a of this ficha ingreso.
	 *
	 * @param FI_USUARIO_CREA the f i_ u s u a r i o_ c r e a of this ficha ingreso
	 */
	public void setFI_USUARIO_CREA(long FI_USUARIO_CREA);

	/**
	 * Returns the f i_ f e c h a_ c r e a of this ficha ingreso.
	 *
	 * @return the f i_ f e c h a_ c r e a of this ficha ingreso
	 */
	public Date getFI_FECHA_CREA();

	/**
	 * Sets the f i_ f e c h a_ c r e a of this ficha ingreso.
	 *
	 * @param FI_FECHA_CREA the f i_ f e c h a_ c r e a of this ficha ingreso
	 */
	public void setFI_FECHA_CREA(Date FI_FECHA_CREA);

	/**
	 * Returns the f i_ u s u a r i o_ m o d i f i c a of this ficha ingreso.
	 *
	 * @return the f i_ u s u a r i o_ m o d i f i c a of this ficha ingreso
	 */
	public long getFI_USUARIO_MODIFICA();

	/**
	 * Sets the f i_ u s u a r i o_ m o d i f i c a of this ficha ingreso.
	 *
	 * @param FI_USUARIO_MODIFICA the f i_ u s u a r i o_ m o d i f i c a of this ficha ingreso
	 */
	public void setFI_USUARIO_MODIFICA(long FI_USUARIO_MODIFICA);

	/**
	 * Returns the f i_ f e c h a_ m o d i f i c a of this ficha ingreso.
	 *
	 * @return the f i_ f e c h a_ m o d i f i c a of this ficha ingreso
	 */
	public Date getFI_FECHA_MODIFICA();

	/**
	 * Sets the f i_ f e c h a_ m o d i f i c a of this ficha ingreso.
	 *
	 * @param FI_FECHA_MODIFICA the f i_ f e c h a_ m o d i f i c a of this ficha ingreso
	 */
	public void setFI_FECHA_MODIFICA(Date FI_FECHA_MODIFICA);

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
	public int compareTo(com.rec.hitss.layer.model.fichaIngreso fichaIngreso);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rec.hitss.layer.model.fichaIngreso> toCacheModel();

	@Override
	public com.rec.hitss.layer.model.fichaIngreso toEscapedModel();

	@Override
	public com.rec.hitss.layer.model.fichaIngreso toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
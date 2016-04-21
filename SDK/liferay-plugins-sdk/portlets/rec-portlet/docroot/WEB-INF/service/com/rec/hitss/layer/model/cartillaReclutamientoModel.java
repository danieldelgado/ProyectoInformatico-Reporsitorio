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
 * The base model interface for the cartillaReclutamiento service. Represents a row in the &quot;cartilla_reclutamiento&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rec.hitss.layer.model.impl.cartillaReclutamientoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rec.hitss.layer.model.impl.cartillaReclutamientoImpl}.
 * </p>
 *
 * @author Crossfire
 * @see cartillaReclutamiento
 * @see com.rec.hitss.layer.model.impl.cartillaReclutamientoImpl
 * @see com.rec.hitss.layer.model.impl.cartillaReclutamientoModelImpl
 * @generated
 */
public interface cartillaReclutamientoModel extends BaseModel<cartillaReclutamiento> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cartilla reclutamiento model instance should use the {@link cartillaReclutamiento} interface instead.
	 */

	/**
	 * Returns the primary key of this cartilla reclutamiento.
	 *
	 * @return the primary key of this cartilla reclutamiento
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cartilla reclutamiento.
	 *
	 * @param primaryKey the primary key of this cartilla reclutamiento
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the c r_ i d of this cartilla reclutamiento.
	 *
	 * @return the c r_ i d of this cartilla reclutamiento
	 */
	public long getCR_ID();

	/**
	 * Sets the c r_ i d of this cartilla reclutamiento.
	 *
	 * @param CR_ID the c r_ i d of this cartilla reclutamiento
	 */
	public void setCR_ID(long CR_ID);

	/**
	 * Returns the c r_ e s t a d o of this cartilla reclutamiento.
	 *
	 * @return the c r_ e s t a d o of this cartilla reclutamiento
	 */
	@AutoEscape
	public String getCR_ESTADO();

	/**
	 * Sets the c r_ e s t a d o of this cartilla reclutamiento.
	 *
	 * @param CR_ESTADO the c r_ e s t a d o of this cartilla reclutamiento
	 */
	public void setCR_ESTADO(String CR_ESTADO);

	/**
	 * Returns the c r_ a c t i v o of this cartilla reclutamiento.
	 *
	 * @return the c r_ a c t i v o of this cartilla reclutamiento
	 */
	@AutoEscape
	public String getCR_ACTIVO();

	/**
	 * Sets the c r_ a c t i v o of this cartilla reclutamiento.
	 *
	 * @param CR_ACTIVO the c r_ a c t i v o of this cartilla reclutamiento
	 */
	public void setCR_ACTIVO(String CR_ACTIVO);

	/**
	 * Returns the c r_ u s u a r i o_ c r e a of this cartilla reclutamiento.
	 *
	 * @return the c r_ u s u a r i o_ c r e a of this cartilla reclutamiento
	 */
	public long getCR_USUARIO_CREA();

	/**
	 * Sets the c r_ u s u a r i o_ c r e a of this cartilla reclutamiento.
	 *
	 * @param CR_USUARIO_CREA the c r_ u s u a r i o_ c r e a of this cartilla reclutamiento
	 */
	public void setCR_USUARIO_CREA(long CR_USUARIO_CREA);

	/**
	 * Returns the c r_ f e c h a_ c r e a of this cartilla reclutamiento.
	 *
	 * @return the c r_ f e c h a_ c r e a of this cartilla reclutamiento
	 */
	public Date getCR_FECHA_CREA();

	/**
	 * Sets the c r_ f e c h a_ c r e a of this cartilla reclutamiento.
	 *
	 * @param CR_FECHA_CREA the c r_ f e c h a_ c r e a of this cartilla reclutamiento
	 */
	public void setCR_FECHA_CREA(Date CR_FECHA_CREA);

	/**
	 * Returns the c r_ u s u a r i o_ m o d i f i c a of this cartilla reclutamiento.
	 *
	 * @return the c r_ u s u a r i o_ m o d i f i c a of this cartilla reclutamiento
	 */
	public long getCR_USUARIO_MODIFICA();

	/**
	 * Sets the c r_ u s u a r i o_ m o d i f i c a of this cartilla reclutamiento.
	 *
	 * @param CR_USUARIO_MODIFICA the c r_ u s u a r i o_ m o d i f i c a of this cartilla reclutamiento
	 */
	public void setCR_USUARIO_MODIFICA(long CR_USUARIO_MODIFICA);

	/**
	 * Returns the c r_ f e c h a_ m o d i f i c a of this cartilla reclutamiento.
	 *
	 * @return the c r_ f e c h a_ m o d i f i c a of this cartilla reclutamiento
	 */
	public Date getCR_FECHA_MODIFICA();

	/**
	 * Sets the c r_ f e c h a_ m o d i f i c a of this cartilla reclutamiento.
	 *
	 * @param CR_FECHA_MODIFICA the c r_ f e c h a_ m o d i f i c a of this cartilla reclutamiento
	 */
	public void setCR_FECHA_MODIFICA(Date CR_FECHA_MODIFICA);

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
		com.rec.hitss.layer.model.cartillaReclutamiento cartillaReclutamiento);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rec.hitss.layer.model.cartillaReclutamiento> toCacheModel();

	@Override
	public com.rec.hitss.layer.model.cartillaReclutamiento toEscapedModel();

	@Override
	public com.rec.hitss.layer.model.cartillaReclutamiento toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link cartillaReclutamiento}.
 * </p>
 *
 * @author Crossfire
 * @see cartillaReclutamiento
 * @generated
 */
public class cartillaReclutamientoWrapper implements cartillaReclutamiento,
	ModelWrapper<cartillaReclutamiento> {
	public cartillaReclutamientoWrapper(
		cartillaReclutamiento cartillaReclutamiento) {
		_cartillaReclutamiento = cartillaReclutamiento;
	}

	@Override
	public Class<?> getModelClass() {
		return cartillaReclutamiento.class;
	}

	@Override
	public String getModelClassName() {
		return cartillaReclutamiento.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CR_ID", getCR_ID());
		attributes.put("CR_ESTADO", getCR_ESTADO());
		attributes.put("CR_ACTIVO", getCR_ACTIVO());
		attributes.put("CR_USUARIO_CREA", getCR_USUARIO_CREA());
		attributes.put("CR_FECHA_CREA", getCR_FECHA_CREA());
		attributes.put("CR_USUARIO_MODIFICA", getCR_USUARIO_MODIFICA());
		attributes.put("CR_FECHA_MODIFICA", getCR_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long CR_ID = (Long)attributes.get("CR_ID");

		if (CR_ID != null) {
			setCR_ID(CR_ID);
		}

		String CR_ESTADO = (String)attributes.get("CR_ESTADO");

		if (CR_ESTADO != null) {
			setCR_ESTADO(CR_ESTADO);
		}

		String CR_ACTIVO = (String)attributes.get("CR_ACTIVO");

		if (CR_ACTIVO != null) {
			setCR_ACTIVO(CR_ACTIVO);
		}

		Long CR_USUARIO_CREA = (Long)attributes.get("CR_USUARIO_CREA");

		if (CR_USUARIO_CREA != null) {
			setCR_USUARIO_CREA(CR_USUARIO_CREA);
		}

		Date CR_FECHA_CREA = (Date)attributes.get("CR_FECHA_CREA");

		if (CR_FECHA_CREA != null) {
			setCR_FECHA_CREA(CR_FECHA_CREA);
		}

		Long CR_USUARIO_MODIFICA = (Long)attributes.get("CR_USUARIO_MODIFICA");

		if (CR_USUARIO_MODIFICA != null) {
			setCR_USUARIO_MODIFICA(CR_USUARIO_MODIFICA);
		}

		Date CR_FECHA_MODIFICA = (Date)attributes.get("CR_FECHA_MODIFICA");

		if (CR_FECHA_MODIFICA != null) {
			setCR_FECHA_MODIFICA(CR_FECHA_MODIFICA);
		}
	}

	/**
	* Returns the primary key of this cartilla reclutamiento.
	*
	* @return the primary key of this cartilla reclutamiento
	*/
	@Override
	public long getPrimaryKey() {
		return _cartillaReclutamiento.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cartilla reclutamiento.
	*
	* @param primaryKey the primary key of this cartilla reclutamiento
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cartillaReclutamiento.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the c r_ i d of this cartilla reclutamiento.
	*
	* @return the c r_ i d of this cartilla reclutamiento
	*/
	@Override
	public long getCR_ID() {
		return _cartillaReclutamiento.getCR_ID();
	}

	/**
	* Sets the c r_ i d of this cartilla reclutamiento.
	*
	* @param CR_ID the c r_ i d of this cartilla reclutamiento
	*/
	@Override
	public void setCR_ID(long CR_ID) {
		_cartillaReclutamiento.setCR_ID(CR_ID);
	}

	/**
	* Returns the c r_ e s t a d o of this cartilla reclutamiento.
	*
	* @return the c r_ e s t a d o of this cartilla reclutamiento
	*/
	@Override
	public java.lang.String getCR_ESTADO() {
		return _cartillaReclutamiento.getCR_ESTADO();
	}

	/**
	* Sets the c r_ e s t a d o of this cartilla reclutamiento.
	*
	* @param CR_ESTADO the c r_ e s t a d o of this cartilla reclutamiento
	*/
	@Override
	public void setCR_ESTADO(java.lang.String CR_ESTADO) {
		_cartillaReclutamiento.setCR_ESTADO(CR_ESTADO);
	}

	/**
	* Returns the c r_ a c t i v o of this cartilla reclutamiento.
	*
	* @return the c r_ a c t i v o of this cartilla reclutamiento
	*/
	@Override
	public java.lang.String getCR_ACTIVO() {
		return _cartillaReclutamiento.getCR_ACTIVO();
	}

	/**
	* Sets the c r_ a c t i v o of this cartilla reclutamiento.
	*
	* @param CR_ACTIVO the c r_ a c t i v o of this cartilla reclutamiento
	*/
	@Override
	public void setCR_ACTIVO(java.lang.String CR_ACTIVO) {
		_cartillaReclutamiento.setCR_ACTIVO(CR_ACTIVO);
	}

	/**
	* Returns the c r_ u s u a r i o_ c r e a of this cartilla reclutamiento.
	*
	* @return the c r_ u s u a r i o_ c r e a of this cartilla reclutamiento
	*/
	@Override
	public long getCR_USUARIO_CREA() {
		return _cartillaReclutamiento.getCR_USUARIO_CREA();
	}

	/**
	* Sets the c r_ u s u a r i o_ c r e a of this cartilla reclutamiento.
	*
	* @param CR_USUARIO_CREA the c r_ u s u a r i o_ c r e a of this cartilla reclutamiento
	*/
	@Override
	public void setCR_USUARIO_CREA(long CR_USUARIO_CREA) {
		_cartillaReclutamiento.setCR_USUARIO_CREA(CR_USUARIO_CREA);
	}

	/**
	* Returns the c r_ f e c h a_ c r e a of this cartilla reclutamiento.
	*
	* @return the c r_ f e c h a_ c r e a of this cartilla reclutamiento
	*/
	@Override
	public java.util.Date getCR_FECHA_CREA() {
		return _cartillaReclutamiento.getCR_FECHA_CREA();
	}

	/**
	* Sets the c r_ f e c h a_ c r e a of this cartilla reclutamiento.
	*
	* @param CR_FECHA_CREA the c r_ f e c h a_ c r e a of this cartilla reclutamiento
	*/
	@Override
	public void setCR_FECHA_CREA(java.util.Date CR_FECHA_CREA) {
		_cartillaReclutamiento.setCR_FECHA_CREA(CR_FECHA_CREA);
	}

	/**
	* Returns the c r_ u s u a r i o_ m o d i f i c a of this cartilla reclutamiento.
	*
	* @return the c r_ u s u a r i o_ m o d i f i c a of this cartilla reclutamiento
	*/
	@Override
	public long getCR_USUARIO_MODIFICA() {
		return _cartillaReclutamiento.getCR_USUARIO_MODIFICA();
	}

	/**
	* Sets the c r_ u s u a r i o_ m o d i f i c a of this cartilla reclutamiento.
	*
	* @param CR_USUARIO_MODIFICA the c r_ u s u a r i o_ m o d i f i c a of this cartilla reclutamiento
	*/
	@Override
	public void setCR_USUARIO_MODIFICA(long CR_USUARIO_MODIFICA) {
		_cartillaReclutamiento.setCR_USUARIO_MODIFICA(CR_USUARIO_MODIFICA);
	}

	/**
	* Returns the c r_ f e c h a_ m o d i f i c a of this cartilla reclutamiento.
	*
	* @return the c r_ f e c h a_ m o d i f i c a of this cartilla reclutamiento
	*/
	@Override
	public java.util.Date getCR_FECHA_MODIFICA() {
		return _cartillaReclutamiento.getCR_FECHA_MODIFICA();
	}

	/**
	* Sets the c r_ f e c h a_ m o d i f i c a of this cartilla reclutamiento.
	*
	* @param CR_FECHA_MODIFICA the c r_ f e c h a_ m o d i f i c a of this cartilla reclutamiento
	*/
	@Override
	public void setCR_FECHA_MODIFICA(java.util.Date CR_FECHA_MODIFICA) {
		_cartillaReclutamiento.setCR_FECHA_MODIFICA(CR_FECHA_MODIFICA);
	}

	@Override
	public boolean isNew() {
		return _cartillaReclutamiento.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_cartillaReclutamiento.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _cartillaReclutamiento.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cartillaReclutamiento.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _cartillaReclutamiento.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _cartillaReclutamiento.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_cartillaReclutamiento.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _cartillaReclutamiento.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_cartillaReclutamiento.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_cartillaReclutamiento.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_cartillaReclutamiento.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new cartillaReclutamientoWrapper((cartillaReclutamiento)_cartillaReclutamiento.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.cartillaReclutamiento cartillaReclutamiento) {
		return _cartillaReclutamiento.compareTo(cartillaReclutamiento);
	}

	@Override
	public int hashCode() {
		return _cartillaReclutamiento.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.cartillaReclutamiento> toCacheModel() {
		return _cartillaReclutamiento.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.cartillaReclutamiento toEscapedModel() {
		return new cartillaReclutamientoWrapper(_cartillaReclutamiento.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.cartillaReclutamiento toUnescapedModel() {
		return new cartillaReclutamientoWrapper(_cartillaReclutamiento.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _cartillaReclutamiento.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cartillaReclutamiento.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_cartillaReclutamiento.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof cartillaReclutamientoWrapper)) {
			return false;
		}

		cartillaReclutamientoWrapper cartillaReclutamientoWrapper = (cartillaReclutamientoWrapper)obj;

		if (Validator.equals(_cartillaReclutamiento,
					cartillaReclutamientoWrapper._cartillaReclutamiento)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public cartillaReclutamiento getWrappedcartillaReclutamiento() {
		return _cartillaReclutamiento;
	}

	@Override
	public cartillaReclutamiento getWrappedModel() {
		return _cartillaReclutamiento;
	}

	@Override
	public void resetOriginalValues() {
		_cartillaReclutamiento.resetOriginalValues();
	}

	private cartillaReclutamiento _cartillaReclutamiento;
}
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
 * This class is a wrapper for {@link fichaIngreso}.
 * </p>
 *
 * @author Crossfire
 * @see fichaIngreso
 * @generated
 */
public class fichaIngresoWrapper implements fichaIngreso,
	ModelWrapper<fichaIngreso> {
	public fichaIngresoWrapper(fichaIngreso fichaIngreso) {
		_fichaIngreso = fichaIngreso;
	}

	@Override
	public Class<?> getModelClass() {
		return fichaIngreso.class;
	}

	@Override
	public String getModelClassName() {
		return fichaIngreso.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("FI_ID", getFI_ID());
		attributes.put("FI_ESTADO", getFI_ESTADO());
		attributes.put("FI_ACTIVO", getFI_ACTIVO());
		attributes.put("FI_USUARIO_CREA", getFI_USUARIO_CREA());
		attributes.put("FI_FECHA_CREA", getFI_FECHA_CREA());
		attributes.put("FI_USUARIO_MODIFICA", getFI_USUARIO_MODIFICA());
		attributes.put("FI_FECHA_MODIFICA", getFI_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long FI_ID = (Long)attributes.get("FI_ID");

		if (FI_ID != null) {
			setFI_ID(FI_ID);
		}

		String FI_ESTADO = (String)attributes.get("FI_ESTADO");

		if (FI_ESTADO != null) {
			setFI_ESTADO(FI_ESTADO);
		}

		String FI_ACTIVO = (String)attributes.get("FI_ACTIVO");

		if (FI_ACTIVO != null) {
			setFI_ACTIVO(FI_ACTIVO);
		}

		Long FI_USUARIO_CREA = (Long)attributes.get("FI_USUARIO_CREA");

		if (FI_USUARIO_CREA != null) {
			setFI_USUARIO_CREA(FI_USUARIO_CREA);
		}

		Date FI_FECHA_CREA = (Date)attributes.get("FI_FECHA_CREA");

		if (FI_FECHA_CREA != null) {
			setFI_FECHA_CREA(FI_FECHA_CREA);
		}

		Long FI_USUARIO_MODIFICA = (Long)attributes.get("FI_USUARIO_MODIFICA");

		if (FI_USUARIO_MODIFICA != null) {
			setFI_USUARIO_MODIFICA(FI_USUARIO_MODIFICA);
		}

		Date FI_FECHA_MODIFICA = (Date)attributes.get("FI_FECHA_MODIFICA");

		if (FI_FECHA_MODIFICA != null) {
			setFI_FECHA_MODIFICA(FI_FECHA_MODIFICA);
		}
	}

	/**
	* Returns the primary key of this ficha ingreso.
	*
	* @return the primary key of this ficha ingreso
	*/
	@Override
	public long getPrimaryKey() {
		return _fichaIngreso.getPrimaryKey();
	}

	/**
	* Sets the primary key of this ficha ingreso.
	*
	* @param primaryKey the primary key of this ficha ingreso
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_fichaIngreso.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the f i_ i d of this ficha ingreso.
	*
	* @return the f i_ i d of this ficha ingreso
	*/
	@Override
	public long getFI_ID() {
		return _fichaIngreso.getFI_ID();
	}

	/**
	* Sets the f i_ i d of this ficha ingreso.
	*
	* @param FI_ID the f i_ i d of this ficha ingreso
	*/
	@Override
	public void setFI_ID(long FI_ID) {
		_fichaIngreso.setFI_ID(FI_ID);
	}

	/**
	* Returns the f i_ e s t a d o of this ficha ingreso.
	*
	* @return the f i_ e s t a d o of this ficha ingreso
	*/
	@Override
	public java.lang.String getFI_ESTADO() {
		return _fichaIngreso.getFI_ESTADO();
	}

	/**
	* Sets the f i_ e s t a d o of this ficha ingreso.
	*
	* @param FI_ESTADO the f i_ e s t a d o of this ficha ingreso
	*/
	@Override
	public void setFI_ESTADO(java.lang.String FI_ESTADO) {
		_fichaIngreso.setFI_ESTADO(FI_ESTADO);
	}

	/**
	* Returns the f i_ a c t i v o of this ficha ingreso.
	*
	* @return the f i_ a c t i v o of this ficha ingreso
	*/
	@Override
	public java.lang.String getFI_ACTIVO() {
		return _fichaIngreso.getFI_ACTIVO();
	}

	/**
	* Sets the f i_ a c t i v o of this ficha ingreso.
	*
	* @param FI_ACTIVO the f i_ a c t i v o of this ficha ingreso
	*/
	@Override
	public void setFI_ACTIVO(java.lang.String FI_ACTIVO) {
		_fichaIngreso.setFI_ACTIVO(FI_ACTIVO);
	}

	/**
	* Returns the f i_ u s u a r i o_ c r e a of this ficha ingreso.
	*
	* @return the f i_ u s u a r i o_ c r e a of this ficha ingreso
	*/
	@Override
	public long getFI_USUARIO_CREA() {
		return _fichaIngreso.getFI_USUARIO_CREA();
	}

	/**
	* Sets the f i_ u s u a r i o_ c r e a of this ficha ingreso.
	*
	* @param FI_USUARIO_CREA the f i_ u s u a r i o_ c r e a of this ficha ingreso
	*/
	@Override
	public void setFI_USUARIO_CREA(long FI_USUARIO_CREA) {
		_fichaIngreso.setFI_USUARIO_CREA(FI_USUARIO_CREA);
	}

	/**
	* Returns the f i_ f e c h a_ c r e a of this ficha ingreso.
	*
	* @return the f i_ f e c h a_ c r e a of this ficha ingreso
	*/
	@Override
	public java.util.Date getFI_FECHA_CREA() {
		return _fichaIngreso.getFI_FECHA_CREA();
	}

	/**
	* Sets the f i_ f e c h a_ c r e a of this ficha ingreso.
	*
	* @param FI_FECHA_CREA the f i_ f e c h a_ c r e a of this ficha ingreso
	*/
	@Override
	public void setFI_FECHA_CREA(java.util.Date FI_FECHA_CREA) {
		_fichaIngreso.setFI_FECHA_CREA(FI_FECHA_CREA);
	}

	/**
	* Returns the f i_ u s u a r i o_ m o d i f i c a of this ficha ingreso.
	*
	* @return the f i_ u s u a r i o_ m o d i f i c a of this ficha ingreso
	*/
	@Override
	public long getFI_USUARIO_MODIFICA() {
		return _fichaIngreso.getFI_USUARIO_MODIFICA();
	}

	/**
	* Sets the f i_ u s u a r i o_ m o d i f i c a of this ficha ingreso.
	*
	* @param FI_USUARIO_MODIFICA the f i_ u s u a r i o_ m o d i f i c a of this ficha ingreso
	*/
	@Override
	public void setFI_USUARIO_MODIFICA(long FI_USUARIO_MODIFICA) {
		_fichaIngreso.setFI_USUARIO_MODIFICA(FI_USUARIO_MODIFICA);
	}

	/**
	* Returns the f i_ f e c h a_ m o d i f i c a of this ficha ingreso.
	*
	* @return the f i_ f e c h a_ m o d i f i c a of this ficha ingreso
	*/
	@Override
	public java.util.Date getFI_FECHA_MODIFICA() {
		return _fichaIngreso.getFI_FECHA_MODIFICA();
	}

	/**
	* Sets the f i_ f e c h a_ m o d i f i c a of this ficha ingreso.
	*
	* @param FI_FECHA_MODIFICA the f i_ f e c h a_ m o d i f i c a of this ficha ingreso
	*/
	@Override
	public void setFI_FECHA_MODIFICA(java.util.Date FI_FECHA_MODIFICA) {
		_fichaIngreso.setFI_FECHA_MODIFICA(FI_FECHA_MODIFICA);
	}

	@Override
	public boolean isNew() {
		return _fichaIngreso.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_fichaIngreso.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _fichaIngreso.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_fichaIngreso.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _fichaIngreso.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _fichaIngreso.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_fichaIngreso.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _fichaIngreso.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_fichaIngreso.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_fichaIngreso.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_fichaIngreso.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new fichaIngresoWrapper((fichaIngreso)_fichaIngreso.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.fichaIngreso fichaIngreso) {
		return _fichaIngreso.compareTo(fichaIngreso);
	}

	@Override
	public int hashCode() {
		return _fichaIngreso.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.fichaIngreso> toCacheModel() {
		return _fichaIngreso.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.fichaIngreso toEscapedModel() {
		return new fichaIngresoWrapper(_fichaIngreso.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.fichaIngreso toUnescapedModel() {
		return new fichaIngresoWrapper(_fichaIngreso.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _fichaIngreso.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _fichaIngreso.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_fichaIngreso.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof fichaIngresoWrapper)) {
			return false;
		}

		fichaIngresoWrapper fichaIngresoWrapper = (fichaIngresoWrapper)obj;

		if (Validator.equals(_fichaIngreso, fichaIngresoWrapper._fichaIngreso)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public fichaIngreso getWrappedfichaIngreso() {
		return _fichaIngreso;
	}

	@Override
	public fichaIngreso getWrappedModel() {
		return _fichaIngreso;
	}

	@Override
	public void resetOriginalValues() {
		_fichaIngreso.resetOriginalValues();
	}

	private fichaIngreso _fichaIngreso;
}
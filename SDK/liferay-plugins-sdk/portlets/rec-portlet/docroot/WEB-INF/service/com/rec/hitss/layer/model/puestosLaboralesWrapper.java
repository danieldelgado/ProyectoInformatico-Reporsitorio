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
 * This class is a wrapper for {@link puestosLaborales}.
 * </p>
 *
 * @author Crossfire
 * @see puestosLaborales
 * @generated
 */
public class puestosLaboralesWrapper implements puestosLaborales,
	ModelWrapper<puestosLaborales> {
	public puestosLaboralesWrapper(puestosLaborales puestosLaborales) {
		_puestosLaborales = puestosLaborales;
	}

	@Override
	public Class<?> getModelClass() {
		return puestosLaborales.class;
	}

	@Override
	public String getModelClassName() {
		return puestosLaborales.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PL_ID", getPL_ID());
		attributes.put("PL_PUESTO", getPL_PUESTO());
		attributes.put("PL_ESTADO", getPL_ESTADO());
		attributes.put("PL_ACTIVO", getPL_ACTIVO());
		attributes.put("PL_USUARIO_CREA", getPL_USUARIO_CREA());
		attributes.put("PL_FECHA_CREA", getPL_FECHA_CREA());
		attributes.put("PL_USUARIO_MODIFICA", getPL_USUARIO_MODIFICA());
		attributes.put("PL_FECHA_MODIFICA", getPL_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long PL_ID = (Long)attributes.get("PL_ID");

		if (PL_ID != null) {
			setPL_ID(PL_ID);
		}

		String PL_PUESTO = (String)attributes.get("PL_PUESTO");

		if (PL_PUESTO != null) {
			setPL_PUESTO(PL_PUESTO);
		}

		String PL_ESTADO = (String)attributes.get("PL_ESTADO");

		if (PL_ESTADO != null) {
			setPL_ESTADO(PL_ESTADO);
		}

		String PL_ACTIVO = (String)attributes.get("PL_ACTIVO");

		if (PL_ACTIVO != null) {
			setPL_ACTIVO(PL_ACTIVO);
		}

		Long PL_USUARIO_CREA = (Long)attributes.get("PL_USUARIO_CREA");

		if (PL_USUARIO_CREA != null) {
			setPL_USUARIO_CREA(PL_USUARIO_CREA);
		}

		Date PL_FECHA_CREA = (Date)attributes.get("PL_FECHA_CREA");

		if (PL_FECHA_CREA != null) {
			setPL_FECHA_CREA(PL_FECHA_CREA);
		}

		Long PL_USUARIO_MODIFICA = (Long)attributes.get("PL_USUARIO_MODIFICA");

		if (PL_USUARIO_MODIFICA != null) {
			setPL_USUARIO_MODIFICA(PL_USUARIO_MODIFICA);
		}

		Date PL_FECHA_MODIFICA = (Date)attributes.get("PL_FECHA_MODIFICA");

		if (PL_FECHA_MODIFICA != null) {
			setPL_FECHA_MODIFICA(PL_FECHA_MODIFICA);
		}
	}

	/**
	* Returns the primary key of this puestos laborales.
	*
	* @return the primary key of this puestos laborales
	*/
	@Override
	public long getPrimaryKey() {
		return _puestosLaborales.getPrimaryKey();
	}

	/**
	* Sets the primary key of this puestos laborales.
	*
	* @param primaryKey the primary key of this puestos laborales
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_puestosLaborales.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the p l_ i d of this puestos laborales.
	*
	* @return the p l_ i d of this puestos laborales
	*/
	@Override
	public long getPL_ID() {
		return _puestosLaborales.getPL_ID();
	}

	/**
	* Sets the p l_ i d of this puestos laborales.
	*
	* @param PL_ID the p l_ i d of this puestos laborales
	*/
	@Override
	public void setPL_ID(long PL_ID) {
		_puestosLaborales.setPL_ID(PL_ID);
	}

	/**
	* Returns the p l_ p u e s t o of this puestos laborales.
	*
	* @return the p l_ p u e s t o of this puestos laborales
	*/
	@Override
	public java.lang.String getPL_PUESTO() {
		return _puestosLaborales.getPL_PUESTO();
	}

	/**
	* Sets the p l_ p u e s t o of this puestos laborales.
	*
	* @param PL_PUESTO the p l_ p u e s t o of this puestos laborales
	*/
	@Override
	public void setPL_PUESTO(java.lang.String PL_PUESTO) {
		_puestosLaborales.setPL_PUESTO(PL_PUESTO);
	}

	/**
	* Returns the p l_ e s t a d o of this puestos laborales.
	*
	* @return the p l_ e s t a d o of this puestos laborales
	*/
	@Override
	public java.lang.String getPL_ESTADO() {
		return _puestosLaborales.getPL_ESTADO();
	}

	/**
	* Sets the p l_ e s t a d o of this puestos laborales.
	*
	* @param PL_ESTADO the p l_ e s t a d o of this puestos laborales
	*/
	@Override
	public void setPL_ESTADO(java.lang.String PL_ESTADO) {
		_puestosLaborales.setPL_ESTADO(PL_ESTADO);
	}

	/**
	* Returns the p l_ a c t i v o of this puestos laborales.
	*
	* @return the p l_ a c t i v o of this puestos laborales
	*/
	@Override
	public java.lang.String getPL_ACTIVO() {
		return _puestosLaborales.getPL_ACTIVO();
	}

	/**
	* Sets the p l_ a c t i v o of this puestos laborales.
	*
	* @param PL_ACTIVO the p l_ a c t i v o of this puestos laborales
	*/
	@Override
	public void setPL_ACTIVO(java.lang.String PL_ACTIVO) {
		_puestosLaborales.setPL_ACTIVO(PL_ACTIVO);
	}

	/**
	* Returns the p l_ u s u a r i o_ c r e a of this puestos laborales.
	*
	* @return the p l_ u s u a r i o_ c r e a of this puestos laborales
	*/
	@Override
	public long getPL_USUARIO_CREA() {
		return _puestosLaborales.getPL_USUARIO_CREA();
	}

	/**
	* Sets the p l_ u s u a r i o_ c r e a of this puestos laborales.
	*
	* @param PL_USUARIO_CREA the p l_ u s u a r i o_ c r e a of this puestos laborales
	*/
	@Override
	public void setPL_USUARIO_CREA(long PL_USUARIO_CREA) {
		_puestosLaborales.setPL_USUARIO_CREA(PL_USUARIO_CREA);
	}

	/**
	* Returns the p l_ f e c h a_ c r e a of this puestos laborales.
	*
	* @return the p l_ f e c h a_ c r e a of this puestos laborales
	*/
	@Override
	public java.util.Date getPL_FECHA_CREA() {
		return _puestosLaborales.getPL_FECHA_CREA();
	}

	/**
	* Sets the p l_ f e c h a_ c r e a of this puestos laborales.
	*
	* @param PL_FECHA_CREA the p l_ f e c h a_ c r e a of this puestos laborales
	*/
	@Override
	public void setPL_FECHA_CREA(java.util.Date PL_FECHA_CREA) {
		_puestosLaborales.setPL_FECHA_CREA(PL_FECHA_CREA);
	}

	/**
	* Returns the p l_ u s u a r i o_ m o d i f i c a of this puestos laborales.
	*
	* @return the p l_ u s u a r i o_ m o d i f i c a of this puestos laborales
	*/
	@Override
	public long getPL_USUARIO_MODIFICA() {
		return _puestosLaborales.getPL_USUARIO_MODIFICA();
	}

	/**
	* Sets the p l_ u s u a r i o_ m o d i f i c a of this puestos laborales.
	*
	* @param PL_USUARIO_MODIFICA the p l_ u s u a r i o_ m o d i f i c a of this puestos laborales
	*/
	@Override
	public void setPL_USUARIO_MODIFICA(long PL_USUARIO_MODIFICA) {
		_puestosLaborales.setPL_USUARIO_MODIFICA(PL_USUARIO_MODIFICA);
	}

	/**
	* Returns the p l_ f e c h a_ m o d i f i c a of this puestos laborales.
	*
	* @return the p l_ f e c h a_ m o d i f i c a of this puestos laborales
	*/
	@Override
	public java.util.Date getPL_FECHA_MODIFICA() {
		return _puestosLaborales.getPL_FECHA_MODIFICA();
	}

	/**
	* Sets the p l_ f e c h a_ m o d i f i c a of this puestos laborales.
	*
	* @param PL_FECHA_MODIFICA the p l_ f e c h a_ m o d i f i c a of this puestos laborales
	*/
	@Override
	public void setPL_FECHA_MODIFICA(java.util.Date PL_FECHA_MODIFICA) {
		_puestosLaborales.setPL_FECHA_MODIFICA(PL_FECHA_MODIFICA);
	}

	@Override
	public boolean isNew() {
		return _puestosLaborales.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_puestosLaborales.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _puestosLaborales.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_puestosLaborales.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _puestosLaborales.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _puestosLaborales.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_puestosLaborales.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _puestosLaborales.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_puestosLaborales.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_puestosLaborales.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_puestosLaborales.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new puestosLaboralesWrapper((puestosLaborales)_puestosLaborales.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.puestosLaborales puestosLaborales) {
		return _puestosLaborales.compareTo(puestosLaborales);
	}

	@Override
	public int hashCode() {
		return _puestosLaborales.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.puestosLaborales> toCacheModel() {
		return _puestosLaborales.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.puestosLaborales toEscapedModel() {
		return new puestosLaboralesWrapper(_puestosLaborales.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.puestosLaborales toUnescapedModel() {
		return new puestosLaboralesWrapper(_puestosLaborales.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _puestosLaborales.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _puestosLaborales.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_puestosLaborales.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof puestosLaboralesWrapper)) {
			return false;
		}

		puestosLaboralesWrapper puestosLaboralesWrapper = (puestosLaboralesWrapper)obj;

		if (Validator.equals(_puestosLaborales,
					puestosLaboralesWrapper._puestosLaborales)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public puestosLaborales getWrappedpuestosLaborales() {
		return _puestosLaborales;
	}

	@Override
	public puestosLaborales getWrappedModel() {
		return _puestosLaborales;
	}

	@Override
	public void resetOriginalValues() {
		_puestosLaborales.resetOriginalValues();
	}

	private puestosLaborales _puestosLaborales;
}
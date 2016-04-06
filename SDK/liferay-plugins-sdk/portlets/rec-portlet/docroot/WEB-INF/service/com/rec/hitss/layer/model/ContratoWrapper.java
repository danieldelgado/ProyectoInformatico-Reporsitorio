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
 * This class is a wrapper for {@link Contrato}.
 * </p>
 *
 * @author Crossfire
 * @see Contrato
 * @generated
 */
public class ContratoWrapper implements Contrato, ModelWrapper<Contrato> {
	public ContratoWrapper(Contrato contrato) {
		_contrato = contrato;
	}

	@Override
	public Class<?> getModelClass() {
		return Contrato.class;
	}

	@Override
	public String getModelClassName() {
		return Contrato.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CT_ID", getCT_ID());
		attributes.put("CT_ESTADO", getCT_ESTADO());
		attributes.put("CT_ACTIVO", getCT_ACTIVO());
		attributes.put("CT_USUARIO_CREA", getCT_USUARIO_CREA());
		attributes.put("CT_FECHA_CREA", getCT_FECHA_CREA());
		attributes.put("CT_USUARIO_MODIFICA", getCT_USUARIO_MODIFICA());
		attributes.put("CT_FECHA_MODIFICA", getCT_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long CT_ID = (Long)attributes.get("CT_ID");

		if (CT_ID != null) {
			setCT_ID(CT_ID);
		}

		String CT_ESTADO = (String)attributes.get("CT_ESTADO");

		if (CT_ESTADO != null) {
			setCT_ESTADO(CT_ESTADO);
		}

		String CT_ACTIVO = (String)attributes.get("CT_ACTIVO");

		if (CT_ACTIVO != null) {
			setCT_ACTIVO(CT_ACTIVO);
		}

		Long CT_USUARIO_CREA = (Long)attributes.get("CT_USUARIO_CREA");

		if (CT_USUARIO_CREA != null) {
			setCT_USUARIO_CREA(CT_USUARIO_CREA);
		}

		Date CT_FECHA_CREA = (Date)attributes.get("CT_FECHA_CREA");

		if (CT_FECHA_CREA != null) {
			setCT_FECHA_CREA(CT_FECHA_CREA);
		}

		Long CT_USUARIO_MODIFICA = (Long)attributes.get("CT_USUARIO_MODIFICA");

		if (CT_USUARIO_MODIFICA != null) {
			setCT_USUARIO_MODIFICA(CT_USUARIO_MODIFICA);
		}

		Date CT_FECHA_MODIFICA = (Date)attributes.get("CT_FECHA_MODIFICA");

		if (CT_FECHA_MODIFICA != null) {
			setCT_FECHA_MODIFICA(CT_FECHA_MODIFICA);
		}
	}

	/**
	* Returns the primary key of this contrato.
	*
	* @return the primary key of this contrato
	*/
	@Override
	public long getPrimaryKey() {
		return _contrato.getPrimaryKey();
	}

	/**
	* Sets the primary key of this contrato.
	*
	* @param primaryKey the primary key of this contrato
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_contrato.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the c t_ i d of this contrato.
	*
	* @return the c t_ i d of this contrato
	*/
	@Override
	public long getCT_ID() {
		return _contrato.getCT_ID();
	}

	/**
	* Sets the c t_ i d of this contrato.
	*
	* @param CT_ID the c t_ i d of this contrato
	*/
	@Override
	public void setCT_ID(long CT_ID) {
		_contrato.setCT_ID(CT_ID);
	}

	/**
	* Returns the c t_ e s t a d o of this contrato.
	*
	* @return the c t_ e s t a d o of this contrato
	*/
	@Override
	public java.lang.String getCT_ESTADO() {
		return _contrato.getCT_ESTADO();
	}

	/**
	* Sets the c t_ e s t a d o of this contrato.
	*
	* @param CT_ESTADO the c t_ e s t a d o of this contrato
	*/
	@Override
	public void setCT_ESTADO(java.lang.String CT_ESTADO) {
		_contrato.setCT_ESTADO(CT_ESTADO);
	}

	/**
	* Returns the c t_ a c t i v o of this contrato.
	*
	* @return the c t_ a c t i v o of this contrato
	*/
	@Override
	public java.lang.String getCT_ACTIVO() {
		return _contrato.getCT_ACTIVO();
	}

	/**
	* Sets the c t_ a c t i v o of this contrato.
	*
	* @param CT_ACTIVO the c t_ a c t i v o of this contrato
	*/
	@Override
	public void setCT_ACTIVO(java.lang.String CT_ACTIVO) {
		_contrato.setCT_ACTIVO(CT_ACTIVO);
	}

	/**
	* Returns the c t_ u s u a r i o_ c r e a of this contrato.
	*
	* @return the c t_ u s u a r i o_ c r e a of this contrato
	*/
	@Override
	public long getCT_USUARIO_CREA() {
		return _contrato.getCT_USUARIO_CREA();
	}

	/**
	* Sets the c t_ u s u a r i o_ c r e a of this contrato.
	*
	* @param CT_USUARIO_CREA the c t_ u s u a r i o_ c r e a of this contrato
	*/
	@Override
	public void setCT_USUARIO_CREA(long CT_USUARIO_CREA) {
		_contrato.setCT_USUARIO_CREA(CT_USUARIO_CREA);
	}

	/**
	* Returns the c t_ f e c h a_ c r e a of this contrato.
	*
	* @return the c t_ f e c h a_ c r e a of this contrato
	*/
	@Override
	public java.util.Date getCT_FECHA_CREA() {
		return _contrato.getCT_FECHA_CREA();
	}

	/**
	* Sets the c t_ f e c h a_ c r e a of this contrato.
	*
	* @param CT_FECHA_CREA the c t_ f e c h a_ c r e a of this contrato
	*/
	@Override
	public void setCT_FECHA_CREA(java.util.Date CT_FECHA_CREA) {
		_contrato.setCT_FECHA_CREA(CT_FECHA_CREA);
	}

	/**
	* Returns the c t_ u s u a r i o_ m o d i f i c a of this contrato.
	*
	* @return the c t_ u s u a r i o_ m o d i f i c a of this contrato
	*/
	@Override
	public long getCT_USUARIO_MODIFICA() {
		return _contrato.getCT_USUARIO_MODIFICA();
	}

	/**
	* Sets the c t_ u s u a r i o_ m o d i f i c a of this contrato.
	*
	* @param CT_USUARIO_MODIFICA the c t_ u s u a r i o_ m o d i f i c a of this contrato
	*/
	@Override
	public void setCT_USUARIO_MODIFICA(long CT_USUARIO_MODIFICA) {
		_contrato.setCT_USUARIO_MODIFICA(CT_USUARIO_MODIFICA);
	}

	/**
	* Returns the c t_ f e c h a_ m o d i f i c a of this contrato.
	*
	* @return the c t_ f e c h a_ m o d i f i c a of this contrato
	*/
	@Override
	public java.util.Date getCT_FECHA_MODIFICA() {
		return _contrato.getCT_FECHA_MODIFICA();
	}

	/**
	* Sets the c t_ f e c h a_ m o d i f i c a of this contrato.
	*
	* @param CT_FECHA_MODIFICA the c t_ f e c h a_ m o d i f i c a of this contrato
	*/
	@Override
	public void setCT_FECHA_MODIFICA(java.util.Date CT_FECHA_MODIFICA) {
		_contrato.setCT_FECHA_MODIFICA(CT_FECHA_MODIFICA);
	}

	@Override
	public boolean isNew() {
		return _contrato.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_contrato.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _contrato.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_contrato.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _contrato.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _contrato.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_contrato.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _contrato.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_contrato.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_contrato.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_contrato.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ContratoWrapper((Contrato)_contrato.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.Contrato contrato) {
		return _contrato.compareTo(contrato);
	}

	@Override
	public int hashCode() {
		return _contrato.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.Contrato> toCacheModel() {
		return _contrato.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.Contrato toEscapedModel() {
		return new ContratoWrapper(_contrato.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.Contrato toUnescapedModel() {
		return new ContratoWrapper(_contrato.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _contrato.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _contrato.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_contrato.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ContratoWrapper)) {
			return false;
		}

		ContratoWrapper contratoWrapper = (ContratoWrapper)obj;

		if (Validator.equals(_contrato, contratoWrapper._contrato)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Contrato getWrappedContrato() {
		return _contrato;
	}

	@Override
	public Contrato getWrappedModel() {
		return _contrato;
	}

	@Override
	public void resetOriginalValues() {
		_contrato.resetOriginalValues();
	}

	private Contrato _contrato;
}
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
 * This class is a wrapper for {@link requerimientoPersonal}.
 * </p>
 *
 * @author Crossfire
 * @see requerimientoPersonal
 * @generated
 */
public class requerimientoPersonalWrapper implements requerimientoPersonal,
	ModelWrapper<requerimientoPersonal> {
	public requerimientoPersonalWrapper(
		requerimientoPersonal requerimientoPersonal) {
		_requerimientoPersonal = requerimientoPersonal;
	}

	@Override
	public Class<?> getModelClass() {
		return requerimientoPersonal.class;
	}

	@Override
	public String getModelClassName() {
		return requerimientoPersonal.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("REQ_ID", getREQ_ID());
		attributes.put("REQ_ESTADO", getREQ_ESTADO());
		attributes.put("REQ_ACTIVO", getREQ_ACTIVO());
		attributes.put("REQ_USUARIO_CREA", getREQ_USUARIO_CREA());
		attributes.put("REQ_FECHA_CREA", getREQ_FECHA_CREA());
		attributes.put("REQ_USUARIO_MODIFICA", getREQ_USUARIO_MODIFICA());
		attributes.put("REQ_FECHA_MODIFICA", getREQ_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long REQ_ID = (Long)attributes.get("REQ_ID");

		if (REQ_ID != null) {
			setREQ_ID(REQ_ID);
		}

		String REQ_ESTADO = (String)attributes.get("REQ_ESTADO");

		if (REQ_ESTADO != null) {
			setREQ_ESTADO(REQ_ESTADO);
		}

		String REQ_ACTIVO = (String)attributes.get("REQ_ACTIVO");

		if (REQ_ACTIVO != null) {
			setREQ_ACTIVO(REQ_ACTIVO);
		}

		Long REQ_USUARIO_CREA = (Long)attributes.get("REQ_USUARIO_CREA");

		if (REQ_USUARIO_CREA != null) {
			setREQ_USUARIO_CREA(REQ_USUARIO_CREA);
		}

		Date REQ_FECHA_CREA = (Date)attributes.get("REQ_FECHA_CREA");

		if (REQ_FECHA_CREA != null) {
			setREQ_FECHA_CREA(REQ_FECHA_CREA);
		}

		Long REQ_USUARIO_MODIFICA = (Long)attributes.get("REQ_USUARIO_MODIFICA");

		if (REQ_USUARIO_MODIFICA != null) {
			setREQ_USUARIO_MODIFICA(REQ_USUARIO_MODIFICA);
		}

		Date REQ_FECHA_MODIFICA = (Date)attributes.get("REQ_FECHA_MODIFICA");

		if (REQ_FECHA_MODIFICA != null) {
			setREQ_FECHA_MODIFICA(REQ_FECHA_MODIFICA);
		}
	}

	/**
	* Returns the primary key of this requerimiento personal.
	*
	* @return the primary key of this requerimiento personal
	*/
	@Override
	public long getPrimaryKey() {
		return _requerimientoPersonal.getPrimaryKey();
	}

	/**
	* Sets the primary key of this requerimiento personal.
	*
	* @param primaryKey the primary key of this requerimiento personal
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_requerimientoPersonal.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the r e q_ i d of this requerimiento personal.
	*
	* @return the r e q_ i d of this requerimiento personal
	*/
	@Override
	public long getREQ_ID() {
		return _requerimientoPersonal.getREQ_ID();
	}

	/**
	* Sets the r e q_ i d of this requerimiento personal.
	*
	* @param REQ_ID the r e q_ i d of this requerimiento personal
	*/
	@Override
	public void setREQ_ID(long REQ_ID) {
		_requerimientoPersonal.setREQ_ID(REQ_ID);
	}

	/**
	* Returns the r e q_ e s t a d o of this requerimiento personal.
	*
	* @return the r e q_ e s t a d o of this requerimiento personal
	*/
	@Override
	public java.lang.String getREQ_ESTADO() {
		return _requerimientoPersonal.getREQ_ESTADO();
	}

	/**
	* Sets the r e q_ e s t a d o of this requerimiento personal.
	*
	* @param REQ_ESTADO the r e q_ e s t a d o of this requerimiento personal
	*/
	@Override
	public void setREQ_ESTADO(java.lang.String REQ_ESTADO) {
		_requerimientoPersonal.setREQ_ESTADO(REQ_ESTADO);
	}

	/**
	* Returns the r e q_ a c t i v o of this requerimiento personal.
	*
	* @return the r e q_ a c t i v o of this requerimiento personal
	*/
	@Override
	public java.lang.String getREQ_ACTIVO() {
		return _requerimientoPersonal.getREQ_ACTIVO();
	}

	/**
	* Sets the r e q_ a c t i v o of this requerimiento personal.
	*
	* @param REQ_ACTIVO the r e q_ a c t i v o of this requerimiento personal
	*/
	@Override
	public void setREQ_ACTIVO(java.lang.String REQ_ACTIVO) {
		_requerimientoPersonal.setREQ_ACTIVO(REQ_ACTIVO);
	}

	/**
	* Returns the r e q_ u s u a r i o_ c r e a of this requerimiento personal.
	*
	* @return the r e q_ u s u a r i o_ c r e a of this requerimiento personal
	*/
	@Override
	public long getREQ_USUARIO_CREA() {
		return _requerimientoPersonal.getREQ_USUARIO_CREA();
	}

	/**
	* Sets the r e q_ u s u a r i o_ c r e a of this requerimiento personal.
	*
	* @param REQ_USUARIO_CREA the r e q_ u s u a r i o_ c r e a of this requerimiento personal
	*/
	@Override
	public void setREQ_USUARIO_CREA(long REQ_USUARIO_CREA) {
		_requerimientoPersonal.setREQ_USUARIO_CREA(REQ_USUARIO_CREA);
	}

	/**
	* Returns the r e q_ f e c h a_ c r e a of this requerimiento personal.
	*
	* @return the r e q_ f e c h a_ c r e a of this requerimiento personal
	*/
	@Override
	public java.util.Date getREQ_FECHA_CREA() {
		return _requerimientoPersonal.getREQ_FECHA_CREA();
	}

	/**
	* Sets the r e q_ f e c h a_ c r e a of this requerimiento personal.
	*
	* @param REQ_FECHA_CREA the r e q_ f e c h a_ c r e a of this requerimiento personal
	*/
	@Override
	public void setREQ_FECHA_CREA(java.util.Date REQ_FECHA_CREA) {
		_requerimientoPersonal.setREQ_FECHA_CREA(REQ_FECHA_CREA);
	}

	/**
	* Returns the r e q_ u s u a r i o_ m o d i f i c a of this requerimiento personal.
	*
	* @return the r e q_ u s u a r i o_ m o d i f i c a of this requerimiento personal
	*/
	@Override
	public long getREQ_USUARIO_MODIFICA() {
		return _requerimientoPersonal.getREQ_USUARIO_MODIFICA();
	}

	/**
	* Sets the r e q_ u s u a r i o_ m o d i f i c a of this requerimiento personal.
	*
	* @param REQ_USUARIO_MODIFICA the r e q_ u s u a r i o_ m o d i f i c a of this requerimiento personal
	*/
	@Override
	public void setREQ_USUARIO_MODIFICA(long REQ_USUARIO_MODIFICA) {
		_requerimientoPersonal.setREQ_USUARIO_MODIFICA(REQ_USUARIO_MODIFICA);
	}

	/**
	* Returns the r e q_ f e c h a_ m o d i f i c a of this requerimiento personal.
	*
	* @return the r e q_ f e c h a_ m o d i f i c a of this requerimiento personal
	*/
	@Override
	public java.util.Date getREQ_FECHA_MODIFICA() {
		return _requerimientoPersonal.getREQ_FECHA_MODIFICA();
	}

	/**
	* Sets the r e q_ f e c h a_ m o d i f i c a of this requerimiento personal.
	*
	* @param REQ_FECHA_MODIFICA the r e q_ f e c h a_ m o d i f i c a of this requerimiento personal
	*/
	@Override
	public void setREQ_FECHA_MODIFICA(java.util.Date REQ_FECHA_MODIFICA) {
		_requerimientoPersonal.setREQ_FECHA_MODIFICA(REQ_FECHA_MODIFICA);
	}

	@Override
	public boolean isNew() {
		return _requerimientoPersonal.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_requerimientoPersonal.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _requerimientoPersonal.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_requerimientoPersonal.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _requerimientoPersonal.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _requerimientoPersonal.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_requerimientoPersonal.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _requerimientoPersonal.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_requerimientoPersonal.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_requerimientoPersonal.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_requerimientoPersonal.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new requerimientoPersonalWrapper((requerimientoPersonal)_requerimientoPersonal.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.requerimientoPersonal requerimientoPersonal) {
		return _requerimientoPersonal.compareTo(requerimientoPersonal);
	}

	@Override
	public int hashCode() {
		return _requerimientoPersonal.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.requerimientoPersonal> toCacheModel() {
		return _requerimientoPersonal.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.requerimientoPersonal toEscapedModel() {
		return new requerimientoPersonalWrapper(_requerimientoPersonal.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.requerimientoPersonal toUnescapedModel() {
		return new requerimientoPersonalWrapper(_requerimientoPersonal.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _requerimientoPersonal.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _requerimientoPersonal.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_requerimientoPersonal.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof requerimientoPersonalWrapper)) {
			return false;
		}

		requerimientoPersonalWrapper requerimientoPersonalWrapper = (requerimientoPersonalWrapper)obj;

		if (Validator.equals(_requerimientoPersonal,
					requerimientoPersonalWrapper._requerimientoPersonal)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public requerimientoPersonal getWrappedrequerimientoPersonal() {
		return _requerimientoPersonal;
	}

	@Override
	public requerimientoPersonal getWrappedModel() {
		return _requerimientoPersonal;
	}

	@Override
	public void resetOriginalValues() {
		_requerimientoPersonal.resetOriginalValues();
	}

	private requerimientoPersonal _requerimientoPersonal;
}
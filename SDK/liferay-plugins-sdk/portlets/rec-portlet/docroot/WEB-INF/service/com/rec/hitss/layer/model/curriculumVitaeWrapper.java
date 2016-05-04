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
 * This class is a wrapper for {@link curriculumVitae}.
 * </p>
 *
 * @author Crossfire
 * @see curriculumVitae
 * @generated
 */
public class curriculumVitaeWrapper implements curriculumVitae,
	ModelWrapper<curriculumVitae> {
	public curriculumVitaeWrapper(curriculumVitae curriculumVitae) {
		_curriculumVitae = curriculumVitae;
	}

	@Override
	public Class<?> getModelClass() {
		return curriculumVitae.class;
	}

	@Override
	public String getModelClassName() {
		return curriculumVitae.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CV_ID", getCV_ID());
		attributes.put("CV_ESTADO", getCV_ESTADO());
		attributes.put("CV_ACTIVO", getCV_ACTIVO());
		attributes.put("CV_USUARIO_CREA", getCV_USUARIO_CREA());
		attributes.put("CV_FECHA_CREA", getCV_FECHA_CREA());
		attributes.put("CV_USUARIO_MODIFICA", getCV_USUARIO_MODIFICA());
		attributes.put("CV_FECHA_MODIFICA", getCV_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long CV_ID = (Long)attributes.get("CV_ID");

		if (CV_ID != null) {
			setCV_ID(CV_ID);
		}

		String CV_ESTADO = (String)attributes.get("CV_ESTADO");

		if (CV_ESTADO != null) {
			setCV_ESTADO(CV_ESTADO);
		}

		String CV_ACTIVO = (String)attributes.get("CV_ACTIVO");

		if (CV_ACTIVO != null) {
			setCV_ACTIVO(CV_ACTIVO);
		}

		Long CV_USUARIO_CREA = (Long)attributes.get("CV_USUARIO_CREA");

		if (CV_USUARIO_CREA != null) {
			setCV_USUARIO_CREA(CV_USUARIO_CREA);
		}

		Date CV_FECHA_CREA = (Date)attributes.get("CV_FECHA_CREA");

		if (CV_FECHA_CREA != null) {
			setCV_FECHA_CREA(CV_FECHA_CREA);
		}

		Long CV_USUARIO_MODIFICA = (Long)attributes.get("CV_USUARIO_MODIFICA");

		if (CV_USUARIO_MODIFICA != null) {
			setCV_USUARIO_MODIFICA(CV_USUARIO_MODIFICA);
		}

		Date CV_FECHA_MODIFICA = (Date)attributes.get("CV_FECHA_MODIFICA");

		if (CV_FECHA_MODIFICA != null) {
			setCV_FECHA_MODIFICA(CV_FECHA_MODIFICA);
		}
	}

	/**
	* Returns the primary key of this curriculum vitae.
	*
	* @return the primary key of this curriculum vitae
	*/
	@Override
	public long getPrimaryKey() {
		return _curriculumVitae.getPrimaryKey();
	}

	/**
	* Sets the primary key of this curriculum vitae.
	*
	* @param primaryKey the primary key of this curriculum vitae
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_curriculumVitae.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the c v_ i d of this curriculum vitae.
	*
	* @return the c v_ i d of this curriculum vitae
	*/
	@Override
	public long getCV_ID() {
		return _curriculumVitae.getCV_ID();
	}

	/**
	* Sets the c v_ i d of this curriculum vitae.
	*
	* @param CV_ID the c v_ i d of this curriculum vitae
	*/
	@Override
	public void setCV_ID(long CV_ID) {
		_curriculumVitae.setCV_ID(CV_ID);
	}

	/**
	* Returns the c v_ e s t a d o of this curriculum vitae.
	*
	* @return the c v_ e s t a d o of this curriculum vitae
	*/
	@Override
	public java.lang.String getCV_ESTADO() {
		return _curriculumVitae.getCV_ESTADO();
	}

	/**
	* Sets the c v_ e s t a d o of this curriculum vitae.
	*
	* @param CV_ESTADO the c v_ e s t a d o of this curriculum vitae
	*/
	@Override
	public void setCV_ESTADO(java.lang.String CV_ESTADO) {
		_curriculumVitae.setCV_ESTADO(CV_ESTADO);
	}

	/**
	* Returns the c v_ a c t i v o of this curriculum vitae.
	*
	* @return the c v_ a c t i v o of this curriculum vitae
	*/
	@Override
	public java.lang.String getCV_ACTIVO() {
		return _curriculumVitae.getCV_ACTIVO();
	}

	/**
	* Sets the c v_ a c t i v o of this curriculum vitae.
	*
	* @param CV_ACTIVO the c v_ a c t i v o of this curriculum vitae
	*/
	@Override
	public void setCV_ACTIVO(java.lang.String CV_ACTIVO) {
		_curriculumVitae.setCV_ACTIVO(CV_ACTIVO);
	}

	/**
	* Returns the c v_ u s u a r i o_ c r e a of this curriculum vitae.
	*
	* @return the c v_ u s u a r i o_ c r e a of this curriculum vitae
	*/
	@Override
	public long getCV_USUARIO_CREA() {
		return _curriculumVitae.getCV_USUARIO_CREA();
	}

	/**
	* Sets the c v_ u s u a r i o_ c r e a of this curriculum vitae.
	*
	* @param CV_USUARIO_CREA the c v_ u s u a r i o_ c r e a of this curriculum vitae
	*/
	@Override
	public void setCV_USUARIO_CREA(long CV_USUARIO_CREA) {
		_curriculumVitae.setCV_USUARIO_CREA(CV_USUARIO_CREA);
	}

	/**
	* Returns the c v_ f e c h a_ c r e a of this curriculum vitae.
	*
	* @return the c v_ f e c h a_ c r e a of this curriculum vitae
	*/
	@Override
	public java.util.Date getCV_FECHA_CREA() {
		return _curriculumVitae.getCV_FECHA_CREA();
	}

	/**
	* Sets the c v_ f e c h a_ c r e a of this curriculum vitae.
	*
	* @param CV_FECHA_CREA the c v_ f e c h a_ c r e a of this curriculum vitae
	*/
	@Override
	public void setCV_FECHA_CREA(java.util.Date CV_FECHA_CREA) {
		_curriculumVitae.setCV_FECHA_CREA(CV_FECHA_CREA);
	}

	/**
	* Returns the c v_ u s u a r i o_ m o d i f i c a of this curriculum vitae.
	*
	* @return the c v_ u s u a r i o_ m o d i f i c a of this curriculum vitae
	*/
	@Override
	public long getCV_USUARIO_MODIFICA() {
		return _curriculumVitae.getCV_USUARIO_MODIFICA();
	}

	/**
	* Sets the c v_ u s u a r i o_ m o d i f i c a of this curriculum vitae.
	*
	* @param CV_USUARIO_MODIFICA the c v_ u s u a r i o_ m o d i f i c a of this curriculum vitae
	*/
	@Override
	public void setCV_USUARIO_MODIFICA(long CV_USUARIO_MODIFICA) {
		_curriculumVitae.setCV_USUARIO_MODIFICA(CV_USUARIO_MODIFICA);
	}

	/**
	* Returns the c v_ f e c h a_ m o d i f i c a of this curriculum vitae.
	*
	* @return the c v_ f e c h a_ m o d i f i c a of this curriculum vitae
	*/
	@Override
	public java.util.Date getCV_FECHA_MODIFICA() {
		return _curriculumVitae.getCV_FECHA_MODIFICA();
	}

	/**
	* Sets the c v_ f e c h a_ m o d i f i c a of this curriculum vitae.
	*
	* @param CV_FECHA_MODIFICA the c v_ f e c h a_ m o d i f i c a of this curriculum vitae
	*/
	@Override
	public void setCV_FECHA_MODIFICA(java.util.Date CV_FECHA_MODIFICA) {
		_curriculumVitae.setCV_FECHA_MODIFICA(CV_FECHA_MODIFICA);
	}

	@Override
	public boolean isNew() {
		return _curriculumVitae.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_curriculumVitae.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _curriculumVitae.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_curriculumVitae.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _curriculumVitae.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _curriculumVitae.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_curriculumVitae.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _curriculumVitae.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_curriculumVitae.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_curriculumVitae.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_curriculumVitae.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new curriculumVitaeWrapper((curriculumVitae)_curriculumVitae.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.curriculumVitae curriculumVitae) {
		return _curriculumVitae.compareTo(curriculumVitae);
	}

	@Override
	public int hashCode() {
		return _curriculumVitae.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.curriculumVitae> toCacheModel() {
		return _curriculumVitae.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.curriculumVitae toEscapedModel() {
		return new curriculumVitaeWrapper(_curriculumVitae.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.curriculumVitae toUnescapedModel() {
		return new curriculumVitaeWrapper(_curriculumVitae.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _curriculumVitae.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _curriculumVitae.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_curriculumVitae.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof curriculumVitaeWrapper)) {
			return false;
		}

		curriculumVitaeWrapper curriculumVitaeWrapper = (curriculumVitaeWrapper)obj;

		if (Validator.equals(_curriculumVitae,
					curriculumVitaeWrapper._curriculumVitae)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public curriculumVitae getWrappedcurriculumVitae() {
		return _curriculumVitae;
	}

	@Override
	public curriculumVitae getWrappedModel() {
		return _curriculumVitae;
	}

	@Override
	public void resetOriginalValues() {
		_curriculumVitae.resetOriginalValues();
	}

	private curriculumVitae _curriculumVitae;
}
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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Etiqueta}.
 * </p>
 *
 * @author Crossfire
 * @see Etiqueta
 * @generated
 */
public class EtiquetaWrapper implements Etiqueta, ModelWrapper<Etiqueta> {
	public EtiquetaWrapper(Etiqueta etiqueta) {
		_etiqueta = etiqueta;
	}

	@Override
	public Class<?> getModelClass() {
		return Etiqueta.class;
	}

	@Override
	public String getModelClassName() {
		return Etiqueta.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("etiquetaId", getEtiquetaId());
		attributes.put("tagId", getTagId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long etiquetaId = (Long)attributes.get("etiquetaId");

		if (etiquetaId != null) {
			setEtiquetaId(etiquetaId);
		}

		Long tagId = (Long)attributes.get("tagId");

		if (tagId != null) {
			setTagId(tagId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}
	}

	/**
	* Returns the primary key of this etiqueta.
	*
	* @return the primary key of this etiqueta
	*/
	@Override
	public long getPrimaryKey() {
		return _etiqueta.getPrimaryKey();
	}

	/**
	* Sets the primary key of this etiqueta.
	*
	* @param primaryKey the primary key of this etiqueta
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_etiqueta.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the etiqueta ID of this etiqueta.
	*
	* @return the etiqueta ID of this etiqueta
	*/
	@Override
	public long getEtiquetaId() {
		return _etiqueta.getEtiquetaId();
	}

	/**
	* Sets the etiqueta ID of this etiqueta.
	*
	* @param etiquetaId the etiqueta ID of this etiqueta
	*/
	@Override
	public void setEtiquetaId(long etiquetaId) {
		_etiqueta.setEtiquetaId(etiquetaId);
	}

	/**
	* Returns the tag ID of this etiqueta.
	*
	* @return the tag ID of this etiqueta
	*/
	@Override
	public long getTagId() {
		return _etiqueta.getTagId();
	}

	/**
	* Sets the tag ID of this etiqueta.
	*
	* @param tagId the tag ID of this etiqueta
	*/
	@Override
	public void setTagId(long tagId) {
		_etiqueta.setTagId(tagId);
	}

	/**
	* Returns the group ID of this etiqueta.
	*
	* @return the group ID of this etiqueta
	*/
	@Override
	public long getGroupId() {
		return _etiqueta.getGroupId();
	}

	/**
	* Sets the group ID of this etiqueta.
	*
	* @param groupId the group ID of this etiqueta
	*/
	@Override
	public void setGroupId(long groupId) {
		_etiqueta.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this etiqueta.
	*
	* @return the company ID of this etiqueta
	*/
	@Override
	public long getCompanyId() {
		return _etiqueta.getCompanyId();
	}

	/**
	* Sets the company ID of this etiqueta.
	*
	* @param companyId the company ID of this etiqueta
	*/
	@Override
	public void setCompanyId(long companyId) {
		_etiqueta.setCompanyId(companyId);
	}

	@Override
	public boolean isNew() {
		return _etiqueta.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_etiqueta.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _etiqueta.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_etiqueta.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _etiqueta.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _etiqueta.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_etiqueta.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _etiqueta.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_etiqueta.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_etiqueta.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_etiqueta.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EtiquetaWrapper((Etiqueta)_etiqueta.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.Etiqueta etiqueta) {
		return _etiqueta.compareTo(etiqueta);
	}

	@Override
	public int hashCode() {
		return _etiqueta.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.Etiqueta> toCacheModel() {
		return _etiqueta.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.Etiqueta toEscapedModel() {
		return new EtiquetaWrapper(_etiqueta.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.Etiqueta toUnescapedModel() {
		return new EtiquetaWrapper(_etiqueta.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _etiqueta.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _etiqueta.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_etiqueta.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EtiquetaWrapper)) {
			return false;
		}

		EtiquetaWrapper etiquetaWrapper = (EtiquetaWrapper)obj;

		if (Validator.equals(_etiqueta, etiquetaWrapper._etiqueta)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Etiqueta getWrappedEtiqueta() {
		return _etiqueta;
	}

	@Override
	public Etiqueta getWrappedModel() {
		return _etiqueta;
	}

	@Override
	public void resetOriginalValues() {
		_etiqueta.resetOriginalValues();
	}

	private Etiqueta _etiqueta;
}
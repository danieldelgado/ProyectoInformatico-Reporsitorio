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

package com.hitss.layer.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EtiquetaRelacionada}.
 * </p>
 *
 * @author Danielle Delgado
 * @see EtiquetaRelacionada
 * @generated
 */
public class EtiquetaRelacionadaWrapper implements EtiquetaRelacionada,
	ModelWrapper<EtiquetaRelacionada> {
	public EtiquetaRelacionadaWrapper(EtiquetaRelacionada etiquetaRelacionada) {
		_etiquetaRelacionada = etiquetaRelacionada;
	}

	@Override
	public Class<?> getModelClass() {
		return EtiquetaRelacionada.class;
	}

	@Override
	public String getModelClassName() {
		return EtiquetaRelacionada.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("etiquetaRelacionadaId", getEtiquetaRelacionadaId());
		attributes.put("tabla", getTabla());
		attributes.put("registroId", getRegistroId());
		attributes.put("etiqueta", getEtiqueta());
		attributes.put("tagId", getTagId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long etiquetaRelacionadaId = (Long)attributes.get(
				"etiquetaRelacionadaId");

		if (etiquetaRelacionadaId != null) {
			setEtiquetaRelacionadaId(etiquetaRelacionadaId);
		}

		String tabla = (String)attributes.get("tabla");

		if (tabla != null) {
			setTabla(tabla);
		}

		Long registroId = (Long)attributes.get("registroId");

		if (registroId != null) {
			setRegistroId(registroId);
		}

		Long etiqueta = (Long)attributes.get("etiqueta");

		if (etiqueta != null) {
			setEtiqueta(etiqueta);
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
	* Returns the primary key of this etiqueta relacionada.
	*
	* @return the primary key of this etiqueta relacionada
	*/
	@Override
	public long getPrimaryKey() {
		return _etiquetaRelacionada.getPrimaryKey();
	}

	/**
	* Sets the primary key of this etiqueta relacionada.
	*
	* @param primaryKey the primary key of this etiqueta relacionada
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_etiquetaRelacionada.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the etiqueta relacionada ID of this etiqueta relacionada.
	*
	* @return the etiqueta relacionada ID of this etiqueta relacionada
	*/
	@Override
	public long getEtiquetaRelacionadaId() {
		return _etiquetaRelacionada.getEtiquetaRelacionadaId();
	}

	/**
	* Sets the etiqueta relacionada ID of this etiqueta relacionada.
	*
	* @param etiquetaRelacionadaId the etiqueta relacionada ID of this etiqueta relacionada
	*/
	@Override
	public void setEtiquetaRelacionadaId(long etiquetaRelacionadaId) {
		_etiquetaRelacionada.setEtiquetaRelacionadaId(etiquetaRelacionadaId);
	}

	/**
	* Returns the tabla of this etiqueta relacionada.
	*
	* @return the tabla of this etiqueta relacionada
	*/
	@Override
	public java.lang.String getTabla() {
		return _etiquetaRelacionada.getTabla();
	}

	/**
	* Sets the tabla of this etiqueta relacionada.
	*
	* @param tabla the tabla of this etiqueta relacionada
	*/
	@Override
	public void setTabla(java.lang.String tabla) {
		_etiquetaRelacionada.setTabla(tabla);
	}

	/**
	* Returns the registro ID of this etiqueta relacionada.
	*
	* @return the registro ID of this etiqueta relacionada
	*/
	@Override
	public long getRegistroId() {
		return _etiquetaRelacionada.getRegistroId();
	}

	/**
	* Sets the registro ID of this etiqueta relacionada.
	*
	* @param registroId the registro ID of this etiqueta relacionada
	*/
	@Override
	public void setRegistroId(long registroId) {
		_etiquetaRelacionada.setRegistroId(registroId);
	}

	/**
	* Returns the etiqueta of this etiqueta relacionada.
	*
	* @return the etiqueta of this etiqueta relacionada
	*/
	@Override
	public long getEtiqueta() {
		return _etiquetaRelacionada.getEtiqueta();
	}

	/**
	* Sets the etiqueta of this etiqueta relacionada.
	*
	* @param etiqueta the etiqueta of this etiqueta relacionada
	*/
	@Override
	public void setEtiqueta(long etiqueta) {
		_etiquetaRelacionada.setEtiqueta(etiqueta);
	}

	/**
	* Returns the tag ID of this etiqueta relacionada.
	*
	* @return the tag ID of this etiqueta relacionada
	*/
	@Override
	public long getTagId() {
		return _etiquetaRelacionada.getTagId();
	}

	/**
	* Sets the tag ID of this etiqueta relacionada.
	*
	* @param tagId the tag ID of this etiqueta relacionada
	*/
	@Override
	public void setTagId(long tagId) {
		_etiquetaRelacionada.setTagId(tagId);
	}

	/**
	* Returns the group ID of this etiqueta relacionada.
	*
	* @return the group ID of this etiqueta relacionada
	*/
	@Override
	public long getGroupId() {
		return _etiquetaRelacionada.getGroupId();
	}

	/**
	* Sets the group ID of this etiqueta relacionada.
	*
	* @param groupId the group ID of this etiqueta relacionada
	*/
	@Override
	public void setGroupId(long groupId) {
		_etiquetaRelacionada.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this etiqueta relacionada.
	*
	* @return the company ID of this etiqueta relacionada
	*/
	@Override
	public long getCompanyId() {
		return _etiquetaRelacionada.getCompanyId();
	}

	/**
	* Sets the company ID of this etiqueta relacionada.
	*
	* @param companyId the company ID of this etiqueta relacionada
	*/
	@Override
	public void setCompanyId(long companyId) {
		_etiquetaRelacionada.setCompanyId(companyId);
	}

	@Override
	public boolean isNew() {
		return _etiquetaRelacionada.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_etiquetaRelacionada.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _etiquetaRelacionada.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_etiquetaRelacionada.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _etiquetaRelacionada.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _etiquetaRelacionada.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_etiquetaRelacionada.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _etiquetaRelacionada.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_etiquetaRelacionada.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_etiquetaRelacionada.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_etiquetaRelacionada.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EtiquetaRelacionadaWrapper((EtiquetaRelacionada)_etiquetaRelacionada.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.EtiquetaRelacionada etiquetaRelacionada) {
		return _etiquetaRelacionada.compareTo(etiquetaRelacionada);
	}

	@Override
	public int hashCode() {
		return _etiquetaRelacionada.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.EtiquetaRelacionada> toCacheModel() {
		return _etiquetaRelacionada.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.EtiquetaRelacionada toEscapedModel() {
		return new EtiquetaRelacionadaWrapper(_etiquetaRelacionada.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.EtiquetaRelacionada toUnescapedModel() {
		return new EtiquetaRelacionadaWrapper(_etiquetaRelacionada.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _etiquetaRelacionada.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _etiquetaRelacionada.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_etiquetaRelacionada.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EtiquetaRelacionadaWrapper)) {
			return false;
		}

		EtiquetaRelacionadaWrapper etiquetaRelacionadaWrapper = (EtiquetaRelacionadaWrapper)obj;

		if (Validator.equals(_etiquetaRelacionada,
					etiquetaRelacionadaWrapper._etiquetaRelacionada)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EtiquetaRelacionada getWrappedEtiquetaRelacionada() {
		return _etiquetaRelacionada;
	}

	@Override
	public EtiquetaRelacionada getWrappedModel() {
		return _etiquetaRelacionada;
	}

	@Override
	public void resetOriginalValues() {
		_etiquetaRelacionada.resetOriginalValues();
	}

	private EtiquetaRelacionada _etiquetaRelacionada;
}
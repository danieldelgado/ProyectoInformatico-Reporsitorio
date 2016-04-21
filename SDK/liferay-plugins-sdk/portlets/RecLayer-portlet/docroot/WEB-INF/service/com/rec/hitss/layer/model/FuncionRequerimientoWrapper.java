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
 * This class is a wrapper for {@link FuncionRequerimiento}.
 * </p>
 *
 * @author Crossfire
 * @see FuncionRequerimiento
 * @generated
 */
public class FuncionRequerimientoWrapper implements FuncionRequerimiento,
	ModelWrapper<FuncionRequerimiento> {
	public FuncionRequerimientoWrapper(
		FuncionRequerimiento funcionRequerimiento) {
		_funcionRequerimiento = funcionRequerimiento;
	}

	@Override
	public Class<?> getModelClass() {
		return FuncionRequerimiento.class;
	}

	@Override
	public String getModelClassName() {
		return FuncionRequerimiento.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("funcionId", getFuncionId());
		attributes.put("requerimientoRecursoId", getRequerimientoRecursoId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long funcionId = (Long)attributes.get("funcionId");

		if (funcionId != null) {
			setFuncionId(funcionId);
		}

		Long requerimientoRecursoId = (Long)attributes.get(
				"requerimientoRecursoId");

		if (requerimientoRecursoId != null) {
			setRequerimientoRecursoId(requerimientoRecursoId);
		}
	}

	/**
	* Returns the primary key of this funcion requerimiento.
	*
	* @return the primary key of this funcion requerimiento
	*/
	@Override
	public long getPrimaryKey() {
		return _funcionRequerimiento.getPrimaryKey();
	}

	/**
	* Sets the primary key of this funcion requerimiento.
	*
	* @param primaryKey the primary key of this funcion requerimiento
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_funcionRequerimiento.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the funcion ID of this funcion requerimiento.
	*
	* @return the funcion ID of this funcion requerimiento
	*/
	@Override
	public long getFuncionId() {
		return _funcionRequerimiento.getFuncionId();
	}

	/**
	* Sets the funcion ID of this funcion requerimiento.
	*
	* @param funcionId the funcion ID of this funcion requerimiento
	*/
	@Override
	public void setFuncionId(long funcionId) {
		_funcionRequerimiento.setFuncionId(funcionId);
	}

	/**
	* Returns the requerimiento recurso ID of this funcion requerimiento.
	*
	* @return the requerimiento recurso ID of this funcion requerimiento
	*/
	@Override
	public long getRequerimientoRecursoId() {
		return _funcionRequerimiento.getRequerimientoRecursoId();
	}

	/**
	* Sets the requerimiento recurso ID of this funcion requerimiento.
	*
	* @param requerimientoRecursoId the requerimiento recurso ID of this funcion requerimiento
	*/
	@Override
	public void setRequerimientoRecursoId(long requerimientoRecursoId) {
		_funcionRequerimiento.setRequerimientoRecursoId(requerimientoRecursoId);
	}

	@Override
	public boolean isNew() {
		return _funcionRequerimiento.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_funcionRequerimiento.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _funcionRequerimiento.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_funcionRequerimiento.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _funcionRequerimiento.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _funcionRequerimiento.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_funcionRequerimiento.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _funcionRequerimiento.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_funcionRequerimiento.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_funcionRequerimiento.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_funcionRequerimiento.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FuncionRequerimientoWrapper((FuncionRequerimiento)_funcionRequerimiento.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.FuncionRequerimiento funcionRequerimiento) {
		return _funcionRequerimiento.compareTo(funcionRequerimiento);
	}

	@Override
	public int hashCode() {
		return _funcionRequerimiento.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.FuncionRequerimiento> toCacheModel() {
		return _funcionRequerimiento.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.FuncionRequerimiento toEscapedModel() {
		return new FuncionRequerimientoWrapper(_funcionRequerimiento.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.FuncionRequerimiento toUnescapedModel() {
		return new FuncionRequerimientoWrapper(_funcionRequerimiento.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _funcionRequerimiento.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _funcionRequerimiento.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_funcionRequerimiento.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FuncionRequerimientoWrapper)) {
			return false;
		}

		FuncionRequerimientoWrapper funcionRequerimientoWrapper = (FuncionRequerimientoWrapper)obj;

		if (Validator.equals(_funcionRequerimiento,
					funcionRequerimientoWrapper._funcionRequerimiento)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public FuncionRequerimiento getWrappedFuncionRequerimiento() {
		return _funcionRequerimiento;
	}

	@Override
	public FuncionRequerimiento getWrappedModel() {
		return _funcionRequerimiento;
	}

	@Override
	public void resetOriginalValues() {
		_funcionRequerimiento.resetOriginalValues();
	}

	private FuncionRequerimiento _funcionRequerimiento;
}
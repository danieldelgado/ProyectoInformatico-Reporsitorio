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
 * This class is a wrapper for {@link Funcion}.
 * </p>
 *
 * @author Crossfire
 * @see Funcion
 * @generated
 */
public class FuncionWrapper implements Funcion, ModelWrapper<Funcion> {
	public FuncionWrapper(Funcion funcion) {
		_funcion = funcion;
	}

	@Override
	public Class<?> getModelClass() {
		return Funcion.class;
	}

	@Override
	public String getModelClassName() {
		return Funcion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("funcionId", getFuncionId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("etiqueta", getEtiqueta());
		attributes.put("exigible", getExigible());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long funcionId = (Long)attributes.get("funcionId");

		if (funcionId != null) {
			setFuncionId(funcionId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Long etiqueta = (Long)attributes.get("etiqueta");

		if (etiqueta != null) {
			setEtiqueta(etiqueta);
		}

		Boolean exigible = (Boolean)attributes.get("exigible");

		if (exigible != null) {
			setExigible(exigible);
		}

		Boolean activo = (Boolean)attributes.get("activo");

		if (activo != null) {
			setActivo(activo);
		}

		Long usuariocrea = (Long)attributes.get("usuariocrea");

		if (usuariocrea != null) {
			setUsuariocrea(usuariocrea);
		}

		Date fechacrea = (Date)attributes.get("fechacrea");

		if (fechacrea != null) {
			setFechacrea(fechacrea);
		}

		Long usuariomodifica = (Long)attributes.get("usuariomodifica");

		if (usuariomodifica != null) {
			setUsuariomodifica(usuariomodifica);
		}

		Date fechacreamodifica = (Date)attributes.get("fechacreamodifica");

		if (fechacreamodifica != null) {
			setFechacreamodifica(fechacreamodifica);
		}
	}

	/**
	* Returns the primary key of this funcion.
	*
	* @return the primary key of this funcion
	*/
	@Override
	public long getPrimaryKey() {
		return _funcion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this funcion.
	*
	* @param primaryKey the primary key of this funcion
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_funcion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the funcion ID of this funcion.
	*
	* @return the funcion ID of this funcion
	*/
	@Override
	public long getFuncionId() {
		return _funcion.getFuncionId();
	}

	/**
	* Sets the funcion ID of this funcion.
	*
	* @param funcionId the funcion ID of this funcion
	*/
	@Override
	public void setFuncionId(long funcionId) {
		_funcion.setFuncionId(funcionId);
	}

	/**
	* Returns the descripcion of this funcion.
	*
	* @return the descripcion of this funcion
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _funcion.getDescripcion();
	}

	/**
	* Sets the descripcion of this funcion.
	*
	* @param descripcion the descripcion of this funcion
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_funcion.setDescripcion(descripcion);
	}

	/**
	* Returns the etiqueta of this funcion.
	*
	* @return the etiqueta of this funcion
	*/
	@Override
	public long getEtiqueta() {
		return _funcion.getEtiqueta();
	}

	/**
	* Sets the etiqueta of this funcion.
	*
	* @param etiqueta the etiqueta of this funcion
	*/
	@Override
	public void setEtiqueta(long etiqueta) {
		_funcion.setEtiqueta(etiqueta);
	}

	/**
	* Returns the exigible of this funcion.
	*
	* @return the exigible of this funcion
	*/
	@Override
	public boolean getExigible() {
		return _funcion.getExigible();
	}

	/**
	* Returns <code>true</code> if this funcion is exigible.
	*
	* @return <code>true</code> if this funcion is exigible; <code>false</code> otherwise
	*/
	@Override
	public boolean isExigible() {
		return _funcion.isExigible();
	}

	/**
	* Sets whether this funcion is exigible.
	*
	* @param exigible the exigible of this funcion
	*/
	@Override
	public void setExigible(boolean exigible) {
		_funcion.setExigible(exigible);
	}

	/**
	* Returns the activo of this funcion.
	*
	* @return the activo of this funcion
	*/
	@Override
	public boolean getActivo() {
		return _funcion.getActivo();
	}

	/**
	* Returns <code>true</code> if this funcion is activo.
	*
	* @return <code>true</code> if this funcion is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _funcion.isActivo();
	}

	/**
	* Sets whether this funcion is activo.
	*
	* @param activo the activo of this funcion
	*/
	@Override
	public void setActivo(boolean activo) {
		_funcion.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this funcion.
	*
	* @return the usuariocrea of this funcion
	*/
	@Override
	public long getUsuariocrea() {
		return _funcion.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this funcion.
	*
	* @param usuariocrea the usuariocrea of this funcion
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_funcion.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this funcion.
	*
	* @return the fechacrea of this funcion
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _funcion.getFechacrea();
	}

	/**
	* Sets the fechacrea of this funcion.
	*
	* @param fechacrea the fechacrea of this funcion
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_funcion.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this funcion.
	*
	* @return the usuariomodifica of this funcion
	*/
	@Override
	public long getUsuariomodifica() {
		return _funcion.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this funcion.
	*
	* @param usuariomodifica the usuariomodifica of this funcion
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_funcion.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this funcion.
	*
	* @return the fechacreamodifica of this funcion
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _funcion.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this funcion.
	*
	* @param fechacreamodifica the fechacreamodifica of this funcion
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_funcion.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _funcion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_funcion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _funcion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_funcion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _funcion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _funcion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_funcion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _funcion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_funcion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_funcion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_funcion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FuncionWrapper((Funcion)_funcion.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.Funcion funcion) {
		return _funcion.compareTo(funcion);
	}

	@Override
	public int hashCode() {
		return _funcion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.Funcion> toCacheModel() {
		return _funcion.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.Funcion toEscapedModel() {
		return new FuncionWrapper(_funcion.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.Funcion toUnescapedModel() {
		return new FuncionWrapper(_funcion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _funcion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _funcion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_funcion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FuncionWrapper)) {
			return false;
		}

		FuncionWrapper funcionWrapper = (FuncionWrapper)obj;

		if (Validator.equals(_funcion, funcionWrapper._funcion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Funcion getWrappedFuncion() {
		return _funcion;
	}

	@Override
	public Funcion getWrappedModel() {
		return _funcion;
	}

	@Override
	public void resetOriginalValues() {
		_funcion.resetOriginalValues();
	}

	private Funcion _funcion;
}
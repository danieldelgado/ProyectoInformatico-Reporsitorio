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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Puesto}.
 * </p>
 *
 * @author Danielle Delgado
 * @see Puesto
 * @generated
 */
public class PuestoWrapper implements Puesto, ModelWrapper<Puesto> {
	public PuestoWrapper(Puesto puesto) {
		_puesto = puesto;
	}

	@Override
	public Class<?> getModelClass() {
		return Puesto.class;
	}

	@Override
	public String getModelClassName() {
		return Puesto.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("puestoId", getPuestoId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("categoria", getCategoria());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long puestoId = (Long)attributes.get("puestoId");

		if (puestoId != null) {
			setPuestoId(puestoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Long categoria = (Long)attributes.get("categoria");

		if (categoria != null) {
			setCategoria(categoria);
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
	* Returns the primary key of this puesto.
	*
	* @return the primary key of this puesto
	*/
	@Override
	public long getPrimaryKey() {
		return _puesto.getPrimaryKey();
	}

	/**
	* Sets the primary key of this puesto.
	*
	* @param primaryKey the primary key of this puesto
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_puesto.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the puesto ID of this puesto.
	*
	* @return the puesto ID of this puesto
	*/
	@Override
	public long getPuestoId() {
		return _puesto.getPuestoId();
	}

	/**
	* Sets the puesto ID of this puesto.
	*
	* @param puestoId the puesto ID of this puesto
	*/
	@Override
	public void setPuestoId(long puestoId) {
		_puesto.setPuestoId(puestoId);
	}

	/**
	* Returns the descripcion of this puesto.
	*
	* @return the descripcion of this puesto
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _puesto.getDescripcion();
	}

	/**
	* Sets the descripcion of this puesto.
	*
	* @param descripcion the descripcion of this puesto
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_puesto.setDescripcion(descripcion);
	}

	/**
	* Returns the categoria of this puesto.
	*
	* @return the categoria of this puesto
	*/
	@Override
	public long getCategoria() {
		return _puesto.getCategoria();
	}

	/**
	* Sets the categoria of this puesto.
	*
	* @param categoria the categoria of this puesto
	*/
	@Override
	public void setCategoria(long categoria) {
		_puesto.setCategoria(categoria);
	}

	/**
	* Returns the activo of this puesto.
	*
	* @return the activo of this puesto
	*/
	@Override
	public boolean getActivo() {
		return _puesto.getActivo();
	}

	/**
	* Returns <code>true</code> if this puesto is activo.
	*
	* @return <code>true</code> if this puesto is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _puesto.isActivo();
	}

	/**
	* Sets whether this puesto is activo.
	*
	* @param activo the activo of this puesto
	*/
	@Override
	public void setActivo(boolean activo) {
		_puesto.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this puesto.
	*
	* @return the usuariocrea of this puesto
	*/
	@Override
	public long getUsuariocrea() {
		return _puesto.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this puesto.
	*
	* @param usuariocrea the usuariocrea of this puesto
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_puesto.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this puesto.
	*
	* @return the fechacrea of this puesto
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _puesto.getFechacrea();
	}

	/**
	* Sets the fechacrea of this puesto.
	*
	* @param fechacrea the fechacrea of this puesto
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_puesto.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this puesto.
	*
	* @return the usuariomodifica of this puesto
	*/
	@Override
	public long getUsuariomodifica() {
		return _puesto.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this puesto.
	*
	* @param usuariomodifica the usuariomodifica of this puesto
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_puesto.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this puesto.
	*
	* @return the fechacreamodifica of this puesto
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _puesto.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this puesto.
	*
	* @param fechacreamodifica the fechacreamodifica of this puesto
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_puesto.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _puesto.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_puesto.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _puesto.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_puesto.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _puesto.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _puesto.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_puesto.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _puesto.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_puesto.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_puesto.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_puesto.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PuestoWrapper((Puesto)_puesto.clone());
	}

	@Override
	public int compareTo(com.hitss.layer.model.Puesto puesto) {
		return _puesto.compareTo(puesto);
	}

	@Override
	public int hashCode() {
		return _puesto.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.Puesto> toCacheModel() {
		return _puesto.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.Puesto toEscapedModel() {
		return new PuestoWrapper(_puesto.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.Puesto toUnescapedModel() {
		return new PuestoWrapper(_puesto.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _puesto.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _puesto.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_puesto.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PuestoWrapper)) {
			return false;
		}

		PuestoWrapper puestoWrapper = (PuestoWrapper)obj;

		if (Validator.equals(_puesto, puestoWrapper._puesto)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Puesto getWrappedPuesto() {
		return _puesto;
	}

	@Override
	public Puesto getWrappedModel() {
		return _puesto;
	}

	@Override
	public void resetOriginalValues() {
		_puesto.resetOriginalValues();
	}

	private Puesto _puesto;
}
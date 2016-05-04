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
 * This class is a wrapper for {@link Requisito}.
 * </p>
 *
 * @author Danielle Delgado
 * @see Requisito
 * @generated
 */
public class RequisitoWrapper implements Requisito, ModelWrapper<Requisito> {
	public RequisitoWrapper(Requisito requisito) {
		_requisito = requisito;
	}

	@Override
	public Class<?> getModelClass() {
		return Requisito.class;
	}

	@Override
	public String getModelClassName() {
		return Requisito.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("requisitoId", getRequisitoId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("nivel", getNivel());
		attributes.put("exigible", getExigible());
		attributes.put("herramienta", getHerramienta());
		attributes.put("tipoRequisito", getTipoRequisito());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long requisitoId = (Long)attributes.get("requisitoId");

		if (requisitoId != null) {
			setRequisitoId(requisitoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Long nivel = (Long)attributes.get("nivel");

		if (nivel != null) {
			setNivel(nivel);
		}

		Boolean exigible = (Boolean)attributes.get("exigible");

		if (exigible != null) {
			setExigible(exigible);
		}

		Long herramienta = (Long)attributes.get("herramienta");

		if (herramienta != null) {
			setHerramienta(herramienta);
		}

		Long tipoRequisito = (Long)attributes.get("tipoRequisito");

		if (tipoRequisito != null) {
			setTipoRequisito(tipoRequisito);
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
	* Returns the primary key of this requisito.
	*
	* @return the primary key of this requisito
	*/
	@Override
	public long getPrimaryKey() {
		return _requisito.getPrimaryKey();
	}

	/**
	* Sets the primary key of this requisito.
	*
	* @param primaryKey the primary key of this requisito
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_requisito.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the requisito ID of this requisito.
	*
	* @return the requisito ID of this requisito
	*/
	@Override
	public long getRequisitoId() {
		return _requisito.getRequisitoId();
	}

	/**
	* Sets the requisito ID of this requisito.
	*
	* @param requisitoId the requisito ID of this requisito
	*/
	@Override
	public void setRequisitoId(long requisitoId) {
		_requisito.setRequisitoId(requisitoId);
	}

	/**
	* Returns the descripcion of this requisito.
	*
	* @return the descripcion of this requisito
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _requisito.getDescripcion();
	}

	/**
	* Sets the descripcion of this requisito.
	*
	* @param descripcion the descripcion of this requisito
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_requisito.setDescripcion(descripcion);
	}

	/**
	* Returns the nivel of this requisito.
	*
	* @return the nivel of this requisito
	*/
	@Override
	public long getNivel() {
		return _requisito.getNivel();
	}

	/**
	* Sets the nivel of this requisito.
	*
	* @param nivel the nivel of this requisito
	*/
	@Override
	public void setNivel(long nivel) {
		_requisito.setNivel(nivel);
	}

	/**
	* Returns the exigible of this requisito.
	*
	* @return the exigible of this requisito
	*/
	@Override
	public boolean getExigible() {
		return _requisito.getExigible();
	}

	/**
	* Returns <code>true</code> if this requisito is exigible.
	*
	* @return <code>true</code> if this requisito is exigible; <code>false</code> otherwise
	*/
	@Override
	public boolean isExigible() {
		return _requisito.isExigible();
	}

	/**
	* Sets whether this requisito is exigible.
	*
	* @param exigible the exigible of this requisito
	*/
	@Override
	public void setExigible(boolean exigible) {
		_requisito.setExigible(exigible);
	}

	/**
	* Returns the herramienta of this requisito.
	*
	* @return the herramienta of this requisito
	*/
	@Override
	public long getHerramienta() {
		return _requisito.getHerramienta();
	}

	/**
	* Sets the herramienta of this requisito.
	*
	* @param herramienta the herramienta of this requisito
	*/
	@Override
	public void setHerramienta(long herramienta) {
		_requisito.setHerramienta(herramienta);
	}

	/**
	* Returns the tipo requisito of this requisito.
	*
	* @return the tipo requisito of this requisito
	*/
	@Override
	public long getTipoRequisito() {
		return _requisito.getTipoRequisito();
	}

	/**
	* Sets the tipo requisito of this requisito.
	*
	* @param tipoRequisito the tipo requisito of this requisito
	*/
	@Override
	public void setTipoRequisito(long tipoRequisito) {
		_requisito.setTipoRequisito(tipoRequisito);
	}

	/**
	* Returns the activo of this requisito.
	*
	* @return the activo of this requisito
	*/
	@Override
	public boolean getActivo() {
		return _requisito.getActivo();
	}

	/**
	* Returns <code>true</code> if this requisito is activo.
	*
	* @return <code>true</code> if this requisito is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _requisito.isActivo();
	}

	/**
	* Sets whether this requisito is activo.
	*
	* @param activo the activo of this requisito
	*/
	@Override
	public void setActivo(boolean activo) {
		_requisito.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this requisito.
	*
	* @return the usuariocrea of this requisito
	*/
	@Override
	public long getUsuariocrea() {
		return _requisito.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this requisito.
	*
	* @param usuariocrea the usuariocrea of this requisito
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_requisito.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this requisito.
	*
	* @return the fechacrea of this requisito
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _requisito.getFechacrea();
	}

	/**
	* Sets the fechacrea of this requisito.
	*
	* @param fechacrea the fechacrea of this requisito
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_requisito.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this requisito.
	*
	* @return the usuariomodifica of this requisito
	*/
	@Override
	public long getUsuariomodifica() {
		return _requisito.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this requisito.
	*
	* @param usuariomodifica the usuariomodifica of this requisito
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_requisito.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this requisito.
	*
	* @return the fechacreamodifica of this requisito
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _requisito.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this requisito.
	*
	* @param fechacreamodifica the fechacreamodifica of this requisito
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_requisito.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _requisito.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_requisito.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _requisito.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_requisito.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _requisito.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _requisito.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_requisito.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _requisito.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_requisito.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_requisito.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_requisito.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RequisitoWrapper((Requisito)_requisito.clone());
	}

	@Override
	public int compareTo(com.hitss.layer.model.Requisito requisito) {
		return _requisito.compareTo(requisito);
	}

	@Override
	public int hashCode() {
		return _requisito.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.Requisito> toCacheModel() {
		return _requisito.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.Requisito toEscapedModel() {
		return new RequisitoWrapper(_requisito.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.Requisito toUnescapedModel() {
		return new RequisitoWrapper(_requisito.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _requisito.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _requisito.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_requisito.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RequisitoWrapper)) {
			return false;
		}

		RequisitoWrapper requisitoWrapper = (RequisitoWrapper)obj;

		if (Validator.equals(_requisito, requisitoWrapper._requisito)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Requisito getWrappedRequisito() {
		return _requisito;
	}

	@Override
	public Requisito getWrappedModel() {
		return _requisito;
	}

	@Override
	public void resetOriginalValues() {
		_requisito.resetOriginalValues();
	}

	private Requisito _requisito;
}
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
 * This class is a wrapper for {@link Contrato}.
 * </p>
 *
 * @author Danielle Delgado
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

		attributes.put("contratoId", getContratoId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("motivo", getMotivo());
		attributes.put("descripcion", getDescripcion());
		attributes.put("titulo", getTitulo());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long contratoId = (Long)attributes.get("contratoId");

		if (contratoId != null) {
			setContratoId(contratoId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		String motivo = (String)attributes.get("motivo");

		if (motivo != null) {
			setMotivo(motivo);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String titulo = (String)attributes.get("titulo");

		if (titulo != null) {
			setTitulo(titulo);
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

		Date fechamodifica = (Date)attributes.get("fechamodifica");

		if (fechamodifica != null) {
			setFechamodifica(fechamodifica);
		}
	}

	/**
	* Returns the primary key of this contrato.
	*
	* @return the primary key of this contrato
	*/
	@Override
	public com.hitss.layer.service.persistence.ContratoPK getPrimaryKey() {
		return _contrato.getPrimaryKey();
	}

	/**
	* Sets the primary key of this contrato.
	*
	* @param primaryKey the primary key of this contrato
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.ContratoPK primaryKey) {
		_contrato.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the contrato ID of this contrato.
	*
	* @return the contrato ID of this contrato
	*/
	@Override
	public long getContratoId() {
		return _contrato.getContratoId();
	}

	/**
	* Sets the contrato ID of this contrato.
	*
	* @param contratoId the contrato ID of this contrato
	*/
	@Override
	public void setContratoId(long contratoId) {
		_contrato.setContratoId(contratoId);
	}

	/**
	* Returns the usuario ID of this contrato.
	*
	* @return the usuario ID of this contrato
	*/
	@Override
	public long getUsuarioId() {
		return _contrato.getUsuarioId();
	}

	/**
	* Sets the usuario ID of this contrato.
	*
	* @param usuarioId the usuario ID of this contrato
	*/
	@Override
	public void setUsuarioId(long usuarioId) {
		_contrato.setUsuarioId(usuarioId);
	}

	/**
	* Returns the motivo of this contrato.
	*
	* @return the motivo of this contrato
	*/
	@Override
	public java.lang.String getMotivo() {
		return _contrato.getMotivo();
	}

	/**
	* Sets the motivo of this contrato.
	*
	* @param motivo the motivo of this contrato
	*/
	@Override
	public void setMotivo(java.lang.String motivo) {
		_contrato.setMotivo(motivo);
	}

	/**
	* Returns the descripcion of this contrato.
	*
	* @return the descripcion of this contrato
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _contrato.getDescripcion();
	}

	/**
	* Sets the descripcion of this contrato.
	*
	* @param descripcion the descripcion of this contrato
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_contrato.setDescripcion(descripcion);
	}

	/**
	* Returns the titulo of this contrato.
	*
	* @return the titulo of this contrato
	*/
	@Override
	public java.lang.String getTitulo() {
		return _contrato.getTitulo();
	}

	/**
	* Sets the titulo of this contrato.
	*
	* @param titulo the titulo of this contrato
	*/
	@Override
	public void setTitulo(java.lang.String titulo) {
		_contrato.setTitulo(titulo);
	}

	/**
	* Returns the activo of this contrato.
	*
	* @return the activo of this contrato
	*/
	@Override
	public boolean getActivo() {
		return _contrato.getActivo();
	}

	/**
	* Returns <code>true</code> if this contrato is activo.
	*
	* @return <code>true</code> if this contrato is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _contrato.isActivo();
	}

	/**
	* Sets whether this contrato is activo.
	*
	* @param activo the activo of this contrato
	*/
	@Override
	public void setActivo(boolean activo) {
		_contrato.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this contrato.
	*
	* @return the usuariocrea of this contrato
	*/
	@Override
	public long getUsuariocrea() {
		return _contrato.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this contrato.
	*
	* @param usuariocrea the usuariocrea of this contrato
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_contrato.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this contrato.
	*
	* @return the fechacrea of this contrato
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _contrato.getFechacrea();
	}

	/**
	* Sets the fechacrea of this contrato.
	*
	* @param fechacrea the fechacrea of this contrato
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_contrato.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this contrato.
	*
	* @return the usuariomodifica of this contrato
	*/
	@Override
	public long getUsuariomodifica() {
		return _contrato.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this contrato.
	*
	* @param usuariomodifica the usuariomodifica of this contrato
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_contrato.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechamodifica of this contrato.
	*
	* @return the fechamodifica of this contrato
	*/
	@Override
	public java.util.Date getFechamodifica() {
		return _contrato.getFechamodifica();
	}

	/**
	* Sets the fechamodifica of this contrato.
	*
	* @param fechamodifica the fechamodifica of this contrato
	*/
	@Override
	public void setFechamodifica(java.util.Date fechamodifica) {
		_contrato.setFechamodifica(fechamodifica);
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
	public int compareTo(com.hitss.layer.model.Contrato contrato) {
		return _contrato.compareTo(contrato);
	}

	@Override
	public int hashCode() {
		return _contrato.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.Contrato> toCacheModel() {
		return _contrato.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.Contrato toEscapedModel() {
		return new ContratoWrapper(_contrato.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.Contrato toUnescapedModel() {
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
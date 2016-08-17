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
 * This class is a wrapper for {@link SolicitudRequerimientoRequisito}.
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoRequisito
 * @generated
 */
public class SolicitudRequerimientoRequisitoWrapper
	implements SolicitudRequerimientoRequisito,
		ModelWrapper<SolicitudRequerimientoRequisito> {
	public SolicitudRequerimientoRequisitoWrapper(
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito) {
		_solicitudRequerimientoRequisito = solicitudRequerimientoRequisito;
	}

	@Override
	public Class<?> getModelClass() {
		return SolicitudRequerimientoRequisito.class;
	}

	@Override
	public String getModelClassName() {
		return SolicitudRequerimientoRequisito.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudRequerimientoId", getSolicitudRequerimientoId());
		attributes.put("tagId", getTagId());
		attributes.put("nivel", getNivel());
		attributes.put("exigible", getExigible());
		attributes.put("tipoRequisito", getTipoRequisito());
		attributes.put("herramienta", getHerramienta());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long solicitudRequerimientoId = (Long)attributes.get(
				"solicitudRequerimientoId");

		if (solicitudRequerimientoId != null) {
			setSolicitudRequerimientoId(solicitudRequerimientoId);
		}

		Long tagId = (Long)attributes.get("tagId");

		if (tagId != null) {
			setTagId(tagId);
		}

		Long nivel = (Long)attributes.get("nivel");

		if (nivel != null) {
			setNivel(nivel);
		}

		Boolean exigible = (Boolean)attributes.get("exigible");

		if (exigible != null) {
			setExigible(exigible);
		}

		Long tipoRequisito = (Long)attributes.get("tipoRequisito");

		if (tipoRequisito != null) {
			setTipoRequisito(tipoRequisito);
		}

		Long herramienta = (Long)attributes.get("herramienta");

		if (herramienta != null) {
			setHerramienta(herramienta);
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
	* Returns the primary key of this solicitud requerimiento requisito.
	*
	* @return the primary key of this solicitud requerimiento requisito
	*/
	@Override
	public com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK getPrimaryKey() {
		return _solicitudRequerimientoRequisito.getPrimaryKey();
	}

	/**
	* Sets the primary key of this solicitud requerimiento requisito.
	*
	* @param primaryKey the primary key of this solicitud requerimiento requisito
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK primaryKey) {
		_solicitudRequerimientoRequisito.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the solicitud requerimiento ID of this solicitud requerimiento requisito.
	*
	* @return the solicitud requerimiento ID of this solicitud requerimiento requisito
	*/
	@Override
	public long getSolicitudRequerimientoId() {
		return _solicitudRequerimientoRequisito.getSolicitudRequerimientoId();
	}

	/**
	* Sets the solicitud requerimiento ID of this solicitud requerimiento requisito.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID of this solicitud requerimiento requisito
	*/
	@Override
	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_solicitudRequerimientoRequisito.setSolicitudRequerimientoId(solicitudRequerimientoId);
	}

	/**
	* Returns the tag ID of this solicitud requerimiento requisito.
	*
	* @return the tag ID of this solicitud requerimiento requisito
	*/
	@Override
	public long getTagId() {
		return _solicitudRequerimientoRequisito.getTagId();
	}

	/**
	* Sets the tag ID of this solicitud requerimiento requisito.
	*
	* @param tagId the tag ID of this solicitud requerimiento requisito
	*/
	@Override
	public void setTagId(long tagId) {
		_solicitudRequerimientoRequisito.setTagId(tagId);
	}

	/**
	* Returns the nivel of this solicitud requerimiento requisito.
	*
	* @return the nivel of this solicitud requerimiento requisito
	*/
	@Override
	public long getNivel() {
		return _solicitudRequerimientoRequisito.getNivel();
	}

	/**
	* Sets the nivel of this solicitud requerimiento requisito.
	*
	* @param nivel the nivel of this solicitud requerimiento requisito
	*/
	@Override
	public void setNivel(long nivel) {
		_solicitudRequerimientoRequisito.setNivel(nivel);
	}

	/**
	* Returns the exigible of this solicitud requerimiento requisito.
	*
	* @return the exigible of this solicitud requerimiento requisito
	*/
	@Override
	public boolean getExigible() {
		return _solicitudRequerimientoRequisito.getExigible();
	}

	/**
	* Returns <code>true</code> if this solicitud requerimiento requisito is exigible.
	*
	* @return <code>true</code> if this solicitud requerimiento requisito is exigible; <code>false</code> otherwise
	*/
	@Override
	public boolean isExigible() {
		return _solicitudRequerimientoRequisito.isExigible();
	}

	/**
	* Sets whether this solicitud requerimiento requisito is exigible.
	*
	* @param exigible the exigible of this solicitud requerimiento requisito
	*/
	@Override
	public void setExigible(boolean exigible) {
		_solicitudRequerimientoRequisito.setExigible(exigible);
	}

	/**
	* Returns the tipo requisito of this solicitud requerimiento requisito.
	*
	* @return the tipo requisito of this solicitud requerimiento requisito
	*/
	@Override
	public long getTipoRequisito() {
		return _solicitudRequerimientoRequisito.getTipoRequisito();
	}

	/**
	* Sets the tipo requisito of this solicitud requerimiento requisito.
	*
	* @param tipoRequisito the tipo requisito of this solicitud requerimiento requisito
	*/
	@Override
	public void setTipoRequisito(long tipoRequisito) {
		_solicitudRequerimientoRequisito.setTipoRequisito(tipoRequisito);
	}

	/**
	* Returns the herramienta of this solicitud requerimiento requisito.
	*
	* @return the herramienta of this solicitud requerimiento requisito
	*/
	@Override
	public long getHerramienta() {
		return _solicitudRequerimientoRequisito.getHerramienta();
	}

	/**
	* Sets the herramienta of this solicitud requerimiento requisito.
	*
	* @param herramienta the herramienta of this solicitud requerimiento requisito
	*/
	@Override
	public void setHerramienta(long herramienta) {
		_solicitudRequerimientoRequisito.setHerramienta(herramienta);
	}

	/**
	* Returns the activo of this solicitud requerimiento requisito.
	*
	* @return the activo of this solicitud requerimiento requisito
	*/
	@Override
	public boolean getActivo() {
		return _solicitudRequerimientoRequisito.getActivo();
	}

	/**
	* Returns <code>true</code> if this solicitud requerimiento requisito is activo.
	*
	* @return <code>true</code> if this solicitud requerimiento requisito is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _solicitudRequerimientoRequisito.isActivo();
	}

	/**
	* Sets whether this solicitud requerimiento requisito is activo.
	*
	* @param activo the activo of this solicitud requerimiento requisito
	*/
	@Override
	public void setActivo(boolean activo) {
		_solicitudRequerimientoRequisito.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this solicitud requerimiento requisito.
	*
	* @return the usuariocrea of this solicitud requerimiento requisito
	*/
	@Override
	public long getUsuariocrea() {
		return _solicitudRequerimientoRequisito.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this solicitud requerimiento requisito.
	*
	* @param usuariocrea the usuariocrea of this solicitud requerimiento requisito
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_solicitudRequerimientoRequisito.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this solicitud requerimiento requisito.
	*
	* @return the fechacrea of this solicitud requerimiento requisito
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _solicitudRequerimientoRequisito.getFechacrea();
	}

	/**
	* Sets the fechacrea of this solicitud requerimiento requisito.
	*
	* @param fechacrea the fechacrea of this solicitud requerimiento requisito
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_solicitudRequerimientoRequisito.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this solicitud requerimiento requisito.
	*
	* @return the usuariomodifica of this solicitud requerimiento requisito
	*/
	@Override
	public long getUsuariomodifica() {
		return _solicitudRequerimientoRequisito.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this solicitud requerimiento requisito.
	*
	* @param usuariomodifica the usuariomodifica of this solicitud requerimiento requisito
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_solicitudRequerimientoRequisito.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechamodifica of this solicitud requerimiento requisito.
	*
	* @return the fechamodifica of this solicitud requerimiento requisito
	*/
	@Override
	public java.util.Date getFechamodifica() {
		return _solicitudRequerimientoRequisito.getFechamodifica();
	}

	/**
	* Sets the fechamodifica of this solicitud requerimiento requisito.
	*
	* @param fechamodifica the fechamodifica of this solicitud requerimiento requisito
	*/
	@Override
	public void setFechamodifica(java.util.Date fechamodifica) {
		_solicitudRequerimientoRequisito.setFechamodifica(fechamodifica);
	}

	@Override
	public boolean isNew() {
		return _solicitudRequerimientoRequisito.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_solicitudRequerimientoRequisito.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _solicitudRequerimientoRequisito.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_solicitudRequerimientoRequisito.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _solicitudRequerimientoRequisito.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _solicitudRequerimientoRequisito.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_solicitudRequerimientoRequisito.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _solicitudRequerimientoRequisito.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_solicitudRequerimientoRequisito.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_solicitudRequerimientoRequisito.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_solicitudRequerimientoRequisito.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SolicitudRequerimientoRequisitoWrapper((SolicitudRequerimientoRequisito)_solicitudRequerimientoRequisito.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.SolicitudRequerimientoRequisito solicitudRequerimientoRequisito) {
		return _solicitudRequerimientoRequisito.compareTo(solicitudRequerimientoRequisito);
	}

	@Override
	public int hashCode() {
		return _solicitudRequerimientoRequisito.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.SolicitudRequerimientoRequisito> toCacheModel() {
		return _solicitudRequerimientoRequisito.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.SolicitudRequerimientoRequisito toEscapedModel() {
		return new SolicitudRequerimientoRequisitoWrapper(_solicitudRequerimientoRequisito.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.SolicitudRequerimientoRequisito toUnescapedModel() {
		return new SolicitudRequerimientoRequisitoWrapper(_solicitudRequerimientoRequisito.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _solicitudRequerimientoRequisito.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _solicitudRequerimientoRequisito.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_solicitudRequerimientoRequisito.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SolicitudRequerimientoRequisitoWrapper)) {
			return false;
		}

		SolicitudRequerimientoRequisitoWrapper solicitudRequerimientoRequisitoWrapper =
			(SolicitudRequerimientoRequisitoWrapper)obj;

		if (Validator.equals(_solicitudRequerimientoRequisito,
					solicitudRequerimientoRequisitoWrapper._solicitudRequerimientoRequisito)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SolicitudRequerimientoRequisito getWrappedSolicitudRequerimientoRequisito() {
		return _solicitudRequerimientoRequisito;
	}

	@Override
	public SolicitudRequerimientoRequisito getWrappedModel() {
		return _solicitudRequerimientoRequisito;
	}

	@Override
	public void resetOriginalValues() {
		_solicitudRequerimientoRequisito.resetOriginalValues();
	}

	private SolicitudRequerimientoRequisito _solicitudRequerimientoRequisito;
}
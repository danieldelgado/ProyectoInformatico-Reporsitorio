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
 * This class is a wrapper for {@link Postulacion}.
 * </p>
 *
 * @author Danielle Delgado
 * @see Postulacion
 * @generated
 */
public class PostulacionWrapper implements Postulacion,
	ModelWrapper<Postulacion> {
	public PostulacionWrapper(Postulacion postulacion) {
		_postulacion = postulacion;
	}

	@Override
	public Class<?> getModelClass() {
		return Postulacion.class;
	}

	@Override
	public String getModelClassName() {
		return Postulacion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudRequerimientoId", getSolicitudRequerimientoId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("fechaPostulacion", getFechaPostulacion());
		attributes.put("estado", getEstado());
		attributes.put("seleccionado", getSeleccionado());
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

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		Date fechaPostulacion = (Date)attributes.get("fechaPostulacion");

		if (fechaPostulacion != null) {
			setFechaPostulacion(fechaPostulacion);
		}

		Long estado = (Long)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		Boolean seleccionado = (Boolean)attributes.get("seleccionado");

		if (seleccionado != null) {
			setSeleccionado(seleccionado);
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
	* Returns the primary key of this postulacion.
	*
	* @return the primary key of this postulacion
	*/
	@Override
	public com.hitss.layer.service.persistence.PostulacionPK getPrimaryKey() {
		return _postulacion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this postulacion.
	*
	* @param primaryKey the primary key of this postulacion
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.PostulacionPK primaryKey) {
		_postulacion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the solicitud requerimiento ID of this postulacion.
	*
	* @return the solicitud requerimiento ID of this postulacion
	*/
	@Override
	public long getSolicitudRequerimientoId() {
		return _postulacion.getSolicitudRequerimientoId();
	}

	/**
	* Sets the solicitud requerimiento ID of this postulacion.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID of this postulacion
	*/
	@Override
	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_postulacion.setSolicitudRequerimientoId(solicitudRequerimientoId);
	}

	/**
	* Returns the usuario ID of this postulacion.
	*
	* @return the usuario ID of this postulacion
	*/
	@Override
	public long getUsuarioId() {
		return _postulacion.getUsuarioId();
	}

	/**
	* Sets the usuario ID of this postulacion.
	*
	* @param usuarioId the usuario ID of this postulacion
	*/
	@Override
	public void setUsuarioId(long usuarioId) {
		_postulacion.setUsuarioId(usuarioId);
	}

	/**
	* Returns the fecha postulacion of this postulacion.
	*
	* @return the fecha postulacion of this postulacion
	*/
	@Override
	public java.util.Date getFechaPostulacion() {
		return _postulacion.getFechaPostulacion();
	}

	/**
	* Sets the fecha postulacion of this postulacion.
	*
	* @param fechaPostulacion the fecha postulacion of this postulacion
	*/
	@Override
	public void setFechaPostulacion(java.util.Date fechaPostulacion) {
		_postulacion.setFechaPostulacion(fechaPostulacion);
	}

	/**
	* Returns the estado of this postulacion.
	*
	* @return the estado of this postulacion
	*/
	@Override
	public long getEstado() {
		return _postulacion.getEstado();
	}

	/**
	* Sets the estado of this postulacion.
	*
	* @param estado the estado of this postulacion
	*/
	@Override
	public void setEstado(long estado) {
		_postulacion.setEstado(estado);
	}

	/**
	* Returns the seleccionado of this postulacion.
	*
	* @return the seleccionado of this postulacion
	*/
	@Override
	public boolean getSeleccionado() {
		return _postulacion.getSeleccionado();
	}

	/**
	* Returns <code>true</code> if this postulacion is seleccionado.
	*
	* @return <code>true</code> if this postulacion is seleccionado; <code>false</code> otherwise
	*/
	@Override
	public boolean isSeleccionado() {
		return _postulacion.isSeleccionado();
	}

	/**
	* Sets whether this postulacion is seleccionado.
	*
	* @param seleccionado the seleccionado of this postulacion
	*/
	@Override
	public void setSeleccionado(boolean seleccionado) {
		_postulacion.setSeleccionado(seleccionado);
	}

	/**
	* Returns the activo of this postulacion.
	*
	* @return the activo of this postulacion
	*/
	@Override
	public boolean getActivo() {
		return _postulacion.getActivo();
	}

	/**
	* Returns <code>true</code> if this postulacion is activo.
	*
	* @return <code>true</code> if this postulacion is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _postulacion.isActivo();
	}

	/**
	* Sets whether this postulacion is activo.
	*
	* @param activo the activo of this postulacion
	*/
	@Override
	public void setActivo(boolean activo) {
		_postulacion.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this postulacion.
	*
	* @return the usuariocrea of this postulacion
	*/
	@Override
	public long getUsuariocrea() {
		return _postulacion.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this postulacion.
	*
	* @param usuariocrea the usuariocrea of this postulacion
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_postulacion.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this postulacion.
	*
	* @return the fechacrea of this postulacion
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _postulacion.getFechacrea();
	}

	/**
	* Sets the fechacrea of this postulacion.
	*
	* @param fechacrea the fechacrea of this postulacion
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_postulacion.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this postulacion.
	*
	* @return the usuariomodifica of this postulacion
	*/
	@Override
	public long getUsuariomodifica() {
		return _postulacion.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this postulacion.
	*
	* @param usuariomodifica the usuariomodifica of this postulacion
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_postulacion.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechamodifica of this postulacion.
	*
	* @return the fechamodifica of this postulacion
	*/
	@Override
	public java.util.Date getFechamodifica() {
		return _postulacion.getFechamodifica();
	}

	/**
	* Sets the fechamodifica of this postulacion.
	*
	* @param fechamodifica the fechamodifica of this postulacion
	*/
	@Override
	public void setFechamodifica(java.util.Date fechamodifica) {
		_postulacion.setFechamodifica(fechamodifica);
	}

	@Override
	public boolean isNew() {
		return _postulacion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_postulacion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _postulacion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_postulacion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _postulacion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _postulacion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_postulacion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _postulacion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_postulacion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_postulacion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_postulacion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PostulacionWrapper((Postulacion)_postulacion.clone());
	}

	@Override
	public int compareTo(com.hitss.layer.model.Postulacion postulacion) {
		return _postulacion.compareTo(postulacion);
	}

	@Override
	public int hashCode() {
		return _postulacion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.Postulacion> toCacheModel() {
		return _postulacion.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.Postulacion toEscapedModel() {
		return new PostulacionWrapper(_postulacion.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.Postulacion toUnescapedModel() {
		return new PostulacionWrapper(_postulacion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _postulacion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _postulacion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_postulacion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PostulacionWrapper)) {
			return false;
		}

		PostulacionWrapper postulacionWrapper = (PostulacionWrapper)obj;

		if (Validator.equals(_postulacion, postulacionWrapper._postulacion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Postulacion getWrappedPostulacion() {
		return _postulacion;
	}

	@Override
	public Postulacion getWrappedModel() {
		return _postulacion;
	}

	@Override
	public void resetOriginalValues() {
		_postulacion.resetOriginalValues();
	}

	private Postulacion _postulacion;
}
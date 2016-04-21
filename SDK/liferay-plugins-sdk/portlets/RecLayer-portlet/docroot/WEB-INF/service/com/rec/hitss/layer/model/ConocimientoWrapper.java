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
 * This class is a wrapper for {@link Conocimiento}.
 * </p>
 *
 * @author Crossfire
 * @see Conocimiento
 * @generated
 */
public class ConocimientoWrapper implements Conocimiento,
	ModelWrapper<Conocimiento> {
	public ConocimientoWrapper(Conocimiento conocimiento) {
		_conocimiento = conocimiento;
	}

	@Override
	public Class<?> getModelClass() {
		return Conocimiento.class;
	}

	@Override
	public String getModelClassName() {
		return Conocimiento.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("conocimientoId", getConocimientoId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("etiquetaId", getEtiquetaId());
		attributes.put("nivel", getNivel());
		attributes.put("herramiento", getHerramiento());
		attributes.put("implementacion", getImplementacion());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());
		attributes.put("usuarioHitssId", getUsuarioHitssId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long conocimientoId = (Long)attributes.get("conocimientoId");

		if (conocimientoId != null) {
			setConocimientoId(conocimientoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Long etiquetaId = (Long)attributes.get("etiquetaId");

		if (etiquetaId != null) {
			setEtiquetaId(etiquetaId);
		}

		String nivel = (String)attributes.get("nivel");

		if (nivel != null) {
			setNivel(nivel);
		}

		String herramiento = (String)attributes.get("herramiento");

		if (herramiento != null) {
			setHerramiento(herramiento);
		}

		String implementacion = (String)attributes.get("implementacion");

		if (implementacion != null) {
			setImplementacion(implementacion);
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

		Long usuarioHitssId = (Long)attributes.get("usuarioHitssId");

		if (usuarioHitssId != null) {
			setUsuarioHitssId(usuarioHitssId);
		}
	}

	/**
	* Returns the primary key of this conocimiento.
	*
	* @return the primary key of this conocimiento
	*/
	@Override
	public long getPrimaryKey() {
		return _conocimiento.getPrimaryKey();
	}

	/**
	* Sets the primary key of this conocimiento.
	*
	* @param primaryKey the primary key of this conocimiento
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_conocimiento.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the conocimiento ID of this conocimiento.
	*
	* @return the conocimiento ID of this conocimiento
	*/
	@Override
	public long getConocimientoId() {
		return _conocimiento.getConocimientoId();
	}

	/**
	* Sets the conocimiento ID of this conocimiento.
	*
	* @param conocimientoId the conocimiento ID of this conocimiento
	*/
	@Override
	public void setConocimientoId(long conocimientoId) {
		_conocimiento.setConocimientoId(conocimientoId);
	}

	/**
	* Returns the descripcion of this conocimiento.
	*
	* @return the descripcion of this conocimiento
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _conocimiento.getDescripcion();
	}

	/**
	* Sets the descripcion of this conocimiento.
	*
	* @param descripcion the descripcion of this conocimiento
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_conocimiento.setDescripcion(descripcion);
	}

	/**
	* Returns the etiqueta ID of this conocimiento.
	*
	* @return the etiqueta ID of this conocimiento
	*/
	@Override
	public long getEtiquetaId() {
		return _conocimiento.getEtiquetaId();
	}

	/**
	* Sets the etiqueta ID of this conocimiento.
	*
	* @param etiquetaId the etiqueta ID of this conocimiento
	*/
	@Override
	public void setEtiquetaId(long etiquetaId) {
		_conocimiento.setEtiquetaId(etiquetaId);
	}

	/**
	* Returns the nivel of this conocimiento.
	*
	* @return the nivel of this conocimiento
	*/
	@Override
	public java.lang.String getNivel() {
		return _conocimiento.getNivel();
	}

	/**
	* Sets the nivel of this conocimiento.
	*
	* @param nivel the nivel of this conocimiento
	*/
	@Override
	public void setNivel(java.lang.String nivel) {
		_conocimiento.setNivel(nivel);
	}

	/**
	* Returns the herramiento of this conocimiento.
	*
	* @return the herramiento of this conocimiento
	*/
	@Override
	public java.lang.String getHerramiento() {
		return _conocimiento.getHerramiento();
	}

	/**
	* Sets the herramiento of this conocimiento.
	*
	* @param herramiento the herramiento of this conocimiento
	*/
	@Override
	public void setHerramiento(java.lang.String herramiento) {
		_conocimiento.setHerramiento(herramiento);
	}

	/**
	* Returns the implementacion of this conocimiento.
	*
	* @return the implementacion of this conocimiento
	*/
	@Override
	public java.lang.String getImplementacion() {
		return _conocimiento.getImplementacion();
	}

	/**
	* Sets the implementacion of this conocimiento.
	*
	* @param implementacion the implementacion of this conocimiento
	*/
	@Override
	public void setImplementacion(java.lang.String implementacion) {
		_conocimiento.setImplementacion(implementacion);
	}

	/**
	* Returns the activo of this conocimiento.
	*
	* @return the activo of this conocimiento
	*/
	@Override
	public boolean getActivo() {
		return _conocimiento.getActivo();
	}

	/**
	* Returns <code>true</code> if this conocimiento is activo.
	*
	* @return <code>true</code> if this conocimiento is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _conocimiento.isActivo();
	}

	/**
	* Sets whether this conocimiento is activo.
	*
	* @param activo the activo of this conocimiento
	*/
	@Override
	public void setActivo(boolean activo) {
		_conocimiento.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this conocimiento.
	*
	* @return the usuariocrea of this conocimiento
	*/
	@Override
	public long getUsuariocrea() {
		return _conocimiento.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this conocimiento.
	*
	* @param usuariocrea the usuariocrea of this conocimiento
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_conocimiento.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this conocimiento.
	*
	* @return the fechacrea of this conocimiento
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _conocimiento.getFechacrea();
	}

	/**
	* Sets the fechacrea of this conocimiento.
	*
	* @param fechacrea the fechacrea of this conocimiento
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_conocimiento.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this conocimiento.
	*
	* @return the usuariomodifica of this conocimiento
	*/
	@Override
	public long getUsuariomodifica() {
		return _conocimiento.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this conocimiento.
	*
	* @param usuariomodifica the usuariomodifica of this conocimiento
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_conocimiento.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this conocimiento.
	*
	* @return the fechacreamodifica of this conocimiento
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _conocimiento.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this conocimiento.
	*
	* @param fechacreamodifica the fechacreamodifica of this conocimiento
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_conocimiento.setFechacreamodifica(fechacreamodifica);
	}

	/**
	* Returns the usuario hitss ID of this conocimiento.
	*
	* @return the usuario hitss ID of this conocimiento
	*/
	@Override
	public long getUsuarioHitssId() {
		return _conocimiento.getUsuarioHitssId();
	}

	/**
	* Sets the usuario hitss ID of this conocimiento.
	*
	* @param usuarioHitssId the usuario hitss ID of this conocimiento
	*/
	@Override
	public void setUsuarioHitssId(long usuarioHitssId) {
		_conocimiento.setUsuarioHitssId(usuarioHitssId);
	}

	@Override
	public boolean isNew() {
		return _conocimiento.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_conocimiento.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _conocimiento.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_conocimiento.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _conocimiento.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _conocimiento.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_conocimiento.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _conocimiento.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_conocimiento.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_conocimiento.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_conocimiento.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ConocimientoWrapper((Conocimiento)_conocimiento.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.Conocimiento conocimiento) {
		return _conocimiento.compareTo(conocimiento);
	}

	@Override
	public int hashCode() {
		return _conocimiento.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.Conocimiento> toCacheModel() {
		return _conocimiento.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.Conocimiento toEscapedModel() {
		return new ConocimientoWrapper(_conocimiento.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.Conocimiento toUnescapedModel() {
		return new ConocimientoWrapper(_conocimiento.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _conocimiento.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _conocimiento.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_conocimiento.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConocimientoWrapper)) {
			return false;
		}

		ConocimientoWrapper conocimientoWrapper = (ConocimientoWrapper)obj;

		if (Validator.equals(_conocimiento, conocimientoWrapper._conocimiento)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Conocimiento getWrappedConocimiento() {
		return _conocimiento;
	}

	@Override
	public Conocimiento getWrappedModel() {
		return _conocimiento;
	}

	@Override
	public void resetOriginalValues() {
		_conocimiento.resetOriginalValues();
	}

	private Conocimiento _conocimiento;
}
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
 * This class is a wrapper for {@link Estudio}.
 * </p>
 *
 * @author Crossfire
 * @see Estudio
 * @generated
 */
public class EstudioWrapper implements Estudio, ModelWrapper<Estudio> {
	public EstudioWrapper(Estudio estudio) {
		_estudio = estudio;
	}

	@Override
	public Class<?> getModelClass() {
		return Estudio.class;
	}

	@Override
	public String getModelClassName() {
		return Estudio.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("estudioId", getEstudioId());
		attributes.put("nombre", getNombre());
		attributes.put("logro", getLogro());
		attributes.put("fechaInicio", getFechaInicio());
		attributes.put("fechaFino", getFechaFino());
		attributes.put("nivel", getNivel());
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
		Long estudioId = (Long)attributes.get("estudioId");

		if (estudioId != null) {
			setEstudioId(estudioId);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String logro = (String)attributes.get("logro");

		if (logro != null) {
			setLogro(logro);
		}

		Date fechaInicio = (Date)attributes.get("fechaInicio");

		if (fechaInicio != null) {
			setFechaInicio(fechaInicio);
		}

		Date fechaFino = (Date)attributes.get("fechaFino");

		if (fechaFino != null) {
			setFechaFino(fechaFino);
		}

		Long nivel = (Long)attributes.get("nivel");

		if (nivel != null) {
			setNivel(nivel);
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
	* Returns the primary key of this estudio.
	*
	* @return the primary key of this estudio
	*/
	@Override
	public long getPrimaryKey() {
		return _estudio.getPrimaryKey();
	}

	/**
	* Sets the primary key of this estudio.
	*
	* @param primaryKey the primary key of this estudio
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_estudio.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the estudio ID of this estudio.
	*
	* @return the estudio ID of this estudio
	*/
	@Override
	public long getEstudioId() {
		return _estudio.getEstudioId();
	}

	/**
	* Sets the estudio ID of this estudio.
	*
	* @param estudioId the estudio ID of this estudio
	*/
	@Override
	public void setEstudioId(long estudioId) {
		_estudio.setEstudioId(estudioId);
	}

	/**
	* Returns the nombre of this estudio.
	*
	* @return the nombre of this estudio
	*/
	@Override
	public java.lang.String getNombre() {
		return _estudio.getNombre();
	}

	/**
	* Sets the nombre of this estudio.
	*
	* @param nombre the nombre of this estudio
	*/
	@Override
	public void setNombre(java.lang.String nombre) {
		_estudio.setNombre(nombre);
	}

	/**
	* Returns the logro of this estudio.
	*
	* @return the logro of this estudio
	*/
	@Override
	public java.lang.String getLogro() {
		return _estudio.getLogro();
	}

	/**
	* Sets the logro of this estudio.
	*
	* @param logro the logro of this estudio
	*/
	@Override
	public void setLogro(java.lang.String logro) {
		_estudio.setLogro(logro);
	}

	/**
	* Returns the fecha inicio of this estudio.
	*
	* @return the fecha inicio of this estudio
	*/
	@Override
	public java.util.Date getFechaInicio() {
		return _estudio.getFechaInicio();
	}

	/**
	* Sets the fecha inicio of this estudio.
	*
	* @param fechaInicio the fecha inicio of this estudio
	*/
	@Override
	public void setFechaInicio(java.util.Date fechaInicio) {
		_estudio.setFechaInicio(fechaInicio);
	}

	/**
	* Returns the fecha fino of this estudio.
	*
	* @return the fecha fino of this estudio
	*/
	@Override
	public java.util.Date getFechaFino() {
		return _estudio.getFechaFino();
	}

	/**
	* Sets the fecha fino of this estudio.
	*
	* @param fechaFino the fecha fino of this estudio
	*/
	@Override
	public void setFechaFino(java.util.Date fechaFino) {
		_estudio.setFechaFino(fechaFino);
	}

	/**
	* Returns the nivel of this estudio.
	*
	* @return the nivel of this estudio
	*/
	@Override
	public long getNivel() {
		return _estudio.getNivel();
	}

	/**
	* Sets the nivel of this estudio.
	*
	* @param nivel the nivel of this estudio
	*/
	@Override
	public void setNivel(long nivel) {
		_estudio.setNivel(nivel);
	}

	/**
	* Returns the activo of this estudio.
	*
	* @return the activo of this estudio
	*/
	@Override
	public boolean getActivo() {
		return _estudio.getActivo();
	}

	/**
	* Returns <code>true</code> if this estudio is activo.
	*
	* @return <code>true</code> if this estudio is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _estudio.isActivo();
	}

	/**
	* Sets whether this estudio is activo.
	*
	* @param activo the activo of this estudio
	*/
	@Override
	public void setActivo(boolean activo) {
		_estudio.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this estudio.
	*
	* @return the usuariocrea of this estudio
	*/
	@Override
	public long getUsuariocrea() {
		return _estudio.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this estudio.
	*
	* @param usuariocrea the usuariocrea of this estudio
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_estudio.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this estudio.
	*
	* @return the fechacrea of this estudio
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _estudio.getFechacrea();
	}

	/**
	* Sets the fechacrea of this estudio.
	*
	* @param fechacrea the fechacrea of this estudio
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_estudio.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this estudio.
	*
	* @return the usuariomodifica of this estudio
	*/
	@Override
	public long getUsuariomodifica() {
		return _estudio.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this estudio.
	*
	* @param usuariomodifica the usuariomodifica of this estudio
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_estudio.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this estudio.
	*
	* @return the fechacreamodifica of this estudio
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _estudio.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this estudio.
	*
	* @param fechacreamodifica the fechacreamodifica of this estudio
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_estudio.setFechacreamodifica(fechacreamodifica);
	}

	/**
	* Returns the usuario hitss ID of this estudio.
	*
	* @return the usuario hitss ID of this estudio
	*/
	@Override
	public long getUsuarioHitssId() {
		return _estudio.getUsuarioHitssId();
	}

	/**
	* Sets the usuario hitss ID of this estudio.
	*
	* @param usuarioHitssId the usuario hitss ID of this estudio
	*/
	@Override
	public void setUsuarioHitssId(long usuarioHitssId) {
		_estudio.setUsuarioHitssId(usuarioHitssId);
	}

	@Override
	public boolean isNew() {
		return _estudio.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_estudio.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _estudio.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_estudio.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _estudio.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _estudio.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_estudio.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _estudio.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_estudio.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_estudio.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_estudio.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EstudioWrapper((Estudio)_estudio.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.Estudio estudio) {
		return _estudio.compareTo(estudio);
	}

	@Override
	public int hashCode() {
		return _estudio.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.Estudio> toCacheModel() {
		return _estudio.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.Estudio toEscapedModel() {
		return new EstudioWrapper(_estudio.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.Estudio toUnescapedModel() {
		return new EstudioWrapper(_estudio.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _estudio.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _estudio.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_estudio.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EstudioWrapper)) {
			return false;
		}

		EstudioWrapper estudioWrapper = (EstudioWrapper)obj;

		if (Validator.equals(_estudio, estudioWrapper._estudio)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Estudio getWrappedEstudio() {
		return _estudio;
	}

	@Override
	public Estudio getWrappedModel() {
		return _estudio;
	}

	@Override
	public void resetOriginalValues() {
		_estudio.resetOriginalValues();
	}

	private Estudio _estudio;
}
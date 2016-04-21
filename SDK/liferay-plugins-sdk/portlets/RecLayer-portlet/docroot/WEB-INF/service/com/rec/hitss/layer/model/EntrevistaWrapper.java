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
 * This class is a wrapper for {@link Entrevista}.
 * </p>
 *
 * @author Crossfire
 * @see Entrevista
 * @generated
 */
public class EntrevistaWrapper implements Entrevista, ModelWrapper<Entrevista> {
	public EntrevistaWrapper(Entrevista entrevista) {
		_entrevista = entrevista;
	}

	@Override
	public Class<?> getModelClass() {
		return Entrevista.class;
	}

	@Override
	public String getModelClassName() {
		return Entrevista.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("entrevistaId", getEntrevistaId());
		attributes.put("usuarioHitssId", getUsuarioHitssId());
		attributes.put("observacion", getObservacion());
		attributes.put("asistio", getAsistio());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long entrevistaId = (Long)attributes.get("entrevistaId");

		if (entrevistaId != null) {
			setEntrevistaId(entrevistaId);
		}

		Long usuarioHitssId = (Long)attributes.get("usuarioHitssId");

		if (usuarioHitssId != null) {
			setUsuarioHitssId(usuarioHitssId);
		}

		String observacion = (String)attributes.get("observacion");

		if (observacion != null) {
			setObservacion(observacion);
		}

		Boolean asistio = (Boolean)attributes.get("asistio");

		if (asistio != null) {
			setAsistio(asistio);
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
	* Returns the primary key of this entrevista.
	*
	* @return the primary key of this entrevista
	*/
	@Override
	public long getPrimaryKey() {
		return _entrevista.getPrimaryKey();
	}

	/**
	* Sets the primary key of this entrevista.
	*
	* @param primaryKey the primary key of this entrevista
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_entrevista.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the entrevista ID of this entrevista.
	*
	* @return the entrevista ID of this entrevista
	*/
	@Override
	public long getEntrevistaId() {
		return _entrevista.getEntrevistaId();
	}

	/**
	* Sets the entrevista ID of this entrevista.
	*
	* @param entrevistaId the entrevista ID of this entrevista
	*/
	@Override
	public void setEntrevistaId(long entrevistaId) {
		_entrevista.setEntrevistaId(entrevistaId);
	}

	/**
	* Returns the usuario hitss ID of this entrevista.
	*
	* @return the usuario hitss ID of this entrevista
	*/
	@Override
	public long getUsuarioHitssId() {
		return _entrevista.getUsuarioHitssId();
	}

	/**
	* Sets the usuario hitss ID of this entrevista.
	*
	* @param usuarioHitssId the usuario hitss ID of this entrevista
	*/
	@Override
	public void setUsuarioHitssId(long usuarioHitssId) {
		_entrevista.setUsuarioHitssId(usuarioHitssId);
	}

	/**
	* Returns the observacion of this entrevista.
	*
	* @return the observacion of this entrevista
	*/
	@Override
	public java.lang.String getObservacion() {
		return _entrevista.getObservacion();
	}

	/**
	* Sets the observacion of this entrevista.
	*
	* @param observacion the observacion of this entrevista
	*/
	@Override
	public void setObservacion(java.lang.String observacion) {
		_entrevista.setObservacion(observacion);
	}

	/**
	* Returns the asistio of this entrevista.
	*
	* @return the asistio of this entrevista
	*/
	@Override
	public boolean getAsistio() {
		return _entrevista.getAsistio();
	}

	/**
	* Returns <code>true</code> if this entrevista is asistio.
	*
	* @return <code>true</code> if this entrevista is asistio; <code>false</code> otherwise
	*/
	@Override
	public boolean isAsistio() {
		return _entrevista.isAsistio();
	}

	/**
	* Sets whether this entrevista is asistio.
	*
	* @param asistio the asistio of this entrevista
	*/
	@Override
	public void setAsistio(boolean asistio) {
		_entrevista.setAsistio(asistio);
	}

	/**
	* Returns the activo of this entrevista.
	*
	* @return the activo of this entrevista
	*/
	@Override
	public boolean getActivo() {
		return _entrevista.getActivo();
	}

	/**
	* Returns <code>true</code> if this entrevista is activo.
	*
	* @return <code>true</code> if this entrevista is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _entrevista.isActivo();
	}

	/**
	* Sets whether this entrevista is activo.
	*
	* @param activo the activo of this entrevista
	*/
	@Override
	public void setActivo(boolean activo) {
		_entrevista.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this entrevista.
	*
	* @return the usuariocrea of this entrevista
	*/
	@Override
	public long getUsuariocrea() {
		return _entrevista.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this entrevista.
	*
	* @param usuariocrea the usuariocrea of this entrevista
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_entrevista.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this entrevista.
	*
	* @return the fechacrea of this entrevista
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _entrevista.getFechacrea();
	}

	/**
	* Sets the fechacrea of this entrevista.
	*
	* @param fechacrea the fechacrea of this entrevista
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_entrevista.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this entrevista.
	*
	* @return the usuariomodifica of this entrevista
	*/
	@Override
	public long getUsuariomodifica() {
		return _entrevista.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this entrevista.
	*
	* @param usuariomodifica the usuariomodifica of this entrevista
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_entrevista.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this entrevista.
	*
	* @return the fechacreamodifica of this entrevista
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _entrevista.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this entrevista.
	*
	* @param fechacreamodifica the fechacreamodifica of this entrevista
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_entrevista.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _entrevista.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_entrevista.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _entrevista.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_entrevista.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _entrevista.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _entrevista.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_entrevista.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _entrevista.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_entrevista.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_entrevista.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_entrevista.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EntrevistaWrapper((Entrevista)_entrevista.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.Entrevista entrevista) {
		return _entrevista.compareTo(entrevista);
	}

	@Override
	public int hashCode() {
		return _entrevista.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.Entrevista> toCacheModel() {
		return _entrevista.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.Entrevista toEscapedModel() {
		return new EntrevistaWrapper(_entrevista.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.Entrevista toUnescapedModel() {
		return new EntrevistaWrapper(_entrevista.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _entrevista.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _entrevista.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_entrevista.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EntrevistaWrapper)) {
			return false;
		}

		EntrevistaWrapper entrevistaWrapper = (EntrevistaWrapper)obj;

		if (Validator.equals(_entrevista, entrevistaWrapper._entrevista)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Entrevista getWrappedEntrevista() {
		return _entrevista;
	}

	@Override
	public Entrevista getWrappedModel() {
		return _entrevista;
	}

	@Override
	public void resetOriginalValues() {
		_entrevista.resetOriginalValues();
	}

	private Entrevista _entrevista;
}
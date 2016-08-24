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
 * This class is a wrapper for {@link Usuario}.
 * </p>
 *
 * @author Crossfire
 * @see Usuario
 * @generated
 */
public class UsuarioWrapper implements Usuario, ModelWrapper<Usuario> {
	public UsuarioWrapper(Usuario usuario) {
		_usuario = usuario;
	}

	@Override
	public Class<?> getModelClass() {
		return Usuario.class;
	}

	@Override
	public String getModelClassName() {
		return Usuario.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
		attributes.put("usuarioLider", getUsuarioLider());
		attributes.put("lider", getLider());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long usuarioLider = (Long)attributes.get("usuarioLider");

		if (usuarioLider != null) {
			setUsuarioLider(usuarioLider);
		}

		Boolean lider = (Boolean)attributes.get("lider");

		if (lider != null) {
			setLider(lider);
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
	* Returns the primary key of this usuario.
	*
	* @return the primary key of this usuario
	*/
	@Override
	public long getPrimaryKey() {
		return _usuario.getPrimaryKey();
	}

	/**
	* Sets the primary key of this usuario.
	*
	* @param primaryKey the primary key of this usuario
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_usuario.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user ID of this usuario.
	*
	* @return the user ID of this usuario
	*/
	@Override
	public long getUserId() {
		return _usuario.getUserId();
	}

	/**
	* Sets the user ID of this usuario.
	*
	* @param userId the user ID of this usuario
	*/
	@Override
	public void setUserId(long userId) {
		_usuario.setUserId(userId);
	}

	/**
	* Returns the user uuid of this usuario.
	*
	* @return the user uuid of this usuario
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuario.getUserUuid();
	}

	/**
	* Sets the user uuid of this usuario.
	*
	* @param userUuid the user uuid of this usuario
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_usuario.setUserUuid(userUuid);
	}

	/**
	* Returns the usuario lider of this usuario.
	*
	* @return the usuario lider of this usuario
	*/
	@Override
	public long getUsuarioLider() {
		return _usuario.getUsuarioLider();
	}

	/**
	* Sets the usuario lider of this usuario.
	*
	* @param usuarioLider the usuario lider of this usuario
	*/
	@Override
	public void setUsuarioLider(long usuarioLider) {
		_usuario.setUsuarioLider(usuarioLider);
	}

	/**
	* Returns the lider of this usuario.
	*
	* @return the lider of this usuario
	*/
	@Override
	public boolean getLider() {
		return _usuario.getLider();
	}

	/**
	* Returns <code>true</code> if this usuario is lider.
	*
	* @return <code>true</code> if this usuario is lider; <code>false</code> otherwise
	*/
	@Override
	public boolean isLider() {
		return _usuario.isLider();
	}

	/**
	* Sets whether this usuario is lider.
	*
	* @param lider the lider of this usuario
	*/
	@Override
	public void setLider(boolean lider) {
		_usuario.setLider(lider);
	}

	/**
	* Returns the activo of this usuario.
	*
	* @return the activo of this usuario
	*/
	@Override
	public boolean getActivo() {
		return _usuario.getActivo();
	}

	/**
	* Returns <code>true</code> if this usuario is activo.
	*
	* @return <code>true</code> if this usuario is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _usuario.isActivo();
	}

	/**
	* Sets whether this usuario is activo.
	*
	* @param activo the activo of this usuario
	*/
	@Override
	public void setActivo(boolean activo) {
		_usuario.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this usuario.
	*
	* @return the usuariocrea of this usuario
	*/
	@Override
	public long getUsuariocrea() {
		return _usuario.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this usuario.
	*
	* @param usuariocrea the usuariocrea of this usuario
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_usuario.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this usuario.
	*
	* @return the fechacrea of this usuario
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _usuario.getFechacrea();
	}

	/**
	* Sets the fechacrea of this usuario.
	*
	* @param fechacrea the fechacrea of this usuario
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_usuario.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this usuario.
	*
	* @return the usuariomodifica of this usuario
	*/
	@Override
	public long getUsuariomodifica() {
		return _usuario.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this usuario.
	*
	* @param usuariomodifica the usuariomodifica of this usuario
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_usuario.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this usuario.
	*
	* @return the fechacreamodifica of this usuario
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _usuario.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this usuario.
	*
	* @param fechacreamodifica the fechacreamodifica of this usuario
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_usuario.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _usuario.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_usuario.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _usuario.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_usuario.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _usuario.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _usuario.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_usuario.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _usuario.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_usuario.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_usuario.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_usuario.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UsuarioWrapper((Usuario)_usuario.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.Usuario usuario) {
		return _usuario.compareTo(usuario);
	}

	@Override
	public int hashCode() {
		return _usuario.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.Usuario> toCacheModel() {
		return _usuario.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.Usuario toEscapedModel() {
		return new UsuarioWrapper(_usuario.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.Usuario toUnescapedModel() {
		return new UsuarioWrapper(_usuario.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _usuario.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _usuario.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_usuario.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UsuarioWrapper)) {
			return false;
		}

		UsuarioWrapper usuarioWrapper = (UsuarioWrapper)obj;

		if (Validator.equals(_usuario, usuarioWrapper._usuario)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Usuario getWrappedUsuario() {
		return _usuario;
	}

	@Override
	public Usuario getWrappedModel() {
		return _usuario;
	}

	@Override
	public void resetOriginalValues() {
		_usuario.resetOriginalValues();
	}

	private Usuario _usuario;
}
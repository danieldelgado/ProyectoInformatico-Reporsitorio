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
 * This class is a wrapper for {@link Respuesta}.
 * </p>
 *
 * @author Danielle Delgado
 * @see Respuesta
 * @generated
 */
public class RespuestaWrapper implements Respuesta, ModelWrapper<Respuesta> {
	public RespuestaWrapper(Respuesta respuesta) {
		_respuesta = respuesta;
	}

	@Override
	public Class<?> getModelClass() {
		return Respuesta.class;
	}

	@Override
	public String getModelClassName() {
		return Respuesta.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("respuestaId", getRespuestaId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("correcta", getCorrecta());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long respuestaId = (Long)attributes.get("respuestaId");

		if (respuestaId != null) {
			setRespuestaId(respuestaId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Boolean correcta = (Boolean)attributes.get("correcta");

		if (correcta != null) {
			setCorrecta(correcta);
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
	* Returns the primary key of this respuesta.
	*
	* @return the primary key of this respuesta
	*/
	@Override
	public long getPrimaryKey() {
		return _respuesta.getPrimaryKey();
	}

	/**
	* Sets the primary key of this respuesta.
	*
	* @param primaryKey the primary key of this respuesta
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_respuesta.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the respuesta ID of this respuesta.
	*
	* @return the respuesta ID of this respuesta
	*/
	@Override
	public long getRespuestaId() {
		return _respuesta.getRespuestaId();
	}

	/**
	* Sets the respuesta ID of this respuesta.
	*
	* @param respuestaId the respuesta ID of this respuesta
	*/
	@Override
	public void setRespuestaId(long respuestaId) {
		_respuesta.setRespuestaId(respuestaId);
	}

	/**
	* Returns the descripcion of this respuesta.
	*
	* @return the descripcion of this respuesta
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _respuesta.getDescripcion();
	}

	/**
	* Sets the descripcion of this respuesta.
	*
	* @param descripcion the descripcion of this respuesta
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_respuesta.setDescripcion(descripcion);
	}

	/**
	* Returns the correcta of this respuesta.
	*
	* @return the correcta of this respuesta
	*/
	@Override
	public boolean getCorrecta() {
		return _respuesta.getCorrecta();
	}

	/**
	* Returns <code>true</code> if this respuesta is correcta.
	*
	* @return <code>true</code> if this respuesta is correcta; <code>false</code> otherwise
	*/
	@Override
	public boolean isCorrecta() {
		return _respuesta.isCorrecta();
	}

	/**
	* Sets whether this respuesta is correcta.
	*
	* @param correcta the correcta of this respuesta
	*/
	@Override
	public void setCorrecta(boolean correcta) {
		_respuesta.setCorrecta(correcta);
	}

	/**
	* Returns the activo of this respuesta.
	*
	* @return the activo of this respuesta
	*/
	@Override
	public boolean getActivo() {
		return _respuesta.getActivo();
	}

	/**
	* Returns <code>true</code> if this respuesta is activo.
	*
	* @return <code>true</code> if this respuesta is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _respuesta.isActivo();
	}

	/**
	* Sets whether this respuesta is activo.
	*
	* @param activo the activo of this respuesta
	*/
	@Override
	public void setActivo(boolean activo) {
		_respuesta.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this respuesta.
	*
	* @return the usuariocrea of this respuesta
	*/
	@Override
	public long getUsuariocrea() {
		return _respuesta.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this respuesta.
	*
	* @param usuariocrea the usuariocrea of this respuesta
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_respuesta.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this respuesta.
	*
	* @return the fechacrea of this respuesta
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _respuesta.getFechacrea();
	}

	/**
	* Sets the fechacrea of this respuesta.
	*
	* @param fechacrea the fechacrea of this respuesta
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_respuesta.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this respuesta.
	*
	* @return the usuariomodifica of this respuesta
	*/
	@Override
	public long getUsuariomodifica() {
		return _respuesta.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this respuesta.
	*
	* @param usuariomodifica the usuariomodifica of this respuesta
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_respuesta.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechamodifica of this respuesta.
	*
	* @return the fechamodifica of this respuesta
	*/
	@Override
	public java.util.Date getFechamodifica() {
		return _respuesta.getFechamodifica();
	}

	/**
	* Sets the fechamodifica of this respuesta.
	*
	* @param fechamodifica the fechamodifica of this respuesta
	*/
	@Override
	public void setFechamodifica(java.util.Date fechamodifica) {
		_respuesta.setFechamodifica(fechamodifica);
	}

	@Override
	public boolean isNew() {
		return _respuesta.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_respuesta.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _respuesta.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_respuesta.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _respuesta.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _respuesta.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_respuesta.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _respuesta.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_respuesta.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_respuesta.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_respuesta.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RespuestaWrapper((Respuesta)_respuesta.clone());
	}

	@Override
	public int compareTo(com.hitss.layer.model.Respuesta respuesta) {
		return _respuesta.compareTo(respuesta);
	}

	@Override
	public int hashCode() {
		return _respuesta.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.Respuesta> toCacheModel() {
		return _respuesta.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.Respuesta toEscapedModel() {
		return new RespuestaWrapper(_respuesta.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.Respuesta toUnescapedModel() {
		return new RespuestaWrapper(_respuesta.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _respuesta.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _respuesta.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_respuesta.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RespuestaWrapper)) {
			return false;
		}

		RespuestaWrapper respuestaWrapper = (RespuestaWrapper)obj;

		if (Validator.equals(_respuesta, respuestaWrapper._respuesta)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Respuesta getWrappedRespuesta() {
		return _respuesta;
	}

	@Override
	public Respuesta getWrappedModel() {
		return _respuesta;
	}

	@Override
	public void resetOriginalValues() {
		_respuesta.resetOriginalValues();
	}

	private Respuesta _respuesta;
}
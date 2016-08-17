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
 * This class is a wrapper for {@link LogOperaciones}.
 * </p>
 *
 * @author Danielle Delgado
 * @see LogOperaciones
 * @generated
 */
public class LogOperacionesWrapper implements LogOperaciones,
	ModelWrapper<LogOperaciones> {
	public LogOperacionesWrapper(LogOperaciones logOperaciones) {
		_logOperaciones = logOperaciones;
	}

	@Override
	public Class<?> getModelClass() {
		return LogOperaciones.class;
	}

	@Override
	public String getModelClassName() {
		return LogOperaciones.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("logOperacionesId", getLogOperacionesId());
		attributes.put("tipoActividad", getTipoActividad());
		attributes.put("actividad", getActividad());
		attributes.put("usuario", getUsuario());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long logOperacionesId = (Long)attributes.get("logOperacionesId");

		if (logOperacionesId != null) {
			setLogOperacionesId(logOperacionesId);
		}

		Long tipoActividad = (Long)attributes.get("tipoActividad");

		if (tipoActividad != null) {
			setTipoActividad(tipoActividad);
		}

		String actividad = (String)attributes.get("actividad");

		if (actividad != null) {
			setActividad(actividad);
		}

		String usuario = (String)attributes.get("usuario");

		if (usuario != null) {
			setUsuario(usuario);
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
	* Returns the primary key of this log operaciones.
	*
	* @return the primary key of this log operaciones
	*/
	@Override
	public long getPrimaryKey() {
		return _logOperaciones.getPrimaryKey();
	}

	/**
	* Sets the primary key of this log operaciones.
	*
	* @param primaryKey the primary key of this log operaciones
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_logOperaciones.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the log operaciones ID of this log operaciones.
	*
	* @return the log operaciones ID of this log operaciones
	*/
	@Override
	public long getLogOperacionesId() {
		return _logOperaciones.getLogOperacionesId();
	}

	/**
	* Sets the log operaciones ID of this log operaciones.
	*
	* @param logOperacionesId the log operaciones ID of this log operaciones
	*/
	@Override
	public void setLogOperacionesId(long logOperacionesId) {
		_logOperaciones.setLogOperacionesId(logOperacionesId);
	}

	/**
	* Returns the tipo actividad of this log operaciones.
	*
	* @return the tipo actividad of this log operaciones
	*/
	@Override
	public long getTipoActividad() {
		return _logOperaciones.getTipoActividad();
	}

	/**
	* Sets the tipo actividad of this log operaciones.
	*
	* @param tipoActividad the tipo actividad of this log operaciones
	*/
	@Override
	public void setTipoActividad(long tipoActividad) {
		_logOperaciones.setTipoActividad(tipoActividad);
	}

	/**
	* Returns the actividad of this log operaciones.
	*
	* @return the actividad of this log operaciones
	*/
	@Override
	public java.lang.String getActividad() {
		return _logOperaciones.getActividad();
	}

	/**
	* Sets the actividad of this log operaciones.
	*
	* @param actividad the actividad of this log operaciones
	*/
	@Override
	public void setActividad(java.lang.String actividad) {
		_logOperaciones.setActividad(actividad);
	}

	/**
	* Returns the usuario of this log operaciones.
	*
	* @return the usuario of this log operaciones
	*/
	@Override
	public java.lang.String getUsuario() {
		return _logOperaciones.getUsuario();
	}

	/**
	* Sets the usuario of this log operaciones.
	*
	* @param usuario the usuario of this log operaciones
	*/
	@Override
	public void setUsuario(java.lang.String usuario) {
		_logOperaciones.setUsuario(usuario);
	}

	/**
	* Returns the activo of this log operaciones.
	*
	* @return the activo of this log operaciones
	*/
	@Override
	public boolean getActivo() {
		return _logOperaciones.getActivo();
	}

	/**
	* Returns <code>true</code> if this log operaciones is activo.
	*
	* @return <code>true</code> if this log operaciones is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _logOperaciones.isActivo();
	}

	/**
	* Sets whether this log operaciones is activo.
	*
	* @param activo the activo of this log operaciones
	*/
	@Override
	public void setActivo(boolean activo) {
		_logOperaciones.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this log operaciones.
	*
	* @return the usuariocrea of this log operaciones
	*/
	@Override
	public long getUsuariocrea() {
		return _logOperaciones.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this log operaciones.
	*
	* @param usuariocrea the usuariocrea of this log operaciones
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_logOperaciones.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this log operaciones.
	*
	* @return the fechacrea of this log operaciones
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _logOperaciones.getFechacrea();
	}

	/**
	* Sets the fechacrea of this log operaciones.
	*
	* @param fechacrea the fechacrea of this log operaciones
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_logOperaciones.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this log operaciones.
	*
	* @return the usuariomodifica of this log operaciones
	*/
	@Override
	public long getUsuariomodifica() {
		return _logOperaciones.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this log operaciones.
	*
	* @param usuariomodifica the usuariomodifica of this log operaciones
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_logOperaciones.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechamodifica of this log operaciones.
	*
	* @return the fechamodifica of this log operaciones
	*/
	@Override
	public java.util.Date getFechamodifica() {
		return _logOperaciones.getFechamodifica();
	}

	/**
	* Sets the fechamodifica of this log operaciones.
	*
	* @param fechamodifica the fechamodifica of this log operaciones
	*/
	@Override
	public void setFechamodifica(java.util.Date fechamodifica) {
		_logOperaciones.setFechamodifica(fechamodifica);
	}

	@Override
	public boolean isNew() {
		return _logOperaciones.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_logOperaciones.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _logOperaciones.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_logOperaciones.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _logOperaciones.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _logOperaciones.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_logOperaciones.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _logOperaciones.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_logOperaciones.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_logOperaciones.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_logOperaciones.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LogOperacionesWrapper((LogOperaciones)_logOperaciones.clone());
	}

	@Override
	public int compareTo(com.hitss.layer.model.LogOperaciones logOperaciones) {
		return _logOperaciones.compareTo(logOperaciones);
	}

	@Override
	public int hashCode() {
		return _logOperaciones.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.LogOperaciones> toCacheModel() {
		return _logOperaciones.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.LogOperaciones toEscapedModel() {
		return new LogOperacionesWrapper(_logOperaciones.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.LogOperaciones toUnescapedModel() {
		return new LogOperacionesWrapper(_logOperaciones.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _logOperaciones.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _logOperaciones.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_logOperaciones.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LogOperacionesWrapper)) {
			return false;
		}

		LogOperacionesWrapper logOperacionesWrapper = (LogOperacionesWrapper)obj;

		if (Validator.equals(_logOperaciones,
					logOperacionesWrapper._logOperaciones)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LogOperaciones getWrappedLogOperaciones() {
		return _logOperaciones;
	}

	@Override
	public LogOperaciones getWrappedModel() {
		return _logOperaciones;
	}

	@Override
	public void resetOriginalValues() {
		_logOperaciones.resetOriginalValues();
	}

	private LogOperaciones _logOperaciones;
}
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
 * This class is a wrapper for {@link InformeRetroalimentacion}.
 * </p>
 *
 * @author Danielle Delgado
 * @see InformeRetroalimentacion
 * @generated
 */
public class InformeRetroalimentacionWrapper implements InformeRetroalimentacion,
	ModelWrapper<InformeRetroalimentacion> {
	public InformeRetroalimentacionWrapper(
		InformeRetroalimentacion informeRetroalimentacion) {
		_informeRetroalimentacion = informeRetroalimentacion;
	}

	@Override
	public Class<?> getModelClass() {
		return InformeRetroalimentacion.class;
	}

	@Override
	public String getModelClassName() {
		return InformeRetroalimentacion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("informeRetroalimentacionId",
			getInformeRetroalimentacionId());
		attributes.put("regisitrarActividadPlanUsuariocoId",
			getRegisitrarActividadPlanUsuariocoId());
		attributes.put("usuario", getUsuario());
		attributes.put("descripcion", getDescripcion());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long informeRetroalimentacionId = (Long)attributes.get(
				"informeRetroalimentacionId");

		if (informeRetroalimentacionId != null) {
			setInformeRetroalimentacionId(informeRetroalimentacionId);
		}

		Long regisitrarActividadPlanUsuariocoId = (Long)attributes.get(
				"regisitrarActividadPlanUsuariocoId");

		if (regisitrarActividadPlanUsuariocoId != null) {
			setRegisitrarActividadPlanUsuariocoId(regisitrarActividadPlanUsuariocoId);
		}

		Long usuario = (Long)attributes.get("usuario");

		if (usuario != null) {
			setUsuario(usuario);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
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
	* Returns the primary key of this informe retroalimentacion.
	*
	* @return the primary key of this informe retroalimentacion
	*/
	@Override
	public long getPrimaryKey() {
		return _informeRetroalimentacion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this informe retroalimentacion.
	*
	* @param primaryKey the primary key of this informe retroalimentacion
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_informeRetroalimentacion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the informe retroalimentacion ID of this informe retroalimentacion.
	*
	* @return the informe retroalimentacion ID of this informe retroalimentacion
	*/
	@Override
	public long getInformeRetroalimentacionId() {
		return _informeRetroalimentacion.getInformeRetroalimentacionId();
	}

	/**
	* Sets the informe retroalimentacion ID of this informe retroalimentacion.
	*
	* @param informeRetroalimentacionId the informe retroalimentacion ID of this informe retroalimentacion
	*/
	@Override
	public void setInformeRetroalimentacionId(long informeRetroalimentacionId) {
		_informeRetroalimentacion.setInformeRetroalimentacionId(informeRetroalimentacionId);
	}

	/**
	* Returns the regisitrar actividad plan usuarioco ID of this informe retroalimentacion.
	*
	* @return the regisitrar actividad plan usuarioco ID of this informe retroalimentacion
	*/
	@Override
	public long getRegisitrarActividadPlanUsuariocoId() {
		return _informeRetroalimentacion.getRegisitrarActividadPlanUsuariocoId();
	}

	/**
	* Sets the regisitrar actividad plan usuarioco ID of this informe retroalimentacion.
	*
	* @param regisitrarActividadPlanUsuariocoId the regisitrar actividad plan usuarioco ID of this informe retroalimentacion
	*/
	@Override
	public void setRegisitrarActividadPlanUsuariocoId(
		long regisitrarActividadPlanUsuariocoId) {
		_informeRetroalimentacion.setRegisitrarActividadPlanUsuariocoId(regisitrarActividadPlanUsuariocoId);
	}

	/**
	* Returns the usuario of this informe retroalimentacion.
	*
	* @return the usuario of this informe retroalimentacion
	*/
	@Override
	public long getUsuario() {
		return _informeRetroalimentacion.getUsuario();
	}

	/**
	* Sets the usuario of this informe retroalimentacion.
	*
	* @param usuario the usuario of this informe retroalimentacion
	*/
	@Override
	public void setUsuario(long usuario) {
		_informeRetroalimentacion.setUsuario(usuario);
	}

	/**
	* Returns the descripcion of this informe retroalimentacion.
	*
	* @return the descripcion of this informe retroalimentacion
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _informeRetroalimentacion.getDescripcion();
	}

	/**
	* Sets the descripcion of this informe retroalimentacion.
	*
	* @param descripcion the descripcion of this informe retroalimentacion
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_informeRetroalimentacion.setDescripcion(descripcion);
	}

	/**
	* Returns the activo of this informe retroalimentacion.
	*
	* @return the activo of this informe retroalimentacion
	*/
	@Override
	public boolean getActivo() {
		return _informeRetroalimentacion.getActivo();
	}

	/**
	* Returns <code>true</code> if this informe retroalimentacion is activo.
	*
	* @return <code>true</code> if this informe retroalimentacion is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _informeRetroalimentacion.isActivo();
	}

	/**
	* Sets whether this informe retroalimentacion is activo.
	*
	* @param activo the activo of this informe retroalimentacion
	*/
	@Override
	public void setActivo(boolean activo) {
		_informeRetroalimentacion.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this informe retroalimentacion.
	*
	* @return the usuariocrea of this informe retroalimentacion
	*/
	@Override
	public long getUsuariocrea() {
		return _informeRetroalimentacion.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this informe retroalimentacion.
	*
	* @param usuariocrea the usuariocrea of this informe retroalimentacion
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_informeRetroalimentacion.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this informe retroalimentacion.
	*
	* @return the fechacrea of this informe retroalimentacion
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _informeRetroalimentacion.getFechacrea();
	}

	/**
	* Sets the fechacrea of this informe retroalimentacion.
	*
	* @param fechacrea the fechacrea of this informe retroalimentacion
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_informeRetroalimentacion.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this informe retroalimentacion.
	*
	* @return the usuariomodifica of this informe retroalimentacion
	*/
	@Override
	public long getUsuariomodifica() {
		return _informeRetroalimentacion.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this informe retroalimentacion.
	*
	* @param usuariomodifica the usuariomodifica of this informe retroalimentacion
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_informeRetroalimentacion.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechamodifica of this informe retroalimentacion.
	*
	* @return the fechamodifica of this informe retroalimentacion
	*/
	@Override
	public java.util.Date getFechamodifica() {
		return _informeRetroalimentacion.getFechamodifica();
	}

	/**
	* Sets the fechamodifica of this informe retroalimentacion.
	*
	* @param fechamodifica the fechamodifica of this informe retroalimentacion
	*/
	@Override
	public void setFechamodifica(java.util.Date fechamodifica) {
		_informeRetroalimentacion.setFechamodifica(fechamodifica);
	}

	@Override
	public boolean isNew() {
		return _informeRetroalimentacion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_informeRetroalimentacion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _informeRetroalimentacion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_informeRetroalimentacion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _informeRetroalimentacion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _informeRetroalimentacion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_informeRetroalimentacion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _informeRetroalimentacion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_informeRetroalimentacion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_informeRetroalimentacion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_informeRetroalimentacion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InformeRetroalimentacionWrapper((InformeRetroalimentacion)_informeRetroalimentacion.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.InformeRetroalimentacion informeRetroalimentacion) {
		return _informeRetroalimentacion.compareTo(informeRetroalimentacion);
	}

	@Override
	public int hashCode() {
		return _informeRetroalimentacion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.InformeRetroalimentacion> toCacheModel() {
		return _informeRetroalimentacion.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.InformeRetroalimentacion toEscapedModel() {
		return new InformeRetroalimentacionWrapper(_informeRetroalimentacion.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.InformeRetroalimentacion toUnescapedModel() {
		return new InformeRetroalimentacionWrapper(_informeRetroalimentacion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _informeRetroalimentacion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _informeRetroalimentacion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_informeRetroalimentacion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InformeRetroalimentacionWrapper)) {
			return false;
		}

		InformeRetroalimentacionWrapper informeRetroalimentacionWrapper = (InformeRetroalimentacionWrapper)obj;

		if (Validator.equals(_informeRetroalimentacion,
					informeRetroalimentacionWrapper._informeRetroalimentacion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public InformeRetroalimentacion getWrappedInformeRetroalimentacion() {
		return _informeRetroalimentacion;
	}

	@Override
	public InformeRetroalimentacion getWrappedModel() {
		return _informeRetroalimentacion;
	}

	@Override
	public void resetOriginalValues() {
		_informeRetroalimentacion.resetOriginalValues();
	}

	private InformeRetroalimentacion _informeRetroalimentacion;
}
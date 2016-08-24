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
 * This class is a wrapper for {@link RegisitrarActividadPlanUsuario}.
 * </p>
 *
 * @author Danielle Delgado
 * @see RegisitrarActividadPlanUsuario
 * @generated
 */
public class RegisitrarActividadPlanUsuarioWrapper
	implements RegisitrarActividadPlanUsuario,
		ModelWrapper<RegisitrarActividadPlanUsuario> {
	public RegisitrarActividadPlanUsuarioWrapper(
		RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario) {
		_regisitrarActividadPlanUsuario = regisitrarActividadPlanUsuario;
	}

	@Override
	public Class<?> getModelClass() {
		return RegisitrarActividadPlanUsuario.class;
	}

	@Override
	public String getModelClassName() {
		return RegisitrarActividadPlanUsuario.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("actividadPlanId", getActividadPlanId());
		attributes.put("regisitrarActividadPlanUsuariocoId",
			getRegisitrarActividadPlanUsuariocoId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("cumplio", getCumplio());
		attributes.put("actividad", getActividad());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long actividadPlanId = (Long)attributes.get("actividadPlanId");

		if (actividadPlanId != null) {
			setActividadPlanId(actividadPlanId);
		}

		Long regisitrarActividadPlanUsuariocoId = (Long)attributes.get(
				"regisitrarActividadPlanUsuariocoId");

		if (regisitrarActividadPlanUsuariocoId != null) {
			setRegisitrarActividadPlanUsuariocoId(regisitrarActividadPlanUsuariocoId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		Long cumplio = (Long)attributes.get("cumplio");

		if (cumplio != null) {
			setCumplio(cumplio);
		}

		String actividad = (String)attributes.get("actividad");

		if (actividad != null) {
			setActividad(actividad);
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
	* Returns the primary key of this regisitrar actividad plan usuario.
	*
	* @return the primary key of this regisitrar actividad plan usuario
	*/
	@Override
	public com.hitss.layer.service.persistence.RegisitrarActividadPlanUsuarioPK getPrimaryKey() {
		return _regisitrarActividadPlanUsuario.getPrimaryKey();
	}

	/**
	* Sets the primary key of this regisitrar actividad plan usuario.
	*
	* @param primaryKey the primary key of this regisitrar actividad plan usuario
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.RegisitrarActividadPlanUsuarioPK primaryKey) {
		_regisitrarActividadPlanUsuario.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the actividad plan ID of this regisitrar actividad plan usuario.
	*
	* @return the actividad plan ID of this regisitrar actividad plan usuario
	*/
	@Override
	public long getActividadPlanId() {
		return _regisitrarActividadPlanUsuario.getActividadPlanId();
	}

	/**
	* Sets the actividad plan ID of this regisitrar actividad plan usuario.
	*
	* @param actividadPlanId the actividad plan ID of this regisitrar actividad plan usuario
	*/
	@Override
	public void setActividadPlanId(long actividadPlanId) {
		_regisitrarActividadPlanUsuario.setActividadPlanId(actividadPlanId);
	}

	/**
	* Returns the regisitrar actividad plan usuarioco ID of this regisitrar actividad plan usuario.
	*
	* @return the regisitrar actividad plan usuarioco ID of this regisitrar actividad plan usuario
	*/
	@Override
	public long getRegisitrarActividadPlanUsuariocoId() {
		return _regisitrarActividadPlanUsuario.getRegisitrarActividadPlanUsuariocoId();
	}

	/**
	* Sets the regisitrar actividad plan usuarioco ID of this regisitrar actividad plan usuario.
	*
	* @param regisitrarActividadPlanUsuariocoId the regisitrar actividad plan usuarioco ID of this regisitrar actividad plan usuario
	*/
	@Override
	public void setRegisitrarActividadPlanUsuariocoId(
		long regisitrarActividadPlanUsuariocoId) {
		_regisitrarActividadPlanUsuario.setRegisitrarActividadPlanUsuariocoId(regisitrarActividadPlanUsuariocoId);
	}

	/**
	* Returns the usuario ID of this regisitrar actividad plan usuario.
	*
	* @return the usuario ID of this regisitrar actividad plan usuario
	*/
	@Override
	public long getUsuarioId() {
		return _regisitrarActividadPlanUsuario.getUsuarioId();
	}

	/**
	* Sets the usuario ID of this regisitrar actividad plan usuario.
	*
	* @param usuarioId the usuario ID of this regisitrar actividad plan usuario
	*/
	@Override
	public void setUsuarioId(long usuarioId) {
		_regisitrarActividadPlanUsuario.setUsuarioId(usuarioId);
	}

	/**
	* Returns the cumplio of this regisitrar actividad plan usuario.
	*
	* @return the cumplio of this regisitrar actividad plan usuario
	*/
	@Override
	public long getCumplio() {
		return _regisitrarActividadPlanUsuario.getCumplio();
	}

	/**
	* Sets the cumplio of this regisitrar actividad plan usuario.
	*
	* @param cumplio the cumplio of this regisitrar actividad plan usuario
	*/
	@Override
	public void setCumplio(long cumplio) {
		_regisitrarActividadPlanUsuario.setCumplio(cumplio);
	}

	/**
	* Returns the actividad of this regisitrar actividad plan usuario.
	*
	* @return the actividad of this regisitrar actividad plan usuario
	*/
	@Override
	public java.lang.String getActividad() {
		return _regisitrarActividadPlanUsuario.getActividad();
	}

	/**
	* Sets the actividad of this regisitrar actividad plan usuario.
	*
	* @param actividad the actividad of this regisitrar actividad plan usuario
	*/
	@Override
	public void setActividad(java.lang.String actividad) {
		_regisitrarActividadPlanUsuario.setActividad(actividad);
	}

	/**
	* Returns the activo of this regisitrar actividad plan usuario.
	*
	* @return the activo of this regisitrar actividad plan usuario
	*/
	@Override
	public boolean getActivo() {
		return _regisitrarActividadPlanUsuario.getActivo();
	}

	/**
	* Returns <code>true</code> if this regisitrar actividad plan usuario is activo.
	*
	* @return <code>true</code> if this regisitrar actividad plan usuario is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _regisitrarActividadPlanUsuario.isActivo();
	}

	/**
	* Sets whether this regisitrar actividad plan usuario is activo.
	*
	* @param activo the activo of this regisitrar actividad plan usuario
	*/
	@Override
	public void setActivo(boolean activo) {
		_regisitrarActividadPlanUsuario.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this regisitrar actividad plan usuario.
	*
	* @return the usuariocrea of this regisitrar actividad plan usuario
	*/
	@Override
	public long getUsuariocrea() {
		return _regisitrarActividadPlanUsuario.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this regisitrar actividad plan usuario.
	*
	* @param usuariocrea the usuariocrea of this regisitrar actividad plan usuario
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_regisitrarActividadPlanUsuario.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this regisitrar actividad plan usuario.
	*
	* @return the fechacrea of this regisitrar actividad plan usuario
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _regisitrarActividadPlanUsuario.getFechacrea();
	}

	/**
	* Sets the fechacrea of this regisitrar actividad plan usuario.
	*
	* @param fechacrea the fechacrea of this regisitrar actividad plan usuario
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_regisitrarActividadPlanUsuario.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this regisitrar actividad plan usuario.
	*
	* @return the usuariomodifica of this regisitrar actividad plan usuario
	*/
	@Override
	public long getUsuariomodifica() {
		return _regisitrarActividadPlanUsuario.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this regisitrar actividad plan usuario.
	*
	* @param usuariomodifica the usuariomodifica of this regisitrar actividad plan usuario
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_regisitrarActividadPlanUsuario.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechamodifica of this regisitrar actividad plan usuario.
	*
	* @return the fechamodifica of this regisitrar actividad plan usuario
	*/
	@Override
	public java.util.Date getFechamodifica() {
		return _regisitrarActividadPlanUsuario.getFechamodifica();
	}

	/**
	* Sets the fechamodifica of this regisitrar actividad plan usuario.
	*
	* @param fechamodifica the fechamodifica of this regisitrar actividad plan usuario
	*/
	@Override
	public void setFechamodifica(java.util.Date fechamodifica) {
		_regisitrarActividadPlanUsuario.setFechamodifica(fechamodifica);
	}

	@Override
	public boolean isNew() {
		return _regisitrarActividadPlanUsuario.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_regisitrarActividadPlanUsuario.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _regisitrarActividadPlanUsuario.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_regisitrarActividadPlanUsuario.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _regisitrarActividadPlanUsuario.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _regisitrarActividadPlanUsuario.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_regisitrarActividadPlanUsuario.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _regisitrarActividadPlanUsuario.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_regisitrarActividadPlanUsuario.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_regisitrarActividadPlanUsuario.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_regisitrarActividadPlanUsuario.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RegisitrarActividadPlanUsuarioWrapper((RegisitrarActividadPlanUsuario)_regisitrarActividadPlanUsuario.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario) {
		return _regisitrarActividadPlanUsuario.compareTo(regisitrarActividadPlanUsuario);
	}

	@Override
	public int hashCode() {
		return _regisitrarActividadPlanUsuario.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.RegisitrarActividadPlanUsuario> toCacheModel() {
		return _regisitrarActividadPlanUsuario.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.RegisitrarActividadPlanUsuario toEscapedModel() {
		return new RegisitrarActividadPlanUsuarioWrapper(_regisitrarActividadPlanUsuario.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.RegisitrarActividadPlanUsuario toUnescapedModel() {
		return new RegisitrarActividadPlanUsuarioWrapper(_regisitrarActividadPlanUsuario.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _regisitrarActividadPlanUsuario.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _regisitrarActividadPlanUsuario.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_regisitrarActividadPlanUsuario.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RegisitrarActividadPlanUsuarioWrapper)) {
			return false;
		}

		RegisitrarActividadPlanUsuarioWrapper regisitrarActividadPlanUsuarioWrapper =
			(RegisitrarActividadPlanUsuarioWrapper)obj;

		if (Validator.equals(_regisitrarActividadPlanUsuario,
					regisitrarActividadPlanUsuarioWrapper._regisitrarActividadPlanUsuario)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public RegisitrarActividadPlanUsuario getWrappedRegisitrarActividadPlanUsuario() {
		return _regisitrarActividadPlanUsuario;
	}

	@Override
	public RegisitrarActividadPlanUsuario getWrappedModel() {
		return _regisitrarActividadPlanUsuario;
	}

	@Override
	public void resetOriginalValues() {
		_regisitrarActividadPlanUsuario.resetOriginalValues();
	}

	private RegisitrarActividadPlanUsuario _regisitrarActividadPlanUsuario;
}
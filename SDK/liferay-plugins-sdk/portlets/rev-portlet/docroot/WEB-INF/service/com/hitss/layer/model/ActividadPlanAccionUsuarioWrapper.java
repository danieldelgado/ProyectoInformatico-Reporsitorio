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
 * This class is a wrapper for {@link ActividadPlanAccionUsuario}.
 * </p>
 *
 * @author Danielle Delgado
 * @see ActividadPlanAccionUsuario
 * @generated
 */
public class ActividadPlanAccionUsuarioWrapper
	implements ActividadPlanAccionUsuario,
		ModelWrapper<ActividadPlanAccionUsuario> {
	public ActividadPlanAccionUsuarioWrapper(
		ActividadPlanAccionUsuario actividadPlanAccionUsuario) {
		_actividadPlanAccionUsuario = actividadPlanAccionUsuario;
	}

	@Override
	public Class<?> getModelClass() {
		return ActividadPlanAccionUsuario.class;
	}

	@Override
	public String getModelClassName() {
		return ActividadPlanAccionUsuario.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("actividadPlanAccionUsuariocoId",
			getActividadPlanAccionUsuariocoId());
		attributes.put("actividadPlanId", getActividadPlanId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("cumplio", getCumplio());
		attributes.put("actividad", getActividad());
		attributes.put("puntuacion", getPuntuacion());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long actividadPlanAccionUsuariocoId = (Long)attributes.get(
				"actividadPlanAccionUsuariocoId");

		if (actividadPlanAccionUsuariocoId != null) {
			setActividadPlanAccionUsuariocoId(actividadPlanAccionUsuariocoId);
		}

		Long actividadPlanId = (Long)attributes.get("actividadPlanId");

		if (actividadPlanId != null) {
			setActividadPlanId(actividadPlanId);
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

		Integer puntuacion = (Integer)attributes.get("puntuacion");

		if (puntuacion != null) {
			setPuntuacion(puntuacion);
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
	* Returns the primary key of this actividad plan accion usuario.
	*
	* @return the primary key of this actividad plan accion usuario
	*/
	@Override
	public com.hitss.layer.service.persistence.ActividadPlanAccionUsuarioPK getPrimaryKey() {
		return _actividadPlanAccionUsuario.getPrimaryKey();
	}

	/**
	* Sets the primary key of this actividad plan accion usuario.
	*
	* @param primaryKey the primary key of this actividad plan accion usuario
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.ActividadPlanAccionUsuarioPK primaryKey) {
		_actividadPlanAccionUsuario.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the actividad plan accion usuarioco ID of this actividad plan accion usuario.
	*
	* @return the actividad plan accion usuarioco ID of this actividad plan accion usuario
	*/
	@Override
	public long getActividadPlanAccionUsuariocoId() {
		return _actividadPlanAccionUsuario.getActividadPlanAccionUsuariocoId();
	}

	/**
	* Sets the actividad plan accion usuarioco ID of this actividad plan accion usuario.
	*
	* @param actividadPlanAccionUsuariocoId the actividad plan accion usuarioco ID of this actividad plan accion usuario
	*/
	@Override
	public void setActividadPlanAccionUsuariocoId(
		long actividadPlanAccionUsuariocoId) {
		_actividadPlanAccionUsuario.setActividadPlanAccionUsuariocoId(actividadPlanAccionUsuariocoId);
	}

	/**
	* Returns the actividad plan ID of this actividad plan accion usuario.
	*
	* @return the actividad plan ID of this actividad plan accion usuario
	*/
	@Override
	public long getActividadPlanId() {
		return _actividadPlanAccionUsuario.getActividadPlanId();
	}

	/**
	* Sets the actividad plan ID of this actividad plan accion usuario.
	*
	* @param actividadPlanId the actividad plan ID of this actividad plan accion usuario
	*/
	@Override
	public void setActividadPlanId(long actividadPlanId) {
		_actividadPlanAccionUsuario.setActividadPlanId(actividadPlanId);
	}

	/**
	* Returns the usuario ID of this actividad plan accion usuario.
	*
	* @return the usuario ID of this actividad plan accion usuario
	*/
	@Override
	public long getUsuarioId() {
		return _actividadPlanAccionUsuario.getUsuarioId();
	}

	/**
	* Sets the usuario ID of this actividad plan accion usuario.
	*
	* @param usuarioId the usuario ID of this actividad plan accion usuario
	*/
	@Override
	public void setUsuarioId(long usuarioId) {
		_actividadPlanAccionUsuario.setUsuarioId(usuarioId);
	}

	/**
	* Returns the cumplio of this actividad plan accion usuario.
	*
	* @return the cumplio of this actividad plan accion usuario
	*/
	@Override
	public long getCumplio() {
		return _actividadPlanAccionUsuario.getCumplio();
	}

	/**
	* Sets the cumplio of this actividad plan accion usuario.
	*
	* @param cumplio the cumplio of this actividad plan accion usuario
	*/
	@Override
	public void setCumplio(long cumplio) {
		_actividadPlanAccionUsuario.setCumplio(cumplio);
	}

	/**
	* Returns the actividad of this actividad plan accion usuario.
	*
	* @return the actividad of this actividad plan accion usuario
	*/
	@Override
	public java.lang.String getActividad() {
		return _actividadPlanAccionUsuario.getActividad();
	}

	/**
	* Sets the actividad of this actividad plan accion usuario.
	*
	* @param actividad the actividad of this actividad plan accion usuario
	*/
	@Override
	public void setActividad(java.lang.String actividad) {
		_actividadPlanAccionUsuario.setActividad(actividad);
	}

	/**
	* Returns the puntuacion of this actividad plan accion usuario.
	*
	* @return the puntuacion of this actividad plan accion usuario
	*/
	@Override
	public int getPuntuacion() {
		return _actividadPlanAccionUsuario.getPuntuacion();
	}

	/**
	* Sets the puntuacion of this actividad plan accion usuario.
	*
	* @param puntuacion the puntuacion of this actividad plan accion usuario
	*/
	@Override
	public void setPuntuacion(int puntuacion) {
		_actividadPlanAccionUsuario.setPuntuacion(puntuacion);
	}

	/**
	* Returns the activo of this actividad plan accion usuario.
	*
	* @return the activo of this actividad plan accion usuario
	*/
	@Override
	public boolean getActivo() {
		return _actividadPlanAccionUsuario.getActivo();
	}

	/**
	* Returns <code>true</code> if this actividad plan accion usuario is activo.
	*
	* @return <code>true</code> if this actividad plan accion usuario is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _actividadPlanAccionUsuario.isActivo();
	}

	/**
	* Sets whether this actividad plan accion usuario is activo.
	*
	* @param activo the activo of this actividad plan accion usuario
	*/
	@Override
	public void setActivo(boolean activo) {
		_actividadPlanAccionUsuario.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this actividad plan accion usuario.
	*
	* @return the usuariocrea of this actividad plan accion usuario
	*/
	@Override
	public long getUsuariocrea() {
		return _actividadPlanAccionUsuario.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this actividad plan accion usuario.
	*
	* @param usuariocrea the usuariocrea of this actividad plan accion usuario
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_actividadPlanAccionUsuario.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this actividad plan accion usuario.
	*
	* @return the fechacrea of this actividad plan accion usuario
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _actividadPlanAccionUsuario.getFechacrea();
	}

	/**
	* Sets the fechacrea of this actividad plan accion usuario.
	*
	* @param fechacrea the fechacrea of this actividad plan accion usuario
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_actividadPlanAccionUsuario.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this actividad plan accion usuario.
	*
	* @return the usuariomodifica of this actividad plan accion usuario
	*/
	@Override
	public long getUsuariomodifica() {
		return _actividadPlanAccionUsuario.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this actividad plan accion usuario.
	*
	* @param usuariomodifica the usuariomodifica of this actividad plan accion usuario
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_actividadPlanAccionUsuario.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechamodifica of this actividad plan accion usuario.
	*
	* @return the fechamodifica of this actividad plan accion usuario
	*/
	@Override
	public java.util.Date getFechamodifica() {
		return _actividadPlanAccionUsuario.getFechamodifica();
	}

	/**
	* Sets the fechamodifica of this actividad plan accion usuario.
	*
	* @param fechamodifica the fechamodifica of this actividad plan accion usuario
	*/
	@Override
	public void setFechamodifica(java.util.Date fechamodifica) {
		_actividadPlanAccionUsuario.setFechamodifica(fechamodifica);
	}

	@Override
	public boolean isNew() {
		return _actividadPlanAccionUsuario.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_actividadPlanAccionUsuario.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _actividadPlanAccionUsuario.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_actividadPlanAccionUsuario.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _actividadPlanAccionUsuario.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _actividadPlanAccionUsuario.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_actividadPlanAccionUsuario.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _actividadPlanAccionUsuario.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_actividadPlanAccionUsuario.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_actividadPlanAccionUsuario.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_actividadPlanAccionUsuario.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ActividadPlanAccionUsuarioWrapper((ActividadPlanAccionUsuario)_actividadPlanAccionUsuario.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.ActividadPlanAccionUsuario actividadPlanAccionUsuario) {
		return _actividadPlanAccionUsuario.compareTo(actividadPlanAccionUsuario);
	}

	@Override
	public int hashCode() {
		return _actividadPlanAccionUsuario.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.ActividadPlanAccionUsuario> toCacheModel() {
		return _actividadPlanAccionUsuario.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.ActividadPlanAccionUsuario toEscapedModel() {
		return new ActividadPlanAccionUsuarioWrapper(_actividadPlanAccionUsuario.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.ActividadPlanAccionUsuario toUnescapedModel() {
		return new ActividadPlanAccionUsuarioWrapper(_actividadPlanAccionUsuario.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _actividadPlanAccionUsuario.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _actividadPlanAccionUsuario.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_actividadPlanAccionUsuario.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActividadPlanAccionUsuarioWrapper)) {
			return false;
		}

		ActividadPlanAccionUsuarioWrapper actividadPlanAccionUsuarioWrapper = (ActividadPlanAccionUsuarioWrapper)obj;

		if (Validator.equals(_actividadPlanAccionUsuario,
					actividadPlanAccionUsuarioWrapper._actividadPlanAccionUsuario)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ActividadPlanAccionUsuario getWrappedActividadPlanAccionUsuario() {
		return _actividadPlanAccionUsuario;
	}

	@Override
	public ActividadPlanAccionUsuario getWrappedModel() {
		return _actividadPlanAccionUsuario;
	}

	@Override
	public void resetOriginalValues() {
		_actividadPlanAccionUsuario.resetOriginalValues();
	}

	private ActividadPlanAccionUsuario _actividadPlanAccionUsuario;
}
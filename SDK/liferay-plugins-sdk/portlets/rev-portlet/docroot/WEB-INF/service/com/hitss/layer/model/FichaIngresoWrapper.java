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
 * This class is a wrapper for {@link FichaIngreso}.
 * </p>
 *
 * @author Danielle Delgado
 * @see FichaIngreso
 * @generated
 */
public class FichaIngresoWrapper implements FichaIngreso,
	ModelWrapper<FichaIngreso> {
	public FichaIngresoWrapper(FichaIngreso fichaIngreso) {
		_fichaIngreso = fichaIngreso;
	}

	@Override
	public Class<?> getModelClass() {
		return FichaIngreso.class;
	}

	@Override
	public String getModelClassName() {
		return FichaIngreso.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fichaingresoId", getFichaingresoId());
		attributes.put("solicitudRequerimientoId", getSolicitudRequerimientoId());
		attributes.put("userId", getUserId());
		attributes.put("equipoTecnico", getEquipoTecnico());
		attributes.put("reemplazo", getReemplazo());
		attributes.put("aprobacionFichaIngresoCapitalHumano",
			getAprobacionFichaIngresoCapitalHumano());
		attributes.put("aprobacionFichaIngresoOperaciones",
			getAprobacionFichaIngresoOperaciones());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fichaingresoId = (Long)attributes.get("fichaingresoId");

		if (fichaingresoId != null) {
			setFichaingresoId(fichaingresoId);
		}

		Long solicitudRequerimientoId = (Long)attributes.get(
				"solicitudRequerimientoId");

		if (solicitudRequerimientoId != null) {
			setSolicitudRequerimientoId(solicitudRequerimientoId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Boolean equipoTecnico = (Boolean)attributes.get("equipoTecnico");

		if (equipoTecnico != null) {
			setEquipoTecnico(equipoTecnico);
		}

		Boolean reemplazo = (Boolean)attributes.get("reemplazo");

		if (reemplazo != null) {
			setReemplazo(reemplazo);
		}

		Boolean aprobacionFichaIngresoCapitalHumano = (Boolean)attributes.get(
				"aprobacionFichaIngresoCapitalHumano");

		if (aprobacionFichaIngresoCapitalHumano != null) {
			setAprobacionFichaIngresoCapitalHumano(aprobacionFichaIngresoCapitalHumano);
		}

		Boolean aprobacionFichaIngresoOperaciones = (Boolean)attributes.get(
				"aprobacionFichaIngresoOperaciones");

		if (aprobacionFichaIngresoOperaciones != null) {
			setAprobacionFichaIngresoOperaciones(aprobacionFichaIngresoOperaciones);
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
	* Returns the primary key of this ficha ingreso.
	*
	* @return the primary key of this ficha ingreso
	*/
	@Override
	public com.hitss.layer.service.persistence.FichaIngresoPK getPrimaryKey() {
		return _fichaIngreso.getPrimaryKey();
	}

	/**
	* Sets the primary key of this ficha ingreso.
	*
	* @param primaryKey the primary key of this ficha ingreso
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.FichaIngresoPK primaryKey) {
		_fichaIngreso.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the fichaingreso ID of this ficha ingreso.
	*
	* @return the fichaingreso ID of this ficha ingreso
	*/
	@Override
	public long getFichaingresoId() {
		return _fichaIngreso.getFichaingresoId();
	}

	/**
	* Sets the fichaingreso ID of this ficha ingreso.
	*
	* @param fichaingresoId the fichaingreso ID of this ficha ingreso
	*/
	@Override
	public void setFichaingresoId(long fichaingresoId) {
		_fichaIngreso.setFichaingresoId(fichaingresoId);
	}

	/**
	* Returns the solicitud requerimiento ID of this ficha ingreso.
	*
	* @return the solicitud requerimiento ID of this ficha ingreso
	*/
	@Override
	public long getSolicitudRequerimientoId() {
		return _fichaIngreso.getSolicitudRequerimientoId();
	}

	/**
	* Sets the solicitud requerimiento ID of this ficha ingreso.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID of this ficha ingreso
	*/
	@Override
	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_fichaIngreso.setSolicitudRequerimientoId(solicitudRequerimientoId);
	}

	/**
	* Returns the user ID of this ficha ingreso.
	*
	* @return the user ID of this ficha ingreso
	*/
	@Override
	public long getUserId() {
		return _fichaIngreso.getUserId();
	}

	/**
	* Sets the user ID of this ficha ingreso.
	*
	* @param userId the user ID of this ficha ingreso
	*/
	@Override
	public void setUserId(long userId) {
		_fichaIngreso.setUserId(userId);
	}

	/**
	* Returns the user uuid of this ficha ingreso.
	*
	* @return the user uuid of this ficha ingreso
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fichaIngreso.getUserUuid();
	}

	/**
	* Sets the user uuid of this ficha ingreso.
	*
	* @param userUuid the user uuid of this ficha ingreso
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_fichaIngreso.setUserUuid(userUuid);
	}

	/**
	* Returns the equipo tecnico of this ficha ingreso.
	*
	* @return the equipo tecnico of this ficha ingreso
	*/
	@Override
	public boolean getEquipoTecnico() {
		return _fichaIngreso.getEquipoTecnico();
	}

	/**
	* Returns <code>true</code> if this ficha ingreso is equipo tecnico.
	*
	* @return <code>true</code> if this ficha ingreso is equipo tecnico; <code>false</code> otherwise
	*/
	@Override
	public boolean isEquipoTecnico() {
		return _fichaIngreso.isEquipoTecnico();
	}

	/**
	* Sets whether this ficha ingreso is equipo tecnico.
	*
	* @param equipoTecnico the equipo tecnico of this ficha ingreso
	*/
	@Override
	public void setEquipoTecnico(boolean equipoTecnico) {
		_fichaIngreso.setEquipoTecnico(equipoTecnico);
	}

	/**
	* Returns the reemplazo of this ficha ingreso.
	*
	* @return the reemplazo of this ficha ingreso
	*/
	@Override
	public boolean getReemplazo() {
		return _fichaIngreso.getReemplazo();
	}

	/**
	* Returns <code>true</code> if this ficha ingreso is reemplazo.
	*
	* @return <code>true</code> if this ficha ingreso is reemplazo; <code>false</code> otherwise
	*/
	@Override
	public boolean isReemplazo() {
		return _fichaIngreso.isReemplazo();
	}

	/**
	* Sets whether this ficha ingreso is reemplazo.
	*
	* @param reemplazo the reemplazo of this ficha ingreso
	*/
	@Override
	public void setReemplazo(boolean reemplazo) {
		_fichaIngreso.setReemplazo(reemplazo);
	}

	/**
	* Returns the aprobacion ficha ingreso capital humano of this ficha ingreso.
	*
	* @return the aprobacion ficha ingreso capital humano of this ficha ingreso
	*/
	@Override
	public boolean getAprobacionFichaIngresoCapitalHumano() {
		return _fichaIngreso.getAprobacionFichaIngresoCapitalHumano();
	}

	/**
	* Returns <code>true</code> if this ficha ingreso is aprobacion ficha ingreso capital humano.
	*
	* @return <code>true</code> if this ficha ingreso is aprobacion ficha ingreso capital humano; <code>false</code> otherwise
	*/
	@Override
	public boolean isAprobacionFichaIngresoCapitalHumano() {
		return _fichaIngreso.isAprobacionFichaIngresoCapitalHumano();
	}

	/**
	* Sets whether this ficha ingreso is aprobacion ficha ingreso capital humano.
	*
	* @param aprobacionFichaIngresoCapitalHumano the aprobacion ficha ingreso capital humano of this ficha ingreso
	*/
	@Override
	public void setAprobacionFichaIngresoCapitalHumano(
		boolean aprobacionFichaIngresoCapitalHumano) {
		_fichaIngreso.setAprobacionFichaIngresoCapitalHumano(aprobacionFichaIngresoCapitalHumano);
	}

	/**
	* Returns the aprobacion ficha ingreso operaciones of this ficha ingreso.
	*
	* @return the aprobacion ficha ingreso operaciones of this ficha ingreso
	*/
	@Override
	public boolean getAprobacionFichaIngresoOperaciones() {
		return _fichaIngreso.getAprobacionFichaIngresoOperaciones();
	}

	/**
	* Returns <code>true</code> if this ficha ingreso is aprobacion ficha ingreso operaciones.
	*
	* @return <code>true</code> if this ficha ingreso is aprobacion ficha ingreso operaciones; <code>false</code> otherwise
	*/
	@Override
	public boolean isAprobacionFichaIngresoOperaciones() {
		return _fichaIngreso.isAprobacionFichaIngresoOperaciones();
	}

	/**
	* Sets whether this ficha ingreso is aprobacion ficha ingreso operaciones.
	*
	* @param aprobacionFichaIngresoOperaciones the aprobacion ficha ingreso operaciones of this ficha ingreso
	*/
	@Override
	public void setAprobacionFichaIngresoOperaciones(
		boolean aprobacionFichaIngresoOperaciones) {
		_fichaIngreso.setAprobacionFichaIngresoOperaciones(aprobacionFichaIngresoOperaciones);
	}

	/**
	* Returns the activo of this ficha ingreso.
	*
	* @return the activo of this ficha ingreso
	*/
	@Override
	public boolean getActivo() {
		return _fichaIngreso.getActivo();
	}

	/**
	* Returns <code>true</code> if this ficha ingreso is activo.
	*
	* @return <code>true</code> if this ficha ingreso is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _fichaIngreso.isActivo();
	}

	/**
	* Sets whether this ficha ingreso is activo.
	*
	* @param activo the activo of this ficha ingreso
	*/
	@Override
	public void setActivo(boolean activo) {
		_fichaIngreso.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this ficha ingreso.
	*
	* @return the usuariocrea of this ficha ingreso
	*/
	@Override
	public long getUsuariocrea() {
		return _fichaIngreso.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this ficha ingreso.
	*
	* @param usuariocrea the usuariocrea of this ficha ingreso
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_fichaIngreso.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this ficha ingreso.
	*
	* @return the fechacrea of this ficha ingreso
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _fichaIngreso.getFechacrea();
	}

	/**
	* Sets the fechacrea of this ficha ingreso.
	*
	* @param fechacrea the fechacrea of this ficha ingreso
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_fichaIngreso.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this ficha ingreso.
	*
	* @return the usuariomodifica of this ficha ingreso
	*/
	@Override
	public long getUsuariomodifica() {
		return _fichaIngreso.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this ficha ingreso.
	*
	* @param usuariomodifica the usuariomodifica of this ficha ingreso
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_fichaIngreso.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechamodifica of this ficha ingreso.
	*
	* @return the fechamodifica of this ficha ingreso
	*/
	@Override
	public java.util.Date getFechamodifica() {
		return _fichaIngreso.getFechamodifica();
	}

	/**
	* Sets the fechamodifica of this ficha ingreso.
	*
	* @param fechamodifica the fechamodifica of this ficha ingreso
	*/
	@Override
	public void setFechamodifica(java.util.Date fechamodifica) {
		_fichaIngreso.setFechamodifica(fechamodifica);
	}

	@Override
	public boolean isNew() {
		return _fichaIngreso.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_fichaIngreso.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _fichaIngreso.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_fichaIngreso.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _fichaIngreso.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _fichaIngreso.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_fichaIngreso.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _fichaIngreso.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_fichaIngreso.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_fichaIngreso.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_fichaIngreso.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FichaIngresoWrapper((FichaIngreso)_fichaIngreso.clone());
	}

	@Override
	public int compareTo(com.hitss.layer.model.FichaIngreso fichaIngreso) {
		return _fichaIngreso.compareTo(fichaIngreso);
	}

	@Override
	public int hashCode() {
		return _fichaIngreso.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.FichaIngreso> toCacheModel() {
		return _fichaIngreso.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.FichaIngreso toEscapedModel() {
		return new FichaIngresoWrapper(_fichaIngreso.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.FichaIngreso toUnescapedModel() {
		return new FichaIngresoWrapper(_fichaIngreso.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _fichaIngreso.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _fichaIngreso.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_fichaIngreso.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FichaIngresoWrapper)) {
			return false;
		}

		FichaIngresoWrapper fichaIngresoWrapper = (FichaIngresoWrapper)obj;

		if (Validator.equals(_fichaIngreso, fichaIngresoWrapper._fichaIngreso)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public FichaIngreso getWrappedFichaIngreso() {
		return _fichaIngreso;
	}

	@Override
	public FichaIngreso getWrappedModel() {
		return _fichaIngreso;
	}

	@Override
	public void resetOriginalValues() {
		_fichaIngreso.resetOriginalValues();
	}

	private FichaIngreso _fichaIngreso;
}
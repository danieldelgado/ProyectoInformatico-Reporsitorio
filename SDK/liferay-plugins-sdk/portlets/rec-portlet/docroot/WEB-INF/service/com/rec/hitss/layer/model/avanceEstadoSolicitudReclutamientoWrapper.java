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
 * This class is a wrapper for {@link avanceEstadoSolicitudReclutamiento}.
 * </p>
 *
 * @author Crossfire
 * @see avanceEstadoSolicitudReclutamiento
 * @generated
 */
public class avanceEstadoSolicitudReclutamientoWrapper
	implements avanceEstadoSolicitudReclutamiento,
		ModelWrapper<avanceEstadoSolicitudReclutamiento> {
	public avanceEstadoSolicitudReclutamientoWrapper(
		avanceEstadoSolicitudReclutamiento avanceEstadoSolicitudReclutamiento) {
		_avanceEstadoSolicitudReclutamiento = avanceEstadoSolicitudReclutamiento;
	}

	@Override
	public Class<?> getModelClass() {
		return avanceEstadoSolicitudReclutamiento.class;
	}

	@Override
	public String getModelClassName() {
		return avanceEstadoSolicitudReclutamiento.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("AESR_ID", getAESR_ID());
		attributes.put("AESR_ESTADO", getAESR_ESTADO());
		attributes.put("AESR_ACTIVO", getAESR_ACTIVO());
		attributes.put("AESR_USUARIO_CREA", getAESR_USUARIO_CREA());
		attributes.put("AESR_FECHA_CREA", getAESR_FECHA_CREA());
		attributes.put("AESR_USUARIO_MODIFICA", getAESR_USUARIO_MODIFICA());
		attributes.put("AESR_FECHA_MODIFICA", getAESR_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long AESR_ID = (Long)attributes.get("AESR_ID");

		if (AESR_ID != null) {
			setAESR_ID(AESR_ID);
		}

		String AESR_ESTADO = (String)attributes.get("AESR_ESTADO");

		if (AESR_ESTADO != null) {
			setAESR_ESTADO(AESR_ESTADO);
		}

		String AESR_ACTIVO = (String)attributes.get("AESR_ACTIVO");

		if (AESR_ACTIVO != null) {
			setAESR_ACTIVO(AESR_ACTIVO);
		}

		Long AESR_USUARIO_CREA = (Long)attributes.get("AESR_USUARIO_CREA");

		if (AESR_USUARIO_CREA != null) {
			setAESR_USUARIO_CREA(AESR_USUARIO_CREA);
		}

		Date AESR_FECHA_CREA = (Date)attributes.get("AESR_FECHA_CREA");

		if (AESR_FECHA_CREA != null) {
			setAESR_FECHA_CREA(AESR_FECHA_CREA);
		}

		Long AESR_USUARIO_MODIFICA = (Long)attributes.get(
				"AESR_USUARIO_MODIFICA");

		if (AESR_USUARIO_MODIFICA != null) {
			setAESR_USUARIO_MODIFICA(AESR_USUARIO_MODIFICA);
		}

		Date AESR_FECHA_MODIFICA = (Date)attributes.get("AESR_FECHA_MODIFICA");

		if (AESR_FECHA_MODIFICA != null) {
			setAESR_FECHA_MODIFICA(AESR_FECHA_MODIFICA);
		}
	}

	/**
	* Returns the primary key of this avance estado solicitud reclutamiento.
	*
	* @return the primary key of this avance estado solicitud reclutamiento
	*/
	@Override
	public long getPrimaryKey() {
		return _avanceEstadoSolicitudReclutamiento.getPrimaryKey();
	}

	/**
	* Sets the primary key of this avance estado solicitud reclutamiento.
	*
	* @param primaryKey the primary key of this avance estado solicitud reclutamiento
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_avanceEstadoSolicitudReclutamiento.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the a e s r_ i d of this avance estado solicitud reclutamiento.
	*
	* @return the a e s r_ i d of this avance estado solicitud reclutamiento
	*/
	@Override
	public long getAESR_ID() {
		return _avanceEstadoSolicitudReclutamiento.getAESR_ID();
	}

	/**
	* Sets the a e s r_ i d of this avance estado solicitud reclutamiento.
	*
	* @param AESR_ID the a e s r_ i d of this avance estado solicitud reclutamiento
	*/
	@Override
	public void setAESR_ID(long AESR_ID) {
		_avanceEstadoSolicitudReclutamiento.setAESR_ID(AESR_ID);
	}

	/**
	* Returns the a e s r_ e s t a d o of this avance estado solicitud reclutamiento.
	*
	* @return the a e s r_ e s t a d o of this avance estado solicitud reclutamiento
	*/
	@Override
	public java.lang.String getAESR_ESTADO() {
		return _avanceEstadoSolicitudReclutamiento.getAESR_ESTADO();
	}

	/**
	* Sets the a e s r_ e s t a d o of this avance estado solicitud reclutamiento.
	*
	* @param AESR_ESTADO the a e s r_ e s t a d o of this avance estado solicitud reclutamiento
	*/
	@Override
	public void setAESR_ESTADO(java.lang.String AESR_ESTADO) {
		_avanceEstadoSolicitudReclutamiento.setAESR_ESTADO(AESR_ESTADO);
	}

	/**
	* Returns the a e s r_ a c t i v o of this avance estado solicitud reclutamiento.
	*
	* @return the a e s r_ a c t i v o of this avance estado solicitud reclutamiento
	*/
	@Override
	public java.lang.String getAESR_ACTIVO() {
		return _avanceEstadoSolicitudReclutamiento.getAESR_ACTIVO();
	}

	/**
	* Sets the a e s r_ a c t i v o of this avance estado solicitud reclutamiento.
	*
	* @param AESR_ACTIVO the a e s r_ a c t i v o of this avance estado solicitud reclutamiento
	*/
	@Override
	public void setAESR_ACTIVO(java.lang.String AESR_ACTIVO) {
		_avanceEstadoSolicitudReclutamiento.setAESR_ACTIVO(AESR_ACTIVO);
	}

	/**
	* Returns the a e s r_ u s u a r i o_ c r e a of this avance estado solicitud reclutamiento.
	*
	* @return the a e s r_ u s u a r i o_ c r e a of this avance estado solicitud reclutamiento
	*/
	@Override
	public long getAESR_USUARIO_CREA() {
		return _avanceEstadoSolicitudReclutamiento.getAESR_USUARIO_CREA();
	}

	/**
	* Sets the a e s r_ u s u a r i o_ c r e a of this avance estado solicitud reclutamiento.
	*
	* @param AESR_USUARIO_CREA the a e s r_ u s u a r i o_ c r e a of this avance estado solicitud reclutamiento
	*/
	@Override
	public void setAESR_USUARIO_CREA(long AESR_USUARIO_CREA) {
		_avanceEstadoSolicitudReclutamiento.setAESR_USUARIO_CREA(AESR_USUARIO_CREA);
	}

	/**
	* Returns the a e s r_ f e c h a_ c r e a of this avance estado solicitud reclutamiento.
	*
	* @return the a e s r_ f e c h a_ c r e a of this avance estado solicitud reclutamiento
	*/
	@Override
	public java.util.Date getAESR_FECHA_CREA() {
		return _avanceEstadoSolicitudReclutamiento.getAESR_FECHA_CREA();
	}

	/**
	* Sets the a e s r_ f e c h a_ c r e a of this avance estado solicitud reclutamiento.
	*
	* @param AESR_FECHA_CREA the a e s r_ f e c h a_ c r e a of this avance estado solicitud reclutamiento
	*/
	@Override
	public void setAESR_FECHA_CREA(java.util.Date AESR_FECHA_CREA) {
		_avanceEstadoSolicitudReclutamiento.setAESR_FECHA_CREA(AESR_FECHA_CREA);
	}

	/**
	* Returns the a e s r_ u s u a r i o_ m o d i f i c a of this avance estado solicitud reclutamiento.
	*
	* @return the a e s r_ u s u a r i o_ m o d i f i c a of this avance estado solicitud reclutamiento
	*/
	@Override
	public long getAESR_USUARIO_MODIFICA() {
		return _avanceEstadoSolicitudReclutamiento.getAESR_USUARIO_MODIFICA();
	}

	/**
	* Sets the a e s r_ u s u a r i o_ m o d i f i c a of this avance estado solicitud reclutamiento.
	*
	* @param AESR_USUARIO_MODIFICA the a e s r_ u s u a r i o_ m o d i f i c a of this avance estado solicitud reclutamiento
	*/
	@Override
	public void setAESR_USUARIO_MODIFICA(long AESR_USUARIO_MODIFICA) {
		_avanceEstadoSolicitudReclutamiento.setAESR_USUARIO_MODIFICA(AESR_USUARIO_MODIFICA);
	}

	/**
	* Returns the a e s r_ f e c h a_ m o d i f i c a of this avance estado solicitud reclutamiento.
	*
	* @return the a e s r_ f e c h a_ m o d i f i c a of this avance estado solicitud reclutamiento
	*/
	@Override
	public java.util.Date getAESR_FECHA_MODIFICA() {
		return _avanceEstadoSolicitudReclutamiento.getAESR_FECHA_MODIFICA();
	}

	/**
	* Sets the a e s r_ f e c h a_ m o d i f i c a of this avance estado solicitud reclutamiento.
	*
	* @param AESR_FECHA_MODIFICA the a e s r_ f e c h a_ m o d i f i c a of this avance estado solicitud reclutamiento
	*/
	@Override
	public void setAESR_FECHA_MODIFICA(java.util.Date AESR_FECHA_MODIFICA) {
		_avanceEstadoSolicitudReclutamiento.setAESR_FECHA_MODIFICA(AESR_FECHA_MODIFICA);
	}

	@Override
	public boolean isNew() {
		return _avanceEstadoSolicitudReclutamiento.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_avanceEstadoSolicitudReclutamiento.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _avanceEstadoSolicitudReclutamiento.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_avanceEstadoSolicitudReclutamiento.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _avanceEstadoSolicitudReclutamiento.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _avanceEstadoSolicitudReclutamiento.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_avanceEstadoSolicitudReclutamiento.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _avanceEstadoSolicitudReclutamiento.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_avanceEstadoSolicitudReclutamiento.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_avanceEstadoSolicitudReclutamiento.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_avanceEstadoSolicitudReclutamiento.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new avanceEstadoSolicitudReclutamientoWrapper((avanceEstadoSolicitudReclutamiento)_avanceEstadoSolicitudReclutamiento.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento avanceEstadoSolicitudReclutamiento) {
		return _avanceEstadoSolicitudReclutamiento.compareTo(avanceEstadoSolicitudReclutamiento);
	}

	@Override
	public int hashCode() {
		return _avanceEstadoSolicitudReclutamiento.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento> toCacheModel() {
		return _avanceEstadoSolicitudReclutamiento.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento toEscapedModel() {
		return new avanceEstadoSolicitudReclutamientoWrapper(_avanceEstadoSolicitudReclutamiento.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento toUnescapedModel() {
		return new avanceEstadoSolicitudReclutamientoWrapper(_avanceEstadoSolicitudReclutamiento.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _avanceEstadoSolicitudReclutamiento.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _avanceEstadoSolicitudReclutamiento.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_avanceEstadoSolicitudReclutamiento.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof avanceEstadoSolicitudReclutamientoWrapper)) {
			return false;
		}

		avanceEstadoSolicitudReclutamientoWrapper avanceEstadoSolicitudReclutamientoWrapper =
			(avanceEstadoSolicitudReclutamientoWrapper)obj;

		if (Validator.equals(_avanceEstadoSolicitudReclutamiento,
					avanceEstadoSolicitudReclutamientoWrapper._avanceEstadoSolicitudReclutamiento)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public avanceEstadoSolicitudReclutamiento getWrappedavanceEstadoSolicitudReclutamiento() {
		return _avanceEstadoSolicitudReclutamiento;
	}

	@Override
	public avanceEstadoSolicitudReclutamiento getWrappedModel() {
		return _avanceEstadoSolicitudReclutamiento;
	}

	@Override
	public void resetOriginalValues() {
		_avanceEstadoSolicitudReclutamiento.resetOriginalValues();
	}

	private avanceEstadoSolicitudReclutamiento _avanceEstadoSolicitudReclutamiento;
}
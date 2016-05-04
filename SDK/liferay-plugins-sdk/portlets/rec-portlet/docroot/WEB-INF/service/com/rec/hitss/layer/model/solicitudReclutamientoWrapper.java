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
 * This class is a wrapper for {@link solicitudReclutamiento}.
 * </p>
 *
 * @author Crossfire
 * @see solicitudReclutamiento
 * @generated
 */
public class solicitudReclutamientoWrapper implements solicitudReclutamiento,
	ModelWrapper<solicitudReclutamiento> {
	public solicitudReclutamientoWrapper(
		solicitudReclutamiento solicitudReclutamiento) {
		_solicitudReclutamiento = solicitudReclutamiento;
	}

	@Override
	public Class<?> getModelClass() {
		return solicitudReclutamiento.class;
	}

	@Override
	public String getModelClassName() {
		return solicitudReclutamiento.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SR_ID", getSR_ID());
		attributes.put("SR_PL_ID", getSR_PL_ID());
		attributes.put("SR_ESTADO", getSR_ESTADO());
		attributes.put("SR_ACTIVO", getSR_ACTIVO());
		attributes.put("SR_USUARIO_CREA", getSR_USUARIO_CREA());
		attributes.put("SR_FECHA_CREA", getSR_FECHA_CREA());
		attributes.put("SR_USUARIO_MODIFICA", getSR_USUARIO_MODIFICA());
		attributes.put("SR_FECHA_MODIFICA", getSR_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long SR_ID = (Long)attributes.get("SR_ID");

		if (SR_ID != null) {
			setSR_ID(SR_ID);
		}

		String SR_PL_ID = (String)attributes.get("SR_PL_ID");

		if (SR_PL_ID != null) {
			setSR_PL_ID(SR_PL_ID);
		}

		Long SR_ESTADO = (Long)attributes.get("SR_ESTADO");

		if (SR_ESTADO != null) {
			setSR_ESTADO(SR_ESTADO);
		}

		String SR_ACTIVO = (String)attributes.get("SR_ACTIVO");

		if (SR_ACTIVO != null) {
			setSR_ACTIVO(SR_ACTIVO);
		}

		Long SR_USUARIO_CREA = (Long)attributes.get("SR_USUARIO_CREA");

		if (SR_USUARIO_CREA != null) {
			setSR_USUARIO_CREA(SR_USUARIO_CREA);
		}

		Date SR_FECHA_CREA = (Date)attributes.get("SR_FECHA_CREA");

		if (SR_FECHA_CREA != null) {
			setSR_FECHA_CREA(SR_FECHA_CREA);
		}

		Long SR_USUARIO_MODIFICA = (Long)attributes.get("SR_USUARIO_MODIFICA");

		if (SR_USUARIO_MODIFICA != null) {
			setSR_USUARIO_MODIFICA(SR_USUARIO_MODIFICA);
		}

		Date SR_FECHA_MODIFICA = (Date)attributes.get("SR_FECHA_MODIFICA");

		if (SR_FECHA_MODIFICA != null) {
			setSR_FECHA_MODIFICA(SR_FECHA_MODIFICA);
		}
	}

	/**
	* Returns the primary key of this solicitud reclutamiento.
	*
	* @return the primary key of this solicitud reclutamiento
	*/
	@Override
	public long getPrimaryKey() {
		return _solicitudReclutamiento.getPrimaryKey();
	}

	/**
	* Sets the primary key of this solicitud reclutamiento.
	*
	* @param primaryKey the primary key of this solicitud reclutamiento
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_solicitudReclutamiento.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the s r_ i d of this solicitud reclutamiento.
	*
	* @return the s r_ i d of this solicitud reclutamiento
	*/
	@Override
	public long getSR_ID() {
		return _solicitudReclutamiento.getSR_ID();
	}

	/**
	* Sets the s r_ i d of this solicitud reclutamiento.
	*
	* @param SR_ID the s r_ i d of this solicitud reclutamiento
	*/
	@Override
	public void setSR_ID(long SR_ID) {
		_solicitudReclutamiento.setSR_ID(SR_ID);
	}

	/**
	* Returns the s r_ p l_ i d of this solicitud reclutamiento.
	*
	* @return the s r_ p l_ i d of this solicitud reclutamiento
	*/
	@Override
	public java.lang.String getSR_PL_ID() {
		return _solicitudReclutamiento.getSR_PL_ID();
	}

	/**
	* Sets the s r_ p l_ i d of this solicitud reclutamiento.
	*
	* @param SR_PL_ID the s r_ p l_ i d of this solicitud reclutamiento
	*/
	@Override
	public void setSR_PL_ID(java.lang.String SR_PL_ID) {
		_solicitudReclutamiento.setSR_PL_ID(SR_PL_ID);
	}

	/**
	* Returns the s r_ e s t a d o of this solicitud reclutamiento.
	*
	* @return the s r_ e s t a d o of this solicitud reclutamiento
	*/
	@Override
	public long getSR_ESTADO() {
		return _solicitudReclutamiento.getSR_ESTADO();
	}

	/**
	* Sets the s r_ e s t a d o of this solicitud reclutamiento.
	*
	* @param SR_ESTADO the s r_ e s t a d o of this solicitud reclutamiento
	*/
	@Override
	public void setSR_ESTADO(long SR_ESTADO) {
		_solicitudReclutamiento.setSR_ESTADO(SR_ESTADO);
	}

	/**
	* Returns the s r_ a c t i v o of this solicitud reclutamiento.
	*
	* @return the s r_ a c t i v o of this solicitud reclutamiento
	*/
	@Override
	public java.lang.String getSR_ACTIVO() {
		return _solicitudReclutamiento.getSR_ACTIVO();
	}

	/**
	* Sets the s r_ a c t i v o of this solicitud reclutamiento.
	*
	* @param SR_ACTIVO the s r_ a c t i v o of this solicitud reclutamiento
	*/
	@Override
	public void setSR_ACTIVO(java.lang.String SR_ACTIVO) {
		_solicitudReclutamiento.setSR_ACTIVO(SR_ACTIVO);
	}

	/**
	* Returns the s r_ u s u a r i o_ c r e a of this solicitud reclutamiento.
	*
	* @return the s r_ u s u a r i o_ c r e a of this solicitud reclutamiento
	*/
	@Override
	public long getSR_USUARIO_CREA() {
		return _solicitudReclutamiento.getSR_USUARIO_CREA();
	}

	/**
	* Sets the s r_ u s u a r i o_ c r e a of this solicitud reclutamiento.
	*
	* @param SR_USUARIO_CREA the s r_ u s u a r i o_ c r e a of this solicitud reclutamiento
	*/
	@Override
	public void setSR_USUARIO_CREA(long SR_USUARIO_CREA) {
		_solicitudReclutamiento.setSR_USUARIO_CREA(SR_USUARIO_CREA);
	}

	/**
	* Returns the s r_ f e c h a_ c r e a of this solicitud reclutamiento.
	*
	* @return the s r_ f e c h a_ c r e a of this solicitud reclutamiento
	*/
	@Override
	public java.util.Date getSR_FECHA_CREA() {
		return _solicitudReclutamiento.getSR_FECHA_CREA();
	}

	/**
	* Sets the s r_ f e c h a_ c r e a of this solicitud reclutamiento.
	*
	* @param SR_FECHA_CREA the s r_ f e c h a_ c r e a of this solicitud reclutamiento
	*/
	@Override
	public void setSR_FECHA_CREA(java.util.Date SR_FECHA_CREA) {
		_solicitudReclutamiento.setSR_FECHA_CREA(SR_FECHA_CREA);
	}

	/**
	* Returns the s r_ u s u a r i o_ m o d i f i c a of this solicitud reclutamiento.
	*
	* @return the s r_ u s u a r i o_ m o d i f i c a of this solicitud reclutamiento
	*/
	@Override
	public long getSR_USUARIO_MODIFICA() {
		return _solicitudReclutamiento.getSR_USUARIO_MODIFICA();
	}

	/**
	* Sets the s r_ u s u a r i o_ m o d i f i c a of this solicitud reclutamiento.
	*
	* @param SR_USUARIO_MODIFICA the s r_ u s u a r i o_ m o d i f i c a of this solicitud reclutamiento
	*/
	@Override
	public void setSR_USUARIO_MODIFICA(long SR_USUARIO_MODIFICA) {
		_solicitudReclutamiento.setSR_USUARIO_MODIFICA(SR_USUARIO_MODIFICA);
	}

	/**
	* Returns the s r_ f e c h a_ m o d i f i c a of this solicitud reclutamiento.
	*
	* @return the s r_ f e c h a_ m o d i f i c a of this solicitud reclutamiento
	*/
	@Override
	public java.util.Date getSR_FECHA_MODIFICA() {
		return _solicitudReclutamiento.getSR_FECHA_MODIFICA();
	}

	/**
	* Sets the s r_ f e c h a_ m o d i f i c a of this solicitud reclutamiento.
	*
	* @param SR_FECHA_MODIFICA the s r_ f e c h a_ m o d i f i c a of this solicitud reclutamiento
	*/
	@Override
	public void setSR_FECHA_MODIFICA(java.util.Date SR_FECHA_MODIFICA) {
		_solicitudReclutamiento.setSR_FECHA_MODIFICA(SR_FECHA_MODIFICA);
	}

	@Override
	public boolean isNew() {
		return _solicitudReclutamiento.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_solicitudReclutamiento.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _solicitudReclutamiento.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_solicitudReclutamiento.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _solicitudReclutamiento.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _solicitudReclutamiento.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_solicitudReclutamiento.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _solicitudReclutamiento.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_solicitudReclutamiento.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_solicitudReclutamiento.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_solicitudReclutamiento.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new solicitudReclutamientoWrapper((solicitudReclutamiento)_solicitudReclutamiento.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.solicitudReclutamiento solicitudReclutamiento) {
		return _solicitudReclutamiento.compareTo(solicitudReclutamiento);
	}

	@Override
	public int hashCode() {
		return _solicitudReclutamiento.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.solicitudReclutamiento> toCacheModel() {
		return _solicitudReclutamiento.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.solicitudReclutamiento toEscapedModel() {
		return new solicitudReclutamientoWrapper(_solicitudReclutamiento.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.solicitudReclutamiento toUnescapedModel() {
		return new solicitudReclutamientoWrapper(_solicitudReclutamiento.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _solicitudReclutamiento.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _solicitudReclutamiento.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_solicitudReclutamiento.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof solicitudReclutamientoWrapper)) {
			return false;
		}

		solicitudReclutamientoWrapper solicitudReclutamientoWrapper = (solicitudReclutamientoWrapper)obj;

		if (Validator.equals(_solicitudReclutamiento,
					solicitudReclutamientoWrapper._solicitudReclutamiento)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public solicitudReclutamiento getWrappedsolicitudReclutamiento() {
		return _solicitudReclutamiento;
	}

	@Override
	public solicitudReclutamiento getWrappedModel() {
		return _solicitudReclutamiento;
	}

	@Override
	public void resetOriginalValues() {
		_solicitudReclutamiento.resetOriginalValues();
	}

	private solicitudReclutamiento _solicitudReclutamiento;
}
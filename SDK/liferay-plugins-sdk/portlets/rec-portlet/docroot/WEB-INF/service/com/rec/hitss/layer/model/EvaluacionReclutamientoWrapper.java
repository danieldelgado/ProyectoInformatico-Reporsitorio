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
 * This class is a wrapper for {@link EvaluacionReclutamiento}.
 * </p>
 *
 * @author Crossfire
 * @see EvaluacionReclutamiento
 * @generated
 */
public class EvaluacionReclutamientoWrapper implements EvaluacionReclutamiento,
	ModelWrapper<EvaluacionReclutamiento> {
	public EvaluacionReclutamientoWrapper(
		EvaluacionReclutamiento evaluacionReclutamiento) {
		_evaluacionReclutamiento = evaluacionReclutamiento;
	}

	@Override
	public Class<?> getModelClass() {
		return EvaluacionReclutamiento.class;
	}

	@Override
	public String getModelClassName() {
		return EvaluacionReclutamiento.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ER_ID", getER_ID());
		attributes.put("ER_ESTADO", getER_ESTADO());
		attributes.put("ER_ACTIVO", getER_ACTIVO());
		attributes.put("ER_USUARIO_CREA", getER_USUARIO_CREA());
		attributes.put("ER_FECHA_CREA", getER_FECHA_CREA());
		attributes.put("ER_USUARIO_MODIFICA", getER_USUARIO_MODIFICA());
		attributes.put("ER_FECHA_MODIFICA", getER_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ER_ID = (Long)attributes.get("ER_ID");

		if (ER_ID != null) {
			setER_ID(ER_ID);
		}

		String ER_ESTADO = (String)attributes.get("ER_ESTADO");

		if (ER_ESTADO != null) {
			setER_ESTADO(ER_ESTADO);
		}

		String ER_ACTIVO = (String)attributes.get("ER_ACTIVO");

		if (ER_ACTIVO != null) {
			setER_ACTIVO(ER_ACTIVO);
		}

		Long ER_USUARIO_CREA = (Long)attributes.get("ER_USUARIO_CREA");

		if (ER_USUARIO_CREA != null) {
			setER_USUARIO_CREA(ER_USUARIO_CREA);
		}

		Date ER_FECHA_CREA = (Date)attributes.get("ER_FECHA_CREA");

		if (ER_FECHA_CREA != null) {
			setER_FECHA_CREA(ER_FECHA_CREA);
		}

		Long ER_USUARIO_MODIFICA = (Long)attributes.get("ER_USUARIO_MODIFICA");

		if (ER_USUARIO_MODIFICA != null) {
			setER_USUARIO_MODIFICA(ER_USUARIO_MODIFICA);
		}

		Date ER_FECHA_MODIFICA = (Date)attributes.get("ER_FECHA_MODIFICA");

		if (ER_FECHA_MODIFICA != null) {
			setER_FECHA_MODIFICA(ER_FECHA_MODIFICA);
		}
	}

	/**
	* Returns the primary key of this evaluacion reclutamiento.
	*
	* @return the primary key of this evaluacion reclutamiento
	*/
	@Override
	public long getPrimaryKey() {
		return _evaluacionReclutamiento.getPrimaryKey();
	}

	/**
	* Sets the primary key of this evaluacion reclutamiento.
	*
	* @param primaryKey the primary key of this evaluacion reclutamiento
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_evaluacionReclutamiento.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the e r_ i d of this evaluacion reclutamiento.
	*
	* @return the e r_ i d of this evaluacion reclutamiento
	*/
	@Override
	public long getER_ID() {
		return _evaluacionReclutamiento.getER_ID();
	}

	/**
	* Sets the e r_ i d of this evaluacion reclutamiento.
	*
	* @param ER_ID the e r_ i d of this evaluacion reclutamiento
	*/
	@Override
	public void setER_ID(long ER_ID) {
		_evaluacionReclutamiento.setER_ID(ER_ID);
	}

	/**
	* Returns the e r_ e s t a d o of this evaluacion reclutamiento.
	*
	* @return the e r_ e s t a d o of this evaluacion reclutamiento
	*/
	@Override
	public java.lang.String getER_ESTADO() {
		return _evaluacionReclutamiento.getER_ESTADO();
	}

	/**
	* Sets the e r_ e s t a d o of this evaluacion reclutamiento.
	*
	* @param ER_ESTADO the e r_ e s t a d o of this evaluacion reclutamiento
	*/
	@Override
	public void setER_ESTADO(java.lang.String ER_ESTADO) {
		_evaluacionReclutamiento.setER_ESTADO(ER_ESTADO);
	}

	/**
	* Returns the e r_ a c t i v o of this evaluacion reclutamiento.
	*
	* @return the e r_ a c t i v o of this evaluacion reclutamiento
	*/
	@Override
	public java.lang.String getER_ACTIVO() {
		return _evaluacionReclutamiento.getER_ACTIVO();
	}

	/**
	* Sets the e r_ a c t i v o of this evaluacion reclutamiento.
	*
	* @param ER_ACTIVO the e r_ a c t i v o of this evaluacion reclutamiento
	*/
	@Override
	public void setER_ACTIVO(java.lang.String ER_ACTIVO) {
		_evaluacionReclutamiento.setER_ACTIVO(ER_ACTIVO);
	}

	/**
	* Returns the e r_ u s u a r i o_ c r e a of this evaluacion reclutamiento.
	*
	* @return the e r_ u s u a r i o_ c r e a of this evaluacion reclutamiento
	*/
	@Override
	public long getER_USUARIO_CREA() {
		return _evaluacionReclutamiento.getER_USUARIO_CREA();
	}

	/**
	* Sets the e r_ u s u a r i o_ c r e a of this evaluacion reclutamiento.
	*
	* @param ER_USUARIO_CREA the e r_ u s u a r i o_ c r e a of this evaluacion reclutamiento
	*/
	@Override
	public void setER_USUARIO_CREA(long ER_USUARIO_CREA) {
		_evaluacionReclutamiento.setER_USUARIO_CREA(ER_USUARIO_CREA);
	}

	/**
	* Returns the e r_ f e c h a_ c r e a of this evaluacion reclutamiento.
	*
	* @return the e r_ f e c h a_ c r e a of this evaluacion reclutamiento
	*/
	@Override
	public java.util.Date getER_FECHA_CREA() {
		return _evaluacionReclutamiento.getER_FECHA_CREA();
	}

	/**
	* Sets the e r_ f e c h a_ c r e a of this evaluacion reclutamiento.
	*
	* @param ER_FECHA_CREA the e r_ f e c h a_ c r e a of this evaluacion reclutamiento
	*/
	@Override
	public void setER_FECHA_CREA(java.util.Date ER_FECHA_CREA) {
		_evaluacionReclutamiento.setER_FECHA_CREA(ER_FECHA_CREA);
	}

	/**
	* Returns the e r_ u s u a r i o_ m o d i f i c a of this evaluacion reclutamiento.
	*
	* @return the e r_ u s u a r i o_ m o d i f i c a of this evaluacion reclutamiento
	*/
	@Override
	public long getER_USUARIO_MODIFICA() {
		return _evaluacionReclutamiento.getER_USUARIO_MODIFICA();
	}

	/**
	* Sets the e r_ u s u a r i o_ m o d i f i c a of this evaluacion reclutamiento.
	*
	* @param ER_USUARIO_MODIFICA the e r_ u s u a r i o_ m o d i f i c a of this evaluacion reclutamiento
	*/
	@Override
	public void setER_USUARIO_MODIFICA(long ER_USUARIO_MODIFICA) {
		_evaluacionReclutamiento.setER_USUARIO_MODIFICA(ER_USUARIO_MODIFICA);
	}

	/**
	* Returns the e r_ f e c h a_ m o d i f i c a of this evaluacion reclutamiento.
	*
	* @return the e r_ f e c h a_ m o d i f i c a of this evaluacion reclutamiento
	*/
	@Override
	public java.util.Date getER_FECHA_MODIFICA() {
		return _evaluacionReclutamiento.getER_FECHA_MODIFICA();
	}

	/**
	* Sets the e r_ f e c h a_ m o d i f i c a of this evaluacion reclutamiento.
	*
	* @param ER_FECHA_MODIFICA the e r_ f e c h a_ m o d i f i c a of this evaluacion reclutamiento
	*/
	@Override
	public void setER_FECHA_MODIFICA(java.util.Date ER_FECHA_MODIFICA) {
		_evaluacionReclutamiento.setER_FECHA_MODIFICA(ER_FECHA_MODIFICA);
	}

	@Override
	public boolean isNew() {
		return _evaluacionReclutamiento.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_evaluacionReclutamiento.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _evaluacionReclutamiento.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_evaluacionReclutamiento.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _evaluacionReclutamiento.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _evaluacionReclutamiento.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_evaluacionReclutamiento.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _evaluacionReclutamiento.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_evaluacionReclutamiento.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_evaluacionReclutamiento.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_evaluacionReclutamiento.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EvaluacionReclutamientoWrapper((EvaluacionReclutamiento)_evaluacionReclutamiento.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.EvaluacionReclutamiento evaluacionReclutamiento) {
		return _evaluacionReclutamiento.compareTo(evaluacionReclutamiento);
	}

	@Override
	public int hashCode() {
		return _evaluacionReclutamiento.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.EvaluacionReclutamiento> toCacheModel() {
		return _evaluacionReclutamiento.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.EvaluacionReclutamiento toEscapedModel() {
		return new EvaluacionReclutamientoWrapper(_evaluacionReclutamiento.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.EvaluacionReclutamiento toUnescapedModel() {
		return new EvaluacionReclutamientoWrapper(_evaluacionReclutamiento.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _evaluacionReclutamiento.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _evaluacionReclutamiento.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_evaluacionReclutamiento.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EvaluacionReclutamientoWrapper)) {
			return false;
		}

		EvaluacionReclutamientoWrapper evaluacionReclutamientoWrapper = (EvaluacionReclutamientoWrapper)obj;

		if (Validator.equals(_evaluacionReclutamiento,
					evaluacionReclutamientoWrapper._evaluacionReclutamiento)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EvaluacionReclutamiento getWrappedEvaluacionReclutamiento() {
		return _evaluacionReclutamiento;
	}

	@Override
	public EvaluacionReclutamiento getWrappedModel() {
		return _evaluacionReclutamiento;
	}

	@Override
	public void resetOriginalValues() {
		_evaluacionReclutamiento.resetOriginalValues();
	}

	private EvaluacionReclutamiento _evaluacionReclutamiento;
}
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
 * This class is a wrapper for {@link ActividadPlan}.
 * </p>
 *
 * @author Danielle Delgado
 * @see ActividadPlan
 * @generated
 */
public class ActividadPlanWrapper implements ActividadPlan,
	ModelWrapper<ActividadPlan> {
	public ActividadPlanWrapper(ActividadPlan actividadPlan) {
		_actividadPlan = actividadPlan;
	}

	@Override
	public Class<?> getModelClass() {
		return ActividadPlan.class;
	}

	@Override
	public String getModelClassName() {
		return ActividadPlan.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("actividadCronogramaId", getActividadCronogramaId());
		attributes.put("actividadPlanId", getActividadPlanId());
		attributes.put("planAccionId", getPlanAccionId());
		attributes.put("actividad", getActividad());
		attributes.put("evidencia", getEvidencia());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long actividadCronogramaId = (Long)attributes.get(
				"actividadCronogramaId");

		if (actividadCronogramaId != null) {
			setActividadCronogramaId(actividadCronogramaId);
		}

		Long actividadPlanId = (Long)attributes.get("actividadPlanId");

		if (actividadPlanId != null) {
			setActividadPlanId(actividadPlanId);
		}

		Long planAccionId = (Long)attributes.get("planAccionId");

		if (planAccionId != null) {
			setPlanAccionId(planAccionId);
		}

		String actividad = (String)attributes.get("actividad");

		if (actividad != null) {
			setActividad(actividad);
		}

		String evidencia = (String)attributes.get("evidencia");

		if (evidencia != null) {
			setEvidencia(evidencia);
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
	* Returns the primary key of this actividad plan.
	*
	* @return the primary key of this actividad plan
	*/
	@Override
	public com.hitss.layer.service.persistence.ActividadPlanPK getPrimaryKey() {
		return _actividadPlan.getPrimaryKey();
	}

	/**
	* Sets the primary key of this actividad plan.
	*
	* @param primaryKey the primary key of this actividad plan
	*/
	@Override
	public void setPrimaryKey(
		com.hitss.layer.service.persistence.ActividadPlanPK primaryKey) {
		_actividadPlan.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the actividad cronograma ID of this actividad plan.
	*
	* @return the actividad cronograma ID of this actividad plan
	*/
	@Override
	public long getActividadCronogramaId() {
		return _actividadPlan.getActividadCronogramaId();
	}

	/**
	* Sets the actividad cronograma ID of this actividad plan.
	*
	* @param actividadCronogramaId the actividad cronograma ID of this actividad plan
	*/
	@Override
	public void setActividadCronogramaId(long actividadCronogramaId) {
		_actividadPlan.setActividadCronogramaId(actividadCronogramaId);
	}

	/**
	* Returns the actividad plan ID of this actividad plan.
	*
	* @return the actividad plan ID of this actividad plan
	*/
	@Override
	public long getActividadPlanId() {
		return _actividadPlan.getActividadPlanId();
	}

	/**
	* Sets the actividad plan ID of this actividad plan.
	*
	* @param actividadPlanId the actividad plan ID of this actividad plan
	*/
	@Override
	public void setActividadPlanId(long actividadPlanId) {
		_actividadPlan.setActividadPlanId(actividadPlanId);
	}

	/**
	* Returns the plan accion ID of this actividad plan.
	*
	* @return the plan accion ID of this actividad plan
	*/
	@Override
	public long getPlanAccionId() {
		return _actividadPlan.getPlanAccionId();
	}

	/**
	* Sets the plan accion ID of this actividad plan.
	*
	* @param planAccionId the plan accion ID of this actividad plan
	*/
	@Override
	public void setPlanAccionId(long planAccionId) {
		_actividadPlan.setPlanAccionId(planAccionId);
	}

	/**
	* Returns the actividad of this actividad plan.
	*
	* @return the actividad of this actividad plan
	*/
	@Override
	public java.lang.String getActividad() {
		return _actividadPlan.getActividad();
	}

	/**
	* Sets the actividad of this actividad plan.
	*
	* @param actividad the actividad of this actividad plan
	*/
	@Override
	public void setActividad(java.lang.String actividad) {
		_actividadPlan.setActividad(actividad);
	}

	/**
	* Returns the evidencia of this actividad plan.
	*
	* @return the evidencia of this actividad plan
	*/
	@Override
	public java.lang.String getEvidencia() {
		return _actividadPlan.getEvidencia();
	}

	/**
	* Sets the evidencia of this actividad plan.
	*
	* @param evidencia the evidencia of this actividad plan
	*/
	@Override
	public void setEvidencia(java.lang.String evidencia) {
		_actividadPlan.setEvidencia(evidencia);
	}

	/**
	* Returns the activo of this actividad plan.
	*
	* @return the activo of this actividad plan
	*/
	@Override
	public boolean getActivo() {
		return _actividadPlan.getActivo();
	}

	/**
	* Returns <code>true</code> if this actividad plan is activo.
	*
	* @return <code>true</code> if this actividad plan is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _actividadPlan.isActivo();
	}

	/**
	* Sets whether this actividad plan is activo.
	*
	* @param activo the activo of this actividad plan
	*/
	@Override
	public void setActivo(boolean activo) {
		_actividadPlan.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this actividad plan.
	*
	* @return the usuariocrea of this actividad plan
	*/
	@Override
	public long getUsuariocrea() {
		return _actividadPlan.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this actividad plan.
	*
	* @param usuariocrea the usuariocrea of this actividad plan
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_actividadPlan.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this actividad plan.
	*
	* @return the fechacrea of this actividad plan
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _actividadPlan.getFechacrea();
	}

	/**
	* Sets the fechacrea of this actividad plan.
	*
	* @param fechacrea the fechacrea of this actividad plan
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_actividadPlan.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this actividad plan.
	*
	* @return the usuariomodifica of this actividad plan
	*/
	@Override
	public long getUsuariomodifica() {
		return _actividadPlan.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this actividad plan.
	*
	* @param usuariomodifica the usuariomodifica of this actividad plan
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_actividadPlan.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechamodifica of this actividad plan.
	*
	* @return the fechamodifica of this actividad plan
	*/
	@Override
	public java.util.Date getFechamodifica() {
		return _actividadPlan.getFechamodifica();
	}

	/**
	* Sets the fechamodifica of this actividad plan.
	*
	* @param fechamodifica the fechamodifica of this actividad plan
	*/
	@Override
	public void setFechamodifica(java.util.Date fechamodifica) {
		_actividadPlan.setFechamodifica(fechamodifica);
	}

	@Override
	public boolean isNew() {
		return _actividadPlan.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_actividadPlan.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _actividadPlan.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_actividadPlan.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _actividadPlan.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _actividadPlan.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_actividadPlan.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _actividadPlan.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_actividadPlan.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_actividadPlan.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_actividadPlan.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ActividadPlanWrapper((ActividadPlan)_actividadPlan.clone());
	}

	@Override
	public int compareTo(com.hitss.layer.model.ActividadPlan actividadPlan) {
		return _actividadPlan.compareTo(actividadPlan);
	}

	@Override
	public int hashCode() {
		return _actividadPlan.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.ActividadPlan> toCacheModel() {
		return _actividadPlan.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.ActividadPlan toEscapedModel() {
		return new ActividadPlanWrapper(_actividadPlan.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.ActividadPlan toUnescapedModel() {
		return new ActividadPlanWrapper(_actividadPlan.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _actividadPlan.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _actividadPlan.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_actividadPlan.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActividadPlanWrapper)) {
			return false;
		}

		ActividadPlanWrapper actividadPlanWrapper = (ActividadPlanWrapper)obj;

		if (Validator.equals(_actividadPlan, actividadPlanWrapper._actividadPlan)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ActividadPlan getWrappedActividadPlan() {
		return _actividadPlan;
	}

	@Override
	public ActividadPlan getWrappedModel() {
		return _actividadPlan;
	}

	@Override
	public void resetOriginalValues() {
		_actividadPlan.resetOriginalValues();
	}

	private ActividadPlan _actividadPlan;
}
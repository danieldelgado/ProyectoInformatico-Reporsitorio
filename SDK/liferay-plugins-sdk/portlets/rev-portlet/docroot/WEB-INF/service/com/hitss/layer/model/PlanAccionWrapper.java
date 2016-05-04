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
 * This class is a wrapper for {@link PlanAccion}.
 * </p>
 *
 * @author Danielle Delgado
 * @see PlanAccion
 * @generated
 */
public class PlanAccionWrapper implements PlanAccion, ModelWrapper<PlanAccion> {
	public PlanAccionWrapper(PlanAccion planAccion) {
		_planAccion = planAccion;
	}

	@Override
	public Class<?> getModelClass() {
		return PlanAccion.class;
	}

	@Override
	public String getModelClassName() {
		return PlanAccion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("planAccionId", getPlanAccionId());
		attributes.put("cronogramaId", getCronogramaId());
		attributes.put("responsable", getResponsable());
		attributes.put("fechaProgramada", getFechaProgramada());
		attributes.put("aprobadorColaborador", getAprobadorColaborador());
		attributes.put("aprobadorLider", getAprobadorLider());
		attributes.put("jerarquiaEvaluar", getJerarquiaEvaluar());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long planAccionId = (Long)attributes.get("planAccionId");

		if (planAccionId != null) {
			setPlanAccionId(planAccionId);
		}

		Long cronogramaId = (Long)attributes.get("cronogramaId");

		if (cronogramaId != null) {
			setCronogramaId(cronogramaId);
		}

		Long responsable = (Long)attributes.get("responsable");

		if (responsable != null) {
			setResponsable(responsable);
		}

		Date fechaProgramada = (Date)attributes.get("fechaProgramada");

		if (fechaProgramada != null) {
			setFechaProgramada(fechaProgramada);
		}

		Boolean aprobadorColaborador = (Boolean)attributes.get(
				"aprobadorColaborador");

		if (aprobadorColaborador != null) {
			setAprobadorColaborador(aprobadorColaborador);
		}

		Boolean aprobadorLider = (Boolean)attributes.get("aprobadorLider");

		if (aprobadorLider != null) {
			setAprobadorLider(aprobadorLider);
		}

		Long jerarquiaEvaluar = (Long)attributes.get("jerarquiaEvaluar");

		if (jerarquiaEvaluar != null) {
			setJerarquiaEvaluar(jerarquiaEvaluar);
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

		Date fechacreamodifica = (Date)attributes.get("fechacreamodifica");

		if (fechacreamodifica != null) {
			setFechacreamodifica(fechacreamodifica);
		}
	}

	/**
	* Returns the primary key of this plan accion.
	*
	* @return the primary key of this plan accion
	*/
	@Override
	public long getPrimaryKey() {
		return _planAccion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this plan accion.
	*
	* @param primaryKey the primary key of this plan accion
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_planAccion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the plan accion ID of this plan accion.
	*
	* @return the plan accion ID of this plan accion
	*/
	@Override
	public long getPlanAccionId() {
		return _planAccion.getPlanAccionId();
	}

	/**
	* Sets the plan accion ID of this plan accion.
	*
	* @param planAccionId the plan accion ID of this plan accion
	*/
	@Override
	public void setPlanAccionId(long planAccionId) {
		_planAccion.setPlanAccionId(planAccionId);
	}

	/**
	* Returns the cronograma ID of this plan accion.
	*
	* @return the cronograma ID of this plan accion
	*/
	@Override
	public long getCronogramaId() {
		return _planAccion.getCronogramaId();
	}

	/**
	* Sets the cronograma ID of this plan accion.
	*
	* @param cronogramaId the cronograma ID of this plan accion
	*/
	@Override
	public void setCronogramaId(long cronogramaId) {
		_planAccion.setCronogramaId(cronogramaId);
	}

	/**
	* Returns the responsable of this plan accion.
	*
	* @return the responsable of this plan accion
	*/
	@Override
	public long getResponsable() {
		return _planAccion.getResponsable();
	}

	/**
	* Sets the responsable of this plan accion.
	*
	* @param responsable the responsable of this plan accion
	*/
	@Override
	public void setResponsable(long responsable) {
		_planAccion.setResponsable(responsable);
	}

	/**
	* Returns the fecha programada of this plan accion.
	*
	* @return the fecha programada of this plan accion
	*/
	@Override
	public java.util.Date getFechaProgramada() {
		return _planAccion.getFechaProgramada();
	}

	/**
	* Sets the fecha programada of this plan accion.
	*
	* @param fechaProgramada the fecha programada of this plan accion
	*/
	@Override
	public void setFechaProgramada(java.util.Date fechaProgramada) {
		_planAccion.setFechaProgramada(fechaProgramada);
	}

	/**
	* Returns the aprobador colaborador of this plan accion.
	*
	* @return the aprobador colaborador of this plan accion
	*/
	@Override
	public boolean getAprobadorColaborador() {
		return _planAccion.getAprobadorColaborador();
	}

	/**
	* Returns <code>true</code> if this plan accion is aprobador colaborador.
	*
	* @return <code>true</code> if this plan accion is aprobador colaborador; <code>false</code> otherwise
	*/
	@Override
	public boolean isAprobadorColaborador() {
		return _planAccion.isAprobadorColaborador();
	}

	/**
	* Sets whether this plan accion is aprobador colaborador.
	*
	* @param aprobadorColaborador the aprobador colaborador of this plan accion
	*/
	@Override
	public void setAprobadorColaborador(boolean aprobadorColaborador) {
		_planAccion.setAprobadorColaborador(aprobadorColaborador);
	}

	/**
	* Returns the aprobador lider of this plan accion.
	*
	* @return the aprobador lider of this plan accion
	*/
	@Override
	public boolean getAprobadorLider() {
		return _planAccion.getAprobadorLider();
	}

	/**
	* Returns <code>true</code> if this plan accion is aprobador lider.
	*
	* @return <code>true</code> if this plan accion is aprobador lider; <code>false</code> otherwise
	*/
	@Override
	public boolean isAprobadorLider() {
		return _planAccion.isAprobadorLider();
	}

	/**
	* Sets whether this plan accion is aprobador lider.
	*
	* @param aprobadorLider the aprobador lider of this plan accion
	*/
	@Override
	public void setAprobadorLider(boolean aprobadorLider) {
		_planAccion.setAprobadorLider(aprobadorLider);
	}

	/**
	* Returns the jerarquia evaluar of this plan accion.
	*
	* @return the jerarquia evaluar of this plan accion
	*/
	@Override
	public long getJerarquiaEvaluar() {
		return _planAccion.getJerarquiaEvaluar();
	}

	/**
	* Sets the jerarquia evaluar of this plan accion.
	*
	* @param jerarquiaEvaluar the jerarquia evaluar of this plan accion
	*/
	@Override
	public void setJerarquiaEvaluar(long jerarquiaEvaluar) {
		_planAccion.setJerarquiaEvaluar(jerarquiaEvaluar);
	}

	/**
	* Returns the activo of this plan accion.
	*
	* @return the activo of this plan accion
	*/
	@Override
	public boolean getActivo() {
		return _planAccion.getActivo();
	}

	/**
	* Returns <code>true</code> if this plan accion is activo.
	*
	* @return <code>true</code> if this plan accion is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _planAccion.isActivo();
	}

	/**
	* Sets whether this plan accion is activo.
	*
	* @param activo the activo of this plan accion
	*/
	@Override
	public void setActivo(boolean activo) {
		_planAccion.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this plan accion.
	*
	* @return the usuariocrea of this plan accion
	*/
	@Override
	public long getUsuariocrea() {
		return _planAccion.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this plan accion.
	*
	* @param usuariocrea the usuariocrea of this plan accion
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_planAccion.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this plan accion.
	*
	* @return the fechacrea of this plan accion
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _planAccion.getFechacrea();
	}

	/**
	* Sets the fechacrea of this plan accion.
	*
	* @param fechacrea the fechacrea of this plan accion
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_planAccion.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this plan accion.
	*
	* @return the usuariomodifica of this plan accion
	*/
	@Override
	public long getUsuariomodifica() {
		return _planAccion.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this plan accion.
	*
	* @param usuariomodifica the usuariomodifica of this plan accion
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_planAccion.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this plan accion.
	*
	* @return the fechacreamodifica of this plan accion
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _planAccion.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this plan accion.
	*
	* @param fechacreamodifica the fechacreamodifica of this plan accion
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_planAccion.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _planAccion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_planAccion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _planAccion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_planAccion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _planAccion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _planAccion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_planAccion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _planAccion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_planAccion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_planAccion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_planAccion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PlanAccionWrapper((PlanAccion)_planAccion.clone());
	}

	@Override
	public int compareTo(com.hitss.layer.model.PlanAccion planAccion) {
		return _planAccion.compareTo(planAccion);
	}

	@Override
	public int hashCode() {
		return _planAccion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.PlanAccion> toCacheModel() {
		return _planAccion.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.PlanAccion toEscapedModel() {
		return new PlanAccionWrapper(_planAccion.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.PlanAccion toUnescapedModel() {
		return new PlanAccionWrapper(_planAccion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _planAccion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _planAccion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_planAccion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PlanAccionWrapper)) {
			return false;
		}

		PlanAccionWrapper planAccionWrapper = (PlanAccionWrapper)obj;

		if (Validator.equals(_planAccion, planAccionWrapper._planAccion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PlanAccion getWrappedPlanAccion() {
		return _planAccion;
	}

	@Override
	public PlanAccion getWrappedModel() {
		return _planAccion;
	}

	@Override
	public void resetOriginalValues() {
		_planAccion.resetOriginalValues();
	}

	private PlanAccion _planAccion;
}
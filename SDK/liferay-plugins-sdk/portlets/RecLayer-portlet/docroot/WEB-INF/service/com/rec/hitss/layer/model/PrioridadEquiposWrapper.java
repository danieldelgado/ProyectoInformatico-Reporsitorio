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
 * This class is a wrapper for {@link PrioridadEquipos}.
 * </p>
 *
 * @author Crossfire
 * @see PrioridadEquipos
 * @generated
 */
public class PrioridadEquiposWrapper implements PrioridadEquipos,
	ModelWrapper<PrioridadEquipos> {
	public PrioridadEquiposWrapper(PrioridadEquipos prioridadEquipos) {
		_prioridadEquipos = prioridadEquipos;
	}

	@Override
	public Class<?> getModelClass() {
		return PrioridadEquipos.class;
	}

	@Override
	public String getModelClassName() {
		return PrioridadEquipos.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("prioridadEquiposId", getPrioridadEquiposId());
		attributes.put("solicitudEvaluacionDesempenoId",
			getSolicitudEvaluacionDesempenoId());
		attributes.put("responsable", getResponsable());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long prioridadEquiposId = (Long)attributes.get("prioridadEquiposId");

		if (prioridadEquiposId != null) {
			setPrioridadEquiposId(prioridadEquiposId);
		}

		Long solicitudEvaluacionDesempenoId = (Long)attributes.get(
				"solicitudEvaluacionDesempenoId");

		if (solicitudEvaluacionDesempenoId != null) {
			setSolicitudEvaluacionDesempenoId(solicitudEvaluacionDesempenoId);
		}

		Long responsable = (Long)attributes.get("responsable");

		if (responsable != null) {
			setResponsable(responsable);
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
	* Returns the primary key of this prioridad equipos.
	*
	* @return the primary key of this prioridad equipos
	*/
	@Override
	public long getPrimaryKey() {
		return _prioridadEquipos.getPrimaryKey();
	}

	/**
	* Sets the primary key of this prioridad equipos.
	*
	* @param primaryKey the primary key of this prioridad equipos
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_prioridadEquipos.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the prioridad equipos ID of this prioridad equipos.
	*
	* @return the prioridad equipos ID of this prioridad equipos
	*/
	@Override
	public long getPrioridadEquiposId() {
		return _prioridadEquipos.getPrioridadEquiposId();
	}

	/**
	* Sets the prioridad equipos ID of this prioridad equipos.
	*
	* @param prioridadEquiposId the prioridad equipos ID of this prioridad equipos
	*/
	@Override
	public void setPrioridadEquiposId(long prioridadEquiposId) {
		_prioridadEquipos.setPrioridadEquiposId(prioridadEquiposId);
	}

	/**
	* Returns the solicitud evaluacion desempeno ID of this prioridad equipos.
	*
	* @return the solicitud evaluacion desempeno ID of this prioridad equipos
	*/
	@Override
	public long getSolicitudEvaluacionDesempenoId() {
		return _prioridadEquipos.getSolicitudEvaluacionDesempenoId();
	}

	/**
	* Sets the solicitud evaluacion desempeno ID of this prioridad equipos.
	*
	* @param solicitudEvaluacionDesempenoId the solicitud evaluacion desempeno ID of this prioridad equipos
	*/
	@Override
	public void setSolicitudEvaluacionDesempenoId(
		long solicitudEvaluacionDesempenoId) {
		_prioridadEquipos.setSolicitudEvaluacionDesempenoId(solicitudEvaluacionDesempenoId);
	}

	/**
	* Returns the responsable of this prioridad equipos.
	*
	* @return the responsable of this prioridad equipos
	*/
	@Override
	public long getResponsable() {
		return _prioridadEquipos.getResponsable();
	}

	/**
	* Sets the responsable of this prioridad equipos.
	*
	* @param responsable the responsable of this prioridad equipos
	*/
	@Override
	public void setResponsable(long responsable) {
		_prioridadEquipos.setResponsable(responsable);
	}

	/**
	* Returns the activo of this prioridad equipos.
	*
	* @return the activo of this prioridad equipos
	*/
	@Override
	public boolean getActivo() {
		return _prioridadEquipos.getActivo();
	}

	/**
	* Returns <code>true</code> if this prioridad equipos is activo.
	*
	* @return <code>true</code> if this prioridad equipos is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _prioridadEquipos.isActivo();
	}

	/**
	* Sets whether this prioridad equipos is activo.
	*
	* @param activo the activo of this prioridad equipos
	*/
	@Override
	public void setActivo(boolean activo) {
		_prioridadEquipos.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this prioridad equipos.
	*
	* @return the usuariocrea of this prioridad equipos
	*/
	@Override
	public long getUsuariocrea() {
		return _prioridadEquipos.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this prioridad equipos.
	*
	* @param usuariocrea the usuariocrea of this prioridad equipos
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_prioridadEquipos.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this prioridad equipos.
	*
	* @return the fechacrea of this prioridad equipos
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _prioridadEquipos.getFechacrea();
	}

	/**
	* Sets the fechacrea of this prioridad equipos.
	*
	* @param fechacrea the fechacrea of this prioridad equipos
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_prioridadEquipos.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this prioridad equipos.
	*
	* @return the usuariomodifica of this prioridad equipos
	*/
	@Override
	public long getUsuariomodifica() {
		return _prioridadEquipos.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this prioridad equipos.
	*
	* @param usuariomodifica the usuariomodifica of this prioridad equipos
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_prioridadEquipos.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this prioridad equipos.
	*
	* @return the fechacreamodifica of this prioridad equipos
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _prioridadEquipos.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this prioridad equipos.
	*
	* @param fechacreamodifica the fechacreamodifica of this prioridad equipos
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_prioridadEquipos.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _prioridadEquipos.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_prioridadEquipos.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _prioridadEquipos.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_prioridadEquipos.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _prioridadEquipos.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _prioridadEquipos.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_prioridadEquipos.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _prioridadEquipos.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_prioridadEquipos.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_prioridadEquipos.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_prioridadEquipos.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PrioridadEquiposWrapper((PrioridadEquipos)_prioridadEquipos.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.PrioridadEquipos prioridadEquipos) {
		return _prioridadEquipos.compareTo(prioridadEquipos);
	}

	@Override
	public int hashCode() {
		return _prioridadEquipos.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.PrioridadEquipos> toCacheModel() {
		return _prioridadEquipos.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.PrioridadEquipos toEscapedModel() {
		return new PrioridadEquiposWrapper(_prioridadEquipos.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.PrioridadEquipos toUnescapedModel() {
		return new PrioridadEquiposWrapper(_prioridadEquipos.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _prioridadEquipos.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _prioridadEquipos.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_prioridadEquipos.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PrioridadEquiposWrapper)) {
			return false;
		}

		PrioridadEquiposWrapper prioridadEquiposWrapper = (PrioridadEquiposWrapper)obj;

		if (Validator.equals(_prioridadEquipos,
					prioridadEquiposWrapper._prioridadEquipos)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PrioridadEquipos getWrappedPrioridadEquipos() {
		return _prioridadEquipos;
	}

	@Override
	public PrioridadEquipos getWrappedModel() {
		return _prioridadEquipos;
	}

	@Override
	public void resetOriginalValues() {
		_prioridadEquipos.resetOriginalValues();
	}

	private PrioridadEquipos _prioridadEquipos;
}
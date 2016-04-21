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
 * This class is a wrapper for {@link CronogramaEvaluacionPersonal}.
 * </p>
 *
 * @author Crossfire
 * @see CronogramaEvaluacionPersonal
 * @generated
 */
public class CronogramaEvaluacionPersonalWrapper
	implements CronogramaEvaluacionPersonal,
		ModelWrapper<CronogramaEvaluacionPersonal> {
	public CronogramaEvaluacionPersonalWrapper(
		CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal) {
		_cronogramaEvaluacionPersonal = cronogramaEvaluacionPersonal;
	}

	@Override
	public Class<?> getModelClass() {
		return CronogramaEvaluacionPersonal.class;
	}

	@Override
	public String getModelClassName() {
		return CronogramaEvaluacionPersonal.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cronogramaEvaluacionPersonalId",
			getCronogramaEvaluacionPersonalId());
		attributes.put("solicitudEvaluacionDesempenoId",
			getSolicitudEvaluacionDesempenoId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("estado", getEstado());
		attributes.put("observacion", getObservacion());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cronogramaEvaluacionPersonalId = (Long)attributes.get(
				"cronogramaEvaluacionPersonalId");

		if (cronogramaEvaluacionPersonalId != null) {
			setCronogramaEvaluacionPersonalId(cronogramaEvaluacionPersonalId);
		}

		Long solicitudEvaluacionDesempenoId = (Long)attributes.get(
				"solicitudEvaluacionDesempenoId");

		if (solicitudEvaluacionDesempenoId != null) {
			setSolicitudEvaluacionDesempenoId(solicitudEvaluacionDesempenoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String estado = (String)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		String observacion = (String)attributes.get("observacion");

		if (observacion != null) {
			setObservacion(observacion);
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
	* Returns the primary key of this cronograma evaluacion personal.
	*
	* @return the primary key of this cronograma evaluacion personal
	*/
	@Override
	public long getPrimaryKey() {
		return _cronogramaEvaluacionPersonal.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cronograma evaluacion personal.
	*
	* @param primaryKey the primary key of this cronograma evaluacion personal
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cronogramaEvaluacionPersonal.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cronograma evaluacion personal ID of this cronograma evaluacion personal.
	*
	* @return the cronograma evaluacion personal ID of this cronograma evaluacion personal
	*/
	@Override
	public long getCronogramaEvaluacionPersonalId() {
		return _cronogramaEvaluacionPersonal.getCronogramaEvaluacionPersonalId();
	}

	/**
	* Sets the cronograma evaluacion personal ID of this cronograma evaluacion personal.
	*
	* @param cronogramaEvaluacionPersonalId the cronograma evaluacion personal ID of this cronograma evaluacion personal
	*/
	@Override
	public void setCronogramaEvaluacionPersonalId(
		long cronogramaEvaluacionPersonalId) {
		_cronogramaEvaluacionPersonal.setCronogramaEvaluacionPersonalId(cronogramaEvaluacionPersonalId);
	}

	/**
	* Returns the solicitud evaluacion desempeno ID of this cronograma evaluacion personal.
	*
	* @return the solicitud evaluacion desempeno ID of this cronograma evaluacion personal
	*/
	@Override
	public long getSolicitudEvaluacionDesempenoId() {
		return _cronogramaEvaluacionPersonal.getSolicitudEvaluacionDesempenoId();
	}

	/**
	* Sets the solicitud evaluacion desempeno ID of this cronograma evaluacion personal.
	*
	* @param solicitudEvaluacionDesempenoId the solicitud evaluacion desempeno ID of this cronograma evaluacion personal
	*/
	@Override
	public void setSolicitudEvaluacionDesempenoId(
		long solicitudEvaluacionDesempenoId) {
		_cronogramaEvaluacionPersonal.setSolicitudEvaluacionDesempenoId(solicitudEvaluacionDesempenoId);
	}

	/**
	* Returns the descripcion of this cronograma evaluacion personal.
	*
	* @return the descripcion of this cronograma evaluacion personal
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _cronogramaEvaluacionPersonal.getDescripcion();
	}

	/**
	* Sets the descripcion of this cronograma evaluacion personal.
	*
	* @param descripcion the descripcion of this cronograma evaluacion personal
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_cronogramaEvaluacionPersonal.setDescripcion(descripcion);
	}

	/**
	* Returns the estado of this cronograma evaluacion personal.
	*
	* @return the estado of this cronograma evaluacion personal
	*/
	@Override
	public java.lang.String getEstado() {
		return _cronogramaEvaluacionPersonal.getEstado();
	}

	/**
	* Sets the estado of this cronograma evaluacion personal.
	*
	* @param estado the estado of this cronograma evaluacion personal
	*/
	@Override
	public void setEstado(java.lang.String estado) {
		_cronogramaEvaluacionPersonal.setEstado(estado);
	}

	/**
	* Returns the observacion of this cronograma evaluacion personal.
	*
	* @return the observacion of this cronograma evaluacion personal
	*/
	@Override
	public java.lang.String getObservacion() {
		return _cronogramaEvaluacionPersonal.getObservacion();
	}

	/**
	* Sets the observacion of this cronograma evaluacion personal.
	*
	* @param observacion the observacion of this cronograma evaluacion personal
	*/
	@Override
	public void setObservacion(java.lang.String observacion) {
		_cronogramaEvaluacionPersonal.setObservacion(observacion);
	}

	/**
	* Returns the activo of this cronograma evaluacion personal.
	*
	* @return the activo of this cronograma evaluacion personal
	*/
	@Override
	public boolean getActivo() {
		return _cronogramaEvaluacionPersonal.getActivo();
	}

	/**
	* Returns <code>true</code> if this cronograma evaluacion personal is activo.
	*
	* @return <code>true</code> if this cronograma evaluacion personal is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _cronogramaEvaluacionPersonal.isActivo();
	}

	/**
	* Sets whether this cronograma evaluacion personal is activo.
	*
	* @param activo the activo of this cronograma evaluacion personal
	*/
	@Override
	public void setActivo(boolean activo) {
		_cronogramaEvaluacionPersonal.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this cronograma evaluacion personal.
	*
	* @return the usuariocrea of this cronograma evaluacion personal
	*/
	@Override
	public long getUsuariocrea() {
		return _cronogramaEvaluacionPersonal.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this cronograma evaluacion personal.
	*
	* @param usuariocrea the usuariocrea of this cronograma evaluacion personal
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_cronogramaEvaluacionPersonal.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this cronograma evaluacion personal.
	*
	* @return the fechacrea of this cronograma evaluacion personal
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _cronogramaEvaluacionPersonal.getFechacrea();
	}

	/**
	* Sets the fechacrea of this cronograma evaluacion personal.
	*
	* @param fechacrea the fechacrea of this cronograma evaluacion personal
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_cronogramaEvaluacionPersonal.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this cronograma evaluacion personal.
	*
	* @return the usuariomodifica of this cronograma evaluacion personal
	*/
	@Override
	public long getUsuariomodifica() {
		return _cronogramaEvaluacionPersonal.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this cronograma evaluacion personal.
	*
	* @param usuariomodifica the usuariomodifica of this cronograma evaluacion personal
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_cronogramaEvaluacionPersonal.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this cronograma evaluacion personal.
	*
	* @return the fechacreamodifica of this cronograma evaluacion personal
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _cronogramaEvaluacionPersonal.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this cronograma evaluacion personal.
	*
	* @param fechacreamodifica the fechacreamodifica of this cronograma evaluacion personal
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_cronogramaEvaluacionPersonal.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _cronogramaEvaluacionPersonal.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_cronogramaEvaluacionPersonal.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _cronogramaEvaluacionPersonal.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cronogramaEvaluacionPersonal.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _cronogramaEvaluacionPersonal.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _cronogramaEvaluacionPersonal.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_cronogramaEvaluacionPersonal.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _cronogramaEvaluacionPersonal.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_cronogramaEvaluacionPersonal.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_cronogramaEvaluacionPersonal.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_cronogramaEvaluacionPersonal.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CronogramaEvaluacionPersonalWrapper((CronogramaEvaluacionPersonal)_cronogramaEvaluacionPersonal.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal) {
		return _cronogramaEvaluacionPersonal.compareTo(cronogramaEvaluacionPersonal);
	}

	@Override
	public int hashCode() {
		return _cronogramaEvaluacionPersonal.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.CronogramaEvaluacionPersonal> toCacheModel() {
		return _cronogramaEvaluacionPersonal.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.CronogramaEvaluacionPersonal toEscapedModel() {
		return new CronogramaEvaluacionPersonalWrapper(_cronogramaEvaluacionPersonal.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.CronogramaEvaluacionPersonal toUnescapedModel() {
		return new CronogramaEvaluacionPersonalWrapper(_cronogramaEvaluacionPersonal.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _cronogramaEvaluacionPersonal.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cronogramaEvaluacionPersonal.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_cronogramaEvaluacionPersonal.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CronogramaEvaluacionPersonalWrapper)) {
			return false;
		}

		CronogramaEvaluacionPersonalWrapper cronogramaEvaluacionPersonalWrapper = (CronogramaEvaluacionPersonalWrapper)obj;

		if (Validator.equals(_cronogramaEvaluacionPersonal,
					cronogramaEvaluacionPersonalWrapper._cronogramaEvaluacionPersonal)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CronogramaEvaluacionPersonal getWrappedCronogramaEvaluacionPersonal() {
		return _cronogramaEvaluacionPersonal;
	}

	@Override
	public CronogramaEvaluacionPersonal getWrappedModel() {
		return _cronogramaEvaluacionPersonal;
	}

	@Override
	public void resetOriginalValues() {
		_cronogramaEvaluacionPersonal.resetOriginalValues();
	}

	private CronogramaEvaluacionPersonal _cronogramaEvaluacionPersonal;
}
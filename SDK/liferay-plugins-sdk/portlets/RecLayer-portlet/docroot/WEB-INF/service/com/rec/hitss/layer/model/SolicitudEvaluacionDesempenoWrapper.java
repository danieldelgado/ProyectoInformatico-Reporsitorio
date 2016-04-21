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
 * This class is a wrapper for {@link SolicitudEvaluacionDesempeno}.
 * </p>
 *
 * @author Crossfire
 * @see SolicitudEvaluacionDesempeno
 * @generated
 */
public class SolicitudEvaluacionDesempenoWrapper
	implements SolicitudEvaluacionDesempeno,
		ModelWrapper<SolicitudEvaluacionDesempeno> {
	public SolicitudEvaluacionDesempenoWrapper(
		SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno) {
		_solicitudEvaluacionDesempeno = solicitudEvaluacionDesempeno;
	}

	@Override
	public Class<?> getModelClass() {
		return SolicitudEvaluacionDesempeno.class;
	}

	@Override
	public String getModelClassName() {
		return SolicitudEvaluacionDesempeno.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudEvaluacionDesempenoId",
			getSolicitudEvaluacionDesempenoId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("fechaIncioEvaluacion", getFechaIncioEvaluacion());
		attributes.put("estado", getEstado());
		attributes.put("motivo", getMotivo());
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
		Long solicitudEvaluacionDesempenoId = (Long)attributes.get(
				"solicitudEvaluacionDesempenoId");

		if (solicitudEvaluacionDesempenoId != null) {
			setSolicitudEvaluacionDesempenoId(solicitudEvaluacionDesempenoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Date fechaIncioEvaluacion = (Date)attributes.get("fechaIncioEvaluacion");

		if (fechaIncioEvaluacion != null) {
			setFechaIncioEvaluacion(fechaIncioEvaluacion);
		}

		String estado = (String)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		String motivo = (String)attributes.get("motivo");

		if (motivo != null) {
			setMotivo(motivo);
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
	* Returns the primary key of this solicitud evaluacion desempeno.
	*
	* @return the primary key of this solicitud evaluacion desempeno
	*/
	@Override
	public long getPrimaryKey() {
		return _solicitudEvaluacionDesempeno.getPrimaryKey();
	}

	/**
	* Sets the primary key of this solicitud evaluacion desempeno.
	*
	* @param primaryKey the primary key of this solicitud evaluacion desempeno
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_solicitudEvaluacionDesempeno.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the solicitud evaluacion desempeno ID of this solicitud evaluacion desempeno.
	*
	* @return the solicitud evaluacion desempeno ID of this solicitud evaluacion desempeno
	*/
	@Override
	public long getSolicitudEvaluacionDesempenoId() {
		return _solicitudEvaluacionDesempeno.getSolicitudEvaluacionDesempenoId();
	}

	/**
	* Sets the solicitud evaluacion desempeno ID of this solicitud evaluacion desempeno.
	*
	* @param solicitudEvaluacionDesempenoId the solicitud evaluacion desempeno ID of this solicitud evaluacion desempeno
	*/
	@Override
	public void setSolicitudEvaluacionDesempenoId(
		long solicitudEvaluacionDesempenoId) {
		_solicitudEvaluacionDesempeno.setSolicitudEvaluacionDesempenoId(solicitudEvaluacionDesempenoId);
	}

	/**
	* Returns the descripcion of this solicitud evaluacion desempeno.
	*
	* @return the descripcion of this solicitud evaluacion desempeno
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _solicitudEvaluacionDesempeno.getDescripcion();
	}

	/**
	* Sets the descripcion of this solicitud evaluacion desempeno.
	*
	* @param descripcion the descripcion of this solicitud evaluacion desempeno
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_solicitudEvaluacionDesempeno.setDescripcion(descripcion);
	}

	/**
	* Returns the fecha incio evaluacion of this solicitud evaluacion desempeno.
	*
	* @return the fecha incio evaluacion of this solicitud evaluacion desempeno
	*/
	@Override
	public java.util.Date getFechaIncioEvaluacion() {
		return _solicitudEvaluacionDesempeno.getFechaIncioEvaluacion();
	}

	/**
	* Sets the fecha incio evaluacion of this solicitud evaluacion desempeno.
	*
	* @param fechaIncioEvaluacion the fecha incio evaluacion of this solicitud evaluacion desempeno
	*/
	@Override
	public void setFechaIncioEvaluacion(java.util.Date fechaIncioEvaluacion) {
		_solicitudEvaluacionDesempeno.setFechaIncioEvaluacion(fechaIncioEvaluacion);
	}

	/**
	* Returns the estado of this solicitud evaluacion desempeno.
	*
	* @return the estado of this solicitud evaluacion desempeno
	*/
	@Override
	public java.lang.String getEstado() {
		return _solicitudEvaluacionDesempeno.getEstado();
	}

	/**
	* Sets the estado of this solicitud evaluacion desempeno.
	*
	* @param estado the estado of this solicitud evaluacion desempeno
	*/
	@Override
	public void setEstado(java.lang.String estado) {
		_solicitudEvaluacionDesempeno.setEstado(estado);
	}

	/**
	* Returns the motivo of this solicitud evaluacion desempeno.
	*
	* @return the motivo of this solicitud evaluacion desempeno
	*/
	@Override
	public java.lang.String getMotivo() {
		return _solicitudEvaluacionDesempeno.getMotivo();
	}

	/**
	* Sets the motivo of this solicitud evaluacion desempeno.
	*
	* @param motivo the motivo of this solicitud evaluacion desempeno
	*/
	@Override
	public void setMotivo(java.lang.String motivo) {
		_solicitudEvaluacionDesempeno.setMotivo(motivo);
	}

	/**
	* Returns the observacion of this solicitud evaluacion desempeno.
	*
	* @return the observacion of this solicitud evaluacion desempeno
	*/
	@Override
	public java.lang.String getObservacion() {
		return _solicitudEvaluacionDesempeno.getObservacion();
	}

	/**
	* Sets the observacion of this solicitud evaluacion desempeno.
	*
	* @param observacion the observacion of this solicitud evaluacion desempeno
	*/
	@Override
	public void setObservacion(java.lang.String observacion) {
		_solicitudEvaluacionDesempeno.setObservacion(observacion);
	}

	/**
	* Returns the activo of this solicitud evaluacion desempeno.
	*
	* @return the activo of this solicitud evaluacion desempeno
	*/
	@Override
	public boolean getActivo() {
		return _solicitudEvaluacionDesempeno.getActivo();
	}

	/**
	* Returns <code>true</code> if this solicitud evaluacion desempeno is activo.
	*
	* @return <code>true</code> if this solicitud evaluacion desempeno is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _solicitudEvaluacionDesempeno.isActivo();
	}

	/**
	* Sets whether this solicitud evaluacion desempeno is activo.
	*
	* @param activo the activo of this solicitud evaluacion desempeno
	*/
	@Override
	public void setActivo(boolean activo) {
		_solicitudEvaluacionDesempeno.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this solicitud evaluacion desempeno.
	*
	* @return the usuariocrea of this solicitud evaluacion desempeno
	*/
	@Override
	public long getUsuariocrea() {
		return _solicitudEvaluacionDesempeno.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this solicitud evaluacion desempeno.
	*
	* @param usuariocrea the usuariocrea of this solicitud evaluacion desempeno
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_solicitudEvaluacionDesempeno.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this solicitud evaluacion desempeno.
	*
	* @return the fechacrea of this solicitud evaluacion desempeno
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _solicitudEvaluacionDesempeno.getFechacrea();
	}

	/**
	* Sets the fechacrea of this solicitud evaluacion desempeno.
	*
	* @param fechacrea the fechacrea of this solicitud evaluacion desempeno
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_solicitudEvaluacionDesempeno.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this solicitud evaluacion desempeno.
	*
	* @return the usuariomodifica of this solicitud evaluacion desempeno
	*/
	@Override
	public long getUsuariomodifica() {
		return _solicitudEvaluacionDesempeno.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this solicitud evaluacion desempeno.
	*
	* @param usuariomodifica the usuariomodifica of this solicitud evaluacion desempeno
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_solicitudEvaluacionDesempeno.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this solicitud evaluacion desempeno.
	*
	* @return the fechacreamodifica of this solicitud evaluacion desempeno
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _solicitudEvaluacionDesempeno.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this solicitud evaluacion desempeno.
	*
	* @param fechacreamodifica the fechacreamodifica of this solicitud evaluacion desempeno
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_solicitudEvaluacionDesempeno.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _solicitudEvaluacionDesempeno.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_solicitudEvaluacionDesempeno.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _solicitudEvaluacionDesempeno.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_solicitudEvaluacionDesempeno.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _solicitudEvaluacionDesempeno.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _solicitudEvaluacionDesempeno.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_solicitudEvaluacionDesempeno.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _solicitudEvaluacionDesempeno.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_solicitudEvaluacionDesempeno.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_solicitudEvaluacionDesempeno.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_solicitudEvaluacionDesempeno.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SolicitudEvaluacionDesempenoWrapper((SolicitudEvaluacionDesempeno)_solicitudEvaluacionDesempeno.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno) {
		return _solicitudEvaluacionDesempeno.compareTo(solicitudEvaluacionDesempeno);
	}

	@Override
	public int hashCode() {
		return _solicitudEvaluacionDesempeno.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno> toCacheModel() {
		return _solicitudEvaluacionDesempeno.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno toEscapedModel() {
		return new SolicitudEvaluacionDesempenoWrapper(_solicitudEvaluacionDesempeno.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno toUnescapedModel() {
		return new SolicitudEvaluacionDesempenoWrapper(_solicitudEvaluacionDesempeno.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _solicitudEvaluacionDesempeno.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _solicitudEvaluacionDesempeno.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_solicitudEvaluacionDesempeno.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SolicitudEvaluacionDesempenoWrapper)) {
			return false;
		}

		SolicitudEvaluacionDesempenoWrapper solicitudEvaluacionDesempenoWrapper = (SolicitudEvaluacionDesempenoWrapper)obj;

		if (Validator.equals(_solicitudEvaluacionDesempeno,
					solicitudEvaluacionDesempenoWrapper._solicitudEvaluacionDesempeno)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SolicitudEvaluacionDesempeno getWrappedSolicitudEvaluacionDesempeno() {
		return _solicitudEvaluacionDesempeno;
	}

	@Override
	public SolicitudEvaluacionDesempeno getWrappedModel() {
		return _solicitudEvaluacionDesempeno;
	}

	@Override
	public void resetOriginalValues() {
		_solicitudEvaluacionDesempeno.resetOriginalValues();
	}

	private SolicitudEvaluacionDesempeno _solicitudEvaluacionDesempeno;
}
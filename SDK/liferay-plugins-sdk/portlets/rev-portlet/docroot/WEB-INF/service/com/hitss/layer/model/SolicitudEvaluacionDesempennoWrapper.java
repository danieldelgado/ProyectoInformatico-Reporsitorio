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
 * This class is a wrapper for {@link SolicitudEvaluacionDesempenno}.
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudEvaluacionDesempenno
 * @generated
 */
public class SolicitudEvaluacionDesempennoWrapper
	implements SolicitudEvaluacionDesempenno,
		ModelWrapper<SolicitudEvaluacionDesempenno> {
	public SolicitudEvaluacionDesempennoWrapper(
		SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno) {
		_solicitudEvaluacionDesempenno = solicitudEvaluacionDesempenno;
	}

	@Override
	public Class<?> getModelClass() {
		return SolicitudEvaluacionDesempenno.class;
	}

	@Override
	public String getModelClassName() {
		return SolicitudEvaluacionDesempenno.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudEvaluacionDesempennoId",
			getSolicitudEvaluacionDesempennoId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("fechaInicio", getFechaInicio());
		attributes.put("estado", getEstado());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long solicitudEvaluacionDesempennoId = (Long)attributes.get(
				"solicitudEvaluacionDesempennoId");

		if (solicitudEvaluacionDesempennoId != null) {
			setSolicitudEvaluacionDesempennoId(solicitudEvaluacionDesempennoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Date fechaInicio = (Date)attributes.get("fechaInicio");

		if (fechaInicio != null) {
			setFechaInicio(fechaInicio);
		}

		Long estado = (Long)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
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
	* Returns the primary key of this solicitud evaluacion desempenno.
	*
	* @return the primary key of this solicitud evaluacion desempenno
	*/
	@Override
	public long getPrimaryKey() {
		return _solicitudEvaluacionDesempenno.getPrimaryKey();
	}

	/**
	* Sets the primary key of this solicitud evaluacion desempenno.
	*
	* @param primaryKey the primary key of this solicitud evaluacion desempenno
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_solicitudEvaluacionDesempenno.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the solicitud evaluacion desempenno ID of this solicitud evaluacion desempenno.
	*
	* @return the solicitud evaluacion desempenno ID of this solicitud evaluacion desempenno
	*/
	@Override
	public long getSolicitudEvaluacionDesempennoId() {
		return _solicitudEvaluacionDesempenno.getSolicitudEvaluacionDesempennoId();
	}

	/**
	* Sets the solicitud evaluacion desempenno ID of this solicitud evaluacion desempenno.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID of this solicitud evaluacion desempenno
	*/
	@Override
	public void setSolicitudEvaluacionDesempennoId(
		long solicitudEvaluacionDesempennoId) {
		_solicitudEvaluacionDesempenno.setSolicitudEvaluacionDesempennoId(solicitudEvaluacionDesempennoId);
	}

	/**
	* Returns the descripcion of this solicitud evaluacion desempenno.
	*
	* @return the descripcion of this solicitud evaluacion desempenno
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _solicitudEvaluacionDesempenno.getDescripcion();
	}

	/**
	* Sets the descripcion of this solicitud evaluacion desempenno.
	*
	* @param descripcion the descripcion of this solicitud evaluacion desempenno
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_solicitudEvaluacionDesempenno.setDescripcion(descripcion);
	}

	/**
	* Returns the fecha inicio of this solicitud evaluacion desempenno.
	*
	* @return the fecha inicio of this solicitud evaluacion desempenno
	*/
	@Override
	public java.util.Date getFechaInicio() {
		return _solicitudEvaluacionDesempenno.getFechaInicio();
	}

	/**
	* Sets the fecha inicio of this solicitud evaluacion desempenno.
	*
	* @param fechaInicio the fecha inicio of this solicitud evaluacion desempenno
	*/
	@Override
	public void setFechaInicio(java.util.Date fechaInicio) {
		_solicitudEvaluacionDesempenno.setFechaInicio(fechaInicio);
	}

	/**
	* Returns the estado of this solicitud evaluacion desempenno.
	*
	* @return the estado of this solicitud evaluacion desempenno
	*/
	@Override
	public long getEstado() {
		return _solicitudEvaluacionDesempenno.getEstado();
	}

	/**
	* Sets the estado of this solicitud evaluacion desempenno.
	*
	* @param estado the estado of this solicitud evaluacion desempenno
	*/
	@Override
	public void setEstado(long estado) {
		_solicitudEvaluacionDesempenno.setEstado(estado);
	}

	/**
	* Returns the activo of this solicitud evaluacion desempenno.
	*
	* @return the activo of this solicitud evaluacion desempenno
	*/
	@Override
	public boolean getActivo() {
		return _solicitudEvaluacionDesempenno.getActivo();
	}

	/**
	* Returns <code>true</code> if this solicitud evaluacion desempenno is activo.
	*
	* @return <code>true</code> if this solicitud evaluacion desempenno is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _solicitudEvaluacionDesempenno.isActivo();
	}

	/**
	* Sets whether this solicitud evaluacion desempenno is activo.
	*
	* @param activo the activo of this solicitud evaluacion desempenno
	*/
	@Override
	public void setActivo(boolean activo) {
		_solicitudEvaluacionDesempenno.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this solicitud evaluacion desempenno.
	*
	* @return the usuariocrea of this solicitud evaluacion desempenno
	*/
	@Override
	public long getUsuariocrea() {
		return _solicitudEvaluacionDesempenno.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this solicitud evaluacion desempenno.
	*
	* @param usuariocrea the usuariocrea of this solicitud evaluacion desempenno
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_solicitudEvaluacionDesempenno.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this solicitud evaluacion desempenno.
	*
	* @return the fechacrea of this solicitud evaluacion desempenno
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _solicitudEvaluacionDesempenno.getFechacrea();
	}

	/**
	* Sets the fechacrea of this solicitud evaluacion desempenno.
	*
	* @param fechacrea the fechacrea of this solicitud evaluacion desempenno
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_solicitudEvaluacionDesempenno.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this solicitud evaluacion desempenno.
	*
	* @return the usuariomodifica of this solicitud evaluacion desempenno
	*/
	@Override
	public long getUsuariomodifica() {
		return _solicitudEvaluacionDesempenno.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this solicitud evaluacion desempenno.
	*
	* @param usuariomodifica the usuariomodifica of this solicitud evaluacion desempenno
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_solicitudEvaluacionDesempenno.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this solicitud evaluacion desempenno.
	*
	* @return the fechacreamodifica of this solicitud evaluacion desempenno
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _solicitudEvaluacionDesempenno.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this solicitud evaluacion desempenno.
	*
	* @param fechacreamodifica the fechacreamodifica of this solicitud evaluacion desempenno
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_solicitudEvaluacionDesempenno.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _solicitudEvaluacionDesempenno.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_solicitudEvaluacionDesempenno.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _solicitudEvaluacionDesempenno.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_solicitudEvaluacionDesempenno.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _solicitudEvaluacionDesempenno.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _solicitudEvaluacionDesempenno.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_solicitudEvaluacionDesempenno.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _solicitudEvaluacionDesempenno.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_solicitudEvaluacionDesempenno.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_solicitudEvaluacionDesempenno.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_solicitudEvaluacionDesempenno.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SolicitudEvaluacionDesempennoWrapper((SolicitudEvaluacionDesempenno)_solicitudEvaluacionDesempenno.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno) {
		return _solicitudEvaluacionDesempenno.compareTo(solicitudEvaluacionDesempenno);
	}

	@Override
	public int hashCode() {
		return _solicitudEvaluacionDesempenno.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.SolicitudEvaluacionDesempenno> toCacheModel() {
		return _solicitudEvaluacionDesempenno.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.SolicitudEvaluacionDesempenno toEscapedModel() {
		return new SolicitudEvaluacionDesempennoWrapper(_solicitudEvaluacionDesempenno.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.SolicitudEvaluacionDesempenno toUnescapedModel() {
		return new SolicitudEvaluacionDesempennoWrapper(_solicitudEvaluacionDesempenno.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _solicitudEvaluacionDesempenno.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _solicitudEvaluacionDesempenno.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_solicitudEvaluacionDesempenno.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SolicitudEvaluacionDesempennoWrapper)) {
			return false;
		}

		SolicitudEvaluacionDesempennoWrapper solicitudEvaluacionDesempennoWrapper =
			(SolicitudEvaluacionDesempennoWrapper)obj;

		if (Validator.equals(_solicitudEvaluacionDesempenno,
					solicitudEvaluacionDesempennoWrapper._solicitudEvaluacionDesempenno)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SolicitudEvaluacionDesempenno getWrappedSolicitudEvaluacionDesempenno() {
		return _solicitudEvaluacionDesempenno;
	}

	@Override
	public SolicitudEvaluacionDesempenno getWrappedModel() {
		return _solicitudEvaluacionDesempenno;
	}

	@Override
	public void resetOriginalValues() {
		_solicitudEvaluacionDesempenno.resetOriginalValues();
	}

	private SolicitudEvaluacionDesempenno _solicitudEvaluacionDesempenno;
}
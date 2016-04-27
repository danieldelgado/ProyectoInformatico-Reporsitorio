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
 * This class is a wrapper for {@link Referencia}.
 * </p>
 *
 * @author Crossfire
 * @see Referencia
 * @generated
 */
public class ReferenciaWrapper implements Referencia, ModelWrapper<Referencia> {
	public ReferenciaWrapper(Referencia referencia) {
		_referencia = referencia;
	}

	@Override
	public Class<?> getModelClass() {
		return Referencia.class;
	}

	@Override
	public String getModelClassName() {
		return Referencia.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("referenciaId", getReferenciaId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("empresa", getEmpresa());
		attributes.put("telefono", getTelefono());
		attributes.put("responsable", getResponsable());
		attributes.put("motivo", getMotivo());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long referenciaId = (Long)attributes.get("referenciaId");

		if (referenciaId != null) {
			setReferenciaId(referenciaId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		String empresa = (String)attributes.get("empresa");

		if (empresa != null) {
			setEmpresa(empresa);
		}

		String telefono = (String)attributes.get("telefono");

		if (telefono != null) {
			setTelefono(telefono);
		}

		String responsable = (String)attributes.get("responsable");

		if (responsable != null) {
			setResponsable(responsable);
		}

		String motivo = (String)attributes.get("motivo");

		if (motivo != null) {
			setMotivo(motivo);
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
	* Returns the primary key of this referencia.
	*
	* @return the primary key of this referencia
	*/
	@Override
	public com.rec.hitss.layer.service.persistence.ReferenciaPK getPrimaryKey() {
		return _referencia.getPrimaryKey();
	}

	/**
	* Sets the primary key of this referencia.
	*
	* @param primaryKey the primary key of this referencia
	*/
	@Override
	public void setPrimaryKey(
		com.rec.hitss.layer.service.persistence.ReferenciaPK primaryKey) {
		_referencia.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the referencia ID of this referencia.
	*
	* @return the referencia ID of this referencia
	*/
	@Override
	public long getReferenciaId() {
		return _referencia.getReferenciaId();
	}

	/**
	* Sets the referencia ID of this referencia.
	*
	* @param referenciaId the referencia ID of this referencia
	*/
	@Override
	public void setReferenciaId(long referenciaId) {
		_referencia.setReferenciaId(referenciaId);
	}

	/**
	* Returns the usuario ID of this referencia.
	*
	* @return the usuario ID of this referencia
	*/
	@Override
	public long getUsuarioId() {
		return _referencia.getUsuarioId();
	}

	/**
	* Sets the usuario ID of this referencia.
	*
	* @param usuarioId the usuario ID of this referencia
	*/
	@Override
	public void setUsuarioId(long usuarioId) {
		_referencia.setUsuarioId(usuarioId);
	}

	/**
	* Returns the empresa of this referencia.
	*
	* @return the empresa of this referencia
	*/
	@Override
	public java.lang.String getEmpresa() {
		return _referencia.getEmpresa();
	}

	/**
	* Sets the empresa of this referencia.
	*
	* @param empresa the empresa of this referencia
	*/
	@Override
	public void setEmpresa(java.lang.String empresa) {
		_referencia.setEmpresa(empresa);
	}

	/**
	* Returns the telefono of this referencia.
	*
	* @return the telefono of this referencia
	*/
	@Override
	public java.lang.String getTelefono() {
		return _referencia.getTelefono();
	}

	/**
	* Sets the telefono of this referencia.
	*
	* @param telefono the telefono of this referencia
	*/
	@Override
	public void setTelefono(java.lang.String telefono) {
		_referencia.setTelefono(telefono);
	}

	/**
	* Returns the responsable of this referencia.
	*
	* @return the responsable of this referencia
	*/
	@Override
	public java.lang.String getResponsable() {
		return _referencia.getResponsable();
	}

	/**
	* Sets the responsable of this referencia.
	*
	* @param responsable the responsable of this referencia
	*/
	@Override
	public void setResponsable(java.lang.String responsable) {
		_referencia.setResponsable(responsable);
	}

	/**
	* Returns the motivo of this referencia.
	*
	* @return the motivo of this referencia
	*/
	@Override
	public java.lang.String getMotivo() {
		return _referencia.getMotivo();
	}

	/**
	* Sets the motivo of this referencia.
	*
	* @param motivo the motivo of this referencia
	*/
	@Override
	public void setMotivo(java.lang.String motivo) {
		_referencia.setMotivo(motivo);
	}

	/**
	* Returns the activo of this referencia.
	*
	* @return the activo of this referencia
	*/
	@Override
	public boolean getActivo() {
		return _referencia.getActivo();
	}

	/**
	* Returns <code>true</code> if this referencia is activo.
	*
	* @return <code>true</code> if this referencia is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _referencia.isActivo();
	}

	/**
	* Sets whether this referencia is activo.
	*
	* @param activo the activo of this referencia
	*/
	@Override
	public void setActivo(boolean activo) {
		_referencia.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this referencia.
	*
	* @return the usuariocrea of this referencia
	*/
	@Override
	public long getUsuariocrea() {
		return _referencia.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this referencia.
	*
	* @param usuariocrea the usuariocrea of this referencia
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_referencia.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this referencia.
	*
	* @return the fechacrea of this referencia
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _referencia.getFechacrea();
	}

	/**
	* Sets the fechacrea of this referencia.
	*
	* @param fechacrea the fechacrea of this referencia
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_referencia.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this referencia.
	*
	* @return the usuariomodifica of this referencia
	*/
	@Override
	public long getUsuariomodifica() {
		return _referencia.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this referencia.
	*
	* @param usuariomodifica the usuariomodifica of this referencia
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_referencia.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this referencia.
	*
	* @return the fechacreamodifica of this referencia
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _referencia.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this referencia.
	*
	* @param fechacreamodifica the fechacreamodifica of this referencia
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_referencia.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _referencia.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_referencia.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _referencia.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_referencia.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _referencia.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _referencia.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_referencia.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _referencia.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_referencia.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_referencia.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_referencia.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ReferenciaWrapper((Referencia)_referencia.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.Referencia referencia) {
		return _referencia.compareTo(referencia);
	}

	@Override
	public int hashCode() {
		return _referencia.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.Referencia> toCacheModel() {
		return _referencia.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.Referencia toEscapedModel() {
		return new ReferenciaWrapper(_referencia.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.Referencia toUnescapedModel() {
		return new ReferenciaWrapper(_referencia.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _referencia.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _referencia.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_referencia.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ReferenciaWrapper)) {
			return false;
		}

		ReferenciaWrapper referenciaWrapper = (ReferenciaWrapper)obj;

		if (Validator.equals(_referencia, referenciaWrapper._referencia)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Referencia getWrappedReferencia() {
		return _referencia;
	}

	@Override
	public Referencia getWrappedModel() {
		return _referencia;
	}

	@Override
	public void resetOriginalValues() {
		_referencia.resetOriginalValues();
	}

	private Referencia _referencia;
}
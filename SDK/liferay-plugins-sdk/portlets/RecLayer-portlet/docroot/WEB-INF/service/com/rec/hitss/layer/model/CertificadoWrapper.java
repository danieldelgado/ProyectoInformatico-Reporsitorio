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
 * This class is a wrapper for {@link Certificado}.
 * </p>
 *
 * @author Crossfire
 * @see Certificado
 * @generated
 */
public class CertificadoWrapper implements Certificado,
	ModelWrapper<Certificado> {
	public CertificadoWrapper(Certificado certificado) {
		_certificado = certificado;
	}

	@Override
	public Class<?> getModelClass() {
		return Certificado.class;
	}

	@Override
	public String getModelClassName() {
		return Certificado.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("certificadoId", getCertificadoId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("empresa", getEmpresa());
		attributes.put("cargo", getCargo());
		attributes.put("usuarioHitssId", getUsuarioHitssId());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long certificadoId = (Long)attributes.get("certificadoId");

		if (certificadoId != null) {
			setCertificadoId(certificadoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String empresa = (String)attributes.get("empresa");

		if (empresa != null) {
			setEmpresa(empresa);
		}

		String cargo = (String)attributes.get("cargo");

		if (cargo != null) {
			setCargo(cargo);
		}

		Long usuarioHitssId = (Long)attributes.get("usuarioHitssId");

		if (usuarioHitssId != null) {
			setUsuarioHitssId(usuarioHitssId);
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
	* Returns the primary key of this certificado.
	*
	* @return the primary key of this certificado
	*/
	@Override
	public long getPrimaryKey() {
		return _certificado.getPrimaryKey();
	}

	/**
	* Sets the primary key of this certificado.
	*
	* @param primaryKey the primary key of this certificado
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_certificado.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the certificado ID of this certificado.
	*
	* @return the certificado ID of this certificado
	*/
	@Override
	public long getCertificadoId() {
		return _certificado.getCertificadoId();
	}

	/**
	* Sets the certificado ID of this certificado.
	*
	* @param certificadoId the certificado ID of this certificado
	*/
	@Override
	public void setCertificadoId(long certificadoId) {
		_certificado.setCertificadoId(certificadoId);
	}

	/**
	* Returns the descripcion of this certificado.
	*
	* @return the descripcion of this certificado
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _certificado.getDescripcion();
	}

	/**
	* Sets the descripcion of this certificado.
	*
	* @param descripcion the descripcion of this certificado
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_certificado.setDescripcion(descripcion);
	}

	/**
	* Returns the empresa of this certificado.
	*
	* @return the empresa of this certificado
	*/
	@Override
	public java.lang.String getEmpresa() {
		return _certificado.getEmpresa();
	}

	/**
	* Sets the empresa of this certificado.
	*
	* @param empresa the empresa of this certificado
	*/
	@Override
	public void setEmpresa(java.lang.String empresa) {
		_certificado.setEmpresa(empresa);
	}

	/**
	* Returns the cargo of this certificado.
	*
	* @return the cargo of this certificado
	*/
	@Override
	public java.lang.String getCargo() {
		return _certificado.getCargo();
	}

	/**
	* Sets the cargo of this certificado.
	*
	* @param cargo the cargo of this certificado
	*/
	@Override
	public void setCargo(java.lang.String cargo) {
		_certificado.setCargo(cargo);
	}

	/**
	* Returns the usuario hitss ID of this certificado.
	*
	* @return the usuario hitss ID of this certificado
	*/
	@Override
	public long getUsuarioHitssId() {
		return _certificado.getUsuarioHitssId();
	}

	/**
	* Sets the usuario hitss ID of this certificado.
	*
	* @param usuarioHitssId the usuario hitss ID of this certificado
	*/
	@Override
	public void setUsuarioHitssId(long usuarioHitssId) {
		_certificado.setUsuarioHitssId(usuarioHitssId);
	}

	/**
	* Returns the activo of this certificado.
	*
	* @return the activo of this certificado
	*/
	@Override
	public boolean getActivo() {
		return _certificado.getActivo();
	}

	/**
	* Returns <code>true</code> if this certificado is activo.
	*
	* @return <code>true</code> if this certificado is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _certificado.isActivo();
	}

	/**
	* Sets whether this certificado is activo.
	*
	* @param activo the activo of this certificado
	*/
	@Override
	public void setActivo(boolean activo) {
		_certificado.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this certificado.
	*
	* @return the usuariocrea of this certificado
	*/
	@Override
	public long getUsuariocrea() {
		return _certificado.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this certificado.
	*
	* @param usuariocrea the usuariocrea of this certificado
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_certificado.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this certificado.
	*
	* @return the fechacrea of this certificado
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _certificado.getFechacrea();
	}

	/**
	* Sets the fechacrea of this certificado.
	*
	* @param fechacrea the fechacrea of this certificado
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_certificado.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this certificado.
	*
	* @return the usuariomodifica of this certificado
	*/
	@Override
	public long getUsuariomodifica() {
		return _certificado.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this certificado.
	*
	* @param usuariomodifica the usuariomodifica of this certificado
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_certificado.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this certificado.
	*
	* @return the fechacreamodifica of this certificado
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _certificado.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this certificado.
	*
	* @param fechacreamodifica the fechacreamodifica of this certificado
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_certificado.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _certificado.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_certificado.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _certificado.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_certificado.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _certificado.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _certificado.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_certificado.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _certificado.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_certificado.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_certificado.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_certificado.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CertificadoWrapper((Certificado)_certificado.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.Certificado certificado) {
		return _certificado.compareTo(certificado);
	}

	@Override
	public int hashCode() {
		return _certificado.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.Certificado> toCacheModel() {
		return _certificado.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.Certificado toEscapedModel() {
		return new CertificadoWrapper(_certificado.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.Certificado toUnescapedModel() {
		return new CertificadoWrapper(_certificado.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _certificado.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _certificado.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_certificado.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CertificadoWrapper)) {
			return false;
		}

		CertificadoWrapper certificadoWrapper = (CertificadoWrapper)obj;

		if (Validator.equals(_certificado, certificadoWrapper._certificado)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Certificado getWrappedCertificado() {
		return _certificado;
	}

	@Override
	public Certificado getWrappedModel() {
		return _certificado;
	}

	@Override
	public void resetOriginalValues() {
		_certificado.resetOriginalValues();
	}

	private Certificado _certificado;
}
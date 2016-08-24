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
 * This class is a wrapper for {@link Experiencia}.
 * </p>
 *
 * @author Crossfire
 * @see Experiencia
 * @generated
 */
public class ExperienciaWrapper implements Experiencia,
	ModelWrapper<Experiencia> {
	public ExperienciaWrapper(Experiencia experiencia) {
		_experiencia = experiencia;
	}

	@Override
	public Class<?> getModelClass() {
		return Experiencia.class;
	}

	@Override
	public String getModelClassName() {
		return Experiencia.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("experienciaId", getExperienciaId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("empresa", getEmpresa());
		attributes.put("proyecto", getProyecto());
		attributes.put("fechaInicio", getFechaInicio());
		attributes.put("fechaFin", getFechaFin());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long experienciaId = (Long)attributes.get("experienciaId");

		if (experienciaId != null) {
			setExperienciaId(experienciaId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String empresa = (String)attributes.get("empresa");

		if (empresa != null) {
			setEmpresa(empresa);
		}

		String proyecto = (String)attributes.get("proyecto");

		if (proyecto != null) {
			setProyecto(proyecto);
		}

		Date fechaInicio = (Date)attributes.get("fechaInicio");

		if (fechaInicio != null) {
			setFechaInicio(fechaInicio);
		}

		Date fechaFin = (Date)attributes.get("fechaFin");

		if (fechaFin != null) {
			setFechaFin(fechaFin);
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
	* Returns the primary key of this experiencia.
	*
	* @return the primary key of this experiencia
	*/
	@Override
	public long getPrimaryKey() {
		return _experiencia.getPrimaryKey();
	}

	/**
	* Sets the primary key of this experiencia.
	*
	* @param primaryKey the primary key of this experiencia
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_experiencia.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the experiencia ID of this experiencia.
	*
	* @return the experiencia ID of this experiencia
	*/
	@Override
	public long getExperienciaId() {
		return _experiencia.getExperienciaId();
	}

	/**
	* Sets the experiencia ID of this experiencia.
	*
	* @param experienciaId the experiencia ID of this experiencia
	*/
	@Override
	public void setExperienciaId(long experienciaId) {
		_experiencia.setExperienciaId(experienciaId);
	}

	/**
	* Returns the usuario ID of this experiencia.
	*
	* @return the usuario ID of this experiencia
	*/
	@Override
	public long getUsuarioId() {
		return _experiencia.getUsuarioId();
	}

	/**
	* Sets the usuario ID of this experiencia.
	*
	* @param usuarioId the usuario ID of this experiencia
	*/
	@Override
	public void setUsuarioId(long usuarioId) {
		_experiencia.setUsuarioId(usuarioId);
	}

	/**
	* Returns the descripcion of this experiencia.
	*
	* @return the descripcion of this experiencia
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _experiencia.getDescripcion();
	}

	/**
	* Sets the descripcion of this experiencia.
	*
	* @param descripcion the descripcion of this experiencia
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_experiencia.setDescripcion(descripcion);
	}

	/**
	* Returns the empresa of this experiencia.
	*
	* @return the empresa of this experiencia
	*/
	@Override
	public java.lang.String getEmpresa() {
		return _experiencia.getEmpresa();
	}

	/**
	* Sets the empresa of this experiencia.
	*
	* @param empresa the empresa of this experiencia
	*/
	@Override
	public void setEmpresa(java.lang.String empresa) {
		_experiencia.setEmpresa(empresa);
	}

	/**
	* Returns the proyecto of this experiencia.
	*
	* @return the proyecto of this experiencia
	*/
	@Override
	public java.lang.String getProyecto() {
		return _experiencia.getProyecto();
	}

	/**
	* Sets the proyecto of this experiencia.
	*
	* @param proyecto the proyecto of this experiencia
	*/
	@Override
	public void setProyecto(java.lang.String proyecto) {
		_experiencia.setProyecto(proyecto);
	}

	/**
	* Returns the fecha inicio of this experiencia.
	*
	* @return the fecha inicio of this experiencia
	*/
	@Override
	public java.util.Date getFechaInicio() {
		return _experiencia.getFechaInicio();
	}

	/**
	* Sets the fecha inicio of this experiencia.
	*
	* @param fechaInicio the fecha inicio of this experiencia
	*/
	@Override
	public void setFechaInicio(java.util.Date fechaInicio) {
		_experiencia.setFechaInicio(fechaInicio);
	}

	/**
	* Returns the fecha fin of this experiencia.
	*
	* @return the fecha fin of this experiencia
	*/
	@Override
	public java.util.Date getFechaFin() {
		return _experiencia.getFechaFin();
	}

	/**
	* Sets the fecha fin of this experiencia.
	*
	* @param fechaFin the fecha fin of this experiencia
	*/
	@Override
	public void setFechaFin(java.util.Date fechaFin) {
		_experiencia.setFechaFin(fechaFin);
	}

	/**
	* Returns the activo of this experiencia.
	*
	* @return the activo of this experiencia
	*/
	@Override
	public boolean getActivo() {
		return _experiencia.getActivo();
	}

	/**
	* Returns <code>true</code> if this experiencia is activo.
	*
	* @return <code>true</code> if this experiencia is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _experiencia.isActivo();
	}

	/**
	* Sets whether this experiencia is activo.
	*
	* @param activo the activo of this experiencia
	*/
	@Override
	public void setActivo(boolean activo) {
		_experiencia.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this experiencia.
	*
	* @return the usuariocrea of this experiencia
	*/
	@Override
	public long getUsuariocrea() {
		return _experiencia.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this experiencia.
	*
	* @param usuariocrea the usuariocrea of this experiencia
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_experiencia.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this experiencia.
	*
	* @return the fechacrea of this experiencia
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _experiencia.getFechacrea();
	}

	/**
	* Sets the fechacrea of this experiencia.
	*
	* @param fechacrea the fechacrea of this experiencia
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_experiencia.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this experiencia.
	*
	* @return the usuariomodifica of this experiencia
	*/
	@Override
	public long getUsuariomodifica() {
		return _experiencia.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this experiencia.
	*
	* @param usuariomodifica the usuariomodifica of this experiencia
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_experiencia.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this experiencia.
	*
	* @return the fechacreamodifica of this experiencia
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _experiencia.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this experiencia.
	*
	* @param fechacreamodifica the fechacreamodifica of this experiencia
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_experiencia.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _experiencia.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_experiencia.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _experiencia.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_experiencia.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _experiencia.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _experiencia.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_experiencia.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _experiencia.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_experiencia.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_experiencia.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_experiencia.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ExperienciaWrapper((Experiencia)_experiencia.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.Experiencia experiencia) {
		return _experiencia.compareTo(experiencia);
	}

	@Override
	public int hashCode() {
		return _experiencia.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.Experiencia> toCacheModel() {
		return _experiencia.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.Experiencia toEscapedModel() {
		return new ExperienciaWrapper(_experiencia.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.Experiencia toUnescapedModel() {
		return new ExperienciaWrapper(_experiencia.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _experiencia.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _experiencia.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_experiencia.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExperienciaWrapper)) {
			return false;
		}

		ExperienciaWrapper experienciaWrapper = (ExperienciaWrapper)obj;

		if (Validator.equals(_experiencia, experienciaWrapper._experiencia)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Experiencia getWrappedExperiencia() {
		return _experiencia;
	}

	@Override
	public Experiencia getWrappedModel() {
		return _experiencia;
	}

	@Override
	public void resetOriginalValues() {
		_experiencia.resetOriginalValues();
	}

	private Experiencia _experiencia;
}
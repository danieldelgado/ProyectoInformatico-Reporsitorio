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
 * This class is a wrapper for {@link FasePostulacion}.
 * </p>
 *
 * @author Danielle Delgado
 * @see FasePostulacion
 * @generated
 */
public class FasePostulacionWrapper implements FasePostulacion,
	ModelWrapper<FasePostulacion> {
	public FasePostulacionWrapper(FasePostulacion fasePostulacion) {
		_fasePostulacion = fasePostulacion;
	}

	@Override
	public Class<?> getModelClass() {
		return FasePostulacion.class;
	}

	@Override
	public String getModelClassName() {
		return FasePostulacion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fasePostulacionId", getFasePostulacionId());
		attributes.put("solicitudRequerimientoId", getSolicitudRequerimientoId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("tipoFase", getTipoFase());
		attributes.put("fechaFase", getFechaFase());
		attributes.put("descripcion", getDescripcion());
		attributes.put("estado", getEstado());
		attributes.put("apruebaEntrevista", getApruebaEntrevista());
		attributes.put("puntuacion", getPuntuacion());
		attributes.put("salario", getSalario());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fasePostulacionId = (Long)attributes.get("fasePostulacionId");

		if (fasePostulacionId != null) {
			setFasePostulacionId(fasePostulacionId);
		}

		Long solicitudRequerimientoId = (Long)attributes.get(
				"solicitudRequerimientoId");

		if (solicitudRequerimientoId != null) {
			setSolicitudRequerimientoId(solicitudRequerimientoId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		Long tipoFase = (Long)attributes.get("tipoFase");

		if (tipoFase != null) {
			setTipoFase(tipoFase);
		}

		Date fechaFase = (Date)attributes.get("fechaFase");

		if (fechaFase != null) {
			setFechaFase(fechaFase);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Long estado = (Long)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		Boolean apruebaEntrevista = (Boolean)attributes.get("apruebaEntrevista");

		if (apruebaEntrevista != null) {
			setApruebaEntrevista(apruebaEntrevista);
		}

		Integer puntuacion = (Integer)attributes.get("puntuacion");

		if (puntuacion != null) {
			setPuntuacion(puntuacion);
		}

		Double salario = (Double)attributes.get("salario");

		if (salario != null) {
			setSalario(salario);
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
	* Returns the primary key of this fase postulacion.
	*
	* @return the primary key of this fase postulacion
	*/
	@Override
	public long getPrimaryKey() {
		return _fasePostulacion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this fase postulacion.
	*
	* @param primaryKey the primary key of this fase postulacion
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_fasePostulacion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the fase postulacion ID of this fase postulacion.
	*
	* @return the fase postulacion ID of this fase postulacion
	*/
	@Override
	public long getFasePostulacionId() {
		return _fasePostulacion.getFasePostulacionId();
	}

	/**
	* Sets the fase postulacion ID of this fase postulacion.
	*
	* @param fasePostulacionId the fase postulacion ID of this fase postulacion
	*/
	@Override
	public void setFasePostulacionId(long fasePostulacionId) {
		_fasePostulacion.setFasePostulacionId(fasePostulacionId);
	}

	/**
	* Returns the solicitud requerimiento ID of this fase postulacion.
	*
	* @return the solicitud requerimiento ID of this fase postulacion
	*/
	@Override
	public long getSolicitudRequerimientoId() {
		return _fasePostulacion.getSolicitudRequerimientoId();
	}

	/**
	* Sets the solicitud requerimiento ID of this fase postulacion.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID of this fase postulacion
	*/
	@Override
	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_fasePostulacion.setSolicitudRequerimientoId(solicitudRequerimientoId);
	}

	/**
	* Returns the usuario ID of this fase postulacion.
	*
	* @return the usuario ID of this fase postulacion
	*/
	@Override
	public long getUsuarioId() {
		return _fasePostulacion.getUsuarioId();
	}

	/**
	* Sets the usuario ID of this fase postulacion.
	*
	* @param usuarioId the usuario ID of this fase postulacion
	*/
	@Override
	public void setUsuarioId(long usuarioId) {
		_fasePostulacion.setUsuarioId(usuarioId);
	}

	/**
	* Returns the tipo fase of this fase postulacion.
	*
	* @return the tipo fase of this fase postulacion
	*/
	@Override
	public long getTipoFase() {
		return _fasePostulacion.getTipoFase();
	}

	/**
	* Sets the tipo fase of this fase postulacion.
	*
	* @param tipoFase the tipo fase of this fase postulacion
	*/
	@Override
	public void setTipoFase(long tipoFase) {
		_fasePostulacion.setTipoFase(tipoFase);
	}

	/**
	* Returns the fecha fase of this fase postulacion.
	*
	* @return the fecha fase of this fase postulacion
	*/
	@Override
	public java.util.Date getFechaFase() {
		return _fasePostulacion.getFechaFase();
	}

	/**
	* Sets the fecha fase of this fase postulacion.
	*
	* @param fechaFase the fecha fase of this fase postulacion
	*/
	@Override
	public void setFechaFase(java.util.Date fechaFase) {
		_fasePostulacion.setFechaFase(fechaFase);
	}

	/**
	* Returns the descripcion of this fase postulacion.
	*
	* @return the descripcion of this fase postulacion
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _fasePostulacion.getDescripcion();
	}

	/**
	* Sets the descripcion of this fase postulacion.
	*
	* @param descripcion the descripcion of this fase postulacion
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_fasePostulacion.setDescripcion(descripcion);
	}

	/**
	* Returns the estado of this fase postulacion.
	*
	* @return the estado of this fase postulacion
	*/
	@Override
	public long getEstado() {
		return _fasePostulacion.getEstado();
	}

	/**
	* Sets the estado of this fase postulacion.
	*
	* @param estado the estado of this fase postulacion
	*/
	@Override
	public void setEstado(long estado) {
		_fasePostulacion.setEstado(estado);
	}

	/**
	* Returns the aprueba entrevista of this fase postulacion.
	*
	* @return the aprueba entrevista of this fase postulacion
	*/
	@Override
	public boolean getApruebaEntrevista() {
		return _fasePostulacion.getApruebaEntrevista();
	}

	/**
	* Returns <code>true</code> if this fase postulacion is aprueba entrevista.
	*
	* @return <code>true</code> if this fase postulacion is aprueba entrevista; <code>false</code> otherwise
	*/
	@Override
	public boolean isApruebaEntrevista() {
		return _fasePostulacion.isApruebaEntrevista();
	}

	/**
	* Sets whether this fase postulacion is aprueba entrevista.
	*
	* @param apruebaEntrevista the aprueba entrevista of this fase postulacion
	*/
	@Override
	public void setApruebaEntrevista(boolean apruebaEntrevista) {
		_fasePostulacion.setApruebaEntrevista(apruebaEntrevista);
	}

	/**
	* Returns the puntuacion of this fase postulacion.
	*
	* @return the puntuacion of this fase postulacion
	*/
	@Override
	public int getPuntuacion() {
		return _fasePostulacion.getPuntuacion();
	}

	/**
	* Sets the puntuacion of this fase postulacion.
	*
	* @param puntuacion the puntuacion of this fase postulacion
	*/
	@Override
	public void setPuntuacion(int puntuacion) {
		_fasePostulacion.setPuntuacion(puntuacion);
	}

	/**
	* Returns the salario of this fase postulacion.
	*
	* @return the salario of this fase postulacion
	*/
	@Override
	public double getSalario() {
		return _fasePostulacion.getSalario();
	}

	/**
	* Sets the salario of this fase postulacion.
	*
	* @param salario the salario of this fase postulacion
	*/
	@Override
	public void setSalario(double salario) {
		_fasePostulacion.setSalario(salario);
	}

	/**
	* Returns the activo of this fase postulacion.
	*
	* @return the activo of this fase postulacion
	*/
	@Override
	public boolean getActivo() {
		return _fasePostulacion.getActivo();
	}

	/**
	* Returns <code>true</code> if this fase postulacion is activo.
	*
	* @return <code>true</code> if this fase postulacion is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _fasePostulacion.isActivo();
	}

	/**
	* Sets whether this fase postulacion is activo.
	*
	* @param activo the activo of this fase postulacion
	*/
	@Override
	public void setActivo(boolean activo) {
		_fasePostulacion.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this fase postulacion.
	*
	* @return the usuariocrea of this fase postulacion
	*/
	@Override
	public long getUsuariocrea() {
		return _fasePostulacion.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this fase postulacion.
	*
	* @param usuariocrea the usuariocrea of this fase postulacion
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_fasePostulacion.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this fase postulacion.
	*
	* @return the fechacrea of this fase postulacion
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _fasePostulacion.getFechacrea();
	}

	/**
	* Sets the fechacrea of this fase postulacion.
	*
	* @param fechacrea the fechacrea of this fase postulacion
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_fasePostulacion.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this fase postulacion.
	*
	* @return the usuariomodifica of this fase postulacion
	*/
	@Override
	public long getUsuariomodifica() {
		return _fasePostulacion.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this fase postulacion.
	*
	* @param usuariomodifica the usuariomodifica of this fase postulacion
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_fasePostulacion.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechamodifica of this fase postulacion.
	*
	* @return the fechamodifica of this fase postulacion
	*/
	@Override
	public java.util.Date getFechamodifica() {
		return _fasePostulacion.getFechamodifica();
	}

	/**
	* Sets the fechamodifica of this fase postulacion.
	*
	* @param fechamodifica the fechamodifica of this fase postulacion
	*/
	@Override
	public void setFechamodifica(java.util.Date fechamodifica) {
		_fasePostulacion.setFechamodifica(fechamodifica);
	}

	@Override
	public boolean isNew() {
		return _fasePostulacion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_fasePostulacion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _fasePostulacion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_fasePostulacion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _fasePostulacion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _fasePostulacion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_fasePostulacion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _fasePostulacion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_fasePostulacion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_fasePostulacion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_fasePostulacion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FasePostulacionWrapper((FasePostulacion)_fasePostulacion.clone());
	}

	@Override
	public int compareTo(com.hitss.layer.model.FasePostulacion fasePostulacion) {
		return _fasePostulacion.compareTo(fasePostulacion);
	}

	@Override
	public int hashCode() {
		return _fasePostulacion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.FasePostulacion> toCacheModel() {
		return _fasePostulacion.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.FasePostulacion toEscapedModel() {
		return new FasePostulacionWrapper(_fasePostulacion.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.FasePostulacion toUnescapedModel() {
		return new FasePostulacionWrapper(_fasePostulacion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _fasePostulacion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _fasePostulacion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_fasePostulacion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FasePostulacionWrapper)) {
			return false;
		}

		FasePostulacionWrapper fasePostulacionWrapper = (FasePostulacionWrapper)obj;

		if (Validator.equals(_fasePostulacion,
					fasePostulacionWrapper._fasePostulacion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public FasePostulacion getWrappedFasePostulacion() {
		return _fasePostulacion;
	}

	@Override
	public FasePostulacion getWrappedModel() {
		return _fasePostulacion;
	}

	@Override
	public void resetOriginalValues() {
		_fasePostulacion.resetOriginalValues();
	}

	private FasePostulacion _fasePostulacion;
}
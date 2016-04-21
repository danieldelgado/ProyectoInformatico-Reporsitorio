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
 * This class is a wrapper for {@link Puesto}.
 * </p>
 *
 * @author Crossfire
 * @see Puesto
 * @generated
 */
public class PuestoWrapper implements Puesto, ModelWrapper<Puesto> {
	public PuestoWrapper(Puesto puesto) {
		_puesto = puesto;
	}

	@Override
	public Class<?> getModelClass() {
		return Puesto.class;
	}

	@Override
	public String getModelClassName() {
		return Puesto.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("puestoId", getPuestoId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("fechaContrato", getFechaContrato());
		attributes.put("fechaEvaluacionPsicologica",
			getFechaEvaluacionPsicologica());
		attributes.put("fechaEvalucionTecnica", getFechaEvalucionTecnica());
		attributes.put("fechaEntrevistaGerenteArea",
			getFechaEntrevistaGerenteArea());
		attributes.put("fechaEvaluacionRRHH", getFechaEvaluacionRRHH());
		attributes.put("fechaPostulacion", getFechaPostulacion());
		attributes.put("seleccionado", getSeleccionado());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());
		attributes.put("requerimientoRecursoId", getRequerimientoRecursoId());
		attributes.put("usuarioHitssId", getUsuarioHitssId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long puestoId = (Long)attributes.get("puestoId");

		if (puestoId != null) {
			setPuestoId(puestoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Date fechaContrato = (Date)attributes.get("fechaContrato");

		if (fechaContrato != null) {
			setFechaContrato(fechaContrato);
		}

		Date fechaEvaluacionPsicologica = (Date)attributes.get(
				"fechaEvaluacionPsicologica");

		if (fechaEvaluacionPsicologica != null) {
			setFechaEvaluacionPsicologica(fechaEvaluacionPsicologica);
		}

		Date fechaEvalucionTecnica = (Date)attributes.get(
				"fechaEvalucionTecnica");

		if (fechaEvalucionTecnica != null) {
			setFechaEvalucionTecnica(fechaEvalucionTecnica);
		}

		Date fechaEntrevistaGerenteArea = (Date)attributes.get(
				"fechaEntrevistaGerenteArea");

		if (fechaEntrevistaGerenteArea != null) {
			setFechaEntrevistaGerenteArea(fechaEntrevistaGerenteArea);
		}

		Date fechaEvaluacionRRHH = (Date)attributes.get("fechaEvaluacionRRHH");

		if (fechaEvaluacionRRHH != null) {
			setFechaEvaluacionRRHH(fechaEvaluacionRRHH);
		}

		Date fechaPostulacion = (Date)attributes.get("fechaPostulacion");

		if (fechaPostulacion != null) {
			setFechaPostulacion(fechaPostulacion);
		}

		Boolean seleccionado = (Boolean)attributes.get("seleccionado");

		if (seleccionado != null) {
			setSeleccionado(seleccionado);
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

		Long requerimientoRecursoId = (Long)attributes.get(
				"requerimientoRecursoId");

		if (requerimientoRecursoId != null) {
			setRequerimientoRecursoId(requerimientoRecursoId);
		}

		Long usuarioHitssId = (Long)attributes.get("usuarioHitssId");

		if (usuarioHitssId != null) {
			setUsuarioHitssId(usuarioHitssId);
		}
	}

	/**
	* Returns the primary key of this puesto.
	*
	* @return the primary key of this puesto
	*/
	@Override
	public long getPrimaryKey() {
		return _puesto.getPrimaryKey();
	}

	/**
	* Sets the primary key of this puesto.
	*
	* @param primaryKey the primary key of this puesto
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_puesto.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the puesto ID of this puesto.
	*
	* @return the puesto ID of this puesto
	*/
	@Override
	public long getPuestoId() {
		return _puesto.getPuestoId();
	}

	/**
	* Sets the puesto ID of this puesto.
	*
	* @param puestoId the puesto ID of this puesto
	*/
	@Override
	public void setPuestoId(long puestoId) {
		_puesto.setPuestoId(puestoId);
	}

	/**
	* Returns the descripcion of this puesto.
	*
	* @return the descripcion of this puesto
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _puesto.getDescripcion();
	}

	/**
	* Sets the descripcion of this puesto.
	*
	* @param descripcion the descripcion of this puesto
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_puesto.setDescripcion(descripcion);
	}

	/**
	* Returns the fecha contrato of this puesto.
	*
	* @return the fecha contrato of this puesto
	*/
	@Override
	public java.util.Date getFechaContrato() {
		return _puesto.getFechaContrato();
	}

	/**
	* Sets the fecha contrato of this puesto.
	*
	* @param fechaContrato the fecha contrato of this puesto
	*/
	@Override
	public void setFechaContrato(java.util.Date fechaContrato) {
		_puesto.setFechaContrato(fechaContrato);
	}

	/**
	* Returns the fecha evaluacion psicologica of this puesto.
	*
	* @return the fecha evaluacion psicologica of this puesto
	*/
	@Override
	public java.util.Date getFechaEvaluacionPsicologica() {
		return _puesto.getFechaEvaluacionPsicologica();
	}

	/**
	* Sets the fecha evaluacion psicologica of this puesto.
	*
	* @param fechaEvaluacionPsicologica the fecha evaluacion psicologica of this puesto
	*/
	@Override
	public void setFechaEvaluacionPsicologica(
		java.util.Date fechaEvaluacionPsicologica) {
		_puesto.setFechaEvaluacionPsicologica(fechaEvaluacionPsicologica);
	}

	/**
	* Returns the fecha evalucion tecnica of this puesto.
	*
	* @return the fecha evalucion tecnica of this puesto
	*/
	@Override
	public java.util.Date getFechaEvalucionTecnica() {
		return _puesto.getFechaEvalucionTecnica();
	}

	/**
	* Sets the fecha evalucion tecnica of this puesto.
	*
	* @param fechaEvalucionTecnica the fecha evalucion tecnica of this puesto
	*/
	@Override
	public void setFechaEvalucionTecnica(java.util.Date fechaEvalucionTecnica) {
		_puesto.setFechaEvalucionTecnica(fechaEvalucionTecnica);
	}

	/**
	* Returns the fecha entrevista gerente area of this puesto.
	*
	* @return the fecha entrevista gerente area of this puesto
	*/
	@Override
	public java.util.Date getFechaEntrevistaGerenteArea() {
		return _puesto.getFechaEntrevistaGerenteArea();
	}

	/**
	* Sets the fecha entrevista gerente area of this puesto.
	*
	* @param fechaEntrevistaGerenteArea the fecha entrevista gerente area of this puesto
	*/
	@Override
	public void setFechaEntrevistaGerenteArea(
		java.util.Date fechaEntrevistaGerenteArea) {
		_puesto.setFechaEntrevistaGerenteArea(fechaEntrevistaGerenteArea);
	}

	/**
	* Returns the fecha evaluacion r r h h of this puesto.
	*
	* @return the fecha evaluacion r r h h of this puesto
	*/
	@Override
	public java.util.Date getFechaEvaluacionRRHH() {
		return _puesto.getFechaEvaluacionRRHH();
	}

	/**
	* Sets the fecha evaluacion r r h h of this puesto.
	*
	* @param fechaEvaluacionRRHH the fecha evaluacion r r h h of this puesto
	*/
	@Override
	public void setFechaEvaluacionRRHH(java.util.Date fechaEvaluacionRRHH) {
		_puesto.setFechaEvaluacionRRHH(fechaEvaluacionRRHH);
	}

	/**
	* Returns the fecha postulacion of this puesto.
	*
	* @return the fecha postulacion of this puesto
	*/
	@Override
	public java.util.Date getFechaPostulacion() {
		return _puesto.getFechaPostulacion();
	}

	/**
	* Sets the fecha postulacion of this puesto.
	*
	* @param fechaPostulacion the fecha postulacion of this puesto
	*/
	@Override
	public void setFechaPostulacion(java.util.Date fechaPostulacion) {
		_puesto.setFechaPostulacion(fechaPostulacion);
	}

	/**
	* Returns the seleccionado of this puesto.
	*
	* @return the seleccionado of this puesto
	*/
	@Override
	public boolean getSeleccionado() {
		return _puesto.getSeleccionado();
	}

	/**
	* Returns <code>true</code> if this puesto is seleccionado.
	*
	* @return <code>true</code> if this puesto is seleccionado; <code>false</code> otherwise
	*/
	@Override
	public boolean isSeleccionado() {
		return _puesto.isSeleccionado();
	}

	/**
	* Sets whether this puesto is seleccionado.
	*
	* @param seleccionado the seleccionado of this puesto
	*/
	@Override
	public void setSeleccionado(boolean seleccionado) {
		_puesto.setSeleccionado(seleccionado);
	}

	/**
	* Returns the activo of this puesto.
	*
	* @return the activo of this puesto
	*/
	@Override
	public boolean getActivo() {
		return _puesto.getActivo();
	}

	/**
	* Returns <code>true</code> if this puesto is activo.
	*
	* @return <code>true</code> if this puesto is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _puesto.isActivo();
	}

	/**
	* Sets whether this puesto is activo.
	*
	* @param activo the activo of this puesto
	*/
	@Override
	public void setActivo(boolean activo) {
		_puesto.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this puesto.
	*
	* @return the usuariocrea of this puesto
	*/
	@Override
	public long getUsuariocrea() {
		return _puesto.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this puesto.
	*
	* @param usuariocrea the usuariocrea of this puesto
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_puesto.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this puesto.
	*
	* @return the fechacrea of this puesto
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _puesto.getFechacrea();
	}

	/**
	* Sets the fechacrea of this puesto.
	*
	* @param fechacrea the fechacrea of this puesto
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_puesto.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this puesto.
	*
	* @return the usuariomodifica of this puesto
	*/
	@Override
	public long getUsuariomodifica() {
		return _puesto.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this puesto.
	*
	* @param usuariomodifica the usuariomodifica of this puesto
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_puesto.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this puesto.
	*
	* @return the fechacreamodifica of this puesto
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _puesto.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this puesto.
	*
	* @param fechacreamodifica the fechacreamodifica of this puesto
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_puesto.setFechacreamodifica(fechacreamodifica);
	}

	/**
	* Returns the requerimiento recurso ID of this puesto.
	*
	* @return the requerimiento recurso ID of this puesto
	*/
	@Override
	public long getRequerimientoRecursoId() {
		return _puesto.getRequerimientoRecursoId();
	}

	/**
	* Sets the requerimiento recurso ID of this puesto.
	*
	* @param requerimientoRecursoId the requerimiento recurso ID of this puesto
	*/
	@Override
	public void setRequerimientoRecursoId(long requerimientoRecursoId) {
		_puesto.setRequerimientoRecursoId(requerimientoRecursoId);
	}

	/**
	* Returns the usuario hitss ID of this puesto.
	*
	* @return the usuario hitss ID of this puesto
	*/
	@Override
	public long getUsuarioHitssId() {
		return _puesto.getUsuarioHitssId();
	}

	/**
	* Sets the usuario hitss ID of this puesto.
	*
	* @param usuarioHitssId the usuario hitss ID of this puesto
	*/
	@Override
	public void setUsuarioHitssId(long usuarioHitssId) {
		_puesto.setUsuarioHitssId(usuarioHitssId);
	}

	@Override
	public boolean isNew() {
		return _puesto.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_puesto.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _puesto.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_puesto.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _puesto.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _puesto.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_puesto.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _puesto.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_puesto.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_puesto.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_puesto.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PuestoWrapper((Puesto)_puesto.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.Puesto puesto) {
		return _puesto.compareTo(puesto);
	}

	@Override
	public int hashCode() {
		return _puesto.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.Puesto> toCacheModel() {
		return _puesto.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.Puesto toEscapedModel() {
		return new PuestoWrapper(_puesto.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.Puesto toUnescapedModel() {
		return new PuestoWrapper(_puesto.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _puesto.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _puesto.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_puesto.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PuestoWrapper)) {
			return false;
		}

		PuestoWrapper puestoWrapper = (PuestoWrapper)obj;

		if (Validator.equals(_puesto, puestoWrapper._puesto)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Puesto getWrappedPuesto() {
		return _puesto;
	}

	@Override
	public Puesto getWrappedModel() {
		return _puesto;
	}

	@Override
	public void resetOriginalValues() {
		_puesto.resetOriginalValues();
	}

	private Puesto _puesto;
}
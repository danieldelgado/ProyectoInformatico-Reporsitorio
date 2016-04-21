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
 * This class is a wrapper for {@link SolicitudRequerimientoPersonal}.
 * </p>
 *
 * @author Crossfire
 * @see SolicitudRequerimientoPersonal
 * @generated
 */
public class SolicitudRequerimientoPersonalWrapper
	implements SolicitudRequerimientoPersonal,
		ModelWrapper<SolicitudRequerimientoPersonal> {
	public SolicitudRequerimientoPersonalWrapper(
		SolicitudRequerimientoPersonal solicitudRequerimientoPersonal) {
		_solicitudRequerimientoPersonal = solicitudRequerimientoPersonal;
	}

	@Override
	public Class<?> getModelClass() {
		return SolicitudRequerimientoPersonal.class;
	}

	@Override
	public String getModelClassName() {
		return SolicitudRequerimientoPersonal.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudRequerimientoPersonalId",
			getSolicitudRequerimientoPersonalId());
		attributes.put("estado", getEstado());
		attributes.put("puesto", getPuesto());
		attributes.put("areaSolicitante", getAreaSolicitante());
		attributes.put("cantidadRecursos", getCantidadRecursos());
		attributes.put("fechaLimite", getFechaLimite());
		attributes.put("cargo", getCargo());
		attributes.put("tiempoContrato", getTiempoContrato());
		attributes.put("tipoNegocio", getTipoNegocio());
		attributes.put("presupuestoMaximo", getPresupuestoMaximo());
		attributes.put("presupuestoMinimo", getPresupuestoMinimo());
		attributes.put("cliente", getCliente());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long solicitudRequerimientoPersonalId = (Long)attributes.get(
				"solicitudRequerimientoPersonalId");

		if (solicitudRequerimientoPersonalId != null) {
			setSolicitudRequerimientoPersonalId(solicitudRequerimientoPersonalId);
		}

		String estado = (String)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		String puesto = (String)attributes.get("puesto");

		if (puesto != null) {
			setPuesto(puesto);
		}

		Long areaSolicitante = (Long)attributes.get("areaSolicitante");

		if (areaSolicitante != null) {
			setAreaSolicitante(areaSolicitante);
		}

		Long cantidadRecursos = (Long)attributes.get("cantidadRecursos");

		if (cantidadRecursos != null) {
			setCantidadRecursos(cantidadRecursos);
		}

		Date fechaLimite = (Date)attributes.get("fechaLimite");

		if (fechaLimite != null) {
			setFechaLimite(fechaLimite);
		}

		String cargo = (String)attributes.get("cargo");

		if (cargo != null) {
			setCargo(cargo);
		}

		Long tiempoContrato = (Long)attributes.get("tiempoContrato");

		if (tiempoContrato != null) {
			setTiempoContrato(tiempoContrato);
		}

		Long tipoNegocio = (Long)attributes.get("tipoNegocio");

		if (tipoNegocio != null) {
			setTipoNegocio(tipoNegocio);
		}

		Long presupuestoMaximo = (Long)attributes.get("presupuestoMaximo");

		if (presupuestoMaximo != null) {
			setPresupuestoMaximo(presupuestoMaximo);
		}

		Long presupuestoMinimo = (Long)attributes.get("presupuestoMinimo");

		if (presupuestoMinimo != null) {
			setPresupuestoMinimo(presupuestoMinimo);
		}

		Long cliente = (Long)attributes.get("cliente");

		if (cliente != null) {
			setCliente(cliente);
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
	* Returns the primary key of this solicitud requerimiento personal.
	*
	* @return the primary key of this solicitud requerimiento personal
	*/
	@Override
	public long getPrimaryKey() {
		return _solicitudRequerimientoPersonal.getPrimaryKey();
	}

	/**
	* Sets the primary key of this solicitud requerimiento personal.
	*
	* @param primaryKey the primary key of this solicitud requerimiento personal
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_solicitudRequerimientoPersonal.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the solicitud requerimiento personal ID of this solicitud requerimiento personal.
	*
	* @return the solicitud requerimiento personal ID of this solicitud requerimiento personal
	*/
	@Override
	public long getSolicitudRequerimientoPersonalId() {
		return _solicitudRequerimientoPersonal.getSolicitudRequerimientoPersonalId();
	}

	/**
	* Sets the solicitud requerimiento personal ID of this solicitud requerimiento personal.
	*
	* @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID of this solicitud requerimiento personal
	*/
	@Override
	public void setSolicitudRequerimientoPersonalId(
		long solicitudRequerimientoPersonalId) {
		_solicitudRequerimientoPersonal.setSolicitudRequerimientoPersonalId(solicitudRequerimientoPersonalId);
	}

	/**
	* Returns the estado of this solicitud requerimiento personal.
	*
	* @return the estado of this solicitud requerimiento personal
	*/
	@Override
	public java.lang.String getEstado() {
		return _solicitudRequerimientoPersonal.getEstado();
	}

	/**
	* Sets the estado of this solicitud requerimiento personal.
	*
	* @param estado the estado of this solicitud requerimiento personal
	*/
	@Override
	public void setEstado(java.lang.String estado) {
		_solicitudRequerimientoPersonal.setEstado(estado);
	}

	/**
	* Returns the puesto of this solicitud requerimiento personal.
	*
	* @return the puesto of this solicitud requerimiento personal
	*/
	@Override
	public java.lang.String getPuesto() {
		return _solicitudRequerimientoPersonal.getPuesto();
	}

	/**
	* Sets the puesto of this solicitud requerimiento personal.
	*
	* @param puesto the puesto of this solicitud requerimiento personal
	*/
	@Override
	public void setPuesto(java.lang.String puesto) {
		_solicitudRequerimientoPersonal.setPuesto(puesto);
	}

	/**
	* Returns the area solicitante of this solicitud requerimiento personal.
	*
	* @return the area solicitante of this solicitud requerimiento personal
	*/
	@Override
	public long getAreaSolicitante() {
		return _solicitudRequerimientoPersonal.getAreaSolicitante();
	}

	/**
	* Sets the area solicitante of this solicitud requerimiento personal.
	*
	* @param areaSolicitante the area solicitante of this solicitud requerimiento personal
	*/
	@Override
	public void setAreaSolicitante(long areaSolicitante) {
		_solicitudRequerimientoPersonal.setAreaSolicitante(areaSolicitante);
	}

	/**
	* Returns the cantidad recursos of this solicitud requerimiento personal.
	*
	* @return the cantidad recursos of this solicitud requerimiento personal
	*/
	@Override
	public long getCantidadRecursos() {
		return _solicitudRequerimientoPersonal.getCantidadRecursos();
	}

	/**
	* Sets the cantidad recursos of this solicitud requerimiento personal.
	*
	* @param cantidadRecursos the cantidad recursos of this solicitud requerimiento personal
	*/
	@Override
	public void setCantidadRecursos(long cantidadRecursos) {
		_solicitudRequerimientoPersonal.setCantidadRecursos(cantidadRecursos);
	}

	/**
	* Returns the fecha limite of this solicitud requerimiento personal.
	*
	* @return the fecha limite of this solicitud requerimiento personal
	*/
	@Override
	public java.util.Date getFechaLimite() {
		return _solicitudRequerimientoPersonal.getFechaLimite();
	}

	/**
	* Sets the fecha limite of this solicitud requerimiento personal.
	*
	* @param fechaLimite the fecha limite of this solicitud requerimiento personal
	*/
	@Override
	public void setFechaLimite(java.util.Date fechaLimite) {
		_solicitudRequerimientoPersonal.setFechaLimite(fechaLimite);
	}

	/**
	* Returns the cargo of this solicitud requerimiento personal.
	*
	* @return the cargo of this solicitud requerimiento personal
	*/
	@Override
	public java.lang.String getCargo() {
		return _solicitudRequerimientoPersonal.getCargo();
	}

	/**
	* Sets the cargo of this solicitud requerimiento personal.
	*
	* @param cargo the cargo of this solicitud requerimiento personal
	*/
	@Override
	public void setCargo(java.lang.String cargo) {
		_solicitudRequerimientoPersonal.setCargo(cargo);
	}

	/**
	* Returns the tiempo contrato of this solicitud requerimiento personal.
	*
	* @return the tiempo contrato of this solicitud requerimiento personal
	*/
	@Override
	public long getTiempoContrato() {
		return _solicitudRequerimientoPersonal.getTiempoContrato();
	}

	/**
	* Sets the tiempo contrato of this solicitud requerimiento personal.
	*
	* @param tiempoContrato the tiempo contrato of this solicitud requerimiento personal
	*/
	@Override
	public void setTiempoContrato(long tiempoContrato) {
		_solicitudRequerimientoPersonal.setTiempoContrato(tiempoContrato);
	}

	/**
	* Returns the tipo negocio of this solicitud requerimiento personal.
	*
	* @return the tipo negocio of this solicitud requerimiento personal
	*/
	@Override
	public long getTipoNegocio() {
		return _solicitudRequerimientoPersonal.getTipoNegocio();
	}

	/**
	* Sets the tipo negocio of this solicitud requerimiento personal.
	*
	* @param tipoNegocio the tipo negocio of this solicitud requerimiento personal
	*/
	@Override
	public void setTipoNegocio(long tipoNegocio) {
		_solicitudRequerimientoPersonal.setTipoNegocio(tipoNegocio);
	}

	/**
	* Returns the presupuesto maximo of this solicitud requerimiento personal.
	*
	* @return the presupuesto maximo of this solicitud requerimiento personal
	*/
	@Override
	public long getPresupuestoMaximo() {
		return _solicitudRequerimientoPersonal.getPresupuestoMaximo();
	}

	/**
	* Sets the presupuesto maximo of this solicitud requerimiento personal.
	*
	* @param presupuestoMaximo the presupuesto maximo of this solicitud requerimiento personal
	*/
	@Override
	public void setPresupuestoMaximo(long presupuestoMaximo) {
		_solicitudRequerimientoPersonal.setPresupuestoMaximo(presupuestoMaximo);
	}

	/**
	* Returns the presupuesto minimo of this solicitud requerimiento personal.
	*
	* @return the presupuesto minimo of this solicitud requerimiento personal
	*/
	@Override
	public long getPresupuestoMinimo() {
		return _solicitudRequerimientoPersonal.getPresupuestoMinimo();
	}

	/**
	* Sets the presupuesto minimo of this solicitud requerimiento personal.
	*
	* @param presupuestoMinimo the presupuesto minimo of this solicitud requerimiento personal
	*/
	@Override
	public void setPresupuestoMinimo(long presupuestoMinimo) {
		_solicitudRequerimientoPersonal.setPresupuestoMinimo(presupuestoMinimo);
	}

	/**
	* Returns the cliente of this solicitud requerimiento personal.
	*
	* @return the cliente of this solicitud requerimiento personal
	*/
	@Override
	public long getCliente() {
		return _solicitudRequerimientoPersonal.getCliente();
	}

	/**
	* Sets the cliente of this solicitud requerimiento personal.
	*
	* @param cliente the cliente of this solicitud requerimiento personal
	*/
	@Override
	public void setCliente(long cliente) {
		_solicitudRequerimientoPersonal.setCliente(cliente);
	}

	/**
	* Returns the activo of this solicitud requerimiento personal.
	*
	* @return the activo of this solicitud requerimiento personal
	*/
	@Override
	public boolean getActivo() {
		return _solicitudRequerimientoPersonal.getActivo();
	}

	/**
	* Returns <code>true</code> if this solicitud requerimiento personal is activo.
	*
	* @return <code>true</code> if this solicitud requerimiento personal is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _solicitudRequerimientoPersonal.isActivo();
	}

	/**
	* Sets whether this solicitud requerimiento personal is activo.
	*
	* @param activo the activo of this solicitud requerimiento personal
	*/
	@Override
	public void setActivo(boolean activo) {
		_solicitudRequerimientoPersonal.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this solicitud requerimiento personal.
	*
	* @return the usuariocrea of this solicitud requerimiento personal
	*/
	@Override
	public long getUsuariocrea() {
		return _solicitudRequerimientoPersonal.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this solicitud requerimiento personal.
	*
	* @param usuariocrea the usuariocrea of this solicitud requerimiento personal
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_solicitudRequerimientoPersonal.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this solicitud requerimiento personal.
	*
	* @return the fechacrea of this solicitud requerimiento personal
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _solicitudRequerimientoPersonal.getFechacrea();
	}

	/**
	* Sets the fechacrea of this solicitud requerimiento personal.
	*
	* @param fechacrea the fechacrea of this solicitud requerimiento personal
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_solicitudRequerimientoPersonal.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this solicitud requerimiento personal.
	*
	* @return the usuariomodifica of this solicitud requerimiento personal
	*/
	@Override
	public long getUsuariomodifica() {
		return _solicitudRequerimientoPersonal.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this solicitud requerimiento personal.
	*
	* @param usuariomodifica the usuariomodifica of this solicitud requerimiento personal
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_solicitudRequerimientoPersonal.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this solicitud requerimiento personal.
	*
	* @return the fechacreamodifica of this solicitud requerimiento personal
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _solicitudRequerimientoPersonal.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this solicitud requerimiento personal.
	*
	* @param fechacreamodifica the fechacreamodifica of this solicitud requerimiento personal
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_solicitudRequerimientoPersonal.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _solicitudRequerimientoPersonal.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_solicitudRequerimientoPersonal.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _solicitudRequerimientoPersonal.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_solicitudRequerimientoPersonal.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _solicitudRequerimientoPersonal.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _solicitudRequerimientoPersonal.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_solicitudRequerimientoPersonal.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _solicitudRequerimientoPersonal.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_solicitudRequerimientoPersonal.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_solicitudRequerimientoPersonal.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_solicitudRequerimientoPersonal.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SolicitudRequerimientoPersonalWrapper((SolicitudRequerimientoPersonal)_solicitudRequerimientoPersonal.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.SolicitudRequerimientoPersonal solicitudRequerimientoPersonal) {
		return _solicitudRequerimientoPersonal.compareTo(solicitudRequerimientoPersonal);
	}

	@Override
	public int hashCode() {
		return _solicitudRequerimientoPersonal.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.SolicitudRequerimientoPersonal> toCacheModel() {
		return _solicitudRequerimientoPersonal.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.SolicitudRequerimientoPersonal toEscapedModel() {
		return new SolicitudRequerimientoPersonalWrapper(_solicitudRequerimientoPersonal.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.SolicitudRequerimientoPersonal toUnescapedModel() {
		return new SolicitudRequerimientoPersonalWrapper(_solicitudRequerimientoPersonal.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _solicitudRequerimientoPersonal.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _solicitudRequerimientoPersonal.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_solicitudRequerimientoPersonal.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SolicitudRequerimientoPersonalWrapper)) {
			return false;
		}

		SolicitudRequerimientoPersonalWrapper solicitudRequerimientoPersonalWrapper =
			(SolicitudRequerimientoPersonalWrapper)obj;

		if (Validator.equals(_solicitudRequerimientoPersonal,
					solicitudRequerimientoPersonalWrapper._solicitudRequerimientoPersonal)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SolicitudRequerimientoPersonal getWrappedSolicitudRequerimientoPersonal() {
		return _solicitudRequerimientoPersonal;
	}

	@Override
	public SolicitudRequerimientoPersonal getWrappedModel() {
		return _solicitudRequerimientoPersonal;
	}

	@Override
	public void resetOriginalValues() {
		_solicitudRequerimientoPersonal.resetOriginalValues();
	}

	private SolicitudRequerimientoPersonal _solicitudRequerimientoPersonal;
}
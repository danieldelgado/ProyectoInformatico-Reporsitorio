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
 * This class is a wrapper for {@link SolicitudRequerimiento}.
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimiento
 * @generated
 */
public class SolicitudRequerimientoWrapper implements SolicitudRequerimiento,
	ModelWrapper<SolicitudRequerimiento> {
	public SolicitudRequerimientoWrapper(
		SolicitudRequerimiento solicitudRequerimiento) {
		_solicitudRequerimiento = solicitudRequerimiento;
	}

	@Override
	public Class<?> getModelClass() {
		return SolicitudRequerimiento.class;
	}

	@Override
	public String getModelClassName() {
		return SolicitudRequerimiento.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudRequerimientoId", getSolicitudRequerimientoId());
		attributes.put("areaSolicitante", getAreaSolicitante());
		attributes.put("cantidadRecursos", getCantidadRecursos());
		attributes.put("responsableRRHH", getResponsableRRHH());
		attributes.put("fechaLimite", getFechaLimite());
		attributes.put("tiempoContrato", getTiempoContrato());
		attributes.put("tipoNegocio", getTipoNegocio());
		attributes.put("presupuestoMaximo", getPresupuestoMaximo());
		attributes.put("presupuestoMinimo", getPresupuestoMinimo());
		attributes.put("cliente", getCliente());
		attributes.put("especialidad", getEspecialidad());
		attributes.put("meta", getMeta());
		attributes.put("fechameta", getFechameta());
		attributes.put("prioridad", getPrioridad());
		attributes.put("contenidoId", getContenidoId());
		attributes.put("modalidadjornada", getModalidadjornada());
		attributes.put("modalidadcontrato", getModalidadcontrato());
		attributes.put("lugarTrabajo", getLugarTrabajo());
		attributes.put("categoriaPuestoId", getCategoriaPuestoId());
		attributes.put("proyecto", getProyecto());
		attributes.put("tiporeclutamiento", getTiporeclutamiento());
		attributes.put("estado", getEstado());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());
		attributes.put("cantidadAnnosRubro", getCantidadAnnosRubro());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long solicitudRequerimientoId = (Long)attributes.get(
				"solicitudRequerimientoId");

		if (solicitudRequerimientoId != null) {
			setSolicitudRequerimientoId(solicitudRequerimientoId);
		}

		Long areaSolicitante = (Long)attributes.get("areaSolicitante");

		if (areaSolicitante != null) {
			setAreaSolicitante(areaSolicitante);
		}

		Integer cantidadRecursos = (Integer)attributes.get("cantidadRecursos");

		if (cantidadRecursos != null) {
			setCantidadRecursos(cantidadRecursos);
		}

		Long responsableRRHH = (Long)attributes.get("responsableRRHH");

		if (responsableRRHH != null) {
			setResponsableRRHH(responsableRRHH);
		}

		Date fechaLimite = (Date)attributes.get("fechaLimite");

		if (fechaLimite != null) {
			setFechaLimite(fechaLimite);
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

		String especialidad = (String)attributes.get("especialidad");

		if (especialidad != null) {
			setEspecialidad(especialidad);
		}

		String meta = (String)attributes.get("meta");

		if (meta != null) {
			setMeta(meta);
		}

		Date fechameta = (Date)attributes.get("fechameta");

		if (fechameta != null) {
			setFechameta(fechameta);
		}

		Long prioridad = (Long)attributes.get("prioridad");

		if (prioridad != null) {
			setPrioridad(prioridad);
		}

		String contenidoId = (String)attributes.get("contenidoId");

		if (contenidoId != null) {
			setContenidoId(contenidoId);
		}

		Long modalidadjornada = (Long)attributes.get("modalidadjornada");

		if (modalidadjornada != null) {
			setModalidadjornada(modalidadjornada);
		}

		Long modalidadcontrato = (Long)attributes.get("modalidadcontrato");

		if (modalidadcontrato != null) {
			setModalidadcontrato(modalidadcontrato);
		}

		String lugarTrabajo = (String)attributes.get("lugarTrabajo");

		if (lugarTrabajo != null) {
			setLugarTrabajo(lugarTrabajo);
		}

		Long categoriaPuestoId = (Long)attributes.get("categoriaPuestoId");

		if (categoriaPuestoId != null) {
			setCategoriaPuestoId(categoriaPuestoId);
		}

		String proyecto = (String)attributes.get("proyecto");

		if (proyecto != null) {
			setProyecto(proyecto);
		}

		Long tiporeclutamiento = (Long)attributes.get("tiporeclutamiento");

		if (tiporeclutamiento != null) {
			setTiporeclutamiento(tiporeclutamiento);
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

		Date fechamodifica = (Date)attributes.get("fechamodifica");

		if (fechamodifica != null) {
			setFechamodifica(fechamodifica);
		}

		Integer cantidadAnnosRubro = (Integer)attributes.get(
				"cantidadAnnosRubro");

		if (cantidadAnnosRubro != null) {
			setCantidadAnnosRubro(cantidadAnnosRubro);
		}
	}

	/**
	* Returns the primary key of this solicitud requerimiento.
	*
	* @return the primary key of this solicitud requerimiento
	*/
	@Override
	public long getPrimaryKey() {
		return _solicitudRequerimiento.getPrimaryKey();
	}

	/**
	* Sets the primary key of this solicitud requerimiento.
	*
	* @param primaryKey the primary key of this solicitud requerimiento
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_solicitudRequerimiento.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the solicitud requerimiento ID of this solicitud requerimiento.
	*
	* @return the solicitud requerimiento ID of this solicitud requerimiento
	*/
	@Override
	public long getSolicitudRequerimientoId() {
		return _solicitudRequerimiento.getSolicitudRequerimientoId();
	}

	/**
	* Sets the solicitud requerimiento ID of this solicitud requerimiento.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID of this solicitud requerimiento
	*/
	@Override
	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_solicitudRequerimiento.setSolicitudRequerimientoId(solicitudRequerimientoId);
	}

	/**
	* Returns the area solicitante of this solicitud requerimiento.
	*
	* @return the area solicitante of this solicitud requerimiento
	*/
	@Override
	public long getAreaSolicitante() {
		return _solicitudRequerimiento.getAreaSolicitante();
	}

	/**
	* Sets the area solicitante of this solicitud requerimiento.
	*
	* @param areaSolicitante the area solicitante of this solicitud requerimiento
	*/
	@Override
	public void setAreaSolicitante(long areaSolicitante) {
		_solicitudRequerimiento.setAreaSolicitante(areaSolicitante);
	}

	/**
	* Returns the cantidad recursos of this solicitud requerimiento.
	*
	* @return the cantidad recursos of this solicitud requerimiento
	*/
	@Override
	public int getCantidadRecursos() {
		return _solicitudRequerimiento.getCantidadRecursos();
	}

	/**
	* Sets the cantidad recursos of this solicitud requerimiento.
	*
	* @param cantidadRecursos the cantidad recursos of this solicitud requerimiento
	*/
	@Override
	public void setCantidadRecursos(int cantidadRecursos) {
		_solicitudRequerimiento.setCantidadRecursos(cantidadRecursos);
	}

	/**
	* Returns the responsable r r h h of this solicitud requerimiento.
	*
	* @return the responsable r r h h of this solicitud requerimiento
	*/
	@Override
	public long getResponsableRRHH() {
		return _solicitudRequerimiento.getResponsableRRHH();
	}

	/**
	* Sets the responsable r r h h of this solicitud requerimiento.
	*
	* @param responsableRRHH the responsable r r h h of this solicitud requerimiento
	*/
	@Override
	public void setResponsableRRHH(long responsableRRHH) {
		_solicitudRequerimiento.setResponsableRRHH(responsableRRHH);
	}

	/**
	* Returns the fecha limite of this solicitud requerimiento.
	*
	* @return the fecha limite of this solicitud requerimiento
	*/
	@Override
	public java.util.Date getFechaLimite() {
		return _solicitudRequerimiento.getFechaLimite();
	}

	/**
	* Sets the fecha limite of this solicitud requerimiento.
	*
	* @param fechaLimite the fecha limite of this solicitud requerimiento
	*/
	@Override
	public void setFechaLimite(java.util.Date fechaLimite) {
		_solicitudRequerimiento.setFechaLimite(fechaLimite);
	}

	/**
	* Returns the tiempo contrato of this solicitud requerimiento.
	*
	* @return the tiempo contrato of this solicitud requerimiento
	*/
	@Override
	public long getTiempoContrato() {
		return _solicitudRequerimiento.getTiempoContrato();
	}

	/**
	* Sets the tiempo contrato of this solicitud requerimiento.
	*
	* @param tiempoContrato the tiempo contrato of this solicitud requerimiento
	*/
	@Override
	public void setTiempoContrato(long tiempoContrato) {
		_solicitudRequerimiento.setTiempoContrato(tiempoContrato);
	}

	/**
	* Returns the tipo negocio of this solicitud requerimiento.
	*
	* @return the tipo negocio of this solicitud requerimiento
	*/
	@Override
	public long getTipoNegocio() {
		return _solicitudRequerimiento.getTipoNegocio();
	}

	/**
	* Sets the tipo negocio of this solicitud requerimiento.
	*
	* @param tipoNegocio the tipo negocio of this solicitud requerimiento
	*/
	@Override
	public void setTipoNegocio(long tipoNegocio) {
		_solicitudRequerimiento.setTipoNegocio(tipoNegocio);
	}

	/**
	* Returns the presupuesto maximo of this solicitud requerimiento.
	*
	* @return the presupuesto maximo of this solicitud requerimiento
	*/
	@Override
	public long getPresupuestoMaximo() {
		return _solicitudRequerimiento.getPresupuestoMaximo();
	}

	/**
	* Sets the presupuesto maximo of this solicitud requerimiento.
	*
	* @param presupuestoMaximo the presupuesto maximo of this solicitud requerimiento
	*/
	@Override
	public void setPresupuestoMaximo(long presupuestoMaximo) {
		_solicitudRequerimiento.setPresupuestoMaximo(presupuestoMaximo);
	}

	/**
	* Returns the presupuesto minimo of this solicitud requerimiento.
	*
	* @return the presupuesto minimo of this solicitud requerimiento
	*/
	@Override
	public long getPresupuestoMinimo() {
		return _solicitudRequerimiento.getPresupuestoMinimo();
	}

	/**
	* Sets the presupuesto minimo of this solicitud requerimiento.
	*
	* @param presupuestoMinimo the presupuesto minimo of this solicitud requerimiento
	*/
	@Override
	public void setPresupuestoMinimo(long presupuestoMinimo) {
		_solicitudRequerimiento.setPresupuestoMinimo(presupuestoMinimo);
	}

	/**
	* Returns the cliente of this solicitud requerimiento.
	*
	* @return the cliente of this solicitud requerimiento
	*/
	@Override
	public long getCliente() {
		return _solicitudRequerimiento.getCliente();
	}

	/**
	* Sets the cliente of this solicitud requerimiento.
	*
	* @param cliente the cliente of this solicitud requerimiento
	*/
	@Override
	public void setCliente(long cliente) {
		_solicitudRequerimiento.setCliente(cliente);
	}

	/**
	* Returns the especialidad of this solicitud requerimiento.
	*
	* @return the especialidad of this solicitud requerimiento
	*/
	@Override
	public java.lang.String getEspecialidad() {
		return _solicitudRequerimiento.getEspecialidad();
	}

	/**
	* Sets the especialidad of this solicitud requerimiento.
	*
	* @param especialidad the especialidad of this solicitud requerimiento
	*/
	@Override
	public void setEspecialidad(java.lang.String especialidad) {
		_solicitudRequerimiento.setEspecialidad(especialidad);
	}

	/**
	* Returns the meta of this solicitud requerimiento.
	*
	* @return the meta of this solicitud requerimiento
	*/
	@Override
	public java.lang.String getMeta() {
		return _solicitudRequerimiento.getMeta();
	}

	/**
	* Sets the meta of this solicitud requerimiento.
	*
	* @param meta the meta of this solicitud requerimiento
	*/
	@Override
	public void setMeta(java.lang.String meta) {
		_solicitudRequerimiento.setMeta(meta);
	}

	/**
	* Returns the fechameta of this solicitud requerimiento.
	*
	* @return the fechameta of this solicitud requerimiento
	*/
	@Override
	public java.util.Date getFechameta() {
		return _solicitudRequerimiento.getFechameta();
	}

	/**
	* Sets the fechameta of this solicitud requerimiento.
	*
	* @param fechameta the fechameta of this solicitud requerimiento
	*/
	@Override
	public void setFechameta(java.util.Date fechameta) {
		_solicitudRequerimiento.setFechameta(fechameta);
	}

	/**
	* Returns the prioridad of this solicitud requerimiento.
	*
	* @return the prioridad of this solicitud requerimiento
	*/
	@Override
	public long getPrioridad() {
		return _solicitudRequerimiento.getPrioridad();
	}

	/**
	* Sets the prioridad of this solicitud requerimiento.
	*
	* @param prioridad the prioridad of this solicitud requerimiento
	*/
	@Override
	public void setPrioridad(long prioridad) {
		_solicitudRequerimiento.setPrioridad(prioridad);
	}

	/**
	* Returns the contenido ID of this solicitud requerimiento.
	*
	* @return the contenido ID of this solicitud requerimiento
	*/
	@Override
	public java.lang.String getContenidoId() {
		return _solicitudRequerimiento.getContenidoId();
	}

	/**
	* Sets the contenido ID of this solicitud requerimiento.
	*
	* @param contenidoId the contenido ID of this solicitud requerimiento
	*/
	@Override
	public void setContenidoId(java.lang.String contenidoId) {
		_solicitudRequerimiento.setContenidoId(contenidoId);
	}

	/**
	* Returns the modalidadjornada of this solicitud requerimiento.
	*
	* @return the modalidadjornada of this solicitud requerimiento
	*/
	@Override
	public long getModalidadjornada() {
		return _solicitudRequerimiento.getModalidadjornada();
	}

	/**
	* Sets the modalidadjornada of this solicitud requerimiento.
	*
	* @param modalidadjornada the modalidadjornada of this solicitud requerimiento
	*/
	@Override
	public void setModalidadjornada(long modalidadjornada) {
		_solicitudRequerimiento.setModalidadjornada(modalidadjornada);
	}

	/**
	* Returns the modalidadcontrato of this solicitud requerimiento.
	*
	* @return the modalidadcontrato of this solicitud requerimiento
	*/
	@Override
	public long getModalidadcontrato() {
		return _solicitudRequerimiento.getModalidadcontrato();
	}

	/**
	* Sets the modalidadcontrato of this solicitud requerimiento.
	*
	* @param modalidadcontrato the modalidadcontrato of this solicitud requerimiento
	*/
	@Override
	public void setModalidadcontrato(long modalidadcontrato) {
		_solicitudRequerimiento.setModalidadcontrato(modalidadcontrato);
	}

	/**
	* Returns the lugar trabajo of this solicitud requerimiento.
	*
	* @return the lugar trabajo of this solicitud requerimiento
	*/
	@Override
	public java.lang.String getLugarTrabajo() {
		return _solicitudRequerimiento.getLugarTrabajo();
	}

	/**
	* Sets the lugar trabajo of this solicitud requerimiento.
	*
	* @param lugarTrabajo the lugar trabajo of this solicitud requerimiento
	*/
	@Override
	public void setLugarTrabajo(java.lang.String lugarTrabajo) {
		_solicitudRequerimiento.setLugarTrabajo(lugarTrabajo);
	}

	/**
	* Returns the categoria puesto ID of this solicitud requerimiento.
	*
	* @return the categoria puesto ID of this solicitud requerimiento
	*/
	@Override
	public long getCategoriaPuestoId() {
		return _solicitudRequerimiento.getCategoriaPuestoId();
	}

	/**
	* Sets the categoria puesto ID of this solicitud requerimiento.
	*
	* @param categoriaPuestoId the categoria puesto ID of this solicitud requerimiento
	*/
	@Override
	public void setCategoriaPuestoId(long categoriaPuestoId) {
		_solicitudRequerimiento.setCategoriaPuestoId(categoriaPuestoId);
	}

	/**
	* Returns the proyecto of this solicitud requerimiento.
	*
	* @return the proyecto of this solicitud requerimiento
	*/
	@Override
	public java.lang.String getProyecto() {
		return _solicitudRequerimiento.getProyecto();
	}

	/**
	* Sets the proyecto of this solicitud requerimiento.
	*
	* @param proyecto the proyecto of this solicitud requerimiento
	*/
	@Override
	public void setProyecto(java.lang.String proyecto) {
		_solicitudRequerimiento.setProyecto(proyecto);
	}

	/**
	* Returns the tiporeclutamiento of this solicitud requerimiento.
	*
	* @return the tiporeclutamiento of this solicitud requerimiento
	*/
	@Override
	public long getTiporeclutamiento() {
		return _solicitudRequerimiento.getTiporeclutamiento();
	}

	/**
	* Sets the tiporeclutamiento of this solicitud requerimiento.
	*
	* @param tiporeclutamiento the tiporeclutamiento of this solicitud requerimiento
	*/
	@Override
	public void setTiporeclutamiento(long tiporeclutamiento) {
		_solicitudRequerimiento.setTiporeclutamiento(tiporeclutamiento);
	}

	/**
	* Returns the estado of this solicitud requerimiento.
	*
	* @return the estado of this solicitud requerimiento
	*/
	@Override
	public long getEstado() {
		return _solicitudRequerimiento.getEstado();
	}

	/**
	* Sets the estado of this solicitud requerimiento.
	*
	* @param estado the estado of this solicitud requerimiento
	*/
	@Override
	public void setEstado(long estado) {
		_solicitudRequerimiento.setEstado(estado);
	}

	/**
	* Returns the activo of this solicitud requerimiento.
	*
	* @return the activo of this solicitud requerimiento
	*/
	@Override
	public boolean getActivo() {
		return _solicitudRequerimiento.getActivo();
	}

	/**
	* Returns <code>true</code> if this solicitud requerimiento is activo.
	*
	* @return <code>true</code> if this solicitud requerimiento is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _solicitudRequerimiento.isActivo();
	}

	/**
	* Sets whether this solicitud requerimiento is activo.
	*
	* @param activo the activo of this solicitud requerimiento
	*/
	@Override
	public void setActivo(boolean activo) {
		_solicitudRequerimiento.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this solicitud requerimiento.
	*
	* @return the usuariocrea of this solicitud requerimiento
	*/
	@Override
	public long getUsuariocrea() {
		return _solicitudRequerimiento.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this solicitud requerimiento.
	*
	* @param usuariocrea the usuariocrea of this solicitud requerimiento
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_solicitudRequerimiento.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this solicitud requerimiento.
	*
	* @return the fechacrea of this solicitud requerimiento
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _solicitudRequerimiento.getFechacrea();
	}

	/**
	* Sets the fechacrea of this solicitud requerimiento.
	*
	* @param fechacrea the fechacrea of this solicitud requerimiento
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_solicitudRequerimiento.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this solicitud requerimiento.
	*
	* @return the usuariomodifica of this solicitud requerimiento
	*/
	@Override
	public long getUsuariomodifica() {
		return _solicitudRequerimiento.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this solicitud requerimiento.
	*
	* @param usuariomodifica the usuariomodifica of this solicitud requerimiento
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_solicitudRequerimiento.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechamodifica of this solicitud requerimiento.
	*
	* @return the fechamodifica of this solicitud requerimiento
	*/
	@Override
	public java.util.Date getFechamodifica() {
		return _solicitudRequerimiento.getFechamodifica();
	}

	/**
	* Sets the fechamodifica of this solicitud requerimiento.
	*
	* @param fechamodifica the fechamodifica of this solicitud requerimiento
	*/
	@Override
	public void setFechamodifica(java.util.Date fechamodifica) {
		_solicitudRequerimiento.setFechamodifica(fechamodifica);
	}

	/**
	* Returns the cantidad annos rubro of this solicitud requerimiento.
	*
	* @return the cantidad annos rubro of this solicitud requerimiento
	*/
	@Override
	public int getCantidadAnnosRubro() {
		return _solicitudRequerimiento.getCantidadAnnosRubro();
	}

	/**
	* Sets the cantidad annos rubro of this solicitud requerimiento.
	*
	* @param cantidadAnnosRubro the cantidad annos rubro of this solicitud requerimiento
	*/
	@Override
	public void setCantidadAnnosRubro(int cantidadAnnosRubro) {
		_solicitudRequerimiento.setCantidadAnnosRubro(cantidadAnnosRubro);
	}

	@Override
	public boolean isNew() {
		return _solicitudRequerimiento.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_solicitudRequerimiento.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _solicitudRequerimiento.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_solicitudRequerimiento.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _solicitudRequerimiento.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _solicitudRequerimiento.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_solicitudRequerimiento.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _solicitudRequerimiento.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_solicitudRequerimiento.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_solicitudRequerimiento.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_solicitudRequerimiento.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SolicitudRequerimientoWrapper((SolicitudRequerimiento)_solicitudRequerimiento.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento) {
		return _solicitudRequerimiento.compareTo(solicitudRequerimiento);
	}

	@Override
	public int hashCode() {
		return _solicitudRequerimiento.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.SolicitudRequerimiento> toCacheModel() {
		return _solicitudRequerimiento.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.SolicitudRequerimiento toEscapedModel() {
		return new SolicitudRequerimientoWrapper(_solicitudRequerimiento.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.SolicitudRequerimiento toUnescapedModel() {
		return new SolicitudRequerimientoWrapper(_solicitudRequerimiento.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _solicitudRequerimiento.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _solicitudRequerimiento.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_solicitudRequerimiento.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SolicitudRequerimientoWrapper)) {
			return false;
		}

		SolicitudRequerimientoWrapper solicitudRequerimientoWrapper = (SolicitudRequerimientoWrapper)obj;

		if (Validator.equals(_solicitudRequerimiento,
					solicitudRequerimientoWrapper._solicitudRequerimiento)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SolicitudRequerimiento getWrappedSolicitudRequerimiento() {
		return _solicitudRequerimiento;
	}

	@Override
	public SolicitudRequerimiento getWrappedModel() {
		return _solicitudRequerimiento;
	}

	@Override
	public void resetOriginalValues() {
		_solicitudRequerimiento.resetOriginalValues();
	}

	private SolicitudRequerimiento _solicitudRequerimiento;
}
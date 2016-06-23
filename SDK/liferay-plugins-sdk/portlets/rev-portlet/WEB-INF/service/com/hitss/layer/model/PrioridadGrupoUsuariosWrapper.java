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
 * This class is a wrapper for {@link PrioridadGrupoUsuarios}.
 * </p>
 *
 * @author Danielle Delgado
 * @see PrioridadGrupoUsuarios
 * @generated
 */
public class PrioridadGrupoUsuariosWrapper implements PrioridadGrupoUsuarios,
	ModelWrapper<PrioridadGrupoUsuarios> {
	public PrioridadGrupoUsuariosWrapper(
		PrioridadGrupoUsuarios prioridadGrupoUsuarios) {
		_prioridadGrupoUsuarios = prioridadGrupoUsuarios;
	}

	@Override
	public Class<?> getModelClass() {
		return PrioridadGrupoUsuarios.class;
	}

	@Override
	public String getModelClassName() {
		return PrioridadGrupoUsuarios.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("prioridadGrupoUsuariosId", getPrioridadGrupoUsuariosId());
		attributes.put("solicitudEvaluacionDesempennoId",
			getSolicitudEvaluacionDesempennoId());
		attributes.put("responsableGrupo", getResponsableGrupo());
		attributes.put("grupoUsuario", getGrupoUsuario());
		attributes.put("orden", getOrden());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long prioridadGrupoUsuariosId = (Long)attributes.get(
				"prioridadGrupoUsuariosId");

		if (prioridadGrupoUsuariosId != null) {
			setPrioridadGrupoUsuariosId(prioridadGrupoUsuariosId);
		}

		Long solicitudEvaluacionDesempennoId = (Long)attributes.get(
				"solicitudEvaluacionDesempennoId");

		if (solicitudEvaluacionDesempennoId != null) {
			setSolicitudEvaluacionDesempennoId(solicitudEvaluacionDesempennoId);
		}

		String responsableGrupo = (String)attributes.get("responsableGrupo");

		if (responsableGrupo != null) {
			setResponsableGrupo(responsableGrupo);
		}

		String grupoUsuario = (String)attributes.get("grupoUsuario");

		if (grupoUsuario != null) {
			setGrupoUsuario(grupoUsuario);
		}

		Integer orden = (Integer)attributes.get("orden");

		if (orden != null) {
			setOrden(orden);
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
	* Returns the primary key of this prioridad grupo usuarios.
	*
	* @return the primary key of this prioridad grupo usuarios
	*/
	@Override
	public long getPrimaryKey() {
		return _prioridadGrupoUsuarios.getPrimaryKey();
	}

	/**
	* Sets the primary key of this prioridad grupo usuarios.
	*
	* @param primaryKey the primary key of this prioridad grupo usuarios
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_prioridadGrupoUsuarios.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the prioridad grupo usuarios ID of this prioridad grupo usuarios.
	*
	* @return the prioridad grupo usuarios ID of this prioridad grupo usuarios
	*/
	@Override
	public long getPrioridadGrupoUsuariosId() {
		return _prioridadGrupoUsuarios.getPrioridadGrupoUsuariosId();
	}

	/**
	* Sets the prioridad grupo usuarios ID of this prioridad grupo usuarios.
	*
	* @param prioridadGrupoUsuariosId the prioridad grupo usuarios ID of this prioridad grupo usuarios
	*/
	@Override
	public void setPrioridadGrupoUsuariosId(long prioridadGrupoUsuariosId) {
		_prioridadGrupoUsuarios.setPrioridadGrupoUsuariosId(prioridadGrupoUsuariosId);
	}

	/**
	* Returns the solicitud evaluacion desempenno ID of this prioridad grupo usuarios.
	*
	* @return the solicitud evaluacion desempenno ID of this prioridad grupo usuarios
	*/
	@Override
	public long getSolicitudEvaluacionDesempennoId() {
		return _prioridadGrupoUsuarios.getSolicitudEvaluacionDesempennoId();
	}

	/**
	* Sets the solicitud evaluacion desempenno ID of this prioridad grupo usuarios.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID of this prioridad grupo usuarios
	*/
	@Override
	public void setSolicitudEvaluacionDesempennoId(
		long solicitudEvaluacionDesempennoId) {
		_prioridadGrupoUsuarios.setSolicitudEvaluacionDesempennoId(solicitudEvaluacionDesempennoId);
	}

	/**
	* Returns the responsable grupo of this prioridad grupo usuarios.
	*
	* @return the responsable grupo of this prioridad grupo usuarios
	*/
	@Override
	public java.lang.String getResponsableGrupo() {
		return _prioridadGrupoUsuarios.getResponsableGrupo();
	}

	/**
	* Sets the responsable grupo of this prioridad grupo usuarios.
	*
	* @param responsableGrupo the responsable grupo of this prioridad grupo usuarios
	*/
	@Override
	public void setResponsableGrupo(java.lang.String responsableGrupo) {
		_prioridadGrupoUsuarios.setResponsableGrupo(responsableGrupo);
	}

	/**
	* Returns the grupo usuario of this prioridad grupo usuarios.
	*
	* @return the grupo usuario of this prioridad grupo usuarios
	*/
	@Override
	public java.lang.String getGrupoUsuario() {
		return _prioridadGrupoUsuarios.getGrupoUsuario();
	}

	/**
	* Sets the grupo usuario of this prioridad grupo usuarios.
	*
	* @param grupoUsuario the grupo usuario of this prioridad grupo usuarios
	*/
	@Override
	public void setGrupoUsuario(java.lang.String grupoUsuario) {
		_prioridadGrupoUsuarios.setGrupoUsuario(grupoUsuario);
	}

	/**
	* Returns the orden of this prioridad grupo usuarios.
	*
	* @return the orden of this prioridad grupo usuarios
	*/
	@Override
	public int getOrden() {
		return _prioridadGrupoUsuarios.getOrden();
	}

	/**
	* Sets the orden of this prioridad grupo usuarios.
	*
	* @param orden the orden of this prioridad grupo usuarios
	*/
	@Override
	public void setOrden(int orden) {
		_prioridadGrupoUsuarios.setOrden(orden);
	}

	/**
	* Returns the activo of this prioridad grupo usuarios.
	*
	* @return the activo of this prioridad grupo usuarios
	*/
	@Override
	public boolean getActivo() {
		return _prioridadGrupoUsuarios.getActivo();
	}

	/**
	* Returns <code>true</code> if this prioridad grupo usuarios is activo.
	*
	* @return <code>true</code> if this prioridad grupo usuarios is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _prioridadGrupoUsuarios.isActivo();
	}

	/**
	* Sets whether this prioridad grupo usuarios is activo.
	*
	* @param activo the activo of this prioridad grupo usuarios
	*/
	@Override
	public void setActivo(boolean activo) {
		_prioridadGrupoUsuarios.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this prioridad grupo usuarios.
	*
	* @return the usuariocrea of this prioridad grupo usuarios
	*/
	@Override
	public long getUsuariocrea() {
		return _prioridadGrupoUsuarios.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this prioridad grupo usuarios.
	*
	* @param usuariocrea the usuariocrea of this prioridad grupo usuarios
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_prioridadGrupoUsuarios.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this prioridad grupo usuarios.
	*
	* @return the fechacrea of this prioridad grupo usuarios
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _prioridadGrupoUsuarios.getFechacrea();
	}

	/**
	* Sets the fechacrea of this prioridad grupo usuarios.
	*
	* @param fechacrea the fechacrea of this prioridad grupo usuarios
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_prioridadGrupoUsuarios.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this prioridad grupo usuarios.
	*
	* @return the usuariomodifica of this prioridad grupo usuarios
	*/
	@Override
	public long getUsuariomodifica() {
		return _prioridadGrupoUsuarios.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this prioridad grupo usuarios.
	*
	* @param usuariomodifica the usuariomodifica of this prioridad grupo usuarios
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_prioridadGrupoUsuarios.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this prioridad grupo usuarios.
	*
	* @return the fechacreamodifica of this prioridad grupo usuarios
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _prioridadGrupoUsuarios.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this prioridad grupo usuarios.
	*
	* @param fechacreamodifica the fechacreamodifica of this prioridad grupo usuarios
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_prioridadGrupoUsuarios.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _prioridadGrupoUsuarios.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_prioridadGrupoUsuarios.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _prioridadGrupoUsuarios.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_prioridadGrupoUsuarios.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _prioridadGrupoUsuarios.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _prioridadGrupoUsuarios.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_prioridadGrupoUsuarios.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _prioridadGrupoUsuarios.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_prioridadGrupoUsuarios.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_prioridadGrupoUsuarios.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_prioridadGrupoUsuarios.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PrioridadGrupoUsuariosWrapper((PrioridadGrupoUsuarios)_prioridadGrupoUsuarios.clone());
	}

	@Override
	public int compareTo(
		com.hitss.layer.model.PrioridadGrupoUsuarios prioridadGrupoUsuarios) {
		return _prioridadGrupoUsuarios.compareTo(prioridadGrupoUsuarios);
	}

	@Override
	public int hashCode() {
		return _prioridadGrupoUsuarios.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.PrioridadGrupoUsuarios> toCacheModel() {
		return _prioridadGrupoUsuarios.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.PrioridadGrupoUsuarios toEscapedModel() {
		return new PrioridadGrupoUsuariosWrapper(_prioridadGrupoUsuarios.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.PrioridadGrupoUsuarios toUnescapedModel() {
		return new PrioridadGrupoUsuariosWrapper(_prioridadGrupoUsuarios.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _prioridadGrupoUsuarios.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _prioridadGrupoUsuarios.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_prioridadGrupoUsuarios.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PrioridadGrupoUsuariosWrapper)) {
			return false;
		}

		PrioridadGrupoUsuariosWrapper prioridadGrupoUsuariosWrapper = (PrioridadGrupoUsuariosWrapper)obj;

		if (Validator.equals(_prioridadGrupoUsuarios,
					prioridadGrupoUsuariosWrapper._prioridadGrupoUsuarios)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PrioridadGrupoUsuarios getWrappedPrioridadGrupoUsuarios() {
		return _prioridadGrupoUsuarios;
	}

	@Override
	public PrioridadGrupoUsuarios getWrappedModel() {
		return _prioridadGrupoUsuarios;
	}

	@Override
	public void resetOriginalValues() {
		_prioridadGrupoUsuarios.resetOriginalValues();
	}

	private PrioridadGrupoUsuarios _prioridadGrupoUsuarios;
}
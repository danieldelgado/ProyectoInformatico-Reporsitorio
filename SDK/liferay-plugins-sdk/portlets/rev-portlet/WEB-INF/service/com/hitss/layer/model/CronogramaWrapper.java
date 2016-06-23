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
 * This class is a wrapper for {@link Cronograma}.
 * </p>
 *
 * @author Danielle Delgado
 * @see Cronograma
 * @generated
 */
public class CronogramaWrapper implements Cronograma, ModelWrapper<Cronograma> {
	public CronogramaWrapper(Cronograma cronograma) {
		_cronograma = cronograma;
	}

	@Override
	public Class<?> getModelClass() {
		return Cronograma.class;
	}

	@Override
	public String getModelClassName() {
		return Cronograma.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cronogramaId", getCronogramaId());
		attributes.put("solicitudEvaluacionDesempennoId",
			getSolicitudEvaluacionDesempennoId());
		attributes.put("descripcion", getDescripcion());
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
		Long cronogramaId = (Long)attributes.get("cronogramaId");

		if (cronogramaId != null) {
			setCronogramaId(cronogramaId);
		}

		Long solicitudEvaluacionDesempennoId = (Long)attributes.get(
				"solicitudEvaluacionDesempennoId");

		if (solicitudEvaluacionDesempennoId != null) {
			setSolicitudEvaluacionDesempennoId(solicitudEvaluacionDesempennoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
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
	* Returns the primary key of this cronograma.
	*
	* @return the primary key of this cronograma
	*/
	@Override
	public long getPrimaryKey() {
		return _cronograma.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cronograma.
	*
	* @param primaryKey the primary key of this cronograma
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cronograma.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cronograma ID of this cronograma.
	*
	* @return the cronograma ID of this cronograma
	*/
	@Override
	public long getCronogramaId() {
		return _cronograma.getCronogramaId();
	}

	/**
	* Sets the cronograma ID of this cronograma.
	*
	* @param cronogramaId the cronograma ID of this cronograma
	*/
	@Override
	public void setCronogramaId(long cronogramaId) {
		_cronograma.setCronogramaId(cronogramaId);
	}

	/**
	* Returns the solicitud evaluacion desempenno ID of this cronograma.
	*
	* @return the solicitud evaluacion desempenno ID of this cronograma
	*/
	@Override
	public long getSolicitudEvaluacionDesempennoId() {
		return _cronograma.getSolicitudEvaluacionDesempennoId();
	}

	/**
	* Sets the solicitud evaluacion desempenno ID of this cronograma.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID of this cronograma
	*/
	@Override
	public void setSolicitudEvaluacionDesempennoId(
		long solicitudEvaluacionDesempennoId) {
		_cronograma.setSolicitudEvaluacionDesempennoId(solicitudEvaluacionDesempennoId);
	}

	/**
	* Returns the descripcion of this cronograma.
	*
	* @return the descripcion of this cronograma
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _cronograma.getDescripcion();
	}

	/**
	* Sets the descripcion of this cronograma.
	*
	* @param descripcion the descripcion of this cronograma
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_cronograma.setDescripcion(descripcion);
	}

	/**
	* Returns the estado of this cronograma.
	*
	* @return the estado of this cronograma
	*/
	@Override
	public long getEstado() {
		return _cronograma.getEstado();
	}

	/**
	* Sets the estado of this cronograma.
	*
	* @param estado the estado of this cronograma
	*/
	@Override
	public void setEstado(long estado) {
		_cronograma.setEstado(estado);
	}

	/**
	* Returns the activo of this cronograma.
	*
	* @return the activo of this cronograma
	*/
	@Override
	public boolean getActivo() {
		return _cronograma.getActivo();
	}

	/**
	* Returns <code>true</code> if this cronograma is activo.
	*
	* @return <code>true</code> if this cronograma is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _cronograma.isActivo();
	}

	/**
	* Sets whether this cronograma is activo.
	*
	* @param activo the activo of this cronograma
	*/
	@Override
	public void setActivo(boolean activo) {
		_cronograma.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this cronograma.
	*
	* @return the usuariocrea of this cronograma
	*/
	@Override
	public long getUsuariocrea() {
		return _cronograma.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this cronograma.
	*
	* @param usuariocrea the usuariocrea of this cronograma
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_cronograma.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this cronograma.
	*
	* @return the fechacrea of this cronograma
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _cronograma.getFechacrea();
	}

	/**
	* Sets the fechacrea of this cronograma.
	*
	* @param fechacrea the fechacrea of this cronograma
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_cronograma.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this cronograma.
	*
	* @return the usuariomodifica of this cronograma
	*/
	@Override
	public long getUsuariomodifica() {
		return _cronograma.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this cronograma.
	*
	* @param usuariomodifica the usuariomodifica of this cronograma
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_cronograma.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this cronograma.
	*
	* @return the fechacreamodifica of this cronograma
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _cronograma.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this cronograma.
	*
	* @param fechacreamodifica the fechacreamodifica of this cronograma
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_cronograma.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _cronograma.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_cronograma.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _cronograma.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cronograma.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _cronograma.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _cronograma.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_cronograma.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _cronograma.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_cronograma.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_cronograma.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_cronograma.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CronogramaWrapper((Cronograma)_cronograma.clone());
	}

	@Override
	public int compareTo(com.hitss.layer.model.Cronograma cronograma) {
		return _cronograma.compareTo(cronograma);
	}

	@Override
	public int hashCode() {
		return _cronograma.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.Cronograma> toCacheModel() {
		return _cronograma.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.Cronograma toEscapedModel() {
		return new CronogramaWrapper(_cronograma.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.Cronograma toUnescapedModel() {
		return new CronogramaWrapper(_cronograma.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _cronograma.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cronograma.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_cronograma.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CronogramaWrapper)) {
			return false;
		}

		CronogramaWrapper cronogramaWrapper = (CronogramaWrapper)obj;

		if (Validator.equals(_cronograma, cronogramaWrapper._cronograma)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Cronograma getWrappedCronograma() {
		return _cronograma;
	}

	@Override
	public Cronograma getWrappedModel() {
		return _cronograma;
	}

	@Override
	public void resetOriginalValues() {
		_cronograma.resetOriginalValues();
	}

	private Cronograma _cronograma;
}
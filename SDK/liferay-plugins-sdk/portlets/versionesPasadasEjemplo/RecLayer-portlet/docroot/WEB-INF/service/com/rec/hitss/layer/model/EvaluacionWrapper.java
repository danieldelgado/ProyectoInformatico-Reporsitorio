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
 * This class is a wrapper for {@link Evaluacion}.
 * </p>
 *
 * @author Crossfire
 * @see Evaluacion
 * @generated
 */
public class EvaluacionWrapper implements Evaluacion, ModelWrapper<Evaluacion> {
	public EvaluacionWrapper(Evaluacion evaluacion) {
		_evaluacion = evaluacion;
	}

	@Override
	public Class<?> getModelClass() {
		return Evaluacion.class;
	}

	@Override
	public String getModelClassName() {
		return Evaluacion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("tiempoMinuto", getTiempoMinuto());
		attributes.put("enfoque", getEnfoque());
		attributes.put("puestoEvaluacion", getPuestoEvaluacion());
		attributes.put("tiempoPuesto", getTiempoPuesto());
		attributes.put("TipoEvaluacion", getTipoEvaluacion());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		Long tiempoMinuto = (Long)attributes.get("tiempoMinuto");

		if (tiempoMinuto != null) {
			setTiempoMinuto(tiempoMinuto);
		}

		Long enfoque = (Long)attributes.get("enfoque");

		if (enfoque != null) {
			setEnfoque(enfoque);
		}

		Long puestoEvaluacion = (Long)attributes.get("puestoEvaluacion");

		if (puestoEvaluacion != null) {
			setPuestoEvaluacion(puestoEvaluacion);
		}

		Long tiempoPuesto = (Long)attributes.get("tiempoPuesto");

		if (tiempoPuesto != null) {
			setTiempoPuesto(tiempoPuesto);
		}

		Long TipoEvaluacion = (Long)attributes.get("TipoEvaluacion");

		if (TipoEvaluacion != null) {
			setTipoEvaluacion(TipoEvaluacion);
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
	* Returns the primary key of this evaluacion.
	*
	* @return the primary key of this evaluacion
	*/
	@Override
	public long getPrimaryKey() {
		return _evaluacion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this evaluacion.
	*
	* @param primaryKey the primary key of this evaluacion
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_evaluacion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the evaluacion ID of this evaluacion.
	*
	* @return the evaluacion ID of this evaluacion
	*/
	@Override
	public long getEvaluacionId() {
		return _evaluacion.getEvaluacionId();
	}

	/**
	* Sets the evaluacion ID of this evaluacion.
	*
	* @param evaluacionId the evaluacion ID of this evaluacion
	*/
	@Override
	public void setEvaluacionId(long evaluacionId) {
		_evaluacion.setEvaluacionId(evaluacionId);
	}

	/**
	* Returns the tiempo minuto of this evaluacion.
	*
	* @return the tiempo minuto of this evaluacion
	*/
	@Override
	public long getTiempoMinuto() {
		return _evaluacion.getTiempoMinuto();
	}

	/**
	* Sets the tiempo minuto of this evaluacion.
	*
	* @param tiempoMinuto the tiempo minuto of this evaluacion
	*/
	@Override
	public void setTiempoMinuto(long tiempoMinuto) {
		_evaluacion.setTiempoMinuto(tiempoMinuto);
	}

	/**
	* Returns the enfoque of this evaluacion.
	*
	* @return the enfoque of this evaluacion
	*/
	@Override
	public long getEnfoque() {
		return _evaluacion.getEnfoque();
	}

	/**
	* Sets the enfoque of this evaluacion.
	*
	* @param enfoque the enfoque of this evaluacion
	*/
	@Override
	public void setEnfoque(long enfoque) {
		_evaluacion.setEnfoque(enfoque);
	}

	/**
	* Returns the puesto evaluacion of this evaluacion.
	*
	* @return the puesto evaluacion of this evaluacion
	*/
	@Override
	public long getPuestoEvaluacion() {
		return _evaluacion.getPuestoEvaluacion();
	}

	/**
	* Sets the puesto evaluacion of this evaluacion.
	*
	* @param puestoEvaluacion the puesto evaluacion of this evaluacion
	*/
	@Override
	public void setPuestoEvaluacion(long puestoEvaluacion) {
		_evaluacion.setPuestoEvaluacion(puestoEvaluacion);
	}

	/**
	* Returns the tiempo puesto of this evaluacion.
	*
	* @return the tiempo puesto of this evaluacion
	*/
	@Override
	public long getTiempoPuesto() {
		return _evaluacion.getTiempoPuesto();
	}

	/**
	* Sets the tiempo puesto of this evaluacion.
	*
	* @param tiempoPuesto the tiempo puesto of this evaluacion
	*/
	@Override
	public void setTiempoPuesto(long tiempoPuesto) {
		_evaluacion.setTiempoPuesto(tiempoPuesto);
	}

	/**
	* Returns the tipo evaluacion of this evaluacion.
	*
	* @return the tipo evaluacion of this evaluacion
	*/
	@Override
	public long getTipoEvaluacion() {
		return _evaluacion.getTipoEvaluacion();
	}

	/**
	* Sets the tipo evaluacion of this evaluacion.
	*
	* @param TipoEvaluacion the tipo evaluacion of this evaluacion
	*/
	@Override
	public void setTipoEvaluacion(long TipoEvaluacion) {
		_evaluacion.setTipoEvaluacion(TipoEvaluacion);
	}

	/**
	* Returns the activo of this evaluacion.
	*
	* @return the activo of this evaluacion
	*/
	@Override
	public boolean getActivo() {
		return _evaluacion.getActivo();
	}

	/**
	* Returns <code>true</code> if this evaluacion is activo.
	*
	* @return <code>true</code> if this evaluacion is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _evaluacion.isActivo();
	}

	/**
	* Sets whether this evaluacion is activo.
	*
	* @param activo the activo of this evaluacion
	*/
	@Override
	public void setActivo(boolean activo) {
		_evaluacion.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this evaluacion.
	*
	* @return the usuariocrea of this evaluacion
	*/
	@Override
	public long getUsuariocrea() {
		return _evaluacion.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this evaluacion.
	*
	* @param usuariocrea the usuariocrea of this evaluacion
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_evaluacion.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this evaluacion.
	*
	* @return the fechacrea of this evaluacion
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _evaluacion.getFechacrea();
	}

	/**
	* Sets the fechacrea of this evaluacion.
	*
	* @param fechacrea the fechacrea of this evaluacion
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_evaluacion.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this evaluacion.
	*
	* @return the usuariomodifica of this evaluacion
	*/
	@Override
	public long getUsuariomodifica() {
		return _evaluacion.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this evaluacion.
	*
	* @param usuariomodifica the usuariomodifica of this evaluacion
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_evaluacion.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechacreamodifica of this evaluacion.
	*
	* @return the fechacreamodifica of this evaluacion
	*/
	@Override
	public java.util.Date getFechacreamodifica() {
		return _evaluacion.getFechacreamodifica();
	}

	/**
	* Sets the fechacreamodifica of this evaluacion.
	*
	* @param fechacreamodifica the fechacreamodifica of this evaluacion
	*/
	@Override
	public void setFechacreamodifica(java.util.Date fechacreamodifica) {
		_evaluacion.setFechacreamodifica(fechacreamodifica);
	}

	@Override
	public boolean isNew() {
		return _evaluacion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_evaluacion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _evaluacion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_evaluacion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _evaluacion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _evaluacion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_evaluacion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _evaluacion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_evaluacion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_evaluacion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_evaluacion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EvaluacionWrapper((Evaluacion)_evaluacion.clone());
	}

	@Override
	public int compareTo(com.rec.hitss.layer.model.Evaluacion evaluacion) {
		return _evaluacion.compareTo(evaluacion);
	}

	@Override
	public int hashCode() {
		return _evaluacion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.Evaluacion> toCacheModel() {
		return _evaluacion.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.Evaluacion toEscapedModel() {
		return new EvaluacionWrapper(_evaluacion.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.Evaluacion toUnescapedModel() {
		return new EvaluacionWrapper(_evaluacion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _evaluacion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _evaluacion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_evaluacion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EvaluacionWrapper)) {
			return false;
		}

		EvaluacionWrapper evaluacionWrapper = (EvaluacionWrapper)obj;

		if (Validator.equals(_evaluacion, evaluacionWrapper._evaluacion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Evaluacion getWrappedEvaluacion() {
		return _evaluacion;
	}

	@Override
	public Evaluacion getWrappedModel() {
		return _evaluacion;
	}

	@Override
	public void resetOriginalValues() {
		_evaluacion.resetOriginalValues();
	}

	private Evaluacion _evaluacion;
}
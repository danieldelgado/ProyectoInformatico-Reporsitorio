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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ResultadoEvaluacion}.
 * </p>
 *
 * @author Crossfire
 * @see ResultadoEvaluacion
 * @generated
 */
public class ResultadoEvaluacionWrapper implements ResultadoEvaluacion,
	ModelWrapper<ResultadoEvaluacion> {
	public ResultadoEvaluacionWrapper(ResultadoEvaluacion resultadoEvaluacion) {
		_resultadoEvaluacion = resultadoEvaluacion;
	}

	@Override
	public Class<?> getModelClass() {
		return ResultadoEvaluacion.class;
	}

	@Override
	public String getModelClassName() {
		return ResultadoEvaluacion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("resultadoEvaluacionId", getResultadoEvaluacionId());
		attributes.put("respuestaSelccionada", getRespuestaSelccionada());
		attributes.put("habilidadCumplida", getHabilidadCumplida());
		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("usuarioHitssId", getUsuarioHitssId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long resultadoEvaluacionId = (Long)attributes.get(
				"resultadoEvaluacionId");

		if (resultadoEvaluacionId != null) {
			setResultadoEvaluacionId(resultadoEvaluacionId);
		}

		Long respuestaSelccionada = (Long)attributes.get("respuestaSelccionada");

		if (respuestaSelccionada != null) {
			setRespuestaSelccionada(respuestaSelccionada);
		}

		Boolean habilidadCumplida = (Boolean)attributes.get("habilidadCumplida");

		if (habilidadCumplida != null) {
			setHabilidadCumplida(habilidadCumplida);
		}

		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		Long usuarioHitssId = (Long)attributes.get("usuarioHitssId");

		if (usuarioHitssId != null) {
			setUsuarioHitssId(usuarioHitssId);
		}
	}

	/**
	* Returns the primary key of this resultado evaluacion.
	*
	* @return the primary key of this resultado evaluacion
	*/
	@Override
	public long getPrimaryKey() {
		return _resultadoEvaluacion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this resultado evaluacion.
	*
	* @param primaryKey the primary key of this resultado evaluacion
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_resultadoEvaluacion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the resultado evaluacion ID of this resultado evaluacion.
	*
	* @return the resultado evaluacion ID of this resultado evaluacion
	*/
	@Override
	public long getResultadoEvaluacionId() {
		return _resultadoEvaluacion.getResultadoEvaluacionId();
	}

	/**
	* Sets the resultado evaluacion ID of this resultado evaluacion.
	*
	* @param resultadoEvaluacionId the resultado evaluacion ID of this resultado evaluacion
	*/
	@Override
	public void setResultadoEvaluacionId(long resultadoEvaluacionId) {
		_resultadoEvaluacion.setResultadoEvaluacionId(resultadoEvaluacionId);
	}

	/**
	* Returns the respuesta selccionada of this resultado evaluacion.
	*
	* @return the respuesta selccionada of this resultado evaluacion
	*/
	@Override
	public long getRespuestaSelccionada() {
		return _resultadoEvaluacion.getRespuestaSelccionada();
	}

	/**
	* Sets the respuesta selccionada of this resultado evaluacion.
	*
	* @param respuestaSelccionada the respuesta selccionada of this resultado evaluacion
	*/
	@Override
	public void setRespuestaSelccionada(long respuestaSelccionada) {
		_resultadoEvaluacion.setRespuestaSelccionada(respuestaSelccionada);
	}

	/**
	* Returns the habilidad cumplida of this resultado evaluacion.
	*
	* @return the habilidad cumplida of this resultado evaluacion
	*/
	@Override
	public boolean getHabilidadCumplida() {
		return _resultadoEvaluacion.getHabilidadCumplida();
	}

	/**
	* Returns <code>true</code> if this resultado evaluacion is habilidad cumplida.
	*
	* @return <code>true</code> if this resultado evaluacion is habilidad cumplida; <code>false</code> otherwise
	*/
	@Override
	public boolean isHabilidadCumplida() {
		return _resultadoEvaluacion.isHabilidadCumplida();
	}

	/**
	* Sets whether this resultado evaluacion is habilidad cumplida.
	*
	* @param habilidadCumplida the habilidad cumplida of this resultado evaluacion
	*/
	@Override
	public void setHabilidadCumplida(boolean habilidadCumplida) {
		_resultadoEvaluacion.setHabilidadCumplida(habilidadCumplida);
	}

	/**
	* Returns the evaluacion ID of this resultado evaluacion.
	*
	* @return the evaluacion ID of this resultado evaluacion
	*/
	@Override
	public long getEvaluacionId() {
		return _resultadoEvaluacion.getEvaluacionId();
	}

	/**
	* Sets the evaluacion ID of this resultado evaluacion.
	*
	* @param evaluacionId the evaluacion ID of this resultado evaluacion
	*/
	@Override
	public void setEvaluacionId(long evaluacionId) {
		_resultadoEvaluacion.setEvaluacionId(evaluacionId);
	}

	/**
	* Returns the usuario hitss ID of this resultado evaluacion.
	*
	* @return the usuario hitss ID of this resultado evaluacion
	*/
	@Override
	public long getUsuarioHitssId() {
		return _resultadoEvaluacion.getUsuarioHitssId();
	}

	/**
	* Sets the usuario hitss ID of this resultado evaluacion.
	*
	* @param usuarioHitssId the usuario hitss ID of this resultado evaluacion
	*/
	@Override
	public void setUsuarioHitssId(long usuarioHitssId) {
		_resultadoEvaluacion.setUsuarioHitssId(usuarioHitssId);
	}

	@Override
	public boolean isNew() {
		return _resultadoEvaluacion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_resultadoEvaluacion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _resultadoEvaluacion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_resultadoEvaluacion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _resultadoEvaluacion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _resultadoEvaluacion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_resultadoEvaluacion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _resultadoEvaluacion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_resultadoEvaluacion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_resultadoEvaluacion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_resultadoEvaluacion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ResultadoEvaluacionWrapper((ResultadoEvaluacion)_resultadoEvaluacion.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.ResultadoEvaluacion resultadoEvaluacion) {
		return _resultadoEvaluacion.compareTo(resultadoEvaluacion);
	}

	@Override
	public int hashCode() {
		return _resultadoEvaluacion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.ResultadoEvaluacion> toCacheModel() {
		return _resultadoEvaluacion.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.ResultadoEvaluacion toEscapedModel() {
		return new ResultadoEvaluacionWrapper(_resultadoEvaluacion.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.ResultadoEvaluacion toUnescapedModel() {
		return new ResultadoEvaluacionWrapper(_resultadoEvaluacion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _resultadoEvaluacion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _resultadoEvaluacion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_resultadoEvaluacion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ResultadoEvaluacionWrapper)) {
			return false;
		}

		ResultadoEvaluacionWrapper resultadoEvaluacionWrapper = (ResultadoEvaluacionWrapper)obj;

		if (Validator.equals(_resultadoEvaluacion,
					resultadoEvaluacionWrapper._resultadoEvaluacion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ResultadoEvaluacion getWrappedResultadoEvaluacion() {
		return _resultadoEvaluacion;
	}

	@Override
	public ResultadoEvaluacion getWrappedModel() {
		return _resultadoEvaluacion;
	}

	@Override
	public void resetOriginalValues() {
		_resultadoEvaluacion.resetOriginalValues();
	}

	private ResultadoEvaluacion _resultadoEvaluacion;
}
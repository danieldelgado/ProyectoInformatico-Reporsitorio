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
 * This class is a wrapper for {@link Parametro}.
 * </p>
 *
 * @author Danielle Delgado
 * @see Parametro
 * @generated
 */
public class ParametroWrapper implements Parametro, ModelWrapper<Parametro> {
	public ParametroWrapper(Parametro parametro) {
		_parametro = parametro;
	}

	@Override
	public Class<?> getModelClass() {
		return Parametro.class;
	}

	@Override
	public String getModelClassName() {
		return Parametro.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("parametroId", getParametroId());
		attributes.put("parametroIdpadre", getParametroIdpadre());
		attributes.put("codigo", getCodigo());
		attributes.put("descripcion", getDescripcion());
		attributes.put("valor", getValor());
		attributes.put("tipodato", getTipodato());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long parametroId = (Long)attributes.get("parametroId");

		if (parametroId != null) {
			setParametroId(parametroId);
		}

		Long parametroIdpadre = (Long)attributes.get("parametroIdpadre");

		if (parametroIdpadre != null) {
			setParametroIdpadre(parametroIdpadre);
		}

		String codigo = (String)attributes.get("codigo");

		if (codigo != null) {
			setCodigo(codigo);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String valor = (String)attributes.get("valor");

		if (valor != null) {
			setValor(valor);
		}

		String tipodato = (String)attributes.get("tipodato");

		if (tipodato != null) {
			setTipodato(tipodato);
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
	* Returns the primary key of this parametro.
	*
	* @return the primary key of this parametro
	*/
	@Override
	public long getPrimaryKey() {
		return _parametro.getPrimaryKey();
	}

	/**
	* Sets the primary key of this parametro.
	*
	* @param primaryKey the primary key of this parametro
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_parametro.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the parametro ID of this parametro.
	*
	* @return the parametro ID of this parametro
	*/
	@Override
	public long getParametroId() {
		return _parametro.getParametroId();
	}

	/**
	* Sets the parametro ID of this parametro.
	*
	* @param parametroId the parametro ID of this parametro
	*/
	@Override
	public void setParametroId(long parametroId) {
		_parametro.setParametroId(parametroId);
	}

	/**
	* Returns the parametro idpadre of this parametro.
	*
	* @return the parametro idpadre of this parametro
	*/
	@Override
	public long getParametroIdpadre() {
		return _parametro.getParametroIdpadre();
	}

	/**
	* Sets the parametro idpadre of this parametro.
	*
	* @param parametroIdpadre the parametro idpadre of this parametro
	*/
	@Override
	public void setParametroIdpadre(long parametroIdpadre) {
		_parametro.setParametroIdpadre(parametroIdpadre);
	}

	/**
	* Returns the codigo of this parametro.
	*
	* @return the codigo of this parametro
	*/
	@Override
	public java.lang.String getCodigo() {
		return _parametro.getCodigo();
	}

	/**
	* Sets the codigo of this parametro.
	*
	* @param codigo the codigo of this parametro
	*/
	@Override
	public void setCodigo(java.lang.String codigo) {
		_parametro.setCodigo(codigo);
	}

	/**
	* Returns the descripcion of this parametro.
	*
	* @return the descripcion of this parametro
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _parametro.getDescripcion();
	}

	/**
	* Sets the descripcion of this parametro.
	*
	* @param descripcion the descripcion of this parametro
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_parametro.setDescripcion(descripcion);
	}

	/**
	* Returns the valor of this parametro.
	*
	* @return the valor of this parametro
	*/
	@Override
	public java.lang.String getValor() {
		return _parametro.getValor();
	}

	/**
	* Sets the valor of this parametro.
	*
	* @param valor the valor of this parametro
	*/
	@Override
	public void setValor(java.lang.String valor) {
		_parametro.setValor(valor);
	}

	/**
	* Returns the tipodato of this parametro.
	*
	* @return the tipodato of this parametro
	*/
	@Override
	public java.lang.String getTipodato() {
		return _parametro.getTipodato();
	}

	/**
	* Sets the tipodato of this parametro.
	*
	* @param tipodato the tipodato of this parametro
	*/
	@Override
	public void setTipodato(java.lang.String tipodato) {
		_parametro.setTipodato(tipodato);
	}

	/**
	* Returns the activo of this parametro.
	*
	* @return the activo of this parametro
	*/
	@Override
	public boolean getActivo() {
		return _parametro.getActivo();
	}

	/**
	* Returns <code>true</code> if this parametro is activo.
	*
	* @return <code>true</code> if this parametro is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _parametro.isActivo();
	}

	/**
	* Sets whether this parametro is activo.
	*
	* @param activo the activo of this parametro
	*/
	@Override
	public void setActivo(boolean activo) {
		_parametro.setActivo(activo);
	}

	/**
	* Returns the usuariocrea of this parametro.
	*
	* @return the usuariocrea of this parametro
	*/
	@Override
	public long getUsuariocrea() {
		return _parametro.getUsuariocrea();
	}

	/**
	* Sets the usuariocrea of this parametro.
	*
	* @param usuariocrea the usuariocrea of this parametro
	*/
	@Override
	public void setUsuariocrea(long usuariocrea) {
		_parametro.setUsuariocrea(usuariocrea);
	}

	/**
	* Returns the fechacrea of this parametro.
	*
	* @return the fechacrea of this parametro
	*/
	@Override
	public java.util.Date getFechacrea() {
		return _parametro.getFechacrea();
	}

	/**
	* Sets the fechacrea of this parametro.
	*
	* @param fechacrea the fechacrea of this parametro
	*/
	@Override
	public void setFechacrea(java.util.Date fechacrea) {
		_parametro.setFechacrea(fechacrea);
	}

	/**
	* Returns the usuariomodifica of this parametro.
	*
	* @return the usuariomodifica of this parametro
	*/
	@Override
	public long getUsuariomodifica() {
		return _parametro.getUsuariomodifica();
	}

	/**
	* Sets the usuariomodifica of this parametro.
	*
	* @param usuariomodifica the usuariomodifica of this parametro
	*/
	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_parametro.setUsuariomodifica(usuariomodifica);
	}

	/**
	* Returns the fechamodifica of this parametro.
	*
	* @return the fechamodifica of this parametro
	*/
	@Override
	public java.util.Date getFechamodifica() {
		return _parametro.getFechamodifica();
	}

	/**
	* Sets the fechamodifica of this parametro.
	*
	* @param fechamodifica the fechamodifica of this parametro
	*/
	@Override
	public void setFechamodifica(java.util.Date fechamodifica) {
		_parametro.setFechamodifica(fechamodifica);
	}

	@Override
	public boolean isNew() {
		return _parametro.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_parametro.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _parametro.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_parametro.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _parametro.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _parametro.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_parametro.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _parametro.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_parametro.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_parametro.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_parametro.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ParametroWrapper((Parametro)_parametro.clone());
	}

	@Override
	public int compareTo(com.hitss.layer.model.Parametro parametro) {
		return _parametro.compareTo(parametro);
	}

	@Override
	public int hashCode() {
		return _parametro.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hitss.layer.model.Parametro> toCacheModel() {
		return _parametro.toCacheModel();
	}

	@Override
	public com.hitss.layer.model.Parametro toEscapedModel() {
		return new ParametroWrapper(_parametro.toEscapedModel());
	}

	@Override
	public com.hitss.layer.model.Parametro toUnescapedModel() {
		return new ParametroWrapper(_parametro.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _parametro.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _parametro.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_parametro.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ParametroWrapper)) {
			return false;
		}

		ParametroWrapper parametroWrapper = (ParametroWrapper)obj;

		if (Validator.equals(_parametro, parametroWrapper._parametro)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Parametro getWrappedParametro() {
		return _parametro;
	}

	@Override
	public Parametro getWrappedModel() {
		return _parametro;
	}

	@Override
	public void resetOriginalValues() {
		_parametro.resetOriginalValues();
	}

	private Parametro _parametro;
}
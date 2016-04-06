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
 * This class is a wrapper for {@link nueveCuadrantes}.
 * </p>
 *
 * @author Crossfire
 * @see nueveCuadrantes
 * @generated
 */
public class nueveCuadrantesWrapper implements nueveCuadrantes,
	ModelWrapper<nueveCuadrantes> {
	public nueveCuadrantesWrapper(nueveCuadrantes nueveCuadrantes) {
		_nueveCuadrantes = nueveCuadrantes;
	}

	@Override
	public Class<?> getModelClass() {
		return nueveCuadrantes.class;
	}

	@Override
	public String getModelClassName() {
		return nueveCuadrantes.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("NC_ID", getNC_ID());
		attributes.put("REQ_ESTADO", getREQ_ESTADO());
		attributes.put("REQ_ACTIVO", getREQ_ACTIVO());
		attributes.put("SR_USUARIO_CREA", getSR_USUARIO_CREA());
		attributes.put("SR_FECHA_CREA", getSR_FECHA_CREA());
		attributes.put("SR_USUARIO_MODIFICA", getSR_USUARIO_MODIFICA());
		attributes.put("SR_FECHA_MODIFICA", getSR_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long NC_ID = (Long)attributes.get("NC_ID");

		if (NC_ID != null) {
			setNC_ID(NC_ID);
		}

		String REQ_ESTADO = (String)attributes.get("REQ_ESTADO");

		if (REQ_ESTADO != null) {
			setREQ_ESTADO(REQ_ESTADO);
		}

		String REQ_ACTIVO = (String)attributes.get("REQ_ACTIVO");

		if (REQ_ACTIVO != null) {
			setREQ_ACTIVO(REQ_ACTIVO);
		}

		Long SR_USUARIO_CREA = (Long)attributes.get("SR_USUARIO_CREA");

		if (SR_USUARIO_CREA != null) {
			setSR_USUARIO_CREA(SR_USUARIO_CREA);
		}

		Date SR_FECHA_CREA = (Date)attributes.get("SR_FECHA_CREA");

		if (SR_FECHA_CREA != null) {
			setSR_FECHA_CREA(SR_FECHA_CREA);
		}

		Long SR_USUARIO_MODIFICA = (Long)attributes.get("SR_USUARIO_MODIFICA");

		if (SR_USUARIO_MODIFICA != null) {
			setSR_USUARIO_MODIFICA(SR_USUARIO_MODIFICA);
		}

		Date SR_FECHA_MODIFICA = (Date)attributes.get("SR_FECHA_MODIFICA");

		if (SR_FECHA_MODIFICA != null) {
			setSR_FECHA_MODIFICA(SR_FECHA_MODIFICA);
		}
	}

	/**
	* Returns the primary key of this nueve cuadrantes.
	*
	* @return the primary key of this nueve cuadrantes
	*/
	@Override
	public long getPrimaryKey() {
		return _nueveCuadrantes.getPrimaryKey();
	}

	/**
	* Sets the primary key of this nueve cuadrantes.
	*
	* @param primaryKey the primary key of this nueve cuadrantes
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_nueveCuadrantes.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the n c_ i d of this nueve cuadrantes.
	*
	* @return the n c_ i d of this nueve cuadrantes
	*/
	@Override
	public long getNC_ID() {
		return _nueveCuadrantes.getNC_ID();
	}

	/**
	* Sets the n c_ i d of this nueve cuadrantes.
	*
	* @param NC_ID the n c_ i d of this nueve cuadrantes
	*/
	@Override
	public void setNC_ID(long NC_ID) {
		_nueveCuadrantes.setNC_ID(NC_ID);
	}

	/**
	* Returns the r e q_ e s t a d o of this nueve cuadrantes.
	*
	* @return the r e q_ e s t a d o of this nueve cuadrantes
	*/
	@Override
	public java.lang.String getREQ_ESTADO() {
		return _nueveCuadrantes.getREQ_ESTADO();
	}

	/**
	* Sets the r e q_ e s t a d o of this nueve cuadrantes.
	*
	* @param REQ_ESTADO the r e q_ e s t a d o of this nueve cuadrantes
	*/
	@Override
	public void setREQ_ESTADO(java.lang.String REQ_ESTADO) {
		_nueveCuadrantes.setREQ_ESTADO(REQ_ESTADO);
	}

	/**
	* Returns the r e q_ a c t i v o of this nueve cuadrantes.
	*
	* @return the r e q_ a c t i v o of this nueve cuadrantes
	*/
	@Override
	public java.lang.String getREQ_ACTIVO() {
		return _nueveCuadrantes.getREQ_ACTIVO();
	}

	/**
	* Sets the r e q_ a c t i v o of this nueve cuadrantes.
	*
	* @param REQ_ACTIVO the r e q_ a c t i v o of this nueve cuadrantes
	*/
	@Override
	public void setREQ_ACTIVO(java.lang.String REQ_ACTIVO) {
		_nueveCuadrantes.setREQ_ACTIVO(REQ_ACTIVO);
	}

	/**
	* Returns the s r_ u s u a r i o_ c r e a of this nueve cuadrantes.
	*
	* @return the s r_ u s u a r i o_ c r e a of this nueve cuadrantes
	*/
	@Override
	public long getSR_USUARIO_CREA() {
		return _nueveCuadrantes.getSR_USUARIO_CREA();
	}

	/**
	* Sets the s r_ u s u a r i o_ c r e a of this nueve cuadrantes.
	*
	* @param SR_USUARIO_CREA the s r_ u s u a r i o_ c r e a of this nueve cuadrantes
	*/
	@Override
	public void setSR_USUARIO_CREA(long SR_USUARIO_CREA) {
		_nueveCuadrantes.setSR_USUARIO_CREA(SR_USUARIO_CREA);
	}

	/**
	* Returns the s r_ f e c h a_ c r e a of this nueve cuadrantes.
	*
	* @return the s r_ f e c h a_ c r e a of this nueve cuadrantes
	*/
	@Override
	public java.util.Date getSR_FECHA_CREA() {
		return _nueveCuadrantes.getSR_FECHA_CREA();
	}

	/**
	* Sets the s r_ f e c h a_ c r e a of this nueve cuadrantes.
	*
	* @param SR_FECHA_CREA the s r_ f e c h a_ c r e a of this nueve cuadrantes
	*/
	@Override
	public void setSR_FECHA_CREA(java.util.Date SR_FECHA_CREA) {
		_nueveCuadrantes.setSR_FECHA_CREA(SR_FECHA_CREA);
	}

	/**
	* Returns the s r_ u s u a r i o_ m o d i f i c a of this nueve cuadrantes.
	*
	* @return the s r_ u s u a r i o_ m o d i f i c a of this nueve cuadrantes
	*/
	@Override
	public long getSR_USUARIO_MODIFICA() {
		return _nueveCuadrantes.getSR_USUARIO_MODIFICA();
	}

	/**
	* Sets the s r_ u s u a r i o_ m o d i f i c a of this nueve cuadrantes.
	*
	* @param SR_USUARIO_MODIFICA the s r_ u s u a r i o_ m o d i f i c a of this nueve cuadrantes
	*/
	@Override
	public void setSR_USUARIO_MODIFICA(long SR_USUARIO_MODIFICA) {
		_nueveCuadrantes.setSR_USUARIO_MODIFICA(SR_USUARIO_MODIFICA);
	}

	/**
	* Returns the s r_ f e c h a_ m o d i f i c a of this nueve cuadrantes.
	*
	* @return the s r_ f e c h a_ m o d i f i c a of this nueve cuadrantes
	*/
	@Override
	public java.util.Date getSR_FECHA_MODIFICA() {
		return _nueveCuadrantes.getSR_FECHA_MODIFICA();
	}

	/**
	* Sets the s r_ f e c h a_ m o d i f i c a of this nueve cuadrantes.
	*
	* @param SR_FECHA_MODIFICA the s r_ f e c h a_ m o d i f i c a of this nueve cuadrantes
	*/
	@Override
	public void setSR_FECHA_MODIFICA(java.util.Date SR_FECHA_MODIFICA) {
		_nueveCuadrantes.setSR_FECHA_MODIFICA(SR_FECHA_MODIFICA);
	}

	@Override
	public boolean isNew() {
		return _nueveCuadrantes.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_nueveCuadrantes.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _nueveCuadrantes.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_nueveCuadrantes.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _nueveCuadrantes.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _nueveCuadrantes.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_nueveCuadrantes.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _nueveCuadrantes.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_nueveCuadrantes.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_nueveCuadrantes.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_nueveCuadrantes.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new nueveCuadrantesWrapper((nueveCuadrantes)_nueveCuadrantes.clone());
	}

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.nueveCuadrantes nueveCuadrantes) {
		return _nueveCuadrantes.compareTo(nueveCuadrantes);
	}

	@Override
	public int hashCode() {
		return _nueveCuadrantes.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rec.hitss.layer.model.nueveCuadrantes> toCacheModel() {
		return _nueveCuadrantes.toCacheModel();
	}

	@Override
	public com.rec.hitss.layer.model.nueveCuadrantes toEscapedModel() {
		return new nueveCuadrantesWrapper(_nueveCuadrantes.toEscapedModel());
	}

	@Override
	public com.rec.hitss.layer.model.nueveCuadrantes toUnescapedModel() {
		return new nueveCuadrantesWrapper(_nueveCuadrantes.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _nueveCuadrantes.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _nueveCuadrantes.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_nueveCuadrantes.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof nueveCuadrantesWrapper)) {
			return false;
		}

		nueveCuadrantesWrapper nueveCuadrantesWrapper = (nueveCuadrantesWrapper)obj;

		if (Validator.equals(_nueveCuadrantes,
					nueveCuadrantesWrapper._nueveCuadrantes)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public nueveCuadrantes getWrappednueveCuadrantes() {
		return _nueveCuadrantes;
	}

	@Override
	public nueveCuadrantes getWrappedModel() {
		return _nueveCuadrantes;
	}

	@Override
	public void resetOriginalValues() {
		_nueveCuadrantes.resetOriginalValues();
	}

	private nueveCuadrantes _nueveCuadrantes;
}
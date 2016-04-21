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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the EvaluacionReclutamiento service. Represents a row in the &quot;EVALUACION_RECLUTAMIENTO&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rec.hitss.layer.model.impl.EvaluacionReclutamientoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rec.hitss.layer.model.impl.EvaluacionReclutamientoImpl}.
 * </p>
 *
 * @author Crossfire
 * @see EvaluacionReclutamiento
 * @see com.rec.hitss.layer.model.impl.EvaluacionReclutamientoImpl
 * @see com.rec.hitss.layer.model.impl.EvaluacionReclutamientoModelImpl
 * @generated
 */
public interface EvaluacionReclutamientoModel extends BaseModel<EvaluacionReclutamiento> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a evaluacion reclutamiento model instance should use the {@link EvaluacionReclutamiento} interface instead.
	 */

	/**
	 * Returns the primary key of this evaluacion reclutamiento.
	 *
	 * @return the primary key of this evaluacion reclutamiento
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this evaluacion reclutamiento.
	 *
	 * @param primaryKey the primary key of this evaluacion reclutamiento
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the e r_ i d of this evaluacion reclutamiento.
	 *
	 * @return the e r_ i d of this evaluacion reclutamiento
	 */
	public long getER_ID();

	/**
	 * Sets the e r_ i d of this evaluacion reclutamiento.
	 *
	 * @param ER_ID the e r_ i d of this evaluacion reclutamiento
	 */
	public void setER_ID(long ER_ID);

	/**
	 * Returns the e r_ e s t a d o of this evaluacion reclutamiento.
	 *
	 * @return the e r_ e s t a d o of this evaluacion reclutamiento
	 */
	@AutoEscape
	public String getER_ESTADO();

	/**
	 * Sets the e r_ e s t a d o of this evaluacion reclutamiento.
	 *
	 * @param ER_ESTADO the e r_ e s t a d o of this evaluacion reclutamiento
	 */
	public void setER_ESTADO(String ER_ESTADO);

	/**
	 * Returns the e r_ a c t i v o of this evaluacion reclutamiento.
	 *
	 * @return the e r_ a c t i v o of this evaluacion reclutamiento
	 */
	@AutoEscape
	public String getER_ACTIVO();

	/**
	 * Sets the e r_ a c t i v o of this evaluacion reclutamiento.
	 *
	 * @param ER_ACTIVO the e r_ a c t i v o of this evaluacion reclutamiento
	 */
	public void setER_ACTIVO(String ER_ACTIVO);

	/**
	 * Returns the e r_ u s u a r i o_ c r e a of this evaluacion reclutamiento.
	 *
	 * @return the e r_ u s u a r i o_ c r e a of this evaluacion reclutamiento
	 */
	public long getER_USUARIO_CREA();

	/**
	 * Sets the e r_ u s u a r i o_ c r e a of this evaluacion reclutamiento.
	 *
	 * @param ER_USUARIO_CREA the e r_ u s u a r i o_ c r e a of this evaluacion reclutamiento
	 */
	public void setER_USUARIO_CREA(long ER_USUARIO_CREA);

	/**
	 * Returns the e r_ f e c h a_ c r e a of this evaluacion reclutamiento.
	 *
	 * @return the e r_ f e c h a_ c r e a of this evaluacion reclutamiento
	 */
	public Date getER_FECHA_CREA();

	/**
	 * Sets the e r_ f e c h a_ c r e a of this evaluacion reclutamiento.
	 *
	 * @param ER_FECHA_CREA the e r_ f e c h a_ c r e a of this evaluacion reclutamiento
	 */
	public void setER_FECHA_CREA(Date ER_FECHA_CREA);

	/**
	 * Returns the e r_ u s u a r i o_ m o d i f i c a of this evaluacion reclutamiento.
	 *
	 * @return the e r_ u s u a r i o_ m o d i f i c a of this evaluacion reclutamiento
	 */
	public long getER_USUARIO_MODIFICA();

	/**
	 * Sets the e r_ u s u a r i o_ m o d i f i c a of this evaluacion reclutamiento.
	 *
	 * @param ER_USUARIO_MODIFICA the e r_ u s u a r i o_ m o d i f i c a of this evaluacion reclutamiento
	 */
	public void setER_USUARIO_MODIFICA(long ER_USUARIO_MODIFICA);

	/**
	 * Returns the e r_ f e c h a_ m o d i f i c a of this evaluacion reclutamiento.
	 *
	 * @return the e r_ f e c h a_ m o d i f i c a of this evaluacion reclutamiento
	 */
	public Date getER_FECHA_MODIFICA();

	/**
	 * Sets the e r_ f e c h a_ m o d i f i c a of this evaluacion reclutamiento.
	 *
	 * @param ER_FECHA_MODIFICA the e r_ f e c h a_ m o d i f i c a of this evaluacion reclutamiento
	 */
	public void setER_FECHA_MODIFICA(Date ER_FECHA_MODIFICA);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.EvaluacionReclutamiento evaluacionReclutamiento);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rec.hitss.layer.model.EvaluacionReclutamiento> toCacheModel();

	@Override
	public com.rec.hitss.layer.model.EvaluacionReclutamiento toEscapedModel();

	@Override
	public com.rec.hitss.layer.model.EvaluacionReclutamiento toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
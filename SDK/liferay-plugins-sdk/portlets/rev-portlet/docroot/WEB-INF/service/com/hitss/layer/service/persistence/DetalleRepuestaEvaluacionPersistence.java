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

package com.hitss.layer.service.persistence;

import com.hitss.layer.model.DetalleRepuestaEvaluacion;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the detalle repuesta evaluacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see DetalleRepuestaEvaluacionPersistenceImpl
 * @see DetalleRepuestaEvaluacionUtil
 * @generated
 */
public interface DetalleRepuestaEvaluacionPersistence extends BasePersistence<DetalleRepuestaEvaluacion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DetalleRepuestaEvaluacionUtil} to access the detalle repuesta evaluacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the detalle repuesta evaluacion in the entity cache if it is enabled.
	*
	* @param detalleRepuestaEvaluacion the detalle repuesta evaluacion
	*/
	public void cacheResult(
		com.hitss.layer.model.DetalleRepuestaEvaluacion detalleRepuestaEvaluacion);

	/**
	* Caches the detalle repuesta evaluacions in the entity cache if it is enabled.
	*
	* @param detalleRepuestaEvaluacions the detalle repuesta evaluacions
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.DetalleRepuestaEvaluacion> detalleRepuestaEvaluacions);

	/**
	* Creates a new detalle repuesta evaluacion with the primary key. Does not add the detalle repuesta evaluacion to the database.
	*
	* @param detalleRepuestaEvaluacionPK the primary key for the new detalle repuesta evaluacion
	* @return the new detalle repuesta evaluacion
	*/
	public com.hitss.layer.model.DetalleRepuestaEvaluacion create(
		com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK detalleRepuestaEvaluacionPK);

	/**
	* Removes the detalle repuesta evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param detalleRepuestaEvaluacionPK the primary key of the detalle repuesta evaluacion
	* @return the detalle repuesta evaluacion that was removed
	* @throws com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException if a detalle repuesta evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.DetalleRepuestaEvaluacion remove(
		com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK detalleRepuestaEvaluacionPK)
		throws com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.DetalleRepuestaEvaluacion updateImpl(
		com.hitss.layer.model.DetalleRepuestaEvaluacion detalleRepuestaEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the detalle repuesta evaluacion with the primary key or throws a {@link com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException} if it could not be found.
	*
	* @param detalleRepuestaEvaluacionPK the primary key of the detalle repuesta evaluacion
	* @return the detalle repuesta evaluacion
	* @throws com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException if a detalle repuesta evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.DetalleRepuestaEvaluacion findByPrimaryKey(
		com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK detalleRepuestaEvaluacionPK)
		throws com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the detalle repuesta evaluacion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param detalleRepuestaEvaluacionPK the primary key of the detalle repuesta evaluacion
	* @return the detalle repuesta evaluacion, or <code>null</code> if a detalle repuesta evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.DetalleRepuestaEvaluacion fetchByPrimaryKey(
		com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK detalleRepuestaEvaluacionPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the detalle repuesta evaluacions.
	*
	* @return the detalle repuesta evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.DetalleRepuestaEvaluacion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the detalle repuesta evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.DetalleRepuestaEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of detalle repuesta evaluacions
	* @param end the upper bound of the range of detalle repuesta evaluacions (not inclusive)
	* @return the range of detalle repuesta evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.DetalleRepuestaEvaluacion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the detalle repuesta evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.DetalleRepuestaEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of detalle repuesta evaluacions
	* @param end the upper bound of the range of detalle repuesta evaluacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of detalle repuesta evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.DetalleRepuestaEvaluacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the detalle repuesta evaluacions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of detalle repuesta evaluacions.
	*
	* @return the number of detalle repuesta evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
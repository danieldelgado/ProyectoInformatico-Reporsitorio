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

package com.rec.hitss.layer.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento;

/**
 * The persistence interface for the avance estado solicitud reclutamiento service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see avanceEstadoSolicitudReclutamientoPersistenceImpl
 * @see avanceEstadoSolicitudReclutamientoUtil
 * @generated
 */
public interface avanceEstadoSolicitudReclutamientoPersistence
	extends BasePersistence<avanceEstadoSolicitudReclutamiento> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link avanceEstadoSolicitudReclutamientoUtil} to access the avance estado solicitud reclutamiento persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the avance estado solicitud reclutamiento in the entity cache if it is enabled.
	*
	* @param avanceEstadoSolicitudReclutamiento the avance estado solicitud reclutamiento
	*/
	public void cacheResult(
		com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento avanceEstadoSolicitudReclutamiento);

	/**
	* Caches the avance estado solicitud reclutamientos in the entity cache if it is enabled.
	*
	* @param avanceEstadoSolicitudReclutamientos the avance estado solicitud reclutamientos
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento> avanceEstadoSolicitudReclutamientos);

	/**
	* Creates a new avance estado solicitud reclutamiento with the primary key. Does not add the avance estado solicitud reclutamiento to the database.
	*
	* @param AESR_ID the primary key for the new avance estado solicitud reclutamiento
	* @return the new avance estado solicitud reclutamiento
	*/
	public com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento create(
		long AESR_ID);

	/**
	* Removes the avance estado solicitud reclutamiento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param AESR_ID the primary key of the avance estado solicitud reclutamiento
	* @return the avance estado solicitud reclutamiento that was removed
	* @throws com.rec.hitss.layer.NoSuchavanceEstadoSolicitudReclutamientoException if a avance estado solicitud reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento remove(
		long AESR_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchavanceEstadoSolicitudReclutamientoException;

	public com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento updateImpl(
		com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento avanceEstadoSolicitudReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the avance estado solicitud reclutamiento with the primary key or throws a {@link com.rec.hitss.layer.NoSuchavanceEstadoSolicitudReclutamientoException} if it could not be found.
	*
	* @param AESR_ID the primary key of the avance estado solicitud reclutamiento
	* @return the avance estado solicitud reclutamiento
	* @throws com.rec.hitss.layer.NoSuchavanceEstadoSolicitudReclutamientoException if a avance estado solicitud reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento findByPrimaryKey(
		long AESR_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchavanceEstadoSolicitudReclutamientoException;

	/**
	* Returns the avance estado solicitud reclutamiento with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param AESR_ID the primary key of the avance estado solicitud reclutamiento
	* @return the avance estado solicitud reclutamiento, or <code>null</code> if a avance estado solicitud reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento fetchByPrimaryKey(
		long AESR_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the avance estado solicitud reclutamientos.
	*
	* @return the avance estado solicitud reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the avance estado solicitud reclutamientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.avanceEstadoSolicitudReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of avance estado solicitud reclutamientos
	* @param end the upper bound of the range of avance estado solicitud reclutamientos (not inclusive)
	* @return the range of avance estado solicitud reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the avance estado solicitud reclutamientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.avanceEstadoSolicitudReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of avance estado solicitud reclutamientos
	* @param end the upper bound of the range of avance estado solicitud reclutamientos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of avance estado solicitud reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the avance estado solicitud reclutamientos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of avance estado solicitud reclutamientos.
	*
	* @return the number of avance estado solicitud reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
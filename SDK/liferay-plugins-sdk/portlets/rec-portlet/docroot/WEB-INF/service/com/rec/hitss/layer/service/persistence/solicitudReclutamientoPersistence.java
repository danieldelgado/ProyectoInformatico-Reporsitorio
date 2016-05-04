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

import com.rec.hitss.layer.model.solicitudReclutamiento;

/**
 * The persistence interface for the solicitud reclutamiento service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see solicitudReclutamientoPersistenceImpl
 * @see solicitudReclutamientoUtil
 * @generated
 */
public interface solicitudReclutamientoPersistence extends BasePersistence<solicitudReclutamiento> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link solicitudReclutamientoUtil} to access the solicitud reclutamiento persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the solicitud reclutamiento in the entity cache if it is enabled.
	*
	* @param solicitudReclutamiento the solicitud reclutamiento
	*/
	public void cacheResult(
		com.rec.hitss.layer.model.solicitudReclutamiento solicitudReclutamiento);

	/**
	* Caches the solicitud reclutamientos in the entity cache if it is enabled.
	*
	* @param solicitudReclutamientos the solicitud reclutamientos
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.solicitudReclutamiento> solicitudReclutamientos);

	/**
	* Creates a new solicitud reclutamiento with the primary key. Does not add the solicitud reclutamiento to the database.
	*
	* @param SR_ID the primary key for the new solicitud reclutamiento
	* @return the new solicitud reclutamiento
	*/
	public com.rec.hitss.layer.model.solicitudReclutamiento create(long SR_ID);

	/**
	* Removes the solicitud reclutamiento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SR_ID the primary key of the solicitud reclutamiento
	* @return the solicitud reclutamiento that was removed
	* @throws com.rec.hitss.layer.NoSuchsolicitudReclutamientoException if a solicitud reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.solicitudReclutamiento remove(long SR_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchsolicitudReclutamientoException;

	public com.rec.hitss.layer.model.solicitudReclutamiento updateImpl(
		com.rec.hitss.layer.model.solicitudReclutamiento solicitudReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the solicitud reclutamiento with the primary key or throws a {@link com.rec.hitss.layer.NoSuchsolicitudReclutamientoException} if it could not be found.
	*
	* @param SR_ID the primary key of the solicitud reclutamiento
	* @return the solicitud reclutamiento
	* @throws com.rec.hitss.layer.NoSuchsolicitudReclutamientoException if a solicitud reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.solicitudReclutamiento findByPrimaryKey(
		long SR_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchsolicitudReclutamientoException;

	/**
	* Returns the solicitud reclutamiento with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SR_ID the primary key of the solicitud reclutamiento
	* @return the solicitud reclutamiento, or <code>null</code> if a solicitud reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.solicitudReclutamiento fetchByPrimaryKey(
		long SR_ID) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the solicitud reclutamientos.
	*
	* @return the solicitud reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.solicitudReclutamiento> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the solicitud reclutamientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.solicitudReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud reclutamientos
	* @param end the upper bound of the range of solicitud reclutamientos (not inclusive)
	* @return the range of solicitud reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.solicitudReclutamiento> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the solicitud reclutamientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.solicitudReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud reclutamientos
	* @param end the upper bound of the range of solicitud reclutamientos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of solicitud reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.solicitudReclutamiento> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud reclutamientos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud reclutamientos.
	*
	* @return the number of solicitud reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
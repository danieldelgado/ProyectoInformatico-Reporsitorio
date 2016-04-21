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

import com.rec.hitss.layer.model.SolicitudRequerimientoPersonal;

/**
 * The persistence interface for the solicitud requerimiento personal service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see SolicitudRequerimientoPersonalPersistenceImpl
 * @see SolicitudRequerimientoPersonalUtil
 * @generated
 */
public interface SolicitudRequerimientoPersonalPersistence
	extends BasePersistence<SolicitudRequerimientoPersonal> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SolicitudRequerimientoPersonalUtil} to access the solicitud requerimiento personal persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the solicitud requerimiento personal in the entity cache if it is enabled.
	*
	* @param solicitudRequerimientoPersonal the solicitud requerimiento personal
	*/
	public void cacheResult(
		com.rec.hitss.layer.model.SolicitudRequerimientoPersonal solicitudRequerimientoPersonal);

	/**
	* Caches the solicitud requerimiento personals in the entity cache if it is enabled.
	*
	* @param solicitudRequerimientoPersonals the solicitud requerimiento personals
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.SolicitudRequerimientoPersonal> solicitudRequerimientoPersonals);

	/**
	* Creates a new solicitud requerimiento personal with the primary key. Does not add the solicitud requerimiento personal to the database.
	*
	* @param solicitudRequerimientoPersonalId the primary key for the new solicitud requerimiento personal
	* @return the new solicitud requerimiento personal
	*/
	public com.rec.hitss.layer.model.SolicitudRequerimientoPersonal create(
		long solicitudRequerimientoPersonalId);

	/**
	* Removes the solicitud requerimiento personal with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoPersonalId the primary key of the solicitud requerimiento personal
	* @return the solicitud requerimiento personal that was removed
	* @throws com.rec.hitss.layer.NoSuchSolicitudRequerimientoPersonalException if a solicitud requerimiento personal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.SolicitudRequerimientoPersonal remove(
		long solicitudRequerimientoPersonalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchSolicitudRequerimientoPersonalException;

	public com.rec.hitss.layer.model.SolicitudRequerimientoPersonal updateImpl(
		com.rec.hitss.layer.model.SolicitudRequerimientoPersonal solicitudRequerimientoPersonal)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the solicitud requerimiento personal with the primary key or throws a {@link com.rec.hitss.layer.NoSuchSolicitudRequerimientoPersonalException} if it could not be found.
	*
	* @param solicitudRequerimientoPersonalId the primary key of the solicitud requerimiento personal
	* @return the solicitud requerimiento personal
	* @throws com.rec.hitss.layer.NoSuchSolicitudRequerimientoPersonalException if a solicitud requerimiento personal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.SolicitudRequerimientoPersonal findByPrimaryKey(
		long solicitudRequerimientoPersonalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchSolicitudRequerimientoPersonalException;

	/**
	* Returns the solicitud requerimiento personal with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param solicitudRequerimientoPersonalId the primary key of the solicitud requerimiento personal
	* @return the solicitud requerimiento personal, or <code>null</code> if a solicitud requerimiento personal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.SolicitudRequerimientoPersonal fetchByPrimaryKey(
		long solicitudRequerimientoPersonalId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the solicitud requerimiento personals.
	*
	* @return the solicitud requerimiento personals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.SolicitudRequerimientoPersonal> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the solicitud requerimiento personals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud requerimiento personals
	* @param end the upper bound of the range of solicitud requerimiento personals (not inclusive)
	* @return the range of solicitud requerimiento personals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.SolicitudRequerimientoPersonal> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the solicitud requerimiento personals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud requerimiento personals
	* @param end the upper bound of the range of solicitud requerimiento personals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of solicitud requerimiento personals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.SolicitudRequerimientoPersonal> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud requerimiento personals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud requerimiento personals.
	*
	* @return the number of solicitud requerimiento personals
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
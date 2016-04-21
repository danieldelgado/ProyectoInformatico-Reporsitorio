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

import com.rec.hitss.layer.model.requerimientoPersonal;

/**
 * The persistence interface for the requerimiento personal service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see requerimientoPersonalPersistenceImpl
 * @see requerimientoPersonalUtil
 * @generated
 */
public interface requerimientoPersonalPersistence extends BasePersistence<requerimientoPersonal> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link requerimientoPersonalUtil} to access the requerimiento personal persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the requerimiento personal in the entity cache if it is enabled.
	*
	* @param requerimientoPersonal the requerimiento personal
	*/
	public void cacheResult(
		com.rec.hitss.layer.model.requerimientoPersonal requerimientoPersonal);

	/**
	* Caches the requerimiento personals in the entity cache if it is enabled.
	*
	* @param requerimientoPersonals the requerimiento personals
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.requerimientoPersonal> requerimientoPersonals);

	/**
	* Creates a new requerimiento personal with the primary key. Does not add the requerimiento personal to the database.
	*
	* @param REQ_ID the primary key for the new requerimiento personal
	* @return the new requerimiento personal
	*/
	public com.rec.hitss.layer.model.requerimientoPersonal create(long REQ_ID);

	/**
	* Removes the requerimiento personal with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param REQ_ID the primary key of the requerimiento personal
	* @return the requerimiento personal that was removed
	* @throws com.rec.hitss.layer.NoSuchrequerimientoPersonalException if a requerimiento personal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.requerimientoPersonal remove(long REQ_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchrequerimientoPersonalException;

	public com.rec.hitss.layer.model.requerimientoPersonal updateImpl(
		com.rec.hitss.layer.model.requerimientoPersonal requerimientoPersonal)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the requerimiento personal with the primary key or throws a {@link com.rec.hitss.layer.NoSuchrequerimientoPersonalException} if it could not be found.
	*
	* @param REQ_ID the primary key of the requerimiento personal
	* @return the requerimiento personal
	* @throws com.rec.hitss.layer.NoSuchrequerimientoPersonalException if a requerimiento personal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.requerimientoPersonal findByPrimaryKey(
		long REQ_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchrequerimientoPersonalException;

	/**
	* Returns the requerimiento personal with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param REQ_ID the primary key of the requerimiento personal
	* @return the requerimiento personal, or <code>null</code> if a requerimiento personal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.requerimientoPersonal fetchByPrimaryKey(
		long REQ_ID) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the requerimiento personals.
	*
	* @return the requerimiento personals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.requerimientoPersonal> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the requerimiento personals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.requerimientoPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of requerimiento personals
	* @param end the upper bound of the range of requerimiento personals (not inclusive)
	* @return the range of requerimiento personals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.requerimientoPersonal> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the requerimiento personals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.requerimientoPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of requerimiento personals
	* @param end the upper bound of the range of requerimiento personals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of requerimiento personals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.requerimientoPersonal> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the requerimiento personals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of requerimiento personals.
	*
	* @return the number of requerimiento personals
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
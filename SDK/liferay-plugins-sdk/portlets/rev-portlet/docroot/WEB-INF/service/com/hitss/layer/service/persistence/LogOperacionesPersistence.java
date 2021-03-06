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

import com.hitss.layer.model.LogOperaciones;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the log operaciones service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see LogOperacionesPersistenceImpl
 * @see LogOperacionesUtil
 * @generated
 */
public interface LogOperacionesPersistence extends BasePersistence<LogOperaciones> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LogOperacionesUtil} to access the log operaciones persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the log operaciones in the entity cache if it is enabled.
	*
	* @param logOperaciones the log operaciones
	*/
	public void cacheResult(com.hitss.layer.model.LogOperaciones logOperaciones);

	/**
	* Caches the log operacioneses in the entity cache if it is enabled.
	*
	* @param logOperacioneses the log operacioneses
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.LogOperaciones> logOperacioneses);

	/**
	* Creates a new log operaciones with the primary key. Does not add the log operaciones to the database.
	*
	* @param logOperacionesId the primary key for the new log operaciones
	* @return the new log operaciones
	*/
	public com.hitss.layer.model.LogOperaciones create(long logOperacionesId);

	/**
	* Removes the log operaciones with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param logOperacionesId the primary key of the log operaciones
	* @return the log operaciones that was removed
	* @throws com.hitss.layer.NoSuchLogOperacionesException if a log operaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.LogOperaciones remove(long logOperacionesId)
		throws com.hitss.layer.NoSuchLogOperacionesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.LogOperaciones updateImpl(
		com.hitss.layer.model.LogOperaciones logOperaciones)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the log operaciones with the primary key or throws a {@link com.hitss.layer.NoSuchLogOperacionesException} if it could not be found.
	*
	* @param logOperacionesId the primary key of the log operaciones
	* @return the log operaciones
	* @throws com.hitss.layer.NoSuchLogOperacionesException if a log operaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.LogOperaciones findByPrimaryKey(
		long logOperacionesId)
		throws com.hitss.layer.NoSuchLogOperacionesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the log operaciones with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param logOperacionesId the primary key of the log operaciones
	* @return the log operaciones, or <code>null</code> if a log operaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.LogOperaciones fetchByPrimaryKey(
		long logOperacionesId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the log operacioneses.
	*
	* @return the log operacioneses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.LogOperaciones> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the log operacioneses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.LogOperacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of log operacioneses
	* @param end the upper bound of the range of log operacioneses (not inclusive)
	* @return the range of log operacioneses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.LogOperaciones> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the log operacioneses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.LogOperacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of log operacioneses
	* @param end the upper bound of the range of log operacioneses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of log operacioneses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.LogOperaciones> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the log operacioneses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of log operacioneses.
	*
	* @return the number of log operacioneses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
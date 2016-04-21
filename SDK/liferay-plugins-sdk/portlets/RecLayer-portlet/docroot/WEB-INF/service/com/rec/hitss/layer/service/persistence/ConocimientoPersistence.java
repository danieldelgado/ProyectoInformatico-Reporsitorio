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

import com.rec.hitss.layer.model.Conocimiento;

/**
 * The persistence interface for the conocimiento service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see ConocimientoPersistenceImpl
 * @see ConocimientoUtil
 * @generated
 */
public interface ConocimientoPersistence extends BasePersistence<Conocimiento> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConocimientoUtil} to access the conocimiento persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the conocimiento in the entity cache if it is enabled.
	*
	* @param conocimiento the conocimiento
	*/
	public void cacheResult(com.rec.hitss.layer.model.Conocimiento conocimiento);

	/**
	* Caches the conocimientos in the entity cache if it is enabled.
	*
	* @param conocimientos the conocimientos
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.Conocimiento> conocimientos);

	/**
	* Creates a new conocimiento with the primary key. Does not add the conocimiento to the database.
	*
	* @param conocimientoId the primary key for the new conocimiento
	* @return the new conocimiento
	*/
	public com.rec.hitss.layer.model.Conocimiento create(long conocimientoId);

	/**
	* Removes the conocimiento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param conocimientoId the primary key of the conocimiento
	* @return the conocimiento that was removed
	* @throws com.rec.hitss.layer.NoSuchConocimientoException if a conocimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Conocimiento remove(long conocimientoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchConocimientoException;

	public com.rec.hitss.layer.model.Conocimiento updateImpl(
		com.rec.hitss.layer.model.Conocimiento conocimiento)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the conocimiento with the primary key or throws a {@link com.rec.hitss.layer.NoSuchConocimientoException} if it could not be found.
	*
	* @param conocimientoId the primary key of the conocimiento
	* @return the conocimiento
	* @throws com.rec.hitss.layer.NoSuchConocimientoException if a conocimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Conocimiento findByPrimaryKey(
		long conocimientoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchConocimientoException;

	/**
	* Returns the conocimiento with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param conocimientoId the primary key of the conocimiento
	* @return the conocimiento, or <code>null</code> if a conocimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Conocimiento fetchByPrimaryKey(
		long conocimientoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the conocimientos.
	*
	* @return the conocimientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Conocimiento> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the conocimientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ConocimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of conocimientos
	* @param end the upper bound of the range of conocimientos (not inclusive)
	* @return the range of conocimientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Conocimiento> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the conocimientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ConocimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of conocimientos
	* @param end the upper bound of the range of conocimientos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of conocimientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Conocimiento> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the conocimientos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of conocimientos.
	*
	* @return the number of conocimientos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
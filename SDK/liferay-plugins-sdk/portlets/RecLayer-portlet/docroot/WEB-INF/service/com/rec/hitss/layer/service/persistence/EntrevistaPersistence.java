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

import com.rec.hitss.layer.model.Entrevista;

/**
 * The persistence interface for the entrevista service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see EntrevistaPersistenceImpl
 * @see EntrevistaUtil
 * @generated
 */
public interface EntrevistaPersistence extends BasePersistence<Entrevista> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EntrevistaUtil} to access the entrevista persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the entrevista in the entity cache if it is enabled.
	*
	* @param entrevista the entrevista
	*/
	public void cacheResult(com.rec.hitss.layer.model.Entrevista entrevista);

	/**
	* Caches the entrevistas in the entity cache if it is enabled.
	*
	* @param entrevistas the entrevistas
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.Entrevista> entrevistas);

	/**
	* Creates a new entrevista with the primary key. Does not add the entrevista to the database.
	*
	* @param entrevistaId the primary key for the new entrevista
	* @return the new entrevista
	*/
	public com.rec.hitss.layer.model.Entrevista create(long entrevistaId);

	/**
	* Removes the entrevista with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entrevistaId the primary key of the entrevista
	* @return the entrevista that was removed
	* @throws com.rec.hitss.layer.NoSuchEntrevistaException if a entrevista with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Entrevista remove(long entrevistaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchEntrevistaException;

	public com.rec.hitss.layer.model.Entrevista updateImpl(
		com.rec.hitss.layer.model.Entrevista entrevista)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the entrevista with the primary key or throws a {@link com.rec.hitss.layer.NoSuchEntrevistaException} if it could not be found.
	*
	* @param entrevistaId the primary key of the entrevista
	* @return the entrevista
	* @throws com.rec.hitss.layer.NoSuchEntrevistaException if a entrevista with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Entrevista findByPrimaryKey(
		long entrevistaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchEntrevistaException;

	/**
	* Returns the entrevista with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entrevistaId the primary key of the entrevista
	* @return the entrevista, or <code>null</code> if a entrevista with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Entrevista fetchByPrimaryKey(
		long entrevistaId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the entrevistas.
	*
	* @return the entrevistas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Entrevista> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the entrevistas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EntrevistaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of entrevistas
	* @param end the upper bound of the range of entrevistas (not inclusive)
	* @return the range of entrevistas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Entrevista> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the entrevistas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EntrevistaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of entrevistas
	* @param end the upper bound of the range of entrevistas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of entrevistas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Entrevista> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the entrevistas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of entrevistas.
	*
	* @return the number of entrevistas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
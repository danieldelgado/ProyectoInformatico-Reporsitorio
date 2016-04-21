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

import com.rec.hitss.layer.model.Funcion;

/**
 * The persistence interface for the funcion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see FuncionPersistenceImpl
 * @see FuncionUtil
 * @generated
 */
public interface FuncionPersistence extends BasePersistence<Funcion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FuncionUtil} to access the funcion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the funcion in the entity cache if it is enabled.
	*
	* @param funcion the funcion
	*/
	public void cacheResult(com.rec.hitss.layer.model.Funcion funcion);

	/**
	* Caches the funcions in the entity cache if it is enabled.
	*
	* @param funcions the funcions
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.Funcion> funcions);

	/**
	* Creates a new funcion with the primary key. Does not add the funcion to the database.
	*
	* @param funcionId the primary key for the new funcion
	* @return the new funcion
	*/
	public com.rec.hitss.layer.model.Funcion create(long funcionId);

	/**
	* Removes the funcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param funcionId the primary key of the funcion
	* @return the funcion that was removed
	* @throws com.rec.hitss.layer.NoSuchFuncionException if a funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Funcion remove(long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchFuncionException;

	public com.rec.hitss.layer.model.Funcion updateImpl(
		com.rec.hitss.layer.model.Funcion funcion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the funcion with the primary key or throws a {@link com.rec.hitss.layer.NoSuchFuncionException} if it could not be found.
	*
	* @param funcionId the primary key of the funcion
	* @return the funcion
	* @throws com.rec.hitss.layer.NoSuchFuncionException if a funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Funcion findByPrimaryKey(long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchFuncionException;

	/**
	* Returns the funcion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param funcionId the primary key of the funcion
	* @return the funcion, or <code>null</code> if a funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Funcion fetchByPrimaryKey(long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the funcions.
	*
	* @return the funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Funcion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the funcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of funcions
	* @param end the upper bound of the range of funcions (not inclusive)
	* @return the range of funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Funcion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the funcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of funcions
	* @param end the upper bound of the range of funcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Funcion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the funcions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of funcions.
	*
	* @return the number of funcions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
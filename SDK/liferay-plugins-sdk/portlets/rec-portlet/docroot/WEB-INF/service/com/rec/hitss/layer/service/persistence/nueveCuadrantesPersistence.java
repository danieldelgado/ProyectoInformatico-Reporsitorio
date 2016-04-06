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

import com.rec.hitss.layer.model.nueveCuadrantes;

/**
 * The persistence interface for the nueve cuadrantes service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see nueveCuadrantesPersistenceImpl
 * @see nueveCuadrantesUtil
 * @generated
 */
public interface nueveCuadrantesPersistence extends BasePersistence<nueveCuadrantes> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link nueveCuadrantesUtil} to access the nueve cuadrantes persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the nueve cuadrantes in the entity cache if it is enabled.
	*
	* @param nueveCuadrantes the nueve cuadrantes
	*/
	public void cacheResult(
		com.rec.hitss.layer.model.nueveCuadrantes nueveCuadrantes);

	/**
	* Caches the nueve cuadranteses in the entity cache if it is enabled.
	*
	* @param nueveCuadranteses the nueve cuadranteses
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.nueveCuadrantes> nueveCuadranteses);

	/**
	* Creates a new nueve cuadrantes with the primary key. Does not add the nueve cuadrantes to the database.
	*
	* @param NC_ID the primary key for the new nueve cuadrantes
	* @return the new nueve cuadrantes
	*/
	public com.rec.hitss.layer.model.nueveCuadrantes create(long NC_ID);

	/**
	* Removes the nueve cuadrantes with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param NC_ID the primary key of the nueve cuadrantes
	* @return the nueve cuadrantes that was removed
	* @throws com.rec.hitss.layer.NoSuchnueveCuadrantesException if a nueve cuadrantes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.nueveCuadrantes remove(long NC_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchnueveCuadrantesException;

	public com.rec.hitss.layer.model.nueveCuadrantes updateImpl(
		com.rec.hitss.layer.model.nueveCuadrantes nueveCuadrantes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the nueve cuadrantes with the primary key or throws a {@link com.rec.hitss.layer.NoSuchnueveCuadrantesException} if it could not be found.
	*
	* @param NC_ID the primary key of the nueve cuadrantes
	* @return the nueve cuadrantes
	* @throws com.rec.hitss.layer.NoSuchnueveCuadrantesException if a nueve cuadrantes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.nueveCuadrantes findByPrimaryKey(
		long NC_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchnueveCuadrantesException;

	/**
	* Returns the nueve cuadrantes with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param NC_ID the primary key of the nueve cuadrantes
	* @return the nueve cuadrantes, or <code>null</code> if a nueve cuadrantes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.nueveCuadrantes fetchByPrimaryKey(
		long NC_ID) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the nueve cuadranteses.
	*
	* @return the nueve cuadranteses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.nueveCuadrantes> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the nueve cuadranteses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.nueveCuadrantesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nueve cuadranteses
	* @param end the upper bound of the range of nueve cuadranteses (not inclusive)
	* @return the range of nueve cuadranteses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.nueveCuadrantes> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the nueve cuadranteses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.nueveCuadrantesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nueve cuadranteses
	* @param end the upper bound of the range of nueve cuadranteses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nueve cuadranteses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.nueveCuadrantes> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the nueve cuadranteses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of nueve cuadranteses.
	*
	* @return the number of nueve cuadranteses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
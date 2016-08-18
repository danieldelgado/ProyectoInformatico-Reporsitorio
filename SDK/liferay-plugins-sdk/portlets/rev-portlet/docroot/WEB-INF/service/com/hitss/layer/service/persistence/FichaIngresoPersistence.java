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

import com.hitss.layer.model.FichaIngreso;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the ficha ingreso service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see FichaIngresoPersistenceImpl
 * @see FichaIngresoUtil
 * @generated
 */
public interface FichaIngresoPersistence extends BasePersistence<FichaIngreso> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FichaIngresoUtil} to access the ficha ingreso persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the ficha ingreso in the entity cache if it is enabled.
	*
	* @param fichaIngreso the ficha ingreso
	*/
	public void cacheResult(com.hitss.layer.model.FichaIngreso fichaIngreso);

	/**
	* Caches the ficha ingresos in the entity cache if it is enabled.
	*
	* @param fichaIngresos the ficha ingresos
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.FichaIngreso> fichaIngresos);

	/**
	* Creates a new ficha ingreso with the primary key. Does not add the ficha ingreso to the database.
	*
	* @param fichaIngresoPK the primary key for the new ficha ingreso
	* @return the new ficha ingreso
	*/
	public com.hitss.layer.model.FichaIngreso create(
		com.hitss.layer.service.persistence.FichaIngresoPK fichaIngresoPK);

	/**
	* Removes the ficha ingreso with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fichaIngresoPK the primary key of the ficha ingreso
	* @return the ficha ingreso that was removed
	* @throws com.hitss.layer.NoSuchFichaIngresoException if a ficha ingreso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.FichaIngreso remove(
		com.hitss.layer.service.persistence.FichaIngresoPK fichaIngresoPK)
		throws com.hitss.layer.NoSuchFichaIngresoException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.FichaIngreso updateImpl(
		com.hitss.layer.model.FichaIngreso fichaIngreso)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ficha ingreso with the primary key or throws a {@link com.hitss.layer.NoSuchFichaIngresoException} if it could not be found.
	*
	* @param fichaIngresoPK the primary key of the ficha ingreso
	* @return the ficha ingreso
	* @throws com.hitss.layer.NoSuchFichaIngresoException if a ficha ingreso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.FichaIngreso findByPrimaryKey(
		com.hitss.layer.service.persistence.FichaIngresoPK fichaIngresoPK)
		throws com.hitss.layer.NoSuchFichaIngresoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ficha ingreso with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fichaIngresoPK the primary key of the ficha ingreso
	* @return the ficha ingreso, or <code>null</code> if a ficha ingreso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.FichaIngreso fetchByPrimaryKey(
		com.hitss.layer.service.persistence.FichaIngresoPK fichaIngresoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ficha ingresos.
	*
	* @return the ficha ingresos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.FichaIngreso> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ficha ingresos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FichaIngresoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ficha ingresos
	* @param end the upper bound of the range of ficha ingresos (not inclusive)
	* @return the range of ficha ingresos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.FichaIngreso> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ficha ingresos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FichaIngresoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ficha ingresos
	* @param end the upper bound of the range of ficha ingresos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ficha ingresos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.FichaIngreso> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the ficha ingresos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ficha ingresos.
	*
	* @return the number of ficha ingresos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
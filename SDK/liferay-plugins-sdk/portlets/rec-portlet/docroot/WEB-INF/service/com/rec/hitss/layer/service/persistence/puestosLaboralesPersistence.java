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

import com.rec.hitss.layer.model.puestosLaborales;

/**
 * The persistence interface for the puestos laborales service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see puestosLaboralesPersistenceImpl
 * @see puestosLaboralesUtil
 * @generated
 */
public interface puestosLaboralesPersistence extends BasePersistence<puestosLaborales> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link puestosLaboralesUtil} to access the puestos laborales persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the puestos laborales in the entity cache if it is enabled.
	*
	* @param puestosLaborales the puestos laborales
	*/
	public void cacheResult(
		com.rec.hitss.layer.model.puestosLaborales puestosLaborales);

	/**
	* Caches the puestos laboraleses in the entity cache if it is enabled.
	*
	* @param puestosLaboraleses the puestos laboraleses
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.puestosLaborales> puestosLaboraleses);

	/**
	* Creates a new puestos laborales with the primary key. Does not add the puestos laborales to the database.
	*
	* @param PL_ID the primary key for the new puestos laborales
	* @return the new puestos laborales
	*/
	public com.rec.hitss.layer.model.puestosLaborales create(long PL_ID);

	/**
	* Removes the puestos laborales with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PL_ID the primary key of the puestos laborales
	* @return the puestos laborales that was removed
	* @throws com.rec.hitss.layer.NoSuchpuestosLaboralesException if a puestos laborales with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.puestosLaborales remove(long PL_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchpuestosLaboralesException;

	public com.rec.hitss.layer.model.puestosLaborales updateImpl(
		com.rec.hitss.layer.model.puestosLaborales puestosLaborales)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the puestos laborales with the primary key or throws a {@link com.rec.hitss.layer.NoSuchpuestosLaboralesException} if it could not be found.
	*
	* @param PL_ID the primary key of the puestos laborales
	* @return the puestos laborales
	* @throws com.rec.hitss.layer.NoSuchpuestosLaboralesException if a puestos laborales with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.puestosLaborales findByPrimaryKey(
		long PL_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchpuestosLaboralesException;

	/**
	* Returns the puestos laborales with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PL_ID the primary key of the puestos laborales
	* @return the puestos laborales, or <code>null</code> if a puestos laborales with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.puestosLaborales fetchByPrimaryKey(
		long PL_ID) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the puestos laboraleses.
	*
	* @return the puestos laboraleses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.puestosLaborales> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the puestos laboraleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.puestosLaboralesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of puestos laboraleses
	* @param end the upper bound of the range of puestos laboraleses (not inclusive)
	* @return the range of puestos laboraleses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.puestosLaborales> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the puestos laboraleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.puestosLaboralesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of puestos laboraleses
	* @param end the upper bound of the range of puestos laboraleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of puestos laboraleses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.puestosLaborales> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the puestos laboraleses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of puestos laboraleses.
	*
	* @return the number of puestos laboraleses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
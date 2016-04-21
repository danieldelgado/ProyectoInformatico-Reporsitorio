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

import com.rec.hitss.layer.model.Actividades;

/**
 * The persistence interface for the actividades service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see ActividadesPersistenceImpl
 * @see ActividadesUtil
 * @generated
 */
public interface ActividadesPersistence extends BasePersistence<Actividades> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ActividadesUtil} to access the actividades persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the actividades in the entity cache if it is enabled.
	*
	* @param actividades the actividades
	*/
	public void cacheResult(com.rec.hitss.layer.model.Actividades actividades);

	/**
	* Caches the actividadeses in the entity cache if it is enabled.
	*
	* @param actividadeses the actividadeses
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.Actividades> actividadeses);

	/**
	* Creates a new actividades with the primary key. Does not add the actividades to the database.
	*
	* @param actividadesId the primary key for the new actividades
	* @return the new actividades
	*/
	public com.rec.hitss.layer.model.Actividades create(long actividadesId);

	/**
	* Removes the actividades with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadesId the primary key of the actividades
	* @return the actividades that was removed
	* @throws com.rec.hitss.layer.NoSuchActividadesException if a actividades with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Actividades remove(long actividadesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchActividadesException;

	public com.rec.hitss.layer.model.Actividades updateImpl(
		com.rec.hitss.layer.model.Actividades actividades)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the actividades with the primary key or throws a {@link com.rec.hitss.layer.NoSuchActividadesException} if it could not be found.
	*
	* @param actividadesId the primary key of the actividades
	* @return the actividades
	* @throws com.rec.hitss.layer.NoSuchActividadesException if a actividades with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Actividades findByPrimaryKey(
		long actividadesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchActividadesException;

	/**
	* Returns the actividades with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param actividadesId the primary key of the actividades
	* @return the actividades, or <code>null</code> if a actividades with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Actividades fetchByPrimaryKey(
		long actividadesId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the actividadeses.
	*
	* @return the actividadeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Actividades> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the actividadeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ActividadesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of actividadeses
	* @param end the upper bound of the range of actividadeses (not inclusive)
	* @return the range of actividadeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Actividades> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the actividadeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ActividadesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of actividadeses
	* @param end the upper bound of the range of actividadeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of actividadeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Actividades> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the actividadeses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of actividadeses.
	*
	* @return the number of actividadeses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
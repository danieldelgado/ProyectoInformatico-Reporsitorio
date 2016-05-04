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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.rec.hitss.layer.model.cartillaReclutamiento;

import java.util.List;

/**
 * The persistence utility for the cartilla reclutamiento service. This utility wraps {@link cartillaReclutamientoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see cartillaReclutamientoPersistence
 * @see cartillaReclutamientoPersistenceImpl
 * @generated
 */
public class cartillaReclutamientoUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(cartillaReclutamiento cartillaReclutamiento) {
		getPersistence().clearCache(cartillaReclutamiento);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<cartillaReclutamiento> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<cartillaReclutamiento> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<cartillaReclutamiento> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static cartillaReclutamiento update(
		cartillaReclutamiento cartillaReclutamiento) throws SystemException {
		return getPersistence().update(cartillaReclutamiento);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static cartillaReclutamiento update(
		cartillaReclutamiento cartillaReclutamiento,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(cartillaReclutamiento, serviceContext);
	}

	/**
	* Caches the cartilla reclutamiento in the entity cache if it is enabled.
	*
	* @param cartillaReclutamiento the cartilla reclutamiento
	*/
	public static void cacheResult(
		com.rec.hitss.layer.model.cartillaReclutamiento cartillaReclutamiento) {
		getPersistence().cacheResult(cartillaReclutamiento);
	}

	/**
	* Caches the cartilla reclutamientos in the entity cache if it is enabled.
	*
	* @param cartillaReclutamientos the cartilla reclutamientos
	*/
	public static void cacheResult(
		java.util.List<com.rec.hitss.layer.model.cartillaReclutamiento> cartillaReclutamientos) {
		getPersistence().cacheResult(cartillaReclutamientos);
	}

	/**
	* Creates a new cartilla reclutamiento with the primary key. Does not add the cartilla reclutamiento to the database.
	*
	* @param CR_ID the primary key for the new cartilla reclutamiento
	* @return the new cartilla reclutamiento
	*/
	public static com.rec.hitss.layer.model.cartillaReclutamiento create(
		long CR_ID) {
		return getPersistence().create(CR_ID);
	}

	/**
	* Removes the cartilla reclutamiento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CR_ID the primary key of the cartilla reclutamiento
	* @return the cartilla reclutamiento that was removed
	* @throws com.rec.hitss.layer.NoSuchcartillaReclutamientoException if a cartilla reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.cartillaReclutamiento remove(
		long CR_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchcartillaReclutamientoException {
		return getPersistence().remove(CR_ID);
	}

	public static com.rec.hitss.layer.model.cartillaReclutamiento updateImpl(
		com.rec.hitss.layer.model.cartillaReclutamiento cartillaReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(cartillaReclutamiento);
	}

	/**
	* Returns the cartilla reclutamiento with the primary key or throws a {@link com.rec.hitss.layer.NoSuchcartillaReclutamientoException} if it could not be found.
	*
	* @param CR_ID the primary key of the cartilla reclutamiento
	* @return the cartilla reclutamiento
	* @throws com.rec.hitss.layer.NoSuchcartillaReclutamientoException if a cartilla reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.cartillaReclutamiento findByPrimaryKey(
		long CR_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchcartillaReclutamientoException {
		return getPersistence().findByPrimaryKey(CR_ID);
	}

	/**
	* Returns the cartilla reclutamiento with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CR_ID the primary key of the cartilla reclutamiento
	* @return the cartilla reclutamiento, or <code>null</code> if a cartilla reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.cartillaReclutamiento fetchByPrimaryKey(
		long CR_ID) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(CR_ID);
	}

	/**
	* Returns all the cartilla reclutamientos.
	*
	* @return the cartilla reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.cartillaReclutamiento> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the cartilla reclutamientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.cartillaReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cartilla reclutamientos
	* @param end the upper bound of the range of cartilla reclutamientos (not inclusive)
	* @return the range of cartilla reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.cartillaReclutamiento> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the cartilla reclutamientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.cartillaReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cartilla reclutamientos
	* @param end the upper bound of the range of cartilla reclutamientos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cartilla reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.cartillaReclutamiento> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the cartilla reclutamientos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of cartilla reclutamientos.
	*
	* @return the number of cartilla reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static cartillaReclutamientoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (cartillaReclutamientoPersistence)PortletBeanLocatorUtil.locate(com.rec.hitss.layer.service.ClpSerializer.getServletContextName(),
					cartillaReclutamientoPersistence.class.getName());

			ReferenceRegistry.registerReference(cartillaReclutamientoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(cartillaReclutamientoPersistence persistence) {
	}

	private static cartillaReclutamientoPersistence _persistence;
}
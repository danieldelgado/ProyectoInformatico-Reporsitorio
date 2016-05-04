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

import com.rec.hitss.layer.model.solicitudReclutamiento;

import java.util.List;

/**
 * The persistence utility for the solicitud reclutamiento service. This utility wraps {@link solicitudReclutamientoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see solicitudReclutamientoPersistence
 * @see solicitudReclutamientoPersistenceImpl
 * @generated
 */
public class solicitudReclutamientoUtil {
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
	public static void clearCache(solicitudReclutamiento solicitudReclutamiento) {
		getPersistence().clearCache(solicitudReclutamiento);
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
	public static List<solicitudReclutamiento> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<solicitudReclutamiento> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<solicitudReclutamiento> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static solicitudReclutamiento update(
		solicitudReclutamiento solicitudReclutamiento)
		throws SystemException {
		return getPersistence().update(solicitudReclutamiento);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static solicitudReclutamiento update(
		solicitudReclutamiento solicitudReclutamiento,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(solicitudReclutamiento, serviceContext);
	}

	/**
	* Caches the solicitud reclutamiento in the entity cache if it is enabled.
	*
	* @param solicitudReclutamiento the solicitud reclutamiento
	*/
	public static void cacheResult(
		com.rec.hitss.layer.model.solicitudReclutamiento solicitudReclutamiento) {
		getPersistence().cacheResult(solicitudReclutamiento);
	}

	/**
	* Caches the solicitud reclutamientos in the entity cache if it is enabled.
	*
	* @param solicitudReclutamientos the solicitud reclutamientos
	*/
	public static void cacheResult(
		java.util.List<com.rec.hitss.layer.model.solicitudReclutamiento> solicitudReclutamientos) {
		getPersistence().cacheResult(solicitudReclutamientos);
	}

	/**
	* Creates a new solicitud reclutamiento with the primary key. Does not add the solicitud reclutamiento to the database.
	*
	* @param SR_ID the primary key for the new solicitud reclutamiento
	* @return the new solicitud reclutamiento
	*/
	public static com.rec.hitss.layer.model.solicitudReclutamiento create(
		long SR_ID) {
		return getPersistence().create(SR_ID);
	}

	/**
	* Removes the solicitud reclutamiento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SR_ID the primary key of the solicitud reclutamiento
	* @return the solicitud reclutamiento that was removed
	* @throws com.rec.hitss.layer.NoSuchsolicitudReclutamientoException if a solicitud reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.solicitudReclutamiento remove(
		long SR_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchsolicitudReclutamientoException {
		return getPersistence().remove(SR_ID);
	}

	public static com.rec.hitss.layer.model.solicitudReclutamiento updateImpl(
		com.rec.hitss.layer.model.solicitudReclutamiento solicitudReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(solicitudReclutamiento);
	}

	/**
	* Returns the solicitud reclutamiento with the primary key or throws a {@link com.rec.hitss.layer.NoSuchsolicitudReclutamientoException} if it could not be found.
	*
	* @param SR_ID the primary key of the solicitud reclutamiento
	* @return the solicitud reclutamiento
	* @throws com.rec.hitss.layer.NoSuchsolicitudReclutamientoException if a solicitud reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.solicitudReclutamiento findByPrimaryKey(
		long SR_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchsolicitudReclutamientoException {
		return getPersistence().findByPrimaryKey(SR_ID);
	}

	/**
	* Returns the solicitud reclutamiento with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SR_ID the primary key of the solicitud reclutamiento
	* @return the solicitud reclutamiento, or <code>null</code> if a solicitud reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.solicitudReclutamiento fetchByPrimaryKey(
		long SR_ID) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(SR_ID);
	}

	/**
	* Returns all the solicitud reclutamientos.
	*
	* @return the solicitud reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.solicitudReclutamiento> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the solicitud reclutamientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.solicitudReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud reclutamientos
	* @param end the upper bound of the range of solicitud reclutamientos (not inclusive)
	* @return the range of solicitud reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.solicitudReclutamiento> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the solicitud reclutamientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.solicitudReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud reclutamientos
	* @param end the upper bound of the range of solicitud reclutamientos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of solicitud reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.solicitudReclutamiento> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the solicitud reclutamientos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of solicitud reclutamientos.
	*
	* @return the number of solicitud reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static solicitudReclutamientoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (solicitudReclutamientoPersistence)PortletBeanLocatorUtil.locate(com.rec.hitss.layer.service.ClpSerializer.getServletContextName(),
					solicitudReclutamientoPersistence.class.getName());

			ReferenceRegistry.registerReference(solicitudReclutamientoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(solicitudReclutamientoPersistence persistence) {
	}

	private static solicitudReclutamientoPersistence _persistence;
}
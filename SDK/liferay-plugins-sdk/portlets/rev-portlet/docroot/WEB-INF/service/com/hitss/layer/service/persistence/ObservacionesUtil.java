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

import com.hitss.layer.model.Observaciones;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the observaciones service. This utility wraps {@link ObservacionesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see ObservacionesPersistence
 * @see ObservacionesPersistenceImpl
 * @generated
 */
public class ObservacionesUtil {
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
	public static void clearCache(Observaciones observaciones) {
		getPersistence().clearCache(observaciones);
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
	public static List<Observaciones> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Observaciones> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Observaciones> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Observaciones update(Observaciones observaciones)
		throws SystemException {
		return getPersistence().update(observaciones);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Observaciones update(Observaciones observaciones,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(observaciones, serviceContext);
	}

	/**
	* Caches the observaciones in the entity cache if it is enabled.
	*
	* @param observaciones the observaciones
	*/
	public static void cacheResult(
		com.hitss.layer.model.Observaciones observaciones) {
		getPersistence().cacheResult(observaciones);
	}

	/**
	* Caches the observacioneses in the entity cache if it is enabled.
	*
	* @param observacioneses the observacioneses
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.Observaciones> observacioneses) {
		getPersistence().cacheResult(observacioneses);
	}

	/**
	* Creates a new observaciones with the primary key. Does not add the observaciones to the database.
	*
	* @param observacionId the primary key for the new observaciones
	* @return the new observaciones
	*/
	public static com.hitss.layer.model.Observaciones create(long observacionId) {
		return getPersistence().create(observacionId);
	}

	/**
	* Removes the observaciones with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param observacionId the primary key of the observaciones
	* @return the observaciones that was removed
	* @throws com.hitss.layer.NoSuchObservacionesException if a observaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Observaciones remove(long observacionId)
		throws com.hitss.layer.NoSuchObservacionesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(observacionId);
	}

	public static com.hitss.layer.model.Observaciones updateImpl(
		com.hitss.layer.model.Observaciones observaciones)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(observaciones);
	}

	/**
	* Returns the observaciones with the primary key or throws a {@link com.hitss.layer.NoSuchObservacionesException} if it could not be found.
	*
	* @param observacionId the primary key of the observaciones
	* @return the observaciones
	* @throws com.hitss.layer.NoSuchObservacionesException if a observaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Observaciones findByPrimaryKey(
		long observacionId)
		throws com.hitss.layer.NoSuchObservacionesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(observacionId);
	}

	/**
	* Returns the observaciones with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param observacionId the primary key of the observaciones
	* @return the observaciones, or <code>null</code> if a observaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Observaciones fetchByPrimaryKey(
		long observacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(observacionId);
	}

	/**
	* Returns all the observacioneses.
	*
	* @return the observacioneses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Observaciones> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the observacioneses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ObservacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of observacioneses
	* @param end the upper bound of the range of observacioneses (not inclusive)
	* @return the range of observacioneses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Observaciones> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the observacioneses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ObservacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of observacioneses
	* @param end the upper bound of the range of observacioneses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of observacioneses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Observaciones> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the observacioneses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of observacioneses.
	*
	* @return the number of observacioneses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ObservacionesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ObservacionesPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					ObservacionesPersistence.class.getName());

			ReferenceRegistry.registerReference(ObservacionesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ObservacionesPersistence persistence) {
	}

	private static ObservacionesPersistence _persistence;
}
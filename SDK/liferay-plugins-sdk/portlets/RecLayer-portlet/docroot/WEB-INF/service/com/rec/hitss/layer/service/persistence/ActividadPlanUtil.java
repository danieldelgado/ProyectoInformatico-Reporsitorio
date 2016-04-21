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

import com.rec.hitss.layer.model.ActividadPlan;

import java.util.List;

/**
 * The persistence utility for the actividad plan service. This utility wraps {@link ActividadPlanPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see ActividadPlanPersistence
 * @see ActividadPlanPersistenceImpl
 * @generated
 */
public class ActividadPlanUtil {
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
	public static void clearCache(ActividadPlan actividadPlan) {
		getPersistence().clearCache(actividadPlan);
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
	public static List<ActividadPlan> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ActividadPlan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ActividadPlan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ActividadPlan update(ActividadPlan actividadPlan)
		throws SystemException {
		return getPersistence().update(actividadPlan);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ActividadPlan update(ActividadPlan actividadPlan,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(actividadPlan, serviceContext);
	}

	/**
	* Caches the actividad plan in the entity cache if it is enabled.
	*
	* @param actividadPlan the actividad plan
	*/
	public static void cacheResult(
		com.rec.hitss.layer.model.ActividadPlan actividadPlan) {
		getPersistence().cacheResult(actividadPlan);
	}

	/**
	* Caches the actividad plans in the entity cache if it is enabled.
	*
	* @param actividadPlans the actividad plans
	*/
	public static void cacheResult(
		java.util.List<com.rec.hitss.layer.model.ActividadPlan> actividadPlans) {
		getPersistence().cacheResult(actividadPlans);
	}

	/**
	* Creates a new actividad plan with the primary key. Does not add the actividad plan to the database.
	*
	* @param actividadPlanId the primary key for the new actividad plan
	* @return the new actividad plan
	*/
	public static com.rec.hitss.layer.model.ActividadPlan create(
		long actividadPlanId) {
		return getPersistence().create(actividadPlanId);
	}

	/**
	* Removes the actividad plan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadPlanId the primary key of the actividad plan
	* @return the actividad plan that was removed
	* @throws com.rec.hitss.layer.NoSuchActividadPlanException if a actividad plan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.ActividadPlan remove(
		long actividadPlanId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchActividadPlanException {
		return getPersistence().remove(actividadPlanId);
	}

	public static com.rec.hitss.layer.model.ActividadPlan updateImpl(
		com.rec.hitss.layer.model.ActividadPlan actividadPlan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(actividadPlan);
	}

	/**
	* Returns the actividad plan with the primary key or throws a {@link com.rec.hitss.layer.NoSuchActividadPlanException} if it could not be found.
	*
	* @param actividadPlanId the primary key of the actividad plan
	* @return the actividad plan
	* @throws com.rec.hitss.layer.NoSuchActividadPlanException if a actividad plan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.ActividadPlan findByPrimaryKey(
		long actividadPlanId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchActividadPlanException {
		return getPersistence().findByPrimaryKey(actividadPlanId);
	}

	/**
	* Returns the actividad plan with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param actividadPlanId the primary key of the actividad plan
	* @return the actividad plan, or <code>null</code> if a actividad plan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.ActividadPlan fetchByPrimaryKey(
		long actividadPlanId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(actividadPlanId);
	}

	/**
	* Returns all the actividad plans.
	*
	* @return the actividad plans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.ActividadPlan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the actividad plans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ActividadPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of actividad plans
	* @param end the upper bound of the range of actividad plans (not inclusive)
	* @return the range of actividad plans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.ActividadPlan> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the actividad plans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ActividadPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of actividad plans
	* @param end the upper bound of the range of actividad plans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of actividad plans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.ActividadPlan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the actividad plans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of actividad plans.
	*
	* @return the number of actividad plans
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ActividadPlanPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ActividadPlanPersistence)PortletBeanLocatorUtil.locate(com.rec.hitss.layer.service.ClpSerializer.getServletContextName(),
					ActividadPlanPersistence.class.getName());

			ReferenceRegistry.registerReference(ActividadPlanUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ActividadPlanPersistence persistence) {
	}

	private static ActividadPlanPersistence _persistence;
}
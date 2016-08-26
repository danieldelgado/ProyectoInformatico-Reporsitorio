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

import com.hitss.layer.model.ActividadPlan;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the actividad plan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see ActividadPlanPersistenceImpl
 * @see ActividadPlanUtil
 * @generated
 */
public interface ActividadPlanPersistence extends BasePersistence<ActividadPlan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ActividadPlanUtil} to access the actividad plan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the actividad plan in the entity cache if it is enabled.
	*
	* @param actividadPlan the actividad plan
	*/
	public void cacheResult(com.hitss.layer.model.ActividadPlan actividadPlan);

	/**
	* Caches the actividad plans in the entity cache if it is enabled.
	*
	* @param actividadPlans the actividad plans
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.ActividadPlan> actividadPlans);

	/**
	* Creates a new actividad plan with the primary key. Does not add the actividad plan to the database.
	*
	* @param actividadPlanPK the primary key for the new actividad plan
	* @return the new actividad plan
	*/
	public com.hitss.layer.model.ActividadPlan create(
		com.hitss.layer.service.persistence.ActividadPlanPK actividadPlanPK);

	/**
	* Removes the actividad plan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadPlanPK the primary key of the actividad plan
	* @return the actividad plan that was removed
	* @throws com.hitss.layer.NoSuchActividadPlanException if a actividad plan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadPlan remove(
		com.hitss.layer.service.persistence.ActividadPlanPK actividadPlanPK)
		throws com.hitss.layer.NoSuchActividadPlanException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.ActividadPlan updateImpl(
		com.hitss.layer.model.ActividadPlan actividadPlan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the actividad plan with the primary key or throws a {@link com.hitss.layer.NoSuchActividadPlanException} if it could not be found.
	*
	* @param actividadPlanPK the primary key of the actividad plan
	* @return the actividad plan
	* @throws com.hitss.layer.NoSuchActividadPlanException if a actividad plan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadPlan findByPrimaryKey(
		com.hitss.layer.service.persistence.ActividadPlanPK actividadPlanPK)
		throws com.hitss.layer.NoSuchActividadPlanException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the actividad plan with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param actividadPlanPK the primary key of the actividad plan
	* @return the actividad plan, or <code>null</code> if a actividad plan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadPlan fetchByPrimaryKey(
		com.hitss.layer.service.persistence.ActividadPlanPK actividadPlanPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the actividad plans.
	*
	* @return the actividad plans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.ActividadPlan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the actividad plans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of actividad plans
	* @param end the upper bound of the range of actividad plans (not inclusive)
	* @return the range of actividad plans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.ActividadPlan> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the actividad plans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of actividad plans
	* @param end the upper bound of the range of actividad plans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of actividad plans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.ActividadPlan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the actividad plans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of actividad plans.
	*
	* @return the number of actividad plans
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
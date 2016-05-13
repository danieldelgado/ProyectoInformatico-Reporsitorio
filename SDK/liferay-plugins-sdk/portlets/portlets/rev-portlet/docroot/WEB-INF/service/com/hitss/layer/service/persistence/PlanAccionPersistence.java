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

import com.hitss.layer.model.PlanAccion;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the plan accion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PlanAccionPersistenceImpl
 * @see PlanAccionUtil
 * @generated
 */
public interface PlanAccionPersistence extends BasePersistence<PlanAccion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PlanAccionUtil} to access the plan accion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the plan accion in the entity cache if it is enabled.
	*
	* @param planAccion the plan accion
	*/
	public void cacheResult(com.hitss.layer.model.PlanAccion planAccion);

	/**
	* Caches the plan accions in the entity cache if it is enabled.
	*
	* @param planAccions the plan accions
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.PlanAccion> planAccions);

	/**
	* Creates a new plan accion with the primary key. Does not add the plan accion to the database.
	*
	* @param planAccionId the primary key for the new plan accion
	* @return the new plan accion
	*/
	public com.hitss.layer.model.PlanAccion create(long planAccionId);

	/**
	* Removes the plan accion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param planAccionId the primary key of the plan accion
	* @return the plan accion that was removed
	* @throws com.hitss.layer.NoSuchPlanAccionException if a plan accion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PlanAccion remove(long planAccionId)
		throws com.hitss.layer.NoSuchPlanAccionException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.PlanAccion updateImpl(
		com.hitss.layer.model.PlanAccion planAccion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the plan accion with the primary key or throws a {@link com.hitss.layer.NoSuchPlanAccionException} if it could not be found.
	*
	* @param planAccionId the primary key of the plan accion
	* @return the plan accion
	* @throws com.hitss.layer.NoSuchPlanAccionException if a plan accion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PlanAccion findByPrimaryKey(long planAccionId)
		throws com.hitss.layer.NoSuchPlanAccionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the plan accion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param planAccionId the primary key of the plan accion
	* @return the plan accion, or <code>null</code> if a plan accion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PlanAccion fetchByPrimaryKey(long planAccionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the plan accions.
	*
	* @return the plan accions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.PlanAccion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the plan accions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PlanAccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of plan accions
	* @param end the upper bound of the range of plan accions (not inclusive)
	* @return the range of plan accions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.PlanAccion> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the plan accions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PlanAccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of plan accions
	* @param end the upper bound of the range of plan accions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of plan accions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.PlanAccion> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the plan accions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of plan accions.
	*
	* @return the number of plan accions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
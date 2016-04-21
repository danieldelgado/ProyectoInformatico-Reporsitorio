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

package com.rec.hitss.layer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PlanAccionLocalService}.
 *
 * @author Crossfire
 * @see PlanAccionLocalService
 * @generated
 */
public class PlanAccionLocalServiceWrapper implements PlanAccionLocalService,
	ServiceWrapper<PlanAccionLocalService> {
	public PlanAccionLocalServiceWrapper(
		PlanAccionLocalService planAccionLocalService) {
		_planAccionLocalService = planAccionLocalService;
	}

	/**
	* Adds the plan accion to the database. Also notifies the appropriate model listeners.
	*
	* @param planAccion the plan accion
	* @return the plan accion that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.PlanAccion addPlanAccion(
		com.rec.hitss.layer.model.PlanAccion planAccion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _planAccionLocalService.addPlanAccion(planAccion);
	}

	/**
	* Creates a new plan accion with the primary key. Does not add the plan accion to the database.
	*
	* @param planAccionId the primary key for the new plan accion
	* @return the new plan accion
	*/
	@Override
	public com.rec.hitss.layer.model.PlanAccion createPlanAccion(
		long planAccionId) {
		return _planAccionLocalService.createPlanAccion(planAccionId);
	}

	/**
	* Deletes the plan accion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param planAccionId the primary key of the plan accion
	* @return the plan accion that was removed
	* @throws PortalException if a plan accion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.PlanAccion deletePlanAccion(
		long planAccionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _planAccionLocalService.deletePlanAccion(planAccionId);
	}

	/**
	* Deletes the plan accion from the database. Also notifies the appropriate model listeners.
	*
	* @param planAccion the plan accion
	* @return the plan accion that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.PlanAccion deletePlanAccion(
		com.rec.hitss.layer.model.PlanAccion planAccion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _planAccionLocalService.deletePlanAccion(planAccion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _planAccionLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _planAccionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PlanAccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _planAccionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PlanAccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _planAccionLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _planAccionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _planAccionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.PlanAccion fetchPlanAccion(
		long planAccionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _planAccionLocalService.fetchPlanAccion(planAccionId);
	}

	/**
	* Returns the plan accion with the primary key.
	*
	* @param planAccionId the primary key of the plan accion
	* @return the plan accion
	* @throws PortalException if a plan accion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.PlanAccion getPlanAccion(long planAccionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _planAccionLocalService.getPlanAccion(planAccionId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _planAccionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the plan accions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PlanAccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of plan accions
	* @param end the upper bound of the range of plan accions (not inclusive)
	* @return the range of plan accions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.PlanAccion> getPlanAccions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _planAccionLocalService.getPlanAccions(start, end);
	}

	/**
	* Returns the number of plan accions.
	*
	* @return the number of plan accions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPlanAccionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _planAccionLocalService.getPlanAccionsCount();
	}

	/**
	* Updates the plan accion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param planAccion the plan accion
	* @return the plan accion that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.PlanAccion updatePlanAccion(
		com.rec.hitss.layer.model.PlanAccion planAccion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _planAccionLocalService.updatePlanAccion(planAccion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _planAccionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_planAccionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _planAccionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PlanAccionLocalService getWrappedPlanAccionLocalService() {
		return _planAccionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPlanAccionLocalService(
		PlanAccionLocalService planAccionLocalService) {
		_planAccionLocalService = planAccionLocalService;
	}

	@Override
	public PlanAccionLocalService getWrappedService() {
		return _planAccionLocalService;
	}

	@Override
	public void setWrappedService(PlanAccionLocalService planAccionLocalService) {
		_planAccionLocalService = planAccionLocalService;
	}

	private PlanAccionLocalService _planAccionLocalService;
}
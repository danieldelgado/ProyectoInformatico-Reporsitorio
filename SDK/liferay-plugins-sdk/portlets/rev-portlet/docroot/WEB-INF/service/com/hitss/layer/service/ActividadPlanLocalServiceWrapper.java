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

package com.hitss.layer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ActividadPlanLocalService}.
 *
 * @author Danielle Delgado
 * @see ActividadPlanLocalService
 * @generated
 */
public class ActividadPlanLocalServiceWrapper
	implements ActividadPlanLocalService,
		ServiceWrapper<ActividadPlanLocalService> {
	public ActividadPlanLocalServiceWrapper(
		ActividadPlanLocalService actividadPlanLocalService) {
		_actividadPlanLocalService = actividadPlanLocalService;
	}

	/**
	* Adds the actividad plan to the database. Also notifies the appropriate model listeners.
	*
	* @param actividadPlan the actividad plan
	* @return the actividad plan that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.ActividadPlan addActividadPlan(
		com.hitss.layer.model.ActividadPlan actividadPlan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actividadPlanLocalService.addActividadPlan(actividadPlan);
	}

	/**
	* Creates a new actividad plan with the primary key. Does not add the actividad plan to the database.
	*
	* @param actividadPlanId the primary key for the new actividad plan
	* @return the new actividad plan
	*/
	@Override
	public com.hitss.layer.model.ActividadPlan createActividadPlan(
		long actividadPlanId) {
		return _actividadPlanLocalService.createActividadPlan(actividadPlanId);
	}

	/**
	* Deletes the actividad plan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadPlanId the primary key of the actividad plan
	* @return the actividad plan that was removed
	* @throws PortalException if a actividad plan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.ActividadPlan deleteActividadPlan(
		long actividadPlanId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _actividadPlanLocalService.deleteActividadPlan(actividadPlanId);
	}

	/**
	* Deletes the actividad plan from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadPlan the actividad plan
	* @return the actividad plan that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.ActividadPlan deleteActividadPlan(
		com.hitss.layer.model.ActividadPlan actividadPlan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actividadPlanLocalService.deleteActividadPlan(actividadPlan);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _actividadPlanLocalService.dynamicQuery();
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
		return _actividadPlanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _actividadPlanLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _actividadPlanLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _actividadPlanLocalService.dynamicQueryCount(dynamicQuery);
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
		return _actividadPlanLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.ActividadPlan fetchActividadPlan(
		long actividadPlanId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actividadPlanLocalService.fetchActividadPlan(actividadPlanId);
	}

	/**
	* Returns the actividad plan with the primary key.
	*
	* @param actividadPlanId the primary key of the actividad plan
	* @return the actividad plan
	* @throws PortalException if a actividad plan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.ActividadPlan getActividadPlan(
		long actividadPlanId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _actividadPlanLocalService.getActividadPlan(actividadPlanId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _actividadPlanLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.hitss.layer.model.ActividadPlan> getActividadPlans(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actividadPlanLocalService.getActividadPlans(start, end);
	}

	/**
	* Returns the number of actividad plans.
	*
	* @return the number of actividad plans
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getActividadPlansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actividadPlanLocalService.getActividadPlansCount();
	}

	/**
	* Updates the actividad plan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param actividadPlan the actividad plan
	* @return the actividad plan that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.ActividadPlan updateActividadPlan(
		com.hitss.layer.model.ActividadPlan actividadPlan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actividadPlanLocalService.updateActividadPlan(actividadPlan);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addUsuarioActividadPlan(long userId, long actividadPlanId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_actividadPlanLocalService.addUsuarioActividadPlan(userId,
			actividadPlanId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addUsuarioActividadPlan(long userId,
		com.hitss.layer.model.ActividadPlan actividadPlan)
		throws com.liferay.portal.kernel.exception.SystemException {
		_actividadPlanLocalService.addUsuarioActividadPlan(userId, actividadPlan);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addUsuarioActividadPlans(long userId, long[] actividadPlanIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_actividadPlanLocalService.addUsuarioActividadPlans(userId,
			actividadPlanIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addUsuarioActividadPlans(long userId,
		java.util.List<com.hitss.layer.model.ActividadPlan> ActividadPlans)
		throws com.liferay.portal.kernel.exception.SystemException {
		_actividadPlanLocalService.addUsuarioActividadPlans(userId,
			ActividadPlans);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearUsuarioActividadPlans(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_actividadPlanLocalService.clearUsuarioActividadPlans(userId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteUsuarioActividadPlan(long userId, long actividadPlanId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_actividadPlanLocalService.deleteUsuarioActividadPlan(userId,
			actividadPlanId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteUsuarioActividadPlan(long userId,
		com.hitss.layer.model.ActividadPlan actividadPlan)
		throws com.liferay.portal.kernel.exception.SystemException {
		_actividadPlanLocalService.deleteUsuarioActividadPlan(userId,
			actividadPlan);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteUsuarioActividadPlans(long userId, long[] actividadPlanIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_actividadPlanLocalService.deleteUsuarioActividadPlans(userId,
			actividadPlanIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteUsuarioActividadPlans(long userId,
		java.util.List<com.hitss.layer.model.ActividadPlan> ActividadPlans)
		throws com.liferay.portal.kernel.exception.SystemException {
		_actividadPlanLocalService.deleteUsuarioActividadPlans(userId,
			ActividadPlans);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.ActividadPlan> getUsuarioActividadPlans(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return _actividadPlanLocalService.getUsuarioActividadPlans(userId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.ActividadPlan> getUsuarioActividadPlans(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actividadPlanLocalService.getUsuarioActividadPlans(userId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.ActividadPlan> getUsuarioActividadPlans(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actividadPlanLocalService.getUsuarioActividadPlans(userId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getUsuarioActividadPlansCount(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actividadPlanLocalService.getUsuarioActividadPlansCount(userId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasUsuarioActividadPlan(long userId, long actividadPlanId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actividadPlanLocalService.hasUsuarioActividadPlan(userId,
			actividadPlanId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasUsuarioActividadPlans(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actividadPlanLocalService.hasUsuarioActividadPlans(userId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setUsuarioActividadPlans(long userId, long[] actividadPlanIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_actividadPlanLocalService.setUsuarioActividadPlans(userId,
			actividadPlanIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _actividadPlanLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_actividadPlanLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _actividadPlanLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ActividadPlanLocalService getWrappedActividadPlanLocalService() {
		return _actividadPlanLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedActividadPlanLocalService(
		ActividadPlanLocalService actividadPlanLocalService) {
		_actividadPlanLocalService = actividadPlanLocalService;
	}

	@Override
	public ActividadPlanLocalService getWrappedService() {
		return _actividadPlanLocalService;
	}

	@Override
	public void setWrappedService(
		ActividadPlanLocalService actividadPlanLocalService) {
		_actividadPlanLocalService = actividadPlanLocalService;
	}

	private ActividadPlanLocalService _actividadPlanLocalService;
}
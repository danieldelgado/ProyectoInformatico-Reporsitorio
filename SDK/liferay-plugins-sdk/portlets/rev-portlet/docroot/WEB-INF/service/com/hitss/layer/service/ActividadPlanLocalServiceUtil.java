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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for ActividadPlan. This utility wraps
 * {@link com.hitss.layer.service.impl.ActividadPlanLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Danielle Delgado
 * @see ActividadPlanLocalService
 * @see com.hitss.layer.service.base.ActividadPlanLocalServiceBaseImpl
 * @see com.hitss.layer.service.impl.ActividadPlanLocalServiceImpl
 * @generated
 */
public class ActividadPlanLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.hitss.layer.service.impl.ActividadPlanLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the actividad plan to the database. Also notifies the appropriate model listeners.
	*
	* @param actividadPlan the actividad plan
	* @return the actividad plan that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.ActividadPlan addActividadPlan(
		com.hitss.layer.model.ActividadPlan actividadPlan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addActividadPlan(actividadPlan);
	}

	/**
	* Creates a new actividad plan with the primary key. Does not add the actividad plan to the database.
	*
	* @param actividadPlanPK the primary key for the new actividad plan
	* @return the new actividad plan
	*/
	public static com.hitss.layer.model.ActividadPlan createActividadPlan(
		com.hitss.layer.service.persistence.ActividadPlanPK actividadPlanPK) {
		return getService().createActividadPlan(actividadPlanPK);
	}

	/**
	* Deletes the actividad plan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadPlanPK the primary key of the actividad plan
	* @return the actividad plan that was removed
	* @throws PortalException if a actividad plan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.ActividadPlan deleteActividadPlan(
		com.hitss.layer.service.persistence.ActividadPlanPK actividadPlanPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteActividadPlan(actividadPlanPK);
	}

	/**
	* Deletes the actividad plan from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadPlan the actividad plan
	* @return the actividad plan that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.ActividadPlan deleteActividadPlan(
		com.hitss.layer.model.ActividadPlan actividadPlan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteActividadPlan(actividadPlan);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.hitss.layer.model.ActividadPlan fetchActividadPlan(
		com.hitss.layer.service.persistence.ActividadPlanPK actividadPlanPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchActividadPlan(actividadPlanPK);
	}

	/**
	* Returns the actividad plan with the primary key.
	*
	* @param actividadPlanPK the primary key of the actividad plan
	* @return the actividad plan
	* @throws PortalException if a actividad plan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.ActividadPlan getActividadPlan(
		com.hitss.layer.service.persistence.ActividadPlanPK actividadPlanPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getActividadPlan(actividadPlanPK);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.hitss.layer.model.ActividadPlan> getActividadPlans(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getActividadPlans(start, end);
	}

	/**
	* Returns the number of actividad plans.
	*
	* @return the number of actividad plans
	* @throws SystemException if a system exception occurred
	*/
	public static int getActividadPlansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getActividadPlansCount();
	}

	/**
	* Updates the actividad plan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param actividadPlan the actividad plan
	* @return the actividad plan that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.ActividadPlan updateActividadPlan(
		com.hitss.layer.model.ActividadPlan actividadPlan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateActividadPlan(actividadPlan);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static ActividadPlanLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ActividadPlanLocalService.class.getName());

			if (invokableLocalService instanceof ActividadPlanLocalService) {
				_service = (ActividadPlanLocalService)invokableLocalService;
			}
			else {
				_service = new ActividadPlanLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ActividadPlanLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ActividadPlanLocalService service) {
	}

	private static ActividadPlanLocalService _service;
}
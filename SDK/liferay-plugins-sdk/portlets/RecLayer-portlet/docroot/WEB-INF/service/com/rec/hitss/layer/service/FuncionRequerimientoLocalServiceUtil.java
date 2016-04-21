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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for FuncionRequerimiento. This utility wraps
 * {@link com.rec.hitss.layer.service.impl.FuncionRequerimientoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Crossfire
 * @see FuncionRequerimientoLocalService
 * @see com.rec.hitss.layer.service.base.FuncionRequerimientoLocalServiceBaseImpl
 * @see com.rec.hitss.layer.service.impl.FuncionRequerimientoLocalServiceImpl
 * @generated
 */
public class FuncionRequerimientoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rec.hitss.layer.service.impl.FuncionRequerimientoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the funcion requerimiento to the database. Also notifies the appropriate model listeners.
	*
	* @param funcionRequerimiento the funcion requerimiento
	* @return the funcion requerimiento that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.FuncionRequerimiento addFuncionRequerimiento(
		com.rec.hitss.layer.model.FuncionRequerimiento funcionRequerimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addFuncionRequerimiento(funcionRequerimiento);
	}

	/**
	* Creates a new funcion requerimiento with the primary key. Does not add the funcion requerimiento to the database.
	*
	* @param funcionId the primary key for the new funcion requerimiento
	* @return the new funcion requerimiento
	*/
	public static com.rec.hitss.layer.model.FuncionRequerimiento createFuncionRequerimiento(
		long funcionId) {
		return getService().createFuncionRequerimiento(funcionId);
	}

	/**
	* Deletes the funcion requerimiento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param funcionId the primary key of the funcion requerimiento
	* @return the funcion requerimiento that was removed
	* @throws PortalException if a funcion requerimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.FuncionRequerimiento deleteFuncionRequerimiento(
		long funcionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFuncionRequerimiento(funcionId);
	}

	/**
	* Deletes the funcion requerimiento from the database. Also notifies the appropriate model listeners.
	*
	* @param funcionRequerimiento the funcion requerimiento
	* @return the funcion requerimiento that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.FuncionRequerimiento deleteFuncionRequerimiento(
		com.rec.hitss.layer.model.FuncionRequerimiento funcionRequerimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFuncionRequerimiento(funcionRequerimiento);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.FuncionRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.FuncionRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.rec.hitss.layer.model.FuncionRequerimiento fetchFuncionRequerimiento(
		long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchFuncionRequerimiento(funcionId);
	}

	/**
	* Returns the funcion requerimiento with the primary key.
	*
	* @param funcionId the primary key of the funcion requerimiento
	* @return the funcion requerimiento
	* @throws PortalException if a funcion requerimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.FuncionRequerimiento getFuncionRequerimiento(
		long funcionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFuncionRequerimiento(funcionId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the funcion requerimientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.FuncionRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of funcion requerimientos
	* @param end the upper bound of the range of funcion requerimientos (not inclusive)
	* @return the range of funcion requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.FuncionRequerimiento> getFuncionRequerimientos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFuncionRequerimientos(start, end);
	}

	/**
	* Returns the number of funcion requerimientos.
	*
	* @return the number of funcion requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public static int getFuncionRequerimientosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFuncionRequerimientosCount();
	}

	/**
	* Updates the funcion requerimiento in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param funcionRequerimiento the funcion requerimiento
	* @return the funcion requerimiento that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.FuncionRequerimiento updateFuncionRequerimiento(
		com.rec.hitss.layer.model.FuncionRequerimiento funcionRequerimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFuncionRequerimiento(funcionRequerimiento);
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

	public static FuncionRequerimientoLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					FuncionRequerimientoLocalService.class.getName());

			if (invokableLocalService instanceof FuncionRequerimientoLocalService) {
				_service = (FuncionRequerimientoLocalService)invokableLocalService;
			}
			else {
				_service = new FuncionRequerimientoLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(FuncionRequerimientoLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(FuncionRequerimientoLocalService service) {
	}

	private static FuncionRequerimientoLocalService _service;
}
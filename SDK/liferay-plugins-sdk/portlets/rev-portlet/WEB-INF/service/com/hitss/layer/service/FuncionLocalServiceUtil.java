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
 * Provides the local service utility for Funcion. This utility wraps
 * {@link com.hitss.layer.service.impl.FuncionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Danielle Delgado
 * @see FuncionLocalService
 * @see com.hitss.layer.service.base.FuncionLocalServiceBaseImpl
 * @see com.hitss.layer.service.impl.FuncionLocalServiceImpl
 * @generated
 */
public class FuncionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.hitss.layer.service.impl.FuncionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the funcion to the database. Also notifies the appropriate model listeners.
	*
	* @param funcion the funcion
	* @return the funcion that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion addFuncion(
		com.hitss.layer.model.Funcion funcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addFuncion(funcion);
	}

	/**
	* Creates a new funcion with the primary key. Does not add the funcion to the database.
	*
	* @param funcionId the primary key for the new funcion
	* @return the new funcion
	*/
	public static com.hitss.layer.model.Funcion createFuncion(long funcionId) {
		return getService().createFuncion(funcionId);
	}

	/**
	* Deletes the funcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param funcionId the primary key of the funcion
	* @return the funcion that was removed
	* @throws PortalException if a funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion deleteFuncion(long funcionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFuncion(funcionId);
	}

	/**
	* Deletes the funcion from the database. Also notifies the appropriate model listeners.
	*
	* @param funcion the funcion
	* @return the funcion that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion deleteFuncion(
		com.hitss.layer.model.Funcion funcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFuncion(funcion);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.hitss.layer.model.Funcion fetchFuncion(long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchFuncion(funcionId);
	}

	/**
	* Returns the funcion with the primary key.
	*
	* @param funcionId the primary key of the funcion
	* @return the funcion
	* @throws PortalException if a funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion getFuncion(long funcionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFuncion(funcionId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the funcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of funcions
	* @param end the upper bound of the range of funcions (not inclusive)
	* @return the range of funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Funcion> getFuncions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFuncions(start, end);
	}

	/**
	* Returns the number of funcions.
	*
	* @return the number of funcions
	* @throws SystemException if a system exception occurred
	*/
	public static int getFuncionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFuncionsCount();
	}

	/**
	* Updates the funcion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param funcion the funcion
	* @return the funcion that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion updateFuncion(
		com.hitss.layer.model.Funcion funcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFuncion(funcion);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addSolicitudRequerimientoFuncion(
		long solicitudRequerimientoId, long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addSolicitudRequerimientoFuncion(solicitudRequerimientoId,
			funcionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addSolicitudRequerimientoFuncion(
		long solicitudRequerimientoId, com.hitss.layer.model.Funcion funcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addSolicitudRequerimientoFuncion(solicitudRequerimientoId, funcion);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addSolicitudRequerimientoFuncions(
		long solicitudRequerimientoId, long[] funcionIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addSolicitudRequerimientoFuncions(solicitudRequerimientoId,
			funcionIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addSolicitudRequerimientoFuncions(
		long solicitudRequerimientoId,
		java.util.List<com.hitss.layer.model.Funcion> Funcions)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addSolicitudRequerimientoFuncions(solicitudRequerimientoId,
			Funcions);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearSolicitudRequerimientoFuncions(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.clearSolicitudRequerimientoFuncions(solicitudRequerimientoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSolicitudRequerimientoFuncion(
		long solicitudRequerimientoId, long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteSolicitudRequerimientoFuncion(solicitudRequerimientoId,
			funcionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSolicitudRequerimientoFuncion(
		long solicitudRequerimientoId, com.hitss.layer.model.Funcion funcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteSolicitudRequerimientoFuncion(solicitudRequerimientoId,
			funcion);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSolicitudRequerimientoFuncions(
		long solicitudRequerimientoId, long[] funcionIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteSolicitudRequerimientoFuncions(solicitudRequerimientoId,
			funcionIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSolicitudRequerimientoFuncions(
		long solicitudRequerimientoId,
		java.util.List<com.hitss.layer.model.Funcion> Funcions)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteSolicitudRequerimientoFuncions(solicitudRequerimientoId,
			Funcions);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Funcion> getSolicitudRequerimientoFuncions(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getSolicitudRequerimientoFuncions(solicitudRequerimientoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Funcion> getSolicitudRequerimientoFuncions(
		long solicitudRequerimientoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getSolicitudRequerimientoFuncions(solicitudRequerimientoId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Funcion> getSolicitudRequerimientoFuncions(
		long solicitudRequerimientoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getSolicitudRequerimientoFuncions(solicitudRequerimientoId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getSolicitudRequerimientoFuncionsCount(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getSolicitudRequerimientoFuncionsCount(solicitudRequerimientoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasSolicitudRequerimientoFuncion(
		long solicitudRequerimientoId, long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasSolicitudRequerimientoFuncion(solicitudRequerimientoId,
			funcionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasSolicitudRequerimientoFuncions(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasSolicitudRequerimientoFuncions(solicitudRequerimientoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setSolicitudRequerimientoFuncions(
		long solicitudRequerimientoId, long[] funcionIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.setSolicitudRequerimientoFuncions(solicitudRequerimientoId,
			funcionIds);
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

	public static FuncionLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					FuncionLocalService.class.getName());

			if (invokableLocalService instanceof FuncionLocalService) {
				_service = (FuncionLocalService)invokableLocalService;
			}
			else {
				_service = new FuncionLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(FuncionLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(FuncionLocalService service) {
	}

	private static FuncionLocalService _service;
}
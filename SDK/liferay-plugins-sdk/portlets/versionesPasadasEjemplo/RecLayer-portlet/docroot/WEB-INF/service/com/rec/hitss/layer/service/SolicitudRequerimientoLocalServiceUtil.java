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
 * Provides the local service utility for SolicitudRequerimiento. This utility wraps
 * {@link com.rec.hitss.layer.service.impl.SolicitudRequerimientoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Crossfire
 * @see SolicitudRequerimientoLocalService
 * @see com.rec.hitss.layer.service.base.SolicitudRequerimientoLocalServiceBaseImpl
 * @see com.rec.hitss.layer.service.impl.SolicitudRequerimientoLocalServiceImpl
 * @generated
 */
public class SolicitudRequerimientoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rec.hitss.layer.service.impl.SolicitudRequerimientoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the solicitud requerimiento to the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimiento the solicitud requerimiento
	* @return the solicitud requerimiento that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento addSolicitudRequerimiento(
		com.rec.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSolicitudRequerimiento(solicitudRequerimiento);
	}

	/**
	* Creates a new solicitud requerimiento with the primary key. Does not add the solicitud requerimiento to the database.
	*
	* @param solicitudRequerimientoId the primary key for the new solicitud requerimiento
	* @return the new solicitud requerimiento
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento createSolicitudRequerimiento(
		long solicitudRequerimientoId) {
		return getService()
				   .createSolicitudRequerimiento(solicitudRequerimientoId);
	}

	/**
	* Deletes the solicitud requerimiento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoId the primary key of the solicitud requerimiento
	* @return the solicitud requerimiento that was removed
	* @throws PortalException if a solicitud requerimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento deleteSolicitudRequerimiento(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteSolicitudRequerimiento(solicitudRequerimientoId);
	}

	/**
	* Deletes the solicitud requerimiento from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimiento the solicitud requerimiento
	* @return the solicitud requerimiento that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento deleteSolicitudRequerimiento(
		com.rec.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSolicitudRequerimiento(solicitudRequerimiento);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.rec.hitss.layer.model.SolicitudRequerimiento fetchSolicitudRequerimiento(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSolicitudRequerimiento(solicitudRequerimientoId);
	}

	/**
	* Returns the solicitud requerimiento with the primary key.
	*
	* @param solicitudRequerimientoId the primary key of the solicitud requerimiento
	* @return the solicitud requerimiento
	* @throws PortalException if a solicitud requerimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento getSolicitudRequerimiento(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSolicitudRequerimiento(solicitudRequerimientoId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the solicitud requerimientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud requerimientos
	* @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	* @return the range of solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.SolicitudRequerimiento> getSolicitudRequerimientos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSolicitudRequerimientos(start, end);
	}

	/**
	* Returns the number of solicitud requerimientos.
	*
	* @return the number of solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public static int getSolicitudRequerimientosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSolicitudRequerimientosCount();
	}

	/**
	* Updates the solicitud requerimiento in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimiento the solicitud requerimiento
	* @return the solicitud requerimiento that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento updateSolicitudRequerimiento(
		com.rec.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSolicitudRequerimiento(solicitudRequerimiento);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addFuncionSolicitudRequerimiento(long funcionId,
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addFuncionSolicitudRequerimiento(funcionId,
			solicitudRequerimientoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addFuncionSolicitudRequerimiento(long funcionId,
		com.rec.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addFuncionSolicitudRequerimiento(funcionId, solicitudRequerimiento);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addFuncionSolicitudRequerimientos(long funcionId,
		long[] solicitudRequerimientoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addFuncionSolicitudRequerimientos(funcionId,
			solicitudRequerimientoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addFuncionSolicitudRequerimientos(long funcionId,
		java.util.List<com.rec.hitss.layer.model.SolicitudRequerimiento> SolicitudRequerimientos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addFuncionSolicitudRequerimientos(funcionId,
			SolicitudRequerimientos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearFuncionSolicitudRequerimientos(long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearFuncionSolicitudRequerimientos(funcionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteFuncionSolicitudRequerimiento(long funcionId,
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteFuncionSolicitudRequerimiento(funcionId,
			solicitudRequerimientoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteFuncionSolicitudRequerimiento(long funcionId,
		com.rec.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteFuncionSolicitudRequerimiento(funcionId,
			solicitudRequerimiento);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteFuncionSolicitudRequerimientos(long funcionId,
		long[] solicitudRequerimientoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteFuncionSolicitudRequerimientos(funcionId,
			solicitudRequerimientoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteFuncionSolicitudRequerimientos(long funcionId,
		java.util.List<com.rec.hitss.layer.model.SolicitudRequerimiento> SolicitudRequerimientos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteFuncionSolicitudRequerimientos(funcionId,
			SolicitudRequerimientos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.SolicitudRequerimiento> getFuncionSolicitudRequerimientos(
		long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFuncionSolicitudRequerimientos(funcionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.SolicitudRequerimiento> getFuncionSolicitudRequerimientos(
		long funcionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getFuncionSolicitudRequerimientos(funcionId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.SolicitudRequerimiento> getFuncionSolicitudRequerimientos(
		long funcionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getFuncionSolicitudRequerimientos(funcionId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getFuncionSolicitudRequerimientosCount(long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFuncionSolicitudRequerimientosCount(funcionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasFuncionSolicitudRequerimiento(long funcionId,
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasFuncionSolicitudRequerimiento(funcionId,
			solicitudRequerimientoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasFuncionSolicitudRequerimientos(long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasFuncionSolicitudRequerimientos(funcionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setFuncionSolicitudRequerimientos(long funcionId,
		long[] solicitudRequerimientoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.setFuncionSolicitudRequerimientos(funcionId,
			solicitudRequerimientoIds);
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

	public static SolicitudRequerimientoLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SolicitudRequerimientoLocalService.class.getName());

			if (invokableLocalService instanceof SolicitudRequerimientoLocalService) {
				_service = (SolicitudRequerimientoLocalService)invokableLocalService;
			}
			else {
				_service = new SolicitudRequerimientoLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(SolicitudRequerimientoLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(SolicitudRequerimientoLocalService service) {
	}

	private static SolicitudRequerimientoLocalService _service;
}
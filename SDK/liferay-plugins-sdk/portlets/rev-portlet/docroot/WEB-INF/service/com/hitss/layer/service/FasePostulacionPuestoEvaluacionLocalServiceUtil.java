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
 * Provides the local service utility for FasePostulacionPuestoEvaluacion. This utility wraps
 * {@link com.hitss.layer.service.impl.FasePostulacionPuestoEvaluacionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Danielle Delgado
 * @see FasePostulacionPuestoEvaluacionLocalService
 * @see com.hitss.layer.service.base.FasePostulacionPuestoEvaluacionLocalServiceBaseImpl
 * @see com.hitss.layer.service.impl.FasePostulacionPuestoEvaluacionLocalServiceImpl
 * @generated
 */
public class FasePostulacionPuestoEvaluacionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.hitss.layer.service.impl.FasePostulacionPuestoEvaluacionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the fase postulacion puesto evaluacion to the database. Also notifies the appropriate model listeners.
	*
	* @param fasePostulacionPuestoEvaluacion the fase postulacion puesto evaluacion
	* @return the fase postulacion puesto evaluacion that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion addFasePostulacionPuestoEvaluacion(
		com.hitss.layer.model.FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addFasePostulacionPuestoEvaluacion(fasePostulacionPuestoEvaluacion);
	}

	/**
	* Creates a new fase postulacion puesto evaluacion with the primary key. Does not add the fase postulacion puesto evaluacion to the database.
	*
	* @param fasePostulacionPuestoEvaluacionPK the primary key for the new fase postulacion puesto evaluacion
	* @return the new fase postulacion puesto evaluacion
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion createFasePostulacionPuestoEvaluacion(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK) {
		return getService()
				   .createFasePostulacionPuestoEvaluacion(fasePostulacionPuestoEvaluacionPK);
	}

	/**
	* Deletes the fase postulacion puesto evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fasePostulacionPuestoEvaluacionPK the primary key of the fase postulacion puesto evaluacion
	* @return the fase postulacion puesto evaluacion that was removed
	* @throws PortalException if a fase postulacion puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion deleteFasePostulacionPuestoEvaluacion(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteFasePostulacionPuestoEvaluacion(fasePostulacionPuestoEvaluacionPK);
	}

	/**
	* Deletes the fase postulacion puesto evaluacion from the database. Also notifies the appropriate model listeners.
	*
	* @param fasePostulacionPuestoEvaluacion the fase postulacion puesto evaluacion
	* @return the fase postulacion puesto evaluacion that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion deleteFasePostulacionPuestoEvaluacion(
		com.hitss.layer.model.FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteFasePostulacionPuestoEvaluacion(fasePostulacionPuestoEvaluacion);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion fetchFasePostulacionPuestoEvaluacion(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchFasePostulacionPuestoEvaluacion(fasePostulacionPuestoEvaluacionPK);
	}

	/**
	* Returns the fase postulacion puesto evaluacion with the primary key.
	*
	* @param fasePostulacionPuestoEvaluacionPK the primary key of the fase postulacion puesto evaluacion
	* @return the fase postulacion puesto evaluacion
	* @throws PortalException if a fase postulacion puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion getFasePostulacionPuestoEvaluacion(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getFasePostulacionPuestoEvaluacion(fasePostulacionPuestoEvaluacionPK);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the fase postulacion puesto evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fase postulacion puesto evaluacions
	* @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	* @return the range of fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> getFasePostulacionPuestoEvaluacions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFasePostulacionPuestoEvaluacions(start, end);
	}

	/**
	* Returns the number of fase postulacion puesto evaluacions.
	*
	* @return the number of fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static int getFasePostulacionPuestoEvaluacionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFasePostulacionPuestoEvaluacionsCount();
	}

	/**
	* Updates the fase postulacion puesto evaluacion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param fasePostulacionPuestoEvaluacion the fase postulacion puesto evaluacion
	* @return the fase postulacion puesto evaluacion that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion updateFasePostulacionPuestoEvaluacion(
		com.hitss.layer.model.FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateFasePostulacionPuestoEvaluacion(fasePostulacionPuestoEvaluacion);
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

	public static FasePostulacionPuestoEvaluacionLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					FasePostulacionPuestoEvaluacionLocalService.class.getName());

			if (invokableLocalService instanceof FasePostulacionPuestoEvaluacionLocalService) {
				_service = (FasePostulacionPuestoEvaluacionLocalService)invokableLocalService;
			}
			else {
				_service = new FasePostulacionPuestoEvaluacionLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(FasePostulacionPuestoEvaluacionLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(FasePostulacionPuestoEvaluacionLocalService service) {
	}

	private static FasePostulacionPuestoEvaluacionLocalService _service;
}
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
 * Provides the local service utility for EvaluacionPregunta. This utility wraps
 * {@link com.rec.hitss.layer.service.impl.EvaluacionPreguntaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Crossfire
 * @see EvaluacionPreguntaLocalService
 * @see com.rec.hitss.layer.service.base.EvaluacionPreguntaLocalServiceBaseImpl
 * @see com.rec.hitss.layer.service.impl.EvaluacionPreguntaLocalServiceImpl
 * @generated
 */
public class EvaluacionPreguntaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rec.hitss.layer.service.impl.EvaluacionPreguntaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the evaluacion pregunta to the database. Also notifies the appropriate model listeners.
	*
	* @param evaluacionPregunta the evaluacion pregunta
	* @return the evaluacion pregunta that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.EvaluacionPregunta addEvaluacionPregunta(
		com.rec.hitss.layer.model.EvaluacionPregunta evaluacionPregunta)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEvaluacionPregunta(evaluacionPregunta);
	}

	/**
	* Creates a new evaluacion pregunta with the primary key. Does not add the evaluacion pregunta to the database.
	*
	* @param evaluacionPreguntaId the primary key for the new evaluacion pregunta
	* @return the new evaluacion pregunta
	*/
	public static com.rec.hitss.layer.model.EvaluacionPregunta createEvaluacionPregunta(
		long evaluacionPreguntaId) {
		return getService().createEvaluacionPregunta(evaluacionPreguntaId);
	}

	/**
	* Deletes the evaluacion pregunta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param evaluacionPreguntaId the primary key of the evaluacion pregunta
	* @return the evaluacion pregunta that was removed
	* @throws PortalException if a evaluacion pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.EvaluacionPregunta deleteEvaluacionPregunta(
		long evaluacionPreguntaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEvaluacionPregunta(evaluacionPreguntaId);
	}

	/**
	* Deletes the evaluacion pregunta from the database. Also notifies the appropriate model listeners.
	*
	* @param evaluacionPregunta the evaluacion pregunta
	* @return the evaluacion pregunta that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.EvaluacionPregunta deleteEvaluacionPregunta(
		com.rec.hitss.layer.model.EvaluacionPregunta evaluacionPregunta)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEvaluacionPregunta(evaluacionPregunta);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EvaluacionPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EvaluacionPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.rec.hitss.layer.model.EvaluacionPregunta fetchEvaluacionPregunta(
		long evaluacionPreguntaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEvaluacionPregunta(evaluacionPreguntaId);
	}

	/**
	* Returns the evaluacion pregunta with the primary key.
	*
	* @param evaluacionPreguntaId the primary key of the evaluacion pregunta
	* @return the evaluacion pregunta
	* @throws PortalException if a evaluacion pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.EvaluacionPregunta getEvaluacionPregunta(
		long evaluacionPreguntaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEvaluacionPregunta(evaluacionPreguntaId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the evaluacion preguntas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EvaluacionPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of evaluacion preguntas
	* @param end the upper bound of the range of evaluacion preguntas (not inclusive)
	* @return the range of evaluacion preguntas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.EvaluacionPregunta> getEvaluacionPreguntas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEvaluacionPreguntas(start, end);
	}

	/**
	* Returns the number of evaluacion preguntas.
	*
	* @return the number of evaluacion preguntas
	* @throws SystemException if a system exception occurred
	*/
	public static int getEvaluacionPreguntasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEvaluacionPreguntasCount();
	}

	/**
	* Updates the evaluacion pregunta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param evaluacionPregunta the evaluacion pregunta
	* @return the evaluacion pregunta that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.EvaluacionPregunta updateEvaluacionPregunta(
		com.rec.hitss.layer.model.EvaluacionPregunta evaluacionPregunta)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEvaluacionPregunta(evaluacionPregunta);
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

	public static EvaluacionPreguntaLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EvaluacionPreguntaLocalService.class.getName());

			if (invokableLocalService instanceof EvaluacionPreguntaLocalService) {
				_service = (EvaluacionPreguntaLocalService)invokableLocalService;
			}
			else {
				_service = new EvaluacionPreguntaLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EvaluacionPreguntaLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(EvaluacionPreguntaLocalService service) {
	}

	private static EvaluacionPreguntaLocalService _service;
}
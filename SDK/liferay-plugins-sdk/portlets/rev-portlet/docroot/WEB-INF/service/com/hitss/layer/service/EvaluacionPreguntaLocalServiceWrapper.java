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
 * Provides a wrapper for {@link EvaluacionPreguntaLocalService}.
 *
 * @author Danielle Delgado
 * @see EvaluacionPreguntaLocalService
 * @generated
 */
public class EvaluacionPreguntaLocalServiceWrapper
	implements EvaluacionPreguntaLocalService,
		ServiceWrapper<EvaluacionPreguntaLocalService> {
	public EvaluacionPreguntaLocalServiceWrapper(
		EvaluacionPreguntaLocalService evaluacionPreguntaLocalService) {
		_evaluacionPreguntaLocalService = evaluacionPreguntaLocalService;
	}

	/**
	* Adds the evaluacion pregunta to the database. Also notifies the appropriate model listeners.
	*
	* @param evaluacionPregunta the evaluacion pregunta
	* @return the evaluacion pregunta that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.EvaluacionPregunta addEvaluacionPregunta(
		com.hitss.layer.model.EvaluacionPregunta evaluacionPregunta)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionPreguntaLocalService.addEvaluacionPregunta(evaluacionPregunta);
	}

	/**
	* Creates a new evaluacion pregunta with the primary key. Does not add the evaluacion pregunta to the database.
	*
	* @param evaluacionPreguntaPK the primary key for the new evaluacion pregunta
	* @return the new evaluacion pregunta
	*/
	@Override
	public com.hitss.layer.model.EvaluacionPregunta createEvaluacionPregunta(
		com.hitss.layer.service.persistence.EvaluacionPreguntaPK evaluacionPreguntaPK) {
		return _evaluacionPreguntaLocalService.createEvaluacionPregunta(evaluacionPreguntaPK);
	}

	/**
	* Deletes the evaluacion pregunta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param evaluacionPreguntaPK the primary key of the evaluacion pregunta
	* @return the evaluacion pregunta that was removed
	* @throws PortalException if a evaluacion pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.EvaluacionPregunta deleteEvaluacionPregunta(
		com.hitss.layer.service.persistence.EvaluacionPreguntaPK evaluacionPreguntaPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionPreguntaLocalService.deleteEvaluacionPregunta(evaluacionPreguntaPK);
	}

	/**
	* Deletes the evaluacion pregunta from the database. Also notifies the appropriate model listeners.
	*
	* @param evaluacionPregunta the evaluacion pregunta
	* @return the evaluacion pregunta that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.EvaluacionPregunta deleteEvaluacionPregunta(
		com.hitss.layer.model.EvaluacionPregunta evaluacionPregunta)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionPreguntaLocalService.deleteEvaluacionPregunta(evaluacionPregunta);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _evaluacionPreguntaLocalService.dynamicQuery();
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
		return _evaluacionPreguntaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EvaluacionPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _evaluacionPreguntaLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EvaluacionPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _evaluacionPreguntaLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _evaluacionPreguntaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _evaluacionPreguntaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.EvaluacionPregunta fetchEvaluacionPregunta(
		com.hitss.layer.service.persistence.EvaluacionPreguntaPK evaluacionPreguntaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionPreguntaLocalService.fetchEvaluacionPregunta(evaluacionPreguntaPK);
	}

	/**
	* Returns the evaluacion pregunta with the primary key.
	*
	* @param evaluacionPreguntaPK the primary key of the evaluacion pregunta
	* @return the evaluacion pregunta
	* @throws PortalException if a evaluacion pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.EvaluacionPregunta getEvaluacionPregunta(
		com.hitss.layer.service.persistence.EvaluacionPreguntaPK evaluacionPreguntaPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionPreguntaLocalService.getEvaluacionPregunta(evaluacionPreguntaPK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionPreguntaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the evaluacion preguntas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EvaluacionPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of evaluacion preguntas
	* @param end the upper bound of the range of evaluacion preguntas (not inclusive)
	* @return the range of evaluacion preguntas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.EvaluacionPregunta> getEvaluacionPreguntas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionPreguntaLocalService.getEvaluacionPreguntas(start, end);
	}

	/**
	* Returns the number of evaluacion preguntas.
	*
	* @return the number of evaluacion preguntas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEvaluacionPreguntasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionPreguntaLocalService.getEvaluacionPreguntasCount();
	}

	/**
	* Updates the evaluacion pregunta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param evaluacionPregunta the evaluacion pregunta
	* @return the evaluacion pregunta that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.EvaluacionPregunta updateEvaluacionPregunta(
		com.hitss.layer.model.EvaluacionPregunta evaluacionPregunta)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionPreguntaLocalService.updateEvaluacionPregunta(evaluacionPregunta);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _evaluacionPreguntaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_evaluacionPreguntaLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _evaluacionPreguntaLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EvaluacionPreguntaLocalService getWrappedEvaluacionPreguntaLocalService() {
		return _evaluacionPreguntaLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEvaluacionPreguntaLocalService(
		EvaluacionPreguntaLocalService evaluacionPreguntaLocalService) {
		_evaluacionPreguntaLocalService = evaluacionPreguntaLocalService;
	}

	@Override
	public EvaluacionPreguntaLocalService getWrappedService() {
		return _evaluacionPreguntaLocalService;
	}

	@Override
	public void setWrappedService(
		EvaluacionPreguntaLocalService evaluacionPreguntaLocalService) {
		_evaluacionPreguntaLocalService = evaluacionPreguntaLocalService;
	}

	private EvaluacionPreguntaLocalService _evaluacionPreguntaLocalService;
}
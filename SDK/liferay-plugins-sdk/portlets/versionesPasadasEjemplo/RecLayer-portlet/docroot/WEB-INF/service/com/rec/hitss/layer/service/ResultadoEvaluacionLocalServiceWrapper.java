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
 * Provides a wrapper for {@link ResultadoEvaluacionLocalService}.
 *
 * @author Crossfire
 * @see ResultadoEvaluacionLocalService
 * @generated
 */
public class ResultadoEvaluacionLocalServiceWrapper
	implements ResultadoEvaluacionLocalService,
		ServiceWrapper<ResultadoEvaluacionLocalService> {
	public ResultadoEvaluacionLocalServiceWrapper(
		ResultadoEvaluacionLocalService resultadoEvaluacionLocalService) {
		_resultadoEvaluacionLocalService = resultadoEvaluacionLocalService;
	}

	/**
	* Adds the resultado evaluacion to the database. Also notifies the appropriate model listeners.
	*
	* @param resultadoEvaluacion the resultado evaluacion
	* @return the resultado evaluacion that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.ResultadoEvaluacion addResultadoEvaluacion(
		com.rec.hitss.layer.model.ResultadoEvaluacion resultadoEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultadoEvaluacionLocalService.addResultadoEvaluacion(resultadoEvaluacion);
	}

	/**
	* Creates a new resultado evaluacion with the primary key. Does not add the resultado evaluacion to the database.
	*
	* @param resultadoEvaluacionId the primary key for the new resultado evaluacion
	* @return the new resultado evaluacion
	*/
	@Override
	public com.rec.hitss.layer.model.ResultadoEvaluacion createResultadoEvaluacion(
		long resultadoEvaluacionId) {
		return _resultadoEvaluacionLocalService.createResultadoEvaluacion(resultadoEvaluacionId);
	}

	/**
	* Deletes the resultado evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resultadoEvaluacionId the primary key of the resultado evaluacion
	* @return the resultado evaluacion that was removed
	* @throws PortalException if a resultado evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.ResultadoEvaluacion deleteResultadoEvaluacion(
		long resultadoEvaluacionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resultadoEvaluacionLocalService.deleteResultadoEvaluacion(resultadoEvaluacionId);
	}

	/**
	* Deletes the resultado evaluacion from the database. Also notifies the appropriate model listeners.
	*
	* @param resultadoEvaluacion the resultado evaluacion
	* @return the resultado evaluacion that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.ResultadoEvaluacion deleteResultadoEvaluacion(
		com.rec.hitss.layer.model.ResultadoEvaluacion resultadoEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultadoEvaluacionLocalService.deleteResultadoEvaluacion(resultadoEvaluacion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _resultadoEvaluacionLocalService.dynamicQuery();
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
		return _resultadoEvaluacionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ResultadoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _resultadoEvaluacionLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ResultadoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _resultadoEvaluacionLocalService.dynamicQuery(dynamicQuery,
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
		return _resultadoEvaluacionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _resultadoEvaluacionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.ResultadoEvaluacion fetchResultadoEvaluacion(
		long resultadoEvaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultadoEvaluacionLocalService.fetchResultadoEvaluacion(resultadoEvaluacionId);
	}

	/**
	* Returns the resultado evaluacion with the primary key.
	*
	* @param resultadoEvaluacionId the primary key of the resultado evaluacion
	* @return the resultado evaluacion
	* @throws PortalException if a resultado evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.ResultadoEvaluacion getResultadoEvaluacion(
		long resultadoEvaluacionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resultadoEvaluacionLocalService.getResultadoEvaluacion(resultadoEvaluacionId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resultadoEvaluacionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the resultado evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ResultadoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of resultado evaluacions
	* @param end the upper bound of the range of resultado evaluacions (not inclusive)
	* @return the range of resultado evaluacions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.ResultadoEvaluacion> getResultadoEvaluacions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultadoEvaluacionLocalService.getResultadoEvaluacions(start,
			end);
	}

	/**
	* Returns the number of resultado evaluacions.
	*
	* @return the number of resultado evaluacions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getResultadoEvaluacionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultadoEvaluacionLocalService.getResultadoEvaluacionsCount();
	}

	/**
	* Updates the resultado evaluacion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultadoEvaluacion the resultado evaluacion
	* @return the resultado evaluacion that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.ResultadoEvaluacion updateResultadoEvaluacion(
		com.rec.hitss.layer.model.ResultadoEvaluacion resultadoEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultadoEvaluacionLocalService.updateResultadoEvaluacion(resultadoEvaluacion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _resultadoEvaluacionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_resultadoEvaluacionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _resultadoEvaluacionLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ResultadoEvaluacionLocalService getWrappedResultadoEvaluacionLocalService() {
		return _resultadoEvaluacionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedResultadoEvaluacionLocalService(
		ResultadoEvaluacionLocalService resultadoEvaluacionLocalService) {
		_resultadoEvaluacionLocalService = resultadoEvaluacionLocalService;
	}

	@Override
	public ResultadoEvaluacionLocalService getWrappedService() {
		return _resultadoEvaluacionLocalService;
	}

	@Override
	public void setWrappedService(
		ResultadoEvaluacionLocalService resultadoEvaluacionLocalService) {
		_resultadoEvaluacionLocalService = resultadoEvaluacionLocalService;
	}

	private ResultadoEvaluacionLocalService _resultadoEvaluacionLocalService;
}
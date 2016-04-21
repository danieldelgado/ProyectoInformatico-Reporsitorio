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
 * Provides a wrapper for {@link CronogramaEvaluacionPersonalLocalService}.
 *
 * @author Crossfire
 * @see CronogramaEvaluacionPersonalLocalService
 * @generated
 */
public class CronogramaEvaluacionPersonalLocalServiceWrapper
	implements CronogramaEvaluacionPersonalLocalService,
		ServiceWrapper<CronogramaEvaluacionPersonalLocalService> {
	public CronogramaEvaluacionPersonalLocalServiceWrapper(
		CronogramaEvaluacionPersonalLocalService cronogramaEvaluacionPersonalLocalService) {
		_cronogramaEvaluacionPersonalLocalService = cronogramaEvaluacionPersonalLocalService;
	}

	/**
	* Adds the cronograma evaluacion personal to the database. Also notifies the appropriate model listeners.
	*
	* @param cronogramaEvaluacionPersonal the cronograma evaluacion personal
	* @return the cronograma evaluacion personal that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.CronogramaEvaluacionPersonal addCronogramaEvaluacionPersonal(
		com.rec.hitss.layer.model.CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaEvaluacionPersonalLocalService.addCronogramaEvaluacionPersonal(cronogramaEvaluacionPersonal);
	}

	/**
	* Creates a new cronograma evaluacion personal with the primary key. Does not add the cronograma evaluacion personal to the database.
	*
	* @param cronogramaEvaluacionPersonalId the primary key for the new cronograma evaluacion personal
	* @return the new cronograma evaluacion personal
	*/
	@Override
	public com.rec.hitss.layer.model.CronogramaEvaluacionPersonal createCronogramaEvaluacionPersonal(
		long cronogramaEvaluacionPersonalId) {
		return _cronogramaEvaluacionPersonalLocalService.createCronogramaEvaluacionPersonal(cronogramaEvaluacionPersonalId);
	}

	/**
	* Deletes the cronograma evaluacion personal with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cronogramaEvaluacionPersonalId the primary key of the cronograma evaluacion personal
	* @return the cronograma evaluacion personal that was removed
	* @throws PortalException if a cronograma evaluacion personal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.CronogramaEvaluacionPersonal deleteCronogramaEvaluacionPersonal(
		long cronogramaEvaluacionPersonalId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaEvaluacionPersonalLocalService.deleteCronogramaEvaluacionPersonal(cronogramaEvaluacionPersonalId);
	}

	/**
	* Deletes the cronograma evaluacion personal from the database. Also notifies the appropriate model listeners.
	*
	* @param cronogramaEvaluacionPersonal the cronograma evaluacion personal
	* @return the cronograma evaluacion personal that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.CronogramaEvaluacionPersonal deleteCronogramaEvaluacionPersonal(
		com.rec.hitss.layer.model.CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaEvaluacionPersonalLocalService.deleteCronogramaEvaluacionPersonal(cronogramaEvaluacionPersonal);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cronogramaEvaluacionPersonalLocalService.dynamicQuery();
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
		return _cronogramaEvaluacionPersonalLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.CronogramaEvaluacionPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cronogramaEvaluacionPersonalLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.CronogramaEvaluacionPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cronogramaEvaluacionPersonalLocalService.dynamicQuery(dynamicQuery,
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
		return _cronogramaEvaluacionPersonalLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cronogramaEvaluacionPersonalLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.CronogramaEvaluacionPersonal fetchCronogramaEvaluacionPersonal(
		long cronogramaEvaluacionPersonalId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaEvaluacionPersonalLocalService.fetchCronogramaEvaluacionPersonal(cronogramaEvaluacionPersonalId);
	}

	/**
	* Returns the cronograma evaluacion personal with the primary key.
	*
	* @param cronogramaEvaluacionPersonalId the primary key of the cronograma evaluacion personal
	* @return the cronograma evaluacion personal
	* @throws PortalException if a cronograma evaluacion personal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.CronogramaEvaluacionPersonal getCronogramaEvaluacionPersonal(
		long cronogramaEvaluacionPersonalId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaEvaluacionPersonalLocalService.getCronogramaEvaluacionPersonal(cronogramaEvaluacionPersonalId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaEvaluacionPersonalLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the cronograma evaluacion personals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.CronogramaEvaluacionPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cronograma evaluacion personals
	* @param end the upper bound of the range of cronograma evaluacion personals (not inclusive)
	* @return the range of cronograma evaluacion personals
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.CronogramaEvaluacionPersonal> getCronogramaEvaluacionPersonals(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaEvaluacionPersonalLocalService.getCronogramaEvaluacionPersonals(start,
			end);
	}

	/**
	* Returns the number of cronograma evaluacion personals.
	*
	* @return the number of cronograma evaluacion personals
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCronogramaEvaluacionPersonalsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaEvaluacionPersonalLocalService.getCronogramaEvaluacionPersonalsCount();
	}

	/**
	* Updates the cronograma evaluacion personal in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cronogramaEvaluacionPersonal the cronograma evaluacion personal
	* @return the cronograma evaluacion personal that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.CronogramaEvaluacionPersonal updateCronogramaEvaluacionPersonal(
		com.rec.hitss.layer.model.CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaEvaluacionPersonalLocalService.updateCronogramaEvaluacionPersonal(cronogramaEvaluacionPersonal);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _cronogramaEvaluacionPersonalLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_cronogramaEvaluacionPersonalLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cronogramaEvaluacionPersonalLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CronogramaEvaluacionPersonalLocalService getWrappedCronogramaEvaluacionPersonalLocalService() {
		return _cronogramaEvaluacionPersonalLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCronogramaEvaluacionPersonalLocalService(
		CronogramaEvaluacionPersonalLocalService cronogramaEvaluacionPersonalLocalService) {
		_cronogramaEvaluacionPersonalLocalService = cronogramaEvaluacionPersonalLocalService;
	}

	@Override
	public CronogramaEvaluacionPersonalLocalService getWrappedService() {
		return _cronogramaEvaluacionPersonalLocalService;
	}

	@Override
	public void setWrappedService(
		CronogramaEvaluacionPersonalLocalService cronogramaEvaluacionPersonalLocalService) {
		_cronogramaEvaluacionPersonalLocalService = cronogramaEvaluacionPersonalLocalService;
	}

	private CronogramaEvaluacionPersonalLocalService _cronogramaEvaluacionPersonalLocalService;
}
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
 * Provides a wrapper for {@link CronogramaLocalService}.
 *
 * @author Danielle Delgado
 * @see CronogramaLocalService
 * @generated
 */
public class CronogramaLocalServiceWrapper implements CronogramaLocalService,
	ServiceWrapper<CronogramaLocalService> {
	public CronogramaLocalServiceWrapper(
		CronogramaLocalService cronogramaLocalService) {
		_cronogramaLocalService = cronogramaLocalService;
	}

	/**
	* Adds the cronograma to the database. Also notifies the appropriate model listeners.
	*
	* @param cronograma the cronograma
	* @return the cronograma that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Cronograma addCronograma(
		com.hitss.layer.model.Cronograma cronograma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaLocalService.addCronograma(cronograma);
	}

	/**
	* Creates a new cronograma with the primary key. Does not add the cronograma to the database.
	*
	* @param cronogramaId the primary key for the new cronograma
	* @return the new cronograma
	*/
	@Override
	public com.hitss.layer.model.Cronograma createCronograma(long cronogramaId) {
		return _cronogramaLocalService.createCronograma(cronogramaId);
	}

	/**
	* Deletes the cronograma with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cronogramaId the primary key of the cronograma
	* @return the cronograma that was removed
	* @throws PortalException if a cronograma with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Cronograma deleteCronograma(long cronogramaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaLocalService.deleteCronograma(cronogramaId);
	}

	/**
	* Deletes the cronograma from the database. Also notifies the appropriate model listeners.
	*
	* @param cronograma the cronograma
	* @return the cronograma that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Cronograma deleteCronograma(
		com.hitss.layer.model.Cronograma cronograma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaLocalService.deleteCronograma(cronograma);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cronogramaLocalService.dynamicQuery();
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
		return _cronogramaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.CronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cronogramaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.CronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cronogramaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _cronogramaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cronogramaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.Cronograma fetchCronograma(long cronogramaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaLocalService.fetchCronograma(cronogramaId);
	}

	/**
	* Returns the cronograma with the primary key.
	*
	* @param cronogramaId the primary key of the cronograma
	* @return the cronograma
	* @throws PortalException if a cronograma with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Cronograma getCronograma(long cronogramaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaLocalService.getCronograma(cronogramaId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the cronogramas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.CronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cronogramas
	* @param end the upper bound of the range of cronogramas (not inclusive)
	* @return the range of cronogramas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.Cronograma> getCronogramas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaLocalService.getCronogramas(start, end);
	}

	/**
	* Returns the number of cronogramas.
	*
	* @return the number of cronogramas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCronogramasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaLocalService.getCronogramasCount();
	}

	/**
	* Updates the cronograma in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cronograma the cronograma
	* @return the cronograma that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Cronograma updateCronograma(
		com.hitss.layer.model.Cronograma cronograma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaLocalService.updateCronograma(cronograma);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _cronogramaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_cronogramaLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cronogramaLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.hitss.layer.model.Cronograma getCronogramaBySolicitud(
		java.lang.Long solicitudId)
		throws com.hitss.layer.NoSuchCronogramaException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cronogramaLocalService.getCronogramaBySolicitud(solicitudId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CronogramaLocalService getWrappedCronogramaLocalService() {
		return _cronogramaLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCronogramaLocalService(
		CronogramaLocalService cronogramaLocalService) {
		_cronogramaLocalService = cronogramaLocalService;
	}

	@Override
	public CronogramaLocalService getWrappedService() {
		return _cronogramaLocalService;
	}

	@Override
	public void setWrappedService(CronogramaLocalService cronogramaLocalService) {
		_cronogramaLocalService = cronogramaLocalService;
	}

	private CronogramaLocalService _cronogramaLocalService;
}
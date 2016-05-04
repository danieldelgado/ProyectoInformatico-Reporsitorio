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
 * Provides a wrapper for {@link LogOperacionesLocalService}.
 *
 * @author Danielle Delgado
 * @see LogOperacionesLocalService
 * @generated
 */
public class LogOperacionesLocalServiceWrapper
	implements LogOperacionesLocalService,
		ServiceWrapper<LogOperacionesLocalService> {
	public LogOperacionesLocalServiceWrapper(
		LogOperacionesLocalService logOperacionesLocalService) {
		_logOperacionesLocalService = logOperacionesLocalService;
	}

	/**
	* Adds the log operaciones to the database. Also notifies the appropriate model listeners.
	*
	* @param logOperaciones the log operaciones
	* @return the log operaciones that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.LogOperaciones addLogOperaciones(
		com.hitss.layer.model.LogOperaciones logOperaciones)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _logOperacionesLocalService.addLogOperaciones(logOperaciones);
	}

	/**
	* Creates a new log operaciones with the primary key. Does not add the log operaciones to the database.
	*
	* @param logOperacionesId the primary key for the new log operaciones
	* @return the new log operaciones
	*/
	@Override
	public com.hitss.layer.model.LogOperaciones createLogOperaciones(
		long logOperacionesId) {
		return _logOperacionesLocalService.createLogOperaciones(logOperacionesId);
	}

	/**
	* Deletes the log operaciones with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param logOperacionesId the primary key of the log operaciones
	* @return the log operaciones that was removed
	* @throws PortalException if a log operaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.LogOperaciones deleteLogOperaciones(
		long logOperacionesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _logOperacionesLocalService.deleteLogOperaciones(logOperacionesId);
	}

	/**
	* Deletes the log operaciones from the database. Also notifies the appropriate model listeners.
	*
	* @param logOperaciones the log operaciones
	* @return the log operaciones that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.LogOperaciones deleteLogOperaciones(
		com.hitss.layer.model.LogOperaciones logOperaciones)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _logOperacionesLocalService.deleteLogOperaciones(logOperaciones);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _logOperacionesLocalService.dynamicQuery();
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
		return _logOperacionesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.LogOperacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _logOperacionesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.LogOperacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _logOperacionesLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _logOperacionesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _logOperacionesLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.LogOperaciones fetchLogOperaciones(
		long logOperacionesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _logOperacionesLocalService.fetchLogOperaciones(logOperacionesId);
	}

	/**
	* Returns the log operaciones with the primary key.
	*
	* @param logOperacionesId the primary key of the log operaciones
	* @return the log operaciones
	* @throws PortalException if a log operaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.LogOperaciones getLogOperaciones(
		long logOperacionesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _logOperacionesLocalService.getLogOperaciones(logOperacionesId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _logOperacionesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the log operacioneses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.LogOperacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of log operacioneses
	* @param end the upper bound of the range of log operacioneses (not inclusive)
	* @return the range of log operacioneses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.LogOperaciones> getLogOperacioneses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _logOperacionesLocalService.getLogOperacioneses(start, end);
	}

	/**
	* Returns the number of log operacioneses.
	*
	* @return the number of log operacioneses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLogOperacionesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _logOperacionesLocalService.getLogOperacionesesCount();
	}

	/**
	* Updates the log operaciones in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param logOperaciones the log operaciones
	* @return the log operaciones that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.LogOperaciones updateLogOperaciones(
		com.hitss.layer.model.LogOperaciones logOperaciones)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _logOperacionesLocalService.updateLogOperaciones(logOperaciones);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _logOperacionesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_logOperacionesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _logOperacionesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LogOperacionesLocalService getWrappedLogOperacionesLocalService() {
		return _logOperacionesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLogOperacionesLocalService(
		LogOperacionesLocalService logOperacionesLocalService) {
		_logOperacionesLocalService = logOperacionesLocalService;
	}

	@Override
	public LogOperacionesLocalService getWrappedService() {
		return _logOperacionesLocalService;
	}

	@Override
	public void setWrappedService(
		LogOperacionesLocalService logOperacionesLocalService) {
		_logOperacionesLocalService = logOperacionesLocalService;
	}

	private LogOperacionesLocalService _logOperacionesLocalService;
}
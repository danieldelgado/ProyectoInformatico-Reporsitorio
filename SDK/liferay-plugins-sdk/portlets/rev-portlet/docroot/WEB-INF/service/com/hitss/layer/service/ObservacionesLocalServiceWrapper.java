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
 * Provides a wrapper for {@link ObservacionesLocalService}.
 *
 * @author Danielle Delgado
 * @see ObservacionesLocalService
 * @generated
 */
public class ObservacionesLocalServiceWrapper
	implements ObservacionesLocalService,
		ServiceWrapper<ObservacionesLocalService> {
	public ObservacionesLocalServiceWrapper(
		ObservacionesLocalService observacionesLocalService) {
		_observacionesLocalService = observacionesLocalService;
	}

	/**
	* Adds the observaciones to the database. Also notifies the appropriate model listeners.
	*
	* @param observaciones the observaciones
	* @return the observaciones that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Observaciones addObservaciones(
		com.hitss.layer.model.Observaciones observaciones)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _observacionesLocalService.addObservaciones(observaciones);
	}

	/**
	* Creates a new observaciones with the primary key. Does not add the observaciones to the database.
	*
	* @param observacionId the primary key for the new observaciones
	* @return the new observaciones
	*/
	@Override
	public com.hitss.layer.model.Observaciones createObservaciones(
		long observacionId) {
		return _observacionesLocalService.createObservaciones(observacionId);
	}

	/**
	* Deletes the observaciones with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param observacionId the primary key of the observaciones
	* @return the observaciones that was removed
	* @throws PortalException if a observaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Observaciones deleteObservaciones(
		long observacionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _observacionesLocalService.deleteObservaciones(observacionId);
	}

	/**
	* Deletes the observaciones from the database. Also notifies the appropriate model listeners.
	*
	* @param observaciones the observaciones
	* @return the observaciones that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Observaciones deleteObservaciones(
		com.hitss.layer.model.Observaciones observaciones)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _observacionesLocalService.deleteObservaciones(observaciones);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _observacionesLocalService.dynamicQuery();
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
		return _observacionesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ObservacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _observacionesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ObservacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _observacionesLocalService.dynamicQuery(dynamicQuery, start,
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
		return _observacionesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _observacionesLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.Observaciones fetchObservaciones(
		long observacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _observacionesLocalService.fetchObservaciones(observacionId);
	}

	/**
	* Returns the observaciones with the primary key.
	*
	* @param observacionId the primary key of the observaciones
	* @return the observaciones
	* @throws PortalException if a observaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Observaciones getObservaciones(
		long observacionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _observacionesLocalService.getObservaciones(observacionId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _observacionesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the observacioneses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ObservacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of observacioneses
	* @param end the upper bound of the range of observacioneses (not inclusive)
	* @return the range of observacioneses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.Observaciones> getObservacioneses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _observacionesLocalService.getObservacioneses(start, end);
	}

	/**
	* Returns the number of observacioneses.
	*
	* @return the number of observacioneses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getObservacionesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _observacionesLocalService.getObservacionesesCount();
	}

	/**
	* Updates the observaciones in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param observaciones the observaciones
	* @return the observaciones that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Observaciones updateObservaciones(
		com.hitss.layer.model.Observaciones observaciones)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _observacionesLocalService.updateObservaciones(observaciones);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _observacionesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_observacionesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _observacionesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.hitss.layer.model.Observaciones getObservacion(long registroId,
		java.lang.String tabla)
		throws com.hitss.layer.NoSuchObservacionesException,
			com.liferay.portal.kernel.exception.SystemException {
		return _observacionesLocalService.getObservacion(registroId, tabla);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ObservacionesLocalService getWrappedObservacionesLocalService() {
		return _observacionesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedObservacionesLocalService(
		ObservacionesLocalService observacionesLocalService) {
		_observacionesLocalService = observacionesLocalService;
	}

	@Override
	public ObservacionesLocalService getWrappedService() {
		return _observacionesLocalService;
	}

	@Override
	public void setWrappedService(
		ObservacionesLocalService observacionesLocalService) {
		_observacionesLocalService = observacionesLocalService;
	}

	private ObservacionesLocalService _observacionesLocalService;
}
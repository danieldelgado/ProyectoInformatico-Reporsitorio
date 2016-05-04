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
 * Provides a wrapper for {@link SolicitudEvaluacionDesempennoLocalService}.
 *
 * @author Danielle Delgado
 * @see SolicitudEvaluacionDesempennoLocalService
 * @generated
 */
public class SolicitudEvaluacionDesempennoLocalServiceWrapper
	implements SolicitudEvaluacionDesempennoLocalService,
		ServiceWrapper<SolicitudEvaluacionDesempennoLocalService> {
	public SolicitudEvaluacionDesempennoLocalServiceWrapper(
		SolicitudEvaluacionDesempennoLocalService solicitudEvaluacionDesempennoLocalService) {
		_solicitudEvaluacionDesempennoLocalService = solicitudEvaluacionDesempennoLocalService;
	}

	/**
	* Adds the solicitud evaluacion desempenno to the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudEvaluacionDesempenno the solicitud evaluacion desempenno
	* @return the solicitud evaluacion desempenno that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.SolicitudEvaluacionDesempenno addSolicitudEvaluacionDesempenno(
		com.hitss.layer.model.SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempennoLocalService.addSolicitudEvaluacionDesempenno(solicitudEvaluacionDesempenno);
	}

	/**
	* Creates a new solicitud evaluacion desempenno with the primary key. Does not add the solicitud evaluacion desempenno to the database.
	*
	* @param solicitudEvaluacionDesempennoId the primary key for the new solicitud evaluacion desempenno
	* @return the new solicitud evaluacion desempenno
	*/
	@Override
	public com.hitss.layer.model.SolicitudEvaluacionDesempenno createSolicitudEvaluacionDesempenno(
		long solicitudEvaluacionDesempennoId) {
		return _solicitudEvaluacionDesempennoLocalService.createSolicitudEvaluacionDesempenno(solicitudEvaluacionDesempennoId);
	}

	/**
	* Deletes the solicitud evaluacion desempenno with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudEvaluacionDesempennoId the primary key of the solicitud evaluacion desempenno
	* @return the solicitud evaluacion desempenno that was removed
	* @throws PortalException if a solicitud evaluacion desempenno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.SolicitudEvaluacionDesempenno deleteSolicitudEvaluacionDesempenno(
		long solicitudEvaluacionDesempennoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempennoLocalService.deleteSolicitudEvaluacionDesempenno(solicitudEvaluacionDesempennoId);
	}

	/**
	* Deletes the solicitud evaluacion desempenno from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudEvaluacionDesempenno the solicitud evaluacion desempenno
	* @return the solicitud evaluacion desempenno that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.SolicitudEvaluacionDesempenno deleteSolicitudEvaluacionDesempenno(
		com.hitss.layer.model.SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempennoLocalService.deleteSolicitudEvaluacionDesempenno(solicitudEvaluacionDesempenno);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _solicitudEvaluacionDesempennoLocalService.dynamicQuery();
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
		return _solicitudEvaluacionDesempennoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudEvaluacionDesempennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _solicitudEvaluacionDesempennoLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudEvaluacionDesempennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _solicitudEvaluacionDesempennoLocalService.dynamicQuery(dynamicQuery,
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
		return _solicitudEvaluacionDesempennoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _solicitudEvaluacionDesempennoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.SolicitudEvaluacionDesempenno fetchSolicitudEvaluacionDesempenno(
		long solicitudEvaluacionDesempennoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempennoLocalService.fetchSolicitudEvaluacionDesempenno(solicitudEvaluacionDesempennoId);
	}

	/**
	* Returns the solicitud evaluacion desempenno with the primary key.
	*
	* @param solicitudEvaluacionDesempennoId the primary key of the solicitud evaluacion desempenno
	* @return the solicitud evaluacion desempenno
	* @throws PortalException if a solicitud evaluacion desempenno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.SolicitudEvaluacionDesempenno getSolicitudEvaluacionDesempenno(
		long solicitudEvaluacionDesempennoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempennoLocalService.getSolicitudEvaluacionDesempenno(solicitudEvaluacionDesempennoId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempennoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the solicitud evaluacion desempennos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudEvaluacionDesempennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud evaluacion desempennos
	* @param end the upper bound of the range of solicitud evaluacion desempennos (not inclusive)
	* @return the range of solicitud evaluacion desempennos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.SolicitudEvaluacionDesempenno> getSolicitudEvaluacionDesempennos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempennoLocalService.getSolicitudEvaluacionDesempennos(start,
			end);
	}

	/**
	* Returns the number of solicitud evaluacion desempennos.
	*
	* @return the number of solicitud evaluacion desempennos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSolicitudEvaluacionDesempennosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempennoLocalService.getSolicitudEvaluacionDesempennosCount();
	}

	/**
	* Updates the solicitud evaluacion desempenno in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param solicitudEvaluacionDesempenno the solicitud evaluacion desempenno
	* @return the solicitud evaluacion desempenno that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.SolicitudEvaluacionDesempenno updateSolicitudEvaluacionDesempenno(
		com.hitss.layer.model.SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempennoLocalService.updateSolicitudEvaluacionDesempenno(solicitudEvaluacionDesempenno);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _solicitudEvaluacionDesempennoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_solicitudEvaluacionDesempennoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _solicitudEvaluacionDesempennoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SolicitudEvaluacionDesempennoLocalService getWrappedSolicitudEvaluacionDesempennoLocalService() {
		return _solicitudEvaluacionDesempennoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSolicitudEvaluacionDesempennoLocalService(
		SolicitudEvaluacionDesempennoLocalService solicitudEvaluacionDesempennoLocalService) {
		_solicitudEvaluacionDesempennoLocalService = solicitudEvaluacionDesempennoLocalService;
	}

	@Override
	public SolicitudEvaluacionDesempennoLocalService getWrappedService() {
		return _solicitudEvaluacionDesempennoLocalService;
	}

	@Override
	public void setWrappedService(
		SolicitudEvaluacionDesempennoLocalService solicitudEvaluacionDesempennoLocalService) {
		_solicitudEvaluacionDesempennoLocalService = solicitudEvaluacionDesempennoLocalService;
	}

	private SolicitudEvaluacionDesempennoLocalService _solicitudEvaluacionDesempennoLocalService;
}
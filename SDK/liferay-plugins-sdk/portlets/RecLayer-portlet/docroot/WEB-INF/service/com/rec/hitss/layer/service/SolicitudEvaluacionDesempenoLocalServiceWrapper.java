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
 * Provides a wrapper for {@link SolicitudEvaluacionDesempenoLocalService}.
 *
 * @author Crossfire
 * @see SolicitudEvaluacionDesempenoLocalService
 * @generated
 */
public class SolicitudEvaluacionDesempenoLocalServiceWrapper
	implements SolicitudEvaluacionDesempenoLocalService,
		ServiceWrapper<SolicitudEvaluacionDesempenoLocalService> {
	public SolicitudEvaluacionDesempenoLocalServiceWrapper(
		SolicitudEvaluacionDesempenoLocalService solicitudEvaluacionDesempenoLocalService) {
		_solicitudEvaluacionDesempenoLocalService = solicitudEvaluacionDesempenoLocalService;
	}

	/**
	* Adds the solicitud evaluacion desempeno to the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudEvaluacionDesempeno the solicitud evaluacion desempeno
	* @return the solicitud evaluacion desempeno that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno addSolicitudEvaluacionDesempeno(
		com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempenoLocalService.addSolicitudEvaluacionDesempeno(solicitudEvaluacionDesempeno);
	}

	/**
	* Creates a new solicitud evaluacion desempeno with the primary key. Does not add the solicitud evaluacion desempeno to the database.
	*
	* @param solicitudEvaluacionDesempenoId the primary key for the new solicitud evaluacion desempeno
	* @return the new solicitud evaluacion desempeno
	*/
	@Override
	public com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno createSolicitudEvaluacionDesempeno(
		long solicitudEvaluacionDesempenoId) {
		return _solicitudEvaluacionDesempenoLocalService.createSolicitudEvaluacionDesempeno(solicitudEvaluacionDesempenoId);
	}

	/**
	* Deletes the solicitud evaluacion desempeno with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudEvaluacionDesempenoId the primary key of the solicitud evaluacion desempeno
	* @return the solicitud evaluacion desempeno that was removed
	* @throws PortalException if a solicitud evaluacion desempeno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno deleteSolicitudEvaluacionDesempeno(
		long solicitudEvaluacionDesempenoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempenoLocalService.deleteSolicitudEvaluacionDesempeno(solicitudEvaluacionDesempenoId);
	}

	/**
	* Deletes the solicitud evaluacion desempeno from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudEvaluacionDesempeno the solicitud evaluacion desempeno
	* @return the solicitud evaluacion desempeno that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno deleteSolicitudEvaluacionDesempeno(
		com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempenoLocalService.deleteSolicitudEvaluacionDesempeno(solicitudEvaluacionDesempeno);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _solicitudEvaluacionDesempenoLocalService.dynamicQuery();
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
		return _solicitudEvaluacionDesempenoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudEvaluacionDesempenoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _solicitudEvaluacionDesempenoLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudEvaluacionDesempenoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _solicitudEvaluacionDesempenoLocalService.dynamicQuery(dynamicQuery,
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
		return _solicitudEvaluacionDesempenoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _solicitudEvaluacionDesempenoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno fetchSolicitudEvaluacionDesempeno(
		long solicitudEvaluacionDesempenoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempenoLocalService.fetchSolicitudEvaluacionDesempeno(solicitudEvaluacionDesempenoId);
	}

	/**
	* Returns the solicitud evaluacion desempeno with the primary key.
	*
	* @param solicitudEvaluacionDesempenoId the primary key of the solicitud evaluacion desempeno
	* @return the solicitud evaluacion desempeno
	* @throws PortalException if a solicitud evaluacion desempeno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno getSolicitudEvaluacionDesempeno(
		long solicitudEvaluacionDesempenoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempenoLocalService.getSolicitudEvaluacionDesempeno(solicitudEvaluacionDesempenoId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempenoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the solicitud evaluacion desempenos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudEvaluacionDesempenoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud evaluacion desempenos
	* @param end the upper bound of the range of solicitud evaluacion desempenos (not inclusive)
	* @return the range of solicitud evaluacion desempenos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno> getSolicitudEvaluacionDesempenos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempenoLocalService.getSolicitudEvaluacionDesempenos(start,
			end);
	}

	/**
	* Returns the number of solicitud evaluacion desempenos.
	*
	* @return the number of solicitud evaluacion desempenos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSolicitudEvaluacionDesempenosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempenoLocalService.getSolicitudEvaluacionDesempenosCount();
	}

	/**
	* Updates the solicitud evaluacion desempeno in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param solicitudEvaluacionDesempeno the solicitud evaluacion desempeno
	* @return the solicitud evaluacion desempeno that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno updateSolicitudEvaluacionDesempeno(
		com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudEvaluacionDesempenoLocalService.updateSolicitudEvaluacionDesempeno(solicitudEvaluacionDesempeno);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _solicitudEvaluacionDesempenoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_solicitudEvaluacionDesempenoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _solicitudEvaluacionDesempenoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SolicitudEvaluacionDesempenoLocalService getWrappedSolicitudEvaluacionDesempenoLocalService() {
		return _solicitudEvaluacionDesempenoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSolicitudEvaluacionDesempenoLocalService(
		SolicitudEvaluacionDesempenoLocalService solicitudEvaluacionDesempenoLocalService) {
		_solicitudEvaluacionDesempenoLocalService = solicitudEvaluacionDesempenoLocalService;
	}

	@Override
	public SolicitudEvaluacionDesempenoLocalService getWrappedService() {
		return _solicitudEvaluacionDesempenoLocalService;
	}

	@Override
	public void setWrappedService(
		SolicitudEvaluacionDesempenoLocalService solicitudEvaluacionDesempenoLocalService) {
		_solicitudEvaluacionDesempenoLocalService = solicitudEvaluacionDesempenoLocalService;
	}

	private SolicitudEvaluacionDesempenoLocalService _solicitudEvaluacionDesempenoLocalService;
}
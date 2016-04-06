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
 * Provides a wrapper for {@link avanceEstadoSolicitudReclutamientoLocalService}.
 *
 * @author Crossfire
 * @see avanceEstadoSolicitudReclutamientoLocalService
 * @generated
 */
public class avanceEstadoSolicitudReclutamientoLocalServiceWrapper
	implements avanceEstadoSolicitudReclutamientoLocalService,
		ServiceWrapper<avanceEstadoSolicitudReclutamientoLocalService> {
	public avanceEstadoSolicitudReclutamientoLocalServiceWrapper(
		avanceEstadoSolicitudReclutamientoLocalService avanceEstadoSolicitudReclutamientoLocalService) {
		_avanceEstadoSolicitudReclutamientoLocalService = avanceEstadoSolicitudReclutamientoLocalService;
	}

	/**
	* Adds the avance estado solicitud reclutamiento to the database. Also notifies the appropriate model listeners.
	*
	* @param avanceEstadoSolicitudReclutamiento the avance estado solicitud reclutamiento
	* @return the avance estado solicitud reclutamiento that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento addavanceEstadoSolicitudReclutamiento(
		com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento avanceEstadoSolicitudReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _avanceEstadoSolicitudReclutamientoLocalService.addavanceEstadoSolicitudReclutamiento(avanceEstadoSolicitudReclutamiento);
	}

	/**
	* Creates a new avance estado solicitud reclutamiento with the primary key. Does not add the avance estado solicitud reclutamiento to the database.
	*
	* @param AESR_ID the primary key for the new avance estado solicitud reclutamiento
	* @return the new avance estado solicitud reclutamiento
	*/
	@Override
	public com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento createavanceEstadoSolicitudReclutamiento(
		long AESR_ID) {
		return _avanceEstadoSolicitudReclutamientoLocalService.createavanceEstadoSolicitudReclutamiento(AESR_ID);
	}

	/**
	* Deletes the avance estado solicitud reclutamiento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param AESR_ID the primary key of the avance estado solicitud reclutamiento
	* @return the avance estado solicitud reclutamiento that was removed
	* @throws PortalException if a avance estado solicitud reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento deleteavanceEstadoSolicitudReclutamiento(
		long AESR_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _avanceEstadoSolicitudReclutamientoLocalService.deleteavanceEstadoSolicitudReclutamiento(AESR_ID);
	}

	/**
	* Deletes the avance estado solicitud reclutamiento from the database. Also notifies the appropriate model listeners.
	*
	* @param avanceEstadoSolicitudReclutamiento the avance estado solicitud reclutamiento
	* @return the avance estado solicitud reclutamiento that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento deleteavanceEstadoSolicitudReclutamiento(
		com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento avanceEstadoSolicitudReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _avanceEstadoSolicitudReclutamientoLocalService.deleteavanceEstadoSolicitudReclutamiento(avanceEstadoSolicitudReclutamiento);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _avanceEstadoSolicitudReclutamientoLocalService.dynamicQuery();
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
		return _avanceEstadoSolicitudReclutamientoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.avanceEstadoSolicitudReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _avanceEstadoSolicitudReclutamientoLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.avanceEstadoSolicitudReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _avanceEstadoSolicitudReclutamientoLocalService.dynamicQuery(dynamicQuery,
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
		return _avanceEstadoSolicitudReclutamientoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _avanceEstadoSolicitudReclutamientoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento fetchavanceEstadoSolicitudReclutamiento(
		long AESR_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _avanceEstadoSolicitudReclutamientoLocalService.fetchavanceEstadoSolicitudReclutamiento(AESR_ID);
	}

	/**
	* Returns the avance estado solicitud reclutamiento with the primary key.
	*
	* @param AESR_ID the primary key of the avance estado solicitud reclutamiento
	* @return the avance estado solicitud reclutamiento
	* @throws PortalException if a avance estado solicitud reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento getavanceEstadoSolicitudReclutamiento(
		long AESR_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _avanceEstadoSolicitudReclutamientoLocalService.getavanceEstadoSolicitudReclutamiento(AESR_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _avanceEstadoSolicitudReclutamientoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the avance estado solicitud reclutamientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.avanceEstadoSolicitudReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of avance estado solicitud reclutamientos
	* @param end the upper bound of the range of avance estado solicitud reclutamientos (not inclusive)
	* @return the range of avance estado solicitud reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento> getavanceEstadoSolicitudReclutamientos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _avanceEstadoSolicitudReclutamientoLocalService.getavanceEstadoSolicitudReclutamientos(start,
			end);
	}

	/**
	* Returns the number of avance estado solicitud reclutamientos.
	*
	* @return the number of avance estado solicitud reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getavanceEstadoSolicitudReclutamientosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _avanceEstadoSolicitudReclutamientoLocalService.getavanceEstadoSolicitudReclutamientosCount();
	}

	/**
	* Updates the avance estado solicitud reclutamiento in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param avanceEstadoSolicitudReclutamiento the avance estado solicitud reclutamiento
	* @return the avance estado solicitud reclutamiento that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento updateavanceEstadoSolicitudReclutamiento(
		com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento avanceEstadoSolicitudReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _avanceEstadoSolicitudReclutamientoLocalService.updateavanceEstadoSolicitudReclutamiento(avanceEstadoSolicitudReclutamiento);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _avanceEstadoSolicitudReclutamientoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_avanceEstadoSolicitudReclutamientoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _avanceEstadoSolicitudReclutamientoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public avanceEstadoSolicitudReclutamientoLocalService getWrappedavanceEstadoSolicitudReclutamientoLocalService() {
		return _avanceEstadoSolicitudReclutamientoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedavanceEstadoSolicitudReclutamientoLocalService(
		avanceEstadoSolicitudReclutamientoLocalService avanceEstadoSolicitudReclutamientoLocalService) {
		_avanceEstadoSolicitudReclutamientoLocalService = avanceEstadoSolicitudReclutamientoLocalService;
	}

	@Override
	public avanceEstadoSolicitudReclutamientoLocalService getWrappedService() {
		return _avanceEstadoSolicitudReclutamientoLocalService;
	}

	@Override
	public void setWrappedService(
		avanceEstadoSolicitudReclutamientoLocalService avanceEstadoSolicitudReclutamientoLocalService) {
		_avanceEstadoSolicitudReclutamientoLocalService = avanceEstadoSolicitudReclutamientoLocalService;
	}

	private avanceEstadoSolicitudReclutamientoLocalService _avanceEstadoSolicitudReclutamientoLocalService;
}
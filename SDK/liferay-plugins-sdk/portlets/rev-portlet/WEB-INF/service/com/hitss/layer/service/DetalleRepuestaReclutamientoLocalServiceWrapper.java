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
 * Provides a wrapper for {@link DetalleRepuestaReclutamientoLocalService}.
 *
 * @author Danielle Delgado
 * @see DetalleRepuestaReclutamientoLocalService
 * @generated
 */
public class DetalleRepuestaReclutamientoLocalServiceWrapper
	implements DetalleRepuestaReclutamientoLocalService,
		ServiceWrapper<DetalleRepuestaReclutamientoLocalService> {
	public DetalleRepuestaReclutamientoLocalServiceWrapper(
		DetalleRepuestaReclutamientoLocalService detalleRepuestaReclutamientoLocalService) {
		_detalleRepuestaReclutamientoLocalService = detalleRepuestaReclutamientoLocalService;
	}

	/**
	* Adds the detalle repuesta reclutamiento to the database. Also notifies the appropriate model listeners.
	*
	* @param detalleRepuestaReclutamiento the detalle repuesta reclutamiento
	* @return the detalle repuesta reclutamiento that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.DetalleRepuestaReclutamiento addDetalleRepuestaReclutamiento(
		com.hitss.layer.model.DetalleRepuestaReclutamiento detalleRepuestaReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaReclutamientoLocalService.addDetalleRepuestaReclutamiento(detalleRepuestaReclutamiento);
	}

	/**
	* Creates a new detalle repuesta reclutamiento with the primary key. Does not add the detalle repuesta reclutamiento to the database.
	*
	* @param detalleRepuestaReclutamientoPK the primary key for the new detalle repuesta reclutamiento
	* @return the new detalle repuesta reclutamiento
	*/
	@Override
	public com.hitss.layer.model.DetalleRepuestaReclutamiento createDetalleRepuestaReclutamiento(
		com.hitss.layer.service.persistence.DetalleRepuestaReclutamientoPK detalleRepuestaReclutamientoPK) {
		return _detalleRepuestaReclutamientoLocalService.createDetalleRepuestaReclutamiento(detalleRepuestaReclutamientoPK);
	}

	/**
	* Deletes the detalle repuesta reclutamiento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param detalleRepuestaReclutamientoPK the primary key of the detalle repuesta reclutamiento
	* @return the detalle repuesta reclutamiento that was removed
	* @throws PortalException if a detalle repuesta reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.DetalleRepuestaReclutamiento deleteDetalleRepuestaReclutamiento(
		com.hitss.layer.service.persistence.DetalleRepuestaReclutamientoPK detalleRepuestaReclutamientoPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaReclutamientoLocalService.deleteDetalleRepuestaReclutamiento(detalleRepuestaReclutamientoPK);
	}

	/**
	* Deletes the detalle repuesta reclutamiento from the database. Also notifies the appropriate model listeners.
	*
	* @param detalleRepuestaReclutamiento the detalle repuesta reclutamiento
	* @return the detalle repuesta reclutamiento that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.DetalleRepuestaReclutamiento deleteDetalleRepuestaReclutamiento(
		com.hitss.layer.model.DetalleRepuestaReclutamiento detalleRepuestaReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaReclutamientoLocalService.deleteDetalleRepuestaReclutamiento(detalleRepuestaReclutamiento);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _detalleRepuestaReclutamientoLocalService.dynamicQuery();
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
		return _detalleRepuestaReclutamientoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.DetalleRepuestaReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _detalleRepuestaReclutamientoLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.DetalleRepuestaReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _detalleRepuestaReclutamientoLocalService.dynamicQuery(dynamicQuery,
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
		return _detalleRepuestaReclutamientoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _detalleRepuestaReclutamientoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.DetalleRepuestaReclutamiento fetchDetalleRepuestaReclutamiento(
		com.hitss.layer.service.persistence.DetalleRepuestaReclutamientoPK detalleRepuestaReclutamientoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaReclutamientoLocalService.fetchDetalleRepuestaReclutamiento(detalleRepuestaReclutamientoPK);
	}

	/**
	* Returns the detalle repuesta reclutamiento with the primary key.
	*
	* @param detalleRepuestaReclutamientoPK the primary key of the detalle repuesta reclutamiento
	* @return the detalle repuesta reclutamiento
	* @throws PortalException if a detalle repuesta reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.DetalleRepuestaReclutamiento getDetalleRepuestaReclutamiento(
		com.hitss.layer.service.persistence.DetalleRepuestaReclutamientoPK detalleRepuestaReclutamientoPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaReclutamientoLocalService.getDetalleRepuestaReclutamiento(detalleRepuestaReclutamientoPK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaReclutamientoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the detalle repuesta reclutamientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.DetalleRepuestaReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of detalle repuesta reclutamientos
	* @param end the upper bound of the range of detalle repuesta reclutamientos (not inclusive)
	* @return the range of detalle repuesta reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.DetalleRepuestaReclutamiento> getDetalleRepuestaReclutamientos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaReclutamientoLocalService.getDetalleRepuestaReclutamientos(start,
			end);
	}

	/**
	* Returns the number of detalle repuesta reclutamientos.
	*
	* @return the number of detalle repuesta reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDetalleRepuestaReclutamientosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaReclutamientoLocalService.getDetalleRepuestaReclutamientosCount();
	}

	/**
	* Updates the detalle repuesta reclutamiento in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param detalleRepuestaReclutamiento the detalle repuesta reclutamiento
	* @return the detalle repuesta reclutamiento that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.DetalleRepuestaReclutamiento updateDetalleRepuestaReclutamiento(
		com.hitss.layer.model.DetalleRepuestaReclutamiento detalleRepuestaReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaReclutamientoLocalService.updateDetalleRepuestaReclutamiento(detalleRepuestaReclutamiento);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _detalleRepuestaReclutamientoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_detalleRepuestaReclutamientoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _detalleRepuestaReclutamientoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DetalleRepuestaReclutamientoLocalService getWrappedDetalleRepuestaReclutamientoLocalService() {
		return _detalleRepuestaReclutamientoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDetalleRepuestaReclutamientoLocalService(
		DetalleRepuestaReclutamientoLocalService detalleRepuestaReclutamientoLocalService) {
		_detalleRepuestaReclutamientoLocalService = detalleRepuestaReclutamientoLocalService;
	}

	@Override
	public DetalleRepuestaReclutamientoLocalService getWrappedService() {
		return _detalleRepuestaReclutamientoLocalService;
	}

	@Override
	public void setWrappedService(
		DetalleRepuestaReclutamientoLocalService detalleRepuestaReclutamientoLocalService) {
		_detalleRepuestaReclutamientoLocalService = detalleRepuestaReclutamientoLocalService;
	}

	private DetalleRepuestaReclutamientoLocalService _detalleRepuestaReclutamientoLocalService;
}
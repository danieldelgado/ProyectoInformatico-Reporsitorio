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
 * Provides a wrapper for {@link DetalleRepuestaEvaluacionLocalService}.
 *
 * @author Danielle Delgado
 * @see DetalleRepuestaEvaluacionLocalService
 * @generated
 */
public class DetalleRepuestaEvaluacionLocalServiceWrapper
	implements DetalleRepuestaEvaluacionLocalService,
		ServiceWrapper<DetalleRepuestaEvaluacionLocalService> {
	public DetalleRepuestaEvaluacionLocalServiceWrapper(
		DetalleRepuestaEvaluacionLocalService detalleRepuestaEvaluacionLocalService) {
		_detalleRepuestaEvaluacionLocalService = detalleRepuestaEvaluacionLocalService;
	}

	/**
	* Adds the detalle repuesta evaluacion to the database. Also notifies the appropriate model listeners.
	*
	* @param detalleRepuestaEvaluacion the detalle repuesta evaluacion
	* @return the detalle repuesta evaluacion that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.DetalleRepuestaEvaluacion addDetalleRepuestaEvaluacion(
		com.hitss.layer.model.DetalleRepuestaEvaluacion detalleRepuestaEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaEvaluacionLocalService.addDetalleRepuestaEvaluacion(detalleRepuestaEvaluacion);
	}

	/**
	* Creates a new detalle repuesta evaluacion with the primary key. Does not add the detalle repuesta evaluacion to the database.
	*
	* @param detalleRepuestaEvaluacionPK the primary key for the new detalle repuesta evaluacion
	* @return the new detalle repuesta evaluacion
	*/
	@Override
	public com.hitss.layer.model.DetalleRepuestaEvaluacion createDetalleRepuestaEvaluacion(
		com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK detalleRepuestaEvaluacionPK) {
		return _detalleRepuestaEvaluacionLocalService.createDetalleRepuestaEvaluacion(detalleRepuestaEvaluacionPK);
	}

	/**
	* Deletes the detalle repuesta evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param detalleRepuestaEvaluacionPK the primary key of the detalle repuesta evaluacion
	* @return the detalle repuesta evaluacion that was removed
	* @throws PortalException if a detalle repuesta evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.DetalleRepuestaEvaluacion deleteDetalleRepuestaEvaluacion(
		com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK detalleRepuestaEvaluacionPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaEvaluacionLocalService.deleteDetalleRepuestaEvaluacion(detalleRepuestaEvaluacionPK);
	}

	/**
	* Deletes the detalle repuesta evaluacion from the database. Also notifies the appropriate model listeners.
	*
	* @param detalleRepuestaEvaluacion the detalle repuesta evaluacion
	* @return the detalle repuesta evaluacion that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.DetalleRepuestaEvaluacion deleteDetalleRepuestaEvaluacion(
		com.hitss.layer.model.DetalleRepuestaEvaluacion detalleRepuestaEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaEvaluacionLocalService.deleteDetalleRepuestaEvaluacion(detalleRepuestaEvaluacion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _detalleRepuestaEvaluacionLocalService.dynamicQuery();
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
		return _detalleRepuestaEvaluacionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.DetalleRepuestaEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _detalleRepuestaEvaluacionLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.DetalleRepuestaEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _detalleRepuestaEvaluacionLocalService.dynamicQuery(dynamicQuery,
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
		return _detalleRepuestaEvaluacionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _detalleRepuestaEvaluacionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.DetalleRepuestaEvaluacion fetchDetalleRepuestaEvaluacion(
		com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK detalleRepuestaEvaluacionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaEvaluacionLocalService.fetchDetalleRepuestaEvaluacion(detalleRepuestaEvaluacionPK);
	}

	/**
	* Returns the detalle repuesta evaluacion with the primary key.
	*
	* @param detalleRepuestaEvaluacionPK the primary key of the detalle repuesta evaluacion
	* @return the detalle repuesta evaluacion
	* @throws PortalException if a detalle repuesta evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.DetalleRepuestaEvaluacion getDetalleRepuestaEvaluacion(
		com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK detalleRepuestaEvaluacionPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaEvaluacionLocalService.getDetalleRepuestaEvaluacion(detalleRepuestaEvaluacionPK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaEvaluacionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the detalle repuesta evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.DetalleRepuestaEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of detalle repuesta evaluacions
	* @param end the upper bound of the range of detalle repuesta evaluacions (not inclusive)
	* @return the range of detalle repuesta evaluacions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.DetalleRepuestaEvaluacion> getDetalleRepuestaEvaluacions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaEvaluacionLocalService.getDetalleRepuestaEvaluacions(start,
			end);
	}

	/**
	* Returns the number of detalle repuesta evaluacions.
	*
	* @return the number of detalle repuesta evaluacions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDetalleRepuestaEvaluacionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaEvaluacionLocalService.getDetalleRepuestaEvaluacionsCount();
	}

	/**
	* Updates the detalle repuesta evaluacion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param detalleRepuestaEvaluacion the detalle repuesta evaluacion
	* @return the detalle repuesta evaluacion that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.DetalleRepuestaEvaluacion updateDetalleRepuestaEvaluacion(
		com.hitss.layer.model.DetalleRepuestaEvaluacion detalleRepuestaEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detalleRepuestaEvaluacionLocalService.updateDetalleRepuestaEvaluacion(detalleRepuestaEvaluacion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _detalleRepuestaEvaluacionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_detalleRepuestaEvaluacionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _detalleRepuestaEvaluacionLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DetalleRepuestaEvaluacionLocalService getWrappedDetalleRepuestaEvaluacionLocalService() {
		return _detalleRepuestaEvaluacionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDetalleRepuestaEvaluacionLocalService(
		DetalleRepuestaEvaluacionLocalService detalleRepuestaEvaluacionLocalService) {
		_detalleRepuestaEvaluacionLocalService = detalleRepuestaEvaluacionLocalService;
	}

	@Override
	public DetalleRepuestaEvaluacionLocalService getWrappedService() {
		return _detalleRepuestaEvaluacionLocalService;
	}

	@Override
	public void setWrappedService(
		DetalleRepuestaEvaluacionLocalService detalleRepuestaEvaluacionLocalService) {
		_detalleRepuestaEvaluacionLocalService = detalleRepuestaEvaluacionLocalService;
	}

	private DetalleRepuestaEvaluacionLocalService _detalleRepuestaEvaluacionLocalService;
}
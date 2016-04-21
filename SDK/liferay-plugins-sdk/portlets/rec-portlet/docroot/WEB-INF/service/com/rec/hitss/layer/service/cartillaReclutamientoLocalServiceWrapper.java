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
 * Provides a wrapper for {@link cartillaReclutamientoLocalService}.
 *
 * @author Crossfire
 * @see cartillaReclutamientoLocalService
 * @generated
 */
public class cartillaReclutamientoLocalServiceWrapper
	implements cartillaReclutamientoLocalService,
		ServiceWrapper<cartillaReclutamientoLocalService> {
	public cartillaReclutamientoLocalServiceWrapper(
		cartillaReclutamientoLocalService cartillaReclutamientoLocalService) {
		_cartillaReclutamientoLocalService = cartillaReclutamientoLocalService;
	}

	/**
	* Adds the cartilla reclutamiento to the database. Also notifies the appropriate model listeners.
	*
	* @param cartillaReclutamiento the cartilla reclutamiento
	* @return the cartilla reclutamiento that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.cartillaReclutamiento addcartillaReclutamiento(
		com.rec.hitss.layer.model.cartillaReclutamiento cartillaReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cartillaReclutamientoLocalService.addcartillaReclutamiento(cartillaReclutamiento);
	}

	/**
	* Creates a new cartilla reclutamiento with the primary key. Does not add the cartilla reclutamiento to the database.
	*
	* @param CR_ID the primary key for the new cartilla reclutamiento
	* @return the new cartilla reclutamiento
	*/
	@Override
	public com.rec.hitss.layer.model.cartillaReclutamiento createcartillaReclutamiento(
		long CR_ID) {
		return _cartillaReclutamientoLocalService.createcartillaReclutamiento(CR_ID);
	}

	/**
	* Deletes the cartilla reclutamiento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CR_ID the primary key of the cartilla reclutamiento
	* @return the cartilla reclutamiento that was removed
	* @throws PortalException if a cartilla reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.cartillaReclutamiento deletecartillaReclutamiento(
		long CR_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cartillaReclutamientoLocalService.deletecartillaReclutamiento(CR_ID);
	}

	/**
	* Deletes the cartilla reclutamiento from the database. Also notifies the appropriate model listeners.
	*
	* @param cartillaReclutamiento the cartilla reclutamiento
	* @return the cartilla reclutamiento that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.cartillaReclutamiento deletecartillaReclutamiento(
		com.rec.hitss.layer.model.cartillaReclutamiento cartillaReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cartillaReclutamientoLocalService.deletecartillaReclutamiento(cartillaReclutamiento);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cartillaReclutamientoLocalService.dynamicQuery();
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
		return _cartillaReclutamientoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.cartillaReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cartillaReclutamientoLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.cartillaReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cartillaReclutamientoLocalService.dynamicQuery(dynamicQuery,
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
		return _cartillaReclutamientoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cartillaReclutamientoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.cartillaReclutamiento fetchcartillaReclutamiento(
		long CR_ID) throws com.liferay.portal.kernel.exception.SystemException {
		return _cartillaReclutamientoLocalService.fetchcartillaReclutamiento(CR_ID);
	}

	/**
	* Returns the cartilla reclutamiento with the primary key.
	*
	* @param CR_ID the primary key of the cartilla reclutamiento
	* @return the cartilla reclutamiento
	* @throws PortalException if a cartilla reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.cartillaReclutamiento getcartillaReclutamiento(
		long CR_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cartillaReclutamientoLocalService.getcartillaReclutamiento(CR_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cartillaReclutamientoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the cartilla reclutamientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.cartillaReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cartilla reclutamientos
	* @param end the upper bound of the range of cartilla reclutamientos (not inclusive)
	* @return the range of cartilla reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.cartillaReclutamiento> getcartillaReclutamientos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cartillaReclutamientoLocalService.getcartillaReclutamientos(start,
			end);
	}

	/**
	* Returns the number of cartilla reclutamientos.
	*
	* @return the number of cartilla reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getcartillaReclutamientosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cartillaReclutamientoLocalService.getcartillaReclutamientosCount();
	}

	/**
	* Updates the cartilla reclutamiento in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cartillaReclutamiento the cartilla reclutamiento
	* @return the cartilla reclutamiento that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.cartillaReclutamiento updatecartillaReclutamiento(
		com.rec.hitss.layer.model.cartillaReclutamiento cartillaReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cartillaReclutamientoLocalService.updatecartillaReclutamiento(cartillaReclutamiento);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _cartillaReclutamientoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_cartillaReclutamientoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cartillaReclutamientoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public cartillaReclutamientoLocalService getWrappedcartillaReclutamientoLocalService() {
		return _cartillaReclutamientoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedcartillaReclutamientoLocalService(
		cartillaReclutamientoLocalService cartillaReclutamientoLocalService) {
		_cartillaReclutamientoLocalService = cartillaReclutamientoLocalService;
	}

	@Override
	public cartillaReclutamientoLocalService getWrappedService() {
		return _cartillaReclutamientoLocalService;
	}

	@Override
	public void setWrappedService(
		cartillaReclutamientoLocalService cartillaReclutamientoLocalService) {
		_cartillaReclutamientoLocalService = cartillaReclutamientoLocalService;
	}

	private cartillaReclutamientoLocalService _cartillaReclutamientoLocalService;
}
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
 * Provides a wrapper for {@link FichaIngresoLocalService}.
 *
 * @author Danielle Delgado
 * @see FichaIngresoLocalService
 * @generated
 */
public class FichaIngresoLocalServiceWrapper implements FichaIngresoLocalService,
	ServiceWrapper<FichaIngresoLocalService> {
	public FichaIngresoLocalServiceWrapper(
		FichaIngresoLocalService fichaIngresoLocalService) {
		_fichaIngresoLocalService = fichaIngresoLocalService;
	}

	/**
	* Adds the ficha ingreso to the database. Also notifies the appropriate model listeners.
	*
	* @param fichaIngreso the ficha ingreso
	* @return the ficha ingreso that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.FichaIngreso addFichaIngreso(
		com.hitss.layer.model.FichaIngreso fichaIngreso)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fichaIngresoLocalService.addFichaIngreso(fichaIngreso);
	}

	/**
	* Creates a new ficha ingreso with the primary key. Does not add the ficha ingreso to the database.
	*
	* @param fichaIngresoPK the primary key for the new ficha ingreso
	* @return the new ficha ingreso
	*/
	@Override
	public com.hitss.layer.model.FichaIngreso createFichaIngreso(
		com.hitss.layer.service.persistence.FichaIngresoPK fichaIngresoPK) {
		return _fichaIngresoLocalService.createFichaIngreso(fichaIngresoPK);
	}

	/**
	* Deletes the ficha ingreso with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fichaIngresoPK the primary key of the ficha ingreso
	* @return the ficha ingreso that was removed
	* @throws PortalException if a ficha ingreso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.FichaIngreso deleteFichaIngreso(
		com.hitss.layer.service.persistence.FichaIngresoPK fichaIngresoPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _fichaIngresoLocalService.deleteFichaIngreso(fichaIngresoPK);
	}

	/**
	* Deletes the ficha ingreso from the database. Also notifies the appropriate model listeners.
	*
	* @param fichaIngreso the ficha ingreso
	* @return the ficha ingreso that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.FichaIngreso deleteFichaIngreso(
		com.hitss.layer.model.FichaIngreso fichaIngreso)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fichaIngresoLocalService.deleteFichaIngreso(fichaIngreso);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fichaIngresoLocalService.dynamicQuery();
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
		return _fichaIngresoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FichaIngresoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _fichaIngresoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FichaIngresoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _fichaIngresoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _fichaIngresoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _fichaIngresoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.FichaIngreso fetchFichaIngreso(
		com.hitss.layer.service.persistence.FichaIngresoPK fichaIngresoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fichaIngresoLocalService.fetchFichaIngreso(fichaIngresoPK);
	}

	/**
	* Returns the ficha ingreso with the primary key.
	*
	* @param fichaIngresoPK the primary key of the ficha ingreso
	* @return the ficha ingreso
	* @throws PortalException if a ficha ingreso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.FichaIngreso getFichaIngreso(
		com.hitss.layer.service.persistence.FichaIngresoPK fichaIngresoPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _fichaIngresoLocalService.getFichaIngreso(fichaIngresoPK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _fichaIngresoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the ficha ingresos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FichaIngresoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ficha ingresos
	* @param end the upper bound of the range of ficha ingresos (not inclusive)
	* @return the range of ficha ingresos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.FichaIngreso> getFichaIngresos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fichaIngresoLocalService.getFichaIngresos(start, end);
	}

	/**
	* Returns the number of ficha ingresos.
	*
	* @return the number of ficha ingresos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getFichaIngresosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fichaIngresoLocalService.getFichaIngresosCount();
	}

	/**
	* Updates the ficha ingreso in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param fichaIngreso the ficha ingreso
	* @return the ficha ingreso that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.FichaIngreso updateFichaIngreso(
		com.hitss.layer.model.FichaIngreso fichaIngreso)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fichaIngresoLocalService.updateFichaIngreso(fichaIngreso);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _fichaIngresoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_fichaIngresoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _fichaIngresoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public FichaIngresoLocalService getWrappedFichaIngresoLocalService() {
		return _fichaIngresoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedFichaIngresoLocalService(
		FichaIngresoLocalService fichaIngresoLocalService) {
		_fichaIngresoLocalService = fichaIngresoLocalService;
	}

	@Override
	public FichaIngresoLocalService getWrappedService() {
		return _fichaIngresoLocalService;
	}

	@Override
	public void setWrappedService(
		FichaIngresoLocalService fichaIngresoLocalService) {
		_fichaIngresoLocalService = fichaIngresoLocalService;
	}

	private FichaIngresoLocalService _fichaIngresoLocalService;
}
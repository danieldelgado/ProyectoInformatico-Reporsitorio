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
 * Provides a wrapper for {@link PrioridadEquiposLocalService}.
 *
 * @author Crossfire
 * @see PrioridadEquiposLocalService
 * @generated
 */
public class PrioridadEquiposLocalServiceWrapper
	implements PrioridadEquiposLocalService,
		ServiceWrapper<PrioridadEquiposLocalService> {
	public PrioridadEquiposLocalServiceWrapper(
		PrioridadEquiposLocalService prioridadEquiposLocalService) {
		_prioridadEquiposLocalService = prioridadEquiposLocalService;
	}

	/**
	* Adds the prioridad equipos to the database. Also notifies the appropriate model listeners.
	*
	* @param prioridadEquipos the prioridad equipos
	* @return the prioridad equipos that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.PrioridadEquipos addPrioridadEquipos(
		com.rec.hitss.layer.model.PrioridadEquipos prioridadEquipos)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prioridadEquiposLocalService.addPrioridadEquipos(prioridadEquipos);
	}

	/**
	* Creates a new prioridad equipos with the primary key. Does not add the prioridad equipos to the database.
	*
	* @param prioridadEquiposId the primary key for the new prioridad equipos
	* @return the new prioridad equipos
	*/
	@Override
	public com.rec.hitss.layer.model.PrioridadEquipos createPrioridadEquipos(
		long prioridadEquiposId) {
		return _prioridadEquiposLocalService.createPrioridadEquipos(prioridadEquiposId);
	}

	/**
	* Deletes the prioridad equipos with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param prioridadEquiposId the primary key of the prioridad equipos
	* @return the prioridad equipos that was removed
	* @throws PortalException if a prioridad equipos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.PrioridadEquipos deletePrioridadEquipos(
		long prioridadEquiposId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _prioridadEquiposLocalService.deletePrioridadEquipos(prioridadEquiposId);
	}

	/**
	* Deletes the prioridad equipos from the database. Also notifies the appropriate model listeners.
	*
	* @param prioridadEquipos the prioridad equipos
	* @return the prioridad equipos that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.PrioridadEquipos deletePrioridadEquipos(
		com.rec.hitss.layer.model.PrioridadEquipos prioridadEquipos)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prioridadEquiposLocalService.deletePrioridadEquipos(prioridadEquipos);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _prioridadEquiposLocalService.dynamicQuery();
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
		return _prioridadEquiposLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PrioridadEquiposModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _prioridadEquiposLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PrioridadEquiposModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _prioridadEquiposLocalService.dynamicQuery(dynamicQuery, start,
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
		return _prioridadEquiposLocalService.dynamicQueryCount(dynamicQuery);
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
		return _prioridadEquiposLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.PrioridadEquipos fetchPrioridadEquipos(
		long prioridadEquiposId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prioridadEquiposLocalService.fetchPrioridadEquipos(prioridadEquiposId);
	}

	/**
	* Returns the prioridad equipos with the primary key.
	*
	* @param prioridadEquiposId the primary key of the prioridad equipos
	* @return the prioridad equipos
	* @throws PortalException if a prioridad equipos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.PrioridadEquipos getPrioridadEquipos(
		long prioridadEquiposId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _prioridadEquiposLocalService.getPrioridadEquipos(prioridadEquiposId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _prioridadEquiposLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the prioridad equiposes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PrioridadEquiposModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prioridad equiposes
	* @param end the upper bound of the range of prioridad equiposes (not inclusive)
	* @return the range of prioridad equiposes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.PrioridadEquipos> getPrioridadEquiposes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prioridadEquiposLocalService.getPrioridadEquiposes(start, end);
	}

	/**
	* Returns the number of prioridad equiposes.
	*
	* @return the number of prioridad equiposes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPrioridadEquiposesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prioridadEquiposLocalService.getPrioridadEquiposesCount();
	}

	/**
	* Updates the prioridad equipos in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param prioridadEquipos the prioridad equipos
	* @return the prioridad equipos that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.PrioridadEquipos updatePrioridadEquipos(
		com.rec.hitss.layer.model.PrioridadEquipos prioridadEquipos)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prioridadEquiposLocalService.updatePrioridadEquipos(prioridadEquipos);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _prioridadEquiposLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_prioridadEquiposLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _prioridadEquiposLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PrioridadEquiposLocalService getWrappedPrioridadEquiposLocalService() {
		return _prioridadEquiposLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPrioridadEquiposLocalService(
		PrioridadEquiposLocalService prioridadEquiposLocalService) {
		_prioridadEquiposLocalService = prioridadEquiposLocalService;
	}

	@Override
	public PrioridadEquiposLocalService getWrappedService() {
		return _prioridadEquiposLocalService;
	}

	@Override
	public void setWrappedService(
		PrioridadEquiposLocalService prioridadEquiposLocalService) {
		_prioridadEquiposLocalService = prioridadEquiposLocalService;
	}

	private PrioridadEquiposLocalService _prioridadEquiposLocalService;
}
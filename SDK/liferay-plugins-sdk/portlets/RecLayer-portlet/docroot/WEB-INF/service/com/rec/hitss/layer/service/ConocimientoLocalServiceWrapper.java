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
 * Provides a wrapper for {@link ConocimientoLocalService}.
 *
 * @author Crossfire
 * @see ConocimientoLocalService
 * @generated
 */
public class ConocimientoLocalServiceWrapper implements ConocimientoLocalService,
	ServiceWrapper<ConocimientoLocalService> {
	public ConocimientoLocalServiceWrapper(
		ConocimientoLocalService conocimientoLocalService) {
		_conocimientoLocalService = conocimientoLocalService;
	}

	/**
	* Adds the conocimiento to the database. Also notifies the appropriate model listeners.
	*
	* @param conocimiento the conocimiento
	* @return the conocimiento that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.Conocimiento addConocimiento(
		com.rec.hitss.layer.model.Conocimiento conocimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conocimientoLocalService.addConocimiento(conocimiento);
	}

	/**
	* Creates a new conocimiento with the primary key. Does not add the conocimiento to the database.
	*
	* @param conocimientoId the primary key for the new conocimiento
	* @return the new conocimiento
	*/
	@Override
	public com.rec.hitss.layer.model.Conocimiento createConocimiento(
		long conocimientoId) {
		return _conocimientoLocalService.createConocimiento(conocimientoId);
	}

	/**
	* Deletes the conocimiento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param conocimientoId the primary key of the conocimiento
	* @return the conocimiento that was removed
	* @throws PortalException if a conocimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.Conocimiento deleteConocimiento(
		long conocimientoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _conocimientoLocalService.deleteConocimiento(conocimientoId);
	}

	/**
	* Deletes the conocimiento from the database. Also notifies the appropriate model listeners.
	*
	* @param conocimiento the conocimiento
	* @return the conocimiento that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.Conocimiento deleteConocimiento(
		com.rec.hitss.layer.model.Conocimiento conocimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conocimientoLocalService.deleteConocimiento(conocimiento);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _conocimientoLocalService.dynamicQuery();
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
		return _conocimientoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ConocimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _conocimientoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ConocimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _conocimientoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _conocimientoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _conocimientoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.Conocimiento fetchConocimiento(
		long conocimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conocimientoLocalService.fetchConocimiento(conocimientoId);
	}

	/**
	* Returns the conocimiento with the primary key.
	*
	* @param conocimientoId the primary key of the conocimiento
	* @return the conocimiento
	* @throws PortalException if a conocimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.Conocimiento getConocimiento(
		long conocimientoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _conocimientoLocalService.getConocimiento(conocimientoId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _conocimientoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the conocimientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ConocimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of conocimientos
	* @param end the upper bound of the range of conocimientos (not inclusive)
	* @return the range of conocimientos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.Conocimiento> getConocimientos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conocimientoLocalService.getConocimientos(start, end);
	}

	/**
	* Returns the number of conocimientos.
	*
	* @return the number of conocimientos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getConocimientosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conocimientoLocalService.getConocimientosCount();
	}

	/**
	* Updates the conocimiento in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param conocimiento the conocimiento
	* @return the conocimiento that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.Conocimiento updateConocimiento(
		com.rec.hitss.layer.model.Conocimiento conocimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _conocimientoLocalService.updateConocimiento(conocimiento);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _conocimientoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_conocimientoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _conocimientoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ConocimientoLocalService getWrappedConocimientoLocalService() {
		return _conocimientoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedConocimientoLocalService(
		ConocimientoLocalService conocimientoLocalService) {
		_conocimientoLocalService = conocimientoLocalService;
	}

	@Override
	public ConocimientoLocalService getWrappedService() {
		return _conocimientoLocalService;
	}

	@Override
	public void setWrappedService(
		ConocimientoLocalService conocimientoLocalService) {
		_conocimientoLocalService = conocimientoLocalService;
	}

	private ConocimientoLocalService _conocimientoLocalService;
}
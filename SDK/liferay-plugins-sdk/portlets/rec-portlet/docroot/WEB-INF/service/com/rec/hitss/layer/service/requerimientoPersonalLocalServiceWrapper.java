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
 * Provides a wrapper for {@link requerimientoPersonalLocalService}.
 *
 * @author Crossfire
 * @see requerimientoPersonalLocalService
 * @generated
 */
public class requerimientoPersonalLocalServiceWrapper
	implements requerimientoPersonalLocalService,
		ServiceWrapper<requerimientoPersonalLocalService> {
	public requerimientoPersonalLocalServiceWrapper(
		requerimientoPersonalLocalService requerimientoPersonalLocalService) {
		_requerimientoPersonalLocalService = requerimientoPersonalLocalService;
	}

	/**
	* Adds the requerimiento personal to the database. Also notifies the appropriate model listeners.
	*
	* @param requerimientoPersonal the requerimiento personal
	* @return the requerimiento personal that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.requerimientoPersonal addrequerimientoPersonal(
		com.rec.hitss.layer.model.requerimientoPersonal requerimientoPersonal)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoPersonalLocalService.addrequerimientoPersonal(requerimientoPersonal);
	}

	/**
	* Creates a new requerimiento personal with the primary key. Does not add the requerimiento personal to the database.
	*
	* @param REQ_ID the primary key for the new requerimiento personal
	* @return the new requerimiento personal
	*/
	@Override
	public com.rec.hitss.layer.model.requerimientoPersonal createrequerimientoPersonal(
		long REQ_ID) {
		return _requerimientoPersonalLocalService.createrequerimientoPersonal(REQ_ID);
	}

	/**
	* Deletes the requerimiento personal with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param REQ_ID the primary key of the requerimiento personal
	* @return the requerimiento personal that was removed
	* @throws PortalException if a requerimiento personal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.requerimientoPersonal deleterequerimientoPersonal(
		long REQ_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoPersonalLocalService.deleterequerimientoPersonal(REQ_ID);
	}

	/**
	* Deletes the requerimiento personal from the database. Also notifies the appropriate model listeners.
	*
	* @param requerimientoPersonal the requerimiento personal
	* @return the requerimiento personal that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.requerimientoPersonal deleterequerimientoPersonal(
		com.rec.hitss.layer.model.requerimientoPersonal requerimientoPersonal)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoPersonalLocalService.deleterequerimientoPersonal(requerimientoPersonal);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _requerimientoPersonalLocalService.dynamicQuery();
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
		return _requerimientoPersonalLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.requerimientoPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _requerimientoPersonalLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.requerimientoPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _requerimientoPersonalLocalService.dynamicQuery(dynamicQuery,
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
		return _requerimientoPersonalLocalService.dynamicQueryCount(dynamicQuery);
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
		return _requerimientoPersonalLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.requerimientoPersonal fetchrequerimientoPersonal(
		long REQ_ID) throws com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoPersonalLocalService.fetchrequerimientoPersonal(REQ_ID);
	}

	/**
	* Returns the requerimiento personal with the primary key.
	*
	* @param REQ_ID the primary key of the requerimiento personal
	* @return the requerimiento personal
	* @throws PortalException if a requerimiento personal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.requerimientoPersonal getrequerimientoPersonal(
		long REQ_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoPersonalLocalService.getrequerimientoPersonal(REQ_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoPersonalLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the requerimiento personals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.requerimientoPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of requerimiento personals
	* @param end the upper bound of the range of requerimiento personals (not inclusive)
	* @return the range of requerimiento personals
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.requerimientoPersonal> getrequerimientoPersonals(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoPersonalLocalService.getrequerimientoPersonals(start,
			end);
	}

	/**
	* Returns the number of requerimiento personals.
	*
	* @return the number of requerimiento personals
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getrequerimientoPersonalsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoPersonalLocalService.getrequerimientoPersonalsCount();
	}

	/**
	* Updates the requerimiento personal in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param requerimientoPersonal the requerimiento personal
	* @return the requerimiento personal that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.requerimientoPersonal updaterequerimientoPersonal(
		com.rec.hitss.layer.model.requerimientoPersonal requerimientoPersonal)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoPersonalLocalService.updaterequerimientoPersonal(requerimientoPersonal);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _requerimientoPersonalLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_requerimientoPersonalLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _requerimientoPersonalLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public requerimientoPersonalLocalService getWrappedrequerimientoPersonalLocalService() {
		return _requerimientoPersonalLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedrequerimientoPersonalLocalService(
		requerimientoPersonalLocalService requerimientoPersonalLocalService) {
		_requerimientoPersonalLocalService = requerimientoPersonalLocalService;
	}

	@Override
	public requerimientoPersonalLocalService getWrappedService() {
		return _requerimientoPersonalLocalService;
	}

	@Override
	public void setWrappedService(
		requerimientoPersonalLocalService requerimientoPersonalLocalService) {
		_requerimientoPersonalLocalService = requerimientoPersonalLocalService;
	}

	private requerimientoPersonalLocalService _requerimientoPersonalLocalService;
}
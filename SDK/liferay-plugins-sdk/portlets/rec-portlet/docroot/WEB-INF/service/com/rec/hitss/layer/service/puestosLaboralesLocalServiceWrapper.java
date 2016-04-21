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
 * Provides a wrapper for {@link puestosLaboralesLocalService}.
 *
 * @author Crossfire
 * @see puestosLaboralesLocalService
 * @generated
 */
public class puestosLaboralesLocalServiceWrapper
	implements puestosLaboralesLocalService,
		ServiceWrapper<puestosLaboralesLocalService> {
	public puestosLaboralesLocalServiceWrapper(
		puestosLaboralesLocalService puestosLaboralesLocalService) {
		_puestosLaboralesLocalService = puestosLaboralesLocalService;
	}

	/**
	* Adds the puestos laborales to the database. Also notifies the appropriate model listeners.
	*
	* @param puestosLaborales the puestos laborales
	* @return the puestos laborales that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.puestosLaborales addpuestosLaborales(
		com.rec.hitss.layer.model.puestosLaborales puestosLaborales)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestosLaboralesLocalService.addpuestosLaborales(puestosLaborales);
	}

	/**
	* Creates a new puestos laborales with the primary key. Does not add the puestos laborales to the database.
	*
	* @param PL_ID the primary key for the new puestos laborales
	* @return the new puestos laborales
	*/
	@Override
	public com.rec.hitss.layer.model.puestosLaborales createpuestosLaborales(
		long PL_ID) {
		return _puestosLaboralesLocalService.createpuestosLaborales(PL_ID);
	}

	/**
	* Deletes the puestos laborales with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PL_ID the primary key of the puestos laborales
	* @return the puestos laborales that was removed
	* @throws PortalException if a puestos laborales with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.puestosLaborales deletepuestosLaborales(
		long PL_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _puestosLaboralesLocalService.deletepuestosLaborales(PL_ID);
	}

	/**
	* Deletes the puestos laborales from the database. Also notifies the appropriate model listeners.
	*
	* @param puestosLaborales the puestos laborales
	* @return the puestos laborales that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.puestosLaborales deletepuestosLaborales(
		com.rec.hitss.layer.model.puestosLaborales puestosLaborales)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestosLaboralesLocalService.deletepuestosLaborales(puestosLaborales);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _puestosLaboralesLocalService.dynamicQuery();
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
		return _puestosLaboralesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.puestosLaboralesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _puestosLaboralesLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.puestosLaboralesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _puestosLaboralesLocalService.dynamicQuery(dynamicQuery, start,
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
		return _puestosLaboralesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _puestosLaboralesLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.puestosLaborales fetchpuestosLaborales(
		long PL_ID) throws com.liferay.portal.kernel.exception.SystemException {
		return _puestosLaboralesLocalService.fetchpuestosLaborales(PL_ID);
	}

	/**
	* Returns the puestos laborales with the primary key.
	*
	* @param PL_ID the primary key of the puestos laborales
	* @return the puestos laborales
	* @throws PortalException if a puestos laborales with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.puestosLaborales getpuestosLaborales(
		long PL_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _puestosLaboralesLocalService.getpuestosLaborales(PL_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _puestosLaboralesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the puestos laboraleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.puestosLaboralesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of puestos laboraleses
	* @param end the upper bound of the range of puestos laboraleses (not inclusive)
	* @return the range of puestos laboraleses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.puestosLaborales> getpuestosLaboraleses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestosLaboralesLocalService.getpuestosLaboraleses(start, end);
	}

	/**
	* Returns the number of puestos laboraleses.
	*
	* @return the number of puestos laboraleses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getpuestosLaboralesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestosLaboralesLocalService.getpuestosLaboralesesCount();
	}

	/**
	* Updates the puestos laborales in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param puestosLaborales the puestos laborales
	* @return the puestos laborales that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.puestosLaborales updatepuestosLaborales(
		com.rec.hitss.layer.model.puestosLaborales puestosLaborales)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestosLaboralesLocalService.updatepuestosLaborales(puestosLaborales);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _puestosLaboralesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_puestosLaboralesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _puestosLaboralesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public puestosLaboralesLocalService getWrappedpuestosLaboralesLocalService() {
		return _puestosLaboralesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedpuestosLaboralesLocalService(
		puestosLaboralesLocalService puestosLaboralesLocalService) {
		_puestosLaboralesLocalService = puestosLaboralesLocalService;
	}

	@Override
	public puestosLaboralesLocalService getWrappedService() {
		return _puestosLaboralesLocalService;
	}

	@Override
	public void setWrappedService(
		puestosLaboralesLocalService puestosLaboralesLocalService) {
		_puestosLaboralesLocalService = puestosLaboralesLocalService;
	}

	private puestosLaboralesLocalService _puestosLaboralesLocalService;
}
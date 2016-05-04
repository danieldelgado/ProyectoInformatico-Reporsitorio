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
 * Provides a wrapper for {@link nueveCuadrantesLocalService}.
 *
 * @author Crossfire
 * @see nueveCuadrantesLocalService
 * @generated
 */
public class nueveCuadrantesLocalServiceWrapper
	implements nueveCuadrantesLocalService,
		ServiceWrapper<nueveCuadrantesLocalService> {
	public nueveCuadrantesLocalServiceWrapper(
		nueveCuadrantesLocalService nueveCuadrantesLocalService) {
		_nueveCuadrantesLocalService = nueveCuadrantesLocalService;
	}

	/**
	* Adds the nueve cuadrantes to the database. Also notifies the appropriate model listeners.
	*
	* @param nueveCuadrantes the nueve cuadrantes
	* @return the nueve cuadrantes that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.nueveCuadrantes addnueveCuadrantes(
		com.rec.hitss.layer.model.nueveCuadrantes nueveCuadrantes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nueveCuadrantesLocalService.addnueveCuadrantes(nueveCuadrantes);
	}

	/**
	* Creates a new nueve cuadrantes with the primary key. Does not add the nueve cuadrantes to the database.
	*
	* @param NC_ID the primary key for the new nueve cuadrantes
	* @return the new nueve cuadrantes
	*/
	@Override
	public com.rec.hitss.layer.model.nueveCuadrantes createnueveCuadrantes(
		long NC_ID) {
		return _nueveCuadrantesLocalService.createnueveCuadrantes(NC_ID);
	}

	/**
	* Deletes the nueve cuadrantes with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param NC_ID the primary key of the nueve cuadrantes
	* @return the nueve cuadrantes that was removed
	* @throws PortalException if a nueve cuadrantes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.nueveCuadrantes deletenueveCuadrantes(
		long NC_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nueveCuadrantesLocalService.deletenueveCuadrantes(NC_ID);
	}

	/**
	* Deletes the nueve cuadrantes from the database. Also notifies the appropriate model listeners.
	*
	* @param nueveCuadrantes the nueve cuadrantes
	* @return the nueve cuadrantes that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.nueveCuadrantes deletenueveCuadrantes(
		com.rec.hitss.layer.model.nueveCuadrantes nueveCuadrantes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nueveCuadrantesLocalService.deletenueveCuadrantes(nueveCuadrantes);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _nueveCuadrantesLocalService.dynamicQuery();
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
		return _nueveCuadrantesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.nueveCuadrantesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _nueveCuadrantesLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.nueveCuadrantesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _nueveCuadrantesLocalService.dynamicQuery(dynamicQuery, start,
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
		return _nueveCuadrantesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _nueveCuadrantesLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.nueveCuadrantes fetchnueveCuadrantes(
		long NC_ID) throws com.liferay.portal.kernel.exception.SystemException {
		return _nueveCuadrantesLocalService.fetchnueveCuadrantes(NC_ID);
	}

	/**
	* Returns the nueve cuadrantes with the primary key.
	*
	* @param NC_ID the primary key of the nueve cuadrantes
	* @return the nueve cuadrantes
	* @throws PortalException if a nueve cuadrantes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.nueveCuadrantes getnueveCuadrantes(
		long NC_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nueveCuadrantesLocalService.getnueveCuadrantes(NC_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nueveCuadrantesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the nueve cuadranteses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.nueveCuadrantesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nueve cuadranteses
	* @param end the upper bound of the range of nueve cuadranteses (not inclusive)
	* @return the range of nueve cuadranteses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.nueveCuadrantes> getnueveCuadranteses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nueveCuadrantesLocalService.getnueveCuadranteses(start, end);
	}

	/**
	* Returns the number of nueve cuadranteses.
	*
	* @return the number of nueve cuadranteses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getnueveCuadrantesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nueveCuadrantesLocalService.getnueveCuadrantesesCount();
	}

	/**
	* Updates the nueve cuadrantes in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param nueveCuadrantes the nueve cuadrantes
	* @return the nueve cuadrantes that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.nueveCuadrantes updatenueveCuadrantes(
		com.rec.hitss.layer.model.nueveCuadrantes nueveCuadrantes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nueveCuadrantesLocalService.updatenueveCuadrantes(nueveCuadrantes);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _nueveCuadrantesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_nueveCuadrantesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _nueveCuadrantesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public nueveCuadrantesLocalService getWrappednueveCuadrantesLocalService() {
		return _nueveCuadrantesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappednueveCuadrantesLocalService(
		nueveCuadrantesLocalService nueveCuadrantesLocalService) {
		_nueveCuadrantesLocalService = nueveCuadrantesLocalService;
	}

	@Override
	public nueveCuadrantesLocalService getWrappedService() {
		return _nueveCuadrantesLocalService;
	}

	@Override
	public void setWrappedService(
		nueveCuadrantesLocalService nueveCuadrantesLocalService) {
		_nueveCuadrantesLocalService = nueveCuadrantesLocalService;
	}

	private nueveCuadrantesLocalService _nueveCuadrantesLocalService;
}
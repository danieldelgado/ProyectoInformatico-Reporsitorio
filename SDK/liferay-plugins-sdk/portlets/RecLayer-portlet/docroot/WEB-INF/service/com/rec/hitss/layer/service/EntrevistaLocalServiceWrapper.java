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
 * Provides a wrapper for {@link EntrevistaLocalService}.
 *
 * @author Crossfire
 * @see EntrevistaLocalService
 * @generated
 */
public class EntrevistaLocalServiceWrapper implements EntrevistaLocalService,
	ServiceWrapper<EntrevistaLocalService> {
	public EntrevistaLocalServiceWrapper(
		EntrevistaLocalService entrevistaLocalService) {
		_entrevistaLocalService = entrevistaLocalService;
	}

	/**
	* Adds the entrevista to the database. Also notifies the appropriate model listeners.
	*
	* @param entrevista the entrevista
	* @return the entrevista that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.Entrevista addEntrevista(
		com.rec.hitss.layer.model.Entrevista entrevista)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entrevistaLocalService.addEntrevista(entrevista);
	}

	/**
	* Creates a new entrevista with the primary key. Does not add the entrevista to the database.
	*
	* @param entrevistaId the primary key for the new entrevista
	* @return the new entrevista
	*/
	@Override
	public com.rec.hitss.layer.model.Entrevista createEntrevista(
		long entrevistaId) {
		return _entrevistaLocalService.createEntrevista(entrevistaId);
	}

	/**
	* Deletes the entrevista with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entrevistaId the primary key of the entrevista
	* @return the entrevista that was removed
	* @throws PortalException if a entrevista with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.Entrevista deleteEntrevista(
		long entrevistaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _entrevistaLocalService.deleteEntrevista(entrevistaId);
	}

	/**
	* Deletes the entrevista from the database. Also notifies the appropriate model listeners.
	*
	* @param entrevista the entrevista
	* @return the entrevista that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.Entrevista deleteEntrevista(
		com.rec.hitss.layer.model.Entrevista entrevista)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entrevistaLocalService.deleteEntrevista(entrevista);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _entrevistaLocalService.dynamicQuery();
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
		return _entrevistaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EntrevistaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _entrevistaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EntrevistaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _entrevistaLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _entrevistaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _entrevistaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.Entrevista fetchEntrevista(
		long entrevistaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entrevistaLocalService.fetchEntrevista(entrevistaId);
	}

	/**
	* Returns the entrevista with the primary key.
	*
	* @param entrevistaId the primary key of the entrevista
	* @return the entrevista
	* @throws PortalException if a entrevista with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.Entrevista getEntrevista(long entrevistaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _entrevistaLocalService.getEntrevista(entrevistaId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _entrevistaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the entrevistas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EntrevistaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of entrevistas
	* @param end the upper bound of the range of entrevistas (not inclusive)
	* @return the range of entrevistas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.Entrevista> getEntrevistas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entrevistaLocalService.getEntrevistas(start, end);
	}

	/**
	* Returns the number of entrevistas.
	*
	* @return the number of entrevistas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEntrevistasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entrevistaLocalService.getEntrevistasCount();
	}

	/**
	* Updates the entrevista in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param entrevista the entrevista
	* @return the entrevista that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.Entrevista updateEntrevista(
		com.rec.hitss.layer.model.Entrevista entrevista)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entrevistaLocalService.updateEntrevista(entrevista);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _entrevistaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_entrevistaLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _entrevistaLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EntrevistaLocalService getWrappedEntrevistaLocalService() {
		return _entrevistaLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEntrevistaLocalService(
		EntrevistaLocalService entrevistaLocalService) {
		_entrevistaLocalService = entrevistaLocalService;
	}

	@Override
	public EntrevistaLocalService getWrappedService() {
		return _entrevistaLocalService;
	}

	@Override
	public void setWrappedService(EntrevistaLocalService entrevistaLocalService) {
		_entrevistaLocalService = entrevistaLocalService;
	}

	private EntrevistaLocalService _entrevistaLocalService;
}
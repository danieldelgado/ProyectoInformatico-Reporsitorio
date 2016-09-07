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
 * Provides a wrapper for {@link PrioridadGrupoUsuariosLocalService}.
 *
 * @author Danielle Delgado
 * @see PrioridadGrupoUsuariosLocalService
 * @generated
 */
public class PrioridadGrupoUsuariosLocalServiceWrapper
	implements PrioridadGrupoUsuariosLocalService,
		ServiceWrapper<PrioridadGrupoUsuariosLocalService> {
	public PrioridadGrupoUsuariosLocalServiceWrapper(
		PrioridadGrupoUsuariosLocalService prioridadGrupoUsuariosLocalService) {
		_prioridadGrupoUsuariosLocalService = prioridadGrupoUsuariosLocalService;
	}

	/**
	* Adds the prioridad grupo usuarios to the database. Also notifies the appropriate model listeners.
	*
	* @param prioridadGrupoUsuarios the prioridad grupo usuarios
	* @return the prioridad grupo usuarios that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.PrioridadGrupoUsuarios addPrioridadGrupoUsuarios(
		com.hitss.layer.model.PrioridadGrupoUsuarios prioridadGrupoUsuarios)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prioridadGrupoUsuariosLocalService.addPrioridadGrupoUsuarios(prioridadGrupoUsuarios);
	}

	/**
	* Creates a new prioridad grupo usuarios with the primary key. Does not add the prioridad grupo usuarios to the database.
	*
	* @param prioridadGrupoUsuariosId the primary key for the new prioridad grupo usuarios
	* @return the new prioridad grupo usuarios
	*/
	@Override
	public com.hitss.layer.model.PrioridadGrupoUsuarios createPrioridadGrupoUsuarios(
		long prioridadGrupoUsuariosId) {
		return _prioridadGrupoUsuariosLocalService.createPrioridadGrupoUsuarios(prioridadGrupoUsuariosId);
	}

	/**
	* Deletes the prioridad grupo usuarios with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param prioridadGrupoUsuariosId the primary key of the prioridad grupo usuarios
	* @return the prioridad grupo usuarios that was removed
	* @throws PortalException if a prioridad grupo usuarios with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.PrioridadGrupoUsuarios deletePrioridadGrupoUsuarios(
		long prioridadGrupoUsuariosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _prioridadGrupoUsuariosLocalService.deletePrioridadGrupoUsuarios(prioridadGrupoUsuariosId);
	}

	/**
	* Deletes the prioridad grupo usuarios from the database. Also notifies the appropriate model listeners.
	*
	* @param prioridadGrupoUsuarios the prioridad grupo usuarios
	* @return the prioridad grupo usuarios that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.PrioridadGrupoUsuarios deletePrioridadGrupoUsuarios(
		com.hitss.layer.model.PrioridadGrupoUsuarios prioridadGrupoUsuarios)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prioridadGrupoUsuariosLocalService.deletePrioridadGrupoUsuarios(prioridadGrupoUsuarios);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _prioridadGrupoUsuariosLocalService.dynamicQuery();
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
		return _prioridadGrupoUsuariosLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PrioridadGrupoUsuariosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _prioridadGrupoUsuariosLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PrioridadGrupoUsuariosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _prioridadGrupoUsuariosLocalService.dynamicQuery(dynamicQuery,
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
		return _prioridadGrupoUsuariosLocalService.dynamicQueryCount(dynamicQuery);
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
		return _prioridadGrupoUsuariosLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.PrioridadGrupoUsuarios fetchPrioridadGrupoUsuarios(
		long prioridadGrupoUsuariosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prioridadGrupoUsuariosLocalService.fetchPrioridadGrupoUsuarios(prioridadGrupoUsuariosId);
	}

	/**
	* Returns the prioridad grupo usuarios with the primary key.
	*
	* @param prioridadGrupoUsuariosId the primary key of the prioridad grupo usuarios
	* @return the prioridad grupo usuarios
	* @throws PortalException if a prioridad grupo usuarios with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.PrioridadGrupoUsuarios getPrioridadGrupoUsuarios(
		long prioridadGrupoUsuariosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _prioridadGrupoUsuariosLocalService.getPrioridadGrupoUsuarios(prioridadGrupoUsuariosId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _prioridadGrupoUsuariosLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the prioridad grupo usuarioses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PrioridadGrupoUsuariosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prioridad grupo usuarioses
	* @param end the upper bound of the range of prioridad grupo usuarioses (not inclusive)
	* @return the range of prioridad grupo usuarioses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.PrioridadGrupoUsuarios> getPrioridadGrupoUsuarioses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prioridadGrupoUsuariosLocalService.getPrioridadGrupoUsuarioses(start,
			end);
	}

	/**
	* Returns the number of prioridad grupo usuarioses.
	*
	* @return the number of prioridad grupo usuarioses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPrioridadGrupoUsuariosesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prioridadGrupoUsuariosLocalService.getPrioridadGrupoUsuariosesCount();
	}

	/**
	* Updates the prioridad grupo usuarios in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param prioridadGrupoUsuarios the prioridad grupo usuarios
	* @return the prioridad grupo usuarios that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.PrioridadGrupoUsuarios updatePrioridadGrupoUsuarios(
		com.hitss.layer.model.PrioridadGrupoUsuarios prioridadGrupoUsuarios)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _prioridadGrupoUsuariosLocalService.updatePrioridadGrupoUsuarios(prioridadGrupoUsuarios);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _prioridadGrupoUsuariosLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_prioridadGrupoUsuariosLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _prioridadGrupoUsuariosLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.hitss.layer.model.PrioridadGrupoUsuarios> getListaPrioridadGrupoUsuariosBySolicitud(
		java.lang.Long solicitudId) {
		return _prioridadGrupoUsuariosLocalService.getListaPrioridadGrupoUsuariosBySolicitud(solicitudId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PrioridadGrupoUsuariosLocalService getWrappedPrioridadGrupoUsuariosLocalService() {
		return _prioridadGrupoUsuariosLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPrioridadGrupoUsuariosLocalService(
		PrioridadGrupoUsuariosLocalService prioridadGrupoUsuariosLocalService) {
		_prioridadGrupoUsuariosLocalService = prioridadGrupoUsuariosLocalService;
	}

	@Override
	public PrioridadGrupoUsuariosLocalService getWrappedService() {
		return _prioridadGrupoUsuariosLocalService;
	}

	@Override
	public void setWrappedService(
		PrioridadGrupoUsuariosLocalService prioridadGrupoUsuariosLocalService) {
		_prioridadGrupoUsuariosLocalService = prioridadGrupoUsuariosLocalService;
	}

	private PrioridadGrupoUsuariosLocalService _prioridadGrupoUsuariosLocalService;
}
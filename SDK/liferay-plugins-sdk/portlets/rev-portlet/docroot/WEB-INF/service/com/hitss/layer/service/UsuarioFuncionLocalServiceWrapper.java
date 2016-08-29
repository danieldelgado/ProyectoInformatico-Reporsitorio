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
 * Provides a wrapper for {@link UsuarioFuncionLocalService}.
 *
 * @author Danielle Delgado
 * @see UsuarioFuncionLocalService
 * @generated
 */
public class UsuarioFuncionLocalServiceWrapper
	implements UsuarioFuncionLocalService,
		ServiceWrapper<UsuarioFuncionLocalService> {
	public UsuarioFuncionLocalServiceWrapper(
		UsuarioFuncionLocalService usuarioFuncionLocalService) {
		_usuarioFuncionLocalService = usuarioFuncionLocalService;
	}

	/**
	* Adds the usuario funcion to the database. Also notifies the appropriate model listeners.
	*
	* @param usuarioFuncion the usuario funcion
	* @return the usuario funcion that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.UsuarioFuncion addUsuarioFuncion(
		com.hitss.layer.model.UsuarioFuncion usuarioFuncion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioFuncionLocalService.addUsuarioFuncion(usuarioFuncion);
	}

	/**
	* Creates a new usuario funcion with the primary key. Does not add the usuario funcion to the database.
	*
	* @param usuarioFuncionPK the primary key for the new usuario funcion
	* @return the new usuario funcion
	*/
	@Override
	public com.hitss.layer.model.UsuarioFuncion createUsuarioFuncion(
		com.hitss.layer.service.persistence.UsuarioFuncionPK usuarioFuncionPK) {
		return _usuarioFuncionLocalService.createUsuarioFuncion(usuarioFuncionPK);
	}

	/**
	* Deletes the usuario funcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param usuarioFuncionPK the primary key of the usuario funcion
	* @return the usuario funcion that was removed
	* @throws PortalException if a usuario funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.UsuarioFuncion deleteUsuarioFuncion(
		com.hitss.layer.service.persistence.UsuarioFuncionPK usuarioFuncionPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usuarioFuncionLocalService.deleteUsuarioFuncion(usuarioFuncionPK);
	}

	/**
	* Deletes the usuario funcion from the database. Also notifies the appropriate model listeners.
	*
	* @param usuarioFuncion the usuario funcion
	* @return the usuario funcion that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.UsuarioFuncion deleteUsuarioFuncion(
		com.hitss.layer.model.UsuarioFuncion usuarioFuncion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioFuncionLocalService.deleteUsuarioFuncion(usuarioFuncion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _usuarioFuncionLocalService.dynamicQuery();
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
		return _usuarioFuncionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _usuarioFuncionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _usuarioFuncionLocalService.dynamicQuery(dynamicQuery, start,
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
		return _usuarioFuncionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _usuarioFuncionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.UsuarioFuncion fetchUsuarioFuncion(
		com.hitss.layer.service.persistence.UsuarioFuncionPK usuarioFuncionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioFuncionLocalService.fetchUsuarioFuncion(usuarioFuncionPK);
	}

	/**
	* Returns the usuario funcion with the primary key.
	*
	* @param usuarioFuncionPK the primary key of the usuario funcion
	* @return the usuario funcion
	* @throws PortalException if a usuario funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.UsuarioFuncion getUsuarioFuncion(
		com.hitss.layer.service.persistence.UsuarioFuncionPK usuarioFuncionPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usuarioFuncionLocalService.getUsuarioFuncion(usuarioFuncionPK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usuarioFuncionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the usuario funcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuario funcions
	* @param end the upper bound of the range of usuario funcions (not inclusive)
	* @return the range of usuario funcions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.UsuarioFuncion> getUsuarioFuncions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioFuncionLocalService.getUsuarioFuncions(start, end);
	}

	/**
	* Returns the number of usuario funcions.
	*
	* @return the number of usuario funcions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getUsuarioFuncionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioFuncionLocalService.getUsuarioFuncionsCount();
	}

	/**
	* Updates the usuario funcion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param usuarioFuncion the usuario funcion
	* @return the usuario funcion that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.UsuarioFuncion updateUsuarioFuncion(
		com.hitss.layer.model.UsuarioFuncion usuarioFuncion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioFuncionLocalService.updateUsuarioFuncion(usuarioFuncion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _usuarioFuncionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_usuarioFuncionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _usuarioFuncionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UsuarioFuncionLocalService getWrappedUsuarioFuncionLocalService() {
		return _usuarioFuncionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUsuarioFuncionLocalService(
		UsuarioFuncionLocalService usuarioFuncionLocalService) {
		_usuarioFuncionLocalService = usuarioFuncionLocalService;
	}

	@Override
	public UsuarioFuncionLocalService getWrappedService() {
		return _usuarioFuncionLocalService;
	}

	@Override
	public void setWrappedService(
		UsuarioFuncionLocalService usuarioFuncionLocalService) {
		_usuarioFuncionLocalService = usuarioFuncionLocalService;
	}

	private UsuarioFuncionLocalService _usuarioFuncionLocalService;
}
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
 * Provides a wrapper for {@link UsuarioGrupoLocalService}.
 *
 * @author Crossfire
 * @see UsuarioGrupoLocalService
 * @generated
 */
public class UsuarioGrupoLocalServiceWrapper implements UsuarioGrupoLocalService,
	ServiceWrapper<UsuarioGrupoLocalService> {
	public UsuarioGrupoLocalServiceWrapper(
		UsuarioGrupoLocalService usuarioGrupoLocalService) {
		_usuarioGrupoLocalService = usuarioGrupoLocalService;
	}

	/**
	* Adds the usuario grupo to the database. Also notifies the appropriate model listeners.
	*
	* @param usuarioGrupo the usuario grupo
	* @return the usuario grupo that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.UsuarioGrupo addUsuarioGrupo(
		com.rec.hitss.layer.model.UsuarioGrupo usuarioGrupo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioGrupoLocalService.addUsuarioGrupo(usuarioGrupo);
	}

	/**
	* Creates a new usuario grupo with the primary key. Does not add the usuario grupo to the database.
	*
	* @param userGroupId the primary key for the new usuario grupo
	* @return the new usuario grupo
	*/
	@Override
	public com.rec.hitss.layer.model.UsuarioGrupo createUsuarioGrupo(
		long userGroupId) {
		return _usuarioGrupoLocalService.createUsuarioGrupo(userGroupId);
	}

	/**
	* Deletes the usuario grupo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userGroupId the primary key of the usuario grupo
	* @return the usuario grupo that was removed
	* @throws PortalException if a usuario grupo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.UsuarioGrupo deleteUsuarioGrupo(
		long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usuarioGrupoLocalService.deleteUsuarioGrupo(userGroupId);
	}

	/**
	* Deletes the usuario grupo from the database. Also notifies the appropriate model listeners.
	*
	* @param usuarioGrupo the usuario grupo
	* @return the usuario grupo that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.UsuarioGrupo deleteUsuarioGrupo(
		com.rec.hitss.layer.model.UsuarioGrupo usuarioGrupo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioGrupoLocalService.deleteUsuarioGrupo(usuarioGrupo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _usuarioGrupoLocalService.dynamicQuery();
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
		return _usuarioGrupoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.UsuarioGrupoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _usuarioGrupoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.UsuarioGrupoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _usuarioGrupoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _usuarioGrupoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _usuarioGrupoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.UsuarioGrupo fetchUsuarioGrupo(
		long userGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioGrupoLocalService.fetchUsuarioGrupo(userGroupId);
	}

	/**
	* Returns the usuario grupo with the primary key.
	*
	* @param userGroupId the primary key of the usuario grupo
	* @return the usuario grupo
	* @throws PortalException if a usuario grupo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.UsuarioGrupo getUsuarioGrupo(
		long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usuarioGrupoLocalService.getUsuarioGrupo(userGroupId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usuarioGrupoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the usuario grupos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.UsuarioGrupoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuario grupos
	* @param end the upper bound of the range of usuario grupos (not inclusive)
	* @return the range of usuario grupos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.UsuarioGrupo> getUsuarioGrupos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioGrupoLocalService.getUsuarioGrupos(start, end);
	}

	/**
	* Returns the number of usuario grupos.
	*
	* @return the number of usuario grupos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getUsuarioGruposCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioGrupoLocalService.getUsuarioGruposCount();
	}

	/**
	* Updates the usuario grupo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param usuarioGrupo the usuario grupo
	* @return the usuario grupo that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.UsuarioGrupo updateUsuarioGrupo(
		com.rec.hitss.layer.model.UsuarioGrupo usuarioGrupo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioGrupoLocalService.updateUsuarioGrupo(usuarioGrupo);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _usuarioGrupoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_usuarioGrupoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _usuarioGrupoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UsuarioGrupoLocalService getWrappedUsuarioGrupoLocalService() {
		return _usuarioGrupoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUsuarioGrupoLocalService(
		UsuarioGrupoLocalService usuarioGrupoLocalService) {
		_usuarioGrupoLocalService = usuarioGrupoLocalService;
	}

	@Override
	public UsuarioGrupoLocalService getWrappedService() {
		return _usuarioGrupoLocalService;
	}

	@Override
	public void setWrappedService(
		UsuarioGrupoLocalService usuarioGrupoLocalService) {
		_usuarioGrupoLocalService = usuarioGrupoLocalService;
	}

	private UsuarioGrupoLocalService _usuarioGrupoLocalService;
}
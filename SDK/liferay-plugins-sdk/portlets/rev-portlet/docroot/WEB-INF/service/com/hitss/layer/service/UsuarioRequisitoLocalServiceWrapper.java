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
 * Provides a wrapper for {@link UsuarioRequisitoLocalService}.
 *
 * @author Danielle Delgado
 * @see UsuarioRequisitoLocalService
 * @generated
 */
public class UsuarioRequisitoLocalServiceWrapper
	implements UsuarioRequisitoLocalService,
		ServiceWrapper<UsuarioRequisitoLocalService> {
	public UsuarioRequisitoLocalServiceWrapper(
		UsuarioRequisitoLocalService usuarioRequisitoLocalService) {
		_usuarioRequisitoLocalService = usuarioRequisitoLocalService;
	}

	/**
	* Adds the usuario requisito to the database. Also notifies the appropriate model listeners.
	*
	* @param usuarioRequisito the usuario requisito
	* @return the usuario requisito that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.UsuarioRequisito addUsuarioRequisito(
		com.hitss.layer.model.UsuarioRequisito usuarioRequisito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioRequisitoLocalService.addUsuarioRequisito(usuarioRequisito);
	}

	/**
	* Creates a new usuario requisito with the primary key. Does not add the usuario requisito to the database.
	*
	* @param usuarioRequisitoPK the primary key for the new usuario requisito
	* @return the new usuario requisito
	*/
	@Override
	public com.hitss.layer.model.UsuarioRequisito createUsuarioRequisito(
		com.hitss.layer.service.persistence.UsuarioRequisitoPK usuarioRequisitoPK) {
		return _usuarioRequisitoLocalService.createUsuarioRequisito(usuarioRequisitoPK);
	}

	/**
	* Deletes the usuario requisito with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param usuarioRequisitoPK the primary key of the usuario requisito
	* @return the usuario requisito that was removed
	* @throws PortalException if a usuario requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.UsuarioRequisito deleteUsuarioRequisito(
		com.hitss.layer.service.persistence.UsuarioRequisitoPK usuarioRequisitoPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usuarioRequisitoLocalService.deleteUsuarioRequisito(usuarioRequisitoPK);
	}

	/**
	* Deletes the usuario requisito from the database. Also notifies the appropriate model listeners.
	*
	* @param usuarioRequisito the usuario requisito
	* @return the usuario requisito that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.UsuarioRequisito deleteUsuarioRequisito(
		com.hitss.layer.model.UsuarioRequisito usuarioRequisito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioRequisitoLocalService.deleteUsuarioRequisito(usuarioRequisito);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _usuarioRequisitoLocalService.dynamicQuery();
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
		return _usuarioRequisitoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _usuarioRequisitoLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _usuarioRequisitoLocalService.dynamicQuery(dynamicQuery, start,
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
		return _usuarioRequisitoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _usuarioRequisitoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.UsuarioRequisito fetchUsuarioRequisito(
		com.hitss.layer.service.persistence.UsuarioRequisitoPK usuarioRequisitoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioRequisitoLocalService.fetchUsuarioRequisito(usuarioRequisitoPK);
	}

	/**
	* Returns the usuario requisito with the primary key.
	*
	* @param usuarioRequisitoPK the primary key of the usuario requisito
	* @return the usuario requisito
	* @throws PortalException if a usuario requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.UsuarioRequisito getUsuarioRequisito(
		com.hitss.layer.service.persistence.UsuarioRequisitoPK usuarioRequisitoPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usuarioRequisitoLocalService.getUsuarioRequisito(usuarioRequisitoPK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usuarioRequisitoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the usuario requisitos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuario requisitos
	* @param end the upper bound of the range of usuario requisitos (not inclusive)
	* @return the range of usuario requisitos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.UsuarioRequisito> getUsuarioRequisitos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioRequisitoLocalService.getUsuarioRequisitos(start, end);
	}

	/**
	* Returns the number of usuario requisitos.
	*
	* @return the number of usuario requisitos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getUsuarioRequisitosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioRequisitoLocalService.getUsuarioRequisitosCount();
	}

	/**
	* Updates the usuario requisito in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param usuarioRequisito the usuario requisito
	* @return the usuario requisito that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.UsuarioRequisito updateUsuarioRequisito(
		com.hitss.layer.model.UsuarioRequisito usuarioRequisito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioRequisitoLocalService.updateUsuarioRequisito(usuarioRequisito);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _usuarioRequisitoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_usuarioRequisitoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _usuarioRequisitoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.hitss.layer.model.UsuarioRequisito> getUsuarioRequisito(
		java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioRequisitoLocalService.getUsuarioRequisito(userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UsuarioRequisitoLocalService getWrappedUsuarioRequisitoLocalService() {
		return _usuarioRequisitoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUsuarioRequisitoLocalService(
		UsuarioRequisitoLocalService usuarioRequisitoLocalService) {
		_usuarioRequisitoLocalService = usuarioRequisitoLocalService;
	}

	@Override
	public UsuarioRequisitoLocalService getWrappedService() {
		return _usuarioRequisitoLocalService;
	}

	@Override
	public void setWrappedService(
		UsuarioRequisitoLocalService usuarioRequisitoLocalService) {
		_usuarioRequisitoLocalService = usuarioRequisitoLocalService;
	}

	private UsuarioRequisitoLocalService _usuarioRequisitoLocalService;
}
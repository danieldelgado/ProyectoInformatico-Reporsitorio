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
 * Provides a wrapper for {@link UsuarioEvaluacionLocalService}.
 *
 * @author Danielle Delgado
 * @see UsuarioEvaluacionLocalService
 * @generated
 */
public class UsuarioEvaluacionLocalServiceWrapper
	implements UsuarioEvaluacionLocalService,
		ServiceWrapper<UsuarioEvaluacionLocalService> {
	public UsuarioEvaluacionLocalServiceWrapper(
		UsuarioEvaluacionLocalService usuarioEvaluacionLocalService) {
		_usuarioEvaluacionLocalService = usuarioEvaluacionLocalService;
	}

	/**
	* Adds the usuario evaluacion to the database. Also notifies the appropriate model listeners.
	*
	* @param usuarioEvaluacion the usuario evaluacion
	* @return the usuario evaluacion that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.UsuarioEvaluacion addUsuarioEvaluacion(
		com.hitss.layer.model.UsuarioEvaluacion usuarioEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioEvaluacionLocalService.addUsuarioEvaluacion(usuarioEvaluacion);
	}

	/**
	* Creates a new usuario evaluacion with the primary key. Does not add the usuario evaluacion to the database.
	*
	* @param usuarioEvaluacionPK the primary key for the new usuario evaluacion
	* @return the new usuario evaluacion
	*/
	@Override
	public com.hitss.layer.model.UsuarioEvaluacion createUsuarioEvaluacion(
		com.hitss.layer.service.persistence.UsuarioEvaluacionPK usuarioEvaluacionPK) {
		return _usuarioEvaluacionLocalService.createUsuarioEvaluacion(usuarioEvaluacionPK);
	}

	/**
	* Deletes the usuario evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param usuarioEvaluacionPK the primary key of the usuario evaluacion
	* @return the usuario evaluacion that was removed
	* @throws PortalException if a usuario evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.UsuarioEvaluacion deleteUsuarioEvaluacion(
		com.hitss.layer.service.persistence.UsuarioEvaluacionPK usuarioEvaluacionPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usuarioEvaluacionLocalService.deleteUsuarioEvaluacion(usuarioEvaluacionPK);
	}

	/**
	* Deletes the usuario evaluacion from the database. Also notifies the appropriate model listeners.
	*
	* @param usuarioEvaluacion the usuario evaluacion
	* @return the usuario evaluacion that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.UsuarioEvaluacion deleteUsuarioEvaluacion(
		com.hitss.layer.model.UsuarioEvaluacion usuarioEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioEvaluacionLocalService.deleteUsuarioEvaluacion(usuarioEvaluacion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _usuarioEvaluacionLocalService.dynamicQuery();
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
		return _usuarioEvaluacionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _usuarioEvaluacionLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _usuarioEvaluacionLocalService.dynamicQuery(dynamicQuery, start,
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
		return _usuarioEvaluacionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _usuarioEvaluacionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.UsuarioEvaluacion fetchUsuarioEvaluacion(
		com.hitss.layer.service.persistence.UsuarioEvaluacionPK usuarioEvaluacionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioEvaluacionLocalService.fetchUsuarioEvaluacion(usuarioEvaluacionPK);
	}

	/**
	* Returns the usuario evaluacion with the primary key.
	*
	* @param usuarioEvaluacionPK the primary key of the usuario evaluacion
	* @return the usuario evaluacion
	* @throws PortalException if a usuario evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.UsuarioEvaluacion getUsuarioEvaluacion(
		com.hitss.layer.service.persistence.UsuarioEvaluacionPK usuarioEvaluacionPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usuarioEvaluacionLocalService.getUsuarioEvaluacion(usuarioEvaluacionPK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usuarioEvaluacionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the usuario evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuario evaluacions
	* @param end the upper bound of the range of usuario evaluacions (not inclusive)
	* @return the range of usuario evaluacions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.UsuarioEvaluacion> getUsuarioEvaluacions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioEvaluacionLocalService.getUsuarioEvaluacions(start, end);
	}

	/**
	* Returns the number of usuario evaluacions.
	*
	* @return the number of usuario evaluacions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getUsuarioEvaluacionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioEvaluacionLocalService.getUsuarioEvaluacionsCount();
	}

	/**
	* Updates the usuario evaluacion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param usuarioEvaluacion the usuario evaluacion
	* @return the usuario evaluacion that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.UsuarioEvaluacion updateUsuarioEvaluacion(
		com.hitss.layer.model.UsuarioEvaluacion usuarioEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usuarioEvaluacionLocalService.updateUsuarioEvaluacion(usuarioEvaluacion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _usuarioEvaluacionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_usuarioEvaluacionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _usuarioEvaluacionLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UsuarioEvaluacionLocalService getWrappedUsuarioEvaluacionLocalService() {
		return _usuarioEvaluacionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUsuarioEvaluacionLocalService(
		UsuarioEvaluacionLocalService usuarioEvaluacionLocalService) {
		_usuarioEvaluacionLocalService = usuarioEvaluacionLocalService;
	}

	@Override
	public UsuarioEvaluacionLocalService getWrappedService() {
		return _usuarioEvaluacionLocalService;
	}

	@Override
	public void setWrappedService(
		UsuarioEvaluacionLocalService usuarioEvaluacionLocalService) {
		_usuarioEvaluacionLocalService = usuarioEvaluacionLocalService;
	}

	private UsuarioEvaluacionLocalService _usuarioEvaluacionLocalService;
}
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
 * Provides a wrapper for {@link RequerimientoRecursoLocalService}.
 *
 * @author Crossfire
 * @see RequerimientoRecursoLocalService
 * @generated
 */
public class RequerimientoRecursoLocalServiceWrapper
	implements RequerimientoRecursoLocalService,
		ServiceWrapper<RequerimientoRecursoLocalService> {
	public RequerimientoRecursoLocalServiceWrapper(
		RequerimientoRecursoLocalService requerimientoRecursoLocalService) {
		_requerimientoRecursoLocalService = requerimientoRecursoLocalService;
	}

	/**
	* Adds the requerimiento recurso to the database. Also notifies the appropriate model listeners.
	*
	* @param requerimientoRecurso the requerimiento recurso
	* @return the requerimiento recurso that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.RequerimientoRecurso addRequerimientoRecurso(
		com.rec.hitss.layer.model.RequerimientoRecurso requerimientoRecurso)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoRecursoLocalService.addRequerimientoRecurso(requerimientoRecurso);
	}

	/**
	* Creates a new requerimiento recurso with the primary key. Does not add the requerimiento recurso to the database.
	*
	* @param requerimientoRecursoId the primary key for the new requerimiento recurso
	* @return the new requerimiento recurso
	*/
	@Override
	public com.rec.hitss.layer.model.RequerimientoRecurso createRequerimientoRecurso(
		long requerimientoRecursoId) {
		return _requerimientoRecursoLocalService.createRequerimientoRecurso(requerimientoRecursoId);
	}

	/**
	* Deletes the requerimiento recurso with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param requerimientoRecursoId the primary key of the requerimiento recurso
	* @return the requerimiento recurso that was removed
	* @throws PortalException if a requerimiento recurso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.RequerimientoRecurso deleteRequerimientoRecurso(
		long requerimientoRecursoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoRecursoLocalService.deleteRequerimientoRecurso(requerimientoRecursoId);
	}

	/**
	* Deletes the requerimiento recurso from the database. Also notifies the appropriate model listeners.
	*
	* @param requerimientoRecurso the requerimiento recurso
	* @return the requerimiento recurso that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.RequerimientoRecurso deleteRequerimientoRecurso(
		com.rec.hitss.layer.model.RequerimientoRecurso requerimientoRecurso)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoRecursoLocalService.deleteRequerimientoRecurso(requerimientoRecurso);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _requerimientoRecursoLocalService.dynamicQuery();
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
		return _requerimientoRecursoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.RequerimientoRecursoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _requerimientoRecursoLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.RequerimientoRecursoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _requerimientoRecursoLocalService.dynamicQuery(dynamicQuery,
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
		return _requerimientoRecursoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _requerimientoRecursoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.RequerimientoRecurso fetchRequerimientoRecurso(
		long requerimientoRecursoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoRecursoLocalService.fetchRequerimientoRecurso(requerimientoRecursoId);
	}

	/**
	* Returns the requerimiento recurso with the primary key.
	*
	* @param requerimientoRecursoId the primary key of the requerimiento recurso
	* @return the requerimiento recurso
	* @throws PortalException if a requerimiento recurso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.RequerimientoRecurso getRequerimientoRecurso(
		long requerimientoRecursoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoRecursoLocalService.getRequerimientoRecurso(requerimientoRecursoId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoRecursoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the requerimiento recursos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.RequerimientoRecursoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of requerimiento recursos
	* @param end the upper bound of the range of requerimiento recursos (not inclusive)
	* @return the range of requerimiento recursos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.RequerimientoRecurso> getRequerimientoRecursos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoRecursoLocalService.getRequerimientoRecursos(start,
			end);
	}

	/**
	* Returns the number of requerimiento recursos.
	*
	* @return the number of requerimiento recursos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getRequerimientoRecursosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoRecursoLocalService.getRequerimientoRecursosCount();
	}

	/**
	* Updates the requerimiento recurso in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param requerimientoRecurso the requerimiento recurso
	* @return the requerimiento recurso that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.RequerimientoRecurso updateRequerimientoRecurso(
		com.rec.hitss.layer.model.RequerimientoRecurso requerimientoRecurso)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requerimientoRecursoLocalService.updateRequerimientoRecurso(requerimientoRecurso);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _requerimientoRecursoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_requerimientoRecursoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _requerimientoRecursoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public com.rec.hitss.layer.model.RequerimientoRecurso findByRequerimientoUnique(
		java.lang.Long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRequerimientoRecursoException,
			java.text.ParseException {
		return _requerimientoRecursoLocalService.findByRequerimientoUnique(solicitudRequerimientoId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public RequerimientoRecursoLocalService getWrappedRequerimientoRecursoLocalService() {
		return _requerimientoRecursoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRequerimientoRecursoLocalService(
		RequerimientoRecursoLocalService requerimientoRecursoLocalService) {
		_requerimientoRecursoLocalService = requerimientoRecursoLocalService;
	}

	@Override
	public RequerimientoRecursoLocalService getWrappedService() {
		return _requerimientoRecursoLocalService;
	}

	@Override
	public void setWrappedService(
		RequerimientoRecursoLocalService requerimientoRecursoLocalService) {
		_requerimientoRecursoLocalService = requerimientoRecursoLocalService;
	}

	private RequerimientoRecursoLocalService _requerimientoRecursoLocalService;
}
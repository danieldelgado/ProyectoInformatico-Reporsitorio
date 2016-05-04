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
 * Provides a wrapper for {@link ExperienciaLocalService}.
 *
 * @author Danielle Delgado
 * @see ExperienciaLocalService
 * @generated
 */
public class ExperienciaLocalServiceWrapper implements ExperienciaLocalService,
	ServiceWrapper<ExperienciaLocalService> {
	public ExperienciaLocalServiceWrapper(
		ExperienciaLocalService experienciaLocalService) {
		_experienciaLocalService = experienciaLocalService;
	}

	/**
	* Adds the experiencia to the database. Also notifies the appropriate model listeners.
	*
	* @param experiencia the experiencia
	* @return the experiencia that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Experiencia addExperiencia(
		com.hitss.layer.model.Experiencia experiencia)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _experienciaLocalService.addExperiencia(experiencia);
	}

	/**
	* Creates a new experiencia with the primary key. Does not add the experiencia to the database.
	*
	* @param experienciaId the primary key for the new experiencia
	* @return the new experiencia
	*/
	@Override
	public com.hitss.layer.model.Experiencia createExperiencia(
		long experienciaId) {
		return _experienciaLocalService.createExperiencia(experienciaId);
	}

	/**
	* Deletes the experiencia with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param experienciaId the primary key of the experiencia
	* @return the experiencia that was removed
	* @throws PortalException if a experiencia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Experiencia deleteExperiencia(
		long experienciaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _experienciaLocalService.deleteExperiencia(experienciaId);
	}

	/**
	* Deletes the experiencia from the database. Also notifies the appropriate model listeners.
	*
	* @param experiencia the experiencia
	* @return the experiencia that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Experiencia deleteExperiencia(
		com.hitss.layer.model.Experiencia experiencia)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _experienciaLocalService.deleteExperiencia(experiencia);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _experienciaLocalService.dynamicQuery();
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
		return _experienciaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ExperienciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _experienciaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ExperienciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _experienciaLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _experienciaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _experienciaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.Experiencia fetchExperiencia(
		long experienciaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _experienciaLocalService.fetchExperiencia(experienciaId);
	}

	/**
	* Returns the experiencia with the primary key.
	*
	* @param experienciaId the primary key of the experiencia
	* @return the experiencia
	* @throws PortalException if a experiencia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Experiencia getExperiencia(long experienciaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _experienciaLocalService.getExperiencia(experienciaId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _experienciaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the experiencias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ExperienciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of experiencias
	* @param end the upper bound of the range of experiencias (not inclusive)
	* @return the range of experiencias
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.Experiencia> getExperiencias(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _experienciaLocalService.getExperiencias(start, end);
	}

	/**
	* Returns the number of experiencias.
	*
	* @return the number of experiencias
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getExperienciasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _experienciaLocalService.getExperienciasCount();
	}

	/**
	* Updates the experiencia in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param experiencia the experiencia
	* @return the experiencia that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Experiencia updateExperiencia(
		com.hitss.layer.model.Experiencia experiencia)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _experienciaLocalService.updateExperiencia(experiencia);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _experienciaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_experienciaLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _experienciaLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ExperienciaLocalService getWrappedExperienciaLocalService() {
		return _experienciaLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedExperienciaLocalService(
		ExperienciaLocalService experienciaLocalService) {
		_experienciaLocalService = experienciaLocalService;
	}

	@Override
	public ExperienciaLocalService getWrappedService() {
		return _experienciaLocalService;
	}

	@Override
	public void setWrappedService(
		ExperienciaLocalService experienciaLocalService) {
		_experienciaLocalService = experienciaLocalService;
	}

	private ExperienciaLocalService _experienciaLocalService;
}
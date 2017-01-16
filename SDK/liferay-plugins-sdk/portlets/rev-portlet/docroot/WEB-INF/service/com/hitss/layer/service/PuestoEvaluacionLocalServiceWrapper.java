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
 * Provides a wrapper for {@link PuestoEvaluacionLocalService}.
 *
 * @author Danielle Delgado
 * @see PuestoEvaluacionLocalService
 * @generated
 */
public class PuestoEvaluacionLocalServiceWrapper
	implements PuestoEvaluacionLocalService,
		ServiceWrapper<PuestoEvaluacionLocalService> {
	public PuestoEvaluacionLocalServiceWrapper(
		PuestoEvaluacionLocalService puestoEvaluacionLocalService) {
		_puestoEvaluacionLocalService = puestoEvaluacionLocalService;
	}

	/**
	* Adds the puesto evaluacion to the database. Also notifies the appropriate model listeners.
	*
	* @param puestoEvaluacion the puesto evaluacion
	* @return the puesto evaluacion that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.PuestoEvaluacion addPuestoEvaluacion(
		com.hitss.layer.model.PuestoEvaluacion puestoEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestoEvaluacionLocalService.addPuestoEvaluacion(puestoEvaluacion);
	}

	/**
	* Creates a new puesto evaluacion with the primary key. Does not add the puesto evaluacion to the database.
	*
	* @param puestoEvaluacionPK the primary key for the new puesto evaluacion
	* @return the new puesto evaluacion
	*/
	@Override
	public com.hitss.layer.model.PuestoEvaluacion createPuestoEvaluacion(
		com.hitss.layer.service.persistence.PuestoEvaluacionPK puestoEvaluacionPK) {
		return _puestoEvaluacionLocalService.createPuestoEvaluacion(puestoEvaluacionPK);
	}

	/**
	* Deletes the puesto evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param puestoEvaluacionPK the primary key of the puesto evaluacion
	* @return the puesto evaluacion that was removed
	* @throws PortalException if a puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.PuestoEvaluacion deletePuestoEvaluacion(
		com.hitss.layer.service.persistence.PuestoEvaluacionPK puestoEvaluacionPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _puestoEvaluacionLocalService.deletePuestoEvaluacion(puestoEvaluacionPK);
	}

	/**
	* Deletes the puesto evaluacion from the database. Also notifies the appropriate model listeners.
	*
	* @param puestoEvaluacion the puesto evaluacion
	* @return the puesto evaluacion that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.PuestoEvaluacion deletePuestoEvaluacion(
		com.hitss.layer.model.PuestoEvaluacion puestoEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestoEvaluacionLocalService.deletePuestoEvaluacion(puestoEvaluacion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _puestoEvaluacionLocalService.dynamicQuery();
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
		return _puestoEvaluacionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _puestoEvaluacionLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _puestoEvaluacionLocalService.dynamicQuery(dynamicQuery, start,
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
		return _puestoEvaluacionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _puestoEvaluacionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.PuestoEvaluacion fetchPuestoEvaluacion(
		com.hitss.layer.service.persistence.PuestoEvaluacionPK puestoEvaluacionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestoEvaluacionLocalService.fetchPuestoEvaluacion(puestoEvaluacionPK);
	}

	/**
	* Returns the puesto evaluacion with the primary key.
	*
	* @param puestoEvaluacionPK the primary key of the puesto evaluacion
	* @return the puesto evaluacion
	* @throws PortalException if a puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.PuestoEvaluacion getPuestoEvaluacion(
		com.hitss.layer.service.persistence.PuestoEvaluacionPK puestoEvaluacionPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _puestoEvaluacionLocalService.getPuestoEvaluacion(puestoEvaluacionPK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _puestoEvaluacionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the puesto evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of puesto evaluacions
	* @param end the upper bound of the range of puesto evaluacions (not inclusive)
	* @return the range of puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.PuestoEvaluacion> getPuestoEvaluacions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestoEvaluacionLocalService.getPuestoEvaluacions(start, end);
	}

	/**
	* Returns the number of puesto evaluacions.
	*
	* @return the number of puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPuestoEvaluacionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestoEvaluacionLocalService.getPuestoEvaluacionsCount();
	}

	/**
	* Updates the puesto evaluacion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param puestoEvaluacion the puesto evaluacion
	* @return the puesto evaluacion that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.PuestoEvaluacion updatePuestoEvaluacion(
		com.hitss.layer.model.PuestoEvaluacion puestoEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestoEvaluacionLocalService.updatePuestoEvaluacion(puestoEvaluacion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _puestoEvaluacionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_puestoEvaluacionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _puestoEvaluacionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.hitss.layer.model.PuestoEvaluacion> findByS_ALL(
		java.lang.Long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestoEvaluacionLocalService.findByS_ALL(id);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PuestoEvaluacionLocalService getWrappedPuestoEvaluacionLocalService() {
		return _puestoEvaluacionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPuestoEvaluacionLocalService(
		PuestoEvaluacionLocalService puestoEvaluacionLocalService) {
		_puestoEvaluacionLocalService = puestoEvaluacionLocalService;
	}

	@Override
	public PuestoEvaluacionLocalService getWrappedService() {
		return _puestoEvaluacionLocalService;
	}

	@Override
	public void setWrappedService(
		PuestoEvaluacionLocalService puestoEvaluacionLocalService) {
		_puestoEvaluacionLocalService = puestoEvaluacionLocalService;
	}

	private PuestoEvaluacionLocalService _puestoEvaluacionLocalService;
}
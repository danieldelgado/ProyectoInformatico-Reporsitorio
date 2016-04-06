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
 * Provides a wrapper for {@link EvaluacionReclutamientoLocalService}.
 *
 * @author Crossfire
 * @see EvaluacionReclutamientoLocalService
 * @generated
 */
public class EvaluacionReclutamientoLocalServiceWrapper
	implements EvaluacionReclutamientoLocalService,
		ServiceWrapper<EvaluacionReclutamientoLocalService> {
	public EvaluacionReclutamientoLocalServiceWrapper(
		EvaluacionReclutamientoLocalService evaluacionReclutamientoLocalService) {
		_evaluacionReclutamientoLocalService = evaluacionReclutamientoLocalService;
	}

	/**
	* Adds the evaluacion reclutamiento to the database. Also notifies the appropriate model listeners.
	*
	* @param evaluacionReclutamiento the evaluacion reclutamiento
	* @return the evaluacion reclutamiento that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.EvaluacionReclutamiento addEvaluacionReclutamiento(
		com.rec.hitss.layer.model.EvaluacionReclutamiento evaluacionReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionReclutamientoLocalService.addEvaluacionReclutamiento(evaluacionReclutamiento);
	}

	/**
	* Creates a new evaluacion reclutamiento with the primary key. Does not add the evaluacion reclutamiento to the database.
	*
	* @param ER_ID the primary key for the new evaluacion reclutamiento
	* @return the new evaluacion reclutamiento
	*/
	@Override
	public com.rec.hitss.layer.model.EvaluacionReclutamiento createEvaluacionReclutamiento(
		long ER_ID) {
		return _evaluacionReclutamientoLocalService.createEvaluacionReclutamiento(ER_ID);
	}

	/**
	* Deletes the evaluacion reclutamiento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ER_ID the primary key of the evaluacion reclutamiento
	* @return the evaluacion reclutamiento that was removed
	* @throws PortalException if a evaluacion reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.EvaluacionReclutamiento deleteEvaluacionReclutamiento(
		long ER_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionReclutamientoLocalService.deleteEvaluacionReclutamiento(ER_ID);
	}

	/**
	* Deletes the evaluacion reclutamiento from the database. Also notifies the appropriate model listeners.
	*
	* @param evaluacionReclutamiento the evaluacion reclutamiento
	* @return the evaluacion reclutamiento that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.EvaluacionReclutamiento deleteEvaluacionReclutamiento(
		com.rec.hitss.layer.model.EvaluacionReclutamiento evaluacionReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionReclutamientoLocalService.deleteEvaluacionReclutamiento(evaluacionReclutamiento);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _evaluacionReclutamientoLocalService.dynamicQuery();
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
		return _evaluacionReclutamientoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EvaluacionReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _evaluacionReclutamientoLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EvaluacionReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _evaluacionReclutamientoLocalService.dynamicQuery(dynamicQuery,
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
		return _evaluacionReclutamientoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _evaluacionReclutamientoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.EvaluacionReclutamiento fetchEvaluacionReclutamiento(
		long ER_ID) throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionReclutamientoLocalService.fetchEvaluacionReclutamiento(ER_ID);
	}

	/**
	* Returns the evaluacion reclutamiento with the primary key.
	*
	* @param ER_ID the primary key of the evaluacion reclutamiento
	* @return the evaluacion reclutamiento
	* @throws PortalException if a evaluacion reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.EvaluacionReclutamiento getEvaluacionReclutamiento(
		long ER_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionReclutamientoLocalService.getEvaluacionReclutamiento(ER_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionReclutamientoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the evaluacion reclutamientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EvaluacionReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of evaluacion reclutamientos
	* @param end the upper bound of the range of evaluacion reclutamientos (not inclusive)
	* @return the range of evaluacion reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.EvaluacionReclutamiento> getEvaluacionReclutamientos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionReclutamientoLocalService.getEvaluacionReclutamientos(start,
			end);
	}

	/**
	* Returns the number of evaluacion reclutamientos.
	*
	* @return the number of evaluacion reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEvaluacionReclutamientosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionReclutamientoLocalService.getEvaluacionReclutamientosCount();
	}

	/**
	* Updates the evaluacion reclutamiento in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param evaluacionReclutamiento the evaluacion reclutamiento
	* @return the evaluacion reclutamiento that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.EvaluacionReclutamiento updateEvaluacionReclutamiento(
		com.rec.hitss.layer.model.EvaluacionReclutamiento evaluacionReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionReclutamientoLocalService.updateEvaluacionReclutamiento(evaluacionReclutamiento);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _evaluacionReclutamientoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_evaluacionReclutamientoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _evaluacionReclutamientoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EvaluacionReclutamientoLocalService getWrappedEvaluacionReclutamientoLocalService() {
		return _evaluacionReclutamientoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEvaluacionReclutamientoLocalService(
		EvaluacionReclutamientoLocalService evaluacionReclutamientoLocalService) {
		_evaluacionReclutamientoLocalService = evaluacionReclutamientoLocalService;
	}

	@Override
	public EvaluacionReclutamientoLocalService getWrappedService() {
		return _evaluacionReclutamientoLocalService;
	}

	@Override
	public void setWrappedService(
		EvaluacionReclutamientoLocalService evaluacionReclutamientoLocalService) {
		_evaluacionReclutamientoLocalService = evaluacionReclutamientoLocalService;
	}

	private EvaluacionReclutamientoLocalService _evaluacionReclutamientoLocalService;
}
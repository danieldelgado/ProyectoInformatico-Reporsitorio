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
 * Provides a wrapper for {@link EvaluacionLocalService}.
 *
 * @author Danielle Delgado
 * @see EvaluacionLocalService
 * @generated
 */
public class EvaluacionLocalServiceWrapper implements EvaluacionLocalService,
	ServiceWrapper<EvaluacionLocalService> {
	public EvaluacionLocalServiceWrapper(
		EvaluacionLocalService evaluacionLocalService) {
		_evaluacionLocalService = evaluacionLocalService;
	}

	/**
	* Adds the evaluacion to the database. Also notifies the appropriate model listeners.
	*
	* @param evaluacion the evaluacion
	* @return the evaluacion that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Evaluacion addEvaluacion(
		com.hitss.layer.model.Evaluacion evaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionLocalService.addEvaluacion(evaluacion);
	}

	/**
	* Creates a new evaluacion with the primary key. Does not add the evaluacion to the database.
	*
	* @param evaluacionId the primary key for the new evaluacion
	* @return the new evaluacion
	*/
	@Override
	public com.hitss.layer.model.Evaluacion createEvaluacion(long evaluacionId) {
		return _evaluacionLocalService.createEvaluacion(evaluacionId);
	}

	/**
	* Deletes the evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param evaluacionId the primary key of the evaluacion
	* @return the evaluacion that was removed
	* @throws PortalException if a evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Evaluacion deleteEvaluacion(long evaluacionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionLocalService.deleteEvaluacion(evaluacionId);
	}

	/**
	* Deletes the evaluacion from the database. Also notifies the appropriate model listeners.
	*
	* @param evaluacion the evaluacion
	* @return the evaluacion that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Evaluacion deleteEvaluacion(
		com.hitss.layer.model.Evaluacion evaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionLocalService.deleteEvaluacion(evaluacion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _evaluacionLocalService.dynamicQuery();
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
		return _evaluacionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _evaluacionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _evaluacionLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _evaluacionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _evaluacionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.Evaluacion fetchEvaluacion(long evaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionLocalService.fetchEvaluacion(evaluacionId);
	}

	/**
	* Returns the evaluacion with the primary key.
	*
	* @param evaluacionId the primary key of the evaluacion
	* @return the evaluacion
	* @throws PortalException if a evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Evaluacion getEvaluacion(long evaluacionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionLocalService.getEvaluacion(evaluacionId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of evaluacions
	* @param end the upper bound of the range of evaluacions (not inclusive)
	* @return the range of evaluacions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.Evaluacion> getEvaluacions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionLocalService.getEvaluacions(start, end);
	}

	/**
	* Returns the number of evaluacions.
	*
	* @return the number of evaluacions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEvaluacionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionLocalService.getEvaluacionsCount();
	}

	/**
	* Updates the evaluacion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param evaluacion the evaluacion
	* @return the evaluacion that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Evaluacion updateEvaluacion(
		com.hitss.layer.model.Evaluacion evaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionLocalService.updateEvaluacion(evaluacion);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addFasePostulacionEvaluacion(long fasePostulacionId,
		long evaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_evaluacionLocalService.addFasePostulacionEvaluacion(fasePostulacionId,
			evaluacionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addFasePostulacionEvaluacion(long fasePostulacionId,
		com.hitss.layer.model.Evaluacion evaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		_evaluacionLocalService.addFasePostulacionEvaluacion(fasePostulacionId,
			evaluacion);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addFasePostulacionEvaluacions(long fasePostulacionId,
		long[] evaluacionIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_evaluacionLocalService.addFasePostulacionEvaluacions(fasePostulacionId,
			evaluacionIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addFasePostulacionEvaluacions(long fasePostulacionId,
		java.util.List<com.hitss.layer.model.Evaluacion> Evaluacions)
		throws com.liferay.portal.kernel.exception.SystemException {
		_evaluacionLocalService.addFasePostulacionEvaluacions(fasePostulacionId,
			Evaluacions);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearFasePostulacionEvaluacions(long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_evaluacionLocalService.clearFasePostulacionEvaluacions(fasePostulacionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteFasePostulacionEvaluacion(long fasePostulacionId,
		long evaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_evaluacionLocalService.deleteFasePostulacionEvaluacion(fasePostulacionId,
			evaluacionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteFasePostulacionEvaluacion(long fasePostulacionId,
		com.hitss.layer.model.Evaluacion evaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		_evaluacionLocalService.deleteFasePostulacionEvaluacion(fasePostulacionId,
			evaluacion);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteFasePostulacionEvaluacions(long fasePostulacionId,
		long[] evaluacionIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_evaluacionLocalService.deleteFasePostulacionEvaluacions(fasePostulacionId,
			evaluacionIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteFasePostulacionEvaluacions(long fasePostulacionId,
		java.util.List<com.hitss.layer.model.Evaluacion> Evaluacions)
		throws com.liferay.portal.kernel.exception.SystemException {
		_evaluacionLocalService.deleteFasePostulacionEvaluacions(fasePostulacionId,
			Evaluacions);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.Evaluacion> getFasePostulacionEvaluacions(
		long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionLocalService.getFasePostulacionEvaluacions(fasePostulacionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.Evaluacion> getFasePostulacionEvaluacions(
		long fasePostulacionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionLocalService.getFasePostulacionEvaluacions(fasePostulacionId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.Evaluacion> getFasePostulacionEvaluacions(
		long fasePostulacionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionLocalService.getFasePostulacionEvaluacions(fasePostulacionId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getFasePostulacionEvaluacionsCount(long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionLocalService.getFasePostulacionEvaluacionsCount(fasePostulacionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasFasePostulacionEvaluacion(long fasePostulacionId,
		long evaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionLocalService.hasFasePostulacionEvaluacion(fasePostulacionId,
			evaluacionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasFasePostulacionEvaluacions(long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _evaluacionLocalService.hasFasePostulacionEvaluacions(fasePostulacionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setFasePostulacionEvaluacions(long fasePostulacionId,
		long[] evaluacionIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_evaluacionLocalService.setFasePostulacionEvaluacions(fasePostulacionId,
			evaluacionIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _evaluacionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_evaluacionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _evaluacionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EvaluacionLocalService getWrappedEvaluacionLocalService() {
		return _evaluacionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEvaluacionLocalService(
		EvaluacionLocalService evaluacionLocalService) {
		_evaluacionLocalService = evaluacionLocalService;
	}

	@Override
	public EvaluacionLocalService getWrappedService() {
		return _evaluacionLocalService;
	}

	@Override
	public void setWrappedService(EvaluacionLocalService evaluacionLocalService) {
		_evaluacionLocalService = evaluacionLocalService;
	}

	private EvaluacionLocalService _evaluacionLocalService;
}
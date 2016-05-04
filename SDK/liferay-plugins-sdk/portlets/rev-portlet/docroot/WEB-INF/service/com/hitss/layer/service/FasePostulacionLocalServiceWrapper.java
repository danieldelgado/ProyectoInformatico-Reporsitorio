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
 * Provides a wrapper for {@link FasePostulacionLocalService}.
 *
 * @author Danielle Delgado
 * @see FasePostulacionLocalService
 * @generated
 */
public class FasePostulacionLocalServiceWrapper
	implements FasePostulacionLocalService,
		ServiceWrapper<FasePostulacionLocalService> {
	public FasePostulacionLocalServiceWrapper(
		FasePostulacionLocalService fasePostulacionLocalService) {
		_fasePostulacionLocalService = fasePostulacionLocalService;
	}

	/**
	* Adds the fase postulacion to the database. Also notifies the appropriate model listeners.
	*
	* @param fasePostulacion the fase postulacion
	* @return the fase postulacion that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.FasePostulacion addFasePostulacion(
		com.hitss.layer.model.FasePostulacion fasePostulacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionLocalService.addFasePostulacion(fasePostulacion);
	}

	/**
	* Creates a new fase postulacion with the primary key. Does not add the fase postulacion to the database.
	*
	* @param fasePostulacionId the primary key for the new fase postulacion
	* @return the new fase postulacion
	*/
	@Override
	public com.hitss.layer.model.FasePostulacion createFasePostulacion(
		long fasePostulacionId) {
		return _fasePostulacionLocalService.createFasePostulacion(fasePostulacionId);
	}

	/**
	* Deletes the fase postulacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fasePostulacionId the primary key of the fase postulacion
	* @return the fase postulacion that was removed
	* @throws PortalException if a fase postulacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.FasePostulacion deleteFasePostulacion(
		long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionLocalService.deleteFasePostulacion(fasePostulacionId);
	}

	/**
	* Deletes the fase postulacion from the database. Also notifies the appropriate model listeners.
	*
	* @param fasePostulacion the fase postulacion
	* @return the fase postulacion that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.FasePostulacion deleteFasePostulacion(
		com.hitss.layer.model.FasePostulacion fasePostulacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionLocalService.deleteFasePostulacion(fasePostulacion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fasePostulacionLocalService.dynamicQuery();
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
		return _fasePostulacionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _fasePostulacionLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _fasePostulacionLocalService.dynamicQuery(dynamicQuery, start,
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
		return _fasePostulacionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _fasePostulacionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.FasePostulacion fetchFasePostulacion(
		long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionLocalService.fetchFasePostulacion(fasePostulacionId);
	}

	/**
	* Returns the fase postulacion with the primary key.
	*
	* @param fasePostulacionId the primary key of the fase postulacion
	* @return the fase postulacion
	* @throws PortalException if a fase postulacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.FasePostulacion getFasePostulacion(
		long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionLocalService.getFasePostulacion(fasePostulacionId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the fase postulacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fase postulacions
	* @param end the upper bound of the range of fase postulacions (not inclusive)
	* @return the range of fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.FasePostulacion> getFasePostulacions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionLocalService.getFasePostulacions(start, end);
	}

	/**
	* Returns the number of fase postulacions.
	*
	* @return the number of fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getFasePostulacionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionLocalService.getFasePostulacionsCount();
	}

	/**
	* Updates the fase postulacion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param fasePostulacion the fase postulacion
	* @return the fase postulacion that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.FasePostulacion updateFasePostulacion(
		com.hitss.layer.model.FasePostulacion fasePostulacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionLocalService.updateFasePostulacion(fasePostulacion);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addEvaluacionFasePostulacion(long evaluacionId,
		long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_fasePostulacionLocalService.addEvaluacionFasePostulacion(evaluacionId,
			fasePostulacionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addEvaluacionFasePostulacion(long evaluacionId,
		com.hitss.layer.model.FasePostulacion fasePostulacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		_fasePostulacionLocalService.addEvaluacionFasePostulacion(evaluacionId,
			fasePostulacion);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addEvaluacionFasePostulacions(long evaluacionId,
		long[] fasePostulacionIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_fasePostulacionLocalService.addEvaluacionFasePostulacions(evaluacionId,
			fasePostulacionIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addEvaluacionFasePostulacions(long evaluacionId,
		java.util.List<com.hitss.layer.model.FasePostulacion> FasePostulacions)
		throws com.liferay.portal.kernel.exception.SystemException {
		_fasePostulacionLocalService.addEvaluacionFasePostulacions(evaluacionId,
			FasePostulacions);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearEvaluacionFasePostulacions(long evaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_fasePostulacionLocalService.clearEvaluacionFasePostulacions(evaluacionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteEvaluacionFasePostulacion(long evaluacionId,
		long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_fasePostulacionLocalService.deleteEvaluacionFasePostulacion(evaluacionId,
			fasePostulacionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteEvaluacionFasePostulacion(long evaluacionId,
		com.hitss.layer.model.FasePostulacion fasePostulacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		_fasePostulacionLocalService.deleteEvaluacionFasePostulacion(evaluacionId,
			fasePostulacion);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteEvaluacionFasePostulacions(long evaluacionId,
		long[] fasePostulacionIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_fasePostulacionLocalService.deleteEvaluacionFasePostulacions(evaluacionId,
			fasePostulacionIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteEvaluacionFasePostulacions(long evaluacionId,
		java.util.List<com.hitss.layer.model.FasePostulacion> FasePostulacions)
		throws com.liferay.portal.kernel.exception.SystemException {
		_fasePostulacionLocalService.deleteEvaluacionFasePostulacions(evaluacionId,
			FasePostulacions);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.FasePostulacion> getEvaluacionFasePostulacions(
		long evaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionLocalService.getEvaluacionFasePostulacions(evaluacionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.FasePostulacion> getEvaluacionFasePostulacions(
		long evaluacionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionLocalService.getEvaluacionFasePostulacions(evaluacionId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.FasePostulacion> getEvaluacionFasePostulacions(
		long evaluacionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionLocalService.getEvaluacionFasePostulacions(evaluacionId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEvaluacionFasePostulacionsCount(long evaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionLocalService.getEvaluacionFasePostulacionsCount(evaluacionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasEvaluacionFasePostulacion(long evaluacionId,
		long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionLocalService.hasEvaluacionFasePostulacion(evaluacionId,
			fasePostulacionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasEvaluacionFasePostulacions(long evaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionLocalService.hasEvaluacionFasePostulacions(evaluacionId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setEvaluacionFasePostulacions(long evaluacionId,
		long[] fasePostulacionIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_fasePostulacionLocalService.setEvaluacionFasePostulacions(evaluacionId,
			fasePostulacionIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _fasePostulacionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_fasePostulacionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _fasePostulacionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public FasePostulacionLocalService getWrappedFasePostulacionLocalService() {
		return _fasePostulacionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedFasePostulacionLocalService(
		FasePostulacionLocalService fasePostulacionLocalService) {
		_fasePostulacionLocalService = fasePostulacionLocalService;
	}

	@Override
	public FasePostulacionLocalService getWrappedService() {
		return _fasePostulacionLocalService;
	}

	@Override
	public void setWrappedService(
		FasePostulacionLocalService fasePostulacionLocalService) {
		_fasePostulacionLocalService = fasePostulacionLocalService;
	}

	private FasePostulacionLocalService _fasePostulacionLocalService;
}
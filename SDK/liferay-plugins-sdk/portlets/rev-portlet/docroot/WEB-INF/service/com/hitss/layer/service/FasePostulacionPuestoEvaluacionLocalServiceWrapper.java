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
 * Provides a wrapper for {@link FasePostulacionPuestoEvaluacionLocalService}.
 *
 * @author Danielle Delgado
 * @see FasePostulacionPuestoEvaluacionLocalService
 * @generated
 */
public class FasePostulacionPuestoEvaluacionLocalServiceWrapper
	implements FasePostulacionPuestoEvaluacionLocalService,
		ServiceWrapper<FasePostulacionPuestoEvaluacionLocalService> {
	public FasePostulacionPuestoEvaluacionLocalServiceWrapper(
		FasePostulacionPuestoEvaluacionLocalService fasePostulacionPuestoEvaluacionLocalService) {
		_fasePostulacionPuestoEvaluacionLocalService = fasePostulacionPuestoEvaluacionLocalService;
	}

	/**
	* Adds the fase postulacion puesto evaluacion to the database. Also notifies the appropriate model listeners.
	*
	* @param fasePostulacionPuestoEvaluacion the fase postulacion puesto evaluacion
	* @return the fase postulacion puesto evaluacion that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion addFasePostulacionPuestoEvaluacion(
		com.hitss.layer.model.FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionPuestoEvaluacionLocalService.addFasePostulacionPuestoEvaluacion(fasePostulacionPuestoEvaluacion);
	}

	/**
	* Creates a new fase postulacion puesto evaluacion with the primary key. Does not add the fase postulacion puesto evaluacion to the database.
	*
	* @param fasePostulacionPuestoEvaluacionPK the primary key for the new fase postulacion puesto evaluacion
	* @return the new fase postulacion puesto evaluacion
	*/
	@Override
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion createFasePostulacionPuestoEvaluacion(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK) {
		return _fasePostulacionPuestoEvaluacionLocalService.createFasePostulacionPuestoEvaluacion(fasePostulacionPuestoEvaluacionPK);
	}

	/**
	* Deletes the fase postulacion puesto evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fasePostulacionPuestoEvaluacionPK the primary key of the fase postulacion puesto evaluacion
	* @return the fase postulacion puesto evaluacion that was removed
	* @throws PortalException if a fase postulacion puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion deleteFasePostulacionPuestoEvaluacion(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionPuestoEvaluacionLocalService.deleteFasePostulacionPuestoEvaluacion(fasePostulacionPuestoEvaluacionPK);
	}

	/**
	* Deletes the fase postulacion puesto evaluacion from the database. Also notifies the appropriate model listeners.
	*
	* @param fasePostulacionPuestoEvaluacion the fase postulacion puesto evaluacion
	* @return the fase postulacion puesto evaluacion that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion deleteFasePostulacionPuestoEvaluacion(
		com.hitss.layer.model.FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionPuestoEvaluacionLocalService.deleteFasePostulacionPuestoEvaluacion(fasePostulacionPuestoEvaluacion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fasePostulacionPuestoEvaluacionLocalService.dynamicQuery();
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
		return _fasePostulacionPuestoEvaluacionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _fasePostulacionPuestoEvaluacionLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _fasePostulacionPuestoEvaluacionLocalService.dynamicQuery(dynamicQuery,
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
		return _fasePostulacionPuestoEvaluacionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _fasePostulacionPuestoEvaluacionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion fetchFasePostulacionPuestoEvaluacion(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionPuestoEvaluacionLocalService.fetchFasePostulacionPuestoEvaluacion(fasePostulacionPuestoEvaluacionPK);
	}

	/**
	* Returns the fase postulacion puesto evaluacion with the primary key.
	*
	* @param fasePostulacionPuestoEvaluacionPK the primary key of the fase postulacion puesto evaluacion
	* @return the fase postulacion puesto evaluacion
	* @throws PortalException if a fase postulacion puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion getFasePostulacionPuestoEvaluacion(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionPuestoEvaluacionLocalService.getFasePostulacionPuestoEvaluacion(fasePostulacionPuestoEvaluacionPK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionPuestoEvaluacionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the fase postulacion puesto evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fase postulacion puesto evaluacions
	* @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	* @return the range of fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> getFasePostulacionPuestoEvaluacions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionPuestoEvaluacionLocalService.getFasePostulacionPuestoEvaluacions(start,
			end);
	}

	/**
	* Returns the number of fase postulacion puesto evaluacions.
	*
	* @return the number of fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getFasePostulacionPuestoEvaluacionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionPuestoEvaluacionLocalService.getFasePostulacionPuestoEvaluacionsCount();
	}

	/**
	* Updates the fase postulacion puesto evaluacion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param fasePostulacionPuestoEvaluacion the fase postulacion puesto evaluacion
	* @return the fase postulacion puesto evaluacion that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion updateFasePostulacionPuestoEvaluacion(
		com.hitss.layer.model.FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fasePostulacionPuestoEvaluacionLocalService.updateFasePostulacionPuestoEvaluacion(fasePostulacionPuestoEvaluacion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _fasePostulacionPuestoEvaluacionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_fasePostulacionPuestoEvaluacionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _fasePostulacionPuestoEvaluacionLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public FasePostulacionPuestoEvaluacionLocalService getWrappedFasePostulacionPuestoEvaluacionLocalService() {
		return _fasePostulacionPuestoEvaluacionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedFasePostulacionPuestoEvaluacionLocalService(
		FasePostulacionPuestoEvaluacionLocalService fasePostulacionPuestoEvaluacionLocalService) {
		_fasePostulacionPuestoEvaluacionLocalService = fasePostulacionPuestoEvaluacionLocalService;
	}

	@Override
	public FasePostulacionPuestoEvaluacionLocalService getWrappedService() {
		return _fasePostulacionPuestoEvaluacionLocalService;
	}

	@Override
	public void setWrappedService(
		FasePostulacionPuestoEvaluacionLocalService fasePostulacionPuestoEvaluacionLocalService) {
		_fasePostulacionPuestoEvaluacionLocalService = fasePostulacionPuestoEvaluacionLocalService;
	}

	private FasePostulacionPuestoEvaluacionLocalService _fasePostulacionPuestoEvaluacionLocalService;
}
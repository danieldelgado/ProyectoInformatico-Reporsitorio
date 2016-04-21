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
 * Provides a wrapper for {@link SolicitudRequerimientoPersonalLocalService}.
 *
 * @author Crossfire
 * @see SolicitudRequerimientoPersonalLocalService
 * @generated
 */
public class SolicitudRequerimientoPersonalLocalServiceWrapper
	implements SolicitudRequerimientoPersonalLocalService,
		ServiceWrapper<SolicitudRequerimientoPersonalLocalService> {
	public SolicitudRequerimientoPersonalLocalServiceWrapper(
		SolicitudRequerimientoPersonalLocalService solicitudRequerimientoPersonalLocalService) {
		_solicitudRequerimientoPersonalLocalService = solicitudRequerimientoPersonalLocalService;
	}

	/**
	* Adds the solicitud requerimiento personal to the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoPersonal the solicitud requerimiento personal
	* @return the solicitud requerimiento personal that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.SolicitudRequerimientoPersonal addSolicitudRequerimientoPersonal(
		com.rec.hitss.layer.model.SolicitudRequerimientoPersonal solicitudRequerimientoPersonal)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoPersonalLocalService.addSolicitudRequerimientoPersonal(solicitudRequerimientoPersonal);
	}

	/**
	* Creates a new solicitud requerimiento personal with the primary key. Does not add the solicitud requerimiento personal to the database.
	*
	* @param solicitudRequerimientoPersonalId the primary key for the new solicitud requerimiento personal
	* @return the new solicitud requerimiento personal
	*/
	@Override
	public com.rec.hitss.layer.model.SolicitudRequerimientoPersonal createSolicitudRequerimientoPersonal(
		long solicitudRequerimientoPersonalId) {
		return _solicitudRequerimientoPersonalLocalService.createSolicitudRequerimientoPersonal(solicitudRequerimientoPersonalId);
	}

	/**
	* Deletes the solicitud requerimiento personal with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoPersonalId the primary key of the solicitud requerimiento personal
	* @return the solicitud requerimiento personal that was removed
	* @throws PortalException if a solicitud requerimiento personal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.SolicitudRequerimientoPersonal deleteSolicitudRequerimientoPersonal(
		long solicitudRequerimientoPersonalId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoPersonalLocalService.deleteSolicitudRequerimientoPersonal(solicitudRequerimientoPersonalId);
	}

	/**
	* Deletes the solicitud requerimiento personal from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoPersonal the solicitud requerimiento personal
	* @return the solicitud requerimiento personal that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.SolicitudRequerimientoPersonal deleteSolicitudRequerimientoPersonal(
		com.rec.hitss.layer.model.SolicitudRequerimientoPersonal solicitudRequerimientoPersonal)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoPersonalLocalService.deleteSolicitudRequerimientoPersonal(solicitudRequerimientoPersonal);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _solicitudRequerimientoPersonalLocalService.dynamicQuery();
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
		return _solicitudRequerimientoPersonalLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _solicitudRequerimientoPersonalLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _solicitudRequerimientoPersonalLocalService.dynamicQuery(dynamicQuery,
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
		return _solicitudRequerimientoPersonalLocalService.dynamicQueryCount(dynamicQuery);
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
		return _solicitudRequerimientoPersonalLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.SolicitudRequerimientoPersonal fetchSolicitudRequerimientoPersonal(
		long solicitudRequerimientoPersonalId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoPersonalLocalService.fetchSolicitudRequerimientoPersonal(solicitudRequerimientoPersonalId);
	}

	/**
	* Returns the solicitud requerimiento personal with the primary key.
	*
	* @param solicitudRequerimientoPersonalId the primary key of the solicitud requerimiento personal
	* @return the solicitud requerimiento personal
	* @throws PortalException if a solicitud requerimiento personal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.SolicitudRequerimientoPersonal getSolicitudRequerimientoPersonal(
		long solicitudRequerimientoPersonalId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoPersonalLocalService.getSolicitudRequerimientoPersonal(solicitudRequerimientoPersonalId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoPersonalLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the solicitud requerimiento personals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud requerimiento personals
	* @param end the upper bound of the range of solicitud requerimiento personals (not inclusive)
	* @return the range of solicitud requerimiento personals
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.SolicitudRequerimientoPersonal> getSolicitudRequerimientoPersonals(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoPersonalLocalService.getSolicitudRequerimientoPersonals(start,
			end);
	}

	/**
	* Returns the number of solicitud requerimiento personals.
	*
	* @return the number of solicitud requerimiento personals
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSolicitudRequerimientoPersonalsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoPersonalLocalService.getSolicitudRequerimientoPersonalsCount();
	}

	/**
	* Updates the solicitud requerimiento personal in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoPersonal the solicitud requerimiento personal
	* @return the solicitud requerimiento personal that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.SolicitudRequerimientoPersonal updateSolicitudRequerimientoPersonal(
		com.rec.hitss.layer.model.SolicitudRequerimientoPersonal solicitudRequerimientoPersonal)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoPersonalLocalService.updateSolicitudRequerimientoPersonal(solicitudRequerimientoPersonal);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _solicitudRequerimientoPersonalLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_solicitudRequerimientoPersonalLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _solicitudRequerimientoPersonalLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.rec.hitss.layer.model.SolicitudRequerimientoPersonal> getListaSolicitudesEntrevista(
		java.lang.String estado, java.lang.String puesto,
		java.lang.String fechaEmisionInicio, java.lang.String fechaEmisionFin,
		java.lang.String responsable, java.lang.String tiempoContrato)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.text.ParseException {
		return _solicitudRequerimientoPersonalLocalService.getListaSolicitudesEntrevista(estado,
			puesto, fechaEmisionInicio, fechaEmisionFin, responsable,
			tiempoContrato);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SolicitudRequerimientoPersonalLocalService getWrappedSolicitudRequerimientoPersonalLocalService() {
		return _solicitudRequerimientoPersonalLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSolicitudRequerimientoPersonalLocalService(
		SolicitudRequerimientoPersonalLocalService solicitudRequerimientoPersonalLocalService) {
		_solicitudRequerimientoPersonalLocalService = solicitudRequerimientoPersonalLocalService;
	}

	@Override
	public SolicitudRequerimientoPersonalLocalService getWrappedService() {
		return _solicitudRequerimientoPersonalLocalService;
	}

	@Override
	public void setWrappedService(
		SolicitudRequerimientoPersonalLocalService solicitudRequerimientoPersonalLocalService) {
		_solicitudRequerimientoPersonalLocalService = solicitudRequerimientoPersonalLocalService;
	}

	private SolicitudRequerimientoPersonalLocalService _solicitudRequerimientoPersonalLocalService;
}
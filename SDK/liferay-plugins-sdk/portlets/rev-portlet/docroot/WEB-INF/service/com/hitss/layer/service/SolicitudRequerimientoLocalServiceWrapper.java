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
 * Provides a wrapper for {@link SolicitudRequerimientoLocalService}.
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoLocalService
 * @generated
 */
public class SolicitudRequerimientoLocalServiceWrapper
	implements SolicitudRequerimientoLocalService,
		ServiceWrapper<SolicitudRequerimientoLocalService> {
	public SolicitudRequerimientoLocalServiceWrapper(
		SolicitudRequerimientoLocalService solicitudRequerimientoLocalService) {
		_solicitudRequerimientoLocalService = solicitudRequerimientoLocalService;
	}

	/**
	* Adds the solicitud requerimiento to the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimiento the solicitud requerimiento
	* @return the solicitud requerimiento that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.SolicitudRequerimiento addSolicitudRequerimiento(
		com.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoLocalService.addSolicitudRequerimiento(solicitudRequerimiento);
	}

	/**
	* Creates a new solicitud requerimiento with the primary key. Does not add the solicitud requerimiento to the database.
	*
	* @param solicitudRequerimientoId the primary key for the new solicitud requerimiento
	* @return the new solicitud requerimiento
	*/
	@Override
	public com.hitss.layer.model.SolicitudRequerimiento createSolicitudRequerimiento(
		long solicitudRequerimientoId) {
		return _solicitudRequerimientoLocalService.createSolicitudRequerimiento(solicitudRequerimientoId);
	}

	/**
	* Deletes the solicitud requerimiento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoId the primary key of the solicitud requerimiento
	* @return the solicitud requerimiento that was removed
	* @throws PortalException if a solicitud requerimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.SolicitudRequerimiento deleteSolicitudRequerimiento(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoLocalService.deleteSolicitudRequerimiento(solicitudRequerimientoId);
	}

	/**
	* Deletes the solicitud requerimiento from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimiento the solicitud requerimiento
	* @return the solicitud requerimiento that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.SolicitudRequerimiento deleteSolicitudRequerimiento(
		com.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoLocalService.deleteSolicitudRequerimiento(solicitudRequerimiento);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _solicitudRequerimientoLocalService.dynamicQuery();
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
		return _solicitudRequerimientoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _solicitudRequerimientoLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _solicitudRequerimientoLocalService.dynamicQuery(dynamicQuery,
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
		return _solicitudRequerimientoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _solicitudRequerimientoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.SolicitudRequerimiento fetchSolicitudRequerimiento(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoLocalService.fetchSolicitudRequerimiento(solicitudRequerimientoId);
	}

	/**
	* Returns the solicitud requerimiento with the primary key.
	*
	* @param solicitudRequerimientoId the primary key of the solicitud requerimiento
	* @return the solicitud requerimiento
	* @throws PortalException if a solicitud requerimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.SolicitudRequerimiento getSolicitudRequerimiento(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoLocalService.getSolicitudRequerimiento(solicitudRequerimientoId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the solicitud requerimientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud requerimientos
	* @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	* @return the range of solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.SolicitudRequerimiento> getSolicitudRequerimientos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoLocalService.getSolicitudRequerimientos(start,
			end);
	}

	/**
	* Returns the number of solicitud requerimientos.
	*
	* @return the number of solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSolicitudRequerimientosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoLocalService.getSolicitudRequerimientosCount();
	}

	/**
	* Updates the solicitud requerimiento in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimiento the solicitud requerimiento
	* @return the solicitud requerimiento that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.SolicitudRequerimiento updateSolicitudRequerimiento(
		com.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoLocalService.updateSolicitudRequerimiento(solicitudRequerimiento);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _solicitudRequerimientoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_solicitudRequerimientoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _solicitudRequerimientoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public com.hitss.layer.model.SolicitudRequerimiento newInstance() {
		return _solicitudRequerimientoLocalService.newInstance();
	}

	@Override
	public long listaSolicitudRequerimientoCount(
		com.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento,
		java.util.Date fechaRegistroInicio, java.util.Date fechaRegistrFin)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.search.ParseException {
		return _solicitudRequerimientoLocalService.listaSolicitudRequerimientoCount(solicitudRequerimiento,
			fechaRegistroInicio, fechaRegistrFin);
	}

	@Override
	public java.util.List<com.hitss.layer.model.SolicitudRequerimiento> listaSolicitudRequerimiento(
		com.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento,
		java.util.Date fechaRegistroInicio, java.util.Date fechaRegistrFin,
		int inicio, int fin, java.lang.String orden, java.lang.String campoOrden)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.search.ParseException {
		return _solicitudRequerimientoLocalService.listaSolicitudRequerimiento(solicitudRequerimiento,
			fechaRegistroInicio, fechaRegistrFin, inicio, fin, orden, campoOrden);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SolicitudRequerimientoLocalService getWrappedSolicitudRequerimientoLocalService() {
		return _solicitudRequerimientoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSolicitudRequerimientoLocalService(
		SolicitudRequerimientoLocalService solicitudRequerimientoLocalService) {
		_solicitudRequerimientoLocalService = solicitudRequerimientoLocalService;
	}

	@Override
	public SolicitudRequerimientoLocalService getWrappedService() {
		return _solicitudRequerimientoLocalService;
	}

	@Override
	public void setWrappedService(
		SolicitudRequerimientoLocalService solicitudRequerimientoLocalService) {
		_solicitudRequerimientoLocalService = solicitudRequerimientoLocalService;
	}

	private SolicitudRequerimientoLocalService _solicitudRequerimientoLocalService;
}
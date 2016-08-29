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
 * Provides a wrapper for {@link SolicitudRequerimientoFuncionLocalService}.
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoFuncionLocalService
 * @generated
 */
public class SolicitudRequerimientoFuncionLocalServiceWrapper
	implements SolicitudRequerimientoFuncionLocalService,
		ServiceWrapper<SolicitudRequerimientoFuncionLocalService> {
	public SolicitudRequerimientoFuncionLocalServiceWrapper(
		SolicitudRequerimientoFuncionLocalService solicitudRequerimientoFuncionLocalService) {
		_solicitudRequerimientoFuncionLocalService = solicitudRequerimientoFuncionLocalService;
	}

	/**
	* Adds the solicitud requerimiento funcion to the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoFuncion the solicitud requerimiento funcion
	* @return the solicitud requerimiento funcion that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.SolicitudRequerimientoFuncion addSolicitudRequerimientoFuncion(
		com.hitss.layer.model.SolicitudRequerimientoFuncion solicitudRequerimientoFuncion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoFuncionLocalService.addSolicitudRequerimientoFuncion(solicitudRequerimientoFuncion);
	}

	/**
	* Creates a new solicitud requerimiento funcion with the primary key. Does not add the solicitud requerimiento funcion to the database.
	*
	* @param solicitudRequerimientoFuncionPK the primary key for the new solicitud requerimiento funcion
	* @return the new solicitud requerimiento funcion
	*/
	@Override
	public com.hitss.layer.model.SolicitudRequerimientoFuncion createSolicitudRequerimientoFuncion(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK) {
		return _solicitudRequerimientoFuncionLocalService.createSolicitudRequerimientoFuncion(solicitudRequerimientoFuncionPK);
	}

	/**
	* Deletes the solicitud requerimiento funcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoFuncionPK the primary key of the solicitud requerimiento funcion
	* @return the solicitud requerimiento funcion that was removed
	* @throws PortalException if a solicitud requerimiento funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.SolicitudRequerimientoFuncion deleteSolicitudRequerimientoFuncion(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoFuncionLocalService.deleteSolicitudRequerimientoFuncion(solicitudRequerimientoFuncionPK);
	}

	/**
	* Deletes the solicitud requerimiento funcion from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoFuncion the solicitud requerimiento funcion
	* @return the solicitud requerimiento funcion that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.SolicitudRequerimientoFuncion deleteSolicitudRequerimientoFuncion(
		com.hitss.layer.model.SolicitudRequerimientoFuncion solicitudRequerimientoFuncion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoFuncionLocalService.deleteSolicitudRequerimientoFuncion(solicitudRequerimientoFuncion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _solicitudRequerimientoFuncionLocalService.dynamicQuery();
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
		return _solicitudRequerimientoFuncionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _solicitudRequerimientoFuncionLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _solicitudRequerimientoFuncionLocalService.dynamicQuery(dynamicQuery,
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
		return _solicitudRequerimientoFuncionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _solicitudRequerimientoFuncionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hitss.layer.model.SolicitudRequerimientoFuncion fetchSolicitudRequerimientoFuncion(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoFuncionLocalService.fetchSolicitudRequerimientoFuncion(solicitudRequerimientoFuncionPK);
	}

	/**
	* Returns the solicitud requerimiento funcion with the primary key.
	*
	* @param solicitudRequerimientoFuncionPK the primary key of the solicitud requerimiento funcion
	* @return the solicitud requerimiento funcion
	* @throws PortalException if a solicitud requerimiento funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.SolicitudRequerimientoFuncion getSolicitudRequerimientoFuncion(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoFuncionLocalService.getSolicitudRequerimientoFuncion(solicitudRequerimientoFuncionPK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoFuncionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the solicitud requerimiento funcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud requerimiento funcions
	* @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	* @return the range of solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> getSolicitudRequerimientoFuncions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoFuncionLocalService.getSolicitudRequerimientoFuncions(start,
			end);
	}

	/**
	* Returns the number of solicitud requerimiento funcions.
	*
	* @return the number of solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSolicitudRequerimientoFuncionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoFuncionLocalService.getSolicitudRequerimientoFuncionsCount();
	}

	/**
	* Updates the solicitud requerimiento funcion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoFuncion the solicitud requerimiento funcion
	* @return the solicitud requerimiento funcion that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.SolicitudRequerimientoFuncion updateSolicitudRequerimientoFuncion(
		com.hitss.layer.model.SolicitudRequerimientoFuncion solicitudRequerimientoFuncion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoFuncionLocalService.updateSolicitudRequerimientoFuncion(solicitudRequerimientoFuncion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _solicitudRequerimientoFuncionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_solicitudRequerimientoFuncionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _solicitudRequerimientoFuncionLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> getListaSolicitudRequerimientoFuncion(
		long solicitudRequerimientoId, long tagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoFuncionLocalService.getListaSolicitudRequerimientoFuncion(solicitudRequerimientoId,
			tagId);
	}

	@Override
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> getListaSolicitudRequerimientoFuncion(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoFuncionLocalService.getListaSolicitudRequerimientoFuncion(solicitudRequerimientoId);
	}

	@Override
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> getListaSolicitudRequerimientoFuncionActivo(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _solicitudRequerimientoFuncionLocalService.getListaSolicitudRequerimientoFuncionActivo(solicitudRequerimientoId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SolicitudRequerimientoFuncionLocalService getWrappedSolicitudRequerimientoFuncionLocalService() {
		return _solicitudRequerimientoFuncionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSolicitudRequerimientoFuncionLocalService(
		SolicitudRequerimientoFuncionLocalService solicitudRequerimientoFuncionLocalService) {
		_solicitudRequerimientoFuncionLocalService = solicitudRequerimientoFuncionLocalService;
	}

	@Override
	public SolicitudRequerimientoFuncionLocalService getWrappedService() {
		return _solicitudRequerimientoFuncionLocalService;
	}

	@Override
	public void setWrappedService(
		SolicitudRequerimientoFuncionLocalService solicitudRequerimientoFuncionLocalService) {
		_solicitudRequerimientoFuncionLocalService = solicitudRequerimientoFuncionLocalService;
	}

	private SolicitudRequerimientoFuncionLocalService _solicitudRequerimientoFuncionLocalService;
}
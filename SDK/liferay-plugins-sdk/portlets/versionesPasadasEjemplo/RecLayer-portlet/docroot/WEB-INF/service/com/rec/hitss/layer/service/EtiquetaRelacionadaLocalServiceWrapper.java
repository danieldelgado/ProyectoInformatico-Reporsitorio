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
 * Provides a wrapper for {@link EtiquetaRelacionadaLocalService}.
 *
 * @author Crossfire
 * @see EtiquetaRelacionadaLocalService
 * @generated
 */
public class EtiquetaRelacionadaLocalServiceWrapper
	implements EtiquetaRelacionadaLocalService,
		ServiceWrapper<EtiquetaRelacionadaLocalService> {
	public EtiquetaRelacionadaLocalServiceWrapper(
		EtiquetaRelacionadaLocalService etiquetaRelacionadaLocalService) {
		_etiquetaRelacionadaLocalService = etiquetaRelacionadaLocalService;
	}

	/**
	* Adds the etiqueta relacionada to the database. Also notifies the appropriate model listeners.
	*
	* @param etiquetaRelacionada the etiqueta relacionada
	* @return the etiqueta relacionada that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.EtiquetaRelacionada addEtiquetaRelacionada(
		com.rec.hitss.layer.model.EtiquetaRelacionada etiquetaRelacionada)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _etiquetaRelacionadaLocalService.addEtiquetaRelacionada(etiquetaRelacionada);
	}

	/**
	* Creates a new etiqueta relacionada with the primary key. Does not add the etiqueta relacionada to the database.
	*
	* @param etiquetaRelacionadaId the primary key for the new etiqueta relacionada
	* @return the new etiqueta relacionada
	*/
	@Override
	public com.rec.hitss.layer.model.EtiquetaRelacionada createEtiquetaRelacionada(
		long etiquetaRelacionadaId) {
		return _etiquetaRelacionadaLocalService.createEtiquetaRelacionada(etiquetaRelacionadaId);
	}

	/**
	* Deletes the etiqueta relacionada with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param etiquetaRelacionadaId the primary key of the etiqueta relacionada
	* @return the etiqueta relacionada that was removed
	* @throws PortalException if a etiqueta relacionada with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.EtiquetaRelacionada deleteEtiquetaRelacionada(
		long etiquetaRelacionadaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _etiquetaRelacionadaLocalService.deleteEtiquetaRelacionada(etiquetaRelacionadaId);
	}

	/**
	* Deletes the etiqueta relacionada from the database. Also notifies the appropriate model listeners.
	*
	* @param etiquetaRelacionada the etiqueta relacionada
	* @return the etiqueta relacionada that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.EtiquetaRelacionada deleteEtiquetaRelacionada(
		com.rec.hitss.layer.model.EtiquetaRelacionada etiquetaRelacionada)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _etiquetaRelacionadaLocalService.deleteEtiquetaRelacionada(etiquetaRelacionada);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _etiquetaRelacionadaLocalService.dynamicQuery();
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
		return _etiquetaRelacionadaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EtiquetaRelacionadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _etiquetaRelacionadaLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EtiquetaRelacionadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _etiquetaRelacionadaLocalService.dynamicQuery(dynamicQuery,
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
		return _etiquetaRelacionadaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _etiquetaRelacionadaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rec.hitss.layer.model.EtiquetaRelacionada fetchEtiquetaRelacionada(
		long etiquetaRelacionadaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _etiquetaRelacionadaLocalService.fetchEtiquetaRelacionada(etiquetaRelacionadaId);
	}

	/**
	* Returns the etiqueta relacionada with the primary key.
	*
	* @param etiquetaRelacionadaId the primary key of the etiqueta relacionada
	* @return the etiqueta relacionada
	* @throws PortalException if a etiqueta relacionada with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.EtiquetaRelacionada getEtiquetaRelacionada(
		long etiquetaRelacionadaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _etiquetaRelacionadaLocalService.getEtiquetaRelacionada(etiquetaRelacionadaId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _etiquetaRelacionadaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the etiqueta relacionadas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EtiquetaRelacionadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of etiqueta relacionadas
	* @param end the upper bound of the range of etiqueta relacionadas (not inclusive)
	* @return the range of etiqueta relacionadas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.EtiquetaRelacionada> getEtiquetaRelacionadas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _etiquetaRelacionadaLocalService.getEtiquetaRelacionadas(start,
			end);
	}

	/**
	* Returns the number of etiqueta relacionadas.
	*
	* @return the number of etiqueta relacionadas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEtiquetaRelacionadasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _etiquetaRelacionadaLocalService.getEtiquetaRelacionadasCount();
	}

	/**
	* Updates the etiqueta relacionada in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param etiquetaRelacionada the etiqueta relacionada
	* @return the etiqueta relacionada that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.EtiquetaRelacionada updateEtiquetaRelacionada(
		com.rec.hitss.layer.model.EtiquetaRelacionada etiquetaRelacionada)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _etiquetaRelacionadaLocalService.updateEtiquetaRelacionada(etiquetaRelacionada);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _etiquetaRelacionadaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_etiquetaRelacionadaLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _etiquetaRelacionadaLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EtiquetaRelacionadaLocalService getWrappedEtiquetaRelacionadaLocalService() {
		return _etiquetaRelacionadaLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEtiquetaRelacionadaLocalService(
		EtiquetaRelacionadaLocalService etiquetaRelacionadaLocalService) {
		_etiquetaRelacionadaLocalService = etiquetaRelacionadaLocalService;
	}

	@Override
	public EtiquetaRelacionadaLocalService getWrappedService() {
		return _etiquetaRelacionadaLocalService;
	}

	@Override
	public void setWrappedService(
		EtiquetaRelacionadaLocalService etiquetaRelacionadaLocalService) {
		_etiquetaRelacionadaLocalService = etiquetaRelacionadaLocalService;
	}

	private EtiquetaRelacionadaLocalService _etiquetaRelacionadaLocalService;
}
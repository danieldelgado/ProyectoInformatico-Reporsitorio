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
 * Provides a wrapper for {@link PuestoLocalService}.
 *
 * @author Crossfire
 * @see PuestoLocalService
 * @generated
 */
public class PuestoLocalServiceWrapper implements PuestoLocalService,
	ServiceWrapper<PuestoLocalService> {
	public PuestoLocalServiceWrapper(PuestoLocalService puestoLocalService) {
		_puestoLocalService = puestoLocalService;
	}

	/**
	* Adds the puesto to the database. Also notifies the appropriate model listeners.
	*
	* @param puesto the puesto
	* @return the puesto that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.Puesto addPuesto(
		com.rec.hitss.layer.model.Puesto puesto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestoLocalService.addPuesto(puesto);
	}

	/**
	* Creates a new puesto with the primary key. Does not add the puesto to the database.
	*
	* @param puestoId the primary key for the new puesto
	* @return the new puesto
	*/
	@Override
	public com.rec.hitss.layer.model.Puesto createPuesto(long puestoId) {
		return _puestoLocalService.createPuesto(puestoId);
	}

	/**
	* Deletes the puesto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param puestoId the primary key of the puesto
	* @return the puesto that was removed
	* @throws PortalException if a puesto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.Puesto deletePuesto(long puestoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _puestoLocalService.deletePuesto(puestoId);
	}

	/**
	* Deletes the puesto from the database. Also notifies the appropriate model listeners.
	*
	* @param puesto the puesto
	* @return the puesto that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.Puesto deletePuesto(
		com.rec.hitss.layer.model.Puesto puesto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestoLocalService.deletePuesto(puesto);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _puestoLocalService.dynamicQuery();
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
		return _puestoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PuestoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _puestoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PuestoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _puestoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _puestoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _puestoLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.rec.hitss.layer.model.Puesto fetchPuesto(long puestoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestoLocalService.fetchPuesto(puestoId);
	}

	/**
	* Returns the puesto with the primary key.
	*
	* @param puestoId the primary key of the puesto
	* @return the puesto
	* @throws PortalException if a puesto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.Puesto getPuesto(long puestoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _puestoLocalService.getPuesto(puestoId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _puestoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the puestos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PuestoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of puestos
	* @param end the upper bound of the range of puestos (not inclusive)
	* @return the range of puestos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rec.hitss.layer.model.Puesto> getPuestos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestoLocalService.getPuestos(start, end);
	}

	/**
	* Returns the number of puestos.
	*
	* @return the number of puestos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPuestosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestoLocalService.getPuestosCount();
	}

	/**
	* Updates the puesto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param puesto the puesto
	* @return the puesto that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rec.hitss.layer.model.Puesto updatePuesto(
		com.rec.hitss.layer.model.Puesto puesto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _puestoLocalService.updatePuesto(puesto);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _puestoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_puestoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _puestoLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.rec.hitss.layer.model.Puesto> findByRequerimientoRecurso(
		java.lang.Long requerimientoRecursoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRequerimientoRecursoException,
			java.text.ParseException {
		return _puestoLocalService.findByRequerimientoRecurso(requerimientoRecursoId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PuestoLocalService getWrappedPuestoLocalService() {
		return _puestoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPuestoLocalService(
		PuestoLocalService puestoLocalService) {
		_puestoLocalService = puestoLocalService;
	}

	@Override
	public PuestoLocalService getWrappedService() {
		return _puestoLocalService;
	}

	@Override
	public void setWrappedService(PuestoLocalService puestoLocalService) {
		_puestoLocalService = puestoLocalService;
	}

	private PuestoLocalService _puestoLocalService;
}
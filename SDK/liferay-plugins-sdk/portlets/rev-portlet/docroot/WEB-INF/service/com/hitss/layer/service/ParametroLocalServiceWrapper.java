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
 * Provides a wrapper for {@link ParametroLocalService}.
 *
 * @author Danielle Delgado
 * @see ParametroLocalService
 * @generated
 */
public class ParametroLocalServiceWrapper implements ParametroLocalService,
	ServiceWrapper<ParametroLocalService> {
	public ParametroLocalServiceWrapper(
		ParametroLocalService parametroLocalService) {
		_parametroLocalService = parametroLocalService;
	}

	/**
	* Adds the parametro to the database. Also notifies the appropriate model listeners.
	*
	* @param parametro the parametro
	* @return the parametro that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Parametro addParametro(
		com.hitss.layer.model.Parametro parametro)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parametroLocalService.addParametro(parametro);
	}

	/**
	* Creates a new parametro with the primary key. Does not add the parametro to the database.
	*
	* @param parametroId the primary key for the new parametro
	* @return the new parametro
	*/
	@Override
	public com.hitss.layer.model.Parametro createParametro(long parametroId) {
		return _parametroLocalService.createParametro(parametroId);
	}

	/**
	* Deletes the parametro with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param parametroId the primary key of the parametro
	* @return the parametro that was removed
	* @throws PortalException if a parametro with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Parametro deleteParametro(long parametroId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _parametroLocalService.deleteParametro(parametroId);
	}

	/**
	* Deletes the parametro from the database. Also notifies the appropriate model listeners.
	*
	* @param parametro the parametro
	* @return the parametro that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Parametro deleteParametro(
		com.hitss.layer.model.Parametro parametro)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parametroLocalService.deleteParametro(parametro);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _parametroLocalService.dynamicQuery();
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
		return _parametroLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _parametroLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _parametroLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _parametroLocalService.dynamicQueryCount(dynamicQuery);
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
		return _parametroLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.hitss.layer.model.Parametro fetchParametro(long parametroId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parametroLocalService.fetchParametro(parametroId);
	}

	/**
	* Returns the parametro with the primary key.
	*
	* @param parametroId the primary key of the parametro
	* @return the parametro
	* @throws PortalException if a parametro with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Parametro getParametro(long parametroId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _parametroLocalService.getParametro(parametroId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _parametroLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the parametros.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of parametros
	* @param end the upper bound of the range of parametros (not inclusive)
	* @return the range of parametros
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.Parametro> getParametros(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parametroLocalService.getParametros(start, end);
	}

	/**
	* Returns the number of parametros.
	*
	* @return the number of parametros
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getParametrosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parametroLocalService.getParametrosCount();
	}

	/**
	* Updates the parametro in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param parametro the parametro
	* @return the parametro that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Parametro updateParametro(
		com.hitss.layer.model.Parametro parametro)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parametroLocalService.updateParametro(parametro);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _parametroLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_parametroLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _parametroLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.hitss.layer.model.Parametro newInstance() {
		return _parametroLocalService.newInstance();
	}

	@Override
	public java.util.List<com.hitss.layer.model.Parametro> getParametros() {
		return _parametroLocalService.getParametros();
	}

	@Override
	public java.util.List<com.hitss.layer.model.Parametro> findByparametroPadre(
		long parametroIdpadre)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parametroLocalService.findByparametroPadre(parametroIdpadre);
	}

	@Override
	public java.util.List<com.hitss.layer.model.Parametro> findByValor(
		long parametroIdpadre, java.lang.String valor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parametroLocalService.findByValor(parametroIdpadre, valor);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ParametroLocalService getWrappedParametroLocalService() {
		return _parametroLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedParametroLocalService(
		ParametroLocalService parametroLocalService) {
		_parametroLocalService = parametroLocalService;
	}

	@Override
	public ParametroLocalService getWrappedService() {
		return _parametroLocalService;
	}

	@Override
	public void setWrappedService(ParametroLocalService parametroLocalService) {
		_parametroLocalService = parametroLocalService;
	}

	private ParametroLocalService _parametroLocalService;
}
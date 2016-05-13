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

package com.hitss.layer.service.persistence;

import com.hitss.layer.model.EtiquetaRelacionada;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the etiqueta relacionada service. This utility wraps {@link EtiquetaRelacionadaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see EtiquetaRelacionadaPersistence
 * @see EtiquetaRelacionadaPersistenceImpl
 * @generated
 */
public class EtiquetaRelacionadaUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(EtiquetaRelacionada etiquetaRelacionada) {
		getPersistence().clearCache(etiquetaRelacionada);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EtiquetaRelacionada> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EtiquetaRelacionada> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EtiquetaRelacionada> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static EtiquetaRelacionada update(
		EtiquetaRelacionada etiquetaRelacionada) throws SystemException {
		return getPersistence().update(etiquetaRelacionada);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static EtiquetaRelacionada update(
		EtiquetaRelacionada etiquetaRelacionada, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(etiquetaRelacionada, serviceContext);
	}

	/**
	* Caches the etiqueta relacionada in the entity cache if it is enabled.
	*
	* @param etiquetaRelacionada the etiqueta relacionada
	*/
	public static void cacheResult(
		com.hitss.layer.model.EtiquetaRelacionada etiquetaRelacionada) {
		getPersistence().cacheResult(etiquetaRelacionada);
	}

	/**
	* Caches the etiqueta relacionadas in the entity cache if it is enabled.
	*
	* @param etiquetaRelacionadas the etiqueta relacionadas
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.EtiquetaRelacionada> etiquetaRelacionadas) {
		getPersistence().cacheResult(etiquetaRelacionadas);
	}

	/**
	* Creates a new etiqueta relacionada with the primary key. Does not add the etiqueta relacionada to the database.
	*
	* @param etiquetaRelacionadaId the primary key for the new etiqueta relacionada
	* @return the new etiqueta relacionada
	*/
	public static com.hitss.layer.model.EtiquetaRelacionada create(
		long etiquetaRelacionadaId) {
		return getPersistence().create(etiquetaRelacionadaId);
	}

	/**
	* Removes the etiqueta relacionada with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param etiquetaRelacionadaId the primary key of the etiqueta relacionada
	* @return the etiqueta relacionada that was removed
	* @throws com.hitss.layer.NoSuchEtiquetaRelacionadaException if a etiqueta relacionada with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.EtiquetaRelacionada remove(
		long etiquetaRelacionadaId)
		throws com.hitss.layer.NoSuchEtiquetaRelacionadaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(etiquetaRelacionadaId);
	}

	public static com.hitss.layer.model.EtiquetaRelacionada updateImpl(
		com.hitss.layer.model.EtiquetaRelacionada etiquetaRelacionada)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(etiquetaRelacionada);
	}

	/**
	* Returns the etiqueta relacionada with the primary key or throws a {@link com.hitss.layer.NoSuchEtiquetaRelacionadaException} if it could not be found.
	*
	* @param etiquetaRelacionadaId the primary key of the etiqueta relacionada
	* @return the etiqueta relacionada
	* @throws com.hitss.layer.NoSuchEtiquetaRelacionadaException if a etiqueta relacionada with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.EtiquetaRelacionada findByPrimaryKey(
		long etiquetaRelacionadaId)
		throws com.hitss.layer.NoSuchEtiquetaRelacionadaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(etiquetaRelacionadaId);
	}

	/**
	* Returns the etiqueta relacionada with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param etiquetaRelacionadaId the primary key of the etiqueta relacionada
	* @return the etiqueta relacionada, or <code>null</code> if a etiqueta relacionada with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.EtiquetaRelacionada fetchByPrimaryKey(
		long etiquetaRelacionadaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(etiquetaRelacionadaId);
	}

	/**
	* Returns all the etiqueta relacionadas.
	*
	* @return the etiqueta relacionadas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.EtiquetaRelacionada> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the etiqueta relacionadas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EtiquetaRelacionadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of etiqueta relacionadas
	* @param end the upper bound of the range of etiqueta relacionadas (not inclusive)
	* @return the range of etiqueta relacionadas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.EtiquetaRelacionada> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the etiqueta relacionadas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EtiquetaRelacionadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of etiqueta relacionadas
	* @param end the upper bound of the range of etiqueta relacionadas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of etiqueta relacionadas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.EtiquetaRelacionada> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the etiqueta relacionadas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of etiqueta relacionadas.
	*
	* @return the number of etiqueta relacionadas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EtiquetaRelacionadaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EtiquetaRelacionadaPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					EtiquetaRelacionadaPersistence.class.getName());

			ReferenceRegistry.registerReference(EtiquetaRelacionadaUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EtiquetaRelacionadaPersistence persistence) {
	}

	private static EtiquetaRelacionadaPersistence _persistence;
}
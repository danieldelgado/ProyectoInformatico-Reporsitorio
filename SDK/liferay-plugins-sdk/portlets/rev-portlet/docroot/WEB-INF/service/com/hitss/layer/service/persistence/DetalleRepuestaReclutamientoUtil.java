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

import com.hitss.layer.model.DetalleRepuestaReclutamiento;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the detalle repuesta reclutamiento service. This utility wraps {@link DetalleRepuestaReclutamientoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see DetalleRepuestaReclutamientoPersistence
 * @see DetalleRepuestaReclutamientoPersistenceImpl
 * @generated
 */
public class DetalleRepuestaReclutamientoUtil {
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
	public static void clearCache(
		DetalleRepuestaReclutamiento detalleRepuestaReclutamiento) {
		getPersistence().clearCache(detalleRepuestaReclutamiento);
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
	public static List<DetalleRepuestaReclutamiento> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DetalleRepuestaReclutamiento> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DetalleRepuestaReclutamiento> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DetalleRepuestaReclutamiento update(
		DetalleRepuestaReclutamiento detalleRepuestaReclutamiento)
		throws SystemException {
		return getPersistence().update(detalleRepuestaReclutamiento);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DetalleRepuestaReclutamiento update(
		DetalleRepuestaReclutamiento detalleRepuestaReclutamiento,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(detalleRepuestaReclutamiento, serviceContext);
	}

	/**
	* Caches the detalle repuesta reclutamiento in the entity cache if it is enabled.
	*
	* @param detalleRepuestaReclutamiento the detalle repuesta reclutamiento
	*/
	public static void cacheResult(
		com.hitss.layer.model.DetalleRepuestaReclutamiento detalleRepuestaReclutamiento) {
		getPersistence().cacheResult(detalleRepuestaReclutamiento);
	}

	/**
	* Caches the detalle repuesta reclutamientos in the entity cache if it is enabled.
	*
	* @param detalleRepuestaReclutamientos the detalle repuesta reclutamientos
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.DetalleRepuestaReclutamiento> detalleRepuestaReclutamientos) {
		getPersistence().cacheResult(detalleRepuestaReclutamientos);
	}

	/**
	* Creates a new detalle repuesta reclutamiento with the primary key. Does not add the detalle repuesta reclutamiento to the database.
	*
	* @param detalleRepuestaReclutamientoPK the primary key for the new detalle repuesta reclutamiento
	* @return the new detalle repuesta reclutamiento
	*/
	public static com.hitss.layer.model.DetalleRepuestaReclutamiento create(
		com.hitss.layer.service.persistence.DetalleRepuestaReclutamientoPK detalleRepuestaReclutamientoPK) {
		return getPersistence().create(detalleRepuestaReclutamientoPK);
	}

	/**
	* Removes the detalle repuesta reclutamiento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param detalleRepuestaReclutamientoPK the primary key of the detalle repuesta reclutamiento
	* @return the detalle repuesta reclutamiento that was removed
	* @throws com.hitss.layer.NoSuchDetalleRepuestaReclutamientoException if a detalle repuesta reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.DetalleRepuestaReclutamiento remove(
		com.hitss.layer.service.persistence.DetalleRepuestaReclutamientoPK detalleRepuestaReclutamientoPK)
		throws com.hitss.layer.NoSuchDetalleRepuestaReclutamientoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(detalleRepuestaReclutamientoPK);
	}

	public static com.hitss.layer.model.DetalleRepuestaReclutamiento updateImpl(
		com.hitss.layer.model.DetalleRepuestaReclutamiento detalleRepuestaReclutamiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(detalleRepuestaReclutamiento);
	}

	/**
	* Returns the detalle repuesta reclutamiento with the primary key or throws a {@link com.hitss.layer.NoSuchDetalleRepuestaReclutamientoException} if it could not be found.
	*
	* @param detalleRepuestaReclutamientoPK the primary key of the detalle repuesta reclutamiento
	* @return the detalle repuesta reclutamiento
	* @throws com.hitss.layer.NoSuchDetalleRepuestaReclutamientoException if a detalle repuesta reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.DetalleRepuestaReclutamiento findByPrimaryKey(
		com.hitss.layer.service.persistence.DetalleRepuestaReclutamientoPK detalleRepuestaReclutamientoPK)
		throws com.hitss.layer.NoSuchDetalleRepuestaReclutamientoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(detalleRepuestaReclutamientoPK);
	}

	/**
	* Returns the detalle repuesta reclutamiento with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param detalleRepuestaReclutamientoPK the primary key of the detalle repuesta reclutamiento
	* @return the detalle repuesta reclutamiento, or <code>null</code> if a detalle repuesta reclutamiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.DetalleRepuestaReclutamiento fetchByPrimaryKey(
		com.hitss.layer.service.persistence.DetalleRepuestaReclutamientoPK detalleRepuestaReclutamientoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(detalleRepuestaReclutamientoPK);
	}

	/**
	* Returns all the detalle repuesta reclutamientos.
	*
	* @return the detalle repuesta reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.DetalleRepuestaReclutamiento> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the detalle repuesta reclutamientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.DetalleRepuestaReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of detalle repuesta reclutamientos
	* @param end the upper bound of the range of detalle repuesta reclutamientos (not inclusive)
	* @return the range of detalle repuesta reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.DetalleRepuestaReclutamiento> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the detalle repuesta reclutamientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.DetalleRepuestaReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of detalle repuesta reclutamientos
	* @param end the upper bound of the range of detalle repuesta reclutamientos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of detalle repuesta reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.DetalleRepuestaReclutamiento> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the detalle repuesta reclutamientos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of detalle repuesta reclutamientos.
	*
	* @return the number of detalle repuesta reclutamientos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DetalleRepuestaReclutamientoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DetalleRepuestaReclutamientoPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					DetalleRepuestaReclutamientoPersistence.class.getName());

			ReferenceRegistry.registerReference(DetalleRepuestaReclutamientoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(
		DetalleRepuestaReclutamientoPersistence persistence) {
	}

	private static DetalleRepuestaReclutamientoPersistence _persistence;
}
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

import com.hitss.layer.model.DetalleRepuestaEvaluacion;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the detalle repuesta evaluacion service. This utility wraps {@link DetalleRepuestaEvaluacionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see DetalleRepuestaEvaluacionPersistence
 * @see DetalleRepuestaEvaluacionPersistenceImpl
 * @generated
 */
public class DetalleRepuestaEvaluacionUtil {
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
		DetalleRepuestaEvaluacion detalleRepuestaEvaluacion) {
		getPersistence().clearCache(detalleRepuestaEvaluacion);
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
	public static List<DetalleRepuestaEvaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DetalleRepuestaEvaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DetalleRepuestaEvaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DetalleRepuestaEvaluacion update(
		DetalleRepuestaEvaluacion detalleRepuestaEvaluacion)
		throws SystemException {
		return getPersistence().update(detalleRepuestaEvaluacion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DetalleRepuestaEvaluacion update(
		DetalleRepuestaEvaluacion detalleRepuestaEvaluacion,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(detalleRepuestaEvaluacion, serviceContext);
	}

	/**
	* Caches the detalle repuesta evaluacion in the entity cache if it is enabled.
	*
	* @param detalleRepuestaEvaluacion the detalle repuesta evaluacion
	*/
	public static void cacheResult(
		com.hitss.layer.model.DetalleRepuestaEvaluacion detalleRepuestaEvaluacion) {
		getPersistence().cacheResult(detalleRepuestaEvaluacion);
	}

	/**
	* Caches the detalle repuesta evaluacions in the entity cache if it is enabled.
	*
	* @param detalleRepuestaEvaluacions the detalle repuesta evaluacions
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.DetalleRepuestaEvaluacion> detalleRepuestaEvaluacions) {
		getPersistence().cacheResult(detalleRepuestaEvaluacions);
	}

	/**
	* Creates a new detalle repuesta evaluacion with the primary key. Does not add the detalle repuesta evaluacion to the database.
	*
	* @param detalleRepuestaEvaluacionPK the primary key for the new detalle repuesta evaluacion
	* @return the new detalle repuesta evaluacion
	*/
	public static com.hitss.layer.model.DetalleRepuestaEvaluacion create(
		com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK detalleRepuestaEvaluacionPK) {
		return getPersistence().create(detalleRepuestaEvaluacionPK);
	}

	/**
	* Removes the detalle repuesta evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param detalleRepuestaEvaluacionPK the primary key of the detalle repuesta evaluacion
	* @return the detalle repuesta evaluacion that was removed
	* @throws com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException if a detalle repuesta evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.DetalleRepuestaEvaluacion remove(
		com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK detalleRepuestaEvaluacionPK)
		throws com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(detalleRepuestaEvaluacionPK);
	}

	public static com.hitss.layer.model.DetalleRepuestaEvaluacion updateImpl(
		com.hitss.layer.model.DetalleRepuestaEvaluacion detalleRepuestaEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(detalleRepuestaEvaluacion);
	}

	/**
	* Returns the detalle repuesta evaluacion with the primary key or throws a {@link com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException} if it could not be found.
	*
	* @param detalleRepuestaEvaluacionPK the primary key of the detalle repuesta evaluacion
	* @return the detalle repuesta evaluacion
	* @throws com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException if a detalle repuesta evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.DetalleRepuestaEvaluacion findByPrimaryKey(
		com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK detalleRepuestaEvaluacionPK)
		throws com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(detalleRepuestaEvaluacionPK);
	}

	/**
	* Returns the detalle repuesta evaluacion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param detalleRepuestaEvaluacionPK the primary key of the detalle repuesta evaluacion
	* @return the detalle repuesta evaluacion, or <code>null</code> if a detalle repuesta evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.DetalleRepuestaEvaluacion fetchByPrimaryKey(
		com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK detalleRepuestaEvaluacionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(detalleRepuestaEvaluacionPK);
	}

	/**
	* Returns all the detalle repuesta evaluacions.
	*
	* @return the detalle repuesta evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.DetalleRepuestaEvaluacion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the detalle repuesta evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.DetalleRepuestaEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of detalle repuesta evaluacions
	* @param end the upper bound of the range of detalle repuesta evaluacions (not inclusive)
	* @return the range of detalle repuesta evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.DetalleRepuestaEvaluacion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the detalle repuesta evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.DetalleRepuestaEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of detalle repuesta evaluacions
	* @param end the upper bound of the range of detalle repuesta evaluacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of detalle repuesta evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.DetalleRepuestaEvaluacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the detalle repuesta evaluacions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of detalle repuesta evaluacions.
	*
	* @return the number of detalle repuesta evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DetalleRepuestaEvaluacionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DetalleRepuestaEvaluacionPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					DetalleRepuestaEvaluacionPersistence.class.getName());

			ReferenceRegistry.registerReference(DetalleRepuestaEvaluacionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DetalleRepuestaEvaluacionPersistence persistence) {
	}

	private static DetalleRepuestaEvaluacionPersistence _persistence;
}
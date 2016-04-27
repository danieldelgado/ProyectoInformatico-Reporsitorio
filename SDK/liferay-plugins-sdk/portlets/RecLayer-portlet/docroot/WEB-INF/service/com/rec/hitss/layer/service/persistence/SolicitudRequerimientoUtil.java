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

package com.rec.hitss.layer.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.rec.hitss.layer.model.SolicitudRequerimiento;

import java.util.List;

/**
 * The persistence utility for the solicitud requerimiento service. This utility wraps {@link SolicitudRequerimientoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see SolicitudRequerimientoPersistence
 * @see SolicitudRequerimientoPersistenceImpl
 * @generated
 */
public class SolicitudRequerimientoUtil {
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
	public static void clearCache(SolicitudRequerimiento solicitudRequerimiento) {
		getPersistence().clearCache(solicitudRequerimiento);
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
	public static List<SolicitudRequerimiento> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SolicitudRequerimiento> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SolicitudRequerimiento> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static SolicitudRequerimiento update(
		SolicitudRequerimiento solicitudRequerimiento)
		throws SystemException {
		return getPersistence().update(solicitudRequerimiento);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static SolicitudRequerimiento update(
		SolicitudRequerimiento solicitudRequerimiento,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(solicitudRequerimiento, serviceContext);
	}

	/**
	* Returns all the solicitud requerimientos where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @return the matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.SolicitudRequerimiento> findBySolicitudRequerimientoId(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySolicitudRequerimientoId(solicitudRequerimientoId);
	}

	/**
	* Returns a range of all the solicitud requerimientos where solicitudRequerimientoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param start the lower bound of the range of solicitud requerimientos
	* @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	* @return the range of matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.SolicitudRequerimiento> findBySolicitudRequerimientoId(
		long solicitudRequerimientoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySolicitudRequerimientoId(solicitudRequerimientoId,
			start, end);
	}

	/**
	* Returns an ordered range of all the solicitud requerimientos where solicitudRequerimientoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param start the lower bound of the range of solicitud requerimientos
	* @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.SolicitudRequerimiento> findBySolicitudRequerimientoId(
		long solicitudRequerimientoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySolicitudRequerimientoId(solicitudRequerimientoId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento
	* @throws com.rec.hitss.layer.NoSuchSolicitudRequerimientoException if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento findBySolicitudRequerimientoId_First(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchSolicitudRequerimientoException {
		return getPersistence()
				   .findBySolicitudRequerimientoId_First(solicitudRequerimientoId,
			orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento, or <code>null</code> if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento fetchBySolicitudRequerimientoId_First(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySolicitudRequerimientoId_First(solicitudRequerimientoId,
			orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento
	* @throws com.rec.hitss.layer.NoSuchSolicitudRequerimientoException if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento findBySolicitudRequerimientoId_Last(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchSolicitudRequerimientoException {
		return getPersistence()
				   .findBySolicitudRequerimientoId_Last(solicitudRequerimientoId,
			orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento, or <code>null</code> if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento fetchBySolicitudRequerimientoId_Last(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySolicitudRequerimientoId_Last(solicitudRequerimientoId,
			orderByComparator);
	}

	/**
	* Removes all the solicitud requerimientos where solicitudRequerimientoId = &#63; from the database.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySolicitudRequerimientoId(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBySolicitudRequerimientoId(solicitudRequerimientoId);
	}

	/**
	* Returns the number of solicitud requerimientos where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @return the number of matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySolicitudRequerimientoId(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBySolicitudRequerimientoId(solicitudRequerimientoId);
	}

	/**
	* Returns all the solicitud requerimientos where estado = &#63;.
	*
	* @param estado the estado
	* @return the matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.SolicitudRequerimiento> findByEstado(
		long estado) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEstado(estado);
	}

	/**
	* Returns a range of all the solicitud requerimientos where estado = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param estado the estado
	* @param start the lower bound of the range of solicitud requerimientos
	* @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	* @return the range of matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.SolicitudRequerimiento> findByEstado(
		long estado, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEstado(estado, start, end);
	}

	/**
	* Returns an ordered range of all the solicitud requerimientos where estado = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param estado the estado
	* @param start the lower bound of the range of solicitud requerimientos
	* @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.SolicitudRequerimiento> findByEstado(
		long estado, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEstado(estado, start, end, orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento in the ordered set where estado = &#63;.
	*
	* @param estado the estado
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento
	* @throws com.rec.hitss.layer.NoSuchSolicitudRequerimientoException if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento findByEstado_First(
		long estado,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchSolicitudRequerimientoException {
		return getPersistence().findByEstado_First(estado, orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento in the ordered set where estado = &#63;.
	*
	* @param estado the estado
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento, or <code>null</code> if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento fetchByEstado_First(
		long estado,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByEstado_First(estado, orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento in the ordered set where estado = &#63;.
	*
	* @param estado the estado
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento
	* @throws com.rec.hitss.layer.NoSuchSolicitudRequerimientoException if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento findByEstado_Last(
		long estado,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchSolicitudRequerimientoException {
		return getPersistence().findByEstado_Last(estado, orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento in the ordered set where estado = &#63;.
	*
	* @param estado the estado
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento, or <code>null</code> if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento fetchByEstado_Last(
		long estado,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByEstado_Last(estado, orderByComparator);
	}

	/**
	* Returns the solicitud requerimientos before and after the current solicitud requerimiento in the ordered set where estado = &#63;.
	*
	* @param solicitudRequerimientoId the primary key of the current solicitud requerimiento
	* @param estado the estado
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next solicitud requerimiento
	* @throws com.rec.hitss.layer.NoSuchSolicitudRequerimientoException if a solicitud requerimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento[] findByEstado_PrevAndNext(
		long solicitudRequerimientoId, long estado,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchSolicitudRequerimientoException {
		return getPersistence()
				   .findByEstado_PrevAndNext(solicitudRequerimientoId, estado,
			orderByComparator);
	}

	/**
	* Removes all the solicitud requerimientos where estado = &#63; from the database.
	*
	* @param estado the estado
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEstado(long estado)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByEstado(estado);
	}

	/**
	* Returns the number of solicitud requerimientos where estado = &#63;.
	*
	* @param estado the estado
	* @return the number of matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEstado(long estado)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEstado(estado);
	}

	/**
	* Caches the solicitud requerimiento in the entity cache if it is enabled.
	*
	* @param solicitudRequerimiento the solicitud requerimiento
	*/
	public static void cacheResult(
		com.rec.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento) {
		getPersistence().cacheResult(solicitudRequerimiento);
	}

	/**
	* Caches the solicitud requerimientos in the entity cache if it is enabled.
	*
	* @param solicitudRequerimientos the solicitud requerimientos
	*/
	public static void cacheResult(
		java.util.List<com.rec.hitss.layer.model.SolicitudRequerimiento> solicitudRequerimientos) {
		getPersistence().cacheResult(solicitudRequerimientos);
	}

	/**
	* Creates a new solicitud requerimiento with the primary key. Does not add the solicitud requerimiento to the database.
	*
	* @param solicitudRequerimientoId the primary key for the new solicitud requerimiento
	* @return the new solicitud requerimiento
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento create(
		long solicitudRequerimientoId) {
		return getPersistence().create(solicitudRequerimientoId);
	}

	/**
	* Removes the solicitud requerimiento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoId the primary key of the solicitud requerimiento
	* @return the solicitud requerimiento that was removed
	* @throws com.rec.hitss.layer.NoSuchSolicitudRequerimientoException if a solicitud requerimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento remove(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchSolicitudRequerimientoException {
		return getPersistence().remove(solicitudRequerimientoId);
	}

	public static com.rec.hitss.layer.model.SolicitudRequerimiento updateImpl(
		com.rec.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(solicitudRequerimiento);
	}

	/**
	* Returns the solicitud requerimiento with the primary key or throws a {@link com.rec.hitss.layer.NoSuchSolicitudRequerimientoException} if it could not be found.
	*
	* @param solicitudRequerimientoId the primary key of the solicitud requerimiento
	* @return the solicitud requerimiento
	* @throws com.rec.hitss.layer.NoSuchSolicitudRequerimientoException if a solicitud requerimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento findByPrimaryKey(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchSolicitudRequerimientoException {
		return getPersistence().findByPrimaryKey(solicitudRequerimientoId);
	}

	/**
	* Returns the solicitud requerimiento with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param solicitudRequerimientoId the primary key of the solicitud requerimiento
	* @return the solicitud requerimiento, or <code>null</code> if a solicitud requerimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.SolicitudRequerimiento fetchByPrimaryKey(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(solicitudRequerimientoId);
	}

	/**
	* Returns all the solicitud requerimientos.
	*
	* @return the solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.SolicitudRequerimiento> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the solicitud requerimientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud requerimientos
	* @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	* @return the range of solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.SolicitudRequerimiento> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the solicitud requerimientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud requerimientos
	* @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.SolicitudRequerimiento> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the solicitud requerimientos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of solicitud requerimientos.
	*
	* @return the number of solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the funcions associated with the solicitud requerimiento.
	*
	* @param pk the primary key of the solicitud requerimiento
	* @return the funcions associated with the solicitud requerimiento
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.Funcion> getFuncions(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getFuncions(pk);
	}

	/**
	* Returns a range of all the funcions associated with the solicitud requerimiento.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the solicitud requerimiento
	* @param start the lower bound of the range of solicitud requerimientos
	* @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	* @return the range of funcions associated with the solicitud requerimiento
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.Funcion> getFuncions(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getFuncions(pk, start, end);
	}

	/**
	* Returns an ordered range of all the funcions associated with the solicitud requerimiento.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the solicitud requerimiento
	* @param start the lower bound of the range of solicitud requerimientos
	* @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of funcions associated with the solicitud requerimiento
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.Funcion> getFuncions(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getFuncions(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of funcions associated with the solicitud requerimiento.
	*
	* @param pk the primary key of the solicitud requerimiento
	* @return the number of funcions associated with the solicitud requerimiento
	* @throws SystemException if a system exception occurred
	*/
	public static int getFuncionsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getFuncionsSize(pk);
	}

	/**
	* Returns <code>true</code> if the funcion is associated with the solicitud requerimiento.
	*
	* @param pk the primary key of the solicitud requerimiento
	* @param funcionPK the primary key of the funcion
	* @return <code>true</code> if the funcion is associated with the solicitud requerimiento; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsFuncion(long pk, long funcionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsFuncion(pk, funcionPK);
	}

	/**
	* Returns <code>true</code> if the solicitud requerimiento has any funcions associated with it.
	*
	* @param pk the primary key of the solicitud requerimiento to check for associations with funcions
	* @return <code>true</code> if the solicitud requerimiento has any funcions associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsFuncions(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsFuncions(pk);
	}

	/**
	* Adds an association between the solicitud requerimiento and the funcion. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the solicitud requerimiento
	* @param funcionPK the primary key of the funcion
	* @throws SystemException if a system exception occurred
	*/
	public static void addFuncion(long pk, long funcionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addFuncion(pk, funcionPK);
	}

	/**
	* Adds an association between the solicitud requerimiento and the funcion. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the solicitud requerimiento
	* @param funcion the funcion
	* @throws SystemException if a system exception occurred
	*/
	public static void addFuncion(long pk,
		com.rec.hitss.layer.model.Funcion funcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addFuncion(pk, funcion);
	}

	/**
	* Adds an association between the solicitud requerimiento and the funcions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the solicitud requerimiento
	* @param funcionPKs the primary keys of the funcions
	* @throws SystemException if a system exception occurred
	*/
	public static void addFuncions(long pk, long[] funcionPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addFuncions(pk, funcionPKs);
	}

	/**
	* Adds an association between the solicitud requerimiento and the funcions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the solicitud requerimiento
	* @param funcions the funcions
	* @throws SystemException if a system exception occurred
	*/
	public static void addFuncions(long pk,
		java.util.List<com.rec.hitss.layer.model.Funcion> funcions)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addFuncions(pk, funcions);
	}

	/**
	* Clears all associations between the solicitud requerimiento and its funcions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the solicitud requerimiento to clear the associated funcions from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearFuncions(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearFuncions(pk);
	}

	/**
	* Removes the association between the solicitud requerimiento and the funcion. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the solicitud requerimiento
	* @param funcionPK the primary key of the funcion
	* @throws SystemException if a system exception occurred
	*/
	public static void removeFuncion(long pk, long funcionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeFuncion(pk, funcionPK);
	}

	/**
	* Removes the association between the solicitud requerimiento and the funcion. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the solicitud requerimiento
	* @param funcion the funcion
	* @throws SystemException if a system exception occurred
	*/
	public static void removeFuncion(long pk,
		com.rec.hitss.layer.model.Funcion funcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeFuncion(pk, funcion);
	}

	/**
	* Removes the association between the solicitud requerimiento and the funcions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the solicitud requerimiento
	* @param funcionPKs the primary keys of the funcions
	* @throws SystemException if a system exception occurred
	*/
	public static void removeFuncions(long pk, long[] funcionPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeFuncions(pk, funcionPKs);
	}

	/**
	* Removes the association between the solicitud requerimiento and the funcions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the solicitud requerimiento
	* @param funcions the funcions
	* @throws SystemException if a system exception occurred
	*/
	public static void removeFuncions(long pk,
		java.util.List<com.rec.hitss.layer.model.Funcion> funcions)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeFuncions(pk, funcions);
	}

	/**
	* Sets the funcions associated with the solicitud requerimiento, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the solicitud requerimiento
	* @param funcionPKs the primary keys of the funcions to be associated with the solicitud requerimiento
	* @throws SystemException if a system exception occurred
	*/
	public static void setFuncions(long pk, long[] funcionPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setFuncions(pk, funcionPKs);
	}

	/**
	* Sets the funcions associated with the solicitud requerimiento, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the solicitud requerimiento
	* @param funcions the funcions to be associated with the solicitud requerimiento
	* @throws SystemException if a system exception occurred
	*/
	public static void setFuncions(long pk,
		java.util.List<com.rec.hitss.layer.model.Funcion> funcions)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setFuncions(pk, funcions);
	}

	public static SolicitudRequerimientoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SolicitudRequerimientoPersistence)PortletBeanLocatorUtil.locate(com.rec.hitss.layer.service.ClpSerializer.getServletContextName(),
					SolicitudRequerimientoPersistence.class.getName());

			ReferenceRegistry.registerReference(SolicitudRequerimientoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(SolicitudRequerimientoPersistence persistence) {
	}

	private static SolicitudRequerimientoPersistence _persistence;
}
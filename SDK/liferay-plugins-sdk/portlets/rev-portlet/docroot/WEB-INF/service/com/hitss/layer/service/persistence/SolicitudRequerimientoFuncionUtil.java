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

import com.hitss.layer.model.SolicitudRequerimientoFuncion;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the solicitud requerimiento funcion service. This utility wraps {@link SolicitudRequerimientoFuncionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoFuncionPersistence
 * @see SolicitudRequerimientoFuncionPersistenceImpl
 * @generated
 */
public class SolicitudRequerimientoFuncionUtil {
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
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion) {
		getPersistence().clearCache(solicitudRequerimientoFuncion);
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
	public static List<SolicitudRequerimientoFuncion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SolicitudRequerimientoFuncion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SolicitudRequerimientoFuncion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static SolicitudRequerimientoFuncion update(
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion)
		throws SystemException {
		return getPersistence().update(solicitudRequerimientoFuncion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static SolicitudRequerimientoFuncion update(
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(solicitudRequerimientoFuncion, serviceContext);
	}

	/**
	* Returns all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @return the matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_F(
		long solicitudFuncionId, long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_F(solicitudFuncionId, funcionId);
	}

	/**
	* Returns a range of all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param start the lower bound of the range of solicitud requerimiento funcions
	* @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	* @return the range of matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_F(
		long solicitudFuncionId, long funcionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_F(solicitudFuncionId, funcionId, start, end);
	}

	/**
	* Returns an ordered range of all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param start the lower bound of the range of solicitud requerimiento funcions
	* @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_F(
		long solicitudFuncionId, long funcionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_F(solicitudFuncionId, funcionId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion findByS_F_First(
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_F_First(solicitudFuncionId, funcionId,
			orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByS_F_First(
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_F_First(solicitudFuncionId, funcionId,
			orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion findByS_F_Last(
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_F_Last(solicitudFuncionId, funcionId,
			orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByS_F_Last(
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_F_Last(solicitudFuncionId, funcionId,
			orderByComparator);
	}

	/**
	* Returns the solicitud requerimiento funcions before and after the current solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudRequerimientoFuncionPK the primary key of the current solicitud requerimiento funcion
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a solicitud requerimiento funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion[] findByS_F_PrevAndNext(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK,
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_F_PrevAndNext(solicitudRequerimientoFuncionPK,
			solicitudFuncionId, funcionId, orderByComparator);
	}

	/**
	* Removes all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63; from the database.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_F(long solicitudFuncionId, long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS_F(solicitudFuncionId, funcionId);
	}

	/**
	* Returns the number of solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @return the number of matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_F(long solicitudFuncionId, long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS_F(solicitudFuncionId, funcionId);
	}

	/**
	* Returns all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @return the matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_F_ALL(
		long solicitudFuncionId, long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_F_ALL(solicitudFuncionId, funcionId);
	}

	/**
	* Returns a range of all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param start the lower bound of the range of solicitud requerimiento funcions
	* @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	* @return the range of matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_F_ALL(
		long solicitudFuncionId, long funcionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_F_ALL(solicitudFuncionId, funcionId, start, end);
	}

	/**
	* Returns an ordered range of all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param start the lower bound of the range of solicitud requerimiento funcions
	* @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_F_ALL(
		long solicitudFuncionId, long funcionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_F_ALL(solicitudFuncionId, funcionId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion findByS_F_ALL_First(
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_F_ALL_First(solicitudFuncionId, funcionId,
			orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByS_F_ALL_First(
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_F_ALL_First(solicitudFuncionId, funcionId,
			orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion findByS_F_ALL_Last(
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_F_ALL_Last(solicitudFuncionId, funcionId,
			orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByS_F_ALL_Last(
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_F_ALL_Last(solicitudFuncionId, funcionId,
			orderByComparator);
	}

	/**
	* Returns the solicitud requerimiento funcions before and after the current solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudRequerimientoFuncionPK the primary key of the current solicitud requerimiento funcion
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a solicitud requerimiento funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion[] findByS_F_ALL_PrevAndNext(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK,
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_F_ALL_PrevAndNext(solicitudRequerimientoFuncionPK,
			solicitudFuncionId, funcionId, orderByComparator);
	}

	/**
	* Removes all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63; from the database.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_F_ALL(long solicitudFuncionId, long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS_F_ALL(solicitudFuncionId, funcionId);
	}

	/**
	* Returns the number of solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @return the number of matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_F_ALL(long solicitudFuncionId, long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS_F_ALL(solicitudFuncionId, funcionId);
	}

	/**
	* Returns all the solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @return the matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS(
		long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS(solicitudFuncionId);
	}

	/**
	* Returns a range of all the solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param start the lower bound of the range of solicitud requerimiento funcions
	* @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	* @return the range of matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS(
		long solicitudFuncionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS(solicitudFuncionId, start, end);
	}

	/**
	* Returns an ordered range of all the solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param start the lower bound of the range of solicitud requerimiento funcions
	* @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS(
		long solicitudFuncionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS(solicitudFuncionId, start, end, orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion findByS_First(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_First(solicitudFuncionId, orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByS_First(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_First(solicitudFuncionId, orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion findByS_Last(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_Last(solicitudFuncionId, orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByS_Last(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_Last(solicitudFuncionId, orderByComparator);
	}

	/**
	* Returns the solicitud requerimiento funcions before and after the current solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudRequerimientoFuncionPK the primary key of the current solicitud requerimiento funcion
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a solicitud requerimiento funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion[] findByS_PrevAndNext(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK,
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_PrevAndNext(solicitudRequerimientoFuncionPK,
			solicitudFuncionId, orderByComparator);
	}

	/**
	* Removes all the solicitud requerimiento funcions where solicitudFuncionId = &#63; from the database.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS(long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS(solicitudFuncionId);
	}

	/**
	* Returns the number of solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @return the number of matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS(long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS(solicitudFuncionId);
	}

	/**
	* Returns all the solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @return the matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_All(
		long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_All(solicitudFuncionId);
	}

	/**
	* Returns a range of all the solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param start the lower bound of the range of solicitud requerimiento funcions
	* @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	* @return the range of matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_All(
		long solicitudFuncionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_All(solicitudFuncionId, start, end);
	}

	/**
	* Returns an ordered range of all the solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param start the lower bound of the range of solicitud requerimiento funcions
	* @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_All(
		long solicitudFuncionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_All(solicitudFuncionId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion findByS_All_First(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_All_First(solicitudFuncionId, orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByS_All_First(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_All_First(solicitudFuncionId, orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion findByS_All_Last(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_All_Last(solicitudFuncionId, orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByS_All_Last(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_All_Last(solicitudFuncionId, orderByComparator);
	}

	/**
	* Returns the solicitud requerimiento funcions before and after the current solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudRequerimientoFuncionPK the primary key of the current solicitud requerimiento funcion
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a solicitud requerimiento funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion[] findByS_All_PrevAndNext(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK,
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_All_PrevAndNext(solicitudRequerimientoFuncionPK,
			solicitudFuncionId, orderByComparator);
	}

	/**
	* Removes all the solicitud requerimiento funcions where solicitudFuncionId = &#63; from the database.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_All(long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS_All(solicitudFuncionId);
	}

	/**
	* Returns the number of solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @return the number of matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_All(long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS_All(solicitudFuncionId);
	}

	/**
	* Caches the solicitud requerimiento funcion in the entity cache if it is enabled.
	*
	* @param solicitudRequerimientoFuncion the solicitud requerimiento funcion
	*/
	public static void cacheResult(
		com.hitss.layer.model.SolicitudRequerimientoFuncion solicitudRequerimientoFuncion) {
		getPersistence().cacheResult(solicitudRequerimientoFuncion);
	}

	/**
	* Caches the solicitud requerimiento funcions in the entity cache if it is enabled.
	*
	* @param solicitudRequerimientoFuncions the solicitud requerimiento funcions
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> solicitudRequerimientoFuncions) {
		getPersistence().cacheResult(solicitudRequerimientoFuncions);
	}

	/**
	* Creates a new solicitud requerimiento funcion with the primary key. Does not add the solicitud requerimiento funcion to the database.
	*
	* @param solicitudRequerimientoFuncionPK the primary key for the new solicitud requerimiento funcion
	* @return the new solicitud requerimiento funcion
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion create(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK) {
		return getPersistence().create(solicitudRequerimientoFuncionPK);
	}

	/**
	* Removes the solicitud requerimiento funcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoFuncionPK the primary key of the solicitud requerimiento funcion
	* @return the solicitud requerimiento funcion that was removed
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a solicitud requerimiento funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion remove(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(solicitudRequerimientoFuncionPK);
	}

	public static com.hitss.layer.model.SolicitudRequerimientoFuncion updateImpl(
		com.hitss.layer.model.SolicitudRequerimientoFuncion solicitudRequerimientoFuncion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(solicitudRequerimientoFuncion);
	}

	/**
	* Returns the solicitud requerimiento funcion with the primary key or throws a {@link com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException} if it could not be found.
	*
	* @param solicitudRequerimientoFuncionPK the primary key of the solicitud requerimiento funcion
	* @return the solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a solicitud requerimiento funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion findByPrimaryKey(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(solicitudRequerimientoFuncionPK);
	}

	/**
	* Returns the solicitud requerimiento funcion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param solicitudRequerimientoFuncionPK the primary key of the solicitud requerimiento funcion
	* @return the solicitud requerimiento funcion, or <code>null</code> if a solicitud requerimiento funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByPrimaryKey(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPrimaryKey(solicitudRequerimientoFuncionPK);
	}

	/**
	* Returns all the solicitud requerimiento funcions.
	*
	* @return the solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the solicitud requerimiento funcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud requerimiento funcions
	* @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the solicitud requerimiento funcions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of solicitud requerimiento funcions.
	*
	* @return the number of solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SolicitudRequerimientoFuncionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SolicitudRequerimientoFuncionPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					SolicitudRequerimientoFuncionPersistence.class.getName());

			ReferenceRegistry.registerReference(SolicitudRequerimientoFuncionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(
		SolicitudRequerimientoFuncionPersistence persistence) {
	}

	private static SolicitudRequerimientoFuncionPersistence _persistence;
}
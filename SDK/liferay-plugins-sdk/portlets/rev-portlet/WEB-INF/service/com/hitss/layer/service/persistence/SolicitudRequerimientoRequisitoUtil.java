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

import com.hitss.layer.model.SolicitudRequerimientoRequisito;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the solicitud requerimiento requisito service. This utility wraps {@link SolicitudRequerimientoRequisitoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoRequisitoPersistence
 * @see SolicitudRequerimientoRequisitoPersistenceImpl
 * @generated
 */
public class SolicitudRequerimientoRequisitoUtil {
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
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito) {
		getPersistence().clearCache(solicitudRequerimientoRequisito);
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
	public static List<SolicitudRequerimientoRequisito> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SolicitudRequerimientoRequisito> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SolicitudRequerimientoRequisito> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static SolicitudRequerimientoRequisito update(
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito)
		throws SystemException {
		return getPersistence().update(solicitudRequerimientoRequisito);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static SolicitudRequerimientoRequisito update(
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(solicitudRequerimientoRequisito, serviceContext);
	}

	/**
	* Returns all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @return the matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_T(
		long solicitudRequerimientoId, long tagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_T(solicitudRequerimientoId, tagId);
	}

	/**
	* Returns a range of all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param start the lower bound of the range of solicitud requerimiento requisitos
	* @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	* @return the range of matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_T(
		long solicitudRequerimientoId, long tagId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_T(solicitudRequerimientoId, tagId, start, end);
	}

	/**
	* Returns an ordered range of all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param start the lower bound of the range of solicitud requerimiento requisitos
	* @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_T(
		long solicitudRequerimientoId, long tagId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_T(solicitudRequerimientoId, tagId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito findByS_T_First(
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_T_First(solicitudRequerimientoId, tagId,
			orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByS_T_First(
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_T_First(solicitudRequerimientoId, tagId,
			orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito findByS_T_Last(
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_T_Last(solicitudRequerimientoId, tagId,
			orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByS_T_Last(
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_T_Last(solicitudRequerimientoId, tagId,
			orderByComparator);
	}

	/**
	* Returns the solicitud requerimiento requisitos before and after the current solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoRequisitoPK the primary key of the current solicitud requerimiento requisito
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito[] findByS_T_PrevAndNext(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK,
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_T_PrevAndNext(solicitudRequerimientoRequisitoPK,
			solicitudRequerimientoId, tagId, orderByComparator);
	}

	/**
	* Removes all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63; from the database.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_T(long solicitudRequerimientoId, long tagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS_T(solicitudRequerimientoId, tagId);
	}

	/**
	* Returns the number of solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @return the number of matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_T(long solicitudRequerimientoId, long tagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS_T(solicitudRequerimientoId, tagId);
	}

	/**
	* Returns all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @return the matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_T_ALL(
		long solicitudRequerimientoId, long tagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_T_ALL(solicitudRequerimientoId, tagId);
	}

	/**
	* Returns a range of all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param start the lower bound of the range of solicitud requerimiento requisitos
	* @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	* @return the range of matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_T_ALL(
		long solicitudRequerimientoId, long tagId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_T_ALL(solicitudRequerimientoId, tagId, start, end);
	}

	/**
	* Returns an ordered range of all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param start the lower bound of the range of solicitud requerimiento requisitos
	* @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_T_ALL(
		long solicitudRequerimientoId, long tagId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_T_ALL(solicitudRequerimientoId, tagId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito findByS_T_ALL_First(
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_T_ALL_First(solicitudRequerimientoId, tagId,
			orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByS_T_ALL_First(
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_T_ALL_First(solicitudRequerimientoId, tagId,
			orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito findByS_T_ALL_Last(
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_T_ALL_Last(solicitudRequerimientoId, tagId,
			orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByS_T_ALL_Last(
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_T_ALL_Last(solicitudRequerimientoId, tagId,
			orderByComparator);
	}

	/**
	* Returns the solicitud requerimiento requisitos before and after the current solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoRequisitoPK the primary key of the current solicitud requerimiento requisito
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito[] findByS_T_ALL_PrevAndNext(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK,
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_T_ALL_PrevAndNext(solicitudRequerimientoRequisitoPK,
			solicitudRequerimientoId, tagId, orderByComparator);
	}

	/**
	* Removes all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63; from the database.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_T_ALL(long solicitudRequerimientoId, long tagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS_T_ALL(solicitudRequerimientoId, tagId);
	}

	/**
	* Returns the number of solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @return the number of matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_T_ALL(long solicitudRequerimientoId, long tagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS_T_ALL(solicitudRequerimientoId, tagId);
	}

	/**
	* Returns all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @return the matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS(solicitudRequerimientoId);
	}

	/**
	* Returns a range of all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param start the lower bound of the range of solicitud requerimiento requisitos
	* @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	* @return the range of matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS(
		long solicitudRequerimientoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS(solicitudRequerimientoId, start, end);
	}

	/**
	* Returns an ordered range of all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param start the lower bound of the range of solicitud requerimiento requisitos
	* @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS(
		long solicitudRequerimientoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS(solicitudRequerimientoId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito findByS_First(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_First(solicitudRequerimientoId, orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByS_First(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_First(solicitudRequerimientoId, orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito findByS_Last(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_Last(solicitudRequerimientoId, orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByS_Last(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_Last(solicitudRequerimientoId, orderByComparator);
	}

	/**
	* Returns the solicitud requerimiento requisitos before and after the current solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoRequisitoPK the primary key of the current solicitud requerimiento requisito
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito[] findByS_PrevAndNext(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK,
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_PrevAndNext(solicitudRequerimientoRequisitoPK,
			solicitudRequerimientoId, orderByComparator);
	}

	/**
	* Removes all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; from the database.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS(long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS(solicitudRequerimientoId);
	}

	/**
	* Returns the number of solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @return the number of matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS(long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS(solicitudRequerimientoId);
	}

	/**
	* Returns all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @return the matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_All(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_All(solicitudRequerimientoId);
	}

	/**
	* Returns a range of all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param start the lower bound of the range of solicitud requerimiento requisitos
	* @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	* @return the range of matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_All(
		long solicitudRequerimientoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_All(solicitudRequerimientoId, start, end);
	}

	/**
	* Returns an ordered range of all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param start the lower bound of the range of solicitud requerimiento requisitos
	* @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_All(
		long solicitudRequerimientoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_All(solicitudRequerimientoId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito findByS_All_First(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_All_First(solicitudRequerimientoId,
			orderByComparator);
	}

	/**
	* Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByS_All_First(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_All_First(solicitudRequerimientoId,
			orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito findByS_All_Last(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_All_Last(solicitudRequerimientoId, orderByComparator);
	}

	/**
	* Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByS_All_Last(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_All_Last(solicitudRequerimientoId,
			orderByComparator);
	}

	/**
	* Returns the solicitud requerimiento requisitos before and after the current solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoRequisitoPK the primary key of the current solicitud requerimiento requisito
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito[] findByS_All_PrevAndNext(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK,
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_All_PrevAndNext(solicitudRequerimientoRequisitoPK,
			solicitudRequerimientoId, orderByComparator);
	}

	/**
	* Removes all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; from the database.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_All(long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS_All(solicitudRequerimientoId);
	}

	/**
	* Returns the number of solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @return the number of matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_All(long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS_All(solicitudRequerimientoId);
	}

	/**
	* Caches the solicitud requerimiento requisito in the entity cache if it is enabled.
	*
	* @param solicitudRequerimientoRequisito the solicitud requerimiento requisito
	*/
	public static void cacheResult(
		com.hitss.layer.model.SolicitudRequerimientoRequisito solicitudRequerimientoRequisito) {
		getPersistence().cacheResult(solicitudRequerimientoRequisito);
	}

	/**
	* Caches the solicitud requerimiento requisitos in the entity cache if it is enabled.
	*
	* @param solicitudRequerimientoRequisitos the solicitud requerimiento requisitos
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> solicitudRequerimientoRequisitos) {
		getPersistence().cacheResult(solicitudRequerimientoRequisitos);
	}

	/**
	* Creates a new solicitud requerimiento requisito with the primary key. Does not add the solicitud requerimiento requisito to the database.
	*
	* @param solicitudRequerimientoRequisitoPK the primary key for the new solicitud requerimiento requisito
	* @return the new solicitud requerimiento requisito
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito create(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK) {
		return getPersistence().create(solicitudRequerimientoRequisitoPK);
	}

	/**
	* Removes the solicitud requerimiento requisito with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoRequisitoPK the primary key of the solicitud requerimiento requisito
	* @return the solicitud requerimiento requisito that was removed
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito remove(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(solicitudRequerimientoRequisitoPK);
	}

	public static com.hitss.layer.model.SolicitudRequerimientoRequisito updateImpl(
		com.hitss.layer.model.SolicitudRequerimientoRequisito solicitudRequerimientoRequisito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(solicitudRequerimientoRequisito);
	}

	/**
	* Returns the solicitud requerimiento requisito with the primary key or throws a {@link com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException} if it could not be found.
	*
	* @param solicitudRequerimientoRequisitoPK the primary key of the solicitud requerimiento requisito
	* @return the solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito findByPrimaryKey(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPrimaryKey(solicitudRequerimientoRequisitoPK);
	}

	/**
	* Returns the solicitud requerimiento requisito with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param solicitudRequerimientoRequisitoPK the primary key of the solicitud requerimiento requisito
	* @return the solicitud requerimiento requisito, or <code>null</code> if a solicitud requerimiento requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByPrimaryKey(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPrimaryKey(solicitudRequerimientoRequisitoPK);
	}

	/**
	* Returns all the solicitud requerimiento requisitos.
	*
	* @return the solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the solicitud requerimiento requisitos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud requerimiento requisitos
	* @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	* @return the range of solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the solicitud requerimiento requisitos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud requerimiento requisitos
	* @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the solicitud requerimiento requisitos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of solicitud requerimiento requisitos.
	*
	* @return the number of solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SolicitudRequerimientoRequisitoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SolicitudRequerimientoRequisitoPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					SolicitudRequerimientoRequisitoPersistence.class.getName());

			ReferenceRegistry.registerReference(SolicitudRequerimientoRequisitoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(
		SolicitudRequerimientoRequisitoPersistence persistence) {
	}

	private static SolicitudRequerimientoRequisitoPersistence _persistence;
}
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

import com.hitss.layer.model.FasePostulacion;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the fase postulacion service. This utility wraps {@link FasePostulacionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see FasePostulacionPersistence
 * @see FasePostulacionPersistenceImpl
 * @generated
 */
public class FasePostulacionUtil {
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
	public static void clearCache(FasePostulacion fasePostulacion) {
		getPersistence().clearCache(fasePostulacion);
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
	public static List<FasePostulacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FasePostulacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FasePostulacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static FasePostulacion update(FasePostulacion fasePostulacion)
		throws SystemException {
		return getPersistence().update(fasePostulacion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static FasePostulacion update(FasePostulacion fasePostulacion,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(fasePostulacion, serviceContext);
	}

	/**
	* Returns all the fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @param usuarioId the usuario ID
	* @return the matching fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacion> findByS_F_U(
		long solicitudRequerimientoId, long fasePostulacionId, long usuarioId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_F_U(solicitudRequerimientoId, fasePostulacionId,
			usuarioId);
	}

	/**
	* Returns a range of all the fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @param usuarioId the usuario ID
	* @param start the lower bound of the range of fase postulacions
	* @param end the upper bound of the range of fase postulacions (not inclusive)
	* @return the range of matching fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacion> findByS_F_U(
		long solicitudRequerimientoId, long fasePostulacionId, long usuarioId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_F_U(solicitudRequerimientoId, fasePostulacionId,
			usuarioId, start, end);
	}

	/**
	* Returns an ordered range of all the fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @param usuarioId the usuario ID
	* @param start the lower bound of the range of fase postulacions
	* @param end the upper bound of the range of fase postulacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacion> findByS_F_U(
		long solicitudRequerimientoId, long fasePostulacionId, long usuarioId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_F_U(solicitudRequerimientoId, fasePostulacionId,
			usuarioId, start, end, orderByComparator);
	}

	/**
	* Returns the first fase postulacion in the ordered set where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fase postulacion
	* @throws com.hitss.layer.NoSuchFasePostulacionException if a matching fase postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion findByS_F_U_First(
		long solicitudRequerimientoId, long fasePostulacionId, long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFasePostulacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_F_U_First(solicitudRequerimientoId,
			fasePostulacionId, usuarioId, orderByComparator);
	}

	/**
	* Returns the first fase postulacion in the ordered set where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion fetchByS_F_U_First(
		long solicitudRequerimientoId, long fasePostulacionId, long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_F_U_First(solicitudRequerimientoId,
			fasePostulacionId, usuarioId, orderByComparator);
	}

	/**
	* Returns the last fase postulacion in the ordered set where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fase postulacion
	* @throws com.hitss.layer.NoSuchFasePostulacionException if a matching fase postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion findByS_F_U_Last(
		long solicitudRequerimientoId, long fasePostulacionId, long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFasePostulacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_F_U_Last(solicitudRequerimientoId,
			fasePostulacionId, usuarioId, orderByComparator);
	}

	/**
	* Returns the last fase postulacion in the ordered set where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion fetchByS_F_U_Last(
		long solicitudRequerimientoId, long fasePostulacionId, long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_F_U_Last(solicitudRequerimientoId,
			fasePostulacionId, usuarioId, orderByComparator);
	}

	/**
	* Removes all the fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63; from the database.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @param usuarioId the usuario ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_F_U(long solicitudRequerimientoId,
		long fasePostulacionId, long usuarioId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByS_F_U(solicitudRequerimientoId, fasePostulacionId,
			usuarioId);
	}

	/**
	* Returns the number of fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @param usuarioId the usuario ID
	* @return the number of matching fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_F_U(long solicitudRequerimientoId,
		long fasePostulacionId, long usuarioId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByS_F_U(solicitudRequerimientoId, fasePostulacionId,
			usuarioId);
	}

	/**
	* Returns all the fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @return the matching fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacion> findByS_L_F(
		long solicitudRequerimientoId, long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_L_F(solicitudRequerimientoId, fasePostulacionId);
	}

	/**
	* Returns a range of all the fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @param start the lower bound of the range of fase postulacions
	* @param end the upper bound of the range of fase postulacions (not inclusive)
	* @return the range of matching fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacion> findByS_L_F(
		long solicitudRequerimientoId, long fasePostulacionId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_L_F(solicitudRequerimientoId, fasePostulacionId,
			start, end);
	}

	/**
	* Returns an ordered range of all the fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @param start the lower bound of the range of fase postulacions
	* @param end the upper bound of the range of fase postulacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacion> findByS_L_F(
		long solicitudRequerimientoId, long fasePostulacionId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_L_F(solicitudRequerimientoId, fasePostulacionId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first fase postulacion in the ordered set where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fase postulacion
	* @throws com.hitss.layer.NoSuchFasePostulacionException if a matching fase postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion findByS_L_F_First(
		long solicitudRequerimientoId, long fasePostulacionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFasePostulacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_L_F_First(solicitudRequerimientoId,
			fasePostulacionId, orderByComparator);
	}

	/**
	* Returns the first fase postulacion in the ordered set where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion fetchByS_L_F_First(
		long solicitudRequerimientoId, long fasePostulacionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_L_F_First(solicitudRequerimientoId,
			fasePostulacionId, orderByComparator);
	}

	/**
	* Returns the last fase postulacion in the ordered set where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fase postulacion
	* @throws com.hitss.layer.NoSuchFasePostulacionException if a matching fase postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion findByS_L_F_Last(
		long solicitudRequerimientoId, long fasePostulacionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFasePostulacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_L_F_Last(solicitudRequerimientoId,
			fasePostulacionId, orderByComparator);
	}

	/**
	* Returns the last fase postulacion in the ordered set where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion fetchByS_L_F_Last(
		long solicitudRequerimientoId, long fasePostulacionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_L_F_Last(solicitudRequerimientoId,
			fasePostulacionId, orderByComparator);
	}

	/**
	* Removes all the fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; from the database.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_L_F(long solicitudRequerimientoId,
		long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByS_L_F(solicitudRequerimientoId, fasePostulacionId);
	}

	/**
	* Returns the number of fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param fasePostulacionId the fase postulacion ID
	* @return the number of matching fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_L_F(long solicitudRequerimientoId,
		long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByS_L_F(solicitudRequerimientoId, fasePostulacionId);
	}

	/**
	* Returns the fase postulacion where solicitudRequerimientoId = &#63; and usuarioId = &#63; and tipoFase = &#63; or throws a {@link com.hitss.layer.NoSuchFasePostulacionException} if it could not be found.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param usuarioId the usuario ID
	* @param tipoFase the tipo fase
	* @return the matching fase postulacion
	* @throws com.hitss.layer.NoSuchFasePostulacionException if a matching fase postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion findByS_U_T(
		long solicitudRequerimientoId, long usuarioId, long tipoFase)
		throws com.hitss.layer.NoSuchFasePostulacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_U_T(solicitudRequerimientoId, usuarioId, tipoFase);
	}

	/**
	* Returns the fase postulacion where solicitudRequerimientoId = &#63; and usuarioId = &#63; and tipoFase = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param usuarioId the usuario ID
	* @param tipoFase the tipo fase
	* @return the matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion fetchByS_U_T(
		long solicitudRequerimientoId, long usuarioId, long tipoFase)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_U_T(solicitudRequerimientoId, usuarioId, tipoFase);
	}

	/**
	* Returns the fase postulacion where solicitudRequerimientoId = &#63; and usuarioId = &#63; and tipoFase = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param usuarioId the usuario ID
	* @param tipoFase the tipo fase
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion fetchByS_U_T(
		long solicitudRequerimientoId, long usuarioId, long tipoFase,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_U_T(solicitudRequerimientoId, usuarioId, tipoFase,
			retrieveFromCache);
	}

	/**
	* Removes the fase postulacion where solicitudRequerimientoId = &#63; and usuarioId = &#63; and tipoFase = &#63; from the database.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param usuarioId the usuario ID
	* @param tipoFase the tipo fase
	* @return the fase postulacion that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion removeByS_U_T(
		long solicitudRequerimientoId, long usuarioId, long tipoFase)
		throws com.hitss.layer.NoSuchFasePostulacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .removeByS_U_T(solicitudRequerimientoId, usuarioId, tipoFase);
	}

	/**
	* Returns the number of fase postulacions where solicitudRequerimientoId = &#63; and usuarioId = &#63; and tipoFase = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param usuarioId the usuario ID
	* @param tipoFase the tipo fase
	* @return the number of matching fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_U_T(long solicitudRequerimientoId,
		long usuarioId, long tipoFase)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByS_U_T(solicitudRequerimientoId, usuarioId, tipoFase);
	}

	/**
	* Returns the fase postulacion where fasePostulacionId = &#63; or throws a {@link com.hitss.layer.NoSuchFasePostulacionException} if it could not be found.
	*
	* @param fasePostulacionId the fase postulacion ID
	* @return the matching fase postulacion
	* @throws com.hitss.layer.NoSuchFasePostulacionException if a matching fase postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion findByF(
		long fasePostulacionId)
		throws com.hitss.layer.NoSuchFasePostulacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF(fasePostulacionId);
	}

	/**
	* Returns the fase postulacion where fasePostulacionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param fasePostulacionId the fase postulacion ID
	* @return the matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion fetchByF(
		long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF(fasePostulacionId);
	}

	/**
	* Returns the fase postulacion where fasePostulacionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param fasePostulacionId the fase postulacion ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion fetchByF(
		long fasePostulacionId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF(fasePostulacionId, retrieveFromCache);
	}

	/**
	* Removes the fase postulacion where fasePostulacionId = &#63; from the database.
	*
	* @param fasePostulacionId the fase postulacion ID
	* @return the fase postulacion that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion removeByF(
		long fasePostulacionId)
		throws com.hitss.layer.NoSuchFasePostulacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByF(fasePostulacionId);
	}

	/**
	* Returns the number of fase postulacions where fasePostulacionId = &#63;.
	*
	* @param fasePostulacionId the fase postulacion ID
	* @return the number of matching fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF(long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF(fasePostulacionId);
	}

	/**
	* Caches the fase postulacion in the entity cache if it is enabled.
	*
	* @param fasePostulacion the fase postulacion
	*/
	public static void cacheResult(
		com.hitss.layer.model.FasePostulacion fasePostulacion) {
		getPersistence().cacheResult(fasePostulacion);
	}

	/**
	* Caches the fase postulacions in the entity cache if it is enabled.
	*
	* @param fasePostulacions the fase postulacions
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.FasePostulacion> fasePostulacions) {
		getPersistence().cacheResult(fasePostulacions);
	}

	/**
	* Creates a new fase postulacion with the primary key. Does not add the fase postulacion to the database.
	*
	* @param fasePostulacionId the primary key for the new fase postulacion
	* @return the new fase postulacion
	*/
	public static com.hitss.layer.model.FasePostulacion create(
		long fasePostulacionId) {
		return getPersistence().create(fasePostulacionId);
	}

	/**
	* Removes the fase postulacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fasePostulacionId the primary key of the fase postulacion
	* @return the fase postulacion that was removed
	* @throws com.hitss.layer.NoSuchFasePostulacionException if a fase postulacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion remove(
		long fasePostulacionId)
		throws com.hitss.layer.NoSuchFasePostulacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(fasePostulacionId);
	}

	public static com.hitss.layer.model.FasePostulacion updateImpl(
		com.hitss.layer.model.FasePostulacion fasePostulacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(fasePostulacion);
	}

	/**
	* Returns the fase postulacion with the primary key or throws a {@link com.hitss.layer.NoSuchFasePostulacionException} if it could not be found.
	*
	* @param fasePostulacionId the primary key of the fase postulacion
	* @return the fase postulacion
	* @throws com.hitss.layer.NoSuchFasePostulacionException if a fase postulacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion findByPrimaryKey(
		long fasePostulacionId)
		throws com.hitss.layer.NoSuchFasePostulacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(fasePostulacionId);
	}

	/**
	* Returns the fase postulacion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fasePostulacionId the primary key of the fase postulacion
	* @return the fase postulacion, or <code>null</code> if a fase postulacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacion fetchByPrimaryKey(
		long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(fasePostulacionId);
	}

	/**
	* Returns all the fase postulacions.
	*
	* @return the fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the fase postulacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fase postulacions
	* @param end the upper bound of the range of fase postulacions (not inclusive)
	* @return the range of fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the fase postulacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fase postulacions
	* @param end the upper bound of the range of fase postulacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the fase postulacions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of fase postulacions.
	*
	* @return the number of fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the evaluacions associated with the fase postulacion.
	*
	* @param pk the primary key of the fase postulacion
	* @return the evaluacions associated with the fase postulacion
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Evaluacion> getEvaluacions(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getEvaluacions(pk);
	}

	/**
	* Returns a range of all the evaluacions associated with the fase postulacion.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the fase postulacion
	* @param start the lower bound of the range of fase postulacions
	* @param end the upper bound of the range of fase postulacions (not inclusive)
	* @return the range of evaluacions associated with the fase postulacion
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Evaluacion> getEvaluacions(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getEvaluacions(pk, start, end);
	}

	/**
	* Returns an ordered range of all the evaluacions associated with the fase postulacion.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the fase postulacion
	* @param start the lower bound of the range of fase postulacions
	* @param end the upper bound of the range of fase postulacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of evaluacions associated with the fase postulacion
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Evaluacion> getEvaluacions(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getEvaluacions(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of evaluacions associated with the fase postulacion.
	*
	* @param pk the primary key of the fase postulacion
	* @return the number of evaluacions associated with the fase postulacion
	* @throws SystemException if a system exception occurred
	*/
	public static int getEvaluacionsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getEvaluacionsSize(pk);
	}

	/**
	* Returns <code>true</code> if the evaluacion is associated with the fase postulacion.
	*
	* @param pk the primary key of the fase postulacion
	* @param evaluacionPK the primary key of the evaluacion
	* @return <code>true</code> if the evaluacion is associated with the fase postulacion; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsEvaluacion(long pk, long evaluacionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsEvaluacion(pk, evaluacionPK);
	}

	/**
	* Returns <code>true</code> if the fase postulacion has any evaluacions associated with it.
	*
	* @param pk the primary key of the fase postulacion to check for associations with evaluacions
	* @return <code>true</code> if the fase postulacion has any evaluacions associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsEvaluacions(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsEvaluacions(pk);
	}

	/**
	* Adds an association between the fase postulacion and the evaluacion. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the fase postulacion
	* @param evaluacionPK the primary key of the evaluacion
	* @throws SystemException if a system exception occurred
	*/
	public static void addEvaluacion(long pk, long evaluacionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addEvaluacion(pk, evaluacionPK);
	}

	/**
	* Adds an association between the fase postulacion and the evaluacion. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the fase postulacion
	* @param evaluacion the evaluacion
	* @throws SystemException if a system exception occurred
	*/
	public static void addEvaluacion(long pk,
		com.hitss.layer.model.Evaluacion evaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addEvaluacion(pk, evaluacion);
	}

	/**
	* Adds an association between the fase postulacion and the evaluacions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the fase postulacion
	* @param evaluacionPKs the primary keys of the evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static void addEvaluacions(long pk, long[] evaluacionPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addEvaluacions(pk, evaluacionPKs);
	}

	/**
	* Adds an association between the fase postulacion and the evaluacions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the fase postulacion
	* @param evaluacions the evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static void addEvaluacions(long pk,
		java.util.List<com.hitss.layer.model.Evaluacion> evaluacions)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addEvaluacions(pk, evaluacions);
	}

	/**
	* Clears all associations between the fase postulacion and its evaluacions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the fase postulacion to clear the associated evaluacions from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearEvaluacions(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearEvaluacions(pk);
	}

	/**
	* Removes the association between the fase postulacion and the evaluacion. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the fase postulacion
	* @param evaluacionPK the primary key of the evaluacion
	* @throws SystemException if a system exception occurred
	*/
	public static void removeEvaluacion(long pk, long evaluacionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeEvaluacion(pk, evaluacionPK);
	}

	/**
	* Removes the association between the fase postulacion and the evaluacion. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the fase postulacion
	* @param evaluacion the evaluacion
	* @throws SystemException if a system exception occurred
	*/
	public static void removeEvaluacion(long pk,
		com.hitss.layer.model.Evaluacion evaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeEvaluacion(pk, evaluacion);
	}

	/**
	* Removes the association between the fase postulacion and the evaluacions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the fase postulacion
	* @param evaluacionPKs the primary keys of the evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static void removeEvaluacions(long pk, long[] evaluacionPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeEvaluacions(pk, evaluacionPKs);
	}

	/**
	* Removes the association between the fase postulacion and the evaluacions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the fase postulacion
	* @param evaluacions the evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static void removeEvaluacions(long pk,
		java.util.List<com.hitss.layer.model.Evaluacion> evaluacions)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeEvaluacions(pk, evaluacions);
	}

	/**
	* Sets the evaluacions associated with the fase postulacion, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the fase postulacion
	* @param evaluacionPKs the primary keys of the evaluacions to be associated with the fase postulacion
	* @throws SystemException if a system exception occurred
	*/
	public static void setEvaluacions(long pk, long[] evaluacionPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setEvaluacions(pk, evaluacionPKs);
	}

	/**
	* Sets the evaluacions associated with the fase postulacion, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the fase postulacion
	* @param evaluacions the evaluacions to be associated with the fase postulacion
	* @throws SystemException if a system exception occurred
	*/
	public static void setEvaluacions(long pk,
		java.util.List<com.hitss.layer.model.Evaluacion> evaluacions)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setEvaluacions(pk, evaluacions);
	}

	public static FasePostulacionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FasePostulacionPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					FasePostulacionPersistence.class.getName());

			ReferenceRegistry.registerReference(FasePostulacionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(FasePostulacionPersistence persistence) {
	}

	private static FasePostulacionPersistence _persistence;
}
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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the solicitud requerimiento funcion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoFuncionPersistenceImpl
 * @see SolicitudRequerimientoFuncionUtil
 * @generated
 */
public interface SolicitudRequerimientoFuncionPersistence
	extends BasePersistence<SolicitudRequerimientoFuncion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SolicitudRequerimientoFuncionUtil} to access the solicitud requerimiento funcion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @return the matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_F(
		long solicitudFuncionId, long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_F(
		long solicitudFuncionId, long funcionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_F(
		long solicitudFuncionId, long funcionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.SolicitudRequerimientoFuncion findByS_F_First(
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByS_F_First(
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.SolicitudRequerimientoFuncion findByS_F_Last(
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByS_F_Last(
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.SolicitudRequerimientoFuncion[] findByS_F_PrevAndNext(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK,
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63; from the database.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_F(long solicitudFuncionId, long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @return the number of matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_F(long solicitudFuncionId, long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @return the matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_F_ALL(
		long solicitudFuncionId, long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_F_ALL(
		long solicitudFuncionId, long funcionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_F_ALL(
		long solicitudFuncionId, long funcionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.SolicitudRequerimientoFuncion findByS_F_ALL_First(
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByS_F_ALL_First(
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.SolicitudRequerimientoFuncion findByS_F_ALL_Last(
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByS_F_ALL_Last(
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.SolicitudRequerimientoFuncion[] findByS_F_ALL_PrevAndNext(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK,
		long solicitudFuncionId, long funcionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63; from the database.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_F_ALL(long solicitudFuncionId, long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param funcionId the funcion ID
	* @return the number of matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_F_ALL(long solicitudFuncionId, long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @return the matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS(
		long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS(
		long solicitudFuncionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS(
		long solicitudFuncionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoFuncion findByS_First(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByS_First(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoFuncion findByS_Last(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByS_Last(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.SolicitudRequerimientoFuncion[] findByS_PrevAndNext(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK,
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud requerimiento funcions where solicitudFuncionId = &#63; from the database.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS(long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @return the number of matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public int countByS(long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @return the matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_All(
		long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_All(
		long solicitudFuncionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findByS_All(
		long solicitudFuncionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoFuncion findByS_All_First(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByS_All_First(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoFuncion findByS_All_Last(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByS_All_Last(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.SolicitudRequerimientoFuncion[] findByS_All_PrevAndNext(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK,
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud requerimiento funcions where solicitudFuncionId = &#63; from the database.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_All(long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @return the number of matching solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_All(long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the solicitud requerimiento funcion in the entity cache if it is enabled.
	*
	* @param solicitudRequerimientoFuncion the solicitud requerimiento funcion
	*/
	public void cacheResult(
		com.hitss.layer.model.SolicitudRequerimientoFuncion solicitudRequerimientoFuncion);

	/**
	* Caches the solicitud requerimiento funcions in the entity cache if it is enabled.
	*
	* @param solicitudRequerimientoFuncions the solicitud requerimiento funcions
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> solicitudRequerimientoFuncions);

	/**
	* Creates a new solicitud requerimiento funcion with the primary key. Does not add the solicitud requerimiento funcion to the database.
	*
	* @param solicitudRequerimientoFuncionPK the primary key for the new solicitud requerimiento funcion
	* @return the new solicitud requerimiento funcion
	*/
	public com.hitss.layer.model.SolicitudRequerimientoFuncion create(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK);

	/**
	* Removes the solicitud requerimiento funcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoFuncionPK the primary key of the solicitud requerimiento funcion
	* @return the solicitud requerimiento funcion that was removed
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a solicitud requerimiento funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoFuncion remove(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.SolicitudRequerimientoFuncion updateImpl(
		com.hitss.layer.model.SolicitudRequerimientoFuncion solicitudRequerimientoFuncion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the solicitud requerimiento funcion with the primary key or throws a {@link com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException} if it could not be found.
	*
	* @param solicitudRequerimientoFuncionPK the primary key of the solicitud requerimiento funcion
	* @return the solicitud requerimiento funcion
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a solicitud requerimiento funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoFuncion findByPrimaryKey(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the solicitud requerimiento funcion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param solicitudRequerimientoFuncionPK the primary key of the solicitud requerimiento funcion
	* @return the solicitud requerimiento funcion, or <code>null</code> if a solicitud requerimiento funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoFuncion fetchByPrimaryKey(
		com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the solicitud requerimiento funcions.
	*
	* @return the solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoFuncion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud requerimiento funcions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud requerimiento funcions.
	*
	* @return the number of solicitud requerimiento funcions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
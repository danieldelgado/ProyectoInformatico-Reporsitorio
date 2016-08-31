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

import com.hitss.layer.model.SolicitudRequerimiento;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the solicitud requerimiento service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoPersistenceImpl
 * @see SolicitudRequerimientoUtil
 * @generated
 */
public interface SolicitudRequerimientoPersistence extends BasePersistence<SolicitudRequerimiento> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SolicitudRequerimientoUtil} to access the solicitud requerimiento persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the solicitud requerimiento where contenidoId = &#63; or throws a {@link com.hitss.layer.NoSuchSolicitudRequerimientoException} if it could not be found.
	*
	* @param contenidoId the contenido ID
	* @return the matching solicitud requerimiento
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimiento findByC(
		java.lang.String contenidoId)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the solicitud requerimiento where contenidoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param contenidoId the contenido ID
	* @return the matching solicitud requerimiento, or <code>null</code> if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimiento fetchByC(
		java.lang.String contenidoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the solicitud requerimiento where contenidoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param contenidoId the contenido ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching solicitud requerimiento, or <code>null</code> if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimiento fetchByC(
		java.lang.String contenidoId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the solicitud requerimiento where contenidoId = &#63; from the database.
	*
	* @param contenidoId the contenido ID
	* @return the solicitud requerimiento that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimiento removeByC(
		java.lang.String contenidoId)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud requerimientos where contenidoId = &#63;.
	*
	* @param contenidoId the contenido ID
	* @return the number of matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public int countByC(java.lang.String contenidoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the solicitud requerimientos where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @return the matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimiento> findBySolicitudRequerimientoId(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the solicitud requerimientos where solicitudRequerimientoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param start the lower bound of the range of solicitud requerimientos
	* @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	* @return the range of matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimiento> findBySolicitudRequerimientoId(
		long solicitudRequerimientoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the solicitud requerimientos where solicitudRequerimientoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param start the lower bound of the range of solicitud requerimientos
	* @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimiento> findBySolicitudRequerimientoId(
		long solicitudRequerimientoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first solicitud requerimiento in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimiento findBySolicitudRequerimientoId_First(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first solicitud requerimiento in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento, or <code>null</code> if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimiento fetchBySolicitudRequerimientoId_First(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last solicitud requerimiento in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimiento findBySolicitudRequerimientoId_Last(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last solicitud requerimiento in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento, or <code>null</code> if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimiento fetchBySolicitudRequerimientoId_Last(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud requerimientos where solicitudRequerimientoId = &#63; from the database.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySolicitudRequerimientoId(long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud requerimientos where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @return the number of matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public int countBySolicitudRequerimientoId(long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the solicitud requerimientos where estado = &#63;.
	*
	* @param estado the estado
	* @return the matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimiento> findByEstado(
		long estado) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the solicitud requerimientos where estado = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param estado the estado
	* @param start the lower bound of the range of solicitud requerimientos
	* @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	* @return the range of matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimiento> findByEstado(
		long estado, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the solicitud requerimientos where estado = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param estado the estado
	* @param start the lower bound of the range of solicitud requerimientos
	* @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimiento> findByEstado(
		long estado, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first solicitud requerimiento in the ordered set where estado = &#63;.
	*
	* @param estado the estado
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimiento findByEstado_First(
		long estado,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first solicitud requerimiento in the ordered set where estado = &#63;.
	*
	* @param estado the estado
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento, or <code>null</code> if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimiento fetchByEstado_First(
		long estado,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last solicitud requerimiento in the ordered set where estado = &#63;.
	*
	* @param estado the estado
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimiento findByEstado_Last(
		long estado,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last solicitud requerimiento in the ordered set where estado = &#63;.
	*
	* @param estado the estado
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento, or <code>null</code> if a matching solicitud requerimiento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimiento fetchByEstado_Last(
		long estado,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the solicitud requerimientos before and after the current solicitud requerimiento in the ordered set where estado = &#63;.
	*
	* @param solicitudRequerimientoId the primary key of the current solicitud requerimiento
	* @param estado the estado
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next solicitud requerimiento
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a solicitud requerimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimiento[] findByEstado_PrevAndNext(
		long solicitudRequerimientoId, long estado,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud requerimientos where estado = &#63; from the database.
	*
	* @param estado the estado
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEstado(long estado)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud requerimientos where estado = &#63;.
	*
	* @param estado the estado
	* @return the number of matching solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public int countByEstado(long estado)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the solicitud requerimiento in the entity cache if it is enabled.
	*
	* @param solicitudRequerimiento the solicitud requerimiento
	*/
	public void cacheResult(
		com.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento);

	/**
	* Caches the solicitud requerimientos in the entity cache if it is enabled.
	*
	* @param solicitudRequerimientos the solicitud requerimientos
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.SolicitudRequerimiento> solicitudRequerimientos);

	/**
	* Creates a new solicitud requerimiento with the primary key. Does not add the solicitud requerimiento to the database.
	*
	* @param solicitudRequerimientoId the primary key for the new solicitud requerimiento
	* @return the new solicitud requerimiento
	*/
	public com.hitss.layer.model.SolicitudRequerimiento create(
		long solicitudRequerimientoId);

	/**
	* Removes the solicitud requerimiento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoId the primary key of the solicitud requerimiento
	* @return the solicitud requerimiento that was removed
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a solicitud requerimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimiento remove(
		long solicitudRequerimientoId)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.SolicitudRequerimiento updateImpl(
		com.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the solicitud requerimiento with the primary key or throws a {@link com.hitss.layer.NoSuchSolicitudRequerimientoException} if it could not be found.
	*
	* @param solicitudRequerimientoId the primary key of the solicitud requerimiento
	* @return the solicitud requerimiento
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a solicitud requerimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimiento findByPrimaryKey(
		long solicitudRequerimientoId)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the solicitud requerimiento with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param solicitudRequerimientoId the primary key of the solicitud requerimiento
	* @return the solicitud requerimiento, or <code>null</code> if a solicitud requerimiento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimiento fetchByPrimaryKey(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the solicitud requerimientos.
	*
	* @return the solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimiento> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the solicitud requerimientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud requerimientos
	* @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	* @return the range of solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimiento> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the solicitud requerimientos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud requerimientos
	* @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimiento> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud requerimientos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud requerimientos.
	*
	* @return the number of solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
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

import com.hitss.layer.model.Postulacion;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the postulacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PostulacionPersistenceImpl
 * @see PostulacionUtil
 * @generated
 */
public interface PostulacionPersistence extends BasePersistence<Postulacion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PostulacionUtil} to access the postulacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the postulacions where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @return the matching postulacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Postulacion> findByS(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the postulacions where solicitudRequerimientoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param start the lower bound of the range of postulacions
	* @param end the upper bound of the range of postulacions (not inclusive)
	* @return the range of matching postulacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Postulacion> findByS(
		long solicitudRequerimientoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the postulacions where solicitudRequerimientoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param start the lower bound of the range of postulacions
	* @param end the upper bound of the range of postulacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching postulacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Postulacion> findByS(
		long solicitudRequerimientoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first postulacion in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching postulacion
	* @throws com.hitss.layer.NoSuchPostulacionException if a matching postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Postulacion findByS_First(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPostulacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first postulacion in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching postulacion, or <code>null</code> if a matching postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Postulacion fetchByS_First(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last postulacion in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching postulacion
	* @throws com.hitss.layer.NoSuchPostulacionException if a matching postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Postulacion findByS_Last(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPostulacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last postulacion in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching postulacion, or <code>null</code> if a matching postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Postulacion fetchByS_Last(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the postulacions before and after the current postulacion in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param postulacionPK the primary key of the current postulacion
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next postulacion
	* @throws com.hitss.layer.NoSuchPostulacionException if a postulacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Postulacion[] findByS_PrevAndNext(
		com.hitss.layer.service.persistence.PostulacionPK postulacionPK,
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPostulacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the postulacions where solicitudRequerimientoId = &#63; from the database.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS(long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of postulacions where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @return the number of matching postulacions
	* @throws SystemException if a system exception occurred
	*/
	public int countByS(long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the postulacions where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param usuarioId the usuario ID
	* @return the matching postulacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Postulacion> findByS_U(
		long solicitudRequerimientoId, long usuarioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the postulacions where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param usuarioId the usuario ID
	* @param start the lower bound of the range of postulacions
	* @param end the upper bound of the range of postulacions (not inclusive)
	* @return the range of matching postulacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Postulacion> findByS_U(
		long solicitudRequerimientoId, long usuarioId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the postulacions where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param usuarioId the usuario ID
	* @param start the lower bound of the range of postulacions
	* @param end the upper bound of the range of postulacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching postulacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Postulacion> findByS_U(
		long solicitudRequerimientoId, long usuarioId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first postulacion in the ordered set where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching postulacion
	* @throws com.hitss.layer.NoSuchPostulacionException if a matching postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Postulacion findByS_U_First(
		long solicitudRequerimientoId, long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPostulacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first postulacion in the ordered set where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching postulacion, or <code>null</code> if a matching postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Postulacion fetchByS_U_First(
		long solicitudRequerimientoId, long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last postulacion in the ordered set where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching postulacion
	* @throws com.hitss.layer.NoSuchPostulacionException if a matching postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Postulacion findByS_U_Last(
		long solicitudRequerimientoId, long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPostulacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last postulacion in the ordered set where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching postulacion, or <code>null</code> if a matching postulacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Postulacion fetchByS_U_Last(
		long solicitudRequerimientoId, long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the postulacions before and after the current postulacion in the ordered set where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	*
	* @param postulacionPK the primary key of the current postulacion
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next postulacion
	* @throws com.hitss.layer.NoSuchPostulacionException if a postulacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Postulacion[] findByS_U_PrevAndNext(
		com.hitss.layer.service.persistence.PostulacionPK postulacionPK,
		long solicitudRequerimientoId, long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPostulacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the postulacions where solicitudRequerimientoId = &#63; and usuarioId = &#63; from the database.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param usuarioId the usuario ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_U(long solicitudRequerimientoId, long usuarioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of postulacions where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param usuarioId the usuario ID
	* @return the number of matching postulacions
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_U(long solicitudRequerimientoId, long usuarioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the postulacion in the entity cache if it is enabled.
	*
	* @param postulacion the postulacion
	*/
	public void cacheResult(com.hitss.layer.model.Postulacion postulacion);

	/**
	* Caches the postulacions in the entity cache if it is enabled.
	*
	* @param postulacions the postulacions
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.Postulacion> postulacions);

	/**
	* Creates a new postulacion with the primary key. Does not add the postulacion to the database.
	*
	* @param postulacionPK the primary key for the new postulacion
	* @return the new postulacion
	*/
	public com.hitss.layer.model.Postulacion create(
		com.hitss.layer.service.persistence.PostulacionPK postulacionPK);

	/**
	* Removes the postulacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param postulacionPK the primary key of the postulacion
	* @return the postulacion that was removed
	* @throws com.hitss.layer.NoSuchPostulacionException if a postulacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Postulacion remove(
		com.hitss.layer.service.persistence.PostulacionPK postulacionPK)
		throws com.hitss.layer.NoSuchPostulacionException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.Postulacion updateImpl(
		com.hitss.layer.model.Postulacion postulacion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the postulacion with the primary key or throws a {@link com.hitss.layer.NoSuchPostulacionException} if it could not be found.
	*
	* @param postulacionPK the primary key of the postulacion
	* @return the postulacion
	* @throws com.hitss.layer.NoSuchPostulacionException if a postulacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Postulacion findByPrimaryKey(
		com.hitss.layer.service.persistence.PostulacionPK postulacionPK)
		throws com.hitss.layer.NoSuchPostulacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the postulacion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param postulacionPK the primary key of the postulacion
	* @return the postulacion, or <code>null</code> if a postulacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Postulacion fetchByPrimaryKey(
		com.hitss.layer.service.persistence.PostulacionPK postulacionPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the postulacions.
	*
	* @return the postulacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Postulacion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the postulacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of postulacions
	* @param end the upper bound of the range of postulacions (not inclusive)
	* @return the range of postulacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Postulacion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the postulacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of postulacions
	* @param end the upper bound of the range of postulacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of postulacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Postulacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the postulacions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of postulacions.
	*
	* @return the number of postulacions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
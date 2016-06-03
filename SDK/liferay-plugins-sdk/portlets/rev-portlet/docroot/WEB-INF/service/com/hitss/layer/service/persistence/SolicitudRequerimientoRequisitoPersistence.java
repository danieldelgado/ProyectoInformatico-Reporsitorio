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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the solicitud requerimiento requisito service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoRequisitoPersistenceImpl
 * @see SolicitudRequerimientoRequisitoUtil
 * @generated
 */
public interface SolicitudRequerimientoRequisitoPersistence
	extends BasePersistence<SolicitudRequerimientoRequisito> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SolicitudRequerimientoRequisitoUtil} to access the solicitud requerimiento requisito persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @return the matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_T(
		long solicitudRequerimientoId, long tagId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_T(
		long solicitudRequerimientoId, long tagId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_T(
		long solicitudRequerimientoId, long tagId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.SolicitudRequerimientoRequisito findByS_T_First(
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByS_T_First(
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.SolicitudRequerimientoRequisito findByS_T_Last(
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByS_T_Last(
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.SolicitudRequerimientoRequisito[] findByS_T_PrevAndNext(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK,
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63; from the database.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_T(long solicitudRequerimientoId, long tagId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @return the number of matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_T(long solicitudRequerimientoId, long tagId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @return the matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_T_ALL(
		long solicitudRequerimientoId, long tagId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_T_ALL(
		long solicitudRequerimientoId, long tagId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_T_ALL(
		long solicitudRequerimientoId, long tagId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.SolicitudRequerimientoRequisito findByS_T_ALL_First(
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByS_T_ALL_First(
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.SolicitudRequerimientoRequisito findByS_T_ALL_Last(
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByS_T_ALL_Last(
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.SolicitudRequerimientoRequisito[] findByS_T_ALL_PrevAndNext(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK,
		long solicitudRequerimientoId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63; from the database.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_T_ALL(long solicitudRequerimientoId, long tagId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param tagId the tag ID
	* @return the number of matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_T_ALL(long solicitudRequerimientoId, long tagId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @return the matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS(
		long solicitudRequerimientoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS(
		long solicitudRequerimientoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoRequisito findByS_First(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByS_First(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoRequisito findByS_Last(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByS_Last(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.SolicitudRequerimientoRequisito[] findByS_PrevAndNext(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK,
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; from the database.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS(long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @return the number of matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public int countByS(long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @return the matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_All(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_All(
		long solicitudRequerimientoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findByS_All(
		long solicitudRequerimientoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoRequisito findByS_All_First(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByS_All_First(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoRequisito findByS_All_Last(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByS_All_Last(
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.SolicitudRequerimientoRequisito[] findByS_All_PrevAndNext(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK,
		long solicitudRequerimientoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; from the database.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_All(long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	*
	* @param solicitudRequerimientoId the solicitud requerimiento ID
	* @return the number of matching solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_All(long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the solicitud requerimiento requisito in the entity cache if it is enabled.
	*
	* @param solicitudRequerimientoRequisito the solicitud requerimiento requisito
	*/
	public void cacheResult(
		com.hitss.layer.model.SolicitudRequerimientoRequisito solicitudRequerimientoRequisito);

	/**
	* Caches the solicitud requerimiento requisitos in the entity cache if it is enabled.
	*
	* @param solicitudRequerimientoRequisitos the solicitud requerimiento requisitos
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> solicitudRequerimientoRequisitos);

	/**
	* Creates a new solicitud requerimiento requisito with the primary key. Does not add the solicitud requerimiento requisito to the database.
	*
	* @param solicitudRequerimientoRequisitoPK the primary key for the new solicitud requerimiento requisito
	* @return the new solicitud requerimiento requisito
	*/
	public com.hitss.layer.model.SolicitudRequerimientoRequisito create(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK);

	/**
	* Removes the solicitud requerimiento requisito with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudRequerimientoRequisitoPK the primary key of the solicitud requerimiento requisito
	* @return the solicitud requerimiento requisito that was removed
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoRequisito remove(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.SolicitudRequerimientoRequisito updateImpl(
		com.hitss.layer.model.SolicitudRequerimientoRequisito solicitudRequerimientoRequisito)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the solicitud requerimiento requisito with the primary key or throws a {@link com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException} if it could not be found.
	*
	* @param solicitudRequerimientoRequisitoPK the primary key of the solicitud requerimiento requisito
	* @return the solicitud requerimiento requisito
	* @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoRequisito findByPrimaryKey(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK)
		throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the solicitud requerimiento requisito with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param solicitudRequerimientoRequisitoPK the primary key of the solicitud requerimiento requisito
	* @return the solicitud requerimiento requisito, or <code>null</code> if a solicitud requerimiento requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudRequerimientoRequisito fetchByPrimaryKey(
		com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the solicitud requerimiento requisitos.
	*
	* @return the solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.SolicitudRequerimientoRequisito> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud requerimiento requisitos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud requerimiento requisitos.
	*
	* @return the number of solicitud requerimiento requisitos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
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

import com.hitss.layer.model.Referencia;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the referencia service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see ReferenciaPersistenceImpl
 * @see ReferenciaUtil
 * @generated
 */
public interface ReferenciaPersistence extends BasePersistence<Referencia> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ReferenciaUtil} to access the referencia persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the referencias where usuarioId = &#63;.
	*
	* @param usuarioId the usuario ID
	* @return the matching referencias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Referencia> findByU(
		long usuarioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the referencias where usuarioId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ReferenciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param usuarioId the usuario ID
	* @param start the lower bound of the range of referencias
	* @param end the upper bound of the range of referencias (not inclusive)
	* @return the range of matching referencias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Referencia> findByU(
		long usuarioId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the referencias where usuarioId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ReferenciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param usuarioId the usuario ID
	* @param start the lower bound of the range of referencias
	* @param end the upper bound of the range of referencias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching referencias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Referencia> findByU(
		long usuarioId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first referencia in the ordered set where usuarioId = &#63;.
	*
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching referencia
	* @throws com.hitss.layer.NoSuchReferenciaException if a matching referencia could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Referencia findByU_First(long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchReferenciaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first referencia in the ordered set where usuarioId = &#63;.
	*
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching referencia, or <code>null</code> if a matching referencia could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Referencia fetchByU_First(long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last referencia in the ordered set where usuarioId = &#63;.
	*
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching referencia
	* @throws com.hitss.layer.NoSuchReferenciaException if a matching referencia could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Referencia findByU_Last(long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchReferenciaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last referencia in the ordered set where usuarioId = &#63;.
	*
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching referencia, or <code>null</code> if a matching referencia could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Referencia fetchByU_Last(long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the referencias before and after the current referencia in the ordered set where usuarioId = &#63;.
	*
	* @param referenciaPK the primary key of the current referencia
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next referencia
	* @throws com.hitss.layer.NoSuchReferenciaException if a referencia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Referencia[] findByU_PrevAndNext(
		com.hitss.layer.service.persistence.ReferenciaPK referenciaPK,
		long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchReferenciaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the referencias where usuarioId = &#63; from the database.
	*
	* @param usuarioId the usuario ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU(long usuarioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of referencias where usuarioId = &#63;.
	*
	* @param usuarioId the usuario ID
	* @return the number of matching referencias
	* @throws SystemException if a system exception occurred
	*/
	public int countByU(long usuarioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the referencia in the entity cache if it is enabled.
	*
	* @param referencia the referencia
	*/
	public void cacheResult(com.hitss.layer.model.Referencia referencia);

	/**
	* Caches the referencias in the entity cache if it is enabled.
	*
	* @param referencias the referencias
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.Referencia> referencias);

	/**
	* Creates a new referencia with the primary key. Does not add the referencia to the database.
	*
	* @param referenciaPK the primary key for the new referencia
	* @return the new referencia
	*/
	public com.hitss.layer.model.Referencia create(
		com.hitss.layer.service.persistence.ReferenciaPK referenciaPK);

	/**
	* Removes the referencia with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param referenciaPK the primary key of the referencia
	* @return the referencia that was removed
	* @throws com.hitss.layer.NoSuchReferenciaException if a referencia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Referencia remove(
		com.hitss.layer.service.persistence.ReferenciaPK referenciaPK)
		throws com.hitss.layer.NoSuchReferenciaException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.Referencia updateImpl(
		com.hitss.layer.model.Referencia referencia)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the referencia with the primary key or throws a {@link com.hitss.layer.NoSuchReferenciaException} if it could not be found.
	*
	* @param referenciaPK the primary key of the referencia
	* @return the referencia
	* @throws com.hitss.layer.NoSuchReferenciaException if a referencia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Referencia findByPrimaryKey(
		com.hitss.layer.service.persistence.ReferenciaPK referenciaPK)
		throws com.hitss.layer.NoSuchReferenciaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the referencia with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param referenciaPK the primary key of the referencia
	* @return the referencia, or <code>null</code> if a referencia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Referencia fetchByPrimaryKey(
		com.hitss.layer.service.persistence.ReferenciaPK referenciaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the referencias.
	*
	* @return the referencias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Referencia> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the referencias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ReferenciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of referencias
	* @param end the upper bound of the range of referencias (not inclusive)
	* @return the range of referencias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Referencia> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the referencias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ReferenciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of referencias
	* @param end the upper bound of the range of referencias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of referencias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Referencia> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the referencias from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of referencias.
	*
	* @return the number of referencias
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
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

import com.liferay.portal.service.persistence.BasePersistence;

import com.rec.hitss.layer.model.RequerimientoRecurso;

/**
 * The persistence interface for the requerimiento recurso service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see RequerimientoRecursoPersistenceImpl
 * @see RequerimientoRecursoUtil
 * @generated
 */
public interface RequerimientoRecursoPersistence extends BasePersistence<RequerimientoRecurso> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RequerimientoRecursoUtil} to access the requerimiento recurso persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the requerimiento recurso where solicitudRequerimientoPersonalId = &#63; or throws a {@link com.rec.hitss.layer.NoSuchRequerimientoRecursoException} if it could not be found.
	*
	* @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID
	* @return the matching requerimiento recurso
	* @throws com.rec.hitss.layer.NoSuchRequerimientoRecursoException if a matching requerimiento recurso could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.RequerimientoRecurso findByRequerimientoUnique(
		long solicitudRequerimientoPersonalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRequerimientoRecursoException;

	/**
	* Returns the requerimiento recurso where solicitudRequerimientoPersonalId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID
	* @return the matching requerimiento recurso, or <code>null</code> if a matching requerimiento recurso could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.RequerimientoRecurso fetchByRequerimientoUnique(
		long solicitudRequerimientoPersonalId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the requerimiento recurso where solicitudRequerimientoPersonalId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching requerimiento recurso, or <code>null</code> if a matching requerimiento recurso could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.RequerimientoRecurso fetchByRequerimientoUnique(
		long solicitudRequerimientoPersonalId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the requerimiento recurso where solicitudRequerimientoPersonalId = &#63; from the database.
	*
	* @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID
	* @return the requerimiento recurso that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.RequerimientoRecurso removeByRequerimientoUnique(
		long solicitudRequerimientoPersonalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRequerimientoRecursoException;

	/**
	* Returns the number of requerimiento recursos where solicitudRequerimientoPersonalId = &#63;.
	*
	* @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID
	* @return the number of matching requerimiento recursos
	* @throws SystemException if a system exception occurred
	*/
	public int countByRequerimientoUnique(long solicitudRequerimientoPersonalId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the requerimiento recurso in the entity cache if it is enabled.
	*
	* @param requerimientoRecurso the requerimiento recurso
	*/
	public void cacheResult(
		com.rec.hitss.layer.model.RequerimientoRecurso requerimientoRecurso);

	/**
	* Caches the requerimiento recursos in the entity cache if it is enabled.
	*
	* @param requerimientoRecursos the requerimiento recursos
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.RequerimientoRecurso> requerimientoRecursos);

	/**
	* Creates a new requerimiento recurso with the primary key. Does not add the requerimiento recurso to the database.
	*
	* @param requerimientoRecursoId the primary key for the new requerimiento recurso
	* @return the new requerimiento recurso
	*/
	public com.rec.hitss.layer.model.RequerimientoRecurso create(
		long requerimientoRecursoId);

	/**
	* Removes the requerimiento recurso with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param requerimientoRecursoId the primary key of the requerimiento recurso
	* @return the requerimiento recurso that was removed
	* @throws com.rec.hitss.layer.NoSuchRequerimientoRecursoException if a requerimiento recurso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.RequerimientoRecurso remove(
		long requerimientoRecursoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRequerimientoRecursoException;

	public com.rec.hitss.layer.model.RequerimientoRecurso updateImpl(
		com.rec.hitss.layer.model.RequerimientoRecurso requerimientoRecurso)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the requerimiento recurso with the primary key or throws a {@link com.rec.hitss.layer.NoSuchRequerimientoRecursoException} if it could not be found.
	*
	* @param requerimientoRecursoId the primary key of the requerimiento recurso
	* @return the requerimiento recurso
	* @throws com.rec.hitss.layer.NoSuchRequerimientoRecursoException if a requerimiento recurso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.RequerimientoRecurso findByPrimaryKey(
		long requerimientoRecursoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRequerimientoRecursoException;

	/**
	* Returns the requerimiento recurso with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param requerimientoRecursoId the primary key of the requerimiento recurso
	* @return the requerimiento recurso, or <code>null</code> if a requerimiento recurso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.RequerimientoRecurso fetchByPrimaryKey(
		long requerimientoRecursoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the requerimiento recursos.
	*
	* @return the requerimiento recursos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.RequerimientoRecurso> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the requerimiento recursos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.RequerimientoRecursoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of requerimiento recursos
	* @param end the upper bound of the range of requerimiento recursos (not inclusive)
	* @return the range of requerimiento recursos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.RequerimientoRecurso> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the requerimiento recursos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.RequerimientoRecursoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of requerimiento recursos
	* @param end the upper bound of the range of requerimiento recursos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of requerimiento recursos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.RequerimientoRecurso> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the requerimiento recursos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of requerimiento recursos.
	*
	* @return the number of requerimiento recursos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
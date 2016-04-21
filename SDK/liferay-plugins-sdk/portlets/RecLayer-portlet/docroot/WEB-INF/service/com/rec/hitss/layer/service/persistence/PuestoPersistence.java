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

import com.rec.hitss.layer.model.Puesto;

/**
 * The persistence interface for the puesto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see PuestoPersistenceImpl
 * @see PuestoUtil
 * @generated
 */
public interface PuestoPersistence extends BasePersistence<Puesto> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PuestoUtil} to access the puesto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the puestos where requerimientoRecursoId = &#63;.
	*
	* @param requerimientoRecursoId the requerimiento recurso ID
	* @return the matching puestos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Puesto> findByRequerimientoRecurso(
		long requerimientoRecursoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the puestos where requerimientoRecursoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PuestoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requerimientoRecursoId the requerimiento recurso ID
	* @param start the lower bound of the range of puestos
	* @param end the upper bound of the range of puestos (not inclusive)
	* @return the range of matching puestos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Puesto> findByRequerimientoRecurso(
		long requerimientoRecursoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the puestos where requerimientoRecursoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PuestoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requerimientoRecursoId the requerimiento recurso ID
	* @param start the lower bound of the range of puestos
	* @param end the upper bound of the range of puestos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching puestos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Puesto> findByRequerimientoRecurso(
		long requerimientoRecursoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first puesto in the ordered set where requerimientoRecursoId = &#63;.
	*
	* @param requerimientoRecursoId the requerimiento recurso ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching puesto
	* @throws com.rec.hitss.layer.NoSuchPuestoException if a matching puesto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Puesto findByRequerimientoRecurso_First(
		long requerimientoRecursoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchPuestoException;

	/**
	* Returns the first puesto in the ordered set where requerimientoRecursoId = &#63;.
	*
	* @param requerimientoRecursoId the requerimiento recurso ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching puesto, or <code>null</code> if a matching puesto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Puesto fetchByRequerimientoRecurso_First(
		long requerimientoRecursoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last puesto in the ordered set where requerimientoRecursoId = &#63;.
	*
	* @param requerimientoRecursoId the requerimiento recurso ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching puesto
	* @throws com.rec.hitss.layer.NoSuchPuestoException if a matching puesto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Puesto findByRequerimientoRecurso_Last(
		long requerimientoRecursoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchPuestoException;

	/**
	* Returns the last puesto in the ordered set where requerimientoRecursoId = &#63;.
	*
	* @param requerimientoRecursoId the requerimiento recurso ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching puesto, or <code>null</code> if a matching puesto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Puesto fetchByRequerimientoRecurso_Last(
		long requerimientoRecursoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the puestos before and after the current puesto in the ordered set where requerimientoRecursoId = &#63;.
	*
	* @param puestoId the primary key of the current puesto
	* @param requerimientoRecursoId the requerimiento recurso ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next puesto
	* @throws com.rec.hitss.layer.NoSuchPuestoException if a puesto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Puesto[] findByRequerimientoRecurso_PrevAndNext(
		long puestoId, long requerimientoRecursoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchPuestoException;

	/**
	* Removes all the puestos where requerimientoRecursoId = &#63; from the database.
	*
	* @param requerimientoRecursoId the requerimiento recurso ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRequerimientoRecurso(long requerimientoRecursoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of puestos where requerimientoRecursoId = &#63;.
	*
	* @param requerimientoRecursoId the requerimiento recurso ID
	* @return the number of matching puestos
	* @throws SystemException if a system exception occurred
	*/
	public int countByRequerimientoRecurso(long requerimientoRecursoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the puesto in the entity cache if it is enabled.
	*
	* @param puesto the puesto
	*/
	public void cacheResult(com.rec.hitss.layer.model.Puesto puesto);

	/**
	* Caches the puestos in the entity cache if it is enabled.
	*
	* @param puestos the puestos
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.Puesto> puestos);

	/**
	* Creates a new puesto with the primary key. Does not add the puesto to the database.
	*
	* @param puestoId the primary key for the new puesto
	* @return the new puesto
	*/
	public com.rec.hitss.layer.model.Puesto create(long puestoId);

	/**
	* Removes the puesto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param puestoId the primary key of the puesto
	* @return the puesto that was removed
	* @throws com.rec.hitss.layer.NoSuchPuestoException if a puesto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Puesto remove(long puestoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchPuestoException;

	public com.rec.hitss.layer.model.Puesto updateImpl(
		com.rec.hitss.layer.model.Puesto puesto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the puesto with the primary key or throws a {@link com.rec.hitss.layer.NoSuchPuestoException} if it could not be found.
	*
	* @param puestoId the primary key of the puesto
	* @return the puesto
	* @throws com.rec.hitss.layer.NoSuchPuestoException if a puesto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Puesto findByPrimaryKey(long puestoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchPuestoException;

	/**
	* Returns the puesto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param puestoId the primary key of the puesto
	* @return the puesto, or <code>null</code> if a puesto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Puesto fetchByPrimaryKey(long puestoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the puestos.
	*
	* @return the puestos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Puesto> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the puestos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PuestoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of puestos
	* @param end the upper bound of the range of puestos (not inclusive)
	* @return the range of puestos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Puesto> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the puestos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PuestoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of puestos
	* @param end the upper bound of the range of puestos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of puestos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Puesto> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the puestos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of puestos.
	*
	* @return the number of puestos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.rec.hitss.layer.model.RequerimientoRecurso;

import java.util.List;

/**
 * The persistence utility for the requerimiento recurso service. This utility wraps {@link RequerimientoRecursoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see RequerimientoRecursoPersistence
 * @see RequerimientoRecursoPersistenceImpl
 * @generated
 */
public class RequerimientoRecursoUtil {
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
	public static void clearCache(RequerimientoRecurso requerimientoRecurso) {
		getPersistence().clearCache(requerimientoRecurso);
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
	public static List<RequerimientoRecurso> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RequerimientoRecurso> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RequerimientoRecurso> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static RequerimientoRecurso update(
		RequerimientoRecurso requerimientoRecurso) throws SystemException {
		return getPersistence().update(requerimientoRecurso);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static RequerimientoRecurso update(
		RequerimientoRecurso requerimientoRecurso, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(requerimientoRecurso, serviceContext);
	}

	/**
	* Returns the requerimiento recurso where solicitudRequerimientoPersonalId = &#63; or throws a {@link com.rec.hitss.layer.NoSuchRequerimientoRecursoException} if it could not be found.
	*
	* @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID
	* @return the matching requerimiento recurso
	* @throws com.rec.hitss.layer.NoSuchRequerimientoRecursoException if a matching requerimiento recurso could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.RequerimientoRecurso findByRequerimientoUnique(
		long solicitudRequerimientoPersonalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRequerimientoRecursoException {
		return getPersistence()
				   .findByRequerimientoUnique(solicitudRequerimientoPersonalId);
	}

	/**
	* Returns the requerimiento recurso where solicitudRequerimientoPersonalId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID
	* @return the matching requerimiento recurso, or <code>null</code> if a matching requerimiento recurso could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.RequerimientoRecurso fetchByRequerimientoUnique(
		long solicitudRequerimientoPersonalId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequerimientoUnique(solicitudRequerimientoPersonalId);
	}

	/**
	* Returns the requerimiento recurso where solicitudRequerimientoPersonalId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching requerimiento recurso, or <code>null</code> if a matching requerimiento recurso could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.RequerimientoRecurso fetchByRequerimientoUnique(
		long solicitudRequerimientoPersonalId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequerimientoUnique(solicitudRequerimientoPersonalId,
			retrieveFromCache);
	}

	/**
	* Removes the requerimiento recurso where solicitudRequerimientoPersonalId = &#63; from the database.
	*
	* @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID
	* @return the requerimiento recurso that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.RequerimientoRecurso removeByRequerimientoUnique(
		long solicitudRequerimientoPersonalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRequerimientoRecursoException {
		return getPersistence()
				   .removeByRequerimientoUnique(solicitudRequerimientoPersonalId);
	}

	/**
	* Returns the number of requerimiento recursos where solicitudRequerimientoPersonalId = &#63;.
	*
	* @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID
	* @return the number of matching requerimiento recursos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRequerimientoUnique(
		long solicitudRequerimientoPersonalId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByRequerimientoUnique(solicitudRequerimientoPersonalId);
	}

	/**
	* Caches the requerimiento recurso in the entity cache if it is enabled.
	*
	* @param requerimientoRecurso the requerimiento recurso
	*/
	public static void cacheResult(
		com.rec.hitss.layer.model.RequerimientoRecurso requerimientoRecurso) {
		getPersistence().cacheResult(requerimientoRecurso);
	}

	/**
	* Caches the requerimiento recursos in the entity cache if it is enabled.
	*
	* @param requerimientoRecursos the requerimiento recursos
	*/
	public static void cacheResult(
		java.util.List<com.rec.hitss.layer.model.RequerimientoRecurso> requerimientoRecursos) {
		getPersistence().cacheResult(requerimientoRecursos);
	}

	/**
	* Creates a new requerimiento recurso with the primary key. Does not add the requerimiento recurso to the database.
	*
	* @param requerimientoRecursoId the primary key for the new requerimiento recurso
	* @return the new requerimiento recurso
	*/
	public static com.rec.hitss.layer.model.RequerimientoRecurso create(
		long requerimientoRecursoId) {
		return getPersistence().create(requerimientoRecursoId);
	}

	/**
	* Removes the requerimiento recurso with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param requerimientoRecursoId the primary key of the requerimiento recurso
	* @return the requerimiento recurso that was removed
	* @throws com.rec.hitss.layer.NoSuchRequerimientoRecursoException if a requerimiento recurso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.RequerimientoRecurso remove(
		long requerimientoRecursoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRequerimientoRecursoException {
		return getPersistence().remove(requerimientoRecursoId);
	}

	public static com.rec.hitss.layer.model.RequerimientoRecurso updateImpl(
		com.rec.hitss.layer.model.RequerimientoRecurso requerimientoRecurso)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(requerimientoRecurso);
	}

	/**
	* Returns the requerimiento recurso with the primary key or throws a {@link com.rec.hitss.layer.NoSuchRequerimientoRecursoException} if it could not be found.
	*
	* @param requerimientoRecursoId the primary key of the requerimiento recurso
	* @return the requerimiento recurso
	* @throws com.rec.hitss.layer.NoSuchRequerimientoRecursoException if a requerimiento recurso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.RequerimientoRecurso findByPrimaryKey(
		long requerimientoRecursoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRequerimientoRecursoException {
		return getPersistence().findByPrimaryKey(requerimientoRecursoId);
	}

	/**
	* Returns the requerimiento recurso with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param requerimientoRecursoId the primary key of the requerimiento recurso
	* @return the requerimiento recurso, or <code>null</code> if a requerimiento recurso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.RequerimientoRecurso fetchByPrimaryKey(
		long requerimientoRecursoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(requerimientoRecursoId);
	}

	/**
	* Returns all the requerimiento recursos.
	*
	* @return the requerimiento recursos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.RequerimientoRecurso> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.rec.hitss.layer.model.RequerimientoRecurso> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.rec.hitss.layer.model.RequerimientoRecurso> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the requerimiento recursos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of requerimiento recursos.
	*
	* @return the number of requerimiento recursos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RequerimientoRecursoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RequerimientoRecursoPersistence)PortletBeanLocatorUtil.locate(com.rec.hitss.layer.service.ClpSerializer.getServletContextName(),
					RequerimientoRecursoPersistence.class.getName());

			ReferenceRegistry.registerReference(RequerimientoRecursoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(RequerimientoRecursoPersistence persistence) {
	}

	private static RequerimientoRecursoPersistence _persistence;
}
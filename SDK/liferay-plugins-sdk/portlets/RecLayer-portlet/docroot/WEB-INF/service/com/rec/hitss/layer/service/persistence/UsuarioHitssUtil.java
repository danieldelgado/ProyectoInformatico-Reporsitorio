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

import com.rec.hitss.layer.model.UsuarioHitss;

import java.util.List;

/**
 * The persistence utility for the usuario hitss service. This utility wraps {@link UsuarioHitssPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see UsuarioHitssPersistence
 * @see UsuarioHitssPersistenceImpl
 * @generated
 */
public class UsuarioHitssUtil {
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
	public static void clearCache(UsuarioHitss usuarioHitss) {
		getPersistence().clearCache(usuarioHitss);
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
	public static List<UsuarioHitss> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UsuarioHitss> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UsuarioHitss> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static UsuarioHitss update(UsuarioHitss usuarioHitss)
		throws SystemException {
		return getPersistence().update(usuarioHitss);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static UsuarioHitss update(UsuarioHitss usuarioHitss,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(usuarioHitss, serviceContext);
	}

	/**
	* Caches the usuario hitss in the entity cache if it is enabled.
	*
	* @param usuarioHitss the usuario hitss
	*/
	public static void cacheResult(
		com.rec.hitss.layer.model.UsuarioHitss usuarioHitss) {
		getPersistence().cacheResult(usuarioHitss);
	}

	/**
	* Caches the usuario hitsses in the entity cache if it is enabled.
	*
	* @param usuarioHitsses the usuario hitsses
	*/
	public static void cacheResult(
		java.util.List<com.rec.hitss.layer.model.UsuarioHitss> usuarioHitsses) {
		getPersistence().cacheResult(usuarioHitsses);
	}

	/**
	* Creates a new usuario hitss with the primary key. Does not add the usuario hitss to the database.
	*
	* @param usuarioHitssId the primary key for the new usuario hitss
	* @return the new usuario hitss
	*/
	public static com.rec.hitss.layer.model.UsuarioHitss create(
		long usuarioHitssId) {
		return getPersistence().create(usuarioHitssId);
	}

	/**
	* Removes the usuario hitss with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param usuarioHitssId the primary key of the usuario hitss
	* @return the usuario hitss that was removed
	* @throws com.rec.hitss.layer.NoSuchUsuarioHitssException if a usuario hitss with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.UsuarioHitss remove(
		long usuarioHitssId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchUsuarioHitssException {
		return getPersistence().remove(usuarioHitssId);
	}

	public static com.rec.hitss.layer.model.UsuarioHitss updateImpl(
		com.rec.hitss.layer.model.UsuarioHitss usuarioHitss)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(usuarioHitss);
	}

	/**
	* Returns the usuario hitss with the primary key or throws a {@link com.rec.hitss.layer.NoSuchUsuarioHitssException} if it could not be found.
	*
	* @param usuarioHitssId the primary key of the usuario hitss
	* @return the usuario hitss
	* @throws com.rec.hitss.layer.NoSuchUsuarioHitssException if a usuario hitss with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.UsuarioHitss findByPrimaryKey(
		long usuarioHitssId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchUsuarioHitssException {
		return getPersistence().findByPrimaryKey(usuarioHitssId);
	}

	/**
	* Returns the usuario hitss with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param usuarioHitssId the primary key of the usuario hitss
	* @return the usuario hitss, or <code>null</code> if a usuario hitss with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.UsuarioHitss fetchByPrimaryKey(
		long usuarioHitssId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(usuarioHitssId);
	}

	/**
	* Returns all the usuario hitsses.
	*
	* @return the usuario hitsses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.UsuarioHitss> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the usuario hitsses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.UsuarioHitssModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuario hitsses
	* @param end the upper bound of the range of usuario hitsses (not inclusive)
	* @return the range of usuario hitsses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.UsuarioHitss> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the usuario hitsses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.UsuarioHitssModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuario hitsses
	* @param end the upper bound of the range of usuario hitsses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of usuario hitsses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.UsuarioHitss> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the usuario hitsses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of usuario hitsses.
	*
	* @return the number of usuario hitsses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UsuarioHitssPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UsuarioHitssPersistence)PortletBeanLocatorUtil.locate(com.rec.hitss.layer.service.ClpSerializer.getServletContextName(),
					UsuarioHitssPersistence.class.getName());

			ReferenceRegistry.registerReference(UsuarioHitssUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(UsuarioHitssPersistence persistence) {
	}

	private static UsuarioHitssPersistence _persistence;
}
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

import com.rec.hitss.layer.model.Etiqueta;

import java.util.List;

/**
 * The persistence utility for the etiqueta service. This utility wraps {@link EtiquetaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see EtiquetaPersistence
 * @see EtiquetaPersistenceImpl
 * @generated
 */
public class EtiquetaUtil {
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
	public static void clearCache(Etiqueta etiqueta) {
		getPersistence().clearCache(etiqueta);
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
	public static List<Etiqueta> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Etiqueta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Etiqueta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Etiqueta update(Etiqueta etiqueta) throws SystemException {
		return getPersistence().update(etiqueta);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Etiqueta update(Etiqueta etiqueta,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(etiqueta, serviceContext);
	}

	/**
	* Caches the etiqueta in the entity cache if it is enabled.
	*
	* @param etiqueta the etiqueta
	*/
	public static void cacheResult(com.rec.hitss.layer.model.Etiqueta etiqueta) {
		getPersistence().cacheResult(etiqueta);
	}

	/**
	* Caches the etiquetas in the entity cache if it is enabled.
	*
	* @param etiquetas the etiquetas
	*/
	public static void cacheResult(
		java.util.List<com.rec.hitss.layer.model.Etiqueta> etiquetas) {
		getPersistence().cacheResult(etiquetas);
	}

	/**
	* Creates a new etiqueta with the primary key. Does not add the etiqueta to the database.
	*
	* @param etiquetaId the primary key for the new etiqueta
	* @return the new etiqueta
	*/
	public static com.rec.hitss.layer.model.Etiqueta create(long etiquetaId) {
		return getPersistence().create(etiquetaId);
	}

	/**
	* Removes the etiqueta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param etiquetaId the primary key of the etiqueta
	* @return the etiqueta that was removed
	* @throws com.rec.hitss.layer.NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.Etiqueta remove(long etiquetaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchEtiquetaException {
		return getPersistence().remove(etiquetaId);
	}

	public static com.rec.hitss.layer.model.Etiqueta updateImpl(
		com.rec.hitss.layer.model.Etiqueta etiqueta)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(etiqueta);
	}

	/**
	* Returns the etiqueta with the primary key or throws a {@link com.rec.hitss.layer.NoSuchEtiquetaException} if it could not be found.
	*
	* @param etiquetaId the primary key of the etiqueta
	* @return the etiqueta
	* @throws com.rec.hitss.layer.NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.Etiqueta findByPrimaryKey(
		long etiquetaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchEtiquetaException {
		return getPersistence().findByPrimaryKey(etiquetaId);
	}

	/**
	* Returns the etiqueta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param etiquetaId the primary key of the etiqueta
	* @return the etiqueta, or <code>null</code> if a etiqueta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.Etiqueta fetchByPrimaryKey(
		long etiquetaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(etiquetaId);
	}

	/**
	* Returns all the etiquetas.
	*
	* @return the etiquetas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.Etiqueta> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the etiquetas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EtiquetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of etiquetas
	* @param end the upper bound of the range of etiquetas (not inclusive)
	* @return the range of etiquetas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.Etiqueta> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the etiquetas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EtiquetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of etiquetas
	* @param end the upper bound of the range of etiquetas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of etiquetas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.Etiqueta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the etiquetas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of etiquetas.
	*
	* @return the number of etiquetas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EtiquetaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EtiquetaPersistence)PortletBeanLocatorUtil.locate(com.rec.hitss.layer.service.ClpSerializer.getServletContextName(),
					EtiquetaPersistence.class.getName());

			ReferenceRegistry.registerReference(EtiquetaUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EtiquetaPersistence persistence) {
	}

	private static EtiquetaPersistence _persistence;
}
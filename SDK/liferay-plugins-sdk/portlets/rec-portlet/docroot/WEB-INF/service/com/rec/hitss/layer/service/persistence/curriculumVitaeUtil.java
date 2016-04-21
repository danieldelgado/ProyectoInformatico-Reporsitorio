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

import com.rec.hitss.layer.model.curriculumVitae;

import java.util.List;

/**
 * The persistence utility for the curriculum vitae service. This utility wraps {@link curriculumVitaePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see curriculumVitaePersistence
 * @see curriculumVitaePersistenceImpl
 * @generated
 */
public class curriculumVitaeUtil {
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
	public static void clearCache(curriculumVitae curriculumVitae) {
		getPersistence().clearCache(curriculumVitae);
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
	public static List<curriculumVitae> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<curriculumVitae> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<curriculumVitae> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static curriculumVitae update(curriculumVitae curriculumVitae)
		throws SystemException {
		return getPersistence().update(curriculumVitae);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static curriculumVitae update(curriculumVitae curriculumVitae,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(curriculumVitae, serviceContext);
	}

	/**
	* Caches the curriculum vitae in the entity cache if it is enabled.
	*
	* @param curriculumVitae the curriculum vitae
	*/
	public static void cacheResult(
		com.rec.hitss.layer.model.curriculumVitae curriculumVitae) {
		getPersistence().cacheResult(curriculumVitae);
	}

	/**
	* Caches the curriculum vitaes in the entity cache if it is enabled.
	*
	* @param curriculumVitaes the curriculum vitaes
	*/
	public static void cacheResult(
		java.util.List<com.rec.hitss.layer.model.curriculumVitae> curriculumVitaes) {
		getPersistence().cacheResult(curriculumVitaes);
	}

	/**
	* Creates a new curriculum vitae with the primary key. Does not add the curriculum vitae to the database.
	*
	* @param CV_ID the primary key for the new curriculum vitae
	* @return the new curriculum vitae
	*/
	public static com.rec.hitss.layer.model.curriculumVitae create(long CV_ID) {
		return getPersistence().create(CV_ID);
	}

	/**
	* Removes the curriculum vitae with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CV_ID the primary key of the curriculum vitae
	* @return the curriculum vitae that was removed
	* @throws com.rec.hitss.layer.NoSuchcurriculumVitaeException if a curriculum vitae with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.curriculumVitae remove(long CV_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchcurriculumVitaeException {
		return getPersistence().remove(CV_ID);
	}

	public static com.rec.hitss.layer.model.curriculumVitae updateImpl(
		com.rec.hitss.layer.model.curriculumVitae curriculumVitae)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(curriculumVitae);
	}

	/**
	* Returns the curriculum vitae with the primary key or throws a {@link com.rec.hitss.layer.NoSuchcurriculumVitaeException} if it could not be found.
	*
	* @param CV_ID the primary key of the curriculum vitae
	* @return the curriculum vitae
	* @throws com.rec.hitss.layer.NoSuchcurriculumVitaeException if a curriculum vitae with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.curriculumVitae findByPrimaryKey(
		long CV_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchcurriculumVitaeException {
		return getPersistence().findByPrimaryKey(CV_ID);
	}

	/**
	* Returns the curriculum vitae with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CV_ID the primary key of the curriculum vitae
	* @return the curriculum vitae, or <code>null</code> if a curriculum vitae with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.curriculumVitae fetchByPrimaryKey(
		long CV_ID) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(CV_ID);
	}

	/**
	* Returns all the curriculum vitaes.
	*
	* @return the curriculum vitaes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.curriculumVitae> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the curriculum vitaes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.curriculumVitaeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of curriculum vitaes
	* @param end the upper bound of the range of curriculum vitaes (not inclusive)
	* @return the range of curriculum vitaes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.curriculumVitae> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the curriculum vitaes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.curriculumVitaeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of curriculum vitaes
	* @param end the upper bound of the range of curriculum vitaes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of curriculum vitaes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.curriculumVitae> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the curriculum vitaes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of curriculum vitaes.
	*
	* @return the number of curriculum vitaes
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static curriculumVitaePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (curriculumVitaePersistence)PortletBeanLocatorUtil.locate(com.rec.hitss.layer.service.ClpSerializer.getServletContextName(),
					curriculumVitaePersistence.class.getName());

			ReferenceRegistry.registerReference(curriculumVitaeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(curriculumVitaePersistence persistence) {
	}

	private static curriculumVitaePersistence _persistence;
}
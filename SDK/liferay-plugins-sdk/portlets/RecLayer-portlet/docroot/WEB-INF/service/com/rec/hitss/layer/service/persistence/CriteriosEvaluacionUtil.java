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

import com.rec.hitss.layer.model.CriteriosEvaluacion;

import java.util.List;

/**
 * The persistence utility for the criterios evaluacion service. This utility wraps {@link CriteriosEvaluacionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see CriteriosEvaluacionPersistence
 * @see CriteriosEvaluacionPersistenceImpl
 * @generated
 */
public class CriteriosEvaluacionUtil {
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
	public static void clearCache(CriteriosEvaluacion criteriosEvaluacion) {
		getPersistence().clearCache(criteriosEvaluacion);
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
	public static List<CriteriosEvaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CriteriosEvaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CriteriosEvaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CriteriosEvaluacion update(
		CriteriosEvaluacion criteriosEvaluacion) throws SystemException {
		return getPersistence().update(criteriosEvaluacion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CriteriosEvaluacion update(
		CriteriosEvaluacion criteriosEvaluacion, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(criteriosEvaluacion, serviceContext);
	}

	/**
	* Caches the criterios evaluacion in the entity cache if it is enabled.
	*
	* @param criteriosEvaluacion the criterios evaluacion
	*/
	public static void cacheResult(
		com.rec.hitss.layer.model.CriteriosEvaluacion criteriosEvaluacion) {
		getPersistence().cacheResult(criteriosEvaluacion);
	}

	/**
	* Caches the criterios evaluacions in the entity cache if it is enabled.
	*
	* @param criteriosEvaluacions the criterios evaluacions
	*/
	public static void cacheResult(
		java.util.List<com.rec.hitss.layer.model.CriteriosEvaluacion> criteriosEvaluacions) {
		getPersistence().cacheResult(criteriosEvaluacions);
	}

	/**
	* Creates a new criterios evaluacion with the primary key. Does not add the criterios evaluacion to the database.
	*
	* @param criteriosEvaluacionId the primary key for the new criterios evaluacion
	* @return the new criterios evaluacion
	*/
	public static com.rec.hitss.layer.model.CriteriosEvaluacion create(
		long criteriosEvaluacionId) {
		return getPersistence().create(criteriosEvaluacionId);
	}

	/**
	* Removes the criterios evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param criteriosEvaluacionId the primary key of the criterios evaluacion
	* @return the criterios evaluacion that was removed
	* @throws com.rec.hitss.layer.NoSuchCriteriosEvaluacionException if a criterios evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.CriteriosEvaluacion remove(
		long criteriosEvaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchCriteriosEvaluacionException {
		return getPersistence().remove(criteriosEvaluacionId);
	}

	public static com.rec.hitss.layer.model.CriteriosEvaluacion updateImpl(
		com.rec.hitss.layer.model.CriteriosEvaluacion criteriosEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(criteriosEvaluacion);
	}

	/**
	* Returns the criterios evaluacion with the primary key or throws a {@link com.rec.hitss.layer.NoSuchCriteriosEvaluacionException} if it could not be found.
	*
	* @param criteriosEvaluacionId the primary key of the criterios evaluacion
	* @return the criterios evaluacion
	* @throws com.rec.hitss.layer.NoSuchCriteriosEvaluacionException if a criterios evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.CriteriosEvaluacion findByPrimaryKey(
		long criteriosEvaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchCriteriosEvaluacionException {
		return getPersistence().findByPrimaryKey(criteriosEvaluacionId);
	}

	/**
	* Returns the criterios evaluacion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param criteriosEvaluacionId the primary key of the criterios evaluacion
	* @return the criterios evaluacion, or <code>null</code> if a criterios evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.CriteriosEvaluacion fetchByPrimaryKey(
		long criteriosEvaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(criteriosEvaluacionId);
	}

	/**
	* Returns all the criterios evaluacions.
	*
	* @return the criterios evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.CriteriosEvaluacion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the criterios evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.CriteriosEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criterios evaluacions
	* @param end the upper bound of the range of criterios evaluacions (not inclusive)
	* @return the range of criterios evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.CriteriosEvaluacion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the criterios evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.CriteriosEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criterios evaluacions
	* @param end the upper bound of the range of criterios evaluacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of criterios evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.CriteriosEvaluacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the criterios evaluacions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of criterios evaluacions.
	*
	* @return the number of criterios evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CriteriosEvaluacionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CriteriosEvaluacionPersistence)PortletBeanLocatorUtil.locate(com.rec.hitss.layer.service.ClpSerializer.getServletContextName(),
					CriteriosEvaluacionPersistence.class.getName());

			ReferenceRegistry.registerReference(CriteriosEvaluacionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CriteriosEvaluacionPersistence persistence) {
	}

	private static CriteriosEvaluacionPersistence _persistence;
}
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

import com.hitss.layer.model.Cronograma;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the cronograma service. This utility wraps {@link CronogramaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see CronogramaPersistence
 * @see CronogramaPersistenceImpl
 * @generated
 */
public class CronogramaUtil {
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
	public static void clearCache(Cronograma cronograma) {
		getPersistence().clearCache(cronograma);
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
	public static List<Cronograma> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Cronograma> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Cronograma> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Cronograma update(Cronograma cronograma)
		throws SystemException {
		return getPersistence().update(cronograma);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Cronograma update(Cronograma cronograma,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(cronograma, serviceContext);
	}

	/**
	* Returns the cronograma where solicitudEvaluacionDesempennoId = &#63; or throws a {@link com.hitss.layer.NoSuchCronogramaException} if it could not be found.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @return the matching cronograma
	* @throws com.hitss.layer.NoSuchCronogramaException if a matching cronograma could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Cronograma findByS(
		long solicitudEvaluacionDesempennoId)
		throws com.hitss.layer.NoSuchCronogramaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS(solicitudEvaluacionDesempennoId);
	}

	/**
	* Returns the cronograma where solicitudEvaluacionDesempennoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @return the matching cronograma, or <code>null</code> if a matching cronograma could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Cronograma fetchByS(
		long solicitudEvaluacionDesempennoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByS(solicitudEvaluacionDesempennoId);
	}

	/**
	* Returns the cronograma where solicitudEvaluacionDesempennoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching cronograma, or <code>null</code> if a matching cronograma could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Cronograma fetchByS(
		long solicitudEvaluacionDesempennoId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS(solicitudEvaluacionDesempennoId, retrieveFromCache);
	}

	/**
	* Removes the cronograma where solicitudEvaluacionDesempennoId = &#63; from the database.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @return the cronograma that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Cronograma removeByS(
		long solicitudEvaluacionDesempennoId)
		throws com.hitss.layer.NoSuchCronogramaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByS(solicitudEvaluacionDesempennoId);
	}

	/**
	* Returns the number of cronogramas where solicitudEvaluacionDesempennoId = &#63;.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @return the number of matching cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS(long solicitudEvaluacionDesempennoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS(solicitudEvaluacionDesempennoId);
	}

	/**
	* Caches the cronograma in the entity cache if it is enabled.
	*
	* @param cronograma the cronograma
	*/
	public static void cacheResult(com.hitss.layer.model.Cronograma cronograma) {
		getPersistence().cacheResult(cronograma);
	}

	/**
	* Caches the cronogramas in the entity cache if it is enabled.
	*
	* @param cronogramas the cronogramas
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.Cronograma> cronogramas) {
		getPersistence().cacheResult(cronogramas);
	}

	/**
	* Creates a new cronograma with the primary key. Does not add the cronograma to the database.
	*
	* @param cronogramaId the primary key for the new cronograma
	* @return the new cronograma
	*/
	public static com.hitss.layer.model.Cronograma create(long cronogramaId) {
		return getPersistence().create(cronogramaId);
	}

	/**
	* Removes the cronograma with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cronogramaId the primary key of the cronograma
	* @return the cronograma that was removed
	* @throws com.hitss.layer.NoSuchCronogramaException if a cronograma with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Cronograma remove(long cronogramaId)
		throws com.hitss.layer.NoSuchCronogramaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(cronogramaId);
	}

	public static com.hitss.layer.model.Cronograma updateImpl(
		com.hitss.layer.model.Cronograma cronograma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(cronograma);
	}

	/**
	* Returns the cronograma with the primary key or throws a {@link com.hitss.layer.NoSuchCronogramaException} if it could not be found.
	*
	* @param cronogramaId the primary key of the cronograma
	* @return the cronograma
	* @throws com.hitss.layer.NoSuchCronogramaException if a cronograma with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Cronograma findByPrimaryKey(
		long cronogramaId)
		throws com.hitss.layer.NoSuchCronogramaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(cronogramaId);
	}

	/**
	* Returns the cronograma with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cronogramaId the primary key of the cronograma
	* @return the cronograma, or <code>null</code> if a cronograma with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Cronograma fetchByPrimaryKey(
		long cronogramaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(cronogramaId);
	}

	/**
	* Returns all the cronogramas.
	*
	* @return the cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Cronograma> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the cronogramas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.CronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cronogramas
	* @param end the upper bound of the range of cronogramas (not inclusive)
	* @return the range of cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Cronograma> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the cronogramas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.CronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cronogramas
	* @param end the upper bound of the range of cronogramas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Cronograma> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the cronogramas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of cronogramas.
	*
	* @return the number of cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CronogramaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CronogramaPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					CronogramaPersistence.class.getName());

			ReferenceRegistry.registerReference(CronogramaUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CronogramaPersistence persistence) {
	}

	private static CronogramaPersistence _persistence;
}
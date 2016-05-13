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

import com.hitss.layer.model.InformeRetroalimentacion;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the informe retroalimentacion service. This utility wraps {@link InformeRetroalimentacionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see InformeRetroalimentacionPersistence
 * @see InformeRetroalimentacionPersistenceImpl
 * @generated
 */
public class InformeRetroalimentacionUtil {
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
	public static void clearCache(
		InformeRetroalimentacion informeRetroalimentacion) {
		getPersistence().clearCache(informeRetroalimentacion);
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
	public static List<InformeRetroalimentacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<InformeRetroalimentacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<InformeRetroalimentacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static InformeRetroalimentacion update(
		InformeRetroalimentacion informeRetroalimentacion)
		throws SystemException {
		return getPersistence().update(informeRetroalimentacion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static InformeRetroalimentacion update(
		InformeRetroalimentacion informeRetroalimentacion,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(informeRetroalimentacion, serviceContext);
	}

	/**
	* Caches the informe retroalimentacion in the entity cache if it is enabled.
	*
	* @param informeRetroalimentacion the informe retroalimentacion
	*/
	public static void cacheResult(
		com.hitss.layer.model.InformeRetroalimentacion informeRetroalimentacion) {
		getPersistence().cacheResult(informeRetroalimentacion);
	}

	/**
	* Caches the informe retroalimentacions in the entity cache if it is enabled.
	*
	* @param informeRetroalimentacions the informe retroalimentacions
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.InformeRetroalimentacion> informeRetroalimentacions) {
		getPersistence().cacheResult(informeRetroalimentacions);
	}

	/**
	* Creates a new informe retroalimentacion with the primary key. Does not add the informe retroalimentacion to the database.
	*
	* @param informeRetroalimentacionId the primary key for the new informe retroalimentacion
	* @return the new informe retroalimentacion
	*/
	public static com.hitss.layer.model.InformeRetroalimentacion create(
		long informeRetroalimentacionId) {
		return getPersistence().create(informeRetroalimentacionId);
	}

	/**
	* Removes the informe retroalimentacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param informeRetroalimentacionId the primary key of the informe retroalimentacion
	* @return the informe retroalimentacion that was removed
	* @throws com.hitss.layer.NoSuchInformeRetroalimentacionException if a informe retroalimentacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.InformeRetroalimentacion remove(
		long informeRetroalimentacionId)
		throws com.hitss.layer.NoSuchInformeRetroalimentacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(informeRetroalimentacionId);
	}

	public static com.hitss.layer.model.InformeRetroalimentacion updateImpl(
		com.hitss.layer.model.InformeRetroalimentacion informeRetroalimentacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(informeRetroalimentacion);
	}

	/**
	* Returns the informe retroalimentacion with the primary key or throws a {@link com.hitss.layer.NoSuchInformeRetroalimentacionException} if it could not be found.
	*
	* @param informeRetroalimentacionId the primary key of the informe retroalimentacion
	* @return the informe retroalimentacion
	* @throws com.hitss.layer.NoSuchInformeRetroalimentacionException if a informe retroalimentacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.InformeRetroalimentacion findByPrimaryKey(
		long informeRetroalimentacionId)
		throws com.hitss.layer.NoSuchInformeRetroalimentacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(informeRetroalimentacionId);
	}

	/**
	* Returns the informe retroalimentacion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param informeRetroalimentacionId the primary key of the informe retroalimentacion
	* @return the informe retroalimentacion, or <code>null</code> if a informe retroalimentacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.InformeRetroalimentacion fetchByPrimaryKey(
		long informeRetroalimentacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(informeRetroalimentacionId);
	}

	/**
	* Returns all the informe retroalimentacions.
	*
	* @return the informe retroalimentacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.InformeRetroalimentacion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the informe retroalimentacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.InformeRetroalimentacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of informe retroalimentacions
	* @param end the upper bound of the range of informe retroalimentacions (not inclusive)
	* @return the range of informe retroalimentacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.InformeRetroalimentacion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the informe retroalimentacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.InformeRetroalimentacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of informe retroalimentacions
	* @param end the upper bound of the range of informe retroalimentacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of informe retroalimentacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.InformeRetroalimentacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the informe retroalimentacions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of informe retroalimentacions.
	*
	* @return the number of informe retroalimentacions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static InformeRetroalimentacionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (InformeRetroalimentacionPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					InformeRetroalimentacionPersistence.class.getName());

			ReferenceRegistry.registerReference(InformeRetroalimentacionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(InformeRetroalimentacionPersistence persistence) {
	}

	private static InformeRetroalimentacionPersistence _persistence;
}
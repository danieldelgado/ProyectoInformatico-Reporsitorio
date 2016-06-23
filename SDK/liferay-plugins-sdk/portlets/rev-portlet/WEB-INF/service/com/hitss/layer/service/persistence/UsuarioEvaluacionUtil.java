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

import com.hitss.layer.model.UsuarioEvaluacion;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the usuario evaluacion service. This utility wraps {@link UsuarioEvaluacionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see UsuarioEvaluacionPersistence
 * @see UsuarioEvaluacionPersistenceImpl
 * @generated
 */
public class UsuarioEvaluacionUtil {
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
	public static void clearCache(UsuarioEvaluacion usuarioEvaluacion) {
		getPersistence().clearCache(usuarioEvaluacion);
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
	public static List<UsuarioEvaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UsuarioEvaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UsuarioEvaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static UsuarioEvaluacion update(UsuarioEvaluacion usuarioEvaluacion)
		throws SystemException {
		return getPersistence().update(usuarioEvaluacion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static UsuarioEvaluacion update(
		UsuarioEvaluacion usuarioEvaluacion, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(usuarioEvaluacion, serviceContext);
	}

	/**
	* Caches the usuario evaluacion in the entity cache if it is enabled.
	*
	* @param usuarioEvaluacion the usuario evaluacion
	*/
	public static void cacheResult(
		com.hitss.layer.model.UsuarioEvaluacion usuarioEvaluacion) {
		getPersistence().cacheResult(usuarioEvaluacion);
	}

	/**
	* Caches the usuario evaluacions in the entity cache if it is enabled.
	*
	* @param usuarioEvaluacions the usuario evaluacions
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.UsuarioEvaluacion> usuarioEvaluacions) {
		getPersistence().cacheResult(usuarioEvaluacions);
	}

	/**
	* Creates a new usuario evaluacion with the primary key. Does not add the usuario evaluacion to the database.
	*
	* @param usuarioEvaluacionPK the primary key for the new usuario evaluacion
	* @return the new usuario evaluacion
	*/
	public static com.hitss.layer.model.UsuarioEvaluacion create(
		com.hitss.layer.service.persistence.UsuarioEvaluacionPK usuarioEvaluacionPK) {
		return getPersistence().create(usuarioEvaluacionPK);
	}

	/**
	* Removes the usuario evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param usuarioEvaluacionPK the primary key of the usuario evaluacion
	* @return the usuario evaluacion that was removed
	* @throws com.hitss.layer.NoSuchUsuarioEvaluacionException if a usuario evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.UsuarioEvaluacion remove(
		com.hitss.layer.service.persistence.UsuarioEvaluacionPK usuarioEvaluacionPK)
		throws com.hitss.layer.NoSuchUsuarioEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(usuarioEvaluacionPK);
	}

	public static com.hitss.layer.model.UsuarioEvaluacion updateImpl(
		com.hitss.layer.model.UsuarioEvaluacion usuarioEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(usuarioEvaluacion);
	}

	/**
	* Returns the usuario evaluacion with the primary key or throws a {@link com.hitss.layer.NoSuchUsuarioEvaluacionException} if it could not be found.
	*
	* @param usuarioEvaluacionPK the primary key of the usuario evaluacion
	* @return the usuario evaluacion
	* @throws com.hitss.layer.NoSuchUsuarioEvaluacionException if a usuario evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.UsuarioEvaluacion findByPrimaryKey(
		com.hitss.layer.service.persistence.UsuarioEvaluacionPK usuarioEvaluacionPK)
		throws com.hitss.layer.NoSuchUsuarioEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(usuarioEvaluacionPK);
	}

	/**
	* Returns the usuario evaluacion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param usuarioEvaluacionPK the primary key of the usuario evaluacion
	* @return the usuario evaluacion, or <code>null</code> if a usuario evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.UsuarioEvaluacion fetchByPrimaryKey(
		com.hitss.layer.service.persistence.UsuarioEvaluacionPK usuarioEvaluacionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(usuarioEvaluacionPK);
	}

	/**
	* Returns all the usuario evaluacions.
	*
	* @return the usuario evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.UsuarioEvaluacion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the usuario evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuario evaluacions
	* @param end the upper bound of the range of usuario evaluacions (not inclusive)
	* @return the range of usuario evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.UsuarioEvaluacion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the usuario evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuario evaluacions
	* @param end the upper bound of the range of usuario evaluacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of usuario evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.UsuarioEvaluacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the usuario evaluacions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of usuario evaluacions.
	*
	* @return the number of usuario evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UsuarioEvaluacionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UsuarioEvaluacionPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					UsuarioEvaluacionPersistence.class.getName());

			ReferenceRegistry.registerReference(UsuarioEvaluacionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(UsuarioEvaluacionPersistence persistence) {
	}

	private static UsuarioEvaluacionPersistence _persistence;
}
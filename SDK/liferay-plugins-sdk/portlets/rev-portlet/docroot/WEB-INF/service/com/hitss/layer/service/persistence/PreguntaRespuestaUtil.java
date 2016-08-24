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

import com.hitss.layer.model.PreguntaRespuesta;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the pregunta respuesta service. This utility wraps {@link PreguntaRespuestaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PreguntaRespuestaPersistence
 * @see PreguntaRespuestaPersistenceImpl
 * @generated
 */
public class PreguntaRespuestaUtil {
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
	public static void clearCache(PreguntaRespuesta preguntaRespuesta) {
		getPersistence().clearCache(preguntaRespuesta);
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
	public static List<PreguntaRespuesta> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PreguntaRespuesta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PreguntaRespuesta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PreguntaRespuesta update(PreguntaRespuesta preguntaRespuesta)
		throws SystemException {
		return getPersistence().update(preguntaRespuesta);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PreguntaRespuesta update(
		PreguntaRespuesta preguntaRespuesta, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(preguntaRespuesta, serviceContext);
	}

	/**
	* Caches the pregunta respuesta in the entity cache if it is enabled.
	*
	* @param preguntaRespuesta the pregunta respuesta
	*/
	public static void cacheResult(
		com.hitss.layer.model.PreguntaRespuesta preguntaRespuesta) {
		getPersistence().cacheResult(preguntaRespuesta);
	}

	/**
	* Caches the pregunta respuestas in the entity cache if it is enabled.
	*
	* @param preguntaRespuestas the pregunta respuestas
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.PreguntaRespuesta> preguntaRespuestas) {
		getPersistence().cacheResult(preguntaRespuestas);
	}

	/**
	* Creates a new pregunta respuesta with the primary key. Does not add the pregunta respuesta to the database.
	*
	* @param preguntaRespuestaPK the primary key for the new pregunta respuesta
	* @return the new pregunta respuesta
	*/
	public static com.hitss.layer.model.PreguntaRespuesta create(
		PreguntaRespuestaPK preguntaRespuestaPK) {
		return getPersistence().create(preguntaRespuestaPK);
	}

	/**
	* Removes the pregunta respuesta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param preguntaRespuestaPK the primary key of the pregunta respuesta
	* @return the pregunta respuesta that was removed
	* @throws com.hitss.layer.NoSuchPreguntaRespuestaException if a pregunta respuesta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PreguntaRespuesta remove(
		PreguntaRespuestaPK preguntaRespuestaPK)
		throws com.hitss.layer.NoSuchPreguntaRespuestaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(preguntaRespuestaPK);
	}

	public static com.hitss.layer.model.PreguntaRespuesta updateImpl(
		com.hitss.layer.model.PreguntaRespuesta preguntaRespuesta)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(preguntaRespuesta);
	}

	/**
	* Returns the pregunta respuesta with the primary key or throws a {@link com.hitss.layer.NoSuchPreguntaRespuestaException} if it could not be found.
	*
	* @param preguntaRespuestaPK the primary key of the pregunta respuesta
	* @return the pregunta respuesta
	* @throws com.hitss.layer.NoSuchPreguntaRespuestaException if a pregunta respuesta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PreguntaRespuesta findByPrimaryKey(
		PreguntaRespuestaPK preguntaRespuestaPK)
		throws com.hitss.layer.NoSuchPreguntaRespuestaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(preguntaRespuestaPK);
	}

	/**
	* Returns the pregunta respuesta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param preguntaRespuestaPK the primary key of the pregunta respuesta
	* @return the pregunta respuesta, or <code>null</code> if a pregunta respuesta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PreguntaRespuesta fetchByPrimaryKey(
		PreguntaRespuestaPK preguntaRespuestaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(preguntaRespuestaPK);
	}

	/**
	* Returns all the pregunta respuestas.
	*
	* @return the pregunta respuestas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.PreguntaRespuesta> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the pregunta respuestas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PreguntaRespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pregunta respuestas
	* @param end the upper bound of the range of pregunta respuestas (not inclusive)
	* @return the range of pregunta respuestas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.PreguntaRespuesta> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the pregunta respuestas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PreguntaRespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pregunta respuestas
	* @param end the upper bound of the range of pregunta respuestas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of pregunta respuestas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.PreguntaRespuesta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the pregunta respuestas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of pregunta respuestas.
	*
	* @return the number of pregunta respuestas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PreguntaRespuestaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PreguntaRespuestaPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					PreguntaRespuestaPersistence.class.getName());

			ReferenceRegistry.registerReference(PreguntaRespuestaUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PreguntaRespuestaPersistence persistence) {
	}

	private static PreguntaRespuestaPersistence _persistence;
}
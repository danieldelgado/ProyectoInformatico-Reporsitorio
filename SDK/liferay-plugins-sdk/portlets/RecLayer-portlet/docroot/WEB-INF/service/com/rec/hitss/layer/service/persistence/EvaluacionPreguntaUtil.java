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

import com.rec.hitss.layer.model.EvaluacionPregunta;

import java.util.List;

/**
 * The persistence utility for the evaluacion pregunta service. This utility wraps {@link EvaluacionPreguntaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see EvaluacionPreguntaPersistence
 * @see EvaluacionPreguntaPersistenceImpl
 * @generated
 */
public class EvaluacionPreguntaUtil {
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
	public static void clearCache(EvaluacionPregunta evaluacionPregunta) {
		getPersistence().clearCache(evaluacionPregunta);
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
	public static List<EvaluacionPregunta> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EvaluacionPregunta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EvaluacionPregunta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static EvaluacionPregunta update(
		EvaluacionPregunta evaluacionPregunta) throws SystemException {
		return getPersistence().update(evaluacionPregunta);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static EvaluacionPregunta update(
		EvaluacionPregunta evaluacionPregunta, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(evaluacionPregunta, serviceContext);
	}

	/**
	* Caches the evaluacion pregunta in the entity cache if it is enabled.
	*
	* @param evaluacionPregunta the evaluacion pregunta
	*/
	public static void cacheResult(
		com.rec.hitss.layer.model.EvaluacionPregunta evaluacionPregunta) {
		getPersistence().cacheResult(evaluacionPregunta);
	}

	/**
	* Caches the evaluacion preguntas in the entity cache if it is enabled.
	*
	* @param evaluacionPreguntas the evaluacion preguntas
	*/
	public static void cacheResult(
		java.util.List<com.rec.hitss.layer.model.EvaluacionPregunta> evaluacionPreguntas) {
		getPersistence().cacheResult(evaluacionPreguntas);
	}

	/**
	* Creates a new evaluacion pregunta with the primary key. Does not add the evaluacion pregunta to the database.
	*
	* @param evaluacionPreguntaId the primary key for the new evaluacion pregunta
	* @return the new evaluacion pregunta
	*/
	public static com.rec.hitss.layer.model.EvaluacionPregunta create(
		long evaluacionPreguntaId) {
		return getPersistence().create(evaluacionPreguntaId);
	}

	/**
	* Removes the evaluacion pregunta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param evaluacionPreguntaId the primary key of the evaluacion pregunta
	* @return the evaluacion pregunta that was removed
	* @throws com.rec.hitss.layer.NoSuchEvaluacionPreguntaException if a evaluacion pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.EvaluacionPregunta remove(
		long evaluacionPreguntaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchEvaluacionPreguntaException {
		return getPersistence().remove(evaluacionPreguntaId);
	}

	public static com.rec.hitss.layer.model.EvaluacionPregunta updateImpl(
		com.rec.hitss.layer.model.EvaluacionPregunta evaluacionPregunta)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(evaluacionPregunta);
	}

	/**
	* Returns the evaluacion pregunta with the primary key or throws a {@link com.rec.hitss.layer.NoSuchEvaluacionPreguntaException} if it could not be found.
	*
	* @param evaluacionPreguntaId the primary key of the evaluacion pregunta
	* @return the evaluacion pregunta
	* @throws com.rec.hitss.layer.NoSuchEvaluacionPreguntaException if a evaluacion pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.EvaluacionPregunta findByPrimaryKey(
		long evaluacionPreguntaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchEvaluacionPreguntaException {
		return getPersistence().findByPrimaryKey(evaluacionPreguntaId);
	}

	/**
	* Returns the evaluacion pregunta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param evaluacionPreguntaId the primary key of the evaluacion pregunta
	* @return the evaluacion pregunta, or <code>null</code> if a evaluacion pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.EvaluacionPregunta fetchByPrimaryKey(
		long evaluacionPreguntaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(evaluacionPreguntaId);
	}

	/**
	* Returns all the evaluacion preguntas.
	*
	* @return the evaluacion preguntas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.EvaluacionPregunta> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the evaluacion preguntas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EvaluacionPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of evaluacion preguntas
	* @param end the upper bound of the range of evaluacion preguntas (not inclusive)
	* @return the range of evaluacion preguntas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.EvaluacionPregunta> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the evaluacion preguntas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EvaluacionPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of evaluacion preguntas
	* @param end the upper bound of the range of evaluacion preguntas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of evaluacion preguntas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.EvaluacionPregunta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the evaluacion preguntas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of evaluacion preguntas.
	*
	* @return the number of evaluacion preguntas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EvaluacionPreguntaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EvaluacionPreguntaPersistence)PortletBeanLocatorUtil.locate(com.rec.hitss.layer.service.ClpSerializer.getServletContextName(),
					EvaluacionPreguntaPersistence.class.getName());

			ReferenceRegistry.registerReference(EvaluacionPreguntaUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EvaluacionPreguntaPersistence persistence) {
	}

	private static EvaluacionPreguntaPersistence _persistence;
}
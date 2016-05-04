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

import com.hitss.layer.model.EvaluacionPregunta;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the evaluacion pregunta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see EvaluacionPreguntaPersistenceImpl
 * @see EvaluacionPreguntaUtil
 * @generated
 */
public interface EvaluacionPreguntaPersistence extends BasePersistence<EvaluacionPregunta> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EvaluacionPreguntaUtil} to access the evaluacion pregunta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the evaluacion pregunta in the entity cache if it is enabled.
	*
	* @param evaluacionPregunta the evaluacion pregunta
	*/
	public void cacheResult(
		com.hitss.layer.model.EvaluacionPregunta evaluacionPregunta);

	/**
	* Caches the evaluacion preguntas in the entity cache if it is enabled.
	*
	* @param evaluacionPreguntas the evaluacion preguntas
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.EvaluacionPregunta> evaluacionPreguntas);

	/**
	* Creates a new evaluacion pregunta with the primary key. Does not add the evaluacion pregunta to the database.
	*
	* @param evaluacionPreguntaPK the primary key for the new evaluacion pregunta
	* @return the new evaluacion pregunta
	*/
	public com.hitss.layer.model.EvaluacionPregunta create(
		com.hitss.layer.service.persistence.EvaluacionPreguntaPK evaluacionPreguntaPK);

	/**
	* Removes the evaluacion pregunta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param evaluacionPreguntaPK the primary key of the evaluacion pregunta
	* @return the evaluacion pregunta that was removed
	* @throws com.hitss.layer.NoSuchEvaluacionPreguntaException if a evaluacion pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.EvaluacionPregunta remove(
		com.hitss.layer.service.persistence.EvaluacionPreguntaPK evaluacionPreguntaPK)
		throws com.hitss.layer.NoSuchEvaluacionPreguntaException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.EvaluacionPregunta updateImpl(
		com.hitss.layer.model.EvaluacionPregunta evaluacionPregunta)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the evaluacion pregunta with the primary key or throws a {@link com.hitss.layer.NoSuchEvaluacionPreguntaException} if it could not be found.
	*
	* @param evaluacionPreguntaPK the primary key of the evaluacion pregunta
	* @return the evaluacion pregunta
	* @throws com.hitss.layer.NoSuchEvaluacionPreguntaException if a evaluacion pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.EvaluacionPregunta findByPrimaryKey(
		com.hitss.layer.service.persistence.EvaluacionPreguntaPK evaluacionPreguntaPK)
		throws com.hitss.layer.NoSuchEvaluacionPreguntaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the evaluacion pregunta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param evaluacionPreguntaPK the primary key of the evaluacion pregunta
	* @return the evaluacion pregunta, or <code>null</code> if a evaluacion pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.EvaluacionPregunta fetchByPrimaryKey(
		com.hitss.layer.service.persistence.EvaluacionPreguntaPK evaluacionPreguntaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the evaluacion preguntas.
	*
	* @return the evaluacion preguntas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.EvaluacionPregunta> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the evaluacion preguntas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EvaluacionPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of evaluacion preguntas
	* @param end the upper bound of the range of evaluacion preguntas (not inclusive)
	* @return the range of evaluacion preguntas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.EvaluacionPregunta> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the evaluacion preguntas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EvaluacionPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of evaluacion preguntas
	* @param end the upper bound of the range of evaluacion preguntas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of evaluacion preguntas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.EvaluacionPregunta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the evaluacion preguntas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of evaluacion preguntas.
	*
	* @return the number of evaluacion preguntas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
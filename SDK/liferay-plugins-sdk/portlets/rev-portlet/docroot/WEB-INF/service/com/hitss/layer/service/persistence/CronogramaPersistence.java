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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the cronograma service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see CronogramaPersistenceImpl
 * @see CronogramaUtil
 * @generated
 */
public interface CronogramaPersistence extends BasePersistence<Cronograma> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CronogramaUtil} to access the cronograma persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the cronograma where solicitudEvaluacionDesempennoId = &#63; or throws a {@link com.hitss.layer.NoSuchCronogramaException} if it could not be found.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @return the matching cronograma
	* @throws com.hitss.layer.NoSuchCronogramaException if a matching cronograma could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Cronograma findByS(
		long solicitudEvaluacionDesempennoId)
		throws com.hitss.layer.NoSuchCronogramaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cronograma where solicitudEvaluacionDesempennoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @return the matching cronograma, or <code>null</code> if a matching cronograma could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Cronograma fetchByS(
		long solicitudEvaluacionDesempennoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cronograma where solicitudEvaluacionDesempennoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching cronograma, or <code>null</code> if a matching cronograma could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Cronograma fetchByS(
		long solicitudEvaluacionDesempennoId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the cronograma where solicitudEvaluacionDesempennoId = &#63; from the database.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @return the cronograma that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Cronograma removeByS(
		long solicitudEvaluacionDesempennoId)
		throws com.hitss.layer.NoSuchCronogramaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cronogramas where solicitudEvaluacionDesempennoId = &#63;.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @return the number of matching cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public int countByS(long solicitudEvaluacionDesempennoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the cronograma in the entity cache if it is enabled.
	*
	* @param cronograma the cronograma
	*/
	public void cacheResult(com.hitss.layer.model.Cronograma cronograma);

	/**
	* Caches the cronogramas in the entity cache if it is enabled.
	*
	* @param cronogramas the cronogramas
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.Cronograma> cronogramas);

	/**
	* Creates a new cronograma with the primary key. Does not add the cronograma to the database.
	*
	* @param cronogramaId the primary key for the new cronograma
	* @return the new cronograma
	*/
	public com.hitss.layer.model.Cronograma create(long cronogramaId);

	/**
	* Removes the cronograma with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cronogramaId the primary key of the cronograma
	* @return the cronograma that was removed
	* @throws com.hitss.layer.NoSuchCronogramaException if a cronograma with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Cronograma remove(long cronogramaId)
		throws com.hitss.layer.NoSuchCronogramaException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.Cronograma updateImpl(
		com.hitss.layer.model.Cronograma cronograma)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cronograma with the primary key or throws a {@link com.hitss.layer.NoSuchCronogramaException} if it could not be found.
	*
	* @param cronogramaId the primary key of the cronograma
	* @return the cronograma
	* @throws com.hitss.layer.NoSuchCronogramaException if a cronograma with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Cronograma findByPrimaryKey(long cronogramaId)
		throws com.hitss.layer.NoSuchCronogramaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cronograma with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cronogramaId the primary key of the cronograma
	* @return the cronograma, or <code>null</code> if a cronograma with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Cronograma fetchByPrimaryKey(long cronogramaId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cronogramas.
	*
	* @return the cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Cronograma> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.Cronograma> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.Cronograma> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cronogramas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cronogramas.
	*
	* @return the number of cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
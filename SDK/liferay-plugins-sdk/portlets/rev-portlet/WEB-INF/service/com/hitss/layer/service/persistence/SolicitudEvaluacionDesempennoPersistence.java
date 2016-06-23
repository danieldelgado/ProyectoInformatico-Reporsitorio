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

import com.hitss.layer.model.SolicitudEvaluacionDesempenno;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the solicitud evaluacion desempenno service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudEvaluacionDesempennoPersistenceImpl
 * @see SolicitudEvaluacionDesempennoUtil
 * @generated
 */
public interface SolicitudEvaluacionDesempennoPersistence
	extends BasePersistence<SolicitudEvaluacionDesempenno> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SolicitudEvaluacionDesempennoUtil} to access the solicitud evaluacion desempenno persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the solicitud evaluacion desempenno in the entity cache if it is enabled.
	*
	* @param solicitudEvaluacionDesempenno the solicitud evaluacion desempenno
	*/
	public void cacheResult(
		com.hitss.layer.model.SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno);

	/**
	* Caches the solicitud evaluacion desempennos in the entity cache if it is enabled.
	*
	* @param solicitudEvaluacionDesempennos the solicitud evaluacion desempennos
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.SolicitudEvaluacionDesempenno> solicitudEvaluacionDesempennos);

	/**
	* Creates a new solicitud evaluacion desempenno with the primary key. Does not add the solicitud evaluacion desempenno to the database.
	*
	* @param solicitudEvaluacionDesempennoId the primary key for the new solicitud evaluacion desempenno
	* @return the new solicitud evaluacion desempenno
	*/
	public com.hitss.layer.model.SolicitudEvaluacionDesempenno create(
		long solicitudEvaluacionDesempennoId);

	/**
	* Removes the solicitud evaluacion desempenno with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudEvaluacionDesempennoId the primary key of the solicitud evaluacion desempenno
	* @return the solicitud evaluacion desempenno that was removed
	* @throws com.hitss.layer.NoSuchSolicitudEvaluacionDesempennoException if a solicitud evaluacion desempenno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudEvaluacionDesempenno remove(
		long solicitudEvaluacionDesempennoId)
		throws com.hitss.layer.NoSuchSolicitudEvaluacionDesempennoException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.SolicitudEvaluacionDesempenno updateImpl(
		com.hitss.layer.model.SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the solicitud evaluacion desempenno with the primary key or throws a {@link com.hitss.layer.NoSuchSolicitudEvaluacionDesempennoException} if it could not be found.
	*
	* @param solicitudEvaluacionDesempennoId the primary key of the solicitud evaluacion desempenno
	* @return the solicitud evaluacion desempenno
	* @throws com.hitss.layer.NoSuchSolicitudEvaluacionDesempennoException if a solicitud evaluacion desempenno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudEvaluacionDesempenno findByPrimaryKey(
		long solicitudEvaluacionDesempennoId)
		throws com.hitss.layer.NoSuchSolicitudEvaluacionDesempennoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the solicitud evaluacion desempenno with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param solicitudEvaluacionDesempennoId the primary key of the solicitud evaluacion desempenno
	* @return the solicitud evaluacion desempenno, or <code>null</code> if a solicitud evaluacion desempenno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.SolicitudEvaluacionDesempenno fetchByPrimaryKey(
		long solicitudEvaluacionDesempennoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the solicitud evaluacion desempennos.
	*
	* @return the solicitud evaluacion desempennos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudEvaluacionDesempenno> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the solicitud evaluacion desempennos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudEvaluacionDesempennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud evaluacion desempennos
	* @param end the upper bound of the range of solicitud evaluacion desempennos (not inclusive)
	* @return the range of solicitud evaluacion desempennos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudEvaluacionDesempenno> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the solicitud evaluacion desempennos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudEvaluacionDesempennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud evaluacion desempennos
	* @param end the upper bound of the range of solicitud evaluacion desempennos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of solicitud evaluacion desempennos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudEvaluacionDesempenno> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud evaluacion desempennos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud evaluacion desempennos.
	*
	* @return the number of solicitud evaluacion desempennos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
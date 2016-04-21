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

import com.liferay.portal.service.persistence.BasePersistence;

import com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno;

/**
 * The persistence interface for the solicitud evaluacion desempeno service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see SolicitudEvaluacionDesempenoPersistenceImpl
 * @see SolicitudEvaluacionDesempenoUtil
 * @generated
 */
public interface SolicitudEvaluacionDesempenoPersistence extends BasePersistence<SolicitudEvaluacionDesempeno> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SolicitudEvaluacionDesempenoUtil} to access the solicitud evaluacion desempeno persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the solicitud evaluacion desempeno in the entity cache if it is enabled.
	*
	* @param solicitudEvaluacionDesempeno the solicitud evaluacion desempeno
	*/
	public void cacheResult(
		com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno);

	/**
	* Caches the solicitud evaluacion desempenos in the entity cache if it is enabled.
	*
	* @param solicitudEvaluacionDesempenos the solicitud evaluacion desempenos
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno> solicitudEvaluacionDesempenos);

	/**
	* Creates a new solicitud evaluacion desempeno with the primary key. Does not add the solicitud evaluacion desempeno to the database.
	*
	* @param solicitudEvaluacionDesempenoId the primary key for the new solicitud evaluacion desempeno
	* @return the new solicitud evaluacion desempeno
	*/
	public com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno create(
		long solicitudEvaluacionDesempenoId);

	/**
	* Removes the solicitud evaluacion desempeno with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param solicitudEvaluacionDesempenoId the primary key of the solicitud evaluacion desempeno
	* @return the solicitud evaluacion desempeno that was removed
	* @throws com.rec.hitss.layer.NoSuchSolicitudEvaluacionDesempenoException if a solicitud evaluacion desempeno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno remove(
		long solicitudEvaluacionDesempenoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchSolicitudEvaluacionDesempenoException;

	public com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno updateImpl(
		com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the solicitud evaluacion desempeno with the primary key or throws a {@link com.rec.hitss.layer.NoSuchSolicitudEvaluacionDesempenoException} if it could not be found.
	*
	* @param solicitudEvaluacionDesempenoId the primary key of the solicitud evaluacion desempeno
	* @return the solicitud evaluacion desempeno
	* @throws com.rec.hitss.layer.NoSuchSolicitudEvaluacionDesempenoException if a solicitud evaluacion desempeno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno findByPrimaryKey(
		long solicitudEvaluacionDesempenoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchSolicitudEvaluacionDesempenoException;

	/**
	* Returns the solicitud evaluacion desempeno with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param solicitudEvaluacionDesempenoId the primary key of the solicitud evaluacion desempeno
	* @return the solicitud evaluacion desempeno, or <code>null</code> if a solicitud evaluacion desempeno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno fetchByPrimaryKey(
		long solicitudEvaluacionDesempenoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the solicitud evaluacion desempenos.
	*
	* @return the solicitud evaluacion desempenos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the solicitud evaluacion desempenos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudEvaluacionDesempenoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud evaluacion desempenos
	* @param end the upper bound of the range of solicitud evaluacion desempenos (not inclusive)
	* @return the range of solicitud evaluacion desempenos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the solicitud evaluacion desempenos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudEvaluacionDesempenoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of solicitud evaluacion desempenos
	* @param end the upper bound of the range of solicitud evaluacion desempenos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of solicitud evaluacion desempenos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the solicitud evaluacion desempenos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud evaluacion desempenos.
	*
	* @return the number of solicitud evaluacion desempenos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
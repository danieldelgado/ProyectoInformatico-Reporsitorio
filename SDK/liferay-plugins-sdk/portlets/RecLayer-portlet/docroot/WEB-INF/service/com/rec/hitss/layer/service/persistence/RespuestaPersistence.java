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

import com.rec.hitss.layer.model.Respuesta;

/**
 * The persistence interface for the respuesta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see RespuestaPersistenceImpl
 * @see RespuestaUtil
 * @generated
 */
public interface RespuestaPersistence extends BasePersistence<Respuesta> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RespuestaUtil} to access the respuesta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the respuesta in the entity cache if it is enabled.
	*
	* @param respuesta the respuesta
	*/
	public void cacheResult(com.rec.hitss.layer.model.Respuesta respuesta);

	/**
	* Caches the respuestas in the entity cache if it is enabled.
	*
	* @param respuestas the respuestas
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.Respuesta> respuestas);

	/**
	* Creates a new respuesta with the primary key. Does not add the respuesta to the database.
	*
	* @param respuestaId the primary key for the new respuesta
	* @return the new respuesta
	*/
	public com.rec.hitss.layer.model.Respuesta create(long respuestaId);

	/**
	* Removes the respuesta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param respuestaId the primary key of the respuesta
	* @return the respuesta that was removed
	* @throws com.rec.hitss.layer.NoSuchRespuestaException if a respuesta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Respuesta remove(long respuestaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRespuestaException;

	public com.rec.hitss.layer.model.Respuesta updateImpl(
		com.rec.hitss.layer.model.Respuesta respuesta)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the respuesta with the primary key or throws a {@link com.rec.hitss.layer.NoSuchRespuestaException} if it could not be found.
	*
	* @param respuestaId the primary key of the respuesta
	* @return the respuesta
	* @throws com.rec.hitss.layer.NoSuchRespuestaException if a respuesta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Respuesta findByPrimaryKey(
		long respuestaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRespuestaException;

	/**
	* Returns the respuesta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param respuestaId the primary key of the respuesta
	* @return the respuesta, or <code>null</code> if a respuesta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Respuesta fetchByPrimaryKey(
		long respuestaId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the respuestas.
	*
	* @return the respuestas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Respuesta> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the respuestas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of respuestas
	* @param end the upper bound of the range of respuestas (not inclusive)
	* @return the range of respuestas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Respuesta> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the respuestas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of respuestas
	* @param end the upper bound of the range of respuestas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of respuestas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Respuesta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the respuestas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of respuestas.
	*
	* @return the number of respuestas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
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

import com.rec.hitss.layer.model.FasePostulacion;

/**
 * The persistence interface for the fase postulacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see FasePostulacionPersistenceImpl
 * @see FasePostulacionUtil
 * @generated
 */
public interface FasePostulacionPersistence extends BasePersistence<FasePostulacion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FasePostulacionUtil} to access the fase postulacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the fase postulacion in the entity cache if it is enabled.
	*
	* @param fasePostulacion the fase postulacion
	*/
	public void cacheResult(
		com.rec.hitss.layer.model.FasePostulacion fasePostulacion);

	/**
	* Caches the fase postulacions in the entity cache if it is enabled.
	*
	* @param fasePostulacions the fase postulacions
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.FasePostulacion> fasePostulacions);

	/**
	* Creates a new fase postulacion with the primary key. Does not add the fase postulacion to the database.
	*
	* @param fasePostulacionId the primary key for the new fase postulacion
	* @return the new fase postulacion
	*/
	public com.rec.hitss.layer.model.FasePostulacion create(
		long fasePostulacionId);

	/**
	* Removes the fase postulacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fasePostulacionId the primary key of the fase postulacion
	* @return the fase postulacion that was removed
	* @throws com.rec.hitss.layer.NoSuchFasePostulacionException if a fase postulacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.FasePostulacion remove(
		long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchFasePostulacionException;

	public com.rec.hitss.layer.model.FasePostulacion updateImpl(
		com.rec.hitss.layer.model.FasePostulacion fasePostulacion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the fase postulacion with the primary key or throws a {@link com.rec.hitss.layer.NoSuchFasePostulacionException} if it could not be found.
	*
	* @param fasePostulacionId the primary key of the fase postulacion
	* @return the fase postulacion
	* @throws com.rec.hitss.layer.NoSuchFasePostulacionException if a fase postulacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.FasePostulacion findByPrimaryKey(
		long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchFasePostulacionException;

	/**
	* Returns the fase postulacion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fasePostulacionId the primary key of the fase postulacion
	* @return the fase postulacion, or <code>null</code> if a fase postulacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.FasePostulacion fetchByPrimaryKey(
		long fasePostulacionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the fase postulacions.
	*
	* @return the fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.FasePostulacion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the fase postulacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fase postulacions
	* @param end the upper bound of the range of fase postulacions (not inclusive)
	* @return the range of fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.FasePostulacion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the fase postulacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fase postulacions
	* @param end the upper bound of the range of fase postulacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.FasePostulacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the fase postulacions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of fase postulacions.
	*
	* @return the number of fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
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

import com.rec.hitss.layer.model.Estudio;

/**
 * The persistence interface for the estudio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see EstudioPersistenceImpl
 * @see EstudioUtil
 * @generated
 */
public interface EstudioPersistence extends BasePersistence<Estudio> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EstudioUtil} to access the estudio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the estudio in the entity cache if it is enabled.
	*
	* @param estudio the estudio
	*/
	public void cacheResult(com.rec.hitss.layer.model.Estudio estudio);

	/**
	* Caches the estudios in the entity cache if it is enabled.
	*
	* @param estudios the estudios
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.Estudio> estudios);

	/**
	* Creates a new estudio with the primary key. Does not add the estudio to the database.
	*
	* @param estudioId the primary key for the new estudio
	* @return the new estudio
	*/
	public com.rec.hitss.layer.model.Estudio create(long estudioId);

	/**
	* Removes the estudio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param estudioId the primary key of the estudio
	* @return the estudio that was removed
	* @throws com.rec.hitss.layer.NoSuchEstudioException if a estudio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Estudio remove(long estudioId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchEstudioException;

	public com.rec.hitss.layer.model.Estudio updateImpl(
		com.rec.hitss.layer.model.Estudio estudio)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the estudio with the primary key or throws a {@link com.rec.hitss.layer.NoSuchEstudioException} if it could not be found.
	*
	* @param estudioId the primary key of the estudio
	* @return the estudio
	* @throws com.rec.hitss.layer.NoSuchEstudioException if a estudio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Estudio findByPrimaryKey(long estudioId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchEstudioException;

	/**
	* Returns the estudio with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param estudioId the primary key of the estudio
	* @return the estudio, or <code>null</code> if a estudio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Estudio fetchByPrimaryKey(long estudioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the estudios.
	*
	* @return the estudios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Estudio> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the estudios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EstudioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of estudios
	* @param end the upper bound of the range of estudios (not inclusive)
	* @return the range of estudios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Estudio> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the estudios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EstudioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of estudios
	* @param end the upper bound of the range of estudios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of estudios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Estudio> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the estudios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of estudios.
	*
	* @return the number of estudios
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
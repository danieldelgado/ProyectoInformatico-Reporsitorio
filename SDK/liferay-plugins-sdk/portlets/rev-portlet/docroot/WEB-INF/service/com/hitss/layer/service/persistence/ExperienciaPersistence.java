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

import com.hitss.layer.model.Experiencia;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the experiencia service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see ExperienciaPersistenceImpl
 * @see ExperienciaUtil
 * @generated
 */
public interface ExperienciaPersistence extends BasePersistence<Experiencia> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExperienciaUtil} to access the experiencia persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the experiencia in the entity cache if it is enabled.
	*
	* @param experiencia the experiencia
	*/
	public void cacheResult(com.hitss.layer.model.Experiencia experiencia);

	/**
	* Caches the experiencias in the entity cache if it is enabled.
	*
	* @param experiencias the experiencias
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.Experiencia> experiencias);

	/**
	* Creates a new experiencia with the primary key. Does not add the experiencia to the database.
	*
	* @param experienciaId the primary key for the new experiencia
	* @return the new experiencia
	*/
	public com.hitss.layer.model.Experiencia create(long experienciaId);

	/**
	* Removes the experiencia with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param experienciaId the primary key of the experiencia
	* @return the experiencia that was removed
	* @throws com.hitss.layer.NoSuchExperienciaException if a experiencia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Experiencia remove(long experienciaId)
		throws com.hitss.layer.NoSuchExperienciaException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.Experiencia updateImpl(
		com.hitss.layer.model.Experiencia experiencia)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the experiencia with the primary key or throws a {@link com.hitss.layer.NoSuchExperienciaException} if it could not be found.
	*
	* @param experienciaId the primary key of the experiencia
	* @return the experiencia
	* @throws com.hitss.layer.NoSuchExperienciaException if a experiencia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Experiencia findByPrimaryKey(
		long experienciaId)
		throws com.hitss.layer.NoSuchExperienciaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the experiencia with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param experienciaId the primary key of the experiencia
	* @return the experiencia, or <code>null</code> if a experiencia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Experiencia fetchByPrimaryKey(
		long experienciaId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the experiencias.
	*
	* @return the experiencias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Experiencia> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the experiencias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ExperienciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of experiencias
	* @param end the upper bound of the range of experiencias (not inclusive)
	* @return the range of experiencias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Experiencia> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the experiencias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ExperienciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of experiencias
	* @param end the upper bound of the range of experiencias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of experiencias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Experiencia> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the experiencias from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of experiencias.
	*
	* @return the number of experiencias
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
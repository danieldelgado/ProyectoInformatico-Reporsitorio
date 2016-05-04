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

import com.rec.hitss.layer.model.curriculumVitae;

/**
 * The persistence interface for the curriculum vitae service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see curriculumVitaePersistenceImpl
 * @see curriculumVitaeUtil
 * @generated
 */
public interface curriculumVitaePersistence extends BasePersistence<curriculumVitae> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link curriculumVitaeUtil} to access the curriculum vitae persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the curriculum vitae in the entity cache if it is enabled.
	*
	* @param curriculumVitae the curriculum vitae
	*/
	public void cacheResult(
		com.rec.hitss.layer.model.curriculumVitae curriculumVitae);

	/**
	* Caches the curriculum vitaes in the entity cache if it is enabled.
	*
	* @param curriculumVitaes the curriculum vitaes
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.curriculumVitae> curriculumVitaes);

	/**
	* Creates a new curriculum vitae with the primary key. Does not add the curriculum vitae to the database.
	*
	* @param CV_ID the primary key for the new curriculum vitae
	* @return the new curriculum vitae
	*/
	public com.rec.hitss.layer.model.curriculumVitae create(long CV_ID);

	/**
	* Removes the curriculum vitae with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CV_ID the primary key of the curriculum vitae
	* @return the curriculum vitae that was removed
	* @throws com.rec.hitss.layer.NoSuchcurriculumVitaeException if a curriculum vitae with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.curriculumVitae remove(long CV_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchcurriculumVitaeException;

	public com.rec.hitss.layer.model.curriculumVitae updateImpl(
		com.rec.hitss.layer.model.curriculumVitae curriculumVitae)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the curriculum vitae with the primary key or throws a {@link com.rec.hitss.layer.NoSuchcurriculumVitaeException} if it could not be found.
	*
	* @param CV_ID the primary key of the curriculum vitae
	* @return the curriculum vitae
	* @throws com.rec.hitss.layer.NoSuchcurriculumVitaeException if a curriculum vitae with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.curriculumVitae findByPrimaryKey(
		long CV_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchcurriculumVitaeException;

	/**
	* Returns the curriculum vitae with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CV_ID the primary key of the curriculum vitae
	* @return the curriculum vitae, or <code>null</code> if a curriculum vitae with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.curriculumVitae fetchByPrimaryKey(
		long CV_ID) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the curriculum vitaes.
	*
	* @return the curriculum vitaes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.curriculumVitae> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the curriculum vitaes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.curriculumVitaeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of curriculum vitaes
	* @param end the upper bound of the range of curriculum vitaes (not inclusive)
	* @return the range of curriculum vitaes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.curriculumVitae> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the curriculum vitaes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.curriculumVitaeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of curriculum vitaes
	* @param end the upper bound of the range of curriculum vitaes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of curriculum vitaes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.curriculumVitae> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the curriculum vitaes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of curriculum vitaes.
	*
	* @return the number of curriculum vitaes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
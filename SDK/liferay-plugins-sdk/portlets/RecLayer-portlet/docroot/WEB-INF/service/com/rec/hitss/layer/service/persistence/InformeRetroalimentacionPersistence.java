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

import com.rec.hitss.layer.model.InformeRetroalimentacion;

/**
 * The persistence interface for the informe retroalimentacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see InformeRetroalimentacionPersistenceImpl
 * @see InformeRetroalimentacionUtil
 * @generated
 */
public interface InformeRetroalimentacionPersistence extends BasePersistence<InformeRetroalimentacion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InformeRetroalimentacionUtil} to access the informe retroalimentacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the informe retroalimentacion in the entity cache if it is enabled.
	*
	* @param informeRetroalimentacion the informe retroalimentacion
	*/
	public void cacheResult(
		com.rec.hitss.layer.model.InformeRetroalimentacion informeRetroalimentacion);

	/**
	* Caches the informe retroalimentacions in the entity cache if it is enabled.
	*
	* @param informeRetroalimentacions the informe retroalimentacions
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.InformeRetroalimentacion> informeRetroalimentacions);

	/**
	* Creates a new informe retroalimentacion with the primary key. Does not add the informe retroalimentacion to the database.
	*
	* @param informeRetroalimentacionId the primary key for the new informe retroalimentacion
	* @return the new informe retroalimentacion
	*/
	public com.rec.hitss.layer.model.InformeRetroalimentacion create(
		long informeRetroalimentacionId);

	/**
	* Removes the informe retroalimentacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param informeRetroalimentacionId the primary key of the informe retroalimentacion
	* @return the informe retroalimentacion that was removed
	* @throws com.rec.hitss.layer.NoSuchInformeRetroalimentacionException if a informe retroalimentacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.InformeRetroalimentacion remove(
		long informeRetroalimentacionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchInformeRetroalimentacionException;

	public com.rec.hitss.layer.model.InformeRetroalimentacion updateImpl(
		com.rec.hitss.layer.model.InformeRetroalimentacion informeRetroalimentacion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the informe retroalimentacion with the primary key or throws a {@link com.rec.hitss.layer.NoSuchInformeRetroalimentacionException} if it could not be found.
	*
	* @param informeRetroalimentacionId the primary key of the informe retroalimentacion
	* @return the informe retroalimentacion
	* @throws com.rec.hitss.layer.NoSuchInformeRetroalimentacionException if a informe retroalimentacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.InformeRetroalimentacion findByPrimaryKey(
		long informeRetroalimentacionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchInformeRetroalimentacionException;

	/**
	* Returns the informe retroalimentacion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param informeRetroalimentacionId the primary key of the informe retroalimentacion
	* @return the informe retroalimentacion, or <code>null</code> if a informe retroalimentacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.InformeRetroalimentacion fetchByPrimaryKey(
		long informeRetroalimentacionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the informe retroalimentacions.
	*
	* @return the informe retroalimentacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.InformeRetroalimentacion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the informe retroalimentacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.InformeRetroalimentacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of informe retroalimentacions
	* @param end the upper bound of the range of informe retroalimentacions (not inclusive)
	* @return the range of informe retroalimentacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.InformeRetroalimentacion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the informe retroalimentacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.InformeRetroalimentacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of informe retroalimentacions
	* @param end the upper bound of the range of informe retroalimentacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of informe retroalimentacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.InformeRetroalimentacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the informe retroalimentacions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of informe retroalimentacions.
	*
	* @return the number of informe retroalimentacions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
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

import com.rec.hitss.layer.model.Etiqueta;

/**
 * The persistence interface for the etiqueta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see EtiquetaPersistenceImpl
 * @see EtiquetaUtil
 * @generated
 */
public interface EtiquetaPersistence extends BasePersistence<Etiqueta> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EtiquetaUtil} to access the etiqueta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the etiqueta in the entity cache if it is enabled.
	*
	* @param etiqueta the etiqueta
	*/
	public void cacheResult(com.rec.hitss.layer.model.Etiqueta etiqueta);

	/**
	* Caches the etiquetas in the entity cache if it is enabled.
	*
	* @param etiquetas the etiquetas
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.Etiqueta> etiquetas);

	/**
	* Creates a new etiqueta with the primary key. Does not add the etiqueta to the database.
	*
	* @param etiquetaId the primary key for the new etiqueta
	* @return the new etiqueta
	*/
	public com.rec.hitss.layer.model.Etiqueta create(long etiquetaId);

	/**
	* Removes the etiqueta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param etiquetaId the primary key of the etiqueta
	* @return the etiqueta that was removed
	* @throws com.rec.hitss.layer.NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Etiqueta remove(long etiquetaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchEtiquetaException;

	public com.rec.hitss.layer.model.Etiqueta updateImpl(
		com.rec.hitss.layer.model.Etiqueta etiqueta)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the etiqueta with the primary key or throws a {@link com.rec.hitss.layer.NoSuchEtiquetaException} if it could not be found.
	*
	* @param etiquetaId the primary key of the etiqueta
	* @return the etiqueta
	* @throws com.rec.hitss.layer.NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Etiqueta findByPrimaryKey(long etiquetaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchEtiquetaException;

	/**
	* Returns the etiqueta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param etiquetaId the primary key of the etiqueta
	* @return the etiqueta, or <code>null</code> if a etiqueta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.Etiqueta fetchByPrimaryKey(long etiquetaId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the etiquetas.
	*
	* @return the etiquetas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Etiqueta> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the etiquetas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EtiquetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of etiquetas
	* @param end the upper bound of the range of etiquetas (not inclusive)
	* @return the range of etiquetas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Etiqueta> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the etiquetas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EtiquetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of etiquetas
	* @param end the upper bound of the range of etiquetas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of etiquetas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.Etiqueta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the etiquetas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of etiquetas.
	*
	* @return the number of etiquetas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
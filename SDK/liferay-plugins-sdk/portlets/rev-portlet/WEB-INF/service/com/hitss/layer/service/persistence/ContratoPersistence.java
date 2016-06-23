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

import com.hitss.layer.model.Contrato;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the contrato service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see ContratoPersistenceImpl
 * @see ContratoUtil
 * @generated
 */
public interface ContratoPersistence extends BasePersistence<Contrato> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ContratoUtil} to access the contrato persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the contrato in the entity cache if it is enabled.
	*
	* @param contrato the contrato
	*/
	public void cacheResult(com.hitss.layer.model.Contrato contrato);

	/**
	* Caches the contratos in the entity cache if it is enabled.
	*
	* @param contratos the contratos
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.Contrato> contratos);

	/**
	* Creates a new contrato with the primary key. Does not add the contrato to the database.
	*
	* @param contratoId the primary key for the new contrato
	* @return the new contrato
	*/
	public com.hitss.layer.model.Contrato create(long contratoId);

	/**
	* Removes the contrato with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contratoId the primary key of the contrato
	* @return the contrato that was removed
	* @throws com.hitss.layer.NoSuchContratoException if a contrato with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Contrato remove(long contratoId)
		throws com.hitss.layer.NoSuchContratoException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.Contrato updateImpl(
		com.hitss.layer.model.Contrato contrato)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the contrato with the primary key or throws a {@link com.hitss.layer.NoSuchContratoException} if it could not be found.
	*
	* @param contratoId the primary key of the contrato
	* @return the contrato
	* @throws com.hitss.layer.NoSuchContratoException if a contrato with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Contrato findByPrimaryKey(long contratoId)
		throws com.hitss.layer.NoSuchContratoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the contrato with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param contratoId the primary key of the contrato
	* @return the contrato, or <code>null</code> if a contrato with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Contrato fetchByPrimaryKey(long contratoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the contratos.
	*
	* @return the contratos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Contrato> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the contratos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ContratoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contratos
	* @param end the upper bound of the range of contratos (not inclusive)
	* @return the range of contratos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Contrato> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the contratos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ContratoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contratos
	* @param end the upper bound of the range of contratos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of contratos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Contrato> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the contratos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of contratos.
	*
	* @return the number of contratos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
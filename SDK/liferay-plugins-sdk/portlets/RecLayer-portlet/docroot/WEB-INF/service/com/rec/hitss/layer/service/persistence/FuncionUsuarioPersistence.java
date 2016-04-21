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

import com.rec.hitss.layer.model.FuncionUsuario;

/**
 * The persistence interface for the funcion usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see FuncionUsuarioPersistenceImpl
 * @see FuncionUsuarioUtil
 * @generated
 */
public interface FuncionUsuarioPersistence extends BasePersistence<FuncionUsuario> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FuncionUsuarioUtil} to access the funcion usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the funcion usuario in the entity cache if it is enabled.
	*
	* @param funcionUsuario the funcion usuario
	*/
	public void cacheResult(
		com.rec.hitss.layer.model.FuncionUsuario funcionUsuario);

	/**
	* Caches the funcion usuarios in the entity cache if it is enabled.
	*
	* @param funcionUsuarios the funcion usuarios
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.FuncionUsuario> funcionUsuarios);

	/**
	* Creates a new funcion usuario with the primary key. Does not add the funcion usuario to the database.
	*
	* @param funcionId the primary key for the new funcion usuario
	* @return the new funcion usuario
	*/
	public com.rec.hitss.layer.model.FuncionUsuario create(long funcionId);

	/**
	* Removes the funcion usuario with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param funcionId the primary key of the funcion usuario
	* @return the funcion usuario that was removed
	* @throws com.rec.hitss.layer.NoSuchFuncionUsuarioException if a funcion usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.FuncionUsuario remove(long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchFuncionUsuarioException;

	public com.rec.hitss.layer.model.FuncionUsuario updateImpl(
		com.rec.hitss.layer.model.FuncionUsuario funcionUsuario)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the funcion usuario with the primary key or throws a {@link com.rec.hitss.layer.NoSuchFuncionUsuarioException} if it could not be found.
	*
	* @param funcionId the primary key of the funcion usuario
	* @return the funcion usuario
	* @throws com.rec.hitss.layer.NoSuchFuncionUsuarioException if a funcion usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.FuncionUsuario findByPrimaryKey(
		long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchFuncionUsuarioException;

	/**
	* Returns the funcion usuario with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param funcionId the primary key of the funcion usuario
	* @return the funcion usuario, or <code>null</code> if a funcion usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.FuncionUsuario fetchByPrimaryKey(
		long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the funcion usuarios.
	*
	* @return the funcion usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.FuncionUsuario> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the funcion usuarios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.FuncionUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of funcion usuarios
	* @param end the upper bound of the range of funcion usuarios (not inclusive)
	* @return the range of funcion usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.FuncionUsuario> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the funcion usuarios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.FuncionUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of funcion usuarios
	* @param end the upper bound of the range of funcion usuarios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of funcion usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.FuncionUsuario> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the funcion usuarios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of funcion usuarios.
	*
	* @return the number of funcion usuarios
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
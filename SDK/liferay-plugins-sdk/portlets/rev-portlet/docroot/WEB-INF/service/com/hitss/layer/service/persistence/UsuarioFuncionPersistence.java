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

import com.hitss.layer.model.UsuarioFuncion;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the usuario funcion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see UsuarioFuncionPersistenceImpl
 * @see UsuarioFuncionUtil
 * @generated
 */
public interface UsuarioFuncionPersistence extends BasePersistence<UsuarioFuncion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UsuarioFuncionUtil} to access the usuario funcion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the usuario funcion in the entity cache if it is enabled.
	*
	* @param usuarioFuncion the usuario funcion
	*/
	public void cacheResult(com.hitss.layer.model.UsuarioFuncion usuarioFuncion);

	/**
	* Caches the usuario funcions in the entity cache if it is enabled.
	*
	* @param usuarioFuncions the usuario funcions
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.UsuarioFuncion> usuarioFuncions);

	/**
	* Creates a new usuario funcion with the primary key. Does not add the usuario funcion to the database.
	*
	* @param usuarioFuncionPK the primary key for the new usuario funcion
	* @return the new usuario funcion
	*/
	public com.hitss.layer.model.UsuarioFuncion create(
		com.hitss.layer.service.persistence.UsuarioFuncionPK usuarioFuncionPK);

	/**
	* Removes the usuario funcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param usuarioFuncionPK the primary key of the usuario funcion
	* @return the usuario funcion that was removed
	* @throws com.hitss.layer.NoSuchUsuarioFuncionException if a usuario funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.UsuarioFuncion remove(
		com.hitss.layer.service.persistence.UsuarioFuncionPK usuarioFuncionPK)
		throws com.hitss.layer.NoSuchUsuarioFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.UsuarioFuncion updateImpl(
		com.hitss.layer.model.UsuarioFuncion usuarioFuncion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the usuario funcion with the primary key or throws a {@link com.hitss.layer.NoSuchUsuarioFuncionException} if it could not be found.
	*
	* @param usuarioFuncionPK the primary key of the usuario funcion
	* @return the usuario funcion
	* @throws com.hitss.layer.NoSuchUsuarioFuncionException if a usuario funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.UsuarioFuncion findByPrimaryKey(
		com.hitss.layer.service.persistence.UsuarioFuncionPK usuarioFuncionPK)
		throws com.hitss.layer.NoSuchUsuarioFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the usuario funcion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param usuarioFuncionPK the primary key of the usuario funcion
	* @return the usuario funcion, or <code>null</code> if a usuario funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.UsuarioFuncion fetchByPrimaryKey(
		com.hitss.layer.service.persistence.UsuarioFuncionPK usuarioFuncionPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the usuario funcions.
	*
	* @return the usuario funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.UsuarioFuncion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the usuario funcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuario funcions
	* @param end the upper bound of the range of usuario funcions (not inclusive)
	* @return the range of usuario funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.UsuarioFuncion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the usuario funcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuario funcions
	* @param end the upper bound of the range of usuario funcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of usuario funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.UsuarioFuncion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the usuario funcions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of usuario funcions.
	*
	* @return the number of usuario funcions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
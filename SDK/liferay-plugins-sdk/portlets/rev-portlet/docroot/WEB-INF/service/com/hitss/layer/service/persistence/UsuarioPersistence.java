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

import com.hitss.layer.model.Usuario;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see UsuarioPersistenceImpl
 * @see UsuarioUtil
 * @generated
 */
public interface UsuarioPersistence extends BasePersistence<Usuario> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UsuarioUtil} to access the usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the usuarios where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Usuario> findByUsuariosSeleccionados(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the usuarios where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of usuarios
	* @param end the upper bound of the range of usuarios (not inclusive)
	* @return the range of matching usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Usuario> findByUsuariosSeleccionados(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the usuarios where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of usuarios
	* @param end the upper bound of the range of usuarios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Usuario> findByUsuariosSeleccionados(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first usuario in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching usuario
	* @throws com.hitss.layer.NoSuchUsuarioException if a matching usuario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Usuario findByUsuariosSeleccionados_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchUsuarioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first usuario in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching usuario, or <code>null</code> if a matching usuario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Usuario fetchByUsuariosSeleccionados_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last usuario in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching usuario
	* @throws com.hitss.layer.NoSuchUsuarioException if a matching usuario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Usuario findByUsuariosSeleccionados_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchUsuarioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last usuario in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching usuario, or <code>null</code> if a matching usuario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Usuario fetchByUsuariosSeleccionados_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the usuarios where userId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userIds the user IDs
	* @return the matching usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Usuario> findByUsuariosSeleccionados(
		long[] userIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the usuarios where userId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userIds the user IDs
	* @param start the lower bound of the range of usuarios
	* @param end the upper bound of the range of usuarios (not inclusive)
	* @return the range of matching usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Usuario> findByUsuariosSeleccionados(
		long[] userIds, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the usuarios where userId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userIds the user IDs
	* @param start the lower bound of the range of usuarios
	* @param end the upper bound of the range of usuarios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Usuario> findByUsuariosSeleccionados(
		long[] userIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the usuarios where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUsuariosSeleccionados(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of usuarios where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching usuarios
	* @throws SystemException if a system exception occurred
	*/
	public int countByUsuariosSeleccionados(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of usuarios where userId = any &#63;.
	*
	* @param userIds the user IDs
	* @return the number of matching usuarios
	* @throws SystemException if a system exception occurred
	*/
	public int countByUsuariosSeleccionados(long[] userIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the usuario in the entity cache if it is enabled.
	*
	* @param usuario the usuario
	*/
	public void cacheResult(com.hitss.layer.model.Usuario usuario);

	/**
	* Caches the usuarios in the entity cache if it is enabled.
	*
	* @param usuarios the usuarios
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.Usuario> usuarios);

	/**
	* Creates a new usuario with the primary key. Does not add the usuario to the database.
	*
	* @param userId the primary key for the new usuario
	* @return the new usuario
	*/
	public com.hitss.layer.model.Usuario create(long userId);

	/**
	* Removes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userId the primary key of the usuario
	* @return the usuario that was removed
	* @throws com.hitss.layer.NoSuchUsuarioException if a usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Usuario remove(long userId)
		throws com.hitss.layer.NoSuchUsuarioException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.Usuario updateImpl(
		com.hitss.layer.model.Usuario usuario)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the usuario with the primary key or throws a {@link com.hitss.layer.NoSuchUsuarioException} if it could not be found.
	*
	* @param userId the primary key of the usuario
	* @return the usuario
	* @throws com.hitss.layer.NoSuchUsuarioException if a usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Usuario findByPrimaryKey(long userId)
		throws com.hitss.layer.NoSuchUsuarioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the usuario with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userId the primary key of the usuario
	* @return the usuario, or <code>null</code> if a usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Usuario fetchByPrimaryKey(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the usuarios.
	*
	* @return the usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Usuario> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the usuarios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuarios
	* @param end the upper bound of the range of usuarios (not inclusive)
	* @return the range of usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Usuario> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the usuarios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuarios
	* @param end the upper bound of the range of usuarios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Usuario> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the usuarios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of usuarios.
	*
	* @return the number of usuarios
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
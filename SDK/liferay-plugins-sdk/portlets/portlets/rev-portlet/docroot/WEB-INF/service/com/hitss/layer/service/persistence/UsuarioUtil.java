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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the usuario service. This utility wraps {@link UsuarioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see UsuarioPersistence
 * @see UsuarioPersistenceImpl
 * @generated
 */
public class UsuarioUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Usuario usuario) {
		getPersistence().clearCache(usuario);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Usuario> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Usuario> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Usuario> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Usuario update(Usuario usuario) throws SystemException {
		return getPersistence().update(usuario);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Usuario update(Usuario usuario, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(usuario, serviceContext);
	}

	/**
	* Returns all the usuarios where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching usuarios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Usuario> findByUsuariosSeleccionados(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUsuariosSeleccionados(userId);
	}

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
	public static java.util.List<com.hitss.layer.model.Usuario> findByUsuariosSeleccionados(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUsuariosSeleccionados(userId, start, end);
	}

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
	public static java.util.List<com.hitss.layer.model.Usuario> findByUsuariosSeleccionados(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUsuariosSeleccionados(userId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first usuario in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching usuario
	* @throws com.hitss.layer.NoSuchUsuarioException if a matching usuario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Usuario findByUsuariosSeleccionados_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchUsuarioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUsuariosSeleccionados_First(userId, orderByComparator);
	}

	/**
	* Returns the first usuario in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching usuario, or <code>null</code> if a matching usuario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Usuario fetchByUsuariosSeleccionados_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUsuariosSeleccionados_First(userId, orderByComparator);
	}

	/**
	* Returns the last usuario in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching usuario
	* @throws com.hitss.layer.NoSuchUsuarioException if a matching usuario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Usuario findByUsuariosSeleccionados_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchUsuarioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUsuariosSeleccionados_Last(userId, orderByComparator);
	}

	/**
	* Returns the last usuario in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching usuario, or <code>null</code> if a matching usuario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Usuario fetchByUsuariosSeleccionados_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUsuariosSeleccionados_Last(userId, orderByComparator);
	}

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
	public static java.util.List<com.hitss.layer.model.Usuario> findByUsuariosSeleccionados(
		long[] userIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUsuariosSeleccionados(userIds);
	}

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
	public static java.util.List<com.hitss.layer.model.Usuario> findByUsuariosSeleccionados(
		long[] userIds, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUsuariosSeleccionados(userIds, start, end);
	}

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
	public static java.util.List<com.hitss.layer.model.Usuario> findByUsuariosSeleccionados(
		long[] userIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUsuariosSeleccionados(userIds, start, end,
			orderByComparator);
	}

	/**
	* Removes all the usuarios where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUsuariosSeleccionados(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUsuariosSeleccionados(userId);
	}

	/**
	* Returns the number of usuarios where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching usuarios
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUsuariosSeleccionados(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUsuariosSeleccionados(userId);
	}

	/**
	* Returns the number of usuarios where userId = any &#63;.
	*
	* @param userIds the user IDs
	* @return the number of matching usuarios
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUsuariosSeleccionados(long[] userIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUsuariosSeleccionados(userIds);
	}

	/**
	* Caches the usuario in the entity cache if it is enabled.
	*
	* @param usuario the usuario
	*/
	public static void cacheResult(com.hitss.layer.model.Usuario usuario) {
		getPersistence().cacheResult(usuario);
	}

	/**
	* Caches the usuarios in the entity cache if it is enabled.
	*
	* @param usuarios the usuarios
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.Usuario> usuarios) {
		getPersistence().cacheResult(usuarios);
	}

	/**
	* Creates a new usuario with the primary key. Does not add the usuario to the database.
	*
	* @param userId the primary key for the new usuario
	* @return the new usuario
	*/
	public static com.hitss.layer.model.Usuario create(long userId) {
		return getPersistence().create(userId);
	}

	/**
	* Removes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userId the primary key of the usuario
	* @return the usuario that was removed
	* @throws com.hitss.layer.NoSuchUsuarioException if a usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Usuario remove(long userId)
		throws com.hitss.layer.NoSuchUsuarioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(userId);
	}

	public static com.hitss.layer.model.Usuario updateImpl(
		com.hitss.layer.model.Usuario usuario)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(usuario);
	}

	/**
	* Returns the usuario with the primary key or throws a {@link com.hitss.layer.NoSuchUsuarioException} if it could not be found.
	*
	* @param userId the primary key of the usuario
	* @return the usuario
	* @throws com.hitss.layer.NoSuchUsuarioException if a usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Usuario findByPrimaryKey(long userId)
		throws com.hitss.layer.NoSuchUsuarioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(userId);
	}

	/**
	* Returns the usuario with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userId the primary key of the usuario
	* @return the usuario, or <code>null</code> if a usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Usuario fetchByPrimaryKey(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(userId);
	}

	/**
	* Returns all the usuarios.
	*
	* @return the usuarios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Usuario> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.hitss.layer.model.Usuario> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.hitss.layer.model.Usuario> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the usuarios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of usuarios.
	*
	* @return the number of usuarios
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the actividad plans associated with the usuario.
	*
	* @param pk the primary key of the usuario
	* @return the actividad plans associated with the usuario
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.ActividadPlan> getActividadPlans(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getActividadPlans(pk);
	}

	/**
	* Returns a range of all the actividad plans associated with the usuario.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the usuario
	* @param start the lower bound of the range of usuarios
	* @param end the upper bound of the range of usuarios (not inclusive)
	* @return the range of actividad plans associated with the usuario
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.ActividadPlan> getActividadPlans(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getActividadPlans(pk, start, end);
	}

	/**
	* Returns an ordered range of all the actividad plans associated with the usuario.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the usuario
	* @param start the lower bound of the range of usuarios
	* @param end the upper bound of the range of usuarios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of actividad plans associated with the usuario
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.ActividadPlan> getActividadPlans(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getActividadPlans(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of actividad plans associated with the usuario.
	*
	* @param pk the primary key of the usuario
	* @return the number of actividad plans associated with the usuario
	* @throws SystemException if a system exception occurred
	*/
	public static int getActividadPlansSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getActividadPlansSize(pk);
	}

	/**
	* Returns <code>true</code> if the actividad plan is associated with the usuario.
	*
	* @param pk the primary key of the usuario
	* @param actividadPlanPK the primary key of the actividad plan
	* @return <code>true</code> if the actividad plan is associated with the usuario; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsActividadPlan(long pk, long actividadPlanPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsActividadPlan(pk, actividadPlanPK);
	}

	/**
	* Returns <code>true</code> if the usuario has any actividad plans associated with it.
	*
	* @param pk the primary key of the usuario to check for associations with actividad plans
	* @return <code>true</code> if the usuario has any actividad plans associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsActividadPlans(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsActividadPlans(pk);
	}

	/**
	* Adds an association between the usuario and the actividad plan. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the usuario
	* @param actividadPlanPK the primary key of the actividad plan
	* @throws SystemException if a system exception occurred
	*/
	public static void addActividadPlan(long pk, long actividadPlanPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addActividadPlan(pk, actividadPlanPK);
	}

	/**
	* Adds an association between the usuario and the actividad plan. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the usuario
	* @param actividadPlan the actividad plan
	* @throws SystemException if a system exception occurred
	*/
	public static void addActividadPlan(long pk,
		com.hitss.layer.model.ActividadPlan actividadPlan)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addActividadPlan(pk, actividadPlan);
	}

	/**
	* Adds an association between the usuario and the actividad plans. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the usuario
	* @param actividadPlanPKs the primary keys of the actividad plans
	* @throws SystemException if a system exception occurred
	*/
	public static void addActividadPlans(long pk, long[] actividadPlanPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addActividadPlans(pk, actividadPlanPKs);
	}

	/**
	* Adds an association between the usuario and the actividad plans. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the usuario
	* @param actividadPlans the actividad plans
	* @throws SystemException if a system exception occurred
	*/
	public static void addActividadPlans(long pk,
		java.util.List<com.hitss.layer.model.ActividadPlan> actividadPlans)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addActividadPlans(pk, actividadPlans);
	}

	/**
	* Clears all associations between the usuario and its actividad plans. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the usuario to clear the associated actividad plans from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearActividadPlans(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearActividadPlans(pk);
	}

	/**
	* Removes the association between the usuario and the actividad plan. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the usuario
	* @param actividadPlanPK the primary key of the actividad plan
	* @throws SystemException if a system exception occurred
	*/
	public static void removeActividadPlan(long pk, long actividadPlanPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeActividadPlan(pk, actividadPlanPK);
	}

	/**
	* Removes the association between the usuario and the actividad plan. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the usuario
	* @param actividadPlan the actividad plan
	* @throws SystemException if a system exception occurred
	*/
	public static void removeActividadPlan(long pk,
		com.hitss.layer.model.ActividadPlan actividadPlan)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeActividadPlan(pk, actividadPlan);
	}

	/**
	* Removes the association between the usuario and the actividad plans. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the usuario
	* @param actividadPlanPKs the primary keys of the actividad plans
	* @throws SystemException if a system exception occurred
	*/
	public static void removeActividadPlans(long pk, long[] actividadPlanPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeActividadPlans(pk, actividadPlanPKs);
	}

	/**
	* Removes the association between the usuario and the actividad plans. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the usuario
	* @param actividadPlans the actividad plans
	* @throws SystemException if a system exception occurred
	*/
	public static void removeActividadPlans(long pk,
		java.util.List<com.hitss.layer.model.ActividadPlan> actividadPlans)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeActividadPlans(pk, actividadPlans);
	}

	/**
	* Sets the actividad plans associated with the usuario, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the usuario
	* @param actividadPlanPKs the primary keys of the actividad plans to be associated with the usuario
	* @throws SystemException if a system exception occurred
	*/
	public static void setActividadPlans(long pk, long[] actividadPlanPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setActividadPlans(pk, actividadPlanPKs);
	}

	/**
	* Sets the actividad plans associated with the usuario, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the usuario
	* @param actividadPlans the actividad plans to be associated with the usuario
	* @throws SystemException if a system exception occurred
	*/
	public static void setActividadPlans(long pk,
		java.util.List<com.hitss.layer.model.ActividadPlan> actividadPlans)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setActividadPlans(pk, actividadPlans);
	}

	public static UsuarioPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UsuarioPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					UsuarioPersistence.class.getName());

			ReferenceRegistry.registerReference(UsuarioUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(UsuarioPersistence persistence) {
	}

	private static UsuarioPersistence _persistence;
}
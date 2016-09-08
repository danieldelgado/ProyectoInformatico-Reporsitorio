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

import com.hitss.layer.model.ActividadPlanAccionUsuario;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the actividad plan accion usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see ActividadPlanAccionUsuarioPersistenceImpl
 * @see ActividadPlanAccionUsuarioUtil
 * @generated
 */
public interface ActividadPlanAccionUsuarioPersistence extends BasePersistence<ActividadPlanAccionUsuario> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ActividadPlanAccionUsuarioUtil} to access the actividad plan accion usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the actividad plan accion usuario in the entity cache if it is enabled.
	*
	* @param actividadPlanAccionUsuario the actividad plan accion usuario
	*/
	public void cacheResult(
		com.hitss.layer.model.ActividadPlanAccionUsuario actividadPlanAccionUsuario);

	/**
	* Caches the actividad plan accion usuarios in the entity cache if it is enabled.
	*
	* @param actividadPlanAccionUsuarios the actividad plan accion usuarios
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.ActividadPlanAccionUsuario> actividadPlanAccionUsuarios);

	/**
	* Creates a new actividad plan accion usuario with the primary key. Does not add the actividad plan accion usuario to the database.
	*
	* @param actividadPlanAccionUsuarioPK the primary key for the new actividad plan accion usuario
	* @return the new actividad plan accion usuario
	*/
	public com.hitss.layer.model.ActividadPlanAccionUsuario create(
		com.hitss.layer.service.persistence.ActividadPlanAccionUsuarioPK actividadPlanAccionUsuarioPK);

	/**
	* Removes the actividad plan accion usuario with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadPlanAccionUsuarioPK the primary key of the actividad plan accion usuario
	* @return the actividad plan accion usuario that was removed
	* @throws com.hitss.layer.NoSuchActividadPlanAccionUsuarioException if a actividad plan accion usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadPlanAccionUsuario remove(
		com.hitss.layer.service.persistence.ActividadPlanAccionUsuarioPK actividadPlanAccionUsuarioPK)
		throws com.hitss.layer.NoSuchActividadPlanAccionUsuarioException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.ActividadPlanAccionUsuario updateImpl(
		com.hitss.layer.model.ActividadPlanAccionUsuario actividadPlanAccionUsuario)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the actividad plan accion usuario with the primary key or throws a {@link com.hitss.layer.NoSuchActividadPlanAccionUsuarioException} if it could not be found.
	*
	* @param actividadPlanAccionUsuarioPK the primary key of the actividad plan accion usuario
	* @return the actividad plan accion usuario
	* @throws com.hitss.layer.NoSuchActividadPlanAccionUsuarioException if a actividad plan accion usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadPlanAccionUsuario findByPrimaryKey(
		com.hitss.layer.service.persistence.ActividadPlanAccionUsuarioPK actividadPlanAccionUsuarioPK)
		throws com.hitss.layer.NoSuchActividadPlanAccionUsuarioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the actividad plan accion usuario with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param actividadPlanAccionUsuarioPK the primary key of the actividad plan accion usuario
	* @return the actividad plan accion usuario, or <code>null</code> if a actividad plan accion usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadPlanAccionUsuario fetchByPrimaryKey(
		com.hitss.layer.service.persistence.ActividadPlanAccionUsuarioPK actividadPlanAccionUsuarioPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the actividad plan accion usuarios.
	*
	* @return the actividad plan accion usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.ActividadPlanAccionUsuario> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the actividad plan accion usuarios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadPlanAccionUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of actividad plan accion usuarios
	* @param end the upper bound of the range of actividad plan accion usuarios (not inclusive)
	* @return the range of actividad plan accion usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.ActividadPlanAccionUsuario> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the actividad plan accion usuarios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadPlanAccionUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of actividad plan accion usuarios
	* @param end the upper bound of the range of actividad plan accion usuarios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of actividad plan accion usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.ActividadPlanAccionUsuario> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the actividad plan accion usuarios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of actividad plan accion usuarios.
	*
	* @return the number of actividad plan accion usuarios
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
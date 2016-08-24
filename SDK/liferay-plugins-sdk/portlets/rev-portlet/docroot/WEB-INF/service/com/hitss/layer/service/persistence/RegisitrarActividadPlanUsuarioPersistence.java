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

import com.hitss.layer.model.RegisitrarActividadPlanUsuario;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the regisitrar actividad plan usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see RegisitrarActividadPlanUsuarioPersistenceImpl
 * @see RegisitrarActividadPlanUsuarioUtil
 * @generated
 */
public interface RegisitrarActividadPlanUsuarioPersistence
	extends BasePersistence<RegisitrarActividadPlanUsuario> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RegisitrarActividadPlanUsuarioUtil} to access the regisitrar actividad plan usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the regisitrar actividad plan usuario in the entity cache if it is enabled.
	*
	* @param regisitrarActividadPlanUsuario the regisitrar actividad plan usuario
	*/
	public void cacheResult(
		com.hitss.layer.model.RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario);

	/**
	* Caches the regisitrar actividad plan usuarios in the entity cache if it is enabled.
	*
	* @param regisitrarActividadPlanUsuarios the regisitrar actividad plan usuarios
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.RegisitrarActividadPlanUsuario> regisitrarActividadPlanUsuarios);

	/**
	* Creates a new regisitrar actividad plan usuario with the primary key. Does not add the regisitrar actividad plan usuario to the database.
	*
	* @param regisitrarActividadPlanUsuarioPK the primary key for the new regisitrar actividad plan usuario
	* @return the new regisitrar actividad plan usuario
	*/
	public com.hitss.layer.model.RegisitrarActividadPlanUsuario create(
		RegisitrarActividadPlanUsuarioPK regisitrarActividadPlanUsuarioPK);

	/**
	* Removes the regisitrar actividad plan usuario with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param regisitrarActividadPlanUsuarioPK the primary key of the regisitrar actividad plan usuario
	* @return the regisitrar actividad plan usuario that was removed
	* @throws com.hitss.layer.NoSuchRegisitrarActividadPlanUsuarioException if a regisitrar actividad plan usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.RegisitrarActividadPlanUsuario remove(
		RegisitrarActividadPlanUsuarioPK regisitrarActividadPlanUsuarioPK)
		throws com.hitss.layer.NoSuchRegisitrarActividadPlanUsuarioException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.RegisitrarActividadPlanUsuario updateImpl(
		com.hitss.layer.model.RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the regisitrar actividad plan usuario with the primary key or throws a {@link com.hitss.layer.NoSuchRegisitrarActividadPlanUsuarioException} if it could not be found.
	*
	* @param regisitrarActividadPlanUsuarioPK the primary key of the regisitrar actividad plan usuario
	* @return the regisitrar actividad plan usuario
	* @throws com.hitss.layer.NoSuchRegisitrarActividadPlanUsuarioException if a regisitrar actividad plan usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.RegisitrarActividadPlanUsuario findByPrimaryKey(
		RegisitrarActividadPlanUsuarioPK regisitrarActividadPlanUsuarioPK)
		throws com.hitss.layer.NoSuchRegisitrarActividadPlanUsuarioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the regisitrar actividad plan usuario with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param regisitrarActividadPlanUsuarioPK the primary key of the regisitrar actividad plan usuario
	* @return the regisitrar actividad plan usuario, or <code>null</code> if a regisitrar actividad plan usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.RegisitrarActividadPlanUsuario fetchByPrimaryKey(
		RegisitrarActividadPlanUsuarioPK regisitrarActividadPlanUsuarioPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the regisitrar actividad plan usuarios.
	*
	* @return the regisitrar actividad plan usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.RegisitrarActividadPlanUsuario> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the regisitrar actividad plan usuarios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.RegisitrarActividadPlanUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of regisitrar actividad plan usuarios
	* @param end the upper bound of the range of regisitrar actividad plan usuarios (not inclusive)
	* @return the range of regisitrar actividad plan usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.RegisitrarActividadPlanUsuario> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the regisitrar actividad plan usuarios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.RegisitrarActividadPlanUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of regisitrar actividad plan usuarios
	* @param end the upper bound of the range of regisitrar actividad plan usuarios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of regisitrar actividad plan usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.RegisitrarActividadPlanUsuario> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the regisitrar actividad plan usuarios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of regisitrar actividad plan usuarios.
	*
	* @return the number of regisitrar actividad plan usuarios
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
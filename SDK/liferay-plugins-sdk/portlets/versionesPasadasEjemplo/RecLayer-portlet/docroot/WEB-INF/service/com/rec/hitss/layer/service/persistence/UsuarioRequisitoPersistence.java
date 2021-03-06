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

import com.rec.hitss.layer.model.UsuarioRequisito;

/**
 * The persistence interface for the usuario requisito service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see UsuarioRequisitoPersistenceImpl
 * @see UsuarioRequisitoUtil
 * @generated
 */
public interface UsuarioRequisitoPersistence extends BasePersistence<UsuarioRequisito> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UsuarioRequisitoUtil} to access the usuario requisito persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the usuario requisito in the entity cache if it is enabled.
	*
	* @param usuarioRequisito the usuario requisito
	*/
	public void cacheResult(
		com.rec.hitss.layer.model.UsuarioRequisito usuarioRequisito);

	/**
	* Caches the usuario requisitos in the entity cache if it is enabled.
	*
	* @param usuarioRequisitos the usuario requisitos
	*/
	public void cacheResult(
		java.util.List<com.rec.hitss.layer.model.UsuarioRequisito> usuarioRequisitos);

	/**
	* Creates a new usuario requisito with the primary key. Does not add the usuario requisito to the database.
	*
	* @param usuarioRequisitoPK the primary key for the new usuario requisito
	* @return the new usuario requisito
	*/
	public com.rec.hitss.layer.model.UsuarioRequisito create(
		com.rec.hitss.layer.service.persistence.UsuarioRequisitoPK usuarioRequisitoPK);

	/**
	* Removes the usuario requisito with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param usuarioRequisitoPK the primary key of the usuario requisito
	* @return the usuario requisito that was removed
	* @throws com.rec.hitss.layer.NoSuchUsuarioRequisitoException if a usuario requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.UsuarioRequisito remove(
		com.rec.hitss.layer.service.persistence.UsuarioRequisitoPK usuarioRequisitoPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchUsuarioRequisitoException;

	public com.rec.hitss.layer.model.UsuarioRequisito updateImpl(
		com.rec.hitss.layer.model.UsuarioRequisito usuarioRequisito)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the usuario requisito with the primary key or throws a {@link com.rec.hitss.layer.NoSuchUsuarioRequisitoException} if it could not be found.
	*
	* @param usuarioRequisitoPK the primary key of the usuario requisito
	* @return the usuario requisito
	* @throws com.rec.hitss.layer.NoSuchUsuarioRequisitoException if a usuario requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.UsuarioRequisito findByPrimaryKey(
		com.rec.hitss.layer.service.persistence.UsuarioRequisitoPK usuarioRequisitoPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchUsuarioRequisitoException;

	/**
	* Returns the usuario requisito with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param usuarioRequisitoPK the primary key of the usuario requisito
	* @return the usuario requisito, or <code>null</code> if a usuario requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rec.hitss.layer.model.UsuarioRequisito fetchByPrimaryKey(
		com.rec.hitss.layer.service.persistence.UsuarioRequisitoPK usuarioRequisitoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the usuario requisitos.
	*
	* @return the usuario requisitos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.UsuarioRequisito> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the usuario requisitos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.UsuarioRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuario requisitos
	* @param end the upper bound of the range of usuario requisitos (not inclusive)
	* @return the range of usuario requisitos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.UsuarioRequisito> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the usuario requisitos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.UsuarioRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuario requisitos
	* @param end the upper bound of the range of usuario requisitos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of usuario requisitos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rec.hitss.layer.model.UsuarioRequisito> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the usuario requisitos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of usuario requisitos.
	*
	* @return the number of usuario requisitos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
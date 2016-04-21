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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.rec.hitss.layer.model.UsuarioGrupo;

import java.util.List;

/**
 * The persistence utility for the usuario grupo service. This utility wraps {@link UsuarioGrupoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see UsuarioGrupoPersistence
 * @see UsuarioGrupoPersistenceImpl
 * @generated
 */
public class UsuarioGrupoUtil {
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
	public static void clearCache(UsuarioGrupo usuarioGrupo) {
		getPersistence().clearCache(usuarioGrupo);
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
	public static List<UsuarioGrupo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UsuarioGrupo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UsuarioGrupo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static UsuarioGrupo update(UsuarioGrupo usuarioGrupo)
		throws SystemException {
		return getPersistence().update(usuarioGrupo);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static UsuarioGrupo update(UsuarioGrupo usuarioGrupo,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(usuarioGrupo, serviceContext);
	}

	/**
	* Caches the usuario grupo in the entity cache if it is enabled.
	*
	* @param usuarioGrupo the usuario grupo
	*/
	public static void cacheResult(
		com.rec.hitss.layer.model.UsuarioGrupo usuarioGrupo) {
		getPersistence().cacheResult(usuarioGrupo);
	}

	/**
	* Caches the usuario grupos in the entity cache if it is enabled.
	*
	* @param usuarioGrupos the usuario grupos
	*/
	public static void cacheResult(
		java.util.List<com.rec.hitss.layer.model.UsuarioGrupo> usuarioGrupos) {
		getPersistence().cacheResult(usuarioGrupos);
	}

	/**
	* Creates a new usuario grupo with the primary key. Does not add the usuario grupo to the database.
	*
	* @param userGroupId the primary key for the new usuario grupo
	* @return the new usuario grupo
	*/
	public static com.rec.hitss.layer.model.UsuarioGrupo create(
		long userGroupId) {
		return getPersistence().create(userGroupId);
	}

	/**
	* Removes the usuario grupo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userGroupId the primary key of the usuario grupo
	* @return the usuario grupo that was removed
	* @throws com.rec.hitss.layer.NoSuchUsuarioGrupoException if a usuario grupo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.UsuarioGrupo remove(
		long userGroupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchUsuarioGrupoException {
		return getPersistence().remove(userGroupId);
	}

	public static com.rec.hitss.layer.model.UsuarioGrupo updateImpl(
		com.rec.hitss.layer.model.UsuarioGrupo usuarioGrupo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(usuarioGrupo);
	}

	/**
	* Returns the usuario grupo with the primary key or throws a {@link com.rec.hitss.layer.NoSuchUsuarioGrupoException} if it could not be found.
	*
	* @param userGroupId the primary key of the usuario grupo
	* @return the usuario grupo
	* @throws com.rec.hitss.layer.NoSuchUsuarioGrupoException if a usuario grupo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.UsuarioGrupo findByPrimaryKey(
		long userGroupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchUsuarioGrupoException {
		return getPersistence().findByPrimaryKey(userGroupId);
	}

	/**
	* Returns the usuario grupo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userGroupId the primary key of the usuario grupo
	* @return the usuario grupo, or <code>null</code> if a usuario grupo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.UsuarioGrupo fetchByPrimaryKey(
		long userGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(userGroupId);
	}

	/**
	* Returns all the usuario grupos.
	*
	* @return the usuario grupos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.UsuarioGrupo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the usuario grupos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.UsuarioGrupoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuario grupos
	* @param end the upper bound of the range of usuario grupos (not inclusive)
	* @return the range of usuario grupos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.UsuarioGrupo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the usuario grupos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.UsuarioGrupoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuario grupos
	* @param end the upper bound of the range of usuario grupos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of usuario grupos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.UsuarioGrupo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the usuario grupos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of usuario grupos.
	*
	* @return the number of usuario grupos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UsuarioGrupoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UsuarioGrupoPersistence)PortletBeanLocatorUtil.locate(com.rec.hitss.layer.service.ClpSerializer.getServletContextName(),
					UsuarioGrupoPersistence.class.getName());

			ReferenceRegistry.registerReference(UsuarioGrupoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(UsuarioGrupoPersistence persistence) {
	}

	private static UsuarioGrupoPersistence _persistence;
}
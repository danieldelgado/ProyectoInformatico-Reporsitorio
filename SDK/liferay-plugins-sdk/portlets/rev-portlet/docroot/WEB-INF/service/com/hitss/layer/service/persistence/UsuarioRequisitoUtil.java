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

import com.hitss.layer.model.UsuarioRequisito;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the usuario requisito service. This utility wraps {@link UsuarioRequisitoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see UsuarioRequisitoPersistence
 * @see UsuarioRequisitoPersistenceImpl
 * @generated
 */
public class UsuarioRequisitoUtil {
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
	public static void clearCache(UsuarioRequisito usuarioRequisito) {
		getPersistence().clearCache(usuarioRequisito);
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
	public static List<UsuarioRequisito> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UsuarioRequisito> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UsuarioRequisito> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static UsuarioRequisito update(UsuarioRequisito usuarioRequisito)
		throws SystemException {
		return getPersistence().update(usuarioRequisito);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static UsuarioRequisito update(UsuarioRequisito usuarioRequisito,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(usuarioRequisito, serviceContext);
	}

	/**
	* Returns all the usuario requisitos where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching usuario requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.UsuarioRequisito> findByU(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU(userId);
	}

	/**
	* Returns a range of all the usuario requisitos where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of usuario requisitos
	* @param end the upper bound of the range of usuario requisitos (not inclusive)
	* @return the range of matching usuario requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.UsuarioRequisito> findByU(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU(userId, start, end);
	}

	/**
	* Returns an ordered range of all the usuario requisitos where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of usuario requisitos
	* @param end the upper bound of the range of usuario requisitos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching usuario requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.UsuarioRequisito> findByU(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first usuario requisito in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching usuario requisito
	* @throws com.hitss.layer.NoSuchUsuarioRequisitoException if a matching usuario requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.UsuarioRequisito findByU_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchUsuarioRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_First(userId, orderByComparator);
	}

	/**
	* Returns the first usuario requisito in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching usuario requisito, or <code>null</code> if a matching usuario requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.UsuarioRequisito fetchByU_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByU_First(userId, orderByComparator);
	}

	/**
	* Returns the last usuario requisito in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching usuario requisito
	* @throws com.hitss.layer.NoSuchUsuarioRequisitoException if a matching usuario requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.UsuarioRequisito findByU_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchUsuarioRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_Last(userId, orderByComparator);
	}

	/**
	* Returns the last usuario requisito in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching usuario requisito, or <code>null</code> if a matching usuario requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.UsuarioRequisito fetchByU_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByU_Last(userId, orderByComparator);
	}

	/**
	* Returns the usuario requisitos before and after the current usuario requisito in the ordered set where userId = &#63;.
	*
	* @param usuarioRequisitoPK the primary key of the current usuario requisito
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next usuario requisito
	* @throws com.hitss.layer.NoSuchUsuarioRequisitoException if a usuario requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.UsuarioRequisito[] findByU_PrevAndNext(
		com.hitss.layer.service.persistence.UsuarioRequisitoPK usuarioRequisitoPK,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchUsuarioRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_PrevAndNext(usuarioRequisitoPK, userId,
			orderByComparator);
	}

	/**
	* Removes all the usuario requisitos where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByU(userId);
	}

	/**
	* Returns the number of usuario requisitos where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching usuario requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU(userId);
	}

	/**
	* Caches the usuario requisito in the entity cache if it is enabled.
	*
	* @param usuarioRequisito the usuario requisito
	*/
	public static void cacheResult(
		com.hitss.layer.model.UsuarioRequisito usuarioRequisito) {
		getPersistence().cacheResult(usuarioRequisito);
	}

	/**
	* Caches the usuario requisitos in the entity cache if it is enabled.
	*
	* @param usuarioRequisitos the usuario requisitos
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.UsuarioRequisito> usuarioRequisitos) {
		getPersistence().cacheResult(usuarioRequisitos);
	}

	/**
	* Creates a new usuario requisito with the primary key. Does not add the usuario requisito to the database.
	*
	* @param usuarioRequisitoPK the primary key for the new usuario requisito
	* @return the new usuario requisito
	*/
	public static com.hitss.layer.model.UsuarioRequisito create(
		com.hitss.layer.service.persistence.UsuarioRequisitoPK usuarioRequisitoPK) {
		return getPersistence().create(usuarioRequisitoPK);
	}

	/**
	* Removes the usuario requisito with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param usuarioRequisitoPK the primary key of the usuario requisito
	* @return the usuario requisito that was removed
	* @throws com.hitss.layer.NoSuchUsuarioRequisitoException if a usuario requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.UsuarioRequisito remove(
		com.hitss.layer.service.persistence.UsuarioRequisitoPK usuarioRequisitoPK)
		throws com.hitss.layer.NoSuchUsuarioRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(usuarioRequisitoPK);
	}

	public static com.hitss.layer.model.UsuarioRequisito updateImpl(
		com.hitss.layer.model.UsuarioRequisito usuarioRequisito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(usuarioRequisito);
	}

	/**
	* Returns the usuario requisito with the primary key or throws a {@link com.hitss.layer.NoSuchUsuarioRequisitoException} if it could not be found.
	*
	* @param usuarioRequisitoPK the primary key of the usuario requisito
	* @return the usuario requisito
	* @throws com.hitss.layer.NoSuchUsuarioRequisitoException if a usuario requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.UsuarioRequisito findByPrimaryKey(
		com.hitss.layer.service.persistence.UsuarioRequisitoPK usuarioRequisitoPK)
		throws com.hitss.layer.NoSuchUsuarioRequisitoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(usuarioRequisitoPK);
	}

	/**
	* Returns the usuario requisito with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param usuarioRequisitoPK the primary key of the usuario requisito
	* @return the usuario requisito, or <code>null</code> if a usuario requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.UsuarioRequisito fetchByPrimaryKey(
		com.hitss.layer.service.persistence.UsuarioRequisitoPK usuarioRequisitoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(usuarioRequisitoPK);
	}

	/**
	* Returns all the usuario requisitos.
	*
	* @return the usuario requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.UsuarioRequisito> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the usuario requisitos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuario requisitos
	* @param end the upper bound of the range of usuario requisitos (not inclusive)
	* @return the range of usuario requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.UsuarioRequisito> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the usuario requisitos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of usuario requisitos
	* @param end the upper bound of the range of usuario requisitos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of usuario requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.UsuarioRequisito> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the usuario requisitos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of usuario requisitos.
	*
	* @return the number of usuario requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UsuarioRequisitoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UsuarioRequisitoPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					UsuarioRequisitoPersistence.class.getName());

			ReferenceRegistry.registerReference(UsuarioRequisitoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(UsuarioRequisitoPersistence persistence) {
	}

	private static UsuarioRequisitoPersistence _persistence;
}
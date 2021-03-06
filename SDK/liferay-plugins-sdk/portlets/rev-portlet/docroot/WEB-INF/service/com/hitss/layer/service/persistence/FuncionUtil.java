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

import com.hitss.layer.model.Funcion;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the funcion service. This utility wraps {@link FuncionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see FuncionPersistence
 * @see FuncionPersistenceImpl
 * @generated
 */
public class FuncionUtil {
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
	public static void clearCache(Funcion funcion) {
		getPersistence().clearCache(funcion);
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
	public static List<Funcion> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Funcion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Funcion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Funcion update(Funcion funcion) throws SystemException {
		return getPersistence().update(funcion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Funcion update(Funcion funcion, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(funcion, serviceContext);
	}

	/**
	* Returns all the funcions where activo = &#63;.
	*
	* @param activo the activo
	* @return the matching funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Funcion> findByF_Activo(
		boolean activo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_Activo(activo);
	}

	/**
	* Returns a range of all the funcions where activo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param activo the activo
	* @param start the lower bound of the range of funcions
	* @param end the upper bound of the range of funcions (not inclusive)
	* @return the range of matching funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Funcion> findByF_Activo(
		boolean activo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_Activo(activo, start, end);
	}

	/**
	* Returns an ordered range of all the funcions where activo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param activo the activo
	* @param start the lower bound of the range of funcions
	* @param end the upper bound of the range of funcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Funcion> findByF_Activo(
		boolean activo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_Activo(activo, start, end, orderByComparator);
	}

	/**
	* Returns the first funcion in the ordered set where activo = &#63;.
	*
	* @param activo the activo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching funcion
	* @throws com.hitss.layer.NoSuchFuncionException if a matching funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion findByF_Activo_First(
		boolean activo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_Activo_First(activo, orderByComparator);
	}

	/**
	* Returns the first funcion in the ordered set where activo = &#63;.
	*
	* @param activo the activo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching funcion, or <code>null</code> if a matching funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion fetchByF_Activo_First(
		boolean activo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_Activo_First(activo, orderByComparator);
	}

	/**
	* Returns the last funcion in the ordered set where activo = &#63;.
	*
	* @param activo the activo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching funcion
	* @throws com.hitss.layer.NoSuchFuncionException if a matching funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion findByF_Activo_Last(
		boolean activo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_Activo_Last(activo, orderByComparator);
	}

	/**
	* Returns the last funcion in the ordered set where activo = &#63;.
	*
	* @param activo the activo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching funcion, or <code>null</code> if a matching funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion fetchByF_Activo_Last(
		boolean activo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_Activo_Last(activo, orderByComparator);
	}

	/**
	* Returns the funcions before and after the current funcion in the ordered set where activo = &#63;.
	*
	* @param funcionId the primary key of the current funcion
	* @param activo the activo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next funcion
	* @throws com.hitss.layer.NoSuchFuncionException if a funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion[] findByF_Activo_PrevAndNext(
		long funcionId, boolean activo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_Activo_PrevAndNext(funcionId, activo,
			orderByComparator);
	}

	/**
	* Removes all the funcions where activo = &#63; from the database.
	*
	* @param activo the activo
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_Activo(boolean activo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByF_Activo(activo);
	}

	/**
	* Returns the number of funcions where activo = &#63;.
	*
	* @param activo the activo
	* @return the number of matching funcions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_Activo(boolean activo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_Activo(activo);
	}

	/**
	* Returns all the funcions where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @return the matching funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Funcion> findByD_Activo(
		java.lang.String descripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_Activo(descripcion);
	}

	/**
	* Returns a range of all the funcions where descripcion LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param descripcion the descripcion
	* @param start the lower bound of the range of funcions
	* @param end the upper bound of the range of funcions (not inclusive)
	* @return the range of matching funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Funcion> findByD_Activo(
		java.lang.String descripcion, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_Activo(descripcion, start, end);
	}

	/**
	* Returns an ordered range of all the funcions where descripcion LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param descripcion the descripcion
	* @param start the lower bound of the range of funcions
	* @param end the upper bound of the range of funcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Funcion> findByD_Activo(
		java.lang.String descripcion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_Activo(descripcion, start, end, orderByComparator);
	}

	/**
	* Returns the first funcion in the ordered set where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching funcion
	* @throws com.hitss.layer.NoSuchFuncionException if a matching funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion findByD_Activo_First(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_Activo_First(descripcion, orderByComparator);
	}

	/**
	* Returns the first funcion in the ordered set where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching funcion, or <code>null</code> if a matching funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion fetchByD_Activo_First(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_Activo_First(descripcion, orderByComparator);
	}

	/**
	* Returns the last funcion in the ordered set where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching funcion
	* @throws com.hitss.layer.NoSuchFuncionException if a matching funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion findByD_Activo_Last(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_Activo_Last(descripcion, orderByComparator);
	}

	/**
	* Returns the last funcion in the ordered set where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching funcion, or <code>null</code> if a matching funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion fetchByD_Activo_Last(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_Activo_Last(descripcion, orderByComparator);
	}

	/**
	* Returns the funcions before and after the current funcion in the ordered set where descripcion LIKE &#63;.
	*
	* @param funcionId the primary key of the current funcion
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next funcion
	* @throws com.hitss.layer.NoSuchFuncionException if a funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion[] findByD_Activo_PrevAndNext(
		long funcionId, java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_Activo_PrevAndNext(funcionId, descripcion,
			orderByComparator);
	}

	/**
	* Removes all the funcions where descripcion LIKE &#63; from the database.
	*
	* @param descripcion the descripcion
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByD_Activo(java.lang.String descripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByD_Activo(descripcion);
	}

	/**
	* Returns the number of funcions where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @return the number of matching funcions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByD_Activo(java.lang.String descripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByD_Activo(descripcion);
	}

	/**
	* Caches the funcion in the entity cache if it is enabled.
	*
	* @param funcion the funcion
	*/
	public static void cacheResult(com.hitss.layer.model.Funcion funcion) {
		getPersistence().cacheResult(funcion);
	}

	/**
	* Caches the funcions in the entity cache if it is enabled.
	*
	* @param funcions the funcions
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.Funcion> funcions) {
		getPersistence().cacheResult(funcions);
	}

	/**
	* Creates a new funcion with the primary key. Does not add the funcion to the database.
	*
	* @param funcionId the primary key for the new funcion
	* @return the new funcion
	*/
	public static com.hitss.layer.model.Funcion create(long funcionId) {
		return getPersistence().create(funcionId);
	}

	/**
	* Removes the funcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param funcionId the primary key of the funcion
	* @return the funcion that was removed
	* @throws com.hitss.layer.NoSuchFuncionException if a funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion remove(long funcionId)
		throws com.hitss.layer.NoSuchFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(funcionId);
	}

	public static com.hitss.layer.model.Funcion updateImpl(
		com.hitss.layer.model.Funcion funcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(funcion);
	}

	/**
	* Returns the funcion with the primary key or throws a {@link com.hitss.layer.NoSuchFuncionException} if it could not be found.
	*
	* @param funcionId the primary key of the funcion
	* @return the funcion
	* @throws com.hitss.layer.NoSuchFuncionException if a funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion findByPrimaryKey(long funcionId)
		throws com.hitss.layer.NoSuchFuncionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(funcionId);
	}

	/**
	* Returns the funcion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param funcionId the primary key of the funcion
	* @return the funcion, or <code>null</code> if a funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Funcion fetchByPrimaryKey(
		long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(funcionId);
	}

	/**
	* Returns all the funcions.
	*
	* @return the funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Funcion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the funcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of funcions
	* @param end the upper bound of the range of funcions (not inclusive)
	* @return the range of funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Funcion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the funcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of funcions
	* @param end the upper bound of the range of funcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of funcions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Funcion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the funcions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of funcions.
	*
	* @return the number of funcions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FuncionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FuncionPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					FuncionPersistence.class.getName());

			ReferenceRegistry.registerReference(FuncionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(FuncionPersistence persistence) {
	}

	private static FuncionPersistence _persistence;
}
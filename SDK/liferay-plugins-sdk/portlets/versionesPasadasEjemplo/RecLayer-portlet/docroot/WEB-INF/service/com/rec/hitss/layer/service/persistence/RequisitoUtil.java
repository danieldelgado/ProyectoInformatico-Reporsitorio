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

import com.rec.hitss.layer.model.Requisito;

import java.util.List;

/**
 * The persistence utility for the requisito service. This utility wraps {@link RequisitoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see RequisitoPersistence
 * @see RequisitoPersistenceImpl
 * @generated
 */
public class RequisitoUtil {
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
	public static void clearCache(Requisito requisito) {
		getPersistence().clearCache(requisito);
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
	public static List<Requisito> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Requisito> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Requisito> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Requisito update(Requisito requisito)
		throws SystemException {
		return getPersistence().update(requisito);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Requisito update(Requisito requisito,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(requisito, serviceContext);
	}

	/**
	* Returns all the requisitos where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @return the matching requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.Requisito> findByfiltroDescripcion(
		java.lang.String descripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfiltroDescripcion(descripcion);
	}

	/**
	* Returns a range of all the requisitos where descripcion LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.RequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param descripcion the descripcion
	* @param start the lower bound of the range of requisitos
	* @param end the upper bound of the range of requisitos (not inclusive)
	* @return the range of matching requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.Requisito> findByfiltroDescripcion(
		java.lang.String descripcion, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfiltroDescripcion(descripcion, start, end);
	}

	/**
	* Returns an ordered range of all the requisitos where descripcion LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.RequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param descripcion the descripcion
	* @param start the lower bound of the range of requisitos
	* @param end the upper bound of the range of requisitos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.Requisito> findByfiltroDescripcion(
		java.lang.String descripcion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfiltroDescripcion(descripcion, start, end,
			orderByComparator);
	}

	/**
	* Returns the first requisito in the ordered set where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching requisito
	* @throws com.rec.hitss.layer.NoSuchRequisitoException if a matching requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.Requisito findByfiltroDescripcion_First(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRequisitoException {
		return getPersistence()
				   .findByfiltroDescripcion_First(descripcion, orderByComparator);
	}

	/**
	* Returns the first requisito in the ordered set where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching requisito, or <code>null</code> if a matching requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.Requisito fetchByfiltroDescripcion_First(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfiltroDescripcion_First(descripcion,
			orderByComparator);
	}

	/**
	* Returns the last requisito in the ordered set where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching requisito
	* @throws com.rec.hitss.layer.NoSuchRequisitoException if a matching requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.Requisito findByfiltroDescripcion_Last(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRequisitoException {
		return getPersistence()
				   .findByfiltroDescripcion_Last(descripcion, orderByComparator);
	}

	/**
	* Returns the last requisito in the ordered set where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching requisito, or <code>null</code> if a matching requisito could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.Requisito fetchByfiltroDescripcion_Last(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfiltroDescripcion_Last(descripcion, orderByComparator);
	}

	/**
	* Returns the requisitos before and after the current requisito in the ordered set where descripcion LIKE &#63;.
	*
	* @param requisitoId the primary key of the current requisito
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next requisito
	* @throws com.rec.hitss.layer.NoSuchRequisitoException if a requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.Requisito[] findByfiltroDescripcion_PrevAndNext(
		long requisitoId, java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRequisitoException {
		return getPersistence()
				   .findByfiltroDescripcion_PrevAndNext(requisitoId,
			descripcion, orderByComparator);
	}

	/**
	* Removes all the requisitos where descripcion LIKE &#63; from the database.
	*
	* @param descripcion the descripcion
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfiltroDescripcion(java.lang.String descripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfiltroDescripcion(descripcion);
	}

	/**
	* Returns the number of requisitos where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @return the number of matching requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfiltroDescripcion(java.lang.String descripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfiltroDescripcion(descripcion);
	}

	/**
	* Caches the requisito in the entity cache if it is enabled.
	*
	* @param requisito the requisito
	*/
	public static void cacheResult(
		com.rec.hitss.layer.model.Requisito requisito) {
		getPersistence().cacheResult(requisito);
	}

	/**
	* Caches the requisitos in the entity cache if it is enabled.
	*
	* @param requisitos the requisitos
	*/
	public static void cacheResult(
		java.util.List<com.rec.hitss.layer.model.Requisito> requisitos) {
		getPersistence().cacheResult(requisitos);
	}

	/**
	* Creates a new requisito with the primary key. Does not add the requisito to the database.
	*
	* @param requisitoId the primary key for the new requisito
	* @return the new requisito
	*/
	public static com.rec.hitss.layer.model.Requisito create(long requisitoId) {
		return getPersistence().create(requisitoId);
	}

	/**
	* Removes the requisito with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param requisitoId the primary key of the requisito
	* @return the requisito that was removed
	* @throws com.rec.hitss.layer.NoSuchRequisitoException if a requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.Requisito remove(long requisitoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRequisitoException {
		return getPersistence().remove(requisitoId);
	}

	public static com.rec.hitss.layer.model.Requisito updateImpl(
		com.rec.hitss.layer.model.Requisito requisito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(requisito);
	}

	/**
	* Returns the requisito with the primary key or throws a {@link com.rec.hitss.layer.NoSuchRequisitoException} if it could not be found.
	*
	* @param requisitoId the primary key of the requisito
	* @return the requisito
	* @throws com.rec.hitss.layer.NoSuchRequisitoException if a requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.Requisito findByPrimaryKey(
		long requisitoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rec.hitss.layer.NoSuchRequisitoException {
		return getPersistence().findByPrimaryKey(requisitoId);
	}

	/**
	* Returns the requisito with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param requisitoId the primary key of the requisito
	* @return the requisito, or <code>null</code> if a requisito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rec.hitss.layer.model.Requisito fetchByPrimaryKey(
		long requisitoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(requisitoId);
	}

	/**
	* Returns all the requisitos.
	*
	* @return the requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.Requisito> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the requisitos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.RequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of requisitos
	* @param end the upper bound of the range of requisitos (not inclusive)
	* @return the range of requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.Requisito> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the requisitos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.RequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of requisitos
	* @param end the upper bound of the range of requisitos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rec.hitss.layer.model.Requisito> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the requisitos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of requisitos.
	*
	* @return the number of requisitos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RequisitoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RequisitoPersistence)PortletBeanLocatorUtil.locate(com.rec.hitss.layer.service.ClpSerializer.getServletContextName(),
					RequisitoPersistence.class.getName());

			ReferenceRegistry.registerReference(RequisitoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(RequisitoPersistence persistence) {
	}

	private static RequisitoPersistence _persistence;
}
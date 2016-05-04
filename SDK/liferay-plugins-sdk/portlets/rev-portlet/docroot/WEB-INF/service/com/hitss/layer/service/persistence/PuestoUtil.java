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

import com.hitss.layer.model.Puesto;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the puesto service. This utility wraps {@link PuestoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PuestoPersistence
 * @see PuestoPersistenceImpl
 * @generated
 */
public class PuestoUtil {
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
	public static void clearCache(Puesto puesto) {
		getPersistence().clearCache(puesto);
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
	public static List<Puesto> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Puesto> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Puesto> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Puesto update(Puesto puesto) throws SystemException {
		return getPersistence().update(puesto);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Puesto update(Puesto puesto, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(puesto, serviceContext);
	}

	/**
	* Returns all the puestos where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @return the matching puestos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Puesto> findByfiltroDescripcion(
		java.lang.String descripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfiltroDescripcion(descripcion);
	}

	/**
	* Returns a range of all the puestos where descripcion LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PuestoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param descripcion the descripcion
	* @param start the lower bound of the range of puestos
	* @param end the upper bound of the range of puestos (not inclusive)
	* @return the range of matching puestos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Puesto> findByfiltroDescripcion(
		java.lang.String descripcion, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfiltroDescripcion(descripcion, start, end);
	}

	/**
	* Returns an ordered range of all the puestos where descripcion LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PuestoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param descripcion the descripcion
	* @param start the lower bound of the range of puestos
	* @param end the upper bound of the range of puestos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching puestos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Puesto> findByfiltroDescripcion(
		java.lang.String descripcion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfiltroDescripcion(descripcion, start, end,
			orderByComparator);
	}

	/**
	* Returns the first puesto in the ordered set where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching puesto
	* @throws com.hitss.layer.NoSuchPuestoException if a matching puesto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Puesto findByfiltroDescripcion_First(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPuestoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfiltroDescripcion_First(descripcion, orderByComparator);
	}

	/**
	* Returns the first puesto in the ordered set where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching puesto, or <code>null</code> if a matching puesto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Puesto fetchByfiltroDescripcion_First(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfiltroDescripcion_First(descripcion,
			orderByComparator);
	}

	/**
	* Returns the last puesto in the ordered set where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching puesto
	* @throws com.hitss.layer.NoSuchPuestoException if a matching puesto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Puesto findByfiltroDescripcion_Last(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPuestoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfiltroDescripcion_Last(descripcion, orderByComparator);
	}

	/**
	* Returns the last puesto in the ordered set where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching puesto, or <code>null</code> if a matching puesto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Puesto fetchByfiltroDescripcion_Last(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfiltroDescripcion_Last(descripcion, orderByComparator);
	}

	/**
	* Returns the puestos before and after the current puesto in the ordered set where descripcion LIKE &#63;.
	*
	* @param puestoId the primary key of the current puesto
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next puesto
	* @throws com.hitss.layer.NoSuchPuestoException if a puesto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Puesto[] findByfiltroDescripcion_PrevAndNext(
		long puestoId, java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPuestoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfiltroDescripcion_PrevAndNext(puestoId, descripcion,
			orderByComparator);
	}

	/**
	* Removes all the puestos where descripcion LIKE &#63; from the database.
	*
	* @param descripcion the descripcion
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfiltroDescripcion(java.lang.String descripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfiltroDescripcion(descripcion);
	}

	/**
	* Returns the number of puestos where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @return the number of matching puestos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfiltroDescripcion(java.lang.String descripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfiltroDescripcion(descripcion);
	}

	/**
	* Caches the puesto in the entity cache if it is enabled.
	*
	* @param puesto the puesto
	*/
	public static void cacheResult(com.hitss.layer.model.Puesto puesto) {
		getPersistence().cacheResult(puesto);
	}

	/**
	* Caches the puestos in the entity cache if it is enabled.
	*
	* @param puestos the puestos
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.Puesto> puestos) {
		getPersistence().cacheResult(puestos);
	}

	/**
	* Creates a new puesto with the primary key. Does not add the puesto to the database.
	*
	* @param puestoId the primary key for the new puesto
	* @return the new puesto
	*/
	public static com.hitss.layer.model.Puesto create(long puestoId) {
		return getPersistence().create(puestoId);
	}

	/**
	* Removes the puesto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param puestoId the primary key of the puesto
	* @return the puesto that was removed
	* @throws com.hitss.layer.NoSuchPuestoException if a puesto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Puesto remove(long puestoId)
		throws com.hitss.layer.NoSuchPuestoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(puestoId);
	}

	public static com.hitss.layer.model.Puesto updateImpl(
		com.hitss.layer.model.Puesto puesto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(puesto);
	}

	/**
	* Returns the puesto with the primary key or throws a {@link com.hitss.layer.NoSuchPuestoException} if it could not be found.
	*
	* @param puestoId the primary key of the puesto
	* @return the puesto
	* @throws com.hitss.layer.NoSuchPuestoException if a puesto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Puesto findByPrimaryKey(long puestoId)
		throws com.hitss.layer.NoSuchPuestoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(puestoId);
	}

	/**
	* Returns the puesto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param puestoId the primary key of the puesto
	* @return the puesto, or <code>null</code> if a puesto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Puesto fetchByPrimaryKey(long puestoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(puestoId);
	}

	/**
	* Returns all the puestos.
	*
	* @return the puestos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Puesto> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the puestos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PuestoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of puestos
	* @param end the upper bound of the range of puestos (not inclusive)
	* @return the range of puestos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Puesto> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the puestos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PuestoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of puestos
	* @param end the upper bound of the range of puestos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of puestos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Puesto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the puestos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of puestos.
	*
	* @return the number of puestos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PuestoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PuestoPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					PuestoPersistence.class.getName());

			ReferenceRegistry.registerReference(PuestoUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PuestoPersistence persistence) {
	}

	private static PuestoPersistence _persistence;
}
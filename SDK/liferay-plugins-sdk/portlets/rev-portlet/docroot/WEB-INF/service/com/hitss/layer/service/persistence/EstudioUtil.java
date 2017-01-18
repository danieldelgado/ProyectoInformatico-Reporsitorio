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

import com.hitss.layer.model.Estudio;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the estudio service. This utility wraps {@link EstudioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see EstudioPersistence
 * @see EstudioPersistenceImpl
 * @generated
 */
public class EstudioUtil {
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
	public static void clearCache(Estudio estudio) {
		getPersistence().clearCache(estudio);
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
	public static List<Estudio> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Estudio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Estudio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Estudio update(Estudio estudio) throws SystemException {
		return getPersistence().update(estudio);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Estudio update(Estudio estudio, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(estudio, serviceContext);
	}

	/**
	* Returns all the estudios where usuarioId = &#63;.
	*
	* @param usuarioId the usuario ID
	* @return the matching estudios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Estudio> findByU(
		long usuarioId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU(usuarioId);
	}

	/**
	* Returns a range of all the estudios where usuarioId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EstudioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param usuarioId the usuario ID
	* @param start the lower bound of the range of estudios
	* @param end the upper bound of the range of estudios (not inclusive)
	* @return the range of matching estudios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Estudio> findByU(
		long usuarioId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU(usuarioId, start, end);
	}

	/**
	* Returns an ordered range of all the estudios where usuarioId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EstudioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param usuarioId the usuario ID
	* @param start the lower bound of the range of estudios
	* @param end the upper bound of the range of estudios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching estudios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Estudio> findByU(
		long usuarioId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU(usuarioId, start, end, orderByComparator);
	}

	/**
	* Returns the first estudio in the ordered set where usuarioId = &#63;.
	*
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching estudio
	* @throws com.hitss.layer.NoSuchEstudioException if a matching estudio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Estudio findByU_First(long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchEstudioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_First(usuarioId, orderByComparator);
	}

	/**
	* Returns the first estudio in the ordered set where usuarioId = &#63;.
	*
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching estudio, or <code>null</code> if a matching estudio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Estudio fetchByU_First(long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByU_First(usuarioId, orderByComparator);
	}

	/**
	* Returns the last estudio in the ordered set where usuarioId = &#63;.
	*
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching estudio
	* @throws com.hitss.layer.NoSuchEstudioException if a matching estudio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Estudio findByU_Last(long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchEstudioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_Last(usuarioId, orderByComparator);
	}

	/**
	* Returns the last estudio in the ordered set where usuarioId = &#63;.
	*
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching estudio, or <code>null</code> if a matching estudio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Estudio fetchByU_Last(long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByU_Last(usuarioId, orderByComparator);
	}

	/**
	* Returns the estudios before and after the current estudio in the ordered set where usuarioId = &#63;.
	*
	* @param estudioPK the primary key of the current estudio
	* @param usuarioId the usuario ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next estudio
	* @throws com.hitss.layer.NoSuchEstudioException if a estudio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Estudio[] findByU_PrevAndNext(
		com.hitss.layer.service.persistence.EstudioPK estudioPK,
		long usuarioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchEstudioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_PrevAndNext(estudioPK, usuarioId, orderByComparator);
	}

	/**
	* Removes all the estudios where usuarioId = &#63; from the database.
	*
	* @param usuarioId the usuario ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByU(long usuarioId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByU(usuarioId);
	}

	/**
	* Returns the number of estudios where usuarioId = &#63;.
	*
	* @param usuarioId the usuario ID
	* @return the number of matching estudios
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU(long usuarioId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU(usuarioId);
	}

	/**
	* Caches the estudio in the entity cache if it is enabled.
	*
	* @param estudio the estudio
	*/
	public static void cacheResult(com.hitss.layer.model.Estudio estudio) {
		getPersistence().cacheResult(estudio);
	}

	/**
	* Caches the estudios in the entity cache if it is enabled.
	*
	* @param estudios the estudios
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.Estudio> estudios) {
		getPersistence().cacheResult(estudios);
	}

	/**
	* Creates a new estudio with the primary key. Does not add the estudio to the database.
	*
	* @param estudioPK the primary key for the new estudio
	* @return the new estudio
	*/
	public static com.hitss.layer.model.Estudio create(
		com.hitss.layer.service.persistence.EstudioPK estudioPK) {
		return getPersistence().create(estudioPK);
	}

	/**
	* Removes the estudio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param estudioPK the primary key of the estudio
	* @return the estudio that was removed
	* @throws com.hitss.layer.NoSuchEstudioException if a estudio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Estudio remove(
		com.hitss.layer.service.persistence.EstudioPK estudioPK)
		throws com.hitss.layer.NoSuchEstudioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(estudioPK);
	}

	public static com.hitss.layer.model.Estudio updateImpl(
		com.hitss.layer.model.Estudio estudio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(estudio);
	}

	/**
	* Returns the estudio with the primary key or throws a {@link com.hitss.layer.NoSuchEstudioException} if it could not be found.
	*
	* @param estudioPK the primary key of the estudio
	* @return the estudio
	* @throws com.hitss.layer.NoSuchEstudioException if a estudio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Estudio findByPrimaryKey(
		com.hitss.layer.service.persistence.EstudioPK estudioPK)
		throws com.hitss.layer.NoSuchEstudioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(estudioPK);
	}

	/**
	* Returns the estudio with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param estudioPK the primary key of the estudio
	* @return the estudio, or <code>null</code> if a estudio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Estudio fetchByPrimaryKey(
		com.hitss.layer.service.persistence.EstudioPK estudioPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(estudioPK);
	}

	/**
	* Returns all the estudios.
	*
	* @return the estudios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Estudio> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the estudios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EstudioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of estudios
	* @param end the upper bound of the range of estudios (not inclusive)
	* @return the range of estudios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Estudio> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the estudios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EstudioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of estudios
	* @param end the upper bound of the range of estudios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of estudios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Estudio> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the estudios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of estudios.
	*
	* @return the number of estudios
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EstudioPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EstudioPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					EstudioPersistence.class.getName());

			ReferenceRegistry.registerReference(EstudioUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EstudioPersistence persistence) {
	}

	private static EstudioPersistence _persistence;
}
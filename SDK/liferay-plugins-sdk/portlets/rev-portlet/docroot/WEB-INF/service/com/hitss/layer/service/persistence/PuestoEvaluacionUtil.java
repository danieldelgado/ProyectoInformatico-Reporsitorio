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

import com.hitss.layer.model.PuestoEvaluacion;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the puesto evaluacion service. This utility wraps {@link PuestoEvaluacionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PuestoEvaluacionPersistence
 * @see PuestoEvaluacionPersistenceImpl
 * @generated
 */
public class PuestoEvaluacionUtil {
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
	public static void clearCache(PuestoEvaluacion puestoEvaluacion) {
		getPersistence().clearCache(puestoEvaluacion);
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
	public static List<PuestoEvaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PuestoEvaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PuestoEvaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PuestoEvaluacion update(PuestoEvaluacion puestoEvaluacion)
		throws SystemException {
		return getPersistence().update(puestoEvaluacion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PuestoEvaluacion update(PuestoEvaluacion puestoEvaluacion,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(puestoEvaluacion, serviceContext);
	}

	/**
	* Returns all the puesto evaluacions where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @return the matching puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.PuestoEvaluacion> findByS_ALL(
		long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_ALL(solicitudFuncionId);
	}

	/**
	* Returns a range of all the puesto evaluacions where solicitudFuncionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param start the lower bound of the range of puesto evaluacions
	* @param end the upper bound of the range of puesto evaluacions (not inclusive)
	* @return the range of matching puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.PuestoEvaluacion> findByS_ALL(
		long solicitudFuncionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_ALL(solicitudFuncionId, start, end);
	}

	/**
	* Returns an ordered range of all the puesto evaluacions where solicitudFuncionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param start the lower bound of the range of puesto evaluacions
	* @param end the upper bound of the range of puesto evaluacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.PuestoEvaluacion> findByS_ALL(
		long solicitudFuncionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_ALL(solicitudFuncionId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching puesto evaluacion
	* @throws com.hitss.layer.NoSuchPuestoEvaluacionException if a matching puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PuestoEvaluacion findByS_ALL_First(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_ALL_First(solicitudFuncionId, orderByComparator);
	}

	/**
	* Returns the first puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching puesto evaluacion, or <code>null</code> if a matching puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PuestoEvaluacion fetchByS_ALL_First(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_ALL_First(solicitudFuncionId, orderByComparator);
	}

	/**
	* Returns the last puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching puesto evaluacion
	* @throws com.hitss.layer.NoSuchPuestoEvaluacionException if a matching puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PuestoEvaluacion findByS_ALL_Last(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_ALL_Last(solicitudFuncionId, orderByComparator);
	}

	/**
	* Returns the last puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching puesto evaluacion, or <code>null</code> if a matching puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PuestoEvaluacion fetchByS_ALL_Last(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_ALL_Last(solicitudFuncionId, orderByComparator);
	}

	/**
	* Returns the puesto evaluacions before and after the current puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param puestoEvaluacionPK the primary key of the current puesto evaluacion
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next puesto evaluacion
	* @throws com.hitss.layer.NoSuchPuestoEvaluacionException if a puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PuestoEvaluacion[] findByS_ALL_PrevAndNext(
		com.hitss.layer.service.persistence.PuestoEvaluacionPK puestoEvaluacionPK,
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_ALL_PrevAndNext(puestoEvaluacionPK,
			solicitudFuncionId, orderByComparator);
	}

	/**
	* Removes all the puesto evaluacions where solicitudFuncionId = &#63; from the database.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_ALL(long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS_ALL(solicitudFuncionId);
	}

	/**
	* Returns the number of puesto evaluacions where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @return the number of matching puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_ALL(long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS_ALL(solicitudFuncionId);
	}

	/**
	* Caches the puesto evaluacion in the entity cache if it is enabled.
	*
	* @param puestoEvaluacion the puesto evaluacion
	*/
	public static void cacheResult(
		com.hitss.layer.model.PuestoEvaluacion puestoEvaluacion) {
		getPersistence().cacheResult(puestoEvaluacion);
	}

	/**
	* Caches the puesto evaluacions in the entity cache if it is enabled.
	*
	* @param puestoEvaluacions the puesto evaluacions
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.PuestoEvaluacion> puestoEvaluacions) {
		getPersistence().cacheResult(puestoEvaluacions);
	}

	/**
	* Creates a new puesto evaluacion with the primary key. Does not add the puesto evaluacion to the database.
	*
	* @param puestoEvaluacionPK the primary key for the new puesto evaluacion
	* @return the new puesto evaluacion
	*/
	public static com.hitss.layer.model.PuestoEvaluacion create(
		com.hitss.layer.service.persistence.PuestoEvaluacionPK puestoEvaluacionPK) {
		return getPersistence().create(puestoEvaluacionPK);
	}

	/**
	* Removes the puesto evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param puestoEvaluacionPK the primary key of the puesto evaluacion
	* @return the puesto evaluacion that was removed
	* @throws com.hitss.layer.NoSuchPuestoEvaluacionException if a puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PuestoEvaluacion remove(
		com.hitss.layer.service.persistence.PuestoEvaluacionPK puestoEvaluacionPK)
		throws com.hitss.layer.NoSuchPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(puestoEvaluacionPK);
	}

	public static com.hitss.layer.model.PuestoEvaluacion updateImpl(
		com.hitss.layer.model.PuestoEvaluacion puestoEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(puestoEvaluacion);
	}

	/**
	* Returns the puesto evaluacion with the primary key or throws a {@link com.hitss.layer.NoSuchPuestoEvaluacionException} if it could not be found.
	*
	* @param puestoEvaluacionPK the primary key of the puesto evaluacion
	* @return the puesto evaluacion
	* @throws com.hitss.layer.NoSuchPuestoEvaluacionException if a puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PuestoEvaluacion findByPrimaryKey(
		com.hitss.layer.service.persistence.PuestoEvaluacionPK puestoEvaluacionPK)
		throws com.hitss.layer.NoSuchPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(puestoEvaluacionPK);
	}

	/**
	* Returns the puesto evaluacion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param puestoEvaluacionPK the primary key of the puesto evaluacion
	* @return the puesto evaluacion, or <code>null</code> if a puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PuestoEvaluacion fetchByPrimaryKey(
		com.hitss.layer.service.persistence.PuestoEvaluacionPK puestoEvaluacionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(puestoEvaluacionPK);
	}

	/**
	* Returns all the puesto evaluacions.
	*
	* @return the puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.PuestoEvaluacion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the puesto evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of puesto evaluacions
	* @param end the upper bound of the range of puesto evaluacions (not inclusive)
	* @return the range of puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.PuestoEvaluacion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the puesto evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of puesto evaluacions
	* @param end the upper bound of the range of puesto evaluacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.PuestoEvaluacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the puesto evaluacions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of puesto evaluacions.
	*
	* @return the number of puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PuestoEvaluacionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PuestoEvaluacionPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					PuestoEvaluacionPersistence.class.getName());

			ReferenceRegistry.registerReference(PuestoEvaluacionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PuestoEvaluacionPersistence persistence) {
	}

	private static PuestoEvaluacionPersistence _persistence;
}
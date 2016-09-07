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

import com.hitss.layer.model.PrioridadGrupoUsuarios;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the prioridad grupo usuarios service. This utility wraps {@link PrioridadGrupoUsuariosPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PrioridadGrupoUsuariosPersistence
 * @see PrioridadGrupoUsuariosPersistenceImpl
 * @generated
 */
public class PrioridadGrupoUsuariosUtil {
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
	public static void clearCache(PrioridadGrupoUsuarios prioridadGrupoUsuarios) {
		getPersistence().clearCache(prioridadGrupoUsuarios);
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
	public static List<PrioridadGrupoUsuarios> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PrioridadGrupoUsuarios> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PrioridadGrupoUsuarios> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PrioridadGrupoUsuarios update(
		PrioridadGrupoUsuarios prioridadGrupoUsuarios)
		throws SystemException {
		return getPersistence().update(prioridadGrupoUsuarios);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PrioridadGrupoUsuarios update(
		PrioridadGrupoUsuarios prioridadGrupoUsuarios,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(prioridadGrupoUsuarios, serviceContext);
	}

	/**
	* Returns all the prioridad grupo usuarioses where solicitudEvaluacionDesempennoId = &#63;.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @return the matching prioridad grupo usuarioses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.PrioridadGrupoUsuarios> findByS(
		long solicitudEvaluacionDesempennoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS(solicitudEvaluacionDesempennoId);
	}

	/**
	* Returns a range of all the prioridad grupo usuarioses where solicitudEvaluacionDesempennoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PrioridadGrupoUsuariosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @param start the lower bound of the range of prioridad grupo usuarioses
	* @param end the upper bound of the range of prioridad grupo usuarioses (not inclusive)
	* @return the range of matching prioridad grupo usuarioses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.PrioridadGrupoUsuarios> findByS(
		long solicitudEvaluacionDesempennoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS(solicitudEvaluacionDesempennoId, start, end);
	}

	/**
	* Returns an ordered range of all the prioridad grupo usuarioses where solicitudEvaluacionDesempennoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PrioridadGrupoUsuariosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @param start the lower bound of the range of prioridad grupo usuarioses
	* @param end the upper bound of the range of prioridad grupo usuarioses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching prioridad grupo usuarioses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.PrioridadGrupoUsuarios> findByS(
		long solicitudEvaluacionDesempennoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS(solicitudEvaluacionDesempennoId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first prioridad grupo usuarios in the ordered set where solicitudEvaluacionDesempennoId = &#63;.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prioridad grupo usuarios
	* @throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException if a matching prioridad grupo usuarios could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PrioridadGrupoUsuarios findByS_First(
		long solicitudEvaluacionDesempennoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_First(solicitudEvaluacionDesempennoId,
			orderByComparator);
	}

	/**
	* Returns the first prioridad grupo usuarios in the ordered set where solicitudEvaluacionDesempennoId = &#63;.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prioridad grupo usuarios, or <code>null</code> if a matching prioridad grupo usuarios could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PrioridadGrupoUsuarios fetchByS_First(
		long solicitudEvaluacionDesempennoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_First(solicitudEvaluacionDesempennoId,
			orderByComparator);
	}

	/**
	* Returns the last prioridad grupo usuarios in the ordered set where solicitudEvaluacionDesempennoId = &#63;.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prioridad grupo usuarios
	* @throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException if a matching prioridad grupo usuarios could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PrioridadGrupoUsuarios findByS_Last(
		long solicitudEvaluacionDesempennoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_Last(solicitudEvaluacionDesempennoId,
			orderByComparator);
	}

	/**
	* Returns the last prioridad grupo usuarios in the ordered set where solicitudEvaluacionDesempennoId = &#63;.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prioridad grupo usuarios, or <code>null</code> if a matching prioridad grupo usuarios could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PrioridadGrupoUsuarios fetchByS_Last(
		long solicitudEvaluacionDesempennoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_Last(solicitudEvaluacionDesempennoId,
			orderByComparator);
	}

	/**
	* Returns the prioridad grupo usuarioses before and after the current prioridad grupo usuarios in the ordered set where solicitudEvaluacionDesempennoId = &#63;.
	*
	* @param prioridadGrupoUsuariosId the primary key of the current prioridad grupo usuarios
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next prioridad grupo usuarios
	* @throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException if a prioridad grupo usuarios with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PrioridadGrupoUsuarios[] findByS_PrevAndNext(
		long prioridadGrupoUsuariosId, long solicitudEvaluacionDesempennoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_PrevAndNext(prioridadGrupoUsuariosId,
			solicitudEvaluacionDesempennoId, orderByComparator);
	}

	/**
	* Removes all the prioridad grupo usuarioses where solicitudEvaluacionDesempennoId = &#63; from the database.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS(long solicitudEvaluacionDesempennoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS(solicitudEvaluacionDesempennoId);
	}

	/**
	* Returns the number of prioridad grupo usuarioses where solicitudEvaluacionDesempennoId = &#63;.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @return the number of matching prioridad grupo usuarioses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS(long solicitudEvaluacionDesempennoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS(solicitudEvaluacionDesempennoId);
	}

	/**
	* Caches the prioridad grupo usuarios in the entity cache if it is enabled.
	*
	* @param prioridadGrupoUsuarios the prioridad grupo usuarios
	*/
	public static void cacheResult(
		com.hitss.layer.model.PrioridadGrupoUsuarios prioridadGrupoUsuarios) {
		getPersistence().cacheResult(prioridadGrupoUsuarios);
	}

	/**
	* Caches the prioridad grupo usuarioses in the entity cache if it is enabled.
	*
	* @param prioridadGrupoUsuarioses the prioridad grupo usuarioses
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.PrioridadGrupoUsuarios> prioridadGrupoUsuarioses) {
		getPersistence().cacheResult(prioridadGrupoUsuarioses);
	}

	/**
	* Creates a new prioridad grupo usuarios with the primary key. Does not add the prioridad grupo usuarios to the database.
	*
	* @param prioridadGrupoUsuariosId the primary key for the new prioridad grupo usuarios
	* @return the new prioridad grupo usuarios
	*/
	public static com.hitss.layer.model.PrioridadGrupoUsuarios create(
		long prioridadGrupoUsuariosId) {
		return getPersistence().create(prioridadGrupoUsuariosId);
	}

	/**
	* Removes the prioridad grupo usuarios with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param prioridadGrupoUsuariosId the primary key of the prioridad grupo usuarios
	* @return the prioridad grupo usuarios that was removed
	* @throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException if a prioridad grupo usuarios with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PrioridadGrupoUsuarios remove(
		long prioridadGrupoUsuariosId)
		throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(prioridadGrupoUsuariosId);
	}

	public static com.hitss.layer.model.PrioridadGrupoUsuarios updateImpl(
		com.hitss.layer.model.PrioridadGrupoUsuarios prioridadGrupoUsuarios)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(prioridadGrupoUsuarios);
	}

	/**
	* Returns the prioridad grupo usuarios with the primary key or throws a {@link com.hitss.layer.NoSuchPrioridadGrupoUsuariosException} if it could not be found.
	*
	* @param prioridadGrupoUsuariosId the primary key of the prioridad grupo usuarios
	* @return the prioridad grupo usuarios
	* @throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException if a prioridad grupo usuarios with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PrioridadGrupoUsuarios findByPrimaryKey(
		long prioridadGrupoUsuariosId)
		throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(prioridadGrupoUsuariosId);
	}

	/**
	* Returns the prioridad grupo usuarios with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param prioridadGrupoUsuariosId the primary key of the prioridad grupo usuarios
	* @return the prioridad grupo usuarios, or <code>null</code> if a prioridad grupo usuarios with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.PrioridadGrupoUsuarios fetchByPrimaryKey(
		long prioridadGrupoUsuariosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(prioridadGrupoUsuariosId);
	}

	/**
	* Returns all the prioridad grupo usuarioses.
	*
	* @return the prioridad grupo usuarioses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.PrioridadGrupoUsuarios> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the prioridad grupo usuarioses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PrioridadGrupoUsuariosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prioridad grupo usuarioses
	* @param end the upper bound of the range of prioridad grupo usuarioses (not inclusive)
	* @return the range of prioridad grupo usuarioses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.PrioridadGrupoUsuarios> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the prioridad grupo usuarioses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PrioridadGrupoUsuariosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prioridad grupo usuarioses
	* @param end the upper bound of the range of prioridad grupo usuarioses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of prioridad grupo usuarioses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.PrioridadGrupoUsuarios> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the prioridad grupo usuarioses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of prioridad grupo usuarioses.
	*
	* @return the number of prioridad grupo usuarioses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PrioridadGrupoUsuariosPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PrioridadGrupoUsuariosPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					PrioridadGrupoUsuariosPersistence.class.getName());

			ReferenceRegistry.registerReference(PrioridadGrupoUsuariosUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PrioridadGrupoUsuariosPersistence persistence) {
	}

	private static PrioridadGrupoUsuariosPersistence _persistence;
}
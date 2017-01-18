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

import com.hitss.layer.model.FasePostulacionPuestoEvaluacion;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the fase postulacion puesto evaluacion service. This utility wraps {@link FasePostulacionPuestoEvaluacionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see FasePostulacionPuestoEvaluacionPersistence
 * @see FasePostulacionPuestoEvaluacionPersistenceImpl
 * @generated
 */
public class FasePostulacionPuestoEvaluacionUtil {
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
	public static void clearCache(
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion) {
		getPersistence().clearCache(fasePostulacionPuestoEvaluacion);
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
	public static List<FasePostulacionPuestoEvaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FasePostulacionPuestoEvaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FasePostulacionPuestoEvaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static FasePostulacionPuestoEvaluacion update(
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion)
		throws SystemException {
		return getPersistence().update(fasePostulacionPuestoEvaluacion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static FasePostulacionPuestoEvaluacion update(
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(fasePostulacionPuestoEvaluacion, serviceContext);
	}

	/**
	* Returns all the fase postulacion puesto evaluacions where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @return the matching fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findByS(
		long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS(solicitudFuncionId);
	}

	/**
	* Returns a range of all the fase postulacion puesto evaluacions where solicitudFuncionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param start the lower bound of the range of fase postulacion puesto evaluacions
	* @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	* @return the range of matching fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findByS(
		long solicitudFuncionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS(solicitudFuncionId, start, end);
	}

	/**
	* Returns an ordered range of all the fase postulacion puesto evaluacions where solicitudFuncionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param start the lower bound of the range of fase postulacion puesto evaluacions
	* @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findByS(
		long solicitudFuncionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS(solicitudFuncionId, start, end, orderByComparator);
	}

	/**
	* Returns the first fase postulacion puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fase postulacion puesto evaluacion
	* @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a matching fase postulacion puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion findByS_First(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_First(solicitudFuncionId, orderByComparator);
	}

	/**
	* Returns the first fase postulacion puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fase postulacion puesto evaluacion, or <code>null</code> if a matching fase postulacion puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion fetchByS_First(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_First(solicitudFuncionId, orderByComparator);
	}

	/**
	* Returns the last fase postulacion puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fase postulacion puesto evaluacion
	* @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a matching fase postulacion puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion findByS_Last(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_Last(solicitudFuncionId, orderByComparator);
	}

	/**
	* Returns the last fase postulacion puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fase postulacion puesto evaluacion, or <code>null</code> if a matching fase postulacion puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion fetchByS_Last(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_Last(solicitudFuncionId, orderByComparator);
	}

	/**
	* Returns the fase postulacion puesto evaluacions before and after the current fase postulacion puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param fasePostulacionPuestoEvaluacionPK the primary key of the current fase postulacion puesto evaluacion
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next fase postulacion puesto evaluacion
	* @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion[] findByS_PrevAndNext(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK,
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_PrevAndNext(fasePostulacionPuestoEvaluacionPK,
			solicitudFuncionId, orderByComparator);
	}

	/**
	* Removes all the fase postulacion puesto evaluacions where solicitudFuncionId = &#63; from the database.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS(long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS(solicitudFuncionId);
	}

	/**
	* Returns the number of fase postulacion puesto evaluacions where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @return the number of matching fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS(long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS(solicitudFuncionId);
	}

	/**
	* Returns all the fase postulacion puesto evaluacions where evaluacionId = &#63;.
	*
	* @param evaluacionId the evaluacion ID
	* @return the matching fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findByE(
		long evaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByE(evaluacionId);
	}

	/**
	* Returns a range of all the fase postulacion puesto evaluacions where evaluacionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param evaluacionId the evaluacion ID
	* @param start the lower bound of the range of fase postulacion puesto evaluacions
	* @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	* @return the range of matching fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findByE(
		long evaluacionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByE(evaluacionId, start, end);
	}

	/**
	* Returns an ordered range of all the fase postulacion puesto evaluacions where evaluacionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param evaluacionId the evaluacion ID
	* @param start the lower bound of the range of fase postulacion puesto evaluacions
	* @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findByE(
		long evaluacionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByE(evaluacionId, start, end, orderByComparator);
	}

	/**
	* Returns the first fase postulacion puesto evaluacion in the ordered set where evaluacionId = &#63;.
	*
	* @param evaluacionId the evaluacion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fase postulacion puesto evaluacion
	* @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a matching fase postulacion puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion findByE_First(
		long evaluacionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByE_First(evaluacionId, orderByComparator);
	}

	/**
	* Returns the first fase postulacion puesto evaluacion in the ordered set where evaluacionId = &#63;.
	*
	* @param evaluacionId the evaluacion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fase postulacion puesto evaluacion, or <code>null</code> if a matching fase postulacion puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion fetchByE_First(
		long evaluacionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByE_First(evaluacionId, orderByComparator);
	}

	/**
	* Returns the last fase postulacion puesto evaluacion in the ordered set where evaluacionId = &#63;.
	*
	* @param evaluacionId the evaluacion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fase postulacion puesto evaluacion
	* @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a matching fase postulacion puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion findByE_Last(
		long evaluacionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByE_Last(evaluacionId, orderByComparator);
	}

	/**
	* Returns the last fase postulacion puesto evaluacion in the ordered set where evaluacionId = &#63;.
	*
	* @param evaluacionId the evaluacion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fase postulacion puesto evaluacion, or <code>null</code> if a matching fase postulacion puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion fetchByE_Last(
		long evaluacionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByE_Last(evaluacionId, orderByComparator);
	}

	/**
	* Returns the fase postulacion puesto evaluacions before and after the current fase postulacion puesto evaluacion in the ordered set where evaluacionId = &#63;.
	*
	* @param fasePostulacionPuestoEvaluacionPK the primary key of the current fase postulacion puesto evaluacion
	* @param evaluacionId the evaluacion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next fase postulacion puesto evaluacion
	* @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion[] findByE_PrevAndNext(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK,
		long evaluacionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByE_PrevAndNext(fasePostulacionPuestoEvaluacionPK,
			evaluacionId, orderByComparator);
	}

	/**
	* Removes all the fase postulacion puesto evaluacions where evaluacionId = &#63; from the database.
	*
	* @param evaluacionId the evaluacion ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByE(long evaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByE(evaluacionId);
	}

	/**
	* Returns the number of fase postulacion puesto evaluacions where evaluacionId = &#63;.
	*
	* @param evaluacionId the evaluacion ID
	* @return the number of matching fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByE(long evaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByE(evaluacionId);
	}

	/**
	* Caches the fase postulacion puesto evaluacion in the entity cache if it is enabled.
	*
	* @param fasePostulacionPuestoEvaluacion the fase postulacion puesto evaluacion
	*/
	public static void cacheResult(
		com.hitss.layer.model.FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion) {
		getPersistence().cacheResult(fasePostulacionPuestoEvaluacion);
	}

	/**
	* Caches the fase postulacion puesto evaluacions in the entity cache if it is enabled.
	*
	* @param fasePostulacionPuestoEvaluacions the fase postulacion puesto evaluacions
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> fasePostulacionPuestoEvaluacions) {
		getPersistence().cacheResult(fasePostulacionPuestoEvaluacions);
	}

	/**
	* Creates a new fase postulacion puesto evaluacion with the primary key. Does not add the fase postulacion puesto evaluacion to the database.
	*
	* @param fasePostulacionPuestoEvaluacionPK the primary key for the new fase postulacion puesto evaluacion
	* @return the new fase postulacion puesto evaluacion
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion create(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK) {
		return getPersistence().create(fasePostulacionPuestoEvaluacionPK);
	}

	/**
	* Removes the fase postulacion puesto evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fasePostulacionPuestoEvaluacionPK the primary key of the fase postulacion puesto evaluacion
	* @return the fase postulacion puesto evaluacion that was removed
	* @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion remove(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(fasePostulacionPuestoEvaluacionPK);
	}

	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion updateImpl(
		com.hitss.layer.model.FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(fasePostulacionPuestoEvaluacion);
	}

	/**
	* Returns the fase postulacion puesto evaluacion with the primary key or throws a {@link com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException} if it could not be found.
	*
	* @param fasePostulacionPuestoEvaluacionPK the primary key of the fase postulacion puesto evaluacion
	* @return the fase postulacion puesto evaluacion
	* @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion findByPrimaryKey(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPrimaryKey(fasePostulacionPuestoEvaluacionPK);
	}

	/**
	* Returns the fase postulacion puesto evaluacion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fasePostulacionPuestoEvaluacionPK the primary key of the fase postulacion puesto evaluacion
	* @return the fase postulacion puesto evaluacion, or <code>null</code> if a fase postulacion puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.FasePostulacionPuestoEvaluacion fetchByPrimaryKey(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPrimaryKey(fasePostulacionPuestoEvaluacionPK);
	}

	/**
	* Returns all the fase postulacion puesto evaluacions.
	*
	* @return the fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the fase postulacion puesto evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fase postulacion puesto evaluacions
	* @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	* @return the range of fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the fase postulacion puesto evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fase postulacion puesto evaluacions
	* @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the fase postulacion puesto evaluacions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of fase postulacion puesto evaluacions.
	*
	* @return the number of fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FasePostulacionPuestoEvaluacionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FasePostulacionPuestoEvaluacionPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					FasePostulacionPuestoEvaluacionPersistence.class.getName());

			ReferenceRegistry.registerReference(FasePostulacionPuestoEvaluacionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(
		FasePostulacionPuestoEvaluacionPersistence persistence) {
	}

	private static FasePostulacionPuestoEvaluacionPersistence _persistence;
}
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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the puesto evaluacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PuestoEvaluacionPersistenceImpl
 * @see PuestoEvaluacionUtil
 * @generated
 */
public interface PuestoEvaluacionPersistence extends BasePersistence<PuestoEvaluacion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PuestoEvaluacionUtil} to access the puesto evaluacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the puesto evaluacions where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @return the matching puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.PuestoEvaluacion> findByS_ALL(
		long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.PuestoEvaluacion> findByS_ALL(
		long solicitudFuncionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.PuestoEvaluacion> findByS_ALL(
		long solicitudFuncionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching puesto evaluacion
	* @throws com.hitss.layer.NoSuchPuestoEvaluacionException if a matching puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PuestoEvaluacion findByS_ALL_First(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching puesto evaluacion, or <code>null</code> if a matching puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PuestoEvaluacion fetchByS_ALL_First(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching puesto evaluacion
	* @throws com.hitss.layer.NoSuchPuestoEvaluacionException if a matching puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PuestoEvaluacion findByS_ALL_Last(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching puesto evaluacion, or <code>null</code> if a matching puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PuestoEvaluacion fetchByS_ALL_Last(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.PuestoEvaluacion[] findByS_ALL_PrevAndNext(
		com.hitss.layer.service.persistence.PuestoEvaluacionPK puestoEvaluacionPK,
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the puesto evaluacions where solicitudFuncionId = &#63; from the database.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_ALL(long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of puesto evaluacions where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @return the number of matching puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_ALL(long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the puesto evaluacion in the entity cache if it is enabled.
	*
	* @param puestoEvaluacion the puesto evaluacion
	*/
	public void cacheResult(
		com.hitss.layer.model.PuestoEvaluacion puestoEvaluacion);

	/**
	* Caches the puesto evaluacions in the entity cache if it is enabled.
	*
	* @param puestoEvaluacions the puesto evaluacions
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.PuestoEvaluacion> puestoEvaluacions);

	/**
	* Creates a new puesto evaluacion with the primary key. Does not add the puesto evaluacion to the database.
	*
	* @param puestoEvaluacionPK the primary key for the new puesto evaluacion
	* @return the new puesto evaluacion
	*/
	public com.hitss.layer.model.PuestoEvaluacion create(
		com.hitss.layer.service.persistence.PuestoEvaluacionPK puestoEvaluacionPK);

	/**
	* Removes the puesto evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param puestoEvaluacionPK the primary key of the puesto evaluacion
	* @return the puesto evaluacion that was removed
	* @throws com.hitss.layer.NoSuchPuestoEvaluacionException if a puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PuestoEvaluacion remove(
		com.hitss.layer.service.persistence.PuestoEvaluacionPK puestoEvaluacionPK)
		throws com.hitss.layer.NoSuchPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.PuestoEvaluacion updateImpl(
		com.hitss.layer.model.PuestoEvaluacion puestoEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the puesto evaluacion with the primary key or throws a {@link com.hitss.layer.NoSuchPuestoEvaluacionException} if it could not be found.
	*
	* @param puestoEvaluacionPK the primary key of the puesto evaluacion
	* @return the puesto evaluacion
	* @throws com.hitss.layer.NoSuchPuestoEvaluacionException if a puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PuestoEvaluacion findByPrimaryKey(
		com.hitss.layer.service.persistence.PuestoEvaluacionPK puestoEvaluacionPK)
		throws com.hitss.layer.NoSuchPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the puesto evaluacion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param puestoEvaluacionPK the primary key of the puesto evaluacion
	* @return the puesto evaluacion, or <code>null</code> if a puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PuestoEvaluacion fetchByPrimaryKey(
		com.hitss.layer.service.persistence.PuestoEvaluacionPK puestoEvaluacionPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the puesto evaluacions.
	*
	* @return the puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.PuestoEvaluacion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.PuestoEvaluacion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.PuestoEvaluacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the puesto evaluacions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of puesto evaluacions.
	*
	* @return the number of puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
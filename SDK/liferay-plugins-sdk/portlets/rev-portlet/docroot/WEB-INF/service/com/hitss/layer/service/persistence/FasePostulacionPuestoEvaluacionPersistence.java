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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the fase postulacion puesto evaluacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see FasePostulacionPuestoEvaluacionPersistenceImpl
 * @see FasePostulacionPuestoEvaluacionUtil
 * @generated
 */
public interface FasePostulacionPuestoEvaluacionPersistence
	extends BasePersistence<FasePostulacionPuestoEvaluacion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FasePostulacionPuestoEvaluacionUtil} to access the fase postulacion puesto evaluacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the fase postulacion puesto evaluacions where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @return the matching fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findByS(
		long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findByS(
		long solicitudFuncionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findByS(
		long solicitudFuncionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first fase postulacion puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fase postulacion puesto evaluacion
	* @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a matching fase postulacion puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion findByS_First(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first fase postulacion puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fase postulacion puesto evaluacion, or <code>null</code> if a matching fase postulacion puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion fetchByS_First(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last fase postulacion puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fase postulacion puesto evaluacion
	* @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a matching fase postulacion puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion findByS_Last(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last fase postulacion puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fase postulacion puesto evaluacion, or <code>null</code> if a matching fase postulacion puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion fetchByS_Last(
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion[] findByS_PrevAndNext(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK,
		long solicitudFuncionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the fase postulacion puesto evaluacions where solicitudFuncionId = &#63; from the database.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS(long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of fase postulacion puesto evaluacions where solicitudFuncionId = &#63;.
	*
	* @param solicitudFuncionId the solicitud funcion ID
	* @return the number of matching fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public int countByS(long solicitudFuncionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the fase postulacion puesto evaluacions where evaluacionId = &#63;.
	*
	* @param evaluacionId the evaluacion ID
	* @return the matching fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findByE(
		long evaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findByE(
		long evaluacionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findByE(
		long evaluacionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first fase postulacion puesto evaluacion in the ordered set where evaluacionId = &#63;.
	*
	* @param evaluacionId the evaluacion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fase postulacion puesto evaluacion
	* @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a matching fase postulacion puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion findByE_First(
		long evaluacionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first fase postulacion puesto evaluacion in the ordered set where evaluacionId = &#63;.
	*
	* @param evaluacionId the evaluacion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fase postulacion puesto evaluacion, or <code>null</code> if a matching fase postulacion puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion fetchByE_First(
		long evaluacionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last fase postulacion puesto evaluacion in the ordered set where evaluacionId = &#63;.
	*
	* @param evaluacionId the evaluacion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fase postulacion puesto evaluacion
	* @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a matching fase postulacion puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion findByE_Last(
		long evaluacionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last fase postulacion puesto evaluacion in the ordered set where evaluacionId = &#63;.
	*
	* @param evaluacionId the evaluacion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fase postulacion puesto evaluacion, or <code>null</code> if a matching fase postulacion puesto evaluacion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion fetchByE_Last(
		long evaluacionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion[] findByE_PrevAndNext(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK,
		long evaluacionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the fase postulacion puesto evaluacions where evaluacionId = &#63; from the database.
	*
	* @param evaluacionId the evaluacion ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByE(long evaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of fase postulacion puesto evaluacions where evaluacionId = &#63;.
	*
	* @param evaluacionId the evaluacion ID
	* @return the number of matching fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public int countByE(long evaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the fase postulacion puesto evaluacion in the entity cache if it is enabled.
	*
	* @param fasePostulacionPuestoEvaluacion the fase postulacion puesto evaluacion
	*/
	public void cacheResult(
		com.hitss.layer.model.FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion);

	/**
	* Caches the fase postulacion puesto evaluacions in the entity cache if it is enabled.
	*
	* @param fasePostulacionPuestoEvaluacions the fase postulacion puesto evaluacions
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> fasePostulacionPuestoEvaluacions);

	/**
	* Creates a new fase postulacion puesto evaluacion with the primary key. Does not add the fase postulacion puesto evaluacion to the database.
	*
	* @param fasePostulacionPuestoEvaluacionPK the primary key for the new fase postulacion puesto evaluacion
	* @return the new fase postulacion puesto evaluacion
	*/
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion create(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK);

	/**
	* Removes the fase postulacion puesto evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fasePostulacionPuestoEvaluacionPK the primary key of the fase postulacion puesto evaluacion
	* @return the fase postulacion puesto evaluacion that was removed
	* @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion remove(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion updateImpl(
		com.hitss.layer.model.FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the fase postulacion puesto evaluacion with the primary key or throws a {@link com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException} if it could not be found.
	*
	* @param fasePostulacionPuestoEvaluacionPK the primary key of the fase postulacion puesto evaluacion
	* @return the fase postulacion puesto evaluacion
	* @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion findByPrimaryKey(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the fase postulacion puesto evaluacion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fasePostulacionPuestoEvaluacionPK the primary key of the fase postulacion puesto evaluacion
	* @return the fase postulacion puesto evaluacion, or <code>null</code> if a fase postulacion puesto evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.FasePostulacionPuestoEvaluacion fetchByPrimaryKey(
		com.hitss.layer.service.persistence.FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the fase postulacion puesto evaluacions.
	*
	* @return the fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.FasePostulacionPuestoEvaluacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the fase postulacion puesto evaluacions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of fase postulacion puesto evaluacions.
	*
	* @return the number of fase postulacion puesto evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
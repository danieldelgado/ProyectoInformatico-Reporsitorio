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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the prioridad grupo usuarios service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PrioridadGrupoUsuariosPersistenceImpl
 * @see PrioridadGrupoUsuariosUtil
 * @generated
 */
public interface PrioridadGrupoUsuariosPersistence extends BasePersistence<PrioridadGrupoUsuarios> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PrioridadGrupoUsuariosUtil} to access the prioridad grupo usuarios persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the prioridad grupo usuarioses where solicitudEvaluacionDesempennoId = &#63;.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @return the matching prioridad grupo usuarioses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.PrioridadGrupoUsuarios> findByS(
		long solicitudEvaluacionDesempennoId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.PrioridadGrupoUsuarios> findByS(
		long solicitudEvaluacionDesempennoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.PrioridadGrupoUsuarios> findByS(
		long solicitudEvaluacionDesempennoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first prioridad grupo usuarios in the ordered set where solicitudEvaluacionDesempennoId = &#63;.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prioridad grupo usuarios
	* @throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException if a matching prioridad grupo usuarios could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PrioridadGrupoUsuarios findByS_First(
		long solicitudEvaluacionDesempennoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first prioridad grupo usuarios in the ordered set where solicitudEvaluacionDesempennoId = &#63;.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prioridad grupo usuarios, or <code>null</code> if a matching prioridad grupo usuarios could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PrioridadGrupoUsuarios fetchByS_First(
		long solicitudEvaluacionDesempennoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last prioridad grupo usuarios in the ordered set where solicitudEvaluacionDesempennoId = &#63;.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prioridad grupo usuarios
	* @throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException if a matching prioridad grupo usuarios could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PrioridadGrupoUsuarios findByS_Last(
		long solicitudEvaluacionDesempennoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last prioridad grupo usuarios in the ordered set where solicitudEvaluacionDesempennoId = &#63;.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prioridad grupo usuarios, or <code>null</code> if a matching prioridad grupo usuarios could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PrioridadGrupoUsuarios fetchByS_Last(
		long solicitudEvaluacionDesempennoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.hitss.layer.model.PrioridadGrupoUsuarios[] findByS_PrevAndNext(
		long prioridadGrupoUsuariosId, long solicitudEvaluacionDesempennoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the prioridad grupo usuarioses where solicitudEvaluacionDesempennoId = &#63; from the database.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS(long solicitudEvaluacionDesempennoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of prioridad grupo usuarioses where solicitudEvaluacionDesempennoId = &#63;.
	*
	* @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	* @return the number of matching prioridad grupo usuarioses
	* @throws SystemException if a system exception occurred
	*/
	public int countByS(long solicitudEvaluacionDesempennoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the prioridad grupo usuarios in the entity cache if it is enabled.
	*
	* @param prioridadGrupoUsuarios the prioridad grupo usuarios
	*/
	public void cacheResult(
		com.hitss.layer.model.PrioridadGrupoUsuarios prioridadGrupoUsuarios);

	/**
	* Caches the prioridad grupo usuarioses in the entity cache if it is enabled.
	*
	* @param prioridadGrupoUsuarioses the prioridad grupo usuarioses
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.PrioridadGrupoUsuarios> prioridadGrupoUsuarioses);

	/**
	* Creates a new prioridad grupo usuarios with the primary key. Does not add the prioridad grupo usuarios to the database.
	*
	* @param prioridadGrupoUsuariosId the primary key for the new prioridad grupo usuarios
	* @return the new prioridad grupo usuarios
	*/
	public com.hitss.layer.model.PrioridadGrupoUsuarios create(
		long prioridadGrupoUsuariosId);

	/**
	* Removes the prioridad grupo usuarios with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param prioridadGrupoUsuariosId the primary key of the prioridad grupo usuarios
	* @return the prioridad grupo usuarios that was removed
	* @throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException if a prioridad grupo usuarios with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PrioridadGrupoUsuarios remove(
		long prioridadGrupoUsuariosId)
		throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.PrioridadGrupoUsuarios updateImpl(
		com.hitss.layer.model.PrioridadGrupoUsuarios prioridadGrupoUsuarios)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the prioridad grupo usuarios with the primary key or throws a {@link com.hitss.layer.NoSuchPrioridadGrupoUsuariosException} if it could not be found.
	*
	* @param prioridadGrupoUsuariosId the primary key of the prioridad grupo usuarios
	* @return the prioridad grupo usuarios
	* @throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException if a prioridad grupo usuarios with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PrioridadGrupoUsuarios findByPrimaryKey(
		long prioridadGrupoUsuariosId)
		throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the prioridad grupo usuarios with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param prioridadGrupoUsuariosId the primary key of the prioridad grupo usuarios
	* @return the prioridad grupo usuarios, or <code>null</code> if a prioridad grupo usuarios with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.PrioridadGrupoUsuarios fetchByPrimaryKey(
		long prioridadGrupoUsuariosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the prioridad grupo usuarioses.
	*
	* @return the prioridad grupo usuarioses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.PrioridadGrupoUsuarios> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.PrioridadGrupoUsuarios> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.PrioridadGrupoUsuarios> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the prioridad grupo usuarioses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of prioridad grupo usuarioses.
	*
	* @return the number of prioridad grupo usuarioses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
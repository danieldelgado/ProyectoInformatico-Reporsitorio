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

import com.hitss.layer.model.ActividadCronograma;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the actividad cronograma service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see ActividadCronogramaPersistenceImpl
 * @see ActividadCronogramaUtil
 * @generated
 */
public interface ActividadCronogramaPersistence extends BasePersistence<ActividadCronograma> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ActividadCronogramaUtil} to access the actividad cronograma persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the actividad cronogramas where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* @param actividadCronogramaId the actividad cronograma ID
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @return the matching actividad cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.ActividadCronograma> findByA_C_G(
		long actividadCronogramaId, long cronogramaId, long grupoUsuario)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the actividad cronogramas where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadCronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param actividadCronogramaId the actividad cronograma ID
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @param start the lower bound of the range of actividad cronogramas
	* @param end the upper bound of the range of actividad cronogramas (not inclusive)
	* @return the range of matching actividad cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.ActividadCronograma> findByA_C_G(
		long actividadCronogramaId, long cronogramaId, long grupoUsuario,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the actividad cronogramas where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadCronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param actividadCronogramaId the actividad cronograma ID
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @param start the lower bound of the range of actividad cronogramas
	* @param end the upper bound of the range of actividad cronogramas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching actividad cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.ActividadCronograma> findByA_C_G(
		long actividadCronogramaId, long cronogramaId, long grupoUsuario,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first actividad cronograma in the ordered set where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* @param actividadCronogramaId the actividad cronograma ID
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching actividad cronograma
	* @throws com.hitss.layer.NoSuchActividadCronogramaException if a matching actividad cronograma could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadCronograma findByA_C_G_First(
		long actividadCronogramaId, long cronogramaId, long grupoUsuario,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchActividadCronogramaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first actividad cronograma in the ordered set where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* @param actividadCronogramaId the actividad cronograma ID
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching actividad cronograma, or <code>null</code> if a matching actividad cronograma could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadCronograma fetchByA_C_G_First(
		long actividadCronogramaId, long cronogramaId, long grupoUsuario,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last actividad cronograma in the ordered set where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* @param actividadCronogramaId the actividad cronograma ID
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching actividad cronograma
	* @throws com.hitss.layer.NoSuchActividadCronogramaException if a matching actividad cronograma could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadCronograma findByA_C_G_Last(
		long actividadCronogramaId, long cronogramaId, long grupoUsuario,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchActividadCronogramaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last actividad cronograma in the ordered set where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* @param actividadCronogramaId the actividad cronograma ID
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching actividad cronograma, or <code>null</code> if a matching actividad cronograma could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadCronograma fetchByA_C_G_Last(
		long actividadCronogramaId, long cronogramaId, long grupoUsuario,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the actividad cronogramas before and after the current actividad cronograma in the ordered set where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* @param actividadCronogramaPK the primary key of the current actividad cronograma
	* @param actividadCronogramaId the actividad cronograma ID
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next actividad cronograma
	* @throws com.hitss.layer.NoSuchActividadCronogramaException if a actividad cronograma with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadCronograma[] findByA_C_G_PrevAndNext(
		com.hitss.layer.service.persistence.ActividadCronogramaPK actividadCronogramaPK,
		long actividadCronogramaId, long cronogramaId, long grupoUsuario,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchActividadCronogramaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the actividad cronogramas where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63; from the database.
	*
	* @param actividadCronogramaId the actividad cronograma ID
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @throws SystemException if a system exception occurred
	*/
	public void removeByA_C_G(long actividadCronogramaId, long cronogramaId,
		long grupoUsuario)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of actividad cronogramas where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* @param actividadCronogramaId the actividad cronograma ID
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @return the number of matching actividad cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public int countByA_C_G(long actividadCronogramaId, long cronogramaId,
		long grupoUsuario)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the actividad cronogramas where cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @return the matching actividad cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.ActividadCronograma> findByC_G(
		long cronogramaId, long grupoUsuario)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the actividad cronogramas where cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadCronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @param start the lower bound of the range of actividad cronogramas
	* @param end the upper bound of the range of actividad cronogramas (not inclusive)
	* @return the range of matching actividad cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.ActividadCronograma> findByC_G(
		long cronogramaId, long grupoUsuario, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the actividad cronogramas where cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadCronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @param start the lower bound of the range of actividad cronogramas
	* @param end the upper bound of the range of actividad cronogramas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching actividad cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.ActividadCronograma> findByC_G(
		long cronogramaId, long grupoUsuario, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first actividad cronograma in the ordered set where cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching actividad cronograma
	* @throws com.hitss.layer.NoSuchActividadCronogramaException if a matching actividad cronograma could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadCronograma findByC_G_First(
		long cronogramaId, long grupoUsuario,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchActividadCronogramaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first actividad cronograma in the ordered set where cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching actividad cronograma, or <code>null</code> if a matching actividad cronograma could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadCronograma fetchByC_G_First(
		long cronogramaId, long grupoUsuario,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last actividad cronograma in the ordered set where cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching actividad cronograma
	* @throws com.hitss.layer.NoSuchActividadCronogramaException if a matching actividad cronograma could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadCronograma findByC_G_Last(
		long cronogramaId, long grupoUsuario,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchActividadCronogramaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last actividad cronograma in the ordered set where cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching actividad cronograma, or <code>null</code> if a matching actividad cronograma could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadCronograma fetchByC_G_Last(
		long cronogramaId, long grupoUsuario,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the actividad cronogramas before and after the current actividad cronograma in the ordered set where cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* @param actividadCronogramaPK the primary key of the current actividad cronograma
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next actividad cronograma
	* @throws com.hitss.layer.NoSuchActividadCronogramaException if a actividad cronograma with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadCronograma[] findByC_G_PrevAndNext(
		com.hitss.layer.service.persistence.ActividadCronogramaPK actividadCronogramaPK,
		long cronogramaId, long grupoUsuario,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchActividadCronogramaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the actividad cronogramas where cronogramaId = &#63; and grupoUsuario = &#63; from the database.
	*
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G(long cronogramaId, long grupoUsuario)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of actividad cronogramas where cronogramaId = &#63; and grupoUsuario = &#63;.
	*
	* @param cronogramaId the cronograma ID
	* @param grupoUsuario the grupo usuario
	* @return the number of matching actividad cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G(long cronogramaId, long grupoUsuario)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the actividad cronograma in the entity cache if it is enabled.
	*
	* @param actividadCronograma the actividad cronograma
	*/
	public void cacheResult(
		com.hitss.layer.model.ActividadCronograma actividadCronograma);

	/**
	* Caches the actividad cronogramas in the entity cache if it is enabled.
	*
	* @param actividadCronogramas the actividad cronogramas
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.ActividadCronograma> actividadCronogramas);

	/**
	* Creates a new actividad cronograma with the primary key. Does not add the actividad cronograma to the database.
	*
	* @param actividadCronogramaPK the primary key for the new actividad cronograma
	* @return the new actividad cronograma
	*/
	public com.hitss.layer.model.ActividadCronograma create(
		com.hitss.layer.service.persistence.ActividadCronogramaPK actividadCronogramaPK);

	/**
	* Removes the actividad cronograma with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadCronogramaPK the primary key of the actividad cronograma
	* @return the actividad cronograma that was removed
	* @throws com.hitss.layer.NoSuchActividadCronogramaException if a actividad cronograma with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadCronograma remove(
		com.hitss.layer.service.persistence.ActividadCronogramaPK actividadCronogramaPK)
		throws com.hitss.layer.NoSuchActividadCronogramaException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.ActividadCronograma updateImpl(
		com.hitss.layer.model.ActividadCronograma actividadCronograma)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the actividad cronograma with the primary key or throws a {@link com.hitss.layer.NoSuchActividadCronogramaException} if it could not be found.
	*
	* @param actividadCronogramaPK the primary key of the actividad cronograma
	* @return the actividad cronograma
	* @throws com.hitss.layer.NoSuchActividadCronogramaException if a actividad cronograma with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadCronograma findByPrimaryKey(
		com.hitss.layer.service.persistence.ActividadCronogramaPK actividadCronogramaPK)
		throws com.hitss.layer.NoSuchActividadCronogramaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the actividad cronograma with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param actividadCronogramaPK the primary key of the actividad cronograma
	* @return the actividad cronograma, or <code>null</code> if a actividad cronograma with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.ActividadCronograma fetchByPrimaryKey(
		com.hitss.layer.service.persistence.ActividadCronogramaPK actividadCronogramaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the actividad cronogramas.
	*
	* @return the actividad cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.ActividadCronograma> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the actividad cronogramas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadCronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of actividad cronogramas
	* @param end the upper bound of the range of actividad cronogramas (not inclusive)
	* @return the range of actividad cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.ActividadCronograma> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the actividad cronogramas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadCronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of actividad cronogramas
	* @param end the upper bound of the range of actividad cronogramas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of actividad cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.ActividadCronograma> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the actividad cronogramas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of actividad cronogramas.
	*
	* @return the number of actividad cronogramas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
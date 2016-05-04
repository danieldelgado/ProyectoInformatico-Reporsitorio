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

import com.hitss.layer.model.Funcion;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the funcion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see FuncionPersistenceImpl
 * @see FuncionUtil
 * @generated
 */
public interface FuncionPersistence extends BasePersistence<Funcion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FuncionUtil} to access the funcion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the funcions where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @return the matching funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Funcion> findByfiltroDescripcion(
		java.lang.String descripcion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the funcions where descripcion LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param descripcion the descripcion
	* @param start the lower bound of the range of funcions
	* @param end the upper bound of the range of funcions (not inclusive)
	* @return the range of matching funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Funcion> findByfiltroDescripcion(
		java.lang.String descripcion, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the funcions where descripcion LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param descripcion the descripcion
	* @param start the lower bound of the range of funcions
	* @param end the upper bound of the range of funcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Funcion> findByfiltroDescripcion(
		java.lang.String descripcion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first funcion in the ordered set where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching funcion
	* @throws com.hitss.layer.NoSuchFuncionException if a matching funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Funcion findByfiltroDescripcion_First(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first funcion in the ordered set where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching funcion, or <code>null</code> if a matching funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Funcion fetchByfiltroDescripcion_First(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last funcion in the ordered set where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching funcion
	* @throws com.hitss.layer.NoSuchFuncionException if a matching funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Funcion findByfiltroDescripcion_Last(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last funcion in the ordered set where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching funcion, or <code>null</code> if a matching funcion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Funcion fetchByfiltroDescripcion_Last(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the funcions before and after the current funcion in the ordered set where descripcion LIKE &#63;.
	*
	* @param funcionId the primary key of the current funcion
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next funcion
	* @throws com.hitss.layer.NoSuchFuncionException if a funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Funcion[] findByfiltroDescripcion_PrevAndNext(
		long funcionId, java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the funcions where descripcion LIKE &#63; from the database.
	*
	* @param descripcion the descripcion
	* @throws SystemException if a system exception occurred
	*/
	public void removeByfiltroDescripcion(java.lang.String descripcion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of funcions where descripcion LIKE &#63;.
	*
	* @param descripcion the descripcion
	* @return the number of matching funcions
	* @throws SystemException if a system exception occurred
	*/
	public int countByfiltroDescripcion(java.lang.String descripcion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the funcion in the entity cache if it is enabled.
	*
	* @param funcion the funcion
	*/
	public void cacheResult(com.hitss.layer.model.Funcion funcion);

	/**
	* Caches the funcions in the entity cache if it is enabled.
	*
	* @param funcions the funcions
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.Funcion> funcions);

	/**
	* Creates a new funcion with the primary key. Does not add the funcion to the database.
	*
	* @param funcionId the primary key for the new funcion
	* @return the new funcion
	*/
	public com.hitss.layer.model.Funcion create(long funcionId);

	/**
	* Removes the funcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param funcionId the primary key of the funcion
	* @return the funcion that was removed
	* @throws com.hitss.layer.NoSuchFuncionException if a funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Funcion remove(long funcionId)
		throws com.hitss.layer.NoSuchFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.Funcion updateImpl(
		com.hitss.layer.model.Funcion funcion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the funcion with the primary key or throws a {@link com.hitss.layer.NoSuchFuncionException} if it could not be found.
	*
	* @param funcionId the primary key of the funcion
	* @return the funcion
	* @throws com.hitss.layer.NoSuchFuncionException if a funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Funcion findByPrimaryKey(long funcionId)
		throws com.hitss.layer.NoSuchFuncionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the funcion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param funcionId the primary key of the funcion
	* @return the funcion, or <code>null</code> if a funcion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Funcion fetchByPrimaryKey(long funcionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the funcions.
	*
	* @return the funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Funcion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the funcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of funcions
	* @param end the upper bound of the range of funcions (not inclusive)
	* @return the range of funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Funcion> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the funcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of funcions
	* @param end the upper bound of the range of funcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of funcions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Funcion> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the funcions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of funcions.
	*
	* @return the number of funcions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the solicitud requerimientos associated with the funcion.
	*
	* @param pk the primary key of the funcion
	* @return the solicitud requerimientos associated with the funcion
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimiento> getSolicitudRequerimientos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the solicitud requerimientos associated with the funcion.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the funcion
	* @param start the lower bound of the range of funcions
	* @param end the upper bound of the range of funcions (not inclusive)
	* @return the range of solicitud requerimientos associated with the funcion
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimiento> getSolicitudRequerimientos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the solicitud requerimientos associated with the funcion.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the funcion
	* @param start the lower bound of the range of funcions
	* @param end the upper bound of the range of funcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of solicitud requerimientos associated with the funcion
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.SolicitudRequerimiento> getSolicitudRequerimientos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of solicitud requerimientos associated with the funcion.
	*
	* @param pk the primary key of the funcion
	* @return the number of solicitud requerimientos associated with the funcion
	* @throws SystemException if a system exception occurred
	*/
	public int getSolicitudRequerimientosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the solicitud requerimiento is associated with the funcion.
	*
	* @param pk the primary key of the funcion
	* @param solicitudRequerimientoPK the primary key of the solicitud requerimiento
	* @return <code>true</code> if the solicitud requerimiento is associated with the funcion; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsSolicitudRequerimiento(long pk,
		long solicitudRequerimientoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the funcion has any solicitud requerimientos associated with it.
	*
	* @param pk the primary key of the funcion to check for associations with solicitud requerimientos
	* @return <code>true</code> if the funcion has any solicitud requerimientos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsSolicitudRequerimientos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the funcion and the solicitud requerimiento. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the funcion
	* @param solicitudRequerimientoPK the primary key of the solicitud requerimiento
	* @throws SystemException if a system exception occurred
	*/
	public void addSolicitudRequerimiento(long pk, long solicitudRequerimientoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the funcion and the solicitud requerimiento. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the funcion
	* @param solicitudRequerimiento the solicitud requerimiento
	* @throws SystemException if a system exception occurred
	*/
	public void addSolicitudRequerimiento(long pk,
		com.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the funcion and the solicitud requerimientos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the funcion
	* @param solicitudRequerimientoPKs the primary keys of the solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public void addSolicitudRequerimientos(long pk,
		long[] solicitudRequerimientoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the funcion and the solicitud requerimientos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the funcion
	* @param solicitudRequerimientos the solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public void addSolicitudRequerimientos(long pk,
		java.util.List<com.hitss.layer.model.SolicitudRequerimiento> solicitudRequerimientos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the funcion and its solicitud requerimientos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the funcion to clear the associated solicitud requerimientos from
	* @throws SystemException if a system exception occurred
	*/
	public void clearSolicitudRequerimientos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the funcion and the solicitud requerimiento. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the funcion
	* @param solicitudRequerimientoPK the primary key of the solicitud requerimiento
	* @throws SystemException if a system exception occurred
	*/
	public void removeSolicitudRequerimiento(long pk,
		long solicitudRequerimientoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the funcion and the solicitud requerimiento. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the funcion
	* @param solicitudRequerimiento the solicitud requerimiento
	* @throws SystemException if a system exception occurred
	*/
	public void removeSolicitudRequerimiento(long pk,
		com.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the funcion and the solicitud requerimientos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the funcion
	* @param solicitudRequerimientoPKs the primary keys of the solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public void removeSolicitudRequerimientos(long pk,
		long[] solicitudRequerimientoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the funcion and the solicitud requerimientos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the funcion
	* @param solicitudRequerimientos the solicitud requerimientos
	* @throws SystemException if a system exception occurred
	*/
	public void removeSolicitudRequerimientos(long pk,
		java.util.List<com.hitss.layer.model.SolicitudRequerimiento> solicitudRequerimientos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the solicitud requerimientos associated with the funcion, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the funcion
	* @param solicitudRequerimientoPKs the primary keys of the solicitud requerimientos to be associated with the funcion
	* @throws SystemException if a system exception occurred
	*/
	public void setSolicitudRequerimientos(long pk,
		long[] solicitudRequerimientoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the solicitud requerimientos associated with the funcion, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the funcion
	* @param solicitudRequerimientos the solicitud requerimientos to be associated with the funcion
	* @throws SystemException if a system exception occurred
	*/
	public void setSolicitudRequerimientos(long pk,
		java.util.List<com.hitss.layer.model.SolicitudRequerimiento> solicitudRequerimientos)
		throws com.liferay.portal.kernel.exception.SystemException;
}
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

import com.hitss.layer.model.Respuesta;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the respuesta service. This utility wraps {@link RespuestaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see RespuestaPersistence
 * @see RespuestaPersistenceImpl
 * @generated
 */
public class RespuestaUtil {
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
	public static void clearCache(Respuesta respuesta) {
		getPersistence().clearCache(respuesta);
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
	public static List<Respuesta> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Respuesta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Respuesta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Respuesta update(Respuesta respuesta)
		throws SystemException {
		return getPersistence().update(respuesta);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Respuesta update(Respuesta respuesta,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(respuesta, serviceContext);
	}

	/**
	* Caches the respuesta in the entity cache if it is enabled.
	*
	* @param respuesta the respuesta
	*/
	public static void cacheResult(com.hitss.layer.model.Respuesta respuesta) {
		getPersistence().cacheResult(respuesta);
	}

	/**
	* Caches the respuestas in the entity cache if it is enabled.
	*
	* @param respuestas the respuestas
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.Respuesta> respuestas) {
		getPersistence().cacheResult(respuestas);
	}

	/**
	* Creates a new respuesta with the primary key. Does not add the respuesta to the database.
	*
	* @param respuestaId the primary key for the new respuesta
	* @return the new respuesta
	*/
	public static com.hitss.layer.model.Respuesta create(long respuestaId) {
		return getPersistence().create(respuestaId);
	}

	/**
	* Removes the respuesta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param respuestaId the primary key of the respuesta
	* @return the respuesta that was removed
	* @throws com.hitss.layer.NoSuchRespuestaException if a respuesta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Respuesta remove(long respuestaId)
		throws com.hitss.layer.NoSuchRespuestaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(respuestaId);
	}

	public static com.hitss.layer.model.Respuesta updateImpl(
		com.hitss.layer.model.Respuesta respuesta)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(respuesta);
	}

	/**
	* Returns the respuesta with the primary key or throws a {@link com.hitss.layer.NoSuchRespuestaException} if it could not be found.
	*
	* @param respuestaId the primary key of the respuesta
	* @return the respuesta
	* @throws com.hitss.layer.NoSuchRespuestaException if a respuesta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Respuesta findByPrimaryKey(
		long respuestaId)
		throws com.hitss.layer.NoSuchRespuestaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(respuestaId);
	}

	/**
	* Returns the respuesta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param respuestaId the primary key of the respuesta
	* @return the respuesta, or <code>null</code> if a respuesta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Respuesta fetchByPrimaryKey(
		long respuestaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(respuestaId);
	}

	/**
	* Returns all the respuestas.
	*
	* @return the respuestas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Respuesta> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the respuestas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of respuestas
	* @param end the upper bound of the range of respuestas (not inclusive)
	* @return the range of respuestas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Respuesta> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the respuestas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of respuestas
	* @param end the upper bound of the range of respuestas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of respuestas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Respuesta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the respuestas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of respuestas.
	*
	* @return the number of respuestas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the preguntas associated with the respuesta.
	*
	* @param pk the primary key of the respuesta
	* @return the preguntas associated with the respuesta
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Pregunta> getPreguntas(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getPreguntas(pk);
	}

	/**
	* Returns a range of all the preguntas associated with the respuesta.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the respuesta
	* @param start the lower bound of the range of respuestas
	* @param end the upper bound of the range of respuestas (not inclusive)
	* @return the range of preguntas associated with the respuesta
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Pregunta> getPreguntas(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getPreguntas(pk, start, end);
	}

	/**
	* Returns an ordered range of all the preguntas associated with the respuesta.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the respuesta
	* @param start the lower bound of the range of respuestas
	* @param end the upper bound of the range of respuestas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of preguntas associated with the respuesta
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Pregunta> getPreguntas(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getPreguntas(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of preguntas associated with the respuesta.
	*
	* @param pk the primary key of the respuesta
	* @return the number of preguntas associated with the respuesta
	* @throws SystemException if a system exception occurred
	*/
	public static int getPreguntasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getPreguntasSize(pk);
	}

	/**
	* Returns <code>true</code> if the pregunta is associated with the respuesta.
	*
	* @param pk the primary key of the respuesta
	* @param preguntaPK the primary key of the pregunta
	* @return <code>true</code> if the pregunta is associated with the respuesta; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsPregunta(long pk, long preguntaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsPregunta(pk, preguntaPK);
	}

	/**
	* Returns <code>true</code> if the respuesta has any preguntas associated with it.
	*
	* @param pk the primary key of the respuesta to check for associations with preguntas
	* @return <code>true</code> if the respuesta has any preguntas associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsPreguntas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsPreguntas(pk);
	}

	/**
	* Adds an association between the respuesta and the pregunta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the respuesta
	* @param preguntaPK the primary key of the pregunta
	* @throws SystemException if a system exception occurred
	*/
	public static void addPregunta(long pk, long preguntaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addPregunta(pk, preguntaPK);
	}

	/**
	* Adds an association between the respuesta and the pregunta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the respuesta
	* @param pregunta the pregunta
	* @throws SystemException if a system exception occurred
	*/
	public static void addPregunta(long pk,
		com.hitss.layer.model.Pregunta pregunta)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addPregunta(pk, pregunta);
	}

	/**
	* Adds an association between the respuesta and the preguntas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the respuesta
	* @param preguntaPKs the primary keys of the preguntas
	* @throws SystemException if a system exception occurred
	*/
	public static void addPreguntas(long pk, long[] preguntaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addPreguntas(pk, preguntaPKs);
	}

	/**
	* Adds an association between the respuesta and the preguntas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the respuesta
	* @param preguntas the preguntas
	* @throws SystemException if a system exception occurred
	*/
	public static void addPreguntas(long pk,
		java.util.List<com.hitss.layer.model.Pregunta> preguntas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addPreguntas(pk, preguntas);
	}

	/**
	* Clears all associations between the respuesta and its preguntas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the respuesta to clear the associated preguntas from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearPreguntas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearPreguntas(pk);
	}

	/**
	* Removes the association between the respuesta and the pregunta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the respuesta
	* @param preguntaPK the primary key of the pregunta
	* @throws SystemException if a system exception occurred
	*/
	public static void removePregunta(long pk, long preguntaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removePregunta(pk, preguntaPK);
	}

	/**
	* Removes the association between the respuesta and the pregunta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the respuesta
	* @param pregunta the pregunta
	* @throws SystemException if a system exception occurred
	*/
	public static void removePregunta(long pk,
		com.hitss.layer.model.Pregunta pregunta)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removePregunta(pk, pregunta);
	}

	/**
	* Removes the association between the respuesta and the preguntas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the respuesta
	* @param preguntaPKs the primary keys of the preguntas
	* @throws SystemException if a system exception occurred
	*/
	public static void removePreguntas(long pk, long[] preguntaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removePreguntas(pk, preguntaPKs);
	}

	/**
	* Removes the association between the respuesta and the preguntas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the respuesta
	* @param preguntas the preguntas
	* @throws SystemException if a system exception occurred
	*/
	public static void removePreguntas(long pk,
		java.util.List<com.hitss.layer.model.Pregunta> preguntas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removePreguntas(pk, preguntas);
	}

	/**
	* Sets the preguntas associated with the respuesta, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the respuesta
	* @param preguntaPKs the primary keys of the preguntas to be associated with the respuesta
	* @throws SystemException if a system exception occurred
	*/
	public static void setPreguntas(long pk, long[] preguntaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setPreguntas(pk, preguntaPKs);
	}

	/**
	* Sets the preguntas associated with the respuesta, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the respuesta
	* @param preguntas the preguntas to be associated with the respuesta
	* @throws SystemException if a system exception occurred
	*/
	public static void setPreguntas(long pk,
		java.util.List<com.hitss.layer.model.Pregunta> preguntas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setPreguntas(pk, preguntas);
	}

	public static RespuestaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RespuestaPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					RespuestaPersistence.class.getName());

			ReferenceRegistry.registerReference(RespuestaUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(RespuestaPersistence persistence) {
	}

	private static RespuestaPersistence _persistence;
}
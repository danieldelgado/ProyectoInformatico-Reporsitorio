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

import com.hitss.layer.model.Pregunta;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the pregunta service. This utility wraps {@link PreguntaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PreguntaPersistence
 * @see PreguntaPersistenceImpl
 * @generated
 */
public class PreguntaUtil {
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
	public static void clearCache(Pregunta pregunta) {
		getPersistence().clearCache(pregunta);
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
	public static List<Pregunta> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Pregunta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Pregunta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Pregunta update(Pregunta pregunta) throws SystemException {
		return getPersistence().update(pregunta);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Pregunta update(Pregunta pregunta,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(pregunta, serviceContext);
	}

	/**
	* Caches the pregunta in the entity cache if it is enabled.
	*
	* @param pregunta the pregunta
	*/
	public static void cacheResult(com.hitss.layer.model.Pregunta pregunta) {
		getPersistence().cacheResult(pregunta);
	}

	/**
	* Caches the preguntas in the entity cache if it is enabled.
	*
	* @param preguntas the preguntas
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.Pregunta> preguntas) {
		getPersistence().cacheResult(preguntas);
	}

	/**
	* Creates a new pregunta with the primary key. Does not add the pregunta to the database.
	*
	* @param preguntaId the primary key for the new pregunta
	* @return the new pregunta
	*/
	public static com.hitss.layer.model.Pregunta create(long preguntaId) {
		return getPersistence().create(preguntaId);
	}

	/**
	* Removes the pregunta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param preguntaId the primary key of the pregunta
	* @return the pregunta that was removed
	* @throws com.hitss.layer.NoSuchPreguntaException if a pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Pregunta remove(long preguntaId)
		throws com.hitss.layer.NoSuchPreguntaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(preguntaId);
	}

	public static com.hitss.layer.model.Pregunta updateImpl(
		com.hitss.layer.model.Pregunta pregunta)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(pregunta);
	}

	/**
	* Returns the pregunta with the primary key or throws a {@link com.hitss.layer.NoSuchPreguntaException} if it could not be found.
	*
	* @param preguntaId the primary key of the pregunta
	* @return the pregunta
	* @throws com.hitss.layer.NoSuchPreguntaException if a pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Pregunta findByPrimaryKey(
		long preguntaId)
		throws com.hitss.layer.NoSuchPreguntaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(preguntaId);
	}

	/**
	* Returns the pregunta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param preguntaId the primary key of the pregunta
	* @return the pregunta, or <code>null</code> if a pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Pregunta fetchByPrimaryKey(
		long preguntaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(preguntaId);
	}

	/**
	* Returns all the preguntas.
	*
	* @return the preguntas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Pregunta> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the preguntas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of preguntas
	* @param end the upper bound of the range of preguntas (not inclusive)
	* @return the range of preguntas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Pregunta> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the preguntas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of preguntas
	* @param end the upper bound of the range of preguntas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of preguntas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Pregunta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the preguntas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of preguntas.
	*
	* @return the number of preguntas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the respuestas associated with the pregunta.
	*
	* @param pk the primary key of the pregunta
	* @return the respuestas associated with the pregunta
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Respuesta> getRespuestas(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getRespuestas(pk);
	}

	/**
	* Returns a range of all the respuestas associated with the pregunta.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the pregunta
	* @param start the lower bound of the range of preguntas
	* @param end the upper bound of the range of preguntas (not inclusive)
	* @return the range of respuestas associated with the pregunta
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Respuesta> getRespuestas(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getRespuestas(pk, start, end);
	}

	/**
	* Returns an ordered range of all the respuestas associated with the pregunta.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the pregunta
	* @param start the lower bound of the range of preguntas
	* @param end the upper bound of the range of preguntas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of respuestas associated with the pregunta
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Respuesta> getRespuestas(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getRespuestas(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of respuestas associated with the pregunta.
	*
	* @param pk the primary key of the pregunta
	* @return the number of respuestas associated with the pregunta
	* @throws SystemException if a system exception occurred
	*/
	public static int getRespuestasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getRespuestasSize(pk);
	}

	/**
	* Returns <code>true</code> if the respuesta is associated with the pregunta.
	*
	* @param pk the primary key of the pregunta
	* @param respuestaPK the primary key of the respuesta
	* @return <code>true</code> if the respuesta is associated with the pregunta; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsRespuesta(long pk, long respuestaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsRespuesta(pk, respuestaPK);
	}

	/**
	* Returns <code>true</code> if the pregunta has any respuestas associated with it.
	*
	* @param pk the primary key of the pregunta to check for associations with respuestas
	* @return <code>true</code> if the pregunta has any respuestas associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsRespuestas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsRespuestas(pk);
	}

	/**
	* Adds an association between the pregunta and the respuesta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuestaPK the primary key of the respuesta
	* @throws SystemException if a system exception occurred
	*/
	public static void addRespuesta(long pk, long respuestaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addRespuesta(pk, respuestaPK);
	}

	/**
	* Adds an association between the pregunta and the respuesta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuesta the respuesta
	* @throws SystemException if a system exception occurred
	*/
	public static void addRespuesta(long pk,
		com.hitss.layer.model.Respuesta respuesta)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addRespuesta(pk, respuesta);
	}

	/**
	* Adds an association between the pregunta and the respuestas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuestaPKs the primary keys of the respuestas
	* @throws SystemException if a system exception occurred
	*/
	public static void addRespuestas(long pk, long[] respuestaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addRespuestas(pk, respuestaPKs);
	}

	/**
	* Adds an association between the pregunta and the respuestas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuestas the respuestas
	* @throws SystemException if a system exception occurred
	*/
	public static void addRespuestas(long pk,
		java.util.List<com.hitss.layer.model.Respuesta> respuestas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addRespuestas(pk, respuestas);
	}

	/**
	* Clears all associations between the pregunta and its respuestas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta to clear the associated respuestas from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearRespuestas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearRespuestas(pk);
	}

	/**
	* Removes the association between the pregunta and the respuesta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuestaPK the primary key of the respuesta
	* @throws SystemException if a system exception occurred
	*/
	public static void removeRespuesta(long pk, long respuestaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeRespuesta(pk, respuestaPK);
	}

	/**
	* Removes the association between the pregunta and the respuesta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuesta the respuesta
	* @throws SystemException if a system exception occurred
	*/
	public static void removeRespuesta(long pk,
		com.hitss.layer.model.Respuesta respuesta)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeRespuesta(pk, respuesta);
	}

	/**
	* Removes the association between the pregunta and the respuestas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuestaPKs the primary keys of the respuestas
	* @throws SystemException if a system exception occurred
	*/
	public static void removeRespuestas(long pk, long[] respuestaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeRespuestas(pk, respuestaPKs);
	}

	/**
	* Removes the association between the pregunta and the respuestas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuestas the respuestas
	* @throws SystemException if a system exception occurred
	*/
	public static void removeRespuestas(long pk,
		java.util.List<com.hitss.layer.model.Respuesta> respuestas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeRespuestas(pk, respuestas);
	}

	/**
	* Sets the respuestas associated with the pregunta, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuestaPKs the primary keys of the respuestas to be associated with the pregunta
	* @throws SystemException if a system exception occurred
	*/
	public static void setRespuestas(long pk, long[] respuestaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setRespuestas(pk, respuestaPKs);
	}

	/**
	* Sets the respuestas associated with the pregunta, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuestas the respuestas to be associated with the pregunta
	* @throws SystemException if a system exception occurred
	*/
	public static void setRespuestas(long pk,
		java.util.List<com.hitss.layer.model.Respuesta> respuestas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setRespuestas(pk, respuestas);
	}

	public static PreguntaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PreguntaPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					PreguntaPersistence.class.getName());

			ReferenceRegistry.registerReference(PreguntaUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PreguntaPersistence persistence) {
	}

	private static PreguntaPersistence _persistence;
}
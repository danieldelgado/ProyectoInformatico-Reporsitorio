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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the pregunta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PreguntaPersistenceImpl
 * @see PreguntaUtil
 * @generated
 */
public interface PreguntaPersistence extends BasePersistence<Pregunta> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PreguntaUtil} to access the pregunta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the pregunta in the entity cache if it is enabled.
	*
	* @param pregunta the pregunta
	*/
	public void cacheResult(com.hitss.layer.model.Pregunta pregunta);

	/**
	* Caches the preguntas in the entity cache if it is enabled.
	*
	* @param preguntas the preguntas
	*/
	public void cacheResult(
		java.util.List<com.hitss.layer.model.Pregunta> preguntas);

	/**
	* Creates a new pregunta with the primary key. Does not add the pregunta to the database.
	*
	* @param preguntaId the primary key for the new pregunta
	* @return the new pregunta
	*/
	public com.hitss.layer.model.Pregunta create(long preguntaId);

	/**
	* Removes the pregunta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param preguntaId the primary key of the pregunta
	* @return the pregunta that was removed
	* @throws com.hitss.layer.NoSuchPreguntaException if a pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Pregunta remove(long preguntaId)
		throws com.hitss.layer.NoSuchPreguntaException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hitss.layer.model.Pregunta updateImpl(
		com.hitss.layer.model.Pregunta pregunta)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pregunta with the primary key or throws a {@link com.hitss.layer.NoSuchPreguntaException} if it could not be found.
	*
	* @param preguntaId the primary key of the pregunta
	* @return the pregunta
	* @throws com.hitss.layer.NoSuchPreguntaException if a pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Pregunta findByPrimaryKey(long preguntaId)
		throws com.hitss.layer.NoSuchPreguntaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pregunta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param preguntaId the primary key of the pregunta
	* @return the pregunta, or <code>null</code> if a pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hitss.layer.model.Pregunta fetchByPrimaryKey(long preguntaId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the preguntas.
	*
	* @return the preguntas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Pregunta> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.Pregunta> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.Pregunta> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the preguntas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of preguntas.
	*
	* @return the number of preguntas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the respuestas associated with the pregunta.
	*
	* @param pk the primary key of the pregunta
	* @return the respuestas associated with the pregunta
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hitss.layer.model.Respuesta> getRespuestas(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.Respuesta> getRespuestas(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.hitss.layer.model.Respuesta> getRespuestas(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of respuestas associated with the pregunta.
	*
	* @param pk the primary key of the pregunta
	* @return the number of respuestas associated with the pregunta
	* @throws SystemException if a system exception occurred
	*/
	public int getRespuestasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the respuesta is associated with the pregunta.
	*
	* @param pk the primary key of the pregunta
	* @param respuestaPK the primary key of the respuesta
	* @return <code>true</code> if the respuesta is associated with the pregunta; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsRespuesta(long pk, long respuestaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the pregunta has any respuestas associated with it.
	*
	* @param pk the primary key of the pregunta to check for associations with respuestas
	* @return <code>true</code> if the pregunta has any respuestas associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsRespuestas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the pregunta and the respuesta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuestaPK the primary key of the respuesta
	* @throws SystemException if a system exception occurred
	*/
	public void addRespuesta(long pk, long respuestaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the pregunta and the respuesta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuesta the respuesta
	* @throws SystemException if a system exception occurred
	*/
	public void addRespuesta(long pk, com.hitss.layer.model.Respuesta respuesta)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the pregunta and the respuestas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuestaPKs the primary keys of the respuestas
	* @throws SystemException if a system exception occurred
	*/
	public void addRespuestas(long pk, long[] respuestaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the pregunta and the respuestas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuestas the respuestas
	* @throws SystemException if a system exception occurred
	*/
	public void addRespuestas(long pk,
		java.util.List<com.hitss.layer.model.Respuesta> respuestas)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the pregunta and its respuestas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta to clear the associated respuestas from
	* @throws SystemException if a system exception occurred
	*/
	public void clearRespuestas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the pregunta and the respuesta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuestaPK the primary key of the respuesta
	* @throws SystemException if a system exception occurred
	*/
	public void removeRespuesta(long pk, long respuestaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the pregunta and the respuesta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuesta the respuesta
	* @throws SystemException if a system exception occurred
	*/
	public void removeRespuesta(long pk,
		com.hitss.layer.model.Respuesta respuesta)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the pregunta and the respuestas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuestaPKs the primary keys of the respuestas
	* @throws SystemException if a system exception occurred
	*/
	public void removeRespuestas(long pk, long[] respuestaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the pregunta and the respuestas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuestas the respuestas
	* @throws SystemException if a system exception occurred
	*/
	public void removeRespuestas(long pk,
		java.util.List<com.hitss.layer.model.Respuesta> respuestas)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the respuestas associated with the pregunta, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuestaPKs the primary keys of the respuestas to be associated with the pregunta
	* @throws SystemException if a system exception occurred
	*/
	public void setRespuestas(long pk, long[] respuestaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the respuestas associated with the pregunta, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the pregunta
	* @param respuestas the respuestas to be associated with the pregunta
	* @throws SystemException if a system exception occurred
	*/
	public void setRespuestas(long pk,
		java.util.List<com.hitss.layer.model.Respuesta> respuestas)
		throws com.liferay.portal.kernel.exception.SystemException;
}
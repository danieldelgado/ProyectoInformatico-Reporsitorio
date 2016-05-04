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

package com.hitss.layer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PreguntaLocalService}.
 *
 * @author Danielle Delgado
 * @see PreguntaLocalService
 * @generated
 */
public class PreguntaLocalServiceWrapper implements PreguntaLocalService,
	ServiceWrapper<PreguntaLocalService> {
	public PreguntaLocalServiceWrapper(
		PreguntaLocalService preguntaLocalService) {
		_preguntaLocalService = preguntaLocalService;
	}

	/**
	* Adds the pregunta to the database. Also notifies the appropriate model listeners.
	*
	* @param pregunta the pregunta
	* @return the pregunta that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Pregunta addPregunta(
		com.hitss.layer.model.Pregunta pregunta)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.addPregunta(pregunta);
	}

	/**
	* Creates a new pregunta with the primary key. Does not add the pregunta to the database.
	*
	* @param preguntaId the primary key for the new pregunta
	* @return the new pregunta
	*/
	@Override
	public com.hitss.layer.model.Pregunta createPregunta(long preguntaId) {
		return _preguntaLocalService.createPregunta(preguntaId);
	}

	/**
	* Deletes the pregunta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param preguntaId the primary key of the pregunta
	* @return the pregunta that was removed
	* @throws PortalException if a pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Pregunta deletePregunta(long preguntaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.deletePregunta(preguntaId);
	}

	/**
	* Deletes the pregunta from the database. Also notifies the appropriate model listeners.
	*
	* @param pregunta the pregunta
	* @return the pregunta that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Pregunta deletePregunta(
		com.hitss.layer.model.Pregunta pregunta)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.deletePregunta(pregunta);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _preguntaLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.hitss.layer.model.Pregunta fetchPregunta(long preguntaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.fetchPregunta(preguntaId);
	}

	/**
	* Returns the pregunta with the primary key.
	*
	* @param preguntaId the primary key of the pregunta
	* @return the pregunta
	* @throws PortalException if a pregunta with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Pregunta getPregunta(long preguntaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.getPregunta(preguntaId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.hitss.layer.model.Pregunta> getPreguntas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.getPreguntas(start, end);
	}

	/**
	* Returns the number of preguntas.
	*
	* @return the number of preguntas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPreguntasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.getPreguntasCount();
	}

	/**
	* Updates the pregunta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param pregunta the pregunta
	* @return the pregunta that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hitss.layer.model.Pregunta updatePregunta(
		com.hitss.layer.model.Pregunta pregunta)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.updatePregunta(pregunta);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addRespuestaPregunta(long respuestaId, long preguntaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_preguntaLocalService.addRespuestaPregunta(respuestaId, preguntaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addRespuestaPregunta(long respuestaId,
		com.hitss.layer.model.Pregunta pregunta)
		throws com.liferay.portal.kernel.exception.SystemException {
		_preguntaLocalService.addRespuestaPregunta(respuestaId, pregunta);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addRespuestaPreguntas(long respuestaId, long[] preguntaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_preguntaLocalService.addRespuestaPreguntas(respuestaId, preguntaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addRespuestaPreguntas(long respuestaId,
		java.util.List<com.hitss.layer.model.Pregunta> Preguntas)
		throws com.liferay.portal.kernel.exception.SystemException {
		_preguntaLocalService.addRespuestaPreguntas(respuestaId, Preguntas);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearRespuestaPreguntas(long respuestaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_preguntaLocalService.clearRespuestaPreguntas(respuestaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteRespuestaPregunta(long respuestaId, long preguntaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_preguntaLocalService.deleteRespuestaPregunta(respuestaId, preguntaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteRespuestaPregunta(long respuestaId,
		com.hitss.layer.model.Pregunta pregunta)
		throws com.liferay.portal.kernel.exception.SystemException {
		_preguntaLocalService.deleteRespuestaPregunta(respuestaId, pregunta);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteRespuestaPreguntas(long respuestaId, long[] preguntaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_preguntaLocalService.deleteRespuestaPreguntas(respuestaId, preguntaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteRespuestaPreguntas(long respuestaId,
		java.util.List<com.hitss.layer.model.Pregunta> Preguntas)
		throws com.liferay.portal.kernel.exception.SystemException {
		_preguntaLocalService.deleteRespuestaPreguntas(respuestaId, Preguntas);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.Pregunta> getRespuestaPreguntas(
		long respuestaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.getRespuestaPreguntas(respuestaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.Pregunta> getRespuestaPreguntas(
		long respuestaId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.getRespuestaPreguntas(respuestaId, start,
			end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hitss.layer.model.Pregunta> getRespuestaPreguntas(
		long respuestaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.getRespuestaPreguntas(respuestaId, start,
			end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getRespuestaPreguntasCount(long respuestaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.getRespuestaPreguntasCount(respuestaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasRespuestaPregunta(long respuestaId, long preguntaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.hasRespuestaPregunta(respuestaId,
			preguntaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasRespuestaPreguntas(long respuestaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preguntaLocalService.hasRespuestaPreguntas(respuestaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setRespuestaPreguntas(long respuestaId, long[] preguntaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_preguntaLocalService.setRespuestaPreguntas(respuestaId, preguntaIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _preguntaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_preguntaLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _preguntaLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PreguntaLocalService getWrappedPreguntaLocalService() {
		return _preguntaLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPreguntaLocalService(
		PreguntaLocalService preguntaLocalService) {
		_preguntaLocalService = preguntaLocalService;
	}

	@Override
	public PreguntaLocalService getWrappedService() {
		return _preguntaLocalService;
	}

	@Override
	public void setWrappedService(PreguntaLocalService preguntaLocalService) {
		_preguntaLocalService = preguntaLocalService;
	}

	private PreguntaLocalService _preguntaLocalService;
}
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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Postulacion. This utility wraps
 * {@link com.hitss.layer.service.impl.PostulacionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Danielle Delgado
 * @see PostulacionLocalService
 * @see com.hitss.layer.service.base.PostulacionLocalServiceBaseImpl
 * @see com.hitss.layer.service.impl.PostulacionLocalServiceImpl
 * @generated
 */
public class PostulacionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.hitss.layer.service.impl.PostulacionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the postulacion to the database. Also notifies the appropriate model listeners.
	*
	* @param postulacion the postulacion
	* @return the postulacion that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Postulacion addPostulacion(
		com.hitss.layer.model.Postulacion postulacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addPostulacion(postulacion);
	}

	/**
	* Creates a new postulacion with the primary key. Does not add the postulacion to the database.
	*
	* @param postulacionPK the primary key for the new postulacion
	* @return the new postulacion
	*/
	public static com.hitss.layer.model.Postulacion createPostulacion(
		com.hitss.layer.service.persistence.PostulacionPK postulacionPK) {
		return getService().createPostulacion(postulacionPK);
	}

	/**
	* Deletes the postulacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param postulacionPK the primary key of the postulacion
	* @return the postulacion that was removed
	* @throws PortalException if a postulacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Postulacion deletePostulacion(
		com.hitss.layer.service.persistence.PostulacionPK postulacionPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePostulacion(postulacionPK);
	}

	/**
	* Deletes the postulacion from the database. Also notifies the appropriate model listeners.
	*
	* @param postulacion the postulacion
	* @return the postulacion that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Postulacion deletePostulacion(
		com.hitss.layer.model.Postulacion postulacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePostulacion(postulacion);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.hitss.layer.model.Postulacion fetchPostulacion(
		com.hitss.layer.service.persistence.PostulacionPK postulacionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPostulacion(postulacionPK);
	}

	/**
	* Returns the postulacion with the primary key.
	*
	* @param postulacionPK the primary key of the postulacion
	* @return the postulacion
	* @throws PortalException if a postulacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Postulacion getPostulacion(
		com.hitss.layer.service.persistence.PostulacionPK postulacionPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPostulacion(postulacionPK);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the postulacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of postulacions
	* @param end the upper bound of the range of postulacions (not inclusive)
	* @return the range of postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Postulacion> getPostulacions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPostulacions(start, end);
	}

	/**
	* Returns the number of postulacions.
	*
	* @return the number of postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static int getPostulacionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPostulacionsCount();
	}

	/**
	* Updates the postulacion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param postulacion the postulacion
	* @return the postulacion that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Postulacion updatePostulacion(
		com.hitss.layer.model.Postulacion postulacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePostulacion(postulacion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<com.hitss.layer.model.Postulacion> listaPostulacionedsSolicitud(
		long solicitudRequerimientoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .listaPostulacionedsSolicitud(solicitudRequerimientoId);
	}

	public static java.util.List<com.hitss.layer.model.Postulacion> getPostulacionBySolicitudRequerimeinto() {
		return getService().getPostulacionBySolicitudRequerimeinto();
	}

	public static long listaSolicitudRequerimientoByPostulacionCount(
		com.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento,
		java.util.Date fechaRegistroInicio, java.util.Date fechaRegistrFin)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.search.ParseException {
		return getService()
				   .listaSolicitudRequerimientoByPostulacionCount(solicitudRequerimiento,
			fechaRegistroInicio, fechaRegistrFin);
	}

	public static java.util.List<com.hitss.layer.model.Postulacion> listaSolicitudRequerimientoByPostulacion(
		com.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento,
		java.util.Date fechaRegistroInicio, java.util.Date fechaRegistrFin,
		int inicio, int fin, java.lang.String orden, java.lang.String campoOrden)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.search.ParseException {
		return getService()
				   .listaSolicitudRequerimientoByPostulacion(solicitudRequerimiento,
			fechaRegistroInicio, fechaRegistrFin, inicio, fin, orden, campoOrden);
	}

	public static void clearService() {
		_service = null;
	}

	public static PostulacionLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					PostulacionLocalService.class.getName());

			if (invokableLocalService instanceof PostulacionLocalService) {
				_service = (PostulacionLocalService)invokableLocalService;
			}
			else {
				_service = new PostulacionLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(PostulacionLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(PostulacionLocalService service) {
	}

	private static PostulacionLocalService _service;
}
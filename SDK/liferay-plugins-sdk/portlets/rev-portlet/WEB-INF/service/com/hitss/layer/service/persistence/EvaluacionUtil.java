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

import com.hitss.layer.model.Evaluacion;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the evaluacion service. This utility wraps {@link EvaluacionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see EvaluacionPersistence
 * @see EvaluacionPersistenceImpl
 * @generated
 */
public class EvaluacionUtil {
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
	public static void clearCache(Evaluacion evaluacion) {
		getPersistence().clearCache(evaluacion);
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
	public static List<Evaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Evaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Evaluacion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Evaluacion update(Evaluacion evaluacion)
		throws SystemException {
		return getPersistence().update(evaluacion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Evaluacion update(Evaluacion evaluacion,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(evaluacion, serviceContext);
	}

	/**
	* Caches the evaluacion in the entity cache if it is enabled.
	*
	* @param evaluacion the evaluacion
	*/
	public static void cacheResult(com.hitss.layer.model.Evaluacion evaluacion) {
		getPersistence().cacheResult(evaluacion);
	}

	/**
	* Caches the evaluacions in the entity cache if it is enabled.
	*
	* @param evaluacions the evaluacions
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.Evaluacion> evaluacions) {
		getPersistence().cacheResult(evaluacions);
	}

	/**
	* Creates a new evaluacion with the primary key. Does not add the evaluacion to the database.
	*
	* @param evaluacionId the primary key for the new evaluacion
	* @return the new evaluacion
	*/
	public static com.hitss.layer.model.Evaluacion create(long evaluacionId) {
		return getPersistence().create(evaluacionId);
	}

	/**
	* Removes the evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param evaluacionId the primary key of the evaluacion
	* @return the evaluacion that was removed
	* @throws com.hitss.layer.NoSuchEvaluacionException if a evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Evaluacion remove(long evaluacionId)
		throws com.hitss.layer.NoSuchEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(evaluacionId);
	}

	public static com.hitss.layer.model.Evaluacion updateImpl(
		com.hitss.layer.model.Evaluacion evaluacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(evaluacion);
	}

	/**
	* Returns the evaluacion with the primary key or throws a {@link com.hitss.layer.NoSuchEvaluacionException} if it could not be found.
	*
	* @param evaluacionId the primary key of the evaluacion
	* @return the evaluacion
	* @throws com.hitss.layer.NoSuchEvaluacionException if a evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Evaluacion findByPrimaryKey(
		long evaluacionId)
		throws com.hitss.layer.NoSuchEvaluacionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(evaluacionId);
	}

	/**
	* Returns the evaluacion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param evaluacionId the primary key of the evaluacion
	* @return the evaluacion, or <code>null</code> if a evaluacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Evaluacion fetchByPrimaryKey(
		long evaluacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(evaluacionId);
	}

	/**
	* Returns all the evaluacions.
	*
	* @return the evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Evaluacion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of evaluacions
	* @param end the upper bound of the range of evaluacions (not inclusive)
	* @return the range of evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Evaluacion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the evaluacions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of evaluacions
	* @param end the upper bound of the range of evaluacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Evaluacion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the evaluacions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of evaluacions.
	*
	* @return the number of evaluacions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the fase postulacions associated with the evaluacion.
	*
	* @param pk the primary key of the evaluacion
	* @return the fase postulacions associated with the evaluacion
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacion> getFasePostulacions(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getFasePostulacions(pk);
	}

	/**
	* Returns a range of all the fase postulacions associated with the evaluacion.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the evaluacion
	* @param start the lower bound of the range of evaluacions
	* @param end the upper bound of the range of evaluacions (not inclusive)
	* @return the range of fase postulacions associated with the evaluacion
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacion> getFasePostulacions(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getFasePostulacions(pk, start, end);
	}

	/**
	* Returns an ordered range of all the fase postulacions associated with the evaluacion.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the evaluacion
	* @param start the lower bound of the range of evaluacions
	* @param end the upper bound of the range of evaluacions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of fase postulacions associated with the evaluacion
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.FasePostulacion> getFasePostulacions(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getFasePostulacions(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of fase postulacions associated with the evaluacion.
	*
	* @param pk the primary key of the evaluacion
	* @return the number of fase postulacions associated with the evaluacion
	* @throws SystemException if a system exception occurred
	*/
	public static int getFasePostulacionsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getFasePostulacionsSize(pk);
	}

	/**
	* Returns <code>true</code> if the fase postulacion is associated with the evaluacion.
	*
	* @param pk the primary key of the evaluacion
	* @param fasePostulacionPK the primary key of the fase postulacion
	* @return <code>true</code> if the fase postulacion is associated with the evaluacion; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsFasePostulacion(long pk,
		long fasePostulacionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsFasePostulacion(pk, fasePostulacionPK);
	}

	/**
	* Returns <code>true</code> if the evaluacion has any fase postulacions associated with it.
	*
	* @param pk the primary key of the evaluacion to check for associations with fase postulacions
	* @return <code>true</code> if the evaluacion has any fase postulacions associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsFasePostulacions(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsFasePostulacions(pk);
	}

	/**
	* Adds an association between the evaluacion and the fase postulacion. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the evaluacion
	* @param fasePostulacionPK the primary key of the fase postulacion
	* @throws SystemException if a system exception occurred
	*/
	public static void addFasePostulacion(long pk, long fasePostulacionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addFasePostulacion(pk, fasePostulacionPK);
	}

	/**
	* Adds an association between the evaluacion and the fase postulacion. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the evaluacion
	* @param fasePostulacion the fase postulacion
	* @throws SystemException if a system exception occurred
	*/
	public static void addFasePostulacion(long pk,
		com.hitss.layer.model.FasePostulacion fasePostulacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addFasePostulacion(pk, fasePostulacion);
	}

	/**
	* Adds an association between the evaluacion and the fase postulacions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the evaluacion
	* @param fasePostulacionPKs the primary keys of the fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static void addFasePostulacions(long pk, long[] fasePostulacionPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addFasePostulacions(pk, fasePostulacionPKs);
	}

	/**
	* Adds an association between the evaluacion and the fase postulacions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the evaluacion
	* @param fasePostulacions the fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static void addFasePostulacions(long pk,
		java.util.List<com.hitss.layer.model.FasePostulacion> fasePostulacions)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addFasePostulacions(pk, fasePostulacions);
	}

	/**
	* Clears all associations between the evaluacion and its fase postulacions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the evaluacion to clear the associated fase postulacions from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearFasePostulacions(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearFasePostulacions(pk);
	}

	/**
	* Removes the association between the evaluacion and the fase postulacion. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the evaluacion
	* @param fasePostulacionPK the primary key of the fase postulacion
	* @throws SystemException if a system exception occurred
	*/
	public static void removeFasePostulacion(long pk, long fasePostulacionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeFasePostulacion(pk, fasePostulacionPK);
	}

	/**
	* Removes the association between the evaluacion and the fase postulacion. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the evaluacion
	* @param fasePostulacion the fase postulacion
	* @throws SystemException if a system exception occurred
	*/
	public static void removeFasePostulacion(long pk,
		com.hitss.layer.model.FasePostulacion fasePostulacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeFasePostulacion(pk, fasePostulacion);
	}

	/**
	* Removes the association between the evaluacion and the fase postulacions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the evaluacion
	* @param fasePostulacionPKs the primary keys of the fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static void removeFasePostulacions(long pk, long[] fasePostulacionPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeFasePostulacions(pk, fasePostulacionPKs);
	}

	/**
	* Removes the association between the evaluacion and the fase postulacions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the evaluacion
	* @param fasePostulacions the fase postulacions
	* @throws SystemException if a system exception occurred
	*/
	public static void removeFasePostulacions(long pk,
		java.util.List<com.hitss.layer.model.FasePostulacion> fasePostulacions)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeFasePostulacions(pk, fasePostulacions);
	}

	/**
	* Sets the fase postulacions associated with the evaluacion, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the evaluacion
	* @param fasePostulacionPKs the primary keys of the fase postulacions to be associated with the evaluacion
	* @throws SystemException if a system exception occurred
	*/
	public static void setFasePostulacions(long pk, long[] fasePostulacionPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setFasePostulacions(pk, fasePostulacionPKs);
	}

	/**
	* Sets the fase postulacions associated with the evaluacion, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the evaluacion
	* @param fasePostulacions the fase postulacions to be associated with the evaluacion
	* @throws SystemException if a system exception occurred
	*/
	public static void setFasePostulacions(long pk,
		java.util.List<com.hitss.layer.model.FasePostulacion> fasePostulacions)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setFasePostulacions(pk, fasePostulacions);
	}

	public static EvaluacionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EvaluacionPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					EvaluacionPersistence.class.getName());

			ReferenceRegistry.registerReference(EvaluacionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EvaluacionPersistence persistence) {
	}

	private static EvaluacionPersistence _persistence;
}
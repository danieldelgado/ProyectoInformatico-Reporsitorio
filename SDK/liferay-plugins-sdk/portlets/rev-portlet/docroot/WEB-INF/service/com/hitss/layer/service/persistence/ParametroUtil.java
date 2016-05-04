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

import com.hitss.layer.model.Parametro;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the parametro service. This utility wraps {@link ParametroPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see ParametroPersistence
 * @see ParametroPersistenceImpl
 * @generated
 */
public class ParametroUtil {
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
	public static void clearCache(Parametro parametro) {
		getPersistence().clearCache(parametro);
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
	public static List<Parametro> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Parametro> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Parametro> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Parametro update(Parametro parametro)
		throws SystemException {
		return getPersistence().update(parametro);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Parametro update(Parametro parametro,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(parametro, serviceContext);
	}

	/**
	* Returns all the parametros where parametroIdpadre = &#63;.
	*
	* @param parametroIdpadre the parametro idpadre
	* @return the matching parametros
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Parametro> findByParametroPadre(
		long parametroIdpadre)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByParametroPadre(parametroIdpadre);
	}

	/**
	* Returns a range of all the parametros where parametroIdpadre = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parametroIdpadre the parametro idpadre
	* @param start the lower bound of the range of parametros
	* @param end the upper bound of the range of parametros (not inclusive)
	* @return the range of matching parametros
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Parametro> findByParametroPadre(
		long parametroIdpadre, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByParametroPadre(parametroIdpadre, start, end);
	}

	/**
	* Returns an ordered range of all the parametros where parametroIdpadre = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parametroIdpadre the parametro idpadre
	* @param start the lower bound of the range of parametros
	* @param end the upper bound of the range of parametros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching parametros
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Parametro> findByParametroPadre(
		long parametroIdpadre, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByParametroPadre(parametroIdpadre, start, end,
			orderByComparator);
	}

	/**
	* Returns the first parametro in the ordered set where parametroIdpadre = &#63;.
	*
	* @param parametroIdpadre the parametro idpadre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching parametro
	* @throws com.hitss.layer.NoSuchParametroException if a matching parametro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Parametro findByParametroPadre_First(
		long parametroIdpadre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchParametroException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByParametroPadre_First(parametroIdpadre,
			orderByComparator);
	}

	/**
	* Returns the first parametro in the ordered set where parametroIdpadre = &#63;.
	*
	* @param parametroIdpadre the parametro idpadre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching parametro, or <code>null</code> if a matching parametro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Parametro fetchByParametroPadre_First(
		long parametroIdpadre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByParametroPadre_First(parametroIdpadre,
			orderByComparator);
	}

	/**
	* Returns the last parametro in the ordered set where parametroIdpadre = &#63;.
	*
	* @param parametroIdpadre the parametro idpadre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching parametro
	* @throws com.hitss.layer.NoSuchParametroException if a matching parametro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Parametro findByParametroPadre_Last(
		long parametroIdpadre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchParametroException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByParametroPadre_Last(parametroIdpadre,
			orderByComparator);
	}

	/**
	* Returns the last parametro in the ordered set where parametroIdpadre = &#63;.
	*
	* @param parametroIdpadre the parametro idpadre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching parametro, or <code>null</code> if a matching parametro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Parametro fetchByParametroPadre_Last(
		long parametroIdpadre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByParametroPadre_Last(parametroIdpadre,
			orderByComparator);
	}

	/**
	* Returns the parametros before and after the current parametro in the ordered set where parametroIdpadre = &#63;.
	*
	* @param parametroId the primary key of the current parametro
	* @param parametroIdpadre the parametro idpadre
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next parametro
	* @throws com.hitss.layer.NoSuchParametroException if a parametro with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Parametro[] findByParametroPadre_PrevAndNext(
		long parametroId, long parametroIdpadre,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchParametroException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByParametroPadre_PrevAndNext(parametroId,
			parametroIdpadre, orderByComparator);
	}

	/**
	* Removes all the parametros where parametroIdpadre = &#63; from the database.
	*
	* @param parametroIdpadre the parametro idpadre
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByParametroPadre(long parametroIdpadre)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByParametroPadre(parametroIdpadre);
	}

	/**
	* Returns the number of parametros where parametroIdpadre = &#63;.
	*
	* @param parametroIdpadre the parametro idpadre
	* @return the number of matching parametros
	* @throws SystemException if a system exception occurred
	*/
	public static int countByParametroPadre(long parametroIdpadre)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByParametroPadre(parametroIdpadre);
	}

	/**
	* Returns all the parametros where parametroIdpadre = &#63; and valor LIKE &#63;.
	*
	* @param parametroIdpadre the parametro idpadre
	* @param valor the valor
	* @return the matching parametros
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Parametro> findByValor(
		long parametroIdpadre, java.lang.String valor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByValor(parametroIdpadre, valor);
	}

	/**
	* Returns a range of all the parametros where parametroIdpadre = &#63; and valor LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parametroIdpadre the parametro idpadre
	* @param valor the valor
	* @param start the lower bound of the range of parametros
	* @param end the upper bound of the range of parametros (not inclusive)
	* @return the range of matching parametros
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Parametro> findByValor(
		long parametroIdpadre, java.lang.String valor, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByValor(parametroIdpadre, valor, start, end);
	}

	/**
	* Returns an ordered range of all the parametros where parametroIdpadre = &#63; and valor LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parametroIdpadre the parametro idpadre
	* @param valor the valor
	* @param start the lower bound of the range of parametros
	* @param end the upper bound of the range of parametros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching parametros
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Parametro> findByValor(
		long parametroIdpadre, java.lang.String valor, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByValor(parametroIdpadre, valor, start, end,
			orderByComparator);
	}

	/**
	* Returns the first parametro in the ordered set where parametroIdpadre = &#63; and valor LIKE &#63;.
	*
	* @param parametroIdpadre the parametro idpadre
	* @param valor the valor
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching parametro
	* @throws com.hitss.layer.NoSuchParametroException if a matching parametro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Parametro findByValor_First(
		long parametroIdpadre, java.lang.String valor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchParametroException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByValor_First(parametroIdpadre, valor, orderByComparator);
	}

	/**
	* Returns the first parametro in the ordered set where parametroIdpadre = &#63; and valor LIKE &#63;.
	*
	* @param parametroIdpadre the parametro idpadre
	* @param valor the valor
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching parametro, or <code>null</code> if a matching parametro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Parametro fetchByValor_First(
		long parametroIdpadre, java.lang.String valor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByValor_First(parametroIdpadre, valor,
			orderByComparator);
	}

	/**
	* Returns the last parametro in the ordered set where parametroIdpadre = &#63; and valor LIKE &#63;.
	*
	* @param parametroIdpadre the parametro idpadre
	* @param valor the valor
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching parametro
	* @throws com.hitss.layer.NoSuchParametroException if a matching parametro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Parametro findByValor_Last(
		long parametroIdpadre, java.lang.String valor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchParametroException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByValor_Last(parametroIdpadre, valor, orderByComparator);
	}

	/**
	* Returns the last parametro in the ordered set where parametroIdpadre = &#63; and valor LIKE &#63;.
	*
	* @param parametroIdpadre the parametro idpadre
	* @param valor the valor
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching parametro, or <code>null</code> if a matching parametro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Parametro fetchByValor_Last(
		long parametroIdpadre, java.lang.String valor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByValor_Last(parametroIdpadre, valor, orderByComparator);
	}

	/**
	* Returns the parametros before and after the current parametro in the ordered set where parametroIdpadre = &#63; and valor LIKE &#63;.
	*
	* @param parametroId the primary key of the current parametro
	* @param parametroIdpadre the parametro idpadre
	* @param valor the valor
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next parametro
	* @throws com.hitss.layer.NoSuchParametroException if a parametro with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Parametro[] findByValor_PrevAndNext(
		long parametroId, long parametroIdpadre, java.lang.String valor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.hitss.layer.NoSuchParametroException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByValor_PrevAndNext(parametroId, parametroIdpadre,
			valor, orderByComparator);
	}

	/**
	* Removes all the parametros where parametroIdpadre = &#63; and valor LIKE &#63; from the database.
	*
	* @param parametroIdpadre the parametro idpadre
	* @param valor the valor
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByValor(long parametroIdpadre,
		java.lang.String valor)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByValor(parametroIdpadre, valor);
	}

	/**
	* Returns the number of parametros where parametroIdpadre = &#63; and valor LIKE &#63;.
	*
	* @param parametroIdpadre the parametro idpadre
	* @param valor the valor
	* @return the number of matching parametros
	* @throws SystemException if a system exception occurred
	*/
	public static int countByValor(long parametroIdpadre, java.lang.String valor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByValor(parametroIdpadre, valor);
	}

	/**
	* Caches the parametro in the entity cache if it is enabled.
	*
	* @param parametro the parametro
	*/
	public static void cacheResult(com.hitss.layer.model.Parametro parametro) {
		getPersistence().cacheResult(parametro);
	}

	/**
	* Caches the parametros in the entity cache if it is enabled.
	*
	* @param parametros the parametros
	*/
	public static void cacheResult(
		java.util.List<com.hitss.layer.model.Parametro> parametros) {
		getPersistence().cacheResult(parametros);
	}

	/**
	* Creates a new parametro with the primary key. Does not add the parametro to the database.
	*
	* @param parametroId the primary key for the new parametro
	* @return the new parametro
	*/
	public static com.hitss.layer.model.Parametro create(long parametroId) {
		return getPersistence().create(parametroId);
	}

	/**
	* Removes the parametro with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param parametroId the primary key of the parametro
	* @return the parametro that was removed
	* @throws com.hitss.layer.NoSuchParametroException if a parametro with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Parametro remove(long parametroId)
		throws com.hitss.layer.NoSuchParametroException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(parametroId);
	}

	public static com.hitss.layer.model.Parametro updateImpl(
		com.hitss.layer.model.Parametro parametro)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(parametro);
	}

	/**
	* Returns the parametro with the primary key or throws a {@link com.hitss.layer.NoSuchParametroException} if it could not be found.
	*
	* @param parametroId the primary key of the parametro
	* @return the parametro
	* @throws com.hitss.layer.NoSuchParametroException if a parametro with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Parametro findByPrimaryKey(
		long parametroId)
		throws com.hitss.layer.NoSuchParametroException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(parametroId);
	}

	/**
	* Returns the parametro with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param parametroId the primary key of the parametro
	* @return the parametro, or <code>null</code> if a parametro with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hitss.layer.model.Parametro fetchByPrimaryKey(
		long parametroId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(parametroId);
	}

	/**
	* Returns all the parametros.
	*
	* @return the parametros
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Parametro> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the parametros.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of parametros
	* @param end the upper bound of the range of parametros (not inclusive)
	* @return the range of parametros
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Parametro> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the parametros.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of parametros
	* @param end the upper bound of the range of parametros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of parametros
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hitss.layer.model.Parametro> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the parametros from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of parametros.
	*
	* @return the number of parametros
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ParametroPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ParametroPersistence)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					ParametroPersistence.class.getName());

			ReferenceRegistry.registerReference(ParametroUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ParametroPersistence persistence) {
	}

	private static ParametroPersistence _persistence;
}
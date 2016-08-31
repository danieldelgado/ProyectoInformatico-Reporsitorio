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

import com.hitss.layer.NoSuchSolicitudRequerimientoException;
import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.model.impl.SolicitudRequerimientoImpl;
import com.hitss.layer.model.impl.SolicitudRequerimientoModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the solicitud requerimiento service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoPersistence
 * @see SolicitudRequerimientoUtil
 * @generated
 */
public class SolicitudRequerimientoPersistenceImpl extends BasePersistenceImpl<SolicitudRequerimiento>
	implements SolicitudRequerimientoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SolicitudRequerimientoUtil} to access the solicitud requerimiento persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SolicitudRequerimientoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_C = new FinderPath(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByC", new String[] { String.class.getName() },
			SolicitudRequerimientoModelImpl.CONTENIDOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C = new FinderPath(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC",
			new String[] { String.class.getName() });

	/**
	 * Returns the solicitud requerimiento where contenidoId = &#63; or throws a {@link com.hitss.layer.NoSuchSolicitudRequerimientoException} if it could not be found.
	 *
	 * @param contenidoId the contenido ID
	 * @return the matching solicitud requerimiento
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a matching solicitud requerimiento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento findByC(String contenidoId)
		throws NoSuchSolicitudRequerimientoException, SystemException {
		SolicitudRequerimiento solicitudRequerimiento = fetchByC(contenidoId);

		if (solicitudRequerimiento == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("contenidoId=");
			msg.append(contenidoId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchSolicitudRequerimientoException(msg.toString());
		}

		return solicitudRequerimiento;
	}

	/**
	 * Returns the solicitud requerimiento where contenidoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param contenidoId the contenido ID
	 * @return the matching solicitud requerimiento, or <code>null</code> if a matching solicitud requerimiento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento fetchByC(String contenidoId)
		throws SystemException {
		return fetchByC(contenidoId, true);
	}

	/**
	 * Returns the solicitud requerimiento where contenidoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param contenidoId the contenido ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching solicitud requerimiento, or <code>null</code> if a matching solicitud requerimiento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento fetchByC(String contenidoId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { contenidoId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C,
					finderArgs, this);
		}

		if (result instanceof SolicitudRequerimiento) {
			SolicitudRequerimiento solicitudRequerimiento = (SolicitudRequerimiento)result;

			if (!Validator.equals(contenidoId,
						solicitudRequerimiento.getContenidoId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTO_WHERE);

			boolean bindContenidoId = false;

			if (contenidoId == null) {
				query.append(_FINDER_COLUMN_C_CONTENIDOID_1);
			}
			else if (contenidoId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_CONTENIDOID_3);
			}
			else {
				bindContenidoId = true;

				query.append(_FINDER_COLUMN_C_CONTENIDOID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindContenidoId) {
					qPos.add(contenidoId);
				}

				List<SolicitudRequerimiento> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"SolicitudRequerimientoPersistenceImpl.fetchByC(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					SolicitudRequerimiento solicitudRequerimiento = list.get(0);

					result = solicitudRequerimiento;

					cacheResult(solicitudRequerimiento);

					if ((solicitudRequerimiento.getContenidoId() == null) ||
							!solicitudRequerimiento.getContenidoId()
													   .equals(contenidoId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C,
							finderArgs, solicitudRequerimiento);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (SolicitudRequerimiento)result;
		}
	}

	/**
	 * Removes the solicitud requerimiento where contenidoId = &#63; from the database.
	 *
	 * @param contenidoId the contenido ID
	 * @return the solicitud requerimiento that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento removeByC(String contenidoId)
		throws NoSuchSolicitudRequerimientoException, SystemException {
		SolicitudRequerimiento solicitudRequerimiento = findByC(contenidoId);

		return remove(solicitudRequerimiento);
	}

	/**
	 * Returns the number of solicitud requerimientos where contenidoId = &#63;.
	 *
	 * @param contenidoId the contenido ID
	 * @return the number of matching solicitud requerimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC(String contenidoId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C;

		Object[] finderArgs = new Object[] { contenidoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SOLICITUDREQUERIMIENTO_WHERE);

			boolean bindContenidoId = false;

			if (contenidoId == null) {
				query.append(_FINDER_COLUMN_C_CONTENIDOID_1);
			}
			else if (contenidoId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_CONTENIDOID_3);
			}
			else {
				bindContenidoId = true;

				query.append(_FINDER_COLUMN_C_CONTENIDOID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindContenidoId) {
					qPos.add(contenidoId);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_C_CONTENIDOID_1 = "solicitudRequerimiento.contenidoId IS NULL AND solicitudRequerimiento.activo=true";
	private static final String _FINDER_COLUMN_C_CONTENIDOID_2 = "solicitudRequerimiento.contenidoId = ? AND solicitudRequerimiento.activo=true";
	private static final String _FINDER_COLUMN_C_CONTENIDOID_3 = "(solicitudRequerimiento.contenidoId IS NULL OR solicitudRequerimiento.contenidoId = '') AND solicitudRequerimiento.activo=true";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SOLICITUDREQUERIMIENTOID =
		new FinderPath(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySolicitudRequerimientoId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOLICITUDREQUERIMIENTOID =
		new FinderPath(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySolicitudRequerimientoId",
			new String[] { Long.class.getName() },
			SolicitudRequerimientoModelImpl.SOLICITUDREQUERIMIENTOID_COLUMN_BITMASK |
			SolicitudRequerimientoModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SOLICITUDREQUERIMIENTOID =
		new FinderPath(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySolicitudRequerimientoId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the solicitud requerimientos where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @return the matching solicitud requerimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimiento> findBySolicitudRequerimientoId(
		long solicitudRequerimientoId) throws SystemException {
		return findBySolicitudRequerimientoId(solicitudRequerimientoId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud requerimientos where solicitudRequerimientoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param start the lower bound of the range of solicitud requerimientos
	 * @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	 * @return the range of matching solicitud requerimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimiento> findBySolicitudRequerimientoId(
		long solicitudRequerimientoId, int start, int end)
		throws SystemException {
		return findBySolicitudRequerimientoId(solicitudRequerimientoId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud requerimientos where solicitudRequerimientoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param start the lower bound of the range of solicitud requerimientos
	 * @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching solicitud requerimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimiento> findBySolicitudRequerimientoId(
		long solicitudRequerimientoId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOLICITUDREQUERIMIENTOID;
			finderArgs = new Object[] { solicitudRequerimientoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SOLICITUDREQUERIMIENTOID;
			finderArgs = new Object[] {
					solicitudRequerimientoId,
					
					start, end, orderByComparator
				};
		}

		List<SolicitudRequerimiento> list = (List<SolicitudRequerimiento>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SolicitudRequerimiento solicitudRequerimiento : list) {
				if ((solicitudRequerimientoId != solicitudRequerimiento.getSolicitudRequerimientoId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTO_WHERE);

			query.append(_FINDER_COLUMN_SOLICITUDREQUERIMIENTOID_SOLICITUDREQUERIMIENTOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SolicitudRequerimientoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				if (!pagination) {
					list = (List<SolicitudRequerimiento>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudRequerimiento>(list);
				}
				else {
					list = (List<SolicitudRequerimiento>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first solicitud requerimiento in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a matching solicitud requerimiento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento findBySolicitudRequerimientoId_First(
		long solicitudRequerimientoId, OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoException, SystemException {
		SolicitudRequerimiento solicitudRequerimiento = fetchBySolicitudRequerimientoId_First(solicitudRequerimientoId,
				orderByComparator);

		if (solicitudRequerimiento != null) {
			return solicitudRequerimiento;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoException(msg.toString());
	}

	/**
	 * Returns the first solicitud requerimiento in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento, or <code>null</code> if a matching solicitud requerimiento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento fetchBySolicitudRequerimientoId_First(
		long solicitudRequerimientoId, OrderByComparator orderByComparator)
		throws SystemException {
		List<SolicitudRequerimiento> list = findBySolicitudRequerimientoId(solicitudRequerimientoId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last solicitud requerimiento in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a matching solicitud requerimiento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento findBySolicitudRequerimientoId_Last(
		long solicitudRequerimientoId, OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoException, SystemException {
		SolicitudRequerimiento solicitudRequerimiento = fetchBySolicitudRequerimientoId_Last(solicitudRequerimientoId,
				orderByComparator);

		if (solicitudRequerimiento != null) {
			return solicitudRequerimiento;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoException(msg.toString());
	}

	/**
	 * Returns the last solicitud requerimiento in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento, or <code>null</code> if a matching solicitud requerimiento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento fetchBySolicitudRequerimientoId_Last(
		long solicitudRequerimientoId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySolicitudRequerimientoId(solicitudRequerimientoId);

		if (count == 0) {
			return null;
		}

		List<SolicitudRequerimiento> list = findBySolicitudRequerimientoId(solicitudRequerimientoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the solicitud requerimientos where solicitudRequerimientoId = &#63; from the database.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBySolicitudRequerimientoId(long solicitudRequerimientoId)
		throws SystemException {
		for (SolicitudRequerimiento solicitudRequerimiento : findBySolicitudRequerimientoId(
				solicitudRequerimientoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(solicitudRequerimiento);
		}
	}

	/**
	 * Returns the number of solicitud requerimientos where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @return the number of matching solicitud requerimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBySolicitudRequerimientoId(long solicitudRequerimientoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SOLICITUDREQUERIMIENTOID;

		Object[] finderArgs = new Object[] { solicitudRequerimientoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SOLICITUDREQUERIMIENTO_WHERE);

			query.append(_FINDER_COLUMN_SOLICITUDREQUERIMIENTOID_SOLICITUDREQUERIMIENTOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_SOLICITUDREQUERIMIENTOID_SOLICITUDREQUERIMIENTOID_2 =
		"solicitudRequerimiento.solicitudRequerimientoId = ? AND solicitudRequerimiento.activo=true";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ESTADO = new FinderPath(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEstado",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ESTADO =
		new FinderPath(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEstado",
			new String[] { Long.class.getName() },
			SolicitudRequerimientoModelImpl.ESTADO_COLUMN_BITMASK |
			SolicitudRequerimientoModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ESTADO = new FinderPath(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEstado",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the solicitud requerimientos where estado = &#63;.
	 *
	 * @param estado the estado
	 * @return the matching solicitud requerimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimiento> findByEstado(long estado)
		throws SystemException {
		return findByEstado(estado, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud requerimientos where estado = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param estado the estado
	 * @param start the lower bound of the range of solicitud requerimientos
	 * @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	 * @return the range of matching solicitud requerimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimiento> findByEstado(long estado, int start,
		int end) throws SystemException {
		return findByEstado(estado, start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud requerimientos where estado = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param estado the estado
	 * @param start the lower bound of the range of solicitud requerimientos
	 * @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching solicitud requerimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimiento> findByEstado(long estado, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ESTADO;
			finderArgs = new Object[] { estado };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ESTADO;
			finderArgs = new Object[] { estado, start, end, orderByComparator };
		}

		List<SolicitudRequerimiento> list = (List<SolicitudRequerimiento>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SolicitudRequerimiento solicitudRequerimiento : list) {
				if ((estado != solicitudRequerimiento.getEstado())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTO_WHERE);

			query.append(_FINDER_COLUMN_ESTADO_ESTADO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SolicitudRequerimientoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(estado);

				if (!pagination) {
					list = (List<SolicitudRequerimiento>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudRequerimiento>(list);
				}
				else {
					list = (List<SolicitudRequerimiento>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first solicitud requerimiento in the ordered set where estado = &#63;.
	 *
	 * @param estado the estado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a matching solicitud requerimiento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento findByEstado_First(long estado,
		OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoException, SystemException {
		SolicitudRequerimiento solicitudRequerimiento = fetchByEstado_First(estado,
				orderByComparator);

		if (solicitudRequerimiento != null) {
			return solicitudRequerimiento;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("estado=");
		msg.append(estado);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoException(msg.toString());
	}

	/**
	 * Returns the first solicitud requerimiento in the ordered set where estado = &#63;.
	 *
	 * @param estado the estado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento, or <code>null</code> if a matching solicitud requerimiento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento fetchByEstado_First(long estado,
		OrderByComparator orderByComparator) throws SystemException {
		List<SolicitudRequerimiento> list = findByEstado(estado, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last solicitud requerimiento in the ordered set where estado = &#63;.
	 *
	 * @param estado the estado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a matching solicitud requerimiento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento findByEstado_Last(long estado,
		OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoException, SystemException {
		SolicitudRequerimiento solicitudRequerimiento = fetchByEstado_Last(estado,
				orderByComparator);

		if (solicitudRequerimiento != null) {
			return solicitudRequerimiento;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("estado=");
		msg.append(estado);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoException(msg.toString());
	}

	/**
	 * Returns the last solicitud requerimiento in the ordered set where estado = &#63;.
	 *
	 * @param estado the estado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento, or <code>null</code> if a matching solicitud requerimiento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento fetchByEstado_Last(long estado,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByEstado(estado);

		if (count == 0) {
			return null;
		}

		List<SolicitudRequerimiento> list = findByEstado(estado, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the solicitud requerimientos before and after the current solicitud requerimiento in the ordered set where estado = &#63;.
	 *
	 * @param solicitudRequerimientoId the primary key of the current solicitud requerimiento
	 * @param estado the estado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next solicitud requerimiento
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a solicitud requerimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento[] findByEstado_PrevAndNext(
		long solicitudRequerimientoId, long estado,
		OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoException, SystemException {
		SolicitudRequerimiento solicitudRequerimiento = findByPrimaryKey(solicitudRequerimientoId);

		Session session = null;

		try {
			session = openSession();

			SolicitudRequerimiento[] array = new SolicitudRequerimientoImpl[3];

			array[0] = getByEstado_PrevAndNext(session, solicitudRequerimiento,
					estado, orderByComparator, true);

			array[1] = solicitudRequerimiento;

			array[2] = getByEstado_PrevAndNext(session, solicitudRequerimiento,
					estado, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SolicitudRequerimiento getByEstado_PrevAndNext(Session session,
		SolicitudRequerimiento solicitudRequerimiento, long estado,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTO_WHERE);

		query.append(_FINDER_COLUMN_ESTADO_ESTADO_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(SolicitudRequerimientoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(estado);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(solicitudRequerimiento);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SolicitudRequerimiento> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the solicitud requerimientos where estado = &#63; from the database.
	 *
	 * @param estado the estado
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByEstado(long estado) throws SystemException {
		for (SolicitudRequerimiento solicitudRequerimiento : findByEstado(
				estado, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(solicitudRequerimiento);
		}
	}

	/**
	 * Returns the number of solicitud requerimientos where estado = &#63;.
	 *
	 * @param estado the estado
	 * @return the number of matching solicitud requerimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByEstado(long estado) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ESTADO;

		Object[] finderArgs = new Object[] { estado };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SOLICITUDREQUERIMIENTO_WHERE);

			query.append(_FINDER_COLUMN_ESTADO_ESTADO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(estado);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ESTADO_ESTADO_2 = "solicitudRequerimiento.estado = ? AND solicitudRequerimiento.activo=true";

	public SolicitudRequerimientoPersistenceImpl() {
		setModelClass(SolicitudRequerimiento.class);
	}

	/**
	 * Caches the solicitud requerimiento in the entity cache if it is enabled.
	 *
	 * @param solicitudRequerimiento the solicitud requerimiento
	 */
	@Override
	public void cacheResult(SolicitudRequerimiento solicitudRequerimiento) {
		EntityCacheUtil.putResult(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoImpl.class,
			solicitudRequerimiento.getPrimaryKey(), solicitudRequerimiento);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C,
			new Object[] { solicitudRequerimiento.getContenidoId() },
			solicitudRequerimiento);

		solicitudRequerimiento.resetOriginalValues();
	}

	/**
	 * Caches the solicitud requerimientos in the entity cache if it is enabled.
	 *
	 * @param solicitudRequerimientos the solicitud requerimientos
	 */
	@Override
	public void cacheResult(
		List<SolicitudRequerimiento> solicitudRequerimientos) {
		for (SolicitudRequerimiento solicitudRequerimiento : solicitudRequerimientos) {
			if (EntityCacheUtil.getResult(
						SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
						SolicitudRequerimientoImpl.class,
						solicitudRequerimiento.getPrimaryKey()) == null) {
				cacheResult(solicitudRequerimiento);
			}
			else {
				solicitudRequerimiento.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all solicitud requerimientos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SolicitudRequerimientoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SolicitudRequerimientoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the solicitud requerimiento.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SolicitudRequerimiento solicitudRequerimiento) {
		EntityCacheUtil.removeResult(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoImpl.class,
			solicitudRequerimiento.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(solicitudRequerimiento);
	}

	@Override
	public void clearCache(List<SolicitudRequerimiento> solicitudRequerimientos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SolicitudRequerimiento solicitudRequerimiento : solicitudRequerimientos) {
			EntityCacheUtil.removeResult(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
				SolicitudRequerimientoImpl.class,
				solicitudRequerimiento.getPrimaryKey());

			clearUniqueFindersCache(solicitudRequerimiento);
		}
	}

	protected void cacheUniqueFindersCache(
		SolicitudRequerimiento solicitudRequerimiento) {
		if (solicitudRequerimiento.isNew()) {
			Object[] args = new Object[] { solicitudRequerimiento.getContenidoId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C, args,
				solicitudRequerimiento);
		}
		else {
			SolicitudRequerimientoModelImpl solicitudRequerimientoModelImpl = (SolicitudRequerimientoModelImpl)solicitudRequerimiento;

			if ((solicitudRequerimientoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						solicitudRequerimiento.getContenidoId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C, args,
					solicitudRequerimiento);
			}
		}
	}

	protected void clearUniqueFindersCache(
		SolicitudRequerimiento solicitudRequerimiento) {
		SolicitudRequerimientoModelImpl solicitudRequerimientoModelImpl = (SolicitudRequerimientoModelImpl)solicitudRequerimiento;

		Object[] args = new Object[] { solicitudRequerimiento.getContenidoId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C, args);

		if ((solicitudRequerimientoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C.getColumnBitmask()) != 0) {
			args = new Object[] {
					solicitudRequerimientoModelImpl.getOriginalContenidoId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C, args);
		}
	}

	/**
	 * Creates a new solicitud requerimiento with the primary key. Does not add the solicitud requerimiento to the database.
	 *
	 * @param solicitudRequerimientoId the primary key for the new solicitud requerimiento
	 * @return the new solicitud requerimiento
	 */
	@Override
	public SolicitudRequerimiento create(long solicitudRequerimientoId) {
		SolicitudRequerimiento solicitudRequerimiento = new SolicitudRequerimientoImpl();

		solicitudRequerimiento.setNew(true);
		solicitudRequerimiento.setPrimaryKey(solicitudRequerimientoId);

		return solicitudRequerimiento;
	}

	/**
	 * Removes the solicitud requerimiento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param solicitudRequerimientoId the primary key of the solicitud requerimiento
	 * @return the solicitud requerimiento that was removed
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a solicitud requerimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento remove(long solicitudRequerimientoId)
		throws NoSuchSolicitudRequerimientoException, SystemException {
		return remove((Serializable)solicitudRequerimientoId);
	}

	/**
	 * Removes the solicitud requerimiento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the solicitud requerimiento
	 * @return the solicitud requerimiento that was removed
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a solicitud requerimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento remove(Serializable primaryKey)
		throws NoSuchSolicitudRequerimientoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SolicitudRequerimiento solicitudRequerimiento = (SolicitudRequerimiento)session.get(SolicitudRequerimientoImpl.class,
					primaryKey);

			if (solicitudRequerimiento == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSolicitudRequerimientoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(solicitudRequerimiento);
		}
		catch (NoSuchSolicitudRequerimientoException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected SolicitudRequerimiento removeImpl(
		SolicitudRequerimiento solicitudRequerimiento)
		throws SystemException {
		solicitudRequerimiento = toUnwrappedModel(solicitudRequerimiento);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(solicitudRequerimiento)) {
				solicitudRequerimiento = (SolicitudRequerimiento)session.get(SolicitudRequerimientoImpl.class,
						solicitudRequerimiento.getPrimaryKeyObj());
			}

			if (solicitudRequerimiento != null) {
				session.delete(solicitudRequerimiento);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (solicitudRequerimiento != null) {
			clearCache(solicitudRequerimiento);
		}

		return solicitudRequerimiento;
	}

	@Override
	public SolicitudRequerimiento updateImpl(
		com.hitss.layer.model.SolicitudRequerimiento solicitudRequerimiento)
		throws SystemException {
		solicitudRequerimiento = toUnwrappedModel(solicitudRequerimiento);

		boolean isNew = solicitudRequerimiento.isNew();

		SolicitudRequerimientoModelImpl solicitudRequerimientoModelImpl = (SolicitudRequerimientoModelImpl)solicitudRequerimiento;

		Session session = null;

		try {
			session = openSession();

			if (solicitudRequerimiento.isNew()) {
				session.save(solicitudRequerimiento);

				solicitudRequerimiento.setNew(false);
			}
			else {
				session.merge(solicitudRequerimiento);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SolicitudRequerimientoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((solicitudRequerimientoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOLICITUDREQUERIMIENTOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						solicitudRequerimientoModelImpl.getOriginalSolicitudRequerimientoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SOLICITUDREQUERIMIENTOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOLICITUDREQUERIMIENTOID,
					args);

				args = new Object[] {
						solicitudRequerimientoModelImpl.getSolicitudRequerimientoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SOLICITUDREQUERIMIENTOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOLICITUDREQUERIMIENTOID,
					args);
			}

			if ((solicitudRequerimientoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ESTADO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						solicitudRequerimientoModelImpl.getOriginalEstado()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ESTADO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ESTADO,
					args);

				args = new Object[] { solicitudRequerimientoModelImpl.getEstado() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ESTADO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ESTADO,
					args);
			}
		}

		EntityCacheUtil.putResult(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoImpl.class,
			solicitudRequerimiento.getPrimaryKey(), solicitudRequerimiento);

		clearUniqueFindersCache(solicitudRequerimiento);
		cacheUniqueFindersCache(solicitudRequerimiento);

		return solicitudRequerimiento;
	}

	protected SolicitudRequerimiento toUnwrappedModel(
		SolicitudRequerimiento solicitudRequerimiento) {
		if (solicitudRequerimiento instanceof SolicitudRequerimientoImpl) {
			return solicitudRequerimiento;
		}

		SolicitudRequerimientoImpl solicitudRequerimientoImpl = new SolicitudRequerimientoImpl();

		solicitudRequerimientoImpl.setNew(solicitudRequerimiento.isNew());
		solicitudRequerimientoImpl.setPrimaryKey(solicitudRequerimiento.getPrimaryKey());

		solicitudRequerimientoImpl.setSolicitudRequerimientoId(solicitudRequerimiento.getSolicitudRequerimientoId());
		solicitudRequerimientoImpl.setAreaSolicitante(solicitudRequerimiento.getAreaSolicitante());
		solicitudRequerimientoImpl.setCantidadRecursos(solicitudRequerimiento.getCantidadRecursos());
		solicitudRequerimientoImpl.setResponsableRRHH(solicitudRequerimiento.getResponsableRRHH());
		solicitudRequerimientoImpl.setFechaLimite(solicitudRequerimiento.getFechaLimite());
		solicitudRequerimientoImpl.setTiempoContrato(solicitudRequerimiento.getTiempoContrato());
		solicitudRequerimientoImpl.setTipoNegocio(solicitudRequerimiento.getTipoNegocio());
		solicitudRequerimientoImpl.setPresupuestoMaximo(solicitudRequerimiento.getPresupuestoMaximo());
		solicitudRequerimientoImpl.setPresupuestoMinimo(solicitudRequerimiento.getPresupuestoMinimo());
		solicitudRequerimientoImpl.setCliente(solicitudRequerimiento.getCliente());
		solicitudRequerimientoImpl.setEspecialidad(solicitudRequerimiento.getEspecialidad());
		solicitudRequerimientoImpl.setMeta(solicitudRequerimiento.getMeta());
		solicitudRequerimientoImpl.setFechameta(solicitudRequerimiento.getFechameta());
		solicitudRequerimientoImpl.setPrioridad(solicitudRequerimiento.getPrioridad());
		solicitudRequerimientoImpl.setContenidoId(solicitudRequerimiento.getContenidoId());
		solicitudRequerimientoImpl.setModalidadjornada(solicitudRequerimiento.getModalidadjornada());
		solicitudRequerimientoImpl.setModalidadcontrato(solicitudRequerimiento.getModalidadcontrato());
		solicitudRequerimientoImpl.setLugarTrabajo(solicitudRequerimiento.getLugarTrabajo());
		solicitudRequerimientoImpl.setCategoriaPuestoId(solicitudRequerimiento.getCategoriaPuestoId());
		solicitudRequerimientoImpl.setProyecto(solicitudRequerimiento.getProyecto());
		solicitudRequerimientoImpl.setTiporeclutamiento(solicitudRequerimiento.getTiporeclutamiento());
		solicitudRequerimientoImpl.setEstado(solicitudRequerimiento.getEstado());
		solicitudRequerimientoImpl.setActivo(solicitudRequerimiento.isActivo());
		solicitudRequerimientoImpl.setUsuariocrea(solicitudRequerimiento.getUsuariocrea());
		solicitudRequerimientoImpl.setFechacrea(solicitudRequerimiento.getFechacrea());
		solicitudRequerimientoImpl.setUsuariomodifica(solicitudRequerimiento.getUsuariomodifica());
		solicitudRequerimientoImpl.setFechamodifica(solicitudRequerimiento.getFechamodifica());

		return solicitudRequerimientoImpl;
	}

	/**
	 * Returns the solicitud requerimiento with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the solicitud requerimiento
	 * @return the solicitud requerimiento
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a solicitud requerimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSolicitudRequerimientoException, SystemException {
		SolicitudRequerimiento solicitudRequerimiento = fetchByPrimaryKey(primaryKey);

		if (solicitudRequerimiento == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSolicitudRequerimientoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return solicitudRequerimiento;
	}

	/**
	 * Returns the solicitud requerimiento with the primary key or throws a {@link com.hitss.layer.NoSuchSolicitudRequerimientoException} if it could not be found.
	 *
	 * @param solicitudRequerimientoId the primary key of the solicitud requerimiento
	 * @return the solicitud requerimiento
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoException if a solicitud requerimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento findByPrimaryKey(
		long solicitudRequerimientoId)
		throws NoSuchSolicitudRequerimientoException, SystemException {
		return findByPrimaryKey((Serializable)solicitudRequerimientoId);
	}

	/**
	 * Returns the solicitud requerimiento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the solicitud requerimiento
	 * @return the solicitud requerimiento, or <code>null</code> if a solicitud requerimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		SolicitudRequerimiento solicitudRequerimiento = (SolicitudRequerimiento)EntityCacheUtil.getResult(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
				SolicitudRequerimientoImpl.class, primaryKey);

		if (solicitudRequerimiento == _nullSolicitudRequerimiento) {
			return null;
		}

		if (solicitudRequerimiento == null) {
			Session session = null;

			try {
				session = openSession();

				solicitudRequerimiento = (SolicitudRequerimiento)session.get(SolicitudRequerimientoImpl.class,
						primaryKey);

				if (solicitudRequerimiento != null) {
					cacheResult(solicitudRequerimiento);
				}
				else {
					EntityCacheUtil.putResult(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
						SolicitudRequerimientoImpl.class, primaryKey,
						_nullSolicitudRequerimiento);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SolicitudRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
					SolicitudRequerimientoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return solicitudRequerimiento;
	}

	/**
	 * Returns the solicitud requerimiento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param solicitudRequerimientoId the primary key of the solicitud requerimiento
	 * @return the solicitud requerimiento, or <code>null</code> if a solicitud requerimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimiento fetchByPrimaryKey(
		long solicitudRequerimientoId) throws SystemException {
		return fetchByPrimaryKey((Serializable)solicitudRequerimientoId);
	}

	/**
	 * Returns all the solicitud requerimientos.
	 *
	 * @return the solicitud requerimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimiento> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud requerimientos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of solicitud requerimientos
	 * @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	 * @return the range of solicitud requerimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimiento> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud requerimientos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of solicitud requerimientos
	 * @param end the upper bound of the range of solicitud requerimientos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of solicitud requerimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimiento> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<SolicitudRequerimiento> list = (List<SolicitudRequerimiento>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SOLICITUDREQUERIMIENTO;

				if (pagination) {
					sql = sql.concat(SolicitudRequerimientoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SolicitudRequerimiento>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudRequerimiento>(list);
				}
				else {
					list = (List<SolicitudRequerimiento>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the solicitud requerimientos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SolicitudRequerimiento solicitudRequerimiento : findAll()) {
			remove(solicitudRequerimiento);
		}
	}

	/**
	 * Returns the number of solicitud requerimientos.
	 *
	 * @return the number of solicitud requerimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SOLICITUDREQUERIMIENTO);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the solicitud requerimiento persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.SolicitudRequerimiento")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SolicitudRequerimiento>> listenersList = new ArrayList<ModelListener<SolicitudRequerimiento>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SolicitudRequerimiento>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(SolicitudRequerimientoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SOLICITUDREQUERIMIENTO = "SELECT solicitudRequerimiento FROM SolicitudRequerimiento solicitudRequerimiento";
	private static final String _SQL_SELECT_SOLICITUDREQUERIMIENTO_WHERE = "SELECT solicitudRequerimiento FROM SolicitudRequerimiento solicitudRequerimiento WHERE ";
	private static final String _SQL_COUNT_SOLICITUDREQUERIMIENTO = "SELECT COUNT(solicitudRequerimiento) FROM SolicitudRequerimiento solicitudRequerimiento";
	private static final String _SQL_COUNT_SOLICITUDREQUERIMIENTO_WHERE = "SELECT COUNT(solicitudRequerimiento) FROM SolicitudRequerimiento solicitudRequerimiento WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "solicitudRequerimiento.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SolicitudRequerimiento exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SolicitudRequerimiento exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SolicitudRequerimientoPersistenceImpl.class);
	private static SolicitudRequerimiento _nullSolicitudRequerimiento = new SolicitudRequerimientoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SolicitudRequerimiento> toCacheModel() {
				return _nullSolicitudRequerimientoCacheModel;
			}
		};

	private static CacheModel<SolicitudRequerimiento> _nullSolicitudRequerimientoCacheModel =
		new CacheModel<SolicitudRequerimiento>() {
			@Override
			public SolicitudRequerimiento toEntityModel() {
				return _nullSolicitudRequerimiento;
			}
		};
}
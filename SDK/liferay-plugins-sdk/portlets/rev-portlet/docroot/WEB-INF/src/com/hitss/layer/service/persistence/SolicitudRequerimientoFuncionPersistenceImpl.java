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

import com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException;
import com.hitss.layer.model.SolicitudRequerimientoFuncion;
import com.hitss.layer.model.impl.SolicitudRequerimientoFuncionImpl;
import com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl;

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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the solicitud requerimiento funcion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoFuncionPersistence
 * @see SolicitudRequerimientoFuncionUtil
 * @generated
 */
public class SolicitudRequerimientoFuncionPersistenceImpl
	extends BasePersistenceImpl<SolicitudRequerimientoFuncion>
	implements SolicitudRequerimientoFuncionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SolicitudRequerimientoFuncionUtil} to access the solicitud requerimiento funcion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SolicitudRequerimientoFuncionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoFuncionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoFuncionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_F = new FinderPath(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoFuncionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_F",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_F = new FinderPath(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoFuncionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_F",
			new String[] { Long.class.getName(), Long.class.getName() },
			SolicitudRequerimientoFuncionModelImpl.SOLICITUDFUNCIONID_COLUMN_BITMASK |
			SolicitudRequerimientoFuncionModelImpl.FUNCIONID_COLUMN_BITMASK |
			SolicitudRequerimientoFuncionModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_F = new FinderPath(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByS_F",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @return the matching solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoFuncion> findByS_F(
		long solicitudFuncionId, long funcionId) throws SystemException {
		return findByS_F(solicitudFuncionId, funcionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @param start the lower bound of the range of solicitud requerimiento funcions
	 * @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	 * @return the range of matching solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoFuncion> findByS_F(
		long solicitudFuncionId, long funcionId, int start, int end)
		throws SystemException {
		return findByS_F(solicitudFuncionId, funcionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @param start the lower bound of the range of solicitud requerimiento funcions
	 * @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoFuncion> findByS_F(
		long solicitudFuncionId, long funcionId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_F;
			finderArgs = new Object[] { solicitudFuncionId, funcionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_F;
			finderArgs = new Object[] {
					solicitudFuncionId, funcionId,
					
					start, end, orderByComparator
				};
		}

		List<SolicitudRequerimientoFuncion> list = (List<SolicitudRequerimientoFuncion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SolicitudRequerimientoFuncion solicitudRequerimientoFuncion : list) {
				if ((solicitudFuncionId != solicitudRequerimientoFuncion.getSolicitudFuncionId()) ||
						(funcionId != solicitudRequerimientoFuncion.getFuncionId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOFUNCION_WHERE);

			query.append(_FINDER_COLUMN_S_F_SOLICITUDFUNCIONID_2);

			query.append(_FINDER_COLUMN_S_F_FUNCIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SolicitudRequerimientoFuncionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudFuncionId);

				qPos.add(funcionId);

				if (!pagination) {
					list = (List<SolicitudRequerimientoFuncion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudRequerimientoFuncion>(list);
				}
				else {
					list = (List<SolicitudRequerimientoFuncion>)QueryUtil.list(q,
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
	 * Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento funcion
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion findByS_F_First(
		long solicitudFuncionId, long funcionId,
		OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoFuncionException, SystemException {
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion = fetchByS_F_First(solicitudFuncionId,
				funcionId, orderByComparator);

		if (solicitudRequerimientoFuncion != null) {
			return solicitudRequerimientoFuncion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudFuncionId=");
		msg.append(solicitudFuncionId);

		msg.append(", funcionId=");
		msg.append(funcionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoFuncionException(msg.toString());
	}

	/**
	 * Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion fetchByS_F_First(
		long solicitudFuncionId, long funcionId,
		OrderByComparator orderByComparator) throws SystemException {
		List<SolicitudRequerimientoFuncion> list = findByS_F(solicitudFuncionId,
				funcionId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento funcion
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion findByS_F_Last(
		long solicitudFuncionId, long funcionId,
		OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoFuncionException, SystemException {
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion = fetchByS_F_Last(solicitudFuncionId,
				funcionId, orderByComparator);

		if (solicitudRequerimientoFuncion != null) {
			return solicitudRequerimientoFuncion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudFuncionId=");
		msg.append(solicitudFuncionId);

		msg.append(", funcionId=");
		msg.append(funcionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoFuncionException(msg.toString());
	}

	/**
	 * Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion fetchByS_F_Last(
		long solicitudFuncionId, long funcionId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByS_F(solicitudFuncionId, funcionId);

		if (count == 0) {
			return null;
		}

		List<SolicitudRequerimientoFuncion> list = findByS_F(solicitudFuncionId,
				funcionId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the solicitud requerimiento funcions before and after the current solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * @param solicitudRequerimientoFuncionPK the primary key of the current solicitud requerimiento funcion
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next solicitud requerimiento funcion
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a solicitud requerimiento funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion[] findByS_F_PrevAndNext(
		SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK,
		long solicitudFuncionId, long funcionId,
		OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoFuncionException, SystemException {
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion = findByPrimaryKey(solicitudRequerimientoFuncionPK);

		Session session = null;

		try {
			session = openSession();

			SolicitudRequerimientoFuncion[] array = new SolicitudRequerimientoFuncionImpl[3];

			array[0] = getByS_F_PrevAndNext(session,
					solicitudRequerimientoFuncion, solicitudFuncionId,
					funcionId, orderByComparator, true);

			array[1] = solicitudRequerimientoFuncion;

			array[2] = getByS_F_PrevAndNext(session,
					solicitudRequerimientoFuncion, solicitudFuncionId,
					funcionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SolicitudRequerimientoFuncion getByS_F_PrevAndNext(
		Session session,
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion,
		long solicitudFuncionId, long funcionId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOFUNCION_WHERE);

		query.append(_FINDER_COLUMN_S_F_SOLICITUDFUNCIONID_2);

		query.append(_FINDER_COLUMN_S_F_FUNCIONID_2);

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
			query.append(SolicitudRequerimientoFuncionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(solicitudFuncionId);

		qPos.add(funcionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(solicitudRequerimientoFuncion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SolicitudRequerimientoFuncion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63; from the database.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS_F(long solicitudFuncionId, long funcionId)
		throws SystemException {
		for (SolicitudRequerimientoFuncion solicitudRequerimientoFuncion : findByS_F(
				solicitudFuncionId, funcionId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(solicitudRequerimientoFuncion);
		}
	}

	/**
	 * Returns the number of solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @return the number of matching solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS_F(long solicitudFuncionId, long funcionId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_F;

		Object[] finderArgs = new Object[] { solicitudFuncionId, funcionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SOLICITUDREQUERIMIENTOFUNCION_WHERE);

			query.append(_FINDER_COLUMN_S_F_SOLICITUDFUNCIONID_2);

			query.append(_FINDER_COLUMN_S_F_FUNCIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudFuncionId);

				qPos.add(funcionId);

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

	private static final String _FINDER_COLUMN_S_F_SOLICITUDFUNCIONID_2 = "solicitudRequerimientoFuncion.id.solicitudFuncionId = ? AND ";
	private static final String _FINDER_COLUMN_S_F_FUNCIONID_2 = "solicitudRequerimientoFuncion.id.funcionId = ? AND solicitudRequerimientoFuncion.activo=true";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_F_ALL = new FinderPath(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoFuncionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_F_ALL",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_F_ALL =
		new FinderPath(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoFuncionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_F_ALL",
			new String[] { Long.class.getName(), Long.class.getName() },
			SolicitudRequerimientoFuncionModelImpl.SOLICITUDFUNCIONID_COLUMN_BITMASK |
			SolicitudRequerimientoFuncionModelImpl.FUNCIONID_COLUMN_BITMASK |
			SolicitudRequerimientoFuncionModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_F_ALL = new FinderPath(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByS_F_ALL",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @return the matching solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoFuncion> findByS_F_ALL(
		long solicitudFuncionId, long funcionId) throws SystemException {
		return findByS_F_ALL(solicitudFuncionId, funcionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @param start the lower bound of the range of solicitud requerimiento funcions
	 * @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	 * @return the range of matching solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoFuncion> findByS_F_ALL(
		long solicitudFuncionId, long funcionId, int start, int end)
		throws SystemException {
		return findByS_F_ALL(solicitudFuncionId, funcionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @param start the lower bound of the range of solicitud requerimiento funcions
	 * @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoFuncion> findByS_F_ALL(
		long solicitudFuncionId, long funcionId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_F_ALL;
			finderArgs = new Object[] { solicitudFuncionId, funcionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_F_ALL;
			finderArgs = new Object[] {
					solicitudFuncionId, funcionId,
					
					start, end, orderByComparator
				};
		}

		List<SolicitudRequerimientoFuncion> list = (List<SolicitudRequerimientoFuncion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SolicitudRequerimientoFuncion solicitudRequerimientoFuncion : list) {
				if ((solicitudFuncionId != solicitudRequerimientoFuncion.getSolicitudFuncionId()) ||
						(funcionId != solicitudRequerimientoFuncion.getFuncionId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOFUNCION_WHERE);

			query.append(_FINDER_COLUMN_S_F_ALL_SOLICITUDFUNCIONID_2);

			query.append(_FINDER_COLUMN_S_F_ALL_FUNCIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SolicitudRequerimientoFuncionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudFuncionId);

				qPos.add(funcionId);

				if (!pagination) {
					list = (List<SolicitudRequerimientoFuncion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudRequerimientoFuncion>(list);
				}
				else {
					list = (List<SolicitudRequerimientoFuncion>)QueryUtil.list(q,
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
	 * Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento funcion
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion findByS_F_ALL_First(
		long solicitudFuncionId, long funcionId,
		OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoFuncionException, SystemException {
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion = fetchByS_F_ALL_First(solicitudFuncionId,
				funcionId, orderByComparator);

		if (solicitudRequerimientoFuncion != null) {
			return solicitudRequerimientoFuncion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudFuncionId=");
		msg.append(solicitudFuncionId);

		msg.append(", funcionId=");
		msg.append(funcionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoFuncionException(msg.toString());
	}

	/**
	 * Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion fetchByS_F_ALL_First(
		long solicitudFuncionId, long funcionId,
		OrderByComparator orderByComparator) throws SystemException {
		List<SolicitudRequerimientoFuncion> list = findByS_F_ALL(solicitudFuncionId,
				funcionId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento funcion
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion findByS_F_ALL_Last(
		long solicitudFuncionId, long funcionId,
		OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoFuncionException, SystemException {
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion = fetchByS_F_ALL_Last(solicitudFuncionId,
				funcionId, orderByComparator);

		if (solicitudRequerimientoFuncion != null) {
			return solicitudRequerimientoFuncion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudFuncionId=");
		msg.append(solicitudFuncionId);

		msg.append(", funcionId=");
		msg.append(funcionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoFuncionException(msg.toString());
	}

	/**
	 * Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion fetchByS_F_ALL_Last(
		long solicitudFuncionId, long funcionId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByS_F_ALL(solicitudFuncionId, funcionId);

		if (count == 0) {
			return null;
		}

		List<SolicitudRequerimientoFuncion> list = findByS_F_ALL(solicitudFuncionId,
				funcionId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the solicitud requerimiento funcions before and after the current solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * @param solicitudRequerimientoFuncionPK the primary key of the current solicitud requerimiento funcion
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next solicitud requerimiento funcion
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a solicitud requerimiento funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion[] findByS_F_ALL_PrevAndNext(
		SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK,
		long solicitudFuncionId, long funcionId,
		OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoFuncionException, SystemException {
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion = findByPrimaryKey(solicitudRequerimientoFuncionPK);

		Session session = null;

		try {
			session = openSession();

			SolicitudRequerimientoFuncion[] array = new SolicitudRequerimientoFuncionImpl[3];

			array[0] = getByS_F_ALL_PrevAndNext(session,
					solicitudRequerimientoFuncion, solicitudFuncionId,
					funcionId, orderByComparator, true);

			array[1] = solicitudRequerimientoFuncion;

			array[2] = getByS_F_ALL_PrevAndNext(session,
					solicitudRequerimientoFuncion, solicitudFuncionId,
					funcionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SolicitudRequerimientoFuncion getByS_F_ALL_PrevAndNext(
		Session session,
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion,
		long solicitudFuncionId, long funcionId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOFUNCION_WHERE);

		query.append(_FINDER_COLUMN_S_F_ALL_SOLICITUDFUNCIONID_2);

		query.append(_FINDER_COLUMN_S_F_ALL_FUNCIONID_2);

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
			query.append(SolicitudRequerimientoFuncionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(solicitudFuncionId);

		qPos.add(funcionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(solicitudRequerimientoFuncion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SolicitudRequerimientoFuncion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63; from the database.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS_F_ALL(long solicitudFuncionId, long funcionId)
		throws SystemException {
		for (SolicitudRequerimientoFuncion solicitudRequerimientoFuncion : findByS_F_ALL(
				solicitudFuncionId, funcionId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(solicitudRequerimientoFuncion);
		}
	}

	/**
	 * Returns the number of solicitud requerimiento funcions where solicitudFuncionId = &#63; and funcionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param funcionId the funcion ID
	 * @return the number of matching solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS_F_ALL(long solicitudFuncionId, long funcionId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_F_ALL;

		Object[] finderArgs = new Object[] { solicitudFuncionId, funcionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SOLICITUDREQUERIMIENTOFUNCION_WHERE);

			query.append(_FINDER_COLUMN_S_F_ALL_SOLICITUDFUNCIONID_2);

			query.append(_FINDER_COLUMN_S_F_ALL_FUNCIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudFuncionId);

				qPos.add(funcionId);

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

	private static final String _FINDER_COLUMN_S_F_ALL_SOLICITUDFUNCIONID_2 = "solicitudRequerimientoFuncion.id.solicitudFuncionId = ? AND ";
	private static final String _FINDER_COLUMN_S_F_ALL_FUNCIONID_2 = "solicitudRequerimientoFuncion.id.funcionId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S = new FinderPath(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoFuncionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S = new FinderPath(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoFuncionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS",
			new String[] { Long.class.getName() },
			SolicitudRequerimientoFuncionModelImpl.SOLICITUDFUNCIONID_COLUMN_BITMASK |
			SolicitudRequerimientoFuncionModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S = new FinderPath(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @return the matching solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoFuncion> findByS(long solicitudFuncionId)
		throws SystemException {
		return findByS(solicitudFuncionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param start the lower bound of the range of solicitud requerimiento funcions
	 * @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	 * @return the range of matching solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoFuncion> findByS(
		long solicitudFuncionId, int start, int end) throws SystemException {
		return findByS(solicitudFuncionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param start the lower bound of the range of solicitud requerimiento funcions
	 * @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoFuncion> findByS(
		long solicitudFuncionId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S;
			finderArgs = new Object[] { solicitudFuncionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S;
			finderArgs = new Object[] {
					solicitudFuncionId,
					
					start, end, orderByComparator
				};
		}

		List<SolicitudRequerimientoFuncion> list = (List<SolicitudRequerimientoFuncion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SolicitudRequerimientoFuncion solicitudRequerimientoFuncion : list) {
				if ((solicitudFuncionId != solicitudRequerimientoFuncion.getSolicitudFuncionId())) {
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

			query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOFUNCION_WHERE);

			query.append(_FINDER_COLUMN_S_SOLICITUDFUNCIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SolicitudRequerimientoFuncionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudFuncionId);

				if (!pagination) {
					list = (List<SolicitudRequerimientoFuncion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudRequerimientoFuncion>(list);
				}
				else {
					list = (List<SolicitudRequerimientoFuncion>)QueryUtil.list(q,
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
	 * Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento funcion
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion findByS_First(
		long solicitudFuncionId, OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoFuncionException, SystemException {
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion = fetchByS_First(solicitudFuncionId,
				orderByComparator);

		if (solicitudRequerimientoFuncion != null) {
			return solicitudRequerimientoFuncion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudFuncionId=");
		msg.append(solicitudFuncionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoFuncionException(msg.toString());
	}

	/**
	 * Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion fetchByS_First(
		long solicitudFuncionId, OrderByComparator orderByComparator)
		throws SystemException {
		List<SolicitudRequerimientoFuncion> list = findByS(solicitudFuncionId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento funcion
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion findByS_Last(long solicitudFuncionId,
		OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoFuncionException, SystemException {
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion = fetchByS_Last(solicitudFuncionId,
				orderByComparator);

		if (solicitudRequerimientoFuncion != null) {
			return solicitudRequerimientoFuncion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudFuncionId=");
		msg.append(solicitudFuncionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoFuncionException(msg.toString());
	}

	/**
	 * Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion fetchByS_Last(
		long solicitudFuncionId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByS(solicitudFuncionId);

		if (count == 0) {
			return null;
		}

		List<SolicitudRequerimientoFuncion> list = findByS(solicitudFuncionId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the solicitud requerimiento funcions before and after the current solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudRequerimientoFuncionPK the primary key of the current solicitud requerimiento funcion
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next solicitud requerimiento funcion
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a solicitud requerimiento funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion[] findByS_PrevAndNext(
		SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK,
		long solicitudFuncionId, OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoFuncionException, SystemException {
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion = findByPrimaryKey(solicitudRequerimientoFuncionPK);

		Session session = null;

		try {
			session = openSession();

			SolicitudRequerimientoFuncion[] array = new SolicitudRequerimientoFuncionImpl[3];

			array[0] = getByS_PrevAndNext(session,
					solicitudRequerimientoFuncion, solicitudFuncionId,
					orderByComparator, true);

			array[1] = solicitudRequerimientoFuncion;

			array[2] = getByS_PrevAndNext(session,
					solicitudRequerimientoFuncion, solicitudFuncionId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SolicitudRequerimientoFuncion getByS_PrevAndNext(
		Session session,
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion,
		long solicitudFuncionId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOFUNCION_WHERE);

		query.append(_FINDER_COLUMN_S_SOLICITUDFUNCIONID_2);

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
			query.append(SolicitudRequerimientoFuncionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(solicitudFuncionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(solicitudRequerimientoFuncion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SolicitudRequerimientoFuncion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the solicitud requerimiento funcions where solicitudFuncionId = &#63; from the database.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS(long solicitudFuncionId) throws SystemException {
		for (SolicitudRequerimientoFuncion solicitudRequerimientoFuncion : findByS(
				solicitudFuncionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(solicitudRequerimientoFuncion);
		}
	}

	/**
	 * Returns the number of solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @return the number of matching solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS(long solicitudFuncionId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S;

		Object[] finderArgs = new Object[] { solicitudFuncionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SOLICITUDREQUERIMIENTOFUNCION_WHERE);

			query.append(_FINDER_COLUMN_S_SOLICITUDFUNCIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudFuncionId);

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

	private static final String _FINDER_COLUMN_S_SOLICITUDFUNCIONID_2 = "solicitudRequerimientoFuncion.id.solicitudFuncionId = ? AND solicitudRequerimientoFuncion.activo=true";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_ALL = new FinderPath(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoFuncionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_All",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_ALL = new FinderPath(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoFuncionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_All",
			new String[] { Long.class.getName() },
			SolicitudRequerimientoFuncionModelImpl.SOLICITUDFUNCIONID_COLUMN_BITMASK |
			SolicitudRequerimientoFuncionModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_ALL = new FinderPath(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByS_All", new String[] { Long.class.getName() });

	/**
	 * Returns all the solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @return the matching solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoFuncion> findByS_All(
		long solicitudFuncionId) throws SystemException {
		return findByS_All(solicitudFuncionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param start the lower bound of the range of solicitud requerimiento funcions
	 * @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	 * @return the range of matching solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoFuncion> findByS_All(
		long solicitudFuncionId, int start, int end) throws SystemException {
		return findByS_All(solicitudFuncionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param start the lower bound of the range of solicitud requerimiento funcions
	 * @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoFuncion> findByS_All(
		long solicitudFuncionId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_ALL;
			finderArgs = new Object[] { solicitudFuncionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_ALL;
			finderArgs = new Object[] {
					solicitudFuncionId,
					
					start, end, orderByComparator
				};
		}

		List<SolicitudRequerimientoFuncion> list = (List<SolicitudRequerimientoFuncion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SolicitudRequerimientoFuncion solicitudRequerimientoFuncion : list) {
				if ((solicitudFuncionId != solicitudRequerimientoFuncion.getSolicitudFuncionId())) {
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

			query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOFUNCION_WHERE);

			query.append(_FINDER_COLUMN_S_ALL_SOLICITUDFUNCIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SolicitudRequerimientoFuncionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudFuncionId);

				if (!pagination) {
					list = (List<SolicitudRequerimientoFuncion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudRequerimientoFuncion>(list);
				}
				else {
					list = (List<SolicitudRequerimientoFuncion>)QueryUtil.list(q,
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
	 * Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento funcion
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion findByS_All_First(
		long solicitudFuncionId, OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoFuncionException, SystemException {
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion = fetchByS_All_First(solicitudFuncionId,
				orderByComparator);

		if (solicitudRequerimientoFuncion != null) {
			return solicitudRequerimientoFuncion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudFuncionId=");
		msg.append(solicitudFuncionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoFuncionException(msg.toString());
	}

	/**
	 * Returns the first solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion fetchByS_All_First(
		long solicitudFuncionId, OrderByComparator orderByComparator)
		throws SystemException {
		List<SolicitudRequerimientoFuncion> list = findByS_All(solicitudFuncionId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento funcion
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a matching solicitud requerimiento funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion findByS_All_Last(
		long solicitudFuncionId, OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoFuncionException, SystemException {
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion = fetchByS_All_Last(solicitudFuncionId,
				orderByComparator);

		if (solicitudRequerimientoFuncion != null) {
			return solicitudRequerimientoFuncion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudFuncionId=");
		msg.append(solicitudFuncionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoFuncionException(msg.toString());
	}

	/**
	 * Returns the last solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento funcion, or <code>null</code> if a matching solicitud requerimiento funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion fetchByS_All_Last(
		long solicitudFuncionId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByS_All(solicitudFuncionId);

		if (count == 0) {
			return null;
		}

		List<SolicitudRequerimientoFuncion> list = findByS_All(solicitudFuncionId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the solicitud requerimiento funcions before and after the current solicitud requerimiento funcion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudRequerimientoFuncionPK the primary key of the current solicitud requerimiento funcion
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next solicitud requerimiento funcion
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a solicitud requerimiento funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion[] findByS_All_PrevAndNext(
		SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK,
		long solicitudFuncionId, OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoFuncionException, SystemException {
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion = findByPrimaryKey(solicitudRequerimientoFuncionPK);

		Session session = null;

		try {
			session = openSession();

			SolicitudRequerimientoFuncion[] array = new SolicitudRequerimientoFuncionImpl[3];

			array[0] = getByS_All_PrevAndNext(session,
					solicitudRequerimientoFuncion, solicitudFuncionId,
					orderByComparator, true);

			array[1] = solicitudRequerimientoFuncion;

			array[2] = getByS_All_PrevAndNext(session,
					solicitudRequerimientoFuncion, solicitudFuncionId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SolicitudRequerimientoFuncion getByS_All_PrevAndNext(
		Session session,
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion,
		long solicitudFuncionId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOFUNCION_WHERE);

		query.append(_FINDER_COLUMN_S_ALL_SOLICITUDFUNCIONID_2);

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
			query.append(SolicitudRequerimientoFuncionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(solicitudFuncionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(solicitudRequerimientoFuncion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SolicitudRequerimientoFuncion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the solicitud requerimiento funcions where solicitudFuncionId = &#63; from the database.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS_All(long solicitudFuncionId)
		throws SystemException {
		for (SolicitudRequerimientoFuncion solicitudRequerimientoFuncion : findByS_All(
				solicitudFuncionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(solicitudRequerimientoFuncion);
		}
	}

	/**
	 * Returns the number of solicitud requerimiento funcions where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @return the number of matching solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS_All(long solicitudFuncionId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_ALL;

		Object[] finderArgs = new Object[] { solicitudFuncionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SOLICITUDREQUERIMIENTOFUNCION_WHERE);

			query.append(_FINDER_COLUMN_S_ALL_SOLICITUDFUNCIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudFuncionId);

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

	private static final String _FINDER_COLUMN_S_ALL_SOLICITUDFUNCIONID_2 = "solicitudRequerimientoFuncion.id.solicitudFuncionId = ?";

	public SolicitudRequerimientoFuncionPersistenceImpl() {
		setModelClass(SolicitudRequerimientoFuncion.class);
	}

	/**
	 * Caches the solicitud requerimiento funcion in the entity cache if it is enabled.
	 *
	 * @param solicitudRequerimientoFuncion the solicitud requerimiento funcion
	 */
	@Override
	public void cacheResult(
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion) {
		EntityCacheUtil.putResult(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionImpl.class,
			solicitudRequerimientoFuncion.getPrimaryKey(),
			solicitudRequerimientoFuncion);

		solicitudRequerimientoFuncion.resetOriginalValues();
	}

	/**
	 * Caches the solicitud requerimiento funcions in the entity cache if it is enabled.
	 *
	 * @param solicitudRequerimientoFuncions the solicitud requerimiento funcions
	 */
	@Override
	public void cacheResult(
		List<SolicitudRequerimientoFuncion> solicitudRequerimientoFuncions) {
		for (SolicitudRequerimientoFuncion solicitudRequerimientoFuncion : solicitudRequerimientoFuncions) {
			if (EntityCacheUtil.getResult(
						SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
						SolicitudRequerimientoFuncionImpl.class,
						solicitudRequerimientoFuncion.getPrimaryKey()) == null) {
				cacheResult(solicitudRequerimientoFuncion);
			}
			else {
				solicitudRequerimientoFuncion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all solicitud requerimiento funcions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SolicitudRequerimientoFuncionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SolicitudRequerimientoFuncionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the solicitud requerimiento funcion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion) {
		EntityCacheUtil.removeResult(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionImpl.class,
			solicitudRequerimientoFuncion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<SolicitudRequerimientoFuncion> solicitudRequerimientoFuncions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SolicitudRequerimientoFuncion solicitudRequerimientoFuncion : solicitudRequerimientoFuncions) {
			EntityCacheUtil.removeResult(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
				SolicitudRequerimientoFuncionImpl.class,
				solicitudRequerimientoFuncion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new solicitud requerimiento funcion with the primary key. Does not add the solicitud requerimiento funcion to the database.
	 *
	 * @param solicitudRequerimientoFuncionPK the primary key for the new solicitud requerimiento funcion
	 * @return the new solicitud requerimiento funcion
	 */
	@Override
	public SolicitudRequerimientoFuncion create(
		SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK) {
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion = new SolicitudRequerimientoFuncionImpl();

		solicitudRequerimientoFuncion.setNew(true);
		solicitudRequerimientoFuncion.setPrimaryKey(solicitudRequerimientoFuncionPK);

		return solicitudRequerimientoFuncion;
	}

	/**
	 * Removes the solicitud requerimiento funcion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param solicitudRequerimientoFuncionPK the primary key of the solicitud requerimiento funcion
	 * @return the solicitud requerimiento funcion that was removed
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a solicitud requerimiento funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion remove(
		SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK)
		throws NoSuchSolicitudRequerimientoFuncionException, SystemException {
		return remove((Serializable)solicitudRequerimientoFuncionPK);
	}

	/**
	 * Removes the solicitud requerimiento funcion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the solicitud requerimiento funcion
	 * @return the solicitud requerimiento funcion that was removed
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a solicitud requerimiento funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion remove(Serializable primaryKey)
		throws NoSuchSolicitudRequerimientoFuncionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SolicitudRequerimientoFuncion solicitudRequerimientoFuncion = (SolicitudRequerimientoFuncion)session.get(SolicitudRequerimientoFuncionImpl.class,
					primaryKey);

			if (solicitudRequerimientoFuncion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSolicitudRequerimientoFuncionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(solicitudRequerimientoFuncion);
		}
		catch (NoSuchSolicitudRequerimientoFuncionException nsee) {
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
	protected SolicitudRequerimientoFuncion removeImpl(
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion)
		throws SystemException {
		solicitudRequerimientoFuncion = toUnwrappedModel(solicitudRequerimientoFuncion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(solicitudRequerimientoFuncion)) {
				solicitudRequerimientoFuncion = (SolicitudRequerimientoFuncion)session.get(SolicitudRequerimientoFuncionImpl.class,
						solicitudRequerimientoFuncion.getPrimaryKeyObj());
			}

			if (solicitudRequerimientoFuncion != null) {
				session.delete(solicitudRequerimientoFuncion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (solicitudRequerimientoFuncion != null) {
			clearCache(solicitudRequerimientoFuncion);
		}

		return solicitudRequerimientoFuncion;
	}

	@Override
	public SolicitudRequerimientoFuncion updateImpl(
		com.hitss.layer.model.SolicitudRequerimientoFuncion solicitudRequerimientoFuncion)
		throws SystemException {
		solicitudRequerimientoFuncion = toUnwrappedModel(solicitudRequerimientoFuncion);

		boolean isNew = solicitudRequerimientoFuncion.isNew();

		SolicitudRequerimientoFuncionModelImpl solicitudRequerimientoFuncionModelImpl =
			(SolicitudRequerimientoFuncionModelImpl)solicitudRequerimientoFuncion;

		Session session = null;

		try {
			session = openSession();

			if (solicitudRequerimientoFuncion.isNew()) {
				session.save(solicitudRequerimientoFuncion);

				solicitudRequerimientoFuncion.setNew(false);
			}
			else {
				session.merge(solicitudRequerimientoFuncion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!SolicitudRequerimientoFuncionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((solicitudRequerimientoFuncionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_F.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						solicitudRequerimientoFuncionModelImpl.getOriginalSolicitudFuncionId(),
						solicitudRequerimientoFuncionModelImpl.getOriginalFuncionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_F, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_F,
					args);

				args = new Object[] {
						solicitudRequerimientoFuncionModelImpl.getSolicitudFuncionId(),
						solicitudRequerimientoFuncionModelImpl.getFuncionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_F, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_F,
					args);
			}

			if ((solicitudRequerimientoFuncionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_F_ALL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						solicitudRequerimientoFuncionModelImpl.getOriginalSolicitudFuncionId(),
						solicitudRequerimientoFuncionModelImpl.getOriginalFuncionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_F_ALL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_F_ALL,
					args);

				args = new Object[] {
						solicitudRequerimientoFuncionModelImpl.getSolicitudFuncionId(),
						solicitudRequerimientoFuncionModelImpl.getFuncionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_F_ALL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_F_ALL,
					args);
			}

			if ((solicitudRequerimientoFuncionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						solicitudRequerimientoFuncionModelImpl.getOriginalSolicitudFuncionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S,
					args);

				args = new Object[] {
						solicitudRequerimientoFuncionModelImpl.getSolicitudFuncionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S,
					args);
			}

			if ((solicitudRequerimientoFuncionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_ALL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						solicitudRequerimientoFuncionModelImpl.getOriginalSolicitudFuncionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_ALL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_ALL,
					args);

				args = new Object[] {
						solicitudRequerimientoFuncionModelImpl.getSolicitudFuncionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_ALL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_ALL,
					args);
			}
		}

		EntityCacheUtil.putResult(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoFuncionImpl.class,
			solicitudRequerimientoFuncion.getPrimaryKey(),
			solicitudRequerimientoFuncion);

		return solicitudRequerimientoFuncion;
	}

	protected SolicitudRequerimientoFuncion toUnwrappedModel(
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion) {
		if (solicitudRequerimientoFuncion instanceof SolicitudRequerimientoFuncionImpl) {
			return solicitudRequerimientoFuncion;
		}

		SolicitudRequerimientoFuncionImpl solicitudRequerimientoFuncionImpl = new SolicitudRequerimientoFuncionImpl();

		solicitudRequerimientoFuncionImpl.setNew(solicitudRequerimientoFuncion.isNew());
		solicitudRequerimientoFuncionImpl.setPrimaryKey(solicitudRequerimientoFuncion.getPrimaryKey());

		solicitudRequerimientoFuncionImpl.setSolicitudFuncionId(solicitudRequerimientoFuncion.getSolicitudFuncionId());
		solicitudRequerimientoFuncionImpl.setFuncionId(solicitudRequerimientoFuncion.getFuncionId());
		solicitudRequerimientoFuncionImpl.setExigible(solicitudRequerimientoFuncion.isExigible());
		solicitudRequerimientoFuncionImpl.setActivo(solicitudRequerimientoFuncion.isActivo());
		solicitudRequerimientoFuncionImpl.setUsuariocrea(solicitudRequerimientoFuncion.getUsuariocrea());
		solicitudRequerimientoFuncionImpl.setFechacrea(solicitudRequerimientoFuncion.getFechacrea());
		solicitudRequerimientoFuncionImpl.setUsuariomodifica(solicitudRequerimientoFuncion.getUsuariomodifica());
		solicitudRequerimientoFuncionImpl.setFechamodifica(solicitudRequerimientoFuncion.getFechamodifica());

		return solicitudRequerimientoFuncionImpl;
	}

	/**
	 * Returns the solicitud requerimiento funcion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the solicitud requerimiento funcion
	 * @return the solicitud requerimiento funcion
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a solicitud requerimiento funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchSolicitudRequerimientoFuncionException, SystemException {
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion = fetchByPrimaryKey(primaryKey);

		if (solicitudRequerimientoFuncion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSolicitudRequerimientoFuncionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return solicitudRequerimientoFuncion;
	}

	/**
	 * Returns the solicitud requerimiento funcion with the primary key or throws a {@link com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException} if it could not be found.
	 *
	 * @param solicitudRequerimientoFuncionPK the primary key of the solicitud requerimiento funcion
	 * @return the solicitud requerimiento funcion
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoFuncionException if a solicitud requerimiento funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion findByPrimaryKey(
		SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK)
		throws NoSuchSolicitudRequerimientoFuncionException, SystemException {
		return findByPrimaryKey((Serializable)solicitudRequerimientoFuncionPK);
	}

	/**
	 * Returns the solicitud requerimiento funcion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the solicitud requerimiento funcion
	 * @return the solicitud requerimiento funcion, or <code>null</code> if a solicitud requerimiento funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		SolicitudRequerimientoFuncion solicitudRequerimientoFuncion = (SolicitudRequerimientoFuncion)EntityCacheUtil.getResult(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
				SolicitudRequerimientoFuncionImpl.class, primaryKey);

		if (solicitudRequerimientoFuncion == _nullSolicitudRequerimientoFuncion) {
			return null;
		}

		if (solicitudRequerimientoFuncion == null) {
			Session session = null;

			try {
				session = openSession();

				solicitudRequerimientoFuncion = (SolicitudRequerimientoFuncion)session.get(SolicitudRequerimientoFuncionImpl.class,
						primaryKey);

				if (solicitudRequerimientoFuncion != null) {
					cacheResult(solicitudRequerimientoFuncion);
				}
				else {
					EntityCacheUtil.putResult(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
						SolicitudRequerimientoFuncionImpl.class, primaryKey,
						_nullSolicitudRequerimientoFuncion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SolicitudRequerimientoFuncionModelImpl.ENTITY_CACHE_ENABLED,
					SolicitudRequerimientoFuncionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return solicitudRequerimientoFuncion;
	}

	/**
	 * Returns the solicitud requerimiento funcion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param solicitudRequerimientoFuncionPK the primary key of the solicitud requerimiento funcion
	 * @return the solicitud requerimiento funcion, or <code>null</code> if a solicitud requerimiento funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoFuncion fetchByPrimaryKey(
		SolicitudRequerimientoFuncionPK solicitudRequerimientoFuncionPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)solicitudRequerimientoFuncionPK);
	}

	/**
	 * Returns all the solicitud requerimiento funcions.
	 *
	 * @return the solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoFuncion> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud requerimiento funcions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of solicitud requerimiento funcions
	 * @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	 * @return the range of solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoFuncion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud requerimiento funcions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of solicitud requerimiento funcions
	 * @param end the upper bound of the range of solicitud requerimiento funcions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of solicitud requerimiento funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoFuncion> findAll(int start, int end,
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

		List<SolicitudRequerimientoFuncion> list = (List<SolicitudRequerimientoFuncion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOFUNCION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SOLICITUDREQUERIMIENTOFUNCION;

				if (pagination) {
					sql = sql.concat(SolicitudRequerimientoFuncionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SolicitudRequerimientoFuncion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudRequerimientoFuncion>(list);
				}
				else {
					list = (List<SolicitudRequerimientoFuncion>)QueryUtil.list(q,
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
	 * Removes all the solicitud requerimiento funcions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SolicitudRequerimientoFuncion solicitudRequerimientoFuncion : findAll()) {
			remove(solicitudRequerimientoFuncion);
		}
	}

	/**
	 * Returns the number of solicitud requerimiento funcions.
	 *
	 * @return the number of solicitud requerimiento funcions
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

				Query q = session.createQuery(_SQL_COUNT_SOLICITUDREQUERIMIENTOFUNCION);

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
	 * Initializes the solicitud requerimiento funcion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.SolicitudRequerimientoFuncion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SolicitudRequerimientoFuncion>> listenersList =
					new ArrayList<ModelListener<SolicitudRequerimientoFuncion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SolicitudRequerimientoFuncion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SolicitudRequerimientoFuncionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SOLICITUDREQUERIMIENTOFUNCION = "SELECT solicitudRequerimientoFuncion FROM SolicitudRequerimientoFuncion solicitudRequerimientoFuncion";
	private static final String _SQL_SELECT_SOLICITUDREQUERIMIENTOFUNCION_WHERE = "SELECT solicitudRequerimientoFuncion FROM SolicitudRequerimientoFuncion solicitudRequerimientoFuncion WHERE ";
	private static final String _SQL_COUNT_SOLICITUDREQUERIMIENTOFUNCION = "SELECT COUNT(solicitudRequerimientoFuncion) FROM SolicitudRequerimientoFuncion solicitudRequerimientoFuncion";
	private static final String _SQL_COUNT_SOLICITUDREQUERIMIENTOFUNCION_WHERE = "SELECT COUNT(solicitudRequerimientoFuncion) FROM SolicitudRequerimientoFuncion solicitudRequerimientoFuncion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "solicitudRequerimientoFuncion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SolicitudRequerimientoFuncion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SolicitudRequerimientoFuncion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SolicitudRequerimientoFuncionPersistenceImpl.class);
	private static SolicitudRequerimientoFuncion _nullSolicitudRequerimientoFuncion =
		new SolicitudRequerimientoFuncionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SolicitudRequerimientoFuncion> toCacheModel() {
				return _nullSolicitudRequerimientoFuncionCacheModel;
			}
		};

	private static CacheModel<SolicitudRequerimientoFuncion> _nullSolicitudRequerimientoFuncionCacheModel =
		new CacheModel<SolicitudRequerimientoFuncion>() {
			@Override
			public SolicitudRequerimientoFuncion toEntityModel() {
				return _nullSolicitudRequerimientoFuncion;
			}
		};
}
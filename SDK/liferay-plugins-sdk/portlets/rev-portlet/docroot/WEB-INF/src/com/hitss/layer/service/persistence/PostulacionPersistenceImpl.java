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

import com.hitss.layer.NoSuchPostulacionException;
import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.impl.PostulacionImpl;
import com.hitss.layer.model.impl.PostulacionModelImpl;

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
import com.liferay.portal.kernel.util.ArrayUtil;
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
 * The persistence implementation for the postulacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PostulacionPersistence
 * @see PostulacionUtil
 * @generated
 */
public class PostulacionPersistenceImpl extends BasePersistenceImpl<Postulacion>
	implements PostulacionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PostulacionUtil} to access the postulacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PostulacionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionModelImpl.FINDER_CACHE_ENABLED, PostulacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionModelImpl.FINDER_CACHE_ENABLED, PostulacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S = new FinderPath(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionModelImpl.FINDER_CACHE_ENABLED, PostulacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S = new FinderPath(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionModelImpl.FINDER_CACHE_ENABLED, PostulacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS",
			new String[] { Long.class.getName() },
			PostulacionModelImpl.SOLICITUDREQUERIMIENTOID_COLUMN_BITMASK |
			PostulacionModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S = new FinderPath(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_S = new FinderPath(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByS",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the postulacions where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @return the matching postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Postulacion> findByS(long solicitudRequerimientoId)
		throws SystemException {
		return findByS(solicitudRequerimientoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the postulacions where solicitudRequerimientoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param start the lower bound of the range of postulacions
	 * @param end the upper bound of the range of postulacions (not inclusive)
	 * @return the range of matching postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Postulacion> findByS(long solicitudRequerimientoId, int start,
		int end) throws SystemException {
		return findByS(solicitudRequerimientoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the postulacions where solicitudRequerimientoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param start the lower bound of the range of postulacions
	 * @param end the upper bound of the range of postulacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Postulacion> findByS(long solicitudRequerimientoId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S;
			finderArgs = new Object[] { solicitudRequerimientoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S;
			finderArgs = new Object[] {
					solicitudRequerimientoId,
					
					start, end, orderByComparator
				};
		}

		List<Postulacion> list = (List<Postulacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Postulacion postulacion : list) {
				if ((solicitudRequerimientoId != postulacion.getSolicitudRequerimientoId())) {
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

			query.append(_SQL_SELECT_POSTULACION_WHERE);

			query.append(_FINDER_COLUMN_S_SOLICITUDREQUERIMIENTOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PostulacionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				if (!pagination) {
					list = (List<Postulacion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Postulacion>(list);
				}
				else {
					list = (List<Postulacion>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first postulacion in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching postulacion
	 * @throws com.hitss.layer.NoSuchPostulacionException if a matching postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion findByS_First(long solicitudRequerimientoId,
		OrderByComparator orderByComparator)
		throws NoSuchPostulacionException, SystemException {
		Postulacion postulacion = fetchByS_First(solicitudRequerimientoId,
				orderByComparator);

		if (postulacion != null) {
			return postulacion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPostulacionException(msg.toString());
	}

	/**
	 * Returns the first postulacion in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching postulacion, or <code>null</code> if a matching postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion fetchByS_First(long solicitudRequerimientoId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Postulacion> list = findByS(solicitudRequerimientoId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last postulacion in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching postulacion
	 * @throws com.hitss.layer.NoSuchPostulacionException if a matching postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion findByS_Last(long solicitudRequerimientoId,
		OrderByComparator orderByComparator)
		throws NoSuchPostulacionException, SystemException {
		Postulacion postulacion = fetchByS_Last(solicitudRequerimientoId,
				orderByComparator);

		if (postulacion != null) {
			return postulacion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPostulacionException(msg.toString());
	}

	/**
	 * Returns the last postulacion in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching postulacion, or <code>null</code> if a matching postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion fetchByS_Last(long solicitudRequerimientoId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByS(solicitudRequerimientoId);

		if (count == 0) {
			return null;
		}

		List<Postulacion> list = findByS(solicitudRequerimientoId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the postulacions before and after the current postulacion in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param postulacionPK the primary key of the current postulacion
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next postulacion
	 * @throws com.hitss.layer.NoSuchPostulacionException if a postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion[] findByS_PrevAndNext(PostulacionPK postulacionPK,
		long solicitudRequerimientoId, OrderByComparator orderByComparator)
		throws NoSuchPostulacionException, SystemException {
		Postulacion postulacion = findByPrimaryKey(postulacionPK);

		Session session = null;

		try {
			session = openSession();

			Postulacion[] array = new PostulacionImpl[3];

			array[0] = getByS_PrevAndNext(session, postulacion,
					solicitudRequerimientoId, orderByComparator, true);

			array[1] = postulacion;

			array[2] = getByS_PrevAndNext(session, postulacion,
					solicitudRequerimientoId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Postulacion getByS_PrevAndNext(Session session,
		Postulacion postulacion, long solicitudRequerimientoId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_POSTULACION_WHERE);

		query.append(_FINDER_COLUMN_S_SOLICITUDREQUERIMIENTOID_2);

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
			query.append(PostulacionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(solicitudRequerimientoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(postulacion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Postulacion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the postulacions where solicitudRequerimientoId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoIds the solicitud requerimiento IDs
	 * @return the matching postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Postulacion> findByS(long[] solicitudRequerimientoIds)
		throws SystemException {
		return findByS(solicitudRequerimientoIds, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the postulacions where solicitudRequerimientoId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoIds the solicitud requerimiento IDs
	 * @param start the lower bound of the range of postulacions
	 * @param end the upper bound of the range of postulacions (not inclusive)
	 * @return the range of matching postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Postulacion> findByS(long[] solicitudRequerimientoIds,
		int start, int end) throws SystemException {
		return findByS(solicitudRequerimientoIds, start, end, null);
	}

	/**
	 * Returns an ordered range of all the postulacions where solicitudRequerimientoId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoIds the solicitud requerimiento IDs
	 * @param start the lower bound of the range of postulacions
	 * @param end the upper bound of the range of postulacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Postulacion> findByS(long[] solicitudRequerimientoIds,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if ((solicitudRequerimientoIds != null) &&
				(solicitudRequerimientoIds.length == 1)) {
			return findByS(solicitudRequerimientoIds[0], start, end,
				orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] {
					StringUtil.merge(solicitudRequerimientoIds)
				};
		}
		else {
			finderArgs = new Object[] {
					StringUtil.merge(solicitudRequerimientoIds),
					
					start, end, orderByComparator
				};
		}

		List<Postulacion> list = (List<Postulacion>)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_S,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Postulacion postulacion : list) {
				if (!ArrayUtil.contains(solicitudRequerimientoIds,
							postulacion.getSolicitudRequerimientoId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_POSTULACION_WHERE);

			boolean conjunctionable = false;

			if ((solicitudRequerimientoIds == null) ||
					(solicitudRequerimientoIds.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < solicitudRequerimientoIds.length; i++) {
					query.append(_FINDER_COLUMN_S_SOLICITUDREQUERIMIENTOID_5);

					if ((i + 1) < solicitudRequerimientoIds.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append("postulacion.activo=true");

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PostulacionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (solicitudRequerimientoIds != null) {
					qPos.add(solicitudRequerimientoIds);
				}

				if (!pagination) {
					list = (List<Postulacion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Postulacion>(list);
				}
				else {
					list = (List<Postulacion>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_S,
					finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_S,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the postulacions where solicitudRequerimientoId = &#63; from the database.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS(long solicitudRequerimientoId)
		throws SystemException {
		for (Postulacion postulacion : findByS(solicitudRequerimientoId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(postulacion);
		}
	}

	/**
	 * Returns the number of postulacions where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @return the number of matching postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS(long solicitudRequerimientoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S;

		Object[] finderArgs = new Object[] { solicitudRequerimientoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_POSTULACION_WHERE);

			query.append(_FINDER_COLUMN_S_SOLICITUDREQUERIMIENTOID_2);

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

	/**
	 * Returns the number of postulacions where solicitudRequerimientoId = any &#63;.
	 *
	 * @param solicitudRequerimientoIds the solicitud requerimiento IDs
	 * @return the number of matching postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS(long[] solicitudRequerimientoIds)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				StringUtil.merge(solicitudRequerimientoIds)
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_POSTULACION_WHERE);

			boolean conjunctionable = false;

			if ((solicitudRequerimientoIds == null) ||
					(solicitudRequerimientoIds.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < solicitudRequerimientoIds.length; i++) {
					query.append(_FINDER_COLUMN_S_SOLICITUDREQUERIMIENTOID_5);

					if ((i + 1) < solicitudRequerimientoIds.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append("postulacion.activo=true");

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (solicitudRequerimientoIds != null) {
					qPos.add(solicitudRequerimientoIds);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_S,
					finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_S,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_S_SOLICITUDREQUERIMIENTOID_2 = "postulacion.id.solicitudRequerimientoId = ? AND postulacion.activo=true";
	private static final String _FINDER_COLUMN_S_SOLICITUDREQUERIMIENTOID_5 = "(" +
		removeConjunction(_FINDER_COLUMN_S_SOLICITUDREQUERIMIENTOID_2) + ")";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_U = new FinderPath(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionModelImpl.FINDER_CACHE_ENABLED, PostulacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_U",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_U = new FinderPath(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionModelImpl.FINDER_CACHE_ENABLED, PostulacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_U",
			new String[] { Long.class.getName(), Long.class.getName() },
			PostulacionModelImpl.SOLICITUDREQUERIMIENTOID_COLUMN_BITMASK |
			PostulacionModelImpl.USUARIOID_COLUMN_BITMASK |
			PostulacionModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_U = new FinderPath(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_U",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the postulacions where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param usuarioId the usuario ID
	 * @return the matching postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Postulacion> findByS_U(long solicitudRequerimientoId,
		long usuarioId) throws SystemException {
		return findByS_U(solicitudRequerimientoId, usuarioId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the postulacions where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param usuarioId the usuario ID
	 * @param start the lower bound of the range of postulacions
	 * @param end the upper bound of the range of postulacions (not inclusive)
	 * @return the range of matching postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Postulacion> findByS_U(long solicitudRequerimientoId,
		long usuarioId, int start, int end) throws SystemException {
		return findByS_U(solicitudRequerimientoId, usuarioId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the postulacions where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param usuarioId the usuario ID
	 * @param start the lower bound of the range of postulacions
	 * @param end the upper bound of the range of postulacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Postulacion> findByS_U(long solicitudRequerimientoId,
		long usuarioId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_U;
			finderArgs = new Object[] { solicitudRequerimientoId, usuarioId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_U;
			finderArgs = new Object[] {
					solicitudRequerimientoId, usuarioId,
					
					start, end, orderByComparator
				};
		}

		List<Postulacion> list = (List<Postulacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Postulacion postulacion : list) {
				if ((solicitudRequerimientoId != postulacion.getSolicitudRequerimientoId()) ||
						(usuarioId != postulacion.getUsuarioId())) {
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

			query.append(_SQL_SELECT_POSTULACION_WHERE);

			query.append(_FINDER_COLUMN_S_U_SOLICITUDREQUERIMIENTOID_2);

			query.append(_FINDER_COLUMN_S_U_USUARIOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PostulacionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				qPos.add(usuarioId);

				if (!pagination) {
					list = (List<Postulacion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Postulacion>(list);
				}
				else {
					list = (List<Postulacion>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first postulacion in the ordered set where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching postulacion
	 * @throws com.hitss.layer.NoSuchPostulacionException if a matching postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion findByS_U_First(long solicitudRequerimientoId,
		long usuarioId, OrderByComparator orderByComparator)
		throws NoSuchPostulacionException, SystemException {
		Postulacion postulacion = fetchByS_U_First(solicitudRequerimientoId,
				usuarioId, orderByComparator);

		if (postulacion != null) {
			return postulacion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(", usuarioId=");
		msg.append(usuarioId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPostulacionException(msg.toString());
	}

	/**
	 * Returns the first postulacion in the ordered set where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching postulacion, or <code>null</code> if a matching postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion fetchByS_U_First(long solicitudRequerimientoId,
		long usuarioId, OrderByComparator orderByComparator)
		throws SystemException {
		List<Postulacion> list = findByS_U(solicitudRequerimientoId, usuarioId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last postulacion in the ordered set where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching postulacion
	 * @throws com.hitss.layer.NoSuchPostulacionException if a matching postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion findByS_U_Last(long solicitudRequerimientoId,
		long usuarioId, OrderByComparator orderByComparator)
		throws NoSuchPostulacionException, SystemException {
		Postulacion postulacion = fetchByS_U_Last(solicitudRequerimientoId,
				usuarioId, orderByComparator);

		if (postulacion != null) {
			return postulacion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(", usuarioId=");
		msg.append(usuarioId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPostulacionException(msg.toString());
	}

	/**
	 * Returns the last postulacion in the ordered set where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching postulacion, or <code>null</code> if a matching postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion fetchByS_U_Last(long solicitudRequerimientoId,
		long usuarioId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByS_U(solicitudRequerimientoId, usuarioId);

		if (count == 0) {
			return null;
		}

		List<Postulacion> list = findByS_U(solicitudRequerimientoId, usuarioId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the postulacions before and after the current postulacion in the ordered set where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	 *
	 * @param postulacionPK the primary key of the current postulacion
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next postulacion
	 * @throws com.hitss.layer.NoSuchPostulacionException if a postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion[] findByS_U_PrevAndNext(PostulacionPK postulacionPK,
		long solicitudRequerimientoId, long usuarioId,
		OrderByComparator orderByComparator)
		throws NoSuchPostulacionException, SystemException {
		Postulacion postulacion = findByPrimaryKey(postulacionPK);

		Session session = null;

		try {
			session = openSession();

			Postulacion[] array = new PostulacionImpl[3];

			array[0] = getByS_U_PrevAndNext(session, postulacion,
					solicitudRequerimientoId, usuarioId, orderByComparator, true);

			array[1] = postulacion;

			array[2] = getByS_U_PrevAndNext(session, postulacion,
					solicitudRequerimientoId, usuarioId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Postulacion getByS_U_PrevAndNext(Session session,
		Postulacion postulacion, long solicitudRequerimientoId, long usuarioId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_POSTULACION_WHERE);

		query.append(_FINDER_COLUMN_S_U_SOLICITUDREQUERIMIENTOID_2);

		query.append(_FINDER_COLUMN_S_U_USUARIOID_2);

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
			query.append(PostulacionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(solicitudRequerimientoId);

		qPos.add(usuarioId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(postulacion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Postulacion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the postulacions where solicitudRequerimientoId = &#63; and usuarioId = &#63; from the database.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param usuarioId the usuario ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS_U(long solicitudRequerimientoId, long usuarioId)
		throws SystemException {
		for (Postulacion postulacion : findByS_U(solicitudRequerimientoId,
				usuarioId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(postulacion);
		}
	}

	/**
	 * Returns the number of postulacions where solicitudRequerimientoId = &#63; and usuarioId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param usuarioId the usuario ID
	 * @return the number of matching postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS_U(long solicitudRequerimientoId, long usuarioId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_U;

		Object[] finderArgs = new Object[] { solicitudRequerimientoId, usuarioId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_POSTULACION_WHERE);

			query.append(_FINDER_COLUMN_S_U_SOLICITUDREQUERIMIENTOID_2);

			query.append(_FINDER_COLUMN_S_U_USUARIOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				qPos.add(usuarioId);

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

	private static final String _FINDER_COLUMN_S_U_SOLICITUDREQUERIMIENTOID_2 = "postulacion.id.solicitudRequerimientoId = ? AND ";
	private static final String _FINDER_COLUMN_S_U_USUARIOID_2 = "postulacion.id.usuarioId = ? AND postulacion.activo=true";

	public PostulacionPersistenceImpl() {
		setModelClass(Postulacion.class);
	}

	/**
	 * Caches the postulacion in the entity cache if it is enabled.
	 *
	 * @param postulacion the postulacion
	 */
	@Override
	public void cacheResult(Postulacion postulacion) {
		EntityCacheUtil.putResult(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionImpl.class, postulacion.getPrimaryKey(), postulacion);

		postulacion.resetOriginalValues();
	}

	/**
	 * Caches the postulacions in the entity cache if it is enabled.
	 *
	 * @param postulacions the postulacions
	 */
	@Override
	public void cacheResult(List<Postulacion> postulacions) {
		for (Postulacion postulacion : postulacions) {
			if (EntityCacheUtil.getResult(
						PostulacionModelImpl.ENTITY_CACHE_ENABLED,
						PostulacionImpl.class, postulacion.getPrimaryKey()) == null) {
				cacheResult(postulacion);
			}
			else {
				postulacion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all postulacions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PostulacionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PostulacionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the postulacion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Postulacion postulacion) {
		EntityCacheUtil.removeResult(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionImpl.class, postulacion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Postulacion> postulacions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Postulacion postulacion : postulacions) {
			EntityCacheUtil.removeResult(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
				PostulacionImpl.class, postulacion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new postulacion with the primary key. Does not add the postulacion to the database.
	 *
	 * @param postulacionPK the primary key for the new postulacion
	 * @return the new postulacion
	 */
	@Override
	public Postulacion create(PostulacionPK postulacionPK) {
		Postulacion postulacion = new PostulacionImpl();

		postulacion.setNew(true);
		postulacion.setPrimaryKey(postulacionPK);

		return postulacion;
	}

	/**
	 * Removes the postulacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param postulacionPK the primary key of the postulacion
	 * @return the postulacion that was removed
	 * @throws com.hitss.layer.NoSuchPostulacionException if a postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion remove(PostulacionPK postulacionPK)
		throws NoSuchPostulacionException, SystemException {
		return remove((Serializable)postulacionPK);
	}

	/**
	 * Removes the postulacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the postulacion
	 * @return the postulacion that was removed
	 * @throws com.hitss.layer.NoSuchPostulacionException if a postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion remove(Serializable primaryKey)
		throws NoSuchPostulacionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Postulacion postulacion = (Postulacion)session.get(PostulacionImpl.class,
					primaryKey);

			if (postulacion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPostulacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(postulacion);
		}
		catch (NoSuchPostulacionException nsee) {
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
	protected Postulacion removeImpl(Postulacion postulacion)
		throws SystemException {
		postulacion = toUnwrappedModel(postulacion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(postulacion)) {
				postulacion = (Postulacion)session.get(PostulacionImpl.class,
						postulacion.getPrimaryKeyObj());
			}

			if (postulacion != null) {
				session.delete(postulacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (postulacion != null) {
			clearCache(postulacion);
		}

		return postulacion;
	}

	@Override
	public Postulacion updateImpl(com.hitss.layer.model.Postulacion postulacion)
		throws SystemException {
		postulacion = toUnwrappedModel(postulacion);

		boolean isNew = postulacion.isNew();

		PostulacionModelImpl postulacionModelImpl = (PostulacionModelImpl)postulacion;

		Session session = null;

		try {
			session = openSession();

			if (postulacion.isNew()) {
				session.save(postulacion);

				postulacion.setNew(false);
			}
			else {
				session.merge(postulacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PostulacionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((postulacionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						postulacionModelImpl.getOriginalSolicitudRequerimientoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S,
					args);

				args = new Object[] {
						postulacionModelImpl.getSolicitudRequerimientoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S,
					args);
			}

			if ((postulacionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						postulacionModelImpl.getOriginalSolicitudRequerimientoId(),
						postulacionModelImpl.getOriginalUsuarioId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_U,
					args);

				args = new Object[] {
						postulacionModelImpl.getSolicitudRequerimientoId(),
						postulacionModelImpl.getUsuarioId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_U,
					args);
			}
		}

		EntityCacheUtil.putResult(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionImpl.class, postulacion.getPrimaryKey(), postulacion);

		return postulacion;
	}

	protected Postulacion toUnwrappedModel(Postulacion postulacion) {
		if (postulacion instanceof PostulacionImpl) {
			return postulacion;
		}

		PostulacionImpl postulacionImpl = new PostulacionImpl();

		postulacionImpl.setNew(postulacion.isNew());
		postulacionImpl.setPrimaryKey(postulacion.getPrimaryKey());

		postulacionImpl.setSolicitudRequerimientoId(postulacion.getSolicitudRequerimientoId());
		postulacionImpl.setUsuarioId(postulacion.getUsuarioId());
		postulacionImpl.setFechaPostulacion(postulacion.getFechaPostulacion());
		postulacionImpl.setEstado(postulacion.getEstado());
		postulacionImpl.setSeleccionado(postulacion.isSeleccionado());
		postulacionImpl.setActivo(postulacion.isActivo());
		postulacionImpl.setUsuariocrea(postulacion.getUsuariocrea());
		postulacionImpl.setFechacrea(postulacion.getFechacrea());
		postulacionImpl.setUsuariomodifica(postulacion.getUsuariomodifica());
		postulacionImpl.setFechamodifica(postulacion.getFechamodifica());

		return postulacionImpl;
	}

	/**
	 * Returns the postulacion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the postulacion
	 * @return the postulacion
	 * @throws com.hitss.layer.NoSuchPostulacionException if a postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPostulacionException, SystemException {
		Postulacion postulacion = fetchByPrimaryKey(primaryKey);

		if (postulacion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPostulacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return postulacion;
	}

	/**
	 * Returns the postulacion with the primary key or throws a {@link com.hitss.layer.NoSuchPostulacionException} if it could not be found.
	 *
	 * @param postulacionPK the primary key of the postulacion
	 * @return the postulacion
	 * @throws com.hitss.layer.NoSuchPostulacionException if a postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion findByPrimaryKey(PostulacionPK postulacionPK)
		throws NoSuchPostulacionException, SystemException {
		return findByPrimaryKey((Serializable)postulacionPK);
	}

	/**
	 * Returns the postulacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the postulacion
	 * @return the postulacion, or <code>null</code> if a postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Postulacion postulacion = (Postulacion)EntityCacheUtil.getResult(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
				PostulacionImpl.class, primaryKey);

		if (postulacion == _nullPostulacion) {
			return null;
		}

		if (postulacion == null) {
			Session session = null;

			try {
				session = openSession();

				postulacion = (Postulacion)session.get(PostulacionImpl.class,
						primaryKey);

				if (postulacion != null) {
					cacheResult(postulacion);
				}
				else {
					EntityCacheUtil.putResult(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
						PostulacionImpl.class, primaryKey, _nullPostulacion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
					PostulacionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return postulacion;
	}

	/**
	 * Returns the postulacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param postulacionPK the primary key of the postulacion
	 * @return the postulacion, or <code>null</code> if a postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion fetchByPrimaryKey(PostulacionPK postulacionPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)postulacionPK);
	}

	/**
	 * Returns all the postulacions.
	 *
	 * @return the postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Postulacion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Postulacion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the postulacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of postulacions
	 * @param end the upper bound of the range of postulacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Postulacion> findAll(int start, int end,
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

		List<Postulacion> list = (List<Postulacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_POSTULACION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POSTULACION;

				if (pagination) {
					sql = sql.concat(PostulacionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Postulacion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Postulacion>(list);
				}
				else {
					list = (List<Postulacion>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the postulacions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Postulacion postulacion : findAll()) {
			remove(postulacion);
		}
	}

	/**
	 * Returns the number of postulacions.
	 *
	 * @return the number of postulacions
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

				Query q = session.createQuery(_SQL_COUNT_POSTULACION);

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
	 * Initializes the postulacion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.Postulacion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Postulacion>> listenersList = new ArrayList<ModelListener<Postulacion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Postulacion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PostulacionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_POSTULACION = "SELECT postulacion FROM Postulacion postulacion";
	private static final String _SQL_SELECT_POSTULACION_WHERE = "SELECT postulacion FROM Postulacion postulacion WHERE ";
	private static final String _SQL_COUNT_POSTULACION = "SELECT COUNT(postulacion) FROM Postulacion postulacion";
	private static final String _SQL_COUNT_POSTULACION_WHERE = "SELECT COUNT(postulacion) FROM Postulacion postulacion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "postulacion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Postulacion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Postulacion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PostulacionPersistenceImpl.class);
	private static Postulacion _nullPostulacion = new PostulacionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Postulacion> toCacheModel() {
				return _nullPostulacionCacheModel;
			}
		};

	private static CacheModel<Postulacion> _nullPostulacionCacheModel = new CacheModel<Postulacion>() {
			@Override
			public Postulacion toEntityModel() {
				return _nullPostulacion;
			}
		};
}
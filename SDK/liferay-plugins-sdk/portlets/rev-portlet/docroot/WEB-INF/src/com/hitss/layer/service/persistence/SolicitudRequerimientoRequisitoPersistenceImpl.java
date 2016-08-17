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

import com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException;
import com.hitss.layer.model.SolicitudRequerimientoRequisito;
import com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoImpl;
import com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl;

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
 * The persistence implementation for the solicitud requerimiento requisito service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoRequisitoPersistence
 * @see SolicitudRequerimientoRequisitoUtil
 * @generated
 */
public class SolicitudRequerimientoRequisitoPersistenceImpl
	extends BasePersistenceImpl<SolicitudRequerimientoRequisito>
	implements SolicitudRequerimientoRequisitoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SolicitudRequerimientoRequisitoUtil} to access the solicitud requerimiento requisito persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SolicitudRequerimientoRequisitoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_T = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_T",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_T = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_T",
			new String[] { Long.class.getName(), Long.class.getName() },
			SolicitudRequerimientoRequisitoModelImpl.SOLICITUDREQUERIMIENTOID_COLUMN_BITMASK |
			SolicitudRequerimientoRequisitoModelImpl.TAGID_COLUMN_BITMASK |
			SolicitudRequerimientoRequisitoModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_T = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByS_T",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @return the matching solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findByS_T(
		long solicitudRequerimientoId, long tagId) throws SystemException {
		return findByS_T(solicitudRequerimientoId, tagId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @param start the lower bound of the range of solicitud requerimiento requisitos
	 * @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	 * @return the range of matching solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findByS_T(
		long solicitudRequerimientoId, long tagId, int start, int end)
		throws SystemException {
		return findByS_T(solicitudRequerimientoId, tagId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @param start the lower bound of the range of solicitud requerimiento requisitos
	 * @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findByS_T(
		long solicitudRequerimientoId, long tagId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_T;
			finderArgs = new Object[] { solicitudRequerimientoId, tagId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_T;
			finderArgs = new Object[] {
					solicitudRequerimientoId, tagId,
					
					start, end, orderByComparator
				};
		}

		List<SolicitudRequerimientoRequisito> list = (List<SolicitudRequerimientoRequisito>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SolicitudRequerimientoRequisito solicitudRequerimientoRequisito : list) {
				if ((solicitudRequerimientoId != solicitudRequerimientoRequisito.getSolicitudRequerimientoId()) ||
						(tagId != solicitudRequerimientoRequisito.getTagId())) {
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

			query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOREQUISITO_WHERE);

			query.append(_FINDER_COLUMN_S_T_SOLICITUDREQUERIMIENTOID_2);

			query.append(_FINDER_COLUMN_S_T_TAGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SolicitudRequerimientoRequisitoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				qPos.add(tagId);

				if (!pagination) {
					list = (List<SolicitudRequerimientoRequisito>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudRequerimientoRequisito>(list);
				}
				else {
					list = (List<SolicitudRequerimientoRequisito>)QueryUtil.list(q,
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
	 * Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento requisito
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito findByS_T_First(
		long solicitudRequerimientoId, long tagId,
		OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = fetchByS_T_First(solicitudRequerimientoId,
				tagId, orderByComparator);

		if (solicitudRequerimientoRequisito != null) {
			return solicitudRequerimientoRequisito;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(", tagId=");
		msg.append(tagId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoRequisitoException(msg.toString());
	}

	/**
	 * Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito fetchByS_T_First(
		long solicitudRequerimientoId, long tagId,
		OrderByComparator orderByComparator) throws SystemException {
		List<SolicitudRequerimientoRequisito> list = findByS_T(solicitudRequerimientoId,
				tagId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento requisito
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito findByS_T_Last(
		long solicitudRequerimientoId, long tagId,
		OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = fetchByS_T_Last(solicitudRequerimientoId,
				tagId, orderByComparator);

		if (solicitudRequerimientoRequisito != null) {
			return solicitudRequerimientoRequisito;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(", tagId=");
		msg.append(tagId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoRequisitoException(msg.toString());
	}

	/**
	 * Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito fetchByS_T_Last(
		long solicitudRequerimientoId, long tagId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByS_T(solicitudRequerimientoId, tagId);

		if (count == 0) {
			return null;
		}

		List<SolicitudRequerimientoRequisito> list = findByS_T(solicitudRequerimientoId,
				tagId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the solicitud requerimiento requisitos before and after the current solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * @param solicitudRequerimientoRequisitoPK the primary key of the current solicitud requerimiento requisito
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next solicitud requerimiento requisito
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito[] findByS_T_PrevAndNext(
		SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK,
		long solicitudRequerimientoId, long tagId,
		OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = findByPrimaryKey(solicitudRequerimientoRequisitoPK);

		Session session = null;

		try {
			session = openSession();

			SolicitudRequerimientoRequisito[] array = new SolicitudRequerimientoRequisitoImpl[3];

			array[0] = getByS_T_PrevAndNext(session,
					solicitudRequerimientoRequisito, solicitudRequerimientoId,
					tagId, orderByComparator, true);

			array[1] = solicitudRequerimientoRequisito;

			array[2] = getByS_T_PrevAndNext(session,
					solicitudRequerimientoRequisito, solicitudRequerimientoId,
					tagId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SolicitudRequerimientoRequisito getByS_T_PrevAndNext(
		Session session,
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito,
		long solicitudRequerimientoId, long tagId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOREQUISITO_WHERE);

		query.append(_FINDER_COLUMN_S_T_SOLICITUDREQUERIMIENTOID_2);

		query.append(_FINDER_COLUMN_S_T_TAGID_2);

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
			query.append(SolicitudRequerimientoRequisitoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(solicitudRequerimientoId);

		qPos.add(tagId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(solicitudRequerimientoRequisito);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SolicitudRequerimientoRequisito> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63; from the database.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS_T(long solicitudRequerimientoId, long tagId)
		throws SystemException {
		for (SolicitudRequerimientoRequisito solicitudRequerimientoRequisito : findByS_T(
				solicitudRequerimientoId, tagId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(solicitudRequerimientoRequisito);
		}
	}

	/**
	 * Returns the number of solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @return the number of matching solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS_T(long solicitudRequerimientoId, long tagId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_T;

		Object[] finderArgs = new Object[] { solicitudRequerimientoId, tagId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SOLICITUDREQUERIMIENTOREQUISITO_WHERE);

			query.append(_FINDER_COLUMN_S_T_SOLICITUDREQUERIMIENTOID_2);

			query.append(_FINDER_COLUMN_S_T_TAGID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				qPos.add(tagId);

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

	private static final String _FINDER_COLUMN_S_T_SOLICITUDREQUERIMIENTOID_2 = "solicitudRequerimientoRequisito.id.solicitudRequerimientoId = ? AND ";
	private static final String _FINDER_COLUMN_S_T_TAGID_2 = "solicitudRequerimientoRequisito.id.tagId = ? AND solicitudRequerimientoRequisito.activo=true";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_T_ALL = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_T_ALL",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_T_ALL =
		new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_T_ALL",
			new String[] { Long.class.getName(), Long.class.getName() },
			SolicitudRequerimientoRequisitoModelImpl.SOLICITUDREQUERIMIENTOID_COLUMN_BITMASK |
			SolicitudRequerimientoRequisitoModelImpl.TAGID_COLUMN_BITMASK |
			SolicitudRequerimientoRequisitoModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_T_ALL = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByS_T_ALL",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @return the matching solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findByS_T_ALL(
		long solicitudRequerimientoId, long tagId) throws SystemException {
		return findByS_T_ALL(solicitudRequerimientoId, tagId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @param start the lower bound of the range of solicitud requerimiento requisitos
	 * @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	 * @return the range of matching solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findByS_T_ALL(
		long solicitudRequerimientoId, long tagId, int start, int end)
		throws SystemException {
		return findByS_T_ALL(solicitudRequerimientoId, tagId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @param start the lower bound of the range of solicitud requerimiento requisitos
	 * @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findByS_T_ALL(
		long solicitudRequerimientoId, long tagId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_T_ALL;
			finderArgs = new Object[] { solicitudRequerimientoId, tagId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_T_ALL;
			finderArgs = new Object[] {
					solicitudRequerimientoId, tagId,
					
					start, end, orderByComparator
				};
		}

		List<SolicitudRequerimientoRequisito> list = (List<SolicitudRequerimientoRequisito>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SolicitudRequerimientoRequisito solicitudRequerimientoRequisito : list) {
				if ((solicitudRequerimientoId != solicitudRequerimientoRequisito.getSolicitudRequerimientoId()) ||
						(tagId != solicitudRequerimientoRequisito.getTagId())) {
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

			query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOREQUISITO_WHERE);

			query.append(_FINDER_COLUMN_S_T_ALL_SOLICITUDREQUERIMIENTOID_2);

			query.append(_FINDER_COLUMN_S_T_ALL_TAGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SolicitudRequerimientoRequisitoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				qPos.add(tagId);

				if (!pagination) {
					list = (List<SolicitudRequerimientoRequisito>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudRequerimientoRequisito>(list);
				}
				else {
					list = (List<SolicitudRequerimientoRequisito>)QueryUtil.list(q,
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
	 * Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento requisito
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito findByS_T_ALL_First(
		long solicitudRequerimientoId, long tagId,
		OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = fetchByS_T_ALL_First(solicitudRequerimientoId,
				tagId, orderByComparator);

		if (solicitudRequerimientoRequisito != null) {
			return solicitudRequerimientoRequisito;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(", tagId=");
		msg.append(tagId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoRequisitoException(msg.toString());
	}

	/**
	 * Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito fetchByS_T_ALL_First(
		long solicitudRequerimientoId, long tagId,
		OrderByComparator orderByComparator) throws SystemException {
		List<SolicitudRequerimientoRequisito> list = findByS_T_ALL(solicitudRequerimientoId,
				tagId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento requisito
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito findByS_T_ALL_Last(
		long solicitudRequerimientoId, long tagId,
		OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = fetchByS_T_ALL_Last(solicitudRequerimientoId,
				tagId, orderByComparator);

		if (solicitudRequerimientoRequisito != null) {
			return solicitudRequerimientoRequisito;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(", tagId=");
		msg.append(tagId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoRequisitoException(msg.toString());
	}

	/**
	 * Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito fetchByS_T_ALL_Last(
		long solicitudRequerimientoId, long tagId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByS_T_ALL(solicitudRequerimientoId, tagId);

		if (count == 0) {
			return null;
		}

		List<SolicitudRequerimientoRequisito> list = findByS_T_ALL(solicitudRequerimientoId,
				tagId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the solicitud requerimiento requisitos before and after the current solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * @param solicitudRequerimientoRequisitoPK the primary key of the current solicitud requerimiento requisito
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next solicitud requerimiento requisito
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito[] findByS_T_ALL_PrevAndNext(
		SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK,
		long solicitudRequerimientoId, long tagId,
		OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = findByPrimaryKey(solicitudRequerimientoRequisitoPK);

		Session session = null;

		try {
			session = openSession();

			SolicitudRequerimientoRequisito[] array = new SolicitudRequerimientoRequisitoImpl[3];

			array[0] = getByS_T_ALL_PrevAndNext(session,
					solicitudRequerimientoRequisito, solicitudRequerimientoId,
					tagId, orderByComparator, true);

			array[1] = solicitudRequerimientoRequisito;

			array[2] = getByS_T_ALL_PrevAndNext(session,
					solicitudRequerimientoRequisito, solicitudRequerimientoId,
					tagId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SolicitudRequerimientoRequisito getByS_T_ALL_PrevAndNext(
		Session session,
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito,
		long solicitudRequerimientoId, long tagId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOREQUISITO_WHERE);

		query.append(_FINDER_COLUMN_S_T_ALL_SOLICITUDREQUERIMIENTOID_2);

		query.append(_FINDER_COLUMN_S_T_ALL_TAGID_2);

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
			query.append(SolicitudRequerimientoRequisitoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(solicitudRequerimientoId);

		qPos.add(tagId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(solicitudRequerimientoRequisito);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SolicitudRequerimientoRequisito> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63; from the database.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS_T_ALL(long solicitudRequerimientoId, long tagId)
		throws SystemException {
		for (SolicitudRequerimientoRequisito solicitudRequerimientoRequisito : findByS_T_ALL(
				solicitudRequerimientoId, tagId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(solicitudRequerimientoRequisito);
		}
	}

	/**
	 * Returns the number of solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; and tagId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param tagId the tag ID
	 * @return the number of matching solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS_T_ALL(long solicitudRequerimientoId, long tagId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_T_ALL;

		Object[] finderArgs = new Object[] { solicitudRequerimientoId, tagId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SOLICITUDREQUERIMIENTOREQUISITO_WHERE);

			query.append(_FINDER_COLUMN_S_T_ALL_SOLICITUDREQUERIMIENTOID_2);

			query.append(_FINDER_COLUMN_S_T_ALL_TAGID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				qPos.add(tagId);

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

	private static final String _FINDER_COLUMN_S_T_ALL_SOLICITUDREQUERIMIENTOID_2 =
		"solicitudRequerimientoRequisito.id.solicitudRequerimientoId = ? AND ";
	private static final String _FINDER_COLUMN_S_T_ALL_TAGID_2 = "solicitudRequerimientoRequisito.id.tagId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS",
			new String[] { Long.class.getName() },
			SolicitudRequerimientoRequisitoModelImpl.SOLICITUDREQUERIMIENTOID_COLUMN_BITMASK |
			SolicitudRequerimientoRequisitoModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @return the matching solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findByS(
		long solicitudRequerimientoId) throws SystemException {
		return findByS(solicitudRequerimientoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param start the lower bound of the range of solicitud requerimiento requisitos
	 * @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	 * @return the range of matching solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findByS(
		long solicitudRequerimientoId, int start, int end)
		throws SystemException {
		return findByS(solicitudRequerimientoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param start the lower bound of the range of solicitud requerimiento requisitos
	 * @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findByS(
		long solicitudRequerimientoId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
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

		List<SolicitudRequerimientoRequisito> list = (List<SolicitudRequerimientoRequisito>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SolicitudRequerimientoRequisito solicitudRequerimientoRequisito : list) {
				if ((solicitudRequerimientoId != solicitudRequerimientoRequisito.getSolicitudRequerimientoId())) {
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

			query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOREQUISITO_WHERE);

			query.append(_FINDER_COLUMN_S_SOLICITUDREQUERIMIENTOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SolicitudRequerimientoRequisitoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				if (!pagination) {
					list = (List<SolicitudRequerimientoRequisito>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudRequerimientoRequisito>(list);
				}
				else {
					list = (List<SolicitudRequerimientoRequisito>)QueryUtil.list(q,
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
	 * Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento requisito
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito findByS_First(
		long solicitudRequerimientoId, OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = fetchByS_First(solicitudRequerimientoId,
				orderByComparator);

		if (solicitudRequerimientoRequisito != null) {
			return solicitudRequerimientoRequisito;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoRequisitoException(msg.toString());
	}

	/**
	 * Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito fetchByS_First(
		long solicitudRequerimientoId, OrderByComparator orderByComparator)
		throws SystemException {
		List<SolicitudRequerimientoRequisito> list = findByS(solicitudRequerimientoId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento requisito
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito findByS_Last(
		long solicitudRequerimientoId, OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = fetchByS_Last(solicitudRequerimientoId,
				orderByComparator);

		if (solicitudRequerimientoRequisito != null) {
			return solicitudRequerimientoRequisito;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoRequisitoException(msg.toString());
	}

	/**
	 * Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito fetchByS_Last(
		long solicitudRequerimientoId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByS(solicitudRequerimientoId);

		if (count == 0) {
			return null;
		}

		List<SolicitudRequerimientoRequisito> list = findByS(solicitudRequerimientoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the solicitud requerimiento requisitos before and after the current solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoRequisitoPK the primary key of the current solicitud requerimiento requisito
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next solicitud requerimiento requisito
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito[] findByS_PrevAndNext(
		SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK,
		long solicitudRequerimientoId, OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = findByPrimaryKey(solicitudRequerimientoRequisitoPK);

		Session session = null;

		try {
			session = openSession();

			SolicitudRequerimientoRequisito[] array = new SolicitudRequerimientoRequisitoImpl[3];

			array[0] = getByS_PrevAndNext(session,
					solicitudRequerimientoRequisito, solicitudRequerimientoId,
					orderByComparator, true);

			array[1] = solicitudRequerimientoRequisito;

			array[2] = getByS_PrevAndNext(session,
					solicitudRequerimientoRequisito, solicitudRequerimientoId,
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

	protected SolicitudRequerimientoRequisito getByS_PrevAndNext(
		Session session,
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito,
		long solicitudRequerimientoId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOREQUISITO_WHERE);

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
			query.append(SolicitudRequerimientoRequisitoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(solicitudRequerimientoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(solicitudRequerimientoRequisito);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SolicitudRequerimientoRequisito> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; from the database.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS(long solicitudRequerimientoId)
		throws SystemException {
		for (SolicitudRequerimientoRequisito solicitudRequerimientoRequisito : findByS(
				solicitudRequerimientoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(solicitudRequerimientoRequisito);
		}
	}

	/**
	 * Returns the number of solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @return the number of matching solicitud requerimiento requisitos
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

			query.append(_SQL_COUNT_SOLICITUDREQUERIMIENTOREQUISITO_WHERE);

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

	private static final String _FINDER_COLUMN_S_SOLICITUDREQUERIMIENTOID_2 = "solicitudRequerimientoRequisito.id.solicitudRequerimientoId = ? AND solicitudRequerimientoRequisito.activo=true";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_ALL = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_All",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_ALL = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_All",
			new String[] { Long.class.getName() },
			SolicitudRequerimientoRequisitoModelImpl.SOLICITUDREQUERIMIENTOID_COLUMN_BITMASK |
			SolicitudRequerimientoRequisitoModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_ALL = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByS_All", new String[] { Long.class.getName() });

	/**
	 * Returns all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @return the matching solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findByS_All(
		long solicitudRequerimientoId) throws SystemException {
		return findByS_All(solicitudRequerimientoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param start the lower bound of the range of solicitud requerimiento requisitos
	 * @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	 * @return the range of matching solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findByS_All(
		long solicitudRequerimientoId, int start, int end)
		throws SystemException {
		return findByS_All(solicitudRequerimientoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param start the lower bound of the range of solicitud requerimiento requisitos
	 * @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findByS_All(
		long solicitudRequerimientoId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_ALL;
			finderArgs = new Object[] { solicitudRequerimientoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_ALL;
			finderArgs = new Object[] {
					solicitudRequerimientoId,
					
					start, end, orderByComparator
				};
		}

		List<SolicitudRequerimientoRequisito> list = (List<SolicitudRequerimientoRequisito>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SolicitudRequerimientoRequisito solicitudRequerimientoRequisito : list) {
				if ((solicitudRequerimientoId != solicitudRequerimientoRequisito.getSolicitudRequerimientoId())) {
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

			query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOREQUISITO_WHERE);

			query.append(_FINDER_COLUMN_S_ALL_SOLICITUDREQUERIMIENTOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SolicitudRequerimientoRequisitoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				if (!pagination) {
					list = (List<SolicitudRequerimientoRequisito>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudRequerimientoRequisito>(list);
				}
				else {
					list = (List<SolicitudRequerimientoRequisito>)QueryUtil.list(q,
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
	 * Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento requisito
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito findByS_All_First(
		long solicitudRequerimientoId, OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = fetchByS_All_First(solicitudRequerimientoId,
				orderByComparator);

		if (solicitudRequerimientoRequisito != null) {
			return solicitudRequerimientoRequisito;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoRequisitoException(msg.toString());
	}

	/**
	 * Returns the first solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito fetchByS_All_First(
		long solicitudRequerimientoId, OrderByComparator orderByComparator)
		throws SystemException {
		List<SolicitudRequerimientoRequisito> list = findByS_All(solicitudRequerimientoId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento requisito
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a matching solicitud requerimiento requisito could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito findByS_All_Last(
		long solicitudRequerimientoId, OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = fetchByS_All_Last(solicitudRequerimientoId,
				orderByComparator);

		if (solicitudRequerimientoRequisito != null) {
			return solicitudRequerimientoRequisito;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSolicitudRequerimientoRequisitoException(msg.toString());
	}

	/**
	 * Returns the last solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching solicitud requerimiento requisito, or <code>null</code> if a matching solicitud requerimiento requisito could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito fetchByS_All_Last(
		long solicitudRequerimientoId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByS_All(solicitudRequerimientoId);

		if (count == 0) {
			return null;
		}

		List<SolicitudRequerimientoRequisito> list = findByS_All(solicitudRequerimientoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the solicitud requerimiento requisitos before and after the current solicitud requerimiento requisito in the ordered set where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoRequisitoPK the primary key of the current solicitud requerimiento requisito
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next solicitud requerimiento requisito
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito[] findByS_All_PrevAndNext(
		SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK,
		long solicitudRequerimientoId, OrderByComparator orderByComparator)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = findByPrimaryKey(solicitudRequerimientoRequisitoPK);

		Session session = null;

		try {
			session = openSession();

			SolicitudRequerimientoRequisito[] array = new SolicitudRequerimientoRequisitoImpl[3];

			array[0] = getByS_All_PrevAndNext(session,
					solicitudRequerimientoRequisito, solicitudRequerimientoId,
					orderByComparator, true);

			array[1] = solicitudRequerimientoRequisito;

			array[2] = getByS_All_PrevAndNext(session,
					solicitudRequerimientoRequisito, solicitudRequerimientoId,
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

	protected SolicitudRequerimientoRequisito getByS_All_PrevAndNext(
		Session session,
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito,
		long solicitudRequerimientoId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOREQUISITO_WHERE);

		query.append(_FINDER_COLUMN_S_ALL_SOLICITUDREQUERIMIENTOID_2);

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
			query.append(SolicitudRequerimientoRequisitoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(solicitudRequerimientoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(solicitudRequerimientoRequisito);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SolicitudRequerimientoRequisito> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the solicitud requerimiento requisitos where solicitudRequerimientoId = &#63; from the database.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS_All(long solicitudRequerimientoId)
		throws SystemException {
		for (SolicitudRequerimientoRequisito solicitudRequerimientoRequisito : findByS_All(
				solicitudRequerimientoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(solicitudRequerimientoRequisito);
		}
	}

	/**
	 * Returns the number of solicitud requerimiento requisitos where solicitudRequerimientoId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @return the number of matching solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS_All(long solicitudRequerimientoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_ALL;

		Object[] finderArgs = new Object[] { solicitudRequerimientoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SOLICITUDREQUERIMIENTOREQUISITO_WHERE);

			query.append(_FINDER_COLUMN_S_ALL_SOLICITUDREQUERIMIENTOID_2);

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

	private static final String _FINDER_COLUMN_S_ALL_SOLICITUDREQUERIMIENTOID_2 = "solicitudRequerimientoRequisito.id.solicitudRequerimientoId = ?";

	public SolicitudRequerimientoRequisitoPersistenceImpl() {
		setModelClass(SolicitudRequerimientoRequisito.class);
	}

	/**
	 * Caches the solicitud requerimiento requisito in the entity cache if it is enabled.
	 *
	 * @param solicitudRequerimientoRequisito the solicitud requerimiento requisito
	 */
	@Override
	public void cacheResult(
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito) {
		EntityCacheUtil.putResult(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			solicitudRequerimientoRequisito.getPrimaryKey(),
			solicitudRequerimientoRequisito);

		solicitudRequerimientoRequisito.resetOriginalValues();
	}

	/**
	 * Caches the solicitud requerimiento requisitos in the entity cache if it is enabled.
	 *
	 * @param solicitudRequerimientoRequisitos the solicitud requerimiento requisitos
	 */
	@Override
	public void cacheResult(
		List<SolicitudRequerimientoRequisito> solicitudRequerimientoRequisitos) {
		for (SolicitudRequerimientoRequisito solicitudRequerimientoRequisito : solicitudRequerimientoRequisitos) {
			if (EntityCacheUtil.getResult(
						SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
						SolicitudRequerimientoRequisitoImpl.class,
						solicitudRequerimientoRequisito.getPrimaryKey()) == null) {
				cacheResult(solicitudRequerimientoRequisito);
			}
			else {
				solicitudRequerimientoRequisito.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all solicitud requerimiento requisitos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SolicitudRequerimientoRequisitoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SolicitudRequerimientoRequisitoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the solicitud requerimiento requisito.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito) {
		EntityCacheUtil.removeResult(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			solicitudRequerimientoRequisito.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<SolicitudRequerimientoRequisito> solicitudRequerimientoRequisitos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SolicitudRequerimientoRequisito solicitudRequerimientoRequisito : solicitudRequerimientoRequisitos) {
			EntityCacheUtil.removeResult(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
				SolicitudRequerimientoRequisitoImpl.class,
				solicitudRequerimientoRequisito.getPrimaryKey());
		}
	}

	/**
	 * Creates a new solicitud requerimiento requisito with the primary key. Does not add the solicitud requerimiento requisito to the database.
	 *
	 * @param solicitudRequerimientoRequisitoPK the primary key for the new solicitud requerimiento requisito
	 * @return the new solicitud requerimiento requisito
	 */
	@Override
	public SolicitudRequerimientoRequisito create(
		SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK) {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = new SolicitudRequerimientoRequisitoImpl();

		solicitudRequerimientoRequisito.setNew(true);
		solicitudRequerimientoRequisito.setPrimaryKey(solicitudRequerimientoRequisitoPK);

		return solicitudRequerimientoRequisito;
	}

	/**
	 * Removes the solicitud requerimiento requisito with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param solicitudRequerimientoRequisitoPK the primary key of the solicitud requerimiento requisito
	 * @return the solicitud requerimiento requisito that was removed
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito remove(
		SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		return remove((Serializable)solicitudRequerimientoRequisitoPK);
	}

	/**
	 * Removes the solicitud requerimiento requisito with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the solicitud requerimiento requisito
	 * @return the solicitud requerimiento requisito that was removed
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito remove(Serializable primaryKey)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = (SolicitudRequerimientoRequisito)session.get(SolicitudRequerimientoRequisitoImpl.class,
					primaryKey);

			if (solicitudRequerimientoRequisito == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSolicitudRequerimientoRequisitoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(solicitudRequerimientoRequisito);
		}
		catch (NoSuchSolicitudRequerimientoRequisitoException nsee) {
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
	protected SolicitudRequerimientoRequisito removeImpl(
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito)
		throws SystemException {
		solicitudRequerimientoRequisito = toUnwrappedModel(solicitudRequerimientoRequisito);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(solicitudRequerimientoRequisito)) {
				solicitudRequerimientoRequisito = (SolicitudRequerimientoRequisito)session.get(SolicitudRequerimientoRequisitoImpl.class,
						solicitudRequerimientoRequisito.getPrimaryKeyObj());
			}

			if (solicitudRequerimientoRequisito != null) {
				session.delete(solicitudRequerimientoRequisito);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (solicitudRequerimientoRequisito != null) {
			clearCache(solicitudRequerimientoRequisito);
		}

		return solicitudRequerimientoRequisito;
	}

	@Override
	public SolicitudRequerimientoRequisito updateImpl(
		com.hitss.layer.model.SolicitudRequerimientoRequisito solicitudRequerimientoRequisito)
		throws SystemException {
		solicitudRequerimientoRequisito = toUnwrappedModel(solicitudRequerimientoRequisito);

		boolean isNew = solicitudRequerimientoRequisito.isNew();

		SolicitudRequerimientoRequisitoModelImpl solicitudRequerimientoRequisitoModelImpl =
			(SolicitudRequerimientoRequisitoModelImpl)solicitudRequerimientoRequisito;

		Session session = null;

		try {
			session = openSession();

			if (solicitudRequerimientoRequisito.isNew()) {
				session.save(solicitudRequerimientoRequisito);

				solicitudRequerimientoRequisito.setNew(false);
			}
			else {
				session.merge(solicitudRequerimientoRequisito);
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
				!SolicitudRequerimientoRequisitoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((solicitudRequerimientoRequisitoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						solicitudRequerimientoRequisitoModelImpl.getOriginalSolicitudRequerimientoId(),
						solicitudRequerimientoRequisitoModelImpl.getOriginalTagId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_T,
					args);

				args = new Object[] {
						solicitudRequerimientoRequisitoModelImpl.getSolicitudRequerimientoId(),
						solicitudRequerimientoRequisitoModelImpl.getTagId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_T,
					args);
			}

			if ((solicitudRequerimientoRequisitoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_T_ALL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						solicitudRequerimientoRequisitoModelImpl.getOriginalSolicitudRequerimientoId(),
						solicitudRequerimientoRequisitoModelImpl.getOriginalTagId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_T_ALL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_T_ALL,
					args);

				args = new Object[] {
						solicitudRequerimientoRequisitoModelImpl.getSolicitudRequerimientoId(),
						solicitudRequerimientoRequisitoModelImpl.getTagId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_T_ALL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_T_ALL,
					args);
			}

			if ((solicitudRequerimientoRequisitoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						solicitudRequerimientoRequisitoModelImpl.getOriginalSolicitudRequerimientoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S,
					args);

				args = new Object[] {
						solicitudRequerimientoRequisitoModelImpl.getSolicitudRequerimientoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S,
					args);
			}

			if ((solicitudRequerimientoRequisitoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_ALL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						solicitudRequerimientoRequisitoModelImpl.getOriginalSolicitudRequerimientoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_ALL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_ALL,
					args);

				args = new Object[] {
						solicitudRequerimientoRequisitoModelImpl.getSolicitudRequerimientoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_ALL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_ALL,
					args);
			}
		}

		EntityCacheUtil.putResult(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			solicitudRequerimientoRequisito.getPrimaryKey(),
			solicitudRequerimientoRequisito);

		return solicitudRequerimientoRequisito;
	}

	protected SolicitudRequerimientoRequisito toUnwrappedModel(
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito) {
		if (solicitudRequerimientoRequisito instanceof SolicitudRequerimientoRequisitoImpl) {
			return solicitudRequerimientoRequisito;
		}

		SolicitudRequerimientoRequisitoImpl solicitudRequerimientoRequisitoImpl = new SolicitudRequerimientoRequisitoImpl();

		solicitudRequerimientoRequisitoImpl.setNew(solicitudRequerimientoRequisito.isNew());
		solicitudRequerimientoRequisitoImpl.setPrimaryKey(solicitudRequerimientoRequisito.getPrimaryKey());

		solicitudRequerimientoRequisitoImpl.setSolicitudRequerimientoId(solicitudRequerimientoRequisito.getSolicitudRequerimientoId());
		solicitudRequerimientoRequisitoImpl.setTagId(solicitudRequerimientoRequisito.getTagId());
		solicitudRequerimientoRequisitoImpl.setNivel(solicitudRequerimientoRequisito.getNivel());
		solicitudRequerimientoRequisitoImpl.setExigible(solicitudRequerimientoRequisito.isExigible());
		solicitudRequerimientoRequisitoImpl.setTipoRequisito(solicitudRequerimientoRequisito.getTipoRequisito());
		solicitudRequerimientoRequisitoImpl.setHerramienta(solicitudRequerimientoRequisito.getHerramienta());
		solicitudRequerimientoRequisitoImpl.setActivo(solicitudRequerimientoRequisito.isActivo());
		solicitudRequerimientoRequisitoImpl.setUsuariocrea(solicitudRequerimientoRequisito.getUsuariocrea());
		solicitudRequerimientoRequisitoImpl.setFechacrea(solicitudRequerimientoRequisito.getFechacrea());
		solicitudRequerimientoRequisitoImpl.setUsuariomodifica(solicitudRequerimientoRequisito.getUsuariomodifica());
		solicitudRequerimientoRequisitoImpl.setFechamodifica(solicitudRequerimientoRequisito.getFechamodifica());

		return solicitudRequerimientoRequisitoImpl;
	}

	/**
	 * Returns the solicitud requerimiento requisito with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the solicitud requerimiento requisito
	 * @return the solicitud requerimiento requisito
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = fetchByPrimaryKey(primaryKey);

		if (solicitudRequerimientoRequisito == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSolicitudRequerimientoRequisitoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return solicitudRequerimientoRequisito;
	}

	/**
	 * Returns the solicitud requerimiento requisito with the primary key or throws a {@link com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException} if it could not be found.
	 *
	 * @param solicitudRequerimientoRequisitoPK the primary key of the solicitud requerimiento requisito
	 * @return the solicitud requerimiento requisito
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito findByPrimaryKey(
		SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		return findByPrimaryKey((Serializable)solicitudRequerimientoRequisitoPK);
	}

	/**
	 * Returns the solicitud requerimiento requisito with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the solicitud requerimiento requisito
	 * @return the solicitud requerimiento requisito, or <code>null</code> if a solicitud requerimiento requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = (SolicitudRequerimientoRequisito)EntityCacheUtil.getResult(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
				SolicitudRequerimientoRequisitoImpl.class, primaryKey);

		if (solicitudRequerimientoRequisito == _nullSolicitudRequerimientoRequisito) {
			return null;
		}

		if (solicitudRequerimientoRequisito == null) {
			Session session = null;

			try {
				session = openSession();

				solicitudRequerimientoRequisito = (SolicitudRequerimientoRequisito)session.get(SolicitudRequerimientoRequisitoImpl.class,
						primaryKey);

				if (solicitudRequerimientoRequisito != null) {
					cacheResult(solicitudRequerimientoRequisito);
				}
				else {
					EntityCacheUtil.putResult(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
						SolicitudRequerimientoRequisitoImpl.class, primaryKey,
						_nullSolicitudRequerimientoRequisito);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
					SolicitudRequerimientoRequisitoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return solicitudRequerimientoRequisito;
	}

	/**
	 * Returns the solicitud requerimiento requisito with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param solicitudRequerimientoRequisitoPK the primary key of the solicitud requerimiento requisito
	 * @return the solicitud requerimiento requisito, or <code>null</code> if a solicitud requerimiento requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito fetchByPrimaryKey(
		SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)solicitudRequerimientoRequisitoPK);
	}

	/**
	 * Returns all the solicitud requerimiento requisitos.
	 *
	 * @return the solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud requerimiento requisitos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of solicitud requerimiento requisitos
	 * @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	 * @return the range of solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud requerimiento requisitos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of solicitud requerimiento requisitos
	 * @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findAll(int start, int end,
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

		List<SolicitudRequerimientoRequisito> list = (List<SolicitudRequerimientoRequisito>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOREQUISITO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SOLICITUDREQUERIMIENTOREQUISITO;

				if (pagination) {
					sql = sql.concat(SolicitudRequerimientoRequisitoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SolicitudRequerimientoRequisito>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudRequerimientoRequisito>(list);
				}
				else {
					list = (List<SolicitudRequerimientoRequisito>)QueryUtil.list(q,
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
	 * Removes all the solicitud requerimiento requisitos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SolicitudRequerimientoRequisito solicitudRequerimientoRequisito : findAll()) {
			remove(solicitudRequerimientoRequisito);
		}
	}

	/**
	 * Returns the number of solicitud requerimiento requisitos.
	 *
	 * @return the number of solicitud requerimiento requisitos
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

				Query q = session.createQuery(_SQL_COUNT_SOLICITUDREQUERIMIENTOREQUISITO);

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
	 * Initializes the solicitud requerimiento requisito persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.SolicitudRequerimientoRequisito")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SolicitudRequerimientoRequisito>> listenersList =
					new ArrayList<ModelListener<SolicitudRequerimientoRequisito>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SolicitudRequerimientoRequisito>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SolicitudRequerimientoRequisitoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SOLICITUDREQUERIMIENTOREQUISITO = "SELECT solicitudRequerimientoRequisito FROM SolicitudRequerimientoRequisito solicitudRequerimientoRequisito";
	private static final String _SQL_SELECT_SOLICITUDREQUERIMIENTOREQUISITO_WHERE =
		"SELECT solicitudRequerimientoRequisito FROM SolicitudRequerimientoRequisito solicitudRequerimientoRequisito WHERE ";
	private static final String _SQL_COUNT_SOLICITUDREQUERIMIENTOREQUISITO = "SELECT COUNT(solicitudRequerimientoRequisito) FROM SolicitudRequerimientoRequisito solicitudRequerimientoRequisito";
	private static final String _SQL_COUNT_SOLICITUDREQUERIMIENTOREQUISITO_WHERE =
		"SELECT COUNT(solicitudRequerimientoRequisito) FROM SolicitudRequerimientoRequisito solicitudRequerimientoRequisito WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "solicitudRequerimientoRequisito.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SolicitudRequerimientoRequisito exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SolicitudRequerimientoRequisito exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SolicitudRequerimientoRequisitoPersistenceImpl.class);
	private static SolicitudRequerimientoRequisito _nullSolicitudRequerimientoRequisito =
		new SolicitudRequerimientoRequisitoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SolicitudRequerimientoRequisito> toCacheModel() {
				return _nullSolicitudRequerimientoRequisitoCacheModel;
			}
		};

	private static CacheModel<SolicitudRequerimientoRequisito> _nullSolicitudRequerimientoRequisitoCacheModel =
		new CacheModel<SolicitudRequerimientoRequisito>() {
			@Override
			public SolicitudRequerimientoRequisito toEntityModel() {
				return _nullSolicitudRequerimientoRequisito;
			}
		};
}
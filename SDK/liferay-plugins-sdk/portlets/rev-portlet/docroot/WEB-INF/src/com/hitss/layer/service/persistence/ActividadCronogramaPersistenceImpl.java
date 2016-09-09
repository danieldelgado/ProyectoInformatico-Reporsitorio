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

import com.hitss.layer.NoSuchActividadCronogramaException;
import com.hitss.layer.model.ActividadCronograma;
import com.hitss.layer.model.impl.ActividadCronogramaImpl;
import com.hitss.layer.model.impl.ActividadCronogramaModelImpl;

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
 * The persistence implementation for the actividad cronograma service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see ActividadCronogramaPersistence
 * @see ActividadCronogramaUtil
 * @generated
 */
public class ActividadCronogramaPersistenceImpl extends BasePersistenceImpl<ActividadCronograma>
	implements ActividadCronogramaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ActividadCronogramaUtil} to access the actividad cronograma persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ActividadCronogramaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
			ActividadCronogramaModelImpl.FINDER_CACHE_ENABLED,
			ActividadCronogramaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
			ActividadCronogramaModelImpl.FINDER_CACHE_ENABLED,
			ActividadCronogramaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
			ActividadCronogramaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_A_C_G = new FinderPath(ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
			ActividadCronogramaModelImpl.FINDER_CACHE_ENABLED,
			ActividadCronogramaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByA_C_G",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_C_G = new FinderPath(ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
			ActividadCronogramaModelImpl.FINDER_CACHE_ENABLED,
			ActividadCronogramaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByA_C_G",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			ActividadCronogramaModelImpl.ACTIVIDADCRONOGRAMAID_COLUMN_BITMASK |
			ActividadCronogramaModelImpl.CRONOGRAMAID_COLUMN_BITMASK |
			ActividadCronogramaModelImpl.GRUPOUSUARIO_COLUMN_BITMASK |
			ActividadCronogramaModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_A_C_G = new FinderPath(ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
			ActividadCronogramaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA_C_G",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the actividad cronogramas where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * @param actividadCronogramaId the actividad cronograma ID
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @return the matching actividad cronogramas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActividadCronograma> findByA_C_G(long actividadCronogramaId,
		long cronogramaId, long grupoUsuario) throws SystemException {
		return findByA_C_G(actividadCronogramaId, cronogramaId, grupoUsuario,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the actividad cronogramas where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadCronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param actividadCronogramaId the actividad cronograma ID
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @param start the lower bound of the range of actividad cronogramas
	 * @param end the upper bound of the range of actividad cronogramas (not inclusive)
	 * @return the range of matching actividad cronogramas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActividadCronograma> findByA_C_G(long actividadCronogramaId,
		long cronogramaId, long grupoUsuario, int start, int end)
		throws SystemException {
		return findByA_C_G(actividadCronogramaId, cronogramaId, grupoUsuario,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the actividad cronogramas where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadCronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param actividadCronogramaId the actividad cronograma ID
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @param start the lower bound of the range of actividad cronogramas
	 * @param end the upper bound of the range of actividad cronogramas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching actividad cronogramas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActividadCronograma> findByA_C_G(long actividadCronogramaId,
		long cronogramaId, long grupoUsuario, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_C_G;
			finderArgs = new Object[] {
					actividadCronogramaId, cronogramaId, grupoUsuario
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_A_C_G;
			finderArgs = new Object[] {
					actividadCronogramaId, cronogramaId, grupoUsuario,
					
					start, end, orderByComparator
				};
		}

		List<ActividadCronograma> list = (List<ActividadCronograma>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ActividadCronograma actividadCronograma : list) {
				if ((actividadCronogramaId != actividadCronograma.getActividadCronogramaId()) ||
						(cronogramaId != actividadCronograma.getCronogramaId()) ||
						(grupoUsuario != actividadCronograma.getGrupoUsuario())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_ACTIVIDADCRONOGRAMA_WHERE);

			query.append(_FINDER_COLUMN_A_C_G_ACTIVIDADCRONOGRAMAID_2);

			query.append(_FINDER_COLUMN_A_C_G_CRONOGRAMAID_2);

			query.append(_FINDER_COLUMN_A_C_G_GRUPOUSUARIO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ActividadCronogramaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(actividadCronogramaId);

				qPos.add(cronogramaId);

				qPos.add(grupoUsuario);

				if (!pagination) {
					list = (List<ActividadCronograma>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActividadCronograma>(list);
				}
				else {
					list = (List<ActividadCronograma>)QueryUtil.list(q,
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
	 * Returns the first actividad cronograma in the ordered set where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * @param actividadCronogramaId the actividad cronograma ID
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching actividad cronograma
	 * @throws com.hitss.layer.NoSuchActividadCronogramaException if a matching actividad cronograma could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadCronograma findByA_C_G_First(long actividadCronogramaId,
		long cronogramaId, long grupoUsuario,
		OrderByComparator orderByComparator)
		throws NoSuchActividadCronogramaException, SystemException {
		ActividadCronograma actividadCronograma = fetchByA_C_G_First(actividadCronogramaId,
				cronogramaId, grupoUsuario, orderByComparator);

		if (actividadCronograma != null) {
			return actividadCronograma;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("actividadCronogramaId=");
		msg.append(actividadCronogramaId);

		msg.append(", cronogramaId=");
		msg.append(cronogramaId);

		msg.append(", grupoUsuario=");
		msg.append(grupoUsuario);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActividadCronogramaException(msg.toString());
	}

	/**
	 * Returns the first actividad cronograma in the ordered set where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * @param actividadCronogramaId the actividad cronograma ID
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching actividad cronograma, or <code>null</code> if a matching actividad cronograma could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadCronograma fetchByA_C_G_First(long actividadCronogramaId,
		long cronogramaId, long grupoUsuario,
		OrderByComparator orderByComparator) throws SystemException {
		List<ActividadCronograma> list = findByA_C_G(actividadCronogramaId,
				cronogramaId, grupoUsuario, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last actividad cronograma in the ordered set where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * @param actividadCronogramaId the actividad cronograma ID
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching actividad cronograma
	 * @throws com.hitss.layer.NoSuchActividadCronogramaException if a matching actividad cronograma could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadCronograma findByA_C_G_Last(long actividadCronogramaId,
		long cronogramaId, long grupoUsuario,
		OrderByComparator orderByComparator)
		throws NoSuchActividadCronogramaException, SystemException {
		ActividadCronograma actividadCronograma = fetchByA_C_G_Last(actividadCronogramaId,
				cronogramaId, grupoUsuario, orderByComparator);

		if (actividadCronograma != null) {
			return actividadCronograma;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("actividadCronogramaId=");
		msg.append(actividadCronogramaId);

		msg.append(", cronogramaId=");
		msg.append(cronogramaId);

		msg.append(", grupoUsuario=");
		msg.append(grupoUsuario);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActividadCronogramaException(msg.toString());
	}

	/**
	 * Returns the last actividad cronograma in the ordered set where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * @param actividadCronogramaId the actividad cronograma ID
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching actividad cronograma, or <code>null</code> if a matching actividad cronograma could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadCronograma fetchByA_C_G_Last(long actividadCronogramaId,
		long cronogramaId, long grupoUsuario,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByA_C_G(actividadCronogramaId, cronogramaId,
				grupoUsuario);

		if (count == 0) {
			return null;
		}

		List<ActividadCronograma> list = findByA_C_G(actividadCronogramaId,
				cronogramaId, grupoUsuario, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the actividad cronogramas before and after the current actividad cronograma in the ordered set where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * @param actividadCronogramaPK the primary key of the current actividad cronograma
	 * @param actividadCronogramaId the actividad cronograma ID
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next actividad cronograma
	 * @throws com.hitss.layer.NoSuchActividadCronogramaException if a actividad cronograma with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadCronograma[] findByA_C_G_PrevAndNext(
		ActividadCronogramaPK actividadCronogramaPK,
		long actividadCronogramaId, long cronogramaId, long grupoUsuario,
		OrderByComparator orderByComparator)
		throws NoSuchActividadCronogramaException, SystemException {
		ActividadCronograma actividadCronograma = findByPrimaryKey(actividadCronogramaPK);

		Session session = null;

		try {
			session = openSession();

			ActividadCronograma[] array = new ActividadCronogramaImpl[3];

			array[0] = getByA_C_G_PrevAndNext(session, actividadCronograma,
					actividadCronogramaId, cronogramaId, grupoUsuario,
					orderByComparator, true);

			array[1] = actividadCronograma;

			array[2] = getByA_C_G_PrevAndNext(session, actividadCronograma,
					actividadCronogramaId, cronogramaId, grupoUsuario,
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

	protected ActividadCronograma getByA_C_G_PrevAndNext(Session session,
		ActividadCronograma actividadCronograma, long actividadCronogramaId,
		long cronogramaId, long grupoUsuario,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACTIVIDADCRONOGRAMA_WHERE);

		query.append(_FINDER_COLUMN_A_C_G_ACTIVIDADCRONOGRAMAID_2);

		query.append(_FINDER_COLUMN_A_C_G_CRONOGRAMAID_2);

		query.append(_FINDER_COLUMN_A_C_G_GRUPOUSUARIO_2);

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
			query.append(ActividadCronogramaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(actividadCronogramaId);

		qPos.add(cronogramaId);

		qPos.add(grupoUsuario);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(actividadCronograma);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ActividadCronograma> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the actividad cronogramas where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63; from the database.
	 *
	 * @param actividadCronogramaId the actividad cronograma ID
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByA_C_G(long actividadCronogramaId, long cronogramaId,
		long grupoUsuario) throws SystemException {
		for (ActividadCronograma actividadCronograma : findByA_C_G(
				actividadCronogramaId, cronogramaId, grupoUsuario,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(actividadCronograma);
		}
	}

	/**
	 * Returns the number of actividad cronogramas where actividadCronogramaId = &#63; and cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * @param actividadCronogramaId the actividad cronograma ID
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @return the number of matching actividad cronogramas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByA_C_G(long actividadCronogramaId, long cronogramaId,
		long grupoUsuario) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_A_C_G;

		Object[] finderArgs = new Object[] {
				actividadCronogramaId, cronogramaId, grupoUsuario
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ACTIVIDADCRONOGRAMA_WHERE);

			query.append(_FINDER_COLUMN_A_C_G_ACTIVIDADCRONOGRAMAID_2);

			query.append(_FINDER_COLUMN_A_C_G_CRONOGRAMAID_2);

			query.append(_FINDER_COLUMN_A_C_G_GRUPOUSUARIO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(actividadCronogramaId);

				qPos.add(cronogramaId);

				qPos.add(grupoUsuario);

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

	private static final String _FINDER_COLUMN_A_C_G_ACTIVIDADCRONOGRAMAID_2 = "actividadCronograma.id.actividadCronogramaId = ? AND ";
	private static final String _FINDER_COLUMN_A_C_G_CRONOGRAMAID_2 = "actividadCronograma.id.cronogramaId = ? AND ";
	private static final String _FINDER_COLUMN_A_C_G_GRUPOUSUARIO_2 = "actividadCronograma.grupoUsuario = ? AND actividadCronograma.activo=true";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G = new FinderPath(ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
			ActividadCronogramaModelImpl.FINDER_CACHE_ENABLED,
			ActividadCronogramaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G = new FinderPath(ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
			ActividadCronogramaModelImpl.FINDER_CACHE_ENABLED,
			ActividadCronogramaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G",
			new String[] { Long.class.getName(), Long.class.getName() },
			ActividadCronogramaModelImpl.CRONOGRAMAID_COLUMN_BITMASK |
			ActividadCronogramaModelImpl.GRUPOUSUARIO_COLUMN_BITMASK |
			ActividadCronogramaModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G = new FinderPath(ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
			ActividadCronogramaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the actividad cronogramas where cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @return the matching actividad cronogramas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActividadCronograma> findByC_G(long cronogramaId,
		long grupoUsuario) throws SystemException {
		return findByC_G(cronogramaId, grupoUsuario, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the actividad cronogramas where cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadCronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @param start the lower bound of the range of actividad cronogramas
	 * @param end the upper bound of the range of actividad cronogramas (not inclusive)
	 * @return the range of matching actividad cronogramas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActividadCronograma> findByC_G(long cronogramaId,
		long grupoUsuario, int start, int end) throws SystemException {
		return findByC_G(cronogramaId, grupoUsuario, start, end, null);
	}

	/**
	 * Returns an ordered range of all the actividad cronogramas where cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadCronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @param start the lower bound of the range of actividad cronogramas
	 * @param end the upper bound of the range of actividad cronogramas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching actividad cronogramas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActividadCronograma> findByC_G(long cronogramaId,
		long grupoUsuario, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G;
			finderArgs = new Object[] { cronogramaId, grupoUsuario };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G;
			finderArgs = new Object[] {
					cronogramaId, grupoUsuario,
					
					start, end, orderByComparator
				};
		}

		List<ActividadCronograma> list = (List<ActividadCronograma>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ActividadCronograma actividadCronograma : list) {
				if ((cronogramaId != actividadCronograma.getCronogramaId()) ||
						(grupoUsuario != actividadCronograma.getGrupoUsuario())) {
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

			query.append(_SQL_SELECT_ACTIVIDADCRONOGRAMA_WHERE);

			query.append(_FINDER_COLUMN_C_G_CRONOGRAMAID_2);

			query.append(_FINDER_COLUMN_C_G_GRUPOUSUARIO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ActividadCronogramaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(cronogramaId);

				qPos.add(grupoUsuario);

				if (!pagination) {
					list = (List<ActividadCronograma>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActividadCronograma>(list);
				}
				else {
					list = (List<ActividadCronograma>)QueryUtil.list(q,
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
	 * Returns the first actividad cronograma in the ordered set where cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching actividad cronograma
	 * @throws com.hitss.layer.NoSuchActividadCronogramaException if a matching actividad cronograma could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadCronograma findByC_G_First(long cronogramaId,
		long grupoUsuario, OrderByComparator orderByComparator)
		throws NoSuchActividadCronogramaException, SystemException {
		ActividadCronograma actividadCronograma = fetchByC_G_First(cronogramaId,
				grupoUsuario, orderByComparator);

		if (actividadCronograma != null) {
			return actividadCronograma;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cronogramaId=");
		msg.append(cronogramaId);

		msg.append(", grupoUsuario=");
		msg.append(grupoUsuario);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActividadCronogramaException(msg.toString());
	}

	/**
	 * Returns the first actividad cronograma in the ordered set where cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching actividad cronograma, or <code>null</code> if a matching actividad cronograma could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadCronograma fetchByC_G_First(long cronogramaId,
		long grupoUsuario, OrderByComparator orderByComparator)
		throws SystemException {
		List<ActividadCronograma> list = findByC_G(cronogramaId, grupoUsuario,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last actividad cronograma in the ordered set where cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching actividad cronograma
	 * @throws com.hitss.layer.NoSuchActividadCronogramaException if a matching actividad cronograma could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadCronograma findByC_G_Last(long cronogramaId,
		long grupoUsuario, OrderByComparator orderByComparator)
		throws NoSuchActividadCronogramaException, SystemException {
		ActividadCronograma actividadCronograma = fetchByC_G_Last(cronogramaId,
				grupoUsuario, orderByComparator);

		if (actividadCronograma != null) {
			return actividadCronograma;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cronogramaId=");
		msg.append(cronogramaId);

		msg.append(", grupoUsuario=");
		msg.append(grupoUsuario);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActividadCronogramaException(msg.toString());
	}

	/**
	 * Returns the last actividad cronograma in the ordered set where cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching actividad cronograma, or <code>null</code> if a matching actividad cronograma could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadCronograma fetchByC_G_Last(long cronogramaId,
		long grupoUsuario, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_G(cronogramaId, grupoUsuario);

		if (count == 0) {
			return null;
		}

		List<ActividadCronograma> list = findByC_G(cronogramaId, grupoUsuario,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the actividad cronogramas before and after the current actividad cronograma in the ordered set where cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * @param actividadCronogramaPK the primary key of the current actividad cronograma
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next actividad cronograma
	 * @throws com.hitss.layer.NoSuchActividadCronogramaException if a actividad cronograma with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadCronograma[] findByC_G_PrevAndNext(
		ActividadCronogramaPK actividadCronogramaPK, long cronogramaId,
		long grupoUsuario, OrderByComparator orderByComparator)
		throws NoSuchActividadCronogramaException, SystemException {
		ActividadCronograma actividadCronograma = findByPrimaryKey(actividadCronogramaPK);

		Session session = null;

		try {
			session = openSession();

			ActividadCronograma[] array = new ActividadCronogramaImpl[3];

			array[0] = getByC_G_PrevAndNext(session, actividadCronograma,
					cronogramaId, grupoUsuario, orderByComparator, true);

			array[1] = actividadCronograma;

			array[2] = getByC_G_PrevAndNext(session, actividadCronograma,
					cronogramaId, grupoUsuario, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ActividadCronograma getByC_G_PrevAndNext(Session session,
		ActividadCronograma actividadCronograma, long cronogramaId,
		long grupoUsuario, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACTIVIDADCRONOGRAMA_WHERE);

		query.append(_FINDER_COLUMN_C_G_CRONOGRAMAID_2);

		query.append(_FINDER_COLUMN_C_G_GRUPOUSUARIO_2);

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
			query.append(ActividadCronogramaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(cronogramaId);

		qPos.add(grupoUsuario);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(actividadCronograma);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ActividadCronograma> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the actividad cronogramas where cronogramaId = &#63; and grupoUsuario = &#63; from the database.
	 *
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G(long cronogramaId, long grupoUsuario)
		throws SystemException {
		for (ActividadCronograma actividadCronograma : findByC_G(cronogramaId,
				grupoUsuario, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(actividadCronograma);
		}
	}

	/**
	 * Returns the number of actividad cronogramas where cronogramaId = &#63; and grupoUsuario = &#63;.
	 *
	 * @param cronogramaId the cronograma ID
	 * @param grupoUsuario the grupo usuario
	 * @return the number of matching actividad cronogramas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_G(long cronogramaId, long grupoUsuario)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G;

		Object[] finderArgs = new Object[] { cronogramaId, grupoUsuario };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ACTIVIDADCRONOGRAMA_WHERE);

			query.append(_FINDER_COLUMN_C_G_CRONOGRAMAID_2);

			query.append(_FINDER_COLUMN_C_G_GRUPOUSUARIO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(cronogramaId);

				qPos.add(grupoUsuario);

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

	private static final String _FINDER_COLUMN_C_G_CRONOGRAMAID_2 = "actividadCronograma.id.cronogramaId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_GRUPOUSUARIO_2 = "actividadCronograma.grupoUsuario = ? AND actividadCronograma.activo=true";

	public ActividadCronogramaPersistenceImpl() {
		setModelClass(ActividadCronograma.class);
	}

	/**
	 * Caches the actividad cronograma in the entity cache if it is enabled.
	 *
	 * @param actividadCronograma the actividad cronograma
	 */
	@Override
	public void cacheResult(ActividadCronograma actividadCronograma) {
		EntityCacheUtil.putResult(ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
			ActividadCronogramaImpl.class, actividadCronograma.getPrimaryKey(),
			actividadCronograma);

		actividadCronograma.resetOriginalValues();
	}

	/**
	 * Caches the actividad cronogramas in the entity cache if it is enabled.
	 *
	 * @param actividadCronogramas the actividad cronogramas
	 */
	@Override
	public void cacheResult(List<ActividadCronograma> actividadCronogramas) {
		for (ActividadCronograma actividadCronograma : actividadCronogramas) {
			if (EntityCacheUtil.getResult(
						ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
						ActividadCronogramaImpl.class,
						actividadCronograma.getPrimaryKey()) == null) {
				cacheResult(actividadCronograma);
			}
			else {
				actividadCronograma.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all actividad cronogramas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ActividadCronogramaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ActividadCronogramaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the actividad cronograma.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ActividadCronograma actividadCronograma) {
		EntityCacheUtil.removeResult(ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
			ActividadCronogramaImpl.class, actividadCronograma.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ActividadCronograma> actividadCronogramas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ActividadCronograma actividadCronograma : actividadCronogramas) {
			EntityCacheUtil.removeResult(ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
				ActividadCronogramaImpl.class,
				actividadCronograma.getPrimaryKey());
		}
	}

	/**
	 * Creates a new actividad cronograma with the primary key. Does not add the actividad cronograma to the database.
	 *
	 * @param actividadCronogramaPK the primary key for the new actividad cronograma
	 * @return the new actividad cronograma
	 */
	@Override
	public ActividadCronograma create(
		ActividadCronogramaPK actividadCronogramaPK) {
		ActividadCronograma actividadCronograma = new ActividadCronogramaImpl();

		actividadCronograma.setNew(true);
		actividadCronograma.setPrimaryKey(actividadCronogramaPK);

		return actividadCronograma;
	}

	/**
	 * Removes the actividad cronograma with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param actividadCronogramaPK the primary key of the actividad cronograma
	 * @return the actividad cronograma that was removed
	 * @throws com.hitss.layer.NoSuchActividadCronogramaException if a actividad cronograma with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadCronograma remove(
		ActividadCronogramaPK actividadCronogramaPK)
		throws NoSuchActividadCronogramaException, SystemException {
		return remove((Serializable)actividadCronogramaPK);
	}

	/**
	 * Removes the actividad cronograma with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the actividad cronograma
	 * @return the actividad cronograma that was removed
	 * @throws com.hitss.layer.NoSuchActividadCronogramaException if a actividad cronograma with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadCronograma remove(Serializable primaryKey)
		throws NoSuchActividadCronogramaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ActividadCronograma actividadCronograma = (ActividadCronograma)session.get(ActividadCronogramaImpl.class,
					primaryKey);

			if (actividadCronograma == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchActividadCronogramaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(actividadCronograma);
		}
		catch (NoSuchActividadCronogramaException nsee) {
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
	protected ActividadCronograma removeImpl(
		ActividadCronograma actividadCronograma) throws SystemException {
		actividadCronograma = toUnwrappedModel(actividadCronograma);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(actividadCronograma)) {
				actividadCronograma = (ActividadCronograma)session.get(ActividadCronogramaImpl.class,
						actividadCronograma.getPrimaryKeyObj());
			}

			if (actividadCronograma != null) {
				session.delete(actividadCronograma);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (actividadCronograma != null) {
			clearCache(actividadCronograma);
		}

		return actividadCronograma;
	}

	@Override
	public ActividadCronograma updateImpl(
		com.hitss.layer.model.ActividadCronograma actividadCronograma)
		throws SystemException {
		actividadCronograma = toUnwrappedModel(actividadCronograma);

		boolean isNew = actividadCronograma.isNew();

		ActividadCronogramaModelImpl actividadCronogramaModelImpl = (ActividadCronogramaModelImpl)actividadCronograma;

		Session session = null;

		try {
			session = openSession();

			if (actividadCronograma.isNew()) {
				session.save(actividadCronograma);

				actividadCronograma.setNew(false);
			}
			else {
				session.merge(actividadCronograma);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ActividadCronogramaModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((actividadCronogramaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_C_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						actividadCronogramaModelImpl.getOriginalActividadCronogramaId(),
						actividadCronogramaModelImpl.getOriginalCronogramaId(),
						actividadCronogramaModelImpl.getOriginalGrupoUsuario()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_A_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_C_G,
					args);

				args = new Object[] {
						actividadCronogramaModelImpl.getActividadCronogramaId(),
						actividadCronogramaModelImpl.getCronogramaId(),
						actividadCronogramaModelImpl.getGrupoUsuario()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_A_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_C_G,
					args);
			}

			if ((actividadCronogramaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						actividadCronogramaModelImpl.getOriginalCronogramaId(),
						actividadCronogramaModelImpl.getOriginalGrupoUsuario()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);

				args = new Object[] {
						actividadCronogramaModelImpl.getCronogramaId(),
						actividadCronogramaModelImpl.getGrupoUsuario()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);
			}
		}

		EntityCacheUtil.putResult(ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
			ActividadCronogramaImpl.class, actividadCronograma.getPrimaryKey(),
			actividadCronograma);

		return actividadCronograma;
	}

	protected ActividadCronograma toUnwrappedModel(
		ActividadCronograma actividadCronograma) {
		if (actividadCronograma instanceof ActividadCronogramaImpl) {
			return actividadCronograma;
		}

		ActividadCronogramaImpl actividadCronogramaImpl = new ActividadCronogramaImpl();

		actividadCronogramaImpl.setNew(actividadCronograma.isNew());
		actividadCronogramaImpl.setPrimaryKey(actividadCronograma.getPrimaryKey());

		actividadCronogramaImpl.setActividadCronogramaId(actividadCronograma.getActividadCronogramaId());
		actividadCronogramaImpl.setCronogramaId(actividadCronograma.getCronogramaId());
		actividadCronogramaImpl.setGrupoUsuario(actividadCronograma.getGrupoUsuario());
		actividadCronogramaImpl.setDescripcion(actividadCronograma.getDescripcion());
		actividadCronogramaImpl.setFechaInicio(actividadCronograma.getFechaInicio());
		actividadCronogramaImpl.setFechaFin(actividadCronograma.getFechaFin());
		actividadCronogramaImpl.setCumplidoEvaluacion(actividadCronograma.isCumplidoEvaluacion());
		actividadCronogramaImpl.setEstado(actividadCronograma.getEstado());
		actividadCronogramaImpl.setFechaInicioEvaluacion(actividadCronograma.getFechaInicioEvaluacion());
		actividadCronogramaImpl.setFechaFinEvaluacion(actividadCronograma.getFechaFinEvaluacion());
		actividadCronogramaImpl.setAprobadoColaborador(actividadCronograma.getAprobadoColaborador());
		actividadCronogramaImpl.setAprobadoLider(actividadCronograma.getAprobadoLider());
		actividadCronogramaImpl.setUsuarioGerenteId(actividadCronograma.getUsuarioGerenteId());
		actividadCronogramaImpl.setUsuarioLiderId(actividadCronograma.getUsuarioLiderId());
		actividadCronogramaImpl.setActivo(actividadCronograma.isActivo());
		actividadCronogramaImpl.setUsuariocrea(actividadCronograma.getUsuariocrea());
		actividadCronogramaImpl.setFechacrea(actividadCronograma.getFechacrea());
		actividadCronogramaImpl.setUsuariomodifica(actividadCronograma.getUsuariomodifica());
		actividadCronogramaImpl.setFechamodifica(actividadCronograma.getFechamodifica());

		return actividadCronogramaImpl;
	}

	/**
	 * Returns the actividad cronograma with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the actividad cronograma
	 * @return the actividad cronograma
	 * @throws com.hitss.layer.NoSuchActividadCronogramaException if a actividad cronograma with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadCronograma findByPrimaryKey(Serializable primaryKey)
		throws NoSuchActividadCronogramaException, SystemException {
		ActividadCronograma actividadCronograma = fetchByPrimaryKey(primaryKey);

		if (actividadCronograma == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchActividadCronogramaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return actividadCronograma;
	}

	/**
	 * Returns the actividad cronograma with the primary key or throws a {@link com.hitss.layer.NoSuchActividadCronogramaException} if it could not be found.
	 *
	 * @param actividadCronogramaPK the primary key of the actividad cronograma
	 * @return the actividad cronograma
	 * @throws com.hitss.layer.NoSuchActividadCronogramaException if a actividad cronograma with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadCronograma findByPrimaryKey(
		ActividadCronogramaPK actividadCronogramaPK)
		throws NoSuchActividadCronogramaException, SystemException {
		return findByPrimaryKey((Serializable)actividadCronogramaPK);
	}

	/**
	 * Returns the actividad cronograma with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the actividad cronograma
	 * @return the actividad cronograma, or <code>null</code> if a actividad cronograma with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadCronograma fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ActividadCronograma actividadCronograma = (ActividadCronograma)EntityCacheUtil.getResult(ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
				ActividadCronogramaImpl.class, primaryKey);

		if (actividadCronograma == _nullActividadCronograma) {
			return null;
		}

		if (actividadCronograma == null) {
			Session session = null;

			try {
				session = openSession();

				actividadCronograma = (ActividadCronograma)session.get(ActividadCronogramaImpl.class,
						primaryKey);

				if (actividadCronograma != null) {
					cacheResult(actividadCronograma);
				}
				else {
					EntityCacheUtil.putResult(ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
						ActividadCronogramaImpl.class, primaryKey,
						_nullActividadCronograma);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ActividadCronogramaModelImpl.ENTITY_CACHE_ENABLED,
					ActividadCronogramaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return actividadCronograma;
	}

	/**
	 * Returns the actividad cronograma with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param actividadCronogramaPK the primary key of the actividad cronograma
	 * @return the actividad cronograma, or <code>null</code> if a actividad cronograma with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadCronograma fetchByPrimaryKey(
		ActividadCronogramaPK actividadCronogramaPK) throws SystemException {
		return fetchByPrimaryKey((Serializable)actividadCronogramaPK);
	}

	/**
	 * Returns all the actividad cronogramas.
	 *
	 * @return the actividad cronogramas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActividadCronograma> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the actividad cronogramas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadCronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of actividad cronogramas
	 * @param end the upper bound of the range of actividad cronogramas (not inclusive)
	 * @return the range of actividad cronogramas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActividadCronograma> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the actividad cronogramas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadCronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of actividad cronogramas
	 * @param end the upper bound of the range of actividad cronogramas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of actividad cronogramas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActividadCronograma> findAll(int start, int end,
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

		List<ActividadCronograma> list = (List<ActividadCronograma>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACTIVIDADCRONOGRAMA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACTIVIDADCRONOGRAMA;

				if (pagination) {
					sql = sql.concat(ActividadCronogramaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ActividadCronograma>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActividadCronograma>(list);
				}
				else {
					list = (List<ActividadCronograma>)QueryUtil.list(q,
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
	 * Removes all the actividad cronogramas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ActividadCronograma actividadCronograma : findAll()) {
			remove(actividadCronograma);
		}
	}

	/**
	 * Returns the number of actividad cronogramas.
	 *
	 * @return the number of actividad cronogramas
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

				Query q = session.createQuery(_SQL_COUNT_ACTIVIDADCRONOGRAMA);

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
	 * Initializes the actividad cronograma persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.ActividadCronograma")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ActividadCronograma>> listenersList = new ArrayList<ModelListener<ActividadCronograma>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ActividadCronograma>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ActividadCronogramaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ACTIVIDADCRONOGRAMA = "SELECT actividadCronograma FROM ActividadCronograma actividadCronograma";
	private static final String _SQL_SELECT_ACTIVIDADCRONOGRAMA_WHERE = "SELECT actividadCronograma FROM ActividadCronograma actividadCronograma WHERE ";
	private static final String _SQL_COUNT_ACTIVIDADCRONOGRAMA = "SELECT COUNT(actividadCronograma) FROM ActividadCronograma actividadCronograma";
	private static final String _SQL_COUNT_ACTIVIDADCRONOGRAMA_WHERE = "SELECT COUNT(actividadCronograma) FROM ActividadCronograma actividadCronograma WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "actividadCronograma.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ActividadCronograma exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ActividadCronograma exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ActividadCronogramaPersistenceImpl.class);
	private static ActividadCronograma _nullActividadCronograma = new ActividadCronogramaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ActividadCronograma> toCacheModel() {
				return _nullActividadCronogramaCacheModel;
			}
		};

	private static CacheModel<ActividadCronograma> _nullActividadCronogramaCacheModel =
		new CacheModel<ActividadCronograma>() {
			@Override
			public ActividadCronograma toEntityModel() {
				return _nullActividadCronograma;
			}
		};
}
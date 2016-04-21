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

package com.rec.hitss.layer.service.persistence;

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

import com.rec.hitss.layer.NoSuchPuestoException;
import com.rec.hitss.layer.model.Puesto;
import com.rec.hitss.layer.model.impl.PuestoImpl;
import com.rec.hitss.layer.model.impl.PuestoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the puesto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see PuestoPersistence
 * @see PuestoUtil
 * @generated
 */
public class PuestoPersistenceImpl extends BasePersistenceImpl<Puesto>
	implements PuestoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PuestoUtil} to access the puesto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PuestoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PuestoModelImpl.ENTITY_CACHE_ENABLED,
			PuestoModelImpl.FINDER_CACHE_ENABLED, PuestoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PuestoModelImpl.ENTITY_CACHE_ENABLED,
			PuestoModelImpl.FINDER_CACHE_ENABLED, PuestoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PuestoModelImpl.ENTITY_CACHE_ENABLED,
			PuestoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUERIMIENTORECURSO =
		new FinderPath(PuestoModelImpl.ENTITY_CACHE_ENABLED,
			PuestoModelImpl.FINDER_CACHE_ENABLED, PuestoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByRequerimientoRecurso",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUERIMIENTORECURSO =
		new FinderPath(PuestoModelImpl.ENTITY_CACHE_ENABLED,
			PuestoModelImpl.FINDER_CACHE_ENABLED, PuestoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByRequerimientoRecurso",
			new String[] { Long.class.getName() },
			PuestoModelImpl.REQUERIMIENTORECURSOID_COLUMN_BITMASK |
			PuestoModelImpl.FECHACREA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUERIMIENTORECURSO = new FinderPath(PuestoModelImpl.ENTITY_CACHE_ENABLED,
			PuestoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRequerimientoRecurso", new String[] { Long.class.getName() });

	/**
	 * Returns all the puestos where requerimientoRecursoId = &#63;.
	 *
	 * @param requerimientoRecursoId the requerimiento recurso ID
	 * @return the matching puestos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Puesto> findByRequerimientoRecurso(long requerimientoRecursoId)
		throws SystemException {
		return findByRequerimientoRecurso(requerimientoRecursoId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the puestos where requerimientoRecursoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PuestoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requerimientoRecursoId the requerimiento recurso ID
	 * @param start the lower bound of the range of puestos
	 * @param end the upper bound of the range of puestos (not inclusive)
	 * @return the range of matching puestos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Puesto> findByRequerimientoRecurso(
		long requerimientoRecursoId, int start, int end)
		throws SystemException {
		return findByRequerimientoRecurso(requerimientoRecursoId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the puestos where requerimientoRecursoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PuestoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requerimientoRecursoId the requerimiento recurso ID
	 * @param start the lower bound of the range of puestos
	 * @param end the upper bound of the range of puestos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching puestos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Puesto> findByRequerimientoRecurso(
		long requerimientoRecursoId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUERIMIENTORECURSO;
			finderArgs = new Object[] { requerimientoRecursoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUERIMIENTORECURSO;
			finderArgs = new Object[] {
					requerimientoRecursoId,
					
					start, end, orderByComparator
				};
		}

		List<Puesto> list = (List<Puesto>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Puesto puesto : list) {
				if ((requerimientoRecursoId != puesto.getRequerimientoRecursoId())) {
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

			query.append(_SQL_SELECT_PUESTO_WHERE);

			query.append(_FINDER_COLUMN_REQUERIMIENTORECURSO_REQUERIMIENTORECURSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PuestoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(requerimientoRecursoId);

				if (!pagination) {
					list = (List<Puesto>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Puesto>(list);
				}
				else {
					list = (List<Puesto>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first puesto in the ordered set where requerimientoRecursoId = &#63;.
	 *
	 * @param requerimientoRecursoId the requerimiento recurso ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching puesto
	 * @throws com.rec.hitss.layer.NoSuchPuestoException if a matching puesto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Puesto findByRequerimientoRecurso_First(
		long requerimientoRecursoId, OrderByComparator orderByComparator)
		throws NoSuchPuestoException, SystemException {
		Puesto puesto = fetchByRequerimientoRecurso_First(requerimientoRecursoId,
				orderByComparator);

		if (puesto != null) {
			return puesto;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requerimientoRecursoId=");
		msg.append(requerimientoRecursoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPuestoException(msg.toString());
	}

	/**
	 * Returns the first puesto in the ordered set where requerimientoRecursoId = &#63;.
	 *
	 * @param requerimientoRecursoId the requerimiento recurso ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching puesto, or <code>null</code> if a matching puesto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Puesto fetchByRequerimientoRecurso_First(
		long requerimientoRecursoId, OrderByComparator orderByComparator)
		throws SystemException {
		List<Puesto> list = findByRequerimientoRecurso(requerimientoRecursoId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last puesto in the ordered set where requerimientoRecursoId = &#63;.
	 *
	 * @param requerimientoRecursoId the requerimiento recurso ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching puesto
	 * @throws com.rec.hitss.layer.NoSuchPuestoException if a matching puesto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Puesto findByRequerimientoRecurso_Last(long requerimientoRecursoId,
		OrderByComparator orderByComparator)
		throws NoSuchPuestoException, SystemException {
		Puesto puesto = fetchByRequerimientoRecurso_Last(requerimientoRecursoId,
				orderByComparator);

		if (puesto != null) {
			return puesto;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requerimientoRecursoId=");
		msg.append(requerimientoRecursoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPuestoException(msg.toString());
	}

	/**
	 * Returns the last puesto in the ordered set where requerimientoRecursoId = &#63;.
	 *
	 * @param requerimientoRecursoId the requerimiento recurso ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching puesto, or <code>null</code> if a matching puesto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Puesto fetchByRequerimientoRecurso_Last(
		long requerimientoRecursoId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByRequerimientoRecurso(requerimientoRecursoId);

		if (count == 0) {
			return null;
		}

		List<Puesto> list = findByRequerimientoRecurso(requerimientoRecursoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the puestos before and after the current puesto in the ordered set where requerimientoRecursoId = &#63;.
	 *
	 * @param puestoId the primary key of the current puesto
	 * @param requerimientoRecursoId the requerimiento recurso ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next puesto
	 * @throws com.rec.hitss.layer.NoSuchPuestoException if a puesto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Puesto[] findByRequerimientoRecurso_PrevAndNext(long puestoId,
		long requerimientoRecursoId, OrderByComparator orderByComparator)
		throws NoSuchPuestoException, SystemException {
		Puesto puesto = findByPrimaryKey(puestoId);

		Session session = null;

		try {
			session = openSession();

			Puesto[] array = new PuestoImpl[3];

			array[0] = getByRequerimientoRecurso_PrevAndNext(session, puesto,
					requerimientoRecursoId, orderByComparator, true);

			array[1] = puesto;

			array[2] = getByRequerimientoRecurso_PrevAndNext(session, puesto,
					requerimientoRecursoId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Puesto getByRequerimientoRecurso_PrevAndNext(Session session,
		Puesto puesto, long requerimientoRecursoId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PUESTO_WHERE);

		query.append(_FINDER_COLUMN_REQUERIMIENTORECURSO_REQUERIMIENTORECURSOID_2);

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
			query.append(PuestoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(requerimientoRecursoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(puesto);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Puesto> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the puestos where requerimientoRecursoId = &#63; from the database.
	 *
	 * @param requerimientoRecursoId the requerimiento recurso ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequerimientoRecurso(long requerimientoRecursoId)
		throws SystemException {
		for (Puesto puesto : findByRequerimientoRecurso(
				requerimientoRecursoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(puesto);
		}
	}

	/**
	 * Returns the number of puestos where requerimientoRecursoId = &#63;.
	 *
	 * @param requerimientoRecursoId the requerimiento recurso ID
	 * @return the number of matching puestos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRequerimientoRecurso(long requerimientoRecursoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REQUERIMIENTORECURSO;

		Object[] finderArgs = new Object[] { requerimientoRecursoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PUESTO_WHERE);

			query.append(_FINDER_COLUMN_REQUERIMIENTORECURSO_REQUERIMIENTORECURSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(requerimientoRecursoId);

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

	private static final String _FINDER_COLUMN_REQUERIMIENTORECURSO_REQUERIMIENTORECURSOID_2 =
		"puesto.requerimientoRecursoId = ?";

	public PuestoPersistenceImpl() {
		setModelClass(Puesto.class);
	}

	/**
	 * Caches the puesto in the entity cache if it is enabled.
	 *
	 * @param puesto the puesto
	 */
	@Override
	public void cacheResult(Puesto puesto) {
		EntityCacheUtil.putResult(PuestoModelImpl.ENTITY_CACHE_ENABLED,
			PuestoImpl.class, puesto.getPrimaryKey(), puesto);

		puesto.resetOriginalValues();
	}

	/**
	 * Caches the puestos in the entity cache if it is enabled.
	 *
	 * @param puestos the puestos
	 */
	@Override
	public void cacheResult(List<Puesto> puestos) {
		for (Puesto puesto : puestos) {
			if (EntityCacheUtil.getResult(
						PuestoModelImpl.ENTITY_CACHE_ENABLED, PuestoImpl.class,
						puesto.getPrimaryKey()) == null) {
				cacheResult(puesto);
			}
			else {
				puesto.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all puestos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PuestoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PuestoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the puesto.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Puesto puesto) {
		EntityCacheUtil.removeResult(PuestoModelImpl.ENTITY_CACHE_ENABLED,
			PuestoImpl.class, puesto.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Puesto> puestos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Puesto puesto : puestos) {
			EntityCacheUtil.removeResult(PuestoModelImpl.ENTITY_CACHE_ENABLED,
				PuestoImpl.class, puesto.getPrimaryKey());
		}
	}

	/**
	 * Creates a new puesto with the primary key. Does not add the puesto to the database.
	 *
	 * @param puestoId the primary key for the new puesto
	 * @return the new puesto
	 */
	@Override
	public Puesto create(long puestoId) {
		Puesto puesto = new PuestoImpl();

		puesto.setNew(true);
		puesto.setPrimaryKey(puestoId);

		return puesto;
	}

	/**
	 * Removes the puesto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param puestoId the primary key of the puesto
	 * @return the puesto that was removed
	 * @throws com.rec.hitss.layer.NoSuchPuestoException if a puesto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Puesto remove(long puestoId)
		throws NoSuchPuestoException, SystemException {
		return remove((Serializable)puestoId);
	}

	/**
	 * Removes the puesto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the puesto
	 * @return the puesto that was removed
	 * @throws com.rec.hitss.layer.NoSuchPuestoException if a puesto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Puesto remove(Serializable primaryKey)
		throws NoSuchPuestoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Puesto puesto = (Puesto)session.get(PuestoImpl.class, primaryKey);

			if (puesto == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPuestoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(puesto);
		}
		catch (NoSuchPuestoException nsee) {
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
	protected Puesto removeImpl(Puesto puesto) throws SystemException {
		puesto = toUnwrappedModel(puesto);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(puesto)) {
				puesto = (Puesto)session.get(PuestoImpl.class,
						puesto.getPrimaryKeyObj());
			}

			if (puesto != null) {
				session.delete(puesto);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (puesto != null) {
			clearCache(puesto);
		}

		return puesto;
	}

	@Override
	public Puesto updateImpl(com.rec.hitss.layer.model.Puesto puesto)
		throws SystemException {
		puesto = toUnwrappedModel(puesto);

		boolean isNew = puesto.isNew();

		PuestoModelImpl puestoModelImpl = (PuestoModelImpl)puesto;

		Session session = null;

		try {
			session = openSession();

			if (puesto.isNew()) {
				session.save(puesto);

				puesto.setNew(false);
			}
			else {
				session.merge(puesto);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PuestoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((puestoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUERIMIENTORECURSO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						puestoModelImpl.getOriginalRequerimientoRecursoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUERIMIENTORECURSO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUERIMIENTORECURSO,
					args);

				args = new Object[] { puestoModelImpl.getRequerimientoRecursoId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUERIMIENTORECURSO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUERIMIENTORECURSO,
					args);
			}
		}

		EntityCacheUtil.putResult(PuestoModelImpl.ENTITY_CACHE_ENABLED,
			PuestoImpl.class, puesto.getPrimaryKey(), puesto);

		return puesto;
	}

	protected Puesto toUnwrappedModel(Puesto puesto) {
		if (puesto instanceof PuestoImpl) {
			return puesto;
		}

		PuestoImpl puestoImpl = new PuestoImpl();

		puestoImpl.setNew(puesto.isNew());
		puestoImpl.setPrimaryKey(puesto.getPrimaryKey());

		puestoImpl.setPuestoId(puesto.getPuestoId());
		puestoImpl.setDescripcion(puesto.getDescripcion());
		puestoImpl.setFechaContrato(puesto.getFechaContrato());
		puestoImpl.setFechaEvaluacionPsicologica(puesto.getFechaEvaluacionPsicologica());
		puestoImpl.setFechaEvalucionTecnica(puesto.getFechaEvalucionTecnica());
		puestoImpl.setFechaEntrevistaGerenteArea(puesto.getFechaEntrevistaGerenteArea());
		puestoImpl.setFechaEvaluacionRRHH(puesto.getFechaEvaluacionRRHH());
		puestoImpl.setFechaPostulacion(puesto.getFechaPostulacion());
		puestoImpl.setSeleccionado(puesto.isSeleccionado());
		puestoImpl.setActivo(puesto.isActivo());
		puestoImpl.setUsuariocrea(puesto.getUsuariocrea());
		puestoImpl.setFechacrea(puesto.getFechacrea());
		puestoImpl.setUsuariomodifica(puesto.getUsuariomodifica());
		puestoImpl.setFechacreamodifica(puesto.getFechacreamodifica());
		puestoImpl.setRequerimientoRecursoId(puesto.getRequerimientoRecursoId());
		puestoImpl.setUsuarioHitssId(puesto.getUsuarioHitssId());

		return puestoImpl;
	}

	/**
	 * Returns the puesto with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the puesto
	 * @return the puesto
	 * @throws com.rec.hitss.layer.NoSuchPuestoException if a puesto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Puesto findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPuestoException, SystemException {
		Puesto puesto = fetchByPrimaryKey(primaryKey);

		if (puesto == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPuestoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return puesto;
	}

	/**
	 * Returns the puesto with the primary key or throws a {@link com.rec.hitss.layer.NoSuchPuestoException} if it could not be found.
	 *
	 * @param puestoId the primary key of the puesto
	 * @return the puesto
	 * @throws com.rec.hitss.layer.NoSuchPuestoException if a puesto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Puesto findByPrimaryKey(long puestoId)
		throws NoSuchPuestoException, SystemException {
		return findByPrimaryKey((Serializable)puestoId);
	}

	/**
	 * Returns the puesto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the puesto
	 * @return the puesto, or <code>null</code> if a puesto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Puesto fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Puesto puesto = (Puesto)EntityCacheUtil.getResult(PuestoModelImpl.ENTITY_CACHE_ENABLED,
				PuestoImpl.class, primaryKey);

		if (puesto == _nullPuesto) {
			return null;
		}

		if (puesto == null) {
			Session session = null;

			try {
				session = openSession();

				puesto = (Puesto)session.get(PuestoImpl.class, primaryKey);

				if (puesto != null) {
					cacheResult(puesto);
				}
				else {
					EntityCacheUtil.putResult(PuestoModelImpl.ENTITY_CACHE_ENABLED,
						PuestoImpl.class, primaryKey, _nullPuesto);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PuestoModelImpl.ENTITY_CACHE_ENABLED,
					PuestoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return puesto;
	}

	/**
	 * Returns the puesto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param puestoId the primary key of the puesto
	 * @return the puesto, or <code>null</code> if a puesto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Puesto fetchByPrimaryKey(long puestoId) throws SystemException {
		return fetchByPrimaryKey((Serializable)puestoId);
	}

	/**
	 * Returns all the puestos.
	 *
	 * @return the puestos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Puesto> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the puestos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PuestoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of puestos
	 * @param end the upper bound of the range of puestos (not inclusive)
	 * @return the range of puestos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Puesto> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the puestos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PuestoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of puestos
	 * @param end the upper bound of the range of puestos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of puestos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Puesto> findAll(int start, int end,
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

		List<Puesto> list = (List<Puesto>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PUESTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PUESTO;

				if (pagination) {
					sql = sql.concat(PuestoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Puesto>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Puesto>(list);
				}
				else {
					list = (List<Puesto>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the puestos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Puesto puesto : findAll()) {
			remove(puesto);
		}
	}

	/**
	 * Returns the number of puestos.
	 *
	 * @return the number of puestos
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

				Query q = session.createQuery(_SQL_COUNT_PUESTO);

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
	 * Initializes the puesto persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.Puesto")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Puesto>> listenersList = new ArrayList<ModelListener<Puesto>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Puesto>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PuestoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PUESTO = "SELECT puesto FROM Puesto puesto";
	private static final String _SQL_SELECT_PUESTO_WHERE = "SELECT puesto FROM Puesto puesto WHERE ";
	private static final String _SQL_COUNT_PUESTO = "SELECT COUNT(puesto) FROM Puesto puesto";
	private static final String _SQL_COUNT_PUESTO_WHERE = "SELECT COUNT(puesto) FROM Puesto puesto WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "puesto.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Puesto exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Puesto exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PuestoPersistenceImpl.class);
	private static Puesto _nullPuesto = new PuestoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Puesto> toCacheModel() {
				return _nullPuestoCacheModel;
			}
		};

	private static CacheModel<Puesto> _nullPuestoCacheModel = new CacheModel<Puesto>() {
			@Override
			public Puesto toEntityModel() {
				return _nullPuesto;
			}
		};
}
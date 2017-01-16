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

import com.hitss.layer.NoSuchPuestoEvaluacionException;
import com.hitss.layer.model.PuestoEvaluacion;
import com.hitss.layer.model.impl.PuestoEvaluacionImpl;
import com.hitss.layer.model.impl.PuestoEvaluacionModelImpl;

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
 * The persistence implementation for the puesto evaluacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PuestoEvaluacionPersistence
 * @see PuestoEvaluacionUtil
 * @generated
 */
public class PuestoEvaluacionPersistenceImpl extends BasePersistenceImpl<PuestoEvaluacion>
	implements PuestoEvaluacionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PuestoEvaluacionUtil} to access the puesto evaluacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PuestoEvaluacionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			PuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			PuestoEvaluacionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			PuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			PuestoEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			PuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_ALL = new FinderPath(PuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			PuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			PuestoEvaluacionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByS_ALL",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_ALL = new FinderPath(PuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			PuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			PuestoEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_ALL",
			new String[] { Long.class.getName() },
			PuestoEvaluacionModelImpl.SOLICITUDFUNCIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_ALL = new FinderPath(PuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			PuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_ALL",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the puesto evaluacions where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @return the matching puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PuestoEvaluacion> findByS_ALL(long solicitudFuncionId)
		throws SystemException {
		return findByS_ALL(solicitudFuncionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the puesto evaluacions where solicitudFuncionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param start the lower bound of the range of puesto evaluacions
	 * @param end the upper bound of the range of puesto evaluacions (not inclusive)
	 * @return the range of matching puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PuestoEvaluacion> findByS_ALL(long solicitudFuncionId,
		int start, int end) throws SystemException {
		return findByS_ALL(solicitudFuncionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the puesto evaluacions where solicitudFuncionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param start the lower bound of the range of puesto evaluacions
	 * @param end the upper bound of the range of puesto evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PuestoEvaluacion> findByS_ALL(long solicitudFuncionId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<PuestoEvaluacion> list = (List<PuestoEvaluacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PuestoEvaluacion puestoEvaluacion : list) {
				if ((solicitudFuncionId != puestoEvaluacion.getSolicitudFuncionId())) {
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

			query.append(_SQL_SELECT_PUESTOEVALUACION_WHERE);

			query.append(_FINDER_COLUMN_S_ALL_SOLICITUDFUNCIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PuestoEvaluacionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudFuncionId);

				if (!pagination) {
					list = (List<PuestoEvaluacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PuestoEvaluacion>(list);
				}
				else {
					list = (List<PuestoEvaluacion>)QueryUtil.list(q,
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
	 * Returns the first puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching puesto evaluacion
	 * @throws com.hitss.layer.NoSuchPuestoEvaluacionException if a matching puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PuestoEvaluacion findByS_ALL_First(long solicitudFuncionId,
		OrderByComparator orderByComparator)
		throws NoSuchPuestoEvaluacionException, SystemException {
		PuestoEvaluacion puestoEvaluacion = fetchByS_ALL_First(solicitudFuncionId,
				orderByComparator);

		if (puestoEvaluacion != null) {
			return puestoEvaluacion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudFuncionId=");
		msg.append(solicitudFuncionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPuestoEvaluacionException(msg.toString());
	}

	/**
	 * Returns the first puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching puesto evaluacion, or <code>null</code> if a matching puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PuestoEvaluacion fetchByS_ALL_First(long solicitudFuncionId,
		OrderByComparator orderByComparator) throws SystemException {
		List<PuestoEvaluacion> list = findByS_ALL(solicitudFuncionId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching puesto evaluacion
	 * @throws com.hitss.layer.NoSuchPuestoEvaluacionException if a matching puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PuestoEvaluacion findByS_ALL_Last(long solicitudFuncionId,
		OrderByComparator orderByComparator)
		throws NoSuchPuestoEvaluacionException, SystemException {
		PuestoEvaluacion puestoEvaluacion = fetchByS_ALL_Last(solicitudFuncionId,
				orderByComparator);

		if (puestoEvaluacion != null) {
			return puestoEvaluacion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudFuncionId=");
		msg.append(solicitudFuncionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPuestoEvaluacionException(msg.toString());
	}

	/**
	 * Returns the last puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching puesto evaluacion, or <code>null</code> if a matching puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PuestoEvaluacion fetchByS_ALL_Last(long solicitudFuncionId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByS_ALL(solicitudFuncionId);

		if (count == 0) {
			return null;
		}

		List<PuestoEvaluacion> list = findByS_ALL(solicitudFuncionId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the puesto evaluacions before and after the current puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param puestoEvaluacionPK the primary key of the current puesto evaluacion
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next puesto evaluacion
	 * @throws com.hitss.layer.NoSuchPuestoEvaluacionException if a puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PuestoEvaluacion[] findByS_ALL_PrevAndNext(
		PuestoEvaluacionPK puestoEvaluacionPK, long solicitudFuncionId,
		OrderByComparator orderByComparator)
		throws NoSuchPuestoEvaluacionException, SystemException {
		PuestoEvaluacion puestoEvaluacion = findByPrimaryKey(puestoEvaluacionPK);

		Session session = null;

		try {
			session = openSession();

			PuestoEvaluacion[] array = new PuestoEvaluacionImpl[3];

			array[0] = getByS_ALL_PrevAndNext(session, puestoEvaluacion,
					solicitudFuncionId, orderByComparator, true);

			array[1] = puestoEvaluacion;

			array[2] = getByS_ALL_PrevAndNext(session, puestoEvaluacion,
					solicitudFuncionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PuestoEvaluacion getByS_ALL_PrevAndNext(Session session,
		PuestoEvaluacion puestoEvaluacion, long solicitudFuncionId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PUESTOEVALUACION_WHERE);

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
			query.append(PuestoEvaluacionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(solicitudFuncionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(puestoEvaluacion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PuestoEvaluacion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the puesto evaluacions where solicitudFuncionId = &#63; from the database.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS_ALL(long solicitudFuncionId)
		throws SystemException {
		for (PuestoEvaluacion puestoEvaluacion : findByS_ALL(
				solicitudFuncionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(puestoEvaluacion);
		}
	}

	/**
	 * Returns the number of puesto evaluacions where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @return the number of matching puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS_ALL(long solicitudFuncionId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_ALL;

		Object[] finderArgs = new Object[] { solicitudFuncionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PUESTOEVALUACION_WHERE);

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

	private static final String _FINDER_COLUMN_S_ALL_SOLICITUDFUNCIONID_2 = "puestoEvaluacion.id.solicitudFuncionId = ?";

	public PuestoEvaluacionPersistenceImpl() {
		setModelClass(PuestoEvaluacion.class);
	}

	/**
	 * Caches the puesto evaluacion in the entity cache if it is enabled.
	 *
	 * @param puestoEvaluacion the puesto evaluacion
	 */
	@Override
	public void cacheResult(PuestoEvaluacion puestoEvaluacion) {
		EntityCacheUtil.putResult(PuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			PuestoEvaluacionImpl.class, puestoEvaluacion.getPrimaryKey(),
			puestoEvaluacion);

		puestoEvaluacion.resetOriginalValues();
	}

	/**
	 * Caches the puesto evaluacions in the entity cache if it is enabled.
	 *
	 * @param puestoEvaluacions the puesto evaluacions
	 */
	@Override
	public void cacheResult(List<PuestoEvaluacion> puestoEvaluacions) {
		for (PuestoEvaluacion puestoEvaluacion : puestoEvaluacions) {
			if (EntityCacheUtil.getResult(
						PuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
						PuestoEvaluacionImpl.class,
						puestoEvaluacion.getPrimaryKey()) == null) {
				cacheResult(puestoEvaluacion);
			}
			else {
				puestoEvaluacion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all puesto evaluacions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PuestoEvaluacionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PuestoEvaluacionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the puesto evaluacion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PuestoEvaluacion puestoEvaluacion) {
		EntityCacheUtil.removeResult(PuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			PuestoEvaluacionImpl.class, puestoEvaluacion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PuestoEvaluacion> puestoEvaluacions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PuestoEvaluacion puestoEvaluacion : puestoEvaluacions) {
			EntityCacheUtil.removeResult(PuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
				PuestoEvaluacionImpl.class, puestoEvaluacion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new puesto evaluacion with the primary key. Does not add the puesto evaluacion to the database.
	 *
	 * @param puestoEvaluacionPK the primary key for the new puesto evaluacion
	 * @return the new puesto evaluacion
	 */
	@Override
	public PuestoEvaluacion create(PuestoEvaluacionPK puestoEvaluacionPK) {
		PuestoEvaluacion puestoEvaluacion = new PuestoEvaluacionImpl();

		puestoEvaluacion.setNew(true);
		puestoEvaluacion.setPrimaryKey(puestoEvaluacionPK);

		return puestoEvaluacion;
	}

	/**
	 * Removes the puesto evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param puestoEvaluacionPK the primary key of the puesto evaluacion
	 * @return the puesto evaluacion that was removed
	 * @throws com.hitss.layer.NoSuchPuestoEvaluacionException if a puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PuestoEvaluacion remove(PuestoEvaluacionPK puestoEvaluacionPK)
		throws NoSuchPuestoEvaluacionException, SystemException {
		return remove((Serializable)puestoEvaluacionPK);
	}

	/**
	 * Removes the puesto evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the puesto evaluacion
	 * @return the puesto evaluacion that was removed
	 * @throws com.hitss.layer.NoSuchPuestoEvaluacionException if a puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PuestoEvaluacion remove(Serializable primaryKey)
		throws NoSuchPuestoEvaluacionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PuestoEvaluacion puestoEvaluacion = (PuestoEvaluacion)session.get(PuestoEvaluacionImpl.class,
					primaryKey);

			if (puestoEvaluacion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPuestoEvaluacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(puestoEvaluacion);
		}
		catch (NoSuchPuestoEvaluacionException nsee) {
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
	protected PuestoEvaluacion removeImpl(PuestoEvaluacion puestoEvaluacion)
		throws SystemException {
		puestoEvaluacion = toUnwrappedModel(puestoEvaluacion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(puestoEvaluacion)) {
				puestoEvaluacion = (PuestoEvaluacion)session.get(PuestoEvaluacionImpl.class,
						puestoEvaluacion.getPrimaryKeyObj());
			}

			if (puestoEvaluacion != null) {
				session.delete(puestoEvaluacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (puestoEvaluacion != null) {
			clearCache(puestoEvaluacion);
		}

		return puestoEvaluacion;
	}

	@Override
	public PuestoEvaluacion updateImpl(
		com.hitss.layer.model.PuestoEvaluacion puestoEvaluacion)
		throws SystemException {
		puestoEvaluacion = toUnwrappedModel(puestoEvaluacion);

		boolean isNew = puestoEvaluacion.isNew();

		PuestoEvaluacionModelImpl puestoEvaluacionModelImpl = (PuestoEvaluacionModelImpl)puestoEvaluacion;

		Session session = null;

		try {
			session = openSession();

			if (puestoEvaluacion.isNew()) {
				session.save(puestoEvaluacion);

				puestoEvaluacion.setNew(false);
			}
			else {
				session.merge(puestoEvaluacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PuestoEvaluacionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((puestoEvaluacionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_ALL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						puestoEvaluacionModelImpl.getOriginalSolicitudFuncionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_ALL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_ALL,
					args);

				args = new Object[] {
						puestoEvaluacionModelImpl.getSolicitudFuncionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_ALL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_ALL,
					args);
			}
		}

		EntityCacheUtil.putResult(PuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			PuestoEvaluacionImpl.class, puestoEvaluacion.getPrimaryKey(),
			puestoEvaluacion);

		return puestoEvaluacion;
	}

	protected PuestoEvaluacion toUnwrappedModel(
		PuestoEvaluacion puestoEvaluacion) {
		if (puestoEvaluacion instanceof PuestoEvaluacionImpl) {
			return puestoEvaluacion;
		}

		PuestoEvaluacionImpl puestoEvaluacionImpl = new PuestoEvaluacionImpl();

		puestoEvaluacionImpl.setNew(puestoEvaluacion.isNew());
		puestoEvaluacionImpl.setPrimaryKey(puestoEvaluacion.getPrimaryKey());

		puestoEvaluacionImpl.setSolicitudFuncionId(puestoEvaluacion.getSolicitudFuncionId());
		puestoEvaluacionImpl.setEvaluacionId(puestoEvaluacion.getEvaluacionId());
		puestoEvaluacionImpl.setRangoSuperior(puestoEvaluacion.getRangoSuperior());
		puestoEvaluacionImpl.setRangoInferior(puestoEvaluacion.getRangoInferior());

		return puestoEvaluacionImpl;
	}

	/**
	 * Returns the puesto evaluacion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the puesto evaluacion
	 * @return the puesto evaluacion
	 * @throws com.hitss.layer.NoSuchPuestoEvaluacionException if a puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PuestoEvaluacion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPuestoEvaluacionException, SystemException {
		PuestoEvaluacion puestoEvaluacion = fetchByPrimaryKey(primaryKey);

		if (puestoEvaluacion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPuestoEvaluacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return puestoEvaluacion;
	}

	/**
	 * Returns the puesto evaluacion with the primary key or throws a {@link com.hitss.layer.NoSuchPuestoEvaluacionException} if it could not be found.
	 *
	 * @param puestoEvaluacionPK the primary key of the puesto evaluacion
	 * @return the puesto evaluacion
	 * @throws com.hitss.layer.NoSuchPuestoEvaluacionException if a puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PuestoEvaluacion findByPrimaryKey(
		PuestoEvaluacionPK puestoEvaluacionPK)
		throws NoSuchPuestoEvaluacionException, SystemException {
		return findByPrimaryKey((Serializable)puestoEvaluacionPK);
	}

	/**
	 * Returns the puesto evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the puesto evaluacion
	 * @return the puesto evaluacion, or <code>null</code> if a puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PuestoEvaluacion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PuestoEvaluacion puestoEvaluacion = (PuestoEvaluacion)EntityCacheUtil.getResult(PuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
				PuestoEvaluacionImpl.class, primaryKey);

		if (puestoEvaluacion == _nullPuestoEvaluacion) {
			return null;
		}

		if (puestoEvaluacion == null) {
			Session session = null;

			try {
				session = openSession();

				puestoEvaluacion = (PuestoEvaluacion)session.get(PuestoEvaluacionImpl.class,
						primaryKey);

				if (puestoEvaluacion != null) {
					cacheResult(puestoEvaluacion);
				}
				else {
					EntityCacheUtil.putResult(PuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
						PuestoEvaluacionImpl.class, primaryKey,
						_nullPuestoEvaluacion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
					PuestoEvaluacionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return puestoEvaluacion;
	}

	/**
	 * Returns the puesto evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param puestoEvaluacionPK the primary key of the puesto evaluacion
	 * @return the puesto evaluacion, or <code>null</code> if a puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PuestoEvaluacion fetchByPrimaryKey(
		PuestoEvaluacionPK puestoEvaluacionPK) throws SystemException {
		return fetchByPrimaryKey((Serializable)puestoEvaluacionPK);
	}

	/**
	 * Returns all the puesto evaluacions.
	 *
	 * @return the puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PuestoEvaluacion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the puesto evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of puesto evaluacions
	 * @param end the upper bound of the range of puesto evaluacions (not inclusive)
	 * @return the range of puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PuestoEvaluacion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the puesto evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of puesto evaluacions
	 * @param end the upper bound of the range of puesto evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PuestoEvaluacion> findAll(int start, int end,
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

		List<PuestoEvaluacion> list = (List<PuestoEvaluacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PUESTOEVALUACION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PUESTOEVALUACION;

				if (pagination) {
					sql = sql.concat(PuestoEvaluacionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PuestoEvaluacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PuestoEvaluacion>(list);
				}
				else {
					list = (List<PuestoEvaluacion>)QueryUtil.list(q,
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
	 * Removes all the puesto evaluacions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PuestoEvaluacion puestoEvaluacion : findAll()) {
			remove(puestoEvaluacion);
		}
	}

	/**
	 * Returns the number of puesto evaluacions.
	 *
	 * @return the number of puesto evaluacions
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

				Query q = session.createQuery(_SQL_COUNT_PUESTOEVALUACION);

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
	 * Initializes the puesto evaluacion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.PuestoEvaluacion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PuestoEvaluacion>> listenersList = new ArrayList<ModelListener<PuestoEvaluacion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PuestoEvaluacion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PuestoEvaluacionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PUESTOEVALUACION = "SELECT puestoEvaluacion FROM PuestoEvaluacion puestoEvaluacion";
	private static final String _SQL_SELECT_PUESTOEVALUACION_WHERE = "SELECT puestoEvaluacion FROM PuestoEvaluacion puestoEvaluacion WHERE ";
	private static final String _SQL_COUNT_PUESTOEVALUACION = "SELECT COUNT(puestoEvaluacion) FROM PuestoEvaluacion puestoEvaluacion";
	private static final String _SQL_COUNT_PUESTOEVALUACION_WHERE = "SELECT COUNT(puestoEvaluacion) FROM PuestoEvaluacion puestoEvaluacion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "puestoEvaluacion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PuestoEvaluacion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PuestoEvaluacion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PuestoEvaluacionPersistenceImpl.class);
	private static PuestoEvaluacion _nullPuestoEvaluacion = new PuestoEvaluacionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PuestoEvaluacion> toCacheModel() {
				return _nullPuestoEvaluacionCacheModel;
			}
		};

	private static CacheModel<PuestoEvaluacion> _nullPuestoEvaluacionCacheModel = new CacheModel<PuestoEvaluacion>() {
			@Override
			public PuestoEvaluacion toEntityModel() {
				return _nullPuestoEvaluacion;
			}
		};
}
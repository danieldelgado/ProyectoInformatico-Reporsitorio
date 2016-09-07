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

import com.hitss.layer.NoSuchPrioridadGrupoUsuariosException;
import com.hitss.layer.model.PrioridadGrupoUsuarios;
import com.hitss.layer.model.impl.PrioridadGrupoUsuariosImpl;
import com.hitss.layer.model.impl.PrioridadGrupoUsuariosModelImpl;

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
 * The persistence implementation for the prioridad grupo usuarios service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PrioridadGrupoUsuariosPersistence
 * @see PrioridadGrupoUsuariosUtil
 * @generated
 */
public class PrioridadGrupoUsuariosPersistenceImpl extends BasePersistenceImpl<PrioridadGrupoUsuarios>
	implements PrioridadGrupoUsuariosPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PrioridadGrupoUsuariosUtil} to access the prioridad grupo usuarios persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PrioridadGrupoUsuariosImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PrioridadGrupoUsuariosModelImpl.ENTITY_CACHE_ENABLED,
			PrioridadGrupoUsuariosModelImpl.FINDER_CACHE_ENABLED,
			PrioridadGrupoUsuariosImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PrioridadGrupoUsuariosModelImpl.ENTITY_CACHE_ENABLED,
			PrioridadGrupoUsuariosModelImpl.FINDER_CACHE_ENABLED,
			PrioridadGrupoUsuariosImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PrioridadGrupoUsuariosModelImpl.ENTITY_CACHE_ENABLED,
			PrioridadGrupoUsuariosModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S = new FinderPath(PrioridadGrupoUsuariosModelImpl.ENTITY_CACHE_ENABLED,
			PrioridadGrupoUsuariosModelImpl.FINDER_CACHE_ENABLED,
			PrioridadGrupoUsuariosImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S = new FinderPath(PrioridadGrupoUsuariosModelImpl.ENTITY_CACHE_ENABLED,
			PrioridadGrupoUsuariosModelImpl.FINDER_CACHE_ENABLED,
			PrioridadGrupoUsuariosImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS",
			new String[] { Long.class.getName() },
			PrioridadGrupoUsuariosModelImpl.SOLICITUDEVALUACIONDESEMPENNOID_COLUMN_BITMASK |
			PrioridadGrupoUsuariosModelImpl.ORDEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S = new FinderPath(PrioridadGrupoUsuariosModelImpl.ENTITY_CACHE_ENABLED,
			PrioridadGrupoUsuariosModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the prioridad grupo usuarioses where solicitudEvaluacionDesempennoId = &#63;.
	 *
	 * @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	 * @return the matching prioridad grupo usuarioses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PrioridadGrupoUsuarios> findByS(
		long solicitudEvaluacionDesempennoId) throws SystemException {
		return findByS(solicitudEvaluacionDesempennoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the prioridad grupo usuarioses where solicitudEvaluacionDesempennoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PrioridadGrupoUsuariosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	 * @param start the lower bound of the range of prioridad grupo usuarioses
	 * @param end the upper bound of the range of prioridad grupo usuarioses (not inclusive)
	 * @return the range of matching prioridad grupo usuarioses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PrioridadGrupoUsuarios> findByS(
		long solicitudEvaluacionDesempennoId, int start, int end)
		throws SystemException {
		return findByS(solicitudEvaluacionDesempennoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the prioridad grupo usuarioses where solicitudEvaluacionDesempennoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PrioridadGrupoUsuariosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	 * @param start the lower bound of the range of prioridad grupo usuarioses
	 * @param end the upper bound of the range of prioridad grupo usuarioses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching prioridad grupo usuarioses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PrioridadGrupoUsuarios> findByS(
		long solicitudEvaluacionDesempennoId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S;
			finderArgs = new Object[] { solicitudEvaluacionDesempennoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S;
			finderArgs = new Object[] {
					solicitudEvaluacionDesempennoId,
					
					start, end, orderByComparator
				};
		}

		List<PrioridadGrupoUsuarios> list = (List<PrioridadGrupoUsuarios>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PrioridadGrupoUsuarios prioridadGrupoUsuarios : list) {
				if ((solicitudEvaluacionDesempennoId != prioridadGrupoUsuarios.getSolicitudEvaluacionDesempennoId())) {
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

			query.append(_SQL_SELECT_PRIORIDADGRUPOUSUARIOS_WHERE);

			query.append(_FINDER_COLUMN_S_SOLICITUDEVALUACIONDESEMPENNOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PrioridadGrupoUsuariosModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudEvaluacionDesempennoId);

				if (!pagination) {
					list = (List<PrioridadGrupoUsuarios>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PrioridadGrupoUsuarios>(list);
				}
				else {
					list = (List<PrioridadGrupoUsuarios>)QueryUtil.list(q,
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
	 * Returns the first prioridad grupo usuarios in the ordered set where solicitudEvaluacionDesempennoId = &#63;.
	 *
	 * @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching prioridad grupo usuarios
	 * @throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException if a matching prioridad grupo usuarios could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadGrupoUsuarios findByS_First(
		long solicitudEvaluacionDesempennoId,
		OrderByComparator orderByComparator)
		throws NoSuchPrioridadGrupoUsuariosException, SystemException {
		PrioridadGrupoUsuarios prioridadGrupoUsuarios = fetchByS_First(solicitudEvaluacionDesempennoId,
				orderByComparator);

		if (prioridadGrupoUsuarios != null) {
			return prioridadGrupoUsuarios;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudEvaluacionDesempennoId=");
		msg.append(solicitudEvaluacionDesempennoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPrioridadGrupoUsuariosException(msg.toString());
	}

	/**
	 * Returns the first prioridad grupo usuarios in the ordered set where solicitudEvaluacionDesempennoId = &#63;.
	 *
	 * @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching prioridad grupo usuarios, or <code>null</code> if a matching prioridad grupo usuarios could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadGrupoUsuarios fetchByS_First(
		long solicitudEvaluacionDesempennoId,
		OrderByComparator orderByComparator) throws SystemException {
		List<PrioridadGrupoUsuarios> list = findByS(solicitudEvaluacionDesempennoId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last prioridad grupo usuarios in the ordered set where solicitudEvaluacionDesempennoId = &#63;.
	 *
	 * @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching prioridad grupo usuarios
	 * @throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException if a matching prioridad grupo usuarios could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadGrupoUsuarios findByS_Last(
		long solicitudEvaluacionDesempennoId,
		OrderByComparator orderByComparator)
		throws NoSuchPrioridadGrupoUsuariosException, SystemException {
		PrioridadGrupoUsuarios prioridadGrupoUsuarios = fetchByS_Last(solicitudEvaluacionDesempennoId,
				orderByComparator);

		if (prioridadGrupoUsuarios != null) {
			return prioridadGrupoUsuarios;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudEvaluacionDesempennoId=");
		msg.append(solicitudEvaluacionDesempennoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPrioridadGrupoUsuariosException(msg.toString());
	}

	/**
	 * Returns the last prioridad grupo usuarios in the ordered set where solicitudEvaluacionDesempennoId = &#63;.
	 *
	 * @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching prioridad grupo usuarios, or <code>null</code> if a matching prioridad grupo usuarios could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadGrupoUsuarios fetchByS_Last(
		long solicitudEvaluacionDesempennoId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByS(solicitudEvaluacionDesempennoId);

		if (count == 0) {
			return null;
		}

		List<PrioridadGrupoUsuarios> list = findByS(solicitudEvaluacionDesempennoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the prioridad grupo usuarioses before and after the current prioridad grupo usuarios in the ordered set where solicitudEvaluacionDesempennoId = &#63;.
	 *
	 * @param prioridadGrupoUsuariosId the primary key of the current prioridad grupo usuarios
	 * @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next prioridad grupo usuarios
	 * @throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException if a prioridad grupo usuarios with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadGrupoUsuarios[] findByS_PrevAndNext(
		long prioridadGrupoUsuariosId, long solicitudEvaluacionDesempennoId,
		OrderByComparator orderByComparator)
		throws NoSuchPrioridadGrupoUsuariosException, SystemException {
		PrioridadGrupoUsuarios prioridadGrupoUsuarios = findByPrimaryKey(prioridadGrupoUsuariosId);

		Session session = null;

		try {
			session = openSession();

			PrioridadGrupoUsuarios[] array = new PrioridadGrupoUsuariosImpl[3];

			array[0] = getByS_PrevAndNext(session, prioridadGrupoUsuarios,
					solicitudEvaluacionDesempennoId, orderByComparator, true);

			array[1] = prioridadGrupoUsuarios;

			array[2] = getByS_PrevAndNext(session, prioridadGrupoUsuarios,
					solicitudEvaluacionDesempennoId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PrioridadGrupoUsuarios getByS_PrevAndNext(Session session,
		PrioridadGrupoUsuarios prioridadGrupoUsuarios,
		long solicitudEvaluacionDesempennoId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRIORIDADGRUPOUSUARIOS_WHERE);

		query.append(_FINDER_COLUMN_S_SOLICITUDEVALUACIONDESEMPENNOID_2);

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
			query.append(PrioridadGrupoUsuariosModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(solicitudEvaluacionDesempennoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(prioridadGrupoUsuarios);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PrioridadGrupoUsuarios> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the prioridad grupo usuarioses where solicitudEvaluacionDesempennoId = &#63; from the database.
	 *
	 * @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS(long solicitudEvaluacionDesempennoId)
		throws SystemException {
		for (PrioridadGrupoUsuarios prioridadGrupoUsuarios : findByS(
				solicitudEvaluacionDesempennoId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(prioridadGrupoUsuarios);
		}
	}

	/**
	 * Returns the number of prioridad grupo usuarioses where solicitudEvaluacionDesempennoId = &#63;.
	 *
	 * @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	 * @return the number of matching prioridad grupo usuarioses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS(long solicitudEvaluacionDesempennoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S;

		Object[] finderArgs = new Object[] { solicitudEvaluacionDesempennoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRIORIDADGRUPOUSUARIOS_WHERE);

			query.append(_FINDER_COLUMN_S_SOLICITUDEVALUACIONDESEMPENNOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudEvaluacionDesempennoId);

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

	private static final String _FINDER_COLUMN_S_SOLICITUDEVALUACIONDESEMPENNOID_2 =
		"prioridadGrupoUsuarios.solicitudEvaluacionDesempennoId = ? AND prioridadGrupoUsuarios.activo=true";

	public PrioridadGrupoUsuariosPersistenceImpl() {
		setModelClass(PrioridadGrupoUsuarios.class);
	}

	/**
	 * Caches the prioridad grupo usuarios in the entity cache if it is enabled.
	 *
	 * @param prioridadGrupoUsuarios the prioridad grupo usuarios
	 */
	@Override
	public void cacheResult(PrioridadGrupoUsuarios prioridadGrupoUsuarios) {
		EntityCacheUtil.putResult(PrioridadGrupoUsuariosModelImpl.ENTITY_CACHE_ENABLED,
			PrioridadGrupoUsuariosImpl.class,
			prioridadGrupoUsuarios.getPrimaryKey(), prioridadGrupoUsuarios);

		prioridadGrupoUsuarios.resetOriginalValues();
	}

	/**
	 * Caches the prioridad grupo usuarioses in the entity cache if it is enabled.
	 *
	 * @param prioridadGrupoUsuarioses the prioridad grupo usuarioses
	 */
	@Override
	public void cacheResult(
		List<PrioridadGrupoUsuarios> prioridadGrupoUsuarioses) {
		for (PrioridadGrupoUsuarios prioridadGrupoUsuarios : prioridadGrupoUsuarioses) {
			if (EntityCacheUtil.getResult(
						PrioridadGrupoUsuariosModelImpl.ENTITY_CACHE_ENABLED,
						PrioridadGrupoUsuariosImpl.class,
						prioridadGrupoUsuarios.getPrimaryKey()) == null) {
				cacheResult(prioridadGrupoUsuarios);
			}
			else {
				prioridadGrupoUsuarios.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all prioridad grupo usuarioses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PrioridadGrupoUsuariosImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PrioridadGrupoUsuariosImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the prioridad grupo usuarios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PrioridadGrupoUsuarios prioridadGrupoUsuarios) {
		EntityCacheUtil.removeResult(PrioridadGrupoUsuariosModelImpl.ENTITY_CACHE_ENABLED,
			PrioridadGrupoUsuariosImpl.class,
			prioridadGrupoUsuarios.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<PrioridadGrupoUsuarios> prioridadGrupoUsuarioses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PrioridadGrupoUsuarios prioridadGrupoUsuarios : prioridadGrupoUsuarioses) {
			EntityCacheUtil.removeResult(PrioridadGrupoUsuariosModelImpl.ENTITY_CACHE_ENABLED,
				PrioridadGrupoUsuariosImpl.class,
				prioridadGrupoUsuarios.getPrimaryKey());
		}
	}

	/**
	 * Creates a new prioridad grupo usuarios with the primary key. Does not add the prioridad grupo usuarios to the database.
	 *
	 * @param prioridadGrupoUsuariosId the primary key for the new prioridad grupo usuarios
	 * @return the new prioridad grupo usuarios
	 */
	@Override
	public PrioridadGrupoUsuarios create(long prioridadGrupoUsuariosId) {
		PrioridadGrupoUsuarios prioridadGrupoUsuarios = new PrioridadGrupoUsuariosImpl();

		prioridadGrupoUsuarios.setNew(true);
		prioridadGrupoUsuarios.setPrimaryKey(prioridadGrupoUsuariosId);

		return prioridadGrupoUsuarios;
	}

	/**
	 * Removes the prioridad grupo usuarios with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param prioridadGrupoUsuariosId the primary key of the prioridad grupo usuarios
	 * @return the prioridad grupo usuarios that was removed
	 * @throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException if a prioridad grupo usuarios with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadGrupoUsuarios remove(long prioridadGrupoUsuariosId)
		throws NoSuchPrioridadGrupoUsuariosException, SystemException {
		return remove((Serializable)prioridadGrupoUsuariosId);
	}

	/**
	 * Removes the prioridad grupo usuarios with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the prioridad grupo usuarios
	 * @return the prioridad grupo usuarios that was removed
	 * @throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException if a prioridad grupo usuarios with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadGrupoUsuarios remove(Serializable primaryKey)
		throws NoSuchPrioridadGrupoUsuariosException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PrioridadGrupoUsuarios prioridadGrupoUsuarios = (PrioridadGrupoUsuarios)session.get(PrioridadGrupoUsuariosImpl.class,
					primaryKey);

			if (prioridadGrupoUsuarios == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPrioridadGrupoUsuariosException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(prioridadGrupoUsuarios);
		}
		catch (NoSuchPrioridadGrupoUsuariosException nsee) {
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
	protected PrioridadGrupoUsuarios removeImpl(
		PrioridadGrupoUsuarios prioridadGrupoUsuarios)
		throws SystemException {
		prioridadGrupoUsuarios = toUnwrappedModel(prioridadGrupoUsuarios);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(prioridadGrupoUsuarios)) {
				prioridadGrupoUsuarios = (PrioridadGrupoUsuarios)session.get(PrioridadGrupoUsuariosImpl.class,
						prioridadGrupoUsuarios.getPrimaryKeyObj());
			}

			if (prioridadGrupoUsuarios != null) {
				session.delete(prioridadGrupoUsuarios);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (prioridadGrupoUsuarios != null) {
			clearCache(prioridadGrupoUsuarios);
		}

		return prioridadGrupoUsuarios;
	}

	@Override
	public PrioridadGrupoUsuarios updateImpl(
		com.hitss.layer.model.PrioridadGrupoUsuarios prioridadGrupoUsuarios)
		throws SystemException {
		prioridadGrupoUsuarios = toUnwrappedModel(prioridadGrupoUsuarios);

		boolean isNew = prioridadGrupoUsuarios.isNew();

		PrioridadGrupoUsuariosModelImpl prioridadGrupoUsuariosModelImpl = (PrioridadGrupoUsuariosModelImpl)prioridadGrupoUsuarios;

		Session session = null;

		try {
			session = openSession();

			if (prioridadGrupoUsuarios.isNew()) {
				session.save(prioridadGrupoUsuarios);

				prioridadGrupoUsuarios.setNew(false);
			}
			else {
				session.merge(prioridadGrupoUsuarios);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PrioridadGrupoUsuariosModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((prioridadGrupoUsuariosModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						prioridadGrupoUsuariosModelImpl.getOriginalSolicitudEvaluacionDesempennoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S,
					args);

				args = new Object[] {
						prioridadGrupoUsuariosModelImpl.getSolicitudEvaluacionDesempennoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S,
					args);
			}
		}

		EntityCacheUtil.putResult(PrioridadGrupoUsuariosModelImpl.ENTITY_CACHE_ENABLED,
			PrioridadGrupoUsuariosImpl.class,
			prioridadGrupoUsuarios.getPrimaryKey(), prioridadGrupoUsuarios);

		return prioridadGrupoUsuarios;
	}

	protected PrioridadGrupoUsuarios toUnwrappedModel(
		PrioridadGrupoUsuarios prioridadGrupoUsuarios) {
		if (prioridadGrupoUsuarios instanceof PrioridadGrupoUsuariosImpl) {
			return prioridadGrupoUsuarios;
		}

		PrioridadGrupoUsuariosImpl prioridadGrupoUsuariosImpl = new PrioridadGrupoUsuariosImpl();

		prioridadGrupoUsuariosImpl.setNew(prioridadGrupoUsuarios.isNew());
		prioridadGrupoUsuariosImpl.setPrimaryKey(prioridadGrupoUsuarios.getPrimaryKey());

		prioridadGrupoUsuariosImpl.setPrioridadGrupoUsuariosId(prioridadGrupoUsuarios.getPrioridadGrupoUsuariosId());
		prioridadGrupoUsuariosImpl.setSolicitudEvaluacionDesempennoId(prioridadGrupoUsuarios.getSolicitudEvaluacionDesempennoId());
		prioridadGrupoUsuariosImpl.setLiderGrupo(prioridadGrupoUsuarios.getLiderGrupo());
		prioridadGrupoUsuariosImpl.setGerenteArea(prioridadGrupoUsuarios.getGerenteArea());
		prioridadGrupoUsuariosImpl.setGrupoUsuario(prioridadGrupoUsuarios.getGrupoUsuario());
		prioridadGrupoUsuariosImpl.setOrden(prioridadGrupoUsuarios.getOrden());
		prioridadGrupoUsuariosImpl.setActivo(prioridadGrupoUsuarios.isActivo());
		prioridadGrupoUsuariosImpl.setUsuariocrea(prioridadGrupoUsuarios.getUsuariocrea());
		prioridadGrupoUsuariosImpl.setFechacrea(prioridadGrupoUsuarios.getFechacrea());
		prioridadGrupoUsuariosImpl.setUsuariomodifica(prioridadGrupoUsuarios.getUsuariomodifica());
		prioridadGrupoUsuariosImpl.setFechamodifica(prioridadGrupoUsuarios.getFechamodifica());

		return prioridadGrupoUsuariosImpl;
	}

	/**
	 * Returns the prioridad grupo usuarios with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the prioridad grupo usuarios
	 * @return the prioridad grupo usuarios
	 * @throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException if a prioridad grupo usuarios with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadGrupoUsuarios findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPrioridadGrupoUsuariosException, SystemException {
		PrioridadGrupoUsuarios prioridadGrupoUsuarios = fetchByPrimaryKey(primaryKey);

		if (prioridadGrupoUsuarios == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPrioridadGrupoUsuariosException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return prioridadGrupoUsuarios;
	}

	/**
	 * Returns the prioridad grupo usuarios with the primary key or throws a {@link com.hitss.layer.NoSuchPrioridadGrupoUsuariosException} if it could not be found.
	 *
	 * @param prioridadGrupoUsuariosId the primary key of the prioridad grupo usuarios
	 * @return the prioridad grupo usuarios
	 * @throws com.hitss.layer.NoSuchPrioridadGrupoUsuariosException if a prioridad grupo usuarios with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadGrupoUsuarios findByPrimaryKey(
		long prioridadGrupoUsuariosId)
		throws NoSuchPrioridadGrupoUsuariosException, SystemException {
		return findByPrimaryKey((Serializable)prioridadGrupoUsuariosId);
	}

	/**
	 * Returns the prioridad grupo usuarios with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the prioridad grupo usuarios
	 * @return the prioridad grupo usuarios, or <code>null</code> if a prioridad grupo usuarios with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadGrupoUsuarios fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PrioridadGrupoUsuarios prioridadGrupoUsuarios = (PrioridadGrupoUsuarios)EntityCacheUtil.getResult(PrioridadGrupoUsuariosModelImpl.ENTITY_CACHE_ENABLED,
				PrioridadGrupoUsuariosImpl.class, primaryKey);

		if (prioridadGrupoUsuarios == _nullPrioridadGrupoUsuarios) {
			return null;
		}

		if (prioridadGrupoUsuarios == null) {
			Session session = null;

			try {
				session = openSession();

				prioridadGrupoUsuarios = (PrioridadGrupoUsuarios)session.get(PrioridadGrupoUsuariosImpl.class,
						primaryKey);

				if (prioridadGrupoUsuarios != null) {
					cacheResult(prioridadGrupoUsuarios);
				}
				else {
					EntityCacheUtil.putResult(PrioridadGrupoUsuariosModelImpl.ENTITY_CACHE_ENABLED,
						PrioridadGrupoUsuariosImpl.class, primaryKey,
						_nullPrioridadGrupoUsuarios);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PrioridadGrupoUsuariosModelImpl.ENTITY_CACHE_ENABLED,
					PrioridadGrupoUsuariosImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return prioridadGrupoUsuarios;
	}

	/**
	 * Returns the prioridad grupo usuarios with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param prioridadGrupoUsuariosId the primary key of the prioridad grupo usuarios
	 * @return the prioridad grupo usuarios, or <code>null</code> if a prioridad grupo usuarios with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadGrupoUsuarios fetchByPrimaryKey(
		long prioridadGrupoUsuariosId) throws SystemException {
		return fetchByPrimaryKey((Serializable)prioridadGrupoUsuariosId);
	}

	/**
	 * Returns all the prioridad grupo usuarioses.
	 *
	 * @return the prioridad grupo usuarioses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PrioridadGrupoUsuarios> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the prioridad grupo usuarioses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PrioridadGrupoUsuariosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prioridad grupo usuarioses
	 * @param end the upper bound of the range of prioridad grupo usuarioses (not inclusive)
	 * @return the range of prioridad grupo usuarioses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PrioridadGrupoUsuarios> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the prioridad grupo usuarioses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PrioridadGrupoUsuariosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prioridad grupo usuarioses
	 * @param end the upper bound of the range of prioridad grupo usuarioses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of prioridad grupo usuarioses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PrioridadGrupoUsuarios> findAll(int start, int end,
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

		List<PrioridadGrupoUsuarios> list = (List<PrioridadGrupoUsuarios>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PRIORIDADGRUPOUSUARIOS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRIORIDADGRUPOUSUARIOS;

				if (pagination) {
					sql = sql.concat(PrioridadGrupoUsuariosModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PrioridadGrupoUsuarios>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PrioridadGrupoUsuarios>(list);
				}
				else {
					list = (List<PrioridadGrupoUsuarios>)QueryUtil.list(q,
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
	 * Removes all the prioridad grupo usuarioses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PrioridadGrupoUsuarios prioridadGrupoUsuarios : findAll()) {
			remove(prioridadGrupoUsuarios);
		}
	}

	/**
	 * Returns the number of prioridad grupo usuarioses.
	 *
	 * @return the number of prioridad grupo usuarioses
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

				Query q = session.createQuery(_SQL_COUNT_PRIORIDADGRUPOUSUARIOS);

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
	 * Initializes the prioridad grupo usuarios persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.PrioridadGrupoUsuarios")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PrioridadGrupoUsuarios>> listenersList = new ArrayList<ModelListener<PrioridadGrupoUsuarios>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PrioridadGrupoUsuarios>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PrioridadGrupoUsuariosImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PRIORIDADGRUPOUSUARIOS = "SELECT prioridadGrupoUsuarios FROM PrioridadGrupoUsuarios prioridadGrupoUsuarios";
	private static final String _SQL_SELECT_PRIORIDADGRUPOUSUARIOS_WHERE = "SELECT prioridadGrupoUsuarios FROM PrioridadGrupoUsuarios prioridadGrupoUsuarios WHERE ";
	private static final String _SQL_COUNT_PRIORIDADGRUPOUSUARIOS = "SELECT COUNT(prioridadGrupoUsuarios) FROM PrioridadGrupoUsuarios prioridadGrupoUsuarios";
	private static final String _SQL_COUNT_PRIORIDADGRUPOUSUARIOS_WHERE = "SELECT COUNT(prioridadGrupoUsuarios) FROM PrioridadGrupoUsuarios prioridadGrupoUsuarios WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "prioridadGrupoUsuarios.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PrioridadGrupoUsuarios exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PrioridadGrupoUsuarios exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PrioridadGrupoUsuariosPersistenceImpl.class);
	private static PrioridadGrupoUsuarios _nullPrioridadGrupoUsuarios = new PrioridadGrupoUsuariosImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PrioridadGrupoUsuarios> toCacheModel() {
				return _nullPrioridadGrupoUsuariosCacheModel;
			}
		};

	private static CacheModel<PrioridadGrupoUsuarios> _nullPrioridadGrupoUsuariosCacheModel =
		new CacheModel<PrioridadGrupoUsuarios>() {
			@Override
			public PrioridadGrupoUsuarios toEntityModel() {
				return _nullPrioridadGrupoUsuarios;
			}
		};
}
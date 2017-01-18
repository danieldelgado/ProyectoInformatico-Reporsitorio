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

import com.hitss.layer.NoSuchExperienciaException;
import com.hitss.layer.model.Experiencia;
import com.hitss.layer.model.impl.ExperienciaImpl;
import com.hitss.layer.model.impl.ExperienciaModelImpl;

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
 * The persistence implementation for the experiencia service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see ExperienciaPersistence
 * @see ExperienciaUtil
 * @generated
 */
public class ExperienciaPersistenceImpl extends BasePersistenceImpl<Experiencia>
	implements ExperienciaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ExperienciaUtil} to access the experiencia persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ExperienciaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
			ExperienciaModelImpl.FINDER_CACHE_ENABLED, ExperienciaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
			ExperienciaModelImpl.FINDER_CACHE_ENABLED, ExperienciaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
			ExperienciaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_U = new FinderPath(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
			ExperienciaModelImpl.FINDER_CACHE_ENABLED, ExperienciaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByU",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U = new FinderPath(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
			ExperienciaModelImpl.FINDER_CACHE_ENABLED, ExperienciaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByU",
			new String[] { Long.class.getName() },
			ExperienciaModelImpl.USUARIOID_COLUMN_BITMASK |
			ExperienciaModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U = new FinderPath(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
			ExperienciaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the experiencias where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @return the matching experiencias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Experiencia> findByU(long usuarioId) throws SystemException {
		return findByU(usuarioId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the experiencias where usuarioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ExperienciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param usuarioId the usuario ID
	 * @param start the lower bound of the range of experiencias
	 * @param end the upper bound of the range of experiencias (not inclusive)
	 * @return the range of matching experiencias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Experiencia> findByU(long usuarioId, int start, int end)
		throws SystemException {
		return findByU(usuarioId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the experiencias where usuarioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ExperienciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param usuarioId the usuario ID
	 * @param start the lower bound of the range of experiencias
	 * @param end the upper bound of the range of experiencias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching experiencias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Experiencia> findByU(long usuarioId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U;
			finderArgs = new Object[] { usuarioId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_U;
			finderArgs = new Object[] { usuarioId, start, end, orderByComparator };
		}

		List<Experiencia> list = (List<Experiencia>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Experiencia experiencia : list) {
				if ((usuarioId != experiencia.getUsuarioId())) {
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

			query.append(_SQL_SELECT_EXPERIENCIA_WHERE);

			query.append(_FINDER_COLUMN_U_USUARIOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ExperienciaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(usuarioId);

				if (!pagination) {
					list = (List<Experiencia>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Experiencia>(list);
				}
				else {
					list = (List<Experiencia>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first experiencia in the ordered set where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching experiencia
	 * @throws com.hitss.layer.NoSuchExperienciaException if a matching experiencia could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia findByU_First(long usuarioId,
		OrderByComparator orderByComparator)
		throws NoSuchExperienciaException, SystemException {
		Experiencia experiencia = fetchByU_First(usuarioId, orderByComparator);

		if (experiencia != null) {
			return experiencia;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("usuarioId=");
		msg.append(usuarioId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchExperienciaException(msg.toString());
	}

	/**
	 * Returns the first experiencia in the ordered set where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching experiencia, or <code>null</code> if a matching experiencia could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia fetchByU_First(long usuarioId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Experiencia> list = findByU(usuarioId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last experiencia in the ordered set where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching experiencia
	 * @throws com.hitss.layer.NoSuchExperienciaException if a matching experiencia could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia findByU_Last(long usuarioId,
		OrderByComparator orderByComparator)
		throws NoSuchExperienciaException, SystemException {
		Experiencia experiencia = fetchByU_Last(usuarioId, orderByComparator);

		if (experiencia != null) {
			return experiencia;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("usuarioId=");
		msg.append(usuarioId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchExperienciaException(msg.toString());
	}

	/**
	 * Returns the last experiencia in the ordered set where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching experiencia, or <code>null</code> if a matching experiencia could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia fetchByU_Last(long usuarioId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByU(usuarioId);

		if (count == 0) {
			return null;
		}

		List<Experiencia> list = findByU(usuarioId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the experiencias before and after the current experiencia in the ordered set where usuarioId = &#63;.
	 *
	 * @param experienciaPK the primary key of the current experiencia
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next experiencia
	 * @throws com.hitss.layer.NoSuchExperienciaException if a experiencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia[] findByU_PrevAndNext(ExperienciaPK experienciaPK,
		long usuarioId, OrderByComparator orderByComparator)
		throws NoSuchExperienciaException, SystemException {
		Experiencia experiencia = findByPrimaryKey(experienciaPK);

		Session session = null;

		try {
			session = openSession();

			Experiencia[] array = new ExperienciaImpl[3];

			array[0] = getByU_PrevAndNext(session, experiencia, usuarioId,
					orderByComparator, true);

			array[1] = experiencia;

			array[2] = getByU_PrevAndNext(session, experiencia, usuarioId,
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

	protected Experiencia getByU_PrevAndNext(Session session,
		Experiencia experiencia, long usuarioId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EXPERIENCIA_WHERE);

		query.append(_FINDER_COLUMN_U_USUARIOID_2);

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
			query.append(ExperienciaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(usuarioId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(experiencia);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Experiencia> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the experiencias where usuarioId = &#63; from the database.
	 *
	 * @param usuarioId the usuario ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByU(long usuarioId) throws SystemException {
		for (Experiencia experiencia : findByU(usuarioId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(experiencia);
		}
	}

	/**
	 * Returns the number of experiencias where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @return the number of matching experiencias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByU(long usuarioId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_U;

		Object[] finderArgs = new Object[] { usuarioId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EXPERIENCIA_WHERE);

			query.append(_FINDER_COLUMN_U_USUARIOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_U_USUARIOID_2 = "experiencia.id.usuarioId = ? AND experiencia.activo=true";

	public ExperienciaPersistenceImpl() {
		setModelClass(Experiencia.class);
	}

	/**
	 * Caches the experiencia in the entity cache if it is enabled.
	 *
	 * @param experiencia the experiencia
	 */
	@Override
	public void cacheResult(Experiencia experiencia) {
		EntityCacheUtil.putResult(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
			ExperienciaImpl.class, experiencia.getPrimaryKey(), experiencia);

		experiencia.resetOriginalValues();
	}

	/**
	 * Caches the experiencias in the entity cache if it is enabled.
	 *
	 * @param experiencias the experiencias
	 */
	@Override
	public void cacheResult(List<Experiencia> experiencias) {
		for (Experiencia experiencia : experiencias) {
			if (EntityCacheUtil.getResult(
						ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
						ExperienciaImpl.class, experiencia.getPrimaryKey()) == null) {
				cacheResult(experiencia);
			}
			else {
				experiencia.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all experiencias.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ExperienciaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ExperienciaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the experiencia.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Experiencia experiencia) {
		EntityCacheUtil.removeResult(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
			ExperienciaImpl.class, experiencia.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Experiencia> experiencias) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Experiencia experiencia : experiencias) {
			EntityCacheUtil.removeResult(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
				ExperienciaImpl.class, experiencia.getPrimaryKey());
		}
	}

	/**
	 * Creates a new experiencia with the primary key. Does not add the experiencia to the database.
	 *
	 * @param experienciaPK the primary key for the new experiencia
	 * @return the new experiencia
	 */
	@Override
	public Experiencia create(ExperienciaPK experienciaPK) {
		Experiencia experiencia = new ExperienciaImpl();

		experiencia.setNew(true);
		experiencia.setPrimaryKey(experienciaPK);

		return experiencia;
	}

	/**
	 * Removes the experiencia with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param experienciaPK the primary key of the experiencia
	 * @return the experiencia that was removed
	 * @throws com.hitss.layer.NoSuchExperienciaException if a experiencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia remove(ExperienciaPK experienciaPK)
		throws NoSuchExperienciaException, SystemException {
		return remove((Serializable)experienciaPK);
	}

	/**
	 * Removes the experiencia with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the experiencia
	 * @return the experiencia that was removed
	 * @throws com.hitss.layer.NoSuchExperienciaException if a experiencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia remove(Serializable primaryKey)
		throws NoSuchExperienciaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Experiencia experiencia = (Experiencia)session.get(ExperienciaImpl.class,
					primaryKey);

			if (experiencia == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExperienciaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(experiencia);
		}
		catch (NoSuchExperienciaException nsee) {
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
	protected Experiencia removeImpl(Experiencia experiencia)
		throws SystemException {
		experiencia = toUnwrappedModel(experiencia);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(experiencia)) {
				experiencia = (Experiencia)session.get(ExperienciaImpl.class,
						experiencia.getPrimaryKeyObj());
			}

			if (experiencia != null) {
				session.delete(experiencia);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (experiencia != null) {
			clearCache(experiencia);
		}

		return experiencia;
	}

	@Override
	public Experiencia updateImpl(com.hitss.layer.model.Experiencia experiencia)
		throws SystemException {
		experiencia = toUnwrappedModel(experiencia);

		boolean isNew = experiencia.isNew();

		ExperienciaModelImpl experienciaModelImpl = (ExperienciaModelImpl)experiencia;

		Session session = null;

		try {
			session = openSession();

			if (experiencia.isNew()) {
				session.save(experiencia);

				experiencia.setNew(false);
			}
			else {
				session.merge(experiencia);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ExperienciaModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((experienciaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						experienciaModelImpl.getOriginalUsuarioId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U,
					args);

				args = new Object[] { experienciaModelImpl.getUsuarioId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U,
					args);
			}
		}

		EntityCacheUtil.putResult(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
			ExperienciaImpl.class, experiencia.getPrimaryKey(), experiencia);

		return experiencia;
	}

	protected Experiencia toUnwrappedModel(Experiencia experiencia) {
		if (experiencia instanceof ExperienciaImpl) {
			return experiencia;
		}

		ExperienciaImpl experienciaImpl = new ExperienciaImpl();

		experienciaImpl.setNew(experiencia.isNew());
		experienciaImpl.setPrimaryKey(experiencia.getPrimaryKey());

		experienciaImpl.setExperienciaId(experiencia.getExperienciaId());
		experienciaImpl.setUsuarioId(experiencia.getUsuarioId());
		experienciaImpl.setDescripcion(experiencia.getDescripcion());
		experienciaImpl.setEmpresa(experiencia.getEmpresa());
		experienciaImpl.setTipoNegocio(experiencia.getTipoNegocio());
		experienciaImpl.setProyecto(experiencia.getProyecto());
		experienciaImpl.setFechaInicio(experiencia.getFechaInicio());
		experienciaImpl.setFechaFin(experiencia.getFechaFin());
		experienciaImpl.setActivo(experiencia.isActivo());
		experienciaImpl.setUsuariocrea(experiencia.getUsuariocrea());
		experienciaImpl.setFechacrea(experiencia.getFechacrea());
		experienciaImpl.setUsuariomodifica(experiencia.getUsuariomodifica());
		experienciaImpl.setFechamodifica(experiencia.getFechamodifica());

		return experienciaImpl;
	}

	/**
	 * Returns the experiencia with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the experiencia
	 * @return the experiencia
	 * @throws com.hitss.layer.NoSuchExperienciaException if a experiencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExperienciaException, SystemException {
		Experiencia experiencia = fetchByPrimaryKey(primaryKey);

		if (experiencia == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExperienciaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return experiencia;
	}

	/**
	 * Returns the experiencia with the primary key or throws a {@link com.hitss.layer.NoSuchExperienciaException} if it could not be found.
	 *
	 * @param experienciaPK the primary key of the experiencia
	 * @return the experiencia
	 * @throws com.hitss.layer.NoSuchExperienciaException if a experiencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia findByPrimaryKey(ExperienciaPK experienciaPK)
		throws NoSuchExperienciaException, SystemException {
		return findByPrimaryKey((Serializable)experienciaPK);
	}

	/**
	 * Returns the experiencia with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the experiencia
	 * @return the experiencia, or <code>null</code> if a experiencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Experiencia experiencia = (Experiencia)EntityCacheUtil.getResult(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
				ExperienciaImpl.class, primaryKey);

		if (experiencia == _nullExperiencia) {
			return null;
		}

		if (experiencia == null) {
			Session session = null;

			try {
				session = openSession();

				experiencia = (Experiencia)session.get(ExperienciaImpl.class,
						primaryKey);

				if (experiencia != null) {
					cacheResult(experiencia);
				}
				else {
					EntityCacheUtil.putResult(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
						ExperienciaImpl.class, primaryKey, _nullExperiencia);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
					ExperienciaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return experiencia;
	}

	/**
	 * Returns the experiencia with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param experienciaPK the primary key of the experiencia
	 * @return the experiencia, or <code>null</code> if a experiencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia fetchByPrimaryKey(ExperienciaPK experienciaPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)experienciaPK);
	}

	/**
	 * Returns all the experiencias.
	 *
	 * @return the experiencias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Experiencia> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the experiencias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ExperienciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of experiencias
	 * @param end the upper bound of the range of experiencias (not inclusive)
	 * @return the range of experiencias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Experiencia> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the experiencias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ExperienciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of experiencias
	 * @param end the upper bound of the range of experiencias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of experiencias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Experiencia> findAll(int start, int end,
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

		List<Experiencia> list = (List<Experiencia>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EXPERIENCIA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EXPERIENCIA;

				if (pagination) {
					sql = sql.concat(ExperienciaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Experiencia>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Experiencia>(list);
				}
				else {
					list = (List<Experiencia>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the experiencias from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Experiencia experiencia : findAll()) {
			remove(experiencia);
		}
	}

	/**
	 * Returns the number of experiencias.
	 *
	 * @return the number of experiencias
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

				Query q = session.createQuery(_SQL_COUNT_EXPERIENCIA);

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
	 * Initializes the experiencia persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.Experiencia")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Experiencia>> listenersList = new ArrayList<ModelListener<Experiencia>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Experiencia>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ExperienciaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EXPERIENCIA = "SELECT experiencia FROM Experiencia experiencia";
	private static final String _SQL_SELECT_EXPERIENCIA_WHERE = "SELECT experiencia FROM Experiencia experiencia WHERE ";
	private static final String _SQL_COUNT_EXPERIENCIA = "SELECT COUNT(experiencia) FROM Experiencia experiencia";
	private static final String _SQL_COUNT_EXPERIENCIA_WHERE = "SELECT COUNT(experiencia) FROM Experiencia experiencia WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "experiencia.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Experiencia exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Experiencia exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ExperienciaPersistenceImpl.class);
	private static Experiencia _nullExperiencia = new ExperienciaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Experiencia> toCacheModel() {
				return _nullExperienciaCacheModel;
			}
		};

	private static CacheModel<Experiencia> _nullExperienciaCacheModel = new CacheModel<Experiencia>() {
			@Override
			public Experiencia toEntityModel() {
				return _nullExperiencia;
			}
		};
}
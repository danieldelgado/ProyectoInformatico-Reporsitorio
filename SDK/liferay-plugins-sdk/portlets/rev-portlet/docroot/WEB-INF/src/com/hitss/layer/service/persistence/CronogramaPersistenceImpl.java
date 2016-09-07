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

import com.hitss.layer.NoSuchCronogramaException;
import com.hitss.layer.model.Cronograma;
import com.hitss.layer.model.impl.CronogramaImpl;
import com.hitss.layer.model.impl.CronogramaModelImpl;

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
 * The persistence implementation for the cronograma service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see CronogramaPersistence
 * @see CronogramaUtil
 * @generated
 */
public class CronogramaPersistenceImpl extends BasePersistenceImpl<Cronograma>
	implements CronogramaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CronogramaUtil} to access the cronograma persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CronogramaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CronogramaModelImpl.ENTITY_CACHE_ENABLED,
			CronogramaModelImpl.FINDER_CACHE_ENABLED, CronogramaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CronogramaModelImpl.ENTITY_CACHE_ENABLED,
			CronogramaModelImpl.FINDER_CACHE_ENABLED, CronogramaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CronogramaModelImpl.ENTITY_CACHE_ENABLED,
			CronogramaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_S = new FinderPath(CronogramaModelImpl.ENTITY_CACHE_ENABLED,
			CronogramaModelImpl.FINDER_CACHE_ENABLED, CronogramaImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByS",
			new String[] { Long.class.getName() },
			CronogramaModelImpl.SOLICITUDEVALUACIONDESEMPENNOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S = new FinderPath(CronogramaModelImpl.ENTITY_CACHE_ENABLED,
			CronogramaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS",
			new String[] { Long.class.getName() });

	/**
	 * Returns the cronograma where solicitudEvaluacionDesempennoId = &#63; or throws a {@link com.hitss.layer.NoSuchCronogramaException} if it could not be found.
	 *
	 * @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	 * @return the matching cronograma
	 * @throws com.hitss.layer.NoSuchCronogramaException if a matching cronograma could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cronograma findByS(long solicitudEvaluacionDesempennoId)
		throws NoSuchCronogramaException, SystemException {
		Cronograma cronograma = fetchByS(solicitudEvaluacionDesempennoId);

		if (cronograma == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("solicitudEvaluacionDesempennoId=");
			msg.append(solicitudEvaluacionDesempennoId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCronogramaException(msg.toString());
		}

		return cronograma;
	}

	/**
	 * Returns the cronograma where solicitudEvaluacionDesempennoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	 * @return the matching cronograma, or <code>null</code> if a matching cronograma could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cronograma fetchByS(long solicitudEvaluacionDesempennoId)
		throws SystemException {
		return fetchByS(solicitudEvaluacionDesempennoId, true);
	}

	/**
	 * Returns the cronograma where solicitudEvaluacionDesempennoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching cronograma, or <code>null</code> if a matching cronograma could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cronograma fetchByS(long solicitudEvaluacionDesempennoId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { solicitudEvaluacionDesempennoId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_S,
					finderArgs, this);
		}

		if (result instanceof Cronograma) {
			Cronograma cronograma = (Cronograma)result;

			if ((solicitudEvaluacionDesempennoId != cronograma.getSolicitudEvaluacionDesempennoId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CRONOGRAMA_WHERE);

			query.append(_FINDER_COLUMN_S_SOLICITUDEVALUACIONDESEMPENNOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudEvaluacionDesempennoId);

				List<Cronograma> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_S,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CronogramaPersistenceImpl.fetchByS(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Cronograma cronograma = list.get(0);

					result = cronograma;

					cacheResult(cronograma);

					if ((cronograma.getSolicitudEvaluacionDesempennoId() != solicitudEvaluacionDesempennoId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_S,
							finderArgs, cronograma);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_S, finderArgs);

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
			return (Cronograma)result;
		}
	}

	/**
	 * Removes the cronograma where solicitudEvaluacionDesempennoId = &#63; from the database.
	 *
	 * @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	 * @return the cronograma that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cronograma removeByS(long solicitudEvaluacionDesempennoId)
		throws NoSuchCronogramaException, SystemException {
		Cronograma cronograma = findByS(solicitudEvaluacionDesempennoId);

		return remove(cronograma);
	}

	/**
	 * Returns the number of cronogramas where solicitudEvaluacionDesempennoId = &#63;.
	 *
	 * @param solicitudEvaluacionDesempennoId the solicitud evaluacion desempenno ID
	 * @return the number of matching cronogramas
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

			query.append(_SQL_COUNT_CRONOGRAMA_WHERE);

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
		"cronograma.solicitudEvaluacionDesempennoId = ? AND cronograma.activo=true";

	public CronogramaPersistenceImpl() {
		setModelClass(Cronograma.class);
	}

	/**
	 * Caches the cronograma in the entity cache if it is enabled.
	 *
	 * @param cronograma the cronograma
	 */
	@Override
	public void cacheResult(Cronograma cronograma) {
		EntityCacheUtil.putResult(CronogramaModelImpl.ENTITY_CACHE_ENABLED,
			CronogramaImpl.class, cronograma.getPrimaryKey(), cronograma);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_S,
			new Object[] { cronograma.getSolicitudEvaluacionDesempennoId() },
			cronograma);

		cronograma.resetOriginalValues();
	}

	/**
	 * Caches the cronogramas in the entity cache if it is enabled.
	 *
	 * @param cronogramas the cronogramas
	 */
	@Override
	public void cacheResult(List<Cronograma> cronogramas) {
		for (Cronograma cronograma : cronogramas) {
			if (EntityCacheUtil.getResult(
						CronogramaModelImpl.ENTITY_CACHE_ENABLED,
						CronogramaImpl.class, cronograma.getPrimaryKey()) == null) {
				cacheResult(cronograma);
			}
			else {
				cronograma.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cronogramas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CronogramaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CronogramaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cronograma.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Cronograma cronograma) {
		EntityCacheUtil.removeResult(CronogramaModelImpl.ENTITY_CACHE_ENABLED,
			CronogramaImpl.class, cronograma.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(cronograma);
	}

	@Override
	public void clearCache(List<Cronograma> cronogramas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Cronograma cronograma : cronogramas) {
			EntityCacheUtil.removeResult(CronogramaModelImpl.ENTITY_CACHE_ENABLED,
				CronogramaImpl.class, cronograma.getPrimaryKey());

			clearUniqueFindersCache(cronograma);
		}
	}

	protected void cacheUniqueFindersCache(Cronograma cronograma) {
		if (cronograma.isNew()) {
			Object[] args = new Object[] {
					cronograma.getSolicitudEvaluacionDesempennoId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_S, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_S, args, cronograma);
		}
		else {
			CronogramaModelImpl cronogramaModelImpl = (CronogramaModelImpl)cronograma;

			if ((cronogramaModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cronograma.getSolicitudEvaluacionDesempennoId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_S, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_S, args,
					cronograma);
			}
		}
	}

	protected void clearUniqueFindersCache(Cronograma cronograma) {
		CronogramaModelImpl cronogramaModelImpl = (CronogramaModelImpl)cronograma;

		Object[] args = new Object[] {
				cronograma.getSolicitudEvaluacionDesempennoId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_S, args);

		if ((cronogramaModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_S.getColumnBitmask()) != 0) {
			args = new Object[] {
					cronogramaModelImpl.getOriginalSolicitudEvaluacionDesempennoId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_S, args);
		}
	}

	/**
	 * Creates a new cronograma with the primary key. Does not add the cronograma to the database.
	 *
	 * @param cronogramaId the primary key for the new cronograma
	 * @return the new cronograma
	 */
	@Override
	public Cronograma create(long cronogramaId) {
		Cronograma cronograma = new CronogramaImpl();

		cronograma.setNew(true);
		cronograma.setPrimaryKey(cronogramaId);

		return cronograma;
	}

	/**
	 * Removes the cronograma with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cronogramaId the primary key of the cronograma
	 * @return the cronograma that was removed
	 * @throws com.hitss.layer.NoSuchCronogramaException if a cronograma with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cronograma remove(long cronogramaId)
		throws NoSuchCronogramaException, SystemException {
		return remove((Serializable)cronogramaId);
	}

	/**
	 * Removes the cronograma with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cronograma
	 * @return the cronograma that was removed
	 * @throws com.hitss.layer.NoSuchCronogramaException if a cronograma with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cronograma remove(Serializable primaryKey)
		throws NoSuchCronogramaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Cronograma cronograma = (Cronograma)session.get(CronogramaImpl.class,
					primaryKey);

			if (cronograma == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCronogramaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cronograma);
		}
		catch (NoSuchCronogramaException nsee) {
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
	protected Cronograma removeImpl(Cronograma cronograma)
		throws SystemException {
		cronograma = toUnwrappedModel(cronograma);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cronograma)) {
				cronograma = (Cronograma)session.get(CronogramaImpl.class,
						cronograma.getPrimaryKeyObj());
			}

			if (cronograma != null) {
				session.delete(cronograma);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cronograma != null) {
			clearCache(cronograma);
		}

		return cronograma;
	}

	@Override
	public Cronograma updateImpl(com.hitss.layer.model.Cronograma cronograma)
		throws SystemException {
		cronograma = toUnwrappedModel(cronograma);

		boolean isNew = cronograma.isNew();

		Session session = null;

		try {
			session = openSession();

			if (cronograma.isNew()) {
				session.save(cronograma);

				cronograma.setNew(false);
			}
			else {
				session.merge(cronograma);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CronogramaModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(CronogramaModelImpl.ENTITY_CACHE_ENABLED,
			CronogramaImpl.class, cronograma.getPrimaryKey(), cronograma);

		clearUniqueFindersCache(cronograma);
		cacheUniqueFindersCache(cronograma);

		return cronograma;
	}

	protected Cronograma toUnwrappedModel(Cronograma cronograma) {
		if (cronograma instanceof CronogramaImpl) {
			return cronograma;
		}

		CronogramaImpl cronogramaImpl = new CronogramaImpl();

		cronogramaImpl.setNew(cronograma.isNew());
		cronogramaImpl.setPrimaryKey(cronograma.getPrimaryKey());

		cronogramaImpl.setCronogramaId(cronograma.getCronogramaId());
		cronogramaImpl.setSolicitudEvaluacionDesempennoId(cronograma.getSolicitudEvaluacionDesempennoId());
		cronogramaImpl.setDescripcion(cronograma.getDescripcion());
		cronogramaImpl.setEstado(cronograma.getEstado());
		cronogramaImpl.setAprobacionCronograma(cronograma.getAprobacionCronograma());
		cronogramaImpl.setActivo(cronograma.isActivo());
		cronogramaImpl.setUsuariocrea(cronograma.getUsuariocrea());
		cronogramaImpl.setFechacrea(cronograma.getFechacrea());
		cronogramaImpl.setUsuariomodifica(cronograma.getUsuariomodifica());
		cronogramaImpl.setFechamodifica(cronograma.getFechamodifica());

		return cronogramaImpl;
	}

	/**
	 * Returns the cronograma with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cronograma
	 * @return the cronograma
	 * @throws com.hitss.layer.NoSuchCronogramaException if a cronograma with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cronograma findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCronogramaException, SystemException {
		Cronograma cronograma = fetchByPrimaryKey(primaryKey);

		if (cronograma == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCronogramaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cronograma;
	}

	/**
	 * Returns the cronograma with the primary key or throws a {@link com.hitss.layer.NoSuchCronogramaException} if it could not be found.
	 *
	 * @param cronogramaId the primary key of the cronograma
	 * @return the cronograma
	 * @throws com.hitss.layer.NoSuchCronogramaException if a cronograma with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cronograma findByPrimaryKey(long cronogramaId)
		throws NoSuchCronogramaException, SystemException {
		return findByPrimaryKey((Serializable)cronogramaId);
	}

	/**
	 * Returns the cronograma with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cronograma
	 * @return the cronograma, or <code>null</code> if a cronograma with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cronograma fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Cronograma cronograma = (Cronograma)EntityCacheUtil.getResult(CronogramaModelImpl.ENTITY_CACHE_ENABLED,
				CronogramaImpl.class, primaryKey);

		if (cronograma == _nullCronograma) {
			return null;
		}

		if (cronograma == null) {
			Session session = null;

			try {
				session = openSession();

				cronograma = (Cronograma)session.get(CronogramaImpl.class,
						primaryKey);

				if (cronograma != null) {
					cacheResult(cronograma);
				}
				else {
					EntityCacheUtil.putResult(CronogramaModelImpl.ENTITY_CACHE_ENABLED,
						CronogramaImpl.class, primaryKey, _nullCronograma);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CronogramaModelImpl.ENTITY_CACHE_ENABLED,
					CronogramaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cronograma;
	}

	/**
	 * Returns the cronograma with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cronogramaId the primary key of the cronograma
	 * @return the cronograma, or <code>null</code> if a cronograma with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cronograma fetchByPrimaryKey(long cronogramaId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)cronogramaId);
	}

	/**
	 * Returns all the cronogramas.
	 *
	 * @return the cronogramas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Cronograma> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cronogramas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.CronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cronogramas
	 * @param end the upper bound of the range of cronogramas (not inclusive)
	 * @return the range of cronogramas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Cronograma> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cronogramas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.CronogramaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cronogramas
	 * @param end the upper bound of the range of cronogramas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cronogramas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Cronograma> findAll(int start, int end,
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

		List<Cronograma> list = (List<Cronograma>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CRONOGRAMA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRONOGRAMA;

				if (pagination) {
					sql = sql.concat(CronogramaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Cronograma>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Cronograma>(list);
				}
				else {
					list = (List<Cronograma>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the cronogramas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Cronograma cronograma : findAll()) {
			remove(cronograma);
		}
	}

	/**
	 * Returns the number of cronogramas.
	 *
	 * @return the number of cronogramas
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

				Query q = session.createQuery(_SQL_COUNT_CRONOGRAMA);

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
	 * Initializes the cronograma persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.Cronograma")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Cronograma>> listenersList = new ArrayList<ModelListener<Cronograma>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Cronograma>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CronogramaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CRONOGRAMA = "SELECT cronograma FROM Cronograma cronograma";
	private static final String _SQL_SELECT_CRONOGRAMA_WHERE = "SELECT cronograma FROM Cronograma cronograma WHERE ";
	private static final String _SQL_COUNT_CRONOGRAMA = "SELECT COUNT(cronograma) FROM Cronograma cronograma";
	private static final String _SQL_COUNT_CRONOGRAMA_WHERE = "SELECT COUNT(cronograma) FROM Cronograma cronograma WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cronograma.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Cronograma exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Cronograma exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CronogramaPersistenceImpl.class);
	private static Cronograma _nullCronograma = new CronogramaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Cronograma> toCacheModel() {
				return _nullCronogramaCacheModel;
			}
		};

	private static CacheModel<Cronograma> _nullCronogramaCacheModel = new CacheModel<Cronograma>() {
			@Override
			public Cronograma toEntityModel() {
				return _nullCronograma;
			}
		};
}
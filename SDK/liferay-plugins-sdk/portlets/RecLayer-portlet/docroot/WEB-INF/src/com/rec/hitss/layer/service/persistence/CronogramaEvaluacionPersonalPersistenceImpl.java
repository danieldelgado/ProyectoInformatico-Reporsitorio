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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.rec.hitss.layer.NoSuchCronogramaEvaluacionPersonalException;
import com.rec.hitss.layer.model.CronogramaEvaluacionPersonal;
import com.rec.hitss.layer.model.impl.CronogramaEvaluacionPersonalImpl;
import com.rec.hitss.layer.model.impl.CronogramaEvaluacionPersonalModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the cronograma evaluacion personal service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see CronogramaEvaluacionPersonalPersistence
 * @see CronogramaEvaluacionPersonalUtil
 * @generated
 */
public class CronogramaEvaluacionPersonalPersistenceImpl
	extends BasePersistenceImpl<CronogramaEvaluacionPersonal>
	implements CronogramaEvaluacionPersonalPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CronogramaEvaluacionPersonalUtil} to access the cronograma evaluacion personal persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CronogramaEvaluacionPersonalImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CronogramaEvaluacionPersonalModelImpl.ENTITY_CACHE_ENABLED,
			CronogramaEvaluacionPersonalModelImpl.FINDER_CACHE_ENABLED,
			CronogramaEvaluacionPersonalImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CronogramaEvaluacionPersonalModelImpl.ENTITY_CACHE_ENABLED,
			CronogramaEvaluacionPersonalModelImpl.FINDER_CACHE_ENABLED,
			CronogramaEvaluacionPersonalImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CronogramaEvaluacionPersonalModelImpl.ENTITY_CACHE_ENABLED,
			CronogramaEvaluacionPersonalModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public CronogramaEvaluacionPersonalPersistenceImpl() {
		setModelClass(CronogramaEvaluacionPersonal.class);
	}

	/**
	 * Caches the cronograma evaluacion personal in the entity cache if it is enabled.
	 *
	 * @param cronogramaEvaluacionPersonal the cronograma evaluacion personal
	 */
	@Override
	public void cacheResult(
		CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal) {
		EntityCacheUtil.putResult(CronogramaEvaluacionPersonalModelImpl.ENTITY_CACHE_ENABLED,
			CronogramaEvaluacionPersonalImpl.class,
			cronogramaEvaluacionPersonal.getPrimaryKey(),
			cronogramaEvaluacionPersonal);

		cronogramaEvaluacionPersonal.resetOriginalValues();
	}

	/**
	 * Caches the cronograma evaluacion personals in the entity cache if it is enabled.
	 *
	 * @param cronogramaEvaluacionPersonals the cronograma evaluacion personals
	 */
	@Override
	public void cacheResult(
		List<CronogramaEvaluacionPersonal> cronogramaEvaluacionPersonals) {
		for (CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal : cronogramaEvaluacionPersonals) {
			if (EntityCacheUtil.getResult(
						CronogramaEvaluacionPersonalModelImpl.ENTITY_CACHE_ENABLED,
						CronogramaEvaluacionPersonalImpl.class,
						cronogramaEvaluacionPersonal.getPrimaryKey()) == null) {
				cacheResult(cronogramaEvaluacionPersonal);
			}
			else {
				cronogramaEvaluacionPersonal.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cronograma evaluacion personals.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CronogramaEvaluacionPersonalImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CronogramaEvaluacionPersonalImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cronograma evaluacion personal.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal) {
		EntityCacheUtil.removeResult(CronogramaEvaluacionPersonalModelImpl.ENTITY_CACHE_ENABLED,
			CronogramaEvaluacionPersonalImpl.class,
			cronogramaEvaluacionPersonal.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<CronogramaEvaluacionPersonal> cronogramaEvaluacionPersonals) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal : cronogramaEvaluacionPersonals) {
			EntityCacheUtil.removeResult(CronogramaEvaluacionPersonalModelImpl.ENTITY_CACHE_ENABLED,
				CronogramaEvaluacionPersonalImpl.class,
				cronogramaEvaluacionPersonal.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cronograma evaluacion personal with the primary key. Does not add the cronograma evaluacion personal to the database.
	 *
	 * @param cronogramaEvaluacionPersonalId the primary key for the new cronograma evaluacion personal
	 * @return the new cronograma evaluacion personal
	 */
	@Override
	public CronogramaEvaluacionPersonal create(
		long cronogramaEvaluacionPersonalId) {
		CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal = new CronogramaEvaluacionPersonalImpl();

		cronogramaEvaluacionPersonal.setNew(true);
		cronogramaEvaluacionPersonal.setPrimaryKey(cronogramaEvaluacionPersonalId);

		return cronogramaEvaluacionPersonal;
	}

	/**
	 * Removes the cronograma evaluacion personal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cronogramaEvaluacionPersonalId the primary key of the cronograma evaluacion personal
	 * @return the cronograma evaluacion personal that was removed
	 * @throws com.rec.hitss.layer.NoSuchCronogramaEvaluacionPersonalException if a cronograma evaluacion personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CronogramaEvaluacionPersonal remove(
		long cronogramaEvaluacionPersonalId)
		throws NoSuchCronogramaEvaluacionPersonalException, SystemException {
		return remove((Serializable)cronogramaEvaluacionPersonalId);
	}

	/**
	 * Removes the cronograma evaluacion personal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cronograma evaluacion personal
	 * @return the cronograma evaluacion personal that was removed
	 * @throws com.rec.hitss.layer.NoSuchCronogramaEvaluacionPersonalException if a cronograma evaluacion personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CronogramaEvaluacionPersonal remove(Serializable primaryKey)
		throws NoSuchCronogramaEvaluacionPersonalException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal = (CronogramaEvaluacionPersonal)session.get(CronogramaEvaluacionPersonalImpl.class,
					primaryKey);

			if (cronogramaEvaluacionPersonal == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCronogramaEvaluacionPersonalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cronogramaEvaluacionPersonal);
		}
		catch (NoSuchCronogramaEvaluacionPersonalException nsee) {
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
	protected CronogramaEvaluacionPersonal removeImpl(
		CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal)
		throws SystemException {
		cronogramaEvaluacionPersonal = toUnwrappedModel(cronogramaEvaluacionPersonal);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cronogramaEvaluacionPersonal)) {
				cronogramaEvaluacionPersonal = (CronogramaEvaluacionPersonal)session.get(CronogramaEvaluacionPersonalImpl.class,
						cronogramaEvaluacionPersonal.getPrimaryKeyObj());
			}

			if (cronogramaEvaluacionPersonal != null) {
				session.delete(cronogramaEvaluacionPersonal);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cronogramaEvaluacionPersonal != null) {
			clearCache(cronogramaEvaluacionPersonal);
		}

		return cronogramaEvaluacionPersonal;
	}

	@Override
	public CronogramaEvaluacionPersonal updateImpl(
		com.rec.hitss.layer.model.CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal)
		throws SystemException {
		cronogramaEvaluacionPersonal = toUnwrappedModel(cronogramaEvaluacionPersonal);

		boolean isNew = cronogramaEvaluacionPersonal.isNew();

		Session session = null;

		try {
			session = openSession();

			if (cronogramaEvaluacionPersonal.isNew()) {
				session.save(cronogramaEvaluacionPersonal);

				cronogramaEvaluacionPersonal.setNew(false);
			}
			else {
				session.merge(cronogramaEvaluacionPersonal);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(CronogramaEvaluacionPersonalModelImpl.ENTITY_CACHE_ENABLED,
			CronogramaEvaluacionPersonalImpl.class,
			cronogramaEvaluacionPersonal.getPrimaryKey(),
			cronogramaEvaluacionPersonal);

		return cronogramaEvaluacionPersonal;
	}

	protected CronogramaEvaluacionPersonal toUnwrappedModel(
		CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal) {
		if (cronogramaEvaluacionPersonal instanceof CronogramaEvaluacionPersonalImpl) {
			return cronogramaEvaluacionPersonal;
		}

		CronogramaEvaluacionPersonalImpl cronogramaEvaluacionPersonalImpl = new CronogramaEvaluacionPersonalImpl();

		cronogramaEvaluacionPersonalImpl.setNew(cronogramaEvaluacionPersonal.isNew());
		cronogramaEvaluacionPersonalImpl.setPrimaryKey(cronogramaEvaluacionPersonal.getPrimaryKey());

		cronogramaEvaluacionPersonalImpl.setCronogramaEvaluacionPersonalId(cronogramaEvaluacionPersonal.getCronogramaEvaluacionPersonalId());
		cronogramaEvaluacionPersonalImpl.setSolicitudEvaluacionDesempenoId(cronogramaEvaluacionPersonal.getSolicitudEvaluacionDesempenoId());
		cronogramaEvaluacionPersonalImpl.setDescripcion(cronogramaEvaluacionPersonal.getDescripcion());
		cronogramaEvaluacionPersonalImpl.setEstado(cronogramaEvaluacionPersonal.getEstado());
		cronogramaEvaluacionPersonalImpl.setObservacion(cronogramaEvaluacionPersonal.getObservacion());
		cronogramaEvaluacionPersonalImpl.setActivo(cronogramaEvaluacionPersonal.isActivo());
		cronogramaEvaluacionPersonalImpl.setUsuariocrea(cronogramaEvaluacionPersonal.getUsuariocrea());
		cronogramaEvaluacionPersonalImpl.setFechacrea(cronogramaEvaluacionPersonal.getFechacrea());
		cronogramaEvaluacionPersonalImpl.setUsuariomodifica(cronogramaEvaluacionPersonal.getUsuariomodifica());
		cronogramaEvaluacionPersonalImpl.setFechacreamodifica(cronogramaEvaluacionPersonal.getFechacreamodifica());

		return cronogramaEvaluacionPersonalImpl;
	}

	/**
	 * Returns the cronograma evaluacion personal with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cronograma evaluacion personal
	 * @return the cronograma evaluacion personal
	 * @throws com.rec.hitss.layer.NoSuchCronogramaEvaluacionPersonalException if a cronograma evaluacion personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CronogramaEvaluacionPersonal findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchCronogramaEvaluacionPersonalException, SystemException {
		CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal = fetchByPrimaryKey(primaryKey);

		if (cronogramaEvaluacionPersonal == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCronogramaEvaluacionPersonalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cronogramaEvaluacionPersonal;
	}

	/**
	 * Returns the cronograma evaluacion personal with the primary key or throws a {@link com.rec.hitss.layer.NoSuchCronogramaEvaluacionPersonalException} if it could not be found.
	 *
	 * @param cronogramaEvaluacionPersonalId the primary key of the cronograma evaluacion personal
	 * @return the cronograma evaluacion personal
	 * @throws com.rec.hitss.layer.NoSuchCronogramaEvaluacionPersonalException if a cronograma evaluacion personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CronogramaEvaluacionPersonal findByPrimaryKey(
		long cronogramaEvaluacionPersonalId)
		throws NoSuchCronogramaEvaluacionPersonalException, SystemException {
		return findByPrimaryKey((Serializable)cronogramaEvaluacionPersonalId);
	}

	/**
	 * Returns the cronograma evaluacion personal with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cronograma evaluacion personal
	 * @return the cronograma evaluacion personal, or <code>null</code> if a cronograma evaluacion personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CronogramaEvaluacionPersonal fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal = (CronogramaEvaluacionPersonal)EntityCacheUtil.getResult(CronogramaEvaluacionPersonalModelImpl.ENTITY_CACHE_ENABLED,
				CronogramaEvaluacionPersonalImpl.class, primaryKey);

		if (cronogramaEvaluacionPersonal == _nullCronogramaEvaluacionPersonal) {
			return null;
		}

		if (cronogramaEvaluacionPersonal == null) {
			Session session = null;

			try {
				session = openSession();

				cronogramaEvaluacionPersonal = (CronogramaEvaluacionPersonal)session.get(CronogramaEvaluacionPersonalImpl.class,
						primaryKey);

				if (cronogramaEvaluacionPersonal != null) {
					cacheResult(cronogramaEvaluacionPersonal);
				}
				else {
					EntityCacheUtil.putResult(CronogramaEvaluacionPersonalModelImpl.ENTITY_CACHE_ENABLED,
						CronogramaEvaluacionPersonalImpl.class, primaryKey,
						_nullCronogramaEvaluacionPersonal);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CronogramaEvaluacionPersonalModelImpl.ENTITY_CACHE_ENABLED,
					CronogramaEvaluacionPersonalImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cronogramaEvaluacionPersonal;
	}

	/**
	 * Returns the cronograma evaluacion personal with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cronogramaEvaluacionPersonalId the primary key of the cronograma evaluacion personal
	 * @return the cronograma evaluacion personal, or <code>null</code> if a cronograma evaluacion personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CronogramaEvaluacionPersonal fetchByPrimaryKey(
		long cronogramaEvaluacionPersonalId) throws SystemException {
		return fetchByPrimaryKey((Serializable)cronogramaEvaluacionPersonalId);
	}

	/**
	 * Returns all the cronograma evaluacion personals.
	 *
	 * @return the cronograma evaluacion personals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CronogramaEvaluacionPersonal> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cronograma evaluacion personals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.CronogramaEvaluacionPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cronograma evaluacion personals
	 * @param end the upper bound of the range of cronograma evaluacion personals (not inclusive)
	 * @return the range of cronograma evaluacion personals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CronogramaEvaluacionPersonal> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cronograma evaluacion personals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.CronogramaEvaluacionPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cronograma evaluacion personals
	 * @param end the upper bound of the range of cronograma evaluacion personals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cronograma evaluacion personals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CronogramaEvaluacionPersonal> findAll(int start, int end,
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

		List<CronogramaEvaluacionPersonal> list = (List<CronogramaEvaluacionPersonal>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CRONOGRAMAEVALUACIONPERSONAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRONOGRAMAEVALUACIONPERSONAL;

				if (pagination) {
					sql = sql.concat(CronogramaEvaluacionPersonalModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CronogramaEvaluacionPersonal>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CronogramaEvaluacionPersonal>(list);
				}
				else {
					list = (List<CronogramaEvaluacionPersonal>)QueryUtil.list(q,
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
	 * Removes all the cronograma evaluacion personals from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal : findAll()) {
			remove(cronogramaEvaluacionPersonal);
		}
	}

	/**
	 * Returns the number of cronograma evaluacion personals.
	 *
	 * @return the number of cronograma evaluacion personals
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

				Query q = session.createQuery(_SQL_COUNT_CRONOGRAMAEVALUACIONPERSONAL);

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
	 * Initializes the cronograma evaluacion personal persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.CronogramaEvaluacionPersonal")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CronogramaEvaluacionPersonal>> listenersList = new ArrayList<ModelListener<CronogramaEvaluacionPersonal>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CronogramaEvaluacionPersonal>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CronogramaEvaluacionPersonalImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CRONOGRAMAEVALUACIONPERSONAL = "SELECT cronogramaEvaluacionPersonal FROM CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal";
	private static final String _SQL_COUNT_CRONOGRAMAEVALUACIONPERSONAL = "SELECT COUNT(cronogramaEvaluacionPersonal) FROM CronogramaEvaluacionPersonal cronogramaEvaluacionPersonal";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cronogramaEvaluacionPersonal.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CronogramaEvaluacionPersonal exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CronogramaEvaluacionPersonalPersistenceImpl.class);
	private static CronogramaEvaluacionPersonal _nullCronogramaEvaluacionPersonal =
		new CronogramaEvaluacionPersonalImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CronogramaEvaluacionPersonal> toCacheModel() {
				return _nullCronogramaEvaluacionPersonalCacheModel;
			}
		};

	private static CacheModel<CronogramaEvaluacionPersonal> _nullCronogramaEvaluacionPersonalCacheModel =
		new CacheModel<CronogramaEvaluacionPersonal>() {
			@Override
			public CronogramaEvaluacionPersonal toEntityModel() {
				return _nullCronogramaEvaluacionPersonal;
			}
		};
}
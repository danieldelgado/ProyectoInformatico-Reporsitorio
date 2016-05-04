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

import com.rec.hitss.layer.NoSuchEvaluacionReclutamientoException;
import com.rec.hitss.layer.model.EvaluacionReclutamiento;
import com.rec.hitss.layer.model.impl.EvaluacionReclutamientoImpl;
import com.rec.hitss.layer.model.impl.EvaluacionReclutamientoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the evaluacion reclutamiento service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see EvaluacionReclutamientoPersistence
 * @see EvaluacionReclutamientoUtil
 * @generated
 */
public class EvaluacionReclutamientoPersistenceImpl extends BasePersistenceImpl<EvaluacionReclutamiento>
	implements EvaluacionReclutamientoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EvaluacionReclutamientoUtil} to access the evaluacion reclutamiento persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EvaluacionReclutamientoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EvaluacionReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionReclutamientoModelImpl.FINDER_CACHE_ENABLED,
			EvaluacionReclutamientoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EvaluacionReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionReclutamientoModelImpl.FINDER_CACHE_ENABLED,
			EvaluacionReclutamientoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EvaluacionReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionReclutamientoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EvaluacionReclutamientoPersistenceImpl() {
		setModelClass(EvaluacionReclutamiento.class);
	}

	/**
	 * Caches the evaluacion reclutamiento in the entity cache if it is enabled.
	 *
	 * @param evaluacionReclutamiento the evaluacion reclutamiento
	 */
	@Override
	public void cacheResult(EvaluacionReclutamiento evaluacionReclutamiento) {
		EntityCacheUtil.putResult(EvaluacionReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionReclutamientoImpl.class,
			evaluacionReclutamiento.getPrimaryKey(), evaluacionReclutamiento);

		evaluacionReclutamiento.resetOriginalValues();
	}

	/**
	 * Caches the evaluacion reclutamientos in the entity cache if it is enabled.
	 *
	 * @param evaluacionReclutamientos the evaluacion reclutamientos
	 */
	@Override
	public void cacheResult(
		List<EvaluacionReclutamiento> evaluacionReclutamientos) {
		for (EvaluacionReclutamiento evaluacionReclutamiento : evaluacionReclutamientos) {
			if (EntityCacheUtil.getResult(
						EvaluacionReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
						EvaluacionReclutamientoImpl.class,
						evaluacionReclutamiento.getPrimaryKey()) == null) {
				cacheResult(evaluacionReclutamiento);
			}
			else {
				evaluacionReclutamiento.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all evaluacion reclutamientos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EvaluacionReclutamientoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EvaluacionReclutamientoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the evaluacion reclutamiento.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EvaluacionReclutamiento evaluacionReclutamiento) {
		EntityCacheUtil.removeResult(EvaluacionReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionReclutamientoImpl.class,
			evaluacionReclutamiento.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<EvaluacionReclutamiento> evaluacionReclutamientos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EvaluacionReclutamiento evaluacionReclutamiento : evaluacionReclutamientos) {
			EntityCacheUtil.removeResult(EvaluacionReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
				EvaluacionReclutamientoImpl.class,
				evaluacionReclutamiento.getPrimaryKey());
		}
	}

	/**
	 * Creates a new evaluacion reclutamiento with the primary key. Does not add the evaluacion reclutamiento to the database.
	 *
	 * @param ER_ID the primary key for the new evaluacion reclutamiento
	 * @return the new evaluacion reclutamiento
	 */
	@Override
	public EvaluacionReclutamiento create(long ER_ID) {
		EvaluacionReclutamiento evaluacionReclutamiento = new EvaluacionReclutamientoImpl();

		evaluacionReclutamiento.setNew(true);
		evaluacionReclutamiento.setPrimaryKey(ER_ID);

		return evaluacionReclutamiento;
	}

	/**
	 * Removes the evaluacion reclutamiento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ER_ID the primary key of the evaluacion reclutamiento
	 * @return the evaluacion reclutamiento that was removed
	 * @throws com.rec.hitss.layer.NoSuchEvaluacionReclutamientoException if a evaluacion reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EvaluacionReclutamiento remove(long ER_ID)
		throws NoSuchEvaluacionReclutamientoException, SystemException {
		return remove((Serializable)ER_ID);
	}

	/**
	 * Removes the evaluacion reclutamiento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the evaluacion reclutamiento
	 * @return the evaluacion reclutamiento that was removed
	 * @throws com.rec.hitss.layer.NoSuchEvaluacionReclutamientoException if a evaluacion reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EvaluacionReclutamiento remove(Serializable primaryKey)
		throws NoSuchEvaluacionReclutamientoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EvaluacionReclutamiento evaluacionReclutamiento = (EvaluacionReclutamiento)session.get(EvaluacionReclutamientoImpl.class,
					primaryKey);

			if (evaluacionReclutamiento == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEvaluacionReclutamientoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(evaluacionReclutamiento);
		}
		catch (NoSuchEvaluacionReclutamientoException nsee) {
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
	protected EvaluacionReclutamiento removeImpl(
		EvaluacionReclutamiento evaluacionReclutamiento)
		throws SystemException {
		evaluacionReclutamiento = toUnwrappedModel(evaluacionReclutamiento);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(evaluacionReclutamiento)) {
				evaluacionReclutamiento = (EvaluacionReclutamiento)session.get(EvaluacionReclutamientoImpl.class,
						evaluacionReclutamiento.getPrimaryKeyObj());
			}

			if (evaluacionReclutamiento != null) {
				session.delete(evaluacionReclutamiento);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (evaluacionReclutamiento != null) {
			clearCache(evaluacionReclutamiento);
		}

		return evaluacionReclutamiento;
	}

	@Override
	public EvaluacionReclutamiento updateImpl(
		com.rec.hitss.layer.model.EvaluacionReclutamiento evaluacionReclutamiento)
		throws SystemException {
		evaluacionReclutamiento = toUnwrappedModel(evaluacionReclutamiento);

		boolean isNew = evaluacionReclutamiento.isNew();

		Session session = null;

		try {
			session = openSession();

			if (evaluacionReclutamiento.isNew()) {
				session.save(evaluacionReclutamiento);

				evaluacionReclutamiento.setNew(false);
			}
			else {
				session.merge(evaluacionReclutamiento);
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

		EntityCacheUtil.putResult(EvaluacionReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionReclutamientoImpl.class,
			evaluacionReclutamiento.getPrimaryKey(), evaluacionReclutamiento);

		return evaluacionReclutamiento;
	}

	protected EvaluacionReclutamiento toUnwrappedModel(
		EvaluacionReclutamiento evaluacionReclutamiento) {
		if (evaluacionReclutamiento instanceof EvaluacionReclutamientoImpl) {
			return evaluacionReclutamiento;
		}

		EvaluacionReclutamientoImpl evaluacionReclutamientoImpl = new EvaluacionReclutamientoImpl();

		evaluacionReclutamientoImpl.setNew(evaluacionReclutamiento.isNew());
		evaluacionReclutamientoImpl.setPrimaryKey(evaluacionReclutamiento.getPrimaryKey());

		evaluacionReclutamientoImpl.setER_ID(evaluacionReclutamiento.getER_ID());
		evaluacionReclutamientoImpl.setER_ESTADO(evaluacionReclutamiento.getER_ESTADO());
		evaluacionReclutamientoImpl.setER_ACTIVO(evaluacionReclutamiento.getER_ACTIVO());
		evaluacionReclutamientoImpl.setER_USUARIO_CREA(evaluacionReclutamiento.getER_USUARIO_CREA());
		evaluacionReclutamientoImpl.setER_FECHA_CREA(evaluacionReclutamiento.getER_FECHA_CREA());
		evaluacionReclutamientoImpl.setER_USUARIO_MODIFICA(evaluacionReclutamiento.getER_USUARIO_MODIFICA());
		evaluacionReclutamientoImpl.setER_FECHA_MODIFICA(evaluacionReclutamiento.getER_FECHA_MODIFICA());

		return evaluacionReclutamientoImpl;
	}

	/**
	 * Returns the evaluacion reclutamiento with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the evaluacion reclutamiento
	 * @return the evaluacion reclutamiento
	 * @throws com.rec.hitss.layer.NoSuchEvaluacionReclutamientoException if a evaluacion reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EvaluacionReclutamiento findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEvaluacionReclutamientoException, SystemException {
		EvaluacionReclutamiento evaluacionReclutamiento = fetchByPrimaryKey(primaryKey);

		if (evaluacionReclutamiento == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEvaluacionReclutamientoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return evaluacionReclutamiento;
	}

	/**
	 * Returns the evaluacion reclutamiento with the primary key or throws a {@link com.rec.hitss.layer.NoSuchEvaluacionReclutamientoException} if it could not be found.
	 *
	 * @param ER_ID the primary key of the evaluacion reclutamiento
	 * @return the evaluacion reclutamiento
	 * @throws com.rec.hitss.layer.NoSuchEvaluacionReclutamientoException if a evaluacion reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EvaluacionReclutamiento findByPrimaryKey(long ER_ID)
		throws NoSuchEvaluacionReclutamientoException, SystemException {
		return findByPrimaryKey((Serializable)ER_ID);
	}

	/**
	 * Returns the evaluacion reclutamiento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the evaluacion reclutamiento
	 * @return the evaluacion reclutamiento, or <code>null</code> if a evaluacion reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EvaluacionReclutamiento fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EvaluacionReclutamiento evaluacionReclutamiento = (EvaluacionReclutamiento)EntityCacheUtil.getResult(EvaluacionReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
				EvaluacionReclutamientoImpl.class, primaryKey);

		if (evaluacionReclutamiento == _nullEvaluacionReclutamiento) {
			return null;
		}

		if (evaluacionReclutamiento == null) {
			Session session = null;

			try {
				session = openSession();

				evaluacionReclutamiento = (EvaluacionReclutamiento)session.get(EvaluacionReclutamientoImpl.class,
						primaryKey);

				if (evaluacionReclutamiento != null) {
					cacheResult(evaluacionReclutamiento);
				}
				else {
					EntityCacheUtil.putResult(EvaluacionReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
						EvaluacionReclutamientoImpl.class, primaryKey,
						_nullEvaluacionReclutamiento);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EvaluacionReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
					EvaluacionReclutamientoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return evaluacionReclutamiento;
	}

	/**
	 * Returns the evaluacion reclutamiento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ER_ID the primary key of the evaluacion reclutamiento
	 * @return the evaluacion reclutamiento, or <code>null</code> if a evaluacion reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EvaluacionReclutamiento fetchByPrimaryKey(long ER_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)ER_ID);
	}

	/**
	 * Returns all the evaluacion reclutamientos.
	 *
	 * @return the evaluacion reclutamientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EvaluacionReclutamiento> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the evaluacion reclutamientos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EvaluacionReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of evaluacion reclutamientos
	 * @param end the upper bound of the range of evaluacion reclutamientos (not inclusive)
	 * @return the range of evaluacion reclutamientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EvaluacionReclutamiento> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the evaluacion reclutamientos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EvaluacionReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of evaluacion reclutamientos
	 * @param end the upper bound of the range of evaluacion reclutamientos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of evaluacion reclutamientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EvaluacionReclutamiento> findAll(int start, int end,
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

		List<EvaluacionReclutamiento> list = (List<EvaluacionReclutamiento>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EVALUACIONRECLUTAMIENTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EVALUACIONRECLUTAMIENTO;

				if (pagination) {
					sql = sql.concat(EvaluacionReclutamientoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EvaluacionReclutamiento>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EvaluacionReclutamiento>(list);
				}
				else {
					list = (List<EvaluacionReclutamiento>)QueryUtil.list(q,
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
	 * Removes all the evaluacion reclutamientos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EvaluacionReclutamiento evaluacionReclutamiento : findAll()) {
			remove(evaluacionReclutamiento);
		}
	}

	/**
	 * Returns the number of evaluacion reclutamientos.
	 *
	 * @return the number of evaluacion reclutamientos
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

				Query q = session.createQuery(_SQL_COUNT_EVALUACIONRECLUTAMIENTO);

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
	 * Initializes the evaluacion reclutamiento persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.EvaluacionReclutamiento")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EvaluacionReclutamiento>> listenersList = new ArrayList<ModelListener<EvaluacionReclutamiento>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EvaluacionReclutamiento>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EvaluacionReclutamientoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EVALUACIONRECLUTAMIENTO = "SELECT evaluacionReclutamiento FROM EvaluacionReclutamiento evaluacionReclutamiento";
	private static final String _SQL_COUNT_EVALUACIONRECLUTAMIENTO = "SELECT COUNT(evaluacionReclutamiento) FROM EvaluacionReclutamiento evaluacionReclutamiento";
	private static final String _ORDER_BY_ENTITY_ALIAS = "evaluacionReclutamiento.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EvaluacionReclutamiento exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EvaluacionReclutamientoPersistenceImpl.class);
	private static EvaluacionReclutamiento _nullEvaluacionReclutamiento = new EvaluacionReclutamientoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EvaluacionReclutamiento> toCacheModel() {
				return _nullEvaluacionReclutamientoCacheModel;
			}
		};

	private static CacheModel<EvaluacionReclutamiento> _nullEvaluacionReclutamientoCacheModel =
		new CacheModel<EvaluacionReclutamiento>() {
			@Override
			public EvaluacionReclutamiento toEntityModel() {
				return _nullEvaluacionReclutamiento;
			}
		};
}
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

import com.hitss.layer.NoSuchEvaluacionPreguntaException;
import com.hitss.layer.model.EvaluacionPregunta;
import com.hitss.layer.model.impl.EvaluacionPreguntaImpl;
import com.hitss.layer.model.impl.EvaluacionPreguntaModelImpl;

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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the evaluacion pregunta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see EvaluacionPreguntaPersistence
 * @see EvaluacionPreguntaUtil
 * @generated
 */
public class EvaluacionPreguntaPersistenceImpl extends BasePersistenceImpl<EvaluacionPregunta>
	implements EvaluacionPreguntaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EvaluacionPreguntaUtil} to access the evaluacion pregunta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EvaluacionPreguntaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EvaluacionPreguntaModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionPreguntaModelImpl.FINDER_CACHE_ENABLED,
			EvaluacionPreguntaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EvaluacionPreguntaModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionPreguntaModelImpl.FINDER_CACHE_ENABLED,
			EvaluacionPreguntaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EvaluacionPreguntaModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionPreguntaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EvaluacionPreguntaPersistenceImpl() {
		setModelClass(EvaluacionPregunta.class);
	}

	/**
	 * Caches the evaluacion pregunta in the entity cache if it is enabled.
	 *
	 * @param evaluacionPregunta the evaluacion pregunta
	 */
	@Override
	public void cacheResult(EvaluacionPregunta evaluacionPregunta) {
		EntityCacheUtil.putResult(EvaluacionPreguntaModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionPreguntaImpl.class, evaluacionPregunta.getPrimaryKey(),
			evaluacionPregunta);

		evaluacionPregunta.resetOriginalValues();
	}

	/**
	 * Caches the evaluacion preguntas in the entity cache if it is enabled.
	 *
	 * @param evaluacionPreguntas the evaluacion preguntas
	 */
	@Override
	public void cacheResult(List<EvaluacionPregunta> evaluacionPreguntas) {
		for (EvaluacionPregunta evaluacionPregunta : evaluacionPreguntas) {
			if (EntityCacheUtil.getResult(
						EvaluacionPreguntaModelImpl.ENTITY_CACHE_ENABLED,
						EvaluacionPreguntaImpl.class,
						evaluacionPregunta.getPrimaryKey()) == null) {
				cacheResult(evaluacionPregunta);
			}
			else {
				evaluacionPregunta.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all evaluacion preguntas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EvaluacionPreguntaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EvaluacionPreguntaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the evaluacion pregunta.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EvaluacionPregunta evaluacionPregunta) {
		EntityCacheUtil.removeResult(EvaluacionPreguntaModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionPreguntaImpl.class, evaluacionPregunta.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EvaluacionPregunta> evaluacionPreguntas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EvaluacionPregunta evaluacionPregunta : evaluacionPreguntas) {
			EntityCacheUtil.removeResult(EvaluacionPreguntaModelImpl.ENTITY_CACHE_ENABLED,
				EvaluacionPreguntaImpl.class, evaluacionPregunta.getPrimaryKey());
		}
	}

	/**
	 * Creates a new evaluacion pregunta with the primary key. Does not add the evaluacion pregunta to the database.
	 *
	 * @param evaluacionPreguntaPK the primary key for the new evaluacion pregunta
	 * @return the new evaluacion pregunta
	 */
	@Override
	public EvaluacionPregunta create(EvaluacionPreguntaPK evaluacionPreguntaPK) {
		EvaluacionPregunta evaluacionPregunta = new EvaluacionPreguntaImpl();

		evaluacionPregunta.setNew(true);
		evaluacionPregunta.setPrimaryKey(evaluacionPreguntaPK);

		return evaluacionPregunta;
	}

	/**
	 * Removes the evaluacion pregunta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evaluacionPreguntaPK the primary key of the evaluacion pregunta
	 * @return the evaluacion pregunta that was removed
	 * @throws com.hitss.layer.NoSuchEvaluacionPreguntaException if a evaluacion pregunta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EvaluacionPregunta remove(EvaluacionPreguntaPK evaluacionPreguntaPK)
		throws NoSuchEvaluacionPreguntaException, SystemException {
		return remove((Serializable)evaluacionPreguntaPK);
	}

	/**
	 * Removes the evaluacion pregunta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the evaluacion pregunta
	 * @return the evaluacion pregunta that was removed
	 * @throws com.hitss.layer.NoSuchEvaluacionPreguntaException if a evaluacion pregunta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EvaluacionPregunta remove(Serializable primaryKey)
		throws NoSuchEvaluacionPreguntaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EvaluacionPregunta evaluacionPregunta = (EvaluacionPregunta)session.get(EvaluacionPreguntaImpl.class,
					primaryKey);

			if (evaluacionPregunta == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEvaluacionPreguntaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(evaluacionPregunta);
		}
		catch (NoSuchEvaluacionPreguntaException nsee) {
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
	protected EvaluacionPregunta removeImpl(
		EvaluacionPregunta evaluacionPregunta) throws SystemException {
		evaluacionPregunta = toUnwrappedModel(evaluacionPregunta);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(evaluacionPregunta)) {
				evaluacionPregunta = (EvaluacionPregunta)session.get(EvaluacionPreguntaImpl.class,
						evaluacionPregunta.getPrimaryKeyObj());
			}

			if (evaluacionPregunta != null) {
				session.delete(evaluacionPregunta);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (evaluacionPregunta != null) {
			clearCache(evaluacionPregunta);
		}

		return evaluacionPregunta;
	}

	@Override
	public EvaluacionPregunta updateImpl(
		com.hitss.layer.model.EvaluacionPregunta evaluacionPregunta)
		throws SystemException {
		evaluacionPregunta = toUnwrappedModel(evaluacionPregunta);

		boolean isNew = evaluacionPregunta.isNew();

		Session session = null;

		try {
			session = openSession();

			if (evaluacionPregunta.isNew()) {
				session.save(evaluacionPregunta);

				evaluacionPregunta.setNew(false);
			}
			else {
				session.merge(evaluacionPregunta);
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

		EntityCacheUtil.putResult(EvaluacionPreguntaModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionPreguntaImpl.class, evaluacionPregunta.getPrimaryKey(),
			evaluacionPregunta);

		return evaluacionPregunta;
	}

	protected EvaluacionPregunta toUnwrappedModel(
		EvaluacionPregunta evaluacionPregunta) {
		if (evaluacionPregunta instanceof EvaluacionPreguntaImpl) {
			return evaluacionPregunta;
		}

		EvaluacionPreguntaImpl evaluacionPreguntaImpl = new EvaluacionPreguntaImpl();

		evaluacionPreguntaImpl.setNew(evaluacionPregunta.isNew());
		evaluacionPreguntaImpl.setPrimaryKey(evaluacionPregunta.getPrimaryKey());

		evaluacionPreguntaImpl.setEvaluacionId(evaluacionPregunta.getEvaluacionId());
		evaluacionPreguntaImpl.setPreguntaId(evaluacionPregunta.getPreguntaId());
		evaluacionPreguntaImpl.setNivel(evaluacionPregunta.getNivel());

		return evaluacionPreguntaImpl;
	}

	/**
	 * Returns the evaluacion pregunta with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the evaluacion pregunta
	 * @return the evaluacion pregunta
	 * @throws com.hitss.layer.NoSuchEvaluacionPreguntaException if a evaluacion pregunta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EvaluacionPregunta findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEvaluacionPreguntaException, SystemException {
		EvaluacionPregunta evaluacionPregunta = fetchByPrimaryKey(primaryKey);

		if (evaluacionPregunta == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEvaluacionPreguntaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return evaluacionPregunta;
	}

	/**
	 * Returns the evaluacion pregunta with the primary key or throws a {@link com.hitss.layer.NoSuchEvaluacionPreguntaException} if it could not be found.
	 *
	 * @param evaluacionPreguntaPK the primary key of the evaluacion pregunta
	 * @return the evaluacion pregunta
	 * @throws com.hitss.layer.NoSuchEvaluacionPreguntaException if a evaluacion pregunta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EvaluacionPregunta findByPrimaryKey(
		EvaluacionPreguntaPK evaluacionPreguntaPK)
		throws NoSuchEvaluacionPreguntaException, SystemException {
		return findByPrimaryKey((Serializable)evaluacionPreguntaPK);
	}

	/**
	 * Returns the evaluacion pregunta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the evaluacion pregunta
	 * @return the evaluacion pregunta, or <code>null</code> if a evaluacion pregunta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EvaluacionPregunta fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EvaluacionPregunta evaluacionPregunta = (EvaluacionPregunta)EntityCacheUtil.getResult(EvaluacionPreguntaModelImpl.ENTITY_CACHE_ENABLED,
				EvaluacionPreguntaImpl.class, primaryKey);

		if (evaluacionPregunta == _nullEvaluacionPregunta) {
			return null;
		}

		if (evaluacionPregunta == null) {
			Session session = null;

			try {
				session = openSession();

				evaluacionPregunta = (EvaluacionPregunta)session.get(EvaluacionPreguntaImpl.class,
						primaryKey);

				if (evaluacionPregunta != null) {
					cacheResult(evaluacionPregunta);
				}
				else {
					EntityCacheUtil.putResult(EvaluacionPreguntaModelImpl.ENTITY_CACHE_ENABLED,
						EvaluacionPreguntaImpl.class, primaryKey,
						_nullEvaluacionPregunta);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EvaluacionPreguntaModelImpl.ENTITY_CACHE_ENABLED,
					EvaluacionPreguntaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return evaluacionPregunta;
	}

	/**
	 * Returns the evaluacion pregunta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evaluacionPreguntaPK the primary key of the evaluacion pregunta
	 * @return the evaluacion pregunta, or <code>null</code> if a evaluacion pregunta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EvaluacionPregunta fetchByPrimaryKey(
		EvaluacionPreguntaPK evaluacionPreguntaPK) throws SystemException {
		return fetchByPrimaryKey((Serializable)evaluacionPreguntaPK);
	}

	/**
	 * Returns all the evaluacion preguntas.
	 *
	 * @return the evaluacion preguntas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EvaluacionPregunta> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the evaluacion preguntas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EvaluacionPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of evaluacion preguntas
	 * @param end the upper bound of the range of evaluacion preguntas (not inclusive)
	 * @return the range of evaluacion preguntas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EvaluacionPregunta> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the evaluacion preguntas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EvaluacionPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of evaluacion preguntas
	 * @param end the upper bound of the range of evaluacion preguntas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of evaluacion preguntas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EvaluacionPregunta> findAll(int start, int end,
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

		List<EvaluacionPregunta> list = (List<EvaluacionPregunta>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EVALUACIONPREGUNTA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EVALUACIONPREGUNTA;

				if (pagination) {
					sql = sql.concat(EvaluacionPreguntaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EvaluacionPregunta>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EvaluacionPregunta>(list);
				}
				else {
					list = (List<EvaluacionPregunta>)QueryUtil.list(q,
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
	 * Removes all the evaluacion preguntas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EvaluacionPregunta evaluacionPregunta : findAll()) {
			remove(evaluacionPregunta);
		}
	}

	/**
	 * Returns the number of evaluacion preguntas.
	 *
	 * @return the number of evaluacion preguntas
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

				Query q = session.createQuery(_SQL_COUNT_EVALUACIONPREGUNTA);

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
	 * Initializes the evaluacion pregunta persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.EvaluacionPregunta")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EvaluacionPregunta>> listenersList = new ArrayList<ModelListener<EvaluacionPregunta>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EvaluacionPregunta>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EvaluacionPreguntaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EVALUACIONPREGUNTA = "SELECT evaluacionPregunta FROM EvaluacionPregunta evaluacionPregunta";
	private static final String _SQL_COUNT_EVALUACIONPREGUNTA = "SELECT COUNT(evaluacionPregunta) FROM EvaluacionPregunta evaluacionPregunta";
	private static final String _ORDER_BY_ENTITY_ALIAS = "evaluacionPregunta.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EvaluacionPregunta exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EvaluacionPreguntaPersistenceImpl.class);
	private static EvaluacionPregunta _nullEvaluacionPregunta = new EvaluacionPreguntaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EvaluacionPregunta> toCacheModel() {
				return _nullEvaluacionPreguntaCacheModel;
			}
		};

	private static CacheModel<EvaluacionPregunta> _nullEvaluacionPreguntaCacheModel =
		new CacheModel<EvaluacionPregunta>() {
			@Override
			public EvaluacionPregunta toEntityModel() {
				return _nullEvaluacionPregunta;
			}
		};
}
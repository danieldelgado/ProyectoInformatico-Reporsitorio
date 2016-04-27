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

import com.rec.hitss.layer.NoSuchResultadoEvaluacionException;
import com.rec.hitss.layer.model.ResultadoEvaluacion;
import com.rec.hitss.layer.model.impl.ResultadoEvaluacionImpl;
import com.rec.hitss.layer.model.impl.ResultadoEvaluacionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the resultado evaluacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see ResultadoEvaluacionPersistence
 * @see ResultadoEvaluacionUtil
 * @generated
 */
public class ResultadoEvaluacionPersistenceImpl extends BasePersistenceImpl<ResultadoEvaluacion>
	implements ResultadoEvaluacionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ResultadoEvaluacionUtil} to access the resultado evaluacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ResultadoEvaluacionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ResultadoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			ResultadoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			ResultadoEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ResultadoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			ResultadoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			ResultadoEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ResultadoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			ResultadoEvaluacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ResultadoEvaluacionPersistenceImpl() {
		setModelClass(ResultadoEvaluacion.class);
	}

	/**
	 * Caches the resultado evaluacion in the entity cache if it is enabled.
	 *
	 * @param resultadoEvaluacion the resultado evaluacion
	 */
	@Override
	public void cacheResult(ResultadoEvaluacion resultadoEvaluacion) {
		EntityCacheUtil.putResult(ResultadoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			ResultadoEvaluacionImpl.class, resultadoEvaluacion.getPrimaryKey(),
			resultadoEvaluacion);

		resultadoEvaluacion.resetOriginalValues();
	}

	/**
	 * Caches the resultado evaluacions in the entity cache if it is enabled.
	 *
	 * @param resultadoEvaluacions the resultado evaluacions
	 */
	@Override
	public void cacheResult(List<ResultadoEvaluacion> resultadoEvaluacions) {
		for (ResultadoEvaluacion resultadoEvaluacion : resultadoEvaluacions) {
			if (EntityCacheUtil.getResult(
						ResultadoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
						ResultadoEvaluacionImpl.class,
						resultadoEvaluacion.getPrimaryKey()) == null) {
				cacheResult(resultadoEvaluacion);
			}
			else {
				resultadoEvaluacion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all resultado evaluacions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ResultadoEvaluacionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ResultadoEvaluacionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the resultado evaluacion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ResultadoEvaluacion resultadoEvaluacion) {
		EntityCacheUtil.removeResult(ResultadoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			ResultadoEvaluacionImpl.class, resultadoEvaluacion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ResultadoEvaluacion> resultadoEvaluacions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ResultadoEvaluacion resultadoEvaluacion : resultadoEvaluacions) {
			EntityCacheUtil.removeResult(ResultadoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
				ResultadoEvaluacionImpl.class,
				resultadoEvaluacion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new resultado evaluacion with the primary key. Does not add the resultado evaluacion to the database.
	 *
	 * @param resultadoEvaluacionId the primary key for the new resultado evaluacion
	 * @return the new resultado evaluacion
	 */
	@Override
	public ResultadoEvaluacion create(long resultadoEvaluacionId) {
		ResultadoEvaluacion resultadoEvaluacion = new ResultadoEvaluacionImpl();

		resultadoEvaluacion.setNew(true);
		resultadoEvaluacion.setPrimaryKey(resultadoEvaluacionId);

		return resultadoEvaluacion;
	}

	/**
	 * Removes the resultado evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param resultadoEvaluacionId the primary key of the resultado evaluacion
	 * @return the resultado evaluacion that was removed
	 * @throws com.rec.hitss.layer.NoSuchResultadoEvaluacionException if a resultado evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultadoEvaluacion remove(long resultadoEvaluacionId)
		throws NoSuchResultadoEvaluacionException, SystemException {
		return remove((Serializable)resultadoEvaluacionId);
	}

	/**
	 * Removes the resultado evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the resultado evaluacion
	 * @return the resultado evaluacion that was removed
	 * @throws com.rec.hitss.layer.NoSuchResultadoEvaluacionException if a resultado evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultadoEvaluacion remove(Serializable primaryKey)
		throws NoSuchResultadoEvaluacionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ResultadoEvaluacion resultadoEvaluacion = (ResultadoEvaluacion)session.get(ResultadoEvaluacionImpl.class,
					primaryKey);

			if (resultadoEvaluacion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchResultadoEvaluacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(resultadoEvaluacion);
		}
		catch (NoSuchResultadoEvaluacionException nsee) {
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
	protected ResultadoEvaluacion removeImpl(
		ResultadoEvaluacion resultadoEvaluacion) throws SystemException {
		resultadoEvaluacion = toUnwrappedModel(resultadoEvaluacion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(resultadoEvaluacion)) {
				resultadoEvaluacion = (ResultadoEvaluacion)session.get(ResultadoEvaluacionImpl.class,
						resultadoEvaluacion.getPrimaryKeyObj());
			}

			if (resultadoEvaluacion != null) {
				session.delete(resultadoEvaluacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (resultadoEvaluacion != null) {
			clearCache(resultadoEvaluacion);
		}

		return resultadoEvaluacion;
	}

	@Override
	public ResultadoEvaluacion updateImpl(
		com.rec.hitss.layer.model.ResultadoEvaluacion resultadoEvaluacion)
		throws SystemException {
		resultadoEvaluacion = toUnwrappedModel(resultadoEvaluacion);

		boolean isNew = resultadoEvaluacion.isNew();

		Session session = null;

		try {
			session = openSession();

			if (resultadoEvaluacion.isNew()) {
				session.save(resultadoEvaluacion);

				resultadoEvaluacion.setNew(false);
			}
			else {
				session.merge(resultadoEvaluacion);
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

		EntityCacheUtil.putResult(ResultadoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			ResultadoEvaluacionImpl.class, resultadoEvaluacion.getPrimaryKey(),
			resultadoEvaluacion);

		return resultadoEvaluacion;
	}

	protected ResultadoEvaluacion toUnwrappedModel(
		ResultadoEvaluacion resultadoEvaluacion) {
		if (resultadoEvaluacion instanceof ResultadoEvaluacionImpl) {
			return resultadoEvaluacion;
		}

		ResultadoEvaluacionImpl resultadoEvaluacionImpl = new ResultadoEvaluacionImpl();

		resultadoEvaluacionImpl.setNew(resultadoEvaluacion.isNew());
		resultadoEvaluacionImpl.setPrimaryKey(resultadoEvaluacion.getPrimaryKey());

		resultadoEvaluacionImpl.setResultadoEvaluacionId(resultadoEvaluacion.getResultadoEvaluacionId());
		resultadoEvaluacionImpl.setRespuestaSelccionada(resultadoEvaluacion.getRespuestaSelccionada());
		resultadoEvaluacionImpl.setHabilidadCumplida(resultadoEvaluacion.isHabilidadCumplida());
		resultadoEvaluacionImpl.setEvaluacionId(resultadoEvaluacion.getEvaluacionId());
		resultadoEvaluacionImpl.setUsuarioHitssId(resultadoEvaluacion.getUsuarioHitssId());

		return resultadoEvaluacionImpl;
	}

	/**
	 * Returns the resultado evaluacion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the resultado evaluacion
	 * @return the resultado evaluacion
	 * @throws com.rec.hitss.layer.NoSuchResultadoEvaluacionException if a resultado evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultadoEvaluacion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchResultadoEvaluacionException, SystemException {
		ResultadoEvaluacion resultadoEvaluacion = fetchByPrimaryKey(primaryKey);

		if (resultadoEvaluacion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchResultadoEvaluacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return resultadoEvaluacion;
	}

	/**
	 * Returns the resultado evaluacion with the primary key or throws a {@link com.rec.hitss.layer.NoSuchResultadoEvaluacionException} if it could not be found.
	 *
	 * @param resultadoEvaluacionId the primary key of the resultado evaluacion
	 * @return the resultado evaluacion
	 * @throws com.rec.hitss.layer.NoSuchResultadoEvaluacionException if a resultado evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultadoEvaluacion findByPrimaryKey(long resultadoEvaluacionId)
		throws NoSuchResultadoEvaluacionException, SystemException {
		return findByPrimaryKey((Serializable)resultadoEvaluacionId);
	}

	/**
	 * Returns the resultado evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the resultado evaluacion
	 * @return the resultado evaluacion, or <code>null</code> if a resultado evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultadoEvaluacion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ResultadoEvaluacion resultadoEvaluacion = (ResultadoEvaluacion)EntityCacheUtil.getResult(ResultadoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
				ResultadoEvaluacionImpl.class, primaryKey);

		if (resultadoEvaluacion == _nullResultadoEvaluacion) {
			return null;
		}

		if (resultadoEvaluacion == null) {
			Session session = null;

			try {
				session = openSession();

				resultadoEvaluacion = (ResultadoEvaluacion)session.get(ResultadoEvaluacionImpl.class,
						primaryKey);

				if (resultadoEvaluacion != null) {
					cacheResult(resultadoEvaluacion);
				}
				else {
					EntityCacheUtil.putResult(ResultadoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
						ResultadoEvaluacionImpl.class, primaryKey,
						_nullResultadoEvaluacion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ResultadoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
					ResultadoEvaluacionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return resultadoEvaluacion;
	}

	/**
	 * Returns the resultado evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param resultadoEvaluacionId the primary key of the resultado evaluacion
	 * @return the resultado evaluacion, or <code>null</code> if a resultado evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultadoEvaluacion fetchByPrimaryKey(long resultadoEvaluacionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)resultadoEvaluacionId);
	}

	/**
	 * Returns all the resultado evaluacions.
	 *
	 * @return the resultado evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResultadoEvaluacion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the resultado evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ResultadoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of resultado evaluacions
	 * @param end the upper bound of the range of resultado evaluacions (not inclusive)
	 * @return the range of resultado evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResultadoEvaluacion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the resultado evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ResultadoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of resultado evaluacions
	 * @param end the upper bound of the range of resultado evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of resultado evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResultadoEvaluacion> findAll(int start, int end,
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

		List<ResultadoEvaluacion> list = (List<ResultadoEvaluacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RESULTADOEVALUACION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RESULTADOEVALUACION;

				if (pagination) {
					sql = sql.concat(ResultadoEvaluacionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ResultadoEvaluacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ResultadoEvaluacion>(list);
				}
				else {
					list = (List<ResultadoEvaluacion>)QueryUtil.list(q,
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
	 * Removes all the resultado evaluacions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ResultadoEvaluacion resultadoEvaluacion : findAll()) {
			remove(resultadoEvaluacion);
		}
	}

	/**
	 * Returns the number of resultado evaluacions.
	 *
	 * @return the number of resultado evaluacions
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

				Query q = session.createQuery(_SQL_COUNT_RESULTADOEVALUACION);

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
	 * Initializes the resultado evaluacion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.ResultadoEvaluacion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ResultadoEvaluacion>> listenersList = new ArrayList<ModelListener<ResultadoEvaluacion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ResultadoEvaluacion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ResultadoEvaluacionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_RESULTADOEVALUACION = "SELECT resultadoEvaluacion FROM ResultadoEvaluacion resultadoEvaluacion";
	private static final String _SQL_COUNT_RESULTADOEVALUACION = "SELECT COUNT(resultadoEvaluacion) FROM ResultadoEvaluacion resultadoEvaluacion";
	private static final String _ORDER_BY_ENTITY_ALIAS = "resultadoEvaluacion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ResultadoEvaluacion exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ResultadoEvaluacionPersistenceImpl.class);
	private static ResultadoEvaluacion _nullResultadoEvaluacion = new ResultadoEvaluacionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ResultadoEvaluacion> toCacheModel() {
				return _nullResultadoEvaluacionCacheModel;
			}
		};

	private static CacheModel<ResultadoEvaluacion> _nullResultadoEvaluacionCacheModel =
		new CacheModel<ResultadoEvaluacion>() {
			@Override
			public ResultadoEvaluacion toEntityModel() {
				return _nullResultadoEvaluacion;
			}
		};
}
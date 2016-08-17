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

import com.hitss.layer.NoSuchLogOperacionesException;
import com.hitss.layer.model.LogOperaciones;
import com.hitss.layer.model.impl.LogOperacionesImpl;
import com.hitss.layer.model.impl.LogOperacionesModelImpl;

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
 * The persistence implementation for the log operaciones service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see LogOperacionesPersistence
 * @see LogOperacionesUtil
 * @generated
 */
public class LogOperacionesPersistenceImpl extends BasePersistenceImpl<LogOperaciones>
	implements LogOperacionesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LogOperacionesUtil} to access the log operaciones persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LogOperacionesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LogOperacionesModelImpl.ENTITY_CACHE_ENABLED,
			LogOperacionesModelImpl.FINDER_CACHE_ENABLED,
			LogOperacionesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LogOperacionesModelImpl.ENTITY_CACHE_ENABLED,
			LogOperacionesModelImpl.FINDER_CACHE_ENABLED,
			LogOperacionesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LogOperacionesModelImpl.ENTITY_CACHE_ENABLED,
			LogOperacionesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LogOperacionesPersistenceImpl() {
		setModelClass(LogOperaciones.class);
	}

	/**
	 * Caches the log operaciones in the entity cache if it is enabled.
	 *
	 * @param logOperaciones the log operaciones
	 */
	@Override
	public void cacheResult(LogOperaciones logOperaciones) {
		EntityCacheUtil.putResult(LogOperacionesModelImpl.ENTITY_CACHE_ENABLED,
			LogOperacionesImpl.class, logOperaciones.getPrimaryKey(),
			logOperaciones);

		logOperaciones.resetOriginalValues();
	}

	/**
	 * Caches the log operacioneses in the entity cache if it is enabled.
	 *
	 * @param logOperacioneses the log operacioneses
	 */
	@Override
	public void cacheResult(List<LogOperaciones> logOperacioneses) {
		for (LogOperaciones logOperaciones : logOperacioneses) {
			if (EntityCacheUtil.getResult(
						LogOperacionesModelImpl.ENTITY_CACHE_ENABLED,
						LogOperacionesImpl.class, logOperaciones.getPrimaryKey()) == null) {
				cacheResult(logOperaciones);
			}
			else {
				logOperaciones.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all log operacioneses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LogOperacionesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LogOperacionesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the log operaciones.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LogOperaciones logOperaciones) {
		EntityCacheUtil.removeResult(LogOperacionesModelImpl.ENTITY_CACHE_ENABLED,
			LogOperacionesImpl.class, logOperaciones.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LogOperaciones> logOperacioneses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LogOperaciones logOperaciones : logOperacioneses) {
			EntityCacheUtil.removeResult(LogOperacionesModelImpl.ENTITY_CACHE_ENABLED,
				LogOperacionesImpl.class, logOperaciones.getPrimaryKey());
		}
	}

	/**
	 * Creates a new log operaciones with the primary key. Does not add the log operaciones to the database.
	 *
	 * @param logOperacionesId the primary key for the new log operaciones
	 * @return the new log operaciones
	 */
	@Override
	public LogOperaciones create(long logOperacionesId) {
		LogOperaciones logOperaciones = new LogOperacionesImpl();

		logOperaciones.setNew(true);
		logOperaciones.setPrimaryKey(logOperacionesId);

		return logOperaciones;
	}

	/**
	 * Removes the log operaciones with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param logOperacionesId the primary key of the log operaciones
	 * @return the log operaciones that was removed
	 * @throws com.hitss.layer.NoSuchLogOperacionesException if a log operaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LogOperaciones remove(long logOperacionesId)
		throws NoSuchLogOperacionesException, SystemException {
		return remove((Serializable)logOperacionesId);
	}

	/**
	 * Removes the log operaciones with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the log operaciones
	 * @return the log operaciones that was removed
	 * @throws com.hitss.layer.NoSuchLogOperacionesException if a log operaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LogOperaciones remove(Serializable primaryKey)
		throws NoSuchLogOperacionesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LogOperaciones logOperaciones = (LogOperaciones)session.get(LogOperacionesImpl.class,
					primaryKey);

			if (logOperaciones == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLogOperacionesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(logOperaciones);
		}
		catch (NoSuchLogOperacionesException nsee) {
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
	protected LogOperaciones removeImpl(LogOperaciones logOperaciones)
		throws SystemException {
		logOperaciones = toUnwrappedModel(logOperaciones);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(logOperaciones)) {
				logOperaciones = (LogOperaciones)session.get(LogOperacionesImpl.class,
						logOperaciones.getPrimaryKeyObj());
			}

			if (logOperaciones != null) {
				session.delete(logOperaciones);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (logOperaciones != null) {
			clearCache(logOperaciones);
		}

		return logOperaciones;
	}

	@Override
	public LogOperaciones updateImpl(
		com.hitss.layer.model.LogOperaciones logOperaciones)
		throws SystemException {
		logOperaciones = toUnwrappedModel(logOperaciones);

		boolean isNew = logOperaciones.isNew();

		Session session = null;

		try {
			session = openSession();

			if (logOperaciones.isNew()) {
				session.save(logOperaciones);

				logOperaciones.setNew(false);
			}
			else {
				session.merge(logOperaciones);
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

		EntityCacheUtil.putResult(LogOperacionesModelImpl.ENTITY_CACHE_ENABLED,
			LogOperacionesImpl.class, logOperaciones.getPrimaryKey(),
			logOperaciones);

		return logOperaciones;
	}

	protected LogOperaciones toUnwrappedModel(LogOperaciones logOperaciones) {
		if (logOperaciones instanceof LogOperacionesImpl) {
			return logOperaciones;
		}

		LogOperacionesImpl logOperacionesImpl = new LogOperacionesImpl();

		logOperacionesImpl.setNew(logOperaciones.isNew());
		logOperacionesImpl.setPrimaryKey(logOperaciones.getPrimaryKey());

		logOperacionesImpl.setLogOperacionesId(logOperaciones.getLogOperacionesId());
		logOperacionesImpl.setTipoActividad(logOperaciones.getTipoActividad());
		logOperacionesImpl.setActividad(logOperaciones.getActividad());
		logOperacionesImpl.setUsuario(logOperaciones.getUsuario());
		logOperacionesImpl.setActivo(logOperaciones.isActivo());
		logOperacionesImpl.setUsuariocrea(logOperaciones.getUsuariocrea());
		logOperacionesImpl.setFechacrea(logOperaciones.getFechacrea());
		logOperacionesImpl.setUsuariomodifica(logOperaciones.getUsuariomodifica());
		logOperacionesImpl.setFechamodifica(logOperaciones.getFechamodifica());

		return logOperacionesImpl;
	}

	/**
	 * Returns the log operaciones with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the log operaciones
	 * @return the log operaciones
	 * @throws com.hitss.layer.NoSuchLogOperacionesException if a log operaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LogOperaciones findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLogOperacionesException, SystemException {
		LogOperaciones logOperaciones = fetchByPrimaryKey(primaryKey);

		if (logOperaciones == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLogOperacionesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return logOperaciones;
	}

	/**
	 * Returns the log operaciones with the primary key or throws a {@link com.hitss.layer.NoSuchLogOperacionesException} if it could not be found.
	 *
	 * @param logOperacionesId the primary key of the log operaciones
	 * @return the log operaciones
	 * @throws com.hitss.layer.NoSuchLogOperacionesException if a log operaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LogOperaciones findByPrimaryKey(long logOperacionesId)
		throws NoSuchLogOperacionesException, SystemException {
		return findByPrimaryKey((Serializable)logOperacionesId);
	}

	/**
	 * Returns the log operaciones with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the log operaciones
	 * @return the log operaciones, or <code>null</code> if a log operaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LogOperaciones fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LogOperaciones logOperaciones = (LogOperaciones)EntityCacheUtil.getResult(LogOperacionesModelImpl.ENTITY_CACHE_ENABLED,
				LogOperacionesImpl.class, primaryKey);

		if (logOperaciones == _nullLogOperaciones) {
			return null;
		}

		if (logOperaciones == null) {
			Session session = null;

			try {
				session = openSession();

				logOperaciones = (LogOperaciones)session.get(LogOperacionesImpl.class,
						primaryKey);

				if (logOperaciones != null) {
					cacheResult(logOperaciones);
				}
				else {
					EntityCacheUtil.putResult(LogOperacionesModelImpl.ENTITY_CACHE_ENABLED,
						LogOperacionesImpl.class, primaryKey,
						_nullLogOperaciones);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LogOperacionesModelImpl.ENTITY_CACHE_ENABLED,
					LogOperacionesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return logOperaciones;
	}

	/**
	 * Returns the log operaciones with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param logOperacionesId the primary key of the log operaciones
	 * @return the log operaciones, or <code>null</code> if a log operaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LogOperaciones fetchByPrimaryKey(long logOperacionesId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)logOperacionesId);
	}

	/**
	 * Returns all the log operacioneses.
	 *
	 * @return the log operacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LogOperaciones> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the log operacioneses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.LogOperacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of log operacioneses
	 * @param end the upper bound of the range of log operacioneses (not inclusive)
	 * @return the range of log operacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LogOperaciones> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the log operacioneses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.LogOperacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of log operacioneses
	 * @param end the upper bound of the range of log operacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of log operacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LogOperaciones> findAll(int start, int end,
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

		List<LogOperaciones> list = (List<LogOperaciones>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LOGOPERACIONES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOGOPERACIONES;

				if (pagination) {
					sql = sql.concat(LogOperacionesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LogOperaciones>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LogOperaciones>(list);
				}
				else {
					list = (List<LogOperaciones>)QueryUtil.list(q,
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
	 * Removes all the log operacioneses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LogOperaciones logOperaciones : findAll()) {
			remove(logOperaciones);
		}
	}

	/**
	 * Returns the number of log operacioneses.
	 *
	 * @return the number of log operacioneses
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

				Query q = session.createQuery(_SQL_COUNT_LOGOPERACIONES);

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
	 * Initializes the log operaciones persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.LogOperaciones")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LogOperaciones>> listenersList = new ArrayList<ModelListener<LogOperaciones>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LogOperaciones>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LogOperacionesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LOGOPERACIONES = "SELECT logOperaciones FROM LogOperaciones logOperaciones";
	private static final String _SQL_COUNT_LOGOPERACIONES = "SELECT COUNT(logOperaciones) FROM LogOperaciones logOperaciones";
	private static final String _ORDER_BY_ENTITY_ALIAS = "logOperaciones.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LogOperaciones exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LogOperacionesPersistenceImpl.class);
	private static LogOperaciones _nullLogOperaciones = new LogOperacionesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LogOperaciones> toCacheModel() {
				return _nullLogOperacionesCacheModel;
			}
		};

	private static CacheModel<LogOperaciones> _nullLogOperacionesCacheModel = new CacheModel<LogOperaciones>() {
			@Override
			public LogOperaciones toEntityModel() {
				return _nullLogOperaciones;
			}
		};
}
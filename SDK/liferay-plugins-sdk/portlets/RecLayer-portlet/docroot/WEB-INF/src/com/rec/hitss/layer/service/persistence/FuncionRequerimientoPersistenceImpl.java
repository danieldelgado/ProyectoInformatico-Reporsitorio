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

import com.rec.hitss.layer.NoSuchFuncionRequerimientoException;
import com.rec.hitss.layer.model.FuncionRequerimiento;
import com.rec.hitss.layer.model.impl.FuncionRequerimientoImpl;
import com.rec.hitss.layer.model.impl.FuncionRequerimientoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the funcion requerimiento service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see FuncionRequerimientoPersistence
 * @see FuncionRequerimientoUtil
 * @generated
 */
public class FuncionRequerimientoPersistenceImpl extends BasePersistenceImpl<FuncionRequerimiento>
	implements FuncionRequerimientoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FuncionRequerimientoUtil} to access the funcion requerimiento persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FuncionRequerimientoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FuncionRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			FuncionRequerimientoModelImpl.FINDER_CACHE_ENABLED,
			FuncionRequerimientoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FuncionRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			FuncionRequerimientoModelImpl.FINDER_CACHE_ENABLED,
			FuncionRequerimientoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FuncionRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			FuncionRequerimientoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public FuncionRequerimientoPersistenceImpl() {
		setModelClass(FuncionRequerimiento.class);
	}

	/**
	 * Caches the funcion requerimiento in the entity cache if it is enabled.
	 *
	 * @param funcionRequerimiento the funcion requerimiento
	 */
	@Override
	public void cacheResult(FuncionRequerimiento funcionRequerimiento) {
		EntityCacheUtil.putResult(FuncionRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			FuncionRequerimientoImpl.class,
			funcionRequerimiento.getPrimaryKey(), funcionRequerimiento);

		funcionRequerimiento.resetOriginalValues();
	}

	/**
	 * Caches the funcion requerimientos in the entity cache if it is enabled.
	 *
	 * @param funcionRequerimientos the funcion requerimientos
	 */
	@Override
	public void cacheResult(List<FuncionRequerimiento> funcionRequerimientos) {
		for (FuncionRequerimiento funcionRequerimiento : funcionRequerimientos) {
			if (EntityCacheUtil.getResult(
						FuncionRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
						FuncionRequerimientoImpl.class,
						funcionRequerimiento.getPrimaryKey()) == null) {
				cacheResult(funcionRequerimiento);
			}
			else {
				funcionRequerimiento.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all funcion requerimientos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FuncionRequerimientoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FuncionRequerimientoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the funcion requerimiento.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FuncionRequerimiento funcionRequerimiento) {
		EntityCacheUtil.removeResult(FuncionRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			FuncionRequerimientoImpl.class, funcionRequerimiento.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FuncionRequerimiento> funcionRequerimientos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FuncionRequerimiento funcionRequerimiento : funcionRequerimientos) {
			EntityCacheUtil.removeResult(FuncionRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
				FuncionRequerimientoImpl.class,
				funcionRequerimiento.getPrimaryKey());
		}
	}

	/**
	 * Creates a new funcion requerimiento with the primary key. Does not add the funcion requerimiento to the database.
	 *
	 * @param funcionId the primary key for the new funcion requerimiento
	 * @return the new funcion requerimiento
	 */
	@Override
	public FuncionRequerimiento create(long funcionId) {
		FuncionRequerimiento funcionRequerimiento = new FuncionRequerimientoImpl();

		funcionRequerimiento.setNew(true);
		funcionRequerimiento.setPrimaryKey(funcionId);

		return funcionRequerimiento;
	}

	/**
	 * Removes the funcion requerimiento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param funcionId the primary key of the funcion requerimiento
	 * @return the funcion requerimiento that was removed
	 * @throws com.rec.hitss.layer.NoSuchFuncionRequerimientoException if a funcion requerimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuncionRequerimiento remove(long funcionId)
		throws NoSuchFuncionRequerimientoException, SystemException {
		return remove((Serializable)funcionId);
	}

	/**
	 * Removes the funcion requerimiento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the funcion requerimiento
	 * @return the funcion requerimiento that was removed
	 * @throws com.rec.hitss.layer.NoSuchFuncionRequerimientoException if a funcion requerimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuncionRequerimiento remove(Serializable primaryKey)
		throws NoSuchFuncionRequerimientoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FuncionRequerimiento funcionRequerimiento = (FuncionRequerimiento)session.get(FuncionRequerimientoImpl.class,
					primaryKey);

			if (funcionRequerimiento == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFuncionRequerimientoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(funcionRequerimiento);
		}
		catch (NoSuchFuncionRequerimientoException nsee) {
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
	protected FuncionRequerimiento removeImpl(
		FuncionRequerimiento funcionRequerimiento) throws SystemException {
		funcionRequerimiento = toUnwrappedModel(funcionRequerimiento);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(funcionRequerimiento)) {
				funcionRequerimiento = (FuncionRequerimiento)session.get(FuncionRequerimientoImpl.class,
						funcionRequerimiento.getPrimaryKeyObj());
			}

			if (funcionRequerimiento != null) {
				session.delete(funcionRequerimiento);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (funcionRequerimiento != null) {
			clearCache(funcionRequerimiento);
		}

		return funcionRequerimiento;
	}

	@Override
	public FuncionRequerimiento updateImpl(
		com.rec.hitss.layer.model.FuncionRequerimiento funcionRequerimiento)
		throws SystemException {
		funcionRequerimiento = toUnwrappedModel(funcionRequerimiento);

		boolean isNew = funcionRequerimiento.isNew();

		Session session = null;

		try {
			session = openSession();

			if (funcionRequerimiento.isNew()) {
				session.save(funcionRequerimiento);

				funcionRequerimiento.setNew(false);
			}
			else {
				session.merge(funcionRequerimiento);
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

		EntityCacheUtil.putResult(FuncionRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
			FuncionRequerimientoImpl.class,
			funcionRequerimiento.getPrimaryKey(), funcionRequerimiento);

		return funcionRequerimiento;
	}

	protected FuncionRequerimiento toUnwrappedModel(
		FuncionRequerimiento funcionRequerimiento) {
		if (funcionRequerimiento instanceof FuncionRequerimientoImpl) {
			return funcionRequerimiento;
		}

		FuncionRequerimientoImpl funcionRequerimientoImpl = new FuncionRequerimientoImpl();

		funcionRequerimientoImpl.setNew(funcionRequerimiento.isNew());
		funcionRequerimientoImpl.setPrimaryKey(funcionRequerimiento.getPrimaryKey());

		funcionRequerimientoImpl.setFuncionId(funcionRequerimiento.getFuncionId());
		funcionRequerimientoImpl.setRequerimientoRecursoId(funcionRequerimiento.getRequerimientoRecursoId());

		return funcionRequerimientoImpl;
	}

	/**
	 * Returns the funcion requerimiento with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the funcion requerimiento
	 * @return the funcion requerimiento
	 * @throws com.rec.hitss.layer.NoSuchFuncionRequerimientoException if a funcion requerimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuncionRequerimiento findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFuncionRequerimientoException, SystemException {
		FuncionRequerimiento funcionRequerimiento = fetchByPrimaryKey(primaryKey);

		if (funcionRequerimiento == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFuncionRequerimientoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return funcionRequerimiento;
	}

	/**
	 * Returns the funcion requerimiento with the primary key or throws a {@link com.rec.hitss.layer.NoSuchFuncionRequerimientoException} if it could not be found.
	 *
	 * @param funcionId the primary key of the funcion requerimiento
	 * @return the funcion requerimiento
	 * @throws com.rec.hitss.layer.NoSuchFuncionRequerimientoException if a funcion requerimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuncionRequerimiento findByPrimaryKey(long funcionId)
		throws NoSuchFuncionRequerimientoException, SystemException {
		return findByPrimaryKey((Serializable)funcionId);
	}

	/**
	 * Returns the funcion requerimiento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the funcion requerimiento
	 * @return the funcion requerimiento, or <code>null</code> if a funcion requerimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuncionRequerimiento fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		FuncionRequerimiento funcionRequerimiento = (FuncionRequerimiento)EntityCacheUtil.getResult(FuncionRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
				FuncionRequerimientoImpl.class, primaryKey);

		if (funcionRequerimiento == _nullFuncionRequerimiento) {
			return null;
		}

		if (funcionRequerimiento == null) {
			Session session = null;

			try {
				session = openSession();

				funcionRequerimiento = (FuncionRequerimiento)session.get(FuncionRequerimientoImpl.class,
						primaryKey);

				if (funcionRequerimiento != null) {
					cacheResult(funcionRequerimiento);
				}
				else {
					EntityCacheUtil.putResult(FuncionRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
						FuncionRequerimientoImpl.class, primaryKey,
						_nullFuncionRequerimiento);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FuncionRequerimientoModelImpl.ENTITY_CACHE_ENABLED,
					FuncionRequerimientoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return funcionRequerimiento;
	}

	/**
	 * Returns the funcion requerimiento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param funcionId the primary key of the funcion requerimiento
	 * @return the funcion requerimiento, or <code>null</code> if a funcion requerimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuncionRequerimiento fetchByPrimaryKey(long funcionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)funcionId);
	}

	/**
	 * Returns all the funcion requerimientos.
	 *
	 * @return the funcion requerimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FuncionRequerimiento> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the funcion requerimientos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.FuncionRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of funcion requerimientos
	 * @param end the upper bound of the range of funcion requerimientos (not inclusive)
	 * @return the range of funcion requerimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FuncionRequerimiento> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the funcion requerimientos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.FuncionRequerimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of funcion requerimientos
	 * @param end the upper bound of the range of funcion requerimientos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of funcion requerimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FuncionRequerimiento> findAll(int start, int end,
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

		List<FuncionRequerimiento> list = (List<FuncionRequerimiento>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FUNCIONREQUERIMIENTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FUNCIONREQUERIMIENTO;

				if (pagination) {
					sql = sql.concat(FuncionRequerimientoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FuncionRequerimiento>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FuncionRequerimiento>(list);
				}
				else {
					list = (List<FuncionRequerimiento>)QueryUtil.list(q,
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
	 * Removes all the funcion requerimientos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (FuncionRequerimiento funcionRequerimiento : findAll()) {
			remove(funcionRequerimiento);
		}
	}

	/**
	 * Returns the number of funcion requerimientos.
	 *
	 * @return the number of funcion requerimientos
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

				Query q = session.createQuery(_SQL_COUNT_FUNCIONREQUERIMIENTO);

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
	 * Initializes the funcion requerimiento persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.FuncionRequerimiento")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FuncionRequerimiento>> listenersList = new ArrayList<ModelListener<FuncionRequerimiento>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FuncionRequerimiento>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FuncionRequerimientoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FUNCIONREQUERIMIENTO = "SELECT funcionRequerimiento FROM FuncionRequerimiento funcionRequerimiento";
	private static final String _SQL_COUNT_FUNCIONREQUERIMIENTO = "SELECT COUNT(funcionRequerimiento) FROM FuncionRequerimiento funcionRequerimiento";
	private static final String _ORDER_BY_ENTITY_ALIAS = "funcionRequerimiento.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FuncionRequerimiento exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FuncionRequerimientoPersistenceImpl.class);
	private static FuncionRequerimiento _nullFuncionRequerimiento = new FuncionRequerimientoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FuncionRequerimiento> toCacheModel() {
				return _nullFuncionRequerimientoCacheModel;
			}
		};

	private static CacheModel<FuncionRequerimiento> _nullFuncionRequerimientoCacheModel =
		new CacheModel<FuncionRequerimiento>() {
			@Override
			public FuncionRequerimiento toEntityModel() {
				return _nullFuncionRequerimiento;
			}
		};
}
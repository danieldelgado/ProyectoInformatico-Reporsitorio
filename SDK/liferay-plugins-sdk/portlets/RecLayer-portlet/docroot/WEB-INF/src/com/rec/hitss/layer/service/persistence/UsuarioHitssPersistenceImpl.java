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

import com.rec.hitss.layer.NoSuchUsuarioHitssException;
import com.rec.hitss.layer.model.UsuarioHitss;
import com.rec.hitss.layer.model.impl.UsuarioHitssImpl;
import com.rec.hitss.layer.model.impl.UsuarioHitssModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the usuario hitss service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see UsuarioHitssPersistence
 * @see UsuarioHitssUtil
 * @generated
 */
public class UsuarioHitssPersistenceImpl extends BasePersistenceImpl<UsuarioHitss>
	implements UsuarioHitssPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UsuarioHitssUtil} to access the usuario hitss persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UsuarioHitssImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UsuarioHitssModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioHitssModelImpl.FINDER_CACHE_ENABLED, UsuarioHitssImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UsuarioHitssModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioHitssModelImpl.FINDER_CACHE_ENABLED, UsuarioHitssImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UsuarioHitssModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioHitssModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public UsuarioHitssPersistenceImpl() {
		setModelClass(UsuarioHitss.class);
	}

	/**
	 * Caches the usuario hitss in the entity cache if it is enabled.
	 *
	 * @param usuarioHitss the usuario hitss
	 */
	@Override
	public void cacheResult(UsuarioHitss usuarioHitss) {
		EntityCacheUtil.putResult(UsuarioHitssModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioHitssImpl.class, usuarioHitss.getPrimaryKey(), usuarioHitss);

		usuarioHitss.resetOriginalValues();
	}

	/**
	 * Caches the usuario hitsses in the entity cache if it is enabled.
	 *
	 * @param usuarioHitsses the usuario hitsses
	 */
	@Override
	public void cacheResult(List<UsuarioHitss> usuarioHitsses) {
		for (UsuarioHitss usuarioHitss : usuarioHitsses) {
			if (EntityCacheUtil.getResult(
						UsuarioHitssModelImpl.ENTITY_CACHE_ENABLED,
						UsuarioHitssImpl.class, usuarioHitss.getPrimaryKey()) == null) {
				cacheResult(usuarioHitss);
			}
			else {
				usuarioHitss.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all usuario hitsses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UsuarioHitssImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UsuarioHitssImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the usuario hitss.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UsuarioHitss usuarioHitss) {
		EntityCacheUtil.removeResult(UsuarioHitssModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioHitssImpl.class, usuarioHitss.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UsuarioHitss> usuarioHitsses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UsuarioHitss usuarioHitss : usuarioHitsses) {
			EntityCacheUtil.removeResult(UsuarioHitssModelImpl.ENTITY_CACHE_ENABLED,
				UsuarioHitssImpl.class, usuarioHitss.getPrimaryKey());
		}
	}

	/**
	 * Creates a new usuario hitss with the primary key. Does not add the usuario hitss to the database.
	 *
	 * @param usuarioHitssId the primary key for the new usuario hitss
	 * @return the new usuario hitss
	 */
	@Override
	public UsuarioHitss create(long usuarioHitssId) {
		UsuarioHitss usuarioHitss = new UsuarioHitssImpl();

		usuarioHitss.setNew(true);
		usuarioHitss.setPrimaryKey(usuarioHitssId);

		return usuarioHitss;
	}

	/**
	 * Removes the usuario hitss with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param usuarioHitssId the primary key of the usuario hitss
	 * @return the usuario hitss that was removed
	 * @throws com.rec.hitss.layer.NoSuchUsuarioHitssException if a usuario hitss with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioHitss remove(long usuarioHitssId)
		throws NoSuchUsuarioHitssException, SystemException {
		return remove((Serializable)usuarioHitssId);
	}

	/**
	 * Removes the usuario hitss with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the usuario hitss
	 * @return the usuario hitss that was removed
	 * @throws com.rec.hitss.layer.NoSuchUsuarioHitssException if a usuario hitss with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioHitss remove(Serializable primaryKey)
		throws NoSuchUsuarioHitssException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UsuarioHitss usuarioHitss = (UsuarioHitss)session.get(UsuarioHitssImpl.class,
					primaryKey);

			if (usuarioHitss == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUsuarioHitssException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(usuarioHitss);
		}
		catch (NoSuchUsuarioHitssException nsee) {
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
	protected UsuarioHitss removeImpl(UsuarioHitss usuarioHitss)
		throws SystemException {
		usuarioHitss = toUnwrappedModel(usuarioHitss);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(usuarioHitss)) {
				usuarioHitss = (UsuarioHitss)session.get(UsuarioHitssImpl.class,
						usuarioHitss.getPrimaryKeyObj());
			}

			if (usuarioHitss != null) {
				session.delete(usuarioHitss);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (usuarioHitss != null) {
			clearCache(usuarioHitss);
		}

		return usuarioHitss;
	}

	@Override
	public UsuarioHitss updateImpl(
		com.rec.hitss.layer.model.UsuarioHitss usuarioHitss)
		throws SystemException {
		usuarioHitss = toUnwrappedModel(usuarioHitss);

		boolean isNew = usuarioHitss.isNew();

		Session session = null;

		try {
			session = openSession();

			if (usuarioHitss.isNew()) {
				session.save(usuarioHitss);

				usuarioHitss.setNew(false);
			}
			else {
				session.merge(usuarioHitss);
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

		EntityCacheUtil.putResult(UsuarioHitssModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioHitssImpl.class, usuarioHitss.getPrimaryKey(), usuarioHitss);

		return usuarioHitss;
	}

	protected UsuarioHitss toUnwrappedModel(UsuarioHitss usuarioHitss) {
		if (usuarioHitss instanceof UsuarioHitssImpl) {
			return usuarioHitss;
		}

		UsuarioHitssImpl usuarioHitssImpl = new UsuarioHitssImpl();

		usuarioHitssImpl.setNew(usuarioHitss.isNew());
		usuarioHitssImpl.setPrimaryKey(usuarioHitss.getPrimaryKey());

		usuarioHitssImpl.setUsuarioHitssId(usuarioHitss.getUsuarioHitssId());
		usuarioHitssImpl.setUserId(usuarioHitss.getUserId());
		usuarioHitssImpl.setUserUuId(usuarioHitss.getUserUuId());
		usuarioHitssImpl.setActividadPlanId(usuarioHitss.getActividadPlanId());

		return usuarioHitssImpl;
	}

	/**
	 * Returns the usuario hitss with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the usuario hitss
	 * @return the usuario hitss
	 * @throws com.rec.hitss.layer.NoSuchUsuarioHitssException if a usuario hitss with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioHitss findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUsuarioHitssException, SystemException {
		UsuarioHitss usuarioHitss = fetchByPrimaryKey(primaryKey);

		if (usuarioHitss == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUsuarioHitssException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return usuarioHitss;
	}

	/**
	 * Returns the usuario hitss with the primary key or throws a {@link com.rec.hitss.layer.NoSuchUsuarioHitssException} if it could not be found.
	 *
	 * @param usuarioHitssId the primary key of the usuario hitss
	 * @return the usuario hitss
	 * @throws com.rec.hitss.layer.NoSuchUsuarioHitssException if a usuario hitss with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioHitss findByPrimaryKey(long usuarioHitssId)
		throws NoSuchUsuarioHitssException, SystemException {
		return findByPrimaryKey((Serializable)usuarioHitssId);
	}

	/**
	 * Returns the usuario hitss with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the usuario hitss
	 * @return the usuario hitss, or <code>null</code> if a usuario hitss with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioHitss fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UsuarioHitss usuarioHitss = (UsuarioHitss)EntityCacheUtil.getResult(UsuarioHitssModelImpl.ENTITY_CACHE_ENABLED,
				UsuarioHitssImpl.class, primaryKey);

		if (usuarioHitss == _nullUsuarioHitss) {
			return null;
		}

		if (usuarioHitss == null) {
			Session session = null;

			try {
				session = openSession();

				usuarioHitss = (UsuarioHitss)session.get(UsuarioHitssImpl.class,
						primaryKey);

				if (usuarioHitss != null) {
					cacheResult(usuarioHitss);
				}
				else {
					EntityCacheUtil.putResult(UsuarioHitssModelImpl.ENTITY_CACHE_ENABLED,
						UsuarioHitssImpl.class, primaryKey, _nullUsuarioHitss);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UsuarioHitssModelImpl.ENTITY_CACHE_ENABLED,
					UsuarioHitssImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return usuarioHitss;
	}

	/**
	 * Returns the usuario hitss with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param usuarioHitssId the primary key of the usuario hitss
	 * @return the usuario hitss, or <code>null</code> if a usuario hitss with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioHitss fetchByPrimaryKey(long usuarioHitssId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)usuarioHitssId);
	}

	/**
	 * Returns all the usuario hitsses.
	 *
	 * @return the usuario hitsses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UsuarioHitss> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the usuario hitsses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.UsuarioHitssModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuario hitsses
	 * @param end the upper bound of the range of usuario hitsses (not inclusive)
	 * @return the range of usuario hitsses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UsuarioHitss> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the usuario hitsses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.UsuarioHitssModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuario hitsses
	 * @param end the upper bound of the range of usuario hitsses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of usuario hitsses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UsuarioHitss> findAll(int start, int end,
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

		List<UsuarioHitss> list = (List<UsuarioHitss>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USUARIOHITSS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USUARIOHITSS;

				if (pagination) {
					sql = sql.concat(UsuarioHitssModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UsuarioHitss>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UsuarioHitss>(list);
				}
				else {
					list = (List<UsuarioHitss>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the usuario hitsses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UsuarioHitss usuarioHitss : findAll()) {
			remove(usuarioHitss);
		}
	}

	/**
	 * Returns the number of usuario hitsses.
	 *
	 * @return the number of usuario hitsses
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

				Query q = session.createQuery(_SQL_COUNT_USUARIOHITSS);

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
	 * Initializes the usuario hitss persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.UsuarioHitss")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UsuarioHitss>> listenersList = new ArrayList<ModelListener<UsuarioHitss>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UsuarioHitss>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UsuarioHitssImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USUARIOHITSS = "SELECT usuarioHitss FROM UsuarioHitss usuarioHitss";
	private static final String _SQL_COUNT_USUARIOHITSS = "SELECT COUNT(usuarioHitss) FROM UsuarioHitss usuarioHitss";
	private static final String _ORDER_BY_ENTITY_ALIAS = "usuarioHitss.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UsuarioHitss exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UsuarioHitssPersistenceImpl.class);
	private static UsuarioHitss _nullUsuarioHitss = new UsuarioHitssImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UsuarioHitss> toCacheModel() {
				return _nullUsuarioHitssCacheModel;
			}
		};

	private static CacheModel<UsuarioHitss> _nullUsuarioHitssCacheModel = new CacheModel<UsuarioHitss>() {
			@Override
			public UsuarioHitss toEntityModel() {
				return _nullUsuarioHitss;
			}
		};
}
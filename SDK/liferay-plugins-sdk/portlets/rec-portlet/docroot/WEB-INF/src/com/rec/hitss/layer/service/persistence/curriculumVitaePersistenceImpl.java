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

import com.rec.hitss.layer.NoSuchcurriculumVitaeException;
import com.rec.hitss.layer.model.curriculumVitae;
import com.rec.hitss.layer.model.impl.curriculumVitaeImpl;
import com.rec.hitss.layer.model.impl.curriculumVitaeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the curriculum vitae service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see curriculumVitaePersistence
 * @see curriculumVitaeUtil
 * @generated
 */
public class curriculumVitaePersistenceImpl extends BasePersistenceImpl<curriculumVitae>
	implements curriculumVitaePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link curriculumVitaeUtil} to access the curriculum vitae persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = curriculumVitaeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(curriculumVitaeModelImpl.ENTITY_CACHE_ENABLED,
			curriculumVitaeModelImpl.FINDER_CACHE_ENABLED,
			curriculumVitaeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(curriculumVitaeModelImpl.ENTITY_CACHE_ENABLED,
			curriculumVitaeModelImpl.FINDER_CACHE_ENABLED,
			curriculumVitaeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(curriculumVitaeModelImpl.ENTITY_CACHE_ENABLED,
			curriculumVitaeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public curriculumVitaePersistenceImpl() {
		setModelClass(curriculumVitae.class);
	}

	/**
	 * Caches the curriculum vitae in the entity cache if it is enabled.
	 *
	 * @param curriculumVitae the curriculum vitae
	 */
	@Override
	public void cacheResult(curriculumVitae curriculumVitae) {
		EntityCacheUtil.putResult(curriculumVitaeModelImpl.ENTITY_CACHE_ENABLED,
			curriculumVitaeImpl.class, curriculumVitae.getPrimaryKey(),
			curriculumVitae);

		curriculumVitae.resetOriginalValues();
	}

	/**
	 * Caches the curriculum vitaes in the entity cache if it is enabled.
	 *
	 * @param curriculumVitaes the curriculum vitaes
	 */
	@Override
	public void cacheResult(List<curriculumVitae> curriculumVitaes) {
		for (curriculumVitae curriculumVitae : curriculumVitaes) {
			if (EntityCacheUtil.getResult(
						curriculumVitaeModelImpl.ENTITY_CACHE_ENABLED,
						curriculumVitaeImpl.class,
						curriculumVitae.getPrimaryKey()) == null) {
				cacheResult(curriculumVitae);
			}
			else {
				curriculumVitae.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all curriculum vitaes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(curriculumVitaeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(curriculumVitaeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the curriculum vitae.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(curriculumVitae curriculumVitae) {
		EntityCacheUtil.removeResult(curriculumVitaeModelImpl.ENTITY_CACHE_ENABLED,
			curriculumVitaeImpl.class, curriculumVitae.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<curriculumVitae> curriculumVitaes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (curriculumVitae curriculumVitae : curriculumVitaes) {
			EntityCacheUtil.removeResult(curriculumVitaeModelImpl.ENTITY_CACHE_ENABLED,
				curriculumVitaeImpl.class, curriculumVitae.getPrimaryKey());
		}
	}

	/**
	 * Creates a new curriculum vitae with the primary key. Does not add the curriculum vitae to the database.
	 *
	 * @param CV_ID the primary key for the new curriculum vitae
	 * @return the new curriculum vitae
	 */
	@Override
	public curriculumVitae create(long CV_ID) {
		curriculumVitae curriculumVitae = new curriculumVitaeImpl();

		curriculumVitae.setNew(true);
		curriculumVitae.setPrimaryKey(CV_ID);

		return curriculumVitae;
	}

	/**
	 * Removes the curriculum vitae with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CV_ID the primary key of the curriculum vitae
	 * @return the curriculum vitae that was removed
	 * @throws com.rec.hitss.layer.NoSuchcurriculumVitaeException if a curriculum vitae with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public curriculumVitae remove(long CV_ID)
		throws NoSuchcurriculumVitaeException, SystemException {
		return remove((Serializable)CV_ID);
	}

	/**
	 * Removes the curriculum vitae with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the curriculum vitae
	 * @return the curriculum vitae that was removed
	 * @throws com.rec.hitss.layer.NoSuchcurriculumVitaeException if a curriculum vitae with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public curriculumVitae remove(Serializable primaryKey)
		throws NoSuchcurriculumVitaeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			curriculumVitae curriculumVitae = (curriculumVitae)session.get(curriculumVitaeImpl.class,
					primaryKey);

			if (curriculumVitae == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcurriculumVitaeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(curriculumVitae);
		}
		catch (NoSuchcurriculumVitaeException nsee) {
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
	protected curriculumVitae removeImpl(curriculumVitae curriculumVitae)
		throws SystemException {
		curriculumVitae = toUnwrappedModel(curriculumVitae);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(curriculumVitae)) {
				curriculumVitae = (curriculumVitae)session.get(curriculumVitaeImpl.class,
						curriculumVitae.getPrimaryKeyObj());
			}

			if (curriculumVitae != null) {
				session.delete(curriculumVitae);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (curriculumVitae != null) {
			clearCache(curriculumVitae);
		}

		return curriculumVitae;
	}

	@Override
	public curriculumVitae updateImpl(
		com.rec.hitss.layer.model.curriculumVitae curriculumVitae)
		throws SystemException {
		curriculumVitae = toUnwrappedModel(curriculumVitae);

		boolean isNew = curriculumVitae.isNew();

		Session session = null;

		try {
			session = openSession();

			if (curriculumVitae.isNew()) {
				session.save(curriculumVitae);

				curriculumVitae.setNew(false);
			}
			else {
				session.merge(curriculumVitae);
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

		EntityCacheUtil.putResult(curriculumVitaeModelImpl.ENTITY_CACHE_ENABLED,
			curriculumVitaeImpl.class, curriculumVitae.getPrimaryKey(),
			curriculumVitae);

		return curriculumVitae;
	}

	protected curriculumVitae toUnwrappedModel(curriculumVitae curriculumVitae) {
		if (curriculumVitae instanceof curriculumVitaeImpl) {
			return curriculumVitae;
		}

		curriculumVitaeImpl curriculumVitaeImpl = new curriculumVitaeImpl();

		curriculumVitaeImpl.setNew(curriculumVitae.isNew());
		curriculumVitaeImpl.setPrimaryKey(curriculumVitae.getPrimaryKey());

		curriculumVitaeImpl.setCV_ID(curriculumVitae.getCV_ID());
		curriculumVitaeImpl.setCV_ESTADO(curriculumVitae.getCV_ESTADO());
		curriculumVitaeImpl.setCV_ACTIVO(curriculumVitae.getCV_ACTIVO());
		curriculumVitaeImpl.setCV_USUARIO_CREA(curriculumVitae.getCV_USUARIO_CREA());
		curriculumVitaeImpl.setCV_FECHA_CREA(curriculumVitae.getCV_FECHA_CREA());
		curriculumVitaeImpl.setCV_USUARIO_MODIFICA(curriculumVitae.getCV_USUARIO_MODIFICA());
		curriculumVitaeImpl.setCV_FECHA_MODIFICA(curriculumVitae.getCV_FECHA_MODIFICA());

		return curriculumVitaeImpl;
	}

	/**
	 * Returns the curriculum vitae with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the curriculum vitae
	 * @return the curriculum vitae
	 * @throws com.rec.hitss.layer.NoSuchcurriculumVitaeException if a curriculum vitae with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public curriculumVitae findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcurriculumVitaeException, SystemException {
		curriculumVitae curriculumVitae = fetchByPrimaryKey(primaryKey);

		if (curriculumVitae == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcurriculumVitaeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return curriculumVitae;
	}

	/**
	 * Returns the curriculum vitae with the primary key or throws a {@link com.rec.hitss.layer.NoSuchcurriculumVitaeException} if it could not be found.
	 *
	 * @param CV_ID the primary key of the curriculum vitae
	 * @return the curriculum vitae
	 * @throws com.rec.hitss.layer.NoSuchcurriculumVitaeException if a curriculum vitae with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public curriculumVitae findByPrimaryKey(long CV_ID)
		throws NoSuchcurriculumVitaeException, SystemException {
		return findByPrimaryKey((Serializable)CV_ID);
	}

	/**
	 * Returns the curriculum vitae with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the curriculum vitae
	 * @return the curriculum vitae, or <code>null</code> if a curriculum vitae with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public curriculumVitae fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		curriculumVitae curriculumVitae = (curriculumVitae)EntityCacheUtil.getResult(curriculumVitaeModelImpl.ENTITY_CACHE_ENABLED,
				curriculumVitaeImpl.class, primaryKey);

		if (curriculumVitae == _nullcurriculumVitae) {
			return null;
		}

		if (curriculumVitae == null) {
			Session session = null;

			try {
				session = openSession();

				curriculumVitae = (curriculumVitae)session.get(curriculumVitaeImpl.class,
						primaryKey);

				if (curriculumVitae != null) {
					cacheResult(curriculumVitae);
				}
				else {
					EntityCacheUtil.putResult(curriculumVitaeModelImpl.ENTITY_CACHE_ENABLED,
						curriculumVitaeImpl.class, primaryKey,
						_nullcurriculumVitae);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(curriculumVitaeModelImpl.ENTITY_CACHE_ENABLED,
					curriculumVitaeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return curriculumVitae;
	}

	/**
	 * Returns the curriculum vitae with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CV_ID the primary key of the curriculum vitae
	 * @return the curriculum vitae, or <code>null</code> if a curriculum vitae with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public curriculumVitae fetchByPrimaryKey(long CV_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)CV_ID);
	}

	/**
	 * Returns all the curriculum vitaes.
	 *
	 * @return the curriculum vitaes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<curriculumVitae> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the curriculum vitaes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.curriculumVitaeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of curriculum vitaes
	 * @param end the upper bound of the range of curriculum vitaes (not inclusive)
	 * @return the range of curriculum vitaes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<curriculumVitae> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the curriculum vitaes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.curriculumVitaeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of curriculum vitaes
	 * @param end the upper bound of the range of curriculum vitaes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of curriculum vitaes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<curriculumVitae> findAll(int start, int end,
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

		List<curriculumVitae> list = (List<curriculumVitae>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CURRICULUMVITAE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CURRICULUMVITAE;

				if (pagination) {
					sql = sql.concat(curriculumVitaeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<curriculumVitae>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<curriculumVitae>(list);
				}
				else {
					list = (List<curriculumVitae>)QueryUtil.list(q,
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
	 * Removes all the curriculum vitaes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (curriculumVitae curriculumVitae : findAll()) {
			remove(curriculumVitae);
		}
	}

	/**
	 * Returns the number of curriculum vitaes.
	 *
	 * @return the number of curriculum vitaes
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

				Query q = session.createQuery(_SQL_COUNT_CURRICULUMVITAE);

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
	 * Initializes the curriculum vitae persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.curriculumVitae")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<curriculumVitae>> listenersList = new ArrayList<ModelListener<curriculumVitae>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<curriculumVitae>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(curriculumVitaeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CURRICULUMVITAE = "SELECT curriculumVitae FROM curriculumVitae curriculumVitae";
	private static final String _SQL_COUNT_CURRICULUMVITAE = "SELECT COUNT(curriculumVitae) FROM curriculumVitae curriculumVitae";
	private static final String _ORDER_BY_ENTITY_ALIAS = "curriculumVitae.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No curriculumVitae exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(curriculumVitaePersistenceImpl.class);
	private static curriculumVitae _nullcurriculumVitae = new curriculumVitaeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<curriculumVitae> toCacheModel() {
				return _nullcurriculumVitaeCacheModel;
			}
		};

	private static CacheModel<curriculumVitae> _nullcurriculumVitaeCacheModel = new CacheModel<curriculumVitae>() {
			@Override
			public curriculumVitae toEntityModel() {
				return _nullcurriculumVitae;
			}
		};
}
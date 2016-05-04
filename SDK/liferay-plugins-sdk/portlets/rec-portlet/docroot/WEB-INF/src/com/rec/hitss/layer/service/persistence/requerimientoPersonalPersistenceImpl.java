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

import com.rec.hitss.layer.NoSuchrequerimientoPersonalException;
import com.rec.hitss.layer.model.impl.requerimientoPersonalImpl;
import com.rec.hitss.layer.model.impl.requerimientoPersonalModelImpl;
import com.rec.hitss.layer.model.requerimientoPersonal;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the requerimiento personal service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see requerimientoPersonalPersistence
 * @see requerimientoPersonalUtil
 * @generated
 */
public class requerimientoPersonalPersistenceImpl extends BasePersistenceImpl<requerimientoPersonal>
	implements requerimientoPersonalPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link requerimientoPersonalUtil} to access the requerimiento personal persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = requerimientoPersonalImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(requerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
			requerimientoPersonalModelImpl.FINDER_CACHE_ENABLED,
			requerimientoPersonalImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(requerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
			requerimientoPersonalModelImpl.FINDER_CACHE_ENABLED,
			requerimientoPersonalImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(requerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
			requerimientoPersonalModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public requerimientoPersonalPersistenceImpl() {
		setModelClass(requerimientoPersonal.class);
	}

	/**
	 * Caches the requerimiento personal in the entity cache if it is enabled.
	 *
	 * @param requerimientoPersonal the requerimiento personal
	 */
	@Override
	public void cacheResult(requerimientoPersonal requerimientoPersonal) {
		EntityCacheUtil.putResult(requerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
			requerimientoPersonalImpl.class,
			requerimientoPersonal.getPrimaryKey(), requerimientoPersonal);

		requerimientoPersonal.resetOriginalValues();
	}

	/**
	 * Caches the requerimiento personals in the entity cache if it is enabled.
	 *
	 * @param requerimientoPersonals the requerimiento personals
	 */
	@Override
	public void cacheResult(List<requerimientoPersonal> requerimientoPersonals) {
		for (requerimientoPersonal requerimientoPersonal : requerimientoPersonals) {
			if (EntityCacheUtil.getResult(
						requerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
						requerimientoPersonalImpl.class,
						requerimientoPersonal.getPrimaryKey()) == null) {
				cacheResult(requerimientoPersonal);
			}
			else {
				requerimientoPersonal.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all requerimiento personals.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(requerimientoPersonalImpl.class.getName());
		}

		EntityCacheUtil.clearCache(requerimientoPersonalImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the requerimiento personal.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(requerimientoPersonal requerimientoPersonal) {
		EntityCacheUtil.removeResult(requerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
			requerimientoPersonalImpl.class,
			requerimientoPersonal.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<requerimientoPersonal> requerimientoPersonals) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (requerimientoPersonal requerimientoPersonal : requerimientoPersonals) {
			EntityCacheUtil.removeResult(requerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
				requerimientoPersonalImpl.class,
				requerimientoPersonal.getPrimaryKey());
		}
	}

	/**
	 * Creates a new requerimiento personal with the primary key. Does not add the requerimiento personal to the database.
	 *
	 * @param REQ_ID the primary key for the new requerimiento personal
	 * @return the new requerimiento personal
	 */
	@Override
	public requerimientoPersonal create(long REQ_ID) {
		requerimientoPersonal requerimientoPersonal = new requerimientoPersonalImpl();

		requerimientoPersonal.setNew(true);
		requerimientoPersonal.setPrimaryKey(REQ_ID);

		return requerimientoPersonal;
	}

	/**
	 * Removes the requerimiento personal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param REQ_ID the primary key of the requerimiento personal
	 * @return the requerimiento personal that was removed
	 * @throws com.rec.hitss.layer.NoSuchrequerimientoPersonalException if a requerimiento personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public requerimientoPersonal remove(long REQ_ID)
		throws NoSuchrequerimientoPersonalException, SystemException {
		return remove((Serializable)REQ_ID);
	}

	/**
	 * Removes the requerimiento personal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the requerimiento personal
	 * @return the requerimiento personal that was removed
	 * @throws com.rec.hitss.layer.NoSuchrequerimientoPersonalException if a requerimiento personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public requerimientoPersonal remove(Serializable primaryKey)
		throws NoSuchrequerimientoPersonalException, SystemException {
		Session session = null;

		try {
			session = openSession();

			requerimientoPersonal requerimientoPersonal = (requerimientoPersonal)session.get(requerimientoPersonalImpl.class,
					primaryKey);

			if (requerimientoPersonal == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchrequerimientoPersonalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(requerimientoPersonal);
		}
		catch (NoSuchrequerimientoPersonalException nsee) {
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
	protected requerimientoPersonal removeImpl(
		requerimientoPersonal requerimientoPersonal) throws SystemException {
		requerimientoPersonal = toUnwrappedModel(requerimientoPersonal);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(requerimientoPersonal)) {
				requerimientoPersonal = (requerimientoPersonal)session.get(requerimientoPersonalImpl.class,
						requerimientoPersonal.getPrimaryKeyObj());
			}

			if (requerimientoPersonal != null) {
				session.delete(requerimientoPersonal);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (requerimientoPersonal != null) {
			clearCache(requerimientoPersonal);
		}

		return requerimientoPersonal;
	}

	@Override
	public requerimientoPersonal updateImpl(
		com.rec.hitss.layer.model.requerimientoPersonal requerimientoPersonal)
		throws SystemException {
		requerimientoPersonal = toUnwrappedModel(requerimientoPersonal);

		boolean isNew = requerimientoPersonal.isNew();

		Session session = null;

		try {
			session = openSession();

			if (requerimientoPersonal.isNew()) {
				session.save(requerimientoPersonal);

				requerimientoPersonal.setNew(false);
			}
			else {
				session.merge(requerimientoPersonal);
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

		EntityCacheUtil.putResult(requerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
			requerimientoPersonalImpl.class,
			requerimientoPersonal.getPrimaryKey(), requerimientoPersonal);

		return requerimientoPersonal;
	}

	protected requerimientoPersonal toUnwrappedModel(
		requerimientoPersonal requerimientoPersonal) {
		if (requerimientoPersonal instanceof requerimientoPersonalImpl) {
			return requerimientoPersonal;
		}

		requerimientoPersonalImpl requerimientoPersonalImpl = new requerimientoPersonalImpl();

		requerimientoPersonalImpl.setNew(requerimientoPersonal.isNew());
		requerimientoPersonalImpl.setPrimaryKey(requerimientoPersonal.getPrimaryKey());

		requerimientoPersonalImpl.setREQ_ID(requerimientoPersonal.getREQ_ID());
		requerimientoPersonalImpl.setREQ_ESTADO(requerimientoPersonal.getREQ_ESTADO());
		requerimientoPersonalImpl.setREQ_ACTIVO(requerimientoPersonal.getREQ_ACTIVO());
		requerimientoPersonalImpl.setREQ_USUARIO_CREA(requerimientoPersonal.getREQ_USUARIO_CREA());
		requerimientoPersonalImpl.setREQ_FECHA_CREA(requerimientoPersonal.getREQ_FECHA_CREA());
		requerimientoPersonalImpl.setREQ_USUARIO_MODIFICA(requerimientoPersonal.getREQ_USUARIO_MODIFICA());
		requerimientoPersonalImpl.setREQ_FECHA_MODIFICA(requerimientoPersonal.getREQ_FECHA_MODIFICA());

		return requerimientoPersonalImpl;
	}

	/**
	 * Returns the requerimiento personal with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the requerimiento personal
	 * @return the requerimiento personal
	 * @throws com.rec.hitss.layer.NoSuchrequerimientoPersonalException if a requerimiento personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public requerimientoPersonal findByPrimaryKey(Serializable primaryKey)
		throws NoSuchrequerimientoPersonalException, SystemException {
		requerimientoPersonal requerimientoPersonal = fetchByPrimaryKey(primaryKey);

		if (requerimientoPersonal == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchrequerimientoPersonalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return requerimientoPersonal;
	}

	/**
	 * Returns the requerimiento personal with the primary key or throws a {@link com.rec.hitss.layer.NoSuchrequerimientoPersonalException} if it could not be found.
	 *
	 * @param REQ_ID the primary key of the requerimiento personal
	 * @return the requerimiento personal
	 * @throws com.rec.hitss.layer.NoSuchrequerimientoPersonalException if a requerimiento personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public requerimientoPersonal findByPrimaryKey(long REQ_ID)
		throws NoSuchrequerimientoPersonalException, SystemException {
		return findByPrimaryKey((Serializable)REQ_ID);
	}

	/**
	 * Returns the requerimiento personal with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the requerimiento personal
	 * @return the requerimiento personal, or <code>null</code> if a requerimiento personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public requerimientoPersonal fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		requerimientoPersonal requerimientoPersonal = (requerimientoPersonal)EntityCacheUtil.getResult(requerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
				requerimientoPersonalImpl.class, primaryKey);

		if (requerimientoPersonal == _nullrequerimientoPersonal) {
			return null;
		}

		if (requerimientoPersonal == null) {
			Session session = null;

			try {
				session = openSession();

				requerimientoPersonal = (requerimientoPersonal)session.get(requerimientoPersonalImpl.class,
						primaryKey);

				if (requerimientoPersonal != null) {
					cacheResult(requerimientoPersonal);
				}
				else {
					EntityCacheUtil.putResult(requerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
						requerimientoPersonalImpl.class, primaryKey,
						_nullrequerimientoPersonal);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(requerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
					requerimientoPersonalImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return requerimientoPersonal;
	}

	/**
	 * Returns the requerimiento personal with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param REQ_ID the primary key of the requerimiento personal
	 * @return the requerimiento personal, or <code>null</code> if a requerimiento personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public requerimientoPersonal fetchByPrimaryKey(long REQ_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)REQ_ID);
	}

	/**
	 * Returns all the requerimiento personals.
	 *
	 * @return the requerimiento personals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<requerimientoPersonal> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the requerimiento personals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.requerimientoPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of requerimiento personals
	 * @param end the upper bound of the range of requerimiento personals (not inclusive)
	 * @return the range of requerimiento personals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<requerimientoPersonal> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the requerimiento personals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.requerimientoPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of requerimiento personals
	 * @param end the upper bound of the range of requerimiento personals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of requerimiento personals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<requerimientoPersonal> findAll(int start, int end,
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

		List<requerimientoPersonal> list = (List<requerimientoPersonal>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_REQUERIMIENTOPERSONAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REQUERIMIENTOPERSONAL;

				if (pagination) {
					sql = sql.concat(requerimientoPersonalModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<requerimientoPersonal>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<requerimientoPersonal>(list);
				}
				else {
					list = (List<requerimientoPersonal>)QueryUtil.list(q,
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
	 * Removes all the requerimiento personals from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (requerimientoPersonal requerimientoPersonal : findAll()) {
			remove(requerimientoPersonal);
		}
	}

	/**
	 * Returns the number of requerimiento personals.
	 *
	 * @return the number of requerimiento personals
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

				Query q = session.createQuery(_SQL_COUNT_REQUERIMIENTOPERSONAL);

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
	 * Initializes the requerimiento personal persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.requerimientoPersonal")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<requerimientoPersonal>> listenersList = new ArrayList<ModelListener<requerimientoPersonal>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<requerimientoPersonal>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(requerimientoPersonalImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_REQUERIMIENTOPERSONAL = "SELECT requerimientoPersonal FROM requerimientoPersonal requerimientoPersonal";
	private static final String _SQL_COUNT_REQUERIMIENTOPERSONAL = "SELECT COUNT(requerimientoPersonal) FROM requerimientoPersonal requerimientoPersonal";
	private static final String _ORDER_BY_ENTITY_ALIAS = "requerimientoPersonal.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No requerimientoPersonal exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(requerimientoPersonalPersistenceImpl.class);
	private static requerimientoPersonal _nullrequerimientoPersonal = new requerimientoPersonalImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<requerimientoPersonal> toCacheModel() {
				return _nullrequerimientoPersonalCacheModel;
			}
		};

	private static CacheModel<requerimientoPersonal> _nullrequerimientoPersonalCacheModel =
		new CacheModel<requerimientoPersonal>() {
			@Override
			public requerimientoPersonal toEntityModel() {
				return _nullrequerimientoPersonal;
			}
		};
}
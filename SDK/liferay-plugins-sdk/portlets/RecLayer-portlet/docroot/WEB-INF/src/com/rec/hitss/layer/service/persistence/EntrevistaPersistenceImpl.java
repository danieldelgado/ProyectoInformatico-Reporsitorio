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

import com.rec.hitss.layer.NoSuchEntrevistaException;
import com.rec.hitss.layer.model.Entrevista;
import com.rec.hitss.layer.model.impl.EntrevistaImpl;
import com.rec.hitss.layer.model.impl.EntrevistaModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the entrevista service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see EntrevistaPersistence
 * @see EntrevistaUtil
 * @generated
 */
public class EntrevistaPersistenceImpl extends BasePersistenceImpl<Entrevista>
	implements EntrevistaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EntrevistaUtil} to access the entrevista persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EntrevistaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntrevistaModelImpl.ENTITY_CACHE_ENABLED,
			EntrevistaModelImpl.FINDER_CACHE_ENABLED, EntrevistaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntrevistaModelImpl.ENTITY_CACHE_ENABLED,
			EntrevistaModelImpl.FINDER_CACHE_ENABLED, EntrevistaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntrevistaModelImpl.ENTITY_CACHE_ENABLED,
			EntrevistaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EntrevistaPersistenceImpl() {
		setModelClass(Entrevista.class);
	}

	/**
	 * Caches the entrevista in the entity cache if it is enabled.
	 *
	 * @param entrevista the entrevista
	 */
	@Override
	public void cacheResult(Entrevista entrevista) {
		EntityCacheUtil.putResult(EntrevistaModelImpl.ENTITY_CACHE_ENABLED,
			EntrevistaImpl.class, entrevista.getPrimaryKey(), entrevista);

		entrevista.resetOriginalValues();
	}

	/**
	 * Caches the entrevistas in the entity cache if it is enabled.
	 *
	 * @param entrevistas the entrevistas
	 */
	@Override
	public void cacheResult(List<Entrevista> entrevistas) {
		for (Entrevista entrevista : entrevistas) {
			if (EntityCacheUtil.getResult(
						EntrevistaModelImpl.ENTITY_CACHE_ENABLED,
						EntrevistaImpl.class, entrevista.getPrimaryKey()) == null) {
				cacheResult(entrevista);
			}
			else {
				entrevista.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all entrevistas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EntrevistaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EntrevistaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the entrevista.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Entrevista entrevista) {
		EntityCacheUtil.removeResult(EntrevistaModelImpl.ENTITY_CACHE_ENABLED,
			EntrevistaImpl.class, entrevista.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Entrevista> entrevistas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Entrevista entrevista : entrevistas) {
			EntityCacheUtil.removeResult(EntrevistaModelImpl.ENTITY_CACHE_ENABLED,
				EntrevistaImpl.class, entrevista.getPrimaryKey());
		}
	}

	/**
	 * Creates a new entrevista with the primary key. Does not add the entrevista to the database.
	 *
	 * @param entrevistaId the primary key for the new entrevista
	 * @return the new entrevista
	 */
	@Override
	public Entrevista create(long entrevistaId) {
		Entrevista entrevista = new EntrevistaImpl();

		entrevista.setNew(true);
		entrevista.setPrimaryKey(entrevistaId);

		return entrevista;
	}

	/**
	 * Removes the entrevista with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param entrevistaId the primary key of the entrevista
	 * @return the entrevista that was removed
	 * @throws com.rec.hitss.layer.NoSuchEntrevistaException if a entrevista with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Entrevista remove(long entrevistaId)
		throws NoSuchEntrevistaException, SystemException {
		return remove((Serializable)entrevistaId);
	}

	/**
	 * Removes the entrevista with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the entrevista
	 * @return the entrevista that was removed
	 * @throws com.rec.hitss.layer.NoSuchEntrevistaException if a entrevista with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Entrevista remove(Serializable primaryKey)
		throws NoSuchEntrevistaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Entrevista entrevista = (Entrevista)session.get(EntrevistaImpl.class,
					primaryKey);

			if (entrevista == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEntrevistaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(entrevista);
		}
		catch (NoSuchEntrevistaException nsee) {
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
	protected Entrevista removeImpl(Entrevista entrevista)
		throws SystemException {
		entrevista = toUnwrappedModel(entrevista);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(entrevista)) {
				entrevista = (Entrevista)session.get(EntrevistaImpl.class,
						entrevista.getPrimaryKeyObj());
			}

			if (entrevista != null) {
				session.delete(entrevista);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (entrevista != null) {
			clearCache(entrevista);
		}

		return entrevista;
	}

	@Override
	public Entrevista updateImpl(
		com.rec.hitss.layer.model.Entrevista entrevista)
		throws SystemException {
		entrevista = toUnwrappedModel(entrevista);

		boolean isNew = entrevista.isNew();

		Session session = null;

		try {
			session = openSession();

			if (entrevista.isNew()) {
				session.save(entrevista);

				entrevista.setNew(false);
			}
			else {
				session.merge(entrevista);
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

		EntityCacheUtil.putResult(EntrevistaModelImpl.ENTITY_CACHE_ENABLED,
			EntrevistaImpl.class, entrevista.getPrimaryKey(), entrevista);

		return entrevista;
	}

	protected Entrevista toUnwrappedModel(Entrevista entrevista) {
		if (entrevista instanceof EntrevistaImpl) {
			return entrevista;
		}

		EntrevistaImpl entrevistaImpl = new EntrevistaImpl();

		entrevistaImpl.setNew(entrevista.isNew());
		entrevistaImpl.setPrimaryKey(entrevista.getPrimaryKey());

		entrevistaImpl.setEntrevistaId(entrevista.getEntrevistaId());
		entrevistaImpl.setUsuarioHitssId(entrevista.getUsuarioHitssId());
		entrevistaImpl.setObservacion(entrevista.getObservacion());
		entrevistaImpl.setAsistio(entrevista.isAsistio());
		entrevistaImpl.setActivo(entrevista.isActivo());
		entrevistaImpl.setUsuariocrea(entrevista.getUsuariocrea());
		entrevistaImpl.setFechacrea(entrevista.getFechacrea());
		entrevistaImpl.setUsuariomodifica(entrevista.getUsuariomodifica());
		entrevistaImpl.setFechacreamodifica(entrevista.getFechacreamodifica());

		return entrevistaImpl;
	}

	/**
	 * Returns the entrevista with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the entrevista
	 * @return the entrevista
	 * @throws com.rec.hitss.layer.NoSuchEntrevistaException if a entrevista with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Entrevista findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEntrevistaException, SystemException {
		Entrevista entrevista = fetchByPrimaryKey(primaryKey);

		if (entrevista == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEntrevistaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return entrevista;
	}

	/**
	 * Returns the entrevista with the primary key or throws a {@link com.rec.hitss.layer.NoSuchEntrevistaException} if it could not be found.
	 *
	 * @param entrevistaId the primary key of the entrevista
	 * @return the entrevista
	 * @throws com.rec.hitss.layer.NoSuchEntrevistaException if a entrevista with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Entrevista findByPrimaryKey(long entrevistaId)
		throws NoSuchEntrevistaException, SystemException {
		return findByPrimaryKey((Serializable)entrevistaId);
	}

	/**
	 * Returns the entrevista with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the entrevista
	 * @return the entrevista, or <code>null</code> if a entrevista with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Entrevista fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Entrevista entrevista = (Entrevista)EntityCacheUtil.getResult(EntrevistaModelImpl.ENTITY_CACHE_ENABLED,
				EntrevistaImpl.class, primaryKey);

		if (entrevista == _nullEntrevista) {
			return null;
		}

		if (entrevista == null) {
			Session session = null;

			try {
				session = openSession();

				entrevista = (Entrevista)session.get(EntrevistaImpl.class,
						primaryKey);

				if (entrevista != null) {
					cacheResult(entrevista);
				}
				else {
					EntityCacheUtil.putResult(EntrevistaModelImpl.ENTITY_CACHE_ENABLED,
						EntrevistaImpl.class, primaryKey, _nullEntrevista);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EntrevistaModelImpl.ENTITY_CACHE_ENABLED,
					EntrevistaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return entrevista;
	}

	/**
	 * Returns the entrevista with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param entrevistaId the primary key of the entrevista
	 * @return the entrevista, or <code>null</code> if a entrevista with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Entrevista fetchByPrimaryKey(long entrevistaId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)entrevistaId);
	}

	/**
	 * Returns all the entrevistas.
	 *
	 * @return the entrevistas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Entrevista> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the entrevistas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EntrevistaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of entrevistas
	 * @param end the upper bound of the range of entrevistas (not inclusive)
	 * @return the range of entrevistas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Entrevista> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the entrevistas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EntrevistaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of entrevistas
	 * @param end the upper bound of the range of entrevistas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of entrevistas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Entrevista> findAll(int start, int end,
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

		List<Entrevista> list = (List<Entrevista>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ENTREVISTA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ENTREVISTA;

				if (pagination) {
					sql = sql.concat(EntrevistaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Entrevista>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Entrevista>(list);
				}
				else {
					list = (List<Entrevista>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the entrevistas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Entrevista entrevista : findAll()) {
			remove(entrevista);
		}
	}

	/**
	 * Returns the number of entrevistas.
	 *
	 * @return the number of entrevistas
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

				Query q = session.createQuery(_SQL_COUNT_ENTREVISTA);

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
	 * Initializes the entrevista persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.Entrevista")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Entrevista>> listenersList = new ArrayList<ModelListener<Entrevista>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Entrevista>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EntrevistaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ENTREVISTA = "SELECT entrevista FROM Entrevista entrevista";
	private static final String _SQL_COUNT_ENTREVISTA = "SELECT COUNT(entrevista) FROM Entrevista entrevista";
	private static final String _ORDER_BY_ENTITY_ALIAS = "entrevista.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Entrevista exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EntrevistaPersistenceImpl.class);
	private static Entrevista _nullEntrevista = new EntrevistaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Entrevista> toCacheModel() {
				return _nullEntrevistaCacheModel;
			}
		};

	private static CacheModel<Entrevista> _nullEntrevistaCacheModel = new CacheModel<Entrevista>() {
			@Override
			public Entrevista toEntityModel() {
				return _nullEntrevista;
			}
		};
}
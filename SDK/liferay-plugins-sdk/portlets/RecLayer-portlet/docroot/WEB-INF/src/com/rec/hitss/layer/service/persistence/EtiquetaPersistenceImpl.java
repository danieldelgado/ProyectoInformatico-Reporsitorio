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

import com.rec.hitss.layer.NoSuchEtiquetaException;
import com.rec.hitss.layer.model.Etiqueta;
import com.rec.hitss.layer.model.impl.EtiquetaImpl;
import com.rec.hitss.layer.model.impl.EtiquetaModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the etiqueta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see EtiquetaPersistence
 * @see EtiquetaUtil
 * @generated
 */
public class EtiquetaPersistenceImpl extends BasePersistenceImpl<Etiqueta>
	implements EtiquetaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EtiquetaUtil} to access the etiqueta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EtiquetaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EtiquetaModelImpl.ENTITY_CACHE_ENABLED,
			EtiquetaModelImpl.FINDER_CACHE_ENABLED, EtiquetaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EtiquetaModelImpl.ENTITY_CACHE_ENABLED,
			EtiquetaModelImpl.FINDER_CACHE_ENABLED, EtiquetaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EtiquetaModelImpl.ENTITY_CACHE_ENABLED,
			EtiquetaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EtiquetaPersistenceImpl() {
		setModelClass(Etiqueta.class);
	}

	/**
	 * Caches the etiqueta in the entity cache if it is enabled.
	 *
	 * @param etiqueta the etiqueta
	 */
	@Override
	public void cacheResult(Etiqueta etiqueta) {
		EntityCacheUtil.putResult(EtiquetaModelImpl.ENTITY_CACHE_ENABLED,
			EtiquetaImpl.class, etiqueta.getPrimaryKey(), etiqueta);

		etiqueta.resetOriginalValues();
	}

	/**
	 * Caches the etiquetas in the entity cache if it is enabled.
	 *
	 * @param etiquetas the etiquetas
	 */
	@Override
	public void cacheResult(List<Etiqueta> etiquetas) {
		for (Etiqueta etiqueta : etiquetas) {
			if (EntityCacheUtil.getResult(
						EtiquetaModelImpl.ENTITY_CACHE_ENABLED,
						EtiquetaImpl.class, etiqueta.getPrimaryKey()) == null) {
				cacheResult(etiqueta);
			}
			else {
				etiqueta.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all etiquetas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EtiquetaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EtiquetaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the etiqueta.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Etiqueta etiqueta) {
		EntityCacheUtil.removeResult(EtiquetaModelImpl.ENTITY_CACHE_ENABLED,
			EtiquetaImpl.class, etiqueta.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Etiqueta> etiquetas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Etiqueta etiqueta : etiquetas) {
			EntityCacheUtil.removeResult(EtiquetaModelImpl.ENTITY_CACHE_ENABLED,
				EtiquetaImpl.class, etiqueta.getPrimaryKey());
		}
	}

	/**
	 * Creates a new etiqueta with the primary key. Does not add the etiqueta to the database.
	 *
	 * @param etiquetaId the primary key for the new etiqueta
	 * @return the new etiqueta
	 */
	@Override
	public Etiqueta create(long etiquetaId) {
		Etiqueta etiqueta = new EtiquetaImpl();

		etiqueta.setNew(true);
		etiqueta.setPrimaryKey(etiquetaId);

		return etiqueta;
	}

	/**
	 * Removes the etiqueta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param etiquetaId the primary key of the etiqueta
	 * @return the etiqueta that was removed
	 * @throws com.rec.hitss.layer.NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Etiqueta remove(long etiquetaId)
		throws NoSuchEtiquetaException, SystemException {
		return remove((Serializable)etiquetaId);
	}

	/**
	 * Removes the etiqueta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the etiqueta
	 * @return the etiqueta that was removed
	 * @throws com.rec.hitss.layer.NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Etiqueta remove(Serializable primaryKey)
		throws NoSuchEtiquetaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Etiqueta etiqueta = (Etiqueta)session.get(EtiquetaImpl.class,
					primaryKey);

			if (etiqueta == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEtiquetaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(etiqueta);
		}
		catch (NoSuchEtiquetaException nsee) {
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
	protected Etiqueta removeImpl(Etiqueta etiqueta) throws SystemException {
		etiqueta = toUnwrappedModel(etiqueta);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(etiqueta)) {
				etiqueta = (Etiqueta)session.get(EtiquetaImpl.class,
						etiqueta.getPrimaryKeyObj());
			}

			if (etiqueta != null) {
				session.delete(etiqueta);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (etiqueta != null) {
			clearCache(etiqueta);
		}

		return etiqueta;
	}

	@Override
	public Etiqueta updateImpl(com.rec.hitss.layer.model.Etiqueta etiqueta)
		throws SystemException {
		etiqueta = toUnwrappedModel(etiqueta);

		boolean isNew = etiqueta.isNew();

		Session session = null;

		try {
			session = openSession();

			if (etiqueta.isNew()) {
				session.save(etiqueta);

				etiqueta.setNew(false);
			}
			else {
				session.merge(etiqueta);
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

		EntityCacheUtil.putResult(EtiquetaModelImpl.ENTITY_CACHE_ENABLED,
			EtiquetaImpl.class, etiqueta.getPrimaryKey(), etiqueta);

		return etiqueta;
	}

	protected Etiqueta toUnwrappedModel(Etiqueta etiqueta) {
		if (etiqueta instanceof EtiquetaImpl) {
			return etiqueta;
		}

		EtiquetaImpl etiquetaImpl = new EtiquetaImpl();

		etiquetaImpl.setNew(etiqueta.isNew());
		etiquetaImpl.setPrimaryKey(etiqueta.getPrimaryKey());

		etiquetaImpl.setEtiquetaId(etiqueta.getEtiquetaId());
		etiquetaImpl.setTagId(etiqueta.getTagId());
		etiquetaImpl.setGroupId(etiqueta.getGroupId());
		etiquetaImpl.setCompanyId(etiqueta.getCompanyId());

		return etiquetaImpl;
	}

	/**
	 * Returns the etiqueta with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the etiqueta
	 * @return the etiqueta
	 * @throws com.rec.hitss.layer.NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Etiqueta findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEtiquetaException, SystemException {
		Etiqueta etiqueta = fetchByPrimaryKey(primaryKey);

		if (etiqueta == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEtiquetaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return etiqueta;
	}

	/**
	 * Returns the etiqueta with the primary key or throws a {@link com.rec.hitss.layer.NoSuchEtiquetaException} if it could not be found.
	 *
	 * @param etiquetaId the primary key of the etiqueta
	 * @return the etiqueta
	 * @throws com.rec.hitss.layer.NoSuchEtiquetaException if a etiqueta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Etiqueta findByPrimaryKey(long etiquetaId)
		throws NoSuchEtiquetaException, SystemException {
		return findByPrimaryKey((Serializable)etiquetaId);
	}

	/**
	 * Returns the etiqueta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the etiqueta
	 * @return the etiqueta, or <code>null</code> if a etiqueta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Etiqueta fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Etiqueta etiqueta = (Etiqueta)EntityCacheUtil.getResult(EtiquetaModelImpl.ENTITY_CACHE_ENABLED,
				EtiquetaImpl.class, primaryKey);

		if (etiqueta == _nullEtiqueta) {
			return null;
		}

		if (etiqueta == null) {
			Session session = null;

			try {
				session = openSession();

				etiqueta = (Etiqueta)session.get(EtiquetaImpl.class, primaryKey);

				if (etiqueta != null) {
					cacheResult(etiqueta);
				}
				else {
					EntityCacheUtil.putResult(EtiquetaModelImpl.ENTITY_CACHE_ENABLED,
						EtiquetaImpl.class, primaryKey, _nullEtiqueta);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EtiquetaModelImpl.ENTITY_CACHE_ENABLED,
					EtiquetaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return etiqueta;
	}

	/**
	 * Returns the etiqueta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param etiquetaId the primary key of the etiqueta
	 * @return the etiqueta, or <code>null</code> if a etiqueta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Etiqueta fetchByPrimaryKey(long etiquetaId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)etiquetaId);
	}

	/**
	 * Returns all the etiquetas.
	 *
	 * @return the etiquetas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Etiqueta> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the etiquetas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EtiquetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of etiquetas
	 * @param end the upper bound of the range of etiquetas (not inclusive)
	 * @return the range of etiquetas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Etiqueta> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the etiquetas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EtiquetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of etiquetas
	 * @param end the upper bound of the range of etiquetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of etiquetas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Etiqueta> findAll(int start, int end,
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

		List<Etiqueta> list = (List<Etiqueta>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ETIQUETA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ETIQUETA;

				if (pagination) {
					sql = sql.concat(EtiquetaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Etiqueta>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Etiqueta>(list);
				}
				else {
					list = (List<Etiqueta>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the etiquetas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Etiqueta etiqueta : findAll()) {
			remove(etiqueta);
		}
	}

	/**
	 * Returns the number of etiquetas.
	 *
	 * @return the number of etiquetas
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

				Query q = session.createQuery(_SQL_COUNT_ETIQUETA);

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
	 * Initializes the etiqueta persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.Etiqueta")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Etiqueta>> listenersList = new ArrayList<ModelListener<Etiqueta>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Etiqueta>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EtiquetaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ETIQUETA = "SELECT etiqueta FROM Etiqueta etiqueta";
	private static final String _SQL_COUNT_ETIQUETA = "SELECT COUNT(etiqueta) FROM Etiqueta etiqueta";
	private static final String _ORDER_BY_ENTITY_ALIAS = "etiqueta.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Etiqueta exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EtiquetaPersistenceImpl.class);
	private static Etiqueta _nullEtiqueta = new EtiquetaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Etiqueta> toCacheModel() {
				return _nullEtiquetaCacheModel;
			}
		};

	private static CacheModel<Etiqueta> _nullEtiquetaCacheModel = new CacheModel<Etiqueta>() {
			@Override
			public Etiqueta toEntityModel() {
				return _nullEtiqueta;
			}
		};
}
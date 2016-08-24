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

import com.rec.hitss.layer.NoSuchEtiquetaRelacionadaException;
import com.rec.hitss.layer.model.EtiquetaRelacionada;
import com.rec.hitss.layer.model.impl.EtiquetaRelacionadaImpl;
import com.rec.hitss.layer.model.impl.EtiquetaRelacionadaModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the etiqueta relacionada service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see EtiquetaRelacionadaPersistence
 * @see EtiquetaRelacionadaUtil
 * @generated
 */
public class EtiquetaRelacionadaPersistenceImpl extends BasePersistenceImpl<EtiquetaRelacionada>
	implements EtiquetaRelacionadaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EtiquetaRelacionadaUtil} to access the etiqueta relacionada persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EtiquetaRelacionadaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EtiquetaRelacionadaModelImpl.ENTITY_CACHE_ENABLED,
			EtiquetaRelacionadaModelImpl.FINDER_CACHE_ENABLED,
			EtiquetaRelacionadaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EtiquetaRelacionadaModelImpl.ENTITY_CACHE_ENABLED,
			EtiquetaRelacionadaModelImpl.FINDER_CACHE_ENABLED,
			EtiquetaRelacionadaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EtiquetaRelacionadaModelImpl.ENTITY_CACHE_ENABLED,
			EtiquetaRelacionadaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EtiquetaRelacionadaPersistenceImpl() {
		setModelClass(EtiquetaRelacionada.class);
	}

	/**
	 * Caches the etiqueta relacionada in the entity cache if it is enabled.
	 *
	 * @param etiquetaRelacionada the etiqueta relacionada
	 */
	@Override
	public void cacheResult(EtiquetaRelacionada etiquetaRelacionada) {
		EntityCacheUtil.putResult(EtiquetaRelacionadaModelImpl.ENTITY_CACHE_ENABLED,
			EtiquetaRelacionadaImpl.class, etiquetaRelacionada.getPrimaryKey(),
			etiquetaRelacionada);

		etiquetaRelacionada.resetOriginalValues();
	}

	/**
	 * Caches the etiqueta relacionadas in the entity cache if it is enabled.
	 *
	 * @param etiquetaRelacionadas the etiqueta relacionadas
	 */
	@Override
	public void cacheResult(List<EtiquetaRelacionada> etiquetaRelacionadas) {
		for (EtiquetaRelacionada etiquetaRelacionada : etiquetaRelacionadas) {
			if (EntityCacheUtil.getResult(
						EtiquetaRelacionadaModelImpl.ENTITY_CACHE_ENABLED,
						EtiquetaRelacionadaImpl.class,
						etiquetaRelacionada.getPrimaryKey()) == null) {
				cacheResult(etiquetaRelacionada);
			}
			else {
				etiquetaRelacionada.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all etiqueta relacionadas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EtiquetaRelacionadaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EtiquetaRelacionadaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the etiqueta relacionada.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EtiquetaRelacionada etiquetaRelacionada) {
		EntityCacheUtil.removeResult(EtiquetaRelacionadaModelImpl.ENTITY_CACHE_ENABLED,
			EtiquetaRelacionadaImpl.class, etiquetaRelacionada.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EtiquetaRelacionada> etiquetaRelacionadas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EtiquetaRelacionada etiquetaRelacionada : etiquetaRelacionadas) {
			EntityCacheUtil.removeResult(EtiquetaRelacionadaModelImpl.ENTITY_CACHE_ENABLED,
				EtiquetaRelacionadaImpl.class,
				etiquetaRelacionada.getPrimaryKey());
		}
	}

	/**
	 * Creates a new etiqueta relacionada with the primary key. Does not add the etiqueta relacionada to the database.
	 *
	 * @param etiquetaRelacionadaId the primary key for the new etiqueta relacionada
	 * @return the new etiqueta relacionada
	 */
	@Override
	public EtiquetaRelacionada create(long etiquetaRelacionadaId) {
		EtiquetaRelacionada etiquetaRelacionada = new EtiquetaRelacionadaImpl();

		etiquetaRelacionada.setNew(true);
		etiquetaRelacionada.setPrimaryKey(etiquetaRelacionadaId);

		return etiquetaRelacionada;
	}

	/**
	 * Removes the etiqueta relacionada with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param etiquetaRelacionadaId the primary key of the etiqueta relacionada
	 * @return the etiqueta relacionada that was removed
	 * @throws com.rec.hitss.layer.NoSuchEtiquetaRelacionadaException if a etiqueta relacionada with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EtiquetaRelacionada remove(long etiquetaRelacionadaId)
		throws NoSuchEtiquetaRelacionadaException, SystemException {
		return remove((Serializable)etiquetaRelacionadaId);
	}

	/**
	 * Removes the etiqueta relacionada with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the etiqueta relacionada
	 * @return the etiqueta relacionada that was removed
	 * @throws com.rec.hitss.layer.NoSuchEtiquetaRelacionadaException if a etiqueta relacionada with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EtiquetaRelacionada remove(Serializable primaryKey)
		throws NoSuchEtiquetaRelacionadaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EtiquetaRelacionada etiquetaRelacionada = (EtiquetaRelacionada)session.get(EtiquetaRelacionadaImpl.class,
					primaryKey);

			if (etiquetaRelacionada == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEtiquetaRelacionadaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(etiquetaRelacionada);
		}
		catch (NoSuchEtiquetaRelacionadaException nsee) {
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
	protected EtiquetaRelacionada removeImpl(
		EtiquetaRelacionada etiquetaRelacionada) throws SystemException {
		etiquetaRelacionada = toUnwrappedModel(etiquetaRelacionada);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(etiquetaRelacionada)) {
				etiquetaRelacionada = (EtiquetaRelacionada)session.get(EtiquetaRelacionadaImpl.class,
						etiquetaRelacionada.getPrimaryKeyObj());
			}

			if (etiquetaRelacionada != null) {
				session.delete(etiquetaRelacionada);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (etiquetaRelacionada != null) {
			clearCache(etiquetaRelacionada);
		}

		return etiquetaRelacionada;
	}

	@Override
	public EtiquetaRelacionada updateImpl(
		com.rec.hitss.layer.model.EtiquetaRelacionada etiquetaRelacionada)
		throws SystemException {
		etiquetaRelacionada = toUnwrappedModel(etiquetaRelacionada);

		boolean isNew = etiquetaRelacionada.isNew();

		Session session = null;

		try {
			session = openSession();

			if (etiquetaRelacionada.isNew()) {
				session.save(etiquetaRelacionada);

				etiquetaRelacionada.setNew(false);
			}
			else {
				session.merge(etiquetaRelacionada);
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

		EntityCacheUtil.putResult(EtiquetaRelacionadaModelImpl.ENTITY_CACHE_ENABLED,
			EtiquetaRelacionadaImpl.class, etiquetaRelacionada.getPrimaryKey(),
			etiquetaRelacionada);

		return etiquetaRelacionada;
	}

	protected EtiquetaRelacionada toUnwrappedModel(
		EtiquetaRelacionada etiquetaRelacionada) {
		if (etiquetaRelacionada instanceof EtiquetaRelacionadaImpl) {
			return etiquetaRelacionada;
		}

		EtiquetaRelacionadaImpl etiquetaRelacionadaImpl = new EtiquetaRelacionadaImpl();

		etiquetaRelacionadaImpl.setNew(etiquetaRelacionada.isNew());
		etiquetaRelacionadaImpl.setPrimaryKey(etiquetaRelacionada.getPrimaryKey());

		etiquetaRelacionadaImpl.setEtiquetaRelacionadaId(etiquetaRelacionada.getEtiquetaRelacionadaId());
		etiquetaRelacionadaImpl.setRegistroId(etiquetaRelacionada.getRegistroId());
		etiquetaRelacionadaImpl.setEtiqueta(etiquetaRelacionada.getEtiqueta());
		etiquetaRelacionadaImpl.setTabla(etiquetaRelacionada.getTabla());
		etiquetaRelacionadaImpl.setTagId(etiquetaRelacionada.getTagId());
		etiquetaRelacionadaImpl.setGroupId(etiquetaRelacionada.getGroupId());
		etiquetaRelacionadaImpl.setCompanyId(etiquetaRelacionada.getCompanyId());

		return etiquetaRelacionadaImpl;
	}

	/**
	 * Returns the etiqueta relacionada with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the etiqueta relacionada
	 * @return the etiqueta relacionada
	 * @throws com.rec.hitss.layer.NoSuchEtiquetaRelacionadaException if a etiqueta relacionada with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EtiquetaRelacionada findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEtiquetaRelacionadaException, SystemException {
		EtiquetaRelacionada etiquetaRelacionada = fetchByPrimaryKey(primaryKey);

		if (etiquetaRelacionada == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEtiquetaRelacionadaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return etiquetaRelacionada;
	}

	/**
	 * Returns the etiqueta relacionada with the primary key or throws a {@link com.rec.hitss.layer.NoSuchEtiquetaRelacionadaException} if it could not be found.
	 *
	 * @param etiquetaRelacionadaId the primary key of the etiqueta relacionada
	 * @return the etiqueta relacionada
	 * @throws com.rec.hitss.layer.NoSuchEtiquetaRelacionadaException if a etiqueta relacionada with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EtiquetaRelacionada findByPrimaryKey(long etiquetaRelacionadaId)
		throws NoSuchEtiquetaRelacionadaException, SystemException {
		return findByPrimaryKey((Serializable)etiquetaRelacionadaId);
	}

	/**
	 * Returns the etiqueta relacionada with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the etiqueta relacionada
	 * @return the etiqueta relacionada, or <code>null</code> if a etiqueta relacionada with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EtiquetaRelacionada fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EtiquetaRelacionada etiquetaRelacionada = (EtiquetaRelacionada)EntityCacheUtil.getResult(EtiquetaRelacionadaModelImpl.ENTITY_CACHE_ENABLED,
				EtiquetaRelacionadaImpl.class, primaryKey);

		if (etiquetaRelacionada == _nullEtiquetaRelacionada) {
			return null;
		}

		if (etiquetaRelacionada == null) {
			Session session = null;

			try {
				session = openSession();

				etiquetaRelacionada = (EtiquetaRelacionada)session.get(EtiquetaRelacionadaImpl.class,
						primaryKey);

				if (etiquetaRelacionada != null) {
					cacheResult(etiquetaRelacionada);
				}
				else {
					EntityCacheUtil.putResult(EtiquetaRelacionadaModelImpl.ENTITY_CACHE_ENABLED,
						EtiquetaRelacionadaImpl.class, primaryKey,
						_nullEtiquetaRelacionada);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EtiquetaRelacionadaModelImpl.ENTITY_CACHE_ENABLED,
					EtiquetaRelacionadaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return etiquetaRelacionada;
	}

	/**
	 * Returns the etiqueta relacionada with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param etiquetaRelacionadaId the primary key of the etiqueta relacionada
	 * @return the etiqueta relacionada, or <code>null</code> if a etiqueta relacionada with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EtiquetaRelacionada fetchByPrimaryKey(long etiquetaRelacionadaId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)etiquetaRelacionadaId);
	}

	/**
	 * Returns all the etiqueta relacionadas.
	 *
	 * @return the etiqueta relacionadas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EtiquetaRelacionada> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the etiqueta relacionadas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EtiquetaRelacionadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of etiqueta relacionadas
	 * @param end the upper bound of the range of etiqueta relacionadas (not inclusive)
	 * @return the range of etiqueta relacionadas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EtiquetaRelacionada> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the etiqueta relacionadas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EtiquetaRelacionadaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of etiqueta relacionadas
	 * @param end the upper bound of the range of etiqueta relacionadas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of etiqueta relacionadas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EtiquetaRelacionada> findAll(int start, int end,
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

		List<EtiquetaRelacionada> list = (List<EtiquetaRelacionada>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ETIQUETARELACIONADA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ETIQUETARELACIONADA;

				if (pagination) {
					sql = sql.concat(EtiquetaRelacionadaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EtiquetaRelacionada>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EtiquetaRelacionada>(list);
				}
				else {
					list = (List<EtiquetaRelacionada>)QueryUtil.list(q,
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
	 * Removes all the etiqueta relacionadas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EtiquetaRelacionada etiquetaRelacionada : findAll()) {
			remove(etiquetaRelacionada);
		}
	}

	/**
	 * Returns the number of etiqueta relacionadas.
	 *
	 * @return the number of etiqueta relacionadas
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

				Query q = session.createQuery(_SQL_COUNT_ETIQUETARELACIONADA);

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
	 * Initializes the etiqueta relacionada persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.EtiquetaRelacionada")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EtiquetaRelacionada>> listenersList = new ArrayList<ModelListener<EtiquetaRelacionada>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EtiquetaRelacionada>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EtiquetaRelacionadaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ETIQUETARELACIONADA = "SELECT etiquetaRelacionada FROM EtiquetaRelacionada etiquetaRelacionada";
	private static final String _SQL_COUNT_ETIQUETARELACIONADA = "SELECT COUNT(etiquetaRelacionada) FROM EtiquetaRelacionada etiquetaRelacionada";
	private static final String _ORDER_BY_ENTITY_ALIAS = "etiquetaRelacionada.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EtiquetaRelacionada exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EtiquetaRelacionadaPersistenceImpl.class);
	private static EtiquetaRelacionada _nullEtiquetaRelacionada = new EtiquetaRelacionadaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EtiquetaRelacionada> toCacheModel() {
				return _nullEtiquetaRelacionadaCacheModel;
			}
		};

	private static CacheModel<EtiquetaRelacionada> _nullEtiquetaRelacionadaCacheModel =
		new CacheModel<EtiquetaRelacionada>() {
			@Override
			public EtiquetaRelacionada toEntityModel() {
				return _nullEtiquetaRelacionada;
			}
		};
}
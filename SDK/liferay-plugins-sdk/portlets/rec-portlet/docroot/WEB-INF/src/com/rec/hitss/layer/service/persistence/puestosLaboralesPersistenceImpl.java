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

import com.rec.hitss.layer.NoSuchpuestosLaboralesException;
import com.rec.hitss.layer.model.impl.puestosLaboralesImpl;
import com.rec.hitss.layer.model.impl.puestosLaboralesModelImpl;
import com.rec.hitss.layer.model.puestosLaborales;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the puestos laborales service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see puestosLaboralesPersistence
 * @see puestosLaboralesUtil
 * @generated
 */
public class puestosLaboralesPersistenceImpl extends BasePersistenceImpl<puestosLaborales>
	implements puestosLaboralesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link puestosLaboralesUtil} to access the puestos laborales persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = puestosLaboralesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(puestosLaboralesModelImpl.ENTITY_CACHE_ENABLED,
			puestosLaboralesModelImpl.FINDER_CACHE_ENABLED,
			puestosLaboralesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(puestosLaboralesModelImpl.ENTITY_CACHE_ENABLED,
			puestosLaboralesModelImpl.FINDER_CACHE_ENABLED,
			puestosLaboralesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(puestosLaboralesModelImpl.ENTITY_CACHE_ENABLED,
			puestosLaboralesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public puestosLaboralesPersistenceImpl() {
		setModelClass(puestosLaborales.class);
	}

	/**
	 * Caches the puestos laborales in the entity cache if it is enabled.
	 *
	 * @param puestosLaborales the puestos laborales
	 */
	@Override
	public void cacheResult(puestosLaborales puestosLaborales) {
		EntityCacheUtil.putResult(puestosLaboralesModelImpl.ENTITY_CACHE_ENABLED,
			puestosLaboralesImpl.class, puestosLaborales.getPrimaryKey(),
			puestosLaborales);

		puestosLaborales.resetOriginalValues();
	}

	/**
	 * Caches the puestos laboraleses in the entity cache if it is enabled.
	 *
	 * @param puestosLaboraleses the puestos laboraleses
	 */
	@Override
	public void cacheResult(List<puestosLaborales> puestosLaboraleses) {
		for (puestosLaborales puestosLaborales : puestosLaboraleses) {
			if (EntityCacheUtil.getResult(
						puestosLaboralesModelImpl.ENTITY_CACHE_ENABLED,
						puestosLaboralesImpl.class,
						puestosLaborales.getPrimaryKey()) == null) {
				cacheResult(puestosLaborales);
			}
			else {
				puestosLaborales.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all puestos laboraleses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(puestosLaboralesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(puestosLaboralesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the puestos laborales.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(puestosLaborales puestosLaborales) {
		EntityCacheUtil.removeResult(puestosLaboralesModelImpl.ENTITY_CACHE_ENABLED,
			puestosLaboralesImpl.class, puestosLaborales.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<puestosLaborales> puestosLaboraleses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (puestosLaborales puestosLaborales : puestosLaboraleses) {
			EntityCacheUtil.removeResult(puestosLaboralesModelImpl.ENTITY_CACHE_ENABLED,
				puestosLaboralesImpl.class, puestosLaborales.getPrimaryKey());
		}
	}

	/**
	 * Creates a new puestos laborales with the primary key. Does not add the puestos laborales to the database.
	 *
	 * @param PL_ID the primary key for the new puestos laborales
	 * @return the new puestos laborales
	 */
	@Override
	public puestosLaborales create(long PL_ID) {
		puestosLaborales puestosLaborales = new puestosLaboralesImpl();

		puestosLaborales.setNew(true);
		puestosLaborales.setPrimaryKey(PL_ID);

		return puestosLaborales;
	}

	/**
	 * Removes the puestos laborales with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param PL_ID the primary key of the puestos laborales
	 * @return the puestos laborales that was removed
	 * @throws com.rec.hitss.layer.NoSuchpuestosLaboralesException if a puestos laborales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public puestosLaborales remove(long PL_ID)
		throws NoSuchpuestosLaboralesException, SystemException {
		return remove((Serializable)PL_ID);
	}

	/**
	 * Removes the puestos laborales with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the puestos laborales
	 * @return the puestos laborales that was removed
	 * @throws com.rec.hitss.layer.NoSuchpuestosLaboralesException if a puestos laborales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public puestosLaborales remove(Serializable primaryKey)
		throws NoSuchpuestosLaboralesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			puestosLaborales puestosLaborales = (puestosLaborales)session.get(puestosLaboralesImpl.class,
					primaryKey);

			if (puestosLaborales == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchpuestosLaboralesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(puestosLaborales);
		}
		catch (NoSuchpuestosLaboralesException nsee) {
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
	protected puestosLaborales removeImpl(puestosLaborales puestosLaborales)
		throws SystemException {
		puestosLaborales = toUnwrappedModel(puestosLaborales);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(puestosLaborales)) {
				puestosLaborales = (puestosLaborales)session.get(puestosLaboralesImpl.class,
						puestosLaborales.getPrimaryKeyObj());
			}

			if (puestosLaborales != null) {
				session.delete(puestosLaborales);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (puestosLaborales != null) {
			clearCache(puestosLaborales);
		}

		return puestosLaborales;
	}

	@Override
	public puestosLaborales updateImpl(
		com.rec.hitss.layer.model.puestosLaborales puestosLaborales)
		throws SystemException {
		puestosLaborales = toUnwrappedModel(puestosLaborales);

		boolean isNew = puestosLaborales.isNew();

		Session session = null;

		try {
			session = openSession();

			if (puestosLaborales.isNew()) {
				session.save(puestosLaborales);

				puestosLaborales.setNew(false);
			}
			else {
				session.merge(puestosLaborales);
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

		EntityCacheUtil.putResult(puestosLaboralesModelImpl.ENTITY_CACHE_ENABLED,
			puestosLaboralesImpl.class, puestosLaborales.getPrimaryKey(),
			puestosLaborales);

		return puestosLaborales;
	}

	protected puestosLaborales toUnwrappedModel(
		puestosLaborales puestosLaborales) {
		if (puestosLaborales instanceof puestosLaboralesImpl) {
			return puestosLaborales;
		}

		puestosLaboralesImpl puestosLaboralesImpl = new puestosLaboralesImpl();

		puestosLaboralesImpl.setNew(puestosLaborales.isNew());
		puestosLaboralesImpl.setPrimaryKey(puestosLaborales.getPrimaryKey());

		puestosLaboralesImpl.setPL_ID(puestosLaborales.getPL_ID());
		puestosLaboralesImpl.setPL_PUESTO(puestosLaborales.getPL_PUESTO());
		puestosLaboralesImpl.setPL_ESTADO(puestosLaborales.getPL_ESTADO());
		puestosLaboralesImpl.setPL_ACTIVO(puestosLaborales.getPL_ACTIVO());
		puestosLaboralesImpl.setPL_USUARIO_CREA(puestosLaborales.getPL_USUARIO_CREA());
		puestosLaboralesImpl.setPL_FECHA_CREA(puestosLaborales.getPL_FECHA_CREA());
		puestosLaboralesImpl.setPL_USUARIO_MODIFICA(puestosLaborales.getPL_USUARIO_MODIFICA());
		puestosLaboralesImpl.setPL_FECHA_MODIFICA(puestosLaborales.getPL_FECHA_MODIFICA());

		return puestosLaboralesImpl;
	}

	/**
	 * Returns the puestos laborales with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the puestos laborales
	 * @return the puestos laborales
	 * @throws com.rec.hitss.layer.NoSuchpuestosLaboralesException if a puestos laborales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public puestosLaborales findByPrimaryKey(Serializable primaryKey)
		throws NoSuchpuestosLaboralesException, SystemException {
		puestosLaborales puestosLaborales = fetchByPrimaryKey(primaryKey);

		if (puestosLaborales == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchpuestosLaboralesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return puestosLaborales;
	}

	/**
	 * Returns the puestos laborales with the primary key or throws a {@link com.rec.hitss.layer.NoSuchpuestosLaboralesException} if it could not be found.
	 *
	 * @param PL_ID the primary key of the puestos laborales
	 * @return the puestos laborales
	 * @throws com.rec.hitss.layer.NoSuchpuestosLaboralesException if a puestos laborales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public puestosLaborales findByPrimaryKey(long PL_ID)
		throws NoSuchpuestosLaboralesException, SystemException {
		return findByPrimaryKey((Serializable)PL_ID);
	}

	/**
	 * Returns the puestos laborales with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the puestos laborales
	 * @return the puestos laborales, or <code>null</code> if a puestos laborales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public puestosLaborales fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		puestosLaborales puestosLaborales = (puestosLaborales)EntityCacheUtil.getResult(puestosLaboralesModelImpl.ENTITY_CACHE_ENABLED,
				puestosLaboralesImpl.class, primaryKey);

		if (puestosLaborales == _nullpuestosLaborales) {
			return null;
		}

		if (puestosLaborales == null) {
			Session session = null;

			try {
				session = openSession();

				puestosLaborales = (puestosLaborales)session.get(puestosLaboralesImpl.class,
						primaryKey);

				if (puestosLaborales != null) {
					cacheResult(puestosLaborales);
				}
				else {
					EntityCacheUtil.putResult(puestosLaboralesModelImpl.ENTITY_CACHE_ENABLED,
						puestosLaboralesImpl.class, primaryKey,
						_nullpuestosLaborales);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(puestosLaboralesModelImpl.ENTITY_CACHE_ENABLED,
					puestosLaboralesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return puestosLaborales;
	}

	/**
	 * Returns the puestos laborales with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param PL_ID the primary key of the puestos laborales
	 * @return the puestos laborales, or <code>null</code> if a puestos laborales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public puestosLaborales fetchByPrimaryKey(long PL_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)PL_ID);
	}

	/**
	 * Returns all the puestos laboraleses.
	 *
	 * @return the puestos laboraleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<puestosLaborales> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the puestos laboraleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.puestosLaboralesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of puestos laboraleses
	 * @param end the upper bound of the range of puestos laboraleses (not inclusive)
	 * @return the range of puestos laboraleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<puestosLaborales> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the puestos laboraleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.puestosLaboralesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of puestos laboraleses
	 * @param end the upper bound of the range of puestos laboraleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of puestos laboraleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<puestosLaborales> findAll(int start, int end,
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

		List<puestosLaborales> list = (List<puestosLaborales>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PUESTOSLABORALES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PUESTOSLABORALES;

				if (pagination) {
					sql = sql.concat(puestosLaboralesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<puestosLaborales>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<puestosLaborales>(list);
				}
				else {
					list = (List<puestosLaborales>)QueryUtil.list(q,
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
	 * Removes all the puestos laboraleses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (puestosLaborales puestosLaborales : findAll()) {
			remove(puestosLaborales);
		}
	}

	/**
	 * Returns the number of puestos laboraleses.
	 *
	 * @return the number of puestos laboraleses
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

				Query q = session.createQuery(_SQL_COUNT_PUESTOSLABORALES);

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
	 * Initializes the puestos laborales persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.puestosLaborales")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<puestosLaborales>> listenersList = new ArrayList<ModelListener<puestosLaborales>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<puestosLaborales>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(puestosLaboralesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PUESTOSLABORALES = "SELECT puestosLaborales FROM puestosLaborales puestosLaborales";
	private static final String _SQL_COUNT_PUESTOSLABORALES = "SELECT COUNT(puestosLaborales) FROM puestosLaborales puestosLaborales";
	private static final String _ORDER_BY_ENTITY_ALIAS = "puestosLaborales.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No puestosLaborales exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(puestosLaboralesPersistenceImpl.class);
	private static puestosLaborales _nullpuestosLaborales = new puestosLaboralesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<puestosLaborales> toCacheModel() {
				return _nullpuestosLaboralesCacheModel;
			}
		};

	private static CacheModel<puestosLaborales> _nullpuestosLaboralesCacheModel = new CacheModel<puestosLaborales>() {
			@Override
			public puestosLaborales toEntityModel() {
				return _nullpuestosLaborales;
			}
		};
}
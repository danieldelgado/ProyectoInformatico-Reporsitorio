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

import com.rec.hitss.layer.NoSuchConocimientoException;
import com.rec.hitss.layer.model.Conocimiento;
import com.rec.hitss.layer.model.impl.ConocimientoImpl;
import com.rec.hitss.layer.model.impl.ConocimientoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the conocimiento service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see ConocimientoPersistence
 * @see ConocimientoUtil
 * @generated
 */
public class ConocimientoPersistenceImpl extends BasePersistenceImpl<Conocimiento>
	implements ConocimientoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ConocimientoUtil} to access the conocimiento persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ConocimientoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ConocimientoModelImpl.ENTITY_CACHE_ENABLED,
			ConocimientoModelImpl.FINDER_CACHE_ENABLED, ConocimientoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ConocimientoModelImpl.ENTITY_CACHE_ENABLED,
			ConocimientoModelImpl.FINDER_CACHE_ENABLED, ConocimientoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ConocimientoModelImpl.ENTITY_CACHE_ENABLED,
			ConocimientoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ConocimientoPersistenceImpl() {
		setModelClass(Conocimiento.class);
	}

	/**
	 * Caches the conocimiento in the entity cache if it is enabled.
	 *
	 * @param conocimiento the conocimiento
	 */
	@Override
	public void cacheResult(Conocimiento conocimiento) {
		EntityCacheUtil.putResult(ConocimientoModelImpl.ENTITY_CACHE_ENABLED,
			ConocimientoImpl.class, conocimiento.getPrimaryKey(), conocimiento);

		conocimiento.resetOriginalValues();
	}

	/**
	 * Caches the conocimientos in the entity cache if it is enabled.
	 *
	 * @param conocimientos the conocimientos
	 */
	@Override
	public void cacheResult(List<Conocimiento> conocimientos) {
		for (Conocimiento conocimiento : conocimientos) {
			if (EntityCacheUtil.getResult(
						ConocimientoModelImpl.ENTITY_CACHE_ENABLED,
						ConocimientoImpl.class, conocimiento.getPrimaryKey()) == null) {
				cacheResult(conocimiento);
			}
			else {
				conocimiento.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all conocimientos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ConocimientoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ConocimientoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the conocimiento.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Conocimiento conocimiento) {
		EntityCacheUtil.removeResult(ConocimientoModelImpl.ENTITY_CACHE_ENABLED,
			ConocimientoImpl.class, conocimiento.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Conocimiento> conocimientos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Conocimiento conocimiento : conocimientos) {
			EntityCacheUtil.removeResult(ConocimientoModelImpl.ENTITY_CACHE_ENABLED,
				ConocimientoImpl.class, conocimiento.getPrimaryKey());
		}
	}

	/**
	 * Creates a new conocimiento with the primary key. Does not add the conocimiento to the database.
	 *
	 * @param conocimientoId the primary key for the new conocimiento
	 * @return the new conocimiento
	 */
	@Override
	public Conocimiento create(long conocimientoId) {
		Conocimiento conocimiento = new ConocimientoImpl();

		conocimiento.setNew(true);
		conocimiento.setPrimaryKey(conocimientoId);

		return conocimiento;
	}

	/**
	 * Removes the conocimiento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param conocimientoId the primary key of the conocimiento
	 * @return the conocimiento that was removed
	 * @throws com.rec.hitss.layer.NoSuchConocimientoException if a conocimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Conocimiento remove(long conocimientoId)
		throws NoSuchConocimientoException, SystemException {
		return remove((Serializable)conocimientoId);
	}

	/**
	 * Removes the conocimiento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the conocimiento
	 * @return the conocimiento that was removed
	 * @throws com.rec.hitss.layer.NoSuchConocimientoException if a conocimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Conocimiento remove(Serializable primaryKey)
		throws NoSuchConocimientoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Conocimiento conocimiento = (Conocimiento)session.get(ConocimientoImpl.class,
					primaryKey);

			if (conocimiento == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchConocimientoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(conocimiento);
		}
		catch (NoSuchConocimientoException nsee) {
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
	protected Conocimiento removeImpl(Conocimiento conocimiento)
		throws SystemException {
		conocimiento = toUnwrappedModel(conocimiento);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(conocimiento)) {
				conocimiento = (Conocimiento)session.get(ConocimientoImpl.class,
						conocimiento.getPrimaryKeyObj());
			}

			if (conocimiento != null) {
				session.delete(conocimiento);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (conocimiento != null) {
			clearCache(conocimiento);
		}

		return conocimiento;
	}

	@Override
	public Conocimiento updateImpl(
		com.rec.hitss.layer.model.Conocimiento conocimiento)
		throws SystemException {
		conocimiento = toUnwrappedModel(conocimiento);

		boolean isNew = conocimiento.isNew();

		Session session = null;

		try {
			session = openSession();

			if (conocimiento.isNew()) {
				session.save(conocimiento);

				conocimiento.setNew(false);
			}
			else {
				session.merge(conocimiento);
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

		EntityCacheUtil.putResult(ConocimientoModelImpl.ENTITY_CACHE_ENABLED,
			ConocimientoImpl.class, conocimiento.getPrimaryKey(), conocimiento);

		return conocimiento;
	}

	protected Conocimiento toUnwrappedModel(Conocimiento conocimiento) {
		if (conocimiento instanceof ConocimientoImpl) {
			return conocimiento;
		}

		ConocimientoImpl conocimientoImpl = new ConocimientoImpl();

		conocimientoImpl.setNew(conocimiento.isNew());
		conocimientoImpl.setPrimaryKey(conocimiento.getPrimaryKey());

		conocimientoImpl.setConocimientoId(conocimiento.getConocimientoId());
		conocimientoImpl.setDescripcion(conocimiento.getDescripcion());
		conocimientoImpl.setEtiquetaId(conocimiento.getEtiquetaId());
		conocimientoImpl.setNivel(conocimiento.getNivel());
		conocimientoImpl.setHerramiento(conocimiento.getHerramiento());
		conocimientoImpl.setImplementacion(conocimiento.getImplementacion());
		conocimientoImpl.setActivo(conocimiento.isActivo());
		conocimientoImpl.setUsuariocrea(conocimiento.getUsuariocrea());
		conocimientoImpl.setFechacrea(conocimiento.getFechacrea());
		conocimientoImpl.setUsuariomodifica(conocimiento.getUsuariomodifica());
		conocimientoImpl.setFechacreamodifica(conocimiento.getFechacreamodifica());
		conocimientoImpl.setUsuarioHitssId(conocimiento.getUsuarioHitssId());

		return conocimientoImpl;
	}

	/**
	 * Returns the conocimiento with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the conocimiento
	 * @return the conocimiento
	 * @throws com.rec.hitss.layer.NoSuchConocimientoException if a conocimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Conocimiento findByPrimaryKey(Serializable primaryKey)
		throws NoSuchConocimientoException, SystemException {
		Conocimiento conocimiento = fetchByPrimaryKey(primaryKey);

		if (conocimiento == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchConocimientoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return conocimiento;
	}

	/**
	 * Returns the conocimiento with the primary key or throws a {@link com.rec.hitss.layer.NoSuchConocimientoException} if it could not be found.
	 *
	 * @param conocimientoId the primary key of the conocimiento
	 * @return the conocimiento
	 * @throws com.rec.hitss.layer.NoSuchConocimientoException if a conocimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Conocimiento findByPrimaryKey(long conocimientoId)
		throws NoSuchConocimientoException, SystemException {
		return findByPrimaryKey((Serializable)conocimientoId);
	}

	/**
	 * Returns the conocimiento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the conocimiento
	 * @return the conocimiento, or <code>null</code> if a conocimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Conocimiento fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Conocimiento conocimiento = (Conocimiento)EntityCacheUtil.getResult(ConocimientoModelImpl.ENTITY_CACHE_ENABLED,
				ConocimientoImpl.class, primaryKey);

		if (conocimiento == _nullConocimiento) {
			return null;
		}

		if (conocimiento == null) {
			Session session = null;

			try {
				session = openSession();

				conocimiento = (Conocimiento)session.get(ConocimientoImpl.class,
						primaryKey);

				if (conocimiento != null) {
					cacheResult(conocimiento);
				}
				else {
					EntityCacheUtil.putResult(ConocimientoModelImpl.ENTITY_CACHE_ENABLED,
						ConocimientoImpl.class, primaryKey, _nullConocimiento);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ConocimientoModelImpl.ENTITY_CACHE_ENABLED,
					ConocimientoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return conocimiento;
	}

	/**
	 * Returns the conocimiento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param conocimientoId the primary key of the conocimiento
	 * @return the conocimiento, or <code>null</code> if a conocimiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Conocimiento fetchByPrimaryKey(long conocimientoId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)conocimientoId);
	}

	/**
	 * Returns all the conocimientos.
	 *
	 * @return the conocimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Conocimiento> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the conocimientos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ConocimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of conocimientos
	 * @param end the upper bound of the range of conocimientos (not inclusive)
	 * @return the range of conocimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Conocimiento> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the conocimientos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ConocimientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of conocimientos
	 * @param end the upper bound of the range of conocimientos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of conocimientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Conocimiento> findAll(int start, int end,
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

		List<Conocimiento> list = (List<Conocimiento>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONOCIMIENTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONOCIMIENTO;

				if (pagination) {
					sql = sql.concat(ConocimientoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Conocimiento>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Conocimiento>(list);
				}
				else {
					list = (List<Conocimiento>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the conocimientos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Conocimiento conocimiento : findAll()) {
			remove(conocimiento);
		}
	}

	/**
	 * Returns the number of conocimientos.
	 *
	 * @return the number of conocimientos
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

				Query q = session.createQuery(_SQL_COUNT_CONOCIMIENTO);

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
	 * Initializes the conocimiento persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.Conocimiento")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Conocimiento>> listenersList = new ArrayList<ModelListener<Conocimiento>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Conocimiento>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ConocimientoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CONOCIMIENTO = "SELECT conocimiento FROM Conocimiento conocimiento";
	private static final String _SQL_COUNT_CONOCIMIENTO = "SELECT COUNT(conocimiento) FROM Conocimiento conocimiento";
	private static final String _ORDER_BY_ENTITY_ALIAS = "conocimiento.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Conocimiento exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ConocimientoPersistenceImpl.class);
	private static Conocimiento _nullConocimiento = new ConocimientoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Conocimiento> toCacheModel() {
				return _nullConocimientoCacheModel;
			}
		};

	private static CacheModel<Conocimiento> _nullConocimientoCacheModel = new CacheModel<Conocimiento>() {
			@Override
			public Conocimiento toEntityModel() {
				return _nullConocimiento;
			}
		};
}
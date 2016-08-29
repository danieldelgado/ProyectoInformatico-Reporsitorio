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

import com.hitss.layer.NoSuchUsuarioFuncionException;
import com.hitss.layer.model.UsuarioFuncion;
import com.hitss.layer.model.impl.UsuarioFuncionImpl;
import com.hitss.layer.model.impl.UsuarioFuncionModelImpl;

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
 * The persistence implementation for the usuario funcion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see UsuarioFuncionPersistence
 * @see UsuarioFuncionUtil
 * @generated
 */
public class UsuarioFuncionPersistenceImpl extends BasePersistenceImpl<UsuarioFuncion>
	implements UsuarioFuncionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UsuarioFuncionUtil} to access the usuario funcion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UsuarioFuncionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UsuarioFuncionModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioFuncionModelImpl.FINDER_CACHE_ENABLED,
			UsuarioFuncionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UsuarioFuncionModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioFuncionModelImpl.FINDER_CACHE_ENABLED,
			UsuarioFuncionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UsuarioFuncionModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioFuncionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public UsuarioFuncionPersistenceImpl() {
		setModelClass(UsuarioFuncion.class);
	}

	/**
	 * Caches the usuario funcion in the entity cache if it is enabled.
	 *
	 * @param usuarioFuncion the usuario funcion
	 */
	@Override
	public void cacheResult(UsuarioFuncion usuarioFuncion) {
		EntityCacheUtil.putResult(UsuarioFuncionModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioFuncionImpl.class, usuarioFuncion.getPrimaryKey(),
			usuarioFuncion);

		usuarioFuncion.resetOriginalValues();
	}

	/**
	 * Caches the usuario funcions in the entity cache if it is enabled.
	 *
	 * @param usuarioFuncions the usuario funcions
	 */
	@Override
	public void cacheResult(List<UsuarioFuncion> usuarioFuncions) {
		for (UsuarioFuncion usuarioFuncion : usuarioFuncions) {
			if (EntityCacheUtil.getResult(
						UsuarioFuncionModelImpl.ENTITY_CACHE_ENABLED,
						UsuarioFuncionImpl.class, usuarioFuncion.getPrimaryKey()) == null) {
				cacheResult(usuarioFuncion);
			}
			else {
				usuarioFuncion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all usuario funcions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UsuarioFuncionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UsuarioFuncionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the usuario funcion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UsuarioFuncion usuarioFuncion) {
		EntityCacheUtil.removeResult(UsuarioFuncionModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioFuncionImpl.class, usuarioFuncion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UsuarioFuncion> usuarioFuncions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UsuarioFuncion usuarioFuncion : usuarioFuncions) {
			EntityCacheUtil.removeResult(UsuarioFuncionModelImpl.ENTITY_CACHE_ENABLED,
				UsuarioFuncionImpl.class, usuarioFuncion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new usuario funcion with the primary key. Does not add the usuario funcion to the database.
	 *
	 * @param usuarioFuncionPK the primary key for the new usuario funcion
	 * @return the new usuario funcion
	 */
	@Override
	public UsuarioFuncion create(UsuarioFuncionPK usuarioFuncionPK) {
		UsuarioFuncion usuarioFuncion = new UsuarioFuncionImpl();

		usuarioFuncion.setNew(true);
		usuarioFuncion.setPrimaryKey(usuarioFuncionPK);

		return usuarioFuncion;
	}

	/**
	 * Removes the usuario funcion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param usuarioFuncionPK the primary key of the usuario funcion
	 * @return the usuario funcion that was removed
	 * @throws com.hitss.layer.NoSuchUsuarioFuncionException if a usuario funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioFuncion remove(UsuarioFuncionPK usuarioFuncionPK)
		throws NoSuchUsuarioFuncionException, SystemException {
		return remove((Serializable)usuarioFuncionPK);
	}

	/**
	 * Removes the usuario funcion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the usuario funcion
	 * @return the usuario funcion that was removed
	 * @throws com.hitss.layer.NoSuchUsuarioFuncionException if a usuario funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioFuncion remove(Serializable primaryKey)
		throws NoSuchUsuarioFuncionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UsuarioFuncion usuarioFuncion = (UsuarioFuncion)session.get(UsuarioFuncionImpl.class,
					primaryKey);

			if (usuarioFuncion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUsuarioFuncionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(usuarioFuncion);
		}
		catch (NoSuchUsuarioFuncionException nsee) {
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
	protected UsuarioFuncion removeImpl(UsuarioFuncion usuarioFuncion)
		throws SystemException {
		usuarioFuncion = toUnwrappedModel(usuarioFuncion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(usuarioFuncion)) {
				usuarioFuncion = (UsuarioFuncion)session.get(UsuarioFuncionImpl.class,
						usuarioFuncion.getPrimaryKeyObj());
			}

			if (usuarioFuncion != null) {
				session.delete(usuarioFuncion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (usuarioFuncion != null) {
			clearCache(usuarioFuncion);
		}

		return usuarioFuncion;
	}

	@Override
	public UsuarioFuncion updateImpl(
		com.hitss.layer.model.UsuarioFuncion usuarioFuncion)
		throws SystemException {
		usuarioFuncion = toUnwrappedModel(usuarioFuncion);

		boolean isNew = usuarioFuncion.isNew();

		Session session = null;

		try {
			session = openSession();

			if (usuarioFuncion.isNew()) {
				session.save(usuarioFuncion);

				usuarioFuncion.setNew(false);
			}
			else {
				session.merge(usuarioFuncion);
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

		EntityCacheUtil.putResult(UsuarioFuncionModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioFuncionImpl.class, usuarioFuncion.getPrimaryKey(),
			usuarioFuncion);

		return usuarioFuncion;
	}

	protected UsuarioFuncion toUnwrappedModel(UsuarioFuncion usuarioFuncion) {
		if (usuarioFuncion instanceof UsuarioFuncionImpl) {
			return usuarioFuncion;
		}

		UsuarioFuncionImpl usuarioFuncionImpl = new UsuarioFuncionImpl();

		usuarioFuncionImpl.setNew(usuarioFuncion.isNew());
		usuarioFuncionImpl.setPrimaryKey(usuarioFuncion.getPrimaryKey());

		usuarioFuncionImpl.setUserId(usuarioFuncion.getUserId());
		usuarioFuncionImpl.setFuncionId(usuarioFuncion.getFuncionId());
		usuarioFuncionImpl.setExigible(usuarioFuncion.isExigible());
		usuarioFuncionImpl.setActivo(usuarioFuncion.isActivo());
		usuarioFuncionImpl.setUsuariocrea(usuarioFuncion.getUsuariocrea());
		usuarioFuncionImpl.setFechacrea(usuarioFuncion.getFechacrea());
		usuarioFuncionImpl.setUsuariomodifica(usuarioFuncion.getUsuariomodifica());
		usuarioFuncionImpl.setFechamodifica(usuarioFuncion.getFechamodifica());

		return usuarioFuncionImpl;
	}

	/**
	 * Returns the usuario funcion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the usuario funcion
	 * @return the usuario funcion
	 * @throws com.hitss.layer.NoSuchUsuarioFuncionException if a usuario funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioFuncion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUsuarioFuncionException, SystemException {
		UsuarioFuncion usuarioFuncion = fetchByPrimaryKey(primaryKey);

		if (usuarioFuncion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUsuarioFuncionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return usuarioFuncion;
	}

	/**
	 * Returns the usuario funcion with the primary key or throws a {@link com.hitss.layer.NoSuchUsuarioFuncionException} if it could not be found.
	 *
	 * @param usuarioFuncionPK the primary key of the usuario funcion
	 * @return the usuario funcion
	 * @throws com.hitss.layer.NoSuchUsuarioFuncionException if a usuario funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioFuncion findByPrimaryKey(UsuarioFuncionPK usuarioFuncionPK)
		throws NoSuchUsuarioFuncionException, SystemException {
		return findByPrimaryKey((Serializable)usuarioFuncionPK);
	}

	/**
	 * Returns the usuario funcion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the usuario funcion
	 * @return the usuario funcion, or <code>null</code> if a usuario funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioFuncion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UsuarioFuncion usuarioFuncion = (UsuarioFuncion)EntityCacheUtil.getResult(UsuarioFuncionModelImpl.ENTITY_CACHE_ENABLED,
				UsuarioFuncionImpl.class, primaryKey);

		if (usuarioFuncion == _nullUsuarioFuncion) {
			return null;
		}

		if (usuarioFuncion == null) {
			Session session = null;

			try {
				session = openSession();

				usuarioFuncion = (UsuarioFuncion)session.get(UsuarioFuncionImpl.class,
						primaryKey);

				if (usuarioFuncion != null) {
					cacheResult(usuarioFuncion);
				}
				else {
					EntityCacheUtil.putResult(UsuarioFuncionModelImpl.ENTITY_CACHE_ENABLED,
						UsuarioFuncionImpl.class, primaryKey,
						_nullUsuarioFuncion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UsuarioFuncionModelImpl.ENTITY_CACHE_ENABLED,
					UsuarioFuncionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return usuarioFuncion;
	}

	/**
	 * Returns the usuario funcion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param usuarioFuncionPK the primary key of the usuario funcion
	 * @return the usuario funcion, or <code>null</code> if a usuario funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioFuncion fetchByPrimaryKey(UsuarioFuncionPK usuarioFuncionPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)usuarioFuncionPK);
	}

	/**
	 * Returns all the usuario funcions.
	 *
	 * @return the usuario funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UsuarioFuncion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the usuario funcions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuario funcions
	 * @param end the upper bound of the range of usuario funcions (not inclusive)
	 * @return the range of usuario funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UsuarioFuncion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the usuario funcions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioFuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuario funcions
	 * @param end the upper bound of the range of usuario funcions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of usuario funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UsuarioFuncion> findAll(int start, int end,
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

		List<UsuarioFuncion> list = (List<UsuarioFuncion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USUARIOFUNCION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USUARIOFUNCION;

				if (pagination) {
					sql = sql.concat(UsuarioFuncionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UsuarioFuncion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UsuarioFuncion>(list);
				}
				else {
					list = (List<UsuarioFuncion>)QueryUtil.list(q,
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
	 * Removes all the usuario funcions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UsuarioFuncion usuarioFuncion : findAll()) {
			remove(usuarioFuncion);
		}
	}

	/**
	 * Returns the number of usuario funcions.
	 *
	 * @return the number of usuario funcions
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

				Query q = session.createQuery(_SQL_COUNT_USUARIOFUNCION);

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
	 * Initializes the usuario funcion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.UsuarioFuncion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UsuarioFuncion>> listenersList = new ArrayList<ModelListener<UsuarioFuncion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UsuarioFuncion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UsuarioFuncionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USUARIOFUNCION = "SELECT usuarioFuncion FROM UsuarioFuncion usuarioFuncion";
	private static final String _SQL_COUNT_USUARIOFUNCION = "SELECT COUNT(usuarioFuncion) FROM UsuarioFuncion usuarioFuncion";
	private static final String _ORDER_BY_ENTITY_ALIAS = "usuarioFuncion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UsuarioFuncion exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UsuarioFuncionPersistenceImpl.class);
	private static UsuarioFuncion _nullUsuarioFuncion = new UsuarioFuncionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UsuarioFuncion> toCacheModel() {
				return _nullUsuarioFuncionCacheModel;
			}
		};

	private static CacheModel<UsuarioFuncion> _nullUsuarioFuncionCacheModel = new CacheModel<UsuarioFuncion>() {
			@Override
			public UsuarioFuncion toEntityModel() {
				return _nullUsuarioFuncion;
			}
		};
}
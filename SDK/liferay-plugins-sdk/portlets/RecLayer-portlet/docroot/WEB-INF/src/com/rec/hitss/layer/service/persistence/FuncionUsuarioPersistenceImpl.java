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

import com.rec.hitss.layer.NoSuchFuncionUsuarioException;
import com.rec.hitss.layer.model.FuncionUsuario;
import com.rec.hitss.layer.model.impl.FuncionUsuarioImpl;
import com.rec.hitss.layer.model.impl.FuncionUsuarioModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the funcion usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see FuncionUsuarioPersistence
 * @see FuncionUsuarioUtil
 * @generated
 */
public class FuncionUsuarioPersistenceImpl extends BasePersistenceImpl<FuncionUsuario>
	implements FuncionUsuarioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FuncionUsuarioUtil} to access the funcion usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FuncionUsuarioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FuncionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			FuncionUsuarioModelImpl.FINDER_CACHE_ENABLED,
			FuncionUsuarioImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FuncionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			FuncionUsuarioModelImpl.FINDER_CACHE_ENABLED,
			FuncionUsuarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FuncionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			FuncionUsuarioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public FuncionUsuarioPersistenceImpl() {
		setModelClass(FuncionUsuario.class);
	}

	/**
	 * Caches the funcion usuario in the entity cache if it is enabled.
	 *
	 * @param funcionUsuario the funcion usuario
	 */
	@Override
	public void cacheResult(FuncionUsuario funcionUsuario) {
		EntityCacheUtil.putResult(FuncionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			FuncionUsuarioImpl.class, funcionUsuario.getPrimaryKey(),
			funcionUsuario);

		funcionUsuario.resetOriginalValues();
	}

	/**
	 * Caches the funcion usuarios in the entity cache if it is enabled.
	 *
	 * @param funcionUsuarios the funcion usuarios
	 */
	@Override
	public void cacheResult(List<FuncionUsuario> funcionUsuarios) {
		for (FuncionUsuario funcionUsuario : funcionUsuarios) {
			if (EntityCacheUtil.getResult(
						FuncionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
						FuncionUsuarioImpl.class, funcionUsuario.getPrimaryKey()) == null) {
				cacheResult(funcionUsuario);
			}
			else {
				funcionUsuario.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all funcion usuarios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FuncionUsuarioImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FuncionUsuarioImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the funcion usuario.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FuncionUsuario funcionUsuario) {
		EntityCacheUtil.removeResult(FuncionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			FuncionUsuarioImpl.class, funcionUsuario.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FuncionUsuario> funcionUsuarios) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FuncionUsuario funcionUsuario : funcionUsuarios) {
			EntityCacheUtil.removeResult(FuncionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
				FuncionUsuarioImpl.class, funcionUsuario.getPrimaryKey());
		}
	}

	/**
	 * Creates a new funcion usuario with the primary key. Does not add the funcion usuario to the database.
	 *
	 * @param funcionId the primary key for the new funcion usuario
	 * @return the new funcion usuario
	 */
	@Override
	public FuncionUsuario create(long funcionId) {
		FuncionUsuario funcionUsuario = new FuncionUsuarioImpl();

		funcionUsuario.setNew(true);
		funcionUsuario.setPrimaryKey(funcionId);

		return funcionUsuario;
	}

	/**
	 * Removes the funcion usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param funcionId the primary key of the funcion usuario
	 * @return the funcion usuario that was removed
	 * @throws com.rec.hitss.layer.NoSuchFuncionUsuarioException if a funcion usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuncionUsuario remove(long funcionId)
		throws NoSuchFuncionUsuarioException, SystemException {
		return remove((Serializable)funcionId);
	}

	/**
	 * Removes the funcion usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the funcion usuario
	 * @return the funcion usuario that was removed
	 * @throws com.rec.hitss.layer.NoSuchFuncionUsuarioException if a funcion usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuncionUsuario remove(Serializable primaryKey)
		throws NoSuchFuncionUsuarioException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FuncionUsuario funcionUsuario = (FuncionUsuario)session.get(FuncionUsuarioImpl.class,
					primaryKey);

			if (funcionUsuario == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFuncionUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(funcionUsuario);
		}
		catch (NoSuchFuncionUsuarioException nsee) {
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
	protected FuncionUsuario removeImpl(FuncionUsuario funcionUsuario)
		throws SystemException {
		funcionUsuario = toUnwrappedModel(funcionUsuario);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(funcionUsuario)) {
				funcionUsuario = (FuncionUsuario)session.get(FuncionUsuarioImpl.class,
						funcionUsuario.getPrimaryKeyObj());
			}

			if (funcionUsuario != null) {
				session.delete(funcionUsuario);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (funcionUsuario != null) {
			clearCache(funcionUsuario);
		}

		return funcionUsuario;
	}

	@Override
	public FuncionUsuario updateImpl(
		com.rec.hitss.layer.model.FuncionUsuario funcionUsuario)
		throws SystemException {
		funcionUsuario = toUnwrappedModel(funcionUsuario);

		boolean isNew = funcionUsuario.isNew();

		Session session = null;

		try {
			session = openSession();

			if (funcionUsuario.isNew()) {
				session.save(funcionUsuario);

				funcionUsuario.setNew(false);
			}
			else {
				session.merge(funcionUsuario);
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

		EntityCacheUtil.putResult(FuncionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			FuncionUsuarioImpl.class, funcionUsuario.getPrimaryKey(),
			funcionUsuario);

		return funcionUsuario;
	}

	protected FuncionUsuario toUnwrappedModel(FuncionUsuario funcionUsuario) {
		if (funcionUsuario instanceof FuncionUsuarioImpl) {
			return funcionUsuario;
		}

		FuncionUsuarioImpl funcionUsuarioImpl = new FuncionUsuarioImpl();

		funcionUsuarioImpl.setNew(funcionUsuario.isNew());
		funcionUsuarioImpl.setPrimaryKey(funcionUsuario.getPrimaryKey());

		funcionUsuarioImpl.setFuncionId(funcionUsuario.getFuncionId());
		funcionUsuarioImpl.setUsuarioHitssId(funcionUsuario.getUsuarioHitssId());

		return funcionUsuarioImpl;
	}

	/**
	 * Returns the funcion usuario with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the funcion usuario
	 * @return the funcion usuario
	 * @throws com.rec.hitss.layer.NoSuchFuncionUsuarioException if a funcion usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuncionUsuario findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFuncionUsuarioException, SystemException {
		FuncionUsuario funcionUsuario = fetchByPrimaryKey(primaryKey);

		if (funcionUsuario == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFuncionUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return funcionUsuario;
	}

	/**
	 * Returns the funcion usuario with the primary key or throws a {@link com.rec.hitss.layer.NoSuchFuncionUsuarioException} if it could not be found.
	 *
	 * @param funcionId the primary key of the funcion usuario
	 * @return the funcion usuario
	 * @throws com.rec.hitss.layer.NoSuchFuncionUsuarioException if a funcion usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuncionUsuario findByPrimaryKey(long funcionId)
		throws NoSuchFuncionUsuarioException, SystemException {
		return findByPrimaryKey((Serializable)funcionId);
	}

	/**
	 * Returns the funcion usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the funcion usuario
	 * @return the funcion usuario, or <code>null</code> if a funcion usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuncionUsuario fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		FuncionUsuario funcionUsuario = (FuncionUsuario)EntityCacheUtil.getResult(FuncionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
				FuncionUsuarioImpl.class, primaryKey);

		if (funcionUsuario == _nullFuncionUsuario) {
			return null;
		}

		if (funcionUsuario == null) {
			Session session = null;

			try {
				session = openSession();

				funcionUsuario = (FuncionUsuario)session.get(FuncionUsuarioImpl.class,
						primaryKey);

				if (funcionUsuario != null) {
					cacheResult(funcionUsuario);
				}
				else {
					EntityCacheUtil.putResult(FuncionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
						FuncionUsuarioImpl.class, primaryKey,
						_nullFuncionUsuario);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FuncionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
					FuncionUsuarioImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return funcionUsuario;
	}

	/**
	 * Returns the funcion usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param funcionId the primary key of the funcion usuario
	 * @return the funcion usuario, or <code>null</code> if a funcion usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuncionUsuario fetchByPrimaryKey(long funcionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)funcionId);
	}

	/**
	 * Returns all the funcion usuarios.
	 *
	 * @return the funcion usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FuncionUsuario> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the funcion usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.FuncionUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of funcion usuarios
	 * @param end the upper bound of the range of funcion usuarios (not inclusive)
	 * @return the range of funcion usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FuncionUsuario> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the funcion usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.FuncionUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of funcion usuarios
	 * @param end the upper bound of the range of funcion usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of funcion usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FuncionUsuario> findAll(int start, int end,
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

		List<FuncionUsuario> list = (List<FuncionUsuario>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FUNCIONUSUARIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FUNCIONUSUARIO;

				if (pagination) {
					sql = sql.concat(FuncionUsuarioModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FuncionUsuario>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FuncionUsuario>(list);
				}
				else {
					list = (List<FuncionUsuario>)QueryUtil.list(q,
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
	 * Removes all the funcion usuarios from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (FuncionUsuario funcionUsuario : findAll()) {
			remove(funcionUsuario);
		}
	}

	/**
	 * Returns the number of funcion usuarios.
	 *
	 * @return the number of funcion usuarios
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

				Query q = session.createQuery(_SQL_COUNT_FUNCIONUSUARIO);

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
	 * Initializes the funcion usuario persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.FuncionUsuario")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FuncionUsuario>> listenersList = new ArrayList<ModelListener<FuncionUsuario>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FuncionUsuario>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FuncionUsuarioImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FUNCIONUSUARIO = "SELECT funcionUsuario FROM FuncionUsuario funcionUsuario";
	private static final String _SQL_COUNT_FUNCIONUSUARIO = "SELECT COUNT(funcionUsuario) FROM FuncionUsuario funcionUsuario";
	private static final String _ORDER_BY_ENTITY_ALIAS = "funcionUsuario.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FuncionUsuario exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FuncionUsuarioPersistenceImpl.class);
	private static FuncionUsuario _nullFuncionUsuario = new FuncionUsuarioImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FuncionUsuario> toCacheModel() {
				return _nullFuncionUsuarioCacheModel;
			}
		};

	private static CacheModel<FuncionUsuario> _nullFuncionUsuarioCacheModel = new CacheModel<FuncionUsuario>() {
			@Override
			public FuncionUsuario toEntityModel() {
				return _nullFuncionUsuario;
			}
		};
}
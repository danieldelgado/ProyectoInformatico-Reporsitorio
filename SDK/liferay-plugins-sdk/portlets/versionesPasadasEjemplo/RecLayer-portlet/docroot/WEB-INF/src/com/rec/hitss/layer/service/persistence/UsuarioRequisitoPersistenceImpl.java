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

import com.rec.hitss.layer.NoSuchUsuarioRequisitoException;
import com.rec.hitss.layer.model.UsuarioRequisito;
import com.rec.hitss.layer.model.impl.UsuarioRequisitoImpl;
import com.rec.hitss.layer.model.impl.UsuarioRequisitoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the usuario requisito service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see UsuarioRequisitoPersistence
 * @see UsuarioRequisitoUtil
 * @generated
 */
public class UsuarioRequisitoPersistenceImpl extends BasePersistenceImpl<UsuarioRequisito>
	implements UsuarioRequisitoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UsuarioRequisitoUtil} to access the usuario requisito persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UsuarioRequisitoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UsuarioRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioRequisitoModelImpl.FINDER_CACHE_ENABLED,
			UsuarioRequisitoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UsuarioRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioRequisitoModelImpl.FINDER_CACHE_ENABLED,
			UsuarioRequisitoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UsuarioRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioRequisitoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public UsuarioRequisitoPersistenceImpl() {
		setModelClass(UsuarioRequisito.class);
	}

	/**
	 * Caches the usuario requisito in the entity cache if it is enabled.
	 *
	 * @param usuarioRequisito the usuario requisito
	 */
	@Override
	public void cacheResult(UsuarioRequisito usuarioRequisito) {
		EntityCacheUtil.putResult(UsuarioRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioRequisitoImpl.class, usuarioRequisito.getPrimaryKey(),
			usuarioRequisito);

		usuarioRequisito.resetOriginalValues();
	}

	/**
	 * Caches the usuario requisitos in the entity cache if it is enabled.
	 *
	 * @param usuarioRequisitos the usuario requisitos
	 */
	@Override
	public void cacheResult(List<UsuarioRequisito> usuarioRequisitos) {
		for (UsuarioRequisito usuarioRequisito : usuarioRequisitos) {
			if (EntityCacheUtil.getResult(
						UsuarioRequisitoModelImpl.ENTITY_CACHE_ENABLED,
						UsuarioRequisitoImpl.class,
						usuarioRequisito.getPrimaryKey()) == null) {
				cacheResult(usuarioRequisito);
			}
			else {
				usuarioRequisito.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all usuario requisitos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UsuarioRequisitoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UsuarioRequisitoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the usuario requisito.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UsuarioRequisito usuarioRequisito) {
		EntityCacheUtil.removeResult(UsuarioRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioRequisitoImpl.class, usuarioRequisito.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UsuarioRequisito> usuarioRequisitos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UsuarioRequisito usuarioRequisito : usuarioRequisitos) {
			EntityCacheUtil.removeResult(UsuarioRequisitoModelImpl.ENTITY_CACHE_ENABLED,
				UsuarioRequisitoImpl.class, usuarioRequisito.getPrimaryKey());
		}
	}

	/**
	 * Creates a new usuario requisito with the primary key. Does not add the usuario requisito to the database.
	 *
	 * @param usuarioRequisitoPK the primary key for the new usuario requisito
	 * @return the new usuario requisito
	 */
	@Override
	public UsuarioRequisito create(UsuarioRequisitoPK usuarioRequisitoPK) {
		UsuarioRequisito usuarioRequisito = new UsuarioRequisitoImpl();

		usuarioRequisito.setNew(true);
		usuarioRequisito.setPrimaryKey(usuarioRequisitoPK);

		return usuarioRequisito;
	}

	/**
	 * Removes the usuario requisito with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param usuarioRequisitoPK the primary key of the usuario requisito
	 * @return the usuario requisito that was removed
	 * @throws com.rec.hitss.layer.NoSuchUsuarioRequisitoException if a usuario requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioRequisito remove(UsuarioRequisitoPK usuarioRequisitoPK)
		throws NoSuchUsuarioRequisitoException, SystemException {
		return remove((Serializable)usuarioRequisitoPK);
	}

	/**
	 * Removes the usuario requisito with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the usuario requisito
	 * @return the usuario requisito that was removed
	 * @throws com.rec.hitss.layer.NoSuchUsuarioRequisitoException if a usuario requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioRequisito remove(Serializable primaryKey)
		throws NoSuchUsuarioRequisitoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UsuarioRequisito usuarioRequisito = (UsuarioRequisito)session.get(UsuarioRequisitoImpl.class,
					primaryKey);

			if (usuarioRequisito == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUsuarioRequisitoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(usuarioRequisito);
		}
		catch (NoSuchUsuarioRequisitoException nsee) {
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
	protected UsuarioRequisito removeImpl(UsuarioRequisito usuarioRequisito)
		throws SystemException {
		usuarioRequisito = toUnwrappedModel(usuarioRequisito);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(usuarioRequisito)) {
				usuarioRequisito = (UsuarioRequisito)session.get(UsuarioRequisitoImpl.class,
						usuarioRequisito.getPrimaryKeyObj());
			}

			if (usuarioRequisito != null) {
				session.delete(usuarioRequisito);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (usuarioRequisito != null) {
			clearCache(usuarioRequisito);
		}

		return usuarioRequisito;
	}

	@Override
	public UsuarioRequisito updateImpl(
		com.rec.hitss.layer.model.UsuarioRequisito usuarioRequisito)
		throws SystemException {
		usuarioRequisito = toUnwrappedModel(usuarioRequisito);

		boolean isNew = usuarioRequisito.isNew();

		Session session = null;

		try {
			session = openSession();

			if (usuarioRequisito.isNew()) {
				session.save(usuarioRequisito);

				usuarioRequisito.setNew(false);
			}
			else {
				session.merge(usuarioRequisito);
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

		EntityCacheUtil.putResult(UsuarioRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioRequisitoImpl.class, usuarioRequisito.getPrimaryKey(),
			usuarioRequisito);

		return usuarioRequisito;
	}

	protected UsuarioRequisito toUnwrappedModel(
		UsuarioRequisito usuarioRequisito) {
		if (usuarioRequisito instanceof UsuarioRequisitoImpl) {
			return usuarioRequisito;
		}

		UsuarioRequisitoImpl usuarioRequisitoImpl = new UsuarioRequisitoImpl();

		usuarioRequisitoImpl.setNew(usuarioRequisito.isNew());
		usuarioRequisitoImpl.setPrimaryKey(usuarioRequisito.getPrimaryKey());

		usuarioRequisitoImpl.setUserId(usuarioRequisito.getUserId());
		usuarioRequisitoImpl.setRequisitoId(usuarioRequisito.getRequisitoId());
		usuarioRequisitoImpl.setCumplerequisito(usuarioRequisito.isCumplerequisito());

		return usuarioRequisitoImpl;
	}

	/**
	 * Returns the usuario requisito with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the usuario requisito
	 * @return the usuario requisito
	 * @throws com.rec.hitss.layer.NoSuchUsuarioRequisitoException if a usuario requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioRequisito findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUsuarioRequisitoException, SystemException {
		UsuarioRequisito usuarioRequisito = fetchByPrimaryKey(primaryKey);

		if (usuarioRequisito == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUsuarioRequisitoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return usuarioRequisito;
	}

	/**
	 * Returns the usuario requisito with the primary key or throws a {@link com.rec.hitss.layer.NoSuchUsuarioRequisitoException} if it could not be found.
	 *
	 * @param usuarioRequisitoPK the primary key of the usuario requisito
	 * @return the usuario requisito
	 * @throws com.rec.hitss.layer.NoSuchUsuarioRequisitoException if a usuario requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioRequisito findByPrimaryKey(
		UsuarioRequisitoPK usuarioRequisitoPK)
		throws NoSuchUsuarioRequisitoException, SystemException {
		return findByPrimaryKey((Serializable)usuarioRequisitoPK);
	}

	/**
	 * Returns the usuario requisito with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the usuario requisito
	 * @return the usuario requisito, or <code>null</code> if a usuario requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioRequisito fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UsuarioRequisito usuarioRequisito = (UsuarioRequisito)EntityCacheUtil.getResult(UsuarioRequisitoModelImpl.ENTITY_CACHE_ENABLED,
				UsuarioRequisitoImpl.class, primaryKey);

		if (usuarioRequisito == _nullUsuarioRequisito) {
			return null;
		}

		if (usuarioRequisito == null) {
			Session session = null;

			try {
				session = openSession();

				usuarioRequisito = (UsuarioRequisito)session.get(UsuarioRequisitoImpl.class,
						primaryKey);

				if (usuarioRequisito != null) {
					cacheResult(usuarioRequisito);
				}
				else {
					EntityCacheUtil.putResult(UsuarioRequisitoModelImpl.ENTITY_CACHE_ENABLED,
						UsuarioRequisitoImpl.class, primaryKey,
						_nullUsuarioRequisito);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UsuarioRequisitoModelImpl.ENTITY_CACHE_ENABLED,
					UsuarioRequisitoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return usuarioRequisito;
	}

	/**
	 * Returns the usuario requisito with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param usuarioRequisitoPK the primary key of the usuario requisito
	 * @return the usuario requisito, or <code>null</code> if a usuario requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioRequisito fetchByPrimaryKey(
		UsuarioRequisitoPK usuarioRequisitoPK) throws SystemException {
		return fetchByPrimaryKey((Serializable)usuarioRequisitoPK);
	}

	/**
	 * Returns all the usuario requisitos.
	 *
	 * @return the usuario requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UsuarioRequisito> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the usuario requisitos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.UsuarioRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuario requisitos
	 * @param end the upper bound of the range of usuario requisitos (not inclusive)
	 * @return the range of usuario requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UsuarioRequisito> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the usuario requisitos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.UsuarioRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuario requisitos
	 * @param end the upper bound of the range of usuario requisitos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of usuario requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UsuarioRequisito> findAll(int start, int end,
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

		List<UsuarioRequisito> list = (List<UsuarioRequisito>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USUARIOREQUISITO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USUARIOREQUISITO;

				if (pagination) {
					sql = sql.concat(UsuarioRequisitoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UsuarioRequisito>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UsuarioRequisito>(list);
				}
				else {
					list = (List<UsuarioRequisito>)QueryUtil.list(q,
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
	 * Removes all the usuario requisitos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UsuarioRequisito usuarioRequisito : findAll()) {
			remove(usuarioRequisito);
		}
	}

	/**
	 * Returns the number of usuario requisitos.
	 *
	 * @return the number of usuario requisitos
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

				Query q = session.createQuery(_SQL_COUNT_USUARIOREQUISITO);

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
	 * Initializes the usuario requisito persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.UsuarioRequisito")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UsuarioRequisito>> listenersList = new ArrayList<ModelListener<UsuarioRequisito>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UsuarioRequisito>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UsuarioRequisitoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USUARIOREQUISITO = "SELECT usuarioRequisito FROM UsuarioRequisito usuarioRequisito";
	private static final String _SQL_COUNT_USUARIOREQUISITO = "SELECT COUNT(usuarioRequisito) FROM UsuarioRequisito usuarioRequisito";
	private static final String _ORDER_BY_ENTITY_ALIAS = "usuarioRequisito.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UsuarioRequisito exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UsuarioRequisitoPersistenceImpl.class);
	private static UsuarioRequisito _nullUsuarioRequisito = new UsuarioRequisitoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UsuarioRequisito> toCacheModel() {
				return _nullUsuarioRequisitoCacheModel;
			}
		};

	private static CacheModel<UsuarioRequisito> _nullUsuarioRequisitoCacheModel = new CacheModel<UsuarioRequisito>() {
			@Override
			public UsuarioRequisito toEntityModel() {
				return _nullUsuarioRequisito;
			}
		};
}
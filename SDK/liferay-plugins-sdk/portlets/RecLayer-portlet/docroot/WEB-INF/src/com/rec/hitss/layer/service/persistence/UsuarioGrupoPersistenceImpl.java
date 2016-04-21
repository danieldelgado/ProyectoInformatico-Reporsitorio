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

import com.rec.hitss.layer.NoSuchUsuarioGrupoException;
import com.rec.hitss.layer.model.UsuarioGrupo;
import com.rec.hitss.layer.model.impl.UsuarioGrupoImpl;
import com.rec.hitss.layer.model.impl.UsuarioGrupoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the usuario grupo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see UsuarioGrupoPersistence
 * @see UsuarioGrupoUtil
 * @generated
 */
public class UsuarioGrupoPersistenceImpl extends BasePersistenceImpl<UsuarioGrupo>
	implements UsuarioGrupoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UsuarioGrupoUtil} to access the usuario grupo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UsuarioGrupoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UsuarioGrupoModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioGrupoModelImpl.FINDER_CACHE_ENABLED, UsuarioGrupoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UsuarioGrupoModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioGrupoModelImpl.FINDER_CACHE_ENABLED, UsuarioGrupoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UsuarioGrupoModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioGrupoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public UsuarioGrupoPersistenceImpl() {
		setModelClass(UsuarioGrupo.class);
	}

	/**
	 * Caches the usuario grupo in the entity cache if it is enabled.
	 *
	 * @param usuarioGrupo the usuario grupo
	 */
	@Override
	public void cacheResult(UsuarioGrupo usuarioGrupo) {
		EntityCacheUtil.putResult(UsuarioGrupoModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioGrupoImpl.class, usuarioGrupo.getPrimaryKey(), usuarioGrupo);

		usuarioGrupo.resetOriginalValues();
	}

	/**
	 * Caches the usuario grupos in the entity cache if it is enabled.
	 *
	 * @param usuarioGrupos the usuario grupos
	 */
	@Override
	public void cacheResult(List<UsuarioGrupo> usuarioGrupos) {
		for (UsuarioGrupo usuarioGrupo : usuarioGrupos) {
			if (EntityCacheUtil.getResult(
						UsuarioGrupoModelImpl.ENTITY_CACHE_ENABLED,
						UsuarioGrupoImpl.class, usuarioGrupo.getPrimaryKey()) == null) {
				cacheResult(usuarioGrupo);
			}
			else {
				usuarioGrupo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all usuario grupos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UsuarioGrupoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UsuarioGrupoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the usuario grupo.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UsuarioGrupo usuarioGrupo) {
		EntityCacheUtil.removeResult(UsuarioGrupoModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioGrupoImpl.class, usuarioGrupo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UsuarioGrupo> usuarioGrupos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UsuarioGrupo usuarioGrupo : usuarioGrupos) {
			EntityCacheUtil.removeResult(UsuarioGrupoModelImpl.ENTITY_CACHE_ENABLED,
				UsuarioGrupoImpl.class, usuarioGrupo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new usuario grupo with the primary key. Does not add the usuario grupo to the database.
	 *
	 * @param userGroupId the primary key for the new usuario grupo
	 * @return the new usuario grupo
	 */
	@Override
	public UsuarioGrupo create(long userGroupId) {
		UsuarioGrupo usuarioGrupo = new UsuarioGrupoImpl();

		usuarioGrupo.setNew(true);
		usuarioGrupo.setPrimaryKey(userGroupId);

		return usuarioGrupo;
	}

	/**
	 * Removes the usuario grupo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userGroupId the primary key of the usuario grupo
	 * @return the usuario grupo that was removed
	 * @throws com.rec.hitss.layer.NoSuchUsuarioGrupoException if a usuario grupo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioGrupo remove(long userGroupId)
		throws NoSuchUsuarioGrupoException, SystemException {
		return remove((Serializable)userGroupId);
	}

	/**
	 * Removes the usuario grupo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the usuario grupo
	 * @return the usuario grupo that was removed
	 * @throws com.rec.hitss.layer.NoSuchUsuarioGrupoException if a usuario grupo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioGrupo remove(Serializable primaryKey)
		throws NoSuchUsuarioGrupoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UsuarioGrupo usuarioGrupo = (UsuarioGrupo)session.get(UsuarioGrupoImpl.class,
					primaryKey);

			if (usuarioGrupo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUsuarioGrupoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(usuarioGrupo);
		}
		catch (NoSuchUsuarioGrupoException nsee) {
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
	protected UsuarioGrupo removeImpl(UsuarioGrupo usuarioGrupo)
		throws SystemException {
		usuarioGrupo = toUnwrappedModel(usuarioGrupo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(usuarioGrupo)) {
				usuarioGrupo = (UsuarioGrupo)session.get(UsuarioGrupoImpl.class,
						usuarioGrupo.getPrimaryKeyObj());
			}

			if (usuarioGrupo != null) {
				session.delete(usuarioGrupo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (usuarioGrupo != null) {
			clearCache(usuarioGrupo);
		}

		return usuarioGrupo;
	}

	@Override
	public UsuarioGrupo updateImpl(
		com.rec.hitss.layer.model.UsuarioGrupo usuarioGrupo)
		throws SystemException {
		usuarioGrupo = toUnwrappedModel(usuarioGrupo);

		boolean isNew = usuarioGrupo.isNew();

		Session session = null;

		try {
			session = openSession();

			if (usuarioGrupo.isNew()) {
				session.save(usuarioGrupo);

				usuarioGrupo.setNew(false);
			}
			else {
				session.merge(usuarioGrupo);
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

		EntityCacheUtil.putResult(UsuarioGrupoModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioGrupoImpl.class, usuarioGrupo.getPrimaryKey(), usuarioGrupo);

		return usuarioGrupo;
	}

	protected UsuarioGrupo toUnwrappedModel(UsuarioGrupo usuarioGrupo) {
		if (usuarioGrupo instanceof UsuarioGrupoImpl) {
			return usuarioGrupo;
		}

		UsuarioGrupoImpl usuarioGrupoImpl = new UsuarioGrupoImpl();

		usuarioGrupoImpl.setNew(usuarioGrupo.isNew());
		usuarioGrupoImpl.setPrimaryKey(usuarioGrupo.getPrimaryKey());

		usuarioGrupoImpl.setUserGroupId(usuarioGrupo.getUserGroupId());
		usuarioGrupoImpl.setGroupId(usuarioGrupo.getGroupId());
		usuarioGrupoImpl.setCompanyId(usuarioGrupo.getCompanyId());
		usuarioGrupoImpl.setPrioridadEquiposId(usuarioGrupo.getPrioridadEquiposId());

		return usuarioGrupoImpl;
	}

	/**
	 * Returns the usuario grupo with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the usuario grupo
	 * @return the usuario grupo
	 * @throws com.rec.hitss.layer.NoSuchUsuarioGrupoException if a usuario grupo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioGrupo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUsuarioGrupoException, SystemException {
		UsuarioGrupo usuarioGrupo = fetchByPrimaryKey(primaryKey);

		if (usuarioGrupo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUsuarioGrupoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return usuarioGrupo;
	}

	/**
	 * Returns the usuario grupo with the primary key or throws a {@link com.rec.hitss.layer.NoSuchUsuarioGrupoException} if it could not be found.
	 *
	 * @param userGroupId the primary key of the usuario grupo
	 * @return the usuario grupo
	 * @throws com.rec.hitss.layer.NoSuchUsuarioGrupoException if a usuario grupo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioGrupo findByPrimaryKey(long userGroupId)
		throws NoSuchUsuarioGrupoException, SystemException {
		return findByPrimaryKey((Serializable)userGroupId);
	}

	/**
	 * Returns the usuario grupo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the usuario grupo
	 * @return the usuario grupo, or <code>null</code> if a usuario grupo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioGrupo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UsuarioGrupo usuarioGrupo = (UsuarioGrupo)EntityCacheUtil.getResult(UsuarioGrupoModelImpl.ENTITY_CACHE_ENABLED,
				UsuarioGrupoImpl.class, primaryKey);

		if (usuarioGrupo == _nullUsuarioGrupo) {
			return null;
		}

		if (usuarioGrupo == null) {
			Session session = null;

			try {
				session = openSession();

				usuarioGrupo = (UsuarioGrupo)session.get(UsuarioGrupoImpl.class,
						primaryKey);

				if (usuarioGrupo != null) {
					cacheResult(usuarioGrupo);
				}
				else {
					EntityCacheUtil.putResult(UsuarioGrupoModelImpl.ENTITY_CACHE_ENABLED,
						UsuarioGrupoImpl.class, primaryKey, _nullUsuarioGrupo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UsuarioGrupoModelImpl.ENTITY_CACHE_ENABLED,
					UsuarioGrupoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return usuarioGrupo;
	}

	/**
	 * Returns the usuario grupo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userGroupId the primary key of the usuario grupo
	 * @return the usuario grupo, or <code>null</code> if a usuario grupo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioGrupo fetchByPrimaryKey(long userGroupId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)userGroupId);
	}

	/**
	 * Returns all the usuario grupos.
	 *
	 * @return the usuario grupos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UsuarioGrupo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the usuario grupos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.UsuarioGrupoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuario grupos
	 * @param end the upper bound of the range of usuario grupos (not inclusive)
	 * @return the range of usuario grupos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UsuarioGrupo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the usuario grupos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.UsuarioGrupoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuario grupos
	 * @param end the upper bound of the range of usuario grupos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of usuario grupos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UsuarioGrupo> findAll(int start, int end,
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

		List<UsuarioGrupo> list = (List<UsuarioGrupo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USUARIOGRUPO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USUARIOGRUPO;

				if (pagination) {
					sql = sql.concat(UsuarioGrupoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UsuarioGrupo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UsuarioGrupo>(list);
				}
				else {
					list = (List<UsuarioGrupo>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the usuario grupos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UsuarioGrupo usuarioGrupo : findAll()) {
			remove(usuarioGrupo);
		}
	}

	/**
	 * Returns the number of usuario grupos.
	 *
	 * @return the number of usuario grupos
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

				Query q = session.createQuery(_SQL_COUNT_USUARIOGRUPO);

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
	 * Initializes the usuario grupo persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.UsuarioGrupo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UsuarioGrupo>> listenersList = new ArrayList<ModelListener<UsuarioGrupo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UsuarioGrupo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UsuarioGrupoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USUARIOGRUPO = "SELECT usuarioGrupo FROM UsuarioGrupo usuarioGrupo";
	private static final String _SQL_COUNT_USUARIOGRUPO = "SELECT COUNT(usuarioGrupo) FROM UsuarioGrupo usuarioGrupo";
	private static final String _ORDER_BY_ENTITY_ALIAS = "usuarioGrupo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UsuarioGrupo exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UsuarioGrupoPersistenceImpl.class);
	private static UsuarioGrupo _nullUsuarioGrupo = new UsuarioGrupoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UsuarioGrupo> toCacheModel() {
				return _nullUsuarioGrupoCacheModel;
			}
		};

	private static CacheModel<UsuarioGrupo> _nullUsuarioGrupoCacheModel = new CacheModel<UsuarioGrupo>() {
			@Override
			public UsuarioGrupo toEntityModel() {
				return _nullUsuarioGrupo;
			}
		};
}
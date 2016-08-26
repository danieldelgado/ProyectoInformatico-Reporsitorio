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

import com.hitss.layer.NoSuchRegistrarActividadPlanUsuarioException;
import com.hitss.layer.model.RegistrarActividadPlanUsuario;
import com.hitss.layer.model.impl.RegistrarActividadPlanUsuarioImpl;
import com.hitss.layer.model.impl.RegistrarActividadPlanUsuarioModelImpl;

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
 * The persistence implementation for the registrar actividad plan usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see RegistrarActividadPlanUsuarioPersistence
 * @see RegistrarActividadPlanUsuarioUtil
 * @generated
 */
public class RegistrarActividadPlanUsuarioPersistenceImpl
	extends BasePersistenceImpl<RegistrarActividadPlanUsuario>
	implements RegistrarActividadPlanUsuarioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RegistrarActividadPlanUsuarioUtil} to access the registrar actividad plan usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RegistrarActividadPlanUsuarioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RegistrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			RegistrarActividadPlanUsuarioModelImpl.FINDER_CACHE_ENABLED,
			RegistrarActividadPlanUsuarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RegistrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			RegistrarActividadPlanUsuarioModelImpl.FINDER_CACHE_ENABLED,
			RegistrarActividadPlanUsuarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RegistrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			RegistrarActividadPlanUsuarioModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public RegistrarActividadPlanUsuarioPersistenceImpl() {
		setModelClass(RegistrarActividadPlanUsuario.class);
	}

	/**
	 * Caches the registrar actividad plan usuario in the entity cache if it is enabled.
	 *
	 * @param registrarActividadPlanUsuario the registrar actividad plan usuario
	 */
	@Override
	public void cacheResult(
		RegistrarActividadPlanUsuario registrarActividadPlanUsuario) {
		EntityCacheUtil.putResult(RegistrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			RegistrarActividadPlanUsuarioImpl.class,
			registrarActividadPlanUsuario.getPrimaryKey(),
			registrarActividadPlanUsuario);

		registrarActividadPlanUsuario.resetOriginalValues();
	}

	/**
	 * Caches the registrar actividad plan usuarios in the entity cache if it is enabled.
	 *
	 * @param registrarActividadPlanUsuarios the registrar actividad plan usuarios
	 */
	@Override
	public void cacheResult(
		List<RegistrarActividadPlanUsuario> registrarActividadPlanUsuarios) {
		for (RegistrarActividadPlanUsuario registrarActividadPlanUsuario : registrarActividadPlanUsuarios) {
			if (EntityCacheUtil.getResult(
						RegistrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
						RegistrarActividadPlanUsuarioImpl.class,
						registrarActividadPlanUsuario.getPrimaryKey()) == null) {
				cacheResult(registrarActividadPlanUsuario);
			}
			else {
				registrarActividadPlanUsuario.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all registrar actividad plan usuarios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RegistrarActividadPlanUsuarioImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RegistrarActividadPlanUsuarioImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the registrar actividad plan usuario.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		RegistrarActividadPlanUsuario registrarActividadPlanUsuario) {
		EntityCacheUtil.removeResult(RegistrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			RegistrarActividadPlanUsuarioImpl.class,
			registrarActividadPlanUsuario.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<RegistrarActividadPlanUsuario> registrarActividadPlanUsuarios) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RegistrarActividadPlanUsuario registrarActividadPlanUsuario : registrarActividadPlanUsuarios) {
			EntityCacheUtil.removeResult(RegistrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
				RegistrarActividadPlanUsuarioImpl.class,
				registrarActividadPlanUsuario.getPrimaryKey());
		}
	}

	/**
	 * Creates a new registrar actividad plan usuario with the primary key. Does not add the registrar actividad plan usuario to the database.
	 *
	 * @param registrarActividadPlanUsuarioPK the primary key for the new registrar actividad plan usuario
	 * @return the new registrar actividad plan usuario
	 */
	@Override
	public RegistrarActividadPlanUsuario create(
		RegistrarActividadPlanUsuarioPK registrarActividadPlanUsuarioPK) {
		RegistrarActividadPlanUsuario registrarActividadPlanUsuario = new RegistrarActividadPlanUsuarioImpl();

		registrarActividadPlanUsuario.setNew(true);
		registrarActividadPlanUsuario.setPrimaryKey(registrarActividadPlanUsuarioPK);

		return registrarActividadPlanUsuario;
	}

	/**
	 * Removes the registrar actividad plan usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param registrarActividadPlanUsuarioPK the primary key of the registrar actividad plan usuario
	 * @return the registrar actividad plan usuario that was removed
	 * @throws com.hitss.layer.NoSuchRegistrarActividadPlanUsuarioException if a registrar actividad plan usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrarActividadPlanUsuario remove(
		RegistrarActividadPlanUsuarioPK registrarActividadPlanUsuarioPK)
		throws NoSuchRegistrarActividadPlanUsuarioException, SystemException {
		return remove((Serializable)registrarActividadPlanUsuarioPK);
	}

	/**
	 * Removes the registrar actividad plan usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the registrar actividad plan usuario
	 * @return the registrar actividad plan usuario that was removed
	 * @throws com.hitss.layer.NoSuchRegistrarActividadPlanUsuarioException if a registrar actividad plan usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrarActividadPlanUsuario remove(Serializable primaryKey)
		throws NoSuchRegistrarActividadPlanUsuarioException, SystemException {
		Session session = null;

		try {
			session = openSession();

			RegistrarActividadPlanUsuario registrarActividadPlanUsuario = (RegistrarActividadPlanUsuario)session.get(RegistrarActividadPlanUsuarioImpl.class,
					primaryKey);

			if (registrarActividadPlanUsuario == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRegistrarActividadPlanUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(registrarActividadPlanUsuario);
		}
		catch (NoSuchRegistrarActividadPlanUsuarioException nsee) {
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
	protected RegistrarActividadPlanUsuario removeImpl(
		RegistrarActividadPlanUsuario registrarActividadPlanUsuario)
		throws SystemException {
		registrarActividadPlanUsuario = toUnwrappedModel(registrarActividadPlanUsuario);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(registrarActividadPlanUsuario)) {
				registrarActividadPlanUsuario = (RegistrarActividadPlanUsuario)session.get(RegistrarActividadPlanUsuarioImpl.class,
						registrarActividadPlanUsuario.getPrimaryKeyObj());
			}

			if (registrarActividadPlanUsuario != null) {
				session.delete(registrarActividadPlanUsuario);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (registrarActividadPlanUsuario != null) {
			clearCache(registrarActividadPlanUsuario);
		}

		return registrarActividadPlanUsuario;
	}

	@Override
	public RegistrarActividadPlanUsuario updateImpl(
		com.hitss.layer.model.RegistrarActividadPlanUsuario registrarActividadPlanUsuario)
		throws SystemException {
		registrarActividadPlanUsuario = toUnwrappedModel(registrarActividadPlanUsuario);

		boolean isNew = registrarActividadPlanUsuario.isNew();

		Session session = null;

		try {
			session = openSession();

			if (registrarActividadPlanUsuario.isNew()) {
				session.save(registrarActividadPlanUsuario);

				registrarActividadPlanUsuario.setNew(false);
			}
			else {
				session.merge(registrarActividadPlanUsuario);
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

		EntityCacheUtil.putResult(RegistrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			RegistrarActividadPlanUsuarioImpl.class,
			registrarActividadPlanUsuario.getPrimaryKey(),
			registrarActividadPlanUsuario);

		return registrarActividadPlanUsuario;
	}

	protected RegistrarActividadPlanUsuario toUnwrappedModel(
		RegistrarActividadPlanUsuario registrarActividadPlanUsuario) {
		if (registrarActividadPlanUsuario instanceof RegistrarActividadPlanUsuarioImpl) {
			return registrarActividadPlanUsuario;
		}

		RegistrarActividadPlanUsuarioImpl registrarActividadPlanUsuarioImpl = new RegistrarActividadPlanUsuarioImpl();

		registrarActividadPlanUsuarioImpl.setNew(registrarActividadPlanUsuario.isNew());
		registrarActividadPlanUsuarioImpl.setPrimaryKey(registrarActividadPlanUsuario.getPrimaryKey());

		registrarActividadPlanUsuarioImpl.setActividadPlanId(registrarActividadPlanUsuario.getActividadPlanId());
		registrarActividadPlanUsuarioImpl.setRegisitrarActividadPlanUsuariocoId(registrarActividadPlanUsuario.getRegisitrarActividadPlanUsuariocoId());
		registrarActividadPlanUsuarioImpl.setUsuarioId(registrarActividadPlanUsuario.getUsuarioId());
		registrarActividadPlanUsuarioImpl.setCumplio(registrarActividadPlanUsuario.getCumplio());
		registrarActividadPlanUsuarioImpl.setActividad(registrarActividadPlanUsuario.getActividad());
		registrarActividadPlanUsuarioImpl.setActivo(registrarActividadPlanUsuario.isActivo());
		registrarActividadPlanUsuarioImpl.setUsuariocrea(registrarActividadPlanUsuario.getUsuariocrea());
		registrarActividadPlanUsuarioImpl.setFechacrea(registrarActividadPlanUsuario.getFechacrea());
		registrarActividadPlanUsuarioImpl.setUsuariomodifica(registrarActividadPlanUsuario.getUsuariomodifica());
		registrarActividadPlanUsuarioImpl.setFechamodifica(registrarActividadPlanUsuario.getFechamodifica());

		return registrarActividadPlanUsuarioImpl;
	}

	/**
	 * Returns the registrar actividad plan usuario with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the registrar actividad plan usuario
	 * @return the registrar actividad plan usuario
	 * @throws com.hitss.layer.NoSuchRegistrarActividadPlanUsuarioException if a registrar actividad plan usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrarActividadPlanUsuario findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchRegistrarActividadPlanUsuarioException, SystemException {
		RegistrarActividadPlanUsuario registrarActividadPlanUsuario = fetchByPrimaryKey(primaryKey);

		if (registrarActividadPlanUsuario == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRegistrarActividadPlanUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return registrarActividadPlanUsuario;
	}

	/**
	 * Returns the registrar actividad plan usuario with the primary key or throws a {@link com.hitss.layer.NoSuchRegistrarActividadPlanUsuarioException} if it could not be found.
	 *
	 * @param registrarActividadPlanUsuarioPK the primary key of the registrar actividad plan usuario
	 * @return the registrar actividad plan usuario
	 * @throws com.hitss.layer.NoSuchRegistrarActividadPlanUsuarioException if a registrar actividad plan usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrarActividadPlanUsuario findByPrimaryKey(
		RegistrarActividadPlanUsuarioPK registrarActividadPlanUsuarioPK)
		throws NoSuchRegistrarActividadPlanUsuarioException, SystemException {
		return findByPrimaryKey((Serializable)registrarActividadPlanUsuarioPK);
	}

	/**
	 * Returns the registrar actividad plan usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the registrar actividad plan usuario
	 * @return the registrar actividad plan usuario, or <code>null</code> if a registrar actividad plan usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrarActividadPlanUsuario fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		RegistrarActividadPlanUsuario registrarActividadPlanUsuario = (RegistrarActividadPlanUsuario)EntityCacheUtil.getResult(RegistrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
				RegistrarActividadPlanUsuarioImpl.class, primaryKey);

		if (registrarActividadPlanUsuario == _nullRegistrarActividadPlanUsuario) {
			return null;
		}

		if (registrarActividadPlanUsuario == null) {
			Session session = null;

			try {
				session = openSession();

				registrarActividadPlanUsuario = (RegistrarActividadPlanUsuario)session.get(RegistrarActividadPlanUsuarioImpl.class,
						primaryKey);

				if (registrarActividadPlanUsuario != null) {
					cacheResult(registrarActividadPlanUsuario);
				}
				else {
					EntityCacheUtil.putResult(RegistrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
						RegistrarActividadPlanUsuarioImpl.class, primaryKey,
						_nullRegistrarActividadPlanUsuario);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(RegistrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
					RegistrarActividadPlanUsuarioImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return registrarActividadPlanUsuario;
	}

	/**
	 * Returns the registrar actividad plan usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param registrarActividadPlanUsuarioPK the primary key of the registrar actividad plan usuario
	 * @return the registrar actividad plan usuario, or <code>null</code> if a registrar actividad plan usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrarActividadPlanUsuario fetchByPrimaryKey(
		RegistrarActividadPlanUsuarioPK registrarActividadPlanUsuarioPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)registrarActividadPlanUsuarioPK);
	}

	/**
	 * Returns all the registrar actividad plan usuarios.
	 *
	 * @return the registrar actividad plan usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegistrarActividadPlanUsuario> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the registrar actividad plan usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.RegistrarActividadPlanUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of registrar actividad plan usuarios
	 * @param end the upper bound of the range of registrar actividad plan usuarios (not inclusive)
	 * @return the range of registrar actividad plan usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegistrarActividadPlanUsuario> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the registrar actividad plan usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.RegistrarActividadPlanUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of registrar actividad plan usuarios
	 * @param end the upper bound of the range of registrar actividad plan usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of registrar actividad plan usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegistrarActividadPlanUsuario> findAll(int start, int end,
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

		List<RegistrarActividadPlanUsuario> list = (List<RegistrarActividadPlanUsuario>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_REGISTRARACTIVIDADPLANUSUARIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REGISTRARACTIVIDADPLANUSUARIO;

				if (pagination) {
					sql = sql.concat(RegistrarActividadPlanUsuarioModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RegistrarActividadPlanUsuario>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RegistrarActividadPlanUsuario>(list);
				}
				else {
					list = (List<RegistrarActividadPlanUsuario>)QueryUtil.list(q,
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
	 * Removes all the registrar actividad plan usuarios from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (RegistrarActividadPlanUsuario registrarActividadPlanUsuario : findAll()) {
			remove(registrarActividadPlanUsuario);
		}
	}

	/**
	 * Returns the number of registrar actividad plan usuarios.
	 *
	 * @return the number of registrar actividad plan usuarios
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

				Query q = session.createQuery(_SQL_COUNT_REGISTRARACTIVIDADPLANUSUARIO);

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
	 * Initializes the registrar actividad plan usuario persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.RegistrarActividadPlanUsuario")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<RegistrarActividadPlanUsuario>> listenersList =
					new ArrayList<ModelListener<RegistrarActividadPlanUsuario>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<RegistrarActividadPlanUsuario>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RegistrarActividadPlanUsuarioImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_REGISTRARACTIVIDADPLANUSUARIO = "SELECT registrarActividadPlanUsuario FROM RegistrarActividadPlanUsuario registrarActividadPlanUsuario";
	private static final String _SQL_COUNT_REGISTRARACTIVIDADPLANUSUARIO = "SELECT COUNT(registrarActividadPlanUsuario) FROM RegistrarActividadPlanUsuario registrarActividadPlanUsuario";
	private static final String _ORDER_BY_ENTITY_ALIAS = "registrarActividadPlanUsuario.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RegistrarActividadPlanUsuario exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RegistrarActividadPlanUsuarioPersistenceImpl.class);
	private static RegistrarActividadPlanUsuario _nullRegistrarActividadPlanUsuario =
		new RegistrarActividadPlanUsuarioImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<RegistrarActividadPlanUsuario> toCacheModel() {
				return _nullRegistrarActividadPlanUsuarioCacheModel;
			}
		};

	private static CacheModel<RegistrarActividadPlanUsuario> _nullRegistrarActividadPlanUsuarioCacheModel =
		new CacheModel<RegistrarActividadPlanUsuario>() {
			@Override
			public RegistrarActividadPlanUsuario toEntityModel() {
				return _nullRegistrarActividadPlanUsuario;
			}
		};
}
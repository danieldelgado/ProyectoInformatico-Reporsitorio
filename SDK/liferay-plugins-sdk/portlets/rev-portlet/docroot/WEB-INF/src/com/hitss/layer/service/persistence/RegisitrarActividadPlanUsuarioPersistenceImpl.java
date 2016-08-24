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

import com.hitss.layer.NoSuchRegisitrarActividadPlanUsuarioException;
import com.hitss.layer.model.RegisitrarActividadPlanUsuario;
import com.hitss.layer.model.impl.RegisitrarActividadPlanUsuarioImpl;
import com.hitss.layer.model.impl.RegisitrarActividadPlanUsuarioModelImpl;

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
 * The persistence implementation for the regisitrar actividad plan usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see RegisitrarActividadPlanUsuarioPersistence
 * @see RegisitrarActividadPlanUsuarioUtil
 * @generated
 */
public class RegisitrarActividadPlanUsuarioPersistenceImpl
	extends BasePersistenceImpl<RegisitrarActividadPlanUsuario>
	implements RegisitrarActividadPlanUsuarioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RegisitrarActividadPlanUsuarioUtil} to access the regisitrar actividad plan usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RegisitrarActividadPlanUsuarioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RegisitrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			RegisitrarActividadPlanUsuarioModelImpl.FINDER_CACHE_ENABLED,
			RegisitrarActividadPlanUsuarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RegisitrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			RegisitrarActividadPlanUsuarioModelImpl.FINDER_CACHE_ENABLED,
			RegisitrarActividadPlanUsuarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RegisitrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			RegisitrarActividadPlanUsuarioModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public RegisitrarActividadPlanUsuarioPersistenceImpl() {
		setModelClass(RegisitrarActividadPlanUsuario.class);
	}

	/**
	 * Caches the regisitrar actividad plan usuario in the entity cache if it is enabled.
	 *
	 * @param regisitrarActividadPlanUsuario the regisitrar actividad plan usuario
	 */
	@Override
	public void cacheResult(
		RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario) {
		EntityCacheUtil.putResult(RegisitrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			RegisitrarActividadPlanUsuarioImpl.class,
			regisitrarActividadPlanUsuario.getPrimaryKey(),
			regisitrarActividadPlanUsuario);

		regisitrarActividadPlanUsuario.resetOriginalValues();
	}

	/**
	 * Caches the regisitrar actividad plan usuarios in the entity cache if it is enabled.
	 *
	 * @param regisitrarActividadPlanUsuarios the regisitrar actividad plan usuarios
	 */
	@Override
	public void cacheResult(
		List<RegisitrarActividadPlanUsuario> regisitrarActividadPlanUsuarios) {
		for (RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario : regisitrarActividadPlanUsuarios) {
			if (EntityCacheUtil.getResult(
						RegisitrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
						RegisitrarActividadPlanUsuarioImpl.class,
						regisitrarActividadPlanUsuario.getPrimaryKey()) == null) {
				cacheResult(regisitrarActividadPlanUsuario);
			}
			else {
				regisitrarActividadPlanUsuario.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all regisitrar actividad plan usuarios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RegisitrarActividadPlanUsuarioImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RegisitrarActividadPlanUsuarioImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the regisitrar actividad plan usuario.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario) {
		EntityCacheUtil.removeResult(RegisitrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			RegisitrarActividadPlanUsuarioImpl.class,
			regisitrarActividadPlanUsuario.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<RegisitrarActividadPlanUsuario> regisitrarActividadPlanUsuarios) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario : regisitrarActividadPlanUsuarios) {
			EntityCacheUtil.removeResult(RegisitrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
				RegisitrarActividadPlanUsuarioImpl.class,
				regisitrarActividadPlanUsuario.getPrimaryKey());
		}
	}

	/**
	 * Creates a new regisitrar actividad plan usuario with the primary key. Does not add the regisitrar actividad plan usuario to the database.
	 *
	 * @param regisitrarActividadPlanUsuarioPK the primary key for the new regisitrar actividad plan usuario
	 * @return the new regisitrar actividad plan usuario
	 */
	@Override
	public RegisitrarActividadPlanUsuario create(
		RegisitrarActividadPlanUsuarioPK regisitrarActividadPlanUsuarioPK) {
		RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario = new RegisitrarActividadPlanUsuarioImpl();

		regisitrarActividadPlanUsuario.setNew(true);
		regisitrarActividadPlanUsuario.setPrimaryKey(regisitrarActividadPlanUsuarioPK);

		return regisitrarActividadPlanUsuario;
	}

	/**
	 * Removes the regisitrar actividad plan usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param regisitrarActividadPlanUsuarioPK the primary key of the regisitrar actividad plan usuario
	 * @return the regisitrar actividad plan usuario that was removed
	 * @throws com.hitss.layer.NoSuchRegisitrarActividadPlanUsuarioException if a regisitrar actividad plan usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisitrarActividadPlanUsuario remove(
		RegisitrarActividadPlanUsuarioPK regisitrarActividadPlanUsuarioPK)
		throws NoSuchRegisitrarActividadPlanUsuarioException, SystemException {
		return remove((Serializable)regisitrarActividadPlanUsuarioPK);
	}

	/**
	 * Removes the regisitrar actividad plan usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the regisitrar actividad plan usuario
	 * @return the regisitrar actividad plan usuario that was removed
	 * @throws com.hitss.layer.NoSuchRegisitrarActividadPlanUsuarioException if a regisitrar actividad plan usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisitrarActividadPlanUsuario remove(Serializable primaryKey)
		throws NoSuchRegisitrarActividadPlanUsuarioException, SystemException {
		Session session = null;

		try {
			session = openSession();

			RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario = (RegisitrarActividadPlanUsuario)session.get(RegisitrarActividadPlanUsuarioImpl.class,
					primaryKey);

			if (regisitrarActividadPlanUsuario == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRegisitrarActividadPlanUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(regisitrarActividadPlanUsuario);
		}
		catch (NoSuchRegisitrarActividadPlanUsuarioException nsee) {
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
	protected RegisitrarActividadPlanUsuario removeImpl(
		RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario)
		throws SystemException {
		regisitrarActividadPlanUsuario = toUnwrappedModel(regisitrarActividadPlanUsuario);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(regisitrarActividadPlanUsuario)) {
				regisitrarActividadPlanUsuario = (RegisitrarActividadPlanUsuario)session.get(RegisitrarActividadPlanUsuarioImpl.class,
						regisitrarActividadPlanUsuario.getPrimaryKeyObj());
			}

			if (regisitrarActividadPlanUsuario != null) {
				session.delete(regisitrarActividadPlanUsuario);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (regisitrarActividadPlanUsuario != null) {
			clearCache(regisitrarActividadPlanUsuario);
		}

		return regisitrarActividadPlanUsuario;
	}

	@Override
	public RegisitrarActividadPlanUsuario updateImpl(
		com.hitss.layer.model.RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario)
		throws SystemException {
		regisitrarActividadPlanUsuario = toUnwrappedModel(regisitrarActividadPlanUsuario);

		boolean isNew = regisitrarActividadPlanUsuario.isNew();

		Session session = null;

		try {
			session = openSession();

			if (regisitrarActividadPlanUsuario.isNew()) {
				session.save(regisitrarActividadPlanUsuario);

				regisitrarActividadPlanUsuario.setNew(false);
			}
			else {
				session.merge(regisitrarActividadPlanUsuario);
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

		EntityCacheUtil.putResult(RegisitrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			RegisitrarActividadPlanUsuarioImpl.class,
			regisitrarActividadPlanUsuario.getPrimaryKey(),
			regisitrarActividadPlanUsuario);

		return regisitrarActividadPlanUsuario;
	}

	protected RegisitrarActividadPlanUsuario toUnwrappedModel(
		RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario) {
		if (regisitrarActividadPlanUsuario instanceof RegisitrarActividadPlanUsuarioImpl) {
			return regisitrarActividadPlanUsuario;
		}

		RegisitrarActividadPlanUsuarioImpl regisitrarActividadPlanUsuarioImpl = new RegisitrarActividadPlanUsuarioImpl();

		regisitrarActividadPlanUsuarioImpl.setNew(regisitrarActividadPlanUsuario.isNew());
		regisitrarActividadPlanUsuarioImpl.setPrimaryKey(regisitrarActividadPlanUsuario.getPrimaryKey());

		regisitrarActividadPlanUsuarioImpl.setActividadPlanId(regisitrarActividadPlanUsuario.getActividadPlanId());
		regisitrarActividadPlanUsuarioImpl.setRegisitrarActividadPlanUsuariocoId(regisitrarActividadPlanUsuario.getRegisitrarActividadPlanUsuariocoId());
		regisitrarActividadPlanUsuarioImpl.setUsuarioId(regisitrarActividadPlanUsuario.getUsuarioId());
		regisitrarActividadPlanUsuarioImpl.setCumplio(regisitrarActividadPlanUsuario.getCumplio());
		regisitrarActividadPlanUsuarioImpl.setActividad(regisitrarActividadPlanUsuario.getActividad());
		regisitrarActividadPlanUsuarioImpl.setActivo(regisitrarActividadPlanUsuario.isActivo());
		regisitrarActividadPlanUsuarioImpl.setUsuariocrea(regisitrarActividadPlanUsuario.getUsuariocrea());
		regisitrarActividadPlanUsuarioImpl.setFechacrea(regisitrarActividadPlanUsuario.getFechacrea());
		regisitrarActividadPlanUsuarioImpl.setUsuariomodifica(regisitrarActividadPlanUsuario.getUsuariomodifica());
		regisitrarActividadPlanUsuarioImpl.setFechamodifica(regisitrarActividadPlanUsuario.getFechamodifica());

		return regisitrarActividadPlanUsuarioImpl;
	}

	/**
	 * Returns the regisitrar actividad plan usuario with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the regisitrar actividad plan usuario
	 * @return the regisitrar actividad plan usuario
	 * @throws com.hitss.layer.NoSuchRegisitrarActividadPlanUsuarioException if a regisitrar actividad plan usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisitrarActividadPlanUsuario findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchRegisitrarActividadPlanUsuarioException, SystemException {
		RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario = fetchByPrimaryKey(primaryKey);

		if (regisitrarActividadPlanUsuario == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRegisitrarActividadPlanUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return regisitrarActividadPlanUsuario;
	}

	/**
	 * Returns the regisitrar actividad plan usuario with the primary key or throws a {@link com.hitss.layer.NoSuchRegisitrarActividadPlanUsuarioException} if it could not be found.
	 *
	 * @param regisitrarActividadPlanUsuarioPK the primary key of the regisitrar actividad plan usuario
	 * @return the regisitrar actividad plan usuario
	 * @throws com.hitss.layer.NoSuchRegisitrarActividadPlanUsuarioException if a regisitrar actividad plan usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisitrarActividadPlanUsuario findByPrimaryKey(
		RegisitrarActividadPlanUsuarioPK regisitrarActividadPlanUsuarioPK)
		throws NoSuchRegisitrarActividadPlanUsuarioException, SystemException {
		return findByPrimaryKey((Serializable)regisitrarActividadPlanUsuarioPK);
	}

	/**
	 * Returns the regisitrar actividad plan usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the regisitrar actividad plan usuario
	 * @return the regisitrar actividad plan usuario, or <code>null</code> if a regisitrar actividad plan usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisitrarActividadPlanUsuario fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario = (RegisitrarActividadPlanUsuario)EntityCacheUtil.getResult(RegisitrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
				RegisitrarActividadPlanUsuarioImpl.class, primaryKey);

		if (regisitrarActividadPlanUsuario == _nullRegisitrarActividadPlanUsuario) {
			return null;
		}

		if (regisitrarActividadPlanUsuario == null) {
			Session session = null;

			try {
				session = openSession();

				regisitrarActividadPlanUsuario = (RegisitrarActividadPlanUsuario)session.get(RegisitrarActividadPlanUsuarioImpl.class,
						primaryKey);

				if (regisitrarActividadPlanUsuario != null) {
					cacheResult(regisitrarActividadPlanUsuario);
				}
				else {
					EntityCacheUtil.putResult(RegisitrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
						RegisitrarActividadPlanUsuarioImpl.class, primaryKey,
						_nullRegisitrarActividadPlanUsuario);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(RegisitrarActividadPlanUsuarioModelImpl.ENTITY_CACHE_ENABLED,
					RegisitrarActividadPlanUsuarioImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return regisitrarActividadPlanUsuario;
	}

	/**
	 * Returns the regisitrar actividad plan usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param regisitrarActividadPlanUsuarioPK the primary key of the regisitrar actividad plan usuario
	 * @return the regisitrar actividad plan usuario, or <code>null</code> if a regisitrar actividad plan usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisitrarActividadPlanUsuario fetchByPrimaryKey(
		RegisitrarActividadPlanUsuarioPK regisitrarActividadPlanUsuarioPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)regisitrarActividadPlanUsuarioPK);
	}

	/**
	 * Returns all the regisitrar actividad plan usuarios.
	 *
	 * @return the regisitrar actividad plan usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegisitrarActividadPlanUsuario> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the regisitrar actividad plan usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.RegisitrarActividadPlanUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of regisitrar actividad plan usuarios
	 * @param end the upper bound of the range of regisitrar actividad plan usuarios (not inclusive)
	 * @return the range of regisitrar actividad plan usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegisitrarActividadPlanUsuario> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the regisitrar actividad plan usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.RegisitrarActividadPlanUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of regisitrar actividad plan usuarios
	 * @param end the upper bound of the range of regisitrar actividad plan usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of regisitrar actividad plan usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegisitrarActividadPlanUsuario> findAll(int start, int end,
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

		List<RegisitrarActividadPlanUsuario> list = (List<RegisitrarActividadPlanUsuario>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_REGISITRARACTIVIDADPLANUSUARIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REGISITRARACTIVIDADPLANUSUARIO;

				if (pagination) {
					sql = sql.concat(RegisitrarActividadPlanUsuarioModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RegisitrarActividadPlanUsuario>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RegisitrarActividadPlanUsuario>(list);
				}
				else {
					list = (List<RegisitrarActividadPlanUsuario>)QueryUtil.list(q,
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
	 * Removes all the regisitrar actividad plan usuarios from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario : findAll()) {
			remove(regisitrarActividadPlanUsuario);
		}
	}

	/**
	 * Returns the number of regisitrar actividad plan usuarios.
	 *
	 * @return the number of regisitrar actividad plan usuarios
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

				Query q = session.createQuery(_SQL_COUNT_REGISITRARACTIVIDADPLANUSUARIO);

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
	 * Initializes the regisitrar actividad plan usuario persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.RegisitrarActividadPlanUsuario")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<RegisitrarActividadPlanUsuario>> listenersList =
					new ArrayList<ModelListener<RegisitrarActividadPlanUsuario>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<RegisitrarActividadPlanUsuario>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RegisitrarActividadPlanUsuarioImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_REGISITRARACTIVIDADPLANUSUARIO = "SELECT regisitrarActividadPlanUsuario FROM RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario";
	private static final String _SQL_COUNT_REGISITRARACTIVIDADPLANUSUARIO = "SELECT COUNT(regisitrarActividadPlanUsuario) FROM RegisitrarActividadPlanUsuario regisitrarActividadPlanUsuario";
	private static final String _ORDER_BY_ENTITY_ALIAS = "regisitrarActividadPlanUsuario.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RegisitrarActividadPlanUsuario exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RegisitrarActividadPlanUsuarioPersistenceImpl.class);
	private static RegisitrarActividadPlanUsuario _nullRegisitrarActividadPlanUsuario =
		new RegisitrarActividadPlanUsuarioImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<RegisitrarActividadPlanUsuario> toCacheModel() {
				return _nullRegisitrarActividadPlanUsuarioCacheModel;
			}
		};

	private static CacheModel<RegisitrarActividadPlanUsuario> _nullRegisitrarActividadPlanUsuarioCacheModel =
		new CacheModel<RegisitrarActividadPlanUsuario>() {
			@Override
			public RegisitrarActividadPlanUsuario toEntityModel() {
				return _nullRegisitrarActividadPlanUsuario;
			}
		};
}
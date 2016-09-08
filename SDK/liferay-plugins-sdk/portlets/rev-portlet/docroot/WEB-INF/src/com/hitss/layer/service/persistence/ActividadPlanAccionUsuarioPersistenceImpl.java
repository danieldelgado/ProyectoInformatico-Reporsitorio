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

import com.hitss.layer.NoSuchActividadPlanAccionUsuarioException;
import com.hitss.layer.model.ActividadPlanAccionUsuario;
import com.hitss.layer.model.impl.ActividadPlanAccionUsuarioImpl;
import com.hitss.layer.model.impl.ActividadPlanAccionUsuarioModelImpl;

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
 * The persistence implementation for the actividad plan accion usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see ActividadPlanAccionUsuarioPersistence
 * @see ActividadPlanAccionUsuarioUtil
 * @generated
 */
public class ActividadPlanAccionUsuarioPersistenceImpl
	extends BasePersistenceImpl<ActividadPlanAccionUsuario>
	implements ActividadPlanAccionUsuarioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ActividadPlanAccionUsuarioUtil} to access the actividad plan accion usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ActividadPlanAccionUsuarioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ActividadPlanAccionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			ActividadPlanAccionUsuarioModelImpl.FINDER_CACHE_ENABLED,
			ActividadPlanAccionUsuarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ActividadPlanAccionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			ActividadPlanAccionUsuarioModelImpl.FINDER_CACHE_ENABLED,
			ActividadPlanAccionUsuarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ActividadPlanAccionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			ActividadPlanAccionUsuarioModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public ActividadPlanAccionUsuarioPersistenceImpl() {
		setModelClass(ActividadPlanAccionUsuario.class);
	}

	/**
	 * Caches the actividad plan accion usuario in the entity cache if it is enabled.
	 *
	 * @param actividadPlanAccionUsuario the actividad plan accion usuario
	 */
	@Override
	public void cacheResult(
		ActividadPlanAccionUsuario actividadPlanAccionUsuario) {
		EntityCacheUtil.putResult(ActividadPlanAccionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			ActividadPlanAccionUsuarioImpl.class,
			actividadPlanAccionUsuario.getPrimaryKey(),
			actividadPlanAccionUsuario);

		actividadPlanAccionUsuario.resetOriginalValues();
	}

	/**
	 * Caches the actividad plan accion usuarios in the entity cache if it is enabled.
	 *
	 * @param actividadPlanAccionUsuarios the actividad plan accion usuarios
	 */
	@Override
	public void cacheResult(
		List<ActividadPlanAccionUsuario> actividadPlanAccionUsuarios) {
		for (ActividadPlanAccionUsuario actividadPlanAccionUsuario : actividadPlanAccionUsuarios) {
			if (EntityCacheUtil.getResult(
						ActividadPlanAccionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
						ActividadPlanAccionUsuarioImpl.class,
						actividadPlanAccionUsuario.getPrimaryKey()) == null) {
				cacheResult(actividadPlanAccionUsuario);
			}
			else {
				actividadPlanAccionUsuario.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all actividad plan accion usuarios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ActividadPlanAccionUsuarioImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ActividadPlanAccionUsuarioImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the actividad plan accion usuario.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		ActividadPlanAccionUsuario actividadPlanAccionUsuario) {
		EntityCacheUtil.removeResult(ActividadPlanAccionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			ActividadPlanAccionUsuarioImpl.class,
			actividadPlanAccionUsuario.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<ActividadPlanAccionUsuario> actividadPlanAccionUsuarios) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ActividadPlanAccionUsuario actividadPlanAccionUsuario : actividadPlanAccionUsuarios) {
			EntityCacheUtil.removeResult(ActividadPlanAccionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
				ActividadPlanAccionUsuarioImpl.class,
				actividadPlanAccionUsuario.getPrimaryKey());
		}
	}

	/**
	 * Creates a new actividad plan accion usuario with the primary key. Does not add the actividad plan accion usuario to the database.
	 *
	 * @param actividadPlanAccionUsuarioPK the primary key for the new actividad plan accion usuario
	 * @return the new actividad plan accion usuario
	 */
	@Override
	public ActividadPlanAccionUsuario create(
		ActividadPlanAccionUsuarioPK actividadPlanAccionUsuarioPK) {
		ActividadPlanAccionUsuario actividadPlanAccionUsuario = new ActividadPlanAccionUsuarioImpl();

		actividadPlanAccionUsuario.setNew(true);
		actividadPlanAccionUsuario.setPrimaryKey(actividadPlanAccionUsuarioPK);

		return actividadPlanAccionUsuario;
	}

	/**
	 * Removes the actividad plan accion usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param actividadPlanAccionUsuarioPK the primary key of the actividad plan accion usuario
	 * @return the actividad plan accion usuario that was removed
	 * @throws com.hitss.layer.NoSuchActividadPlanAccionUsuarioException if a actividad plan accion usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadPlanAccionUsuario remove(
		ActividadPlanAccionUsuarioPK actividadPlanAccionUsuarioPK)
		throws NoSuchActividadPlanAccionUsuarioException, SystemException {
		return remove((Serializable)actividadPlanAccionUsuarioPK);
	}

	/**
	 * Removes the actividad plan accion usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the actividad plan accion usuario
	 * @return the actividad plan accion usuario that was removed
	 * @throws com.hitss.layer.NoSuchActividadPlanAccionUsuarioException if a actividad plan accion usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadPlanAccionUsuario remove(Serializable primaryKey)
		throws NoSuchActividadPlanAccionUsuarioException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ActividadPlanAccionUsuario actividadPlanAccionUsuario = (ActividadPlanAccionUsuario)session.get(ActividadPlanAccionUsuarioImpl.class,
					primaryKey);

			if (actividadPlanAccionUsuario == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchActividadPlanAccionUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(actividadPlanAccionUsuario);
		}
		catch (NoSuchActividadPlanAccionUsuarioException nsee) {
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
	protected ActividadPlanAccionUsuario removeImpl(
		ActividadPlanAccionUsuario actividadPlanAccionUsuario)
		throws SystemException {
		actividadPlanAccionUsuario = toUnwrappedModel(actividadPlanAccionUsuario);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(actividadPlanAccionUsuario)) {
				actividadPlanAccionUsuario = (ActividadPlanAccionUsuario)session.get(ActividadPlanAccionUsuarioImpl.class,
						actividadPlanAccionUsuario.getPrimaryKeyObj());
			}

			if (actividadPlanAccionUsuario != null) {
				session.delete(actividadPlanAccionUsuario);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (actividadPlanAccionUsuario != null) {
			clearCache(actividadPlanAccionUsuario);
		}

		return actividadPlanAccionUsuario;
	}

	@Override
	public ActividadPlanAccionUsuario updateImpl(
		com.hitss.layer.model.ActividadPlanAccionUsuario actividadPlanAccionUsuario)
		throws SystemException {
		actividadPlanAccionUsuario = toUnwrappedModel(actividadPlanAccionUsuario);

		boolean isNew = actividadPlanAccionUsuario.isNew();

		Session session = null;

		try {
			session = openSession();

			if (actividadPlanAccionUsuario.isNew()) {
				session.save(actividadPlanAccionUsuario);

				actividadPlanAccionUsuario.setNew(false);
			}
			else {
				session.merge(actividadPlanAccionUsuario);
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

		EntityCacheUtil.putResult(ActividadPlanAccionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			ActividadPlanAccionUsuarioImpl.class,
			actividadPlanAccionUsuario.getPrimaryKey(),
			actividadPlanAccionUsuario);

		return actividadPlanAccionUsuario;
	}

	protected ActividadPlanAccionUsuario toUnwrappedModel(
		ActividadPlanAccionUsuario actividadPlanAccionUsuario) {
		if (actividadPlanAccionUsuario instanceof ActividadPlanAccionUsuarioImpl) {
			return actividadPlanAccionUsuario;
		}

		ActividadPlanAccionUsuarioImpl actividadPlanAccionUsuarioImpl = new ActividadPlanAccionUsuarioImpl();

		actividadPlanAccionUsuarioImpl.setNew(actividadPlanAccionUsuario.isNew());
		actividadPlanAccionUsuarioImpl.setPrimaryKey(actividadPlanAccionUsuario.getPrimaryKey());

		actividadPlanAccionUsuarioImpl.setActividadPlanAccionUsuariocoId(actividadPlanAccionUsuario.getActividadPlanAccionUsuariocoId());
		actividadPlanAccionUsuarioImpl.setActividadPlanId(actividadPlanAccionUsuario.getActividadPlanId());
		actividadPlanAccionUsuarioImpl.setUsuarioId(actividadPlanAccionUsuario.getUsuarioId());
		actividadPlanAccionUsuarioImpl.setCumplio(actividadPlanAccionUsuario.getCumplio());
		actividadPlanAccionUsuarioImpl.setActividad(actividadPlanAccionUsuario.getActividad());
		actividadPlanAccionUsuarioImpl.setPuntuacion(actividadPlanAccionUsuario.getPuntuacion());
		actividadPlanAccionUsuarioImpl.setActivo(actividadPlanAccionUsuario.isActivo());
		actividadPlanAccionUsuarioImpl.setUsuariocrea(actividadPlanAccionUsuario.getUsuariocrea());
		actividadPlanAccionUsuarioImpl.setFechacrea(actividadPlanAccionUsuario.getFechacrea());
		actividadPlanAccionUsuarioImpl.setUsuariomodifica(actividadPlanAccionUsuario.getUsuariomodifica());
		actividadPlanAccionUsuarioImpl.setFechamodifica(actividadPlanAccionUsuario.getFechamodifica());

		return actividadPlanAccionUsuarioImpl;
	}

	/**
	 * Returns the actividad plan accion usuario with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the actividad plan accion usuario
	 * @return the actividad plan accion usuario
	 * @throws com.hitss.layer.NoSuchActividadPlanAccionUsuarioException if a actividad plan accion usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadPlanAccionUsuario findByPrimaryKey(Serializable primaryKey)
		throws NoSuchActividadPlanAccionUsuarioException, SystemException {
		ActividadPlanAccionUsuario actividadPlanAccionUsuario = fetchByPrimaryKey(primaryKey);

		if (actividadPlanAccionUsuario == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchActividadPlanAccionUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return actividadPlanAccionUsuario;
	}

	/**
	 * Returns the actividad plan accion usuario with the primary key or throws a {@link com.hitss.layer.NoSuchActividadPlanAccionUsuarioException} if it could not be found.
	 *
	 * @param actividadPlanAccionUsuarioPK the primary key of the actividad plan accion usuario
	 * @return the actividad plan accion usuario
	 * @throws com.hitss.layer.NoSuchActividadPlanAccionUsuarioException if a actividad plan accion usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadPlanAccionUsuario findByPrimaryKey(
		ActividadPlanAccionUsuarioPK actividadPlanAccionUsuarioPK)
		throws NoSuchActividadPlanAccionUsuarioException, SystemException {
		return findByPrimaryKey((Serializable)actividadPlanAccionUsuarioPK);
	}

	/**
	 * Returns the actividad plan accion usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the actividad plan accion usuario
	 * @return the actividad plan accion usuario, or <code>null</code> if a actividad plan accion usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadPlanAccionUsuario fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ActividadPlanAccionUsuario actividadPlanAccionUsuario = (ActividadPlanAccionUsuario)EntityCacheUtil.getResult(ActividadPlanAccionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
				ActividadPlanAccionUsuarioImpl.class, primaryKey);

		if (actividadPlanAccionUsuario == _nullActividadPlanAccionUsuario) {
			return null;
		}

		if (actividadPlanAccionUsuario == null) {
			Session session = null;

			try {
				session = openSession();

				actividadPlanAccionUsuario = (ActividadPlanAccionUsuario)session.get(ActividadPlanAccionUsuarioImpl.class,
						primaryKey);

				if (actividadPlanAccionUsuario != null) {
					cacheResult(actividadPlanAccionUsuario);
				}
				else {
					EntityCacheUtil.putResult(ActividadPlanAccionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
						ActividadPlanAccionUsuarioImpl.class, primaryKey,
						_nullActividadPlanAccionUsuario);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ActividadPlanAccionUsuarioModelImpl.ENTITY_CACHE_ENABLED,
					ActividadPlanAccionUsuarioImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return actividadPlanAccionUsuario;
	}

	/**
	 * Returns the actividad plan accion usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param actividadPlanAccionUsuarioPK the primary key of the actividad plan accion usuario
	 * @return the actividad plan accion usuario, or <code>null</code> if a actividad plan accion usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadPlanAccionUsuario fetchByPrimaryKey(
		ActividadPlanAccionUsuarioPK actividadPlanAccionUsuarioPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)actividadPlanAccionUsuarioPK);
	}

	/**
	 * Returns all the actividad plan accion usuarios.
	 *
	 * @return the actividad plan accion usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActividadPlanAccionUsuario> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the actividad plan accion usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadPlanAccionUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of actividad plan accion usuarios
	 * @param end the upper bound of the range of actividad plan accion usuarios (not inclusive)
	 * @return the range of actividad plan accion usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActividadPlanAccionUsuario> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the actividad plan accion usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadPlanAccionUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of actividad plan accion usuarios
	 * @param end the upper bound of the range of actividad plan accion usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of actividad plan accion usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActividadPlanAccionUsuario> findAll(int start, int end,
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

		List<ActividadPlanAccionUsuario> list = (List<ActividadPlanAccionUsuario>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACTIVIDADPLANACCIONUSUARIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACTIVIDADPLANACCIONUSUARIO;

				if (pagination) {
					sql = sql.concat(ActividadPlanAccionUsuarioModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ActividadPlanAccionUsuario>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActividadPlanAccionUsuario>(list);
				}
				else {
					list = (List<ActividadPlanAccionUsuario>)QueryUtil.list(q,
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
	 * Removes all the actividad plan accion usuarios from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ActividadPlanAccionUsuario actividadPlanAccionUsuario : findAll()) {
			remove(actividadPlanAccionUsuario);
		}
	}

	/**
	 * Returns the number of actividad plan accion usuarios.
	 *
	 * @return the number of actividad plan accion usuarios
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

				Query q = session.createQuery(_SQL_COUNT_ACTIVIDADPLANACCIONUSUARIO);

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
	 * Initializes the actividad plan accion usuario persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.ActividadPlanAccionUsuario")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ActividadPlanAccionUsuario>> listenersList = new ArrayList<ModelListener<ActividadPlanAccionUsuario>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ActividadPlanAccionUsuario>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ActividadPlanAccionUsuarioImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ACTIVIDADPLANACCIONUSUARIO = "SELECT actividadPlanAccionUsuario FROM ActividadPlanAccionUsuario actividadPlanAccionUsuario";
	private static final String _SQL_COUNT_ACTIVIDADPLANACCIONUSUARIO = "SELECT COUNT(actividadPlanAccionUsuario) FROM ActividadPlanAccionUsuario actividadPlanAccionUsuario";
	private static final String _ORDER_BY_ENTITY_ALIAS = "actividadPlanAccionUsuario.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ActividadPlanAccionUsuario exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ActividadPlanAccionUsuarioPersistenceImpl.class);
	private static ActividadPlanAccionUsuario _nullActividadPlanAccionUsuario = new ActividadPlanAccionUsuarioImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ActividadPlanAccionUsuario> toCacheModel() {
				return _nullActividadPlanAccionUsuarioCacheModel;
			}
		};

	private static CacheModel<ActividadPlanAccionUsuario> _nullActividadPlanAccionUsuarioCacheModel =
		new CacheModel<ActividadPlanAccionUsuario>() {
			@Override
			public ActividadPlanAccionUsuario toEntityModel() {
				return _nullActividadPlanAccionUsuario;
			}
		};
}
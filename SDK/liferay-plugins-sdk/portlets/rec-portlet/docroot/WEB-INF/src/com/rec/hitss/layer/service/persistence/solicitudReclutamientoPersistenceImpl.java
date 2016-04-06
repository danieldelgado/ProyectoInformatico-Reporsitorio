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

import com.rec.hitss.layer.NoSuchsolicitudReclutamientoException;
import com.rec.hitss.layer.model.impl.solicitudReclutamientoImpl;
import com.rec.hitss.layer.model.impl.solicitudReclutamientoModelImpl;
import com.rec.hitss.layer.model.solicitudReclutamiento;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the solicitud reclutamiento service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see solicitudReclutamientoPersistence
 * @see solicitudReclutamientoUtil
 * @generated
 */
public class solicitudReclutamientoPersistenceImpl extends BasePersistenceImpl<solicitudReclutamiento>
	implements solicitudReclutamientoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link solicitudReclutamientoUtil} to access the solicitud reclutamiento persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = solicitudReclutamientoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(solicitudReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			solicitudReclutamientoModelImpl.FINDER_CACHE_ENABLED,
			solicitudReclutamientoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(solicitudReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			solicitudReclutamientoModelImpl.FINDER_CACHE_ENABLED,
			solicitudReclutamientoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(solicitudReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			solicitudReclutamientoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public solicitudReclutamientoPersistenceImpl() {
		setModelClass(solicitudReclutamiento.class);
	}

	/**
	 * Caches the solicitud reclutamiento in the entity cache if it is enabled.
	 *
	 * @param solicitudReclutamiento the solicitud reclutamiento
	 */
	@Override
	public void cacheResult(solicitudReclutamiento solicitudReclutamiento) {
		EntityCacheUtil.putResult(solicitudReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			solicitudReclutamientoImpl.class,
			solicitudReclutamiento.getPrimaryKey(), solicitudReclutamiento);

		solicitudReclutamiento.resetOriginalValues();
	}

	/**
	 * Caches the solicitud reclutamientos in the entity cache if it is enabled.
	 *
	 * @param solicitudReclutamientos the solicitud reclutamientos
	 */
	@Override
	public void cacheResult(
		List<solicitudReclutamiento> solicitudReclutamientos) {
		for (solicitudReclutamiento solicitudReclutamiento : solicitudReclutamientos) {
			if (EntityCacheUtil.getResult(
						solicitudReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
						solicitudReclutamientoImpl.class,
						solicitudReclutamiento.getPrimaryKey()) == null) {
				cacheResult(solicitudReclutamiento);
			}
			else {
				solicitudReclutamiento.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all solicitud reclutamientos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(solicitudReclutamientoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(solicitudReclutamientoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the solicitud reclutamiento.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(solicitudReclutamiento solicitudReclutamiento) {
		EntityCacheUtil.removeResult(solicitudReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			solicitudReclutamientoImpl.class,
			solicitudReclutamiento.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<solicitudReclutamiento> solicitudReclutamientos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (solicitudReclutamiento solicitudReclutamiento : solicitudReclutamientos) {
			EntityCacheUtil.removeResult(solicitudReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
				solicitudReclutamientoImpl.class,
				solicitudReclutamiento.getPrimaryKey());
		}
	}

	/**
	 * Creates a new solicitud reclutamiento with the primary key. Does not add the solicitud reclutamiento to the database.
	 *
	 * @param SR_ID the primary key for the new solicitud reclutamiento
	 * @return the new solicitud reclutamiento
	 */
	@Override
	public solicitudReclutamiento create(long SR_ID) {
		solicitudReclutamiento solicitudReclutamiento = new solicitudReclutamientoImpl();

		solicitudReclutamiento.setNew(true);
		solicitudReclutamiento.setPrimaryKey(SR_ID);

		return solicitudReclutamiento;
	}

	/**
	 * Removes the solicitud reclutamiento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SR_ID the primary key of the solicitud reclutamiento
	 * @return the solicitud reclutamiento that was removed
	 * @throws com.rec.hitss.layer.NoSuchsolicitudReclutamientoException if a solicitud reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public solicitudReclutamiento remove(long SR_ID)
		throws NoSuchsolicitudReclutamientoException, SystemException {
		return remove((Serializable)SR_ID);
	}

	/**
	 * Removes the solicitud reclutamiento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the solicitud reclutamiento
	 * @return the solicitud reclutamiento that was removed
	 * @throws com.rec.hitss.layer.NoSuchsolicitudReclutamientoException if a solicitud reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public solicitudReclutamiento remove(Serializable primaryKey)
		throws NoSuchsolicitudReclutamientoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			solicitudReclutamiento solicitudReclutamiento = (solicitudReclutamiento)session.get(solicitudReclutamientoImpl.class,
					primaryKey);

			if (solicitudReclutamiento == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsolicitudReclutamientoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(solicitudReclutamiento);
		}
		catch (NoSuchsolicitudReclutamientoException nsee) {
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
	protected solicitudReclutamiento removeImpl(
		solicitudReclutamiento solicitudReclutamiento)
		throws SystemException {
		solicitudReclutamiento = toUnwrappedModel(solicitudReclutamiento);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(solicitudReclutamiento)) {
				solicitudReclutamiento = (solicitudReclutamiento)session.get(solicitudReclutamientoImpl.class,
						solicitudReclutamiento.getPrimaryKeyObj());
			}

			if (solicitudReclutamiento != null) {
				session.delete(solicitudReclutamiento);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (solicitudReclutamiento != null) {
			clearCache(solicitudReclutamiento);
		}

		return solicitudReclutamiento;
	}

	@Override
	public solicitudReclutamiento updateImpl(
		com.rec.hitss.layer.model.solicitudReclutamiento solicitudReclutamiento)
		throws SystemException {
		solicitudReclutamiento = toUnwrappedModel(solicitudReclutamiento);

		boolean isNew = solicitudReclutamiento.isNew();

		Session session = null;

		try {
			session = openSession();

			if (solicitudReclutamiento.isNew()) {
				session.save(solicitudReclutamiento);

				solicitudReclutamiento.setNew(false);
			}
			else {
				session.merge(solicitudReclutamiento);
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

		EntityCacheUtil.putResult(solicitudReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			solicitudReclutamientoImpl.class,
			solicitudReclutamiento.getPrimaryKey(), solicitudReclutamiento);

		return solicitudReclutamiento;
	}

	protected solicitudReclutamiento toUnwrappedModel(
		solicitudReclutamiento solicitudReclutamiento) {
		if (solicitudReclutamiento instanceof solicitudReclutamientoImpl) {
			return solicitudReclutamiento;
		}

		solicitudReclutamientoImpl solicitudReclutamientoImpl = new solicitudReclutamientoImpl();

		solicitudReclutamientoImpl.setNew(solicitudReclutamiento.isNew());
		solicitudReclutamientoImpl.setPrimaryKey(solicitudReclutamiento.getPrimaryKey());

		solicitudReclutamientoImpl.setSR_ID(solicitudReclutamiento.getSR_ID());
		solicitudReclutamientoImpl.setSR_PL_ID(solicitudReclutamiento.getSR_PL_ID());
		solicitudReclutamientoImpl.setSR_ESTADO(solicitudReclutamiento.getSR_ESTADO());
		solicitudReclutamientoImpl.setSR_ACTIVO(solicitudReclutamiento.getSR_ACTIVO());
		solicitudReclutamientoImpl.setSR_USUARIO_CREA(solicitudReclutamiento.getSR_USUARIO_CREA());
		solicitudReclutamientoImpl.setSR_FECHA_CREA(solicitudReclutamiento.getSR_FECHA_CREA());
		solicitudReclutamientoImpl.setSR_USUARIO_MODIFICA(solicitudReclutamiento.getSR_USUARIO_MODIFICA());
		solicitudReclutamientoImpl.setSR_FECHA_MODIFICA(solicitudReclutamiento.getSR_FECHA_MODIFICA());

		return solicitudReclutamientoImpl;
	}

	/**
	 * Returns the solicitud reclutamiento with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the solicitud reclutamiento
	 * @return the solicitud reclutamiento
	 * @throws com.rec.hitss.layer.NoSuchsolicitudReclutamientoException if a solicitud reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public solicitudReclutamiento findByPrimaryKey(Serializable primaryKey)
		throws NoSuchsolicitudReclutamientoException, SystemException {
		solicitudReclutamiento solicitudReclutamiento = fetchByPrimaryKey(primaryKey);

		if (solicitudReclutamiento == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsolicitudReclutamientoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return solicitudReclutamiento;
	}

	/**
	 * Returns the solicitud reclutamiento with the primary key or throws a {@link com.rec.hitss.layer.NoSuchsolicitudReclutamientoException} if it could not be found.
	 *
	 * @param SR_ID the primary key of the solicitud reclutamiento
	 * @return the solicitud reclutamiento
	 * @throws com.rec.hitss.layer.NoSuchsolicitudReclutamientoException if a solicitud reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public solicitudReclutamiento findByPrimaryKey(long SR_ID)
		throws NoSuchsolicitudReclutamientoException, SystemException {
		return findByPrimaryKey((Serializable)SR_ID);
	}

	/**
	 * Returns the solicitud reclutamiento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the solicitud reclutamiento
	 * @return the solicitud reclutamiento, or <code>null</code> if a solicitud reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public solicitudReclutamiento fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		solicitudReclutamiento solicitudReclutamiento = (solicitudReclutamiento)EntityCacheUtil.getResult(solicitudReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
				solicitudReclutamientoImpl.class, primaryKey);

		if (solicitudReclutamiento == _nullsolicitudReclutamiento) {
			return null;
		}

		if (solicitudReclutamiento == null) {
			Session session = null;

			try {
				session = openSession();

				solicitudReclutamiento = (solicitudReclutamiento)session.get(solicitudReclutamientoImpl.class,
						primaryKey);

				if (solicitudReclutamiento != null) {
					cacheResult(solicitudReclutamiento);
				}
				else {
					EntityCacheUtil.putResult(solicitudReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
						solicitudReclutamientoImpl.class, primaryKey,
						_nullsolicitudReclutamiento);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(solicitudReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
					solicitudReclutamientoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return solicitudReclutamiento;
	}

	/**
	 * Returns the solicitud reclutamiento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SR_ID the primary key of the solicitud reclutamiento
	 * @return the solicitud reclutamiento, or <code>null</code> if a solicitud reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public solicitudReclutamiento fetchByPrimaryKey(long SR_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)SR_ID);
	}

	/**
	 * Returns all the solicitud reclutamientos.
	 *
	 * @return the solicitud reclutamientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<solicitudReclutamiento> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud reclutamientos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.solicitudReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of solicitud reclutamientos
	 * @param end the upper bound of the range of solicitud reclutamientos (not inclusive)
	 * @return the range of solicitud reclutamientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<solicitudReclutamiento> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud reclutamientos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.solicitudReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of solicitud reclutamientos
	 * @param end the upper bound of the range of solicitud reclutamientos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of solicitud reclutamientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<solicitudReclutamiento> findAll(int start, int end,
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

		List<solicitudReclutamiento> list = (List<solicitudReclutamiento>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SOLICITUDRECLUTAMIENTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SOLICITUDRECLUTAMIENTO;

				if (pagination) {
					sql = sql.concat(solicitudReclutamientoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<solicitudReclutamiento>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<solicitudReclutamiento>(list);
				}
				else {
					list = (List<solicitudReclutamiento>)QueryUtil.list(q,
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
	 * Removes all the solicitud reclutamientos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (solicitudReclutamiento solicitudReclutamiento : findAll()) {
			remove(solicitudReclutamiento);
		}
	}

	/**
	 * Returns the number of solicitud reclutamientos.
	 *
	 * @return the number of solicitud reclutamientos
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

				Query q = session.createQuery(_SQL_COUNT_SOLICITUDRECLUTAMIENTO);

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
	 * Initializes the solicitud reclutamiento persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.solicitudReclutamiento")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<solicitudReclutamiento>> listenersList = new ArrayList<ModelListener<solicitudReclutamiento>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<solicitudReclutamiento>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(solicitudReclutamientoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SOLICITUDRECLUTAMIENTO = "SELECT solicitudReclutamiento FROM solicitudReclutamiento solicitudReclutamiento";
	private static final String _SQL_COUNT_SOLICITUDRECLUTAMIENTO = "SELECT COUNT(solicitudReclutamiento) FROM solicitudReclutamiento solicitudReclutamiento";
	private static final String _ORDER_BY_ENTITY_ALIAS = "solicitudReclutamiento.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No solicitudReclutamiento exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(solicitudReclutamientoPersistenceImpl.class);
	private static solicitudReclutamiento _nullsolicitudReclutamiento = new solicitudReclutamientoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<solicitudReclutamiento> toCacheModel() {
				return _nullsolicitudReclutamientoCacheModel;
			}
		};

	private static CacheModel<solicitudReclutamiento> _nullsolicitudReclutamientoCacheModel =
		new CacheModel<solicitudReclutamiento>() {
			@Override
			public solicitudReclutamiento toEntityModel() {
				return _nullsolicitudReclutamiento;
			}
		};
}
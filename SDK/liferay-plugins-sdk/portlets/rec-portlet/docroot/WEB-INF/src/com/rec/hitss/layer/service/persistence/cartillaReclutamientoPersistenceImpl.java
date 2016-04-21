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

import com.rec.hitss.layer.NoSuchcartillaReclutamientoException;
import com.rec.hitss.layer.model.cartillaReclutamiento;
import com.rec.hitss.layer.model.impl.cartillaReclutamientoImpl;
import com.rec.hitss.layer.model.impl.cartillaReclutamientoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the cartilla reclutamiento service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see cartillaReclutamientoPersistence
 * @see cartillaReclutamientoUtil
 * @generated
 */
public class cartillaReclutamientoPersistenceImpl extends BasePersistenceImpl<cartillaReclutamiento>
	implements cartillaReclutamientoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link cartillaReclutamientoUtil} to access the cartilla reclutamiento persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = cartillaReclutamientoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(cartillaReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			cartillaReclutamientoModelImpl.FINDER_CACHE_ENABLED,
			cartillaReclutamientoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(cartillaReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			cartillaReclutamientoModelImpl.FINDER_CACHE_ENABLED,
			cartillaReclutamientoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(cartillaReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			cartillaReclutamientoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public cartillaReclutamientoPersistenceImpl() {
		setModelClass(cartillaReclutamiento.class);
	}

	/**
	 * Caches the cartilla reclutamiento in the entity cache if it is enabled.
	 *
	 * @param cartillaReclutamiento the cartilla reclutamiento
	 */
	@Override
	public void cacheResult(cartillaReclutamiento cartillaReclutamiento) {
		EntityCacheUtil.putResult(cartillaReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			cartillaReclutamientoImpl.class,
			cartillaReclutamiento.getPrimaryKey(), cartillaReclutamiento);

		cartillaReclutamiento.resetOriginalValues();
	}

	/**
	 * Caches the cartilla reclutamientos in the entity cache if it is enabled.
	 *
	 * @param cartillaReclutamientos the cartilla reclutamientos
	 */
	@Override
	public void cacheResult(List<cartillaReclutamiento> cartillaReclutamientos) {
		for (cartillaReclutamiento cartillaReclutamiento : cartillaReclutamientos) {
			if (EntityCacheUtil.getResult(
						cartillaReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
						cartillaReclutamientoImpl.class,
						cartillaReclutamiento.getPrimaryKey()) == null) {
				cacheResult(cartillaReclutamiento);
			}
			else {
				cartillaReclutamiento.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cartilla reclutamientos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(cartillaReclutamientoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(cartillaReclutamientoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cartilla reclutamiento.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(cartillaReclutamiento cartillaReclutamiento) {
		EntityCacheUtil.removeResult(cartillaReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			cartillaReclutamientoImpl.class,
			cartillaReclutamiento.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<cartillaReclutamiento> cartillaReclutamientos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (cartillaReclutamiento cartillaReclutamiento : cartillaReclutamientos) {
			EntityCacheUtil.removeResult(cartillaReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
				cartillaReclutamientoImpl.class,
				cartillaReclutamiento.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cartilla reclutamiento with the primary key. Does not add the cartilla reclutamiento to the database.
	 *
	 * @param CR_ID the primary key for the new cartilla reclutamiento
	 * @return the new cartilla reclutamiento
	 */
	@Override
	public cartillaReclutamiento create(long CR_ID) {
		cartillaReclutamiento cartillaReclutamiento = new cartillaReclutamientoImpl();

		cartillaReclutamiento.setNew(true);
		cartillaReclutamiento.setPrimaryKey(CR_ID);

		return cartillaReclutamiento;
	}

	/**
	 * Removes the cartilla reclutamiento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CR_ID the primary key of the cartilla reclutamiento
	 * @return the cartilla reclutamiento that was removed
	 * @throws com.rec.hitss.layer.NoSuchcartillaReclutamientoException if a cartilla reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cartillaReclutamiento remove(long CR_ID)
		throws NoSuchcartillaReclutamientoException, SystemException {
		return remove((Serializable)CR_ID);
	}

	/**
	 * Removes the cartilla reclutamiento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cartilla reclutamiento
	 * @return the cartilla reclutamiento that was removed
	 * @throws com.rec.hitss.layer.NoSuchcartillaReclutamientoException if a cartilla reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cartillaReclutamiento remove(Serializable primaryKey)
		throws NoSuchcartillaReclutamientoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			cartillaReclutamiento cartillaReclutamiento = (cartillaReclutamiento)session.get(cartillaReclutamientoImpl.class,
					primaryKey);

			if (cartillaReclutamiento == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcartillaReclutamientoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cartillaReclutamiento);
		}
		catch (NoSuchcartillaReclutamientoException nsee) {
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
	protected cartillaReclutamiento removeImpl(
		cartillaReclutamiento cartillaReclutamiento) throws SystemException {
		cartillaReclutamiento = toUnwrappedModel(cartillaReclutamiento);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cartillaReclutamiento)) {
				cartillaReclutamiento = (cartillaReclutamiento)session.get(cartillaReclutamientoImpl.class,
						cartillaReclutamiento.getPrimaryKeyObj());
			}

			if (cartillaReclutamiento != null) {
				session.delete(cartillaReclutamiento);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cartillaReclutamiento != null) {
			clearCache(cartillaReclutamiento);
		}

		return cartillaReclutamiento;
	}

	@Override
	public cartillaReclutamiento updateImpl(
		com.rec.hitss.layer.model.cartillaReclutamiento cartillaReclutamiento)
		throws SystemException {
		cartillaReclutamiento = toUnwrappedModel(cartillaReclutamiento);

		boolean isNew = cartillaReclutamiento.isNew();

		Session session = null;

		try {
			session = openSession();

			if (cartillaReclutamiento.isNew()) {
				session.save(cartillaReclutamiento);

				cartillaReclutamiento.setNew(false);
			}
			else {
				session.merge(cartillaReclutamiento);
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

		EntityCacheUtil.putResult(cartillaReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
			cartillaReclutamientoImpl.class,
			cartillaReclutamiento.getPrimaryKey(), cartillaReclutamiento);

		return cartillaReclutamiento;
	}

	protected cartillaReclutamiento toUnwrappedModel(
		cartillaReclutamiento cartillaReclutamiento) {
		if (cartillaReclutamiento instanceof cartillaReclutamientoImpl) {
			return cartillaReclutamiento;
		}

		cartillaReclutamientoImpl cartillaReclutamientoImpl = new cartillaReclutamientoImpl();

		cartillaReclutamientoImpl.setNew(cartillaReclutamiento.isNew());
		cartillaReclutamientoImpl.setPrimaryKey(cartillaReclutamiento.getPrimaryKey());

		cartillaReclutamientoImpl.setCR_ID(cartillaReclutamiento.getCR_ID());
		cartillaReclutamientoImpl.setCR_ESTADO(cartillaReclutamiento.getCR_ESTADO());
		cartillaReclutamientoImpl.setCR_ACTIVO(cartillaReclutamiento.getCR_ACTIVO());
		cartillaReclutamientoImpl.setCR_USUARIO_CREA(cartillaReclutamiento.getCR_USUARIO_CREA());
		cartillaReclutamientoImpl.setCR_FECHA_CREA(cartillaReclutamiento.getCR_FECHA_CREA());
		cartillaReclutamientoImpl.setCR_USUARIO_MODIFICA(cartillaReclutamiento.getCR_USUARIO_MODIFICA());
		cartillaReclutamientoImpl.setCR_FECHA_MODIFICA(cartillaReclutamiento.getCR_FECHA_MODIFICA());

		return cartillaReclutamientoImpl;
	}

	/**
	 * Returns the cartilla reclutamiento with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cartilla reclutamiento
	 * @return the cartilla reclutamiento
	 * @throws com.rec.hitss.layer.NoSuchcartillaReclutamientoException if a cartilla reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cartillaReclutamiento findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcartillaReclutamientoException, SystemException {
		cartillaReclutamiento cartillaReclutamiento = fetchByPrimaryKey(primaryKey);

		if (cartillaReclutamiento == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcartillaReclutamientoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cartillaReclutamiento;
	}

	/**
	 * Returns the cartilla reclutamiento with the primary key or throws a {@link com.rec.hitss.layer.NoSuchcartillaReclutamientoException} if it could not be found.
	 *
	 * @param CR_ID the primary key of the cartilla reclutamiento
	 * @return the cartilla reclutamiento
	 * @throws com.rec.hitss.layer.NoSuchcartillaReclutamientoException if a cartilla reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cartillaReclutamiento findByPrimaryKey(long CR_ID)
		throws NoSuchcartillaReclutamientoException, SystemException {
		return findByPrimaryKey((Serializable)CR_ID);
	}

	/**
	 * Returns the cartilla reclutamiento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cartilla reclutamiento
	 * @return the cartilla reclutamiento, or <code>null</code> if a cartilla reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cartillaReclutamiento fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		cartillaReclutamiento cartillaReclutamiento = (cartillaReclutamiento)EntityCacheUtil.getResult(cartillaReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
				cartillaReclutamientoImpl.class, primaryKey);

		if (cartillaReclutamiento == _nullcartillaReclutamiento) {
			return null;
		}

		if (cartillaReclutamiento == null) {
			Session session = null;

			try {
				session = openSession();

				cartillaReclutamiento = (cartillaReclutamiento)session.get(cartillaReclutamientoImpl.class,
						primaryKey);

				if (cartillaReclutamiento != null) {
					cacheResult(cartillaReclutamiento);
				}
				else {
					EntityCacheUtil.putResult(cartillaReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
						cartillaReclutamientoImpl.class, primaryKey,
						_nullcartillaReclutamiento);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(cartillaReclutamientoModelImpl.ENTITY_CACHE_ENABLED,
					cartillaReclutamientoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cartillaReclutamiento;
	}

	/**
	 * Returns the cartilla reclutamiento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CR_ID the primary key of the cartilla reclutamiento
	 * @return the cartilla reclutamiento, or <code>null</code> if a cartilla reclutamiento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cartillaReclutamiento fetchByPrimaryKey(long CR_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)CR_ID);
	}

	/**
	 * Returns all the cartilla reclutamientos.
	 *
	 * @return the cartilla reclutamientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<cartillaReclutamiento> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cartilla reclutamientos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.cartillaReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cartilla reclutamientos
	 * @param end the upper bound of the range of cartilla reclutamientos (not inclusive)
	 * @return the range of cartilla reclutamientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<cartillaReclutamiento> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cartilla reclutamientos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.cartillaReclutamientoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cartilla reclutamientos
	 * @param end the upper bound of the range of cartilla reclutamientos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cartilla reclutamientos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<cartillaReclutamiento> findAll(int start, int end,
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

		List<cartillaReclutamiento> list = (List<cartillaReclutamiento>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CARTILLARECLUTAMIENTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CARTILLARECLUTAMIENTO;

				if (pagination) {
					sql = sql.concat(cartillaReclutamientoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<cartillaReclutamiento>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<cartillaReclutamiento>(list);
				}
				else {
					list = (List<cartillaReclutamiento>)QueryUtil.list(q,
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
	 * Removes all the cartilla reclutamientos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (cartillaReclutamiento cartillaReclutamiento : findAll()) {
			remove(cartillaReclutamiento);
		}
	}

	/**
	 * Returns the number of cartilla reclutamientos.
	 *
	 * @return the number of cartilla reclutamientos
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

				Query q = session.createQuery(_SQL_COUNT_CARTILLARECLUTAMIENTO);

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
	 * Initializes the cartilla reclutamiento persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.cartillaReclutamiento")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<cartillaReclutamiento>> listenersList = new ArrayList<ModelListener<cartillaReclutamiento>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<cartillaReclutamiento>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(cartillaReclutamientoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CARTILLARECLUTAMIENTO = "SELECT cartillaReclutamiento FROM cartillaReclutamiento cartillaReclutamiento";
	private static final String _SQL_COUNT_CARTILLARECLUTAMIENTO = "SELECT COUNT(cartillaReclutamiento) FROM cartillaReclutamiento cartillaReclutamiento";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cartillaReclutamiento.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No cartillaReclutamiento exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(cartillaReclutamientoPersistenceImpl.class);
	private static cartillaReclutamiento _nullcartillaReclutamiento = new cartillaReclutamientoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<cartillaReclutamiento> toCacheModel() {
				return _nullcartillaReclutamientoCacheModel;
			}
		};

	private static CacheModel<cartillaReclutamiento> _nullcartillaReclutamientoCacheModel =
		new CacheModel<cartillaReclutamiento>() {
			@Override
			public cartillaReclutamiento toEntityModel() {
				return _nullcartillaReclutamiento;
			}
		};
}
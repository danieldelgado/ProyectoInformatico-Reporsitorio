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

import com.rec.hitss.layer.NoSuchPrioridadEquiposException;
import com.rec.hitss.layer.model.PrioridadEquipos;
import com.rec.hitss.layer.model.impl.PrioridadEquiposImpl;
import com.rec.hitss.layer.model.impl.PrioridadEquiposModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the prioridad equipos service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see PrioridadEquiposPersistence
 * @see PrioridadEquiposUtil
 * @generated
 */
public class PrioridadEquiposPersistenceImpl extends BasePersistenceImpl<PrioridadEquipos>
	implements PrioridadEquiposPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PrioridadEquiposUtil} to access the prioridad equipos persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PrioridadEquiposImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PrioridadEquiposModelImpl.ENTITY_CACHE_ENABLED,
			PrioridadEquiposModelImpl.FINDER_CACHE_ENABLED,
			PrioridadEquiposImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PrioridadEquiposModelImpl.ENTITY_CACHE_ENABLED,
			PrioridadEquiposModelImpl.FINDER_CACHE_ENABLED,
			PrioridadEquiposImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PrioridadEquiposModelImpl.ENTITY_CACHE_ENABLED,
			PrioridadEquiposModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PrioridadEquiposPersistenceImpl() {
		setModelClass(PrioridadEquipos.class);
	}

	/**
	 * Caches the prioridad equipos in the entity cache if it is enabled.
	 *
	 * @param prioridadEquipos the prioridad equipos
	 */
	@Override
	public void cacheResult(PrioridadEquipos prioridadEquipos) {
		EntityCacheUtil.putResult(PrioridadEquiposModelImpl.ENTITY_CACHE_ENABLED,
			PrioridadEquiposImpl.class, prioridadEquipos.getPrimaryKey(),
			prioridadEquipos);

		prioridadEquipos.resetOriginalValues();
	}

	/**
	 * Caches the prioridad equiposes in the entity cache if it is enabled.
	 *
	 * @param prioridadEquiposes the prioridad equiposes
	 */
	@Override
	public void cacheResult(List<PrioridadEquipos> prioridadEquiposes) {
		for (PrioridadEquipos prioridadEquipos : prioridadEquiposes) {
			if (EntityCacheUtil.getResult(
						PrioridadEquiposModelImpl.ENTITY_CACHE_ENABLED,
						PrioridadEquiposImpl.class,
						prioridadEquipos.getPrimaryKey()) == null) {
				cacheResult(prioridadEquipos);
			}
			else {
				prioridadEquipos.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all prioridad equiposes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PrioridadEquiposImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PrioridadEquiposImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the prioridad equipos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PrioridadEquipos prioridadEquipos) {
		EntityCacheUtil.removeResult(PrioridadEquiposModelImpl.ENTITY_CACHE_ENABLED,
			PrioridadEquiposImpl.class, prioridadEquipos.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PrioridadEquipos> prioridadEquiposes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PrioridadEquipos prioridadEquipos : prioridadEquiposes) {
			EntityCacheUtil.removeResult(PrioridadEquiposModelImpl.ENTITY_CACHE_ENABLED,
				PrioridadEquiposImpl.class, prioridadEquipos.getPrimaryKey());
		}
	}

	/**
	 * Creates a new prioridad equipos with the primary key. Does not add the prioridad equipos to the database.
	 *
	 * @param prioridadEquiposId the primary key for the new prioridad equipos
	 * @return the new prioridad equipos
	 */
	@Override
	public PrioridadEquipos create(long prioridadEquiposId) {
		PrioridadEquipos prioridadEquipos = new PrioridadEquiposImpl();

		prioridadEquipos.setNew(true);
		prioridadEquipos.setPrimaryKey(prioridadEquiposId);

		return prioridadEquipos;
	}

	/**
	 * Removes the prioridad equipos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param prioridadEquiposId the primary key of the prioridad equipos
	 * @return the prioridad equipos that was removed
	 * @throws com.rec.hitss.layer.NoSuchPrioridadEquiposException if a prioridad equipos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadEquipos remove(long prioridadEquiposId)
		throws NoSuchPrioridadEquiposException, SystemException {
		return remove((Serializable)prioridadEquiposId);
	}

	/**
	 * Removes the prioridad equipos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the prioridad equipos
	 * @return the prioridad equipos that was removed
	 * @throws com.rec.hitss.layer.NoSuchPrioridadEquiposException if a prioridad equipos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadEquipos remove(Serializable primaryKey)
		throws NoSuchPrioridadEquiposException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PrioridadEquipos prioridadEquipos = (PrioridadEquipos)session.get(PrioridadEquiposImpl.class,
					primaryKey);

			if (prioridadEquipos == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPrioridadEquiposException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(prioridadEquipos);
		}
		catch (NoSuchPrioridadEquiposException nsee) {
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
	protected PrioridadEquipos removeImpl(PrioridadEquipos prioridadEquipos)
		throws SystemException {
		prioridadEquipos = toUnwrappedModel(prioridadEquipos);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(prioridadEquipos)) {
				prioridadEquipos = (PrioridadEquipos)session.get(PrioridadEquiposImpl.class,
						prioridadEquipos.getPrimaryKeyObj());
			}

			if (prioridadEquipos != null) {
				session.delete(prioridadEquipos);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (prioridadEquipos != null) {
			clearCache(prioridadEquipos);
		}

		return prioridadEquipos;
	}

	@Override
	public PrioridadEquipos updateImpl(
		com.rec.hitss.layer.model.PrioridadEquipos prioridadEquipos)
		throws SystemException {
		prioridadEquipos = toUnwrappedModel(prioridadEquipos);

		boolean isNew = prioridadEquipos.isNew();

		Session session = null;

		try {
			session = openSession();

			if (prioridadEquipos.isNew()) {
				session.save(prioridadEquipos);

				prioridadEquipos.setNew(false);
			}
			else {
				session.merge(prioridadEquipos);
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

		EntityCacheUtil.putResult(PrioridadEquiposModelImpl.ENTITY_CACHE_ENABLED,
			PrioridadEquiposImpl.class, prioridadEquipos.getPrimaryKey(),
			prioridadEquipos);

		return prioridadEquipos;
	}

	protected PrioridadEquipos toUnwrappedModel(
		PrioridadEquipos prioridadEquipos) {
		if (prioridadEquipos instanceof PrioridadEquiposImpl) {
			return prioridadEquipos;
		}

		PrioridadEquiposImpl prioridadEquiposImpl = new PrioridadEquiposImpl();

		prioridadEquiposImpl.setNew(prioridadEquipos.isNew());
		prioridadEquiposImpl.setPrimaryKey(prioridadEquipos.getPrimaryKey());

		prioridadEquiposImpl.setPrioridadEquiposId(prioridadEquipos.getPrioridadEquiposId());
		prioridadEquiposImpl.setSolicitudEvaluacionDesempenoId(prioridadEquipos.getSolicitudEvaluacionDesempenoId());
		prioridadEquiposImpl.setResponsable(prioridadEquipos.getResponsable());
		prioridadEquiposImpl.setActivo(prioridadEquipos.isActivo());
		prioridadEquiposImpl.setUsuariocrea(prioridadEquipos.getUsuariocrea());
		prioridadEquiposImpl.setFechacrea(prioridadEquipos.getFechacrea());
		prioridadEquiposImpl.setUsuariomodifica(prioridadEquipos.getUsuariomodifica());
		prioridadEquiposImpl.setFechacreamodifica(prioridadEquipos.getFechacreamodifica());

		return prioridadEquiposImpl;
	}

	/**
	 * Returns the prioridad equipos with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the prioridad equipos
	 * @return the prioridad equipos
	 * @throws com.rec.hitss.layer.NoSuchPrioridadEquiposException if a prioridad equipos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadEquipos findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPrioridadEquiposException, SystemException {
		PrioridadEquipos prioridadEquipos = fetchByPrimaryKey(primaryKey);

		if (prioridadEquipos == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPrioridadEquiposException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return prioridadEquipos;
	}

	/**
	 * Returns the prioridad equipos with the primary key or throws a {@link com.rec.hitss.layer.NoSuchPrioridadEquiposException} if it could not be found.
	 *
	 * @param prioridadEquiposId the primary key of the prioridad equipos
	 * @return the prioridad equipos
	 * @throws com.rec.hitss.layer.NoSuchPrioridadEquiposException if a prioridad equipos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadEquipos findByPrimaryKey(long prioridadEquiposId)
		throws NoSuchPrioridadEquiposException, SystemException {
		return findByPrimaryKey((Serializable)prioridadEquiposId);
	}

	/**
	 * Returns the prioridad equipos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the prioridad equipos
	 * @return the prioridad equipos, or <code>null</code> if a prioridad equipos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadEquipos fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PrioridadEquipos prioridadEquipos = (PrioridadEquipos)EntityCacheUtil.getResult(PrioridadEquiposModelImpl.ENTITY_CACHE_ENABLED,
				PrioridadEquiposImpl.class, primaryKey);

		if (prioridadEquipos == _nullPrioridadEquipos) {
			return null;
		}

		if (prioridadEquipos == null) {
			Session session = null;

			try {
				session = openSession();

				prioridadEquipos = (PrioridadEquipos)session.get(PrioridadEquiposImpl.class,
						primaryKey);

				if (prioridadEquipos != null) {
					cacheResult(prioridadEquipos);
				}
				else {
					EntityCacheUtil.putResult(PrioridadEquiposModelImpl.ENTITY_CACHE_ENABLED,
						PrioridadEquiposImpl.class, primaryKey,
						_nullPrioridadEquipos);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PrioridadEquiposModelImpl.ENTITY_CACHE_ENABLED,
					PrioridadEquiposImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return prioridadEquipos;
	}

	/**
	 * Returns the prioridad equipos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param prioridadEquiposId the primary key of the prioridad equipos
	 * @return the prioridad equipos, or <code>null</code> if a prioridad equipos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrioridadEquipos fetchByPrimaryKey(long prioridadEquiposId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)prioridadEquiposId);
	}

	/**
	 * Returns all the prioridad equiposes.
	 *
	 * @return the prioridad equiposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PrioridadEquipos> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the prioridad equiposes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PrioridadEquiposModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prioridad equiposes
	 * @param end the upper bound of the range of prioridad equiposes (not inclusive)
	 * @return the range of prioridad equiposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PrioridadEquipos> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the prioridad equiposes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.PrioridadEquiposModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prioridad equiposes
	 * @param end the upper bound of the range of prioridad equiposes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of prioridad equiposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PrioridadEquipos> findAll(int start, int end,
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

		List<PrioridadEquipos> list = (List<PrioridadEquipos>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PRIORIDADEQUIPOS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRIORIDADEQUIPOS;

				if (pagination) {
					sql = sql.concat(PrioridadEquiposModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PrioridadEquipos>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PrioridadEquipos>(list);
				}
				else {
					list = (List<PrioridadEquipos>)QueryUtil.list(q,
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
	 * Removes all the prioridad equiposes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PrioridadEquipos prioridadEquipos : findAll()) {
			remove(prioridadEquipos);
		}
	}

	/**
	 * Returns the number of prioridad equiposes.
	 *
	 * @return the number of prioridad equiposes
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

				Query q = session.createQuery(_SQL_COUNT_PRIORIDADEQUIPOS);

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
	 * Initializes the prioridad equipos persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.PrioridadEquipos")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PrioridadEquipos>> listenersList = new ArrayList<ModelListener<PrioridadEquipos>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PrioridadEquipos>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PrioridadEquiposImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PRIORIDADEQUIPOS = "SELECT prioridadEquipos FROM PrioridadEquipos prioridadEquipos";
	private static final String _SQL_COUNT_PRIORIDADEQUIPOS = "SELECT COUNT(prioridadEquipos) FROM PrioridadEquipos prioridadEquipos";
	private static final String _ORDER_BY_ENTITY_ALIAS = "prioridadEquipos.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PrioridadEquipos exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PrioridadEquiposPersistenceImpl.class);
	private static PrioridadEquipos _nullPrioridadEquipos = new PrioridadEquiposImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PrioridadEquipos> toCacheModel() {
				return _nullPrioridadEquiposCacheModel;
			}
		};

	private static CacheModel<PrioridadEquipos> _nullPrioridadEquiposCacheModel = new CacheModel<PrioridadEquipos>() {
			@Override
			public PrioridadEquipos toEntityModel() {
				return _nullPrioridadEquipos;
			}
		};
}
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

import com.hitss.layer.NoSuchPlanAccionException;
import com.hitss.layer.model.PlanAccion;
import com.hitss.layer.model.impl.PlanAccionImpl;
import com.hitss.layer.model.impl.PlanAccionModelImpl;

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
 * The persistence implementation for the plan accion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PlanAccionPersistence
 * @see PlanAccionUtil
 * @generated
 */
public class PlanAccionPersistenceImpl extends BasePersistenceImpl<PlanAccion>
	implements PlanAccionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PlanAccionUtil} to access the plan accion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PlanAccionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PlanAccionModelImpl.ENTITY_CACHE_ENABLED,
			PlanAccionModelImpl.FINDER_CACHE_ENABLED, PlanAccionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PlanAccionModelImpl.ENTITY_CACHE_ENABLED,
			PlanAccionModelImpl.FINDER_CACHE_ENABLED, PlanAccionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PlanAccionModelImpl.ENTITY_CACHE_ENABLED,
			PlanAccionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PlanAccionPersistenceImpl() {
		setModelClass(PlanAccion.class);
	}

	/**
	 * Caches the plan accion in the entity cache if it is enabled.
	 *
	 * @param planAccion the plan accion
	 */
	@Override
	public void cacheResult(PlanAccion planAccion) {
		EntityCacheUtil.putResult(PlanAccionModelImpl.ENTITY_CACHE_ENABLED,
			PlanAccionImpl.class, planAccion.getPrimaryKey(), planAccion);

		planAccion.resetOriginalValues();
	}

	/**
	 * Caches the plan accions in the entity cache if it is enabled.
	 *
	 * @param planAccions the plan accions
	 */
	@Override
	public void cacheResult(List<PlanAccion> planAccions) {
		for (PlanAccion planAccion : planAccions) {
			if (EntityCacheUtil.getResult(
						PlanAccionModelImpl.ENTITY_CACHE_ENABLED,
						PlanAccionImpl.class, planAccion.getPrimaryKey()) == null) {
				cacheResult(planAccion);
			}
			else {
				planAccion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all plan accions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PlanAccionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PlanAccionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the plan accion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PlanAccion planAccion) {
		EntityCacheUtil.removeResult(PlanAccionModelImpl.ENTITY_CACHE_ENABLED,
			PlanAccionImpl.class, planAccion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PlanAccion> planAccions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PlanAccion planAccion : planAccions) {
			EntityCacheUtil.removeResult(PlanAccionModelImpl.ENTITY_CACHE_ENABLED,
				PlanAccionImpl.class, planAccion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new plan accion with the primary key. Does not add the plan accion to the database.
	 *
	 * @param planAccionId the primary key for the new plan accion
	 * @return the new plan accion
	 */
	@Override
	public PlanAccion create(long planAccionId) {
		PlanAccion planAccion = new PlanAccionImpl();

		planAccion.setNew(true);
		planAccion.setPrimaryKey(planAccionId);

		return planAccion;
	}

	/**
	 * Removes the plan accion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param planAccionId the primary key of the plan accion
	 * @return the plan accion that was removed
	 * @throws com.hitss.layer.NoSuchPlanAccionException if a plan accion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlanAccion remove(long planAccionId)
		throws NoSuchPlanAccionException, SystemException {
		return remove((Serializable)planAccionId);
	}

	/**
	 * Removes the plan accion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the plan accion
	 * @return the plan accion that was removed
	 * @throws com.hitss.layer.NoSuchPlanAccionException if a plan accion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlanAccion remove(Serializable primaryKey)
		throws NoSuchPlanAccionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PlanAccion planAccion = (PlanAccion)session.get(PlanAccionImpl.class,
					primaryKey);

			if (planAccion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPlanAccionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(planAccion);
		}
		catch (NoSuchPlanAccionException nsee) {
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
	protected PlanAccion removeImpl(PlanAccion planAccion)
		throws SystemException {
		planAccion = toUnwrappedModel(planAccion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(planAccion)) {
				planAccion = (PlanAccion)session.get(PlanAccionImpl.class,
						planAccion.getPrimaryKeyObj());
			}

			if (planAccion != null) {
				session.delete(planAccion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (planAccion != null) {
			clearCache(planAccion);
		}

		return planAccion;
	}

	@Override
	public PlanAccion updateImpl(com.hitss.layer.model.PlanAccion planAccion)
		throws SystemException {
		planAccion = toUnwrappedModel(planAccion);

		boolean isNew = planAccion.isNew();

		Session session = null;

		try {
			session = openSession();

			if (planAccion.isNew()) {
				session.save(planAccion);

				planAccion.setNew(false);
			}
			else {
				session.merge(planAccion);
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

		EntityCacheUtil.putResult(PlanAccionModelImpl.ENTITY_CACHE_ENABLED,
			PlanAccionImpl.class, planAccion.getPrimaryKey(), planAccion);

		return planAccion;
	}

	protected PlanAccion toUnwrappedModel(PlanAccion planAccion) {
		if (planAccion instanceof PlanAccionImpl) {
			return planAccion;
		}

		PlanAccionImpl planAccionImpl = new PlanAccionImpl();

		planAccionImpl.setNew(planAccion.isNew());
		planAccionImpl.setPrimaryKey(planAccion.getPrimaryKey());

		planAccionImpl.setPlanAccionId(planAccion.getPlanAccionId());
		planAccionImpl.setCronogramaId(planAccion.getCronogramaId());
		planAccionImpl.setResponsable(planAccion.getResponsable());
		planAccionImpl.setFechaProgramada(planAccion.getFechaProgramada());
		planAccionImpl.setAprobadorColaborador(planAccion.isAprobadorColaborador());
		planAccionImpl.setAprobadorLider(planAccion.isAprobadorLider());
		planAccionImpl.setJerarquiaEvaluar(planAccion.getJerarquiaEvaluar());
		planAccionImpl.setActivo(planAccion.isActivo());
		planAccionImpl.setUsuariocrea(planAccion.getUsuariocrea());
		planAccionImpl.setFechacrea(planAccion.getFechacrea());
		planAccionImpl.setUsuariomodifica(planAccion.getUsuariomodifica());
		planAccionImpl.setFechamodifica(planAccion.getFechamodifica());

		return planAccionImpl;
	}

	/**
	 * Returns the plan accion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the plan accion
	 * @return the plan accion
	 * @throws com.hitss.layer.NoSuchPlanAccionException if a plan accion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlanAccion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPlanAccionException, SystemException {
		PlanAccion planAccion = fetchByPrimaryKey(primaryKey);

		if (planAccion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPlanAccionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return planAccion;
	}

	/**
	 * Returns the plan accion with the primary key or throws a {@link com.hitss.layer.NoSuchPlanAccionException} if it could not be found.
	 *
	 * @param planAccionId the primary key of the plan accion
	 * @return the plan accion
	 * @throws com.hitss.layer.NoSuchPlanAccionException if a plan accion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlanAccion findByPrimaryKey(long planAccionId)
		throws NoSuchPlanAccionException, SystemException {
		return findByPrimaryKey((Serializable)planAccionId);
	}

	/**
	 * Returns the plan accion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the plan accion
	 * @return the plan accion, or <code>null</code> if a plan accion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlanAccion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PlanAccion planAccion = (PlanAccion)EntityCacheUtil.getResult(PlanAccionModelImpl.ENTITY_CACHE_ENABLED,
				PlanAccionImpl.class, primaryKey);

		if (planAccion == _nullPlanAccion) {
			return null;
		}

		if (planAccion == null) {
			Session session = null;

			try {
				session = openSession();

				planAccion = (PlanAccion)session.get(PlanAccionImpl.class,
						primaryKey);

				if (planAccion != null) {
					cacheResult(planAccion);
				}
				else {
					EntityCacheUtil.putResult(PlanAccionModelImpl.ENTITY_CACHE_ENABLED,
						PlanAccionImpl.class, primaryKey, _nullPlanAccion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PlanAccionModelImpl.ENTITY_CACHE_ENABLED,
					PlanAccionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return planAccion;
	}

	/**
	 * Returns the plan accion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param planAccionId the primary key of the plan accion
	 * @return the plan accion, or <code>null</code> if a plan accion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlanAccion fetchByPrimaryKey(long planAccionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)planAccionId);
	}

	/**
	 * Returns all the plan accions.
	 *
	 * @return the plan accions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PlanAccion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the plan accions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PlanAccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of plan accions
	 * @param end the upper bound of the range of plan accions (not inclusive)
	 * @return the range of plan accions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PlanAccion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the plan accions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PlanAccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of plan accions
	 * @param end the upper bound of the range of plan accions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of plan accions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PlanAccion> findAll(int start, int end,
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

		List<PlanAccion> list = (List<PlanAccion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PLANACCION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PLANACCION;

				if (pagination) {
					sql = sql.concat(PlanAccionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PlanAccion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PlanAccion>(list);
				}
				else {
					list = (List<PlanAccion>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the plan accions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PlanAccion planAccion : findAll()) {
			remove(planAccion);
		}
	}

	/**
	 * Returns the number of plan accions.
	 *
	 * @return the number of plan accions
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

				Query q = session.createQuery(_SQL_COUNT_PLANACCION);

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
	 * Initializes the plan accion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.PlanAccion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PlanAccion>> listenersList = new ArrayList<ModelListener<PlanAccion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PlanAccion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PlanAccionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PLANACCION = "SELECT planAccion FROM PlanAccion planAccion";
	private static final String _SQL_COUNT_PLANACCION = "SELECT COUNT(planAccion) FROM PlanAccion planAccion";
	private static final String _ORDER_BY_ENTITY_ALIAS = "planAccion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PlanAccion exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PlanAccionPersistenceImpl.class);
	private static PlanAccion _nullPlanAccion = new PlanAccionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PlanAccion> toCacheModel() {
				return _nullPlanAccionCacheModel;
			}
		};

	private static CacheModel<PlanAccion> _nullPlanAccionCacheModel = new CacheModel<PlanAccion>() {
			@Override
			public PlanAccion toEntityModel() {
				return _nullPlanAccion;
			}
		};
}
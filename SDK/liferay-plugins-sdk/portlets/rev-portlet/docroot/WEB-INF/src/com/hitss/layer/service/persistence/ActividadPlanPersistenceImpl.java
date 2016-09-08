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

import com.hitss.layer.NoSuchActividadPlanException;
import com.hitss.layer.model.ActividadPlan;
import com.hitss.layer.model.impl.ActividadPlanImpl;
import com.hitss.layer.model.impl.ActividadPlanModelImpl;

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
 * The persistence implementation for the actividad plan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see ActividadPlanPersistence
 * @see ActividadPlanUtil
 * @generated
 */
public class ActividadPlanPersistenceImpl extends BasePersistenceImpl<ActividadPlan>
	implements ActividadPlanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ActividadPlanUtil} to access the actividad plan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ActividadPlanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ActividadPlanModelImpl.ENTITY_CACHE_ENABLED,
			ActividadPlanModelImpl.FINDER_CACHE_ENABLED,
			ActividadPlanImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ActividadPlanModelImpl.ENTITY_CACHE_ENABLED,
			ActividadPlanModelImpl.FINDER_CACHE_ENABLED,
			ActividadPlanImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ActividadPlanModelImpl.ENTITY_CACHE_ENABLED,
			ActividadPlanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ActividadPlanPersistenceImpl() {
		setModelClass(ActividadPlan.class);
	}

	/**
	 * Caches the actividad plan in the entity cache if it is enabled.
	 *
	 * @param actividadPlan the actividad plan
	 */
	@Override
	public void cacheResult(ActividadPlan actividadPlan) {
		EntityCacheUtil.putResult(ActividadPlanModelImpl.ENTITY_CACHE_ENABLED,
			ActividadPlanImpl.class, actividadPlan.getPrimaryKey(),
			actividadPlan);

		actividadPlan.resetOriginalValues();
	}

	/**
	 * Caches the actividad plans in the entity cache if it is enabled.
	 *
	 * @param actividadPlans the actividad plans
	 */
	@Override
	public void cacheResult(List<ActividadPlan> actividadPlans) {
		for (ActividadPlan actividadPlan : actividadPlans) {
			if (EntityCacheUtil.getResult(
						ActividadPlanModelImpl.ENTITY_CACHE_ENABLED,
						ActividadPlanImpl.class, actividadPlan.getPrimaryKey()) == null) {
				cacheResult(actividadPlan);
			}
			else {
				actividadPlan.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all actividad plans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ActividadPlanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ActividadPlanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the actividad plan.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ActividadPlan actividadPlan) {
		EntityCacheUtil.removeResult(ActividadPlanModelImpl.ENTITY_CACHE_ENABLED,
			ActividadPlanImpl.class, actividadPlan.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ActividadPlan> actividadPlans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ActividadPlan actividadPlan : actividadPlans) {
			EntityCacheUtil.removeResult(ActividadPlanModelImpl.ENTITY_CACHE_ENABLED,
				ActividadPlanImpl.class, actividadPlan.getPrimaryKey());
		}
	}

	/**
	 * Creates a new actividad plan with the primary key. Does not add the actividad plan to the database.
	 *
	 * @param actividadPlanPK the primary key for the new actividad plan
	 * @return the new actividad plan
	 */
	@Override
	public ActividadPlan create(ActividadPlanPK actividadPlanPK) {
		ActividadPlan actividadPlan = new ActividadPlanImpl();

		actividadPlan.setNew(true);
		actividadPlan.setPrimaryKey(actividadPlanPK);

		return actividadPlan;
	}

	/**
	 * Removes the actividad plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param actividadPlanPK the primary key of the actividad plan
	 * @return the actividad plan that was removed
	 * @throws com.hitss.layer.NoSuchActividadPlanException if a actividad plan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadPlan remove(ActividadPlanPK actividadPlanPK)
		throws NoSuchActividadPlanException, SystemException {
		return remove((Serializable)actividadPlanPK);
	}

	/**
	 * Removes the actividad plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the actividad plan
	 * @return the actividad plan that was removed
	 * @throws com.hitss.layer.NoSuchActividadPlanException if a actividad plan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadPlan remove(Serializable primaryKey)
		throws NoSuchActividadPlanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ActividadPlan actividadPlan = (ActividadPlan)session.get(ActividadPlanImpl.class,
					primaryKey);

			if (actividadPlan == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchActividadPlanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(actividadPlan);
		}
		catch (NoSuchActividadPlanException nsee) {
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
	protected ActividadPlan removeImpl(ActividadPlan actividadPlan)
		throws SystemException {
		actividadPlan = toUnwrappedModel(actividadPlan);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(actividadPlan)) {
				actividadPlan = (ActividadPlan)session.get(ActividadPlanImpl.class,
						actividadPlan.getPrimaryKeyObj());
			}

			if (actividadPlan != null) {
				session.delete(actividadPlan);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (actividadPlan != null) {
			clearCache(actividadPlan);
		}

		return actividadPlan;
	}

	@Override
	public ActividadPlan updateImpl(
		com.hitss.layer.model.ActividadPlan actividadPlan)
		throws SystemException {
		actividadPlan = toUnwrappedModel(actividadPlan);

		boolean isNew = actividadPlan.isNew();

		Session session = null;

		try {
			session = openSession();

			if (actividadPlan.isNew()) {
				session.save(actividadPlan);

				actividadPlan.setNew(false);
			}
			else {
				session.merge(actividadPlan);
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

		EntityCacheUtil.putResult(ActividadPlanModelImpl.ENTITY_CACHE_ENABLED,
			ActividadPlanImpl.class, actividadPlan.getPrimaryKey(),
			actividadPlan);

		return actividadPlan;
	}

	protected ActividadPlan toUnwrappedModel(ActividadPlan actividadPlan) {
		if (actividadPlan instanceof ActividadPlanImpl) {
			return actividadPlan;
		}

		ActividadPlanImpl actividadPlanImpl = new ActividadPlanImpl();

		actividadPlanImpl.setNew(actividadPlan.isNew());
		actividadPlanImpl.setPrimaryKey(actividadPlan.getPrimaryKey());

		actividadPlanImpl.setActividadPlanId(actividadPlan.getActividadPlanId());
		actividadPlanImpl.setActividadCronogramaId(actividadPlan.getActividadCronogramaId());
		actividadPlanImpl.setPlanAccionId(actividadPlan.getPlanAccionId());
		actividadPlanImpl.setActividad(actividadPlan.getActividad());
		actividadPlanImpl.setEvidencia(actividadPlan.getEvidencia());
		actividadPlanImpl.setActivo(actividadPlan.isActivo());
		actividadPlanImpl.setUsuariocrea(actividadPlan.getUsuariocrea());
		actividadPlanImpl.setFechacrea(actividadPlan.getFechacrea());
		actividadPlanImpl.setUsuariomodifica(actividadPlan.getUsuariomodifica());
		actividadPlanImpl.setFechamodifica(actividadPlan.getFechamodifica());

		return actividadPlanImpl;
	}

	/**
	 * Returns the actividad plan with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the actividad plan
	 * @return the actividad plan
	 * @throws com.hitss.layer.NoSuchActividadPlanException if a actividad plan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadPlan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchActividadPlanException, SystemException {
		ActividadPlan actividadPlan = fetchByPrimaryKey(primaryKey);

		if (actividadPlan == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchActividadPlanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return actividadPlan;
	}

	/**
	 * Returns the actividad plan with the primary key or throws a {@link com.hitss.layer.NoSuchActividadPlanException} if it could not be found.
	 *
	 * @param actividadPlanPK the primary key of the actividad plan
	 * @return the actividad plan
	 * @throws com.hitss.layer.NoSuchActividadPlanException if a actividad plan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadPlan findByPrimaryKey(ActividadPlanPK actividadPlanPK)
		throws NoSuchActividadPlanException, SystemException {
		return findByPrimaryKey((Serializable)actividadPlanPK);
	}

	/**
	 * Returns the actividad plan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the actividad plan
	 * @return the actividad plan, or <code>null</code> if a actividad plan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadPlan fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ActividadPlan actividadPlan = (ActividadPlan)EntityCacheUtil.getResult(ActividadPlanModelImpl.ENTITY_CACHE_ENABLED,
				ActividadPlanImpl.class, primaryKey);

		if (actividadPlan == _nullActividadPlan) {
			return null;
		}

		if (actividadPlan == null) {
			Session session = null;

			try {
				session = openSession();

				actividadPlan = (ActividadPlan)session.get(ActividadPlanImpl.class,
						primaryKey);

				if (actividadPlan != null) {
					cacheResult(actividadPlan);
				}
				else {
					EntityCacheUtil.putResult(ActividadPlanModelImpl.ENTITY_CACHE_ENABLED,
						ActividadPlanImpl.class, primaryKey, _nullActividadPlan);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ActividadPlanModelImpl.ENTITY_CACHE_ENABLED,
					ActividadPlanImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return actividadPlan;
	}

	/**
	 * Returns the actividad plan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param actividadPlanPK the primary key of the actividad plan
	 * @return the actividad plan, or <code>null</code> if a actividad plan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActividadPlan fetchByPrimaryKey(ActividadPlanPK actividadPlanPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)actividadPlanPK);
	}

	/**
	 * Returns all the actividad plans.
	 *
	 * @return the actividad plans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActividadPlan> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the actividad plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of actividad plans
	 * @param end the upper bound of the range of actividad plans (not inclusive)
	 * @return the range of actividad plans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActividadPlan> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the actividad plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ActividadPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of actividad plans
	 * @param end the upper bound of the range of actividad plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of actividad plans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActividadPlan> findAll(int start, int end,
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

		List<ActividadPlan> list = (List<ActividadPlan>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACTIVIDADPLAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACTIVIDADPLAN;

				if (pagination) {
					sql = sql.concat(ActividadPlanModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ActividadPlan>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActividadPlan>(list);
				}
				else {
					list = (List<ActividadPlan>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the actividad plans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ActividadPlan actividadPlan : findAll()) {
			remove(actividadPlan);
		}
	}

	/**
	 * Returns the number of actividad plans.
	 *
	 * @return the number of actividad plans
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

				Query q = session.createQuery(_SQL_COUNT_ACTIVIDADPLAN);

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
	 * Initializes the actividad plan persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.ActividadPlan")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ActividadPlan>> listenersList = new ArrayList<ModelListener<ActividadPlan>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ActividadPlan>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ActividadPlanImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ACTIVIDADPLAN = "SELECT actividadPlan FROM ActividadPlan actividadPlan";
	private static final String _SQL_COUNT_ACTIVIDADPLAN = "SELECT COUNT(actividadPlan) FROM ActividadPlan actividadPlan";
	private static final String _ORDER_BY_ENTITY_ALIAS = "actividadPlan.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ActividadPlan exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ActividadPlanPersistenceImpl.class);
	private static ActividadPlan _nullActividadPlan = new ActividadPlanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ActividadPlan> toCacheModel() {
				return _nullActividadPlanCacheModel;
			}
		};

	private static CacheModel<ActividadPlan> _nullActividadPlanCacheModel = new CacheModel<ActividadPlan>() {
			@Override
			public ActividadPlan toEntityModel() {
				return _nullActividadPlan;
			}
		};
}
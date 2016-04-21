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

import com.rec.hitss.layer.NoSuchActividadesException;
import com.rec.hitss.layer.model.Actividades;
import com.rec.hitss.layer.model.impl.ActividadesImpl;
import com.rec.hitss.layer.model.impl.ActividadesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the actividades service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see ActividadesPersistence
 * @see ActividadesUtil
 * @generated
 */
public class ActividadesPersistenceImpl extends BasePersistenceImpl<Actividades>
	implements ActividadesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ActividadesUtil} to access the actividades persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ActividadesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ActividadesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesModelImpl.FINDER_CACHE_ENABLED, ActividadesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ActividadesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesModelImpl.FINDER_CACHE_ENABLED, ActividadesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ActividadesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ActividadesPersistenceImpl() {
		setModelClass(Actividades.class);
	}

	/**
	 * Caches the actividades in the entity cache if it is enabled.
	 *
	 * @param actividades the actividades
	 */
	@Override
	public void cacheResult(Actividades actividades) {
		EntityCacheUtil.putResult(ActividadesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesImpl.class, actividades.getPrimaryKey(), actividades);

		actividades.resetOriginalValues();
	}

	/**
	 * Caches the actividadeses in the entity cache if it is enabled.
	 *
	 * @param actividadeses the actividadeses
	 */
	@Override
	public void cacheResult(List<Actividades> actividadeses) {
		for (Actividades actividades : actividadeses) {
			if (EntityCacheUtil.getResult(
						ActividadesModelImpl.ENTITY_CACHE_ENABLED,
						ActividadesImpl.class, actividades.getPrimaryKey()) == null) {
				cacheResult(actividades);
			}
			else {
				actividades.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all actividadeses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ActividadesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ActividadesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the actividades.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Actividades actividades) {
		EntityCacheUtil.removeResult(ActividadesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesImpl.class, actividades.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Actividades> actividadeses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Actividades actividades : actividadeses) {
			EntityCacheUtil.removeResult(ActividadesModelImpl.ENTITY_CACHE_ENABLED,
				ActividadesImpl.class, actividades.getPrimaryKey());
		}
	}

	/**
	 * Creates a new actividades with the primary key. Does not add the actividades to the database.
	 *
	 * @param actividadesId the primary key for the new actividades
	 * @return the new actividades
	 */
	@Override
	public Actividades create(long actividadesId) {
		Actividades actividades = new ActividadesImpl();

		actividades.setNew(true);
		actividades.setPrimaryKey(actividadesId);

		return actividades;
	}

	/**
	 * Removes the actividades with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param actividadesId the primary key of the actividades
	 * @return the actividades that was removed
	 * @throws com.rec.hitss.layer.NoSuchActividadesException if a actividades with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Actividades remove(long actividadesId)
		throws NoSuchActividadesException, SystemException {
		return remove((Serializable)actividadesId);
	}

	/**
	 * Removes the actividades with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the actividades
	 * @return the actividades that was removed
	 * @throws com.rec.hitss.layer.NoSuchActividadesException if a actividades with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Actividades remove(Serializable primaryKey)
		throws NoSuchActividadesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Actividades actividades = (Actividades)session.get(ActividadesImpl.class,
					primaryKey);

			if (actividades == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchActividadesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(actividades);
		}
		catch (NoSuchActividadesException nsee) {
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
	protected Actividades removeImpl(Actividades actividades)
		throws SystemException {
		actividades = toUnwrappedModel(actividades);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(actividades)) {
				actividades = (Actividades)session.get(ActividadesImpl.class,
						actividades.getPrimaryKeyObj());
			}

			if (actividades != null) {
				session.delete(actividades);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (actividades != null) {
			clearCache(actividades);
		}

		return actividades;
	}

	@Override
	public Actividades updateImpl(
		com.rec.hitss.layer.model.Actividades actividades)
		throws SystemException {
		actividades = toUnwrappedModel(actividades);

		boolean isNew = actividades.isNew();

		Session session = null;

		try {
			session = openSession();

			if (actividades.isNew()) {
				session.save(actividades);

				actividades.setNew(false);
			}
			else {
				session.merge(actividades);
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

		EntityCacheUtil.putResult(ActividadesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesImpl.class, actividades.getPrimaryKey(), actividades);

		return actividades;
	}

	protected Actividades toUnwrappedModel(Actividades actividades) {
		if (actividades instanceof ActividadesImpl) {
			return actividades;
		}

		ActividadesImpl actividadesImpl = new ActividadesImpl();

		actividadesImpl.setNew(actividades.isNew());
		actividadesImpl.setPrimaryKey(actividades.getPrimaryKey());

		actividadesImpl.setActividadesId(actividades.getActividadesId());
		actividadesImpl.setCronogramaEvaluacionPersonalId(actividades.getCronogramaEvaluacionPersonalId());
		actividadesImpl.setFechacreamodifica(actividades.getFechacreamodifica());
		actividadesImpl.setFechaInicioEvaluacion(actividades.getFechaInicioEvaluacion());
		actividadesImpl.setFechaFinEvaluacion(actividades.getFechaFinEvaluacion());
		actividadesImpl.setDescripcion(actividades.getDescripcion());
		actividadesImpl.setActivo(actividades.isActivo());
		actividadesImpl.setUsuariocrea(actividades.getUsuariocrea());
		actividadesImpl.setFechacrea(actividades.getFechacrea());
		actividadesImpl.setUsuariomodifica(actividades.getUsuariomodifica());

		return actividadesImpl;
	}

	/**
	 * Returns the actividades with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the actividades
	 * @return the actividades
	 * @throws com.rec.hitss.layer.NoSuchActividadesException if a actividades with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Actividades findByPrimaryKey(Serializable primaryKey)
		throws NoSuchActividadesException, SystemException {
		Actividades actividades = fetchByPrimaryKey(primaryKey);

		if (actividades == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchActividadesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return actividades;
	}

	/**
	 * Returns the actividades with the primary key or throws a {@link com.rec.hitss.layer.NoSuchActividadesException} if it could not be found.
	 *
	 * @param actividadesId the primary key of the actividades
	 * @return the actividades
	 * @throws com.rec.hitss.layer.NoSuchActividadesException if a actividades with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Actividades findByPrimaryKey(long actividadesId)
		throws NoSuchActividadesException, SystemException {
		return findByPrimaryKey((Serializable)actividadesId);
	}

	/**
	 * Returns the actividades with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the actividades
	 * @return the actividades, or <code>null</code> if a actividades with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Actividades fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Actividades actividades = (Actividades)EntityCacheUtil.getResult(ActividadesModelImpl.ENTITY_CACHE_ENABLED,
				ActividadesImpl.class, primaryKey);

		if (actividades == _nullActividades) {
			return null;
		}

		if (actividades == null) {
			Session session = null;

			try {
				session = openSession();

				actividades = (Actividades)session.get(ActividadesImpl.class,
						primaryKey);

				if (actividades != null) {
					cacheResult(actividades);
				}
				else {
					EntityCacheUtil.putResult(ActividadesModelImpl.ENTITY_CACHE_ENABLED,
						ActividadesImpl.class, primaryKey, _nullActividades);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ActividadesModelImpl.ENTITY_CACHE_ENABLED,
					ActividadesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return actividades;
	}

	/**
	 * Returns the actividades with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param actividadesId the primary key of the actividades
	 * @return the actividades, or <code>null</code> if a actividades with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Actividades fetchByPrimaryKey(long actividadesId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)actividadesId);
	}

	/**
	 * Returns all the actividadeses.
	 *
	 * @return the actividadeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Actividades> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the actividadeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ActividadesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of actividadeses
	 * @param end the upper bound of the range of actividadeses (not inclusive)
	 * @return the range of actividadeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Actividades> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the actividadeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ActividadesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of actividadeses
	 * @param end the upper bound of the range of actividadeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of actividadeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Actividades> findAll(int start, int end,
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

		List<Actividades> list = (List<Actividades>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACTIVIDADES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACTIVIDADES;

				if (pagination) {
					sql = sql.concat(ActividadesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Actividades>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Actividades>(list);
				}
				else {
					list = (List<Actividades>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the actividadeses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Actividades actividades : findAll()) {
			remove(actividades);
		}
	}

	/**
	 * Returns the number of actividadeses.
	 *
	 * @return the number of actividadeses
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

				Query q = session.createQuery(_SQL_COUNT_ACTIVIDADES);

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
	 * Initializes the actividades persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.Actividades")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Actividades>> listenersList = new ArrayList<ModelListener<Actividades>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Actividades>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ActividadesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ACTIVIDADES = "SELECT actividades FROM Actividades actividades";
	private static final String _SQL_COUNT_ACTIVIDADES = "SELECT COUNT(actividades) FROM Actividades actividades";
	private static final String _ORDER_BY_ENTITY_ALIAS = "actividades.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Actividades exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ActividadesPersistenceImpl.class);
	private static Actividades _nullActividades = new ActividadesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Actividades> toCacheModel() {
				return _nullActividadesCacheModel;
			}
		};

	private static CacheModel<Actividades> _nullActividadesCacheModel = new CacheModel<Actividades>() {
			@Override
			public Actividades toEntityModel() {
				return _nullActividades;
			}
		};
}
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

import com.rec.hitss.layer.NoSuchEvaluacionException;
import com.rec.hitss.layer.model.Evaluacion;
import com.rec.hitss.layer.model.impl.EvaluacionImpl;
import com.rec.hitss.layer.model.impl.EvaluacionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the evaluacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see EvaluacionPersistence
 * @see EvaluacionUtil
 * @generated
 */
public class EvaluacionPersistenceImpl extends BasePersistenceImpl<Evaluacion>
	implements EvaluacionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EvaluacionUtil} to access the evaluacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EvaluacionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionModelImpl.FINDER_CACHE_ENABLED, EvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionModelImpl.FINDER_CACHE_ENABLED, EvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EvaluacionPersistenceImpl() {
		setModelClass(Evaluacion.class);
	}

	/**
	 * Caches the evaluacion in the entity cache if it is enabled.
	 *
	 * @param evaluacion the evaluacion
	 */
	@Override
	public void cacheResult(Evaluacion evaluacion) {
		EntityCacheUtil.putResult(EvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionImpl.class, evaluacion.getPrimaryKey(), evaluacion);

		evaluacion.resetOriginalValues();
	}

	/**
	 * Caches the evaluacions in the entity cache if it is enabled.
	 *
	 * @param evaluacions the evaluacions
	 */
	@Override
	public void cacheResult(List<Evaluacion> evaluacions) {
		for (Evaluacion evaluacion : evaluacions) {
			if (EntityCacheUtil.getResult(
						EvaluacionModelImpl.ENTITY_CACHE_ENABLED,
						EvaluacionImpl.class, evaluacion.getPrimaryKey()) == null) {
				cacheResult(evaluacion);
			}
			else {
				evaluacion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all evaluacions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EvaluacionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EvaluacionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the evaluacion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Evaluacion evaluacion) {
		EntityCacheUtil.removeResult(EvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionImpl.class, evaluacion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Evaluacion> evaluacions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Evaluacion evaluacion : evaluacions) {
			EntityCacheUtil.removeResult(EvaluacionModelImpl.ENTITY_CACHE_ENABLED,
				EvaluacionImpl.class, evaluacion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new evaluacion with the primary key. Does not add the evaluacion to the database.
	 *
	 * @param evaluacionId the primary key for the new evaluacion
	 * @return the new evaluacion
	 */
	@Override
	public Evaluacion create(long evaluacionId) {
		Evaluacion evaluacion = new EvaluacionImpl();

		evaluacion.setNew(true);
		evaluacion.setPrimaryKey(evaluacionId);

		return evaluacion;
	}

	/**
	 * Removes the evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evaluacionId the primary key of the evaluacion
	 * @return the evaluacion that was removed
	 * @throws com.rec.hitss.layer.NoSuchEvaluacionException if a evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Evaluacion remove(long evaluacionId)
		throws NoSuchEvaluacionException, SystemException {
		return remove((Serializable)evaluacionId);
	}

	/**
	 * Removes the evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the evaluacion
	 * @return the evaluacion that was removed
	 * @throws com.rec.hitss.layer.NoSuchEvaluacionException if a evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Evaluacion remove(Serializable primaryKey)
		throws NoSuchEvaluacionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Evaluacion evaluacion = (Evaluacion)session.get(EvaluacionImpl.class,
					primaryKey);

			if (evaluacion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEvaluacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(evaluacion);
		}
		catch (NoSuchEvaluacionException nsee) {
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
	protected Evaluacion removeImpl(Evaluacion evaluacion)
		throws SystemException {
		evaluacion = toUnwrappedModel(evaluacion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(evaluacion)) {
				evaluacion = (Evaluacion)session.get(EvaluacionImpl.class,
						evaluacion.getPrimaryKeyObj());
			}

			if (evaluacion != null) {
				session.delete(evaluacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (evaluacion != null) {
			clearCache(evaluacion);
		}

		return evaluacion;
	}

	@Override
	public Evaluacion updateImpl(
		com.rec.hitss.layer.model.Evaluacion evaluacion)
		throws SystemException {
		evaluacion = toUnwrappedModel(evaluacion);

		boolean isNew = evaluacion.isNew();

		Session session = null;

		try {
			session = openSession();

			if (evaluacion.isNew()) {
				session.save(evaluacion);

				evaluacion.setNew(false);
			}
			else {
				session.merge(evaluacion);
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

		EntityCacheUtil.putResult(EvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			EvaluacionImpl.class, evaluacion.getPrimaryKey(), evaluacion);

		return evaluacion;
	}

	protected Evaluacion toUnwrappedModel(Evaluacion evaluacion) {
		if (evaluacion instanceof EvaluacionImpl) {
			return evaluacion;
		}

		EvaluacionImpl evaluacionImpl = new EvaluacionImpl();

		evaluacionImpl.setNew(evaluacion.isNew());
		evaluacionImpl.setPrimaryKey(evaluacion.getPrimaryKey());

		evaluacionImpl.setEvaluacionId(evaluacion.getEvaluacionId());
		evaluacionImpl.setTiempoMinuto(evaluacion.getTiempoMinuto());
		evaluacionImpl.setEnfoque(evaluacion.getEnfoque());
		evaluacionImpl.setPuestoEvaluacion(evaluacion.getPuestoEvaluacion());
		evaluacionImpl.setTiempoPuesto(evaluacion.getTiempoPuesto());
		evaluacionImpl.setTipoEvaluacion(evaluacion.getTipoEvaluacion());
		evaluacionImpl.setActivo(evaluacion.isActivo());
		evaluacionImpl.setUsuariocrea(evaluacion.getUsuariocrea());
		evaluacionImpl.setFechacrea(evaluacion.getFechacrea());
		evaluacionImpl.setUsuariomodifica(evaluacion.getUsuariomodifica());
		evaluacionImpl.setFechacreamodifica(evaluacion.getFechacreamodifica());

		return evaluacionImpl;
	}

	/**
	 * Returns the evaluacion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the evaluacion
	 * @return the evaluacion
	 * @throws com.rec.hitss.layer.NoSuchEvaluacionException if a evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Evaluacion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEvaluacionException, SystemException {
		Evaluacion evaluacion = fetchByPrimaryKey(primaryKey);

		if (evaluacion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEvaluacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return evaluacion;
	}

	/**
	 * Returns the evaluacion with the primary key or throws a {@link com.rec.hitss.layer.NoSuchEvaluacionException} if it could not be found.
	 *
	 * @param evaluacionId the primary key of the evaluacion
	 * @return the evaluacion
	 * @throws com.rec.hitss.layer.NoSuchEvaluacionException if a evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Evaluacion findByPrimaryKey(long evaluacionId)
		throws NoSuchEvaluacionException, SystemException {
		return findByPrimaryKey((Serializable)evaluacionId);
	}

	/**
	 * Returns the evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the evaluacion
	 * @return the evaluacion, or <code>null</code> if a evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Evaluacion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Evaluacion evaluacion = (Evaluacion)EntityCacheUtil.getResult(EvaluacionModelImpl.ENTITY_CACHE_ENABLED,
				EvaluacionImpl.class, primaryKey);

		if (evaluacion == _nullEvaluacion) {
			return null;
		}

		if (evaluacion == null) {
			Session session = null;

			try {
				session = openSession();

				evaluacion = (Evaluacion)session.get(EvaluacionImpl.class,
						primaryKey);

				if (evaluacion != null) {
					cacheResult(evaluacion);
				}
				else {
					EntityCacheUtil.putResult(EvaluacionModelImpl.ENTITY_CACHE_ENABLED,
						EvaluacionImpl.class, primaryKey, _nullEvaluacion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EvaluacionModelImpl.ENTITY_CACHE_ENABLED,
					EvaluacionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return evaluacion;
	}

	/**
	 * Returns the evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evaluacionId the primary key of the evaluacion
	 * @return the evaluacion, or <code>null</code> if a evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Evaluacion fetchByPrimaryKey(long evaluacionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)evaluacionId);
	}

	/**
	 * Returns all the evaluacions.
	 *
	 * @return the evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Evaluacion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of evaluacions
	 * @param end the upper bound of the range of evaluacions (not inclusive)
	 * @return the range of evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Evaluacion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.EvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of evaluacions
	 * @param end the upper bound of the range of evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Evaluacion> findAll(int start, int end,
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

		List<Evaluacion> list = (List<Evaluacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EVALUACION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EVALUACION;

				if (pagination) {
					sql = sql.concat(EvaluacionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Evaluacion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Evaluacion>(list);
				}
				else {
					list = (List<Evaluacion>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the evaluacions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Evaluacion evaluacion : findAll()) {
			remove(evaluacion);
		}
	}

	/**
	 * Returns the number of evaluacions.
	 *
	 * @return the number of evaluacions
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

				Query q = session.createQuery(_SQL_COUNT_EVALUACION);

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
	 * Initializes the evaluacion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.Evaluacion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Evaluacion>> listenersList = new ArrayList<ModelListener<Evaluacion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Evaluacion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EvaluacionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EVALUACION = "SELECT evaluacion FROM Evaluacion evaluacion";
	private static final String _SQL_COUNT_EVALUACION = "SELECT COUNT(evaluacion) FROM Evaluacion evaluacion";
	private static final String _ORDER_BY_ENTITY_ALIAS = "evaluacion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Evaluacion exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EvaluacionPersistenceImpl.class);
	private static Evaluacion _nullEvaluacion = new EvaluacionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Evaluacion> toCacheModel() {
				return _nullEvaluacionCacheModel;
			}
		};

	private static CacheModel<Evaluacion> _nullEvaluacionCacheModel = new CacheModel<Evaluacion>() {
			@Override
			public Evaluacion toEntityModel() {
				return _nullEvaluacion;
			}
		};
}
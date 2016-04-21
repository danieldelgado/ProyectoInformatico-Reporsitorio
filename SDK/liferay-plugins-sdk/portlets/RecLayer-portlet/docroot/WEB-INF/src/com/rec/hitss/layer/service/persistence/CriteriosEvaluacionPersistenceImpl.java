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

import com.rec.hitss.layer.NoSuchCriteriosEvaluacionException;
import com.rec.hitss.layer.model.CriteriosEvaluacion;
import com.rec.hitss.layer.model.impl.CriteriosEvaluacionImpl;
import com.rec.hitss.layer.model.impl.CriteriosEvaluacionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the criterios evaluacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see CriteriosEvaluacionPersistence
 * @see CriteriosEvaluacionUtil
 * @generated
 */
public class CriteriosEvaluacionPersistenceImpl extends BasePersistenceImpl<CriteriosEvaluacion>
	implements CriteriosEvaluacionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CriteriosEvaluacionUtil} to access the criterios evaluacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CriteriosEvaluacionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CriteriosEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			CriteriosEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			CriteriosEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CriteriosEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			CriteriosEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			CriteriosEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CriteriosEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			CriteriosEvaluacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CriteriosEvaluacionPersistenceImpl() {
		setModelClass(CriteriosEvaluacion.class);
	}

	/**
	 * Caches the criterios evaluacion in the entity cache if it is enabled.
	 *
	 * @param criteriosEvaluacion the criterios evaluacion
	 */
	@Override
	public void cacheResult(CriteriosEvaluacion criteriosEvaluacion) {
		EntityCacheUtil.putResult(CriteriosEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			CriteriosEvaluacionImpl.class, criteriosEvaluacion.getPrimaryKey(),
			criteriosEvaluacion);

		criteriosEvaluacion.resetOriginalValues();
	}

	/**
	 * Caches the criterios evaluacions in the entity cache if it is enabled.
	 *
	 * @param criteriosEvaluacions the criterios evaluacions
	 */
	@Override
	public void cacheResult(List<CriteriosEvaluacion> criteriosEvaluacions) {
		for (CriteriosEvaluacion criteriosEvaluacion : criteriosEvaluacions) {
			if (EntityCacheUtil.getResult(
						CriteriosEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
						CriteriosEvaluacionImpl.class,
						criteriosEvaluacion.getPrimaryKey()) == null) {
				cacheResult(criteriosEvaluacion);
			}
			else {
				criteriosEvaluacion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all criterios evaluacions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CriteriosEvaluacionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CriteriosEvaluacionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the criterios evaluacion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CriteriosEvaluacion criteriosEvaluacion) {
		EntityCacheUtil.removeResult(CriteriosEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			CriteriosEvaluacionImpl.class, criteriosEvaluacion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CriteriosEvaluacion> criteriosEvaluacions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CriteriosEvaluacion criteriosEvaluacion : criteriosEvaluacions) {
			EntityCacheUtil.removeResult(CriteriosEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
				CriteriosEvaluacionImpl.class,
				criteriosEvaluacion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new criterios evaluacion with the primary key. Does not add the criterios evaluacion to the database.
	 *
	 * @param criteriosEvaluacionId the primary key for the new criterios evaluacion
	 * @return the new criterios evaluacion
	 */
	@Override
	public CriteriosEvaluacion create(long criteriosEvaluacionId) {
		CriteriosEvaluacion criteriosEvaluacion = new CriteriosEvaluacionImpl();

		criteriosEvaluacion.setNew(true);
		criteriosEvaluacion.setPrimaryKey(criteriosEvaluacionId);

		return criteriosEvaluacion;
	}

	/**
	 * Removes the criterios evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param criteriosEvaluacionId the primary key of the criterios evaluacion
	 * @return the criterios evaluacion that was removed
	 * @throws com.rec.hitss.layer.NoSuchCriteriosEvaluacionException if a criterios evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CriteriosEvaluacion remove(long criteriosEvaluacionId)
		throws NoSuchCriteriosEvaluacionException, SystemException {
		return remove((Serializable)criteriosEvaluacionId);
	}

	/**
	 * Removes the criterios evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the criterios evaluacion
	 * @return the criterios evaluacion that was removed
	 * @throws com.rec.hitss.layer.NoSuchCriteriosEvaluacionException if a criterios evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CriteriosEvaluacion remove(Serializable primaryKey)
		throws NoSuchCriteriosEvaluacionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CriteriosEvaluacion criteriosEvaluacion = (CriteriosEvaluacion)session.get(CriteriosEvaluacionImpl.class,
					primaryKey);

			if (criteriosEvaluacion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCriteriosEvaluacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(criteriosEvaluacion);
		}
		catch (NoSuchCriteriosEvaluacionException nsee) {
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
	protected CriteriosEvaluacion removeImpl(
		CriteriosEvaluacion criteriosEvaluacion) throws SystemException {
		criteriosEvaluacion = toUnwrappedModel(criteriosEvaluacion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(criteriosEvaluacion)) {
				criteriosEvaluacion = (CriteriosEvaluacion)session.get(CriteriosEvaluacionImpl.class,
						criteriosEvaluacion.getPrimaryKeyObj());
			}

			if (criteriosEvaluacion != null) {
				session.delete(criteriosEvaluacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (criteriosEvaluacion != null) {
			clearCache(criteriosEvaluacion);
		}

		return criteriosEvaluacion;
	}

	@Override
	public CriteriosEvaluacion updateImpl(
		com.rec.hitss.layer.model.CriteriosEvaluacion criteriosEvaluacion)
		throws SystemException {
		criteriosEvaluacion = toUnwrappedModel(criteriosEvaluacion);

		boolean isNew = criteriosEvaluacion.isNew();

		Session session = null;

		try {
			session = openSession();

			if (criteriosEvaluacion.isNew()) {
				session.save(criteriosEvaluacion);

				criteriosEvaluacion.setNew(false);
			}
			else {
				session.merge(criteriosEvaluacion);
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

		EntityCacheUtil.putResult(CriteriosEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			CriteriosEvaluacionImpl.class, criteriosEvaluacion.getPrimaryKey(),
			criteriosEvaluacion);

		return criteriosEvaluacion;
	}

	protected CriteriosEvaluacion toUnwrappedModel(
		CriteriosEvaluacion criteriosEvaluacion) {
		if (criteriosEvaluacion instanceof CriteriosEvaluacionImpl) {
			return criteriosEvaluacion;
		}

		CriteriosEvaluacionImpl criteriosEvaluacionImpl = new CriteriosEvaluacionImpl();

		criteriosEvaluacionImpl.setNew(criteriosEvaluacion.isNew());
		criteriosEvaluacionImpl.setPrimaryKey(criteriosEvaluacion.getPrimaryKey());

		criteriosEvaluacionImpl.setCriteriosEvaluacionId(criteriosEvaluacion.getCriteriosEvaluacionId());
		criteriosEvaluacionImpl.setNombre(criteriosEvaluacion.getNombre());
		criteriosEvaluacionImpl.setNivelCriterio(criteriosEvaluacion.getNivelCriterio());
		criteriosEvaluacionImpl.setObservacion(criteriosEvaluacion.getObservacion());
		criteriosEvaluacionImpl.setParametroPadreId(criteriosEvaluacion.getParametroPadreId());
		criteriosEvaluacionImpl.setEvaluacionId(criteriosEvaluacion.getEvaluacionId());
		criteriosEvaluacionImpl.setActivo(criteriosEvaluacion.isActivo());
		criteriosEvaluacionImpl.setUsuariocrea(criteriosEvaluacion.getUsuariocrea());
		criteriosEvaluacionImpl.setFechacrea(criteriosEvaluacion.getFechacrea());
		criteriosEvaluacionImpl.setUsuariomodifica(criteriosEvaluacion.getUsuariomodifica());
		criteriosEvaluacionImpl.setFechacreamodifica(criteriosEvaluacion.getFechacreamodifica());

		return criteriosEvaluacionImpl;
	}

	/**
	 * Returns the criterios evaluacion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the criterios evaluacion
	 * @return the criterios evaluacion
	 * @throws com.rec.hitss.layer.NoSuchCriteriosEvaluacionException if a criterios evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CriteriosEvaluacion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCriteriosEvaluacionException, SystemException {
		CriteriosEvaluacion criteriosEvaluacion = fetchByPrimaryKey(primaryKey);

		if (criteriosEvaluacion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCriteriosEvaluacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return criteriosEvaluacion;
	}

	/**
	 * Returns the criterios evaluacion with the primary key or throws a {@link com.rec.hitss.layer.NoSuchCriteriosEvaluacionException} if it could not be found.
	 *
	 * @param criteriosEvaluacionId the primary key of the criterios evaluacion
	 * @return the criterios evaluacion
	 * @throws com.rec.hitss.layer.NoSuchCriteriosEvaluacionException if a criterios evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CriteriosEvaluacion findByPrimaryKey(long criteriosEvaluacionId)
		throws NoSuchCriteriosEvaluacionException, SystemException {
		return findByPrimaryKey((Serializable)criteriosEvaluacionId);
	}

	/**
	 * Returns the criterios evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the criterios evaluacion
	 * @return the criterios evaluacion, or <code>null</code> if a criterios evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CriteriosEvaluacion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CriteriosEvaluacion criteriosEvaluacion = (CriteriosEvaluacion)EntityCacheUtil.getResult(CriteriosEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
				CriteriosEvaluacionImpl.class, primaryKey);

		if (criteriosEvaluacion == _nullCriteriosEvaluacion) {
			return null;
		}

		if (criteriosEvaluacion == null) {
			Session session = null;

			try {
				session = openSession();

				criteriosEvaluacion = (CriteriosEvaluacion)session.get(CriteriosEvaluacionImpl.class,
						primaryKey);

				if (criteriosEvaluacion != null) {
					cacheResult(criteriosEvaluacion);
				}
				else {
					EntityCacheUtil.putResult(CriteriosEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
						CriteriosEvaluacionImpl.class, primaryKey,
						_nullCriteriosEvaluacion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CriteriosEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
					CriteriosEvaluacionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return criteriosEvaluacion;
	}

	/**
	 * Returns the criterios evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param criteriosEvaluacionId the primary key of the criterios evaluacion
	 * @return the criterios evaluacion, or <code>null</code> if a criterios evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CriteriosEvaluacion fetchByPrimaryKey(long criteriosEvaluacionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)criteriosEvaluacionId);
	}

	/**
	 * Returns all the criterios evaluacions.
	 *
	 * @return the criterios evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CriteriosEvaluacion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the criterios evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.CriteriosEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criterios evaluacions
	 * @param end the upper bound of the range of criterios evaluacions (not inclusive)
	 * @return the range of criterios evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CriteriosEvaluacion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the criterios evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.CriteriosEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criterios evaluacions
	 * @param end the upper bound of the range of criterios evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of criterios evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CriteriosEvaluacion> findAll(int start, int end,
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

		List<CriteriosEvaluacion> list = (List<CriteriosEvaluacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CRITERIOSEVALUACION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRITERIOSEVALUACION;

				if (pagination) {
					sql = sql.concat(CriteriosEvaluacionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CriteriosEvaluacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CriteriosEvaluacion>(list);
				}
				else {
					list = (List<CriteriosEvaluacion>)QueryUtil.list(q,
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
	 * Removes all the criterios evaluacions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CriteriosEvaluacion criteriosEvaluacion : findAll()) {
			remove(criteriosEvaluacion);
		}
	}

	/**
	 * Returns the number of criterios evaluacions.
	 *
	 * @return the number of criterios evaluacions
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

				Query q = session.createQuery(_SQL_COUNT_CRITERIOSEVALUACION);

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
	 * Initializes the criterios evaluacion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.CriteriosEvaluacion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CriteriosEvaluacion>> listenersList = new ArrayList<ModelListener<CriteriosEvaluacion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CriteriosEvaluacion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CriteriosEvaluacionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CRITERIOSEVALUACION = "SELECT criteriosEvaluacion FROM CriteriosEvaluacion criteriosEvaluacion";
	private static final String _SQL_COUNT_CRITERIOSEVALUACION = "SELECT COUNT(criteriosEvaluacion) FROM CriteriosEvaluacion criteriosEvaluacion";
	private static final String _ORDER_BY_ENTITY_ALIAS = "criteriosEvaluacion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CriteriosEvaluacion exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CriteriosEvaluacionPersistenceImpl.class);
	private static CriteriosEvaluacion _nullCriteriosEvaluacion = new CriteriosEvaluacionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CriteriosEvaluacion> toCacheModel() {
				return _nullCriteriosEvaluacionCacheModel;
			}
		};

	private static CacheModel<CriteriosEvaluacion> _nullCriteriosEvaluacionCacheModel =
		new CacheModel<CriteriosEvaluacion>() {
			@Override
			public CriteriosEvaluacion toEntityModel() {
				return _nullCriteriosEvaluacion;
			}
		};
}
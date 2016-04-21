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

import com.rec.hitss.layer.NoSuchExperienciaException;
import com.rec.hitss.layer.model.Experiencia;
import com.rec.hitss.layer.model.impl.ExperienciaImpl;
import com.rec.hitss.layer.model.impl.ExperienciaModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the experiencia service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see ExperienciaPersistence
 * @see ExperienciaUtil
 * @generated
 */
public class ExperienciaPersistenceImpl extends BasePersistenceImpl<Experiencia>
	implements ExperienciaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ExperienciaUtil} to access the experiencia persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ExperienciaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
			ExperienciaModelImpl.FINDER_CACHE_ENABLED, ExperienciaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
			ExperienciaModelImpl.FINDER_CACHE_ENABLED, ExperienciaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
			ExperienciaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ExperienciaPersistenceImpl() {
		setModelClass(Experiencia.class);
	}

	/**
	 * Caches the experiencia in the entity cache if it is enabled.
	 *
	 * @param experiencia the experiencia
	 */
	@Override
	public void cacheResult(Experiencia experiencia) {
		EntityCacheUtil.putResult(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
			ExperienciaImpl.class, experiencia.getPrimaryKey(), experiencia);

		experiencia.resetOriginalValues();
	}

	/**
	 * Caches the experiencias in the entity cache if it is enabled.
	 *
	 * @param experiencias the experiencias
	 */
	@Override
	public void cacheResult(List<Experiencia> experiencias) {
		for (Experiencia experiencia : experiencias) {
			if (EntityCacheUtil.getResult(
						ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
						ExperienciaImpl.class, experiencia.getPrimaryKey()) == null) {
				cacheResult(experiencia);
			}
			else {
				experiencia.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all experiencias.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ExperienciaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ExperienciaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the experiencia.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Experiencia experiencia) {
		EntityCacheUtil.removeResult(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
			ExperienciaImpl.class, experiencia.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Experiencia> experiencias) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Experiencia experiencia : experiencias) {
			EntityCacheUtil.removeResult(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
				ExperienciaImpl.class, experiencia.getPrimaryKey());
		}
	}

	/**
	 * Creates a new experiencia with the primary key. Does not add the experiencia to the database.
	 *
	 * @param estudioId the primary key for the new experiencia
	 * @return the new experiencia
	 */
	@Override
	public Experiencia create(long estudioId) {
		Experiencia experiencia = new ExperienciaImpl();

		experiencia.setNew(true);
		experiencia.setPrimaryKey(estudioId);

		return experiencia;
	}

	/**
	 * Removes the experiencia with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param estudioId the primary key of the experiencia
	 * @return the experiencia that was removed
	 * @throws com.rec.hitss.layer.NoSuchExperienciaException if a experiencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia remove(long estudioId)
		throws NoSuchExperienciaException, SystemException {
		return remove((Serializable)estudioId);
	}

	/**
	 * Removes the experiencia with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the experiencia
	 * @return the experiencia that was removed
	 * @throws com.rec.hitss.layer.NoSuchExperienciaException if a experiencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia remove(Serializable primaryKey)
		throws NoSuchExperienciaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Experiencia experiencia = (Experiencia)session.get(ExperienciaImpl.class,
					primaryKey);

			if (experiencia == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExperienciaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(experiencia);
		}
		catch (NoSuchExperienciaException nsee) {
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
	protected Experiencia removeImpl(Experiencia experiencia)
		throws SystemException {
		experiencia = toUnwrappedModel(experiencia);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(experiencia)) {
				experiencia = (Experiencia)session.get(ExperienciaImpl.class,
						experiencia.getPrimaryKeyObj());
			}

			if (experiencia != null) {
				session.delete(experiencia);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (experiencia != null) {
			clearCache(experiencia);
		}

		return experiencia;
	}

	@Override
	public Experiencia updateImpl(
		com.rec.hitss.layer.model.Experiencia experiencia)
		throws SystemException {
		experiencia = toUnwrappedModel(experiencia);

		boolean isNew = experiencia.isNew();

		Session session = null;

		try {
			session = openSession();

			if (experiencia.isNew()) {
				session.save(experiencia);

				experiencia.setNew(false);
			}
			else {
				session.merge(experiencia);
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

		EntityCacheUtil.putResult(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
			ExperienciaImpl.class, experiencia.getPrimaryKey(), experiencia);

		return experiencia;
	}

	protected Experiencia toUnwrappedModel(Experiencia experiencia) {
		if (experiencia instanceof ExperienciaImpl) {
			return experiencia;
		}

		ExperienciaImpl experienciaImpl = new ExperienciaImpl();

		experienciaImpl.setNew(experiencia.isNew());
		experienciaImpl.setPrimaryKey(experiencia.getPrimaryKey());

		experienciaImpl.setEstudioId(experiencia.getEstudioId());
		experienciaImpl.setDescripcion(experiencia.getDescripcion());
		experienciaImpl.setNivel(experiencia.getNivel());
		experienciaImpl.setEmpresa(experiencia.getEmpresa());
		experienciaImpl.setProyecto(experiencia.getProyecto());
		experienciaImpl.setFechaInicio(experiencia.getFechaInicio());
		experienciaImpl.setFechaFin(experiencia.getFechaFin());
		experienciaImpl.setUsuarioHitssId(experiencia.getUsuarioHitssId());
		experienciaImpl.setActivo(experiencia.isActivo());
		experienciaImpl.setUsuariocrea(experiencia.getUsuariocrea());
		experienciaImpl.setFechacrea(experiencia.getFechacrea());
		experienciaImpl.setUsuariomodifica(experiencia.getUsuariomodifica());
		experienciaImpl.setFechacreamodifica(experiencia.getFechacreamodifica());

		return experienciaImpl;
	}

	/**
	 * Returns the experiencia with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the experiencia
	 * @return the experiencia
	 * @throws com.rec.hitss.layer.NoSuchExperienciaException if a experiencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExperienciaException, SystemException {
		Experiencia experiencia = fetchByPrimaryKey(primaryKey);

		if (experiencia == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExperienciaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return experiencia;
	}

	/**
	 * Returns the experiencia with the primary key or throws a {@link com.rec.hitss.layer.NoSuchExperienciaException} if it could not be found.
	 *
	 * @param estudioId the primary key of the experiencia
	 * @return the experiencia
	 * @throws com.rec.hitss.layer.NoSuchExperienciaException if a experiencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia findByPrimaryKey(long estudioId)
		throws NoSuchExperienciaException, SystemException {
		return findByPrimaryKey((Serializable)estudioId);
	}

	/**
	 * Returns the experiencia with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the experiencia
	 * @return the experiencia, or <code>null</code> if a experiencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Experiencia experiencia = (Experiencia)EntityCacheUtil.getResult(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
				ExperienciaImpl.class, primaryKey);

		if (experiencia == _nullExperiencia) {
			return null;
		}

		if (experiencia == null) {
			Session session = null;

			try {
				session = openSession();

				experiencia = (Experiencia)session.get(ExperienciaImpl.class,
						primaryKey);

				if (experiencia != null) {
					cacheResult(experiencia);
				}
				else {
					EntityCacheUtil.putResult(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
						ExperienciaImpl.class, primaryKey, _nullExperiencia);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ExperienciaModelImpl.ENTITY_CACHE_ENABLED,
					ExperienciaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return experiencia;
	}

	/**
	 * Returns the experiencia with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param estudioId the primary key of the experiencia
	 * @return the experiencia, or <code>null</code> if a experiencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Experiencia fetchByPrimaryKey(long estudioId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)estudioId);
	}

	/**
	 * Returns all the experiencias.
	 *
	 * @return the experiencias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Experiencia> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the experiencias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ExperienciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of experiencias
	 * @param end the upper bound of the range of experiencias (not inclusive)
	 * @return the range of experiencias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Experiencia> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the experiencias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ExperienciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of experiencias
	 * @param end the upper bound of the range of experiencias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of experiencias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Experiencia> findAll(int start, int end,
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

		List<Experiencia> list = (List<Experiencia>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EXPERIENCIA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EXPERIENCIA;

				if (pagination) {
					sql = sql.concat(ExperienciaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Experiencia>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Experiencia>(list);
				}
				else {
					list = (List<Experiencia>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the experiencias from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Experiencia experiencia : findAll()) {
			remove(experiencia);
		}
	}

	/**
	 * Returns the number of experiencias.
	 *
	 * @return the number of experiencias
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

				Query q = session.createQuery(_SQL_COUNT_EXPERIENCIA);

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
	 * Initializes the experiencia persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.Experiencia")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Experiencia>> listenersList = new ArrayList<ModelListener<Experiencia>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Experiencia>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ExperienciaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EXPERIENCIA = "SELECT experiencia FROM Experiencia experiencia";
	private static final String _SQL_COUNT_EXPERIENCIA = "SELECT COUNT(experiencia) FROM Experiencia experiencia";
	private static final String _ORDER_BY_ENTITY_ALIAS = "experiencia.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Experiencia exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ExperienciaPersistenceImpl.class);
	private static Experiencia _nullExperiencia = new ExperienciaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Experiencia> toCacheModel() {
				return _nullExperienciaCacheModel;
			}
		};

	private static CacheModel<Experiencia> _nullExperienciaCacheModel = new CacheModel<Experiencia>() {
			@Override
			public Experiencia toEntityModel() {
				return _nullExperiencia;
			}
		};
}
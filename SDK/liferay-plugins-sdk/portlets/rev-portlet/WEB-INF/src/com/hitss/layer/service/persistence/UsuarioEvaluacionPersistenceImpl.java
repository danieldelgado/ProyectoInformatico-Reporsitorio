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

import com.hitss.layer.NoSuchUsuarioEvaluacionException;
import com.hitss.layer.model.UsuarioEvaluacion;
import com.hitss.layer.model.impl.UsuarioEvaluacionImpl;
import com.hitss.layer.model.impl.UsuarioEvaluacionModelImpl;

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
 * The persistence implementation for the usuario evaluacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see UsuarioEvaluacionPersistence
 * @see UsuarioEvaluacionUtil
 * @generated
 */
public class UsuarioEvaluacionPersistenceImpl extends BasePersistenceImpl<UsuarioEvaluacion>
	implements UsuarioEvaluacionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UsuarioEvaluacionUtil} to access the usuario evaluacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UsuarioEvaluacionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UsuarioEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			UsuarioEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UsuarioEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			UsuarioEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UsuarioEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioEvaluacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public UsuarioEvaluacionPersistenceImpl() {
		setModelClass(UsuarioEvaluacion.class);
	}

	/**
	 * Caches the usuario evaluacion in the entity cache if it is enabled.
	 *
	 * @param usuarioEvaluacion the usuario evaluacion
	 */
	@Override
	public void cacheResult(UsuarioEvaluacion usuarioEvaluacion) {
		EntityCacheUtil.putResult(UsuarioEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioEvaluacionImpl.class, usuarioEvaluacion.getPrimaryKey(),
			usuarioEvaluacion);

		usuarioEvaluacion.resetOriginalValues();
	}

	/**
	 * Caches the usuario evaluacions in the entity cache if it is enabled.
	 *
	 * @param usuarioEvaluacions the usuario evaluacions
	 */
	@Override
	public void cacheResult(List<UsuarioEvaluacion> usuarioEvaluacions) {
		for (UsuarioEvaluacion usuarioEvaluacion : usuarioEvaluacions) {
			if (EntityCacheUtil.getResult(
						UsuarioEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
						UsuarioEvaluacionImpl.class,
						usuarioEvaluacion.getPrimaryKey()) == null) {
				cacheResult(usuarioEvaluacion);
			}
			else {
				usuarioEvaluacion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all usuario evaluacions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UsuarioEvaluacionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UsuarioEvaluacionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the usuario evaluacion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UsuarioEvaluacion usuarioEvaluacion) {
		EntityCacheUtil.removeResult(UsuarioEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioEvaluacionImpl.class, usuarioEvaluacion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UsuarioEvaluacion> usuarioEvaluacions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UsuarioEvaluacion usuarioEvaluacion : usuarioEvaluacions) {
			EntityCacheUtil.removeResult(UsuarioEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
				UsuarioEvaluacionImpl.class, usuarioEvaluacion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new usuario evaluacion with the primary key. Does not add the usuario evaluacion to the database.
	 *
	 * @param usuarioEvaluacionPK the primary key for the new usuario evaluacion
	 * @return the new usuario evaluacion
	 */
	@Override
	public UsuarioEvaluacion create(UsuarioEvaluacionPK usuarioEvaluacionPK) {
		UsuarioEvaluacion usuarioEvaluacion = new UsuarioEvaluacionImpl();

		usuarioEvaluacion.setNew(true);
		usuarioEvaluacion.setPrimaryKey(usuarioEvaluacionPK);

		return usuarioEvaluacion;
	}

	/**
	 * Removes the usuario evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param usuarioEvaluacionPK the primary key of the usuario evaluacion
	 * @return the usuario evaluacion that was removed
	 * @throws com.hitss.layer.NoSuchUsuarioEvaluacionException if a usuario evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioEvaluacion remove(UsuarioEvaluacionPK usuarioEvaluacionPK)
		throws NoSuchUsuarioEvaluacionException, SystemException {
		return remove((Serializable)usuarioEvaluacionPK);
	}

	/**
	 * Removes the usuario evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the usuario evaluacion
	 * @return the usuario evaluacion that was removed
	 * @throws com.hitss.layer.NoSuchUsuarioEvaluacionException if a usuario evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioEvaluacion remove(Serializable primaryKey)
		throws NoSuchUsuarioEvaluacionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UsuarioEvaluacion usuarioEvaluacion = (UsuarioEvaluacion)session.get(UsuarioEvaluacionImpl.class,
					primaryKey);

			if (usuarioEvaluacion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUsuarioEvaluacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(usuarioEvaluacion);
		}
		catch (NoSuchUsuarioEvaluacionException nsee) {
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
	protected UsuarioEvaluacion removeImpl(UsuarioEvaluacion usuarioEvaluacion)
		throws SystemException {
		usuarioEvaluacion = toUnwrappedModel(usuarioEvaluacion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(usuarioEvaluacion)) {
				usuarioEvaluacion = (UsuarioEvaluacion)session.get(UsuarioEvaluacionImpl.class,
						usuarioEvaluacion.getPrimaryKeyObj());
			}

			if (usuarioEvaluacion != null) {
				session.delete(usuarioEvaluacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (usuarioEvaluacion != null) {
			clearCache(usuarioEvaluacion);
		}

		return usuarioEvaluacion;
	}

	@Override
	public UsuarioEvaluacion updateImpl(
		com.hitss.layer.model.UsuarioEvaluacion usuarioEvaluacion)
		throws SystemException {
		usuarioEvaluacion = toUnwrappedModel(usuarioEvaluacion);

		boolean isNew = usuarioEvaluacion.isNew();

		Session session = null;

		try {
			session = openSession();

			if (usuarioEvaluacion.isNew()) {
				session.save(usuarioEvaluacion);

				usuarioEvaluacion.setNew(false);
			}
			else {
				session.merge(usuarioEvaluacion);
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

		EntityCacheUtil.putResult(UsuarioEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioEvaluacionImpl.class, usuarioEvaluacion.getPrimaryKey(),
			usuarioEvaluacion);

		return usuarioEvaluacion;
	}

	protected UsuarioEvaluacion toUnwrappedModel(
		UsuarioEvaluacion usuarioEvaluacion) {
		if (usuarioEvaluacion instanceof UsuarioEvaluacionImpl) {
			return usuarioEvaluacion;
		}

		UsuarioEvaluacionImpl usuarioEvaluacionImpl = new UsuarioEvaluacionImpl();

		usuarioEvaluacionImpl.setNew(usuarioEvaluacion.isNew());
		usuarioEvaluacionImpl.setPrimaryKey(usuarioEvaluacion.getPrimaryKey());

		usuarioEvaluacionImpl.setActividadCronogramaId(usuarioEvaluacion.getActividadCronogramaId());
		usuarioEvaluacionImpl.setUsuarioId(usuarioEvaluacion.getUsuarioId());
		usuarioEvaluacionImpl.setEvaluacionId(usuarioEvaluacion.getEvaluacionId());

		return usuarioEvaluacionImpl;
	}

	/**
	 * Returns the usuario evaluacion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the usuario evaluacion
	 * @return the usuario evaluacion
	 * @throws com.hitss.layer.NoSuchUsuarioEvaluacionException if a usuario evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioEvaluacion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUsuarioEvaluacionException, SystemException {
		UsuarioEvaluacion usuarioEvaluacion = fetchByPrimaryKey(primaryKey);

		if (usuarioEvaluacion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUsuarioEvaluacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return usuarioEvaluacion;
	}

	/**
	 * Returns the usuario evaluacion with the primary key or throws a {@link com.hitss.layer.NoSuchUsuarioEvaluacionException} if it could not be found.
	 *
	 * @param usuarioEvaluacionPK the primary key of the usuario evaluacion
	 * @return the usuario evaluacion
	 * @throws com.hitss.layer.NoSuchUsuarioEvaluacionException if a usuario evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioEvaluacion findByPrimaryKey(
		UsuarioEvaluacionPK usuarioEvaluacionPK)
		throws NoSuchUsuarioEvaluacionException, SystemException {
		return findByPrimaryKey((Serializable)usuarioEvaluacionPK);
	}

	/**
	 * Returns the usuario evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the usuario evaluacion
	 * @return the usuario evaluacion, or <code>null</code> if a usuario evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioEvaluacion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UsuarioEvaluacion usuarioEvaluacion = (UsuarioEvaluacion)EntityCacheUtil.getResult(UsuarioEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
				UsuarioEvaluacionImpl.class, primaryKey);

		if (usuarioEvaluacion == _nullUsuarioEvaluacion) {
			return null;
		}

		if (usuarioEvaluacion == null) {
			Session session = null;

			try {
				session = openSession();

				usuarioEvaluacion = (UsuarioEvaluacion)session.get(UsuarioEvaluacionImpl.class,
						primaryKey);

				if (usuarioEvaluacion != null) {
					cacheResult(usuarioEvaluacion);
				}
				else {
					EntityCacheUtil.putResult(UsuarioEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
						UsuarioEvaluacionImpl.class, primaryKey,
						_nullUsuarioEvaluacion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UsuarioEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
					UsuarioEvaluacionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return usuarioEvaluacion;
	}

	/**
	 * Returns the usuario evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param usuarioEvaluacionPK the primary key of the usuario evaluacion
	 * @return the usuario evaluacion, or <code>null</code> if a usuario evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UsuarioEvaluacion fetchByPrimaryKey(
		UsuarioEvaluacionPK usuarioEvaluacionPK) throws SystemException {
		return fetchByPrimaryKey((Serializable)usuarioEvaluacionPK);
	}

	/**
	 * Returns all the usuario evaluacions.
	 *
	 * @return the usuario evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UsuarioEvaluacion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the usuario evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuario evaluacions
	 * @param end the upper bound of the range of usuario evaluacions (not inclusive)
	 * @return the range of usuario evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UsuarioEvaluacion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the usuario evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuario evaluacions
	 * @param end the upper bound of the range of usuario evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of usuario evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UsuarioEvaluacion> findAll(int start, int end,
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

		List<UsuarioEvaluacion> list = (List<UsuarioEvaluacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USUARIOEVALUACION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USUARIOEVALUACION;

				if (pagination) {
					sql = sql.concat(UsuarioEvaluacionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UsuarioEvaluacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UsuarioEvaluacion>(list);
				}
				else {
					list = (List<UsuarioEvaluacion>)QueryUtil.list(q,
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
	 * Removes all the usuario evaluacions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UsuarioEvaluacion usuarioEvaluacion : findAll()) {
			remove(usuarioEvaluacion);
		}
	}

	/**
	 * Returns the number of usuario evaluacions.
	 *
	 * @return the number of usuario evaluacions
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

				Query q = session.createQuery(_SQL_COUNT_USUARIOEVALUACION);

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
	 * Initializes the usuario evaluacion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.UsuarioEvaluacion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UsuarioEvaluacion>> listenersList = new ArrayList<ModelListener<UsuarioEvaluacion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UsuarioEvaluacion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UsuarioEvaluacionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USUARIOEVALUACION = "SELECT usuarioEvaluacion FROM UsuarioEvaluacion usuarioEvaluacion";
	private static final String _SQL_COUNT_USUARIOEVALUACION = "SELECT COUNT(usuarioEvaluacion) FROM UsuarioEvaluacion usuarioEvaluacion";
	private static final String _ORDER_BY_ENTITY_ALIAS = "usuarioEvaluacion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UsuarioEvaluacion exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UsuarioEvaluacionPersistenceImpl.class);
	private static UsuarioEvaluacion _nullUsuarioEvaluacion = new UsuarioEvaluacionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UsuarioEvaluacion> toCacheModel() {
				return _nullUsuarioEvaluacionCacheModel;
			}
		};

	private static CacheModel<UsuarioEvaluacion> _nullUsuarioEvaluacionCacheModel =
		new CacheModel<UsuarioEvaluacion>() {
			@Override
			public UsuarioEvaluacion toEntityModel() {
				return _nullUsuarioEvaluacion;
			}
		};
}
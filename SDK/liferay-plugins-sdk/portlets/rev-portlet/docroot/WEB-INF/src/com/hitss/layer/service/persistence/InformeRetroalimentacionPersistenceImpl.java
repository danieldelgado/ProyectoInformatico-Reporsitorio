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

import com.hitss.layer.NoSuchInformeRetroalimentacionException;
import com.hitss.layer.model.InformeRetroalimentacion;
import com.hitss.layer.model.impl.InformeRetroalimentacionImpl;
import com.hitss.layer.model.impl.InformeRetroalimentacionModelImpl;

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
 * The persistence implementation for the informe retroalimentacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see InformeRetroalimentacionPersistence
 * @see InformeRetroalimentacionUtil
 * @generated
 */
public class InformeRetroalimentacionPersistenceImpl extends BasePersistenceImpl<InformeRetroalimentacion>
	implements InformeRetroalimentacionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InformeRetroalimentacionUtil} to access the informe retroalimentacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InformeRetroalimentacionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InformeRetroalimentacionModelImpl.ENTITY_CACHE_ENABLED,
			InformeRetroalimentacionModelImpl.FINDER_CACHE_ENABLED,
			InformeRetroalimentacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InformeRetroalimentacionModelImpl.ENTITY_CACHE_ENABLED,
			InformeRetroalimentacionModelImpl.FINDER_CACHE_ENABLED,
			InformeRetroalimentacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InformeRetroalimentacionModelImpl.ENTITY_CACHE_ENABLED,
			InformeRetroalimentacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public InformeRetroalimentacionPersistenceImpl() {
		setModelClass(InformeRetroalimentacion.class);
	}

	/**
	 * Caches the informe retroalimentacion in the entity cache if it is enabled.
	 *
	 * @param informeRetroalimentacion the informe retroalimentacion
	 */
	@Override
	public void cacheResult(InformeRetroalimentacion informeRetroalimentacion) {
		EntityCacheUtil.putResult(InformeRetroalimentacionModelImpl.ENTITY_CACHE_ENABLED,
			InformeRetroalimentacionImpl.class,
			informeRetroalimentacion.getPrimaryKey(), informeRetroalimentacion);

		informeRetroalimentacion.resetOriginalValues();
	}

	/**
	 * Caches the informe retroalimentacions in the entity cache if it is enabled.
	 *
	 * @param informeRetroalimentacions the informe retroalimentacions
	 */
	@Override
	public void cacheResult(
		List<InformeRetroalimentacion> informeRetroalimentacions) {
		for (InformeRetroalimentacion informeRetroalimentacion : informeRetroalimentacions) {
			if (EntityCacheUtil.getResult(
						InformeRetroalimentacionModelImpl.ENTITY_CACHE_ENABLED,
						InformeRetroalimentacionImpl.class,
						informeRetroalimentacion.getPrimaryKey()) == null) {
				cacheResult(informeRetroalimentacion);
			}
			else {
				informeRetroalimentacion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all informe retroalimentacions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(InformeRetroalimentacionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(InformeRetroalimentacionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the informe retroalimentacion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(InformeRetroalimentacion informeRetroalimentacion) {
		EntityCacheUtil.removeResult(InformeRetroalimentacionModelImpl.ENTITY_CACHE_ENABLED,
			InformeRetroalimentacionImpl.class,
			informeRetroalimentacion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<InformeRetroalimentacion> informeRetroalimentacions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (InformeRetroalimentacion informeRetroalimentacion : informeRetroalimentacions) {
			EntityCacheUtil.removeResult(InformeRetroalimentacionModelImpl.ENTITY_CACHE_ENABLED,
				InformeRetroalimentacionImpl.class,
				informeRetroalimentacion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new informe retroalimentacion with the primary key. Does not add the informe retroalimentacion to the database.
	 *
	 * @param informeRetroalimentacionId the primary key for the new informe retroalimentacion
	 * @return the new informe retroalimentacion
	 */
	@Override
	public InformeRetroalimentacion create(long informeRetroalimentacionId) {
		InformeRetroalimentacion informeRetroalimentacion = new InformeRetroalimentacionImpl();

		informeRetroalimentacion.setNew(true);
		informeRetroalimentacion.setPrimaryKey(informeRetroalimentacionId);

		return informeRetroalimentacion;
	}

	/**
	 * Removes the informe retroalimentacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param informeRetroalimentacionId the primary key of the informe retroalimentacion
	 * @return the informe retroalimentacion that was removed
	 * @throws com.hitss.layer.NoSuchInformeRetroalimentacionException if a informe retroalimentacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InformeRetroalimentacion remove(long informeRetroalimentacionId)
		throws NoSuchInformeRetroalimentacionException, SystemException {
		return remove((Serializable)informeRetroalimentacionId);
	}

	/**
	 * Removes the informe retroalimentacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the informe retroalimentacion
	 * @return the informe retroalimentacion that was removed
	 * @throws com.hitss.layer.NoSuchInformeRetroalimentacionException if a informe retroalimentacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InformeRetroalimentacion remove(Serializable primaryKey)
		throws NoSuchInformeRetroalimentacionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			InformeRetroalimentacion informeRetroalimentacion = (InformeRetroalimentacion)session.get(InformeRetroalimentacionImpl.class,
					primaryKey);

			if (informeRetroalimentacion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInformeRetroalimentacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(informeRetroalimentacion);
		}
		catch (NoSuchInformeRetroalimentacionException nsee) {
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
	protected InformeRetroalimentacion removeImpl(
		InformeRetroalimentacion informeRetroalimentacion)
		throws SystemException {
		informeRetroalimentacion = toUnwrappedModel(informeRetroalimentacion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(informeRetroalimentacion)) {
				informeRetroalimentacion = (InformeRetroalimentacion)session.get(InformeRetroalimentacionImpl.class,
						informeRetroalimentacion.getPrimaryKeyObj());
			}

			if (informeRetroalimentacion != null) {
				session.delete(informeRetroalimentacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (informeRetroalimentacion != null) {
			clearCache(informeRetroalimentacion);
		}

		return informeRetroalimentacion;
	}

	@Override
	public InformeRetroalimentacion updateImpl(
		com.hitss.layer.model.InformeRetroalimentacion informeRetroalimentacion)
		throws SystemException {
		informeRetroalimentacion = toUnwrappedModel(informeRetroalimentacion);

		boolean isNew = informeRetroalimentacion.isNew();

		Session session = null;

		try {
			session = openSession();

			if (informeRetroalimentacion.isNew()) {
				session.save(informeRetroalimentacion);

				informeRetroalimentacion.setNew(false);
			}
			else {
				session.merge(informeRetroalimentacion);
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

		EntityCacheUtil.putResult(InformeRetroalimentacionModelImpl.ENTITY_CACHE_ENABLED,
			InformeRetroalimentacionImpl.class,
			informeRetroalimentacion.getPrimaryKey(), informeRetroalimentacion);

		return informeRetroalimentacion;
	}

	protected InformeRetroalimentacion toUnwrappedModel(
		InformeRetroalimentacion informeRetroalimentacion) {
		if (informeRetroalimentacion instanceof InformeRetroalimentacionImpl) {
			return informeRetroalimentacion;
		}

		InformeRetroalimentacionImpl informeRetroalimentacionImpl = new InformeRetroalimentacionImpl();

		informeRetroalimentacionImpl.setNew(informeRetroalimentacion.isNew());
		informeRetroalimentacionImpl.setPrimaryKey(informeRetroalimentacion.getPrimaryKey());

		informeRetroalimentacionImpl.setInformeRetroalimentacionId(informeRetroalimentacion.getInformeRetroalimentacionId());
		informeRetroalimentacionImpl.setPlanAccionId(informeRetroalimentacion.getPlanAccionId());
		informeRetroalimentacionImpl.setUsuario(informeRetroalimentacion.getUsuario());
		informeRetroalimentacionImpl.setTitulo(informeRetroalimentacion.getTitulo());
		informeRetroalimentacionImpl.setDescripcion(informeRetroalimentacion.getDescripcion());
		informeRetroalimentacionImpl.setActivo(informeRetroalimentacion.isActivo());
		informeRetroalimentacionImpl.setUsuariocrea(informeRetroalimentacion.getUsuariocrea());
		informeRetroalimentacionImpl.setFechacrea(informeRetroalimentacion.getFechacrea());
		informeRetroalimentacionImpl.setUsuariomodifica(informeRetroalimentacion.getUsuariomodifica());
		informeRetroalimentacionImpl.setFechamodifica(informeRetroalimentacion.getFechamodifica());

		return informeRetroalimentacionImpl;
	}

	/**
	 * Returns the informe retroalimentacion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the informe retroalimentacion
	 * @return the informe retroalimentacion
	 * @throws com.hitss.layer.NoSuchInformeRetroalimentacionException if a informe retroalimentacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InformeRetroalimentacion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInformeRetroalimentacionException, SystemException {
		InformeRetroalimentacion informeRetroalimentacion = fetchByPrimaryKey(primaryKey);

		if (informeRetroalimentacion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInformeRetroalimentacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return informeRetroalimentacion;
	}

	/**
	 * Returns the informe retroalimentacion with the primary key or throws a {@link com.hitss.layer.NoSuchInformeRetroalimentacionException} if it could not be found.
	 *
	 * @param informeRetroalimentacionId the primary key of the informe retroalimentacion
	 * @return the informe retroalimentacion
	 * @throws com.hitss.layer.NoSuchInformeRetroalimentacionException if a informe retroalimentacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InformeRetroalimentacion findByPrimaryKey(
		long informeRetroalimentacionId)
		throws NoSuchInformeRetroalimentacionException, SystemException {
		return findByPrimaryKey((Serializable)informeRetroalimentacionId);
	}

	/**
	 * Returns the informe retroalimentacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the informe retroalimentacion
	 * @return the informe retroalimentacion, or <code>null</code> if a informe retroalimentacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InformeRetroalimentacion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		InformeRetroalimentacion informeRetroalimentacion = (InformeRetroalimentacion)EntityCacheUtil.getResult(InformeRetroalimentacionModelImpl.ENTITY_CACHE_ENABLED,
				InformeRetroalimentacionImpl.class, primaryKey);

		if (informeRetroalimentacion == _nullInformeRetroalimentacion) {
			return null;
		}

		if (informeRetroalimentacion == null) {
			Session session = null;

			try {
				session = openSession();

				informeRetroalimentacion = (InformeRetroalimentacion)session.get(InformeRetroalimentacionImpl.class,
						primaryKey);

				if (informeRetroalimentacion != null) {
					cacheResult(informeRetroalimentacion);
				}
				else {
					EntityCacheUtil.putResult(InformeRetroalimentacionModelImpl.ENTITY_CACHE_ENABLED,
						InformeRetroalimentacionImpl.class, primaryKey,
						_nullInformeRetroalimentacion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(InformeRetroalimentacionModelImpl.ENTITY_CACHE_ENABLED,
					InformeRetroalimentacionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return informeRetroalimentacion;
	}

	/**
	 * Returns the informe retroalimentacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param informeRetroalimentacionId the primary key of the informe retroalimentacion
	 * @return the informe retroalimentacion, or <code>null</code> if a informe retroalimentacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InformeRetroalimentacion fetchByPrimaryKey(
		long informeRetroalimentacionId) throws SystemException {
		return fetchByPrimaryKey((Serializable)informeRetroalimentacionId);
	}

	/**
	 * Returns all the informe retroalimentacions.
	 *
	 * @return the informe retroalimentacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InformeRetroalimentacion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the informe retroalimentacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.InformeRetroalimentacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of informe retroalimentacions
	 * @param end the upper bound of the range of informe retroalimentacions (not inclusive)
	 * @return the range of informe retroalimentacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InformeRetroalimentacion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the informe retroalimentacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.InformeRetroalimentacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of informe retroalimentacions
	 * @param end the upper bound of the range of informe retroalimentacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of informe retroalimentacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InformeRetroalimentacion> findAll(int start, int end,
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

		List<InformeRetroalimentacion> list = (List<InformeRetroalimentacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_INFORMERETROALIMENTACION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INFORMERETROALIMENTACION;

				if (pagination) {
					sql = sql.concat(InformeRetroalimentacionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<InformeRetroalimentacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InformeRetroalimentacion>(list);
				}
				else {
					list = (List<InformeRetroalimentacion>)QueryUtil.list(q,
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
	 * Removes all the informe retroalimentacions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (InformeRetroalimentacion informeRetroalimentacion : findAll()) {
			remove(informeRetroalimentacion);
		}
	}

	/**
	 * Returns the number of informe retroalimentacions.
	 *
	 * @return the number of informe retroalimentacions
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

				Query q = session.createQuery(_SQL_COUNT_INFORMERETROALIMENTACION);

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
	 * Initializes the informe retroalimentacion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.InformeRetroalimentacion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<InformeRetroalimentacion>> listenersList = new ArrayList<ModelListener<InformeRetroalimentacion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<InformeRetroalimentacion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(InformeRetroalimentacionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_INFORMERETROALIMENTACION = "SELECT informeRetroalimentacion FROM InformeRetroalimentacion informeRetroalimentacion";
	private static final String _SQL_COUNT_INFORMERETROALIMENTACION = "SELECT COUNT(informeRetroalimentacion) FROM InformeRetroalimentacion informeRetroalimentacion";
	private static final String _ORDER_BY_ENTITY_ALIAS = "informeRetroalimentacion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InformeRetroalimentacion exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(InformeRetroalimentacionPersistenceImpl.class);
	private static InformeRetroalimentacion _nullInformeRetroalimentacion = new InformeRetroalimentacionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<InformeRetroalimentacion> toCacheModel() {
				return _nullInformeRetroalimentacionCacheModel;
			}
		};

	private static CacheModel<InformeRetroalimentacion> _nullInformeRetroalimentacionCacheModel =
		new CacheModel<InformeRetroalimentacion>() {
			@Override
			public InformeRetroalimentacion toEntityModel() {
				return _nullInformeRetroalimentacion;
			}
		};
}
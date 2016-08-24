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

import com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException;
import com.hitss.layer.model.DetalleRepuestaEvaluacion;
import com.hitss.layer.model.impl.DetalleRepuestaEvaluacionImpl;
import com.hitss.layer.model.impl.DetalleRepuestaEvaluacionModelImpl;

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
 * The persistence implementation for the detalle repuesta evaluacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see DetalleRepuestaEvaluacionPersistence
 * @see DetalleRepuestaEvaluacionUtil
 * @generated
 */
public class DetalleRepuestaEvaluacionPersistenceImpl
	extends BasePersistenceImpl<DetalleRepuestaEvaluacion>
	implements DetalleRepuestaEvaluacionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DetalleRepuestaEvaluacionUtil} to access the detalle repuesta evaluacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DetalleRepuestaEvaluacionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DetalleRepuestaEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			DetalleRepuestaEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			DetalleRepuestaEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DetalleRepuestaEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			DetalleRepuestaEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			DetalleRepuestaEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DetalleRepuestaEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			DetalleRepuestaEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public DetalleRepuestaEvaluacionPersistenceImpl() {
		setModelClass(DetalleRepuestaEvaluacion.class);
	}

	/**
	 * Caches the detalle repuesta evaluacion in the entity cache if it is enabled.
	 *
	 * @param detalleRepuestaEvaluacion the detalle repuesta evaluacion
	 */
	@Override
	public void cacheResult(DetalleRepuestaEvaluacion detalleRepuestaEvaluacion) {
		EntityCacheUtil.putResult(DetalleRepuestaEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			DetalleRepuestaEvaluacionImpl.class,
			detalleRepuestaEvaluacion.getPrimaryKey(), detalleRepuestaEvaluacion);

		detalleRepuestaEvaluacion.resetOriginalValues();
	}

	/**
	 * Caches the detalle repuesta evaluacions in the entity cache if it is enabled.
	 *
	 * @param detalleRepuestaEvaluacions the detalle repuesta evaluacions
	 */
	@Override
	public void cacheResult(
		List<DetalleRepuestaEvaluacion> detalleRepuestaEvaluacions) {
		for (DetalleRepuestaEvaluacion detalleRepuestaEvaluacion : detalleRepuestaEvaluacions) {
			if (EntityCacheUtil.getResult(
						DetalleRepuestaEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
						DetalleRepuestaEvaluacionImpl.class,
						detalleRepuestaEvaluacion.getPrimaryKey()) == null) {
				cacheResult(detalleRepuestaEvaluacion);
			}
			else {
				detalleRepuestaEvaluacion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all detalle repuesta evaluacions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DetalleRepuestaEvaluacionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DetalleRepuestaEvaluacionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the detalle repuesta evaluacion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DetalleRepuestaEvaluacion detalleRepuestaEvaluacion) {
		EntityCacheUtil.removeResult(DetalleRepuestaEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			DetalleRepuestaEvaluacionImpl.class,
			detalleRepuestaEvaluacion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<DetalleRepuestaEvaluacion> detalleRepuestaEvaluacions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DetalleRepuestaEvaluacion detalleRepuestaEvaluacion : detalleRepuestaEvaluacions) {
			EntityCacheUtil.removeResult(DetalleRepuestaEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
				DetalleRepuestaEvaluacionImpl.class,
				detalleRepuestaEvaluacion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new detalle repuesta evaluacion with the primary key. Does not add the detalle repuesta evaluacion to the database.
	 *
	 * @param detalleRepuestaEvaluacionPK the primary key for the new detalle repuesta evaluacion
	 * @return the new detalle repuesta evaluacion
	 */
	@Override
	public DetalleRepuestaEvaluacion create(
		DetalleRepuestaEvaluacionPK detalleRepuestaEvaluacionPK) {
		DetalleRepuestaEvaluacion detalleRepuestaEvaluacion = new DetalleRepuestaEvaluacionImpl();

		detalleRepuestaEvaluacion.setNew(true);
		detalleRepuestaEvaluacion.setPrimaryKey(detalleRepuestaEvaluacionPK);

		return detalleRepuestaEvaluacion;
	}

	/**
	 * Removes the detalle repuesta evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param detalleRepuestaEvaluacionPK the primary key of the detalle repuesta evaluacion
	 * @return the detalle repuesta evaluacion that was removed
	 * @throws com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException if a detalle repuesta evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DetalleRepuestaEvaluacion remove(
		DetalleRepuestaEvaluacionPK detalleRepuestaEvaluacionPK)
		throws NoSuchDetalleRepuestaEvaluacionException, SystemException {
		return remove((Serializable)detalleRepuestaEvaluacionPK);
	}

	/**
	 * Removes the detalle repuesta evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the detalle repuesta evaluacion
	 * @return the detalle repuesta evaluacion that was removed
	 * @throws com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException if a detalle repuesta evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DetalleRepuestaEvaluacion remove(Serializable primaryKey)
		throws NoSuchDetalleRepuestaEvaluacionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DetalleRepuestaEvaluacion detalleRepuestaEvaluacion = (DetalleRepuestaEvaluacion)session.get(DetalleRepuestaEvaluacionImpl.class,
					primaryKey);

			if (detalleRepuestaEvaluacion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDetalleRepuestaEvaluacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(detalleRepuestaEvaluacion);
		}
		catch (NoSuchDetalleRepuestaEvaluacionException nsee) {
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
	protected DetalleRepuestaEvaluacion removeImpl(
		DetalleRepuestaEvaluacion detalleRepuestaEvaluacion)
		throws SystemException {
		detalleRepuestaEvaluacion = toUnwrappedModel(detalleRepuestaEvaluacion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(detalleRepuestaEvaluacion)) {
				detalleRepuestaEvaluacion = (DetalleRepuestaEvaluacion)session.get(DetalleRepuestaEvaluacionImpl.class,
						detalleRepuestaEvaluacion.getPrimaryKeyObj());
			}

			if (detalleRepuestaEvaluacion != null) {
				session.delete(detalleRepuestaEvaluacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (detalleRepuestaEvaluacion != null) {
			clearCache(detalleRepuestaEvaluacion);
		}

		return detalleRepuestaEvaluacion;
	}

	@Override
	public DetalleRepuestaEvaluacion updateImpl(
		com.hitss.layer.model.DetalleRepuestaEvaluacion detalleRepuestaEvaluacion)
		throws SystemException {
		detalleRepuestaEvaluacion = toUnwrappedModel(detalleRepuestaEvaluacion);

		boolean isNew = detalleRepuestaEvaluacion.isNew();

		Session session = null;

		try {
			session = openSession();

			if (detalleRepuestaEvaluacion.isNew()) {
				session.save(detalleRepuestaEvaluacion);

				detalleRepuestaEvaluacion.setNew(false);
			}
			else {
				session.merge(detalleRepuestaEvaluacion);
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

		EntityCacheUtil.putResult(DetalleRepuestaEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			DetalleRepuestaEvaluacionImpl.class,
			detalleRepuestaEvaluacion.getPrimaryKey(), detalleRepuestaEvaluacion);

		return detalleRepuestaEvaluacion;
	}

	protected DetalleRepuestaEvaluacion toUnwrappedModel(
		DetalleRepuestaEvaluacion detalleRepuestaEvaluacion) {
		if (detalleRepuestaEvaluacion instanceof DetalleRepuestaEvaluacionImpl) {
			return detalleRepuestaEvaluacion;
		}

		DetalleRepuestaEvaluacionImpl detalleRepuestaEvaluacionImpl = new DetalleRepuestaEvaluacionImpl();

		detalleRepuestaEvaluacionImpl.setNew(detalleRepuestaEvaluacion.isNew());
		detalleRepuestaEvaluacionImpl.setPrimaryKey(detalleRepuestaEvaluacion.getPrimaryKey());

		detalleRepuestaEvaluacionImpl.setDetalleRepuestaEvaluacionId(detalleRepuestaEvaluacion.getDetalleRepuestaEvaluacionId());
		detalleRepuestaEvaluacionImpl.setEvaluacionId(detalleRepuestaEvaluacion.getEvaluacionId());
		detalleRepuestaEvaluacionImpl.setUsuarioId(detalleRepuestaEvaluacion.getUsuarioId());
		detalleRepuestaEvaluacionImpl.setDescripcion(detalleRepuestaEvaluacion.getDescripcion());
		detalleRepuestaEvaluacionImpl.setPreguntaId(detalleRepuestaEvaluacion.getPreguntaId());
		detalleRepuestaEvaluacionImpl.setRespuestaSeleccionada(detalleRepuestaEvaluacion.getRespuestaSeleccionada());

		return detalleRepuestaEvaluacionImpl;
	}

	/**
	 * Returns the detalle repuesta evaluacion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the detalle repuesta evaluacion
	 * @return the detalle repuesta evaluacion
	 * @throws com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException if a detalle repuesta evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DetalleRepuestaEvaluacion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDetalleRepuestaEvaluacionException, SystemException {
		DetalleRepuestaEvaluacion detalleRepuestaEvaluacion = fetchByPrimaryKey(primaryKey);

		if (detalleRepuestaEvaluacion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDetalleRepuestaEvaluacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return detalleRepuestaEvaluacion;
	}

	/**
	 * Returns the detalle repuesta evaluacion with the primary key or throws a {@link com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException} if it could not be found.
	 *
	 * @param detalleRepuestaEvaluacionPK the primary key of the detalle repuesta evaluacion
	 * @return the detalle repuesta evaluacion
	 * @throws com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException if a detalle repuesta evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DetalleRepuestaEvaluacion findByPrimaryKey(
		DetalleRepuestaEvaluacionPK detalleRepuestaEvaluacionPK)
		throws NoSuchDetalleRepuestaEvaluacionException, SystemException {
		return findByPrimaryKey((Serializable)detalleRepuestaEvaluacionPK);
	}

	/**
	 * Returns the detalle repuesta evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the detalle repuesta evaluacion
	 * @return the detalle repuesta evaluacion, or <code>null</code> if a detalle repuesta evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DetalleRepuestaEvaluacion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DetalleRepuestaEvaluacion detalleRepuestaEvaluacion = (DetalleRepuestaEvaluacion)EntityCacheUtil.getResult(DetalleRepuestaEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
				DetalleRepuestaEvaluacionImpl.class, primaryKey);

		if (detalleRepuestaEvaluacion == _nullDetalleRepuestaEvaluacion) {
			return null;
		}

		if (detalleRepuestaEvaluacion == null) {
			Session session = null;

			try {
				session = openSession();

				detalleRepuestaEvaluacion = (DetalleRepuestaEvaluacion)session.get(DetalleRepuestaEvaluacionImpl.class,
						primaryKey);

				if (detalleRepuestaEvaluacion != null) {
					cacheResult(detalleRepuestaEvaluacion);
				}
				else {
					EntityCacheUtil.putResult(DetalleRepuestaEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
						DetalleRepuestaEvaluacionImpl.class, primaryKey,
						_nullDetalleRepuestaEvaluacion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DetalleRepuestaEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
					DetalleRepuestaEvaluacionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return detalleRepuestaEvaluacion;
	}

	/**
	 * Returns the detalle repuesta evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param detalleRepuestaEvaluacionPK the primary key of the detalle repuesta evaluacion
	 * @return the detalle repuesta evaluacion, or <code>null</code> if a detalle repuesta evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DetalleRepuestaEvaluacion fetchByPrimaryKey(
		DetalleRepuestaEvaluacionPK detalleRepuestaEvaluacionPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)detalleRepuestaEvaluacionPK);
	}

	/**
	 * Returns all the detalle repuesta evaluacions.
	 *
	 * @return the detalle repuesta evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DetalleRepuestaEvaluacion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the detalle repuesta evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.DetalleRepuestaEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of detalle repuesta evaluacions
	 * @param end the upper bound of the range of detalle repuesta evaluacions (not inclusive)
	 * @return the range of detalle repuesta evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DetalleRepuestaEvaluacion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the detalle repuesta evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.DetalleRepuestaEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of detalle repuesta evaluacions
	 * @param end the upper bound of the range of detalle repuesta evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of detalle repuesta evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DetalleRepuestaEvaluacion> findAll(int start, int end,
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

		List<DetalleRepuestaEvaluacion> list = (List<DetalleRepuestaEvaluacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DETALLEREPUESTAEVALUACION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DETALLEREPUESTAEVALUACION;

				if (pagination) {
					sql = sql.concat(DetalleRepuestaEvaluacionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DetalleRepuestaEvaluacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DetalleRepuestaEvaluacion>(list);
				}
				else {
					list = (List<DetalleRepuestaEvaluacion>)QueryUtil.list(q,
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
	 * Removes all the detalle repuesta evaluacions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DetalleRepuestaEvaluacion detalleRepuestaEvaluacion : findAll()) {
			remove(detalleRepuestaEvaluacion);
		}
	}

	/**
	 * Returns the number of detalle repuesta evaluacions.
	 *
	 * @return the number of detalle repuesta evaluacions
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

				Query q = session.createQuery(_SQL_COUNT_DETALLEREPUESTAEVALUACION);

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
	 * Initializes the detalle repuesta evaluacion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.DetalleRepuestaEvaluacion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DetalleRepuestaEvaluacion>> listenersList = new ArrayList<ModelListener<DetalleRepuestaEvaluacion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DetalleRepuestaEvaluacion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DetalleRepuestaEvaluacionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DETALLEREPUESTAEVALUACION = "SELECT detalleRepuestaEvaluacion FROM DetalleRepuestaEvaluacion detalleRepuestaEvaluacion";
	private static final String _SQL_COUNT_DETALLEREPUESTAEVALUACION = "SELECT COUNT(detalleRepuestaEvaluacion) FROM DetalleRepuestaEvaluacion detalleRepuestaEvaluacion";
	private static final String _ORDER_BY_ENTITY_ALIAS = "detalleRepuestaEvaluacion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DetalleRepuestaEvaluacion exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DetalleRepuestaEvaluacionPersistenceImpl.class);
	private static DetalleRepuestaEvaluacion _nullDetalleRepuestaEvaluacion = new DetalleRepuestaEvaluacionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DetalleRepuestaEvaluacion> toCacheModel() {
				return _nullDetalleRepuestaEvaluacionCacheModel;
			}
		};

	private static CacheModel<DetalleRepuestaEvaluacion> _nullDetalleRepuestaEvaluacionCacheModel =
		new CacheModel<DetalleRepuestaEvaluacion>() {
			@Override
			public DetalleRepuestaEvaluacion toEntityModel() {
				return _nullDetalleRepuestaEvaluacion;
			}
		};
}
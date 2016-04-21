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

import com.rec.hitss.layer.NoSuchSolicitudEvaluacionDesempenoException;
import com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno;
import com.rec.hitss.layer.model.impl.SolicitudEvaluacionDesempenoImpl;
import com.rec.hitss.layer.model.impl.SolicitudEvaluacionDesempenoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the solicitud evaluacion desempeno service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see SolicitudEvaluacionDesempenoPersistence
 * @see SolicitudEvaluacionDesempenoUtil
 * @generated
 */
public class SolicitudEvaluacionDesempenoPersistenceImpl
	extends BasePersistenceImpl<SolicitudEvaluacionDesempeno>
	implements SolicitudEvaluacionDesempenoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SolicitudEvaluacionDesempenoUtil} to access the solicitud evaluacion desempeno persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SolicitudEvaluacionDesempenoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SolicitudEvaluacionDesempenoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudEvaluacionDesempenoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudEvaluacionDesempenoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SolicitudEvaluacionDesempenoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudEvaluacionDesempenoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudEvaluacionDesempenoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SolicitudEvaluacionDesempenoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudEvaluacionDesempenoModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public SolicitudEvaluacionDesempenoPersistenceImpl() {
		setModelClass(SolicitudEvaluacionDesempeno.class);
	}

	/**
	 * Caches the solicitud evaluacion desempeno in the entity cache if it is enabled.
	 *
	 * @param solicitudEvaluacionDesempeno the solicitud evaluacion desempeno
	 */
	@Override
	public void cacheResult(
		SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno) {
		EntityCacheUtil.putResult(SolicitudEvaluacionDesempenoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudEvaluacionDesempenoImpl.class,
			solicitudEvaluacionDesempeno.getPrimaryKey(),
			solicitudEvaluacionDesempeno);

		solicitudEvaluacionDesempeno.resetOriginalValues();
	}

	/**
	 * Caches the solicitud evaluacion desempenos in the entity cache if it is enabled.
	 *
	 * @param solicitudEvaluacionDesempenos the solicitud evaluacion desempenos
	 */
	@Override
	public void cacheResult(
		List<SolicitudEvaluacionDesempeno> solicitudEvaluacionDesempenos) {
		for (SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno : solicitudEvaluacionDesempenos) {
			if (EntityCacheUtil.getResult(
						SolicitudEvaluacionDesempenoModelImpl.ENTITY_CACHE_ENABLED,
						SolicitudEvaluacionDesempenoImpl.class,
						solicitudEvaluacionDesempeno.getPrimaryKey()) == null) {
				cacheResult(solicitudEvaluacionDesempeno);
			}
			else {
				solicitudEvaluacionDesempeno.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all solicitud evaluacion desempenos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SolicitudEvaluacionDesempenoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SolicitudEvaluacionDesempenoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the solicitud evaluacion desempeno.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno) {
		EntityCacheUtil.removeResult(SolicitudEvaluacionDesempenoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudEvaluacionDesempenoImpl.class,
			solicitudEvaluacionDesempeno.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<SolicitudEvaluacionDesempeno> solicitudEvaluacionDesempenos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno : solicitudEvaluacionDesempenos) {
			EntityCacheUtil.removeResult(SolicitudEvaluacionDesempenoModelImpl.ENTITY_CACHE_ENABLED,
				SolicitudEvaluacionDesempenoImpl.class,
				solicitudEvaluacionDesempeno.getPrimaryKey());
		}
	}

	/**
	 * Creates a new solicitud evaluacion desempeno with the primary key. Does not add the solicitud evaluacion desempeno to the database.
	 *
	 * @param solicitudEvaluacionDesempenoId the primary key for the new solicitud evaluacion desempeno
	 * @return the new solicitud evaluacion desempeno
	 */
	@Override
	public SolicitudEvaluacionDesempeno create(
		long solicitudEvaluacionDesempenoId) {
		SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno = new SolicitudEvaluacionDesempenoImpl();

		solicitudEvaluacionDesempeno.setNew(true);
		solicitudEvaluacionDesempeno.setPrimaryKey(solicitudEvaluacionDesempenoId);

		return solicitudEvaluacionDesempeno;
	}

	/**
	 * Removes the solicitud evaluacion desempeno with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param solicitudEvaluacionDesempenoId the primary key of the solicitud evaluacion desempeno
	 * @return the solicitud evaluacion desempeno that was removed
	 * @throws com.rec.hitss.layer.NoSuchSolicitudEvaluacionDesempenoException if a solicitud evaluacion desempeno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudEvaluacionDesempeno remove(
		long solicitudEvaluacionDesempenoId)
		throws NoSuchSolicitudEvaluacionDesempenoException, SystemException {
		return remove((Serializable)solicitudEvaluacionDesempenoId);
	}

	/**
	 * Removes the solicitud evaluacion desempeno with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the solicitud evaluacion desempeno
	 * @return the solicitud evaluacion desempeno that was removed
	 * @throws com.rec.hitss.layer.NoSuchSolicitudEvaluacionDesempenoException if a solicitud evaluacion desempeno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudEvaluacionDesempeno remove(Serializable primaryKey)
		throws NoSuchSolicitudEvaluacionDesempenoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno = (SolicitudEvaluacionDesempeno)session.get(SolicitudEvaluacionDesempenoImpl.class,
					primaryKey);

			if (solicitudEvaluacionDesempeno == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSolicitudEvaluacionDesempenoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(solicitudEvaluacionDesempeno);
		}
		catch (NoSuchSolicitudEvaluacionDesempenoException nsee) {
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
	protected SolicitudEvaluacionDesempeno removeImpl(
		SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno)
		throws SystemException {
		solicitudEvaluacionDesempeno = toUnwrappedModel(solicitudEvaluacionDesempeno);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(solicitudEvaluacionDesempeno)) {
				solicitudEvaluacionDesempeno = (SolicitudEvaluacionDesempeno)session.get(SolicitudEvaluacionDesempenoImpl.class,
						solicitudEvaluacionDesempeno.getPrimaryKeyObj());
			}

			if (solicitudEvaluacionDesempeno != null) {
				session.delete(solicitudEvaluacionDesempeno);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (solicitudEvaluacionDesempeno != null) {
			clearCache(solicitudEvaluacionDesempeno);
		}

		return solicitudEvaluacionDesempeno;
	}

	@Override
	public SolicitudEvaluacionDesempeno updateImpl(
		com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno)
		throws SystemException {
		solicitudEvaluacionDesempeno = toUnwrappedModel(solicitudEvaluacionDesempeno);

		boolean isNew = solicitudEvaluacionDesempeno.isNew();

		Session session = null;

		try {
			session = openSession();

			if (solicitudEvaluacionDesempeno.isNew()) {
				session.save(solicitudEvaluacionDesempeno);

				solicitudEvaluacionDesempeno.setNew(false);
			}
			else {
				session.merge(solicitudEvaluacionDesempeno);
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

		EntityCacheUtil.putResult(SolicitudEvaluacionDesempenoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudEvaluacionDesempenoImpl.class,
			solicitudEvaluacionDesempeno.getPrimaryKey(),
			solicitudEvaluacionDesempeno);

		return solicitudEvaluacionDesempeno;
	}

	protected SolicitudEvaluacionDesempeno toUnwrappedModel(
		SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno) {
		if (solicitudEvaluacionDesempeno instanceof SolicitudEvaluacionDesempenoImpl) {
			return solicitudEvaluacionDesempeno;
		}

		SolicitudEvaluacionDesempenoImpl solicitudEvaluacionDesempenoImpl = new SolicitudEvaluacionDesempenoImpl();

		solicitudEvaluacionDesempenoImpl.setNew(solicitudEvaluacionDesempeno.isNew());
		solicitudEvaluacionDesempenoImpl.setPrimaryKey(solicitudEvaluacionDesempeno.getPrimaryKey());

		solicitudEvaluacionDesempenoImpl.setSolicitudEvaluacionDesempenoId(solicitudEvaluacionDesempeno.getSolicitudEvaluacionDesempenoId());
		solicitudEvaluacionDesempenoImpl.setDescripcion(solicitudEvaluacionDesempeno.getDescripcion());
		solicitudEvaluacionDesempenoImpl.setFechaIncioEvaluacion(solicitudEvaluacionDesempeno.getFechaIncioEvaluacion());
		solicitudEvaluacionDesempenoImpl.setEstado(solicitudEvaluacionDesempeno.getEstado());
		solicitudEvaluacionDesempenoImpl.setMotivo(solicitudEvaluacionDesempeno.getMotivo());
		solicitudEvaluacionDesempenoImpl.setObservacion(solicitudEvaluacionDesempeno.getObservacion());
		solicitudEvaluacionDesempenoImpl.setActivo(solicitudEvaluacionDesempeno.isActivo());
		solicitudEvaluacionDesempenoImpl.setUsuariocrea(solicitudEvaluacionDesempeno.getUsuariocrea());
		solicitudEvaluacionDesempenoImpl.setFechacrea(solicitudEvaluacionDesempeno.getFechacrea());
		solicitudEvaluacionDesempenoImpl.setUsuariomodifica(solicitudEvaluacionDesempeno.getUsuariomodifica());
		solicitudEvaluacionDesempenoImpl.setFechacreamodifica(solicitudEvaluacionDesempeno.getFechacreamodifica());

		return solicitudEvaluacionDesempenoImpl;
	}

	/**
	 * Returns the solicitud evaluacion desempeno with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the solicitud evaluacion desempeno
	 * @return the solicitud evaluacion desempeno
	 * @throws com.rec.hitss.layer.NoSuchSolicitudEvaluacionDesempenoException if a solicitud evaluacion desempeno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudEvaluacionDesempeno findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchSolicitudEvaluacionDesempenoException, SystemException {
		SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno = fetchByPrimaryKey(primaryKey);

		if (solicitudEvaluacionDesempeno == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSolicitudEvaluacionDesempenoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return solicitudEvaluacionDesempeno;
	}

	/**
	 * Returns the solicitud evaluacion desempeno with the primary key or throws a {@link com.rec.hitss.layer.NoSuchSolicitudEvaluacionDesempenoException} if it could not be found.
	 *
	 * @param solicitudEvaluacionDesempenoId the primary key of the solicitud evaluacion desempeno
	 * @return the solicitud evaluacion desempeno
	 * @throws com.rec.hitss.layer.NoSuchSolicitudEvaluacionDesempenoException if a solicitud evaluacion desempeno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudEvaluacionDesempeno findByPrimaryKey(
		long solicitudEvaluacionDesempenoId)
		throws NoSuchSolicitudEvaluacionDesempenoException, SystemException {
		return findByPrimaryKey((Serializable)solicitudEvaluacionDesempenoId);
	}

	/**
	 * Returns the solicitud evaluacion desempeno with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the solicitud evaluacion desempeno
	 * @return the solicitud evaluacion desempeno, or <code>null</code> if a solicitud evaluacion desempeno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudEvaluacionDesempeno fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno = (SolicitudEvaluacionDesempeno)EntityCacheUtil.getResult(SolicitudEvaluacionDesempenoModelImpl.ENTITY_CACHE_ENABLED,
				SolicitudEvaluacionDesempenoImpl.class, primaryKey);

		if (solicitudEvaluacionDesempeno == _nullSolicitudEvaluacionDesempeno) {
			return null;
		}

		if (solicitudEvaluacionDesempeno == null) {
			Session session = null;

			try {
				session = openSession();

				solicitudEvaluacionDesempeno = (SolicitudEvaluacionDesempeno)session.get(SolicitudEvaluacionDesempenoImpl.class,
						primaryKey);

				if (solicitudEvaluacionDesempeno != null) {
					cacheResult(solicitudEvaluacionDesempeno);
				}
				else {
					EntityCacheUtil.putResult(SolicitudEvaluacionDesempenoModelImpl.ENTITY_CACHE_ENABLED,
						SolicitudEvaluacionDesempenoImpl.class, primaryKey,
						_nullSolicitudEvaluacionDesempeno);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SolicitudEvaluacionDesempenoModelImpl.ENTITY_CACHE_ENABLED,
					SolicitudEvaluacionDesempenoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return solicitudEvaluacionDesempeno;
	}

	/**
	 * Returns the solicitud evaluacion desempeno with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param solicitudEvaluacionDesempenoId the primary key of the solicitud evaluacion desempeno
	 * @return the solicitud evaluacion desempeno, or <code>null</code> if a solicitud evaluacion desempeno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudEvaluacionDesempeno fetchByPrimaryKey(
		long solicitudEvaluacionDesempenoId) throws SystemException {
		return fetchByPrimaryKey((Serializable)solicitudEvaluacionDesempenoId);
	}

	/**
	 * Returns all the solicitud evaluacion desempenos.
	 *
	 * @return the solicitud evaluacion desempenos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudEvaluacionDesempeno> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud evaluacion desempenos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudEvaluacionDesempenoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of solicitud evaluacion desempenos
	 * @param end the upper bound of the range of solicitud evaluacion desempenos (not inclusive)
	 * @return the range of solicitud evaluacion desempenos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudEvaluacionDesempeno> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud evaluacion desempenos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudEvaluacionDesempenoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of solicitud evaluacion desempenos
	 * @param end the upper bound of the range of solicitud evaluacion desempenos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of solicitud evaluacion desempenos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudEvaluacionDesempeno> findAll(int start, int end,
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

		List<SolicitudEvaluacionDesempeno> list = (List<SolicitudEvaluacionDesempeno>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SOLICITUDEVALUACIONDESEMPENO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SOLICITUDEVALUACIONDESEMPENO;

				if (pagination) {
					sql = sql.concat(SolicitudEvaluacionDesempenoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SolicitudEvaluacionDesempeno>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudEvaluacionDesempeno>(list);
				}
				else {
					list = (List<SolicitudEvaluacionDesempeno>)QueryUtil.list(q,
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
	 * Removes all the solicitud evaluacion desempenos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno : findAll()) {
			remove(solicitudEvaluacionDesempeno);
		}
	}

	/**
	 * Returns the number of solicitud evaluacion desempenos.
	 *
	 * @return the number of solicitud evaluacion desempenos
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

				Query q = session.createQuery(_SQL_COUNT_SOLICITUDEVALUACIONDESEMPENO);

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
	 * Initializes the solicitud evaluacion desempeno persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SolicitudEvaluacionDesempeno>> listenersList = new ArrayList<ModelListener<SolicitudEvaluacionDesempeno>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SolicitudEvaluacionDesempeno>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SolicitudEvaluacionDesempenoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SOLICITUDEVALUACIONDESEMPENO = "SELECT solicitudEvaluacionDesempeno FROM SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno";
	private static final String _SQL_COUNT_SOLICITUDEVALUACIONDESEMPENO = "SELECT COUNT(solicitudEvaluacionDesempeno) FROM SolicitudEvaluacionDesempeno solicitudEvaluacionDesempeno";
	private static final String _ORDER_BY_ENTITY_ALIAS = "solicitudEvaluacionDesempeno.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SolicitudEvaluacionDesempeno exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SolicitudEvaluacionDesempenoPersistenceImpl.class);
	private static SolicitudEvaluacionDesempeno _nullSolicitudEvaluacionDesempeno =
		new SolicitudEvaluacionDesempenoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SolicitudEvaluacionDesempeno> toCacheModel() {
				return _nullSolicitudEvaluacionDesempenoCacheModel;
			}
		};

	private static CacheModel<SolicitudEvaluacionDesempeno> _nullSolicitudEvaluacionDesempenoCacheModel =
		new CacheModel<SolicitudEvaluacionDesempeno>() {
			@Override
			public SolicitudEvaluacionDesempeno toEntityModel() {
				return _nullSolicitudEvaluacionDesempeno;
			}
		};
}
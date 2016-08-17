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

import com.hitss.layer.NoSuchSolicitudEvaluacionDesempennoException;
import com.hitss.layer.model.SolicitudEvaluacionDesempenno;
import com.hitss.layer.model.impl.SolicitudEvaluacionDesempennoImpl;
import com.hitss.layer.model.impl.SolicitudEvaluacionDesempennoModelImpl;

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
 * The persistence implementation for the solicitud evaluacion desempenno service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudEvaluacionDesempennoPersistence
 * @see SolicitudEvaluacionDesempennoUtil
 * @generated
 */
public class SolicitudEvaluacionDesempennoPersistenceImpl
	extends BasePersistenceImpl<SolicitudEvaluacionDesempenno>
	implements SolicitudEvaluacionDesempennoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SolicitudEvaluacionDesempennoUtil} to access the solicitud evaluacion desempenno persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SolicitudEvaluacionDesempennoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SolicitudEvaluacionDesempennoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudEvaluacionDesempennoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudEvaluacionDesempennoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SolicitudEvaluacionDesempennoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudEvaluacionDesempennoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudEvaluacionDesempennoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SolicitudEvaluacionDesempennoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudEvaluacionDesempennoModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public SolicitudEvaluacionDesempennoPersistenceImpl() {
		setModelClass(SolicitudEvaluacionDesempenno.class);
	}

	/**
	 * Caches the solicitud evaluacion desempenno in the entity cache if it is enabled.
	 *
	 * @param solicitudEvaluacionDesempenno the solicitud evaluacion desempenno
	 */
	@Override
	public void cacheResult(
		SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno) {
		EntityCacheUtil.putResult(SolicitudEvaluacionDesempennoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudEvaluacionDesempennoImpl.class,
			solicitudEvaluacionDesempenno.getPrimaryKey(),
			solicitudEvaluacionDesempenno);

		solicitudEvaluacionDesempenno.resetOriginalValues();
	}

	/**
	 * Caches the solicitud evaluacion desempennos in the entity cache if it is enabled.
	 *
	 * @param solicitudEvaluacionDesempennos the solicitud evaluacion desempennos
	 */
	@Override
	public void cacheResult(
		List<SolicitudEvaluacionDesempenno> solicitudEvaluacionDesempennos) {
		for (SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno : solicitudEvaluacionDesempennos) {
			if (EntityCacheUtil.getResult(
						SolicitudEvaluacionDesempennoModelImpl.ENTITY_CACHE_ENABLED,
						SolicitudEvaluacionDesempennoImpl.class,
						solicitudEvaluacionDesempenno.getPrimaryKey()) == null) {
				cacheResult(solicitudEvaluacionDesempenno);
			}
			else {
				solicitudEvaluacionDesempenno.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all solicitud evaluacion desempennos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SolicitudEvaluacionDesempennoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SolicitudEvaluacionDesempennoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the solicitud evaluacion desempenno.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno) {
		EntityCacheUtil.removeResult(SolicitudEvaluacionDesempennoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudEvaluacionDesempennoImpl.class,
			solicitudEvaluacionDesempenno.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<SolicitudEvaluacionDesempenno> solicitudEvaluacionDesempennos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno : solicitudEvaluacionDesempennos) {
			EntityCacheUtil.removeResult(SolicitudEvaluacionDesempennoModelImpl.ENTITY_CACHE_ENABLED,
				SolicitudEvaluacionDesempennoImpl.class,
				solicitudEvaluacionDesempenno.getPrimaryKey());
		}
	}

	/**
	 * Creates a new solicitud evaluacion desempenno with the primary key. Does not add the solicitud evaluacion desempenno to the database.
	 *
	 * @param solicitudEvaluacionDesempennoId the primary key for the new solicitud evaluacion desempenno
	 * @return the new solicitud evaluacion desempenno
	 */
	@Override
	public SolicitudEvaluacionDesempenno create(
		long solicitudEvaluacionDesempennoId) {
		SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno = new SolicitudEvaluacionDesempennoImpl();

		solicitudEvaluacionDesempenno.setNew(true);
		solicitudEvaluacionDesempenno.setPrimaryKey(solicitudEvaluacionDesempennoId);

		return solicitudEvaluacionDesempenno;
	}

	/**
	 * Removes the solicitud evaluacion desempenno with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param solicitudEvaluacionDesempennoId the primary key of the solicitud evaluacion desempenno
	 * @return the solicitud evaluacion desempenno that was removed
	 * @throws com.hitss.layer.NoSuchSolicitudEvaluacionDesempennoException if a solicitud evaluacion desempenno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudEvaluacionDesempenno remove(
		long solicitudEvaluacionDesempennoId)
		throws NoSuchSolicitudEvaluacionDesempennoException, SystemException {
		return remove((Serializable)solicitudEvaluacionDesempennoId);
	}

	/**
	 * Removes the solicitud evaluacion desempenno with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the solicitud evaluacion desempenno
	 * @return the solicitud evaluacion desempenno that was removed
	 * @throws com.hitss.layer.NoSuchSolicitudEvaluacionDesempennoException if a solicitud evaluacion desempenno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudEvaluacionDesempenno remove(Serializable primaryKey)
		throws NoSuchSolicitudEvaluacionDesempennoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno = (SolicitudEvaluacionDesempenno)session.get(SolicitudEvaluacionDesempennoImpl.class,
					primaryKey);

			if (solicitudEvaluacionDesempenno == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSolicitudEvaluacionDesempennoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(solicitudEvaluacionDesempenno);
		}
		catch (NoSuchSolicitudEvaluacionDesempennoException nsee) {
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
	protected SolicitudEvaluacionDesempenno removeImpl(
		SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno)
		throws SystemException {
		solicitudEvaluacionDesempenno = toUnwrappedModel(solicitudEvaluacionDesempenno);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(solicitudEvaluacionDesempenno)) {
				solicitudEvaluacionDesempenno = (SolicitudEvaluacionDesempenno)session.get(SolicitudEvaluacionDesempennoImpl.class,
						solicitudEvaluacionDesempenno.getPrimaryKeyObj());
			}

			if (solicitudEvaluacionDesempenno != null) {
				session.delete(solicitudEvaluacionDesempenno);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (solicitudEvaluacionDesempenno != null) {
			clearCache(solicitudEvaluacionDesempenno);
		}

		return solicitudEvaluacionDesempenno;
	}

	@Override
	public SolicitudEvaluacionDesempenno updateImpl(
		com.hitss.layer.model.SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno)
		throws SystemException {
		solicitudEvaluacionDesempenno = toUnwrappedModel(solicitudEvaluacionDesempenno);

		boolean isNew = solicitudEvaluacionDesempenno.isNew();

		Session session = null;

		try {
			session = openSession();

			if (solicitudEvaluacionDesempenno.isNew()) {
				session.save(solicitudEvaluacionDesempenno);

				solicitudEvaluacionDesempenno.setNew(false);
			}
			else {
				session.merge(solicitudEvaluacionDesempenno);
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

		EntityCacheUtil.putResult(SolicitudEvaluacionDesempennoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudEvaluacionDesempennoImpl.class,
			solicitudEvaluacionDesempenno.getPrimaryKey(),
			solicitudEvaluacionDesempenno);

		return solicitudEvaluacionDesempenno;
	}

	protected SolicitudEvaluacionDesempenno toUnwrappedModel(
		SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno) {
		if (solicitudEvaluacionDesempenno instanceof SolicitudEvaluacionDesempennoImpl) {
			return solicitudEvaluacionDesempenno;
		}

		SolicitudEvaluacionDesempennoImpl solicitudEvaluacionDesempennoImpl = new SolicitudEvaluacionDesempennoImpl();

		solicitudEvaluacionDesempennoImpl.setNew(solicitudEvaluacionDesempenno.isNew());
		solicitudEvaluacionDesempennoImpl.setPrimaryKey(solicitudEvaluacionDesempenno.getPrimaryKey());

		solicitudEvaluacionDesempennoImpl.setSolicitudEvaluacionDesempennoId(solicitudEvaluacionDesempenno.getSolicitudEvaluacionDesempennoId());
		solicitudEvaluacionDesempennoImpl.setDescripcion(solicitudEvaluacionDesempenno.getDescripcion());
		solicitudEvaluacionDesempennoImpl.setFechaInicio(solicitudEvaluacionDesempenno.getFechaInicio());
		solicitudEvaluacionDesempennoImpl.setEstado(solicitudEvaluacionDesempenno.getEstado());
		solicitudEvaluacionDesempennoImpl.setActivo(solicitudEvaluacionDesempenno.isActivo());
		solicitudEvaluacionDesempennoImpl.setUsuariocrea(solicitudEvaluacionDesempenno.getUsuariocrea());
		solicitudEvaluacionDesempennoImpl.setFechacrea(solicitudEvaluacionDesempenno.getFechacrea());
		solicitudEvaluacionDesempennoImpl.setUsuariomodifica(solicitudEvaluacionDesempenno.getUsuariomodifica());
		solicitudEvaluacionDesempennoImpl.setFechamodifica(solicitudEvaluacionDesempenno.getFechamodifica());

		return solicitudEvaluacionDesempennoImpl;
	}

	/**
	 * Returns the solicitud evaluacion desempenno with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the solicitud evaluacion desempenno
	 * @return the solicitud evaluacion desempenno
	 * @throws com.hitss.layer.NoSuchSolicitudEvaluacionDesempennoException if a solicitud evaluacion desempenno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudEvaluacionDesempenno findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchSolicitudEvaluacionDesempennoException, SystemException {
		SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno = fetchByPrimaryKey(primaryKey);

		if (solicitudEvaluacionDesempenno == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSolicitudEvaluacionDesempennoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return solicitudEvaluacionDesempenno;
	}

	/**
	 * Returns the solicitud evaluacion desempenno with the primary key or throws a {@link com.hitss.layer.NoSuchSolicitudEvaluacionDesempennoException} if it could not be found.
	 *
	 * @param solicitudEvaluacionDesempennoId the primary key of the solicitud evaluacion desempenno
	 * @return the solicitud evaluacion desempenno
	 * @throws com.hitss.layer.NoSuchSolicitudEvaluacionDesempennoException if a solicitud evaluacion desempenno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudEvaluacionDesempenno findByPrimaryKey(
		long solicitudEvaluacionDesempennoId)
		throws NoSuchSolicitudEvaluacionDesempennoException, SystemException {
		return findByPrimaryKey((Serializable)solicitudEvaluacionDesempennoId);
	}

	/**
	 * Returns the solicitud evaluacion desempenno with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the solicitud evaluacion desempenno
	 * @return the solicitud evaluacion desempenno, or <code>null</code> if a solicitud evaluacion desempenno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudEvaluacionDesempenno fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno = (SolicitudEvaluacionDesempenno)EntityCacheUtil.getResult(SolicitudEvaluacionDesempennoModelImpl.ENTITY_CACHE_ENABLED,
				SolicitudEvaluacionDesempennoImpl.class, primaryKey);

		if (solicitudEvaluacionDesempenno == _nullSolicitudEvaluacionDesempenno) {
			return null;
		}

		if (solicitudEvaluacionDesempenno == null) {
			Session session = null;

			try {
				session = openSession();

				solicitudEvaluacionDesempenno = (SolicitudEvaluacionDesempenno)session.get(SolicitudEvaluacionDesempennoImpl.class,
						primaryKey);

				if (solicitudEvaluacionDesempenno != null) {
					cacheResult(solicitudEvaluacionDesempenno);
				}
				else {
					EntityCacheUtil.putResult(SolicitudEvaluacionDesempennoModelImpl.ENTITY_CACHE_ENABLED,
						SolicitudEvaluacionDesempennoImpl.class, primaryKey,
						_nullSolicitudEvaluacionDesempenno);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SolicitudEvaluacionDesempennoModelImpl.ENTITY_CACHE_ENABLED,
					SolicitudEvaluacionDesempennoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return solicitudEvaluacionDesempenno;
	}

	/**
	 * Returns the solicitud evaluacion desempenno with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param solicitudEvaluacionDesempennoId the primary key of the solicitud evaluacion desempenno
	 * @return the solicitud evaluacion desempenno, or <code>null</code> if a solicitud evaluacion desempenno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudEvaluacionDesempenno fetchByPrimaryKey(
		long solicitudEvaluacionDesempennoId) throws SystemException {
		return fetchByPrimaryKey((Serializable)solicitudEvaluacionDesempennoId);
	}

	/**
	 * Returns all the solicitud evaluacion desempennos.
	 *
	 * @return the solicitud evaluacion desempennos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudEvaluacionDesempenno> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud evaluacion desempennos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudEvaluacionDesempennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of solicitud evaluacion desempennos
	 * @param end the upper bound of the range of solicitud evaluacion desempennos (not inclusive)
	 * @return the range of solicitud evaluacion desempennos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudEvaluacionDesempenno> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud evaluacion desempennos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudEvaluacionDesempennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of solicitud evaluacion desempennos
	 * @param end the upper bound of the range of solicitud evaluacion desempennos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of solicitud evaluacion desempennos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudEvaluacionDesempenno> findAll(int start, int end,
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

		List<SolicitudEvaluacionDesempenno> list = (List<SolicitudEvaluacionDesempenno>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SOLICITUDEVALUACIONDESEMPENNO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SOLICITUDEVALUACIONDESEMPENNO;

				if (pagination) {
					sql = sql.concat(SolicitudEvaluacionDesempennoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SolicitudEvaluacionDesempenno>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudEvaluacionDesempenno>(list);
				}
				else {
					list = (List<SolicitudEvaluacionDesempenno>)QueryUtil.list(q,
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
	 * Removes all the solicitud evaluacion desempennos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno : findAll()) {
			remove(solicitudEvaluacionDesempenno);
		}
	}

	/**
	 * Returns the number of solicitud evaluacion desempennos.
	 *
	 * @return the number of solicitud evaluacion desempennos
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

				Query q = session.createQuery(_SQL_COUNT_SOLICITUDEVALUACIONDESEMPENNO);

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
	 * Initializes the solicitud evaluacion desempenno persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.SolicitudEvaluacionDesempenno")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SolicitudEvaluacionDesempenno>> listenersList =
					new ArrayList<ModelListener<SolicitudEvaluacionDesempenno>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SolicitudEvaluacionDesempenno>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SolicitudEvaluacionDesempennoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SOLICITUDEVALUACIONDESEMPENNO = "SELECT solicitudEvaluacionDesempenno FROM SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno";
	private static final String _SQL_COUNT_SOLICITUDEVALUACIONDESEMPENNO = "SELECT COUNT(solicitudEvaluacionDesempenno) FROM SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno";
	private static final String _ORDER_BY_ENTITY_ALIAS = "solicitudEvaluacionDesempenno.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SolicitudEvaluacionDesempenno exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SolicitudEvaluacionDesempennoPersistenceImpl.class);
	private static SolicitudEvaluacionDesempenno _nullSolicitudEvaluacionDesempenno =
		new SolicitudEvaluacionDesempennoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SolicitudEvaluacionDesempenno> toCacheModel() {
				return _nullSolicitudEvaluacionDesempennoCacheModel;
			}
		};

	private static CacheModel<SolicitudEvaluacionDesempenno> _nullSolicitudEvaluacionDesempennoCacheModel =
		new CacheModel<SolicitudEvaluacionDesempenno>() {
			@Override
			public SolicitudEvaluacionDesempenno toEntityModel() {
				return _nullSolicitudEvaluacionDesempenno;
			}
		};
}
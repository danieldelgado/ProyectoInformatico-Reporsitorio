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

import com.rec.hitss.layer.NoSuchSolicitudRequerimientoPersonalException;
import com.rec.hitss.layer.model.SolicitudRequerimientoPersonal;
import com.rec.hitss.layer.model.impl.SolicitudRequerimientoPersonalImpl;
import com.rec.hitss.layer.model.impl.SolicitudRequerimientoPersonalModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the solicitud requerimiento personal service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see SolicitudRequerimientoPersonalPersistence
 * @see SolicitudRequerimientoPersonalUtil
 * @generated
 */
public class SolicitudRequerimientoPersonalPersistenceImpl
	extends BasePersistenceImpl<SolicitudRequerimientoPersonal>
	implements SolicitudRequerimientoPersonalPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SolicitudRequerimientoPersonalUtil} to access the solicitud requerimiento personal persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SolicitudRequerimientoPersonalImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SolicitudRequerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoPersonalModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoPersonalImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SolicitudRequerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoPersonalModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoPersonalImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SolicitudRequerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoPersonalModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public SolicitudRequerimientoPersonalPersistenceImpl() {
		setModelClass(SolicitudRequerimientoPersonal.class);
	}

	/**
	 * Caches the solicitud requerimiento personal in the entity cache if it is enabled.
	 *
	 * @param solicitudRequerimientoPersonal the solicitud requerimiento personal
	 */
	@Override
	public void cacheResult(
		SolicitudRequerimientoPersonal solicitudRequerimientoPersonal) {
		EntityCacheUtil.putResult(SolicitudRequerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoPersonalImpl.class,
			solicitudRequerimientoPersonal.getPrimaryKey(),
			solicitudRequerimientoPersonal);

		solicitudRequerimientoPersonal.resetOriginalValues();
	}

	/**
	 * Caches the solicitud requerimiento personals in the entity cache if it is enabled.
	 *
	 * @param solicitudRequerimientoPersonals the solicitud requerimiento personals
	 */
	@Override
	public void cacheResult(
		List<SolicitudRequerimientoPersonal> solicitudRequerimientoPersonals) {
		for (SolicitudRequerimientoPersonal solicitudRequerimientoPersonal : solicitudRequerimientoPersonals) {
			if (EntityCacheUtil.getResult(
						SolicitudRequerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
						SolicitudRequerimientoPersonalImpl.class,
						solicitudRequerimientoPersonal.getPrimaryKey()) == null) {
				cacheResult(solicitudRequerimientoPersonal);
			}
			else {
				solicitudRequerimientoPersonal.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all solicitud requerimiento personals.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SolicitudRequerimientoPersonalImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SolicitudRequerimientoPersonalImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the solicitud requerimiento personal.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SolicitudRequerimientoPersonal solicitudRequerimientoPersonal) {
		EntityCacheUtil.removeResult(SolicitudRequerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoPersonalImpl.class,
			solicitudRequerimientoPersonal.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<SolicitudRequerimientoPersonal> solicitudRequerimientoPersonals) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SolicitudRequerimientoPersonal solicitudRequerimientoPersonal : solicitudRequerimientoPersonals) {
			EntityCacheUtil.removeResult(SolicitudRequerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
				SolicitudRequerimientoPersonalImpl.class,
				solicitudRequerimientoPersonal.getPrimaryKey());
		}
	}

	/**
	 * Creates a new solicitud requerimiento personal with the primary key. Does not add the solicitud requerimiento personal to the database.
	 *
	 * @param solicitudRequerimientoPersonalId the primary key for the new solicitud requerimiento personal
	 * @return the new solicitud requerimiento personal
	 */
	@Override
	public SolicitudRequerimientoPersonal create(
		long solicitudRequerimientoPersonalId) {
		SolicitudRequerimientoPersonal solicitudRequerimientoPersonal = new SolicitudRequerimientoPersonalImpl();

		solicitudRequerimientoPersonal.setNew(true);
		solicitudRequerimientoPersonal.setPrimaryKey(solicitudRequerimientoPersonalId);

		return solicitudRequerimientoPersonal;
	}

	/**
	 * Removes the solicitud requerimiento personal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param solicitudRequerimientoPersonalId the primary key of the solicitud requerimiento personal
	 * @return the solicitud requerimiento personal that was removed
	 * @throws com.rec.hitss.layer.NoSuchSolicitudRequerimientoPersonalException if a solicitud requerimiento personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoPersonal remove(
		long solicitudRequerimientoPersonalId)
		throws NoSuchSolicitudRequerimientoPersonalException, SystemException {
		return remove((Serializable)solicitudRequerimientoPersonalId);
	}

	/**
	 * Removes the solicitud requerimiento personal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the solicitud requerimiento personal
	 * @return the solicitud requerimiento personal that was removed
	 * @throws com.rec.hitss.layer.NoSuchSolicitudRequerimientoPersonalException if a solicitud requerimiento personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoPersonal remove(Serializable primaryKey)
		throws NoSuchSolicitudRequerimientoPersonalException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SolicitudRequerimientoPersonal solicitudRequerimientoPersonal = (SolicitudRequerimientoPersonal)session.get(SolicitudRequerimientoPersonalImpl.class,
					primaryKey);

			if (solicitudRequerimientoPersonal == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSolicitudRequerimientoPersonalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(solicitudRequerimientoPersonal);
		}
		catch (NoSuchSolicitudRequerimientoPersonalException nsee) {
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
	protected SolicitudRequerimientoPersonal removeImpl(
		SolicitudRequerimientoPersonal solicitudRequerimientoPersonal)
		throws SystemException {
		solicitudRequerimientoPersonal = toUnwrappedModel(solicitudRequerimientoPersonal);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(solicitudRequerimientoPersonal)) {
				solicitudRequerimientoPersonal = (SolicitudRequerimientoPersonal)session.get(SolicitudRequerimientoPersonalImpl.class,
						solicitudRequerimientoPersonal.getPrimaryKeyObj());
			}

			if (solicitudRequerimientoPersonal != null) {
				session.delete(solicitudRequerimientoPersonal);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (solicitudRequerimientoPersonal != null) {
			clearCache(solicitudRequerimientoPersonal);
		}

		return solicitudRequerimientoPersonal;
	}

	@Override
	public SolicitudRequerimientoPersonal updateImpl(
		com.rec.hitss.layer.model.SolicitudRequerimientoPersonal solicitudRequerimientoPersonal)
		throws SystemException {
		solicitudRequerimientoPersonal = toUnwrappedModel(solicitudRequerimientoPersonal);

		boolean isNew = solicitudRequerimientoPersonal.isNew();

		Session session = null;

		try {
			session = openSession();

			if (solicitudRequerimientoPersonal.isNew()) {
				session.save(solicitudRequerimientoPersonal);

				solicitudRequerimientoPersonal.setNew(false);
			}
			else {
				session.merge(solicitudRequerimientoPersonal);
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

		EntityCacheUtil.putResult(SolicitudRequerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoPersonalImpl.class,
			solicitudRequerimientoPersonal.getPrimaryKey(),
			solicitudRequerimientoPersonal);

		return solicitudRequerimientoPersonal;
	}

	protected SolicitudRequerimientoPersonal toUnwrappedModel(
		SolicitudRequerimientoPersonal solicitudRequerimientoPersonal) {
		if (solicitudRequerimientoPersonal instanceof SolicitudRequerimientoPersonalImpl) {
			return solicitudRequerimientoPersonal;
		}

		SolicitudRequerimientoPersonalImpl solicitudRequerimientoPersonalImpl = new SolicitudRequerimientoPersonalImpl();

		solicitudRequerimientoPersonalImpl.setNew(solicitudRequerimientoPersonal.isNew());
		solicitudRequerimientoPersonalImpl.setPrimaryKey(solicitudRequerimientoPersonal.getPrimaryKey());

		solicitudRequerimientoPersonalImpl.setSolicitudRequerimientoPersonalId(solicitudRequerimientoPersonal.getSolicitudRequerimientoPersonalId());
		solicitudRequerimientoPersonalImpl.setEstado(solicitudRequerimientoPersonal.getEstado());
		solicitudRequerimientoPersonalImpl.setPuesto(solicitudRequerimientoPersonal.getPuesto());
		solicitudRequerimientoPersonalImpl.setAreaSolicitante(solicitudRequerimientoPersonal.getAreaSolicitante());
		solicitudRequerimientoPersonalImpl.setCantidadRecursos(solicitudRequerimientoPersonal.getCantidadRecursos());
		solicitudRequerimientoPersonalImpl.setFechaLimite(solicitudRequerimientoPersonal.getFechaLimite());
		solicitudRequerimientoPersonalImpl.setCargo(solicitudRequerimientoPersonal.getCargo());
		solicitudRequerimientoPersonalImpl.setTiempoContrato(solicitudRequerimientoPersonal.getTiempoContrato());
		solicitudRequerimientoPersonalImpl.setTipoNegocio(solicitudRequerimientoPersonal.getTipoNegocio());
		solicitudRequerimientoPersonalImpl.setPresupuestoMaximo(solicitudRequerimientoPersonal.getPresupuestoMaximo());
		solicitudRequerimientoPersonalImpl.setPresupuestoMinimo(solicitudRequerimientoPersonal.getPresupuestoMinimo());
		solicitudRequerimientoPersonalImpl.setCliente(solicitudRequerimientoPersonal.getCliente());
		solicitudRequerimientoPersonalImpl.setActivo(solicitudRequerimientoPersonal.isActivo());
		solicitudRequerimientoPersonalImpl.setUsuariocrea(solicitudRequerimientoPersonal.getUsuariocrea());
		solicitudRequerimientoPersonalImpl.setFechacrea(solicitudRequerimientoPersonal.getFechacrea());
		solicitudRequerimientoPersonalImpl.setUsuariomodifica(solicitudRequerimientoPersonal.getUsuariomodifica());
		solicitudRequerimientoPersonalImpl.setFechacreamodifica(solicitudRequerimientoPersonal.getFechacreamodifica());

		return solicitudRequerimientoPersonalImpl;
	}

	/**
	 * Returns the solicitud requerimiento personal with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the solicitud requerimiento personal
	 * @return the solicitud requerimiento personal
	 * @throws com.rec.hitss.layer.NoSuchSolicitudRequerimientoPersonalException if a solicitud requerimiento personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoPersonal findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchSolicitudRequerimientoPersonalException, SystemException {
		SolicitudRequerimientoPersonal solicitudRequerimientoPersonal = fetchByPrimaryKey(primaryKey);

		if (solicitudRequerimientoPersonal == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSolicitudRequerimientoPersonalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return solicitudRequerimientoPersonal;
	}

	/**
	 * Returns the solicitud requerimiento personal with the primary key or throws a {@link com.rec.hitss.layer.NoSuchSolicitudRequerimientoPersonalException} if it could not be found.
	 *
	 * @param solicitudRequerimientoPersonalId the primary key of the solicitud requerimiento personal
	 * @return the solicitud requerimiento personal
	 * @throws com.rec.hitss.layer.NoSuchSolicitudRequerimientoPersonalException if a solicitud requerimiento personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoPersonal findByPrimaryKey(
		long solicitudRequerimientoPersonalId)
		throws NoSuchSolicitudRequerimientoPersonalException, SystemException {
		return findByPrimaryKey((Serializable)solicitudRequerimientoPersonalId);
	}

	/**
	 * Returns the solicitud requerimiento personal with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the solicitud requerimiento personal
	 * @return the solicitud requerimiento personal, or <code>null</code> if a solicitud requerimiento personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoPersonal fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		SolicitudRequerimientoPersonal solicitudRequerimientoPersonal = (SolicitudRequerimientoPersonal)EntityCacheUtil.getResult(SolicitudRequerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
				SolicitudRequerimientoPersonalImpl.class, primaryKey);

		if (solicitudRequerimientoPersonal == _nullSolicitudRequerimientoPersonal) {
			return null;
		}

		if (solicitudRequerimientoPersonal == null) {
			Session session = null;

			try {
				session = openSession();

				solicitudRequerimientoPersonal = (SolicitudRequerimientoPersonal)session.get(SolicitudRequerimientoPersonalImpl.class,
						primaryKey);

				if (solicitudRequerimientoPersonal != null) {
					cacheResult(solicitudRequerimientoPersonal);
				}
				else {
					EntityCacheUtil.putResult(SolicitudRequerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
						SolicitudRequerimientoPersonalImpl.class, primaryKey,
						_nullSolicitudRequerimientoPersonal);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SolicitudRequerimientoPersonalModelImpl.ENTITY_CACHE_ENABLED,
					SolicitudRequerimientoPersonalImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return solicitudRequerimientoPersonal;
	}

	/**
	 * Returns the solicitud requerimiento personal with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param solicitudRequerimientoPersonalId the primary key of the solicitud requerimiento personal
	 * @return the solicitud requerimiento personal, or <code>null</code> if a solicitud requerimiento personal with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoPersonal fetchByPrimaryKey(
		long solicitudRequerimientoPersonalId) throws SystemException {
		return fetchByPrimaryKey((Serializable)solicitudRequerimientoPersonalId);
	}

	/**
	 * Returns all the solicitud requerimiento personals.
	 *
	 * @return the solicitud requerimiento personals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoPersonal> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud requerimiento personals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of solicitud requerimiento personals
	 * @param end the upper bound of the range of solicitud requerimiento personals (not inclusive)
	 * @return the range of solicitud requerimiento personals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoPersonal> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud requerimiento personals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.SolicitudRequerimientoPersonalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of solicitud requerimiento personals
	 * @param end the upper bound of the range of solicitud requerimiento personals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of solicitud requerimiento personals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoPersonal> findAll(int start, int end,
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

		List<SolicitudRequerimientoPersonal> list = (List<SolicitudRequerimientoPersonal>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOPERSONAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SOLICITUDREQUERIMIENTOPERSONAL;

				if (pagination) {
					sql = sql.concat(SolicitudRequerimientoPersonalModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SolicitudRequerimientoPersonal>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudRequerimientoPersonal>(list);
				}
				else {
					list = (List<SolicitudRequerimientoPersonal>)QueryUtil.list(q,
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
	 * Removes all the solicitud requerimiento personals from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SolicitudRequerimientoPersonal solicitudRequerimientoPersonal : findAll()) {
			remove(solicitudRequerimientoPersonal);
		}
	}

	/**
	 * Returns the number of solicitud requerimiento personals.
	 *
	 * @return the number of solicitud requerimiento personals
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

				Query q = session.createQuery(_SQL_COUNT_SOLICITUDREQUERIMIENTOPERSONAL);

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
	 * Initializes the solicitud requerimiento personal persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.SolicitudRequerimientoPersonal")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SolicitudRequerimientoPersonal>> listenersList =
					new ArrayList<ModelListener<SolicitudRequerimientoPersonal>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SolicitudRequerimientoPersonal>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SolicitudRequerimientoPersonalImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SOLICITUDREQUERIMIENTOPERSONAL = "SELECT solicitudRequerimientoPersonal FROM SolicitudRequerimientoPersonal solicitudRequerimientoPersonal";
	private static final String _SQL_COUNT_SOLICITUDREQUERIMIENTOPERSONAL = "SELECT COUNT(solicitudRequerimientoPersonal) FROM SolicitudRequerimientoPersonal solicitudRequerimientoPersonal";
	private static final String _ORDER_BY_ENTITY_ALIAS = "solicitudRequerimientoPersonal.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SolicitudRequerimientoPersonal exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SolicitudRequerimientoPersonalPersistenceImpl.class);
	private static SolicitudRequerimientoPersonal _nullSolicitudRequerimientoPersonal =
		new SolicitudRequerimientoPersonalImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SolicitudRequerimientoPersonal> toCacheModel() {
				return _nullSolicitudRequerimientoPersonalCacheModel;
			}
		};

	private static CacheModel<SolicitudRequerimientoPersonal> _nullSolicitudRequerimientoPersonalCacheModel =
		new CacheModel<SolicitudRequerimientoPersonal>() {
			@Override
			public SolicitudRequerimientoPersonal toEntityModel() {
				return _nullSolicitudRequerimientoPersonal;
			}
		};
}
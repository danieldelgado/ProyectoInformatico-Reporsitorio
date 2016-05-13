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

import com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException;
import com.hitss.layer.model.SolicitudRequerimientoRequisito;
import com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoImpl;
import com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl;

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
 * The persistence implementation for the solicitud requerimiento requisito service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoRequisitoPersistence
 * @see SolicitudRequerimientoRequisitoUtil
 * @generated
 */
public class SolicitudRequerimientoRequisitoPersistenceImpl
	extends BasePersistenceImpl<SolicitudRequerimientoRequisito>
	implements SolicitudRequerimientoRequisitoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SolicitudRequerimientoRequisitoUtil} to access the solicitud requerimiento requisito persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SolicitudRequerimientoRequisitoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public SolicitudRequerimientoRequisitoPersistenceImpl() {
		setModelClass(SolicitudRequerimientoRequisito.class);
	}

	/**
	 * Caches the solicitud requerimiento requisito in the entity cache if it is enabled.
	 *
	 * @param solicitudRequerimientoRequisito the solicitud requerimiento requisito
	 */
	@Override
	public void cacheResult(
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito) {
		EntityCacheUtil.putResult(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			solicitudRequerimientoRequisito.getPrimaryKey(),
			solicitudRequerimientoRequisito);

		solicitudRequerimientoRequisito.resetOriginalValues();
	}

	/**
	 * Caches the solicitud requerimiento requisitos in the entity cache if it is enabled.
	 *
	 * @param solicitudRequerimientoRequisitos the solicitud requerimiento requisitos
	 */
	@Override
	public void cacheResult(
		List<SolicitudRequerimientoRequisito> solicitudRequerimientoRequisitos) {
		for (SolicitudRequerimientoRequisito solicitudRequerimientoRequisito : solicitudRequerimientoRequisitos) {
			if (EntityCacheUtil.getResult(
						SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
						SolicitudRequerimientoRequisitoImpl.class,
						solicitudRequerimientoRequisito.getPrimaryKey()) == null) {
				cacheResult(solicitudRequerimientoRequisito);
			}
			else {
				solicitudRequerimientoRequisito.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all solicitud requerimiento requisitos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SolicitudRequerimientoRequisitoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SolicitudRequerimientoRequisitoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the solicitud requerimiento requisito.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito) {
		EntityCacheUtil.removeResult(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			solicitudRequerimientoRequisito.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<SolicitudRequerimientoRequisito> solicitudRequerimientoRequisitos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SolicitudRequerimientoRequisito solicitudRequerimientoRequisito : solicitudRequerimientoRequisitos) {
			EntityCacheUtil.removeResult(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
				SolicitudRequerimientoRequisitoImpl.class,
				solicitudRequerimientoRequisito.getPrimaryKey());
		}
	}

	/**
	 * Creates a new solicitud requerimiento requisito with the primary key. Does not add the solicitud requerimiento requisito to the database.
	 *
	 * @param solicitudRequerimientoRequisitoPK the primary key for the new solicitud requerimiento requisito
	 * @return the new solicitud requerimiento requisito
	 */
	@Override
	public SolicitudRequerimientoRequisito create(
		SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK) {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = new SolicitudRequerimientoRequisitoImpl();

		solicitudRequerimientoRequisito.setNew(true);
		solicitudRequerimientoRequisito.setPrimaryKey(solicitudRequerimientoRequisitoPK);

		return solicitudRequerimientoRequisito;
	}

	/**
	 * Removes the solicitud requerimiento requisito with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param solicitudRequerimientoRequisitoPK the primary key of the solicitud requerimiento requisito
	 * @return the solicitud requerimiento requisito that was removed
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito remove(
		SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		return remove((Serializable)solicitudRequerimientoRequisitoPK);
	}

	/**
	 * Removes the solicitud requerimiento requisito with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the solicitud requerimiento requisito
	 * @return the solicitud requerimiento requisito that was removed
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito remove(Serializable primaryKey)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = (SolicitudRequerimientoRequisito)session.get(SolicitudRequerimientoRequisitoImpl.class,
					primaryKey);

			if (solicitudRequerimientoRequisito == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSolicitudRequerimientoRequisitoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(solicitudRequerimientoRequisito);
		}
		catch (NoSuchSolicitudRequerimientoRequisitoException nsee) {
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
	protected SolicitudRequerimientoRequisito removeImpl(
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito)
		throws SystemException {
		solicitudRequerimientoRequisito = toUnwrappedModel(solicitudRequerimientoRequisito);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(solicitudRequerimientoRequisito)) {
				solicitudRequerimientoRequisito = (SolicitudRequerimientoRequisito)session.get(SolicitudRequerimientoRequisitoImpl.class,
						solicitudRequerimientoRequisito.getPrimaryKeyObj());
			}

			if (solicitudRequerimientoRequisito != null) {
				session.delete(solicitudRequerimientoRequisito);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (solicitudRequerimientoRequisito != null) {
			clearCache(solicitudRequerimientoRequisito);
		}

		return solicitudRequerimientoRequisito;
	}

	@Override
	public SolicitudRequerimientoRequisito updateImpl(
		com.hitss.layer.model.SolicitudRequerimientoRequisito solicitudRequerimientoRequisito)
		throws SystemException {
		solicitudRequerimientoRequisito = toUnwrappedModel(solicitudRequerimientoRequisito);

		boolean isNew = solicitudRequerimientoRequisito.isNew();

		Session session = null;

		try {
			session = openSession();

			if (solicitudRequerimientoRequisito.isNew()) {
				session.save(solicitudRequerimientoRequisito);

				solicitudRequerimientoRequisito.setNew(false);
			}
			else {
				session.merge(solicitudRequerimientoRequisito);
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

		EntityCacheUtil.putResult(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
			SolicitudRequerimientoRequisitoImpl.class,
			solicitudRequerimientoRequisito.getPrimaryKey(),
			solicitudRequerimientoRequisito);

		return solicitudRequerimientoRequisito;
	}

	protected SolicitudRequerimientoRequisito toUnwrappedModel(
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito) {
		if (solicitudRequerimientoRequisito instanceof SolicitudRequerimientoRequisitoImpl) {
			return solicitudRequerimientoRequisito;
		}

		SolicitudRequerimientoRequisitoImpl solicitudRequerimientoRequisitoImpl = new SolicitudRequerimientoRequisitoImpl();

		solicitudRequerimientoRequisitoImpl.setNew(solicitudRequerimientoRequisito.isNew());
		solicitudRequerimientoRequisitoImpl.setPrimaryKey(solicitudRequerimientoRequisito.getPrimaryKey());

		solicitudRequerimientoRequisitoImpl.setSolicitudRequerimientoId(solicitudRequerimientoRequisito.getSolicitudRequerimientoId());
		solicitudRequerimientoRequisitoImpl.setTagId(solicitudRequerimientoRequisito.getTagId());
		solicitudRequerimientoRequisitoImpl.setNivel(solicitudRequerimientoRequisito.getNivel());
		solicitudRequerimientoRequisitoImpl.setExigible(solicitudRequerimientoRequisito.isExigible());
		solicitudRequerimientoRequisitoImpl.setTipoRequisito(solicitudRequerimientoRequisito.getTipoRequisito());
		solicitudRequerimientoRequisitoImpl.setHerramienta(solicitudRequerimientoRequisito.getHerramienta());
		solicitudRequerimientoRequisitoImpl.setActivo(solicitudRequerimientoRequisito.isActivo());
		solicitudRequerimientoRequisitoImpl.setUsuariocrea(solicitudRequerimientoRequisito.getUsuariocrea());
		solicitudRequerimientoRequisitoImpl.setFechacrea(solicitudRequerimientoRequisito.getFechacrea());
		solicitudRequerimientoRequisitoImpl.setUsuariomodifica(solicitudRequerimientoRequisito.getUsuariomodifica());
		solicitudRequerimientoRequisitoImpl.setFechacreamodifica(solicitudRequerimientoRequisito.getFechacreamodifica());

		return solicitudRequerimientoRequisitoImpl;
	}

	/**
	 * Returns the solicitud requerimiento requisito with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the solicitud requerimiento requisito
	 * @return the solicitud requerimiento requisito
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = fetchByPrimaryKey(primaryKey);

		if (solicitudRequerimientoRequisito == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSolicitudRequerimientoRequisitoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return solicitudRequerimientoRequisito;
	}

	/**
	 * Returns the solicitud requerimiento requisito with the primary key or throws a {@link com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException} if it could not be found.
	 *
	 * @param solicitudRequerimientoRequisitoPK the primary key of the solicitud requerimiento requisito
	 * @return the solicitud requerimiento requisito
	 * @throws com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException if a solicitud requerimiento requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito findByPrimaryKey(
		SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK)
		throws NoSuchSolicitudRequerimientoRequisitoException, SystemException {
		return findByPrimaryKey((Serializable)solicitudRequerimientoRequisitoPK);
	}

	/**
	 * Returns the solicitud requerimiento requisito with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the solicitud requerimiento requisito
	 * @return the solicitud requerimiento requisito, or <code>null</code> if a solicitud requerimiento requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		SolicitudRequerimientoRequisito solicitudRequerimientoRequisito = (SolicitudRequerimientoRequisito)EntityCacheUtil.getResult(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
				SolicitudRequerimientoRequisitoImpl.class, primaryKey);

		if (solicitudRequerimientoRequisito == _nullSolicitudRequerimientoRequisito) {
			return null;
		}

		if (solicitudRequerimientoRequisito == null) {
			Session session = null;

			try {
				session = openSession();

				solicitudRequerimientoRequisito = (SolicitudRequerimientoRequisito)session.get(SolicitudRequerimientoRequisitoImpl.class,
						primaryKey);

				if (solicitudRequerimientoRequisito != null) {
					cacheResult(solicitudRequerimientoRequisito);
				}
				else {
					EntityCacheUtil.putResult(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
						SolicitudRequerimientoRequisitoImpl.class, primaryKey,
						_nullSolicitudRequerimientoRequisito);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SolicitudRequerimientoRequisitoModelImpl.ENTITY_CACHE_ENABLED,
					SolicitudRequerimientoRequisitoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return solicitudRequerimientoRequisito;
	}

	/**
	 * Returns the solicitud requerimiento requisito with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param solicitudRequerimientoRequisitoPK the primary key of the solicitud requerimiento requisito
	 * @return the solicitud requerimiento requisito, or <code>null</code> if a solicitud requerimiento requisito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SolicitudRequerimientoRequisito fetchByPrimaryKey(
		SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)solicitudRequerimientoRequisitoPK);
	}

	/**
	 * Returns all the solicitud requerimiento requisitos.
	 *
	 * @return the solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the solicitud requerimiento requisitos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of solicitud requerimiento requisitos
	 * @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	 * @return the range of solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the solicitud requerimiento requisitos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of solicitud requerimiento requisitos
	 * @param end the upper bound of the range of solicitud requerimiento requisitos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of solicitud requerimiento requisitos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SolicitudRequerimientoRequisito> findAll(int start, int end,
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

		List<SolicitudRequerimientoRequisito> list = (List<SolicitudRequerimientoRequisito>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SOLICITUDREQUERIMIENTOREQUISITO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SOLICITUDREQUERIMIENTOREQUISITO;

				if (pagination) {
					sql = sql.concat(SolicitudRequerimientoRequisitoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SolicitudRequerimientoRequisito>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SolicitudRequerimientoRequisito>(list);
				}
				else {
					list = (List<SolicitudRequerimientoRequisito>)QueryUtil.list(q,
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
	 * Removes all the solicitud requerimiento requisitos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SolicitudRequerimientoRequisito solicitudRequerimientoRequisito : findAll()) {
			remove(solicitudRequerimientoRequisito);
		}
	}

	/**
	 * Returns the number of solicitud requerimiento requisitos.
	 *
	 * @return the number of solicitud requerimiento requisitos
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

				Query q = session.createQuery(_SQL_COUNT_SOLICITUDREQUERIMIENTOREQUISITO);

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
	 * Initializes the solicitud requerimiento requisito persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.SolicitudRequerimientoRequisito")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SolicitudRequerimientoRequisito>> listenersList =
					new ArrayList<ModelListener<SolicitudRequerimientoRequisito>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SolicitudRequerimientoRequisito>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SolicitudRequerimientoRequisitoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SOLICITUDREQUERIMIENTOREQUISITO = "SELECT solicitudRequerimientoRequisito FROM SolicitudRequerimientoRequisito solicitudRequerimientoRequisito";
	private static final String _SQL_COUNT_SOLICITUDREQUERIMIENTOREQUISITO = "SELECT COUNT(solicitudRequerimientoRequisito) FROM SolicitudRequerimientoRequisito solicitudRequerimientoRequisito";
	private static final String _ORDER_BY_ENTITY_ALIAS = "solicitudRequerimientoRequisito.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SolicitudRequerimientoRequisito exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SolicitudRequerimientoRequisitoPersistenceImpl.class);
	private static SolicitudRequerimientoRequisito _nullSolicitudRequerimientoRequisito =
		new SolicitudRequerimientoRequisitoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SolicitudRequerimientoRequisito> toCacheModel() {
				return _nullSolicitudRequerimientoRequisitoCacheModel;
			}
		};

	private static CacheModel<SolicitudRequerimientoRequisito> _nullSolicitudRequerimientoRequisitoCacheModel =
		new CacheModel<SolicitudRequerimientoRequisito>() {
			@Override
			public SolicitudRequerimientoRequisito toEntityModel() {
				return _nullSolicitudRequerimientoRequisito;
			}
		};
}
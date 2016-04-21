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
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.rec.hitss.layer.NoSuchRequerimientoRecursoException;
import com.rec.hitss.layer.model.RequerimientoRecurso;
import com.rec.hitss.layer.model.impl.RequerimientoRecursoImpl;
import com.rec.hitss.layer.model.impl.RequerimientoRecursoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the requerimiento recurso service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see RequerimientoRecursoPersistence
 * @see RequerimientoRecursoUtil
 * @generated
 */
public class RequerimientoRecursoPersistenceImpl extends BasePersistenceImpl<RequerimientoRecurso>
	implements RequerimientoRecursoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RequerimientoRecursoUtil} to access the requerimiento recurso persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RequerimientoRecursoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RequerimientoRecursoModelImpl.ENTITY_CACHE_ENABLED,
			RequerimientoRecursoModelImpl.FINDER_CACHE_ENABLED,
			RequerimientoRecursoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RequerimientoRecursoModelImpl.ENTITY_CACHE_ENABLED,
			RequerimientoRecursoModelImpl.FINDER_CACHE_ENABLED,
			RequerimientoRecursoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RequerimientoRecursoModelImpl.ENTITY_CACHE_ENABLED,
			RequerimientoRecursoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_REQUERIMIENTOUNIQUE = new FinderPath(RequerimientoRecursoModelImpl.ENTITY_CACHE_ENABLED,
			RequerimientoRecursoModelImpl.FINDER_CACHE_ENABLED,
			RequerimientoRecursoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRequerimientoUnique",
			new String[] { Long.class.getName() },
			RequerimientoRecursoModelImpl.SOLICITUDREQUERIMIENTOPERSONALID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUERIMIENTOUNIQUE = new FinderPath(RequerimientoRecursoModelImpl.ENTITY_CACHE_ENABLED,
			RequerimientoRecursoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRequerimientoUnique", new String[] { Long.class.getName() });

	/**
	 * Returns the requerimiento recurso where solicitudRequerimientoPersonalId = &#63; or throws a {@link com.rec.hitss.layer.NoSuchRequerimientoRecursoException} if it could not be found.
	 *
	 * @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID
	 * @return the matching requerimiento recurso
	 * @throws com.rec.hitss.layer.NoSuchRequerimientoRecursoException if a matching requerimiento recurso could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequerimientoRecurso findByRequerimientoUnique(
		long solicitudRequerimientoPersonalId)
		throws NoSuchRequerimientoRecursoException, SystemException {
		RequerimientoRecurso requerimientoRecurso = fetchByRequerimientoUnique(solicitudRequerimientoPersonalId);

		if (requerimientoRecurso == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("solicitudRequerimientoPersonalId=");
			msg.append(solicitudRequerimientoPersonalId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchRequerimientoRecursoException(msg.toString());
		}

		return requerimientoRecurso;
	}

	/**
	 * Returns the requerimiento recurso where solicitudRequerimientoPersonalId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID
	 * @return the matching requerimiento recurso, or <code>null</code> if a matching requerimiento recurso could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequerimientoRecurso fetchByRequerimientoUnique(
		long solicitudRequerimientoPersonalId) throws SystemException {
		return fetchByRequerimientoUnique(solicitudRequerimientoPersonalId, true);
	}

	/**
	 * Returns the requerimiento recurso where solicitudRequerimientoPersonalId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching requerimiento recurso, or <code>null</code> if a matching requerimiento recurso could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequerimientoRecurso fetchByRequerimientoUnique(
		long solicitudRequerimientoPersonalId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { solicitudRequerimientoPersonalId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REQUERIMIENTOUNIQUE,
					finderArgs, this);
		}

		if (result instanceof RequerimientoRecurso) {
			RequerimientoRecurso requerimientoRecurso = (RequerimientoRecurso)result;

			if ((solicitudRequerimientoPersonalId != requerimientoRecurso.getSolicitudRequerimientoPersonalId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_REQUERIMIENTORECURSO_WHERE);

			query.append(_FINDER_COLUMN_REQUERIMIENTOUNIQUE_SOLICITUDREQUERIMIENTOPERSONALID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoPersonalId);

				List<RequerimientoRecurso> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUERIMIENTOUNIQUE,
						finderArgs, list);
				}
				else {
					RequerimientoRecurso requerimientoRecurso = list.get(0);

					result = requerimientoRecurso;

					cacheResult(requerimientoRecurso);

					if ((requerimientoRecurso.getSolicitudRequerimientoPersonalId() != solicitudRequerimientoPersonalId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUERIMIENTOUNIQUE,
							finderArgs, requerimientoRecurso);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUERIMIENTOUNIQUE,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (RequerimientoRecurso)result;
		}
	}

	/**
	 * Removes the requerimiento recurso where solicitudRequerimientoPersonalId = &#63; from the database.
	 *
	 * @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID
	 * @return the requerimiento recurso that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequerimientoRecurso removeByRequerimientoUnique(
		long solicitudRequerimientoPersonalId)
		throws NoSuchRequerimientoRecursoException, SystemException {
		RequerimientoRecurso requerimientoRecurso = findByRequerimientoUnique(solicitudRequerimientoPersonalId);

		return remove(requerimientoRecurso);
	}

	/**
	 * Returns the number of requerimiento recursos where solicitudRequerimientoPersonalId = &#63;.
	 *
	 * @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID
	 * @return the number of matching requerimiento recursos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRequerimientoUnique(long solicitudRequerimientoPersonalId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REQUERIMIENTOUNIQUE;

		Object[] finderArgs = new Object[] { solicitudRequerimientoPersonalId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REQUERIMIENTORECURSO_WHERE);

			query.append(_FINDER_COLUMN_REQUERIMIENTOUNIQUE_SOLICITUDREQUERIMIENTOPERSONALID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoPersonalId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_REQUERIMIENTOUNIQUE_SOLICITUDREQUERIMIENTOPERSONALID_2 =
		"requerimientoRecurso.solicitudRequerimientoPersonalId = ?";

	public RequerimientoRecursoPersistenceImpl() {
		setModelClass(RequerimientoRecurso.class);
	}

	/**
	 * Caches the requerimiento recurso in the entity cache if it is enabled.
	 *
	 * @param requerimientoRecurso the requerimiento recurso
	 */
	@Override
	public void cacheResult(RequerimientoRecurso requerimientoRecurso) {
		EntityCacheUtil.putResult(RequerimientoRecursoModelImpl.ENTITY_CACHE_ENABLED,
			RequerimientoRecursoImpl.class,
			requerimientoRecurso.getPrimaryKey(), requerimientoRecurso);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUERIMIENTOUNIQUE,
			new Object[] {
				requerimientoRecurso.getSolicitudRequerimientoPersonalId()
			}, requerimientoRecurso);

		requerimientoRecurso.resetOriginalValues();
	}

	/**
	 * Caches the requerimiento recursos in the entity cache if it is enabled.
	 *
	 * @param requerimientoRecursos the requerimiento recursos
	 */
	@Override
	public void cacheResult(List<RequerimientoRecurso> requerimientoRecursos) {
		for (RequerimientoRecurso requerimientoRecurso : requerimientoRecursos) {
			if (EntityCacheUtil.getResult(
						RequerimientoRecursoModelImpl.ENTITY_CACHE_ENABLED,
						RequerimientoRecursoImpl.class,
						requerimientoRecurso.getPrimaryKey()) == null) {
				cacheResult(requerimientoRecurso);
			}
			else {
				requerimientoRecurso.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all requerimiento recursos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RequerimientoRecursoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RequerimientoRecursoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the requerimiento recurso.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RequerimientoRecurso requerimientoRecurso) {
		EntityCacheUtil.removeResult(RequerimientoRecursoModelImpl.ENTITY_CACHE_ENABLED,
			RequerimientoRecursoImpl.class, requerimientoRecurso.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(requerimientoRecurso);
	}

	@Override
	public void clearCache(List<RequerimientoRecurso> requerimientoRecursos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RequerimientoRecurso requerimientoRecurso : requerimientoRecursos) {
			EntityCacheUtil.removeResult(RequerimientoRecursoModelImpl.ENTITY_CACHE_ENABLED,
				RequerimientoRecursoImpl.class,
				requerimientoRecurso.getPrimaryKey());

			clearUniqueFindersCache(requerimientoRecurso);
		}
	}

	protected void cacheUniqueFindersCache(
		RequerimientoRecurso requerimientoRecurso) {
		if (requerimientoRecurso.isNew()) {
			Object[] args = new Object[] {
					requerimientoRecurso.getSolicitudRequerimientoPersonalId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REQUERIMIENTOUNIQUE,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUERIMIENTOUNIQUE,
				args, requerimientoRecurso);
		}
		else {
			RequerimientoRecursoModelImpl requerimientoRecursoModelImpl = (RequerimientoRecursoModelImpl)requerimientoRecurso;

			if ((requerimientoRecursoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REQUERIMIENTOUNIQUE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						requerimientoRecurso.getSolicitudRequerimientoPersonalId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REQUERIMIENTOUNIQUE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUERIMIENTOUNIQUE,
					args, requerimientoRecurso);
			}
		}
	}

	protected void clearUniqueFindersCache(
		RequerimientoRecurso requerimientoRecurso) {
		RequerimientoRecursoModelImpl requerimientoRecursoModelImpl = (RequerimientoRecursoModelImpl)requerimientoRecurso;

		Object[] args = new Object[] {
				requerimientoRecurso.getSolicitudRequerimientoPersonalId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUERIMIENTOUNIQUE,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUERIMIENTOUNIQUE,
			args);

		if ((requerimientoRecursoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REQUERIMIENTOUNIQUE.getColumnBitmask()) != 0) {
			args = new Object[] {
					requerimientoRecursoModelImpl.getOriginalSolicitudRequerimientoPersonalId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUERIMIENTOUNIQUE,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUERIMIENTOUNIQUE,
				args);
		}
	}

	/**
	 * Creates a new requerimiento recurso with the primary key. Does not add the requerimiento recurso to the database.
	 *
	 * @param requerimientoRecursoId the primary key for the new requerimiento recurso
	 * @return the new requerimiento recurso
	 */
	@Override
	public RequerimientoRecurso create(long requerimientoRecursoId) {
		RequerimientoRecurso requerimientoRecurso = new RequerimientoRecursoImpl();

		requerimientoRecurso.setNew(true);
		requerimientoRecurso.setPrimaryKey(requerimientoRecursoId);

		return requerimientoRecurso;
	}

	/**
	 * Removes the requerimiento recurso with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requerimientoRecursoId the primary key of the requerimiento recurso
	 * @return the requerimiento recurso that was removed
	 * @throws com.rec.hitss.layer.NoSuchRequerimientoRecursoException if a requerimiento recurso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequerimientoRecurso remove(long requerimientoRecursoId)
		throws NoSuchRequerimientoRecursoException, SystemException {
		return remove((Serializable)requerimientoRecursoId);
	}

	/**
	 * Removes the requerimiento recurso with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the requerimiento recurso
	 * @return the requerimiento recurso that was removed
	 * @throws com.rec.hitss.layer.NoSuchRequerimientoRecursoException if a requerimiento recurso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequerimientoRecurso remove(Serializable primaryKey)
		throws NoSuchRequerimientoRecursoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			RequerimientoRecurso requerimientoRecurso = (RequerimientoRecurso)session.get(RequerimientoRecursoImpl.class,
					primaryKey);

			if (requerimientoRecurso == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRequerimientoRecursoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(requerimientoRecurso);
		}
		catch (NoSuchRequerimientoRecursoException nsee) {
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
	protected RequerimientoRecurso removeImpl(
		RequerimientoRecurso requerimientoRecurso) throws SystemException {
		requerimientoRecurso = toUnwrappedModel(requerimientoRecurso);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(requerimientoRecurso)) {
				requerimientoRecurso = (RequerimientoRecurso)session.get(RequerimientoRecursoImpl.class,
						requerimientoRecurso.getPrimaryKeyObj());
			}

			if (requerimientoRecurso != null) {
				session.delete(requerimientoRecurso);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (requerimientoRecurso != null) {
			clearCache(requerimientoRecurso);
		}

		return requerimientoRecurso;
	}

	@Override
	public RequerimientoRecurso updateImpl(
		com.rec.hitss.layer.model.RequerimientoRecurso requerimientoRecurso)
		throws SystemException {
		requerimientoRecurso = toUnwrappedModel(requerimientoRecurso);

		boolean isNew = requerimientoRecurso.isNew();

		Session session = null;

		try {
			session = openSession();

			if (requerimientoRecurso.isNew()) {
				session.save(requerimientoRecurso);

				requerimientoRecurso.setNew(false);
			}
			else {
				session.merge(requerimientoRecurso);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !RequerimientoRecursoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(RequerimientoRecursoModelImpl.ENTITY_CACHE_ENABLED,
			RequerimientoRecursoImpl.class,
			requerimientoRecurso.getPrimaryKey(), requerimientoRecurso);

		clearUniqueFindersCache(requerimientoRecurso);
		cacheUniqueFindersCache(requerimientoRecurso);

		return requerimientoRecurso;
	}

	protected RequerimientoRecurso toUnwrappedModel(
		RequerimientoRecurso requerimientoRecurso) {
		if (requerimientoRecurso instanceof RequerimientoRecursoImpl) {
			return requerimientoRecurso;
		}

		RequerimientoRecursoImpl requerimientoRecursoImpl = new RequerimientoRecursoImpl();

		requerimientoRecursoImpl.setNew(requerimientoRecurso.isNew());
		requerimientoRecursoImpl.setPrimaryKey(requerimientoRecurso.getPrimaryKey());

		requerimientoRecursoImpl.setRequerimientoRecursoId(requerimientoRecurso.getRequerimientoRecursoId());
		requerimientoRecursoImpl.setEspecialidad(requerimientoRecurso.getEspecialidad());
		requerimientoRecursoImpl.setMeta(requerimientoRecurso.getMeta());
		requerimientoRecursoImpl.setPrioridad(requerimientoRecurso.getPrioridad());
		requerimientoRecursoImpl.setMotivo(requerimientoRecurso.getMotivo());
		requerimientoRecursoImpl.setFechaSolicitada(requerimientoRecurso.getFechaSolicitada());
		requerimientoRecursoImpl.setFechaMetaIngreso(requerimientoRecurso.getFechaMetaIngreso());
		requerimientoRecursoImpl.setEstado(requerimientoRecurso.getEstado());
		requerimientoRecursoImpl.setModalidad(requerimientoRecurso.getModalidad());
		requerimientoRecursoImpl.setLugarTrabajo(requerimientoRecurso.getLugarTrabajo());
		requerimientoRecursoImpl.setObservacion(requerimientoRecurso.getObservacion());
		requerimientoRecursoImpl.setProyecto(requerimientoRecurso.getProyecto());
		requerimientoRecursoImpl.setRequiereequipotenico(requerimientoRecurso.isRequiereequipotenico());
		requerimientoRecursoImpl.setReemplazo(requerimientoRecurso.isReemplazo());
		requerimientoRecursoImpl.setRevisado(requerimientoRecurso.isRevisado());
		requerimientoRecursoImpl.setAprobadoFichaIngresoCapitalHumano(requerimientoRecurso.isAprobadoFichaIngresoCapitalHumano());
		requerimientoRecursoImpl.setObservacionFichaIngresoCapitalHumano(requerimientoRecurso.getObservacionFichaIngresoCapitalHumano());
		requerimientoRecursoImpl.setAprobadoFichaIngresoOperaciones(requerimientoRecurso.isAprobadoFichaIngresoOperaciones());
		requerimientoRecursoImpl.setObservacionFichaIngresoOperaciones(requerimientoRecurso.getObservacionFichaIngresoOperaciones());
		requerimientoRecursoImpl.setTipoReclutamiento(requerimientoRecurso.getTipoReclutamiento());
		requerimientoRecursoImpl.setSolicitudRequerimientoPersonalId(requerimientoRecurso.getSolicitudRequerimientoPersonalId());
		requerimientoRecursoImpl.setActivo(requerimientoRecurso.isActivo());
		requerimientoRecursoImpl.setUsuariocrea(requerimientoRecurso.getUsuariocrea());
		requerimientoRecursoImpl.setFechacrea(requerimientoRecurso.getFechacrea());
		requerimientoRecursoImpl.setUsuariomodifica(requerimientoRecurso.getUsuariomodifica());
		requerimientoRecursoImpl.setFechacreamodifica(requerimientoRecurso.getFechacreamodifica());

		return requerimientoRecursoImpl;
	}

	/**
	 * Returns the requerimiento recurso with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the requerimiento recurso
	 * @return the requerimiento recurso
	 * @throws com.rec.hitss.layer.NoSuchRequerimientoRecursoException if a requerimiento recurso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequerimientoRecurso findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRequerimientoRecursoException, SystemException {
		RequerimientoRecurso requerimientoRecurso = fetchByPrimaryKey(primaryKey);

		if (requerimientoRecurso == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRequerimientoRecursoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return requerimientoRecurso;
	}

	/**
	 * Returns the requerimiento recurso with the primary key or throws a {@link com.rec.hitss.layer.NoSuchRequerimientoRecursoException} if it could not be found.
	 *
	 * @param requerimientoRecursoId the primary key of the requerimiento recurso
	 * @return the requerimiento recurso
	 * @throws com.rec.hitss.layer.NoSuchRequerimientoRecursoException if a requerimiento recurso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequerimientoRecurso findByPrimaryKey(long requerimientoRecursoId)
		throws NoSuchRequerimientoRecursoException, SystemException {
		return findByPrimaryKey((Serializable)requerimientoRecursoId);
	}

	/**
	 * Returns the requerimiento recurso with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the requerimiento recurso
	 * @return the requerimiento recurso, or <code>null</code> if a requerimiento recurso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequerimientoRecurso fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		RequerimientoRecurso requerimientoRecurso = (RequerimientoRecurso)EntityCacheUtil.getResult(RequerimientoRecursoModelImpl.ENTITY_CACHE_ENABLED,
				RequerimientoRecursoImpl.class, primaryKey);

		if (requerimientoRecurso == _nullRequerimientoRecurso) {
			return null;
		}

		if (requerimientoRecurso == null) {
			Session session = null;

			try {
				session = openSession();

				requerimientoRecurso = (RequerimientoRecurso)session.get(RequerimientoRecursoImpl.class,
						primaryKey);

				if (requerimientoRecurso != null) {
					cacheResult(requerimientoRecurso);
				}
				else {
					EntityCacheUtil.putResult(RequerimientoRecursoModelImpl.ENTITY_CACHE_ENABLED,
						RequerimientoRecursoImpl.class, primaryKey,
						_nullRequerimientoRecurso);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(RequerimientoRecursoModelImpl.ENTITY_CACHE_ENABLED,
					RequerimientoRecursoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return requerimientoRecurso;
	}

	/**
	 * Returns the requerimiento recurso with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param requerimientoRecursoId the primary key of the requerimiento recurso
	 * @return the requerimiento recurso, or <code>null</code> if a requerimiento recurso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequerimientoRecurso fetchByPrimaryKey(long requerimientoRecursoId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)requerimientoRecursoId);
	}

	/**
	 * Returns all the requerimiento recursos.
	 *
	 * @return the requerimiento recursos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RequerimientoRecurso> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the requerimiento recursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.RequerimientoRecursoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of requerimiento recursos
	 * @param end the upper bound of the range of requerimiento recursos (not inclusive)
	 * @return the range of requerimiento recursos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RequerimientoRecurso> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the requerimiento recursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.RequerimientoRecursoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of requerimiento recursos
	 * @param end the upper bound of the range of requerimiento recursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of requerimiento recursos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RequerimientoRecurso> findAll(int start, int end,
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

		List<RequerimientoRecurso> list = (List<RequerimientoRecurso>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_REQUERIMIENTORECURSO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REQUERIMIENTORECURSO;

				if (pagination) {
					sql = sql.concat(RequerimientoRecursoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RequerimientoRecurso>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RequerimientoRecurso>(list);
				}
				else {
					list = (List<RequerimientoRecurso>)QueryUtil.list(q,
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
	 * Removes all the requerimiento recursos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (RequerimientoRecurso requerimientoRecurso : findAll()) {
			remove(requerimientoRecurso);
		}
	}

	/**
	 * Returns the number of requerimiento recursos.
	 *
	 * @return the number of requerimiento recursos
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

				Query q = session.createQuery(_SQL_COUNT_REQUERIMIENTORECURSO);

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
	 * Initializes the requerimiento recurso persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.RequerimientoRecurso")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<RequerimientoRecurso>> listenersList = new ArrayList<ModelListener<RequerimientoRecurso>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<RequerimientoRecurso>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RequerimientoRecursoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_REQUERIMIENTORECURSO = "SELECT requerimientoRecurso FROM RequerimientoRecurso requerimientoRecurso";
	private static final String _SQL_SELECT_REQUERIMIENTORECURSO_WHERE = "SELECT requerimientoRecurso FROM RequerimientoRecurso requerimientoRecurso WHERE ";
	private static final String _SQL_COUNT_REQUERIMIENTORECURSO = "SELECT COUNT(requerimientoRecurso) FROM RequerimientoRecurso requerimientoRecurso";
	private static final String _SQL_COUNT_REQUERIMIENTORECURSO_WHERE = "SELECT COUNT(requerimientoRecurso) FROM RequerimientoRecurso requerimientoRecurso WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "requerimientoRecurso.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RequerimientoRecurso exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RequerimientoRecurso exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RequerimientoRecursoPersistenceImpl.class);
	private static RequerimientoRecurso _nullRequerimientoRecurso = new RequerimientoRecursoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<RequerimientoRecurso> toCacheModel() {
				return _nullRequerimientoRecursoCacheModel;
			}
		};

	private static CacheModel<RequerimientoRecurso> _nullRequerimientoRecursoCacheModel =
		new CacheModel<RequerimientoRecurso>() {
			@Override
			public RequerimientoRecurso toEntityModel() {
				return _nullRequerimientoRecurso;
			}
		};
}
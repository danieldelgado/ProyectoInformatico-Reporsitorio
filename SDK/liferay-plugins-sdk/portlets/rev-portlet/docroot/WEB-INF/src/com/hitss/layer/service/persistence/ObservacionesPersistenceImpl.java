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

import com.hitss.layer.NoSuchObservacionesException;
import com.hitss.layer.model.Observaciones;
import com.hitss.layer.model.impl.ObservacionesImpl;
import com.hitss.layer.model.impl.ObservacionesModelImpl;

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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the observaciones service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see ObservacionesPersistence
 * @see ObservacionesUtil
 * @generated
 */
public class ObservacionesPersistenceImpl extends BasePersistenceImpl<Observaciones>
	implements ObservacionesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ObservacionesUtil} to access the observaciones persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ObservacionesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ObservacionesModelImpl.ENTITY_CACHE_ENABLED,
			ObservacionesModelImpl.FINDER_CACHE_ENABLED,
			ObservacionesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ObservacionesModelImpl.ENTITY_CACHE_ENABLED,
			ObservacionesModelImpl.FINDER_CACHE_ENABLED,
			ObservacionesImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ObservacionesModelImpl.ENTITY_CACHE_ENABLED,
			ObservacionesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_R_T = new FinderPath(ObservacionesModelImpl.ENTITY_CACHE_ENABLED,
			ObservacionesModelImpl.FINDER_CACHE_ENABLED,
			ObservacionesImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByR_T",
			new String[] { String.class.getName(), Long.class.getName() },
			ObservacionesModelImpl.TABLA_COLUMN_BITMASK |
			ObservacionesModelImpl.REGISTROID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_R_T = new FinderPath(ObservacionesModelImpl.ENTITY_CACHE_ENABLED,
			ObservacionesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByR_T",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the observaciones where tabla = &#63; and registroId = &#63; or throws a {@link com.hitss.layer.NoSuchObservacionesException} if it could not be found.
	 *
	 * @param tabla the tabla
	 * @param registroId the registro ID
	 * @return the matching observaciones
	 * @throws com.hitss.layer.NoSuchObservacionesException if a matching observaciones could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Observaciones findByR_T(String tabla, long registroId)
		throws NoSuchObservacionesException, SystemException {
		Observaciones observaciones = fetchByR_T(tabla, registroId);

		if (observaciones == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("tabla=");
			msg.append(tabla);

			msg.append(", registroId=");
			msg.append(registroId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchObservacionesException(msg.toString());
		}

		return observaciones;
	}

	/**
	 * Returns the observaciones where tabla = &#63; and registroId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tabla the tabla
	 * @param registroId the registro ID
	 * @return the matching observaciones, or <code>null</code> if a matching observaciones could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Observaciones fetchByR_T(String tabla, long registroId)
		throws SystemException {
		return fetchByR_T(tabla, registroId, true);
	}

	/**
	 * Returns the observaciones where tabla = &#63; and registroId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tabla the tabla
	 * @param registroId the registro ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching observaciones, or <code>null</code> if a matching observaciones could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Observaciones fetchByR_T(String tabla, long registroId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { tabla, registroId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_R_T,
					finderArgs, this);
		}

		if (result instanceof Observaciones) {
			Observaciones observaciones = (Observaciones)result;

			if (!Validator.equals(tabla, observaciones.getTabla()) ||
					(registroId != observaciones.getRegistroId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_OBSERVACIONES_WHERE);

			boolean bindTabla = false;

			if (tabla == null) {
				query.append(_FINDER_COLUMN_R_T_TABLA_1);
			}
			else if (tabla.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_R_T_TABLA_3);
			}
			else {
				bindTabla = true;

				query.append(_FINDER_COLUMN_R_T_TABLA_2);
			}

			query.append(_FINDER_COLUMN_R_T_REGISTROID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTabla) {
					qPos.add(tabla);
				}

				qPos.add(registroId);

				List<Observaciones> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_R_T,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ObservacionesPersistenceImpl.fetchByR_T(String, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Observaciones observaciones = list.get(0);

					result = observaciones;

					cacheResult(observaciones);

					if ((observaciones.getTabla() == null) ||
							!observaciones.getTabla().equals(tabla) ||
							(observaciones.getRegistroId() != registroId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_R_T,
							finderArgs, observaciones);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_R_T,
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
			return (Observaciones)result;
		}
	}

	/**
	 * Removes the observaciones where tabla = &#63; and registroId = &#63; from the database.
	 *
	 * @param tabla the tabla
	 * @param registroId the registro ID
	 * @return the observaciones that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Observaciones removeByR_T(String tabla, long registroId)
		throws NoSuchObservacionesException, SystemException {
		Observaciones observaciones = findByR_T(tabla, registroId);

		return remove(observaciones);
	}

	/**
	 * Returns the number of observacioneses where tabla = &#63; and registroId = &#63;.
	 *
	 * @param tabla the tabla
	 * @param registroId the registro ID
	 * @return the number of matching observacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByR_T(String tabla, long registroId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_R_T;

		Object[] finderArgs = new Object[] { tabla, registroId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_OBSERVACIONES_WHERE);

			boolean bindTabla = false;

			if (tabla == null) {
				query.append(_FINDER_COLUMN_R_T_TABLA_1);
			}
			else if (tabla.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_R_T_TABLA_3);
			}
			else {
				bindTabla = true;

				query.append(_FINDER_COLUMN_R_T_TABLA_2);
			}

			query.append(_FINDER_COLUMN_R_T_REGISTROID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTabla) {
					qPos.add(tabla);
				}

				qPos.add(registroId);

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

	private static final String _FINDER_COLUMN_R_T_TABLA_1 = "observaciones.tabla IS NULL AND ";
	private static final String _FINDER_COLUMN_R_T_TABLA_2 = "observaciones.tabla = ? AND ";
	private static final String _FINDER_COLUMN_R_T_TABLA_3 = "(observaciones.tabla IS NULL OR observaciones.tabla = '') AND ";
	private static final String _FINDER_COLUMN_R_T_REGISTROID_2 = "observaciones.registroId = ? AND observaciones.activo=true";

	public ObservacionesPersistenceImpl() {
		setModelClass(Observaciones.class);
	}

	/**
	 * Caches the observaciones in the entity cache if it is enabled.
	 *
	 * @param observaciones the observaciones
	 */
	@Override
	public void cacheResult(Observaciones observaciones) {
		EntityCacheUtil.putResult(ObservacionesModelImpl.ENTITY_CACHE_ENABLED,
			ObservacionesImpl.class, observaciones.getPrimaryKey(),
			observaciones);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_R_T,
			new Object[] { observaciones.getTabla(), observaciones.getRegistroId() },
			observaciones);

		observaciones.resetOriginalValues();
	}

	/**
	 * Caches the observacioneses in the entity cache if it is enabled.
	 *
	 * @param observacioneses the observacioneses
	 */
	@Override
	public void cacheResult(List<Observaciones> observacioneses) {
		for (Observaciones observaciones : observacioneses) {
			if (EntityCacheUtil.getResult(
						ObservacionesModelImpl.ENTITY_CACHE_ENABLED,
						ObservacionesImpl.class, observaciones.getPrimaryKey()) == null) {
				cacheResult(observaciones);
			}
			else {
				observaciones.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all observacioneses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ObservacionesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ObservacionesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the observaciones.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Observaciones observaciones) {
		EntityCacheUtil.removeResult(ObservacionesModelImpl.ENTITY_CACHE_ENABLED,
			ObservacionesImpl.class, observaciones.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(observaciones);
	}

	@Override
	public void clearCache(List<Observaciones> observacioneses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Observaciones observaciones : observacioneses) {
			EntityCacheUtil.removeResult(ObservacionesModelImpl.ENTITY_CACHE_ENABLED,
				ObservacionesImpl.class, observaciones.getPrimaryKey());

			clearUniqueFindersCache(observaciones);
		}
	}

	protected void cacheUniqueFindersCache(Observaciones observaciones) {
		if (observaciones.isNew()) {
			Object[] args = new Object[] {
					observaciones.getTabla(), observaciones.getRegistroId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_R_T, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_R_T, args,
				observaciones);
		}
		else {
			ObservacionesModelImpl observacionesModelImpl = (ObservacionesModelImpl)observaciones;

			if ((observacionesModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_R_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						observaciones.getTabla(), observaciones.getRegistroId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_R_T, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_R_T, args,
					observaciones);
			}
		}
	}

	protected void clearUniqueFindersCache(Observaciones observaciones) {
		ObservacionesModelImpl observacionesModelImpl = (ObservacionesModelImpl)observaciones;

		Object[] args = new Object[] {
				observaciones.getTabla(), observaciones.getRegistroId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_R_T, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_R_T, args);

		if ((observacionesModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_R_T.getColumnBitmask()) != 0) {
			args = new Object[] {
					observacionesModelImpl.getOriginalTabla(),
					observacionesModelImpl.getOriginalRegistroId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_R_T, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_R_T, args);
		}
	}

	/**
	 * Creates a new observaciones with the primary key. Does not add the observaciones to the database.
	 *
	 * @param observacionId the primary key for the new observaciones
	 * @return the new observaciones
	 */
	@Override
	public Observaciones create(long observacionId) {
		Observaciones observaciones = new ObservacionesImpl();

		observaciones.setNew(true);
		observaciones.setPrimaryKey(observacionId);

		return observaciones;
	}

	/**
	 * Removes the observaciones with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param observacionId the primary key of the observaciones
	 * @return the observaciones that was removed
	 * @throws com.hitss.layer.NoSuchObservacionesException if a observaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Observaciones remove(long observacionId)
		throws NoSuchObservacionesException, SystemException {
		return remove((Serializable)observacionId);
	}

	/**
	 * Removes the observaciones with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the observaciones
	 * @return the observaciones that was removed
	 * @throws com.hitss.layer.NoSuchObservacionesException if a observaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Observaciones remove(Serializable primaryKey)
		throws NoSuchObservacionesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Observaciones observaciones = (Observaciones)session.get(ObservacionesImpl.class,
					primaryKey);

			if (observaciones == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchObservacionesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(observaciones);
		}
		catch (NoSuchObservacionesException nsee) {
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
	protected Observaciones removeImpl(Observaciones observaciones)
		throws SystemException {
		observaciones = toUnwrappedModel(observaciones);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(observaciones)) {
				observaciones = (Observaciones)session.get(ObservacionesImpl.class,
						observaciones.getPrimaryKeyObj());
			}

			if (observaciones != null) {
				session.delete(observaciones);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (observaciones != null) {
			clearCache(observaciones);
		}

		return observaciones;
	}

	@Override
	public Observaciones updateImpl(
		com.hitss.layer.model.Observaciones observaciones)
		throws SystemException {
		observaciones = toUnwrappedModel(observaciones);

		boolean isNew = observaciones.isNew();

		Session session = null;

		try {
			session = openSession();

			if (observaciones.isNew()) {
				session.save(observaciones);

				observaciones.setNew(false);
			}
			else {
				session.merge(observaciones);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ObservacionesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ObservacionesModelImpl.ENTITY_CACHE_ENABLED,
			ObservacionesImpl.class, observaciones.getPrimaryKey(),
			observaciones);

		clearUniqueFindersCache(observaciones);
		cacheUniqueFindersCache(observaciones);

		return observaciones;
	}

	protected Observaciones toUnwrappedModel(Observaciones observaciones) {
		if (observaciones instanceof ObservacionesImpl) {
			return observaciones;
		}

		ObservacionesImpl observacionesImpl = new ObservacionesImpl();

		observacionesImpl.setNew(observaciones.isNew());
		observacionesImpl.setPrimaryKey(observaciones.getPrimaryKey());

		observacionesImpl.setObservacionId(observaciones.getObservacionId());
		observacionesImpl.setDescripcion(observaciones.getDescripcion());
		observacionesImpl.setTabla(observaciones.getTabla());
		observacionesImpl.setRegistroId(observaciones.getRegistroId());
		observacionesImpl.setActivo(observaciones.isActivo());
		observacionesImpl.setUsuariocrea(observaciones.getUsuariocrea());
		observacionesImpl.setFechacrea(observaciones.getFechacrea());
		observacionesImpl.setUsuariomodifica(observaciones.getUsuariomodifica());
		observacionesImpl.setFechamodifica(observaciones.getFechamodifica());

		return observacionesImpl;
	}

	/**
	 * Returns the observaciones with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the observaciones
	 * @return the observaciones
	 * @throws com.hitss.layer.NoSuchObservacionesException if a observaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Observaciones findByPrimaryKey(Serializable primaryKey)
		throws NoSuchObservacionesException, SystemException {
		Observaciones observaciones = fetchByPrimaryKey(primaryKey);

		if (observaciones == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchObservacionesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return observaciones;
	}

	/**
	 * Returns the observaciones with the primary key or throws a {@link com.hitss.layer.NoSuchObservacionesException} if it could not be found.
	 *
	 * @param observacionId the primary key of the observaciones
	 * @return the observaciones
	 * @throws com.hitss.layer.NoSuchObservacionesException if a observaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Observaciones findByPrimaryKey(long observacionId)
		throws NoSuchObservacionesException, SystemException {
		return findByPrimaryKey((Serializable)observacionId);
	}

	/**
	 * Returns the observaciones with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the observaciones
	 * @return the observaciones, or <code>null</code> if a observaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Observaciones fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Observaciones observaciones = (Observaciones)EntityCacheUtil.getResult(ObservacionesModelImpl.ENTITY_CACHE_ENABLED,
				ObservacionesImpl.class, primaryKey);

		if (observaciones == _nullObservaciones) {
			return null;
		}

		if (observaciones == null) {
			Session session = null;

			try {
				session = openSession();

				observaciones = (Observaciones)session.get(ObservacionesImpl.class,
						primaryKey);

				if (observaciones != null) {
					cacheResult(observaciones);
				}
				else {
					EntityCacheUtil.putResult(ObservacionesModelImpl.ENTITY_CACHE_ENABLED,
						ObservacionesImpl.class, primaryKey, _nullObservaciones);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ObservacionesModelImpl.ENTITY_CACHE_ENABLED,
					ObservacionesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return observaciones;
	}

	/**
	 * Returns the observaciones with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param observacionId the primary key of the observaciones
	 * @return the observaciones, or <code>null</code> if a observaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Observaciones fetchByPrimaryKey(long observacionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)observacionId);
	}

	/**
	 * Returns all the observacioneses.
	 *
	 * @return the observacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Observaciones> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the observacioneses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ObservacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of observacioneses
	 * @param end the upper bound of the range of observacioneses (not inclusive)
	 * @return the range of observacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Observaciones> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the observacioneses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ObservacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of observacioneses
	 * @param end the upper bound of the range of observacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of observacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Observaciones> findAll(int start, int end,
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

		List<Observaciones> list = (List<Observaciones>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OBSERVACIONES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OBSERVACIONES;

				if (pagination) {
					sql = sql.concat(ObservacionesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Observaciones>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Observaciones>(list);
				}
				else {
					list = (List<Observaciones>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the observacioneses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Observaciones observaciones : findAll()) {
			remove(observaciones);
		}
	}

	/**
	 * Returns the number of observacioneses.
	 *
	 * @return the number of observacioneses
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

				Query q = session.createQuery(_SQL_COUNT_OBSERVACIONES);

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
	 * Initializes the observaciones persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.Observaciones")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Observaciones>> listenersList = new ArrayList<ModelListener<Observaciones>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Observaciones>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ObservacionesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_OBSERVACIONES = "SELECT observaciones FROM Observaciones observaciones";
	private static final String _SQL_SELECT_OBSERVACIONES_WHERE = "SELECT observaciones FROM Observaciones observaciones WHERE ";
	private static final String _SQL_COUNT_OBSERVACIONES = "SELECT COUNT(observaciones) FROM Observaciones observaciones";
	private static final String _SQL_COUNT_OBSERVACIONES_WHERE = "SELECT COUNT(observaciones) FROM Observaciones observaciones WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "observaciones.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Observaciones exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Observaciones exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ObservacionesPersistenceImpl.class);
	private static Observaciones _nullObservaciones = new ObservacionesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Observaciones> toCacheModel() {
				return _nullObservacionesCacheModel;
			}
		};

	private static CacheModel<Observaciones> _nullObservacionesCacheModel = new CacheModel<Observaciones>() {
			@Override
			public Observaciones toEntityModel() {
				return _nullObservaciones;
			}
		};
}
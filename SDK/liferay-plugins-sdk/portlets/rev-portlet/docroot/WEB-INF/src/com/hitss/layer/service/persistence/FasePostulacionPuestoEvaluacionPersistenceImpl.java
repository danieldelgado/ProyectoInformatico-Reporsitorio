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

import com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException;
import com.hitss.layer.model.FasePostulacionPuestoEvaluacion;
import com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionImpl;
import com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl;

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
 * The persistence implementation for the fase postulacion puesto evaluacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see FasePostulacionPuestoEvaluacionPersistence
 * @see FasePostulacionPuestoEvaluacionUtil
 * @generated
 */
public class FasePostulacionPuestoEvaluacionPersistenceImpl
	extends BasePersistenceImpl<FasePostulacionPuestoEvaluacion>
	implements FasePostulacionPuestoEvaluacionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FasePostulacionPuestoEvaluacionUtil} to access the fase postulacion puesto evaluacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FasePostulacionPuestoEvaluacionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public FasePostulacionPuestoEvaluacionPersistenceImpl() {
		setModelClass(FasePostulacionPuestoEvaluacion.class);
	}

	/**
	 * Caches the fase postulacion puesto evaluacion in the entity cache if it is enabled.
	 *
	 * @param fasePostulacionPuestoEvaluacion the fase postulacion puesto evaluacion
	 */
	@Override
	public void cacheResult(
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion) {
		EntityCacheUtil.putResult(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			fasePostulacionPuestoEvaluacion.getPrimaryKey(),
			fasePostulacionPuestoEvaluacion);

		fasePostulacionPuestoEvaluacion.resetOriginalValues();
	}

	/**
	 * Caches the fase postulacion puesto evaluacions in the entity cache if it is enabled.
	 *
	 * @param fasePostulacionPuestoEvaluacions the fase postulacion puesto evaluacions
	 */
	@Override
	public void cacheResult(
		List<FasePostulacionPuestoEvaluacion> fasePostulacionPuestoEvaluacions) {
		for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : fasePostulacionPuestoEvaluacions) {
			if (EntityCacheUtil.getResult(
						FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
						FasePostulacionPuestoEvaluacionImpl.class,
						fasePostulacionPuestoEvaluacion.getPrimaryKey()) == null) {
				cacheResult(fasePostulacionPuestoEvaluacion);
			}
			else {
				fasePostulacionPuestoEvaluacion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all fase postulacion puesto evaluacions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FasePostulacionPuestoEvaluacionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FasePostulacionPuestoEvaluacionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the fase postulacion puesto evaluacion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion) {
		EntityCacheUtil.removeResult(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			fasePostulacionPuestoEvaluacion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<FasePostulacionPuestoEvaluacion> fasePostulacionPuestoEvaluacions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : fasePostulacionPuestoEvaluacions) {
			EntityCacheUtil.removeResult(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
				FasePostulacionPuestoEvaluacionImpl.class,
				fasePostulacionPuestoEvaluacion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new fase postulacion puesto evaluacion with the primary key. Does not add the fase postulacion puesto evaluacion to the database.
	 *
	 * @param fasePostulacionPuestoEvaluacionPK the primary key for the new fase postulacion puesto evaluacion
	 * @return the new fase postulacion puesto evaluacion
	 */
	@Override
	public FasePostulacionPuestoEvaluacion create(
		FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK) {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = new FasePostulacionPuestoEvaluacionImpl();

		fasePostulacionPuestoEvaluacion.setNew(true);
		fasePostulacionPuestoEvaluacion.setPrimaryKey(fasePostulacionPuestoEvaluacionPK);

		return fasePostulacionPuestoEvaluacion;
	}

	/**
	 * Removes the fase postulacion puesto evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fasePostulacionPuestoEvaluacionPK the primary key of the fase postulacion puesto evaluacion
	 * @return the fase postulacion puesto evaluacion that was removed
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion remove(
		FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		return remove((Serializable)fasePostulacionPuestoEvaluacionPK);
	}

	/**
	 * Removes the fase postulacion puesto evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fase postulacion puesto evaluacion
	 * @return the fase postulacion puesto evaluacion that was removed
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion remove(Serializable primaryKey)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = (FasePostulacionPuestoEvaluacion)session.get(FasePostulacionPuestoEvaluacionImpl.class,
					primaryKey);

			if (fasePostulacionPuestoEvaluacion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFasePostulacionPuestoEvaluacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(fasePostulacionPuestoEvaluacion);
		}
		catch (NoSuchFasePostulacionPuestoEvaluacionException nsee) {
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
	protected FasePostulacionPuestoEvaluacion removeImpl(
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion)
		throws SystemException {
		fasePostulacionPuestoEvaluacion = toUnwrappedModel(fasePostulacionPuestoEvaluacion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fasePostulacionPuestoEvaluacion)) {
				fasePostulacionPuestoEvaluacion = (FasePostulacionPuestoEvaluacion)session.get(FasePostulacionPuestoEvaluacionImpl.class,
						fasePostulacionPuestoEvaluacion.getPrimaryKeyObj());
			}

			if (fasePostulacionPuestoEvaluacion != null) {
				session.delete(fasePostulacionPuestoEvaluacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (fasePostulacionPuestoEvaluacion != null) {
			clearCache(fasePostulacionPuestoEvaluacion);
		}

		return fasePostulacionPuestoEvaluacion;
	}

	@Override
	public FasePostulacionPuestoEvaluacion updateImpl(
		com.hitss.layer.model.FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion)
		throws SystemException {
		fasePostulacionPuestoEvaluacion = toUnwrappedModel(fasePostulacionPuestoEvaluacion);

		boolean isNew = fasePostulacionPuestoEvaluacion.isNew();

		Session session = null;

		try {
			session = openSession();

			if (fasePostulacionPuestoEvaluacion.isNew()) {
				session.save(fasePostulacionPuestoEvaluacion);

				fasePostulacionPuestoEvaluacion.setNew(false);
			}
			else {
				session.merge(fasePostulacionPuestoEvaluacion);
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

		EntityCacheUtil.putResult(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			fasePostulacionPuestoEvaluacion.getPrimaryKey(),
			fasePostulacionPuestoEvaluacion);

		return fasePostulacionPuestoEvaluacion;
	}

	protected FasePostulacionPuestoEvaluacion toUnwrappedModel(
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion) {
		if (fasePostulacionPuestoEvaluacion instanceof FasePostulacionPuestoEvaluacionImpl) {
			return fasePostulacionPuestoEvaluacion;
		}

		FasePostulacionPuestoEvaluacionImpl fasePostulacionPuestoEvaluacionImpl = new FasePostulacionPuestoEvaluacionImpl();

		fasePostulacionPuestoEvaluacionImpl.setNew(fasePostulacionPuestoEvaluacion.isNew());
		fasePostulacionPuestoEvaluacionImpl.setPrimaryKey(fasePostulacionPuestoEvaluacion.getPrimaryKey());

		fasePostulacionPuestoEvaluacionImpl.setFasePostulacionId(fasePostulacionPuestoEvaluacion.getFasePostulacionId());
		fasePostulacionPuestoEvaluacionImpl.setSolicitudFuncionId(fasePostulacionPuestoEvaluacion.getSolicitudFuncionId());
		fasePostulacionPuestoEvaluacionImpl.setEvaluacionId(fasePostulacionPuestoEvaluacion.getEvaluacionId());
		fasePostulacionPuestoEvaluacionImpl.setResultado(fasePostulacionPuestoEvaluacion.getResultado());

		return fasePostulacionPuestoEvaluacionImpl;
	}

	/**
	 * Returns the fase postulacion puesto evaluacion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the fase postulacion puesto evaluacion
	 * @return the fase postulacion puesto evaluacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = fetchByPrimaryKey(primaryKey);

		if (fasePostulacionPuestoEvaluacion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFasePostulacionPuestoEvaluacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return fasePostulacionPuestoEvaluacion;
	}

	/**
	 * Returns the fase postulacion puesto evaluacion with the primary key or throws a {@link com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException} if it could not be found.
	 *
	 * @param fasePostulacionPuestoEvaluacionPK the primary key of the fase postulacion puesto evaluacion
	 * @return the fase postulacion puesto evaluacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion findByPrimaryKey(
		FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		return findByPrimaryKey((Serializable)fasePostulacionPuestoEvaluacionPK);
	}

	/**
	 * Returns the fase postulacion puesto evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fase postulacion puesto evaluacion
	 * @return the fase postulacion puesto evaluacion, or <code>null</code> if a fase postulacion puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = (FasePostulacionPuestoEvaluacion)EntityCacheUtil.getResult(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
				FasePostulacionPuestoEvaluacionImpl.class, primaryKey);

		if (fasePostulacionPuestoEvaluacion == _nullFasePostulacionPuestoEvaluacion) {
			return null;
		}

		if (fasePostulacionPuestoEvaluacion == null) {
			Session session = null;

			try {
				session = openSession();

				fasePostulacionPuestoEvaluacion = (FasePostulacionPuestoEvaluacion)session.get(FasePostulacionPuestoEvaluacionImpl.class,
						primaryKey);

				if (fasePostulacionPuestoEvaluacion != null) {
					cacheResult(fasePostulacionPuestoEvaluacion);
				}
				else {
					EntityCacheUtil.putResult(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
						FasePostulacionPuestoEvaluacionImpl.class, primaryKey,
						_nullFasePostulacionPuestoEvaluacion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
					FasePostulacionPuestoEvaluacionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return fasePostulacionPuestoEvaluacion;
	}

	/**
	 * Returns the fase postulacion puesto evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fasePostulacionPuestoEvaluacionPK the primary key of the fase postulacion puesto evaluacion
	 * @return the fase postulacion puesto evaluacion, or <code>null</code> if a fase postulacion puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion fetchByPrimaryKey(
		FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)fasePostulacionPuestoEvaluacionPK);
	}

	/**
	 * Returns all the fase postulacion puesto evaluacions.
	 *
	 * @return the fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fase postulacion puesto evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of fase postulacion puesto evaluacions
	 * @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	 * @return the range of fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fase postulacion puesto evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of fase postulacion puesto evaluacions
	 * @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findAll(int start, int end,
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

		List<FasePostulacionPuestoEvaluacion> list = (List<FasePostulacionPuestoEvaluacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FASEPOSTULACIONPUESTOEVALUACION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FASEPOSTULACIONPUESTOEVALUACION;

				if (pagination) {
					sql = sql.concat(FasePostulacionPuestoEvaluacionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FasePostulacionPuestoEvaluacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FasePostulacionPuestoEvaluacion>(list);
				}
				else {
					list = (List<FasePostulacionPuestoEvaluacion>)QueryUtil.list(q,
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
	 * Removes all the fase postulacion puesto evaluacions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : findAll()) {
			remove(fasePostulacionPuestoEvaluacion);
		}
	}

	/**
	 * Returns the number of fase postulacion puesto evaluacions.
	 *
	 * @return the number of fase postulacion puesto evaluacions
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

				Query q = session.createQuery(_SQL_COUNT_FASEPOSTULACIONPUESTOEVALUACION);

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
	 * Initializes the fase postulacion puesto evaluacion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.FasePostulacionPuestoEvaluacion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FasePostulacionPuestoEvaluacion>> listenersList =
					new ArrayList<ModelListener<FasePostulacionPuestoEvaluacion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FasePostulacionPuestoEvaluacion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FasePostulacionPuestoEvaluacionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FASEPOSTULACIONPUESTOEVALUACION = "SELECT fasePostulacionPuestoEvaluacion FROM FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion";
	private static final String _SQL_COUNT_FASEPOSTULACIONPUESTOEVALUACION = "SELECT COUNT(fasePostulacionPuestoEvaluacion) FROM FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion";
	private static final String _ORDER_BY_ENTITY_ALIAS = "fasePostulacionPuestoEvaluacion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FasePostulacionPuestoEvaluacion exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FasePostulacionPuestoEvaluacionPersistenceImpl.class);
	private static FasePostulacionPuestoEvaluacion _nullFasePostulacionPuestoEvaluacion =
		new FasePostulacionPuestoEvaluacionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FasePostulacionPuestoEvaluacion> toCacheModel() {
				return _nullFasePostulacionPuestoEvaluacionCacheModel;
			}
		};

	private static CacheModel<FasePostulacionPuestoEvaluacion> _nullFasePostulacionPuestoEvaluacionCacheModel =
		new CacheModel<FasePostulacionPuestoEvaluacion>() {
			@Override
			public FasePostulacionPuestoEvaluacion toEntityModel() {
				return _nullFasePostulacionPuestoEvaluacion;
			}
		};
}
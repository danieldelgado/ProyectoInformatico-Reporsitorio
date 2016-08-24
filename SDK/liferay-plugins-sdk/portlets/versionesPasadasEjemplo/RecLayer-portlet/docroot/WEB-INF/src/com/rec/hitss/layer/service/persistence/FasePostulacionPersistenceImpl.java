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

import com.rec.hitss.layer.NoSuchFasePostulacionException;
import com.rec.hitss.layer.model.FasePostulacion;
import com.rec.hitss.layer.model.impl.FasePostulacionImpl;
import com.rec.hitss.layer.model.impl.FasePostulacionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the fase postulacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see FasePostulacionPersistence
 * @see FasePostulacionUtil
 * @generated
 */
public class FasePostulacionPersistenceImpl extends BasePersistenceImpl<FasePostulacion>
	implements FasePostulacionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FasePostulacionUtil} to access the fase postulacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FasePostulacionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public FasePostulacionPersistenceImpl() {
		setModelClass(FasePostulacion.class);
	}

	/**
	 * Caches the fase postulacion in the entity cache if it is enabled.
	 *
	 * @param fasePostulacion the fase postulacion
	 */
	@Override
	public void cacheResult(FasePostulacion fasePostulacion) {
		EntityCacheUtil.putResult(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionImpl.class, fasePostulacion.getPrimaryKey(),
			fasePostulacion);

		fasePostulacion.resetOriginalValues();
	}

	/**
	 * Caches the fase postulacions in the entity cache if it is enabled.
	 *
	 * @param fasePostulacions the fase postulacions
	 */
	@Override
	public void cacheResult(List<FasePostulacion> fasePostulacions) {
		for (FasePostulacion fasePostulacion : fasePostulacions) {
			if (EntityCacheUtil.getResult(
						FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
						FasePostulacionImpl.class,
						fasePostulacion.getPrimaryKey()) == null) {
				cacheResult(fasePostulacion);
			}
			else {
				fasePostulacion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all fase postulacions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FasePostulacionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FasePostulacionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the fase postulacion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FasePostulacion fasePostulacion) {
		EntityCacheUtil.removeResult(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionImpl.class, fasePostulacion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FasePostulacion> fasePostulacions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FasePostulacion fasePostulacion : fasePostulacions) {
			EntityCacheUtil.removeResult(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
				FasePostulacionImpl.class, fasePostulacion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new fase postulacion with the primary key. Does not add the fase postulacion to the database.
	 *
	 * @param fasePostulacionId the primary key for the new fase postulacion
	 * @return the new fase postulacion
	 */
	@Override
	public FasePostulacion create(long fasePostulacionId) {
		FasePostulacion fasePostulacion = new FasePostulacionImpl();

		fasePostulacion.setNew(true);
		fasePostulacion.setPrimaryKey(fasePostulacionId);

		return fasePostulacion;
	}

	/**
	 * Removes the fase postulacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fasePostulacionId the primary key of the fase postulacion
	 * @return the fase postulacion that was removed
	 * @throws com.rec.hitss.layer.NoSuchFasePostulacionException if a fase postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion remove(long fasePostulacionId)
		throws NoSuchFasePostulacionException, SystemException {
		return remove((Serializable)fasePostulacionId);
	}

	/**
	 * Removes the fase postulacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fase postulacion
	 * @return the fase postulacion that was removed
	 * @throws com.rec.hitss.layer.NoSuchFasePostulacionException if a fase postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion remove(Serializable primaryKey)
		throws NoSuchFasePostulacionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FasePostulacion fasePostulacion = (FasePostulacion)session.get(FasePostulacionImpl.class,
					primaryKey);

			if (fasePostulacion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFasePostulacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(fasePostulacion);
		}
		catch (NoSuchFasePostulacionException nsee) {
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
	protected FasePostulacion removeImpl(FasePostulacion fasePostulacion)
		throws SystemException {
		fasePostulacion = toUnwrappedModel(fasePostulacion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fasePostulacion)) {
				fasePostulacion = (FasePostulacion)session.get(FasePostulacionImpl.class,
						fasePostulacion.getPrimaryKeyObj());
			}

			if (fasePostulacion != null) {
				session.delete(fasePostulacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (fasePostulacion != null) {
			clearCache(fasePostulacion);
		}

		return fasePostulacion;
	}

	@Override
	public FasePostulacion updateImpl(
		com.rec.hitss.layer.model.FasePostulacion fasePostulacion)
		throws SystemException {
		fasePostulacion = toUnwrappedModel(fasePostulacion);

		boolean isNew = fasePostulacion.isNew();

		Session session = null;

		try {
			session = openSession();

			if (fasePostulacion.isNew()) {
				session.save(fasePostulacion);

				fasePostulacion.setNew(false);
			}
			else {
				session.merge(fasePostulacion);
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

		EntityCacheUtil.putResult(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionImpl.class, fasePostulacion.getPrimaryKey(),
			fasePostulacion);

		return fasePostulacion;
	}

	protected FasePostulacion toUnwrappedModel(FasePostulacion fasePostulacion) {
		if (fasePostulacion instanceof FasePostulacionImpl) {
			return fasePostulacion;
		}

		FasePostulacionImpl fasePostulacionImpl = new FasePostulacionImpl();

		fasePostulacionImpl.setNew(fasePostulacion.isNew());
		fasePostulacionImpl.setPrimaryKey(fasePostulacion.getPrimaryKey());

		fasePostulacionImpl.setFasePostulacionId(fasePostulacion.getFasePostulacionId());
		fasePostulacionImpl.setSolicitudRequerimientoId(fasePostulacion.getSolicitudRequerimientoId());
		fasePostulacionImpl.setUsuarioId(fasePostulacion.getUsuarioId());
		fasePostulacionImpl.setFechaFase(fasePostulacion.getFechaFase());
		fasePostulacionImpl.setTipoFase(fasePostulacion.getTipoFase());
		fasePostulacionImpl.setDescripcion(fasePostulacion.getDescripcion());
		fasePostulacionImpl.setEstado(fasePostulacion.getEstado());
		fasePostulacionImpl.setActivo(fasePostulacion.isActivo());
		fasePostulacionImpl.setUsuariocrea(fasePostulacion.getUsuariocrea());
		fasePostulacionImpl.setFechacrea(fasePostulacion.getFechacrea());
		fasePostulacionImpl.setUsuariomodifica(fasePostulacion.getUsuariomodifica());
		fasePostulacionImpl.setFechacreamodifica(fasePostulacion.getFechacreamodifica());

		return fasePostulacionImpl;
	}

	/**
	 * Returns the fase postulacion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the fase postulacion
	 * @return the fase postulacion
	 * @throws com.rec.hitss.layer.NoSuchFasePostulacionException if a fase postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFasePostulacionException, SystemException {
		FasePostulacion fasePostulacion = fetchByPrimaryKey(primaryKey);

		if (fasePostulacion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFasePostulacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return fasePostulacion;
	}

	/**
	 * Returns the fase postulacion with the primary key or throws a {@link com.rec.hitss.layer.NoSuchFasePostulacionException} if it could not be found.
	 *
	 * @param fasePostulacionId the primary key of the fase postulacion
	 * @return the fase postulacion
	 * @throws com.rec.hitss.layer.NoSuchFasePostulacionException if a fase postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion findByPrimaryKey(long fasePostulacionId)
		throws NoSuchFasePostulacionException, SystemException {
		return findByPrimaryKey((Serializable)fasePostulacionId);
	}

	/**
	 * Returns the fase postulacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fase postulacion
	 * @return the fase postulacion, or <code>null</code> if a fase postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		FasePostulacion fasePostulacion = (FasePostulacion)EntityCacheUtil.getResult(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
				FasePostulacionImpl.class, primaryKey);

		if (fasePostulacion == _nullFasePostulacion) {
			return null;
		}

		if (fasePostulacion == null) {
			Session session = null;

			try {
				session = openSession();

				fasePostulacion = (FasePostulacion)session.get(FasePostulacionImpl.class,
						primaryKey);

				if (fasePostulacion != null) {
					cacheResult(fasePostulacion);
				}
				else {
					EntityCacheUtil.putResult(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
						FasePostulacionImpl.class, primaryKey,
						_nullFasePostulacion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
					FasePostulacionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return fasePostulacion;
	}

	/**
	 * Returns the fase postulacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fasePostulacionId the primary key of the fase postulacion
	 * @return the fase postulacion, or <code>null</code> if a fase postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion fetchByPrimaryKey(long fasePostulacionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)fasePostulacionId);
	}

	/**
	 * Returns all the fase postulacions.
	 *
	 * @return the fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fase postulacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of fase postulacions
	 * @param end the upper bound of the range of fase postulacions (not inclusive)
	 * @return the range of fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fase postulacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of fase postulacions
	 * @param end the upper bound of the range of fase postulacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findAll(int start, int end,
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

		List<FasePostulacion> list = (List<FasePostulacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FASEPOSTULACION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FASEPOSTULACION;

				if (pagination) {
					sql = sql.concat(FasePostulacionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FasePostulacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FasePostulacion>(list);
				}
				else {
					list = (List<FasePostulacion>)QueryUtil.list(q,
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
	 * Removes all the fase postulacions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (FasePostulacion fasePostulacion : findAll()) {
			remove(fasePostulacion);
		}
	}

	/**
	 * Returns the number of fase postulacions.
	 *
	 * @return the number of fase postulacions
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

				Query q = session.createQuery(_SQL_COUNT_FASEPOSTULACION);

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
	 * Initializes the fase postulacion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.FasePostulacion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FasePostulacion>> listenersList = new ArrayList<ModelListener<FasePostulacion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FasePostulacion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FasePostulacionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FASEPOSTULACION = "SELECT fasePostulacion FROM FasePostulacion fasePostulacion";
	private static final String _SQL_COUNT_FASEPOSTULACION = "SELECT COUNT(fasePostulacion) FROM FasePostulacion fasePostulacion";
	private static final String _ORDER_BY_ENTITY_ALIAS = "fasePostulacion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FasePostulacion exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FasePostulacionPersistenceImpl.class);
	private static FasePostulacion _nullFasePostulacion = new FasePostulacionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FasePostulacion> toCacheModel() {
				return _nullFasePostulacionCacheModel;
			}
		};

	private static CacheModel<FasePostulacion> _nullFasePostulacionCacheModel = new CacheModel<FasePostulacion>() {
			@Override
			public FasePostulacion toEntityModel() {
				return _nullFasePostulacion;
			}
		};
}
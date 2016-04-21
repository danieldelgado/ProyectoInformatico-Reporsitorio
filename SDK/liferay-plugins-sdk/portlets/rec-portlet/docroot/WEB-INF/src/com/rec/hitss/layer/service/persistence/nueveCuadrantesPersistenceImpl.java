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

import com.rec.hitss.layer.NoSuchnueveCuadrantesException;
import com.rec.hitss.layer.model.impl.nueveCuadrantesImpl;
import com.rec.hitss.layer.model.impl.nueveCuadrantesModelImpl;
import com.rec.hitss.layer.model.nueveCuadrantes;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the nueve cuadrantes service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see nueveCuadrantesPersistence
 * @see nueveCuadrantesUtil
 * @generated
 */
public class nueveCuadrantesPersistenceImpl extends BasePersistenceImpl<nueveCuadrantes>
	implements nueveCuadrantesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link nueveCuadrantesUtil} to access the nueve cuadrantes persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = nueveCuadrantesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(nueveCuadrantesModelImpl.ENTITY_CACHE_ENABLED,
			nueveCuadrantesModelImpl.FINDER_CACHE_ENABLED,
			nueveCuadrantesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(nueveCuadrantesModelImpl.ENTITY_CACHE_ENABLED,
			nueveCuadrantesModelImpl.FINDER_CACHE_ENABLED,
			nueveCuadrantesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(nueveCuadrantesModelImpl.ENTITY_CACHE_ENABLED,
			nueveCuadrantesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public nueveCuadrantesPersistenceImpl() {
		setModelClass(nueveCuadrantes.class);
	}

	/**
	 * Caches the nueve cuadrantes in the entity cache if it is enabled.
	 *
	 * @param nueveCuadrantes the nueve cuadrantes
	 */
	@Override
	public void cacheResult(nueveCuadrantes nueveCuadrantes) {
		EntityCacheUtil.putResult(nueveCuadrantesModelImpl.ENTITY_CACHE_ENABLED,
			nueveCuadrantesImpl.class, nueveCuadrantes.getPrimaryKey(),
			nueveCuadrantes);

		nueveCuadrantes.resetOriginalValues();
	}

	/**
	 * Caches the nueve cuadranteses in the entity cache if it is enabled.
	 *
	 * @param nueveCuadranteses the nueve cuadranteses
	 */
	@Override
	public void cacheResult(List<nueveCuadrantes> nueveCuadranteses) {
		for (nueveCuadrantes nueveCuadrantes : nueveCuadranteses) {
			if (EntityCacheUtil.getResult(
						nueveCuadrantesModelImpl.ENTITY_CACHE_ENABLED,
						nueveCuadrantesImpl.class,
						nueveCuadrantes.getPrimaryKey()) == null) {
				cacheResult(nueveCuadrantes);
			}
			else {
				nueveCuadrantes.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all nueve cuadranteses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(nueveCuadrantesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(nueveCuadrantesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the nueve cuadrantes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(nueveCuadrantes nueveCuadrantes) {
		EntityCacheUtil.removeResult(nueveCuadrantesModelImpl.ENTITY_CACHE_ENABLED,
			nueveCuadrantesImpl.class, nueveCuadrantes.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<nueveCuadrantes> nueveCuadranteses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (nueveCuadrantes nueveCuadrantes : nueveCuadranteses) {
			EntityCacheUtil.removeResult(nueveCuadrantesModelImpl.ENTITY_CACHE_ENABLED,
				nueveCuadrantesImpl.class, nueveCuadrantes.getPrimaryKey());
		}
	}

	/**
	 * Creates a new nueve cuadrantes with the primary key. Does not add the nueve cuadrantes to the database.
	 *
	 * @param NC_ID the primary key for the new nueve cuadrantes
	 * @return the new nueve cuadrantes
	 */
	@Override
	public nueveCuadrantes create(long NC_ID) {
		nueveCuadrantes nueveCuadrantes = new nueveCuadrantesImpl();

		nueveCuadrantes.setNew(true);
		nueveCuadrantes.setPrimaryKey(NC_ID);

		return nueveCuadrantes;
	}

	/**
	 * Removes the nueve cuadrantes with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param NC_ID the primary key of the nueve cuadrantes
	 * @return the nueve cuadrantes that was removed
	 * @throws com.rec.hitss.layer.NoSuchnueveCuadrantesException if a nueve cuadrantes with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nueveCuadrantes remove(long NC_ID)
		throws NoSuchnueveCuadrantesException, SystemException {
		return remove((Serializable)NC_ID);
	}

	/**
	 * Removes the nueve cuadrantes with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the nueve cuadrantes
	 * @return the nueve cuadrantes that was removed
	 * @throws com.rec.hitss.layer.NoSuchnueveCuadrantesException if a nueve cuadrantes with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nueveCuadrantes remove(Serializable primaryKey)
		throws NoSuchnueveCuadrantesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			nueveCuadrantes nueveCuadrantes = (nueveCuadrantes)session.get(nueveCuadrantesImpl.class,
					primaryKey);

			if (nueveCuadrantes == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchnueveCuadrantesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(nueveCuadrantes);
		}
		catch (NoSuchnueveCuadrantesException nsee) {
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
	protected nueveCuadrantes removeImpl(nueveCuadrantes nueveCuadrantes)
		throws SystemException {
		nueveCuadrantes = toUnwrappedModel(nueveCuadrantes);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(nueveCuadrantes)) {
				nueveCuadrantes = (nueveCuadrantes)session.get(nueveCuadrantesImpl.class,
						nueveCuadrantes.getPrimaryKeyObj());
			}

			if (nueveCuadrantes != null) {
				session.delete(nueveCuadrantes);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (nueveCuadrantes != null) {
			clearCache(nueveCuadrantes);
		}

		return nueveCuadrantes;
	}

	@Override
	public nueveCuadrantes updateImpl(
		com.rec.hitss.layer.model.nueveCuadrantes nueveCuadrantes)
		throws SystemException {
		nueveCuadrantes = toUnwrappedModel(nueveCuadrantes);

		boolean isNew = nueveCuadrantes.isNew();

		Session session = null;

		try {
			session = openSession();

			if (nueveCuadrantes.isNew()) {
				session.save(nueveCuadrantes);

				nueveCuadrantes.setNew(false);
			}
			else {
				session.merge(nueveCuadrantes);
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

		EntityCacheUtil.putResult(nueveCuadrantesModelImpl.ENTITY_CACHE_ENABLED,
			nueveCuadrantesImpl.class, nueveCuadrantes.getPrimaryKey(),
			nueveCuadrantes);

		return nueveCuadrantes;
	}

	protected nueveCuadrantes toUnwrappedModel(nueveCuadrantes nueveCuadrantes) {
		if (nueveCuadrantes instanceof nueveCuadrantesImpl) {
			return nueveCuadrantes;
		}

		nueveCuadrantesImpl nueveCuadrantesImpl = new nueveCuadrantesImpl();

		nueveCuadrantesImpl.setNew(nueveCuadrantes.isNew());
		nueveCuadrantesImpl.setPrimaryKey(nueveCuadrantes.getPrimaryKey());

		nueveCuadrantesImpl.setNC_ID(nueveCuadrantes.getNC_ID());
		nueveCuadrantesImpl.setREQ_ESTADO(nueveCuadrantes.getREQ_ESTADO());
		nueveCuadrantesImpl.setREQ_ACTIVO(nueveCuadrantes.getREQ_ACTIVO());
		nueveCuadrantesImpl.setSR_USUARIO_CREA(nueveCuadrantes.getSR_USUARIO_CREA());
		nueveCuadrantesImpl.setSR_FECHA_CREA(nueveCuadrantes.getSR_FECHA_CREA());
		nueveCuadrantesImpl.setSR_USUARIO_MODIFICA(nueveCuadrantes.getSR_USUARIO_MODIFICA());
		nueveCuadrantesImpl.setSR_FECHA_MODIFICA(nueveCuadrantes.getSR_FECHA_MODIFICA());

		return nueveCuadrantesImpl;
	}

	/**
	 * Returns the nueve cuadrantes with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the nueve cuadrantes
	 * @return the nueve cuadrantes
	 * @throws com.rec.hitss.layer.NoSuchnueveCuadrantesException if a nueve cuadrantes with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nueveCuadrantes findByPrimaryKey(Serializable primaryKey)
		throws NoSuchnueveCuadrantesException, SystemException {
		nueveCuadrantes nueveCuadrantes = fetchByPrimaryKey(primaryKey);

		if (nueveCuadrantes == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchnueveCuadrantesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return nueveCuadrantes;
	}

	/**
	 * Returns the nueve cuadrantes with the primary key or throws a {@link com.rec.hitss.layer.NoSuchnueveCuadrantesException} if it could not be found.
	 *
	 * @param NC_ID the primary key of the nueve cuadrantes
	 * @return the nueve cuadrantes
	 * @throws com.rec.hitss.layer.NoSuchnueveCuadrantesException if a nueve cuadrantes with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nueveCuadrantes findByPrimaryKey(long NC_ID)
		throws NoSuchnueveCuadrantesException, SystemException {
		return findByPrimaryKey((Serializable)NC_ID);
	}

	/**
	 * Returns the nueve cuadrantes with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nueve cuadrantes
	 * @return the nueve cuadrantes, or <code>null</code> if a nueve cuadrantes with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nueveCuadrantes fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		nueveCuadrantes nueveCuadrantes = (nueveCuadrantes)EntityCacheUtil.getResult(nueveCuadrantesModelImpl.ENTITY_CACHE_ENABLED,
				nueveCuadrantesImpl.class, primaryKey);

		if (nueveCuadrantes == _nullnueveCuadrantes) {
			return null;
		}

		if (nueveCuadrantes == null) {
			Session session = null;

			try {
				session = openSession();

				nueveCuadrantes = (nueveCuadrantes)session.get(nueveCuadrantesImpl.class,
						primaryKey);

				if (nueveCuadrantes != null) {
					cacheResult(nueveCuadrantes);
				}
				else {
					EntityCacheUtil.putResult(nueveCuadrantesModelImpl.ENTITY_CACHE_ENABLED,
						nueveCuadrantesImpl.class, primaryKey,
						_nullnueveCuadrantes);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(nueveCuadrantesModelImpl.ENTITY_CACHE_ENABLED,
					nueveCuadrantesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return nueveCuadrantes;
	}

	/**
	 * Returns the nueve cuadrantes with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param NC_ID the primary key of the nueve cuadrantes
	 * @return the nueve cuadrantes, or <code>null</code> if a nueve cuadrantes with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nueveCuadrantes fetchByPrimaryKey(long NC_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)NC_ID);
	}

	/**
	 * Returns all the nueve cuadranteses.
	 *
	 * @return the nueve cuadranteses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<nueveCuadrantes> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nueve cuadranteses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.nueveCuadrantesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nueve cuadranteses
	 * @param end the upper bound of the range of nueve cuadranteses (not inclusive)
	 * @return the range of nueve cuadranteses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<nueveCuadrantes> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the nueve cuadranteses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.nueveCuadrantesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nueve cuadranteses
	 * @param end the upper bound of the range of nueve cuadranteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nueve cuadranteses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<nueveCuadrantes> findAll(int start, int end,
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

		List<nueveCuadrantes> list = (List<nueveCuadrantes>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NUEVECUADRANTES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NUEVECUADRANTES;

				if (pagination) {
					sql = sql.concat(nueveCuadrantesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<nueveCuadrantes>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<nueveCuadrantes>(list);
				}
				else {
					list = (List<nueveCuadrantes>)QueryUtil.list(q,
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
	 * Removes all the nueve cuadranteses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (nueveCuadrantes nueveCuadrantes : findAll()) {
			remove(nueveCuadrantes);
		}
	}

	/**
	 * Returns the number of nueve cuadranteses.
	 *
	 * @return the number of nueve cuadranteses
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

				Query q = session.createQuery(_SQL_COUNT_NUEVECUADRANTES);

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
	 * Initializes the nueve cuadrantes persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.nueveCuadrantes")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<nueveCuadrantes>> listenersList = new ArrayList<ModelListener<nueveCuadrantes>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<nueveCuadrantes>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(nueveCuadrantesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NUEVECUADRANTES = "SELECT nueveCuadrantes FROM nueveCuadrantes nueveCuadrantes";
	private static final String _SQL_COUNT_NUEVECUADRANTES = "SELECT COUNT(nueveCuadrantes) FROM nueveCuadrantes nueveCuadrantes";
	private static final String _ORDER_BY_ENTITY_ALIAS = "nueveCuadrantes.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No nueveCuadrantes exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(nueveCuadrantesPersistenceImpl.class);
	private static nueveCuadrantes _nullnueveCuadrantes = new nueveCuadrantesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<nueveCuadrantes> toCacheModel() {
				return _nullnueveCuadrantesCacheModel;
			}
		};

	private static CacheModel<nueveCuadrantes> _nullnueveCuadrantesCacheModel = new CacheModel<nueveCuadrantes>() {
			@Override
			public nueveCuadrantes toEntityModel() {
				return _nullnueveCuadrantes;
			}
		};
}
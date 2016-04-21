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

import com.rec.hitss.layer.NoSuchfichaIngresoException;
import com.rec.hitss.layer.model.fichaIngreso;
import com.rec.hitss.layer.model.impl.fichaIngresoImpl;
import com.rec.hitss.layer.model.impl.fichaIngresoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the ficha ingreso service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see fichaIngresoPersistence
 * @see fichaIngresoUtil
 * @generated
 */
public class fichaIngresoPersistenceImpl extends BasePersistenceImpl<fichaIngreso>
	implements fichaIngresoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link fichaIngresoUtil} to access the ficha ingreso persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = fichaIngresoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(fichaIngresoModelImpl.ENTITY_CACHE_ENABLED,
			fichaIngresoModelImpl.FINDER_CACHE_ENABLED, fichaIngresoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(fichaIngresoModelImpl.ENTITY_CACHE_ENABLED,
			fichaIngresoModelImpl.FINDER_CACHE_ENABLED, fichaIngresoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(fichaIngresoModelImpl.ENTITY_CACHE_ENABLED,
			fichaIngresoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public fichaIngresoPersistenceImpl() {
		setModelClass(fichaIngreso.class);
	}

	/**
	 * Caches the ficha ingreso in the entity cache if it is enabled.
	 *
	 * @param fichaIngreso the ficha ingreso
	 */
	@Override
	public void cacheResult(fichaIngreso fichaIngreso) {
		EntityCacheUtil.putResult(fichaIngresoModelImpl.ENTITY_CACHE_ENABLED,
			fichaIngresoImpl.class, fichaIngreso.getPrimaryKey(), fichaIngreso);

		fichaIngreso.resetOriginalValues();
	}

	/**
	 * Caches the ficha ingresos in the entity cache if it is enabled.
	 *
	 * @param fichaIngresos the ficha ingresos
	 */
	@Override
	public void cacheResult(List<fichaIngreso> fichaIngresos) {
		for (fichaIngreso fichaIngreso : fichaIngresos) {
			if (EntityCacheUtil.getResult(
						fichaIngresoModelImpl.ENTITY_CACHE_ENABLED,
						fichaIngresoImpl.class, fichaIngreso.getPrimaryKey()) == null) {
				cacheResult(fichaIngreso);
			}
			else {
				fichaIngreso.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ficha ingresos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(fichaIngresoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(fichaIngresoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ficha ingreso.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(fichaIngreso fichaIngreso) {
		EntityCacheUtil.removeResult(fichaIngresoModelImpl.ENTITY_CACHE_ENABLED,
			fichaIngresoImpl.class, fichaIngreso.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<fichaIngreso> fichaIngresos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (fichaIngreso fichaIngreso : fichaIngresos) {
			EntityCacheUtil.removeResult(fichaIngresoModelImpl.ENTITY_CACHE_ENABLED,
				fichaIngresoImpl.class, fichaIngreso.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ficha ingreso with the primary key. Does not add the ficha ingreso to the database.
	 *
	 * @param FI_ID the primary key for the new ficha ingreso
	 * @return the new ficha ingreso
	 */
	@Override
	public fichaIngreso create(long FI_ID) {
		fichaIngreso fichaIngreso = new fichaIngresoImpl();

		fichaIngreso.setNew(true);
		fichaIngreso.setPrimaryKey(FI_ID);

		return fichaIngreso;
	}

	/**
	 * Removes the ficha ingreso with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param FI_ID the primary key of the ficha ingreso
	 * @return the ficha ingreso that was removed
	 * @throws com.rec.hitss.layer.NoSuchfichaIngresoException if a ficha ingreso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public fichaIngreso remove(long FI_ID)
		throws NoSuchfichaIngresoException, SystemException {
		return remove((Serializable)FI_ID);
	}

	/**
	 * Removes the ficha ingreso with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ficha ingreso
	 * @return the ficha ingreso that was removed
	 * @throws com.rec.hitss.layer.NoSuchfichaIngresoException if a ficha ingreso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public fichaIngreso remove(Serializable primaryKey)
		throws NoSuchfichaIngresoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			fichaIngreso fichaIngreso = (fichaIngreso)session.get(fichaIngresoImpl.class,
					primaryKey);

			if (fichaIngreso == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchfichaIngresoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(fichaIngreso);
		}
		catch (NoSuchfichaIngresoException nsee) {
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
	protected fichaIngreso removeImpl(fichaIngreso fichaIngreso)
		throws SystemException {
		fichaIngreso = toUnwrappedModel(fichaIngreso);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fichaIngreso)) {
				fichaIngreso = (fichaIngreso)session.get(fichaIngresoImpl.class,
						fichaIngreso.getPrimaryKeyObj());
			}

			if (fichaIngreso != null) {
				session.delete(fichaIngreso);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (fichaIngreso != null) {
			clearCache(fichaIngreso);
		}

		return fichaIngreso;
	}

	@Override
	public fichaIngreso updateImpl(
		com.rec.hitss.layer.model.fichaIngreso fichaIngreso)
		throws SystemException {
		fichaIngreso = toUnwrappedModel(fichaIngreso);

		boolean isNew = fichaIngreso.isNew();

		Session session = null;

		try {
			session = openSession();

			if (fichaIngreso.isNew()) {
				session.save(fichaIngreso);

				fichaIngreso.setNew(false);
			}
			else {
				session.merge(fichaIngreso);
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

		EntityCacheUtil.putResult(fichaIngresoModelImpl.ENTITY_CACHE_ENABLED,
			fichaIngresoImpl.class, fichaIngreso.getPrimaryKey(), fichaIngreso);

		return fichaIngreso;
	}

	protected fichaIngreso toUnwrappedModel(fichaIngreso fichaIngreso) {
		if (fichaIngreso instanceof fichaIngresoImpl) {
			return fichaIngreso;
		}

		fichaIngresoImpl fichaIngresoImpl = new fichaIngresoImpl();

		fichaIngresoImpl.setNew(fichaIngreso.isNew());
		fichaIngresoImpl.setPrimaryKey(fichaIngreso.getPrimaryKey());

		fichaIngresoImpl.setFI_ID(fichaIngreso.getFI_ID());
		fichaIngresoImpl.setFI_ESTADO(fichaIngreso.getFI_ESTADO());
		fichaIngresoImpl.setFI_ACTIVO(fichaIngreso.getFI_ACTIVO());
		fichaIngresoImpl.setFI_USUARIO_CREA(fichaIngreso.getFI_USUARIO_CREA());
		fichaIngresoImpl.setFI_FECHA_CREA(fichaIngreso.getFI_FECHA_CREA());
		fichaIngresoImpl.setFI_USUARIO_MODIFICA(fichaIngreso.getFI_USUARIO_MODIFICA());
		fichaIngresoImpl.setFI_FECHA_MODIFICA(fichaIngreso.getFI_FECHA_MODIFICA());

		return fichaIngresoImpl;
	}

	/**
	 * Returns the ficha ingreso with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ficha ingreso
	 * @return the ficha ingreso
	 * @throws com.rec.hitss.layer.NoSuchfichaIngresoException if a ficha ingreso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public fichaIngreso findByPrimaryKey(Serializable primaryKey)
		throws NoSuchfichaIngresoException, SystemException {
		fichaIngreso fichaIngreso = fetchByPrimaryKey(primaryKey);

		if (fichaIngreso == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchfichaIngresoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return fichaIngreso;
	}

	/**
	 * Returns the ficha ingreso with the primary key or throws a {@link com.rec.hitss.layer.NoSuchfichaIngresoException} if it could not be found.
	 *
	 * @param FI_ID the primary key of the ficha ingreso
	 * @return the ficha ingreso
	 * @throws com.rec.hitss.layer.NoSuchfichaIngresoException if a ficha ingreso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public fichaIngreso findByPrimaryKey(long FI_ID)
		throws NoSuchfichaIngresoException, SystemException {
		return findByPrimaryKey((Serializable)FI_ID);
	}

	/**
	 * Returns the ficha ingreso with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ficha ingreso
	 * @return the ficha ingreso, or <code>null</code> if a ficha ingreso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public fichaIngreso fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		fichaIngreso fichaIngreso = (fichaIngreso)EntityCacheUtil.getResult(fichaIngresoModelImpl.ENTITY_CACHE_ENABLED,
				fichaIngresoImpl.class, primaryKey);

		if (fichaIngreso == _nullfichaIngreso) {
			return null;
		}

		if (fichaIngreso == null) {
			Session session = null;

			try {
				session = openSession();

				fichaIngreso = (fichaIngreso)session.get(fichaIngresoImpl.class,
						primaryKey);

				if (fichaIngreso != null) {
					cacheResult(fichaIngreso);
				}
				else {
					EntityCacheUtil.putResult(fichaIngresoModelImpl.ENTITY_CACHE_ENABLED,
						fichaIngresoImpl.class, primaryKey, _nullfichaIngreso);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(fichaIngresoModelImpl.ENTITY_CACHE_ENABLED,
					fichaIngresoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return fichaIngreso;
	}

	/**
	 * Returns the ficha ingreso with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param FI_ID the primary key of the ficha ingreso
	 * @return the ficha ingreso, or <code>null</code> if a ficha ingreso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public fichaIngreso fetchByPrimaryKey(long FI_ID) throws SystemException {
		return fetchByPrimaryKey((Serializable)FI_ID);
	}

	/**
	 * Returns all the ficha ingresos.
	 *
	 * @return the ficha ingresos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<fichaIngreso> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ficha ingresos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.fichaIngresoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ficha ingresos
	 * @param end the upper bound of the range of ficha ingresos (not inclusive)
	 * @return the range of ficha ingresos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<fichaIngreso> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ficha ingresos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.fichaIngresoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ficha ingresos
	 * @param end the upper bound of the range of ficha ingresos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ficha ingresos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<fichaIngreso> findAll(int start, int end,
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

		List<fichaIngreso> list = (List<fichaIngreso>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FICHAINGRESO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FICHAINGRESO;

				if (pagination) {
					sql = sql.concat(fichaIngresoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<fichaIngreso>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<fichaIngreso>(list);
				}
				else {
					list = (List<fichaIngreso>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the ficha ingresos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (fichaIngreso fichaIngreso : findAll()) {
			remove(fichaIngreso);
		}
	}

	/**
	 * Returns the number of ficha ingresos.
	 *
	 * @return the number of ficha ingresos
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

				Query q = session.createQuery(_SQL_COUNT_FICHAINGRESO);

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
	 * Initializes the ficha ingreso persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.fichaIngreso")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<fichaIngreso>> listenersList = new ArrayList<ModelListener<fichaIngreso>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<fichaIngreso>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(fichaIngresoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FICHAINGRESO = "SELECT fichaIngreso FROM fichaIngreso fichaIngreso";
	private static final String _SQL_COUNT_FICHAINGRESO = "SELECT COUNT(fichaIngreso) FROM fichaIngreso fichaIngreso";
	private static final String _ORDER_BY_ENTITY_ALIAS = "fichaIngreso.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No fichaIngreso exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(fichaIngresoPersistenceImpl.class);
	private static fichaIngreso _nullfichaIngreso = new fichaIngresoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<fichaIngreso> toCacheModel() {
				return _nullfichaIngresoCacheModel;
			}
		};

	private static CacheModel<fichaIngreso> _nullfichaIngresoCacheModel = new CacheModel<fichaIngreso>() {
			@Override
			public fichaIngreso toEntityModel() {
				return _nullfichaIngreso;
			}
		};
}
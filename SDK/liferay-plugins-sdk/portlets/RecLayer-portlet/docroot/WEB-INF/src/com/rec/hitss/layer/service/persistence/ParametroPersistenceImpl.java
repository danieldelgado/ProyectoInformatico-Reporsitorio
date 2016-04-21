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

import com.rec.hitss.layer.NoSuchParametroException;
import com.rec.hitss.layer.model.Parametro;
import com.rec.hitss.layer.model.impl.ParametroImpl;
import com.rec.hitss.layer.model.impl.ParametroModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the parametro service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see ParametroPersistence
 * @see ParametroUtil
 * @generated
 */
public class ParametroPersistenceImpl extends BasePersistenceImpl<Parametro>
	implements ParametroPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ParametroUtil} to access the parametro persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ParametroImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroModelImpl.FINDER_CACHE_ENABLED, ParametroImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroModelImpl.FINDER_CACHE_ENABLED, ParametroImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ParametroPersistenceImpl() {
		setModelClass(Parametro.class);
	}

	/**
	 * Caches the parametro in the entity cache if it is enabled.
	 *
	 * @param parametro the parametro
	 */
	@Override
	public void cacheResult(Parametro parametro) {
		EntityCacheUtil.putResult(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroImpl.class, parametro.getPrimaryKey(), parametro);

		parametro.resetOriginalValues();
	}

	/**
	 * Caches the parametros in the entity cache if it is enabled.
	 *
	 * @param parametros the parametros
	 */
	@Override
	public void cacheResult(List<Parametro> parametros) {
		for (Parametro parametro : parametros) {
			if (EntityCacheUtil.getResult(
						ParametroModelImpl.ENTITY_CACHE_ENABLED,
						ParametroImpl.class, parametro.getPrimaryKey()) == null) {
				cacheResult(parametro);
			}
			else {
				parametro.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all parametros.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ParametroImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ParametroImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the parametro.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Parametro parametro) {
		EntityCacheUtil.removeResult(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroImpl.class, parametro.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Parametro> parametros) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Parametro parametro : parametros) {
			EntityCacheUtil.removeResult(ParametroModelImpl.ENTITY_CACHE_ENABLED,
				ParametroImpl.class, parametro.getPrimaryKey());
		}
	}

	/**
	 * Creates a new parametro with the primary key. Does not add the parametro to the database.
	 *
	 * @param parametroId the primary key for the new parametro
	 * @return the new parametro
	 */
	@Override
	public Parametro create(long parametroId) {
		Parametro parametro = new ParametroImpl();

		parametro.setNew(true);
		parametro.setPrimaryKey(parametroId);

		return parametro;
	}

	/**
	 * Removes the parametro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param parametroId the primary key of the parametro
	 * @return the parametro that was removed
	 * @throws com.rec.hitss.layer.NoSuchParametroException if a parametro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro remove(long parametroId)
		throws NoSuchParametroException, SystemException {
		return remove((Serializable)parametroId);
	}

	/**
	 * Removes the parametro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the parametro
	 * @return the parametro that was removed
	 * @throws com.rec.hitss.layer.NoSuchParametroException if a parametro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro remove(Serializable primaryKey)
		throws NoSuchParametroException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Parametro parametro = (Parametro)session.get(ParametroImpl.class,
					primaryKey);

			if (parametro == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchParametroException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(parametro);
		}
		catch (NoSuchParametroException nsee) {
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
	protected Parametro removeImpl(Parametro parametro)
		throws SystemException {
		parametro = toUnwrappedModel(parametro);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(parametro)) {
				parametro = (Parametro)session.get(ParametroImpl.class,
						parametro.getPrimaryKeyObj());
			}

			if (parametro != null) {
				session.delete(parametro);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (parametro != null) {
			clearCache(parametro);
		}

		return parametro;
	}

	@Override
	public Parametro updateImpl(com.rec.hitss.layer.model.Parametro parametro)
		throws SystemException {
		parametro = toUnwrappedModel(parametro);

		boolean isNew = parametro.isNew();

		Session session = null;

		try {
			session = openSession();

			if (parametro.isNew()) {
				session.save(parametro);

				parametro.setNew(false);
			}
			else {
				session.merge(parametro);
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

		EntityCacheUtil.putResult(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroImpl.class, parametro.getPrimaryKey(), parametro);

		return parametro;
	}

	protected Parametro toUnwrappedModel(Parametro parametro) {
		if (parametro instanceof ParametroImpl) {
			return parametro;
		}

		ParametroImpl parametroImpl = new ParametroImpl();

		parametroImpl.setNew(parametro.isNew());
		parametroImpl.setPrimaryKey(parametro.getPrimaryKey());

		parametroImpl.setParametroId(parametro.getParametroId());
		parametroImpl.setDescripcion(parametro.getDescripcion());
		parametroImpl.setLlave(parametro.getLlave());
		parametroImpl.setValor(parametro.getValor());
		parametroImpl.setParametroPadreId(parametro.getParametroPadreId());
		parametroImpl.setActivo(parametro.isActivo());
		parametroImpl.setUsuariocrea(parametro.getUsuariocrea());
		parametroImpl.setFechacrea(parametro.getFechacrea());
		parametroImpl.setUsuariomodifica(parametro.getUsuariomodifica());
		parametroImpl.setFechacreamodifica(parametro.getFechacreamodifica());

		return parametroImpl;
	}

	/**
	 * Returns the parametro with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the parametro
	 * @return the parametro
	 * @throws com.rec.hitss.layer.NoSuchParametroException if a parametro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro findByPrimaryKey(Serializable primaryKey)
		throws NoSuchParametroException, SystemException {
		Parametro parametro = fetchByPrimaryKey(primaryKey);

		if (parametro == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchParametroException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return parametro;
	}

	/**
	 * Returns the parametro with the primary key or throws a {@link com.rec.hitss.layer.NoSuchParametroException} if it could not be found.
	 *
	 * @param parametroId the primary key of the parametro
	 * @return the parametro
	 * @throws com.rec.hitss.layer.NoSuchParametroException if a parametro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro findByPrimaryKey(long parametroId)
		throws NoSuchParametroException, SystemException {
		return findByPrimaryKey((Serializable)parametroId);
	}

	/**
	 * Returns the parametro with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the parametro
	 * @return the parametro, or <code>null</code> if a parametro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Parametro parametro = (Parametro)EntityCacheUtil.getResult(ParametroModelImpl.ENTITY_CACHE_ENABLED,
				ParametroImpl.class, primaryKey);

		if (parametro == _nullParametro) {
			return null;
		}

		if (parametro == null) {
			Session session = null;

			try {
				session = openSession();

				parametro = (Parametro)session.get(ParametroImpl.class,
						primaryKey);

				if (parametro != null) {
					cacheResult(parametro);
				}
				else {
					EntityCacheUtil.putResult(ParametroModelImpl.ENTITY_CACHE_ENABLED,
						ParametroImpl.class, primaryKey, _nullParametro);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ParametroModelImpl.ENTITY_CACHE_ENABLED,
					ParametroImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return parametro;
	}

	/**
	 * Returns the parametro with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param parametroId the primary key of the parametro
	 * @return the parametro, or <code>null</code> if a parametro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro fetchByPrimaryKey(long parametroId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)parametroId);
	}

	/**
	 * Returns all the parametros.
	 *
	 * @return the parametros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Parametro> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the parametros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of parametros
	 * @param end the upper bound of the range of parametros (not inclusive)
	 * @return the range of parametros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Parametro> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the parametros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of parametros
	 * @param end the upper bound of the range of parametros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of parametros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Parametro> findAll(int start, int end,
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

		List<Parametro> list = (List<Parametro>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PARAMETRO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PARAMETRO;

				if (pagination) {
					sql = sql.concat(ParametroModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Parametro>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Parametro>(list);
				}
				else {
					list = (List<Parametro>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the parametros from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Parametro parametro : findAll()) {
			remove(parametro);
		}
	}

	/**
	 * Returns the number of parametros.
	 *
	 * @return the number of parametros
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

				Query q = session.createQuery(_SQL_COUNT_PARAMETRO);

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
	 * Initializes the parametro persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.Parametro")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Parametro>> listenersList = new ArrayList<ModelListener<Parametro>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Parametro>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ParametroImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PARAMETRO = "SELECT parametro FROM Parametro parametro";
	private static final String _SQL_COUNT_PARAMETRO = "SELECT COUNT(parametro) FROM Parametro parametro";
	private static final String _ORDER_BY_ENTITY_ALIAS = "parametro.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Parametro exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ParametroPersistenceImpl.class);
	private static Parametro _nullParametro = new ParametroImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Parametro> toCacheModel() {
				return _nullParametroCacheModel;
			}
		};

	private static CacheModel<Parametro> _nullParametroCacheModel = new CacheModel<Parametro>() {
			@Override
			public Parametro toEntityModel() {
				return _nullParametro;
			}
		};
}
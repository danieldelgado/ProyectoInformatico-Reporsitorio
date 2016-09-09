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

import com.hitss.layer.NoSuchEstudioException;
import com.hitss.layer.model.Estudio;
import com.hitss.layer.model.impl.EstudioImpl;
import com.hitss.layer.model.impl.EstudioModelImpl;

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
 * The persistence implementation for the estudio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see EstudioPersistence
 * @see EstudioUtil
 * @generated
 */
public class EstudioPersistenceImpl extends BasePersistenceImpl<Estudio>
	implements EstudioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EstudioUtil} to access the estudio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EstudioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EstudioModelImpl.ENTITY_CACHE_ENABLED,
			EstudioModelImpl.FINDER_CACHE_ENABLED, EstudioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EstudioModelImpl.ENTITY_CACHE_ENABLED,
			EstudioModelImpl.FINDER_CACHE_ENABLED, EstudioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EstudioModelImpl.ENTITY_CACHE_ENABLED,
			EstudioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EstudioPersistenceImpl() {
		setModelClass(Estudio.class);
	}

	/**
	 * Caches the estudio in the entity cache if it is enabled.
	 *
	 * @param estudio the estudio
	 */
	@Override
	public void cacheResult(Estudio estudio) {
		EntityCacheUtil.putResult(EstudioModelImpl.ENTITY_CACHE_ENABLED,
			EstudioImpl.class, estudio.getPrimaryKey(), estudio);

		estudio.resetOriginalValues();
	}

	/**
	 * Caches the estudios in the entity cache if it is enabled.
	 *
	 * @param estudios the estudios
	 */
	@Override
	public void cacheResult(List<Estudio> estudios) {
		for (Estudio estudio : estudios) {
			if (EntityCacheUtil.getResult(
						EstudioModelImpl.ENTITY_CACHE_ENABLED,
						EstudioImpl.class, estudio.getPrimaryKey()) == null) {
				cacheResult(estudio);
			}
			else {
				estudio.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all estudios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EstudioImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EstudioImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the estudio.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Estudio estudio) {
		EntityCacheUtil.removeResult(EstudioModelImpl.ENTITY_CACHE_ENABLED,
			EstudioImpl.class, estudio.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Estudio> estudios) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Estudio estudio : estudios) {
			EntityCacheUtil.removeResult(EstudioModelImpl.ENTITY_CACHE_ENABLED,
				EstudioImpl.class, estudio.getPrimaryKey());
		}
	}

	/**
	 * Creates a new estudio with the primary key. Does not add the estudio to the database.
	 *
	 * @param estudioId the primary key for the new estudio
	 * @return the new estudio
	 */
	@Override
	public Estudio create(long estudioId) {
		Estudio estudio = new EstudioImpl();

		estudio.setNew(true);
		estudio.setPrimaryKey(estudioId);

		return estudio;
	}

	/**
	 * Removes the estudio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param estudioId the primary key of the estudio
	 * @return the estudio that was removed
	 * @throws com.hitss.layer.NoSuchEstudioException if a estudio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Estudio remove(long estudioId)
		throws NoSuchEstudioException, SystemException {
		return remove((Serializable)estudioId);
	}

	/**
	 * Removes the estudio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the estudio
	 * @return the estudio that was removed
	 * @throws com.hitss.layer.NoSuchEstudioException if a estudio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Estudio remove(Serializable primaryKey)
		throws NoSuchEstudioException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Estudio estudio = (Estudio)session.get(EstudioImpl.class, primaryKey);

			if (estudio == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEstudioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(estudio);
		}
		catch (NoSuchEstudioException nsee) {
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
	protected Estudio removeImpl(Estudio estudio) throws SystemException {
		estudio = toUnwrappedModel(estudio);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(estudio)) {
				estudio = (Estudio)session.get(EstudioImpl.class,
						estudio.getPrimaryKeyObj());
			}

			if (estudio != null) {
				session.delete(estudio);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (estudio != null) {
			clearCache(estudio);
		}

		return estudio;
	}

	@Override
	public Estudio updateImpl(com.hitss.layer.model.Estudio estudio)
		throws SystemException {
		estudio = toUnwrappedModel(estudio);

		boolean isNew = estudio.isNew();

		Session session = null;

		try {
			session = openSession();

			if (estudio.isNew()) {
				session.save(estudio);

				estudio.setNew(false);
			}
			else {
				session.merge(estudio);
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

		EntityCacheUtil.putResult(EstudioModelImpl.ENTITY_CACHE_ENABLED,
			EstudioImpl.class, estudio.getPrimaryKey(), estudio);

		return estudio;
	}

	protected Estudio toUnwrappedModel(Estudio estudio) {
		if (estudio instanceof EstudioImpl) {
			return estudio;
		}

		EstudioImpl estudioImpl = new EstudioImpl();

		estudioImpl.setNew(estudio.isNew());
		estudioImpl.setPrimaryKey(estudio.getPrimaryKey());

		estudioImpl.setEstudioId(estudio.getEstudioId());
		estudioImpl.setUsuarioId(estudio.getUsuarioId());
		estudioImpl.setNombre(estudio.getNombre());
		estudioImpl.setAnnos(estudio.getAnnos());
		estudioImpl.setActivo(estudio.isActivo());
		estudioImpl.setUsuariocrea(estudio.getUsuariocrea());
		estudioImpl.setFechacrea(estudio.getFechacrea());
		estudioImpl.setUsuariomodifica(estudio.getUsuariomodifica());
		estudioImpl.setFechamodifica(estudio.getFechamodifica());

		return estudioImpl;
	}

	/**
	 * Returns the estudio with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the estudio
	 * @return the estudio
	 * @throws com.hitss.layer.NoSuchEstudioException if a estudio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Estudio findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEstudioException, SystemException {
		Estudio estudio = fetchByPrimaryKey(primaryKey);

		if (estudio == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEstudioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return estudio;
	}

	/**
	 * Returns the estudio with the primary key or throws a {@link com.hitss.layer.NoSuchEstudioException} if it could not be found.
	 *
	 * @param estudioId the primary key of the estudio
	 * @return the estudio
	 * @throws com.hitss.layer.NoSuchEstudioException if a estudio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Estudio findByPrimaryKey(long estudioId)
		throws NoSuchEstudioException, SystemException {
		return findByPrimaryKey((Serializable)estudioId);
	}

	/**
	 * Returns the estudio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the estudio
	 * @return the estudio, or <code>null</code> if a estudio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Estudio fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Estudio estudio = (Estudio)EntityCacheUtil.getResult(EstudioModelImpl.ENTITY_CACHE_ENABLED,
				EstudioImpl.class, primaryKey);

		if (estudio == _nullEstudio) {
			return null;
		}

		if (estudio == null) {
			Session session = null;

			try {
				session = openSession();

				estudio = (Estudio)session.get(EstudioImpl.class, primaryKey);

				if (estudio != null) {
					cacheResult(estudio);
				}
				else {
					EntityCacheUtil.putResult(EstudioModelImpl.ENTITY_CACHE_ENABLED,
						EstudioImpl.class, primaryKey, _nullEstudio);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EstudioModelImpl.ENTITY_CACHE_ENABLED,
					EstudioImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return estudio;
	}

	/**
	 * Returns the estudio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param estudioId the primary key of the estudio
	 * @return the estudio, or <code>null</code> if a estudio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Estudio fetchByPrimaryKey(long estudioId) throws SystemException {
		return fetchByPrimaryKey((Serializable)estudioId);
	}

	/**
	 * Returns all the estudios.
	 *
	 * @return the estudios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Estudio> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the estudios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EstudioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of estudios
	 * @param end the upper bound of the range of estudios (not inclusive)
	 * @return the range of estudios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Estudio> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the estudios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.EstudioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of estudios
	 * @param end the upper bound of the range of estudios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of estudios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Estudio> findAll(int start, int end,
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

		List<Estudio> list = (List<Estudio>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ESTUDIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ESTUDIO;

				if (pagination) {
					sql = sql.concat(EstudioModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Estudio>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Estudio>(list);
				}
				else {
					list = (List<Estudio>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the estudios from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Estudio estudio : findAll()) {
			remove(estudio);
		}
	}

	/**
	 * Returns the number of estudios.
	 *
	 * @return the number of estudios
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

				Query q = session.createQuery(_SQL_COUNT_ESTUDIO);

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
	 * Initializes the estudio persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.Estudio")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Estudio>> listenersList = new ArrayList<ModelListener<Estudio>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Estudio>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EstudioImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ESTUDIO = "SELECT estudio FROM Estudio estudio";
	private static final String _SQL_COUNT_ESTUDIO = "SELECT COUNT(estudio) FROM Estudio estudio";
	private static final String _ORDER_BY_ENTITY_ALIAS = "estudio.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Estudio exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EstudioPersistenceImpl.class);
	private static Estudio _nullEstudio = new EstudioImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Estudio> toCacheModel() {
				return _nullEstudioCacheModel;
			}
		};

	private static CacheModel<Estudio> _nullEstudioCacheModel = new CacheModel<Estudio>() {
			@Override
			public Estudio toEntityModel() {
				return _nullEstudio;
			}
		};
}
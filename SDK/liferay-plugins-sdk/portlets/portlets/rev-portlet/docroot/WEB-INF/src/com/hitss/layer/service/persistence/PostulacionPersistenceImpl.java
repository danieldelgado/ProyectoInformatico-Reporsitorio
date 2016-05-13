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

import com.hitss.layer.NoSuchPostulacionException;
import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.impl.PostulacionImpl;
import com.hitss.layer.model.impl.PostulacionModelImpl;

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
 * The persistence implementation for the postulacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PostulacionPersistence
 * @see PostulacionUtil
 * @generated
 */
public class PostulacionPersistenceImpl extends BasePersistenceImpl<Postulacion>
	implements PostulacionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PostulacionUtil} to access the postulacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PostulacionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionModelImpl.FINDER_CACHE_ENABLED, PostulacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionModelImpl.FINDER_CACHE_ENABLED, PostulacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PostulacionPersistenceImpl() {
		setModelClass(Postulacion.class);
	}

	/**
	 * Caches the postulacion in the entity cache if it is enabled.
	 *
	 * @param postulacion the postulacion
	 */
	@Override
	public void cacheResult(Postulacion postulacion) {
		EntityCacheUtil.putResult(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionImpl.class, postulacion.getPrimaryKey(), postulacion);

		postulacion.resetOriginalValues();
	}

	/**
	 * Caches the postulacions in the entity cache if it is enabled.
	 *
	 * @param postulacions the postulacions
	 */
	@Override
	public void cacheResult(List<Postulacion> postulacions) {
		for (Postulacion postulacion : postulacions) {
			if (EntityCacheUtil.getResult(
						PostulacionModelImpl.ENTITY_CACHE_ENABLED,
						PostulacionImpl.class, postulacion.getPrimaryKey()) == null) {
				cacheResult(postulacion);
			}
			else {
				postulacion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all postulacions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PostulacionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PostulacionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the postulacion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Postulacion postulacion) {
		EntityCacheUtil.removeResult(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionImpl.class, postulacion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Postulacion> postulacions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Postulacion postulacion : postulacions) {
			EntityCacheUtil.removeResult(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
				PostulacionImpl.class, postulacion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new postulacion with the primary key. Does not add the postulacion to the database.
	 *
	 * @param postulacionPK the primary key for the new postulacion
	 * @return the new postulacion
	 */
	@Override
	public Postulacion create(PostulacionPK postulacionPK) {
		Postulacion postulacion = new PostulacionImpl();

		postulacion.setNew(true);
		postulacion.setPrimaryKey(postulacionPK);

		return postulacion;
	}

	/**
	 * Removes the postulacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param postulacionPK the primary key of the postulacion
	 * @return the postulacion that was removed
	 * @throws com.hitss.layer.NoSuchPostulacionException if a postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion remove(PostulacionPK postulacionPK)
		throws NoSuchPostulacionException, SystemException {
		return remove((Serializable)postulacionPK);
	}

	/**
	 * Removes the postulacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the postulacion
	 * @return the postulacion that was removed
	 * @throws com.hitss.layer.NoSuchPostulacionException if a postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion remove(Serializable primaryKey)
		throws NoSuchPostulacionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Postulacion postulacion = (Postulacion)session.get(PostulacionImpl.class,
					primaryKey);

			if (postulacion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPostulacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(postulacion);
		}
		catch (NoSuchPostulacionException nsee) {
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
	protected Postulacion removeImpl(Postulacion postulacion)
		throws SystemException {
		postulacion = toUnwrappedModel(postulacion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(postulacion)) {
				postulacion = (Postulacion)session.get(PostulacionImpl.class,
						postulacion.getPrimaryKeyObj());
			}

			if (postulacion != null) {
				session.delete(postulacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (postulacion != null) {
			clearCache(postulacion);
		}

		return postulacion;
	}

	@Override
	public Postulacion updateImpl(com.hitss.layer.model.Postulacion postulacion)
		throws SystemException {
		postulacion = toUnwrappedModel(postulacion);

		boolean isNew = postulacion.isNew();

		Session session = null;

		try {
			session = openSession();

			if (postulacion.isNew()) {
				session.save(postulacion);

				postulacion.setNew(false);
			}
			else {
				session.merge(postulacion);
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

		EntityCacheUtil.putResult(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
			PostulacionImpl.class, postulacion.getPrimaryKey(), postulacion);

		return postulacion;
	}

	protected Postulacion toUnwrappedModel(Postulacion postulacion) {
		if (postulacion instanceof PostulacionImpl) {
			return postulacion;
		}

		PostulacionImpl postulacionImpl = new PostulacionImpl();

		postulacionImpl.setNew(postulacion.isNew());
		postulacionImpl.setPrimaryKey(postulacion.getPrimaryKey());

		postulacionImpl.setSolicitudRequerimientoId(postulacion.getSolicitudRequerimientoId());
		postulacionImpl.setUsuarioId(postulacion.getUsuarioId());
		postulacionImpl.setFechaPostulacion(postulacion.getFechaPostulacion());
		postulacionImpl.setEstado(postulacion.getEstado());
		postulacionImpl.setActivo(postulacion.isActivo());
		postulacionImpl.setUsuariocrea(postulacion.getUsuariocrea());
		postulacionImpl.setFechacrea(postulacion.getFechacrea());
		postulacionImpl.setUsuariomodifica(postulacion.getUsuariomodifica());
		postulacionImpl.setFechacreamodifica(postulacion.getFechacreamodifica());

		return postulacionImpl;
	}

	/**
	 * Returns the postulacion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the postulacion
	 * @return the postulacion
	 * @throws com.hitss.layer.NoSuchPostulacionException if a postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPostulacionException, SystemException {
		Postulacion postulacion = fetchByPrimaryKey(primaryKey);

		if (postulacion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPostulacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return postulacion;
	}

	/**
	 * Returns the postulacion with the primary key or throws a {@link com.hitss.layer.NoSuchPostulacionException} if it could not be found.
	 *
	 * @param postulacionPK the primary key of the postulacion
	 * @return the postulacion
	 * @throws com.hitss.layer.NoSuchPostulacionException if a postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion findByPrimaryKey(PostulacionPK postulacionPK)
		throws NoSuchPostulacionException, SystemException {
		return findByPrimaryKey((Serializable)postulacionPK);
	}

	/**
	 * Returns the postulacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the postulacion
	 * @return the postulacion, or <code>null</code> if a postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Postulacion postulacion = (Postulacion)EntityCacheUtil.getResult(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
				PostulacionImpl.class, primaryKey);

		if (postulacion == _nullPostulacion) {
			return null;
		}

		if (postulacion == null) {
			Session session = null;

			try {
				session = openSession();

				postulacion = (Postulacion)session.get(PostulacionImpl.class,
						primaryKey);

				if (postulacion != null) {
					cacheResult(postulacion);
				}
				else {
					EntityCacheUtil.putResult(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
						PostulacionImpl.class, primaryKey, _nullPostulacion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PostulacionModelImpl.ENTITY_CACHE_ENABLED,
					PostulacionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return postulacion;
	}

	/**
	 * Returns the postulacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param postulacionPK the primary key of the postulacion
	 * @return the postulacion, or <code>null</code> if a postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Postulacion fetchByPrimaryKey(PostulacionPK postulacionPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)postulacionPK);
	}

	/**
	 * Returns all the postulacions.
	 *
	 * @return the postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Postulacion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the postulacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of postulacions
	 * @param end the upper bound of the range of postulacions (not inclusive)
	 * @return the range of postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Postulacion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the postulacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of postulacions
	 * @param end the upper bound of the range of postulacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Postulacion> findAll(int start, int end,
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

		List<Postulacion> list = (List<Postulacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_POSTULACION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POSTULACION;

				if (pagination) {
					sql = sql.concat(PostulacionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Postulacion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Postulacion>(list);
				}
				else {
					list = (List<Postulacion>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the postulacions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Postulacion postulacion : findAll()) {
			remove(postulacion);
		}
	}

	/**
	 * Returns the number of postulacions.
	 *
	 * @return the number of postulacions
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

				Query q = session.createQuery(_SQL_COUNT_POSTULACION);

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
	 * Initializes the postulacion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.Postulacion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Postulacion>> listenersList = new ArrayList<ModelListener<Postulacion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Postulacion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PostulacionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_POSTULACION = "SELECT postulacion FROM Postulacion postulacion";
	private static final String _SQL_COUNT_POSTULACION = "SELECT COUNT(postulacion) FROM Postulacion postulacion";
	private static final String _ORDER_BY_ENTITY_ALIAS = "postulacion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Postulacion exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PostulacionPersistenceImpl.class);
	private static Postulacion _nullPostulacion = new PostulacionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Postulacion> toCacheModel() {
				return _nullPostulacionCacheModel;
			}
		};

	private static CacheModel<Postulacion> _nullPostulacionCacheModel = new CacheModel<Postulacion>() {
			@Override
			public Postulacion toEntityModel() {
				return _nullPostulacion;
			}
		};
}
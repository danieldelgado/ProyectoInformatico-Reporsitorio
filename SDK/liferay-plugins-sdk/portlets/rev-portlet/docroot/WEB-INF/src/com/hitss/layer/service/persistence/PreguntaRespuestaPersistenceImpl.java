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

import com.hitss.layer.NoSuchPreguntaRespuestaException;
import com.hitss.layer.model.PreguntaRespuesta;
import com.hitss.layer.model.impl.PreguntaRespuestaImpl;
import com.hitss.layer.model.impl.PreguntaRespuestaModelImpl;

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
 * The persistence implementation for the pregunta respuesta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PreguntaRespuestaPersistence
 * @see PreguntaRespuestaUtil
 * @generated
 */
public class PreguntaRespuestaPersistenceImpl extends BasePersistenceImpl<PreguntaRespuesta>
	implements PreguntaRespuestaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PreguntaRespuestaUtil} to access the pregunta respuesta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PreguntaRespuestaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PreguntaRespuestaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaRespuestaModelImpl.FINDER_CACHE_ENABLED,
			PreguntaRespuestaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PreguntaRespuestaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaRespuestaModelImpl.FINDER_CACHE_ENABLED,
			PreguntaRespuestaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PreguntaRespuestaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaRespuestaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PreguntaRespuestaPersistenceImpl() {
		setModelClass(PreguntaRespuesta.class);
	}

	/**
	 * Caches the pregunta respuesta in the entity cache if it is enabled.
	 *
	 * @param preguntaRespuesta the pregunta respuesta
	 */
	@Override
	public void cacheResult(PreguntaRespuesta preguntaRespuesta) {
		EntityCacheUtil.putResult(PreguntaRespuestaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaRespuestaImpl.class, preguntaRespuesta.getPrimaryKey(),
			preguntaRespuesta);

		preguntaRespuesta.resetOriginalValues();
	}

	/**
	 * Caches the pregunta respuestas in the entity cache if it is enabled.
	 *
	 * @param preguntaRespuestas the pregunta respuestas
	 */
	@Override
	public void cacheResult(List<PreguntaRespuesta> preguntaRespuestas) {
		for (PreguntaRespuesta preguntaRespuesta : preguntaRespuestas) {
			if (EntityCacheUtil.getResult(
						PreguntaRespuestaModelImpl.ENTITY_CACHE_ENABLED,
						PreguntaRespuestaImpl.class,
						preguntaRespuesta.getPrimaryKey()) == null) {
				cacheResult(preguntaRespuesta);
			}
			else {
				preguntaRespuesta.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all pregunta respuestas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PreguntaRespuestaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PreguntaRespuestaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the pregunta respuesta.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PreguntaRespuesta preguntaRespuesta) {
		EntityCacheUtil.removeResult(PreguntaRespuestaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaRespuestaImpl.class, preguntaRespuesta.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PreguntaRespuesta> preguntaRespuestas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PreguntaRespuesta preguntaRespuesta : preguntaRespuestas) {
			EntityCacheUtil.removeResult(PreguntaRespuestaModelImpl.ENTITY_CACHE_ENABLED,
				PreguntaRespuestaImpl.class, preguntaRespuesta.getPrimaryKey());
		}
	}

	/**
	 * Creates a new pregunta respuesta with the primary key. Does not add the pregunta respuesta to the database.
	 *
	 * @param preguntaRespuestaPK the primary key for the new pregunta respuesta
	 * @return the new pregunta respuesta
	 */
	@Override
	public PreguntaRespuesta create(PreguntaRespuestaPK preguntaRespuestaPK) {
		PreguntaRespuesta preguntaRespuesta = new PreguntaRespuestaImpl();

		preguntaRespuesta.setNew(true);
		preguntaRespuesta.setPrimaryKey(preguntaRespuestaPK);

		return preguntaRespuesta;
	}

	/**
	 * Removes the pregunta respuesta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param preguntaRespuestaPK the primary key of the pregunta respuesta
	 * @return the pregunta respuesta that was removed
	 * @throws com.hitss.layer.NoSuchPreguntaRespuestaException if a pregunta respuesta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PreguntaRespuesta remove(PreguntaRespuestaPK preguntaRespuestaPK)
		throws NoSuchPreguntaRespuestaException, SystemException {
		return remove((Serializable)preguntaRespuestaPK);
	}

	/**
	 * Removes the pregunta respuesta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pregunta respuesta
	 * @return the pregunta respuesta that was removed
	 * @throws com.hitss.layer.NoSuchPreguntaRespuestaException if a pregunta respuesta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PreguntaRespuesta remove(Serializable primaryKey)
		throws NoSuchPreguntaRespuestaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PreguntaRespuesta preguntaRespuesta = (PreguntaRespuesta)session.get(PreguntaRespuestaImpl.class,
					primaryKey);

			if (preguntaRespuesta == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPreguntaRespuestaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(preguntaRespuesta);
		}
		catch (NoSuchPreguntaRespuestaException nsee) {
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
	protected PreguntaRespuesta removeImpl(PreguntaRespuesta preguntaRespuesta)
		throws SystemException {
		preguntaRespuesta = toUnwrappedModel(preguntaRespuesta);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(preguntaRespuesta)) {
				preguntaRespuesta = (PreguntaRespuesta)session.get(PreguntaRespuestaImpl.class,
						preguntaRespuesta.getPrimaryKeyObj());
			}

			if (preguntaRespuesta != null) {
				session.delete(preguntaRespuesta);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (preguntaRespuesta != null) {
			clearCache(preguntaRespuesta);
		}

		return preguntaRespuesta;
	}

	@Override
	public PreguntaRespuesta updateImpl(
		com.hitss.layer.model.PreguntaRespuesta preguntaRespuesta)
		throws SystemException {
		preguntaRespuesta = toUnwrappedModel(preguntaRespuesta);

		boolean isNew = preguntaRespuesta.isNew();

		Session session = null;

		try {
			session = openSession();

			if (preguntaRespuesta.isNew()) {
				session.save(preguntaRespuesta);

				preguntaRespuesta.setNew(false);
			}
			else {
				session.merge(preguntaRespuesta);
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

		EntityCacheUtil.putResult(PreguntaRespuestaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaRespuestaImpl.class, preguntaRespuesta.getPrimaryKey(),
			preguntaRespuesta);

		return preguntaRespuesta;
	}

	protected PreguntaRespuesta toUnwrappedModel(
		PreguntaRespuesta preguntaRespuesta) {
		if (preguntaRespuesta instanceof PreguntaRespuestaImpl) {
			return preguntaRespuesta;
		}

		PreguntaRespuestaImpl preguntaRespuestaImpl = new PreguntaRespuestaImpl();

		preguntaRespuestaImpl.setNew(preguntaRespuesta.isNew());
		preguntaRespuestaImpl.setPrimaryKey(preguntaRespuesta.getPrimaryKey());

		preguntaRespuestaImpl.setPreguntaId(preguntaRespuesta.getPreguntaId());
		preguntaRespuestaImpl.setRespuestaId(preguntaRespuesta.getRespuestaId());

		return preguntaRespuestaImpl;
	}

	/**
	 * Returns the pregunta respuesta with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the pregunta respuesta
	 * @return the pregunta respuesta
	 * @throws com.hitss.layer.NoSuchPreguntaRespuestaException if a pregunta respuesta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PreguntaRespuesta findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPreguntaRespuestaException, SystemException {
		PreguntaRespuesta preguntaRespuesta = fetchByPrimaryKey(primaryKey);

		if (preguntaRespuesta == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPreguntaRespuestaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return preguntaRespuesta;
	}

	/**
	 * Returns the pregunta respuesta with the primary key or throws a {@link com.hitss.layer.NoSuchPreguntaRespuestaException} if it could not be found.
	 *
	 * @param preguntaRespuestaPK the primary key of the pregunta respuesta
	 * @return the pregunta respuesta
	 * @throws com.hitss.layer.NoSuchPreguntaRespuestaException if a pregunta respuesta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PreguntaRespuesta findByPrimaryKey(
		PreguntaRespuestaPK preguntaRespuestaPK)
		throws NoSuchPreguntaRespuestaException, SystemException {
		return findByPrimaryKey((Serializable)preguntaRespuestaPK);
	}

	/**
	 * Returns the pregunta respuesta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pregunta respuesta
	 * @return the pregunta respuesta, or <code>null</code> if a pregunta respuesta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PreguntaRespuesta fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PreguntaRespuesta preguntaRespuesta = (PreguntaRespuesta)EntityCacheUtil.getResult(PreguntaRespuestaModelImpl.ENTITY_CACHE_ENABLED,
				PreguntaRespuestaImpl.class, primaryKey);

		if (preguntaRespuesta == _nullPreguntaRespuesta) {
			return null;
		}

		if (preguntaRespuesta == null) {
			Session session = null;

			try {
				session = openSession();

				preguntaRespuesta = (PreguntaRespuesta)session.get(PreguntaRespuestaImpl.class,
						primaryKey);

				if (preguntaRespuesta != null) {
					cacheResult(preguntaRespuesta);
				}
				else {
					EntityCacheUtil.putResult(PreguntaRespuestaModelImpl.ENTITY_CACHE_ENABLED,
						PreguntaRespuestaImpl.class, primaryKey,
						_nullPreguntaRespuesta);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PreguntaRespuestaModelImpl.ENTITY_CACHE_ENABLED,
					PreguntaRespuestaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return preguntaRespuesta;
	}

	/**
	 * Returns the pregunta respuesta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param preguntaRespuestaPK the primary key of the pregunta respuesta
	 * @return the pregunta respuesta, or <code>null</code> if a pregunta respuesta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PreguntaRespuesta fetchByPrimaryKey(
		PreguntaRespuestaPK preguntaRespuestaPK) throws SystemException {
		return fetchByPrimaryKey((Serializable)preguntaRespuestaPK);
	}

	/**
	 * Returns all the pregunta respuestas.
	 *
	 * @return the pregunta respuestas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PreguntaRespuesta> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pregunta respuestas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PreguntaRespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pregunta respuestas
	 * @param end the upper bound of the range of pregunta respuestas (not inclusive)
	 * @return the range of pregunta respuestas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PreguntaRespuesta> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pregunta respuestas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PreguntaRespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pregunta respuestas
	 * @param end the upper bound of the range of pregunta respuestas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pregunta respuestas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PreguntaRespuesta> findAll(int start, int end,
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

		List<PreguntaRespuesta> list = (List<PreguntaRespuesta>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PREGUNTARESPUESTA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PREGUNTARESPUESTA;

				if (pagination) {
					sql = sql.concat(PreguntaRespuestaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PreguntaRespuesta>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PreguntaRespuesta>(list);
				}
				else {
					list = (List<PreguntaRespuesta>)QueryUtil.list(q,
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
	 * Removes all the pregunta respuestas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PreguntaRespuesta preguntaRespuesta : findAll()) {
			remove(preguntaRespuesta);
		}
	}

	/**
	 * Returns the number of pregunta respuestas.
	 *
	 * @return the number of pregunta respuestas
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

				Query q = session.createQuery(_SQL_COUNT_PREGUNTARESPUESTA);

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
	 * Initializes the pregunta respuesta persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.PreguntaRespuesta")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PreguntaRespuesta>> listenersList = new ArrayList<ModelListener<PreguntaRespuesta>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PreguntaRespuesta>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PreguntaRespuestaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PREGUNTARESPUESTA = "SELECT preguntaRespuesta FROM PreguntaRespuesta preguntaRespuesta";
	private static final String _SQL_COUNT_PREGUNTARESPUESTA = "SELECT COUNT(preguntaRespuesta) FROM PreguntaRespuesta preguntaRespuesta";
	private static final String _ORDER_BY_ENTITY_ALIAS = "preguntaRespuesta.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PreguntaRespuesta exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PreguntaRespuestaPersistenceImpl.class);
	private static PreguntaRespuesta _nullPreguntaRespuesta = new PreguntaRespuestaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PreguntaRespuesta> toCacheModel() {
				return _nullPreguntaRespuestaCacheModel;
			}
		};

	private static CacheModel<PreguntaRespuesta> _nullPreguntaRespuestaCacheModel =
		new CacheModel<PreguntaRespuesta>() {
			@Override
			public PreguntaRespuesta toEntityModel() {
				return _nullPreguntaRespuesta;
			}
		};
}
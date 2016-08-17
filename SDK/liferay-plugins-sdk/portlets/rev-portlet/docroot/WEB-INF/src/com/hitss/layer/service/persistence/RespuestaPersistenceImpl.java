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

import com.hitss.layer.NoSuchRespuestaException;
import com.hitss.layer.model.Respuesta;
import com.hitss.layer.model.impl.RespuestaImpl;
import com.hitss.layer.model.impl.RespuestaModelImpl;

import com.liferay.portal.kernel.bean.BeanReference;
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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the respuesta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see RespuestaPersistence
 * @see RespuestaUtil
 * @generated
 */
public class RespuestaPersistenceImpl extends BasePersistenceImpl<Respuesta>
	implements RespuestaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RespuestaUtil} to access the respuesta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RespuestaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
			RespuestaModelImpl.FINDER_CACHE_ENABLED, RespuestaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
			RespuestaModelImpl.FINDER_CACHE_ENABLED, RespuestaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
			RespuestaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public RespuestaPersistenceImpl() {
		setModelClass(Respuesta.class);
	}

	/**
	 * Caches the respuesta in the entity cache if it is enabled.
	 *
	 * @param respuesta the respuesta
	 */
	@Override
	public void cacheResult(Respuesta respuesta) {
		EntityCacheUtil.putResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
			RespuestaImpl.class, respuesta.getPrimaryKey(), respuesta);

		respuesta.resetOriginalValues();
	}

	/**
	 * Caches the respuestas in the entity cache if it is enabled.
	 *
	 * @param respuestas the respuestas
	 */
	@Override
	public void cacheResult(List<Respuesta> respuestas) {
		for (Respuesta respuesta : respuestas) {
			if (EntityCacheUtil.getResult(
						RespuestaModelImpl.ENTITY_CACHE_ENABLED,
						RespuestaImpl.class, respuesta.getPrimaryKey()) == null) {
				cacheResult(respuesta);
			}
			else {
				respuesta.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all respuestas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RespuestaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RespuestaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the respuesta.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Respuesta respuesta) {
		EntityCacheUtil.removeResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
			RespuestaImpl.class, respuesta.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Respuesta> respuestas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Respuesta respuesta : respuestas) {
			EntityCacheUtil.removeResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
				RespuestaImpl.class, respuesta.getPrimaryKey());
		}
	}

	/**
	 * Creates a new respuesta with the primary key. Does not add the respuesta to the database.
	 *
	 * @param respuestaId the primary key for the new respuesta
	 * @return the new respuesta
	 */
	@Override
	public Respuesta create(long respuestaId) {
		Respuesta respuesta = new RespuestaImpl();

		respuesta.setNew(true);
		respuesta.setPrimaryKey(respuestaId);

		return respuesta;
	}

	/**
	 * Removes the respuesta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param respuestaId the primary key of the respuesta
	 * @return the respuesta that was removed
	 * @throws com.hitss.layer.NoSuchRespuestaException if a respuesta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Respuesta remove(long respuestaId)
		throws NoSuchRespuestaException, SystemException {
		return remove((Serializable)respuestaId);
	}

	/**
	 * Removes the respuesta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the respuesta
	 * @return the respuesta that was removed
	 * @throws com.hitss.layer.NoSuchRespuestaException if a respuesta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Respuesta remove(Serializable primaryKey)
		throws NoSuchRespuestaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Respuesta respuesta = (Respuesta)session.get(RespuestaImpl.class,
					primaryKey);

			if (respuesta == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRespuestaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(respuesta);
		}
		catch (NoSuchRespuestaException nsee) {
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
	protected Respuesta removeImpl(Respuesta respuesta)
		throws SystemException {
		respuesta = toUnwrappedModel(respuesta);

		respuestaToPreguntaTableMapper.deleteLeftPrimaryKeyTableMappings(respuesta.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(respuesta)) {
				respuesta = (Respuesta)session.get(RespuestaImpl.class,
						respuesta.getPrimaryKeyObj());
			}

			if (respuesta != null) {
				session.delete(respuesta);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (respuesta != null) {
			clearCache(respuesta);
		}

		return respuesta;
	}

	@Override
	public Respuesta updateImpl(com.hitss.layer.model.Respuesta respuesta)
		throws SystemException {
		respuesta = toUnwrappedModel(respuesta);

		boolean isNew = respuesta.isNew();

		Session session = null;

		try {
			session = openSession();

			if (respuesta.isNew()) {
				session.save(respuesta);

				respuesta.setNew(false);
			}
			else {
				session.merge(respuesta);
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

		EntityCacheUtil.putResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
			RespuestaImpl.class, respuesta.getPrimaryKey(), respuesta);

		return respuesta;
	}

	protected Respuesta toUnwrappedModel(Respuesta respuesta) {
		if (respuesta instanceof RespuestaImpl) {
			return respuesta;
		}

		RespuestaImpl respuestaImpl = new RespuestaImpl();

		respuestaImpl.setNew(respuesta.isNew());
		respuestaImpl.setPrimaryKey(respuesta.getPrimaryKey());

		respuestaImpl.setRespuestaId(respuesta.getRespuestaId());
		respuestaImpl.setDescripcion(respuesta.getDescripcion());
		respuestaImpl.setCorrecta(respuesta.isCorrecta());
		respuestaImpl.setActivo(respuesta.isActivo());
		respuestaImpl.setUsuariocrea(respuesta.getUsuariocrea());
		respuestaImpl.setFechacrea(respuesta.getFechacrea());
		respuestaImpl.setUsuariomodifica(respuesta.getUsuariomodifica());
		respuestaImpl.setFechamodifica(respuesta.getFechamodifica());

		return respuestaImpl;
	}

	/**
	 * Returns the respuesta with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the respuesta
	 * @return the respuesta
	 * @throws com.hitss.layer.NoSuchRespuestaException if a respuesta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Respuesta findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRespuestaException, SystemException {
		Respuesta respuesta = fetchByPrimaryKey(primaryKey);

		if (respuesta == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRespuestaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return respuesta;
	}

	/**
	 * Returns the respuesta with the primary key or throws a {@link com.hitss.layer.NoSuchRespuestaException} if it could not be found.
	 *
	 * @param respuestaId the primary key of the respuesta
	 * @return the respuesta
	 * @throws com.hitss.layer.NoSuchRespuestaException if a respuesta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Respuesta findByPrimaryKey(long respuestaId)
		throws NoSuchRespuestaException, SystemException {
		return findByPrimaryKey((Serializable)respuestaId);
	}

	/**
	 * Returns the respuesta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the respuesta
	 * @return the respuesta, or <code>null</code> if a respuesta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Respuesta fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Respuesta respuesta = (Respuesta)EntityCacheUtil.getResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
				RespuestaImpl.class, primaryKey);

		if (respuesta == _nullRespuesta) {
			return null;
		}

		if (respuesta == null) {
			Session session = null;

			try {
				session = openSession();

				respuesta = (Respuesta)session.get(RespuestaImpl.class,
						primaryKey);

				if (respuesta != null) {
					cacheResult(respuesta);
				}
				else {
					EntityCacheUtil.putResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
						RespuestaImpl.class, primaryKey, _nullRespuesta);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
					RespuestaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return respuesta;
	}

	/**
	 * Returns the respuesta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param respuestaId the primary key of the respuesta
	 * @return the respuesta, or <code>null</code> if a respuesta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Respuesta fetchByPrimaryKey(long respuestaId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)respuestaId);
	}

	/**
	 * Returns all the respuestas.
	 *
	 * @return the respuestas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Respuesta> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the respuestas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of respuestas
	 * @param end the upper bound of the range of respuestas (not inclusive)
	 * @return the range of respuestas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Respuesta> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the respuestas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of respuestas
	 * @param end the upper bound of the range of respuestas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of respuestas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Respuesta> findAll(int start, int end,
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

		List<Respuesta> list = (List<Respuesta>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RESPUESTA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RESPUESTA;

				if (pagination) {
					sql = sql.concat(RespuestaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Respuesta>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Respuesta>(list);
				}
				else {
					list = (List<Respuesta>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the respuestas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Respuesta respuesta : findAll()) {
			remove(respuesta);
		}
	}

	/**
	 * Returns the number of respuestas.
	 *
	 * @return the number of respuestas
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

				Query q = session.createQuery(_SQL_COUNT_RESPUESTA);

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
	 * Returns all the preguntas associated with the respuesta.
	 *
	 * @param pk the primary key of the respuesta
	 * @return the preguntas associated with the respuesta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.hitss.layer.model.Pregunta> getPreguntas(long pk)
		throws SystemException {
		return getPreguntas(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the preguntas associated with the respuesta.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the respuesta
	 * @param start the lower bound of the range of respuestas
	 * @param end the upper bound of the range of respuestas (not inclusive)
	 * @return the range of preguntas associated with the respuesta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.hitss.layer.model.Pregunta> getPreguntas(long pk,
		int start, int end) throws SystemException {
		return getPreguntas(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the preguntas associated with the respuesta.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the respuesta
	 * @param start the lower bound of the range of respuestas
	 * @param end the upper bound of the range of respuestas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of preguntas associated with the respuesta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.hitss.layer.model.Pregunta> getPreguntas(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return respuestaToPreguntaTableMapper.getRightBaseModels(pk, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of preguntas associated with the respuesta.
	 *
	 * @param pk the primary key of the respuesta
	 * @return the number of preguntas associated with the respuesta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getPreguntasSize(long pk) throws SystemException {
		long[] pks = respuestaToPreguntaTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the pregunta is associated with the respuesta.
	 *
	 * @param pk the primary key of the respuesta
	 * @param preguntaPK the primary key of the pregunta
	 * @return <code>true</code> if the pregunta is associated with the respuesta; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsPregunta(long pk, long preguntaPK)
		throws SystemException {
		return respuestaToPreguntaTableMapper.containsTableMapping(pk,
			preguntaPK);
	}

	/**
	 * Returns <code>true</code> if the respuesta has any preguntas associated with it.
	 *
	 * @param pk the primary key of the respuesta to check for associations with preguntas
	 * @return <code>true</code> if the respuesta has any preguntas associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsPreguntas(long pk) throws SystemException {
		if (getPreguntasSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the respuesta and the pregunta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the respuesta
	 * @param preguntaPK the primary key of the pregunta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addPregunta(long pk, long preguntaPK) throws SystemException {
		respuestaToPreguntaTableMapper.addTableMapping(pk, preguntaPK);
	}

	/**
	 * Adds an association between the respuesta and the pregunta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the respuesta
	 * @param pregunta the pregunta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addPregunta(long pk, com.hitss.layer.model.Pregunta pregunta)
		throws SystemException {
		respuestaToPreguntaTableMapper.addTableMapping(pk,
			pregunta.getPrimaryKey());
	}

	/**
	 * Adds an association between the respuesta and the preguntas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the respuesta
	 * @param preguntaPKs the primary keys of the preguntas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addPreguntas(long pk, long[] preguntaPKs)
		throws SystemException {
		for (long preguntaPK : preguntaPKs) {
			respuestaToPreguntaTableMapper.addTableMapping(pk, preguntaPK);
		}
	}

	/**
	 * Adds an association between the respuesta and the preguntas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the respuesta
	 * @param preguntas the preguntas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addPreguntas(long pk,
		List<com.hitss.layer.model.Pregunta> preguntas)
		throws SystemException {
		for (com.hitss.layer.model.Pregunta pregunta : preguntas) {
			respuestaToPreguntaTableMapper.addTableMapping(pk,
				pregunta.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the respuesta and its preguntas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the respuesta to clear the associated preguntas from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearPreguntas(long pk) throws SystemException {
		respuestaToPreguntaTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the respuesta and the pregunta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the respuesta
	 * @param preguntaPK the primary key of the pregunta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removePregunta(long pk, long preguntaPK)
		throws SystemException {
		respuestaToPreguntaTableMapper.deleteTableMapping(pk, preguntaPK);
	}

	/**
	 * Removes the association between the respuesta and the pregunta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the respuesta
	 * @param pregunta the pregunta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removePregunta(long pk, com.hitss.layer.model.Pregunta pregunta)
		throws SystemException {
		respuestaToPreguntaTableMapper.deleteTableMapping(pk,
			pregunta.getPrimaryKey());
	}

	/**
	 * Removes the association between the respuesta and the preguntas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the respuesta
	 * @param preguntaPKs the primary keys of the preguntas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removePreguntas(long pk, long[] preguntaPKs)
		throws SystemException {
		for (long preguntaPK : preguntaPKs) {
			respuestaToPreguntaTableMapper.deleteTableMapping(pk, preguntaPK);
		}
	}

	/**
	 * Removes the association between the respuesta and the preguntas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the respuesta
	 * @param preguntas the preguntas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removePreguntas(long pk,
		List<com.hitss.layer.model.Pregunta> preguntas)
		throws SystemException {
		for (com.hitss.layer.model.Pregunta pregunta : preguntas) {
			respuestaToPreguntaTableMapper.deleteTableMapping(pk,
				pregunta.getPrimaryKey());
		}
	}

	/**
	 * Sets the preguntas associated with the respuesta, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the respuesta
	 * @param preguntaPKs the primary keys of the preguntas to be associated with the respuesta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setPreguntas(long pk, long[] preguntaPKs)
		throws SystemException {
		Set<Long> newPreguntaPKsSet = SetUtil.fromArray(preguntaPKs);
		Set<Long> oldPreguntaPKsSet = SetUtil.fromArray(respuestaToPreguntaTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removePreguntaPKsSet = new HashSet<Long>(oldPreguntaPKsSet);

		removePreguntaPKsSet.removeAll(newPreguntaPKsSet);

		for (long removePreguntaPK : removePreguntaPKsSet) {
			respuestaToPreguntaTableMapper.deleteTableMapping(pk,
				removePreguntaPK);
		}

		newPreguntaPKsSet.removeAll(oldPreguntaPKsSet);

		for (long newPreguntaPK : newPreguntaPKsSet) {
			respuestaToPreguntaTableMapper.addTableMapping(pk, newPreguntaPK);
		}
	}

	/**
	 * Sets the preguntas associated with the respuesta, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the respuesta
	 * @param preguntas the preguntas to be associated with the respuesta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setPreguntas(long pk,
		List<com.hitss.layer.model.Pregunta> preguntas)
		throws SystemException {
		try {
			long[] preguntaPKs = new long[preguntas.size()];

			for (int i = 0; i < preguntas.size(); i++) {
				com.hitss.layer.model.Pregunta pregunta = preguntas.get(i);

				preguntaPKs[i] = pregunta.getPrimaryKey();
			}

			setPreguntas(pk, preguntaPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(RespuestaModelImpl.MAPPING_TABLE_REC_PREGUNTARESPUESTA_NAME);
		}
	}

	/**
	 * Initializes the respuesta persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.Respuesta")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Respuesta>> listenersList = new ArrayList<ModelListener<Respuesta>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Respuesta>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		respuestaToPreguntaTableMapper = TableMapperFactory.getTableMapper("rec_PreguntaRespuesta",
				"respuestaId", "preguntaId", this, preguntaPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(RespuestaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("rec_PreguntaRespuesta");
	}

	@BeanReference(type = PreguntaPersistence.class)
	protected PreguntaPersistence preguntaPersistence;
	protected TableMapper<Respuesta, com.hitss.layer.model.Pregunta> respuestaToPreguntaTableMapper;
	private static final String _SQL_SELECT_RESPUESTA = "SELECT respuesta FROM Respuesta respuesta";
	private static final String _SQL_COUNT_RESPUESTA = "SELECT COUNT(respuesta) FROM Respuesta respuesta";
	private static final String _ORDER_BY_ENTITY_ALIAS = "respuesta.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Respuesta exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RespuestaPersistenceImpl.class);
	private static Respuesta _nullRespuesta = new RespuestaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Respuesta> toCacheModel() {
				return _nullRespuestaCacheModel;
			}
		};

	private static CacheModel<Respuesta> _nullRespuestaCacheModel = new CacheModel<Respuesta>() {
			@Override
			public Respuesta toEntityModel() {
				return _nullRespuesta;
			}
		};
}
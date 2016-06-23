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

import com.hitss.layer.NoSuchPreguntaException;
import com.hitss.layer.model.Pregunta;
import com.hitss.layer.model.impl.PreguntaImpl;
import com.hitss.layer.model.impl.PreguntaModelImpl;

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
 * The persistence implementation for the pregunta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see PreguntaPersistence
 * @see PreguntaUtil
 * @generated
 */
public class PreguntaPersistenceImpl extends BasePersistenceImpl<Pregunta>
	implements PreguntaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PreguntaUtil} to access the pregunta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PreguntaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaModelImpl.FINDER_CACHE_ENABLED, PreguntaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaModelImpl.FINDER_CACHE_ENABLED, PreguntaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PreguntaPersistenceImpl() {
		setModelClass(Pregunta.class);
	}

	/**
	 * Caches the pregunta in the entity cache if it is enabled.
	 *
	 * @param pregunta the pregunta
	 */
	@Override
	public void cacheResult(Pregunta pregunta) {
		EntityCacheUtil.putResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaImpl.class, pregunta.getPrimaryKey(), pregunta);

		pregunta.resetOriginalValues();
	}

	/**
	 * Caches the preguntas in the entity cache if it is enabled.
	 *
	 * @param preguntas the preguntas
	 */
	@Override
	public void cacheResult(List<Pregunta> preguntas) {
		for (Pregunta pregunta : preguntas) {
			if (EntityCacheUtil.getResult(
						PreguntaModelImpl.ENTITY_CACHE_ENABLED,
						PreguntaImpl.class, pregunta.getPrimaryKey()) == null) {
				cacheResult(pregunta);
			}
			else {
				pregunta.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all preguntas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PreguntaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PreguntaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the pregunta.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Pregunta pregunta) {
		EntityCacheUtil.removeResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaImpl.class, pregunta.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Pregunta> preguntas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Pregunta pregunta : preguntas) {
			EntityCacheUtil.removeResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
				PreguntaImpl.class, pregunta.getPrimaryKey());
		}
	}

	/**
	 * Creates a new pregunta with the primary key. Does not add the pregunta to the database.
	 *
	 * @param preguntaId the primary key for the new pregunta
	 * @return the new pregunta
	 */
	@Override
	public Pregunta create(long preguntaId) {
		Pregunta pregunta = new PreguntaImpl();

		pregunta.setNew(true);
		pregunta.setPrimaryKey(preguntaId);

		return pregunta;
	}

	/**
	 * Removes the pregunta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param preguntaId the primary key of the pregunta
	 * @return the pregunta that was removed
	 * @throws com.hitss.layer.NoSuchPreguntaException if a pregunta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pregunta remove(long preguntaId)
		throws NoSuchPreguntaException, SystemException {
		return remove((Serializable)preguntaId);
	}

	/**
	 * Removes the pregunta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pregunta
	 * @return the pregunta that was removed
	 * @throws com.hitss.layer.NoSuchPreguntaException if a pregunta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pregunta remove(Serializable primaryKey)
		throws NoSuchPreguntaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Pregunta pregunta = (Pregunta)session.get(PreguntaImpl.class,
					primaryKey);

			if (pregunta == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPreguntaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(pregunta);
		}
		catch (NoSuchPreguntaException nsee) {
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
	protected Pregunta removeImpl(Pregunta pregunta) throws SystemException {
		pregunta = toUnwrappedModel(pregunta);

		preguntaToRespuestaTableMapper.deleteLeftPrimaryKeyTableMappings(pregunta.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pregunta)) {
				pregunta = (Pregunta)session.get(PreguntaImpl.class,
						pregunta.getPrimaryKeyObj());
			}

			if (pregunta != null) {
				session.delete(pregunta);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (pregunta != null) {
			clearCache(pregunta);
		}

		return pregunta;
	}

	@Override
	public Pregunta updateImpl(com.hitss.layer.model.Pregunta pregunta)
		throws SystemException {
		pregunta = toUnwrappedModel(pregunta);

		boolean isNew = pregunta.isNew();

		Session session = null;

		try {
			session = openSession();

			if (pregunta.isNew()) {
				session.save(pregunta);

				pregunta.setNew(false);
			}
			else {
				session.merge(pregunta);
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

		EntityCacheUtil.putResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaImpl.class, pregunta.getPrimaryKey(), pregunta);

		return pregunta;
	}

	protected Pregunta toUnwrappedModel(Pregunta pregunta) {
		if (pregunta instanceof PreguntaImpl) {
			return pregunta;
		}

		PreguntaImpl preguntaImpl = new PreguntaImpl();

		preguntaImpl.setNew(pregunta.isNew());
		preguntaImpl.setPrimaryKey(pregunta.getPrimaryKey());

		preguntaImpl.setPreguntaId(pregunta.getPreguntaId());
		preguntaImpl.setDescripcion(pregunta.getDescripcion());
		preguntaImpl.setActivo(pregunta.isActivo());
		preguntaImpl.setUsuariocrea(pregunta.getUsuariocrea());
		preguntaImpl.setFechacrea(pregunta.getFechacrea());
		preguntaImpl.setUsuariomodifica(pregunta.getUsuariomodifica());
		preguntaImpl.setFechacreamodifica(pregunta.getFechacreamodifica());

		return preguntaImpl;
	}

	/**
	 * Returns the pregunta with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the pregunta
	 * @return the pregunta
	 * @throws com.hitss.layer.NoSuchPreguntaException if a pregunta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pregunta findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPreguntaException, SystemException {
		Pregunta pregunta = fetchByPrimaryKey(primaryKey);

		if (pregunta == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPreguntaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return pregunta;
	}

	/**
	 * Returns the pregunta with the primary key or throws a {@link com.hitss.layer.NoSuchPreguntaException} if it could not be found.
	 *
	 * @param preguntaId the primary key of the pregunta
	 * @return the pregunta
	 * @throws com.hitss.layer.NoSuchPreguntaException if a pregunta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pregunta findByPrimaryKey(long preguntaId)
		throws NoSuchPreguntaException, SystemException {
		return findByPrimaryKey((Serializable)preguntaId);
	}

	/**
	 * Returns the pregunta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pregunta
	 * @return the pregunta, or <code>null</code> if a pregunta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pregunta fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Pregunta pregunta = (Pregunta)EntityCacheUtil.getResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
				PreguntaImpl.class, primaryKey);

		if (pregunta == _nullPregunta) {
			return null;
		}

		if (pregunta == null) {
			Session session = null;

			try {
				session = openSession();

				pregunta = (Pregunta)session.get(PreguntaImpl.class, primaryKey);

				if (pregunta != null) {
					cacheResult(pregunta);
				}
				else {
					EntityCacheUtil.putResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
						PreguntaImpl.class, primaryKey, _nullPregunta);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
					PreguntaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return pregunta;
	}

	/**
	 * Returns the pregunta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param preguntaId the primary key of the pregunta
	 * @return the pregunta, or <code>null</code> if a pregunta with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pregunta fetchByPrimaryKey(long preguntaId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)preguntaId);
	}

	/**
	 * Returns all the preguntas.
	 *
	 * @return the preguntas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pregunta> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the preguntas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of preguntas
	 * @param end the upper bound of the range of preguntas (not inclusive)
	 * @return the range of preguntas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pregunta> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the preguntas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of preguntas
	 * @param end the upper bound of the range of preguntas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of preguntas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pregunta> findAll(int start, int end,
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

		List<Pregunta> list = (List<Pregunta>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PREGUNTA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PREGUNTA;

				if (pagination) {
					sql = sql.concat(PreguntaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Pregunta>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Pregunta>(list);
				}
				else {
					list = (List<Pregunta>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the preguntas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Pregunta pregunta : findAll()) {
			remove(pregunta);
		}
	}

	/**
	 * Returns the number of preguntas.
	 *
	 * @return the number of preguntas
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

				Query q = session.createQuery(_SQL_COUNT_PREGUNTA);

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
	 * Returns all the respuestas associated with the pregunta.
	 *
	 * @param pk the primary key of the pregunta
	 * @return the respuestas associated with the pregunta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.hitss.layer.model.Respuesta> getRespuestas(long pk)
		throws SystemException {
		return getRespuestas(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the respuestas associated with the pregunta.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the pregunta
	 * @param start the lower bound of the range of preguntas
	 * @param end the upper bound of the range of preguntas (not inclusive)
	 * @return the range of respuestas associated with the pregunta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.hitss.layer.model.Respuesta> getRespuestas(long pk,
		int start, int end) throws SystemException {
		return getRespuestas(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the respuestas associated with the pregunta.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.PreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the pregunta
	 * @param start the lower bound of the range of preguntas
	 * @param end the upper bound of the range of preguntas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of respuestas associated with the pregunta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.hitss.layer.model.Respuesta> getRespuestas(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return preguntaToRespuestaTableMapper.getRightBaseModels(pk, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of respuestas associated with the pregunta.
	 *
	 * @param pk the primary key of the pregunta
	 * @return the number of respuestas associated with the pregunta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getRespuestasSize(long pk) throws SystemException {
		long[] pks = preguntaToRespuestaTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the respuesta is associated with the pregunta.
	 *
	 * @param pk the primary key of the pregunta
	 * @param respuestaPK the primary key of the respuesta
	 * @return <code>true</code> if the respuesta is associated with the pregunta; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsRespuesta(long pk, long respuestaPK)
		throws SystemException {
		return preguntaToRespuestaTableMapper.containsTableMapping(pk,
			respuestaPK);
	}

	/**
	 * Returns <code>true</code> if the pregunta has any respuestas associated with it.
	 *
	 * @param pk the primary key of the pregunta to check for associations with respuestas
	 * @return <code>true</code> if the pregunta has any respuestas associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsRespuestas(long pk) throws SystemException {
		if (getRespuestasSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the pregunta and the respuesta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the pregunta
	 * @param respuestaPK the primary key of the respuesta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addRespuesta(long pk, long respuestaPK)
		throws SystemException {
		preguntaToRespuestaTableMapper.addTableMapping(pk, respuestaPK);
	}

	/**
	 * Adds an association between the pregunta and the respuesta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the pregunta
	 * @param respuesta the respuesta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addRespuesta(long pk, com.hitss.layer.model.Respuesta respuesta)
		throws SystemException {
		preguntaToRespuestaTableMapper.addTableMapping(pk,
			respuesta.getPrimaryKey());
	}

	/**
	 * Adds an association between the pregunta and the respuestas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the pregunta
	 * @param respuestaPKs the primary keys of the respuestas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addRespuestas(long pk, long[] respuestaPKs)
		throws SystemException {
		for (long respuestaPK : respuestaPKs) {
			preguntaToRespuestaTableMapper.addTableMapping(pk, respuestaPK);
		}
	}

	/**
	 * Adds an association between the pregunta and the respuestas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the pregunta
	 * @param respuestas the respuestas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addRespuestas(long pk,
		List<com.hitss.layer.model.Respuesta> respuestas)
		throws SystemException {
		for (com.hitss.layer.model.Respuesta respuesta : respuestas) {
			preguntaToRespuestaTableMapper.addTableMapping(pk,
				respuesta.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the pregunta and its respuestas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the pregunta to clear the associated respuestas from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearRespuestas(long pk) throws SystemException {
		preguntaToRespuestaTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the pregunta and the respuesta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the pregunta
	 * @param respuestaPK the primary key of the respuesta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeRespuesta(long pk, long respuestaPK)
		throws SystemException {
		preguntaToRespuestaTableMapper.deleteTableMapping(pk, respuestaPK);
	}

	/**
	 * Removes the association between the pregunta and the respuesta. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the pregunta
	 * @param respuesta the respuesta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeRespuesta(long pk,
		com.hitss.layer.model.Respuesta respuesta) throws SystemException {
		preguntaToRespuestaTableMapper.deleteTableMapping(pk,
			respuesta.getPrimaryKey());
	}

	/**
	 * Removes the association between the pregunta and the respuestas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the pregunta
	 * @param respuestaPKs the primary keys of the respuestas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeRespuestas(long pk, long[] respuestaPKs)
		throws SystemException {
		for (long respuestaPK : respuestaPKs) {
			preguntaToRespuestaTableMapper.deleteTableMapping(pk, respuestaPK);
		}
	}

	/**
	 * Removes the association between the pregunta and the respuestas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the pregunta
	 * @param respuestas the respuestas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeRespuestas(long pk,
		List<com.hitss.layer.model.Respuesta> respuestas)
		throws SystemException {
		for (com.hitss.layer.model.Respuesta respuesta : respuestas) {
			preguntaToRespuestaTableMapper.deleteTableMapping(pk,
				respuesta.getPrimaryKey());
		}
	}

	/**
	 * Sets the respuestas associated with the pregunta, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the pregunta
	 * @param respuestaPKs the primary keys of the respuestas to be associated with the pregunta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setRespuestas(long pk, long[] respuestaPKs)
		throws SystemException {
		Set<Long> newRespuestaPKsSet = SetUtil.fromArray(respuestaPKs);
		Set<Long> oldRespuestaPKsSet = SetUtil.fromArray(preguntaToRespuestaTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeRespuestaPKsSet = new HashSet<Long>(oldRespuestaPKsSet);

		removeRespuestaPKsSet.removeAll(newRespuestaPKsSet);

		for (long removeRespuestaPK : removeRespuestaPKsSet) {
			preguntaToRespuestaTableMapper.deleteTableMapping(pk,
				removeRespuestaPK);
		}

		newRespuestaPKsSet.removeAll(oldRespuestaPKsSet);

		for (long newRespuestaPK : newRespuestaPKsSet) {
			preguntaToRespuestaTableMapper.addTableMapping(pk, newRespuestaPK);
		}
	}

	/**
	 * Sets the respuestas associated with the pregunta, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the pregunta
	 * @param respuestas the respuestas to be associated with the pregunta
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setRespuestas(long pk,
		List<com.hitss.layer.model.Respuesta> respuestas)
		throws SystemException {
		try {
			long[] respuestaPKs = new long[respuestas.size()];

			for (int i = 0; i < respuestas.size(); i++) {
				com.hitss.layer.model.Respuesta respuesta = respuestas.get(i);

				respuestaPKs[i] = respuesta.getPrimaryKey();
			}

			setRespuestas(pk, respuestaPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(PreguntaModelImpl.MAPPING_TABLE_REC_PREGUNTARESPUESTA_NAME);
		}
	}

	/**
	 * Initializes the pregunta persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.Pregunta")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Pregunta>> listenersList = new ArrayList<ModelListener<Pregunta>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Pregunta>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		preguntaToRespuestaTableMapper = TableMapperFactory.getTableMapper("rec_PreguntaRespuesta",
				"preguntaId", "respuestaId", this, respuestaPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(PreguntaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("rec_PreguntaRespuesta");
	}

	@BeanReference(type = RespuestaPersistence.class)
	protected RespuestaPersistence respuestaPersistence;
	protected TableMapper<Pregunta, com.hitss.layer.model.Respuesta> preguntaToRespuestaTableMapper;
	private static final String _SQL_SELECT_PREGUNTA = "SELECT pregunta FROM Pregunta pregunta";
	private static final String _SQL_COUNT_PREGUNTA = "SELECT COUNT(pregunta) FROM Pregunta pregunta";
	private static final String _ORDER_BY_ENTITY_ALIAS = "pregunta.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Pregunta exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PreguntaPersistenceImpl.class);
	private static Pregunta _nullPregunta = new PreguntaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Pregunta> toCacheModel() {
				return _nullPreguntaCacheModel;
			}
		};

	private static CacheModel<Pregunta> _nullPreguntaCacheModel = new CacheModel<Pregunta>() {
			@Override
			public Pregunta toEntityModel() {
				return _nullPregunta;
			}
		};
}
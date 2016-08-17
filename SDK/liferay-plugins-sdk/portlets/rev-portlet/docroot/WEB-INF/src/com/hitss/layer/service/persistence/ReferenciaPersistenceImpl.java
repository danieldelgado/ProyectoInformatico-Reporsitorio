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

import com.hitss.layer.NoSuchReferenciaException;
import com.hitss.layer.model.Referencia;
import com.hitss.layer.model.impl.ReferenciaImpl;
import com.hitss.layer.model.impl.ReferenciaModelImpl;

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
 * The persistence implementation for the referencia service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see ReferenciaPersistence
 * @see ReferenciaUtil
 * @generated
 */
public class ReferenciaPersistenceImpl extends BasePersistenceImpl<Referencia>
	implements ReferenciaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ReferenciaUtil} to access the referencia persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ReferenciaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ReferenciaModelImpl.ENTITY_CACHE_ENABLED,
			ReferenciaModelImpl.FINDER_CACHE_ENABLED, ReferenciaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ReferenciaModelImpl.ENTITY_CACHE_ENABLED,
			ReferenciaModelImpl.FINDER_CACHE_ENABLED, ReferenciaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ReferenciaModelImpl.ENTITY_CACHE_ENABLED,
			ReferenciaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ReferenciaPersistenceImpl() {
		setModelClass(Referencia.class);
	}

	/**
	 * Caches the referencia in the entity cache if it is enabled.
	 *
	 * @param referencia the referencia
	 */
	@Override
	public void cacheResult(Referencia referencia) {
		EntityCacheUtil.putResult(ReferenciaModelImpl.ENTITY_CACHE_ENABLED,
			ReferenciaImpl.class, referencia.getPrimaryKey(), referencia);

		referencia.resetOriginalValues();
	}

	/**
	 * Caches the referencias in the entity cache if it is enabled.
	 *
	 * @param referencias the referencias
	 */
	@Override
	public void cacheResult(List<Referencia> referencias) {
		for (Referencia referencia : referencias) {
			if (EntityCacheUtil.getResult(
						ReferenciaModelImpl.ENTITY_CACHE_ENABLED,
						ReferenciaImpl.class, referencia.getPrimaryKey()) == null) {
				cacheResult(referencia);
			}
			else {
				referencia.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all referencias.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ReferenciaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ReferenciaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the referencia.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Referencia referencia) {
		EntityCacheUtil.removeResult(ReferenciaModelImpl.ENTITY_CACHE_ENABLED,
			ReferenciaImpl.class, referencia.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Referencia> referencias) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Referencia referencia : referencias) {
			EntityCacheUtil.removeResult(ReferenciaModelImpl.ENTITY_CACHE_ENABLED,
				ReferenciaImpl.class, referencia.getPrimaryKey());
		}
	}

	/**
	 * Creates a new referencia with the primary key. Does not add the referencia to the database.
	 *
	 * @param referenciaPK the primary key for the new referencia
	 * @return the new referencia
	 */
	@Override
	public Referencia create(ReferenciaPK referenciaPK) {
		Referencia referencia = new ReferenciaImpl();

		referencia.setNew(true);
		referencia.setPrimaryKey(referenciaPK);

		return referencia;
	}

	/**
	 * Removes the referencia with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param referenciaPK the primary key of the referencia
	 * @return the referencia that was removed
	 * @throws com.hitss.layer.NoSuchReferenciaException if a referencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Referencia remove(ReferenciaPK referenciaPK)
		throws NoSuchReferenciaException, SystemException {
		return remove((Serializable)referenciaPK);
	}

	/**
	 * Removes the referencia with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the referencia
	 * @return the referencia that was removed
	 * @throws com.hitss.layer.NoSuchReferenciaException if a referencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Referencia remove(Serializable primaryKey)
		throws NoSuchReferenciaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Referencia referencia = (Referencia)session.get(ReferenciaImpl.class,
					primaryKey);

			if (referencia == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchReferenciaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(referencia);
		}
		catch (NoSuchReferenciaException nsee) {
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
	protected Referencia removeImpl(Referencia referencia)
		throws SystemException {
		referencia = toUnwrappedModel(referencia);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(referencia)) {
				referencia = (Referencia)session.get(ReferenciaImpl.class,
						referencia.getPrimaryKeyObj());
			}

			if (referencia != null) {
				session.delete(referencia);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (referencia != null) {
			clearCache(referencia);
		}

		return referencia;
	}

	@Override
	public Referencia updateImpl(com.hitss.layer.model.Referencia referencia)
		throws SystemException {
		referencia = toUnwrappedModel(referencia);

		boolean isNew = referencia.isNew();

		Session session = null;

		try {
			session = openSession();

			if (referencia.isNew()) {
				session.save(referencia);

				referencia.setNew(false);
			}
			else {
				session.merge(referencia);
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

		EntityCacheUtil.putResult(ReferenciaModelImpl.ENTITY_CACHE_ENABLED,
			ReferenciaImpl.class, referencia.getPrimaryKey(), referencia);

		return referencia;
	}

	protected Referencia toUnwrappedModel(Referencia referencia) {
		if (referencia instanceof ReferenciaImpl) {
			return referencia;
		}

		ReferenciaImpl referenciaImpl = new ReferenciaImpl();

		referenciaImpl.setNew(referencia.isNew());
		referenciaImpl.setPrimaryKey(referencia.getPrimaryKey());

		referenciaImpl.setReferenciaId(referencia.getReferenciaId());
		referenciaImpl.setUsuarioId(referencia.getUsuarioId());
		referenciaImpl.setEmpresa(referencia.getEmpresa());
		referenciaImpl.setTelefono(referencia.getTelefono());
		referenciaImpl.setResponsable(referencia.getResponsable());
		referenciaImpl.setMotivo(referencia.getMotivo());
		referenciaImpl.setActivo(referencia.isActivo());
		referenciaImpl.setUsuariocrea(referencia.getUsuariocrea());
		referenciaImpl.setFechacrea(referencia.getFechacrea());
		referenciaImpl.setUsuariomodifica(referencia.getUsuariomodifica());
		referenciaImpl.setFechamodifica(referencia.getFechamodifica());

		return referenciaImpl;
	}

	/**
	 * Returns the referencia with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the referencia
	 * @return the referencia
	 * @throws com.hitss.layer.NoSuchReferenciaException if a referencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Referencia findByPrimaryKey(Serializable primaryKey)
		throws NoSuchReferenciaException, SystemException {
		Referencia referencia = fetchByPrimaryKey(primaryKey);

		if (referencia == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchReferenciaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return referencia;
	}

	/**
	 * Returns the referencia with the primary key or throws a {@link com.hitss.layer.NoSuchReferenciaException} if it could not be found.
	 *
	 * @param referenciaPK the primary key of the referencia
	 * @return the referencia
	 * @throws com.hitss.layer.NoSuchReferenciaException if a referencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Referencia findByPrimaryKey(ReferenciaPK referenciaPK)
		throws NoSuchReferenciaException, SystemException {
		return findByPrimaryKey((Serializable)referenciaPK);
	}

	/**
	 * Returns the referencia with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the referencia
	 * @return the referencia, or <code>null</code> if a referencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Referencia fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Referencia referencia = (Referencia)EntityCacheUtil.getResult(ReferenciaModelImpl.ENTITY_CACHE_ENABLED,
				ReferenciaImpl.class, primaryKey);

		if (referencia == _nullReferencia) {
			return null;
		}

		if (referencia == null) {
			Session session = null;

			try {
				session = openSession();

				referencia = (Referencia)session.get(ReferenciaImpl.class,
						primaryKey);

				if (referencia != null) {
					cacheResult(referencia);
				}
				else {
					EntityCacheUtil.putResult(ReferenciaModelImpl.ENTITY_CACHE_ENABLED,
						ReferenciaImpl.class, primaryKey, _nullReferencia);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ReferenciaModelImpl.ENTITY_CACHE_ENABLED,
					ReferenciaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return referencia;
	}

	/**
	 * Returns the referencia with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param referenciaPK the primary key of the referencia
	 * @return the referencia, or <code>null</code> if a referencia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Referencia fetchByPrimaryKey(ReferenciaPK referenciaPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)referenciaPK);
	}

	/**
	 * Returns all the referencias.
	 *
	 * @return the referencias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Referencia> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the referencias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ReferenciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of referencias
	 * @param end the upper bound of the range of referencias (not inclusive)
	 * @return the range of referencias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Referencia> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the referencias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ReferenciaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of referencias
	 * @param end the upper bound of the range of referencias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of referencias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Referencia> findAll(int start, int end,
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

		List<Referencia> list = (List<Referencia>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_REFERENCIA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REFERENCIA;

				if (pagination) {
					sql = sql.concat(ReferenciaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Referencia>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Referencia>(list);
				}
				else {
					list = (List<Referencia>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the referencias from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Referencia referencia : findAll()) {
			remove(referencia);
		}
	}

	/**
	 * Returns the number of referencias.
	 *
	 * @return the number of referencias
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

				Query q = session.createQuery(_SQL_COUNT_REFERENCIA);

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
	 * Initializes the referencia persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.Referencia")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Referencia>> listenersList = new ArrayList<ModelListener<Referencia>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Referencia>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ReferenciaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_REFERENCIA = "SELECT referencia FROM Referencia referencia";
	private static final String _SQL_COUNT_REFERENCIA = "SELECT COUNT(referencia) FROM Referencia referencia";
	private static final String _ORDER_BY_ENTITY_ALIAS = "referencia.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Referencia exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ReferenciaPersistenceImpl.class);
	private static Referencia _nullReferencia = new ReferenciaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Referencia> toCacheModel() {
				return _nullReferenciaCacheModel;
			}
		};

	private static CacheModel<Referencia> _nullReferenciaCacheModel = new CacheModel<Referencia>() {
			@Override
			public Referencia toEntityModel() {
				return _nullReferencia;
			}
		};
}
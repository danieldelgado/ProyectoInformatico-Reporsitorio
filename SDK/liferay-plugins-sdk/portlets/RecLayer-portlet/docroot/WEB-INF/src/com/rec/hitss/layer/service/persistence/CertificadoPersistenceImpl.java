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

import com.rec.hitss.layer.NoSuchCertificadoException;
import com.rec.hitss.layer.model.Certificado;
import com.rec.hitss.layer.model.impl.CertificadoImpl;
import com.rec.hitss.layer.model.impl.CertificadoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the certificado service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Crossfire
 * @see CertificadoPersistence
 * @see CertificadoUtil
 * @generated
 */
public class CertificadoPersistenceImpl extends BasePersistenceImpl<Certificado>
	implements CertificadoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CertificadoUtil} to access the certificado persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CertificadoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CertificadoModelImpl.ENTITY_CACHE_ENABLED,
			CertificadoModelImpl.FINDER_CACHE_ENABLED, CertificadoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CertificadoModelImpl.ENTITY_CACHE_ENABLED,
			CertificadoModelImpl.FINDER_CACHE_ENABLED, CertificadoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CertificadoModelImpl.ENTITY_CACHE_ENABLED,
			CertificadoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CertificadoPersistenceImpl() {
		setModelClass(Certificado.class);
	}

	/**
	 * Caches the certificado in the entity cache if it is enabled.
	 *
	 * @param certificado the certificado
	 */
	@Override
	public void cacheResult(Certificado certificado) {
		EntityCacheUtil.putResult(CertificadoModelImpl.ENTITY_CACHE_ENABLED,
			CertificadoImpl.class, certificado.getPrimaryKey(), certificado);

		certificado.resetOriginalValues();
	}

	/**
	 * Caches the certificados in the entity cache if it is enabled.
	 *
	 * @param certificados the certificados
	 */
	@Override
	public void cacheResult(List<Certificado> certificados) {
		for (Certificado certificado : certificados) {
			if (EntityCacheUtil.getResult(
						CertificadoModelImpl.ENTITY_CACHE_ENABLED,
						CertificadoImpl.class, certificado.getPrimaryKey()) == null) {
				cacheResult(certificado);
			}
			else {
				certificado.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all certificados.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CertificadoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CertificadoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the certificado.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Certificado certificado) {
		EntityCacheUtil.removeResult(CertificadoModelImpl.ENTITY_CACHE_ENABLED,
			CertificadoImpl.class, certificado.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Certificado> certificados) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Certificado certificado : certificados) {
			EntityCacheUtil.removeResult(CertificadoModelImpl.ENTITY_CACHE_ENABLED,
				CertificadoImpl.class, certificado.getPrimaryKey());
		}
	}

	/**
	 * Creates a new certificado with the primary key. Does not add the certificado to the database.
	 *
	 * @param certificadoId the primary key for the new certificado
	 * @return the new certificado
	 */
	@Override
	public Certificado create(long certificadoId) {
		Certificado certificado = new CertificadoImpl();

		certificado.setNew(true);
		certificado.setPrimaryKey(certificadoId);

		return certificado;
	}

	/**
	 * Removes the certificado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param certificadoId the primary key of the certificado
	 * @return the certificado that was removed
	 * @throws com.rec.hitss.layer.NoSuchCertificadoException if a certificado with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Certificado remove(long certificadoId)
		throws NoSuchCertificadoException, SystemException {
		return remove((Serializable)certificadoId);
	}

	/**
	 * Removes the certificado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the certificado
	 * @return the certificado that was removed
	 * @throws com.rec.hitss.layer.NoSuchCertificadoException if a certificado with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Certificado remove(Serializable primaryKey)
		throws NoSuchCertificadoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Certificado certificado = (Certificado)session.get(CertificadoImpl.class,
					primaryKey);

			if (certificado == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCertificadoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(certificado);
		}
		catch (NoSuchCertificadoException nsee) {
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
	protected Certificado removeImpl(Certificado certificado)
		throws SystemException {
		certificado = toUnwrappedModel(certificado);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(certificado)) {
				certificado = (Certificado)session.get(CertificadoImpl.class,
						certificado.getPrimaryKeyObj());
			}

			if (certificado != null) {
				session.delete(certificado);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (certificado != null) {
			clearCache(certificado);
		}

		return certificado;
	}

	@Override
	public Certificado updateImpl(
		com.rec.hitss.layer.model.Certificado certificado)
		throws SystemException {
		certificado = toUnwrappedModel(certificado);

		boolean isNew = certificado.isNew();

		Session session = null;

		try {
			session = openSession();

			if (certificado.isNew()) {
				session.save(certificado);

				certificado.setNew(false);
			}
			else {
				session.merge(certificado);
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

		EntityCacheUtil.putResult(CertificadoModelImpl.ENTITY_CACHE_ENABLED,
			CertificadoImpl.class, certificado.getPrimaryKey(), certificado);

		return certificado;
	}

	protected Certificado toUnwrappedModel(Certificado certificado) {
		if (certificado instanceof CertificadoImpl) {
			return certificado;
		}

		CertificadoImpl certificadoImpl = new CertificadoImpl();

		certificadoImpl.setNew(certificado.isNew());
		certificadoImpl.setPrimaryKey(certificado.getPrimaryKey());

		certificadoImpl.setCertificadoId(certificado.getCertificadoId());
		certificadoImpl.setDescripcion(certificado.getDescripcion());
		certificadoImpl.setEmpresa(certificado.getEmpresa());
		certificadoImpl.setCargo(certificado.getCargo());
		certificadoImpl.setUsuarioHitssId(certificado.getUsuarioHitssId());
		certificadoImpl.setActivo(certificado.isActivo());
		certificadoImpl.setUsuariocrea(certificado.getUsuariocrea());
		certificadoImpl.setFechacrea(certificado.getFechacrea());
		certificadoImpl.setUsuariomodifica(certificado.getUsuariomodifica());
		certificadoImpl.setFechacreamodifica(certificado.getFechacreamodifica());

		return certificadoImpl;
	}

	/**
	 * Returns the certificado with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the certificado
	 * @return the certificado
	 * @throws com.rec.hitss.layer.NoSuchCertificadoException if a certificado with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Certificado findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCertificadoException, SystemException {
		Certificado certificado = fetchByPrimaryKey(primaryKey);

		if (certificado == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCertificadoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return certificado;
	}

	/**
	 * Returns the certificado with the primary key or throws a {@link com.rec.hitss.layer.NoSuchCertificadoException} if it could not be found.
	 *
	 * @param certificadoId the primary key of the certificado
	 * @return the certificado
	 * @throws com.rec.hitss.layer.NoSuchCertificadoException if a certificado with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Certificado findByPrimaryKey(long certificadoId)
		throws NoSuchCertificadoException, SystemException {
		return findByPrimaryKey((Serializable)certificadoId);
	}

	/**
	 * Returns the certificado with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the certificado
	 * @return the certificado, or <code>null</code> if a certificado with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Certificado fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Certificado certificado = (Certificado)EntityCacheUtil.getResult(CertificadoModelImpl.ENTITY_CACHE_ENABLED,
				CertificadoImpl.class, primaryKey);

		if (certificado == _nullCertificado) {
			return null;
		}

		if (certificado == null) {
			Session session = null;

			try {
				session = openSession();

				certificado = (Certificado)session.get(CertificadoImpl.class,
						primaryKey);

				if (certificado != null) {
					cacheResult(certificado);
				}
				else {
					EntityCacheUtil.putResult(CertificadoModelImpl.ENTITY_CACHE_ENABLED,
						CertificadoImpl.class, primaryKey, _nullCertificado);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CertificadoModelImpl.ENTITY_CACHE_ENABLED,
					CertificadoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return certificado;
	}

	/**
	 * Returns the certificado with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param certificadoId the primary key of the certificado
	 * @return the certificado, or <code>null</code> if a certificado with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Certificado fetchByPrimaryKey(long certificadoId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)certificadoId);
	}

	/**
	 * Returns all the certificados.
	 *
	 * @return the certificados
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Certificado> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the certificados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.CertificadoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificados
	 * @param end the upper bound of the range of certificados (not inclusive)
	 * @return the range of certificados
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Certificado> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the certificados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rec.hitss.layer.model.impl.CertificadoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificados
	 * @param end the upper bound of the range of certificados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of certificados
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Certificado> findAll(int start, int end,
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

		List<Certificado> list = (List<Certificado>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CERTIFICADO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CERTIFICADO;

				if (pagination) {
					sql = sql.concat(CertificadoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Certificado>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Certificado>(list);
				}
				else {
					list = (List<Certificado>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the certificados from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Certificado certificado : findAll()) {
			remove(certificado);
		}
	}

	/**
	 * Returns the number of certificados.
	 *
	 * @return the number of certificados
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

				Query q = session.createQuery(_SQL_COUNT_CERTIFICADO);

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
	 * Initializes the certificado persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rec.hitss.layer.model.Certificado")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Certificado>> listenersList = new ArrayList<ModelListener<Certificado>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Certificado>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CertificadoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CERTIFICADO = "SELECT certificado FROM Certificado certificado";
	private static final String _SQL_COUNT_CERTIFICADO = "SELECT COUNT(certificado) FROM Certificado certificado";
	private static final String _ORDER_BY_ENTITY_ALIAS = "certificado.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Certificado exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CertificadoPersistenceImpl.class);
	private static Certificado _nullCertificado = new CertificadoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Certificado> toCacheModel() {
				return _nullCertificadoCacheModel;
			}
		};

	private static CacheModel<Certificado> _nullCertificadoCacheModel = new CacheModel<Certificado>() {
			@Override
			public Certificado toEntityModel() {
				return _nullCertificado;
			}
		};
}
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

import com.hitss.layer.NoSuchContratoException;
import com.hitss.layer.model.Contrato;
import com.hitss.layer.model.impl.ContratoImpl;
import com.hitss.layer.model.impl.ContratoModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
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
 * The persistence implementation for the contrato service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see ContratoPersistence
 * @see ContratoUtil
 * @generated
 */
public class ContratoPersistenceImpl extends BasePersistenceImpl<Contrato>
	implements ContratoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ContratoUtil} to access the contrato persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ContratoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ContratoModelImpl.ENTITY_CACHE_ENABLED,
			ContratoModelImpl.FINDER_CACHE_ENABLED, ContratoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ContratoModelImpl.ENTITY_CACHE_ENABLED,
			ContratoModelImpl.FINDER_CACHE_ENABLED, ContratoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ContratoModelImpl.ENTITY_CACHE_ENABLED,
			ContratoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_U = new FinderPath(ContratoModelImpl.ENTITY_CACHE_ENABLED,
			ContratoModelImpl.FINDER_CACHE_ENABLED, ContratoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByU",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U = new FinderPath(ContratoModelImpl.ENTITY_CACHE_ENABLED,
			ContratoModelImpl.FINDER_CACHE_ENABLED, ContratoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByU",
			new String[] { Long.class.getName() },
			ContratoModelImpl.USUARIOID_COLUMN_BITMASK |
			ContratoModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U = new FinderPath(ContratoModelImpl.ENTITY_CACHE_ENABLED,
			ContratoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the contratos where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @return the matching contratos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Contrato> findByU(long usuarioId) throws SystemException {
		return findByU(usuarioId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the contratos where usuarioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ContratoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param usuarioId the usuario ID
	 * @param start the lower bound of the range of contratos
	 * @param end the upper bound of the range of contratos (not inclusive)
	 * @return the range of matching contratos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Contrato> findByU(long usuarioId, int start, int end)
		throws SystemException {
		return findByU(usuarioId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the contratos where usuarioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ContratoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param usuarioId the usuario ID
	 * @param start the lower bound of the range of contratos
	 * @param end the upper bound of the range of contratos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contratos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Contrato> findByU(long usuarioId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U;
			finderArgs = new Object[] { usuarioId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_U;
			finderArgs = new Object[] { usuarioId, start, end, orderByComparator };
		}

		List<Contrato> list = (List<Contrato>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Contrato contrato : list) {
				if ((usuarioId != contrato.getUsuarioId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CONTRATO_WHERE);

			query.append(_FINDER_COLUMN_U_USUARIOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ContratoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(usuarioId);

				if (!pagination) {
					list = (List<Contrato>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Contrato>(list);
				}
				else {
					list = (List<Contrato>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first contrato in the ordered set where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contrato
	 * @throws com.hitss.layer.NoSuchContratoException if a matching contrato could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contrato findByU_First(long usuarioId,
		OrderByComparator orderByComparator)
		throws NoSuchContratoException, SystemException {
		Contrato contrato = fetchByU_First(usuarioId, orderByComparator);

		if (contrato != null) {
			return contrato;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("usuarioId=");
		msg.append(usuarioId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContratoException(msg.toString());
	}

	/**
	 * Returns the first contrato in the ordered set where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contrato, or <code>null</code> if a matching contrato could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contrato fetchByU_First(long usuarioId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Contrato> list = findByU(usuarioId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last contrato in the ordered set where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contrato
	 * @throws com.hitss.layer.NoSuchContratoException if a matching contrato could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contrato findByU_Last(long usuarioId,
		OrderByComparator orderByComparator)
		throws NoSuchContratoException, SystemException {
		Contrato contrato = fetchByU_Last(usuarioId, orderByComparator);

		if (contrato != null) {
			return contrato;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("usuarioId=");
		msg.append(usuarioId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContratoException(msg.toString());
	}

	/**
	 * Returns the last contrato in the ordered set where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contrato, or <code>null</code> if a matching contrato could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contrato fetchByU_Last(long usuarioId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByU(usuarioId);

		if (count == 0) {
			return null;
		}

		List<Contrato> list = findByU(usuarioId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the contratos before and after the current contrato in the ordered set where usuarioId = &#63;.
	 *
	 * @param contratoPK the primary key of the current contrato
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contrato
	 * @throws com.hitss.layer.NoSuchContratoException if a contrato with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contrato[] findByU_PrevAndNext(ContratoPK contratoPK,
		long usuarioId, OrderByComparator orderByComparator)
		throws NoSuchContratoException, SystemException {
		Contrato contrato = findByPrimaryKey(contratoPK);

		Session session = null;

		try {
			session = openSession();

			Contrato[] array = new ContratoImpl[3];

			array[0] = getByU_PrevAndNext(session, contrato, usuarioId,
					orderByComparator, true);

			array[1] = contrato;

			array[2] = getByU_PrevAndNext(session, contrato, usuarioId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Contrato getByU_PrevAndNext(Session session, Contrato contrato,
		long usuarioId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONTRATO_WHERE);

		query.append(_FINDER_COLUMN_U_USUARIOID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ContratoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(usuarioId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(contrato);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Contrato> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the contratos where usuarioId = &#63; from the database.
	 *
	 * @param usuarioId the usuario ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByU(long usuarioId) throws SystemException {
		for (Contrato contrato : findByU(usuarioId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(contrato);
		}
	}

	/**
	 * Returns the number of contratos where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @return the number of matching contratos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByU(long usuarioId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_U;

		Object[] finderArgs = new Object[] { usuarioId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONTRATO_WHERE);

			query.append(_FINDER_COLUMN_U_USUARIOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(usuarioId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_U_USUARIOID_2 = "contrato.id.usuarioId = ? AND contrato.activo=true";

	public ContratoPersistenceImpl() {
		setModelClass(Contrato.class);
	}

	/**
	 * Caches the contrato in the entity cache if it is enabled.
	 *
	 * @param contrato the contrato
	 */
	@Override
	public void cacheResult(Contrato contrato) {
		EntityCacheUtil.putResult(ContratoModelImpl.ENTITY_CACHE_ENABLED,
			ContratoImpl.class, contrato.getPrimaryKey(), contrato);

		contrato.resetOriginalValues();
	}

	/**
	 * Caches the contratos in the entity cache if it is enabled.
	 *
	 * @param contratos the contratos
	 */
	@Override
	public void cacheResult(List<Contrato> contratos) {
		for (Contrato contrato : contratos) {
			if (EntityCacheUtil.getResult(
						ContratoModelImpl.ENTITY_CACHE_ENABLED,
						ContratoImpl.class, contrato.getPrimaryKey()) == null) {
				cacheResult(contrato);
			}
			else {
				contrato.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all contratos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ContratoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ContratoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the contrato.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Contrato contrato) {
		EntityCacheUtil.removeResult(ContratoModelImpl.ENTITY_CACHE_ENABLED,
			ContratoImpl.class, contrato.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Contrato> contratos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Contrato contrato : contratos) {
			EntityCacheUtil.removeResult(ContratoModelImpl.ENTITY_CACHE_ENABLED,
				ContratoImpl.class, contrato.getPrimaryKey());
		}
	}

	/**
	 * Creates a new contrato with the primary key. Does not add the contrato to the database.
	 *
	 * @param contratoPK the primary key for the new contrato
	 * @return the new contrato
	 */
	@Override
	public Contrato create(ContratoPK contratoPK) {
		Contrato contrato = new ContratoImpl();

		contrato.setNew(true);
		contrato.setPrimaryKey(contratoPK);

		return contrato;
	}

	/**
	 * Removes the contrato with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contratoPK the primary key of the contrato
	 * @return the contrato that was removed
	 * @throws com.hitss.layer.NoSuchContratoException if a contrato with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contrato remove(ContratoPK contratoPK)
		throws NoSuchContratoException, SystemException {
		return remove((Serializable)contratoPK);
	}

	/**
	 * Removes the contrato with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the contrato
	 * @return the contrato that was removed
	 * @throws com.hitss.layer.NoSuchContratoException if a contrato with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contrato remove(Serializable primaryKey)
		throws NoSuchContratoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Contrato contrato = (Contrato)session.get(ContratoImpl.class,
					primaryKey);

			if (contrato == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchContratoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(contrato);
		}
		catch (NoSuchContratoException nsee) {
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
	protected Contrato removeImpl(Contrato contrato) throws SystemException {
		contrato = toUnwrappedModel(contrato);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(contrato)) {
				contrato = (Contrato)session.get(ContratoImpl.class,
						contrato.getPrimaryKeyObj());
			}

			if (contrato != null) {
				session.delete(contrato);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (contrato != null) {
			clearCache(contrato);
		}

		return contrato;
	}

	@Override
	public Contrato updateImpl(com.hitss.layer.model.Contrato contrato)
		throws SystemException {
		contrato = toUnwrappedModel(contrato);

		boolean isNew = contrato.isNew();

		ContratoModelImpl contratoModelImpl = (ContratoModelImpl)contrato;

		Session session = null;

		try {
			session = openSession();

			if (contrato.isNew()) {
				session.save(contrato);

				contrato.setNew(false);
			}
			else {
				session.merge(contrato);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ContratoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((contratoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						contratoModelImpl.getOriginalUsuarioId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U,
					args);

				args = new Object[] { contratoModelImpl.getUsuarioId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U,
					args);
			}
		}

		EntityCacheUtil.putResult(ContratoModelImpl.ENTITY_CACHE_ENABLED,
			ContratoImpl.class, contrato.getPrimaryKey(), contrato);

		return contrato;
	}

	protected Contrato toUnwrappedModel(Contrato contrato) {
		if (contrato instanceof ContratoImpl) {
			return contrato;
		}

		ContratoImpl contratoImpl = new ContratoImpl();

		contratoImpl.setNew(contrato.isNew());
		contratoImpl.setPrimaryKey(contrato.getPrimaryKey());

		contratoImpl.setContratoId(contrato.getContratoId());
		contratoImpl.setUsuarioId(contrato.getUsuarioId());
		contratoImpl.setMotivo(contrato.getMotivo());
		contratoImpl.setDescripcion(contrato.getDescripcion());
		contratoImpl.setTitulo(contrato.getTitulo());
		contratoImpl.setActivo(contrato.isActivo());
		contratoImpl.setUsuariocrea(contrato.getUsuariocrea());
		contratoImpl.setFechacrea(contrato.getFechacrea());
		contratoImpl.setUsuariomodifica(contrato.getUsuariomodifica());
		contratoImpl.setFechamodifica(contrato.getFechamodifica());

		return contratoImpl;
	}

	/**
	 * Returns the contrato with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the contrato
	 * @return the contrato
	 * @throws com.hitss.layer.NoSuchContratoException if a contrato with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contrato findByPrimaryKey(Serializable primaryKey)
		throws NoSuchContratoException, SystemException {
		Contrato contrato = fetchByPrimaryKey(primaryKey);

		if (contrato == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchContratoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return contrato;
	}

	/**
	 * Returns the contrato with the primary key or throws a {@link com.hitss.layer.NoSuchContratoException} if it could not be found.
	 *
	 * @param contratoPK the primary key of the contrato
	 * @return the contrato
	 * @throws com.hitss.layer.NoSuchContratoException if a contrato with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contrato findByPrimaryKey(ContratoPK contratoPK)
		throws NoSuchContratoException, SystemException {
		return findByPrimaryKey((Serializable)contratoPK);
	}

	/**
	 * Returns the contrato with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the contrato
	 * @return the contrato, or <code>null</code> if a contrato with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contrato fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Contrato contrato = (Contrato)EntityCacheUtil.getResult(ContratoModelImpl.ENTITY_CACHE_ENABLED,
				ContratoImpl.class, primaryKey);

		if (contrato == _nullContrato) {
			return null;
		}

		if (contrato == null) {
			Session session = null;

			try {
				session = openSession();

				contrato = (Contrato)session.get(ContratoImpl.class, primaryKey);

				if (contrato != null) {
					cacheResult(contrato);
				}
				else {
					EntityCacheUtil.putResult(ContratoModelImpl.ENTITY_CACHE_ENABLED,
						ContratoImpl.class, primaryKey, _nullContrato);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ContratoModelImpl.ENTITY_CACHE_ENABLED,
					ContratoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return contrato;
	}

	/**
	 * Returns the contrato with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contratoPK the primary key of the contrato
	 * @return the contrato, or <code>null</code> if a contrato with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contrato fetchByPrimaryKey(ContratoPK contratoPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)contratoPK);
	}

	/**
	 * Returns all the contratos.
	 *
	 * @return the contratos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Contrato> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the contratos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ContratoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contratos
	 * @param end the upper bound of the range of contratos (not inclusive)
	 * @return the range of contratos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Contrato> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the contratos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ContratoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contratos
	 * @param end the upper bound of the range of contratos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of contratos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Contrato> findAll(int start, int end,
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

		List<Contrato> list = (List<Contrato>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONTRATO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONTRATO;

				if (pagination) {
					sql = sql.concat(ContratoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Contrato>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Contrato>(list);
				}
				else {
					list = (List<Contrato>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the contratos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Contrato contrato : findAll()) {
			remove(contrato);
		}
	}

	/**
	 * Returns the number of contratos.
	 *
	 * @return the number of contratos
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

				Query q = session.createQuery(_SQL_COUNT_CONTRATO);

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
	 * Initializes the contrato persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.Contrato")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Contrato>> listenersList = new ArrayList<ModelListener<Contrato>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Contrato>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ContratoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CONTRATO = "SELECT contrato FROM Contrato contrato";
	private static final String _SQL_SELECT_CONTRATO_WHERE = "SELECT contrato FROM Contrato contrato WHERE ";
	private static final String _SQL_COUNT_CONTRATO = "SELECT COUNT(contrato) FROM Contrato contrato";
	private static final String _SQL_COUNT_CONTRATO_WHERE = "SELECT COUNT(contrato) FROM Contrato contrato WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "contrato.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Contrato exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Contrato exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ContratoPersistenceImpl.class);
	private static Contrato _nullContrato = new ContratoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Contrato> toCacheModel() {
				return _nullContratoCacheModel;
			}
		};

	private static CacheModel<Contrato> _nullContratoCacheModel = new CacheModel<Contrato>() {
			@Override
			public Contrato toEntityModel() {
				return _nullContrato;
			}
		};
}
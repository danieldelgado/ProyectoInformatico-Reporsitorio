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

import com.hitss.layer.NoSuchFasePostulacionException;
import com.hitss.layer.model.FasePostulacion;
import com.hitss.layer.model.impl.FasePostulacionImpl;
import com.hitss.layer.model.impl.FasePostulacionModelImpl;

import com.liferay.portal.kernel.bean.BeanReference;
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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
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
 * The persistence implementation for the fase postulacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see FasePostulacionPersistence
 * @see FasePostulacionUtil
 * @generated
 */
public class FasePostulacionPersistenceImpl extends BasePersistenceImpl<FasePostulacion>
	implements FasePostulacionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FasePostulacionUtil} to access the fase postulacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FasePostulacionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_U = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByU",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByU",
			new String[] { Long.class.getName() },
			FasePostulacionModelImpl.USUARIOID_COLUMN_BITMASK |
			FasePostulacionModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the fase postulacions where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @return the matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findByU(long usuarioId)
		throws SystemException {
		return findByU(usuarioId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fase postulacions where usuarioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param usuarioId the usuario ID
	 * @param start the lower bound of the range of fase postulacions
	 * @param end the upper bound of the range of fase postulacions (not inclusive)
	 * @return the range of matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findByU(long usuarioId, int start, int end)
		throws SystemException {
		return findByU(usuarioId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fase postulacions where usuarioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param usuarioId the usuario ID
	 * @param start the lower bound of the range of fase postulacions
	 * @param end the upper bound of the range of fase postulacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findByU(long usuarioId, int start, int end,
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

		List<FasePostulacion> list = (List<FasePostulacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FasePostulacion fasePostulacion : list) {
				if ((usuarioId != fasePostulacion.getUsuarioId())) {
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

			query.append(_SQL_SELECT_FASEPOSTULACION_WHERE);

			query.append(_FINDER_COLUMN_U_USUARIOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FasePostulacionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(usuarioId);

				if (!pagination) {
					list = (List<FasePostulacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FasePostulacion>(list);
				}
				else {
					list = (List<FasePostulacion>)QueryUtil.list(q,
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
	 * Returns the first fase postulacion in the ordered set where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fase postulacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionException if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion findByU_First(long usuarioId,
		OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionException, SystemException {
		FasePostulacion fasePostulacion = fetchByU_First(usuarioId,
				orderByComparator);

		if (fasePostulacion != null) {
			return fasePostulacion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("usuarioId=");
		msg.append(usuarioId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFasePostulacionException(msg.toString());
	}

	/**
	 * Returns the first fase postulacion in the ordered set where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion fetchByU_First(long usuarioId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FasePostulacion> list = findByU(usuarioId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fase postulacion in the ordered set where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fase postulacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionException if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion findByU_Last(long usuarioId,
		OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionException, SystemException {
		FasePostulacion fasePostulacion = fetchByU_Last(usuarioId,
				orderByComparator);

		if (fasePostulacion != null) {
			return fasePostulacion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("usuarioId=");
		msg.append(usuarioId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFasePostulacionException(msg.toString());
	}

	/**
	 * Returns the last fase postulacion in the ordered set where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion fetchByU_Last(long usuarioId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByU(usuarioId);

		if (count == 0) {
			return null;
		}

		List<FasePostulacion> list = findByU(usuarioId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fase postulacions before and after the current fase postulacion in the ordered set where usuarioId = &#63;.
	 *
	 * @param fasePostulacionId the primary key of the current fase postulacion
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fase postulacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionException if a fase postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion[] findByU_PrevAndNext(long fasePostulacionId,
		long usuarioId, OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionException, SystemException {
		FasePostulacion fasePostulacion = findByPrimaryKey(fasePostulacionId);

		Session session = null;

		try {
			session = openSession();

			FasePostulacion[] array = new FasePostulacionImpl[3];

			array[0] = getByU_PrevAndNext(session, fasePostulacion, usuarioId,
					orderByComparator, true);

			array[1] = fasePostulacion;

			array[2] = getByU_PrevAndNext(session, fasePostulacion, usuarioId,
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

	protected FasePostulacion getByU_PrevAndNext(Session session,
		FasePostulacion fasePostulacion, long usuarioId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FASEPOSTULACION_WHERE);

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
			query.append(FasePostulacionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(usuarioId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(fasePostulacion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FasePostulacion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fase postulacions where usuarioId = &#63; from the database.
	 *
	 * @param usuarioId the usuario ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByU(long usuarioId) throws SystemException {
		for (FasePostulacion fasePostulacion : findByU(usuarioId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(fasePostulacion);
		}
	}

	/**
	 * Returns the number of fase postulacions where usuarioId = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @return the number of matching fase postulacions
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

			query.append(_SQL_COUNT_FASEPOSTULACION_WHERE);

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

	private static final String _FINDER_COLUMN_U_USUARIOID_2 = "fasePostulacion.usuarioId = ? AND fasePostulacion.activo=true";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_U = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByT_U",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_U = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT_U",
			new String[] { Long.class.getName(), Long.class.getName() },
			FasePostulacionModelImpl.USUARIOID_COLUMN_BITMASK |
			FasePostulacionModelImpl.TIPOFASE_COLUMN_BITMASK |
			FasePostulacionModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_U = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_U",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the fase postulacions where usuarioId = &#63; and tipoFase = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param tipoFase the tipo fase
	 * @return the matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findByT_U(long usuarioId, long tipoFase)
		throws SystemException {
		return findByT_U(usuarioId, tipoFase, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fase postulacions where usuarioId = &#63; and tipoFase = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param usuarioId the usuario ID
	 * @param tipoFase the tipo fase
	 * @param start the lower bound of the range of fase postulacions
	 * @param end the upper bound of the range of fase postulacions (not inclusive)
	 * @return the range of matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findByT_U(long usuarioId, long tipoFase,
		int start, int end) throws SystemException {
		return findByT_U(usuarioId, tipoFase, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fase postulacions where usuarioId = &#63; and tipoFase = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param usuarioId the usuario ID
	 * @param tipoFase the tipo fase
	 * @param start the lower bound of the range of fase postulacions
	 * @param end the upper bound of the range of fase postulacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findByT_U(long usuarioId, long tipoFase,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_U;
			finderArgs = new Object[] { usuarioId, tipoFase };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_U;
			finderArgs = new Object[] {
					usuarioId, tipoFase,
					
					start, end, orderByComparator
				};
		}

		List<FasePostulacion> list = (List<FasePostulacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FasePostulacion fasePostulacion : list) {
				if ((usuarioId != fasePostulacion.getUsuarioId()) ||
						(tipoFase != fasePostulacion.getTipoFase())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_FASEPOSTULACION_WHERE);

			query.append(_FINDER_COLUMN_T_U_USUARIOID_2);

			query.append(_FINDER_COLUMN_T_U_TIPOFASE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FasePostulacionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(usuarioId);

				qPos.add(tipoFase);

				if (!pagination) {
					list = (List<FasePostulacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FasePostulacion>(list);
				}
				else {
					list = (List<FasePostulacion>)QueryUtil.list(q,
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
	 * Returns the first fase postulacion in the ordered set where usuarioId = &#63; and tipoFase = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param tipoFase the tipo fase
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fase postulacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionException if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion findByT_U_First(long usuarioId, long tipoFase,
		OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionException, SystemException {
		FasePostulacion fasePostulacion = fetchByT_U_First(usuarioId, tipoFase,
				orderByComparator);

		if (fasePostulacion != null) {
			return fasePostulacion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("usuarioId=");
		msg.append(usuarioId);

		msg.append(", tipoFase=");
		msg.append(tipoFase);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFasePostulacionException(msg.toString());
	}

	/**
	 * Returns the first fase postulacion in the ordered set where usuarioId = &#63; and tipoFase = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param tipoFase the tipo fase
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion fetchByT_U_First(long usuarioId, long tipoFase,
		OrderByComparator orderByComparator) throws SystemException {
		List<FasePostulacion> list = findByT_U(usuarioId, tipoFase, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fase postulacion in the ordered set where usuarioId = &#63; and tipoFase = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param tipoFase the tipo fase
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fase postulacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionException if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion findByT_U_Last(long usuarioId, long tipoFase,
		OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionException, SystemException {
		FasePostulacion fasePostulacion = fetchByT_U_Last(usuarioId, tipoFase,
				orderByComparator);

		if (fasePostulacion != null) {
			return fasePostulacion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("usuarioId=");
		msg.append(usuarioId);

		msg.append(", tipoFase=");
		msg.append(tipoFase);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFasePostulacionException(msg.toString());
	}

	/**
	 * Returns the last fase postulacion in the ordered set where usuarioId = &#63; and tipoFase = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param tipoFase the tipo fase
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion fetchByT_U_Last(long usuarioId, long tipoFase,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByT_U(usuarioId, tipoFase);

		if (count == 0) {
			return null;
		}

		List<FasePostulacion> list = findByT_U(usuarioId, tipoFase, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fase postulacions before and after the current fase postulacion in the ordered set where usuarioId = &#63; and tipoFase = &#63;.
	 *
	 * @param fasePostulacionId the primary key of the current fase postulacion
	 * @param usuarioId the usuario ID
	 * @param tipoFase the tipo fase
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fase postulacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionException if a fase postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion[] findByT_U_PrevAndNext(long fasePostulacionId,
		long usuarioId, long tipoFase, OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionException, SystemException {
		FasePostulacion fasePostulacion = findByPrimaryKey(fasePostulacionId);

		Session session = null;

		try {
			session = openSession();

			FasePostulacion[] array = new FasePostulacionImpl[3];

			array[0] = getByT_U_PrevAndNext(session, fasePostulacion,
					usuarioId, tipoFase, orderByComparator, true);

			array[1] = fasePostulacion;

			array[2] = getByT_U_PrevAndNext(session, fasePostulacion,
					usuarioId, tipoFase, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FasePostulacion getByT_U_PrevAndNext(Session session,
		FasePostulacion fasePostulacion, long usuarioId, long tipoFase,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FASEPOSTULACION_WHERE);

		query.append(_FINDER_COLUMN_T_U_USUARIOID_2);

		query.append(_FINDER_COLUMN_T_U_TIPOFASE_2);

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
			query.append(FasePostulacionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(usuarioId);

		qPos.add(tipoFase);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(fasePostulacion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FasePostulacion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fase postulacions where usuarioId = &#63; and tipoFase = &#63; from the database.
	 *
	 * @param usuarioId the usuario ID
	 * @param tipoFase the tipo fase
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_U(long usuarioId, long tipoFase)
		throws SystemException {
		for (FasePostulacion fasePostulacion : findByT_U(usuarioId, tipoFase,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(fasePostulacion);
		}
	}

	/**
	 * Returns the number of fase postulacions where usuarioId = &#63; and tipoFase = &#63;.
	 *
	 * @param usuarioId the usuario ID
	 * @param tipoFase the tipo fase
	 * @return the number of matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_U(long usuarioId, long tipoFase)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_U;

		Object[] finderArgs = new Object[] { usuarioId, tipoFase };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FASEPOSTULACION_WHERE);

			query.append(_FINDER_COLUMN_T_U_USUARIOID_2);

			query.append(_FINDER_COLUMN_T_U_TIPOFASE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(usuarioId);

				qPos.add(tipoFase);

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

	private static final String _FINDER_COLUMN_T_U_USUARIOID_2 = "fasePostulacion.usuarioId = ? AND ";
	private static final String _FINDER_COLUMN_T_U_TIPOFASE_2 = "fasePostulacion.tipoFase = ? AND fasePostulacion.activo=true";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_F_U = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByS_F_U",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_F_U = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_F_U",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			FasePostulacionModelImpl.SOLICITUDREQUERIMIENTOID_COLUMN_BITMASK |
			FasePostulacionModelImpl.FASEPOSTULACIONID_COLUMN_BITMASK |
			FasePostulacionModelImpl.USUARIOID_COLUMN_BITMASK |
			FasePostulacionModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_F_U = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_F_U",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @param usuarioId the usuario ID
	 * @return the matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findByS_F_U(long solicitudRequerimientoId,
		long fasePostulacionId, long usuarioId) throws SystemException {
		return findByS_F_U(solicitudRequerimientoId, fasePostulacionId,
			usuarioId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @param usuarioId the usuario ID
	 * @param start the lower bound of the range of fase postulacions
	 * @param end the upper bound of the range of fase postulacions (not inclusive)
	 * @return the range of matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findByS_F_U(long solicitudRequerimientoId,
		long fasePostulacionId, long usuarioId, int start, int end)
		throws SystemException {
		return findByS_F_U(solicitudRequerimientoId, fasePostulacionId,
			usuarioId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @param usuarioId the usuario ID
	 * @param start the lower bound of the range of fase postulacions
	 * @param end the upper bound of the range of fase postulacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findByS_F_U(long solicitudRequerimientoId,
		long fasePostulacionId, long usuarioId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_F_U;
			finderArgs = new Object[] {
					solicitudRequerimientoId, fasePostulacionId, usuarioId
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_F_U;
			finderArgs = new Object[] {
					solicitudRequerimientoId, fasePostulacionId, usuarioId,
					
					start, end, orderByComparator
				};
		}

		List<FasePostulacion> list = (List<FasePostulacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FasePostulacion fasePostulacion : list) {
				if ((solicitudRequerimientoId != fasePostulacion.getSolicitudRequerimientoId()) ||
						(fasePostulacionId != fasePostulacion.getFasePostulacionId()) ||
						(usuarioId != fasePostulacion.getUsuarioId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_FASEPOSTULACION_WHERE);

			query.append(_FINDER_COLUMN_S_F_U_SOLICITUDREQUERIMIENTOID_2);

			query.append(_FINDER_COLUMN_S_F_U_FASEPOSTULACIONID_2);

			query.append(_FINDER_COLUMN_S_F_U_USUARIOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FasePostulacionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				qPos.add(fasePostulacionId);

				qPos.add(usuarioId);

				if (!pagination) {
					list = (List<FasePostulacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FasePostulacion>(list);
				}
				else {
					list = (List<FasePostulacion>)QueryUtil.list(q,
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
	 * Returns the first fase postulacion in the ordered set where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fase postulacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionException if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion findByS_F_U_First(long solicitudRequerimientoId,
		long fasePostulacionId, long usuarioId,
		OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionException, SystemException {
		FasePostulacion fasePostulacion = fetchByS_F_U_First(solicitudRequerimientoId,
				fasePostulacionId, usuarioId, orderByComparator);

		if (fasePostulacion != null) {
			return fasePostulacion;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(", fasePostulacionId=");
		msg.append(fasePostulacionId);

		msg.append(", usuarioId=");
		msg.append(usuarioId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFasePostulacionException(msg.toString());
	}

	/**
	 * Returns the first fase postulacion in the ordered set where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion fetchByS_F_U_First(long solicitudRequerimientoId,
		long fasePostulacionId, long usuarioId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FasePostulacion> list = findByS_F_U(solicitudRequerimientoId,
				fasePostulacionId, usuarioId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fase postulacion in the ordered set where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fase postulacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionException if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion findByS_F_U_Last(long solicitudRequerimientoId,
		long fasePostulacionId, long usuarioId,
		OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionException, SystemException {
		FasePostulacion fasePostulacion = fetchByS_F_U_Last(solicitudRequerimientoId,
				fasePostulacionId, usuarioId, orderByComparator);

		if (fasePostulacion != null) {
			return fasePostulacion;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(", fasePostulacionId=");
		msg.append(fasePostulacionId);

		msg.append(", usuarioId=");
		msg.append(usuarioId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFasePostulacionException(msg.toString());
	}

	/**
	 * Returns the last fase postulacion in the ordered set where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @param usuarioId the usuario ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion fetchByS_F_U_Last(long solicitudRequerimientoId,
		long fasePostulacionId, long usuarioId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByS_F_U(solicitudRequerimientoId, fasePostulacionId,
				usuarioId);

		if (count == 0) {
			return null;
		}

		List<FasePostulacion> list = findByS_F_U(solicitudRequerimientoId,
				fasePostulacionId, usuarioId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63; from the database.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @param usuarioId the usuario ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS_F_U(long solicitudRequerimientoId,
		long fasePostulacionId, long usuarioId) throws SystemException {
		for (FasePostulacion fasePostulacion : findByS_F_U(
				solicitudRequerimientoId, fasePostulacionId, usuarioId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(fasePostulacion);
		}
	}

	/**
	 * Returns the number of fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; and usuarioId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @param usuarioId the usuario ID
	 * @return the number of matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS_F_U(long solicitudRequerimientoId,
		long fasePostulacionId, long usuarioId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_F_U;

		Object[] finderArgs = new Object[] {
				solicitudRequerimientoId, fasePostulacionId, usuarioId
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_FASEPOSTULACION_WHERE);

			query.append(_FINDER_COLUMN_S_F_U_SOLICITUDREQUERIMIENTOID_2);

			query.append(_FINDER_COLUMN_S_F_U_FASEPOSTULACIONID_2);

			query.append(_FINDER_COLUMN_S_F_U_USUARIOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				qPos.add(fasePostulacionId);

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

	private static final String _FINDER_COLUMN_S_F_U_SOLICITUDREQUERIMIENTOID_2 = "fasePostulacion.solicitudRequerimientoId = ? AND ";
	private static final String _FINDER_COLUMN_S_F_U_FASEPOSTULACIONID_2 = "fasePostulacion.fasePostulacionId = ? AND ";
	private static final String _FINDER_COLUMN_S_F_U_USUARIOID_2 = "fasePostulacion.usuarioId = ? AND fasePostulacion.activo=true";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_L_F = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByS_L_F",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L_F = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_L_F",
			new String[] { Long.class.getName(), Long.class.getName() },
			FasePostulacionModelImpl.SOLICITUDREQUERIMIENTOID_COLUMN_BITMASK |
			FasePostulacionModelImpl.FASEPOSTULACIONID_COLUMN_BITMASK |
			FasePostulacionModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_L_F = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_L_F",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @return the matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findByS_L_F(long solicitudRequerimientoId,
		long fasePostulacionId) throws SystemException {
		return findByS_L_F(solicitudRequerimientoId, fasePostulacionId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @param start the lower bound of the range of fase postulacions
	 * @param end the upper bound of the range of fase postulacions (not inclusive)
	 * @return the range of matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findByS_L_F(long solicitudRequerimientoId,
		long fasePostulacionId, int start, int end) throws SystemException {
		return findByS_L_F(solicitudRequerimientoId, fasePostulacionId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @param start the lower bound of the range of fase postulacions
	 * @param end the upper bound of the range of fase postulacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findByS_L_F(long solicitudRequerimientoId,
		long fasePostulacionId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L_F;
			finderArgs = new Object[] {
					solicitudRequerimientoId, fasePostulacionId
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_L_F;
			finderArgs = new Object[] {
					solicitudRequerimientoId, fasePostulacionId,
					
					start, end, orderByComparator
				};
		}

		List<FasePostulacion> list = (List<FasePostulacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FasePostulacion fasePostulacion : list) {
				if ((solicitudRequerimientoId != fasePostulacion.getSolicitudRequerimientoId()) ||
						(fasePostulacionId != fasePostulacion.getFasePostulacionId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_FASEPOSTULACION_WHERE);

			query.append(_FINDER_COLUMN_S_L_F_SOLICITUDREQUERIMIENTOID_2);

			query.append(_FINDER_COLUMN_S_L_F_FASEPOSTULACIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FasePostulacionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				qPos.add(fasePostulacionId);

				if (!pagination) {
					list = (List<FasePostulacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FasePostulacion>(list);
				}
				else {
					list = (List<FasePostulacion>)QueryUtil.list(q,
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
	 * Returns the first fase postulacion in the ordered set where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fase postulacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionException if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion findByS_L_F_First(long solicitudRequerimientoId,
		long fasePostulacionId, OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionException, SystemException {
		FasePostulacion fasePostulacion = fetchByS_L_F_First(solicitudRequerimientoId,
				fasePostulacionId, orderByComparator);

		if (fasePostulacion != null) {
			return fasePostulacion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(", fasePostulacionId=");
		msg.append(fasePostulacionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFasePostulacionException(msg.toString());
	}

	/**
	 * Returns the first fase postulacion in the ordered set where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion fetchByS_L_F_First(long solicitudRequerimientoId,
		long fasePostulacionId, OrderByComparator orderByComparator)
		throws SystemException {
		List<FasePostulacion> list = findByS_L_F(solicitudRequerimientoId,
				fasePostulacionId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fase postulacion in the ordered set where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fase postulacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionException if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion findByS_L_F_Last(long solicitudRequerimientoId,
		long fasePostulacionId, OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionException, SystemException {
		FasePostulacion fasePostulacion = fetchByS_L_F_Last(solicitudRequerimientoId,
				fasePostulacionId, orderByComparator);

		if (fasePostulacion != null) {
			return fasePostulacion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudRequerimientoId=");
		msg.append(solicitudRequerimientoId);

		msg.append(", fasePostulacionId=");
		msg.append(fasePostulacionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFasePostulacionException(msg.toString());
	}

	/**
	 * Returns the last fase postulacion in the ordered set where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion fetchByS_L_F_Last(long solicitudRequerimientoId,
		long fasePostulacionId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByS_L_F(solicitudRequerimientoId, fasePostulacionId);

		if (count == 0) {
			return null;
		}

		List<FasePostulacion> list = findByS_L_F(solicitudRequerimientoId,
				fasePostulacionId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63; from the database.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS_L_F(long solicitudRequerimientoId,
		long fasePostulacionId) throws SystemException {
		for (FasePostulacion fasePostulacion : findByS_L_F(
				solicitudRequerimientoId, fasePostulacionId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(fasePostulacion);
		}
	}

	/**
	 * Returns the number of fase postulacions where solicitudRequerimientoId = &#63; and fasePostulacionId = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param fasePostulacionId the fase postulacion ID
	 * @return the number of matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS_L_F(long solicitudRequerimientoId,
		long fasePostulacionId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_L_F;

		Object[] finderArgs = new Object[] {
				solicitudRequerimientoId, fasePostulacionId
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FASEPOSTULACION_WHERE);

			query.append(_FINDER_COLUMN_S_L_F_SOLICITUDREQUERIMIENTOID_2);

			query.append(_FINDER_COLUMN_S_L_F_FASEPOSTULACIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				qPos.add(fasePostulacionId);

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

	private static final String _FINDER_COLUMN_S_L_F_SOLICITUDREQUERIMIENTOID_2 = "fasePostulacion.solicitudRequerimientoId = ? AND ";
	private static final String _FINDER_COLUMN_S_L_F_FASEPOSTULACIONID_2 = "fasePostulacion.fasePostulacionId = ? AND fasePostulacion.activo=true";
	public static final FinderPath FINDER_PATH_FETCH_BY_S_U_T = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByS_U_T",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			FasePostulacionModelImpl.SOLICITUDREQUERIMIENTOID_COLUMN_BITMASK |
			FasePostulacionModelImpl.USUARIOID_COLUMN_BITMASK |
			FasePostulacionModelImpl.TIPOFASE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_U_T = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_U_T",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the fase postulacion where solicitudRequerimientoId = &#63; and usuarioId = &#63; and tipoFase = &#63; or throws a {@link com.hitss.layer.NoSuchFasePostulacionException} if it could not be found.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param usuarioId the usuario ID
	 * @param tipoFase the tipo fase
	 * @return the matching fase postulacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionException if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion findByS_U_T(long solicitudRequerimientoId,
		long usuarioId, long tipoFase)
		throws NoSuchFasePostulacionException, SystemException {
		FasePostulacion fasePostulacion = fetchByS_U_T(solicitudRequerimientoId,
				usuarioId, tipoFase);

		if (fasePostulacion == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("solicitudRequerimientoId=");
			msg.append(solicitudRequerimientoId);

			msg.append(", usuarioId=");
			msg.append(usuarioId);

			msg.append(", tipoFase=");
			msg.append(tipoFase);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchFasePostulacionException(msg.toString());
		}

		return fasePostulacion;
	}

	/**
	 * Returns the fase postulacion where solicitudRequerimientoId = &#63; and usuarioId = &#63; and tipoFase = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param usuarioId the usuario ID
	 * @param tipoFase the tipo fase
	 * @return the matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion fetchByS_U_T(long solicitudRequerimientoId,
		long usuarioId, long tipoFase) throws SystemException {
		return fetchByS_U_T(solicitudRequerimientoId, usuarioId, tipoFase, true);
	}

	/**
	 * Returns the fase postulacion where solicitudRequerimientoId = &#63; and usuarioId = &#63; and tipoFase = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param usuarioId the usuario ID
	 * @param tipoFase the tipo fase
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion fetchByS_U_T(long solicitudRequerimientoId,
		long usuarioId, long tipoFase, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				solicitudRequerimientoId, usuarioId, tipoFase
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_S_U_T,
					finderArgs, this);
		}

		if (result instanceof FasePostulacion) {
			FasePostulacion fasePostulacion = (FasePostulacion)result;

			if ((solicitudRequerimientoId != fasePostulacion.getSolicitudRequerimientoId()) ||
					(usuarioId != fasePostulacion.getUsuarioId()) ||
					(tipoFase != fasePostulacion.getTipoFase())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_FASEPOSTULACION_WHERE);

			query.append(_FINDER_COLUMN_S_U_T_SOLICITUDREQUERIMIENTOID_2);

			query.append(_FINDER_COLUMN_S_U_T_USUARIOID_2);

			query.append(_FINDER_COLUMN_S_U_T_TIPOFASE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				qPos.add(usuarioId);

				qPos.add(tipoFase);

				List<FasePostulacion> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_S_U_T,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"FasePostulacionPersistenceImpl.fetchByS_U_T(long, long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					FasePostulacion fasePostulacion = list.get(0);

					result = fasePostulacion;

					cacheResult(fasePostulacion);

					if ((fasePostulacion.getSolicitudRequerimientoId() != solicitudRequerimientoId) ||
							(fasePostulacion.getUsuarioId() != usuarioId) ||
							(fasePostulacion.getTipoFase() != tipoFase)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_S_U_T,
							finderArgs, fasePostulacion);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_S_U_T,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (FasePostulacion)result;
		}
	}

	/**
	 * Removes the fase postulacion where solicitudRequerimientoId = &#63; and usuarioId = &#63; and tipoFase = &#63; from the database.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param usuarioId the usuario ID
	 * @param tipoFase the tipo fase
	 * @return the fase postulacion that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion removeByS_U_T(long solicitudRequerimientoId,
		long usuarioId, long tipoFase)
		throws NoSuchFasePostulacionException, SystemException {
		FasePostulacion fasePostulacion = findByS_U_T(solicitudRequerimientoId,
				usuarioId, tipoFase);

		return remove(fasePostulacion);
	}

	/**
	 * Returns the number of fase postulacions where solicitudRequerimientoId = &#63; and usuarioId = &#63; and tipoFase = &#63;.
	 *
	 * @param solicitudRequerimientoId the solicitud requerimiento ID
	 * @param usuarioId the usuario ID
	 * @param tipoFase the tipo fase
	 * @return the number of matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS_U_T(long solicitudRequerimientoId, long usuarioId,
		long tipoFase) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_U_T;

		Object[] finderArgs = new Object[] {
				solicitudRequerimientoId, usuarioId, tipoFase
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_FASEPOSTULACION_WHERE);

			query.append(_FINDER_COLUMN_S_U_T_SOLICITUDREQUERIMIENTOID_2);

			query.append(_FINDER_COLUMN_S_U_T_USUARIOID_2);

			query.append(_FINDER_COLUMN_S_U_T_TIPOFASE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudRequerimientoId);

				qPos.add(usuarioId);

				qPos.add(tipoFase);

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

	private static final String _FINDER_COLUMN_S_U_T_SOLICITUDREQUERIMIENTOID_2 = "fasePostulacion.solicitudRequerimientoId = ? AND ";
	private static final String _FINDER_COLUMN_S_U_T_USUARIOID_2 = "fasePostulacion.usuarioId = ? AND ";
	private static final String _FINDER_COLUMN_S_U_T_TIPOFASE_2 = "fasePostulacion.tipoFase = ? AND fasePostulacion.activo=true";
	public static final FinderPath FINDER_PATH_FETCH_BY_F = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByF",
			new String[] { Long.class.getName() },
			FasePostulacionModelImpl.FASEPOSTULACIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F = new FinderPath(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF",
			new String[] { Long.class.getName() });

	/**
	 * Returns the fase postulacion where fasePostulacionId = &#63; or throws a {@link com.hitss.layer.NoSuchFasePostulacionException} if it could not be found.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @return the matching fase postulacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionException if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion findByF(long fasePostulacionId)
		throws NoSuchFasePostulacionException, SystemException {
		FasePostulacion fasePostulacion = fetchByF(fasePostulacionId);

		if (fasePostulacion == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("fasePostulacionId=");
			msg.append(fasePostulacionId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchFasePostulacionException(msg.toString());
		}

		return fasePostulacion;
	}

	/**
	 * Returns the fase postulacion where fasePostulacionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @return the matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion fetchByF(long fasePostulacionId)
		throws SystemException {
		return fetchByF(fasePostulacionId, true);
	}

	/**
	 * Returns the fase postulacion where fasePostulacionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching fase postulacion, or <code>null</code> if a matching fase postulacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion fetchByF(long fasePostulacionId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { fasePostulacionId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_F,
					finderArgs, this);
		}

		if (result instanceof FasePostulacion) {
			FasePostulacion fasePostulacion = (FasePostulacion)result;

			if ((fasePostulacionId != fasePostulacion.getFasePostulacionId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_FASEPOSTULACION_WHERE);

			query.append(_FINDER_COLUMN_F_FASEPOSTULACIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fasePostulacionId);

				List<FasePostulacion> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"FasePostulacionPersistenceImpl.fetchByF(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					FasePostulacion fasePostulacion = list.get(0);

					result = fasePostulacion;

					cacheResult(fasePostulacion);

					if ((fasePostulacion.getFasePostulacionId() != fasePostulacionId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F,
							finderArgs, fasePostulacion);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (FasePostulacion)result;
		}
	}

	/**
	 * Removes the fase postulacion where fasePostulacionId = &#63; from the database.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @return the fase postulacion that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion removeByF(long fasePostulacionId)
		throws NoSuchFasePostulacionException, SystemException {
		FasePostulacion fasePostulacion = findByF(fasePostulacionId);

		return remove(fasePostulacion);
	}

	/**
	 * Returns the number of fase postulacions where fasePostulacionId = &#63;.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @return the number of matching fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF(long fasePostulacionId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F;

		Object[] finderArgs = new Object[] { fasePostulacionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FASEPOSTULACION_WHERE);

			query.append(_FINDER_COLUMN_F_FASEPOSTULACIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fasePostulacionId);

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

	private static final String _FINDER_COLUMN_F_FASEPOSTULACIONID_2 = "fasePostulacion.fasePostulacionId = ? AND fasePostulacion.activo=true";

	public FasePostulacionPersistenceImpl() {
		setModelClass(FasePostulacion.class);
	}

	/**
	 * Caches the fase postulacion in the entity cache if it is enabled.
	 *
	 * @param fasePostulacion the fase postulacion
	 */
	@Override
	public void cacheResult(FasePostulacion fasePostulacion) {
		EntityCacheUtil.putResult(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionImpl.class, fasePostulacion.getPrimaryKey(),
			fasePostulacion);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_S_U_T,
			new Object[] {
				fasePostulacion.getSolicitudRequerimientoId(),
				fasePostulacion.getUsuarioId(), fasePostulacion.getTipoFase()
			}, fasePostulacion);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F,
			new Object[] { fasePostulacion.getFasePostulacionId() },
			fasePostulacion);

		fasePostulacion.resetOriginalValues();
	}

	/**
	 * Caches the fase postulacions in the entity cache if it is enabled.
	 *
	 * @param fasePostulacions the fase postulacions
	 */
	@Override
	public void cacheResult(List<FasePostulacion> fasePostulacions) {
		for (FasePostulacion fasePostulacion : fasePostulacions) {
			if (EntityCacheUtil.getResult(
						FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
						FasePostulacionImpl.class,
						fasePostulacion.getPrimaryKey()) == null) {
				cacheResult(fasePostulacion);
			}
			else {
				fasePostulacion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all fase postulacions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FasePostulacionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FasePostulacionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the fase postulacion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FasePostulacion fasePostulacion) {
		EntityCacheUtil.removeResult(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionImpl.class, fasePostulacion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(fasePostulacion);
	}

	@Override
	public void clearCache(List<FasePostulacion> fasePostulacions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FasePostulacion fasePostulacion : fasePostulacions) {
			EntityCacheUtil.removeResult(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
				FasePostulacionImpl.class, fasePostulacion.getPrimaryKey());

			clearUniqueFindersCache(fasePostulacion);
		}
	}

	protected void cacheUniqueFindersCache(FasePostulacion fasePostulacion) {
		if (fasePostulacion.isNew()) {
			Object[] args = new Object[] {
					fasePostulacion.getSolicitudRequerimientoId(),
					fasePostulacion.getUsuarioId(),
					fasePostulacion.getTipoFase()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_S_U_T, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_S_U_T, args,
				fasePostulacion);

			args = new Object[] { fasePostulacion.getFasePostulacionId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F, args,
				fasePostulacion);
		}
		else {
			FasePostulacionModelImpl fasePostulacionModelImpl = (FasePostulacionModelImpl)fasePostulacion;

			if ((fasePostulacionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_S_U_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fasePostulacion.getSolicitudRequerimientoId(),
						fasePostulacion.getUsuarioId(),
						fasePostulacion.getTipoFase()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_S_U_T, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_S_U_T, args,
					fasePostulacion);
			}

			if ((fasePostulacionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_F.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fasePostulacion.getFasePostulacionId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F, args,
					fasePostulacion);
			}
		}
	}

	protected void clearUniqueFindersCache(FasePostulacion fasePostulacion) {
		FasePostulacionModelImpl fasePostulacionModelImpl = (FasePostulacionModelImpl)fasePostulacion;

		Object[] args = new Object[] {
				fasePostulacion.getSolicitudRequerimientoId(),
				fasePostulacion.getUsuarioId(), fasePostulacion.getTipoFase()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_U_T, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_S_U_T, args);

		if ((fasePostulacionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_S_U_T.getColumnBitmask()) != 0) {
			args = new Object[] {
					fasePostulacionModelImpl.getOriginalSolicitudRequerimientoId(),
					fasePostulacionModelImpl.getOriginalUsuarioId(),
					fasePostulacionModelImpl.getOriginalTipoFase()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_U_T, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_S_U_T, args);
		}

		args = new Object[] { fasePostulacion.getFasePostulacionId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F, args);

		if ((fasePostulacionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F.getColumnBitmask()) != 0) {
			args = new Object[] {
					fasePostulacionModelImpl.getOriginalFasePostulacionId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F, args);
		}
	}

	/**
	 * Creates a new fase postulacion with the primary key. Does not add the fase postulacion to the database.
	 *
	 * @param fasePostulacionId the primary key for the new fase postulacion
	 * @return the new fase postulacion
	 */
	@Override
	public FasePostulacion create(long fasePostulacionId) {
		FasePostulacion fasePostulacion = new FasePostulacionImpl();

		fasePostulacion.setNew(true);
		fasePostulacion.setPrimaryKey(fasePostulacionId);

		return fasePostulacion;
	}

	/**
	 * Removes the fase postulacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fasePostulacionId the primary key of the fase postulacion
	 * @return the fase postulacion that was removed
	 * @throws com.hitss.layer.NoSuchFasePostulacionException if a fase postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion remove(long fasePostulacionId)
		throws NoSuchFasePostulacionException, SystemException {
		return remove((Serializable)fasePostulacionId);
	}

	/**
	 * Removes the fase postulacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fase postulacion
	 * @return the fase postulacion that was removed
	 * @throws com.hitss.layer.NoSuchFasePostulacionException if a fase postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion remove(Serializable primaryKey)
		throws NoSuchFasePostulacionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FasePostulacion fasePostulacion = (FasePostulacion)session.get(FasePostulacionImpl.class,
					primaryKey);

			if (fasePostulacion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFasePostulacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(fasePostulacion);
		}
		catch (NoSuchFasePostulacionException nsee) {
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
	protected FasePostulacion removeImpl(FasePostulacion fasePostulacion)
		throws SystemException {
		fasePostulacion = toUnwrappedModel(fasePostulacion);

		fasePostulacionToEvaluacionTableMapper.deleteLeftPrimaryKeyTableMappings(fasePostulacion.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fasePostulacion)) {
				fasePostulacion = (FasePostulacion)session.get(FasePostulacionImpl.class,
						fasePostulacion.getPrimaryKeyObj());
			}

			if (fasePostulacion != null) {
				session.delete(fasePostulacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (fasePostulacion != null) {
			clearCache(fasePostulacion);
		}

		return fasePostulacion;
	}

	@Override
	public FasePostulacion updateImpl(
		com.hitss.layer.model.FasePostulacion fasePostulacion)
		throws SystemException {
		fasePostulacion = toUnwrappedModel(fasePostulacion);

		boolean isNew = fasePostulacion.isNew();

		FasePostulacionModelImpl fasePostulacionModelImpl = (FasePostulacionModelImpl)fasePostulacion;

		Session session = null;

		try {
			session = openSession();

			if (fasePostulacion.isNew()) {
				session.save(fasePostulacion);

				fasePostulacion.setNew(false);
			}
			else {
				session.merge(fasePostulacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FasePostulacionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((fasePostulacionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fasePostulacionModelImpl.getOriginalUsuarioId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U,
					args);

				args = new Object[] { fasePostulacionModelImpl.getUsuarioId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U,
					args);
			}

			if ((fasePostulacionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fasePostulacionModelImpl.getOriginalUsuarioId(),
						fasePostulacionModelImpl.getOriginalTipoFase()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_U,
					args);

				args = new Object[] {
						fasePostulacionModelImpl.getUsuarioId(),
						fasePostulacionModelImpl.getTipoFase()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_U,
					args);
			}

			if ((fasePostulacionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_F_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fasePostulacionModelImpl.getOriginalSolicitudRequerimientoId(),
						fasePostulacionModelImpl.getOriginalFasePostulacionId(),
						fasePostulacionModelImpl.getOriginalUsuarioId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_F_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_F_U,
					args);

				args = new Object[] {
						fasePostulacionModelImpl.getSolicitudRequerimientoId(),
						fasePostulacionModelImpl.getFasePostulacionId(),
						fasePostulacionModelImpl.getUsuarioId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_F_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_F_U,
					args);
			}

			if ((fasePostulacionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L_F.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fasePostulacionModelImpl.getOriginalSolicitudRequerimientoId(),
						fasePostulacionModelImpl.getOriginalFasePostulacionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_L_F, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L_F,
					args);

				args = new Object[] {
						fasePostulacionModelImpl.getSolicitudRequerimientoId(),
						fasePostulacionModelImpl.getFasePostulacionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_L_F, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L_F,
					args);
			}
		}

		EntityCacheUtil.putResult(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionImpl.class, fasePostulacion.getPrimaryKey(),
			fasePostulacion);

		clearUniqueFindersCache(fasePostulacion);
		cacheUniqueFindersCache(fasePostulacion);

		return fasePostulacion;
	}

	protected FasePostulacion toUnwrappedModel(FasePostulacion fasePostulacion) {
		if (fasePostulacion instanceof FasePostulacionImpl) {
			return fasePostulacion;
		}

		FasePostulacionImpl fasePostulacionImpl = new FasePostulacionImpl();

		fasePostulacionImpl.setNew(fasePostulacion.isNew());
		fasePostulacionImpl.setPrimaryKey(fasePostulacion.getPrimaryKey());

		fasePostulacionImpl.setFasePostulacionId(fasePostulacion.getFasePostulacionId());
		fasePostulacionImpl.setSolicitudRequerimientoId(fasePostulacion.getSolicitudRequerimientoId());
		fasePostulacionImpl.setUsuarioId(fasePostulacion.getUsuarioId());
		fasePostulacionImpl.setTipoFase(fasePostulacion.getTipoFase());
		fasePostulacionImpl.setFechaFase(fasePostulacion.getFechaFase());
		fasePostulacionImpl.setDescripcion(fasePostulacion.getDescripcion());
		fasePostulacionImpl.setEstado(fasePostulacion.getEstado());
		fasePostulacionImpl.setAsistio(fasePostulacion.isAsistio());
		fasePostulacionImpl.setApruebaFase(fasePostulacion.isApruebaFase());
		fasePostulacionImpl.setPuntuacion(fasePostulacion.getPuntuacion());
		fasePostulacionImpl.setSalario(fasePostulacion.getSalario());
		fasePostulacionImpl.setActivo(fasePostulacion.isActivo());
		fasePostulacionImpl.setUsuariocrea(fasePostulacion.getUsuariocrea());
		fasePostulacionImpl.setFechacrea(fasePostulacion.getFechacrea());
		fasePostulacionImpl.setUsuariomodifica(fasePostulacion.getUsuariomodifica());
		fasePostulacionImpl.setFechamodifica(fasePostulacion.getFechamodifica());

		return fasePostulacionImpl;
	}

	/**
	 * Returns the fase postulacion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the fase postulacion
	 * @return the fase postulacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionException if a fase postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFasePostulacionException, SystemException {
		FasePostulacion fasePostulacion = fetchByPrimaryKey(primaryKey);

		if (fasePostulacion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFasePostulacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return fasePostulacion;
	}

	/**
	 * Returns the fase postulacion with the primary key or throws a {@link com.hitss.layer.NoSuchFasePostulacionException} if it could not be found.
	 *
	 * @param fasePostulacionId the primary key of the fase postulacion
	 * @return the fase postulacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionException if a fase postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion findByPrimaryKey(long fasePostulacionId)
		throws NoSuchFasePostulacionException, SystemException {
		return findByPrimaryKey((Serializable)fasePostulacionId);
	}

	/**
	 * Returns the fase postulacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fase postulacion
	 * @return the fase postulacion, or <code>null</code> if a fase postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		FasePostulacion fasePostulacion = (FasePostulacion)EntityCacheUtil.getResult(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
				FasePostulacionImpl.class, primaryKey);

		if (fasePostulacion == _nullFasePostulacion) {
			return null;
		}

		if (fasePostulacion == null) {
			Session session = null;

			try {
				session = openSession();

				fasePostulacion = (FasePostulacion)session.get(FasePostulacionImpl.class,
						primaryKey);

				if (fasePostulacion != null) {
					cacheResult(fasePostulacion);
				}
				else {
					EntityCacheUtil.putResult(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
						FasePostulacionImpl.class, primaryKey,
						_nullFasePostulacion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FasePostulacionModelImpl.ENTITY_CACHE_ENABLED,
					FasePostulacionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return fasePostulacion;
	}

	/**
	 * Returns the fase postulacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fasePostulacionId the primary key of the fase postulacion
	 * @return the fase postulacion, or <code>null</code> if a fase postulacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacion fetchByPrimaryKey(long fasePostulacionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)fasePostulacionId);
	}

	/**
	 * Returns all the fase postulacions.
	 *
	 * @return the fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fase postulacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of fase postulacions
	 * @param end the upper bound of the range of fase postulacions (not inclusive)
	 * @return the range of fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fase postulacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of fase postulacions
	 * @param end the upper bound of the range of fase postulacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fase postulacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacion> findAll(int start, int end,
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

		List<FasePostulacion> list = (List<FasePostulacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FASEPOSTULACION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FASEPOSTULACION;

				if (pagination) {
					sql = sql.concat(FasePostulacionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FasePostulacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FasePostulacion>(list);
				}
				else {
					list = (List<FasePostulacion>)QueryUtil.list(q,
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
	 * Removes all the fase postulacions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (FasePostulacion fasePostulacion : findAll()) {
			remove(fasePostulacion);
		}
	}

	/**
	 * Returns the number of fase postulacions.
	 *
	 * @return the number of fase postulacions
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

				Query q = session.createQuery(_SQL_COUNT_FASEPOSTULACION);

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
	 * Returns all the evaluacions associated with the fase postulacion.
	 *
	 * @param pk the primary key of the fase postulacion
	 * @return the evaluacions associated with the fase postulacion
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.hitss.layer.model.Evaluacion> getEvaluacions(long pk)
		throws SystemException {
		return getEvaluacions(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the evaluacions associated with the fase postulacion.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the fase postulacion
	 * @param start the lower bound of the range of fase postulacions
	 * @param end the upper bound of the range of fase postulacions (not inclusive)
	 * @return the range of evaluacions associated with the fase postulacion
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.hitss.layer.model.Evaluacion> getEvaluacions(long pk,
		int start, int end) throws SystemException {
		return getEvaluacions(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the evaluacions associated with the fase postulacion.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the fase postulacion
	 * @param start the lower bound of the range of fase postulacions
	 * @param end the upper bound of the range of fase postulacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of evaluacions associated with the fase postulacion
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.hitss.layer.model.Evaluacion> getEvaluacions(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return fasePostulacionToEvaluacionTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of evaluacions associated with the fase postulacion.
	 *
	 * @param pk the primary key of the fase postulacion
	 * @return the number of evaluacions associated with the fase postulacion
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getEvaluacionsSize(long pk) throws SystemException {
		long[] pks = fasePostulacionToEvaluacionTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the evaluacion is associated with the fase postulacion.
	 *
	 * @param pk the primary key of the fase postulacion
	 * @param evaluacionPK the primary key of the evaluacion
	 * @return <code>true</code> if the evaluacion is associated with the fase postulacion; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsEvaluacion(long pk, long evaluacionPK)
		throws SystemException {
		return fasePostulacionToEvaluacionTableMapper.containsTableMapping(pk,
			evaluacionPK);
	}

	/**
	 * Returns <code>true</code> if the fase postulacion has any evaluacions associated with it.
	 *
	 * @param pk the primary key of the fase postulacion to check for associations with evaluacions
	 * @return <code>true</code> if the fase postulacion has any evaluacions associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsEvaluacions(long pk) throws SystemException {
		if (getEvaluacionsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the fase postulacion and the evaluacion. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the fase postulacion
	 * @param evaluacionPK the primary key of the evaluacion
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEvaluacion(long pk, long evaluacionPK)
		throws SystemException {
		fasePostulacionToEvaluacionTableMapper.addTableMapping(pk, evaluacionPK);
	}

	/**
	 * Adds an association between the fase postulacion and the evaluacion. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the fase postulacion
	 * @param evaluacion the evaluacion
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEvaluacion(long pk,
		com.hitss.layer.model.Evaluacion evaluacion) throws SystemException {
		fasePostulacionToEvaluacionTableMapper.addTableMapping(pk,
			evaluacion.getPrimaryKey());
	}

	/**
	 * Adds an association between the fase postulacion and the evaluacions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the fase postulacion
	 * @param evaluacionPKs the primary keys of the evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEvaluacions(long pk, long[] evaluacionPKs)
		throws SystemException {
		for (long evaluacionPK : evaluacionPKs) {
			fasePostulacionToEvaluacionTableMapper.addTableMapping(pk,
				evaluacionPK);
		}
	}

	/**
	 * Adds an association between the fase postulacion and the evaluacions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the fase postulacion
	 * @param evaluacions the evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEvaluacions(long pk,
		List<com.hitss.layer.model.Evaluacion> evaluacions)
		throws SystemException {
		for (com.hitss.layer.model.Evaluacion evaluacion : evaluacions) {
			fasePostulacionToEvaluacionTableMapper.addTableMapping(pk,
				evaluacion.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the fase postulacion and its evaluacions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the fase postulacion to clear the associated evaluacions from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearEvaluacions(long pk) throws SystemException {
		fasePostulacionToEvaluacionTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the fase postulacion and the evaluacion. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the fase postulacion
	 * @param evaluacionPK the primary key of the evaluacion
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeEvaluacion(long pk, long evaluacionPK)
		throws SystemException {
		fasePostulacionToEvaluacionTableMapper.deleteTableMapping(pk,
			evaluacionPK);
	}

	/**
	 * Removes the association between the fase postulacion and the evaluacion. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the fase postulacion
	 * @param evaluacion the evaluacion
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeEvaluacion(long pk,
		com.hitss.layer.model.Evaluacion evaluacion) throws SystemException {
		fasePostulacionToEvaluacionTableMapper.deleteTableMapping(pk,
			evaluacion.getPrimaryKey());
	}

	/**
	 * Removes the association between the fase postulacion and the evaluacions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the fase postulacion
	 * @param evaluacionPKs the primary keys of the evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeEvaluacions(long pk, long[] evaluacionPKs)
		throws SystemException {
		for (long evaluacionPK : evaluacionPKs) {
			fasePostulacionToEvaluacionTableMapper.deleteTableMapping(pk,
				evaluacionPK);
		}
	}

	/**
	 * Removes the association between the fase postulacion and the evaluacions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the fase postulacion
	 * @param evaluacions the evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeEvaluacions(long pk,
		List<com.hitss.layer.model.Evaluacion> evaluacions)
		throws SystemException {
		for (com.hitss.layer.model.Evaluacion evaluacion : evaluacions) {
			fasePostulacionToEvaluacionTableMapper.deleteTableMapping(pk,
				evaluacion.getPrimaryKey());
		}
	}

	/**
	 * Sets the evaluacions associated with the fase postulacion, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the fase postulacion
	 * @param evaluacionPKs the primary keys of the evaluacions to be associated with the fase postulacion
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setEvaluacions(long pk, long[] evaluacionPKs)
		throws SystemException {
		Set<Long> newEvaluacionPKsSet = SetUtil.fromArray(evaluacionPKs);
		Set<Long> oldEvaluacionPKsSet = SetUtil.fromArray(fasePostulacionToEvaluacionTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeEvaluacionPKsSet = new HashSet<Long>(oldEvaluacionPKsSet);

		removeEvaluacionPKsSet.removeAll(newEvaluacionPKsSet);

		for (long removeEvaluacionPK : removeEvaluacionPKsSet) {
			fasePostulacionToEvaluacionTableMapper.deleteTableMapping(pk,
				removeEvaluacionPK);
		}

		newEvaluacionPKsSet.removeAll(oldEvaluacionPKsSet);

		for (long newEvaluacionPK : newEvaluacionPKsSet) {
			fasePostulacionToEvaluacionTableMapper.addTableMapping(pk,
				newEvaluacionPK);
		}
	}

	/**
	 * Sets the evaluacions associated with the fase postulacion, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the fase postulacion
	 * @param evaluacions the evaluacions to be associated with the fase postulacion
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setEvaluacions(long pk,
		List<com.hitss.layer.model.Evaluacion> evaluacions)
		throws SystemException {
		try {
			long[] evaluacionPKs = new long[evaluacions.size()];

			for (int i = 0; i < evaluacions.size(); i++) {
				com.hitss.layer.model.Evaluacion evaluacion = evaluacions.get(i);

				evaluacionPKs[i] = evaluacion.getPrimaryKey();
			}

			setEvaluacions(pk, evaluacionPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(FasePostulacionModelImpl.MAPPING_TABLE_REC_FASEPOSTULACIONEVALUACION_NAME);
		}
	}

	/**
	 * Initializes the fase postulacion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.FasePostulacion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FasePostulacion>> listenersList = new ArrayList<ModelListener<FasePostulacion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FasePostulacion>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		fasePostulacionToEvaluacionTableMapper = TableMapperFactory.getTableMapper("rec_FasePostulacionEvaluacion",
				"fasePostulacionId", "evaluacionId", this, evaluacionPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(FasePostulacionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("rec_FasePostulacionEvaluacion");
	}

	@BeanReference(type = EvaluacionPersistence.class)
	protected EvaluacionPersistence evaluacionPersistence;
	protected TableMapper<FasePostulacion, com.hitss.layer.model.Evaluacion> fasePostulacionToEvaluacionTableMapper;
	private static final String _SQL_SELECT_FASEPOSTULACION = "SELECT fasePostulacion FROM FasePostulacion fasePostulacion";
	private static final String _SQL_SELECT_FASEPOSTULACION_WHERE = "SELECT fasePostulacion FROM FasePostulacion fasePostulacion WHERE ";
	private static final String _SQL_COUNT_FASEPOSTULACION = "SELECT COUNT(fasePostulacion) FROM FasePostulacion fasePostulacion";
	private static final String _SQL_COUNT_FASEPOSTULACION_WHERE = "SELECT COUNT(fasePostulacion) FROM FasePostulacion fasePostulacion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "fasePostulacion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FasePostulacion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FasePostulacion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FasePostulacionPersistenceImpl.class);
	private static FasePostulacion _nullFasePostulacion = new FasePostulacionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FasePostulacion> toCacheModel() {
				return _nullFasePostulacionCacheModel;
			}
		};

	private static CacheModel<FasePostulacion> _nullFasePostulacionCacheModel = new CacheModel<FasePostulacion>() {
			@Override
			public FasePostulacion toEntityModel() {
				return _nullFasePostulacion;
			}
		};
}
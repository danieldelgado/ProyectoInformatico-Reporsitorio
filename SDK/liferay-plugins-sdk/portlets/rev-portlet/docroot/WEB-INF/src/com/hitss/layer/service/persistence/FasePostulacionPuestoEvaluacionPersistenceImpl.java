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

import com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException;
import com.hitss.layer.model.FasePostulacionPuestoEvaluacion;
import com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionImpl;
import com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl;

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
 * The persistence implementation for the fase postulacion puesto evaluacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see FasePostulacionPuestoEvaluacionPersistence
 * @see FasePostulacionPuestoEvaluacionUtil
 * @generated
 */
public class FasePostulacionPuestoEvaluacionPersistenceImpl
	extends BasePersistenceImpl<FasePostulacionPuestoEvaluacion>
	implements FasePostulacionPuestoEvaluacionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FasePostulacionPuestoEvaluacionUtil} to access the fase postulacion puesto evaluacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FasePostulacionPuestoEvaluacionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_S = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_S = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_S",
			new String[] { Long.class.getName(), Long.class.getName() },
			FasePostulacionPuestoEvaluacionModelImpl.FASEPOSTULACIONID_COLUMN_BITMASK |
			FasePostulacionPuestoEvaluacionModelImpl.SOLICITUDFUNCIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_S = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_S",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the fase postulacion puesto evaluacions where fasePostulacionId = &#63; and solicitudFuncionId = &#63;.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @return the matching fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findByF_S(
		long fasePostulacionId, long solicitudFuncionId)
		throws SystemException {
		return findByF_S(fasePostulacionId, solicitudFuncionId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fase postulacion puesto evaluacions where fasePostulacionId = &#63; and solicitudFuncionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param start the lower bound of the range of fase postulacion puesto evaluacions
	 * @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	 * @return the range of matching fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findByF_S(
		long fasePostulacionId, long solicitudFuncionId, int start, int end)
		throws SystemException {
		return findByF_S(fasePostulacionId, solicitudFuncionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fase postulacion puesto evaluacions where fasePostulacionId = &#63; and solicitudFuncionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param start the lower bound of the range of fase postulacion puesto evaluacions
	 * @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findByF_S(
		long fasePostulacionId, long solicitudFuncionId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_S;
			finderArgs = new Object[] { fasePostulacionId, solicitudFuncionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_S;
			finderArgs = new Object[] {
					fasePostulacionId, solicitudFuncionId,
					
					start, end, orderByComparator
				};
		}

		List<FasePostulacionPuestoEvaluacion> list = (List<FasePostulacionPuestoEvaluacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : list) {
				if ((fasePostulacionId != fasePostulacionPuestoEvaluacion.getFasePostulacionId()) ||
						(solicitudFuncionId != fasePostulacionPuestoEvaluacion.getSolicitudFuncionId())) {
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

			query.append(_SQL_SELECT_FASEPOSTULACIONPUESTOEVALUACION_WHERE);

			query.append(_FINDER_COLUMN_F_S_FASEPOSTULACIONID_2);

			query.append(_FINDER_COLUMN_F_S_SOLICITUDFUNCIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FasePostulacionPuestoEvaluacionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fasePostulacionId);

				qPos.add(solicitudFuncionId);

				if (!pagination) {
					list = (List<FasePostulacionPuestoEvaluacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FasePostulacionPuestoEvaluacion>(list);
				}
				else {
					list = (List<FasePostulacionPuestoEvaluacion>)QueryUtil.list(q,
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
	 * Returns the first fase postulacion puesto evaluacion in the ordered set where fasePostulacionId = &#63; and solicitudFuncionId = &#63;.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fase postulacion puesto evaluacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a matching fase postulacion puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion findByF_S_First(
		long fasePostulacionId, long solicitudFuncionId,
		OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = fetchByF_S_First(fasePostulacionId,
				solicitudFuncionId, orderByComparator);

		if (fasePostulacionPuestoEvaluacion != null) {
			return fasePostulacionPuestoEvaluacion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fasePostulacionId=");
		msg.append(fasePostulacionId);

		msg.append(", solicitudFuncionId=");
		msg.append(solicitudFuncionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFasePostulacionPuestoEvaluacionException(msg.toString());
	}

	/**
	 * Returns the first fase postulacion puesto evaluacion in the ordered set where fasePostulacionId = &#63; and solicitudFuncionId = &#63;.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fase postulacion puesto evaluacion, or <code>null</code> if a matching fase postulacion puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion fetchByF_S_First(
		long fasePostulacionId, long solicitudFuncionId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FasePostulacionPuestoEvaluacion> list = findByF_S(fasePostulacionId,
				solicitudFuncionId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fase postulacion puesto evaluacion in the ordered set where fasePostulacionId = &#63; and solicitudFuncionId = &#63;.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fase postulacion puesto evaluacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a matching fase postulacion puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion findByF_S_Last(
		long fasePostulacionId, long solicitudFuncionId,
		OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = fetchByF_S_Last(fasePostulacionId,
				solicitudFuncionId, orderByComparator);

		if (fasePostulacionPuestoEvaluacion != null) {
			return fasePostulacionPuestoEvaluacion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fasePostulacionId=");
		msg.append(fasePostulacionId);

		msg.append(", solicitudFuncionId=");
		msg.append(solicitudFuncionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFasePostulacionPuestoEvaluacionException(msg.toString());
	}

	/**
	 * Returns the last fase postulacion puesto evaluacion in the ordered set where fasePostulacionId = &#63; and solicitudFuncionId = &#63;.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fase postulacion puesto evaluacion, or <code>null</code> if a matching fase postulacion puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion fetchByF_S_Last(
		long fasePostulacionId, long solicitudFuncionId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByF_S(fasePostulacionId, solicitudFuncionId);

		if (count == 0) {
			return null;
		}

		List<FasePostulacionPuestoEvaluacion> list = findByF_S(fasePostulacionId,
				solicitudFuncionId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fase postulacion puesto evaluacions before and after the current fase postulacion puesto evaluacion in the ordered set where fasePostulacionId = &#63; and solicitudFuncionId = &#63;.
	 *
	 * @param fasePostulacionPuestoEvaluacionPK the primary key of the current fase postulacion puesto evaluacion
	 * @param fasePostulacionId the fase postulacion ID
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fase postulacion puesto evaluacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion[] findByF_S_PrevAndNext(
		FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK,
		long fasePostulacionId, long solicitudFuncionId,
		OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = findByPrimaryKey(fasePostulacionPuestoEvaluacionPK);

		Session session = null;

		try {
			session = openSession();

			FasePostulacionPuestoEvaluacion[] array = new FasePostulacionPuestoEvaluacionImpl[3];

			array[0] = getByF_S_PrevAndNext(session,
					fasePostulacionPuestoEvaluacion, fasePostulacionId,
					solicitudFuncionId, orderByComparator, true);

			array[1] = fasePostulacionPuestoEvaluacion;

			array[2] = getByF_S_PrevAndNext(session,
					fasePostulacionPuestoEvaluacion, fasePostulacionId,
					solicitudFuncionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FasePostulacionPuestoEvaluacion getByF_S_PrevAndNext(
		Session session,
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion,
		long fasePostulacionId, long solicitudFuncionId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FASEPOSTULACIONPUESTOEVALUACION_WHERE);

		query.append(_FINDER_COLUMN_F_S_FASEPOSTULACIONID_2);

		query.append(_FINDER_COLUMN_F_S_SOLICITUDFUNCIONID_2);

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
			query.append(FasePostulacionPuestoEvaluacionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(fasePostulacionId);

		qPos.add(solicitudFuncionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(fasePostulacionPuestoEvaluacion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FasePostulacionPuestoEvaluacion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fase postulacion puesto evaluacions where fasePostulacionId = &#63; and solicitudFuncionId = &#63; from the database.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByF_S(long fasePostulacionId, long solicitudFuncionId)
		throws SystemException {
		for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : findByF_S(
				fasePostulacionId, solicitudFuncionId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(fasePostulacionPuestoEvaluacion);
		}
	}

	/**
	 * Returns the number of fase postulacion puesto evaluacions where fasePostulacionId = &#63; and solicitudFuncionId = &#63;.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @return the number of matching fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_S(long fasePostulacionId, long solicitudFuncionId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_S;

		Object[] finderArgs = new Object[] { fasePostulacionId, solicitudFuncionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FASEPOSTULACIONPUESTOEVALUACION_WHERE);

			query.append(_FINDER_COLUMN_F_S_FASEPOSTULACIONID_2);

			query.append(_FINDER_COLUMN_F_S_SOLICITUDFUNCIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fasePostulacionId);

				qPos.add(solicitudFuncionId);

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

	private static final String _FINDER_COLUMN_F_S_FASEPOSTULACIONID_2 = "fasePostulacionPuestoEvaluacion.id.fasePostulacionId = ? AND ";
	private static final String _FINDER_COLUMN_F_S_SOLICITUDFUNCIONID_2 = "fasePostulacionPuestoEvaluacion.id.solicitudFuncionId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF",
			new String[] { Long.class.getName() },
			FasePostulacionPuestoEvaluacionModelImpl.FASEPOSTULACIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the fase postulacion puesto evaluacions where fasePostulacionId = &#63;.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @return the matching fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findByF(long fasePostulacionId)
		throws SystemException {
		return findByF(fasePostulacionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the fase postulacion puesto evaluacions where fasePostulacionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @param start the lower bound of the range of fase postulacion puesto evaluacions
	 * @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	 * @return the range of matching fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findByF(
		long fasePostulacionId, int start, int end) throws SystemException {
		return findByF(fasePostulacionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fase postulacion puesto evaluacions where fasePostulacionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @param start the lower bound of the range of fase postulacion puesto evaluacions
	 * @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findByF(
		long fasePostulacionId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F;
			finderArgs = new Object[] { fasePostulacionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F;
			finderArgs = new Object[] {
					fasePostulacionId,
					
					start, end, orderByComparator
				};
		}

		List<FasePostulacionPuestoEvaluacion> list = (List<FasePostulacionPuestoEvaluacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : list) {
				if ((fasePostulacionId != fasePostulacionPuestoEvaluacion.getFasePostulacionId())) {
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

			query.append(_SQL_SELECT_FASEPOSTULACIONPUESTOEVALUACION_WHERE);

			query.append(_FINDER_COLUMN_F_FASEPOSTULACIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FasePostulacionPuestoEvaluacionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fasePostulacionId);

				if (!pagination) {
					list = (List<FasePostulacionPuestoEvaluacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FasePostulacionPuestoEvaluacion>(list);
				}
				else {
					list = (List<FasePostulacionPuestoEvaluacion>)QueryUtil.list(q,
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
	 * Returns the first fase postulacion puesto evaluacion in the ordered set where fasePostulacionId = &#63;.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fase postulacion puesto evaluacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a matching fase postulacion puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion findByF_First(
		long fasePostulacionId, OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = fetchByF_First(fasePostulacionId,
				orderByComparator);

		if (fasePostulacionPuestoEvaluacion != null) {
			return fasePostulacionPuestoEvaluacion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fasePostulacionId=");
		msg.append(fasePostulacionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFasePostulacionPuestoEvaluacionException(msg.toString());
	}

	/**
	 * Returns the first fase postulacion puesto evaluacion in the ordered set where fasePostulacionId = &#63;.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fase postulacion puesto evaluacion, or <code>null</code> if a matching fase postulacion puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion fetchByF_First(
		long fasePostulacionId, OrderByComparator orderByComparator)
		throws SystemException {
		List<FasePostulacionPuestoEvaluacion> list = findByF(fasePostulacionId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fase postulacion puesto evaluacion in the ordered set where fasePostulacionId = &#63;.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fase postulacion puesto evaluacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a matching fase postulacion puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion findByF_Last(
		long fasePostulacionId, OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = fetchByF_Last(fasePostulacionId,
				orderByComparator);

		if (fasePostulacionPuestoEvaluacion != null) {
			return fasePostulacionPuestoEvaluacion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fasePostulacionId=");
		msg.append(fasePostulacionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFasePostulacionPuestoEvaluacionException(msg.toString());
	}

	/**
	 * Returns the last fase postulacion puesto evaluacion in the ordered set where fasePostulacionId = &#63;.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fase postulacion puesto evaluacion, or <code>null</code> if a matching fase postulacion puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion fetchByF_Last(
		long fasePostulacionId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByF(fasePostulacionId);

		if (count == 0) {
			return null;
		}

		List<FasePostulacionPuestoEvaluacion> list = findByF(fasePostulacionId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fase postulacion puesto evaluacions before and after the current fase postulacion puesto evaluacion in the ordered set where fasePostulacionId = &#63;.
	 *
	 * @param fasePostulacionPuestoEvaluacionPK the primary key of the current fase postulacion puesto evaluacion
	 * @param fasePostulacionId the fase postulacion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fase postulacion puesto evaluacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion[] findByF_PrevAndNext(
		FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK,
		long fasePostulacionId, OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = findByPrimaryKey(fasePostulacionPuestoEvaluacionPK);

		Session session = null;

		try {
			session = openSession();

			FasePostulacionPuestoEvaluacion[] array = new FasePostulacionPuestoEvaluacionImpl[3];

			array[0] = getByF_PrevAndNext(session,
					fasePostulacionPuestoEvaluacion, fasePostulacionId,
					orderByComparator, true);

			array[1] = fasePostulacionPuestoEvaluacion;

			array[2] = getByF_PrevAndNext(session,
					fasePostulacionPuestoEvaluacion, fasePostulacionId,
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

	protected FasePostulacionPuestoEvaluacion getByF_PrevAndNext(
		Session session,
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion,
		long fasePostulacionId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FASEPOSTULACIONPUESTOEVALUACION_WHERE);

		query.append(_FINDER_COLUMN_F_FASEPOSTULACIONID_2);

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
			query.append(FasePostulacionPuestoEvaluacionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(fasePostulacionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(fasePostulacionPuestoEvaluacion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FasePostulacionPuestoEvaluacion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fase postulacion puesto evaluacions where fasePostulacionId = &#63; from the database.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByF(long fasePostulacionId) throws SystemException {
		for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : findByF(
				fasePostulacionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(fasePostulacionPuestoEvaluacion);
		}
	}

	/**
	 * Returns the number of fase postulacion puesto evaluacions where fasePostulacionId = &#63;.
	 *
	 * @param fasePostulacionId the fase postulacion ID
	 * @return the number of matching fase postulacion puesto evaluacions
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

			query.append(_SQL_COUNT_FASEPOSTULACIONPUESTOEVALUACION_WHERE);

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

	private static final String _FINDER_COLUMN_F_FASEPOSTULACIONID_2 = "fasePostulacionPuestoEvaluacion.id.fasePostulacionId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS",
			new String[] { Long.class.getName() },
			FasePostulacionPuestoEvaluacionModelImpl.SOLICITUDFUNCIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the fase postulacion puesto evaluacions where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @return the matching fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findByS(
		long solicitudFuncionId) throws SystemException {
		return findByS(solicitudFuncionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fase postulacion puesto evaluacions where solicitudFuncionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param start the lower bound of the range of fase postulacion puesto evaluacions
	 * @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	 * @return the range of matching fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findByS(
		long solicitudFuncionId, int start, int end) throws SystemException {
		return findByS(solicitudFuncionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fase postulacion puesto evaluacions where solicitudFuncionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param start the lower bound of the range of fase postulacion puesto evaluacions
	 * @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findByS(
		long solicitudFuncionId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S;
			finderArgs = new Object[] { solicitudFuncionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S;
			finderArgs = new Object[] {
					solicitudFuncionId,
					
					start, end, orderByComparator
				};
		}

		List<FasePostulacionPuestoEvaluacion> list = (List<FasePostulacionPuestoEvaluacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : list) {
				if ((solicitudFuncionId != fasePostulacionPuestoEvaluacion.getSolicitudFuncionId())) {
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

			query.append(_SQL_SELECT_FASEPOSTULACIONPUESTOEVALUACION_WHERE);

			query.append(_FINDER_COLUMN_S_SOLICITUDFUNCIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FasePostulacionPuestoEvaluacionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudFuncionId);

				if (!pagination) {
					list = (List<FasePostulacionPuestoEvaluacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FasePostulacionPuestoEvaluacion>(list);
				}
				else {
					list = (List<FasePostulacionPuestoEvaluacion>)QueryUtil.list(q,
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
	 * Returns the first fase postulacion puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fase postulacion puesto evaluacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a matching fase postulacion puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion findByS_First(
		long solicitudFuncionId, OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = fetchByS_First(solicitudFuncionId,
				orderByComparator);

		if (fasePostulacionPuestoEvaluacion != null) {
			return fasePostulacionPuestoEvaluacion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudFuncionId=");
		msg.append(solicitudFuncionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFasePostulacionPuestoEvaluacionException(msg.toString());
	}

	/**
	 * Returns the first fase postulacion puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fase postulacion puesto evaluacion, or <code>null</code> if a matching fase postulacion puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion fetchByS_First(
		long solicitudFuncionId, OrderByComparator orderByComparator)
		throws SystemException {
		List<FasePostulacionPuestoEvaluacion> list = findByS(solicitudFuncionId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fase postulacion puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fase postulacion puesto evaluacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a matching fase postulacion puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion findByS_Last(
		long solicitudFuncionId, OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = fetchByS_Last(solicitudFuncionId,
				orderByComparator);

		if (fasePostulacionPuestoEvaluacion != null) {
			return fasePostulacionPuestoEvaluacion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("solicitudFuncionId=");
		msg.append(solicitudFuncionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFasePostulacionPuestoEvaluacionException(msg.toString());
	}

	/**
	 * Returns the last fase postulacion puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fase postulacion puesto evaluacion, or <code>null</code> if a matching fase postulacion puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion fetchByS_Last(
		long solicitudFuncionId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByS(solicitudFuncionId);

		if (count == 0) {
			return null;
		}

		List<FasePostulacionPuestoEvaluacion> list = findByS(solicitudFuncionId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fase postulacion puesto evaluacions before and after the current fase postulacion puesto evaluacion in the ordered set where solicitudFuncionId = &#63;.
	 *
	 * @param fasePostulacionPuestoEvaluacionPK the primary key of the current fase postulacion puesto evaluacion
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fase postulacion puesto evaluacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion[] findByS_PrevAndNext(
		FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK,
		long solicitudFuncionId, OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = findByPrimaryKey(fasePostulacionPuestoEvaluacionPK);

		Session session = null;

		try {
			session = openSession();

			FasePostulacionPuestoEvaluacion[] array = new FasePostulacionPuestoEvaluacionImpl[3];

			array[0] = getByS_PrevAndNext(session,
					fasePostulacionPuestoEvaluacion, solicitudFuncionId,
					orderByComparator, true);

			array[1] = fasePostulacionPuestoEvaluacion;

			array[2] = getByS_PrevAndNext(session,
					fasePostulacionPuestoEvaluacion, solicitudFuncionId,
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

	protected FasePostulacionPuestoEvaluacion getByS_PrevAndNext(
		Session session,
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion,
		long solicitudFuncionId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FASEPOSTULACIONPUESTOEVALUACION_WHERE);

		query.append(_FINDER_COLUMN_S_SOLICITUDFUNCIONID_2);

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
			query.append(FasePostulacionPuestoEvaluacionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(solicitudFuncionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(fasePostulacionPuestoEvaluacion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FasePostulacionPuestoEvaluacion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fase postulacion puesto evaluacions where solicitudFuncionId = &#63; from the database.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS(long solicitudFuncionId) throws SystemException {
		for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : findByS(
				solicitudFuncionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(fasePostulacionPuestoEvaluacion);
		}
	}

	/**
	 * Returns the number of fase postulacion puesto evaluacions where solicitudFuncionId = &#63;.
	 *
	 * @param solicitudFuncionId the solicitud funcion ID
	 * @return the number of matching fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS(long solicitudFuncionId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S;

		Object[] finderArgs = new Object[] { solicitudFuncionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FASEPOSTULACIONPUESTOEVALUACION_WHERE);

			query.append(_FINDER_COLUMN_S_SOLICITUDFUNCIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(solicitudFuncionId);

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

	private static final String _FINDER_COLUMN_S_SOLICITUDFUNCIONID_2 = "fasePostulacionPuestoEvaluacion.id.solicitudFuncionId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_E = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByE",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByE",
			new String[] { Long.class.getName() },
			FasePostulacionPuestoEvaluacionModelImpl.EVALUACIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_E = new FinderPath(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByE",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the fase postulacion puesto evaluacions where evaluacionId = &#63;.
	 *
	 * @param evaluacionId the evaluacion ID
	 * @return the matching fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findByE(long evaluacionId)
		throws SystemException {
		return findByE(evaluacionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fase postulacion puesto evaluacions where evaluacionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param evaluacionId the evaluacion ID
	 * @param start the lower bound of the range of fase postulacion puesto evaluacions
	 * @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	 * @return the range of matching fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findByE(long evaluacionId,
		int start, int end) throws SystemException {
		return findByE(evaluacionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fase postulacion puesto evaluacions where evaluacionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param evaluacionId the evaluacion ID
	 * @param start the lower bound of the range of fase postulacion puesto evaluacions
	 * @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findByE(long evaluacionId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E;
			finderArgs = new Object[] { evaluacionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_E;
			finderArgs = new Object[] {
					evaluacionId,
					
					start, end, orderByComparator
				};
		}

		List<FasePostulacionPuestoEvaluacion> list = (List<FasePostulacionPuestoEvaluacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : list) {
				if ((evaluacionId != fasePostulacionPuestoEvaluacion.getEvaluacionId())) {
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

			query.append(_SQL_SELECT_FASEPOSTULACIONPUESTOEVALUACION_WHERE);

			query.append(_FINDER_COLUMN_E_EVALUACIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FasePostulacionPuestoEvaluacionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(evaluacionId);

				if (!pagination) {
					list = (List<FasePostulacionPuestoEvaluacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FasePostulacionPuestoEvaluacion>(list);
				}
				else {
					list = (List<FasePostulacionPuestoEvaluacion>)QueryUtil.list(q,
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
	 * Returns the first fase postulacion puesto evaluacion in the ordered set where evaluacionId = &#63;.
	 *
	 * @param evaluacionId the evaluacion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fase postulacion puesto evaluacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a matching fase postulacion puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion findByE_First(long evaluacionId,
		OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = fetchByE_First(evaluacionId,
				orderByComparator);

		if (fasePostulacionPuestoEvaluacion != null) {
			return fasePostulacionPuestoEvaluacion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("evaluacionId=");
		msg.append(evaluacionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFasePostulacionPuestoEvaluacionException(msg.toString());
	}

	/**
	 * Returns the first fase postulacion puesto evaluacion in the ordered set where evaluacionId = &#63;.
	 *
	 * @param evaluacionId the evaluacion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fase postulacion puesto evaluacion, or <code>null</code> if a matching fase postulacion puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion fetchByE_First(long evaluacionId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FasePostulacionPuestoEvaluacion> list = findByE(evaluacionId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fase postulacion puesto evaluacion in the ordered set where evaluacionId = &#63;.
	 *
	 * @param evaluacionId the evaluacion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fase postulacion puesto evaluacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a matching fase postulacion puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion findByE_Last(long evaluacionId,
		OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = fetchByE_Last(evaluacionId,
				orderByComparator);

		if (fasePostulacionPuestoEvaluacion != null) {
			return fasePostulacionPuestoEvaluacion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("evaluacionId=");
		msg.append(evaluacionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFasePostulacionPuestoEvaluacionException(msg.toString());
	}

	/**
	 * Returns the last fase postulacion puesto evaluacion in the ordered set where evaluacionId = &#63;.
	 *
	 * @param evaluacionId the evaluacion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fase postulacion puesto evaluacion, or <code>null</code> if a matching fase postulacion puesto evaluacion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion fetchByE_Last(long evaluacionId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByE(evaluacionId);

		if (count == 0) {
			return null;
		}

		List<FasePostulacionPuestoEvaluacion> list = findByE(evaluacionId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fase postulacion puesto evaluacions before and after the current fase postulacion puesto evaluacion in the ordered set where evaluacionId = &#63;.
	 *
	 * @param fasePostulacionPuestoEvaluacionPK the primary key of the current fase postulacion puesto evaluacion
	 * @param evaluacionId the evaluacion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fase postulacion puesto evaluacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion[] findByE_PrevAndNext(
		FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK,
		long evaluacionId, OrderByComparator orderByComparator)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = findByPrimaryKey(fasePostulacionPuestoEvaluacionPK);

		Session session = null;

		try {
			session = openSession();

			FasePostulacionPuestoEvaluacion[] array = new FasePostulacionPuestoEvaluacionImpl[3];

			array[0] = getByE_PrevAndNext(session,
					fasePostulacionPuestoEvaluacion, evaluacionId,
					orderByComparator, true);

			array[1] = fasePostulacionPuestoEvaluacion;

			array[2] = getByE_PrevAndNext(session,
					fasePostulacionPuestoEvaluacion, evaluacionId,
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

	protected FasePostulacionPuestoEvaluacion getByE_PrevAndNext(
		Session session,
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion,
		long evaluacionId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FASEPOSTULACIONPUESTOEVALUACION_WHERE);

		query.append(_FINDER_COLUMN_E_EVALUACIONID_2);

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
			query.append(FasePostulacionPuestoEvaluacionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(evaluacionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(fasePostulacionPuestoEvaluacion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FasePostulacionPuestoEvaluacion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fase postulacion puesto evaluacions where evaluacionId = &#63; from the database.
	 *
	 * @param evaluacionId the evaluacion ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByE(long evaluacionId) throws SystemException {
		for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : findByE(
				evaluacionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(fasePostulacionPuestoEvaluacion);
		}
	}

	/**
	 * Returns the number of fase postulacion puesto evaluacions where evaluacionId = &#63;.
	 *
	 * @param evaluacionId the evaluacion ID
	 * @return the number of matching fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByE(long evaluacionId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_E;

		Object[] finderArgs = new Object[] { evaluacionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FASEPOSTULACIONPUESTOEVALUACION_WHERE);

			query.append(_FINDER_COLUMN_E_EVALUACIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(evaluacionId);

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

	private static final String _FINDER_COLUMN_E_EVALUACIONID_2 = "fasePostulacionPuestoEvaluacion.id.evaluacionId = ?";

	public FasePostulacionPuestoEvaluacionPersistenceImpl() {
		setModelClass(FasePostulacionPuestoEvaluacion.class);
	}

	/**
	 * Caches the fase postulacion puesto evaluacion in the entity cache if it is enabled.
	 *
	 * @param fasePostulacionPuestoEvaluacion the fase postulacion puesto evaluacion
	 */
	@Override
	public void cacheResult(
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion) {
		EntityCacheUtil.putResult(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			fasePostulacionPuestoEvaluacion.getPrimaryKey(),
			fasePostulacionPuestoEvaluacion);

		fasePostulacionPuestoEvaluacion.resetOriginalValues();
	}

	/**
	 * Caches the fase postulacion puesto evaluacions in the entity cache if it is enabled.
	 *
	 * @param fasePostulacionPuestoEvaluacions the fase postulacion puesto evaluacions
	 */
	@Override
	public void cacheResult(
		List<FasePostulacionPuestoEvaluacion> fasePostulacionPuestoEvaluacions) {
		for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : fasePostulacionPuestoEvaluacions) {
			if (EntityCacheUtil.getResult(
						FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
						FasePostulacionPuestoEvaluacionImpl.class,
						fasePostulacionPuestoEvaluacion.getPrimaryKey()) == null) {
				cacheResult(fasePostulacionPuestoEvaluacion);
			}
			else {
				fasePostulacionPuestoEvaluacion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all fase postulacion puesto evaluacions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FasePostulacionPuestoEvaluacionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FasePostulacionPuestoEvaluacionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the fase postulacion puesto evaluacion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion) {
		EntityCacheUtil.removeResult(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			fasePostulacionPuestoEvaluacion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<FasePostulacionPuestoEvaluacion> fasePostulacionPuestoEvaluacions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : fasePostulacionPuestoEvaluacions) {
			EntityCacheUtil.removeResult(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
				FasePostulacionPuestoEvaluacionImpl.class,
				fasePostulacionPuestoEvaluacion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new fase postulacion puesto evaluacion with the primary key. Does not add the fase postulacion puesto evaluacion to the database.
	 *
	 * @param fasePostulacionPuestoEvaluacionPK the primary key for the new fase postulacion puesto evaluacion
	 * @return the new fase postulacion puesto evaluacion
	 */
	@Override
	public FasePostulacionPuestoEvaluacion create(
		FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK) {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = new FasePostulacionPuestoEvaluacionImpl();

		fasePostulacionPuestoEvaluacion.setNew(true);
		fasePostulacionPuestoEvaluacion.setPrimaryKey(fasePostulacionPuestoEvaluacionPK);

		return fasePostulacionPuestoEvaluacion;
	}

	/**
	 * Removes the fase postulacion puesto evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fasePostulacionPuestoEvaluacionPK the primary key of the fase postulacion puesto evaluacion
	 * @return the fase postulacion puesto evaluacion that was removed
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion remove(
		FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		return remove((Serializable)fasePostulacionPuestoEvaluacionPK);
	}

	/**
	 * Removes the fase postulacion puesto evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fase postulacion puesto evaluacion
	 * @return the fase postulacion puesto evaluacion that was removed
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion remove(Serializable primaryKey)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = (FasePostulacionPuestoEvaluacion)session.get(FasePostulacionPuestoEvaluacionImpl.class,
					primaryKey);

			if (fasePostulacionPuestoEvaluacion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFasePostulacionPuestoEvaluacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(fasePostulacionPuestoEvaluacion);
		}
		catch (NoSuchFasePostulacionPuestoEvaluacionException nsee) {
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
	protected FasePostulacionPuestoEvaluacion removeImpl(
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion)
		throws SystemException {
		fasePostulacionPuestoEvaluacion = toUnwrappedModel(fasePostulacionPuestoEvaluacion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fasePostulacionPuestoEvaluacion)) {
				fasePostulacionPuestoEvaluacion = (FasePostulacionPuestoEvaluacion)session.get(FasePostulacionPuestoEvaluacionImpl.class,
						fasePostulacionPuestoEvaluacion.getPrimaryKeyObj());
			}

			if (fasePostulacionPuestoEvaluacion != null) {
				session.delete(fasePostulacionPuestoEvaluacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (fasePostulacionPuestoEvaluacion != null) {
			clearCache(fasePostulacionPuestoEvaluacion);
		}

		return fasePostulacionPuestoEvaluacion;
	}

	@Override
	public FasePostulacionPuestoEvaluacion updateImpl(
		com.hitss.layer.model.FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion)
		throws SystemException {
		fasePostulacionPuestoEvaluacion = toUnwrappedModel(fasePostulacionPuestoEvaluacion);

		boolean isNew = fasePostulacionPuestoEvaluacion.isNew();

		FasePostulacionPuestoEvaluacionModelImpl fasePostulacionPuestoEvaluacionModelImpl =
			(FasePostulacionPuestoEvaluacionModelImpl)fasePostulacionPuestoEvaluacion;

		Session session = null;

		try {
			session = openSession();

			if (fasePostulacionPuestoEvaluacion.isNew()) {
				session.save(fasePostulacionPuestoEvaluacion);

				fasePostulacionPuestoEvaluacion.setNew(false);
			}
			else {
				session.merge(fasePostulacionPuestoEvaluacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!FasePostulacionPuestoEvaluacionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((fasePostulacionPuestoEvaluacionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fasePostulacionPuestoEvaluacionModelImpl.getOriginalFasePostulacionId(),
						fasePostulacionPuestoEvaluacionModelImpl.getOriginalSolicitudFuncionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_S,
					args);

				args = new Object[] {
						fasePostulacionPuestoEvaluacionModelImpl.getFasePostulacionId(),
						fasePostulacionPuestoEvaluacionModelImpl.getSolicitudFuncionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_S,
					args);
			}

			if ((fasePostulacionPuestoEvaluacionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fasePostulacionPuestoEvaluacionModelImpl.getOriginalFasePostulacionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F,
					args);

				args = new Object[] {
						fasePostulacionPuestoEvaluacionModelImpl.getFasePostulacionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F,
					args);
			}

			if ((fasePostulacionPuestoEvaluacionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fasePostulacionPuestoEvaluacionModelImpl.getOriginalSolicitudFuncionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S,
					args);

				args = new Object[] {
						fasePostulacionPuestoEvaluacionModelImpl.getSolicitudFuncionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S,
					args);
			}

			if ((fasePostulacionPuestoEvaluacionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fasePostulacionPuestoEvaluacionModelImpl.getOriginalEvaluacionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_E, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E,
					args);

				args = new Object[] {
						fasePostulacionPuestoEvaluacionModelImpl.getEvaluacionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_E, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E,
					args);
			}
		}

		EntityCacheUtil.putResult(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
			FasePostulacionPuestoEvaluacionImpl.class,
			fasePostulacionPuestoEvaluacion.getPrimaryKey(),
			fasePostulacionPuestoEvaluacion);

		return fasePostulacionPuestoEvaluacion;
	}

	protected FasePostulacionPuestoEvaluacion toUnwrappedModel(
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion) {
		if (fasePostulacionPuestoEvaluacion instanceof FasePostulacionPuestoEvaluacionImpl) {
			return fasePostulacionPuestoEvaluacion;
		}

		FasePostulacionPuestoEvaluacionImpl fasePostulacionPuestoEvaluacionImpl = new FasePostulacionPuestoEvaluacionImpl();

		fasePostulacionPuestoEvaluacionImpl.setNew(fasePostulacionPuestoEvaluacion.isNew());
		fasePostulacionPuestoEvaluacionImpl.setPrimaryKey(fasePostulacionPuestoEvaluacion.getPrimaryKey());

		fasePostulacionPuestoEvaluacionImpl.setFasePostulacionId(fasePostulacionPuestoEvaluacion.getFasePostulacionId());
		fasePostulacionPuestoEvaluacionImpl.setSolicitudFuncionId(fasePostulacionPuestoEvaluacion.getSolicitudFuncionId());
		fasePostulacionPuestoEvaluacionImpl.setEvaluacionId(fasePostulacionPuestoEvaluacion.getEvaluacionId());
		fasePostulacionPuestoEvaluacionImpl.setResultado(fasePostulacionPuestoEvaluacion.getResultado());

		return fasePostulacionPuestoEvaluacionImpl;
	}

	/**
	 * Returns the fase postulacion puesto evaluacion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the fase postulacion puesto evaluacion
	 * @return the fase postulacion puesto evaluacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = fetchByPrimaryKey(primaryKey);

		if (fasePostulacionPuestoEvaluacion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFasePostulacionPuestoEvaluacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return fasePostulacionPuestoEvaluacion;
	}

	/**
	 * Returns the fase postulacion puesto evaluacion with the primary key or throws a {@link com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException} if it could not be found.
	 *
	 * @param fasePostulacionPuestoEvaluacionPK the primary key of the fase postulacion puesto evaluacion
	 * @return the fase postulacion puesto evaluacion
	 * @throws com.hitss.layer.NoSuchFasePostulacionPuestoEvaluacionException if a fase postulacion puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion findByPrimaryKey(
		FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws NoSuchFasePostulacionPuestoEvaluacionException, SystemException {
		return findByPrimaryKey((Serializable)fasePostulacionPuestoEvaluacionPK);
	}

	/**
	 * Returns the fase postulacion puesto evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fase postulacion puesto evaluacion
	 * @return the fase postulacion puesto evaluacion, or <code>null</code> if a fase postulacion puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion = (FasePostulacionPuestoEvaluacion)EntityCacheUtil.getResult(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
				FasePostulacionPuestoEvaluacionImpl.class, primaryKey);

		if (fasePostulacionPuestoEvaluacion == _nullFasePostulacionPuestoEvaluacion) {
			return null;
		}

		if (fasePostulacionPuestoEvaluacion == null) {
			Session session = null;

			try {
				session = openSession();

				fasePostulacionPuestoEvaluacion = (FasePostulacionPuestoEvaluacion)session.get(FasePostulacionPuestoEvaluacionImpl.class,
						primaryKey);

				if (fasePostulacionPuestoEvaluacion != null) {
					cacheResult(fasePostulacionPuestoEvaluacion);
				}
				else {
					EntityCacheUtil.putResult(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
						FasePostulacionPuestoEvaluacionImpl.class, primaryKey,
						_nullFasePostulacionPuestoEvaluacion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FasePostulacionPuestoEvaluacionModelImpl.ENTITY_CACHE_ENABLED,
					FasePostulacionPuestoEvaluacionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return fasePostulacionPuestoEvaluacion;
	}

	/**
	 * Returns the fase postulacion puesto evaluacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fasePostulacionPuestoEvaluacionPK the primary key of the fase postulacion puesto evaluacion
	 * @return the fase postulacion puesto evaluacion, or <code>null</code> if a fase postulacion puesto evaluacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FasePostulacionPuestoEvaluacion fetchByPrimaryKey(
		FasePostulacionPuestoEvaluacionPK fasePostulacionPuestoEvaluacionPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)fasePostulacionPuestoEvaluacionPK);
	}

	/**
	 * Returns all the fase postulacion puesto evaluacions.
	 *
	 * @return the fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fase postulacion puesto evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of fase postulacion puesto evaluacions
	 * @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	 * @return the range of fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fase postulacion puesto evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FasePostulacionPuestoEvaluacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of fase postulacion puesto evaluacions
	 * @param end the upper bound of the range of fase postulacion puesto evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fase postulacion puesto evaluacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FasePostulacionPuestoEvaluacion> findAll(int start, int end,
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

		List<FasePostulacionPuestoEvaluacion> list = (List<FasePostulacionPuestoEvaluacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FASEPOSTULACIONPUESTOEVALUACION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FASEPOSTULACIONPUESTOEVALUACION;

				if (pagination) {
					sql = sql.concat(FasePostulacionPuestoEvaluacionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FasePostulacionPuestoEvaluacion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FasePostulacionPuestoEvaluacion>(list);
				}
				else {
					list = (List<FasePostulacionPuestoEvaluacion>)QueryUtil.list(q,
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
	 * Removes all the fase postulacion puesto evaluacions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : findAll()) {
			remove(fasePostulacionPuestoEvaluacion);
		}
	}

	/**
	 * Returns the number of fase postulacion puesto evaluacions.
	 *
	 * @return the number of fase postulacion puesto evaluacions
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

				Query q = session.createQuery(_SQL_COUNT_FASEPOSTULACIONPUESTOEVALUACION);

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
	 * Initializes the fase postulacion puesto evaluacion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.FasePostulacionPuestoEvaluacion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FasePostulacionPuestoEvaluacion>> listenersList =
					new ArrayList<ModelListener<FasePostulacionPuestoEvaluacion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FasePostulacionPuestoEvaluacion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FasePostulacionPuestoEvaluacionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FASEPOSTULACIONPUESTOEVALUACION = "SELECT fasePostulacionPuestoEvaluacion FROM FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion";
	private static final String _SQL_SELECT_FASEPOSTULACIONPUESTOEVALUACION_WHERE =
		"SELECT fasePostulacionPuestoEvaluacion FROM FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion WHERE ";
	private static final String _SQL_COUNT_FASEPOSTULACIONPUESTOEVALUACION = "SELECT COUNT(fasePostulacionPuestoEvaluacion) FROM FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion";
	private static final String _SQL_COUNT_FASEPOSTULACIONPUESTOEVALUACION_WHERE =
		"SELECT COUNT(fasePostulacionPuestoEvaluacion) FROM FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "fasePostulacionPuestoEvaluacion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FasePostulacionPuestoEvaluacion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FasePostulacionPuestoEvaluacion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FasePostulacionPuestoEvaluacionPersistenceImpl.class);
	private static FasePostulacionPuestoEvaluacion _nullFasePostulacionPuestoEvaluacion =
		new FasePostulacionPuestoEvaluacionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FasePostulacionPuestoEvaluacion> toCacheModel() {
				return _nullFasePostulacionPuestoEvaluacionCacheModel;
			}
		};

	private static CacheModel<FasePostulacionPuestoEvaluacion> _nullFasePostulacionPuestoEvaluacionCacheModel =
		new CacheModel<FasePostulacionPuestoEvaluacion>() {
			@Override
			public FasePostulacionPuestoEvaluacion toEntityModel() {
				return _nullFasePostulacionPuestoEvaluacion;
			}
		};
}
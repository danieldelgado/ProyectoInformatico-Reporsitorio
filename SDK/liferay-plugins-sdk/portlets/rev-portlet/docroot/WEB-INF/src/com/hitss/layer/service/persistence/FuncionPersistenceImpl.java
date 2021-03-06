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

import com.hitss.layer.NoSuchFuncionException;
import com.hitss.layer.model.Funcion;
import com.hitss.layer.model.impl.FuncionImpl;
import com.hitss.layer.model.impl.FuncionModelImpl;

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
import com.liferay.portal.kernel.util.CharPool;
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
 * The persistence implementation for the funcion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see FuncionPersistence
 * @see FuncionUtil
 * @generated
 */
public class FuncionPersistenceImpl extends BasePersistenceImpl<Funcion>
	implements FuncionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FuncionUtil} to access the funcion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FuncionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FuncionModelImpl.ENTITY_CACHE_ENABLED,
			FuncionModelImpl.FINDER_CACHE_ENABLED, FuncionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FuncionModelImpl.ENTITY_CACHE_ENABLED,
			FuncionModelImpl.FINDER_CACHE_ENABLED, FuncionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FuncionModelImpl.ENTITY_CACHE_ENABLED,
			FuncionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_ACTIVO = new FinderPath(FuncionModelImpl.ENTITY_CACHE_ENABLED,
			FuncionModelImpl.FINDER_CACHE_ENABLED, FuncionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF_Activo",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_ACTIVO =
		new FinderPath(FuncionModelImpl.ENTITY_CACHE_ENABLED,
			FuncionModelImpl.FINDER_CACHE_ENABLED, FuncionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_Activo",
			new String[] { Boolean.class.getName() },
			FuncionModelImpl.ACTIVO_COLUMN_BITMASK |
			FuncionModelImpl.FECHAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_ACTIVO = new FinderPath(FuncionModelImpl.ENTITY_CACHE_ENABLED,
			FuncionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_Activo",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the funcions where activo = &#63;.
	 *
	 * @param activo the activo
	 * @return the matching funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Funcion> findByF_Activo(boolean activo)
		throws SystemException {
		return findByF_Activo(activo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the funcions where activo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param activo the activo
	 * @param start the lower bound of the range of funcions
	 * @param end the upper bound of the range of funcions (not inclusive)
	 * @return the range of matching funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Funcion> findByF_Activo(boolean activo, int start, int end)
		throws SystemException {
		return findByF_Activo(activo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the funcions where activo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param activo the activo
	 * @param start the lower bound of the range of funcions
	 * @param end the upper bound of the range of funcions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Funcion> findByF_Activo(boolean activo, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_ACTIVO;
			finderArgs = new Object[] { activo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_ACTIVO;
			finderArgs = new Object[] { activo, start, end, orderByComparator };
		}

		List<Funcion> list = (List<Funcion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Funcion funcion : list) {
				if ((activo != funcion.getActivo())) {
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

			query.append(_SQL_SELECT_FUNCION_WHERE);

			query.append(_FINDER_COLUMN_F_ACTIVO_ACTIVO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FuncionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(activo);

				if (!pagination) {
					list = (List<Funcion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Funcion>(list);
				}
				else {
					list = (List<Funcion>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first funcion in the ordered set where activo = &#63;.
	 *
	 * @param activo the activo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching funcion
	 * @throws com.hitss.layer.NoSuchFuncionException if a matching funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Funcion findByF_Activo_First(boolean activo,
		OrderByComparator orderByComparator)
		throws NoSuchFuncionException, SystemException {
		Funcion funcion = fetchByF_Activo_First(activo, orderByComparator);

		if (funcion != null) {
			return funcion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("activo=");
		msg.append(activo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFuncionException(msg.toString());
	}

	/**
	 * Returns the first funcion in the ordered set where activo = &#63;.
	 *
	 * @param activo the activo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching funcion, or <code>null</code> if a matching funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Funcion fetchByF_Activo_First(boolean activo,
		OrderByComparator orderByComparator) throws SystemException {
		List<Funcion> list = findByF_Activo(activo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last funcion in the ordered set where activo = &#63;.
	 *
	 * @param activo the activo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching funcion
	 * @throws com.hitss.layer.NoSuchFuncionException if a matching funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Funcion findByF_Activo_Last(boolean activo,
		OrderByComparator orderByComparator)
		throws NoSuchFuncionException, SystemException {
		Funcion funcion = fetchByF_Activo_Last(activo, orderByComparator);

		if (funcion != null) {
			return funcion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("activo=");
		msg.append(activo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFuncionException(msg.toString());
	}

	/**
	 * Returns the last funcion in the ordered set where activo = &#63;.
	 *
	 * @param activo the activo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching funcion, or <code>null</code> if a matching funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Funcion fetchByF_Activo_Last(boolean activo,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByF_Activo(activo);

		if (count == 0) {
			return null;
		}

		List<Funcion> list = findByF_Activo(activo, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the funcions before and after the current funcion in the ordered set where activo = &#63;.
	 *
	 * @param funcionId the primary key of the current funcion
	 * @param activo the activo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next funcion
	 * @throws com.hitss.layer.NoSuchFuncionException if a funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Funcion[] findByF_Activo_PrevAndNext(long funcionId, boolean activo,
		OrderByComparator orderByComparator)
		throws NoSuchFuncionException, SystemException {
		Funcion funcion = findByPrimaryKey(funcionId);

		Session session = null;

		try {
			session = openSession();

			Funcion[] array = new FuncionImpl[3];

			array[0] = getByF_Activo_PrevAndNext(session, funcion, activo,
					orderByComparator, true);

			array[1] = funcion;

			array[2] = getByF_Activo_PrevAndNext(session, funcion, activo,
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

	protected Funcion getByF_Activo_PrevAndNext(Session session,
		Funcion funcion, boolean activo, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FUNCION_WHERE);

		query.append(_FINDER_COLUMN_F_ACTIVO_ACTIVO_2);

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
			query.append(FuncionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(activo);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(funcion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Funcion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the funcions where activo = &#63; from the database.
	 *
	 * @param activo the activo
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByF_Activo(boolean activo) throws SystemException {
		for (Funcion funcion : findByF_Activo(activo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(funcion);
		}
	}

	/**
	 * Returns the number of funcions where activo = &#63;.
	 *
	 * @param activo the activo
	 * @return the number of matching funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_Activo(boolean activo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_ACTIVO;

		Object[] finderArgs = new Object[] { activo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FUNCION_WHERE);

			query.append(_FINDER_COLUMN_F_ACTIVO_ACTIVO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(activo);

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

	private static final String _FINDER_COLUMN_F_ACTIVO_ACTIVO_2 = "funcion.activo = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_ACTIVO = new FinderPath(FuncionModelImpl.ENTITY_CACHE_ENABLED,
			FuncionModelImpl.FINDER_CACHE_ENABLED, FuncionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByD_Activo",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_D_ACTIVO =
		new FinderPath(FuncionModelImpl.ENTITY_CACHE_ENABLED,
			FuncionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByD_Activo",
			new String[] { String.class.getName() });

	/**
	 * Returns all the funcions where descripcion LIKE &#63;.
	 *
	 * @param descripcion the descripcion
	 * @return the matching funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Funcion> findByD_Activo(String descripcion)
		throws SystemException {
		return findByD_Activo(descripcion, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the funcions where descripcion LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param descripcion the descripcion
	 * @param start the lower bound of the range of funcions
	 * @param end the upper bound of the range of funcions (not inclusive)
	 * @return the range of matching funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Funcion> findByD_Activo(String descripcion, int start, int end)
		throws SystemException {
		return findByD_Activo(descripcion, start, end, null);
	}

	/**
	 * Returns an ordered range of all the funcions where descripcion LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param descripcion the descripcion
	 * @param start the lower bound of the range of funcions
	 * @param end the upper bound of the range of funcions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Funcion> findByD_Activo(String descripcion, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_ACTIVO;
		finderArgs = new Object[] { descripcion, start, end, orderByComparator };

		List<Funcion> list = (List<Funcion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Funcion funcion : list) {
				if (!StringUtil.wildcardMatches(funcion.getDescripcion(),
							descripcion, CharPool.UNDERLINE, CharPool.PERCENT,
							CharPool.BACK_SLASH, true)) {
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

			query.append(_SQL_SELECT_FUNCION_WHERE);

			boolean bindDescripcion = false;

			if (descripcion == null) {
				query.append(_FINDER_COLUMN_D_ACTIVO_DESCRIPCION_1);
			}
			else if (descripcion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_D_ACTIVO_DESCRIPCION_3);
			}
			else {
				bindDescripcion = true;

				query.append(_FINDER_COLUMN_D_ACTIVO_DESCRIPCION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FuncionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDescripcion) {
					qPos.add(descripcion);
				}

				if (!pagination) {
					list = (List<Funcion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Funcion>(list);
				}
				else {
					list = (List<Funcion>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first funcion in the ordered set where descripcion LIKE &#63;.
	 *
	 * @param descripcion the descripcion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching funcion
	 * @throws com.hitss.layer.NoSuchFuncionException if a matching funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Funcion findByD_Activo_First(String descripcion,
		OrderByComparator orderByComparator)
		throws NoSuchFuncionException, SystemException {
		Funcion funcion = fetchByD_Activo_First(descripcion, orderByComparator);

		if (funcion != null) {
			return funcion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("descripcion=");
		msg.append(descripcion);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFuncionException(msg.toString());
	}

	/**
	 * Returns the first funcion in the ordered set where descripcion LIKE &#63;.
	 *
	 * @param descripcion the descripcion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching funcion, or <code>null</code> if a matching funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Funcion fetchByD_Activo_First(String descripcion,
		OrderByComparator orderByComparator) throws SystemException {
		List<Funcion> list = findByD_Activo(descripcion, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last funcion in the ordered set where descripcion LIKE &#63;.
	 *
	 * @param descripcion the descripcion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching funcion
	 * @throws com.hitss.layer.NoSuchFuncionException if a matching funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Funcion findByD_Activo_Last(String descripcion,
		OrderByComparator orderByComparator)
		throws NoSuchFuncionException, SystemException {
		Funcion funcion = fetchByD_Activo_Last(descripcion, orderByComparator);

		if (funcion != null) {
			return funcion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("descripcion=");
		msg.append(descripcion);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFuncionException(msg.toString());
	}

	/**
	 * Returns the last funcion in the ordered set where descripcion LIKE &#63;.
	 *
	 * @param descripcion the descripcion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching funcion, or <code>null</code> if a matching funcion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Funcion fetchByD_Activo_Last(String descripcion,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByD_Activo(descripcion);

		if (count == 0) {
			return null;
		}

		List<Funcion> list = findByD_Activo(descripcion, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the funcions before and after the current funcion in the ordered set where descripcion LIKE &#63;.
	 *
	 * @param funcionId the primary key of the current funcion
	 * @param descripcion the descripcion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next funcion
	 * @throws com.hitss.layer.NoSuchFuncionException if a funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Funcion[] findByD_Activo_PrevAndNext(long funcionId,
		String descripcion, OrderByComparator orderByComparator)
		throws NoSuchFuncionException, SystemException {
		Funcion funcion = findByPrimaryKey(funcionId);

		Session session = null;

		try {
			session = openSession();

			Funcion[] array = new FuncionImpl[3];

			array[0] = getByD_Activo_PrevAndNext(session, funcion, descripcion,
					orderByComparator, true);

			array[1] = funcion;

			array[2] = getByD_Activo_PrevAndNext(session, funcion, descripcion,
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

	protected Funcion getByD_Activo_PrevAndNext(Session session,
		Funcion funcion, String descripcion,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FUNCION_WHERE);

		boolean bindDescripcion = false;

		if (descripcion == null) {
			query.append(_FINDER_COLUMN_D_ACTIVO_DESCRIPCION_1);
		}
		else if (descripcion.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_D_ACTIVO_DESCRIPCION_3);
		}
		else {
			bindDescripcion = true;

			query.append(_FINDER_COLUMN_D_ACTIVO_DESCRIPCION_2);
		}

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
			query.append(FuncionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDescripcion) {
			qPos.add(descripcion);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(funcion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Funcion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the funcions where descripcion LIKE &#63; from the database.
	 *
	 * @param descripcion the descripcion
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_Activo(String descripcion) throws SystemException {
		for (Funcion funcion : findByD_Activo(descripcion, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(funcion);
		}
	}

	/**
	 * Returns the number of funcions where descripcion LIKE &#63;.
	 *
	 * @param descripcion the descripcion
	 * @return the number of matching funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_Activo(String descripcion) throws SystemException {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_D_ACTIVO;

		Object[] finderArgs = new Object[] { descripcion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FUNCION_WHERE);

			boolean bindDescripcion = false;

			if (descripcion == null) {
				query.append(_FINDER_COLUMN_D_ACTIVO_DESCRIPCION_1);
			}
			else if (descripcion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_D_ACTIVO_DESCRIPCION_3);
			}
			else {
				bindDescripcion = true;

				query.append(_FINDER_COLUMN_D_ACTIVO_DESCRIPCION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDescripcion) {
					qPos.add(descripcion);
				}

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

	private static final String _FINDER_COLUMN_D_ACTIVO_DESCRIPCION_1 = "funcion.descripcion LIKE NULL AND funcion.activo=true";
	private static final String _FINDER_COLUMN_D_ACTIVO_DESCRIPCION_2 = "funcion.descripcion LIKE ? AND funcion.activo=true";
	private static final String _FINDER_COLUMN_D_ACTIVO_DESCRIPCION_3 = "(funcion.descripcion IS NULL OR funcion.descripcion LIKE '') AND funcion.activo=true";

	public FuncionPersistenceImpl() {
		setModelClass(Funcion.class);
	}

	/**
	 * Caches the funcion in the entity cache if it is enabled.
	 *
	 * @param funcion the funcion
	 */
	@Override
	public void cacheResult(Funcion funcion) {
		EntityCacheUtil.putResult(FuncionModelImpl.ENTITY_CACHE_ENABLED,
			FuncionImpl.class, funcion.getPrimaryKey(), funcion);

		funcion.resetOriginalValues();
	}

	/**
	 * Caches the funcions in the entity cache if it is enabled.
	 *
	 * @param funcions the funcions
	 */
	@Override
	public void cacheResult(List<Funcion> funcions) {
		for (Funcion funcion : funcions) {
			if (EntityCacheUtil.getResult(
						FuncionModelImpl.ENTITY_CACHE_ENABLED,
						FuncionImpl.class, funcion.getPrimaryKey()) == null) {
				cacheResult(funcion);
			}
			else {
				funcion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all funcions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FuncionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FuncionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the funcion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Funcion funcion) {
		EntityCacheUtil.removeResult(FuncionModelImpl.ENTITY_CACHE_ENABLED,
			FuncionImpl.class, funcion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Funcion> funcions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Funcion funcion : funcions) {
			EntityCacheUtil.removeResult(FuncionModelImpl.ENTITY_CACHE_ENABLED,
				FuncionImpl.class, funcion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new funcion with the primary key. Does not add the funcion to the database.
	 *
	 * @param funcionId the primary key for the new funcion
	 * @return the new funcion
	 */
	@Override
	public Funcion create(long funcionId) {
		Funcion funcion = new FuncionImpl();

		funcion.setNew(true);
		funcion.setPrimaryKey(funcionId);

		return funcion;
	}

	/**
	 * Removes the funcion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param funcionId the primary key of the funcion
	 * @return the funcion that was removed
	 * @throws com.hitss.layer.NoSuchFuncionException if a funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Funcion remove(long funcionId)
		throws NoSuchFuncionException, SystemException {
		return remove((Serializable)funcionId);
	}

	/**
	 * Removes the funcion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the funcion
	 * @return the funcion that was removed
	 * @throws com.hitss.layer.NoSuchFuncionException if a funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Funcion remove(Serializable primaryKey)
		throws NoSuchFuncionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Funcion funcion = (Funcion)session.get(FuncionImpl.class, primaryKey);

			if (funcion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFuncionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(funcion);
		}
		catch (NoSuchFuncionException nsee) {
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
	protected Funcion removeImpl(Funcion funcion) throws SystemException {
		funcion = toUnwrappedModel(funcion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(funcion)) {
				funcion = (Funcion)session.get(FuncionImpl.class,
						funcion.getPrimaryKeyObj());
			}

			if (funcion != null) {
				session.delete(funcion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (funcion != null) {
			clearCache(funcion);
		}

		return funcion;
	}

	@Override
	public Funcion updateImpl(com.hitss.layer.model.Funcion funcion)
		throws SystemException {
		funcion = toUnwrappedModel(funcion);

		boolean isNew = funcion.isNew();

		FuncionModelImpl funcionModelImpl = (FuncionModelImpl)funcion;

		Session session = null;

		try {
			session = openSession();

			if (funcion.isNew()) {
				session.save(funcion);

				funcion.setNew(false);
			}
			else {
				session.merge(funcion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FuncionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((funcionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_ACTIVO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						funcionModelImpl.getOriginalActivo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_ACTIVO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_ACTIVO,
					args);

				args = new Object[] { funcionModelImpl.getActivo() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_ACTIVO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_ACTIVO,
					args);
			}
		}

		EntityCacheUtil.putResult(FuncionModelImpl.ENTITY_CACHE_ENABLED,
			FuncionImpl.class, funcion.getPrimaryKey(), funcion);

		return funcion;
	}

	protected Funcion toUnwrappedModel(Funcion funcion) {
		if (funcion instanceof FuncionImpl) {
			return funcion;
		}

		FuncionImpl funcionImpl = new FuncionImpl();

		funcionImpl.setNew(funcion.isNew());
		funcionImpl.setPrimaryKey(funcion.getPrimaryKey());

		funcionImpl.setFuncionId(funcion.getFuncionId());
		funcionImpl.setDescripcion(funcion.getDescripcion());
		funcionImpl.setExigible(funcion.isExigible());
		funcionImpl.setActivo(funcion.isActivo());
		funcionImpl.setUsuariocrea(funcion.getUsuariocrea());
		funcionImpl.setFechacrea(funcion.getFechacrea());
		funcionImpl.setUsuariomodifica(funcion.getUsuariomodifica());
		funcionImpl.setFechamodifica(funcion.getFechamodifica());

		return funcionImpl;
	}

	/**
	 * Returns the funcion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the funcion
	 * @return the funcion
	 * @throws com.hitss.layer.NoSuchFuncionException if a funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Funcion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFuncionException, SystemException {
		Funcion funcion = fetchByPrimaryKey(primaryKey);

		if (funcion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFuncionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return funcion;
	}

	/**
	 * Returns the funcion with the primary key or throws a {@link com.hitss.layer.NoSuchFuncionException} if it could not be found.
	 *
	 * @param funcionId the primary key of the funcion
	 * @return the funcion
	 * @throws com.hitss.layer.NoSuchFuncionException if a funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Funcion findByPrimaryKey(long funcionId)
		throws NoSuchFuncionException, SystemException {
		return findByPrimaryKey((Serializable)funcionId);
	}

	/**
	 * Returns the funcion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the funcion
	 * @return the funcion, or <code>null</code> if a funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Funcion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Funcion funcion = (Funcion)EntityCacheUtil.getResult(FuncionModelImpl.ENTITY_CACHE_ENABLED,
				FuncionImpl.class, primaryKey);

		if (funcion == _nullFuncion) {
			return null;
		}

		if (funcion == null) {
			Session session = null;

			try {
				session = openSession();

				funcion = (Funcion)session.get(FuncionImpl.class, primaryKey);

				if (funcion != null) {
					cacheResult(funcion);
				}
				else {
					EntityCacheUtil.putResult(FuncionModelImpl.ENTITY_CACHE_ENABLED,
						FuncionImpl.class, primaryKey, _nullFuncion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FuncionModelImpl.ENTITY_CACHE_ENABLED,
					FuncionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return funcion;
	}

	/**
	 * Returns the funcion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param funcionId the primary key of the funcion
	 * @return the funcion, or <code>null</code> if a funcion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Funcion fetchByPrimaryKey(long funcionId) throws SystemException {
		return fetchByPrimaryKey((Serializable)funcionId);
	}

	/**
	 * Returns all the funcions.
	 *
	 * @return the funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Funcion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the funcions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of funcions
	 * @param end the upper bound of the range of funcions (not inclusive)
	 * @return the range of funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Funcion> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the funcions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.FuncionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of funcions
	 * @param end the upper bound of the range of funcions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of funcions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Funcion> findAll(int start, int end,
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

		List<Funcion> list = (List<Funcion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FUNCION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FUNCION;

				if (pagination) {
					sql = sql.concat(FuncionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Funcion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Funcion>(list);
				}
				else {
					list = (List<Funcion>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the funcions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Funcion funcion : findAll()) {
			remove(funcion);
		}
	}

	/**
	 * Returns the number of funcions.
	 *
	 * @return the number of funcions
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

				Query q = session.createQuery(_SQL_COUNT_FUNCION);

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
	 * Initializes the funcion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.Funcion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Funcion>> listenersList = new ArrayList<ModelListener<Funcion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Funcion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FuncionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FUNCION = "SELECT funcion FROM Funcion funcion";
	private static final String _SQL_SELECT_FUNCION_WHERE = "SELECT funcion FROM Funcion funcion WHERE ";
	private static final String _SQL_COUNT_FUNCION = "SELECT COUNT(funcion) FROM Funcion funcion";
	private static final String _SQL_COUNT_FUNCION_WHERE = "SELECT COUNT(funcion) FROM Funcion funcion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "funcion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Funcion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Funcion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FuncionPersistenceImpl.class);
	private static Funcion _nullFuncion = new FuncionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Funcion> toCacheModel() {
				return _nullFuncionCacheModel;
			}
		};

	private static CacheModel<Funcion> _nullFuncionCacheModel = new CacheModel<Funcion>() {
			@Override
			public Funcion toEntityModel() {
				return _nullFuncion;
			}
		};
}
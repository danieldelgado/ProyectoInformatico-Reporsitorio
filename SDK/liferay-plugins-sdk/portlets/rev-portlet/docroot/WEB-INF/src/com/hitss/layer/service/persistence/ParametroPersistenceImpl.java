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

import com.hitss.layer.NoSuchParametroException;
import com.hitss.layer.model.Parametro;
import com.hitss.layer.model.impl.ParametroImpl;
import com.hitss.layer.model.impl.ParametroModelImpl;

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
 * The persistence implementation for the parametro service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see ParametroPersistence
 * @see ParametroUtil
 * @generated
 */
public class ParametroPersistenceImpl extends BasePersistenceImpl<Parametro>
	implements ParametroPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ParametroUtil} to access the parametro persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ParametroImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroModelImpl.FINDER_CACHE_ENABLED, ParametroImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroModelImpl.FINDER_CACHE_ENABLED, ParametroImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PARAMETROPADRE =
		new FinderPath(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroModelImpl.FINDER_CACHE_ENABLED, ParametroImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByParametroPadre",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARAMETROPADRE =
		new FinderPath(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroModelImpl.FINDER_CACHE_ENABLED, ParametroImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByParametroPadre",
			new String[] { Long.class.getName() },
			ParametroModelImpl.PARAMETROIDPADRE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PARAMETROPADRE = new FinderPath(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByParametroPadre",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the parametros where parametroIdpadre = &#63;.
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @return the matching parametros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Parametro> findByParametroPadre(long parametroIdpadre)
		throws SystemException {
		return findByParametroPadre(parametroIdpadre, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the parametros where parametroIdpadre = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @param start the lower bound of the range of parametros
	 * @param end the upper bound of the range of parametros (not inclusive)
	 * @return the range of matching parametros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Parametro> findByParametroPadre(long parametroIdpadre,
		int start, int end) throws SystemException {
		return findByParametroPadre(parametroIdpadre, start, end, null);
	}

	/**
	 * Returns an ordered range of all the parametros where parametroIdpadre = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @param start the lower bound of the range of parametros
	 * @param end the upper bound of the range of parametros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching parametros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Parametro> findByParametroPadre(long parametroIdpadre,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARAMETROPADRE;
			finderArgs = new Object[] { parametroIdpadre };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PARAMETROPADRE;
			finderArgs = new Object[] {
					parametroIdpadre,
					
					start, end, orderByComparator
				};
		}

		List<Parametro> list = (List<Parametro>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Parametro parametro : list) {
				if ((parametroIdpadre != parametro.getParametroIdpadre())) {
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

			query.append(_SQL_SELECT_PARAMETRO_WHERE);

			query.append(_FINDER_COLUMN_PARAMETROPADRE_PARAMETROIDPADRE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ParametroModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parametroIdpadre);

				if (!pagination) {
					list = (List<Parametro>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Parametro>(list);
				}
				else {
					list = (List<Parametro>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first parametro in the ordered set where parametroIdpadre = &#63;.
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parametro
	 * @throws com.hitss.layer.NoSuchParametroException if a matching parametro could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro findByParametroPadre_First(long parametroIdpadre,
		OrderByComparator orderByComparator)
		throws NoSuchParametroException, SystemException {
		Parametro parametro = fetchByParametroPadre_First(parametroIdpadre,
				orderByComparator);

		if (parametro != null) {
			return parametro;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parametroIdpadre=");
		msg.append(parametroIdpadre);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchParametroException(msg.toString());
	}

	/**
	 * Returns the first parametro in the ordered set where parametroIdpadre = &#63;.
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parametro, or <code>null</code> if a matching parametro could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro fetchByParametroPadre_First(long parametroIdpadre,
		OrderByComparator orderByComparator) throws SystemException {
		List<Parametro> list = findByParametroPadre(parametroIdpadre, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last parametro in the ordered set where parametroIdpadre = &#63;.
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parametro
	 * @throws com.hitss.layer.NoSuchParametroException if a matching parametro could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro findByParametroPadre_Last(long parametroIdpadre,
		OrderByComparator orderByComparator)
		throws NoSuchParametroException, SystemException {
		Parametro parametro = fetchByParametroPadre_Last(parametroIdpadre,
				orderByComparator);

		if (parametro != null) {
			return parametro;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parametroIdpadre=");
		msg.append(parametroIdpadre);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchParametroException(msg.toString());
	}

	/**
	 * Returns the last parametro in the ordered set where parametroIdpadre = &#63;.
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parametro, or <code>null</code> if a matching parametro could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro fetchByParametroPadre_Last(long parametroIdpadre,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByParametroPadre(parametroIdpadre);

		if (count == 0) {
			return null;
		}

		List<Parametro> list = findByParametroPadre(parametroIdpadre,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the parametros before and after the current parametro in the ordered set where parametroIdpadre = &#63;.
	 *
	 * @param parametroId the primary key of the current parametro
	 * @param parametroIdpadre the parametro idpadre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next parametro
	 * @throws com.hitss.layer.NoSuchParametroException if a parametro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro[] findByParametroPadre_PrevAndNext(long parametroId,
		long parametroIdpadre, OrderByComparator orderByComparator)
		throws NoSuchParametroException, SystemException {
		Parametro parametro = findByPrimaryKey(parametroId);

		Session session = null;

		try {
			session = openSession();

			Parametro[] array = new ParametroImpl[3];

			array[0] = getByParametroPadre_PrevAndNext(session, parametro,
					parametroIdpadre, orderByComparator, true);

			array[1] = parametro;

			array[2] = getByParametroPadre_PrevAndNext(session, parametro,
					parametroIdpadre, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Parametro getByParametroPadre_PrevAndNext(Session session,
		Parametro parametro, long parametroIdpadre,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PARAMETRO_WHERE);

		query.append(_FINDER_COLUMN_PARAMETROPADRE_PARAMETROIDPADRE_2);

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
			query.append(ParametroModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(parametroIdpadre);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(parametro);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Parametro> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the parametros where parametroIdpadre = &#63; from the database.
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByParametroPadre(long parametroIdpadre)
		throws SystemException {
		for (Parametro parametro : findByParametroPadre(parametroIdpadre,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(parametro);
		}
	}

	/**
	 * Returns the number of parametros where parametroIdpadre = &#63;.
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @return the number of matching parametros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByParametroPadre(long parametroIdpadre)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PARAMETROPADRE;

		Object[] finderArgs = new Object[] { parametroIdpadre };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PARAMETRO_WHERE);

			query.append(_FINDER_COLUMN_PARAMETROPADRE_PARAMETROIDPADRE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parametroIdpadre);

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

	private static final String _FINDER_COLUMN_PARAMETROPADRE_PARAMETROIDPADRE_2 =
		"parametro.parametroIdpadre = ? AND parametro.activo = 1";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VALOR = new FinderPath(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroModelImpl.FINDER_CACHE_ENABLED, ParametroImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByValor",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_VALOR = new FinderPath(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByValor",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the parametros where parametroIdpadre = &#63; and valor LIKE &#63;.
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @param valor the valor
	 * @return the matching parametros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Parametro> findByValor(long parametroIdpadre, String valor)
		throws SystemException {
		return findByValor(parametroIdpadre, valor, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the parametros where parametroIdpadre = &#63; and valor LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @param valor the valor
	 * @param start the lower bound of the range of parametros
	 * @param end the upper bound of the range of parametros (not inclusive)
	 * @return the range of matching parametros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Parametro> findByValor(long parametroIdpadre, String valor,
		int start, int end) throws SystemException {
		return findByValor(parametroIdpadre, valor, start, end, null);
	}

	/**
	 * Returns an ordered range of all the parametros where parametroIdpadre = &#63; and valor LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @param valor the valor
	 * @param start the lower bound of the range of parametros
	 * @param end the upper bound of the range of parametros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching parametros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Parametro> findByValor(long parametroIdpadre, String valor,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VALOR;
		finderArgs = new Object[] {
				parametroIdpadre, valor,
				
				start, end, orderByComparator
			};

		List<Parametro> list = (List<Parametro>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Parametro parametro : list) {
				if ((parametroIdpadre != parametro.getParametroIdpadre()) ||
						!StringUtil.wildcardMatches(parametro.getValor(),
							valor, CharPool.UNDERLINE, CharPool.PERCENT,
							CharPool.BACK_SLASH, true)) {
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

			query.append(_SQL_SELECT_PARAMETRO_WHERE);

			query.append(_FINDER_COLUMN_VALOR_PARAMETROIDPADRE_2);

			boolean bindValor = false;

			if (valor == null) {
				query.append(_FINDER_COLUMN_VALOR_VALOR_1);
			}
			else if (valor.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VALOR_VALOR_3);
			}
			else {
				bindValor = true;

				query.append(_FINDER_COLUMN_VALOR_VALOR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ParametroModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parametroIdpadre);

				if (bindValor) {
					qPos.add(valor);
				}

				if (!pagination) {
					list = (List<Parametro>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Parametro>(list);
				}
				else {
					list = (List<Parametro>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first parametro in the ordered set where parametroIdpadre = &#63; and valor LIKE &#63;.
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @param valor the valor
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parametro
	 * @throws com.hitss.layer.NoSuchParametroException if a matching parametro could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro findByValor_First(long parametroIdpadre, String valor,
		OrderByComparator orderByComparator)
		throws NoSuchParametroException, SystemException {
		Parametro parametro = fetchByValor_First(parametroIdpadre, valor,
				orderByComparator);

		if (parametro != null) {
			return parametro;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parametroIdpadre=");
		msg.append(parametroIdpadre);

		msg.append(", valor=");
		msg.append(valor);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchParametroException(msg.toString());
	}

	/**
	 * Returns the first parametro in the ordered set where parametroIdpadre = &#63; and valor LIKE &#63;.
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @param valor the valor
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parametro, or <code>null</code> if a matching parametro could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro fetchByValor_First(long parametroIdpadre, String valor,
		OrderByComparator orderByComparator) throws SystemException {
		List<Parametro> list = findByValor(parametroIdpadre, valor, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last parametro in the ordered set where parametroIdpadre = &#63; and valor LIKE &#63;.
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @param valor the valor
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parametro
	 * @throws com.hitss.layer.NoSuchParametroException if a matching parametro could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro findByValor_Last(long parametroIdpadre, String valor,
		OrderByComparator orderByComparator)
		throws NoSuchParametroException, SystemException {
		Parametro parametro = fetchByValor_Last(parametroIdpadre, valor,
				orderByComparator);

		if (parametro != null) {
			return parametro;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parametroIdpadre=");
		msg.append(parametroIdpadre);

		msg.append(", valor=");
		msg.append(valor);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchParametroException(msg.toString());
	}

	/**
	 * Returns the last parametro in the ordered set where parametroIdpadre = &#63; and valor LIKE &#63;.
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @param valor the valor
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parametro, or <code>null</code> if a matching parametro could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro fetchByValor_Last(long parametroIdpadre, String valor,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByValor(parametroIdpadre, valor);

		if (count == 0) {
			return null;
		}

		List<Parametro> list = findByValor(parametroIdpadre, valor, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the parametros before and after the current parametro in the ordered set where parametroIdpadre = &#63; and valor LIKE &#63;.
	 *
	 * @param parametroId the primary key of the current parametro
	 * @param parametroIdpadre the parametro idpadre
	 * @param valor the valor
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next parametro
	 * @throws com.hitss.layer.NoSuchParametroException if a parametro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro[] findByValor_PrevAndNext(long parametroId,
		long parametroIdpadre, String valor, OrderByComparator orderByComparator)
		throws NoSuchParametroException, SystemException {
		Parametro parametro = findByPrimaryKey(parametroId);

		Session session = null;

		try {
			session = openSession();

			Parametro[] array = new ParametroImpl[3];

			array[0] = getByValor_PrevAndNext(session, parametro,
					parametroIdpadre, valor, orderByComparator, true);

			array[1] = parametro;

			array[2] = getByValor_PrevAndNext(session, parametro,
					parametroIdpadre, valor, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Parametro getByValor_PrevAndNext(Session session,
		Parametro parametro, long parametroIdpadre, String valor,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PARAMETRO_WHERE);

		query.append(_FINDER_COLUMN_VALOR_PARAMETROIDPADRE_2);

		boolean bindValor = false;

		if (valor == null) {
			query.append(_FINDER_COLUMN_VALOR_VALOR_1);
		}
		else if (valor.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VALOR_VALOR_3);
		}
		else {
			bindValor = true;

			query.append(_FINDER_COLUMN_VALOR_VALOR_2);
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
			query.append(ParametroModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(parametroIdpadre);

		if (bindValor) {
			qPos.add(valor);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(parametro);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Parametro> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the parametros where parametroIdpadre = &#63; and valor LIKE &#63; from the database.
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @param valor the valor
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByValor(long parametroIdpadre, String valor)
		throws SystemException {
		for (Parametro parametro : findByValor(parametroIdpadre, valor,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(parametro);
		}
	}

	/**
	 * Returns the number of parametros where parametroIdpadre = &#63; and valor LIKE &#63;.
	 *
	 * @param parametroIdpadre the parametro idpadre
	 * @param valor the valor
	 * @return the number of matching parametros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByValor(long parametroIdpadre, String valor)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_VALOR;

		Object[] finderArgs = new Object[] { parametroIdpadre, valor };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PARAMETRO_WHERE);

			query.append(_FINDER_COLUMN_VALOR_PARAMETROIDPADRE_2);

			boolean bindValor = false;

			if (valor == null) {
				query.append(_FINDER_COLUMN_VALOR_VALOR_1);
			}
			else if (valor.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VALOR_VALOR_3);
			}
			else {
				bindValor = true;

				query.append(_FINDER_COLUMN_VALOR_VALOR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parametroIdpadre);

				if (bindValor) {
					qPos.add(valor);
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

	private static final String _FINDER_COLUMN_VALOR_PARAMETROIDPADRE_2 = "parametro.parametroIdpadre = ? AND ";
	private static final String _FINDER_COLUMN_VALOR_VALOR_1 = "parametro.valor LIKE NULL AND parametro.activo = 1";
	private static final String _FINDER_COLUMN_VALOR_VALOR_2 = "parametro.valor LIKE ? AND parametro.activo = 1";
	private static final String _FINDER_COLUMN_VALOR_VALOR_3 = "(parametro.valor IS NULL OR parametro.valor LIKE '') AND parametro.activo = 1";

	public ParametroPersistenceImpl() {
		setModelClass(Parametro.class);
	}

	/**
	 * Caches the parametro in the entity cache if it is enabled.
	 *
	 * @param parametro the parametro
	 */
	@Override
	public void cacheResult(Parametro parametro) {
		EntityCacheUtil.putResult(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroImpl.class, parametro.getPrimaryKey(), parametro);

		parametro.resetOriginalValues();
	}

	/**
	 * Caches the parametros in the entity cache if it is enabled.
	 *
	 * @param parametros the parametros
	 */
	@Override
	public void cacheResult(List<Parametro> parametros) {
		for (Parametro parametro : parametros) {
			if (EntityCacheUtil.getResult(
						ParametroModelImpl.ENTITY_CACHE_ENABLED,
						ParametroImpl.class, parametro.getPrimaryKey()) == null) {
				cacheResult(parametro);
			}
			else {
				parametro.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all parametros.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ParametroImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ParametroImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the parametro.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Parametro parametro) {
		EntityCacheUtil.removeResult(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroImpl.class, parametro.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Parametro> parametros) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Parametro parametro : parametros) {
			EntityCacheUtil.removeResult(ParametroModelImpl.ENTITY_CACHE_ENABLED,
				ParametroImpl.class, parametro.getPrimaryKey());
		}
	}

	/**
	 * Creates a new parametro with the primary key. Does not add the parametro to the database.
	 *
	 * @param parametroId the primary key for the new parametro
	 * @return the new parametro
	 */
	@Override
	public Parametro create(long parametroId) {
		Parametro parametro = new ParametroImpl();

		parametro.setNew(true);
		parametro.setPrimaryKey(parametroId);

		return parametro;
	}

	/**
	 * Removes the parametro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param parametroId the primary key of the parametro
	 * @return the parametro that was removed
	 * @throws com.hitss.layer.NoSuchParametroException if a parametro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro remove(long parametroId)
		throws NoSuchParametroException, SystemException {
		return remove((Serializable)parametroId);
	}

	/**
	 * Removes the parametro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the parametro
	 * @return the parametro that was removed
	 * @throws com.hitss.layer.NoSuchParametroException if a parametro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro remove(Serializable primaryKey)
		throws NoSuchParametroException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Parametro parametro = (Parametro)session.get(ParametroImpl.class,
					primaryKey);

			if (parametro == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchParametroException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(parametro);
		}
		catch (NoSuchParametroException nsee) {
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
	protected Parametro removeImpl(Parametro parametro)
		throws SystemException {
		parametro = toUnwrappedModel(parametro);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(parametro)) {
				parametro = (Parametro)session.get(ParametroImpl.class,
						parametro.getPrimaryKeyObj());
			}

			if (parametro != null) {
				session.delete(parametro);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (parametro != null) {
			clearCache(parametro);
		}

		return parametro;
	}

	@Override
	public Parametro updateImpl(com.hitss.layer.model.Parametro parametro)
		throws SystemException {
		parametro = toUnwrappedModel(parametro);

		boolean isNew = parametro.isNew();

		ParametroModelImpl parametroModelImpl = (ParametroModelImpl)parametro;

		Session session = null;

		try {
			session = openSession();

			if (parametro.isNew()) {
				session.save(parametro);

				parametro.setNew(false);
			}
			else {
				session.merge(parametro);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ParametroModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((parametroModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARAMETROPADRE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						parametroModelImpl.getOriginalParametroIdpadre()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PARAMETROPADRE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARAMETROPADRE,
					args);

				args = new Object[] { parametroModelImpl.getParametroIdpadre() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PARAMETROPADRE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARAMETROPADRE,
					args);
			}
		}

		EntityCacheUtil.putResult(ParametroModelImpl.ENTITY_CACHE_ENABLED,
			ParametroImpl.class, parametro.getPrimaryKey(), parametro);

		return parametro;
	}

	protected Parametro toUnwrappedModel(Parametro parametro) {
		if (parametro instanceof ParametroImpl) {
			return parametro;
		}

		ParametroImpl parametroImpl = new ParametroImpl();

		parametroImpl.setNew(parametro.isNew());
		parametroImpl.setPrimaryKey(parametro.getPrimaryKey());

		parametroImpl.setParametroId(parametro.getParametroId());
		parametroImpl.setParametroIdpadre(parametro.getParametroIdpadre());
		parametroImpl.setCodigo(parametro.getCodigo());
		parametroImpl.setDescripcion(parametro.getDescripcion());
		parametroImpl.setValor(parametro.getValor());
		parametroImpl.setTipodato(parametro.getTipodato());
		parametroImpl.setActivo(parametro.isActivo());
		parametroImpl.setUsuariocrea(parametro.getUsuariocrea());
		parametroImpl.setFechacrea(parametro.getFechacrea());
		parametroImpl.setUsuariomodifica(parametro.getUsuariomodifica());
		parametroImpl.setFechacreamodifica(parametro.getFechacreamodifica());

		return parametroImpl;
	}

	/**
	 * Returns the parametro with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the parametro
	 * @return the parametro
	 * @throws com.hitss.layer.NoSuchParametroException if a parametro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro findByPrimaryKey(Serializable primaryKey)
		throws NoSuchParametroException, SystemException {
		Parametro parametro = fetchByPrimaryKey(primaryKey);

		if (parametro == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchParametroException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return parametro;
	}

	/**
	 * Returns the parametro with the primary key or throws a {@link com.hitss.layer.NoSuchParametroException} if it could not be found.
	 *
	 * @param parametroId the primary key of the parametro
	 * @return the parametro
	 * @throws com.hitss.layer.NoSuchParametroException if a parametro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro findByPrimaryKey(long parametroId)
		throws NoSuchParametroException, SystemException {
		return findByPrimaryKey((Serializable)parametroId);
	}

	/**
	 * Returns the parametro with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the parametro
	 * @return the parametro, or <code>null</code> if a parametro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Parametro parametro = (Parametro)EntityCacheUtil.getResult(ParametroModelImpl.ENTITY_CACHE_ENABLED,
				ParametroImpl.class, primaryKey);

		if (parametro == _nullParametro) {
			return null;
		}

		if (parametro == null) {
			Session session = null;

			try {
				session = openSession();

				parametro = (Parametro)session.get(ParametroImpl.class,
						primaryKey);

				if (parametro != null) {
					cacheResult(parametro);
				}
				else {
					EntityCacheUtil.putResult(ParametroModelImpl.ENTITY_CACHE_ENABLED,
						ParametroImpl.class, primaryKey, _nullParametro);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ParametroModelImpl.ENTITY_CACHE_ENABLED,
					ParametroImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return parametro;
	}

	/**
	 * Returns the parametro with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param parametroId the primary key of the parametro
	 * @return the parametro, or <code>null</code> if a parametro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parametro fetchByPrimaryKey(long parametroId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)parametroId);
	}

	/**
	 * Returns all the parametros.
	 *
	 * @return the parametros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Parametro> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the parametros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of parametros
	 * @param end the upper bound of the range of parametros (not inclusive)
	 * @return the range of parametros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Parametro> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the parametros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.ParametroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of parametros
	 * @param end the upper bound of the range of parametros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of parametros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Parametro> findAll(int start, int end,
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

		List<Parametro> list = (List<Parametro>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PARAMETRO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PARAMETRO;

				if (pagination) {
					sql = sql.concat(ParametroModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Parametro>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Parametro>(list);
				}
				else {
					list = (List<Parametro>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the parametros from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Parametro parametro : findAll()) {
			remove(parametro);
		}
	}

	/**
	 * Returns the number of parametros.
	 *
	 * @return the number of parametros
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

				Query q = session.createQuery(_SQL_COUNT_PARAMETRO);

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
	 * Initializes the parametro persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.Parametro")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Parametro>> listenersList = new ArrayList<ModelListener<Parametro>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Parametro>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ParametroImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PARAMETRO = "SELECT parametro FROM Parametro parametro";
	private static final String _SQL_SELECT_PARAMETRO_WHERE = "SELECT parametro FROM Parametro parametro WHERE ";
	private static final String _SQL_COUNT_PARAMETRO = "SELECT COUNT(parametro) FROM Parametro parametro";
	private static final String _SQL_COUNT_PARAMETRO_WHERE = "SELECT COUNT(parametro) FROM Parametro parametro WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "parametro.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Parametro exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Parametro exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ParametroPersistenceImpl.class);
	private static Parametro _nullParametro = new ParametroImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Parametro> toCacheModel() {
				return _nullParametroCacheModel;
			}
		};

	private static CacheModel<Parametro> _nullParametroCacheModel = new CacheModel<Parametro>() {
			@Override
			public Parametro toEntityModel() {
				return _nullParametro;
			}
		};
}
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

import com.hitss.layer.NoSuchUsuarioException;
import com.hitss.layer.model.Usuario;
import com.hitss.layer.model.impl.UsuarioImpl;
import com.hitss.layer.model.impl.UsuarioModelImpl;

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
import com.liferay.portal.kernel.util.ArrayUtil;
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
 * The persistence implementation for the usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danielle Delgado
 * @see UsuarioPersistence
 * @see UsuarioUtil
 * @generated
 */
public class UsuarioPersistenceImpl extends BasePersistenceImpl<Usuario>
	implements UsuarioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UsuarioUtil} to access the usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UsuarioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioModelImpl.FINDER_CACHE_ENABLED, UsuarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioModelImpl.FINDER_CACHE_ENABLED, UsuarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USUARIOSSELECCIONADOS =
		new FinderPath(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioModelImpl.FINDER_CACHE_ENABLED, UsuarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUsuariosSeleccionados",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USUARIOSSELECCIONADOS =
		new FinderPath(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioModelImpl.FINDER_CACHE_ENABLED, UsuarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUsuariosSeleccionados",
			new String[] { Long.class.getName() },
			UsuarioModelImpl.USERID_COLUMN_BITMASK |
			UsuarioModelImpl.FECHACREAMODIFICA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USUARIOSSELECCIONADOS = new FinderPath(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByUsuariosSeleccionados",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_USUARIOSSELECCIONADOS =
		new FinderPath(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"countByUsuariosSeleccionados",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the usuarios where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Usuario> findByUsuariosSeleccionados(long userId)
		throws SystemException {
		return findByUsuariosSeleccionados(userId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the usuarios where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @return the range of matching usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Usuario> findByUsuariosSeleccionados(long userId, int start,
		int end) throws SystemException {
		return findByUsuariosSeleccionados(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the usuarios where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Usuario> findByUsuariosSeleccionados(long userId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USUARIOSSELECCIONADOS;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USUARIOSSELECCIONADOS;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<Usuario> list = (List<Usuario>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Usuario usuario : list) {
				if ((userId != usuario.getUserId())) {
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

			query.append(_SQL_SELECT_USUARIO_WHERE);

			query.append(_FINDER_COLUMN_USUARIOSSELECCIONADOS_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UsuarioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<Usuario>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Usuario>(list);
				}
				else {
					list = (List<Usuario>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first usuario in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching usuario
	 * @throws com.hitss.layer.NoSuchUsuarioException if a matching usuario could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Usuario findByUsuariosSeleccionados_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUsuarioException, SystemException {
		Usuario usuario = fetchByUsuariosSeleccionados_First(userId,
				orderByComparator);

		if (usuario != null) {
			return usuario;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUsuarioException(msg.toString());
	}

	/**
	 * Returns the first usuario in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching usuario, or <code>null</code> if a matching usuario could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Usuario fetchByUsuariosSeleccionados_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Usuario> list = findByUsuariosSeleccionados(userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last usuario in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching usuario
	 * @throws com.hitss.layer.NoSuchUsuarioException if a matching usuario could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Usuario findByUsuariosSeleccionados_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUsuarioException, SystemException {
		Usuario usuario = fetchByUsuariosSeleccionados_Last(userId,
				orderByComparator);

		if (usuario != null) {
			return usuario;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUsuarioException(msg.toString());
	}

	/**
	 * Returns the last usuario in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching usuario, or <code>null</code> if a matching usuario could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Usuario fetchByUsuariosSeleccionados_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUsuariosSeleccionados(userId);

		if (count == 0) {
			return null;
		}

		List<Usuario> list = findByUsuariosSeleccionados(userId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns all the usuarios where userId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userIds the user IDs
	 * @return the matching usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Usuario> findByUsuariosSeleccionados(long[] userIds)
		throws SystemException {
		return findByUsuariosSeleccionados(userIds, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the usuarios where userId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userIds the user IDs
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @return the range of matching usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Usuario> findByUsuariosSeleccionados(long[] userIds, int start,
		int end) throws SystemException {
		return findByUsuariosSeleccionados(userIds, start, end, null);
	}

	/**
	 * Returns an ordered range of all the usuarios where userId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userIds the user IDs
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Usuario> findByUsuariosSeleccionados(long[] userIds, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		if ((userIds != null) && (userIds.length == 1)) {
			return findByUsuariosSeleccionados(userIds[0], start, end,
				orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] { StringUtil.merge(userIds) };
		}
		else {
			finderArgs = new Object[] {
					StringUtil.merge(userIds),
					
					start, end, orderByComparator
				};
		}

		List<Usuario> list = (List<Usuario>)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_USUARIOSSELECCIONADOS,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Usuario usuario : list) {
				if (!ArrayUtil.contains(userIds, usuario.getUserId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_USUARIO_WHERE);

			boolean conjunctionable = false;

			if ((userIds == null) || (userIds.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < userIds.length; i++) {
					query.append(_FINDER_COLUMN_USUARIOSSELECCIONADOS_USERID_5);

					if ((i + 1) < userIds.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append("usuario.activo=true");

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UsuarioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (userIds != null) {
					qPos.add(userIds);
				}

				if (!pagination) {
					list = (List<Usuario>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Usuario>(list);
				}
				else {
					list = (List<Usuario>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_USUARIOSSELECCIONADOS,
					finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_USUARIOSSELECCIONADOS,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the usuarios where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUsuariosSeleccionados(long userId)
		throws SystemException {
		for (Usuario usuario : findByUsuariosSeleccionados(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(usuario);
		}
	}

	/**
	 * Returns the number of usuarios where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUsuariosSeleccionados(long userId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USUARIOSSELECCIONADOS;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USUARIO_WHERE);

			query.append(_FINDER_COLUMN_USUARIOSSELECCIONADOS_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

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

	/**
	 * Returns the number of usuarios where userId = any &#63;.
	 *
	 * @param userIds the user IDs
	 * @return the number of matching usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUsuariosSeleccionados(long[] userIds)
		throws SystemException {
		Object[] finderArgs = new Object[] { StringUtil.merge(userIds) };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_USUARIOSSELECCIONADOS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_USUARIO_WHERE);

			boolean conjunctionable = false;

			if ((userIds == null) || (userIds.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < userIds.length; i++) {
					query.append(_FINDER_COLUMN_USUARIOSSELECCIONADOS_USERID_5);

					if ((i + 1) < userIds.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append("usuario.activo=true");

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (userIds != null) {
					qPos.add(userIds);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_USUARIOSSELECCIONADOS,
					finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_USUARIOSSELECCIONADOS,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USUARIOSSELECCIONADOS_USERID_2 = "usuario.userId = ? AND usuario.activo=true";
	private static final String _FINDER_COLUMN_USUARIOSSELECCIONADOS_USERID_5 = "(" +
		removeConjunction(_FINDER_COLUMN_USUARIOSSELECCIONADOS_USERID_2) + ")";

	public UsuarioPersistenceImpl() {
		setModelClass(Usuario.class);
	}

	/**
	 * Caches the usuario in the entity cache if it is enabled.
	 *
	 * @param usuario the usuario
	 */
	@Override
	public void cacheResult(Usuario usuario) {
		EntityCacheUtil.putResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioImpl.class, usuario.getPrimaryKey(), usuario);

		usuario.resetOriginalValues();
	}

	/**
	 * Caches the usuarios in the entity cache if it is enabled.
	 *
	 * @param usuarios the usuarios
	 */
	@Override
	public void cacheResult(List<Usuario> usuarios) {
		for (Usuario usuario : usuarios) {
			if (EntityCacheUtil.getResult(
						UsuarioModelImpl.ENTITY_CACHE_ENABLED,
						UsuarioImpl.class, usuario.getPrimaryKey()) == null) {
				cacheResult(usuario);
			}
			else {
				usuario.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all usuarios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UsuarioImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UsuarioImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the usuario.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Usuario usuario) {
		EntityCacheUtil.removeResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioImpl.class, usuario.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Usuario> usuarios) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Usuario usuario : usuarios) {
			EntityCacheUtil.removeResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
				UsuarioImpl.class, usuario.getPrimaryKey());
		}
	}

	/**
	 * Creates a new usuario with the primary key. Does not add the usuario to the database.
	 *
	 * @param userId the primary key for the new usuario
	 * @return the new usuario
	 */
	@Override
	public Usuario create(long userId) {
		Usuario usuario = new UsuarioImpl();

		usuario.setNew(true);
		usuario.setPrimaryKey(userId);

		return usuario;
	}

	/**
	 * Removes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the usuario
	 * @return the usuario that was removed
	 * @throws com.hitss.layer.NoSuchUsuarioException if a usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Usuario remove(long userId)
		throws NoSuchUsuarioException, SystemException {
		return remove((Serializable)userId);
	}

	/**
	 * Removes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the usuario
	 * @return the usuario that was removed
	 * @throws com.hitss.layer.NoSuchUsuarioException if a usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Usuario remove(Serializable primaryKey)
		throws NoSuchUsuarioException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Usuario usuario = (Usuario)session.get(UsuarioImpl.class, primaryKey);

			if (usuario == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(usuario);
		}
		catch (NoSuchUsuarioException nsee) {
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
	protected Usuario removeImpl(Usuario usuario) throws SystemException {
		usuario = toUnwrappedModel(usuario);

		usuarioToActividadPlanTableMapper.deleteLeftPrimaryKeyTableMappings(usuario.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(usuario)) {
				usuario = (Usuario)session.get(UsuarioImpl.class,
						usuario.getPrimaryKeyObj());
			}

			if (usuario != null) {
				session.delete(usuario);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (usuario != null) {
			clearCache(usuario);
		}

		return usuario;
	}

	@Override
	public Usuario updateImpl(com.hitss.layer.model.Usuario usuario)
		throws SystemException {
		usuario = toUnwrappedModel(usuario);

		boolean isNew = usuario.isNew();

		UsuarioModelImpl usuarioModelImpl = (UsuarioModelImpl)usuario;

		Session session = null;

		try {
			session = openSession();

			if (usuario.isNew()) {
				session.save(usuario);

				usuario.setNew(false);
			}
			else {
				session.merge(usuario);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !UsuarioModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((usuarioModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USUARIOSSELECCIONADOS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						usuarioModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USUARIOSSELECCIONADOS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USUARIOSSELECCIONADOS,
					args);

				args = new Object[] { usuarioModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USUARIOSSELECCIONADOS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USUARIOSSELECCIONADOS,
					args);
			}
		}

		EntityCacheUtil.putResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
			UsuarioImpl.class, usuario.getPrimaryKey(), usuario);

		return usuario;
	}

	protected Usuario toUnwrappedModel(Usuario usuario) {
		if (usuario instanceof UsuarioImpl) {
			return usuario;
		}

		UsuarioImpl usuarioImpl = new UsuarioImpl();

		usuarioImpl.setNew(usuario.isNew());
		usuarioImpl.setPrimaryKey(usuario.getPrimaryKey());

		usuarioImpl.setUserId(usuario.getUserId());
		usuarioImpl.setActivo(usuario.isActivo());
		usuarioImpl.setUsuariocrea(usuario.getUsuariocrea());
		usuarioImpl.setFechacrea(usuario.getFechacrea());
		usuarioImpl.setUsuariomodifica(usuario.getUsuariomodifica());
		usuarioImpl.setFechacreamodifica(usuario.getFechacreamodifica());

		return usuarioImpl;
	}

	/**
	 * Returns the usuario with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the usuario
	 * @return the usuario
	 * @throws com.hitss.layer.NoSuchUsuarioException if a usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Usuario findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUsuarioException, SystemException {
		Usuario usuario = fetchByPrimaryKey(primaryKey);

		if (usuario == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return usuario;
	}

	/**
	 * Returns the usuario with the primary key or throws a {@link com.hitss.layer.NoSuchUsuarioException} if it could not be found.
	 *
	 * @param userId the primary key of the usuario
	 * @return the usuario
	 * @throws com.hitss.layer.NoSuchUsuarioException if a usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Usuario findByPrimaryKey(long userId)
		throws NoSuchUsuarioException, SystemException {
		return findByPrimaryKey((Serializable)userId);
	}

	/**
	 * Returns the usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the usuario
	 * @return the usuario, or <code>null</code> if a usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Usuario fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Usuario usuario = (Usuario)EntityCacheUtil.getResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
				UsuarioImpl.class, primaryKey);

		if (usuario == _nullUsuario) {
			return null;
		}

		if (usuario == null) {
			Session session = null;

			try {
				session = openSession();

				usuario = (Usuario)session.get(UsuarioImpl.class, primaryKey);

				if (usuario != null) {
					cacheResult(usuario);
				}
				else {
					EntityCacheUtil.putResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
						UsuarioImpl.class, primaryKey, _nullUsuario);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
					UsuarioImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return usuario;
	}

	/**
	 * Returns the usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userId the primary key of the usuario
	 * @return the usuario, or <code>null</code> if a usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Usuario fetchByPrimaryKey(long userId) throws SystemException {
		return fetchByPrimaryKey((Serializable)userId);
	}

	/**
	 * Returns all the usuarios.
	 *
	 * @return the usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Usuario> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @return the range of usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Usuario> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of usuarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Usuario> findAll(int start, int end,
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

		List<Usuario> list = (List<Usuario>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USUARIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USUARIO;

				if (pagination) {
					sql = sql.concat(UsuarioModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Usuario>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Usuario>(list);
				}
				else {
					list = (List<Usuario>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the usuarios from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Usuario usuario : findAll()) {
			remove(usuario);
		}
	}

	/**
	 * Returns the number of usuarios.
	 *
	 * @return the number of usuarios
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

				Query q = session.createQuery(_SQL_COUNT_USUARIO);

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
	 * Returns all the actividad plans associated with the usuario.
	 *
	 * @param pk the primary key of the usuario
	 * @return the actividad plans associated with the usuario
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.hitss.layer.model.ActividadPlan> getActividadPlans(long pk)
		throws SystemException {
		return getActividadPlans(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the actividad plans associated with the usuario.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the usuario
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @return the range of actividad plans associated with the usuario
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.hitss.layer.model.ActividadPlan> getActividadPlans(
		long pk, int start, int end) throws SystemException {
		return getActividadPlans(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the actividad plans associated with the usuario.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hitss.layer.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the usuario
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of actividad plans associated with the usuario
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.hitss.layer.model.ActividadPlan> getActividadPlans(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return usuarioToActividadPlanTableMapper.getRightBaseModels(pk, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of actividad plans associated with the usuario.
	 *
	 * @param pk the primary key of the usuario
	 * @return the number of actividad plans associated with the usuario
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getActividadPlansSize(long pk) throws SystemException {
		long[] pks = usuarioToActividadPlanTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the actividad plan is associated with the usuario.
	 *
	 * @param pk the primary key of the usuario
	 * @param actividadPlanPK the primary key of the actividad plan
	 * @return <code>true</code> if the actividad plan is associated with the usuario; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsActividadPlan(long pk, long actividadPlanPK)
		throws SystemException {
		return usuarioToActividadPlanTableMapper.containsTableMapping(pk,
			actividadPlanPK);
	}

	/**
	 * Returns <code>true</code> if the usuario has any actividad plans associated with it.
	 *
	 * @param pk the primary key of the usuario to check for associations with actividad plans
	 * @return <code>true</code> if the usuario has any actividad plans associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsActividadPlans(long pk) throws SystemException {
		if (getActividadPlansSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the usuario and the actividad plan. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the usuario
	 * @param actividadPlanPK the primary key of the actividad plan
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addActividadPlan(long pk, long actividadPlanPK)
		throws SystemException {
		usuarioToActividadPlanTableMapper.addTableMapping(pk, actividadPlanPK);
	}

	/**
	 * Adds an association between the usuario and the actividad plan. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the usuario
	 * @param actividadPlan the actividad plan
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addActividadPlan(long pk,
		com.hitss.layer.model.ActividadPlan actividadPlan)
		throws SystemException {
		usuarioToActividadPlanTableMapper.addTableMapping(pk,
			actividadPlan.getPrimaryKey());
	}

	/**
	 * Adds an association between the usuario and the actividad plans. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the usuario
	 * @param actividadPlanPKs the primary keys of the actividad plans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addActividadPlans(long pk, long[] actividadPlanPKs)
		throws SystemException {
		for (long actividadPlanPK : actividadPlanPKs) {
			usuarioToActividadPlanTableMapper.addTableMapping(pk,
				actividadPlanPK);
		}
	}

	/**
	 * Adds an association between the usuario and the actividad plans. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the usuario
	 * @param actividadPlans the actividad plans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addActividadPlans(long pk,
		List<com.hitss.layer.model.ActividadPlan> actividadPlans)
		throws SystemException {
		for (com.hitss.layer.model.ActividadPlan actividadPlan : actividadPlans) {
			usuarioToActividadPlanTableMapper.addTableMapping(pk,
				actividadPlan.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the usuario and its actividad plans. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the usuario to clear the associated actividad plans from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearActividadPlans(long pk) throws SystemException {
		usuarioToActividadPlanTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the usuario and the actividad plan. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the usuario
	 * @param actividadPlanPK the primary key of the actividad plan
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeActividadPlan(long pk, long actividadPlanPK)
		throws SystemException {
		usuarioToActividadPlanTableMapper.deleteTableMapping(pk, actividadPlanPK);
	}

	/**
	 * Removes the association between the usuario and the actividad plan. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the usuario
	 * @param actividadPlan the actividad plan
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeActividadPlan(long pk,
		com.hitss.layer.model.ActividadPlan actividadPlan)
		throws SystemException {
		usuarioToActividadPlanTableMapper.deleteTableMapping(pk,
			actividadPlan.getPrimaryKey());
	}

	/**
	 * Removes the association between the usuario and the actividad plans. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the usuario
	 * @param actividadPlanPKs the primary keys of the actividad plans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeActividadPlans(long pk, long[] actividadPlanPKs)
		throws SystemException {
		for (long actividadPlanPK : actividadPlanPKs) {
			usuarioToActividadPlanTableMapper.deleteTableMapping(pk,
				actividadPlanPK);
		}
	}

	/**
	 * Removes the association between the usuario and the actividad plans. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the usuario
	 * @param actividadPlans the actividad plans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeActividadPlans(long pk,
		List<com.hitss.layer.model.ActividadPlan> actividadPlans)
		throws SystemException {
		for (com.hitss.layer.model.ActividadPlan actividadPlan : actividadPlans) {
			usuarioToActividadPlanTableMapper.deleteTableMapping(pk,
				actividadPlan.getPrimaryKey());
		}
	}

	/**
	 * Sets the actividad plans associated with the usuario, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the usuario
	 * @param actividadPlanPKs the primary keys of the actividad plans to be associated with the usuario
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setActividadPlans(long pk, long[] actividadPlanPKs)
		throws SystemException {
		Set<Long> newActividadPlanPKsSet = SetUtil.fromArray(actividadPlanPKs);
		Set<Long> oldActividadPlanPKsSet = SetUtil.fromArray(usuarioToActividadPlanTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeActividadPlanPKsSet = new HashSet<Long>(oldActividadPlanPKsSet);

		removeActividadPlanPKsSet.removeAll(newActividadPlanPKsSet);

		for (long removeActividadPlanPK : removeActividadPlanPKsSet) {
			usuarioToActividadPlanTableMapper.deleteTableMapping(pk,
				removeActividadPlanPK);
		}

		newActividadPlanPKsSet.removeAll(oldActividadPlanPKsSet);

		for (long newActividadPlanPK : newActividadPlanPKsSet) {
			usuarioToActividadPlanTableMapper.addTableMapping(pk,
				newActividadPlanPK);
		}
	}

	/**
	 * Sets the actividad plans associated with the usuario, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the usuario
	 * @param actividadPlans the actividad plans to be associated with the usuario
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setActividadPlans(long pk,
		List<com.hitss.layer.model.ActividadPlan> actividadPlans)
		throws SystemException {
		try {
			long[] actividadPlanPKs = new long[actividadPlans.size()];

			for (int i = 0; i < actividadPlans.size(); i++) {
				com.hitss.layer.model.ActividadPlan actividadPlan = actividadPlans.get(i);

				actividadPlanPKs[i] = actividadPlan.getPrimaryKey();
			}

			setActividadPlans(pk, actividadPlanPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(UsuarioModelImpl.MAPPING_TABLE_REC_ACTIVIDADPLANUSUARIO_NAME);
		}
	}

	/**
	 * Initializes the usuario persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hitss.layer.model.Usuario")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Usuario>> listenersList = new ArrayList<ModelListener<Usuario>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Usuario>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		usuarioToActividadPlanTableMapper = TableMapperFactory.getTableMapper("rec_ActividadPlanUsuario",
				"userId", "actividadPlanId", this, actividadPlanPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(UsuarioImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("rec_ActividadPlanUsuario");
	}

	@BeanReference(type = ActividadPlanPersistence.class)
	protected ActividadPlanPersistence actividadPlanPersistence;
	protected TableMapper<Usuario, com.hitss.layer.model.ActividadPlan> usuarioToActividadPlanTableMapper;
	private static final String _SQL_SELECT_USUARIO = "SELECT usuario FROM Usuario usuario";
	private static final String _SQL_SELECT_USUARIO_WHERE = "SELECT usuario FROM Usuario usuario WHERE ";
	private static final String _SQL_COUNT_USUARIO = "SELECT COUNT(usuario) FROM Usuario usuario";
	private static final String _SQL_COUNT_USUARIO_WHERE = "SELECT COUNT(usuario) FROM Usuario usuario WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "usuario.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Usuario exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Usuario exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UsuarioPersistenceImpl.class);
	private static Usuario _nullUsuario = new UsuarioImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Usuario> toCacheModel() {
				return _nullUsuarioCacheModel;
			}
		};

	private static CacheModel<Usuario> _nullUsuarioCacheModel = new CacheModel<Usuario>() {
			@Override
			public Usuario toEntityModel() {
				return _nullUsuario;
			}
		};
}
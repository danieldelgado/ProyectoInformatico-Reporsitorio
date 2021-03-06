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

package com.rec.hitss.layer.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rec.hitss.layer.model.Estudio;
import com.rec.hitss.layer.model.EstudioModel;
import com.rec.hitss.layer.model.EstudioSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Estudio service. Represents a row in the &quot;Estudio&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rec.hitss.layer.model.EstudioModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EstudioImpl}.
 * </p>
 *
 * @author Crossfire
 * @see EstudioImpl
 * @see com.rec.hitss.layer.model.Estudio
 * @see com.rec.hitss.layer.model.EstudioModel
 * @generated
 */
@JSON(strict = true)
public class EstudioModelImpl extends BaseModelImpl<Estudio>
	implements EstudioModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a estudio model instance should use the {@link com.rec.hitss.layer.model.Estudio} interface instead.
	 */
	public static final String TABLE_NAME = "Estudio";
	public static final Object[][] TABLE_COLUMNS = {
			{ "estudioId", Types.BIGINT },
			{ "usuarioId", Types.BIGINT },
			{ "nombre", Types.VARCHAR },
			{ "nivel", Types.BIGINT },
			{ "activo", Types.BOOLEAN },
			{ "usuariocrea", Types.BIGINT },
			{ "fechacrea", Types.TIMESTAMP },
			{ "usuariomodifica", Types.BIGINT },
			{ "fechacreamodifica", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Estudio (estudioId LONG not null primary key,usuarioId LONG,nombre VARCHAR(75) null,nivel LONG,activo BOOLEAN,usuariocrea LONG,fechacrea DATE null,usuariomodifica LONG,fechacreamodifica DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Estudio";
	public static final String ORDER_BY_JPQL = " ORDER BY estudio.fechacreamodifica ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Estudio.fechacreamodifica ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rec.hitss.layer.model.Estudio"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rec.hitss.layer.model.Estudio"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Estudio toModel(EstudioSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Estudio model = new EstudioImpl();

		model.setEstudioId(soapModel.getEstudioId());
		model.setUsuarioId(soapModel.getUsuarioId());
		model.setNombre(soapModel.getNombre());
		model.setNivel(soapModel.getNivel());
		model.setActivo(soapModel.getActivo());
		model.setUsuariocrea(soapModel.getUsuariocrea());
		model.setFechacrea(soapModel.getFechacrea());
		model.setUsuariomodifica(soapModel.getUsuariomodifica());
		model.setFechacreamodifica(soapModel.getFechacreamodifica());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Estudio> toModels(EstudioSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Estudio> models = new ArrayList<Estudio>(soapModels.length);

		for (EstudioSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rec.hitss.layer.model.Estudio"));

	public EstudioModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _estudioId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEstudioId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _estudioId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Estudio.class;
	}

	@Override
	public String getModelClassName() {
		return Estudio.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("estudioId", getEstudioId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("nombre", getNombre());
		attributes.put("nivel", getNivel());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long estudioId = (Long)attributes.get("estudioId");

		if (estudioId != null) {
			setEstudioId(estudioId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		Long nivel = (Long)attributes.get("nivel");

		if (nivel != null) {
			setNivel(nivel);
		}

		Boolean activo = (Boolean)attributes.get("activo");

		if (activo != null) {
			setActivo(activo);
		}

		Long usuariocrea = (Long)attributes.get("usuariocrea");

		if (usuariocrea != null) {
			setUsuariocrea(usuariocrea);
		}

		Date fechacrea = (Date)attributes.get("fechacrea");

		if (fechacrea != null) {
			setFechacrea(fechacrea);
		}

		Long usuariomodifica = (Long)attributes.get("usuariomodifica");

		if (usuariomodifica != null) {
			setUsuariomodifica(usuariomodifica);
		}

		Date fechacreamodifica = (Date)attributes.get("fechacreamodifica");

		if (fechacreamodifica != null) {
			setFechacreamodifica(fechacreamodifica);
		}
	}

	@JSON
	@Override
	public long getEstudioId() {
		return _estudioId;
	}

	@Override
	public void setEstudioId(long estudioId) {
		_estudioId = estudioId;
	}

	@JSON
	@Override
	public long getUsuarioId() {
		return _usuarioId;
	}

	@Override
	public void setUsuarioId(long usuarioId) {
		_usuarioId = usuarioId;
	}

	@JSON
	@Override
	public String getNombre() {
		if (_nombre == null) {
			return StringPool.BLANK;
		}
		else {
			return _nombre;
		}
	}

	@Override
	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	@JSON
	@Override
	public long getNivel() {
		return _nivel;
	}

	@Override
	public void setNivel(long nivel) {
		_nivel = nivel;
	}

	@JSON
	@Override
	public boolean getActivo() {
		return _activo;
	}

	@Override
	public boolean isActivo() {
		return _activo;
	}

	@Override
	public void setActivo(boolean activo) {
		_activo = activo;
	}

	@JSON
	@Override
	public long getUsuariocrea() {
		return _usuariocrea;
	}

	@Override
	public void setUsuariocrea(long usuariocrea) {
		_usuariocrea = usuariocrea;
	}

	@JSON
	@Override
	public Date getFechacrea() {
		return _fechacrea;
	}

	@Override
	public void setFechacrea(Date fechacrea) {
		_fechacrea = fechacrea;
	}

	@JSON
	@Override
	public long getUsuariomodifica() {
		return _usuariomodifica;
	}

	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_usuariomodifica = usuariomodifica;
	}

	@JSON
	@Override
	public Date getFechacreamodifica() {
		return _fechacreamodifica;
	}

	@Override
	public void setFechacreamodifica(Date fechacreamodifica) {
		_fechacreamodifica = fechacreamodifica;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Estudio.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Estudio toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Estudio)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EstudioImpl estudioImpl = new EstudioImpl();

		estudioImpl.setEstudioId(getEstudioId());
		estudioImpl.setUsuarioId(getUsuarioId());
		estudioImpl.setNombre(getNombre());
		estudioImpl.setNivel(getNivel());
		estudioImpl.setActivo(getActivo());
		estudioImpl.setUsuariocrea(getUsuariocrea());
		estudioImpl.setFechacrea(getFechacrea());
		estudioImpl.setUsuariomodifica(getUsuariomodifica());
		estudioImpl.setFechacreamodifica(getFechacreamodifica());

		estudioImpl.resetOriginalValues();

		return estudioImpl;
	}

	@Override
	public int compareTo(Estudio estudio) {
		int value = 0;

		value = DateUtil.compareTo(getFechacreamodifica(),
				estudio.getFechacreamodifica());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Estudio)) {
			return false;
		}

		Estudio estudio = (Estudio)obj;

		long primaryKey = estudio.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Estudio> toCacheModel() {
		EstudioCacheModel estudioCacheModel = new EstudioCacheModel();

		estudioCacheModel.estudioId = getEstudioId();

		estudioCacheModel.usuarioId = getUsuarioId();

		estudioCacheModel.nombre = getNombre();

		String nombre = estudioCacheModel.nombre;

		if ((nombre != null) && (nombre.length() == 0)) {
			estudioCacheModel.nombre = null;
		}

		estudioCacheModel.nivel = getNivel();

		estudioCacheModel.activo = getActivo();

		estudioCacheModel.usuariocrea = getUsuariocrea();

		Date fechacrea = getFechacrea();

		if (fechacrea != null) {
			estudioCacheModel.fechacrea = fechacrea.getTime();
		}
		else {
			estudioCacheModel.fechacrea = Long.MIN_VALUE;
		}

		estudioCacheModel.usuariomodifica = getUsuariomodifica();

		Date fechacreamodifica = getFechacreamodifica();

		if (fechacreamodifica != null) {
			estudioCacheModel.fechacreamodifica = fechacreamodifica.getTime();
		}
		else {
			estudioCacheModel.fechacreamodifica = Long.MIN_VALUE;
		}

		return estudioCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{estudioId=");
		sb.append(getEstudioId());
		sb.append(", usuarioId=");
		sb.append(getUsuarioId());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", nivel=");
		sb.append(getNivel());
		sb.append(", activo=");
		sb.append(getActivo());
		sb.append(", usuariocrea=");
		sb.append(getUsuariocrea());
		sb.append(", fechacrea=");
		sb.append(getFechacrea());
		sb.append(", usuariomodifica=");
		sb.append(getUsuariomodifica());
		sb.append(", fechacreamodifica=");
		sb.append(getFechacreamodifica());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.Estudio");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>estudioId</column-name><column-value><![CDATA[");
		sb.append(getEstudioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nivel</column-name><column-value><![CDATA[");
		sb.append(getNivel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>activo</column-name><column-value><![CDATA[");
		sb.append(getActivo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuariocrea</column-name><column-value><![CDATA[");
		sb.append(getUsuariocrea());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechacrea</column-name><column-value><![CDATA[");
		sb.append(getFechacrea());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuariomodifica</column-name><column-value><![CDATA[");
		sb.append(getUsuariomodifica());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechacreamodifica</column-name><column-value><![CDATA[");
		sb.append(getFechacreamodifica());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Estudio.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Estudio.class
		};
	private long _estudioId;
	private long _usuarioId;
	private String _nombre;
	private long _nivel;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private Estudio _escapedModel;
}
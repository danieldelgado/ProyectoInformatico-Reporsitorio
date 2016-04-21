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

import com.rec.hitss.layer.model.Entrevista;
import com.rec.hitss.layer.model.EntrevistaModel;
import com.rec.hitss.layer.model.EntrevistaSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Entrevista service. Represents a row in the &quot;Entrevista&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rec.hitss.layer.model.EntrevistaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntrevistaImpl}.
 * </p>
 *
 * @author Crossfire
 * @see EntrevistaImpl
 * @see com.rec.hitss.layer.model.Entrevista
 * @see com.rec.hitss.layer.model.EntrevistaModel
 * @generated
 */
@JSON(strict = true)
public class EntrevistaModelImpl extends BaseModelImpl<Entrevista>
	implements EntrevistaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a entrevista model instance should use the {@link com.rec.hitss.layer.model.Entrevista} interface instead.
	 */
	public static final String TABLE_NAME = "Entrevista";
	public static final Object[][] TABLE_COLUMNS = {
			{ "entrevistaId", Types.BIGINT },
			{ "usuarioHitssId", Types.BIGINT },
			{ "observacion", Types.VARCHAR },
			{ "asistio", Types.BOOLEAN },
			{ "activo", Types.BOOLEAN },
			{ "usuariocrea", Types.BIGINT },
			{ "fechacrea", Types.TIMESTAMP },
			{ "usuariomodifica", Types.BIGINT },
			{ "fechacreamodifica", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Entrevista (entrevistaId LONG not null primary key,usuarioHitssId LONG,observacion VARCHAR(75) null,asistio BOOLEAN,activo BOOLEAN,usuariocrea LONG,fechacrea DATE null,usuariomodifica LONG,fechacreamodifica DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Entrevista";
	public static final String ORDER_BY_JPQL = " ORDER BY entrevista.fechacrea ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Entrevista.fechacrea ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rec.hitss.layer.model.Entrevista"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rec.hitss.layer.model.Entrevista"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Entrevista toModel(EntrevistaSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Entrevista model = new EntrevistaImpl();

		model.setEntrevistaId(soapModel.getEntrevistaId());
		model.setUsuarioHitssId(soapModel.getUsuarioHitssId());
		model.setObservacion(soapModel.getObservacion());
		model.setAsistio(soapModel.getAsistio());
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
	public static List<Entrevista> toModels(EntrevistaSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Entrevista> models = new ArrayList<Entrevista>(soapModels.length);

		for (EntrevistaSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rec.hitss.layer.model.Entrevista"));

	public EntrevistaModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _entrevistaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEntrevistaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _entrevistaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Entrevista.class;
	}

	@Override
	public String getModelClassName() {
		return Entrevista.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("entrevistaId", getEntrevistaId());
		attributes.put("usuarioHitssId", getUsuarioHitssId());
		attributes.put("observacion", getObservacion());
		attributes.put("asistio", getAsistio());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long entrevistaId = (Long)attributes.get("entrevistaId");

		if (entrevistaId != null) {
			setEntrevistaId(entrevistaId);
		}

		Long usuarioHitssId = (Long)attributes.get("usuarioHitssId");

		if (usuarioHitssId != null) {
			setUsuarioHitssId(usuarioHitssId);
		}

		String observacion = (String)attributes.get("observacion");

		if (observacion != null) {
			setObservacion(observacion);
		}

		Boolean asistio = (Boolean)attributes.get("asistio");

		if (asistio != null) {
			setAsistio(asistio);
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
	public long getEntrevistaId() {
		return _entrevistaId;
	}

	@Override
	public void setEntrevistaId(long entrevistaId) {
		_entrevistaId = entrevistaId;
	}

	@JSON
	@Override
	public long getUsuarioHitssId() {
		return _usuarioHitssId;
	}

	@Override
	public void setUsuarioHitssId(long usuarioHitssId) {
		_usuarioHitssId = usuarioHitssId;
	}

	@JSON
	@Override
	public String getObservacion() {
		if (_observacion == null) {
			return StringPool.BLANK;
		}
		else {
			return _observacion;
		}
	}

	@Override
	public void setObservacion(String observacion) {
		_observacion = observacion;
	}

	@JSON
	@Override
	public boolean getAsistio() {
		return _asistio;
	}

	@Override
	public boolean isAsistio() {
		return _asistio;
	}

	@Override
	public void setAsistio(boolean asistio) {
		_asistio = asistio;
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
			Entrevista.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Entrevista toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Entrevista)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EntrevistaImpl entrevistaImpl = new EntrevistaImpl();

		entrevistaImpl.setEntrevistaId(getEntrevistaId());
		entrevistaImpl.setUsuarioHitssId(getUsuarioHitssId());
		entrevistaImpl.setObservacion(getObservacion());
		entrevistaImpl.setAsistio(getAsistio());
		entrevistaImpl.setActivo(getActivo());
		entrevistaImpl.setUsuariocrea(getUsuariocrea());
		entrevistaImpl.setFechacrea(getFechacrea());
		entrevistaImpl.setUsuariomodifica(getUsuariomodifica());
		entrevistaImpl.setFechacreamodifica(getFechacreamodifica());

		entrevistaImpl.resetOriginalValues();

		return entrevistaImpl;
	}

	@Override
	public int compareTo(Entrevista entrevista) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(), entrevista.getFechacrea());

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

		if (!(obj instanceof Entrevista)) {
			return false;
		}

		Entrevista entrevista = (Entrevista)obj;

		long primaryKey = entrevista.getPrimaryKey();

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
	public CacheModel<Entrevista> toCacheModel() {
		EntrevistaCacheModel entrevistaCacheModel = new EntrevistaCacheModel();

		entrevistaCacheModel.entrevistaId = getEntrevistaId();

		entrevistaCacheModel.usuarioHitssId = getUsuarioHitssId();

		entrevistaCacheModel.observacion = getObservacion();

		String observacion = entrevistaCacheModel.observacion;

		if ((observacion != null) && (observacion.length() == 0)) {
			entrevistaCacheModel.observacion = null;
		}

		entrevistaCacheModel.asistio = getAsistio();

		entrevistaCacheModel.activo = getActivo();

		entrevistaCacheModel.usuariocrea = getUsuariocrea();

		Date fechacrea = getFechacrea();

		if (fechacrea != null) {
			entrevistaCacheModel.fechacrea = fechacrea.getTime();
		}
		else {
			entrevistaCacheModel.fechacrea = Long.MIN_VALUE;
		}

		entrevistaCacheModel.usuariomodifica = getUsuariomodifica();

		Date fechacreamodifica = getFechacreamodifica();

		if (fechacreamodifica != null) {
			entrevistaCacheModel.fechacreamodifica = fechacreamodifica.getTime();
		}
		else {
			entrevistaCacheModel.fechacreamodifica = Long.MIN_VALUE;
		}

		return entrevistaCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{entrevistaId=");
		sb.append(getEntrevistaId());
		sb.append(", usuarioHitssId=");
		sb.append(getUsuarioHitssId());
		sb.append(", observacion=");
		sb.append(getObservacion());
		sb.append(", asistio=");
		sb.append(getAsistio());
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
		sb.append("com.rec.hitss.layer.model.Entrevista");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>entrevistaId</column-name><column-value><![CDATA[");
		sb.append(getEntrevistaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioHitssId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioHitssId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>observacion</column-name><column-value><![CDATA[");
		sb.append(getObservacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asistio</column-name><column-value><![CDATA[");
		sb.append(getAsistio());
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

	private static ClassLoader _classLoader = Entrevista.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Entrevista.class
		};
	private long _entrevistaId;
	private long _usuarioHitssId;
	private String _observacion;
	private boolean _asistio;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private Entrevista _escapedModel;
}
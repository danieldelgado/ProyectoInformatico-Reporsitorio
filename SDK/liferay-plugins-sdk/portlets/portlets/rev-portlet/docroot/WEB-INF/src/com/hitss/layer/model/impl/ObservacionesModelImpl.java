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

package com.hitss.layer.model.impl;

import com.hitss.layer.model.Observaciones;
import com.hitss.layer.model.ObservacionesModel;
import com.hitss.layer.model.ObservacionesSoap;

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

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Observaciones service. Represents a row in the &quot;Observaciones&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hitss.layer.model.ObservacionesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ObservacionesImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see ObservacionesImpl
 * @see com.hitss.layer.model.Observaciones
 * @see com.hitss.layer.model.ObservacionesModel
 * @generated
 */
@JSON(strict = true)
public class ObservacionesModelImpl extends BaseModelImpl<Observaciones>
	implements ObservacionesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a observaciones model instance should use the {@link com.hitss.layer.model.Observaciones} interface instead.
	 */
	public static final String TABLE_NAME = "Observaciones";
	public static final Object[][] TABLE_COLUMNS = {
			{ "observacionId", Types.BIGINT },
			{ "descripcion", Types.VARCHAR },
			{ "tabla", Types.VARCHAR },
			{ "registroId", Types.BIGINT },
			{ "activo", Types.BOOLEAN },
			{ "usuariocrea", Types.BIGINT },
			{ "fechacrea", Types.TIMESTAMP },
			{ "usuariomodifica", Types.BIGINT },
			{ "fechacreamodifica", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Observaciones (observacionId LONG not null primary key,descripcion VARCHAR(75) null,tabla VARCHAR(75) null,registroId LONG,activo BOOLEAN,usuariocrea LONG,fechacrea DATE null,usuariomodifica LONG,fechacreamodifica DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Observaciones";
	public static final String ORDER_BY_JPQL = " ORDER BY observaciones.fechacreamodifica ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Observaciones.fechacreamodifica ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hitss.layer.model.Observaciones"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hitss.layer.model.Observaciones"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Observaciones toModel(ObservacionesSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Observaciones model = new ObservacionesImpl();

		model.setObservacionId(soapModel.getObservacionId());
		model.setDescripcion(soapModel.getDescripcion());
		model.setTabla(soapModel.getTabla());
		model.setRegistroId(soapModel.getRegistroId());
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
	public static List<Observaciones> toModels(ObservacionesSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Observaciones> models = new ArrayList<Observaciones>(soapModels.length);

		for (ObservacionesSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hitss.layer.model.Observaciones"));

	public ObservacionesModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _observacionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setObservacionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _observacionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Observaciones.class;
	}

	@Override
	public String getModelClassName() {
		return Observaciones.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("observacionId", getObservacionId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("tabla", getTabla());
		attributes.put("registroId", getRegistroId());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long observacionId = (Long)attributes.get("observacionId");

		if (observacionId != null) {
			setObservacionId(observacionId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String tabla = (String)attributes.get("tabla");

		if (tabla != null) {
			setTabla(tabla);
		}

		Long registroId = (Long)attributes.get("registroId");

		if (registroId != null) {
			setRegistroId(registroId);
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
	public long getObservacionId() {
		return _observacionId;
	}

	@Override
	public void setObservacionId(long observacionId) {
		_observacionId = observacionId;
	}

	@JSON
	@Override
	public String getDescripcion() {
		if (_descripcion == null) {
			return StringPool.BLANK;
		}
		else {
			return _descripcion;
		}
	}

	@Override
	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	@JSON
	@Override
	public String getTabla() {
		if (_tabla == null) {
			return StringPool.BLANK;
		}
		else {
			return _tabla;
		}
	}

	@Override
	public void setTabla(String tabla) {
		_tabla = tabla;
	}

	@JSON
	@Override
	public long getRegistroId() {
		return _registroId;
	}

	@Override
	public void setRegistroId(long registroId) {
		_registroId = registroId;
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
			Observaciones.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Observaciones toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Observaciones)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ObservacionesImpl observacionesImpl = new ObservacionesImpl();

		observacionesImpl.setObservacionId(getObservacionId());
		observacionesImpl.setDescripcion(getDescripcion());
		observacionesImpl.setTabla(getTabla());
		observacionesImpl.setRegistroId(getRegistroId());
		observacionesImpl.setActivo(getActivo());
		observacionesImpl.setUsuariocrea(getUsuariocrea());
		observacionesImpl.setFechacrea(getFechacrea());
		observacionesImpl.setUsuariomodifica(getUsuariomodifica());
		observacionesImpl.setFechacreamodifica(getFechacreamodifica());

		observacionesImpl.resetOriginalValues();

		return observacionesImpl;
	}

	@Override
	public int compareTo(Observaciones observaciones) {
		int value = 0;

		value = DateUtil.compareTo(getFechacreamodifica(),
				observaciones.getFechacreamodifica());

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

		if (!(obj instanceof Observaciones)) {
			return false;
		}

		Observaciones observaciones = (Observaciones)obj;

		long primaryKey = observaciones.getPrimaryKey();

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
	public CacheModel<Observaciones> toCacheModel() {
		ObservacionesCacheModel observacionesCacheModel = new ObservacionesCacheModel();

		observacionesCacheModel.observacionId = getObservacionId();

		observacionesCacheModel.descripcion = getDescripcion();

		String descripcion = observacionesCacheModel.descripcion;

		if ((descripcion != null) && (descripcion.length() == 0)) {
			observacionesCacheModel.descripcion = null;
		}

		observacionesCacheModel.tabla = getTabla();

		String tabla = observacionesCacheModel.tabla;

		if ((tabla != null) && (tabla.length() == 0)) {
			observacionesCacheModel.tabla = null;
		}

		observacionesCacheModel.registroId = getRegistroId();

		observacionesCacheModel.activo = getActivo();

		observacionesCacheModel.usuariocrea = getUsuariocrea();

		Date fechacrea = getFechacrea();

		if (fechacrea != null) {
			observacionesCacheModel.fechacrea = fechacrea.getTime();
		}
		else {
			observacionesCacheModel.fechacrea = Long.MIN_VALUE;
		}

		observacionesCacheModel.usuariomodifica = getUsuariomodifica();

		Date fechacreamodifica = getFechacreamodifica();

		if (fechacreamodifica != null) {
			observacionesCacheModel.fechacreamodifica = fechacreamodifica.getTime();
		}
		else {
			observacionesCacheModel.fechacreamodifica = Long.MIN_VALUE;
		}

		return observacionesCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{observacionId=");
		sb.append(getObservacionId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", tabla=");
		sb.append(getTabla());
		sb.append(", registroId=");
		sb.append(getRegistroId());
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
		sb.append("com.hitss.layer.model.Observaciones");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>observacionId</column-name><column-value><![CDATA[");
		sb.append(getObservacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tabla</column-name><column-value><![CDATA[");
		sb.append(getTabla());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registroId</column-name><column-value><![CDATA[");
		sb.append(getRegistroId());
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

	private static ClassLoader _classLoader = Observaciones.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Observaciones.class
		};
	private long _observacionId;
	private String _descripcion;
	private String _tabla;
	private long _registroId;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private Observaciones _escapedModel;
}
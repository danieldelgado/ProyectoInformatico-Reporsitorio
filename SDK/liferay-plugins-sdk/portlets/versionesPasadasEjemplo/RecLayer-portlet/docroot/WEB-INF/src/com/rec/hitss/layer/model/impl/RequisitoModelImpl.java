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

import com.rec.hitss.layer.model.Requisito;
import com.rec.hitss.layer.model.RequisitoModel;
import com.rec.hitss.layer.model.RequisitoSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Requisito service. Represents a row in the &quot;Requisito&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rec.hitss.layer.model.RequisitoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RequisitoImpl}.
 * </p>
 *
 * @author Crossfire
 * @see RequisitoImpl
 * @see com.rec.hitss.layer.model.Requisito
 * @see com.rec.hitss.layer.model.RequisitoModel
 * @generated
 */
@JSON(strict = true)
public class RequisitoModelImpl extends BaseModelImpl<Requisito>
	implements RequisitoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a requisito model instance should use the {@link com.rec.hitss.layer.model.Requisito} interface instead.
	 */
	public static final String TABLE_NAME = "Requisito";
	public static final Object[][] TABLE_COLUMNS = {
			{ "requisitoId", Types.BIGINT },
			{ "descripcion", Types.VARCHAR },
			{ "nivel", Types.BIGINT },
			{ "exigible", Types.BOOLEAN },
			{ "herramienta", Types.BIGINT },
			{ "tipoRequisito", Types.BIGINT },
			{ "activo", Types.BOOLEAN },
			{ "usuariocrea", Types.BIGINT },
			{ "fechacrea", Types.TIMESTAMP },
			{ "usuariomodifica", Types.BIGINT },
			{ "fechacreamodifica", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Requisito (requisitoId LONG not null primary key,descripcion VARCHAR(75) null,nivel LONG,exigible BOOLEAN,herramienta LONG,tipoRequisito LONG,activo BOOLEAN,usuariocrea LONG,fechacrea DATE null,usuariomodifica LONG,fechacreamodifica DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Requisito";
	public static final String ORDER_BY_JPQL = " ORDER BY requisito.fechacreamodifica ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Requisito.fechacreamodifica ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rec.hitss.layer.model.Requisito"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rec.hitss.layer.model.Requisito"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rec.hitss.layer.model.Requisito"),
			true);
	public static long DESCRIPCION_COLUMN_BITMASK = 1L;
	public static long FECHACREAMODIFICA_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Requisito toModel(RequisitoSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Requisito model = new RequisitoImpl();

		model.setRequisitoId(soapModel.getRequisitoId());
		model.setDescripcion(soapModel.getDescripcion());
		model.setNivel(soapModel.getNivel());
		model.setExigible(soapModel.getExigible());
		model.setHerramienta(soapModel.getHerramienta());
		model.setTipoRequisito(soapModel.getTipoRequisito());
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
	public static List<Requisito> toModels(RequisitoSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Requisito> models = new ArrayList<Requisito>(soapModels.length);

		for (RequisitoSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rec.hitss.layer.model.Requisito"));

	public RequisitoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _requisitoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRequisitoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _requisitoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Requisito.class;
	}

	@Override
	public String getModelClassName() {
		return Requisito.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("requisitoId", getRequisitoId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("nivel", getNivel());
		attributes.put("exigible", getExigible());
		attributes.put("herramienta", getHerramienta());
		attributes.put("tipoRequisito", getTipoRequisito());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long requisitoId = (Long)attributes.get("requisitoId");

		if (requisitoId != null) {
			setRequisitoId(requisitoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Long nivel = (Long)attributes.get("nivel");

		if (nivel != null) {
			setNivel(nivel);
		}

		Boolean exigible = (Boolean)attributes.get("exigible");

		if (exigible != null) {
			setExigible(exigible);
		}

		Long herramienta = (Long)attributes.get("herramienta");

		if (herramienta != null) {
			setHerramienta(herramienta);
		}

		Long tipoRequisito = (Long)attributes.get("tipoRequisito");

		if (tipoRequisito != null) {
			setTipoRequisito(tipoRequisito);
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
	public long getRequisitoId() {
		return _requisitoId;
	}

	@Override
	public void setRequisitoId(long requisitoId) {
		_requisitoId = requisitoId;
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
		_columnBitmask |= DESCRIPCION_COLUMN_BITMASK;

		if (_originalDescripcion == null) {
			_originalDescripcion = _descripcion;
		}

		_descripcion = descripcion;
	}

	public String getOriginalDescripcion() {
		return GetterUtil.getString(_originalDescripcion);
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
	public boolean getExigible() {
		return _exigible;
	}

	@Override
	public boolean isExigible() {
		return _exigible;
	}

	@Override
	public void setExigible(boolean exigible) {
		_exigible = exigible;
	}

	@JSON
	@Override
	public long getHerramienta() {
		return _herramienta;
	}

	@Override
	public void setHerramienta(long herramienta) {
		_herramienta = herramienta;
	}

	@JSON
	@Override
	public long getTipoRequisito() {
		return _tipoRequisito;
	}

	@Override
	public void setTipoRequisito(long tipoRequisito) {
		_tipoRequisito = tipoRequisito;
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
		_columnBitmask = -1L;

		_fechacreamodifica = fechacreamodifica;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Requisito.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Requisito toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Requisito)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		RequisitoImpl requisitoImpl = new RequisitoImpl();

		requisitoImpl.setRequisitoId(getRequisitoId());
		requisitoImpl.setDescripcion(getDescripcion());
		requisitoImpl.setNivel(getNivel());
		requisitoImpl.setExigible(getExigible());
		requisitoImpl.setHerramienta(getHerramienta());
		requisitoImpl.setTipoRequisito(getTipoRequisito());
		requisitoImpl.setActivo(getActivo());
		requisitoImpl.setUsuariocrea(getUsuariocrea());
		requisitoImpl.setFechacrea(getFechacrea());
		requisitoImpl.setUsuariomodifica(getUsuariomodifica());
		requisitoImpl.setFechacreamodifica(getFechacreamodifica());

		requisitoImpl.resetOriginalValues();

		return requisitoImpl;
	}

	@Override
	public int compareTo(Requisito requisito) {
		int value = 0;

		value = DateUtil.compareTo(getFechacreamodifica(),
				requisito.getFechacreamodifica());

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

		if (!(obj instanceof Requisito)) {
			return false;
		}

		Requisito requisito = (Requisito)obj;

		long primaryKey = requisito.getPrimaryKey();

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
		RequisitoModelImpl requisitoModelImpl = this;

		requisitoModelImpl._originalDescripcion = requisitoModelImpl._descripcion;

		requisitoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Requisito> toCacheModel() {
		RequisitoCacheModel requisitoCacheModel = new RequisitoCacheModel();

		requisitoCacheModel.requisitoId = getRequisitoId();

		requisitoCacheModel.descripcion = getDescripcion();

		String descripcion = requisitoCacheModel.descripcion;

		if ((descripcion != null) && (descripcion.length() == 0)) {
			requisitoCacheModel.descripcion = null;
		}

		requisitoCacheModel.nivel = getNivel();

		requisitoCacheModel.exigible = getExigible();

		requisitoCacheModel.herramienta = getHerramienta();

		requisitoCacheModel.tipoRequisito = getTipoRequisito();

		requisitoCacheModel.activo = getActivo();

		requisitoCacheModel.usuariocrea = getUsuariocrea();

		Date fechacrea = getFechacrea();

		if (fechacrea != null) {
			requisitoCacheModel.fechacrea = fechacrea.getTime();
		}
		else {
			requisitoCacheModel.fechacrea = Long.MIN_VALUE;
		}

		requisitoCacheModel.usuariomodifica = getUsuariomodifica();

		Date fechacreamodifica = getFechacreamodifica();

		if (fechacreamodifica != null) {
			requisitoCacheModel.fechacreamodifica = fechacreamodifica.getTime();
		}
		else {
			requisitoCacheModel.fechacreamodifica = Long.MIN_VALUE;
		}

		return requisitoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{requisitoId=");
		sb.append(getRequisitoId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", nivel=");
		sb.append(getNivel());
		sb.append(", exigible=");
		sb.append(getExigible());
		sb.append(", herramienta=");
		sb.append(getHerramienta());
		sb.append(", tipoRequisito=");
		sb.append(getTipoRequisito());
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
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.Requisito");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>requisitoId</column-name><column-value><![CDATA[");
		sb.append(getRequisitoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nivel</column-name><column-value><![CDATA[");
		sb.append(getNivel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exigible</column-name><column-value><![CDATA[");
		sb.append(getExigible());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>herramienta</column-name><column-value><![CDATA[");
		sb.append(getHerramienta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipoRequisito</column-name><column-value><![CDATA[");
		sb.append(getTipoRequisito());
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

	private static ClassLoader _classLoader = Requisito.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Requisito.class
		};
	private long _requisitoId;
	private String _descripcion;
	private String _originalDescripcion;
	private long _nivel;
	private boolean _exigible;
	private long _herramienta;
	private long _tipoRequisito;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private long _columnBitmask;
	private Requisito _escapedModel;
}
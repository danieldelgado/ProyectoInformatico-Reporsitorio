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

import com.rec.hitss.layer.model.Contrato;
import com.rec.hitss.layer.model.ContratoModel;
import com.rec.hitss.layer.model.ContratoSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Contrato service. Represents a row in the &quot;Contrato&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rec.hitss.layer.model.ContratoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ContratoImpl}.
 * </p>
 *
 * @author Crossfire
 * @see ContratoImpl
 * @see com.rec.hitss.layer.model.Contrato
 * @see com.rec.hitss.layer.model.ContratoModel
 * @generated
 */
@JSON(strict = true)
public class ContratoModelImpl extends BaseModelImpl<Contrato>
	implements ContratoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a contrato model instance should use the {@link com.rec.hitss.layer.model.Contrato} interface instead.
	 */
	public static final String TABLE_NAME = "Contrato";
	public static final Object[][] TABLE_COLUMNS = {
			{ "contratoId", Types.BIGINT },
			{ "usuarioId", Types.BIGINT },
			{ "motivo", Types.VARCHAR },
			{ "descripcion", Types.VARCHAR },
			{ "titulo", Types.VARCHAR },
			{ "activo", Types.BOOLEAN },
			{ "usuariocrea", Types.BIGINT },
			{ "fechacrea", Types.TIMESTAMP },
			{ "usuariomodifica", Types.BIGINT },
			{ "fechacreamodifica", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Contrato (contratoId LONG not null primary key,usuarioId LONG,motivo VARCHAR(75) null,descripcion VARCHAR(75) null,titulo VARCHAR(75) null,activo BOOLEAN,usuariocrea LONG,fechacrea DATE null,usuariomodifica LONG,fechacreamodifica DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Contrato";
	public static final String ORDER_BY_JPQL = " ORDER BY contrato.fechacreamodifica ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Contrato.fechacreamodifica ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rec.hitss.layer.model.Contrato"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rec.hitss.layer.model.Contrato"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Contrato toModel(ContratoSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Contrato model = new ContratoImpl();

		model.setContratoId(soapModel.getContratoId());
		model.setUsuarioId(soapModel.getUsuarioId());
		model.setMotivo(soapModel.getMotivo());
		model.setDescripcion(soapModel.getDescripcion());
		model.setTitulo(soapModel.getTitulo());
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
	public static List<Contrato> toModels(ContratoSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Contrato> models = new ArrayList<Contrato>(soapModels.length);

		for (ContratoSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rec.hitss.layer.model.Contrato"));

	public ContratoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _contratoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setContratoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _contratoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Contrato.class;
	}

	@Override
	public String getModelClassName() {
		return Contrato.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("contratoId", getContratoId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("motivo", getMotivo());
		attributes.put("descripcion", getDescripcion());
		attributes.put("titulo", getTitulo());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long contratoId = (Long)attributes.get("contratoId");

		if (contratoId != null) {
			setContratoId(contratoId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		String motivo = (String)attributes.get("motivo");

		if (motivo != null) {
			setMotivo(motivo);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String titulo = (String)attributes.get("titulo");

		if (titulo != null) {
			setTitulo(titulo);
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
	public long getContratoId() {
		return _contratoId;
	}

	@Override
	public void setContratoId(long contratoId) {
		_contratoId = contratoId;
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
	public String getMotivo() {
		if (_motivo == null) {
			return StringPool.BLANK;
		}
		else {
			return _motivo;
		}
	}

	@Override
	public void setMotivo(String motivo) {
		_motivo = motivo;
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
	public String getTitulo() {
		if (_titulo == null) {
			return StringPool.BLANK;
		}
		else {
			return _titulo;
		}
	}

	@Override
	public void setTitulo(String titulo) {
		_titulo = titulo;
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
			Contrato.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Contrato toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Contrato)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ContratoImpl contratoImpl = new ContratoImpl();

		contratoImpl.setContratoId(getContratoId());
		contratoImpl.setUsuarioId(getUsuarioId());
		contratoImpl.setMotivo(getMotivo());
		contratoImpl.setDescripcion(getDescripcion());
		contratoImpl.setTitulo(getTitulo());
		contratoImpl.setActivo(getActivo());
		contratoImpl.setUsuariocrea(getUsuariocrea());
		contratoImpl.setFechacrea(getFechacrea());
		contratoImpl.setUsuariomodifica(getUsuariomodifica());
		contratoImpl.setFechacreamodifica(getFechacreamodifica());

		contratoImpl.resetOriginalValues();

		return contratoImpl;
	}

	@Override
	public int compareTo(Contrato contrato) {
		int value = 0;

		value = DateUtil.compareTo(getFechacreamodifica(),
				contrato.getFechacreamodifica());

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

		if (!(obj instanceof Contrato)) {
			return false;
		}

		Contrato contrato = (Contrato)obj;

		long primaryKey = contrato.getPrimaryKey();

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
	public CacheModel<Contrato> toCacheModel() {
		ContratoCacheModel contratoCacheModel = new ContratoCacheModel();

		contratoCacheModel.contratoId = getContratoId();

		contratoCacheModel.usuarioId = getUsuarioId();

		contratoCacheModel.motivo = getMotivo();

		String motivo = contratoCacheModel.motivo;

		if ((motivo != null) && (motivo.length() == 0)) {
			contratoCacheModel.motivo = null;
		}

		contratoCacheModel.descripcion = getDescripcion();

		String descripcion = contratoCacheModel.descripcion;

		if ((descripcion != null) && (descripcion.length() == 0)) {
			contratoCacheModel.descripcion = null;
		}

		contratoCacheModel.titulo = getTitulo();

		String titulo = contratoCacheModel.titulo;

		if ((titulo != null) && (titulo.length() == 0)) {
			contratoCacheModel.titulo = null;
		}

		contratoCacheModel.activo = getActivo();

		contratoCacheModel.usuariocrea = getUsuariocrea();

		Date fechacrea = getFechacrea();

		if (fechacrea != null) {
			contratoCacheModel.fechacrea = fechacrea.getTime();
		}
		else {
			contratoCacheModel.fechacrea = Long.MIN_VALUE;
		}

		contratoCacheModel.usuariomodifica = getUsuariomodifica();

		Date fechacreamodifica = getFechacreamodifica();

		if (fechacreamodifica != null) {
			contratoCacheModel.fechacreamodifica = fechacreamodifica.getTime();
		}
		else {
			contratoCacheModel.fechacreamodifica = Long.MIN_VALUE;
		}

		return contratoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{contratoId=");
		sb.append(getContratoId());
		sb.append(", usuarioId=");
		sb.append(getUsuarioId());
		sb.append(", motivo=");
		sb.append(getMotivo());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", titulo=");
		sb.append(getTitulo());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.Contrato");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>contratoId</column-name><column-value><![CDATA[");
		sb.append(getContratoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>motivo</column-name><column-value><![CDATA[");
		sb.append(getMotivo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>titulo</column-name><column-value><![CDATA[");
		sb.append(getTitulo());
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

	private static ClassLoader _classLoader = Contrato.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Contrato.class
		};
	private long _contratoId;
	private long _usuarioId;
	private String _motivo;
	private String _descripcion;
	private String _titulo;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private Contrato _escapedModel;
}
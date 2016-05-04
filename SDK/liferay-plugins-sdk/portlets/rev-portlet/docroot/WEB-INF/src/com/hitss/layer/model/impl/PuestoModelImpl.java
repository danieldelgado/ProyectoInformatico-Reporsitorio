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

import com.hitss.layer.model.Puesto;
import com.hitss.layer.model.PuestoModel;
import com.hitss.layer.model.PuestoSoap;

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
 * The base model implementation for the Puesto service. Represents a row in the &quot;Puesto&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hitss.layer.model.PuestoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PuestoImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see PuestoImpl
 * @see com.hitss.layer.model.Puesto
 * @see com.hitss.layer.model.PuestoModel
 * @generated
 */
@JSON(strict = true)
public class PuestoModelImpl extends BaseModelImpl<Puesto>
	implements PuestoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a puesto model instance should use the {@link com.hitss.layer.model.Puesto} interface instead.
	 */
	public static final String TABLE_NAME = "Puesto";
	public static final Object[][] TABLE_COLUMNS = {
			{ "puestoId", Types.BIGINT },
			{ "descripcion", Types.VARCHAR },
			{ "categoria", Types.BIGINT },
			{ "activo", Types.BOOLEAN },
			{ "usuariocrea", Types.BIGINT },
			{ "fechacrea", Types.TIMESTAMP },
			{ "usuariomodifica", Types.BIGINT },
			{ "fechacreamodifica", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Puesto (puestoId LONG not null primary key,descripcion VARCHAR(75) null,categoria LONG,activo BOOLEAN,usuariocrea LONG,fechacrea DATE null,usuariomodifica LONG,fechacreamodifica DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Puesto";
	public static final String ORDER_BY_JPQL = " ORDER BY puesto.fechacreamodifica ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Puesto.fechacreamodifica ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hitss.layer.model.Puesto"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hitss.layer.model.Puesto"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.hitss.layer.model.Puesto"),
			true);
	public static long DESCRIPCION_COLUMN_BITMASK = 1L;
	public static long FECHACREAMODIFICA_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Puesto toModel(PuestoSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Puesto model = new PuestoImpl();

		model.setPuestoId(soapModel.getPuestoId());
		model.setDescripcion(soapModel.getDescripcion());
		model.setCategoria(soapModel.getCategoria());
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
	public static List<Puesto> toModels(PuestoSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Puesto> models = new ArrayList<Puesto>(soapModels.length);

		for (PuestoSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hitss.layer.model.Puesto"));

	public PuestoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _puestoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPuestoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _puestoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Puesto.class;
	}

	@Override
	public String getModelClassName() {
		return Puesto.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("puestoId", getPuestoId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("categoria", getCategoria());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long puestoId = (Long)attributes.get("puestoId");

		if (puestoId != null) {
			setPuestoId(puestoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Long categoria = (Long)attributes.get("categoria");

		if (categoria != null) {
			setCategoria(categoria);
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
	public long getPuestoId() {
		return _puestoId;
	}

	@Override
	public void setPuestoId(long puestoId) {
		_puestoId = puestoId;
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
	public long getCategoria() {
		return _categoria;
	}

	@Override
	public void setCategoria(long categoria) {
		_categoria = categoria;
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
			Puesto.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Puesto toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Puesto)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PuestoImpl puestoImpl = new PuestoImpl();

		puestoImpl.setPuestoId(getPuestoId());
		puestoImpl.setDescripcion(getDescripcion());
		puestoImpl.setCategoria(getCategoria());
		puestoImpl.setActivo(getActivo());
		puestoImpl.setUsuariocrea(getUsuariocrea());
		puestoImpl.setFechacrea(getFechacrea());
		puestoImpl.setUsuariomodifica(getUsuariomodifica());
		puestoImpl.setFechacreamodifica(getFechacreamodifica());

		puestoImpl.resetOriginalValues();

		return puestoImpl;
	}

	@Override
	public int compareTo(Puesto puesto) {
		int value = 0;

		value = DateUtil.compareTo(getFechacreamodifica(),
				puesto.getFechacreamodifica());

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

		if (!(obj instanceof Puesto)) {
			return false;
		}

		Puesto puesto = (Puesto)obj;

		long primaryKey = puesto.getPrimaryKey();

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
		PuestoModelImpl puestoModelImpl = this;

		puestoModelImpl._originalDescripcion = puestoModelImpl._descripcion;

		puestoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Puesto> toCacheModel() {
		PuestoCacheModel puestoCacheModel = new PuestoCacheModel();

		puestoCacheModel.puestoId = getPuestoId();

		puestoCacheModel.descripcion = getDescripcion();

		String descripcion = puestoCacheModel.descripcion;

		if ((descripcion != null) && (descripcion.length() == 0)) {
			puestoCacheModel.descripcion = null;
		}

		puestoCacheModel.categoria = getCategoria();

		puestoCacheModel.activo = getActivo();

		puestoCacheModel.usuariocrea = getUsuariocrea();

		Date fechacrea = getFechacrea();

		if (fechacrea != null) {
			puestoCacheModel.fechacrea = fechacrea.getTime();
		}
		else {
			puestoCacheModel.fechacrea = Long.MIN_VALUE;
		}

		puestoCacheModel.usuariomodifica = getUsuariomodifica();

		Date fechacreamodifica = getFechacreamodifica();

		if (fechacreamodifica != null) {
			puestoCacheModel.fechacreamodifica = fechacreamodifica.getTime();
		}
		else {
			puestoCacheModel.fechacreamodifica = Long.MIN_VALUE;
		}

		return puestoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{puestoId=");
		sb.append(getPuestoId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", categoria=");
		sb.append(getCategoria());
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
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.Puesto");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>puestoId</column-name><column-value><![CDATA[");
		sb.append(getPuestoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoria</column-name><column-value><![CDATA[");
		sb.append(getCategoria());
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

	private static ClassLoader _classLoader = Puesto.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Puesto.class };
	private long _puestoId;
	private String _descripcion;
	private String _originalDescripcion;
	private long _categoria;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private long _columnBitmask;
	private Puesto _escapedModel;
}
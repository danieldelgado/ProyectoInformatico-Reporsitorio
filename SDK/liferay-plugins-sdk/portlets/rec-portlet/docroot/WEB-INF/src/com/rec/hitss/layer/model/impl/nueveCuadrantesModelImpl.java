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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rec.hitss.layer.model.nueveCuadrantes;
import com.rec.hitss.layer.model.nueveCuadrantesModel;
import com.rec.hitss.layer.model.nueveCuadrantesSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the nueveCuadrantes service. Represents a row in the &quot;NUEVE_CUADRANTES&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rec.hitss.layer.model.nueveCuadrantesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link nueveCuadrantesImpl}.
 * </p>
 *
 * @author Crossfire
 * @see nueveCuadrantesImpl
 * @see com.rec.hitss.layer.model.nueveCuadrantes
 * @see com.rec.hitss.layer.model.nueveCuadrantesModel
 * @generated
 */
@JSON(strict = true)
public class nueveCuadrantesModelImpl extends BaseModelImpl<nueveCuadrantes>
	implements nueveCuadrantesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a nueve cuadrantes model instance should use the {@link com.rec.hitss.layer.model.nueveCuadrantes} interface instead.
	 */
	public static final String TABLE_NAME = "NUEVE_CUADRANTES";
	public static final Object[][] TABLE_COLUMNS = {
			{ "NC_ID", Types.BIGINT },
			{ "REQ_ESTADO", Types.VARCHAR },
			{ "REQ_ACTIVO", Types.VARCHAR },
			{ "SR_USUARIO_CREA", Types.BIGINT },
			{ "SR_FECHA_CREA", Types.TIMESTAMP },
			{ "SR_USUARIO_MODIFICA", Types.BIGINT },
			{ "SR_FECHA_MODIFICA", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table NUEVE_CUADRANTES (NC_ID LONG not null primary key,REQ_ESTADO VARCHAR(75) null,REQ_ACTIVO VARCHAR(75) null,SR_USUARIO_CREA LONG,SR_FECHA_CREA DATE null,SR_USUARIO_MODIFICA LONG,SR_FECHA_MODIFICA DATE null)";
	public static final String TABLE_SQL_DROP = "drop table NUEVE_CUADRANTES";
	public static final String ORDER_BY_JPQL = " ORDER BY nueveCuadrantes.NC_ID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY NUEVE_CUADRANTES.NC_ID ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rec.hitss.layer.model.nueveCuadrantes"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rec.hitss.layer.model.nueveCuadrantes"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static nueveCuadrantes toModel(nueveCuadrantesSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		nueveCuadrantes model = new nueveCuadrantesImpl();

		model.setNC_ID(soapModel.getNC_ID());
		model.setREQ_ESTADO(soapModel.getREQ_ESTADO());
		model.setREQ_ACTIVO(soapModel.getREQ_ACTIVO());
		model.setSR_USUARIO_CREA(soapModel.getSR_USUARIO_CREA());
		model.setSR_FECHA_CREA(soapModel.getSR_FECHA_CREA());
		model.setSR_USUARIO_MODIFICA(soapModel.getSR_USUARIO_MODIFICA());
		model.setSR_FECHA_MODIFICA(soapModel.getSR_FECHA_MODIFICA());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<nueveCuadrantes> toModels(
		nueveCuadrantesSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<nueveCuadrantes> models = new ArrayList<nueveCuadrantes>(soapModels.length);

		for (nueveCuadrantesSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rec.hitss.layer.model.nueveCuadrantes"));

	public nueveCuadrantesModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _NC_ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNC_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _NC_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return nueveCuadrantes.class;
	}

	@Override
	public String getModelClassName() {
		return nueveCuadrantes.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("NC_ID", getNC_ID());
		attributes.put("REQ_ESTADO", getREQ_ESTADO());
		attributes.put("REQ_ACTIVO", getREQ_ACTIVO());
		attributes.put("SR_USUARIO_CREA", getSR_USUARIO_CREA());
		attributes.put("SR_FECHA_CREA", getSR_FECHA_CREA());
		attributes.put("SR_USUARIO_MODIFICA", getSR_USUARIO_MODIFICA());
		attributes.put("SR_FECHA_MODIFICA", getSR_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long NC_ID = (Long)attributes.get("NC_ID");

		if (NC_ID != null) {
			setNC_ID(NC_ID);
		}

		String REQ_ESTADO = (String)attributes.get("REQ_ESTADO");

		if (REQ_ESTADO != null) {
			setREQ_ESTADO(REQ_ESTADO);
		}

		String REQ_ACTIVO = (String)attributes.get("REQ_ACTIVO");

		if (REQ_ACTIVO != null) {
			setREQ_ACTIVO(REQ_ACTIVO);
		}

		Long SR_USUARIO_CREA = (Long)attributes.get("SR_USUARIO_CREA");

		if (SR_USUARIO_CREA != null) {
			setSR_USUARIO_CREA(SR_USUARIO_CREA);
		}

		Date SR_FECHA_CREA = (Date)attributes.get("SR_FECHA_CREA");

		if (SR_FECHA_CREA != null) {
			setSR_FECHA_CREA(SR_FECHA_CREA);
		}

		Long SR_USUARIO_MODIFICA = (Long)attributes.get("SR_USUARIO_MODIFICA");

		if (SR_USUARIO_MODIFICA != null) {
			setSR_USUARIO_MODIFICA(SR_USUARIO_MODIFICA);
		}

		Date SR_FECHA_MODIFICA = (Date)attributes.get("SR_FECHA_MODIFICA");

		if (SR_FECHA_MODIFICA != null) {
			setSR_FECHA_MODIFICA(SR_FECHA_MODIFICA);
		}
	}

	@JSON
	@Override
	public long getNC_ID() {
		return _NC_ID;
	}

	@Override
	public void setNC_ID(long NC_ID) {
		_NC_ID = NC_ID;
	}

	@JSON
	@Override
	public String getREQ_ESTADO() {
		if (_REQ_ESTADO == null) {
			return StringPool.BLANK;
		}
		else {
			return _REQ_ESTADO;
		}
	}

	@Override
	public void setREQ_ESTADO(String REQ_ESTADO) {
		_REQ_ESTADO = REQ_ESTADO;
	}

	@JSON
	@Override
	public String getREQ_ACTIVO() {
		if (_REQ_ACTIVO == null) {
			return StringPool.BLANK;
		}
		else {
			return _REQ_ACTIVO;
		}
	}

	@Override
	public void setREQ_ACTIVO(String REQ_ACTIVO) {
		_REQ_ACTIVO = REQ_ACTIVO;
	}

	@JSON
	@Override
	public long getSR_USUARIO_CREA() {
		return _SR_USUARIO_CREA;
	}

	@Override
	public void setSR_USUARIO_CREA(long SR_USUARIO_CREA) {
		_SR_USUARIO_CREA = SR_USUARIO_CREA;
	}

	@JSON
	@Override
	public Date getSR_FECHA_CREA() {
		return _SR_FECHA_CREA;
	}

	@Override
	public void setSR_FECHA_CREA(Date SR_FECHA_CREA) {
		_SR_FECHA_CREA = SR_FECHA_CREA;
	}

	@JSON
	@Override
	public long getSR_USUARIO_MODIFICA() {
		return _SR_USUARIO_MODIFICA;
	}

	@Override
	public void setSR_USUARIO_MODIFICA(long SR_USUARIO_MODIFICA) {
		_SR_USUARIO_MODIFICA = SR_USUARIO_MODIFICA;
	}

	@JSON
	@Override
	public Date getSR_FECHA_MODIFICA() {
		return _SR_FECHA_MODIFICA;
	}

	@Override
	public void setSR_FECHA_MODIFICA(Date SR_FECHA_MODIFICA) {
		_SR_FECHA_MODIFICA = SR_FECHA_MODIFICA;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			nueveCuadrantes.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public nueveCuadrantes toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (nueveCuadrantes)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		nueveCuadrantesImpl nueveCuadrantesImpl = new nueveCuadrantesImpl();

		nueveCuadrantesImpl.setNC_ID(getNC_ID());
		nueveCuadrantesImpl.setREQ_ESTADO(getREQ_ESTADO());
		nueveCuadrantesImpl.setREQ_ACTIVO(getREQ_ACTIVO());
		nueveCuadrantesImpl.setSR_USUARIO_CREA(getSR_USUARIO_CREA());
		nueveCuadrantesImpl.setSR_FECHA_CREA(getSR_FECHA_CREA());
		nueveCuadrantesImpl.setSR_USUARIO_MODIFICA(getSR_USUARIO_MODIFICA());
		nueveCuadrantesImpl.setSR_FECHA_MODIFICA(getSR_FECHA_MODIFICA());

		nueveCuadrantesImpl.resetOriginalValues();

		return nueveCuadrantesImpl;
	}

	@Override
	public int compareTo(nueveCuadrantes nueveCuadrantes) {
		int value = 0;

		if (getNC_ID() < nueveCuadrantes.getNC_ID()) {
			value = -1;
		}
		else if (getNC_ID() > nueveCuadrantes.getNC_ID()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof nueveCuadrantes)) {
			return false;
		}

		nueveCuadrantes nueveCuadrantes = (nueveCuadrantes)obj;

		long primaryKey = nueveCuadrantes.getPrimaryKey();

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
	public CacheModel<nueveCuadrantes> toCacheModel() {
		nueveCuadrantesCacheModel nueveCuadrantesCacheModel = new nueveCuadrantesCacheModel();

		nueveCuadrantesCacheModel.NC_ID = getNC_ID();

		nueveCuadrantesCacheModel.REQ_ESTADO = getREQ_ESTADO();

		String REQ_ESTADO = nueveCuadrantesCacheModel.REQ_ESTADO;

		if ((REQ_ESTADO != null) && (REQ_ESTADO.length() == 0)) {
			nueveCuadrantesCacheModel.REQ_ESTADO = null;
		}

		nueveCuadrantesCacheModel.REQ_ACTIVO = getREQ_ACTIVO();

		String REQ_ACTIVO = nueveCuadrantesCacheModel.REQ_ACTIVO;

		if ((REQ_ACTIVO != null) && (REQ_ACTIVO.length() == 0)) {
			nueveCuadrantesCacheModel.REQ_ACTIVO = null;
		}

		nueveCuadrantesCacheModel.SR_USUARIO_CREA = getSR_USUARIO_CREA();

		Date SR_FECHA_CREA = getSR_FECHA_CREA();

		if (SR_FECHA_CREA != null) {
			nueveCuadrantesCacheModel.SR_FECHA_CREA = SR_FECHA_CREA.getTime();
		}
		else {
			nueveCuadrantesCacheModel.SR_FECHA_CREA = Long.MIN_VALUE;
		}

		nueveCuadrantesCacheModel.SR_USUARIO_MODIFICA = getSR_USUARIO_MODIFICA();

		Date SR_FECHA_MODIFICA = getSR_FECHA_MODIFICA();

		if (SR_FECHA_MODIFICA != null) {
			nueveCuadrantesCacheModel.SR_FECHA_MODIFICA = SR_FECHA_MODIFICA.getTime();
		}
		else {
			nueveCuadrantesCacheModel.SR_FECHA_MODIFICA = Long.MIN_VALUE;
		}

		return nueveCuadrantesCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{NC_ID=");
		sb.append(getNC_ID());
		sb.append(", REQ_ESTADO=");
		sb.append(getREQ_ESTADO());
		sb.append(", REQ_ACTIVO=");
		sb.append(getREQ_ACTIVO());
		sb.append(", SR_USUARIO_CREA=");
		sb.append(getSR_USUARIO_CREA());
		sb.append(", SR_FECHA_CREA=");
		sb.append(getSR_FECHA_CREA());
		sb.append(", SR_USUARIO_MODIFICA=");
		sb.append(getSR_USUARIO_MODIFICA());
		sb.append(", SR_FECHA_MODIFICA=");
		sb.append(getSR_FECHA_MODIFICA());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.nueveCuadrantes");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>NC_ID</column-name><column-value><![CDATA[");
		sb.append(getNC_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>REQ_ESTADO</column-name><column-value><![CDATA[");
		sb.append(getREQ_ESTADO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>REQ_ACTIVO</column-name><column-value><![CDATA[");
		sb.append(getREQ_ACTIVO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SR_USUARIO_CREA</column-name><column-value><![CDATA[");
		sb.append(getSR_USUARIO_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SR_FECHA_CREA</column-name><column-value><![CDATA[");
		sb.append(getSR_FECHA_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SR_USUARIO_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getSR_USUARIO_MODIFICA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SR_FECHA_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getSR_FECHA_MODIFICA());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = nueveCuadrantes.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			nueveCuadrantes.class
		};
	private long _NC_ID;
	private String _REQ_ESTADO;
	private String _REQ_ACTIVO;
	private long _SR_USUARIO_CREA;
	private Date _SR_FECHA_CREA;
	private long _SR_USUARIO_MODIFICA;
	private Date _SR_FECHA_MODIFICA;
	private nueveCuadrantes _escapedModel;
}
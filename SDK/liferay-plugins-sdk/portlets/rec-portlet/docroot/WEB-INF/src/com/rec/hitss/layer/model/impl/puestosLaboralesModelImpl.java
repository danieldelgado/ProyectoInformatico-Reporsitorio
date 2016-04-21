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

import com.rec.hitss.layer.model.puestosLaborales;
import com.rec.hitss.layer.model.puestosLaboralesModel;
import com.rec.hitss.layer.model.puestosLaboralesSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the puestosLaborales service. Represents a row in the &quot;PUESTOS_LABORALES&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rec.hitss.layer.model.puestosLaboralesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link puestosLaboralesImpl}.
 * </p>
 *
 * @author Crossfire
 * @see puestosLaboralesImpl
 * @see com.rec.hitss.layer.model.puestosLaborales
 * @see com.rec.hitss.layer.model.puestosLaboralesModel
 * @generated
 */
@JSON(strict = true)
public class puestosLaboralesModelImpl extends BaseModelImpl<puestosLaborales>
	implements puestosLaboralesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a puestos laborales model instance should use the {@link com.rec.hitss.layer.model.puestosLaborales} interface instead.
	 */
	public static final String TABLE_NAME = "PUESTOS_LABORALES";
	public static final Object[][] TABLE_COLUMNS = {
			{ "PL_ID", Types.BIGINT },
			{ "PL_PUESTO", Types.VARCHAR },
			{ "PL_ESTADO", Types.VARCHAR },
			{ "PL_ACTIVO", Types.VARCHAR },
			{ "PL_USUARIO_CREA", Types.BIGINT },
			{ "PL_FECHA_CREA", Types.TIMESTAMP },
			{ "PL_USUARIO_MODIFICA", Types.BIGINT },
			{ "PL_FECHA_MODIFICA", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table PUESTOS_LABORALES (PL_ID LONG not null primary key,PL_PUESTO VARCHAR(75) null,PL_ESTADO VARCHAR(75) null,PL_ACTIVO VARCHAR(75) null,PL_USUARIO_CREA LONG,PL_FECHA_CREA DATE null,PL_USUARIO_MODIFICA LONG,PL_FECHA_MODIFICA DATE null)";
	public static final String TABLE_SQL_DROP = "drop table PUESTOS_LABORALES";
	public static final String ORDER_BY_JPQL = " ORDER BY puestosLaborales.PL_ID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY PUESTOS_LABORALES.PL_ID ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rec.hitss.layer.model.puestosLaborales"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rec.hitss.layer.model.puestosLaborales"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static puestosLaborales toModel(puestosLaboralesSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		puestosLaborales model = new puestosLaboralesImpl();

		model.setPL_ID(soapModel.getPL_ID());
		model.setPL_PUESTO(soapModel.getPL_PUESTO());
		model.setPL_ESTADO(soapModel.getPL_ESTADO());
		model.setPL_ACTIVO(soapModel.getPL_ACTIVO());
		model.setPL_USUARIO_CREA(soapModel.getPL_USUARIO_CREA());
		model.setPL_FECHA_CREA(soapModel.getPL_FECHA_CREA());
		model.setPL_USUARIO_MODIFICA(soapModel.getPL_USUARIO_MODIFICA());
		model.setPL_FECHA_MODIFICA(soapModel.getPL_FECHA_MODIFICA());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<puestosLaborales> toModels(
		puestosLaboralesSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<puestosLaborales> models = new ArrayList<puestosLaborales>(soapModels.length);

		for (puestosLaboralesSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rec.hitss.layer.model.puestosLaborales"));

	public puestosLaboralesModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _PL_ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPL_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PL_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return puestosLaborales.class;
	}

	@Override
	public String getModelClassName() {
		return puestosLaborales.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PL_ID", getPL_ID());
		attributes.put("PL_PUESTO", getPL_PUESTO());
		attributes.put("PL_ESTADO", getPL_ESTADO());
		attributes.put("PL_ACTIVO", getPL_ACTIVO());
		attributes.put("PL_USUARIO_CREA", getPL_USUARIO_CREA());
		attributes.put("PL_FECHA_CREA", getPL_FECHA_CREA());
		attributes.put("PL_USUARIO_MODIFICA", getPL_USUARIO_MODIFICA());
		attributes.put("PL_FECHA_MODIFICA", getPL_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long PL_ID = (Long)attributes.get("PL_ID");

		if (PL_ID != null) {
			setPL_ID(PL_ID);
		}

		String PL_PUESTO = (String)attributes.get("PL_PUESTO");

		if (PL_PUESTO != null) {
			setPL_PUESTO(PL_PUESTO);
		}

		String PL_ESTADO = (String)attributes.get("PL_ESTADO");

		if (PL_ESTADO != null) {
			setPL_ESTADO(PL_ESTADO);
		}

		String PL_ACTIVO = (String)attributes.get("PL_ACTIVO");

		if (PL_ACTIVO != null) {
			setPL_ACTIVO(PL_ACTIVO);
		}

		Long PL_USUARIO_CREA = (Long)attributes.get("PL_USUARIO_CREA");

		if (PL_USUARIO_CREA != null) {
			setPL_USUARIO_CREA(PL_USUARIO_CREA);
		}

		Date PL_FECHA_CREA = (Date)attributes.get("PL_FECHA_CREA");

		if (PL_FECHA_CREA != null) {
			setPL_FECHA_CREA(PL_FECHA_CREA);
		}

		Long PL_USUARIO_MODIFICA = (Long)attributes.get("PL_USUARIO_MODIFICA");

		if (PL_USUARIO_MODIFICA != null) {
			setPL_USUARIO_MODIFICA(PL_USUARIO_MODIFICA);
		}

		Date PL_FECHA_MODIFICA = (Date)attributes.get("PL_FECHA_MODIFICA");

		if (PL_FECHA_MODIFICA != null) {
			setPL_FECHA_MODIFICA(PL_FECHA_MODIFICA);
		}
	}

	@JSON
	@Override
	public long getPL_ID() {
		return _PL_ID;
	}

	@Override
	public void setPL_ID(long PL_ID) {
		_PL_ID = PL_ID;
	}

	@JSON
	@Override
	public String getPL_PUESTO() {
		if (_PL_PUESTO == null) {
			return StringPool.BLANK;
		}
		else {
			return _PL_PUESTO;
		}
	}

	@Override
	public void setPL_PUESTO(String PL_PUESTO) {
		_PL_PUESTO = PL_PUESTO;
	}

	@JSON
	@Override
	public String getPL_ESTADO() {
		if (_PL_ESTADO == null) {
			return StringPool.BLANK;
		}
		else {
			return _PL_ESTADO;
		}
	}

	@Override
	public void setPL_ESTADO(String PL_ESTADO) {
		_PL_ESTADO = PL_ESTADO;
	}

	@JSON
	@Override
	public String getPL_ACTIVO() {
		if (_PL_ACTIVO == null) {
			return StringPool.BLANK;
		}
		else {
			return _PL_ACTIVO;
		}
	}

	@Override
	public void setPL_ACTIVO(String PL_ACTIVO) {
		_PL_ACTIVO = PL_ACTIVO;
	}

	@JSON
	@Override
	public long getPL_USUARIO_CREA() {
		return _PL_USUARIO_CREA;
	}

	@Override
	public void setPL_USUARIO_CREA(long PL_USUARIO_CREA) {
		_PL_USUARIO_CREA = PL_USUARIO_CREA;
	}

	@JSON
	@Override
	public Date getPL_FECHA_CREA() {
		return _PL_FECHA_CREA;
	}

	@Override
	public void setPL_FECHA_CREA(Date PL_FECHA_CREA) {
		_PL_FECHA_CREA = PL_FECHA_CREA;
	}

	@JSON
	@Override
	public long getPL_USUARIO_MODIFICA() {
		return _PL_USUARIO_MODIFICA;
	}

	@Override
	public void setPL_USUARIO_MODIFICA(long PL_USUARIO_MODIFICA) {
		_PL_USUARIO_MODIFICA = PL_USUARIO_MODIFICA;
	}

	@JSON
	@Override
	public Date getPL_FECHA_MODIFICA() {
		return _PL_FECHA_MODIFICA;
	}

	@Override
	public void setPL_FECHA_MODIFICA(Date PL_FECHA_MODIFICA) {
		_PL_FECHA_MODIFICA = PL_FECHA_MODIFICA;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			puestosLaborales.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public puestosLaborales toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (puestosLaborales)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		puestosLaboralesImpl puestosLaboralesImpl = new puestosLaboralesImpl();

		puestosLaboralesImpl.setPL_ID(getPL_ID());
		puestosLaboralesImpl.setPL_PUESTO(getPL_PUESTO());
		puestosLaboralesImpl.setPL_ESTADO(getPL_ESTADO());
		puestosLaboralesImpl.setPL_ACTIVO(getPL_ACTIVO());
		puestosLaboralesImpl.setPL_USUARIO_CREA(getPL_USUARIO_CREA());
		puestosLaboralesImpl.setPL_FECHA_CREA(getPL_FECHA_CREA());
		puestosLaboralesImpl.setPL_USUARIO_MODIFICA(getPL_USUARIO_MODIFICA());
		puestosLaboralesImpl.setPL_FECHA_MODIFICA(getPL_FECHA_MODIFICA());

		puestosLaboralesImpl.resetOriginalValues();

		return puestosLaboralesImpl;
	}

	@Override
	public int compareTo(puestosLaborales puestosLaborales) {
		int value = 0;

		if (getPL_ID() < puestosLaborales.getPL_ID()) {
			value = -1;
		}
		else if (getPL_ID() > puestosLaborales.getPL_ID()) {
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

		if (!(obj instanceof puestosLaborales)) {
			return false;
		}

		puestosLaborales puestosLaborales = (puestosLaborales)obj;

		long primaryKey = puestosLaborales.getPrimaryKey();

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
	public CacheModel<puestosLaborales> toCacheModel() {
		puestosLaboralesCacheModel puestosLaboralesCacheModel = new puestosLaboralesCacheModel();

		puestosLaboralesCacheModel.PL_ID = getPL_ID();

		puestosLaboralesCacheModel.PL_PUESTO = getPL_PUESTO();

		String PL_PUESTO = puestosLaboralesCacheModel.PL_PUESTO;

		if ((PL_PUESTO != null) && (PL_PUESTO.length() == 0)) {
			puestosLaboralesCacheModel.PL_PUESTO = null;
		}

		puestosLaboralesCacheModel.PL_ESTADO = getPL_ESTADO();

		String PL_ESTADO = puestosLaboralesCacheModel.PL_ESTADO;

		if ((PL_ESTADO != null) && (PL_ESTADO.length() == 0)) {
			puestosLaboralesCacheModel.PL_ESTADO = null;
		}

		puestosLaboralesCacheModel.PL_ACTIVO = getPL_ACTIVO();

		String PL_ACTIVO = puestosLaboralesCacheModel.PL_ACTIVO;

		if ((PL_ACTIVO != null) && (PL_ACTIVO.length() == 0)) {
			puestosLaboralesCacheModel.PL_ACTIVO = null;
		}

		puestosLaboralesCacheModel.PL_USUARIO_CREA = getPL_USUARIO_CREA();

		Date PL_FECHA_CREA = getPL_FECHA_CREA();

		if (PL_FECHA_CREA != null) {
			puestosLaboralesCacheModel.PL_FECHA_CREA = PL_FECHA_CREA.getTime();
		}
		else {
			puestosLaboralesCacheModel.PL_FECHA_CREA = Long.MIN_VALUE;
		}

		puestosLaboralesCacheModel.PL_USUARIO_MODIFICA = getPL_USUARIO_MODIFICA();

		Date PL_FECHA_MODIFICA = getPL_FECHA_MODIFICA();

		if (PL_FECHA_MODIFICA != null) {
			puestosLaboralesCacheModel.PL_FECHA_MODIFICA = PL_FECHA_MODIFICA.getTime();
		}
		else {
			puestosLaboralesCacheModel.PL_FECHA_MODIFICA = Long.MIN_VALUE;
		}

		return puestosLaboralesCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{PL_ID=");
		sb.append(getPL_ID());
		sb.append(", PL_PUESTO=");
		sb.append(getPL_PUESTO());
		sb.append(", PL_ESTADO=");
		sb.append(getPL_ESTADO());
		sb.append(", PL_ACTIVO=");
		sb.append(getPL_ACTIVO());
		sb.append(", PL_USUARIO_CREA=");
		sb.append(getPL_USUARIO_CREA());
		sb.append(", PL_FECHA_CREA=");
		sb.append(getPL_FECHA_CREA());
		sb.append(", PL_USUARIO_MODIFICA=");
		sb.append(getPL_USUARIO_MODIFICA());
		sb.append(", PL_FECHA_MODIFICA=");
		sb.append(getPL_FECHA_MODIFICA());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.puestosLaborales");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PL_ID</column-name><column-value><![CDATA[");
		sb.append(getPL_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PL_PUESTO</column-name><column-value><![CDATA[");
		sb.append(getPL_PUESTO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PL_ESTADO</column-name><column-value><![CDATA[");
		sb.append(getPL_ESTADO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PL_ACTIVO</column-name><column-value><![CDATA[");
		sb.append(getPL_ACTIVO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PL_USUARIO_CREA</column-name><column-value><![CDATA[");
		sb.append(getPL_USUARIO_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PL_FECHA_CREA</column-name><column-value><![CDATA[");
		sb.append(getPL_FECHA_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PL_USUARIO_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getPL_USUARIO_MODIFICA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PL_FECHA_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getPL_FECHA_MODIFICA());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = puestosLaborales.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			puestosLaborales.class
		};
	private long _PL_ID;
	private String _PL_PUESTO;
	private String _PL_ESTADO;
	private String _PL_ACTIVO;
	private long _PL_USUARIO_CREA;
	private Date _PL_FECHA_CREA;
	private long _PL_USUARIO_MODIFICA;
	private Date _PL_FECHA_MODIFICA;
	private puestosLaborales _escapedModel;
}
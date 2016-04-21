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

import com.rec.hitss.layer.model.curriculumVitae;
import com.rec.hitss.layer.model.curriculumVitaeModel;
import com.rec.hitss.layer.model.curriculumVitaeSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the curriculumVitae service. Represents a row in the &quot;CURRICULUM_VITAE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rec.hitss.layer.model.curriculumVitaeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link curriculumVitaeImpl}.
 * </p>
 *
 * @author Crossfire
 * @see curriculumVitaeImpl
 * @see com.rec.hitss.layer.model.curriculumVitae
 * @see com.rec.hitss.layer.model.curriculumVitaeModel
 * @generated
 */
@JSON(strict = true)
public class curriculumVitaeModelImpl extends BaseModelImpl<curriculumVitae>
	implements curriculumVitaeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a curriculum vitae model instance should use the {@link com.rec.hitss.layer.model.curriculumVitae} interface instead.
	 */
	public static final String TABLE_NAME = "CURRICULUM_VITAE";
	public static final Object[][] TABLE_COLUMNS = {
			{ "CV_ID", Types.BIGINT },
			{ "CV_ESTADO", Types.VARCHAR },
			{ "CV_ACTIVO", Types.VARCHAR },
			{ "CV_USUARIO_CREA", Types.BIGINT },
			{ "CV_FECHA_CREA", Types.TIMESTAMP },
			{ "CV_USUARIO_MODIFICA", Types.BIGINT },
			{ "CV_FECHA_MODIFICA", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table CURRICULUM_VITAE (CV_ID LONG not null primary key,CV_ESTADO VARCHAR(75) null,CV_ACTIVO VARCHAR(75) null,CV_USUARIO_CREA LONG,CV_FECHA_CREA DATE null,CV_USUARIO_MODIFICA LONG,CV_FECHA_MODIFICA DATE null)";
	public static final String TABLE_SQL_DROP = "drop table CURRICULUM_VITAE";
	public static final String ORDER_BY_JPQL = " ORDER BY curriculumVitae.CV_ID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CURRICULUM_VITAE.CV_ID ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rec.hitss.layer.model.curriculumVitae"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rec.hitss.layer.model.curriculumVitae"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static curriculumVitae toModel(curriculumVitaeSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		curriculumVitae model = new curriculumVitaeImpl();

		model.setCV_ID(soapModel.getCV_ID());
		model.setCV_ESTADO(soapModel.getCV_ESTADO());
		model.setCV_ACTIVO(soapModel.getCV_ACTIVO());
		model.setCV_USUARIO_CREA(soapModel.getCV_USUARIO_CREA());
		model.setCV_FECHA_CREA(soapModel.getCV_FECHA_CREA());
		model.setCV_USUARIO_MODIFICA(soapModel.getCV_USUARIO_MODIFICA());
		model.setCV_FECHA_MODIFICA(soapModel.getCV_FECHA_MODIFICA());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<curriculumVitae> toModels(
		curriculumVitaeSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<curriculumVitae> models = new ArrayList<curriculumVitae>(soapModels.length);

		for (curriculumVitaeSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rec.hitss.layer.model.curriculumVitae"));

	public curriculumVitaeModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _CV_ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCV_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _CV_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return curriculumVitae.class;
	}

	@Override
	public String getModelClassName() {
		return curriculumVitae.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CV_ID", getCV_ID());
		attributes.put("CV_ESTADO", getCV_ESTADO());
		attributes.put("CV_ACTIVO", getCV_ACTIVO());
		attributes.put("CV_USUARIO_CREA", getCV_USUARIO_CREA());
		attributes.put("CV_FECHA_CREA", getCV_FECHA_CREA());
		attributes.put("CV_USUARIO_MODIFICA", getCV_USUARIO_MODIFICA());
		attributes.put("CV_FECHA_MODIFICA", getCV_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long CV_ID = (Long)attributes.get("CV_ID");

		if (CV_ID != null) {
			setCV_ID(CV_ID);
		}

		String CV_ESTADO = (String)attributes.get("CV_ESTADO");

		if (CV_ESTADO != null) {
			setCV_ESTADO(CV_ESTADO);
		}

		String CV_ACTIVO = (String)attributes.get("CV_ACTIVO");

		if (CV_ACTIVO != null) {
			setCV_ACTIVO(CV_ACTIVO);
		}

		Long CV_USUARIO_CREA = (Long)attributes.get("CV_USUARIO_CREA");

		if (CV_USUARIO_CREA != null) {
			setCV_USUARIO_CREA(CV_USUARIO_CREA);
		}

		Date CV_FECHA_CREA = (Date)attributes.get("CV_FECHA_CREA");

		if (CV_FECHA_CREA != null) {
			setCV_FECHA_CREA(CV_FECHA_CREA);
		}

		Long CV_USUARIO_MODIFICA = (Long)attributes.get("CV_USUARIO_MODIFICA");

		if (CV_USUARIO_MODIFICA != null) {
			setCV_USUARIO_MODIFICA(CV_USUARIO_MODIFICA);
		}

		Date CV_FECHA_MODIFICA = (Date)attributes.get("CV_FECHA_MODIFICA");

		if (CV_FECHA_MODIFICA != null) {
			setCV_FECHA_MODIFICA(CV_FECHA_MODIFICA);
		}
	}

	@JSON
	@Override
	public long getCV_ID() {
		return _CV_ID;
	}

	@Override
	public void setCV_ID(long CV_ID) {
		_CV_ID = CV_ID;
	}

	@JSON
	@Override
	public String getCV_ESTADO() {
		if (_CV_ESTADO == null) {
			return StringPool.BLANK;
		}
		else {
			return _CV_ESTADO;
		}
	}

	@Override
	public void setCV_ESTADO(String CV_ESTADO) {
		_CV_ESTADO = CV_ESTADO;
	}

	@JSON
	@Override
	public String getCV_ACTIVO() {
		if (_CV_ACTIVO == null) {
			return StringPool.BLANK;
		}
		else {
			return _CV_ACTIVO;
		}
	}

	@Override
	public void setCV_ACTIVO(String CV_ACTIVO) {
		_CV_ACTIVO = CV_ACTIVO;
	}

	@JSON
	@Override
	public long getCV_USUARIO_CREA() {
		return _CV_USUARIO_CREA;
	}

	@Override
	public void setCV_USUARIO_CREA(long CV_USUARIO_CREA) {
		_CV_USUARIO_CREA = CV_USUARIO_CREA;
	}

	@JSON
	@Override
	public Date getCV_FECHA_CREA() {
		return _CV_FECHA_CREA;
	}

	@Override
	public void setCV_FECHA_CREA(Date CV_FECHA_CREA) {
		_CV_FECHA_CREA = CV_FECHA_CREA;
	}

	@JSON
	@Override
	public long getCV_USUARIO_MODIFICA() {
		return _CV_USUARIO_MODIFICA;
	}

	@Override
	public void setCV_USUARIO_MODIFICA(long CV_USUARIO_MODIFICA) {
		_CV_USUARIO_MODIFICA = CV_USUARIO_MODIFICA;
	}

	@JSON
	@Override
	public Date getCV_FECHA_MODIFICA() {
		return _CV_FECHA_MODIFICA;
	}

	@Override
	public void setCV_FECHA_MODIFICA(Date CV_FECHA_MODIFICA) {
		_CV_FECHA_MODIFICA = CV_FECHA_MODIFICA;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			curriculumVitae.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public curriculumVitae toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (curriculumVitae)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		curriculumVitaeImpl curriculumVitaeImpl = new curriculumVitaeImpl();

		curriculumVitaeImpl.setCV_ID(getCV_ID());
		curriculumVitaeImpl.setCV_ESTADO(getCV_ESTADO());
		curriculumVitaeImpl.setCV_ACTIVO(getCV_ACTIVO());
		curriculumVitaeImpl.setCV_USUARIO_CREA(getCV_USUARIO_CREA());
		curriculumVitaeImpl.setCV_FECHA_CREA(getCV_FECHA_CREA());
		curriculumVitaeImpl.setCV_USUARIO_MODIFICA(getCV_USUARIO_MODIFICA());
		curriculumVitaeImpl.setCV_FECHA_MODIFICA(getCV_FECHA_MODIFICA());

		curriculumVitaeImpl.resetOriginalValues();

		return curriculumVitaeImpl;
	}

	@Override
	public int compareTo(curriculumVitae curriculumVitae) {
		int value = 0;

		if (getCV_ID() < curriculumVitae.getCV_ID()) {
			value = -1;
		}
		else if (getCV_ID() > curriculumVitae.getCV_ID()) {
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

		if (!(obj instanceof curriculumVitae)) {
			return false;
		}

		curriculumVitae curriculumVitae = (curriculumVitae)obj;

		long primaryKey = curriculumVitae.getPrimaryKey();

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
	public CacheModel<curriculumVitae> toCacheModel() {
		curriculumVitaeCacheModel curriculumVitaeCacheModel = new curriculumVitaeCacheModel();

		curriculumVitaeCacheModel.CV_ID = getCV_ID();

		curriculumVitaeCacheModel.CV_ESTADO = getCV_ESTADO();

		String CV_ESTADO = curriculumVitaeCacheModel.CV_ESTADO;

		if ((CV_ESTADO != null) && (CV_ESTADO.length() == 0)) {
			curriculumVitaeCacheModel.CV_ESTADO = null;
		}

		curriculumVitaeCacheModel.CV_ACTIVO = getCV_ACTIVO();

		String CV_ACTIVO = curriculumVitaeCacheModel.CV_ACTIVO;

		if ((CV_ACTIVO != null) && (CV_ACTIVO.length() == 0)) {
			curriculumVitaeCacheModel.CV_ACTIVO = null;
		}

		curriculumVitaeCacheModel.CV_USUARIO_CREA = getCV_USUARIO_CREA();

		Date CV_FECHA_CREA = getCV_FECHA_CREA();

		if (CV_FECHA_CREA != null) {
			curriculumVitaeCacheModel.CV_FECHA_CREA = CV_FECHA_CREA.getTime();
		}
		else {
			curriculumVitaeCacheModel.CV_FECHA_CREA = Long.MIN_VALUE;
		}

		curriculumVitaeCacheModel.CV_USUARIO_MODIFICA = getCV_USUARIO_MODIFICA();

		Date CV_FECHA_MODIFICA = getCV_FECHA_MODIFICA();

		if (CV_FECHA_MODIFICA != null) {
			curriculumVitaeCacheModel.CV_FECHA_MODIFICA = CV_FECHA_MODIFICA.getTime();
		}
		else {
			curriculumVitaeCacheModel.CV_FECHA_MODIFICA = Long.MIN_VALUE;
		}

		return curriculumVitaeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{CV_ID=");
		sb.append(getCV_ID());
		sb.append(", CV_ESTADO=");
		sb.append(getCV_ESTADO());
		sb.append(", CV_ACTIVO=");
		sb.append(getCV_ACTIVO());
		sb.append(", CV_USUARIO_CREA=");
		sb.append(getCV_USUARIO_CREA());
		sb.append(", CV_FECHA_CREA=");
		sb.append(getCV_FECHA_CREA());
		sb.append(", CV_USUARIO_MODIFICA=");
		sb.append(getCV_USUARIO_MODIFICA());
		sb.append(", CV_FECHA_MODIFICA=");
		sb.append(getCV_FECHA_MODIFICA());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.curriculumVitae");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>CV_ID</column-name><column-value><![CDATA[");
		sb.append(getCV_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CV_ESTADO</column-name><column-value><![CDATA[");
		sb.append(getCV_ESTADO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CV_ACTIVO</column-name><column-value><![CDATA[");
		sb.append(getCV_ACTIVO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CV_USUARIO_CREA</column-name><column-value><![CDATA[");
		sb.append(getCV_USUARIO_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CV_FECHA_CREA</column-name><column-value><![CDATA[");
		sb.append(getCV_FECHA_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CV_USUARIO_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getCV_USUARIO_MODIFICA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CV_FECHA_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getCV_FECHA_MODIFICA());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = curriculumVitae.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			curriculumVitae.class
		};
	private long _CV_ID;
	private String _CV_ESTADO;
	private String _CV_ACTIVO;
	private long _CV_USUARIO_CREA;
	private Date _CV_FECHA_CREA;
	private long _CV_USUARIO_MODIFICA;
	private Date _CV_FECHA_MODIFICA;
	private curriculumVitae _escapedModel;
}
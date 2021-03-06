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

import com.rec.hitss.layer.model.Respuesta;
import com.rec.hitss.layer.model.RespuestaModel;
import com.rec.hitss.layer.model.RespuestaSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Respuesta service. Represents a row in the &quot;Respuesta&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rec.hitss.layer.model.RespuestaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RespuestaImpl}.
 * </p>
 *
 * @author Crossfire
 * @see RespuestaImpl
 * @see com.rec.hitss.layer.model.Respuesta
 * @see com.rec.hitss.layer.model.RespuestaModel
 * @generated
 */
@JSON(strict = true)
public class RespuestaModelImpl extends BaseModelImpl<Respuesta>
	implements RespuestaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a respuesta model instance should use the {@link com.rec.hitss.layer.model.Respuesta} interface instead.
	 */
	public static final String TABLE_NAME = "Respuesta";
	public static final Object[][] TABLE_COLUMNS = {
			{ "respuestaId", Types.BIGINT },
			{ "descripcion", Types.VARCHAR },
			{ "correcta", Types.BOOLEAN },
			{ "preguntaId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table Respuesta (respuestaId LONG not null primary key,descripcion VARCHAR(75) null,correcta BOOLEAN,preguntaId LONG)";
	public static final String TABLE_SQL_DROP = "drop table Respuesta";
	public static final String ORDER_BY_JPQL = " ORDER BY respuesta.respuestaId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Respuesta.respuestaId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rec.hitss.layer.model.Respuesta"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rec.hitss.layer.model.Respuesta"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Respuesta toModel(RespuestaSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Respuesta model = new RespuestaImpl();

		model.setRespuestaId(soapModel.getRespuestaId());
		model.setDescripcion(soapModel.getDescripcion());
		model.setCorrecta(soapModel.getCorrecta());
		model.setPreguntaId(soapModel.getPreguntaId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Respuesta> toModels(RespuestaSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Respuesta> models = new ArrayList<Respuesta>(soapModels.length);

		for (RespuestaSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rec.hitss.layer.model.Respuesta"));

	public RespuestaModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _respuestaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRespuestaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _respuestaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Respuesta.class;
	}

	@Override
	public String getModelClassName() {
		return Respuesta.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("respuestaId", getRespuestaId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("correcta", getCorrecta());
		attributes.put("preguntaId", getPreguntaId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long respuestaId = (Long)attributes.get("respuestaId");

		if (respuestaId != null) {
			setRespuestaId(respuestaId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Boolean correcta = (Boolean)attributes.get("correcta");

		if (correcta != null) {
			setCorrecta(correcta);
		}

		Long preguntaId = (Long)attributes.get("preguntaId");

		if (preguntaId != null) {
			setPreguntaId(preguntaId);
		}
	}

	@JSON
	@Override
	public long getRespuestaId() {
		return _respuestaId;
	}

	@Override
	public void setRespuestaId(long respuestaId) {
		_respuestaId = respuestaId;
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
	public boolean getCorrecta() {
		return _correcta;
	}

	@Override
	public boolean isCorrecta() {
		return _correcta;
	}

	@Override
	public void setCorrecta(boolean correcta) {
		_correcta = correcta;
	}

	@JSON
	@Override
	public long getPreguntaId() {
		return _preguntaId;
	}

	@Override
	public void setPreguntaId(long preguntaId) {
		_preguntaId = preguntaId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Respuesta.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Respuesta toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Respuesta)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		RespuestaImpl respuestaImpl = new RespuestaImpl();

		respuestaImpl.setRespuestaId(getRespuestaId());
		respuestaImpl.setDescripcion(getDescripcion());
		respuestaImpl.setCorrecta(getCorrecta());
		respuestaImpl.setPreguntaId(getPreguntaId());

		respuestaImpl.resetOriginalValues();

		return respuestaImpl;
	}

	@Override
	public int compareTo(Respuesta respuesta) {
		long primaryKey = respuesta.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Respuesta)) {
			return false;
		}

		Respuesta respuesta = (Respuesta)obj;

		long primaryKey = respuesta.getPrimaryKey();

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
	public CacheModel<Respuesta> toCacheModel() {
		RespuestaCacheModel respuestaCacheModel = new RespuestaCacheModel();

		respuestaCacheModel.respuestaId = getRespuestaId();

		respuestaCacheModel.descripcion = getDescripcion();

		String descripcion = respuestaCacheModel.descripcion;

		if ((descripcion != null) && (descripcion.length() == 0)) {
			respuestaCacheModel.descripcion = null;
		}

		respuestaCacheModel.correcta = getCorrecta();

		respuestaCacheModel.preguntaId = getPreguntaId();

		return respuestaCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{respuestaId=");
		sb.append(getRespuestaId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", correcta=");
		sb.append(getCorrecta());
		sb.append(", preguntaId=");
		sb.append(getPreguntaId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.Respuesta");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>respuestaId</column-name><column-value><![CDATA[");
		sb.append(getRespuestaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>correcta</column-name><column-value><![CDATA[");
		sb.append(getCorrecta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preguntaId</column-name><column-value><![CDATA[");
		sb.append(getPreguntaId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Respuesta.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Respuesta.class
		};
	private long _respuestaId;
	private String _descripcion;
	private boolean _correcta;
	private long _preguntaId;
	private Respuesta _escapedModel;
}
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

import com.rec.hitss.layer.model.EvaluacionPregunta;
import com.rec.hitss.layer.model.EvaluacionPreguntaModel;
import com.rec.hitss.layer.model.EvaluacionPreguntaSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the EvaluacionPregunta service. Represents a row in the &quot;EvaluacionPregunta&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rec.hitss.layer.model.EvaluacionPreguntaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EvaluacionPreguntaImpl}.
 * </p>
 *
 * @author Crossfire
 * @see EvaluacionPreguntaImpl
 * @see com.rec.hitss.layer.model.EvaluacionPregunta
 * @see com.rec.hitss.layer.model.EvaluacionPreguntaModel
 * @generated
 */
@JSON(strict = true)
public class EvaluacionPreguntaModelImpl extends BaseModelImpl<EvaluacionPregunta>
	implements EvaluacionPreguntaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a evaluacion pregunta model instance should use the {@link com.rec.hitss.layer.model.EvaluacionPregunta} interface instead.
	 */
	public static final String TABLE_NAME = "EvaluacionPregunta";
	public static final Object[][] TABLE_COLUMNS = {
			{ "evaluacionPreguntaId", Types.BIGINT },
			{ "preguntaId", Types.BIGINT },
			{ "evaluacionId", Types.BIGINT },
			{ "descripcion", Types.VARCHAR },
			{ "nivel", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table EvaluacionPregunta (evaluacionPreguntaId LONG not null primary key,preguntaId LONG,evaluacionId LONG,descripcion VARCHAR(75) null,nivel LONG)";
	public static final String TABLE_SQL_DROP = "drop table EvaluacionPregunta";
	public static final String ORDER_BY_JPQL = " ORDER BY evaluacionPregunta.evaluacionPreguntaId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY EvaluacionPregunta.evaluacionPreguntaId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rec.hitss.layer.model.EvaluacionPregunta"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rec.hitss.layer.model.EvaluacionPregunta"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static EvaluacionPregunta toModel(EvaluacionPreguntaSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		EvaluacionPregunta model = new EvaluacionPreguntaImpl();

		model.setEvaluacionPreguntaId(soapModel.getEvaluacionPreguntaId());
		model.setPreguntaId(soapModel.getPreguntaId());
		model.setEvaluacionId(soapModel.getEvaluacionId());
		model.setDescripcion(soapModel.getDescripcion());
		model.setNivel(soapModel.getNivel());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<EvaluacionPregunta> toModels(
		EvaluacionPreguntaSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<EvaluacionPregunta> models = new ArrayList<EvaluacionPregunta>(soapModels.length);

		for (EvaluacionPreguntaSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rec.hitss.layer.model.EvaluacionPregunta"));

	public EvaluacionPreguntaModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _evaluacionPreguntaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEvaluacionPreguntaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _evaluacionPreguntaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return EvaluacionPregunta.class;
	}

	@Override
	public String getModelClassName() {
		return EvaluacionPregunta.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("evaluacionPreguntaId", getEvaluacionPreguntaId());
		attributes.put("preguntaId", getPreguntaId());
		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("nivel", getNivel());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evaluacionPreguntaId = (Long)attributes.get("evaluacionPreguntaId");

		if (evaluacionPreguntaId != null) {
			setEvaluacionPreguntaId(evaluacionPreguntaId);
		}

		Long preguntaId = (Long)attributes.get("preguntaId");

		if (preguntaId != null) {
			setPreguntaId(preguntaId);
		}

		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Long nivel = (Long)attributes.get("nivel");

		if (nivel != null) {
			setNivel(nivel);
		}
	}

	@JSON
	@Override
	public long getEvaluacionPreguntaId() {
		return _evaluacionPreguntaId;
	}

	@Override
	public void setEvaluacionPreguntaId(long evaluacionPreguntaId) {
		_evaluacionPreguntaId = evaluacionPreguntaId;
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

	@JSON
	@Override
	public long getEvaluacionId() {
		return _evaluacionId;
	}

	@Override
	public void setEvaluacionId(long evaluacionId) {
		_evaluacionId = evaluacionId;
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
	public long getNivel() {
		return _nivel;
	}

	@Override
	public void setNivel(long nivel) {
		_nivel = nivel;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			EvaluacionPregunta.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EvaluacionPregunta toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EvaluacionPregunta)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EvaluacionPreguntaImpl evaluacionPreguntaImpl = new EvaluacionPreguntaImpl();

		evaluacionPreguntaImpl.setEvaluacionPreguntaId(getEvaluacionPreguntaId());
		evaluacionPreguntaImpl.setPreguntaId(getPreguntaId());
		evaluacionPreguntaImpl.setEvaluacionId(getEvaluacionId());
		evaluacionPreguntaImpl.setDescripcion(getDescripcion());
		evaluacionPreguntaImpl.setNivel(getNivel());

		evaluacionPreguntaImpl.resetOriginalValues();

		return evaluacionPreguntaImpl;
	}

	@Override
	public int compareTo(EvaluacionPregunta evaluacionPregunta) {
		long primaryKey = evaluacionPregunta.getPrimaryKey();

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

		if (!(obj instanceof EvaluacionPregunta)) {
			return false;
		}

		EvaluacionPregunta evaluacionPregunta = (EvaluacionPregunta)obj;

		long primaryKey = evaluacionPregunta.getPrimaryKey();

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
	public CacheModel<EvaluacionPregunta> toCacheModel() {
		EvaluacionPreguntaCacheModel evaluacionPreguntaCacheModel = new EvaluacionPreguntaCacheModel();

		evaluacionPreguntaCacheModel.evaluacionPreguntaId = getEvaluacionPreguntaId();

		evaluacionPreguntaCacheModel.preguntaId = getPreguntaId();

		evaluacionPreguntaCacheModel.evaluacionId = getEvaluacionId();

		evaluacionPreguntaCacheModel.descripcion = getDescripcion();

		String descripcion = evaluacionPreguntaCacheModel.descripcion;

		if ((descripcion != null) && (descripcion.length() == 0)) {
			evaluacionPreguntaCacheModel.descripcion = null;
		}

		evaluacionPreguntaCacheModel.nivel = getNivel();

		return evaluacionPreguntaCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{evaluacionPreguntaId=");
		sb.append(getEvaluacionPreguntaId());
		sb.append(", preguntaId=");
		sb.append(getPreguntaId());
		sb.append(", evaluacionId=");
		sb.append(getEvaluacionId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", nivel=");
		sb.append(getNivel());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.EvaluacionPregunta");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>evaluacionPreguntaId</column-name><column-value><![CDATA[");
		sb.append(getEvaluacionPreguntaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preguntaId</column-name><column-value><![CDATA[");
		sb.append(getPreguntaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evaluacionId</column-name><column-value><![CDATA[");
		sb.append(getEvaluacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nivel</column-name><column-value><![CDATA[");
		sb.append(getNivel());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = EvaluacionPregunta.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EvaluacionPregunta.class
		};
	private long _evaluacionPreguntaId;
	private long _preguntaId;
	private long _evaluacionId;
	private String _descripcion;
	private long _nivel;
	private EvaluacionPregunta _escapedModel;
}
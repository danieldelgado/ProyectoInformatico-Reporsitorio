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

import com.rec.hitss.layer.model.CriteriosEvaluacion;
import com.rec.hitss.layer.model.CriteriosEvaluacionModel;
import com.rec.hitss.layer.model.CriteriosEvaluacionSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CriteriosEvaluacion service. Represents a row in the &quot;CriteriosEvaluacion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rec.hitss.layer.model.CriteriosEvaluacionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CriteriosEvaluacionImpl}.
 * </p>
 *
 * @author Crossfire
 * @see CriteriosEvaluacionImpl
 * @see com.rec.hitss.layer.model.CriteriosEvaluacion
 * @see com.rec.hitss.layer.model.CriteriosEvaluacionModel
 * @generated
 */
@JSON(strict = true)
public class CriteriosEvaluacionModelImpl extends BaseModelImpl<CriteriosEvaluacion>
	implements CriteriosEvaluacionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a criterios evaluacion model instance should use the {@link com.rec.hitss.layer.model.CriteriosEvaluacion} interface instead.
	 */
	public static final String TABLE_NAME = "CriteriosEvaluacion";
	public static final Object[][] TABLE_COLUMNS = {
			{ "criteriosEvaluacionId", Types.BIGINT },
			{ "nombre", Types.VARCHAR },
			{ "nivelCriterio", Types.VARCHAR },
			{ "observacion", Types.VARCHAR },
			{ "parametroPadreId", Types.BIGINT },
			{ "evaluacionId", Types.BIGINT },
			{ "activo", Types.BOOLEAN },
			{ "usuariocrea", Types.BIGINT },
			{ "fechacrea", Types.TIMESTAMP },
			{ "usuariomodifica", Types.BIGINT },
			{ "fechacreamodifica", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table CriteriosEvaluacion (criteriosEvaluacionId LONG not null primary key,nombre VARCHAR(75) null,nivelCriterio VARCHAR(75) null,observacion VARCHAR(75) null,parametroPadreId LONG,evaluacionId LONG,activo BOOLEAN,usuariocrea LONG,fechacrea DATE null,usuariomodifica LONG,fechacreamodifica DATE null)";
	public static final String TABLE_SQL_DROP = "drop table CriteriosEvaluacion";
	public static final String ORDER_BY_JPQL = " ORDER BY criteriosEvaluacion.fechacrea ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CriteriosEvaluacion.fechacrea ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rec.hitss.layer.model.CriteriosEvaluacion"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rec.hitss.layer.model.CriteriosEvaluacion"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CriteriosEvaluacion toModel(CriteriosEvaluacionSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CriteriosEvaluacion model = new CriteriosEvaluacionImpl();

		model.setCriteriosEvaluacionId(soapModel.getCriteriosEvaluacionId());
		model.setNombre(soapModel.getNombre());
		model.setNivelCriterio(soapModel.getNivelCriterio());
		model.setObservacion(soapModel.getObservacion());
		model.setParametroPadreId(soapModel.getParametroPadreId());
		model.setEvaluacionId(soapModel.getEvaluacionId());
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
	public static List<CriteriosEvaluacion> toModels(
		CriteriosEvaluacionSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CriteriosEvaluacion> models = new ArrayList<CriteriosEvaluacion>(soapModels.length);

		for (CriteriosEvaluacionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rec.hitss.layer.model.CriteriosEvaluacion"));

	public CriteriosEvaluacionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _criteriosEvaluacionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCriteriosEvaluacionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _criteriosEvaluacionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CriteriosEvaluacion.class;
	}

	@Override
	public String getModelClassName() {
		return CriteriosEvaluacion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("criteriosEvaluacionId", getCriteriosEvaluacionId());
		attributes.put("nombre", getNombre());
		attributes.put("nivelCriterio", getNivelCriterio());
		attributes.put("observacion", getObservacion());
		attributes.put("parametroPadreId", getParametroPadreId());
		attributes.put("evaluacionId", getEvaluacionId());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long criteriosEvaluacionId = (Long)attributes.get(
				"criteriosEvaluacionId");

		if (criteriosEvaluacionId != null) {
			setCriteriosEvaluacionId(criteriosEvaluacionId);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String nivelCriterio = (String)attributes.get("nivelCriterio");

		if (nivelCriterio != null) {
			setNivelCriterio(nivelCriterio);
		}

		String observacion = (String)attributes.get("observacion");

		if (observacion != null) {
			setObservacion(observacion);
		}

		Long parametroPadreId = (Long)attributes.get("parametroPadreId");

		if (parametroPadreId != null) {
			setParametroPadreId(parametroPadreId);
		}

		Long evaluacionId = (Long)attributes.get("evaluacionId");

		if (evaluacionId != null) {
			setEvaluacionId(evaluacionId);
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
	public long getCriteriosEvaluacionId() {
		return _criteriosEvaluacionId;
	}

	@Override
	public void setCriteriosEvaluacionId(long criteriosEvaluacionId) {
		_criteriosEvaluacionId = criteriosEvaluacionId;
	}

	@JSON
	@Override
	public String getNombre() {
		if (_nombre == null) {
			return StringPool.BLANK;
		}
		else {
			return _nombre;
		}
	}

	@Override
	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	@JSON
	@Override
	public String getNivelCriterio() {
		if (_nivelCriterio == null) {
			return StringPool.BLANK;
		}
		else {
			return _nivelCriterio;
		}
	}

	@Override
	public void setNivelCriterio(String nivelCriterio) {
		_nivelCriterio = nivelCriterio;
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
	public long getParametroPadreId() {
		return _parametroPadreId;
	}

	@Override
	public void setParametroPadreId(long parametroPadreId) {
		_parametroPadreId = parametroPadreId;
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
			CriteriosEvaluacion.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CriteriosEvaluacion toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CriteriosEvaluacion)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CriteriosEvaluacionImpl criteriosEvaluacionImpl = new CriteriosEvaluacionImpl();

		criteriosEvaluacionImpl.setCriteriosEvaluacionId(getCriteriosEvaluacionId());
		criteriosEvaluacionImpl.setNombre(getNombre());
		criteriosEvaluacionImpl.setNivelCriterio(getNivelCriterio());
		criteriosEvaluacionImpl.setObservacion(getObservacion());
		criteriosEvaluacionImpl.setParametroPadreId(getParametroPadreId());
		criteriosEvaluacionImpl.setEvaluacionId(getEvaluacionId());
		criteriosEvaluacionImpl.setActivo(getActivo());
		criteriosEvaluacionImpl.setUsuariocrea(getUsuariocrea());
		criteriosEvaluacionImpl.setFechacrea(getFechacrea());
		criteriosEvaluacionImpl.setUsuariomodifica(getUsuariomodifica());
		criteriosEvaluacionImpl.setFechacreamodifica(getFechacreamodifica());

		criteriosEvaluacionImpl.resetOriginalValues();

		return criteriosEvaluacionImpl;
	}

	@Override
	public int compareTo(CriteriosEvaluacion criteriosEvaluacion) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(),
				criteriosEvaluacion.getFechacrea());

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

		if (!(obj instanceof CriteriosEvaluacion)) {
			return false;
		}

		CriteriosEvaluacion criteriosEvaluacion = (CriteriosEvaluacion)obj;

		long primaryKey = criteriosEvaluacion.getPrimaryKey();

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
	public CacheModel<CriteriosEvaluacion> toCacheModel() {
		CriteriosEvaluacionCacheModel criteriosEvaluacionCacheModel = new CriteriosEvaluacionCacheModel();

		criteriosEvaluacionCacheModel.criteriosEvaluacionId = getCriteriosEvaluacionId();

		criteriosEvaluacionCacheModel.nombre = getNombre();

		String nombre = criteriosEvaluacionCacheModel.nombre;

		if ((nombre != null) && (nombre.length() == 0)) {
			criteriosEvaluacionCacheModel.nombre = null;
		}

		criteriosEvaluacionCacheModel.nivelCriterio = getNivelCriterio();

		String nivelCriterio = criteriosEvaluacionCacheModel.nivelCriterio;

		if ((nivelCriterio != null) && (nivelCriterio.length() == 0)) {
			criteriosEvaluacionCacheModel.nivelCriterio = null;
		}

		criteriosEvaluacionCacheModel.observacion = getObservacion();

		String observacion = criteriosEvaluacionCacheModel.observacion;

		if ((observacion != null) && (observacion.length() == 0)) {
			criteriosEvaluacionCacheModel.observacion = null;
		}

		criteriosEvaluacionCacheModel.parametroPadreId = getParametroPadreId();

		criteriosEvaluacionCacheModel.evaluacionId = getEvaluacionId();

		criteriosEvaluacionCacheModel.activo = getActivo();

		criteriosEvaluacionCacheModel.usuariocrea = getUsuariocrea();

		Date fechacrea = getFechacrea();

		if (fechacrea != null) {
			criteriosEvaluacionCacheModel.fechacrea = fechacrea.getTime();
		}
		else {
			criteriosEvaluacionCacheModel.fechacrea = Long.MIN_VALUE;
		}

		criteriosEvaluacionCacheModel.usuariomodifica = getUsuariomodifica();

		Date fechacreamodifica = getFechacreamodifica();

		if (fechacreamodifica != null) {
			criteriosEvaluacionCacheModel.fechacreamodifica = fechacreamodifica.getTime();
		}
		else {
			criteriosEvaluacionCacheModel.fechacreamodifica = Long.MIN_VALUE;
		}

		return criteriosEvaluacionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{criteriosEvaluacionId=");
		sb.append(getCriteriosEvaluacionId());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", nivelCriterio=");
		sb.append(getNivelCriterio());
		sb.append(", observacion=");
		sb.append(getObservacion());
		sb.append(", parametroPadreId=");
		sb.append(getParametroPadreId());
		sb.append(", evaluacionId=");
		sb.append(getEvaluacionId());
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
		sb.append("com.rec.hitss.layer.model.CriteriosEvaluacion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>criteriosEvaluacionId</column-name><column-value><![CDATA[");
		sb.append(getCriteriosEvaluacionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nivelCriterio</column-name><column-value><![CDATA[");
		sb.append(getNivelCriterio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>observacion</column-name><column-value><![CDATA[");
		sb.append(getObservacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parametroPadreId</column-name><column-value><![CDATA[");
		sb.append(getParametroPadreId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evaluacionId</column-name><column-value><![CDATA[");
		sb.append(getEvaluacionId());
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

	private static ClassLoader _classLoader = CriteriosEvaluacion.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CriteriosEvaluacion.class
		};
	private long _criteriosEvaluacionId;
	private String _nombre;
	private String _nivelCriterio;
	private String _observacion;
	private long _parametroPadreId;
	private long _evaluacionId;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private CriteriosEvaluacion _escapedModel;
}
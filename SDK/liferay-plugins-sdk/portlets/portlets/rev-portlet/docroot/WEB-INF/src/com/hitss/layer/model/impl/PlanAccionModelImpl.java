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

import com.hitss.layer.model.PlanAccion;
import com.hitss.layer.model.PlanAccionModel;
import com.hitss.layer.model.PlanAccionSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
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
 * The base model implementation for the PlanAccion service. Represents a row in the &quot;PlanAccion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hitss.layer.model.PlanAccionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PlanAccionImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see PlanAccionImpl
 * @see com.hitss.layer.model.PlanAccion
 * @see com.hitss.layer.model.PlanAccionModel
 * @generated
 */
@JSON(strict = true)
public class PlanAccionModelImpl extends BaseModelImpl<PlanAccion>
	implements PlanAccionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a plan accion model instance should use the {@link com.hitss.layer.model.PlanAccion} interface instead.
	 */
	public static final String TABLE_NAME = "PlanAccion";
	public static final Object[][] TABLE_COLUMNS = {
			{ "planAccionId", Types.BIGINT },
			{ "cronogramaId", Types.BIGINT },
			{ "responsable", Types.BIGINT },
			{ "fechaProgramada", Types.TIMESTAMP },
			{ "aprobadorColaborador", Types.BOOLEAN },
			{ "aprobadorLider", Types.BOOLEAN },
			{ "jerarquiaEvaluar", Types.BIGINT },
			{ "activo", Types.BOOLEAN },
			{ "usuariocrea", Types.BIGINT },
			{ "fechacrea", Types.TIMESTAMP },
			{ "usuariomodifica", Types.BIGINT },
			{ "fechacreamodifica", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table PlanAccion (planAccionId LONG not null primary key,cronogramaId LONG,responsable LONG,fechaProgramada DATE null,aprobadorColaborador BOOLEAN,aprobadorLider BOOLEAN,jerarquiaEvaluar LONG,activo BOOLEAN,usuariocrea LONG,fechacrea DATE null,usuariomodifica LONG,fechacreamodifica DATE null)";
	public static final String TABLE_SQL_DROP = "drop table PlanAccion";
	public static final String ORDER_BY_JPQL = " ORDER BY planAccion.fechacreamodifica ASC";
	public static final String ORDER_BY_SQL = " ORDER BY PlanAccion.fechacreamodifica ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hitss.layer.model.PlanAccion"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hitss.layer.model.PlanAccion"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static PlanAccion toModel(PlanAccionSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		PlanAccion model = new PlanAccionImpl();

		model.setPlanAccionId(soapModel.getPlanAccionId());
		model.setCronogramaId(soapModel.getCronogramaId());
		model.setResponsable(soapModel.getResponsable());
		model.setFechaProgramada(soapModel.getFechaProgramada());
		model.setAprobadorColaborador(soapModel.getAprobadorColaborador());
		model.setAprobadorLider(soapModel.getAprobadorLider());
		model.setJerarquiaEvaluar(soapModel.getJerarquiaEvaluar());
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
	public static List<PlanAccion> toModels(PlanAccionSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<PlanAccion> models = new ArrayList<PlanAccion>(soapModels.length);

		for (PlanAccionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hitss.layer.model.PlanAccion"));

	public PlanAccionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _planAccionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPlanAccionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _planAccionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return PlanAccion.class;
	}

	@Override
	public String getModelClassName() {
		return PlanAccion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("planAccionId", getPlanAccionId());
		attributes.put("cronogramaId", getCronogramaId());
		attributes.put("responsable", getResponsable());
		attributes.put("fechaProgramada", getFechaProgramada());
		attributes.put("aprobadorColaborador", getAprobadorColaborador());
		attributes.put("aprobadorLider", getAprobadorLider());
		attributes.put("jerarquiaEvaluar", getJerarquiaEvaluar());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long planAccionId = (Long)attributes.get("planAccionId");

		if (planAccionId != null) {
			setPlanAccionId(planAccionId);
		}

		Long cronogramaId = (Long)attributes.get("cronogramaId");

		if (cronogramaId != null) {
			setCronogramaId(cronogramaId);
		}

		Long responsable = (Long)attributes.get("responsable");

		if (responsable != null) {
			setResponsable(responsable);
		}

		Date fechaProgramada = (Date)attributes.get("fechaProgramada");

		if (fechaProgramada != null) {
			setFechaProgramada(fechaProgramada);
		}

		Boolean aprobadorColaborador = (Boolean)attributes.get(
				"aprobadorColaborador");

		if (aprobadorColaborador != null) {
			setAprobadorColaborador(aprobadorColaborador);
		}

		Boolean aprobadorLider = (Boolean)attributes.get("aprobadorLider");

		if (aprobadorLider != null) {
			setAprobadorLider(aprobadorLider);
		}

		Long jerarquiaEvaluar = (Long)attributes.get("jerarquiaEvaluar");

		if (jerarquiaEvaluar != null) {
			setJerarquiaEvaluar(jerarquiaEvaluar);
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
	public long getPlanAccionId() {
		return _planAccionId;
	}

	@Override
	public void setPlanAccionId(long planAccionId) {
		_planAccionId = planAccionId;
	}

	@JSON
	@Override
	public long getCronogramaId() {
		return _cronogramaId;
	}

	@Override
	public void setCronogramaId(long cronogramaId) {
		_cronogramaId = cronogramaId;
	}

	@JSON
	@Override
	public long getResponsable() {
		return _responsable;
	}

	@Override
	public void setResponsable(long responsable) {
		_responsable = responsable;
	}

	@JSON
	@Override
	public Date getFechaProgramada() {
		return _fechaProgramada;
	}

	@Override
	public void setFechaProgramada(Date fechaProgramada) {
		_fechaProgramada = fechaProgramada;
	}

	@JSON
	@Override
	public boolean getAprobadorColaborador() {
		return _aprobadorColaborador;
	}

	@Override
	public boolean isAprobadorColaborador() {
		return _aprobadorColaborador;
	}

	@Override
	public void setAprobadorColaborador(boolean aprobadorColaborador) {
		_aprobadorColaborador = aprobadorColaborador;
	}

	@JSON
	@Override
	public boolean getAprobadorLider() {
		return _aprobadorLider;
	}

	@Override
	public boolean isAprobadorLider() {
		return _aprobadorLider;
	}

	@Override
	public void setAprobadorLider(boolean aprobadorLider) {
		_aprobadorLider = aprobadorLider;
	}

	@JSON
	@Override
	public long getJerarquiaEvaluar() {
		return _jerarquiaEvaluar;
	}

	@Override
	public void setJerarquiaEvaluar(long jerarquiaEvaluar) {
		_jerarquiaEvaluar = jerarquiaEvaluar;
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
			PlanAccion.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public PlanAccion toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (PlanAccion)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PlanAccionImpl planAccionImpl = new PlanAccionImpl();

		planAccionImpl.setPlanAccionId(getPlanAccionId());
		planAccionImpl.setCronogramaId(getCronogramaId());
		planAccionImpl.setResponsable(getResponsable());
		planAccionImpl.setFechaProgramada(getFechaProgramada());
		planAccionImpl.setAprobadorColaborador(getAprobadorColaborador());
		planAccionImpl.setAprobadorLider(getAprobadorLider());
		planAccionImpl.setJerarquiaEvaluar(getJerarquiaEvaluar());
		planAccionImpl.setActivo(getActivo());
		planAccionImpl.setUsuariocrea(getUsuariocrea());
		planAccionImpl.setFechacrea(getFechacrea());
		planAccionImpl.setUsuariomodifica(getUsuariomodifica());
		planAccionImpl.setFechacreamodifica(getFechacreamodifica());

		planAccionImpl.resetOriginalValues();

		return planAccionImpl;
	}

	@Override
	public int compareTo(PlanAccion planAccion) {
		int value = 0;

		value = DateUtil.compareTo(getFechacreamodifica(),
				planAccion.getFechacreamodifica());

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

		if (!(obj instanceof PlanAccion)) {
			return false;
		}

		PlanAccion planAccion = (PlanAccion)obj;

		long primaryKey = planAccion.getPrimaryKey();

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
	public CacheModel<PlanAccion> toCacheModel() {
		PlanAccionCacheModel planAccionCacheModel = new PlanAccionCacheModel();

		planAccionCacheModel.planAccionId = getPlanAccionId();

		planAccionCacheModel.cronogramaId = getCronogramaId();

		planAccionCacheModel.responsable = getResponsable();

		Date fechaProgramada = getFechaProgramada();

		if (fechaProgramada != null) {
			planAccionCacheModel.fechaProgramada = fechaProgramada.getTime();
		}
		else {
			planAccionCacheModel.fechaProgramada = Long.MIN_VALUE;
		}

		planAccionCacheModel.aprobadorColaborador = getAprobadorColaborador();

		planAccionCacheModel.aprobadorLider = getAprobadorLider();

		planAccionCacheModel.jerarquiaEvaluar = getJerarquiaEvaluar();

		planAccionCacheModel.activo = getActivo();

		planAccionCacheModel.usuariocrea = getUsuariocrea();

		Date fechacrea = getFechacrea();

		if (fechacrea != null) {
			planAccionCacheModel.fechacrea = fechacrea.getTime();
		}
		else {
			planAccionCacheModel.fechacrea = Long.MIN_VALUE;
		}

		planAccionCacheModel.usuariomodifica = getUsuariomodifica();

		Date fechacreamodifica = getFechacreamodifica();

		if (fechacreamodifica != null) {
			planAccionCacheModel.fechacreamodifica = fechacreamodifica.getTime();
		}
		else {
			planAccionCacheModel.fechacreamodifica = Long.MIN_VALUE;
		}

		return planAccionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{planAccionId=");
		sb.append(getPlanAccionId());
		sb.append(", cronogramaId=");
		sb.append(getCronogramaId());
		sb.append(", responsable=");
		sb.append(getResponsable());
		sb.append(", fechaProgramada=");
		sb.append(getFechaProgramada());
		sb.append(", aprobadorColaborador=");
		sb.append(getAprobadorColaborador());
		sb.append(", aprobadorLider=");
		sb.append(getAprobadorLider());
		sb.append(", jerarquiaEvaluar=");
		sb.append(getJerarquiaEvaluar());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.PlanAccion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>planAccionId</column-name><column-value><![CDATA[");
		sb.append(getPlanAccionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cronogramaId</column-name><column-value><![CDATA[");
		sb.append(getCronogramaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responsable</column-name><column-value><![CDATA[");
		sb.append(getResponsable());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaProgramada</column-name><column-value><![CDATA[");
		sb.append(getFechaProgramada());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>aprobadorColaborador</column-name><column-value><![CDATA[");
		sb.append(getAprobadorColaborador());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>aprobadorLider</column-name><column-value><![CDATA[");
		sb.append(getAprobadorLider());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jerarquiaEvaluar</column-name><column-value><![CDATA[");
		sb.append(getJerarquiaEvaluar());
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

	private static ClassLoader _classLoader = PlanAccion.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			PlanAccion.class
		};
	private long _planAccionId;
	private long _cronogramaId;
	private long _responsable;
	private Date _fechaProgramada;
	private boolean _aprobadorColaborador;
	private boolean _aprobadorLider;
	private long _jerarquiaEvaluar;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private PlanAccion _escapedModel;
}
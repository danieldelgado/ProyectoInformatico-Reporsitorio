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

import com.hitss.layer.model.RegistrarActividadPlanUsuario;
import com.hitss.layer.model.RegistrarActividadPlanUsuarioModel;
import com.hitss.layer.model.RegistrarActividadPlanUsuarioSoap;
import com.hitss.layer.service.persistence.RegistrarActividadPlanUsuarioPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the RegistrarActividadPlanUsuario service. Represents a row in the &quot;RegisitrarActividadPlanUsuario&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hitss.layer.model.RegistrarActividadPlanUsuarioModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RegistrarActividadPlanUsuarioImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see RegistrarActividadPlanUsuarioImpl
 * @see com.hitss.layer.model.RegistrarActividadPlanUsuario
 * @see com.hitss.layer.model.RegistrarActividadPlanUsuarioModel
 * @generated
 */
@JSON(strict = true)
public class RegistrarActividadPlanUsuarioModelImpl extends BaseModelImpl<RegistrarActividadPlanUsuario>
	implements RegistrarActividadPlanUsuarioModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a registrar actividad plan usuario model instance should use the {@link com.hitss.layer.model.RegistrarActividadPlanUsuario} interface instead.
	 */
	public static final String TABLE_NAME = "RegisitrarActividadPlanUsuario";
	public static final Object[][] TABLE_COLUMNS = {
			{ "actividadPlanId", Types.BIGINT },
			{ "regisitrarActividadPlanUsuariocoId", Types.BIGINT },
			{ "usuarioId", Types.BIGINT },
			{ "cumplio", Types.BIGINT },
			{ "actividad", Types.VARCHAR },
			{ "activo", Types.BOOLEAN },
			{ "usuariocrea", Types.BIGINT },
			{ "fechacrea", Types.TIMESTAMP },
			{ "usuariomodifica", Types.BIGINT },
			{ "fechamodifica", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table RegisitrarActividadPlanUsuario (actividadPlanId LONG not null,regisitrarActividadPlanUsuariocoId LONG not null,usuarioId LONG,cumplio LONG,actividad VARCHAR(75) null,activo BOOLEAN,usuariocrea LONG,fechacrea DATE null,usuariomodifica LONG,fechamodifica DATE null,primary key (actividadPlanId, regisitrarActividadPlanUsuariocoId))";
	public static final String TABLE_SQL_DROP = "drop table RegisitrarActividadPlanUsuario";
	public static final String ORDER_BY_JPQL = " ORDER BY registrarActividadPlanUsuario.fechamodifica ASC";
	public static final String ORDER_BY_SQL = " ORDER BY RegisitrarActividadPlanUsuario.fechamodifica ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hitss.layer.model.RegistrarActividadPlanUsuario"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hitss.layer.model.RegistrarActividadPlanUsuario"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static RegistrarActividadPlanUsuario toModel(
		RegistrarActividadPlanUsuarioSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		RegistrarActividadPlanUsuario model = new RegistrarActividadPlanUsuarioImpl();

		model.setActividadPlanId(soapModel.getActividadPlanId());
		model.setRegisitrarActividadPlanUsuariocoId(soapModel.getRegisitrarActividadPlanUsuariocoId());
		model.setUsuarioId(soapModel.getUsuarioId());
		model.setCumplio(soapModel.getCumplio());
		model.setActividad(soapModel.getActividad());
		model.setActivo(soapModel.getActivo());
		model.setUsuariocrea(soapModel.getUsuariocrea());
		model.setFechacrea(soapModel.getFechacrea());
		model.setUsuariomodifica(soapModel.getUsuariomodifica());
		model.setFechamodifica(soapModel.getFechamodifica());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<RegistrarActividadPlanUsuario> toModels(
		RegistrarActividadPlanUsuarioSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<RegistrarActividadPlanUsuario> models = new ArrayList<RegistrarActividadPlanUsuario>(soapModels.length);

		for (RegistrarActividadPlanUsuarioSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hitss.layer.model.RegistrarActividadPlanUsuario"));

	public RegistrarActividadPlanUsuarioModelImpl() {
	}

	@Override
	public RegistrarActividadPlanUsuarioPK getPrimaryKey() {
		return new RegistrarActividadPlanUsuarioPK(_actividadPlanId,
			_regisitrarActividadPlanUsuariocoId);
	}

	@Override
	public void setPrimaryKey(RegistrarActividadPlanUsuarioPK primaryKey) {
		setActividadPlanId(primaryKey.actividadPlanId);
		setRegisitrarActividadPlanUsuariocoId(primaryKey.regisitrarActividadPlanUsuariocoId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new RegistrarActividadPlanUsuarioPK(_actividadPlanId,
			_regisitrarActividadPlanUsuariocoId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((RegistrarActividadPlanUsuarioPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return RegistrarActividadPlanUsuario.class;
	}

	@Override
	public String getModelClassName() {
		return RegistrarActividadPlanUsuario.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("actividadPlanId", getActividadPlanId());
		attributes.put("regisitrarActividadPlanUsuariocoId",
			getRegisitrarActividadPlanUsuariocoId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("cumplio", getCumplio());
		attributes.put("actividad", getActividad());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long actividadPlanId = (Long)attributes.get("actividadPlanId");

		if (actividadPlanId != null) {
			setActividadPlanId(actividadPlanId);
		}

		Long regisitrarActividadPlanUsuariocoId = (Long)attributes.get(
				"regisitrarActividadPlanUsuariocoId");

		if (regisitrarActividadPlanUsuariocoId != null) {
			setRegisitrarActividadPlanUsuariocoId(regisitrarActividadPlanUsuariocoId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		Long cumplio = (Long)attributes.get("cumplio");

		if (cumplio != null) {
			setCumplio(cumplio);
		}

		String actividad = (String)attributes.get("actividad");

		if (actividad != null) {
			setActividad(actividad);
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

		Date fechamodifica = (Date)attributes.get("fechamodifica");

		if (fechamodifica != null) {
			setFechamodifica(fechamodifica);
		}
	}

	@JSON
	@Override
	public long getActividadPlanId() {
		return _actividadPlanId;
	}

	@Override
	public void setActividadPlanId(long actividadPlanId) {
		_actividadPlanId = actividadPlanId;
	}

	@JSON
	@Override
	public long getRegisitrarActividadPlanUsuariocoId() {
		return _regisitrarActividadPlanUsuariocoId;
	}

	@Override
	public void setRegisitrarActividadPlanUsuariocoId(
		long regisitrarActividadPlanUsuariocoId) {
		_regisitrarActividadPlanUsuariocoId = regisitrarActividadPlanUsuariocoId;
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
	public long getCumplio() {
		return _cumplio;
	}

	@Override
	public void setCumplio(long cumplio) {
		_cumplio = cumplio;
	}

	@JSON
	@Override
	public String getActividad() {
		if (_actividad == null) {
			return StringPool.BLANK;
		}
		else {
			return _actividad;
		}
	}

	@Override
	public void setActividad(String actividad) {
		_actividad = actividad;
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
	public Date getFechamodifica() {
		return _fechamodifica;
	}

	@Override
	public void setFechamodifica(Date fechamodifica) {
		_fechamodifica = fechamodifica;
	}

	@Override
	public RegistrarActividadPlanUsuario toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (RegistrarActividadPlanUsuario)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		RegistrarActividadPlanUsuarioImpl registrarActividadPlanUsuarioImpl = new RegistrarActividadPlanUsuarioImpl();

		registrarActividadPlanUsuarioImpl.setActividadPlanId(getActividadPlanId());
		registrarActividadPlanUsuarioImpl.setRegisitrarActividadPlanUsuariocoId(getRegisitrarActividadPlanUsuariocoId());
		registrarActividadPlanUsuarioImpl.setUsuarioId(getUsuarioId());
		registrarActividadPlanUsuarioImpl.setCumplio(getCumplio());
		registrarActividadPlanUsuarioImpl.setActividad(getActividad());
		registrarActividadPlanUsuarioImpl.setActivo(getActivo());
		registrarActividadPlanUsuarioImpl.setUsuariocrea(getUsuariocrea());
		registrarActividadPlanUsuarioImpl.setFechacrea(getFechacrea());
		registrarActividadPlanUsuarioImpl.setUsuariomodifica(getUsuariomodifica());
		registrarActividadPlanUsuarioImpl.setFechamodifica(getFechamodifica());

		registrarActividadPlanUsuarioImpl.resetOriginalValues();

		return registrarActividadPlanUsuarioImpl;
	}

	@Override
	public int compareTo(
		RegistrarActividadPlanUsuario registrarActividadPlanUsuario) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				registrarActividadPlanUsuario.getFechamodifica());

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

		if (!(obj instanceof RegistrarActividadPlanUsuario)) {
			return false;
		}

		RegistrarActividadPlanUsuario registrarActividadPlanUsuario = (RegistrarActividadPlanUsuario)obj;

		RegistrarActividadPlanUsuarioPK primaryKey = registrarActividadPlanUsuario.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<RegistrarActividadPlanUsuario> toCacheModel() {
		RegistrarActividadPlanUsuarioCacheModel registrarActividadPlanUsuarioCacheModel =
			new RegistrarActividadPlanUsuarioCacheModel();

		registrarActividadPlanUsuarioCacheModel.actividadPlanId = getActividadPlanId();

		registrarActividadPlanUsuarioCacheModel.regisitrarActividadPlanUsuariocoId = getRegisitrarActividadPlanUsuariocoId();

		registrarActividadPlanUsuarioCacheModel.usuarioId = getUsuarioId();

		registrarActividadPlanUsuarioCacheModel.cumplio = getCumplio();

		registrarActividadPlanUsuarioCacheModel.actividad = getActividad();

		String actividad = registrarActividadPlanUsuarioCacheModel.actividad;

		if ((actividad != null) && (actividad.length() == 0)) {
			registrarActividadPlanUsuarioCacheModel.actividad = null;
		}

		registrarActividadPlanUsuarioCacheModel.activo = getActivo();

		registrarActividadPlanUsuarioCacheModel.usuariocrea = getUsuariocrea();

		Date fechacrea = getFechacrea();

		if (fechacrea != null) {
			registrarActividadPlanUsuarioCacheModel.fechacrea = fechacrea.getTime();
		}
		else {
			registrarActividadPlanUsuarioCacheModel.fechacrea = Long.MIN_VALUE;
		}

		registrarActividadPlanUsuarioCacheModel.usuariomodifica = getUsuariomodifica();

		Date fechamodifica = getFechamodifica();

		if (fechamodifica != null) {
			registrarActividadPlanUsuarioCacheModel.fechamodifica = fechamodifica.getTime();
		}
		else {
			registrarActividadPlanUsuarioCacheModel.fechamodifica = Long.MIN_VALUE;
		}

		return registrarActividadPlanUsuarioCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{actividadPlanId=");
		sb.append(getActividadPlanId());
		sb.append(", regisitrarActividadPlanUsuariocoId=");
		sb.append(getRegisitrarActividadPlanUsuariocoId());
		sb.append(", usuarioId=");
		sb.append(getUsuarioId());
		sb.append(", cumplio=");
		sb.append(getCumplio());
		sb.append(", actividad=");
		sb.append(getActividad());
		sb.append(", activo=");
		sb.append(getActivo());
		sb.append(", usuariocrea=");
		sb.append(getUsuariocrea());
		sb.append(", fechacrea=");
		sb.append(getFechacrea());
		sb.append(", usuariomodifica=");
		sb.append(getUsuariomodifica());
		sb.append(", fechamodifica=");
		sb.append(getFechamodifica());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.RegistrarActividadPlanUsuario");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>actividadPlanId</column-name><column-value><![CDATA[");
		sb.append(getActividadPlanId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>regisitrarActividadPlanUsuariocoId</column-name><column-value><![CDATA[");
		sb.append(getRegisitrarActividadPlanUsuariocoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cumplio</column-name><column-value><![CDATA[");
		sb.append(getCumplio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actividad</column-name><column-value><![CDATA[");
		sb.append(getActividad());
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
			"<column><column-name>fechamodifica</column-name><column-value><![CDATA[");
		sb.append(getFechamodifica());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = RegistrarActividadPlanUsuario.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			RegistrarActividadPlanUsuario.class
		};
	private long _actividadPlanId;
	private long _regisitrarActividadPlanUsuariocoId;
	private long _usuarioId;
	private long _cumplio;
	private String _actividad;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private RegistrarActividadPlanUsuario _escapedModel;
}
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

import com.hitss.layer.model.Experiencia;
import com.hitss.layer.model.ExperienciaModel;
import com.hitss.layer.model.ExperienciaSoap;

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
 * The base model implementation for the Experiencia service. Represents a row in the &quot;Experiencia&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hitss.layer.model.ExperienciaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ExperienciaImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see ExperienciaImpl
 * @see com.hitss.layer.model.Experiencia
 * @see com.hitss.layer.model.ExperienciaModel
 * @generated
 */
@JSON(strict = true)
public class ExperienciaModelImpl extends BaseModelImpl<Experiencia>
	implements ExperienciaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a experiencia model instance should use the {@link com.hitss.layer.model.Experiencia} interface instead.
	 */
	public static final String TABLE_NAME = "Experiencia";
	public static final Object[][] TABLE_COLUMNS = {
			{ "experienciaId", Types.BIGINT },
			{ "usuarioId", Types.BIGINT },
			{ "descripcion", Types.VARCHAR },
			{ "empresa", Types.VARCHAR },
			{ "proyecto", Types.VARCHAR },
			{ "fechaInicio", Types.TIMESTAMP },
			{ "fechaFin", Types.TIMESTAMP },
			{ "activo", Types.BOOLEAN },
			{ "usuariocrea", Types.BIGINT },
			{ "fechacrea", Types.TIMESTAMP },
			{ "usuariomodifica", Types.BIGINT },
			{ "fechacreamodifica", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Experiencia (experienciaId LONG not null primary key,usuarioId LONG,descripcion VARCHAR(75) null,empresa VARCHAR(75) null,proyecto VARCHAR(75) null,fechaInicio DATE null,fechaFin DATE null,activo BOOLEAN,usuariocrea LONG,fechacrea DATE null,usuariomodifica LONG,fechacreamodifica DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Experiencia";
	public static final String ORDER_BY_JPQL = " ORDER BY experiencia.fechacreamodifica ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Experiencia.fechacreamodifica ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hitss.layer.model.Experiencia"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hitss.layer.model.Experiencia"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Experiencia toModel(ExperienciaSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Experiencia model = new ExperienciaImpl();

		model.setExperienciaId(soapModel.getExperienciaId());
		model.setUsuarioId(soapModel.getUsuarioId());
		model.setDescripcion(soapModel.getDescripcion());
		model.setEmpresa(soapModel.getEmpresa());
		model.setProyecto(soapModel.getProyecto());
		model.setFechaInicio(soapModel.getFechaInicio());
		model.setFechaFin(soapModel.getFechaFin());
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
	public static List<Experiencia> toModels(ExperienciaSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Experiencia> models = new ArrayList<Experiencia>(soapModels.length);

		for (ExperienciaSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hitss.layer.model.Experiencia"));

	public ExperienciaModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _experienciaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setExperienciaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _experienciaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Experiencia.class;
	}

	@Override
	public String getModelClassName() {
		return Experiencia.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("experienciaId", getExperienciaId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("empresa", getEmpresa());
		attributes.put("proyecto", getProyecto());
		attributes.put("fechaInicio", getFechaInicio());
		attributes.put("fechaFin", getFechaFin());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long experienciaId = (Long)attributes.get("experienciaId");

		if (experienciaId != null) {
			setExperienciaId(experienciaId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String empresa = (String)attributes.get("empresa");

		if (empresa != null) {
			setEmpresa(empresa);
		}

		String proyecto = (String)attributes.get("proyecto");

		if (proyecto != null) {
			setProyecto(proyecto);
		}

		Date fechaInicio = (Date)attributes.get("fechaInicio");

		if (fechaInicio != null) {
			setFechaInicio(fechaInicio);
		}

		Date fechaFin = (Date)attributes.get("fechaFin");

		if (fechaFin != null) {
			setFechaFin(fechaFin);
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
	public long getExperienciaId() {
		return _experienciaId;
	}

	@Override
	public void setExperienciaId(long experienciaId) {
		_experienciaId = experienciaId;
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
	public String getEmpresa() {
		if (_empresa == null) {
			return StringPool.BLANK;
		}
		else {
			return _empresa;
		}
	}

	@Override
	public void setEmpresa(String empresa) {
		_empresa = empresa;
	}

	@JSON
	@Override
	public String getProyecto() {
		if (_proyecto == null) {
			return StringPool.BLANK;
		}
		else {
			return _proyecto;
		}
	}

	@Override
	public void setProyecto(String proyecto) {
		_proyecto = proyecto;
	}

	@JSON
	@Override
	public Date getFechaInicio() {
		return _fechaInicio;
	}

	@Override
	public void setFechaInicio(Date fechaInicio) {
		_fechaInicio = fechaInicio;
	}

	@JSON
	@Override
	public Date getFechaFin() {
		return _fechaFin;
	}

	@Override
	public void setFechaFin(Date fechaFin) {
		_fechaFin = fechaFin;
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
			Experiencia.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Experiencia toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Experiencia)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ExperienciaImpl experienciaImpl = new ExperienciaImpl();

		experienciaImpl.setExperienciaId(getExperienciaId());
		experienciaImpl.setUsuarioId(getUsuarioId());
		experienciaImpl.setDescripcion(getDescripcion());
		experienciaImpl.setEmpresa(getEmpresa());
		experienciaImpl.setProyecto(getProyecto());
		experienciaImpl.setFechaInicio(getFechaInicio());
		experienciaImpl.setFechaFin(getFechaFin());
		experienciaImpl.setActivo(getActivo());
		experienciaImpl.setUsuariocrea(getUsuariocrea());
		experienciaImpl.setFechacrea(getFechacrea());
		experienciaImpl.setUsuariomodifica(getUsuariomodifica());
		experienciaImpl.setFechacreamodifica(getFechacreamodifica());

		experienciaImpl.resetOriginalValues();

		return experienciaImpl;
	}

	@Override
	public int compareTo(Experiencia experiencia) {
		int value = 0;

		value = DateUtil.compareTo(getFechacreamodifica(),
				experiencia.getFechacreamodifica());

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

		if (!(obj instanceof Experiencia)) {
			return false;
		}

		Experiencia experiencia = (Experiencia)obj;

		long primaryKey = experiencia.getPrimaryKey();

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
	public CacheModel<Experiencia> toCacheModel() {
		ExperienciaCacheModel experienciaCacheModel = new ExperienciaCacheModel();

		experienciaCacheModel.experienciaId = getExperienciaId();

		experienciaCacheModel.usuarioId = getUsuarioId();

		experienciaCacheModel.descripcion = getDescripcion();

		String descripcion = experienciaCacheModel.descripcion;

		if ((descripcion != null) && (descripcion.length() == 0)) {
			experienciaCacheModel.descripcion = null;
		}

		experienciaCacheModel.empresa = getEmpresa();

		String empresa = experienciaCacheModel.empresa;

		if ((empresa != null) && (empresa.length() == 0)) {
			experienciaCacheModel.empresa = null;
		}

		experienciaCacheModel.proyecto = getProyecto();

		String proyecto = experienciaCacheModel.proyecto;

		if ((proyecto != null) && (proyecto.length() == 0)) {
			experienciaCacheModel.proyecto = null;
		}

		Date fechaInicio = getFechaInicio();

		if (fechaInicio != null) {
			experienciaCacheModel.fechaInicio = fechaInicio.getTime();
		}
		else {
			experienciaCacheModel.fechaInicio = Long.MIN_VALUE;
		}

		Date fechaFin = getFechaFin();

		if (fechaFin != null) {
			experienciaCacheModel.fechaFin = fechaFin.getTime();
		}
		else {
			experienciaCacheModel.fechaFin = Long.MIN_VALUE;
		}

		experienciaCacheModel.activo = getActivo();

		experienciaCacheModel.usuariocrea = getUsuariocrea();

		Date fechacrea = getFechacrea();

		if (fechacrea != null) {
			experienciaCacheModel.fechacrea = fechacrea.getTime();
		}
		else {
			experienciaCacheModel.fechacrea = Long.MIN_VALUE;
		}

		experienciaCacheModel.usuariomodifica = getUsuariomodifica();

		Date fechacreamodifica = getFechacreamodifica();

		if (fechacreamodifica != null) {
			experienciaCacheModel.fechacreamodifica = fechacreamodifica.getTime();
		}
		else {
			experienciaCacheModel.fechacreamodifica = Long.MIN_VALUE;
		}

		return experienciaCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{experienciaId=");
		sb.append(getExperienciaId());
		sb.append(", usuarioId=");
		sb.append(getUsuarioId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", empresa=");
		sb.append(getEmpresa());
		sb.append(", proyecto=");
		sb.append(getProyecto());
		sb.append(", fechaInicio=");
		sb.append(getFechaInicio());
		sb.append(", fechaFin=");
		sb.append(getFechaFin());
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
		sb.append("com.hitss.layer.model.Experiencia");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>experienciaId</column-name><column-value><![CDATA[");
		sb.append(getExperienciaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>empresa</column-name><column-value><![CDATA[");
		sb.append(getEmpresa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>proyecto</column-name><column-value><![CDATA[");
		sb.append(getProyecto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaInicio</column-name><column-value><![CDATA[");
		sb.append(getFechaInicio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaFin</column-name><column-value><![CDATA[");
		sb.append(getFechaFin());
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

	private static ClassLoader _classLoader = Experiencia.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Experiencia.class
		};
	private long _experienciaId;
	private long _usuarioId;
	private String _descripcion;
	private String _empresa;
	private String _proyecto;
	private Date _fechaInicio;
	private Date _fechaFin;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private Experiencia _escapedModel;
}
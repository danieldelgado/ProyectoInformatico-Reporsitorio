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

import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.PostulacionModel;
import com.hitss.layer.model.PostulacionSoap;
import com.hitss.layer.service.persistence.PostulacionPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
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
 * The base model implementation for the Postulacion service. Represents a row in the &quot;Postulacion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hitss.layer.model.PostulacionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PostulacionImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see PostulacionImpl
 * @see com.hitss.layer.model.Postulacion
 * @see com.hitss.layer.model.PostulacionModel
 * @generated
 */
@JSON(strict = true)
public class PostulacionModelImpl extends BaseModelImpl<Postulacion>
	implements PostulacionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a postulacion model instance should use the {@link com.hitss.layer.model.Postulacion} interface instead.
	 */
	public static final String TABLE_NAME = "Postulacion";
	public static final Object[][] TABLE_COLUMNS = {
			{ "solicitudRequerimientoId", Types.BIGINT },
			{ "usuarioId", Types.BIGINT },
			{ "fechaPostulacion", Types.TIMESTAMP },
			{ "estado", Types.BIGINT },
			{ "seleccionado", Types.BOOLEAN },
			{ "faseNoAsistida", Types.BIGINT },
			{ "activo", Types.BOOLEAN },
			{ "usuariocrea", Types.BIGINT },
			{ "fechacrea", Types.TIMESTAMP },
			{ "usuariomodifica", Types.BIGINT },
			{ "fechamodifica", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Postulacion (solicitudRequerimientoId LONG not null,usuarioId LONG not null,fechaPostulacion DATE null,estado LONG,seleccionado BOOLEAN,faseNoAsistida LONG,activo BOOLEAN,usuariocrea LONG,fechacrea DATE null,usuariomodifica LONG,fechamodifica DATE null,primary key (solicitudRequerimientoId, usuarioId))";
	public static final String TABLE_SQL_DROP = "drop table Postulacion";
	public static final String ORDER_BY_JPQL = " ORDER BY postulacion.fechamodifica ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Postulacion.fechamodifica ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hitss.layer.model.Postulacion"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hitss.layer.model.Postulacion"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.hitss.layer.model.Postulacion"),
			true);
	public static long SOLICITUDREQUERIMIENTOID_COLUMN_BITMASK = 1L;
	public static long USUARIOID_COLUMN_BITMASK = 2L;
	public static long FECHAMODIFICA_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Postulacion toModel(PostulacionSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Postulacion model = new PostulacionImpl();

		model.setSolicitudRequerimientoId(soapModel.getSolicitudRequerimientoId());
		model.setUsuarioId(soapModel.getUsuarioId());
		model.setFechaPostulacion(soapModel.getFechaPostulacion());
		model.setEstado(soapModel.getEstado());
		model.setSeleccionado(soapModel.getSeleccionado());
		model.setFaseNoAsistida(soapModel.getFaseNoAsistida());
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
	public static List<Postulacion> toModels(PostulacionSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Postulacion> models = new ArrayList<Postulacion>(soapModels.length);

		for (PostulacionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hitss.layer.model.Postulacion"));

	public PostulacionModelImpl() {
	}

	@Override
	public PostulacionPK getPrimaryKey() {
		return new PostulacionPK(_solicitudRequerimientoId, _usuarioId);
	}

	@Override
	public void setPrimaryKey(PostulacionPK primaryKey) {
		setSolicitudRequerimientoId(primaryKey.solicitudRequerimientoId);
		setUsuarioId(primaryKey.usuarioId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new PostulacionPK(_solicitudRequerimientoId, _usuarioId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((PostulacionPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return Postulacion.class;
	}

	@Override
	public String getModelClassName() {
		return Postulacion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudRequerimientoId", getSolicitudRequerimientoId());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("fechaPostulacion", getFechaPostulacion());
		attributes.put("estado", getEstado());
		attributes.put("seleccionado", getSeleccionado());
		attributes.put("faseNoAsistida", getFaseNoAsistida());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long solicitudRequerimientoId = (Long)attributes.get(
				"solicitudRequerimientoId");

		if (solicitudRequerimientoId != null) {
			setSolicitudRequerimientoId(solicitudRequerimientoId);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		Date fechaPostulacion = (Date)attributes.get("fechaPostulacion");

		if (fechaPostulacion != null) {
			setFechaPostulacion(fechaPostulacion);
		}

		Long estado = (Long)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		Boolean seleccionado = (Boolean)attributes.get("seleccionado");

		if (seleccionado != null) {
			setSeleccionado(seleccionado);
		}

		Long faseNoAsistida = (Long)attributes.get("faseNoAsistida");

		if (faseNoAsistida != null) {
			setFaseNoAsistida(faseNoAsistida);
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
	public long getSolicitudRequerimientoId() {
		return _solicitudRequerimientoId;
	}

	@Override
	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_columnBitmask |= SOLICITUDREQUERIMIENTOID_COLUMN_BITMASK;

		if (!_setOriginalSolicitudRequerimientoId) {
			_setOriginalSolicitudRequerimientoId = true;

			_originalSolicitudRequerimientoId = _solicitudRequerimientoId;
		}

		_solicitudRequerimientoId = solicitudRequerimientoId;
	}

	public long getOriginalSolicitudRequerimientoId() {
		return _originalSolicitudRequerimientoId;
	}

	@JSON
	@Override
	public long getUsuarioId() {
		return _usuarioId;
	}

	@Override
	public void setUsuarioId(long usuarioId) {
		_columnBitmask |= USUARIOID_COLUMN_BITMASK;

		if (!_setOriginalUsuarioId) {
			_setOriginalUsuarioId = true;

			_originalUsuarioId = _usuarioId;
		}

		_usuarioId = usuarioId;
	}

	public long getOriginalUsuarioId() {
		return _originalUsuarioId;
	}

	@JSON
	@Override
	public Date getFechaPostulacion() {
		return _fechaPostulacion;
	}

	@Override
	public void setFechaPostulacion(Date fechaPostulacion) {
		_fechaPostulacion = fechaPostulacion;
	}

	@JSON
	@Override
	public long getEstado() {
		return _estado;
	}

	@Override
	public void setEstado(long estado) {
		_estado = estado;
	}

	@JSON
	@Override
	public boolean getSeleccionado() {
		return _seleccionado;
	}

	@Override
	public boolean isSeleccionado() {
		return _seleccionado;
	}

	@Override
	public void setSeleccionado(boolean seleccionado) {
		_seleccionado = seleccionado;
	}

	@JSON
	@Override
	public long getFaseNoAsistida() {
		return _faseNoAsistida;
	}

	@Override
	public void setFaseNoAsistida(long faseNoAsistida) {
		_faseNoAsistida = faseNoAsistida;
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
		_columnBitmask = -1L;

		_fechamodifica = fechamodifica;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public Postulacion toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Postulacion)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PostulacionImpl postulacionImpl = new PostulacionImpl();

		postulacionImpl.setSolicitudRequerimientoId(getSolicitudRequerimientoId());
		postulacionImpl.setUsuarioId(getUsuarioId());
		postulacionImpl.setFechaPostulacion(getFechaPostulacion());
		postulacionImpl.setEstado(getEstado());
		postulacionImpl.setSeleccionado(getSeleccionado());
		postulacionImpl.setFaseNoAsistida(getFaseNoAsistida());
		postulacionImpl.setActivo(getActivo());
		postulacionImpl.setUsuariocrea(getUsuariocrea());
		postulacionImpl.setFechacrea(getFechacrea());
		postulacionImpl.setUsuariomodifica(getUsuariomodifica());
		postulacionImpl.setFechamodifica(getFechamodifica());

		postulacionImpl.resetOriginalValues();

		return postulacionImpl;
	}

	@Override
	public int compareTo(Postulacion postulacion) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				postulacion.getFechamodifica());

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

		if (!(obj instanceof Postulacion)) {
			return false;
		}

		Postulacion postulacion = (Postulacion)obj;

		PostulacionPK primaryKey = postulacion.getPrimaryKey();

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
		PostulacionModelImpl postulacionModelImpl = this;

		postulacionModelImpl._originalSolicitudRequerimientoId = postulacionModelImpl._solicitudRequerimientoId;

		postulacionModelImpl._setOriginalSolicitudRequerimientoId = false;

		postulacionModelImpl._originalUsuarioId = postulacionModelImpl._usuarioId;

		postulacionModelImpl._setOriginalUsuarioId = false;

		postulacionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Postulacion> toCacheModel() {
		PostulacionCacheModel postulacionCacheModel = new PostulacionCacheModel();

		postulacionCacheModel.solicitudRequerimientoId = getSolicitudRequerimientoId();

		postulacionCacheModel.usuarioId = getUsuarioId();

		Date fechaPostulacion = getFechaPostulacion();

		if (fechaPostulacion != null) {
			postulacionCacheModel.fechaPostulacion = fechaPostulacion.getTime();
		}
		else {
			postulacionCacheModel.fechaPostulacion = Long.MIN_VALUE;
		}

		postulacionCacheModel.estado = getEstado();

		postulacionCacheModel.seleccionado = getSeleccionado();

		postulacionCacheModel.faseNoAsistida = getFaseNoAsistida();

		postulacionCacheModel.activo = getActivo();

		postulacionCacheModel.usuariocrea = getUsuariocrea();

		Date fechacrea = getFechacrea();

		if (fechacrea != null) {
			postulacionCacheModel.fechacrea = fechacrea.getTime();
		}
		else {
			postulacionCacheModel.fechacrea = Long.MIN_VALUE;
		}

		postulacionCacheModel.usuariomodifica = getUsuariomodifica();

		Date fechamodifica = getFechamodifica();

		if (fechamodifica != null) {
			postulacionCacheModel.fechamodifica = fechamodifica.getTime();
		}
		else {
			postulacionCacheModel.fechamodifica = Long.MIN_VALUE;
		}

		return postulacionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{solicitudRequerimientoId=");
		sb.append(getSolicitudRequerimientoId());
		sb.append(", usuarioId=");
		sb.append(getUsuarioId());
		sb.append(", fechaPostulacion=");
		sb.append(getFechaPostulacion());
		sb.append(", estado=");
		sb.append(getEstado());
		sb.append(", seleccionado=");
		sb.append(getSeleccionado());
		sb.append(", faseNoAsistida=");
		sb.append(getFaseNoAsistida());
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
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.Postulacion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>solicitudRequerimientoId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudRequerimientoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaPostulacion</column-name><column-value><![CDATA[");
		sb.append(getFechaPostulacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estado</column-name><column-value><![CDATA[");
		sb.append(getEstado());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>seleccionado</column-name><column-value><![CDATA[");
		sb.append(getSeleccionado());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>faseNoAsistida</column-name><column-value><![CDATA[");
		sb.append(getFaseNoAsistida());
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

	private static ClassLoader _classLoader = Postulacion.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Postulacion.class
		};
	private long _solicitudRequerimientoId;
	private long _originalSolicitudRequerimientoId;
	private boolean _setOriginalSolicitudRequerimientoId;
	private long _usuarioId;
	private long _originalUsuarioId;
	private boolean _setOriginalUsuarioId;
	private Date _fechaPostulacion;
	private long _estado;
	private boolean _seleccionado;
	private long _faseNoAsistida;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private long _columnBitmask;
	private Postulacion _escapedModel;
}
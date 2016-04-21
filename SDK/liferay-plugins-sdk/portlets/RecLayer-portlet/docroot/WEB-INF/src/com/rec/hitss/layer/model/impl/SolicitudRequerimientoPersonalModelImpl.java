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

import com.rec.hitss.layer.model.SolicitudRequerimientoPersonal;
import com.rec.hitss.layer.model.SolicitudRequerimientoPersonalModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the SolicitudRequerimientoPersonal service. Represents a row in the &quot;SolicitudRequerimientoPersonal&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rec.hitss.layer.model.SolicitudRequerimientoPersonalModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SolicitudRequerimientoPersonalImpl}.
 * </p>
 *
 * @author Crossfire
 * @see SolicitudRequerimientoPersonalImpl
 * @see com.rec.hitss.layer.model.SolicitudRequerimientoPersonal
 * @see com.rec.hitss.layer.model.SolicitudRequerimientoPersonalModel
 * @generated
 */
public class SolicitudRequerimientoPersonalModelImpl extends BaseModelImpl<SolicitudRequerimientoPersonal>
	implements SolicitudRequerimientoPersonalModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a solicitud requerimiento personal model instance should use the {@link com.rec.hitss.layer.model.SolicitudRequerimientoPersonal} interface instead.
	 */
	public static final String TABLE_NAME = "SolicitudRequerimientoPersonal";
	public static final Object[][] TABLE_COLUMNS = {
			{ "solicitudRequerimientoPersonalId", Types.BIGINT },
			{ "estado", Types.VARCHAR },
			{ "puesto", Types.VARCHAR },
			{ "areaSolicitante", Types.BIGINT },
			{ "cantidadRecursos", Types.BIGINT },
			{ "fechaLimite", Types.TIMESTAMP },
			{ "cargo", Types.VARCHAR },
			{ "tiempoContrato", Types.BIGINT },
			{ "tipoNegocio", Types.BIGINT },
			{ "presupuestoMaximo", Types.BIGINT },
			{ "presupuestoMinimo", Types.BIGINT },
			{ "cliente", Types.BIGINT },
			{ "activo", Types.BOOLEAN },
			{ "usuariocrea", Types.BIGINT },
			{ "fechacrea", Types.TIMESTAMP },
			{ "usuariomodifica", Types.BIGINT },
			{ "fechacreamodifica", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table SolicitudRequerimientoPersonal (solicitudRequerimientoPersonalId LONG not null primary key,estado VARCHAR(75) null,puesto VARCHAR(75) null,areaSolicitante LONG,cantidadRecursos LONG,fechaLimite DATE null,cargo VARCHAR(75) null,tiempoContrato LONG,tipoNegocio LONG,presupuestoMaximo LONG,presupuestoMinimo LONG,cliente LONG,activo BOOLEAN,usuariocrea LONG,fechacrea DATE null,usuariomodifica LONG,fechacreamodifica DATE null)";
	public static final String TABLE_SQL_DROP = "drop table SolicitudRequerimientoPersonal";
	public static final String ORDER_BY_JPQL = " ORDER BY solicitudRequerimientoPersonal.fechacrea ASC";
	public static final String ORDER_BY_SQL = " ORDER BY SolicitudRequerimientoPersonal.fechacrea ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rec.hitss.layer.model.SolicitudRequerimientoPersonal"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rec.hitss.layer.model.SolicitudRequerimientoPersonal"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rec.hitss.layer.model.SolicitudRequerimientoPersonal"));

	public SolicitudRequerimientoPersonalModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _solicitudRequerimientoPersonalId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSolicitudRequerimientoPersonalId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _solicitudRequerimientoPersonalId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SolicitudRequerimientoPersonal.class;
	}

	@Override
	public String getModelClassName() {
		return SolicitudRequerimientoPersonal.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudRequerimientoPersonalId",
			getSolicitudRequerimientoPersonalId());
		attributes.put("estado", getEstado());
		attributes.put("puesto", getPuesto());
		attributes.put("areaSolicitante", getAreaSolicitante());
		attributes.put("cantidadRecursos", getCantidadRecursos());
		attributes.put("fechaLimite", getFechaLimite());
		attributes.put("cargo", getCargo());
		attributes.put("tiempoContrato", getTiempoContrato());
		attributes.put("tipoNegocio", getTipoNegocio());
		attributes.put("presupuestoMaximo", getPresupuestoMaximo());
		attributes.put("presupuestoMinimo", getPresupuestoMinimo());
		attributes.put("cliente", getCliente());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long solicitudRequerimientoPersonalId = (Long)attributes.get(
				"solicitudRequerimientoPersonalId");

		if (solicitudRequerimientoPersonalId != null) {
			setSolicitudRequerimientoPersonalId(solicitudRequerimientoPersonalId);
		}

		String estado = (String)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		String puesto = (String)attributes.get("puesto");

		if (puesto != null) {
			setPuesto(puesto);
		}

		Long areaSolicitante = (Long)attributes.get("areaSolicitante");

		if (areaSolicitante != null) {
			setAreaSolicitante(areaSolicitante);
		}

		Long cantidadRecursos = (Long)attributes.get("cantidadRecursos");

		if (cantidadRecursos != null) {
			setCantidadRecursos(cantidadRecursos);
		}

		Date fechaLimite = (Date)attributes.get("fechaLimite");

		if (fechaLimite != null) {
			setFechaLimite(fechaLimite);
		}

		String cargo = (String)attributes.get("cargo");

		if (cargo != null) {
			setCargo(cargo);
		}

		Long tiempoContrato = (Long)attributes.get("tiempoContrato");

		if (tiempoContrato != null) {
			setTiempoContrato(tiempoContrato);
		}

		Long tipoNegocio = (Long)attributes.get("tipoNegocio");

		if (tipoNegocio != null) {
			setTipoNegocio(tipoNegocio);
		}

		Long presupuestoMaximo = (Long)attributes.get("presupuestoMaximo");

		if (presupuestoMaximo != null) {
			setPresupuestoMaximo(presupuestoMaximo);
		}

		Long presupuestoMinimo = (Long)attributes.get("presupuestoMinimo");

		if (presupuestoMinimo != null) {
			setPresupuestoMinimo(presupuestoMinimo);
		}

		Long cliente = (Long)attributes.get("cliente");

		if (cliente != null) {
			setCliente(cliente);
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

	@Override
	public long getSolicitudRequerimientoPersonalId() {
		return _solicitudRequerimientoPersonalId;
	}

	@Override
	public void setSolicitudRequerimientoPersonalId(
		long solicitudRequerimientoPersonalId) {
		_solicitudRequerimientoPersonalId = solicitudRequerimientoPersonalId;
	}

	@Override
	public String getEstado() {
		if (_estado == null) {
			return StringPool.BLANK;
		}
		else {
			return _estado;
		}
	}

	@Override
	public void setEstado(String estado) {
		_estado = estado;
	}

	@Override
	public String getPuesto() {
		if (_puesto == null) {
			return StringPool.BLANK;
		}
		else {
			return _puesto;
		}
	}

	@Override
	public void setPuesto(String puesto) {
		_puesto = puesto;
	}

	@Override
	public long getAreaSolicitante() {
		return _areaSolicitante;
	}

	@Override
	public void setAreaSolicitante(long areaSolicitante) {
		_areaSolicitante = areaSolicitante;
	}

	@Override
	public long getCantidadRecursos() {
		return _cantidadRecursos;
	}

	@Override
	public void setCantidadRecursos(long cantidadRecursos) {
		_cantidadRecursos = cantidadRecursos;
	}

	@Override
	public Date getFechaLimite() {
		return _fechaLimite;
	}

	@Override
	public void setFechaLimite(Date fechaLimite) {
		_fechaLimite = fechaLimite;
	}

	@Override
	public String getCargo() {
		if (_cargo == null) {
			return StringPool.BLANK;
		}
		else {
			return _cargo;
		}
	}

	@Override
	public void setCargo(String cargo) {
		_cargo = cargo;
	}

	@Override
	public long getTiempoContrato() {
		return _tiempoContrato;
	}

	@Override
	public void setTiempoContrato(long tiempoContrato) {
		_tiempoContrato = tiempoContrato;
	}

	@Override
	public long getTipoNegocio() {
		return _tipoNegocio;
	}

	@Override
	public void setTipoNegocio(long tipoNegocio) {
		_tipoNegocio = tipoNegocio;
	}

	@Override
	public long getPresupuestoMaximo() {
		return _presupuestoMaximo;
	}

	@Override
	public void setPresupuestoMaximo(long presupuestoMaximo) {
		_presupuestoMaximo = presupuestoMaximo;
	}

	@Override
	public long getPresupuestoMinimo() {
		return _presupuestoMinimo;
	}

	@Override
	public void setPresupuestoMinimo(long presupuestoMinimo) {
		_presupuestoMinimo = presupuestoMinimo;
	}

	@Override
	public long getCliente() {
		return _cliente;
	}

	@Override
	public void setCliente(long cliente) {
		_cliente = cliente;
	}

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

	@Override
	public long getUsuariocrea() {
		return _usuariocrea;
	}

	@Override
	public void setUsuariocrea(long usuariocrea) {
		_usuariocrea = usuariocrea;
	}

	@Override
	public Date getFechacrea() {
		return _fechacrea;
	}

	@Override
	public void setFechacrea(Date fechacrea) {
		_fechacrea = fechacrea;
	}

	@Override
	public long getUsuariomodifica() {
		return _usuariomodifica;
	}

	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_usuariomodifica = usuariomodifica;
	}

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
			SolicitudRequerimientoPersonal.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SolicitudRequerimientoPersonal toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SolicitudRequerimientoPersonal)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SolicitudRequerimientoPersonalImpl solicitudRequerimientoPersonalImpl = new SolicitudRequerimientoPersonalImpl();

		solicitudRequerimientoPersonalImpl.setSolicitudRequerimientoPersonalId(getSolicitudRequerimientoPersonalId());
		solicitudRequerimientoPersonalImpl.setEstado(getEstado());
		solicitudRequerimientoPersonalImpl.setPuesto(getPuesto());
		solicitudRequerimientoPersonalImpl.setAreaSolicitante(getAreaSolicitante());
		solicitudRequerimientoPersonalImpl.setCantidadRecursos(getCantidadRecursos());
		solicitudRequerimientoPersonalImpl.setFechaLimite(getFechaLimite());
		solicitudRequerimientoPersonalImpl.setCargo(getCargo());
		solicitudRequerimientoPersonalImpl.setTiempoContrato(getTiempoContrato());
		solicitudRequerimientoPersonalImpl.setTipoNegocio(getTipoNegocio());
		solicitudRequerimientoPersonalImpl.setPresupuestoMaximo(getPresupuestoMaximo());
		solicitudRequerimientoPersonalImpl.setPresupuestoMinimo(getPresupuestoMinimo());
		solicitudRequerimientoPersonalImpl.setCliente(getCliente());
		solicitudRequerimientoPersonalImpl.setActivo(getActivo());
		solicitudRequerimientoPersonalImpl.setUsuariocrea(getUsuariocrea());
		solicitudRequerimientoPersonalImpl.setFechacrea(getFechacrea());
		solicitudRequerimientoPersonalImpl.setUsuariomodifica(getUsuariomodifica());
		solicitudRequerimientoPersonalImpl.setFechacreamodifica(getFechacreamodifica());

		solicitudRequerimientoPersonalImpl.resetOriginalValues();

		return solicitudRequerimientoPersonalImpl;
	}

	@Override
	public int compareTo(
		SolicitudRequerimientoPersonal solicitudRequerimientoPersonal) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(),
				solicitudRequerimientoPersonal.getFechacrea());

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

		if (!(obj instanceof SolicitudRequerimientoPersonal)) {
			return false;
		}

		SolicitudRequerimientoPersonal solicitudRequerimientoPersonal = (SolicitudRequerimientoPersonal)obj;

		long primaryKey = solicitudRequerimientoPersonal.getPrimaryKey();

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
	public CacheModel<SolicitudRequerimientoPersonal> toCacheModel() {
		SolicitudRequerimientoPersonalCacheModel solicitudRequerimientoPersonalCacheModel =
			new SolicitudRequerimientoPersonalCacheModel();

		solicitudRequerimientoPersonalCacheModel.solicitudRequerimientoPersonalId = getSolicitudRequerimientoPersonalId();

		solicitudRequerimientoPersonalCacheModel.estado = getEstado();

		String estado = solicitudRequerimientoPersonalCacheModel.estado;

		if ((estado != null) && (estado.length() == 0)) {
			solicitudRequerimientoPersonalCacheModel.estado = null;
		}

		solicitudRequerimientoPersonalCacheModel.puesto = getPuesto();

		String puesto = solicitudRequerimientoPersonalCacheModel.puesto;

		if ((puesto != null) && (puesto.length() == 0)) {
			solicitudRequerimientoPersonalCacheModel.puesto = null;
		}

		solicitudRequerimientoPersonalCacheModel.areaSolicitante = getAreaSolicitante();

		solicitudRequerimientoPersonalCacheModel.cantidadRecursos = getCantidadRecursos();

		Date fechaLimite = getFechaLimite();

		if (fechaLimite != null) {
			solicitudRequerimientoPersonalCacheModel.fechaLimite = fechaLimite.getTime();
		}
		else {
			solicitudRequerimientoPersonalCacheModel.fechaLimite = Long.MIN_VALUE;
		}

		solicitudRequerimientoPersonalCacheModel.cargo = getCargo();

		String cargo = solicitudRequerimientoPersonalCacheModel.cargo;

		if ((cargo != null) && (cargo.length() == 0)) {
			solicitudRequerimientoPersonalCacheModel.cargo = null;
		}

		solicitudRequerimientoPersonalCacheModel.tiempoContrato = getTiempoContrato();

		solicitudRequerimientoPersonalCacheModel.tipoNegocio = getTipoNegocio();

		solicitudRequerimientoPersonalCacheModel.presupuestoMaximo = getPresupuestoMaximo();

		solicitudRequerimientoPersonalCacheModel.presupuestoMinimo = getPresupuestoMinimo();

		solicitudRequerimientoPersonalCacheModel.cliente = getCliente();

		solicitudRequerimientoPersonalCacheModel.activo = getActivo();

		solicitudRequerimientoPersonalCacheModel.usuariocrea = getUsuariocrea();

		Date fechacrea = getFechacrea();

		if (fechacrea != null) {
			solicitudRequerimientoPersonalCacheModel.fechacrea = fechacrea.getTime();
		}
		else {
			solicitudRequerimientoPersonalCacheModel.fechacrea = Long.MIN_VALUE;
		}

		solicitudRequerimientoPersonalCacheModel.usuariomodifica = getUsuariomodifica();

		Date fechacreamodifica = getFechacreamodifica();

		if (fechacreamodifica != null) {
			solicitudRequerimientoPersonalCacheModel.fechacreamodifica = fechacreamodifica.getTime();
		}
		else {
			solicitudRequerimientoPersonalCacheModel.fechacreamodifica = Long.MIN_VALUE;
		}

		return solicitudRequerimientoPersonalCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{solicitudRequerimientoPersonalId=");
		sb.append(getSolicitudRequerimientoPersonalId());
		sb.append(", estado=");
		sb.append(getEstado());
		sb.append(", puesto=");
		sb.append(getPuesto());
		sb.append(", areaSolicitante=");
		sb.append(getAreaSolicitante());
		sb.append(", cantidadRecursos=");
		sb.append(getCantidadRecursos());
		sb.append(", fechaLimite=");
		sb.append(getFechaLimite());
		sb.append(", cargo=");
		sb.append(getCargo());
		sb.append(", tiempoContrato=");
		sb.append(getTiempoContrato());
		sb.append(", tipoNegocio=");
		sb.append(getTipoNegocio());
		sb.append(", presupuestoMaximo=");
		sb.append(getPresupuestoMaximo());
		sb.append(", presupuestoMinimo=");
		sb.append(getPresupuestoMinimo());
		sb.append(", cliente=");
		sb.append(getCliente());
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
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.SolicitudRequerimientoPersonal");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>solicitudRequerimientoPersonalId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudRequerimientoPersonalId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estado</column-name><column-value><![CDATA[");
		sb.append(getEstado());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>puesto</column-name><column-value><![CDATA[");
		sb.append(getPuesto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>areaSolicitante</column-name><column-value><![CDATA[");
		sb.append(getAreaSolicitante());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cantidadRecursos</column-name><column-value><![CDATA[");
		sb.append(getCantidadRecursos());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaLimite</column-name><column-value><![CDATA[");
		sb.append(getFechaLimite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cargo</column-name><column-value><![CDATA[");
		sb.append(getCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiempoContrato</column-name><column-value><![CDATA[");
		sb.append(getTiempoContrato());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipoNegocio</column-name><column-value><![CDATA[");
		sb.append(getTipoNegocio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>presupuestoMaximo</column-name><column-value><![CDATA[");
		sb.append(getPresupuestoMaximo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>presupuestoMinimo</column-name><column-value><![CDATA[");
		sb.append(getPresupuestoMinimo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cliente</column-name><column-value><![CDATA[");
		sb.append(getCliente());
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

	private static ClassLoader _classLoader = SolicitudRequerimientoPersonal.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			SolicitudRequerimientoPersonal.class
		};
	private long _solicitudRequerimientoPersonalId;
	private String _estado;
	private String _puesto;
	private long _areaSolicitante;
	private long _cantidadRecursos;
	private Date _fechaLimite;
	private String _cargo;
	private long _tiempoContrato;
	private long _tipoNegocio;
	private long _presupuestoMaximo;
	private long _presupuestoMinimo;
	private long _cliente;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private SolicitudRequerimientoPersonal _escapedModel;
}
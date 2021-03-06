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

import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.model.SolicitudRequerimientoModel;
import com.hitss.layer.model.SolicitudRequerimientoSoap;

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
 * The base model implementation for the SolicitudRequerimiento service. Represents a row in the &quot;SolicitudRequerimiento&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hitss.layer.model.SolicitudRequerimientoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SolicitudRequerimientoImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoImpl
 * @see com.hitss.layer.model.SolicitudRequerimiento
 * @see com.hitss.layer.model.SolicitudRequerimientoModel
 * @generated
 */
@JSON(strict = true)
public class SolicitudRequerimientoModelImpl extends BaseModelImpl<SolicitudRequerimiento>
	implements SolicitudRequerimientoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a solicitud requerimiento model instance should use the {@link com.hitss.layer.model.SolicitudRequerimiento} interface instead.
	 */
	public static final String TABLE_NAME = "SolicitudRequerimiento";
	public static final Object[][] TABLE_COLUMNS = {
			{ "solicitudRequerimientoId", Types.BIGINT },
			{ "areaSolicitante", Types.BIGINT },
			{ "cantidadRecursos", Types.INTEGER },
			{ "responsableRRHH", Types.BIGINT },
			{ "fechaLimite", Types.TIMESTAMP },
			{ "tiempoContrato", Types.BIGINT },
			{ "tipoNegocio", Types.BIGINT },
			{ "presupuestoMaximo", Types.BIGINT },
			{ "presupuestoMinimo", Types.BIGINT },
			{ "cliente", Types.BIGINT },
			{ "especialidad", Types.VARCHAR },
			{ "meta", Types.VARCHAR },
			{ "fechameta", Types.TIMESTAMP },
			{ "prioridad", Types.BIGINT },
			{ "contenidoId", Types.VARCHAR },
			{ "modalidadjornada", Types.BIGINT },
			{ "modalidadcontrato", Types.BIGINT },
			{ "lugarTrabajo", Types.VARCHAR },
			{ "categoriaPuestoId", Types.BIGINT },
			{ "proyecto", Types.VARCHAR },
			{ "tiporeclutamiento", Types.BIGINT },
			{ "estado", Types.BIGINT },
			{ "activo", Types.BOOLEAN },
			{ "usuariocrea", Types.BIGINT },
			{ "fechacrea", Types.TIMESTAMP },
			{ "usuariomodifica", Types.BIGINT },
			{ "fechamodifica", Types.TIMESTAMP },
			{ "cantidadAnnosRubro", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table SolicitudRequerimiento (solicitudRequerimientoId LONG not null primary key,areaSolicitante LONG,cantidadRecursos INTEGER,responsableRRHH LONG,fechaLimite DATE null,tiempoContrato LONG,tipoNegocio LONG,presupuestoMaximo LONG,presupuestoMinimo LONG,cliente LONG,especialidad VARCHAR(75) null,meta VARCHAR(75) null,fechameta DATE null,prioridad LONG,contenidoId VARCHAR(75) null,modalidadjornada LONG,modalidadcontrato LONG,lugarTrabajo VARCHAR(75) null,categoriaPuestoId LONG,proyecto VARCHAR(75) null,tiporeclutamiento LONG,estado LONG,activo BOOLEAN,usuariocrea LONG,fechacrea DATE null,usuariomodifica LONG,fechamodifica DATE null,cantidadAnnosRubro INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table SolicitudRequerimiento";
	public static final String ORDER_BY_JPQL = " ORDER BY solicitudRequerimiento.fechamodifica ASC";
	public static final String ORDER_BY_SQL = " ORDER BY SolicitudRequerimiento.fechamodifica ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hitss.layer.model.SolicitudRequerimiento"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hitss.layer.model.SolicitudRequerimiento"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.hitss.layer.model.SolicitudRequerimiento"),
			true);
	public static long ACTIVO_COLUMN_BITMASK = 1L;
	public static long CONTENIDOID_COLUMN_BITMASK = 2L;
	public static long ESTADO_COLUMN_BITMASK = 4L;
	public static long SOLICITUDREQUERIMIENTOID_COLUMN_BITMASK = 8L;
	public static long FECHAMODIFICA_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static SolicitudRequerimiento toModel(
		SolicitudRequerimientoSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		SolicitudRequerimiento model = new SolicitudRequerimientoImpl();

		model.setSolicitudRequerimientoId(soapModel.getSolicitudRequerimientoId());
		model.setAreaSolicitante(soapModel.getAreaSolicitante());
		model.setCantidadRecursos(soapModel.getCantidadRecursos());
		model.setResponsableRRHH(soapModel.getResponsableRRHH());
		model.setFechaLimite(soapModel.getFechaLimite());
		model.setTiempoContrato(soapModel.getTiempoContrato());
		model.setTipoNegocio(soapModel.getTipoNegocio());
		model.setPresupuestoMaximo(soapModel.getPresupuestoMaximo());
		model.setPresupuestoMinimo(soapModel.getPresupuestoMinimo());
		model.setCliente(soapModel.getCliente());
		model.setEspecialidad(soapModel.getEspecialidad());
		model.setMeta(soapModel.getMeta());
		model.setFechameta(soapModel.getFechameta());
		model.setPrioridad(soapModel.getPrioridad());
		model.setContenidoId(soapModel.getContenidoId());
		model.setModalidadjornada(soapModel.getModalidadjornada());
		model.setModalidadcontrato(soapModel.getModalidadcontrato());
		model.setLugarTrabajo(soapModel.getLugarTrabajo());
		model.setCategoriaPuestoId(soapModel.getCategoriaPuestoId());
		model.setProyecto(soapModel.getProyecto());
		model.setTiporeclutamiento(soapModel.getTiporeclutamiento());
		model.setEstado(soapModel.getEstado());
		model.setActivo(soapModel.getActivo());
		model.setUsuariocrea(soapModel.getUsuariocrea());
		model.setFechacrea(soapModel.getFechacrea());
		model.setUsuariomodifica(soapModel.getUsuariomodifica());
		model.setFechamodifica(soapModel.getFechamodifica());
		model.setCantidadAnnosRubro(soapModel.getCantidadAnnosRubro());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<SolicitudRequerimiento> toModels(
		SolicitudRequerimientoSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<SolicitudRequerimiento> models = new ArrayList<SolicitudRequerimiento>(soapModels.length);

		for (SolicitudRequerimientoSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hitss.layer.model.SolicitudRequerimiento"));

	public SolicitudRequerimientoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _solicitudRequerimientoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSolicitudRequerimientoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _solicitudRequerimientoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SolicitudRequerimiento.class;
	}

	@Override
	public String getModelClassName() {
		return SolicitudRequerimiento.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("solicitudRequerimientoId", getSolicitudRequerimientoId());
		attributes.put("areaSolicitante", getAreaSolicitante());
		attributes.put("cantidadRecursos", getCantidadRecursos());
		attributes.put("responsableRRHH", getResponsableRRHH());
		attributes.put("fechaLimite", getFechaLimite());
		attributes.put("tiempoContrato", getTiempoContrato());
		attributes.put("tipoNegocio", getTipoNegocio());
		attributes.put("presupuestoMaximo", getPresupuestoMaximo());
		attributes.put("presupuestoMinimo", getPresupuestoMinimo());
		attributes.put("cliente", getCliente());
		attributes.put("especialidad", getEspecialidad());
		attributes.put("meta", getMeta());
		attributes.put("fechameta", getFechameta());
		attributes.put("prioridad", getPrioridad());
		attributes.put("contenidoId", getContenidoId());
		attributes.put("modalidadjornada", getModalidadjornada());
		attributes.put("modalidadcontrato", getModalidadcontrato());
		attributes.put("lugarTrabajo", getLugarTrabajo());
		attributes.put("categoriaPuestoId", getCategoriaPuestoId());
		attributes.put("proyecto", getProyecto());
		attributes.put("tiporeclutamiento", getTiporeclutamiento());
		attributes.put("estado", getEstado());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());
		attributes.put("cantidadAnnosRubro", getCantidadAnnosRubro());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long solicitudRequerimientoId = (Long)attributes.get(
				"solicitudRequerimientoId");

		if (solicitudRequerimientoId != null) {
			setSolicitudRequerimientoId(solicitudRequerimientoId);
		}

		Long areaSolicitante = (Long)attributes.get("areaSolicitante");

		if (areaSolicitante != null) {
			setAreaSolicitante(areaSolicitante);
		}

		Integer cantidadRecursos = (Integer)attributes.get("cantidadRecursos");

		if (cantidadRecursos != null) {
			setCantidadRecursos(cantidadRecursos);
		}

		Long responsableRRHH = (Long)attributes.get("responsableRRHH");

		if (responsableRRHH != null) {
			setResponsableRRHH(responsableRRHH);
		}

		Date fechaLimite = (Date)attributes.get("fechaLimite");

		if (fechaLimite != null) {
			setFechaLimite(fechaLimite);
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

		String especialidad = (String)attributes.get("especialidad");

		if (especialidad != null) {
			setEspecialidad(especialidad);
		}

		String meta = (String)attributes.get("meta");

		if (meta != null) {
			setMeta(meta);
		}

		Date fechameta = (Date)attributes.get("fechameta");

		if (fechameta != null) {
			setFechameta(fechameta);
		}

		Long prioridad = (Long)attributes.get("prioridad");

		if (prioridad != null) {
			setPrioridad(prioridad);
		}

		String contenidoId = (String)attributes.get("contenidoId");

		if (contenidoId != null) {
			setContenidoId(contenidoId);
		}

		Long modalidadjornada = (Long)attributes.get("modalidadjornada");

		if (modalidadjornada != null) {
			setModalidadjornada(modalidadjornada);
		}

		Long modalidadcontrato = (Long)attributes.get("modalidadcontrato");

		if (modalidadcontrato != null) {
			setModalidadcontrato(modalidadcontrato);
		}

		String lugarTrabajo = (String)attributes.get("lugarTrabajo");

		if (lugarTrabajo != null) {
			setLugarTrabajo(lugarTrabajo);
		}

		Long categoriaPuestoId = (Long)attributes.get("categoriaPuestoId");

		if (categoriaPuestoId != null) {
			setCategoriaPuestoId(categoriaPuestoId);
		}

		String proyecto = (String)attributes.get("proyecto");

		if (proyecto != null) {
			setProyecto(proyecto);
		}

		Long tiporeclutamiento = (Long)attributes.get("tiporeclutamiento");

		if (tiporeclutamiento != null) {
			setTiporeclutamiento(tiporeclutamiento);
		}

		Long estado = (Long)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
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

		Integer cantidadAnnosRubro = (Integer)attributes.get(
				"cantidadAnnosRubro");

		if (cantidadAnnosRubro != null) {
			setCantidadAnnosRubro(cantidadAnnosRubro);
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
	public long getAreaSolicitante() {
		return _areaSolicitante;
	}

	@Override
	public void setAreaSolicitante(long areaSolicitante) {
		_areaSolicitante = areaSolicitante;
	}

	@JSON
	@Override
	public int getCantidadRecursos() {
		return _cantidadRecursos;
	}

	@Override
	public void setCantidadRecursos(int cantidadRecursos) {
		_cantidadRecursos = cantidadRecursos;
	}

	@JSON
	@Override
	public long getResponsableRRHH() {
		return _responsableRRHH;
	}

	@Override
	public void setResponsableRRHH(long responsableRRHH) {
		_responsableRRHH = responsableRRHH;
	}

	@JSON
	@Override
	public Date getFechaLimite() {
		return _fechaLimite;
	}

	@Override
	public void setFechaLimite(Date fechaLimite) {
		_fechaLimite = fechaLimite;
	}

	@JSON
	@Override
	public long getTiempoContrato() {
		return _tiempoContrato;
	}

	@Override
	public void setTiempoContrato(long tiempoContrato) {
		_tiempoContrato = tiempoContrato;
	}

	@JSON
	@Override
	public long getTipoNegocio() {
		return _tipoNegocio;
	}

	@Override
	public void setTipoNegocio(long tipoNegocio) {
		_tipoNegocio = tipoNegocio;
	}

	@JSON
	@Override
	public long getPresupuestoMaximo() {
		return _presupuestoMaximo;
	}

	@Override
	public void setPresupuestoMaximo(long presupuestoMaximo) {
		_presupuestoMaximo = presupuestoMaximo;
	}

	@JSON
	@Override
	public long getPresupuestoMinimo() {
		return _presupuestoMinimo;
	}

	@Override
	public void setPresupuestoMinimo(long presupuestoMinimo) {
		_presupuestoMinimo = presupuestoMinimo;
	}

	@JSON
	@Override
	public long getCliente() {
		return _cliente;
	}

	@Override
	public void setCliente(long cliente) {
		_cliente = cliente;
	}

	@JSON
	@Override
	public String getEspecialidad() {
		if (_especialidad == null) {
			return StringPool.BLANK;
		}
		else {
			return _especialidad;
		}
	}

	@Override
	public void setEspecialidad(String especialidad) {
		_especialidad = especialidad;
	}

	@JSON
	@Override
	public String getMeta() {
		if (_meta == null) {
			return StringPool.BLANK;
		}
		else {
			return _meta;
		}
	}

	@Override
	public void setMeta(String meta) {
		_meta = meta;
	}

	@JSON
	@Override
	public Date getFechameta() {
		return _fechameta;
	}

	@Override
	public void setFechameta(Date fechameta) {
		_fechameta = fechameta;
	}

	@JSON
	@Override
	public long getPrioridad() {
		return _prioridad;
	}

	@Override
	public void setPrioridad(long prioridad) {
		_prioridad = prioridad;
	}

	@JSON
	@Override
	public String getContenidoId() {
		if (_contenidoId == null) {
			return StringPool.BLANK;
		}
		else {
			return _contenidoId;
		}
	}

	@Override
	public void setContenidoId(String contenidoId) {
		_columnBitmask |= CONTENIDOID_COLUMN_BITMASK;

		if (_originalContenidoId == null) {
			_originalContenidoId = _contenidoId;
		}

		_contenidoId = contenidoId;
	}

	public String getOriginalContenidoId() {
		return GetterUtil.getString(_originalContenidoId);
	}

	@JSON
	@Override
	public long getModalidadjornada() {
		return _modalidadjornada;
	}

	@Override
	public void setModalidadjornada(long modalidadjornada) {
		_modalidadjornada = modalidadjornada;
	}

	@JSON
	@Override
	public long getModalidadcontrato() {
		return _modalidadcontrato;
	}

	@Override
	public void setModalidadcontrato(long modalidadcontrato) {
		_modalidadcontrato = modalidadcontrato;
	}

	@JSON
	@Override
	public String getLugarTrabajo() {
		if (_lugarTrabajo == null) {
			return StringPool.BLANK;
		}
		else {
			return _lugarTrabajo;
		}
	}

	@Override
	public void setLugarTrabajo(String lugarTrabajo) {
		_lugarTrabajo = lugarTrabajo;
	}

	@JSON
	@Override
	public long getCategoriaPuestoId() {
		return _categoriaPuestoId;
	}

	@Override
	public void setCategoriaPuestoId(long categoriaPuestoId) {
		_categoriaPuestoId = categoriaPuestoId;
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
	public long getTiporeclutamiento() {
		return _tiporeclutamiento;
	}

	@Override
	public void setTiporeclutamiento(long tiporeclutamiento) {
		_tiporeclutamiento = tiporeclutamiento;
	}

	@JSON
	@Override
	public long getEstado() {
		return _estado;
	}

	@Override
	public void setEstado(long estado) {
		_columnBitmask |= ESTADO_COLUMN_BITMASK;

		if (!_setOriginalEstado) {
			_setOriginalEstado = true;

			_originalEstado = _estado;
		}

		_estado = estado;
	}

	public long getOriginalEstado() {
		return _originalEstado;
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
		_columnBitmask |= ACTIVO_COLUMN_BITMASK;

		if (!_setOriginalActivo) {
			_setOriginalActivo = true;

			_originalActivo = _activo;
		}

		_activo = activo;
	}

	public boolean getOriginalActivo() {
		return _originalActivo;
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

	@JSON
	@Override
	public int getCantidadAnnosRubro() {
		return _cantidadAnnosRubro;
	}

	@Override
	public void setCantidadAnnosRubro(int cantidadAnnosRubro) {
		_cantidadAnnosRubro = cantidadAnnosRubro;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			SolicitudRequerimiento.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SolicitudRequerimiento toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SolicitudRequerimiento)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SolicitudRequerimientoImpl solicitudRequerimientoImpl = new SolicitudRequerimientoImpl();

		solicitudRequerimientoImpl.setSolicitudRequerimientoId(getSolicitudRequerimientoId());
		solicitudRequerimientoImpl.setAreaSolicitante(getAreaSolicitante());
		solicitudRequerimientoImpl.setCantidadRecursos(getCantidadRecursos());
		solicitudRequerimientoImpl.setResponsableRRHH(getResponsableRRHH());
		solicitudRequerimientoImpl.setFechaLimite(getFechaLimite());
		solicitudRequerimientoImpl.setTiempoContrato(getTiempoContrato());
		solicitudRequerimientoImpl.setTipoNegocio(getTipoNegocio());
		solicitudRequerimientoImpl.setPresupuestoMaximo(getPresupuestoMaximo());
		solicitudRequerimientoImpl.setPresupuestoMinimo(getPresupuestoMinimo());
		solicitudRequerimientoImpl.setCliente(getCliente());
		solicitudRequerimientoImpl.setEspecialidad(getEspecialidad());
		solicitudRequerimientoImpl.setMeta(getMeta());
		solicitudRequerimientoImpl.setFechameta(getFechameta());
		solicitudRequerimientoImpl.setPrioridad(getPrioridad());
		solicitudRequerimientoImpl.setContenidoId(getContenidoId());
		solicitudRequerimientoImpl.setModalidadjornada(getModalidadjornada());
		solicitudRequerimientoImpl.setModalidadcontrato(getModalidadcontrato());
		solicitudRequerimientoImpl.setLugarTrabajo(getLugarTrabajo());
		solicitudRequerimientoImpl.setCategoriaPuestoId(getCategoriaPuestoId());
		solicitudRequerimientoImpl.setProyecto(getProyecto());
		solicitudRequerimientoImpl.setTiporeclutamiento(getTiporeclutamiento());
		solicitudRequerimientoImpl.setEstado(getEstado());
		solicitudRequerimientoImpl.setActivo(getActivo());
		solicitudRequerimientoImpl.setUsuariocrea(getUsuariocrea());
		solicitudRequerimientoImpl.setFechacrea(getFechacrea());
		solicitudRequerimientoImpl.setUsuariomodifica(getUsuariomodifica());
		solicitudRequerimientoImpl.setFechamodifica(getFechamodifica());
		solicitudRequerimientoImpl.setCantidadAnnosRubro(getCantidadAnnosRubro());

		solicitudRequerimientoImpl.resetOriginalValues();

		return solicitudRequerimientoImpl;
	}

	@Override
	public int compareTo(SolicitudRequerimiento solicitudRequerimiento) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				solicitudRequerimiento.getFechamodifica());

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

		if (!(obj instanceof SolicitudRequerimiento)) {
			return false;
		}

		SolicitudRequerimiento solicitudRequerimiento = (SolicitudRequerimiento)obj;

		long primaryKey = solicitudRequerimiento.getPrimaryKey();

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
		SolicitudRequerimientoModelImpl solicitudRequerimientoModelImpl = this;

		solicitudRequerimientoModelImpl._originalSolicitudRequerimientoId = solicitudRequerimientoModelImpl._solicitudRequerimientoId;

		solicitudRequerimientoModelImpl._setOriginalSolicitudRequerimientoId = false;

		solicitudRequerimientoModelImpl._originalContenidoId = solicitudRequerimientoModelImpl._contenidoId;

		solicitudRequerimientoModelImpl._originalEstado = solicitudRequerimientoModelImpl._estado;

		solicitudRequerimientoModelImpl._setOriginalEstado = false;

		solicitudRequerimientoModelImpl._originalActivo = solicitudRequerimientoModelImpl._activo;

		solicitudRequerimientoModelImpl._setOriginalActivo = false;

		solicitudRequerimientoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SolicitudRequerimiento> toCacheModel() {
		SolicitudRequerimientoCacheModel solicitudRequerimientoCacheModel = new SolicitudRequerimientoCacheModel();

		solicitudRequerimientoCacheModel.solicitudRequerimientoId = getSolicitudRequerimientoId();

		solicitudRequerimientoCacheModel.areaSolicitante = getAreaSolicitante();

		solicitudRequerimientoCacheModel.cantidadRecursos = getCantidadRecursos();

		solicitudRequerimientoCacheModel.responsableRRHH = getResponsableRRHH();

		Date fechaLimite = getFechaLimite();

		if (fechaLimite != null) {
			solicitudRequerimientoCacheModel.fechaLimite = fechaLimite.getTime();
		}
		else {
			solicitudRequerimientoCacheModel.fechaLimite = Long.MIN_VALUE;
		}

		solicitudRequerimientoCacheModel.tiempoContrato = getTiempoContrato();

		solicitudRequerimientoCacheModel.tipoNegocio = getTipoNegocio();

		solicitudRequerimientoCacheModel.presupuestoMaximo = getPresupuestoMaximo();

		solicitudRequerimientoCacheModel.presupuestoMinimo = getPresupuestoMinimo();

		solicitudRequerimientoCacheModel.cliente = getCliente();

		solicitudRequerimientoCacheModel.especialidad = getEspecialidad();

		String especialidad = solicitudRequerimientoCacheModel.especialidad;

		if ((especialidad != null) && (especialidad.length() == 0)) {
			solicitudRequerimientoCacheModel.especialidad = null;
		}

		solicitudRequerimientoCacheModel.meta = getMeta();

		String meta = solicitudRequerimientoCacheModel.meta;

		if ((meta != null) && (meta.length() == 0)) {
			solicitudRequerimientoCacheModel.meta = null;
		}

		Date fechameta = getFechameta();

		if (fechameta != null) {
			solicitudRequerimientoCacheModel.fechameta = fechameta.getTime();
		}
		else {
			solicitudRequerimientoCacheModel.fechameta = Long.MIN_VALUE;
		}

		solicitudRequerimientoCacheModel.prioridad = getPrioridad();

		solicitudRequerimientoCacheModel.contenidoId = getContenidoId();

		String contenidoId = solicitudRequerimientoCacheModel.contenidoId;

		if ((contenidoId != null) && (contenidoId.length() == 0)) {
			solicitudRequerimientoCacheModel.contenidoId = null;
		}

		solicitudRequerimientoCacheModel.modalidadjornada = getModalidadjornada();

		solicitudRequerimientoCacheModel.modalidadcontrato = getModalidadcontrato();

		solicitudRequerimientoCacheModel.lugarTrabajo = getLugarTrabajo();

		String lugarTrabajo = solicitudRequerimientoCacheModel.lugarTrabajo;

		if ((lugarTrabajo != null) && (lugarTrabajo.length() == 0)) {
			solicitudRequerimientoCacheModel.lugarTrabajo = null;
		}

		solicitudRequerimientoCacheModel.categoriaPuestoId = getCategoriaPuestoId();

		solicitudRequerimientoCacheModel.proyecto = getProyecto();

		String proyecto = solicitudRequerimientoCacheModel.proyecto;

		if ((proyecto != null) && (proyecto.length() == 0)) {
			solicitudRequerimientoCacheModel.proyecto = null;
		}

		solicitudRequerimientoCacheModel.tiporeclutamiento = getTiporeclutamiento();

		solicitudRequerimientoCacheModel.estado = getEstado();

		solicitudRequerimientoCacheModel.activo = getActivo();

		solicitudRequerimientoCacheModel.usuariocrea = getUsuariocrea();

		Date fechacrea = getFechacrea();

		if (fechacrea != null) {
			solicitudRequerimientoCacheModel.fechacrea = fechacrea.getTime();
		}
		else {
			solicitudRequerimientoCacheModel.fechacrea = Long.MIN_VALUE;
		}

		solicitudRequerimientoCacheModel.usuariomodifica = getUsuariomodifica();

		Date fechamodifica = getFechamodifica();

		if (fechamodifica != null) {
			solicitudRequerimientoCacheModel.fechamodifica = fechamodifica.getTime();
		}
		else {
			solicitudRequerimientoCacheModel.fechamodifica = Long.MIN_VALUE;
		}

		solicitudRequerimientoCacheModel.cantidadAnnosRubro = getCantidadAnnosRubro();

		return solicitudRequerimientoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{solicitudRequerimientoId=");
		sb.append(getSolicitudRequerimientoId());
		sb.append(", areaSolicitante=");
		sb.append(getAreaSolicitante());
		sb.append(", cantidadRecursos=");
		sb.append(getCantidadRecursos());
		sb.append(", responsableRRHH=");
		sb.append(getResponsableRRHH());
		sb.append(", fechaLimite=");
		sb.append(getFechaLimite());
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
		sb.append(", especialidad=");
		sb.append(getEspecialidad());
		sb.append(", meta=");
		sb.append(getMeta());
		sb.append(", fechameta=");
		sb.append(getFechameta());
		sb.append(", prioridad=");
		sb.append(getPrioridad());
		sb.append(", contenidoId=");
		sb.append(getContenidoId());
		sb.append(", modalidadjornada=");
		sb.append(getModalidadjornada());
		sb.append(", modalidadcontrato=");
		sb.append(getModalidadcontrato());
		sb.append(", lugarTrabajo=");
		sb.append(getLugarTrabajo());
		sb.append(", categoriaPuestoId=");
		sb.append(getCategoriaPuestoId());
		sb.append(", proyecto=");
		sb.append(getProyecto());
		sb.append(", tiporeclutamiento=");
		sb.append(getTiporeclutamiento());
		sb.append(", estado=");
		sb.append(getEstado());
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
		sb.append(", cantidadAnnosRubro=");
		sb.append(getCantidadAnnosRubro());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(88);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.SolicitudRequerimiento");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>solicitudRequerimientoId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudRequerimientoId());
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
			"<column><column-name>responsableRRHH</column-name><column-value><![CDATA[");
		sb.append(getResponsableRRHH());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaLimite</column-name><column-value><![CDATA[");
		sb.append(getFechaLimite());
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
			"<column><column-name>especialidad</column-name><column-value><![CDATA[");
		sb.append(getEspecialidad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>meta</column-name><column-value><![CDATA[");
		sb.append(getMeta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechameta</column-name><column-value><![CDATA[");
		sb.append(getFechameta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>prioridad</column-name><column-value><![CDATA[");
		sb.append(getPrioridad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contenidoId</column-name><column-value><![CDATA[");
		sb.append(getContenidoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modalidadjornada</column-name><column-value><![CDATA[");
		sb.append(getModalidadjornada());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modalidadcontrato</column-name><column-value><![CDATA[");
		sb.append(getModalidadcontrato());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lugarTrabajo</column-name><column-value><![CDATA[");
		sb.append(getLugarTrabajo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoriaPuestoId</column-name><column-value><![CDATA[");
		sb.append(getCategoriaPuestoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>proyecto</column-name><column-value><![CDATA[");
		sb.append(getProyecto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiporeclutamiento</column-name><column-value><![CDATA[");
		sb.append(getTiporeclutamiento());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estado</column-name><column-value><![CDATA[");
		sb.append(getEstado());
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
		sb.append(
			"<column><column-name>cantidadAnnosRubro</column-name><column-value><![CDATA[");
		sb.append(getCantidadAnnosRubro());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = SolicitudRequerimiento.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			SolicitudRequerimiento.class
		};
	private long _solicitudRequerimientoId;
	private long _originalSolicitudRequerimientoId;
	private boolean _setOriginalSolicitudRequerimientoId;
	private long _areaSolicitante;
	private int _cantidadRecursos;
	private long _responsableRRHH;
	private Date _fechaLimite;
	private long _tiempoContrato;
	private long _tipoNegocio;
	private long _presupuestoMaximo;
	private long _presupuestoMinimo;
	private long _cliente;
	private String _especialidad;
	private String _meta;
	private Date _fechameta;
	private long _prioridad;
	private String _contenidoId;
	private String _originalContenidoId;
	private long _modalidadjornada;
	private long _modalidadcontrato;
	private String _lugarTrabajo;
	private long _categoriaPuestoId;
	private String _proyecto;
	private long _tiporeclutamiento;
	private long _estado;
	private long _originalEstado;
	private boolean _setOriginalEstado;
	private boolean _activo;
	private boolean _originalActivo;
	private boolean _setOriginalActivo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private int _cantidadAnnosRubro;
	private long _columnBitmask;
	private SolicitudRequerimiento _escapedModel;
}
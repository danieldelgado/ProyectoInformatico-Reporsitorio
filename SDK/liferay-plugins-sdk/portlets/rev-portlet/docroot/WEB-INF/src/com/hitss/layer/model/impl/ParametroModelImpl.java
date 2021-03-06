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

import com.hitss.layer.model.Parametro;
import com.hitss.layer.model.ParametroModel;
import com.hitss.layer.model.ParametroSoap;

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
 * The base model implementation for the Parametro service. Represents a row in the &quot;Parametro&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hitss.layer.model.ParametroModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ParametroImpl}.
 * </p>
 *
 * @author Danielle Delgado
 * @see ParametroImpl
 * @see com.hitss.layer.model.Parametro
 * @see com.hitss.layer.model.ParametroModel
 * @generated
 */
@JSON(strict = true)
public class ParametroModelImpl extends BaseModelImpl<Parametro>
	implements ParametroModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a parametro model instance should use the {@link com.hitss.layer.model.Parametro} interface instead.
	 */
	public static final String TABLE_NAME = "Parametro";
	public static final Object[][] TABLE_COLUMNS = {
			{ "parametroId", Types.BIGINT },
			{ "parametroIdpadre", Types.BIGINT },
			{ "codigo", Types.VARCHAR },
			{ "descripcion", Types.VARCHAR },
			{ "valor", Types.VARCHAR },
			{ "tipodato", Types.VARCHAR },
			{ "activo", Types.BOOLEAN },
			{ "usuariocrea", Types.BIGINT },
			{ "fechacrea", Types.TIMESTAMP },
			{ "usuariomodifica", Types.BIGINT },
			{ "fechamodifica", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Parametro (parametroId LONG not null primary key,parametroIdpadre LONG,codigo VARCHAR(75) null,descripcion VARCHAR(75) null,valor VARCHAR(75) null,tipodato VARCHAR(75) null,activo BOOLEAN,usuariocrea LONG,fechacrea DATE null,usuariomodifica LONG,fechamodifica DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Parametro";
	public static final String ORDER_BY_JPQL = " ORDER BY parametro.fechamodifica ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Parametro.fechamodifica ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hitss.layer.model.Parametro"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hitss.layer.model.Parametro"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.hitss.layer.model.Parametro"),
			true);
	public static long PARAMETROIDPADRE_COLUMN_BITMASK = 1L;
	public static long VALOR_COLUMN_BITMASK = 2L;
	public static long FECHAMODIFICA_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Parametro toModel(ParametroSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Parametro model = new ParametroImpl();

		model.setParametroId(soapModel.getParametroId());
		model.setParametroIdpadre(soapModel.getParametroIdpadre());
		model.setCodigo(soapModel.getCodigo());
		model.setDescripcion(soapModel.getDescripcion());
		model.setValor(soapModel.getValor());
		model.setTipodato(soapModel.getTipodato());
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
	public static List<Parametro> toModels(ParametroSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Parametro> models = new ArrayList<Parametro>(soapModels.length);

		for (ParametroSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hitss.layer.model.Parametro"));

	public ParametroModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _parametroId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setParametroId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _parametroId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Parametro.class;
	}

	@Override
	public String getModelClassName() {
		return Parametro.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("parametroId", getParametroId());
		attributes.put("parametroIdpadre", getParametroIdpadre());
		attributes.put("codigo", getCodigo());
		attributes.put("descripcion", getDescripcion());
		attributes.put("valor", getValor());
		attributes.put("tipodato", getTipodato());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long parametroId = (Long)attributes.get("parametroId");

		if (parametroId != null) {
			setParametroId(parametroId);
		}

		Long parametroIdpadre = (Long)attributes.get("parametroIdpadre");

		if (parametroIdpadre != null) {
			setParametroIdpadre(parametroIdpadre);
		}

		String codigo = (String)attributes.get("codigo");

		if (codigo != null) {
			setCodigo(codigo);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String valor = (String)attributes.get("valor");

		if (valor != null) {
			setValor(valor);
		}

		String tipodato = (String)attributes.get("tipodato");

		if (tipodato != null) {
			setTipodato(tipodato);
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
	public long getParametroId() {
		return _parametroId;
	}

	@Override
	public void setParametroId(long parametroId) {
		_parametroId = parametroId;
	}

	@JSON
	@Override
	public long getParametroIdpadre() {
		return _parametroIdpadre;
	}

	@Override
	public void setParametroIdpadre(long parametroIdpadre) {
		_columnBitmask |= PARAMETROIDPADRE_COLUMN_BITMASK;

		if (!_setOriginalParametroIdpadre) {
			_setOriginalParametroIdpadre = true;

			_originalParametroIdpadre = _parametroIdpadre;
		}

		_parametroIdpadre = parametroIdpadre;
	}

	public long getOriginalParametroIdpadre() {
		return _originalParametroIdpadre;
	}

	@JSON
	@Override
	public String getCodigo() {
		if (_codigo == null) {
			return StringPool.BLANK;
		}
		else {
			return _codigo;
		}
	}

	@Override
	public void setCodigo(String codigo) {
		_codigo = codigo;
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
	public String getValor() {
		if (_valor == null) {
			return StringPool.BLANK;
		}
		else {
			return _valor;
		}
	}

	@Override
	public void setValor(String valor) {
		_columnBitmask |= VALOR_COLUMN_BITMASK;

		if (_originalValor == null) {
			_originalValor = _valor;
		}

		_valor = valor;
	}

	public String getOriginalValor() {
		return GetterUtil.getString(_originalValor);
	}

	@JSON
	@Override
	public String getTipodato() {
		if (_tipodato == null) {
			return StringPool.BLANK;
		}
		else {
			return _tipodato;
		}
	}

	@Override
	public void setTipodato(String tipodato) {
		_tipodato = tipodato;
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
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Parametro.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Parametro toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Parametro)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ParametroImpl parametroImpl = new ParametroImpl();

		parametroImpl.setParametroId(getParametroId());
		parametroImpl.setParametroIdpadre(getParametroIdpadre());
		parametroImpl.setCodigo(getCodigo());
		parametroImpl.setDescripcion(getDescripcion());
		parametroImpl.setValor(getValor());
		parametroImpl.setTipodato(getTipodato());
		parametroImpl.setActivo(getActivo());
		parametroImpl.setUsuariocrea(getUsuariocrea());
		parametroImpl.setFechacrea(getFechacrea());
		parametroImpl.setUsuariomodifica(getUsuariomodifica());
		parametroImpl.setFechamodifica(getFechamodifica());

		parametroImpl.resetOriginalValues();

		return parametroImpl;
	}

	@Override
	public int compareTo(Parametro parametro) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				parametro.getFechamodifica());

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

		if (!(obj instanceof Parametro)) {
			return false;
		}

		Parametro parametro = (Parametro)obj;

		long primaryKey = parametro.getPrimaryKey();

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
		ParametroModelImpl parametroModelImpl = this;

		parametroModelImpl._originalParametroIdpadre = parametroModelImpl._parametroIdpadre;

		parametroModelImpl._setOriginalParametroIdpadre = false;

		parametroModelImpl._originalValor = parametroModelImpl._valor;

		parametroModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Parametro> toCacheModel() {
		ParametroCacheModel parametroCacheModel = new ParametroCacheModel();

		parametroCacheModel.parametroId = getParametroId();

		parametroCacheModel.parametroIdpadre = getParametroIdpadre();

		parametroCacheModel.codigo = getCodigo();

		String codigo = parametroCacheModel.codigo;

		if ((codigo != null) && (codigo.length() == 0)) {
			parametroCacheModel.codigo = null;
		}

		parametroCacheModel.descripcion = getDescripcion();

		String descripcion = parametroCacheModel.descripcion;

		if ((descripcion != null) && (descripcion.length() == 0)) {
			parametroCacheModel.descripcion = null;
		}

		parametroCacheModel.valor = getValor();

		String valor = parametroCacheModel.valor;

		if ((valor != null) && (valor.length() == 0)) {
			parametroCacheModel.valor = null;
		}

		parametroCacheModel.tipodato = getTipodato();

		String tipodato = parametroCacheModel.tipodato;

		if ((tipodato != null) && (tipodato.length() == 0)) {
			parametroCacheModel.tipodato = null;
		}

		parametroCacheModel.activo = getActivo();

		parametroCacheModel.usuariocrea = getUsuariocrea();

		Date fechacrea = getFechacrea();

		if (fechacrea != null) {
			parametroCacheModel.fechacrea = fechacrea.getTime();
		}
		else {
			parametroCacheModel.fechacrea = Long.MIN_VALUE;
		}

		parametroCacheModel.usuariomodifica = getUsuariomodifica();

		Date fechamodifica = getFechamodifica();

		if (fechamodifica != null) {
			parametroCacheModel.fechamodifica = fechamodifica.getTime();
		}
		else {
			parametroCacheModel.fechamodifica = Long.MIN_VALUE;
		}

		return parametroCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{parametroId=");
		sb.append(getParametroId());
		sb.append(", parametroIdpadre=");
		sb.append(getParametroIdpadre());
		sb.append(", codigo=");
		sb.append(getCodigo());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", valor=");
		sb.append(getValor());
		sb.append(", tipodato=");
		sb.append(getTipodato());
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
		sb.append("com.hitss.layer.model.Parametro");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>parametroId</column-name><column-value><![CDATA[");
		sb.append(getParametroId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parametroIdpadre</column-name><column-value><![CDATA[");
		sb.append(getParametroIdpadre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>codigo</column-name><column-value><![CDATA[");
		sb.append(getCodigo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>valor</column-name><column-value><![CDATA[");
		sb.append(getValor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipodato</column-name><column-value><![CDATA[");
		sb.append(getTipodato());
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

	private static ClassLoader _classLoader = Parametro.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Parametro.class
		};
	private long _parametroId;
	private long _parametroIdpadre;
	private long _originalParametroIdpadre;
	private boolean _setOriginalParametroIdpadre;
	private String _codigo;
	private String _descripcion;
	private String _valor;
	private String _originalValor;
	private String _tipodato;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private long _columnBitmask;
	private Parametro _escapedModel;
}
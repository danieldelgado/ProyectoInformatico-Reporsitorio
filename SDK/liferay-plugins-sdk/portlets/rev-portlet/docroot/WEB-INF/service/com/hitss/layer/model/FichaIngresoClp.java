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

package com.hitss.layer.model;

import com.hitss.layer.service.ClpSerializer;
import com.hitss.layer.service.FichaIngresoLocalServiceUtil;
import com.hitss.layer.service.persistence.FichaIngresoPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Danielle Delgado
 */
public class FichaIngresoClp extends BaseModelImpl<FichaIngreso>
	implements FichaIngreso {
	public FichaIngresoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return FichaIngreso.class;
	}

	@Override
	public String getModelClassName() {
		return FichaIngreso.class.getName();
	}

	@Override
	public FichaIngresoPK getPrimaryKey() {
		return new FichaIngresoPK(_fichaingresoId, _solicitudRequerimientoId);
	}

	@Override
	public void setPrimaryKey(FichaIngresoPK primaryKey) {
		setFichaingresoId(primaryKey.fichaingresoId);
		setSolicitudRequerimientoId(primaryKey.solicitudRequerimientoId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new FichaIngresoPK(_fichaingresoId, _solicitudRequerimientoId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((FichaIngresoPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fichaingresoId", getFichaingresoId());
		attributes.put("solicitudRequerimientoId", getSolicitudRequerimientoId());
		attributes.put("userId", getUserId());
		attributes.put("equipoTecnico", getEquipoTecnico());
		attributes.put("reemplazo", getReemplazo());
		attributes.put("aprobacionFichaIngresoCapitalHumano",
			getAprobacionFichaIngresoCapitalHumano());
		attributes.put("aprobacionFichaIngresoOperaciones",
			getAprobacionFichaIngresoOperaciones());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fichaingresoId = (Long)attributes.get("fichaingresoId");

		if (fichaingresoId != null) {
			setFichaingresoId(fichaingresoId);
		}

		Long solicitudRequerimientoId = (Long)attributes.get(
				"solicitudRequerimientoId");

		if (solicitudRequerimientoId != null) {
			setSolicitudRequerimientoId(solicitudRequerimientoId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Boolean equipoTecnico = (Boolean)attributes.get("equipoTecnico");

		if (equipoTecnico != null) {
			setEquipoTecnico(equipoTecnico);
		}

		Boolean reemplazo = (Boolean)attributes.get("reemplazo");

		if (reemplazo != null) {
			setReemplazo(reemplazo);
		}

		Boolean aprobacionFichaIngresoCapitalHumano = (Boolean)attributes.get(
				"aprobacionFichaIngresoCapitalHumano");

		if (aprobacionFichaIngresoCapitalHumano != null) {
			setAprobacionFichaIngresoCapitalHumano(aprobacionFichaIngresoCapitalHumano);
		}

		Boolean aprobacionFichaIngresoOperaciones = (Boolean)attributes.get(
				"aprobacionFichaIngresoOperaciones");

		if (aprobacionFichaIngresoOperaciones != null) {
			setAprobacionFichaIngresoOperaciones(aprobacionFichaIngresoOperaciones);
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

	@Override
	public long getFichaingresoId() {
		return _fichaingresoId;
	}

	@Override
	public void setFichaingresoId(long fichaingresoId) {
		_fichaingresoId = fichaingresoId;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setFichaingresoId", long.class);

				method.invoke(_fichaIngresoRemoteModel, fichaingresoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSolicitudRequerimientoId() {
		return _solicitudRequerimientoId;
	}

	@Override
	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		_solicitudRequerimientoId = solicitudRequerimientoId;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setSolicitudRequerimientoId",
						long.class);

				method.invoke(_fichaIngresoRemoteModel, solicitudRequerimientoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_fichaIngresoRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public boolean getEquipoTecnico() {
		return _equipoTecnico;
	}

	@Override
	public boolean isEquipoTecnico() {
		return _equipoTecnico;
	}

	@Override
	public void setEquipoTecnico(boolean equipoTecnico) {
		_equipoTecnico = equipoTecnico;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setEquipoTecnico",
						boolean.class);

				method.invoke(_fichaIngresoRemoteModel, equipoTecnico);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getReemplazo() {
		return _reemplazo;
	}

	@Override
	public boolean isReemplazo() {
		return _reemplazo;
	}

	@Override
	public void setReemplazo(boolean reemplazo) {
		_reemplazo = reemplazo;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setReemplazo", boolean.class);

				method.invoke(_fichaIngresoRemoteModel, reemplazo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getAprobacionFichaIngresoCapitalHumano() {
		return _aprobacionFichaIngresoCapitalHumano;
	}

	@Override
	public boolean isAprobacionFichaIngresoCapitalHumano() {
		return _aprobacionFichaIngresoCapitalHumano;
	}

	@Override
	public void setAprobacionFichaIngresoCapitalHumano(
		boolean aprobacionFichaIngresoCapitalHumano) {
		_aprobacionFichaIngresoCapitalHumano = aprobacionFichaIngresoCapitalHumano;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setAprobacionFichaIngresoCapitalHumano",
						boolean.class);

				method.invoke(_fichaIngresoRemoteModel,
					aprobacionFichaIngresoCapitalHumano);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getAprobacionFichaIngresoOperaciones() {
		return _aprobacionFichaIngresoOperaciones;
	}

	@Override
	public boolean isAprobacionFichaIngresoOperaciones() {
		return _aprobacionFichaIngresoOperaciones;
	}

	@Override
	public void setAprobacionFichaIngresoOperaciones(
		boolean aprobacionFichaIngresoOperaciones) {
		_aprobacionFichaIngresoOperaciones = aprobacionFichaIngresoOperaciones;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setAprobacionFichaIngresoOperaciones",
						boolean.class);

				method.invoke(_fichaIngresoRemoteModel,
					aprobacionFichaIngresoOperaciones);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
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

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_fichaIngresoRemoteModel, activo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUsuariocrea() {
		return _usuariocrea;
	}

	@Override
	public void setUsuariocrea(long usuariocrea) {
		_usuariocrea = usuariocrea;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_fichaIngresoRemoteModel, usuariocrea);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechacrea() {
		return _fechacrea;
	}

	@Override
	public void setFechacrea(Date fechacrea) {
		_fechacrea = fechacrea;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_fichaIngresoRemoteModel, fechacrea);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUsuariomodifica() {
		return _usuariomodifica;
	}

	@Override
	public void setUsuariomodifica(long usuariomodifica) {
		_usuariomodifica = usuariomodifica;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_fichaIngresoRemoteModel, usuariomodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechamodifica() {
		return _fechamodifica;
	}

	@Override
	public void setFechamodifica(Date fechamodifica) {
		_fechamodifica = fechamodifica;

		if (_fichaIngresoRemoteModel != null) {
			try {
				Class<?> clazz = _fichaIngresoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechamodifica", Date.class);

				method.invoke(_fichaIngresoRemoteModel, fechamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFichaIngresoRemoteModel() {
		return _fichaIngresoRemoteModel;
	}

	public void setFichaIngresoRemoteModel(BaseModel<?> fichaIngresoRemoteModel) {
		_fichaIngresoRemoteModel = fichaIngresoRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _fichaIngresoRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_fichaIngresoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FichaIngresoLocalServiceUtil.addFichaIngreso(this);
		}
		else {
			FichaIngresoLocalServiceUtil.updateFichaIngreso(this);
		}
	}

	@Override
	public FichaIngreso toEscapedModel() {
		return (FichaIngreso)ProxyUtil.newProxyInstance(FichaIngreso.class.getClassLoader(),
			new Class[] { FichaIngreso.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FichaIngresoClp clone = new FichaIngresoClp();

		clone.setFichaingresoId(getFichaingresoId());
		clone.setSolicitudRequerimientoId(getSolicitudRequerimientoId());
		clone.setUserId(getUserId());
		clone.setEquipoTecnico(getEquipoTecnico());
		clone.setReemplazo(getReemplazo());
		clone.setAprobacionFichaIngresoCapitalHumano(getAprobacionFichaIngresoCapitalHumano());
		clone.setAprobacionFichaIngresoOperaciones(getAprobacionFichaIngresoOperaciones());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechamodifica(getFechamodifica());

		return clone;
	}

	@Override
	public int compareTo(FichaIngreso fichaIngreso) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				fichaIngreso.getFechamodifica());

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

		if (!(obj instanceof FichaIngresoClp)) {
			return false;
		}

		FichaIngresoClp fichaIngreso = (FichaIngresoClp)obj;

		FichaIngresoPK primaryKey = fichaIngreso.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{fichaingresoId=");
		sb.append(getFichaingresoId());
		sb.append(", solicitudRequerimientoId=");
		sb.append(getSolicitudRequerimientoId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", equipoTecnico=");
		sb.append(getEquipoTecnico());
		sb.append(", reemplazo=");
		sb.append(getReemplazo());
		sb.append(", aprobacionFichaIngresoCapitalHumano=");
		sb.append(getAprobacionFichaIngresoCapitalHumano());
		sb.append(", aprobacionFichaIngresoOperaciones=");
		sb.append(getAprobacionFichaIngresoOperaciones());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.FichaIngreso");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>fichaingresoId</column-name><column-value><![CDATA[");
		sb.append(getFichaingresoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>solicitudRequerimientoId</column-name><column-value><![CDATA[");
		sb.append(getSolicitudRequerimientoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equipoTecnico</column-name><column-value><![CDATA[");
		sb.append(getEquipoTecnico());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reemplazo</column-name><column-value><![CDATA[");
		sb.append(getReemplazo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>aprobacionFichaIngresoCapitalHumano</column-name><column-value><![CDATA[");
		sb.append(getAprobacionFichaIngresoCapitalHumano());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>aprobacionFichaIngresoOperaciones</column-name><column-value><![CDATA[");
		sb.append(getAprobacionFichaIngresoOperaciones());
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

	private long _fichaingresoId;
	private long _solicitudRequerimientoId;
	private long _userId;
	private String _userUuid;
	private boolean _equipoTecnico;
	private boolean _reemplazo;
	private boolean _aprobacionFichaIngresoCapitalHumano;
	private boolean _aprobacionFichaIngresoOperaciones;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private BaseModel<?> _fichaIngresoRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
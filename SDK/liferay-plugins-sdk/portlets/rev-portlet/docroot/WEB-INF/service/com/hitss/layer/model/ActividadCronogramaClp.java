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

import com.hitss.layer.service.ActividadCronogramaLocalServiceUtil;
import com.hitss.layer.service.ClpSerializer;
import com.hitss.layer.service.persistence.ActividadCronogramaPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Danielle Delgado
 */
public class ActividadCronogramaClp extends BaseModelImpl<ActividadCronograma>
	implements ActividadCronograma {
	public ActividadCronogramaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ActividadCronograma.class;
	}

	@Override
	public String getModelClassName() {
		return ActividadCronograma.class.getName();
	}

	@Override
	public ActividadCronogramaPK getPrimaryKey() {
		return new ActividadCronogramaPK(_cronogramaId, _actividadCronogramaId);
	}

	@Override
	public void setPrimaryKey(ActividadCronogramaPK primaryKey) {
		setCronogramaId(primaryKey.cronogramaId);
		setActividadCronogramaId(primaryKey.actividadCronogramaId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new ActividadCronogramaPK(_cronogramaId, _actividadCronogramaId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((ActividadCronogramaPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cronogramaId", getCronogramaId());
		attributes.put("actividadCronogramaId", getActividadCronogramaId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("fechaInicio", getFechaInicio());
		attributes.put("fechaFin", getFechaFin());
		attributes.put("cumplidoEvaluacion", getCumplidoEvaluacion());
		attributes.put("estado", getEstado());
		attributes.put("fechaInicioEvaluacion", getFechaInicioEvaluacion());
		attributes.put("fechaFinEvaluacion", getFechaFinEvaluacion());
		attributes.put("grupoUsuario", getGrupoUsuario());
		attributes.put("tipoActividad", getTipoActividad());
		attributes.put("aprobadoColaborador", getAprobadoColaborador());
		attributes.put("jerarquiaEvaluar", getJerarquiaEvaluar());
		attributes.put("aprobadoLider", getAprobadoLider());
		attributes.put("usuarioGerenteId", getUsuarioGerenteId());
		attributes.put("usuarioLiderId", getUsuarioLiderId());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechamodifica", getFechamodifica());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cronogramaId = (Long)attributes.get("cronogramaId");

		if (cronogramaId != null) {
			setCronogramaId(cronogramaId);
		}

		Long actividadCronogramaId = (Long)attributes.get(
				"actividadCronogramaId");

		if (actividadCronogramaId != null) {
			setActividadCronogramaId(actividadCronogramaId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Date fechaInicio = (Date)attributes.get("fechaInicio");

		if (fechaInicio != null) {
			setFechaInicio(fechaInicio);
		}

		Date fechaFin = (Date)attributes.get("fechaFin");

		if (fechaFin != null) {
			setFechaFin(fechaFin);
		}

		Boolean cumplidoEvaluacion = (Boolean)attributes.get(
				"cumplidoEvaluacion");

		if (cumplidoEvaluacion != null) {
			setCumplidoEvaluacion(cumplidoEvaluacion);
		}

		Long estado = (Long)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		Date fechaInicioEvaluacion = (Date)attributes.get(
				"fechaInicioEvaluacion");

		if (fechaInicioEvaluacion != null) {
			setFechaInicioEvaluacion(fechaInicioEvaluacion);
		}

		Date fechaFinEvaluacion = (Date)attributes.get("fechaFinEvaluacion");

		if (fechaFinEvaluacion != null) {
			setFechaFinEvaluacion(fechaFinEvaluacion);
		}

		Long grupoUsuario = (Long)attributes.get("grupoUsuario");

		if (grupoUsuario != null) {
			setGrupoUsuario(grupoUsuario);
		}

		Long tipoActividad = (Long)attributes.get("tipoActividad");

		if (tipoActividad != null) {
			setTipoActividad(tipoActividad);
		}

		Long aprobadoColaborador = (Long)attributes.get("aprobadoColaborador");

		if (aprobadoColaborador != null) {
			setAprobadoColaborador(aprobadoColaborador);
		}

		Long jerarquiaEvaluar = (Long)attributes.get("jerarquiaEvaluar");

		if (jerarquiaEvaluar != null) {
			setJerarquiaEvaluar(jerarquiaEvaluar);
		}

		Long aprobadoLider = (Long)attributes.get("aprobadoLider");

		if (aprobadoLider != null) {
			setAprobadoLider(aprobadoLider);
		}

		Long usuarioGerenteId = (Long)attributes.get("usuarioGerenteId");

		if (usuarioGerenteId != null) {
			setUsuarioGerenteId(usuarioGerenteId);
		}

		Long usuarioLiderId = (Long)attributes.get("usuarioLiderId");

		if (usuarioLiderId != null) {
			setUsuarioLiderId(usuarioLiderId);
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
	public long getCronogramaId() {
		return _cronogramaId;
	}

	@Override
	public void setCronogramaId(long cronogramaId) {
		_cronogramaId = cronogramaId;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setCronogramaId", long.class);

				method.invoke(_actividadCronogramaRemoteModel, cronogramaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getActividadCronogramaId() {
		return _actividadCronogramaId;
	}

	@Override
	public void setActividadCronogramaId(long actividadCronogramaId) {
		_actividadCronogramaId = actividadCronogramaId;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setActividadCronogramaId",
						long.class);

				method.invoke(_actividadCronogramaRemoteModel,
					actividadCronogramaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescripcion() {
		return _descripcion;
	}

	@Override
	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_actividadCronogramaRemoteModel, descripcion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaInicio() {
		return _fechaInicio;
	}

	@Override
	public void setFechaInicio(Date fechaInicio) {
		_fechaInicio = fechaInicio;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaInicio", Date.class);

				method.invoke(_actividadCronogramaRemoteModel, fechaInicio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaFin() {
		return _fechaFin;
	}

	@Override
	public void setFechaFin(Date fechaFin) {
		_fechaFin = fechaFin;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaFin", Date.class);

				method.invoke(_actividadCronogramaRemoteModel, fechaFin);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getCumplidoEvaluacion() {
		return _cumplidoEvaluacion;
	}

	@Override
	public boolean isCumplidoEvaluacion() {
		return _cumplidoEvaluacion;
	}

	@Override
	public void setCumplidoEvaluacion(boolean cumplidoEvaluacion) {
		_cumplidoEvaluacion = cumplidoEvaluacion;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setCumplidoEvaluacion",
						boolean.class);

				method.invoke(_actividadCronogramaRemoteModel,
					cumplidoEvaluacion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEstado() {
		return _estado;
	}

	@Override
	public void setEstado(long estado) {
		_estado = estado;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setEstado", long.class);

				method.invoke(_actividadCronogramaRemoteModel, estado);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaInicioEvaluacion() {
		return _fechaInicioEvaluacion;
	}

	@Override
	public void setFechaInicioEvaluacion(Date fechaInicioEvaluacion) {
		_fechaInicioEvaluacion = fechaInicioEvaluacion;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaInicioEvaluacion",
						Date.class);

				method.invoke(_actividadCronogramaRemoteModel,
					fechaInicioEvaluacion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaFinEvaluacion() {
		return _fechaFinEvaluacion;
	}

	@Override
	public void setFechaFinEvaluacion(Date fechaFinEvaluacion) {
		_fechaFinEvaluacion = fechaFinEvaluacion;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaFinEvaluacion",
						Date.class);

				method.invoke(_actividadCronogramaRemoteModel,
					fechaFinEvaluacion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGrupoUsuario() {
		return _grupoUsuario;
	}

	@Override
	public void setGrupoUsuario(long grupoUsuario) {
		_grupoUsuario = grupoUsuario;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setGrupoUsuario", long.class);

				method.invoke(_actividadCronogramaRemoteModel, grupoUsuario);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTipoActividad() {
		return _tipoActividad;
	}

	@Override
	public void setTipoActividad(long tipoActividad) {
		_tipoActividad = tipoActividad;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setTipoActividad", long.class);

				method.invoke(_actividadCronogramaRemoteModel, tipoActividad);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAprobadoColaborador() {
		return _aprobadoColaborador;
	}

	@Override
	public void setAprobadoColaborador(long aprobadoColaborador) {
		_aprobadoColaborador = aprobadoColaborador;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setAprobadoColaborador",
						long.class);

				method.invoke(_actividadCronogramaRemoteModel,
					aprobadoColaborador);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getJerarquiaEvaluar() {
		return _jerarquiaEvaluar;
	}

	@Override
	public void setJerarquiaEvaluar(long jerarquiaEvaluar) {
		_jerarquiaEvaluar = jerarquiaEvaluar;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setJerarquiaEvaluar",
						long.class);

				method.invoke(_actividadCronogramaRemoteModel, jerarquiaEvaluar);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAprobadoLider() {
		return _aprobadoLider;
	}

	@Override
	public void setAprobadoLider(long aprobadoLider) {
		_aprobadoLider = aprobadoLider;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setAprobadoLider", long.class);

				method.invoke(_actividadCronogramaRemoteModel, aprobadoLider);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUsuarioGerenteId() {
		return _usuarioGerenteId;
	}

	@Override
	public void setUsuarioGerenteId(long usuarioGerenteId) {
		_usuarioGerenteId = usuarioGerenteId;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioGerenteId",
						long.class);

				method.invoke(_actividadCronogramaRemoteModel, usuarioGerenteId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUsuarioLiderId() {
		return _usuarioLiderId;
	}

	@Override
	public void setUsuarioLiderId(long usuarioLiderId) {
		_usuarioLiderId = usuarioLiderId;

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioLiderId", long.class);

				method.invoke(_actividadCronogramaRemoteModel, usuarioLiderId);
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

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_actividadCronogramaRemoteModel, activo);
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

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_actividadCronogramaRemoteModel, usuariocrea);
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

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_actividadCronogramaRemoteModel, fechacrea);
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

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_actividadCronogramaRemoteModel, usuariomodifica);
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

		if (_actividadCronogramaRemoteModel != null) {
			try {
				Class<?> clazz = _actividadCronogramaRemoteModel.getClass();

				Method method = clazz.getMethod("setFechamodifica", Date.class);

				method.invoke(_actividadCronogramaRemoteModel, fechamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getActividadCronogramaRemoteModel() {
		return _actividadCronogramaRemoteModel;
	}

	public void setActividadCronogramaRemoteModel(
		BaseModel<?> actividadCronogramaRemoteModel) {
		_actividadCronogramaRemoteModel = actividadCronogramaRemoteModel;
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

		Class<?> remoteModelClass = _actividadCronogramaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_actividadCronogramaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ActividadCronogramaLocalServiceUtil.addActividadCronograma(this);
		}
		else {
			ActividadCronogramaLocalServiceUtil.updateActividadCronograma(this);
		}
	}

	@Override
	public ActividadCronograma toEscapedModel() {
		return (ActividadCronograma)ProxyUtil.newProxyInstance(ActividadCronograma.class.getClassLoader(),
			new Class[] { ActividadCronograma.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ActividadCronogramaClp clone = new ActividadCronogramaClp();

		clone.setCronogramaId(getCronogramaId());
		clone.setActividadCronogramaId(getActividadCronogramaId());
		clone.setDescripcion(getDescripcion());
		clone.setFechaInicio(getFechaInicio());
		clone.setFechaFin(getFechaFin());
		clone.setCumplidoEvaluacion(getCumplidoEvaluacion());
		clone.setEstado(getEstado());
		clone.setFechaInicioEvaluacion(getFechaInicioEvaluacion());
		clone.setFechaFinEvaluacion(getFechaFinEvaluacion());
		clone.setGrupoUsuario(getGrupoUsuario());
		clone.setTipoActividad(getTipoActividad());
		clone.setAprobadoColaborador(getAprobadoColaborador());
		clone.setJerarquiaEvaluar(getJerarquiaEvaluar());
		clone.setAprobadoLider(getAprobadoLider());
		clone.setUsuarioGerenteId(getUsuarioGerenteId());
		clone.setUsuarioLiderId(getUsuarioLiderId());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechamodifica(getFechamodifica());

		return clone;
	}

	@Override
	public int compareTo(ActividadCronograma actividadCronograma) {
		int value = 0;

		value = DateUtil.compareTo(getFechamodifica(),
				actividadCronograma.getFechamodifica());

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

		if (!(obj instanceof ActividadCronogramaClp)) {
			return false;
		}

		ActividadCronogramaClp actividadCronograma = (ActividadCronogramaClp)obj;

		ActividadCronogramaPK primaryKey = actividadCronograma.getPrimaryKey();

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
		StringBundler sb = new StringBundler(43);

		sb.append("{cronogramaId=");
		sb.append(getCronogramaId());
		sb.append(", actividadCronogramaId=");
		sb.append(getActividadCronogramaId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", fechaInicio=");
		sb.append(getFechaInicio());
		sb.append(", fechaFin=");
		sb.append(getFechaFin());
		sb.append(", cumplidoEvaluacion=");
		sb.append(getCumplidoEvaluacion());
		sb.append(", estado=");
		sb.append(getEstado());
		sb.append(", fechaInicioEvaluacion=");
		sb.append(getFechaInicioEvaluacion());
		sb.append(", fechaFinEvaluacion=");
		sb.append(getFechaFinEvaluacion());
		sb.append(", grupoUsuario=");
		sb.append(getGrupoUsuario());
		sb.append(", tipoActividad=");
		sb.append(getTipoActividad());
		sb.append(", aprobadoColaborador=");
		sb.append(getAprobadoColaborador());
		sb.append(", jerarquiaEvaluar=");
		sb.append(getJerarquiaEvaluar());
		sb.append(", aprobadoLider=");
		sb.append(getAprobadoLider());
		sb.append(", usuarioGerenteId=");
		sb.append(getUsuarioGerenteId());
		sb.append(", usuarioLiderId=");
		sb.append(getUsuarioLiderId());
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
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("com.hitss.layer.model.ActividadCronograma");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cronogramaId</column-name><column-value><![CDATA[");
		sb.append(getCronogramaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actividadCronogramaId</column-name><column-value><![CDATA[");
		sb.append(getActividadCronogramaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
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
			"<column><column-name>cumplidoEvaluacion</column-name><column-value><![CDATA[");
		sb.append(getCumplidoEvaluacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estado</column-name><column-value><![CDATA[");
		sb.append(getEstado());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaInicioEvaluacion</column-name><column-value><![CDATA[");
		sb.append(getFechaInicioEvaluacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaFinEvaluacion</column-name><column-value><![CDATA[");
		sb.append(getFechaFinEvaluacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grupoUsuario</column-name><column-value><![CDATA[");
		sb.append(getGrupoUsuario());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipoActividad</column-name><column-value><![CDATA[");
		sb.append(getTipoActividad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>aprobadoColaborador</column-name><column-value><![CDATA[");
		sb.append(getAprobadoColaborador());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jerarquiaEvaluar</column-name><column-value><![CDATA[");
		sb.append(getJerarquiaEvaluar());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>aprobadoLider</column-name><column-value><![CDATA[");
		sb.append(getAprobadoLider());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioGerenteId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioGerenteId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioLiderId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioLiderId());
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

	private long _cronogramaId;
	private long _actividadCronogramaId;
	private String _descripcion;
	private Date _fechaInicio;
	private Date _fechaFin;
	private boolean _cumplidoEvaluacion;
	private long _estado;
	private Date _fechaInicioEvaluacion;
	private Date _fechaFinEvaluacion;
	private long _grupoUsuario;
	private long _tipoActividad;
	private long _aprobadoColaborador;
	private long _jerarquiaEvaluar;
	private long _aprobadoLider;
	private long _usuarioGerenteId;
	private long _usuarioLiderId;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechamodifica;
	private BaseModel<?> _actividadCronogramaRemoteModel;
	private Class<?> _clpSerializerClass = com.hitss.layer.service.ClpSerializer.class;
}
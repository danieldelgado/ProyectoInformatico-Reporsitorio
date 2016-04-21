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

package com.rec.hitss.layer.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.rec.hitss.layer.service.ClpSerializer;
import com.rec.hitss.layer.service.PuestoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class PuestoClp extends BaseModelImpl<Puesto> implements Puesto {
	public PuestoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Puesto.class;
	}

	@Override
	public String getModelClassName() {
		return Puesto.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _puestoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPuestoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _puestoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("puestoId", getPuestoId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("fechaContrato", getFechaContrato());
		attributes.put("fechaEvaluacionPsicologica",
			getFechaEvaluacionPsicologica());
		attributes.put("fechaEvalucionTecnica", getFechaEvalucionTecnica());
		attributes.put("fechaEntrevistaGerenteArea",
			getFechaEntrevistaGerenteArea());
		attributes.put("fechaEvaluacionRRHH", getFechaEvaluacionRRHH());
		attributes.put("fechaPostulacion", getFechaPostulacion());
		attributes.put("seleccionado", getSeleccionado());
		attributes.put("activo", getActivo());
		attributes.put("usuariocrea", getUsuariocrea());
		attributes.put("fechacrea", getFechacrea());
		attributes.put("usuariomodifica", getUsuariomodifica());
		attributes.put("fechacreamodifica", getFechacreamodifica());
		attributes.put("requerimientoRecursoId", getRequerimientoRecursoId());
		attributes.put("usuarioHitssId", getUsuarioHitssId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long puestoId = (Long)attributes.get("puestoId");

		if (puestoId != null) {
			setPuestoId(puestoId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Date fechaContrato = (Date)attributes.get("fechaContrato");

		if (fechaContrato != null) {
			setFechaContrato(fechaContrato);
		}

		Date fechaEvaluacionPsicologica = (Date)attributes.get(
				"fechaEvaluacionPsicologica");

		if (fechaEvaluacionPsicologica != null) {
			setFechaEvaluacionPsicologica(fechaEvaluacionPsicologica);
		}

		Date fechaEvalucionTecnica = (Date)attributes.get(
				"fechaEvalucionTecnica");

		if (fechaEvalucionTecnica != null) {
			setFechaEvalucionTecnica(fechaEvalucionTecnica);
		}

		Date fechaEntrevistaGerenteArea = (Date)attributes.get(
				"fechaEntrevistaGerenteArea");

		if (fechaEntrevistaGerenteArea != null) {
			setFechaEntrevistaGerenteArea(fechaEntrevistaGerenteArea);
		}

		Date fechaEvaluacionRRHH = (Date)attributes.get("fechaEvaluacionRRHH");

		if (fechaEvaluacionRRHH != null) {
			setFechaEvaluacionRRHH(fechaEvaluacionRRHH);
		}

		Date fechaPostulacion = (Date)attributes.get("fechaPostulacion");

		if (fechaPostulacion != null) {
			setFechaPostulacion(fechaPostulacion);
		}

		Boolean seleccionado = (Boolean)attributes.get("seleccionado");

		if (seleccionado != null) {
			setSeleccionado(seleccionado);
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

		Long requerimientoRecursoId = (Long)attributes.get(
				"requerimientoRecursoId");

		if (requerimientoRecursoId != null) {
			setRequerimientoRecursoId(requerimientoRecursoId);
		}

		Long usuarioHitssId = (Long)attributes.get("usuarioHitssId");

		if (usuarioHitssId != null) {
			setUsuarioHitssId(usuarioHitssId);
		}
	}

	@Override
	public long getPuestoId() {
		return _puestoId;
	}

	@Override
	public void setPuestoId(long puestoId) {
		_puestoId = puestoId;

		if (_puestoRemoteModel != null) {
			try {
				Class<?> clazz = _puestoRemoteModel.getClass();

				Method method = clazz.getMethod("setPuestoId", long.class);

				method.invoke(_puestoRemoteModel, puestoId);
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

		if (_puestoRemoteModel != null) {
			try {
				Class<?> clazz = _puestoRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_puestoRemoteModel, descripcion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaContrato() {
		return _fechaContrato;
	}

	@Override
	public void setFechaContrato(Date fechaContrato) {
		_fechaContrato = fechaContrato;

		if (_puestoRemoteModel != null) {
			try {
				Class<?> clazz = _puestoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaContrato", Date.class);

				method.invoke(_puestoRemoteModel, fechaContrato);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaEvaluacionPsicologica() {
		return _fechaEvaluacionPsicologica;
	}

	@Override
	public void setFechaEvaluacionPsicologica(Date fechaEvaluacionPsicologica) {
		_fechaEvaluacionPsicologica = fechaEvaluacionPsicologica;

		if (_puestoRemoteModel != null) {
			try {
				Class<?> clazz = _puestoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaEvaluacionPsicologica",
						Date.class);

				method.invoke(_puestoRemoteModel, fechaEvaluacionPsicologica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaEvalucionTecnica() {
		return _fechaEvalucionTecnica;
	}

	@Override
	public void setFechaEvalucionTecnica(Date fechaEvalucionTecnica) {
		_fechaEvalucionTecnica = fechaEvalucionTecnica;

		if (_puestoRemoteModel != null) {
			try {
				Class<?> clazz = _puestoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaEvalucionTecnica",
						Date.class);

				method.invoke(_puestoRemoteModel, fechaEvalucionTecnica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaEntrevistaGerenteArea() {
		return _fechaEntrevistaGerenteArea;
	}

	@Override
	public void setFechaEntrevistaGerenteArea(Date fechaEntrevistaGerenteArea) {
		_fechaEntrevistaGerenteArea = fechaEntrevistaGerenteArea;

		if (_puestoRemoteModel != null) {
			try {
				Class<?> clazz = _puestoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaEntrevistaGerenteArea",
						Date.class);

				method.invoke(_puestoRemoteModel, fechaEntrevistaGerenteArea);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaEvaluacionRRHH() {
		return _fechaEvaluacionRRHH;
	}

	@Override
	public void setFechaEvaluacionRRHH(Date fechaEvaluacionRRHH) {
		_fechaEvaluacionRRHH = fechaEvaluacionRRHH;

		if (_puestoRemoteModel != null) {
			try {
				Class<?> clazz = _puestoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaEvaluacionRRHH",
						Date.class);

				method.invoke(_puestoRemoteModel, fechaEvaluacionRRHH);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechaPostulacion() {
		return _fechaPostulacion;
	}

	@Override
	public void setFechaPostulacion(Date fechaPostulacion) {
		_fechaPostulacion = fechaPostulacion;

		if (_puestoRemoteModel != null) {
			try {
				Class<?> clazz = _puestoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechaPostulacion",
						Date.class);

				method.invoke(_puestoRemoteModel, fechaPostulacion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

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

		if (_puestoRemoteModel != null) {
			try {
				Class<?> clazz = _puestoRemoteModel.getClass();

				Method method = clazz.getMethod("setSeleccionado", boolean.class);

				method.invoke(_puestoRemoteModel, seleccionado);
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

		if (_puestoRemoteModel != null) {
			try {
				Class<?> clazz = _puestoRemoteModel.getClass();

				Method method = clazz.getMethod("setActivo", boolean.class);

				method.invoke(_puestoRemoteModel, activo);
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

		if (_puestoRemoteModel != null) {
			try {
				Class<?> clazz = _puestoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariocrea", long.class);

				method.invoke(_puestoRemoteModel, usuariocrea);
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

		if (_puestoRemoteModel != null) {
			try {
				Class<?> clazz = _puestoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacrea", Date.class);

				method.invoke(_puestoRemoteModel, fechacrea);
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

		if (_puestoRemoteModel != null) {
			try {
				Class<?> clazz = _puestoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuariomodifica", long.class);

				method.invoke(_puestoRemoteModel, usuariomodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFechacreamodifica() {
		return _fechacreamodifica;
	}

	@Override
	public void setFechacreamodifica(Date fechacreamodifica) {
		_fechacreamodifica = fechacreamodifica;

		if (_puestoRemoteModel != null) {
			try {
				Class<?> clazz = _puestoRemoteModel.getClass();

				Method method = clazz.getMethod("setFechacreamodifica",
						Date.class);

				method.invoke(_puestoRemoteModel, fechacreamodifica);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRequerimientoRecursoId() {
		return _requerimientoRecursoId;
	}

	@Override
	public void setRequerimientoRecursoId(long requerimientoRecursoId) {
		_requerimientoRecursoId = requerimientoRecursoId;

		if (_puestoRemoteModel != null) {
			try {
				Class<?> clazz = _puestoRemoteModel.getClass();

				Method method = clazz.getMethod("setRequerimientoRecursoId",
						long.class);

				method.invoke(_puestoRemoteModel, requerimientoRecursoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUsuarioHitssId() {
		return _usuarioHitssId;
	}

	@Override
	public void setUsuarioHitssId(long usuarioHitssId) {
		_usuarioHitssId = usuarioHitssId;

		if (_puestoRemoteModel != null) {
			try {
				Class<?> clazz = _puestoRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuarioHitssId", long.class);

				method.invoke(_puestoRemoteModel, usuarioHitssId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPuestoRemoteModel() {
		return _puestoRemoteModel;
	}

	public void setPuestoRemoteModel(BaseModel<?> puestoRemoteModel) {
		_puestoRemoteModel = puestoRemoteModel;
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

		Class<?> remoteModelClass = _puestoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_puestoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PuestoLocalServiceUtil.addPuesto(this);
		}
		else {
			PuestoLocalServiceUtil.updatePuesto(this);
		}
	}

	@Override
	public Puesto toEscapedModel() {
		return (Puesto)ProxyUtil.newProxyInstance(Puesto.class.getClassLoader(),
			new Class[] { Puesto.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PuestoClp clone = new PuestoClp();

		clone.setPuestoId(getPuestoId());
		clone.setDescripcion(getDescripcion());
		clone.setFechaContrato(getFechaContrato());
		clone.setFechaEvaluacionPsicologica(getFechaEvaluacionPsicologica());
		clone.setFechaEvalucionTecnica(getFechaEvalucionTecnica());
		clone.setFechaEntrevistaGerenteArea(getFechaEntrevistaGerenteArea());
		clone.setFechaEvaluacionRRHH(getFechaEvaluacionRRHH());
		clone.setFechaPostulacion(getFechaPostulacion());
		clone.setSeleccionado(getSeleccionado());
		clone.setActivo(getActivo());
		clone.setUsuariocrea(getUsuariocrea());
		clone.setFechacrea(getFechacrea());
		clone.setUsuariomodifica(getUsuariomodifica());
		clone.setFechacreamodifica(getFechacreamodifica());
		clone.setRequerimientoRecursoId(getRequerimientoRecursoId());
		clone.setUsuarioHitssId(getUsuarioHitssId());

		return clone;
	}

	@Override
	public int compareTo(Puesto puesto) {
		int value = 0;

		value = DateUtil.compareTo(getFechacrea(), puesto.getFechacrea());

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

		if (!(obj instanceof PuestoClp)) {
			return false;
		}

		PuestoClp puesto = (PuestoClp)obj;

		long primaryKey = puesto.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
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
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{puestoId=");
		sb.append(getPuestoId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", fechaContrato=");
		sb.append(getFechaContrato());
		sb.append(", fechaEvaluacionPsicologica=");
		sb.append(getFechaEvaluacionPsicologica());
		sb.append(", fechaEvalucionTecnica=");
		sb.append(getFechaEvalucionTecnica());
		sb.append(", fechaEntrevistaGerenteArea=");
		sb.append(getFechaEntrevistaGerenteArea());
		sb.append(", fechaEvaluacionRRHH=");
		sb.append(getFechaEvaluacionRRHH());
		sb.append(", fechaPostulacion=");
		sb.append(getFechaPostulacion());
		sb.append(", seleccionado=");
		sb.append(getSeleccionado());
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
		sb.append(", requerimientoRecursoId=");
		sb.append(getRequerimientoRecursoId());
		sb.append(", usuarioHitssId=");
		sb.append(getUsuarioHitssId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.Puesto");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>puestoId</column-name><column-value><![CDATA[");
		sb.append(getPuestoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaContrato</column-name><column-value><![CDATA[");
		sb.append(getFechaContrato());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaEvaluacionPsicologica</column-name><column-value><![CDATA[");
		sb.append(getFechaEvaluacionPsicologica());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaEvalucionTecnica</column-name><column-value><![CDATA[");
		sb.append(getFechaEvalucionTecnica());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaEntrevistaGerenteArea</column-name><column-value><![CDATA[");
		sb.append(getFechaEntrevistaGerenteArea());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaEvaluacionRRHH</column-name><column-value><![CDATA[");
		sb.append(getFechaEvaluacionRRHH());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaPostulacion</column-name><column-value><![CDATA[");
		sb.append(getFechaPostulacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>seleccionado</column-name><column-value><![CDATA[");
		sb.append(getSeleccionado());
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
		sb.append(
			"<column><column-name>requerimientoRecursoId</column-name><column-value><![CDATA[");
		sb.append(getRequerimientoRecursoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioHitssId</column-name><column-value><![CDATA[");
		sb.append(getUsuarioHitssId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _puestoId;
	private String _descripcion;
	private Date _fechaContrato;
	private Date _fechaEvaluacionPsicologica;
	private Date _fechaEvalucionTecnica;
	private Date _fechaEntrevistaGerenteArea;
	private Date _fechaEvaluacionRRHH;
	private Date _fechaPostulacion;
	private boolean _seleccionado;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private long _requerimientoRecursoId;
	private long _usuarioHitssId;
	private BaseModel<?> _puestoRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
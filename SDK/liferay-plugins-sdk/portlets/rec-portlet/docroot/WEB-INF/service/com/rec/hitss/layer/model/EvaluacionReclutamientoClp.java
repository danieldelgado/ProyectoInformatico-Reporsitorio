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
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.rec.hitss.layer.service.ClpSerializer;
import com.rec.hitss.layer.service.EvaluacionReclutamientoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class EvaluacionReclutamientoClp extends BaseModelImpl<EvaluacionReclutamiento>
	implements EvaluacionReclutamiento {
	public EvaluacionReclutamientoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EvaluacionReclutamiento.class;
	}

	@Override
	public String getModelClassName() {
		return EvaluacionReclutamiento.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _ER_ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setER_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ER_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ER_ID", getER_ID());
		attributes.put("ER_ESTADO", getER_ESTADO());
		attributes.put("ER_ACTIVO", getER_ACTIVO());
		attributes.put("ER_USUARIO_CREA", getER_USUARIO_CREA());
		attributes.put("ER_FECHA_CREA", getER_FECHA_CREA());
		attributes.put("ER_USUARIO_MODIFICA", getER_USUARIO_MODIFICA());
		attributes.put("ER_FECHA_MODIFICA", getER_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ER_ID = (Long)attributes.get("ER_ID");

		if (ER_ID != null) {
			setER_ID(ER_ID);
		}

		String ER_ESTADO = (String)attributes.get("ER_ESTADO");

		if (ER_ESTADO != null) {
			setER_ESTADO(ER_ESTADO);
		}

		String ER_ACTIVO = (String)attributes.get("ER_ACTIVO");

		if (ER_ACTIVO != null) {
			setER_ACTIVO(ER_ACTIVO);
		}

		Long ER_USUARIO_CREA = (Long)attributes.get("ER_USUARIO_CREA");

		if (ER_USUARIO_CREA != null) {
			setER_USUARIO_CREA(ER_USUARIO_CREA);
		}

		Date ER_FECHA_CREA = (Date)attributes.get("ER_FECHA_CREA");

		if (ER_FECHA_CREA != null) {
			setER_FECHA_CREA(ER_FECHA_CREA);
		}

		Long ER_USUARIO_MODIFICA = (Long)attributes.get("ER_USUARIO_MODIFICA");

		if (ER_USUARIO_MODIFICA != null) {
			setER_USUARIO_MODIFICA(ER_USUARIO_MODIFICA);
		}

		Date ER_FECHA_MODIFICA = (Date)attributes.get("ER_FECHA_MODIFICA");

		if (ER_FECHA_MODIFICA != null) {
			setER_FECHA_MODIFICA(ER_FECHA_MODIFICA);
		}
	}

	@Override
	public long getER_ID() {
		return _ER_ID;
	}

	@Override
	public void setER_ID(long ER_ID) {
		_ER_ID = ER_ID;

		if (_evaluacionReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setER_ID", long.class);

				method.invoke(_evaluacionReclutamientoRemoteModel, ER_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getER_ESTADO() {
		return _ER_ESTADO;
	}

	@Override
	public void setER_ESTADO(String ER_ESTADO) {
		_ER_ESTADO = ER_ESTADO;

		if (_evaluacionReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setER_ESTADO", String.class);

				method.invoke(_evaluacionReclutamientoRemoteModel, ER_ESTADO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getER_ACTIVO() {
		return _ER_ACTIVO;
	}

	@Override
	public void setER_ACTIVO(String ER_ACTIVO) {
		_ER_ACTIVO = ER_ACTIVO;

		if (_evaluacionReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setER_ACTIVO", String.class);

				method.invoke(_evaluacionReclutamientoRemoteModel, ER_ACTIVO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getER_USUARIO_CREA() {
		return _ER_USUARIO_CREA;
	}

	@Override
	public void setER_USUARIO_CREA(long ER_USUARIO_CREA) {
		_ER_USUARIO_CREA = ER_USUARIO_CREA;

		if (_evaluacionReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setER_USUARIO_CREA", long.class);

				method.invoke(_evaluacionReclutamientoRemoteModel,
					ER_USUARIO_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getER_FECHA_CREA() {
		return _ER_FECHA_CREA;
	}

	@Override
	public void setER_FECHA_CREA(Date ER_FECHA_CREA) {
		_ER_FECHA_CREA = ER_FECHA_CREA;

		if (_evaluacionReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setER_FECHA_CREA", Date.class);

				method.invoke(_evaluacionReclutamientoRemoteModel, ER_FECHA_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getER_USUARIO_MODIFICA() {
		return _ER_USUARIO_MODIFICA;
	}

	@Override
	public void setER_USUARIO_MODIFICA(long ER_USUARIO_MODIFICA) {
		_ER_USUARIO_MODIFICA = ER_USUARIO_MODIFICA;

		if (_evaluacionReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setER_USUARIO_MODIFICA",
						long.class);

				method.invoke(_evaluacionReclutamientoRemoteModel,
					ER_USUARIO_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getER_FECHA_MODIFICA() {
		return _ER_FECHA_MODIFICA;
	}

	@Override
	public void setER_FECHA_MODIFICA(Date ER_FECHA_MODIFICA) {
		_ER_FECHA_MODIFICA = ER_FECHA_MODIFICA;

		if (_evaluacionReclutamientoRemoteModel != null) {
			try {
				Class<?> clazz = _evaluacionReclutamientoRemoteModel.getClass();

				Method method = clazz.getMethod("setER_FECHA_MODIFICA",
						Date.class);

				method.invoke(_evaluacionReclutamientoRemoteModel,
					ER_FECHA_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEvaluacionReclutamientoRemoteModel() {
		return _evaluacionReclutamientoRemoteModel;
	}

	public void setEvaluacionReclutamientoRemoteModel(
		BaseModel<?> evaluacionReclutamientoRemoteModel) {
		_evaluacionReclutamientoRemoteModel = evaluacionReclutamientoRemoteModel;
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

		Class<?> remoteModelClass = _evaluacionReclutamientoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_evaluacionReclutamientoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EvaluacionReclutamientoLocalServiceUtil.addEvaluacionReclutamiento(this);
		}
		else {
			EvaluacionReclutamientoLocalServiceUtil.updateEvaluacionReclutamiento(this);
		}
	}

	@Override
	public EvaluacionReclutamiento toEscapedModel() {
		return (EvaluacionReclutamiento)ProxyUtil.newProxyInstance(EvaluacionReclutamiento.class.getClassLoader(),
			new Class[] { EvaluacionReclutamiento.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EvaluacionReclutamientoClp clone = new EvaluacionReclutamientoClp();

		clone.setER_ID(getER_ID());
		clone.setER_ESTADO(getER_ESTADO());
		clone.setER_ACTIVO(getER_ACTIVO());
		clone.setER_USUARIO_CREA(getER_USUARIO_CREA());
		clone.setER_FECHA_CREA(getER_FECHA_CREA());
		clone.setER_USUARIO_MODIFICA(getER_USUARIO_MODIFICA());
		clone.setER_FECHA_MODIFICA(getER_FECHA_MODIFICA());

		return clone;
	}

	@Override
	public int compareTo(EvaluacionReclutamiento evaluacionReclutamiento) {
		int value = 0;

		if (getER_ID() < evaluacionReclutamiento.getER_ID()) {
			value = -1;
		}
		else if (getER_ID() > evaluacionReclutamiento.getER_ID()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof EvaluacionReclutamientoClp)) {
			return false;
		}

		EvaluacionReclutamientoClp evaluacionReclutamiento = (EvaluacionReclutamientoClp)obj;

		long primaryKey = evaluacionReclutamiento.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{ER_ID=");
		sb.append(getER_ID());
		sb.append(", ER_ESTADO=");
		sb.append(getER_ESTADO());
		sb.append(", ER_ACTIVO=");
		sb.append(getER_ACTIVO());
		sb.append(", ER_USUARIO_CREA=");
		sb.append(getER_USUARIO_CREA());
		sb.append(", ER_FECHA_CREA=");
		sb.append(getER_FECHA_CREA());
		sb.append(", ER_USUARIO_MODIFICA=");
		sb.append(getER_USUARIO_MODIFICA());
		sb.append(", ER_FECHA_MODIFICA=");
		sb.append(getER_FECHA_MODIFICA());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.EvaluacionReclutamiento");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ER_ID</column-name><column-value><![CDATA[");
		sb.append(getER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ER_ESTADO</column-name><column-value><![CDATA[");
		sb.append(getER_ESTADO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ER_ACTIVO</column-name><column-value><![CDATA[");
		sb.append(getER_ACTIVO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ER_USUARIO_CREA</column-name><column-value><![CDATA[");
		sb.append(getER_USUARIO_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ER_FECHA_CREA</column-name><column-value><![CDATA[");
		sb.append(getER_FECHA_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ER_USUARIO_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getER_USUARIO_MODIFICA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ER_FECHA_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getER_FECHA_MODIFICA());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _ER_ID;
	private String _ER_ESTADO;
	private String _ER_ACTIVO;
	private long _ER_USUARIO_CREA;
	private Date _ER_FECHA_CREA;
	private long _ER_USUARIO_MODIFICA;
	private Date _ER_FECHA_MODIFICA;
	private BaseModel<?> _evaluacionReclutamientoRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
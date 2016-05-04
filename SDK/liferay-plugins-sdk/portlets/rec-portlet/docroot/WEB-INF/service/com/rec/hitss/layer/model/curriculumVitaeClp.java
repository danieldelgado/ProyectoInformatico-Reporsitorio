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
import com.rec.hitss.layer.service.curriculumVitaeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class curriculumVitaeClp extends BaseModelImpl<curriculumVitae>
	implements curriculumVitae {
	public curriculumVitaeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return curriculumVitae.class;
	}

	@Override
	public String getModelClassName() {
		return curriculumVitae.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _CV_ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCV_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _CV_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CV_ID", getCV_ID());
		attributes.put("CV_ESTADO", getCV_ESTADO());
		attributes.put("CV_ACTIVO", getCV_ACTIVO());
		attributes.put("CV_USUARIO_CREA", getCV_USUARIO_CREA());
		attributes.put("CV_FECHA_CREA", getCV_FECHA_CREA());
		attributes.put("CV_USUARIO_MODIFICA", getCV_USUARIO_MODIFICA());
		attributes.put("CV_FECHA_MODIFICA", getCV_FECHA_MODIFICA());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long CV_ID = (Long)attributes.get("CV_ID");

		if (CV_ID != null) {
			setCV_ID(CV_ID);
		}

		String CV_ESTADO = (String)attributes.get("CV_ESTADO");

		if (CV_ESTADO != null) {
			setCV_ESTADO(CV_ESTADO);
		}

		String CV_ACTIVO = (String)attributes.get("CV_ACTIVO");

		if (CV_ACTIVO != null) {
			setCV_ACTIVO(CV_ACTIVO);
		}

		Long CV_USUARIO_CREA = (Long)attributes.get("CV_USUARIO_CREA");

		if (CV_USUARIO_CREA != null) {
			setCV_USUARIO_CREA(CV_USUARIO_CREA);
		}

		Date CV_FECHA_CREA = (Date)attributes.get("CV_FECHA_CREA");

		if (CV_FECHA_CREA != null) {
			setCV_FECHA_CREA(CV_FECHA_CREA);
		}

		Long CV_USUARIO_MODIFICA = (Long)attributes.get("CV_USUARIO_MODIFICA");

		if (CV_USUARIO_MODIFICA != null) {
			setCV_USUARIO_MODIFICA(CV_USUARIO_MODIFICA);
		}

		Date CV_FECHA_MODIFICA = (Date)attributes.get("CV_FECHA_MODIFICA");

		if (CV_FECHA_MODIFICA != null) {
			setCV_FECHA_MODIFICA(CV_FECHA_MODIFICA);
		}
	}

	@Override
	public long getCV_ID() {
		return _CV_ID;
	}

	@Override
	public void setCV_ID(long CV_ID) {
		_CV_ID = CV_ID;

		if (_curriculumVitaeRemoteModel != null) {
			try {
				Class<?> clazz = _curriculumVitaeRemoteModel.getClass();

				Method method = clazz.getMethod("setCV_ID", long.class);

				method.invoke(_curriculumVitaeRemoteModel, CV_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCV_ESTADO() {
		return _CV_ESTADO;
	}

	@Override
	public void setCV_ESTADO(String CV_ESTADO) {
		_CV_ESTADO = CV_ESTADO;

		if (_curriculumVitaeRemoteModel != null) {
			try {
				Class<?> clazz = _curriculumVitaeRemoteModel.getClass();

				Method method = clazz.getMethod("setCV_ESTADO", String.class);

				method.invoke(_curriculumVitaeRemoteModel, CV_ESTADO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCV_ACTIVO() {
		return _CV_ACTIVO;
	}

	@Override
	public void setCV_ACTIVO(String CV_ACTIVO) {
		_CV_ACTIVO = CV_ACTIVO;

		if (_curriculumVitaeRemoteModel != null) {
			try {
				Class<?> clazz = _curriculumVitaeRemoteModel.getClass();

				Method method = clazz.getMethod("setCV_ACTIVO", String.class);

				method.invoke(_curriculumVitaeRemoteModel, CV_ACTIVO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCV_USUARIO_CREA() {
		return _CV_USUARIO_CREA;
	}

	@Override
	public void setCV_USUARIO_CREA(long CV_USUARIO_CREA) {
		_CV_USUARIO_CREA = CV_USUARIO_CREA;

		if (_curriculumVitaeRemoteModel != null) {
			try {
				Class<?> clazz = _curriculumVitaeRemoteModel.getClass();

				Method method = clazz.getMethod("setCV_USUARIO_CREA", long.class);

				method.invoke(_curriculumVitaeRemoteModel, CV_USUARIO_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCV_FECHA_CREA() {
		return _CV_FECHA_CREA;
	}

	@Override
	public void setCV_FECHA_CREA(Date CV_FECHA_CREA) {
		_CV_FECHA_CREA = CV_FECHA_CREA;

		if (_curriculumVitaeRemoteModel != null) {
			try {
				Class<?> clazz = _curriculumVitaeRemoteModel.getClass();

				Method method = clazz.getMethod("setCV_FECHA_CREA", Date.class);

				method.invoke(_curriculumVitaeRemoteModel, CV_FECHA_CREA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCV_USUARIO_MODIFICA() {
		return _CV_USUARIO_MODIFICA;
	}

	@Override
	public void setCV_USUARIO_MODIFICA(long CV_USUARIO_MODIFICA) {
		_CV_USUARIO_MODIFICA = CV_USUARIO_MODIFICA;

		if (_curriculumVitaeRemoteModel != null) {
			try {
				Class<?> clazz = _curriculumVitaeRemoteModel.getClass();

				Method method = clazz.getMethod("setCV_USUARIO_MODIFICA",
						long.class);

				method.invoke(_curriculumVitaeRemoteModel, CV_USUARIO_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCV_FECHA_MODIFICA() {
		return _CV_FECHA_MODIFICA;
	}

	@Override
	public void setCV_FECHA_MODIFICA(Date CV_FECHA_MODIFICA) {
		_CV_FECHA_MODIFICA = CV_FECHA_MODIFICA;

		if (_curriculumVitaeRemoteModel != null) {
			try {
				Class<?> clazz = _curriculumVitaeRemoteModel.getClass();

				Method method = clazz.getMethod("setCV_FECHA_MODIFICA",
						Date.class);

				method.invoke(_curriculumVitaeRemoteModel, CV_FECHA_MODIFICA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getcurriculumVitaeRemoteModel() {
		return _curriculumVitaeRemoteModel;
	}

	public void setcurriculumVitaeRemoteModel(
		BaseModel<?> curriculumVitaeRemoteModel) {
		_curriculumVitaeRemoteModel = curriculumVitaeRemoteModel;
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

		Class<?> remoteModelClass = _curriculumVitaeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_curriculumVitaeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			curriculumVitaeLocalServiceUtil.addcurriculumVitae(this);
		}
		else {
			curriculumVitaeLocalServiceUtil.updatecurriculumVitae(this);
		}
	}

	@Override
	public curriculumVitae toEscapedModel() {
		return (curriculumVitae)ProxyUtil.newProxyInstance(curriculumVitae.class.getClassLoader(),
			new Class[] { curriculumVitae.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		curriculumVitaeClp clone = new curriculumVitaeClp();

		clone.setCV_ID(getCV_ID());
		clone.setCV_ESTADO(getCV_ESTADO());
		clone.setCV_ACTIVO(getCV_ACTIVO());
		clone.setCV_USUARIO_CREA(getCV_USUARIO_CREA());
		clone.setCV_FECHA_CREA(getCV_FECHA_CREA());
		clone.setCV_USUARIO_MODIFICA(getCV_USUARIO_MODIFICA());
		clone.setCV_FECHA_MODIFICA(getCV_FECHA_MODIFICA());

		return clone;
	}

	@Override
	public int compareTo(curriculumVitae curriculumVitae) {
		int value = 0;

		if (getCV_ID() < curriculumVitae.getCV_ID()) {
			value = -1;
		}
		else if (getCV_ID() > curriculumVitae.getCV_ID()) {
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

		if (!(obj instanceof curriculumVitaeClp)) {
			return false;
		}

		curriculumVitaeClp curriculumVitae = (curriculumVitaeClp)obj;

		long primaryKey = curriculumVitae.getPrimaryKey();

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

		sb.append("{CV_ID=");
		sb.append(getCV_ID());
		sb.append(", CV_ESTADO=");
		sb.append(getCV_ESTADO());
		sb.append(", CV_ACTIVO=");
		sb.append(getCV_ACTIVO());
		sb.append(", CV_USUARIO_CREA=");
		sb.append(getCV_USUARIO_CREA());
		sb.append(", CV_FECHA_CREA=");
		sb.append(getCV_FECHA_CREA());
		sb.append(", CV_USUARIO_MODIFICA=");
		sb.append(getCV_USUARIO_MODIFICA());
		sb.append(", CV_FECHA_MODIFICA=");
		sb.append(getCV_FECHA_MODIFICA());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.curriculumVitae");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>CV_ID</column-name><column-value><![CDATA[");
		sb.append(getCV_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CV_ESTADO</column-name><column-value><![CDATA[");
		sb.append(getCV_ESTADO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CV_ACTIVO</column-name><column-value><![CDATA[");
		sb.append(getCV_ACTIVO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CV_USUARIO_CREA</column-name><column-value><![CDATA[");
		sb.append(getCV_USUARIO_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CV_FECHA_CREA</column-name><column-value><![CDATA[");
		sb.append(getCV_FECHA_CREA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CV_USUARIO_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getCV_USUARIO_MODIFICA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CV_FECHA_MODIFICA</column-name><column-value><![CDATA[");
		sb.append(getCV_FECHA_MODIFICA());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _CV_ID;
	private String _CV_ESTADO;
	private String _CV_ACTIVO;
	private long _CV_USUARIO_CREA;
	private Date _CV_FECHA_CREA;
	private long _CV_USUARIO_MODIFICA;
	private Date _CV_FECHA_MODIFICA;
	private BaseModel<?> _curriculumVitaeRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
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
import com.rec.hitss.layer.service.EtiquetaRelacionadaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Crossfire
 */
public class EtiquetaRelacionadaClp extends BaseModelImpl<EtiquetaRelacionada>
	implements EtiquetaRelacionada {
	public EtiquetaRelacionadaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EtiquetaRelacionada.class;
	}

	@Override
	public String getModelClassName() {
		return EtiquetaRelacionada.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _etiquetaRelacionadaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEtiquetaRelacionadaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _etiquetaRelacionadaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("etiquetaRelacionadaId", getEtiquetaRelacionadaId());
		attributes.put("registroId", getRegistroId());
		attributes.put("etiqueta", getEtiqueta());
		attributes.put("tabla", getTabla());
		attributes.put("tagId", getTagId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long etiquetaRelacionadaId = (Long)attributes.get(
				"etiquetaRelacionadaId");

		if (etiquetaRelacionadaId != null) {
			setEtiquetaRelacionadaId(etiquetaRelacionadaId);
		}

		Long registroId = (Long)attributes.get("registroId");

		if (registroId != null) {
			setRegistroId(registroId);
		}

		Long etiqueta = (Long)attributes.get("etiqueta");

		if (etiqueta != null) {
			setEtiqueta(etiqueta);
		}

		Long tabla = (Long)attributes.get("tabla");

		if (tabla != null) {
			setTabla(tabla);
		}

		Long tagId = (Long)attributes.get("tagId");

		if (tagId != null) {
			setTagId(tagId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}
	}

	@Override
	public long getEtiquetaRelacionadaId() {
		return _etiquetaRelacionadaId;
	}

	@Override
	public void setEtiquetaRelacionadaId(long etiquetaRelacionadaId) {
		_etiquetaRelacionadaId = etiquetaRelacionadaId;

		if (_etiquetaRelacionadaRemoteModel != null) {
			try {
				Class<?> clazz = _etiquetaRelacionadaRemoteModel.getClass();

				Method method = clazz.getMethod("setEtiquetaRelacionadaId",
						long.class);

				method.invoke(_etiquetaRelacionadaRemoteModel,
					etiquetaRelacionadaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRegistroId() {
		return _registroId;
	}

	@Override
	public void setRegistroId(long registroId) {
		_registroId = registroId;

		if (_etiquetaRelacionadaRemoteModel != null) {
			try {
				Class<?> clazz = _etiquetaRelacionadaRemoteModel.getClass();

				Method method = clazz.getMethod("setRegistroId", long.class);

				method.invoke(_etiquetaRelacionadaRemoteModel, registroId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEtiqueta() {
		return _etiqueta;
	}

	@Override
	public void setEtiqueta(long etiqueta) {
		_etiqueta = etiqueta;

		if (_etiquetaRelacionadaRemoteModel != null) {
			try {
				Class<?> clazz = _etiquetaRelacionadaRemoteModel.getClass();

				Method method = clazz.getMethod("setEtiqueta", long.class);

				method.invoke(_etiquetaRelacionadaRemoteModel, etiqueta);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTabla() {
		return _tabla;
	}

	@Override
	public void setTabla(long tabla) {
		_tabla = tabla;

		if (_etiquetaRelacionadaRemoteModel != null) {
			try {
				Class<?> clazz = _etiquetaRelacionadaRemoteModel.getClass();

				Method method = clazz.getMethod("setTabla", long.class);

				method.invoke(_etiquetaRelacionadaRemoteModel, tabla);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTagId() {
		return _tagId;
	}

	@Override
	public void setTagId(long tagId) {
		_tagId = tagId;

		if (_etiquetaRelacionadaRemoteModel != null) {
			try {
				Class<?> clazz = _etiquetaRelacionadaRemoteModel.getClass();

				Method method = clazz.getMethod("setTagId", long.class);

				method.invoke(_etiquetaRelacionadaRemoteModel, tagId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_etiquetaRelacionadaRemoteModel != null) {
			try {
				Class<?> clazz = _etiquetaRelacionadaRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_etiquetaRelacionadaRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_etiquetaRelacionadaRemoteModel != null) {
			try {
				Class<?> clazz = _etiquetaRelacionadaRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_etiquetaRelacionadaRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEtiquetaRelacionadaRemoteModel() {
		return _etiquetaRelacionadaRemoteModel;
	}

	public void setEtiquetaRelacionadaRemoteModel(
		BaseModel<?> etiquetaRelacionadaRemoteModel) {
		_etiquetaRelacionadaRemoteModel = etiquetaRelacionadaRemoteModel;
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

		Class<?> remoteModelClass = _etiquetaRelacionadaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_etiquetaRelacionadaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EtiquetaRelacionadaLocalServiceUtil.addEtiquetaRelacionada(this);
		}
		else {
			EtiquetaRelacionadaLocalServiceUtil.updateEtiquetaRelacionada(this);
		}
	}

	@Override
	public EtiquetaRelacionada toEscapedModel() {
		return (EtiquetaRelacionada)ProxyUtil.newProxyInstance(EtiquetaRelacionada.class.getClassLoader(),
			new Class[] { EtiquetaRelacionada.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EtiquetaRelacionadaClp clone = new EtiquetaRelacionadaClp();

		clone.setEtiquetaRelacionadaId(getEtiquetaRelacionadaId());
		clone.setRegistroId(getRegistroId());
		clone.setEtiqueta(getEtiqueta());
		clone.setTabla(getTabla());
		clone.setTagId(getTagId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());

		return clone;
	}

	@Override
	public int compareTo(EtiquetaRelacionada etiquetaRelacionada) {
		long primaryKey = etiquetaRelacionada.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EtiquetaRelacionadaClp)) {
			return false;
		}

		EtiquetaRelacionadaClp etiquetaRelacionada = (EtiquetaRelacionadaClp)obj;

		long primaryKey = etiquetaRelacionada.getPrimaryKey();

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

		sb.append("{etiquetaRelacionadaId=");
		sb.append(getEtiquetaRelacionadaId());
		sb.append(", registroId=");
		sb.append(getRegistroId());
		sb.append(", etiqueta=");
		sb.append(getEtiqueta());
		sb.append(", tabla=");
		sb.append(getTabla());
		sb.append(", tagId=");
		sb.append(getTagId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.rec.hitss.layer.model.EtiquetaRelacionada");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>etiquetaRelacionadaId</column-name><column-value><![CDATA[");
		sb.append(getEtiquetaRelacionadaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registroId</column-name><column-value><![CDATA[");
		sb.append(getRegistroId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>etiqueta</column-name><column-value><![CDATA[");
		sb.append(getEtiqueta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tabla</column-name><column-value><![CDATA[");
		sb.append(getTabla());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tagId</column-name><column-value><![CDATA[");
		sb.append(getTagId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _etiquetaRelacionadaId;
	private long _registroId;
	private long _etiqueta;
	private long _tabla;
	private long _tagId;
	private long _groupId;
	private long _companyId;
	private BaseModel<?> _etiquetaRelacionadaRemoteModel;
	private Class<?> _clpSerializerClass = com.rec.hitss.layer.service.ClpSerializer.class;
}
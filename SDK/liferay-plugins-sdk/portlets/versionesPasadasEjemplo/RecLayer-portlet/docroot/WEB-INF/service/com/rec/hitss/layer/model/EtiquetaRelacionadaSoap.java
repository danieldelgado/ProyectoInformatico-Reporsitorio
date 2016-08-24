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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.EtiquetaRelacionadaServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.EtiquetaRelacionadaServiceSoap
 * @generated
 */
public class EtiquetaRelacionadaSoap implements Serializable {
	public static EtiquetaRelacionadaSoap toSoapModel(EtiquetaRelacionada model) {
		EtiquetaRelacionadaSoap soapModel = new EtiquetaRelacionadaSoap();

		soapModel.setEtiquetaRelacionadaId(model.getEtiquetaRelacionadaId());
		soapModel.setRegistroId(model.getRegistroId());
		soapModel.setEtiqueta(model.getEtiqueta());
		soapModel.setTabla(model.getTabla());
		soapModel.setTagId(model.getTagId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());

		return soapModel;
	}

	public static EtiquetaRelacionadaSoap[] toSoapModels(
		EtiquetaRelacionada[] models) {
		EtiquetaRelacionadaSoap[] soapModels = new EtiquetaRelacionadaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EtiquetaRelacionadaSoap[][] toSoapModels(
		EtiquetaRelacionada[][] models) {
		EtiquetaRelacionadaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EtiquetaRelacionadaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EtiquetaRelacionadaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EtiquetaRelacionadaSoap[] toSoapModels(
		List<EtiquetaRelacionada> models) {
		List<EtiquetaRelacionadaSoap> soapModels = new ArrayList<EtiquetaRelacionadaSoap>(models.size());

		for (EtiquetaRelacionada model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EtiquetaRelacionadaSoap[soapModels.size()]);
	}

	public EtiquetaRelacionadaSoap() {
	}

	public long getPrimaryKey() {
		return _etiquetaRelacionadaId;
	}

	public void setPrimaryKey(long pk) {
		setEtiquetaRelacionadaId(pk);
	}

	public long getEtiquetaRelacionadaId() {
		return _etiquetaRelacionadaId;
	}

	public void setEtiquetaRelacionadaId(long etiquetaRelacionadaId) {
		_etiquetaRelacionadaId = etiquetaRelacionadaId;
	}

	public long getRegistroId() {
		return _registroId;
	}

	public void setRegistroId(long registroId) {
		_registroId = registroId;
	}

	public long getEtiqueta() {
		return _etiqueta;
	}

	public void setEtiqueta(long etiqueta) {
		_etiqueta = etiqueta;
	}

	public long getTabla() {
		return _tabla;
	}

	public void setTabla(long tabla) {
		_tabla = tabla;
	}

	public long getTagId() {
		return _tagId;
	}

	public void setTagId(long tagId) {
		_tagId = tagId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	private long _etiquetaRelacionadaId;
	private long _registroId;
	private long _etiqueta;
	private long _tabla;
	private long _tagId;
	private long _groupId;
	private long _companyId;
}
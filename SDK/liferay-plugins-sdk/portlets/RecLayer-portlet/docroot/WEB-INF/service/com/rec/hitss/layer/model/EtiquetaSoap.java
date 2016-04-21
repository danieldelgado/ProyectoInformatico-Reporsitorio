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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.EtiquetaServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.EtiquetaServiceSoap
 * @generated
 */
public class EtiquetaSoap implements Serializable {
	public static EtiquetaSoap toSoapModel(Etiqueta model) {
		EtiquetaSoap soapModel = new EtiquetaSoap();

		soapModel.setEtiquetaId(model.getEtiquetaId());
		soapModel.setTagId(model.getTagId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());

		return soapModel;
	}

	public static EtiquetaSoap[] toSoapModels(Etiqueta[] models) {
		EtiquetaSoap[] soapModels = new EtiquetaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EtiquetaSoap[][] toSoapModels(Etiqueta[][] models) {
		EtiquetaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EtiquetaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EtiquetaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EtiquetaSoap[] toSoapModels(List<Etiqueta> models) {
		List<EtiquetaSoap> soapModels = new ArrayList<EtiquetaSoap>(models.size());

		for (Etiqueta model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EtiquetaSoap[soapModels.size()]);
	}

	public EtiquetaSoap() {
	}

	public long getPrimaryKey() {
		return _etiquetaId;
	}

	public void setPrimaryKey(long pk) {
		setEtiquetaId(pk);
	}

	public long getEtiquetaId() {
		return _etiquetaId;
	}

	public void setEtiquetaId(long etiquetaId) {
		_etiquetaId = etiquetaId;
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

	private long _etiquetaId;
	private long _tagId;
	private long _groupId;
	private long _companyId;
}
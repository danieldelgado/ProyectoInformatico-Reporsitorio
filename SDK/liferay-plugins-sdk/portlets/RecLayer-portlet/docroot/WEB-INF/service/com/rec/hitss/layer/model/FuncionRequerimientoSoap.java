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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.FuncionRequerimientoServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.FuncionRequerimientoServiceSoap
 * @generated
 */
public class FuncionRequerimientoSoap implements Serializable {
	public static FuncionRequerimientoSoap toSoapModel(
		FuncionRequerimiento model) {
		FuncionRequerimientoSoap soapModel = new FuncionRequerimientoSoap();

		soapModel.setFuncionId(model.getFuncionId());
		soapModel.setRequerimientoRecursoId(model.getRequerimientoRecursoId());

		return soapModel;
	}

	public static FuncionRequerimientoSoap[] toSoapModels(
		FuncionRequerimiento[] models) {
		FuncionRequerimientoSoap[] soapModels = new FuncionRequerimientoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FuncionRequerimientoSoap[][] toSoapModels(
		FuncionRequerimiento[][] models) {
		FuncionRequerimientoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FuncionRequerimientoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FuncionRequerimientoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FuncionRequerimientoSoap[] toSoapModels(
		List<FuncionRequerimiento> models) {
		List<FuncionRequerimientoSoap> soapModels = new ArrayList<FuncionRequerimientoSoap>(models.size());

		for (FuncionRequerimiento model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FuncionRequerimientoSoap[soapModels.size()]);
	}

	public FuncionRequerimientoSoap() {
	}

	public long getPrimaryKey() {
		return _funcionId;
	}

	public void setPrimaryKey(long pk) {
		setFuncionId(pk);
	}

	public long getFuncionId() {
		return _funcionId;
	}

	public void setFuncionId(long funcionId) {
		_funcionId = funcionId;
	}

	public long getRequerimientoRecursoId() {
		return _requerimientoRecursoId;
	}

	public void setRequerimientoRecursoId(long requerimientoRecursoId) {
		_requerimientoRecursoId = requerimientoRecursoId;
	}

	private long _funcionId;
	private long _requerimientoRecursoId;
}
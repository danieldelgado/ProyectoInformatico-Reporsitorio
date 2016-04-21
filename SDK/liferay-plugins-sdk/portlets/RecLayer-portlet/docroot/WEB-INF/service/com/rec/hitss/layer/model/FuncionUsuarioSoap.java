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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.FuncionUsuarioServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.FuncionUsuarioServiceSoap
 * @generated
 */
public class FuncionUsuarioSoap implements Serializable {
	public static FuncionUsuarioSoap toSoapModel(FuncionUsuario model) {
		FuncionUsuarioSoap soapModel = new FuncionUsuarioSoap();

		soapModel.setFuncionId(model.getFuncionId());
		soapModel.setUsuarioHitssId(model.getUsuarioHitssId());

		return soapModel;
	}

	public static FuncionUsuarioSoap[] toSoapModels(FuncionUsuario[] models) {
		FuncionUsuarioSoap[] soapModels = new FuncionUsuarioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FuncionUsuarioSoap[][] toSoapModels(FuncionUsuario[][] models) {
		FuncionUsuarioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FuncionUsuarioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FuncionUsuarioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FuncionUsuarioSoap[] toSoapModels(List<FuncionUsuario> models) {
		List<FuncionUsuarioSoap> soapModels = new ArrayList<FuncionUsuarioSoap>(models.size());

		for (FuncionUsuario model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FuncionUsuarioSoap[soapModels.size()]);
	}

	public FuncionUsuarioSoap() {
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

	public long getUsuarioHitssId() {
		return _usuarioHitssId;
	}

	public void setUsuarioHitssId(long usuarioHitssId) {
		_usuarioHitssId = usuarioHitssId;
	}

	private long _funcionId;
	private long _usuarioHitssId;
}
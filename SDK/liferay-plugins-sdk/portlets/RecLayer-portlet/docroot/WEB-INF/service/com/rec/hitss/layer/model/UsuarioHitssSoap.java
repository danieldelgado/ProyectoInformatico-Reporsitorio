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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.UsuarioHitssServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.UsuarioHitssServiceSoap
 * @generated
 */
public class UsuarioHitssSoap implements Serializable {
	public static UsuarioHitssSoap toSoapModel(UsuarioHitss model) {
		UsuarioHitssSoap soapModel = new UsuarioHitssSoap();

		soapModel.setUsuarioHitssId(model.getUsuarioHitssId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserUuId(model.getUserUuId());
		soapModel.setActividadPlanId(model.getActividadPlanId());

		return soapModel;
	}

	public static UsuarioHitssSoap[] toSoapModels(UsuarioHitss[] models) {
		UsuarioHitssSoap[] soapModels = new UsuarioHitssSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UsuarioHitssSoap[][] toSoapModels(UsuarioHitss[][] models) {
		UsuarioHitssSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UsuarioHitssSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UsuarioHitssSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UsuarioHitssSoap[] toSoapModels(List<UsuarioHitss> models) {
		List<UsuarioHitssSoap> soapModels = new ArrayList<UsuarioHitssSoap>(models.size());

		for (UsuarioHitss model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UsuarioHitssSoap[soapModels.size()]);
	}

	public UsuarioHitssSoap() {
	}

	public long getPrimaryKey() {
		return _usuarioHitssId;
	}

	public void setPrimaryKey(long pk) {
		setUsuarioHitssId(pk);
	}

	public long getUsuarioHitssId() {
		return _usuarioHitssId;
	}

	public void setUsuarioHitssId(long usuarioHitssId) {
		_usuarioHitssId = usuarioHitssId;
	}

	public String getUserId() {
		return _userId;
	}

	public void setUserId(String userId) {
		_userId = userId;
	}

	public String getUserUuId() {
		return _userUuId;
	}

	public void setUserUuId(String userUuId) {
		_userUuId = userUuId;
	}

	public long getActividadPlanId() {
		return _actividadPlanId;
	}

	public void setActividadPlanId(long actividadPlanId) {
		_actividadPlanId = actividadPlanId;
	}

	private long _usuarioHitssId;
	private String _userId;
	private String _userUuId;
	private long _actividadPlanId;
}
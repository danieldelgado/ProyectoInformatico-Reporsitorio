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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.UsuarioGrupoServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.UsuarioGrupoServiceSoap
 * @generated
 */
public class UsuarioGrupoSoap implements Serializable {
	public static UsuarioGrupoSoap toSoapModel(UsuarioGrupo model) {
		UsuarioGrupoSoap soapModel = new UsuarioGrupoSoap();

		soapModel.setUserGroupId(model.getUserGroupId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setPrioridadEquiposId(model.getPrioridadEquiposId());

		return soapModel;
	}

	public static UsuarioGrupoSoap[] toSoapModels(UsuarioGrupo[] models) {
		UsuarioGrupoSoap[] soapModels = new UsuarioGrupoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UsuarioGrupoSoap[][] toSoapModels(UsuarioGrupo[][] models) {
		UsuarioGrupoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UsuarioGrupoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UsuarioGrupoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UsuarioGrupoSoap[] toSoapModels(List<UsuarioGrupo> models) {
		List<UsuarioGrupoSoap> soapModels = new ArrayList<UsuarioGrupoSoap>(models.size());

		for (UsuarioGrupo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UsuarioGrupoSoap[soapModels.size()]);
	}

	public UsuarioGrupoSoap() {
	}

	public long getPrimaryKey() {
		return _userGroupId;
	}

	public void setPrimaryKey(long pk) {
		setUserGroupId(pk);
	}

	public long getUserGroupId() {
		return _userGroupId;
	}

	public void setUserGroupId(long userGroupId) {
		_userGroupId = userGroupId;
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

	public long getPrioridadEquiposId() {
		return _prioridadEquiposId;
	}

	public void setPrioridadEquiposId(long prioridadEquiposId) {
		_prioridadEquiposId = prioridadEquiposId;
	}

	private long _userGroupId;
	private long _groupId;
	private long _companyId;
	private long _prioridadEquiposId;
}
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

package com.rec.hitss.layer.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.rec.hitss.layer.model.UsuarioGrupo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UsuarioGrupo in entity cache.
 *
 * @author Crossfire
 * @see UsuarioGrupo
 * @generated
 */
public class UsuarioGrupoCacheModel implements CacheModel<UsuarioGrupo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{userGroupId=");
		sb.append(userGroupId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", prioridadEquiposId=");
		sb.append(prioridadEquiposId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UsuarioGrupo toEntityModel() {
		UsuarioGrupoImpl usuarioGrupoImpl = new UsuarioGrupoImpl();

		usuarioGrupoImpl.setUserGroupId(userGroupId);
		usuarioGrupoImpl.setGroupId(groupId);
		usuarioGrupoImpl.setCompanyId(companyId);
		usuarioGrupoImpl.setPrioridadEquiposId(prioridadEquiposId);

		usuarioGrupoImpl.resetOriginalValues();

		return usuarioGrupoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userGroupId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		prioridadEquiposId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(userGroupId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(prioridadEquiposId);
	}

	public long userGroupId;
	public long groupId;
	public long companyId;
	public long prioridadEquiposId;
}
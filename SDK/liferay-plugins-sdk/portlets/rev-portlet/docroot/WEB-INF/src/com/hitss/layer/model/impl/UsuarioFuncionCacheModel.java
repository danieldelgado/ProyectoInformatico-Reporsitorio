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

package com.hitss.layer.model.impl;

import com.hitss.layer.model.UsuarioFuncion;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UsuarioFuncion in entity cache.
 *
 * @author Danielle Delgado
 * @see UsuarioFuncion
 * @generated
 */
public class UsuarioFuncionCacheModel implements CacheModel<UsuarioFuncion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{userId=");
		sb.append(userId);
		sb.append(", funcionId=");
		sb.append(funcionId);
		sb.append(", exigible=");
		sb.append(exigible);
		sb.append(", activo=");
		sb.append(activo);
		sb.append(", usuariocrea=");
		sb.append(usuariocrea);
		sb.append(", fechacrea=");
		sb.append(fechacrea);
		sb.append(", usuariomodifica=");
		sb.append(usuariomodifica);
		sb.append(", fechamodifica=");
		sb.append(fechamodifica);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UsuarioFuncion toEntityModel() {
		UsuarioFuncionImpl usuarioFuncionImpl = new UsuarioFuncionImpl();

		usuarioFuncionImpl.setUserId(userId);
		usuarioFuncionImpl.setFuncionId(funcionId);
		usuarioFuncionImpl.setExigible(exigible);
		usuarioFuncionImpl.setActivo(activo);
		usuarioFuncionImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			usuarioFuncionImpl.setFechacrea(null);
		}
		else {
			usuarioFuncionImpl.setFechacrea(new Date(fechacrea));
		}

		usuarioFuncionImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			usuarioFuncionImpl.setFechamodifica(null);
		}
		else {
			usuarioFuncionImpl.setFechamodifica(new Date(fechamodifica));
		}

		usuarioFuncionImpl.resetOriginalValues();

		return usuarioFuncionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userId = objectInput.readLong();
		funcionId = objectInput.readLong();
		exigible = objectInput.readBoolean();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(userId);
		objectOutput.writeLong(funcionId);
		objectOutput.writeBoolean(exigible);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechamodifica);
	}

	public long userId;
	public long funcionId;
	public boolean exigible;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}
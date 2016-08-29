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

import com.hitss.layer.model.SolicitudRequerimientoFuncion;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SolicitudRequerimientoFuncion in entity cache.
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoFuncion
 * @generated
 */
public class SolicitudRequerimientoFuncionCacheModel implements CacheModel<SolicitudRequerimientoFuncion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{solicitudFuncionId=");
		sb.append(solicitudFuncionId);
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
	public SolicitudRequerimientoFuncion toEntityModel() {
		SolicitudRequerimientoFuncionImpl solicitudRequerimientoFuncionImpl = new SolicitudRequerimientoFuncionImpl();

		solicitudRequerimientoFuncionImpl.setSolicitudFuncionId(solicitudFuncionId);
		solicitudRequerimientoFuncionImpl.setFuncionId(funcionId);
		solicitudRequerimientoFuncionImpl.setExigible(exigible);
		solicitudRequerimientoFuncionImpl.setActivo(activo);
		solicitudRequerimientoFuncionImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			solicitudRequerimientoFuncionImpl.setFechacrea(null);
		}
		else {
			solicitudRequerimientoFuncionImpl.setFechacrea(new Date(fechacrea));
		}

		solicitudRequerimientoFuncionImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			solicitudRequerimientoFuncionImpl.setFechamodifica(null);
		}
		else {
			solicitudRequerimientoFuncionImpl.setFechamodifica(new Date(
					fechamodifica));
		}

		solicitudRequerimientoFuncionImpl.resetOriginalValues();

		return solicitudRequerimientoFuncionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		solicitudFuncionId = objectInput.readLong();
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
		objectOutput.writeLong(solicitudFuncionId);
		objectOutput.writeLong(funcionId);
		objectOutput.writeBoolean(exigible);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechamodifica);
	}

	public long solicitudFuncionId;
	public long funcionId;
	public boolean exigible;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}
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

import com.hitss.layer.model.RegistrarActividadPlanUsuario;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RegistrarActividadPlanUsuario in entity cache.
 *
 * @author Danielle Delgado
 * @see RegistrarActividadPlanUsuario
 * @generated
 */
public class RegistrarActividadPlanUsuarioCacheModel implements CacheModel<RegistrarActividadPlanUsuario>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{actividadPlanId=");
		sb.append(actividadPlanId);
		sb.append(", regisitrarActividadPlanUsuariocoId=");
		sb.append(regisitrarActividadPlanUsuariocoId);
		sb.append(", usuarioId=");
		sb.append(usuarioId);
		sb.append(", cumplio=");
		sb.append(cumplio);
		sb.append(", actividad=");
		sb.append(actividad);
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
	public RegistrarActividadPlanUsuario toEntityModel() {
		RegistrarActividadPlanUsuarioImpl registrarActividadPlanUsuarioImpl = new RegistrarActividadPlanUsuarioImpl();

		registrarActividadPlanUsuarioImpl.setActividadPlanId(actividadPlanId);
		registrarActividadPlanUsuarioImpl.setRegisitrarActividadPlanUsuariocoId(regisitrarActividadPlanUsuariocoId);
		registrarActividadPlanUsuarioImpl.setUsuarioId(usuarioId);
		registrarActividadPlanUsuarioImpl.setCumplio(cumplio);

		if (actividad == null) {
			registrarActividadPlanUsuarioImpl.setActividad(StringPool.BLANK);
		}
		else {
			registrarActividadPlanUsuarioImpl.setActividad(actividad);
		}

		registrarActividadPlanUsuarioImpl.setActivo(activo);
		registrarActividadPlanUsuarioImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			registrarActividadPlanUsuarioImpl.setFechacrea(null);
		}
		else {
			registrarActividadPlanUsuarioImpl.setFechacrea(new Date(fechacrea));
		}

		registrarActividadPlanUsuarioImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			registrarActividadPlanUsuarioImpl.setFechamodifica(null);
		}
		else {
			registrarActividadPlanUsuarioImpl.setFechamodifica(new Date(
					fechamodifica));
		}

		registrarActividadPlanUsuarioImpl.resetOriginalValues();

		return registrarActividadPlanUsuarioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		actividadPlanId = objectInput.readLong();
		regisitrarActividadPlanUsuariocoId = objectInput.readLong();
		usuarioId = objectInput.readLong();
		cumplio = objectInput.readLong();
		actividad = objectInput.readUTF();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(actividadPlanId);
		objectOutput.writeLong(regisitrarActividadPlanUsuariocoId);
		objectOutput.writeLong(usuarioId);
		objectOutput.writeLong(cumplio);

		if (actividad == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actividad);
		}

		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechamodifica);
	}

	public long actividadPlanId;
	public long regisitrarActividadPlanUsuariocoId;
	public long usuarioId;
	public long cumplio;
	public String actividad;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}
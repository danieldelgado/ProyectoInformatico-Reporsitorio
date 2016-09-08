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

import com.hitss.layer.model.ActividadPlanAccionUsuario;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ActividadPlanAccionUsuario in entity cache.
 *
 * @author Danielle Delgado
 * @see ActividadPlanAccionUsuario
 * @generated
 */
public class ActividadPlanAccionUsuarioCacheModel implements CacheModel<ActividadPlanAccionUsuario>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{actividadPlanAccionUsuariocoId=");
		sb.append(actividadPlanAccionUsuariocoId);
		sb.append(", actividadPlanId=");
		sb.append(actividadPlanId);
		sb.append(", usuarioId=");
		sb.append(usuarioId);
		sb.append(", cumplio=");
		sb.append(cumplio);
		sb.append(", actividad=");
		sb.append(actividad);
		sb.append(", puntuacion=");
		sb.append(puntuacion);
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
	public ActividadPlanAccionUsuario toEntityModel() {
		ActividadPlanAccionUsuarioImpl actividadPlanAccionUsuarioImpl = new ActividadPlanAccionUsuarioImpl();

		actividadPlanAccionUsuarioImpl.setActividadPlanAccionUsuariocoId(actividadPlanAccionUsuariocoId);
		actividadPlanAccionUsuarioImpl.setActividadPlanId(actividadPlanId);
		actividadPlanAccionUsuarioImpl.setUsuarioId(usuarioId);
		actividadPlanAccionUsuarioImpl.setCumplio(cumplio);

		if (actividad == null) {
			actividadPlanAccionUsuarioImpl.setActividad(StringPool.BLANK);
		}
		else {
			actividadPlanAccionUsuarioImpl.setActividad(actividad);
		}

		actividadPlanAccionUsuarioImpl.setPuntuacion(puntuacion);
		actividadPlanAccionUsuarioImpl.setActivo(activo);
		actividadPlanAccionUsuarioImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			actividadPlanAccionUsuarioImpl.setFechacrea(null);
		}
		else {
			actividadPlanAccionUsuarioImpl.setFechacrea(new Date(fechacrea));
		}

		actividadPlanAccionUsuarioImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			actividadPlanAccionUsuarioImpl.setFechamodifica(null);
		}
		else {
			actividadPlanAccionUsuarioImpl.setFechamodifica(new Date(
					fechamodifica));
		}

		actividadPlanAccionUsuarioImpl.resetOriginalValues();

		return actividadPlanAccionUsuarioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		actividadPlanAccionUsuariocoId = objectInput.readLong();
		actividadPlanId = objectInput.readLong();
		usuarioId = objectInput.readLong();
		cumplio = objectInput.readLong();
		actividad = objectInput.readUTF();
		puntuacion = objectInput.readInt();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(actividadPlanAccionUsuariocoId);
		objectOutput.writeLong(actividadPlanId);
		objectOutput.writeLong(usuarioId);
		objectOutput.writeLong(cumplio);

		if (actividad == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actividad);
		}

		objectOutput.writeInt(puntuacion);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechamodifica);
	}

	public long actividadPlanAccionUsuariocoId;
	public long actividadPlanId;
	public long usuarioId;
	public long cumplio;
	public String actividad;
	public int puntuacion;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}
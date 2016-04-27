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

import com.rec.hitss.layer.model.Postulacion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Postulacion in entity cache.
 *
 * @author Crossfire
 * @see Postulacion
 * @generated
 */
public class PostulacionCacheModel implements CacheModel<Postulacion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{solicitudRequerimientoId=");
		sb.append(solicitudRequerimientoId);
		sb.append(", usuarioId=");
		sb.append(usuarioId);
		sb.append(", fechaPostulacion=");
		sb.append(fechaPostulacion);
		sb.append(", estado=");
		sb.append(estado);
		sb.append(", activo=");
		sb.append(activo);
		sb.append(", usuariocrea=");
		sb.append(usuariocrea);
		sb.append(", fechacrea=");
		sb.append(fechacrea);
		sb.append(", usuariomodifica=");
		sb.append(usuariomodifica);
		sb.append(", fechacreamodifica=");
		sb.append(fechacreamodifica);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Postulacion toEntityModel() {
		PostulacionImpl postulacionImpl = new PostulacionImpl();

		postulacionImpl.setSolicitudRequerimientoId(solicitudRequerimientoId);
		postulacionImpl.setUsuarioId(usuarioId);

		if (fechaPostulacion == Long.MIN_VALUE) {
			postulacionImpl.setFechaPostulacion(null);
		}
		else {
			postulacionImpl.setFechaPostulacion(new Date(fechaPostulacion));
		}

		postulacionImpl.setEstado(estado);
		postulacionImpl.setActivo(activo);
		postulacionImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			postulacionImpl.setFechacrea(null);
		}
		else {
			postulacionImpl.setFechacrea(new Date(fechacrea));
		}

		postulacionImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			postulacionImpl.setFechacreamodifica(null);
		}
		else {
			postulacionImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		postulacionImpl.resetOriginalValues();

		return postulacionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		solicitudRequerimientoId = objectInput.readLong();
		usuarioId = objectInput.readLong();
		fechaPostulacion = objectInput.readLong();
		estado = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(solicitudRequerimientoId);
		objectOutput.writeLong(usuarioId);
		objectOutput.writeLong(fechaPostulacion);
		objectOutput.writeLong(estado);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long solicitudRequerimientoId;
	public long usuarioId;
	public long fechaPostulacion;
	public long estado;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}
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

import com.hitss.layer.model.Estudio;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Estudio in entity cache.
 *
 * @author Danielle Delgado
 * @see Estudio
 * @generated
 */
public class EstudioCacheModel implements CacheModel<Estudio>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{estudioId=");
		sb.append(estudioId);
		sb.append(", usuarioId=");
		sb.append(usuarioId);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", annos=");
		sb.append(annos);
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
	public Estudio toEntityModel() {
		EstudioImpl estudioImpl = new EstudioImpl();

		estudioImpl.setEstudioId(estudioId);
		estudioImpl.setUsuarioId(usuarioId);

		if (nombre == null) {
			estudioImpl.setNombre(StringPool.BLANK);
		}
		else {
			estudioImpl.setNombre(nombre);
		}

		estudioImpl.setAnnos(annos);
		estudioImpl.setActivo(activo);
		estudioImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			estudioImpl.setFechacrea(null);
		}
		else {
			estudioImpl.setFechacrea(new Date(fechacrea));
		}

		estudioImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			estudioImpl.setFechamodifica(null);
		}
		else {
			estudioImpl.setFechamodifica(new Date(fechamodifica));
		}

		estudioImpl.resetOriginalValues();

		return estudioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		estudioId = objectInput.readLong();
		usuarioId = objectInput.readLong();
		nombre = objectInput.readUTF();
		annos = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(estudioId);
		objectOutput.writeLong(usuarioId);

		if (nombre == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		objectOutput.writeLong(annos);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechamodifica);
	}

	public long estudioId;
	public long usuarioId;
	public String nombre;
	public long annos;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}
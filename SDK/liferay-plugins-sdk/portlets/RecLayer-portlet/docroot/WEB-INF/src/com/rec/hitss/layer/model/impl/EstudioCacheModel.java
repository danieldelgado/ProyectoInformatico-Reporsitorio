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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.rec.hitss.layer.model.Estudio;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Estudio in entity cache.
 *
 * @author Crossfire
 * @see Estudio
 * @generated
 */
public class EstudioCacheModel implements CacheModel<Estudio>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{estudioId=");
		sb.append(estudioId);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", logro=");
		sb.append(logro);
		sb.append(", fechaInicio=");
		sb.append(fechaInicio);
		sb.append(", fechaFino=");
		sb.append(fechaFino);
		sb.append(", nivel=");
		sb.append(nivel);
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
		sb.append(", usuarioHitssId=");
		sb.append(usuarioHitssId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Estudio toEntityModel() {
		EstudioImpl estudioImpl = new EstudioImpl();

		estudioImpl.setEstudioId(estudioId);

		if (nombre == null) {
			estudioImpl.setNombre(StringPool.BLANK);
		}
		else {
			estudioImpl.setNombre(nombre);
		}

		if (logro == null) {
			estudioImpl.setLogro(StringPool.BLANK);
		}
		else {
			estudioImpl.setLogro(logro);
		}

		if (fechaInicio == Long.MIN_VALUE) {
			estudioImpl.setFechaInicio(null);
		}
		else {
			estudioImpl.setFechaInicio(new Date(fechaInicio));
		}

		if (fechaFino == Long.MIN_VALUE) {
			estudioImpl.setFechaFino(null);
		}
		else {
			estudioImpl.setFechaFino(new Date(fechaFino));
		}

		estudioImpl.setNivel(nivel);
		estudioImpl.setActivo(activo);
		estudioImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			estudioImpl.setFechacrea(null);
		}
		else {
			estudioImpl.setFechacrea(new Date(fechacrea));
		}

		estudioImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			estudioImpl.setFechacreamodifica(null);
		}
		else {
			estudioImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		estudioImpl.setUsuarioHitssId(usuarioHitssId);

		estudioImpl.resetOriginalValues();

		return estudioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		estudioId = objectInput.readLong();
		nombre = objectInput.readUTF();
		logro = objectInput.readUTF();
		fechaInicio = objectInput.readLong();
		fechaFino = objectInput.readLong();
		nivel = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
		usuarioHitssId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(estudioId);

		if (nombre == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		if (logro == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(logro);
		}

		objectOutput.writeLong(fechaInicio);
		objectOutput.writeLong(fechaFino);
		objectOutput.writeLong(nivel);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
		objectOutput.writeLong(usuarioHitssId);
	}

	public long estudioId;
	public String nombre;
	public String logro;
	public long fechaInicio;
	public long fechaFino;
	public long nivel;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
	public long usuarioHitssId;
}
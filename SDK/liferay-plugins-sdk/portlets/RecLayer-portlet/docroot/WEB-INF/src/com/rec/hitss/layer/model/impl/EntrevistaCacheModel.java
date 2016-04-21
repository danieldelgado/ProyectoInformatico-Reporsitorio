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

import com.rec.hitss.layer.model.Entrevista;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Entrevista in entity cache.
 *
 * @author Crossfire
 * @see Entrevista
 * @generated
 */
public class EntrevistaCacheModel implements CacheModel<Entrevista>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{entrevistaId=");
		sb.append(entrevistaId);
		sb.append(", usuarioHitssId=");
		sb.append(usuarioHitssId);
		sb.append(", observacion=");
		sb.append(observacion);
		sb.append(", asistio=");
		sb.append(asistio);
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
	public Entrevista toEntityModel() {
		EntrevistaImpl entrevistaImpl = new EntrevistaImpl();

		entrevistaImpl.setEntrevistaId(entrevistaId);
		entrevistaImpl.setUsuarioHitssId(usuarioHitssId);

		if (observacion == null) {
			entrevistaImpl.setObservacion(StringPool.BLANK);
		}
		else {
			entrevistaImpl.setObservacion(observacion);
		}

		entrevistaImpl.setAsistio(asistio);
		entrevistaImpl.setActivo(activo);
		entrevistaImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			entrevistaImpl.setFechacrea(null);
		}
		else {
			entrevistaImpl.setFechacrea(new Date(fechacrea));
		}

		entrevistaImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			entrevistaImpl.setFechacreamodifica(null);
		}
		else {
			entrevistaImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		entrevistaImpl.resetOriginalValues();

		return entrevistaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		entrevistaId = objectInput.readLong();
		usuarioHitssId = objectInput.readLong();
		observacion = objectInput.readUTF();
		asistio = objectInput.readBoolean();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(entrevistaId);
		objectOutput.writeLong(usuarioHitssId);

		if (observacion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(observacion);
		}

		objectOutput.writeBoolean(asistio);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long entrevistaId;
	public long usuarioHitssId;
	public String observacion;
	public boolean asistio;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}
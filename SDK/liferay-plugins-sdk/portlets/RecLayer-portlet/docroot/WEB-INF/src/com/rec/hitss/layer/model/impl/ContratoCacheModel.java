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

import com.rec.hitss.layer.model.Contrato;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Contrato in entity cache.
 *
 * @author Crossfire
 * @see Contrato
 * @generated
 */
public class ContratoCacheModel implements CacheModel<Contrato>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{contratoId=");
		sb.append(contratoId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", fechaEmitida=");
		sb.append(fechaEmitida);
		sb.append(", Titulo=");
		sb.append(Titulo);
		sb.append(", Motivo=");
		sb.append(Motivo);
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
	public Contrato toEntityModel() {
		ContratoImpl contratoImpl = new ContratoImpl();

		contratoImpl.setContratoId(contratoId);

		if (descripcion == null) {
			contratoImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			contratoImpl.setDescripcion(descripcion);
		}

		if (fechaEmitida == Long.MIN_VALUE) {
			contratoImpl.setFechaEmitida(null);
		}
		else {
			contratoImpl.setFechaEmitida(new Date(fechaEmitida));
		}

		contratoImpl.setTitulo(Titulo);

		if (Motivo == null) {
			contratoImpl.setMotivo(StringPool.BLANK);
		}
		else {
			contratoImpl.setMotivo(Motivo);
		}

		contratoImpl.setActivo(activo);
		contratoImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			contratoImpl.setFechacrea(null);
		}
		else {
			contratoImpl.setFechacrea(new Date(fechacrea));
		}

		contratoImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			contratoImpl.setFechacreamodifica(null);
		}
		else {
			contratoImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		contratoImpl.setUsuarioHitssId(usuarioHitssId);

		contratoImpl.resetOriginalValues();

		return contratoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		contratoId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		fechaEmitida = objectInput.readLong();
		Titulo = objectInput.readBoolean();
		Motivo = objectInput.readUTF();
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
		objectOutput.writeLong(contratoId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeLong(fechaEmitida);
		objectOutput.writeBoolean(Titulo);

		if (Motivo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Motivo);
		}

		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
		objectOutput.writeLong(usuarioHitssId);
	}

	public long contratoId;
	public String descripcion;
	public long fechaEmitida;
	public boolean Titulo;
	public String Motivo;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
	public long usuarioHitssId;
}
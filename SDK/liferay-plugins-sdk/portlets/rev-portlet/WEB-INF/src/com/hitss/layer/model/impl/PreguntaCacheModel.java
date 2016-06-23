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

import com.hitss.layer.model.Pregunta;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Pregunta in entity cache.
 *
 * @author Danielle Delgado
 * @see Pregunta
 * @generated
 */
public class PreguntaCacheModel implements CacheModel<Pregunta>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{preguntaId=");
		sb.append(preguntaId);
		sb.append(", descripcion=");
		sb.append(descripcion);
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
	public Pregunta toEntityModel() {
		PreguntaImpl preguntaImpl = new PreguntaImpl();

		preguntaImpl.setPreguntaId(preguntaId);

		if (descripcion == null) {
			preguntaImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			preguntaImpl.setDescripcion(descripcion);
		}

		preguntaImpl.setActivo(activo);
		preguntaImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			preguntaImpl.setFechacrea(null);
		}
		else {
			preguntaImpl.setFechacrea(new Date(fechacrea));
		}

		preguntaImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			preguntaImpl.setFechacreamodifica(null);
		}
		else {
			preguntaImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		preguntaImpl.resetOriginalValues();

		return preguntaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		preguntaId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(preguntaId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long preguntaId;
	public String descripcion;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}
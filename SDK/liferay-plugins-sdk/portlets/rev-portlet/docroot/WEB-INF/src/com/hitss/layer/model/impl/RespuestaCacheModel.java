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

import com.hitss.layer.model.Respuesta;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Respuesta in entity cache.
 *
 * @author Danielle Delgado
 * @see Respuesta
 * @generated
 */
public class RespuestaCacheModel implements CacheModel<Respuesta>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{respuestaId=");
		sb.append(respuestaId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", correcta=");
		sb.append(correcta);
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
	public Respuesta toEntityModel() {
		RespuestaImpl respuestaImpl = new RespuestaImpl();

		respuestaImpl.setRespuestaId(respuestaId);

		if (descripcion == null) {
			respuestaImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			respuestaImpl.setDescripcion(descripcion);
		}

		respuestaImpl.setCorrecta(correcta);
		respuestaImpl.setActivo(activo);
		respuestaImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			respuestaImpl.setFechacrea(null);
		}
		else {
			respuestaImpl.setFechacrea(new Date(fechacrea));
		}

		respuestaImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			respuestaImpl.setFechacreamodifica(null);
		}
		else {
			respuestaImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		respuestaImpl.resetOriginalValues();

		return respuestaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		respuestaId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		correcta = objectInput.readBoolean();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(respuestaId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeBoolean(correcta);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long respuestaId;
	public String descripcion;
	public boolean correcta;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}
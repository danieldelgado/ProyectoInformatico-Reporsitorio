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

import com.hitss.layer.model.LogOperaciones;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LogOperaciones in entity cache.
 *
 * @author Danielle Delgado
 * @see LogOperaciones
 * @generated
 */
public class LogOperacionesCacheModel implements CacheModel<LogOperaciones>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{logOperacionesId=");
		sb.append(logOperacionesId);
		sb.append(", tipoActividad=");
		sb.append(tipoActividad);
		sb.append(", actividad=");
		sb.append(actividad);
		sb.append(", usuario=");
		sb.append(usuario);
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
	public LogOperaciones toEntityModel() {
		LogOperacionesImpl logOperacionesImpl = new LogOperacionesImpl();

		logOperacionesImpl.setLogOperacionesId(logOperacionesId);
		logOperacionesImpl.setTipoActividad(tipoActividad);

		if (actividad == null) {
			logOperacionesImpl.setActividad(StringPool.BLANK);
		}
		else {
			logOperacionesImpl.setActividad(actividad);
		}

		if (usuario == null) {
			logOperacionesImpl.setUsuario(StringPool.BLANK);
		}
		else {
			logOperacionesImpl.setUsuario(usuario);
		}

		logOperacionesImpl.setActivo(activo);
		logOperacionesImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			logOperacionesImpl.setFechacrea(null);
		}
		else {
			logOperacionesImpl.setFechacrea(new Date(fechacrea));
		}

		logOperacionesImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			logOperacionesImpl.setFechacreamodifica(null);
		}
		else {
			logOperacionesImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		logOperacionesImpl.resetOriginalValues();

		return logOperacionesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		logOperacionesId = objectInput.readLong();
		tipoActividad = objectInput.readLong();
		actividad = objectInput.readUTF();
		usuario = objectInput.readUTF();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(logOperacionesId);
		objectOutput.writeLong(tipoActividad);

		if (actividad == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actividad);
		}

		if (usuario == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(usuario);
		}

		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long logOperacionesId;
	public long tipoActividad;
	public String actividad;
	public String usuario;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}
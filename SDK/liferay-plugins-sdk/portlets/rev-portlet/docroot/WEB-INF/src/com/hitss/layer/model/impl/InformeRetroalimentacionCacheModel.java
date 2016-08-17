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

import com.hitss.layer.model.InformeRetroalimentacion;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing InformeRetroalimentacion in entity cache.
 *
 * @author Danielle Delgado
 * @see InformeRetroalimentacion
 * @generated
 */
public class InformeRetroalimentacionCacheModel implements CacheModel<InformeRetroalimentacion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{informeRetroalimentacionId=");
		sb.append(informeRetroalimentacionId);
		sb.append(", planAccionId=");
		sb.append(planAccionId);
		sb.append(", usuario=");
		sb.append(usuario);
		sb.append(", titulo=");
		sb.append(titulo);
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
		sb.append(", fechamodifica=");
		sb.append(fechamodifica);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public InformeRetroalimentacion toEntityModel() {
		InformeRetroalimentacionImpl informeRetroalimentacionImpl = new InformeRetroalimentacionImpl();

		informeRetroalimentacionImpl.setInformeRetroalimentacionId(informeRetroalimentacionId);
		informeRetroalimentacionImpl.setPlanAccionId(planAccionId);
		informeRetroalimentacionImpl.setUsuario(usuario);

		if (titulo == null) {
			informeRetroalimentacionImpl.setTitulo(StringPool.BLANK);
		}
		else {
			informeRetroalimentacionImpl.setTitulo(titulo);
		}

		if (descripcion == null) {
			informeRetroalimentacionImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			informeRetroalimentacionImpl.setDescripcion(descripcion);
		}

		informeRetroalimentacionImpl.setActivo(activo);
		informeRetroalimentacionImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			informeRetroalimentacionImpl.setFechacrea(null);
		}
		else {
			informeRetroalimentacionImpl.setFechacrea(new Date(fechacrea));
		}

		informeRetroalimentacionImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			informeRetroalimentacionImpl.setFechamodifica(null);
		}
		else {
			informeRetroalimentacionImpl.setFechamodifica(new Date(
					fechamodifica));
		}

		informeRetroalimentacionImpl.resetOriginalValues();

		return informeRetroalimentacionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		informeRetroalimentacionId = objectInput.readLong();
		planAccionId = objectInput.readLong();
		usuario = objectInput.readLong();
		titulo = objectInput.readUTF();
		descripcion = objectInput.readUTF();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(informeRetroalimentacionId);
		objectOutput.writeLong(planAccionId);
		objectOutput.writeLong(usuario);

		if (titulo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(titulo);
		}

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
		objectOutput.writeLong(fechamodifica);
	}

	public long informeRetroalimentacionId;
	public long planAccionId;
	public long usuario;
	public String titulo;
	public String descripcion;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}
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

import com.hitss.layer.model.UsuarioRequisito;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UsuarioRequisito in entity cache.
 *
 * @author Danielle Delgado
 * @see UsuarioRequisito
 * @generated
 */
public class UsuarioRequisitoCacheModel implements CacheModel<UsuarioRequisito>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{userId=");
		sb.append(userId);
		sb.append(", tagId=");
		sb.append(tagId);
		sb.append(", nivel=");
		sb.append(nivel);
		sb.append(", exigible=");
		sb.append(exigible);
		sb.append(", tipoRequisito=");
		sb.append(tipoRequisito);
		sb.append(", herramienta=");
		sb.append(herramienta);
		sb.append(", cumplerequisito=");
		sb.append(cumplerequisito);
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
	public UsuarioRequisito toEntityModel() {
		UsuarioRequisitoImpl usuarioRequisitoImpl = new UsuarioRequisitoImpl();

		usuarioRequisitoImpl.setUserId(userId);
		usuarioRequisitoImpl.setTagId(tagId);
		usuarioRequisitoImpl.setNivel(nivel);
		usuarioRequisitoImpl.setExigible(exigible);
		usuarioRequisitoImpl.setTipoRequisito(tipoRequisito);
		usuarioRequisitoImpl.setHerramienta(herramienta);
		usuarioRequisitoImpl.setCumplerequisito(cumplerequisito);
		usuarioRequisitoImpl.setActivo(activo);
		usuarioRequisitoImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			usuarioRequisitoImpl.setFechacrea(null);
		}
		else {
			usuarioRequisitoImpl.setFechacrea(new Date(fechacrea));
		}

		usuarioRequisitoImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			usuarioRequisitoImpl.setFechamodifica(null);
		}
		else {
			usuarioRequisitoImpl.setFechamodifica(new Date(fechamodifica));
		}

		usuarioRequisitoImpl.resetOriginalValues();

		return usuarioRequisitoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userId = objectInput.readLong();
		tagId = objectInput.readLong();
		nivel = objectInput.readLong();
		exigible = objectInput.readBoolean();
		tipoRequisito = objectInput.readLong();
		herramienta = objectInput.readLong();
		cumplerequisito = objectInput.readBoolean();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(userId);
		objectOutput.writeLong(tagId);
		objectOutput.writeLong(nivel);
		objectOutput.writeBoolean(exigible);
		objectOutput.writeLong(tipoRequisito);
		objectOutput.writeLong(herramienta);
		objectOutput.writeBoolean(cumplerequisito);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechamodifica);
	}

	public long userId;
	public long tagId;
	public long nivel;
	public boolean exigible;
	public long tipoRequisito;
	public long herramienta;
	public boolean cumplerequisito;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}
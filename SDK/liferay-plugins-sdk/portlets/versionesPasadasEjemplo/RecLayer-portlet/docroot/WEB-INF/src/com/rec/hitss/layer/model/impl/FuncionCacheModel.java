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

import com.rec.hitss.layer.model.Funcion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Funcion in entity cache.
 *
 * @author Crossfire
 * @see Funcion
 * @generated
 */
public class FuncionCacheModel implements CacheModel<Funcion>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{funcionId=");
		sb.append(funcionId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", etiqueta=");
		sb.append(etiqueta);
		sb.append(", exigible=");
		sb.append(exigible);
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
	public Funcion toEntityModel() {
		FuncionImpl funcionImpl = new FuncionImpl();

		funcionImpl.setFuncionId(funcionId);

		if (descripcion == null) {
			funcionImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			funcionImpl.setDescripcion(descripcion);
		}

		funcionImpl.setEtiqueta(etiqueta);
		funcionImpl.setExigible(exigible);
		funcionImpl.setActivo(activo);
		funcionImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			funcionImpl.setFechacrea(null);
		}
		else {
			funcionImpl.setFechacrea(new Date(fechacrea));
		}

		funcionImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			funcionImpl.setFechacreamodifica(null);
		}
		else {
			funcionImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		funcionImpl.resetOriginalValues();

		return funcionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		funcionId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		etiqueta = objectInput.readLong();
		exigible = objectInput.readBoolean();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(funcionId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeLong(etiqueta);
		objectOutput.writeBoolean(exigible);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long funcionId;
	public String descripcion;
	public long etiqueta;
	public boolean exigible;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}
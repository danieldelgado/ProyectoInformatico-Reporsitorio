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

import com.hitss.layer.model.Puesto;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Puesto in entity cache.
 *
 * @author Danielle Delgado
 * @see Puesto
 * @generated
 */
public class PuestoCacheModel implements CacheModel<Puesto>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{puestoId=");
		sb.append(puestoId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", categoria=");
		sb.append(categoria);
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
	public Puesto toEntityModel() {
		PuestoImpl puestoImpl = new PuestoImpl();

		puestoImpl.setPuestoId(puestoId);

		if (descripcion == null) {
			puestoImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			puestoImpl.setDescripcion(descripcion);
		}

		puestoImpl.setCategoria(categoria);
		puestoImpl.setActivo(activo);
		puestoImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			puestoImpl.setFechacrea(null);
		}
		else {
			puestoImpl.setFechacrea(new Date(fechacrea));
		}

		puestoImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			puestoImpl.setFechacreamodifica(null);
		}
		else {
			puestoImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		puestoImpl.resetOriginalValues();

		return puestoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		puestoId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		categoria = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(puestoId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeLong(categoria);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long puestoId;
	public String descripcion;
	public long categoria;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}
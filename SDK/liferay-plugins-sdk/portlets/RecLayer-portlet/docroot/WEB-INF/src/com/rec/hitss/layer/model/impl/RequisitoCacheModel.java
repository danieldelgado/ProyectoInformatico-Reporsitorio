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

import com.rec.hitss.layer.model.Requisito;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Requisito in entity cache.
 *
 * @author Crossfire
 * @see Requisito
 * @generated
 */
public class RequisitoCacheModel implements CacheModel<Requisito>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{requisitoId=");
		sb.append(requisitoId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", nivel=");
		sb.append(nivel);
		sb.append(", exigible=");
		sb.append(exigible);
		sb.append(", herramienta=");
		sb.append(herramienta);
		sb.append(", tipoRequisito=");
		sb.append(tipoRequisito);
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
	public Requisito toEntityModel() {
		RequisitoImpl requisitoImpl = new RequisitoImpl();

		requisitoImpl.setRequisitoId(requisitoId);

		if (descripcion == null) {
			requisitoImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			requisitoImpl.setDescripcion(descripcion);
		}

		requisitoImpl.setNivel(nivel);
		requisitoImpl.setExigible(exigible);
		requisitoImpl.setHerramienta(herramienta);
		requisitoImpl.setTipoRequisito(tipoRequisito);
		requisitoImpl.setActivo(activo);
		requisitoImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			requisitoImpl.setFechacrea(null);
		}
		else {
			requisitoImpl.setFechacrea(new Date(fechacrea));
		}

		requisitoImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			requisitoImpl.setFechacreamodifica(null);
		}
		else {
			requisitoImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		requisitoImpl.resetOriginalValues();

		return requisitoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		requisitoId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		nivel = objectInput.readLong();
		exigible = objectInput.readBoolean();
		herramienta = objectInput.readLong();
		tipoRequisito = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(requisitoId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeLong(nivel);
		objectOutput.writeBoolean(exigible);
		objectOutput.writeLong(herramienta);
		objectOutput.writeLong(tipoRequisito);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long requisitoId;
	public String descripcion;
	public long nivel;
	public boolean exigible;
	public long herramienta;
	public long tipoRequisito;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}
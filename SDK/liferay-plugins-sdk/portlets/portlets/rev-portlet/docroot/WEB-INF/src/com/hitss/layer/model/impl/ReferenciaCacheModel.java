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

import com.hitss.layer.model.Referencia;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Referencia in entity cache.
 *
 * @author Danielle Delgado
 * @see Referencia
 * @generated
 */
public class ReferenciaCacheModel implements CacheModel<Referencia>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{referenciaId=");
		sb.append(referenciaId);
		sb.append(", usuarioId=");
		sb.append(usuarioId);
		sb.append(", empresa=");
		sb.append(empresa);
		sb.append(", telefono=");
		sb.append(telefono);
		sb.append(", responsable=");
		sb.append(responsable);
		sb.append(", motivo=");
		sb.append(motivo);
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
	public Referencia toEntityModel() {
		ReferenciaImpl referenciaImpl = new ReferenciaImpl();

		referenciaImpl.setReferenciaId(referenciaId);
		referenciaImpl.setUsuarioId(usuarioId);

		if (empresa == null) {
			referenciaImpl.setEmpresa(StringPool.BLANK);
		}
		else {
			referenciaImpl.setEmpresa(empresa);
		}

		if (telefono == null) {
			referenciaImpl.setTelefono(StringPool.BLANK);
		}
		else {
			referenciaImpl.setTelefono(telefono);
		}

		if (responsable == null) {
			referenciaImpl.setResponsable(StringPool.BLANK);
		}
		else {
			referenciaImpl.setResponsable(responsable);
		}

		if (motivo == null) {
			referenciaImpl.setMotivo(StringPool.BLANK);
		}
		else {
			referenciaImpl.setMotivo(motivo);
		}

		referenciaImpl.setActivo(activo);
		referenciaImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			referenciaImpl.setFechacrea(null);
		}
		else {
			referenciaImpl.setFechacrea(new Date(fechacrea));
		}

		referenciaImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			referenciaImpl.setFechacreamodifica(null);
		}
		else {
			referenciaImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		referenciaImpl.resetOriginalValues();

		return referenciaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		referenciaId = objectInput.readLong();
		usuarioId = objectInput.readLong();
		empresa = objectInput.readUTF();
		telefono = objectInput.readUTF();
		responsable = objectInput.readUTF();
		motivo = objectInput.readUTF();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(referenciaId);
		objectOutput.writeLong(usuarioId);

		if (empresa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(empresa);
		}

		if (telefono == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(telefono);
		}

		if (responsable == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(responsable);
		}

		if (motivo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(motivo);
		}

		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long referenciaId;
	public long usuarioId;
	public String empresa;
	public String telefono;
	public String responsable;
	public String motivo;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}
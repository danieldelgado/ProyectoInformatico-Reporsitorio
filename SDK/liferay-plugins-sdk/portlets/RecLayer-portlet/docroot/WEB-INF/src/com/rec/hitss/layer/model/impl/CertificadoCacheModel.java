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

import com.rec.hitss.layer.model.Certificado;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Certificado in entity cache.
 *
 * @author Crossfire
 * @see Certificado
 * @generated
 */
public class CertificadoCacheModel implements CacheModel<Certificado>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{certificadoId=");
		sb.append(certificadoId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", empresa=");
		sb.append(empresa);
		sb.append(", cargo=");
		sb.append(cargo);
		sb.append(", usuarioHitssId=");
		sb.append(usuarioHitssId);
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
	public Certificado toEntityModel() {
		CertificadoImpl certificadoImpl = new CertificadoImpl();

		certificadoImpl.setCertificadoId(certificadoId);

		if (descripcion == null) {
			certificadoImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			certificadoImpl.setDescripcion(descripcion);
		}

		if (empresa == null) {
			certificadoImpl.setEmpresa(StringPool.BLANK);
		}
		else {
			certificadoImpl.setEmpresa(empresa);
		}

		if (cargo == null) {
			certificadoImpl.setCargo(StringPool.BLANK);
		}
		else {
			certificadoImpl.setCargo(cargo);
		}

		certificadoImpl.setUsuarioHitssId(usuarioHitssId);
		certificadoImpl.setActivo(activo);
		certificadoImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			certificadoImpl.setFechacrea(null);
		}
		else {
			certificadoImpl.setFechacrea(new Date(fechacrea));
		}

		certificadoImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			certificadoImpl.setFechacreamodifica(null);
		}
		else {
			certificadoImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		certificadoImpl.resetOriginalValues();

		return certificadoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		certificadoId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		empresa = objectInput.readUTF();
		cargo = objectInput.readUTF();
		usuarioHitssId = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(certificadoId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		if (empresa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(empresa);
		}

		if (cargo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cargo);
		}

		objectOutput.writeLong(usuarioHitssId);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long certificadoId;
	public String descripcion;
	public String empresa;
	public String cargo;
	public long usuarioHitssId;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}
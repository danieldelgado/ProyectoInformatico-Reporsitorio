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

import com.rec.hitss.layer.model.InformeRetroalimentacion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing InformeRetroalimentacion in entity cache.
 *
 * @author Crossfire
 * @see InformeRetroalimentacion
 * @generated
 */
public class InformeRetroalimentacionCacheModel implements CacheModel<InformeRetroalimentacion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{informeRetroalimentacionId=");
		sb.append(informeRetroalimentacionId);
		sb.append(", planAccionId=");
		sb.append(planAccionId);
		sb.append(", responsable=");
		sb.append(responsable);
		sb.append(", fechaEmision=");
		sb.append(fechaEmision);
		sb.append(", titulo=");
		sb.append(titulo);
		sb.append(", integrante=");
		sb.append(integrante);
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
	public InformeRetroalimentacion toEntityModel() {
		InformeRetroalimentacionImpl informeRetroalimentacionImpl = new InformeRetroalimentacionImpl();

		informeRetroalimentacionImpl.setInformeRetroalimentacionId(informeRetroalimentacionId);
		informeRetroalimentacionImpl.setPlanAccionId(planAccionId);

		if (responsable == null) {
			informeRetroalimentacionImpl.setResponsable(StringPool.BLANK);
		}
		else {
			informeRetroalimentacionImpl.setResponsable(responsable);
		}

		if (fechaEmision == null) {
			informeRetroalimentacionImpl.setFechaEmision(StringPool.BLANK);
		}
		else {
			informeRetroalimentacionImpl.setFechaEmision(fechaEmision);
		}

		if (titulo == null) {
			informeRetroalimentacionImpl.setTitulo(StringPool.BLANK);
		}
		else {
			informeRetroalimentacionImpl.setTitulo(titulo);
		}

		if (integrante == null) {
			informeRetroalimentacionImpl.setIntegrante(StringPool.BLANK);
		}
		else {
			informeRetroalimentacionImpl.setIntegrante(integrante);
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

		if (fechacreamodifica == Long.MIN_VALUE) {
			informeRetroalimentacionImpl.setFechacreamodifica(null);
		}
		else {
			informeRetroalimentacionImpl.setFechacreamodifica(new Date(
					fechacreamodifica));
		}

		informeRetroalimentacionImpl.resetOriginalValues();

		return informeRetroalimentacionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		informeRetroalimentacionId = objectInput.readLong();
		planAccionId = objectInput.readLong();
		responsable = objectInput.readUTF();
		fechaEmision = objectInput.readUTF();
		titulo = objectInput.readUTF();
		integrante = objectInput.readUTF();
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
		objectOutput.writeLong(informeRetroalimentacionId);
		objectOutput.writeLong(planAccionId);

		if (responsable == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(responsable);
		}

		if (fechaEmision == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fechaEmision);
		}

		if (titulo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(titulo);
		}

		if (integrante == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(integrante);
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
		objectOutput.writeLong(fechacreamodifica);
	}

	public long informeRetroalimentacionId;
	public long planAccionId;
	public String responsable;
	public String fechaEmision;
	public String titulo;
	public String integrante;
	public String descripcion;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}
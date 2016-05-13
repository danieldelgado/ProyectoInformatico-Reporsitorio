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

import com.hitss.layer.model.SolicitudRequerimientoRequisito;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SolicitudRequerimientoRequisito in entity cache.
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoRequisito
 * @generated
 */
public class SolicitudRequerimientoRequisitoCacheModel implements CacheModel<SolicitudRequerimientoRequisito>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{solicitudRequerimientoId=");
		sb.append(solicitudRequerimientoId);
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
	public SolicitudRequerimientoRequisito toEntityModel() {
		SolicitudRequerimientoRequisitoImpl solicitudRequerimientoRequisitoImpl = new SolicitudRequerimientoRequisitoImpl();

		solicitudRequerimientoRequisitoImpl.setSolicitudRequerimientoId(solicitudRequerimientoId);
		solicitudRequerimientoRequisitoImpl.setTagId(tagId);
		solicitudRequerimientoRequisitoImpl.setNivel(nivel);
		solicitudRequerimientoRequisitoImpl.setExigible(exigible);
		solicitudRequerimientoRequisitoImpl.setTipoRequisito(tipoRequisito);
		solicitudRequerimientoRequisitoImpl.setHerramienta(herramienta);
		solicitudRequerimientoRequisitoImpl.setActivo(activo);
		solicitudRequerimientoRequisitoImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			solicitudRequerimientoRequisitoImpl.setFechacrea(null);
		}
		else {
			solicitudRequerimientoRequisitoImpl.setFechacrea(new Date(fechacrea));
		}

		solicitudRequerimientoRequisitoImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			solicitudRequerimientoRequisitoImpl.setFechacreamodifica(null);
		}
		else {
			solicitudRequerimientoRequisitoImpl.setFechacreamodifica(new Date(
					fechacreamodifica));
		}

		solicitudRequerimientoRequisitoImpl.resetOriginalValues();

		return solicitudRequerimientoRequisitoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		solicitudRequerimientoId = objectInput.readLong();
		tagId = objectInput.readLong();
		nivel = objectInput.readLong();
		exigible = objectInput.readBoolean();
		tipoRequisito = objectInput.readLong();
		herramienta = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(solicitudRequerimientoId);
		objectOutput.writeLong(tagId);
		objectOutput.writeLong(nivel);
		objectOutput.writeBoolean(exigible);
		objectOutput.writeLong(tipoRequisito);
		objectOutput.writeLong(herramienta);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long solicitudRequerimientoId;
	public long tagId;
	public long nivel;
	public boolean exigible;
	public long tipoRequisito;
	public long herramienta;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}
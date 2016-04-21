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

import com.rec.hitss.layer.model.SolicitudRequerimientoPersonal;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SolicitudRequerimientoPersonal in entity cache.
 *
 * @author Crossfire
 * @see SolicitudRequerimientoPersonal
 * @generated
 */
public class SolicitudRequerimientoPersonalCacheModel implements CacheModel<SolicitudRequerimientoPersonal>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{solicitudRequerimientoPersonalId=");
		sb.append(solicitudRequerimientoPersonalId);
		sb.append(", estado=");
		sb.append(estado);
		sb.append(", puesto=");
		sb.append(puesto);
		sb.append(", areaSolicitante=");
		sb.append(areaSolicitante);
		sb.append(", cantidadRecursos=");
		sb.append(cantidadRecursos);
		sb.append(", fechaLimite=");
		sb.append(fechaLimite);
		sb.append(", cargo=");
		sb.append(cargo);
		sb.append(", tiempoContrato=");
		sb.append(tiempoContrato);
		sb.append(", tipoNegocio=");
		sb.append(tipoNegocio);
		sb.append(", presupuestoMaximo=");
		sb.append(presupuestoMaximo);
		sb.append(", presupuestoMinimo=");
		sb.append(presupuestoMinimo);
		sb.append(", cliente=");
		sb.append(cliente);
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
	public SolicitudRequerimientoPersonal toEntityModel() {
		SolicitudRequerimientoPersonalImpl solicitudRequerimientoPersonalImpl = new SolicitudRequerimientoPersonalImpl();

		solicitudRequerimientoPersonalImpl.setSolicitudRequerimientoPersonalId(solicitudRequerimientoPersonalId);

		if (estado == null) {
			solicitudRequerimientoPersonalImpl.setEstado(StringPool.BLANK);
		}
		else {
			solicitudRequerimientoPersonalImpl.setEstado(estado);
		}

		if (puesto == null) {
			solicitudRequerimientoPersonalImpl.setPuesto(StringPool.BLANK);
		}
		else {
			solicitudRequerimientoPersonalImpl.setPuesto(puesto);
		}

		solicitudRequerimientoPersonalImpl.setAreaSolicitante(areaSolicitante);
		solicitudRequerimientoPersonalImpl.setCantidadRecursos(cantidadRecursos);

		if (fechaLimite == Long.MIN_VALUE) {
			solicitudRequerimientoPersonalImpl.setFechaLimite(null);
		}
		else {
			solicitudRequerimientoPersonalImpl.setFechaLimite(new Date(
					fechaLimite));
		}

		if (cargo == null) {
			solicitudRequerimientoPersonalImpl.setCargo(StringPool.BLANK);
		}
		else {
			solicitudRequerimientoPersonalImpl.setCargo(cargo);
		}

		solicitudRequerimientoPersonalImpl.setTiempoContrato(tiempoContrato);
		solicitudRequerimientoPersonalImpl.setTipoNegocio(tipoNegocio);
		solicitudRequerimientoPersonalImpl.setPresupuestoMaximo(presupuestoMaximo);
		solicitudRequerimientoPersonalImpl.setPresupuestoMinimo(presupuestoMinimo);
		solicitudRequerimientoPersonalImpl.setCliente(cliente);
		solicitudRequerimientoPersonalImpl.setActivo(activo);
		solicitudRequerimientoPersonalImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			solicitudRequerimientoPersonalImpl.setFechacrea(null);
		}
		else {
			solicitudRequerimientoPersonalImpl.setFechacrea(new Date(fechacrea));
		}

		solicitudRequerimientoPersonalImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			solicitudRequerimientoPersonalImpl.setFechacreamodifica(null);
		}
		else {
			solicitudRequerimientoPersonalImpl.setFechacreamodifica(new Date(
					fechacreamodifica));
		}

		solicitudRequerimientoPersonalImpl.resetOriginalValues();

		return solicitudRequerimientoPersonalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		solicitudRequerimientoPersonalId = objectInput.readLong();
		estado = objectInput.readUTF();
		puesto = objectInput.readUTF();
		areaSolicitante = objectInput.readLong();
		cantidadRecursos = objectInput.readLong();
		fechaLimite = objectInput.readLong();
		cargo = objectInput.readUTF();
		tiempoContrato = objectInput.readLong();
		tipoNegocio = objectInput.readLong();
		presupuestoMaximo = objectInput.readLong();
		presupuestoMinimo = objectInput.readLong();
		cliente = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(solicitudRequerimientoPersonalId);

		if (estado == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(estado);
		}

		if (puesto == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(puesto);
		}

		objectOutput.writeLong(areaSolicitante);
		objectOutput.writeLong(cantidadRecursos);
		objectOutput.writeLong(fechaLimite);

		if (cargo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cargo);
		}

		objectOutput.writeLong(tiempoContrato);
		objectOutput.writeLong(tipoNegocio);
		objectOutput.writeLong(presupuestoMaximo);
		objectOutput.writeLong(presupuestoMinimo);
		objectOutput.writeLong(cliente);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long solicitudRequerimientoPersonalId;
	public String estado;
	public String puesto;
	public long areaSolicitante;
	public long cantidadRecursos;
	public long fechaLimite;
	public String cargo;
	public long tiempoContrato;
	public long tipoNegocio;
	public long presupuestoMaximo;
	public long presupuestoMinimo;
	public long cliente;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}
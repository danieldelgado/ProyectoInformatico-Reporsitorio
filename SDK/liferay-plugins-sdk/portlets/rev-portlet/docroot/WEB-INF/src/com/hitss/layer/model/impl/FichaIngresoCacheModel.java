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

import com.hitss.layer.model.FichaIngreso;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FichaIngreso in entity cache.
 *
 * @author Danielle Delgado
 * @see FichaIngreso
 * @generated
 */
public class FichaIngresoCacheModel implements CacheModel<FichaIngreso>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{fichaingresoId=");
		sb.append(fichaingresoId);
		sb.append(", solicitudRequerimientoId=");
		sb.append(solicitudRequerimientoId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", equipoTecnico=");
		sb.append(equipoTecnico);
		sb.append(", reemplazo=");
		sb.append(reemplazo);
		sb.append(", aprobacionFichaIngresoCapitalHumano=");
		sb.append(aprobacionFichaIngresoCapitalHumano);
		sb.append(", aprobacionFichaIngresoOperaciones=");
		sb.append(aprobacionFichaIngresoOperaciones);
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
	public FichaIngreso toEntityModel() {
		FichaIngresoImpl fichaIngresoImpl = new FichaIngresoImpl();

		fichaIngresoImpl.setFichaingresoId(fichaingresoId);
		fichaIngresoImpl.setSolicitudRequerimientoId(solicitudRequerimientoId);
		fichaIngresoImpl.setUserId(userId);
		fichaIngresoImpl.setEquipoTecnico(equipoTecnico);
		fichaIngresoImpl.setReemplazo(reemplazo);
		fichaIngresoImpl.setAprobacionFichaIngresoCapitalHumano(aprobacionFichaIngresoCapitalHumano);
		fichaIngresoImpl.setAprobacionFichaIngresoOperaciones(aprobacionFichaIngresoOperaciones);
		fichaIngresoImpl.setActivo(activo);
		fichaIngresoImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			fichaIngresoImpl.setFechacrea(null);
		}
		else {
			fichaIngresoImpl.setFechacrea(new Date(fechacrea));
		}

		fichaIngresoImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			fichaIngresoImpl.setFechamodifica(null);
		}
		else {
			fichaIngresoImpl.setFechamodifica(new Date(fechamodifica));
		}

		fichaIngresoImpl.resetOriginalValues();

		return fichaIngresoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fichaingresoId = objectInput.readLong();
		solicitudRequerimientoId = objectInput.readLong();
		userId = objectInput.readLong();
		equipoTecnico = objectInput.readBoolean();
		reemplazo = objectInput.readBoolean();
		aprobacionFichaIngresoCapitalHumano = objectInput.readBoolean();
		aprobacionFichaIngresoOperaciones = objectInput.readBoolean();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(fichaingresoId);
		objectOutput.writeLong(solicitudRequerimientoId);
		objectOutput.writeLong(userId);
		objectOutput.writeBoolean(equipoTecnico);
		objectOutput.writeBoolean(reemplazo);
		objectOutput.writeBoolean(aprobacionFichaIngresoCapitalHumano);
		objectOutput.writeBoolean(aprobacionFichaIngresoOperaciones);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechamodifica);
	}

	public long fichaingresoId;
	public long solicitudRequerimientoId;
	public long userId;
	public boolean equipoTecnico;
	public boolean reemplazo;
	public boolean aprobacionFichaIngresoCapitalHumano;
	public boolean aprobacionFichaIngresoOperaciones;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}
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

import com.hitss.layer.model.FasePostulacion;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FasePostulacion in entity cache.
 *
 * @author Danielle Delgado
 * @see FasePostulacion
 * @generated
 */
public class FasePostulacionCacheModel implements CacheModel<FasePostulacion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{fasePostulacionId=");
		sb.append(fasePostulacionId);
		sb.append(", solicitudRequerimientoId=");
		sb.append(solicitudRequerimientoId);
		sb.append(", usuarioId=");
		sb.append(usuarioId);
		sb.append(", tipoFase=");
		sb.append(tipoFase);
		sb.append(", fechaFase=");
		sb.append(fechaFase);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", estado=");
		sb.append(estado);
		sb.append(", apruebaEntrevista=");
		sb.append(apruebaEntrevista);
		sb.append(", puntuacion=");
		sb.append(puntuacion);
		sb.append(", salario=");
		sb.append(salario);
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
	public FasePostulacion toEntityModel() {
		FasePostulacionImpl fasePostulacionImpl = new FasePostulacionImpl();

		fasePostulacionImpl.setFasePostulacionId(fasePostulacionId);
		fasePostulacionImpl.setSolicitudRequerimientoId(solicitudRequerimientoId);
		fasePostulacionImpl.setUsuarioId(usuarioId);
		fasePostulacionImpl.setTipoFase(tipoFase);

		if (fechaFase == Long.MIN_VALUE) {
			fasePostulacionImpl.setFechaFase(null);
		}
		else {
			fasePostulacionImpl.setFechaFase(new Date(fechaFase));
		}

		if (descripcion == null) {
			fasePostulacionImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			fasePostulacionImpl.setDescripcion(descripcion);
		}

		fasePostulacionImpl.setEstado(estado);
		fasePostulacionImpl.setApruebaEntrevista(apruebaEntrevista);
		fasePostulacionImpl.setPuntuacion(puntuacion);
		fasePostulacionImpl.setSalario(salario);
		fasePostulacionImpl.setActivo(activo);
		fasePostulacionImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			fasePostulacionImpl.setFechacrea(null);
		}
		else {
			fasePostulacionImpl.setFechacrea(new Date(fechacrea));
		}

		fasePostulacionImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			fasePostulacionImpl.setFechamodifica(null);
		}
		else {
			fasePostulacionImpl.setFechamodifica(new Date(fechamodifica));
		}

		fasePostulacionImpl.resetOriginalValues();

		return fasePostulacionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fasePostulacionId = objectInput.readLong();
		solicitudRequerimientoId = objectInput.readLong();
		usuarioId = objectInput.readLong();
		tipoFase = objectInput.readLong();
		fechaFase = objectInput.readLong();
		descripcion = objectInput.readUTF();
		estado = objectInput.readLong();
		apruebaEntrevista = objectInput.readBoolean();
		puntuacion = objectInput.readInt();
		salario = objectInput.readDouble();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(fasePostulacionId);
		objectOutput.writeLong(solicitudRequerimientoId);
		objectOutput.writeLong(usuarioId);
		objectOutput.writeLong(tipoFase);
		objectOutput.writeLong(fechaFase);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeLong(estado);
		objectOutput.writeBoolean(apruebaEntrevista);
		objectOutput.writeInt(puntuacion);
		objectOutput.writeDouble(salario);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechamodifica);
	}

	public long fasePostulacionId;
	public long solicitudRequerimientoId;
	public long usuarioId;
	public long tipoFase;
	public long fechaFase;
	public String descripcion;
	public long estado;
	public boolean apruebaEntrevista;
	public int puntuacion;
	public double salario;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}
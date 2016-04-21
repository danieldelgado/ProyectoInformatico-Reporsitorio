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

import com.rec.hitss.layer.model.Actividades;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Actividades in entity cache.
 *
 * @author Crossfire
 * @see Actividades
 * @generated
 */
public class ActividadesCacheModel implements CacheModel<Actividades>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{actividadesId=");
		sb.append(actividadesId);
		sb.append(", cronogramaEvaluacionPersonalId=");
		sb.append(cronogramaEvaluacionPersonalId);
		sb.append(", fechacreamodifica=");
		sb.append(fechacreamodifica);
		sb.append(", fechaInicioEvaluacion=");
		sb.append(fechaInicioEvaluacion);
		sb.append(", fechaFinEvaluacion=");
		sb.append(fechaFinEvaluacion);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Actividades toEntityModel() {
		ActividadesImpl actividadesImpl = new ActividadesImpl();

		actividadesImpl.setActividadesId(actividadesId);
		actividadesImpl.setCronogramaEvaluacionPersonalId(cronogramaEvaluacionPersonalId);

		if (fechacreamodifica == Long.MIN_VALUE) {
			actividadesImpl.setFechacreamodifica(null);
		}
		else {
			actividadesImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		if (fechaInicioEvaluacion == Long.MIN_VALUE) {
			actividadesImpl.setFechaInicioEvaluacion(null);
		}
		else {
			actividadesImpl.setFechaInicioEvaluacion(new Date(
					fechaInicioEvaluacion));
		}

		if (fechaFinEvaluacion == Long.MIN_VALUE) {
			actividadesImpl.setFechaFinEvaluacion(null);
		}
		else {
			actividadesImpl.setFechaFinEvaluacion(new Date(fechaFinEvaluacion));
		}

		if (descripcion == null) {
			actividadesImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			actividadesImpl.setDescripcion(descripcion);
		}

		actividadesImpl.setActivo(activo);
		actividadesImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			actividadesImpl.setFechacrea(null);
		}
		else {
			actividadesImpl.setFechacrea(new Date(fechacrea));
		}

		actividadesImpl.setUsuariomodifica(usuariomodifica);

		actividadesImpl.resetOriginalValues();

		return actividadesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		actividadesId = objectInput.readLong();
		cronogramaEvaluacionPersonalId = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
		fechaInicioEvaluacion = objectInput.readLong();
		fechaFinEvaluacion = objectInput.readLong();
		descripcion = objectInput.readUTF();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(actividadesId);
		objectOutput.writeLong(cronogramaEvaluacionPersonalId);
		objectOutput.writeLong(fechacreamodifica);
		objectOutput.writeLong(fechaInicioEvaluacion);
		objectOutput.writeLong(fechaFinEvaluacion);

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
	}

	public long actividadesId;
	public long cronogramaEvaluacionPersonalId;
	public long fechacreamodifica;
	public long fechaInicioEvaluacion;
	public long fechaFinEvaluacion;
	public String descripcion;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
}
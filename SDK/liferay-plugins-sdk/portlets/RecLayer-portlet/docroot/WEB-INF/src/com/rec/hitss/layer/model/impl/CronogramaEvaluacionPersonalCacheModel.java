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

import com.rec.hitss.layer.model.CronogramaEvaluacionPersonal;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CronogramaEvaluacionPersonal in entity cache.
 *
 * @author Crossfire
 * @see CronogramaEvaluacionPersonal
 * @generated
 */
public class CronogramaEvaluacionPersonalCacheModel implements CacheModel<CronogramaEvaluacionPersonal>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{cronogramaEvaluacionPersonalId=");
		sb.append(cronogramaEvaluacionPersonalId);
		sb.append(", solicitudEvaluacionDesempenoId=");
		sb.append(solicitudEvaluacionDesempenoId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", estado=");
		sb.append(estado);
		sb.append(", observacion=");
		sb.append(observacion);
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
	public CronogramaEvaluacionPersonal toEntityModel() {
		CronogramaEvaluacionPersonalImpl cronogramaEvaluacionPersonalImpl = new CronogramaEvaluacionPersonalImpl();

		cronogramaEvaluacionPersonalImpl.setCronogramaEvaluacionPersonalId(cronogramaEvaluacionPersonalId);
		cronogramaEvaluacionPersonalImpl.setSolicitudEvaluacionDesempenoId(solicitudEvaluacionDesempenoId);

		if (descripcion == null) {
			cronogramaEvaluacionPersonalImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			cronogramaEvaluacionPersonalImpl.setDescripcion(descripcion);
		}

		if (estado == null) {
			cronogramaEvaluacionPersonalImpl.setEstado(StringPool.BLANK);
		}
		else {
			cronogramaEvaluacionPersonalImpl.setEstado(estado);
		}

		if (observacion == null) {
			cronogramaEvaluacionPersonalImpl.setObservacion(StringPool.BLANK);
		}
		else {
			cronogramaEvaluacionPersonalImpl.setObservacion(observacion);
		}

		cronogramaEvaluacionPersonalImpl.setActivo(activo);
		cronogramaEvaluacionPersonalImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			cronogramaEvaluacionPersonalImpl.setFechacrea(null);
		}
		else {
			cronogramaEvaluacionPersonalImpl.setFechacrea(new Date(fechacrea));
		}

		cronogramaEvaluacionPersonalImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			cronogramaEvaluacionPersonalImpl.setFechacreamodifica(null);
		}
		else {
			cronogramaEvaluacionPersonalImpl.setFechacreamodifica(new Date(
					fechacreamodifica));
		}

		cronogramaEvaluacionPersonalImpl.resetOriginalValues();

		return cronogramaEvaluacionPersonalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cronogramaEvaluacionPersonalId = objectInput.readLong();
		solicitudEvaluacionDesempenoId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		estado = objectInput.readUTF();
		observacion = objectInput.readUTF();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cronogramaEvaluacionPersonalId);
		objectOutput.writeLong(solicitudEvaluacionDesempenoId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		if (estado == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(estado);
		}

		if (observacion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(observacion);
		}

		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long cronogramaEvaluacionPersonalId;
	public long solicitudEvaluacionDesempenoId;
	public String descripcion;
	public String estado;
	public String observacion;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}
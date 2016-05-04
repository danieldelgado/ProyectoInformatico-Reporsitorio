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

import com.hitss.layer.model.SolicitudEvaluacionDesempenno;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SolicitudEvaluacionDesempenno in entity cache.
 *
 * @author Danielle Delgado
 * @see SolicitudEvaluacionDesempenno
 * @generated
 */
public class SolicitudEvaluacionDesempennoCacheModel implements CacheModel<SolicitudEvaluacionDesempenno>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{solicitudEvaluacionDesempennoId=");
		sb.append(solicitudEvaluacionDesempennoId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", fechaInicio=");
		sb.append(fechaInicio);
		sb.append(", estado=");
		sb.append(estado);
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
	public SolicitudEvaluacionDesempenno toEntityModel() {
		SolicitudEvaluacionDesempennoImpl solicitudEvaluacionDesempennoImpl = new SolicitudEvaluacionDesempennoImpl();

		solicitudEvaluacionDesempennoImpl.setSolicitudEvaluacionDesempennoId(solicitudEvaluacionDesempennoId);

		if (descripcion == null) {
			solicitudEvaluacionDesempennoImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			solicitudEvaluacionDesempennoImpl.setDescripcion(descripcion);
		}

		if (fechaInicio == Long.MIN_VALUE) {
			solicitudEvaluacionDesempennoImpl.setFechaInicio(null);
		}
		else {
			solicitudEvaluacionDesempennoImpl.setFechaInicio(new Date(
					fechaInicio));
		}

		solicitudEvaluacionDesempennoImpl.setEstado(estado);
		solicitudEvaluacionDesempennoImpl.setActivo(activo);
		solicitudEvaluacionDesempennoImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			solicitudEvaluacionDesempennoImpl.setFechacrea(null);
		}
		else {
			solicitudEvaluacionDesempennoImpl.setFechacrea(new Date(fechacrea));
		}

		solicitudEvaluacionDesempennoImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			solicitudEvaluacionDesempennoImpl.setFechacreamodifica(null);
		}
		else {
			solicitudEvaluacionDesempennoImpl.setFechacreamodifica(new Date(
					fechacreamodifica));
		}

		solicitudEvaluacionDesempennoImpl.resetOriginalValues();

		return solicitudEvaluacionDesempennoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		solicitudEvaluacionDesempennoId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		fechaInicio = objectInput.readLong();
		estado = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(solicitudEvaluacionDesempennoId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeLong(fechaInicio);
		objectOutput.writeLong(estado);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long solicitudEvaluacionDesempennoId;
	public String descripcion;
	public long fechaInicio;
	public long estado;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}
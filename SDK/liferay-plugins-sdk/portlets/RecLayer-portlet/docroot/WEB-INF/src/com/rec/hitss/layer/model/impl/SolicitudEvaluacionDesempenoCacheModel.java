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

import com.rec.hitss.layer.model.SolicitudEvaluacionDesempeno;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SolicitudEvaluacionDesempeno in entity cache.
 *
 * @author Crossfire
 * @see SolicitudEvaluacionDesempeno
 * @generated
 */
public class SolicitudEvaluacionDesempenoCacheModel implements CacheModel<SolicitudEvaluacionDesempeno>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{solicitudEvaluacionDesempenoId=");
		sb.append(solicitudEvaluacionDesempenoId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", fechaIncioEvaluacion=");
		sb.append(fechaIncioEvaluacion);
		sb.append(", estado=");
		sb.append(estado);
		sb.append(", motivo=");
		sb.append(motivo);
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
	public SolicitudEvaluacionDesempeno toEntityModel() {
		SolicitudEvaluacionDesempenoImpl solicitudEvaluacionDesempenoImpl = new SolicitudEvaluacionDesempenoImpl();

		solicitudEvaluacionDesempenoImpl.setSolicitudEvaluacionDesempenoId(solicitudEvaluacionDesempenoId);

		if (descripcion == null) {
			solicitudEvaluacionDesempenoImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			solicitudEvaluacionDesempenoImpl.setDescripcion(descripcion);
		}

		if (fechaIncioEvaluacion == Long.MIN_VALUE) {
			solicitudEvaluacionDesempenoImpl.setFechaIncioEvaluacion(null);
		}
		else {
			solicitudEvaluacionDesempenoImpl.setFechaIncioEvaluacion(new Date(
					fechaIncioEvaluacion));
		}

		if (estado == null) {
			solicitudEvaluacionDesempenoImpl.setEstado(StringPool.BLANK);
		}
		else {
			solicitudEvaluacionDesempenoImpl.setEstado(estado);
		}

		if (motivo == null) {
			solicitudEvaluacionDesempenoImpl.setMotivo(StringPool.BLANK);
		}
		else {
			solicitudEvaluacionDesempenoImpl.setMotivo(motivo);
		}

		if (observacion == null) {
			solicitudEvaluacionDesempenoImpl.setObservacion(StringPool.BLANK);
		}
		else {
			solicitudEvaluacionDesempenoImpl.setObservacion(observacion);
		}

		solicitudEvaluacionDesempenoImpl.setActivo(activo);
		solicitudEvaluacionDesempenoImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			solicitudEvaluacionDesempenoImpl.setFechacrea(null);
		}
		else {
			solicitudEvaluacionDesempenoImpl.setFechacrea(new Date(fechacrea));
		}

		solicitudEvaluacionDesempenoImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			solicitudEvaluacionDesempenoImpl.setFechacreamodifica(null);
		}
		else {
			solicitudEvaluacionDesempenoImpl.setFechacreamodifica(new Date(
					fechacreamodifica));
		}

		solicitudEvaluacionDesempenoImpl.resetOriginalValues();

		return solicitudEvaluacionDesempenoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		solicitudEvaluacionDesempenoId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		fechaIncioEvaluacion = objectInput.readLong();
		estado = objectInput.readUTF();
		motivo = objectInput.readUTF();
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
		objectOutput.writeLong(solicitudEvaluacionDesempenoId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeLong(fechaIncioEvaluacion);

		if (estado == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(estado);
		}

		if (motivo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(motivo);
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

	public long solicitudEvaluacionDesempenoId;
	public String descripcion;
	public long fechaIncioEvaluacion;
	public String estado;
	public String motivo;
	public String observacion;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}
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

import com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamiento;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing avanceEstadoSolicitudReclutamiento in entity cache.
 *
 * @author Crossfire
 * @see avanceEstadoSolicitudReclutamiento
 * @generated
 */
public class avanceEstadoSolicitudReclutamientoCacheModel implements CacheModel<avanceEstadoSolicitudReclutamiento>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{AESR_ID=");
		sb.append(AESR_ID);
		sb.append(", AESR_ESTADO=");
		sb.append(AESR_ESTADO);
		sb.append(", AESR_ACTIVO=");
		sb.append(AESR_ACTIVO);
		sb.append(", AESR_USUARIO_CREA=");
		sb.append(AESR_USUARIO_CREA);
		sb.append(", AESR_FECHA_CREA=");
		sb.append(AESR_FECHA_CREA);
		sb.append(", AESR_USUARIO_MODIFICA=");
		sb.append(AESR_USUARIO_MODIFICA);
		sb.append(", AESR_FECHA_MODIFICA=");
		sb.append(AESR_FECHA_MODIFICA);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public avanceEstadoSolicitudReclutamiento toEntityModel() {
		avanceEstadoSolicitudReclutamientoImpl avanceEstadoSolicitudReclutamientoImpl =
			new avanceEstadoSolicitudReclutamientoImpl();

		avanceEstadoSolicitudReclutamientoImpl.setAESR_ID(AESR_ID);

		if (AESR_ESTADO == null) {
			avanceEstadoSolicitudReclutamientoImpl.setAESR_ESTADO(StringPool.BLANK);
		}
		else {
			avanceEstadoSolicitudReclutamientoImpl.setAESR_ESTADO(AESR_ESTADO);
		}

		if (AESR_ACTIVO == null) {
			avanceEstadoSolicitudReclutamientoImpl.setAESR_ACTIVO(StringPool.BLANK);
		}
		else {
			avanceEstadoSolicitudReclutamientoImpl.setAESR_ACTIVO(AESR_ACTIVO);
		}

		avanceEstadoSolicitudReclutamientoImpl.setAESR_USUARIO_CREA(AESR_USUARIO_CREA);

		if (AESR_FECHA_CREA == Long.MIN_VALUE) {
			avanceEstadoSolicitudReclutamientoImpl.setAESR_FECHA_CREA(null);
		}
		else {
			avanceEstadoSolicitudReclutamientoImpl.setAESR_FECHA_CREA(new Date(
					AESR_FECHA_CREA));
		}

		avanceEstadoSolicitudReclutamientoImpl.setAESR_USUARIO_MODIFICA(AESR_USUARIO_MODIFICA);

		if (AESR_FECHA_MODIFICA == Long.MIN_VALUE) {
			avanceEstadoSolicitudReclutamientoImpl.setAESR_FECHA_MODIFICA(null);
		}
		else {
			avanceEstadoSolicitudReclutamientoImpl.setAESR_FECHA_MODIFICA(new Date(
					AESR_FECHA_MODIFICA));
		}

		avanceEstadoSolicitudReclutamientoImpl.resetOriginalValues();

		return avanceEstadoSolicitudReclutamientoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		AESR_ID = objectInput.readLong();
		AESR_ESTADO = objectInput.readUTF();
		AESR_ACTIVO = objectInput.readUTF();
		AESR_USUARIO_CREA = objectInput.readLong();
		AESR_FECHA_CREA = objectInput.readLong();
		AESR_USUARIO_MODIFICA = objectInput.readLong();
		AESR_FECHA_MODIFICA = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(AESR_ID);

		if (AESR_ESTADO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(AESR_ESTADO);
		}

		if (AESR_ACTIVO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(AESR_ACTIVO);
		}

		objectOutput.writeLong(AESR_USUARIO_CREA);
		objectOutput.writeLong(AESR_FECHA_CREA);
		objectOutput.writeLong(AESR_USUARIO_MODIFICA);
		objectOutput.writeLong(AESR_FECHA_MODIFICA);
	}

	public long AESR_ID;
	public String AESR_ESTADO;
	public String AESR_ACTIVO;
	public long AESR_USUARIO_CREA;
	public long AESR_FECHA_CREA;
	public long AESR_USUARIO_MODIFICA;
	public long AESR_FECHA_MODIFICA;
}
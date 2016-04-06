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

import com.rec.hitss.layer.model.EvaluacionReclutamiento;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EvaluacionReclutamiento in entity cache.
 *
 * @author Crossfire
 * @see EvaluacionReclutamiento
 * @generated
 */
public class EvaluacionReclutamientoCacheModel implements CacheModel<EvaluacionReclutamiento>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{ER_ID=");
		sb.append(ER_ID);
		sb.append(", ER_ESTADO=");
		sb.append(ER_ESTADO);
		sb.append(", ER_ACTIVO=");
		sb.append(ER_ACTIVO);
		sb.append(", ER_USUARIO_CREA=");
		sb.append(ER_USUARIO_CREA);
		sb.append(", ER_FECHA_CREA=");
		sb.append(ER_FECHA_CREA);
		sb.append(", ER_USUARIO_MODIFICA=");
		sb.append(ER_USUARIO_MODIFICA);
		sb.append(", ER_FECHA_MODIFICA=");
		sb.append(ER_FECHA_MODIFICA);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EvaluacionReclutamiento toEntityModel() {
		EvaluacionReclutamientoImpl evaluacionReclutamientoImpl = new EvaluacionReclutamientoImpl();

		evaluacionReclutamientoImpl.setER_ID(ER_ID);

		if (ER_ESTADO == null) {
			evaluacionReclutamientoImpl.setER_ESTADO(StringPool.BLANK);
		}
		else {
			evaluacionReclutamientoImpl.setER_ESTADO(ER_ESTADO);
		}

		if (ER_ACTIVO == null) {
			evaluacionReclutamientoImpl.setER_ACTIVO(StringPool.BLANK);
		}
		else {
			evaluacionReclutamientoImpl.setER_ACTIVO(ER_ACTIVO);
		}

		evaluacionReclutamientoImpl.setER_USUARIO_CREA(ER_USUARIO_CREA);

		if (ER_FECHA_CREA == Long.MIN_VALUE) {
			evaluacionReclutamientoImpl.setER_FECHA_CREA(null);
		}
		else {
			evaluacionReclutamientoImpl.setER_FECHA_CREA(new Date(ER_FECHA_CREA));
		}

		evaluacionReclutamientoImpl.setER_USUARIO_MODIFICA(ER_USUARIO_MODIFICA);

		if (ER_FECHA_MODIFICA == Long.MIN_VALUE) {
			evaluacionReclutamientoImpl.setER_FECHA_MODIFICA(null);
		}
		else {
			evaluacionReclutamientoImpl.setER_FECHA_MODIFICA(new Date(
					ER_FECHA_MODIFICA));
		}

		evaluacionReclutamientoImpl.resetOriginalValues();

		return evaluacionReclutamientoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ER_ID = objectInput.readLong();
		ER_ESTADO = objectInput.readUTF();
		ER_ACTIVO = objectInput.readUTF();
		ER_USUARIO_CREA = objectInput.readLong();
		ER_FECHA_CREA = objectInput.readLong();
		ER_USUARIO_MODIFICA = objectInput.readLong();
		ER_FECHA_MODIFICA = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(ER_ID);

		if (ER_ESTADO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ER_ESTADO);
		}

		if (ER_ACTIVO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ER_ACTIVO);
		}

		objectOutput.writeLong(ER_USUARIO_CREA);
		objectOutput.writeLong(ER_FECHA_CREA);
		objectOutput.writeLong(ER_USUARIO_MODIFICA);
		objectOutput.writeLong(ER_FECHA_MODIFICA);
	}

	public long ER_ID;
	public String ER_ESTADO;
	public String ER_ACTIVO;
	public long ER_USUARIO_CREA;
	public long ER_FECHA_CREA;
	public long ER_USUARIO_MODIFICA;
	public long ER_FECHA_MODIFICA;
}
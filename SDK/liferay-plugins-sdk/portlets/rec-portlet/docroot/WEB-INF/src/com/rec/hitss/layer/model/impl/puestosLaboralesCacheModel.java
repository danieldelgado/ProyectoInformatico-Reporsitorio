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

import com.rec.hitss.layer.model.puestosLaborales;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing puestosLaborales in entity cache.
 *
 * @author Crossfire
 * @see puestosLaborales
 * @generated
 */
public class puestosLaboralesCacheModel implements CacheModel<puestosLaborales>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{PL_ID=");
		sb.append(PL_ID);
		sb.append(", PL_PUESTO=");
		sb.append(PL_PUESTO);
		sb.append(", PL_ESTADO=");
		sb.append(PL_ESTADO);
		sb.append(", PL_ACTIVO=");
		sb.append(PL_ACTIVO);
		sb.append(", PL_USUARIO_CREA=");
		sb.append(PL_USUARIO_CREA);
		sb.append(", PL_FECHA_CREA=");
		sb.append(PL_FECHA_CREA);
		sb.append(", PL_USUARIO_MODIFICA=");
		sb.append(PL_USUARIO_MODIFICA);
		sb.append(", PL_FECHA_MODIFICA=");
		sb.append(PL_FECHA_MODIFICA);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public puestosLaborales toEntityModel() {
		puestosLaboralesImpl puestosLaboralesImpl = new puestosLaboralesImpl();

		puestosLaboralesImpl.setPL_ID(PL_ID);

		if (PL_PUESTO == null) {
			puestosLaboralesImpl.setPL_PUESTO(StringPool.BLANK);
		}
		else {
			puestosLaboralesImpl.setPL_PUESTO(PL_PUESTO);
		}

		if (PL_ESTADO == null) {
			puestosLaboralesImpl.setPL_ESTADO(StringPool.BLANK);
		}
		else {
			puestosLaboralesImpl.setPL_ESTADO(PL_ESTADO);
		}

		if (PL_ACTIVO == null) {
			puestosLaboralesImpl.setPL_ACTIVO(StringPool.BLANK);
		}
		else {
			puestosLaboralesImpl.setPL_ACTIVO(PL_ACTIVO);
		}

		puestosLaboralesImpl.setPL_USUARIO_CREA(PL_USUARIO_CREA);

		if (PL_FECHA_CREA == Long.MIN_VALUE) {
			puestosLaboralesImpl.setPL_FECHA_CREA(null);
		}
		else {
			puestosLaboralesImpl.setPL_FECHA_CREA(new Date(PL_FECHA_CREA));
		}

		puestosLaboralesImpl.setPL_USUARIO_MODIFICA(PL_USUARIO_MODIFICA);

		if (PL_FECHA_MODIFICA == Long.MIN_VALUE) {
			puestosLaboralesImpl.setPL_FECHA_MODIFICA(null);
		}
		else {
			puestosLaboralesImpl.setPL_FECHA_MODIFICA(new Date(
					PL_FECHA_MODIFICA));
		}

		puestosLaboralesImpl.resetOriginalValues();

		return puestosLaboralesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		PL_ID = objectInput.readLong();
		PL_PUESTO = objectInput.readUTF();
		PL_ESTADO = objectInput.readUTF();
		PL_ACTIVO = objectInput.readUTF();
		PL_USUARIO_CREA = objectInput.readLong();
		PL_FECHA_CREA = objectInput.readLong();
		PL_USUARIO_MODIFICA = objectInput.readLong();
		PL_FECHA_MODIFICA = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(PL_ID);

		if (PL_PUESTO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PL_PUESTO);
		}

		if (PL_ESTADO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PL_ESTADO);
		}

		if (PL_ACTIVO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PL_ACTIVO);
		}

		objectOutput.writeLong(PL_USUARIO_CREA);
		objectOutput.writeLong(PL_FECHA_CREA);
		objectOutput.writeLong(PL_USUARIO_MODIFICA);
		objectOutput.writeLong(PL_FECHA_MODIFICA);
	}

	public long PL_ID;
	public String PL_PUESTO;
	public String PL_ESTADO;
	public String PL_ACTIVO;
	public long PL_USUARIO_CREA;
	public long PL_FECHA_CREA;
	public long PL_USUARIO_MODIFICA;
	public long PL_FECHA_MODIFICA;
}
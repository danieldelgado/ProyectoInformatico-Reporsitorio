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

import com.rec.hitss.layer.model.fichaIngreso;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing fichaIngreso in entity cache.
 *
 * @author Crossfire
 * @see fichaIngreso
 * @generated
 */
public class fichaIngresoCacheModel implements CacheModel<fichaIngreso>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{FI_ID=");
		sb.append(FI_ID);
		sb.append(", FI_ESTADO=");
		sb.append(FI_ESTADO);
		sb.append(", FI_ACTIVO=");
		sb.append(FI_ACTIVO);
		sb.append(", FI_USUARIO_CREA=");
		sb.append(FI_USUARIO_CREA);
		sb.append(", FI_FECHA_CREA=");
		sb.append(FI_FECHA_CREA);
		sb.append(", FI_USUARIO_MODIFICA=");
		sb.append(FI_USUARIO_MODIFICA);
		sb.append(", FI_FECHA_MODIFICA=");
		sb.append(FI_FECHA_MODIFICA);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public fichaIngreso toEntityModel() {
		fichaIngresoImpl fichaIngresoImpl = new fichaIngresoImpl();

		fichaIngresoImpl.setFI_ID(FI_ID);

		if (FI_ESTADO == null) {
			fichaIngresoImpl.setFI_ESTADO(StringPool.BLANK);
		}
		else {
			fichaIngresoImpl.setFI_ESTADO(FI_ESTADO);
		}

		if (FI_ACTIVO == null) {
			fichaIngresoImpl.setFI_ACTIVO(StringPool.BLANK);
		}
		else {
			fichaIngresoImpl.setFI_ACTIVO(FI_ACTIVO);
		}

		fichaIngresoImpl.setFI_USUARIO_CREA(FI_USUARIO_CREA);

		if (FI_FECHA_CREA == Long.MIN_VALUE) {
			fichaIngresoImpl.setFI_FECHA_CREA(null);
		}
		else {
			fichaIngresoImpl.setFI_FECHA_CREA(new Date(FI_FECHA_CREA));
		}

		fichaIngresoImpl.setFI_USUARIO_MODIFICA(FI_USUARIO_MODIFICA);

		if (FI_FECHA_MODIFICA == Long.MIN_VALUE) {
			fichaIngresoImpl.setFI_FECHA_MODIFICA(null);
		}
		else {
			fichaIngresoImpl.setFI_FECHA_MODIFICA(new Date(FI_FECHA_MODIFICA));
		}

		fichaIngresoImpl.resetOriginalValues();

		return fichaIngresoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		FI_ID = objectInput.readLong();
		FI_ESTADO = objectInput.readUTF();
		FI_ACTIVO = objectInput.readUTF();
		FI_USUARIO_CREA = objectInput.readLong();
		FI_FECHA_CREA = objectInput.readLong();
		FI_USUARIO_MODIFICA = objectInput.readLong();
		FI_FECHA_MODIFICA = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(FI_ID);

		if (FI_ESTADO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FI_ESTADO);
		}

		if (FI_ACTIVO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FI_ACTIVO);
		}

		objectOutput.writeLong(FI_USUARIO_CREA);
		objectOutput.writeLong(FI_FECHA_CREA);
		objectOutput.writeLong(FI_USUARIO_MODIFICA);
		objectOutput.writeLong(FI_FECHA_MODIFICA);
	}

	public long FI_ID;
	public String FI_ESTADO;
	public String FI_ACTIVO;
	public long FI_USUARIO_CREA;
	public long FI_FECHA_CREA;
	public long FI_USUARIO_MODIFICA;
	public long FI_FECHA_MODIFICA;
}
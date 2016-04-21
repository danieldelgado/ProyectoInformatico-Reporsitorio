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

import com.rec.hitss.layer.model.cartillaReclutamiento;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing cartillaReclutamiento in entity cache.
 *
 * @author Crossfire
 * @see cartillaReclutamiento
 * @generated
 */
public class cartillaReclutamientoCacheModel implements CacheModel<cartillaReclutamiento>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{CR_ID=");
		sb.append(CR_ID);
		sb.append(", CR_ESTADO=");
		sb.append(CR_ESTADO);
		sb.append(", CR_ACTIVO=");
		sb.append(CR_ACTIVO);
		sb.append(", CR_USUARIO_CREA=");
		sb.append(CR_USUARIO_CREA);
		sb.append(", CR_FECHA_CREA=");
		sb.append(CR_FECHA_CREA);
		sb.append(", CR_USUARIO_MODIFICA=");
		sb.append(CR_USUARIO_MODIFICA);
		sb.append(", CR_FECHA_MODIFICA=");
		sb.append(CR_FECHA_MODIFICA);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public cartillaReclutamiento toEntityModel() {
		cartillaReclutamientoImpl cartillaReclutamientoImpl = new cartillaReclutamientoImpl();

		cartillaReclutamientoImpl.setCR_ID(CR_ID);

		if (CR_ESTADO == null) {
			cartillaReclutamientoImpl.setCR_ESTADO(StringPool.BLANK);
		}
		else {
			cartillaReclutamientoImpl.setCR_ESTADO(CR_ESTADO);
		}

		if (CR_ACTIVO == null) {
			cartillaReclutamientoImpl.setCR_ACTIVO(StringPool.BLANK);
		}
		else {
			cartillaReclutamientoImpl.setCR_ACTIVO(CR_ACTIVO);
		}

		cartillaReclutamientoImpl.setCR_USUARIO_CREA(CR_USUARIO_CREA);

		if (CR_FECHA_CREA == Long.MIN_VALUE) {
			cartillaReclutamientoImpl.setCR_FECHA_CREA(null);
		}
		else {
			cartillaReclutamientoImpl.setCR_FECHA_CREA(new Date(CR_FECHA_CREA));
		}

		cartillaReclutamientoImpl.setCR_USUARIO_MODIFICA(CR_USUARIO_MODIFICA);

		if (CR_FECHA_MODIFICA == Long.MIN_VALUE) {
			cartillaReclutamientoImpl.setCR_FECHA_MODIFICA(null);
		}
		else {
			cartillaReclutamientoImpl.setCR_FECHA_MODIFICA(new Date(
					CR_FECHA_MODIFICA));
		}

		cartillaReclutamientoImpl.resetOriginalValues();

		return cartillaReclutamientoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		CR_ID = objectInput.readLong();
		CR_ESTADO = objectInput.readUTF();
		CR_ACTIVO = objectInput.readUTF();
		CR_USUARIO_CREA = objectInput.readLong();
		CR_FECHA_CREA = objectInput.readLong();
		CR_USUARIO_MODIFICA = objectInput.readLong();
		CR_FECHA_MODIFICA = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(CR_ID);

		if (CR_ESTADO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CR_ESTADO);
		}

		if (CR_ACTIVO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CR_ACTIVO);
		}

		objectOutput.writeLong(CR_USUARIO_CREA);
		objectOutput.writeLong(CR_FECHA_CREA);
		objectOutput.writeLong(CR_USUARIO_MODIFICA);
		objectOutput.writeLong(CR_FECHA_MODIFICA);
	}

	public long CR_ID;
	public String CR_ESTADO;
	public String CR_ACTIVO;
	public long CR_USUARIO_CREA;
	public long CR_FECHA_CREA;
	public long CR_USUARIO_MODIFICA;
	public long CR_FECHA_MODIFICA;
}
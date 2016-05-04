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

import com.rec.hitss.layer.model.solicitudReclutamiento;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing solicitudReclutamiento in entity cache.
 *
 * @author Crossfire
 * @see solicitudReclutamiento
 * @generated
 */
public class solicitudReclutamientoCacheModel implements CacheModel<solicitudReclutamiento>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{SR_ID=");
		sb.append(SR_ID);
		sb.append(", SR_PL_ID=");
		sb.append(SR_PL_ID);
		sb.append(", SR_ESTADO=");
		sb.append(SR_ESTADO);
		sb.append(", SR_ACTIVO=");
		sb.append(SR_ACTIVO);
		sb.append(", SR_USUARIO_CREA=");
		sb.append(SR_USUARIO_CREA);
		sb.append(", SR_FECHA_CREA=");
		sb.append(SR_FECHA_CREA);
		sb.append(", SR_USUARIO_MODIFICA=");
		sb.append(SR_USUARIO_MODIFICA);
		sb.append(", SR_FECHA_MODIFICA=");
		sb.append(SR_FECHA_MODIFICA);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public solicitudReclutamiento toEntityModel() {
		solicitudReclutamientoImpl solicitudReclutamientoImpl = new solicitudReclutamientoImpl();

		solicitudReclutamientoImpl.setSR_ID(SR_ID);

		if (SR_PL_ID == null) {
			solicitudReclutamientoImpl.setSR_PL_ID(StringPool.BLANK);
		}
		else {
			solicitudReclutamientoImpl.setSR_PL_ID(SR_PL_ID);
		}

		solicitudReclutamientoImpl.setSR_ESTADO(SR_ESTADO);

		if (SR_ACTIVO == null) {
			solicitudReclutamientoImpl.setSR_ACTIVO(StringPool.BLANK);
		}
		else {
			solicitudReclutamientoImpl.setSR_ACTIVO(SR_ACTIVO);
		}

		solicitudReclutamientoImpl.setSR_USUARIO_CREA(SR_USUARIO_CREA);

		if (SR_FECHA_CREA == Long.MIN_VALUE) {
			solicitudReclutamientoImpl.setSR_FECHA_CREA(null);
		}
		else {
			solicitudReclutamientoImpl.setSR_FECHA_CREA(new Date(SR_FECHA_CREA));
		}

		solicitudReclutamientoImpl.setSR_USUARIO_MODIFICA(SR_USUARIO_MODIFICA);

		if (SR_FECHA_MODIFICA == Long.MIN_VALUE) {
			solicitudReclutamientoImpl.setSR_FECHA_MODIFICA(null);
		}
		else {
			solicitudReclutamientoImpl.setSR_FECHA_MODIFICA(new Date(
					SR_FECHA_MODIFICA));
		}

		solicitudReclutamientoImpl.resetOriginalValues();

		return solicitudReclutamientoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		SR_ID = objectInput.readLong();
		SR_PL_ID = objectInput.readUTF();
		SR_ESTADO = objectInput.readLong();
		SR_ACTIVO = objectInput.readUTF();
		SR_USUARIO_CREA = objectInput.readLong();
		SR_FECHA_CREA = objectInput.readLong();
		SR_USUARIO_MODIFICA = objectInput.readLong();
		SR_FECHA_MODIFICA = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(SR_ID);

		if (SR_PL_ID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SR_PL_ID);
		}

		objectOutput.writeLong(SR_ESTADO);

		if (SR_ACTIVO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SR_ACTIVO);
		}

		objectOutput.writeLong(SR_USUARIO_CREA);
		objectOutput.writeLong(SR_FECHA_CREA);
		objectOutput.writeLong(SR_USUARIO_MODIFICA);
		objectOutput.writeLong(SR_FECHA_MODIFICA);
	}

	public long SR_ID;
	public String SR_PL_ID;
	public long SR_ESTADO;
	public String SR_ACTIVO;
	public long SR_USUARIO_CREA;
	public long SR_FECHA_CREA;
	public long SR_USUARIO_MODIFICA;
	public long SR_FECHA_MODIFICA;
}
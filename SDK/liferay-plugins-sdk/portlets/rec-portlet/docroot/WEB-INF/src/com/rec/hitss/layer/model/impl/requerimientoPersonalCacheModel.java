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

import com.rec.hitss.layer.model.requerimientoPersonal;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing requerimientoPersonal in entity cache.
 *
 * @author Crossfire
 * @see requerimientoPersonal
 * @generated
 */
public class requerimientoPersonalCacheModel implements CacheModel<requerimientoPersonal>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{REQ_ID=");
		sb.append(REQ_ID);
		sb.append(", REQ_ESTADO=");
		sb.append(REQ_ESTADO);
		sb.append(", REQ_ACTIVO=");
		sb.append(REQ_ACTIVO);
		sb.append(", REQ_USUARIO_CREA=");
		sb.append(REQ_USUARIO_CREA);
		sb.append(", REQ_FECHA_CREA=");
		sb.append(REQ_FECHA_CREA);
		sb.append(", REQ_USUARIO_MODIFICA=");
		sb.append(REQ_USUARIO_MODIFICA);
		sb.append(", REQ_FECHA_MODIFICA=");
		sb.append(REQ_FECHA_MODIFICA);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public requerimientoPersonal toEntityModel() {
		requerimientoPersonalImpl requerimientoPersonalImpl = new requerimientoPersonalImpl();

		requerimientoPersonalImpl.setREQ_ID(REQ_ID);

		if (REQ_ESTADO == null) {
			requerimientoPersonalImpl.setREQ_ESTADO(StringPool.BLANK);
		}
		else {
			requerimientoPersonalImpl.setREQ_ESTADO(REQ_ESTADO);
		}

		if (REQ_ACTIVO == null) {
			requerimientoPersonalImpl.setREQ_ACTIVO(StringPool.BLANK);
		}
		else {
			requerimientoPersonalImpl.setREQ_ACTIVO(REQ_ACTIVO);
		}

		requerimientoPersonalImpl.setREQ_USUARIO_CREA(REQ_USUARIO_CREA);

		if (REQ_FECHA_CREA == Long.MIN_VALUE) {
			requerimientoPersonalImpl.setREQ_FECHA_CREA(null);
		}
		else {
			requerimientoPersonalImpl.setREQ_FECHA_CREA(new Date(REQ_FECHA_CREA));
		}

		requerimientoPersonalImpl.setREQ_USUARIO_MODIFICA(REQ_USUARIO_MODIFICA);

		if (REQ_FECHA_MODIFICA == Long.MIN_VALUE) {
			requerimientoPersonalImpl.setREQ_FECHA_MODIFICA(null);
		}
		else {
			requerimientoPersonalImpl.setREQ_FECHA_MODIFICA(new Date(
					REQ_FECHA_MODIFICA));
		}

		requerimientoPersonalImpl.resetOriginalValues();

		return requerimientoPersonalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		REQ_ID = objectInput.readLong();
		REQ_ESTADO = objectInput.readUTF();
		REQ_ACTIVO = objectInput.readUTF();
		REQ_USUARIO_CREA = objectInput.readLong();
		REQ_FECHA_CREA = objectInput.readLong();
		REQ_USUARIO_MODIFICA = objectInput.readLong();
		REQ_FECHA_MODIFICA = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(REQ_ID);

		if (REQ_ESTADO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(REQ_ESTADO);
		}

		if (REQ_ACTIVO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(REQ_ACTIVO);
		}

		objectOutput.writeLong(REQ_USUARIO_CREA);
		objectOutput.writeLong(REQ_FECHA_CREA);
		objectOutput.writeLong(REQ_USUARIO_MODIFICA);
		objectOutput.writeLong(REQ_FECHA_MODIFICA);
	}

	public long REQ_ID;
	public String REQ_ESTADO;
	public String REQ_ACTIVO;
	public long REQ_USUARIO_CREA;
	public long REQ_FECHA_CREA;
	public long REQ_USUARIO_MODIFICA;
	public long REQ_FECHA_MODIFICA;
}
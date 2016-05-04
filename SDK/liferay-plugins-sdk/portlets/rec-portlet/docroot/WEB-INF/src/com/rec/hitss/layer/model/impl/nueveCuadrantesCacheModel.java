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

import com.rec.hitss.layer.model.nueveCuadrantes;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing nueveCuadrantes in entity cache.
 *
 * @author Crossfire
 * @see nueveCuadrantes
 * @generated
 */
public class nueveCuadrantesCacheModel implements CacheModel<nueveCuadrantes>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{NC_ID=");
		sb.append(NC_ID);
		sb.append(", REQ_ESTADO=");
		sb.append(REQ_ESTADO);
		sb.append(", REQ_ACTIVO=");
		sb.append(REQ_ACTIVO);
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
	public nueveCuadrantes toEntityModel() {
		nueveCuadrantesImpl nueveCuadrantesImpl = new nueveCuadrantesImpl();

		nueveCuadrantesImpl.setNC_ID(NC_ID);

		if (REQ_ESTADO == null) {
			nueveCuadrantesImpl.setREQ_ESTADO(StringPool.BLANK);
		}
		else {
			nueveCuadrantesImpl.setREQ_ESTADO(REQ_ESTADO);
		}

		if (REQ_ACTIVO == null) {
			nueveCuadrantesImpl.setREQ_ACTIVO(StringPool.BLANK);
		}
		else {
			nueveCuadrantesImpl.setREQ_ACTIVO(REQ_ACTIVO);
		}

		nueveCuadrantesImpl.setSR_USUARIO_CREA(SR_USUARIO_CREA);

		if (SR_FECHA_CREA == Long.MIN_VALUE) {
			nueveCuadrantesImpl.setSR_FECHA_CREA(null);
		}
		else {
			nueveCuadrantesImpl.setSR_FECHA_CREA(new Date(SR_FECHA_CREA));
		}

		nueveCuadrantesImpl.setSR_USUARIO_MODIFICA(SR_USUARIO_MODIFICA);

		if (SR_FECHA_MODIFICA == Long.MIN_VALUE) {
			nueveCuadrantesImpl.setSR_FECHA_MODIFICA(null);
		}
		else {
			nueveCuadrantesImpl.setSR_FECHA_MODIFICA(new Date(SR_FECHA_MODIFICA));
		}

		nueveCuadrantesImpl.resetOriginalValues();

		return nueveCuadrantesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		NC_ID = objectInput.readLong();
		REQ_ESTADO = objectInput.readUTF();
		REQ_ACTIVO = objectInput.readUTF();
		SR_USUARIO_CREA = objectInput.readLong();
		SR_FECHA_CREA = objectInput.readLong();
		SR_USUARIO_MODIFICA = objectInput.readLong();
		SR_FECHA_MODIFICA = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(NC_ID);

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

		objectOutput.writeLong(SR_USUARIO_CREA);
		objectOutput.writeLong(SR_FECHA_CREA);
		objectOutput.writeLong(SR_USUARIO_MODIFICA);
		objectOutput.writeLong(SR_FECHA_MODIFICA);
	}

	public long NC_ID;
	public String REQ_ESTADO;
	public String REQ_ACTIVO;
	public long SR_USUARIO_CREA;
	public long SR_FECHA_CREA;
	public long SR_USUARIO_MODIFICA;
	public long SR_FECHA_MODIFICA;
}
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

import com.rec.hitss.layer.model.Contrato;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Contrato in entity cache.
 *
 * @author Crossfire
 * @see Contrato
 * @generated
 */
public class ContratoCacheModel implements CacheModel<Contrato>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{CT_ID=");
		sb.append(CT_ID);
		sb.append(", CT_ESTADO=");
		sb.append(CT_ESTADO);
		sb.append(", CT_ACTIVO=");
		sb.append(CT_ACTIVO);
		sb.append(", CT_USUARIO_CREA=");
		sb.append(CT_USUARIO_CREA);
		sb.append(", CT_FECHA_CREA=");
		sb.append(CT_FECHA_CREA);
		sb.append(", CT_USUARIO_MODIFICA=");
		sb.append(CT_USUARIO_MODIFICA);
		sb.append(", CT_FECHA_MODIFICA=");
		sb.append(CT_FECHA_MODIFICA);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Contrato toEntityModel() {
		ContratoImpl contratoImpl = new ContratoImpl();

		contratoImpl.setCT_ID(CT_ID);

		if (CT_ESTADO == null) {
			contratoImpl.setCT_ESTADO(StringPool.BLANK);
		}
		else {
			contratoImpl.setCT_ESTADO(CT_ESTADO);
		}

		if (CT_ACTIVO == null) {
			contratoImpl.setCT_ACTIVO(StringPool.BLANK);
		}
		else {
			contratoImpl.setCT_ACTIVO(CT_ACTIVO);
		}

		contratoImpl.setCT_USUARIO_CREA(CT_USUARIO_CREA);

		if (CT_FECHA_CREA == Long.MIN_VALUE) {
			contratoImpl.setCT_FECHA_CREA(null);
		}
		else {
			contratoImpl.setCT_FECHA_CREA(new Date(CT_FECHA_CREA));
		}

		contratoImpl.setCT_USUARIO_MODIFICA(CT_USUARIO_MODIFICA);

		if (CT_FECHA_MODIFICA == Long.MIN_VALUE) {
			contratoImpl.setCT_FECHA_MODIFICA(null);
		}
		else {
			contratoImpl.setCT_FECHA_MODIFICA(new Date(CT_FECHA_MODIFICA));
		}

		contratoImpl.resetOriginalValues();

		return contratoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		CT_ID = objectInput.readLong();
		CT_ESTADO = objectInput.readUTF();
		CT_ACTIVO = objectInput.readUTF();
		CT_USUARIO_CREA = objectInput.readLong();
		CT_FECHA_CREA = objectInput.readLong();
		CT_USUARIO_MODIFICA = objectInput.readLong();
		CT_FECHA_MODIFICA = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(CT_ID);

		if (CT_ESTADO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CT_ESTADO);
		}

		if (CT_ACTIVO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CT_ACTIVO);
		}

		objectOutput.writeLong(CT_USUARIO_CREA);
		objectOutput.writeLong(CT_FECHA_CREA);
		objectOutput.writeLong(CT_USUARIO_MODIFICA);
		objectOutput.writeLong(CT_FECHA_MODIFICA);
	}

	public long CT_ID;
	public String CT_ESTADO;
	public String CT_ACTIVO;
	public long CT_USUARIO_CREA;
	public long CT_FECHA_CREA;
	public long CT_USUARIO_MODIFICA;
	public long CT_FECHA_MODIFICA;
}
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

import com.rec.hitss.layer.model.curriculumVitae;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing curriculumVitae in entity cache.
 *
 * @author Crossfire
 * @see curriculumVitae
 * @generated
 */
public class curriculumVitaeCacheModel implements CacheModel<curriculumVitae>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{CV_ID=");
		sb.append(CV_ID);
		sb.append(", CV_ESTADO=");
		sb.append(CV_ESTADO);
		sb.append(", CV_ACTIVO=");
		sb.append(CV_ACTIVO);
		sb.append(", CV_USUARIO_CREA=");
		sb.append(CV_USUARIO_CREA);
		sb.append(", CV_FECHA_CREA=");
		sb.append(CV_FECHA_CREA);
		sb.append(", CV_USUARIO_MODIFICA=");
		sb.append(CV_USUARIO_MODIFICA);
		sb.append(", CV_FECHA_MODIFICA=");
		sb.append(CV_FECHA_MODIFICA);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public curriculumVitae toEntityModel() {
		curriculumVitaeImpl curriculumVitaeImpl = new curriculumVitaeImpl();

		curriculumVitaeImpl.setCV_ID(CV_ID);

		if (CV_ESTADO == null) {
			curriculumVitaeImpl.setCV_ESTADO(StringPool.BLANK);
		}
		else {
			curriculumVitaeImpl.setCV_ESTADO(CV_ESTADO);
		}

		if (CV_ACTIVO == null) {
			curriculumVitaeImpl.setCV_ACTIVO(StringPool.BLANK);
		}
		else {
			curriculumVitaeImpl.setCV_ACTIVO(CV_ACTIVO);
		}

		curriculumVitaeImpl.setCV_USUARIO_CREA(CV_USUARIO_CREA);

		if (CV_FECHA_CREA == Long.MIN_VALUE) {
			curriculumVitaeImpl.setCV_FECHA_CREA(null);
		}
		else {
			curriculumVitaeImpl.setCV_FECHA_CREA(new Date(CV_FECHA_CREA));
		}

		curriculumVitaeImpl.setCV_USUARIO_MODIFICA(CV_USUARIO_MODIFICA);

		if (CV_FECHA_MODIFICA == Long.MIN_VALUE) {
			curriculumVitaeImpl.setCV_FECHA_MODIFICA(null);
		}
		else {
			curriculumVitaeImpl.setCV_FECHA_MODIFICA(new Date(CV_FECHA_MODIFICA));
		}

		curriculumVitaeImpl.resetOriginalValues();

		return curriculumVitaeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		CV_ID = objectInput.readLong();
		CV_ESTADO = objectInput.readUTF();
		CV_ACTIVO = objectInput.readUTF();
		CV_USUARIO_CREA = objectInput.readLong();
		CV_FECHA_CREA = objectInput.readLong();
		CV_USUARIO_MODIFICA = objectInput.readLong();
		CV_FECHA_MODIFICA = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(CV_ID);

		if (CV_ESTADO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CV_ESTADO);
		}

		if (CV_ACTIVO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CV_ACTIVO);
		}

		objectOutput.writeLong(CV_USUARIO_CREA);
		objectOutput.writeLong(CV_FECHA_CREA);
		objectOutput.writeLong(CV_USUARIO_MODIFICA);
		objectOutput.writeLong(CV_FECHA_MODIFICA);
	}

	public long CV_ID;
	public String CV_ESTADO;
	public String CV_ACTIVO;
	public long CV_USUARIO_CREA;
	public long CV_FECHA_CREA;
	public long CV_USUARIO_MODIFICA;
	public long CV_FECHA_MODIFICA;
}